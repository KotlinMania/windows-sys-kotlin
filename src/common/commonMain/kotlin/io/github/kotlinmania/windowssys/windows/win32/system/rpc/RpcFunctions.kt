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

public expect fun dceErrorInqTextA(rpcstatus: RpcStatus, errortext: Pstr): RpcStatus

public expect fun dceErrorInqTextW(rpcstatus: RpcStatus, errortext: Pwstr): RpcStatus

public expect fun iunknownAddRefProxy(thisRef: COpaquePointer?): UInt

public expect fun iunknownQueryInterfaceProxy(thisRef: COpaquePointer?, riid: COpaquePointer?, ppvobject: COpaquePointer?): Hresult

public expect fun iunknownReleaseProxy(thisRef: COpaquePointer?): UInt

public expect fun iRpcAllocate(size: UInt): COpaquePointer?

public expect fun iRpcAsyncAbortCall(pasync: COpaquePointer?, exceptioncode: UInt): RpcStatus

public expect fun iRpcAsyncSetHandle(message: COpaquePointer?, pasync: COpaquePointer?): RpcStatus

public expect fun iRpcBindingCopy(sourcebinding: COpaquePointer?, destinationbinding: COpaquePointer?): RpcStatus

public expect fun iRpcBindingCreateNp(servername: Pcwstr, servicename: Pcwstr, networkoptions: Pcwstr, binding: COpaquePointer?): RpcStatus

public expect fun iRpcBindingHandleToAsyncHandle(binding: COpaquePointer?, asynchandle: COpaquePointer?): RpcStatus

public expect fun iRpcBindingInqClientTokenAttributes(binding: COpaquePointer?, tokenid: COpaquePointer?, authenticationid: COpaquePointer?, modifiedid: COpaquePointer?): RpcStatus

public expect fun iRpcBindingInqDynamicEndpointA(binding: COpaquePointer?, dynamicendpoint: COpaquePointer?): RpcStatus

public expect fun iRpcBindingInqDynamicEndpointW(binding: COpaquePointer?, dynamicendpoint: COpaquePointer?): RpcStatus

public expect fun iRpcBindingInqLocalClientPid(binding: COpaquePointer?, pid: COpaquePointer?): RpcStatus

public expect fun iRpcBindingInqMarshalledTargetInfo(binding: COpaquePointer?, marshalledtargetinfosize: COpaquePointer?, marshalledtargetinfo: COpaquePointer?): RpcStatus

public expect fun iRpcBindingInqSecurityContext(binding: COpaquePointer?, securitycontexthandle: COpaquePointer?): RpcStatus

public expect fun iRpcBindingInqSecurityContextKeyInfo(binding: COpaquePointer?, keyinfo: COpaquePointer?): RpcStatus

public expect fun iRpcBindingInqTransportType(binding: COpaquePointer?, type: COpaquePointer?): RpcStatus

public expect fun iRpcBindingInqWireIdForSnego(binding: COpaquePointer?, wireid: COpaquePointer?): RpcStatus

public expect fun iRpcBindingIsClientLocal(bindinghandle: COpaquePointer?, clientlocalflag: COpaquePointer?): RpcStatus

public expect fun iRpcBindingIsServerLocal(binding: COpaquePointer?, serverlocalflag: COpaquePointer?): RpcStatus

public expect fun iRpcBindingSetPrivateOption(hbinding: COpaquePointer?, option: UInt, optionvalue: ULong): RpcStatus

public expect fun iRpcBindingToStaticStringBindingW(binding: COpaquePointer?, stringbinding: COpaquePointer?): RpcStatus

public expect fun iRpcClearMutex(mutex: COpaquePointer?)

public expect fun iRpcDeleteMutex(mutex: COpaquePointer?)

public expect fun iRpcExceptionFilter(exceptioncode: UInt): Int

public expect fun iRpcFree(obj: COpaquePointer?)

public expect fun iRpcFreeBuffer(message: COpaquePointer?): RpcStatus

public expect fun iRpcFreePipeBuffer(message: COpaquePointer?): RpcStatus

public expect fun iRpcGetBuffer(message: COpaquePointer?): RpcStatus

public expect fun iRpcGetBufferWithObject(message: COpaquePointer?, objectuuid: COpaquePointer?): RpcStatus

public expect fun iRpcGetCurrentCallHandle(): COpaquePointer?

public expect fun iRpcGetDefaultSd(ppsecuritydescriptor: COpaquePointer?): RpcStatus

public expect fun iRpcGetExtendedError(): RpcStatus

public expect fun iRpcIfInqTransferSyntaxes(rpcifhandle: COpaquePointer?, transfersyntaxes: COpaquePointer?, transfersyntaxsize: UInt, transfersyntaxcount: COpaquePointer?): RpcStatus

public expect fun iRpcMapWin32Status(status: RpcStatus): Int

public expect fun iRpcMgmtEnableDedicatedThreadPool(): RpcStatus

public expect fun iRpcNegotiateTransferSyntax(message: COpaquePointer?): RpcStatus

public expect fun iRpcNsBindingSetEntryNameA(binding: COpaquePointer?, entrynamesyntax: UInt, entryname: Pcstr): RpcStatus

public expect fun iRpcNsBindingSetEntryNameW(binding: COpaquePointer?, entrynamesyntax: UInt, entryname: Pcwstr): RpcStatus

public expect fun iRpcNsGetBuffer(message: COpaquePointer?): RpcStatus

public expect fun iRpcNsInterfaceExported(entrynamesyntax: UInt, entryname: COpaquePointer?, rpcinterfaceinformation: COpaquePointer?): RpcStatus

public expect fun iRpcNsInterfaceUnexported(entrynamesyntax: UInt, entryname: COpaquePointer?, rpcinterfaceinformation: COpaquePointer?): RpcStatus

public expect fun iRpcNsRaiseException(message: COpaquePointer?, status: RpcStatus)

public expect fun iRpcNsSendReceive(message: COpaquePointer?, handle: COpaquePointer?): RpcStatus

public expect fun iRpcOpenClientProcess(binding: COpaquePointer?, desiredaccess: UInt, clientprocess: COpaquePointer?): RpcStatus

public expect fun iRpcPauseExecution(milliseconds: UInt)

public expect fun iRpcReBindBuffer(message: COpaquePointer?): RpcStatus

public expect fun iRpcReallocPipeBuffer(message: COpaquePointer?, newsize: UInt): RpcStatus

public expect fun iRpcReceive(message: COpaquePointer?, size: UInt): RpcStatus

public expect fun iRpcRecordCalloutFailure(rpcstatus: RpcStatus, calloutstate: COpaquePointer?, dllname: COpaquePointer?)

public expect fun iRpcRequestMutex(mutex: COpaquePointer?)

public expect fun iRpcSend(message: COpaquePointer?): RpcStatus

public expect fun iRpcSendReceive(message: COpaquePointer?): RpcStatus

public expect fun iRpcServerCheckClientRestriction(context: COpaquePointer?): RpcStatus

public expect fun iRpcServerDisableExceptionFilter(): Int

public expect fun iRpcServerGetAssociationId(binding: COpaquePointer?, associationid: COpaquePointer?): RpcStatus

public expect fun iRpcServerInqAddressChangeFn(): COpaquePointer?

public expect fun iRpcServerInqLocalConnAddress(binding: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?, addressformat: COpaquePointer?): RpcStatus

public expect fun iRpcServerInqRemoteConnAddress(binding: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?, addressformat: COpaquePointer?): RpcStatus

public expect fun iRpcServerInqTransportType(type: COpaquePointer?): RpcStatus

public expect fun iRpcServerRegisterForwardFunction(pforwardfunction: COpaquePointer?): RpcStatus

public expect fun iRpcServerSetAddressChangeFn(paddresschangefn: COpaquePointer?): RpcStatus

public expect fun iRpcServerStartService(protseq: Pcwstr, endpoint: Pcwstr, ifspec: COpaquePointer?): RpcStatus

public expect fun iRpcServerSubscribeForDisconnectNotification(binding: COpaquePointer?, hevent: COpaquePointer?): RpcStatus

public expect fun iRpcServerSubscribeForDisconnectNotification2(binding: COpaquePointer?, hevent: COpaquePointer?, subscriptionid: COpaquePointer?): RpcStatus

public expect fun iRpcServerUnsubscribeForDisconnectNotification(binding: COpaquePointer?, subscriptionid: Guid): RpcStatus

public expect fun iRpcServerUseProtseq2A(networkaddress: Pcstr, protseq: Pcstr, maxcalls: UInt, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus

public expect fun iRpcServerUseProtseq2W(networkaddress: Pcwstr, protseq: Pcwstr, maxcalls: UInt, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus

public expect fun iRpcServerUseProtseqEp2A(networkaddress: Pcstr, protseq: Pcstr, maxcalls: UInt, endpoint: Pcstr, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus

public expect fun iRpcServerUseProtseqEp2W(networkaddress: Pcwstr, protseq: Pcwstr, maxcalls: UInt, endpoint: Pcwstr, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus

public expect fun iRpcSessionStrictContextHandle()

public expect fun iRpcSsDontSerializeContext()

public expect fun iRpcSystemHandleTypeSpecificWork(handle: COpaquePointer?, actualtype: UByte, idltype: UByte, marshaldirection: LrpcSystemHandleMarshalDirection): RpcStatus

public expect fun iRpcTurnOnEeinfoPropagation(): RpcStatus

public expect fun iUuidCreate(uuid: COpaquePointer?): RpcStatus

public expect fun mesBufferHandleReset(handle: COpaquePointer?, handlestyle: UInt, operation: MidlEsCode, pbuffer: COpaquePointer?, buffersize: UInt, pencodedsize: COpaquePointer?): RpcStatus

public expect fun mesDecodeBufferHandleCreate(buffer: Pcstr, buffersize: UInt, phandle: COpaquePointer?): RpcStatus

public expect fun mesDecodeIncrementalHandleCreate(userstate: COpaquePointer?, readfn: MidlEsRead, phandle: COpaquePointer?): RpcStatus

public expect fun mesEncodeDynBufferHandleCreate(pbuffer: COpaquePointer?, pencodedsize: COpaquePointer?, phandle: COpaquePointer?): RpcStatus

public expect fun mesEncodeFixedBufferHandleCreate(pbuffer: Pstr, buffersize: UInt, pencodedsize: COpaquePointer?, phandle: COpaquePointer?): RpcStatus

public expect fun mesEncodeIncrementalHandleCreate(userstate: COpaquePointer?, allocfn: MidlEsAlloc, writefn: MidlEsWrite, phandle: COpaquePointer?): RpcStatus

public expect fun mesHandleFree(handle: COpaquePointer?): RpcStatus

public expect fun mesIncrementalHandleReset(handle: COpaquePointer?, userstate: COpaquePointer?, allocfn: MidlEsAlloc, writefn: MidlEsWrite, readfn: MidlEsRead, operation: MidlEsCode): RpcStatus

public expect fun mesInqProcEncodingId(handle: COpaquePointer?, pinterfaceid: COpaquePointer?, pprocnum: COpaquePointer?): RpcStatus

public expect fun nDRCContextBinding(ccontext: Long): COpaquePointer?

public expect fun nDRCContextMarshall(ccontext: Long, pbuff: COpaquePointer?)

public expect fun nDRCContextUnmarshall(pccontext: COpaquePointer?, hbinding: COpaquePointer?, pbuff: COpaquePointer?, datarepresentation: UInt)

public expect fun nDRSContextMarshall(ccontext: COpaquePointer?, pbuff: COpaquePointer?, userrundownin: NdrRundown)

public expect fun nDRSContextMarshall2(bindinghandle: COpaquePointer?, ccontext: COpaquePointer?, pbuff: COpaquePointer?, userrundownin: NdrRundown, ctxguard: COpaquePointer?, flags: UInt)

public expect fun nDRSContextMarshallEx(bindinghandle: COpaquePointer?, ccontext: COpaquePointer?, pbuff: COpaquePointer?, userrundownin: NdrRundown)

public expect fun nDRSContextUnmarshall(pbuff: COpaquePointer?, datarepresentation: UInt): COpaquePointer?

public expect fun nDRSContextUnmarshall2(bindinghandle: COpaquePointer?, pbuff: COpaquePointer?, datarepresentation: UInt, ctxguard: COpaquePointer?, flags: UInt): COpaquePointer?

public expect fun nDRSContextUnmarshallEx(bindinghandle: COpaquePointer?, pbuff: COpaquePointer?, datarepresentation: UInt): COpaquePointer?

public expect fun ndr64AsyncClientCall(pproxyinfo: COpaquePointer?, nprocnum: UInt, preturnvalue: COpaquePointer?, vararg variadicArgs: Long): ClientCallReturn

public expect fun ndr64AsyncServerCall64(prpcmsg: COpaquePointer?)

public expect fun ndr64AsyncServerCallAll(prpcmsg: COpaquePointer?)

public expect fun ndr64DcomAsyncClientCall(pproxyinfo: COpaquePointer?, nprocnum: UInt, preturnvalue: COpaquePointer?, vararg variadicArgs: Long): ClientCallReturn

public expect fun ndr64DcomAsyncStubCall(pthis: COpaquePointer?, pchannel: COpaquePointer?, prpcmsg: COpaquePointer?, pdwstubphase: COpaquePointer?): Int

public expect fun ndrAllocate(pstubmsg: COpaquePointer?, len: ULong): COpaquePointer?

public expect fun ndrAsyncClientCall(pstubdescriptor: COpaquePointer?, pformat: COpaquePointer?, vararg variadicArgs: Long): ClientCallReturn

public expect fun ndrAsyncServerCall(prpcmsg: COpaquePointer?)

public expect fun ndrByteCountPointerBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?)

public expect fun ndrByteCountPointerFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?)

public expect fun ndrByteCountPointerMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer?

public expect fun ndrByteCountPointerUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer?

public expect fun ndrClearOutParameters(pstubmsg: COpaquePointer?, pformat: COpaquePointer?, argaddr: COpaquePointer?)

public expect fun ndrClientCall2(pstubdescriptor: COpaquePointer?, pformat: COpaquePointer?, vararg variadicArgs: Long): ClientCallReturn

public expect fun ndrClientCall3(pproxyinfo: COpaquePointer?, nprocnum: UInt, preturnvalue: COpaquePointer?, vararg variadicArgs: Long): ClientCallReturn

public expect fun ndrClientContextMarshall(pstubmsg: COpaquePointer?, contexthandle: Long, fcheck: Int)

public expect fun ndrClientContextUnmarshall(pstubmsg: COpaquePointer?, pcontexthandle: COpaquePointer?, bindhandle: COpaquePointer?)

public expect fun ndrClientInitialize(prpcmsg: COpaquePointer?, pstubmsg: COpaquePointer?, pstubdescriptor: COpaquePointer?, procnum: UInt)

public expect fun ndrClientInitializeNew(prpcmsg: COpaquePointer?, pstubmsg: COpaquePointer?, pstubdescriptor: COpaquePointer?, procnum: UInt)

public expect fun ndrComplexArrayBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?)

public expect fun ndrComplexArrayFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?)

public expect fun ndrComplexArrayMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer?

public expect fun ndrComplexArrayMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt

public expect fun ndrComplexArrayUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer?

public expect fun ndrComplexStructBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?)

public expect fun ndrComplexStructFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?)

public expect fun ndrComplexStructMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer?

public expect fun ndrComplexStructMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt

public expect fun ndrComplexStructUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer?

public expect fun ndrConformantArrayBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?)

public expect fun ndrConformantArrayFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?)

public expect fun ndrConformantArrayMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer?

public expect fun ndrConformantArrayMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt

public expect fun ndrConformantArrayUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer?

public expect fun ndrConformantStringBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?)

public expect fun ndrConformantStringMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer?

public expect fun ndrConformantStringMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt

public expect fun ndrConformantStringUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer?

public expect fun ndrConformantStructBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?)

public expect fun ndrConformantStructFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?)

public expect fun ndrConformantStructMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer?

public expect fun ndrConformantStructMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt

public expect fun ndrConformantStructUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer?

public expect fun ndrConformantVaryingArrayBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?)

public expect fun ndrConformantVaryingArrayFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?)

public expect fun ndrConformantVaryingArrayMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer?

public expect fun ndrConformantVaryingArrayMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt

public expect fun ndrConformantVaryingArrayUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer?

public expect fun ndrConformantVaryingStructBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?)

public expect fun ndrConformantVaryingStructFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?)

public expect fun ndrConformantVaryingStructMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer?

public expect fun ndrConformantVaryingStructMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt

public expect fun ndrConformantVaryingStructUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer?

public expect fun ndrContextHandleInitialize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer?

public expect fun ndrContextHandleSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?)

public expect fun ndrConvert(pstubmsg: COpaquePointer?, pformat: COpaquePointer?)

public expect fun ndrConvert2(pstubmsg: COpaquePointer?, pformat: COpaquePointer?, numberparams: Int)

public expect fun ndrCorrelationFree(pstubmsg: COpaquePointer?)

public expect fun ndrCorrelationInitialize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, cachesize: UInt, flags: UInt)

public expect fun ndrCorrelationPass(pstubmsg: COpaquePointer?)

public expect fun ndrCreateServerInterfaceFromStub(pstub: COpaquePointer?, pserverif: COpaquePointer?): RpcStatus

public expect fun ndrDcomAsyncClientCall(pstubdescriptor: COpaquePointer?, pformat: COpaquePointer?, vararg variadicArgs: Long): ClientCallReturn

public expect fun ndrDcomAsyncStubCall(pthis: COpaquePointer?, pchannel: COpaquePointer?, prpcmsg: COpaquePointer?, pdwstubphase: COpaquePointer?): Int

public expect fun ndrEncapsulatedUnionBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?)

public expect fun ndrEncapsulatedUnionFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?)

public expect fun ndrEncapsulatedUnionMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer?

public expect fun ndrEncapsulatedUnionMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt

public expect fun ndrEncapsulatedUnionUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer?

public expect fun ndrFixedArrayBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?)

public expect fun ndrFixedArrayFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?)

public expect fun ndrFixedArrayMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer?

public expect fun ndrFixedArrayMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt

public expect fun ndrFixedArrayUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer?

public expect fun ndrFreeBuffer(pstubmsg: COpaquePointer?)

public expect fun ndrFullPointerXlatFree(pxlattables: COpaquePointer?)

public expect fun ndrFullPointerXlatInit(numberofpointers: UInt, xlatside: XlatSide): COpaquePointer?

public expect fun ndrGetBuffer(pstubmsg: COpaquePointer?, bufferlength: UInt, handle: COpaquePointer?): COpaquePointer?

public expect fun ndrGetDcomProtocolVersion(pstubmsg: COpaquePointer?, pversion: COpaquePointer?): Hresult

public expect fun ndrGetUserMarshalInfo(pflags: COpaquePointer?, informationlevel: UInt, pmarshalinfo: COpaquePointer?): RpcStatus

public expect fun ndrInterfacePointerBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?)

public expect fun ndrInterfacePointerFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?)

public expect fun ndrInterfacePointerMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer?

public expect fun ndrInterfacePointerMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt

public expect fun ndrInterfacePointerUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer?

public expect fun ndrMapCommAndFaultStatus(pstubmsg: COpaquePointer?, pcommstatus: COpaquePointer?, pfaultstatus: COpaquePointer?, status: RpcStatus): RpcStatus

public expect fun ndrMesProcEncodeDecode(handle: COpaquePointer?, pstubdesc: COpaquePointer?, pformatstring: COpaquePointer?, vararg variadicArgs: Long)

public expect fun ndrMesProcEncodeDecode2(handle: COpaquePointer?, pstubdesc: COpaquePointer?, pformatstring: COpaquePointer?, vararg variadicArgs: Long): ClientCallReturn

public expect fun ndrMesProcEncodeDecode3(handle: COpaquePointer?, pproxyinfo: COpaquePointer?, nprocnum: UInt, preturnvalue: COpaquePointer?, vararg variadicArgs: Long): ClientCallReturn

public expect fun ndrMesSimpleTypeAlignSize(param0: COpaquePointer?): ULong

public expect fun ndrMesSimpleTypeAlignSizeAll(handle: COpaquePointer?, pproxyinfo: COpaquePointer?): ULong

public expect fun ndrMesSimpleTypeDecode(handle: COpaquePointer?, pobject: COpaquePointer?, size: Short)

public expect fun ndrMesSimpleTypeDecodeAll(handle: COpaquePointer?, pproxyinfo: COpaquePointer?, pobject: COpaquePointer?, size: Short)

public expect fun ndrMesSimpleTypeEncode(handle: COpaquePointer?, pstubdesc: COpaquePointer?, pobject: COpaquePointer?, size: Short)

public expect fun ndrMesSimpleTypeEncodeAll(handle: COpaquePointer?, pproxyinfo: COpaquePointer?, pobject: COpaquePointer?, size: Short)

public expect fun ndrMesTypeAlignSize(handle: COpaquePointer?, pstubdesc: COpaquePointer?, pformatstring: COpaquePointer?, pobject: COpaquePointer?): ULong

public expect fun ndrMesTypeAlignSize2(handle: COpaquePointer?, ppicklinginfo: COpaquePointer?, pstubdesc: COpaquePointer?, pformatstring: COpaquePointer?, pobject: COpaquePointer?): ULong

public expect fun ndrMesTypeAlignSize3(handle: COpaquePointer?, ppicklinginfo: COpaquePointer?, pproxyinfo: COpaquePointer?, arrtypeoffset: COpaquePointer?, ntypeindex: UInt, pobject: COpaquePointer?): ULong

public expect fun ndrMesTypeDecode(handle: COpaquePointer?, pstubdesc: COpaquePointer?, pformatstring: COpaquePointer?, pobject: COpaquePointer?)

public expect fun ndrMesTypeDecode2(handle: COpaquePointer?, ppicklinginfo: COpaquePointer?, pstubdesc: COpaquePointer?, pformatstring: COpaquePointer?, pobject: COpaquePointer?)

public expect fun ndrMesTypeDecode3(handle: COpaquePointer?, ppicklinginfo: COpaquePointer?, pproxyinfo: COpaquePointer?, arrtypeoffset: COpaquePointer?, ntypeindex: UInt, pobject: COpaquePointer?)

public expect fun ndrMesTypeEncode(handle: COpaquePointer?, pstubdesc: COpaquePointer?, pformatstring: COpaquePointer?, pobject: COpaquePointer?)

public expect fun ndrMesTypeEncode2(handle: COpaquePointer?, ppicklinginfo: COpaquePointer?, pstubdesc: COpaquePointer?, pformatstring: COpaquePointer?, pobject: COpaquePointer?)

public expect fun ndrMesTypeEncode3(handle: COpaquePointer?, ppicklinginfo: COpaquePointer?, pproxyinfo: COpaquePointer?, arrtypeoffset: COpaquePointer?, ntypeindex: UInt, pobject: COpaquePointer?)

public expect fun ndrMesTypeFree2(handle: COpaquePointer?, ppicklinginfo: COpaquePointer?, pstubdesc: COpaquePointer?, pformatstring: COpaquePointer?, pobject: COpaquePointer?)

public expect fun ndrMesTypeFree3(handle: COpaquePointer?, ppicklinginfo: COpaquePointer?, pproxyinfo: COpaquePointer?, arrtypeoffset: COpaquePointer?, ntypeindex: UInt, pobject: COpaquePointer?)

public expect fun ndrNonConformantStringBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?)

public expect fun ndrNonConformantStringMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer?

public expect fun ndrNonConformantStringMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt

public expect fun ndrNonConformantStringUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer?

public expect fun ndrNonEncapsulatedUnionBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?)

public expect fun ndrNonEncapsulatedUnionFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?)

public expect fun ndrNonEncapsulatedUnionMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer?

public expect fun ndrNonEncapsulatedUnionMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt

public expect fun ndrNonEncapsulatedUnionUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer?

public expect fun ndrNsGetBuffer(pstubmsg: COpaquePointer?, bufferlength: UInt, handle: COpaquePointer?): COpaquePointer?

public expect fun ndrNsSendReceive(pstubmsg: COpaquePointer?, pbufferend: COpaquePointer?, pautohandle: COpaquePointer?): COpaquePointer?

public expect fun ndrOleAllocate(size: ULong): COpaquePointer?

public expect fun ndrOleFree(nodetofree: COpaquePointer?)

public expect fun ndrPartialIgnoreClientBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?)

public expect fun ndrPartialIgnoreClientMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?)

public expect fun ndrPartialIgnoreServerInitialize(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?)

public expect fun ndrPartialIgnoreServerUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?)

public expect fun ndrPointerBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?)

public expect fun ndrPointerFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?)

public expect fun ndrPointerMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer?

public expect fun ndrPointerMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt

public expect fun ndrPointerUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer?

public expect fun ndrRangeUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer?

public expect fun ndrRpcSmClientAllocate(size: ULong): COpaquePointer?

public expect fun ndrRpcSmClientFree(nodetofree: COpaquePointer?)

public expect fun ndrRpcSmSetClientToOsf(pmessage: COpaquePointer?)

public expect fun ndrRpcSsDefaultAllocate(size: ULong): COpaquePointer?

public expect fun ndrRpcSsDefaultFree(nodetofree: COpaquePointer?)

public expect fun ndrRpcSsDisableAllocate(pmessage: COpaquePointer?)

public expect fun ndrRpcSsEnableAllocate(pmessage: COpaquePointer?)

public expect fun ndrSendReceive(pstubmsg: COpaquePointer?, pbufferend: COpaquePointer?): COpaquePointer?

public expect fun ndrServerCall2(prpcmsg: COpaquePointer?)

public expect fun ndrServerCallAll(prpcmsg: COpaquePointer?)

public expect fun ndrServerCallNdr64(prpcmsg: COpaquePointer?)

public expect fun ndrServerContextMarshall(pstubmsg: COpaquePointer?, contexthandle: COpaquePointer?, rundownroutine: NdrRundown)

public expect fun ndrServerContextNewMarshall(pstubmsg: COpaquePointer?, contexthandle: COpaquePointer?, rundownroutine: NdrRundown, pformat: COpaquePointer?)

public expect fun ndrServerContextNewUnmarshall(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer?

public expect fun ndrServerContextUnmarshall(pstubmsg: COpaquePointer?): COpaquePointer?

public expect fun ndrServerInitialize(prpcmsg: COpaquePointer?, pstubmsg: COpaquePointer?, pstubdescriptor: COpaquePointer?): COpaquePointer?

public expect fun ndrServerInitializeMarshall(prpcmsg: COpaquePointer?, pstubmsg: COpaquePointer?)

public expect fun ndrServerInitializeNew(prpcmsg: COpaquePointer?, pstubmsg: COpaquePointer?, pstubdescriptor: COpaquePointer?): COpaquePointer?

public expect fun ndrServerInitializePartial(prpcmsg: COpaquePointer?, pstubmsg: COpaquePointer?, pstubdescriptor: COpaquePointer?, requestedbuffersize: UInt)

public expect fun ndrServerInitializeUnmarshall(pstubmsg: COpaquePointer?, pstubdescriptor: COpaquePointer?, prpcmsg: COpaquePointer?): COpaquePointer?

public expect fun ndrSimpleStructBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?)

public expect fun ndrSimpleStructFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?)

public expect fun ndrSimpleStructMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer?

public expect fun ndrSimpleStructMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt

public expect fun ndrSimpleStructUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer?

public expect fun ndrSimpleTypeMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, formatchar: UByte)

public expect fun ndrSimpleTypeUnmarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, formatchar: UByte)

public expect fun ndrStubCall2(pthis: COpaquePointer?, pchannel: COpaquePointer?, prpcmsg: COpaquePointer?, pdwstubphase: COpaquePointer?): Int

public expect fun ndrStubCall3(pthis: COpaquePointer?, pchannel: COpaquePointer?, prpcmsg: COpaquePointer?, pdwstubphase: COpaquePointer?): Int

public expect fun ndrUserMarshalBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?)

public expect fun ndrUserMarshalFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?)

public expect fun ndrUserMarshalMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer?

public expect fun ndrUserMarshalMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt

public expect fun ndrUserMarshalSimpleTypeConvert(pflags: COpaquePointer?, pbuffer: COpaquePointer?, formatchar: UByte): COpaquePointer?

public expect fun ndrUserMarshalUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer?

public expect fun ndrVaryingArrayBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?)

public expect fun ndrVaryingArrayFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?)

public expect fun ndrVaryingArrayMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer?

public expect fun ndrVaryingArrayMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt

public expect fun ndrVaryingArrayUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer?

public expect fun ndrXmitOrRepAsBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?)

public expect fun ndrXmitOrRepAsFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?)

public expect fun ndrXmitOrRepAsMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer?

public expect fun ndrXmitOrRepAsMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt

public expect fun ndrXmitOrRepAsUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer?

public expect fun rpcAsyncAbortCall(pasync: COpaquePointer?, exceptioncode: UInt): RpcStatus

public expect fun rpcAsyncCancelCall(pasync: COpaquePointer?, fabort: Bool): RpcStatus

public expect fun rpcAsyncCompleteCall(pasync: COpaquePointer?, reply: COpaquePointer?): RpcStatus

public expect fun rpcAsyncGetCallStatus(pasync: COpaquePointer?): RpcStatus

public expect fun rpcAsyncInitializeHandle(pasync: COpaquePointer?, size: UInt): RpcStatus

public expect fun rpcAsyncRegisterInfo(pasync: COpaquePointer?): RpcStatus

public expect fun rpcBindingBind(pasync: COpaquePointer?, binding: COpaquePointer?, ifspec: COpaquePointer?): RpcStatus

public expect fun rpcBindingCopy(sourcebinding: COpaquePointer?, destinationbinding: COpaquePointer?): RpcStatus

public expect fun rpcBindingCreateA(template: COpaquePointer?, security: COpaquePointer?, options: COpaquePointer?, binding: COpaquePointer?): RpcStatus

public expect fun rpcBindingCreateW(template: COpaquePointer?, security: COpaquePointer?, options: COpaquePointer?, binding: COpaquePointer?): RpcStatus

public expect fun rpcBindingFree(binding: COpaquePointer?): RpcStatus

public expect fun rpcBindingFromStringBindingA(stringbinding: Pcstr, binding: COpaquePointer?): RpcStatus

public expect fun rpcBindingFromStringBindingW(stringbinding: Pcwstr, binding: COpaquePointer?): RpcStatus

public expect fun rpcBindingInqAuthClientA(clientbinding: COpaquePointer?, privs: COpaquePointer?, serverprincname: COpaquePointer?, authnlevel: COpaquePointer?, authnsvc: COpaquePointer?, authzsvc: COpaquePointer?): RpcStatus

public expect fun rpcBindingInqAuthClientExA(clientbinding: COpaquePointer?, privs: COpaquePointer?, serverprincname: COpaquePointer?, authnlevel: COpaquePointer?, authnsvc: COpaquePointer?, authzsvc: COpaquePointer?, flags: UInt): RpcStatus

public expect fun rpcBindingInqAuthClientExW(clientbinding: COpaquePointer?, privs: COpaquePointer?, serverprincname: COpaquePointer?, authnlevel: COpaquePointer?, authnsvc: COpaquePointer?, authzsvc: COpaquePointer?, flags: UInt): RpcStatus

public expect fun rpcBindingInqAuthClientW(clientbinding: COpaquePointer?, privs: COpaquePointer?, serverprincname: COpaquePointer?, authnlevel: COpaquePointer?, authnsvc: COpaquePointer?, authzsvc: COpaquePointer?): RpcStatus

public expect fun rpcBindingInqAuthInfoA(binding: COpaquePointer?, serverprincname: COpaquePointer?, authnlevel: COpaquePointer?, authnsvc: COpaquePointer?, authidentity: COpaquePointer?, authzsvc: COpaquePointer?): RpcStatus

public expect fun rpcBindingInqAuthInfoExA(binding: COpaquePointer?, serverprincname: COpaquePointer?, authnlevel: COpaquePointer?, authnsvc: COpaquePointer?, authidentity: COpaquePointer?, authzsvc: COpaquePointer?, rpcqosversion: UInt, securityqos: COpaquePointer?): RpcStatus

public expect fun rpcBindingInqAuthInfoExW(binding: COpaquePointer?, serverprincname: COpaquePointer?, authnlevel: COpaquePointer?, authnsvc: COpaquePointer?, authidentity: COpaquePointer?, authzsvc: COpaquePointer?, rpcqosversion: UInt, securityqos: COpaquePointer?): RpcStatus

public expect fun rpcBindingInqAuthInfoW(binding: COpaquePointer?, serverprincname: COpaquePointer?, authnlevel: COpaquePointer?, authnsvc: COpaquePointer?, authidentity: COpaquePointer?, authzsvc: COpaquePointer?): RpcStatus

public expect fun rpcBindingInqMaxCalls(binding: COpaquePointer?, maxcalls: COpaquePointer?): RpcStatus

public expect fun rpcBindingInqObject(binding: COpaquePointer?, objectuuid: COpaquePointer?): RpcStatus

public expect fun rpcBindingInqOption(hbinding: COpaquePointer?, option: UInt, poptionvalue: COpaquePointer?): RpcStatus

public expect fun rpcBindingReset(binding: COpaquePointer?): RpcStatus

public expect fun rpcBindingServerFromClient(clientbinding: COpaquePointer?, serverbinding: COpaquePointer?): RpcStatus

public expect fun rpcBindingSetAuthInfoA(binding: COpaquePointer?, serverprincname: Pcstr, authnlevel: UInt, authnsvc: UInt, authidentity: COpaquePointer?, authzsvc: UInt): RpcStatus

public expect fun rpcBindingSetAuthInfoExA(binding: COpaquePointer?, serverprincname: Pcstr, authnlevel: UInt, authnsvc: UInt, authidentity: COpaquePointer?, authzsvc: UInt, securityqos: COpaquePointer?): RpcStatus

public expect fun rpcBindingSetAuthInfoExW(binding: COpaquePointer?, serverprincname: Pcwstr, authnlevel: UInt, authnsvc: UInt, authidentity: COpaquePointer?, authzsvc: UInt, securityqos: COpaquePointer?): RpcStatus

public expect fun rpcBindingSetAuthInfoW(binding: COpaquePointer?, serverprincname: Pcwstr, authnlevel: UInt, authnsvc: UInt, authidentity: COpaquePointer?, authzsvc: UInt): RpcStatus

public expect fun rpcBindingSetObject(binding: COpaquePointer?, objectuuid: COpaquePointer?): RpcStatus

public expect fun rpcBindingSetOption(hbinding: COpaquePointer?, option: UInt, optionvalue: ULong): RpcStatus

public expect fun rpcBindingToStringBindingA(binding: COpaquePointer?, stringbinding: COpaquePointer?): RpcStatus

public expect fun rpcBindingToStringBindingW(binding: COpaquePointer?, stringbinding: COpaquePointer?): RpcStatus

public expect fun rpcBindingUnbind(binding: COpaquePointer?): RpcStatus

public expect fun rpcBindingVectorFree(bindingvector: COpaquePointer?): RpcStatus

public expect fun rpcCancelThread(thread: COpaquePointer?): RpcStatus

public expect fun rpcCancelThreadEx(thread: COpaquePointer?, timeout: Int): RpcStatus

public expect fun rpcCertGeneratePrincipalNameA(context: COpaquePointer?, flags: UInt, pbuffer: COpaquePointer?): RpcStatus

public expect fun rpcCertGeneratePrincipalNameW(context: COpaquePointer?, flags: UInt, pbuffer: COpaquePointer?): RpcStatus

public expect fun rpcEpRegisterA(ifspec: COpaquePointer?, bindingvector: COpaquePointer?, uuidvector: COpaquePointer?, annotation: Pcstr): RpcStatus

public expect fun rpcEpRegisterNoReplaceA(ifspec: COpaquePointer?, bindingvector: COpaquePointer?, uuidvector: COpaquePointer?, annotation: Pcstr): RpcStatus

public expect fun rpcEpRegisterNoReplaceW(ifspec: COpaquePointer?, bindingvector: COpaquePointer?, uuidvector: COpaquePointer?, annotation: Pcwstr): RpcStatus

public expect fun rpcEpRegisterW(ifspec: COpaquePointer?, bindingvector: COpaquePointer?, uuidvector: COpaquePointer?, annotation: Pcwstr): RpcStatus

public expect fun rpcEpResolveBinding(binding: COpaquePointer?, ifspec: COpaquePointer?): RpcStatus

public expect fun rpcEpUnregister(ifspec: COpaquePointer?, bindingvector: COpaquePointer?, uuidvector: COpaquePointer?): RpcStatus

public expect fun rpcErrorAddRecord(errorinfo: COpaquePointer?): RpcStatus

public expect fun rpcErrorClearInformation()

public expect fun rpcErrorEndEnumeration(enumhandle: COpaquePointer?): RpcStatus

public expect fun rpcErrorGetNextRecord(enumhandle: COpaquePointer?, copystrings: Bool, errorinfo: COpaquePointer?): RpcStatus

public expect fun rpcErrorGetNumberOfRecords(enumhandle: COpaquePointer?, records: COpaquePointer?): RpcStatus

public expect fun rpcErrorLoadErrorInfo(errorblob: COpaquePointer?, blobsize: ULong, enumhandle: COpaquePointer?): RpcStatus

public expect fun rpcErrorResetEnumeration(enumhandle: COpaquePointer?): RpcStatus

public expect fun rpcErrorSaveErrorInfo(enumhandle: COpaquePointer?, errorblob: COpaquePointer?, blobsize: COpaquePointer?): RpcStatus

public expect fun rpcErrorStartEnumeration(enumhandle: COpaquePointer?): RpcStatus

public expect fun rpcExceptionFilter(exceptioncode: UInt): Int

public expect fun rpcFreeAuthorizationContext(pauthzclientcontext: COpaquePointer?): RpcStatus

public expect fun rpcGetAuthorizationContextForClient(clientbinding: COpaquePointer?, impersonateonreturn: Bool, reserved1: COpaquePointer?, pexpirationtime: COpaquePointer?, reserved2: Luid, reserved3: UInt, reserved4: COpaquePointer?, pauthzclientcontext: COpaquePointer?): RpcStatus

public expect fun rpcIfIdVectorFree(ifidvector: COpaquePointer?): RpcStatus

public expect fun rpcIfInqId(rpcifhandle: COpaquePointer?, rpcifid: COpaquePointer?): RpcStatus

public expect fun rpcImpersonateClient(bindinghandle: COpaquePointer?): RpcStatus

public expect fun rpcImpersonateClient2(bindinghandle: COpaquePointer?): RpcStatus

public expect fun rpcImpersonateClientContainer(bindinghandle: COpaquePointer?): RpcStatus

public expect fun rpcMgmtEnableIdleCleanup(): RpcStatus

public expect fun rpcMgmtEpEltInqBegin(epbinding: COpaquePointer?, inquirytype: UInt, ifid: COpaquePointer?, versoption: UInt, objectuuid: COpaquePointer?, inquirycontext: COpaquePointer?): RpcStatus

public expect fun rpcMgmtEpEltInqDone(inquirycontext: COpaquePointer?): RpcStatus

public expect fun rpcMgmtEpEltInqNextA(inquirycontext: COpaquePointer?, ifid: COpaquePointer?, binding: COpaquePointer?, objectuuid: COpaquePointer?, annotation: COpaquePointer?): RpcStatus

public expect fun rpcMgmtEpEltInqNextW(inquirycontext: COpaquePointer?, ifid: COpaquePointer?, binding: COpaquePointer?, objectuuid: COpaquePointer?, annotation: COpaquePointer?): RpcStatus

public expect fun rpcMgmtEpUnregister(epbinding: COpaquePointer?, ifid: COpaquePointer?, binding: COpaquePointer?, objectuuid: COpaquePointer?): RpcStatus

public expect fun rpcMgmtInqComTimeout(binding: COpaquePointer?, timeout: COpaquePointer?): RpcStatus

public expect fun rpcMgmtInqDefaultProtectLevel(authnsvc: UInt, authnlevel: COpaquePointer?): RpcStatus

public expect fun rpcMgmtInqIfIds(binding: COpaquePointer?, ifidvector: COpaquePointer?): RpcStatus

public expect fun rpcMgmtInqServerPrincNameA(binding: COpaquePointer?, authnsvc: UInt, serverprincname: COpaquePointer?): RpcStatus

public expect fun rpcMgmtInqServerPrincNameW(binding: COpaquePointer?, authnsvc: UInt, serverprincname: COpaquePointer?): RpcStatus

public expect fun rpcMgmtInqStats(binding: COpaquePointer?, statistics: COpaquePointer?): RpcStatus

public expect fun rpcMgmtIsServerListening(binding: COpaquePointer?): RpcStatus

public expect fun rpcMgmtSetAuthorizationFn(authorizationfn: RpcMgmtAuthorizationFn): RpcStatus

public expect fun rpcMgmtSetCancelTimeout(timeout: Int): RpcStatus

public expect fun rpcMgmtSetComTimeout(binding: COpaquePointer?, timeout: UInt): RpcStatus

public expect fun rpcMgmtSetServerStackSize(threadstacksize: UInt): RpcStatus

public expect fun rpcMgmtStatsVectorFree(statsvector: COpaquePointer?): RpcStatus

public expect fun rpcMgmtStopServerListening(binding: COpaquePointer?): RpcStatus

public expect fun rpcMgmtWaitServerListen(): RpcStatus

public expect fun rpcNetworkInqProtseqsA(protseqvector: COpaquePointer?): RpcStatus

public expect fun rpcNetworkInqProtseqsW(protseqvector: COpaquePointer?): RpcStatus

public expect fun rpcNetworkIsProtseqValidA(protseq: Pcstr): RpcStatus

public expect fun rpcNetworkIsProtseqValidW(protseq: Pcwstr): RpcStatus

public expect fun rpcNsBindingExportA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: COpaquePointer?, bindingvec: COpaquePointer?, objectuuidvec: COpaquePointer?): RpcStatus

public expect fun rpcNsBindingExportPnPA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: COpaquePointer?, objectvector: COpaquePointer?): RpcStatus

public expect fun rpcNsBindingExportPnPW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: COpaquePointer?, objectvector: COpaquePointer?): RpcStatus

public expect fun rpcNsBindingExportW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: COpaquePointer?, bindingvec: COpaquePointer?, objectuuidvec: COpaquePointer?): RpcStatus

public expect fun rpcNsBindingImportBeginA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: COpaquePointer?, objuuid: COpaquePointer?, importcontext: COpaquePointer?): RpcStatus

public expect fun rpcNsBindingImportBeginW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: COpaquePointer?, objuuid: COpaquePointer?, importcontext: COpaquePointer?): RpcStatus

public expect fun rpcNsBindingImportDone(importcontext: COpaquePointer?): RpcStatus

public expect fun rpcNsBindingImportNext(importcontext: COpaquePointer?, binding: COpaquePointer?): RpcStatus

public expect fun rpcNsBindingInqEntryNameA(binding: COpaquePointer?, entrynamesyntax: UInt, entryname: COpaquePointer?): RpcStatus

public expect fun rpcNsBindingInqEntryNameW(binding: COpaquePointer?, entrynamesyntax: UInt, entryname: COpaquePointer?): RpcStatus

public expect fun rpcNsBindingLookupBeginA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: COpaquePointer?, objuuid: COpaquePointer?, bindingmaxcount: UInt, lookupcontext: COpaquePointer?): RpcStatus

public expect fun rpcNsBindingLookupBeginW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: COpaquePointer?, objuuid: COpaquePointer?, bindingmaxcount: UInt, lookupcontext: COpaquePointer?): RpcStatus

public expect fun rpcNsBindingLookupDone(lookupcontext: COpaquePointer?): RpcStatus

public expect fun rpcNsBindingLookupNext(lookupcontext: COpaquePointer?, bindingvec: COpaquePointer?): RpcStatus

public expect fun rpcNsBindingSelect(bindingvec: COpaquePointer?, binding: COpaquePointer?): RpcStatus

public expect fun rpcNsBindingUnexportA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: COpaquePointer?, objectuuidvec: COpaquePointer?): RpcStatus

public expect fun rpcNsBindingUnexportPnPA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: COpaquePointer?, objectvector: COpaquePointer?): RpcStatus

public expect fun rpcNsBindingUnexportPnPW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: COpaquePointer?, objectvector: COpaquePointer?): RpcStatus

public expect fun rpcNsBindingUnexportW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: COpaquePointer?, objectuuidvec: COpaquePointer?): RpcStatus

public expect fun rpcNsEntryExpandNameA(entrynamesyntax: UInt, entryname: Pcstr, expandedname: COpaquePointer?): RpcStatus

public expect fun rpcNsEntryExpandNameW(entrynamesyntax: UInt, entryname: Pcwstr, expandedname: COpaquePointer?): RpcStatus

public expect fun rpcNsEntryObjectInqBeginA(entrynamesyntax: UInt, entryname: Pcstr, inquirycontext: COpaquePointer?): RpcStatus

public expect fun rpcNsEntryObjectInqBeginW(entrynamesyntax: UInt, entryname: Pcwstr, inquirycontext: COpaquePointer?): RpcStatus

public expect fun rpcNsEntryObjectInqDone(inquirycontext: COpaquePointer?): RpcStatus

public expect fun rpcNsEntryObjectInqNext(inquirycontext: COpaquePointer?, objuuid: COpaquePointer?): RpcStatus

public expect fun rpcNsGroupDeleteA(groupnamesyntax: GroupNameSyntax, groupname: Pcstr): RpcStatus

public expect fun rpcNsGroupDeleteW(groupnamesyntax: GroupNameSyntax, groupname: Pcwstr): RpcStatus

public expect fun rpcNsGroupMbrAddA(groupnamesyntax: UInt, groupname: Pcstr, membernamesyntax: UInt, membername: Pcstr): RpcStatus

public expect fun rpcNsGroupMbrAddW(groupnamesyntax: UInt, groupname: Pcwstr, membernamesyntax: UInt, membername: Pcwstr): RpcStatus

public expect fun rpcNsGroupMbrInqBeginA(groupnamesyntax: UInt, groupname: Pcstr, membernamesyntax: UInt, inquirycontext: COpaquePointer?): RpcStatus

public expect fun rpcNsGroupMbrInqBeginW(groupnamesyntax: UInt, groupname: Pcwstr, membernamesyntax: UInt, inquirycontext: COpaquePointer?): RpcStatus

public expect fun rpcNsGroupMbrInqDone(inquirycontext: COpaquePointer?): RpcStatus

public expect fun rpcNsGroupMbrInqNextA(inquirycontext: COpaquePointer?, membername: COpaquePointer?): RpcStatus

public expect fun rpcNsGroupMbrInqNextW(inquirycontext: COpaquePointer?, membername: COpaquePointer?): RpcStatus

public expect fun rpcNsGroupMbrRemoveA(groupnamesyntax: UInt, groupname: Pcstr, membernamesyntax: UInt, membername: Pcstr): RpcStatus

public expect fun rpcNsGroupMbrRemoveW(groupnamesyntax: UInt, groupname: Pcwstr, membernamesyntax: UInt, membername: Pcwstr): RpcStatus

public expect fun rpcNsMgmtBindingUnexportA(entrynamesyntax: UInt, entryname: Pcstr, ifid: COpaquePointer?, versoption: UInt, objectuuidvec: COpaquePointer?): RpcStatus

public expect fun rpcNsMgmtBindingUnexportW(entrynamesyntax: UInt, entryname: Pcwstr, ifid: COpaquePointer?, versoption: UInt, objectuuidvec: COpaquePointer?): RpcStatus

public expect fun rpcNsMgmtEntryCreateA(entrynamesyntax: UInt, entryname: Pcstr): RpcStatus

public expect fun rpcNsMgmtEntryCreateW(entrynamesyntax: UInt, entryname: Pcwstr): RpcStatus

public expect fun rpcNsMgmtEntryDeleteA(entrynamesyntax: UInt, entryname: Pcstr): RpcStatus

public expect fun rpcNsMgmtEntryDeleteW(entrynamesyntax: UInt, entryname: Pcwstr): RpcStatus

public expect fun rpcNsMgmtEntryInqIfIdsA(entrynamesyntax: UInt, entryname: Pcstr, ifidvec: COpaquePointer?): RpcStatus

public expect fun rpcNsMgmtEntryInqIfIdsW(entrynamesyntax: UInt, entryname: Pcwstr, ifidvec: COpaquePointer?): RpcStatus

public expect fun rpcNsMgmtHandleSetExpAge(nshandle: COpaquePointer?, expirationage: UInt): RpcStatus

public expect fun rpcNsMgmtInqExpAge(expirationage: COpaquePointer?): RpcStatus

public expect fun rpcNsMgmtSetExpAge(expirationage: UInt): RpcStatus

public expect fun rpcNsProfileDeleteA(profilenamesyntax: UInt, profilename: Pcstr): RpcStatus

public expect fun rpcNsProfileDeleteW(profilenamesyntax: UInt, profilename: Pcwstr): RpcStatus

public expect fun rpcNsProfileEltAddA(profilenamesyntax: UInt, profilename: Pcstr, ifid: COpaquePointer?, membernamesyntax: UInt, membername: Pcstr, priority: UInt, annotation: Pcstr): RpcStatus

public expect fun rpcNsProfileEltAddW(profilenamesyntax: UInt, profilename: Pcwstr, ifid: COpaquePointer?, membernamesyntax: UInt, membername: Pcwstr, priority: UInt, annotation: Pcwstr): RpcStatus

public expect fun rpcNsProfileEltInqBeginA(profilenamesyntax: UInt, profilename: Pcstr, inquirytype: UInt, ifid: COpaquePointer?, versoption: UInt, membernamesyntax: UInt, membername: Pcstr, inquirycontext: COpaquePointer?): RpcStatus

public expect fun rpcNsProfileEltInqBeginW(profilenamesyntax: UInt, profilename: Pcwstr, inquirytype: UInt, ifid: COpaquePointer?, versoption: UInt, membernamesyntax: UInt, membername: Pcwstr, inquirycontext: COpaquePointer?): RpcStatus

public expect fun rpcNsProfileEltInqDone(inquirycontext: COpaquePointer?): RpcStatus

public expect fun rpcNsProfileEltInqNextA(inquirycontext: COpaquePointer?, ifid: COpaquePointer?, membername: COpaquePointer?, priority: COpaquePointer?, annotation: COpaquePointer?): RpcStatus

public expect fun rpcNsProfileEltInqNextW(inquirycontext: COpaquePointer?, ifid: COpaquePointer?, membername: COpaquePointer?, priority: COpaquePointer?, annotation: COpaquePointer?): RpcStatus

public expect fun rpcNsProfileEltRemoveA(profilenamesyntax: UInt, profilename: Pcstr, ifid: COpaquePointer?, membernamesyntax: UInt, membername: Pcstr): RpcStatus

public expect fun rpcNsProfileEltRemoveW(profilenamesyntax: UInt, profilename: Pcwstr, ifid: COpaquePointer?, membernamesyntax: UInt, membername: Pcwstr): RpcStatus

public expect fun rpcObjectInqType(objuuid: COpaquePointer?, typeuuid: COpaquePointer?): RpcStatus

public expect fun rpcObjectSetInqFn(inquiryfn: RpcObjectInqFn): RpcStatus

public expect fun rpcObjectSetType(objuuid: COpaquePointer?, typeuuid: COpaquePointer?): RpcStatus

public expect fun rpcProtseqVectorFreeA(protseqvector: COpaquePointer?): RpcStatus

public expect fun rpcProtseqVectorFreeW(protseqvector: COpaquePointer?): RpcStatus

public expect fun rpcRaiseException(exception: RpcStatus)

public expect fun rpcRevertContainerImpersonation(): RpcStatus

public expect fun rpcRevertToSelf(): RpcStatus

public expect fun rpcRevertToSelfEx(bindinghandle: COpaquePointer?): RpcStatus

public expect fun rpcServerCompleteSecurityCallback(bindinghandle: COpaquePointer?, status: RpcStatus): RpcStatus

public expect fun rpcServerInqBindingHandle(binding: COpaquePointer?): RpcStatus

public expect fun rpcServerInqBindings(bindingvector: COpaquePointer?): RpcStatus

public expect fun rpcServerInqBindingsEx(securitydescriptor: COpaquePointer?, bindingvector: COpaquePointer?): RpcStatus

public expect fun rpcServerInqCallAttributesA(clientbinding: COpaquePointer?, rpccallattributes: COpaquePointer?): RpcStatus

public expect fun rpcServerInqCallAttributesW(clientbinding: COpaquePointer?, rpccallattributes: COpaquePointer?): RpcStatus

public expect fun rpcServerInqDefaultPrincNameA(authnsvc: UInt, princname: COpaquePointer?): RpcStatus

public expect fun rpcServerInqDefaultPrincNameW(authnsvc: UInt, princname: COpaquePointer?): RpcStatus

public expect fun rpcServerInqIf(ifspec: COpaquePointer?, mgrtypeuuid: COpaquePointer?, mgrepv: COpaquePointer?): RpcStatus

public expect fun rpcServerInterfaceGroupActivate(ifgroup: COpaquePointer?): RpcStatus

public expect fun rpcServerInterfaceGroupClose(ifgroup: COpaquePointer?): RpcStatus

public expect fun rpcServerInterfaceGroupCreateA(interfaces: COpaquePointer?, numifs: UInt, endpoints: COpaquePointer?, numendpoints: UInt, idleperiod: UInt, idlecallbackfn: RpcInterfaceGroupIdleCallbackFn, idlecallbackcontext: COpaquePointer?, ifgroup: COpaquePointer?): RpcStatus

public expect fun rpcServerInterfaceGroupCreateW(interfaces: COpaquePointer?, numifs: UInt, endpoints: COpaquePointer?, numendpoints: UInt, idleperiod: UInt, idlecallbackfn: RpcInterfaceGroupIdleCallbackFn, idlecallbackcontext: COpaquePointer?, ifgroup: COpaquePointer?): RpcStatus

public expect fun rpcServerInterfaceGroupDeactivate(ifgroup: COpaquePointer?, forcedeactivation: UInt): RpcStatus

public expect fun rpcServerInterfaceGroupInqBindings(ifgroup: COpaquePointer?, bindingvector: COpaquePointer?): RpcStatus

public expect fun rpcServerListen(minimumcallthreads: UInt, maxcalls: UInt, dontwait: UInt): RpcStatus

public expect fun rpcServerRegisterAuthInfoA(serverprincname: Pcstr, authnsvc: UInt, getkeyfn: RpcAuthKeyRetrievalFn, arg: COpaquePointer?): RpcStatus

public expect fun rpcServerRegisterAuthInfoW(serverprincname: Pcwstr, authnsvc: UInt, getkeyfn: RpcAuthKeyRetrievalFn, arg: COpaquePointer?): RpcStatus

public expect fun rpcServerRegisterIf(ifspec: COpaquePointer?, mgrtypeuuid: COpaquePointer?, mgrepv: COpaquePointer?): RpcStatus

public expect fun rpcServerRegisterIf2(ifspec: COpaquePointer?, mgrtypeuuid: COpaquePointer?, mgrepv: COpaquePointer?, flags: UInt, maxcalls: UInt, maxrpcsize: UInt, ifcallbackfn: RpcIfCallbackFn): RpcStatus

public expect fun rpcServerRegisterIf3(ifspec: COpaquePointer?, mgrtypeuuid: COpaquePointer?, mgrepv: COpaquePointer?, flags: UInt, maxcalls: UInt, maxrpcsize: UInt, ifcallback: RpcIfCallbackFn, securitydescriptor: COpaquePointer?): RpcStatus

public expect fun rpcServerRegisterIfEx(ifspec: COpaquePointer?, mgrtypeuuid: COpaquePointer?, mgrepv: COpaquePointer?, flags: UInt, maxcalls: UInt, ifcallback: RpcIfCallbackFn): RpcStatus

public expect fun rpcServerSubscribeForNotification(binding: COpaquePointer?, notification: RpcNotifications, notificationtype: RpcNotificationTypes, notificationinfo: COpaquePointer?): RpcStatus

public expect fun rpcServerTestCancel(bindinghandle: COpaquePointer?): RpcStatus

public expect fun rpcServerUnregisterIf(ifspec: COpaquePointer?, mgrtypeuuid: COpaquePointer?, waitforcallstocomplete: UInt): RpcStatus

public expect fun rpcServerUnregisterIfEx(ifspec: COpaquePointer?, mgrtypeuuid: COpaquePointer?, rundowncontexthandles: Int): RpcStatus

public expect fun rpcServerUnsubscribeForNotification(binding: COpaquePointer?, notification: RpcNotifications, notificationsqueued: COpaquePointer?): RpcStatus

public expect fun rpcServerUseAllProtseqs(maxcalls: UInt, securitydescriptor: COpaquePointer?): RpcStatus

public expect fun rpcServerUseAllProtseqsEx(maxcalls: UInt, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus

public expect fun rpcServerUseAllProtseqsIf(maxcalls: UInt, ifspec: COpaquePointer?, securitydescriptor: COpaquePointer?): RpcStatus

public expect fun rpcServerUseAllProtseqsIfEx(maxcalls: UInt, ifspec: COpaquePointer?, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus

public expect fun rpcServerUseProtseqA(protseq: Pcstr, maxcalls: UInt, securitydescriptor: COpaquePointer?): RpcStatus

public expect fun rpcServerUseProtseqEpA(protseq: Pcstr, maxcalls: UInt, endpoint: Pcstr, securitydescriptor: COpaquePointer?): RpcStatus

public expect fun rpcServerUseProtseqEpExA(protseq: Pcstr, maxcalls: UInt, endpoint: Pcstr, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus

public expect fun rpcServerUseProtseqEpExW(protseq: Pcwstr, maxcalls: UInt, endpoint: Pcwstr, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus

public expect fun rpcServerUseProtseqEpW(protseq: Pcwstr, maxcalls: UInt, endpoint: Pcwstr, securitydescriptor: COpaquePointer?): RpcStatus

public expect fun rpcServerUseProtseqExA(protseq: Pcstr, maxcalls: UInt, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus

public expect fun rpcServerUseProtseqExW(protseq: Pcwstr, maxcalls: UInt, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus

public expect fun rpcServerUseProtseqIfA(protseq: Pcstr, maxcalls: UInt, ifspec: COpaquePointer?, securitydescriptor: COpaquePointer?): RpcStatus

public expect fun rpcServerUseProtseqIfExA(protseq: Pcstr, maxcalls: UInt, ifspec: COpaquePointer?, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus

public expect fun rpcServerUseProtseqIfExW(protseq: Pcwstr, maxcalls: UInt, ifspec: COpaquePointer?, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus

public expect fun rpcServerUseProtseqIfW(protseq: Pcwstr, maxcalls: UInt, ifspec: COpaquePointer?, securitydescriptor: COpaquePointer?): RpcStatus

public expect fun rpcServerUseProtseqW(protseq: Pcwstr, maxcalls: UInt, securitydescriptor: COpaquePointer?): RpcStatus

public expect fun rpcServerYield()

public expect fun rpcSmAllocate(size: ULong, pstatus: COpaquePointer?): COpaquePointer?

public expect fun rpcSmClientFree(pnodetofree: COpaquePointer?): RpcStatus

public expect fun rpcSmDestroyClientContext(contexthandle: COpaquePointer?): RpcStatus

public expect fun rpcSmDisableAllocate(): RpcStatus

public expect fun rpcSmEnableAllocate(): RpcStatus

public expect fun rpcSmFree(nodetofree: COpaquePointer?): RpcStatus

public expect fun rpcSmGetThreadHandle(pstatus: COpaquePointer?): COpaquePointer?

public expect fun rpcSmSetClientAllocFree(clientalloc: RpcClientAlloc, clientfree: RpcClientFree): RpcStatus

public expect fun rpcSmSetThreadHandle(id: COpaquePointer?): RpcStatus

public expect fun rpcSmSwapClientAllocFree(clientalloc: RpcClientAlloc, clientfree: RpcClientFree, oldclientalloc: COpaquePointer?, oldclientfree: COpaquePointer?): RpcStatus

public expect fun rpcSsAllocate(size: ULong): COpaquePointer?

public expect fun rpcSsContextLockExclusive(serverbindinghandle: COpaquePointer?, usercontext: COpaquePointer?): RpcStatus

public expect fun rpcSsContextLockShared(serverbindinghandle: COpaquePointer?, usercontext: COpaquePointer?): RpcStatus

public expect fun rpcSsDestroyClientContext(contexthandle: COpaquePointer?)

public expect fun rpcSsDisableAllocate()

public expect fun rpcSsDontSerializeContext()

public expect fun rpcSsEnableAllocate()

public expect fun rpcSsFree(nodetofree: COpaquePointer?)

public expect fun rpcSsGetContextBinding(contexthandle: COpaquePointer?, binding: COpaquePointer?): RpcStatus

public expect fun rpcSsGetThreadHandle(): COpaquePointer?

public expect fun rpcSsSetClientAllocFree(clientalloc: RpcClientAlloc, clientfree: RpcClientFree)

public expect fun rpcSsSetThreadHandle(id: COpaquePointer?)

public expect fun rpcSsSwapClientAllocFree(clientalloc: RpcClientAlloc, clientfree: RpcClientFree, oldclientalloc: COpaquePointer?, oldclientfree: COpaquePointer?)

public expect fun rpcStringBindingComposeA(objuuid: Pcstr, protseq: Pcstr, networkaddr: Pcstr, endpoint: Pcstr, options: Pcstr, stringbinding: COpaquePointer?): RpcStatus

public expect fun rpcStringBindingComposeW(objuuid: Pcwstr, protseq: Pcwstr, networkaddr: Pcwstr, endpoint: Pcwstr, options: Pcwstr, stringbinding: COpaquePointer?): RpcStatus

public expect fun rpcStringBindingParseA(stringbinding: Pcstr, objuuid: COpaquePointer?, protseq: COpaquePointer?, networkaddr: COpaquePointer?, endpoint: COpaquePointer?, networkoptions: COpaquePointer?): RpcStatus

public expect fun rpcStringBindingParseW(stringbinding: Pcwstr, objuuid: COpaquePointer?, protseq: COpaquePointer?, networkaddr: COpaquePointer?, endpoint: COpaquePointer?, networkoptions: COpaquePointer?): RpcStatus

public expect fun rpcStringFreeA(string: COpaquePointer?): RpcStatus

public expect fun rpcStringFreeW(string: COpaquePointer?): RpcStatus

public expect fun rpcTestCancel(): RpcStatus

public expect fun rpcUserFree(asynchandle: COpaquePointer?, pbuffer: COpaquePointer?)

public expect fun uuidCompare(uuid1: COpaquePointer?, uuid2: COpaquePointer?, status: COpaquePointer?): Int

public expect fun uuidCreate(uuid: COpaquePointer?): RpcStatus

public expect fun uuidCreateNil(niluuid: COpaquePointer?): RpcStatus
