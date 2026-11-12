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

private object WindowsWin32SystemRpcJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcDceErrorInqTextA(rpcstatus: Int, errortext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcDceErrorInqTextW(rpcstatus: Int, errortext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIunknownAddRefProxy(thisRef: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIunknownQueryInterfaceProxy(thisRef: Long, riid: Long, ppvobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIunknownReleaseProxy(thisRef: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcAllocate(size: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcAsyncAbortCall(pasync: Long, exceptioncode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcAsyncSetHandle(message: Long, pasync: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcBindingCopy(sourcebinding: Long, destinationbinding: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcBindingCreateNp(servername: Long, servicename: Long, networkoptions: Long, binding: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcBindingHandleToAsyncHandle(binding: Long, asynchandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcBindingInqClientTokenAttributes(binding: Long, tokenid: Long, authenticationid: Long, modifiedid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcBindingInqDynamicEndpointA(binding: Long, dynamicendpoint: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcBindingInqDynamicEndpointW(binding: Long, dynamicendpoint: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcBindingInqLocalClientPid(binding: Long, pid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcBindingInqMarshalledTargetInfo(binding: Long, marshalledtargetinfosize: Long, marshalledtargetinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcBindingInqSecurityContext(binding: Long, securitycontexthandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcBindingInqSecurityContextKeyInfo(binding: Long, keyinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcBindingInqTransportType(binding: Long, type: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcBindingInqWireIdForSnego(binding: Long, wireid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcBindingIsClientLocal(bindinghandle: Long, clientlocalflag: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcBindingIsServerLocal(binding: Long, serverlocalflag: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcBindingSetPrivateOption(hbinding: Long, option: Int, optionvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcBindingToStaticStringBindingW(binding: Long, stringbinding: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcClearMutex(mutex: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcDeleteMutex(mutex: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcExceptionFilter(exceptioncode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcFree(obj: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcFreeBuffer(message: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcFreePipeBuffer(message: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcGetBuffer(message: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcGetBufferWithObject(message: Long, objectuuid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcGetCurrentCallHandle(): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcGetDefaultSd(ppsecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcGetExtendedError(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcIfInqTransferSyntaxes(rpcifhandle: Long, transfersyntaxes: Long, transfersyntaxsize: Int, transfersyntaxcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcMapWin32Status(status: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcMgmtEnableDedicatedThreadPool(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcNegotiateTransferSyntax(message: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcNsBindingSetEntryNameA(binding: Long, entrynamesyntax: Int, entryname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcNsBindingSetEntryNameW(binding: Long, entrynamesyntax: Int, entryname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcNsGetBuffer(message: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcNsInterfaceExported(entrynamesyntax: Int, entryname: Long, rpcinterfaceinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcNsInterfaceUnexported(entrynamesyntax: Int, entryname: Long, rpcinterfaceinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcNsRaiseException(message: Long, status: Int)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcNsSendReceive(message: Long, handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcOpenClientProcess(binding: Long, desiredaccess: Int, clientprocess: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcPauseExecution(milliseconds: Int)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcReBindBuffer(message: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcReallocPipeBuffer(message: Long, newsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcReceive(message: Long, size: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcRecordCalloutFailure(rpcstatus: Int, calloutstate: Long, dllname: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcRequestMutex(mutex: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcSend(message: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcSendReceive(message: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcServerCheckClientRestriction(context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcServerDisableExceptionFilter(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcServerGetAssociationId(binding: Long, associationid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcServerInqAddressChangeFn(): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcServerInqLocalConnAddress(binding: Long, buffer: Long, buffersize: Long, addressformat: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcServerInqRemoteConnAddress(binding: Long, buffer: Long, buffersize: Long, addressformat: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcServerInqTransportType(type: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcServerRegisterForwardFunction(pforwardfunction: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcServerSetAddressChangeFn(paddresschangefn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcServerStartService(protseq: Long, endpoint: Long, ifspec: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcServerSubscribeForDisconnectNotification(binding: Long, hevent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcServerSubscribeForDisconnectNotification2(binding: Long, hevent: Long, subscriptionid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcServerUseProtseq2A(networkaddress: Long, protseq: Long, maxcalls: Int, securitydescriptor: Long, policy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcServerUseProtseq2W(networkaddress: Long, protseq: Long, maxcalls: Int, securitydescriptor: Long, policy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcServerUseProtseqEp2A(networkaddress: Long, protseq: Long, maxcalls: Int, endpoint: Long, securitydescriptor: Long, policy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcServerUseProtseqEp2W(networkaddress: Long, protseq: Long, maxcalls: Int, endpoint: Long, securitydescriptor: Long, policy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcSessionStrictContextHandle()

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcSsDontSerializeContext()

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcSystemHandleTypeSpecificWork(handle: Long, actualtype: Byte, idltype: Byte, marshaldirection: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIRpcTurnOnEeinfoPropagation(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcIUuidCreate(uuid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcMesBufferHandleReset(handle: Long, handlestyle: Int, operation: Int, pbuffer: Long, buffersize: Int, pencodedsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcMesDecodeBufferHandleCreate(buffer: Long, buffersize: Int, phandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcMesDecodeIncrementalHandleCreate(userstate: Long, readfn: Long, phandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcMesEncodeDynBufferHandleCreate(pbuffer: Long, pencodedsize: Long, phandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcMesEncodeFixedBufferHandleCreate(pbuffer: Long, buffersize: Int, pencodedsize: Long, phandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcMesEncodeIncrementalHandleCreate(userstate: Long, allocfn: Long, writefn: Long, phandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcMesHandleFree(handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcMesIncrementalHandleReset(handle: Long, userstate: Long, allocfn: Long, writefn: Long, readfn: Long, operation: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcMesInqProcEncodingId(handle: Long, pinterfaceid: Long, pprocnum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNDRCContextBinding(ccontext: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNDRCContextMarshall(ccontext: Long, pbuff: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNDRCContextUnmarshall(pccontext: Long, hbinding: Long, pbuff: Long, datarepresentation: Int)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNDRSContextMarshall(ccontext: Long, pbuff: Long, userrundownin: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNDRSContextMarshall2(bindinghandle: Long, ccontext: Long, pbuff: Long, userrundownin: Long, ctxguard: Long, flags: Int)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNDRSContextMarshallEx(bindinghandle: Long, ccontext: Long, pbuff: Long, userrundownin: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNDRSContextUnmarshall(pbuff: Long, datarepresentation: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNDRSContextUnmarshall2(bindinghandle: Long, pbuff: Long, datarepresentation: Int, ctxguard: Long, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNDRSContextUnmarshallEx(bindinghandle: Long, pbuff: Long, datarepresentation: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdr64AsyncServerCall64(prpcmsg: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdr64AsyncServerCallAll(prpcmsg: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdr64DcomAsyncStubCall(pthis: Long, pchannel: Long, prpcmsg: Long, pdwstubphase: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrAllocate(pstubmsg: Long, len: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrAsyncServerCall(prpcmsg: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrByteCountPointerBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrByteCountPointerFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrByteCountPointerMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrByteCountPointerUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrClearOutParameters(pstubmsg: Long, pformat: Long, argaddr: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrClientContextMarshall(pstubmsg: Long, contexthandle: Long, fcheck: Int)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrClientContextUnmarshall(pstubmsg: Long, pcontexthandle: Long, bindhandle: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrClientInitialize(prpcmsg: Long, pstubmsg: Long, pstubdescriptor: Long, procnum: Int)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrClientInitializeNew(prpcmsg: Long, pstubmsg: Long, pstubdescriptor: Long, procnum: Int)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrComplexArrayBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrComplexArrayFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrComplexArrayMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrComplexArrayMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrComplexArrayUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrComplexStructBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrComplexStructFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrComplexStructMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrComplexStructMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrComplexStructUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrConformantArrayBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrConformantArrayFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrConformantArrayMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrConformantArrayMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrConformantArrayUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrConformantStringBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrConformantStringMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrConformantStringMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrConformantStringUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrConformantStructBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrConformantStructFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrConformantStructMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrConformantStructMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrConformantStructUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrConformantVaryingArrayBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrConformantVaryingArrayFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrConformantVaryingArrayMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrConformantVaryingArrayMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrConformantVaryingArrayUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrConformantVaryingStructBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrConformantVaryingStructFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrConformantVaryingStructMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrConformantVaryingStructMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrConformantVaryingStructUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrContextHandleInitialize(pstubmsg: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrContextHandleSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrConvert(pstubmsg: Long, pformat: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrConvert2(pstubmsg: Long, pformat: Long, numberparams: Int)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrCorrelationFree(pstubmsg: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrCorrelationInitialize(pstubmsg: Long, pmemory: Long, cachesize: Int, flags: Int)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrCorrelationPass(pstubmsg: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrCreateServerInterfaceFromStub(pstub: Long, pserverif: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrDcomAsyncStubCall(pthis: Long, pchannel: Long, prpcmsg: Long, pdwstubphase: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrEncapsulatedUnionBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrEncapsulatedUnionFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrEncapsulatedUnionMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrEncapsulatedUnionMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrEncapsulatedUnionUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrFixedArrayBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrFixedArrayFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrFixedArrayMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrFixedArrayMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrFixedArrayUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrFreeBuffer(pstubmsg: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrFullPointerXlatFree(pxlattables: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrFullPointerXlatInit(numberofpointers: Int, xlatside: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrGetBuffer(pstubmsg: Long, bufferlength: Int, handle: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrGetDcomProtocolVersion(pstubmsg: Long, pversion: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrGetUserMarshalInfo(pflags: Long, informationlevel: Int, pmarshalinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrInterfacePointerBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrInterfacePointerFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrInterfacePointerMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrInterfacePointerMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrInterfacePointerUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrMapCommAndFaultStatus(pstubmsg: Long, pcommstatus: Long, pfaultstatus: Long, status: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrMesProcEncodeDecode(handle: Long, pstubdesc: Long, pformatstring: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrMesSimpleTypeAlignSize(param0: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrMesSimpleTypeAlignSizeAll(handle: Long, pproxyinfo: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrMesSimpleTypeDecode(handle: Long, pobject: Long, size: Short)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrMesSimpleTypeDecodeAll(handle: Long, pproxyinfo: Long, pobject: Long, size: Short)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrMesSimpleTypeEncode(handle: Long, pstubdesc: Long, pobject: Long, size: Short)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrMesSimpleTypeEncodeAll(handle: Long, pproxyinfo: Long, pobject: Long, size: Short)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrMesTypeAlignSize(handle: Long, pstubdesc: Long, pformatstring: Long, pobject: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrMesTypeAlignSize2(handle: Long, ppicklinginfo: Long, pstubdesc: Long, pformatstring: Long, pobject: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrMesTypeAlignSize3(handle: Long, ppicklinginfo: Long, pproxyinfo: Long, arrtypeoffset: Long, ntypeindex: Int, pobject: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrMesTypeDecode(handle: Long, pstubdesc: Long, pformatstring: Long, pobject: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrMesTypeDecode2(handle: Long, ppicklinginfo: Long, pstubdesc: Long, pformatstring: Long, pobject: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrMesTypeDecode3(handle: Long, ppicklinginfo: Long, pproxyinfo: Long, arrtypeoffset: Long, ntypeindex: Int, pobject: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrMesTypeEncode(handle: Long, pstubdesc: Long, pformatstring: Long, pobject: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrMesTypeEncode2(handle: Long, ppicklinginfo: Long, pstubdesc: Long, pformatstring: Long, pobject: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrMesTypeEncode3(handle: Long, ppicklinginfo: Long, pproxyinfo: Long, arrtypeoffset: Long, ntypeindex: Int, pobject: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrMesTypeFree2(handle: Long, ppicklinginfo: Long, pstubdesc: Long, pformatstring: Long, pobject: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrMesTypeFree3(handle: Long, ppicklinginfo: Long, pproxyinfo: Long, arrtypeoffset: Long, ntypeindex: Int, pobject: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrNonConformantStringBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrNonConformantStringMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrNonConformantStringMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrNonConformantStringUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrNonEncapsulatedUnionBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrNonEncapsulatedUnionFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrNonEncapsulatedUnionMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrNonEncapsulatedUnionMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrNonEncapsulatedUnionUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrNsGetBuffer(pstubmsg: Long, bufferlength: Int, handle: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrNsSendReceive(pstubmsg: Long, pbufferend: Long, pautohandle: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrOleAllocate(size: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrOleFree(nodetofree: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrPartialIgnoreClientBufferSize(pstubmsg: Long, pmemory: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrPartialIgnoreClientMarshall(pstubmsg: Long, pmemory: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrPartialIgnoreServerInitialize(pstubmsg: Long, ppmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrPartialIgnoreServerUnmarshall(pstubmsg: Long, ppmemory: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrPointerBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrPointerFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrPointerMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrPointerMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrPointerUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrRangeUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrRpcSmClientAllocate(size: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrRpcSmClientFree(nodetofree: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrRpcSmSetClientToOsf(pmessage: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrRpcSsDefaultAllocate(size: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrRpcSsDefaultFree(nodetofree: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrRpcSsDisableAllocate(pmessage: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrRpcSsEnableAllocate(pmessage: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrSendReceive(pstubmsg: Long, pbufferend: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrServerCall2(prpcmsg: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrServerCallAll(prpcmsg: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrServerCallNdr64(prpcmsg: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrServerContextMarshall(pstubmsg: Long, contexthandle: Long, rundownroutine: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrServerContextNewMarshall(pstubmsg: Long, contexthandle: Long, rundownroutine: Long, pformat: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrServerContextNewUnmarshall(pstubmsg: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrServerContextUnmarshall(pstubmsg: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrServerInitialize(prpcmsg: Long, pstubmsg: Long, pstubdescriptor: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrServerInitializeMarshall(prpcmsg: Long, pstubmsg: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrServerInitializeNew(prpcmsg: Long, pstubmsg: Long, pstubdescriptor: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrServerInitializePartial(prpcmsg: Long, pstubmsg: Long, pstubdescriptor: Long, requestedbuffersize: Int)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrServerInitializeUnmarshall(pstubmsg: Long, pstubdescriptor: Long, prpcmsg: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrSimpleStructBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrSimpleStructFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrSimpleStructMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrSimpleStructMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrSimpleStructUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrSimpleTypeMarshall(pstubmsg: Long, pmemory: Long, formatchar: Byte)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrSimpleTypeUnmarshall(pstubmsg: Long, pmemory: Long, formatchar: Byte)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrStubCall2(pthis: Long, pchannel: Long, prpcmsg: Long, pdwstubphase: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrStubCall3(pthis: Long, pchannel: Long, prpcmsg: Long, pdwstubphase: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrUserMarshalBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrUserMarshalFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrUserMarshalMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrUserMarshalMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrUserMarshalSimpleTypeConvert(pflags: Long, pbuffer: Long, formatchar: Byte): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrUserMarshalUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrVaryingArrayBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrVaryingArrayFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrVaryingArrayMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrVaryingArrayMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrVaryingArrayUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrXmitOrRepAsBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrXmitOrRepAsFree(pstubmsg: Long, pmemory: Long, pformat: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrXmitOrRepAsMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrXmitOrRepAsMemorySize(pstubmsg: Long, pformat: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcNdrXmitOrRepAsUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: Byte): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcAsyncAbortCall(pasync: Long, exceptioncode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcAsyncCancelCall(pasync: Long, fabort: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcAsyncCompleteCall(pasync: Long, reply: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcAsyncGetCallStatus(pasync: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcAsyncInitializeHandle(pasync: Long, size: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcAsyncRegisterInfo(pasync: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcBindingBind(pasync: Long, binding: Long, ifspec: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcBindingCopy(sourcebinding: Long, destinationbinding: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcBindingCreateA(template: Long, security: Long, options: Long, binding: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcBindingCreateW(template: Long, security: Long, options: Long, binding: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcBindingFree(binding: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcBindingFromStringBindingA(stringbinding: Long, binding: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcBindingFromStringBindingW(stringbinding: Long, binding: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcBindingInqAuthClientA(clientbinding: Long, privs: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authzsvc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcBindingInqAuthClientExA(clientbinding: Long, privs: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authzsvc: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcBindingInqAuthClientExW(clientbinding: Long, privs: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authzsvc: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcBindingInqAuthClientW(clientbinding: Long, privs: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authzsvc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcBindingInqAuthInfoA(binding: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authidentity: Long, authzsvc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcBindingInqAuthInfoExA(binding: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authidentity: Long, authzsvc: Long, rpcqosversion: Int, securityqos: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcBindingInqAuthInfoExW(binding: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authidentity: Long, authzsvc: Long, rpcqosversion: Int, securityqos: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcBindingInqAuthInfoW(binding: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authidentity: Long, authzsvc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcBindingInqMaxCalls(binding: Long, maxcalls: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcBindingInqObject(binding: Long, objectuuid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcBindingInqOption(hbinding: Long, option: Int, poptionvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcBindingReset(binding: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcBindingServerFromClient(clientbinding: Long, serverbinding: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcBindingSetAuthInfoA(binding: Long, serverprincname: Long, authnlevel: Int, authnsvc: Int, authidentity: Long, authzsvc: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcBindingSetAuthInfoExA(binding: Long, serverprincname: Long, authnlevel: Int, authnsvc: Int, authidentity: Long, authzsvc: Int, securityqos: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcBindingSetAuthInfoExW(binding: Long, serverprincname: Long, authnlevel: Int, authnsvc: Int, authidentity: Long, authzsvc: Int, securityqos: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcBindingSetAuthInfoW(binding: Long, serverprincname: Long, authnlevel: Int, authnsvc: Int, authidentity: Long, authzsvc: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcBindingSetObject(binding: Long, objectuuid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcBindingSetOption(hbinding: Long, option: Int, optionvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcBindingToStringBindingA(binding: Long, stringbinding: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcBindingToStringBindingW(binding: Long, stringbinding: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcBindingUnbind(binding: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcBindingVectorFree(bindingvector: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcCancelThread(thread: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcCancelThreadEx(thread: Long, timeout: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcCertGeneratePrincipalNameA(context: Long, flags: Int, pbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcCertGeneratePrincipalNameW(context: Long, flags: Int, pbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcEpRegisterA(ifspec: Long, bindingvector: Long, uuidvector: Long, annotation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcEpRegisterNoReplaceA(ifspec: Long, bindingvector: Long, uuidvector: Long, annotation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcEpRegisterNoReplaceW(ifspec: Long, bindingvector: Long, uuidvector: Long, annotation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcEpRegisterW(ifspec: Long, bindingvector: Long, uuidvector: Long, annotation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcEpResolveBinding(binding: Long, ifspec: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcEpUnregister(ifspec: Long, bindingvector: Long, uuidvector: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcErrorAddRecord(errorinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcErrorClearInformation()

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcErrorEndEnumeration(enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcErrorGetNextRecord(enumhandle: Long, copystrings: Int, errorinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcErrorGetNumberOfRecords(enumhandle: Long, records: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcErrorLoadErrorInfo(errorblob: Long, blobsize: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcErrorResetEnumeration(enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcErrorSaveErrorInfo(enumhandle: Long, errorblob: Long, blobsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcErrorStartEnumeration(enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcExceptionFilter(exceptioncode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcFreeAuthorizationContext(pauthzclientcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcIfIdVectorFree(ifidvector: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcIfInqId(rpcifhandle: Long, rpcifid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcImpersonateClient(bindinghandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcImpersonateClient2(bindinghandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcImpersonateClientContainer(bindinghandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcMgmtEnableIdleCleanup(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcMgmtEpEltInqBegin(epbinding: Long, inquirytype: Int, ifid: Long, versoption: Int, objectuuid: Long, inquirycontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcMgmtEpEltInqDone(inquirycontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcMgmtEpEltInqNextA(inquirycontext: Long, ifid: Long, binding: Long, objectuuid: Long, annotation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcMgmtEpEltInqNextW(inquirycontext: Long, ifid: Long, binding: Long, objectuuid: Long, annotation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcMgmtEpUnregister(epbinding: Long, ifid: Long, binding: Long, objectuuid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcMgmtInqComTimeout(binding: Long, timeout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcMgmtInqDefaultProtectLevel(authnsvc: Int, authnlevel: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcMgmtInqIfIds(binding: Long, ifidvector: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcMgmtInqServerPrincNameA(binding: Long, authnsvc: Int, serverprincname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcMgmtInqServerPrincNameW(binding: Long, authnsvc: Int, serverprincname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcMgmtInqStats(binding: Long, statistics: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcMgmtIsServerListening(binding: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcMgmtSetAuthorizationFn(authorizationfn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcMgmtSetCancelTimeout(timeout: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcMgmtSetComTimeout(binding: Long, timeout: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcMgmtSetServerStackSize(threadstacksize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcMgmtStatsVectorFree(statsvector: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcMgmtStopServerListening(binding: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcMgmtWaitServerListen(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNetworkInqProtseqsA(protseqvector: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNetworkInqProtseqsW(protseqvector: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNetworkIsProtseqValidA(protseq: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNetworkIsProtseqValidW(protseq: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsBindingExportA(entrynamesyntax: Int, entryname: Long, ifspec: Long, bindingvec: Long, objectuuidvec: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsBindingExportPnPA(entrynamesyntax: Int, entryname: Long, ifspec: Long, objectvector: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsBindingExportPnPW(entrynamesyntax: Int, entryname: Long, ifspec: Long, objectvector: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsBindingExportW(entrynamesyntax: Int, entryname: Long, ifspec: Long, bindingvec: Long, objectuuidvec: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsBindingImportBeginA(entrynamesyntax: Int, entryname: Long, ifspec: Long, objuuid: Long, importcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsBindingImportBeginW(entrynamesyntax: Int, entryname: Long, ifspec: Long, objuuid: Long, importcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsBindingImportDone(importcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsBindingImportNext(importcontext: Long, binding: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsBindingInqEntryNameA(binding: Long, entrynamesyntax: Int, entryname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsBindingInqEntryNameW(binding: Long, entrynamesyntax: Int, entryname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsBindingLookupBeginA(entrynamesyntax: Int, entryname: Long, ifspec: Long, objuuid: Long, bindingmaxcount: Int, lookupcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsBindingLookupBeginW(entrynamesyntax: Int, entryname: Long, ifspec: Long, objuuid: Long, bindingmaxcount: Int, lookupcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsBindingLookupDone(lookupcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsBindingLookupNext(lookupcontext: Long, bindingvec: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsBindingSelect(bindingvec: Long, binding: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsBindingUnexportA(entrynamesyntax: Int, entryname: Long, ifspec: Long, objectuuidvec: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsBindingUnexportPnPA(entrynamesyntax: Int, entryname: Long, ifspec: Long, objectvector: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsBindingUnexportPnPW(entrynamesyntax: Int, entryname: Long, ifspec: Long, objectvector: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsBindingUnexportW(entrynamesyntax: Int, entryname: Long, ifspec: Long, objectuuidvec: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsEntryExpandNameA(entrynamesyntax: Int, entryname: Long, expandedname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsEntryExpandNameW(entrynamesyntax: Int, entryname: Long, expandedname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsEntryObjectInqBeginA(entrynamesyntax: Int, entryname: Long, inquirycontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsEntryObjectInqBeginW(entrynamesyntax: Int, entryname: Long, inquirycontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsEntryObjectInqDone(inquirycontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsEntryObjectInqNext(inquirycontext: Long, objuuid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsGroupDeleteA(groupnamesyntax: Int, groupname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsGroupDeleteW(groupnamesyntax: Int, groupname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsGroupMbrAddA(groupnamesyntax: Int, groupname: Long, membernamesyntax: Int, membername: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsGroupMbrAddW(groupnamesyntax: Int, groupname: Long, membernamesyntax: Int, membername: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsGroupMbrInqBeginA(groupnamesyntax: Int, groupname: Long, membernamesyntax: Int, inquirycontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsGroupMbrInqBeginW(groupnamesyntax: Int, groupname: Long, membernamesyntax: Int, inquirycontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsGroupMbrInqDone(inquirycontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsGroupMbrInqNextA(inquirycontext: Long, membername: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsGroupMbrInqNextW(inquirycontext: Long, membername: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsGroupMbrRemoveA(groupnamesyntax: Int, groupname: Long, membernamesyntax: Int, membername: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsGroupMbrRemoveW(groupnamesyntax: Int, groupname: Long, membernamesyntax: Int, membername: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsMgmtBindingUnexportA(entrynamesyntax: Int, entryname: Long, ifid: Long, versoption: Int, objectuuidvec: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsMgmtBindingUnexportW(entrynamesyntax: Int, entryname: Long, ifid: Long, versoption: Int, objectuuidvec: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsMgmtEntryCreateA(entrynamesyntax: Int, entryname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsMgmtEntryCreateW(entrynamesyntax: Int, entryname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsMgmtEntryDeleteA(entrynamesyntax: Int, entryname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsMgmtEntryDeleteW(entrynamesyntax: Int, entryname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsMgmtEntryInqIfIdsA(entrynamesyntax: Int, entryname: Long, ifidvec: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsMgmtEntryInqIfIdsW(entrynamesyntax: Int, entryname: Long, ifidvec: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsMgmtHandleSetExpAge(nshandle: Long, expirationage: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsMgmtInqExpAge(expirationage: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsMgmtSetExpAge(expirationage: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsProfileDeleteA(profilenamesyntax: Int, profilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsProfileDeleteW(profilenamesyntax: Int, profilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsProfileEltAddA(profilenamesyntax: Int, profilename: Long, ifid: Long, membernamesyntax: Int, membername: Long, priority: Int, annotation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsProfileEltAddW(profilenamesyntax: Int, profilename: Long, ifid: Long, membernamesyntax: Int, membername: Long, priority: Int, annotation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsProfileEltInqBeginA(profilenamesyntax: Int, profilename: Long, inquirytype: Int, ifid: Long, versoption: Int, membernamesyntax: Int, membername: Long, inquirycontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsProfileEltInqBeginW(profilenamesyntax: Int, profilename: Long, inquirytype: Int, ifid: Long, versoption: Int, membernamesyntax: Int, membername: Long, inquirycontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsProfileEltInqDone(inquirycontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsProfileEltInqNextA(inquirycontext: Long, ifid: Long, membername: Long, priority: Long, annotation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsProfileEltInqNextW(inquirycontext: Long, ifid: Long, membername: Long, priority: Long, annotation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsProfileEltRemoveA(profilenamesyntax: Int, profilename: Long, ifid: Long, membernamesyntax: Int, membername: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcNsProfileEltRemoveW(profilenamesyntax: Int, profilename: Long, ifid: Long, membernamesyntax: Int, membername: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcObjectInqType(objuuid: Long, typeuuid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcObjectSetInqFn(inquiryfn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcObjectSetType(objuuid: Long, typeuuid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcProtseqVectorFreeA(protseqvector: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcProtseqVectorFreeW(protseqvector: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcRaiseException(exception: Int)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcRevertContainerImpersonation(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcRevertToSelf(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcRevertToSelfEx(bindinghandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcServerCompleteSecurityCallback(bindinghandle: Long, status: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcServerInqBindingHandle(binding: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcServerInqBindings(bindingvector: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcServerInqBindingsEx(securitydescriptor: Long, bindingvector: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcServerInqCallAttributesA(clientbinding: Long, rpccallattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcServerInqCallAttributesW(clientbinding: Long, rpccallattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcServerInqDefaultPrincNameA(authnsvc: Int, princname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcServerInqDefaultPrincNameW(authnsvc: Int, princname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcServerInqIf(ifspec: Long, mgrtypeuuid: Long, mgrepv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcServerInterfaceGroupActivate(ifgroup: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcServerInterfaceGroupClose(ifgroup: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcServerInterfaceGroupCreateA(interfaces: Long, numifs: Int, endpoints: Long, numendpoints: Int, idleperiod: Int, idlecallbackfn: Long, idlecallbackcontext: Long, ifgroup: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcServerInterfaceGroupCreateW(interfaces: Long, numifs: Int, endpoints: Long, numendpoints: Int, idleperiod: Int, idlecallbackfn: Long, idlecallbackcontext: Long, ifgroup: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcServerInterfaceGroupDeactivate(ifgroup: Long, forcedeactivation: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcServerInterfaceGroupInqBindings(ifgroup: Long, bindingvector: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcServerListen(minimumcallthreads: Int, maxcalls: Int, dontwait: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcServerRegisterAuthInfoA(serverprincname: Long, authnsvc: Int, getkeyfn: Long, arg: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcServerRegisterAuthInfoW(serverprincname: Long, authnsvc: Int, getkeyfn: Long, arg: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcServerRegisterIf(ifspec: Long, mgrtypeuuid: Long, mgrepv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcServerRegisterIf2(ifspec: Long, mgrtypeuuid: Long, mgrepv: Long, flags: Int, maxcalls: Int, maxrpcsize: Int, ifcallbackfn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcServerRegisterIf3(ifspec: Long, mgrtypeuuid: Long, mgrepv: Long, flags: Int, maxcalls: Int, maxrpcsize: Int, ifcallback: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcServerRegisterIfEx(ifspec: Long, mgrtypeuuid: Long, mgrepv: Long, flags: Int, maxcalls: Int, ifcallback: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcServerSubscribeForNotification(binding: Long, notification: Int, notificationtype: Int, notificationinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcServerTestCancel(bindinghandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcServerUnregisterIf(ifspec: Long, mgrtypeuuid: Long, waitforcallstocomplete: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcServerUnregisterIfEx(ifspec: Long, mgrtypeuuid: Long, rundowncontexthandles: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcServerUnsubscribeForNotification(binding: Long, notification: Int, notificationsqueued: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcServerUseAllProtseqs(maxcalls: Int, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcServerUseAllProtseqsEx(maxcalls: Int, securitydescriptor: Long, policy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcServerUseAllProtseqsIf(maxcalls: Int, ifspec: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcServerUseAllProtseqsIfEx(maxcalls: Int, ifspec: Long, securitydescriptor: Long, policy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcServerUseProtseqA(protseq: Long, maxcalls: Int, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcServerUseProtseqEpA(protseq: Long, maxcalls: Int, endpoint: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcServerUseProtseqEpExA(protseq: Long, maxcalls: Int, endpoint: Long, securitydescriptor: Long, policy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcServerUseProtseqEpExW(protseq: Long, maxcalls: Int, endpoint: Long, securitydescriptor: Long, policy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcServerUseProtseqEpW(protseq: Long, maxcalls: Int, endpoint: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcServerUseProtseqExA(protseq: Long, maxcalls: Int, securitydescriptor: Long, policy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcServerUseProtseqExW(protseq: Long, maxcalls: Int, securitydescriptor: Long, policy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcServerUseProtseqIfA(protseq: Long, maxcalls: Int, ifspec: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcServerUseProtseqIfExA(protseq: Long, maxcalls: Int, ifspec: Long, securitydescriptor: Long, policy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcServerUseProtseqIfExW(protseq: Long, maxcalls: Int, ifspec: Long, securitydescriptor: Long, policy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcServerUseProtseqIfW(protseq: Long, maxcalls: Int, ifspec: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcServerUseProtseqW(protseq: Long, maxcalls: Int, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcServerYield()

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcSmAllocate(size: Long, pstatus: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcSmClientFree(pnodetofree: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcSmDestroyClientContext(contexthandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcSmDisableAllocate(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcSmEnableAllocate(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcSmFree(nodetofree: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcSmGetThreadHandle(pstatus: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcSmSetClientAllocFree(clientalloc: Long, clientfree: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcSmSetThreadHandle(id: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcSmSwapClientAllocFree(clientalloc: Long, clientfree: Long, oldclientalloc: Long, oldclientfree: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcSsAllocate(size: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcSsContextLockExclusive(serverbindinghandle: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcSsContextLockShared(serverbindinghandle: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcSsDestroyClientContext(contexthandle: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcSsDisableAllocate()

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcSsDontSerializeContext()

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcSsEnableAllocate()

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcSsFree(nodetofree: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcSsGetContextBinding(contexthandle: Long, binding: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcSsGetThreadHandle(): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcSsSetClientAllocFree(clientalloc: Long, clientfree: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcSsSetThreadHandle(id: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcSsSwapClientAllocFree(clientalloc: Long, clientfree: Long, oldclientalloc: Long, oldclientfree: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcStringBindingComposeA(objuuid: Long, protseq: Long, networkaddr: Long, endpoint: Long, options: Long, stringbinding: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcStringBindingComposeW(objuuid: Long, protseq: Long, networkaddr: Long, endpoint: Long, options: Long, stringbinding: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcStringBindingParseA(stringbinding: Long, objuuid: Long, protseq: Long, networkaddr: Long, endpoint: Long, networkoptions: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcStringBindingParseW(stringbinding: Long, objuuid: Long, protseq: Long, networkaddr: Long, endpoint: Long, networkoptions: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcStringFreeA(string: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcStringFreeW(string: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcTestCancel(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcRpcUserFree(asynchandle: Long, pbuffer: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcUuidCompare(uuid1: Long, uuid2: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcUuidCreate(uuid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcUuidCreateNil(niluuid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcUuidCreateSequential(uuid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcUuidEqual(uuid1: Long, uuid2: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcUuidFromStringA(stringuuid: Long, uuid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcUuidFromStringW(stringuuid: Long, uuid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcUuidHash(uuid: Long, status: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcUuidIsNil(uuid: Long, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcUuidToStringA(uuid: Long, stringuuid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRpcUuidToStringW(uuid: Long, stringuuid: Long): Int
}

public actual fun dceErrorInqTextA(rpcstatus: RpcStatus, errortext: Pstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcDceErrorInqTextA(rpcstatus, errortext.rawAddress)

public actual fun dceErrorInqTextW(rpcstatus: RpcStatus, errortext: Pwstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcDceErrorInqTextW(rpcstatus, errortext.rawAddress)

public actual fun iunknownAddRefProxy(thisRef: MutPtr<CVoid>): UInt =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIunknownAddRefProxy(thisRef.rawAddress).toUInt()

public actual fun iunknownQueryInterfaceProxy(thisRef: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppvobject: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIunknownQueryInterfaceProxy(thisRef.rawAddress, riid.rawAddress, ppvobject.rawAddress)

public actual fun iunknownReleaseProxy(thisRef: MutPtr<CVoid>): UInt =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIunknownReleaseProxy(thisRef.rawAddress).toUInt()

public actual fun iRpcAllocate(size: UInt): MutPtr<CVoid> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcAllocate(size.toInt()))

public actual fun iRpcAsyncAbortCall(pasync: ConstPtr<RpcAsyncState>, exceptioncode: UInt): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcAsyncAbortCall(pasync.rawAddress, exceptioncode.toInt())

public actual fun iRpcAsyncSetHandle(message: ConstPtr<RpcMessage>, pasync: ConstPtr<RpcAsyncState>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcAsyncSetHandle(message.rawAddress, pasync.rawAddress)

public actual fun iRpcBindingCopy(sourcebinding: MutPtr<CVoid>, destinationbinding: MutPtr<MutPtr<CVoid>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcBindingCopy(sourcebinding.rawAddress, destinationbinding.rawAddress)

public actual fun iRpcBindingCreateNp(servername: Pcwstr, servicename: Pcwstr, networkoptions: Pcwstr, binding: MutPtr<MutPtr<CVoid>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcBindingCreateNp(servername.rawAddress, servicename.rawAddress, networkoptions.rawAddress, binding.rawAddress)

public actual fun iRpcBindingHandleToAsyncHandle(binding: MutPtr<CVoid>, asynchandle: MutPtr<MutPtr<CVoid>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcBindingHandleToAsyncHandle(binding.rawAddress, asynchandle.rawAddress)

public actual fun iRpcBindingInqClientTokenAttributes(binding: ConstPtr<CVoid>, tokenid: MutPtr<Luid>, authenticationid: MutPtr<Luid>, modifiedid: MutPtr<Luid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcBindingInqClientTokenAttributes(binding.rawAddress, tokenid.rawAddress, authenticationid.rawAddress, modifiedid.rawAddress)

public actual fun iRpcBindingInqDynamicEndpointA(binding: ConstPtr<CVoid>, dynamicendpoint: MutPtr<Pstr>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcBindingInqDynamicEndpointA(binding.rawAddress, dynamicendpoint.rawAddress)

public actual fun iRpcBindingInqDynamicEndpointW(binding: ConstPtr<CVoid>, dynamicendpoint: MutPtr<Pwstr>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcBindingInqDynamicEndpointW(binding.rawAddress, dynamicendpoint.rawAddress)

public actual fun iRpcBindingInqLocalClientPid(binding: MutPtr<CVoid>, pid: MutPtr<UInt>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcBindingInqLocalClientPid(binding.rawAddress, pid.rawAddress)

public actual fun iRpcBindingInqMarshalledTargetInfo(binding: ConstPtr<CVoid>, marshalledtargetinfosize: MutPtr<UInt>, marshalledtargetinfo: MutPtr<Pstr>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcBindingInqMarshalledTargetInfo(binding.rawAddress, marshalledtargetinfosize.rawAddress, marshalledtargetinfo.rawAddress)

public actual fun iRpcBindingInqSecurityContext(binding: MutPtr<CVoid>, securitycontexthandle: MutPtr<MutPtr<CVoid>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcBindingInqSecurityContext(binding.rawAddress, securitycontexthandle.rawAddress)

public actual fun iRpcBindingInqSecurityContextKeyInfo(binding: ConstPtr<CVoid>, keyinfo: MutPtr<CVoid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcBindingInqSecurityContextKeyInfo(binding.rawAddress, keyinfo.rawAddress)

public actual fun iRpcBindingInqTransportType(binding: MutPtr<CVoid>, type: MutPtr<UInt>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcBindingInqTransportType(binding.rawAddress, type.rawAddress)

public actual fun iRpcBindingInqWireIdForSnego(binding: ConstPtr<CVoid>, wireid: MutPtr<UByte>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcBindingInqWireIdForSnego(binding.rawAddress, wireid.rawAddress)

public actual fun iRpcBindingIsClientLocal(bindinghandle: MutPtr<CVoid>, clientlocalflag: MutPtr<UInt>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcBindingIsClientLocal(bindinghandle.rawAddress, clientlocalflag.rawAddress)

public actual fun iRpcBindingIsServerLocal(binding: ConstPtr<CVoid>, serverlocalflag: MutPtr<UInt>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcBindingIsServerLocal(binding.rawAddress, serverlocalflag.rawAddress)

public actual fun iRpcBindingSetPrivateOption(hbinding: ConstPtr<CVoid>, option: UInt, optionvalue: ULong): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcBindingSetPrivateOption(hbinding.rawAddress, option.toInt(), optionvalue.toLong())

public actual fun iRpcBindingToStaticStringBindingW(binding: MutPtr<CVoid>, stringbinding: MutPtr<MutPtr<UShort>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcBindingToStaticStringBindingW(binding.rawAddress, stringbinding.rawAddress)

public actual fun iRpcClearMutex(mutex: MutPtr<CVoid>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcClearMutex(mutex.rawAddress)
}

public actual fun iRpcDeleteMutex(mutex: MutPtr<CVoid>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcDeleteMutex(mutex.rawAddress)
}

public actual fun iRpcExceptionFilter(exceptioncode: UInt): Int =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcExceptionFilter(exceptioncode.toInt())

public actual fun iRpcFree(obj: MutPtr<CVoid>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcFree(obj.rawAddress)
}

public actual fun iRpcFreeBuffer(message: MutPtr<RpcMessage>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcFreeBuffer(message.rawAddress)

public actual fun iRpcFreePipeBuffer(message: MutPtr<RpcMessage>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcFreePipeBuffer(message.rawAddress)

public actual fun iRpcGetBuffer(message: MutPtr<RpcMessage>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcGetBuffer(message.rawAddress)

public actual fun iRpcGetBufferWithObject(message: MutPtr<RpcMessage>, objectuuid: MutPtr<Guid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcGetBufferWithObject(message.rawAddress, objectuuid.rawAddress)

public actual fun iRpcGetCurrentCallHandle(): MutPtr<CVoid> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcGetCurrentCallHandle())

public actual fun iRpcGetDefaultSd(ppsecuritydescriptor: MutPtr<MutPtr<CVoid>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcGetDefaultSd(ppsecuritydescriptor.rawAddress)

public actual fun iRpcGetExtendedError(): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcGetExtendedError()

public actual fun iRpcIfInqTransferSyntaxes(rpcifhandle: MutPtr<CVoid>, transfersyntaxes: MutPtr<RpcTransferSyntax>, transfersyntaxsize: UInt, transfersyntaxcount: MutPtr<UInt>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcIfInqTransferSyntaxes(rpcifhandle.rawAddress, transfersyntaxes.rawAddress, transfersyntaxsize.toInt(), transfersyntaxcount.rawAddress)

public actual fun iRpcMapWin32Status(status: RpcStatus): Int =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcMapWin32Status(status)

public actual fun iRpcMgmtEnableDedicatedThreadPool(): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcMgmtEnableDedicatedThreadPool()

public actual fun iRpcNegotiateTransferSyntax(message: MutPtr<RpcMessage>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcNegotiateTransferSyntax(message.rawAddress)

public actual fun iRpcNsBindingSetEntryNameA(binding: ConstPtr<CVoid>, entrynamesyntax: UInt, entryname: Pcstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcNsBindingSetEntryNameA(binding.rawAddress, entrynamesyntax.toInt(), entryname.rawAddress)

public actual fun iRpcNsBindingSetEntryNameW(binding: ConstPtr<CVoid>, entrynamesyntax: UInt, entryname: Pcwstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcNsBindingSetEntryNameW(binding.rawAddress, entrynamesyntax.toInt(), entryname.rawAddress)

public actual fun iRpcNsGetBuffer(message: MutPtr<RpcMessage>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcNsGetBuffer(message.rawAddress)

public actual fun iRpcNsInterfaceExported(entrynamesyntax: UInt, entryname: ConstPtr<UShort>, rpcinterfaceinformation: ConstPtr<RpcServerInterface>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcNsInterfaceExported(entrynamesyntax.toInt(), entryname.rawAddress, rpcinterfaceinformation.rawAddress)

public actual fun iRpcNsInterfaceUnexported(entrynamesyntax: UInt, entryname: MutPtr<UShort>, rpcinterfaceinformation: MutPtr<RpcServerInterface>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcNsInterfaceUnexported(entrynamesyntax.toInt(), entryname.rawAddress, rpcinterfaceinformation.rawAddress)

public actual fun iRpcNsRaiseException(message: MutPtr<RpcMessage>, status: RpcStatus) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcNsRaiseException(message.rawAddress, status)
}

public actual fun iRpcNsSendReceive(message: MutPtr<RpcMessage>, handle: MutPtr<MutPtr<CVoid>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcNsSendReceive(message.rawAddress, handle.rawAddress)

public actual fun iRpcOpenClientProcess(binding: ConstPtr<CVoid>, desiredaccess: UInt, clientprocess: MutPtr<MutPtr<CVoid>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcOpenClientProcess(binding.rawAddress, desiredaccess.toInt(), clientprocess.rawAddress)

public actual fun iRpcPauseExecution(milliseconds: UInt) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcPauseExecution(milliseconds.toInt())
}

public actual fun iRpcReBindBuffer(message: MutPtr<RpcMessage>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcReBindBuffer(message.rawAddress)

public actual fun iRpcReallocPipeBuffer(message: ConstPtr<RpcMessage>, newsize: UInt): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcReallocPipeBuffer(message.rawAddress, newsize.toInt())

public actual fun iRpcReceive(message: MutPtr<RpcMessage>, size: UInt): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcReceive(message.rawAddress, size.toInt())

public actual fun iRpcRecordCalloutFailure(rpcstatus: RpcStatus, calloutstate: MutPtr<RdrCalloutState>, dllname: MutPtr<UShort>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcRecordCalloutFailure(rpcstatus, calloutstate.rawAddress, dllname.rawAddress)
}

public actual fun iRpcRequestMutex(mutex: MutPtr<MutPtr<CVoid>>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcRequestMutex(mutex.rawAddress)
}

public actual fun iRpcSend(message: MutPtr<RpcMessage>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcSend(message.rawAddress)

public actual fun iRpcSendReceive(message: MutPtr<RpcMessage>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcSendReceive(message.rawAddress)

public actual fun iRpcServerCheckClientRestriction(context: MutPtr<CVoid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcServerCheckClientRestriction(context.rawAddress)

public actual fun iRpcServerDisableExceptionFilter(): Int =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcServerDisableExceptionFilter()

public actual fun iRpcServerGetAssociationId(binding: ConstPtr<CVoid>, associationid: MutPtr<UInt>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcServerGetAssociationId(binding.rawAddress, associationid.rawAddress)

public actual fun iRpcServerInqAddressChangeFn(): MutPtr<RpcAddressChangeFn> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcServerInqAddressChangeFn())

public actual fun iRpcServerInqLocalConnAddress(binding: MutPtr<CVoid>, buffer: MutPtr<CVoid>, buffersize: MutPtr<UInt>, addressformat: MutPtr<UInt>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcServerInqLocalConnAddress(binding.rawAddress, buffer.rawAddress, buffersize.rawAddress, addressformat.rawAddress)

public actual fun iRpcServerInqRemoteConnAddress(binding: MutPtr<CVoid>, buffer: MutPtr<CVoid>, buffersize: MutPtr<UInt>, addressformat: MutPtr<UInt>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcServerInqRemoteConnAddress(binding.rawAddress, buffer.rawAddress, buffersize.rawAddress, addressformat.rawAddress)

public actual fun iRpcServerInqTransportType(type: MutPtr<UInt>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcServerInqTransportType(type.rawAddress)

public actual fun iRpcServerRegisterForwardFunction(pforwardfunction: MutPtr<RpcForwardFunction>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcServerRegisterForwardFunction(pforwardfunction.rawAddress)

public actual fun iRpcServerSetAddressChangeFn(paddresschangefn: MutPtr<RpcAddressChangeFn>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcServerSetAddressChangeFn(paddresschangefn.rawAddress)

public actual fun iRpcServerStartService(protseq: Pcwstr, endpoint: Pcwstr, ifspec: ConstPtr<CVoid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcServerStartService(protseq.rawAddress, endpoint.rawAddress, ifspec.rawAddress)

public actual fun iRpcServerSubscribeForDisconnectNotification(binding: ConstPtr<CVoid>, hevent: ConstPtr<CVoid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcServerSubscribeForDisconnectNotification(binding.rawAddress, hevent.rawAddress)

public actual fun iRpcServerSubscribeForDisconnectNotification2(binding: ConstPtr<CVoid>, hevent: ConstPtr<CVoid>, subscriptionid: MutPtr<Guid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcServerSubscribeForDisconnectNotification2(binding.rawAddress, hevent.rawAddress, subscriptionid.rawAddress)

public actual fun iRpcServerUnsubscribeForDisconnectNotification(binding: ConstPtr<CVoid>, subscriptionid: Guid): RpcStatus =
    0

public actual fun iRpcServerUseProtseq2A(networkaddress: Pcstr, protseq: Pcstr, maxcalls: UInt, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<CVoid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcServerUseProtseq2A(networkaddress.rawAddress, protseq.rawAddress, maxcalls.toInt(), securitydescriptor.rawAddress, policy.rawAddress)

public actual fun iRpcServerUseProtseq2W(networkaddress: Pcwstr, protseq: Pcwstr, maxcalls: UInt, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<CVoid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcServerUseProtseq2W(networkaddress.rawAddress, protseq.rawAddress, maxcalls.toInt(), securitydescriptor.rawAddress, policy.rawAddress)

public actual fun iRpcServerUseProtseqEp2A(networkaddress: Pcstr, protseq: Pcstr, maxcalls: UInt, endpoint: Pcstr, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<CVoid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcServerUseProtseqEp2A(networkaddress.rawAddress, protseq.rawAddress, maxcalls.toInt(), endpoint.rawAddress, securitydescriptor.rawAddress, policy.rawAddress)

public actual fun iRpcServerUseProtseqEp2W(networkaddress: Pcwstr, protseq: Pcwstr, maxcalls: UInt, endpoint: Pcwstr, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<CVoid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcServerUseProtseqEp2W(networkaddress.rawAddress, protseq.rawAddress, maxcalls.toInt(), endpoint.rawAddress, securitydescriptor.rawAddress, policy.rawAddress)

public actual fun iRpcSessionStrictContextHandle() {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcSessionStrictContextHandle()
}

public actual fun iRpcSsDontSerializeContext() {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcSsDontSerializeContext()
}

public actual fun iRpcSystemHandleTypeSpecificWork(handle: MutPtr<CVoid>, actualtype: UByte, idltype: UByte, marshaldirection: LrpcSystemHandleMarshalDirection): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcSystemHandleTypeSpecificWork(handle.rawAddress, actualtype.toByte(), idltype.toByte(), marshaldirection)

public actual fun iRpcTurnOnEeinfoPropagation(): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIRpcTurnOnEeinfoPropagation()

public actual fun iUuidCreate(uuid: MutPtr<Guid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcIUuidCreate(uuid.rawAddress)

public actual fun mesBufferHandleReset(handle: ConstPtr<CVoid>, handlestyle: UInt, operation: MidlEsCode, pbuffer: ConstPtr<ConstPtr<Byte>>, buffersize: UInt, pencodedsize: MutPtr<UInt>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcMesBufferHandleReset(handle.rawAddress, handlestyle.toInt(), operation, pbuffer.rawAddress, buffersize.toInt(), pencodedsize.rawAddress)

public actual fun mesDecodeBufferHandleCreate(buffer: Pcstr, buffersize: UInt, phandle: MutPtr<MutPtr<CVoid>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcMesDecodeBufferHandleCreate(buffer.rawAddress, buffersize.toInt(), phandle.rawAddress)

public actual fun mesDecodeIncrementalHandleCreate(userstate: MutPtr<CVoid>, readfn: MidlEsRead, phandle: MutPtr<MutPtr<CVoid>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcMesDecodeIncrementalHandleCreate(userstate.rawAddress, 0L, phandle.rawAddress)

public actual fun mesEncodeDynBufferHandleCreate(pbuffer: MutPtr<MutPtr<Byte>>, pencodedsize: MutPtr<UInt>, phandle: MutPtr<MutPtr<CVoid>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcMesEncodeDynBufferHandleCreate(pbuffer.rawAddress, pencodedsize.rawAddress, phandle.rawAddress)

public actual fun mesEncodeFixedBufferHandleCreate(pbuffer: Pstr, buffersize: UInt, pencodedsize: MutPtr<UInt>, phandle: MutPtr<MutPtr<CVoid>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcMesEncodeFixedBufferHandleCreate(pbuffer.rawAddress, buffersize.toInt(), pencodedsize.rawAddress, phandle.rawAddress)

public actual fun mesEncodeIncrementalHandleCreate(userstate: MutPtr<CVoid>, allocfn: MidlEsAlloc, writefn: MidlEsWrite, phandle: MutPtr<MutPtr<CVoid>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcMesEncodeIncrementalHandleCreate(userstate.rawAddress, 0L, 0L, phandle.rawAddress)

public actual fun mesHandleFree(handle: MutPtr<CVoid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcMesHandleFree(handle.rawAddress)

public actual fun mesIncrementalHandleReset(handle: MutPtr<CVoid>, userstate: MutPtr<CVoid>, allocfn: MidlEsAlloc, writefn: MidlEsWrite, readfn: MidlEsRead, operation: MidlEsCode): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcMesIncrementalHandleReset(handle.rawAddress, userstate.rawAddress, 0L, 0L, 0L, operation)

public actual fun mesInqProcEncodingId(handle: MutPtr<CVoid>, pinterfaceid: MutPtr<RpcSyntaxIdentifier>, pprocnum: MutPtr<UInt>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcMesInqProcEncodingId(handle.rawAddress, pinterfaceid.rawAddress, pprocnum.rawAddress)

public actual fun nDRCContextBinding(ccontext: Long): MutPtr<CVoid> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNDRCContextBinding(ccontext))

public actual fun nDRCContextMarshall(ccontext: Long, pbuff: MutPtr<CVoid>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNDRCContextMarshall(ccontext, pbuff.rawAddress)
}

public actual fun nDRCContextUnmarshall(pccontext: MutPtr<Long>, hbinding: ConstPtr<CVoid>, pbuff: ConstPtr<CVoid>, datarepresentation: UInt) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNDRCContextUnmarshall(pccontext.rawAddress, hbinding.rawAddress, pbuff.rawAddress, datarepresentation.toInt())
}

public actual fun nDRSContextMarshall(ccontext: ConstPtr<NdrScontext>, pbuff: MutPtr<CVoid>, userrundownin: NdrRundown) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNDRSContextMarshall(ccontext.rawAddress, pbuff.rawAddress, 0L)
}

public actual fun nDRSContextMarshall2(bindinghandle: ConstPtr<CVoid>, ccontext: ConstPtr<NdrScontext>, pbuff: MutPtr<CVoid>, userrundownin: NdrRundown, ctxguard: ConstPtr<CVoid>, flags: UInt) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNDRSContextMarshall2(bindinghandle.rawAddress, ccontext.rawAddress, pbuff.rawAddress, 0L, ctxguard.rawAddress, flags.toInt())
}

public actual fun nDRSContextMarshallEx(bindinghandle: ConstPtr<CVoid>, ccontext: ConstPtr<NdrScontext>, pbuff: MutPtr<CVoid>, userrundownin: NdrRundown) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNDRSContextMarshallEx(bindinghandle.rawAddress, ccontext.rawAddress, pbuff.rawAddress, 0L)
}

public actual fun nDRSContextUnmarshall(pbuff: ConstPtr<CVoid>, datarepresentation: UInt): MutPtr<NdrScontext> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNDRSContextUnmarshall(pbuff.rawAddress, datarepresentation.toInt()))

public actual fun nDRSContextUnmarshall2(bindinghandle: ConstPtr<CVoid>, pbuff: ConstPtr<CVoid>, datarepresentation: UInt, ctxguard: ConstPtr<CVoid>, flags: UInt): MutPtr<NdrScontext> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNDRSContextUnmarshall2(bindinghandle.rawAddress, pbuff.rawAddress, datarepresentation.toInt(), ctxguard.rawAddress, flags.toInt()))

public actual fun nDRSContextUnmarshallEx(bindinghandle: ConstPtr<CVoid>, pbuff: ConstPtr<CVoid>, datarepresentation: UInt): MutPtr<NdrScontext> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNDRSContextUnmarshallEx(bindinghandle.rawAddress, pbuff.rawAddress, datarepresentation.toInt()))

public actual fun ndr64AsyncClientCall(pproxyinfo: MutPtr<MidlStublessProxyInfo>, nprocnum: UInt, preturnvalue: MutPtr<CVoid>, vararg variadicArgs: Long): ClientCallReturn =
    ClientCallReturn()

public actual fun ndr64AsyncServerCall64(prpcmsg: MutPtr<RpcMessage>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdr64AsyncServerCall64(prpcmsg.rawAddress)
}

public actual fun ndr64AsyncServerCallAll(prpcmsg: MutPtr<RpcMessage>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdr64AsyncServerCallAll(prpcmsg.rawAddress)
}

public actual fun ndr64DcomAsyncClientCall(pproxyinfo: MutPtr<MidlStublessProxyInfo>, nprocnum: UInt, preturnvalue: MutPtr<CVoid>, vararg variadicArgs: Long): ClientCallReturn =
    ClientCallReturn()

public actual fun ndr64DcomAsyncStubCall(pthis: MutPtr<CVoid>, pchannel: MutPtr<CVoid>, prpcmsg: MutPtr<RpcMessage>, pdwstubphase: MutPtr<UInt>): Int =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdr64DcomAsyncStubCall(pthis.rawAddress, pchannel.rawAddress, prpcmsg.rawAddress, pdwstubphase.rawAddress)

public actual fun ndrAllocate(pstubmsg: MutPtr<MidlStubMessage>, len: ULong): MutPtr<CVoid> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrAllocate(pstubmsg.rawAddress, len.toLong()))

public actual fun ndrAsyncClientCall(pstubdescriptor: MutPtr<MidlStubDesc>, pformat: MutPtr<UByte>, vararg variadicArgs: Long): ClientCallReturn =
    ClientCallReturn()

public actual fun ndrAsyncServerCall(prpcmsg: MutPtr<RpcMessage>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrAsyncServerCall(prpcmsg.rawAddress)
}

public actual fun ndrByteCountPointerBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrByteCountPointerBufferSize(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress)
}

public actual fun ndrByteCountPointerFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrByteCountPointerFree(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress)
}

public actual fun ndrByteCountPointerMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrByteCountPointerMarshall(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress))

public actual fun ndrByteCountPointerUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrByteCountPointerUnmarshall(pstubmsg.rawAddress, ppmemory.rawAddress, pformat.rawAddress, fmustalloc.toByte()))

public actual fun ndrClearOutParameters(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>, argaddr: MutPtr<CVoid>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrClearOutParameters(pstubmsg.rawAddress, pformat.rawAddress, argaddr.rawAddress)
}

public actual fun ndrClientCall2(pstubdescriptor: MutPtr<MidlStubDesc>, pformat: MutPtr<UByte>, vararg variadicArgs: Long): ClientCallReturn =
    ClientCallReturn()

public actual fun ndrClientCall3(pproxyinfo: MutPtr<MidlStublessProxyInfo>, nprocnum: UInt, preturnvalue: MutPtr<CVoid>, vararg variadicArgs: Long): ClientCallReturn =
    ClientCallReturn()

public actual fun ndrClientContextMarshall(pstubmsg: MutPtr<MidlStubMessage>, contexthandle: Long, fcheck: Int) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrClientContextMarshall(pstubmsg.rawAddress, contexthandle, fcheck)
}

public actual fun ndrClientContextUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, pcontexthandle: MutPtr<Long>, bindhandle: MutPtr<CVoid>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrClientContextUnmarshall(pstubmsg.rawAddress, pcontexthandle.rawAddress, bindhandle.rawAddress)
}

public actual fun ndrClientInitialize(prpcmsg: MutPtr<RpcMessage>, pstubmsg: MutPtr<MidlStubMessage>, pstubdescriptor: MutPtr<MidlStubDesc>, procnum: UInt) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrClientInitialize(prpcmsg.rawAddress, pstubmsg.rawAddress, pstubdescriptor.rawAddress, procnum.toInt())
}

public actual fun ndrClientInitializeNew(prpcmsg: MutPtr<RpcMessage>, pstubmsg: MutPtr<MidlStubMessage>, pstubdescriptor: MutPtr<MidlStubDesc>, procnum: UInt) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrClientInitializeNew(prpcmsg.rawAddress, pstubmsg.rawAddress, pstubdescriptor.rawAddress, procnum.toInt())
}

public actual fun ndrComplexArrayBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrComplexArrayBufferSize(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress)
}

public actual fun ndrComplexArrayFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrComplexArrayFree(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress)
}

public actual fun ndrComplexArrayMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrComplexArrayMarshall(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress))

public actual fun ndrComplexArrayMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrComplexArrayMemorySize(pstubmsg.rawAddress, pformat.rawAddress).toUInt()

public actual fun ndrComplexArrayUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrComplexArrayUnmarshall(pstubmsg.rawAddress, ppmemory.rawAddress, pformat.rawAddress, fmustalloc.toByte()))

public actual fun ndrComplexStructBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrComplexStructBufferSize(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress)
}

public actual fun ndrComplexStructFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrComplexStructFree(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress)
}

public actual fun ndrComplexStructMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrComplexStructMarshall(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress))

public actual fun ndrComplexStructMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrComplexStructMemorySize(pstubmsg.rawAddress, pformat.rawAddress).toUInt()

public actual fun ndrComplexStructUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrComplexStructUnmarshall(pstubmsg.rawAddress, ppmemory.rawAddress, pformat.rawAddress, fmustalloc.toByte()))

public actual fun ndrConformantArrayBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrConformantArrayBufferSize(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress)
}

public actual fun ndrConformantArrayFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrConformantArrayFree(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress)
}

public actual fun ndrConformantArrayMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrConformantArrayMarshall(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress))

public actual fun ndrConformantArrayMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrConformantArrayMemorySize(pstubmsg.rawAddress, pformat.rawAddress).toUInt()

public actual fun ndrConformantArrayUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrConformantArrayUnmarshall(pstubmsg.rawAddress, ppmemory.rawAddress, pformat.rawAddress, fmustalloc.toByte()))

public actual fun ndrConformantStringBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrConformantStringBufferSize(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress)
}

public actual fun ndrConformantStringMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrConformantStringMarshall(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress))

public actual fun ndrConformantStringMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrConformantStringMemorySize(pstubmsg.rawAddress, pformat.rawAddress).toUInt()

public actual fun ndrConformantStringUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrConformantStringUnmarshall(pstubmsg.rawAddress, ppmemory.rawAddress, pformat.rawAddress, fmustalloc.toByte()))

public actual fun ndrConformantStructBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrConformantStructBufferSize(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress)
}

public actual fun ndrConformantStructFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrConformantStructFree(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress)
}

public actual fun ndrConformantStructMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrConformantStructMarshall(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress))

public actual fun ndrConformantStructMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrConformantStructMemorySize(pstubmsg.rawAddress, pformat.rawAddress).toUInt()

public actual fun ndrConformantStructUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrConformantStructUnmarshall(pstubmsg.rawAddress, ppmemory.rawAddress, pformat.rawAddress, fmustalloc.toByte()))

public actual fun ndrConformantVaryingArrayBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrConformantVaryingArrayBufferSize(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress)
}

public actual fun ndrConformantVaryingArrayFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrConformantVaryingArrayFree(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress)
}

public actual fun ndrConformantVaryingArrayMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrConformantVaryingArrayMarshall(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress))

public actual fun ndrConformantVaryingArrayMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrConformantVaryingArrayMemorySize(pstubmsg.rawAddress, pformat.rawAddress).toUInt()

public actual fun ndrConformantVaryingArrayUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrConformantVaryingArrayUnmarshall(pstubmsg.rawAddress, ppmemory.rawAddress, pformat.rawAddress, fmustalloc.toByte()))

public actual fun ndrConformantVaryingStructBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrConformantVaryingStructBufferSize(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress)
}

public actual fun ndrConformantVaryingStructFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrConformantVaryingStructFree(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress)
}

public actual fun ndrConformantVaryingStructMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrConformantVaryingStructMarshall(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress))

public actual fun ndrConformantVaryingStructMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrConformantVaryingStructMemorySize(pstubmsg.rawAddress, pformat.rawAddress).toUInt()

public actual fun ndrConformantVaryingStructUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrConformantVaryingStructUnmarshall(pstubmsg.rawAddress, ppmemory.rawAddress, pformat.rawAddress, fmustalloc.toByte()))

public actual fun ndrContextHandleInitialize(pstubmsg: ConstPtr<MidlStubMessage>, pformat: ConstPtr<UByte>): MutPtr<NdrScontext> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrContextHandleInitialize(pstubmsg.rawAddress, pformat.rawAddress))

public actual fun ndrContextHandleSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrContextHandleSize(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress)
}

public actual fun ndrConvert(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrConvert(pstubmsg.rawAddress, pformat.rawAddress)
}

public actual fun ndrConvert2(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>, numberparams: Int) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrConvert2(pstubmsg.rawAddress, pformat.rawAddress, numberparams)
}

public actual fun ndrCorrelationFree(pstubmsg: MutPtr<MidlStubMessage>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrCorrelationFree(pstubmsg.rawAddress)
}

public actual fun ndrCorrelationInitialize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<CVoid>, cachesize: UInt, flags: UInt) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrCorrelationInitialize(pstubmsg.rawAddress, pmemory.rawAddress, cachesize.toInt(), flags.toInt())
}

public actual fun ndrCorrelationPass(pstubmsg: MutPtr<MidlStubMessage>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrCorrelationPass(pstubmsg.rawAddress)
}

public actual fun ndrCreateServerInterfaceFromStub(pstub: MutPtr<CVoid>, pserverif: MutPtr<RpcServerInterface>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrCreateServerInterfaceFromStub(pstub.rawAddress, pserverif.rawAddress)

public actual fun ndrDcomAsyncClientCall(pstubdescriptor: MutPtr<MidlStubDesc>, pformat: MutPtr<UByte>, vararg variadicArgs: Long): ClientCallReturn =
    ClientCallReturn()

public actual fun ndrDcomAsyncStubCall(pthis: MutPtr<CVoid>, pchannel: MutPtr<CVoid>, prpcmsg: MutPtr<RpcMessage>, pdwstubphase: MutPtr<UInt>): Int =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrDcomAsyncStubCall(pthis.rawAddress, pchannel.rawAddress, prpcmsg.rawAddress, pdwstubphase.rawAddress)

public actual fun ndrEncapsulatedUnionBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrEncapsulatedUnionBufferSize(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress)
}

public actual fun ndrEncapsulatedUnionFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrEncapsulatedUnionFree(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress)
}

public actual fun ndrEncapsulatedUnionMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrEncapsulatedUnionMarshall(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress))

public actual fun ndrEncapsulatedUnionMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrEncapsulatedUnionMemorySize(pstubmsg.rawAddress, pformat.rawAddress).toUInt()

public actual fun ndrEncapsulatedUnionUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrEncapsulatedUnionUnmarshall(pstubmsg.rawAddress, ppmemory.rawAddress, pformat.rawAddress, fmustalloc.toByte()))

public actual fun ndrFixedArrayBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrFixedArrayBufferSize(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress)
}

public actual fun ndrFixedArrayFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrFixedArrayFree(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress)
}

public actual fun ndrFixedArrayMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrFixedArrayMarshall(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress))

public actual fun ndrFixedArrayMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrFixedArrayMemorySize(pstubmsg.rawAddress, pformat.rawAddress).toUInt()

public actual fun ndrFixedArrayUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrFixedArrayUnmarshall(pstubmsg.rawAddress, ppmemory.rawAddress, pformat.rawAddress, fmustalloc.toByte()))

public actual fun ndrFreeBuffer(pstubmsg: MutPtr<MidlStubMessage>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrFreeBuffer(pstubmsg.rawAddress)
}

public actual fun ndrFullPointerXlatFree(pxlattables: MutPtr<FullPtrXlatTables>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrFullPointerXlatFree(pxlattables.rawAddress)
}

public actual fun ndrFullPointerXlatInit(numberofpointers: UInt, xlatside: XlatSide): MutPtr<FullPtrXlatTables> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrFullPointerXlatInit(numberofpointers.toInt(), xlatside))

public actual fun ndrGetBuffer(pstubmsg: MutPtr<MidlStubMessage>, bufferlength: UInt, handle: MutPtr<CVoid>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrGetBuffer(pstubmsg.rawAddress, bufferlength.toInt(), handle.rawAddress))

public actual fun ndrGetDcomProtocolVersion(pstubmsg: MutPtr<MidlStubMessage>, pversion: MutPtr<RpcVersion>): Hresult =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrGetDcomProtocolVersion(pstubmsg.rawAddress, pversion.rawAddress)

public actual fun ndrGetUserMarshalInfo(pflags: ConstPtr<UInt>, informationlevel: UInt, pmarshalinfo: MutPtr<NdrUserMarshalInfo>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrGetUserMarshalInfo(pflags.rawAddress, informationlevel.toInt(), pmarshalinfo.rawAddress)

public actual fun ndrInterfacePointerBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrInterfacePointerBufferSize(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress)
}

public actual fun ndrInterfacePointerFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrInterfacePointerFree(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress)
}

public actual fun ndrInterfacePointerMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrInterfacePointerMarshall(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress))

public actual fun ndrInterfacePointerMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrInterfacePointerMemorySize(pstubmsg.rawAddress, pformat.rawAddress).toUInt()

public actual fun ndrInterfacePointerUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrInterfacePointerUnmarshall(pstubmsg.rawAddress, ppmemory.rawAddress, pformat.rawAddress, fmustalloc.toByte()))

public actual fun ndrMapCommAndFaultStatus(pstubmsg: MutPtr<MidlStubMessage>, pcommstatus: MutPtr<UInt>, pfaultstatus: MutPtr<UInt>, status: RpcStatus): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrMapCommAndFaultStatus(pstubmsg.rawAddress, pcommstatus.rawAddress, pfaultstatus.rawAddress, status)

public actual fun ndrMesProcEncodeDecode(handle: MutPtr<CVoid>, pstubdesc: ConstPtr<MidlStubDesc>, pformatstring: MutPtr<UByte>, vararg variadicArgs: Long) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrMesProcEncodeDecode(handle.rawAddress, pstubdesc.rawAddress, pformatstring.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun ndrMesProcEncodeDecode2(handle: MutPtr<CVoid>, pstubdesc: ConstPtr<MidlStubDesc>, pformatstring: MutPtr<UByte>, vararg variadicArgs: Long): ClientCallReturn =
    ClientCallReturn()

public actual fun ndrMesProcEncodeDecode3(handle: MutPtr<CVoid>, pproxyinfo: ConstPtr<MidlStublessProxyInfo>, nprocnum: UInt, preturnvalue: MutPtr<CVoid>, vararg variadicArgs: Long): ClientCallReturn =
    ClientCallReturn()

public actual fun ndrMesSimpleTypeAlignSize(param0: MutPtr<CVoid>): ULong =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrMesSimpleTypeAlignSize(param0.rawAddress).toULong()

public actual fun ndrMesSimpleTypeAlignSizeAll(handle: MutPtr<CVoid>, pproxyinfo: ConstPtr<MidlStublessProxyInfo>): ULong =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrMesSimpleTypeAlignSizeAll(handle.rawAddress, pproxyinfo.rawAddress).toULong()

public actual fun ndrMesSimpleTypeDecode(handle: MutPtr<CVoid>, pobject: MutPtr<CVoid>, size: Short) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrMesSimpleTypeDecode(handle.rawAddress, pobject.rawAddress, size)
}

public actual fun ndrMesSimpleTypeDecodeAll(handle: MutPtr<CVoid>, pproxyinfo: ConstPtr<MidlStublessProxyInfo>, pobject: MutPtr<CVoid>, size: Short) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrMesSimpleTypeDecodeAll(handle.rawAddress, pproxyinfo.rawAddress, pobject.rawAddress, size)
}

public actual fun ndrMesSimpleTypeEncode(handle: MutPtr<CVoid>, pstubdesc: ConstPtr<MidlStubDesc>, pobject: ConstPtr<CVoid>, size: Short) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrMesSimpleTypeEncode(handle.rawAddress, pstubdesc.rawAddress, pobject.rawAddress, size)
}

public actual fun ndrMesSimpleTypeEncodeAll(handle: MutPtr<CVoid>, pproxyinfo: ConstPtr<MidlStublessProxyInfo>, pobject: ConstPtr<CVoid>, size: Short) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrMesSimpleTypeEncodeAll(handle.rawAddress, pproxyinfo.rawAddress, pobject.rawAddress, size)
}

public actual fun ndrMesTypeAlignSize(handle: MutPtr<CVoid>, pstubdesc: ConstPtr<MidlStubDesc>, pformatstring: MutPtr<UByte>, pobject: ConstPtr<CVoid>): ULong =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrMesTypeAlignSize(handle.rawAddress, pstubdesc.rawAddress, pformatstring.rawAddress, pobject.rawAddress).toULong()

public actual fun ndrMesTypeAlignSize2(handle: MutPtr<CVoid>, ppicklinginfo: ConstPtr<MidlTypePicklingInfo>, pstubdesc: ConstPtr<MidlStubDesc>, pformatstring: MutPtr<UByte>, pobject: ConstPtr<CVoid>): ULong =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrMesTypeAlignSize2(handle.rawAddress, ppicklinginfo.rawAddress, pstubdesc.rawAddress, pformatstring.rawAddress, pobject.rawAddress).toULong()

public actual fun ndrMesTypeAlignSize3(handle: MutPtr<CVoid>, ppicklinginfo: ConstPtr<MidlTypePicklingInfo>, pproxyinfo: ConstPtr<MidlStublessProxyInfo>, arrtypeoffset: ConstPtr<ConstPtr<UInt>>, ntypeindex: UInt, pobject: ConstPtr<CVoid>): ULong =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrMesTypeAlignSize3(handle.rawAddress, ppicklinginfo.rawAddress, pproxyinfo.rawAddress, arrtypeoffset.rawAddress, ntypeindex.toInt(), pobject.rawAddress).toULong()

public actual fun ndrMesTypeDecode(handle: MutPtr<CVoid>, pstubdesc: ConstPtr<MidlStubDesc>, pformatstring: MutPtr<UByte>, pobject: MutPtr<CVoid>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrMesTypeDecode(handle.rawAddress, pstubdesc.rawAddress, pformatstring.rawAddress, pobject.rawAddress)
}

public actual fun ndrMesTypeDecode2(handle: MutPtr<CVoid>, ppicklinginfo: ConstPtr<MidlTypePicklingInfo>, pstubdesc: ConstPtr<MidlStubDesc>, pformatstring: MutPtr<UByte>, pobject: MutPtr<CVoid>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrMesTypeDecode2(handle.rawAddress, ppicklinginfo.rawAddress, pstubdesc.rawAddress, pformatstring.rawAddress, pobject.rawAddress)
}

public actual fun ndrMesTypeDecode3(handle: MutPtr<CVoid>, ppicklinginfo: ConstPtr<MidlTypePicklingInfo>, pproxyinfo: ConstPtr<MidlStublessProxyInfo>, arrtypeoffset: ConstPtr<ConstPtr<UInt>>, ntypeindex: UInt, pobject: MutPtr<CVoid>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrMesTypeDecode3(handle.rawAddress, ppicklinginfo.rawAddress, pproxyinfo.rawAddress, arrtypeoffset.rawAddress, ntypeindex.toInt(), pobject.rawAddress)
}

public actual fun ndrMesTypeEncode(handle: MutPtr<CVoid>, pstubdesc: ConstPtr<MidlStubDesc>, pformatstring: MutPtr<UByte>, pobject: ConstPtr<CVoid>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrMesTypeEncode(handle.rawAddress, pstubdesc.rawAddress, pformatstring.rawAddress, pobject.rawAddress)
}

public actual fun ndrMesTypeEncode2(handle: MutPtr<CVoid>, ppicklinginfo: ConstPtr<MidlTypePicklingInfo>, pstubdesc: ConstPtr<MidlStubDesc>, pformatstring: MutPtr<UByte>, pobject: ConstPtr<CVoid>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrMesTypeEncode2(handle.rawAddress, ppicklinginfo.rawAddress, pstubdesc.rawAddress, pformatstring.rawAddress, pobject.rawAddress)
}

public actual fun ndrMesTypeEncode3(handle: MutPtr<CVoid>, ppicklinginfo: ConstPtr<MidlTypePicklingInfo>, pproxyinfo: ConstPtr<MidlStublessProxyInfo>, arrtypeoffset: ConstPtr<ConstPtr<UInt>>, ntypeindex: UInt, pobject: ConstPtr<CVoid>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrMesTypeEncode3(handle.rawAddress, ppicklinginfo.rawAddress, pproxyinfo.rawAddress, arrtypeoffset.rawAddress, ntypeindex.toInt(), pobject.rawAddress)
}

public actual fun ndrMesTypeFree2(handle: MutPtr<CVoid>, ppicklinginfo: ConstPtr<MidlTypePicklingInfo>, pstubdesc: ConstPtr<MidlStubDesc>, pformatstring: MutPtr<UByte>, pobject: MutPtr<CVoid>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrMesTypeFree2(handle.rawAddress, ppicklinginfo.rawAddress, pstubdesc.rawAddress, pformatstring.rawAddress, pobject.rawAddress)
}

public actual fun ndrMesTypeFree3(handle: MutPtr<CVoid>, ppicklinginfo: ConstPtr<MidlTypePicklingInfo>, pproxyinfo: ConstPtr<MidlStublessProxyInfo>, arrtypeoffset: ConstPtr<ConstPtr<UInt>>, ntypeindex: UInt, pobject: MutPtr<CVoid>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrMesTypeFree3(handle.rawAddress, ppicklinginfo.rawAddress, pproxyinfo.rawAddress, arrtypeoffset.rawAddress, ntypeindex.toInt(), pobject.rawAddress)
}

public actual fun ndrNonConformantStringBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrNonConformantStringBufferSize(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress)
}

public actual fun ndrNonConformantStringMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrNonConformantStringMarshall(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress))

public actual fun ndrNonConformantStringMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrNonConformantStringMemorySize(pstubmsg.rawAddress, pformat.rawAddress).toUInt()

public actual fun ndrNonConformantStringUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrNonConformantStringUnmarshall(pstubmsg.rawAddress, ppmemory.rawAddress, pformat.rawAddress, fmustalloc.toByte()))

public actual fun ndrNonEncapsulatedUnionBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrNonEncapsulatedUnionBufferSize(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress)
}

public actual fun ndrNonEncapsulatedUnionFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrNonEncapsulatedUnionFree(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress)
}

public actual fun ndrNonEncapsulatedUnionMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrNonEncapsulatedUnionMarshall(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress))

public actual fun ndrNonEncapsulatedUnionMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrNonEncapsulatedUnionMemorySize(pstubmsg.rawAddress, pformat.rawAddress).toUInt()

public actual fun ndrNonEncapsulatedUnionUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrNonEncapsulatedUnionUnmarshall(pstubmsg.rawAddress, ppmemory.rawAddress, pformat.rawAddress, fmustalloc.toByte()))

public actual fun ndrNsGetBuffer(pstubmsg: MutPtr<MidlStubMessage>, bufferlength: UInt, handle: MutPtr<CVoid>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrNsGetBuffer(pstubmsg.rawAddress, bufferlength.toInt(), handle.rawAddress))

public actual fun ndrNsSendReceive(pstubmsg: MutPtr<MidlStubMessage>, pbufferend: MutPtr<UByte>, pautohandle: MutPtr<MutPtr<CVoid>>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrNsSendReceive(pstubmsg.rawAddress, pbufferend.rawAddress, pautohandle.rawAddress))

public actual fun ndrOleAllocate(size: ULong): MutPtr<CVoid> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrOleAllocate(size.toLong()))

public actual fun ndrOleFree(nodetofree: ConstPtr<CVoid>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrOleFree(nodetofree.rawAddress)
}

public actual fun ndrPartialIgnoreClientBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<CVoid>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrPartialIgnoreClientBufferSize(pstubmsg.rawAddress, pmemory.rawAddress)
}

public actual fun ndrPartialIgnoreClientMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<CVoid>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrPartialIgnoreClientMarshall(pstubmsg.rawAddress, pmemory.rawAddress)
}

public actual fun ndrPartialIgnoreServerInitialize(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<CVoid>>, pformat: MutPtr<UByte>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrPartialIgnoreServerInitialize(pstubmsg.rawAddress, ppmemory.rawAddress, pformat.rawAddress)
}

public actual fun ndrPartialIgnoreServerUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<CVoid>>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrPartialIgnoreServerUnmarshall(pstubmsg.rawAddress, ppmemory.rawAddress)
}

public actual fun ndrPointerBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrPointerBufferSize(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress)
}

public actual fun ndrPointerFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrPointerFree(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress)
}

public actual fun ndrPointerMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrPointerMarshall(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress))

public actual fun ndrPointerMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrPointerMemorySize(pstubmsg.rawAddress, pformat.rawAddress).toUInt()

public actual fun ndrPointerUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrPointerUnmarshall(pstubmsg.rawAddress, ppmemory.rawAddress, pformat.rawAddress, fmustalloc.toByte()))

public actual fun ndrRangeUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrRangeUnmarshall(pstubmsg.rawAddress, ppmemory.rawAddress, pformat.rawAddress, fmustalloc.toByte()))

public actual fun ndrRpcSmClientAllocate(size: ULong): MutPtr<CVoid> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrRpcSmClientAllocate(size.toLong()))

public actual fun ndrRpcSmClientFree(nodetofree: ConstPtr<CVoid>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrRpcSmClientFree(nodetofree.rawAddress)
}

public actual fun ndrRpcSmSetClientToOsf(pmessage: MutPtr<MidlStubMessage>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrRpcSmSetClientToOsf(pmessage.rawAddress)
}

public actual fun ndrRpcSsDefaultAllocate(size: ULong): MutPtr<CVoid> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrRpcSsDefaultAllocate(size.toLong()))

public actual fun ndrRpcSsDefaultFree(nodetofree: ConstPtr<CVoid>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrRpcSsDefaultFree(nodetofree.rawAddress)
}

public actual fun ndrRpcSsDisableAllocate(pmessage: MutPtr<MidlStubMessage>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrRpcSsDisableAllocate(pmessage.rawAddress)
}

public actual fun ndrRpcSsEnableAllocate(pmessage: MutPtr<MidlStubMessage>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrRpcSsEnableAllocate(pmessage.rawAddress)
}

public actual fun ndrSendReceive(pstubmsg: MutPtr<MidlStubMessage>, pbufferend: MutPtr<UByte>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrSendReceive(pstubmsg.rawAddress, pbufferend.rawAddress))

public actual fun ndrServerCall2(prpcmsg: MutPtr<RpcMessage>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrServerCall2(prpcmsg.rawAddress)
}

public actual fun ndrServerCallAll(prpcmsg: MutPtr<RpcMessage>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrServerCallAll(prpcmsg.rawAddress)
}

public actual fun ndrServerCallNdr64(prpcmsg: MutPtr<RpcMessage>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrServerCallNdr64(prpcmsg.rawAddress)
}

public actual fun ndrServerContextMarshall(pstubmsg: MutPtr<MidlStubMessage>, contexthandle: MutPtr<NdrScontext>, rundownroutine: NdrRundown) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrServerContextMarshall(pstubmsg.rawAddress, contexthandle.rawAddress, 0L)
}

public actual fun ndrServerContextNewMarshall(pstubmsg: MutPtr<MidlStubMessage>, contexthandle: MutPtr<NdrScontext>, rundownroutine: NdrRundown, pformat: MutPtr<UByte>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrServerContextNewMarshall(pstubmsg.rawAddress, contexthandle.rawAddress, 0L, pformat.rawAddress)
}

public actual fun ndrServerContextNewUnmarshall(pstubmsg: ConstPtr<MidlStubMessage>, pformat: ConstPtr<UByte>): MutPtr<NdrScontext> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrServerContextNewUnmarshall(pstubmsg.rawAddress, pformat.rawAddress))

public actual fun ndrServerContextUnmarshall(pstubmsg: MutPtr<MidlStubMessage>): MutPtr<NdrScontext> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrServerContextUnmarshall(pstubmsg.rawAddress))

public actual fun ndrServerInitialize(prpcmsg: MutPtr<RpcMessage>, pstubmsg: MutPtr<MidlStubMessage>, pstubdescriptor: MutPtr<MidlStubDesc>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrServerInitialize(prpcmsg.rawAddress, pstubmsg.rawAddress, pstubdescriptor.rawAddress))

public actual fun ndrServerInitializeMarshall(prpcmsg: MutPtr<RpcMessage>, pstubmsg: MutPtr<MidlStubMessage>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrServerInitializeMarshall(prpcmsg.rawAddress, pstubmsg.rawAddress)
}

public actual fun ndrServerInitializeNew(prpcmsg: MutPtr<RpcMessage>, pstubmsg: MutPtr<MidlStubMessage>, pstubdescriptor: MutPtr<MidlStubDesc>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrServerInitializeNew(prpcmsg.rawAddress, pstubmsg.rawAddress, pstubdescriptor.rawAddress))

public actual fun ndrServerInitializePartial(prpcmsg: MutPtr<RpcMessage>, pstubmsg: MutPtr<MidlStubMessage>, pstubdescriptor: MutPtr<MidlStubDesc>, requestedbuffersize: UInt) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrServerInitializePartial(prpcmsg.rawAddress, pstubmsg.rawAddress, pstubdescriptor.rawAddress, requestedbuffersize.toInt())
}

public actual fun ndrServerInitializeUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, pstubdescriptor: MutPtr<MidlStubDesc>, prpcmsg: MutPtr<RpcMessage>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrServerInitializeUnmarshall(pstubmsg.rawAddress, pstubdescriptor.rawAddress, prpcmsg.rawAddress))

public actual fun ndrSimpleStructBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrSimpleStructBufferSize(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress)
}

public actual fun ndrSimpleStructFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrSimpleStructFree(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress)
}

public actual fun ndrSimpleStructMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrSimpleStructMarshall(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress))

public actual fun ndrSimpleStructMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrSimpleStructMemorySize(pstubmsg.rawAddress, pformat.rawAddress).toUInt()

public actual fun ndrSimpleStructUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrSimpleStructUnmarshall(pstubmsg.rawAddress, ppmemory.rawAddress, pformat.rawAddress, fmustalloc.toByte()))

public actual fun ndrSimpleTypeMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, formatchar: UByte) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrSimpleTypeMarshall(pstubmsg.rawAddress, pmemory.rawAddress, formatchar.toByte())
}

public actual fun ndrSimpleTypeUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, formatchar: UByte) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrSimpleTypeUnmarshall(pstubmsg.rawAddress, pmemory.rawAddress, formatchar.toByte())
}

public actual fun ndrStubCall2(pthis: MutPtr<CVoid>, pchannel: MutPtr<CVoid>, prpcmsg: MutPtr<RpcMessage>, pdwstubphase: MutPtr<UInt>): Int =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrStubCall2(pthis.rawAddress, pchannel.rawAddress, prpcmsg.rawAddress, pdwstubphase.rawAddress)

public actual fun ndrStubCall3(pthis: MutPtr<CVoid>, pchannel: MutPtr<CVoid>, prpcmsg: MutPtr<RpcMessage>, pdwstubphase: MutPtr<UInt>): Int =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrStubCall3(pthis.rawAddress, pchannel.rawAddress, prpcmsg.rawAddress, pdwstubphase.rawAddress)

public actual fun ndrUserMarshalBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrUserMarshalBufferSize(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress)
}

public actual fun ndrUserMarshalFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrUserMarshalFree(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress)
}

public actual fun ndrUserMarshalMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrUserMarshalMarshall(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress))

public actual fun ndrUserMarshalMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrUserMarshalMemorySize(pstubmsg.rawAddress, pformat.rawAddress).toUInt()

public actual fun ndrUserMarshalSimpleTypeConvert(pflags: MutPtr<UInt>, pbuffer: MutPtr<UByte>, formatchar: UByte): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrUserMarshalSimpleTypeConvert(pflags.rawAddress, pbuffer.rawAddress, formatchar.toByte()))

public actual fun ndrUserMarshalUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrUserMarshalUnmarshall(pstubmsg.rawAddress, ppmemory.rawAddress, pformat.rawAddress, fmustalloc.toByte()))

public actual fun ndrVaryingArrayBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrVaryingArrayBufferSize(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress)
}

public actual fun ndrVaryingArrayFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrVaryingArrayFree(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress)
}

public actual fun ndrVaryingArrayMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrVaryingArrayMarshall(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress))

public actual fun ndrVaryingArrayMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrVaryingArrayMemorySize(pstubmsg.rawAddress, pformat.rawAddress).toUInt()

public actual fun ndrVaryingArrayUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrVaryingArrayUnmarshall(pstubmsg.rawAddress, ppmemory.rawAddress, pformat.rawAddress, fmustalloc.toByte()))

public actual fun ndrXmitOrRepAsBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrXmitOrRepAsBufferSize(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress)
}

public actual fun ndrXmitOrRepAsFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrXmitOrRepAsFree(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress)
}

public actual fun ndrXmitOrRepAsMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrXmitOrRepAsMarshall(pstubmsg.rawAddress, pmemory.rawAddress, pformat.rawAddress))

public actual fun ndrXmitOrRepAsMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrXmitOrRepAsMemorySize(pstubmsg.rawAddress, pformat.rawAddress).toUInt()

public actual fun ndrXmitOrRepAsUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcNdrXmitOrRepAsUnmarshall(pstubmsg.rawAddress, ppmemory.rawAddress, pformat.rawAddress, fmustalloc.toByte()))

public actual fun rpcAsyncAbortCall(pasync: MutPtr<RpcAsyncState>, exceptioncode: UInt): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcAsyncAbortCall(pasync.rawAddress, exceptioncode.toInt())

public actual fun rpcAsyncCancelCall(pasync: MutPtr<RpcAsyncState>, fabort: Bool): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcAsyncCancelCall(pasync.rawAddress, fabort)

public actual fun rpcAsyncCompleteCall(pasync: MutPtr<RpcAsyncState>, reply: MutPtr<CVoid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcAsyncCompleteCall(pasync.rawAddress, reply.rawAddress)

public actual fun rpcAsyncGetCallStatus(pasync: ConstPtr<RpcAsyncState>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcAsyncGetCallStatus(pasync.rawAddress)

public actual fun rpcAsyncInitializeHandle(pasync: MutPtr<RpcAsyncState>, size: UInt): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcAsyncInitializeHandle(pasync.rawAddress, size.toInt())

public actual fun rpcAsyncRegisterInfo(pasync: ConstPtr<RpcAsyncState>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcAsyncRegisterInfo(pasync.rawAddress)

public actual fun rpcBindingBind(pasync: ConstPtr<RpcAsyncState>, binding: ConstPtr<CVoid>, ifspec: ConstPtr<CVoid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcBindingBind(pasync.rawAddress, binding.rawAddress, ifspec.rawAddress)

public actual fun rpcBindingCopy(sourcebinding: ConstPtr<CVoid>, destinationbinding: MutPtr<MutPtr<CVoid>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcBindingCopy(sourcebinding.rawAddress, destinationbinding.rawAddress)

public actual fun rpcBindingCreateA(template: ConstPtr<RpcBindingHandleTemplateV1A>, security: ConstPtr<RpcBindingHandleSecurityV1A>, options: ConstPtr<RpcBindingHandleOptionsV1>, binding: MutPtr<MutPtr<CVoid>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcBindingCreateA(template.rawAddress, security.rawAddress, options.rawAddress, binding.rawAddress)

public actual fun rpcBindingCreateW(template: ConstPtr<RpcBindingHandleTemplateV1W>, security: ConstPtr<RpcBindingHandleSecurityV1W>, options: ConstPtr<RpcBindingHandleOptionsV1>, binding: MutPtr<MutPtr<CVoid>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcBindingCreateW(template.rawAddress, security.rawAddress, options.rawAddress, binding.rawAddress)

public actual fun rpcBindingFree(binding: MutPtr<MutPtr<CVoid>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcBindingFree(binding.rawAddress)

public actual fun rpcBindingFromStringBindingA(stringbinding: Pcstr, binding: MutPtr<MutPtr<CVoid>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcBindingFromStringBindingA(stringbinding.rawAddress, binding.rawAddress)

public actual fun rpcBindingFromStringBindingW(stringbinding: Pcwstr, binding: MutPtr<MutPtr<CVoid>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcBindingFromStringBindingW(stringbinding.rawAddress, binding.rawAddress)

public actual fun rpcBindingInqAuthClientA(clientbinding: ConstPtr<CVoid>, privs: MutPtr<MutPtr<CVoid>>, serverprincname: MutPtr<Pstr>, authnlevel: MutPtr<UInt>, authnsvc: MutPtr<UInt>, authzsvc: MutPtr<UInt>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcBindingInqAuthClientA(clientbinding.rawAddress, privs.rawAddress, serverprincname.rawAddress, authnlevel.rawAddress, authnsvc.rawAddress, authzsvc.rawAddress)

public actual fun rpcBindingInqAuthClientExA(clientbinding: ConstPtr<CVoid>, privs: MutPtr<MutPtr<CVoid>>, serverprincname: MutPtr<Pstr>, authnlevel: MutPtr<UInt>, authnsvc: MutPtr<UInt>, authzsvc: MutPtr<UInt>, flags: UInt): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcBindingInqAuthClientExA(clientbinding.rawAddress, privs.rawAddress, serverprincname.rawAddress, authnlevel.rawAddress, authnsvc.rawAddress, authzsvc.rawAddress, flags.toInt())

public actual fun rpcBindingInqAuthClientExW(clientbinding: ConstPtr<CVoid>, privs: MutPtr<MutPtr<CVoid>>, serverprincname: MutPtr<Pwstr>, authnlevel: MutPtr<UInt>, authnsvc: MutPtr<UInt>, authzsvc: MutPtr<UInt>, flags: UInt): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcBindingInqAuthClientExW(clientbinding.rawAddress, privs.rawAddress, serverprincname.rawAddress, authnlevel.rawAddress, authnsvc.rawAddress, authzsvc.rawAddress, flags.toInt())

public actual fun rpcBindingInqAuthClientW(clientbinding: ConstPtr<CVoid>, privs: MutPtr<MutPtr<CVoid>>, serverprincname: MutPtr<Pwstr>, authnlevel: MutPtr<UInt>, authnsvc: MutPtr<UInt>, authzsvc: MutPtr<UInt>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcBindingInqAuthClientW(clientbinding.rawAddress, privs.rawAddress, serverprincname.rawAddress, authnlevel.rawAddress, authnsvc.rawAddress, authzsvc.rawAddress)

public actual fun rpcBindingInqAuthInfoA(binding: ConstPtr<CVoid>, serverprincname: MutPtr<Pstr>, authnlevel: MutPtr<UInt>, authnsvc: MutPtr<UInt>, authidentity: MutPtr<MutPtr<CVoid>>, authzsvc: MutPtr<UInt>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcBindingInqAuthInfoA(binding.rawAddress, serverprincname.rawAddress, authnlevel.rawAddress, authnsvc.rawAddress, authidentity.rawAddress, authzsvc.rawAddress)

public actual fun rpcBindingInqAuthInfoExA(binding: ConstPtr<CVoid>, serverprincname: MutPtr<Pstr>, authnlevel: MutPtr<UInt>, authnsvc: MutPtr<UInt>, authidentity: MutPtr<MutPtr<CVoid>>, authzsvc: MutPtr<UInt>, rpcqosversion: UInt, securityqos: MutPtr<RpcSecurityQos>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcBindingInqAuthInfoExA(binding.rawAddress, serverprincname.rawAddress, authnlevel.rawAddress, authnsvc.rawAddress, authidentity.rawAddress, authzsvc.rawAddress, rpcqosversion.toInt(), securityqos.rawAddress)

public actual fun rpcBindingInqAuthInfoExW(binding: ConstPtr<CVoid>, serverprincname: MutPtr<Pwstr>, authnlevel: MutPtr<UInt>, authnsvc: MutPtr<UInt>, authidentity: MutPtr<MutPtr<CVoid>>, authzsvc: MutPtr<UInt>, rpcqosversion: UInt, securityqos: MutPtr<RpcSecurityQos>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcBindingInqAuthInfoExW(binding.rawAddress, serverprincname.rawAddress, authnlevel.rawAddress, authnsvc.rawAddress, authidentity.rawAddress, authzsvc.rawAddress, rpcqosversion.toInt(), securityqos.rawAddress)

public actual fun rpcBindingInqAuthInfoW(binding: ConstPtr<CVoid>, serverprincname: MutPtr<Pwstr>, authnlevel: MutPtr<UInt>, authnsvc: MutPtr<UInt>, authidentity: MutPtr<MutPtr<CVoid>>, authzsvc: MutPtr<UInt>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcBindingInqAuthInfoW(binding.rawAddress, serverprincname.rawAddress, authnlevel.rawAddress, authnsvc.rawAddress, authidentity.rawAddress, authzsvc.rawAddress)

public actual fun rpcBindingInqMaxCalls(binding: ConstPtr<CVoid>, maxcalls: MutPtr<UInt>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcBindingInqMaxCalls(binding.rawAddress, maxcalls.rawAddress)

public actual fun rpcBindingInqObject(binding: ConstPtr<CVoid>, objectuuid: MutPtr<Guid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcBindingInqObject(binding.rawAddress, objectuuid.rawAddress)

public actual fun rpcBindingInqOption(hbinding: ConstPtr<CVoid>, option: UInt, poptionvalue: MutPtr<ULong>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcBindingInqOption(hbinding.rawAddress, option.toInt(), poptionvalue.rawAddress)

public actual fun rpcBindingReset(binding: ConstPtr<CVoid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcBindingReset(binding.rawAddress)

public actual fun rpcBindingServerFromClient(clientbinding: ConstPtr<CVoid>, serverbinding: MutPtr<MutPtr<CVoid>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcBindingServerFromClient(clientbinding.rawAddress, serverbinding.rawAddress)

public actual fun rpcBindingSetAuthInfoA(binding: ConstPtr<CVoid>, serverprincname: Pcstr, authnlevel: UInt, authnsvc: UInt, authidentity: ConstPtr<CVoid>, authzsvc: UInt): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcBindingSetAuthInfoA(binding.rawAddress, serverprincname.rawAddress, authnlevel.toInt(), authnsvc.toInt(), authidentity.rawAddress, authzsvc.toInt())

public actual fun rpcBindingSetAuthInfoExA(binding: ConstPtr<CVoid>, serverprincname: Pcstr, authnlevel: UInt, authnsvc: UInt, authidentity: ConstPtr<CVoid>, authzsvc: UInt, securityqos: ConstPtr<RpcSecurityQos>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcBindingSetAuthInfoExA(binding.rawAddress, serverprincname.rawAddress, authnlevel.toInt(), authnsvc.toInt(), authidentity.rawAddress, authzsvc.toInt(), securityqos.rawAddress)

public actual fun rpcBindingSetAuthInfoExW(binding: ConstPtr<CVoid>, serverprincname: Pcwstr, authnlevel: UInt, authnsvc: UInt, authidentity: ConstPtr<CVoid>, authzsvc: UInt, securityqos: ConstPtr<RpcSecurityQos>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcBindingSetAuthInfoExW(binding.rawAddress, serverprincname.rawAddress, authnlevel.toInt(), authnsvc.toInt(), authidentity.rawAddress, authzsvc.toInt(), securityqos.rawAddress)

public actual fun rpcBindingSetAuthInfoW(binding: ConstPtr<CVoid>, serverprincname: Pcwstr, authnlevel: UInt, authnsvc: UInt, authidentity: ConstPtr<CVoid>, authzsvc: UInt): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcBindingSetAuthInfoW(binding.rawAddress, serverprincname.rawAddress, authnlevel.toInt(), authnsvc.toInt(), authidentity.rawAddress, authzsvc.toInt())

public actual fun rpcBindingSetObject(binding: ConstPtr<CVoid>, objectuuid: ConstPtr<Guid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcBindingSetObject(binding.rawAddress, objectuuid.rawAddress)

public actual fun rpcBindingSetOption(hbinding: ConstPtr<CVoid>, option: UInt, optionvalue: ULong): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcBindingSetOption(hbinding.rawAddress, option.toInt(), optionvalue.toLong())

public actual fun rpcBindingToStringBindingA(binding: ConstPtr<CVoid>, stringbinding: MutPtr<Pstr>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcBindingToStringBindingA(binding.rawAddress, stringbinding.rawAddress)

public actual fun rpcBindingToStringBindingW(binding: ConstPtr<CVoid>, stringbinding: MutPtr<Pwstr>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcBindingToStringBindingW(binding.rawAddress, stringbinding.rawAddress)

public actual fun rpcBindingUnbind(binding: ConstPtr<CVoid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcBindingUnbind(binding.rawAddress)

public actual fun rpcBindingVectorFree(bindingvector: MutPtr<MutPtr<RpcBindingVector>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcBindingVectorFree(bindingvector.rawAddress)

public actual fun rpcCancelThread(thread: ConstPtr<CVoid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcCancelThread(thread.rawAddress)

public actual fun rpcCancelThreadEx(thread: ConstPtr<CVoid>, timeout: Int): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcCancelThreadEx(thread.rawAddress, timeout)

public actual fun rpcCertGeneratePrincipalNameA(context: ConstPtr<CertContext>, flags: UInt, pbuffer: MutPtr<Pstr>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcCertGeneratePrincipalNameA(context.rawAddress, flags.toInt(), pbuffer.rawAddress)

public actual fun rpcCertGeneratePrincipalNameW(context: ConstPtr<CertContext>, flags: UInt, pbuffer: MutPtr<Pwstr>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcCertGeneratePrincipalNameW(context.rawAddress, flags.toInt(), pbuffer.rawAddress)

public actual fun rpcEpRegisterA(ifspec: ConstPtr<CVoid>, bindingvector: ConstPtr<RpcBindingVector>, uuidvector: ConstPtr<UuidVector>, annotation: Pcstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcEpRegisterA(ifspec.rawAddress, bindingvector.rawAddress, uuidvector.rawAddress, annotation.rawAddress)

public actual fun rpcEpRegisterNoReplaceA(ifspec: ConstPtr<CVoid>, bindingvector: ConstPtr<RpcBindingVector>, uuidvector: ConstPtr<UuidVector>, annotation: Pcstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcEpRegisterNoReplaceA(ifspec.rawAddress, bindingvector.rawAddress, uuidvector.rawAddress, annotation.rawAddress)

public actual fun rpcEpRegisterNoReplaceW(ifspec: ConstPtr<CVoid>, bindingvector: ConstPtr<RpcBindingVector>, uuidvector: ConstPtr<UuidVector>, annotation: Pcwstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcEpRegisterNoReplaceW(ifspec.rawAddress, bindingvector.rawAddress, uuidvector.rawAddress, annotation.rawAddress)

public actual fun rpcEpRegisterW(ifspec: ConstPtr<CVoid>, bindingvector: ConstPtr<RpcBindingVector>, uuidvector: ConstPtr<UuidVector>, annotation: Pcwstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcEpRegisterW(ifspec.rawAddress, bindingvector.rawAddress, uuidvector.rawAddress, annotation.rawAddress)

public actual fun rpcEpResolveBinding(binding: ConstPtr<CVoid>, ifspec: ConstPtr<CVoid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcEpResolveBinding(binding.rawAddress, ifspec.rawAddress)

public actual fun rpcEpUnregister(ifspec: ConstPtr<CVoid>, bindingvector: ConstPtr<RpcBindingVector>, uuidvector: ConstPtr<UuidVector>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcEpUnregister(ifspec.rawAddress, bindingvector.rawAddress, uuidvector.rawAddress)

public actual fun rpcErrorAddRecord(errorinfo: ConstPtr<RpcExtendedErrorInfo>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcErrorAddRecord(errorinfo.rawAddress)

public actual fun rpcErrorClearInformation() {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcErrorClearInformation()
}

public actual fun rpcErrorEndEnumeration(enumhandle: MutPtr<RpcErrorEnumHandle>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcErrorEndEnumeration(enumhandle.rawAddress)

public actual fun rpcErrorGetNextRecord(enumhandle: ConstPtr<RpcErrorEnumHandle>, copystrings: Bool, errorinfo: MutPtr<RpcExtendedErrorInfo>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcErrorGetNextRecord(enumhandle.rawAddress, copystrings, errorinfo.rawAddress)

public actual fun rpcErrorGetNumberOfRecords(enumhandle: ConstPtr<RpcErrorEnumHandle>, records: MutPtr<Int>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcErrorGetNumberOfRecords(enumhandle.rawAddress, records.rawAddress)

public actual fun rpcErrorLoadErrorInfo(errorblob: ConstPtr<CVoid>, blobsize: ULong, enumhandle: MutPtr<RpcErrorEnumHandle>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcErrorLoadErrorInfo(errorblob.rawAddress, blobsize.toLong(), enumhandle.rawAddress)

public actual fun rpcErrorResetEnumeration(enumhandle: MutPtr<RpcErrorEnumHandle>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcErrorResetEnumeration(enumhandle.rawAddress)

public actual fun rpcErrorSaveErrorInfo(enumhandle: ConstPtr<RpcErrorEnumHandle>, errorblob: MutPtr<MutPtr<CVoid>>, blobsize: MutPtr<ULong>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcErrorSaveErrorInfo(enumhandle.rawAddress, errorblob.rawAddress, blobsize.rawAddress)

public actual fun rpcErrorStartEnumeration(enumhandle: MutPtr<RpcErrorEnumHandle>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcErrorStartEnumeration(enumhandle.rawAddress)

public actual fun rpcExceptionFilter(exceptioncode: UInt): Int =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcExceptionFilter(exceptioncode.toInt())

public actual fun rpcFreeAuthorizationContext(pauthzclientcontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcFreeAuthorizationContext(pauthzclientcontext.rawAddress)

public actual fun rpcGetAuthorizationContextForClient(clientbinding: ConstPtr<CVoid>, impersonateonreturn: Bool, reserved1: ConstPtr<CVoid>, pexpirationtime: ConstPtr<Long>, reserved2: Luid, reserved3: UInt, reserved4: ConstPtr<CVoid>, pauthzclientcontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    0

public actual fun rpcIfIdVectorFree(ifidvector: MutPtr<MutPtr<RpcIfIdVector>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcIfIdVectorFree(ifidvector.rawAddress)

public actual fun rpcIfInqId(rpcifhandle: ConstPtr<CVoid>, rpcifid: MutPtr<RpcIfId>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcIfInqId(rpcifhandle.rawAddress, rpcifid.rawAddress)

public actual fun rpcImpersonateClient(bindinghandle: ConstPtr<CVoid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcImpersonateClient(bindinghandle.rawAddress)

public actual fun rpcImpersonateClient2(bindinghandle: ConstPtr<CVoid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcImpersonateClient2(bindinghandle.rawAddress)

public actual fun rpcImpersonateClientContainer(bindinghandle: ConstPtr<CVoid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcImpersonateClientContainer(bindinghandle.rawAddress)

public actual fun rpcMgmtEnableIdleCleanup(): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcMgmtEnableIdleCleanup()

public actual fun rpcMgmtEpEltInqBegin(epbinding: ConstPtr<CVoid>, inquirytype: UInt, ifid: ConstPtr<RpcIfId>, versoption: UInt, objectuuid: ConstPtr<Guid>, inquirycontext: MutPtr<MutPtr<MutPtr<CVoid>>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcMgmtEpEltInqBegin(epbinding.rawAddress, inquirytype.toInt(), ifid.rawAddress, versoption.toInt(), objectuuid.rawAddress, inquirycontext.rawAddress)

public actual fun rpcMgmtEpEltInqDone(inquirycontext: MutPtr<MutPtr<MutPtr<CVoid>>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcMgmtEpEltInqDone(inquirycontext.rawAddress)

public actual fun rpcMgmtEpEltInqNextA(inquirycontext: ConstPtr<ConstPtr<CVoid>>, ifid: MutPtr<RpcIfId>, binding: MutPtr<MutPtr<CVoid>>, objectuuid: MutPtr<Guid>, annotation: MutPtr<Pstr>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcMgmtEpEltInqNextA(inquirycontext.rawAddress, ifid.rawAddress, binding.rawAddress, objectuuid.rawAddress, annotation.rawAddress)

public actual fun rpcMgmtEpEltInqNextW(inquirycontext: ConstPtr<ConstPtr<CVoid>>, ifid: MutPtr<RpcIfId>, binding: MutPtr<MutPtr<CVoid>>, objectuuid: MutPtr<Guid>, annotation: MutPtr<Pwstr>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcMgmtEpEltInqNextW(inquirycontext.rawAddress, ifid.rawAddress, binding.rawAddress, objectuuid.rawAddress, annotation.rawAddress)

public actual fun rpcMgmtEpUnregister(epbinding: ConstPtr<CVoid>, ifid: ConstPtr<RpcIfId>, binding: ConstPtr<CVoid>, objectuuid: ConstPtr<Guid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcMgmtEpUnregister(epbinding.rawAddress, ifid.rawAddress, binding.rawAddress, objectuuid.rawAddress)

public actual fun rpcMgmtInqComTimeout(binding: ConstPtr<CVoid>, timeout: MutPtr<UInt>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcMgmtInqComTimeout(binding.rawAddress, timeout.rawAddress)

public actual fun rpcMgmtInqDefaultProtectLevel(authnsvc: UInt, authnlevel: MutPtr<UInt>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcMgmtInqDefaultProtectLevel(authnsvc.toInt(), authnlevel.rawAddress)

public actual fun rpcMgmtInqIfIds(binding: ConstPtr<CVoid>, ifidvector: MutPtr<MutPtr<RpcIfIdVector>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcMgmtInqIfIds(binding.rawAddress, ifidvector.rawAddress)

public actual fun rpcMgmtInqServerPrincNameA(binding: ConstPtr<CVoid>, authnsvc: UInt, serverprincname: MutPtr<Pstr>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcMgmtInqServerPrincNameA(binding.rawAddress, authnsvc.toInt(), serverprincname.rawAddress)

public actual fun rpcMgmtInqServerPrincNameW(binding: ConstPtr<CVoid>, authnsvc: UInt, serverprincname: MutPtr<Pwstr>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcMgmtInqServerPrincNameW(binding.rawAddress, authnsvc.toInt(), serverprincname.rawAddress)

public actual fun rpcMgmtInqStats(binding: ConstPtr<CVoid>, statistics: MutPtr<MutPtr<RpcStatsVector>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcMgmtInqStats(binding.rawAddress, statistics.rawAddress)

public actual fun rpcMgmtIsServerListening(binding: ConstPtr<CVoid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcMgmtIsServerListening(binding.rawAddress)

public actual fun rpcMgmtSetAuthorizationFn(authorizationfn: RpcMgmtAuthorizationFn): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcMgmtSetAuthorizationFn(0L)

public actual fun rpcMgmtSetCancelTimeout(timeout: Int): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcMgmtSetCancelTimeout(timeout)

public actual fun rpcMgmtSetComTimeout(binding: ConstPtr<CVoid>, timeout: UInt): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcMgmtSetComTimeout(binding.rawAddress, timeout.toInt())

public actual fun rpcMgmtSetServerStackSize(threadstacksize: UInt): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcMgmtSetServerStackSize(threadstacksize.toInt())

public actual fun rpcMgmtStatsVectorFree(statsvector: MutPtr<MutPtr<RpcStatsVector>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcMgmtStatsVectorFree(statsvector.rawAddress)

public actual fun rpcMgmtStopServerListening(binding: ConstPtr<CVoid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcMgmtStopServerListening(binding.rawAddress)

public actual fun rpcMgmtWaitServerListen(): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcMgmtWaitServerListen()

public actual fun rpcNetworkInqProtseqsA(protseqvector: MutPtr<MutPtr<RpcProtseqVectora>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNetworkInqProtseqsA(protseqvector.rawAddress)

public actual fun rpcNetworkInqProtseqsW(protseqvector: MutPtr<MutPtr<RpcProtseqVectorw>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNetworkInqProtseqsW(protseqvector.rawAddress)

public actual fun rpcNetworkIsProtseqValidA(protseq: Pcstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNetworkIsProtseqValidA(protseq.rawAddress)

public actual fun rpcNetworkIsProtseqValidW(protseq: Pcwstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNetworkIsProtseqValidW(protseq.rawAddress)

public actual fun rpcNsBindingExportA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: ConstPtr<CVoid>, bindingvec: ConstPtr<RpcBindingVector>, objectuuidvec: ConstPtr<UuidVector>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsBindingExportA(entrynamesyntax.toInt(), entryname.rawAddress, ifspec.rawAddress, bindingvec.rawAddress, objectuuidvec.rawAddress)

public actual fun rpcNsBindingExportPnPA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: ConstPtr<CVoid>, objectvector: ConstPtr<UuidVector>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsBindingExportPnPA(entrynamesyntax.toInt(), entryname.rawAddress, ifspec.rawAddress, objectvector.rawAddress)

public actual fun rpcNsBindingExportPnPW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: ConstPtr<CVoid>, objectvector: ConstPtr<UuidVector>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsBindingExportPnPW(entrynamesyntax.toInt(), entryname.rawAddress, ifspec.rawAddress, objectvector.rawAddress)

public actual fun rpcNsBindingExportW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: ConstPtr<CVoid>, bindingvec: ConstPtr<RpcBindingVector>, objectuuidvec: ConstPtr<UuidVector>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsBindingExportW(entrynamesyntax.toInt(), entryname.rawAddress, ifspec.rawAddress, bindingvec.rawAddress, objectuuidvec.rawAddress)

public actual fun rpcNsBindingImportBeginA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: ConstPtr<CVoid>, objuuid: ConstPtr<Guid>, importcontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsBindingImportBeginA(entrynamesyntax.toInt(), entryname.rawAddress, ifspec.rawAddress, objuuid.rawAddress, importcontext.rawAddress)

public actual fun rpcNsBindingImportBeginW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: ConstPtr<CVoid>, objuuid: ConstPtr<Guid>, importcontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsBindingImportBeginW(entrynamesyntax.toInt(), entryname.rawAddress, ifspec.rawAddress, objuuid.rawAddress, importcontext.rawAddress)

public actual fun rpcNsBindingImportDone(importcontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsBindingImportDone(importcontext.rawAddress)

public actual fun rpcNsBindingImportNext(importcontext: MutPtr<CVoid>, binding: MutPtr<MutPtr<CVoid>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsBindingImportNext(importcontext.rawAddress, binding.rawAddress)

public actual fun rpcNsBindingInqEntryNameA(binding: ConstPtr<CVoid>, entrynamesyntax: UInt, entryname: MutPtr<Pstr>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsBindingInqEntryNameA(binding.rawAddress, entrynamesyntax.toInt(), entryname.rawAddress)

public actual fun rpcNsBindingInqEntryNameW(binding: ConstPtr<CVoid>, entrynamesyntax: UInt, entryname: MutPtr<Pwstr>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsBindingInqEntryNameW(binding.rawAddress, entrynamesyntax.toInt(), entryname.rawAddress)

public actual fun rpcNsBindingLookupBeginA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: ConstPtr<CVoid>, objuuid: ConstPtr<Guid>, bindingmaxcount: UInt, lookupcontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsBindingLookupBeginA(entrynamesyntax.toInt(), entryname.rawAddress, ifspec.rawAddress, objuuid.rawAddress, bindingmaxcount.toInt(), lookupcontext.rawAddress)

public actual fun rpcNsBindingLookupBeginW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: ConstPtr<CVoid>, objuuid: ConstPtr<Guid>, bindingmaxcount: UInt, lookupcontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsBindingLookupBeginW(entrynamesyntax.toInt(), entryname.rawAddress, ifspec.rawAddress, objuuid.rawAddress, bindingmaxcount.toInt(), lookupcontext.rawAddress)

public actual fun rpcNsBindingLookupDone(lookupcontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsBindingLookupDone(lookupcontext.rawAddress)

public actual fun rpcNsBindingLookupNext(lookupcontext: MutPtr<CVoid>, bindingvec: MutPtr<MutPtr<RpcBindingVector>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsBindingLookupNext(lookupcontext.rawAddress, bindingvec.rawAddress)

public actual fun rpcNsBindingSelect(bindingvec: MutPtr<RpcBindingVector>, binding: MutPtr<MutPtr<CVoid>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsBindingSelect(bindingvec.rawAddress, binding.rawAddress)

public actual fun rpcNsBindingUnexportA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: ConstPtr<CVoid>, objectuuidvec: ConstPtr<UuidVector>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsBindingUnexportA(entrynamesyntax.toInt(), entryname.rawAddress, ifspec.rawAddress, objectuuidvec.rawAddress)

public actual fun rpcNsBindingUnexportPnPA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: ConstPtr<CVoid>, objectvector: ConstPtr<UuidVector>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsBindingUnexportPnPA(entrynamesyntax.toInt(), entryname.rawAddress, ifspec.rawAddress, objectvector.rawAddress)

public actual fun rpcNsBindingUnexportPnPW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: ConstPtr<CVoid>, objectvector: ConstPtr<UuidVector>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsBindingUnexportPnPW(entrynamesyntax.toInt(), entryname.rawAddress, ifspec.rawAddress, objectvector.rawAddress)

public actual fun rpcNsBindingUnexportW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: ConstPtr<CVoid>, objectuuidvec: ConstPtr<UuidVector>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsBindingUnexportW(entrynamesyntax.toInt(), entryname.rawAddress, ifspec.rawAddress, objectuuidvec.rawAddress)

public actual fun rpcNsEntryExpandNameA(entrynamesyntax: UInt, entryname: Pcstr, expandedname: MutPtr<Pstr>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsEntryExpandNameA(entrynamesyntax.toInt(), entryname.rawAddress, expandedname.rawAddress)

public actual fun rpcNsEntryExpandNameW(entrynamesyntax: UInt, entryname: Pcwstr, expandedname: MutPtr<Pwstr>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsEntryExpandNameW(entrynamesyntax.toInt(), entryname.rawAddress, expandedname.rawAddress)

public actual fun rpcNsEntryObjectInqBeginA(entrynamesyntax: UInt, entryname: Pcstr, inquirycontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsEntryObjectInqBeginA(entrynamesyntax.toInt(), entryname.rawAddress, inquirycontext.rawAddress)

public actual fun rpcNsEntryObjectInqBeginW(entrynamesyntax: UInt, entryname: Pcwstr, inquirycontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsEntryObjectInqBeginW(entrynamesyntax.toInt(), entryname.rawAddress, inquirycontext.rawAddress)

public actual fun rpcNsEntryObjectInqDone(inquirycontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsEntryObjectInqDone(inquirycontext.rawAddress)

public actual fun rpcNsEntryObjectInqNext(inquirycontext: MutPtr<CVoid>, objuuid: MutPtr<Guid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsEntryObjectInqNext(inquirycontext.rawAddress, objuuid.rawAddress)

public actual fun rpcNsGroupDeleteA(groupnamesyntax: GroupNameSyntax, groupname: Pcstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsGroupDeleteA(groupnamesyntax.toInt(), groupname.rawAddress)

public actual fun rpcNsGroupDeleteW(groupnamesyntax: GroupNameSyntax, groupname: Pcwstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsGroupDeleteW(groupnamesyntax.toInt(), groupname.rawAddress)

public actual fun rpcNsGroupMbrAddA(groupnamesyntax: UInt, groupname: Pcstr, membernamesyntax: UInt, membername: Pcstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsGroupMbrAddA(groupnamesyntax.toInt(), groupname.rawAddress, membernamesyntax.toInt(), membername.rawAddress)

public actual fun rpcNsGroupMbrAddW(groupnamesyntax: UInt, groupname: Pcwstr, membernamesyntax: UInt, membername: Pcwstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsGroupMbrAddW(groupnamesyntax.toInt(), groupname.rawAddress, membernamesyntax.toInt(), membername.rawAddress)

public actual fun rpcNsGroupMbrInqBeginA(groupnamesyntax: UInt, groupname: Pcstr, membernamesyntax: UInt, inquirycontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsGroupMbrInqBeginA(groupnamesyntax.toInt(), groupname.rawAddress, membernamesyntax.toInt(), inquirycontext.rawAddress)

public actual fun rpcNsGroupMbrInqBeginW(groupnamesyntax: UInt, groupname: Pcwstr, membernamesyntax: UInt, inquirycontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsGroupMbrInqBeginW(groupnamesyntax.toInt(), groupname.rawAddress, membernamesyntax.toInt(), inquirycontext.rawAddress)

public actual fun rpcNsGroupMbrInqDone(inquirycontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsGroupMbrInqDone(inquirycontext.rawAddress)

public actual fun rpcNsGroupMbrInqNextA(inquirycontext: MutPtr<CVoid>, membername: MutPtr<Pstr>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsGroupMbrInqNextA(inquirycontext.rawAddress, membername.rawAddress)

public actual fun rpcNsGroupMbrInqNextW(inquirycontext: MutPtr<CVoid>, membername: MutPtr<Pwstr>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsGroupMbrInqNextW(inquirycontext.rawAddress, membername.rawAddress)

public actual fun rpcNsGroupMbrRemoveA(groupnamesyntax: UInt, groupname: Pcstr, membernamesyntax: UInt, membername: Pcstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsGroupMbrRemoveA(groupnamesyntax.toInt(), groupname.rawAddress, membernamesyntax.toInt(), membername.rawAddress)

public actual fun rpcNsGroupMbrRemoveW(groupnamesyntax: UInt, groupname: Pcwstr, membernamesyntax: UInt, membername: Pcwstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsGroupMbrRemoveW(groupnamesyntax.toInt(), groupname.rawAddress, membernamesyntax.toInt(), membername.rawAddress)

public actual fun rpcNsMgmtBindingUnexportA(entrynamesyntax: UInt, entryname: Pcstr, ifid: ConstPtr<RpcIfId>, versoption: UInt, objectuuidvec: ConstPtr<UuidVector>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsMgmtBindingUnexportA(entrynamesyntax.toInt(), entryname.rawAddress, ifid.rawAddress, versoption.toInt(), objectuuidvec.rawAddress)

public actual fun rpcNsMgmtBindingUnexportW(entrynamesyntax: UInt, entryname: Pcwstr, ifid: ConstPtr<RpcIfId>, versoption: UInt, objectuuidvec: ConstPtr<UuidVector>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsMgmtBindingUnexportW(entrynamesyntax.toInt(), entryname.rawAddress, ifid.rawAddress, versoption.toInt(), objectuuidvec.rawAddress)

public actual fun rpcNsMgmtEntryCreateA(entrynamesyntax: UInt, entryname: Pcstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsMgmtEntryCreateA(entrynamesyntax.toInt(), entryname.rawAddress)

public actual fun rpcNsMgmtEntryCreateW(entrynamesyntax: UInt, entryname: Pcwstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsMgmtEntryCreateW(entrynamesyntax.toInt(), entryname.rawAddress)

public actual fun rpcNsMgmtEntryDeleteA(entrynamesyntax: UInt, entryname: Pcstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsMgmtEntryDeleteA(entrynamesyntax.toInt(), entryname.rawAddress)

public actual fun rpcNsMgmtEntryDeleteW(entrynamesyntax: UInt, entryname: Pcwstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsMgmtEntryDeleteW(entrynamesyntax.toInt(), entryname.rawAddress)

public actual fun rpcNsMgmtEntryInqIfIdsA(entrynamesyntax: UInt, entryname: Pcstr, ifidvec: MutPtr<MutPtr<RpcIfIdVector>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsMgmtEntryInqIfIdsA(entrynamesyntax.toInt(), entryname.rawAddress, ifidvec.rawAddress)

public actual fun rpcNsMgmtEntryInqIfIdsW(entrynamesyntax: UInt, entryname: Pcwstr, ifidvec: MutPtr<MutPtr<RpcIfIdVector>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsMgmtEntryInqIfIdsW(entrynamesyntax.toInt(), entryname.rawAddress, ifidvec.rawAddress)

public actual fun rpcNsMgmtHandleSetExpAge(nshandle: MutPtr<CVoid>, expirationage: UInt): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsMgmtHandleSetExpAge(nshandle.rawAddress, expirationage.toInt())

public actual fun rpcNsMgmtInqExpAge(expirationage: MutPtr<UInt>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsMgmtInqExpAge(expirationage.rawAddress)

public actual fun rpcNsMgmtSetExpAge(expirationage: UInt): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsMgmtSetExpAge(expirationage.toInt())

public actual fun rpcNsProfileDeleteA(profilenamesyntax: UInt, profilename: Pcstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsProfileDeleteA(profilenamesyntax.toInt(), profilename.rawAddress)

public actual fun rpcNsProfileDeleteW(profilenamesyntax: UInt, profilename: Pcwstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsProfileDeleteW(profilenamesyntax.toInt(), profilename.rawAddress)

public actual fun rpcNsProfileEltAddA(profilenamesyntax: UInt, profilename: Pcstr, ifid: ConstPtr<RpcIfId>, membernamesyntax: UInt, membername: Pcstr, priority: UInt, annotation: Pcstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsProfileEltAddA(profilenamesyntax.toInt(), profilename.rawAddress, ifid.rawAddress, membernamesyntax.toInt(), membername.rawAddress, priority.toInt(), annotation.rawAddress)

public actual fun rpcNsProfileEltAddW(profilenamesyntax: UInt, profilename: Pcwstr, ifid: ConstPtr<RpcIfId>, membernamesyntax: UInt, membername: Pcwstr, priority: UInt, annotation: Pcwstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsProfileEltAddW(profilenamesyntax.toInt(), profilename.rawAddress, ifid.rawAddress, membernamesyntax.toInt(), membername.rawAddress, priority.toInt(), annotation.rawAddress)

public actual fun rpcNsProfileEltInqBeginA(profilenamesyntax: UInt, profilename: Pcstr, inquirytype: UInt, ifid: ConstPtr<RpcIfId>, versoption: UInt, membernamesyntax: UInt, membername: Pcstr, inquirycontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsProfileEltInqBeginA(profilenamesyntax.toInt(), profilename.rawAddress, inquirytype.toInt(), ifid.rawAddress, versoption.toInt(), membernamesyntax.toInt(), membername.rawAddress, inquirycontext.rawAddress)

public actual fun rpcNsProfileEltInqBeginW(profilenamesyntax: UInt, profilename: Pcwstr, inquirytype: UInt, ifid: ConstPtr<RpcIfId>, versoption: UInt, membernamesyntax: UInt, membername: Pcwstr, inquirycontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsProfileEltInqBeginW(profilenamesyntax.toInt(), profilename.rawAddress, inquirytype.toInt(), ifid.rawAddress, versoption.toInt(), membernamesyntax.toInt(), membername.rawAddress, inquirycontext.rawAddress)

public actual fun rpcNsProfileEltInqDone(inquirycontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsProfileEltInqDone(inquirycontext.rawAddress)

public actual fun rpcNsProfileEltInqNextA(inquirycontext: ConstPtr<CVoid>, ifid: MutPtr<RpcIfId>, membername: MutPtr<Pstr>, priority: MutPtr<UInt>, annotation: MutPtr<Pstr>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsProfileEltInqNextA(inquirycontext.rawAddress, ifid.rawAddress, membername.rawAddress, priority.rawAddress, annotation.rawAddress)

public actual fun rpcNsProfileEltInqNextW(inquirycontext: ConstPtr<CVoid>, ifid: MutPtr<RpcIfId>, membername: MutPtr<Pwstr>, priority: MutPtr<UInt>, annotation: MutPtr<Pwstr>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsProfileEltInqNextW(inquirycontext.rawAddress, ifid.rawAddress, membername.rawAddress, priority.rawAddress, annotation.rawAddress)

public actual fun rpcNsProfileEltRemoveA(profilenamesyntax: UInt, profilename: Pcstr, ifid: ConstPtr<RpcIfId>, membernamesyntax: UInt, membername: Pcstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsProfileEltRemoveA(profilenamesyntax.toInt(), profilename.rawAddress, ifid.rawAddress, membernamesyntax.toInt(), membername.rawAddress)

public actual fun rpcNsProfileEltRemoveW(profilenamesyntax: UInt, profilename: Pcwstr, ifid: ConstPtr<RpcIfId>, membernamesyntax: UInt, membername: Pcwstr): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcNsProfileEltRemoveW(profilenamesyntax.toInt(), profilename.rawAddress, ifid.rawAddress, membernamesyntax.toInt(), membername.rawAddress)

public actual fun rpcObjectInqType(objuuid: ConstPtr<Guid>, typeuuid: MutPtr<Guid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcObjectInqType(objuuid.rawAddress, typeuuid.rawAddress)

public actual fun rpcObjectSetInqFn(inquiryfn: RpcObjectInqFn): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcObjectSetInqFn(0L)

public actual fun rpcObjectSetType(objuuid: ConstPtr<Guid>, typeuuid: ConstPtr<Guid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcObjectSetType(objuuid.rawAddress, typeuuid.rawAddress)

public actual fun rpcProtseqVectorFreeA(protseqvector: MutPtr<MutPtr<RpcProtseqVectora>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcProtseqVectorFreeA(protseqvector.rawAddress)

public actual fun rpcProtseqVectorFreeW(protseqvector: MutPtr<MutPtr<RpcProtseqVectorw>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcProtseqVectorFreeW(protseqvector.rawAddress)

public actual fun rpcRaiseException(exception: RpcStatus) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcRaiseException(exception)
}

public actual fun rpcRevertContainerImpersonation(): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcRevertContainerImpersonation()

public actual fun rpcRevertToSelf(): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcRevertToSelf()

public actual fun rpcRevertToSelfEx(bindinghandle: ConstPtr<CVoid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcRevertToSelfEx(bindinghandle.rawAddress)

public actual fun rpcServerCompleteSecurityCallback(bindinghandle: ConstPtr<CVoid>, status: RpcStatus): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcServerCompleteSecurityCallback(bindinghandle.rawAddress, status)

public actual fun rpcServerInqBindingHandle(binding: MutPtr<MutPtr<CVoid>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcServerInqBindingHandle(binding.rawAddress)

public actual fun rpcServerInqBindings(bindingvector: MutPtr<MutPtr<RpcBindingVector>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcServerInqBindings(bindingvector.rawAddress)

public actual fun rpcServerInqBindingsEx(securitydescriptor: ConstPtr<CVoid>, bindingvector: MutPtr<MutPtr<RpcBindingVector>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcServerInqBindingsEx(securitydescriptor.rawAddress, bindingvector.rawAddress)

public actual fun rpcServerInqCallAttributesA(clientbinding: ConstPtr<CVoid>, rpccallattributes: MutPtr<CVoid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcServerInqCallAttributesA(clientbinding.rawAddress, rpccallattributes.rawAddress)

public actual fun rpcServerInqCallAttributesW(clientbinding: ConstPtr<CVoid>, rpccallattributes: MutPtr<CVoid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcServerInqCallAttributesW(clientbinding.rawAddress, rpccallattributes.rawAddress)

public actual fun rpcServerInqDefaultPrincNameA(authnsvc: UInt, princname: MutPtr<Pstr>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcServerInqDefaultPrincNameA(authnsvc.toInt(), princname.rawAddress)

public actual fun rpcServerInqDefaultPrincNameW(authnsvc: UInt, princname: MutPtr<Pwstr>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcServerInqDefaultPrincNameW(authnsvc.toInt(), princname.rawAddress)

public actual fun rpcServerInqIf(ifspec: ConstPtr<CVoid>, mgrtypeuuid: ConstPtr<Guid>, mgrepv: MutPtr<MutPtr<CVoid>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcServerInqIf(ifspec.rawAddress, mgrtypeuuid.rawAddress, mgrepv.rawAddress)

public actual fun rpcServerInterfaceGroupActivate(ifgroup: ConstPtr<CVoid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcServerInterfaceGroupActivate(ifgroup.rawAddress)

public actual fun rpcServerInterfaceGroupClose(ifgroup: ConstPtr<CVoid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcServerInterfaceGroupClose(ifgroup.rawAddress)

public actual fun rpcServerInterfaceGroupCreateA(interfaces: ConstPtr<RpcInterfaceTemplatea>, numifs: UInt, endpoints: ConstPtr<RpcEndpointTemplatea>, numendpoints: UInt, idleperiod: UInt, idlecallbackfn: RpcInterfaceGroupIdleCallbackFn, idlecallbackcontext: ConstPtr<CVoid>, ifgroup: MutPtr<MutPtr<CVoid>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcServerInterfaceGroupCreateA(interfaces.rawAddress, numifs.toInt(), endpoints.rawAddress, numendpoints.toInt(), idleperiod.toInt(), 0L, idlecallbackcontext.rawAddress, ifgroup.rawAddress)

public actual fun rpcServerInterfaceGroupCreateW(interfaces: ConstPtr<RpcInterfaceTemplatew>, numifs: UInt, endpoints: ConstPtr<RpcEndpointTemplatew>, numendpoints: UInt, idleperiod: UInt, idlecallbackfn: RpcInterfaceGroupIdleCallbackFn, idlecallbackcontext: ConstPtr<CVoid>, ifgroup: MutPtr<MutPtr<CVoid>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcServerInterfaceGroupCreateW(interfaces.rawAddress, numifs.toInt(), endpoints.rawAddress, numendpoints.toInt(), idleperiod.toInt(), 0L, idlecallbackcontext.rawAddress, ifgroup.rawAddress)

public actual fun rpcServerInterfaceGroupDeactivate(ifgroup: ConstPtr<CVoid>, forcedeactivation: UInt): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcServerInterfaceGroupDeactivate(ifgroup.rawAddress, forcedeactivation.toInt())

public actual fun rpcServerInterfaceGroupInqBindings(ifgroup: ConstPtr<CVoid>, bindingvector: MutPtr<MutPtr<RpcBindingVector>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcServerInterfaceGroupInqBindings(ifgroup.rawAddress, bindingvector.rawAddress)

public actual fun rpcServerListen(minimumcallthreads: UInt, maxcalls: UInt, dontwait: UInt): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcServerListen(minimumcallthreads.toInt(), maxcalls.toInt(), dontwait.toInt())

public actual fun rpcServerRegisterAuthInfoA(serverprincname: Pcstr, authnsvc: UInt, getkeyfn: RpcAuthKeyRetrievalFn, arg: ConstPtr<CVoid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcServerRegisterAuthInfoA(serverprincname.rawAddress, authnsvc.toInt(), 0L, arg.rawAddress)

public actual fun rpcServerRegisterAuthInfoW(serverprincname: Pcwstr, authnsvc: UInt, getkeyfn: RpcAuthKeyRetrievalFn, arg: ConstPtr<CVoid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcServerRegisterAuthInfoW(serverprincname.rawAddress, authnsvc.toInt(), 0L, arg.rawAddress)

public actual fun rpcServerRegisterIf(ifspec: ConstPtr<CVoid>, mgrtypeuuid: ConstPtr<Guid>, mgrepv: ConstPtr<CVoid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcServerRegisterIf(ifspec.rawAddress, mgrtypeuuid.rawAddress, mgrepv.rawAddress)

public actual fun rpcServerRegisterIf2(ifspec: ConstPtr<CVoid>, mgrtypeuuid: ConstPtr<Guid>, mgrepv: ConstPtr<CVoid>, flags: UInt, maxcalls: UInt, maxrpcsize: UInt, ifcallbackfn: RpcIfCallbackFn): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcServerRegisterIf2(ifspec.rawAddress, mgrtypeuuid.rawAddress, mgrepv.rawAddress, flags.toInt(), maxcalls.toInt(), maxrpcsize.toInt(), 0L)

public actual fun rpcServerRegisterIf3(ifspec: ConstPtr<CVoid>, mgrtypeuuid: ConstPtr<Guid>, mgrepv: ConstPtr<CVoid>, flags: UInt, maxcalls: UInt, maxrpcsize: UInt, ifcallback: RpcIfCallbackFn, securitydescriptor: ConstPtr<CVoid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcServerRegisterIf3(ifspec.rawAddress, mgrtypeuuid.rawAddress, mgrepv.rawAddress, flags.toInt(), maxcalls.toInt(), maxrpcsize.toInt(), 0L, securitydescriptor.rawAddress)

public actual fun rpcServerRegisterIfEx(ifspec: ConstPtr<CVoid>, mgrtypeuuid: ConstPtr<Guid>, mgrepv: ConstPtr<CVoid>, flags: UInt, maxcalls: UInt, ifcallback: RpcIfCallbackFn): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcServerRegisterIfEx(ifspec.rawAddress, mgrtypeuuid.rawAddress, mgrepv.rawAddress, flags.toInt(), maxcalls.toInt(), 0L)

public actual fun rpcServerSubscribeForNotification(binding: ConstPtr<CVoid>, notification: RpcNotifications, notificationtype: RpcNotificationTypes, notificationinfo: ConstPtr<RpcAsyncNotificationInfo>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcServerSubscribeForNotification(binding.rawAddress, notification, notificationtype, notificationinfo.rawAddress)

public actual fun rpcServerTestCancel(bindinghandle: ConstPtr<CVoid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcServerTestCancel(bindinghandle.rawAddress)

public actual fun rpcServerUnregisterIf(ifspec: ConstPtr<CVoid>, mgrtypeuuid: ConstPtr<Guid>, waitforcallstocomplete: UInt): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcServerUnregisterIf(ifspec.rawAddress, mgrtypeuuid.rawAddress, waitforcallstocomplete.toInt())

public actual fun rpcServerUnregisterIfEx(ifspec: ConstPtr<CVoid>, mgrtypeuuid: ConstPtr<Guid>, rundowncontexthandles: Int): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcServerUnregisterIfEx(ifspec.rawAddress, mgrtypeuuid.rawAddress, rundowncontexthandles)

public actual fun rpcServerUnsubscribeForNotification(binding: ConstPtr<CVoid>, notification: RpcNotifications, notificationsqueued: MutPtr<UInt>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcServerUnsubscribeForNotification(binding.rawAddress, notification, notificationsqueued.rawAddress)

public actual fun rpcServerUseAllProtseqs(maxcalls: UInt, securitydescriptor: ConstPtr<CVoid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcServerUseAllProtseqs(maxcalls.toInt(), securitydescriptor.rawAddress)

public actual fun rpcServerUseAllProtseqsEx(maxcalls: UInt, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<RpcPolicy>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcServerUseAllProtseqsEx(maxcalls.toInt(), securitydescriptor.rawAddress, policy.rawAddress)

public actual fun rpcServerUseAllProtseqsIf(maxcalls: UInt, ifspec: ConstPtr<CVoid>, securitydescriptor: ConstPtr<CVoid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcServerUseAllProtseqsIf(maxcalls.toInt(), ifspec.rawAddress, securitydescriptor.rawAddress)

public actual fun rpcServerUseAllProtseqsIfEx(maxcalls: UInt, ifspec: ConstPtr<CVoid>, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<RpcPolicy>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcServerUseAllProtseqsIfEx(maxcalls.toInt(), ifspec.rawAddress, securitydescriptor.rawAddress, policy.rawAddress)

public actual fun rpcServerUseProtseqA(protseq: Pcstr, maxcalls: UInt, securitydescriptor: ConstPtr<CVoid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcServerUseProtseqA(protseq.rawAddress, maxcalls.toInt(), securitydescriptor.rawAddress)

public actual fun rpcServerUseProtseqEpA(protseq: Pcstr, maxcalls: UInt, endpoint: Pcstr, securitydescriptor: ConstPtr<CVoid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcServerUseProtseqEpA(protseq.rawAddress, maxcalls.toInt(), endpoint.rawAddress, securitydescriptor.rawAddress)

public actual fun rpcServerUseProtseqEpExA(protseq: Pcstr, maxcalls: UInt, endpoint: Pcstr, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<RpcPolicy>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcServerUseProtseqEpExA(protseq.rawAddress, maxcalls.toInt(), endpoint.rawAddress, securitydescriptor.rawAddress, policy.rawAddress)

public actual fun rpcServerUseProtseqEpExW(protseq: Pcwstr, maxcalls: UInt, endpoint: Pcwstr, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<RpcPolicy>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcServerUseProtseqEpExW(protseq.rawAddress, maxcalls.toInt(), endpoint.rawAddress, securitydescriptor.rawAddress, policy.rawAddress)

public actual fun rpcServerUseProtseqEpW(protseq: Pcwstr, maxcalls: UInt, endpoint: Pcwstr, securitydescriptor: ConstPtr<CVoid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcServerUseProtseqEpW(protseq.rawAddress, maxcalls.toInt(), endpoint.rawAddress, securitydescriptor.rawAddress)

public actual fun rpcServerUseProtseqExA(protseq: Pcstr, maxcalls: UInt, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<RpcPolicy>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcServerUseProtseqExA(protseq.rawAddress, maxcalls.toInt(), securitydescriptor.rawAddress, policy.rawAddress)

public actual fun rpcServerUseProtseqExW(protseq: Pcwstr, maxcalls: UInt, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<RpcPolicy>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcServerUseProtseqExW(protseq.rawAddress, maxcalls.toInt(), securitydescriptor.rawAddress, policy.rawAddress)

public actual fun rpcServerUseProtseqIfA(protseq: Pcstr, maxcalls: UInt, ifspec: ConstPtr<CVoid>, securitydescriptor: ConstPtr<CVoid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcServerUseProtseqIfA(protseq.rawAddress, maxcalls.toInt(), ifspec.rawAddress, securitydescriptor.rawAddress)

public actual fun rpcServerUseProtseqIfExA(protseq: Pcstr, maxcalls: UInt, ifspec: ConstPtr<CVoid>, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<RpcPolicy>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcServerUseProtseqIfExA(protseq.rawAddress, maxcalls.toInt(), ifspec.rawAddress, securitydescriptor.rawAddress, policy.rawAddress)

public actual fun rpcServerUseProtseqIfExW(protseq: Pcwstr, maxcalls: UInt, ifspec: ConstPtr<CVoid>, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<RpcPolicy>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcServerUseProtseqIfExW(protseq.rawAddress, maxcalls.toInt(), ifspec.rawAddress, securitydescriptor.rawAddress, policy.rawAddress)

public actual fun rpcServerUseProtseqIfW(protseq: Pcwstr, maxcalls: UInt, ifspec: ConstPtr<CVoid>, securitydescriptor: ConstPtr<CVoid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcServerUseProtseqIfW(protseq.rawAddress, maxcalls.toInt(), ifspec.rawAddress, securitydescriptor.rawAddress)

public actual fun rpcServerUseProtseqW(protseq: Pcwstr, maxcalls: UInt, securitydescriptor: ConstPtr<CVoid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcServerUseProtseqW(protseq.rawAddress, maxcalls.toInt(), securitydescriptor.rawAddress)

public actual fun rpcServerYield() {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcServerYield()
}

public actual fun rpcSmAllocate(size: ULong, pstatus: MutPtr<RpcStatus>): MutPtr<CVoid> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcSmAllocate(size.toLong(), pstatus.rawAddress))

public actual fun rpcSmClientFree(pnodetofree: ConstPtr<CVoid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcSmClientFree(pnodetofree.rawAddress)

public actual fun rpcSmDestroyClientContext(contexthandle: ConstPtr<ConstPtr<CVoid>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcSmDestroyClientContext(contexthandle.rawAddress)

public actual fun rpcSmDisableAllocate(): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcSmDisableAllocate()

public actual fun rpcSmEnableAllocate(): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcSmEnableAllocate()

public actual fun rpcSmFree(nodetofree: ConstPtr<CVoid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcSmFree(nodetofree.rawAddress)

public actual fun rpcSmGetThreadHandle(pstatus: MutPtr<RpcStatus>): MutPtr<CVoid> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcSmGetThreadHandle(pstatus.rawAddress))

public actual fun rpcSmSetClientAllocFree(clientalloc: RpcClientAlloc, clientfree: RpcClientFree): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcSmSetClientAllocFree(0L, 0L)

public actual fun rpcSmSetThreadHandle(id: ConstPtr<CVoid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcSmSetThreadHandle(id.rawAddress)

public actual fun rpcSmSwapClientAllocFree(clientalloc: RpcClientAlloc, clientfree: RpcClientFree, oldclientalloc: MutPtr<RpcClientAlloc>, oldclientfree: MutPtr<RpcClientFree>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcSmSwapClientAllocFree(0L, 0L, oldclientalloc.rawAddress, oldclientfree.rawAddress)

public actual fun rpcSsAllocate(size: ULong): MutPtr<CVoid> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcSsAllocate(size.toLong()))

public actual fun rpcSsContextLockExclusive(serverbindinghandle: ConstPtr<CVoid>, usercontext: ConstPtr<CVoid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcSsContextLockExclusive(serverbindinghandle.rawAddress, usercontext.rawAddress)

public actual fun rpcSsContextLockShared(serverbindinghandle: ConstPtr<CVoid>, usercontext: ConstPtr<CVoid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcSsContextLockShared(serverbindinghandle.rawAddress, usercontext.rawAddress)

public actual fun rpcSsDestroyClientContext(contexthandle: ConstPtr<ConstPtr<CVoid>>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcSsDestroyClientContext(contexthandle.rawAddress)
}

public actual fun rpcSsDisableAllocate() {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcSsDisableAllocate()
}

public actual fun rpcSsDontSerializeContext() {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcSsDontSerializeContext()
}

public actual fun rpcSsEnableAllocate() {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcSsEnableAllocate()
}

public actual fun rpcSsFree(nodetofree: ConstPtr<CVoid>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcSsFree(nodetofree.rawAddress)
}

public actual fun rpcSsGetContextBinding(contexthandle: ConstPtr<CVoid>, binding: MutPtr<MutPtr<CVoid>>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcSsGetContextBinding(contexthandle.rawAddress, binding.rawAddress)

public actual fun rpcSsGetThreadHandle(): MutPtr<CVoid> =
    MutPtr(WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcSsGetThreadHandle())

public actual fun rpcSsSetClientAllocFree(clientalloc: RpcClientAlloc, clientfree: RpcClientFree) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcSsSetClientAllocFree(0L, 0L)
}

public actual fun rpcSsSetThreadHandle(id: ConstPtr<CVoid>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcSsSetThreadHandle(id.rawAddress)
}

public actual fun rpcSsSwapClientAllocFree(clientalloc: RpcClientAlloc, clientfree: RpcClientFree, oldclientalloc: MutPtr<RpcClientAlloc>, oldclientfree: MutPtr<RpcClientFree>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcSsSwapClientAllocFree(0L, 0L, oldclientalloc.rawAddress, oldclientfree.rawAddress)
}

public actual fun rpcStringBindingComposeA(objuuid: Pcstr, protseq: Pcstr, networkaddr: Pcstr, endpoint: Pcstr, options: Pcstr, stringbinding: MutPtr<Pstr>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcStringBindingComposeA(objuuid.rawAddress, protseq.rawAddress, networkaddr.rawAddress, endpoint.rawAddress, options.rawAddress, stringbinding.rawAddress)

public actual fun rpcStringBindingComposeW(objuuid: Pcwstr, protseq: Pcwstr, networkaddr: Pcwstr, endpoint: Pcwstr, options: Pcwstr, stringbinding: MutPtr<Pwstr>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcStringBindingComposeW(objuuid.rawAddress, protseq.rawAddress, networkaddr.rawAddress, endpoint.rawAddress, options.rawAddress, stringbinding.rawAddress)

public actual fun rpcStringBindingParseA(stringbinding: Pcstr, objuuid: MutPtr<Pstr>, protseq: MutPtr<Pstr>, networkaddr: MutPtr<Pstr>, endpoint: MutPtr<Pstr>, networkoptions: MutPtr<Pstr>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcStringBindingParseA(stringbinding.rawAddress, objuuid.rawAddress, protseq.rawAddress, networkaddr.rawAddress, endpoint.rawAddress, networkoptions.rawAddress)

public actual fun rpcStringBindingParseW(stringbinding: Pcwstr, objuuid: MutPtr<Pwstr>, protseq: MutPtr<Pwstr>, networkaddr: MutPtr<Pwstr>, endpoint: MutPtr<Pwstr>, networkoptions: MutPtr<Pwstr>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcStringBindingParseW(stringbinding.rawAddress, objuuid.rawAddress, protseq.rawAddress, networkaddr.rawAddress, endpoint.rawAddress, networkoptions.rawAddress)

public actual fun rpcStringFreeA(string: MutPtr<Pstr>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcStringFreeA(string.rawAddress)

public actual fun rpcStringFreeW(string: MutPtr<Pwstr>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcStringFreeW(string.rawAddress)

public actual fun rpcTestCancel(): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcTestCancel()

public actual fun rpcUserFree(asynchandle: MutPtr<CVoid>, pbuffer: MutPtr<CVoid>) {
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcRpcUserFree(asynchandle.rawAddress, pbuffer.rawAddress)
}

public actual fun uuidCompare(uuid1: ConstPtr<Guid>, uuid2: ConstPtr<Guid>, status: MutPtr<RpcStatus>): Int =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcUuidCompare(uuid1.rawAddress, uuid2.rawAddress, status.rawAddress)

public actual fun uuidCreate(uuid: MutPtr<Guid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcUuidCreate(uuid.rawAddress)

public actual fun uuidCreateNil(niluuid: MutPtr<Guid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcUuidCreateNil(niluuid.rawAddress)

public actual fun uuidCreateSequential(uuid: MutPtr<Guid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcUuidCreateSequential(uuid.rawAddress)

public actual fun uuidEqual(uuid1: ConstPtr<Guid>, uuid2: ConstPtr<Guid>, status: MutPtr<RpcStatus>): Int =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcUuidEqual(uuid1.rawAddress, uuid2.rawAddress, status.rawAddress)

public actual fun uuidFromStringA(stringuuid: Pcstr, uuid: MutPtr<Guid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcUuidFromStringA(stringuuid.rawAddress, uuid.rawAddress)

public actual fun uuidFromStringW(stringuuid: Pcwstr, uuid: MutPtr<Guid>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcUuidFromStringW(stringuuid.rawAddress, uuid.rawAddress)

public actual fun uuidHash(uuid: ConstPtr<Guid>, status: MutPtr<RpcStatus>): UShort =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcUuidHash(uuid.rawAddress, status.rawAddress).toUShort()

public actual fun uuidIsNil(uuid: ConstPtr<Guid>, status: MutPtr<RpcStatus>): Int =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcUuidIsNil(uuid.rawAddress, status.rawAddress)

public actual fun uuidToStringA(uuid: ConstPtr<Guid>, stringuuid: MutPtr<Pstr>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcUuidToStringA(uuid.rawAddress, stringuuid.rawAddress)

public actual fun uuidToStringW(uuid: ConstPtr<Guid>, stringuuid: MutPtr<Pwstr>): RpcStatus =
    WindowsWin32SystemRpcJniBridge.windowssysWindowsWin32SystemRpcUuidToStringW(uuid.rawAddress, stringuuid.rawAddress)
