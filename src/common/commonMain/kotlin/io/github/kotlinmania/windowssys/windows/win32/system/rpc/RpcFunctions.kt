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

public expect fun dceErrorInqTextA(rpcstatus: RpcStatus, errortext: Pstr): RpcStatus

public expect fun dceErrorInqTextW(rpcstatus: RpcStatus, errortext: Pwstr): RpcStatus

public expect fun iunknownAddRefProxy(thisRef: MutPtr): UInt

public expect fun iunknownQueryInterfaceProxy(thisRef: MutPtr, riid: ConstPtr, ppvobject: MutPtr): Hresult

public expect fun iunknownReleaseProxy(thisRef: MutPtr): UInt

public expect fun iRpcAllocate(size: UInt): MutPtr

public expect fun iRpcAsyncAbortCall(pasync: ConstPtr, exceptioncode: UInt): RpcStatus

public expect fun iRpcAsyncSetHandle(message: ConstPtr, pasync: ConstPtr): RpcStatus

public expect fun iRpcBindingCopy(sourcebinding: MutPtr, destinationbinding: MutPtr): RpcStatus

public expect fun iRpcBindingCreateNp(servername: Pcwstr, servicename: Pcwstr, networkoptions: Pcwstr, binding: MutPtr): RpcStatus

public expect fun iRpcBindingHandleToAsyncHandle(binding: MutPtr, asynchandle: MutPtr): RpcStatus

public expect fun iRpcBindingInqClientTokenAttributes(binding: ConstPtr, tokenid: MutPtr, authenticationid: MutPtr, modifiedid: MutPtr): RpcStatus

public expect fun iRpcBindingInqDynamicEndpointA(binding: ConstPtr, dynamicendpoint: MutPtr): RpcStatus

public expect fun iRpcBindingInqDynamicEndpointW(binding: ConstPtr, dynamicendpoint: MutPtr): RpcStatus

public expect fun iRpcBindingInqLocalClientPid(binding: MutPtr, pid: MutPtr): RpcStatus

public expect fun iRpcBindingInqMarshalledTargetInfo(binding: ConstPtr, marshalledtargetinfosize: MutPtr, marshalledtargetinfo: MutPtr): RpcStatus

public expect fun iRpcBindingInqSecurityContext(binding: MutPtr, securitycontexthandle: MutPtr): RpcStatus

public expect fun iRpcBindingInqSecurityContextKeyInfo(binding: ConstPtr, keyinfo: MutPtr): RpcStatus

public expect fun iRpcBindingInqTransportType(binding: MutPtr, type: MutPtr): RpcStatus

public expect fun iRpcBindingInqWireIdForSnego(binding: ConstPtr, wireid: MutPtr): RpcStatus

public expect fun iRpcBindingIsClientLocal(bindinghandle: MutPtr, clientlocalflag: MutPtr): RpcStatus

public expect fun iRpcBindingIsServerLocal(binding: ConstPtr, serverlocalflag: MutPtr): RpcStatus

public expect fun iRpcBindingSetPrivateOption(hbinding: ConstPtr, option: UInt, optionvalue: ULong): RpcStatus

public expect fun iRpcBindingToStaticStringBindingW(binding: MutPtr, stringbinding: MutPtr): RpcStatus

public expect fun iRpcClearMutex(mutex: MutPtr)

public expect fun iRpcDeleteMutex(mutex: MutPtr)

public expect fun iRpcExceptionFilter(exceptioncode: UInt): Int

public expect fun iRpcFree(obj: MutPtr)

public expect fun iRpcFreeBuffer(message: MutPtr): RpcStatus

public expect fun iRpcFreePipeBuffer(message: MutPtr): RpcStatus

public expect fun iRpcGetBuffer(message: MutPtr): RpcStatus

public expect fun iRpcGetBufferWithObject(message: MutPtr, objectuuid: MutPtr): RpcStatus

public expect fun iRpcGetCurrentCallHandle(): MutPtr

public expect fun iRpcGetDefaultSd(ppsecuritydescriptor: MutPtr): RpcStatus

public expect fun iRpcGetExtendedError(): RpcStatus

public expect fun iRpcIfInqTransferSyntaxes(rpcifhandle: MutPtr, transfersyntaxes: MutPtr, transfersyntaxsize: UInt, transfersyntaxcount: MutPtr): RpcStatus

public expect fun iRpcMapWin32Status(status: RpcStatus): Int

public expect fun iRpcMgmtEnableDedicatedThreadPool(): RpcStatus

public expect fun iRpcNegotiateTransferSyntax(message: MutPtr): RpcStatus

public expect fun iRpcNsBindingSetEntryNameA(binding: ConstPtr, entrynamesyntax: UInt, entryname: Pcstr): RpcStatus

public expect fun iRpcNsBindingSetEntryNameW(binding: ConstPtr, entrynamesyntax: UInt, entryname: Pcwstr): RpcStatus

public expect fun iRpcNsGetBuffer(message: MutPtr): RpcStatus

public expect fun iRpcNsInterfaceExported(entrynamesyntax: UInt, entryname: ConstPtr, rpcinterfaceinformation: ConstPtr): RpcStatus

public expect fun iRpcNsInterfaceUnexported(entrynamesyntax: UInt, entryname: MutPtr, rpcinterfaceinformation: MutPtr): RpcStatus

public expect fun iRpcNsRaiseException(message: MutPtr, status: RpcStatus)

public expect fun iRpcNsSendReceive(message: MutPtr, handle: MutPtr): RpcStatus

public expect fun iRpcOpenClientProcess(binding: ConstPtr, desiredaccess: UInt, clientprocess: MutPtr): RpcStatus

public expect fun iRpcPauseExecution(milliseconds: UInt)

public expect fun iRpcReBindBuffer(message: MutPtr): RpcStatus

public expect fun iRpcReallocPipeBuffer(message: ConstPtr, newsize: UInt): RpcStatus

public expect fun iRpcReceive(message: MutPtr, size: UInt): RpcStatus

public expect fun iRpcRecordCalloutFailure(rpcstatus: RpcStatus, calloutstate: MutPtr, dllname: MutPtr)

public expect fun iRpcRequestMutex(mutex: MutPtr)

public expect fun iRpcSend(message: MutPtr): RpcStatus

public expect fun iRpcSendReceive(message: MutPtr): RpcStatus

public expect fun iRpcServerCheckClientRestriction(context: MutPtr): RpcStatus

public expect fun iRpcServerDisableExceptionFilter(): Int

public expect fun iRpcServerGetAssociationId(binding: ConstPtr, associationid: MutPtr): RpcStatus

public expect fun iRpcServerInqAddressChangeFn(): MutPtr

public expect fun iRpcServerInqLocalConnAddress(binding: MutPtr, buffer: MutPtr, buffersize: MutPtr, addressformat: MutPtr): RpcStatus

public expect fun iRpcServerInqRemoteConnAddress(binding: MutPtr, buffer: MutPtr, buffersize: MutPtr, addressformat: MutPtr): RpcStatus

public expect fun iRpcServerInqTransportType(type: MutPtr): RpcStatus

public expect fun iRpcServerRegisterForwardFunction(pforwardfunction: MutPtr): RpcStatus

public expect fun iRpcServerSetAddressChangeFn(paddresschangefn: MutPtr): RpcStatus

public expect fun iRpcServerStartService(protseq: Pcwstr, endpoint: Pcwstr, ifspec: ConstPtr): RpcStatus

public expect fun iRpcServerSubscribeForDisconnectNotification(binding: ConstPtr, hevent: ConstPtr): RpcStatus

public expect fun iRpcServerSubscribeForDisconnectNotification2(binding: ConstPtr, hevent: ConstPtr, subscriptionid: MutPtr): RpcStatus

public expect fun iRpcServerUnsubscribeForDisconnectNotification(binding: ConstPtr, subscriptionid: Guid): RpcStatus

public expect fun iRpcServerUseProtseq2A(networkaddress: Pcstr, protseq: Pcstr, maxcalls: UInt, securitydescriptor: ConstPtr, policy: ConstPtr): RpcStatus

public expect fun iRpcServerUseProtseq2W(networkaddress: Pcwstr, protseq: Pcwstr, maxcalls: UInt, securitydescriptor: ConstPtr, policy: ConstPtr): RpcStatus

public expect fun iRpcServerUseProtseqEp2A(networkaddress: Pcstr, protseq: Pcstr, maxcalls: UInt, endpoint: Pcstr, securitydescriptor: ConstPtr, policy: ConstPtr): RpcStatus

public expect fun iRpcServerUseProtseqEp2W(networkaddress: Pcwstr, protseq: Pcwstr, maxcalls: UInt, endpoint: Pcwstr, securitydescriptor: ConstPtr, policy: ConstPtr): RpcStatus

public expect fun iRpcSessionStrictContextHandle()

public expect fun iRpcSsDontSerializeContext()

public expect fun iRpcSystemHandleTypeSpecificWork(handle: MutPtr, actualtype: UByte, idltype: UByte, marshaldirection: LrpcSystemHandleMarshalDirection): RpcStatus

public expect fun iRpcTurnOnEeinfoPropagation(): RpcStatus

public expect fun iUuidCreate(uuid: MutPtr): RpcStatus

public expect fun mesBufferHandleReset(handle: ConstPtr, handlestyle: UInt, operation: MidlEsCode, pbuffer: ConstPtr, buffersize: UInt, pencodedsize: MutPtr): RpcStatus

public expect fun mesDecodeBufferHandleCreate(buffer: Pcstr, buffersize: UInt, phandle: MutPtr): RpcStatus

public expect fun mesDecodeIncrementalHandleCreate(userstate: MutPtr, readfn: MidlEsRead, phandle: MutPtr): RpcStatus

public expect fun mesEncodeDynBufferHandleCreate(pbuffer: MutPtr, pencodedsize: MutPtr, phandle: MutPtr): RpcStatus

public expect fun mesEncodeFixedBufferHandleCreate(pbuffer: Pstr, buffersize: UInt, pencodedsize: MutPtr, phandle: MutPtr): RpcStatus

public expect fun mesEncodeIncrementalHandleCreate(userstate: MutPtr, allocfn: MidlEsAlloc, writefn: MidlEsWrite, phandle: MutPtr): RpcStatus

public expect fun mesHandleFree(handle: MutPtr): RpcStatus

public expect fun mesIncrementalHandleReset(handle: MutPtr, userstate: MutPtr, allocfn: MidlEsAlloc, writefn: MidlEsWrite, readfn: MidlEsRead, operation: MidlEsCode): RpcStatus

public expect fun mesInqProcEncodingId(handle: MutPtr, pinterfaceid: MutPtr, pprocnum: MutPtr): RpcStatus

public expect fun nDRCContextBinding(ccontext: Long): MutPtr

public expect fun nDRCContextMarshall(ccontext: Long, pbuff: MutPtr)

public expect fun nDRCContextUnmarshall(pccontext: MutPtr, hbinding: ConstPtr, pbuff: ConstPtr, datarepresentation: UInt)

public expect fun nDRSContextMarshall(ccontext: ConstPtr, pbuff: MutPtr, userrundownin: NdrRundown)

public expect fun nDRSContextMarshall2(bindinghandle: ConstPtr, ccontext: ConstPtr, pbuff: MutPtr, userrundownin: NdrRundown, ctxguard: ConstPtr, flags: UInt)

public expect fun nDRSContextMarshallEx(bindinghandle: ConstPtr, ccontext: ConstPtr, pbuff: MutPtr, userrundownin: NdrRundown)

public expect fun nDRSContextUnmarshall(pbuff: ConstPtr, datarepresentation: UInt): MutPtr

public expect fun nDRSContextUnmarshall2(bindinghandle: ConstPtr, pbuff: ConstPtr, datarepresentation: UInt, ctxguard: ConstPtr, flags: UInt): MutPtr

public expect fun nDRSContextUnmarshallEx(bindinghandle: ConstPtr, pbuff: ConstPtr, datarepresentation: UInt): MutPtr

public expect fun ndr64AsyncClientCall(pproxyinfo: MutPtr, nprocnum: UInt, preturnvalue: MutPtr, vararg variadicArgs: Long): ClientCallReturn

public expect fun ndr64AsyncServerCall64(prpcmsg: MutPtr)

public expect fun ndr64AsyncServerCallAll(prpcmsg: MutPtr)

public expect fun ndr64DcomAsyncClientCall(pproxyinfo: MutPtr, nprocnum: UInt, preturnvalue: MutPtr, vararg variadicArgs: Long): ClientCallReturn

public expect fun ndr64DcomAsyncStubCall(pthis: MutPtr, pchannel: MutPtr, prpcmsg: MutPtr, pdwstubphase: MutPtr): Int

public expect fun ndrAllocate(pstubmsg: MutPtr, len: ULong): MutPtr

public expect fun ndrAsyncClientCall(pstubdescriptor: MutPtr, pformat: MutPtr, vararg variadicArgs: Long): ClientCallReturn

public expect fun ndrAsyncServerCall(prpcmsg: MutPtr)

public expect fun ndrByteCountPointerBufferSize(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr)

public expect fun ndrByteCountPointerFree(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr)

public expect fun ndrByteCountPointerMarshall(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): MutPtr

public expect fun ndrByteCountPointerUnmarshall(pstubmsg: MutPtr, ppmemory: MutPtr, pformat: MutPtr, fmustalloc: UByte): MutPtr

public expect fun ndrClearOutParameters(pstubmsg: MutPtr, pformat: MutPtr, argaddr: MutPtr)

public expect fun ndrClientCall2(pstubdescriptor: MutPtr, pformat: MutPtr, vararg variadicArgs: Long): ClientCallReturn

public expect fun ndrClientCall3(pproxyinfo: MutPtr, nprocnum: UInt, preturnvalue: MutPtr, vararg variadicArgs: Long): ClientCallReturn

public expect fun ndrClientContextMarshall(pstubmsg: MutPtr, contexthandle: Long, fcheck: Int)

public expect fun ndrClientContextUnmarshall(pstubmsg: MutPtr, pcontexthandle: MutPtr, bindhandle: MutPtr)

public expect fun ndrClientInitialize(prpcmsg: MutPtr, pstubmsg: MutPtr, pstubdescriptor: MutPtr, procnum: UInt)

public expect fun ndrClientInitializeNew(prpcmsg: MutPtr, pstubmsg: MutPtr, pstubdescriptor: MutPtr, procnum: UInt)

public expect fun ndrComplexArrayBufferSize(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr)

public expect fun ndrComplexArrayFree(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr)

public expect fun ndrComplexArrayMarshall(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): MutPtr

public expect fun ndrComplexArrayMemorySize(pstubmsg: MutPtr, pformat: MutPtr): UInt

public expect fun ndrComplexArrayUnmarshall(pstubmsg: MutPtr, ppmemory: MutPtr, pformat: MutPtr, fmustalloc: UByte): MutPtr

public expect fun ndrComplexStructBufferSize(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr)

public expect fun ndrComplexStructFree(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr)

public expect fun ndrComplexStructMarshall(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): MutPtr

public expect fun ndrComplexStructMemorySize(pstubmsg: MutPtr, pformat: MutPtr): UInt

public expect fun ndrComplexStructUnmarshall(pstubmsg: MutPtr, ppmemory: MutPtr, pformat: MutPtr, fmustalloc: UByte): MutPtr

public expect fun ndrConformantArrayBufferSize(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr)

public expect fun ndrConformantArrayFree(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr)

public expect fun ndrConformantArrayMarshall(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): MutPtr

public expect fun ndrConformantArrayMemorySize(pstubmsg: MutPtr, pformat: MutPtr): UInt

public expect fun ndrConformantArrayUnmarshall(pstubmsg: MutPtr, ppmemory: MutPtr, pformat: MutPtr, fmustalloc: UByte): MutPtr

public expect fun ndrConformantStringBufferSize(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr)

public expect fun ndrConformantStringMarshall(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): MutPtr

public expect fun ndrConformantStringMemorySize(pstubmsg: MutPtr, pformat: MutPtr): UInt

public expect fun ndrConformantStringUnmarshall(pstubmsg: MutPtr, ppmemory: MutPtr, pformat: MutPtr, fmustalloc: UByte): MutPtr

public expect fun ndrConformantStructBufferSize(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr)

public expect fun ndrConformantStructFree(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr)

public expect fun ndrConformantStructMarshall(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): MutPtr

public expect fun ndrConformantStructMemorySize(pstubmsg: MutPtr, pformat: MutPtr): UInt

public expect fun ndrConformantStructUnmarshall(pstubmsg: MutPtr, ppmemory: MutPtr, pformat: MutPtr, fmustalloc: UByte): MutPtr

public expect fun ndrConformantVaryingArrayBufferSize(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr)

public expect fun ndrConformantVaryingArrayFree(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr)

public expect fun ndrConformantVaryingArrayMarshall(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): MutPtr

public expect fun ndrConformantVaryingArrayMemorySize(pstubmsg: MutPtr, pformat: MutPtr): UInt

public expect fun ndrConformantVaryingArrayUnmarshall(pstubmsg: MutPtr, ppmemory: MutPtr, pformat: MutPtr, fmustalloc: UByte): MutPtr

public expect fun ndrConformantVaryingStructBufferSize(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr)

public expect fun ndrConformantVaryingStructFree(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr)

public expect fun ndrConformantVaryingStructMarshall(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): MutPtr

public expect fun ndrConformantVaryingStructMemorySize(pstubmsg: MutPtr, pformat: MutPtr): UInt

public expect fun ndrConformantVaryingStructUnmarshall(pstubmsg: MutPtr, ppmemory: MutPtr, pformat: MutPtr, fmustalloc: UByte): MutPtr

public expect fun ndrContextHandleInitialize(pstubmsg: ConstPtr, pformat: ConstPtr): MutPtr

public expect fun ndrContextHandleSize(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr)

public expect fun ndrConvert(pstubmsg: MutPtr, pformat: MutPtr)

public expect fun ndrConvert2(pstubmsg: MutPtr, pformat: MutPtr, numberparams: Int)

public expect fun ndrCorrelationFree(pstubmsg: MutPtr)

public expect fun ndrCorrelationInitialize(pstubmsg: MutPtr, pmemory: MutPtr, cachesize: UInt, flags: UInt)

public expect fun ndrCorrelationPass(pstubmsg: MutPtr)

public expect fun ndrCreateServerInterfaceFromStub(pstub: MutPtr, pserverif: MutPtr): RpcStatus

public expect fun ndrDcomAsyncClientCall(pstubdescriptor: MutPtr, pformat: MutPtr, vararg variadicArgs: Long): ClientCallReturn

public expect fun ndrDcomAsyncStubCall(pthis: MutPtr, pchannel: MutPtr, prpcmsg: MutPtr, pdwstubphase: MutPtr): Int

public expect fun ndrEncapsulatedUnionBufferSize(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr)

public expect fun ndrEncapsulatedUnionFree(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr)

public expect fun ndrEncapsulatedUnionMarshall(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): MutPtr

public expect fun ndrEncapsulatedUnionMemorySize(pstubmsg: MutPtr, pformat: MutPtr): UInt

public expect fun ndrEncapsulatedUnionUnmarshall(pstubmsg: MutPtr, ppmemory: MutPtr, pformat: MutPtr, fmustalloc: UByte): MutPtr

public expect fun ndrFixedArrayBufferSize(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr)

public expect fun ndrFixedArrayFree(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr)

public expect fun ndrFixedArrayMarshall(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): MutPtr

public expect fun ndrFixedArrayMemorySize(pstubmsg: MutPtr, pformat: MutPtr): UInt

public expect fun ndrFixedArrayUnmarshall(pstubmsg: MutPtr, ppmemory: MutPtr, pformat: MutPtr, fmustalloc: UByte): MutPtr

public expect fun ndrFreeBuffer(pstubmsg: MutPtr)

public expect fun ndrFullPointerXlatFree(pxlattables: MutPtr)

public expect fun ndrFullPointerXlatInit(numberofpointers: UInt, xlatside: XlatSide): MutPtr

public expect fun ndrGetBuffer(pstubmsg: MutPtr, bufferlength: UInt, handle: MutPtr): MutPtr

public expect fun ndrGetDcomProtocolVersion(pstubmsg: MutPtr, pversion: MutPtr): Hresult

public expect fun ndrGetUserMarshalInfo(pflags: ConstPtr, informationlevel: UInt, pmarshalinfo: MutPtr): RpcStatus

public expect fun ndrInterfacePointerBufferSize(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr)

public expect fun ndrInterfacePointerFree(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr)

public expect fun ndrInterfacePointerMarshall(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): MutPtr

public expect fun ndrInterfacePointerMemorySize(pstubmsg: MutPtr, pformat: MutPtr): UInt

public expect fun ndrInterfacePointerUnmarshall(pstubmsg: MutPtr, ppmemory: MutPtr, pformat: MutPtr, fmustalloc: UByte): MutPtr

public expect fun ndrMapCommAndFaultStatus(pstubmsg: MutPtr, pcommstatus: MutPtr, pfaultstatus: MutPtr, status: RpcStatus): RpcStatus

public expect fun ndrMesProcEncodeDecode(handle: MutPtr, pstubdesc: ConstPtr, pformatstring: MutPtr, vararg variadicArgs: Long)

public expect fun ndrMesProcEncodeDecode2(handle: MutPtr, pstubdesc: ConstPtr, pformatstring: MutPtr, vararg variadicArgs: Long): ClientCallReturn

public expect fun ndrMesProcEncodeDecode3(handle: MutPtr, pproxyinfo: ConstPtr, nprocnum: UInt, preturnvalue: MutPtr, vararg variadicArgs: Long): ClientCallReturn

public expect fun ndrMesSimpleTypeAlignSize(param0: MutPtr): ULong

public expect fun ndrMesSimpleTypeAlignSizeAll(handle: MutPtr, pproxyinfo: ConstPtr): ULong

public expect fun ndrMesSimpleTypeDecode(handle: MutPtr, pobject: MutPtr, size: Short)

public expect fun ndrMesSimpleTypeDecodeAll(handle: MutPtr, pproxyinfo: ConstPtr, pobject: MutPtr, size: Short)

public expect fun ndrMesSimpleTypeEncode(handle: MutPtr, pstubdesc: ConstPtr, pobject: ConstPtr, size: Short)

public expect fun ndrMesSimpleTypeEncodeAll(handle: MutPtr, pproxyinfo: ConstPtr, pobject: ConstPtr, size: Short)

public expect fun ndrMesTypeAlignSize(handle: MutPtr, pstubdesc: ConstPtr, pformatstring: MutPtr, pobject: ConstPtr): ULong

public expect fun ndrMesTypeAlignSize2(handle: MutPtr, ppicklinginfo: ConstPtr, pstubdesc: ConstPtr, pformatstring: MutPtr, pobject: ConstPtr): ULong

public expect fun ndrMesTypeAlignSize3(handle: MutPtr, ppicklinginfo: ConstPtr, pproxyinfo: ConstPtr, arrtypeoffset: ConstPtr, ntypeindex: UInt, pobject: ConstPtr): ULong

public expect fun ndrMesTypeDecode(handle: MutPtr, pstubdesc: ConstPtr, pformatstring: MutPtr, pobject: MutPtr)

public expect fun ndrMesTypeDecode2(handle: MutPtr, ppicklinginfo: ConstPtr, pstubdesc: ConstPtr, pformatstring: MutPtr, pobject: MutPtr)

public expect fun ndrMesTypeDecode3(handle: MutPtr, ppicklinginfo: ConstPtr, pproxyinfo: ConstPtr, arrtypeoffset: ConstPtr, ntypeindex: UInt, pobject: MutPtr)

public expect fun ndrMesTypeEncode(handle: MutPtr, pstubdesc: ConstPtr, pformatstring: MutPtr, pobject: ConstPtr)

public expect fun ndrMesTypeEncode2(handle: MutPtr, ppicklinginfo: ConstPtr, pstubdesc: ConstPtr, pformatstring: MutPtr, pobject: ConstPtr)

public expect fun ndrMesTypeEncode3(handle: MutPtr, ppicklinginfo: ConstPtr, pproxyinfo: ConstPtr, arrtypeoffset: ConstPtr, ntypeindex: UInt, pobject: ConstPtr)

public expect fun ndrMesTypeFree2(handle: MutPtr, ppicklinginfo: ConstPtr, pstubdesc: ConstPtr, pformatstring: MutPtr, pobject: MutPtr)

public expect fun ndrMesTypeFree3(handle: MutPtr, ppicklinginfo: ConstPtr, pproxyinfo: ConstPtr, arrtypeoffset: ConstPtr, ntypeindex: UInt, pobject: MutPtr)

public expect fun ndrNonConformantStringBufferSize(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr)

public expect fun ndrNonConformantStringMarshall(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): MutPtr

public expect fun ndrNonConformantStringMemorySize(pstubmsg: MutPtr, pformat: MutPtr): UInt

public expect fun ndrNonConformantStringUnmarshall(pstubmsg: MutPtr, ppmemory: MutPtr, pformat: MutPtr, fmustalloc: UByte): MutPtr

public expect fun ndrNonEncapsulatedUnionBufferSize(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr)

public expect fun ndrNonEncapsulatedUnionFree(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr)

public expect fun ndrNonEncapsulatedUnionMarshall(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): MutPtr

public expect fun ndrNonEncapsulatedUnionMemorySize(pstubmsg: MutPtr, pformat: MutPtr): UInt

public expect fun ndrNonEncapsulatedUnionUnmarshall(pstubmsg: MutPtr, ppmemory: MutPtr, pformat: MutPtr, fmustalloc: UByte): MutPtr

public expect fun ndrNsGetBuffer(pstubmsg: MutPtr, bufferlength: UInt, handle: MutPtr): MutPtr

public expect fun ndrNsSendReceive(pstubmsg: MutPtr, pbufferend: MutPtr, pautohandle: MutPtr): MutPtr

public expect fun ndrOleAllocate(size: ULong): MutPtr

public expect fun ndrOleFree(nodetofree: ConstPtr)

public expect fun ndrPartialIgnoreClientBufferSize(pstubmsg: MutPtr, pmemory: MutPtr)

public expect fun ndrPartialIgnoreClientMarshall(pstubmsg: MutPtr, pmemory: MutPtr)

public expect fun ndrPartialIgnoreServerInitialize(pstubmsg: MutPtr, ppmemory: MutPtr, pformat: MutPtr)

public expect fun ndrPartialIgnoreServerUnmarshall(pstubmsg: MutPtr, ppmemory: MutPtr)

public expect fun ndrPointerBufferSize(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr)

public expect fun ndrPointerFree(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr)

public expect fun ndrPointerMarshall(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): MutPtr

public expect fun ndrPointerMemorySize(pstubmsg: MutPtr, pformat: MutPtr): UInt

public expect fun ndrPointerUnmarshall(pstubmsg: MutPtr, ppmemory: MutPtr, pformat: MutPtr, fmustalloc: UByte): MutPtr

public expect fun ndrRangeUnmarshall(pstubmsg: MutPtr, ppmemory: MutPtr, pformat: MutPtr, fmustalloc: UByte): MutPtr

public expect fun ndrRpcSmClientAllocate(size: ULong): MutPtr

public expect fun ndrRpcSmClientFree(nodetofree: ConstPtr)

public expect fun ndrRpcSmSetClientToOsf(pmessage: MutPtr)

public expect fun ndrRpcSsDefaultAllocate(size: ULong): MutPtr

public expect fun ndrRpcSsDefaultFree(nodetofree: ConstPtr)

public expect fun ndrRpcSsDisableAllocate(pmessage: MutPtr)

public expect fun ndrRpcSsEnableAllocate(pmessage: MutPtr)

public expect fun ndrSendReceive(pstubmsg: MutPtr, pbufferend: MutPtr): MutPtr

public expect fun ndrServerCall2(prpcmsg: MutPtr)

public expect fun ndrServerCallAll(prpcmsg: MutPtr)

public expect fun ndrServerCallNdr64(prpcmsg: MutPtr)

public expect fun ndrServerContextMarshall(pstubmsg: MutPtr, contexthandle: MutPtr, rundownroutine: NdrRundown)

public expect fun ndrServerContextNewMarshall(pstubmsg: MutPtr, contexthandle: MutPtr, rundownroutine: NdrRundown, pformat: MutPtr)

public expect fun ndrServerContextNewUnmarshall(pstubmsg: ConstPtr, pformat: ConstPtr): MutPtr

public expect fun ndrServerContextUnmarshall(pstubmsg: MutPtr): MutPtr

public expect fun ndrServerInitialize(prpcmsg: MutPtr, pstubmsg: MutPtr, pstubdescriptor: MutPtr): MutPtr

public expect fun ndrServerInitializeMarshall(prpcmsg: MutPtr, pstubmsg: MutPtr)

public expect fun ndrServerInitializeNew(prpcmsg: MutPtr, pstubmsg: MutPtr, pstubdescriptor: MutPtr): MutPtr

public expect fun ndrServerInitializePartial(prpcmsg: MutPtr, pstubmsg: MutPtr, pstubdescriptor: MutPtr, requestedbuffersize: UInt)

public expect fun ndrServerInitializeUnmarshall(pstubmsg: MutPtr, pstubdescriptor: MutPtr, prpcmsg: MutPtr): MutPtr

public expect fun ndrSimpleStructBufferSize(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr)

public expect fun ndrSimpleStructFree(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr)

public expect fun ndrSimpleStructMarshall(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): MutPtr

public expect fun ndrSimpleStructMemorySize(pstubmsg: MutPtr, pformat: MutPtr): UInt

public expect fun ndrSimpleStructUnmarshall(pstubmsg: MutPtr, ppmemory: MutPtr, pformat: MutPtr, fmustalloc: UByte): MutPtr

public expect fun ndrSimpleTypeMarshall(pstubmsg: MutPtr, pmemory: MutPtr, formatchar: UByte)

public expect fun ndrSimpleTypeUnmarshall(pstubmsg: MutPtr, pmemory: MutPtr, formatchar: UByte)

public expect fun ndrStubCall2(pthis: MutPtr, pchannel: MutPtr, prpcmsg: MutPtr, pdwstubphase: MutPtr): Int

public expect fun ndrStubCall3(pthis: MutPtr, pchannel: MutPtr, prpcmsg: MutPtr, pdwstubphase: MutPtr): Int

public expect fun ndrUserMarshalBufferSize(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr)

public expect fun ndrUserMarshalFree(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr)

public expect fun ndrUserMarshalMarshall(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): MutPtr

public expect fun ndrUserMarshalMemorySize(pstubmsg: MutPtr, pformat: MutPtr): UInt

public expect fun ndrUserMarshalSimpleTypeConvert(pflags: MutPtr, pbuffer: MutPtr, formatchar: UByte): MutPtr

public expect fun ndrUserMarshalUnmarshall(pstubmsg: MutPtr, ppmemory: MutPtr, pformat: MutPtr, fmustalloc: UByte): MutPtr

public expect fun ndrVaryingArrayBufferSize(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr)

public expect fun ndrVaryingArrayFree(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr)

public expect fun ndrVaryingArrayMarshall(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): MutPtr

public expect fun ndrVaryingArrayMemorySize(pstubmsg: MutPtr, pformat: MutPtr): UInt

public expect fun ndrVaryingArrayUnmarshall(pstubmsg: MutPtr, ppmemory: MutPtr, pformat: MutPtr, fmustalloc: UByte): MutPtr

public expect fun ndrXmitOrRepAsBufferSize(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr)

public expect fun ndrXmitOrRepAsFree(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr)

public expect fun ndrXmitOrRepAsMarshall(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): MutPtr

public expect fun ndrXmitOrRepAsMemorySize(pstubmsg: MutPtr, pformat: MutPtr): UInt

public expect fun ndrXmitOrRepAsUnmarshall(pstubmsg: MutPtr, ppmemory: MutPtr, pformat: MutPtr, fmustalloc: UByte): MutPtr

public expect fun rpcAsyncAbortCall(pasync: MutPtr, exceptioncode: UInt): RpcStatus

public expect fun rpcAsyncCancelCall(pasync: MutPtr, fabort: Bool): RpcStatus

public expect fun rpcAsyncCompleteCall(pasync: MutPtr, reply: MutPtr): RpcStatus

public expect fun rpcAsyncGetCallStatus(pasync: ConstPtr): RpcStatus

public expect fun rpcAsyncInitializeHandle(pasync: MutPtr, size: UInt): RpcStatus

public expect fun rpcAsyncRegisterInfo(pasync: ConstPtr): RpcStatus

public expect fun rpcBindingBind(pasync: ConstPtr, binding: ConstPtr, ifspec: ConstPtr): RpcStatus

public expect fun rpcBindingCopy(sourcebinding: ConstPtr, destinationbinding: MutPtr): RpcStatus

public expect fun rpcBindingCreateA(template: ConstPtr, security: ConstPtr, options: ConstPtr, binding: MutPtr): RpcStatus

public expect fun rpcBindingCreateW(template: ConstPtr, security: ConstPtr, options: ConstPtr, binding: MutPtr): RpcStatus

public expect fun rpcBindingFree(binding: MutPtr): RpcStatus

public expect fun rpcBindingFromStringBindingA(stringbinding: Pcstr, binding: MutPtr): RpcStatus

public expect fun rpcBindingFromStringBindingW(stringbinding: Pcwstr, binding: MutPtr): RpcStatus

public expect fun rpcBindingInqAuthClientA(clientbinding: ConstPtr, privs: MutPtr, serverprincname: MutPtr, authnlevel: MutPtr, authnsvc: MutPtr, authzsvc: MutPtr): RpcStatus

public expect fun rpcBindingInqAuthClientExA(clientbinding: ConstPtr, privs: MutPtr, serverprincname: MutPtr, authnlevel: MutPtr, authnsvc: MutPtr, authzsvc: MutPtr, flags: UInt): RpcStatus

public expect fun rpcBindingInqAuthClientExW(clientbinding: ConstPtr, privs: MutPtr, serverprincname: MutPtr, authnlevel: MutPtr, authnsvc: MutPtr, authzsvc: MutPtr, flags: UInt): RpcStatus

public expect fun rpcBindingInqAuthClientW(clientbinding: ConstPtr, privs: MutPtr, serverprincname: MutPtr, authnlevel: MutPtr, authnsvc: MutPtr, authzsvc: MutPtr): RpcStatus

public expect fun rpcBindingInqAuthInfoA(binding: ConstPtr, serverprincname: MutPtr, authnlevel: MutPtr, authnsvc: MutPtr, authidentity: MutPtr, authzsvc: MutPtr): RpcStatus

public expect fun rpcBindingInqAuthInfoExA(binding: ConstPtr, serverprincname: MutPtr, authnlevel: MutPtr, authnsvc: MutPtr, authidentity: MutPtr, authzsvc: MutPtr, rpcqosversion: UInt, securityqos: MutPtr): RpcStatus

public expect fun rpcBindingInqAuthInfoExW(binding: ConstPtr, serverprincname: MutPtr, authnlevel: MutPtr, authnsvc: MutPtr, authidentity: MutPtr, authzsvc: MutPtr, rpcqosversion: UInt, securityqos: MutPtr): RpcStatus

public expect fun rpcBindingInqAuthInfoW(binding: ConstPtr, serverprincname: MutPtr, authnlevel: MutPtr, authnsvc: MutPtr, authidentity: MutPtr, authzsvc: MutPtr): RpcStatus

public expect fun rpcBindingInqMaxCalls(binding: ConstPtr, maxcalls: MutPtr): RpcStatus

public expect fun rpcBindingInqObject(binding: ConstPtr, objectuuid: MutPtr): RpcStatus

public expect fun rpcBindingInqOption(hbinding: ConstPtr, option: UInt, poptionvalue: MutPtr): RpcStatus

public expect fun rpcBindingReset(binding: ConstPtr): RpcStatus

public expect fun rpcBindingServerFromClient(clientbinding: ConstPtr, serverbinding: MutPtr): RpcStatus

public expect fun rpcBindingSetAuthInfoA(binding: ConstPtr, serverprincname: Pcstr, authnlevel: UInt, authnsvc: UInt, authidentity: ConstPtr, authzsvc: UInt): RpcStatus

public expect fun rpcBindingSetAuthInfoExA(binding: ConstPtr, serverprincname: Pcstr, authnlevel: UInt, authnsvc: UInt, authidentity: ConstPtr, authzsvc: UInt, securityqos: ConstPtr): RpcStatus

public expect fun rpcBindingSetAuthInfoExW(binding: ConstPtr, serverprincname: Pcwstr, authnlevel: UInt, authnsvc: UInt, authidentity: ConstPtr, authzsvc: UInt, securityqos: ConstPtr): RpcStatus

public expect fun rpcBindingSetAuthInfoW(binding: ConstPtr, serverprincname: Pcwstr, authnlevel: UInt, authnsvc: UInt, authidentity: ConstPtr, authzsvc: UInt): RpcStatus

public expect fun rpcBindingSetObject(binding: ConstPtr, objectuuid: ConstPtr): RpcStatus

public expect fun rpcBindingSetOption(hbinding: ConstPtr, option: UInt, optionvalue: ULong): RpcStatus

public expect fun rpcBindingToStringBindingA(binding: ConstPtr, stringbinding: MutPtr): RpcStatus

public expect fun rpcBindingToStringBindingW(binding: ConstPtr, stringbinding: MutPtr): RpcStatus

public expect fun rpcBindingUnbind(binding: ConstPtr): RpcStatus

public expect fun rpcBindingVectorFree(bindingvector: MutPtr): RpcStatus

public expect fun rpcCancelThread(thread: ConstPtr): RpcStatus

public expect fun rpcCancelThreadEx(thread: ConstPtr, timeout: Int): RpcStatus

public expect fun rpcCertGeneratePrincipalNameA(context: ConstPtr, flags: UInt, pbuffer: MutPtr): RpcStatus

public expect fun rpcCertGeneratePrincipalNameW(context: ConstPtr, flags: UInt, pbuffer: MutPtr): RpcStatus

public expect fun rpcEpRegisterA(ifspec: ConstPtr, bindingvector: ConstPtr, uuidvector: ConstPtr, annotation: Pcstr): RpcStatus

public expect fun rpcEpRegisterNoReplaceA(ifspec: ConstPtr, bindingvector: ConstPtr, uuidvector: ConstPtr, annotation: Pcstr): RpcStatus

public expect fun rpcEpRegisterNoReplaceW(ifspec: ConstPtr, bindingvector: ConstPtr, uuidvector: ConstPtr, annotation: Pcwstr): RpcStatus

public expect fun rpcEpRegisterW(ifspec: ConstPtr, bindingvector: ConstPtr, uuidvector: ConstPtr, annotation: Pcwstr): RpcStatus

public expect fun rpcEpResolveBinding(binding: ConstPtr, ifspec: ConstPtr): RpcStatus

public expect fun rpcEpUnregister(ifspec: ConstPtr, bindingvector: ConstPtr, uuidvector: ConstPtr): RpcStatus

public expect fun rpcErrorAddRecord(errorinfo: ConstPtr): RpcStatus

public expect fun rpcErrorClearInformation()

public expect fun rpcErrorEndEnumeration(enumhandle: MutPtr): RpcStatus

public expect fun rpcErrorGetNextRecord(enumhandle: ConstPtr, copystrings: Bool, errorinfo: MutPtr): RpcStatus

public expect fun rpcErrorGetNumberOfRecords(enumhandle: ConstPtr, records: MutPtr): RpcStatus

public expect fun rpcErrorLoadErrorInfo(errorblob: ConstPtr, blobsize: ULong, enumhandle: MutPtr): RpcStatus

public expect fun rpcErrorResetEnumeration(enumhandle: MutPtr): RpcStatus

public expect fun rpcErrorSaveErrorInfo(enumhandle: ConstPtr, errorblob: MutPtr, blobsize: MutPtr): RpcStatus

public expect fun rpcErrorStartEnumeration(enumhandle: MutPtr): RpcStatus

public expect fun rpcExceptionFilter(exceptioncode: UInt): Int

public expect fun rpcFreeAuthorizationContext(pauthzclientcontext: MutPtr): RpcStatus

public expect fun rpcGetAuthorizationContextForClient(clientbinding: ConstPtr, impersonateonreturn: Bool, reserved1: ConstPtr, pexpirationtime: ConstPtr, reserved2: Luid, reserved3: UInt, reserved4: ConstPtr, pauthzclientcontext: MutPtr): RpcStatus

public expect fun rpcIfIdVectorFree(ifidvector: MutPtr): RpcStatus

public expect fun rpcIfInqId(rpcifhandle: ConstPtr, rpcifid: MutPtr): RpcStatus

public expect fun rpcImpersonateClient(bindinghandle: ConstPtr): RpcStatus

public expect fun rpcImpersonateClient2(bindinghandle: ConstPtr): RpcStatus

public expect fun rpcImpersonateClientContainer(bindinghandle: ConstPtr): RpcStatus

public expect fun rpcMgmtEnableIdleCleanup(): RpcStatus

public expect fun rpcMgmtEpEltInqBegin(epbinding: ConstPtr, inquirytype: UInt, ifid: ConstPtr, versoption: UInt, objectuuid: ConstPtr, inquirycontext: MutPtr): RpcStatus

public expect fun rpcMgmtEpEltInqDone(inquirycontext: MutPtr): RpcStatus

public expect fun rpcMgmtEpEltInqNextA(inquirycontext: ConstPtr, ifid: MutPtr, binding: MutPtr, objectuuid: MutPtr, annotation: MutPtr): RpcStatus

public expect fun rpcMgmtEpEltInqNextW(inquirycontext: ConstPtr, ifid: MutPtr, binding: MutPtr, objectuuid: MutPtr, annotation: MutPtr): RpcStatus

public expect fun rpcMgmtEpUnregister(epbinding: ConstPtr, ifid: ConstPtr, binding: ConstPtr, objectuuid: ConstPtr): RpcStatus

public expect fun rpcMgmtInqComTimeout(binding: ConstPtr, timeout: MutPtr): RpcStatus

public expect fun rpcMgmtInqDefaultProtectLevel(authnsvc: UInt, authnlevel: MutPtr): RpcStatus

public expect fun rpcMgmtInqIfIds(binding: ConstPtr, ifidvector: MutPtr): RpcStatus

public expect fun rpcMgmtInqServerPrincNameA(binding: ConstPtr, authnsvc: UInt, serverprincname: MutPtr): RpcStatus

public expect fun rpcMgmtInqServerPrincNameW(binding: ConstPtr, authnsvc: UInt, serverprincname: MutPtr): RpcStatus

public expect fun rpcMgmtInqStats(binding: ConstPtr, statistics: MutPtr): RpcStatus

public expect fun rpcMgmtIsServerListening(binding: ConstPtr): RpcStatus

public expect fun rpcMgmtSetAuthorizationFn(authorizationfn: RpcMgmtAuthorizationFn): RpcStatus

public expect fun rpcMgmtSetCancelTimeout(timeout: Int): RpcStatus

public expect fun rpcMgmtSetComTimeout(binding: ConstPtr, timeout: UInt): RpcStatus

public expect fun rpcMgmtSetServerStackSize(threadstacksize: UInt): RpcStatus

public expect fun rpcMgmtStatsVectorFree(statsvector: MutPtr): RpcStatus

public expect fun rpcMgmtStopServerListening(binding: ConstPtr): RpcStatus

public expect fun rpcMgmtWaitServerListen(): RpcStatus

public expect fun rpcNetworkInqProtseqsA(protseqvector: MutPtr): RpcStatus

public expect fun rpcNetworkInqProtseqsW(protseqvector: MutPtr): RpcStatus

public expect fun rpcNetworkIsProtseqValidA(protseq: Pcstr): RpcStatus

public expect fun rpcNetworkIsProtseqValidW(protseq: Pcwstr): RpcStatus

public expect fun rpcNsBindingExportA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: ConstPtr, bindingvec: ConstPtr, objectuuidvec: ConstPtr): RpcStatus

public expect fun rpcNsBindingExportPnPA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: ConstPtr, objectvector: ConstPtr): RpcStatus

public expect fun rpcNsBindingExportPnPW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: ConstPtr, objectvector: ConstPtr): RpcStatus

public expect fun rpcNsBindingExportW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: ConstPtr, bindingvec: ConstPtr, objectuuidvec: ConstPtr): RpcStatus

public expect fun rpcNsBindingImportBeginA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: ConstPtr, objuuid: ConstPtr, importcontext: MutPtr): RpcStatus

public expect fun rpcNsBindingImportBeginW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: ConstPtr, objuuid: ConstPtr, importcontext: MutPtr): RpcStatus

public expect fun rpcNsBindingImportDone(importcontext: MutPtr): RpcStatus

public expect fun rpcNsBindingImportNext(importcontext: MutPtr, binding: MutPtr): RpcStatus

public expect fun rpcNsBindingInqEntryNameA(binding: ConstPtr, entrynamesyntax: UInt, entryname: MutPtr): RpcStatus

public expect fun rpcNsBindingInqEntryNameW(binding: ConstPtr, entrynamesyntax: UInt, entryname: MutPtr): RpcStatus

public expect fun rpcNsBindingLookupBeginA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: ConstPtr, objuuid: ConstPtr, bindingmaxcount: UInt, lookupcontext: MutPtr): RpcStatus

public expect fun rpcNsBindingLookupBeginW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: ConstPtr, objuuid: ConstPtr, bindingmaxcount: UInt, lookupcontext: MutPtr): RpcStatus

public expect fun rpcNsBindingLookupDone(lookupcontext: MutPtr): RpcStatus

public expect fun rpcNsBindingLookupNext(lookupcontext: MutPtr, bindingvec: MutPtr): RpcStatus

public expect fun rpcNsBindingSelect(bindingvec: MutPtr, binding: MutPtr): RpcStatus

public expect fun rpcNsBindingUnexportA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: ConstPtr, objectuuidvec: ConstPtr): RpcStatus

public expect fun rpcNsBindingUnexportPnPA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: ConstPtr, objectvector: ConstPtr): RpcStatus

public expect fun rpcNsBindingUnexportPnPW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: ConstPtr, objectvector: ConstPtr): RpcStatus

public expect fun rpcNsBindingUnexportW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: ConstPtr, objectuuidvec: ConstPtr): RpcStatus

public expect fun rpcNsEntryExpandNameA(entrynamesyntax: UInt, entryname: Pcstr, expandedname: MutPtr): RpcStatus

public expect fun rpcNsEntryExpandNameW(entrynamesyntax: UInt, entryname: Pcwstr, expandedname: MutPtr): RpcStatus

public expect fun rpcNsEntryObjectInqBeginA(entrynamesyntax: UInt, entryname: Pcstr, inquirycontext: MutPtr): RpcStatus

public expect fun rpcNsEntryObjectInqBeginW(entrynamesyntax: UInt, entryname: Pcwstr, inquirycontext: MutPtr): RpcStatus

public expect fun rpcNsEntryObjectInqDone(inquirycontext: MutPtr): RpcStatus

public expect fun rpcNsEntryObjectInqNext(inquirycontext: MutPtr, objuuid: MutPtr): RpcStatus

public expect fun rpcNsGroupDeleteA(groupnamesyntax: GroupNameSyntax, groupname: Pcstr): RpcStatus

public expect fun rpcNsGroupDeleteW(groupnamesyntax: GroupNameSyntax, groupname: Pcwstr): RpcStatus

public expect fun rpcNsGroupMbrAddA(groupnamesyntax: UInt, groupname: Pcstr, membernamesyntax: UInt, membername: Pcstr): RpcStatus

public expect fun rpcNsGroupMbrAddW(groupnamesyntax: UInt, groupname: Pcwstr, membernamesyntax: UInt, membername: Pcwstr): RpcStatus

public expect fun rpcNsGroupMbrInqBeginA(groupnamesyntax: UInt, groupname: Pcstr, membernamesyntax: UInt, inquirycontext: MutPtr): RpcStatus

public expect fun rpcNsGroupMbrInqBeginW(groupnamesyntax: UInt, groupname: Pcwstr, membernamesyntax: UInt, inquirycontext: MutPtr): RpcStatus

public expect fun rpcNsGroupMbrInqDone(inquirycontext: MutPtr): RpcStatus

public expect fun rpcNsGroupMbrInqNextA(inquirycontext: MutPtr, membername: MutPtr): RpcStatus

public expect fun rpcNsGroupMbrInqNextW(inquirycontext: MutPtr, membername: MutPtr): RpcStatus

public expect fun rpcNsGroupMbrRemoveA(groupnamesyntax: UInt, groupname: Pcstr, membernamesyntax: UInt, membername: Pcstr): RpcStatus

public expect fun rpcNsGroupMbrRemoveW(groupnamesyntax: UInt, groupname: Pcwstr, membernamesyntax: UInt, membername: Pcwstr): RpcStatus

public expect fun rpcNsMgmtBindingUnexportA(entrynamesyntax: UInt, entryname: Pcstr, ifid: ConstPtr, versoption: UInt, objectuuidvec: ConstPtr): RpcStatus

public expect fun rpcNsMgmtBindingUnexportW(entrynamesyntax: UInt, entryname: Pcwstr, ifid: ConstPtr, versoption: UInt, objectuuidvec: ConstPtr): RpcStatus

public expect fun rpcNsMgmtEntryCreateA(entrynamesyntax: UInt, entryname: Pcstr): RpcStatus

public expect fun rpcNsMgmtEntryCreateW(entrynamesyntax: UInt, entryname: Pcwstr): RpcStatus

public expect fun rpcNsMgmtEntryDeleteA(entrynamesyntax: UInt, entryname: Pcstr): RpcStatus

public expect fun rpcNsMgmtEntryDeleteW(entrynamesyntax: UInt, entryname: Pcwstr): RpcStatus

public expect fun rpcNsMgmtEntryInqIfIdsA(entrynamesyntax: UInt, entryname: Pcstr, ifidvec: MutPtr): RpcStatus

public expect fun rpcNsMgmtEntryInqIfIdsW(entrynamesyntax: UInt, entryname: Pcwstr, ifidvec: MutPtr): RpcStatus

public expect fun rpcNsMgmtHandleSetExpAge(nshandle: MutPtr, expirationage: UInt): RpcStatus

public expect fun rpcNsMgmtInqExpAge(expirationage: MutPtr): RpcStatus

public expect fun rpcNsMgmtSetExpAge(expirationage: UInt): RpcStatus

public expect fun rpcNsProfileDeleteA(profilenamesyntax: UInt, profilename: Pcstr): RpcStatus

public expect fun rpcNsProfileDeleteW(profilenamesyntax: UInt, profilename: Pcwstr): RpcStatus

public expect fun rpcNsProfileEltAddA(profilenamesyntax: UInt, profilename: Pcstr, ifid: ConstPtr, membernamesyntax: UInt, membername: Pcstr, priority: UInt, annotation: Pcstr): RpcStatus

public expect fun rpcNsProfileEltAddW(profilenamesyntax: UInt, profilename: Pcwstr, ifid: ConstPtr, membernamesyntax: UInt, membername: Pcwstr, priority: UInt, annotation: Pcwstr): RpcStatus

public expect fun rpcNsProfileEltInqBeginA(profilenamesyntax: UInt, profilename: Pcstr, inquirytype: UInt, ifid: ConstPtr, versoption: UInt, membernamesyntax: UInt, membername: Pcstr, inquirycontext: MutPtr): RpcStatus

public expect fun rpcNsProfileEltInqBeginW(profilenamesyntax: UInt, profilename: Pcwstr, inquirytype: UInt, ifid: ConstPtr, versoption: UInt, membernamesyntax: UInt, membername: Pcwstr, inquirycontext: MutPtr): RpcStatus

public expect fun rpcNsProfileEltInqDone(inquirycontext: MutPtr): RpcStatus

public expect fun rpcNsProfileEltInqNextA(inquirycontext: ConstPtr, ifid: MutPtr, membername: MutPtr, priority: MutPtr, annotation: MutPtr): RpcStatus

public expect fun rpcNsProfileEltInqNextW(inquirycontext: ConstPtr, ifid: MutPtr, membername: MutPtr, priority: MutPtr, annotation: MutPtr): RpcStatus

public expect fun rpcNsProfileEltRemoveA(profilenamesyntax: UInt, profilename: Pcstr, ifid: ConstPtr, membernamesyntax: UInt, membername: Pcstr): RpcStatus

public expect fun rpcNsProfileEltRemoveW(profilenamesyntax: UInt, profilename: Pcwstr, ifid: ConstPtr, membernamesyntax: UInt, membername: Pcwstr): RpcStatus

public expect fun rpcObjectInqType(objuuid: ConstPtr, typeuuid: MutPtr): RpcStatus

public expect fun rpcObjectSetInqFn(inquiryfn: RpcObjectInqFn): RpcStatus

public expect fun rpcObjectSetType(objuuid: ConstPtr, typeuuid: ConstPtr): RpcStatus

public expect fun rpcProtseqVectorFreeA(protseqvector: MutPtr): RpcStatus

public expect fun rpcProtseqVectorFreeW(protseqvector: MutPtr): RpcStatus

public expect fun rpcRaiseException(exception: RpcStatus)

public expect fun rpcRevertContainerImpersonation(): RpcStatus

public expect fun rpcRevertToSelf(): RpcStatus

public expect fun rpcRevertToSelfEx(bindinghandle: ConstPtr): RpcStatus

public expect fun rpcServerCompleteSecurityCallback(bindinghandle: ConstPtr, status: RpcStatus): RpcStatus

public expect fun rpcServerInqBindingHandle(binding: MutPtr): RpcStatus

public expect fun rpcServerInqBindings(bindingvector: MutPtr): RpcStatus

public expect fun rpcServerInqBindingsEx(securitydescriptor: ConstPtr, bindingvector: MutPtr): RpcStatus

public expect fun rpcServerInqCallAttributesA(clientbinding: ConstPtr, rpccallattributes: MutPtr): RpcStatus

public expect fun rpcServerInqCallAttributesW(clientbinding: ConstPtr, rpccallattributes: MutPtr): RpcStatus

public expect fun rpcServerInqDefaultPrincNameA(authnsvc: UInt, princname: MutPtr): RpcStatus

public expect fun rpcServerInqDefaultPrincNameW(authnsvc: UInt, princname: MutPtr): RpcStatus

public expect fun rpcServerInqIf(ifspec: ConstPtr, mgrtypeuuid: ConstPtr, mgrepv: MutPtr): RpcStatus

public expect fun rpcServerInterfaceGroupActivate(ifgroup: ConstPtr): RpcStatus

public expect fun rpcServerInterfaceGroupClose(ifgroup: ConstPtr): RpcStatus

public expect fun rpcServerInterfaceGroupCreateA(interfaces: ConstPtr, numifs: UInt, endpoints: ConstPtr, numendpoints: UInt, idleperiod: UInt, idlecallbackfn: RpcInterfaceGroupIdleCallbackFn, idlecallbackcontext: ConstPtr, ifgroup: MutPtr): RpcStatus

public expect fun rpcServerInterfaceGroupCreateW(interfaces: ConstPtr, numifs: UInt, endpoints: ConstPtr, numendpoints: UInt, idleperiod: UInt, idlecallbackfn: RpcInterfaceGroupIdleCallbackFn, idlecallbackcontext: ConstPtr, ifgroup: MutPtr): RpcStatus

public expect fun rpcServerInterfaceGroupDeactivate(ifgroup: ConstPtr, forcedeactivation: UInt): RpcStatus

public expect fun rpcServerInterfaceGroupInqBindings(ifgroup: ConstPtr, bindingvector: MutPtr): RpcStatus

public expect fun rpcServerListen(minimumcallthreads: UInt, maxcalls: UInt, dontwait: UInt): RpcStatus

public expect fun rpcServerRegisterAuthInfoA(serverprincname: Pcstr, authnsvc: UInt, getkeyfn: RpcAuthKeyRetrievalFn, arg: ConstPtr): RpcStatus

public expect fun rpcServerRegisterAuthInfoW(serverprincname: Pcwstr, authnsvc: UInt, getkeyfn: RpcAuthKeyRetrievalFn, arg: ConstPtr): RpcStatus

public expect fun rpcServerRegisterIf(ifspec: ConstPtr, mgrtypeuuid: ConstPtr, mgrepv: ConstPtr): RpcStatus

public expect fun rpcServerRegisterIf2(ifspec: ConstPtr, mgrtypeuuid: ConstPtr, mgrepv: ConstPtr, flags: UInt, maxcalls: UInt, maxrpcsize: UInt, ifcallbackfn: RpcIfCallbackFn): RpcStatus

public expect fun rpcServerRegisterIf3(ifspec: ConstPtr, mgrtypeuuid: ConstPtr, mgrepv: ConstPtr, flags: UInt, maxcalls: UInt, maxrpcsize: UInt, ifcallback: RpcIfCallbackFn, securitydescriptor: ConstPtr): RpcStatus

public expect fun rpcServerRegisterIfEx(ifspec: ConstPtr, mgrtypeuuid: ConstPtr, mgrepv: ConstPtr, flags: UInt, maxcalls: UInt, ifcallback: RpcIfCallbackFn): RpcStatus

public expect fun rpcServerSubscribeForNotification(binding: ConstPtr, notification: RpcNotifications, notificationtype: RpcNotificationTypes, notificationinfo: ConstPtr): RpcStatus

public expect fun rpcServerTestCancel(bindinghandle: ConstPtr): RpcStatus

public expect fun rpcServerUnregisterIf(ifspec: ConstPtr, mgrtypeuuid: ConstPtr, waitforcallstocomplete: UInt): RpcStatus

public expect fun rpcServerUnregisterIfEx(ifspec: ConstPtr, mgrtypeuuid: ConstPtr, rundowncontexthandles: Int): RpcStatus

public expect fun rpcServerUnsubscribeForNotification(binding: ConstPtr, notification: RpcNotifications, notificationsqueued: MutPtr): RpcStatus

public expect fun rpcServerUseAllProtseqs(maxcalls: UInt, securitydescriptor: ConstPtr): RpcStatus

public expect fun rpcServerUseAllProtseqsEx(maxcalls: UInt, securitydescriptor: ConstPtr, policy: ConstPtr): RpcStatus

public expect fun rpcServerUseAllProtseqsIf(maxcalls: UInt, ifspec: ConstPtr, securitydescriptor: ConstPtr): RpcStatus

public expect fun rpcServerUseAllProtseqsIfEx(maxcalls: UInt, ifspec: ConstPtr, securitydescriptor: ConstPtr, policy: ConstPtr): RpcStatus

public expect fun rpcServerUseProtseqA(protseq: Pcstr, maxcalls: UInt, securitydescriptor: ConstPtr): RpcStatus

public expect fun rpcServerUseProtseqEpA(protseq: Pcstr, maxcalls: UInt, endpoint: Pcstr, securitydescriptor: ConstPtr): RpcStatus

public expect fun rpcServerUseProtseqEpExA(protseq: Pcstr, maxcalls: UInt, endpoint: Pcstr, securitydescriptor: ConstPtr, policy: ConstPtr): RpcStatus

public expect fun rpcServerUseProtseqEpExW(protseq: Pcwstr, maxcalls: UInt, endpoint: Pcwstr, securitydescriptor: ConstPtr, policy: ConstPtr): RpcStatus

public expect fun rpcServerUseProtseqEpW(protseq: Pcwstr, maxcalls: UInt, endpoint: Pcwstr, securitydescriptor: ConstPtr): RpcStatus

public expect fun rpcServerUseProtseqExA(protseq: Pcstr, maxcalls: UInt, securitydescriptor: ConstPtr, policy: ConstPtr): RpcStatus

public expect fun rpcServerUseProtseqExW(protseq: Pcwstr, maxcalls: UInt, securitydescriptor: ConstPtr, policy: ConstPtr): RpcStatus

public expect fun rpcServerUseProtseqIfA(protseq: Pcstr, maxcalls: UInt, ifspec: ConstPtr, securitydescriptor: ConstPtr): RpcStatus

public expect fun rpcServerUseProtseqIfExA(protseq: Pcstr, maxcalls: UInt, ifspec: ConstPtr, securitydescriptor: ConstPtr, policy: ConstPtr): RpcStatus

public expect fun rpcServerUseProtseqIfExW(protseq: Pcwstr, maxcalls: UInt, ifspec: ConstPtr, securitydescriptor: ConstPtr, policy: ConstPtr): RpcStatus

public expect fun rpcServerUseProtseqIfW(protseq: Pcwstr, maxcalls: UInt, ifspec: ConstPtr, securitydescriptor: ConstPtr): RpcStatus

public expect fun rpcServerUseProtseqW(protseq: Pcwstr, maxcalls: UInt, securitydescriptor: ConstPtr): RpcStatus

public expect fun rpcServerYield()

public expect fun rpcSmAllocate(size: ULong, pstatus: MutPtr): MutPtr

public expect fun rpcSmClientFree(pnodetofree: ConstPtr): RpcStatus

public expect fun rpcSmDestroyClientContext(contexthandle: ConstPtr): RpcStatus

public expect fun rpcSmDisableAllocate(): RpcStatus

public expect fun rpcSmEnableAllocate(): RpcStatus

public expect fun rpcSmFree(nodetofree: ConstPtr): RpcStatus

public expect fun rpcSmGetThreadHandle(pstatus: MutPtr): MutPtr

public expect fun rpcSmSetClientAllocFree(clientalloc: RpcClientAlloc, clientfree: RpcClientFree): RpcStatus

public expect fun rpcSmSetThreadHandle(id: ConstPtr): RpcStatus

public expect fun rpcSmSwapClientAllocFree(clientalloc: RpcClientAlloc, clientfree: RpcClientFree, oldclientalloc: MutPtr, oldclientfree: MutPtr): RpcStatus

public expect fun rpcSsAllocate(size: ULong): MutPtr

public expect fun rpcSsContextLockExclusive(serverbindinghandle: ConstPtr, usercontext: ConstPtr): RpcStatus

public expect fun rpcSsContextLockShared(serverbindinghandle: ConstPtr, usercontext: ConstPtr): RpcStatus

public expect fun rpcSsDestroyClientContext(contexthandle: ConstPtr)

public expect fun rpcSsDisableAllocate()

public expect fun rpcSsDontSerializeContext()

public expect fun rpcSsEnableAllocate()

public expect fun rpcSsFree(nodetofree: ConstPtr)

public expect fun rpcSsGetContextBinding(contexthandle: ConstPtr, binding: MutPtr): RpcStatus

public expect fun rpcSsGetThreadHandle(): MutPtr

public expect fun rpcSsSetClientAllocFree(clientalloc: RpcClientAlloc, clientfree: RpcClientFree)

public expect fun rpcSsSetThreadHandle(id: ConstPtr)

public expect fun rpcSsSwapClientAllocFree(clientalloc: RpcClientAlloc, clientfree: RpcClientFree, oldclientalloc: MutPtr, oldclientfree: MutPtr)

public expect fun rpcStringBindingComposeA(objuuid: Pcstr, protseq: Pcstr, networkaddr: Pcstr, endpoint: Pcstr, options: Pcstr, stringbinding: MutPtr): RpcStatus

public expect fun rpcStringBindingComposeW(objuuid: Pcwstr, protseq: Pcwstr, networkaddr: Pcwstr, endpoint: Pcwstr, options: Pcwstr, stringbinding: MutPtr): RpcStatus

public expect fun rpcStringBindingParseA(stringbinding: Pcstr, objuuid: MutPtr, protseq: MutPtr, networkaddr: MutPtr, endpoint: MutPtr, networkoptions: MutPtr): RpcStatus

public expect fun rpcStringBindingParseW(stringbinding: Pcwstr, objuuid: MutPtr, protseq: MutPtr, networkaddr: MutPtr, endpoint: MutPtr, networkoptions: MutPtr): RpcStatus

public expect fun rpcStringFreeA(string: MutPtr): RpcStatus

public expect fun rpcStringFreeW(string: MutPtr): RpcStatus

public expect fun rpcTestCancel(): RpcStatus

public expect fun rpcUserFree(asynchandle: MutPtr, pbuffer: MutPtr)

public expect fun uuidCompare(uuid1: ConstPtr, uuid2: ConstPtr, status: MutPtr): Int

public expect fun uuidCreate(uuid: MutPtr): RpcStatus

public expect fun uuidCreateNil(niluuid: MutPtr): RpcStatus
