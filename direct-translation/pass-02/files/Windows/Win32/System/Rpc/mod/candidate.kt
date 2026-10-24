// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn DceErrorInqTextA(rpcstatus : RPC_STATUS, errortext : windows_sys::core::PSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn DceErrorInqTextW(rpcstatus : RPC_STATUS, errortext : windows_sys::core::PWSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn IUnknown_AddRef_Proxy(this : * mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn IUnknown_QueryInterface_Proxy(this : * mut core::ffi::c_void, riid : *const windows_sys::core::GUID, ppvobject : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn IUnknown_Release_Proxy(this : * mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcAllocate(size : u32) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcAsyncAbortCall(pasync : *const RPC_ASYNC_STATE, exceptioncode : u32) -> RPC_STATUS);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcAsyncSetHandle(message : *const RPC_MESSAGE, pasync : *const RPC_ASYNC_STATE) -> RPC_STATUS);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcBindingCopy(sourcebinding : *mut core::ffi::c_void, destinationbinding : *mut *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcBindingCreateNP(servername : windows_sys::core::PCWSTR, servicename : windows_sys::core::PCWSTR, networkoptions : windows_sys::core::PCWSTR, binding : *mut *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcBindingHandleToAsyncHandle(binding : *mut core::ffi::c_void, asynchandle : *mut *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcBindingInqClientTokenAttributes(binding : *const core::ffi::c_void, tokenid : *mut super::super::Foundation:: LUID, authenticationid : *mut super::super::Foundation:: LUID, modifiedid : *mut super::super::Foundation:: LUID) -> RPC_STATUS);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcBindingInqDynamicEndpointA(binding : *const core::ffi::c_void, dynamicendpoint : *mut windows_sys::core::PSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcBindingInqDynamicEndpointW(binding : *const core::ffi::c_void, dynamicendpoint : *mut windows_sys::core::PWSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcBindingInqLocalClientPID(binding : *mut core::ffi::c_void, pid : *mut u32) -> RPC_STATUS);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcBindingInqMarshalledTargetInfo(binding : *const core::ffi::c_void, marshalledtargetinfosize : *mut u32, marshalledtargetinfo : *mut windows_sys::core::PSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcBindingInqSecurityContext(binding : *mut core::ffi::c_void, securitycontexthandle : *mut *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcBindingInqSecurityContextKeyInfo(binding : *const core::ffi::c_void, keyinfo : *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcBindingInqTransportType(binding : *mut core::ffi::c_void, r#type : *mut u32) -> RPC_STATUS);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcBindingInqWireIdForSnego(binding : *const core::ffi::c_void, wireid : *mut u8) -> RPC_STATUS);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcBindingIsClientLocal(bindinghandle : *mut core::ffi::c_void, clientlocalflag : *mut u32) -> RPC_STATUS);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcBindingIsServerLocal(binding : *const core::ffi::c_void, serverlocalflag : *mut u32) -> RPC_STATUS);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcBindingSetPrivateOption(hbinding : *const core::ffi::c_void, option : u32, optionvalue : usize) -> RPC_STATUS);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcBindingToStaticStringBindingW(binding : *mut core::ffi::c_void, stringbinding : *mut *mut u16) -> RPC_STATUS);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcClearMutex(mutex : *mut core::ffi::c_void));

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcDeleteMutex(mutex : *mut core::ffi::c_void));

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcExceptionFilter(exceptioncode : u32) -> i32);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcFree(object : *mut core::ffi::c_void));

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcFreeBuffer(message : *mut RPC_MESSAGE) -> RPC_STATUS);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcFreePipeBuffer(message : *mut RPC_MESSAGE) -> RPC_STATUS);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcGetBuffer(message : *mut RPC_MESSAGE) -> RPC_STATUS);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcGetBufferWithObject(message : *mut RPC_MESSAGE, objectuuid : *mut windows_sys::core::GUID) -> RPC_STATUS);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcGetCurrentCallHandle() -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcGetDefaultSD(ppsecuritydescriptor : *mut *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcGetExtendedError() -> RPC_STATUS);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcIfInqTransferSyntaxes(rpcifhandle : *mut core::ffi::c_void, transfersyntaxes : *mut RPC_TRANSFER_SYNTAX, transfersyntaxsize : u32, transfersyntaxcount : *mut u32) -> RPC_STATUS);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcMapWin32Status(status : RPC_STATUS) -> i32);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcMgmtEnableDedicatedThreadPool() -> RPC_STATUS);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcNegotiateTransferSyntax(message : *mut RPC_MESSAGE) -> RPC_STATUS);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcNsBindingSetEntryNameA(binding : *const core::ffi::c_void, entrynamesyntax : u32, entryname : windows_sys::core::PCSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcNsBindingSetEntryNameW(binding : *const core::ffi::c_void, entrynamesyntax : u32, entryname : windows_sys::core::PCWSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn I_RpcNsGetBuffer(message : *mut RPC_MESSAGE) -> RPC_STATUS);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcNsInterfaceExported(entrynamesyntax : u32, entryname : *const u16, rpcinterfaceinformation : *const RPC_SERVER_INTERFACE) -> RPC_STATUS);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcNsInterfaceUnexported(entrynamesyntax : u32, entryname : *mut u16, rpcinterfaceinformation : *mut RPC_SERVER_INTERFACE) -> RPC_STATUS);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn I_RpcNsRaiseException(message : *mut RPC_MESSAGE, status : RPC_STATUS));

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn I_RpcNsSendReceive(message : *mut RPC_MESSAGE, handle : *mut *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcOpenClientProcess(binding : *const core::ffi::c_void, desiredaccess : u32, clientprocess : *mut *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcPauseExecution(milliseconds : u32));

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn I_RpcReBindBuffer(message : *mut RPC_MESSAGE) -> RPC_STATUS);

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcReallocPipeBuffer(message : *const RPC_MESSAGE, newsize : u32) -> RPC_STATUS);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcReceive(message : *mut RPC_MESSAGE, size : u32) -> RPC_STATUS);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcRecordCalloutFailure(rpcstatus : RPC_STATUS, calloutstate : *mut RDR_CALLOUT_STATE, dllname : *mut u16));

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcRequestMutex(mutex : *mut *mut core::ffi::c_void));

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcSend(message : *mut RPC_MESSAGE) -> RPC_STATUS);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcSendReceive(message : *mut RPC_MESSAGE) -> RPC_STATUS);

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcServerCheckClientRestriction(context : *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcServerDisableExceptionFilter() -> i32);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcServerGetAssociationID(binding : *const core::ffi::c_void, associationid : *mut u32) -> RPC_STATUS);

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcServerInqAddressChangeFn() -> *mut RPC_ADDRESS_CHANGE_FN);

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcServerInqLocalConnAddress(binding : *mut core::ffi::c_void, buffer : *mut core::ffi::c_void, buffersize : *mut u32, addressformat : *mut u32) -> RPC_STATUS);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcServerInqRemoteConnAddress(binding : *mut core::ffi::c_void, buffer : *mut core::ffi::c_void, buffersize : *mut u32, addressformat : *mut u32) -> RPC_STATUS);

// UNSUPPORTED Rust 64:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcServerInqTransportType(r#type : *mut u32) -> RPC_STATUS);

// UNSUPPORTED Rust 65:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcServerRegisterForwardFunction(pforwardfunction : *mut RPC_FORWARD_FUNCTION) -> RPC_STATUS);

// UNSUPPORTED Rust 66:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcServerSetAddressChangeFn(paddresschangefn : *mut RPC_ADDRESS_CHANGE_FN) -> RPC_STATUS);

// UNSUPPORTED Rust 67:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcServerStartService(protseq : windows_sys::core::PCWSTR, endpoint : windows_sys::core::PCWSTR, ifspec : *const core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 68:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcServerSubscribeForDisconnectNotification(binding : *const core::ffi::c_void, hevent : *const core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 69:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcServerSubscribeForDisconnectNotification2(binding : *const core::ffi::c_void, hevent : *const core::ffi::c_void, subscriptionid : *mut windows_sys::core::GUID) -> RPC_STATUS);

// UNSUPPORTED Rust 70:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcServerUnsubscribeForDisconnectNotification(binding : *const core::ffi::c_void, subscriptionid : windows_sys::core::GUID) -> RPC_STATUS);

// UNSUPPORTED Rust 71:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcServerUseProtseq2A(networkaddress : windows_sys::core::PCSTR, protseq : windows_sys::core::PCSTR, maxcalls : u32, securitydescriptor : *const core::ffi::c_void, policy : *const core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 72:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcServerUseProtseq2W(networkaddress : windows_sys::core::PCWSTR, protseq : windows_sys::core::PCWSTR, maxcalls : u32, securitydescriptor : *const core::ffi::c_void, policy : *const core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 73:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcServerUseProtseqEp2A(networkaddress : windows_sys::core::PCSTR, protseq : windows_sys::core::PCSTR, maxcalls : u32, endpoint : windows_sys::core::PCSTR, securitydescriptor : *const core::ffi::c_void, policy : *const core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 74:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcServerUseProtseqEp2W(networkaddress : windows_sys::core::PCWSTR, protseq : windows_sys::core::PCWSTR, maxcalls : u32, endpoint : windows_sys::core::PCWSTR, securitydescriptor : *const core::ffi::c_void, policy : *const core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 75:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcSessionStrictContextHandle());

// UNSUPPORTED Rust 76:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcSsDontSerializeContext());

// UNSUPPORTED Rust 77:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcSystemHandleTypeSpecificWork(handle : *mut core::ffi::c_void, actualtype : u8, idltype : u8, marshaldirection : LRPC_SYSTEM_HANDLE_MARSHAL_DIRECTION) -> RPC_STATUS);

// UNSUPPORTED Rust 78:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_RpcTurnOnEEInfoPropagation() -> RPC_STATUS);

// UNSUPPORTED Rust 79:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn I_UuidCreate(uuid : *mut windows_sys::core::GUID) -> RPC_STATUS);

// UNSUPPORTED Rust 80:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn MesBufferHandleReset(handle : *const core::ffi::c_void, handlestyle : u32, operation : MIDL_ES_CODE, pbuffer : *const *const i8, buffersize : u32, pencodedsize : *mut u32) -> RPC_STATUS);

// UNSUPPORTED Rust 81:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn MesDecodeBufferHandleCreate(buffer : windows_sys::core::PCSTR, buffersize : u32, phandle : *mut *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 82:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn MesDecodeIncrementalHandleCreate(userstate : *mut core::ffi::c_void, readfn : MIDL_ES_READ, phandle : *mut *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 83:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn MesEncodeDynBufferHandleCreate(pbuffer : *mut *mut i8, pencodedsize : *mut u32, phandle : *mut *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 84:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn MesEncodeFixedBufferHandleCreate(pbuffer : windows_sys::core::PSTR, buffersize : u32, pencodedsize : *mut u32, phandle : *mut *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 85:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn MesEncodeIncrementalHandleCreate(userstate : *mut core::ffi::c_void, allocfn : MIDL_ES_ALLOC, writefn : MIDL_ES_WRITE, phandle : *mut *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 86:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn MesHandleFree(handle : *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 87:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn MesIncrementalHandleReset(handle : *mut core::ffi::c_void, userstate : *mut core::ffi::c_void, allocfn : MIDL_ES_ALLOC, writefn : MIDL_ES_WRITE, readfn : MIDL_ES_READ, operation : MIDL_ES_CODE) -> RPC_STATUS);

// UNSUPPORTED Rust 88:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn MesInqProcEncodingId(handle : *mut core::ffi::c_void, pinterfaceid : *mut RPC_SYNTAX_IDENTIFIER, pprocnum : *mut u32) -> RPC_STATUS);

// UNSUPPORTED Rust 89:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn NDRCContextBinding(ccontext : isize) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 90:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn NDRCContextMarshall(ccontext : isize, pbuff : *mut core::ffi::c_void));

// UNSUPPORTED Rust 91:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn NDRCContextUnmarshall(pccontext : *mut isize, hbinding : *const core::ffi::c_void, pbuff : *const core::ffi::c_void, datarepresentation : u32));

// UNSUPPORTED Rust 92:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn NDRSContextMarshall(ccontext : *const NDR_SCONTEXT, pbuff : *mut core::ffi::c_void, userrundownin : NDR_RUNDOWN));

// UNSUPPORTED Rust 93:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn NDRSContextMarshall2(bindinghandle : *const core::ffi::c_void, ccontext : *const NDR_SCONTEXT, pbuff : *mut core::ffi::c_void, userrundownin : NDR_RUNDOWN, ctxguard : *const core::ffi::c_void, flags : u32));

// UNSUPPORTED Rust 94:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn NDRSContextMarshallEx(bindinghandle : *const core::ffi::c_void, ccontext : *const NDR_SCONTEXT, pbuff : *mut core::ffi::c_void, userrundownin : NDR_RUNDOWN));

// UNSUPPORTED Rust 95:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn NDRSContextUnmarshall(pbuff : *const core::ffi::c_void, datarepresentation : u32) -> *mut NDR_SCONTEXT);

// UNSUPPORTED Rust 96:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn NDRSContextUnmarshall2(bindinghandle : *const core::ffi::c_void, pbuff : *const core::ffi::c_void, datarepresentation : u32, ctxguard : *const core::ffi::c_void, flags : u32) -> *mut NDR_SCONTEXT);

// UNSUPPORTED Rust 97:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn NDRSContextUnmarshallEx(bindinghandle : *const core::ffi::c_void, pbuff : *const core::ffi::c_void, datarepresentation : u32) -> *mut NDR_SCONTEXT);

// UNSUPPORTED Rust 98:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "C" fn Ndr64AsyncClientCall(pproxyinfo : *mut MIDL_STUBLESS_PROXY_INFO, nprocnum : u32, preturnvalue : *mut core::ffi::c_void, ...) -> CLIENT_CALL_RETURN);

// UNSUPPORTED Rust 100:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn Ndr64AsyncServerCall64(prpcmsg : *mut RPC_MESSAGE));

// UNSUPPORTED Rust 101:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn Ndr64AsyncServerCallAll(prpcmsg : *mut RPC_MESSAGE));

// UNSUPPORTED Rust 102:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "C" fn Ndr64DcomAsyncClientCall(pproxyinfo : *mut MIDL_STUBLESS_PROXY_INFO, nprocnum : u32, preturnvalue : *mut core::ffi::c_void, ...) -> CLIENT_CALL_RETURN);

// UNSUPPORTED Rust 104:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn Ndr64DcomAsyncStubCall(pthis : * mut core::ffi::c_void, pchannel : * mut core::ffi::c_void, prpcmsg : *mut RPC_MESSAGE, pdwstubphase : *mut u32) -> i32);

// UNSUPPORTED Rust 106:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrAllocate(pstubmsg : *mut MIDL_STUB_MESSAGE, len : usize) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 108:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "C" fn NdrAsyncClientCall(pstubdescriptor : *mut MIDL_STUB_DESC, pformat : *mut u8, ...) -> CLIENT_CALL_RETURN);

// UNSUPPORTED Rust 110:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn NdrAsyncServerCall(prpcmsg : *mut RPC_MESSAGE));

// UNSUPPORTED Rust 111:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrByteCountPointerBufferSize(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8));

// UNSUPPORTED Rust 113:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrByteCountPointerFree(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8));

// UNSUPPORTED Rust 115:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrByteCountPointerMarshall(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8) -> *mut u8);

// UNSUPPORTED Rust 117:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrByteCountPointerUnmarshall(pstubmsg : *mut MIDL_STUB_MESSAGE, ppmemory : *mut *mut u8, pformat : *mut u8, fmustalloc : u8) -> *mut u8);

// UNSUPPORTED Rust 119:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrClearOutParameters(pstubmsg : *mut MIDL_STUB_MESSAGE, pformat : *mut u8, argaddr : *mut core::ffi::c_void));

// UNSUPPORTED Rust 121:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "C" fn NdrClientCall2(pstubdescriptor : *mut MIDL_STUB_DESC, pformat : *mut u8, ...) -> CLIENT_CALL_RETURN);

// UNSUPPORTED Rust 123:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "C" fn NdrClientCall3(pproxyinfo : *mut MIDL_STUBLESS_PROXY_INFO, nprocnum : u32, preturnvalue : *mut core::ffi::c_void, ...) -> CLIENT_CALL_RETURN);

// UNSUPPORTED Rust 125:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrClientContextMarshall(pstubmsg : *mut MIDL_STUB_MESSAGE, contexthandle : isize, fcheck : i32));

// UNSUPPORTED Rust 127:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrClientContextUnmarshall(pstubmsg : *mut MIDL_STUB_MESSAGE, pcontexthandle : *mut isize, bindhandle : *mut core::ffi::c_void));

// UNSUPPORTED Rust 129:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrClientInitialize(prpcmsg : *mut RPC_MESSAGE, pstubmsg : *mut MIDL_STUB_MESSAGE, pstubdescriptor : *mut MIDL_STUB_DESC, procnum : u32));

// UNSUPPORTED Rust 131:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrClientInitializeNew(prpcmsg : *mut RPC_MESSAGE, pstubmsg : *mut MIDL_STUB_MESSAGE, pstubdescriptor : *mut MIDL_STUB_DESC, procnum : u32));

// UNSUPPORTED Rust 133:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrComplexArrayBufferSize(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8));

// UNSUPPORTED Rust 135:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrComplexArrayFree(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8));

// UNSUPPORTED Rust 137:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrComplexArrayMarshall(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8) -> *mut u8);

// UNSUPPORTED Rust 139:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrComplexArrayMemorySize(pstubmsg : *mut MIDL_STUB_MESSAGE, pformat : *mut u8) -> u32);

// UNSUPPORTED Rust 141:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrComplexArrayUnmarshall(pstubmsg : *mut MIDL_STUB_MESSAGE, ppmemory : *mut *mut u8, pformat : *mut u8, fmustalloc : u8) -> *mut u8);

// UNSUPPORTED Rust 143:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrComplexStructBufferSize(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8));

// UNSUPPORTED Rust 145:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrComplexStructFree(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8));

// UNSUPPORTED Rust 147:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrComplexStructMarshall(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8) -> *mut u8);

// UNSUPPORTED Rust 149:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrComplexStructMemorySize(pstubmsg : *mut MIDL_STUB_MESSAGE, pformat : *mut u8) -> u32);

// UNSUPPORTED Rust 151:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrComplexStructUnmarshall(pstubmsg : *mut MIDL_STUB_MESSAGE, ppmemory : *mut *mut u8, pformat : *mut u8, fmustalloc : u8) -> *mut u8);

// UNSUPPORTED Rust 153:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrConformantArrayBufferSize(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8));

// UNSUPPORTED Rust 155:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrConformantArrayFree(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8));

// UNSUPPORTED Rust 157:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrConformantArrayMarshall(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8) -> *mut u8);

// UNSUPPORTED Rust 159:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrConformantArrayMemorySize(pstubmsg : *mut MIDL_STUB_MESSAGE, pformat : *mut u8) -> u32);

// UNSUPPORTED Rust 161:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrConformantArrayUnmarshall(pstubmsg : *mut MIDL_STUB_MESSAGE, ppmemory : *mut *mut u8, pformat : *mut u8, fmustalloc : u8) -> *mut u8);

// UNSUPPORTED Rust 163:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrConformantStringBufferSize(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8));

// UNSUPPORTED Rust 165:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrConformantStringMarshall(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8) -> *mut u8);

// UNSUPPORTED Rust 167:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrConformantStringMemorySize(pstubmsg : *mut MIDL_STUB_MESSAGE, pformat : *mut u8) -> u32);

// UNSUPPORTED Rust 169:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrConformantStringUnmarshall(pstubmsg : *mut MIDL_STUB_MESSAGE, ppmemory : *mut *mut u8, pformat : *mut u8, fmustalloc : u8) -> *mut u8);

// UNSUPPORTED Rust 171:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrConformantStructBufferSize(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8));

// UNSUPPORTED Rust 173:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrConformantStructFree(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8));

// UNSUPPORTED Rust 175:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrConformantStructMarshall(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8) -> *mut u8);

// UNSUPPORTED Rust 177:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrConformantStructMemorySize(pstubmsg : *mut MIDL_STUB_MESSAGE, pformat : *mut u8) -> u32);

// UNSUPPORTED Rust 179:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrConformantStructUnmarshall(pstubmsg : *mut MIDL_STUB_MESSAGE, ppmemory : *mut *mut u8, pformat : *mut u8, fmustalloc : u8) -> *mut u8);

// UNSUPPORTED Rust 181:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrConformantVaryingArrayBufferSize(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8));

// UNSUPPORTED Rust 183:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrConformantVaryingArrayFree(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8));

// UNSUPPORTED Rust 185:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrConformantVaryingArrayMarshall(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8) -> *mut u8);

// UNSUPPORTED Rust 187:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrConformantVaryingArrayMemorySize(pstubmsg : *mut MIDL_STUB_MESSAGE, pformat : *mut u8) -> u32);

// UNSUPPORTED Rust 189:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrConformantVaryingArrayUnmarshall(pstubmsg : *mut MIDL_STUB_MESSAGE, ppmemory : *mut *mut u8, pformat : *mut u8, fmustalloc : u8) -> *mut u8);

// UNSUPPORTED Rust 191:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrConformantVaryingStructBufferSize(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8));

// UNSUPPORTED Rust 193:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrConformantVaryingStructFree(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8));

// UNSUPPORTED Rust 195:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrConformantVaryingStructMarshall(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8) -> *mut u8);

// UNSUPPORTED Rust 197:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrConformantVaryingStructMemorySize(pstubmsg : *mut MIDL_STUB_MESSAGE, pformat : *mut u8) -> u32);

// UNSUPPORTED Rust 199:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrConformantVaryingStructUnmarshall(pstubmsg : *mut MIDL_STUB_MESSAGE, ppmemory : *mut *mut u8, pformat : *mut u8, fmustalloc : u8) -> *mut u8);

// UNSUPPORTED Rust 201:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrContextHandleInitialize(pstubmsg : *const MIDL_STUB_MESSAGE, pformat : *const u8) -> *mut NDR_SCONTEXT);

// UNSUPPORTED Rust 203:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrContextHandleSize(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8));

// UNSUPPORTED Rust 205:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrConvert(pstubmsg : *mut MIDL_STUB_MESSAGE, pformat : *mut u8));

// UNSUPPORTED Rust 207:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrConvert2(pstubmsg : *mut MIDL_STUB_MESSAGE, pformat : *mut u8, numberparams : i32));

// UNSUPPORTED Rust 209:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrCorrelationFree(pstubmsg : *mut MIDL_STUB_MESSAGE));

// UNSUPPORTED Rust 211:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrCorrelationInitialize(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut core::ffi::c_void, cachesize : u32, flags : u32));

// UNSUPPORTED Rust 213:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrCorrelationPass(pstubmsg : *mut MIDL_STUB_MESSAGE));

// UNSUPPORTED Rust 215:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrCreateServerInterfaceFromStub(pstub : * mut core::ffi::c_void, pserverif : *mut RPC_SERVER_INTERFACE) -> RPC_STATUS);

// UNSUPPORTED Rust 217:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "C" fn NdrDcomAsyncClientCall(pstubdescriptor : *mut MIDL_STUB_DESC, pformat : *mut u8, ...) -> CLIENT_CALL_RETURN);

// UNSUPPORTED Rust 219:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrDcomAsyncStubCall(pthis : * mut core::ffi::c_void, pchannel : * mut core::ffi::c_void, prpcmsg : *mut RPC_MESSAGE, pdwstubphase : *mut u32) -> i32);

// UNSUPPORTED Rust 221:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrEncapsulatedUnionBufferSize(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8));

// UNSUPPORTED Rust 223:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrEncapsulatedUnionFree(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8));

// UNSUPPORTED Rust 225:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrEncapsulatedUnionMarshall(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8) -> *mut u8);

// UNSUPPORTED Rust 227:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrEncapsulatedUnionMemorySize(pstubmsg : *mut MIDL_STUB_MESSAGE, pformat : *mut u8) -> u32);

// UNSUPPORTED Rust 229:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrEncapsulatedUnionUnmarshall(pstubmsg : *mut MIDL_STUB_MESSAGE, ppmemory : *mut *mut u8, pformat : *mut u8, fmustalloc : u8) -> *mut u8);

// UNSUPPORTED Rust 231:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrFixedArrayBufferSize(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8));

// UNSUPPORTED Rust 233:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrFixedArrayFree(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8));

// UNSUPPORTED Rust 235:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrFixedArrayMarshall(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8) -> *mut u8);

// UNSUPPORTED Rust 237:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrFixedArrayMemorySize(pstubmsg : *mut MIDL_STUB_MESSAGE, pformat : *mut u8) -> u32);

// UNSUPPORTED Rust 239:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrFixedArrayUnmarshall(pstubmsg : *mut MIDL_STUB_MESSAGE, ppmemory : *mut *mut u8, pformat : *mut u8, fmustalloc : u8) -> *mut u8);

// UNSUPPORTED Rust 241:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrFreeBuffer(pstubmsg : *mut MIDL_STUB_MESSAGE));

// UNSUPPORTED Rust 243:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn NdrFullPointerXlatFree(pxlattables : *mut FULL_PTR_XLAT_TABLES));

// UNSUPPORTED Rust 244:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn NdrFullPointerXlatInit(numberofpointers : u32, xlatside : XLAT_SIDE) -> *mut FULL_PTR_XLAT_TABLES);

// UNSUPPORTED Rust 245:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrGetBuffer(pstubmsg : *mut MIDL_STUB_MESSAGE, bufferlength : u32, handle : *mut core::ffi::c_void) -> *mut u8);

// UNSUPPORTED Rust 247:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrGetDcomProtocolVersion(pstubmsg : *mut MIDL_STUB_MESSAGE, pversion : *mut RPC_VERSION) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 249:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrGetUserMarshalInfo(pflags : *const u32, informationlevel : u32, pmarshalinfo : *mut NDR_USER_MARSHAL_INFO) -> RPC_STATUS);

// UNSUPPORTED Rust 251:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrInterfacePointerBufferSize(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8));

// UNSUPPORTED Rust 253:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrInterfacePointerFree(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8));

// UNSUPPORTED Rust 255:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrInterfacePointerMarshall(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8) -> *mut u8);

// UNSUPPORTED Rust 257:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrInterfacePointerMemorySize(pstubmsg : *mut MIDL_STUB_MESSAGE, pformat : *mut u8) -> u32);

// UNSUPPORTED Rust 259:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrInterfacePointerUnmarshall(pstubmsg : *mut MIDL_STUB_MESSAGE, ppmemory : *mut *mut u8, pformat : *mut u8, fmustalloc : u8) -> *mut u8);

// UNSUPPORTED Rust 261:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrMapCommAndFaultStatus(pstubmsg : *mut MIDL_STUB_MESSAGE, pcommstatus : *mut u32, pfaultstatus : *mut u32, status : RPC_STATUS) -> RPC_STATUS);

// UNSUPPORTED Rust 263:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "C" fn NdrMesProcEncodeDecode(handle : *mut core::ffi::c_void, pstubdesc : *const MIDL_STUB_DESC, pformatstring : *mut u8, ...));

// UNSUPPORTED Rust 265:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "C" fn NdrMesProcEncodeDecode2(handle : *mut core::ffi::c_void, pstubdesc : *const MIDL_STUB_DESC, pformatstring : *mut u8, ...) -> CLIENT_CALL_RETURN);

// UNSUPPORTED Rust 267:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "C" fn NdrMesProcEncodeDecode3(handle : *mut core::ffi::c_void, pproxyinfo : *const MIDL_STUBLESS_PROXY_INFO, nprocnum : u32, preturnvalue : *mut core::ffi::c_void, ...) -> CLIENT_CALL_RETURN);

// UNSUPPORTED Rust 269:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn NdrMesSimpleTypeAlignSize(param0 : *mut core::ffi::c_void) -> usize);

// UNSUPPORTED Rust 270:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrMesSimpleTypeAlignSizeAll(handle : *mut core::ffi::c_void, pproxyinfo : *const MIDL_STUBLESS_PROXY_INFO) -> usize);

// UNSUPPORTED Rust 272:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn NdrMesSimpleTypeDecode(handle : *mut core::ffi::c_void, pobject : *mut core::ffi::c_void, size : i16));

// UNSUPPORTED Rust 273:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrMesSimpleTypeDecodeAll(handle : *mut core::ffi::c_void, pproxyinfo : *const MIDL_STUBLESS_PROXY_INFO, pobject : *mut core::ffi::c_void, size : i16));

// UNSUPPORTED Rust 275:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrMesSimpleTypeEncode(handle : *mut core::ffi::c_void, pstubdesc : *const MIDL_STUB_DESC, pobject : *const core::ffi::c_void, size : i16));

// UNSUPPORTED Rust 277:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrMesSimpleTypeEncodeAll(handle : *mut core::ffi::c_void, pproxyinfo : *const MIDL_STUBLESS_PROXY_INFO, pobject : *const core::ffi::c_void, size : i16));

// UNSUPPORTED Rust 279:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrMesTypeAlignSize(handle : *mut core::ffi::c_void, pstubdesc : *const MIDL_STUB_DESC, pformatstring : *mut u8, pobject : *const core::ffi::c_void) -> usize);

// UNSUPPORTED Rust 281:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrMesTypeAlignSize2(handle : *mut core::ffi::c_void, ppicklinginfo : *const MIDL_TYPE_PICKLING_INFO, pstubdesc : *const MIDL_STUB_DESC, pformatstring : *mut u8, pobject : *const core::ffi::c_void) -> usize);

// UNSUPPORTED Rust 283:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrMesTypeAlignSize3(handle : *mut core::ffi::c_void, ppicklinginfo : *const MIDL_TYPE_PICKLING_INFO, pproxyinfo : *const MIDL_STUBLESS_PROXY_INFO, arrtypeoffset : *const *const u32, ntypeindex : u32, pobject : *const core::ffi::c_void) -> usize);

// UNSUPPORTED Rust 285:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrMesTypeDecode(handle : *mut core::ffi::c_void, pstubdesc : *const MIDL_STUB_DESC, pformatstring : *mut u8, pobject : *mut core::ffi::c_void));

// UNSUPPORTED Rust 287:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrMesTypeDecode2(handle : *mut core::ffi::c_void, ppicklinginfo : *const MIDL_TYPE_PICKLING_INFO, pstubdesc : *const MIDL_STUB_DESC, pformatstring : *mut u8, pobject : *mut core::ffi::c_void));

// UNSUPPORTED Rust 289:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrMesTypeDecode3(handle : *mut core::ffi::c_void, ppicklinginfo : *const MIDL_TYPE_PICKLING_INFO, pproxyinfo : *const MIDL_STUBLESS_PROXY_INFO, arrtypeoffset : *const *const u32, ntypeindex : u32, pobject : *mut core::ffi::c_void));

// UNSUPPORTED Rust 291:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrMesTypeEncode(handle : *mut core::ffi::c_void, pstubdesc : *const MIDL_STUB_DESC, pformatstring : *mut u8, pobject : *const core::ffi::c_void));

// UNSUPPORTED Rust 293:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrMesTypeEncode2(handle : *mut core::ffi::c_void, ppicklinginfo : *const MIDL_TYPE_PICKLING_INFO, pstubdesc : *const MIDL_STUB_DESC, pformatstring : *mut u8, pobject : *const core::ffi::c_void));

// UNSUPPORTED Rust 295:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrMesTypeEncode3(handle : *mut core::ffi::c_void, ppicklinginfo : *const MIDL_TYPE_PICKLING_INFO, pproxyinfo : *const MIDL_STUBLESS_PROXY_INFO, arrtypeoffset : *const *const u32, ntypeindex : u32, pobject : *const core::ffi::c_void));

// UNSUPPORTED Rust 297:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrMesTypeFree2(handle : *mut core::ffi::c_void, ppicklinginfo : *const MIDL_TYPE_PICKLING_INFO, pstubdesc : *const MIDL_STUB_DESC, pformatstring : *mut u8, pobject : *mut core::ffi::c_void));

// UNSUPPORTED Rust 299:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrMesTypeFree3(handle : *mut core::ffi::c_void, ppicklinginfo : *const MIDL_TYPE_PICKLING_INFO, pproxyinfo : *const MIDL_STUBLESS_PROXY_INFO, arrtypeoffset : *const *const u32, ntypeindex : u32, pobject : *mut core::ffi::c_void));

// UNSUPPORTED Rust 301:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrNonConformantStringBufferSize(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8));

// UNSUPPORTED Rust 303:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrNonConformantStringMarshall(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8) -> *mut u8);

// UNSUPPORTED Rust 305:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrNonConformantStringMemorySize(pstubmsg : *mut MIDL_STUB_MESSAGE, pformat : *mut u8) -> u32);

// UNSUPPORTED Rust 307:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrNonConformantStringUnmarshall(pstubmsg : *mut MIDL_STUB_MESSAGE, ppmemory : *mut *mut u8, pformat : *mut u8, fmustalloc : u8) -> *mut u8);

// UNSUPPORTED Rust 309:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrNonEncapsulatedUnionBufferSize(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8));

// UNSUPPORTED Rust 311:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrNonEncapsulatedUnionFree(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8));

// UNSUPPORTED Rust 313:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrNonEncapsulatedUnionMarshall(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8) -> *mut u8);

// UNSUPPORTED Rust 315:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrNonEncapsulatedUnionMemorySize(pstubmsg : *mut MIDL_STUB_MESSAGE, pformat : *mut u8) -> u32);

// UNSUPPORTED Rust 317:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrNonEncapsulatedUnionUnmarshall(pstubmsg : *mut MIDL_STUB_MESSAGE, ppmemory : *mut *mut u8, pformat : *mut u8, fmustalloc : u8) -> *mut u8);

// UNSUPPORTED Rust 319:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrNsGetBuffer(pstubmsg : *mut MIDL_STUB_MESSAGE, bufferlength : u32, handle : *mut core::ffi::c_void) -> *mut u8);

// UNSUPPORTED Rust 321:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrNsSendReceive(pstubmsg : *mut MIDL_STUB_MESSAGE, pbufferend : *mut u8, pautohandle : *mut *mut core::ffi::c_void) -> *mut u8);

// UNSUPPORTED Rust 323:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn NdrOleAllocate(size : usize) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 324:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn NdrOleFree(nodetofree : *const core::ffi::c_void));

// UNSUPPORTED Rust 325:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrPartialIgnoreClientBufferSize(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut core::ffi::c_void));

// UNSUPPORTED Rust 327:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrPartialIgnoreClientMarshall(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut core::ffi::c_void));

// UNSUPPORTED Rust 329:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrPartialIgnoreServerInitialize(pstubmsg : *mut MIDL_STUB_MESSAGE, ppmemory : *mut *mut core::ffi::c_void, pformat : *mut u8));

// UNSUPPORTED Rust 331:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrPartialIgnoreServerUnmarshall(pstubmsg : *mut MIDL_STUB_MESSAGE, ppmemory : *mut *mut core::ffi::c_void));

// UNSUPPORTED Rust 333:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrPointerBufferSize(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8));

// UNSUPPORTED Rust 335:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrPointerFree(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8));

// UNSUPPORTED Rust 337:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrPointerMarshall(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8) -> *mut u8);

// UNSUPPORTED Rust 339:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrPointerMemorySize(pstubmsg : *mut MIDL_STUB_MESSAGE, pformat : *mut u8) -> u32);

// UNSUPPORTED Rust 341:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrPointerUnmarshall(pstubmsg : *mut MIDL_STUB_MESSAGE, ppmemory : *mut *mut u8, pformat : *mut u8, fmustalloc : u8) -> *mut u8);

// UNSUPPORTED Rust 343:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrRangeUnmarshall(pstubmsg : *mut MIDL_STUB_MESSAGE, ppmemory : *mut *mut u8, pformat : *mut u8, fmustalloc : u8) -> *mut u8);

// UNSUPPORTED Rust 345:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn NdrRpcSmClientAllocate(size : usize) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 346:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn NdrRpcSmClientFree(nodetofree : *const core::ffi::c_void));

// UNSUPPORTED Rust 347:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrRpcSmSetClientToOsf(pmessage : *mut MIDL_STUB_MESSAGE));

// UNSUPPORTED Rust 349:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn NdrRpcSsDefaultAllocate(size : usize) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 350:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn NdrRpcSsDefaultFree(nodetofree : *const core::ffi::c_void));

// UNSUPPORTED Rust 351:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrRpcSsDisableAllocate(pmessage : *mut MIDL_STUB_MESSAGE));

// UNSUPPORTED Rust 353:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrRpcSsEnableAllocate(pmessage : *mut MIDL_STUB_MESSAGE));

// UNSUPPORTED Rust 355:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrSendReceive(pstubmsg : *mut MIDL_STUB_MESSAGE, pbufferend : *mut u8) -> *mut u8);

// UNSUPPORTED Rust 357:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn NdrServerCall2(prpcmsg : *mut RPC_MESSAGE));

// UNSUPPORTED Rust 358:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn NdrServerCallAll(prpcmsg : *mut RPC_MESSAGE));

// UNSUPPORTED Rust 359:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn NdrServerCallNdr64(prpcmsg : *mut RPC_MESSAGE));

// UNSUPPORTED Rust 360:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrServerContextMarshall(pstubmsg : *mut MIDL_STUB_MESSAGE, contexthandle : *mut NDR_SCONTEXT, rundownroutine : NDR_RUNDOWN));

// UNSUPPORTED Rust 362:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrServerContextNewMarshall(pstubmsg : *mut MIDL_STUB_MESSAGE, contexthandle : *mut NDR_SCONTEXT, rundownroutine : NDR_RUNDOWN, pformat : *mut u8));

// UNSUPPORTED Rust 364:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrServerContextNewUnmarshall(pstubmsg : *const MIDL_STUB_MESSAGE, pformat : *const u8) -> *mut NDR_SCONTEXT);

// UNSUPPORTED Rust 366:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrServerContextUnmarshall(pstubmsg : *mut MIDL_STUB_MESSAGE) -> *mut NDR_SCONTEXT);

// UNSUPPORTED Rust 368:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrServerInitialize(prpcmsg : *mut RPC_MESSAGE, pstubmsg : *mut MIDL_STUB_MESSAGE, pstubdescriptor : *mut MIDL_STUB_DESC) -> *mut u8);

// UNSUPPORTED Rust 370:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrServerInitializeMarshall(prpcmsg : *mut RPC_MESSAGE, pstubmsg : *mut MIDL_STUB_MESSAGE));

// UNSUPPORTED Rust 372:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrServerInitializeNew(prpcmsg : *mut RPC_MESSAGE, pstubmsg : *mut MIDL_STUB_MESSAGE, pstubdescriptor : *mut MIDL_STUB_DESC) -> *mut u8);

// UNSUPPORTED Rust 374:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrServerInitializePartial(prpcmsg : *mut RPC_MESSAGE, pstubmsg : *mut MIDL_STUB_MESSAGE, pstubdescriptor : *mut MIDL_STUB_DESC, requestedbuffersize : u32));

// UNSUPPORTED Rust 376:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrServerInitializeUnmarshall(pstubmsg : *mut MIDL_STUB_MESSAGE, pstubdescriptor : *mut MIDL_STUB_DESC, prpcmsg : *mut RPC_MESSAGE) -> *mut u8);

// UNSUPPORTED Rust 378:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrSimpleStructBufferSize(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8));

// UNSUPPORTED Rust 380:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrSimpleStructFree(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8));

// UNSUPPORTED Rust 382:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrSimpleStructMarshall(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8) -> *mut u8);

// UNSUPPORTED Rust 384:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrSimpleStructMemorySize(pstubmsg : *mut MIDL_STUB_MESSAGE, pformat : *mut u8) -> u32);

// UNSUPPORTED Rust 386:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrSimpleStructUnmarshall(pstubmsg : *mut MIDL_STUB_MESSAGE, ppmemory : *mut *mut u8, pformat : *mut u8, fmustalloc : u8) -> *mut u8);

// UNSUPPORTED Rust 388:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrSimpleTypeMarshall(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, formatchar : u8));

// UNSUPPORTED Rust 390:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrSimpleTypeUnmarshall(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, formatchar : u8));

// UNSUPPORTED Rust 392:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn NdrStubCall2(pthis : *mut core::ffi::c_void, pchannel : *mut core::ffi::c_void, prpcmsg : *mut RPC_MESSAGE, pdwstubphase : *mut u32) -> i32);

// UNSUPPORTED Rust 393:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn NdrStubCall3(pthis : *mut core::ffi::c_void, pchannel : *mut core::ffi::c_void, prpcmsg : *mut RPC_MESSAGE, pdwstubphase : *mut u32) -> i32);

// UNSUPPORTED Rust 394:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrUserMarshalBufferSize(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8));

// UNSUPPORTED Rust 396:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrUserMarshalFree(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8));

// UNSUPPORTED Rust 398:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrUserMarshalMarshall(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8) -> *mut u8);

// UNSUPPORTED Rust 400:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrUserMarshalMemorySize(pstubmsg : *mut MIDL_STUB_MESSAGE, pformat : *mut u8) -> u32);

// UNSUPPORTED Rust 402:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn NdrUserMarshalSimpleTypeConvert(pflags : *mut u32, pbuffer : *mut u8, formatchar : u8) -> *mut u8);

// UNSUPPORTED Rust 403:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrUserMarshalUnmarshall(pstubmsg : *mut MIDL_STUB_MESSAGE, ppmemory : *mut *mut u8, pformat : *mut u8, fmustalloc : u8) -> *mut u8);

// UNSUPPORTED Rust 405:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrVaryingArrayBufferSize(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8));

// UNSUPPORTED Rust 407:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrVaryingArrayFree(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8));

// UNSUPPORTED Rust 409:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrVaryingArrayMarshall(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8) -> *mut u8);

// UNSUPPORTED Rust 411:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrVaryingArrayMemorySize(pstubmsg : *mut MIDL_STUB_MESSAGE, pformat : *mut u8) -> u32);

// UNSUPPORTED Rust 413:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrVaryingArrayUnmarshall(pstubmsg : *mut MIDL_STUB_MESSAGE, ppmemory : *mut *mut u8, pformat : *mut u8, fmustalloc : u8) -> *mut u8);

// UNSUPPORTED Rust 415:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrXmitOrRepAsBufferSize(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8));

// UNSUPPORTED Rust 417:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrXmitOrRepAsFree(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8));

// UNSUPPORTED Rust 419:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrXmitOrRepAsMarshall(pstubmsg : *mut MIDL_STUB_MESSAGE, pmemory : *mut u8, pformat : *mut u8) -> *mut u8);

// UNSUPPORTED Rust 421:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrXmitOrRepAsMemorySize(pstubmsg : *mut MIDL_STUB_MESSAGE, pformat : *mut u8) -> u32);

// UNSUPPORTED Rust 423:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn NdrXmitOrRepAsUnmarshall(pstubmsg : *mut MIDL_STUB_MESSAGE, ppmemory : *mut *mut u8, pformat : *mut u8, fmustalloc : u8) -> *mut u8);

// UNSUPPORTED Rust 425:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("rpcrt4.dll" "system" fn RpcAsyncAbortCall(pasync : *mut RPC_ASYNC_STATE, exceptioncode : u32) -> RPC_STATUS);

// UNSUPPORTED Rust 427:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("rpcrt4.dll" "system" fn RpcAsyncCancelCall(pasync : *mut RPC_ASYNC_STATE, fabort : windows_sys::core::BOOL) -> RPC_STATUS);

// UNSUPPORTED Rust 429:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("rpcrt4.dll" "system" fn RpcAsyncCompleteCall(pasync : *mut RPC_ASYNC_STATE, reply : *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 431:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("rpcrt4.dll" "system" fn RpcAsyncGetCallStatus(pasync : *const RPC_ASYNC_STATE) -> RPC_STATUS);

// UNSUPPORTED Rust 433:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("rpcrt4.dll" "system" fn RpcAsyncInitializeHandle(pasync : *mut RPC_ASYNC_STATE, size : u32) -> RPC_STATUS);

// UNSUPPORTED Rust 435:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("rpcrt4.dll" "system" fn RpcAsyncRegisterInfo(pasync : *const RPC_ASYNC_STATE) -> RPC_STATUS);

// UNSUPPORTED Rust 437:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("rpcrt4.dll" "system" fn RpcBindingBind(pasync : *const RPC_ASYNC_STATE, binding : *const core::ffi::c_void, ifspec : *const core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 439:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcBindingCopy(sourcebinding : *const core::ffi::c_void, destinationbinding : *mut *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 440:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn RpcBindingCreateA(template : *const RPC_BINDING_HANDLE_TEMPLATE_V1_A, security : *const RPC_BINDING_HANDLE_SECURITY_V1_A, options : *const RPC_BINDING_HANDLE_OPTIONS_V1, binding : *mut *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 442:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn RpcBindingCreateW(template : *const RPC_BINDING_HANDLE_TEMPLATE_V1_W, security : *const RPC_BINDING_HANDLE_SECURITY_V1_W, options : *const RPC_BINDING_HANDLE_OPTIONS_V1, binding : *mut *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 444:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcBindingFree(binding : *mut *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 445:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcBindingFromStringBindingA(stringbinding : windows_sys::core::PCSTR, binding : *mut *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 446:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcBindingFromStringBindingW(stringbinding : windows_sys::core::PCWSTR, binding : *mut *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 447:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcBindingInqAuthClientA(clientbinding : *const core::ffi::c_void, privs : *mut *mut core::ffi::c_void, serverprincname : *mut windows_sys::core::PSTR, authnlevel : *mut u32, authnsvc : *mut u32, authzsvc : *mut u32) -> RPC_STATUS);

// UNSUPPORTED Rust 448:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcBindingInqAuthClientExA(clientbinding : *const core::ffi::c_void, privs : *mut *mut core::ffi::c_void, serverprincname : *mut windows_sys::core::PSTR, authnlevel : *mut u32, authnsvc : *mut u32, authzsvc : *mut u32, flags : u32) -> RPC_STATUS);

// UNSUPPORTED Rust 449:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcBindingInqAuthClientExW(clientbinding : *const core::ffi::c_void, privs : *mut *mut core::ffi::c_void, serverprincname : *mut windows_sys::core::PWSTR, authnlevel : *mut u32, authnsvc : *mut u32, authzsvc : *mut u32, flags : u32) -> RPC_STATUS);

// UNSUPPORTED Rust 450:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcBindingInqAuthClientW(clientbinding : *const core::ffi::c_void, privs : *mut *mut core::ffi::c_void, serverprincname : *mut windows_sys::core::PWSTR, authnlevel : *mut u32, authnsvc : *mut u32, authzsvc : *mut u32) -> RPC_STATUS);

// UNSUPPORTED Rust 451:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcBindingInqAuthInfoA(binding : *const core::ffi::c_void, serverprincname : *mut windows_sys::core::PSTR, authnlevel : *mut u32, authnsvc : *mut u32, authidentity : *mut *mut core::ffi::c_void, authzsvc : *mut u32) -> RPC_STATUS);

// UNSUPPORTED Rust 452:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn RpcBindingInqAuthInfoExA(binding : *const core::ffi::c_void, serverprincname : *mut windows_sys::core::PSTR, authnlevel : *mut u32, authnsvc : *mut u32, authidentity : *mut *mut core::ffi::c_void, authzsvc : *mut u32, rpcqosversion : u32, securityqos : *mut RPC_SECURITY_QOS) -> RPC_STATUS);

// UNSUPPORTED Rust 454:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn RpcBindingInqAuthInfoExW(binding : *const core::ffi::c_void, serverprincname : *mut windows_sys::core::PWSTR, authnlevel : *mut u32, authnsvc : *mut u32, authidentity : *mut *mut core::ffi::c_void, authzsvc : *mut u32, rpcqosversion : u32, securityqos : *mut RPC_SECURITY_QOS) -> RPC_STATUS);

// UNSUPPORTED Rust 456:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcBindingInqAuthInfoW(binding : *const core::ffi::c_void, serverprincname : *mut windows_sys::core::PWSTR, authnlevel : *mut u32, authnsvc : *mut u32, authidentity : *mut *mut core::ffi::c_void, authzsvc : *mut u32) -> RPC_STATUS);

// UNSUPPORTED Rust 457:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcBindingInqMaxCalls(binding : *const core::ffi::c_void, maxcalls : *mut u32) -> RPC_STATUS);

// UNSUPPORTED Rust 458:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcBindingInqObject(binding : *const core::ffi::c_void, objectuuid : *mut windows_sys::core::GUID) -> RPC_STATUS);

// UNSUPPORTED Rust 459:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcBindingInqOption(hbinding : *const core::ffi::c_void, option : u32, poptionvalue : *mut usize) -> RPC_STATUS);

// UNSUPPORTED Rust 460:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcBindingReset(binding : *const core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 461:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcBindingServerFromClient(clientbinding : *const core::ffi::c_void, serverbinding : *mut *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 462:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcBindingSetAuthInfoA(binding : *const core::ffi::c_void, serverprincname : windows_sys::core::PCSTR, authnlevel : u32, authnsvc : u32, authidentity : *const core::ffi::c_void, authzsvc : u32) -> RPC_STATUS);

// UNSUPPORTED Rust 463:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn RpcBindingSetAuthInfoExA(binding : *const core::ffi::c_void, serverprincname : windows_sys::core::PCSTR, authnlevel : u32, authnsvc : u32, authidentity : *const core::ffi::c_void, authzsvc : u32, securityqos : *const RPC_SECURITY_QOS) -> RPC_STATUS);

// UNSUPPORTED Rust 465:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "system" fn RpcBindingSetAuthInfoExW(binding : *const core::ffi::c_void, serverprincname : windows_sys::core::PCWSTR, authnlevel : u32, authnsvc : u32, authidentity : *const core::ffi::c_void, authzsvc : u32, securityqos : *const RPC_SECURITY_QOS) -> RPC_STATUS);

// UNSUPPORTED Rust 467:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcBindingSetAuthInfoW(binding : *const core::ffi::c_void, serverprincname : windows_sys::core::PCWSTR, authnlevel : u32, authnsvc : u32, authidentity : *const core::ffi::c_void, authzsvc : u32) -> RPC_STATUS);

// UNSUPPORTED Rust 468:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcBindingSetObject(binding : *const core::ffi::c_void, objectuuid : *const windows_sys::core::GUID) -> RPC_STATUS);

// UNSUPPORTED Rust 469:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcBindingSetOption(hbinding : *const core::ffi::c_void, option : u32, optionvalue : usize) -> RPC_STATUS);

// UNSUPPORTED Rust 470:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcBindingToStringBindingA(binding : *const core::ffi::c_void, stringbinding : *mut windows_sys::core::PSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 471:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcBindingToStringBindingW(binding : *const core::ffi::c_void, stringbinding : *mut windows_sys::core::PWSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 472:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcBindingUnbind(binding : *const core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 473:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcBindingVectorFree(bindingvector : *mut *mut RPC_BINDING_VECTOR) -> RPC_STATUS);

// UNSUPPORTED Rust 474:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcCancelThread(thread : *const core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 475:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcCancelThreadEx(thread : *const core::ffi::c_void, timeout : i32) -> RPC_STATUS);

// UNSUPPORTED Rust 476:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// windows_link::link!("rpcrt4.dll" "system" fn RpcCertGeneratePrincipalNameA(context : *const super::super::Security::Cryptography:: CERT_CONTEXT, flags : u32, pbuffer : *mut windows_sys::core::PSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 478:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// windows_link::link!("rpcrt4.dll" "system" fn RpcCertGeneratePrincipalNameW(context : *const super::super::Security::Cryptography:: CERT_CONTEXT, flags : u32, pbuffer : *mut windows_sys::core::PWSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 480:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcEpRegisterA(ifspec : *const core::ffi::c_void, bindingvector : *const RPC_BINDING_VECTOR, uuidvector : *const UUID_VECTOR, annotation : windows_sys::core::PCSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 481:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcEpRegisterNoReplaceA(ifspec : *const core::ffi::c_void, bindingvector : *const RPC_BINDING_VECTOR, uuidvector : *const UUID_VECTOR, annotation : windows_sys::core::PCSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 482:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcEpRegisterNoReplaceW(ifspec : *const core::ffi::c_void, bindingvector : *const RPC_BINDING_VECTOR, uuidvector : *const UUID_VECTOR, annotation : windows_sys::core::PCWSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 483:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcEpRegisterW(ifspec : *const core::ffi::c_void, bindingvector : *const RPC_BINDING_VECTOR, uuidvector : *const UUID_VECTOR, annotation : windows_sys::core::PCWSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 484:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcEpResolveBinding(binding : *const core::ffi::c_void, ifspec : *const core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 485:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcEpUnregister(ifspec : *const core::ffi::c_void, bindingvector : *const RPC_BINDING_VECTOR, uuidvector : *const UUID_VECTOR) -> RPC_STATUS);

// UNSUPPORTED Rust 486:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcErrorAddRecord(errorinfo : *const RPC_EXTENDED_ERROR_INFO) -> RPC_STATUS);

// UNSUPPORTED Rust 487:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcErrorClearInformation());

// UNSUPPORTED Rust 488:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcErrorEndEnumeration(enumhandle : *mut RPC_ERROR_ENUM_HANDLE) -> RPC_STATUS);

// UNSUPPORTED Rust 489:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcErrorGetNextRecord(enumhandle : *const RPC_ERROR_ENUM_HANDLE, copystrings : windows_sys::core::BOOL, errorinfo : *mut RPC_EXTENDED_ERROR_INFO) -> RPC_STATUS);

// UNSUPPORTED Rust 490:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcErrorGetNumberOfRecords(enumhandle : *const RPC_ERROR_ENUM_HANDLE, records : *mut i32) -> RPC_STATUS);

// UNSUPPORTED Rust 491:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcErrorLoadErrorInfo(errorblob : *const core::ffi::c_void, blobsize : usize, enumhandle : *mut RPC_ERROR_ENUM_HANDLE) -> RPC_STATUS);

// UNSUPPORTED Rust 492:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcErrorResetEnumeration(enumhandle : *mut RPC_ERROR_ENUM_HANDLE) -> RPC_STATUS);

// UNSUPPORTED Rust 493:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcErrorSaveErrorInfo(enumhandle : *const RPC_ERROR_ENUM_HANDLE, errorblob : *mut *mut core::ffi::c_void, blobsize : *mut usize) -> RPC_STATUS);

// UNSUPPORTED Rust 494:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcErrorStartEnumeration(enumhandle : *mut RPC_ERROR_ENUM_HANDLE) -> RPC_STATUS);

// UNSUPPORTED Rust 495:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcExceptionFilter(exceptioncode : u32) -> i32);

// UNSUPPORTED Rust 496:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcFreeAuthorizationContext(pauthzclientcontext : *mut *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 497:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcGetAuthorizationContextForClient(clientbinding : *const core::ffi::c_void, impersonateonreturn : windows_sys::core::BOOL, reserved1 : *const core::ffi::c_void, pexpirationtime : *const i64, reserved2 : super::super::Foundation:: LUID, reserved3 : u32, reserved4 : *const core::ffi::c_void, pauthzclientcontext : *mut *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 498:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcIfIdVectorFree(ifidvector : *mut *mut RPC_IF_ID_VECTOR) -> RPC_STATUS);

// UNSUPPORTED Rust 499:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcIfInqId(rpcifhandle : *const core::ffi::c_void, rpcifid : *mut RPC_IF_ID) -> RPC_STATUS);

// UNSUPPORTED Rust 500:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcImpersonateClient(bindinghandle : *const core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 501:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcImpersonateClient2(bindinghandle : *const core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 502:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcImpersonateClientContainer(bindinghandle : *const core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 503:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcMgmtEnableIdleCleanup() -> RPC_STATUS);

// UNSUPPORTED Rust 504:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcMgmtEpEltInqBegin(epbinding : *const core::ffi::c_void, inquirytype : u32, ifid : *const RPC_IF_ID, versoption : u32, objectuuid : *const windows_sys::core::GUID, inquirycontext : *mut *mut *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 505:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcMgmtEpEltInqDone(inquirycontext : *mut *mut *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 506:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcMgmtEpEltInqNextA(inquirycontext : *const *const core::ffi::c_void, ifid : *mut RPC_IF_ID, binding : *mut *mut core::ffi::c_void, objectuuid : *mut windows_sys::core::GUID, annotation : *mut windows_sys::core::PSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 507:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcMgmtEpEltInqNextW(inquirycontext : *const *const core::ffi::c_void, ifid : *mut RPC_IF_ID, binding : *mut *mut core::ffi::c_void, objectuuid : *mut windows_sys::core::GUID, annotation : *mut windows_sys::core::PWSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 508:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcMgmtEpUnregister(epbinding : *const core::ffi::c_void, ifid : *const RPC_IF_ID, binding : *const core::ffi::c_void, objectuuid : *const windows_sys::core::GUID) -> RPC_STATUS);

// UNSUPPORTED Rust 509:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcMgmtInqComTimeout(binding : *const core::ffi::c_void, timeout : *mut u32) -> RPC_STATUS);

// UNSUPPORTED Rust 510:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcMgmtInqDefaultProtectLevel(authnsvc : u32, authnlevel : *mut u32) -> RPC_STATUS);

// UNSUPPORTED Rust 511:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcMgmtInqIfIds(binding : *const core::ffi::c_void, ifidvector : *mut *mut RPC_IF_ID_VECTOR) -> RPC_STATUS);

// UNSUPPORTED Rust 512:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcMgmtInqServerPrincNameA(binding : *const core::ffi::c_void, authnsvc : u32, serverprincname : *mut windows_sys::core::PSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 513:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcMgmtInqServerPrincNameW(binding : *const core::ffi::c_void, authnsvc : u32, serverprincname : *mut windows_sys::core::PWSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 514:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcMgmtInqStats(binding : *const core::ffi::c_void, statistics : *mut *mut RPC_STATS_VECTOR) -> RPC_STATUS);

// UNSUPPORTED Rust 515:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcMgmtIsServerListening(binding : *const core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 516:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcMgmtSetAuthorizationFn(authorizationfn : RPC_MGMT_AUTHORIZATION_FN) -> RPC_STATUS);

// UNSUPPORTED Rust 517:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcMgmtSetCancelTimeout(timeout : i32) -> RPC_STATUS);

// UNSUPPORTED Rust 518:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcMgmtSetComTimeout(binding : *const core::ffi::c_void, timeout : u32) -> RPC_STATUS);

// UNSUPPORTED Rust 519:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcMgmtSetServerStackSize(threadstacksize : u32) -> RPC_STATUS);

// UNSUPPORTED Rust 520:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcMgmtStatsVectorFree(statsvector : *mut *mut RPC_STATS_VECTOR) -> RPC_STATUS);

// UNSUPPORTED Rust 521:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcMgmtStopServerListening(binding : *const core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 522:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcMgmtWaitServerListen() -> RPC_STATUS);

// UNSUPPORTED Rust 523:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcNetworkInqProtseqsA(protseqvector : *mut *mut RPC_PROTSEQ_VECTORA) -> RPC_STATUS);

// UNSUPPORTED Rust 524:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcNetworkInqProtseqsW(protseqvector : *mut *mut RPC_PROTSEQ_VECTORW) -> RPC_STATUS);

// UNSUPPORTED Rust 525:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcNetworkIsProtseqValidA(protseq : windows_sys::core::PCSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 526:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcNetworkIsProtseqValidW(protseq : windows_sys::core::PCWSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 527:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsBindingExportA(entrynamesyntax : u32, entryname : windows_sys::core::PCSTR, ifspec : *const core::ffi::c_void, bindingvec : *const RPC_BINDING_VECTOR, objectuuidvec : *const UUID_VECTOR) -> RPC_STATUS);

// UNSUPPORTED Rust 528:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsBindingExportPnPA(entrynamesyntax : u32, entryname : windows_sys::core::PCSTR, ifspec : *const core::ffi::c_void, objectvector : *const UUID_VECTOR) -> RPC_STATUS);

// UNSUPPORTED Rust 529:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsBindingExportPnPW(entrynamesyntax : u32, entryname : windows_sys::core::PCWSTR, ifspec : *const core::ffi::c_void, objectvector : *const UUID_VECTOR) -> RPC_STATUS);

// UNSUPPORTED Rust 530:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsBindingExportW(entrynamesyntax : u32, entryname : windows_sys::core::PCWSTR, ifspec : *const core::ffi::c_void, bindingvec : *const RPC_BINDING_VECTOR, objectuuidvec : *const UUID_VECTOR) -> RPC_STATUS);

// UNSUPPORTED Rust 531:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsBindingImportBeginA(entrynamesyntax : u32, entryname : windows_sys::core::PCSTR, ifspec : *const core::ffi::c_void, objuuid : *const windows_sys::core::GUID, importcontext : *mut *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 532:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsBindingImportBeginW(entrynamesyntax : u32, entryname : windows_sys::core::PCWSTR, ifspec : *const core::ffi::c_void, objuuid : *const windows_sys::core::GUID, importcontext : *mut *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 533:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsBindingImportDone(importcontext : *mut *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 534:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsBindingImportNext(importcontext : *mut core::ffi::c_void, binding : *mut *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 535:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcNsBindingInqEntryNameA(binding : *const core::ffi::c_void, entrynamesyntax : u32, entryname : *mut windows_sys::core::PSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 536:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcNsBindingInqEntryNameW(binding : *const core::ffi::c_void, entrynamesyntax : u32, entryname : *mut windows_sys::core::PWSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 537:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsBindingLookupBeginA(entrynamesyntax : u32, entryname : windows_sys::core::PCSTR, ifspec : *const core::ffi::c_void, objuuid : *const windows_sys::core::GUID, bindingmaxcount : u32, lookupcontext : *mut *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 538:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsBindingLookupBeginW(entrynamesyntax : u32, entryname : windows_sys::core::PCWSTR, ifspec : *const core::ffi::c_void, objuuid : *const windows_sys::core::GUID, bindingmaxcount : u32, lookupcontext : *mut *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 539:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsBindingLookupDone(lookupcontext : *mut *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 540:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsBindingLookupNext(lookupcontext : *mut core::ffi::c_void, bindingvec : *mut *mut RPC_BINDING_VECTOR) -> RPC_STATUS);

// UNSUPPORTED Rust 541:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsBindingSelect(bindingvec : *mut RPC_BINDING_VECTOR, binding : *mut *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 542:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsBindingUnexportA(entrynamesyntax : u32, entryname : windows_sys::core::PCSTR, ifspec : *const core::ffi::c_void, objectuuidvec : *const UUID_VECTOR) -> RPC_STATUS);

// UNSUPPORTED Rust 543:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsBindingUnexportPnPA(entrynamesyntax : u32, entryname : windows_sys::core::PCSTR, ifspec : *const core::ffi::c_void, objectvector : *const UUID_VECTOR) -> RPC_STATUS);

// UNSUPPORTED Rust 544:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsBindingUnexportPnPW(entrynamesyntax : u32, entryname : windows_sys::core::PCWSTR, ifspec : *const core::ffi::c_void, objectvector : *const UUID_VECTOR) -> RPC_STATUS);

// UNSUPPORTED Rust 545:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsBindingUnexportW(entrynamesyntax : u32, entryname : windows_sys::core::PCWSTR, ifspec : *const core::ffi::c_void, objectuuidvec : *const UUID_VECTOR) -> RPC_STATUS);

// UNSUPPORTED Rust 546:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsEntryExpandNameA(entrynamesyntax : u32, entryname : windows_sys::core::PCSTR, expandedname : *mut windows_sys::core::PSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 547:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsEntryExpandNameW(entrynamesyntax : u32, entryname : windows_sys::core::PCWSTR, expandedname : *mut windows_sys::core::PWSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 548:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsEntryObjectInqBeginA(entrynamesyntax : u32, entryname : windows_sys::core::PCSTR, inquirycontext : *mut *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 549:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsEntryObjectInqBeginW(entrynamesyntax : u32, entryname : windows_sys::core::PCWSTR, inquirycontext : *mut *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 550:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsEntryObjectInqDone(inquirycontext : *mut *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 551:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsEntryObjectInqNext(inquirycontext : *mut core::ffi::c_void, objuuid : *mut windows_sys::core::GUID) -> RPC_STATUS);

// UNSUPPORTED Rust 552:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsGroupDeleteA(groupnamesyntax : GROUP_NAME_SYNTAX, groupname : windows_sys::core::PCSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 553:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsGroupDeleteW(groupnamesyntax : GROUP_NAME_SYNTAX, groupname : windows_sys::core::PCWSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 554:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsGroupMbrAddA(groupnamesyntax : u32, groupname : windows_sys::core::PCSTR, membernamesyntax : u32, membername : windows_sys::core::PCSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 555:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsGroupMbrAddW(groupnamesyntax : u32, groupname : windows_sys::core::PCWSTR, membernamesyntax : u32, membername : windows_sys::core::PCWSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 556:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsGroupMbrInqBeginA(groupnamesyntax : u32, groupname : windows_sys::core::PCSTR, membernamesyntax : u32, inquirycontext : *mut *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 557:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsGroupMbrInqBeginW(groupnamesyntax : u32, groupname : windows_sys::core::PCWSTR, membernamesyntax : u32, inquirycontext : *mut *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 558:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsGroupMbrInqDone(inquirycontext : *mut *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 559:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsGroupMbrInqNextA(inquirycontext : *mut core::ffi::c_void, membername : *mut windows_sys::core::PSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 560:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsGroupMbrInqNextW(inquirycontext : *mut core::ffi::c_void, membername : *mut windows_sys::core::PWSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 561:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsGroupMbrRemoveA(groupnamesyntax : u32, groupname : windows_sys::core::PCSTR, membernamesyntax : u32, membername : windows_sys::core::PCSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 562:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsGroupMbrRemoveW(groupnamesyntax : u32, groupname : windows_sys::core::PCWSTR, membernamesyntax : u32, membername : windows_sys::core::PCWSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 563:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsMgmtBindingUnexportA(entrynamesyntax : u32, entryname : windows_sys::core::PCSTR, ifid : *const RPC_IF_ID, versoption : u32, objectuuidvec : *const UUID_VECTOR) -> RPC_STATUS);

// UNSUPPORTED Rust 564:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsMgmtBindingUnexportW(entrynamesyntax : u32, entryname : windows_sys::core::PCWSTR, ifid : *const RPC_IF_ID, versoption : u32, objectuuidvec : *const UUID_VECTOR) -> RPC_STATUS);

// UNSUPPORTED Rust 565:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsMgmtEntryCreateA(entrynamesyntax : u32, entryname : windows_sys::core::PCSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 566:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsMgmtEntryCreateW(entrynamesyntax : u32, entryname : windows_sys::core::PCWSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 567:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsMgmtEntryDeleteA(entrynamesyntax : u32, entryname : windows_sys::core::PCSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 568:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsMgmtEntryDeleteW(entrynamesyntax : u32, entryname : windows_sys::core::PCWSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 569:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsMgmtEntryInqIfIdsA(entrynamesyntax : u32, entryname : windows_sys::core::PCSTR, ifidvec : *mut *mut RPC_IF_ID_VECTOR) -> RPC_STATUS);

// UNSUPPORTED Rust 570:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsMgmtEntryInqIfIdsW(entrynamesyntax : u32, entryname : windows_sys::core::PCWSTR, ifidvec : *mut *mut RPC_IF_ID_VECTOR) -> RPC_STATUS);

// UNSUPPORTED Rust 571:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsMgmtHandleSetExpAge(nshandle : *mut core::ffi::c_void, expirationage : u32) -> RPC_STATUS);

// UNSUPPORTED Rust 572:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsMgmtInqExpAge(expirationage : *mut u32) -> RPC_STATUS);

// UNSUPPORTED Rust 573:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsMgmtSetExpAge(expirationage : u32) -> RPC_STATUS);

// UNSUPPORTED Rust 574:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsProfileDeleteA(profilenamesyntax : u32, profilename : windows_sys::core::PCSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 575:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsProfileDeleteW(profilenamesyntax : u32, profilename : windows_sys::core::PCWSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 576:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsProfileEltAddA(profilenamesyntax : u32, profilename : windows_sys::core::PCSTR, ifid : *const RPC_IF_ID, membernamesyntax : u32, membername : windows_sys::core::PCSTR, priority : u32, annotation : windows_sys::core::PCSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 577:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsProfileEltAddW(profilenamesyntax : u32, profilename : windows_sys::core::PCWSTR, ifid : *const RPC_IF_ID, membernamesyntax : u32, membername : windows_sys::core::PCWSTR, priority : u32, annotation : windows_sys::core::PCWSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 578:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsProfileEltInqBeginA(profilenamesyntax : u32, profilename : windows_sys::core::PCSTR, inquirytype : u32, ifid : *const RPC_IF_ID, versoption : u32, membernamesyntax : u32, membername : windows_sys::core::PCSTR, inquirycontext : *mut *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 579:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsProfileEltInqBeginW(profilenamesyntax : u32, profilename : windows_sys::core::PCWSTR, inquirytype : u32, ifid : *const RPC_IF_ID, versoption : u32, membernamesyntax : u32, membername : windows_sys::core::PCWSTR, inquirycontext : *mut *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 580:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsProfileEltInqDone(inquirycontext : *mut *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 581:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsProfileEltInqNextA(inquirycontext : *const core::ffi::c_void, ifid : *mut RPC_IF_ID, membername : *mut windows_sys::core::PSTR, priority : *mut u32, annotation : *mut windows_sys::core::PSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 582:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsProfileEltInqNextW(inquirycontext : *const core::ffi::c_void, ifid : *mut RPC_IF_ID, membername : *mut windows_sys::core::PWSTR, priority : *mut u32, annotation : *mut windows_sys::core::PWSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 583:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsProfileEltRemoveA(profilenamesyntax : u32, profilename : windows_sys::core::PCSTR, ifid : *const RPC_IF_ID, membernamesyntax : u32, membername : windows_sys::core::PCSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 584:1: declaration Macro has no candidate rule
// windows_link::link!("rpcns4.dll" "system" fn RpcNsProfileEltRemoveW(profilenamesyntax : u32, profilename : windows_sys::core::PCWSTR, ifid : *const RPC_IF_ID, membernamesyntax : u32, membername : windows_sys::core::PCWSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 585:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcObjectInqType(objuuid : *const windows_sys::core::GUID, typeuuid : *mut windows_sys::core::GUID) -> RPC_STATUS);

// UNSUPPORTED Rust 586:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcObjectSetInqFn(inquiryfn : RPC_OBJECT_INQ_FN) -> RPC_STATUS);

// UNSUPPORTED Rust 587:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcObjectSetType(objuuid : *const windows_sys::core::GUID, typeuuid : *const windows_sys::core::GUID) -> RPC_STATUS);

// UNSUPPORTED Rust 588:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcProtseqVectorFreeA(protseqvector : *mut *mut RPC_PROTSEQ_VECTORA) -> RPC_STATUS);

// UNSUPPORTED Rust 589:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcProtseqVectorFreeW(protseqvector : *mut *mut RPC_PROTSEQ_VECTORW) -> RPC_STATUS);

// UNSUPPORTED Rust 590:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcRaiseException(exception : RPC_STATUS));

// UNSUPPORTED Rust 591:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcRevertContainerImpersonation() -> RPC_STATUS);

// UNSUPPORTED Rust 592:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcRevertToSelf() -> RPC_STATUS);

// UNSUPPORTED Rust 593:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcRevertToSelfEx(bindinghandle : *const core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 594:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcServerCompleteSecurityCallback(bindinghandle : *const core::ffi::c_void, status : RPC_STATUS) -> RPC_STATUS);

// UNSUPPORTED Rust 595:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcServerInqBindingHandle(binding : *mut *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 596:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcServerInqBindings(bindingvector : *mut *mut RPC_BINDING_VECTOR) -> RPC_STATUS);

// UNSUPPORTED Rust 597:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcServerInqBindingsEx(securitydescriptor : *const core::ffi::c_void, bindingvector : *mut *mut RPC_BINDING_VECTOR) -> RPC_STATUS);

// UNSUPPORTED Rust 598:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcServerInqCallAttributesA(clientbinding : *const core::ffi::c_void, rpccallattributes : *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 599:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcServerInqCallAttributesW(clientbinding : *const core::ffi::c_void, rpccallattributes : *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 600:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcServerInqDefaultPrincNameA(authnsvc : u32, princname : *mut windows_sys::core::PSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 601:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcServerInqDefaultPrincNameW(authnsvc : u32, princname : *mut windows_sys::core::PWSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 602:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcServerInqIf(ifspec : *const core::ffi::c_void, mgrtypeuuid : *const windows_sys::core::GUID, mgrepv : *mut *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 603:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcServerInterfaceGroupActivate(ifgroup : *const core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 604:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcServerInterfaceGroupClose(ifgroup : *const core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 605:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcServerInterfaceGroupCreateA(interfaces : *const RPC_INTERFACE_TEMPLATEA, numifs : u32, endpoints : *const RPC_ENDPOINT_TEMPLATEA, numendpoints : u32, idleperiod : u32, idlecallbackfn : RPC_INTERFACE_GROUP_IDLE_CALLBACK_FN, idlecallbackcontext : *const core::ffi::c_void, ifgroup : *mut *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 606:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcServerInterfaceGroupCreateW(interfaces : *const RPC_INTERFACE_TEMPLATEW, numifs : u32, endpoints : *const RPC_ENDPOINT_TEMPLATEW, numendpoints : u32, idleperiod : u32, idlecallbackfn : RPC_INTERFACE_GROUP_IDLE_CALLBACK_FN, idlecallbackcontext : *const core::ffi::c_void, ifgroup : *mut *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 607:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcServerInterfaceGroupDeactivate(ifgroup : *const core::ffi::c_void, forcedeactivation : u32) -> RPC_STATUS);

// UNSUPPORTED Rust 608:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcServerInterfaceGroupInqBindings(ifgroup : *const core::ffi::c_void, bindingvector : *mut *mut RPC_BINDING_VECTOR) -> RPC_STATUS);

// UNSUPPORTED Rust 609:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcServerListen(minimumcallthreads : u32, maxcalls : u32, dontwait : u32) -> RPC_STATUS);

// UNSUPPORTED Rust 610:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcServerRegisterAuthInfoA(serverprincname : windows_sys::core::PCSTR, authnsvc : u32, getkeyfn : RPC_AUTH_KEY_RETRIEVAL_FN, arg : *const core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 611:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcServerRegisterAuthInfoW(serverprincname : windows_sys::core::PCWSTR, authnsvc : u32, getkeyfn : RPC_AUTH_KEY_RETRIEVAL_FN, arg : *const core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 612:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcServerRegisterIf(ifspec : *const core::ffi::c_void, mgrtypeuuid : *const windows_sys::core::GUID, mgrepv : *const core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 613:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcServerRegisterIf2(ifspec : *const core::ffi::c_void, mgrtypeuuid : *const windows_sys::core::GUID, mgrepv : *const core::ffi::c_void, flags : u32, maxcalls : u32, maxrpcsize : u32, ifcallbackfn : RPC_IF_CALLBACK_FN) -> RPC_STATUS);

// UNSUPPORTED Rust 614:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcServerRegisterIf3(ifspec : *const core::ffi::c_void, mgrtypeuuid : *const windows_sys::core::GUID, mgrepv : *const core::ffi::c_void, flags : u32, maxcalls : u32, maxrpcsize : u32, ifcallback : RPC_IF_CALLBACK_FN, securitydescriptor : *const core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 615:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcServerRegisterIfEx(ifspec : *const core::ffi::c_void, mgrtypeuuid : *const windows_sys::core::GUID, mgrepv : *const core::ffi::c_void, flags : u32, maxcalls : u32, ifcallback : RPC_IF_CALLBACK_FN) -> RPC_STATUS);

// UNSUPPORTED Rust 616:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("rpcrt4.dll" "system" fn RpcServerSubscribeForNotification(binding : *const core::ffi::c_void, notification : RPC_NOTIFICATIONS, notificationtype : RPC_NOTIFICATION_TYPES, notificationinfo : *const RPC_ASYNC_NOTIFICATION_INFO) -> RPC_STATUS);

// UNSUPPORTED Rust 618:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcServerTestCancel(bindinghandle : *const core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 619:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcServerUnregisterIf(ifspec : *const core::ffi::c_void, mgrtypeuuid : *const windows_sys::core::GUID, waitforcallstocomplete : u32) -> RPC_STATUS);

// UNSUPPORTED Rust 620:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcServerUnregisterIfEx(ifspec : *const core::ffi::c_void, mgrtypeuuid : *const windows_sys::core::GUID, rundowncontexthandles : i32) -> RPC_STATUS);

// UNSUPPORTED Rust 621:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcServerUnsubscribeForNotification(binding : *const core::ffi::c_void, notification : RPC_NOTIFICATIONS, notificationsqueued : *mut u32) -> RPC_STATUS);

// UNSUPPORTED Rust 622:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcServerUseAllProtseqs(maxcalls : u32, securitydescriptor : *const core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 623:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcServerUseAllProtseqsEx(maxcalls : u32, securitydescriptor : *const core::ffi::c_void, policy : *const RPC_POLICY) -> RPC_STATUS);

// UNSUPPORTED Rust 624:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcServerUseAllProtseqsIf(maxcalls : u32, ifspec : *const core::ffi::c_void, securitydescriptor : *const core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 625:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcServerUseAllProtseqsIfEx(maxcalls : u32, ifspec : *const core::ffi::c_void, securitydescriptor : *const core::ffi::c_void, policy : *const RPC_POLICY) -> RPC_STATUS);

// UNSUPPORTED Rust 626:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcServerUseProtseqA(protseq : windows_sys::core::PCSTR, maxcalls : u32, securitydescriptor : *const core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 627:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcServerUseProtseqEpA(protseq : windows_sys::core::PCSTR, maxcalls : u32, endpoint : windows_sys::core::PCSTR, securitydescriptor : *const core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 628:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcServerUseProtseqEpExA(protseq : windows_sys::core::PCSTR, maxcalls : u32, endpoint : windows_sys::core::PCSTR, securitydescriptor : *const core::ffi::c_void, policy : *const RPC_POLICY) -> RPC_STATUS);

// UNSUPPORTED Rust 629:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcServerUseProtseqEpExW(protseq : windows_sys::core::PCWSTR, maxcalls : u32, endpoint : windows_sys::core::PCWSTR, securitydescriptor : *const core::ffi::c_void, policy : *const RPC_POLICY) -> RPC_STATUS);

// UNSUPPORTED Rust 630:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcServerUseProtseqEpW(protseq : windows_sys::core::PCWSTR, maxcalls : u32, endpoint : windows_sys::core::PCWSTR, securitydescriptor : *const core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 631:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcServerUseProtseqExA(protseq : windows_sys::core::PCSTR, maxcalls : u32, securitydescriptor : *const core::ffi::c_void, policy : *const RPC_POLICY) -> RPC_STATUS);

// UNSUPPORTED Rust 632:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcServerUseProtseqExW(protseq : windows_sys::core::PCWSTR, maxcalls : u32, securitydescriptor : *const core::ffi::c_void, policy : *const RPC_POLICY) -> RPC_STATUS);

// UNSUPPORTED Rust 633:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcServerUseProtseqIfA(protseq : windows_sys::core::PCSTR, maxcalls : u32, ifspec : *const core::ffi::c_void, securitydescriptor : *const core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 634:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcServerUseProtseqIfExA(protseq : windows_sys::core::PCSTR, maxcalls : u32, ifspec : *const core::ffi::c_void, securitydescriptor : *const core::ffi::c_void, policy : *const RPC_POLICY) -> RPC_STATUS);

// UNSUPPORTED Rust 635:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcServerUseProtseqIfExW(protseq : windows_sys::core::PCWSTR, maxcalls : u32, ifspec : *const core::ffi::c_void, securitydescriptor : *const core::ffi::c_void, policy : *const RPC_POLICY) -> RPC_STATUS);

// UNSUPPORTED Rust 636:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcServerUseProtseqIfW(protseq : windows_sys::core::PCWSTR, maxcalls : u32, ifspec : *const core::ffi::c_void, securitydescriptor : *const core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 637:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcServerUseProtseqW(protseq : windows_sys::core::PCWSTR, maxcalls : u32, securitydescriptor : *const core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 638:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcServerYield());

// UNSUPPORTED Rust 639:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcSmAllocate(size : usize, pstatus : *mut RPC_STATUS) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 640:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcSmClientFree(pnodetofree : *const core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 641:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcSmDestroyClientContext(contexthandle : *const *const core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 642:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcSmDisableAllocate() -> RPC_STATUS);

// UNSUPPORTED Rust 643:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcSmEnableAllocate() -> RPC_STATUS);

// UNSUPPORTED Rust 644:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcSmFree(nodetofree : *const core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 645:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcSmGetThreadHandle(pstatus : *mut RPC_STATUS) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 646:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcSmSetClientAllocFree(clientalloc : RPC_CLIENT_ALLOC, clientfree : RPC_CLIENT_FREE) -> RPC_STATUS);

// UNSUPPORTED Rust 647:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcSmSetThreadHandle(id : *const core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 648:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcSmSwapClientAllocFree(clientalloc : RPC_CLIENT_ALLOC, clientfree : RPC_CLIENT_FREE, oldclientalloc : *mut RPC_CLIENT_ALLOC, oldclientfree : *mut RPC_CLIENT_FREE) -> RPC_STATUS);

// UNSUPPORTED Rust 649:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcSsAllocate(size : usize) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 650:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcSsContextLockExclusive(serverbindinghandle : *const core::ffi::c_void, usercontext : *const core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 651:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcSsContextLockShared(serverbindinghandle : *const core::ffi::c_void, usercontext : *const core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 652:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcSsDestroyClientContext(contexthandle : *const *const core::ffi::c_void));

// UNSUPPORTED Rust 653:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcSsDisableAllocate());

// UNSUPPORTED Rust 654:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcSsDontSerializeContext());

// UNSUPPORTED Rust 655:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcSsEnableAllocate());

// UNSUPPORTED Rust 656:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcSsFree(nodetofree : *const core::ffi::c_void));

// UNSUPPORTED Rust 657:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcSsGetContextBinding(contexthandle : *const core::ffi::c_void, binding : *mut *mut core::ffi::c_void) -> RPC_STATUS);

// UNSUPPORTED Rust 658:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcSsGetThreadHandle() -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 659:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcSsSetClientAllocFree(clientalloc : RPC_CLIENT_ALLOC, clientfree : RPC_CLIENT_FREE));

// UNSUPPORTED Rust 660:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcSsSetThreadHandle(id : *const core::ffi::c_void));

// UNSUPPORTED Rust 661:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcSsSwapClientAllocFree(clientalloc : RPC_CLIENT_ALLOC, clientfree : RPC_CLIENT_FREE, oldclientalloc : *mut RPC_CLIENT_ALLOC, oldclientfree : *mut RPC_CLIENT_FREE));

// UNSUPPORTED Rust 662:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcStringBindingComposeA(objuuid : windows_sys::core::PCSTR, protseq : windows_sys::core::PCSTR, networkaddr : windows_sys::core::PCSTR, endpoint : windows_sys::core::PCSTR, options : windows_sys::core::PCSTR, stringbinding : *mut windows_sys::core::PSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 663:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcStringBindingComposeW(objuuid : windows_sys::core::PCWSTR, protseq : windows_sys::core::PCWSTR, networkaddr : windows_sys::core::PCWSTR, endpoint : windows_sys::core::PCWSTR, options : windows_sys::core::PCWSTR, stringbinding : *mut windows_sys::core::PWSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 664:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcStringBindingParseA(stringbinding : windows_sys::core::PCSTR, objuuid : *mut windows_sys::core::PSTR, protseq : *mut windows_sys::core::PSTR, networkaddr : *mut windows_sys::core::PSTR, endpoint : *mut windows_sys::core::PSTR, networkoptions : *mut windows_sys::core::PSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 665:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcStringBindingParseW(stringbinding : windows_sys::core::PCWSTR, objuuid : *mut windows_sys::core::PWSTR, protseq : *mut windows_sys::core::PWSTR, networkaddr : *mut windows_sys::core::PWSTR, endpoint : *mut windows_sys::core::PWSTR, networkoptions : *mut windows_sys::core::PWSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 666:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcStringFreeA(string : *mut windows_sys::core::PSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 667:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcStringFreeW(string : *mut windows_sys::core::PWSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 668:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcTestCancel() -> RPC_STATUS);

// UNSUPPORTED Rust 669:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn RpcUserFree(asynchandle : *mut core::ffi::c_void, pbuffer : *mut core::ffi::c_void));

// UNSUPPORTED Rust 670:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn UuidCompare(uuid1 : *const windows_sys::core::GUID, uuid2 : *const windows_sys::core::GUID, status : *mut RPC_STATUS) -> i32);

// UNSUPPORTED Rust 671:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn UuidCreate(uuid : *mut windows_sys::core::GUID) -> RPC_STATUS);

// UNSUPPORTED Rust 672:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn UuidCreateNil(niluuid : *mut windows_sys::core::GUID) -> RPC_STATUS);

// UNSUPPORTED Rust 673:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn UuidCreateSequential(uuid : *mut windows_sys::core::GUID) -> RPC_STATUS);

// UNSUPPORTED Rust 674:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn UuidEqual(uuid1 : *const windows_sys::core::GUID, uuid2 : *const windows_sys::core::GUID, status : *mut RPC_STATUS) -> i32);

// UNSUPPORTED Rust 675:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn UuidFromStringA(stringuuid : windows_sys::core::PCSTR, uuid : *mut windows_sys::core::GUID) -> RPC_STATUS);

// UNSUPPORTED Rust 676:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn UuidFromStringW(stringuuid : windows_sys::core::PCWSTR, uuid : *mut windows_sys::core::GUID) -> RPC_STATUS);

// UNSUPPORTED Rust 677:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn UuidHash(uuid : *const windows_sys::core::GUID, status : *mut RPC_STATUS) -> u16);

// UNSUPPORTED Rust 678:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn UuidIsNil(uuid : *const windows_sys::core::GUID, status : *mut RPC_STATUS) -> i32);

// UNSUPPORTED Rust 679:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn UuidToStringA(uuid : *const windows_sys::core::GUID, stringuuid : *mut windows_sys::core::PSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 680:1: declaration Macro has no candidate rule
// windows_link::link!("rpcrt4.dll" "system" fn UuidToStringW(uuid : *const windows_sys::core::GUID, stringuuid : *mut windows_sys::core::PWSTR) -> RPC_STATUS);

// UNSUPPORTED Rust 681:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ARRAY_INFO {
//     pub Dimension: i32,
//     pub BufferConformanceMark: *mut u32,
//     pub BufferVarianceMark: *mut u32,
//     pub MaxCountArray: *mut u32,
//     pub OffsetArray: *mut u32,
//     pub ActualCountArray: *mut u32,
// }

// UNSUPPORTED Rust 691:1: declaration Impl has no candidate rule
// impl Default for ARRAY_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 696:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BinaryParam {
//     pub Buffer: *mut core::ffi::c_void,
//     pub Size: i16,
// }

// UNSUPPORTED Rust 702:1: declaration Impl has no candidate rule
// impl Default for BinaryParam {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 707:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CLIENT_CALL_RETURN {
//     pub Pointer: *mut core::ffi::c_void,
//     pub Simple: isize,
// }

// UNSUPPORTED Rust 713:1: declaration Impl has no candidate rule
// impl Default for CLIENT_CALL_RETURN {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 718:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct COMM_FAULT_OFFSETS {
//     pub CommOffset: i16,
//     pub FaultOffset: i16,
// }

// UNSUPPORTED Rust 724:1: generic scalar type unsupported
// pub type CS_TAG_GETTING_ROUTINE = Option<unsafe extern "system" fn(hbinding: *mut core::ffi::c_void, fserverside: i32, pulsendingtag: *mut u32, puldesiredreceivingtag: *mut u32, pulreceivingtag: *mut u32, pstatus: *mut u32)>;

// UNSUPPORTED Rust 725:1: generic scalar type unsupported
// pub type CS_TYPE_FROM_NETCS_ROUTINE = Option<unsafe extern "system" fn(hbinding: *mut core::ffi::c_void, ulnetworkcodeset: u32, pnetworkdata: *mut u8, ulnetworkdatalength: u32, ullocalbuffersize: u32, plocaldata: *mut core::ffi::c_void, pullocaldatalength: *mut u32, pstatus: *mut u32)>;

// UNSUPPORTED Rust 726:1: generic scalar type unsupported
// pub type CS_TYPE_LOCAL_SIZE_ROUTINE = Option<unsafe extern "system" fn(hbinding: *mut core::ffi::c_void, ulnetworkcodeset: u32, ulnetworkbuffersize: u32, conversiontype: *mut IDL_CS_CONVERT, pullocalbuffersize: *mut u32, pstatus: *mut u32)>;

// UNSUPPORTED Rust 727:1: generic scalar type unsupported
// pub type CS_TYPE_NET_SIZE_ROUTINE = Option<unsafe extern "system" fn(hbinding: *mut core::ffi::c_void, ulnetworkcodeset: u32, ullocalbuffersize: u32, conversiontype: *mut IDL_CS_CONVERT, pulnetworkbuffersize: *mut u32, pstatus: *mut u32)>;

// UNSUPPORTED Rust 728:1: generic scalar type unsupported
// pub type CS_TYPE_TO_NETCS_ROUTINE = Option<unsafe extern "system" fn(hbinding: *mut core::ffi::c_void, ulnetworkcodeset: u32, plocaldata: *mut core::ffi::c_void, ullocaldatalength: u32, pnetworkdata: *mut u8, pulnetworkdatalength: *mut u32, pstatus: *mut u32)>;

public const val `DCE_C_ERROR_STRING_LEN`: UInt = 256u;
public const val `EEInfoGCCOM`: UInt = 11u;
public const val `EEInfoGCFRS`: UInt = 12u;
public const val `EEInfoNextRecordsMissing`: UInt = 2u;
public const val `EEInfoPreviousRecordsMissing`: UInt = 1u;
public const val `EEInfoUseFileTime`: UInt = 4u;
public const val `EPT_S_CANT_CREATE`: `RPC_STATUS` = 1899;
public const val `EPT_S_CANT_PERFORM_OP`: `RPC_STATUS` = 1752;
public const val `EPT_S_INVALID_ENTRY`: `RPC_STATUS` = 1751;
public const val `EPT_S_NOT_REGISTERED`: `RPC_STATUS` = 1753;
// UNSUPPORTED Rust 739:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Com")]
// pub type EXPR_EVAL = Option<unsafe extern "system" fn(param0: *mut MIDL_STUB_MESSAGE)>;

public typealias `EXPR_TOKEN` = Int;
public typealias `ExtendedErrorParamTypes` = Int;
public const val `FC_EXPR_CONST32`: `EXPR_TOKEN` = 1;
public const val `FC_EXPR_CONST64`: `EXPR_TOKEN` = 2;
public const val `FC_EXPR_END`: `EXPR_TOKEN` = 6;
public const val `FC_EXPR_ILLEGAL`: `EXPR_TOKEN` = 0;
public const val `FC_EXPR_NOOP`: `EXPR_TOKEN` = 5;
public const val `FC_EXPR_OPER`: `EXPR_TOKEN` = 4;
public const val `FC_EXPR_START`: `EXPR_TOKEN` = 0;
public const val `FC_EXPR_VAR`: `EXPR_TOKEN` = 3;
// UNSUPPORTED Rust 751:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FULL_PTR_XLAT_TABLES {
//     pub RefIdToPointer: *mut core::ffi::c_void,
//     pub PointerToRefId: *mut core::ffi::c_void,
//     pub NextRefId: u32,
//     pub XlatSide: XLAT_SIDE,
// }

// UNSUPPORTED Rust 759:1: declaration Impl has no candidate rule
// impl Default for FULL_PTR_XLAT_TABLES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 764:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GENERIC_BINDING_INFO {
//     pub pObj: *mut core::ffi::c_void,
//     pub Size: u32,
//     pub pfnBind: GENERIC_BINDING_ROUTINE,
//     pub pfnUnbind: GENERIC_UNBIND_ROUTINE,
// }

// UNSUPPORTED Rust 772:1: declaration Impl has no candidate rule
// impl Default for GENERIC_BINDING_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 777:1: generic scalar type unsupported
// pub type GENERIC_BINDING_ROUTINE = Option<unsafe extern "system" fn(param0: *mut core::ffi::c_void) -> *mut core::ffi::c_void>;

// UNSUPPORTED Rust 778:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GENERIC_BINDING_ROUTINE_PAIR {
//     pub pfnBind: GENERIC_BINDING_ROUTINE,
//     pub pfnUnbind: GENERIC_UNBIND_ROUTINE,
// }

// UNSUPPORTED Rust 784:1: generic scalar type unsupported
// pub type GENERIC_UNBIND_ROUTINE = Option<unsafe extern "system" fn(param0: *mut core::ffi::c_void, param1: *mut u8)>;

public typealias `GROUP_NAME_SYNTAX` = UInt;
public typealias `IDL_CS_CONVERT` = Int;
public const val `IDL_CS_IN_PLACE_CONVERT`: `IDL_CS_CONVERT` = 1;
public const val `IDL_CS_NEW_BUFFER_CONVERT`: `IDL_CS_CONVERT` = 2;
public const val `IDL_CS_NO_CONVERT`: `IDL_CS_CONVERT` = 0;
public const val `INVALID_FRAGMENT_ID`: UInt = 0u;
// UNSUPPORTED Rust 791:1: generic scalar type unsupported
// pub type I_RpcFreeCalloutStateFn = Option<unsafe extern "system" fn(calloutstate: *mut RDR_CALLOUT_STATE)>;

// UNSUPPORTED Rust 792:1: generic scalar type unsupported
// pub type I_RpcPerformCalloutFn = Option<unsafe extern "system" fn(context: *mut core::ffi::c_void, calloutstate: *mut RDR_CALLOUT_STATE, stage: RPC_HTTP_REDIRECTOR_STAGE) -> RPC_STATUS>;

// UNSUPPORTED Rust 793:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct I_RpcProxyCallbackInterface {
//     pub IsValidMachineFn: I_RpcProxyIsValidMachineFn,
//     pub GetClientAddressFn: I_RpcProxyGetClientAddressFn,
//     pub GetConnectionTimeoutFn: I_RpcProxyGetConnectionTimeoutFn,
//     pub PerformCalloutFn: I_RpcPerformCalloutFn,
//     pub FreeCalloutStateFn: I_RpcFreeCalloutStateFn,
//     pub GetClientSessionAndResourceUUIDFn: I_RpcProxyGetClientSessionAndResourceUUID,
//     pub ProxyFilterIfFn: I_RpcProxyFilterIfFn,
//     pub RpcProxyUpdatePerfCounterFn: I_RpcProxyUpdatePerfCounterFn,
//     pub RpcProxyUpdatePerfCounterBackendServerFn: I_RpcProxyUpdatePerfCounterBackendServerFn,
// }

// UNSUPPORTED Rust 806:1: generic scalar type unsupported
// pub type I_RpcProxyFilterIfFn = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, ifuuid: *const windows_sys::core::GUID, ifmajorversion: u16, fallow: *mut i32) -> RPC_STATUS>;

// UNSUPPORTED Rust 807:1: generic scalar type unsupported
// pub type I_RpcProxyGetClientAddressFn = Option<unsafe extern "system" fn(context: *mut core::ffi::c_void, buffer: windows_sys::core::PCSTR, bufferlength: *mut u32) -> RPC_STATUS>;

// UNSUPPORTED Rust 808:1: generic scalar type unsupported
// pub type I_RpcProxyGetClientSessionAndResourceUUID = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, sessionidpresent: *mut i32, sessionid: *mut windows_sys::core::GUID, resourceidpresent: *mut i32, resourceid: *mut windows_sys::core::GUID) -> RPC_STATUS>;

// UNSUPPORTED Rust 809:1: generic scalar type unsupported
// pub type I_RpcProxyGetConnectionTimeoutFn = Option<unsafe extern "system" fn(connectiontimeout: *mut u32) -> RPC_STATUS>;

// UNSUPPORTED Rust 810:1: generic scalar type unsupported
// pub type I_RpcProxyIsValidMachineFn = Option<unsafe extern "system" fn(machine: windows_sys::core::PCWSTR, dotmachine: windows_sys::core::PCWSTR, portnumber: u32) -> RPC_STATUS>;

// UNSUPPORTED Rust 811:1: generic scalar type unsupported
// pub type I_RpcProxyUpdatePerfCounterBackendServerFn = Option<unsafe extern "system" fn(machinename: *const u16, isconnectevent: i32)>;

// UNSUPPORTED Rust 812:1: generic scalar type unsupported
// pub type I_RpcProxyUpdatePerfCounterFn = Option<unsafe extern "system" fn(counter: RpcPerfCounters, modifytrend: i32, size: u32)>;

public typealias `LRPC_SYSTEM_HANDLE_MARSHAL_DIRECTION` = Int;
// UNSUPPORTED Rust 814:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MALLOC_FREE_STRUCT {
//     pub pfnAllocate: isize,
//     pub pfnFree: isize,
// }

public const val `MES_DECODE`: `MIDL_ES_CODE` = 1;
public const val `MES_DYNAMIC_BUFFER_HANDLE`: `MIDL_ES_HANDLE_STYLE` = 2;
public const val `MES_ENCODE`: `MIDL_ES_CODE` = 0;
public const val `MES_ENCODE_NDR64`: `MIDL_ES_CODE` = 2;
public const val `MES_FIXED_BUFFER_HANDLE`: `MIDL_ES_HANDLE_STYLE` = 1;
public const val `MES_INCREMENTAL_HANDLE`: `MIDL_ES_HANDLE_STYLE` = 0;
// UNSUPPORTED Rust 826:1: generic scalar type unsupported
// pub type MIDL_ES_ALLOC = Option<unsafe extern "system" fn(state: *mut core::ffi::c_void, pbuffer: *mut *mut i8, psize: *mut u32)>;

public typealias `MIDL_ES_CODE` = Int;
public typealias `MIDL_ES_HANDLE_STYLE` = Int;
// UNSUPPORTED Rust 829:1: generic scalar type unsupported
// pub type MIDL_ES_READ = Option<unsafe extern "system" fn(state: *mut core::ffi::c_void, pbuffer: *mut *mut i8, psize: *mut u32)>;

// UNSUPPORTED Rust 830:1: generic scalar type unsupported
// pub type MIDL_ES_WRITE = Option<unsafe extern "system" fn(state: *mut core::ffi::c_void, buffer: windows_sys::core::PCSTR, size: u32)>;

// UNSUPPORTED Rust 831:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIDL_FORMAT_STRING {
//     pub Pad: i16,
//     pub Format: [u8; 1],
// }

// UNSUPPORTED Rust 837:1: declaration Impl has no candidate rule
// impl Default for MIDL_FORMAT_STRING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 842:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIDL_INTERCEPTION_INFO {
//     pub Version: u32,
//     pub ProcString: *mut u8,
//     pub ProcFormatOffsetTable: *const u16,
//     pub ProcCount: u32,
//     pub TypeString: *mut u8,
// }

// UNSUPPORTED Rust 851:1: declaration Impl has no candidate rule
// impl Default for MIDL_INTERCEPTION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 856:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIDL_INTERFACE_METHOD_PROPERTIES {
//     pub MethodCount: u16,
//     pub MethodProperties: *const *const MIDL_METHOD_PROPERTY_MAP,
// }

// UNSUPPORTED Rust 862:1: declaration Impl has no candidate rule
// impl Default for MIDL_INTERFACE_METHOD_PROPERTIES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 867:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MIDL_METHOD_PROPERTY {
//     pub Id: u32,
//     pub Value: usize,
// }

// UNSUPPORTED Rust 873:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIDL_METHOD_PROPERTY_MAP {
//     pub Count: u32,
//     pub Properties: *const MIDL_METHOD_PROPERTY,
// }

// UNSUPPORTED Rust 879:1: declaration Impl has no candidate rule
// impl Default for MIDL_METHOD_PROPERTY_MAP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 884:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct MIDL_SERVER_INFO {
//     pub pStubDesc: *mut MIDL_STUB_DESC,
//     pub DispatchTable: *const SERVER_ROUTINE,
//     pub ProcString: *mut u8,
//     pub FmtStringOffset: *const u16,
//     pub ThunkTable: *const STUB_THUNK,
//     pub pTransferSyntax: *mut RPC_SYNTAX_IDENTIFIER,
//     pub nCount: usize,
//     pub pSyntaxInfo: *mut MIDL_SYNTAX_INFO,
// }

// UNSUPPORTED Rust 897:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for MIDL_SERVER_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 903:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct MIDL_STUBLESS_PROXY_INFO {
//     pub pStubDesc: *mut MIDL_STUB_DESC,
//     pub ProcFormatString: *mut u8,
//     pub FormatStringOffset: *const u16,
//     pub pTransferSyntax: *mut RPC_SYNTAX_IDENTIFIER,
//     pub nCount: usize,
//     pub pSyntaxInfo: *mut MIDL_SYNTAX_INFO,
// }

// UNSUPPORTED Rust 914:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for MIDL_STUBLESS_PROXY_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 920:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct MIDL_STUB_DESC {
//     pub RpcInterfaceInformation: *mut core::ffi::c_void,
//     pub pfnAllocate: PFN_RPC_ALLOCATE,
//     pub pfnFree: PFN_RPC_FREE,
//     pub IMPLICIT_HANDLE_INFO: MIDL_STUB_DESC_0,
//     pub apfnNdrRundownRoutines: *const NDR_RUNDOWN,
//     pub aGenericBindingRoutinePairs: *const GENERIC_BINDING_ROUTINE_PAIR,
//     pub apfnExprEval: *const EXPR_EVAL,
//     pub aXmitQuintuple: *const XMIT_ROUTINE_QUINTUPLE,
//     pub pFormatTypes: *const u8,
//     pub fCheckBounds: i32,
//     pub Version: u32,
//     pub pMallocFreeStruct: *mut MALLOC_FREE_STRUCT,
//     pub MIDLVersion: i32,
//     pub CommFaultOffsets: *const COMM_FAULT_OFFSETS,
//     pub aUserMarshalQuadruple: *const USER_MARSHAL_ROUTINE_QUADRUPLE,
//     pub NotifyRoutineTable: *const NDR_NOTIFY_ROUTINE,
//     pub mFlags: usize,
//     pub CsRoutineTables: *const NDR_CS_ROUTINES,
//     pub ProxyServerInfo: *mut core::ffi::c_void,
//     pub pExprInfo: *const NDR_EXPR_DESC,
// }

// UNSUPPORTED Rust 945:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for MIDL_STUB_DESC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 951:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub union MIDL_STUB_DESC_0 {
//     pub pAutoHandle: *mut *mut core::ffi::c_void,
//     pub pPrimitiveHandle: *mut *mut core::ffi::c_void,
//     pub pGenericBindingInfo: *mut GENERIC_BINDING_INFO,
// }

// UNSUPPORTED Rust 959:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for MIDL_STUB_DESC_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 965:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct MIDL_STUB_MESSAGE {
//     pub RpcMsg: *mut RPC_MESSAGE,
//     pub Buffer: *mut u8,
//     pub BufferStart: *mut u8,
//     pub BufferEnd: *mut u8,
//     pub BufferMark: *mut u8,
//     pub BufferLength: u32,
//     pub MemorySize: u32,
//     pub Memory: *mut u8,
//     pub IsClient: u8,
//     pub Pad: u8,
//     pub uFlags2: u16,
//     pub ReuseBuffer: i32,
//     pub pAllocAllNodesContext: *mut NDR_ALLOC_ALL_NODES_CONTEXT,
//     pub pPointerQueueState: *mut NDR_POINTER_QUEUE_STATE,
//     pub IgnoreEmbeddedPointers: i32,
//     pub PointerBufferMark: *mut u8,
//     pub CorrDespIncrement: u8,
//     pub uFlags: u8,
//     pub UniquePtrCount: u16,
//     pub MaxCount: usize,
//     pub Offset: u32,
//     pub ActualCount: u32,
//     pub pfnAllocate: PFN_RPC_ALLOCATE,
//     pub pfnFree: PFN_RPC_FREE,
//     pub StackTop: *mut u8,
//     pub pPresentedType: *mut u8,
//     pub pTransmitType: *mut u8,
//     pub SavedHandle: *mut core::ffi::c_void,
//     pub StubDesc: *const MIDL_STUB_DESC,
//     pub FullPtrXlatTables: *mut FULL_PTR_XLAT_TABLES,
//     pub FullPtrRefId: u32,
//     pub PointerLength: u32,
//     pub _bitfield: i32,
//     pub dwDestContext: u32,
//     pub pvDestContext: *mut core::ffi::c_void,
//     pub SavedContextHandles: *mut *mut NDR_SCONTEXT,
//     pub ParamNumber: i32,
//     pub pRpcChannelBuffer: *mut core::ffi::c_void,
//     pub pArrayInfo: *mut ARRAY_INFO,
//     pub SizePtrCountArray: *mut u32,
//     pub SizePtrOffsetArray: *mut u32,
//     pub SizePtrLengthArray: *mut u32,
//     pub pArgQueue: *mut core::ffi::c_void,
//     pub dwStubPhase: u32,
//     pub LowStackMark: *mut core::ffi::c_void,
//     pub pAsyncMsg: PNDR_ASYNC_MESSAGE,
//     pub pCorrInfo: PNDR_CORRELATION_INFO,
//     pub pCorrMemory: *mut u8,
//     pub pMemoryList: *mut core::ffi::c_void,
//     pub pCSInfo: isize,
//     pub ConformanceMark: *mut u8,
//     pub VarianceMark: *mut u8,
//     pub Unused: isize,
//     pub pContext: *mut _NDR_PROC_CONTEXT,
//     pub ContextHandleHash: *mut core::ffi::c_void,
//     pub pUserMarshalList: *mut core::ffi::c_void,
//     pub Reserved51_3: isize,
//     pub Reserved51_4: isize,
//     pub Reserved51_5: isize,
// }

// UNSUPPORTED Rust 1029:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for MIDL_STUB_MESSAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1035:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIDL_SYNTAX_INFO {
//     pub TransferSyntax: RPC_SYNTAX_IDENTIFIER,
//     pub DispatchTable: *mut RPC_DISPATCH_TABLE,
//     pub ProcString: *mut u8,
//     pub FmtStringOffset: *const u16,
//     pub TypeString: *mut u8,
//     pub aUserMarshalQuadruple: *const core::ffi::c_void,
//     pub pMethodProperties: *const MIDL_INTERFACE_METHOD_PROPERTIES,
//     pub pReserved2: usize,
// }

// UNSUPPORTED Rust 1047:1: declaration Impl has no candidate rule
// impl Default for MIDL_SYNTAX_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1052:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIDL_TYPE_PICKLING_INFO {
//     pub Version: u32,
//     pub Flags: u32,
//     pub Reserved: [usize; 3],
// }

// UNSUPPORTED Rust 1059:1: declaration Impl has no candidate rule
// impl Default for MIDL_TYPE_PICKLING_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1064:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct MIDL_WINRT_TYPE_SERIALIZATION_INFO {
//     pub Version: u32,
//     pub TypeFormatString: *mut u8,
//     pub FormatStringSize: u16,
//     pub TypeOffset: u16,
//     pub StubDesc: *mut MIDL_STUB_DESC,
// }

// UNSUPPORTED Rust 1074:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for MIDL_WINRT_TYPE_SERIALIZATION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MIDL_WINRT_TYPE_SERIALIZATION_INFO_CURRENT_VERSION`: Int = 1;
public const val `MarshalDirectionMarshal`: `LRPC_SYSTEM_HANDLE_MARSHAL_DIRECTION` = 0;
public const val `MarshalDirectionUnmarshal`: `LRPC_SYSTEM_HANDLE_MARSHAL_DIRECTION` = 1;
public const val `MaxNumberOfEEInfoParams`: UInt = 4u;
public const val `MidlInterceptionInfoVersionOne`: Int = 1;
public const val `MidlWinrtTypeSerializationInfoVersionOne`: Int = 1;
// UNSUPPORTED Rust 1086:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDR64_ARRAY_ELEMENT_INFO {
//     pub ElementMemSize: u32,
//     pub Element: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1092:1: declaration Impl has no candidate rule
// impl Default for NDR64_ARRAY_ELEMENT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1097:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NDR64_ARRAY_FLAGS {
//     pub _bitfield: u8,
// }

// UNSUPPORTED Rust 1102:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NDR64_BINDINGS {
//     pub Primitive: NDR64_BIND_PRIMITIVE,
//     pub Generic: NDR64_BIND_GENERIC,
//     pub Context: NDR64_BIND_CONTEXT,
// }

// UNSUPPORTED Rust 1109:1: declaration Impl has no candidate rule
// impl Default for NDR64_BINDINGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1114:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NDR64_BIND_AND_NOTIFY_EXTENSION {
//     pub Binding: NDR64_BIND_CONTEXT,
//     pub NotifyIndex: u16,
// }

// UNSUPPORTED Rust 1120:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NDR64_BIND_CONTEXT {
//     pub HandleType: u8,
//     pub Flags: u8,
//     pub StackOffset: u16,
//     pub RoutineIndex: u8,
//     pub Ordinal: u8,
// }

// UNSUPPORTED Rust 1129:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NDR64_BIND_GENERIC {
//     pub HandleType: u8,
//     pub Flags: u8,
//     pub StackOffset: u16,
//     pub RoutineIndex: u8,
//     pub Size: u8,
// }

// UNSUPPORTED Rust 1138:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NDR64_BIND_PRIMITIVE {
//     pub HandleType: u8,
//     pub Flags: u8,
//     pub StackOffset: u16,
//     pub Reserved: u16,
// }

// UNSUPPORTED Rust 1146:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDR64_BOGUS_ARRAY_HEADER_FORMAT {
//     pub FormatCode: u8,
//     pub Alignment: u8,
//     pub Flags: NDR64_ARRAY_FLAGS,
//     pub NumberDims: u8,
//     pub NumberElements: u32,
//     pub Element: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1156:1: declaration Impl has no candidate rule
// impl Default for NDR64_BOGUS_ARRAY_HEADER_FORMAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1161:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDR64_BOGUS_STRUCTURE_HEADER_FORMAT {
//     pub FormatCode: u8,
//     pub Alignment: u8,
//     pub Flags: NDR64_STRUCTURE_FLAGS,
//     pub Reserve: u8,
//     pub MemorySize: u32,
//     pub OriginalMemberLayout: *mut core::ffi::c_void,
//     pub OriginalPointerLayout: *mut core::ffi::c_void,
//     pub PointerLayout: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1173:1: declaration Impl has no candidate rule
// impl Default for NDR64_BOGUS_STRUCTURE_HEADER_FORMAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1178:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NDR64_BUFFER_ALIGN_FORMAT {
//     pub FormatCode: u8,
//     pub Alignment: u8,
//     pub Reserved: u16,
//     pub Reserved2: u32,
// }

// UNSUPPORTED Rust 1186:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NDR64_CONFORMANT_STRING_FORMAT {
//     pub Header: NDR64_STRING_HEADER_FORMAT,
// }

// UNSUPPORTED Rust 1191:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDR64_CONF_ARRAY_HEADER_FORMAT {
//     pub FormatCode: u8,
//     pub Alignment: u8,
//     pub Flags: NDR64_ARRAY_FLAGS,
//     pub Reserved: u8,
//     pub ElementSize: u32,
//     pub ConfDescriptor: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1201:1: declaration Impl has no candidate rule
// impl Default for NDR64_CONF_ARRAY_HEADER_FORMAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1206:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDR64_CONF_BOGUS_STRUCTURE_HEADER_FORMAT {
//     pub FormatCode: u8,
//     pub Alignment: u8,
//     pub Flags: NDR64_STRUCTURE_FLAGS,
//     pub Dimensions: u8,
//     pub MemorySize: u32,
//     pub OriginalMemberLayout: *mut core::ffi::c_void,
//     pub OriginalPointerLayout: *mut core::ffi::c_void,
//     pub PointerLayout: *mut core::ffi::c_void,
//     pub ConfArrayDescription: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1219:1: declaration Impl has no candidate rule
// impl Default for NDR64_CONF_BOGUS_STRUCTURE_HEADER_FORMAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1224:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDR64_CONF_STRUCTURE_HEADER_FORMAT {
//     pub FormatCode: u8,
//     pub Alignment: u8,
//     pub Flags: NDR64_STRUCTURE_FLAGS,
//     pub Reserve: u8,
//     pub MemorySize: u32,
//     pub ArrayDescription: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1234:1: declaration Impl has no candidate rule
// impl Default for NDR64_CONF_STRUCTURE_HEADER_FORMAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1239:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDR64_CONF_VAR_ARRAY_HEADER_FORMAT {
//     pub FormatCode: u8,
//     pub Alignment: u8,
//     pub Flags: NDR64_ARRAY_FLAGS,
//     pub Reserved: u8,
//     pub ElementSize: u32,
//     pub ConfDescriptor: *mut core::ffi::c_void,
//     pub VarDescriptor: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1250:1: declaration Impl has no candidate rule
// impl Default for NDR64_CONF_VAR_ARRAY_HEADER_FORMAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1255:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDR64_CONF_VAR_BOGUS_ARRAY_HEADER_FORMAT {
//     pub FixedArrayFormat: NDR64_BOGUS_ARRAY_HEADER_FORMAT,
//     pub ConfDescription: *mut core::ffi::c_void,
//     pub VarDescription: *mut core::ffi::c_void,
//     pub OffsetDescription: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1263:1: declaration Impl has no candidate rule
// impl Default for NDR64_CONF_VAR_BOGUS_ARRAY_HEADER_FORMAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1268:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NDR64_CONSTANT_IID_FORMAT {
//     pub FormatCode: u8,
//     pub Flags: u8,
//     pub Reserved: u16,
//     pub Guid: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 1276:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NDR64_CONTEXT_HANDLE_FLAGS {
//     pub _bitfield: u8,
// }

// UNSUPPORTED Rust 1281:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NDR64_CONTEXT_HANDLE_FORMAT {
//     pub FormatCode: u8,
//     pub ContextFlags: u8,
//     pub RundownRoutineIndex: u8,
//     pub Ordinal: u8,
// }

// UNSUPPORTED Rust 1289:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDR64_EMBEDDED_COMPLEX_FORMAT {
//     pub FormatCode: u8,
//     pub Reserve1: u8,
//     pub Reserve2: u16,
//     pub Type: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1297:1: declaration Impl has no candidate rule
// impl Default for NDR64_EMBEDDED_COMPLEX_FORMAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1302:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NDR64_ENCAPSULATED_UNION {
//     pub FormatCode: u8,
//     pub Alignment: u8,
//     pub Flags: u8,
//     pub SwitchType: u8,
//     pub MemoryOffset: u32,
//     pub MemorySize: u32,
//     pub Reserved: u32,
// }

// UNSUPPORTED Rust 1313:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NDR64_EXPR_CONST32 {
//     pub ExprType: u8,
//     pub Reserved: u8,
//     pub Reserved1: u16,
//     pub ConstValue: u32,
// }

// UNSUPPORTED Rust 1321:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NDR64_EXPR_CONST64 {
//     pub ExprType: u8,
//     pub Reserved: u8,
//     pub Reserved1: u16,
//     pub ConstValue: i64,
// }

// UNSUPPORTED Rust 1329:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NDR64_EXPR_NOOP {
//     pub ExprType: u8,
//     pub Size: u8,
//     pub Reserved: u16,
// }

// UNSUPPORTED Rust 1336:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NDR64_EXPR_OPERATOR {
//     pub ExprType: u8,
//     pub Operator: u8,
//     pub CastType: u8,
//     pub Reserved: u8,
// }

// UNSUPPORTED Rust 1344:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NDR64_EXPR_VAR {
//     pub ExprType: u8,
//     pub VarType: u8,
//     pub Reserved: u16,
//     pub Offset: u32,
// }

public const val `NDR64_FC_AUTO_HANDLE`: UInt = 3u;
public const val `NDR64_FC_BIND_GENERIC`: UInt = 1u;
public const val `NDR64_FC_BIND_PRIMITIVE`: UInt = 2u;
public const val `NDR64_FC_CALLBACK_HANDLE`: UInt = 4u;
public const val `NDR64_FC_EXPLICIT_HANDLE`: UInt = 0u;
public const val `NDR64_FC_NO_HANDLE`: UInt = 5u;
// UNSUPPORTED Rust 1358:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NDR64_FIXED_REPEAT_FORMAT {
//     pub RepeatFormat: NDR64_REPEAT_FORMAT,
//     pub Iterations: u32,
//     pub Reserved: u32,
// }

// UNSUPPORTED Rust 1365:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NDR64_FIX_ARRAY_HEADER_FORMAT {
//     pub FormatCode: u8,
//     pub Alignment: u8,
//     pub Flags: NDR64_ARRAY_FLAGS,
//     pub Reserved: u8,
//     pub TotalSize: u32,
// }

// UNSUPPORTED Rust 1374:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NDR64_IID_FLAGS {
//     pub _bitfield: u8,
// }

// UNSUPPORTED Rust 1379:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDR64_IID_FORMAT {
//     pub FormatCode: u8,
//     pub Flags: u8,
//     pub Reserved: u16,
//     pub IIDDescriptor: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1387:1: declaration Impl has no candidate rule
// impl Default for NDR64_IID_FORMAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1392:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NDR64_MEMPAD_FORMAT {
//     pub FormatCode: u8,
//     pub Reserve1: u8,
//     pub MemPad: u16,
//     pub Reserved2: u32,
// }

// UNSUPPORTED Rust 1400:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NDR64_NON_CONFORMANT_STRING_FORMAT {
//     pub Header: NDR64_STRING_HEADER_FORMAT,
//     pub TotalSize: u32,
// }

// UNSUPPORTED Rust 1406:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDR64_NON_ENCAPSULATED_UNION {
//     pub FormatCode: u8,
//     pub Alignment: u8,
//     pub Flags: u8,
//     pub SwitchType: u8,
//     pub MemorySize: u32,
//     pub Switch: *mut core::ffi::c_void,
//     pub Reserved: u32,
// }

// UNSUPPORTED Rust 1417:1: declaration Impl has no candidate rule
// impl Default for NDR64_NON_ENCAPSULATED_UNION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1422:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NDR64_NO_REPEAT_FORMAT {
//     pub FormatCode: u8,
//     pub Flags: u8,
//     pub Reserved1: u16,
//     pub Reserved2: u32,
// }

// UNSUPPORTED Rust 1430:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NDR64_PARAM_FLAGS {
//     pub _bitfield: u16,
// }

// UNSUPPORTED Rust 1435:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDR64_PARAM_FORMAT {
//     pub Type: *mut core::ffi::c_void,
//     pub Attributes: NDR64_PARAM_FLAGS,
//     pub Reserved: u16,
//     pub StackOffset: u32,
// }

// UNSUPPORTED Rust 1443:1: declaration Impl has no candidate rule
// impl Default for NDR64_PARAM_FORMAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1448:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NDR64_PIPE_FLAGS {
//     pub _bitfield: u8,
// }

// UNSUPPORTED Rust 1453:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDR64_PIPE_FORMAT {
//     pub FormatCode: u8,
//     pub Flags: u8,
//     pub Alignment: u8,
//     pub Reserved: u8,
//     pub Type: *mut core::ffi::c_void,
//     pub MemorySize: u32,
//     pub BufferSize: u32,
// }

// UNSUPPORTED Rust 1464:1: declaration Impl has no candidate rule
// impl Default for NDR64_PIPE_FORMAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1469:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDR64_POINTER_FORMAT {
//     pub FormatCode: u8,
//     pub Flags: u8,
//     pub Reserved: u16,
//     pub Pointee: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1477:1: declaration Impl has no candidate rule
// impl Default for NDR64_POINTER_FORMAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1482:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NDR64_POINTER_INSTANCE_HEADER_FORMAT {
//     pub Offset: u32,
//     pub Reserved: u32,
// }

// UNSUPPORTED Rust 1488:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NDR64_POINTER_REPEAT_FLAGS {
//     pub _bitfield: u8,
// }

// UNSUPPORTED Rust 1493:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NDR64_PROC_FLAGS {
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 1498:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NDR64_PROC_FORMAT {
//     pub Flags: u32,
//     pub StackSize: u32,
//     pub ConstantClientBufferSize: u32,
//     pub ConstantServerBufferSize: u32,
//     pub RpcFlags: u16,
//     pub FloatDoubleMask: u16,
//     pub NumberOfParams: u16,
//     pub ExtensionSize: u16,
// }

// UNSUPPORTED Rust 1510:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NDR64_RANGED_STRING_FORMAT {
//     pub Header: NDR64_STRING_HEADER_FORMAT,
//     pub Reserved: u32,
//     pub Min: u64,
//     pub Max: u64,
// }

// UNSUPPORTED Rust 1518:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NDR64_RANGE_FORMAT {
//     pub FormatCode: u8,
//     pub RangeType: u8,
//     pub Reserved: u16,
//     pub MinValue: i64,
//     pub MaxValue: i64,
// }

// UNSUPPORTED Rust 1527:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDR64_RANGE_PIPE_FORMAT {
//     pub FormatCode: u8,
//     pub Flags: u8,
//     pub Alignment: u8,
//     pub Reserved: u8,
//     pub Type: *mut core::ffi::c_void,
//     pub MemorySize: u32,
//     pub BufferSize: u32,
//     pub MinValue: u32,
//     pub MaxValue: u32,
// }

// UNSUPPORTED Rust 1540:1: declaration Impl has no candidate rule
// impl Default for NDR64_RANGE_PIPE_FORMAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1545:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NDR64_REPEAT_FORMAT {
//     pub FormatCode: u8,
//     pub Flags: NDR64_POINTER_REPEAT_FLAGS,
//     pub Reserved: u16,
//     pub Increment: u32,
//     pub OffsetToArray: u32,
//     pub NumberOfPointers: u32,
// }

// UNSUPPORTED Rust 1555:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NDR64_RPC_FLAGS {
//     pub _bitfield: u16,
// }

// UNSUPPORTED Rust 1560:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NDR64_SIMPLE_MEMBER_FORMAT {
//     pub FormatCode: u8,
//     pub Reserved1: u8,
//     pub Reserved2: u16,
//     pub Reserved3: u32,
// }

// UNSUPPORTED Rust 1568:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NDR64_SIMPLE_REGION_FORMAT {
//     pub FormatCode: u8,
//     pub Alignment: u8,
//     pub RegionSize: u16,
//     pub Reserved: u32,
// }

// UNSUPPORTED Rust 1576:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDR64_SIZED_CONFORMANT_STRING_FORMAT {
//     pub Header: NDR64_STRING_HEADER_FORMAT,
//     pub SizeDescription: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1582:1: declaration Impl has no candidate rule
// impl Default for NDR64_SIZED_CONFORMANT_STRING_FORMAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1587:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NDR64_STRING_FLAGS {
//     pub _bitfield: u8,
// }

// UNSUPPORTED Rust 1592:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NDR64_STRING_HEADER_FORMAT {
//     pub FormatCode: u8,
//     pub Flags: NDR64_STRING_FLAGS,
//     pub ElementSize: u16,
// }

// UNSUPPORTED Rust 1599:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NDR64_STRUCTURE_FLAGS {
//     pub _bitfield: u8,
// }

// UNSUPPORTED Rust 1604:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NDR64_STRUCTURE_HEADER_FORMAT {
//     pub FormatCode: u8,
//     pub Alignment: u8,
//     pub Flags: NDR64_STRUCTURE_FLAGS,
//     pub Reserve: u8,
//     pub MemorySize: u32,
// }

// UNSUPPORTED Rust 1613:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NDR64_SYSTEM_HANDLE_FORMAT {
//     pub FormatCode: u8,
//     pub HandleType: u8,
//     pub DesiredAccess: u32,
// }

// UNSUPPORTED Rust 1620:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NDR64_TRANSMIT_AS_FLAGS {
//     pub _bitfield: u8,
// }

// UNSUPPORTED Rust 1625:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDR64_TRANSMIT_AS_FORMAT {
//     pub FormatCode: u8,
//     pub Flags: u8,
//     pub RoutineIndex: u16,
//     pub TransmittedTypeWireAlignment: u16,
//     pub MemoryAlignment: u16,
//     pub PresentedTypeMemorySize: u32,
//     pub TransmittedTypeBufferSize: u32,
//     pub TransmittedType: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1637:1: declaration Impl has no candidate rule
// impl Default for NDR64_TRANSMIT_AS_FORMAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1642:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDR64_TYPE_STRICT_CONTEXT_HANDLE {
//     pub FormatCode: u8,
//     pub RealFormatCode: u8,
//     pub Reserved: u16,
//     pub Type: *mut core::ffi::c_void,
//     pub CtxtFlags: u32,
//     pub CtxtID: u32,
// }

// UNSUPPORTED Rust 1652:1: declaration Impl has no candidate rule
// impl Default for NDR64_TYPE_STRICT_CONTEXT_HANDLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1657:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDR64_UNION_ARM {
//     pub CaseValue: i64,
//     pub Type: *mut core::ffi::c_void,
//     pub Reserved: u32,
// }

// UNSUPPORTED Rust 1664:1: declaration Impl has no candidate rule
// impl Default for NDR64_UNION_ARM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1669:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NDR64_UNION_ARM_SELECTOR {
//     pub Reserved1: u8,
//     pub Alignment: u8,
//     pub Reserved2: u16,
//     pub Arms: u32,
// }

// UNSUPPORTED Rust 1677:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NDR64_USER_MARSHAL_FLAGS {
//     pub _bitfield: u8,
// }

// UNSUPPORTED Rust 1682:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDR64_USER_MARSHAL_FORMAT {
//     pub FormatCode: u8,
//     pub Flags: u8,
//     pub RoutineIndex: u16,
//     pub TransmittedTypeWireAlignment: u16,
//     pub MemoryAlignment: u16,
//     pub UserTypeMemorySize: u32,
//     pub TransmittedTypeBufferSize: u32,
//     pub TransmittedType: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1694:1: declaration Impl has no candidate rule
// impl Default for NDR64_USER_MARSHAL_FORMAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1699:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDR64_VAR_ARRAY_HEADER_FORMAT {
//     pub FormatCode: u8,
//     pub Alignment: u8,
//     pub Flags: NDR64_ARRAY_FLAGS,
//     pub Reserved: u8,
//     pub TotalSize: u32,
//     pub ElementSize: u32,
//     pub VarDescriptor: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1710:1: declaration Impl has no candidate rule
// impl Default for NDR64_VAR_ARRAY_HEADER_FORMAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `NDR_ALLOC_ALL_NODES_CONTEXT` = Long;
// UNSUPPORTED Rust 1716:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDR_CS_ROUTINES {
//     pub pSizeConvertRoutines: *mut NDR_CS_SIZE_CONVERT_ROUTINES,
//     pub pTagGettingRoutines: *mut CS_TAG_GETTING_ROUTINE,
// }

// UNSUPPORTED Rust 1722:1: declaration Impl has no candidate rule
// impl Default for NDR_CS_ROUTINES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1727:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NDR_CS_SIZE_CONVERT_ROUTINES {
//     pub pfnNetSize: CS_TYPE_NET_SIZE_ROUTINE,
//     pub pfnToNetCs: CS_TYPE_TO_NETCS_ROUTINE,
//     pub pfnLocalSize: CS_TYPE_LOCAL_SIZE_ROUTINE,
//     pub pfnFromNetCs: CS_TYPE_FROM_NETCS_ROUTINE,
// }

public const val `NDR_CUSTOM_OR_DEFAULT_ALLOCATOR`: UInt = 268435456u;
public const val `NDR_DEFAULT_ALLOCATOR`: UInt = 536870912u;
// UNSUPPORTED Rust 1737:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDR_EXPR_DESC {
//     pub pOffset: *const u16,
//     pub pFormatExpr: *mut u8,
// }

// UNSUPPORTED Rust 1743:1: declaration Impl has no candidate rule
// impl Default for NDR_EXPR_DESC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1748:1: generic scalar type unsupported
// pub type NDR_NOTIFY2_ROUTINE = Option<unsafe extern "system" fn(flag: u8)>;

// UNSUPPORTED Rust 1749:1: generic scalar type unsupported
// pub type NDR_NOTIFY_ROUTINE = Option<unsafe extern "system" fn()>;

public typealias `NDR_POINTER_QUEUE_STATE` = Long;
// UNSUPPORTED Rust 1751:1: generic scalar type unsupported
// pub type NDR_RUNDOWN = Option<unsafe extern "system" fn(context: *mut core::ffi::c_void)>;

// UNSUPPORTED Rust 1752:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDR_SCONTEXT {
//     pub pad: [*mut core::ffi::c_void; 2],
//     pub userContext: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1758:1: declaration Impl has no candidate rule
// impl Default for NDR_SCONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1763:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct NDR_USER_MARSHAL_INFO {
//     pub InformationLevel: u32,
//     pub Anonymous: NDR_USER_MARSHAL_INFO_0,
// }

// UNSUPPORTED Rust 1770:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for NDR_USER_MARSHAL_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1776:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub union NDR_USER_MARSHAL_INFO_0 {
//     pub Level1: NDR_USER_MARSHAL_INFO_LEVEL1,
// }

// UNSUPPORTED Rust 1782:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for NDR_USER_MARSHAL_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1788:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct NDR_USER_MARSHAL_INFO_LEVEL1 {
//     pub Buffer: *mut core::ffi::c_void,
//     pub BufferSize: u32,
//     pub pfnAllocate: isize,
//     pub pfnFree: isize,
//     pub pRpcChannelBuffer: *mut core::ffi::c_void,
//     pub Reserved: [usize; 5],
// }

// UNSUPPORTED Rust 1799:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for NDR_USER_MARSHAL_INFO_LEVEL1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NT351_INTERFACE_SIZE`: UInt = 64u;
// UNSUPPORTED Rust 1806:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_IO")]
// pub type PFN_RPCNOTIFICATION_ROUTINE = Option<unsafe extern "system" fn(pasync: *mut RPC_ASYNC_STATE, context: *mut core::ffi::c_void, event: RPC_ASYNC_EVENT)>;

// UNSUPPORTED Rust 1808:1: generic scalar type unsupported
// pub type PFN_RPC_ALLOCATE = Option<unsafe extern "system" fn(param0: usize) -> *mut core::ffi::c_void>;

// UNSUPPORTED Rust 1809:1: generic scalar type unsupported
// pub type PFN_RPC_FREE = Option<unsafe extern "system" fn(param0: *mut core::ffi::c_void)>;

public typealias `PNDR_ASYNC_MESSAGE` = Long;
public typealias `PNDR_CORRELATION_INFO` = Long;
public const val `PROTOCOL_ADDRESS_CHANGE`: `RPC_ADDRESS_CHANGE_TYPE` = 3;
public const val `PROTOCOL_LOADED`: `RPC_ADDRESS_CHANGE_TYPE` = 2;
public const val `PROTOCOL_NOT_LOADED`: `RPC_ADDRESS_CHANGE_TYPE` = 1;
public const val `PROXY_CALCSIZE`: `PROXY_PHASE` = 0;
public const val `PROXY_GETBUFFER`: `PROXY_PHASE` = 1;
public const val `PROXY_MARSHAL`: `PROXY_PHASE` = 2;
public typealias `PROXY_PHASE` = Int;
public const val `PROXY_SENDRECEIVE`: `PROXY_PHASE` = 3;
public const val `PROXY_UNMARSHAL`: `PROXY_PHASE` = 4;
// UNSUPPORTED Rust 1821:1: generic scalar type unsupported
// pub type PRPC_RUNDOWN = Option<unsafe extern "system" fn(associationcontext: *mut core::ffi::c_void)>;

// UNSUPPORTED Rust 1822:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RDR_CALLOUT_STATE {
//     pub LastError: RPC_STATUS,
//     pub LastEEInfo: *mut core::ffi::c_void,
//     pub LastCalledStage: RPC_HTTP_REDIRECTOR_STAGE,
//     pub ServerName: *mut u16,
//     pub ServerPort: *mut u16,
//     pub RemoteUser: *mut u16,
//     pub AuthType: *mut u16,
//     pub ResourceTypePresent: u8,
//     pub SessionIdPresent: u8,
//     pub InterfacePresent: u8,
//     pub ResourceType: windows_sys::core::GUID,
//     pub SessionId: windows_sys::core::GUID,
//     pub Interface: RPC_SYNTAX_IDENTIFIER,
//     pub CertContext: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1840:1: declaration Impl has no candidate rule
// impl Default for RDR_CALLOUT_STATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RPCFLG_ACCESSIBILITY_BIT1`: UInt = 1048576u;
public const val `RPCFLG_ACCESSIBILITY_BIT2`: UInt = 2097152u;
public const val `RPCFLG_ACCESS_LOCAL`: UInt = 4194304u;
public const val `RPCFLG_ASYNCHRONOUS`: UInt = 1073741824u;
public const val `RPCFLG_AUTO_COMPLETE`: UInt = 134217728u;
public const val `RPCFLG_HAS_CALLBACK`: UInt = 67108864u;
public const val `RPCFLG_HAS_GUARANTEE`: UInt = 16u;
public const val `RPCFLG_HAS_MULTI_SYNTAXES`: UInt = 33554432u;
public const val `RPCFLG_INPUT_SYNCHRONOUS`: UInt = 536870912u;
public const val `RPCFLG_LOCAL_CALL`: UInt = 268435456u;
public const val `RPCFLG_MESSAGE`: UInt = 16777216u;
public const val `RPCFLG_NDR64_CONTAINS_ARM_LAYOUT`: UInt = 67108864u;
public const val `RPCFLG_NON_NDR`: UInt = 2147483648u;
public const val `RPCFLG_SENDER_WAITING_FOR_REPLY`: UInt = 8388608u;
public const val `RPCFLG_WINRT_REMOTE_ASYNC`: UInt = 32u;
public const val `RPCHTTP_RS_ACCESS_1`: `RPC_HTTP_REDIRECTOR_STAGE` = 2;
public const val `RPCHTTP_RS_ACCESS_2`: `RPC_HTTP_REDIRECTOR_STAGE` = 4;
public const val `RPCHTTP_RS_INTERFACE`: `RPC_HTTP_REDIRECTOR_STAGE` = 5;
public const val `RPCHTTP_RS_REDIRECT`: `RPC_HTTP_REDIRECTOR_STAGE` = 1;
public const val `RPCHTTP_RS_SESSION`: `RPC_HTTP_REDIRECTOR_STAGE` = 3;
// UNSUPPORTED Rust 1865:1: generic scalar type unsupported
// pub type RPCLT_PDU_FILTER_FUNC = Option<unsafe extern "system" fn(buffer: *mut core::ffi::c_void, bufferlength: u32, fdatagram: i32)>;

// UNSUPPORTED Rust 1866:1: generic scalar type unsupported
// pub type RPC_ADDRESS_CHANGE_FN = Option<unsafe extern "system" fn(arg: *mut core::ffi::c_void)>;

public typealias `RPC_ADDRESS_CHANGE_TYPE` = Int;
public typealias `RPC_ASYNC_EVENT` = Int;
// UNSUPPORTED Rust 1869:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_IO")]
// #[derive(Clone, Copy)]
// pub union RPC_ASYNC_NOTIFICATION_INFO {
//     pub APC: RPC_ASYNC_NOTIFICATION_INFO_0,
//     pub IOC: RPC_ASYNC_NOTIFICATION_INFO_1,
//     pub IntPtr: RPC_ASYNC_NOTIFICATION_INFO_2,
//     pub hEvent: super::super::Foundation::HANDLE,
//     pub NotificationRoutine: PFN_RPCNOTIFICATION_ROUTINE,
// }

// UNSUPPORTED Rust 1879:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// impl Default for RPC_ASYNC_NOTIFICATION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1885:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_IO")]
// #[derive(Clone, Copy)]
// pub struct RPC_ASYNC_NOTIFICATION_INFO_0 {
//     pub NotificationRoutine: PFN_RPCNOTIFICATION_ROUTINE,
//     pub hThread: super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 1892:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// impl Default for RPC_ASYNC_NOTIFICATION_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1898:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_IO")]
// #[derive(Clone, Copy)]
// pub struct RPC_ASYNC_NOTIFICATION_INFO_1 {
//     pub hIOPort: super::super::Foundation::HANDLE,
//     pub dwNumberOfBytesTransferred: u32,
//     pub dwCompletionKey: usize,
//     pub lpOverlapped: *mut super::IO::OVERLAPPED,
// }

// UNSUPPORTED Rust 1907:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// impl Default for RPC_ASYNC_NOTIFICATION_INFO_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1913:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_IO")]
// #[derive(Clone, Copy)]
// pub struct RPC_ASYNC_NOTIFICATION_INFO_2 {
//     pub hWnd: super::super::Foundation::HWND,
//     pub Msg: u32,
// }

// UNSUPPORTED Rust 1920:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// impl Default for RPC_ASYNC_NOTIFICATION_INFO_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1926:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_IO")]
// #[derive(Clone, Copy)]
// pub struct RPC_ASYNC_STATE {
//     pub Size: u32,
//     pub Signature: u32,
//     pub Lock: i32,
//     pub Flags: u32,
//     pub StubInfo: *mut core::ffi::c_void,
//     pub UserInfo: *mut core::ffi::c_void,
//     pub RuntimeInfo: *mut core::ffi::c_void,
//     pub Event: RPC_ASYNC_EVENT,
//     pub NotificationType: RPC_NOTIFICATION_TYPES,
//     pub u: RPC_ASYNC_NOTIFICATION_INFO,
//     pub Reserved: [isize; 4],
// }

// UNSUPPORTED Rust 1942:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// impl Default for RPC_ASYNC_STATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1948:1: generic scalar type unsupported
// pub type RPC_AUTH_KEY_RETRIEVAL_FN = Option<unsafe extern "system" fn(arg: *const core::ffi::c_void, serverprincname: windows_sys::core::PCWSTR, keyver: u32, key: *mut *mut core::ffi::c_void, status: *mut RPC_STATUS)>;

public const val `RPC_BHO_DONTLINGER`: `RPC_BINDING_HANDLE_OPTIONS_FLAGS` = 2u;
public const val `RPC_BHO_EXCLUSIVE_AND_GUARANTEED`: UInt = 4u;
public const val `RPC_BHO_NONCAUSAL`: `RPC_BINDING_HANDLE_OPTIONS_FLAGS` = 1u;
public const val `RPC_BHT_OBJECT_UUID_VALID`: UInt = 1u;
public typealias `RPC_BINDING_HANDLE_OPTIONS_FLAGS` = UInt;
// UNSUPPORTED Rust 1954:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RPC_BINDING_HANDLE_OPTIONS_V1 {
//     pub Version: u32,
//     pub Flags: RPC_BINDING_HANDLE_OPTIONS_FLAGS,
//     pub ComTimeout: u32,
//     pub CallTimeout: u32,
// }

// UNSUPPORTED Rust 1962:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct RPC_BINDING_HANDLE_SECURITY_V1_A {
//     pub Version: u32,
//     pub ServerPrincName: *mut u8,
//     pub AuthnLevel: u32,
//     pub AuthnSvc: u32,
//     pub AuthIdentity: *mut SEC_WINNT_AUTH_IDENTITY_A,
//     pub SecurityQos: *mut RPC_SECURITY_QOS,
// }

// UNSUPPORTED Rust 1973:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for RPC_BINDING_HANDLE_SECURITY_V1_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1979:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct RPC_BINDING_HANDLE_SECURITY_V1_W {
//     pub Version: u32,
//     pub ServerPrincName: *mut u16,
//     pub AuthnLevel: u32,
//     pub AuthnSvc: u32,
//     pub AuthIdentity: *mut SEC_WINNT_AUTH_IDENTITY_W,
//     pub SecurityQos: *mut RPC_SECURITY_QOS,
// }

// UNSUPPORTED Rust 1990:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for RPC_BINDING_HANDLE_SECURITY_V1_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1996:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RPC_BINDING_HANDLE_TEMPLATE_V1_A {
//     pub Version: u32,
//     pub Flags: u32,
//     pub ProtocolSequence: u32,
//     pub NetworkAddress: *mut u8,
//     pub StringEndpoint: *mut u8,
//     pub u1: RPC_BINDING_HANDLE_TEMPLATE_V1_A_0,
//     pub ObjectUuid: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 2007:1: declaration Impl has no candidate rule
// impl Default for RPC_BINDING_HANDLE_TEMPLATE_V1_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2012:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union RPC_BINDING_HANDLE_TEMPLATE_V1_A_0 {
//     pub Reserved: *mut u8,
// }

// UNSUPPORTED Rust 2017:1: declaration Impl has no candidate rule
// impl Default for RPC_BINDING_HANDLE_TEMPLATE_V1_A_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2022:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RPC_BINDING_HANDLE_TEMPLATE_V1_W {
//     pub Version: u32,
//     pub Flags: u32,
//     pub ProtocolSequence: u32,
//     pub NetworkAddress: *mut u16,
//     pub StringEndpoint: *mut u16,
//     pub u1: RPC_BINDING_HANDLE_TEMPLATE_V1_W_0,
//     pub ObjectUuid: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 2033:1: declaration Impl has no candidate rule
// impl Default for RPC_BINDING_HANDLE_TEMPLATE_V1_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2038:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union RPC_BINDING_HANDLE_TEMPLATE_V1_W_0 {
//     pub Reserved: *mut u16,
// }

// UNSUPPORTED Rust 2043:1: declaration Impl has no candidate rule
// impl Default for RPC_BINDING_HANDLE_TEMPLATE_V1_W_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2048:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RPC_BINDING_VECTOR {
//     pub Count: u32,
//     pub BindingH: [*mut core::ffi::c_void; 1],
// }

// UNSUPPORTED Rust 2054:1: declaration Impl has no candidate rule
// impl Default for RPC_BINDING_VECTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2059:1: generic scalar type unsupported
// pub type RPC_BLOCKING_FN = Option<unsafe extern "system" fn(hwnd: *mut core::ffi::c_void, context: *mut core::ffi::c_void, hsyncevent: *mut core::ffi::c_void) -> RPC_STATUS>;

public const val `RPC_BUFFER_ASYNC`: UInt = 32768u;
public const val `RPC_BUFFER_COMPLETE`: UInt = 4096u;
public const val `RPC_BUFFER_EXTRA`: UInt = 16384u;
public const val `RPC_BUFFER_NONOTIFY`: UInt = 65536u;
public const val `RPC_BUFFER_PARTIAL`: UInt = 8192u;
// UNSUPPORTED Rust 2065:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RPC_CALL_ATTRIBUTES_V1_A {
//     pub Version: u32,
//     pub Flags: u32,
//     pub ServerPrincipalNameBufferLength: u32,
//     pub ServerPrincipalName: *mut u8,
//     pub ClientPrincipalNameBufferLength: u32,
//     pub ClientPrincipalName: *mut u8,
//     pub AuthenticationLevel: u32,
//     pub AuthenticationService: u32,
//     pub NullSession: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 2078:1: declaration Impl has no candidate rule
// impl Default for RPC_CALL_ATTRIBUTES_V1_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2083:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RPC_CALL_ATTRIBUTES_V1_W {
//     pub Version: u32,
//     pub Flags: u32,
//     pub ServerPrincipalNameBufferLength: u32,
//     pub ServerPrincipalName: *mut u16,
//     pub ClientPrincipalNameBufferLength: u32,
//     pub ClientPrincipalName: *mut u16,
//     pub AuthenticationLevel: u32,
//     pub AuthenticationService: u32,
//     pub NullSession: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 2096:1: declaration Impl has no candidate rule
// impl Default for RPC_CALL_ATTRIBUTES_V1_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2101:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RPC_CALL_ATTRIBUTES_V2_A {
//     pub Version: u32,
//     pub Flags: u32,
//     pub ServerPrincipalNameBufferLength: u32,
//     pub ServerPrincipalName: *mut u8,
//     pub ClientPrincipalNameBufferLength: u32,
//     pub ClientPrincipalName: *mut u8,
//     pub AuthenticationLevel: u32,
//     pub AuthenticationService: u32,
//     pub NullSession: windows_sys::core::BOOL,
//     pub KernelModeCaller: windows_sys::core::BOOL,
//     pub ProtocolSequence: u32,
//     pub IsClientLocal: u32,
//     pub ClientPID: super::super::Foundation::HANDLE,
//     pub CallStatus: u32,
//     pub CallType: RpcCallType,
//     pub CallLocalAddress: *mut RPC_CALL_LOCAL_ADDRESS_V1,
//     pub OpNum: u16,
//     pub InterfaceUuid: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 2123:1: declaration Impl has no candidate rule
// impl Default for RPC_CALL_ATTRIBUTES_V2_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2128:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RPC_CALL_ATTRIBUTES_V2_W {
//     pub Version: u32,
//     pub Flags: u32,
//     pub ServerPrincipalNameBufferLength: u32,
//     pub ServerPrincipalName: *mut u16,
//     pub ClientPrincipalNameBufferLength: u32,
//     pub ClientPrincipalName: *mut u16,
//     pub AuthenticationLevel: u32,
//     pub AuthenticationService: u32,
//     pub NullSession: windows_sys::core::BOOL,
//     pub KernelModeCaller: windows_sys::core::BOOL,
//     pub ProtocolSequence: u32,
//     pub IsClientLocal: RpcCallClientLocality,
//     pub ClientPID: super::super::Foundation::HANDLE,
//     pub CallStatus: u32,
//     pub CallType: RpcCallType,
//     pub CallLocalAddress: *mut RPC_CALL_LOCAL_ADDRESS_V1,
//     pub OpNum: u16,
//     pub InterfaceUuid: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 2150:1: declaration Impl has no candidate rule
// impl Default for RPC_CALL_ATTRIBUTES_V2_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2155:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RPC_CALL_ATTRIBUTES_V3_A {
//     pub Version: u32,
//     pub Flags: u32,
//     pub ServerPrincipalNameBufferLength: u32,
//     pub ServerPrincipalName: *mut u8,
//     pub ClientPrincipalNameBufferLength: u32,
//     pub ClientPrincipalName: *mut u8,
//     pub AuthenticationLevel: u32,
//     pub AuthenticationService: u32,
//     pub NullSession: windows_sys::core::BOOL,
//     pub KernelModeCaller: windows_sys::core::BOOL,
//     pub ProtocolSequence: u32,
//     pub IsClientLocal: u32,
//     pub ClientPID: super::super::Foundation::HANDLE,
//     pub CallStatus: u32,
//     pub CallType: RpcCallType,
//     pub CallLocalAddress: *mut RPC_CALL_LOCAL_ADDRESS_V1,
//     pub OpNum: u16,
//     pub InterfaceUuid: windows_sys::core::GUID,
//     pub ClientIdentifierBufferLength: u32,
//     pub ClientIdentifier: *mut u8,
// }

// UNSUPPORTED Rust 2179:1: declaration Impl has no candidate rule
// impl Default for RPC_CALL_ATTRIBUTES_V3_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2184:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RPC_CALL_ATTRIBUTES_V3_W {
//     pub Version: u32,
//     pub Flags: u32,
//     pub ServerPrincipalNameBufferLength: u32,
//     pub ServerPrincipalName: *mut u16,
//     pub ClientPrincipalNameBufferLength: u32,
//     pub ClientPrincipalName: *mut u16,
//     pub AuthenticationLevel: u32,
//     pub AuthenticationService: u32,
//     pub NullSession: windows_sys::core::BOOL,
//     pub KernelModeCaller: windows_sys::core::BOOL,
//     pub ProtocolSequence: u32,
//     pub IsClientLocal: RpcCallClientLocality,
//     pub ClientPID: super::super::Foundation::HANDLE,
//     pub CallStatus: u32,
//     pub CallType: RpcCallType,
//     pub CallLocalAddress: *mut RPC_CALL_LOCAL_ADDRESS_V1,
//     pub OpNum: u16,
//     pub InterfaceUuid: windows_sys::core::GUID,
//     pub ClientIdentifierBufferLength: u32,
//     pub ClientIdentifier: *mut u8,
// }

// UNSUPPORTED Rust 2208:1: declaration Impl has no candidate rule
// impl Default for RPC_CALL_ATTRIBUTES_V3_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RPC_CALL_ATTRIBUTES_VERSION`: UInt = 2u;
// UNSUPPORTED Rust 2214:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RPC_CALL_LOCAL_ADDRESS_V1 {
//     pub Version: u32,
//     pub Buffer: *mut core::ffi::c_void,
//     pub BufferSize: u32,
//     pub AddressFormat: RpcLocalAddressFormat,
// }

// UNSUPPORTED Rust 2222:1: declaration Impl has no candidate rule
// impl Default for RPC_CALL_LOCAL_ADDRESS_V1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RPC_CALL_STATUS_CANCELLED`: UInt = 1u;
public const val `RPC_CALL_STATUS_DISCONNECTED`: UInt = 2u;
// UNSUPPORTED Rust 2229:1: generic scalar type unsupported
// pub type RPC_CLIENT_ALLOC = Option<unsafe extern "system" fn(size: usize) -> *mut core::ffi::c_void>;

// UNSUPPORTED Rust 2230:1: generic scalar type unsupported
// pub type RPC_CLIENT_FREE = Option<unsafe extern "system" fn(ptr: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 2231:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RPC_CLIENT_INFORMATION1 {
//     pub UserName: *mut u8,
//     pub ComputerName: *mut u8,
//     pub Privilege: u16,
//     pub AuthFlags: u32,
// }

// UNSUPPORTED Rust 2239:1: declaration Impl has no candidate rule
// impl Default for RPC_CLIENT_INFORMATION1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2244:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RPC_CLIENT_INTERFACE {
//     pub Length: u32,
//     pub InterfaceId: RPC_SYNTAX_IDENTIFIER,
//     pub TransferSyntax: RPC_SYNTAX_IDENTIFIER,
//     pub DispatchTable: *mut RPC_DISPATCH_TABLE,
//     pub RpcProtseqEndpointCount: u32,
//     pub RpcProtseqEndpoint: *mut RPC_PROTSEQ_ENDPOINT,
//     pub Reserved: usize,
//     pub InterpreterInfo: *const core::ffi::c_void,
//     pub Flags: u32,
// }

// UNSUPPORTED Rust 2257:1: declaration Impl has no candidate rule
// impl Default for RPC_CLIENT_INTERFACE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RPC_CONTEXT_HANDLE_DEFAULT_FLAGS`: UInt = 0u;
public const val `RPC_CONTEXT_HANDLE_DONT_SERIALIZE`: UInt = 536870912u;
public const val `RPC_CONTEXT_HANDLE_FLAGS`: UInt = 805306368u;
public const val `RPC_CONTEXT_HANDLE_SERIALIZE`: UInt = 268435456u;
public const val `RPC_C_AUTHN_CLOUD_AP`: UInt = 36u;
public const val `RPC_C_AUTHN_DCE_PRIVATE`: UInt = 1u;
public const val `RPC_C_AUTHN_DCE_PUBLIC`: UInt = 2u;
public const val `RPC_C_AUTHN_DEC_PUBLIC`: UInt = 4u;
public const val `RPC_C_AUTHN_DEFAULT`: Int = -1;
public const val `RPC_C_AUTHN_DIGEST`: UInt = 21u;
public const val `RPC_C_AUTHN_DPA`: UInt = 17u;
public const val `RPC_C_AUTHN_GSS_KERBEROS`: UInt = 16u;
public const val `RPC_C_AUTHN_GSS_NEGOTIATE`: UInt = 9u;
public const val `RPC_C_AUTHN_GSS_SCHANNEL`: UInt = 14u;
public const val `RPC_C_AUTHN_INFO_NONE`: `RPC_C_AUTHN_INFO_TYPE` = 0u;
public typealias `RPC_C_AUTHN_INFO_TYPE` = UInt;
public const val `RPC_C_AUTHN_INFO_TYPE_HTTP`: `RPC_C_AUTHN_INFO_TYPE` = 1u;
public const val `RPC_C_AUTHN_KERNEL`: UInt = 20u;
public const val `RPC_C_AUTHN_LIVEXP_SSP`: UInt = 35u;
public const val `RPC_C_AUTHN_LIVE_SSP`: UInt = 32u;
public const val `RPC_C_AUTHN_MQ`: UInt = 100u;
public const val `RPC_C_AUTHN_MSN`: UInt = 18u;
public const val `RPC_C_AUTHN_MSONLINE`: UInt = 82u;
public const val `RPC_C_AUTHN_NEGO_EXTENDER`: UInt = 30u;
public const val `RPC_C_AUTHN_NONE`: UInt = 0u;
public const val `RPC_C_AUTHN_PKU2U`: UInt = 31u;
public const val `RPC_C_AUTHN_WINNT`: UInt = 10u;
public const val `RPC_C_AUTHZ_DCE`: UInt = 2u;
public const val `RPC_C_AUTHZ_DEFAULT`: UInt = 4294967295u;
public const val `RPC_C_AUTHZ_NAME`: UInt = 1u;
public const val `RPC_C_AUTHZ_NONE`: UInt = 0u;
public const val `RPC_C_BINDING_DEFAULT_TIMEOUT`: UInt = 5u;
public const val `RPC_C_BINDING_INFINITE_TIMEOUT`: UInt = 10u;
public const val `RPC_C_BINDING_MAX_TIMEOUT`: UInt = 9u;
public const val `RPC_C_BINDING_MIN_TIMEOUT`: UInt = 0u;
public const val `RPC_C_BIND_TO_ALL_NICS`: UInt = 1u;
public const val `RPC_C_CANCEL_INFINITE_TIMEOUT`: Int = -1;
public const val `RPC_C_DONT_FAIL`: UInt = 4u;
public const val `RPC_C_EP_ALL_ELTS`: UInt = 0u;
public const val `RPC_C_EP_MATCH_BY_BOTH`: UInt = 3u;
public const val `RPC_C_EP_MATCH_BY_IF`: UInt = 1u;
public const val `RPC_C_EP_MATCH_BY_OBJ`: UInt = 2u;
public const val `RPC_C_FULL_CERT_CHAIN`: UInt = 1u;
public const val `RPC_C_HTTP_AUTHN_SCHEME_BASIC`: UInt = 1u;
public const val `RPC_C_HTTP_AUTHN_SCHEME_CERT`: UInt = 65536u;
public const val `RPC_C_HTTP_AUTHN_SCHEME_DIGEST`: UInt = 8u;
public const val `RPC_C_HTTP_AUTHN_SCHEME_NEGOTIATE`: UInt = 16u;
public const val `RPC_C_HTTP_AUTHN_SCHEME_NTLM`: UInt = 2u;
public const val `RPC_C_HTTP_AUTHN_SCHEME_PASSPORT`: UInt = 4u;
public typealias `RPC_C_HTTP_AUTHN_TARGET` = UInt;
public const val `RPC_C_HTTP_AUTHN_TARGET_PROXY`: `RPC_C_HTTP_AUTHN_TARGET` = 2u;
public const val `RPC_C_HTTP_AUTHN_TARGET_SERVER`: `RPC_C_HTTP_AUTHN_TARGET` = 1u;
public typealias `RPC_C_HTTP_FLAGS` = UInt;
public const val `RPC_C_HTTP_FLAG_ENABLE_CERT_REVOCATION_CHECK`: `RPC_C_HTTP_FLAGS` = 16u;
public const val `RPC_C_HTTP_FLAG_IGNORE_CERT_CN_INVALID`: `RPC_C_HTTP_FLAGS` = 8u;
public const val `RPC_C_HTTP_FLAG_USE_FIRST_AUTH_SCHEME`: `RPC_C_HTTP_FLAGS` = 2u;
public const val `RPC_C_HTTP_FLAG_USE_SSL`: `RPC_C_HTTP_FLAGS` = 1u;
public const val `RPC_C_LISTEN_MAX_CALLS_DEFAULT`: UInt = 1234u;
public const val `RPC_C_MGMT_INQ_IF_IDS`: UInt = 0u;
public const val `RPC_C_MGMT_INQ_PRINC_NAME`: UInt = 1u;
public const val `RPC_C_MGMT_INQ_STATS`: UInt = 2u;
public const val `RPC_C_MGMT_IS_SERVER_LISTEN`: UInt = 3u;
public const val `RPC_C_MGMT_STOP_SERVER_LISTEN`: UInt = 4u;
public const val `RPC_C_MQ_AUTHN_LEVEL_NONE`: UInt = 0u;
public const val `RPC_C_MQ_AUTHN_LEVEL_PKT_INTEGRITY`: UInt = 8u;
public const val `RPC_C_MQ_AUTHN_LEVEL_PKT_PRIVACY`: UInt = 16u;
public const val `RPC_C_MQ_CLEAR_ON_OPEN`: UInt = 2u;
public const val `RPC_C_MQ_EXPRESS`: UInt = 0u;
public const val `RPC_C_MQ_JOURNAL_ALWAYS`: UInt = 2u;
public const val `RPC_C_MQ_JOURNAL_DEADLETTER`: UInt = 1u;
public const val `RPC_C_MQ_JOURNAL_NONE`: UInt = 0u;
public const val `RPC_C_MQ_PERMANENT`: UInt = 1u;
public const val `RPC_C_MQ_RECOVERABLE`: UInt = 1u;
public const val `RPC_C_MQ_TEMPORARY`: UInt = 0u;
public const val `RPC_C_MQ_USE_EXISTING_SECURITY`: UInt = 4u;
public const val `RPC_C_NOTIFY_ON_SEND_COMPLETE`: UInt = 1u;
public const val `RPC_C_NS_DEFAULT_EXP_AGE`: Int = -1;
public const val `RPC_C_NS_SYNTAX_DCE`: `GROUP_NAME_SYNTAX` = 3u;
public const val `RPC_C_NS_SYNTAX_DEFAULT`: `GROUP_NAME_SYNTAX` = 0u;
public const val `RPC_C_OPT_ASYNC_BLOCK`: UInt = 15u;
public const val `RPC_C_OPT_BINDING_NONCAUSAL`: UInt = 9u;
public const val `RPC_C_OPT_CALL_TIMEOUT`: UInt = 12u;
public const val `RPC_C_OPT_COOKIE_AUTH`: UInt = 7u;
// UNSUPPORTED Rust 2345:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RPC_C_OPT_COOKIE_AUTH_DESCRIPTOR {
//     pub BufferSize: u32,
//     pub Buffer: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 2351:1: declaration Impl has no candidate rule
// impl Default for RPC_C_OPT_COOKIE_AUTH_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RPC_C_OPT_DONT_LINGER`: UInt = 13u;
public const val `RPC_C_OPT_MAX_OPTIONS`: UInt = 12u;
public const val `RPC_C_OPT_MQ_ACKNOWLEDGE`: UInt = 4u;
public const val `RPC_C_OPT_MQ_AUTHN_LEVEL`: UInt = 6u;
public const val `RPC_C_OPT_MQ_AUTHN_SERVICE`: UInt = 5u;
public const val `RPC_C_OPT_MQ_DELIVERY`: UInt = 1u;
public const val `RPC_C_OPT_MQ_JOURNAL`: UInt = 3u;
public const val `RPC_C_OPT_MQ_PRIORITY`: UInt = 2u;
public const val `RPC_C_OPT_MQ_TIME_TO_BE_RECEIVED`: UInt = 8u;
public const val `RPC_C_OPT_MQ_TIME_TO_REACH_QUEUE`: UInt = 7u;
public const val `RPC_C_OPT_OPTIMIZE_TIME`: UInt = 16u;
public const val `RPC_C_OPT_PRIVATE_BREAK_ON_SUSPEND`: UInt = 3u;
public const val `RPC_C_OPT_PRIVATE_DO_NOT_DISTURB`: UInt = 2u;
public const val `RPC_C_OPT_PRIVATE_SUPPRESS_WAKE`: UInt = 1u;
public const val `RPC_C_OPT_RESOURCE_TYPE_UUID`: UInt = 8u;
public const val `RPC_C_OPT_SECURITY_CALLBACK`: UInt = 10u;
public const val `RPC_C_OPT_SESSION_ID`: UInt = 6u;
public const val `RPC_C_OPT_TRANS_SEND_BUFFER_SIZE`: UInt = 5u;
public const val `RPC_C_OPT_TRUST_PEER`: UInt = 14u;
public const val `RPC_C_OPT_UNIQUE_BINDING`: UInt = 11u;
public const val `RPC_C_PARM_BUFFER_LENGTH`: UInt = 2u;
public const val `RPC_C_PARM_MAX_PACKET_LENGTH`: UInt = 1u;
public const val `RPC_C_PROFILE_ALL_ELT`: UInt = 1u;
public const val `RPC_C_PROFILE_ALL_ELTS`: UInt = 1u;
public const val `RPC_C_PROFILE_DEFAULT_ELT`: UInt = 0u;
public const val `RPC_C_PROFILE_MATCH_BY_BOTH`: UInt = 4u;
public const val `RPC_C_PROFILE_MATCH_BY_IF`: UInt = 2u;
public const val `RPC_C_PROFILE_MATCH_BY_MBR`: UInt = 3u;
public const val `RPC_C_PROTSEQ_MAX_REQS_DEFAULT`: UInt = 10u;
public typealias `RPC_C_QOS_CAPABILITIES` = UInt;
public const val `RPC_C_QOS_CAPABILITIES_ANY_AUTHORITY`: `RPC_C_QOS_CAPABILITIES` = 4u;
public const val `RPC_C_QOS_CAPABILITIES_DEFAULT`: `RPC_C_QOS_CAPABILITIES` = 0u;
public const val `RPC_C_QOS_CAPABILITIES_IGNORE_DELEGATE_FAILURE`: `RPC_C_QOS_CAPABILITIES` = 8u;
public const val `RPC_C_QOS_CAPABILITIES_LOCAL_MA_HINT`: `RPC_C_QOS_CAPABILITIES` = 16u;
public const val `RPC_C_QOS_CAPABILITIES_MAKE_FULLSIC`: `RPC_C_QOS_CAPABILITIES` = 2u;
public const val `RPC_C_QOS_CAPABILITIES_MUTUAL_AUTH`: `RPC_C_QOS_CAPABILITIES` = 1u;
public const val `RPC_C_QOS_CAPABILITIES_SCHANNEL_FULL_AUTH_IDENTITY`: `RPC_C_QOS_CAPABILITIES` = 32u;
public typealias `RPC_C_QOS_IDENTITY` = UInt;
public const val `RPC_C_QOS_IDENTITY_DYNAMIC`: `RPC_C_QOS_IDENTITY` = 1u;
public const val `RPC_C_QOS_IDENTITY_STATIC`: `RPC_C_QOS_IDENTITY` = 0u;
public const val `RPC_C_RPCHTTP_USE_LOAD_BALANCE`: UInt = 8u;
public const val `RPC_C_SECURITY_QOS_VERSION`: Int = 1;
public const val `RPC_C_SECURITY_QOS_VERSION_1`: Int = 1;
public const val `RPC_C_SECURITY_QOS_VERSION_2`: Int = 2;
public const val `RPC_C_SECURITY_QOS_VERSION_3`: Int = 3;
public const val `RPC_C_SECURITY_QOS_VERSION_4`: Int = 4;
public const val `RPC_C_SECURITY_QOS_VERSION_5`: Int = 5;
public const val `RPC_C_STATS_CALLS_IN`: UInt = 0u;
public const val `RPC_C_STATS_CALLS_OUT`: UInt = 1u;
public const val `RPC_C_STATS_PKTS_IN`: UInt = 2u;
public const val `RPC_C_STATS_PKTS_OUT`: UInt = 3u;
public const val `RPC_C_TRY_ENFORCE_MAX_CALLS`: UInt = 16u;
public const val `RPC_C_USE_INTERNET_PORT`: UInt = 1u;
public const val `RPC_C_USE_INTRANET_PORT`: UInt = 2u;
public const val `RPC_C_VERS_ALL`: UInt = 1u;
public const val `RPC_C_VERS_COMPATIBLE`: UInt = 2u;
public const val `RPC_C_VERS_EXACT`: UInt = 3u;
public const val `RPC_C_VERS_MAJOR_ONLY`: UInt = 4u;
public const val `RPC_C_VERS_UPTO`: UInt = 5u;
// UNSUPPORTED Rust 2415:1: generic scalar type unsupported
// pub type RPC_DISPATCH_FUNCTION = Option<unsafe extern "system" fn(message: *mut RPC_MESSAGE)>;

// UNSUPPORTED Rust 2416:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RPC_DISPATCH_TABLE {
//     pub DispatchTableCount: u32,
//     pub DispatchTable: RPC_DISPATCH_FUNCTION,
//     pub Reserved: isize,
// }

public const val `RPC_EEINFO_VERSION`: UInt = 1u;
// UNSUPPORTED Rust 2424:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RPC_EE_INFO_PARAM {
//     pub ParameterType: ExtendedErrorParamTypes,
//     pub u: RPC_EE_INFO_PARAM_0,
// }

// UNSUPPORTED Rust 2430:1: declaration Impl has no candidate rule
// impl Default for RPC_EE_INFO_PARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2435:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union RPC_EE_INFO_PARAM_0 {
//     pub AnsiString: windows_sys::core::PSTR,
//     pub UnicodeString: windows_sys::core::PWSTR,
//     pub LVal: i32,
//     pub SVal: i16,
//     pub PVal: u64,
//     pub BVal: BinaryParam,
// }

// UNSUPPORTED Rust 2445:1: declaration Impl has no candidate rule
// impl Default for RPC_EE_INFO_PARAM_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2450:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RPC_ENDPOINT_TEMPLATEA {
//     pub Version: u32,
//     pub ProtSeq: windows_sys::core::PSTR,
//     pub Endpoint: windows_sys::core::PSTR,
//     pub SecurityDescriptor: *mut core::ffi::c_void,
//     pub Backlog: u32,
// }

// UNSUPPORTED Rust 2459:1: declaration Impl has no candidate rule
// impl Default for RPC_ENDPOINT_TEMPLATEA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2464:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RPC_ENDPOINT_TEMPLATEW {
//     pub Version: u32,
//     pub ProtSeq: windows_sys::core::PWSTR,
//     pub Endpoint: windows_sys::core::PWSTR,
//     pub SecurityDescriptor: *mut core::ffi::c_void,
//     pub Backlog: u32,
// }

// UNSUPPORTED Rust 2473:1: declaration Impl has no candidate rule
// impl Default for RPC_ENDPOINT_TEMPLATEW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2478:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RPC_ERROR_ENUM_HANDLE {
//     pub Signature: u32,
//     pub CurrentPos: *mut core::ffi::c_void,
//     pub Head: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 2485:1: declaration Impl has no candidate rule
// impl Default for RPC_ERROR_ENUM_HANDLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2490:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RPC_EXTENDED_ERROR_INFO {
//     pub Version: u32,
//     pub ComputerName: windows_sys::core::PWSTR,
//     pub ProcessID: u32,
//     pub u: RPC_EXTENDED_ERROR_INFO_0,
//     pub GeneratingComponent: u32,
//     pub Status: u32,
//     pub DetectionLocation: u16,
//     pub Flags: u16,
//     pub NumberOfParameters: i32,
//     pub Parameters: [RPC_EE_INFO_PARAM; 4],
// }

// UNSUPPORTED Rust 2504:1: declaration Impl has no candidate rule
// impl Default for RPC_EXTENDED_ERROR_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2509:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union RPC_EXTENDED_ERROR_INFO_0 {
//     pub SystemTime: super::super::Foundation::SYSTEMTIME,
//     pub FileTime: super::super::Foundation::FILETIME,
// }

// UNSUPPORTED Rust 2515:1: declaration Impl has no candidate rule
// impl Default for RPC_EXTENDED_ERROR_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RPC_FLAGS_VALID_BIT`: UInt = 32768u;
// UNSUPPORTED Rust 2521:1: generic scalar type unsupported
// pub type RPC_FORWARD_FUNCTION = Option<unsafe extern "system" fn(interfaceid: *mut windows_sys::core::GUID, interfaceversion: *mut RPC_VERSION, objectid: *mut windows_sys::core::GUID, rpcpro: *mut u8, ppdestendpoint: *mut *mut core::ffi::c_void) -> RPC_STATUS>;

public const val `RPC_FW_IF_FLAG_DCOM`: UInt = 1u;
// UNSUPPORTED Rust 2523:1: generic scalar type unsupported
// pub type RPC_HTTP_PROXY_FREE_STRING = Option<unsafe extern "system" fn(string: windows_sys::core::PCWSTR)>;

public typealias `RPC_HTTP_REDIRECTOR_STAGE` = Int;
// UNSUPPORTED Rust 2525:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RPC_HTTP_TRANSPORT_CREDENTIALS_A {
//     pub TransportCredentials: *mut SEC_WINNT_AUTH_IDENTITY_A,
//     pub Flags: RPC_C_HTTP_FLAGS,
//     pub AuthenticationTarget: RPC_C_HTTP_AUTHN_TARGET,
//     pub NumberOfAuthnSchemes: u32,
//     pub AuthnSchemes: *mut u32,
//     pub ServerCertificateSubject: *mut u8,
// }

// UNSUPPORTED Rust 2535:1: declaration Impl has no candidate rule
// impl Default for RPC_HTTP_TRANSPORT_CREDENTIALS_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2540:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A {
//     pub TransportCredentials: *mut SEC_WINNT_AUTH_IDENTITY_A,
//     pub Flags: RPC_C_HTTP_FLAGS,
//     pub AuthenticationTarget: RPC_C_HTTP_AUTHN_TARGET,
//     pub NumberOfAuthnSchemes: u32,
//     pub AuthnSchemes: *mut u32,
//     pub ServerCertificateSubject: *mut u8,
//     pub ProxyCredentials: *mut SEC_WINNT_AUTH_IDENTITY_A,
//     pub NumberOfProxyAuthnSchemes: u32,
//     pub ProxyAuthnSchemes: *mut u32,
// }

// UNSUPPORTED Rust 2553:1: declaration Impl has no candidate rule
// impl Default for RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2558:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RPC_HTTP_TRANSPORT_CREDENTIALS_V2_W {
//     pub TransportCredentials: *mut SEC_WINNT_AUTH_IDENTITY_W,
//     pub Flags: RPC_C_HTTP_FLAGS,
//     pub AuthenticationTarget: RPC_C_HTTP_AUTHN_TARGET,
//     pub NumberOfAuthnSchemes: u32,
//     pub AuthnSchemes: *mut u32,
//     pub ServerCertificateSubject: *mut u16,
//     pub ProxyCredentials: *mut SEC_WINNT_AUTH_IDENTITY_W,
//     pub NumberOfProxyAuthnSchemes: u32,
//     pub ProxyAuthnSchemes: *mut u32,
// }

// UNSUPPORTED Rust 2571:1: declaration Impl has no candidate rule
// impl Default for RPC_HTTP_TRANSPORT_CREDENTIALS_V2_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2576:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RPC_HTTP_TRANSPORT_CREDENTIALS_V3_A {
//     pub TransportCredentials: *mut core::ffi::c_void,
//     pub Flags: RPC_C_HTTP_FLAGS,
//     pub AuthenticationTarget: RPC_C_HTTP_AUTHN_TARGET,
//     pub NumberOfAuthnSchemes: u32,
//     pub AuthnSchemes: *mut u32,
//     pub ServerCertificateSubject: *mut u8,
//     pub ProxyCredentials: *mut core::ffi::c_void,
//     pub NumberOfProxyAuthnSchemes: u32,
//     pub ProxyAuthnSchemes: *mut u32,
// }

// UNSUPPORTED Rust 2589:1: declaration Impl has no candidate rule
// impl Default for RPC_HTTP_TRANSPORT_CREDENTIALS_V3_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2594:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W {
//     pub TransportCredentials: *mut core::ffi::c_void,
//     pub Flags: RPC_C_HTTP_FLAGS,
//     pub AuthenticationTarget: RPC_C_HTTP_AUTHN_TARGET,
//     pub NumberOfAuthnSchemes: u32,
//     pub AuthnSchemes: *mut u32,
//     pub ServerCertificateSubject: *mut u16,
//     pub ProxyCredentials: *mut core::ffi::c_void,
//     pub NumberOfProxyAuthnSchemes: u32,
//     pub ProxyAuthnSchemes: *mut u32,
// }

// UNSUPPORTED Rust 2607:1: declaration Impl has no candidate rule
// impl Default for RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2612:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RPC_HTTP_TRANSPORT_CREDENTIALS_W {
//     pub TransportCredentials: *mut SEC_WINNT_AUTH_IDENTITY_W,
//     pub Flags: RPC_C_HTTP_FLAGS,
//     pub AuthenticationTarget: RPC_C_HTTP_AUTHN_TARGET,
//     pub NumberOfAuthnSchemes: u32,
//     pub AuthnSchemes: *mut u32,
//     pub ServerCertificateSubject: *mut u16,
// }

// UNSUPPORTED Rust 2622:1: declaration Impl has no candidate rule
// impl Default for RPC_HTTP_TRANSPORT_CREDENTIALS_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RPC_IF_ALLOW_CALLBACKS_WITH_NO_AUTH`: UInt = 16u;
public const val `RPC_IF_ALLOW_LOCAL_ONLY`: UInt = 32u;
public const val `RPC_IF_ALLOW_SECURE_ONLY`: UInt = 8u;
public const val `RPC_IF_ALLOW_UNKNOWN_AUTHORITY`: UInt = 4u;
public const val `RPC_IF_ASYNC_CALLBACK`: UInt = 256u;
public const val `RPC_IF_AUTOLISTEN`: UInt = 1u;
// UNSUPPORTED Rust 2633:1: generic scalar type unsupported
// pub type RPC_IF_CALLBACK_FN = Option<unsafe extern "system" fn(interfaceuuid: *const core::ffi::c_void, context: *const core::ffi::c_void) -> RPC_STATUS>;

// UNSUPPORTED Rust 2634:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RPC_IF_ID {
//     pub Uuid: windows_sys::core::GUID,
//     pub VersMajor: u16,
//     pub VersMinor: u16,
// }

// UNSUPPORTED Rust 2641:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RPC_IF_ID_VECTOR {
//     pub Count: u32,
//     pub IfId: [*mut RPC_IF_ID; 1],
// }

// UNSUPPORTED Rust 2647:1: declaration Impl has no candidate rule
// impl Default for RPC_IF_ID_VECTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RPC_IF_OLE`: UInt = 2u;
public const val `RPC_IF_SEC_CACHE_PER_PROC`: UInt = 128u;
public const val `RPC_IF_SEC_NO_CACHE`: UInt = 64u;
// UNSUPPORTED Rust 2655:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RPC_IMPORT_CONTEXT_P {
//     pub LookupContext: *mut core::ffi::c_void,
//     pub ProposedHandle: *mut core::ffi::c_void,
//     pub Bindings: *mut RPC_BINDING_VECTOR,
// }

// UNSUPPORTED Rust 2662:1: declaration Impl has no candidate rule
// impl Default for RPC_IMPORT_CONTEXT_P {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2667:1: generic scalar type unsupported
// pub type RPC_INTERFACE_GROUP_IDLE_CALLBACK_FN = Option<unsafe extern "system" fn(ifgroup: *const core::ffi::c_void, idlecallbackcontext: *const core::ffi::c_void, isgroupidle: u32)>;

public const val `RPC_INTERFACE_HAS_PIPES`: UInt = 1u;
// UNSUPPORTED Rust 2669:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RPC_INTERFACE_TEMPLATEA {
//     pub Version: u32,
//     pub IfSpec: *mut core::ffi::c_void,
//     pub MgrTypeUuid: *mut windows_sys::core::GUID,
//     pub MgrEpv: *mut core::ffi::c_void,
//     pub Flags: u32,
//     pub MaxCalls: u32,
//     pub MaxRpcSize: u32,
//     pub IfCallback: RPC_IF_CALLBACK_FN,
//     pub UuidVector: *mut UUID_VECTOR,
//     pub Annotation: windows_sys::core::PSTR,
//     pub SecurityDescriptor: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 2684:1: declaration Impl has no candidate rule
// impl Default for RPC_INTERFACE_TEMPLATEA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2689:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RPC_INTERFACE_TEMPLATEW {
//     pub Version: u32,
//     pub IfSpec: *mut core::ffi::c_void,
//     pub MgrTypeUuid: *mut windows_sys::core::GUID,
//     pub MgrEpv: *mut core::ffi::c_void,
//     pub Flags: u32,
//     pub MaxCalls: u32,
//     pub MaxRpcSize: u32,
//     pub IfCallback: RPC_IF_CALLBACK_FN,
//     pub UuidVector: *mut UUID_VECTOR,
//     pub Annotation: windows_sys::core::PWSTR,
//     pub SecurityDescriptor: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 2704:1: declaration Impl has no candidate rule
// impl Default for RPC_INTERFACE_TEMPLATEW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2709:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RPC_MESSAGE {
//     pub Handle: *mut core::ffi::c_void,
//     pub DataRepresentation: u32,
//     pub Buffer: *mut core::ffi::c_void,
//     pub BufferLength: u32,
//     pub ProcNum: u32,
//     pub TransferSyntax: *mut RPC_SYNTAX_IDENTIFIER,
//     pub RpcInterfaceInformation: *mut core::ffi::c_void,
//     pub ReservedForRuntime: *mut core::ffi::c_void,
//     pub ManagerEpv: *mut core::ffi::c_void,
//     pub ImportContext: *mut core::ffi::c_void,
//     pub RpcFlags: u32,
// }

// UNSUPPORTED Rust 2724:1: declaration Impl has no candidate rule
// impl Default for RPC_MESSAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2729:1: generic scalar type unsupported
// pub type RPC_MGMT_AUTHORIZATION_FN = Option<unsafe extern "system" fn(clientbinding: *const core::ffi::c_void, requestedmgmtoperation: u32, status: *mut RPC_STATUS) -> i32>;

public const val `RPC_NCA_FLAGS_BROADCAST`: UInt = 2u;
public const val `RPC_NCA_FLAGS_DEFAULT`: UInt = 0u;
public const val `RPC_NCA_FLAGS_IDEMPOTENT`: UInt = 1u;
public const val `RPC_NCA_FLAGS_MAYBE`: UInt = 4u;
// UNSUPPORTED Rust 2734:1: generic scalar type unsupported
// pub type RPC_NEW_HTTP_PROXY_CHANNEL = Option<unsafe extern "system" fn(redirectorstage: RPC_HTTP_REDIRECTOR_STAGE, servername: windows_sys::core::PCWSTR, serverport: windows_sys::core::PCWSTR, remoteuser: windows_sys::core::PCWSTR, authtype: windows_sys::core::PCWSTR, resourceuuid: *mut core::ffi::c_void, sessionid: *mut core::ffi::c_void, interface: *const core::ffi::c_void, reserved: *const core::ffi::c_void, flags: u32, newservername: *mut windows_sys::core::PWSTR, newserverport: *mut windows_sys::core::PWSTR) -> RPC_STATUS>;

public typealias `RPC_NOTIFICATIONS` = Int;
public typealias `RPC_NOTIFICATION_TYPES` = Int;
// UNSUPPORTED Rust 2737:1: generic scalar type unsupported
// pub type RPC_OBJECT_INQ_FN = Option<unsafe extern "system" fn(objectuuid: *const windows_sys::core::GUID, typeuuid: *mut windows_sys::core::GUID, status: *mut RPC_STATUS)>;

// UNSUPPORTED Rust 2738:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RPC_POLICY {
//     pub Length: u32,
//     pub EndpointFlags: u32,
//     pub NICFlags: u32,
// }

// UNSUPPORTED Rust 2745:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RPC_PROTSEQ_ENDPOINT {
//     pub RpcProtocolSequence: *mut u8,
//     pub Endpoint: *mut u8,
// }

// UNSUPPORTED Rust 2751:1: declaration Impl has no candidate rule
// impl Default for RPC_PROTSEQ_ENDPOINT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RPC_PROTSEQ_HTTP`: UInt = 4u;
public const val `RPC_PROTSEQ_LRPC`: UInt = 3u;
public const val `RPC_PROTSEQ_NMP`: UInt = 2u;
public const val `RPC_PROTSEQ_TCP`: UInt = 1u;
// UNSUPPORTED Rust 2760:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RPC_PROTSEQ_VECTORA {
//     pub Count: u32,
//     pub Protseq: [*mut u8; 1],
// }

// UNSUPPORTED Rust 2766:1: declaration Impl has no candidate rule
// impl Default for RPC_PROTSEQ_VECTORA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2771:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RPC_PROTSEQ_VECTORW {
//     pub Count: u32,
//     pub Protseq: [*mut u16; 1],
// }

// UNSUPPORTED Rust 2777:1: declaration Impl has no candidate rule
// impl Default for RPC_PROTSEQ_VECTORW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RPC_PROXY_CONNECTION_TYPE_IN_PROXY`: UInt = 0u;
public const val `RPC_PROXY_CONNECTION_TYPE_OUT_PROXY`: UInt = 1u;
public const val `RPC_P_ADDR_FORMAT_TCP_IPV4`: UInt = 1u;
public const val `RPC_P_ADDR_FORMAT_TCP_IPV6`: UInt = 2u;
public const val `RPC_QUERY_CALL_LOCAL_ADDRESS`: UInt = 8u;
public const val `RPC_QUERY_CLIENT_ID`: UInt = 128u;
public const val `RPC_QUERY_CLIENT_PID`: UInt = 16u;
public const val `RPC_QUERY_CLIENT_PRINCIPAL_NAME`: UInt = 4u;
public const val `RPC_QUERY_IS_CLIENT_LOCAL`: UInt = 32u;
public const val `RPC_QUERY_NO_AUTH_REQUIRED`: UInt = 64u;
public const val `RPC_QUERY_SERVER_PRINCIPAL_NAME`: UInt = 2u;
// UNSUPPORTED Rust 2793:1: generic scalar type unsupported
// pub type RPC_SECURITY_CALLBACK_FN = Option<unsafe extern "system" fn(context: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 2794:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy, Default)]
// pub struct RPC_SECURITY_QOS {
//     pub Version: u32,
//     pub Capabilities: RPC_C_QOS_CAPABILITIES,
//     pub IdentityTracking: RPC_C_QOS_IDENTITY,
//     pub ImpersonationType: super::Com::RPC_C_IMP_LEVEL,
// }

// UNSUPPORTED Rust 2803:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct RPC_SECURITY_QOS_V2_A {
//     pub Version: u32,
//     pub Capabilities: RPC_C_QOS_CAPABILITIES,
//     pub IdentityTracking: RPC_C_QOS_IDENTITY,
//     pub ImpersonationType: super::Com::RPC_C_IMP_LEVEL,
//     pub AdditionalSecurityInfoType: RPC_C_AUTHN_INFO_TYPE,
//     pub u: RPC_SECURITY_QOS_V2_A_0,
// }

// UNSUPPORTED Rust 2814:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for RPC_SECURITY_QOS_V2_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2820:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub union RPC_SECURITY_QOS_V2_A_0 {
//     pub HttpCredentials: *mut RPC_HTTP_TRANSPORT_CREDENTIALS_A,
// }

// UNSUPPORTED Rust 2826:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for RPC_SECURITY_QOS_V2_A_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2832:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct RPC_SECURITY_QOS_V2_W {
//     pub Version: u32,
//     pub Capabilities: RPC_C_QOS_CAPABILITIES,
//     pub IdentityTracking: RPC_C_QOS_IDENTITY,
//     pub ImpersonationType: super::Com::RPC_C_IMP_LEVEL,
//     pub AdditionalSecurityInfoType: RPC_C_AUTHN_INFO_TYPE,
//     pub u: RPC_SECURITY_QOS_V2_W_0,
// }

// UNSUPPORTED Rust 2843:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for RPC_SECURITY_QOS_V2_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2849:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub union RPC_SECURITY_QOS_V2_W_0 {
//     pub HttpCredentials: *mut RPC_HTTP_TRANSPORT_CREDENTIALS_W,
// }

// UNSUPPORTED Rust 2855:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for RPC_SECURITY_QOS_V2_W_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2861:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct RPC_SECURITY_QOS_V3_A {
//     pub Version: u32,
//     pub Capabilities: RPC_C_QOS_CAPABILITIES,
//     pub IdentityTracking: RPC_C_QOS_IDENTITY,
//     pub ImpersonationType: super::Com::RPC_C_IMP_LEVEL,
//     pub AdditionalSecurityInfoType: RPC_C_AUTHN_INFO_TYPE,
//     pub u: RPC_SECURITY_QOS_V3_A_0,
//     pub Sid: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 2873:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for RPC_SECURITY_QOS_V3_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2879:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub union RPC_SECURITY_QOS_V3_A_0 {
//     pub HttpCredentials: *mut RPC_HTTP_TRANSPORT_CREDENTIALS_A,
// }

// UNSUPPORTED Rust 2885:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for RPC_SECURITY_QOS_V3_A_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2891:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct RPC_SECURITY_QOS_V3_W {
//     pub Version: u32,
//     pub Capabilities: RPC_C_QOS_CAPABILITIES,
//     pub IdentityTracking: RPC_C_QOS_IDENTITY,
//     pub ImpersonationType: super::Com::RPC_C_IMP_LEVEL,
//     pub AdditionalSecurityInfoType: RPC_C_AUTHN_INFO_TYPE,
//     pub u: RPC_SECURITY_QOS_V3_W_0,
//     pub Sid: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 2903:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for RPC_SECURITY_QOS_V3_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2909:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub union RPC_SECURITY_QOS_V3_W_0 {
//     pub HttpCredentials: *mut RPC_HTTP_TRANSPORT_CREDENTIALS_W,
// }

// UNSUPPORTED Rust 2915:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for RPC_SECURITY_QOS_V3_W_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2921:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct RPC_SECURITY_QOS_V4_A {
//     pub Version: u32,
//     pub Capabilities: RPC_C_QOS_CAPABILITIES,
//     pub IdentityTracking: RPC_C_QOS_IDENTITY,
//     pub ImpersonationType: super::Com::RPC_C_IMP_LEVEL,
//     pub AdditionalSecurityInfoType: RPC_C_AUTHN_INFO_TYPE,
//     pub u: RPC_SECURITY_QOS_V4_A_0,
//     pub Sid: *mut core::ffi::c_void,
//     pub EffectiveOnly: u32,
// }

// UNSUPPORTED Rust 2934:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for RPC_SECURITY_QOS_V4_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2940:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub union RPC_SECURITY_QOS_V4_A_0 {
//     pub HttpCredentials: *mut RPC_HTTP_TRANSPORT_CREDENTIALS_A,
// }

// UNSUPPORTED Rust 2946:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for RPC_SECURITY_QOS_V4_A_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2952:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct RPC_SECURITY_QOS_V4_W {
//     pub Version: u32,
//     pub Capabilities: RPC_C_QOS_CAPABILITIES,
//     pub IdentityTracking: RPC_C_QOS_IDENTITY,
//     pub ImpersonationType: super::Com::RPC_C_IMP_LEVEL,
//     pub AdditionalSecurityInfoType: RPC_C_AUTHN_INFO_TYPE,
//     pub u: RPC_SECURITY_QOS_V4_W_0,
//     pub Sid: *mut core::ffi::c_void,
//     pub EffectiveOnly: u32,
// }

// UNSUPPORTED Rust 2965:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for RPC_SECURITY_QOS_V4_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2971:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub union RPC_SECURITY_QOS_V4_W_0 {
//     pub HttpCredentials: *mut RPC_HTTP_TRANSPORT_CREDENTIALS_W,
// }

// UNSUPPORTED Rust 2977:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for RPC_SECURITY_QOS_V4_W_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2983:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct RPC_SECURITY_QOS_V5_A {
//     pub Version: u32,
//     pub Capabilities: RPC_C_QOS_CAPABILITIES,
//     pub IdentityTracking: RPC_C_QOS_IDENTITY,
//     pub ImpersonationType: super::Com::RPC_C_IMP_LEVEL,
//     pub AdditionalSecurityInfoType: RPC_C_AUTHN_INFO_TYPE,
//     pub u: RPC_SECURITY_QOS_V5_A_0,
//     pub Sid: *mut core::ffi::c_void,
//     pub EffectiveOnly: u32,
//     pub ServerSecurityDescriptor: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 2997:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for RPC_SECURITY_QOS_V5_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3003:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub union RPC_SECURITY_QOS_V5_A_0 {
//     pub HttpCredentials: *mut RPC_HTTP_TRANSPORT_CREDENTIALS_A,
// }

// UNSUPPORTED Rust 3009:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for RPC_SECURITY_QOS_V5_A_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3015:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct RPC_SECURITY_QOS_V5_W {
//     pub Version: u32,
//     pub Capabilities: RPC_C_QOS_CAPABILITIES,
//     pub IdentityTracking: RPC_C_QOS_IDENTITY,
//     pub ImpersonationType: super::Com::RPC_C_IMP_LEVEL,
//     pub AdditionalSecurityInfoType: RPC_C_AUTHN_INFO_TYPE,
//     pub u: RPC_SECURITY_QOS_V5_W_0,
//     pub Sid: *mut core::ffi::c_void,
//     pub EffectiveOnly: u32,
//     pub ServerSecurityDescriptor: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 3029:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for RPC_SECURITY_QOS_V5_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3035:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub union RPC_SECURITY_QOS_V5_W_0 {
//     pub HttpCredentials: *mut RPC_HTTP_TRANSPORT_CREDENTIALS_W,
// }

// UNSUPPORTED Rust 3041:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for RPC_SECURITY_QOS_V5_W_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3047:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RPC_SEC_CONTEXT_KEY_INFO {
//     pub EncryptAlgorithm: u32,
//     pub KeySize: u32,
//     pub SignatureAlgorithm: u32,
// }

// UNSUPPORTED Rust 3054:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RPC_SERVER_INTERFACE {
//     pub Length: u32,
//     pub InterfaceId: RPC_SYNTAX_IDENTIFIER,
//     pub TransferSyntax: RPC_SYNTAX_IDENTIFIER,
//     pub DispatchTable: *mut RPC_DISPATCH_TABLE,
//     pub RpcProtseqEndpointCount: u32,
//     pub RpcProtseqEndpoint: *mut RPC_PROTSEQ_ENDPOINT,
//     pub DefaultManagerEpv: *mut core::ffi::c_void,
//     pub InterpreterInfo: *const core::ffi::c_void,
//     pub Flags: u32,
// }

// UNSUPPORTED Rust 3067:1: declaration Impl has no candidate rule
// impl Default for RPC_SERVER_INTERFACE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3072:1: generic scalar type unsupported
// pub type RPC_SETFILTER_FUNC = Option<unsafe extern "system" fn(pfnfilter: RPCLT_PDU_FILTER_FUNC)>;

// UNSUPPORTED Rust 3073:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RPC_STATS_VECTOR {
//     pub Count: u32,
//     pub Stats: [u32; 1],
// }

// UNSUPPORTED Rust 3079:1: declaration Impl has no candidate rule
// impl Default for RPC_STATS_VECTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `RPC_STATUS` = Int;
// UNSUPPORTED Rust 3085:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RPC_SYNTAX_IDENTIFIER {
//     pub SyntaxGUID: windows_sys::core::GUID,
//     pub SyntaxVersion: RPC_VERSION,
// }

public const val `RPC_SYSTEM_HANDLE_FREE_ALL`: UInt = 3u;
public const val `RPC_SYSTEM_HANDLE_FREE_ERROR_ON_CLOSE`: UInt = 4u;
public const val `RPC_SYSTEM_HANDLE_FREE_RETRIEVED`: UInt = 2u;
public const val `RPC_SYSTEM_HANDLE_FREE_UNRETRIEVED`: UInt = 1u;
public const val `RPC_S_ACCESS_DENIED`: `RPC_STATUS` = 5;
public const val `RPC_S_ADDRESS_ERROR`: `RPC_STATUS` = 1768;
public const val `RPC_S_ALREADY_LISTENING`: `RPC_STATUS` = 1713;
public const val `RPC_S_ALREADY_REGISTERED`: `RPC_STATUS` = 1711;
public const val `RPC_S_ASYNC_CALL_PENDING`: `RPC_STATUS` = 997;
public const val `RPC_S_BINDING_HAS_NO_AUTH`: `RPC_STATUS` = 1746;
public const val `RPC_S_BINDING_INCOMPLETE`: `RPC_STATUS` = 1819;
public const val `RPC_S_BUFFER_TOO_SMALL`: `RPC_STATUS` = 122;
public const val `RPC_S_CALL_CANCELLED`: `RPC_STATUS` = 1818;
public const val `RPC_S_CALL_FAILED`: `RPC_STATUS` = 1726;
public const val `RPC_S_CALL_FAILED_DNE`: `RPC_STATUS` = 1727;
public const val `RPC_S_CALL_IN_PROGRESS`: `RPC_STATUS` = 1791;
public const val `RPC_S_CANNOT_SUPPORT`: `RPC_STATUS` = 1764;
public const val `RPC_S_CANT_CREATE_ENDPOINT`: `RPC_STATUS` = 1720;
public const val `RPC_S_COMM_FAILURE`: `RPC_STATUS` = 1820;
public const val `RPC_S_COOKIE_AUTH_FAILED`: `RPC_STATUS` = 1833;
public const val `RPC_S_DO_NOT_DISTURB`: `RPC_STATUS` = 1834;
public const val `RPC_S_DUPLICATE_ENDPOINT`: `RPC_STATUS` = 1740;
public const val `RPC_S_ENTRY_ALREADY_EXISTS`: `RPC_STATUS` = 1760;
public const val `RPC_S_ENTRY_NOT_FOUND`: `RPC_STATUS` = 1761;
public const val `RPC_S_ENTRY_TYPE_MISMATCH`: `RPC_STATUS` = 1922;
public const val `RPC_S_FP_DIV_ZERO`: `RPC_STATUS` = 1769;
public const val `RPC_S_FP_OVERFLOW`: `RPC_STATUS` = 1771;
public const val `RPC_S_FP_UNDERFLOW`: `RPC_STATUS` = 1770;
public const val `RPC_S_GROUP_MEMBER_NOT_FOUND`: `RPC_STATUS` = 1898;
public const val `RPC_S_GRP_ELT_NOT_ADDED`: `RPC_STATUS` = 1928;
public const val `RPC_S_GRP_ELT_NOT_REMOVED`: `RPC_STATUS` = 1929;
public const val `RPC_S_INCOMPLETE_NAME`: `RPC_STATUS` = 1755;
public const val `RPC_S_INTERFACE_NOT_EXPORTED`: `RPC_STATUS` = 1924;
public const val `RPC_S_INTERFACE_NOT_FOUND`: `RPC_STATUS` = 1759;
public const val `RPC_S_INTERNAL_ERROR`: `RPC_STATUS` = 1766;
public const val `RPC_S_INVALID_ARG`: `RPC_STATUS` = 87;
public const val `RPC_S_INVALID_ASYNC_CALL`: `RPC_STATUS` = 1915;
public const val `RPC_S_INVALID_ASYNC_HANDLE`: `RPC_STATUS` = 1914;
public const val `RPC_S_INVALID_AUTH_IDENTITY`: `RPC_STATUS` = 1749;
public const val `RPC_S_INVALID_BINDING`: `RPC_STATUS` = 1702;
public const val `RPC_S_INVALID_BOUND`: `RPC_STATUS` = 1734;
public const val `RPC_S_INVALID_ENDPOINT_FORMAT`: `RPC_STATUS` = 1706;
public const val `RPC_S_INVALID_LEVEL`: `RPC_STATUS` = 87;
public const val `RPC_S_INVALID_NAF_ID`: `RPC_STATUS` = 1763;
public const val `RPC_S_INVALID_NAME_SYNTAX`: `RPC_STATUS` = 1736;
public const val `RPC_S_INVALID_NETWORK_OPTIONS`: `RPC_STATUS` = 1724;
public const val `RPC_S_INVALID_NET_ADDR`: `RPC_STATUS` = 1707;
public const val `RPC_S_INVALID_OBJECT`: `RPC_STATUS` = 1900;
public const val `RPC_S_INVALID_RPC_PROTSEQ`: `RPC_STATUS` = 1704;
public const val `RPC_S_INVALID_SECURITY_DESC`: `RPC_STATUS` = 1338;
public const val `RPC_S_INVALID_STRING_BINDING`: `RPC_STATUS` = 1700;
public const val `RPC_S_INVALID_STRING_UUID`: `RPC_STATUS` = 1705;
public const val `RPC_S_INVALID_TAG`: `RPC_STATUS` = 1733;
public const val `RPC_S_INVALID_TIMEOUT`: `RPC_STATUS` = 1709;
public const val `RPC_S_INVALID_VERS_OPTION`: `RPC_STATUS` = 1756;
public const val `RPC_S_MAX_CALLS_TOO_SMALL`: `RPC_STATUS` = 1742;
public const val `RPC_S_NAME_SERVICE_UNAVAILABLE`: `RPC_STATUS` = 1762;
public const val `RPC_S_NOTHING_TO_EXPORT`: `RPC_STATUS` = 1754;
public const val `RPC_S_NOT_ALL_OBJS_EXPORTED`: `RPC_STATUS` = 1923;
public const val `RPC_S_NOT_ALL_OBJS_UNEXPORTED`: `RPC_STATUS` = 1758;
public const val `RPC_S_NOT_CANCELLED`: `RPC_STATUS` = 1826;
public const val `RPC_S_NOT_ENOUGH_QUOTA`: `RPC_STATUS` = 1816;
public const val `RPC_S_NOT_LISTENING`: `RPC_STATUS` = 1715;
public const val `RPC_S_NOT_RPC_ERROR`: `RPC_STATUS` = 1823;
public const val `RPC_S_NO_BINDINGS`: `RPC_STATUS` = 1718;
public const val `RPC_S_NO_CALL_ACTIVE`: `RPC_STATUS` = 1725;
public const val `RPC_S_NO_CONTEXT_AVAILABLE`: `RPC_STATUS` = 1765;
public const val `RPC_S_NO_ENDPOINT_FOUND`: `RPC_STATUS` = 1708;
public const val `RPC_S_NO_ENTRY_NAME`: `RPC_STATUS` = 1735;
public const val `RPC_S_NO_INTERFACES`: `RPC_STATUS` = 1817;
public const val `RPC_S_NO_MORE_BINDINGS`: `RPC_STATUS` = 1806;
public const val `RPC_S_NO_MORE_MEMBERS`: `RPC_STATUS` = 1757;
public const val `RPC_S_NO_PRINC_NAME`: `RPC_STATUS` = 1822;
public const val `RPC_S_NO_PROTSEQS`: `RPC_STATUS` = 1719;
public const val `RPC_S_NO_PROTSEQS_REGISTERED`: `RPC_STATUS` = 1714;
public const val `RPC_S_OBJECT_NOT_FOUND`: `RPC_STATUS` = 1710;
public const val `RPC_S_OK`: `RPC_STATUS` = 0;
public const val `RPC_S_OUT_OF_MEMORY`: `RPC_STATUS` = 14;
public const val `RPC_S_OUT_OF_RESOURCES`: `RPC_STATUS` = 1721;
public const val `RPC_S_OUT_OF_THREADS`: `RPC_STATUS` = 164;
public const val `RPC_S_PRF_ELT_NOT_ADDED`: `RPC_STATUS` = 1926;
public const val `RPC_S_PRF_ELT_NOT_REMOVED`: `RPC_STATUS` = 1927;
public const val `RPC_S_PROCNUM_OUT_OF_RANGE`: `RPC_STATUS` = 1745;
public const val `RPC_S_PROFILE_NOT_ADDED`: `RPC_STATUS` = 1925;
public const val `RPC_S_PROTOCOL_ERROR`: `RPC_STATUS` = 1728;
public const val `RPC_S_PROTSEQ_NOT_FOUND`: `RPC_STATUS` = 1744;
public const val `RPC_S_PROTSEQ_NOT_SUPPORTED`: `RPC_STATUS` = 1703;
public const val `RPC_S_PROXY_ACCESS_DENIED`: `RPC_STATUS` = 1729;
public const val `RPC_S_RUNTIME_UNINITIALIZED`: `RPC_STATUS` = 1;
public const val `RPC_S_SEC_PKG_ERROR`: `RPC_STATUS` = 1825;
public const val `RPC_S_SEND_INCOMPLETE`: `RPC_STATUS` = 1913;
public const val `RPC_S_SERVER_OUT_OF_MEMORY`: `RPC_STATUS` = 1130;
public const val `RPC_S_SERVER_TOO_BUSY`: `RPC_STATUS` = 1723;
public const val `RPC_S_SERVER_UNAVAILABLE`: `RPC_STATUS` = 1722;
public const val `RPC_S_STRING_TOO_LONG`: `RPC_STATUS` = 1743;
public const val `RPC_S_SYSTEM_HANDLE_COUNT_EXCEEDED`: `RPC_STATUS` = 1835;
public const val `RPC_S_SYSTEM_HANDLE_TYPE_MISMATCH`: `RPC_STATUS` = 1836;
public const val `RPC_S_TIMEOUT`: `RPC_STATUS` = 1460;
public const val `RPC_S_TYPE_ALREADY_REGISTERED`: `RPC_STATUS` = 1712;
public const val `RPC_S_UNKNOWN_AUTHN_LEVEL`: `RPC_STATUS` = 1748;
public const val `RPC_S_UNKNOWN_AUTHN_SERVICE`: `RPC_STATUS` = 1747;
public const val `RPC_S_UNKNOWN_AUTHN_TYPE`: `RPC_STATUS` = 1741;
public const val `RPC_S_UNKNOWN_AUTHZ_SERVICE`: `RPC_STATUS` = 1750;
public const val `RPC_S_UNKNOWN_IF`: `RPC_STATUS` = 1717;
public const val `RPC_S_UNKNOWN_MGR_TYPE`: `RPC_STATUS` = 1716;
public const val `RPC_S_UNKNOWN_PRINCIPAL`: `RPC_STATUS` = 1332;
public const val `RPC_S_UNSUPPORTED_AUTHN_LEVEL`: `RPC_STATUS` = 1821;
public const val `RPC_S_UNSUPPORTED_NAME_SYNTAX`: `RPC_STATUS` = 1737;
public const val `RPC_S_UNSUPPORTED_TRANS_SYN`: `RPC_STATUS` = 1730;
public const val `RPC_S_UNSUPPORTED_TYPE`: `RPC_STATUS` = 1732;
public const val `RPC_S_UUID_LOCAL_ONLY`: `RPC_STATUS` = 1824;
public const val `RPC_S_UUID_NO_ADDRESS`: `RPC_STATUS` = 1739;
public const val `RPC_S_WRONG_KIND_OF_BINDING`: `RPC_STATUS` = 1701;
public const val `RPC_S_ZERO_DIVIDE`: `RPC_STATUS` = 1767;
// UNSUPPORTED Rust 3205:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RPC_TRANSFER_SYNTAX {
//     pub Uuid: windows_sys::core::GUID,
//     pub VersMajor: u16,
//     pub VersMinor: u16,
// }

public const val `RPC_TYPE_DISCONNECT_EVENT_CONTEXT_HANDLE`: UInt = 2147483648u;
public const val `RPC_TYPE_STRICT_CONTEXT_HANDLE`: UInt = 1073741824u;
// UNSUPPORTED Rust 3214:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RPC_VERSION {
//     pub MajorVersion: u16,
//     pub MinorVersion: u16,
// }

public const val `RpcAttemptedLbsDecisions`: `RpcPerfCounters` = 8;
public const val `RpcAttemptedLbsMessages`: `RpcPerfCounters` = 10;
public const val `RpcBackEndConnectionAttempts`: `RpcPerfCounters` = 2;
public const val `RpcBackEndConnectionFailed`: `RpcPerfCounters` = 3;
public typealias `RpcCallClientLocality` = Int;
public const val `RpcCallComplete`: `RPC_ASYNC_EVENT` = 0;
public typealias `RpcCallType` = Int;
public const val `RpcClientCancel`: `RPC_ASYNC_EVENT` = 4;
public const val `RpcClientDisconnect`: `RPC_ASYNC_EVENT` = 3;
public const val `RpcCurrentUniqueUser`: `RpcPerfCounters` = 1;
public const val `RpcFailedLbsDecisions`: `RpcPerfCounters` = 9;
public const val `RpcFailedLbsMessages`: `RpcPerfCounters` = 11;
public const val `RpcIncomingBandwidth`: `RpcPerfCounters` = 6;
public const val `RpcIncomingConnections`: `RpcPerfCounters` = 5;
public const val `RpcLastCounter`: `RpcPerfCounters` = 12;
public typealias `RpcLocalAddressFormat` = Int;
public const val `RpcNotificationCallCancel`: `RPC_NOTIFICATIONS` = 2;
public const val `RpcNotificationCallNone`: `RPC_NOTIFICATIONS` = 0;
public const val `RpcNotificationClientDisconnect`: `RPC_NOTIFICATIONS` = 1;
public const val `RpcNotificationTypeApc`: `RPC_NOTIFICATION_TYPES` = 2;
public const val `RpcNotificationTypeCallback`: `RPC_NOTIFICATION_TYPES` = 5;
public const val `RpcNotificationTypeEvent`: `RPC_NOTIFICATION_TYPES` = 1;
public const val `RpcNotificationTypeHwnd`: `RPC_NOTIFICATION_TYPES` = 4;
public const val `RpcNotificationTypeIoc`: `RPC_NOTIFICATION_TYPES` = 3;
public const val `RpcNotificationTypeNone`: `RPC_NOTIFICATION_TYPES` = 0;
public const val `RpcOutgoingBandwidth`: `RpcPerfCounters` = 7;
public typealias `RpcPerfCounters` = Int;
public const val `RpcReceiveComplete`: `RPC_ASYNC_EVENT` = 2;
public const val `RpcRequestsPerSecond`: `RpcPerfCounters` = 4;
public const val `RpcSendComplete`: `RPC_ASYNC_EVENT` = 1;
// UNSUPPORTED Rust 3250:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SCONTEXT_QUEUE {
//     pub NumberOfObjects: u32,
//     pub ArrayOfObjects: *mut *mut NDR_SCONTEXT,
// }

// UNSUPPORTED Rust 3256:1: declaration Impl has no candidate rule
// impl Default for SCONTEXT_QUEUE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SEC_WINNT_AUTH_IDENTITY` = UInt;
// UNSUPPORTED Rust 3262:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SEC_WINNT_AUTH_IDENTITY_A {
//     pub User: *mut u8,
//     pub UserLength: u32,
//     pub Domain: *mut u8,
//     pub DomainLength: u32,
//     pub Password: *mut u8,
//     pub PasswordLength: u32,
//     pub Flags: SEC_WINNT_AUTH_IDENTITY,
// }

// UNSUPPORTED Rust 3273:1: declaration Impl has no candidate rule
// impl Default for SEC_WINNT_AUTH_IDENTITY_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SEC_WINNT_AUTH_IDENTITY_ANSI`: `SEC_WINNT_AUTH_IDENTITY` = 1u;
public const val `SEC_WINNT_AUTH_IDENTITY_UNICODE`: `SEC_WINNT_AUTH_IDENTITY` = 2u;
// UNSUPPORTED Rust 3280:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SEC_WINNT_AUTH_IDENTITY_W {
//     pub User: *mut u16,
//     pub UserLength: u32,
//     pub Domain: *mut u16,
//     pub DomainLength: u32,
//     pub Password: *mut u16,
//     pub PasswordLength: u32,
//     pub Flags: SEC_WINNT_AUTH_IDENTITY,
// }

// UNSUPPORTED Rust 3291:1: declaration Impl has no candidate rule
// impl Default for SEC_WINNT_AUTH_IDENTITY_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3296:1: generic scalar type unsupported
// pub type SERVER_ROUTINE = Option<unsafe extern "system" fn() -> i32>;

public const val `STUB_CALL_SERVER`: `STUB_PHASE` = 1;
public const val `STUB_CALL_SERVER_NO_HRESULT`: `STUB_PHASE` = 3;
public const val `STUB_MARSHAL`: `STUB_PHASE` = 2;
public typealias `STUB_PHASE` = Int;
// UNSUPPORTED Rust 3301:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Com")]
// pub type STUB_THUNK = Option<unsafe extern "system" fn(param0: *mut MIDL_STUB_MESSAGE)>;

public const val `STUB_UNMARSHAL`: `STUB_PHASE` = 0;
public const val `SYSTEM_HANDLE_COMPOSITION_OBJECT`: `system_handle_t` = 9;
public const val `SYSTEM_HANDLE_EVENT`: `system_handle_t` = 2;
public const val `SYSTEM_HANDLE_FILE`: `system_handle_t` = 0;
public const val `SYSTEM_HANDLE_INVALID`: `system_handle_t` = 255;
public const val `SYSTEM_HANDLE_JOB`: `system_handle_t` = 11;
public const val `SYSTEM_HANDLE_MAX`: `system_handle_t` = 12;
public const val `SYSTEM_HANDLE_MUTEX`: `system_handle_t` = 3;
public const val `SYSTEM_HANDLE_PIPE`: `system_handle_t` = 12;
public const val `SYSTEM_HANDLE_PROCESS`: `system_handle_t` = 4;
public const val `SYSTEM_HANDLE_REG_KEY`: `system_handle_t` = 7;
public const val `SYSTEM_HANDLE_SECTION`: `system_handle_t` = 6;
public const val `SYSTEM_HANDLE_SEMAPHORE`: `system_handle_t` = 1;
public const val `SYSTEM_HANDLE_SOCKET`: `system_handle_t` = 10;
public const val `SYSTEM_HANDLE_THREAD`: `system_handle_t` = 8;
public const val `SYSTEM_HANDLE_TOKEN`: `system_handle_t` = 5;
public const val `TARGET_IS_NT100_OR_LATER`: UInt = 1u;
public const val `TARGET_IS_NT1012_OR_LATER`: UInt = 1u;
public const val `TARGET_IS_NT102_OR_LATER`: UInt = 1u;
public const val `TARGET_IS_NT351_OR_WIN95_OR_LATER`: UInt = 1u;
public const val `TARGET_IS_NT40_OR_LATER`: UInt = 1u;
public const val `TARGET_IS_NT50_OR_LATER`: UInt = 1u;
public const val `TARGET_IS_NT51_OR_LATER`: UInt = 1u;
public const val `TARGET_IS_NT60_OR_LATER`: UInt = 1u;
public const val `TARGET_IS_NT61_OR_LATER`: UInt = 1u;
public const val `TARGET_IS_NT62_OR_LATER`: UInt = 1u;
public const val `TARGET_IS_NT63_OR_LATER`: UInt = 1u;
public const val `TRANSPORT_TYPE_CN`: UInt = 1u;
public const val `TRANSPORT_TYPE_DG`: UInt = 2u;
public const val `TRANSPORT_TYPE_LPC`: UInt = 4u;
public const val `TRANSPORT_TYPE_WMSG`: UInt = 8u;
public const val `USER_CALL_IS_ASYNC`: UInt = 256u;
public const val `USER_CALL_NEW_CORRELATION_DESC`: UInt = 512u;
// UNSUPPORTED Rust 3336:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct USER_MARSHAL_CB {
//     pub Flags: u32,
//     pub pStubMsg: *mut MIDL_STUB_MESSAGE,
//     pub pReserve: *mut u8,
//     pub Signature: u32,
//     pub CBType: USER_MARSHAL_CB_TYPE,
//     pub pFormat: *mut u8,
//     pub pTypeFormat: *mut u8,
// }

// UNSUPPORTED Rust 3348:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for USER_MARSHAL_CB {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `USER_MARSHAL_CB_BUFFER_SIZE`: `USER_MARSHAL_CB_TYPE` = 0;
public const val `USER_MARSHAL_CB_FREE`: `USER_MARSHAL_CB_TYPE` = 3;
public const val `USER_MARSHAL_CB_MARSHALL`: `USER_MARSHAL_CB_TYPE` = 1;
public typealias `USER_MARSHAL_CB_TYPE` = Int;
public const val `USER_MARSHAL_CB_UNMARSHALL`: `USER_MARSHAL_CB_TYPE` = 2;
public const val `USER_MARSHAL_FC_BYTE`: UInt = 1u;
public const val `USER_MARSHAL_FC_CHAR`: UInt = 2u;
public const val `USER_MARSHAL_FC_DOUBLE`: UInt = 12u;
public const val `USER_MARSHAL_FC_FLOAT`: UInt = 10u;
public const val `USER_MARSHAL_FC_HYPER`: UInt = 11u;
public const val `USER_MARSHAL_FC_LONG`: UInt = 8u;
public const val `USER_MARSHAL_FC_SHORT`: UInt = 6u;
public const val `USER_MARSHAL_FC_SMALL`: UInt = 3u;
public const val `USER_MARSHAL_FC_ULONG`: UInt = 9u;
public const val `USER_MARSHAL_FC_USHORT`: UInt = 7u;
public const val `USER_MARSHAL_FC_USMALL`: UInt = 4u;
public const val `USER_MARSHAL_FC_WCHAR`: UInt = 5u;
// UNSUPPORTED Rust 3371:1: generic scalar type unsupported
// pub type USER_MARSHAL_FREEING_ROUTINE = Option<unsafe extern "system" fn(param0: *mut u32, param1: *mut core::ffi::c_void)>;

// UNSUPPORTED Rust 3372:1: generic scalar type unsupported
// pub type USER_MARSHAL_MARSHALLING_ROUTINE = Option<unsafe extern "system" fn(param0: *mut u32, param1: *mut u8, param2: *mut core::ffi::c_void) -> *mut u8>;

// UNSUPPORTED Rust 3373:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct USER_MARSHAL_ROUTINE_QUADRUPLE {
//     pub pfnBufferSize: USER_MARSHAL_SIZING_ROUTINE,
//     pub pfnMarshall: USER_MARSHAL_MARSHALLING_ROUTINE,
//     pub pfnUnmarshall: USER_MARSHAL_UNMARSHALLING_ROUTINE,
//     pub pfnFree: USER_MARSHAL_FREEING_ROUTINE,
// }

// UNSUPPORTED Rust 3381:1: generic scalar type unsupported
// pub type USER_MARSHAL_SIZING_ROUTINE = Option<unsafe extern "system" fn(param0: *mut u32, param1: u32, param2: *mut core::ffi::c_void) -> u32>;

// UNSUPPORTED Rust 3382:1: generic scalar type unsupported
// pub type USER_MARSHAL_UNMARSHALLING_ROUTINE = Option<unsafe extern "system" fn(param0: *mut u32, param1: *mut u8, param2: *mut core::ffi::c_void) -> *mut u8>;

// UNSUPPORTED Rust 3383:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct UUID_VECTOR {
//     pub Count: u32,
//     pub Uuid: [*mut windows_sys::core::GUID; 1],
// }

// UNSUPPORTED Rust 3389:1: declaration Impl has no candidate rule
// impl Default for UUID_VECTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `XLAT_CLIENT`: `XLAT_SIDE` = 2;
public const val `XLAT_SERVER`: `XLAT_SIDE` = 1;
public typealias `XLAT_SIDE` = Int;
// UNSUPPORTED Rust 3397:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Com")]
// pub type XMIT_HELPER_ROUTINE = Option<unsafe extern "system" fn(param0: *mut MIDL_STUB_MESSAGE)>;

// UNSUPPORTED Rust 3399:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy, Default)]
// pub struct XMIT_ROUTINE_QUINTUPLE {
//     pub pfnTranslateToXmit: XMIT_HELPER_ROUTINE,
//     pub pfnTranslateFromXmit: XMIT_HELPER_ROUTINE,
//     pub pfnFreeXmit: XMIT_HELPER_ROUTINE,
//     pub pfnFreeInst: XMIT_HELPER_ROUTINE,
// }

public typealias `_NDR_PROC_CONTEXT` = Long;
public const val `__RPCPROXY_H_VERSION__`: UInt = 477u;
public const val `cbNDRContext`: UInt = 20u;
public const val `eeptAnsiString`: `ExtendedErrorParamTypes` = 1;
public const val `eeptBinary`: `ExtendedErrorParamTypes` = 7;
public const val `eeptLongVal`: `ExtendedErrorParamTypes` = 3;
public const val `eeptNone`: `ExtendedErrorParamTypes` = 6;
public const val `eeptPointerVal`: `ExtendedErrorParamTypes` = 5;
public const val `eeptShortVal`: `ExtendedErrorParamTypes` = 4;
public const val `eeptUnicodeString`: `ExtendedErrorParamTypes` = 2;
public const val `rcclClientUnknownLocality`: `RpcCallClientLocality` = 3;
public const val `rcclInvalid`: `RpcCallClientLocality` = 0;
public const val `rcclLocal`: `RpcCallClientLocality` = 1;
public const val `rcclRemote`: `RpcCallClientLocality` = 2;
public const val `rctGuaranteed`: `RpcCallType` = 3;
public const val `rctInvalid`: `RpcCallType` = 0;
public const val `rctNormal`: `RpcCallType` = 1;
public const val `rctTraining`: `RpcCallType` = 2;
public const val `rlafIPv4`: `RpcLocalAddressFormat` = 1;
public const val `rlafIPv6`: `RpcLocalAddressFormat` = 2;
public const val `rlafInvalid`: `RpcLocalAddressFormat` = 0;
public typealias `system_handle_t` = Int;
