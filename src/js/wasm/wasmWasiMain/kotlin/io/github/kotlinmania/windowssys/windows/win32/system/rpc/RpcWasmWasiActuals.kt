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

public actual fun DceErrorInqTextA(rpcstatus: RPC_STATUS, errortext: PSTR): RPC_STATUS =
    0

public actual fun DceErrorInqTextW(rpcstatus: RPC_STATUS, errortext: PWSTR): RPC_STATUS =
    0

public actual fun IUnknown_AddRef_Proxy(thisRef: Long): UInt =
    0u

public actual fun IUnknown_QueryInterface_Proxy(thisRef: Long, riid: Long, ppvobject: Long): HRESULT =
    0

public actual fun IUnknown_Release_Proxy(thisRef: Long): UInt =
    0u

public actual fun I_RpcAllocate(size: UInt): Long =
    0L

public actual fun I_RpcAsyncAbortCall(pasync: Long, exceptioncode: UInt): RPC_STATUS =
    0

public actual fun I_RpcAsyncSetHandle(message: Long, pasync: Long): RPC_STATUS =
    0

public actual fun I_RpcBindingCopy(sourcebinding: Long, destinationbinding: Long): RPC_STATUS =
    0

public actual fun I_RpcBindingCreateNP(servername: PCWSTR, servicename: PCWSTR, networkoptions: PCWSTR, binding: Long): RPC_STATUS =
    0

public actual fun I_RpcBindingHandleToAsyncHandle(binding: Long, asynchandle: Long): RPC_STATUS =
    0

public actual fun I_RpcBindingInqClientTokenAttributes(binding: Long, tokenid: Long, authenticationid: Long, modifiedid: Long): RPC_STATUS =
    0

public actual fun I_RpcBindingInqDynamicEndpointA(binding: Long, dynamicendpoint: Long): RPC_STATUS =
    0

public actual fun I_RpcBindingInqDynamicEndpointW(binding: Long, dynamicendpoint: Long): RPC_STATUS =
    0

public actual fun I_RpcBindingInqLocalClientPID(binding: Long, pid: Long): RPC_STATUS =
    0

public actual fun I_RpcBindingInqMarshalledTargetInfo(binding: Long, marshalledtargetinfosize: Long, marshalledtargetinfo: Long): RPC_STATUS =
    0

public actual fun I_RpcBindingInqSecurityContext(binding: Long, securitycontexthandle: Long): RPC_STATUS =
    0

public actual fun I_RpcBindingInqSecurityContextKeyInfo(binding: Long, keyinfo: Long): RPC_STATUS =
    0

public actual fun I_RpcBindingInqTransportType(binding: Long, type: Long): RPC_STATUS =
    0

public actual fun I_RpcBindingInqWireIdForSnego(binding: Long, wireid: Long): RPC_STATUS =
    0

public actual fun I_RpcBindingIsClientLocal(bindinghandle: Long, clientlocalflag: Long): RPC_STATUS =
    0

public actual fun I_RpcBindingIsServerLocal(binding: Long, serverlocalflag: Long): RPC_STATUS =
    0

public actual fun I_RpcBindingSetPrivateOption(hbinding: Long, option: UInt, optionvalue: ULong): RPC_STATUS =
    0

public actual fun I_RpcBindingToStaticStringBindingW(binding: Long, stringbinding: Long): RPC_STATUS =
    0

public actual fun I_RpcClearMutex(mutex: Long) {
}

public actual fun I_RpcDeleteMutex(mutex: Long) {
}

public actual fun I_RpcExceptionFilter(exceptioncode: UInt): Int =
    0

public actual fun I_RpcFree(obj: Long) {
}

public actual fun I_RpcFreeBuffer(message: Long): RPC_STATUS =
    0

public actual fun I_RpcFreePipeBuffer(message: Long): RPC_STATUS =
    0

public actual fun I_RpcGetBuffer(message: Long): RPC_STATUS =
    0

public actual fun I_RpcGetBufferWithObject(message: Long, objectuuid: Long): RPC_STATUS =
    0

public actual fun I_RpcGetCurrentCallHandle(): Long =
    0L

public actual fun I_RpcGetDefaultSD(ppsecuritydescriptor: Long): RPC_STATUS =
    0

public actual fun I_RpcGetExtendedError(): RPC_STATUS =
    0

public actual fun I_RpcIfInqTransferSyntaxes(rpcifhandle: Long, transfersyntaxes: Long, transfersyntaxsize: UInt, transfersyntaxcount: Long): RPC_STATUS =
    0

public actual fun I_RpcMapWin32Status(status: RPC_STATUS): Int =
    0

public actual fun I_RpcMgmtEnableDedicatedThreadPool(): RPC_STATUS =
    0

public actual fun I_RpcNegotiateTransferSyntax(message: Long): RPC_STATUS =
    0

public actual fun I_RpcNsBindingSetEntryNameA(binding: Long, entrynamesyntax: UInt, entryname: PCSTR): RPC_STATUS =
    0

public actual fun I_RpcNsBindingSetEntryNameW(binding: Long, entrynamesyntax: UInt, entryname: PCWSTR): RPC_STATUS =
    0

public actual fun I_RpcNsGetBuffer(message: Long): RPC_STATUS =
    0

public actual fun I_RpcNsInterfaceExported(entrynamesyntax: UInt, entryname: Long, rpcinterfaceinformation: Long): RPC_STATUS =
    0

public actual fun I_RpcNsInterfaceUnexported(entrynamesyntax: UInt, entryname: Long, rpcinterfaceinformation: Long): RPC_STATUS =
    0

public actual fun I_RpcNsRaiseException(message: Long, status: RPC_STATUS) {
}

public actual fun I_RpcNsSendReceive(message: Long, handle: Long): RPC_STATUS =
    0

public actual fun I_RpcOpenClientProcess(binding: Long, desiredaccess: UInt, clientprocess: Long): RPC_STATUS =
    0

public actual fun I_RpcPauseExecution(milliseconds: UInt) {
}

public actual fun I_RpcReBindBuffer(message: Long): RPC_STATUS =
    0

public actual fun I_RpcReallocPipeBuffer(message: Long, newsize: UInt): RPC_STATUS =
    0

public actual fun I_RpcReceive(message: Long, size: UInt): RPC_STATUS =
    0

public actual fun I_RpcRecordCalloutFailure(rpcstatus: RPC_STATUS, calloutstate: Long, dllname: Long) {
}

public actual fun I_RpcRequestMutex(mutex: Long) {
}

public actual fun I_RpcSend(message: Long): RPC_STATUS =
    0

public actual fun I_RpcSendReceive(message: Long): RPC_STATUS =
    0

public actual fun I_RpcServerCheckClientRestriction(context: Long): RPC_STATUS =
    0

public actual fun I_RpcServerDisableExceptionFilter(): Int =
    0

public actual fun I_RpcServerGetAssociationID(binding: Long, associationid: Long): RPC_STATUS =
    0

public actual fun I_RpcServerInqAddressChangeFn(): Long =
    0L

public actual fun I_RpcServerInqLocalConnAddress(binding: Long, buffer: Long, buffersize: Long, addressformat: Long): RPC_STATUS =
    0

public actual fun I_RpcServerInqRemoteConnAddress(binding: Long, buffer: Long, buffersize: Long, addressformat: Long): RPC_STATUS =
    0

public actual fun I_RpcServerInqTransportType(type: Long): RPC_STATUS =
    0

public actual fun I_RpcServerRegisterForwardFunction(pforwardfunction: Long): RPC_STATUS =
    0

public actual fun I_RpcServerSetAddressChangeFn(paddresschangefn: Long): RPC_STATUS =
    0

public actual fun I_RpcServerStartService(protseq: PCWSTR, endpoint: PCWSTR, ifspec: Long): RPC_STATUS =
    0

public actual fun I_RpcServerSubscribeForDisconnectNotification(binding: Long, hevent: Long): RPC_STATUS =
    0

public actual fun I_RpcServerSubscribeForDisconnectNotification2(binding: Long, hevent: Long, subscriptionid: Long): RPC_STATUS =
    0

public actual fun I_RpcServerUnsubscribeForDisconnectNotification(binding: Long, subscriptionid: GUID): RPC_STATUS =
    0

public actual fun I_RpcServerUseProtseq2A(networkaddress: PCSTR, protseq: PCSTR, maxcalls: UInt, securitydescriptor: Long, policy: Long): RPC_STATUS =
    0

public actual fun I_RpcServerUseProtseq2W(networkaddress: PCWSTR, protseq: PCWSTR, maxcalls: UInt, securitydescriptor: Long, policy: Long): RPC_STATUS =
    0

public actual fun I_RpcServerUseProtseqEp2A(networkaddress: PCSTR, protseq: PCSTR, maxcalls: UInt, endpoint: PCSTR, securitydescriptor: Long, policy: Long): RPC_STATUS =
    0

public actual fun I_RpcServerUseProtseqEp2W(networkaddress: PCWSTR, protseq: PCWSTR, maxcalls: UInt, endpoint: PCWSTR, securitydescriptor: Long, policy: Long): RPC_STATUS =
    0

public actual fun I_RpcSessionStrictContextHandle() {
}

public actual fun I_RpcSsDontSerializeContext() {
}

public actual fun I_RpcSystemHandleTypeSpecificWork(handle: Long, actualtype: UByte, idltype: UByte, marshaldirection: LRPC_SYSTEM_HANDLE_MARSHAL_DIRECTION): RPC_STATUS =
    0

public actual fun I_RpcTurnOnEEInfoPropagation(): RPC_STATUS =
    0

public actual fun I_UuidCreate(uuid: Long): RPC_STATUS =
    0

public actual fun MesBufferHandleReset(handle: Long, handlestyle: UInt, operation: MIDL_ES_CODE, pbuffer: Long, buffersize: UInt, pencodedsize: Long): RPC_STATUS =
    0

public actual fun MesDecodeBufferHandleCreate(buffer: PCSTR, buffersize: UInt, phandle: Long): RPC_STATUS =
    0

public actual fun MesDecodeIncrementalHandleCreate(userstate: Long, readfn: MIDL_ES_READ, phandle: Long): RPC_STATUS =
    0

public actual fun MesEncodeDynBufferHandleCreate(pbuffer: Long, pencodedsize: Long, phandle: Long): RPC_STATUS =
    0

public actual fun MesEncodeFixedBufferHandleCreate(pbuffer: PSTR, buffersize: UInt, pencodedsize: Long, phandle: Long): RPC_STATUS =
    0

public actual fun MesEncodeIncrementalHandleCreate(userstate: Long, allocfn: MIDL_ES_ALLOC, writefn: MIDL_ES_WRITE, phandle: Long): RPC_STATUS =
    0

public actual fun MesHandleFree(handle: Long): RPC_STATUS =
    0

public actual fun MesIncrementalHandleReset(handle: Long, userstate: Long, allocfn: MIDL_ES_ALLOC, writefn: MIDL_ES_WRITE, readfn: MIDL_ES_READ, operation: MIDL_ES_CODE): RPC_STATUS =
    0

public actual fun MesInqProcEncodingId(handle: Long, pinterfaceid: Long, pprocnum: Long): RPC_STATUS =
    0

public actual fun NDRCContextBinding(ccontext: Long): Long =
    0L

public actual fun NDRCContextMarshall(ccontext: Long, pbuff: Long) {
}

public actual fun NDRCContextUnmarshall(pccontext: Long, hbinding: Long, pbuff: Long, datarepresentation: UInt) {
}

public actual fun NDRSContextMarshall(ccontext: Long, pbuff: Long, userrundownin: NDR_RUNDOWN) {
}

public actual fun NDRSContextMarshall2(bindinghandle: Long, ccontext: Long, pbuff: Long, userrundownin: NDR_RUNDOWN, ctxguard: Long, flags: UInt) {
}

public actual fun NDRSContextMarshallEx(bindinghandle: Long, ccontext: Long, pbuff: Long, userrundownin: NDR_RUNDOWN) {
}

public actual fun NDRSContextUnmarshall(pbuff: Long, datarepresentation: UInt): Long =
    0L

public actual fun NDRSContextUnmarshall2(bindinghandle: Long, pbuff: Long, datarepresentation: UInt, ctxguard: Long, flags: UInt): Long =
    0L

public actual fun NDRSContextUnmarshallEx(bindinghandle: Long, pbuff: Long, datarepresentation: UInt): Long =
    0L

public actual fun Ndr64AsyncClientCall(pproxyinfo: Long, nprocnum: UInt, preturnvalue: Long): CLIENT_CALL_RETURN =
    CLIENT_CALL_RETURN()

public actual fun Ndr64AsyncServerCall64(prpcmsg: Long) {
}

public actual fun Ndr64AsyncServerCallAll(prpcmsg: Long) {
}

public actual fun Ndr64DcomAsyncClientCall(pproxyinfo: Long, nprocnum: UInt, preturnvalue: Long): CLIENT_CALL_RETURN =
    CLIENT_CALL_RETURN()

public actual fun Ndr64DcomAsyncStubCall(pthis: Long, pchannel: Long, prpcmsg: Long, pdwstubphase: Long): Int =
    0

public actual fun NdrAllocate(pstubmsg: Long, len: ULong): Long =
    0L

public actual fun NdrAsyncClientCall(pstubdescriptor: Long, pformat: Long): CLIENT_CALL_RETURN =
    CLIENT_CALL_RETURN()

public actual fun NdrAsyncServerCall(prpcmsg: Long) {
}

public actual fun NdrByteCountPointerBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
}

public actual fun NdrByteCountPointerFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
}

public actual fun NdrByteCountPointerMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    0L

public actual fun NdrByteCountPointerUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    0L

public actual fun NdrClearOutParameters(pstubmsg: Long, pformat: Long, argaddr: Long) {
}

public actual fun NdrClientCall2(pstubdescriptor: Long, pformat: Long): CLIENT_CALL_RETURN =
    CLIENT_CALL_RETURN()

public actual fun NdrClientCall3(pproxyinfo: Long, nprocnum: UInt, preturnvalue: Long): CLIENT_CALL_RETURN =
    CLIENT_CALL_RETURN()

public actual fun NdrClientContextMarshall(pstubmsg: Long, contexthandle: Long, fcheck: Int) {
}

public actual fun NdrClientContextUnmarshall(pstubmsg: Long, pcontexthandle: Long, bindhandle: Long) {
}

public actual fun NdrClientInitialize(prpcmsg: Long, pstubmsg: Long, pstubdescriptor: Long, procnum: UInt) {
}

public actual fun NdrClientInitializeNew(prpcmsg: Long, pstubmsg: Long, pstubdescriptor: Long, procnum: UInt) {
}

public actual fun NdrComplexArrayBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
}

public actual fun NdrComplexArrayFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
}

public actual fun NdrComplexArrayMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    0L

public actual fun NdrComplexArrayMemorySize(pstubmsg: Long, pformat: Long): UInt =
    0u

public actual fun NdrComplexArrayUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    0L

public actual fun NdrComplexStructBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
}

public actual fun NdrComplexStructFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
}

public actual fun NdrComplexStructMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    0L

public actual fun NdrComplexStructMemorySize(pstubmsg: Long, pformat: Long): UInt =
    0u

public actual fun NdrComplexStructUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    0L

public actual fun NdrConformantArrayBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
}

public actual fun NdrConformantArrayFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
}

public actual fun NdrConformantArrayMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    0L

public actual fun NdrConformantArrayMemorySize(pstubmsg: Long, pformat: Long): UInt =
    0u

public actual fun NdrConformantArrayUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    0L

public actual fun NdrConformantStringBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
}

public actual fun NdrConformantStringMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    0L

public actual fun NdrConformantStringMemorySize(pstubmsg: Long, pformat: Long): UInt =
    0u

public actual fun NdrConformantStringUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    0L

public actual fun NdrConformantStructBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
}

public actual fun NdrConformantStructFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
}

public actual fun NdrConformantStructMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    0L

public actual fun NdrConformantStructMemorySize(pstubmsg: Long, pformat: Long): UInt =
    0u

public actual fun NdrConformantStructUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    0L

public actual fun NdrConformantVaryingArrayBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
}

public actual fun NdrConformantVaryingArrayFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
}

public actual fun NdrConformantVaryingArrayMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    0L

public actual fun NdrConformantVaryingArrayMemorySize(pstubmsg: Long, pformat: Long): UInt =
    0u

public actual fun NdrConformantVaryingArrayUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    0L

public actual fun NdrConformantVaryingStructBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
}

public actual fun NdrConformantVaryingStructFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
}

public actual fun NdrConformantVaryingStructMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    0L

public actual fun NdrConformantVaryingStructMemorySize(pstubmsg: Long, pformat: Long): UInt =
    0u

public actual fun NdrConformantVaryingStructUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    0L

public actual fun NdrContextHandleInitialize(pstubmsg: Long, pformat: Long): Long =
    0L

public actual fun NdrContextHandleSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
}

public actual fun NdrConvert(pstubmsg: Long, pformat: Long) {
}

public actual fun NdrConvert2(pstubmsg: Long, pformat: Long, numberparams: Int) {
}

public actual fun NdrCorrelationFree(pstubmsg: Long) {
}

public actual fun NdrCorrelationInitialize(pstubmsg: Long, pmemory: Long, cachesize: UInt, flags: UInt) {
}

public actual fun NdrCorrelationPass(pstubmsg: Long) {
}

public actual fun NdrCreateServerInterfaceFromStub(pstub: Long, pserverif: Long): RPC_STATUS =
    0

public actual fun NdrDcomAsyncClientCall(pstubdescriptor: Long, pformat: Long): CLIENT_CALL_RETURN =
    CLIENT_CALL_RETURN()

public actual fun NdrDcomAsyncStubCall(pthis: Long, pchannel: Long, prpcmsg: Long, pdwstubphase: Long): Int =
    0

public actual fun NdrEncapsulatedUnionBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
}

public actual fun NdrEncapsulatedUnionFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
}

public actual fun NdrEncapsulatedUnionMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    0L

public actual fun NdrEncapsulatedUnionMemorySize(pstubmsg: Long, pformat: Long): UInt =
    0u

public actual fun NdrEncapsulatedUnionUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    0L

public actual fun NdrFixedArrayBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
}

public actual fun NdrFixedArrayFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
}

public actual fun NdrFixedArrayMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    0L

public actual fun NdrFixedArrayMemorySize(pstubmsg: Long, pformat: Long): UInt =
    0u

public actual fun NdrFixedArrayUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    0L

public actual fun NdrFreeBuffer(pstubmsg: Long) {
}

public actual fun NdrFullPointerXlatFree(pxlattables: Long) {
}

public actual fun NdrFullPointerXlatInit(numberofpointers: UInt, xlatside: XLAT_SIDE): Long =
    0L

public actual fun NdrGetBuffer(pstubmsg: Long, bufferlength: UInt, handle: Long): Long =
    0L

public actual fun NdrGetDcomProtocolVersion(pstubmsg: Long, pversion: Long): HRESULT =
    0

public actual fun NdrGetUserMarshalInfo(pflags: Long, informationlevel: UInt, pmarshalinfo: Long): RPC_STATUS =
    0

public actual fun NdrInterfacePointerBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
}

public actual fun NdrInterfacePointerFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
}

public actual fun NdrInterfacePointerMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    0L

public actual fun NdrInterfacePointerMemorySize(pstubmsg: Long, pformat: Long): UInt =
    0u

public actual fun NdrInterfacePointerUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    0L

public actual fun NdrMapCommAndFaultStatus(pstubmsg: Long, pcommstatus: Long, pfaultstatus: Long, status: RPC_STATUS): RPC_STATUS =
    0

public actual fun NdrMesProcEncodeDecode(handle: Long, pstubdesc: Long, pformatstring: Long) {
}

public actual fun NdrMesProcEncodeDecode2(handle: Long, pstubdesc: Long, pformatstring: Long): CLIENT_CALL_RETURN =
    CLIENT_CALL_RETURN()

public actual fun NdrMesProcEncodeDecode3(handle: Long, pproxyinfo: Long, nprocnum: UInt, preturnvalue: Long): CLIENT_CALL_RETURN =
    CLIENT_CALL_RETURN()

public actual fun NdrMesSimpleTypeAlignSize(param0: Long): ULong =
    0uL

public actual fun NdrMesSimpleTypeAlignSizeAll(handle: Long, pproxyinfo: Long): ULong =
    0uL

public actual fun NdrMesSimpleTypeDecode(handle: Long, pobject: Long, size: Short) {
}

public actual fun NdrMesSimpleTypeDecodeAll(handle: Long, pproxyinfo: Long, pobject: Long, size: Short) {
}

public actual fun NdrMesSimpleTypeEncode(handle: Long, pstubdesc: Long, pobject: Long, size: Short) {
}

public actual fun NdrMesSimpleTypeEncodeAll(handle: Long, pproxyinfo: Long, pobject: Long, size: Short) {
}

public actual fun NdrMesTypeAlignSize(handle: Long, pstubdesc: Long, pformatstring: Long, pobject: Long): ULong =
    0uL

public actual fun NdrMesTypeAlignSize2(handle: Long, ppicklinginfo: Long, pstubdesc: Long, pformatstring: Long, pobject: Long): ULong =
    0uL

public actual fun NdrMesTypeAlignSize3(handle: Long, ppicklinginfo: Long, pproxyinfo: Long, arrtypeoffset: Long, ntypeindex: UInt, pobject: Long): ULong =
    0uL

public actual fun NdrMesTypeDecode(handle: Long, pstubdesc: Long, pformatstring: Long, pobject: Long) {
}

public actual fun NdrMesTypeDecode2(handle: Long, ppicklinginfo: Long, pstubdesc: Long, pformatstring: Long, pobject: Long) {
}

public actual fun NdrMesTypeDecode3(handle: Long, ppicklinginfo: Long, pproxyinfo: Long, arrtypeoffset: Long, ntypeindex: UInt, pobject: Long) {
}

public actual fun NdrMesTypeEncode(handle: Long, pstubdesc: Long, pformatstring: Long, pobject: Long) {
}

public actual fun NdrMesTypeEncode2(handle: Long, ppicklinginfo: Long, pstubdesc: Long, pformatstring: Long, pobject: Long) {
}

public actual fun NdrMesTypeEncode3(handle: Long, ppicklinginfo: Long, pproxyinfo: Long, arrtypeoffset: Long, ntypeindex: UInt, pobject: Long) {
}

public actual fun NdrMesTypeFree2(handle: Long, ppicklinginfo: Long, pstubdesc: Long, pformatstring: Long, pobject: Long) {
}

public actual fun NdrMesTypeFree3(handle: Long, ppicklinginfo: Long, pproxyinfo: Long, arrtypeoffset: Long, ntypeindex: UInt, pobject: Long) {
}

public actual fun NdrNonConformantStringBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
}

public actual fun NdrNonConformantStringMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    0L

public actual fun NdrNonConformantStringMemorySize(pstubmsg: Long, pformat: Long): UInt =
    0u

public actual fun NdrNonConformantStringUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    0L

public actual fun NdrNonEncapsulatedUnionBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
}

public actual fun NdrNonEncapsulatedUnionFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
}

public actual fun NdrNonEncapsulatedUnionMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    0L

public actual fun NdrNonEncapsulatedUnionMemorySize(pstubmsg: Long, pformat: Long): UInt =
    0u

public actual fun NdrNonEncapsulatedUnionUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    0L

public actual fun NdrNsGetBuffer(pstubmsg: Long, bufferlength: UInt, handle: Long): Long =
    0L

public actual fun NdrNsSendReceive(pstubmsg: Long, pbufferend: Long, pautohandle: Long): Long =
    0L

public actual fun NdrOleAllocate(size: ULong): Long =
    0L

public actual fun NdrOleFree(nodetofree: Long) {
}

public actual fun NdrPartialIgnoreClientBufferSize(pstubmsg: Long, pmemory: Long) {
}

public actual fun NdrPartialIgnoreClientMarshall(pstubmsg: Long, pmemory: Long) {
}

public actual fun NdrPartialIgnoreServerInitialize(pstubmsg: Long, ppmemory: Long, pformat: Long) {
}

public actual fun NdrPartialIgnoreServerUnmarshall(pstubmsg: Long, ppmemory: Long) {
}

public actual fun NdrPointerBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
}

public actual fun NdrPointerFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
}

public actual fun NdrPointerMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    0L

public actual fun NdrPointerMemorySize(pstubmsg: Long, pformat: Long): UInt =
    0u

public actual fun NdrPointerUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    0L

public actual fun NdrRangeUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    0L

public actual fun NdrRpcSmClientAllocate(size: ULong): Long =
    0L

public actual fun NdrRpcSmClientFree(nodetofree: Long) {
}

public actual fun NdrRpcSmSetClientToOsf(pmessage: Long) {
}

public actual fun NdrRpcSsDefaultAllocate(size: ULong): Long =
    0L

public actual fun NdrRpcSsDefaultFree(nodetofree: Long) {
}

public actual fun NdrRpcSsDisableAllocate(pmessage: Long) {
}

public actual fun NdrRpcSsEnableAllocate(pmessage: Long) {
}

public actual fun NdrSendReceive(pstubmsg: Long, pbufferend: Long): Long =
    0L

public actual fun NdrServerCall2(prpcmsg: Long) {
}

public actual fun NdrServerCallAll(prpcmsg: Long) {
}

public actual fun NdrServerCallNdr64(prpcmsg: Long) {
}

public actual fun NdrServerContextMarshall(pstubmsg: Long, contexthandle: Long, rundownroutine: NDR_RUNDOWN) {
}

public actual fun NdrServerContextNewMarshall(pstubmsg: Long, contexthandle: Long, rundownroutine: NDR_RUNDOWN, pformat: Long) {
}

public actual fun NdrServerContextNewUnmarshall(pstubmsg: Long, pformat: Long): Long =
    0L

public actual fun NdrServerContextUnmarshall(pstubmsg: Long): Long =
    0L

public actual fun NdrServerInitialize(prpcmsg: Long, pstubmsg: Long, pstubdescriptor: Long): Long =
    0L

public actual fun NdrServerInitializeMarshall(prpcmsg: Long, pstubmsg: Long) {
}

public actual fun NdrServerInitializeNew(prpcmsg: Long, pstubmsg: Long, pstubdescriptor: Long): Long =
    0L

public actual fun NdrServerInitializePartial(prpcmsg: Long, pstubmsg: Long, pstubdescriptor: Long, requestedbuffersize: UInt) {
}

public actual fun NdrServerInitializeUnmarshall(pstubmsg: Long, pstubdescriptor: Long, prpcmsg: Long): Long =
    0L

public actual fun NdrSimpleStructBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
}

public actual fun NdrSimpleStructFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
}

public actual fun NdrSimpleStructMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    0L

public actual fun NdrSimpleStructMemorySize(pstubmsg: Long, pformat: Long): UInt =
    0u

public actual fun NdrSimpleStructUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    0L

public actual fun NdrSimpleTypeMarshall(pstubmsg: Long, pmemory: Long, formatchar: UByte) {
}

public actual fun NdrSimpleTypeUnmarshall(pstubmsg: Long, pmemory: Long, formatchar: UByte) {
}

public actual fun NdrStubCall2(pthis: Long, pchannel: Long, prpcmsg: Long, pdwstubphase: Long): Int =
    0

public actual fun NdrStubCall3(pthis: Long, pchannel: Long, prpcmsg: Long, pdwstubphase: Long): Int =
    0

public actual fun NdrUserMarshalBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
}

public actual fun NdrUserMarshalFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
}

public actual fun NdrUserMarshalMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    0L

public actual fun NdrUserMarshalMemorySize(pstubmsg: Long, pformat: Long): UInt =
    0u

public actual fun NdrUserMarshalSimpleTypeConvert(pflags: Long, pbuffer: Long, formatchar: UByte): Long =
    0L

public actual fun NdrUserMarshalUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    0L

public actual fun NdrVaryingArrayBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
}

public actual fun NdrVaryingArrayFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
}

public actual fun NdrVaryingArrayMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    0L

public actual fun NdrVaryingArrayMemorySize(pstubmsg: Long, pformat: Long): UInt =
    0u

public actual fun NdrVaryingArrayUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    0L

public actual fun NdrXmitOrRepAsBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
}

public actual fun NdrXmitOrRepAsFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
}

public actual fun NdrXmitOrRepAsMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    0L

public actual fun NdrXmitOrRepAsMemorySize(pstubmsg: Long, pformat: Long): UInt =
    0u

public actual fun NdrXmitOrRepAsUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    0L

public actual fun RpcAsyncAbortCall(pasync: Long, exceptioncode: UInt): RPC_STATUS =
    0

public actual fun RpcAsyncCancelCall(pasync: Long, fabort: BOOL): RPC_STATUS =
    0

public actual fun RpcAsyncCompleteCall(pasync: Long, reply: Long): RPC_STATUS =
    0

public actual fun RpcAsyncGetCallStatus(pasync: Long): RPC_STATUS =
    0

public actual fun RpcAsyncInitializeHandle(pasync: Long, size: UInt): RPC_STATUS =
    0

public actual fun RpcAsyncRegisterInfo(pasync: Long): RPC_STATUS =
    0

public actual fun RpcBindingBind(pasync: Long, binding: Long, ifspec: Long): RPC_STATUS =
    0

public actual fun RpcBindingCopy(sourcebinding: Long, destinationbinding: Long): RPC_STATUS =
    0

public actual fun RpcBindingCreateA(template: Long, security: Long, options: Long, binding: Long): RPC_STATUS =
    0

public actual fun RpcBindingCreateW(template: Long, security: Long, options: Long, binding: Long): RPC_STATUS =
    0

public actual fun RpcBindingFree(binding: Long): RPC_STATUS =
    0

public actual fun RpcBindingFromStringBindingA(stringbinding: PCSTR, binding: Long): RPC_STATUS =
    0

public actual fun RpcBindingFromStringBindingW(stringbinding: PCWSTR, binding: Long): RPC_STATUS =
    0

public actual fun RpcBindingInqAuthClientA(clientbinding: Long, privs: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authzsvc: Long): RPC_STATUS =
    0

public actual fun RpcBindingInqAuthClientExA(clientbinding: Long, privs: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authzsvc: Long, flags: UInt): RPC_STATUS =
    0

public actual fun RpcBindingInqAuthClientExW(clientbinding: Long, privs: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authzsvc: Long, flags: UInt): RPC_STATUS =
    0

public actual fun RpcBindingInqAuthClientW(clientbinding: Long, privs: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authzsvc: Long): RPC_STATUS =
    0

public actual fun RpcBindingInqAuthInfoA(binding: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authidentity: Long, authzsvc: Long): RPC_STATUS =
    0

public actual fun RpcBindingInqAuthInfoExA(binding: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authidentity: Long, authzsvc: Long, rpcqosversion: UInt, securityqos: Long): RPC_STATUS =
    0

public actual fun RpcBindingInqAuthInfoExW(binding: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authidentity: Long, authzsvc: Long, rpcqosversion: UInt, securityqos: Long): RPC_STATUS =
    0

public actual fun RpcBindingInqAuthInfoW(binding: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authidentity: Long, authzsvc: Long): RPC_STATUS =
    0

public actual fun RpcBindingInqMaxCalls(binding: Long, maxcalls: Long): RPC_STATUS =
    0

public actual fun RpcBindingInqObject(binding: Long, objectuuid: Long): RPC_STATUS =
    0

public actual fun RpcBindingInqOption(hbinding: Long, option: UInt, poptionvalue: Long): RPC_STATUS =
    0

public actual fun RpcBindingReset(binding: Long): RPC_STATUS =
    0

public actual fun RpcBindingServerFromClient(clientbinding: Long, serverbinding: Long): RPC_STATUS =
    0

public actual fun RpcBindingSetAuthInfoA(binding: Long, serverprincname: PCSTR, authnlevel: UInt, authnsvc: UInt, authidentity: Long, authzsvc: UInt): RPC_STATUS =
    0

public actual fun RpcBindingSetAuthInfoExA(binding: Long, serverprincname: PCSTR, authnlevel: UInt, authnsvc: UInt, authidentity: Long, authzsvc: UInt, securityqos: Long): RPC_STATUS =
    0

public actual fun RpcBindingSetAuthInfoExW(binding: Long, serverprincname: PCWSTR, authnlevel: UInt, authnsvc: UInt, authidentity: Long, authzsvc: UInt, securityqos: Long): RPC_STATUS =
    0

public actual fun RpcBindingSetAuthInfoW(binding: Long, serverprincname: PCWSTR, authnlevel: UInt, authnsvc: UInt, authidentity: Long, authzsvc: UInt): RPC_STATUS =
    0

public actual fun RpcBindingSetObject(binding: Long, objectuuid: Long): RPC_STATUS =
    0

public actual fun RpcBindingSetOption(hbinding: Long, option: UInt, optionvalue: ULong): RPC_STATUS =
    0

public actual fun RpcBindingToStringBindingA(binding: Long, stringbinding: Long): RPC_STATUS =
    0

public actual fun RpcBindingToStringBindingW(binding: Long, stringbinding: Long): RPC_STATUS =
    0

public actual fun RpcBindingUnbind(binding: Long): RPC_STATUS =
    0

public actual fun RpcBindingVectorFree(bindingvector: Long): RPC_STATUS =
    0

public actual fun RpcCancelThread(thread: Long): RPC_STATUS =
    0

public actual fun RpcCancelThreadEx(thread: Long, timeout: Int): RPC_STATUS =
    0

public actual fun RpcCertGeneratePrincipalNameA(context: Long, flags: UInt, pbuffer: Long): RPC_STATUS =
    0

public actual fun RpcCertGeneratePrincipalNameW(context: Long, flags: UInt, pbuffer: Long): RPC_STATUS =
    0

public actual fun RpcEpRegisterA(ifspec: Long, bindingvector: Long, uuidvector: Long, annotation: PCSTR): RPC_STATUS =
    0

public actual fun RpcEpRegisterNoReplaceA(ifspec: Long, bindingvector: Long, uuidvector: Long, annotation: PCSTR): RPC_STATUS =
    0

public actual fun RpcEpRegisterNoReplaceW(ifspec: Long, bindingvector: Long, uuidvector: Long, annotation: PCWSTR): RPC_STATUS =
    0

public actual fun RpcEpRegisterW(ifspec: Long, bindingvector: Long, uuidvector: Long, annotation: PCWSTR): RPC_STATUS =
    0

public actual fun RpcEpResolveBinding(binding: Long, ifspec: Long): RPC_STATUS =
    0

public actual fun RpcEpUnregister(ifspec: Long, bindingvector: Long, uuidvector: Long): RPC_STATUS =
    0

public actual fun RpcErrorAddRecord(errorinfo: Long): RPC_STATUS =
    0

public actual fun RpcErrorClearInformation() {
}

public actual fun RpcErrorEndEnumeration(enumhandle: Long): RPC_STATUS =
    0

public actual fun RpcErrorGetNextRecord(enumhandle: Long, copystrings: BOOL, errorinfo: Long): RPC_STATUS =
    0

public actual fun RpcErrorGetNumberOfRecords(enumhandle: Long, records: Long): RPC_STATUS =
    0

public actual fun RpcErrorLoadErrorInfo(errorblob: Long, blobsize: ULong, enumhandle: Long): RPC_STATUS =
    0

public actual fun RpcErrorResetEnumeration(enumhandle: Long): RPC_STATUS =
    0

public actual fun RpcErrorSaveErrorInfo(enumhandle: Long, errorblob: Long, blobsize: Long): RPC_STATUS =
    0

public actual fun RpcErrorStartEnumeration(enumhandle: Long): RPC_STATUS =
    0

public actual fun RpcExceptionFilter(exceptioncode: UInt): Int =
    0

public actual fun RpcFreeAuthorizationContext(pauthzclientcontext: Long): RPC_STATUS =
    0

public actual fun RpcGetAuthorizationContextForClient(clientbinding: Long, impersonateonreturn: BOOL, reserved1: Long, pexpirationtime: Long, reserved2: LUID, reserved3: UInt, reserved4: Long, pauthzclientcontext: Long): RPC_STATUS =
    0

public actual fun RpcIfIdVectorFree(ifidvector: Long): RPC_STATUS =
    0

public actual fun RpcIfInqId(rpcifhandle: Long, rpcifid: Long): RPC_STATUS =
    0

public actual fun RpcImpersonateClient(bindinghandle: Long): RPC_STATUS =
    0

public actual fun RpcImpersonateClient2(bindinghandle: Long): RPC_STATUS =
    0

public actual fun RpcImpersonateClientContainer(bindinghandle: Long): RPC_STATUS =
    0

public actual fun RpcMgmtEnableIdleCleanup(): RPC_STATUS =
    0

public actual fun RpcMgmtEpEltInqBegin(epbinding: Long, inquirytype: UInt, ifid: Long, versoption: UInt, objectuuid: Long, inquirycontext: Long): RPC_STATUS =
    0

public actual fun RpcMgmtEpEltInqDone(inquirycontext: Long): RPC_STATUS =
    0

public actual fun RpcMgmtEpEltInqNextA(inquirycontext: Long, ifid: Long, binding: Long, objectuuid: Long, annotation: Long): RPC_STATUS =
    0

public actual fun RpcMgmtEpEltInqNextW(inquirycontext: Long, ifid: Long, binding: Long, objectuuid: Long, annotation: Long): RPC_STATUS =
    0

public actual fun RpcMgmtEpUnregister(epbinding: Long, ifid: Long, binding: Long, objectuuid: Long): RPC_STATUS =
    0

public actual fun RpcMgmtInqComTimeout(binding: Long, timeout: Long): RPC_STATUS =
    0

public actual fun RpcMgmtInqDefaultProtectLevel(authnsvc: UInt, authnlevel: Long): RPC_STATUS =
    0

public actual fun RpcMgmtInqIfIds(binding: Long, ifidvector: Long): RPC_STATUS =
    0

public actual fun RpcMgmtInqServerPrincNameA(binding: Long, authnsvc: UInt, serverprincname: Long): RPC_STATUS =
    0

public actual fun RpcMgmtInqServerPrincNameW(binding: Long, authnsvc: UInt, serverprincname: Long): RPC_STATUS =
    0

public actual fun RpcMgmtInqStats(binding: Long, statistics: Long): RPC_STATUS =
    0

public actual fun RpcMgmtIsServerListening(binding: Long): RPC_STATUS =
    0

public actual fun RpcMgmtSetAuthorizationFn(authorizationfn: RPC_MGMT_AUTHORIZATION_FN): RPC_STATUS =
    0

public actual fun RpcMgmtSetCancelTimeout(timeout: Int): RPC_STATUS =
    0

public actual fun RpcMgmtSetComTimeout(binding: Long, timeout: UInt): RPC_STATUS =
    0

public actual fun RpcMgmtSetServerStackSize(threadstacksize: UInt): RPC_STATUS =
    0

public actual fun RpcMgmtStatsVectorFree(statsvector: Long): RPC_STATUS =
    0

public actual fun RpcMgmtStopServerListening(binding: Long): RPC_STATUS =
    0

public actual fun RpcMgmtWaitServerListen(): RPC_STATUS =
    0

public actual fun RpcNetworkInqProtseqsA(protseqvector: Long): RPC_STATUS =
    0

public actual fun RpcNetworkInqProtseqsW(protseqvector: Long): RPC_STATUS =
    0

public actual fun RpcNetworkIsProtseqValidA(protseq: PCSTR): RPC_STATUS =
    0

public actual fun RpcNetworkIsProtseqValidW(protseq: PCWSTR): RPC_STATUS =
    0

public actual fun RpcNsBindingExportA(entrynamesyntax: UInt, entryname: PCSTR, ifspec: Long, bindingvec: Long, objectuuidvec: Long): RPC_STATUS =
    0

public actual fun RpcNsBindingExportPnPA(entrynamesyntax: UInt, entryname: PCSTR, ifspec: Long, objectvector: Long): RPC_STATUS =
    0

public actual fun RpcNsBindingExportPnPW(entrynamesyntax: UInt, entryname: PCWSTR, ifspec: Long, objectvector: Long): RPC_STATUS =
    0

public actual fun RpcNsBindingExportW(entrynamesyntax: UInt, entryname: PCWSTR, ifspec: Long, bindingvec: Long, objectuuidvec: Long): RPC_STATUS =
    0

public actual fun RpcNsBindingImportBeginA(entrynamesyntax: UInt, entryname: PCSTR, ifspec: Long, objuuid: Long, importcontext: Long): RPC_STATUS =
    0

public actual fun RpcNsBindingImportBeginW(entrynamesyntax: UInt, entryname: PCWSTR, ifspec: Long, objuuid: Long, importcontext: Long): RPC_STATUS =
    0

public actual fun RpcNsBindingImportDone(importcontext: Long): RPC_STATUS =
    0

public actual fun RpcNsBindingImportNext(importcontext: Long, binding: Long): RPC_STATUS =
    0

public actual fun RpcNsBindingInqEntryNameA(binding: Long, entrynamesyntax: UInt, entryname: Long): RPC_STATUS =
    0

public actual fun RpcNsBindingInqEntryNameW(binding: Long, entrynamesyntax: UInt, entryname: Long): RPC_STATUS =
    0

public actual fun RpcNsBindingLookupBeginA(entrynamesyntax: UInt, entryname: PCSTR, ifspec: Long, objuuid: Long, bindingmaxcount: UInt, lookupcontext: Long): RPC_STATUS =
    0

public actual fun RpcNsBindingLookupBeginW(entrynamesyntax: UInt, entryname: PCWSTR, ifspec: Long, objuuid: Long, bindingmaxcount: UInt, lookupcontext: Long): RPC_STATUS =
    0

public actual fun RpcNsBindingLookupDone(lookupcontext: Long): RPC_STATUS =
    0

public actual fun RpcNsBindingLookupNext(lookupcontext: Long, bindingvec: Long): RPC_STATUS =
    0

public actual fun RpcNsBindingSelect(bindingvec: Long, binding: Long): RPC_STATUS =
    0

public actual fun RpcNsBindingUnexportA(entrynamesyntax: UInt, entryname: PCSTR, ifspec: Long, objectuuidvec: Long): RPC_STATUS =
    0

public actual fun RpcNsBindingUnexportPnPA(entrynamesyntax: UInt, entryname: PCSTR, ifspec: Long, objectvector: Long): RPC_STATUS =
    0

public actual fun RpcNsBindingUnexportPnPW(entrynamesyntax: UInt, entryname: PCWSTR, ifspec: Long, objectvector: Long): RPC_STATUS =
    0

public actual fun RpcNsBindingUnexportW(entrynamesyntax: UInt, entryname: PCWSTR, ifspec: Long, objectuuidvec: Long): RPC_STATUS =
    0

public actual fun RpcNsEntryExpandNameA(entrynamesyntax: UInt, entryname: PCSTR, expandedname: Long): RPC_STATUS =
    0

public actual fun RpcNsEntryExpandNameW(entrynamesyntax: UInt, entryname: PCWSTR, expandedname: Long): RPC_STATUS =
    0

public actual fun RpcNsEntryObjectInqBeginA(entrynamesyntax: UInt, entryname: PCSTR, inquirycontext: Long): RPC_STATUS =
    0

public actual fun RpcNsEntryObjectInqBeginW(entrynamesyntax: UInt, entryname: PCWSTR, inquirycontext: Long): RPC_STATUS =
    0

public actual fun RpcNsEntryObjectInqDone(inquirycontext: Long): RPC_STATUS =
    0

public actual fun RpcNsEntryObjectInqNext(inquirycontext: Long, objuuid: Long): RPC_STATUS =
    0

public actual fun RpcNsGroupDeleteA(groupnamesyntax: GROUP_NAME_SYNTAX, groupname: PCSTR): RPC_STATUS =
    0

public actual fun RpcNsGroupDeleteW(groupnamesyntax: GROUP_NAME_SYNTAX, groupname: PCWSTR): RPC_STATUS =
    0

public actual fun RpcNsGroupMbrAddA(groupnamesyntax: UInt, groupname: PCSTR, membernamesyntax: UInt, membername: PCSTR): RPC_STATUS =
    0

public actual fun RpcNsGroupMbrAddW(groupnamesyntax: UInt, groupname: PCWSTR, membernamesyntax: UInt, membername: PCWSTR): RPC_STATUS =
    0

public actual fun RpcNsGroupMbrInqBeginA(groupnamesyntax: UInt, groupname: PCSTR, membernamesyntax: UInt, inquirycontext: Long): RPC_STATUS =
    0

public actual fun RpcNsGroupMbrInqBeginW(groupnamesyntax: UInt, groupname: PCWSTR, membernamesyntax: UInt, inquirycontext: Long): RPC_STATUS =
    0

public actual fun RpcNsGroupMbrInqDone(inquirycontext: Long): RPC_STATUS =
    0

public actual fun RpcNsGroupMbrInqNextA(inquirycontext: Long, membername: Long): RPC_STATUS =
    0

public actual fun RpcNsGroupMbrInqNextW(inquirycontext: Long, membername: Long): RPC_STATUS =
    0

public actual fun RpcNsGroupMbrRemoveA(groupnamesyntax: UInt, groupname: PCSTR, membernamesyntax: UInt, membername: PCSTR): RPC_STATUS =
    0

public actual fun RpcNsGroupMbrRemoveW(groupnamesyntax: UInt, groupname: PCWSTR, membernamesyntax: UInt, membername: PCWSTR): RPC_STATUS =
    0

public actual fun RpcNsMgmtBindingUnexportA(entrynamesyntax: UInt, entryname: PCSTR, ifid: Long, versoption: UInt, objectuuidvec: Long): RPC_STATUS =
    0

public actual fun RpcNsMgmtBindingUnexportW(entrynamesyntax: UInt, entryname: PCWSTR, ifid: Long, versoption: UInt, objectuuidvec: Long): RPC_STATUS =
    0

public actual fun RpcNsMgmtEntryCreateA(entrynamesyntax: UInt, entryname: PCSTR): RPC_STATUS =
    0

public actual fun RpcNsMgmtEntryCreateW(entrynamesyntax: UInt, entryname: PCWSTR): RPC_STATUS =
    0

public actual fun RpcNsMgmtEntryDeleteA(entrynamesyntax: UInt, entryname: PCSTR): RPC_STATUS =
    0

public actual fun RpcNsMgmtEntryDeleteW(entrynamesyntax: UInt, entryname: PCWSTR): RPC_STATUS =
    0

public actual fun RpcNsMgmtEntryInqIfIdsA(entrynamesyntax: UInt, entryname: PCSTR, ifidvec: Long): RPC_STATUS =
    0

public actual fun RpcNsMgmtEntryInqIfIdsW(entrynamesyntax: UInt, entryname: PCWSTR, ifidvec: Long): RPC_STATUS =
    0

public actual fun RpcNsMgmtHandleSetExpAge(nshandle: Long, expirationage: UInt): RPC_STATUS =
    0

public actual fun RpcNsMgmtInqExpAge(expirationage: Long): RPC_STATUS =
    0

public actual fun RpcNsMgmtSetExpAge(expirationage: UInt): RPC_STATUS =
    0

public actual fun RpcNsProfileDeleteA(profilenamesyntax: UInt, profilename: PCSTR): RPC_STATUS =
    0

public actual fun RpcNsProfileDeleteW(profilenamesyntax: UInt, profilename: PCWSTR): RPC_STATUS =
    0

public actual fun RpcNsProfileEltAddA(profilenamesyntax: UInt, profilename: PCSTR, ifid: Long, membernamesyntax: UInt, membername: PCSTR, priority: UInt, annotation: PCSTR): RPC_STATUS =
    0

public actual fun RpcNsProfileEltAddW(profilenamesyntax: UInt, profilename: PCWSTR, ifid: Long, membernamesyntax: UInt, membername: PCWSTR, priority: UInt, annotation: PCWSTR): RPC_STATUS =
    0

public actual fun RpcNsProfileEltInqBeginA(profilenamesyntax: UInt, profilename: PCSTR, inquirytype: UInt, ifid: Long, versoption: UInt, membernamesyntax: UInt, membername: PCSTR, inquirycontext: Long): RPC_STATUS =
    0

public actual fun RpcNsProfileEltInqBeginW(profilenamesyntax: UInt, profilename: PCWSTR, inquirytype: UInt, ifid: Long, versoption: UInt, membernamesyntax: UInt, membername: PCWSTR, inquirycontext: Long): RPC_STATUS =
    0

public actual fun RpcNsProfileEltInqDone(inquirycontext: Long): RPC_STATUS =
    0

public actual fun RpcNsProfileEltInqNextA(inquirycontext: Long, ifid: Long, membername: Long, priority: Long, annotation: Long): RPC_STATUS =
    0

public actual fun RpcNsProfileEltInqNextW(inquirycontext: Long, ifid: Long, membername: Long, priority: Long, annotation: Long): RPC_STATUS =
    0

public actual fun RpcNsProfileEltRemoveA(profilenamesyntax: UInt, profilename: PCSTR, ifid: Long, membernamesyntax: UInt, membername: PCSTR): RPC_STATUS =
    0

public actual fun RpcNsProfileEltRemoveW(profilenamesyntax: UInt, profilename: PCWSTR, ifid: Long, membernamesyntax: UInt, membername: PCWSTR): RPC_STATUS =
    0

public actual fun RpcObjectInqType(objuuid: Long, typeuuid: Long): RPC_STATUS =
    0

public actual fun RpcObjectSetInqFn(inquiryfn: RPC_OBJECT_INQ_FN): RPC_STATUS =
    0

public actual fun RpcObjectSetType(objuuid: Long, typeuuid: Long): RPC_STATUS =
    0

public actual fun RpcProtseqVectorFreeA(protseqvector: Long): RPC_STATUS =
    0

public actual fun RpcProtseqVectorFreeW(protseqvector: Long): RPC_STATUS =
    0

public actual fun RpcRaiseException(exception: RPC_STATUS) {
}

public actual fun RpcRevertContainerImpersonation(): RPC_STATUS =
    0

public actual fun RpcRevertToSelf(): RPC_STATUS =
    0

public actual fun RpcRevertToSelfEx(bindinghandle: Long): RPC_STATUS =
    0

public actual fun RpcServerCompleteSecurityCallback(bindinghandle: Long, status: RPC_STATUS): RPC_STATUS =
    0

public actual fun RpcServerInqBindingHandle(binding: Long): RPC_STATUS =
    0

public actual fun RpcServerInqBindings(bindingvector: Long): RPC_STATUS =
    0

public actual fun RpcServerInqBindingsEx(securitydescriptor: Long, bindingvector: Long): RPC_STATUS =
    0

public actual fun RpcServerInqCallAttributesA(clientbinding: Long, rpccallattributes: Long): RPC_STATUS =
    0

public actual fun RpcServerInqCallAttributesW(clientbinding: Long, rpccallattributes: Long): RPC_STATUS =
    0

public actual fun RpcServerInqDefaultPrincNameA(authnsvc: UInt, princname: Long): RPC_STATUS =
    0

public actual fun RpcServerInqDefaultPrincNameW(authnsvc: UInt, princname: Long): RPC_STATUS =
    0

public actual fun RpcServerInqIf(ifspec: Long, mgrtypeuuid: Long, mgrepv: Long): RPC_STATUS =
    0

public actual fun RpcServerInterfaceGroupActivate(ifgroup: Long): RPC_STATUS =
    0

public actual fun RpcServerInterfaceGroupClose(ifgroup: Long): RPC_STATUS =
    0

public actual fun RpcServerInterfaceGroupCreateA(interfaces: Long, numifs: UInt, endpoints: Long, numendpoints: UInt, idleperiod: UInt, idlecallbackfn: RPC_INTERFACE_GROUP_IDLE_CALLBACK_FN, idlecallbackcontext: Long, ifgroup: Long): RPC_STATUS =
    0

public actual fun RpcServerInterfaceGroupCreateW(interfaces: Long, numifs: UInt, endpoints: Long, numendpoints: UInt, idleperiod: UInt, idlecallbackfn: RPC_INTERFACE_GROUP_IDLE_CALLBACK_FN, idlecallbackcontext: Long, ifgroup: Long): RPC_STATUS =
    0

public actual fun RpcServerInterfaceGroupDeactivate(ifgroup: Long, forcedeactivation: UInt): RPC_STATUS =
    0

public actual fun RpcServerInterfaceGroupInqBindings(ifgroup: Long, bindingvector: Long): RPC_STATUS =
    0

public actual fun RpcServerListen(minimumcallthreads: UInt, maxcalls: UInt, dontwait: UInt): RPC_STATUS =
    0

public actual fun RpcServerRegisterAuthInfoA(serverprincname: PCSTR, authnsvc: UInt, getkeyfn: RPC_AUTH_KEY_RETRIEVAL_FN, arg: Long): RPC_STATUS =
    0

public actual fun RpcServerRegisterAuthInfoW(serverprincname: PCWSTR, authnsvc: UInt, getkeyfn: RPC_AUTH_KEY_RETRIEVAL_FN, arg: Long): RPC_STATUS =
    0

public actual fun RpcServerRegisterIf(ifspec: Long, mgrtypeuuid: Long, mgrepv: Long): RPC_STATUS =
    0

public actual fun RpcServerRegisterIf2(ifspec: Long, mgrtypeuuid: Long, mgrepv: Long, flags: UInt, maxcalls: UInt, maxrpcsize: UInt, ifcallbackfn: RPC_IF_CALLBACK_FN): RPC_STATUS =
    0

public actual fun RpcServerRegisterIf3(ifspec: Long, mgrtypeuuid: Long, mgrepv: Long, flags: UInt, maxcalls: UInt, maxrpcsize: UInt, ifcallback: RPC_IF_CALLBACK_FN, securitydescriptor: Long): RPC_STATUS =
    0

public actual fun RpcServerRegisterIfEx(ifspec: Long, mgrtypeuuid: Long, mgrepv: Long, flags: UInt, maxcalls: UInt, ifcallback: RPC_IF_CALLBACK_FN): RPC_STATUS =
    0

public actual fun RpcServerSubscribeForNotification(binding: Long, notification: RPC_NOTIFICATIONS, notificationtype: RPC_NOTIFICATION_TYPES, notificationinfo: Long): RPC_STATUS =
    0

public actual fun RpcServerTestCancel(bindinghandle: Long): RPC_STATUS =
    0

public actual fun RpcServerUnregisterIf(ifspec: Long, mgrtypeuuid: Long, waitforcallstocomplete: UInt): RPC_STATUS =
    0

public actual fun RpcServerUnregisterIfEx(ifspec: Long, mgrtypeuuid: Long, rundowncontexthandles: Int): RPC_STATUS =
    0

public actual fun RpcServerUnsubscribeForNotification(binding: Long, notification: RPC_NOTIFICATIONS, notificationsqueued: Long): RPC_STATUS =
    0

public actual fun RpcServerUseAllProtseqs(maxcalls: UInt, securitydescriptor: Long): RPC_STATUS =
    0

public actual fun RpcServerUseAllProtseqsEx(maxcalls: UInt, securitydescriptor: Long, policy: Long): RPC_STATUS =
    0

public actual fun RpcServerUseAllProtseqsIf(maxcalls: UInt, ifspec: Long, securitydescriptor: Long): RPC_STATUS =
    0

public actual fun RpcServerUseAllProtseqsIfEx(maxcalls: UInt, ifspec: Long, securitydescriptor: Long, policy: Long): RPC_STATUS =
    0

public actual fun RpcServerUseProtseqA(protseq: PCSTR, maxcalls: UInt, securitydescriptor: Long): RPC_STATUS =
    0

public actual fun RpcServerUseProtseqEpA(protseq: PCSTR, maxcalls: UInt, endpoint: PCSTR, securitydescriptor: Long): RPC_STATUS =
    0

public actual fun RpcServerUseProtseqEpExA(protseq: PCSTR, maxcalls: UInt, endpoint: PCSTR, securitydescriptor: Long, policy: Long): RPC_STATUS =
    0

public actual fun RpcServerUseProtseqEpExW(protseq: PCWSTR, maxcalls: UInt, endpoint: PCWSTR, securitydescriptor: Long, policy: Long): RPC_STATUS =
    0

public actual fun RpcServerUseProtseqEpW(protseq: PCWSTR, maxcalls: UInt, endpoint: PCWSTR, securitydescriptor: Long): RPC_STATUS =
    0

public actual fun RpcServerUseProtseqExA(protseq: PCSTR, maxcalls: UInt, securitydescriptor: Long, policy: Long): RPC_STATUS =
    0

public actual fun RpcServerUseProtseqExW(protseq: PCWSTR, maxcalls: UInt, securitydescriptor: Long, policy: Long): RPC_STATUS =
    0

public actual fun RpcServerUseProtseqIfA(protseq: PCSTR, maxcalls: UInt, ifspec: Long, securitydescriptor: Long): RPC_STATUS =
    0

public actual fun RpcServerUseProtseqIfExA(protseq: PCSTR, maxcalls: UInt, ifspec: Long, securitydescriptor: Long, policy: Long): RPC_STATUS =
    0

public actual fun RpcServerUseProtseqIfExW(protseq: PCWSTR, maxcalls: UInt, ifspec: Long, securitydescriptor: Long, policy: Long): RPC_STATUS =
    0

public actual fun RpcServerUseProtseqIfW(protseq: PCWSTR, maxcalls: UInt, ifspec: Long, securitydescriptor: Long): RPC_STATUS =
    0

public actual fun RpcServerUseProtseqW(protseq: PCWSTR, maxcalls: UInt, securitydescriptor: Long): RPC_STATUS =
    0

public actual fun RpcServerYield() {
}

public actual fun RpcSmAllocate(size: ULong, pstatus: Long): Long =
    0L

public actual fun RpcSmClientFree(pnodetofree: Long): RPC_STATUS =
    0

public actual fun RpcSmDestroyClientContext(contexthandle: Long): RPC_STATUS =
    0

public actual fun RpcSmDisableAllocate(): RPC_STATUS =
    0

public actual fun RpcSmEnableAllocate(): RPC_STATUS =
    0

public actual fun RpcSmFree(nodetofree: Long): RPC_STATUS =
    0

public actual fun RpcSmGetThreadHandle(pstatus: Long): Long =
    0L

public actual fun RpcSmSetClientAllocFree(clientalloc: RPC_CLIENT_ALLOC, clientfree: RPC_CLIENT_FREE): RPC_STATUS =
    0

public actual fun RpcSmSetThreadHandle(id: Long): RPC_STATUS =
    0

public actual fun RpcSmSwapClientAllocFree(clientalloc: RPC_CLIENT_ALLOC, clientfree: RPC_CLIENT_FREE, oldclientalloc: Long, oldclientfree: Long): RPC_STATUS =
    0

public actual fun RpcSsAllocate(size: ULong): Long =
    0L

public actual fun RpcSsContextLockExclusive(serverbindinghandle: Long, usercontext: Long): RPC_STATUS =
    0

public actual fun RpcSsContextLockShared(serverbindinghandle: Long, usercontext: Long): RPC_STATUS =
    0

public actual fun RpcSsDestroyClientContext(contexthandle: Long) {
}

public actual fun RpcSsDisableAllocate() {
}

public actual fun RpcSsDontSerializeContext() {
}

public actual fun RpcSsEnableAllocate() {
}

public actual fun RpcSsFree(nodetofree: Long) {
}

public actual fun RpcSsGetContextBinding(contexthandle: Long, binding: Long): RPC_STATUS =
    0

public actual fun RpcSsGetThreadHandle(): Long =
    0L

public actual fun RpcSsSetClientAllocFree(clientalloc: RPC_CLIENT_ALLOC, clientfree: RPC_CLIENT_FREE) {
}

public actual fun RpcSsSetThreadHandle(id: Long) {
}

public actual fun RpcSsSwapClientAllocFree(clientalloc: RPC_CLIENT_ALLOC, clientfree: RPC_CLIENT_FREE, oldclientalloc: Long, oldclientfree: Long) {
}

public actual fun RpcStringBindingComposeA(objuuid: PCSTR, protseq: PCSTR, networkaddr: PCSTR, endpoint: PCSTR, options: PCSTR, stringbinding: Long): RPC_STATUS =
    0

public actual fun RpcStringBindingComposeW(objuuid: PCWSTR, protseq: PCWSTR, networkaddr: PCWSTR, endpoint: PCWSTR, options: PCWSTR, stringbinding: Long): RPC_STATUS =
    0

public actual fun RpcStringBindingParseA(stringbinding: PCSTR, objuuid: Long, protseq: Long, networkaddr: Long, endpoint: Long, networkoptions: Long): RPC_STATUS =
    0

public actual fun RpcStringBindingParseW(stringbinding: PCWSTR, objuuid: Long, protseq: Long, networkaddr: Long, endpoint: Long, networkoptions: Long): RPC_STATUS =
    0

public actual fun RpcStringFreeA(string: Long): RPC_STATUS =
    0

public actual fun RpcStringFreeW(string: Long): RPC_STATUS =
    0

public actual fun RpcTestCancel(): RPC_STATUS =
    0

public actual fun RpcUserFree(asynchandle: Long, pbuffer: Long) {
}

public actual fun UuidCompare(uuid1: Long, uuid2: Long, status: Long): Int =
    0

public actual fun UuidCreate(uuid: Long): RPC_STATUS =
    0

public actual fun UuidCreateNil(niluuid: Long): RPC_STATUS =
    0

public actual fun UuidCreateSequential(uuid: Long): RPC_STATUS =
    0

public actual fun UuidEqual(uuid1: Long, uuid2: Long, status: Long): Int =
    0

public actual fun UuidFromStringA(stringuuid: PCSTR, uuid: Long): RPC_STATUS =
    0

public actual fun UuidFromStringW(stringuuid: PCWSTR, uuid: Long): RPC_STATUS =
    0

public actual fun UuidHash(uuid: Long, status: Long): UShort =
    0u

public actual fun UuidIsNil(uuid: Long, status: Long): Int =
    0

public actual fun UuidToStringA(uuid: Long, stringuuid: Long): RPC_STATUS =
    0

public actual fun UuidToStringW(uuid: Long, stringuuid: Long): RPC_STATUS =
    0
