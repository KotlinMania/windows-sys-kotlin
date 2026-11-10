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

public actual fun dceErrorInqTextA(rpcstatus: RpcStatus, errortext: Pstr): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dceErrorInqTextW(rpcstatus: RpcStatus, errortext: Pwstr): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iunknownAddRefProxy(thisRef: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iunknownQueryInterfaceProxy(thisRef: COpaquePointer?, riid: COpaquePointer?, ppvobject: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iunknownReleaseProxy(thisRef: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcAllocate(size: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcAsyncAbortCall(pasync: COpaquePointer?, exceptioncode: UInt): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcAsyncSetHandle(message: COpaquePointer?, pasync: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcBindingCopy(sourcebinding: COpaquePointer?, destinationbinding: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcBindingCreateNp(servername: Pcwstr, servicename: Pcwstr, networkoptions: Pcwstr, binding: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcBindingHandleToAsyncHandle(binding: COpaquePointer?, asynchandle: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcBindingInqClientTokenAttributes(binding: COpaquePointer?, tokenid: COpaquePointer?, authenticationid: COpaquePointer?, modifiedid: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcBindingInqDynamicEndpointA(binding: COpaquePointer?, dynamicendpoint: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcBindingInqDynamicEndpointW(binding: COpaquePointer?, dynamicendpoint: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcBindingInqLocalClientPid(binding: COpaquePointer?, pid: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcBindingInqMarshalledTargetInfo(binding: COpaquePointer?, marshalledtargetinfosize: COpaquePointer?, marshalledtargetinfo: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcBindingInqSecurityContext(binding: COpaquePointer?, securitycontexthandle: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcBindingInqSecurityContextKeyInfo(binding: COpaquePointer?, keyinfo: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcBindingInqTransportType(binding: COpaquePointer?, type: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcBindingInqWireIdForSnego(binding: COpaquePointer?, wireid: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcBindingIsClientLocal(bindinghandle: COpaquePointer?, clientlocalflag: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcBindingIsServerLocal(binding: COpaquePointer?, serverlocalflag: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcBindingSetPrivateOption(hbinding: COpaquePointer?, option: UInt, optionvalue: ULong): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcBindingToStaticStringBindingW(binding: COpaquePointer?, stringbinding: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcClearMutex(mutex: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcDeleteMutex(mutex: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcExceptionFilter(exceptioncode: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcFree(obj: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcFreeBuffer(message: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcFreePipeBuffer(message: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcGetBuffer(message: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcGetBufferWithObject(message: COpaquePointer?, objectuuid: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcGetCurrentCallHandle(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcGetDefaultSd(ppsecuritydescriptor: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcGetExtendedError(): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcIfInqTransferSyntaxes(rpcifhandle: COpaquePointer?, transfersyntaxes: COpaquePointer?, transfersyntaxsize: UInt, transfersyntaxcount: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcMapWin32Status(status: RpcStatus): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcMgmtEnableDedicatedThreadPool(): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcNegotiateTransferSyntax(message: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcNsBindingSetEntryNameA(binding: COpaquePointer?, entrynamesyntax: UInt, entryname: Pcstr): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcNsBindingSetEntryNameW(binding: COpaquePointer?, entrynamesyntax: UInt, entryname: Pcwstr): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcNsGetBuffer(message: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcNsInterfaceExported(entrynamesyntax: UInt, entryname: COpaquePointer?, rpcinterfaceinformation: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcNsInterfaceUnexported(entrynamesyntax: UInt, entryname: COpaquePointer?, rpcinterfaceinformation: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcNsRaiseException(message: COpaquePointer?, status: RpcStatus): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcNsSendReceive(message: COpaquePointer?, handle: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcOpenClientProcess(binding: COpaquePointer?, desiredaccess: UInt, clientprocess: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcPauseExecution(milliseconds: UInt): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcReBindBuffer(message: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcReallocPipeBuffer(message: COpaquePointer?, newsize: UInt): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcReceive(message: COpaquePointer?, size: UInt): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcRecordCalloutFailure(rpcstatus: RpcStatus, calloutstate: COpaquePointer?, dllname: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcRequestMutex(mutex: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcSend(message: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcSendReceive(message: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcServerCheckClientRestriction(context: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcServerDisableExceptionFilter(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcServerGetAssociationId(binding: COpaquePointer?, associationid: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcServerInqAddressChangeFn(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcServerInqLocalConnAddress(binding: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?, addressformat: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcServerInqRemoteConnAddress(binding: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?, addressformat: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcServerInqTransportType(type: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcServerRegisterForwardFunction(pforwardfunction: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcServerSetAddressChangeFn(paddresschangefn: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcServerStartService(protseq: Pcwstr, endpoint: Pcwstr, ifspec: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcServerSubscribeForDisconnectNotification(binding: COpaquePointer?, hevent: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcServerSubscribeForDisconnectNotification2(binding: COpaquePointer?, hevent: COpaquePointer?, subscriptionid: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcServerUnsubscribeForDisconnectNotification(binding: COpaquePointer?, subscriptionid: Guid): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcServerUseProtseq2A(networkaddress: Pcstr, protseq: Pcstr, maxcalls: UInt, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcServerUseProtseq2W(networkaddress: Pcwstr, protseq: Pcwstr, maxcalls: UInt, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcServerUseProtseqEp2A(networkaddress: Pcstr, protseq: Pcstr, maxcalls: UInt, endpoint: Pcstr, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcServerUseProtseqEp2W(networkaddress: Pcwstr, protseq: Pcwstr, maxcalls: UInt, endpoint: Pcwstr, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcSessionStrictContextHandle(): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcSsDontSerializeContext(): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcSystemHandleTypeSpecificWork(handle: COpaquePointer?, actualtype: UByte, idltype: UByte, marshaldirection: LrpcSystemHandleMarshalDirection): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iRpcTurnOnEeinfoPropagation(): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iUuidCreate(uuid: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mesBufferHandleReset(handle: COpaquePointer?, handlestyle: UInt, operation: MidlEsCode, pbuffer: COpaquePointer?, buffersize: UInt, pencodedsize: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mesDecodeBufferHandleCreate(buffer: Pcstr, buffersize: UInt, phandle: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mesDecodeIncrementalHandleCreate(userstate: COpaquePointer?, readfn: MidlEsRead, phandle: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mesEncodeDynBufferHandleCreate(pbuffer: COpaquePointer?, pencodedsize: COpaquePointer?, phandle: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mesEncodeFixedBufferHandleCreate(pbuffer: Pstr, buffersize: UInt, pencodedsize: COpaquePointer?, phandle: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mesEncodeIncrementalHandleCreate(userstate: COpaquePointer?, allocfn: MidlEsAlloc, writefn: MidlEsWrite, phandle: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mesHandleFree(handle: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mesIncrementalHandleReset(handle: COpaquePointer?, userstate: COpaquePointer?, allocfn: MidlEsAlloc, writefn: MidlEsWrite, readfn: MidlEsRead, operation: MidlEsCode): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mesInqProcEncodingId(handle: COpaquePointer?, pinterfaceid: COpaquePointer?, pprocnum: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nDRCContextBinding(ccontext: Long): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nDRCContextMarshall(ccontext: Long, pbuff: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nDRCContextUnmarshall(pccontext: COpaquePointer?, hbinding: COpaquePointer?, pbuff: COpaquePointer?, datarepresentation: UInt): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nDRSContextMarshall(ccontext: COpaquePointer?, pbuff: COpaquePointer?, userrundownin: NdrRundown): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nDRSContextMarshall2(bindinghandle: COpaquePointer?, ccontext: COpaquePointer?, pbuff: COpaquePointer?, userrundownin: NdrRundown, ctxguard: COpaquePointer?, flags: UInt): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nDRSContextMarshallEx(bindinghandle: COpaquePointer?, ccontext: COpaquePointer?, pbuff: COpaquePointer?, userrundownin: NdrRundown): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nDRSContextUnmarshall(pbuff: COpaquePointer?, datarepresentation: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nDRSContextUnmarshall2(bindinghandle: COpaquePointer?, pbuff: COpaquePointer?, datarepresentation: UInt, ctxguard: COpaquePointer?, flags: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nDRSContextUnmarshallEx(bindinghandle: COpaquePointer?, pbuff: COpaquePointer?, datarepresentation: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndr64AsyncClientCall(pproxyinfo: COpaquePointer?, nprocnum: UInt, preturnvalue: COpaquePointer?, vararg variadicArgs: Long): ClientCallReturn =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndr64AsyncServerCall64(prpcmsg: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndr64AsyncServerCallAll(prpcmsg: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndr64DcomAsyncClientCall(pproxyinfo: COpaquePointer?, nprocnum: UInt, preturnvalue: COpaquePointer?, vararg variadicArgs: Long): ClientCallReturn =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndr64DcomAsyncStubCall(pthis: COpaquePointer?, pchannel: COpaquePointer?, prpcmsg: COpaquePointer?, pdwstubphase: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrAllocate(pstubmsg: COpaquePointer?, len: ULong): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrAsyncClientCall(pstubdescriptor: COpaquePointer?, pformat: COpaquePointer?, vararg variadicArgs: Long): ClientCallReturn =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrAsyncServerCall(prpcmsg: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrByteCountPointerBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrByteCountPointerFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrByteCountPointerMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrByteCountPointerUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrClearOutParameters(pstubmsg: COpaquePointer?, pformat: COpaquePointer?, argaddr: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrClientCall2(pstubdescriptor: COpaquePointer?, pformat: COpaquePointer?, vararg variadicArgs: Long): ClientCallReturn =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrClientCall3(pproxyinfo: COpaquePointer?, nprocnum: UInt, preturnvalue: COpaquePointer?, vararg variadicArgs: Long): ClientCallReturn =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrClientContextMarshall(pstubmsg: COpaquePointer?, contexthandle: Long, fcheck: Int): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrClientContextUnmarshall(pstubmsg: COpaquePointer?, pcontexthandle: COpaquePointer?, bindhandle: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrClientInitialize(prpcmsg: COpaquePointer?, pstubmsg: COpaquePointer?, pstubdescriptor: COpaquePointer?, procnum: UInt): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrClientInitializeNew(prpcmsg: COpaquePointer?, pstubmsg: COpaquePointer?, pstubdescriptor: COpaquePointer?, procnum: UInt): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrComplexArrayBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrComplexArrayFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrComplexArrayMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrComplexArrayMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrComplexArrayUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrComplexStructBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrComplexStructFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrComplexStructMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrComplexStructMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrComplexStructUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrConformantArrayBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrConformantArrayFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrConformantArrayMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrConformantArrayMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrConformantArrayUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrConformantStringBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrConformantStringMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrConformantStringMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrConformantStringUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrConformantStructBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrConformantStructFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrConformantStructMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrConformantStructMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrConformantStructUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrConformantVaryingArrayBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrConformantVaryingArrayFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrConformantVaryingArrayMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrConformantVaryingArrayMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrConformantVaryingArrayUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrConformantVaryingStructBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrConformantVaryingStructFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrConformantVaryingStructMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrConformantVaryingStructMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrConformantVaryingStructUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrContextHandleInitialize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrContextHandleSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrConvert(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrConvert2(pstubmsg: COpaquePointer?, pformat: COpaquePointer?, numberparams: Int): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrCorrelationFree(pstubmsg: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrCorrelationInitialize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, cachesize: UInt, flags: UInt): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrCorrelationPass(pstubmsg: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrCreateServerInterfaceFromStub(pstub: COpaquePointer?, pserverif: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrDcomAsyncClientCall(pstubdescriptor: COpaquePointer?, pformat: COpaquePointer?, vararg variadicArgs: Long): ClientCallReturn =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrDcomAsyncStubCall(pthis: COpaquePointer?, pchannel: COpaquePointer?, prpcmsg: COpaquePointer?, pdwstubphase: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrEncapsulatedUnionBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrEncapsulatedUnionFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrEncapsulatedUnionMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrEncapsulatedUnionMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrEncapsulatedUnionUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrFixedArrayBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrFixedArrayFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrFixedArrayMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrFixedArrayMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrFixedArrayUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrFreeBuffer(pstubmsg: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrFullPointerXlatFree(pxlattables: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrFullPointerXlatInit(numberofpointers: UInt, xlatside: XlatSide): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrGetBuffer(pstubmsg: COpaquePointer?, bufferlength: UInt, handle: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrGetDcomProtocolVersion(pstubmsg: COpaquePointer?, pversion: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrGetUserMarshalInfo(pflags: COpaquePointer?, informationlevel: UInt, pmarshalinfo: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrInterfacePointerBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrInterfacePointerFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrInterfacePointerMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrInterfacePointerMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrInterfacePointerUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrMapCommAndFaultStatus(pstubmsg: COpaquePointer?, pcommstatus: COpaquePointer?, pfaultstatus: COpaquePointer?, status: RpcStatus): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrMesProcEncodeDecode(handle: COpaquePointer?, pstubdesc: COpaquePointer?, pformatstring: COpaquePointer?, vararg variadicArgs: Long): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrMesProcEncodeDecode2(handle: COpaquePointer?, pstubdesc: COpaquePointer?, pformatstring: COpaquePointer?, vararg variadicArgs: Long): ClientCallReturn =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrMesProcEncodeDecode3(handle: COpaquePointer?, pproxyinfo: COpaquePointer?, nprocnum: UInt, preturnvalue: COpaquePointer?, vararg variadicArgs: Long): ClientCallReturn =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrMesSimpleTypeAlignSize(param0: COpaquePointer?): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrMesSimpleTypeAlignSizeAll(handle: COpaquePointer?, pproxyinfo: COpaquePointer?): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrMesSimpleTypeDecode(handle: COpaquePointer?, pobject: COpaquePointer?, size: Short): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrMesSimpleTypeDecodeAll(handle: COpaquePointer?, pproxyinfo: COpaquePointer?, pobject: COpaquePointer?, size: Short): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrMesSimpleTypeEncode(handle: COpaquePointer?, pstubdesc: COpaquePointer?, pobject: COpaquePointer?, size: Short): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrMesSimpleTypeEncodeAll(handle: COpaquePointer?, pproxyinfo: COpaquePointer?, pobject: COpaquePointer?, size: Short): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrMesTypeAlignSize(handle: COpaquePointer?, pstubdesc: COpaquePointer?, pformatstring: COpaquePointer?, pobject: COpaquePointer?): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrMesTypeAlignSize2(handle: COpaquePointer?, ppicklinginfo: COpaquePointer?, pstubdesc: COpaquePointer?, pformatstring: COpaquePointer?, pobject: COpaquePointer?): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrMesTypeAlignSize3(handle: COpaquePointer?, ppicklinginfo: COpaquePointer?, pproxyinfo: COpaquePointer?, arrtypeoffset: COpaquePointer?, ntypeindex: UInt, pobject: COpaquePointer?): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrMesTypeDecode(handle: COpaquePointer?, pstubdesc: COpaquePointer?, pformatstring: COpaquePointer?, pobject: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrMesTypeDecode2(handle: COpaquePointer?, ppicklinginfo: COpaquePointer?, pstubdesc: COpaquePointer?, pformatstring: COpaquePointer?, pobject: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrMesTypeDecode3(handle: COpaquePointer?, ppicklinginfo: COpaquePointer?, pproxyinfo: COpaquePointer?, arrtypeoffset: COpaquePointer?, ntypeindex: UInt, pobject: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrMesTypeEncode(handle: COpaquePointer?, pstubdesc: COpaquePointer?, pformatstring: COpaquePointer?, pobject: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrMesTypeEncode2(handle: COpaquePointer?, ppicklinginfo: COpaquePointer?, pstubdesc: COpaquePointer?, pformatstring: COpaquePointer?, pobject: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrMesTypeEncode3(handle: COpaquePointer?, ppicklinginfo: COpaquePointer?, pproxyinfo: COpaquePointer?, arrtypeoffset: COpaquePointer?, ntypeindex: UInt, pobject: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrMesTypeFree2(handle: COpaquePointer?, ppicklinginfo: COpaquePointer?, pstubdesc: COpaquePointer?, pformatstring: COpaquePointer?, pobject: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrMesTypeFree3(handle: COpaquePointer?, ppicklinginfo: COpaquePointer?, pproxyinfo: COpaquePointer?, arrtypeoffset: COpaquePointer?, ntypeindex: UInt, pobject: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrNonConformantStringBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrNonConformantStringMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrNonConformantStringMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrNonConformantStringUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrNonEncapsulatedUnionBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrNonEncapsulatedUnionFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrNonEncapsulatedUnionMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrNonEncapsulatedUnionMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrNonEncapsulatedUnionUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrNsGetBuffer(pstubmsg: COpaquePointer?, bufferlength: UInt, handle: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrNsSendReceive(pstubmsg: COpaquePointer?, pbufferend: COpaquePointer?, pautohandle: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrOleAllocate(size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrOleFree(nodetofree: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrPartialIgnoreClientBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrPartialIgnoreClientMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrPartialIgnoreServerInitialize(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrPartialIgnoreServerUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrPointerBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrPointerFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrPointerMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrPointerMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrPointerUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrRangeUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrRpcSmClientAllocate(size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrRpcSmClientFree(nodetofree: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrRpcSmSetClientToOsf(pmessage: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrRpcSsDefaultAllocate(size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrRpcSsDefaultFree(nodetofree: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrRpcSsDisableAllocate(pmessage: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrRpcSsEnableAllocate(pmessage: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrSendReceive(pstubmsg: COpaquePointer?, pbufferend: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrServerCall2(prpcmsg: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrServerCallAll(prpcmsg: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrServerCallNdr64(prpcmsg: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrServerContextMarshall(pstubmsg: COpaquePointer?, contexthandle: COpaquePointer?, rundownroutine: NdrRundown): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrServerContextNewMarshall(pstubmsg: COpaquePointer?, contexthandle: COpaquePointer?, rundownroutine: NdrRundown, pformat: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrServerContextNewUnmarshall(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrServerContextUnmarshall(pstubmsg: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrServerInitialize(prpcmsg: COpaquePointer?, pstubmsg: COpaquePointer?, pstubdescriptor: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrServerInitializeMarshall(prpcmsg: COpaquePointer?, pstubmsg: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrServerInitializeNew(prpcmsg: COpaquePointer?, pstubmsg: COpaquePointer?, pstubdescriptor: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrServerInitializePartial(prpcmsg: COpaquePointer?, pstubmsg: COpaquePointer?, pstubdescriptor: COpaquePointer?, requestedbuffersize: UInt): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrServerInitializeUnmarshall(pstubmsg: COpaquePointer?, pstubdescriptor: COpaquePointer?, prpcmsg: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrSimpleStructBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrSimpleStructFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrSimpleStructMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrSimpleStructMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrSimpleStructUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrSimpleTypeMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, formatchar: UByte): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrSimpleTypeUnmarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, formatchar: UByte): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrStubCall2(pthis: COpaquePointer?, pchannel: COpaquePointer?, prpcmsg: COpaquePointer?, pdwstubphase: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrStubCall3(pthis: COpaquePointer?, pchannel: COpaquePointer?, prpcmsg: COpaquePointer?, pdwstubphase: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrUserMarshalBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrUserMarshalFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrUserMarshalMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrUserMarshalMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrUserMarshalSimpleTypeConvert(pflags: COpaquePointer?, pbuffer: COpaquePointer?, formatchar: UByte): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrUserMarshalUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrVaryingArrayBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrVaryingArrayFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrVaryingArrayMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrVaryingArrayMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrVaryingArrayUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrXmitOrRepAsBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrXmitOrRepAsFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrXmitOrRepAsMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrXmitOrRepAsMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndrXmitOrRepAsUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcAsyncAbortCall(pasync: COpaquePointer?, exceptioncode: UInt): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcAsyncCancelCall(pasync: COpaquePointer?, fabort: Bool): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcAsyncCompleteCall(pasync: COpaquePointer?, reply: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcAsyncGetCallStatus(pasync: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcAsyncInitializeHandle(pasync: COpaquePointer?, size: UInt): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcAsyncRegisterInfo(pasync: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcBindingBind(pasync: COpaquePointer?, binding: COpaquePointer?, ifspec: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcBindingCopy(sourcebinding: COpaquePointer?, destinationbinding: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcBindingCreateA(template: COpaquePointer?, security: COpaquePointer?, options: COpaquePointer?, binding: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcBindingCreateW(template: COpaquePointer?, security: COpaquePointer?, options: COpaquePointer?, binding: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcBindingFree(binding: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcBindingFromStringBindingA(stringbinding: Pcstr, binding: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcBindingFromStringBindingW(stringbinding: Pcwstr, binding: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcBindingInqAuthClientA(clientbinding: COpaquePointer?, privs: COpaquePointer?, serverprincname: COpaquePointer?, authnlevel: COpaquePointer?, authnsvc: COpaquePointer?, authzsvc: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcBindingInqAuthClientExA(clientbinding: COpaquePointer?, privs: COpaquePointer?, serverprincname: COpaquePointer?, authnlevel: COpaquePointer?, authnsvc: COpaquePointer?, authzsvc: COpaquePointer?, flags: UInt): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcBindingInqAuthClientExW(clientbinding: COpaquePointer?, privs: COpaquePointer?, serverprincname: COpaquePointer?, authnlevel: COpaquePointer?, authnsvc: COpaquePointer?, authzsvc: COpaquePointer?, flags: UInt): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcBindingInqAuthClientW(clientbinding: COpaquePointer?, privs: COpaquePointer?, serverprincname: COpaquePointer?, authnlevel: COpaquePointer?, authnsvc: COpaquePointer?, authzsvc: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcBindingInqAuthInfoA(binding: COpaquePointer?, serverprincname: COpaquePointer?, authnlevel: COpaquePointer?, authnsvc: COpaquePointer?, authidentity: COpaquePointer?, authzsvc: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcBindingInqAuthInfoExA(binding: COpaquePointer?, serverprincname: COpaquePointer?, authnlevel: COpaquePointer?, authnsvc: COpaquePointer?, authidentity: COpaquePointer?, authzsvc: COpaquePointer?, rpcqosversion: UInt, securityqos: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcBindingInqAuthInfoExW(binding: COpaquePointer?, serverprincname: COpaquePointer?, authnlevel: COpaquePointer?, authnsvc: COpaquePointer?, authidentity: COpaquePointer?, authzsvc: COpaquePointer?, rpcqosversion: UInt, securityqos: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcBindingInqAuthInfoW(binding: COpaquePointer?, serverprincname: COpaquePointer?, authnlevel: COpaquePointer?, authnsvc: COpaquePointer?, authidentity: COpaquePointer?, authzsvc: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcBindingInqMaxCalls(binding: COpaquePointer?, maxcalls: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcBindingInqObject(binding: COpaquePointer?, objectuuid: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcBindingInqOption(hbinding: COpaquePointer?, option: UInt, poptionvalue: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcBindingReset(binding: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcBindingServerFromClient(clientbinding: COpaquePointer?, serverbinding: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcBindingSetAuthInfoA(binding: COpaquePointer?, serverprincname: Pcstr, authnlevel: UInt, authnsvc: UInt, authidentity: COpaquePointer?, authzsvc: UInt): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcBindingSetAuthInfoExA(binding: COpaquePointer?, serverprincname: Pcstr, authnlevel: UInt, authnsvc: UInt, authidentity: COpaquePointer?, authzsvc: UInt, securityqos: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcBindingSetAuthInfoExW(binding: COpaquePointer?, serverprincname: Pcwstr, authnlevel: UInt, authnsvc: UInt, authidentity: COpaquePointer?, authzsvc: UInt, securityqos: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcBindingSetAuthInfoW(binding: COpaquePointer?, serverprincname: Pcwstr, authnlevel: UInt, authnsvc: UInt, authidentity: COpaquePointer?, authzsvc: UInt): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcBindingSetObject(binding: COpaquePointer?, objectuuid: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcBindingSetOption(hbinding: COpaquePointer?, option: UInt, optionvalue: ULong): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcBindingToStringBindingA(binding: COpaquePointer?, stringbinding: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcBindingToStringBindingW(binding: COpaquePointer?, stringbinding: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcBindingUnbind(binding: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcBindingVectorFree(bindingvector: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcCancelThread(thread: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcCancelThreadEx(thread: COpaquePointer?, timeout: Int): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcCertGeneratePrincipalNameA(context: COpaquePointer?, flags: UInt, pbuffer: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcCertGeneratePrincipalNameW(context: COpaquePointer?, flags: UInt, pbuffer: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcEpRegisterA(ifspec: COpaquePointer?, bindingvector: COpaquePointer?, uuidvector: COpaquePointer?, annotation: Pcstr): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcEpRegisterNoReplaceA(ifspec: COpaquePointer?, bindingvector: COpaquePointer?, uuidvector: COpaquePointer?, annotation: Pcstr): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcEpRegisterNoReplaceW(ifspec: COpaquePointer?, bindingvector: COpaquePointer?, uuidvector: COpaquePointer?, annotation: Pcwstr): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcEpRegisterW(ifspec: COpaquePointer?, bindingvector: COpaquePointer?, uuidvector: COpaquePointer?, annotation: Pcwstr): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcEpResolveBinding(binding: COpaquePointer?, ifspec: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcEpUnregister(ifspec: COpaquePointer?, bindingvector: COpaquePointer?, uuidvector: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcErrorAddRecord(errorinfo: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcErrorClearInformation(): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcErrorEndEnumeration(enumhandle: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcErrorGetNextRecord(enumhandle: COpaquePointer?, copystrings: Bool, errorinfo: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcErrorGetNumberOfRecords(enumhandle: COpaquePointer?, records: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcErrorLoadErrorInfo(errorblob: COpaquePointer?, blobsize: ULong, enumhandle: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcErrorResetEnumeration(enumhandle: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcErrorSaveErrorInfo(enumhandle: COpaquePointer?, errorblob: COpaquePointer?, blobsize: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcErrorStartEnumeration(enumhandle: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcExceptionFilter(exceptioncode: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcFreeAuthorizationContext(pauthzclientcontext: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcGetAuthorizationContextForClient(clientbinding: COpaquePointer?, impersonateonreturn: Bool, reserved1: COpaquePointer?, pexpirationtime: COpaquePointer?, reserved2: Luid, reserved3: UInt, reserved4: COpaquePointer?, pauthzclientcontext: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcIfIdVectorFree(ifidvector: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcIfInqId(rpcifhandle: COpaquePointer?, rpcifid: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcImpersonateClient(bindinghandle: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcImpersonateClient2(bindinghandle: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcImpersonateClientContainer(bindinghandle: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcMgmtEnableIdleCleanup(): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcMgmtEpEltInqBegin(epbinding: COpaquePointer?, inquirytype: UInt, ifid: COpaquePointer?, versoption: UInt, objectuuid: COpaquePointer?, inquirycontext: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcMgmtEpEltInqDone(inquirycontext: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcMgmtEpEltInqNextA(inquirycontext: COpaquePointer?, ifid: COpaquePointer?, binding: COpaquePointer?, objectuuid: COpaquePointer?, annotation: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcMgmtEpEltInqNextW(inquirycontext: COpaquePointer?, ifid: COpaquePointer?, binding: COpaquePointer?, objectuuid: COpaquePointer?, annotation: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcMgmtEpUnregister(epbinding: COpaquePointer?, ifid: COpaquePointer?, binding: COpaquePointer?, objectuuid: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcMgmtInqComTimeout(binding: COpaquePointer?, timeout: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcMgmtInqDefaultProtectLevel(authnsvc: UInt, authnlevel: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcMgmtInqIfIds(binding: COpaquePointer?, ifidvector: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcMgmtInqServerPrincNameA(binding: COpaquePointer?, authnsvc: UInt, serverprincname: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcMgmtInqServerPrincNameW(binding: COpaquePointer?, authnsvc: UInt, serverprincname: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcMgmtInqStats(binding: COpaquePointer?, statistics: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcMgmtIsServerListening(binding: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcMgmtSetAuthorizationFn(authorizationfn: RpcMgmtAuthorizationFn): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcMgmtSetCancelTimeout(timeout: Int): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcMgmtSetComTimeout(binding: COpaquePointer?, timeout: UInt): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcMgmtSetServerStackSize(threadstacksize: UInt): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcMgmtStatsVectorFree(statsvector: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcMgmtStopServerListening(binding: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcMgmtWaitServerListen(): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNetworkInqProtseqsA(protseqvector: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNetworkInqProtseqsW(protseqvector: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNetworkIsProtseqValidA(protseq: Pcstr): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNetworkIsProtseqValidW(protseq: Pcwstr): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsBindingExportA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: COpaquePointer?, bindingvec: COpaquePointer?, objectuuidvec: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsBindingExportPnPA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: COpaquePointer?, objectvector: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsBindingExportPnPW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: COpaquePointer?, objectvector: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsBindingExportW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: COpaquePointer?, bindingvec: COpaquePointer?, objectuuidvec: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsBindingImportBeginA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: COpaquePointer?, objuuid: COpaquePointer?, importcontext: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsBindingImportBeginW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: COpaquePointer?, objuuid: COpaquePointer?, importcontext: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsBindingImportDone(importcontext: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsBindingImportNext(importcontext: COpaquePointer?, binding: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsBindingInqEntryNameA(binding: COpaquePointer?, entrynamesyntax: UInt, entryname: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsBindingInqEntryNameW(binding: COpaquePointer?, entrynamesyntax: UInt, entryname: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsBindingLookupBeginA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: COpaquePointer?, objuuid: COpaquePointer?, bindingmaxcount: UInt, lookupcontext: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsBindingLookupBeginW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: COpaquePointer?, objuuid: COpaquePointer?, bindingmaxcount: UInt, lookupcontext: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsBindingLookupDone(lookupcontext: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsBindingLookupNext(lookupcontext: COpaquePointer?, bindingvec: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsBindingSelect(bindingvec: COpaquePointer?, binding: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsBindingUnexportA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: COpaquePointer?, objectuuidvec: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsBindingUnexportPnPA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: COpaquePointer?, objectvector: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsBindingUnexportPnPW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: COpaquePointer?, objectvector: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsBindingUnexportW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: COpaquePointer?, objectuuidvec: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsEntryExpandNameA(entrynamesyntax: UInt, entryname: Pcstr, expandedname: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsEntryExpandNameW(entrynamesyntax: UInt, entryname: Pcwstr, expandedname: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsEntryObjectInqBeginA(entrynamesyntax: UInt, entryname: Pcstr, inquirycontext: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsEntryObjectInqBeginW(entrynamesyntax: UInt, entryname: Pcwstr, inquirycontext: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsEntryObjectInqDone(inquirycontext: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsEntryObjectInqNext(inquirycontext: COpaquePointer?, objuuid: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsGroupDeleteA(groupnamesyntax: GroupNameSyntax, groupname: Pcstr): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsGroupDeleteW(groupnamesyntax: GroupNameSyntax, groupname: Pcwstr): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsGroupMbrAddA(groupnamesyntax: UInt, groupname: Pcstr, membernamesyntax: UInt, membername: Pcstr): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsGroupMbrAddW(groupnamesyntax: UInt, groupname: Pcwstr, membernamesyntax: UInt, membername: Pcwstr): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsGroupMbrInqBeginA(groupnamesyntax: UInt, groupname: Pcstr, membernamesyntax: UInt, inquirycontext: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsGroupMbrInqBeginW(groupnamesyntax: UInt, groupname: Pcwstr, membernamesyntax: UInt, inquirycontext: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsGroupMbrInqDone(inquirycontext: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsGroupMbrInqNextA(inquirycontext: COpaquePointer?, membername: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsGroupMbrInqNextW(inquirycontext: COpaquePointer?, membername: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsGroupMbrRemoveA(groupnamesyntax: UInt, groupname: Pcstr, membernamesyntax: UInt, membername: Pcstr): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsGroupMbrRemoveW(groupnamesyntax: UInt, groupname: Pcwstr, membernamesyntax: UInt, membername: Pcwstr): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsMgmtBindingUnexportA(entrynamesyntax: UInt, entryname: Pcstr, ifid: COpaquePointer?, versoption: UInt, objectuuidvec: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsMgmtBindingUnexportW(entrynamesyntax: UInt, entryname: Pcwstr, ifid: COpaquePointer?, versoption: UInt, objectuuidvec: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsMgmtEntryCreateA(entrynamesyntax: UInt, entryname: Pcstr): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsMgmtEntryCreateW(entrynamesyntax: UInt, entryname: Pcwstr): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsMgmtEntryDeleteA(entrynamesyntax: UInt, entryname: Pcstr): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsMgmtEntryDeleteW(entrynamesyntax: UInt, entryname: Pcwstr): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsMgmtEntryInqIfIdsA(entrynamesyntax: UInt, entryname: Pcstr, ifidvec: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsMgmtEntryInqIfIdsW(entrynamesyntax: UInt, entryname: Pcwstr, ifidvec: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsMgmtHandleSetExpAge(nshandle: COpaquePointer?, expirationage: UInt): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsMgmtInqExpAge(expirationage: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsMgmtSetExpAge(expirationage: UInt): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsProfileDeleteA(profilenamesyntax: UInt, profilename: Pcstr): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsProfileDeleteW(profilenamesyntax: UInt, profilename: Pcwstr): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsProfileEltAddA(profilenamesyntax: UInt, profilename: Pcstr, ifid: COpaquePointer?, membernamesyntax: UInt, membername: Pcstr, priority: UInt, annotation: Pcstr): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsProfileEltAddW(profilenamesyntax: UInt, profilename: Pcwstr, ifid: COpaquePointer?, membernamesyntax: UInt, membername: Pcwstr, priority: UInt, annotation: Pcwstr): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsProfileEltInqBeginA(profilenamesyntax: UInt, profilename: Pcstr, inquirytype: UInt, ifid: COpaquePointer?, versoption: UInt, membernamesyntax: UInt, membername: Pcstr, inquirycontext: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsProfileEltInqBeginW(profilenamesyntax: UInt, profilename: Pcwstr, inquirytype: UInt, ifid: COpaquePointer?, versoption: UInt, membernamesyntax: UInt, membername: Pcwstr, inquirycontext: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsProfileEltInqDone(inquirycontext: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsProfileEltInqNextA(inquirycontext: COpaquePointer?, ifid: COpaquePointer?, membername: COpaquePointer?, priority: COpaquePointer?, annotation: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsProfileEltInqNextW(inquirycontext: COpaquePointer?, ifid: COpaquePointer?, membername: COpaquePointer?, priority: COpaquePointer?, annotation: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsProfileEltRemoveA(profilenamesyntax: UInt, profilename: Pcstr, ifid: COpaquePointer?, membernamesyntax: UInt, membername: Pcstr): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcNsProfileEltRemoveW(profilenamesyntax: UInt, profilename: Pcwstr, ifid: COpaquePointer?, membernamesyntax: UInt, membername: Pcwstr): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcObjectInqType(objuuid: COpaquePointer?, typeuuid: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcObjectSetInqFn(inquiryfn: RpcObjectInqFn): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcObjectSetType(objuuid: COpaquePointer?, typeuuid: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcProtseqVectorFreeA(protseqvector: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcProtseqVectorFreeW(protseqvector: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcRaiseException(exception: RpcStatus): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcRevertContainerImpersonation(): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcRevertToSelf(): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcRevertToSelfEx(bindinghandle: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcServerCompleteSecurityCallback(bindinghandle: COpaquePointer?, status: RpcStatus): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcServerInqBindingHandle(binding: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcServerInqBindings(bindingvector: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcServerInqBindingsEx(securitydescriptor: COpaquePointer?, bindingvector: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcServerInqCallAttributesA(clientbinding: COpaquePointer?, rpccallattributes: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcServerInqCallAttributesW(clientbinding: COpaquePointer?, rpccallattributes: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcServerInqDefaultPrincNameA(authnsvc: UInt, princname: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcServerInqDefaultPrincNameW(authnsvc: UInt, princname: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcServerInqIf(ifspec: COpaquePointer?, mgrtypeuuid: COpaquePointer?, mgrepv: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcServerInterfaceGroupActivate(ifgroup: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcServerInterfaceGroupClose(ifgroup: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcServerInterfaceGroupCreateA(interfaces: COpaquePointer?, numifs: UInt, endpoints: COpaquePointer?, numendpoints: UInt, idleperiod: UInt, idlecallbackfn: RpcInterfaceGroupIdleCallbackFn, idlecallbackcontext: COpaquePointer?, ifgroup: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcServerInterfaceGroupCreateW(interfaces: COpaquePointer?, numifs: UInt, endpoints: COpaquePointer?, numendpoints: UInt, idleperiod: UInt, idlecallbackfn: RpcInterfaceGroupIdleCallbackFn, idlecallbackcontext: COpaquePointer?, ifgroup: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcServerInterfaceGroupDeactivate(ifgroup: COpaquePointer?, forcedeactivation: UInt): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcServerInterfaceGroupInqBindings(ifgroup: COpaquePointer?, bindingvector: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcServerListen(minimumcallthreads: UInt, maxcalls: UInt, dontwait: UInt): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcServerRegisterAuthInfoA(serverprincname: Pcstr, authnsvc: UInt, getkeyfn: RpcAuthKeyRetrievalFn, arg: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcServerRegisterAuthInfoW(serverprincname: Pcwstr, authnsvc: UInt, getkeyfn: RpcAuthKeyRetrievalFn, arg: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcServerRegisterIf(ifspec: COpaquePointer?, mgrtypeuuid: COpaquePointer?, mgrepv: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcServerRegisterIf2(ifspec: COpaquePointer?, mgrtypeuuid: COpaquePointer?, mgrepv: COpaquePointer?, flags: UInt, maxcalls: UInt, maxrpcsize: UInt, ifcallbackfn: RpcIfCallbackFn): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcServerRegisterIf3(ifspec: COpaquePointer?, mgrtypeuuid: COpaquePointer?, mgrepv: COpaquePointer?, flags: UInt, maxcalls: UInt, maxrpcsize: UInt, ifcallback: RpcIfCallbackFn, securitydescriptor: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcServerRegisterIfEx(ifspec: COpaquePointer?, mgrtypeuuid: COpaquePointer?, mgrepv: COpaquePointer?, flags: UInt, maxcalls: UInt, ifcallback: RpcIfCallbackFn): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcServerSubscribeForNotification(binding: COpaquePointer?, notification: RpcNotifications, notificationtype: RpcNotificationTypes, notificationinfo: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcServerTestCancel(bindinghandle: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcServerUnregisterIf(ifspec: COpaquePointer?, mgrtypeuuid: COpaquePointer?, waitforcallstocomplete: UInt): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcServerUnregisterIfEx(ifspec: COpaquePointer?, mgrtypeuuid: COpaquePointer?, rundowncontexthandles: Int): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcServerUnsubscribeForNotification(binding: COpaquePointer?, notification: RpcNotifications, notificationsqueued: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcServerUseAllProtseqs(maxcalls: UInt, securitydescriptor: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcServerUseAllProtseqsEx(maxcalls: UInt, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcServerUseAllProtseqsIf(maxcalls: UInt, ifspec: COpaquePointer?, securitydescriptor: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcServerUseAllProtseqsIfEx(maxcalls: UInt, ifspec: COpaquePointer?, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcServerUseProtseqA(protseq: Pcstr, maxcalls: UInt, securitydescriptor: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcServerUseProtseqEpA(protseq: Pcstr, maxcalls: UInt, endpoint: Pcstr, securitydescriptor: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcServerUseProtseqEpExA(protseq: Pcstr, maxcalls: UInt, endpoint: Pcstr, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcServerUseProtseqEpExW(protseq: Pcwstr, maxcalls: UInt, endpoint: Pcwstr, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcServerUseProtseqEpW(protseq: Pcwstr, maxcalls: UInt, endpoint: Pcwstr, securitydescriptor: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcServerUseProtseqExA(protseq: Pcstr, maxcalls: UInt, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcServerUseProtseqExW(protseq: Pcwstr, maxcalls: UInt, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcServerUseProtseqIfA(protseq: Pcstr, maxcalls: UInt, ifspec: COpaquePointer?, securitydescriptor: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcServerUseProtseqIfExA(protseq: Pcstr, maxcalls: UInt, ifspec: COpaquePointer?, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcServerUseProtseqIfExW(protseq: Pcwstr, maxcalls: UInt, ifspec: COpaquePointer?, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcServerUseProtseqIfW(protseq: Pcwstr, maxcalls: UInt, ifspec: COpaquePointer?, securitydescriptor: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcServerUseProtseqW(protseq: Pcwstr, maxcalls: UInt, securitydescriptor: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcServerYield(): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcSmAllocate(size: ULong, pstatus: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcSmClientFree(pnodetofree: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcSmDestroyClientContext(contexthandle: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcSmDisableAllocate(): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcSmEnableAllocate(): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcSmFree(nodetofree: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcSmGetThreadHandle(pstatus: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcSmSetClientAllocFree(clientalloc: RpcClientAlloc, clientfree: RpcClientFree): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcSmSetThreadHandle(id: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcSmSwapClientAllocFree(clientalloc: RpcClientAlloc, clientfree: RpcClientFree, oldclientalloc: COpaquePointer?, oldclientfree: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcSsAllocate(size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcSsContextLockExclusive(serverbindinghandle: COpaquePointer?, usercontext: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcSsContextLockShared(serverbindinghandle: COpaquePointer?, usercontext: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcSsDestroyClientContext(contexthandle: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcSsDisableAllocate(): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcSsDontSerializeContext(): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcSsEnableAllocate(): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcSsFree(nodetofree: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcSsGetContextBinding(contexthandle: COpaquePointer?, binding: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcSsGetThreadHandle(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcSsSetClientAllocFree(clientalloc: RpcClientAlloc, clientfree: RpcClientFree): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcSsSetThreadHandle(id: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcSsSwapClientAllocFree(clientalloc: RpcClientAlloc, clientfree: RpcClientFree, oldclientalloc: COpaquePointer?, oldclientfree: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcStringBindingComposeA(objuuid: Pcstr, protseq: Pcstr, networkaddr: Pcstr, endpoint: Pcstr, options: Pcstr, stringbinding: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcStringBindingComposeW(objuuid: Pcwstr, protseq: Pcwstr, networkaddr: Pcwstr, endpoint: Pcwstr, options: Pcwstr, stringbinding: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcStringBindingParseA(stringbinding: Pcstr, objuuid: COpaquePointer?, protseq: COpaquePointer?, networkaddr: COpaquePointer?, endpoint: COpaquePointer?, networkoptions: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcStringBindingParseW(stringbinding: Pcwstr, objuuid: COpaquePointer?, protseq: COpaquePointer?, networkaddr: COpaquePointer?, endpoint: COpaquePointer?, networkoptions: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcStringFreeA(string: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcStringFreeW(string: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcTestCancel(): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rpcUserFree(asynchandle: COpaquePointer?, pbuffer: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uuidCompare(uuid1: COpaquePointer?, uuid2: COpaquePointer?, status: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uuidCreate(uuid: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uuidCreateNil(niluuid: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uuidCreateSequential(uuid: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uuidEqual(uuid1: COpaquePointer?, uuid2: COpaquePointer?, status: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uuidFromStringA(stringuuid: Pcstr, uuid: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uuidFromStringW(stringuuid: Pcwstr, uuid: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uuidHash(uuid: COpaquePointer?, status: COpaquePointer?): UShort =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uuidIsNil(uuid: COpaquePointer?, status: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uuidToStringA(uuid: COpaquePointer?, stringuuid: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uuidToStringW(uuid: COpaquePointer?, stringuuid: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
