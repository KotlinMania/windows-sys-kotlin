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

private object WindowsWin32SystemRpcJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_dceErrorInqTextA(rpcstatus: Int, errortext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_dceErrorInqTextW(rpcstatus: Int, errortext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iunknownAddRefProxy(thisRef: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iunknownQueryInterfaceProxy(thisRef: Long, riid: Long, ppvobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iunknownReleaseProxy(thisRef: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcAllocate(size: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcAsyncAbortCall(pasync: Long, exceptioncode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcAsyncSetHandle(message: Long, pasync: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcBindingCopy(sourcebinding: Long, destinationbinding: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcBindingCreateNp(servername: Long, servicename: Long, networkoptions: Long, binding: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcBindingHandleToAsyncHandle(binding: Long, asynchandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcBindingInqClientTokenAttributes(binding: Long, tokenid: Long, authenticationid: Long, modifiedid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcBindingInqDynamicEndpointA(binding: Long, dynamicendpoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcBindingInqDynamicEndpointW(binding: Long, dynamicendpoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcBindingInqLocalClientPid(binding: Long, pid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcBindingInqMarshalledTargetInfo(binding: Long, marshalledtargetinfosize: Long, marshalledtargetinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcBindingInqSecurityContext(binding: Long, securitycontexthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcBindingInqSecurityContextKeyInfo(binding: Long, keyinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcBindingInqTransportType(binding: Long, type: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcBindingInqWireIdForSnego(binding: Long, wireid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcBindingIsClientLocal(bindinghandle: Long, clientlocalflag: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcBindingIsServerLocal(binding: Long, serverlocalflag: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcBindingSetPrivateOption(hbinding: Long, option: Int, optionvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcBindingToStaticStringBindingW(binding: Long, stringbinding: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcClearMutex(mutex: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcDeleteMutex(mutex: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcExceptionFilter(exceptioncode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcFree(obj: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcFreeBuffer(message: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcFreePipeBuffer(message: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcGetBuffer(message: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcGetBufferWithObject(message: Long, objectuuid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcGetCurrentCallHandle(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcGetDefaultSd(ppsecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcGetExtendedError(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcIfInqTransferSyntaxes(rpcifhandle: Long, transfersyntaxes: Long, transfersyntaxsize: Int, transfersyntaxcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcMapWin32Status(status: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcMgmtEnableDedicatedThreadPool(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcNegotiateTransferSyntax(message: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcNsBindingSetEntryNameA(binding: Long, entrynamesyntax: Int, entryname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcNsBindingSetEntryNameW(binding: Long, entrynamesyntax: Int, entryname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcNsGetBuffer(message: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcNsInterfaceExported(entrynamesyntax: Int, entryname: Long, rpcinterfaceinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcNsInterfaceUnexported(entrynamesyntax: Int, entryname: Long, rpcinterfaceinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcNsRaiseException(message: Long, status: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcNsSendReceive(message: Long, handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcOpenClientProcess(binding: Long, desiredaccess: Int, clientprocess: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcPauseExecution(milliseconds: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcReBindBuffer(message: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcReallocPipeBuffer(message: Long, newsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcReceive(message: Long, size: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcRecordCalloutFailure(rpcstatus: Int, calloutstate: Long, dllname: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcRequestMutex(mutex: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcSend(message: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcSendReceive(message: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcServerCheckClientRestriction(context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcServerDisableExceptionFilter(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcServerGetAssociationId(binding: Long, associationid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcServerInqAddressChangeFn(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcServerInqLocalConnAddress(binding: Long, buffer: Long, buffersize: Long, addressformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcServerInqRemoteConnAddress(binding: Long, buffer: Long, buffersize: Long, addressformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcServerInqTransportType(type: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcServerRegisterForwardFunction(pforwardfunction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcServerSetAddressChangeFn(paddresschangefn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcServerStartService(protseq: Long, endpoint: Long, ifspec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcServerSubscribeForDisconnectNotification(binding: Long, hevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcServerSubscribeForDisconnectNotification2(binding: Long, hevent: Long, subscriptionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcServerUseProtseq2A(networkaddress: Long, protseq: Long, maxcalls: Int, securitydescriptor: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcServerUseProtseq2W(networkaddress: Long, protseq: Long, maxcalls: Int, securitydescriptor: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcServerUseProtseqEp2A(networkaddress: Long, protseq: Long, maxcalls: Int, endpoint: Long, securitydescriptor: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcServerUseProtseqEp2W(networkaddress: Long, protseq: Long, maxcalls: Int, endpoint: Long, securitydescriptor: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcSessionStrictContextHandle()

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcSsDontSerializeContext()

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcSystemHandleTypeSpecificWork(handle: Long, actualtype: Byte, idltype: Byte, marshaldirection: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iRpcTurnOnEeinfoPropagation(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_iUuidCreate(uuid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_mesBufferHandleReset(handle: Long, handlestyle: Int, operation: Int, pbuffer: Long, buffersize: Int, pencodedsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_mesDecodeBufferHandleCreate(buffer: Long, buffersize: Int, phandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_mesDecodeIncrementalHandleCreate(userstate: Long, readfn: Long, phandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_mesEncodeDynBufferHandleCreate(pbuffer: Long, pencodedsize: Long, phandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_mesEncodeFixedBufferHandleCreate(pbuffer: Long, buffersize: Int, pencodedsize: Long, phandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_mesEncodeIncrementalHandleCreate(userstate: Long, allocfn: Long, writefn: Long, phandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_mesHandleFree(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_mesIncrementalHandleReset(handle: Long, userstate: Long, allocfn: Long, writefn: Long, readfn: Long, operation: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_mesInqProcEncodingId(handle: Long, pinterfaceid: Long, pprocnum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_nDRCContextBinding(ccontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_nDRCContextMarshall(ccontext: Long, pbuff: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_nDRCContextUnmarshall(pccontext: Long, hbinding: Long, pbuff: Long, datarepresentation: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_nDRSContextMarshall(ccontext: Long, pbuff: Long, userrundownin: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_nDRSContextMarshall2(bindinghandle: Long, ccontext: Long, pbuff: Long, userrundownin: Long, ctxguard: Long, flags: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_nDRSContextMarshallEx(bindinghandle: Long, ccontext: Long, pbuff: Long, userrundownin: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_nDRSContextUnmarshall(pbuff: Long, datarepresentation: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_nDRSContextUnmarshall2(bindinghandle: Long, pbuff: Long, datarepresentation: Int, ctxguard: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_nDRSContextUnmarshallEx(bindinghandle: Long, pbuff: Long, datarepresentation: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndr64AsyncServerCall64(prpcmsg: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndr64AsyncServerCallAll(prpcmsg: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndr64DcomAsyncStubCall(pthis: Long, pchannel: Long, prpcmsg: Long, pdwstubphase: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrAllocate(pstubmsg: Long, len: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrAsyncServerCall(prpcmsg: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrByteCountPointerBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrByteCountPointerFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrByteCountPointerMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrByteCountPointerUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrClearOutParameters(pstubmsg: Long, pformat: Long, argaddr: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrClientContextMarshall(pstubmsg: Long, contexthandle: Long, fcheck: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrClientContextUnmarshall(pstubmsg: Long, pcontexthandle: Long, bindhandle: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrClientInitialize(prpcmsg: Long, pstubmsg: Long, pstubdescriptor: Long, procnum: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrClientInitializeNew(prpcmsg: Long, pstubmsg: Long, pstubdescriptor: Long, procnum: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrComplexArrayBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrComplexArrayFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrComplexArrayMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrComplexArrayMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrComplexArrayUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrComplexStructBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrComplexStructFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrComplexStructMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrComplexStructMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrComplexStructUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrConformantArrayBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrConformantArrayFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrConformantArrayMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrConformantArrayMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrConformantArrayUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrConformantStringBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrConformantStringMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrConformantStringMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrConformantStringUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrConformantStructBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrConformantStructFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrConformantStructMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrConformantStructMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrConformantStructUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrConformantVaryingArrayBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrConformantVaryingArrayFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrConformantVaryingArrayMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrConformantVaryingArrayMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrConformantVaryingArrayUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrConformantVaryingStructBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrConformantVaryingStructFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrConformantVaryingStructMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrConformantVaryingStructMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrConformantVaryingStructUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrContextHandleInitialize(pstubmsg: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrContextHandleSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrConvert(pstubmsg: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrConvert2(pstubmsg: Long, pformat: Long, numberparams: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrCorrelationFree(pstubmsg: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrCorrelationInitialize(pstubmsg: Long, pmemory: Long, cachesize: Int, flags: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrCorrelationPass(pstubmsg: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrCreateServerInterfaceFromStub(pstub: Long, pserverif: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrDcomAsyncStubCall(pthis: Long, pchannel: Long, prpcmsg: Long, pdwstubphase: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrEncapsulatedUnionBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrEncapsulatedUnionFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrEncapsulatedUnionMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrEncapsulatedUnionMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrEncapsulatedUnionUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrFixedArrayBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrFixedArrayFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrFixedArrayMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrFixedArrayMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrFixedArrayUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrFreeBuffer(pstubmsg: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrFullPointerXlatFree(pxlattables: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrFullPointerXlatInit(numberofpointers: Int, xlatside: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrGetBuffer(pstubmsg: Long, bufferlength: Int, handle: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrGetDcomProtocolVersion(pstubmsg: Long, pversion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrGetUserMarshalInfo(pflags: Long, informationlevel: Int, pmarshalinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrInterfacePointerBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrInterfacePointerFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrInterfacePointerMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrInterfacePointerMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrInterfacePointerUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrMapCommAndFaultStatus(pstubmsg: Long, pcommstatus: Long, pfaultstatus: Long, status: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrMesProcEncodeDecode(handle: Long, pstubdesc: Long, pformatstring: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrMesSimpleTypeAlignSize(param0: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrMesSimpleTypeAlignSizeAll(handle: Long, pproxyinfo: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrMesSimpleTypeDecode(handle: Long, pobject: Long, size: Short)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrMesSimpleTypeDecodeAll(handle: Long, pproxyinfo: Long, pobject: Long, size: Short)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrMesSimpleTypeEncode(handle: Long, pstubdesc: Long, pobject: Long, size: Short)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrMesSimpleTypeEncodeAll(handle: Long, pproxyinfo: Long, pobject: Long, size: Short)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrMesTypeAlignSize(handle: Long, pstubdesc: Long, pformatstring: Long, pobject: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrMesTypeAlignSize2(handle: Long, ppicklinginfo: Long, pstubdesc: Long, pformatstring: Long, pobject: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrMesTypeAlignSize3(handle: Long, ppicklinginfo: Long, pproxyinfo: Long, arrtypeoffset: Long, ntypeindex: Int, pobject: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrMesTypeDecode(handle: Long, pstubdesc: Long, pformatstring: Long, pobject: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrMesTypeDecode2(handle: Long, ppicklinginfo: Long, pstubdesc: Long, pformatstring: Long, pobject: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrMesTypeDecode3(handle: Long, ppicklinginfo: Long, pproxyinfo: Long, arrtypeoffset: Long, ntypeindex: Int, pobject: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrMesTypeEncode(handle: Long, pstubdesc: Long, pformatstring: Long, pobject: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrMesTypeEncode2(handle: Long, ppicklinginfo: Long, pstubdesc: Long, pformatstring: Long, pobject: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrMesTypeEncode3(handle: Long, ppicklinginfo: Long, pproxyinfo: Long, arrtypeoffset: Long, ntypeindex: Int, pobject: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrMesTypeFree2(handle: Long, ppicklinginfo: Long, pstubdesc: Long, pformatstring: Long, pobject: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrMesTypeFree3(handle: Long, ppicklinginfo: Long, pproxyinfo: Long, arrtypeoffset: Long, ntypeindex: Int, pobject: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrNonConformantStringBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrNonConformantStringMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrNonConformantStringMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrNonConformantStringUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrNonEncapsulatedUnionBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrNonEncapsulatedUnionFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrNonEncapsulatedUnionMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrNonEncapsulatedUnionMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrNonEncapsulatedUnionUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrNsGetBuffer(pstubmsg: Long, bufferlength: Int, handle: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrNsSendReceive(pstubmsg: Long, pbufferend: Long, pautohandle: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrOleAllocate(size: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrOleFree(nodetofree: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrPartialIgnoreClientBufferSize(pstubmsg: Long, pmemory: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrPartialIgnoreClientMarshall(pstubmsg: Long, pmemory: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrPartialIgnoreServerInitialize(pstubmsg: Long, ppmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrPartialIgnoreServerUnmarshall(pstubmsg: Long, ppmemory: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrPointerBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrPointerFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrPointerMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrPointerMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrPointerUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrRangeUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrRpcSmClientAllocate(size: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrRpcSmClientFree(nodetofree: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrRpcSmSetClientToOsf(pmessage: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrRpcSsDefaultAllocate(size: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrRpcSsDefaultFree(nodetofree: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrRpcSsDisableAllocate(pmessage: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrRpcSsEnableAllocate(pmessage: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrSendReceive(pstubmsg: Long, pbufferend: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrServerCall2(prpcmsg: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrServerCallAll(prpcmsg: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrServerCallNdr64(prpcmsg: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrServerContextMarshall(pstubmsg: Long, contexthandle: Long, rundownroutine: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrServerContextNewMarshall(pstubmsg: Long, contexthandle: Long, rundownroutine: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrServerContextNewUnmarshall(pstubmsg: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrServerContextUnmarshall(pstubmsg: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrServerInitialize(prpcmsg: Long, pstubmsg: Long, pstubdescriptor: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrServerInitializeMarshall(prpcmsg: Long, pstubmsg: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrServerInitializeNew(prpcmsg: Long, pstubmsg: Long, pstubdescriptor: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrServerInitializePartial(prpcmsg: Long, pstubmsg: Long, pstubdescriptor: Long, requestedbuffersize: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrServerInitializeUnmarshall(pstubmsg: Long, pstubdescriptor: Long, prpcmsg: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrSimpleStructBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrSimpleStructFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrSimpleStructMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrSimpleStructMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrSimpleStructUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrSimpleTypeMarshall(pstubmsg: Long, pmemory: Long, formatchar: Byte)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrSimpleTypeUnmarshall(pstubmsg: Long, pmemory: Long, formatchar: Byte)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrStubCall2(pthis: Long, pchannel: Long, prpcmsg: Long, pdwstubphase: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrStubCall3(pthis: Long, pchannel: Long, prpcmsg: Long, pdwstubphase: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrUserMarshalBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrUserMarshalFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrUserMarshalMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrUserMarshalMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrUserMarshalSimpleTypeConvert(pflags: Long, pbuffer: Long, formatchar: Byte): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrUserMarshalUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrVaryingArrayBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrVaryingArrayFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrVaryingArrayMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrVaryingArrayMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrVaryingArrayUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrXmitOrRepAsBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrXmitOrRepAsFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrXmitOrRepAsMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrXmitOrRepAsMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_ndrXmitOrRepAsUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcAsyncAbortCall(pasync: Long, exceptioncode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcAsyncCancelCall(pasync: Long, fabort: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcAsyncCompleteCall(pasync: Long, reply: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcAsyncGetCallStatus(pasync: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcAsyncInitializeHandle(pasync: Long, size: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcAsyncRegisterInfo(pasync: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcBindingBind(pasync: Long, binding: Long, ifspec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcBindingCopy(sourcebinding: Long, destinationbinding: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcBindingCreateA(template: Long, security: Long, options: Long, binding: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcBindingCreateW(template: Long, security: Long, options: Long, binding: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcBindingFree(binding: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcBindingFromStringBindingA(stringbinding: Long, binding: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcBindingFromStringBindingW(stringbinding: Long, binding: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcBindingInqAuthClientA(clientbinding: Long, privs: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authzsvc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcBindingInqAuthClientExA(clientbinding: Long, privs: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authzsvc: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcBindingInqAuthClientExW(clientbinding: Long, privs: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authzsvc: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcBindingInqAuthClientW(clientbinding: Long, privs: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authzsvc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcBindingInqAuthInfoA(binding: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authidentity: Long, authzsvc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcBindingInqAuthInfoExA(binding: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authidentity: Long, authzsvc: Long, rpcqosversion: Int, securityqos: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcBindingInqAuthInfoExW(binding: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authidentity: Long, authzsvc: Long, rpcqosversion: Int, securityqos: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcBindingInqAuthInfoW(binding: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authidentity: Long, authzsvc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcBindingInqMaxCalls(binding: Long, maxcalls: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcBindingInqObject(binding: Long, objectuuid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcBindingInqOption(hbinding: Long, option: Int, poptionvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcBindingReset(binding: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcBindingServerFromClient(clientbinding: Long, serverbinding: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcBindingSetAuthInfoA(binding: Long, serverprincname: Long, authnlevel: Int, authnsvc: Int, authidentity: Long, authzsvc: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcBindingSetAuthInfoExA(binding: Long, serverprincname: Long, authnlevel: Int, authnsvc: Int, authidentity: Long, authzsvc: Int, securityqos: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcBindingSetAuthInfoExW(binding: Long, serverprincname: Long, authnlevel: Int, authnsvc: Int, authidentity: Long, authzsvc: Int, securityqos: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcBindingSetAuthInfoW(binding: Long, serverprincname: Long, authnlevel: Int, authnsvc: Int, authidentity: Long, authzsvc: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcBindingSetObject(binding: Long, objectuuid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcBindingSetOption(hbinding: Long, option: Int, optionvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcBindingToStringBindingA(binding: Long, stringbinding: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcBindingToStringBindingW(binding: Long, stringbinding: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcBindingUnbind(binding: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcBindingVectorFree(bindingvector: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcCancelThread(thread: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcCancelThreadEx(thread: Long, timeout: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcCertGeneratePrincipalNameA(context: Long, flags: Int, pbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcCertGeneratePrincipalNameW(context: Long, flags: Int, pbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcEpRegisterA(ifspec: Long, bindingvector: Long, uuidvector: Long, annotation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcEpRegisterNoReplaceA(ifspec: Long, bindingvector: Long, uuidvector: Long, annotation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcEpRegisterNoReplaceW(ifspec: Long, bindingvector: Long, uuidvector: Long, annotation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcEpRegisterW(ifspec: Long, bindingvector: Long, uuidvector: Long, annotation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcEpResolveBinding(binding: Long, ifspec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcEpUnregister(ifspec: Long, bindingvector: Long, uuidvector: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcErrorAddRecord(errorinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcErrorClearInformation()

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcErrorEndEnumeration(enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcErrorGetNextRecord(enumhandle: Long, copystrings: Int, errorinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcErrorGetNumberOfRecords(enumhandle: Long, records: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcErrorLoadErrorInfo(errorblob: Long, blobsize: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcErrorResetEnumeration(enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcErrorSaveErrorInfo(enumhandle: Long, errorblob: Long, blobsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcErrorStartEnumeration(enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcExceptionFilter(exceptioncode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcFreeAuthorizationContext(pauthzclientcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcIfIdVectorFree(ifidvector: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcIfInqId(rpcifhandle: Long, rpcifid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcImpersonateClient(bindinghandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcImpersonateClient2(bindinghandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcImpersonateClientContainer(bindinghandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcMgmtEnableIdleCleanup(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcMgmtEpEltInqBegin(epbinding: Long, inquirytype: Int, ifid: Long, versoption: Int, objectuuid: Long, inquirycontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcMgmtEpEltInqDone(inquirycontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcMgmtEpEltInqNextA(inquirycontext: Long, ifid: Long, binding: Long, objectuuid: Long, annotation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcMgmtEpEltInqNextW(inquirycontext: Long, ifid: Long, binding: Long, objectuuid: Long, annotation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcMgmtEpUnregister(epbinding: Long, ifid: Long, binding: Long, objectuuid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcMgmtInqComTimeout(binding: Long, timeout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcMgmtInqDefaultProtectLevel(authnsvc: Int, authnlevel: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcMgmtInqIfIds(binding: Long, ifidvector: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcMgmtInqServerPrincNameA(binding: Long, authnsvc: Int, serverprincname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcMgmtInqServerPrincNameW(binding: Long, authnsvc: Int, serverprincname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcMgmtInqStats(binding: Long, statistics: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcMgmtIsServerListening(binding: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcMgmtSetAuthorizationFn(authorizationfn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcMgmtSetCancelTimeout(timeout: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcMgmtSetComTimeout(binding: Long, timeout: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcMgmtSetServerStackSize(threadstacksize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcMgmtStatsVectorFree(statsvector: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcMgmtStopServerListening(binding: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcMgmtWaitServerListen(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNetworkInqProtseqsA(protseqvector: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNetworkInqProtseqsW(protseqvector: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNetworkIsProtseqValidA(protseq: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNetworkIsProtseqValidW(protseq: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsBindingExportA(entrynamesyntax: Int, entryname: Long, ifspec: Long, bindingvec: Long, objectuuidvec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsBindingExportPnPA(entrynamesyntax: Int, entryname: Long, ifspec: Long, objectvector: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsBindingExportPnPW(entrynamesyntax: Int, entryname: Long, ifspec: Long, objectvector: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsBindingExportW(entrynamesyntax: Int, entryname: Long, ifspec: Long, bindingvec: Long, objectuuidvec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsBindingImportBeginA(entrynamesyntax: Int, entryname: Long, ifspec: Long, objuuid: Long, importcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsBindingImportBeginW(entrynamesyntax: Int, entryname: Long, ifspec: Long, objuuid: Long, importcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsBindingImportDone(importcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsBindingImportNext(importcontext: Long, binding: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsBindingInqEntryNameA(binding: Long, entrynamesyntax: Int, entryname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsBindingInqEntryNameW(binding: Long, entrynamesyntax: Int, entryname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsBindingLookupBeginA(entrynamesyntax: Int, entryname: Long, ifspec: Long, objuuid: Long, bindingmaxcount: Int, lookupcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsBindingLookupBeginW(entrynamesyntax: Int, entryname: Long, ifspec: Long, objuuid: Long, bindingmaxcount: Int, lookupcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsBindingLookupDone(lookupcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsBindingLookupNext(lookupcontext: Long, bindingvec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsBindingSelect(bindingvec: Long, binding: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsBindingUnexportA(entrynamesyntax: Int, entryname: Long, ifspec: Long, objectuuidvec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsBindingUnexportPnPA(entrynamesyntax: Int, entryname: Long, ifspec: Long, objectvector: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsBindingUnexportPnPW(entrynamesyntax: Int, entryname: Long, ifspec: Long, objectvector: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsBindingUnexportW(entrynamesyntax: Int, entryname: Long, ifspec: Long, objectuuidvec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsEntryExpandNameA(entrynamesyntax: Int, entryname: Long, expandedname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsEntryExpandNameW(entrynamesyntax: Int, entryname: Long, expandedname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsEntryObjectInqBeginA(entrynamesyntax: Int, entryname: Long, inquirycontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsEntryObjectInqBeginW(entrynamesyntax: Int, entryname: Long, inquirycontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsEntryObjectInqDone(inquirycontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsEntryObjectInqNext(inquirycontext: Long, objuuid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsGroupDeleteA(groupnamesyntax: Int, groupname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsGroupDeleteW(groupnamesyntax: Int, groupname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsGroupMbrAddA(groupnamesyntax: Int, groupname: Long, membernamesyntax: Int, membername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsGroupMbrAddW(groupnamesyntax: Int, groupname: Long, membernamesyntax: Int, membername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsGroupMbrInqBeginA(groupnamesyntax: Int, groupname: Long, membernamesyntax: Int, inquirycontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsGroupMbrInqBeginW(groupnamesyntax: Int, groupname: Long, membernamesyntax: Int, inquirycontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsGroupMbrInqDone(inquirycontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsGroupMbrInqNextA(inquirycontext: Long, membername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsGroupMbrInqNextW(inquirycontext: Long, membername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsGroupMbrRemoveA(groupnamesyntax: Int, groupname: Long, membernamesyntax: Int, membername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsGroupMbrRemoveW(groupnamesyntax: Int, groupname: Long, membernamesyntax: Int, membername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsMgmtBindingUnexportA(entrynamesyntax: Int, entryname: Long, ifid: Long, versoption: Int, objectuuidvec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsMgmtBindingUnexportW(entrynamesyntax: Int, entryname: Long, ifid: Long, versoption: Int, objectuuidvec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsMgmtEntryCreateA(entrynamesyntax: Int, entryname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsMgmtEntryCreateW(entrynamesyntax: Int, entryname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsMgmtEntryDeleteA(entrynamesyntax: Int, entryname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsMgmtEntryDeleteW(entrynamesyntax: Int, entryname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsMgmtEntryInqIfIdsA(entrynamesyntax: Int, entryname: Long, ifidvec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsMgmtEntryInqIfIdsW(entrynamesyntax: Int, entryname: Long, ifidvec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsMgmtHandleSetExpAge(nshandle: Long, expirationage: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsMgmtInqExpAge(expirationage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsMgmtSetExpAge(expirationage: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsProfileDeleteA(profilenamesyntax: Int, profilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsProfileDeleteW(profilenamesyntax: Int, profilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsProfileEltAddA(profilenamesyntax: Int, profilename: Long, ifid: Long, membernamesyntax: Int, membername: Long, priority: Int, annotation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsProfileEltAddW(profilenamesyntax: Int, profilename: Long, ifid: Long, membernamesyntax: Int, membername: Long, priority: Int, annotation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsProfileEltInqBeginA(profilenamesyntax: Int, profilename: Long, inquirytype: Int, ifid: Long, versoption: Int, membernamesyntax: Int, membername: Long, inquirycontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsProfileEltInqBeginW(profilenamesyntax: Int, profilename: Long, inquirytype: Int, ifid: Long, versoption: Int, membernamesyntax: Int, membername: Long, inquirycontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsProfileEltInqDone(inquirycontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsProfileEltInqNextA(inquirycontext: Long, ifid: Long, membername: Long, priority: Long, annotation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsProfileEltInqNextW(inquirycontext: Long, ifid: Long, membername: Long, priority: Long, annotation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsProfileEltRemoveA(profilenamesyntax: Int, profilename: Long, ifid: Long, membernamesyntax: Int, membername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcNsProfileEltRemoveW(profilenamesyntax: Int, profilename: Long, ifid: Long, membernamesyntax: Int, membername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcObjectInqType(objuuid: Long, typeuuid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcObjectSetInqFn(inquiryfn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcObjectSetType(objuuid: Long, typeuuid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcProtseqVectorFreeA(protseqvector: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcProtseqVectorFreeW(protseqvector: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcRaiseException(exception: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcRevertContainerImpersonation(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcRevertToSelf(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcRevertToSelfEx(bindinghandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcServerCompleteSecurityCallback(bindinghandle: Long, status: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcServerInqBindingHandle(binding: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcServerInqBindings(bindingvector: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcServerInqBindingsEx(securitydescriptor: Long, bindingvector: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcServerInqCallAttributesA(clientbinding: Long, rpccallattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcServerInqCallAttributesW(clientbinding: Long, rpccallattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcServerInqDefaultPrincNameA(authnsvc: Int, princname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcServerInqDefaultPrincNameW(authnsvc: Int, princname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcServerInqIf(ifspec: Long, mgrtypeuuid: Long, mgrepv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcServerInterfaceGroupActivate(ifgroup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcServerInterfaceGroupClose(ifgroup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcServerInterfaceGroupCreateA(interfaces: Long, numifs: Int, endpoints: Long, numendpoints: Int, idleperiod: Int, idlecallbackfn: Long, idlecallbackcontext: Long, ifgroup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcServerInterfaceGroupCreateW(interfaces: Long, numifs: Int, endpoints: Long, numendpoints: Int, idleperiod: Int, idlecallbackfn: Long, idlecallbackcontext: Long, ifgroup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcServerInterfaceGroupDeactivate(ifgroup: Long, forcedeactivation: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcServerInterfaceGroupInqBindings(ifgroup: Long, bindingvector: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcServerListen(minimumcallthreads: Int, maxcalls: Int, dontwait: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcServerRegisterAuthInfoA(serverprincname: Long, authnsvc: Int, getkeyfn: Long, arg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcServerRegisterAuthInfoW(serverprincname: Long, authnsvc: Int, getkeyfn: Long, arg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcServerRegisterIf(ifspec: Long, mgrtypeuuid: Long, mgrepv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcServerRegisterIf2(ifspec: Long, mgrtypeuuid: Long, mgrepv: Long, flags: Int, maxcalls: Int, maxrpcsize: Int, ifcallbackfn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcServerRegisterIf3(ifspec: Long, mgrtypeuuid: Long, mgrepv: Long, flags: Int, maxcalls: Int, maxrpcsize: Int, ifcallback: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcServerRegisterIfEx(ifspec: Long, mgrtypeuuid: Long, mgrepv: Long, flags: Int, maxcalls: Int, ifcallback: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcServerSubscribeForNotification(binding: Long, notification: Int, notificationtype: Int, notificationinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcServerTestCancel(bindinghandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcServerUnregisterIf(ifspec: Long, mgrtypeuuid: Long, waitforcallstocomplete: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcServerUnregisterIfEx(ifspec: Long, mgrtypeuuid: Long, rundowncontexthandles: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcServerUnsubscribeForNotification(binding: Long, notification: Int, notificationsqueued: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcServerUseAllProtseqs(maxcalls: Int, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcServerUseAllProtseqsEx(maxcalls: Int, securitydescriptor: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcServerUseAllProtseqsIf(maxcalls: Int, ifspec: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcServerUseAllProtseqsIfEx(maxcalls: Int, ifspec: Long, securitydescriptor: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcServerUseProtseqA(protseq: Long, maxcalls: Int, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcServerUseProtseqEpA(protseq: Long, maxcalls: Int, endpoint: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcServerUseProtseqEpExA(protseq: Long, maxcalls: Int, endpoint: Long, securitydescriptor: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcServerUseProtseqEpExW(protseq: Long, maxcalls: Int, endpoint: Long, securitydescriptor: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcServerUseProtseqEpW(protseq: Long, maxcalls: Int, endpoint: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcServerUseProtseqExA(protseq: Long, maxcalls: Int, securitydescriptor: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcServerUseProtseqExW(protseq: Long, maxcalls: Int, securitydescriptor: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcServerUseProtseqIfA(protseq: Long, maxcalls: Int, ifspec: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcServerUseProtseqIfExA(protseq: Long, maxcalls: Int, ifspec: Long, securitydescriptor: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcServerUseProtseqIfExW(protseq: Long, maxcalls: Int, ifspec: Long, securitydescriptor: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcServerUseProtseqIfW(protseq: Long, maxcalls: Int, ifspec: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcServerUseProtseqW(protseq: Long, maxcalls: Int, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcServerYield()

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcSmAllocate(size: Long, pstatus: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcSmClientFree(pnodetofree: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcSmDestroyClientContext(contexthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcSmDisableAllocate(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcSmEnableAllocate(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcSmFree(nodetofree: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcSmGetThreadHandle(pstatus: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcSmSetClientAllocFree(clientalloc: Long, clientfree: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcSmSetThreadHandle(id: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcSmSwapClientAllocFree(clientalloc: Long, clientfree: Long, oldclientalloc: Long, oldclientfree: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcSsAllocate(size: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcSsContextLockExclusive(serverbindinghandle: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcSsContextLockShared(serverbindinghandle: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcSsDestroyClientContext(contexthandle: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcSsDisableAllocate()

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcSsDontSerializeContext()

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcSsEnableAllocate()

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcSsFree(nodetofree: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcSsGetContextBinding(contexthandle: Long, binding: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcSsGetThreadHandle(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcSsSetClientAllocFree(clientalloc: Long, clientfree: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcSsSetThreadHandle(id: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcSsSwapClientAllocFree(clientalloc: Long, clientfree: Long, oldclientalloc: Long, oldclientfree: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcStringBindingComposeA(objuuid: Long, protseq: Long, networkaddr: Long, endpoint: Long, options: Long, stringbinding: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcStringBindingComposeW(objuuid: Long, protseq: Long, networkaddr: Long, endpoint: Long, options: Long, stringbinding: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcStringBindingParseA(stringbinding: Long, objuuid: Long, protseq: Long, networkaddr: Long, endpoint: Long, networkoptions: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcStringBindingParseW(stringbinding: Long, objuuid: Long, protseq: Long, networkaddr: Long, endpoint: Long, networkoptions: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcStringFreeA(string: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcStringFreeW(string: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcTestCancel(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_rpcUserFree(asynchandle: Long, pbuffer: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_uuidCompare(uuid1: Long, uuid2: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_uuidCreate(uuid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_uuidCreateNil(niluuid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_uuidCreateSequential(uuid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_uuidEqual(uuid1: Long, uuid2: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_uuidFromStringA(stringuuid: Long, uuid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_uuidFromStringW(stringuuid: Long, uuid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_uuidHash(uuid: Long, status: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_uuidIsNil(uuid: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_uuidToStringA(uuid: Long, stringuuid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_uuidToStringW(uuid: Long, stringuuid: Long): Int
}

public actual fun dceErrorInqTextA(rpcstatus: RpcStatus, errortext: Pstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_dceErrorInqTextA(rpcstatus, (errortext?.value ?: 0L))

public actual fun dceErrorInqTextW(rpcstatus: RpcStatus, errortext: Pwstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_dceErrorInqTextW(rpcstatus, (errortext?.value ?: 0L))

public actual fun iunknownAddRefProxy(thisRef: COpaquePointer?): UInt =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iunknownAddRefProxy((thisRef?.value ?: 0L)).toUInt()

public actual fun iunknownQueryInterfaceProxy(thisRef: COpaquePointer?, riid: COpaquePointer?, ppvobject: COpaquePointer?): Hresult =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iunknownQueryInterfaceProxy((thisRef?.value ?: 0L), (riid?.value ?: 0L), (ppvobject?.value ?: 0L))

public actual fun iunknownReleaseProxy(thisRef: COpaquePointer?): UInt =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iunknownReleaseProxy((thisRef?.value ?: 0L)).toUInt()

public actual fun iRpcAllocate(size: UInt): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcAllocate(size.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun iRpcAsyncAbortCall(pasync: COpaquePointer?, exceptioncode: UInt): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcAsyncAbortCall((pasync?.value ?: 0L), exceptioncode.toInt())

public actual fun iRpcAsyncSetHandle(message: COpaquePointer?, pasync: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcAsyncSetHandle((message?.value ?: 0L), (pasync?.value ?: 0L))

public actual fun iRpcBindingCopy(sourcebinding: COpaquePointer?, destinationbinding: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcBindingCopy((sourcebinding?.value ?: 0L), (destinationbinding?.value ?: 0L))

public actual fun iRpcBindingCreateNp(servername: Pcwstr, servicename: Pcwstr, networkoptions: Pcwstr, binding: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcBindingCreateNp((servername?.value ?: 0L), (servicename?.value ?: 0L), (networkoptions?.value ?: 0L), (binding?.value ?: 0L))

public actual fun iRpcBindingHandleToAsyncHandle(binding: COpaquePointer?, asynchandle: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcBindingHandleToAsyncHandle((binding?.value ?: 0L), (asynchandle?.value ?: 0L))

public actual fun iRpcBindingInqClientTokenAttributes(binding: COpaquePointer?, tokenid: COpaquePointer?, authenticationid: COpaquePointer?, modifiedid: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcBindingInqClientTokenAttributes((binding?.value ?: 0L), (tokenid?.value ?: 0L), (authenticationid?.value ?: 0L), (modifiedid?.value ?: 0L))

public actual fun iRpcBindingInqDynamicEndpointA(binding: COpaquePointer?, dynamicendpoint: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcBindingInqDynamicEndpointA((binding?.value ?: 0L), (dynamicendpoint?.value ?: 0L))

public actual fun iRpcBindingInqDynamicEndpointW(binding: COpaquePointer?, dynamicendpoint: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcBindingInqDynamicEndpointW((binding?.value ?: 0L), (dynamicendpoint?.value ?: 0L))

public actual fun iRpcBindingInqLocalClientPid(binding: COpaquePointer?, pid: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcBindingInqLocalClientPid((binding?.value ?: 0L), (pid?.value ?: 0L))

public actual fun iRpcBindingInqMarshalledTargetInfo(binding: COpaquePointer?, marshalledtargetinfosize: COpaquePointer?, marshalledtargetinfo: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcBindingInqMarshalledTargetInfo((binding?.value ?: 0L), (marshalledtargetinfosize?.value ?: 0L), (marshalledtargetinfo?.value ?: 0L))

public actual fun iRpcBindingInqSecurityContext(binding: COpaquePointer?, securitycontexthandle: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcBindingInqSecurityContext((binding?.value ?: 0L), (securitycontexthandle?.value ?: 0L))

public actual fun iRpcBindingInqSecurityContextKeyInfo(binding: COpaquePointer?, keyinfo: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcBindingInqSecurityContextKeyInfo((binding?.value ?: 0L), (keyinfo?.value ?: 0L))

public actual fun iRpcBindingInqTransportType(binding: COpaquePointer?, type: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcBindingInqTransportType((binding?.value ?: 0L), (type?.value ?: 0L))

public actual fun iRpcBindingInqWireIdForSnego(binding: COpaquePointer?, wireid: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcBindingInqWireIdForSnego((binding?.value ?: 0L), (wireid?.value ?: 0L))

public actual fun iRpcBindingIsClientLocal(bindinghandle: COpaquePointer?, clientlocalflag: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcBindingIsClientLocal((bindinghandle?.value ?: 0L), (clientlocalflag?.value ?: 0L))

public actual fun iRpcBindingIsServerLocal(binding: COpaquePointer?, serverlocalflag: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcBindingIsServerLocal((binding?.value ?: 0L), (serverlocalflag?.value ?: 0L))

public actual fun iRpcBindingSetPrivateOption(hbinding: COpaquePointer?, option: UInt, optionvalue: ULong): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcBindingSetPrivateOption((hbinding?.value ?: 0L), option.toInt(), optionvalue.toLong())

public actual fun iRpcBindingToStaticStringBindingW(binding: COpaquePointer?, stringbinding: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcBindingToStaticStringBindingW((binding?.value ?: 0L), (stringbinding?.value ?: 0L))

public actual fun iRpcClearMutex(mutex: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcClearMutex((mutex?.value ?: 0L))
}

public actual fun iRpcDeleteMutex(mutex: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcDeleteMutex((mutex?.value ?: 0L))
}

public actual fun iRpcExceptionFilter(exceptioncode: UInt): Int =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcExceptionFilter(exceptioncode.toInt())

public actual fun iRpcFree(obj: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcFree((obj?.value ?: 0L))
}

public actual fun iRpcFreeBuffer(message: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcFreeBuffer((message?.value ?: 0L))

public actual fun iRpcFreePipeBuffer(message: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcFreePipeBuffer((message?.value ?: 0L))

public actual fun iRpcGetBuffer(message: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcGetBuffer((message?.value ?: 0L))

public actual fun iRpcGetBufferWithObject(message: COpaquePointer?, objectuuid: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcGetBufferWithObject((message?.value ?: 0L), (objectuuid?.value ?: 0L))

public actual fun iRpcGetCurrentCallHandle(): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcGetCurrentCallHandle().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun iRpcGetDefaultSd(ppsecuritydescriptor: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcGetDefaultSd((ppsecuritydescriptor?.value ?: 0L))

public actual fun iRpcGetExtendedError(): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcGetExtendedError()

public actual fun iRpcIfInqTransferSyntaxes(rpcifhandle: COpaquePointer?, transfersyntaxes: COpaquePointer?, transfersyntaxsize: UInt, transfersyntaxcount: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcIfInqTransferSyntaxes((rpcifhandle?.value ?: 0L), (transfersyntaxes?.value ?: 0L), transfersyntaxsize.toInt(), (transfersyntaxcount?.value ?: 0L))

public actual fun iRpcMapWin32Status(status: RpcStatus): Int =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcMapWin32Status(status)

public actual fun iRpcMgmtEnableDedicatedThreadPool(): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcMgmtEnableDedicatedThreadPool()

public actual fun iRpcNegotiateTransferSyntax(message: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcNegotiateTransferSyntax((message?.value ?: 0L))

public actual fun iRpcNsBindingSetEntryNameA(binding: COpaquePointer?, entrynamesyntax: UInt, entryname: Pcstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcNsBindingSetEntryNameA((binding?.value ?: 0L), entrynamesyntax.toInt(), (entryname?.value ?: 0L))

public actual fun iRpcNsBindingSetEntryNameW(binding: COpaquePointer?, entrynamesyntax: UInt, entryname: Pcwstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcNsBindingSetEntryNameW((binding?.value ?: 0L), entrynamesyntax.toInt(), (entryname?.value ?: 0L))

public actual fun iRpcNsGetBuffer(message: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcNsGetBuffer((message?.value ?: 0L))

public actual fun iRpcNsInterfaceExported(entrynamesyntax: UInt, entryname: COpaquePointer?, rpcinterfaceinformation: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcNsInterfaceExported(entrynamesyntax.toInt(), (entryname?.value ?: 0L), (rpcinterfaceinformation?.value ?: 0L))

public actual fun iRpcNsInterfaceUnexported(entrynamesyntax: UInt, entryname: COpaquePointer?, rpcinterfaceinformation: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcNsInterfaceUnexported(entrynamesyntax.toInt(), (entryname?.value ?: 0L), (rpcinterfaceinformation?.value ?: 0L))

public actual fun iRpcNsRaiseException(message: COpaquePointer?, status: RpcStatus) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcNsRaiseException((message?.value ?: 0L), status)
}

public actual fun iRpcNsSendReceive(message: COpaquePointer?, handle: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcNsSendReceive((message?.value ?: 0L), (handle?.value ?: 0L))

public actual fun iRpcOpenClientProcess(binding: COpaquePointer?, desiredaccess: UInt, clientprocess: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcOpenClientProcess((binding?.value ?: 0L), desiredaccess.toInt(), (clientprocess?.value ?: 0L))

public actual fun iRpcPauseExecution(milliseconds: UInt) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcPauseExecution(milliseconds.toInt())
}

public actual fun iRpcReBindBuffer(message: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcReBindBuffer((message?.value ?: 0L))

public actual fun iRpcReallocPipeBuffer(message: COpaquePointer?, newsize: UInt): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcReallocPipeBuffer((message?.value ?: 0L), newsize.toInt())

public actual fun iRpcReceive(message: COpaquePointer?, size: UInt): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcReceive((message?.value ?: 0L), size.toInt())

public actual fun iRpcRecordCalloutFailure(rpcstatus: RpcStatus, calloutstate: COpaquePointer?, dllname: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcRecordCalloutFailure(rpcstatus, (calloutstate?.value ?: 0L), (dllname?.value ?: 0L))
}

public actual fun iRpcRequestMutex(mutex: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcRequestMutex((mutex?.value ?: 0L))
}

public actual fun iRpcSend(message: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcSend((message?.value ?: 0L))

public actual fun iRpcSendReceive(message: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcSendReceive((message?.value ?: 0L))

public actual fun iRpcServerCheckClientRestriction(context: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcServerCheckClientRestriction((context?.value ?: 0L))

public actual fun iRpcServerDisableExceptionFilter(): Int =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcServerDisableExceptionFilter()

public actual fun iRpcServerGetAssociationId(binding: COpaquePointer?, associationid: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcServerGetAssociationId((binding?.value ?: 0L), (associationid?.value ?: 0L))

public actual fun iRpcServerInqAddressChangeFn(): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcServerInqAddressChangeFn().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun iRpcServerInqLocalConnAddress(binding: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?, addressformat: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcServerInqLocalConnAddress((binding?.value ?: 0L), (buffer?.value ?: 0L), (buffersize?.value ?: 0L), (addressformat?.value ?: 0L))

public actual fun iRpcServerInqRemoteConnAddress(binding: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?, addressformat: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcServerInqRemoteConnAddress((binding?.value ?: 0L), (buffer?.value ?: 0L), (buffersize?.value ?: 0L), (addressformat?.value ?: 0L))

public actual fun iRpcServerInqTransportType(type: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcServerInqTransportType((type?.value ?: 0L))

public actual fun iRpcServerRegisterForwardFunction(pforwardfunction: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcServerRegisterForwardFunction((pforwardfunction?.value ?: 0L))

public actual fun iRpcServerSetAddressChangeFn(paddresschangefn: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcServerSetAddressChangeFn((paddresschangefn?.value ?: 0L))

public actual fun iRpcServerStartService(protseq: Pcwstr, endpoint: Pcwstr, ifspec: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcServerStartService((protseq?.value ?: 0L), (endpoint?.value ?: 0L), (ifspec?.value ?: 0L))

public actual fun iRpcServerSubscribeForDisconnectNotification(binding: COpaquePointer?, hevent: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcServerSubscribeForDisconnectNotification((binding?.value ?: 0L), (hevent?.value ?: 0L))

public actual fun iRpcServerSubscribeForDisconnectNotification2(binding: COpaquePointer?, hevent: COpaquePointer?, subscriptionid: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcServerSubscribeForDisconnectNotification2((binding?.value ?: 0L), (hevent?.value ?: 0L), (subscriptionid?.value ?: 0L))

public actual fun iRpcServerUnsubscribeForDisconnectNotification(binding: COpaquePointer?, subscriptionid: Guid): RpcStatus =
    0

public actual fun iRpcServerUseProtseq2A(networkaddress: Pcstr, protseq: Pcstr, maxcalls: UInt, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcServerUseProtseq2A((networkaddress?.value ?: 0L), (protseq?.value ?: 0L), maxcalls.toInt(), (securitydescriptor?.value ?: 0L), (policy?.value ?: 0L))

public actual fun iRpcServerUseProtseq2W(networkaddress: Pcwstr, protseq: Pcwstr, maxcalls: UInt, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcServerUseProtseq2W((networkaddress?.value ?: 0L), (protseq?.value ?: 0L), maxcalls.toInt(), (securitydescriptor?.value ?: 0L), (policy?.value ?: 0L))

public actual fun iRpcServerUseProtseqEp2A(networkaddress: Pcstr, protseq: Pcstr, maxcalls: UInt, endpoint: Pcstr, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcServerUseProtseqEp2A((networkaddress?.value ?: 0L), (protseq?.value ?: 0L), maxcalls.toInt(), (endpoint?.value ?: 0L), (securitydescriptor?.value ?: 0L), (policy?.value ?: 0L))

public actual fun iRpcServerUseProtseqEp2W(networkaddress: Pcwstr, protseq: Pcwstr, maxcalls: UInt, endpoint: Pcwstr, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcServerUseProtseqEp2W((networkaddress?.value ?: 0L), (protseq?.value ?: 0L), maxcalls.toInt(), (endpoint?.value ?: 0L), (securitydescriptor?.value ?: 0L), (policy?.value ?: 0L))

public actual fun iRpcSessionStrictContextHandle() {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcSessionStrictContextHandle()
}

public actual fun iRpcSsDontSerializeContext() {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcSsDontSerializeContext()
}

public actual fun iRpcSystemHandleTypeSpecificWork(handle: COpaquePointer?, actualtype: UByte, idltype: UByte, marshaldirection: LrpcSystemHandleMarshalDirection): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcSystemHandleTypeSpecificWork((handle?.value ?: 0L), actualtype.toByte(), idltype.toByte(), marshaldirection)

public actual fun iRpcTurnOnEeinfoPropagation(): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iRpcTurnOnEeinfoPropagation()

public actual fun iUuidCreate(uuid: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_iUuidCreate((uuid?.value ?: 0L))

public actual fun mesBufferHandleReset(handle: COpaquePointer?, handlestyle: UInt, operation: MidlEsCode, pbuffer: COpaquePointer?, buffersize: UInt, pencodedsize: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_mesBufferHandleReset((handle?.value ?: 0L), handlestyle.toInt(), operation, (pbuffer?.value ?: 0L), buffersize.toInt(), (pencodedsize?.value ?: 0L))

public actual fun mesDecodeBufferHandleCreate(buffer: Pcstr, buffersize: UInt, phandle: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_mesDecodeBufferHandleCreate((buffer?.value ?: 0L), buffersize.toInt(), (phandle?.value ?: 0L))

public actual fun mesDecodeIncrementalHandleCreate(userstate: COpaquePointer?, readfn: MidlEsRead, phandle: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_mesDecodeIncrementalHandleCreate((userstate?.value ?: 0L), 0L, (phandle?.value ?: 0L))

public actual fun mesEncodeDynBufferHandleCreate(pbuffer: COpaquePointer?, pencodedsize: COpaquePointer?, phandle: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_mesEncodeDynBufferHandleCreate((pbuffer?.value ?: 0L), (pencodedsize?.value ?: 0L), (phandle?.value ?: 0L))

public actual fun mesEncodeFixedBufferHandleCreate(pbuffer: Pstr, buffersize: UInt, pencodedsize: COpaquePointer?, phandle: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_mesEncodeFixedBufferHandleCreate((pbuffer?.value ?: 0L), buffersize.toInt(), (pencodedsize?.value ?: 0L), (phandle?.value ?: 0L))

public actual fun mesEncodeIncrementalHandleCreate(userstate: COpaquePointer?, allocfn: MidlEsAlloc, writefn: MidlEsWrite, phandle: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_mesEncodeIncrementalHandleCreate((userstate?.value ?: 0L), 0L, 0L, (phandle?.value ?: 0L))

public actual fun mesHandleFree(handle: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_mesHandleFree((handle?.value ?: 0L))

public actual fun mesIncrementalHandleReset(handle: COpaquePointer?, userstate: COpaquePointer?, allocfn: MidlEsAlloc, writefn: MidlEsWrite, readfn: MidlEsRead, operation: MidlEsCode): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_mesIncrementalHandleReset((handle?.value ?: 0L), (userstate?.value ?: 0L), 0L, 0L, 0L, operation)

public actual fun mesInqProcEncodingId(handle: COpaquePointer?, pinterfaceid: COpaquePointer?, pprocnum: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_mesInqProcEncodingId((handle?.value ?: 0L), (pinterfaceid?.value ?: 0L), (pprocnum?.value ?: 0L))

public actual fun nDRCContextBinding(ccontext: Long): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_nDRCContextBinding(ccontext).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun nDRCContextMarshall(ccontext: Long, pbuff: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_nDRCContextMarshall(ccontext, (pbuff?.value ?: 0L))
}

public actual fun nDRCContextUnmarshall(pccontext: COpaquePointer?, hbinding: COpaquePointer?, pbuff: COpaquePointer?, datarepresentation: UInt) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_nDRCContextUnmarshall((pccontext?.value ?: 0L), (hbinding?.value ?: 0L), (pbuff?.value ?: 0L), datarepresentation.toInt())
}

public actual fun nDRSContextMarshall(ccontext: COpaquePointer?, pbuff: COpaquePointer?, userrundownin: NdrRundown) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_nDRSContextMarshall((ccontext?.value ?: 0L), (pbuff?.value ?: 0L), 0L)
}

public actual fun nDRSContextMarshall2(bindinghandle: COpaquePointer?, ccontext: COpaquePointer?, pbuff: COpaquePointer?, userrundownin: NdrRundown, ctxguard: COpaquePointer?, flags: UInt) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_nDRSContextMarshall2((bindinghandle?.value ?: 0L), (ccontext?.value ?: 0L), (pbuff?.value ?: 0L), 0L, (ctxguard?.value ?: 0L), flags.toInt())
}

public actual fun nDRSContextMarshallEx(bindinghandle: COpaquePointer?, ccontext: COpaquePointer?, pbuff: COpaquePointer?, userrundownin: NdrRundown) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_nDRSContextMarshallEx((bindinghandle?.value ?: 0L), (ccontext?.value ?: 0L), (pbuff?.value ?: 0L), 0L)
}

public actual fun nDRSContextUnmarshall(pbuff: COpaquePointer?, datarepresentation: UInt): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_nDRSContextUnmarshall((pbuff?.value ?: 0L), datarepresentation.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun nDRSContextUnmarshall2(bindinghandle: COpaquePointer?, pbuff: COpaquePointer?, datarepresentation: UInt, ctxguard: COpaquePointer?, flags: UInt): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_nDRSContextUnmarshall2((bindinghandle?.value ?: 0L), (pbuff?.value ?: 0L), datarepresentation.toInt(), (ctxguard?.value ?: 0L), flags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun nDRSContextUnmarshallEx(bindinghandle: COpaquePointer?, pbuff: COpaquePointer?, datarepresentation: UInt): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_nDRSContextUnmarshallEx((bindinghandle?.value ?: 0L), (pbuff?.value ?: 0L), datarepresentation.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndr64AsyncClientCall(pproxyinfo: COpaquePointer?, nprocnum: UInt, preturnvalue: COpaquePointer?, vararg variadicArgs: Long): ClientCallReturn =
    ClientCallReturn()

public actual fun ndr64AsyncServerCall64(prpcmsg: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndr64AsyncServerCall64((prpcmsg?.value ?: 0L))
}

public actual fun ndr64AsyncServerCallAll(prpcmsg: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndr64AsyncServerCallAll((prpcmsg?.value ?: 0L))
}

public actual fun ndr64DcomAsyncClientCall(pproxyinfo: COpaquePointer?, nprocnum: UInt, preturnvalue: COpaquePointer?, vararg variadicArgs: Long): ClientCallReturn =
    ClientCallReturn()

public actual fun ndr64DcomAsyncStubCall(pthis: COpaquePointer?, pchannel: COpaquePointer?, prpcmsg: COpaquePointer?, pdwstubphase: COpaquePointer?): Int =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndr64DcomAsyncStubCall((pthis?.value ?: 0L), (pchannel?.value ?: 0L), (prpcmsg?.value ?: 0L), (pdwstubphase?.value ?: 0L))

public actual fun ndrAllocate(pstubmsg: COpaquePointer?, len: ULong): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrAllocate((pstubmsg?.value ?: 0L), len.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrAsyncClientCall(pstubdescriptor: COpaquePointer?, pformat: COpaquePointer?, vararg variadicArgs: Long): ClientCallReturn =
    ClientCallReturn()

public actual fun ndrAsyncServerCall(prpcmsg: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrAsyncServerCall((prpcmsg?.value ?: 0L))
}

public actual fun ndrByteCountPointerBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrByteCountPointerBufferSize((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L))
}

public actual fun ndrByteCountPointerFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrByteCountPointerFree((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L))
}

public actual fun ndrByteCountPointerMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrByteCountPointerMarshall((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrByteCountPointerUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrByteCountPointerUnmarshall((pstubmsg?.value ?: 0L), (ppmemory?.value ?: 0L), (pformat?.value ?: 0L), fmustalloc.toByte()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrClearOutParameters(pstubmsg: COpaquePointer?, pformat: COpaquePointer?, argaddr: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrClearOutParameters((pstubmsg?.value ?: 0L), (pformat?.value ?: 0L), (argaddr?.value ?: 0L))
}

public actual fun ndrClientCall2(pstubdescriptor: COpaquePointer?, pformat: COpaquePointer?, vararg variadicArgs: Long): ClientCallReturn =
    ClientCallReturn()

public actual fun ndrClientCall3(pproxyinfo: COpaquePointer?, nprocnum: UInt, preturnvalue: COpaquePointer?, vararg variadicArgs: Long): ClientCallReturn =
    ClientCallReturn()

public actual fun ndrClientContextMarshall(pstubmsg: COpaquePointer?, contexthandle: Long, fcheck: Int) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrClientContextMarshall((pstubmsg?.value ?: 0L), contexthandle, fcheck)
}

public actual fun ndrClientContextUnmarshall(pstubmsg: COpaquePointer?, pcontexthandle: COpaquePointer?, bindhandle: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrClientContextUnmarshall((pstubmsg?.value ?: 0L), (pcontexthandle?.value ?: 0L), (bindhandle?.value ?: 0L))
}

public actual fun ndrClientInitialize(prpcmsg: COpaquePointer?, pstubmsg: COpaquePointer?, pstubdescriptor: COpaquePointer?, procnum: UInt) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrClientInitialize((prpcmsg?.value ?: 0L), (pstubmsg?.value ?: 0L), (pstubdescriptor?.value ?: 0L), procnum.toInt())
}

public actual fun ndrClientInitializeNew(prpcmsg: COpaquePointer?, pstubmsg: COpaquePointer?, pstubdescriptor: COpaquePointer?, procnum: UInt) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrClientInitializeNew((prpcmsg?.value ?: 0L), (pstubmsg?.value ?: 0L), (pstubdescriptor?.value ?: 0L), procnum.toInt())
}

public actual fun ndrComplexArrayBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrComplexArrayBufferSize((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L))
}

public actual fun ndrComplexArrayFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrComplexArrayFree((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L))
}

public actual fun ndrComplexArrayMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrComplexArrayMarshall((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrComplexArrayMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrComplexArrayMemorySize((pstubmsg?.value ?: 0L), (pformat?.value ?: 0L)).toUInt()

public actual fun ndrComplexArrayUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrComplexArrayUnmarshall((pstubmsg?.value ?: 0L), (ppmemory?.value ?: 0L), (pformat?.value ?: 0L), fmustalloc.toByte()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrComplexStructBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrComplexStructBufferSize((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L))
}

public actual fun ndrComplexStructFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrComplexStructFree((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L))
}

public actual fun ndrComplexStructMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrComplexStructMarshall((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrComplexStructMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrComplexStructMemorySize((pstubmsg?.value ?: 0L), (pformat?.value ?: 0L)).toUInt()

public actual fun ndrComplexStructUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrComplexStructUnmarshall((pstubmsg?.value ?: 0L), (ppmemory?.value ?: 0L), (pformat?.value ?: 0L), fmustalloc.toByte()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrConformantArrayBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrConformantArrayBufferSize((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L))
}

public actual fun ndrConformantArrayFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrConformantArrayFree((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L))
}

public actual fun ndrConformantArrayMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrConformantArrayMarshall((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrConformantArrayMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrConformantArrayMemorySize((pstubmsg?.value ?: 0L), (pformat?.value ?: 0L)).toUInt()

public actual fun ndrConformantArrayUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrConformantArrayUnmarshall((pstubmsg?.value ?: 0L), (ppmemory?.value ?: 0L), (pformat?.value ?: 0L), fmustalloc.toByte()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrConformantStringBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrConformantStringBufferSize((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L))
}

public actual fun ndrConformantStringMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrConformantStringMarshall((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrConformantStringMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrConformantStringMemorySize((pstubmsg?.value ?: 0L), (pformat?.value ?: 0L)).toUInt()

public actual fun ndrConformantStringUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrConformantStringUnmarshall((pstubmsg?.value ?: 0L), (ppmemory?.value ?: 0L), (pformat?.value ?: 0L), fmustalloc.toByte()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrConformantStructBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrConformantStructBufferSize((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L))
}

public actual fun ndrConformantStructFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrConformantStructFree((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L))
}

public actual fun ndrConformantStructMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrConformantStructMarshall((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrConformantStructMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrConformantStructMemorySize((pstubmsg?.value ?: 0L), (pformat?.value ?: 0L)).toUInt()

public actual fun ndrConformantStructUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrConformantStructUnmarshall((pstubmsg?.value ?: 0L), (ppmemory?.value ?: 0L), (pformat?.value ?: 0L), fmustalloc.toByte()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrConformantVaryingArrayBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrConformantVaryingArrayBufferSize((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L))
}

public actual fun ndrConformantVaryingArrayFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrConformantVaryingArrayFree((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L))
}

public actual fun ndrConformantVaryingArrayMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrConformantVaryingArrayMarshall((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrConformantVaryingArrayMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrConformantVaryingArrayMemorySize((pstubmsg?.value ?: 0L), (pformat?.value ?: 0L)).toUInt()

public actual fun ndrConformantVaryingArrayUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrConformantVaryingArrayUnmarshall((pstubmsg?.value ?: 0L), (ppmemory?.value ?: 0L), (pformat?.value ?: 0L), fmustalloc.toByte()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrConformantVaryingStructBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrConformantVaryingStructBufferSize((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L))
}

public actual fun ndrConformantVaryingStructFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrConformantVaryingStructFree((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L))
}

public actual fun ndrConformantVaryingStructMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrConformantVaryingStructMarshall((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrConformantVaryingStructMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrConformantVaryingStructMemorySize((pstubmsg?.value ?: 0L), (pformat?.value ?: 0L)).toUInt()

public actual fun ndrConformantVaryingStructUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrConformantVaryingStructUnmarshall((pstubmsg?.value ?: 0L), (ppmemory?.value ?: 0L), (pformat?.value ?: 0L), fmustalloc.toByte()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrContextHandleInitialize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrContextHandleInitialize((pstubmsg?.value ?: 0L), (pformat?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrContextHandleSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrContextHandleSize((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L))
}

public actual fun ndrConvert(pstubmsg: COpaquePointer?, pformat: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrConvert((pstubmsg?.value ?: 0L), (pformat?.value ?: 0L))
}

public actual fun ndrConvert2(pstubmsg: COpaquePointer?, pformat: COpaquePointer?, numberparams: Int) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrConvert2((pstubmsg?.value ?: 0L), (pformat?.value ?: 0L), numberparams)
}

public actual fun ndrCorrelationFree(pstubmsg: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrCorrelationFree((pstubmsg?.value ?: 0L))
}

public actual fun ndrCorrelationInitialize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, cachesize: UInt, flags: UInt) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrCorrelationInitialize((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), cachesize.toInt(), flags.toInt())
}

public actual fun ndrCorrelationPass(pstubmsg: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrCorrelationPass((pstubmsg?.value ?: 0L))
}

public actual fun ndrCreateServerInterfaceFromStub(pstub: COpaquePointer?, pserverif: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrCreateServerInterfaceFromStub((pstub?.value ?: 0L), (pserverif?.value ?: 0L))

public actual fun ndrDcomAsyncClientCall(pstubdescriptor: COpaquePointer?, pformat: COpaquePointer?, vararg variadicArgs: Long): ClientCallReturn =
    ClientCallReturn()

public actual fun ndrDcomAsyncStubCall(pthis: COpaquePointer?, pchannel: COpaquePointer?, prpcmsg: COpaquePointer?, pdwstubphase: COpaquePointer?): Int =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrDcomAsyncStubCall((pthis?.value ?: 0L), (pchannel?.value ?: 0L), (prpcmsg?.value ?: 0L), (pdwstubphase?.value ?: 0L))

public actual fun ndrEncapsulatedUnionBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrEncapsulatedUnionBufferSize((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L))
}

public actual fun ndrEncapsulatedUnionFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrEncapsulatedUnionFree((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L))
}

public actual fun ndrEncapsulatedUnionMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrEncapsulatedUnionMarshall((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrEncapsulatedUnionMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrEncapsulatedUnionMemorySize((pstubmsg?.value ?: 0L), (pformat?.value ?: 0L)).toUInt()

public actual fun ndrEncapsulatedUnionUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrEncapsulatedUnionUnmarshall((pstubmsg?.value ?: 0L), (ppmemory?.value ?: 0L), (pformat?.value ?: 0L), fmustalloc.toByte()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrFixedArrayBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrFixedArrayBufferSize((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L))
}

public actual fun ndrFixedArrayFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrFixedArrayFree((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L))
}

public actual fun ndrFixedArrayMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrFixedArrayMarshall((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrFixedArrayMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrFixedArrayMemorySize((pstubmsg?.value ?: 0L), (pformat?.value ?: 0L)).toUInt()

public actual fun ndrFixedArrayUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrFixedArrayUnmarshall((pstubmsg?.value ?: 0L), (ppmemory?.value ?: 0L), (pformat?.value ?: 0L), fmustalloc.toByte()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrFreeBuffer(pstubmsg: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrFreeBuffer((pstubmsg?.value ?: 0L))
}

public actual fun ndrFullPointerXlatFree(pxlattables: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrFullPointerXlatFree((pxlattables?.value ?: 0L))
}

public actual fun ndrFullPointerXlatInit(numberofpointers: UInt, xlatside: XlatSide): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrFullPointerXlatInit(numberofpointers.toInt(), xlatside).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrGetBuffer(pstubmsg: COpaquePointer?, bufferlength: UInt, handle: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrGetBuffer((pstubmsg?.value ?: 0L), bufferlength.toInt(), (handle?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrGetDcomProtocolVersion(pstubmsg: COpaquePointer?, pversion: COpaquePointer?): Hresult =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrGetDcomProtocolVersion((pstubmsg?.value ?: 0L), (pversion?.value ?: 0L))

public actual fun ndrGetUserMarshalInfo(pflags: COpaquePointer?, informationlevel: UInt, pmarshalinfo: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrGetUserMarshalInfo((pflags?.value ?: 0L), informationlevel.toInt(), (pmarshalinfo?.value ?: 0L))

public actual fun ndrInterfacePointerBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrInterfacePointerBufferSize((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L))
}

public actual fun ndrInterfacePointerFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrInterfacePointerFree((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L))
}

public actual fun ndrInterfacePointerMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrInterfacePointerMarshall((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrInterfacePointerMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrInterfacePointerMemorySize((pstubmsg?.value ?: 0L), (pformat?.value ?: 0L)).toUInt()

public actual fun ndrInterfacePointerUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrInterfacePointerUnmarshall((pstubmsg?.value ?: 0L), (ppmemory?.value ?: 0L), (pformat?.value ?: 0L), fmustalloc.toByte()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrMapCommAndFaultStatus(pstubmsg: COpaquePointer?, pcommstatus: COpaquePointer?, pfaultstatus: COpaquePointer?, status: RpcStatus): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrMapCommAndFaultStatus((pstubmsg?.value ?: 0L), (pcommstatus?.value ?: 0L), (pfaultstatus?.value ?: 0L), status)

public actual fun ndrMesProcEncodeDecode(handle: COpaquePointer?, pstubdesc: COpaquePointer?, pformatstring: COpaquePointer?, vararg variadicArgs: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrMesProcEncodeDecode((handle?.value ?: 0L), (pstubdesc?.value ?: 0L), (pformatstring?.value ?: 0L), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun ndrMesProcEncodeDecode2(handle: COpaquePointer?, pstubdesc: COpaquePointer?, pformatstring: COpaquePointer?, vararg variadicArgs: Long): ClientCallReturn =
    ClientCallReturn()

public actual fun ndrMesProcEncodeDecode3(handle: COpaquePointer?, pproxyinfo: COpaquePointer?, nprocnum: UInt, preturnvalue: COpaquePointer?, vararg variadicArgs: Long): ClientCallReturn =
    ClientCallReturn()

public actual fun ndrMesSimpleTypeAlignSize(param0: COpaquePointer?): ULong =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrMesSimpleTypeAlignSize((param0?.value ?: 0L)).toULong()

public actual fun ndrMesSimpleTypeAlignSizeAll(handle: COpaquePointer?, pproxyinfo: COpaquePointer?): ULong =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrMesSimpleTypeAlignSizeAll((handle?.value ?: 0L), (pproxyinfo?.value ?: 0L)).toULong()

public actual fun ndrMesSimpleTypeDecode(handle: COpaquePointer?, pobject: COpaquePointer?, size: Short) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrMesSimpleTypeDecode((handle?.value ?: 0L), (pobject?.value ?: 0L), size)
}

public actual fun ndrMesSimpleTypeDecodeAll(handle: COpaquePointer?, pproxyinfo: COpaquePointer?, pobject: COpaquePointer?, size: Short) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrMesSimpleTypeDecodeAll((handle?.value ?: 0L), (pproxyinfo?.value ?: 0L), (pobject?.value ?: 0L), size)
}

public actual fun ndrMesSimpleTypeEncode(handle: COpaquePointer?, pstubdesc: COpaquePointer?, pobject: COpaquePointer?, size: Short) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrMesSimpleTypeEncode((handle?.value ?: 0L), (pstubdesc?.value ?: 0L), (pobject?.value ?: 0L), size)
}

public actual fun ndrMesSimpleTypeEncodeAll(handle: COpaquePointer?, pproxyinfo: COpaquePointer?, pobject: COpaquePointer?, size: Short) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrMesSimpleTypeEncodeAll((handle?.value ?: 0L), (pproxyinfo?.value ?: 0L), (pobject?.value ?: 0L), size)
}

public actual fun ndrMesTypeAlignSize(handle: COpaquePointer?, pstubdesc: COpaquePointer?, pformatstring: COpaquePointer?, pobject: COpaquePointer?): ULong =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrMesTypeAlignSize((handle?.value ?: 0L), (pstubdesc?.value ?: 0L), (pformatstring?.value ?: 0L), (pobject?.value ?: 0L)).toULong()

public actual fun ndrMesTypeAlignSize2(handle: COpaquePointer?, ppicklinginfo: COpaquePointer?, pstubdesc: COpaquePointer?, pformatstring: COpaquePointer?, pobject: COpaquePointer?): ULong =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrMesTypeAlignSize2((handle?.value ?: 0L), (ppicklinginfo?.value ?: 0L), (pstubdesc?.value ?: 0L), (pformatstring?.value ?: 0L), (pobject?.value ?: 0L)).toULong()

public actual fun ndrMesTypeAlignSize3(handle: COpaquePointer?, ppicklinginfo: COpaquePointer?, pproxyinfo: COpaquePointer?, arrtypeoffset: COpaquePointer?, ntypeindex: UInt, pobject: COpaquePointer?): ULong =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrMesTypeAlignSize3((handle?.value ?: 0L), (ppicklinginfo?.value ?: 0L), (pproxyinfo?.value ?: 0L), (arrtypeoffset?.value ?: 0L), ntypeindex.toInt(), (pobject?.value ?: 0L)).toULong()

public actual fun ndrMesTypeDecode(handle: COpaquePointer?, pstubdesc: COpaquePointer?, pformatstring: COpaquePointer?, pobject: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrMesTypeDecode((handle?.value ?: 0L), (pstubdesc?.value ?: 0L), (pformatstring?.value ?: 0L), (pobject?.value ?: 0L))
}

public actual fun ndrMesTypeDecode2(handle: COpaquePointer?, ppicklinginfo: COpaquePointer?, pstubdesc: COpaquePointer?, pformatstring: COpaquePointer?, pobject: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrMesTypeDecode2((handle?.value ?: 0L), (ppicklinginfo?.value ?: 0L), (pstubdesc?.value ?: 0L), (pformatstring?.value ?: 0L), (pobject?.value ?: 0L))
}

public actual fun ndrMesTypeDecode3(handle: COpaquePointer?, ppicklinginfo: COpaquePointer?, pproxyinfo: COpaquePointer?, arrtypeoffset: COpaquePointer?, ntypeindex: UInt, pobject: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrMesTypeDecode3((handle?.value ?: 0L), (ppicklinginfo?.value ?: 0L), (pproxyinfo?.value ?: 0L), (arrtypeoffset?.value ?: 0L), ntypeindex.toInt(), (pobject?.value ?: 0L))
}

public actual fun ndrMesTypeEncode(handle: COpaquePointer?, pstubdesc: COpaquePointer?, pformatstring: COpaquePointer?, pobject: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrMesTypeEncode((handle?.value ?: 0L), (pstubdesc?.value ?: 0L), (pformatstring?.value ?: 0L), (pobject?.value ?: 0L))
}

public actual fun ndrMesTypeEncode2(handle: COpaquePointer?, ppicklinginfo: COpaquePointer?, pstubdesc: COpaquePointer?, pformatstring: COpaquePointer?, pobject: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrMesTypeEncode2((handle?.value ?: 0L), (ppicklinginfo?.value ?: 0L), (pstubdesc?.value ?: 0L), (pformatstring?.value ?: 0L), (pobject?.value ?: 0L))
}

public actual fun ndrMesTypeEncode3(handle: COpaquePointer?, ppicklinginfo: COpaquePointer?, pproxyinfo: COpaquePointer?, arrtypeoffset: COpaquePointer?, ntypeindex: UInt, pobject: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrMesTypeEncode3((handle?.value ?: 0L), (ppicklinginfo?.value ?: 0L), (pproxyinfo?.value ?: 0L), (arrtypeoffset?.value ?: 0L), ntypeindex.toInt(), (pobject?.value ?: 0L))
}

public actual fun ndrMesTypeFree2(handle: COpaquePointer?, ppicklinginfo: COpaquePointer?, pstubdesc: COpaquePointer?, pformatstring: COpaquePointer?, pobject: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrMesTypeFree2((handle?.value ?: 0L), (ppicklinginfo?.value ?: 0L), (pstubdesc?.value ?: 0L), (pformatstring?.value ?: 0L), (pobject?.value ?: 0L))
}

public actual fun ndrMesTypeFree3(handle: COpaquePointer?, ppicklinginfo: COpaquePointer?, pproxyinfo: COpaquePointer?, arrtypeoffset: COpaquePointer?, ntypeindex: UInt, pobject: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrMesTypeFree3((handle?.value ?: 0L), (ppicklinginfo?.value ?: 0L), (pproxyinfo?.value ?: 0L), (arrtypeoffset?.value ?: 0L), ntypeindex.toInt(), (pobject?.value ?: 0L))
}

public actual fun ndrNonConformantStringBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrNonConformantStringBufferSize((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L))
}

public actual fun ndrNonConformantStringMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrNonConformantStringMarshall((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrNonConformantStringMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrNonConformantStringMemorySize((pstubmsg?.value ?: 0L), (pformat?.value ?: 0L)).toUInt()

public actual fun ndrNonConformantStringUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrNonConformantStringUnmarshall((pstubmsg?.value ?: 0L), (ppmemory?.value ?: 0L), (pformat?.value ?: 0L), fmustalloc.toByte()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrNonEncapsulatedUnionBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrNonEncapsulatedUnionBufferSize((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L))
}

public actual fun ndrNonEncapsulatedUnionFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrNonEncapsulatedUnionFree((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L))
}

public actual fun ndrNonEncapsulatedUnionMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrNonEncapsulatedUnionMarshall((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrNonEncapsulatedUnionMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrNonEncapsulatedUnionMemorySize((pstubmsg?.value ?: 0L), (pformat?.value ?: 0L)).toUInt()

public actual fun ndrNonEncapsulatedUnionUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrNonEncapsulatedUnionUnmarshall((pstubmsg?.value ?: 0L), (ppmemory?.value ?: 0L), (pformat?.value ?: 0L), fmustalloc.toByte()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrNsGetBuffer(pstubmsg: COpaquePointer?, bufferlength: UInt, handle: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrNsGetBuffer((pstubmsg?.value ?: 0L), bufferlength.toInt(), (handle?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrNsSendReceive(pstubmsg: COpaquePointer?, pbufferend: COpaquePointer?, pautohandle: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrNsSendReceive((pstubmsg?.value ?: 0L), (pbufferend?.value ?: 0L), (pautohandle?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrOleAllocate(size: ULong): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrOleAllocate(size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrOleFree(nodetofree: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrOleFree((nodetofree?.value ?: 0L))
}

public actual fun ndrPartialIgnoreClientBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrPartialIgnoreClientBufferSize((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L))
}

public actual fun ndrPartialIgnoreClientMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrPartialIgnoreClientMarshall((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L))
}

public actual fun ndrPartialIgnoreServerInitialize(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrPartialIgnoreServerInitialize((pstubmsg?.value ?: 0L), (ppmemory?.value ?: 0L), (pformat?.value ?: 0L))
}

public actual fun ndrPartialIgnoreServerUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrPartialIgnoreServerUnmarshall((pstubmsg?.value ?: 0L), (ppmemory?.value ?: 0L))
}

public actual fun ndrPointerBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrPointerBufferSize((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L))
}

public actual fun ndrPointerFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrPointerFree((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L))
}

public actual fun ndrPointerMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrPointerMarshall((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrPointerMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrPointerMemorySize((pstubmsg?.value ?: 0L), (pformat?.value ?: 0L)).toUInt()

public actual fun ndrPointerUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrPointerUnmarshall((pstubmsg?.value ?: 0L), (ppmemory?.value ?: 0L), (pformat?.value ?: 0L), fmustalloc.toByte()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrRangeUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrRangeUnmarshall((pstubmsg?.value ?: 0L), (ppmemory?.value ?: 0L), (pformat?.value ?: 0L), fmustalloc.toByte()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrRpcSmClientAllocate(size: ULong): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrRpcSmClientAllocate(size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrRpcSmClientFree(nodetofree: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrRpcSmClientFree((nodetofree?.value ?: 0L))
}

public actual fun ndrRpcSmSetClientToOsf(pmessage: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrRpcSmSetClientToOsf((pmessage?.value ?: 0L))
}

public actual fun ndrRpcSsDefaultAllocate(size: ULong): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrRpcSsDefaultAllocate(size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrRpcSsDefaultFree(nodetofree: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrRpcSsDefaultFree((nodetofree?.value ?: 0L))
}

public actual fun ndrRpcSsDisableAllocate(pmessage: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrRpcSsDisableAllocate((pmessage?.value ?: 0L))
}

public actual fun ndrRpcSsEnableAllocate(pmessage: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrRpcSsEnableAllocate((pmessage?.value ?: 0L))
}

public actual fun ndrSendReceive(pstubmsg: COpaquePointer?, pbufferend: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrSendReceive((pstubmsg?.value ?: 0L), (pbufferend?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrServerCall2(prpcmsg: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrServerCall2((prpcmsg?.value ?: 0L))
}

public actual fun ndrServerCallAll(prpcmsg: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrServerCallAll((prpcmsg?.value ?: 0L))
}

public actual fun ndrServerCallNdr64(prpcmsg: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrServerCallNdr64((prpcmsg?.value ?: 0L))
}

public actual fun ndrServerContextMarshall(pstubmsg: COpaquePointer?, contexthandle: COpaquePointer?, rundownroutine: NdrRundown) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrServerContextMarshall((pstubmsg?.value ?: 0L), (contexthandle?.value ?: 0L), 0L)
}

public actual fun ndrServerContextNewMarshall(pstubmsg: COpaquePointer?, contexthandle: COpaquePointer?, rundownroutine: NdrRundown, pformat: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrServerContextNewMarshall((pstubmsg?.value ?: 0L), (contexthandle?.value ?: 0L), 0L, (pformat?.value ?: 0L))
}

public actual fun ndrServerContextNewUnmarshall(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrServerContextNewUnmarshall((pstubmsg?.value ?: 0L), (pformat?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrServerContextUnmarshall(pstubmsg: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrServerContextUnmarshall((pstubmsg?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrServerInitialize(prpcmsg: COpaquePointer?, pstubmsg: COpaquePointer?, pstubdescriptor: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrServerInitialize((prpcmsg?.value ?: 0L), (pstubmsg?.value ?: 0L), (pstubdescriptor?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrServerInitializeMarshall(prpcmsg: COpaquePointer?, pstubmsg: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrServerInitializeMarshall((prpcmsg?.value ?: 0L), (pstubmsg?.value ?: 0L))
}

public actual fun ndrServerInitializeNew(prpcmsg: COpaquePointer?, pstubmsg: COpaquePointer?, pstubdescriptor: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrServerInitializeNew((prpcmsg?.value ?: 0L), (pstubmsg?.value ?: 0L), (pstubdescriptor?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrServerInitializePartial(prpcmsg: COpaquePointer?, pstubmsg: COpaquePointer?, pstubdescriptor: COpaquePointer?, requestedbuffersize: UInt) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrServerInitializePartial((prpcmsg?.value ?: 0L), (pstubmsg?.value ?: 0L), (pstubdescriptor?.value ?: 0L), requestedbuffersize.toInt())
}

public actual fun ndrServerInitializeUnmarshall(pstubmsg: COpaquePointer?, pstubdescriptor: COpaquePointer?, prpcmsg: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrServerInitializeUnmarshall((pstubmsg?.value ?: 0L), (pstubdescriptor?.value ?: 0L), (prpcmsg?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrSimpleStructBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrSimpleStructBufferSize((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L))
}

public actual fun ndrSimpleStructFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrSimpleStructFree((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L))
}

public actual fun ndrSimpleStructMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrSimpleStructMarshall((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrSimpleStructMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrSimpleStructMemorySize((pstubmsg?.value ?: 0L), (pformat?.value ?: 0L)).toUInt()

public actual fun ndrSimpleStructUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrSimpleStructUnmarshall((pstubmsg?.value ?: 0L), (ppmemory?.value ?: 0L), (pformat?.value ?: 0L), fmustalloc.toByte()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrSimpleTypeMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, formatchar: UByte) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrSimpleTypeMarshall((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), formatchar.toByte())
}

public actual fun ndrSimpleTypeUnmarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, formatchar: UByte) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrSimpleTypeUnmarshall((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), formatchar.toByte())
}

public actual fun ndrStubCall2(pthis: COpaquePointer?, pchannel: COpaquePointer?, prpcmsg: COpaquePointer?, pdwstubphase: COpaquePointer?): Int =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrStubCall2((pthis?.value ?: 0L), (pchannel?.value ?: 0L), (prpcmsg?.value ?: 0L), (pdwstubphase?.value ?: 0L))

public actual fun ndrStubCall3(pthis: COpaquePointer?, pchannel: COpaquePointer?, prpcmsg: COpaquePointer?, pdwstubphase: COpaquePointer?): Int =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrStubCall3((pthis?.value ?: 0L), (pchannel?.value ?: 0L), (prpcmsg?.value ?: 0L), (pdwstubphase?.value ?: 0L))

public actual fun ndrUserMarshalBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrUserMarshalBufferSize((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L))
}

public actual fun ndrUserMarshalFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrUserMarshalFree((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L))
}

public actual fun ndrUserMarshalMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrUserMarshalMarshall((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrUserMarshalMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrUserMarshalMemorySize((pstubmsg?.value ?: 0L), (pformat?.value ?: 0L)).toUInt()

public actual fun ndrUserMarshalSimpleTypeConvert(pflags: COpaquePointer?, pbuffer: COpaquePointer?, formatchar: UByte): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrUserMarshalSimpleTypeConvert((pflags?.value ?: 0L), (pbuffer?.value ?: 0L), formatchar.toByte()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrUserMarshalUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrUserMarshalUnmarshall((pstubmsg?.value ?: 0L), (ppmemory?.value ?: 0L), (pformat?.value ?: 0L), fmustalloc.toByte()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrVaryingArrayBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrVaryingArrayBufferSize((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L))
}

public actual fun ndrVaryingArrayFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrVaryingArrayFree((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L))
}

public actual fun ndrVaryingArrayMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrVaryingArrayMarshall((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrVaryingArrayMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrVaryingArrayMemorySize((pstubmsg?.value ?: 0L), (pformat?.value ?: 0L)).toUInt()

public actual fun ndrVaryingArrayUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrVaryingArrayUnmarshall((pstubmsg?.value ?: 0L), (ppmemory?.value ?: 0L), (pformat?.value ?: 0L), fmustalloc.toByte()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrXmitOrRepAsBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrXmitOrRepAsBufferSize((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L))
}

public actual fun ndrXmitOrRepAsFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrXmitOrRepAsFree((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L))
}

public actual fun ndrXmitOrRepAsMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrXmitOrRepAsMarshall((pstubmsg?.value ?: 0L), (pmemory?.value ?: 0L), (pformat?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndrXmitOrRepAsMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrXmitOrRepAsMemorySize((pstubmsg?.value ?: 0L), (pformat?.value ?: 0L)).toUInt()

public actual fun ndrXmitOrRepAsUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_ndrXmitOrRepAsUnmarshall((pstubmsg?.value ?: 0L), (ppmemory?.value ?: 0L), (pformat?.value ?: 0L), fmustalloc.toByte()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rpcAsyncAbortCall(pasync: COpaquePointer?, exceptioncode: UInt): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcAsyncAbortCall((pasync?.value ?: 0L), exceptioncode.toInt())

public actual fun rpcAsyncCancelCall(pasync: COpaquePointer?, fabort: Bool): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcAsyncCancelCall((pasync?.value ?: 0L), fabort)

public actual fun rpcAsyncCompleteCall(pasync: COpaquePointer?, reply: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcAsyncCompleteCall((pasync?.value ?: 0L), (reply?.value ?: 0L))

public actual fun rpcAsyncGetCallStatus(pasync: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcAsyncGetCallStatus((pasync?.value ?: 0L))

public actual fun rpcAsyncInitializeHandle(pasync: COpaquePointer?, size: UInt): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcAsyncInitializeHandle((pasync?.value ?: 0L), size.toInt())

public actual fun rpcAsyncRegisterInfo(pasync: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcAsyncRegisterInfo((pasync?.value ?: 0L))

public actual fun rpcBindingBind(pasync: COpaquePointer?, binding: COpaquePointer?, ifspec: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcBindingBind((pasync?.value ?: 0L), (binding?.value ?: 0L), (ifspec?.value ?: 0L))

public actual fun rpcBindingCopy(sourcebinding: COpaquePointer?, destinationbinding: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcBindingCopy((sourcebinding?.value ?: 0L), (destinationbinding?.value ?: 0L))

public actual fun rpcBindingCreateA(template: COpaquePointer?, security: COpaquePointer?, options: COpaquePointer?, binding: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcBindingCreateA((template?.value ?: 0L), (security?.value ?: 0L), (options?.value ?: 0L), (binding?.value ?: 0L))

public actual fun rpcBindingCreateW(template: COpaquePointer?, security: COpaquePointer?, options: COpaquePointer?, binding: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcBindingCreateW((template?.value ?: 0L), (security?.value ?: 0L), (options?.value ?: 0L), (binding?.value ?: 0L))

public actual fun rpcBindingFree(binding: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcBindingFree((binding?.value ?: 0L))

public actual fun rpcBindingFromStringBindingA(stringbinding: Pcstr, binding: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcBindingFromStringBindingA((stringbinding?.value ?: 0L), (binding?.value ?: 0L))

public actual fun rpcBindingFromStringBindingW(stringbinding: Pcwstr, binding: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcBindingFromStringBindingW((stringbinding?.value ?: 0L), (binding?.value ?: 0L))

public actual fun rpcBindingInqAuthClientA(clientbinding: COpaquePointer?, privs: COpaquePointer?, serverprincname: COpaquePointer?, authnlevel: COpaquePointer?, authnsvc: COpaquePointer?, authzsvc: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcBindingInqAuthClientA((clientbinding?.value ?: 0L), (privs?.value ?: 0L), (serverprincname?.value ?: 0L), (authnlevel?.value ?: 0L), (authnsvc?.value ?: 0L), (authzsvc?.value ?: 0L))

public actual fun rpcBindingInqAuthClientExA(clientbinding: COpaquePointer?, privs: COpaquePointer?, serverprincname: COpaquePointer?, authnlevel: COpaquePointer?, authnsvc: COpaquePointer?, authzsvc: COpaquePointer?, flags: UInt): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcBindingInqAuthClientExA((clientbinding?.value ?: 0L), (privs?.value ?: 0L), (serverprincname?.value ?: 0L), (authnlevel?.value ?: 0L), (authnsvc?.value ?: 0L), (authzsvc?.value ?: 0L), flags.toInt())

public actual fun rpcBindingInqAuthClientExW(clientbinding: COpaquePointer?, privs: COpaquePointer?, serverprincname: COpaquePointer?, authnlevel: COpaquePointer?, authnsvc: COpaquePointer?, authzsvc: COpaquePointer?, flags: UInt): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcBindingInqAuthClientExW((clientbinding?.value ?: 0L), (privs?.value ?: 0L), (serverprincname?.value ?: 0L), (authnlevel?.value ?: 0L), (authnsvc?.value ?: 0L), (authzsvc?.value ?: 0L), flags.toInt())

public actual fun rpcBindingInqAuthClientW(clientbinding: COpaquePointer?, privs: COpaquePointer?, serverprincname: COpaquePointer?, authnlevel: COpaquePointer?, authnsvc: COpaquePointer?, authzsvc: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcBindingInqAuthClientW((clientbinding?.value ?: 0L), (privs?.value ?: 0L), (serverprincname?.value ?: 0L), (authnlevel?.value ?: 0L), (authnsvc?.value ?: 0L), (authzsvc?.value ?: 0L))

public actual fun rpcBindingInqAuthInfoA(binding: COpaquePointer?, serverprincname: COpaquePointer?, authnlevel: COpaquePointer?, authnsvc: COpaquePointer?, authidentity: COpaquePointer?, authzsvc: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcBindingInqAuthInfoA((binding?.value ?: 0L), (serverprincname?.value ?: 0L), (authnlevel?.value ?: 0L), (authnsvc?.value ?: 0L), (authidentity?.value ?: 0L), (authzsvc?.value ?: 0L))

public actual fun rpcBindingInqAuthInfoExA(binding: COpaquePointer?, serverprincname: COpaquePointer?, authnlevel: COpaquePointer?, authnsvc: COpaquePointer?, authidentity: COpaquePointer?, authzsvc: COpaquePointer?, rpcqosversion: UInt, securityqos: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcBindingInqAuthInfoExA((binding?.value ?: 0L), (serverprincname?.value ?: 0L), (authnlevel?.value ?: 0L), (authnsvc?.value ?: 0L), (authidentity?.value ?: 0L), (authzsvc?.value ?: 0L), rpcqosversion.toInt(), (securityqos?.value ?: 0L))

public actual fun rpcBindingInqAuthInfoExW(binding: COpaquePointer?, serverprincname: COpaquePointer?, authnlevel: COpaquePointer?, authnsvc: COpaquePointer?, authidentity: COpaquePointer?, authzsvc: COpaquePointer?, rpcqosversion: UInt, securityqos: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcBindingInqAuthInfoExW((binding?.value ?: 0L), (serverprincname?.value ?: 0L), (authnlevel?.value ?: 0L), (authnsvc?.value ?: 0L), (authidentity?.value ?: 0L), (authzsvc?.value ?: 0L), rpcqosversion.toInt(), (securityqos?.value ?: 0L))

public actual fun rpcBindingInqAuthInfoW(binding: COpaquePointer?, serverprincname: COpaquePointer?, authnlevel: COpaquePointer?, authnsvc: COpaquePointer?, authidentity: COpaquePointer?, authzsvc: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcBindingInqAuthInfoW((binding?.value ?: 0L), (serverprincname?.value ?: 0L), (authnlevel?.value ?: 0L), (authnsvc?.value ?: 0L), (authidentity?.value ?: 0L), (authzsvc?.value ?: 0L))

public actual fun rpcBindingInqMaxCalls(binding: COpaquePointer?, maxcalls: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcBindingInqMaxCalls((binding?.value ?: 0L), (maxcalls?.value ?: 0L))

public actual fun rpcBindingInqObject(binding: COpaquePointer?, objectuuid: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcBindingInqObject((binding?.value ?: 0L), (objectuuid?.value ?: 0L))

public actual fun rpcBindingInqOption(hbinding: COpaquePointer?, option: UInt, poptionvalue: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcBindingInqOption((hbinding?.value ?: 0L), option.toInt(), (poptionvalue?.value ?: 0L))

public actual fun rpcBindingReset(binding: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcBindingReset((binding?.value ?: 0L))

public actual fun rpcBindingServerFromClient(clientbinding: COpaquePointer?, serverbinding: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcBindingServerFromClient((clientbinding?.value ?: 0L), (serverbinding?.value ?: 0L))

public actual fun rpcBindingSetAuthInfoA(binding: COpaquePointer?, serverprincname: Pcstr, authnlevel: UInt, authnsvc: UInt, authidentity: COpaquePointer?, authzsvc: UInt): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcBindingSetAuthInfoA((binding?.value ?: 0L), (serverprincname?.value ?: 0L), authnlevel.toInt(), authnsvc.toInt(), (authidentity?.value ?: 0L), authzsvc.toInt())

public actual fun rpcBindingSetAuthInfoExA(binding: COpaquePointer?, serverprincname: Pcstr, authnlevel: UInt, authnsvc: UInt, authidentity: COpaquePointer?, authzsvc: UInt, securityqos: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcBindingSetAuthInfoExA((binding?.value ?: 0L), (serverprincname?.value ?: 0L), authnlevel.toInt(), authnsvc.toInt(), (authidentity?.value ?: 0L), authzsvc.toInt(), (securityqos?.value ?: 0L))

public actual fun rpcBindingSetAuthInfoExW(binding: COpaquePointer?, serverprincname: Pcwstr, authnlevel: UInt, authnsvc: UInt, authidentity: COpaquePointer?, authzsvc: UInt, securityqos: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcBindingSetAuthInfoExW((binding?.value ?: 0L), (serverprincname?.value ?: 0L), authnlevel.toInt(), authnsvc.toInt(), (authidentity?.value ?: 0L), authzsvc.toInt(), (securityqos?.value ?: 0L))

public actual fun rpcBindingSetAuthInfoW(binding: COpaquePointer?, serverprincname: Pcwstr, authnlevel: UInt, authnsvc: UInt, authidentity: COpaquePointer?, authzsvc: UInt): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcBindingSetAuthInfoW((binding?.value ?: 0L), (serverprincname?.value ?: 0L), authnlevel.toInt(), authnsvc.toInt(), (authidentity?.value ?: 0L), authzsvc.toInt())

public actual fun rpcBindingSetObject(binding: COpaquePointer?, objectuuid: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcBindingSetObject((binding?.value ?: 0L), (objectuuid?.value ?: 0L))

public actual fun rpcBindingSetOption(hbinding: COpaquePointer?, option: UInt, optionvalue: ULong): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcBindingSetOption((hbinding?.value ?: 0L), option.toInt(), optionvalue.toLong())

public actual fun rpcBindingToStringBindingA(binding: COpaquePointer?, stringbinding: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcBindingToStringBindingA((binding?.value ?: 0L), (stringbinding?.value ?: 0L))

public actual fun rpcBindingToStringBindingW(binding: COpaquePointer?, stringbinding: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcBindingToStringBindingW((binding?.value ?: 0L), (stringbinding?.value ?: 0L))

public actual fun rpcBindingUnbind(binding: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcBindingUnbind((binding?.value ?: 0L))

public actual fun rpcBindingVectorFree(bindingvector: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcBindingVectorFree((bindingvector?.value ?: 0L))

public actual fun rpcCancelThread(thread: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcCancelThread((thread?.value ?: 0L))

public actual fun rpcCancelThreadEx(thread: COpaquePointer?, timeout: Int): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcCancelThreadEx((thread?.value ?: 0L), timeout)

public actual fun rpcCertGeneratePrincipalNameA(context: COpaquePointer?, flags: UInt, pbuffer: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcCertGeneratePrincipalNameA((context?.value ?: 0L), flags.toInt(), (pbuffer?.value ?: 0L))

public actual fun rpcCertGeneratePrincipalNameW(context: COpaquePointer?, flags: UInt, pbuffer: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcCertGeneratePrincipalNameW((context?.value ?: 0L), flags.toInt(), (pbuffer?.value ?: 0L))

public actual fun rpcEpRegisterA(ifspec: COpaquePointer?, bindingvector: COpaquePointer?, uuidvector: COpaquePointer?, annotation: Pcstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcEpRegisterA((ifspec?.value ?: 0L), (bindingvector?.value ?: 0L), (uuidvector?.value ?: 0L), (annotation?.value ?: 0L))

public actual fun rpcEpRegisterNoReplaceA(ifspec: COpaquePointer?, bindingvector: COpaquePointer?, uuidvector: COpaquePointer?, annotation: Pcstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcEpRegisterNoReplaceA((ifspec?.value ?: 0L), (bindingvector?.value ?: 0L), (uuidvector?.value ?: 0L), (annotation?.value ?: 0L))

public actual fun rpcEpRegisterNoReplaceW(ifspec: COpaquePointer?, bindingvector: COpaquePointer?, uuidvector: COpaquePointer?, annotation: Pcwstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcEpRegisterNoReplaceW((ifspec?.value ?: 0L), (bindingvector?.value ?: 0L), (uuidvector?.value ?: 0L), (annotation?.value ?: 0L))

public actual fun rpcEpRegisterW(ifspec: COpaquePointer?, bindingvector: COpaquePointer?, uuidvector: COpaquePointer?, annotation: Pcwstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcEpRegisterW((ifspec?.value ?: 0L), (bindingvector?.value ?: 0L), (uuidvector?.value ?: 0L), (annotation?.value ?: 0L))

public actual fun rpcEpResolveBinding(binding: COpaquePointer?, ifspec: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcEpResolveBinding((binding?.value ?: 0L), (ifspec?.value ?: 0L))

public actual fun rpcEpUnregister(ifspec: COpaquePointer?, bindingvector: COpaquePointer?, uuidvector: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcEpUnregister((ifspec?.value ?: 0L), (bindingvector?.value ?: 0L), (uuidvector?.value ?: 0L))

public actual fun rpcErrorAddRecord(errorinfo: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcErrorAddRecord((errorinfo?.value ?: 0L))

public actual fun rpcErrorClearInformation() {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcErrorClearInformation()
}

public actual fun rpcErrorEndEnumeration(enumhandle: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcErrorEndEnumeration((enumhandle?.value ?: 0L))

public actual fun rpcErrorGetNextRecord(enumhandle: COpaquePointer?, copystrings: Bool, errorinfo: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcErrorGetNextRecord((enumhandle?.value ?: 0L), copystrings, (errorinfo?.value ?: 0L))

public actual fun rpcErrorGetNumberOfRecords(enumhandle: COpaquePointer?, records: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcErrorGetNumberOfRecords((enumhandle?.value ?: 0L), (records?.value ?: 0L))

public actual fun rpcErrorLoadErrorInfo(errorblob: COpaquePointer?, blobsize: ULong, enumhandle: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcErrorLoadErrorInfo((errorblob?.value ?: 0L), blobsize.toLong(), (enumhandle?.value ?: 0L))

public actual fun rpcErrorResetEnumeration(enumhandle: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcErrorResetEnumeration((enumhandle?.value ?: 0L))

public actual fun rpcErrorSaveErrorInfo(enumhandle: COpaquePointer?, errorblob: COpaquePointer?, blobsize: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcErrorSaveErrorInfo((enumhandle?.value ?: 0L), (errorblob?.value ?: 0L), (blobsize?.value ?: 0L))

public actual fun rpcErrorStartEnumeration(enumhandle: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcErrorStartEnumeration((enumhandle?.value ?: 0L))

public actual fun rpcExceptionFilter(exceptioncode: UInt): Int =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcExceptionFilter(exceptioncode.toInt())

public actual fun rpcFreeAuthorizationContext(pauthzclientcontext: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcFreeAuthorizationContext((pauthzclientcontext?.value ?: 0L))

public actual fun rpcGetAuthorizationContextForClient(clientbinding: COpaquePointer?, impersonateonreturn: Bool, reserved1: COpaquePointer?, pexpirationtime: COpaquePointer?, reserved2: Luid, reserved3: UInt, reserved4: COpaquePointer?, pauthzclientcontext: COpaquePointer?): RpcStatus =
    0

public actual fun rpcIfIdVectorFree(ifidvector: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcIfIdVectorFree((ifidvector?.value ?: 0L))

public actual fun rpcIfInqId(rpcifhandle: COpaquePointer?, rpcifid: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcIfInqId((rpcifhandle?.value ?: 0L), (rpcifid?.value ?: 0L))

public actual fun rpcImpersonateClient(bindinghandle: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcImpersonateClient((bindinghandle?.value ?: 0L))

public actual fun rpcImpersonateClient2(bindinghandle: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcImpersonateClient2((bindinghandle?.value ?: 0L))

public actual fun rpcImpersonateClientContainer(bindinghandle: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcImpersonateClientContainer((bindinghandle?.value ?: 0L))

public actual fun rpcMgmtEnableIdleCleanup(): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcMgmtEnableIdleCleanup()

public actual fun rpcMgmtEpEltInqBegin(epbinding: COpaquePointer?, inquirytype: UInt, ifid: COpaquePointer?, versoption: UInt, objectuuid: COpaquePointer?, inquirycontext: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcMgmtEpEltInqBegin((epbinding?.value ?: 0L), inquirytype.toInt(), (ifid?.value ?: 0L), versoption.toInt(), (objectuuid?.value ?: 0L), (inquirycontext?.value ?: 0L))

public actual fun rpcMgmtEpEltInqDone(inquirycontext: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcMgmtEpEltInqDone((inquirycontext?.value ?: 0L))

public actual fun rpcMgmtEpEltInqNextA(inquirycontext: COpaquePointer?, ifid: COpaquePointer?, binding: COpaquePointer?, objectuuid: COpaquePointer?, annotation: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcMgmtEpEltInqNextA((inquirycontext?.value ?: 0L), (ifid?.value ?: 0L), (binding?.value ?: 0L), (objectuuid?.value ?: 0L), (annotation?.value ?: 0L))

public actual fun rpcMgmtEpEltInqNextW(inquirycontext: COpaquePointer?, ifid: COpaquePointer?, binding: COpaquePointer?, objectuuid: COpaquePointer?, annotation: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcMgmtEpEltInqNextW((inquirycontext?.value ?: 0L), (ifid?.value ?: 0L), (binding?.value ?: 0L), (objectuuid?.value ?: 0L), (annotation?.value ?: 0L))

public actual fun rpcMgmtEpUnregister(epbinding: COpaquePointer?, ifid: COpaquePointer?, binding: COpaquePointer?, objectuuid: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcMgmtEpUnregister((epbinding?.value ?: 0L), (ifid?.value ?: 0L), (binding?.value ?: 0L), (objectuuid?.value ?: 0L))

public actual fun rpcMgmtInqComTimeout(binding: COpaquePointer?, timeout: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcMgmtInqComTimeout((binding?.value ?: 0L), (timeout?.value ?: 0L))

public actual fun rpcMgmtInqDefaultProtectLevel(authnsvc: UInt, authnlevel: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcMgmtInqDefaultProtectLevel(authnsvc.toInt(), (authnlevel?.value ?: 0L))

public actual fun rpcMgmtInqIfIds(binding: COpaquePointer?, ifidvector: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcMgmtInqIfIds((binding?.value ?: 0L), (ifidvector?.value ?: 0L))

public actual fun rpcMgmtInqServerPrincNameA(binding: COpaquePointer?, authnsvc: UInt, serverprincname: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcMgmtInqServerPrincNameA((binding?.value ?: 0L), authnsvc.toInt(), (serverprincname?.value ?: 0L))

public actual fun rpcMgmtInqServerPrincNameW(binding: COpaquePointer?, authnsvc: UInt, serverprincname: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcMgmtInqServerPrincNameW((binding?.value ?: 0L), authnsvc.toInt(), (serverprincname?.value ?: 0L))

public actual fun rpcMgmtInqStats(binding: COpaquePointer?, statistics: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcMgmtInqStats((binding?.value ?: 0L), (statistics?.value ?: 0L))

public actual fun rpcMgmtIsServerListening(binding: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcMgmtIsServerListening((binding?.value ?: 0L))

public actual fun rpcMgmtSetAuthorizationFn(authorizationfn: RpcMgmtAuthorizationFn): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcMgmtSetAuthorizationFn(0L)

public actual fun rpcMgmtSetCancelTimeout(timeout: Int): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcMgmtSetCancelTimeout(timeout)

public actual fun rpcMgmtSetComTimeout(binding: COpaquePointer?, timeout: UInt): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcMgmtSetComTimeout((binding?.value ?: 0L), timeout.toInt())

public actual fun rpcMgmtSetServerStackSize(threadstacksize: UInt): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcMgmtSetServerStackSize(threadstacksize.toInt())

public actual fun rpcMgmtStatsVectorFree(statsvector: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcMgmtStatsVectorFree((statsvector?.value ?: 0L))

public actual fun rpcMgmtStopServerListening(binding: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcMgmtStopServerListening((binding?.value ?: 0L))

public actual fun rpcMgmtWaitServerListen(): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcMgmtWaitServerListen()

public actual fun rpcNetworkInqProtseqsA(protseqvector: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNetworkInqProtseqsA((protseqvector?.value ?: 0L))

public actual fun rpcNetworkInqProtseqsW(protseqvector: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNetworkInqProtseqsW((protseqvector?.value ?: 0L))

public actual fun rpcNetworkIsProtseqValidA(protseq: Pcstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNetworkIsProtseqValidA((protseq?.value ?: 0L))

public actual fun rpcNetworkIsProtseqValidW(protseq: Pcwstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNetworkIsProtseqValidW((protseq?.value ?: 0L))

public actual fun rpcNsBindingExportA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: COpaquePointer?, bindingvec: COpaquePointer?, objectuuidvec: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsBindingExportA(entrynamesyntax.toInt(), (entryname?.value ?: 0L), (ifspec?.value ?: 0L), (bindingvec?.value ?: 0L), (objectuuidvec?.value ?: 0L))

public actual fun rpcNsBindingExportPnPA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: COpaquePointer?, objectvector: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsBindingExportPnPA(entrynamesyntax.toInt(), (entryname?.value ?: 0L), (ifspec?.value ?: 0L), (objectvector?.value ?: 0L))

public actual fun rpcNsBindingExportPnPW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: COpaquePointer?, objectvector: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsBindingExportPnPW(entrynamesyntax.toInt(), (entryname?.value ?: 0L), (ifspec?.value ?: 0L), (objectvector?.value ?: 0L))

public actual fun rpcNsBindingExportW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: COpaquePointer?, bindingvec: COpaquePointer?, objectuuidvec: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsBindingExportW(entrynamesyntax.toInt(), (entryname?.value ?: 0L), (ifspec?.value ?: 0L), (bindingvec?.value ?: 0L), (objectuuidvec?.value ?: 0L))

public actual fun rpcNsBindingImportBeginA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: COpaquePointer?, objuuid: COpaquePointer?, importcontext: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsBindingImportBeginA(entrynamesyntax.toInt(), (entryname?.value ?: 0L), (ifspec?.value ?: 0L), (objuuid?.value ?: 0L), (importcontext?.value ?: 0L))

public actual fun rpcNsBindingImportBeginW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: COpaquePointer?, objuuid: COpaquePointer?, importcontext: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsBindingImportBeginW(entrynamesyntax.toInt(), (entryname?.value ?: 0L), (ifspec?.value ?: 0L), (objuuid?.value ?: 0L), (importcontext?.value ?: 0L))

public actual fun rpcNsBindingImportDone(importcontext: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsBindingImportDone((importcontext?.value ?: 0L))

public actual fun rpcNsBindingImportNext(importcontext: COpaquePointer?, binding: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsBindingImportNext((importcontext?.value ?: 0L), (binding?.value ?: 0L))

public actual fun rpcNsBindingInqEntryNameA(binding: COpaquePointer?, entrynamesyntax: UInt, entryname: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsBindingInqEntryNameA((binding?.value ?: 0L), entrynamesyntax.toInt(), (entryname?.value ?: 0L))

public actual fun rpcNsBindingInqEntryNameW(binding: COpaquePointer?, entrynamesyntax: UInt, entryname: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsBindingInqEntryNameW((binding?.value ?: 0L), entrynamesyntax.toInt(), (entryname?.value ?: 0L))

public actual fun rpcNsBindingLookupBeginA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: COpaquePointer?, objuuid: COpaquePointer?, bindingmaxcount: UInt, lookupcontext: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsBindingLookupBeginA(entrynamesyntax.toInt(), (entryname?.value ?: 0L), (ifspec?.value ?: 0L), (objuuid?.value ?: 0L), bindingmaxcount.toInt(), (lookupcontext?.value ?: 0L))

public actual fun rpcNsBindingLookupBeginW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: COpaquePointer?, objuuid: COpaquePointer?, bindingmaxcount: UInt, lookupcontext: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsBindingLookupBeginW(entrynamesyntax.toInt(), (entryname?.value ?: 0L), (ifspec?.value ?: 0L), (objuuid?.value ?: 0L), bindingmaxcount.toInt(), (lookupcontext?.value ?: 0L))

public actual fun rpcNsBindingLookupDone(lookupcontext: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsBindingLookupDone((lookupcontext?.value ?: 0L))

public actual fun rpcNsBindingLookupNext(lookupcontext: COpaquePointer?, bindingvec: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsBindingLookupNext((lookupcontext?.value ?: 0L), (bindingvec?.value ?: 0L))

public actual fun rpcNsBindingSelect(bindingvec: COpaquePointer?, binding: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsBindingSelect((bindingvec?.value ?: 0L), (binding?.value ?: 0L))

public actual fun rpcNsBindingUnexportA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: COpaquePointer?, objectuuidvec: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsBindingUnexportA(entrynamesyntax.toInt(), (entryname?.value ?: 0L), (ifspec?.value ?: 0L), (objectuuidvec?.value ?: 0L))

public actual fun rpcNsBindingUnexportPnPA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: COpaquePointer?, objectvector: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsBindingUnexportPnPA(entrynamesyntax.toInt(), (entryname?.value ?: 0L), (ifspec?.value ?: 0L), (objectvector?.value ?: 0L))

public actual fun rpcNsBindingUnexportPnPW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: COpaquePointer?, objectvector: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsBindingUnexportPnPW(entrynamesyntax.toInt(), (entryname?.value ?: 0L), (ifspec?.value ?: 0L), (objectvector?.value ?: 0L))

public actual fun rpcNsBindingUnexportW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: COpaquePointer?, objectuuidvec: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsBindingUnexportW(entrynamesyntax.toInt(), (entryname?.value ?: 0L), (ifspec?.value ?: 0L), (objectuuidvec?.value ?: 0L))

public actual fun rpcNsEntryExpandNameA(entrynamesyntax: UInt, entryname: Pcstr, expandedname: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsEntryExpandNameA(entrynamesyntax.toInt(), (entryname?.value ?: 0L), (expandedname?.value ?: 0L))

public actual fun rpcNsEntryExpandNameW(entrynamesyntax: UInt, entryname: Pcwstr, expandedname: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsEntryExpandNameW(entrynamesyntax.toInt(), (entryname?.value ?: 0L), (expandedname?.value ?: 0L))

public actual fun rpcNsEntryObjectInqBeginA(entrynamesyntax: UInt, entryname: Pcstr, inquirycontext: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsEntryObjectInqBeginA(entrynamesyntax.toInt(), (entryname?.value ?: 0L), (inquirycontext?.value ?: 0L))

public actual fun rpcNsEntryObjectInqBeginW(entrynamesyntax: UInt, entryname: Pcwstr, inquirycontext: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsEntryObjectInqBeginW(entrynamesyntax.toInt(), (entryname?.value ?: 0L), (inquirycontext?.value ?: 0L))

public actual fun rpcNsEntryObjectInqDone(inquirycontext: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsEntryObjectInqDone((inquirycontext?.value ?: 0L))

public actual fun rpcNsEntryObjectInqNext(inquirycontext: COpaquePointer?, objuuid: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsEntryObjectInqNext((inquirycontext?.value ?: 0L), (objuuid?.value ?: 0L))

public actual fun rpcNsGroupDeleteA(groupnamesyntax: GroupNameSyntax, groupname: Pcstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsGroupDeleteA(groupnamesyntax.toInt(), (groupname?.value ?: 0L))

public actual fun rpcNsGroupDeleteW(groupnamesyntax: GroupNameSyntax, groupname: Pcwstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsGroupDeleteW(groupnamesyntax.toInt(), (groupname?.value ?: 0L))

public actual fun rpcNsGroupMbrAddA(groupnamesyntax: UInt, groupname: Pcstr, membernamesyntax: UInt, membername: Pcstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsGroupMbrAddA(groupnamesyntax.toInt(), (groupname?.value ?: 0L), membernamesyntax.toInt(), (membername?.value ?: 0L))

public actual fun rpcNsGroupMbrAddW(groupnamesyntax: UInt, groupname: Pcwstr, membernamesyntax: UInt, membername: Pcwstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsGroupMbrAddW(groupnamesyntax.toInt(), (groupname?.value ?: 0L), membernamesyntax.toInt(), (membername?.value ?: 0L))

public actual fun rpcNsGroupMbrInqBeginA(groupnamesyntax: UInt, groupname: Pcstr, membernamesyntax: UInt, inquirycontext: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsGroupMbrInqBeginA(groupnamesyntax.toInt(), (groupname?.value ?: 0L), membernamesyntax.toInt(), (inquirycontext?.value ?: 0L))

public actual fun rpcNsGroupMbrInqBeginW(groupnamesyntax: UInt, groupname: Pcwstr, membernamesyntax: UInt, inquirycontext: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsGroupMbrInqBeginW(groupnamesyntax.toInt(), (groupname?.value ?: 0L), membernamesyntax.toInt(), (inquirycontext?.value ?: 0L))

public actual fun rpcNsGroupMbrInqDone(inquirycontext: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsGroupMbrInqDone((inquirycontext?.value ?: 0L))

public actual fun rpcNsGroupMbrInqNextA(inquirycontext: COpaquePointer?, membername: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsGroupMbrInqNextA((inquirycontext?.value ?: 0L), (membername?.value ?: 0L))

public actual fun rpcNsGroupMbrInqNextW(inquirycontext: COpaquePointer?, membername: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsGroupMbrInqNextW((inquirycontext?.value ?: 0L), (membername?.value ?: 0L))

public actual fun rpcNsGroupMbrRemoveA(groupnamesyntax: UInt, groupname: Pcstr, membernamesyntax: UInt, membername: Pcstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsGroupMbrRemoveA(groupnamesyntax.toInt(), (groupname?.value ?: 0L), membernamesyntax.toInt(), (membername?.value ?: 0L))

public actual fun rpcNsGroupMbrRemoveW(groupnamesyntax: UInt, groupname: Pcwstr, membernamesyntax: UInt, membername: Pcwstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsGroupMbrRemoveW(groupnamesyntax.toInt(), (groupname?.value ?: 0L), membernamesyntax.toInt(), (membername?.value ?: 0L))

public actual fun rpcNsMgmtBindingUnexportA(entrynamesyntax: UInt, entryname: Pcstr, ifid: COpaquePointer?, versoption: UInt, objectuuidvec: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsMgmtBindingUnexportA(entrynamesyntax.toInt(), (entryname?.value ?: 0L), (ifid?.value ?: 0L), versoption.toInt(), (objectuuidvec?.value ?: 0L))

public actual fun rpcNsMgmtBindingUnexportW(entrynamesyntax: UInt, entryname: Pcwstr, ifid: COpaquePointer?, versoption: UInt, objectuuidvec: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsMgmtBindingUnexportW(entrynamesyntax.toInt(), (entryname?.value ?: 0L), (ifid?.value ?: 0L), versoption.toInt(), (objectuuidvec?.value ?: 0L))

public actual fun rpcNsMgmtEntryCreateA(entrynamesyntax: UInt, entryname: Pcstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsMgmtEntryCreateA(entrynamesyntax.toInt(), (entryname?.value ?: 0L))

public actual fun rpcNsMgmtEntryCreateW(entrynamesyntax: UInt, entryname: Pcwstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsMgmtEntryCreateW(entrynamesyntax.toInt(), (entryname?.value ?: 0L))

public actual fun rpcNsMgmtEntryDeleteA(entrynamesyntax: UInt, entryname: Pcstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsMgmtEntryDeleteA(entrynamesyntax.toInt(), (entryname?.value ?: 0L))

public actual fun rpcNsMgmtEntryDeleteW(entrynamesyntax: UInt, entryname: Pcwstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsMgmtEntryDeleteW(entrynamesyntax.toInt(), (entryname?.value ?: 0L))

public actual fun rpcNsMgmtEntryInqIfIdsA(entrynamesyntax: UInt, entryname: Pcstr, ifidvec: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsMgmtEntryInqIfIdsA(entrynamesyntax.toInt(), (entryname?.value ?: 0L), (ifidvec?.value ?: 0L))

public actual fun rpcNsMgmtEntryInqIfIdsW(entrynamesyntax: UInt, entryname: Pcwstr, ifidvec: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsMgmtEntryInqIfIdsW(entrynamesyntax.toInt(), (entryname?.value ?: 0L), (ifidvec?.value ?: 0L))

public actual fun rpcNsMgmtHandleSetExpAge(nshandle: COpaquePointer?, expirationage: UInt): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsMgmtHandleSetExpAge((nshandle?.value ?: 0L), expirationage.toInt())

public actual fun rpcNsMgmtInqExpAge(expirationage: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsMgmtInqExpAge((expirationage?.value ?: 0L))

public actual fun rpcNsMgmtSetExpAge(expirationage: UInt): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsMgmtSetExpAge(expirationage.toInt())

public actual fun rpcNsProfileDeleteA(profilenamesyntax: UInt, profilename: Pcstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsProfileDeleteA(profilenamesyntax.toInt(), (profilename?.value ?: 0L))

public actual fun rpcNsProfileDeleteW(profilenamesyntax: UInt, profilename: Pcwstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsProfileDeleteW(profilenamesyntax.toInt(), (profilename?.value ?: 0L))

public actual fun rpcNsProfileEltAddA(profilenamesyntax: UInt, profilename: Pcstr, ifid: COpaquePointer?, membernamesyntax: UInt, membername: Pcstr, priority: UInt, annotation: Pcstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsProfileEltAddA(profilenamesyntax.toInt(), (profilename?.value ?: 0L), (ifid?.value ?: 0L), membernamesyntax.toInt(), (membername?.value ?: 0L), priority.toInt(), (annotation?.value ?: 0L))

public actual fun rpcNsProfileEltAddW(profilenamesyntax: UInt, profilename: Pcwstr, ifid: COpaquePointer?, membernamesyntax: UInt, membername: Pcwstr, priority: UInt, annotation: Pcwstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsProfileEltAddW(profilenamesyntax.toInt(), (profilename?.value ?: 0L), (ifid?.value ?: 0L), membernamesyntax.toInt(), (membername?.value ?: 0L), priority.toInt(), (annotation?.value ?: 0L))

public actual fun rpcNsProfileEltInqBeginA(profilenamesyntax: UInt, profilename: Pcstr, inquirytype: UInt, ifid: COpaquePointer?, versoption: UInt, membernamesyntax: UInt, membername: Pcstr, inquirycontext: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsProfileEltInqBeginA(profilenamesyntax.toInt(), (profilename?.value ?: 0L), inquirytype.toInt(), (ifid?.value ?: 0L), versoption.toInt(), membernamesyntax.toInt(), (membername?.value ?: 0L), (inquirycontext?.value ?: 0L))

public actual fun rpcNsProfileEltInqBeginW(profilenamesyntax: UInt, profilename: Pcwstr, inquirytype: UInt, ifid: COpaquePointer?, versoption: UInt, membernamesyntax: UInt, membername: Pcwstr, inquirycontext: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsProfileEltInqBeginW(profilenamesyntax.toInt(), (profilename?.value ?: 0L), inquirytype.toInt(), (ifid?.value ?: 0L), versoption.toInt(), membernamesyntax.toInt(), (membername?.value ?: 0L), (inquirycontext?.value ?: 0L))

public actual fun rpcNsProfileEltInqDone(inquirycontext: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsProfileEltInqDone((inquirycontext?.value ?: 0L))

public actual fun rpcNsProfileEltInqNextA(inquirycontext: COpaquePointer?, ifid: COpaquePointer?, membername: COpaquePointer?, priority: COpaquePointer?, annotation: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsProfileEltInqNextA((inquirycontext?.value ?: 0L), (ifid?.value ?: 0L), (membername?.value ?: 0L), (priority?.value ?: 0L), (annotation?.value ?: 0L))

public actual fun rpcNsProfileEltInqNextW(inquirycontext: COpaquePointer?, ifid: COpaquePointer?, membername: COpaquePointer?, priority: COpaquePointer?, annotation: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsProfileEltInqNextW((inquirycontext?.value ?: 0L), (ifid?.value ?: 0L), (membername?.value ?: 0L), (priority?.value ?: 0L), (annotation?.value ?: 0L))

public actual fun rpcNsProfileEltRemoveA(profilenamesyntax: UInt, profilename: Pcstr, ifid: COpaquePointer?, membernamesyntax: UInt, membername: Pcstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsProfileEltRemoveA(profilenamesyntax.toInt(), (profilename?.value ?: 0L), (ifid?.value ?: 0L), membernamesyntax.toInt(), (membername?.value ?: 0L))

public actual fun rpcNsProfileEltRemoveW(profilenamesyntax: UInt, profilename: Pcwstr, ifid: COpaquePointer?, membernamesyntax: UInt, membername: Pcwstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcNsProfileEltRemoveW(profilenamesyntax.toInt(), (profilename?.value ?: 0L), (ifid?.value ?: 0L), membernamesyntax.toInt(), (membername?.value ?: 0L))

public actual fun rpcObjectInqType(objuuid: COpaquePointer?, typeuuid: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcObjectInqType((objuuid?.value ?: 0L), (typeuuid?.value ?: 0L))

public actual fun rpcObjectSetInqFn(inquiryfn: RpcObjectInqFn): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcObjectSetInqFn(0L)

public actual fun rpcObjectSetType(objuuid: COpaquePointer?, typeuuid: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcObjectSetType((objuuid?.value ?: 0L), (typeuuid?.value ?: 0L))

public actual fun rpcProtseqVectorFreeA(protseqvector: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcProtseqVectorFreeA((protseqvector?.value ?: 0L))

public actual fun rpcProtseqVectorFreeW(protseqvector: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcProtseqVectorFreeW((protseqvector?.value ?: 0L))

public actual fun rpcRaiseException(exception: RpcStatus) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcRaiseException(exception)
}

public actual fun rpcRevertContainerImpersonation(): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcRevertContainerImpersonation()

public actual fun rpcRevertToSelf(): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcRevertToSelf()

public actual fun rpcRevertToSelfEx(bindinghandle: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcRevertToSelfEx((bindinghandle?.value ?: 0L))

public actual fun rpcServerCompleteSecurityCallback(bindinghandle: COpaquePointer?, status: RpcStatus): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcServerCompleteSecurityCallback((bindinghandle?.value ?: 0L), status)

public actual fun rpcServerInqBindingHandle(binding: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcServerInqBindingHandle((binding?.value ?: 0L))

public actual fun rpcServerInqBindings(bindingvector: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcServerInqBindings((bindingvector?.value ?: 0L))

public actual fun rpcServerInqBindingsEx(securitydescriptor: COpaquePointer?, bindingvector: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcServerInqBindingsEx((securitydescriptor?.value ?: 0L), (bindingvector?.value ?: 0L))

public actual fun rpcServerInqCallAttributesA(clientbinding: COpaquePointer?, rpccallattributes: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcServerInqCallAttributesA((clientbinding?.value ?: 0L), (rpccallattributes?.value ?: 0L))

public actual fun rpcServerInqCallAttributesW(clientbinding: COpaquePointer?, rpccallattributes: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcServerInqCallAttributesW((clientbinding?.value ?: 0L), (rpccallattributes?.value ?: 0L))

public actual fun rpcServerInqDefaultPrincNameA(authnsvc: UInt, princname: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcServerInqDefaultPrincNameA(authnsvc.toInt(), (princname?.value ?: 0L))

public actual fun rpcServerInqDefaultPrincNameW(authnsvc: UInt, princname: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcServerInqDefaultPrincNameW(authnsvc.toInt(), (princname?.value ?: 0L))

public actual fun rpcServerInqIf(ifspec: COpaquePointer?, mgrtypeuuid: COpaquePointer?, mgrepv: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcServerInqIf((ifspec?.value ?: 0L), (mgrtypeuuid?.value ?: 0L), (mgrepv?.value ?: 0L))

public actual fun rpcServerInterfaceGroupActivate(ifgroup: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcServerInterfaceGroupActivate((ifgroup?.value ?: 0L))

public actual fun rpcServerInterfaceGroupClose(ifgroup: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcServerInterfaceGroupClose((ifgroup?.value ?: 0L))

public actual fun rpcServerInterfaceGroupCreateA(interfaces: COpaquePointer?, numifs: UInt, endpoints: COpaquePointer?, numendpoints: UInt, idleperiod: UInt, idlecallbackfn: RpcInterfaceGroupIdleCallbackFn, idlecallbackcontext: COpaquePointer?, ifgroup: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcServerInterfaceGroupCreateA((interfaces?.value ?: 0L), numifs.toInt(), (endpoints?.value ?: 0L), numendpoints.toInt(), idleperiod.toInt(), 0L, (idlecallbackcontext?.value ?: 0L), (ifgroup?.value ?: 0L))

public actual fun rpcServerInterfaceGroupCreateW(interfaces: COpaquePointer?, numifs: UInt, endpoints: COpaquePointer?, numendpoints: UInt, idleperiod: UInt, idlecallbackfn: RpcInterfaceGroupIdleCallbackFn, idlecallbackcontext: COpaquePointer?, ifgroup: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcServerInterfaceGroupCreateW((interfaces?.value ?: 0L), numifs.toInt(), (endpoints?.value ?: 0L), numendpoints.toInt(), idleperiod.toInt(), 0L, (idlecallbackcontext?.value ?: 0L), (ifgroup?.value ?: 0L))

public actual fun rpcServerInterfaceGroupDeactivate(ifgroup: COpaquePointer?, forcedeactivation: UInt): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcServerInterfaceGroupDeactivate((ifgroup?.value ?: 0L), forcedeactivation.toInt())

public actual fun rpcServerInterfaceGroupInqBindings(ifgroup: COpaquePointer?, bindingvector: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcServerInterfaceGroupInqBindings((ifgroup?.value ?: 0L), (bindingvector?.value ?: 0L))

public actual fun rpcServerListen(minimumcallthreads: UInt, maxcalls: UInt, dontwait: UInt): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcServerListen(minimumcallthreads.toInt(), maxcalls.toInt(), dontwait.toInt())

public actual fun rpcServerRegisterAuthInfoA(serverprincname: Pcstr, authnsvc: UInt, getkeyfn: RpcAuthKeyRetrievalFn, arg: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcServerRegisterAuthInfoA((serverprincname?.value ?: 0L), authnsvc.toInt(), 0L, (arg?.value ?: 0L))

public actual fun rpcServerRegisterAuthInfoW(serverprincname: Pcwstr, authnsvc: UInt, getkeyfn: RpcAuthKeyRetrievalFn, arg: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcServerRegisterAuthInfoW((serverprincname?.value ?: 0L), authnsvc.toInt(), 0L, (arg?.value ?: 0L))

public actual fun rpcServerRegisterIf(ifspec: COpaquePointer?, mgrtypeuuid: COpaquePointer?, mgrepv: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcServerRegisterIf((ifspec?.value ?: 0L), (mgrtypeuuid?.value ?: 0L), (mgrepv?.value ?: 0L))

public actual fun rpcServerRegisterIf2(ifspec: COpaquePointer?, mgrtypeuuid: COpaquePointer?, mgrepv: COpaquePointer?, flags: UInt, maxcalls: UInt, maxrpcsize: UInt, ifcallbackfn: RpcIfCallbackFn): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcServerRegisterIf2((ifspec?.value ?: 0L), (mgrtypeuuid?.value ?: 0L), (mgrepv?.value ?: 0L), flags.toInt(), maxcalls.toInt(), maxrpcsize.toInt(), 0L)

public actual fun rpcServerRegisterIf3(ifspec: COpaquePointer?, mgrtypeuuid: COpaquePointer?, mgrepv: COpaquePointer?, flags: UInt, maxcalls: UInt, maxrpcsize: UInt, ifcallback: RpcIfCallbackFn, securitydescriptor: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcServerRegisterIf3((ifspec?.value ?: 0L), (mgrtypeuuid?.value ?: 0L), (mgrepv?.value ?: 0L), flags.toInt(), maxcalls.toInt(), maxrpcsize.toInt(), 0L, (securitydescriptor?.value ?: 0L))

public actual fun rpcServerRegisterIfEx(ifspec: COpaquePointer?, mgrtypeuuid: COpaquePointer?, mgrepv: COpaquePointer?, flags: UInt, maxcalls: UInt, ifcallback: RpcIfCallbackFn): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcServerRegisterIfEx((ifspec?.value ?: 0L), (mgrtypeuuid?.value ?: 0L), (mgrepv?.value ?: 0L), flags.toInt(), maxcalls.toInt(), 0L)

public actual fun rpcServerSubscribeForNotification(binding: COpaquePointer?, notification: RpcNotifications, notificationtype: RpcNotificationTypes, notificationinfo: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcServerSubscribeForNotification((binding?.value ?: 0L), notification, notificationtype, (notificationinfo?.value ?: 0L))

public actual fun rpcServerTestCancel(bindinghandle: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcServerTestCancel((bindinghandle?.value ?: 0L))

public actual fun rpcServerUnregisterIf(ifspec: COpaquePointer?, mgrtypeuuid: COpaquePointer?, waitforcallstocomplete: UInt): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcServerUnregisterIf((ifspec?.value ?: 0L), (mgrtypeuuid?.value ?: 0L), waitforcallstocomplete.toInt())

public actual fun rpcServerUnregisterIfEx(ifspec: COpaquePointer?, mgrtypeuuid: COpaquePointer?, rundowncontexthandles: Int): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcServerUnregisterIfEx((ifspec?.value ?: 0L), (mgrtypeuuid?.value ?: 0L), rundowncontexthandles)

public actual fun rpcServerUnsubscribeForNotification(binding: COpaquePointer?, notification: RpcNotifications, notificationsqueued: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcServerUnsubscribeForNotification((binding?.value ?: 0L), notification, (notificationsqueued?.value ?: 0L))

public actual fun rpcServerUseAllProtseqs(maxcalls: UInt, securitydescriptor: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcServerUseAllProtseqs(maxcalls.toInt(), (securitydescriptor?.value ?: 0L))

public actual fun rpcServerUseAllProtseqsEx(maxcalls: UInt, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcServerUseAllProtseqsEx(maxcalls.toInt(), (securitydescriptor?.value ?: 0L), (policy?.value ?: 0L))

public actual fun rpcServerUseAllProtseqsIf(maxcalls: UInt, ifspec: COpaquePointer?, securitydescriptor: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcServerUseAllProtseqsIf(maxcalls.toInt(), (ifspec?.value ?: 0L), (securitydescriptor?.value ?: 0L))

public actual fun rpcServerUseAllProtseqsIfEx(maxcalls: UInt, ifspec: COpaquePointer?, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcServerUseAllProtseqsIfEx(maxcalls.toInt(), (ifspec?.value ?: 0L), (securitydescriptor?.value ?: 0L), (policy?.value ?: 0L))

public actual fun rpcServerUseProtseqA(protseq: Pcstr, maxcalls: UInt, securitydescriptor: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcServerUseProtseqA((protseq?.value ?: 0L), maxcalls.toInt(), (securitydescriptor?.value ?: 0L))

public actual fun rpcServerUseProtseqEpA(protseq: Pcstr, maxcalls: UInt, endpoint: Pcstr, securitydescriptor: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcServerUseProtseqEpA((protseq?.value ?: 0L), maxcalls.toInt(), (endpoint?.value ?: 0L), (securitydescriptor?.value ?: 0L))

public actual fun rpcServerUseProtseqEpExA(protseq: Pcstr, maxcalls: UInt, endpoint: Pcstr, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcServerUseProtseqEpExA((protseq?.value ?: 0L), maxcalls.toInt(), (endpoint?.value ?: 0L), (securitydescriptor?.value ?: 0L), (policy?.value ?: 0L))

public actual fun rpcServerUseProtseqEpExW(protseq: Pcwstr, maxcalls: UInt, endpoint: Pcwstr, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcServerUseProtseqEpExW((protseq?.value ?: 0L), maxcalls.toInt(), (endpoint?.value ?: 0L), (securitydescriptor?.value ?: 0L), (policy?.value ?: 0L))

public actual fun rpcServerUseProtseqEpW(protseq: Pcwstr, maxcalls: UInt, endpoint: Pcwstr, securitydescriptor: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcServerUseProtseqEpW((protseq?.value ?: 0L), maxcalls.toInt(), (endpoint?.value ?: 0L), (securitydescriptor?.value ?: 0L))

public actual fun rpcServerUseProtseqExA(protseq: Pcstr, maxcalls: UInt, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcServerUseProtseqExA((protseq?.value ?: 0L), maxcalls.toInt(), (securitydescriptor?.value ?: 0L), (policy?.value ?: 0L))

public actual fun rpcServerUseProtseqExW(protseq: Pcwstr, maxcalls: UInt, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcServerUseProtseqExW((protseq?.value ?: 0L), maxcalls.toInt(), (securitydescriptor?.value ?: 0L), (policy?.value ?: 0L))

public actual fun rpcServerUseProtseqIfA(protseq: Pcstr, maxcalls: UInt, ifspec: COpaquePointer?, securitydescriptor: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcServerUseProtseqIfA((protseq?.value ?: 0L), maxcalls.toInt(), (ifspec?.value ?: 0L), (securitydescriptor?.value ?: 0L))

public actual fun rpcServerUseProtseqIfExA(protseq: Pcstr, maxcalls: UInt, ifspec: COpaquePointer?, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcServerUseProtseqIfExA((protseq?.value ?: 0L), maxcalls.toInt(), (ifspec?.value ?: 0L), (securitydescriptor?.value ?: 0L), (policy?.value ?: 0L))

public actual fun rpcServerUseProtseqIfExW(protseq: Pcwstr, maxcalls: UInt, ifspec: COpaquePointer?, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcServerUseProtseqIfExW((protseq?.value ?: 0L), maxcalls.toInt(), (ifspec?.value ?: 0L), (securitydescriptor?.value ?: 0L), (policy?.value ?: 0L))

public actual fun rpcServerUseProtseqIfW(protseq: Pcwstr, maxcalls: UInt, ifspec: COpaquePointer?, securitydescriptor: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcServerUseProtseqIfW((protseq?.value ?: 0L), maxcalls.toInt(), (ifspec?.value ?: 0L), (securitydescriptor?.value ?: 0L))

public actual fun rpcServerUseProtseqW(protseq: Pcwstr, maxcalls: UInt, securitydescriptor: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcServerUseProtseqW((protseq?.value ?: 0L), maxcalls.toInt(), (securitydescriptor?.value ?: 0L))

public actual fun rpcServerYield() {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcServerYield()
}

public actual fun rpcSmAllocate(size: ULong, pstatus: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcSmAllocate(size.toLong(), (pstatus?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rpcSmClientFree(pnodetofree: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcSmClientFree((pnodetofree?.value ?: 0L))

public actual fun rpcSmDestroyClientContext(contexthandle: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcSmDestroyClientContext((contexthandle?.value ?: 0L))

public actual fun rpcSmDisableAllocate(): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcSmDisableAllocate()

public actual fun rpcSmEnableAllocate(): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcSmEnableAllocate()

public actual fun rpcSmFree(nodetofree: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcSmFree((nodetofree?.value ?: 0L))

public actual fun rpcSmGetThreadHandle(pstatus: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcSmGetThreadHandle((pstatus?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rpcSmSetClientAllocFree(clientalloc: RpcClientAlloc, clientfree: RpcClientFree): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcSmSetClientAllocFree(0L, 0L)

public actual fun rpcSmSetThreadHandle(id: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcSmSetThreadHandle((id?.value ?: 0L))

public actual fun rpcSmSwapClientAllocFree(clientalloc: RpcClientAlloc, clientfree: RpcClientFree, oldclientalloc: COpaquePointer?, oldclientfree: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcSmSwapClientAllocFree(0L, 0L, (oldclientalloc?.value ?: 0L), (oldclientfree?.value ?: 0L))

public actual fun rpcSsAllocate(size: ULong): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcSsAllocate(size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rpcSsContextLockExclusive(serverbindinghandle: COpaquePointer?, usercontext: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcSsContextLockExclusive((serverbindinghandle?.value ?: 0L), (usercontext?.value ?: 0L))

public actual fun rpcSsContextLockShared(serverbindinghandle: COpaquePointer?, usercontext: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcSsContextLockShared((serverbindinghandle?.value ?: 0L), (usercontext?.value ?: 0L))

public actual fun rpcSsDestroyClientContext(contexthandle: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcSsDestroyClientContext((contexthandle?.value ?: 0L))
}

public actual fun rpcSsDisableAllocate() {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcSsDisableAllocate()
}

public actual fun rpcSsDontSerializeContext() {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcSsDontSerializeContext()
}

public actual fun rpcSsEnableAllocate() {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcSsEnableAllocate()
}

public actual fun rpcSsFree(nodetofree: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcSsFree((nodetofree?.value ?: 0L))
}

public actual fun rpcSsGetContextBinding(contexthandle: COpaquePointer?, binding: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcSsGetContextBinding((contexthandle?.value ?: 0L), (binding?.value ?: 0L))

public actual fun rpcSsGetThreadHandle(): COpaquePointer? =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcSsGetThreadHandle().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rpcSsSetClientAllocFree(clientalloc: RpcClientAlloc, clientfree: RpcClientFree) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcSsSetClientAllocFree(0L, 0L)
}

public actual fun rpcSsSetThreadHandle(id: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcSsSetThreadHandle((id?.value ?: 0L))
}

public actual fun rpcSsSwapClientAllocFree(clientalloc: RpcClientAlloc, clientfree: RpcClientFree, oldclientalloc: COpaquePointer?, oldclientfree: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcSsSwapClientAllocFree(0L, 0L, (oldclientalloc?.value ?: 0L), (oldclientfree?.value ?: 0L))
}

public actual fun rpcStringBindingComposeA(objuuid: Pcstr, protseq: Pcstr, networkaddr: Pcstr, endpoint: Pcstr, options: Pcstr, stringbinding: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcStringBindingComposeA((objuuid?.value ?: 0L), (protseq?.value ?: 0L), (networkaddr?.value ?: 0L), (endpoint?.value ?: 0L), (options?.value ?: 0L), (stringbinding?.value ?: 0L))

public actual fun rpcStringBindingComposeW(objuuid: Pcwstr, protseq: Pcwstr, networkaddr: Pcwstr, endpoint: Pcwstr, options: Pcwstr, stringbinding: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcStringBindingComposeW((objuuid?.value ?: 0L), (protseq?.value ?: 0L), (networkaddr?.value ?: 0L), (endpoint?.value ?: 0L), (options?.value ?: 0L), (stringbinding?.value ?: 0L))

public actual fun rpcStringBindingParseA(stringbinding: Pcstr, objuuid: COpaquePointer?, protseq: COpaquePointer?, networkaddr: COpaquePointer?, endpoint: COpaquePointer?, networkoptions: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcStringBindingParseA((stringbinding?.value ?: 0L), (objuuid?.value ?: 0L), (protseq?.value ?: 0L), (networkaddr?.value ?: 0L), (endpoint?.value ?: 0L), (networkoptions?.value ?: 0L))

public actual fun rpcStringBindingParseW(stringbinding: Pcwstr, objuuid: COpaquePointer?, protseq: COpaquePointer?, networkaddr: COpaquePointer?, endpoint: COpaquePointer?, networkoptions: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcStringBindingParseW((stringbinding?.value ?: 0L), (objuuid?.value ?: 0L), (protseq?.value ?: 0L), (networkaddr?.value ?: 0L), (endpoint?.value ?: 0L), (networkoptions?.value ?: 0L))

public actual fun rpcStringFreeA(string: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcStringFreeA((string?.value ?: 0L))

public actual fun rpcStringFreeW(string: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcStringFreeW((string?.value ?: 0L))

public actual fun rpcTestCancel(): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcTestCancel()

public actual fun rpcUserFree(asynchandle: COpaquePointer?, pbuffer: COpaquePointer?) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_rpcUserFree((asynchandle?.value ?: 0L), (pbuffer?.value ?: 0L))
}

public actual fun uuidCompare(uuid1: COpaquePointer?, uuid2: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_uuidCompare((uuid1?.value ?: 0L), (uuid2?.value ?: 0L), (status?.value ?: 0L))

public actual fun uuidCreate(uuid: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_uuidCreate((uuid?.value ?: 0L))

public actual fun uuidCreateNil(niluuid: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_uuidCreateNil((niluuid?.value ?: 0L))

public actual fun uuidCreateSequential(uuid: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_uuidCreateSequential((uuid?.value ?: 0L))

public actual fun uuidEqual(uuid1: COpaquePointer?, uuid2: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_uuidEqual((uuid1?.value ?: 0L), (uuid2?.value ?: 0L), (status?.value ?: 0L))

public actual fun uuidFromStringA(stringuuid: Pcstr, uuid: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_uuidFromStringA((stringuuid?.value ?: 0L), (uuid?.value ?: 0L))

public actual fun uuidFromStringW(stringuuid: Pcwstr, uuid: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_uuidFromStringW((stringuuid?.value ?: 0L), (uuid?.value ?: 0L))

public actual fun uuidHash(uuid: COpaquePointer?, status: COpaquePointer?): UShort =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_uuidHash((uuid?.value ?: 0L), (status?.value ?: 0L)).toUShort()

public actual fun uuidIsNil(uuid: COpaquePointer?, status: COpaquePointer?): Int =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_uuidIsNil((uuid?.value ?: 0L), (status?.value ?: 0L))

public actual fun uuidToStringA(uuid: COpaquePointer?, stringuuid: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_uuidToStringA((uuid?.value ?: 0L), (stringuuid?.value ?: 0L))

public actual fun uuidToStringW(uuid: COpaquePointer?, stringuuid: COpaquePointer?): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_uuidToStringW((uuid?.value ?: 0L), (stringuuid?.value ?: 0L))
