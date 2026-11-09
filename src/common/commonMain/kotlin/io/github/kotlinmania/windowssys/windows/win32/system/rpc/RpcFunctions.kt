package io.github.kotlinmania.windowssys.windows.win32.system.rpc

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.LUID

public expect fun DceErrorInqTextA(rpcstatus: RPC_STATUS, errortext: PSTR): RPC_STATUS

public expect fun DceErrorInqTextW(rpcstatus: RPC_STATUS, errortext: PWSTR): RPC_STATUS

public expect fun IUnknown_AddRef_Proxy(thisRef: Long): UInt

public expect fun IUnknown_QueryInterface_Proxy(thisRef: Long, riid: Long, ppvobject: Long): HRESULT

public expect fun IUnknown_Release_Proxy(thisRef: Long): UInt

public expect fun I_RpcAllocate(size: UInt): Long

public expect fun I_RpcAsyncAbortCall(pasync: Long, exceptioncode: UInt): RPC_STATUS

public expect fun I_RpcAsyncSetHandle(message: Long, pasync: Long): RPC_STATUS

public expect fun I_RpcBindingCopy(sourcebinding: Long, destinationbinding: Long): RPC_STATUS

public expect fun I_RpcBindingCreateNP(servername: PCWSTR, servicename: PCWSTR, networkoptions: PCWSTR, binding: Long): RPC_STATUS

public expect fun I_RpcBindingHandleToAsyncHandle(binding: Long, asynchandle: Long): RPC_STATUS

public expect fun I_RpcBindingInqClientTokenAttributes(binding: Long, tokenid: Long, authenticationid: Long, modifiedid: Long): RPC_STATUS

public expect fun I_RpcBindingInqDynamicEndpointA(binding: Long, dynamicendpoint: Long): RPC_STATUS

public expect fun I_RpcBindingInqDynamicEndpointW(binding: Long, dynamicendpoint: Long): RPC_STATUS

public expect fun I_RpcBindingInqLocalClientPID(binding: Long, pid: Long): RPC_STATUS

public expect fun I_RpcBindingInqMarshalledTargetInfo(binding: Long, marshalledtargetinfosize: Long, marshalledtargetinfo: Long): RPC_STATUS

public expect fun I_RpcBindingInqSecurityContext(binding: Long, securitycontexthandle: Long): RPC_STATUS

public expect fun I_RpcBindingInqSecurityContextKeyInfo(binding: Long, keyinfo: Long): RPC_STATUS

public expect fun I_RpcBindingInqTransportType(binding: Long, type: Long): RPC_STATUS

public expect fun I_RpcBindingInqWireIdForSnego(binding: Long, wireid: Long): RPC_STATUS

public expect fun I_RpcBindingIsClientLocal(bindinghandle: Long, clientlocalflag: Long): RPC_STATUS

public expect fun I_RpcBindingIsServerLocal(binding: Long, serverlocalflag: Long): RPC_STATUS

public expect fun I_RpcBindingSetPrivateOption(hbinding: Long, option: UInt, optionvalue: ULong): RPC_STATUS

public expect fun I_RpcBindingToStaticStringBindingW(binding: Long, stringbinding: Long): RPC_STATUS

public expect fun I_RpcClearMutex(mutex: Long)

public expect fun I_RpcDeleteMutex(mutex: Long)

public expect fun I_RpcExceptionFilter(exceptioncode: UInt): Int

public expect fun I_RpcFree(obj: Long)

public expect fun I_RpcFreeBuffer(message: Long): RPC_STATUS

public expect fun I_RpcFreePipeBuffer(message: Long): RPC_STATUS

public expect fun I_RpcGetBuffer(message: Long): RPC_STATUS

public expect fun I_RpcGetBufferWithObject(message: Long, objectuuid: Long): RPC_STATUS

public expect fun I_RpcGetCurrentCallHandle(): Long

public expect fun I_RpcGetDefaultSD(ppsecuritydescriptor: Long): RPC_STATUS

public expect fun I_RpcGetExtendedError(): RPC_STATUS

public expect fun I_RpcIfInqTransferSyntaxes(rpcifhandle: Long, transfersyntaxes: Long, transfersyntaxsize: UInt, transfersyntaxcount: Long): RPC_STATUS

public expect fun I_RpcMapWin32Status(status: RPC_STATUS): Int

public expect fun I_RpcMgmtEnableDedicatedThreadPool(): RPC_STATUS

public expect fun I_RpcNegotiateTransferSyntax(message: Long): RPC_STATUS

public expect fun I_RpcNsBindingSetEntryNameA(binding: Long, entrynamesyntax: UInt, entryname: PCSTR): RPC_STATUS

public expect fun I_RpcNsBindingSetEntryNameW(binding: Long, entrynamesyntax: UInt, entryname: PCWSTR): RPC_STATUS

public expect fun I_RpcNsGetBuffer(message: Long): RPC_STATUS

public expect fun I_RpcNsInterfaceExported(entrynamesyntax: UInt, entryname: Long, rpcinterfaceinformation: Long): RPC_STATUS

public expect fun I_RpcNsInterfaceUnexported(entrynamesyntax: UInt, entryname: Long, rpcinterfaceinformation: Long): RPC_STATUS

public expect fun I_RpcNsRaiseException(message: Long, status: RPC_STATUS)

public expect fun I_RpcNsSendReceive(message: Long, handle: Long): RPC_STATUS

public expect fun I_RpcOpenClientProcess(binding: Long, desiredaccess: UInt, clientprocess: Long): RPC_STATUS

public expect fun I_RpcPauseExecution(milliseconds: UInt)

public expect fun I_RpcReBindBuffer(message: Long): RPC_STATUS

public expect fun I_RpcReallocPipeBuffer(message: Long, newsize: UInt): RPC_STATUS

public expect fun I_RpcReceive(message: Long, size: UInt): RPC_STATUS

public expect fun I_RpcRecordCalloutFailure(rpcstatus: RPC_STATUS, calloutstate: Long, dllname: Long)

public expect fun I_RpcRequestMutex(mutex: Long)

public expect fun I_RpcSend(message: Long): RPC_STATUS

public expect fun I_RpcSendReceive(message: Long): RPC_STATUS

public expect fun I_RpcServerCheckClientRestriction(context: Long): RPC_STATUS

public expect fun I_RpcServerDisableExceptionFilter(): Int

public expect fun I_RpcServerGetAssociationID(binding: Long, associationid: Long): RPC_STATUS

public expect fun I_RpcServerInqAddressChangeFn(): Long

public expect fun I_RpcServerInqLocalConnAddress(binding: Long, buffer: Long, buffersize: Long, addressformat: Long): RPC_STATUS

public expect fun I_RpcServerInqRemoteConnAddress(binding: Long, buffer: Long, buffersize: Long, addressformat: Long): RPC_STATUS

public expect fun I_RpcServerInqTransportType(type: Long): RPC_STATUS

public expect fun I_RpcServerRegisterForwardFunction(pforwardfunction: Long): RPC_STATUS

public expect fun I_RpcServerSetAddressChangeFn(paddresschangefn: Long): RPC_STATUS

public expect fun I_RpcServerStartService(protseq: PCWSTR, endpoint: PCWSTR, ifspec: Long): RPC_STATUS

public expect fun I_RpcServerSubscribeForDisconnectNotification(binding: Long, hevent: Long): RPC_STATUS

public expect fun I_RpcServerSubscribeForDisconnectNotification2(binding: Long, hevent: Long, subscriptionid: Long): RPC_STATUS

public expect fun I_RpcServerUnsubscribeForDisconnectNotification(binding: Long, subscriptionid: GUID): RPC_STATUS

public expect fun I_RpcServerUseProtseq2A(networkaddress: PCSTR, protseq: PCSTR, maxcalls: UInt, securitydescriptor: Long, policy: Long): RPC_STATUS

public expect fun I_RpcServerUseProtseq2W(networkaddress: PCWSTR, protseq: PCWSTR, maxcalls: UInt, securitydescriptor: Long, policy: Long): RPC_STATUS

public expect fun I_RpcServerUseProtseqEp2A(networkaddress: PCSTR, protseq: PCSTR, maxcalls: UInt, endpoint: PCSTR, securitydescriptor: Long, policy: Long): RPC_STATUS

public expect fun I_RpcServerUseProtseqEp2W(networkaddress: PCWSTR, protseq: PCWSTR, maxcalls: UInt, endpoint: PCWSTR, securitydescriptor: Long, policy: Long): RPC_STATUS

public expect fun I_RpcSessionStrictContextHandle()

public expect fun I_RpcSsDontSerializeContext()

public expect fun I_RpcSystemHandleTypeSpecificWork(handle: Long, actualtype: UByte, idltype: UByte, marshaldirection: LRPC_SYSTEM_HANDLE_MARSHAL_DIRECTION): RPC_STATUS

public expect fun I_RpcTurnOnEEInfoPropagation(): RPC_STATUS

public expect fun I_UuidCreate(uuid: Long): RPC_STATUS

public expect fun MesBufferHandleReset(handle: Long, handlestyle: UInt, operation: MIDL_ES_CODE, pbuffer: Long, buffersize: UInt, pencodedsize: Long): RPC_STATUS

public expect fun MesDecodeBufferHandleCreate(buffer: PCSTR, buffersize: UInt, phandle: Long): RPC_STATUS

public expect fun MesDecodeIncrementalHandleCreate(userstate: Long, readfn: MIDL_ES_READ, phandle: Long): RPC_STATUS

public expect fun MesEncodeDynBufferHandleCreate(pbuffer: Long, pencodedsize: Long, phandle: Long): RPC_STATUS

public expect fun MesEncodeFixedBufferHandleCreate(pbuffer: PSTR, buffersize: UInt, pencodedsize: Long, phandle: Long): RPC_STATUS

public expect fun MesEncodeIncrementalHandleCreate(userstate: Long, allocfn: MIDL_ES_ALLOC, writefn: MIDL_ES_WRITE, phandle: Long): RPC_STATUS

public expect fun MesHandleFree(handle: Long): RPC_STATUS

public expect fun MesIncrementalHandleReset(handle: Long, userstate: Long, allocfn: MIDL_ES_ALLOC, writefn: MIDL_ES_WRITE, readfn: MIDL_ES_READ, operation: MIDL_ES_CODE): RPC_STATUS

public expect fun MesInqProcEncodingId(handle: Long, pinterfaceid: Long, pprocnum: Long): RPC_STATUS

public expect fun NDRCContextBinding(ccontext: Long): Long

public expect fun NDRCContextMarshall(ccontext: Long, pbuff: Long)

public expect fun NDRCContextUnmarshall(pccontext: Long, hbinding: Long, pbuff: Long, datarepresentation: UInt)

public expect fun NDRSContextMarshall(ccontext: Long, pbuff: Long, userrundownin: NDR_RUNDOWN)

public expect fun NDRSContextMarshall2(bindinghandle: Long, ccontext: Long, pbuff: Long, userrundownin: NDR_RUNDOWN, ctxguard: Long, flags: UInt)

public expect fun NDRSContextMarshallEx(bindinghandle: Long, ccontext: Long, pbuff: Long, userrundownin: NDR_RUNDOWN)

public expect fun NDRSContextUnmarshall(pbuff: Long, datarepresentation: UInt): Long

public expect fun NDRSContextUnmarshall2(bindinghandle: Long, pbuff: Long, datarepresentation: UInt, ctxguard: Long, flags: UInt): Long

public expect fun NDRSContextUnmarshallEx(bindinghandle: Long, pbuff: Long, datarepresentation: UInt): Long

public expect fun Ndr64AsyncClientCall(pproxyinfo: Long, nprocnum: UInt, preturnvalue: Long, vararg variadicArgs: Long): CLIENT_CALL_RETURN

public expect fun Ndr64AsyncServerCall64(prpcmsg: Long)

public expect fun Ndr64AsyncServerCallAll(prpcmsg: Long)

public expect fun Ndr64DcomAsyncClientCall(pproxyinfo: Long, nprocnum: UInt, preturnvalue: Long, vararg variadicArgs: Long): CLIENT_CALL_RETURN

public expect fun Ndr64DcomAsyncStubCall(pthis: Long, pchannel: Long, prpcmsg: Long, pdwstubphase: Long): Int

public expect fun NdrAllocate(pstubmsg: Long, len: ULong): Long

public expect fun NdrAsyncClientCall(pstubdescriptor: Long, pformat: Long, vararg variadicArgs: Long): CLIENT_CALL_RETURN

public expect fun NdrAsyncServerCall(prpcmsg: Long)

public expect fun NdrByteCountPointerBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

public expect fun NdrByteCountPointerFree(pstubmsg: Long, pmemory: Long, pformat: Long)

public expect fun NdrByteCountPointerMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

public expect fun NdrByteCountPointerUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long

public expect fun NdrClearOutParameters(pstubmsg: Long, pformat: Long, argaddr: Long)

public expect fun NdrClientCall2(pstubdescriptor: Long, pformat: Long, vararg variadicArgs: Long): CLIENT_CALL_RETURN

public expect fun NdrClientCall3(pproxyinfo: Long, nprocnum: UInt, preturnvalue: Long, vararg variadicArgs: Long): CLIENT_CALL_RETURN

public expect fun NdrClientContextMarshall(pstubmsg: Long, contexthandle: Long, fcheck: Int)

public expect fun NdrClientContextUnmarshall(pstubmsg: Long, pcontexthandle: Long, bindhandle: Long)

public expect fun NdrClientInitialize(prpcmsg: Long, pstubmsg: Long, pstubdescriptor: Long, procnum: UInt)

public expect fun NdrClientInitializeNew(prpcmsg: Long, pstubmsg: Long, pstubdescriptor: Long, procnum: UInt)

public expect fun NdrComplexArrayBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

public expect fun NdrComplexArrayFree(pstubmsg: Long, pmemory: Long, pformat: Long)

public expect fun NdrComplexArrayMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

public expect fun NdrComplexArrayMemorySize(pstubmsg: Long, pformat: Long): UInt

public expect fun NdrComplexArrayUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long

public expect fun NdrComplexStructBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

public expect fun NdrComplexStructFree(pstubmsg: Long, pmemory: Long, pformat: Long)

public expect fun NdrComplexStructMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

public expect fun NdrComplexStructMemorySize(pstubmsg: Long, pformat: Long): UInt

public expect fun NdrComplexStructUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long

public expect fun NdrConformantArrayBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

public expect fun NdrConformantArrayFree(pstubmsg: Long, pmemory: Long, pformat: Long)

public expect fun NdrConformantArrayMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

public expect fun NdrConformantArrayMemorySize(pstubmsg: Long, pformat: Long): UInt

public expect fun NdrConformantArrayUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long

public expect fun NdrConformantStringBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

public expect fun NdrConformantStringMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

public expect fun NdrConformantStringMemorySize(pstubmsg: Long, pformat: Long): UInt

public expect fun NdrConformantStringUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long

public expect fun NdrConformantStructBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

public expect fun NdrConformantStructFree(pstubmsg: Long, pmemory: Long, pformat: Long)

public expect fun NdrConformantStructMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

public expect fun NdrConformantStructMemorySize(pstubmsg: Long, pformat: Long): UInt

public expect fun NdrConformantStructUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long

public expect fun NdrConformantVaryingArrayBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

public expect fun NdrConformantVaryingArrayFree(pstubmsg: Long, pmemory: Long, pformat: Long)

public expect fun NdrConformantVaryingArrayMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

public expect fun NdrConformantVaryingArrayMemorySize(pstubmsg: Long, pformat: Long): UInt

public expect fun NdrConformantVaryingArrayUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long

public expect fun NdrConformantVaryingStructBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

public expect fun NdrConformantVaryingStructFree(pstubmsg: Long, pmemory: Long, pformat: Long)

public expect fun NdrConformantVaryingStructMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

public expect fun NdrConformantVaryingStructMemorySize(pstubmsg: Long, pformat: Long): UInt

public expect fun NdrConformantVaryingStructUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long

public expect fun NdrContextHandleInitialize(pstubmsg: Long, pformat: Long): Long

public expect fun NdrContextHandleSize(pstubmsg: Long, pmemory: Long, pformat: Long)

public expect fun NdrConvert(pstubmsg: Long, pformat: Long)

public expect fun NdrConvert2(pstubmsg: Long, pformat: Long, numberparams: Int)

public expect fun NdrCorrelationFree(pstubmsg: Long)

public expect fun NdrCorrelationInitialize(pstubmsg: Long, pmemory: Long, cachesize: UInt, flags: UInt)

public expect fun NdrCorrelationPass(pstubmsg: Long)

public expect fun NdrCreateServerInterfaceFromStub(pstub: Long, pserverif: Long): RPC_STATUS

public expect fun NdrDcomAsyncClientCall(pstubdescriptor: Long, pformat: Long, vararg variadicArgs: Long): CLIENT_CALL_RETURN

public expect fun NdrDcomAsyncStubCall(pthis: Long, pchannel: Long, prpcmsg: Long, pdwstubphase: Long): Int

public expect fun NdrEncapsulatedUnionBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

public expect fun NdrEncapsulatedUnionFree(pstubmsg: Long, pmemory: Long, pformat: Long)

public expect fun NdrEncapsulatedUnionMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

public expect fun NdrEncapsulatedUnionMemorySize(pstubmsg: Long, pformat: Long): UInt

public expect fun NdrEncapsulatedUnionUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long

public expect fun NdrFixedArrayBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

public expect fun NdrFixedArrayFree(pstubmsg: Long, pmemory: Long, pformat: Long)

public expect fun NdrFixedArrayMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

public expect fun NdrFixedArrayMemorySize(pstubmsg: Long, pformat: Long): UInt

public expect fun NdrFixedArrayUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long

public expect fun NdrFreeBuffer(pstubmsg: Long)

public expect fun NdrFullPointerXlatFree(pxlattables: Long)

public expect fun NdrFullPointerXlatInit(numberofpointers: UInt, xlatside: XLAT_SIDE): Long

public expect fun NdrGetBuffer(pstubmsg: Long, bufferlength: UInt, handle: Long): Long

public expect fun NdrGetDcomProtocolVersion(pstubmsg: Long, pversion: Long): HRESULT

public expect fun NdrGetUserMarshalInfo(pflags: Long, informationlevel: UInt, pmarshalinfo: Long): RPC_STATUS

public expect fun NdrInterfacePointerBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

public expect fun NdrInterfacePointerFree(pstubmsg: Long, pmemory: Long, pformat: Long)

public expect fun NdrInterfacePointerMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

public expect fun NdrInterfacePointerMemorySize(pstubmsg: Long, pformat: Long): UInt

public expect fun NdrInterfacePointerUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long

public expect fun NdrMapCommAndFaultStatus(pstubmsg: Long, pcommstatus: Long, pfaultstatus: Long, status: RPC_STATUS): RPC_STATUS

public expect fun NdrMesProcEncodeDecode(handle: Long, pstubdesc: Long, pformatstring: Long, vararg variadicArgs: Long)

public expect fun NdrMesProcEncodeDecode2(handle: Long, pstubdesc: Long, pformatstring: Long, vararg variadicArgs: Long): CLIENT_CALL_RETURN

public expect fun NdrMesProcEncodeDecode3(handle: Long, pproxyinfo: Long, nprocnum: UInt, preturnvalue: Long, vararg variadicArgs: Long): CLIENT_CALL_RETURN

public expect fun NdrMesSimpleTypeAlignSize(param0: Long): ULong

public expect fun NdrMesSimpleTypeAlignSizeAll(handle: Long, pproxyinfo: Long): ULong

public expect fun NdrMesSimpleTypeDecode(handle: Long, pobject: Long, size: Short)

public expect fun NdrMesSimpleTypeDecodeAll(handle: Long, pproxyinfo: Long, pobject: Long, size: Short)

public expect fun NdrMesSimpleTypeEncode(handle: Long, pstubdesc: Long, pobject: Long, size: Short)

public expect fun NdrMesSimpleTypeEncodeAll(handle: Long, pproxyinfo: Long, pobject: Long, size: Short)

public expect fun NdrMesTypeAlignSize(handle: Long, pstubdesc: Long, pformatstring: Long, pobject: Long): ULong

public expect fun NdrMesTypeAlignSize2(handle: Long, ppicklinginfo: Long, pstubdesc: Long, pformatstring: Long, pobject: Long): ULong

public expect fun NdrMesTypeAlignSize3(handle: Long, ppicklinginfo: Long, pproxyinfo: Long, arrtypeoffset: Long, ntypeindex: UInt, pobject: Long): ULong

public expect fun NdrMesTypeDecode(handle: Long, pstubdesc: Long, pformatstring: Long, pobject: Long)

public expect fun NdrMesTypeDecode2(handle: Long, ppicklinginfo: Long, pstubdesc: Long, pformatstring: Long, pobject: Long)

public expect fun NdrMesTypeDecode3(handle: Long, ppicklinginfo: Long, pproxyinfo: Long, arrtypeoffset: Long, ntypeindex: UInt, pobject: Long)

public expect fun NdrMesTypeEncode(handle: Long, pstubdesc: Long, pformatstring: Long, pobject: Long)

public expect fun NdrMesTypeEncode2(handle: Long, ppicklinginfo: Long, pstubdesc: Long, pformatstring: Long, pobject: Long)

public expect fun NdrMesTypeEncode3(handle: Long, ppicklinginfo: Long, pproxyinfo: Long, arrtypeoffset: Long, ntypeindex: UInt, pobject: Long)

public expect fun NdrMesTypeFree2(handle: Long, ppicklinginfo: Long, pstubdesc: Long, pformatstring: Long, pobject: Long)

public expect fun NdrMesTypeFree3(handle: Long, ppicklinginfo: Long, pproxyinfo: Long, arrtypeoffset: Long, ntypeindex: UInt, pobject: Long)

public expect fun NdrNonConformantStringBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

public expect fun NdrNonConformantStringMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

public expect fun NdrNonConformantStringMemorySize(pstubmsg: Long, pformat: Long): UInt

public expect fun NdrNonConformantStringUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long

public expect fun NdrNonEncapsulatedUnionBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

public expect fun NdrNonEncapsulatedUnionFree(pstubmsg: Long, pmemory: Long, pformat: Long)

public expect fun NdrNonEncapsulatedUnionMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

public expect fun NdrNonEncapsulatedUnionMemorySize(pstubmsg: Long, pformat: Long): UInt

public expect fun NdrNonEncapsulatedUnionUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long

public expect fun NdrNsGetBuffer(pstubmsg: Long, bufferlength: UInt, handle: Long): Long

public expect fun NdrNsSendReceive(pstubmsg: Long, pbufferend: Long, pautohandle: Long): Long

public expect fun NdrOleAllocate(size: ULong): Long

public expect fun NdrOleFree(nodetofree: Long)

public expect fun NdrPartialIgnoreClientBufferSize(pstubmsg: Long, pmemory: Long)

public expect fun NdrPartialIgnoreClientMarshall(pstubmsg: Long, pmemory: Long)

public expect fun NdrPartialIgnoreServerInitialize(pstubmsg: Long, ppmemory: Long, pformat: Long)

public expect fun NdrPartialIgnoreServerUnmarshall(pstubmsg: Long, ppmemory: Long)

public expect fun NdrPointerBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

public expect fun NdrPointerFree(pstubmsg: Long, pmemory: Long, pformat: Long)

public expect fun NdrPointerMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

public expect fun NdrPointerMemorySize(pstubmsg: Long, pformat: Long): UInt

public expect fun NdrPointerUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long

public expect fun NdrRangeUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long

public expect fun NdrRpcSmClientAllocate(size: ULong): Long

public expect fun NdrRpcSmClientFree(nodetofree: Long)

public expect fun NdrRpcSmSetClientToOsf(pmessage: Long)

public expect fun NdrRpcSsDefaultAllocate(size: ULong): Long

public expect fun NdrRpcSsDefaultFree(nodetofree: Long)

public expect fun NdrRpcSsDisableAllocate(pmessage: Long)

public expect fun NdrRpcSsEnableAllocate(pmessage: Long)

public expect fun NdrSendReceive(pstubmsg: Long, pbufferend: Long): Long

public expect fun NdrServerCall2(prpcmsg: Long)

public expect fun NdrServerCallAll(prpcmsg: Long)

public expect fun NdrServerCallNdr64(prpcmsg: Long)

public expect fun NdrServerContextMarshall(pstubmsg: Long, contexthandle: Long, rundownroutine: NDR_RUNDOWN)

public expect fun NdrServerContextNewMarshall(pstubmsg: Long, contexthandle: Long, rundownroutine: NDR_RUNDOWN, pformat: Long)

public expect fun NdrServerContextNewUnmarshall(pstubmsg: Long, pformat: Long): Long

public expect fun NdrServerContextUnmarshall(pstubmsg: Long): Long

public expect fun NdrServerInitialize(prpcmsg: Long, pstubmsg: Long, pstubdescriptor: Long): Long

public expect fun NdrServerInitializeMarshall(prpcmsg: Long, pstubmsg: Long)

public expect fun NdrServerInitializeNew(prpcmsg: Long, pstubmsg: Long, pstubdescriptor: Long): Long

public expect fun NdrServerInitializePartial(prpcmsg: Long, pstubmsg: Long, pstubdescriptor: Long, requestedbuffersize: UInt)

public expect fun NdrServerInitializeUnmarshall(pstubmsg: Long, pstubdescriptor: Long, prpcmsg: Long): Long

public expect fun NdrSimpleStructBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

public expect fun NdrSimpleStructFree(pstubmsg: Long, pmemory: Long, pformat: Long)

public expect fun NdrSimpleStructMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

public expect fun NdrSimpleStructMemorySize(pstubmsg: Long, pformat: Long): UInt

public expect fun NdrSimpleStructUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long

public expect fun NdrSimpleTypeMarshall(pstubmsg: Long, pmemory: Long, formatchar: UByte)

public expect fun NdrSimpleTypeUnmarshall(pstubmsg: Long, pmemory: Long, formatchar: UByte)

public expect fun NdrStubCall2(pthis: Long, pchannel: Long, prpcmsg: Long, pdwstubphase: Long): Int

public expect fun NdrStubCall3(pthis: Long, pchannel: Long, prpcmsg: Long, pdwstubphase: Long): Int

public expect fun NdrUserMarshalBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

public expect fun NdrUserMarshalFree(pstubmsg: Long, pmemory: Long, pformat: Long)

public expect fun NdrUserMarshalMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

public expect fun NdrUserMarshalMemorySize(pstubmsg: Long, pformat: Long): UInt

public expect fun NdrUserMarshalSimpleTypeConvert(pflags: Long, pbuffer: Long, formatchar: UByte): Long

public expect fun NdrUserMarshalUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long

public expect fun NdrVaryingArrayBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

public expect fun NdrVaryingArrayFree(pstubmsg: Long, pmemory: Long, pformat: Long)

public expect fun NdrVaryingArrayMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

public expect fun NdrVaryingArrayMemorySize(pstubmsg: Long, pformat: Long): UInt

public expect fun NdrVaryingArrayUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long

public expect fun NdrXmitOrRepAsBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long)

public expect fun NdrXmitOrRepAsFree(pstubmsg: Long, pmemory: Long, pformat: Long)

public expect fun NdrXmitOrRepAsMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long

public expect fun NdrXmitOrRepAsMemorySize(pstubmsg: Long, pformat: Long): UInt

public expect fun NdrXmitOrRepAsUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long

public expect fun RpcAsyncAbortCall(pasync: Long, exceptioncode: UInt): RPC_STATUS

public expect fun RpcAsyncCancelCall(pasync: Long, fabort: BOOL): RPC_STATUS

public expect fun RpcAsyncCompleteCall(pasync: Long, reply: Long): RPC_STATUS

public expect fun RpcAsyncGetCallStatus(pasync: Long): RPC_STATUS

public expect fun RpcAsyncInitializeHandle(pasync: Long, size: UInt): RPC_STATUS

public expect fun RpcAsyncRegisterInfo(pasync: Long): RPC_STATUS

public expect fun RpcBindingBind(pasync: Long, binding: Long, ifspec: Long): RPC_STATUS

public expect fun RpcBindingCopy(sourcebinding: Long, destinationbinding: Long): RPC_STATUS

public expect fun RpcBindingCreateA(template: Long, security: Long, options: Long, binding: Long): RPC_STATUS

public expect fun RpcBindingCreateW(template: Long, security: Long, options: Long, binding: Long): RPC_STATUS

public expect fun RpcBindingFree(binding: Long): RPC_STATUS

public expect fun RpcBindingFromStringBindingA(stringbinding: PCSTR, binding: Long): RPC_STATUS

public expect fun RpcBindingFromStringBindingW(stringbinding: PCWSTR, binding: Long): RPC_STATUS

public expect fun RpcBindingInqAuthClientA(clientbinding: Long, privs: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authzsvc: Long): RPC_STATUS

public expect fun RpcBindingInqAuthClientExA(clientbinding: Long, privs: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authzsvc: Long, flags: UInt): RPC_STATUS

public expect fun RpcBindingInqAuthClientExW(clientbinding: Long, privs: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authzsvc: Long, flags: UInt): RPC_STATUS

public expect fun RpcBindingInqAuthClientW(clientbinding: Long, privs: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authzsvc: Long): RPC_STATUS

public expect fun RpcBindingInqAuthInfoA(binding: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authidentity: Long, authzsvc: Long): RPC_STATUS

public expect fun RpcBindingInqAuthInfoExA(binding: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authidentity: Long, authzsvc: Long, rpcqosversion: UInt, securityqos: Long): RPC_STATUS

public expect fun RpcBindingInqAuthInfoExW(binding: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authidentity: Long, authzsvc: Long, rpcqosversion: UInt, securityqos: Long): RPC_STATUS

public expect fun RpcBindingInqAuthInfoW(binding: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authidentity: Long, authzsvc: Long): RPC_STATUS

public expect fun RpcBindingInqMaxCalls(binding: Long, maxcalls: Long): RPC_STATUS

public expect fun RpcBindingInqObject(binding: Long, objectuuid: Long): RPC_STATUS

public expect fun RpcBindingInqOption(hbinding: Long, option: UInt, poptionvalue: Long): RPC_STATUS

public expect fun RpcBindingReset(binding: Long): RPC_STATUS

public expect fun RpcBindingServerFromClient(clientbinding: Long, serverbinding: Long): RPC_STATUS

public expect fun RpcBindingSetAuthInfoA(binding: Long, serverprincname: PCSTR, authnlevel: UInt, authnsvc: UInt, authidentity: Long, authzsvc: UInt): RPC_STATUS

public expect fun RpcBindingSetAuthInfoExA(binding: Long, serverprincname: PCSTR, authnlevel: UInt, authnsvc: UInt, authidentity: Long, authzsvc: UInt, securityqos: Long): RPC_STATUS

public expect fun RpcBindingSetAuthInfoExW(binding: Long, serverprincname: PCWSTR, authnlevel: UInt, authnsvc: UInt, authidentity: Long, authzsvc: UInt, securityqos: Long): RPC_STATUS

public expect fun RpcBindingSetAuthInfoW(binding: Long, serverprincname: PCWSTR, authnlevel: UInt, authnsvc: UInt, authidentity: Long, authzsvc: UInt): RPC_STATUS

public expect fun RpcBindingSetObject(binding: Long, objectuuid: Long): RPC_STATUS

public expect fun RpcBindingSetOption(hbinding: Long, option: UInt, optionvalue: ULong): RPC_STATUS

public expect fun RpcBindingToStringBindingA(binding: Long, stringbinding: Long): RPC_STATUS

public expect fun RpcBindingToStringBindingW(binding: Long, stringbinding: Long): RPC_STATUS

public expect fun RpcBindingUnbind(binding: Long): RPC_STATUS

public expect fun RpcBindingVectorFree(bindingvector: Long): RPC_STATUS

public expect fun RpcCancelThread(thread: Long): RPC_STATUS

public expect fun RpcCancelThreadEx(thread: Long, timeout: Int): RPC_STATUS

public expect fun RpcCertGeneratePrincipalNameA(context: Long, flags: UInt, pbuffer: Long): RPC_STATUS

public expect fun RpcCertGeneratePrincipalNameW(context: Long, flags: UInt, pbuffer: Long): RPC_STATUS

public expect fun RpcEpRegisterA(ifspec: Long, bindingvector: Long, uuidvector: Long, annotation: PCSTR): RPC_STATUS

public expect fun RpcEpRegisterNoReplaceA(ifspec: Long, bindingvector: Long, uuidvector: Long, annotation: PCSTR): RPC_STATUS

public expect fun RpcEpRegisterNoReplaceW(ifspec: Long, bindingvector: Long, uuidvector: Long, annotation: PCWSTR): RPC_STATUS

public expect fun RpcEpRegisterW(ifspec: Long, bindingvector: Long, uuidvector: Long, annotation: PCWSTR): RPC_STATUS

public expect fun RpcEpResolveBinding(binding: Long, ifspec: Long): RPC_STATUS

public expect fun RpcEpUnregister(ifspec: Long, bindingvector: Long, uuidvector: Long): RPC_STATUS

public expect fun RpcErrorAddRecord(errorinfo: Long): RPC_STATUS

public expect fun RpcErrorClearInformation()

public expect fun RpcErrorEndEnumeration(enumhandle: Long): RPC_STATUS

public expect fun RpcErrorGetNextRecord(enumhandle: Long, copystrings: BOOL, errorinfo: Long): RPC_STATUS

public expect fun RpcErrorGetNumberOfRecords(enumhandle: Long, records: Long): RPC_STATUS

public expect fun RpcErrorLoadErrorInfo(errorblob: Long, blobsize: ULong, enumhandle: Long): RPC_STATUS

public expect fun RpcErrorResetEnumeration(enumhandle: Long): RPC_STATUS

public expect fun RpcErrorSaveErrorInfo(enumhandle: Long, errorblob: Long, blobsize: Long): RPC_STATUS

public expect fun RpcErrorStartEnumeration(enumhandle: Long): RPC_STATUS

public expect fun RpcExceptionFilter(exceptioncode: UInt): Int

public expect fun RpcFreeAuthorizationContext(pauthzclientcontext: Long): RPC_STATUS

public expect fun RpcGetAuthorizationContextForClient(clientbinding: Long, impersonateonreturn: BOOL, reserved1: Long, pexpirationtime: Long, reserved2: LUID, reserved3: UInt, reserved4: Long, pauthzclientcontext: Long): RPC_STATUS

public expect fun RpcIfIdVectorFree(ifidvector: Long): RPC_STATUS

public expect fun RpcIfInqId(rpcifhandle: Long, rpcifid: Long): RPC_STATUS

public expect fun RpcImpersonateClient(bindinghandle: Long): RPC_STATUS

public expect fun RpcImpersonateClient2(bindinghandle: Long): RPC_STATUS

public expect fun RpcImpersonateClientContainer(bindinghandle: Long): RPC_STATUS

public expect fun RpcMgmtEnableIdleCleanup(): RPC_STATUS

public expect fun RpcMgmtEpEltInqBegin(epbinding: Long, inquirytype: UInt, ifid: Long, versoption: UInt, objectuuid: Long, inquirycontext: Long): RPC_STATUS

public expect fun RpcMgmtEpEltInqDone(inquirycontext: Long): RPC_STATUS

public expect fun RpcMgmtEpEltInqNextA(inquirycontext: Long, ifid: Long, binding: Long, objectuuid: Long, annotation: Long): RPC_STATUS

public expect fun RpcMgmtEpEltInqNextW(inquirycontext: Long, ifid: Long, binding: Long, objectuuid: Long, annotation: Long): RPC_STATUS

public expect fun RpcMgmtEpUnregister(epbinding: Long, ifid: Long, binding: Long, objectuuid: Long): RPC_STATUS

public expect fun RpcMgmtInqComTimeout(binding: Long, timeout: Long): RPC_STATUS

public expect fun RpcMgmtInqDefaultProtectLevel(authnsvc: UInt, authnlevel: Long): RPC_STATUS

public expect fun RpcMgmtInqIfIds(binding: Long, ifidvector: Long): RPC_STATUS

public expect fun RpcMgmtInqServerPrincNameA(binding: Long, authnsvc: UInt, serverprincname: Long): RPC_STATUS

public expect fun RpcMgmtInqServerPrincNameW(binding: Long, authnsvc: UInt, serverprincname: Long): RPC_STATUS

public expect fun RpcMgmtInqStats(binding: Long, statistics: Long): RPC_STATUS

public expect fun RpcMgmtIsServerListening(binding: Long): RPC_STATUS

public expect fun RpcMgmtSetAuthorizationFn(authorizationfn: RPC_MGMT_AUTHORIZATION_FN): RPC_STATUS

public expect fun RpcMgmtSetCancelTimeout(timeout: Int): RPC_STATUS

public expect fun RpcMgmtSetComTimeout(binding: Long, timeout: UInt): RPC_STATUS

public expect fun RpcMgmtSetServerStackSize(threadstacksize: UInt): RPC_STATUS

public expect fun RpcMgmtStatsVectorFree(statsvector: Long): RPC_STATUS

public expect fun RpcMgmtStopServerListening(binding: Long): RPC_STATUS

public expect fun RpcMgmtWaitServerListen(): RPC_STATUS

public expect fun RpcNetworkInqProtseqsA(protseqvector: Long): RPC_STATUS

public expect fun RpcNetworkInqProtseqsW(protseqvector: Long): RPC_STATUS

public expect fun RpcNetworkIsProtseqValidA(protseq: PCSTR): RPC_STATUS

public expect fun RpcNetworkIsProtseqValidW(protseq: PCWSTR): RPC_STATUS

public expect fun RpcNsBindingExportA(entrynamesyntax: UInt, entryname: PCSTR, ifspec: Long, bindingvec: Long, objectuuidvec: Long): RPC_STATUS

public expect fun RpcNsBindingExportPnPA(entrynamesyntax: UInt, entryname: PCSTR, ifspec: Long, objectvector: Long): RPC_STATUS

public expect fun RpcNsBindingExportPnPW(entrynamesyntax: UInt, entryname: PCWSTR, ifspec: Long, objectvector: Long): RPC_STATUS

public expect fun RpcNsBindingExportW(entrynamesyntax: UInt, entryname: PCWSTR, ifspec: Long, bindingvec: Long, objectuuidvec: Long): RPC_STATUS

public expect fun RpcNsBindingImportBeginA(entrynamesyntax: UInt, entryname: PCSTR, ifspec: Long, objuuid: Long, importcontext: Long): RPC_STATUS

public expect fun RpcNsBindingImportBeginW(entrynamesyntax: UInt, entryname: PCWSTR, ifspec: Long, objuuid: Long, importcontext: Long): RPC_STATUS

public expect fun RpcNsBindingImportDone(importcontext: Long): RPC_STATUS

public expect fun RpcNsBindingImportNext(importcontext: Long, binding: Long): RPC_STATUS

public expect fun RpcNsBindingInqEntryNameA(binding: Long, entrynamesyntax: UInt, entryname: Long): RPC_STATUS

public expect fun RpcNsBindingInqEntryNameW(binding: Long, entrynamesyntax: UInt, entryname: Long): RPC_STATUS

public expect fun RpcNsBindingLookupBeginA(entrynamesyntax: UInt, entryname: PCSTR, ifspec: Long, objuuid: Long, bindingmaxcount: UInt, lookupcontext: Long): RPC_STATUS

public expect fun RpcNsBindingLookupBeginW(entrynamesyntax: UInt, entryname: PCWSTR, ifspec: Long, objuuid: Long, bindingmaxcount: UInt, lookupcontext: Long): RPC_STATUS

public expect fun RpcNsBindingLookupDone(lookupcontext: Long): RPC_STATUS

public expect fun RpcNsBindingLookupNext(lookupcontext: Long, bindingvec: Long): RPC_STATUS

public expect fun RpcNsBindingSelect(bindingvec: Long, binding: Long): RPC_STATUS

public expect fun RpcNsBindingUnexportA(entrynamesyntax: UInt, entryname: PCSTR, ifspec: Long, objectuuidvec: Long): RPC_STATUS

public expect fun RpcNsBindingUnexportPnPA(entrynamesyntax: UInt, entryname: PCSTR, ifspec: Long, objectvector: Long): RPC_STATUS

public expect fun RpcNsBindingUnexportPnPW(entrynamesyntax: UInt, entryname: PCWSTR, ifspec: Long, objectvector: Long): RPC_STATUS

public expect fun RpcNsBindingUnexportW(entrynamesyntax: UInt, entryname: PCWSTR, ifspec: Long, objectuuidvec: Long): RPC_STATUS

public expect fun RpcNsEntryExpandNameA(entrynamesyntax: UInt, entryname: PCSTR, expandedname: Long): RPC_STATUS

public expect fun RpcNsEntryExpandNameW(entrynamesyntax: UInt, entryname: PCWSTR, expandedname: Long): RPC_STATUS

public expect fun RpcNsEntryObjectInqBeginA(entrynamesyntax: UInt, entryname: PCSTR, inquirycontext: Long): RPC_STATUS

public expect fun RpcNsEntryObjectInqBeginW(entrynamesyntax: UInt, entryname: PCWSTR, inquirycontext: Long): RPC_STATUS

public expect fun RpcNsEntryObjectInqDone(inquirycontext: Long): RPC_STATUS

public expect fun RpcNsEntryObjectInqNext(inquirycontext: Long, objuuid: Long): RPC_STATUS

public expect fun RpcNsGroupDeleteA(groupnamesyntax: GROUP_NAME_SYNTAX, groupname: PCSTR): RPC_STATUS

public expect fun RpcNsGroupDeleteW(groupnamesyntax: GROUP_NAME_SYNTAX, groupname: PCWSTR): RPC_STATUS

public expect fun RpcNsGroupMbrAddA(groupnamesyntax: UInt, groupname: PCSTR, membernamesyntax: UInt, membername: PCSTR): RPC_STATUS

public expect fun RpcNsGroupMbrAddW(groupnamesyntax: UInt, groupname: PCWSTR, membernamesyntax: UInt, membername: PCWSTR): RPC_STATUS

public expect fun RpcNsGroupMbrInqBeginA(groupnamesyntax: UInt, groupname: PCSTR, membernamesyntax: UInt, inquirycontext: Long): RPC_STATUS

public expect fun RpcNsGroupMbrInqBeginW(groupnamesyntax: UInt, groupname: PCWSTR, membernamesyntax: UInt, inquirycontext: Long): RPC_STATUS

public expect fun RpcNsGroupMbrInqDone(inquirycontext: Long): RPC_STATUS

public expect fun RpcNsGroupMbrInqNextA(inquirycontext: Long, membername: Long): RPC_STATUS

public expect fun RpcNsGroupMbrInqNextW(inquirycontext: Long, membername: Long): RPC_STATUS

public expect fun RpcNsGroupMbrRemoveA(groupnamesyntax: UInt, groupname: PCSTR, membernamesyntax: UInt, membername: PCSTR): RPC_STATUS

public expect fun RpcNsGroupMbrRemoveW(groupnamesyntax: UInt, groupname: PCWSTR, membernamesyntax: UInt, membername: PCWSTR): RPC_STATUS

public expect fun RpcNsMgmtBindingUnexportA(entrynamesyntax: UInt, entryname: PCSTR, ifid: Long, versoption: UInt, objectuuidvec: Long): RPC_STATUS

public expect fun RpcNsMgmtBindingUnexportW(entrynamesyntax: UInt, entryname: PCWSTR, ifid: Long, versoption: UInt, objectuuidvec: Long): RPC_STATUS

public expect fun RpcNsMgmtEntryCreateA(entrynamesyntax: UInt, entryname: PCSTR): RPC_STATUS

public expect fun RpcNsMgmtEntryCreateW(entrynamesyntax: UInt, entryname: PCWSTR): RPC_STATUS

public expect fun RpcNsMgmtEntryDeleteA(entrynamesyntax: UInt, entryname: PCSTR): RPC_STATUS

public expect fun RpcNsMgmtEntryDeleteW(entrynamesyntax: UInt, entryname: PCWSTR): RPC_STATUS

public expect fun RpcNsMgmtEntryInqIfIdsA(entrynamesyntax: UInt, entryname: PCSTR, ifidvec: Long): RPC_STATUS

public expect fun RpcNsMgmtEntryInqIfIdsW(entrynamesyntax: UInt, entryname: PCWSTR, ifidvec: Long): RPC_STATUS

public expect fun RpcNsMgmtHandleSetExpAge(nshandle: Long, expirationage: UInt): RPC_STATUS

public expect fun RpcNsMgmtInqExpAge(expirationage: Long): RPC_STATUS

public expect fun RpcNsMgmtSetExpAge(expirationage: UInt): RPC_STATUS

public expect fun RpcNsProfileDeleteA(profilenamesyntax: UInt, profilename: PCSTR): RPC_STATUS

public expect fun RpcNsProfileDeleteW(profilenamesyntax: UInt, profilename: PCWSTR): RPC_STATUS

public expect fun RpcNsProfileEltAddA(profilenamesyntax: UInt, profilename: PCSTR, ifid: Long, membernamesyntax: UInt, membername: PCSTR, priority: UInt, annotation: PCSTR): RPC_STATUS

public expect fun RpcNsProfileEltAddW(profilenamesyntax: UInt, profilename: PCWSTR, ifid: Long, membernamesyntax: UInt, membername: PCWSTR, priority: UInt, annotation: PCWSTR): RPC_STATUS

public expect fun RpcNsProfileEltInqBeginA(profilenamesyntax: UInt, profilename: PCSTR, inquirytype: UInt, ifid: Long, versoption: UInt, membernamesyntax: UInt, membername: PCSTR, inquirycontext: Long): RPC_STATUS

public expect fun RpcNsProfileEltInqBeginW(profilenamesyntax: UInt, profilename: PCWSTR, inquirytype: UInt, ifid: Long, versoption: UInt, membernamesyntax: UInt, membername: PCWSTR, inquirycontext: Long): RPC_STATUS

public expect fun RpcNsProfileEltInqDone(inquirycontext: Long): RPC_STATUS

public expect fun RpcNsProfileEltInqNextA(inquirycontext: Long, ifid: Long, membername: Long, priority: Long, annotation: Long): RPC_STATUS

public expect fun RpcNsProfileEltInqNextW(inquirycontext: Long, ifid: Long, membername: Long, priority: Long, annotation: Long): RPC_STATUS

public expect fun RpcNsProfileEltRemoveA(profilenamesyntax: UInt, profilename: PCSTR, ifid: Long, membernamesyntax: UInt, membername: PCSTR): RPC_STATUS

public expect fun RpcNsProfileEltRemoveW(profilenamesyntax: UInt, profilename: PCWSTR, ifid: Long, membernamesyntax: UInt, membername: PCWSTR): RPC_STATUS

public expect fun RpcObjectInqType(objuuid: Long, typeuuid: Long): RPC_STATUS

public expect fun RpcObjectSetInqFn(inquiryfn: RPC_OBJECT_INQ_FN): RPC_STATUS

public expect fun RpcObjectSetType(objuuid: Long, typeuuid: Long): RPC_STATUS

public expect fun RpcProtseqVectorFreeA(protseqvector: Long): RPC_STATUS

public expect fun RpcProtseqVectorFreeW(protseqvector: Long): RPC_STATUS

public expect fun RpcRaiseException(exception: RPC_STATUS)

public expect fun RpcRevertContainerImpersonation(): RPC_STATUS

public expect fun RpcRevertToSelf(): RPC_STATUS

public expect fun RpcRevertToSelfEx(bindinghandle: Long): RPC_STATUS

public expect fun RpcServerCompleteSecurityCallback(bindinghandle: Long, status: RPC_STATUS): RPC_STATUS

public expect fun RpcServerInqBindingHandle(binding: Long): RPC_STATUS

public expect fun RpcServerInqBindings(bindingvector: Long): RPC_STATUS

public expect fun RpcServerInqBindingsEx(securitydescriptor: Long, bindingvector: Long): RPC_STATUS

public expect fun RpcServerInqCallAttributesA(clientbinding: Long, rpccallattributes: Long): RPC_STATUS

public expect fun RpcServerInqCallAttributesW(clientbinding: Long, rpccallattributes: Long): RPC_STATUS

public expect fun RpcServerInqDefaultPrincNameA(authnsvc: UInt, princname: Long): RPC_STATUS

public expect fun RpcServerInqDefaultPrincNameW(authnsvc: UInt, princname: Long): RPC_STATUS

public expect fun RpcServerInqIf(ifspec: Long, mgrtypeuuid: Long, mgrepv: Long): RPC_STATUS

public expect fun RpcServerInterfaceGroupActivate(ifgroup: Long): RPC_STATUS

public expect fun RpcServerInterfaceGroupClose(ifgroup: Long): RPC_STATUS

public expect fun RpcServerInterfaceGroupCreateA(interfaces: Long, numifs: UInt, endpoints: Long, numendpoints: UInt, idleperiod: UInt, idlecallbackfn: RPC_INTERFACE_GROUP_IDLE_CALLBACK_FN, idlecallbackcontext: Long, ifgroup: Long): RPC_STATUS

public expect fun RpcServerInterfaceGroupCreateW(interfaces: Long, numifs: UInt, endpoints: Long, numendpoints: UInt, idleperiod: UInt, idlecallbackfn: RPC_INTERFACE_GROUP_IDLE_CALLBACK_FN, idlecallbackcontext: Long, ifgroup: Long): RPC_STATUS

public expect fun RpcServerInterfaceGroupDeactivate(ifgroup: Long, forcedeactivation: UInt): RPC_STATUS

public expect fun RpcServerInterfaceGroupInqBindings(ifgroup: Long, bindingvector: Long): RPC_STATUS

public expect fun RpcServerListen(minimumcallthreads: UInt, maxcalls: UInt, dontwait: UInt): RPC_STATUS

public expect fun RpcServerRegisterAuthInfoA(serverprincname: PCSTR, authnsvc: UInt, getkeyfn: RPC_AUTH_KEY_RETRIEVAL_FN, arg: Long): RPC_STATUS

public expect fun RpcServerRegisterAuthInfoW(serverprincname: PCWSTR, authnsvc: UInt, getkeyfn: RPC_AUTH_KEY_RETRIEVAL_FN, arg: Long): RPC_STATUS

public expect fun RpcServerRegisterIf(ifspec: Long, mgrtypeuuid: Long, mgrepv: Long): RPC_STATUS

public expect fun RpcServerRegisterIf2(ifspec: Long, mgrtypeuuid: Long, mgrepv: Long, flags: UInt, maxcalls: UInt, maxrpcsize: UInt, ifcallbackfn: RPC_IF_CALLBACK_FN): RPC_STATUS

public expect fun RpcServerRegisterIf3(ifspec: Long, mgrtypeuuid: Long, mgrepv: Long, flags: UInt, maxcalls: UInt, maxrpcsize: UInt, ifcallback: RPC_IF_CALLBACK_FN, securitydescriptor: Long): RPC_STATUS

public expect fun RpcServerRegisterIfEx(ifspec: Long, mgrtypeuuid: Long, mgrepv: Long, flags: UInt, maxcalls: UInt, ifcallback: RPC_IF_CALLBACK_FN): RPC_STATUS

public expect fun RpcServerSubscribeForNotification(binding: Long, notification: RPC_NOTIFICATIONS, notificationtype: RPC_NOTIFICATION_TYPES, notificationinfo: Long): RPC_STATUS

public expect fun RpcServerTestCancel(bindinghandle: Long): RPC_STATUS

public expect fun RpcServerUnregisterIf(ifspec: Long, mgrtypeuuid: Long, waitforcallstocomplete: UInt): RPC_STATUS

public expect fun RpcServerUnregisterIfEx(ifspec: Long, mgrtypeuuid: Long, rundowncontexthandles: Int): RPC_STATUS

public expect fun RpcServerUnsubscribeForNotification(binding: Long, notification: RPC_NOTIFICATIONS, notificationsqueued: Long): RPC_STATUS

public expect fun RpcServerUseAllProtseqs(maxcalls: UInt, securitydescriptor: Long): RPC_STATUS

public expect fun RpcServerUseAllProtseqsEx(maxcalls: UInt, securitydescriptor: Long, policy: Long): RPC_STATUS

public expect fun RpcServerUseAllProtseqsIf(maxcalls: UInt, ifspec: Long, securitydescriptor: Long): RPC_STATUS

public expect fun RpcServerUseAllProtseqsIfEx(maxcalls: UInt, ifspec: Long, securitydescriptor: Long, policy: Long): RPC_STATUS

public expect fun RpcServerUseProtseqA(protseq: PCSTR, maxcalls: UInt, securitydescriptor: Long): RPC_STATUS

public expect fun RpcServerUseProtseqEpA(protseq: PCSTR, maxcalls: UInt, endpoint: PCSTR, securitydescriptor: Long): RPC_STATUS

public expect fun RpcServerUseProtseqEpExA(protseq: PCSTR, maxcalls: UInt, endpoint: PCSTR, securitydescriptor: Long, policy: Long): RPC_STATUS

public expect fun RpcServerUseProtseqEpExW(protseq: PCWSTR, maxcalls: UInt, endpoint: PCWSTR, securitydescriptor: Long, policy: Long): RPC_STATUS

public expect fun RpcServerUseProtseqEpW(protseq: PCWSTR, maxcalls: UInt, endpoint: PCWSTR, securitydescriptor: Long): RPC_STATUS

public expect fun RpcServerUseProtseqExA(protseq: PCSTR, maxcalls: UInt, securitydescriptor: Long, policy: Long): RPC_STATUS

public expect fun RpcServerUseProtseqExW(protseq: PCWSTR, maxcalls: UInt, securitydescriptor: Long, policy: Long): RPC_STATUS

public expect fun RpcServerUseProtseqIfA(protseq: PCSTR, maxcalls: UInt, ifspec: Long, securitydescriptor: Long): RPC_STATUS

public expect fun RpcServerUseProtseqIfExA(protseq: PCSTR, maxcalls: UInt, ifspec: Long, securitydescriptor: Long, policy: Long): RPC_STATUS

public expect fun RpcServerUseProtseqIfExW(protseq: PCWSTR, maxcalls: UInt, ifspec: Long, securitydescriptor: Long, policy: Long): RPC_STATUS

public expect fun RpcServerUseProtseqIfW(protseq: PCWSTR, maxcalls: UInt, ifspec: Long, securitydescriptor: Long): RPC_STATUS

public expect fun RpcServerUseProtseqW(protseq: PCWSTR, maxcalls: UInt, securitydescriptor: Long): RPC_STATUS

public expect fun RpcServerYield()

public expect fun RpcSmAllocate(size: ULong, pstatus: Long): Long

public expect fun RpcSmClientFree(pnodetofree: Long): RPC_STATUS

public expect fun RpcSmDestroyClientContext(contexthandle: Long): RPC_STATUS

public expect fun RpcSmDisableAllocate(): RPC_STATUS

public expect fun RpcSmEnableAllocate(): RPC_STATUS

public expect fun RpcSmFree(nodetofree: Long): RPC_STATUS

public expect fun RpcSmGetThreadHandle(pstatus: Long): Long

public expect fun RpcSmSetClientAllocFree(clientalloc: RPC_CLIENT_ALLOC, clientfree: RPC_CLIENT_FREE): RPC_STATUS

public expect fun RpcSmSetThreadHandle(id: Long): RPC_STATUS

public expect fun RpcSmSwapClientAllocFree(clientalloc: RPC_CLIENT_ALLOC, clientfree: RPC_CLIENT_FREE, oldclientalloc: Long, oldclientfree: Long): RPC_STATUS

public expect fun RpcSsAllocate(size: ULong): Long

public expect fun RpcSsContextLockExclusive(serverbindinghandle: Long, usercontext: Long): RPC_STATUS

public expect fun RpcSsContextLockShared(serverbindinghandle: Long, usercontext: Long): RPC_STATUS

public expect fun RpcSsDestroyClientContext(contexthandle: Long)

public expect fun RpcSsDisableAllocate()

public expect fun RpcSsDontSerializeContext()

public expect fun RpcSsEnableAllocate()

public expect fun RpcSsFree(nodetofree: Long)

public expect fun RpcSsGetContextBinding(contexthandle: Long, binding: Long): RPC_STATUS

public expect fun RpcSsGetThreadHandle(): Long

public expect fun RpcSsSetClientAllocFree(clientalloc: RPC_CLIENT_ALLOC, clientfree: RPC_CLIENT_FREE)

public expect fun RpcSsSetThreadHandle(id: Long)

public expect fun RpcSsSwapClientAllocFree(clientalloc: RPC_CLIENT_ALLOC, clientfree: RPC_CLIENT_FREE, oldclientalloc: Long, oldclientfree: Long)

public expect fun RpcStringBindingComposeA(objuuid: PCSTR, protseq: PCSTR, networkaddr: PCSTR, endpoint: PCSTR, options: PCSTR, stringbinding: Long): RPC_STATUS

public expect fun RpcStringBindingComposeW(objuuid: PCWSTR, protseq: PCWSTR, networkaddr: PCWSTR, endpoint: PCWSTR, options: PCWSTR, stringbinding: Long): RPC_STATUS

public expect fun RpcStringBindingParseA(stringbinding: PCSTR, objuuid: Long, protseq: Long, networkaddr: Long, endpoint: Long, networkoptions: Long): RPC_STATUS

public expect fun RpcStringBindingParseW(stringbinding: PCWSTR, objuuid: Long, protseq: Long, networkaddr: Long, endpoint: Long, networkoptions: Long): RPC_STATUS

public expect fun RpcStringFreeA(string: Long): RPC_STATUS

public expect fun RpcStringFreeW(string: Long): RPC_STATUS

public expect fun RpcTestCancel(): RPC_STATUS

public expect fun RpcUserFree(asynchandle: Long, pbuffer: Long)

public expect fun UuidCompare(uuid1: Long, uuid2: Long, status: Long): Int

public expect fun UuidCreate(uuid: Long): RPC_STATUS

public expect fun UuidCreateNil(niluuid: Long): RPC_STATUS
