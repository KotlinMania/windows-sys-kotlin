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

public expect fun dceErrorInqTextA(rpcstatus: RpcStatus, errortext: Pstr): RpcStatus

public expect fun dceErrorInqTextW(rpcstatus: RpcStatus, errortext: Pwstr): RpcStatus

public expect fun iunknownAddRefProxy(thisRef: MutPtr<CVoid>): UInt

public expect fun iunknownQueryInterfaceProxy(thisRef: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppvobject: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun iunknownReleaseProxy(thisRef: MutPtr<CVoid>): UInt

public expect fun iRpcAllocate(size: UInt): MutPtr<CVoid>

public expect fun iRpcAsyncAbortCall(pasync: ConstPtr<RpcAsyncState>, exceptioncode: UInt): RpcStatus

public expect fun iRpcAsyncSetHandle(message: ConstPtr<RpcMessage>, pasync: ConstPtr<RpcAsyncState>): RpcStatus

public expect fun iRpcBindingCopy(sourcebinding: MutPtr<CVoid>, destinationbinding: MutPtr<MutPtr<CVoid>>): RpcStatus

public expect fun iRpcBindingCreateNp(servername: Pcwstr, servicename: Pcwstr, networkoptions: Pcwstr, binding: MutPtr<MutPtr<CVoid>>): RpcStatus

public expect fun iRpcBindingHandleToAsyncHandle(binding: MutPtr<CVoid>, asynchandle: MutPtr<MutPtr<CVoid>>): RpcStatus

public expect fun iRpcBindingInqClientTokenAttributes(binding: ConstPtr<CVoid>, tokenid: MutPtr<Luid>, authenticationid: MutPtr<Luid>, modifiedid: MutPtr<Luid>): RpcStatus

public expect fun iRpcBindingInqDynamicEndpointA(binding: ConstPtr<CVoid>, dynamicendpoint: MutPtr<Pstr>): RpcStatus

public expect fun iRpcBindingInqDynamicEndpointW(binding: ConstPtr<CVoid>, dynamicendpoint: MutPtr<Pwstr>): RpcStatus

public expect fun iRpcBindingInqLocalClientPid(binding: MutPtr<CVoid>, pid: MutPtr<UInt>): RpcStatus

public expect fun iRpcBindingInqMarshalledTargetInfo(binding: ConstPtr<CVoid>, marshalledtargetinfosize: MutPtr<UInt>, marshalledtargetinfo: MutPtr<Pstr>): RpcStatus

public expect fun iRpcBindingInqSecurityContext(binding: MutPtr<CVoid>, securitycontexthandle: MutPtr<MutPtr<CVoid>>): RpcStatus

public expect fun iRpcBindingInqSecurityContextKeyInfo(binding: ConstPtr<CVoid>, keyinfo: MutPtr<CVoid>): RpcStatus

public expect fun iRpcBindingInqTransportType(binding: MutPtr<CVoid>, type: MutPtr<UInt>): RpcStatus

public expect fun iRpcBindingInqWireIdForSnego(binding: ConstPtr<CVoid>, wireid: MutPtr<UByte>): RpcStatus

public expect fun iRpcBindingIsClientLocal(bindinghandle: MutPtr<CVoid>, clientlocalflag: MutPtr<UInt>): RpcStatus

public expect fun iRpcBindingIsServerLocal(binding: ConstPtr<CVoid>, serverlocalflag: MutPtr<UInt>): RpcStatus

public expect fun iRpcBindingSetPrivateOption(hbinding: ConstPtr<CVoid>, option: UInt, optionvalue: ULong): RpcStatus

public expect fun iRpcBindingToStaticStringBindingW(binding: MutPtr<CVoid>, stringbinding: MutPtr<MutPtr<UShort>>): RpcStatus

public expect fun iRpcClearMutex(mutex: MutPtr<CVoid>)

public expect fun iRpcDeleteMutex(mutex: MutPtr<CVoid>)

public expect fun iRpcExceptionFilter(exceptioncode: UInt): Int

public expect fun iRpcFree(obj: MutPtr<CVoid>)

public expect fun iRpcFreeBuffer(message: MutPtr<RpcMessage>): RpcStatus

public expect fun iRpcFreePipeBuffer(message: MutPtr<RpcMessage>): RpcStatus

public expect fun iRpcGetBuffer(message: MutPtr<RpcMessage>): RpcStatus

public expect fun iRpcGetBufferWithObject(message: MutPtr<RpcMessage>, objectuuid: MutPtr<Guid>): RpcStatus

public expect fun iRpcGetCurrentCallHandle(): MutPtr<CVoid>

public expect fun iRpcGetDefaultSd(ppsecuritydescriptor: MutPtr<MutPtr<CVoid>>): RpcStatus

public expect fun iRpcGetExtendedError(): RpcStatus

public expect fun iRpcIfInqTransferSyntaxes(rpcifhandle: MutPtr<CVoid>, transfersyntaxes: MutPtr<RpcTransferSyntax>, transfersyntaxsize: UInt, transfersyntaxcount: MutPtr<UInt>): RpcStatus

public expect fun iRpcMapWin32Status(status: RpcStatus): Int

public expect fun iRpcMgmtEnableDedicatedThreadPool(): RpcStatus

public expect fun iRpcNegotiateTransferSyntax(message: MutPtr<RpcMessage>): RpcStatus

public expect fun iRpcNsBindingSetEntryNameA(binding: ConstPtr<CVoid>, entrynamesyntax: UInt, entryname: Pcstr): RpcStatus

public expect fun iRpcNsBindingSetEntryNameW(binding: ConstPtr<CVoid>, entrynamesyntax: UInt, entryname: Pcwstr): RpcStatus

public expect fun iRpcNsGetBuffer(message: MutPtr<RpcMessage>): RpcStatus

public expect fun iRpcNsInterfaceExported(entrynamesyntax: UInt, entryname: ConstPtr<UShort>, rpcinterfaceinformation: ConstPtr<RpcServerInterface>): RpcStatus

public expect fun iRpcNsInterfaceUnexported(entrynamesyntax: UInt, entryname: MutPtr<UShort>, rpcinterfaceinformation: MutPtr<RpcServerInterface>): RpcStatus

public expect fun iRpcNsRaiseException(message: MutPtr<RpcMessage>, status: RpcStatus)

public expect fun iRpcNsSendReceive(message: MutPtr<RpcMessage>, handle: MutPtr<MutPtr<CVoid>>): RpcStatus

public expect fun iRpcOpenClientProcess(binding: ConstPtr<CVoid>, desiredaccess: UInt, clientprocess: MutPtr<MutPtr<CVoid>>): RpcStatus

public expect fun iRpcPauseExecution(milliseconds: UInt)

public expect fun iRpcReBindBuffer(message: MutPtr<RpcMessage>): RpcStatus

public expect fun iRpcReallocPipeBuffer(message: ConstPtr<RpcMessage>, newsize: UInt): RpcStatus

public expect fun iRpcReceive(message: MutPtr<RpcMessage>, size: UInt): RpcStatus

public expect fun iRpcRecordCalloutFailure(rpcstatus: RpcStatus, calloutstate: MutPtr<RdrCalloutState>, dllname: MutPtr<UShort>)

public expect fun iRpcRequestMutex(mutex: MutPtr<MutPtr<CVoid>>)

public expect fun iRpcSend(message: MutPtr<RpcMessage>): RpcStatus

public expect fun iRpcSendReceive(message: MutPtr<RpcMessage>): RpcStatus

public expect fun iRpcServerCheckClientRestriction(context: MutPtr<CVoid>): RpcStatus

public expect fun iRpcServerDisableExceptionFilter(): Int

public expect fun iRpcServerGetAssociationId(binding: ConstPtr<CVoid>, associationid: MutPtr<UInt>): RpcStatus

public expect fun iRpcServerInqAddressChangeFn(): MutPtr<RpcAddressChangeFn>

public expect fun iRpcServerInqLocalConnAddress(binding: MutPtr<CVoid>, buffer: MutPtr<CVoid>, buffersize: MutPtr<UInt>, addressformat: MutPtr<UInt>): RpcStatus

public expect fun iRpcServerInqRemoteConnAddress(binding: MutPtr<CVoid>, buffer: MutPtr<CVoid>, buffersize: MutPtr<UInt>, addressformat: MutPtr<UInt>): RpcStatus

public expect fun iRpcServerInqTransportType(type: MutPtr<UInt>): RpcStatus

public expect fun iRpcServerRegisterForwardFunction(pforwardfunction: MutPtr<RpcForwardFunction>): RpcStatus

public expect fun iRpcServerSetAddressChangeFn(paddresschangefn: MutPtr<RpcAddressChangeFn>): RpcStatus

public expect fun iRpcServerStartService(protseq: Pcwstr, endpoint: Pcwstr, ifspec: ConstPtr<CVoid>): RpcStatus

public expect fun iRpcServerSubscribeForDisconnectNotification(binding: ConstPtr<CVoid>, hevent: ConstPtr<CVoid>): RpcStatus

public expect fun iRpcServerSubscribeForDisconnectNotification2(binding: ConstPtr<CVoid>, hevent: ConstPtr<CVoid>, subscriptionid: MutPtr<Guid>): RpcStatus

public expect fun iRpcServerUnsubscribeForDisconnectNotification(binding: ConstPtr<CVoid>, subscriptionid: Guid): RpcStatus

public expect fun iRpcServerUseProtseq2A(networkaddress: Pcstr, protseq: Pcstr, maxcalls: UInt, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<CVoid>): RpcStatus

public expect fun iRpcServerUseProtseq2W(networkaddress: Pcwstr, protseq: Pcwstr, maxcalls: UInt, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<CVoid>): RpcStatus

public expect fun iRpcServerUseProtseqEp2A(networkaddress: Pcstr, protseq: Pcstr, maxcalls: UInt, endpoint: Pcstr, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<CVoid>): RpcStatus

public expect fun iRpcServerUseProtseqEp2W(networkaddress: Pcwstr, protseq: Pcwstr, maxcalls: UInt, endpoint: Pcwstr, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<CVoid>): RpcStatus

public expect fun iRpcSessionStrictContextHandle()

public expect fun iRpcSsDontSerializeContext()

public expect fun iRpcSystemHandleTypeSpecificWork(handle: MutPtr<CVoid>, actualtype: UByte, idltype: UByte, marshaldirection: LrpcSystemHandleMarshalDirection): RpcStatus

public expect fun iRpcTurnOnEeinfoPropagation(): RpcStatus

public expect fun iUuidCreate(uuid: MutPtr<Guid>): RpcStatus

public expect fun mesBufferHandleReset(handle: ConstPtr<CVoid>, handlestyle: UInt, operation: MidlEsCode, pbuffer: ConstPtr<ConstPtr<Byte>>, buffersize: UInt, pencodedsize: MutPtr<UInt>): RpcStatus

public expect fun mesDecodeBufferHandleCreate(buffer: Pcstr, buffersize: UInt, phandle: MutPtr<MutPtr<CVoid>>): RpcStatus

public expect fun mesDecodeIncrementalHandleCreate(userstate: MutPtr<CVoid>, readfn: MidlEsRead, phandle: MutPtr<MutPtr<CVoid>>): RpcStatus

public expect fun mesEncodeDynBufferHandleCreate(pbuffer: MutPtr<MutPtr<Byte>>, pencodedsize: MutPtr<UInt>, phandle: MutPtr<MutPtr<CVoid>>): RpcStatus

public expect fun mesEncodeFixedBufferHandleCreate(pbuffer: Pstr, buffersize: UInt, pencodedsize: MutPtr<UInt>, phandle: MutPtr<MutPtr<CVoid>>): RpcStatus

public expect fun mesEncodeIncrementalHandleCreate(userstate: MutPtr<CVoid>, allocfn: MidlEsAlloc, writefn: MidlEsWrite, phandle: MutPtr<MutPtr<CVoid>>): RpcStatus

public expect fun mesHandleFree(handle: MutPtr<CVoid>): RpcStatus

public expect fun mesIncrementalHandleReset(handle: MutPtr<CVoid>, userstate: MutPtr<CVoid>, allocfn: MidlEsAlloc, writefn: MidlEsWrite, readfn: MidlEsRead, operation: MidlEsCode): RpcStatus

public expect fun mesInqProcEncodingId(handle: MutPtr<CVoid>, pinterfaceid: MutPtr<RpcSyntaxIdentifier>, pprocnum: MutPtr<UInt>): RpcStatus

public expect fun nDRCContextBinding(ccontext: Long): MutPtr<CVoid>

public expect fun nDRCContextMarshall(ccontext: Long, pbuff: MutPtr<CVoid>)

public expect fun nDRCContextUnmarshall(pccontext: MutPtr<Long>, hbinding: ConstPtr<CVoid>, pbuff: ConstPtr<CVoid>, datarepresentation: UInt)

public expect fun nDRSContextMarshall(ccontext: ConstPtr<NdrScontext>, pbuff: MutPtr<CVoid>, userrundownin: NdrRundown)

public expect fun nDRSContextMarshall2(bindinghandle: ConstPtr<CVoid>, ccontext: ConstPtr<NdrScontext>, pbuff: MutPtr<CVoid>, userrundownin: NdrRundown, ctxguard: ConstPtr<CVoid>, flags: UInt)

public expect fun nDRSContextMarshallEx(bindinghandle: ConstPtr<CVoid>, ccontext: ConstPtr<NdrScontext>, pbuff: MutPtr<CVoid>, userrundownin: NdrRundown)

public expect fun nDRSContextUnmarshall(pbuff: ConstPtr<CVoid>, datarepresentation: UInt): MutPtr<NdrScontext>

public expect fun nDRSContextUnmarshall2(bindinghandle: ConstPtr<CVoid>, pbuff: ConstPtr<CVoid>, datarepresentation: UInt, ctxguard: ConstPtr<CVoid>, flags: UInt): MutPtr<NdrScontext>

public expect fun nDRSContextUnmarshallEx(bindinghandle: ConstPtr<CVoid>, pbuff: ConstPtr<CVoid>, datarepresentation: UInt): MutPtr<NdrScontext>

public expect fun ndr64AsyncClientCall(pproxyinfo: MutPtr<MidlStublessProxyInfo>, nprocnum: UInt, preturnvalue: MutPtr<CVoid>, vararg variadicArgs: Long): ClientCallReturn

public expect fun ndr64AsyncServerCall64(prpcmsg: MutPtr<RpcMessage>)

public expect fun ndr64AsyncServerCallAll(prpcmsg: MutPtr<RpcMessage>)

public expect fun ndr64DcomAsyncClientCall(pproxyinfo: MutPtr<MidlStublessProxyInfo>, nprocnum: UInt, preturnvalue: MutPtr<CVoid>, vararg variadicArgs: Long): ClientCallReturn

public expect fun ndr64DcomAsyncStubCall(pthis: MutPtr<CVoid>, pchannel: MutPtr<CVoid>, prpcmsg: MutPtr<RpcMessage>, pdwstubphase: MutPtr<UInt>): Int

public expect fun ndrAllocate(pstubmsg: MutPtr<MidlStubMessage>, len: ULong): MutPtr<CVoid>

public expect fun ndrAsyncClientCall(pstubdescriptor: MutPtr<MidlStubDesc>, pformat: MutPtr<UByte>, vararg variadicArgs: Long): ClientCallReturn

public expect fun ndrAsyncServerCall(prpcmsg: MutPtr<RpcMessage>)

public expect fun ndrByteCountPointerBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>)

public expect fun ndrByteCountPointerFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>)

public expect fun ndrByteCountPointerMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte>

public expect fun ndrByteCountPointerUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte>

public expect fun ndrClearOutParameters(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>, argaddr: MutPtr<CVoid>)

public expect fun ndrClientCall2(pstubdescriptor: MutPtr<MidlStubDesc>, pformat: MutPtr<UByte>, vararg variadicArgs: Long): ClientCallReturn

public expect fun ndrClientCall3(pproxyinfo: MutPtr<MidlStublessProxyInfo>, nprocnum: UInt, preturnvalue: MutPtr<CVoid>, vararg variadicArgs: Long): ClientCallReturn

public expect fun ndrClientContextMarshall(pstubmsg: MutPtr<MidlStubMessage>, contexthandle: Long, fcheck: Int)

public expect fun ndrClientContextUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, pcontexthandle: MutPtr<Long>, bindhandle: MutPtr<CVoid>)

public expect fun ndrClientInitialize(prpcmsg: MutPtr<RpcMessage>, pstubmsg: MutPtr<MidlStubMessage>, pstubdescriptor: MutPtr<MidlStubDesc>, procnum: UInt)

public expect fun ndrClientInitializeNew(prpcmsg: MutPtr<RpcMessage>, pstubmsg: MutPtr<MidlStubMessage>, pstubdescriptor: MutPtr<MidlStubDesc>, procnum: UInt)

public expect fun ndrComplexArrayBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>)

public expect fun ndrComplexArrayFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>)

public expect fun ndrComplexArrayMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte>

public expect fun ndrComplexArrayMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt

public expect fun ndrComplexArrayUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte>

public expect fun ndrComplexStructBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>)

public expect fun ndrComplexStructFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>)

public expect fun ndrComplexStructMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte>

public expect fun ndrComplexStructMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt

public expect fun ndrComplexStructUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte>

public expect fun ndrConformantArrayBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>)

public expect fun ndrConformantArrayFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>)

public expect fun ndrConformantArrayMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte>

public expect fun ndrConformantArrayMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt

public expect fun ndrConformantArrayUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte>

public expect fun ndrConformantStringBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>)

public expect fun ndrConformantStringMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte>

public expect fun ndrConformantStringMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt

public expect fun ndrConformantStringUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte>

public expect fun ndrConformantStructBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>)

public expect fun ndrConformantStructFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>)

public expect fun ndrConformantStructMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte>

public expect fun ndrConformantStructMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt

public expect fun ndrConformantStructUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte>

public expect fun ndrConformantVaryingArrayBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>)

public expect fun ndrConformantVaryingArrayFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>)

public expect fun ndrConformantVaryingArrayMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte>

public expect fun ndrConformantVaryingArrayMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt

public expect fun ndrConformantVaryingArrayUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte>

public expect fun ndrConformantVaryingStructBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>)

public expect fun ndrConformantVaryingStructFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>)

public expect fun ndrConformantVaryingStructMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte>

public expect fun ndrConformantVaryingStructMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt

public expect fun ndrConformantVaryingStructUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte>

public expect fun ndrContextHandleInitialize(pstubmsg: ConstPtr<MidlStubMessage>, pformat: ConstPtr<UByte>): MutPtr<NdrScontext>

public expect fun ndrContextHandleSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>)

public expect fun ndrConvert(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>)

public expect fun ndrConvert2(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>, numberparams: Int)

public expect fun ndrCorrelationFree(pstubmsg: MutPtr<MidlStubMessage>)

public expect fun ndrCorrelationInitialize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<CVoid>, cachesize: UInt, flags: UInt)

public expect fun ndrCorrelationPass(pstubmsg: MutPtr<MidlStubMessage>)

public expect fun ndrCreateServerInterfaceFromStub(pstub: MutPtr<CVoid>, pserverif: MutPtr<RpcServerInterface>): RpcStatus

public expect fun ndrDcomAsyncClientCall(pstubdescriptor: MutPtr<MidlStubDesc>, pformat: MutPtr<UByte>, vararg variadicArgs: Long): ClientCallReturn

public expect fun ndrDcomAsyncStubCall(pthis: MutPtr<CVoid>, pchannel: MutPtr<CVoid>, prpcmsg: MutPtr<RpcMessage>, pdwstubphase: MutPtr<UInt>): Int

public expect fun ndrEncapsulatedUnionBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>)

public expect fun ndrEncapsulatedUnionFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>)

public expect fun ndrEncapsulatedUnionMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte>

public expect fun ndrEncapsulatedUnionMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt

public expect fun ndrEncapsulatedUnionUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte>

public expect fun ndrFixedArrayBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>)

public expect fun ndrFixedArrayFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>)

public expect fun ndrFixedArrayMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte>

public expect fun ndrFixedArrayMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt

public expect fun ndrFixedArrayUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte>

public expect fun ndrFreeBuffer(pstubmsg: MutPtr<MidlStubMessage>)

public expect fun ndrFullPointerXlatFree(pxlattables: MutPtr<FullPtrXlatTables>)

public expect fun ndrFullPointerXlatInit(numberofpointers: UInt, xlatside: XlatSide): MutPtr<FullPtrXlatTables>

public expect fun ndrGetBuffer(pstubmsg: MutPtr<MidlStubMessage>, bufferlength: UInt, handle: MutPtr<CVoid>): MutPtr<UByte>

public expect fun ndrGetDcomProtocolVersion(pstubmsg: MutPtr<MidlStubMessage>, pversion: MutPtr<RpcVersion>): Hresult

public expect fun ndrGetUserMarshalInfo(pflags: ConstPtr<UInt>, informationlevel: UInt, pmarshalinfo: MutPtr<NdrUserMarshalInfo>): RpcStatus

public expect fun ndrInterfacePointerBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>)

public expect fun ndrInterfacePointerFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>)

public expect fun ndrInterfacePointerMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte>

public expect fun ndrInterfacePointerMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt

public expect fun ndrInterfacePointerUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte>

public expect fun ndrMapCommAndFaultStatus(pstubmsg: MutPtr<MidlStubMessage>, pcommstatus: MutPtr<UInt>, pfaultstatus: MutPtr<UInt>, status: RpcStatus): RpcStatus

public expect fun ndrMesProcEncodeDecode(handle: MutPtr<CVoid>, pstubdesc: ConstPtr<MidlStubDesc>, pformatstring: MutPtr<UByte>, vararg variadicArgs: Long)

public expect fun ndrMesProcEncodeDecode2(handle: MutPtr<CVoid>, pstubdesc: ConstPtr<MidlStubDesc>, pformatstring: MutPtr<UByte>, vararg variadicArgs: Long): ClientCallReturn

public expect fun ndrMesProcEncodeDecode3(handle: MutPtr<CVoid>, pproxyinfo: ConstPtr<MidlStublessProxyInfo>, nprocnum: UInt, preturnvalue: MutPtr<CVoid>, vararg variadicArgs: Long): ClientCallReturn

public expect fun ndrMesSimpleTypeAlignSize(param0: MutPtr<CVoid>): ULong

public expect fun ndrMesSimpleTypeAlignSizeAll(handle: MutPtr<CVoid>, pproxyinfo: ConstPtr<MidlStublessProxyInfo>): ULong

public expect fun ndrMesSimpleTypeDecode(handle: MutPtr<CVoid>, pobject: MutPtr<CVoid>, size: Short)

public expect fun ndrMesSimpleTypeDecodeAll(handle: MutPtr<CVoid>, pproxyinfo: ConstPtr<MidlStublessProxyInfo>, pobject: MutPtr<CVoid>, size: Short)

public expect fun ndrMesSimpleTypeEncode(handle: MutPtr<CVoid>, pstubdesc: ConstPtr<MidlStubDesc>, pobject: ConstPtr<CVoid>, size: Short)

public expect fun ndrMesSimpleTypeEncodeAll(handle: MutPtr<CVoid>, pproxyinfo: ConstPtr<MidlStublessProxyInfo>, pobject: ConstPtr<CVoid>, size: Short)

public expect fun ndrMesTypeAlignSize(handle: MutPtr<CVoid>, pstubdesc: ConstPtr<MidlStubDesc>, pformatstring: MutPtr<UByte>, pobject: ConstPtr<CVoid>): ULong

public expect fun ndrMesTypeAlignSize2(handle: MutPtr<CVoid>, ppicklinginfo: ConstPtr<MidlTypePicklingInfo>, pstubdesc: ConstPtr<MidlStubDesc>, pformatstring: MutPtr<UByte>, pobject: ConstPtr<CVoid>): ULong

public expect fun ndrMesTypeAlignSize3(handle: MutPtr<CVoid>, ppicklinginfo: ConstPtr<MidlTypePicklingInfo>, pproxyinfo: ConstPtr<MidlStublessProxyInfo>, arrtypeoffset: ConstPtr<ConstPtr<UInt>>, ntypeindex: UInt, pobject: ConstPtr<CVoid>): ULong

public expect fun ndrMesTypeDecode(handle: MutPtr<CVoid>, pstubdesc: ConstPtr<MidlStubDesc>, pformatstring: MutPtr<UByte>, pobject: MutPtr<CVoid>)

public expect fun ndrMesTypeDecode2(handle: MutPtr<CVoid>, ppicklinginfo: ConstPtr<MidlTypePicklingInfo>, pstubdesc: ConstPtr<MidlStubDesc>, pformatstring: MutPtr<UByte>, pobject: MutPtr<CVoid>)

public expect fun ndrMesTypeDecode3(handle: MutPtr<CVoid>, ppicklinginfo: ConstPtr<MidlTypePicklingInfo>, pproxyinfo: ConstPtr<MidlStublessProxyInfo>, arrtypeoffset: ConstPtr<ConstPtr<UInt>>, ntypeindex: UInt, pobject: MutPtr<CVoid>)

public expect fun ndrMesTypeEncode(handle: MutPtr<CVoid>, pstubdesc: ConstPtr<MidlStubDesc>, pformatstring: MutPtr<UByte>, pobject: ConstPtr<CVoid>)

public expect fun ndrMesTypeEncode2(handle: MutPtr<CVoid>, ppicklinginfo: ConstPtr<MidlTypePicklingInfo>, pstubdesc: ConstPtr<MidlStubDesc>, pformatstring: MutPtr<UByte>, pobject: ConstPtr<CVoid>)

public expect fun ndrMesTypeEncode3(handle: MutPtr<CVoid>, ppicklinginfo: ConstPtr<MidlTypePicklingInfo>, pproxyinfo: ConstPtr<MidlStublessProxyInfo>, arrtypeoffset: ConstPtr<ConstPtr<UInt>>, ntypeindex: UInt, pobject: ConstPtr<CVoid>)

public expect fun ndrMesTypeFree2(handle: MutPtr<CVoid>, ppicklinginfo: ConstPtr<MidlTypePicklingInfo>, pstubdesc: ConstPtr<MidlStubDesc>, pformatstring: MutPtr<UByte>, pobject: MutPtr<CVoid>)

public expect fun ndrMesTypeFree3(handle: MutPtr<CVoid>, ppicklinginfo: ConstPtr<MidlTypePicklingInfo>, pproxyinfo: ConstPtr<MidlStublessProxyInfo>, arrtypeoffset: ConstPtr<ConstPtr<UInt>>, ntypeindex: UInt, pobject: MutPtr<CVoid>)

public expect fun ndrNonConformantStringBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>)

public expect fun ndrNonConformantStringMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte>

public expect fun ndrNonConformantStringMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt

public expect fun ndrNonConformantStringUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte>

public expect fun ndrNonEncapsulatedUnionBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>)

public expect fun ndrNonEncapsulatedUnionFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>)

public expect fun ndrNonEncapsulatedUnionMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte>

public expect fun ndrNonEncapsulatedUnionMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt

public expect fun ndrNonEncapsulatedUnionUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte>

public expect fun ndrNsGetBuffer(pstubmsg: MutPtr<MidlStubMessage>, bufferlength: UInt, handle: MutPtr<CVoid>): MutPtr<UByte>

public expect fun ndrNsSendReceive(pstubmsg: MutPtr<MidlStubMessage>, pbufferend: MutPtr<UByte>, pautohandle: MutPtr<MutPtr<CVoid>>): MutPtr<UByte>

public expect fun ndrOleAllocate(size: ULong): MutPtr<CVoid>

public expect fun ndrOleFree(nodetofree: ConstPtr<CVoid>)

public expect fun ndrPartialIgnoreClientBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<CVoid>)

public expect fun ndrPartialIgnoreClientMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<CVoid>)

public expect fun ndrPartialIgnoreServerInitialize(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<CVoid>>, pformat: MutPtr<UByte>)

public expect fun ndrPartialIgnoreServerUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<CVoid>>)

public expect fun ndrPointerBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>)

public expect fun ndrPointerFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>)

public expect fun ndrPointerMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte>

public expect fun ndrPointerMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt

public expect fun ndrPointerUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte>

public expect fun ndrRangeUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte>

public expect fun ndrRpcSmClientAllocate(size: ULong): MutPtr<CVoid>

public expect fun ndrRpcSmClientFree(nodetofree: ConstPtr<CVoid>)

public expect fun ndrRpcSmSetClientToOsf(pmessage: MutPtr<MidlStubMessage>)

public expect fun ndrRpcSsDefaultAllocate(size: ULong): MutPtr<CVoid>

public expect fun ndrRpcSsDefaultFree(nodetofree: ConstPtr<CVoid>)

public expect fun ndrRpcSsDisableAllocate(pmessage: MutPtr<MidlStubMessage>)

public expect fun ndrRpcSsEnableAllocate(pmessage: MutPtr<MidlStubMessage>)

public expect fun ndrSendReceive(pstubmsg: MutPtr<MidlStubMessage>, pbufferend: MutPtr<UByte>): MutPtr<UByte>

public expect fun ndrServerCall2(prpcmsg: MutPtr<RpcMessage>)

public expect fun ndrServerCallAll(prpcmsg: MutPtr<RpcMessage>)

public expect fun ndrServerCallNdr64(prpcmsg: MutPtr<RpcMessage>)

public expect fun ndrServerContextMarshall(pstubmsg: MutPtr<MidlStubMessage>, contexthandle: MutPtr<NdrScontext>, rundownroutine: NdrRundown)

public expect fun ndrServerContextNewMarshall(pstubmsg: MutPtr<MidlStubMessage>, contexthandle: MutPtr<NdrScontext>, rundownroutine: NdrRundown, pformat: MutPtr<UByte>)

public expect fun ndrServerContextNewUnmarshall(pstubmsg: ConstPtr<MidlStubMessage>, pformat: ConstPtr<UByte>): MutPtr<NdrScontext>

public expect fun ndrServerContextUnmarshall(pstubmsg: MutPtr<MidlStubMessage>): MutPtr<NdrScontext>

public expect fun ndrServerInitialize(prpcmsg: MutPtr<RpcMessage>, pstubmsg: MutPtr<MidlStubMessage>, pstubdescriptor: MutPtr<MidlStubDesc>): MutPtr<UByte>

public expect fun ndrServerInitializeMarshall(prpcmsg: MutPtr<RpcMessage>, pstubmsg: MutPtr<MidlStubMessage>)

public expect fun ndrServerInitializeNew(prpcmsg: MutPtr<RpcMessage>, pstubmsg: MutPtr<MidlStubMessage>, pstubdescriptor: MutPtr<MidlStubDesc>): MutPtr<UByte>

public expect fun ndrServerInitializePartial(prpcmsg: MutPtr<RpcMessage>, pstubmsg: MutPtr<MidlStubMessage>, pstubdescriptor: MutPtr<MidlStubDesc>, requestedbuffersize: UInt)

public expect fun ndrServerInitializeUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, pstubdescriptor: MutPtr<MidlStubDesc>, prpcmsg: MutPtr<RpcMessage>): MutPtr<UByte>

public expect fun ndrSimpleStructBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>)

public expect fun ndrSimpleStructFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>)

public expect fun ndrSimpleStructMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte>

public expect fun ndrSimpleStructMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt

public expect fun ndrSimpleStructUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte>

public expect fun ndrSimpleTypeMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, formatchar: UByte)

public expect fun ndrSimpleTypeUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, formatchar: UByte)

public expect fun ndrStubCall2(pthis: MutPtr<CVoid>, pchannel: MutPtr<CVoid>, prpcmsg: MutPtr<RpcMessage>, pdwstubphase: MutPtr<UInt>): Int

public expect fun ndrStubCall3(pthis: MutPtr<CVoid>, pchannel: MutPtr<CVoid>, prpcmsg: MutPtr<RpcMessage>, pdwstubphase: MutPtr<UInt>): Int

public expect fun ndrUserMarshalBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>)

public expect fun ndrUserMarshalFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>)

public expect fun ndrUserMarshalMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte>

public expect fun ndrUserMarshalMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt

public expect fun ndrUserMarshalSimpleTypeConvert(pflags: MutPtr<UInt>, pbuffer: MutPtr<UByte>, formatchar: UByte): MutPtr<UByte>

public expect fun ndrUserMarshalUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte>

public expect fun ndrVaryingArrayBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>)

public expect fun ndrVaryingArrayFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>)

public expect fun ndrVaryingArrayMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte>

public expect fun ndrVaryingArrayMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt

public expect fun ndrVaryingArrayUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte>

public expect fun ndrXmitOrRepAsBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>)

public expect fun ndrXmitOrRepAsFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>)

public expect fun ndrXmitOrRepAsMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte>

public expect fun ndrXmitOrRepAsMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt

public expect fun ndrXmitOrRepAsUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte>

public expect fun rpcAsyncAbortCall(pasync: MutPtr<RpcAsyncState>, exceptioncode: UInt): RpcStatus

public expect fun rpcAsyncCancelCall(pasync: MutPtr<RpcAsyncState>, fabort: Bool): RpcStatus

public expect fun rpcAsyncCompleteCall(pasync: MutPtr<RpcAsyncState>, reply: MutPtr<CVoid>): RpcStatus

public expect fun rpcAsyncGetCallStatus(pasync: ConstPtr<RpcAsyncState>): RpcStatus

public expect fun rpcAsyncInitializeHandle(pasync: MutPtr<RpcAsyncState>, size: UInt): RpcStatus

public expect fun rpcAsyncRegisterInfo(pasync: ConstPtr<RpcAsyncState>): RpcStatus

public expect fun rpcBindingBind(pasync: ConstPtr<RpcAsyncState>, binding: ConstPtr<CVoid>, ifspec: ConstPtr<CVoid>): RpcStatus

public expect fun rpcBindingCopy(sourcebinding: ConstPtr<CVoid>, destinationbinding: MutPtr<MutPtr<CVoid>>): RpcStatus

public expect fun rpcBindingCreateA(template: ConstPtr<RpcBindingHandleTemplateV1A>, security: ConstPtr<RpcBindingHandleSecurityV1A>, options: ConstPtr<RpcBindingHandleOptionsV1>, binding: MutPtr<MutPtr<CVoid>>): RpcStatus

public expect fun rpcBindingCreateW(template: ConstPtr<RpcBindingHandleTemplateV1W>, security: ConstPtr<RpcBindingHandleSecurityV1W>, options: ConstPtr<RpcBindingHandleOptionsV1>, binding: MutPtr<MutPtr<CVoid>>): RpcStatus

public expect fun rpcBindingFree(binding: MutPtr<MutPtr<CVoid>>): RpcStatus

public expect fun rpcBindingFromStringBindingA(stringbinding: Pcstr, binding: MutPtr<MutPtr<CVoid>>): RpcStatus

public expect fun rpcBindingFromStringBindingW(stringbinding: Pcwstr, binding: MutPtr<MutPtr<CVoid>>): RpcStatus

public expect fun rpcBindingInqAuthClientA(clientbinding: ConstPtr<CVoid>, privs: MutPtr<MutPtr<CVoid>>, serverprincname: MutPtr<Pstr>, authnlevel: MutPtr<UInt>, authnsvc: MutPtr<UInt>, authzsvc: MutPtr<UInt>): RpcStatus

public expect fun rpcBindingInqAuthClientExA(clientbinding: ConstPtr<CVoid>, privs: MutPtr<MutPtr<CVoid>>, serverprincname: MutPtr<Pstr>, authnlevel: MutPtr<UInt>, authnsvc: MutPtr<UInt>, authzsvc: MutPtr<UInt>, flags: UInt): RpcStatus

public expect fun rpcBindingInqAuthClientExW(clientbinding: ConstPtr<CVoid>, privs: MutPtr<MutPtr<CVoid>>, serverprincname: MutPtr<Pwstr>, authnlevel: MutPtr<UInt>, authnsvc: MutPtr<UInt>, authzsvc: MutPtr<UInt>, flags: UInt): RpcStatus

public expect fun rpcBindingInqAuthClientW(clientbinding: ConstPtr<CVoid>, privs: MutPtr<MutPtr<CVoid>>, serverprincname: MutPtr<Pwstr>, authnlevel: MutPtr<UInt>, authnsvc: MutPtr<UInt>, authzsvc: MutPtr<UInt>): RpcStatus

public expect fun rpcBindingInqAuthInfoA(binding: ConstPtr<CVoid>, serverprincname: MutPtr<Pstr>, authnlevel: MutPtr<UInt>, authnsvc: MutPtr<UInt>, authidentity: MutPtr<MutPtr<CVoid>>, authzsvc: MutPtr<UInt>): RpcStatus

public expect fun rpcBindingInqAuthInfoExA(binding: ConstPtr<CVoid>, serverprincname: MutPtr<Pstr>, authnlevel: MutPtr<UInt>, authnsvc: MutPtr<UInt>, authidentity: MutPtr<MutPtr<CVoid>>, authzsvc: MutPtr<UInt>, rpcqosversion: UInt, securityqos: MutPtr<RpcSecurityQos>): RpcStatus

public expect fun rpcBindingInqAuthInfoExW(binding: ConstPtr<CVoid>, serverprincname: MutPtr<Pwstr>, authnlevel: MutPtr<UInt>, authnsvc: MutPtr<UInt>, authidentity: MutPtr<MutPtr<CVoid>>, authzsvc: MutPtr<UInt>, rpcqosversion: UInt, securityqos: MutPtr<RpcSecurityQos>): RpcStatus

public expect fun rpcBindingInqAuthInfoW(binding: ConstPtr<CVoid>, serverprincname: MutPtr<Pwstr>, authnlevel: MutPtr<UInt>, authnsvc: MutPtr<UInt>, authidentity: MutPtr<MutPtr<CVoid>>, authzsvc: MutPtr<UInt>): RpcStatus

public expect fun rpcBindingInqMaxCalls(binding: ConstPtr<CVoid>, maxcalls: MutPtr<UInt>): RpcStatus

public expect fun rpcBindingInqObject(binding: ConstPtr<CVoid>, objectuuid: MutPtr<Guid>): RpcStatus

public expect fun rpcBindingInqOption(hbinding: ConstPtr<CVoid>, option: UInt, poptionvalue: MutPtr<ULong>): RpcStatus

public expect fun rpcBindingReset(binding: ConstPtr<CVoid>): RpcStatus

public expect fun rpcBindingServerFromClient(clientbinding: ConstPtr<CVoid>, serverbinding: MutPtr<MutPtr<CVoid>>): RpcStatus

public expect fun rpcBindingSetAuthInfoA(binding: ConstPtr<CVoid>, serverprincname: Pcstr, authnlevel: UInt, authnsvc: UInt, authidentity: ConstPtr<CVoid>, authzsvc: UInt): RpcStatus

public expect fun rpcBindingSetAuthInfoExA(binding: ConstPtr<CVoid>, serverprincname: Pcstr, authnlevel: UInt, authnsvc: UInt, authidentity: ConstPtr<CVoid>, authzsvc: UInt, securityqos: ConstPtr<RpcSecurityQos>): RpcStatus

public expect fun rpcBindingSetAuthInfoExW(binding: ConstPtr<CVoid>, serverprincname: Pcwstr, authnlevel: UInt, authnsvc: UInt, authidentity: ConstPtr<CVoid>, authzsvc: UInt, securityqos: ConstPtr<RpcSecurityQos>): RpcStatus

public expect fun rpcBindingSetAuthInfoW(binding: ConstPtr<CVoid>, serverprincname: Pcwstr, authnlevel: UInt, authnsvc: UInt, authidentity: ConstPtr<CVoid>, authzsvc: UInt): RpcStatus

public expect fun rpcBindingSetObject(binding: ConstPtr<CVoid>, objectuuid: ConstPtr<Guid>): RpcStatus

public expect fun rpcBindingSetOption(hbinding: ConstPtr<CVoid>, option: UInt, optionvalue: ULong): RpcStatus

public expect fun rpcBindingToStringBindingA(binding: ConstPtr<CVoid>, stringbinding: MutPtr<Pstr>): RpcStatus

public expect fun rpcBindingToStringBindingW(binding: ConstPtr<CVoid>, stringbinding: MutPtr<Pwstr>): RpcStatus

public expect fun rpcBindingUnbind(binding: ConstPtr<CVoid>): RpcStatus

public expect fun rpcBindingVectorFree(bindingvector: MutPtr<MutPtr<RpcBindingVector>>): RpcStatus

public expect fun rpcCancelThread(thread: ConstPtr<CVoid>): RpcStatus

public expect fun rpcCancelThreadEx(thread: ConstPtr<CVoid>, timeout: Int): RpcStatus

public expect fun rpcCertGeneratePrincipalNameA(context: ConstPtr<CertContext>, flags: UInt, pbuffer: MutPtr<Pstr>): RpcStatus

public expect fun rpcCertGeneratePrincipalNameW(context: ConstPtr<CertContext>, flags: UInt, pbuffer: MutPtr<Pwstr>): RpcStatus

public expect fun rpcEpRegisterA(ifspec: ConstPtr<CVoid>, bindingvector: ConstPtr<RpcBindingVector>, uuidvector: ConstPtr<UuidVector>, annotation: Pcstr): RpcStatus

public expect fun rpcEpRegisterNoReplaceA(ifspec: ConstPtr<CVoid>, bindingvector: ConstPtr<RpcBindingVector>, uuidvector: ConstPtr<UuidVector>, annotation: Pcstr): RpcStatus

public expect fun rpcEpRegisterNoReplaceW(ifspec: ConstPtr<CVoid>, bindingvector: ConstPtr<RpcBindingVector>, uuidvector: ConstPtr<UuidVector>, annotation: Pcwstr): RpcStatus

public expect fun rpcEpRegisterW(ifspec: ConstPtr<CVoid>, bindingvector: ConstPtr<RpcBindingVector>, uuidvector: ConstPtr<UuidVector>, annotation: Pcwstr): RpcStatus

public expect fun rpcEpResolveBinding(binding: ConstPtr<CVoid>, ifspec: ConstPtr<CVoid>): RpcStatus

public expect fun rpcEpUnregister(ifspec: ConstPtr<CVoid>, bindingvector: ConstPtr<RpcBindingVector>, uuidvector: ConstPtr<UuidVector>): RpcStatus

public expect fun rpcErrorAddRecord(errorinfo: ConstPtr<RpcExtendedErrorInfo>): RpcStatus

public expect fun rpcErrorClearInformation()

public expect fun rpcErrorEndEnumeration(enumhandle: MutPtr<RpcErrorEnumHandle>): RpcStatus

public expect fun rpcErrorGetNextRecord(enumhandle: ConstPtr<RpcErrorEnumHandle>, copystrings: Bool, errorinfo: MutPtr<RpcExtendedErrorInfo>): RpcStatus

public expect fun rpcErrorGetNumberOfRecords(enumhandle: ConstPtr<RpcErrorEnumHandle>, records: MutPtr<Int>): RpcStatus

public expect fun rpcErrorLoadErrorInfo(errorblob: ConstPtr<CVoid>, blobsize: ULong, enumhandle: MutPtr<RpcErrorEnumHandle>): RpcStatus

public expect fun rpcErrorResetEnumeration(enumhandle: MutPtr<RpcErrorEnumHandle>): RpcStatus

public expect fun rpcErrorSaveErrorInfo(enumhandle: ConstPtr<RpcErrorEnumHandle>, errorblob: MutPtr<MutPtr<CVoid>>, blobsize: MutPtr<ULong>): RpcStatus

public expect fun rpcErrorStartEnumeration(enumhandle: MutPtr<RpcErrorEnumHandle>): RpcStatus

public expect fun rpcExceptionFilter(exceptioncode: UInt): Int

public expect fun rpcFreeAuthorizationContext(pauthzclientcontext: MutPtr<MutPtr<CVoid>>): RpcStatus

public expect fun rpcGetAuthorizationContextForClient(clientbinding: ConstPtr<CVoid>, impersonateonreturn: Bool, reserved1: ConstPtr<CVoid>, pexpirationtime: ConstPtr<Long>, reserved2: Luid, reserved3: UInt, reserved4: ConstPtr<CVoid>, pauthzclientcontext: MutPtr<MutPtr<CVoid>>): RpcStatus

public expect fun rpcIfIdVectorFree(ifidvector: MutPtr<MutPtr<RpcIfIdVector>>): RpcStatus

public expect fun rpcIfInqId(rpcifhandle: ConstPtr<CVoid>, rpcifid: MutPtr<RpcIfId>): RpcStatus

public expect fun rpcImpersonateClient(bindinghandle: ConstPtr<CVoid>): RpcStatus

public expect fun rpcImpersonateClient2(bindinghandle: ConstPtr<CVoid>): RpcStatus

public expect fun rpcImpersonateClientContainer(bindinghandle: ConstPtr<CVoid>): RpcStatus

public expect fun rpcMgmtEnableIdleCleanup(): RpcStatus

public expect fun rpcMgmtEpEltInqBegin(epbinding: ConstPtr<CVoid>, inquirytype: UInt, ifid: ConstPtr<RpcIfId>, versoption: UInt, objectuuid: ConstPtr<Guid>, inquirycontext: MutPtr<MutPtr<MutPtr<CVoid>>>): RpcStatus

public expect fun rpcMgmtEpEltInqDone(inquirycontext: MutPtr<MutPtr<MutPtr<CVoid>>>): RpcStatus

public expect fun rpcMgmtEpEltInqNextA(inquirycontext: ConstPtr<ConstPtr<CVoid>>, ifid: MutPtr<RpcIfId>, binding: MutPtr<MutPtr<CVoid>>, objectuuid: MutPtr<Guid>, annotation: MutPtr<Pstr>): RpcStatus

public expect fun rpcMgmtEpEltInqNextW(inquirycontext: ConstPtr<ConstPtr<CVoid>>, ifid: MutPtr<RpcIfId>, binding: MutPtr<MutPtr<CVoid>>, objectuuid: MutPtr<Guid>, annotation: MutPtr<Pwstr>): RpcStatus

public expect fun rpcMgmtEpUnregister(epbinding: ConstPtr<CVoid>, ifid: ConstPtr<RpcIfId>, binding: ConstPtr<CVoid>, objectuuid: ConstPtr<Guid>): RpcStatus

public expect fun rpcMgmtInqComTimeout(binding: ConstPtr<CVoid>, timeout: MutPtr<UInt>): RpcStatus

public expect fun rpcMgmtInqDefaultProtectLevel(authnsvc: UInt, authnlevel: MutPtr<UInt>): RpcStatus

public expect fun rpcMgmtInqIfIds(binding: ConstPtr<CVoid>, ifidvector: MutPtr<MutPtr<RpcIfIdVector>>): RpcStatus

public expect fun rpcMgmtInqServerPrincNameA(binding: ConstPtr<CVoid>, authnsvc: UInt, serverprincname: MutPtr<Pstr>): RpcStatus

public expect fun rpcMgmtInqServerPrincNameW(binding: ConstPtr<CVoid>, authnsvc: UInt, serverprincname: MutPtr<Pwstr>): RpcStatus

public expect fun rpcMgmtInqStats(binding: ConstPtr<CVoid>, statistics: MutPtr<MutPtr<RpcStatsVector>>): RpcStatus

public expect fun rpcMgmtIsServerListening(binding: ConstPtr<CVoid>): RpcStatus

public expect fun rpcMgmtSetAuthorizationFn(authorizationfn: RpcMgmtAuthorizationFn): RpcStatus

public expect fun rpcMgmtSetCancelTimeout(timeout: Int): RpcStatus

public expect fun rpcMgmtSetComTimeout(binding: ConstPtr<CVoid>, timeout: UInt): RpcStatus

public expect fun rpcMgmtSetServerStackSize(threadstacksize: UInt): RpcStatus

public expect fun rpcMgmtStatsVectorFree(statsvector: MutPtr<MutPtr<RpcStatsVector>>): RpcStatus

public expect fun rpcMgmtStopServerListening(binding: ConstPtr<CVoid>): RpcStatus

public expect fun rpcMgmtWaitServerListen(): RpcStatus

public expect fun rpcNetworkInqProtseqsA(protseqvector: MutPtr<MutPtr<RpcProtseqVectora>>): RpcStatus

public expect fun rpcNetworkInqProtseqsW(protseqvector: MutPtr<MutPtr<RpcProtseqVectorw>>): RpcStatus

public expect fun rpcNetworkIsProtseqValidA(protseq: Pcstr): RpcStatus

public expect fun rpcNetworkIsProtseqValidW(protseq: Pcwstr): RpcStatus

public expect fun rpcNsBindingExportA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: ConstPtr<CVoid>, bindingvec: ConstPtr<RpcBindingVector>, objectuuidvec: ConstPtr<UuidVector>): RpcStatus

public expect fun rpcNsBindingExportPnPA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: ConstPtr<CVoid>, objectvector: ConstPtr<UuidVector>): RpcStatus

public expect fun rpcNsBindingExportPnPW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: ConstPtr<CVoid>, objectvector: ConstPtr<UuidVector>): RpcStatus

public expect fun rpcNsBindingExportW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: ConstPtr<CVoid>, bindingvec: ConstPtr<RpcBindingVector>, objectuuidvec: ConstPtr<UuidVector>): RpcStatus

public expect fun rpcNsBindingImportBeginA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: ConstPtr<CVoid>, objuuid: ConstPtr<Guid>, importcontext: MutPtr<MutPtr<CVoid>>): RpcStatus

public expect fun rpcNsBindingImportBeginW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: ConstPtr<CVoid>, objuuid: ConstPtr<Guid>, importcontext: MutPtr<MutPtr<CVoid>>): RpcStatus

public expect fun rpcNsBindingImportDone(importcontext: MutPtr<MutPtr<CVoid>>): RpcStatus

public expect fun rpcNsBindingImportNext(importcontext: MutPtr<CVoid>, binding: MutPtr<MutPtr<CVoid>>): RpcStatus

public expect fun rpcNsBindingInqEntryNameA(binding: ConstPtr<CVoid>, entrynamesyntax: UInt, entryname: MutPtr<Pstr>): RpcStatus

public expect fun rpcNsBindingInqEntryNameW(binding: ConstPtr<CVoid>, entrynamesyntax: UInt, entryname: MutPtr<Pwstr>): RpcStatus

public expect fun rpcNsBindingLookupBeginA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: ConstPtr<CVoid>, objuuid: ConstPtr<Guid>, bindingmaxcount: UInt, lookupcontext: MutPtr<MutPtr<CVoid>>): RpcStatus

public expect fun rpcNsBindingLookupBeginW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: ConstPtr<CVoid>, objuuid: ConstPtr<Guid>, bindingmaxcount: UInt, lookupcontext: MutPtr<MutPtr<CVoid>>): RpcStatus

public expect fun rpcNsBindingLookupDone(lookupcontext: MutPtr<MutPtr<CVoid>>): RpcStatus

public expect fun rpcNsBindingLookupNext(lookupcontext: MutPtr<CVoid>, bindingvec: MutPtr<MutPtr<RpcBindingVector>>): RpcStatus

public expect fun rpcNsBindingSelect(bindingvec: MutPtr<RpcBindingVector>, binding: MutPtr<MutPtr<CVoid>>): RpcStatus

public expect fun rpcNsBindingUnexportA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: ConstPtr<CVoid>, objectuuidvec: ConstPtr<UuidVector>): RpcStatus

public expect fun rpcNsBindingUnexportPnPA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: ConstPtr<CVoid>, objectvector: ConstPtr<UuidVector>): RpcStatus

public expect fun rpcNsBindingUnexportPnPW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: ConstPtr<CVoid>, objectvector: ConstPtr<UuidVector>): RpcStatus

public expect fun rpcNsBindingUnexportW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: ConstPtr<CVoid>, objectuuidvec: ConstPtr<UuidVector>): RpcStatus

public expect fun rpcNsEntryExpandNameA(entrynamesyntax: UInt, entryname: Pcstr, expandedname: MutPtr<Pstr>): RpcStatus

public expect fun rpcNsEntryExpandNameW(entrynamesyntax: UInt, entryname: Pcwstr, expandedname: MutPtr<Pwstr>): RpcStatus

public expect fun rpcNsEntryObjectInqBeginA(entrynamesyntax: UInt, entryname: Pcstr, inquirycontext: MutPtr<MutPtr<CVoid>>): RpcStatus

public expect fun rpcNsEntryObjectInqBeginW(entrynamesyntax: UInt, entryname: Pcwstr, inquirycontext: MutPtr<MutPtr<CVoid>>): RpcStatus

public expect fun rpcNsEntryObjectInqDone(inquirycontext: MutPtr<MutPtr<CVoid>>): RpcStatus

public expect fun rpcNsEntryObjectInqNext(inquirycontext: MutPtr<CVoid>, objuuid: MutPtr<Guid>): RpcStatus

public expect fun rpcNsGroupDeleteA(groupnamesyntax: GroupNameSyntax, groupname: Pcstr): RpcStatus

public expect fun rpcNsGroupDeleteW(groupnamesyntax: GroupNameSyntax, groupname: Pcwstr): RpcStatus

public expect fun rpcNsGroupMbrAddA(groupnamesyntax: UInt, groupname: Pcstr, membernamesyntax: UInt, membername: Pcstr): RpcStatus

public expect fun rpcNsGroupMbrAddW(groupnamesyntax: UInt, groupname: Pcwstr, membernamesyntax: UInt, membername: Pcwstr): RpcStatus

public expect fun rpcNsGroupMbrInqBeginA(groupnamesyntax: UInt, groupname: Pcstr, membernamesyntax: UInt, inquirycontext: MutPtr<MutPtr<CVoid>>): RpcStatus

public expect fun rpcNsGroupMbrInqBeginW(groupnamesyntax: UInt, groupname: Pcwstr, membernamesyntax: UInt, inquirycontext: MutPtr<MutPtr<CVoid>>): RpcStatus

public expect fun rpcNsGroupMbrInqDone(inquirycontext: MutPtr<MutPtr<CVoid>>): RpcStatus

public expect fun rpcNsGroupMbrInqNextA(inquirycontext: MutPtr<CVoid>, membername: MutPtr<Pstr>): RpcStatus

public expect fun rpcNsGroupMbrInqNextW(inquirycontext: MutPtr<CVoid>, membername: MutPtr<Pwstr>): RpcStatus

public expect fun rpcNsGroupMbrRemoveA(groupnamesyntax: UInt, groupname: Pcstr, membernamesyntax: UInt, membername: Pcstr): RpcStatus

public expect fun rpcNsGroupMbrRemoveW(groupnamesyntax: UInt, groupname: Pcwstr, membernamesyntax: UInt, membername: Pcwstr): RpcStatus

public expect fun rpcNsMgmtBindingUnexportA(entrynamesyntax: UInt, entryname: Pcstr, ifid: ConstPtr<RpcIfId>, versoption: UInt, objectuuidvec: ConstPtr<UuidVector>): RpcStatus

public expect fun rpcNsMgmtBindingUnexportW(entrynamesyntax: UInt, entryname: Pcwstr, ifid: ConstPtr<RpcIfId>, versoption: UInt, objectuuidvec: ConstPtr<UuidVector>): RpcStatus

public expect fun rpcNsMgmtEntryCreateA(entrynamesyntax: UInt, entryname: Pcstr): RpcStatus

public expect fun rpcNsMgmtEntryCreateW(entrynamesyntax: UInt, entryname: Pcwstr): RpcStatus

public expect fun rpcNsMgmtEntryDeleteA(entrynamesyntax: UInt, entryname: Pcstr): RpcStatus

public expect fun rpcNsMgmtEntryDeleteW(entrynamesyntax: UInt, entryname: Pcwstr): RpcStatus

public expect fun rpcNsMgmtEntryInqIfIdsA(entrynamesyntax: UInt, entryname: Pcstr, ifidvec: MutPtr<MutPtr<RpcIfIdVector>>): RpcStatus

public expect fun rpcNsMgmtEntryInqIfIdsW(entrynamesyntax: UInt, entryname: Pcwstr, ifidvec: MutPtr<MutPtr<RpcIfIdVector>>): RpcStatus

public expect fun rpcNsMgmtHandleSetExpAge(nshandle: MutPtr<CVoid>, expirationage: UInt): RpcStatus

public expect fun rpcNsMgmtInqExpAge(expirationage: MutPtr<UInt>): RpcStatus

public expect fun rpcNsMgmtSetExpAge(expirationage: UInt): RpcStatus

public expect fun rpcNsProfileDeleteA(profilenamesyntax: UInt, profilename: Pcstr): RpcStatus

public expect fun rpcNsProfileDeleteW(profilenamesyntax: UInt, profilename: Pcwstr): RpcStatus

public expect fun rpcNsProfileEltAddA(profilenamesyntax: UInt, profilename: Pcstr, ifid: ConstPtr<RpcIfId>, membernamesyntax: UInt, membername: Pcstr, priority: UInt, annotation: Pcstr): RpcStatus

public expect fun rpcNsProfileEltAddW(profilenamesyntax: UInt, profilename: Pcwstr, ifid: ConstPtr<RpcIfId>, membernamesyntax: UInt, membername: Pcwstr, priority: UInt, annotation: Pcwstr): RpcStatus

public expect fun rpcNsProfileEltInqBeginA(profilenamesyntax: UInt, profilename: Pcstr, inquirytype: UInt, ifid: ConstPtr<RpcIfId>, versoption: UInt, membernamesyntax: UInt, membername: Pcstr, inquirycontext: MutPtr<MutPtr<CVoid>>): RpcStatus

public expect fun rpcNsProfileEltInqBeginW(profilenamesyntax: UInt, profilename: Pcwstr, inquirytype: UInt, ifid: ConstPtr<RpcIfId>, versoption: UInt, membernamesyntax: UInt, membername: Pcwstr, inquirycontext: MutPtr<MutPtr<CVoid>>): RpcStatus

public expect fun rpcNsProfileEltInqDone(inquirycontext: MutPtr<MutPtr<CVoid>>): RpcStatus

public expect fun rpcNsProfileEltInqNextA(inquirycontext: ConstPtr<CVoid>, ifid: MutPtr<RpcIfId>, membername: MutPtr<Pstr>, priority: MutPtr<UInt>, annotation: MutPtr<Pstr>): RpcStatus

public expect fun rpcNsProfileEltInqNextW(inquirycontext: ConstPtr<CVoid>, ifid: MutPtr<RpcIfId>, membername: MutPtr<Pwstr>, priority: MutPtr<UInt>, annotation: MutPtr<Pwstr>): RpcStatus

public expect fun rpcNsProfileEltRemoveA(profilenamesyntax: UInt, profilename: Pcstr, ifid: ConstPtr<RpcIfId>, membernamesyntax: UInt, membername: Pcstr): RpcStatus

public expect fun rpcNsProfileEltRemoveW(profilenamesyntax: UInt, profilename: Pcwstr, ifid: ConstPtr<RpcIfId>, membernamesyntax: UInt, membername: Pcwstr): RpcStatus

public expect fun rpcObjectInqType(objuuid: ConstPtr<Guid>, typeuuid: MutPtr<Guid>): RpcStatus

public expect fun rpcObjectSetInqFn(inquiryfn: RpcObjectInqFn): RpcStatus

public expect fun rpcObjectSetType(objuuid: ConstPtr<Guid>, typeuuid: ConstPtr<Guid>): RpcStatus

public expect fun rpcProtseqVectorFreeA(protseqvector: MutPtr<MutPtr<RpcProtseqVectora>>): RpcStatus

public expect fun rpcProtseqVectorFreeW(protseqvector: MutPtr<MutPtr<RpcProtseqVectorw>>): RpcStatus

public expect fun rpcRaiseException(exception: RpcStatus)

public expect fun rpcRevertContainerImpersonation(): RpcStatus

public expect fun rpcRevertToSelf(): RpcStatus

public expect fun rpcRevertToSelfEx(bindinghandle: ConstPtr<CVoid>): RpcStatus

public expect fun rpcServerCompleteSecurityCallback(bindinghandle: ConstPtr<CVoid>, status: RpcStatus): RpcStatus

public expect fun rpcServerInqBindingHandle(binding: MutPtr<MutPtr<CVoid>>): RpcStatus

public expect fun rpcServerInqBindings(bindingvector: MutPtr<MutPtr<RpcBindingVector>>): RpcStatus

public expect fun rpcServerInqBindingsEx(securitydescriptor: ConstPtr<CVoid>, bindingvector: MutPtr<MutPtr<RpcBindingVector>>): RpcStatus

public expect fun rpcServerInqCallAttributesA(clientbinding: ConstPtr<CVoid>, rpccallattributes: MutPtr<CVoid>): RpcStatus

public expect fun rpcServerInqCallAttributesW(clientbinding: ConstPtr<CVoid>, rpccallattributes: MutPtr<CVoid>): RpcStatus

public expect fun rpcServerInqDefaultPrincNameA(authnsvc: UInt, princname: MutPtr<Pstr>): RpcStatus

public expect fun rpcServerInqDefaultPrincNameW(authnsvc: UInt, princname: MutPtr<Pwstr>): RpcStatus

public expect fun rpcServerInqIf(ifspec: ConstPtr<CVoid>, mgrtypeuuid: ConstPtr<Guid>, mgrepv: MutPtr<MutPtr<CVoid>>): RpcStatus

public expect fun rpcServerInterfaceGroupActivate(ifgroup: ConstPtr<CVoid>): RpcStatus

public expect fun rpcServerInterfaceGroupClose(ifgroup: ConstPtr<CVoid>): RpcStatus

public expect fun rpcServerInterfaceGroupCreateA(interfaces: ConstPtr<RpcInterfaceTemplatea>, numifs: UInt, endpoints: ConstPtr<RpcEndpointTemplatea>, numendpoints: UInt, idleperiod: UInt, idlecallbackfn: RpcInterfaceGroupIdleCallbackFn, idlecallbackcontext: ConstPtr<CVoid>, ifgroup: MutPtr<MutPtr<CVoid>>): RpcStatus

public expect fun rpcServerInterfaceGroupCreateW(interfaces: ConstPtr<RpcInterfaceTemplatew>, numifs: UInt, endpoints: ConstPtr<RpcEndpointTemplatew>, numendpoints: UInt, idleperiod: UInt, idlecallbackfn: RpcInterfaceGroupIdleCallbackFn, idlecallbackcontext: ConstPtr<CVoid>, ifgroup: MutPtr<MutPtr<CVoid>>): RpcStatus

public expect fun rpcServerInterfaceGroupDeactivate(ifgroup: ConstPtr<CVoid>, forcedeactivation: UInt): RpcStatus

public expect fun rpcServerInterfaceGroupInqBindings(ifgroup: ConstPtr<CVoid>, bindingvector: MutPtr<MutPtr<RpcBindingVector>>): RpcStatus

public expect fun rpcServerListen(minimumcallthreads: UInt, maxcalls: UInt, dontwait: UInt): RpcStatus

public expect fun rpcServerRegisterAuthInfoA(serverprincname: Pcstr, authnsvc: UInt, getkeyfn: RpcAuthKeyRetrievalFn, arg: ConstPtr<CVoid>): RpcStatus

public expect fun rpcServerRegisterAuthInfoW(serverprincname: Pcwstr, authnsvc: UInt, getkeyfn: RpcAuthKeyRetrievalFn, arg: ConstPtr<CVoid>): RpcStatus

public expect fun rpcServerRegisterIf(ifspec: ConstPtr<CVoid>, mgrtypeuuid: ConstPtr<Guid>, mgrepv: ConstPtr<CVoid>): RpcStatus

public expect fun rpcServerRegisterIf2(ifspec: ConstPtr<CVoid>, mgrtypeuuid: ConstPtr<Guid>, mgrepv: ConstPtr<CVoid>, flags: UInt, maxcalls: UInt, maxrpcsize: UInt, ifcallbackfn: RpcIfCallbackFn): RpcStatus

public expect fun rpcServerRegisterIf3(ifspec: ConstPtr<CVoid>, mgrtypeuuid: ConstPtr<Guid>, mgrepv: ConstPtr<CVoid>, flags: UInt, maxcalls: UInt, maxrpcsize: UInt, ifcallback: RpcIfCallbackFn, securitydescriptor: ConstPtr<CVoid>): RpcStatus

public expect fun rpcServerRegisterIfEx(ifspec: ConstPtr<CVoid>, mgrtypeuuid: ConstPtr<Guid>, mgrepv: ConstPtr<CVoid>, flags: UInt, maxcalls: UInt, ifcallback: RpcIfCallbackFn): RpcStatus

public expect fun rpcServerSubscribeForNotification(binding: ConstPtr<CVoid>, notification: RpcNotifications, notificationtype: RpcNotificationTypes, notificationinfo: ConstPtr<RpcAsyncNotificationInfo>): RpcStatus

public expect fun rpcServerTestCancel(bindinghandle: ConstPtr<CVoid>): RpcStatus

public expect fun rpcServerUnregisterIf(ifspec: ConstPtr<CVoid>, mgrtypeuuid: ConstPtr<Guid>, waitforcallstocomplete: UInt): RpcStatus

public expect fun rpcServerUnregisterIfEx(ifspec: ConstPtr<CVoid>, mgrtypeuuid: ConstPtr<Guid>, rundowncontexthandles: Int): RpcStatus

public expect fun rpcServerUnsubscribeForNotification(binding: ConstPtr<CVoid>, notification: RpcNotifications, notificationsqueued: MutPtr<UInt>): RpcStatus

public expect fun rpcServerUseAllProtseqs(maxcalls: UInt, securitydescriptor: ConstPtr<CVoid>): RpcStatus

public expect fun rpcServerUseAllProtseqsEx(maxcalls: UInt, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<RpcPolicy>): RpcStatus

public expect fun rpcServerUseAllProtseqsIf(maxcalls: UInt, ifspec: ConstPtr<CVoid>, securitydescriptor: ConstPtr<CVoid>): RpcStatus

public expect fun rpcServerUseAllProtseqsIfEx(maxcalls: UInt, ifspec: ConstPtr<CVoid>, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<RpcPolicy>): RpcStatus

public expect fun rpcServerUseProtseqA(protseq: Pcstr, maxcalls: UInt, securitydescriptor: ConstPtr<CVoid>): RpcStatus

public expect fun rpcServerUseProtseqEpA(protseq: Pcstr, maxcalls: UInt, endpoint: Pcstr, securitydescriptor: ConstPtr<CVoid>): RpcStatus

public expect fun rpcServerUseProtseqEpExA(protseq: Pcstr, maxcalls: UInt, endpoint: Pcstr, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<RpcPolicy>): RpcStatus

public expect fun rpcServerUseProtseqEpExW(protseq: Pcwstr, maxcalls: UInt, endpoint: Pcwstr, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<RpcPolicy>): RpcStatus

public expect fun rpcServerUseProtseqEpW(protseq: Pcwstr, maxcalls: UInt, endpoint: Pcwstr, securitydescriptor: ConstPtr<CVoid>): RpcStatus

public expect fun rpcServerUseProtseqExA(protseq: Pcstr, maxcalls: UInt, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<RpcPolicy>): RpcStatus

public expect fun rpcServerUseProtseqExW(protseq: Pcwstr, maxcalls: UInt, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<RpcPolicy>): RpcStatus

public expect fun rpcServerUseProtseqIfA(protseq: Pcstr, maxcalls: UInt, ifspec: ConstPtr<CVoid>, securitydescriptor: ConstPtr<CVoid>): RpcStatus

public expect fun rpcServerUseProtseqIfExA(protseq: Pcstr, maxcalls: UInt, ifspec: ConstPtr<CVoid>, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<RpcPolicy>): RpcStatus

public expect fun rpcServerUseProtseqIfExW(protseq: Pcwstr, maxcalls: UInt, ifspec: ConstPtr<CVoid>, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<RpcPolicy>): RpcStatus

public expect fun rpcServerUseProtseqIfW(protseq: Pcwstr, maxcalls: UInt, ifspec: ConstPtr<CVoid>, securitydescriptor: ConstPtr<CVoid>): RpcStatus

public expect fun rpcServerUseProtseqW(protseq: Pcwstr, maxcalls: UInt, securitydescriptor: ConstPtr<CVoid>): RpcStatus

public expect fun rpcServerYield()

public expect fun rpcSmAllocate(size: ULong, pstatus: MutPtr<RpcStatus>): MutPtr<CVoid>

public expect fun rpcSmClientFree(pnodetofree: ConstPtr<CVoid>): RpcStatus

public expect fun rpcSmDestroyClientContext(contexthandle: ConstPtr<ConstPtr<CVoid>>): RpcStatus

public expect fun rpcSmDisableAllocate(): RpcStatus

public expect fun rpcSmEnableAllocate(): RpcStatus

public expect fun rpcSmFree(nodetofree: ConstPtr<CVoid>): RpcStatus

public expect fun rpcSmGetThreadHandle(pstatus: MutPtr<RpcStatus>): MutPtr<CVoid>

public expect fun rpcSmSetClientAllocFree(clientalloc: RpcClientAlloc, clientfree: RpcClientFree): RpcStatus

public expect fun rpcSmSetThreadHandle(id: ConstPtr<CVoid>): RpcStatus

public expect fun rpcSmSwapClientAllocFree(clientalloc: RpcClientAlloc, clientfree: RpcClientFree, oldclientalloc: MutPtr<RpcClientAlloc>, oldclientfree: MutPtr<RpcClientFree>): RpcStatus

public expect fun rpcSsAllocate(size: ULong): MutPtr<CVoid>

public expect fun rpcSsContextLockExclusive(serverbindinghandle: ConstPtr<CVoid>, usercontext: ConstPtr<CVoid>): RpcStatus

public expect fun rpcSsContextLockShared(serverbindinghandle: ConstPtr<CVoid>, usercontext: ConstPtr<CVoid>): RpcStatus

public expect fun rpcSsDestroyClientContext(contexthandle: ConstPtr<ConstPtr<CVoid>>)

public expect fun rpcSsDisableAllocate()

public expect fun rpcSsDontSerializeContext()

public expect fun rpcSsEnableAllocate()

public expect fun rpcSsFree(nodetofree: ConstPtr<CVoid>)

public expect fun rpcSsGetContextBinding(contexthandle: ConstPtr<CVoid>, binding: MutPtr<MutPtr<CVoid>>): RpcStatus

public expect fun rpcSsGetThreadHandle(): MutPtr<CVoid>

public expect fun rpcSsSetClientAllocFree(clientalloc: RpcClientAlloc, clientfree: RpcClientFree)

public expect fun rpcSsSetThreadHandle(id: ConstPtr<CVoid>)

public expect fun rpcSsSwapClientAllocFree(clientalloc: RpcClientAlloc, clientfree: RpcClientFree, oldclientalloc: MutPtr<RpcClientAlloc>, oldclientfree: MutPtr<RpcClientFree>)

public expect fun rpcStringBindingComposeA(objuuid: Pcstr, protseq: Pcstr, networkaddr: Pcstr, endpoint: Pcstr, options: Pcstr, stringbinding: MutPtr<Pstr>): RpcStatus

public expect fun rpcStringBindingComposeW(objuuid: Pcwstr, protseq: Pcwstr, networkaddr: Pcwstr, endpoint: Pcwstr, options: Pcwstr, stringbinding: MutPtr<Pwstr>): RpcStatus

public expect fun rpcStringBindingParseA(stringbinding: Pcstr, objuuid: MutPtr<Pstr>, protseq: MutPtr<Pstr>, networkaddr: MutPtr<Pstr>, endpoint: MutPtr<Pstr>, networkoptions: MutPtr<Pstr>): RpcStatus

public expect fun rpcStringBindingParseW(stringbinding: Pcwstr, objuuid: MutPtr<Pwstr>, protseq: MutPtr<Pwstr>, networkaddr: MutPtr<Pwstr>, endpoint: MutPtr<Pwstr>, networkoptions: MutPtr<Pwstr>): RpcStatus

public expect fun rpcStringFreeA(string: MutPtr<Pstr>): RpcStatus

public expect fun rpcStringFreeW(string: MutPtr<Pwstr>): RpcStatus

public expect fun rpcTestCancel(): RpcStatus

public expect fun rpcUserFree(asynchandle: MutPtr<CVoid>, pbuffer: MutPtr<CVoid>)

public expect fun uuidCompare(uuid1: ConstPtr<Guid>, uuid2: ConstPtr<Guid>, status: MutPtr<RpcStatus>): Int

public expect fun uuidCreate(uuid: MutPtr<Guid>): RpcStatus

public expect fun uuidCreateNil(niluuid: MutPtr<Guid>): RpcStatus
