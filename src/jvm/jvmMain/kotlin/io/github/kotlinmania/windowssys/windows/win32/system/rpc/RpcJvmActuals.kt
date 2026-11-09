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

private object WindowsWin32SystemRpcJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_DceErrorInqTextA(rpcstatus: Int, errortext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_DceErrorInqTextW(rpcstatus: Int, errortext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_IUnknown_AddRef_Proxy(thisRef: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_IUnknown_QueryInterface_Proxy(thisRef: Long, riid: Long, ppvobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_IUnknown_Release_Proxy(thisRef: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcAllocate(size: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcAsyncAbortCall(pasync: Long, exceptioncode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcAsyncSetHandle(message: Long, pasync: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcBindingCopy(sourcebinding: Long, destinationbinding: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcBindingCreateNP(servername: Long, servicename: Long, networkoptions: Long, binding: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcBindingHandleToAsyncHandle(binding: Long, asynchandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcBindingInqClientTokenAttributes(binding: Long, tokenid: Long, authenticationid: Long, modifiedid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcBindingInqDynamicEndpointA(binding: Long, dynamicendpoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcBindingInqDynamicEndpointW(binding: Long, dynamicendpoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcBindingInqLocalClientPID(binding: Long, pid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcBindingInqMarshalledTargetInfo(binding: Long, marshalledtargetinfosize: Long, marshalledtargetinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcBindingInqSecurityContext(binding: Long, securitycontexthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcBindingInqSecurityContextKeyInfo(binding: Long, keyinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcBindingInqTransportType(binding: Long, type: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcBindingInqWireIdForSnego(binding: Long, wireid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcBindingIsClientLocal(bindinghandle: Long, clientlocalflag: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcBindingIsServerLocal(binding: Long, serverlocalflag: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcBindingSetPrivateOption(hbinding: Long, option: Int, optionvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcBindingToStaticStringBindingW(binding: Long, stringbinding: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcClearMutex(mutex: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcDeleteMutex(mutex: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcExceptionFilter(exceptioncode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcFree(obj: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcFreeBuffer(message: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcFreePipeBuffer(message: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcGetBuffer(message: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcGetBufferWithObject(message: Long, objectuuid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcGetCurrentCallHandle(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcGetDefaultSD(ppsecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcGetExtendedError(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcIfInqTransferSyntaxes(rpcifhandle: Long, transfersyntaxes: Long, transfersyntaxsize: Int, transfersyntaxcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcMapWin32Status(status: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcMgmtEnableDedicatedThreadPool(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcNegotiateTransferSyntax(message: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcNsBindingSetEntryNameA(binding: Long, entrynamesyntax: Int, entryname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcNsBindingSetEntryNameW(binding: Long, entrynamesyntax: Int, entryname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcNsGetBuffer(message: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcNsInterfaceExported(entrynamesyntax: Int, entryname: Long, rpcinterfaceinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcNsInterfaceUnexported(entrynamesyntax: Int, entryname: Long, rpcinterfaceinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcNsRaiseException(message: Long, status: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcNsSendReceive(message: Long, handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcOpenClientProcess(binding: Long, desiredaccess: Int, clientprocess: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcPauseExecution(milliseconds: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcReBindBuffer(message: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcReallocPipeBuffer(message: Long, newsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcReceive(message: Long, size: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcRecordCalloutFailure(rpcstatus: Int, calloutstate: Long, dllname: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcRequestMutex(mutex: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcSend(message: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcSendReceive(message: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcServerCheckClientRestriction(context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcServerDisableExceptionFilter(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcServerGetAssociationID(binding: Long, associationid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcServerInqAddressChangeFn(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcServerInqLocalConnAddress(binding: Long, buffer: Long, buffersize: Long, addressformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcServerInqRemoteConnAddress(binding: Long, buffer: Long, buffersize: Long, addressformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcServerInqTransportType(type: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcServerRegisterForwardFunction(pforwardfunction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcServerSetAddressChangeFn(paddresschangefn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcServerStartService(protseq: Long, endpoint: Long, ifspec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcServerSubscribeForDisconnectNotification(binding: Long, hevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcServerSubscribeForDisconnectNotification2(binding: Long, hevent: Long, subscriptionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcServerUseProtseq2A(networkaddress: Long, protseq: Long, maxcalls: Int, securitydescriptor: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcServerUseProtseq2W(networkaddress: Long, protseq: Long, maxcalls: Int, securitydescriptor: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcServerUseProtseqEp2A(networkaddress: Long, protseq: Long, maxcalls: Int, endpoint: Long, securitydescriptor: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcServerUseProtseqEp2W(networkaddress: Long, protseq: Long, maxcalls: Int, endpoint: Long, securitydescriptor: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcSessionStrictContextHandle()

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcSsDontSerializeContext()

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcSystemHandleTypeSpecificWork(handle: Long, actualtype: Byte, idltype: Byte, marshaldirection: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_RpcTurnOnEEInfoPropagation(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_I_UuidCreate(uuid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_MesBufferHandleReset(handle: Long, handlestyle: Int, operation: Int, pbuffer: Long, buffersize: Int, pencodedsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_MesDecodeBufferHandleCreate(buffer: Long, buffersize: Int, phandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_MesDecodeIncrementalHandleCreate(userstate: Long, readfn: Long, phandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_MesEncodeDynBufferHandleCreate(pbuffer: Long, pencodedsize: Long, phandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_MesEncodeFixedBufferHandleCreate(pbuffer: Long, buffersize: Int, pencodedsize: Long, phandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_MesEncodeIncrementalHandleCreate(userstate: Long, allocfn: Long, writefn: Long, phandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_MesHandleFree(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_MesIncrementalHandleReset(handle: Long, userstate: Long, allocfn: Long, writefn: Long, readfn: Long, operation: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_MesInqProcEncodingId(handle: Long, pinterfaceid: Long, pprocnum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NDRCContextBinding(ccontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NDRCContextMarshall(ccontext: Long, pbuff: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NDRCContextUnmarshall(pccontext: Long, hbinding: Long, pbuff: Long, datarepresentation: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NDRSContextMarshall(ccontext: Long, pbuff: Long, userrundownin: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NDRSContextMarshall2(bindinghandle: Long, ccontext: Long, pbuff: Long, userrundownin: Long, ctxguard: Long, flags: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NDRSContextMarshallEx(bindinghandle: Long, ccontext: Long, pbuff: Long, userrundownin: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NDRSContextUnmarshall(pbuff: Long, datarepresentation: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NDRSContextUnmarshall2(bindinghandle: Long, pbuff: Long, datarepresentation: Int, ctxguard: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NDRSContextUnmarshallEx(bindinghandle: Long, pbuff: Long, datarepresentation: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_Ndr64AsyncServerCall64(prpcmsg: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_Ndr64AsyncServerCallAll(prpcmsg: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_Ndr64DcomAsyncStubCall(pthis: Long, pchannel: Long, prpcmsg: Long, pdwstubphase: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrAllocate(pstubmsg: Long, len: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrAsyncServerCall(prpcmsg: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrByteCountPointerBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrByteCountPointerFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrByteCountPointerMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrByteCountPointerUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrClearOutParameters(pstubmsg: Long, pformat: Long, argaddr: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrClientContextMarshall(pstubmsg: Long, contexthandle: Long, fcheck: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrClientContextUnmarshall(pstubmsg: Long, pcontexthandle: Long, bindhandle: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrClientInitialize(prpcmsg: Long, pstubmsg: Long, pstubdescriptor: Long, procnum: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrClientInitializeNew(prpcmsg: Long, pstubmsg: Long, pstubdescriptor: Long, procnum: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrComplexArrayBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrComplexArrayFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrComplexArrayMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrComplexArrayMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrComplexArrayUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrComplexStructBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrComplexStructFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrComplexStructMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrComplexStructMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrComplexStructUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrConformantArrayBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrConformantArrayFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrConformantArrayMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrConformantArrayMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrConformantArrayUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrConformantStringBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrConformantStringMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrConformantStringMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrConformantStringUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrConformantStructBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrConformantStructFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrConformantStructMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrConformantStructMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrConformantStructUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrConformantVaryingArrayBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrConformantVaryingArrayFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrConformantVaryingArrayMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrConformantVaryingArrayMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrConformantVaryingArrayUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrConformantVaryingStructBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrConformantVaryingStructFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrConformantVaryingStructMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrConformantVaryingStructMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrConformantVaryingStructUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrContextHandleInitialize(pstubmsg: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrContextHandleSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrConvert(pstubmsg: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrConvert2(pstubmsg: Long, pformat: Long, numberparams: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrCorrelationFree(pstubmsg: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrCorrelationInitialize(pstubmsg: Long, pmemory: Long, cachesize: Int, flags: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrCorrelationPass(pstubmsg: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrCreateServerInterfaceFromStub(pstub: Long, pserverif: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrDcomAsyncStubCall(pthis: Long, pchannel: Long, prpcmsg: Long, pdwstubphase: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrEncapsulatedUnionBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrEncapsulatedUnionFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrEncapsulatedUnionMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrEncapsulatedUnionMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrEncapsulatedUnionUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrFixedArrayBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrFixedArrayFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrFixedArrayMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrFixedArrayMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrFixedArrayUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrFreeBuffer(pstubmsg: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrFullPointerXlatFree(pxlattables: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrFullPointerXlatInit(numberofpointers: Int, xlatside: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrGetBuffer(pstubmsg: Long, bufferlength: Int, handle: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrGetDcomProtocolVersion(pstubmsg: Long, pversion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrGetUserMarshalInfo(pflags: Long, informationlevel: Int, pmarshalinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrInterfacePointerBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrInterfacePointerFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrInterfacePointerMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrInterfacePointerMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrInterfacePointerUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrMapCommAndFaultStatus(pstubmsg: Long, pcommstatus: Long, pfaultstatus: Long, status: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrMesSimpleTypeAlignSize(param0: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrMesSimpleTypeAlignSizeAll(handle: Long, pproxyinfo: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrMesSimpleTypeDecode(handle: Long, pobject: Long, size: Short)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrMesSimpleTypeDecodeAll(handle: Long, pproxyinfo: Long, pobject: Long, size: Short)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrMesSimpleTypeEncode(handle: Long, pstubdesc: Long, pobject: Long, size: Short)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrMesSimpleTypeEncodeAll(handle: Long, pproxyinfo: Long, pobject: Long, size: Short)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrMesTypeAlignSize(handle: Long, pstubdesc: Long, pformatstring: Long, pobject: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrMesTypeAlignSize2(handle: Long, ppicklinginfo: Long, pstubdesc: Long, pformatstring: Long, pobject: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrMesTypeAlignSize3(handle: Long, ppicklinginfo: Long, pproxyinfo: Long, arrtypeoffset: Long, ntypeindex: Int, pobject: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrMesTypeDecode(handle: Long, pstubdesc: Long, pformatstring: Long, pobject: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrMesTypeDecode2(handle: Long, ppicklinginfo: Long, pstubdesc: Long, pformatstring: Long, pobject: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrMesTypeDecode3(handle: Long, ppicklinginfo: Long, pproxyinfo: Long, arrtypeoffset: Long, ntypeindex: Int, pobject: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrMesTypeEncode(handle: Long, pstubdesc: Long, pformatstring: Long, pobject: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrMesTypeEncode2(handle: Long, ppicklinginfo: Long, pstubdesc: Long, pformatstring: Long, pobject: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrMesTypeEncode3(handle: Long, ppicklinginfo: Long, pproxyinfo: Long, arrtypeoffset: Long, ntypeindex: Int, pobject: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrMesTypeFree2(handle: Long, ppicklinginfo: Long, pstubdesc: Long, pformatstring: Long, pobject: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrMesTypeFree3(handle: Long, ppicklinginfo: Long, pproxyinfo: Long, arrtypeoffset: Long, ntypeindex: Int, pobject: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrNonConformantStringBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrNonConformantStringMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrNonConformantStringMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrNonConformantStringUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrNonEncapsulatedUnionBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrNonEncapsulatedUnionFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrNonEncapsulatedUnionMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrNonEncapsulatedUnionMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrNonEncapsulatedUnionUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrNsGetBuffer(pstubmsg: Long, bufferlength: Int, handle: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrNsSendReceive(pstubmsg: Long, pbufferend: Long, pautohandle: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrOleAllocate(size: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrOleFree(nodetofree: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrPartialIgnoreClientBufferSize(pstubmsg: Long, pmemory: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrPartialIgnoreClientMarshall(pstubmsg: Long, pmemory: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrPartialIgnoreServerInitialize(pstubmsg: Long, ppmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrPartialIgnoreServerUnmarshall(pstubmsg: Long, ppmemory: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrPointerBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrPointerFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrPointerMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrPointerMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrPointerUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrRangeUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrRpcSmClientAllocate(size: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrRpcSmClientFree(nodetofree: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrRpcSmSetClientToOsf(pmessage: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrRpcSsDefaultAllocate(size: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrRpcSsDefaultFree(nodetofree: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrRpcSsDisableAllocate(pmessage: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrRpcSsEnableAllocate(pmessage: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrSendReceive(pstubmsg: Long, pbufferend: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrServerCall2(prpcmsg: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrServerCallAll(prpcmsg: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrServerCallNdr64(prpcmsg: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrServerContextMarshall(pstubmsg: Long, contexthandle: Long, rundownroutine: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrServerContextNewMarshall(pstubmsg: Long, contexthandle: Long, rundownroutine: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrServerContextNewUnmarshall(pstubmsg: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrServerContextUnmarshall(pstubmsg: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrServerInitialize(prpcmsg: Long, pstubmsg: Long, pstubdescriptor: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrServerInitializeMarshall(prpcmsg: Long, pstubmsg: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrServerInitializeNew(prpcmsg: Long, pstubmsg: Long, pstubdescriptor: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrServerInitializePartial(prpcmsg: Long, pstubmsg: Long, pstubdescriptor: Long, requestedbuffersize: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrServerInitializeUnmarshall(pstubmsg: Long, pstubdescriptor: Long, prpcmsg: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrSimpleStructBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrSimpleStructFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrSimpleStructMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrSimpleStructMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrSimpleStructUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrSimpleTypeMarshall(pstubmsg: Long, pmemory: Long, formatchar: Byte)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrSimpleTypeUnmarshall(pstubmsg: Long, pmemory: Long, formatchar: Byte)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrStubCall2(pthis: Long, pchannel: Long, prpcmsg: Long, pdwstubphase: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrStubCall3(pthis: Long, pchannel: Long, prpcmsg: Long, pdwstubphase: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrUserMarshalBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrUserMarshalFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrUserMarshalMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrUserMarshalMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrUserMarshalSimpleTypeConvert(pflags: Long, pbuffer: Long, formatchar: Byte): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrUserMarshalUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrVaryingArrayBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrVaryingArrayFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrVaryingArrayMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrVaryingArrayMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrVaryingArrayUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrXmitOrRepAsBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrXmitOrRepAsFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrXmitOrRepAsMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrXmitOrRepAsMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_NdrXmitOrRepAsUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcAsyncAbortCall(pasync: Long, exceptioncode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcAsyncCancelCall(pasync: Long, fabort: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcAsyncCompleteCall(pasync: Long, reply: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcAsyncGetCallStatus(pasync: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcAsyncInitializeHandle(pasync: Long, size: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcAsyncRegisterInfo(pasync: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcBindingBind(pasync: Long, binding: Long, ifspec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcBindingCopy(sourcebinding: Long, destinationbinding: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcBindingCreateA(template: Long, security: Long, options: Long, binding: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcBindingCreateW(template: Long, security: Long, options: Long, binding: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcBindingFree(binding: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcBindingFromStringBindingA(stringbinding: Long, binding: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcBindingFromStringBindingW(stringbinding: Long, binding: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcBindingInqAuthClientA(clientbinding: Long, privs: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authzsvc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcBindingInqAuthClientExA(clientbinding: Long, privs: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authzsvc: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcBindingInqAuthClientExW(clientbinding: Long, privs: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authzsvc: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcBindingInqAuthClientW(clientbinding: Long, privs: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authzsvc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcBindingInqAuthInfoA(binding: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authidentity: Long, authzsvc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcBindingInqAuthInfoExA(binding: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authidentity: Long, authzsvc: Long, rpcqosversion: Int, securityqos: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcBindingInqAuthInfoExW(binding: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authidentity: Long, authzsvc: Long, rpcqosversion: Int, securityqos: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcBindingInqAuthInfoW(binding: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authidentity: Long, authzsvc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcBindingInqMaxCalls(binding: Long, maxcalls: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcBindingInqObject(binding: Long, objectuuid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcBindingInqOption(hbinding: Long, option: Int, poptionvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcBindingReset(binding: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcBindingServerFromClient(clientbinding: Long, serverbinding: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcBindingSetAuthInfoA(binding: Long, serverprincname: Long, authnlevel: Int, authnsvc: Int, authidentity: Long, authzsvc: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcBindingSetAuthInfoExA(binding: Long, serverprincname: Long, authnlevel: Int, authnsvc: Int, authidentity: Long, authzsvc: Int, securityqos: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcBindingSetAuthInfoExW(binding: Long, serverprincname: Long, authnlevel: Int, authnsvc: Int, authidentity: Long, authzsvc: Int, securityqos: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcBindingSetAuthInfoW(binding: Long, serverprincname: Long, authnlevel: Int, authnsvc: Int, authidentity: Long, authzsvc: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcBindingSetObject(binding: Long, objectuuid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcBindingSetOption(hbinding: Long, option: Int, optionvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcBindingToStringBindingA(binding: Long, stringbinding: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcBindingToStringBindingW(binding: Long, stringbinding: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcBindingUnbind(binding: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcBindingVectorFree(bindingvector: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcCancelThread(thread: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcCancelThreadEx(thread: Long, timeout: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcCertGeneratePrincipalNameA(context: Long, flags: Int, pbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcCertGeneratePrincipalNameW(context: Long, flags: Int, pbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcEpRegisterA(ifspec: Long, bindingvector: Long, uuidvector: Long, annotation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcEpRegisterNoReplaceA(ifspec: Long, bindingvector: Long, uuidvector: Long, annotation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcEpRegisterNoReplaceW(ifspec: Long, bindingvector: Long, uuidvector: Long, annotation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcEpRegisterW(ifspec: Long, bindingvector: Long, uuidvector: Long, annotation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcEpResolveBinding(binding: Long, ifspec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcEpUnregister(ifspec: Long, bindingvector: Long, uuidvector: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcErrorAddRecord(errorinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcErrorClearInformation()

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcErrorEndEnumeration(enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcErrorGetNextRecord(enumhandle: Long, copystrings: Int, errorinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcErrorGetNumberOfRecords(enumhandle: Long, records: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcErrorLoadErrorInfo(errorblob: Long, blobsize: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcErrorResetEnumeration(enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcErrorSaveErrorInfo(enumhandle: Long, errorblob: Long, blobsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcErrorStartEnumeration(enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcExceptionFilter(exceptioncode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcFreeAuthorizationContext(pauthzclientcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcIfIdVectorFree(ifidvector: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcIfInqId(rpcifhandle: Long, rpcifid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcImpersonateClient(bindinghandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcImpersonateClient2(bindinghandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcImpersonateClientContainer(bindinghandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcMgmtEnableIdleCleanup(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcMgmtEpEltInqBegin(epbinding: Long, inquirytype: Int, ifid: Long, versoption: Int, objectuuid: Long, inquirycontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcMgmtEpEltInqDone(inquirycontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcMgmtEpEltInqNextA(inquirycontext: Long, ifid: Long, binding: Long, objectuuid: Long, annotation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcMgmtEpEltInqNextW(inquirycontext: Long, ifid: Long, binding: Long, objectuuid: Long, annotation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcMgmtEpUnregister(epbinding: Long, ifid: Long, binding: Long, objectuuid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcMgmtInqComTimeout(binding: Long, timeout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcMgmtInqDefaultProtectLevel(authnsvc: Int, authnlevel: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcMgmtInqIfIds(binding: Long, ifidvector: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcMgmtInqServerPrincNameA(binding: Long, authnsvc: Int, serverprincname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcMgmtInqServerPrincNameW(binding: Long, authnsvc: Int, serverprincname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcMgmtInqStats(binding: Long, statistics: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcMgmtIsServerListening(binding: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcMgmtSetAuthorizationFn(authorizationfn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcMgmtSetCancelTimeout(timeout: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcMgmtSetComTimeout(binding: Long, timeout: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcMgmtSetServerStackSize(threadstacksize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcMgmtStatsVectorFree(statsvector: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcMgmtStopServerListening(binding: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcMgmtWaitServerListen(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNetworkInqProtseqsA(protseqvector: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNetworkInqProtseqsW(protseqvector: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNetworkIsProtseqValidA(protseq: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNetworkIsProtseqValidW(protseq: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsBindingExportA(entrynamesyntax: Int, entryname: Long, ifspec: Long, bindingvec: Long, objectuuidvec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsBindingExportPnPA(entrynamesyntax: Int, entryname: Long, ifspec: Long, objectvector: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsBindingExportPnPW(entrynamesyntax: Int, entryname: Long, ifspec: Long, objectvector: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsBindingExportW(entrynamesyntax: Int, entryname: Long, ifspec: Long, bindingvec: Long, objectuuidvec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsBindingImportBeginA(entrynamesyntax: Int, entryname: Long, ifspec: Long, objuuid: Long, importcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsBindingImportBeginW(entrynamesyntax: Int, entryname: Long, ifspec: Long, objuuid: Long, importcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsBindingImportDone(importcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsBindingImportNext(importcontext: Long, binding: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsBindingInqEntryNameA(binding: Long, entrynamesyntax: Int, entryname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsBindingInqEntryNameW(binding: Long, entrynamesyntax: Int, entryname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsBindingLookupBeginA(entrynamesyntax: Int, entryname: Long, ifspec: Long, objuuid: Long, bindingmaxcount: Int, lookupcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsBindingLookupBeginW(entrynamesyntax: Int, entryname: Long, ifspec: Long, objuuid: Long, bindingmaxcount: Int, lookupcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsBindingLookupDone(lookupcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsBindingLookupNext(lookupcontext: Long, bindingvec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsBindingSelect(bindingvec: Long, binding: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsBindingUnexportA(entrynamesyntax: Int, entryname: Long, ifspec: Long, objectuuidvec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsBindingUnexportPnPA(entrynamesyntax: Int, entryname: Long, ifspec: Long, objectvector: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsBindingUnexportPnPW(entrynamesyntax: Int, entryname: Long, ifspec: Long, objectvector: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsBindingUnexportW(entrynamesyntax: Int, entryname: Long, ifspec: Long, objectuuidvec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsEntryExpandNameA(entrynamesyntax: Int, entryname: Long, expandedname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsEntryExpandNameW(entrynamesyntax: Int, entryname: Long, expandedname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsEntryObjectInqBeginA(entrynamesyntax: Int, entryname: Long, inquirycontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsEntryObjectInqBeginW(entrynamesyntax: Int, entryname: Long, inquirycontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsEntryObjectInqDone(inquirycontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsEntryObjectInqNext(inquirycontext: Long, objuuid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsGroupDeleteA(groupnamesyntax: Int, groupname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsGroupDeleteW(groupnamesyntax: Int, groupname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsGroupMbrAddA(groupnamesyntax: Int, groupname: Long, membernamesyntax: Int, membername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsGroupMbrAddW(groupnamesyntax: Int, groupname: Long, membernamesyntax: Int, membername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsGroupMbrInqBeginA(groupnamesyntax: Int, groupname: Long, membernamesyntax: Int, inquirycontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsGroupMbrInqBeginW(groupnamesyntax: Int, groupname: Long, membernamesyntax: Int, inquirycontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsGroupMbrInqDone(inquirycontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsGroupMbrInqNextA(inquirycontext: Long, membername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsGroupMbrInqNextW(inquirycontext: Long, membername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsGroupMbrRemoveA(groupnamesyntax: Int, groupname: Long, membernamesyntax: Int, membername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsGroupMbrRemoveW(groupnamesyntax: Int, groupname: Long, membernamesyntax: Int, membername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsMgmtBindingUnexportA(entrynamesyntax: Int, entryname: Long, ifid: Long, versoption: Int, objectuuidvec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsMgmtBindingUnexportW(entrynamesyntax: Int, entryname: Long, ifid: Long, versoption: Int, objectuuidvec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsMgmtEntryCreateA(entrynamesyntax: Int, entryname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsMgmtEntryCreateW(entrynamesyntax: Int, entryname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsMgmtEntryDeleteA(entrynamesyntax: Int, entryname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsMgmtEntryDeleteW(entrynamesyntax: Int, entryname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsMgmtEntryInqIfIdsA(entrynamesyntax: Int, entryname: Long, ifidvec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsMgmtEntryInqIfIdsW(entrynamesyntax: Int, entryname: Long, ifidvec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsMgmtHandleSetExpAge(nshandle: Long, expirationage: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsMgmtInqExpAge(expirationage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsMgmtSetExpAge(expirationage: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsProfileDeleteA(profilenamesyntax: Int, profilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsProfileDeleteW(profilenamesyntax: Int, profilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsProfileEltAddA(profilenamesyntax: Int, profilename: Long, ifid: Long, membernamesyntax: Int, membername: Long, priority: Int, annotation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsProfileEltAddW(profilenamesyntax: Int, profilename: Long, ifid: Long, membernamesyntax: Int, membername: Long, priority: Int, annotation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsProfileEltInqBeginA(profilenamesyntax: Int, profilename: Long, inquirytype: Int, ifid: Long, versoption: Int, membernamesyntax: Int, membername: Long, inquirycontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsProfileEltInqBeginW(profilenamesyntax: Int, profilename: Long, inquirytype: Int, ifid: Long, versoption: Int, membernamesyntax: Int, membername: Long, inquirycontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsProfileEltInqDone(inquirycontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsProfileEltInqNextA(inquirycontext: Long, ifid: Long, membername: Long, priority: Long, annotation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsProfileEltInqNextW(inquirycontext: Long, ifid: Long, membername: Long, priority: Long, annotation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsProfileEltRemoveA(profilenamesyntax: Int, profilename: Long, ifid: Long, membernamesyntax: Int, membername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcNsProfileEltRemoveW(profilenamesyntax: Int, profilename: Long, ifid: Long, membernamesyntax: Int, membername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcObjectInqType(objuuid: Long, typeuuid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcObjectSetInqFn(inquiryfn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcObjectSetType(objuuid: Long, typeuuid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcProtseqVectorFreeA(protseqvector: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcProtseqVectorFreeW(protseqvector: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcRaiseException(exception: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcRevertContainerImpersonation(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcRevertToSelf(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcRevertToSelfEx(bindinghandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcServerCompleteSecurityCallback(bindinghandle: Long, status: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcServerInqBindingHandle(binding: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcServerInqBindings(bindingvector: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcServerInqBindingsEx(securitydescriptor: Long, bindingvector: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcServerInqCallAttributesA(clientbinding: Long, rpccallattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcServerInqCallAttributesW(clientbinding: Long, rpccallattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcServerInqDefaultPrincNameA(authnsvc: Int, princname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcServerInqDefaultPrincNameW(authnsvc: Int, princname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcServerInqIf(ifspec: Long, mgrtypeuuid: Long, mgrepv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcServerInterfaceGroupActivate(ifgroup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcServerInterfaceGroupClose(ifgroup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcServerInterfaceGroupCreateA(interfaces: Long, numifs: Int, endpoints: Long, numendpoints: Int, idleperiod: Int, idlecallbackfn: Long, idlecallbackcontext: Long, ifgroup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcServerInterfaceGroupCreateW(interfaces: Long, numifs: Int, endpoints: Long, numendpoints: Int, idleperiod: Int, idlecallbackfn: Long, idlecallbackcontext: Long, ifgroup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcServerInterfaceGroupDeactivate(ifgroup: Long, forcedeactivation: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcServerInterfaceGroupInqBindings(ifgroup: Long, bindingvector: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcServerListen(minimumcallthreads: Int, maxcalls: Int, dontwait: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcServerRegisterAuthInfoA(serverprincname: Long, authnsvc: Int, getkeyfn: Long, arg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcServerRegisterAuthInfoW(serverprincname: Long, authnsvc: Int, getkeyfn: Long, arg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcServerRegisterIf(ifspec: Long, mgrtypeuuid: Long, mgrepv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcServerRegisterIf2(ifspec: Long, mgrtypeuuid: Long, mgrepv: Long, flags: Int, maxcalls: Int, maxrpcsize: Int, ifcallbackfn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcServerRegisterIf3(ifspec: Long, mgrtypeuuid: Long, mgrepv: Long, flags: Int, maxcalls: Int, maxrpcsize: Int, ifcallback: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcServerRegisterIfEx(ifspec: Long, mgrtypeuuid: Long, mgrepv: Long, flags: Int, maxcalls: Int, ifcallback: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcServerSubscribeForNotification(binding: Long, notification: Int, notificationtype: Int, notificationinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcServerTestCancel(bindinghandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcServerUnregisterIf(ifspec: Long, mgrtypeuuid: Long, waitforcallstocomplete: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcServerUnregisterIfEx(ifspec: Long, mgrtypeuuid: Long, rundowncontexthandles: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcServerUnsubscribeForNotification(binding: Long, notification: Int, notificationsqueued: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcServerUseAllProtseqs(maxcalls: Int, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcServerUseAllProtseqsEx(maxcalls: Int, securitydescriptor: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcServerUseAllProtseqsIf(maxcalls: Int, ifspec: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcServerUseAllProtseqsIfEx(maxcalls: Int, ifspec: Long, securitydescriptor: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcServerUseProtseqA(protseq: Long, maxcalls: Int, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcServerUseProtseqEpA(protseq: Long, maxcalls: Int, endpoint: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcServerUseProtseqEpExA(protseq: Long, maxcalls: Int, endpoint: Long, securitydescriptor: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcServerUseProtseqEpExW(protseq: Long, maxcalls: Int, endpoint: Long, securitydescriptor: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcServerUseProtseqEpW(protseq: Long, maxcalls: Int, endpoint: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcServerUseProtseqExA(protseq: Long, maxcalls: Int, securitydescriptor: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcServerUseProtseqExW(protseq: Long, maxcalls: Int, securitydescriptor: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcServerUseProtseqIfA(protseq: Long, maxcalls: Int, ifspec: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcServerUseProtseqIfExA(protseq: Long, maxcalls: Int, ifspec: Long, securitydescriptor: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcServerUseProtseqIfExW(protseq: Long, maxcalls: Int, ifspec: Long, securitydescriptor: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcServerUseProtseqIfW(protseq: Long, maxcalls: Int, ifspec: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcServerUseProtseqW(protseq: Long, maxcalls: Int, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcServerYield()

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcSmAllocate(size: Long, pstatus: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcSmClientFree(pnodetofree: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcSmDestroyClientContext(contexthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcSmDisableAllocate(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcSmEnableAllocate(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcSmFree(nodetofree: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcSmGetThreadHandle(pstatus: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcSmSetClientAllocFree(clientalloc: Long, clientfree: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcSmSetThreadHandle(id: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcSmSwapClientAllocFree(clientalloc: Long, clientfree: Long, oldclientalloc: Long, oldclientfree: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcSsAllocate(size: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcSsContextLockExclusive(serverbindinghandle: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcSsContextLockShared(serverbindinghandle: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcSsDestroyClientContext(contexthandle: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcSsDisableAllocate()

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcSsDontSerializeContext()

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcSsEnableAllocate()

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcSsFree(nodetofree: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcSsGetContextBinding(contexthandle: Long, binding: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcSsGetThreadHandle(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcSsSetClientAllocFree(clientalloc: Long, clientfree: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcSsSetThreadHandle(id: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcSsSwapClientAllocFree(clientalloc: Long, clientfree: Long, oldclientalloc: Long, oldclientfree: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcStringBindingComposeA(objuuid: Long, protseq: Long, networkaddr: Long, endpoint: Long, options: Long, stringbinding: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcStringBindingComposeW(objuuid: Long, protseq: Long, networkaddr: Long, endpoint: Long, options: Long, stringbinding: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcStringBindingParseA(stringbinding: Long, objuuid: Long, protseq: Long, networkaddr: Long, endpoint: Long, networkoptions: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcStringBindingParseW(stringbinding: Long, objuuid: Long, protseq: Long, networkaddr: Long, endpoint: Long, networkoptions: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcStringFreeA(string: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcStringFreeW(string: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcTestCancel(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_RpcUserFree(asynchandle: Long, pbuffer: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_UuidCompare(uuid1: Long, uuid2: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_UuidCreate(uuid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_UuidCreateNil(niluuid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_UuidCreateSequential(uuid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_UuidEqual(uuid1: Long, uuid2: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_UuidFromStringA(stringuuid: Long, uuid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_UuidFromStringW(stringuuid: Long, uuid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_UuidHash(uuid: Long, status: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_UuidIsNil(uuid: Long, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_UuidToStringA(uuid: Long, stringuuid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_rpc_UuidToStringW(uuid: Long, stringuuid: Long): Int
}

public actual fun DceErrorInqTextA(rpcstatus: RPC_STATUS, errortext: PSTR): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_DceErrorInqTextA(rpcstatus, errortext)

public actual fun DceErrorInqTextW(rpcstatus: RPC_STATUS, errortext: PWSTR): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_DceErrorInqTextW(rpcstatus, errortext)

public actual fun IUnknown_AddRef_Proxy(thisRef: Long): UInt =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_IUnknown_AddRef_Proxy(thisRef).toUInt()

public actual fun IUnknown_QueryInterface_Proxy(thisRef: Long, riid: Long, ppvobject: Long): HRESULT =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_IUnknown_QueryInterface_Proxy(thisRef, riid, ppvobject)

public actual fun IUnknown_Release_Proxy(thisRef: Long): UInt =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_IUnknown_Release_Proxy(thisRef).toUInt()

public actual fun I_RpcAllocate(size: UInt): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcAllocate(size.toInt())

public actual fun I_RpcAsyncAbortCall(pasync: Long, exceptioncode: UInt): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcAsyncAbortCall(pasync, exceptioncode.toInt())

public actual fun I_RpcAsyncSetHandle(message: Long, pasync: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcAsyncSetHandle(message, pasync)

public actual fun I_RpcBindingCopy(sourcebinding: Long, destinationbinding: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcBindingCopy(sourcebinding, destinationbinding)

public actual fun I_RpcBindingCreateNP(servername: PCWSTR, servicename: PCWSTR, networkoptions: PCWSTR, binding: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcBindingCreateNP(servername, servicename, networkoptions, binding)

public actual fun I_RpcBindingHandleToAsyncHandle(binding: Long, asynchandle: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcBindingHandleToAsyncHandle(binding, asynchandle)

public actual fun I_RpcBindingInqClientTokenAttributes(binding: Long, tokenid: Long, authenticationid: Long, modifiedid: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcBindingInqClientTokenAttributes(binding, tokenid, authenticationid, modifiedid)

public actual fun I_RpcBindingInqDynamicEndpointA(binding: Long, dynamicendpoint: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcBindingInqDynamicEndpointA(binding, dynamicendpoint)

public actual fun I_RpcBindingInqDynamicEndpointW(binding: Long, dynamicendpoint: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcBindingInqDynamicEndpointW(binding, dynamicendpoint)

public actual fun I_RpcBindingInqLocalClientPID(binding: Long, pid: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcBindingInqLocalClientPID(binding, pid)

public actual fun I_RpcBindingInqMarshalledTargetInfo(binding: Long, marshalledtargetinfosize: Long, marshalledtargetinfo: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcBindingInqMarshalledTargetInfo(binding, marshalledtargetinfosize, marshalledtargetinfo)

public actual fun I_RpcBindingInqSecurityContext(binding: Long, securitycontexthandle: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcBindingInqSecurityContext(binding, securitycontexthandle)

public actual fun I_RpcBindingInqSecurityContextKeyInfo(binding: Long, keyinfo: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcBindingInqSecurityContextKeyInfo(binding, keyinfo)

public actual fun I_RpcBindingInqTransportType(binding: Long, type: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcBindingInqTransportType(binding, type)

public actual fun I_RpcBindingInqWireIdForSnego(binding: Long, wireid: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcBindingInqWireIdForSnego(binding, wireid)

public actual fun I_RpcBindingIsClientLocal(bindinghandle: Long, clientlocalflag: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcBindingIsClientLocal(bindinghandle, clientlocalflag)

public actual fun I_RpcBindingIsServerLocal(binding: Long, serverlocalflag: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcBindingIsServerLocal(binding, serverlocalflag)

public actual fun I_RpcBindingSetPrivateOption(hbinding: Long, option: UInt, optionvalue: ULong): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcBindingSetPrivateOption(hbinding, option.toInt(), optionvalue.toLong())

public actual fun I_RpcBindingToStaticStringBindingW(binding: Long, stringbinding: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcBindingToStaticStringBindingW(binding, stringbinding)

public actual fun I_RpcClearMutex(mutex: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcClearMutex(mutex)
}

public actual fun I_RpcDeleteMutex(mutex: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcDeleteMutex(mutex)
}

public actual fun I_RpcExceptionFilter(exceptioncode: UInt): Int =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcExceptionFilter(exceptioncode.toInt())

public actual fun I_RpcFree(obj: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcFree(obj)
}

public actual fun I_RpcFreeBuffer(message: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcFreeBuffer(message)

public actual fun I_RpcFreePipeBuffer(message: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcFreePipeBuffer(message)

public actual fun I_RpcGetBuffer(message: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcGetBuffer(message)

public actual fun I_RpcGetBufferWithObject(message: Long, objectuuid: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcGetBufferWithObject(message, objectuuid)

public actual fun I_RpcGetCurrentCallHandle(): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcGetCurrentCallHandle()

public actual fun I_RpcGetDefaultSD(ppsecuritydescriptor: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcGetDefaultSD(ppsecuritydescriptor)

public actual fun I_RpcGetExtendedError(): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcGetExtendedError()

public actual fun I_RpcIfInqTransferSyntaxes(rpcifhandle: Long, transfersyntaxes: Long, transfersyntaxsize: UInt, transfersyntaxcount: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcIfInqTransferSyntaxes(rpcifhandle, transfersyntaxes, transfersyntaxsize.toInt(), transfersyntaxcount)

public actual fun I_RpcMapWin32Status(status: RPC_STATUS): Int =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcMapWin32Status(status)

public actual fun I_RpcMgmtEnableDedicatedThreadPool(): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcMgmtEnableDedicatedThreadPool()

public actual fun I_RpcNegotiateTransferSyntax(message: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcNegotiateTransferSyntax(message)

public actual fun I_RpcNsBindingSetEntryNameA(binding: Long, entrynamesyntax: UInt, entryname: PCSTR): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcNsBindingSetEntryNameA(binding, entrynamesyntax.toInt(), entryname)

public actual fun I_RpcNsBindingSetEntryNameW(binding: Long, entrynamesyntax: UInt, entryname: PCWSTR): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcNsBindingSetEntryNameW(binding, entrynamesyntax.toInt(), entryname)

public actual fun I_RpcNsGetBuffer(message: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcNsGetBuffer(message)

public actual fun I_RpcNsInterfaceExported(entrynamesyntax: UInt, entryname: Long, rpcinterfaceinformation: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcNsInterfaceExported(entrynamesyntax.toInt(), entryname, rpcinterfaceinformation)

public actual fun I_RpcNsInterfaceUnexported(entrynamesyntax: UInt, entryname: Long, rpcinterfaceinformation: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcNsInterfaceUnexported(entrynamesyntax.toInt(), entryname, rpcinterfaceinformation)

public actual fun I_RpcNsRaiseException(message: Long, status: RPC_STATUS) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcNsRaiseException(message, status)
}

public actual fun I_RpcNsSendReceive(message: Long, handle: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcNsSendReceive(message, handle)

public actual fun I_RpcOpenClientProcess(binding: Long, desiredaccess: UInt, clientprocess: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcOpenClientProcess(binding, desiredaccess.toInt(), clientprocess)

public actual fun I_RpcPauseExecution(milliseconds: UInt) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcPauseExecution(milliseconds.toInt())
}

public actual fun I_RpcReBindBuffer(message: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcReBindBuffer(message)

public actual fun I_RpcReallocPipeBuffer(message: Long, newsize: UInt): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcReallocPipeBuffer(message, newsize.toInt())

public actual fun I_RpcReceive(message: Long, size: UInt): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcReceive(message, size.toInt())

public actual fun I_RpcRecordCalloutFailure(rpcstatus: RPC_STATUS, calloutstate: Long, dllname: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcRecordCalloutFailure(rpcstatus, calloutstate, dllname)
}

public actual fun I_RpcRequestMutex(mutex: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcRequestMutex(mutex)
}

public actual fun I_RpcSend(message: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcSend(message)

public actual fun I_RpcSendReceive(message: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcSendReceive(message)

public actual fun I_RpcServerCheckClientRestriction(context: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcServerCheckClientRestriction(context)

public actual fun I_RpcServerDisableExceptionFilter(): Int =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcServerDisableExceptionFilter()

public actual fun I_RpcServerGetAssociationID(binding: Long, associationid: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcServerGetAssociationID(binding, associationid)

public actual fun I_RpcServerInqAddressChangeFn(): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcServerInqAddressChangeFn()

public actual fun I_RpcServerInqLocalConnAddress(binding: Long, buffer: Long, buffersize: Long, addressformat: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcServerInqLocalConnAddress(binding, buffer, buffersize, addressformat)

public actual fun I_RpcServerInqRemoteConnAddress(binding: Long, buffer: Long, buffersize: Long, addressformat: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcServerInqRemoteConnAddress(binding, buffer, buffersize, addressformat)

public actual fun I_RpcServerInqTransportType(type: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcServerInqTransportType(type)

public actual fun I_RpcServerRegisterForwardFunction(pforwardfunction: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcServerRegisterForwardFunction(pforwardfunction)

public actual fun I_RpcServerSetAddressChangeFn(paddresschangefn: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcServerSetAddressChangeFn(paddresschangefn)

public actual fun I_RpcServerStartService(protseq: PCWSTR, endpoint: PCWSTR, ifspec: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcServerStartService(protseq, endpoint, ifspec)

public actual fun I_RpcServerSubscribeForDisconnectNotification(binding: Long, hevent: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcServerSubscribeForDisconnectNotification(binding, hevent)

public actual fun I_RpcServerSubscribeForDisconnectNotification2(binding: Long, hevent: Long, subscriptionid: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcServerSubscribeForDisconnectNotification2(binding, hevent, subscriptionid)

public actual fun I_RpcServerUnsubscribeForDisconnectNotification(binding: Long, subscriptionid: GUID): RPC_STATUS =
    0

public actual fun I_RpcServerUseProtseq2A(networkaddress: PCSTR, protseq: PCSTR, maxcalls: UInt, securitydescriptor: Long, policy: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcServerUseProtseq2A(networkaddress, protseq, maxcalls.toInt(), securitydescriptor, policy)

public actual fun I_RpcServerUseProtseq2W(networkaddress: PCWSTR, protseq: PCWSTR, maxcalls: UInt, securitydescriptor: Long, policy: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcServerUseProtseq2W(networkaddress, protseq, maxcalls.toInt(), securitydescriptor, policy)

public actual fun I_RpcServerUseProtseqEp2A(networkaddress: PCSTR, protseq: PCSTR, maxcalls: UInt, endpoint: PCSTR, securitydescriptor: Long, policy: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcServerUseProtseqEp2A(networkaddress, protseq, maxcalls.toInt(), endpoint, securitydescriptor, policy)

public actual fun I_RpcServerUseProtseqEp2W(networkaddress: PCWSTR, protseq: PCWSTR, maxcalls: UInt, endpoint: PCWSTR, securitydescriptor: Long, policy: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcServerUseProtseqEp2W(networkaddress, protseq, maxcalls.toInt(), endpoint, securitydescriptor, policy)

public actual fun I_RpcSessionStrictContextHandle() {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcSessionStrictContextHandle()
}

public actual fun I_RpcSsDontSerializeContext() {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcSsDontSerializeContext()
}

public actual fun I_RpcSystemHandleTypeSpecificWork(handle: Long, actualtype: UByte, idltype: UByte, marshaldirection: LRPC_SYSTEM_HANDLE_MARSHAL_DIRECTION): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcSystemHandleTypeSpecificWork(handle, actualtype.toByte(), idltype.toByte(), marshaldirection)

public actual fun I_RpcTurnOnEEInfoPropagation(): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_RpcTurnOnEEInfoPropagation()

public actual fun I_UuidCreate(uuid: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_I_UuidCreate(uuid)

public actual fun MesBufferHandleReset(handle: Long, handlestyle: UInt, operation: MIDL_ES_CODE, pbuffer: Long, buffersize: UInt, pencodedsize: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_MesBufferHandleReset(handle, handlestyle.toInt(), operation, pbuffer, buffersize.toInt(), pencodedsize)

public actual fun MesDecodeBufferHandleCreate(buffer: PCSTR, buffersize: UInt, phandle: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_MesDecodeBufferHandleCreate(buffer, buffersize.toInt(), phandle)

public actual fun MesDecodeIncrementalHandleCreate(userstate: Long, readfn: MIDL_ES_READ, phandle: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_MesDecodeIncrementalHandleCreate(userstate, readfn.toLong(), phandle)

public actual fun MesEncodeDynBufferHandleCreate(pbuffer: Long, pencodedsize: Long, phandle: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_MesEncodeDynBufferHandleCreate(pbuffer, pencodedsize, phandle)

public actual fun MesEncodeFixedBufferHandleCreate(pbuffer: PSTR, buffersize: UInt, pencodedsize: Long, phandle: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_MesEncodeFixedBufferHandleCreate(pbuffer, buffersize.toInt(), pencodedsize, phandle)

public actual fun MesEncodeIncrementalHandleCreate(userstate: Long, allocfn: MIDL_ES_ALLOC, writefn: MIDL_ES_WRITE, phandle: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_MesEncodeIncrementalHandleCreate(userstate, allocfn.toLong(), writefn.toLong(), phandle)

public actual fun MesHandleFree(handle: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_MesHandleFree(handle)

public actual fun MesIncrementalHandleReset(handle: Long, userstate: Long, allocfn: MIDL_ES_ALLOC, writefn: MIDL_ES_WRITE, readfn: MIDL_ES_READ, operation: MIDL_ES_CODE): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_MesIncrementalHandleReset(handle, userstate, allocfn.toLong(), writefn.toLong(), readfn.toLong(), operation)

public actual fun MesInqProcEncodingId(handle: Long, pinterfaceid: Long, pprocnum: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_MesInqProcEncodingId(handle, pinterfaceid, pprocnum)

public actual fun NDRCContextBinding(ccontext: Long): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NDRCContextBinding(ccontext)

public actual fun NDRCContextMarshall(ccontext: Long, pbuff: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NDRCContextMarshall(ccontext, pbuff)
}

public actual fun NDRCContextUnmarshall(pccontext: Long, hbinding: Long, pbuff: Long, datarepresentation: UInt) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NDRCContextUnmarshall(pccontext, hbinding, pbuff, datarepresentation.toInt())
}

public actual fun NDRSContextMarshall(ccontext: Long, pbuff: Long, userrundownin: NDR_RUNDOWN) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NDRSContextMarshall(ccontext, pbuff, userrundownin.toLong())
}

public actual fun NDRSContextMarshall2(bindinghandle: Long, ccontext: Long, pbuff: Long, userrundownin: NDR_RUNDOWN, ctxguard: Long, flags: UInt) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NDRSContextMarshall2(bindinghandle, ccontext, pbuff, userrundownin.toLong(), ctxguard, flags.toInt())
}

public actual fun NDRSContextMarshallEx(bindinghandle: Long, ccontext: Long, pbuff: Long, userrundownin: NDR_RUNDOWN) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NDRSContextMarshallEx(bindinghandle, ccontext, pbuff, userrundownin.toLong())
}

public actual fun NDRSContextUnmarshall(pbuff: Long, datarepresentation: UInt): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NDRSContextUnmarshall(pbuff, datarepresentation.toInt())

public actual fun NDRSContextUnmarshall2(bindinghandle: Long, pbuff: Long, datarepresentation: UInt, ctxguard: Long, flags: UInt): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NDRSContextUnmarshall2(bindinghandle, pbuff, datarepresentation.toInt(), ctxguard, flags.toInt())

public actual fun NDRSContextUnmarshallEx(bindinghandle: Long, pbuff: Long, datarepresentation: UInt): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NDRSContextUnmarshallEx(bindinghandle, pbuff, datarepresentation.toInt())

public actual fun Ndr64AsyncClientCall(pproxyinfo: Long, nprocnum: UInt, preturnvalue: Long): CLIENT_CALL_RETURN =
    CLIENT_CALL_RETURN()

public actual fun Ndr64AsyncServerCall64(prpcmsg: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_Ndr64AsyncServerCall64(prpcmsg)
}

public actual fun Ndr64AsyncServerCallAll(prpcmsg: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_Ndr64AsyncServerCallAll(prpcmsg)
}

public actual fun Ndr64DcomAsyncClientCall(pproxyinfo: Long, nprocnum: UInt, preturnvalue: Long): CLIENT_CALL_RETURN =
    CLIENT_CALL_RETURN()

public actual fun Ndr64DcomAsyncStubCall(pthis: Long, pchannel: Long, prpcmsg: Long, pdwstubphase: Long): Int =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_Ndr64DcomAsyncStubCall(pthis, pchannel, prpcmsg, pdwstubphase)

public actual fun NdrAllocate(pstubmsg: Long, len: ULong): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrAllocate(pstubmsg, len.toLong())

public actual fun NdrAsyncClientCall(pstubdescriptor: Long, pformat: Long): CLIENT_CALL_RETURN =
    CLIENT_CALL_RETURN()

public actual fun NdrAsyncServerCall(prpcmsg: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrAsyncServerCall(prpcmsg)
}

public actual fun NdrByteCountPointerBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrByteCountPointerBufferSize(pstubmsg, pmemory, pformat)
}

public actual fun NdrByteCountPointerFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrByteCountPointerFree(pstubmsg, pmemory, pformat)
}

public actual fun NdrByteCountPointerMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrByteCountPointerMarshall(pstubmsg, pmemory, pformat)

public actual fun NdrByteCountPointerUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrByteCountPointerUnmarshall(pstubmsg, ppmemory, pformat, fmustalloc.toByte())

public actual fun NdrClearOutParameters(pstubmsg: Long, pformat: Long, argaddr: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrClearOutParameters(pstubmsg, pformat, argaddr)
}

public actual fun NdrClientCall2(pstubdescriptor: Long, pformat: Long): CLIENT_CALL_RETURN =
    CLIENT_CALL_RETURN()

public actual fun NdrClientCall3(pproxyinfo: Long, nprocnum: UInt, preturnvalue: Long): CLIENT_CALL_RETURN =
    CLIENT_CALL_RETURN()

public actual fun NdrClientContextMarshall(pstubmsg: Long, contexthandle: Long, fcheck: Int) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrClientContextMarshall(pstubmsg, contexthandle, fcheck)
}

public actual fun NdrClientContextUnmarshall(pstubmsg: Long, pcontexthandle: Long, bindhandle: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrClientContextUnmarshall(pstubmsg, pcontexthandle, bindhandle)
}

public actual fun NdrClientInitialize(prpcmsg: Long, pstubmsg: Long, pstubdescriptor: Long, procnum: UInt) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrClientInitialize(prpcmsg, pstubmsg, pstubdescriptor, procnum.toInt())
}

public actual fun NdrClientInitializeNew(prpcmsg: Long, pstubmsg: Long, pstubdescriptor: Long, procnum: UInt) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrClientInitializeNew(prpcmsg, pstubmsg, pstubdescriptor, procnum.toInt())
}

public actual fun NdrComplexArrayBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrComplexArrayBufferSize(pstubmsg, pmemory, pformat)
}

public actual fun NdrComplexArrayFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrComplexArrayFree(pstubmsg, pmemory, pformat)
}

public actual fun NdrComplexArrayMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrComplexArrayMarshall(pstubmsg, pmemory, pformat)

public actual fun NdrComplexArrayMemorySize(pstubmsg: Long, pformat: Long): UInt =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrComplexArrayMemorySize(pstubmsg, pformat).toUInt()

public actual fun NdrComplexArrayUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrComplexArrayUnmarshall(pstubmsg, ppmemory, pformat, fmustalloc.toByte())

public actual fun NdrComplexStructBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrComplexStructBufferSize(pstubmsg, pmemory, pformat)
}

public actual fun NdrComplexStructFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrComplexStructFree(pstubmsg, pmemory, pformat)
}

public actual fun NdrComplexStructMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrComplexStructMarshall(pstubmsg, pmemory, pformat)

public actual fun NdrComplexStructMemorySize(pstubmsg: Long, pformat: Long): UInt =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrComplexStructMemorySize(pstubmsg, pformat).toUInt()

public actual fun NdrComplexStructUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrComplexStructUnmarshall(pstubmsg, ppmemory, pformat, fmustalloc.toByte())

public actual fun NdrConformantArrayBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrConformantArrayBufferSize(pstubmsg, pmemory, pformat)
}

public actual fun NdrConformantArrayFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrConformantArrayFree(pstubmsg, pmemory, pformat)
}

public actual fun NdrConformantArrayMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrConformantArrayMarshall(pstubmsg, pmemory, pformat)

public actual fun NdrConformantArrayMemorySize(pstubmsg: Long, pformat: Long): UInt =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrConformantArrayMemorySize(pstubmsg, pformat).toUInt()

public actual fun NdrConformantArrayUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrConformantArrayUnmarshall(pstubmsg, ppmemory, pformat, fmustalloc.toByte())

public actual fun NdrConformantStringBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrConformantStringBufferSize(pstubmsg, pmemory, pformat)
}

public actual fun NdrConformantStringMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrConformantStringMarshall(pstubmsg, pmemory, pformat)

public actual fun NdrConformantStringMemorySize(pstubmsg: Long, pformat: Long): UInt =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrConformantStringMemorySize(pstubmsg, pformat).toUInt()

public actual fun NdrConformantStringUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrConformantStringUnmarshall(pstubmsg, ppmemory, pformat, fmustalloc.toByte())

public actual fun NdrConformantStructBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrConformantStructBufferSize(pstubmsg, pmemory, pformat)
}

public actual fun NdrConformantStructFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrConformantStructFree(pstubmsg, pmemory, pformat)
}

public actual fun NdrConformantStructMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrConformantStructMarshall(pstubmsg, pmemory, pformat)

public actual fun NdrConformantStructMemorySize(pstubmsg: Long, pformat: Long): UInt =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrConformantStructMemorySize(pstubmsg, pformat).toUInt()

public actual fun NdrConformantStructUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrConformantStructUnmarshall(pstubmsg, ppmemory, pformat, fmustalloc.toByte())

public actual fun NdrConformantVaryingArrayBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrConformantVaryingArrayBufferSize(pstubmsg, pmemory, pformat)
}

public actual fun NdrConformantVaryingArrayFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrConformantVaryingArrayFree(pstubmsg, pmemory, pformat)
}

public actual fun NdrConformantVaryingArrayMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrConformantVaryingArrayMarshall(pstubmsg, pmemory, pformat)

public actual fun NdrConformantVaryingArrayMemorySize(pstubmsg: Long, pformat: Long): UInt =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrConformantVaryingArrayMemorySize(pstubmsg, pformat).toUInt()

public actual fun NdrConformantVaryingArrayUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrConformantVaryingArrayUnmarshall(pstubmsg, ppmemory, pformat, fmustalloc.toByte())

public actual fun NdrConformantVaryingStructBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrConformantVaryingStructBufferSize(pstubmsg, pmemory, pformat)
}

public actual fun NdrConformantVaryingStructFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrConformantVaryingStructFree(pstubmsg, pmemory, pformat)
}

public actual fun NdrConformantVaryingStructMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrConformantVaryingStructMarshall(pstubmsg, pmemory, pformat)

public actual fun NdrConformantVaryingStructMemorySize(pstubmsg: Long, pformat: Long): UInt =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrConformantVaryingStructMemorySize(pstubmsg, pformat).toUInt()

public actual fun NdrConformantVaryingStructUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrConformantVaryingStructUnmarshall(pstubmsg, ppmemory, pformat, fmustalloc.toByte())

public actual fun NdrContextHandleInitialize(pstubmsg: Long, pformat: Long): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrContextHandleInitialize(pstubmsg, pformat)

public actual fun NdrContextHandleSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrContextHandleSize(pstubmsg, pmemory, pformat)
}

public actual fun NdrConvert(pstubmsg: Long, pformat: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrConvert(pstubmsg, pformat)
}

public actual fun NdrConvert2(pstubmsg: Long, pformat: Long, numberparams: Int) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrConvert2(pstubmsg, pformat, numberparams)
}

public actual fun NdrCorrelationFree(pstubmsg: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrCorrelationFree(pstubmsg)
}

public actual fun NdrCorrelationInitialize(pstubmsg: Long, pmemory: Long, cachesize: UInt, flags: UInt) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrCorrelationInitialize(pstubmsg, pmemory, cachesize.toInt(), flags.toInt())
}

public actual fun NdrCorrelationPass(pstubmsg: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrCorrelationPass(pstubmsg)
}

public actual fun NdrCreateServerInterfaceFromStub(pstub: Long, pserverif: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrCreateServerInterfaceFromStub(pstub, pserverif)

public actual fun NdrDcomAsyncClientCall(pstubdescriptor: Long, pformat: Long): CLIENT_CALL_RETURN =
    CLIENT_CALL_RETURN()

public actual fun NdrDcomAsyncStubCall(pthis: Long, pchannel: Long, prpcmsg: Long, pdwstubphase: Long): Int =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrDcomAsyncStubCall(pthis, pchannel, prpcmsg, pdwstubphase)

public actual fun NdrEncapsulatedUnionBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrEncapsulatedUnionBufferSize(pstubmsg, pmemory, pformat)
}

public actual fun NdrEncapsulatedUnionFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrEncapsulatedUnionFree(pstubmsg, pmemory, pformat)
}

public actual fun NdrEncapsulatedUnionMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrEncapsulatedUnionMarshall(pstubmsg, pmemory, pformat)

public actual fun NdrEncapsulatedUnionMemorySize(pstubmsg: Long, pformat: Long): UInt =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrEncapsulatedUnionMemorySize(pstubmsg, pformat).toUInt()

public actual fun NdrEncapsulatedUnionUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrEncapsulatedUnionUnmarshall(pstubmsg, ppmemory, pformat, fmustalloc.toByte())

public actual fun NdrFixedArrayBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrFixedArrayBufferSize(pstubmsg, pmemory, pformat)
}

public actual fun NdrFixedArrayFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrFixedArrayFree(pstubmsg, pmemory, pformat)
}

public actual fun NdrFixedArrayMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrFixedArrayMarshall(pstubmsg, pmemory, pformat)

public actual fun NdrFixedArrayMemorySize(pstubmsg: Long, pformat: Long): UInt =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrFixedArrayMemorySize(pstubmsg, pformat).toUInt()

public actual fun NdrFixedArrayUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrFixedArrayUnmarshall(pstubmsg, ppmemory, pformat, fmustalloc.toByte())

public actual fun NdrFreeBuffer(pstubmsg: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrFreeBuffer(pstubmsg)
}

public actual fun NdrFullPointerXlatFree(pxlattables: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrFullPointerXlatFree(pxlattables)
}

public actual fun NdrFullPointerXlatInit(numberofpointers: UInt, xlatside: XLAT_SIDE): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrFullPointerXlatInit(numberofpointers.toInt(), xlatside)

public actual fun NdrGetBuffer(pstubmsg: Long, bufferlength: UInt, handle: Long): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrGetBuffer(pstubmsg, bufferlength.toInt(), handle)

public actual fun NdrGetDcomProtocolVersion(pstubmsg: Long, pversion: Long): HRESULT =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrGetDcomProtocolVersion(pstubmsg, pversion)

public actual fun NdrGetUserMarshalInfo(pflags: Long, informationlevel: UInt, pmarshalinfo: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrGetUserMarshalInfo(pflags, informationlevel.toInt(), pmarshalinfo)

public actual fun NdrInterfacePointerBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrInterfacePointerBufferSize(pstubmsg, pmemory, pformat)
}

public actual fun NdrInterfacePointerFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrInterfacePointerFree(pstubmsg, pmemory, pformat)
}

public actual fun NdrInterfacePointerMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrInterfacePointerMarshall(pstubmsg, pmemory, pformat)

public actual fun NdrInterfacePointerMemorySize(pstubmsg: Long, pformat: Long): UInt =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrInterfacePointerMemorySize(pstubmsg, pformat).toUInt()

public actual fun NdrInterfacePointerUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrInterfacePointerUnmarshall(pstubmsg, ppmemory, pformat, fmustalloc.toByte())

public actual fun NdrMapCommAndFaultStatus(pstubmsg: Long, pcommstatus: Long, pfaultstatus: Long, status: RPC_STATUS): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrMapCommAndFaultStatus(pstubmsg, pcommstatus, pfaultstatus, status)

public actual fun NdrMesProcEncodeDecode(handle: Long, pstubdesc: Long, pformatstring: Long) {
}

public actual fun NdrMesProcEncodeDecode2(handle: Long, pstubdesc: Long, pformatstring: Long): CLIENT_CALL_RETURN =
    CLIENT_CALL_RETURN()

public actual fun NdrMesProcEncodeDecode3(handle: Long, pproxyinfo: Long, nprocnum: UInt, preturnvalue: Long): CLIENT_CALL_RETURN =
    CLIENT_CALL_RETURN()

public actual fun NdrMesSimpleTypeAlignSize(param0: Long): ULong =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrMesSimpleTypeAlignSize(param0).toULong()

public actual fun NdrMesSimpleTypeAlignSizeAll(handle: Long, pproxyinfo: Long): ULong =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrMesSimpleTypeAlignSizeAll(handle, pproxyinfo).toULong()

public actual fun NdrMesSimpleTypeDecode(handle: Long, pobject: Long, size: Short) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrMesSimpleTypeDecode(handle, pobject, size)
}

public actual fun NdrMesSimpleTypeDecodeAll(handle: Long, pproxyinfo: Long, pobject: Long, size: Short) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrMesSimpleTypeDecodeAll(handle, pproxyinfo, pobject, size)
}

public actual fun NdrMesSimpleTypeEncode(handle: Long, pstubdesc: Long, pobject: Long, size: Short) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrMesSimpleTypeEncode(handle, pstubdesc, pobject, size)
}

public actual fun NdrMesSimpleTypeEncodeAll(handle: Long, pproxyinfo: Long, pobject: Long, size: Short) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrMesSimpleTypeEncodeAll(handle, pproxyinfo, pobject, size)
}

public actual fun NdrMesTypeAlignSize(handle: Long, pstubdesc: Long, pformatstring: Long, pobject: Long): ULong =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrMesTypeAlignSize(handle, pstubdesc, pformatstring, pobject).toULong()

public actual fun NdrMesTypeAlignSize2(handle: Long, ppicklinginfo: Long, pstubdesc: Long, pformatstring: Long, pobject: Long): ULong =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrMesTypeAlignSize2(handle, ppicklinginfo, pstubdesc, pformatstring, pobject).toULong()

public actual fun NdrMesTypeAlignSize3(handle: Long, ppicklinginfo: Long, pproxyinfo: Long, arrtypeoffset: Long, ntypeindex: UInt, pobject: Long): ULong =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrMesTypeAlignSize3(handle, ppicklinginfo, pproxyinfo, arrtypeoffset, ntypeindex.toInt(), pobject).toULong()

public actual fun NdrMesTypeDecode(handle: Long, pstubdesc: Long, pformatstring: Long, pobject: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrMesTypeDecode(handle, pstubdesc, pformatstring, pobject)
}

public actual fun NdrMesTypeDecode2(handle: Long, ppicklinginfo: Long, pstubdesc: Long, pformatstring: Long, pobject: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrMesTypeDecode2(handle, ppicklinginfo, pstubdesc, pformatstring, pobject)
}

public actual fun NdrMesTypeDecode3(handle: Long, ppicklinginfo: Long, pproxyinfo: Long, arrtypeoffset: Long, ntypeindex: UInt, pobject: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrMesTypeDecode3(handle, ppicklinginfo, pproxyinfo, arrtypeoffset, ntypeindex.toInt(), pobject)
}

public actual fun NdrMesTypeEncode(handle: Long, pstubdesc: Long, pformatstring: Long, pobject: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrMesTypeEncode(handle, pstubdesc, pformatstring, pobject)
}

public actual fun NdrMesTypeEncode2(handle: Long, ppicklinginfo: Long, pstubdesc: Long, pformatstring: Long, pobject: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrMesTypeEncode2(handle, ppicklinginfo, pstubdesc, pformatstring, pobject)
}

public actual fun NdrMesTypeEncode3(handle: Long, ppicklinginfo: Long, pproxyinfo: Long, arrtypeoffset: Long, ntypeindex: UInt, pobject: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrMesTypeEncode3(handle, ppicklinginfo, pproxyinfo, arrtypeoffset, ntypeindex.toInt(), pobject)
}

public actual fun NdrMesTypeFree2(handle: Long, ppicklinginfo: Long, pstubdesc: Long, pformatstring: Long, pobject: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrMesTypeFree2(handle, ppicklinginfo, pstubdesc, pformatstring, pobject)
}

public actual fun NdrMesTypeFree3(handle: Long, ppicklinginfo: Long, pproxyinfo: Long, arrtypeoffset: Long, ntypeindex: UInt, pobject: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrMesTypeFree3(handle, ppicklinginfo, pproxyinfo, arrtypeoffset, ntypeindex.toInt(), pobject)
}

public actual fun NdrNonConformantStringBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrNonConformantStringBufferSize(pstubmsg, pmemory, pformat)
}

public actual fun NdrNonConformantStringMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrNonConformantStringMarshall(pstubmsg, pmemory, pformat)

public actual fun NdrNonConformantStringMemorySize(pstubmsg: Long, pformat: Long): UInt =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrNonConformantStringMemorySize(pstubmsg, pformat).toUInt()

public actual fun NdrNonConformantStringUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrNonConformantStringUnmarshall(pstubmsg, ppmemory, pformat, fmustalloc.toByte())

public actual fun NdrNonEncapsulatedUnionBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrNonEncapsulatedUnionBufferSize(pstubmsg, pmemory, pformat)
}

public actual fun NdrNonEncapsulatedUnionFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrNonEncapsulatedUnionFree(pstubmsg, pmemory, pformat)
}

public actual fun NdrNonEncapsulatedUnionMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrNonEncapsulatedUnionMarshall(pstubmsg, pmemory, pformat)

public actual fun NdrNonEncapsulatedUnionMemorySize(pstubmsg: Long, pformat: Long): UInt =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrNonEncapsulatedUnionMemorySize(pstubmsg, pformat).toUInt()

public actual fun NdrNonEncapsulatedUnionUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrNonEncapsulatedUnionUnmarshall(pstubmsg, ppmemory, pformat, fmustalloc.toByte())

public actual fun NdrNsGetBuffer(pstubmsg: Long, bufferlength: UInt, handle: Long): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrNsGetBuffer(pstubmsg, bufferlength.toInt(), handle)

public actual fun NdrNsSendReceive(pstubmsg: Long, pbufferend: Long, pautohandle: Long): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrNsSendReceive(pstubmsg, pbufferend, pautohandle)

public actual fun NdrOleAllocate(size: ULong): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrOleAllocate(size.toLong())

public actual fun NdrOleFree(nodetofree: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrOleFree(nodetofree)
}

public actual fun NdrPartialIgnoreClientBufferSize(pstubmsg: Long, pmemory: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrPartialIgnoreClientBufferSize(pstubmsg, pmemory)
}

public actual fun NdrPartialIgnoreClientMarshall(pstubmsg: Long, pmemory: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrPartialIgnoreClientMarshall(pstubmsg, pmemory)
}

public actual fun NdrPartialIgnoreServerInitialize(pstubmsg: Long, ppmemory: Long, pformat: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrPartialIgnoreServerInitialize(pstubmsg, ppmemory, pformat)
}

public actual fun NdrPartialIgnoreServerUnmarshall(pstubmsg: Long, ppmemory: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrPartialIgnoreServerUnmarshall(pstubmsg, ppmemory)
}

public actual fun NdrPointerBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrPointerBufferSize(pstubmsg, pmemory, pformat)
}

public actual fun NdrPointerFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrPointerFree(pstubmsg, pmemory, pformat)
}

public actual fun NdrPointerMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrPointerMarshall(pstubmsg, pmemory, pformat)

public actual fun NdrPointerMemorySize(pstubmsg: Long, pformat: Long): UInt =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrPointerMemorySize(pstubmsg, pformat).toUInt()

public actual fun NdrPointerUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrPointerUnmarshall(pstubmsg, ppmemory, pformat, fmustalloc.toByte())

public actual fun NdrRangeUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrRangeUnmarshall(pstubmsg, ppmemory, pformat, fmustalloc.toByte())

public actual fun NdrRpcSmClientAllocate(size: ULong): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrRpcSmClientAllocate(size.toLong())

public actual fun NdrRpcSmClientFree(nodetofree: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrRpcSmClientFree(nodetofree)
}

public actual fun NdrRpcSmSetClientToOsf(pmessage: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrRpcSmSetClientToOsf(pmessage)
}

public actual fun NdrRpcSsDefaultAllocate(size: ULong): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrRpcSsDefaultAllocate(size.toLong())

public actual fun NdrRpcSsDefaultFree(nodetofree: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrRpcSsDefaultFree(nodetofree)
}

public actual fun NdrRpcSsDisableAllocate(pmessage: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrRpcSsDisableAllocate(pmessage)
}

public actual fun NdrRpcSsEnableAllocate(pmessage: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrRpcSsEnableAllocate(pmessage)
}

public actual fun NdrSendReceive(pstubmsg: Long, pbufferend: Long): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrSendReceive(pstubmsg, pbufferend)

public actual fun NdrServerCall2(prpcmsg: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrServerCall2(prpcmsg)
}

public actual fun NdrServerCallAll(prpcmsg: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrServerCallAll(prpcmsg)
}

public actual fun NdrServerCallNdr64(prpcmsg: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrServerCallNdr64(prpcmsg)
}

public actual fun NdrServerContextMarshall(pstubmsg: Long, contexthandle: Long, rundownroutine: NDR_RUNDOWN) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrServerContextMarshall(pstubmsg, contexthandle, rundownroutine.toLong())
}

public actual fun NdrServerContextNewMarshall(pstubmsg: Long, contexthandle: Long, rundownroutine: NDR_RUNDOWN, pformat: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrServerContextNewMarshall(pstubmsg, contexthandle, rundownroutine.toLong(), pformat)
}

public actual fun NdrServerContextNewUnmarshall(pstubmsg: Long, pformat: Long): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrServerContextNewUnmarshall(pstubmsg, pformat)

public actual fun NdrServerContextUnmarshall(pstubmsg: Long): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrServerContextUnmarshall(pstubmsg)

public actual fun NdrServerInitialize(prpcmsg: Long, pstubmsg: Long, pstubdescriptor: Long): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrServerInitialize(prpcmsg, pstubmsg, pstubdescriptor)

public actual fun NdrServerInitializeMarshall(prpcmsg: Long, pstubmsg: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrServerInitializeMarshall(prpcmsg, pstubmsg)
}

public actual fun NdrServerInitializeNew(prpcmsg: Long, pstubmsg: Long, pstubdescriptor: Long): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrServerInitializeNew(prpcmsg, pstubmsg, pstubdescriptor)

public actual fun NdrServerInitializePartial(prpcmsg: Long, pstubmsg: Long, pstubdescriptor: Long, requestedbuffersize: UInt) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrServerInitializePartial(prpcmsg, pstubmsg, pstubdescriptor, requestedbuffersize.toInt())
}

public actual fun NdrServerInitializeUnmarshall(pstubmsg: Long, pstubdescriptor: Long, prpcmsg: Long): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrServerInitializeUnmarshall(pstubmsg, pstubdescriptor, prpcmsg)

public actual fun NdrSimpleStructBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrSimpleStructBufferSize(pstubmsg, pmemory, pformat)
}

public actual fun NdrSimpleStructFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrSimpleStructFree(pstubmsg, pmemory, pformat)
}

public actual fun NdrSimpleStructMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrSimpleStructMarshall(pstubmsg, pmemory, pformat)

public actual fun NdrSimpleStructMemorySize(pstubmsg: Long, pformat: Long): UInt =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrSimpleStructMemorySize(pstubmsg, pformat).toUInt()

public actual fun NdrSimpleStructUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrSimpleStructUnmarshall(pstubmsg, ppmemory, pformat, fmustalloc.toByte())

public actual fun NdrSimpleTypeMarshall(pstubmsg: Long, pmemory: Long, formatchar: UByte) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrSimpleTypeMarshall(pstubmsg, pmemory, formatchar.toByte())
}

public actual fun NdrSimpleTypeUnmarshall(pstubmsg: Long, pmemory: Long, formatchar: UByte) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrSimpleTypeUnmarshall(pstubmsg, pmemory, formatchar.toByte())
}

public actual fun NdrStubCall2(pthis: Long, pchannel: Long, prpcmsg: Long, pdwstubphase: Long): Int =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrStubCall2(pthis, pchannel, prpcmsg, pdwstubphase)

public actual fun NdrStubCall3(pthis: Long, pchannel: Long, prpcmsg: Long, pdwstubphase: Long): Int =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrStubCall3(pthis, pchannel, prpcmsg, pdwstubphase)

public actual fun NdrUserMarshalBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrUserMarshalBufferSize(pstubmsg, pmemory, pformat)
}

public actual fun NdrUserMarshalFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrUserMarshalFree(pstubmsg, pmemory, pformat)
}

public actual fun NdrUserMarshalMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrUserMarshalMarshall(pstubmsg, pmemory, pformat)

public actual fun NdrUserMarshalMemorySize(pstubmsg: Long, pformat: Long): UInt =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrUserMarshalMemorySize(pstubmsg, pformat).toUInt()

public actual fun NdrUserMarshalSimpleTypeConvert(pflags: Long, pbuffer: Long, formatchar: UByte): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrUserMarshalSimpleTypeConvert(pflags, pbuffer, formatchar.toByte())

public actual fun NdrUserMarshalUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrUserMarshalUnmarshall(pstubmsg, ppmemory, pformat, fmustalloc.toByte())

public actual fun NdrVaryingArrayBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrVaryingArrayBufferSize(pstubmsg, pmemory, pformat)
}

public actual fun NdrVaryingArrayFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrVaryingArrayFree(pstubmsg, pmemory, pformat)
}

public actual fun NdrVaryingArrayMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrVaryingArrayMarshall(pstubmsg, pmemory, pformat)

public actual fun NdrVaryingArrayMemorySize(pstubmsg: Long, pformat: Long): UInt =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrVaryingArrayMemorySize(pstubmsg, pformat).toUInt()

public actual fun NdrVaryingArrayUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrVaryingArrayUnmarshall(pstubmsg, ppmemory, pformat, fmustalloc.toByte())

public actual fun NdrXmitOrRepAsBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrXmitOrRepAsBufferSize(pstubmsg, pmemory, pformat)
}

public actual fun NdrXmitOrRepAsFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrXmitOrRepAsFree(pstubmsg, pmemory, pformat)
}

public actual fun NdrXmitOrRepAsMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrXmitOrRepAsMarshall(pstubmsg, pmemory, pformat)

public actual fun NdrXmitOrRepAsMemorySize(pstubmsg: Long, pformat: Long): UInt =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrXmitOrRepAsMemorySize(pstubmsg, pformat).toUInt()

public actual fun NdrXmitOrRepAsUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_NdrXmitOrRepAsUnmarshall(pstubmsg, ppmemory, pformat, fmustalloc.toByte())

public actual fun RpcAsyncAbortCall(pasync: Long, exceptioncode: UInt): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcAsyncAbortCall(pasync, exceptioncode.toInt())

public actual fun RpcAsyncCancelCall(pasync: Long, fabort: BOOL): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcAsyncCancelCall(pasync, fabort)

public actual fun RpcAsyncCompleteCall(pasync: Long, reply: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcAsyncCompleteCall(pasync, reply)

public actual fun RpcAsyncGetCallStatus(pasync: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcAsyncGetCallStatus(pasync)

public actual fun RpcAsyncInitializeHandle(pasync: Long, size: UInt): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcAsyncInitializeHandle(pasync, size.toInt())

public actual fun RpcAsyncRegisterInfo(pasync: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcAsyncRegisterInfo(pasync)

public actual fun RpcBindingBind(pasync: Long, binding: Long, ifspec: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcBindingBind(pasync, binding, ifspec)

public actual fun RpcBindingCopy(sourcebinding: Long, destinationbinding: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcBindingCopy(sourcebinding, destinationbinding)

public actual fun RpcBindingCreateA(template: Long, security: Long, options: Long, binding: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcBindingCreateA(template, security, options, binding)

public actual fun RpcBindingCreateW(template: Long, security: Long, options: Long, binding: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcBindingCreateW(template, security, options, binding)

public actual fun RpcBindingFree(binding: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcBindingFree(binding)

public actual fun RpcBindingFromStringBindingA(stringbinding: PCSTR, binding: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcBindingFromStringBindingA(stringbinding, binding)

public actual fun RpcBindingFromStringBindingW(stringbinding: PCWSTR, binding: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcBindingFromStringBindingW(stringbinding, binding)

public actual fun RpcBindingInqAuthClientA(clientbinding: Long, privs: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authzsvc: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcBindingInqAuthClientA(clientbinding, privs, serverprincname, authnlevel, authnsvc, authzsvc)

public actual fun RpcBindingInqAuthClientExA(clientbinding: Long, privs: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authzsvc: Long, flags: UInt): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcBindingInqAuthClientExA(clientbinding, privs, serverprincname, authnlevel, authnsvc, authzsvc, flags.toInt())

public actual fun RpcBindingInqAuthClientExW(clientbinding: Long, privs: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authzsvc: Long, flags: UInt): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcBindingInqAuthClientExW(clientbinding, privs, serverprincname, authnlevel, authnsvc, authzsvc, flags.toInt())

public actual fun RpcBindingInqAuthClientW(clientbinding: Long, privs: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authzsvc: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcBindingInqAuthClientW(clientbinding, privs, serverprincname, authnlevel, authnsvc, authzsvc)

public actual fun RpcBindingInqAuthInfoA(binding: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authidentity: Long, authzsvc: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcBindingInqAuthInfoA(binding, serverprincname, authnlevel, authnsvc, authidentity, authzsvc)

public actual fun RpcBindingInqAuthInfoExA(binding: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authidentity: Long, authzsvc: Long, rpcqosversion: UInt, securityqos: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcBindingInqAuthInfoExA(binding, serverprincname, authnlevel, authnsvc, authidentity, authzsvc, rpcqosversion.toInt(), securityqos)

public actual fun RpcBindingInqAuthInfoExW(binding: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authidentity: Long, authzsvc: Long, rpcqosversion: UInt, securityqos: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcBindingInqAuthInfoExW(binding, serverprincname, authnlevel, authnsvc, authidentity, authzsvc, rpcqosversion.toInt(), securityqos)

public actual fun RpcBindingInqAuthInfoW(binding: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authidentity: Long, authzsvc: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcBindingInqAuthInfoW(binding, serverprincname, authnlevel, authnsvc, authidentity, authzsvc)

public actual fun RpcBindingInqMaxCalls(binding: Long, maxcalls: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcBindingInqMaxCalls(binding, maxcalls)

public actual fun RpcBindingInqObject(binding: Long, objectuuid: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcBindingInqObject(binding, objectuuid)

public actual fun RpcBindingInqOption(hbinding: Long, option: UInt, poptionvalue: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcBindingInqOption(hbinding, option.toInt(), poptionvalue)

public actual fun RpcBindingReset(binding: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcBindingReset(binding)

public actual fun RpcBindingServerFromClient(clientbinding: Long, serverbinding: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcBindingServerFromClient(clientbinding, serverbinding)

public actual fun RpcBindingSetAuthInfoA(binding: Long, serverprincname: PCSTR, authnlevel: UInt, authnsvc: UInt, authidentity: Long, authzsvc: UInt): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcBindingSetAuthInfoA(binding, serverprincname, authnlevel.toInt(), authnsvc.toInt(), authidentity, authzsvc.toInt())

public actual fun RpcBindingSetAuthInfoExA(binding: Long, serverprincname: PCSTR, authnlevel: UInt, authnsvc: UInt, authidentity: Long, authzsvc: UInt, securityqos: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcBindingSetAuthInfoExA(binding, serverprincname, authnlevel.toInt(), authnsvc.toInt(), authidentity, authzsvc.toInt(), securityqos)

public actual fun RpcBindingSetAuthInfoExW(binding: Long, serverprincname: PCWSTR, authnlevel: UInt, authnsvc: UInt, authidentity: Long, authzsvc: UInt, securityqos: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcBindingSetAuthInfoExW(binding, serverprincname, authnlevel.toInt(), authnsvc.toInt(), authidentity, authzsvc.toInt(), securityqos)

public actual fun RpcBindingSetAuthInfoW(binding: Long, serverprincname: PCWSTR, authnlevel: UInt, authnsvc: UInt, authidentity: Long, authzsvc: UInt): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcBindingSetAuthInfoW(binding, serverprincname, authnlevel.toInt(), authnsvc.toInt(), authidentity, authzsvc.toInt())

public actual fun RpcBindingSetObject(binding: Long, objectuuid: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcBindingSetObject(binding, objectuuid)

public actual fun RpcBindingSetOption(hbinding: Long, option: UInt, optionvalue: ULong): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcBindingSetOption(hbinding, option.toInt(), optionvalue.toLong())

public actual fun RpcBindingToStringBindingA(binding: Long, stringbinding: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcBindingToStringBindingA(binding, stringbinding)

public actual fun RpcBindingToStringBindingW(binding: Long, stringbinding: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcBindingToStringBindingW(binding, stringbinding)

public actual fun RpcBindingUnbind(binding: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcBindingUnbind(binding)

public actual fun RpcBindingVectorFree(bindingvector: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcBindingVectorFree(bindingvector)

public actual fun RpcCancelThread(thread: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcCancelThread(thread)

public actual fun RpcCancelThreadEx(thread: Long, timeout: Int): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcCancelThreadEx(thread, timeout)

public actual fun RpcCertGeneratePrincipalNameA(context: Long, flags: UInt, pbuffer: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcCertGeneratePrincipalNameA(context, flags.toInt(), pbuffer)

public actual fun RpcCertGeneratePrincipalNameW(context: Long, flags: UInt, pbuffer: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcCertGeneratePrincipalNameW(context, flags.toInt(), pbuffer)

public actual fun RpcEpRegisterA(ifspec: Long, bindingvector: Long, uuidvector: Long, annotation: PCSTR): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcEpRegisterA(ifspec, bindingvector, uuidvector, annotation)

public actual fun RpcEpRegisterNoReplaceA(ifspec: Long, bindingvector: Long, uuidvector: Long, annotation: PCSTR): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcEpRegisterNoReplaceA(ifspec, bindingvector, uuidvector, annotation)

public actual fun RpcEpRegisterNoReplaceW(ifspec: Long, bindingvector: Long, uuidvector: Long, annotation: PCWSTR): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcEpRegisterNoReplaceW(ifspec, bindingvector, uuidvector, annotation)

public actual fun RpcEpRegisterW(ifspec: Long, bindingvector: Long, uuidvector: Long, annotation: PCWSTR): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcEpRegisterW(ifspec, bindingvector, uuidvector, annotation)

public actual fun RpcEpResolveBinding(binding: Long, ifspec: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcEpResolveBinding(binding, ifspec)

public actual fun RpcEpUnregister(ifspec: Long, bindingvector: Long, uuidvector: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcEpUnregister(ifspec, bindingvector, uuidvector)

public actual fun RpcErrorAddRecord(errorinfo: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcErrorAddRecord(errorinfo)

public actual fun RpcErrorClearInformation() {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcErrorClearInformation()
}

public actual fun RpcErrorEndEnumeration(enumhandle: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcErrorEndEnumeration(enumhandle)

public actual fun RpcErrorGetNextRecord(enumhandle: Long, copystrings: BOOL, errorinfo: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcErrorGetNextRecord(enumhandle, copystrings, errorinfo)

public actual fun RpcErrorGetNumberOfRecords(enumhandle: Long, records: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcErrorGetNumberOfRecords(enumhandle, records)

public actual fun RpcErrorLoadErrorInfo(errorblob: Long, blobsize: ULong, enumhandle: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcErrorLoadErrorInfo(errorblob, blobsize.toLong(), enumhandle)

public actual fun RpcErrorResetEnumeration(enumhandle: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcErrorResetEnumeration(enumhandle)

public actual fun RpcErrorSaveErrorInfo(enumhandle: Long, errorblob: Long, blobsize: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcErrorSaveErrorInfo(enumhandle, errorblob, blobsize)

public actual fun RpcErrorStartEnumeration(enumhandle: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcErrorStartEnumeration(enumhandle)

public actual fun RpcExceptionFilter(exceptioncode: UInt): Int =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcExceptionFilter(exceptioncode.toInt())

public actual fun RpcFreeAuthorizationContext(pauthzclientcontext: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcFreeAuthorizationContext(pauthzclientcontext)

public actual fun RpcGetAuthorizationContextForClient(clientbinding: Long, impersonateonreturn: BOOL, reserved1: Long, pexpirationtime: Long, reserved2: LUID, reserved3: UInt, reserved4: Long, pauthzclientcontext: Long): RPC_STATUS =
    0

public actual fun RpcIfIdVectorFree(ifidvector: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcIfIdVectorFree(ifidvector)

public actual fun RpcIfInqId(rpcifhandle: Long, rpcifid: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcIfInqId(rpcifhandle, rpcifid)

public actual fun RpcImpersonateClient(bindinghandle: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcImpersonateClient(bindinghandle)

public actual fun RpcImpersonateClient2(bindinghandle: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcImpersonateClient2(bindinghandle)

public actual fun RpcImpersonateClientContainer(bindinghandle: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcImpersonateClientContainer(bindinghandle)

public actual fun RpcMgmtEnableIdleCleanup(): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcMgmtEnableIdleCleanup()

public actual fun RpcMgmtEpEltInqBegin(epbinding: Long, inquirytype: UInt, ifid: Long, versoption: UInt, objectuuid: Long, inquirycontext: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcMgmtEpEltInqBegin(epbinding, inquirytype.toInt(), ifid, versoption.toInt(), objectuuid, inquirycontext)

public actual fun RpcMgmtEpEltInqDone(inquirycontext: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcMgmtEpEltInqDone(inquirycontext)

public actual fun RpcMgmtEpEltInqNextA(inquirycontext: Long, ifid: Long, binding: Long, objectuuid: Long, annotation: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcMgmtEpEltInqNextA(inquirycontext, ifid, binding, objectuuid, annotation)

public actual fun RpcMgmtEpEltInqNextW(inquirycontext: Long, ifid: Long, binding: Long, objectuuid: Long, annotation: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcMgmtEpEltInqNextW(inquirycontext, ifid, binding, objectuuid, annotation)

public actual fun RpcMgmtEpUnregister(epbinding: Long, ifid: Long, binding: Long, objectuuid: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcMgmtEpUnregister(epbinding, ifid, binding, objectuuid)

public actual fun RpcMgmtInqComTimeout(binding: Long, timeout: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcMgmtInqComTimeout(binding, timeout)

public actual fun RpcMgmtInqDefaultProtectLevel(authnsvc: UInt, authnlevel: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcMgmtInqDefaultProtectLevel(authnsvc.toInt(), authnlevel)

public actual fun RpcMgmtInqIfIds(binding: Long, ifidvector: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcMgmtInqIfIds(binding, ifidvector)

public actual fun RpcMgmtInqServerPrincNameA(binding: Long, authnsvc: UInt, serverprincname: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcMgmtInqServerPrincNameA(binding, authnsvc.toInt(), serverprincname)

public actual fun RpcMgmtInqServerPrincNameW(binding: Long, authnsvc: UInt, serverprincname: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcMgmtInqServerPrincNameW(binding, authnsvc.toInt(), serverprincname)

public actual fun RpcMgmtInqStats(binding: Long, statistics: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcMgmtInqStats(binding, statistics)

public actual fun RpcMgmtIsServerListening(binding: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcMgmtIsServerListening(binding)

public actual fun RpcMgmtSetAuthorizationFn(authorizationfn: RPC_MGMT_AUTHORIZATION_FN): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcMgmtSetAuthorizationFn(authorizationfn.toLong())

public actual fun RpcMgmtSetCancelTimeout(timeout: Int): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcMgmtSetCancelTimeout(timeout)

public actual fun RpcMgmtSetComTimeout(binding: Long, timeout: UInt): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcMgmtSetComTimeout(binding, timeout.toInt())

public actual fun RpcMgmtSetServerStackSize(threadstacksize: UInt): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcMgmtSetServerStackSize(threadstacksize.toInt())

public actual fun RpcMgmtStatsVectorFree(statsvector: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcMgmtStatsVectorFree(statsvector)

public actual fun RpcMgmtStopServerListening(binding: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcMgmtStopServerListening(binding)

public actual fun RpcMgmtWaitServerListen(): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcMgmtWaitServerListen()

public actual fun RpcNetworkInqProtseqsA(protseqvector: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNetworkInqProtseqsA(protseqvector)

public actual fun RpcNetworkInqProtseqsW(protseqvector: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNetworkInqProtseqsW(protseqvector)

public actual fun RpcNetworkIsProtseqValidA(protseq: PCSTR): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNetworkIsProtseqValidA(protseq)

public actual fun RpcNetworkIsProtseqValidW(protseq: PCWSTR): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNetworkIsProtseqValidW(protseq)

public actual fun RpcNsBindingExportA(entrynamesyntax: UInt, entryname: PCSTR, ifspec: Long, bindingvec: Long, objectuuidvec: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsBindingExportA(entrynamesyntax.toInt(), entryname, ifspec, bindingvec, objectuuidvec)

public actual fun RpcNsBindingExportPnPA(entrynamesyntax: UInt, entryname: PCSTR, ifspec: Long, objectvector: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsBindingExportPnPA(entrynamesyntax.toInt(), entryname, ifspec, objectvector)

public actual fun RpcNsBindingExportPnPW(entrynamesyntax: UInt, entryname: PCWSTR, ifspec: Long, objectvector: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsBindingExportPnPW(entrynamesyntax.toInt(), entryname, ifspec, objectvector)

public actual fun RpcNsBindingExportW(entrynamesyntax: UInt, entryname: PCWSTR, ifspec: Long, bindingvec: Long, objectuuidvec: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsBindingExportW(entrynamesyntax.toInt(), entryname, ifspec, bindingvec, objectuuidvec)

public actual fun RpcNsBindingImportBeginA(entrynamesyntax: UInt, entryname: PCSTR, ifspec: Long, objuuid: Long, importcontext: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsBindingImportBeginA(entrynamesyntax.toInt(), entryname, ifspec, objuuid, importcontext)

public actual fun RpcNsBindingImportBeginW(entrynamesyntax: UInt, entryname: PCWSTR, ifspec: Long, objuuid: Long, importcontext: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsBindingImportBeginW(entrynamesyntax.toInt(), entryname, ifspec, objuuid, importcontext)

public actual fun RpcNsBindingImportDone(importcontext: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsBindingImportDone(importcontext)

public actual fun RpcNsBindingImportNext(importcontext: Long, binding: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsBindingImportNext(importcontext, binding)

public actual fun RpcNsBindingInqEntryNameA(binding: Long, entrynamesyntax: UInt, entryname: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsBindingInqEntryNameA(binding, entrynamesyntax.toInt(), entryname)

public actual fun RpcNsBindingInqEntryNameW(binding: Long, entrynamesyntax: UInt, entryname: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsBindingInqEntryNameW(binding, entrynamesyntax.toInt(), entryname)

public actual fun RpcNsBindingLookupBeginA(entrynamesyntax: UInt, entryname: PCSTR, ifspec: Long, objuuid: Long, bindingmaxcount: UInt, lookupcontext: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsBindingLookupBeginA(entrynamesyntax.toInt(), entryname, ifspec, objuuid, bindingmaxcount.toInt(), lookupcontext)

public actual fun RpcNsBindingLookupBeginW(entrynamesyntax: UInt, entryname: PCWSTR, ifspec: Long, objuuid: Long, bindingmaxcount: UInt, lookupcontext: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsBindingLookupBeginW(entrynamesyntax.toInt(), entryname, ifspec, objuuid, bindingmaxcount.toInt(), lookupcontext)

public actual fun RpcNsBindingLookupDone(lookupcontext: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsBindingLookupDone(lookupcontext)

public actual fun RpcNsBindingLookupNext(lookupcontext: Long, bindingvec: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsBindingLookupNext(lookupcontext, bindingvec)

public actual fun RpcNsBindingSelect(bindingvec: Long, binding: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsBindingSelect(bindingvec, binding)

public actual fun RpcNsBindingUnexportA(entrynamesyntax: UInt, entryname: PCSTR, ifspec: Long, objectuuidvec: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsBindingUnexportA(entrynamesyntax.toInt(), entryname, ifspec, objectuuidvec)

public actual fun RpcNsBindingUnexportPnPA(entrynamesyntax: UInt, entryname: PCSTR, ifspec: Long, objectvector: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsBindingUnexportPnPA(entrynamesyntax.toInt(), entryname, ifspec, objectvector)

public actual fun RpcNsBindingUnexportPnPW(entrynamesyntax: UInt, entryname: PCWSTR, ifspec: Long, objectvector: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsBindingUnexportPnPW(entrynamesyntax.toInt(), entryname, ifspec, objectvector)

public actual fun RpcNsBindingUnexportW(entrynamesyntax: UInt, entryname: PCWSTR, ifspec: Long, objectuuidvec: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsBindingUnexportW(entrynamesyntax.toInt(), entryname, ifspec, objectuuidvec)

public actual fun RpcNsEntryExpandNameA(entrynamesyntax: UInt, entryname: PCSTR, expandedname: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsEntryExpandNameA(entrynamesyntax.toInt(), entryname, expandedname)

public actual fun RpcNsEntryExpandNameW(entrynamesyntax: UInt, entryname: PCWSTR, expandedname: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsEntryExpandNameW(entrynamesyntax.toInt(), entryname, expandedname)

public actual fun RpcNsEntryObjectInqBeginA(entrynamesyntax: UInt, entryname: PCSTR, inquirycontext: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsEntryObjectInqBeginA(entrynamesyntax.toInt(), entryname, inquirycontext)

public actual fun RpcNsEntryObjectInqBeginW(entrynamesyntax: UInt, entryname: PCWSTR, inquirycontext: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsEntryObjectInqBeginW(entrynamesyntax.toInt(), entryname, inquirycontext)

public actual fun RpcNsEntryObjectInqDone(inquirycontext: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsEntryObjectInqDone(inquirycontext)

public actual fun RpcNsEntryObjectInqNext(inquirycontext: Long, objuuid: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsEntryObjectInqNext(inquirycontext, objuuid)

public actual fun RpcNsGroupDeleteA(groupnamesyntax: GROUP_NAME_SYNTAX, groupname: PCSTR): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsGroupDeleteA(groupnamesyntax.toInt(), groupname)

public actual fun RpcNsGroupDeleteW(groupnamesyntax: GROUP_NAME_SYNTAX, groupname: PCWSTR): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsGroupDeleteW(groupnamesyntax.toInt(), groupname)

public actual fun RpcNsGroupMbrAddA(groupnamesyntax: UInt, groupname: PCSTR, membernamesyntax: UInt, membername: PCSTR): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsGroupMbrAddA(groupnamesyntax.toInt(), groupname, membernamesyntax.toInt(), membername)

public actual fun RpcNsGroupMbrAddW(groupnamesyntax: UInt, groupname: PCWSTR, membernamesyntax: UInt, membername: PCWSTR): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsGroupMbrAddW(groupnamesyntax.toInt(), groupname, membernamesyntax.toInt(), membername)

public actual fun RpcNsGroupMbrInqBeginA(groupnamesyntax: UInt, groupname: PCSTR, membernamesyntax: UInt, inquirycontext: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsGroupMbrInqBeginA(groupnamesyntax.toInt(), groupname, membernamesyntax.toInt(), inquirycontext)

public actual fun RpcNsGroupMbrInqBeginW(groupnamesyntax: UInt, groupname: PCWSTR, membernamesyntax: UInt, inquirycontext: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsGroupMbrInqBeginW(groupnamesyntax.toInt(), groupname, membernamesyntax.toInt(), inquirycontext)

public actual fun RpcNsGroupMbrInqDone(inquirycontext: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsGroupMbrInqDone(inquirycontext)

public actual fun RpcNsGroupMbrInqNextA(inquirycontext: Long, membername: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsGroupMbrInqNextA(inquirycontext, membername)

public actual fun RpcNsGroupMbrInqNextW(inquirycontext: Long, membername: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsGroupMbrInqNextW(inquirycontext, membername)

public actual fun RpcNsGroupMbrRemoveA(groupnamesyntax: UInt, groupname: PCSTR, membernamesyntax: UInt, membername: PCSTR): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsGroupMbrRemoveA(groupnamesyntax.toInt(), groupname, membernamesyntax.toInt(), membername)

public actual fun RpcNsGroupMbrRemoveW(groupnamesyntax: UInt, groupname: PCWSTR, membernamesyntax: UInt, membername: PCWSTR): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsGroupMbrRemoveW(groupnamesyntax.toInt(), groupname, membernamesyntax.toInt(), membername)

public actual fun RpcNsMgmtBindingUnexportA(entrynamesyntax: UInt, entryname: PCSTR, ifid: Long, versoption: UInt, objectuuidvec: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsMgmtBindingUnexportA(entrynamesyntax.toInt(), entryname, ifid, versoption.toInt(), objectuuidvec)

public actual fun RpcNsMgmtBindingUnexportW(entrynamesyntax: UInt, entryname: PCWSTR, ifid: Long, versoption: UInt, objectuuidvec: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsMgmtBindingUnexportW(entrynamesyntax.toInt(), entryname, ifid, versoption.toInt(), objectuuidvec)

public actual fun RpcNsMgmtEntryCreateA(entrynamesyntax: UInt, entryname: PCSTR): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsMgmtEntryCreateA(entrynamesyntax.toInt(), entryname)

public actual fun RpcNsMgmtEntryCreateW(entrynamesyntax: UInt, entryname: PCWSTR): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsMgmtEntryCreateW(entrynamesyntax.toInt(), entryname)

public actual fun RpcNsMgmtEntryDeleteA(entrynamesyntax: UInt, entryname: PCSTR): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsMgmtEntryDeleteA(entrynamesyntax.toInt(), entryname)

public actual fun RpcNsMgmtEntryDeleteW(entrynamesyntax: UInt, entryname: PCWSTR): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsMgmtEntryDeleteW(entrynamesyntax.toInt(), entryname)

public actual fun RpcNsMgmtEntryInqIfIdsA(entrynamesyntax: UInt, entryname: PCSTR, ifidvec: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsMgmtEntryInqIfIdsA(entrynamesyntax.toInt(), entryname, ifidvec)

public actual fun RpcNsMgmtEntryInqIfIdsW(entrynamesyntax: UInt, entryname: PCWSTR, ifidvec: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsMgmtEntryInqIfIdsW(entrynamesyntax.toInt(), entryname, ifidvec)

public actual fun RpcNsMgmtHandleSetExpAge(nshandle: Long, expirationage: UInt): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsMgmtHandleSetExpAge(nshandle, expirationage.toInt())

public actual fun RpcNsMgmtInqExpAge(expirationage: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsMgmtInqExpAge(expirationage)

public actual fun RpcNsMgmtSetExpAge(expirationage: UInt): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsMgmtSetExpAge(expirationage.toInt())

public actual fun RpcNsProfileDeleteA(profilenamesyntax: UInt, profilename: PCSTR): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsProfileDeleteA(profilenamesyntax.toInt(), profilename)

public actual fun RpcNsProfileDeleteW(profilenamesyntax: UInt, profilename: PCWSTR): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsProfileDeleteW(profilenamesyntax.toInt(), profilename)

public actual fun RpcNsProfileEltAddA(profilenamesyntax: UInt, profilename: PCSTR, ifid: Long, membernamesyntax: UInt, membername: PCSTR, priority: UInt, annotation: PCSTR): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsProfileEltAddA(profilenamesyntax.toInt(), profilename, ifid, membernamesyntax.toInt(), membername, priority.toInt(), annotation)

public actual fun RpcNsProfileEltAddW(profilenamesyntax: UInt, profilename: PCWSTR, ifid: Long, membernamesyntax: UInt, membername: PCWSTR, priority: UInt, annotation: PCWSTR): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsProfileEltAddW(profilenamesyntax.toInt(), profilename, ifid, membernamesyntax.toInt(), membername, priority.toInt(), annotation)

public actual fun RpcNsProfileEltInqBeginA(profilenamesyntax: UInt, profilename: PCSTR, inquirytype: UInt, ifid: Long, versoption: UInt, membernamesyntax: UInt, membername: PCSTR, inquirycontext: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsProfileEltInqBeginA(profilenamesyntax.toInt(), profilename, inquirytype.toInt(), ifid, versoption.toInt(), membernamesyntax.toInt(), membername, inquirycontext)

public actual fun RpcNsProfileEltInqBeginW(profilenamesyntax: UInt, profilename: PCWSTR, inquirytype: UInt, ifid: Long, versoption: UInt, membernamesyntax: UInt, membername: PCWSTR, inquirycontext: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsProfileEltInqBeginW(profilenamesyntax.toInt(), profilename, inquirytype.toInt(), ifid, versoption.toInt(), membernamesyntax.toInt(), membername, inquirycontext)

public actual fun RpcNsProfileEltInqDone(inquirycontext: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsProfileEltInqDone(inquirycontext)

public actual fun RpcNsProfileEltInqNextA(inquirycontext: Long, ifid: Long, membername: Long, priority: Long, annotation: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsProfileEltInqNextA(inquirycontext, ifid, membername, priority, annotation)

public actual fun RpcNsProfileEltInqNextW(inquirycontext: Long, ifid: Long, membername: Long, priority: Long, annotation: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsProfileEltInqNextW(inquirycontext, ifid, membername, priority, annotation)

public actual fun RpcNsProfileEltRemoveA(profilenamesyntax: UInt, profilename: PCSTR, ifid: Long, membernamesyntax: UInt, membername: PCSTR): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsProfileEltRemoveA(profilenamesyntax.toInt(), profilename, ifid, membernamesyntax.toInt(), membername)

public actual fun RpcNsProfileEltRemoveW(profilenamesyntax: UInt, profilename: PCWSTR, ifid: Long, membernamesyntax: UInt, membername: PCWSTR): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcNsProfileEltRemoveW(profilenamesyntax.toInt(), profilename, ifid, membernamesyntax.toInt(), membername)

public actual fun RpcObjectInqType(objuuid: Long, typeuuid: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcObjectInqType(objuuid, typeuuid)

public actual fun RpcObjectSetInqFn(inquiryfn: RPC_OBJECT_INQ_FN): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcObjectSetInqFn(inquiryfn.toLong())

public actual fun RpcObjectSetType(objuuid: Long, typeuuid: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcObjectSetType(objuuid, typeuuid)

public actual fun RpcProtseqVectorFreeA(protseqvector: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcProtseqVectorFreeA(protseqvector)

public actual fun RpcProtseqVectorFreeW(protseqvector: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcProtseqVectorFreeW(protseqvector)

public actual fun RpcRaiseException(exception: RPC_STATUS) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcRaiseException(exception)
}

public actual fun RpcRevertContainerImpersonation(): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcRevertContainerImpersonation()

public actual fun RpcRevertToSelf(): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcRevertToSelf()

public actual fun RpcRevertToSelfEx(bindinghandle: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcRevertToSelfEx(bindinghandle)

public actual fun RpcServerCompleteSecurityCallback(bindinghandle: Long, status: RPC_STATUS): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcServerCompleteSecurityCallback(bindinghandle, status)

public actual fun RpcServerInqBindingHandle(binding: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcServerInqBindingHandle(binding)

public actual fun RpcServerInqBindings(bindingvector: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcServerInqBindings(bindingvector)

public actual fun RpcServerInqBindingsEx(securitydescriptor: Long, bindingvector: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcServerInqBindingsEx(securitydescriptor, bindingvector)

public actual fun RpcServerInqCallAttributesA(clientbinding: Long, rpccallattributes: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcServerInqCallAttributesA(clientbinding, rpccallattributes)

public actual fun RpcServerInqCallAttributesW(clientbinding: Long, rpccallattributes: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcServerInqCallAttributesW(clientbinding, rpccallattributes)

public actual fun RpcServerInqDefaultPrincNameA(authnsvc: UInt, princname: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcServerInqDefaultPrincNameA(authnsvc.toInt(), princname)

public actual fun RpcServerInqDefaultPrincNameW(authnsvc: UInt, princname: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcServerInqDefaultPrincNameW(authnsvc.toInt(), princname)

public actual fun RpcServerInqIf(ifspec: Long, mgrtypeuuid: Long, mgrepv: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcServerInqIf(ifspec, mgrtypeuuid, mgrepv)

public actual fun RpcServerInterfaceGroupActivate(ifgroup: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcServerInterfaceGroupActivate(ifgroup)

public actual fun RpcServerInterfaceGroupClose(ifgroup: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcServerInterfaceGroupClose(ifgroup)

public actual fun RpcServerInterfaceGroupCreateA(interfaces: Long, numifs: UInt, endpoints: Long, numendpoints: UInt, idleperiod: UInt, idlecallbackfn: RPC_INTERFACE_GROUP_IDLE_CALLBACK_FN, idlecallbackcontext: Long, ifgroup: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcServerInterfaceGroupCreateA(interfaces, numifs.toInt(), endpoints, numendpoints.toInt(), idleperiod.toInt(), idlecallbackfn.toLong(), idlecallbackcontext, ifgroup)

public actual fun RpcServerInterfaceGroupCreateW(interfaces: Long, numifs: UInt, endpoints: Long, numendpoints: UInt, idleperiod: UInt, idlecallbackfn: RPC_INTERFACE_GROUP_IDLE_CALLBACK_FN, idlecallbackcontext: Long, ifgroup: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcServerInterfaceGroupCreateW(interfaces, numifs.toInt(), endpoints, numendpoints.toInt(), idleperiod.toInt(), idlecallbackfn.toLong(), idlecallbackcontext, ifgroup)

public actual fun RpcServerInterfaceGroupDeactivate(ifgroup: Long, forcedeactivation: UInt): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcServerInterfaceGroupDeactivate(ifgroup, forcedeactivation.toInt())

public actual fun RpcServerInterfaceGroupInqBindings(ifgroup: Long, bindingvector: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcServerInterfaceGroupInqBindings(ifgroup, bindingvector)

public actual fun RpcServerListen(minimumcallthreads: UInt, maxcalls: UInt, dontwait: UInt): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcServerListen(minimumcallthreads.toInt(), maxcalls.toInt(), dontwait.toInt())

public actual fun RpcServerRegisterAuthInfoA(serverprincname: PCSTR, authnsvc: UInt, getkeyfn: RPC_AUTH_KEY_RETRIEVAL_FN, arg: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcServerRegisterAuthInfoA(serverprincname, authnsvc.toInt(), getkeyfn.toLong(), arg)

public actual fun RpcServerRegisterAuthInfoW(serverprincname: PCWSTR, authnsvc: UInt, getkeyfn: RPC_AUTH_KEY_RETRIEVAL_FN, arg: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcServerRegisterAuthInfoW(serverprincname, authnsvc.toInt(), getkeyfn.toLong(), arg)

public actual fun RpcServerRegisterIf(ifspec: Long, mgrtypeuuid: Long, mgrepv: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcServerRegisterIf(ifspec, mgrtypeuuid, mgrepv)

public actual fun RpcServerRegisterIf2(ifspec: Long, mgrtypeuuid: Long, mgrepv: Long, flags: UInt, maxcalls: UInt, maxrpcsize: UInt, ifcallbackfn: RPC_IF_CALLBACK_FN): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcServerRegisterIf2(ifspec, mgrtypeuuid, mgrepv, flags.toInt(), maxcalls.toInt(), maxrpcsize.toInt(), ifcallbackfn.toLong())

public actual fun RpcServerRegisterIf3(ifspec: Long, mgrtypeuuid: Long, mgrepv: Long, flags: UInt, maxcalls: UInt, maxrpcsize: UInt, ifcallback: RPC_IF_CALLBACK_FN, securitydescriptor: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcServerRegisterIf3(ifspec, mgrtypeuuid, mgrepv, flags.toInt(), maxcalls.toInt(), maxrpcsize.toInt(), ifcallback.toLong(), securitydescriptor)

public actual fun RpcServerRegisterIfEx(ifspec: Long, mgrtypeuuid: Long, mgrepv: Long, flags: UInt, maxcalls: UInt, ifcallback: RPC_IF_CALLBACK_FN): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcServerRegisterIfEx(ifspec, mgrtypeuuid, mgrepv, flags.toInt(), maxcalls.toInt(), ifcallback.toLong())

public actual fun RpcServerSubscribeForNotification(binding: Long, notification: RPC_NOTIFICATIONS, notificationtype: RPC_NOTIFICATION_TYPES, notificationinfo: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcServerSubscribeForNotification(binding, notification, notificationtype, notificationinfo)

public actual fun RpcServerTestCancel(bindinghandle: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcServerTestCancel(bindinghandle)

public actual fun RpcServerUnregisterIf(ifspec: Long, mgrtypeuuid: Long, waitforcallstocomplete: UInt): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcServerUnregisterIf(ifspec, mgrtypeuuid, waitforcallstocomplete.toInt())

public actual fun RpcServerUnregisterIfEx(ifspec: Long, mgrtypeuuid: Long, rundowncontexthandles: Int): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcServerUnregisterIfEx(ifspec, mgrtypeuuid, rundowncontexthandles)

public actual fun RpcServerUnsubscribeForNotification(binding: Long, notification: RPC_NOTIFICATIONS, notificationsqueued: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcServerUnsubscribeForNotification(binding, notification, notificationsqueued)

public actual fun RpcServerUseAllProtseqs(maxcalls: UInt, securitydescriptor: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcServerUseAllProtseqs(maxcalls.toInt(), securitydescriptor)

public actual fun RpcServerUseAllProtseqsEx(maxcalls: UInt, securitydescriptor: Long, policy: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcServerUseAllProtseqsEx(maxcalls.toInt(), securitydescriptor, policy)

public actual fun RpcServerUseAllProtseqsIf(maxcalls: UInt, ifspec: Long, securitydescriptor: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcServerUseAllProtseqsIf(maxcalls.toInt(), ifspec, securitydescriptor)

public actual fun RpcServerUseAllProtseqsIfEx(maxcalls: UInt, ifspec: Long, securitydescriptor: Long, policy: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcServerUseAllProtseqsIfEx(maxcalls.toInt(), ifspec, securitydescriptor, policy)

public actual fun RpcServerUseProtseqA(protseq: PCSTR, maxcalls: UInt, securitydescriptor: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcServerUseProtseqA(protseq, maxcalls.toInt(), securitydescriptor)

public actual fun RpcServerUseProtseqEpA(protseq: PCSTR, maxcalls: UInt, endpoint: PCSTR, securitydescriptor: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcServerUseProtseqEpA(protseq, maxcalls.toInt(), endpoint, securitydescriptor)

public actual fun RpcServerUseProtseqEpExA(protseq: PCSTR, maxcalls: UInt, endpoint: PCSTR, securitydescriptor: Long, policy: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcServerUseProtseqEpExA(protseq, maxcalls.toInt(), endpoint, securitydescriptor, policy)

public actual fun RpcServerUseProtseqEpExW(protseq: PCWSTR, maxcalls: UInt, endpoint: PCWSTR, securitydescriptor: Long, policy: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcServerUseProtseqEpExW(protseq, maxcalls.toInt(), endpoint, securitydescriptor, policy)

public actual fun RpcServerUseProtseqEpW(protseq: PCWSTR, maxcalls: UInt, endpoint: PCWSTR, securitydescriptor: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcServerUseProtseqEpW(protseq, maxcalls.toInt(), endpoint, securitydescriptor)

public actual fun RpcServerUseProtseqExA(protseq: PCSTR, maxcalls: UInt, securitydescriptor: Long, policy: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcServerUseProtseqExA(protseq, maxcalls.toInt(), securitydescriptor, policy)

public actual fun RpcServerUseProtseqExW(protseq: PCWSTR, maxcalls: UInt, securitydescriptor: Long, policy: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcServerUseProtseqExW(protseq, maxcalls.toInt(), securitydescriptor, policy)

public actual fun RpcServerUseProtseqIfA(protseq: PCSTR, maxcalls: UInt, ifspec: Long, securitydescriptor: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcServerUseProtseqIfA(protseq, maxcalls.toInt(), ifspec, securitydescriptor)

public actual fun RpcServerUseProtseqIfExA(protseq: PCSTR, maxcalls: UInt, ifspec: Long, securitydescriptor: Long, policy: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcServerUseProtseqIfExA(protseq, maxcalls.toInt(), ifspec, securitydescriptor, policy)

public actual fun RpcServerUseProtseqIfExW(protseq: PCWSTR, maxcalls: UInt, ifspec: Long, securitydescriptor: Long, policy: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcServerUseProtseqIfExW(protseq, maxcalls.toInt(), ifspec, securitydescriptor, policy)

public actual fun RpcServerUseProtseqIfW(protseq: PCWSTR, maxcalls: UInt, ifspec: Long, securitydescriptor: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcServerUseProtseqIfW(protseq, maxcalls.toInt(), ifspec, securitydescriptor)

public actual fun RpcServerUseProtseqW(protseq: PCWSTR, maxcalls: UInt, securitydescriptor: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcServerUseProtseqW(protseq, maxcalls.toInt(), securitydescriptor)

public actual fun RpcServerYield() {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcServerYield()
}

public actual fun RpcSmAllocate(size: ULong, pstatus: Long): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcSmAllocate(size.toLong(), pstatus)

public actual fun RpcSmClientFree(pnodetofree: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcSmClientFree(pnodetofree)

public actual fun RpcSmDestroyClientContext(contexthandle: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcSmDestroyClientContext(contexthandle)

public actual fun RpcSmDisableAllocate(): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcSmDisableAllocate()

public actual fun RpcSmEnableAllocate(): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcSmEnableAllocate()

public actual fun RpcSmFree(nodetofree: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcSmFree(nodetofree)

public actual fun RpcSmGetThreadHandle(pstatus: Long): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcSmGetThreadHandle(pstatus)

public actual fun RpcSmSetClientAllocFree(clientalloc: RPC_CLIENT_ALLOC, clientfree: RPC_CLIENT_FREE): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcSmSetClientAllocFree(clientalloc.toLong(), clientfree.toLong())

public actual fun RpcSmSetThreadHandle(id: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcSmSetThreadHandle(id)

public actual fun RpcSmSwapClientAllocFree(clientalloc: RPC_CLIENT_ALLOC, clientfree: RPC_CLIENT_FREE, oldclientalloc: Long, oldclientfree: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcSmSwapClientAllocFree(clientalloc.toLong(), clientfree.toLong(), oldclientalloc, oldclientfree)

public actual fun RpcSsAllocate(size: ULong): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcSsAllocate(size.toLong())

public actual fun RpcSsContextLockExclusive(serverbindinghandle: Long, usercontext: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcSsContextLockExclusive(serverbindinghandle, usercontext)

public actual fun RpcSsContextLockShared(serverbindinghandle: Long, usercontext: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcSsContextLockShared(serverbindinghandle, usercontext)

public actual fun RpcSsDestroyClientContext(contexthandle: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcSsDestroyClientContext(contexthandle)
}

public actual fun RpcSsDisableAllocate() {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcSsDisableAllocate()
}

public actual fun RpcSsDontSerializeContext() {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcSsDontSerializeContext()
}

public actual fun RpcSsEnableAllocate() {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcSsEnableAllocate()
}

public actual fun RpcSsFree(nodetofree: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcSsFree(nodetofree)
}

public actual fun RpcSsGetContextBinding(contexthandle: Long, binding: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcSsGetContextBinding(contexthandle, binding)

public actual fun RpcSsGetThreadHandle(): Long =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcSsGetThreadHandle()

public actual fun RpcSsSetClientAllocFree(clientalloc: RPC_CLIENT_ALLOC, clientfree: RPC_CLIENT_FREE) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcSsSetClientAllocFree(clientalloc.toLong(), clientfree.toLong())
}

public actual fun RpcSsSetThreadHandle(id: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcSsSetThreadHandle(id)
}

public actual fun RpcSsSwapClientAllocFree(clientalloc: RPC_CLIENT_ALLOC, clientfree: RPC_CLIENT_FREE, oldclientalloc: Long, oldclientfree: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcSsSwapClientAllocFree(clientalloc.toLong(), clientfree.toLong(), oldclientalloc, oldclientfree)
}

public actual fun RpcStringBindingComposeA(objuuid: PCSTR, protseq: PCSTR, networkaddr: PCSTR, endpoint: PCSTR, options: PCSTR, stringbinding: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcStringBindingComposeA(objuuid, protseq, networkaddr, endpoint, options, stringbinding)

public actual fun RpcStringBindingComposeW(objuuid: PCWSTR, protseq: PCWSTR, networkaddr: PCWSTR, endpoint: PCWSTR, options: PCWSTR, stringbinding: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcStringBindingComposeW(objuuid, protseq, networkaddr, endpoint, options, stringbinding)

public actual fun RpcStringBindingParseA(stringbinding: PCSTR, objuuid: Long, protseq: Long, networkaddr: Long, endpoint: Long, networkoptions: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcStringBindingParseA(stringbinding, objuuid, protseq, networkaddr, endpoint, networkoptions)

public actual fun RpcStringBindingParseW(stringbinding: PCWSTR, objuuid: Long, protseq: Long, networkaddr: Long, endpoint: Long, networkoptions: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcStringBindingParseW(stringbinding, objuuid, protseq, networkaddr, endpoint, networkoptions)

public actual fun RpcStringFreeA(string: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcStringFreeA(string)

public actual fun RpcStringFreeW(string: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcStringFreeW(string)

public actual fun RpcTestCancel(): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcTestCancel()

public actual fun RpcUserFree(asynchandle: Long, pbuffer: Long) {
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_RpcUserFree(asynchandle, pbuffer)
}

public actual fun UuidCompare(uuid1: Long, uuid2: Long, status: Long): Int =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_UuidCompare(uuid1, uuid2, status)

public actual fun UuidCreate(uuid: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_UuidCreate(uuid)

public actual fun UuidCreateNil(niluuid: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_UuidCreateNil(niluuid)

public actual fun UuidCreateSequential(uuid: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_UuidCreateSequential(uuid)

public actual fun UuidEqual(uuid1: Long, uuid2: Long, status: Long): Int =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_UuidEqual(uuid1, uuid2, status)

public actual fun UuidFromStringA(stringuuid: PCSTR, uuid: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_UuidFromStringA(stringuuid, uuid)

public actual fun UuidFromStringW(stringuuid: PCWSTR, uuid: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_UuidFromStringW(stringuuid, uuid)

public actual fun UuidHash(uuid: Long, status: Long): UShort =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_UuidHash(uuid, status).toUShort()

public actual fun UuidIsNil(uuid: Long, status: Long): Int =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_UuidIsNil(uuid, status)

public actual fun UuidToStringA(uuid: Long, stringuuid: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_UuidToStringA(uuid, stringuuid)

public actual fun UuidToStringW(uuid: Long, stringuuid: Long): RPC_STATUS =
    WindowsWin32SystemRpcJniBridge.windowssys_windows_win32_system_rpc_UuidToStringW(uuid, stringuuid)
