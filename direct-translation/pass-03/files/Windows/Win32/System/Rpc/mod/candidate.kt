// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=DceErrorInqTextA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DceErrorInqTextA`(`rpcstatus` : `RPC_STATUS`, `errortext` : `windows_sys`.`core`.`PSTR`) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=DceErrorInqTextW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DceErrorInqTextW`(`rpcstatus` : `RPC_STATUS`, `errortext` : `windows_sys`.`core`.`PWSTR`) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=IUnknown_AddRef_Proxy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IUnknown_AddRef_Proxy`(`this` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=IUnknown_QueryInterface_Proxy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IUnknown_QueryInterface_Proxy`(`this` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppvobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=IUnknown_Release_Proxy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IUnknown_Release_Proxy`(`this` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcAllocate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcAllocate`(`size` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcAsyncAbortCall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `I_RpcAsyncAbortCall`(`pasync` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_ASYNC_STATE`>?, `exceptioncode` : UInt) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcAsyncSetHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `I_RpcAsyncSetHandle`(`message` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_MESSAGE`>?, `pasync` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_ASYNC_STATE`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcBindingCopy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcBindingCopy`(`sourcebinding` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `destinationbinding` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcBindingCreateNP; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcBindingCreateNP`(`servername` : `windows_sys`.`core`.`PCWSTR`, `servicename` : `windows_sys`.`core`.`PCWSTR`, `networkoptions` : `windows_sys`.`core`.`PCWSTR`, `binding` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcBindingHandleToAsyncHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcBindingHandleToAsyncHandle`(`binding` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `asynchandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcBindingInqClientTokenAttributes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcBindingInqClientTokenAttributes`(`binding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `tokenid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`LUID`>?, `authenticationid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`LUID`>?, `modifiedid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`LUID`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcBindingInqDynamicEndpointA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcBindingInqDynamicEndpointA`(`binding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dynamicendpoint` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcBindingInqDynamicEndpointW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcBindingInqDynamicEndpointW`(`binding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dynamicendpoint` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcBindingInqLocalClientPID; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcBindingInqLocalClientPID`(`binding` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcBindingInqMarshalledTargetInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcBindingInqMarshalledTargetInfo`(`binding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `marshalledtargetinfosize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `marshalledtargetinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcBindingInqSecurityContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcBindingInqSecurityContext`(`binding` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `securitycontexthandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcBindingInqSecurityContextKeyInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcBindingInqSecurityContextKeyInfo`(`binding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `keyinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcBindingInqTransportType; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcBindingInqTransportType`(`binding` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `type` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcBindingInqWireIdForSnego; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcBindingInqWireIdForSnego`(`binding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `wireid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcBindingIsClientLocal; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcBindingIsClientLocal`(`bindinghandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `clientlocalflag` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcBindingIsServerLocal; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcBindingIsServerLocal`(`binding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `serverlocalflag` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcBindingSetPrivateOption; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcBindingSetPrivateOption`(`hbinding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `option` : UInt, `optionvalue` : ULong) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcBindingToStaticStringBindingW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcBindingToStaticStringBindingW`(`binding` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `stringbinding` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UShortVar>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcClearMutex; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcClearMutex`(`mutex` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcDeleteMutex; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcDeleteMutex`(`mutex` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcExceptionFilter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcExceptionFilter`(`exceptioncode` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcFree`(`object` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcFreeBuffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcFreeBuffer`(`message` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_MESSAGE`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcFreePipeBuffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcFreePipeBuffer`(`message` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_MESSAGE`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcGetBuffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcGetBuffer`(`message` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_MESSAGE`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcGetBufferWithObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcGetBufferWithObject`(`message` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_MESSAGE`>?, `objectuuid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcGetCurrentCallHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcGetCurrentCallHandle`() : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcGetDefaultSD; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcGetDefaultSD`(`ppsecuritydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcGetExtendedError; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcGetExtendedError`() : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcIfInqTransferSyntaxes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcIfInqTransferSyntaxes`(`rpcifhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `transfersyntaxes` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_TRANSFER_SYNTAX`>?, `transfersyntaxsize` : UInt, `transfersyntaxcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcMapWin32Status; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcMapWin32Status`(`status` : `RPC_STATUS`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcMgmtEnableDedicatedThreadPool; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcMgmtEnableDedicatedThreadPool`() : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcNegotiateTransferSyntax; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcNegotiateTransferSyntax`(`message` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_MESSAGE`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcNsBindingSetEntryNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcNsBindingSetEntryNameA`(`binding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `entrynamesyntax` : UInt, `entryname` : `windows_sys`.`core`.`PCSTR`) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcNsBindingSetEntryNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcNsBindingSetEntryNameW`(`binding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `entrynamesyntax` : UInt, `entryname` : `windows_sys`.`core`.`PCWSTR`) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=I_RpcNsGetBuffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcNsGetBuffer`(`message` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_MESSAGE`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcNsInterfaceExported; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcNsInterfaceExported`(`entrynamesyntax` : UInt, `entryname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `rpcinterfaceinformation` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_SERVER_INTERFACE`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcNsInterfaceUnexported; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcNsInterfaceUnexported`(`entrynamesyntax` : UInt, `entryname` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `rpcinterfaceinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_SERVER_INTERFACE`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=I_RpcNsRaiseException; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcNsRaiseException`(`message` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_MESSAGE`>?, `status` : `RPC_STATUS`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=I_RpcNsSendReceive; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcNsSendReceive`(`message` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_MESSAGE`>?, `handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcOpenClientProcess; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcOpenClientProcess`(`binding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `desiredaccess` : UInt, `clientprocess` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcPauseExecution; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcPauseExecution`(`milliseconds` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=I_RpcReBindBuffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcReBindBuffer`(`message` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_MESSAGE`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcReallocPipeBuffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcReallocPipeBuffer`(`message` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_MESSAGE`>?, `newsize` : UInt) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcReceive; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcReceive`(`message` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_MESSAGE`>?, `size` : UInt) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcRecordCalloutFailure; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcRecordCalloutFailure`(`rpcstatus` : `RPC_STATUS`, `calloutstate` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RDR_CALLOUT_STATE`>?, `dllname` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcRequestMutex; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcRequestMutex`(`mutex` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcSend; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcSend`(`message` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_MESSAGE`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcSendReceive; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcSendReceive`(`message` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_MESSAGE`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcServerCheckClientRestriction; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcServerCheckClientRestriction`(`context` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcServerDisableExceptionFilter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcServerDisableExceptionFilter`() : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcServerGetAssociationID; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcServerGetAssociationID`(`binding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `associationid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcServerInqAddressChangeFn; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcServerInqAddressChangeFn`() : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_ADDRESS_CHANGE_FN`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcServerInqLocalConnAddress; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcServerInqLocalConnAddress`(`binding` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `buffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `addressformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcServerInqRemoteConnAddress; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcServerInqRemoteConnAddress`(`binding` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `buffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `addressformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcServerInqTransportType; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcServerInqTransportType`(`type` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcServerRegisterForwardFunction; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcServerRegisterForwardFunction`(`pforwardfunction` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_FORWARD_FUNCTION`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcServerSetAddressChangeFn; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcServerSetAddressChangeFn`(`paddresschangefn` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_ADDRESS_CHANGE_FN`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcServerStartService; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcServerStartService`(`protseq` : `windows_sys`.`core`.`PCWSTR`, `endpoint` : `windows_sys`.`core`.`PCWSTR`, `ifspec` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcServerSubscribeForDisconnectNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcServerSubscribeForDisconnectNotification`(`binding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `hevent` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcServerSubscribeForDisconnectNotification2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcServerSubscribeForDisconnectNotification2`(`binding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `hevent` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `subscriptionid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcServerUnsubscribeForDisconnectNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcServerUnsubscribeForDisconnectNotification`(`binding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `subscriptionid` : `windows_sys`.`core`.`GUID`) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcServerUseProtseq2A; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcServerUseProtseq2A`(`networkaddress` : `windows_sys`.`core`.`PCSTR`, `protseq` : `windows_sys`.`core`.`PCSTR`, `maxcalls` : UInt, `securitydescriptor` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `policy` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcServerUseProtseq2W; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcServerUseProtseq2W`(`networkaddress` : `windows_sys`.`core`.`PCWSTR`, `protseq` : `windows_sys`.`core`.`PCWSTR`, `maxcalls` : UInt, `securitydescriptor` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `policy` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcServerUseProtseqEp2A; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcServerUseProtseqEp2A`(`networkaddress` : `windows_sys`.`core`.`PCSTR`, `protseq` : `windows_sys`.`core`.`PCSTR`, `maxcalls` : UInt, `endpoint` : `windows_sys`.`core`.`PCSTR`, `securitydescriptor` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `policy` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcServerUseProtseqEp2W; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcServerUseProtseqEp2W`(`networkaddress` : `windows_sys`.`core`.`PCWSTR`, `protseq` : `windows_sys`.`core`.`PCWSTR`, `maxcalls` : UInt, `endpoint` : `windows_sys`.`core`.`PCWSTR`, `securitydescriptor` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `policy` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcSessionStrictContextHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcSessionStrictContextHandle`()
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcSsDontSerializeContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcSsDontSerializeContext`()
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcSystemHandleTypeSpecificWork; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcSystemHandleTypeSpecificWork`(`handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `actualtype` : UByte, `idltype` : UByte, `marshaldirection` : `LRPC_SYSTEM_HANDLE_MARSHAL_DIRECTION`) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_RpcTurnOnEEInfoPropagation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_RpcTurnOnEEInfoPropagation`() : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=I_UuidCreate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `I_UuidCreate`(`uuid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=MesBufferHandleReset; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MesBufferHandleReset`(`handle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `handlestyle` : UInt, `operation` : `MIDL_ES_CODE`, `pbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?, `buffersize` : UInt, `pencodedsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=MesDecodeBufferHandleCreate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MesDecodeBufferHandleCreate`(`buffer` : `windows_sys`.`core`.`PCSTR`, `buffersize` : UInt, `phandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=MesDecodeIncrementalHandleCreate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MesDecodeIncrementalHandleCreate`(`userstate` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `readfn` : `MIDL_ES_READ`, `phandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=MesEncodeDynBufferHandleCreate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MesEncodeDynBufferHandleCreate`(`pbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?, `pencodedsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `phandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=MesEncodeFixedBufferHandleCreate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MesEncodeFixedBufferHandleCreate`(`pbuffer` : `windows_sys`.`core`.`PSTR`, `buffersize` : UInt, `pencodedsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `phandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=MesEncodeIncrementalHandleCreate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MesEncodeIncrementalHandleCreate`(`userstate` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `allocfn` : `MIDL_ES_ALLOC`, `writefn` : `MIDL_ES_WRITE`, `phandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=MesHandleFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MesHandleFree`(`handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=MesIncrementalHandleReset; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MesIncrementalHandleReset`(`handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `userstate` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `allocfn` : `MIDL_ES_ALLOC`, `writefn` : `MIDL_ES_WRITE`, `readfn` : `MIDL_ES_READ`, `operation` : `MIDL_ES_CODE`) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=MesInqProcEncodingId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MesInqProcEncodingId`(`handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pinterfaceid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_SYNTAX_IDENTIFIER`>?, `pprocnum` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NDRCContextBinding; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NDRCContextBinding`(`ccontext` : Long) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NDRCContextMarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NDRCContextMarshall`(`ccontext` : Long, `pbuff` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NDRCContextUnmarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NDRCContextUnmarshall`(`pccontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `hbinding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pbuff` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `datarepresentation` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NDRSContextMarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NDRSContextMarshall`(`ccontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`NDR_SCONTEXT`>?, `pbuff` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `userrundownin` : `NDR_RUNDOWN`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NDRSContextMarshall2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NDRSContextMarshall2`(`bindinghandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ccontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`NDR_SCONTEXT`>?, `pbuff` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `userrundownin` : `NDR_RUNDOWN`, `ctxguard` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `flags` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NDRSContextMarshallEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NDRSContextMarshallEx`(`bindinghandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ccontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`NDR_SCONTEXT`>?, `pbuff` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `userrundownin` : `NDR_RUNDOWN`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NDRSContextUnmarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NDRSContextUnmarshall`(`pbuff` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `datarepresentation` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<`NDR_SCONTEXT`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NDRSContextUnmarshall2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NDRSContextUnmarshall2`(`bindinghandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pbuff` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `datarepresentation` : UInt, `ctxguard` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `flags` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<`NDR_SCONTEXT`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NDRSContextUnmarshallEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NDRSContextUnmarshallEx`(`bindinghandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pbuff` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `datarepresentation` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<`NDR_SCONTEXT`>?
// UNSUPPORTED Rust 98:1: attribute cfg requires explicit semantics/configuration; syntax: foreign signature shape unsupported
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "C" fn Ndr64AsyncClientCall(pproxyinfo : *mut MIDL_STUBLESS_PROXY_INFO, nprocnum : u32, preturnvalue : *mut core::ffi::c_void, ...) -> CLIENT_CALL_RETURN);

// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=Ndr64AsyncServerCall64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Ndr64AsyncServerCall64`(`prpcmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_MESSAGE`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=Ndr64AsyncServerCallAll; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Ndr64AsyncServerCallAll`(`prpcmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_MESSAGE`>?)
// UNSUPPORTED Rust 102:1: attribute cfg requires explicit semantics/configuration; syntax: foreign signature shape unsupported
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "C" fn Ndr64DcomAsyncClientCall(pproxyinfo : *mut MIDL_STUBLESS_PROXY_INFO, nprocnum : u32, preturnvalue : *mut core::ffi::c_void, ...) -> CLIENT_CALL_RETURN);

// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=Ndr64DcomAsyncStubCall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `Ndr64DcomAsyncStubCall`(`pthis` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pchannel` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `prpcmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_MESSAGE`>?, `pdwstubphase` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrAllocate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrAllocate`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `len` : ULong) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// UNSUPPORTED Rust 108:1: attribute cfg requires explicit semantics/configuration; syntax: foreign signature shape unsupported
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "C" fn NdrAsyncClientCall(pstubdescriptor : *mut MIDL_STUB_DESC, pformat : *mut u8, ...) -> CLIENT_CALL_RETURN);

// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrAsyncServerCall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdrAsyncServerCall`(`prpcmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_MESSAGE`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrByteCountPointerBufferSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrByteCountPointerBufferSize`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrByteCountPointerFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrByteCountPointerFree`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrByteCountPointerMarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrByteCountPointerMarshall`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrByteCountPointerUnmarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrByteCountPointerUnmarshall`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `ppmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `fmustalloc` : UByte) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrClearOutParameters; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrClearOutParameters`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `argaddr` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// UNSUPPORTED Rust 121:1: attribute cfg requires explicit semantics/configuration; syntax: foreign signature shape unsupported
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "C" fn NdrClientCall2(pstubdescriptor : *mut MIDL_STUB_DESC, pformat : *mut u8, ...) -> CLIENT_CALL_RETURN);

// UNSUPPORTED Rust 123:1: attribute cfg requires explicit semantics/configuration; syntax: foreign signature shape unsupported
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "C" fn NdrClientCall3(pproxyinfo : *mut MIDL_STUBLESS_PROXY_INFO, nprocnum : u32, preturnvalue : *mut core::ffi::c_void, ...) -> CLIENT_CALL_RETURN);

// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrClientContextMarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrClientContextMarshall`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `contexthandle` : Long, `fcheck` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrClientContextUnmarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrClientContextUnmarshall`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pcontexthandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `bindhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrClientInitialize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrClientInitialize`(`prpcmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_MESSAGE`>?, `pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pstubdescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_DESC`>?, `procnum` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrClientInitializeNew; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrClientInitializeNew`(`prpcmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_MESSAGE`>?, `pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pstubdescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_DESC`>?, `procnum` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrComplexArrayBufferSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrComplexArrayBufferSize`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrComplexArrayFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrComplexArrayFree`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrComplexArrayMarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrComplexArrayMarshall`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrComplexArrayMemorySize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrComplexArrayMemorySize`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrComplexArrayUnmarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrComplexArrayUnmarshall`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `ppmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `fmustalloc` : UByte) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrComplexStructBufferSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrComplexStructBufferSize`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrComplexStructFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrComplexStructFree`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrComplexStructMarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrComplexStructMarshall`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrComplexStructMemorySize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrComplexStructMemorySize`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrComplexStructUnmarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrComplexStructUnmarshall`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `ppmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `fmustalloc` : UByte) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrConformantArrayBufferSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrConformantArrayBufferSize`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrConformantArrayFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrConformantArrayFree`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrConformantArrayMarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrConformantArrayMarshall`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrConformantArrayMemorySize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrConformantArrayMemorySize`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrConformantArrayUnmarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrConformantArrayUnmarshall`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `ppmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `fmustalloc` : UByte) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrConformantStringBufferSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrConformantStringBufferSize`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrConformantStringMarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrConformantStringMarshall`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrConformantStringMemorySize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrConformantStringMemorySize`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrConformantStringUnmarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrConformantStringUnmarshall`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `ppmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `fmustalloc` : UByte) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrConformantStructBufferSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrConformantStructBufferSize`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrConformantStructFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrConformantStructFree`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrConformantStructMarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrConformantStructMarshall`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrConformantStructMemorySize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrConformantStructMemorySize`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrConformantStructUnmarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrConformantStructUnmarshall`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `ppmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `fmustalloc` : UByte) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrConformantVaryingArrayBufferSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrConformantVaryingArrayBufferSize`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrConformantVaryingArrayFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrConformantVaryingArrayFree`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrConformantVaryingArrayMarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrConformantVaryingArrayMarshall`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrConformantVaryingArrayMemorySize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrConformantVaryingArrayMemorySize`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrConformantVaryingArrayUnmarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrConformantVaryingArrayUnmarshall`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `ppmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `fmustalloc` : UByte) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrConformantVaryingStructBufferSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrConformantVaryingStructBufferSize`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrConformantVaryingStructFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrConformantVaryingStructFree`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrConformantVaryingStructMarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrConformantVaryingStructMarshall`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrConformantVaryingStructMemorySize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrConformantVaryingStructMemorySize`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrConformantVaryingStructUnmarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrConformantVaryingStructUnmarshall`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `ppmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `fmustalloc` : UByte) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrContextHandleInitialize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrContextHandleInitialize`(`pstubmsg` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pformat` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`NDR_SCONTEXT`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrContextHandleSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrContextHandleSize`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrConvert; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrConvert`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrConvert2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrConvert2`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `numberparams` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrCorrelationFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrCorrelationFree`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrCorrelationInitialize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrCorrelationInitialize`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cachesize` : UInt, `flags` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrCorrelationPass; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrCorrelationPass`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrCreateServerInterfaceFromStub; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrCreateServerInterfaceFromStub`(`pstub` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pserverif` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_SERVER_INTERFACE`>?) : `RPC_STATUS`
// UNSUPPORTED Rust 217:1: attribute cfg requires explicit semantics/configuration; syntax: foreign signature shape unsupported
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "C" fn NdrDcomAsyncClientCall(pstubdescriptor : *mut MIDL_STUB_DESC, pformat : *mut u8, ...) -> CLIENT_CALL_RETURN);

// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrDcomAsyncStubCall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrDcomAsyncStubCall`(`pthis` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pchannel` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `prpcmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_MESSAGE`>?, `pdwstubphase` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrEncapsulatedUnionBufferSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrEncapsulatedUnionBufferSize`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrEncapsulatedUnionFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrEncapsulatedUnionFree`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrEncapsulatedUnionMarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrEncapsulatedUnionMarshall`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrEncapsulatedUnionMemorySize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrEncapsulatedUnionMemorySize`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrEncapsulatedUnionUnmarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrEncapsulatedUnionUnmarshall`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `ppmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `fmustalloc` : UByte) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrFixedArrayBufferSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrFixedArrayBufferSize`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrFixedArrayFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrFixedArrayFree`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrFixedArrayMarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrFixedArrayMarshall`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrFixedArrayMemorySize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrFixedArrayMemorySize`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrFixedArrayUnmarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrFixedArrayUnmarshall`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `ppmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `fmustalloc` : UByte) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrFreeBuffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrFreeBuffer`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrFullPointerXlatFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdrFullPointerXlatFree`(`pxlattables` : /* Rust *mut */ kotlinx.cinterop.CPointer<`FULL_PTR_XLAT_TABLES`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrFullPointerXlatInit; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdrFullPointerXlatInit`(`numberofpointers` : UInt, `xlatside` : `XLAT_SIDE`) : /* Rust *mut */ kotlinx.cinterop.CPointer<`FULL_PTR_XLAT_TABLES`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrGetBuffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrGetBuffer`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `bufferlength` : UInt, `handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrGetDcomProtocolVersion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrGetDcomProtocolVersion`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pversion` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_VERSION`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrGetUserMarshalInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrGetUserMarshalInfo`(`pflags` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `informationlevel` : UInt, `pmarshalinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`NDR_USER_MARSHAL_INFO`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrInterfacePointerBufferSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrInterfacePointerBufferSize`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrInterfacePointerFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrInterfacePointerFree`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrInterfacePointerMarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrInterfacePointerMarshall`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrInterfacePointerMemorySize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrInterfacePointerMemorySize`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrInterfacePointerUnmarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrInterfacePointerUnmarshall`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `ppmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `fmustalloc` : UByte) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrMapCommAndFaultStatus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrMapCommAndFaultStatus`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pcommstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pfaultstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `status` : `RPC_STATUS`) : `RPC_STATUS`
// UNSUPPORTED Rust 263:1: attribute cfg requires explicit semantics/configuration; syntax: foreign signature shape unsupported
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "C" fn NdrMesProcEncodeDecode(handle : *mut core::ffi::c_void, pstubdesc : *const MIDL_STUB_DESC, pformatstring : *mut u8, ...));

// UNSUPPORTED Rust 265:1: attribute cfg requires explicit semantics/configuration; syntax: foreign signature shape unsupported
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "C" fn NdrMesProcEncodeDecode2(handle : *mut core::ffi::c_void, pstubdesc : *const MIDL_STUB_DESC, pformatstring : *mut u8, ...) -> CLIENT_CALL_RETURN);

// UNSUPPORTED Rust 267:1: attribute cfg requires explicit semantics/configuration; syntax: foreign signature shape unsupported
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("rpcrt4.dll" "C" fn NdrMesProcEncodeDecode3(handle : *mut core::ffi::c_void, pproxyinfo : *const MIDL_STUBLESS_PROXY_INFO, nprocnum : u32, preturnvalue : *mut core::ffi::c_void, ...) -> CLIENT_CALL_RETURN);

// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrMesSimpleTypeAlignSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdrMesSimpleTypeAlignSize`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrMesSimpleTypeAlignSizeAll; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrMesSimpleTypeAlignSizeAll`(`handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pproxyinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIDL_STUBLESS_PROXY_INFO`>?) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrMesSimpleTypeDecode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdrMesSimpleTypeDecode`(`handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `size` : Short)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrMesSimpleTypeDecodeAll; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrMesSimpleTypeDecodeAll`(`handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pproxyinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIDL_STUBLESS_PROXY_INFO`>?, `pobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `size` : Short)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrMesSimpleTypeEncode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrMesSimpleTypeEncode`(`handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pstubdesc` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIDL_STUB_DESC`>?, `pobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `size` : Short)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrMesSimpleTypeEncodeAll; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrMesSimpleTypeEncodeAll`(`handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pproxyinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIDL_STUBLESS_PROXY_INFO`>?, `pobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `size` : Short)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrMesTypeAlignSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrMesTypeAlignSize`(`handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pstubdesc` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIDL_STUB_DESC`>?, `pformatstring` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrMesTypeAlignSize2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrMesTypeAlignSize2`(`handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppicklinginfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIDL_TYPE_PICKLING_INFO`>?, `pstubdesc` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIDL_STUB_DESC`>?, `pformatstring` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrMesTypeAlignSize3; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrMesTypeAlignSize3`(`handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppicklinginfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIDL_TYPE_PICKLING_INFO`>?, `pproxyinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIDL_STUBLESS_PROXY_INFO`>?, `arrtypeoffset` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UIntVar>>?, `ntypeindex` : UInt, `pobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrMesTypeDecode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrMesTypeDecode`(`handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pstubdesc` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIDL_STUB_DESC`>?, `pformatstring` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrMesTypeDecode2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrMesTypeDecode2`(`handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppicklinginfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIDL_TYPE_PICKLING_INFO`>?, `pstubdesc` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIDL_STUB_DESC`>?, `pformatstring` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrMesTypeDecode3; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrMesTypeDecode3`(`handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppicklinginfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIDL_TYPE_PICKLING_INFO`>?, `pproxyinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIDL_STUBLESS_PROXY_INFO`>?, `arrtypeoffset` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UIntVar>>?, `ntypeindex` : UInt, `pobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrMesTypeEncode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrMesTypeEncode`(`handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pstubdesc` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIDL_STUB_DESC`>?, `pformatstring` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrMesTypeEncode2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrMesTypeEncode2`(`handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppicklinginfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIDL_TYPE_PICKLING_INFO`>?, `pstubdesc` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIDL_STUB_DESC`>?, `pformatstring` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrMesTypeEncode3; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrMesTypeEncode3`(`handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppicklinginfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIDL_TYPE_PICKLING_INFO`>?, `pproxyinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIDL_STUBLESS_PROXY_INFO`>?, `arrtypeoffset` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UIntVar>>?, `ntypeindex` : UInt, `pobject` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrMesTypeFree2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrMesTypeFree2`(`handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppicklinginfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIDL_TYPE_PICKLING_INFO`>?, `pstubdesc` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIDL_STUB_DESC`>?, `pformatstring` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrMesTypeFree3; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrMesTypeFree3`(`handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppicklinginfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIDL_TYPE_PICKLING_INFO`>?, `pproxyinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIDL_STUBLESS_PROXY_INFO`>?, `arrtypeoffset` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UIntVar>>?, `ntypeindex` : UInt, `pobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrNonConformantStringBufferSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrNonConformantStringBufferSize`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrNonConformantStringMarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrNonConformantStringMarshall`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrNonConformantStringMemorySize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrNonConformantStringMemorySize`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrNonConformantStringUnmarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrNonConformantStringUnmarshall`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `ppmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `fmustalloc` : UByte) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrNonEncapsulatedUnionBufferSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrNonEncapsulatedUnionBufferSize`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrNonEncapsulatedUnionFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrNonEncapsulatedUnionFree`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrNonEncapsulatedUnionMarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrNonEncapsulatedUnionMarshall`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrNonEncapsulatedUnionMemorySize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrNonEncapsulatedUnionMemorySize`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrNonEncapsulatedUnionUnmarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrNonEncapsulatedUnionUnmarshall`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `ppmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `fmustalloc` : UByte) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrNsGetBuffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrNsGetBuffer`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `bufferlength` : UInt, `handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrNsSendReceive; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrNsSendReceive`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pbufferend` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pautohandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrOleAllocate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdrOleAllocate`(`size` : ULong) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrOleFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdrOleFree`(`nodetofree` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrPartialIgnoreClientBufferSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrPartialIgnoreClientBufferSize`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrPartialIgnoreClientMarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrPartialIgnoreClientMarshall`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrPartialIgnoreServerInitialize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrPartialIgnoreServerInitialize`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `ppmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrPartialIgnoreServerUnmarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrPartialIgnoreServerUnmarshall`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `ppmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrPointerBufferSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrPointerBufferSize`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrPointerFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrPointerFree`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrPointerMarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrPointerMarshall`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrPointerMemorySize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrPointerMemorySize`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrPointerUnmarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrPointerUnmarshall`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `ppmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `fmustalloc` : UByte) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrRangeUnmarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrRangeUnmarshall`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `ppmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `fmustalloc` : UByte) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrRpcSmClientAllocate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdrRpcSmClientAllocate`(`size` : ULong) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrRpcSmClientFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdrRpcSmClientFree`(`nodetofree` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrRpcSmSetClientToOsf; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrRpcSmSetClientToOsf`(`pmessage` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrRpcSsDefaultAllocate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdrRpcSsDefaultAllocate`(`size` : ULong) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrRpcSsDefaultFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdrRpcSsDefaultFree`(`nodetofree` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrRpcSsDisableAllocate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrRpcSsDisableAllocate`(`pmessage` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrRpcSsEnableAllocate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrRpcSsEnableAllocate`(`pmessage` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrSendReceive; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrSendReceive`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pbufferend` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrServerCall2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdrServerCall2`(`prpcmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_MESSAGE`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrServerCallAll; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdrServerCallAll`(`prpcmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_MESSAGE`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrServerCallNdr64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdrServerCallNdr64`(`prpcmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_MESSAGE`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrServerContextMarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrServerContextMarshall`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `contexthandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`NDR_SCONTEXT`>?, `rundownroutine` : `NDR_RUNDOWN`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrServerContextNewMarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrServerContextNewMarshall`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `contexthandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`NDR_SCONTEXT`>?, `rundownroutine` : `NDR_RUNDOWN`, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrServerContextNewUnmarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrServerContextNewUnmarshall`(`pstubmsg` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pformat` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`NDR_SCONTEXT`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrServerContextUnmarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrServerContextUnmarshall`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`NDR_SCONTEXT`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrServerInitialize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrServerInitialize`(`prpcmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_MESSAGE`>?, `pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pstubdescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_DESC`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrServerInitializeMarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrServerInitializeMarshall`(`prpcmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_MESSAGE`>?, `pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrServerInitializeNew; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrServerInitializeNew`(`prpcmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_MESSAGE`>?, `pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pstubdescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_DESC`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrServerInitializePartial; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrServerInitializePartial`(`prpcmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_MESSAGE`>?, `pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pstubdescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_DESC`>?, `requestedbuffersize` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrServerInitializeUnmarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrServerInitializeUnmarshall`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pstubdescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_DESC`>?, `prpcmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_MESSAGE`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrSimpleStructBufferSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrSimpleStructBufferSize`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrSimpleStructFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrSimpleStructFree`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrSimpleStructMarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrSimpleStructMarshall`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrSimpleStructMemorySize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrSimpleStructMemorySize`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrSimpleStructUnmarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrSimpleStructUnmarshall`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `ppmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `fmustalloc` : UByte) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrSimpleTypeMarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrSimpleTypeMarshall`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `formatchar` : UByte)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrSimpleTypeUnmarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrSimpleTypeUnmarshall`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `formatchar` : UByte)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrStubCall2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdrStubCall2`(`pthis` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pchannel` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `prpcmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_MESSAGE`>?, `pdwstubphase` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrStubCall3; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdrStubCall3`(`pthis` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pchannel` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `prpcmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_MESSAGE`>?, `pdwstubphase` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrUserMarshalBufferSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrUserMarshalBufferSize`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrUserMarshalFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrUserMarshalFree`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrUserMarshalMarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrUserMarshalMarshall`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrUserMarshalMemorySize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrUserMarshalMemorySize`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrUserMarshalSimpleTypeConvert; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdrUserMarshalSimpleTypeConvert`(`pflags` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `formatchar` : UByte) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrUserMarshalUnmarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrUserMarshalUnmarshall`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `ppmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `fmustalloc` : UByte) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrVaryingArrayBufferSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrVaryingArrayBufferSize`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrVaryingArrayFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrVaryingArrayFree`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrVaryingArrayMarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrVaryingArrayMarshall`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrVaryingArrayMemorySize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrVaryingArrayMemorySize`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrVaryingArrayUnmarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrVaryingArrayUnmarshall`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `ppmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `fmustalloc` : UByte) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrXmitOrRepAsBufferSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrXmitOrRepAsBufferSize`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrXmitOrRepAsFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrXmitOrRepAsFree`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrXmitOrRepAsMarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrXmitOrRepAsMarshall`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrXmitOrRepAsMemorySize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrXmitOrRepAsMemorySize`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=NdrXmitOrRepAsUnmarshall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `NdrXmitOrRepAsUnmarshall`(`pstubmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?, `ppmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `pformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `fmustalloc` : UByte) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcAsyncAbortCall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `RpcAsyncAbortCall`(`pasync` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_ASYNC_STATE`>?, `exceptioncode` : UInt) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcAsyncCancelCall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `RpcAsyncCancelCall`(`pasync` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_ASYNC_STATE`>?, `fabort` : `windows_sys`.`core`.`BOOL`) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcAsyncCompleteCall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `RpcAsyncCompleteCall`(`pasync` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_ASYNC_STATE`>?, `reply` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcAsyncGetCallStatus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `RpcAsyncGetCallStatus`(`pasync` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_ASYNC_STATE`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcAsyncInitializeHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `RpcAsyncInitializeHandle`(`pasync` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_ASYNC_STATE`>?, `size` : UInt) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcAsyncRegisterInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `RpcAsyncRegisterInfo`(`pasync` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_ASYNC_STATE`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcBindingBind; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `RpcBindingBind`(`pasync` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_ASYNC_STATE`>?, `binding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ifspec` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcBindingCopy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcBindingCopy`(`sourcebinding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `destinationbinding` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcBindingCreateA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `RpcBindingCreateA`(`template` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_BINDING_HANDLE_TEMPLATE_V1_A`>?, `security` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_BINDING_HANDLE_SECURITY_V1_A`>?, `options` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_BINDING_HANDLE_OPTIONS_V1`>?, `binding` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcBindingCreateW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `RpcBindingCreateW`(`template` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_BINDING_HANDLE_TEMPLATE_V1_W`>?, `security` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_BINDING_HANDLE_SECURITY_V1_W`>?, `options` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_BINDING_HANDLE_OPTIONS_V1`>?, `binding` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcBindingFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcBindingFree`(`binding` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcBindingFromStringBindingA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcBindingFromStringBindingA`(`stringbinding` : `windows_sys`.`core`.`PCSTR`, `binding` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcBindingFromStringBindingW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcBindingFromStringBindingW`(`stringbinding` : `windows_sys`.`core`.`PCWSTR`, `binding` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcBindingInqAuthClientA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcBindingInqAuthClientA`(`clientbinding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `privs` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `serverprincname` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?, `authnlevel` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `authnsvc` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `authzsvc` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcBindingInqAuthClientExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcBindingInqAuthClientExA`(`clientbinding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `privs` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `serverprincname` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?, `authnlevel` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `authnsvc` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `authzsvc` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `flags` : UInt) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcBindingInqAuthClientExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcBindingInqAuthClientExW`(`clientbinding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `privs` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `serverprincname` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `authnlevel` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `authnsvc` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `authzsvc` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `flags` : UInt) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcBindingInqAuthClientW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcBindingInqAuthClientW`(`clientbinding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `privs` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `serverprincname` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `authnlevel` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `authnsvc` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `authzsvc` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcBindingInqAuthInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcBindingInqAuthInfoA`(`binding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `serverprincname` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?, `authnlevel` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `authnsvc` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `authidentity` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `authzsvc` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcBindingInqAuthInfoExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `RpcBindingInqAuthInfoExA`(`binding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `serverprincname` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?, `authnlevel` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `authnsvc` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `authidentity` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `authzsvc` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `rpcqosversion` : UInt, `securityqos` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_SECURITY_QOS`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcBindingInqAuthInfoExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `RpcBindingInqAuthInfoExW`(`binding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `serverprincname` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `authnlevel` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `authnsvc` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `authidentity` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `authzsvc` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `rpcqosversion` : UInt, `securityqos` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_SECURITY_QOS`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcBindingInqAuthInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcBindingInqAuthInfoW`(`binding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `serverprincname` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `authnlevel` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `authnsvc` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `authidentity` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `authzsvc` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcBindingInqMaxCalls; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcBindingInqMaxCalls`(`binding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `maxcalls` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcBindingInqObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcBindingInqObject`(`binding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `objectuuid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcBindingInqOption; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcBindingInqOption`(`hbinding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `option` : UInt, `poptionvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcBindingReset; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcBindingReset`(`binding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcBindingServerFromClient; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcBindingServerFromClient`(`clientbinding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `serverbinding` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcBindingSetAuthInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcBindingSetAuthInfoA`(`binding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `serverprincname` : `windows_sys`.`core`.`PCSTR`, `authnlevel` : UInt, `authnsvc` : UInt, `authidentity` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `authzsvc` : UInt) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcBindingSetAuthInfoExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `RpcBindingSetAuthInfoExA`(`binding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `serverprincname` : `windows_sys`.`core`.`PCSTR`, `authnlevel` : UInt, `authnsvc` : UInt, `authidentity` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `authzsvc` : UInt, `securityqos` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_SECURITY_QOS`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcBindingSetAuthInfoExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `RpcBindingSetAuthInfoExW`(`binding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `serverprincname` : `windows_sys`.`core`.`PCWSTR`, `authnlevel` : UInt, `authnsvc` : UInt, `authidentity` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `authzsvc` : UInt, `securityqos` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_SECURITY_QOS`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcBindingSetAuthInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcBindingSetAuthInfoW`(`binding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `serverprincname` : `windows_sys`.`core`.`PCWSTR`, `authnlevel` : UInt, `authnsvc` : UInt, `authidentity` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `authzsvc` : UInt) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcBindingSetObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcBindingSetObject`(`binding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `objectuuid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcBindingSetOption; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcBindingSetOption`(`hbinding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `option` : UInt, `optionvalue` : ULong) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcBindingToStringBindingA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcBindingToStringBindingA`(`binding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `stringbinding` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcBindingToStringBindingW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcBindingToStringBindingW`(`binding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `stringbinding` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcBindingUnbind; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcBindingUnbind`(`binding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcBindingVectorFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcBindingVectorFree`(`bindingvector` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`RPC_BINDING_VECTOR`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcCancelThread; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcCancelThread`(`thread` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcCancelThreadEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcCancelThreadEx`(`thread` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `timeout` : Int) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcCertGeneratePrincipalNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
public external fun `RpcCertGeneratePrincipalNameA`(`context` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`Cryptography`.`CERT_CONTEXT`>?, `flags` : UInt, `pbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcCertGeneratePrincipalNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
public external fun `RpcCertGeneratePrincipalNameW`(`context` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`Cryptography`.`CERT_CONTEXT`>?, `flags` : UInt, `pbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcEpRegisterA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcEpRegisterA`(`ifspec` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bindingvector` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_BINDING_VECTOR`>?, `uuidvector` : /* Rust *const */ kotlinx.cinterop.CPointer<`UUID_VECTOR`>?, `annotation` : `windows_sys`.`core`.`PCSTR`) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcEpRegisterNoReplaceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcEpRegisterNoReplaceA`(`ifspec` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bindingvector` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_BINDING_VECTOR`>?, `uuidvector` : /* Rust *const */ kotlinx.cinterop.CPointer<`UUID_VECTOR`>?, `annotation` : `windows_sys`.`core`.`PCSTR`) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcEpRegisterNoReplaceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcEpRegisterNoReplaceW`(`ifspec` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bindingvector` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_BINDING_VECTOR`>?, `uuidvector` : /* Rust *const */ kotlinx.cinterop.CPointer<`UUID_VECTOR`>?, `annotation` : `windows_sys`.`core`.`PCWSTR`) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcEpRegisterW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcEpRegisterW`(`ifspec` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bindingvector` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_BINDING_VECTOR`>?, `uuidvector` : /* Rust *const */ kotlinx.cinterop.CPointer<`UUID_VECTOR`>?, `annotation` : `windows_sys`.`core`.`PCWSTR`) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcEpResolveBinding; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcEpResolveBinding`(`binding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ifspec` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcEpUnregister; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcEpUnregister`(`ifspec` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bindingvector` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_BINDING_VECTOR`>?, `uuidvector` : /* Rust *const */ kotlinx.cinterop.CPointer<`UUID_VECTOR`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcErrorAddRecord; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcErrorAddRecord`(`errorinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_EXTENDED_ERROR_INFO`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcErrorClearInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcErrorClearInformation`()
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcErrorEndEnumeration; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcErrorEndEnumeration`(`enumhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_ERROR_ENUM_HANDLE`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcErrorGetNextRecord; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcErrorGetNextRecord`(`enumhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_ERROR_ENUM_HANDLE`>?, `copystrings` : `windows_sys`.`core`.`BOOL`, `errorinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_EXTENDED_ERROR_INFO`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcErrorGetNumberOfRecords; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcErrorGetNumberOfRecords`(`enumhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_ERROR_ENUM_HANDLE`>?, `records` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcErrorLoadErrorInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcErrorLoadErrorInfo`(`errorblob` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `blobsize` : ULong, `enumhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_ERROR_ENUM_HANDLE`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcErrorResetEnumeration; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcErrorResetEnumeration`(`enumhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_ERROR_ENUM_HANDLE`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcErrorSaveErrorInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcErrorSaveErrorInfo`(`enumhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_ERROR_ENUM_HANDLE`>?, `errorblob` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `blobsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcErrorStartEnumeration; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcErrorStartEnumeration`(`enumhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_ERROR_ENUM_HANDLE`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcExceptionFilter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcExceptionFilter`(`exceptioncode` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcFreeAuthorizationContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcFreeAuthorizationContext`(`pauthzclientcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcGetAuthorizationContextForClient; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcGetAuthorizationContextForClient`(`clientbinding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `impersonateonreturn` : `windows_sys`.`core`.`BOOL`, `reserved1` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pexpirationtime` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `reserved2` : `super`.`super`.`Foundation`.`LUID`, `reserved3` : UInt, `reserved4` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pauthzclientcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcIfIdVectorFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcIfIdVectorFree`(`ifidvector` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`RPC_IF_ID_VECTOR`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcIfInqId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcIfInqId`(`rpcifhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `rpcifid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_IF_ID`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcImpersonateClient; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcImpersonateClient`(`bindinghandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcImpersonateClient2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcImpersonateClient2`(`bindinghandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcImpersonateClientContainer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcImpersonateClientContainer`(`bindinghandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcMgmtEnableIdleCleanup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcMgmtEnableIdleCleanup`() : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcMgmtEpEltInqBegin; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcMgmtEpEltInqBegin`(`epbinding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `inquirytype` : UInt, `ifid` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_IF_ID`>?, `versoption` : UInt, `objectuuid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `inquirycontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcMgmtEpEltInqDone; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcMgmtEpEltInqDone`(`inquirycontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcMgmtEpEltInqNextA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcMgmtEpEltInqNextA`(`inquirycontext` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `ifid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_IF_ID`>?, `binding` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `objectuuid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `annotation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcMgmtEpEltInqNextW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcMgmtEpEltInqNextW`(`inquirycontext` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `ifid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_IF_ID`>?, `binding` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `objectuuid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `annotation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcMgmtEpUnregister; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcMgmtEpUnregister`(`epbinding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ifid` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_IF_ID`>?, `binding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `objectuuid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcMgmtInqComTimeout; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcMgmtInqComTimeout`(`binding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `timeout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcMgmtInqDefaultProtectLevel; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcMgmtInqDefaultProtectLevel`(`authnsvc` : UInt, `authnlevel` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcMgmtInqIfIds; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcMgmtInqIfIds`(`binding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ifidvector` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`RPC_IF_ID_VECTOR`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcMgmtInqServerPrincNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcMgmtInqServerPrincNameA`(`binding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `authnsvc` : UInt, `serverprincname` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcMgmtInqServerPrincNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcMgmtInqServerPrincNameW`(`binding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `authnsvc` : UInt, `serverprincname` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcMgmtInqStats; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcMgmtInqStats`(`binding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `statistics` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`RPC_STATS_VECTOR`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcMgmtIsServerListening; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcMgmtIsServerListening`(`binding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcMgmtSetAuthorizationFn; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcMgmtSetAuthorizationFn`(`authorizationfn` : `RPC_MGMT_AUTHORIZATION_FN`) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcMgmtSetCancelTimeout; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcMgmtSetCancelTimeout`(`timeout` : Int) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcMgmtSetComTimeout; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcMgmtSetComTimeout`(`binding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `timeout` : UInt) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcMgmtSetServerStackSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcMgmtSetServerStackSize`(`threadstacksize` : UInt) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcMgmtStatsVectorFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcMgmtStatsVectorFree`(`statsvector` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`RPC_STATS_VECTOR`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcMgmtStopServerListening; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcMgmtStopServerListening`(`binding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcMgmtWaitServerListen; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcMgmtWaitServerListen`() : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcNetworkInqProtseqsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNetworkInqProtseqsA`(`protseqvector` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`RPC_PROTSEQ_VECTORA`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcNetworkInqProtseqsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNetworkInqProtseqsW`(`protseqvector` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`RPC_PROTSEQ_VECTORW`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcNetworkIsProtseqValidA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNetworkIsProtseqValidA`(`protseq` : `windows_sys`.`core`.`PCSTR`) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcNetworkIsProtseqValidW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNetworkIsProtseqValidW`(`protseq` : `windows_sys`.`core`.`PCWSTR`) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsBindingExportA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsBindingExportA`(`entrynamesyntax` : UInt, `entryname` : `windows_sys`.`core`.`PCSTR`, `ifspec` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bindingvec` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_BINDING_VECTOR`>?, `objectuuidvec` : /* Rust *const */ kotlinx.cinterop.CPointer<`UUID_VECTOR`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsBindingExportPnPA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsBindingExportPnPA`(`entrynamesyntax` : UInt, `entryname` : `windows_sys`.`core`.`PCSTR`, `ifspec` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `objectvector` : /* Rust *const */ kotlinx.cinterop.CPointer<`UUID_VECTOR`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsBindingExportPnPW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsBindingExportPnPW`(`entrynamesyntax` : UInt, `entryname` : `windows_sys`.`core`.`PCWSTR`, `ifspec` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `objectvector` : /* Rust *const */ kotlinx.cinterop.CPointer<`UUID_VECTOR`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsBindingExportW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsBindingExportW`(`entrynamesyntax` : UInt, `entryname` : `windows_sys`.`core`.`PCWSTR`, `ifspec` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bindingvec` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_BINDING_VECTOR`>?, `objectuuidvec` : /* Rust *const */ kotlinx.cinterop.CPointer<`UUID_VECTOR`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsBindingImportBeginA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsBindingImportBeginA`(`entrynamesyntax` : UInt, `entryname` : `windows_sys`.`core`.`PCSTR`, `ifspec` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `objuuid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `importcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsBindingImportBeginW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsBindingImportBeginW`(`entrynamesyntax` : UInt, `entryname` : `windows_sys`.`core`.`PCWSTR`, `ifspec` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `objuuid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `importcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsBindingImportDone; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsBindingImportDone`(`importcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsBindingImportNext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsBindingImportNext`(`importcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `binding` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcNsBindingInqEntryNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsBindingInqEntryNameA`(`binding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `entrynamesyntax` : UInt, `entryname` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcNsBindingInqEntryNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsBindingInqEntryNameW`(`binding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `entrynamesyntax` : UInt, `entryname` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsBindingLookupBeginA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsBindingLookupBeginA`(`entrynamesyntax` : UInt, `entryname` : `windows_sys`.`core`.`PCSTR`, `ifspec` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `objuuid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `bindingmaxcount` : UInt, `lookupcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsBindingLookupBeginW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsBindingLookupBeginW`(`entrynamesyntax` : UInt, `entryname` : `windows_sys`.`core`.`PCWSTR`, `ifspec` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `objuuid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `bindingmaxcount` : UInt, `lookupcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsBindingLookupDone; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsBindingLookupDone`(`lookupcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsBindingLookupNext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsBindingLookupNext`(`lookupcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bindingvec` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`RPC_BINDING_VECTOR`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsBindingSelect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsBindingSelect`(`bindingvec` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_BINDING_VECTOR`>?, `binding` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsBindingUnexportA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsBindingUnexportA`(`entrynamesyntax` : UInt, `entryname` : `windows_sys`.`core`.`PCSTR`, `ifspec` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `objectuuidvec` : /* Rust *const */ kotlinx.cinterop.CPointer<`UUID_VECTOR`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsBindingUnexportPnPA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsBindingUnexportPnPA`(`entrynamesyntax` : UInt, `entryname` : `windows_sys`.`core`.`PCSTR`, `ifspec` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `objectvector` : /* Rust *const */ kotlinx.cinterop.CPointer<`UUID_VECTOR`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsBindingUnexportPnPW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsBindingUnexportPnPW`(`entrynamesyntax` : UInt, `entryname` : `windows_sys`.`core`.`PCWSTR`, `ifspec` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `objectvector` : /* Rust *const */ kotlinx.cinterop.CPointer<`UUID_VECTOR`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsBindingUnexportW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsBindingUnexportW`(`entrynamesyntax` : UInt, `entryname` : `windows_sys`.`core`.`PCWSTR`, `ifspec` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `objectuuidvec` : /* Rust *const */ kotlinx.cinterop.CPointer<`UUID_VECTOR`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsEntryExpandNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsEntryExpandNameA`(`entrynamesyntax` : UInt, `entryname` : `windows_sys`.`core`.`PCSTR`, `expandedname` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsEntryExpandNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsEntryExpandNameW`(`entrynamesyntax` : UInt, `entryname` : `windows_sys`.`core`.`PCWSTR`, `expandedname` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsEntryObjectInqBeginA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsEntryObjectInqBeginA`(`entrynamesyntax` : UInt, `entryname` : `windows_sys`.`core`.`PCSTR`, `inquirycontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsEntryObjectInqBeginW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsEntryObjectInqBeginW`(`entrynamesyntax` : UInt, `entryname` : `windows_sys`.`core`.`PCWSTR`, `inquirycontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsEntryObjectInqDone; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsEntryObjectInqDone`(`inquirycontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsEntryObjectInqNext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsEntryObjectInqNext`(`inquirycontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `objuuid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsGroupDeleteA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsGroupDeleteA`(`groupnamesyntax` : `GROUP_NAME_SYNTAX`, `groupname` : `windows_sys`.`core`.`PCSTR`) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsGroupDeleteW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsGroupDeleteW`(`groupnamesyntax` : `GROUP_NAME_SYNTAX`, `groupname` : `windows_sys`.`core`.`PCWSTR`) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsGroupMbrAddA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsGroupMbrAddA`(`groupnamesyntax` : UInt, `groupname` : `windows_sys`.`core`.`PCSTR`, `membernamesyntax` : UInt, `membername` : `windows_sys`.`core`.`PCSTR`) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsGroupMbrAddW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsGroupMbrAddW`(`groupnamesyntax` : UInt, `groupname` : `windows_sys`.`core`.`PCWSTR`, `membernamesyntax` : UInt, `membername` : `windows_sys`.`core`.`PCWSTR`) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsGroupMbrInqBeginA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsGroupMbrInqBeginA`(`groupnamesyntax` : UInt, `groupname` : `windows_sys`.`core`.`PCSTR`, `membernamesyntax` : UInt, `inquirycontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsGroupMbrInqBeginW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsGroupMbrInqBeginW`(`groupnamesyntax` : UInt, `groupname` : `windows_sys`.`core`.`PCWSTR`, `membernamesyntax` : UInt, `inquirycontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsGroupMbrInqDone; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsGroupMbrInqDone`(`inquirycontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsGroupMbrInqNextA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsGroupMbrInqNextA`(`inquirycontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `membername` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsGroupMbrInqNextW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsGroupMbrInqNextW`(`inquirycontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `membername` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsGroupMbrRemoveA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsGroupMbrRemoveA`(`groupnamesyntax` : UInt, `groupname` : `windows_sys`.`core`.`PCSTR`, `membernamesyntax` : UInt, `membername` : `windows_sys`.`core`.`PCSTR`) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsGroupMbrRemoveW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsGroupMbrRemoveW`(`groupnamesyntax` : UInt, `groupname` : `windows_sys`.`core`.`PCWSTR`, `membernamesyntax` : UInt, `membername` : `windows_sys`.`core`.`PCWSTR`) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsMgmtBindingUnexportA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsMgmtBindingUnexportA`(`entrynamesyntax` : UInt, `entryname` : `windows_sys`.`core`.`PCSTR`, `ifid` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_IF_ID`>?, `versoption` : UInt, `objectuuidvec` : /* Rust *const */ kotlinx.cinterop.CPointer<`UUID_VECTOR`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsMgmtBindingUnexportW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsMgmtBindingUnexportW`(`entrynamesyntax` : UInt, `entryname` : `windows_sys`.`core`.`PCWSTR`, `ifid` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_IF_ID`>?, `versoption` : UInt, `objectuuidvec` : /* Rust *const */ kotlinx.cinterop.CPointer<`UUID_VECTOR`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsMgmtEntryCreateA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsMgmtEntryCreateA`(`entrynamesyntax` : UInt, `entryname` : `windows_sys`.`core`.`PCSTR`) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsMgmtEntryCreateW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsMgmtEntryCreateW`(`entrynamesyntax` : UInt, `entryname` : `windows_sys`.`core`.`PCWSTR`) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsMgmtEntryDeleteA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsMgmtEntryDeleteA`(`entrynamesyntax` : UInt, `entryname` : `windows_sys`.`core`.`PCSTR`) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsMgmtEntryDeleteW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsMgmtEntryDeleteW`(`entrynamesyntax` : UInt, `entryname` : `windows_sys`.`core`.`PCWSTR`) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsMgmtEntryInqIfIdsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsMgmtEntryInqIfIdsA`(`entrynamesyntax` : UInt, `entryname` : `windows_sys`.`core`.`PCSTR`, `ifidvec` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`RPC_IF_ID_VECTOR`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsMgmtEntryInqIfIdsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsMgmtEntryInqIfIdsW`(`entrynamesyntax` : UInt, `entryname` : `windows_sys`.`core`.`PCWSTR`, `ifidvec` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`RPC_IF_ID_VECTOR`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsMgmtHandleSetExpAge; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsMgmtHandleSetExpAge`(`nshandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `expirationage` : UInt) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsMgmtInqExpAge; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsMgmtInqExpAge`(`expirationage` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsMgmtSetExpAge; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsMgmtSetExpAge`(`expirationage` : UInt) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsProfileDeleteA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsProfileDeleteA`(`profilenamesyntax` : UInt, `profilename` : `windows_sys`.`core`.`PCSTR`) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsProfileDeleteW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsProfileDeleteW`(`profilenamesyntax` : UInt, `profilename` : `windows_sys`.`core`.`PCWSTR`) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsProfileEltAddA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsProfileEltAddA`(`profilenamesyntax` : UInt, `profilename` : `windows_sys`.`core`.`PCSTR`, `ifid` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_IF_ID`>?, `membernamesyntax` : UInt, `membername` : `windows_sys`.`core`.`PCSTR`, `priority` : UInt, `annotation` : `windows_sys`.`core`.`PCSTR`) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsProfileEltAddW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsProfileEltAddW`(`profilenamesyntax` : UInt, `profilename` : `windows_sys`.`core`.`PCWSTR`, `ifid` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_IF_ID`>?, `membernamesyntax` : UInt, `membername` : `windows_sys`.`core`.`PCWSTR`, `priority` : UInt, `annotation` : `windows_sys`.`core`.`PCWSTR`) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsProfileEltInqBeginA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsProfileEltInqBeginA`(`profilenamesyntax` : UInt, `profilename` : `windows_sys`.`core`.`PCSTR`, `inquirytype` : UInt, `ifid` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_IF_ID`>?, `versoption` : UInt, `membernamesyntax` : UInt, `membername` : `windows_sys`.`core`.`PCSTR`, `inquirycontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsProfileEltInqBeginW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsProfileEltInqBeginW`(`profilenamesyntax` : UInt, `profilename` : `windows_sys`.`core`.`PCWSTR`, `inquirytype` : UInt, `ifid` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_IF_ID`>?, `versoption` : UInt, `membernamesyntax` : UInt, `membername` : `windows_sys`.`core`.`PCWSTR`, `inquirycontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsProfileEltInqDone; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsProfileEltInqDone`(`inquirycontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsProfileEltInqNextA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsProfileEltInqNextA`(`inquirycontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ifid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_IF_ID`>?, `membername` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?, `priority` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `annotation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsProfileEltInqNextW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsProfileEltInqNextW`(`inquirycontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ifid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_IF_ID`>?, `membername` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `priority` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `annotation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsProfileEltRemoveA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsProfileEltRemoveA`(`profilenamesyntax` : UInt, `profilename` : `windows_sys`.`core`.`PCSTR`, `ifid` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_IF_ID`>?, `membernamesyntax` : UInt, `membername` : `windows_sys`.`core`.`PCSTR`) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcns4.dll, ABI=system, export=RpcNsProfileEltRemoveW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcNsProfileEltRemoveW`(`profilenamesyntax` : UInt, `profilename` : `windows_sys`.`core`.`PCWSTR`, `ifid` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_IF_ID`>?, `membernamesyntax` : UInt, `membername` : `windows_sys`.`core`.`PCWSTR`) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcObjectInqType; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcObjectInqType`(`objuuid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `typeuuid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcObjectSetInqFn; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcObjectSetInqFn`(`inquiryfn` : `RPC_OBJECT_INQ_FN`) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcObjectSetType; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcObjectSetType`(`objuuid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `typeuuid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcProtseqVectorFreeA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcProtseqVectorFreeA`(`protseqvector` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`RPC_PROTSEQ_VECTORA`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcProtseqVectorFreeW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcProtseqVectorFreeW`(`protseqvector` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`RPC_PROTSEQ_VECTORW`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcRaiseException; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcRaiseException`(`exception` : `RPC_STATUS`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcRevertContainerImpersonation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcRevertContainerImpersonation`() : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcRevertToSelf; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcRevertToSelf`() : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcRevertToSelfEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcRevertToSelfEx`(`bindinghandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcServerCompleteSecurityCallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcServerCompleteSecurityCallback`(`bindinghandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `status` : `RPC_STATUS`) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcServerInqBindingHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcServerInqBindingHandle`(`binding` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcServerInqBindings; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcServerInqBindings`(`bindingvector` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`RPC_BINDING_VECTOR`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcServerInqBindingsEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcServerInqBindingsEx`(`securitydescriptor` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bindingvector` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`RPC_BINDING_VECTOR`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcServerInqCallAttributesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcServerInqCallAttributesA`(`clientbinding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `rpccallattributes` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcServerInqCallAttributesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcServerInqCallAttributesW`(`clientbinding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `rpccallattributes` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcServerInqDefaultPrincNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcServerInqDefaultPrincNameA`(`authnsvc` : UInt, `princname` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcServerInqDefaultPrincNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcServerInqDefaultPrincNameW`(`authnsvc` : UInt, `princname` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcServerInqIf; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcServerInqIf`(`ifspec` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `mgrtypeuuid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `mgrepv` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcServerInterfaceGroupActivate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcServerInterfaceGroupActivate`(`ifgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcServerInterfaceGroupClose; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcServerInterfaceGroupClose`(`ifgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcServerInterfaceGroupCreateA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcServerInterfaceGroupCreateA`(`interfaces` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_INTERFACE_TEMPLATEA`>?, `numifs` : UInt, `endpoints` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_ENDPOINT_TEMPLATEA`>?, `numendpoints` : UInt, `idleperiod` : UInt, `idlecallbackfn` : `RPC_INTERFACE_GROUP_IDLE_CALLBACK_FN`, `idlecallbackcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ifgroup` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcServerInterfaceGroupCreateW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcServerInterfaceGroupCreateW`(`interfaces` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_INTERFACE_TEMPLATEW`>?, `numifs` : UInt, `endpoints` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_ENDPOINT_TEMPLATEW`>?, `numendpoints` : UInt, `idleperiod` : UInt, `idlecallbackfn` : `RPC_INTERFACE_GROUP_IDLE_CALLBACK_FN`, `idlecallbackcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ifgroup` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcServerInterfaceGroupDeactivate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcServerInterfaceGroupDeactivate`(`ifgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `forcedeactivation` : UInt) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcServerInterfaceGroupInqBindings; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcServerInterfaceGroupInqBindings`(`ifgroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bindingvector` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`RPC_BINDING_VECTOR`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcServerListen; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcServerListen`(`minimumcallthreads` : UInt, `maxcalls` : UInt, `dontwait` : UInt) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcServerRegisterAuthInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcServerRegisterAuthInfoA`(`serverprincname` : `windows_sys`.`core`.`PCSTR`, `authnsvc` : UInt, `getkeyfn` : `RPC_AUTH_KEY_RETRIEVAL_FN`, `arg` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcServerRegisterAuthInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcServerRegisterAuthInfoW`(`serverprincname` : `windows_sys`.`core`.`PCWSTR`, `authnsvc` : UInt, `getkeyfn` : `RPC_AUTH_KEY_RETRIEVAL_FN`, `arg` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcServerRegisterIf; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcServerRegisterIf`(`ifspec` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `mgrtypeuuid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `mgrepv` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcServerRegisterIf2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcServerRegisterIf2`(`ifspec` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `mgrtypeuuid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `mgrepv` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `flags` : UInt, `maxcalls` : UInt, `maxrpcsize` : UInt, `ifcallbackfn` : `RPC_IF_CALLBACK_FN`) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcServerRegisterIf3; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcServerRegisterIf3`(`ifspec` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `mgrtypeuuid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `mgrepv` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `flags` : UInt, `maxcalls` : UInt, `maxrpcsize` : UInt, `ifcallback` : `RPC_IF_CALLBACK_FN`, `securitydescriptor` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcServerRegisterIfEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcServerRegisterIfEx`(`ifspec` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `mgrtypeuuid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `mgrepv` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `flags` : UInt, `maxcalls` : UInt, `ifcallback` : `RPC_IF_CALLBACK_FN`) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcServerSubscribeForNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `RpcServerSubscribeForNotification`(`binding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `notification` : `RPC_NOTIFICATIONS`, `notificationtype` : `RPC_NOTIFICATION_TYPES`, `notificationinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_ASYNC_NOTIFICATION_INFO`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcServerTestCancel; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcServerTestCancel`(`bindinghandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcServerUnregisterIf; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcServerUnregisterIf`(`ifspec` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `mgrtypeuuid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `waitforcallstocomplete` : UInt) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcServerUnregisterIfEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcServerUnregisterIfEx`(`ifspec` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `mgrtypeuuid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `rundowncontexthandles` : Int) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcServerUnsubscribeForNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcServerUnsubscribeForNotification`(`binding` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `notification` : `RPC_NOTIFICATIONS`, `notificationsqueued` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcServerUseAllProtseqs; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcServerUseAllProtseqs`(`maxcalls` : UInt, `securitydescriptor` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcServerUseAllProtseqsEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcServerUseAllProtseqsEx`(`maxcalls` : UInt, `securitydescriptor` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `policy` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_POLICY`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcServerUseAllProtseqsIf; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcServerUseAllProtseqsIf`(`maxcalls` : UInt, `ifspec` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `securitydescriptor` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcServerUseAllProtseqsIfEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcServerUseAllProtseqsIfEx`(`maxcalls` : UInt, `ifspec` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `securitydescriptor` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `policy` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_POLICY`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcServerUseProtseqA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcServerUseProtseqA`(`protseq` : `windows_sys`.`core`.`PCSTR`, `maxcalls` : UInt, `securitydescriptor` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcServerUseProtseqEpA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcServerUseProtseqEpA`(`protseq` : `windows_sys`.`core`.`PCSTR`, `maxcalls` : UInt, `endpoint` : `windows_sys`.`core`.`PCSTR`, `securitydescriptor` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcServerUseProtseqEpExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcServerUseProtseqEpExA`(`protseq` : `windows_sys`.`core`.`PCSTR`, `maxcalls` : UInt, `endpoint` : `windows_sys`.`core`.`PCSTR`, `securitydescriptor` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `policy` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_POLICY`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcServerUseProtseqEpExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcServerUseProtseqEpExW`(`protseq` : `windows_sys`.`core`.`PCWSTR`, `maxcalls` : UInt, `endpoint` : `windows_sys`.`core`.`PCWSTR`, `securitydescriptor` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `policy` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_POLICY`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcServerUseProtseqEpW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcServerUseProtseqEpW`(`protseq` : `windows_sys`.`core`.`PCWSTR`, `maxcalls` : UInt, `endpoint` : `windows_sys`.`core`.`PCWSTR`, `securitydescriptor` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcServerUseProtseqExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcServerUseProtseqExA`(`protseq` : `windows_sys`.`core`.`PCSTR`, `maxcalls` : UInt, `securitydescriptor` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `policy` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_POLICY`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcServerUseProtseqExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcServerUseProtseqExW`(`protseq` : `windows_sys`.`core`.`PCWSTR`, `maxcalls` : UInt, `securitydescriptor` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `policy` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_POLICY`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcServerUseProtseqIfA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcServerUseProtseqIfA`(`protseq` : `windows_sys`.`core`.`PCSTR`, `maxcalls` : UInt, `ifspec` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `securitydescriptor` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcServerUseProtseqIfExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcServerUseProtseqIfExA`(`protseq` : `windows_sys`.`core`.`PCSTR`, `maxcalls` : UInt, `ifspec` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `securitydescriptor` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `policy` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_POLICY`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcServerUseProtseqIfExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcServerUseProtseqIfExW`(`protseq` : `windows_sys`.`core`.`PCWSTR`, `maxcalls` : UInt, `ifspec` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `securitydescriptor` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `policy` : /* Rust *const */ kotlinx.cinterop.CPointer<`RPC_POLICY`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcServerUseProtseqIfW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcServerUseProtseqIfW`(`protseq` : `windows_sys`.`core`.`PCWSTR`, `maxcalls` : UInt, `ifspec` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `securitydescriptor` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcServerUseProtseqW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcServerUseProtseqW`(`protseq` : `windows_sys`.`core`.`PCWSTR`, `maxcalls` : UInt, `securitydescriptor` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcServerYield; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcServerYield`()
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcSmAllocate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcSmAllocate`(`size` : ULong, `pstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_STATUS`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcSmClientFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcSmClientFree`(`pnodetofree` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcSmDestroyClientContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcSmDestroyClientContext`(`contexthandle` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcSmDisableAllocate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcSmDisableAllocate`() : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcSmEnableAllocate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcSmEnableAllocate`() : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcSmFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcSmFree`(`nodetofree` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcSmGetThreadHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcSmGetThreadHandle`(`pstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_STATUS`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcSmSetClientAllocFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcSmSetClientAllocFree`(`clientalloc` : `RPC_CLIENT_ALLOC`, `clientfree` : `RPC_CLIENT_FREE`) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcSmSetThreadHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcSmSetThreadHandle`(`id` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcSmSwapClientAllocFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcSmSwapClientAllocFree`(`clientalloc` : `RPC_CLIENT_ALLOC`, `clientfree` : `RPC_CLIENT_FREE`, `oldclientalloc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_CLIENT_ALLOC`>?, `oldclientfree` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_CLIENT_FREE`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcSsAllocate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcSsAllocate`(`size` : ULong) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcSsContextLockExclusive; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcSsContextLockExclusive`(`serverbindinghandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `usercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcSsContextLockShared; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcSsContextLockShared`(`serverbindinghandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `usercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcSsDestroyClientContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcSsDestroyClientContext`(`contexthandle` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcSsDisableAllocate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcSsDisableAllocate`()
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcSsDontSerializeContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcSsDontSerializeContext`()
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcSsEnableAllocate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcSsEnableAllocate`()
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcSsFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcSsFree`(`nodetofree` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcSsGetContextBinding; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcSsGetContextBinding`(`contexthandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `binding` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcSsGetThreadHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcSsGetThreadHandle`() : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcSsSetClientAllocFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcSsSetClientAllocFree`(`clientalloc` : `RPC_CLIENT_ALLOC`, `clientfree` : `RPC_CLIENT_FREE`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcSsSetThreadHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcSsSetThreadHandle`(`id` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcSsSwapClientAllocFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcSsSwapClientAllocFree`(`clientalloc` : `RPC_CLIENT_ALLOC`, `clientfree` : `RPC_CLIENT_FREE`, `oldclientalloc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_CLIENT_ALLOC`>?, `oldclientfree` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_CLIENT_FREE`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcStringBindingComposeA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcStringBindingComposeA`(`objuuid` : `windows_sys`.`core`.`PCSTR`, `protseq` : `windows_sys`.`core`.`PCSTR`, `networkaddr` : `windows_sys`.`core`.`PCSTR`, `endpoint` : `windows_sys`.`core`.`PCSTR`, `options` : `windows_sys`.`core`.`PCSTR`, `stringbinding` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcStringBindingComposeW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcStringBindingComposeW`(`objuuid` : `windows_sys`.`core`.`PCWSTR`, `protseq` : `windows_sys`.`core`.`PCWSTR`, `networkaddr` : `windows_sys`.`core`.`PCWSTR`, `endpoint` : `windows_sys`.`core`.`PCWSTR`, `options` : `windows_sys`.`core`.`PCWSTR`, `stringbinding` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcStringBindingParseA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcStringBindingParseA`(`stringbinding` : `windows_sys`.`core`.`PCSTR`, `objuuid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?, `protseq` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?, `networkaddr` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?, `endpoint` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?, `networkoptions` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcStringBindingParseW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcStringBindingParseW`(`stringbinding` : `windows_sys`.`core`.`PCWSTR`, `objuuid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `protseq` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `networkaddr` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `endpoint` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `networkoptions` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcStringFreeA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcStringFreeA`(`string` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcStringFreeW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcStringFreeW`(`string` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcTestCancel; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcTestCancel`() : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=RpcUserFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RpcUserFree`(`asynchandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=UuidCompare; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UuidCompare`(`uuid1` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `uuid2` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `status` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_STATUS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=UuidCreate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UuidCreate`(`uuid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=UuidCreateNil; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UuidCreateNil`(`niluuid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=UuidCreateSequential; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UuidCreateSequential`(`uuid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=UuidEqual; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UuidEqual`(`uuid1` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `uuid2` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `status` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_STATUS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=UuidFromStringA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UuidFromStringA`(`stringuuid` : `windows_sys`.`core`.`PCSTR`, `uuid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=UuidFromStringW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UuidFromStringW`(`stringuuid` : `windows_sys`.`core`.`PCWSTR`, `uuid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=UuidHash; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UuidHash`(`uuid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `status` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_STATUS`>?) : UShort
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=UuidIsNil; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UuidIsNil`(`uuid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `status` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_STATUS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=UuidToStringA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UuidToStringA`(`uuid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `stringuuid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcrt4.dll, ABI=system, export=UuidToStringW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UuidToStringW`(`uuid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `stringuuid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `RPC_STATUS`
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ARRAY_INFO` (
    public var `Dimension`: Int,
    public var `BufferConformanceMark`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `BufferVarianceMark`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `MaxCountArray`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `OffsetArray`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `ActualCountArray`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
)
// UNSUPPORTED Rust 691:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ARRAY_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `BinaryParam` (
    public var `Buffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Size`: Short,
)
// UNSUPPORTED Rust 702:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for BinaryParam {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 707:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CLIENT_CALL_RETURN {
//     pub Pointer: *mut core::ffi::c_void,
//     pub Simple: isize,
// }

// UNSUPPORTED Rust 713:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CLIENT_CALL_RETURN {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `COMM_FAULT_OFFSETS` (
    public var `CommOffset`: Short,
    public var `FaultOffset`: Short,
)
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CS_TAG_GETTING_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, Int, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CS_TYPE_FROM_NETCS_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CS_TYPE_LOCAL_SIZE_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`IDL_CS_CONVERT`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CS_TYPE_NET_SIZE_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`IDL_CS_CONVERT`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CS_TYPE_TO_NETCS_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> Unit>>>;
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
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public typealias `EXPR_EVAL` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?) -> Unit>>>;
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FULL_PTR_XLAT_TABLES` (
    public var `RefIdToPointer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `PointerToRefId`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `NextRefId`: UInt,
    public var `XlatSide`: `XLAT_SIDE`,
)
// UNSUPPORTED Rust 759:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FULL_PTR_XLAT_TABLES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `GENERIC_BINDING_INFO` (
    public var `pObj`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Size`: UInt,
    public var `pfnBind`: `GENERIC_BINDING_ROUTINE`,
    public var `pfnUnbind`: `GENERIC_UNBIND_ROUTINE`,
)
// UNSUPPORTED Rust 772:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for GENERIC_BINDING_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `GENERIC_BINDING_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `GENERIC_BINDING_ROUTINE_PAIR` (
    public var `pfnBind`: `GENERIC_BINDING_ROUTINE`,
    public var `pfnUnbind`: `GENERIC_UNBIND_ROUTINE`,
)
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `GENERIC_UNBIND_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) -> Unit>>>;
public typealias `GROUP_NAME_SYNTAX` = UInt;
public typealias `IDL_CS_CONVERT` = Int;
public const val `IDL_CS_IN_PLACE_CONVERT`: `IDL_CS_CONVERT` = 1;
public const val `IDL_CS_NEW_BUFFER_CONVERT`: `IDL_CS_CONVERT` = 2;
public const val `IDL_CS_NO_CONVERT`: `IDL_CS_CONVERT` = 0;
public const val `INVALID_FRAGMENT_ID`: UInt = 0u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `I_RpcFreeCalloutStateFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`RDR_CALLOUT_STATE`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `I_RpcPerformCalloutFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`RDR_CALLOUT_STATE`>?, `RPC_HTTP_REDIRECTOR_STAGE`) -> `RPC_STATUS`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `I_RpcProxyCallbackInterface` (
    public var `IsValidMachineFn`: `I_RpcProxyIsValidMachineFn`,
    public var `GetClientAddressFn`: `I_RpcProxyGetClientAddressFn`,
    public var `GetConnectionTimeoutFn`: `I_RpcProxyGetConnectionTimeoutFn`,
    public var `PerformCalloutFn`: `I_RpcPerformCalloutFn`,
    public var `FreeCalloutStateFn`: `I_RpcFreeCalloutStateFn`,
    public var `GetClientSessionAndResourceUUIDFn`: `I_RpcProxyGetClientSessionAndResourceUUID`,
    public var `ProxyFilterIfFn`: `I_RpcProxyFilterIfFn`,
    public var `RpcProxyUpdatePerfCounterFn`: `I_RpcProxyUpdatePerfCounterFn`,
    public var `RpcProxyUpdatePerfCounterBackendServerFn`: `I_RpcProxyUpdatePerfCounterBackendServerFn`,
)
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `I_RpcProxyFilterIfFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, UShort, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) -> `RPC_STATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `I_RpcProxyGetClientAddressFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `windows_sys`.`core`.`PCSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `RPC_STATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `I_RpcProxyGetClientSessionAndResourceUUID` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) -> `RPC_STATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `I_RpcProxyGetConnectionTimeoutFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `RPC_STATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `I_RpcProxyIsValidMachineFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, UInt) -> `RPC_STATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `I_RpcProxyUpdatePerfCounterBackendServerFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, Int) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `I_RpcProxyUpdatePerfCounterFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`RpcPerfCounters`, Int, UInt) -> Unit>>>;
public typealias `LRPC_SYSTEM_HANDLE_MARSHAL_DIRECTION` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MALLOC_FREE_STRUCT` (
    public var `pfnAllocate`: Long,
    public var `pfnFree`: Long,
)
public const val `MES_DECODE`: `MIDL_ES_CODE` = 1;
public const val `MES_DYNAMIC_BUFFER_HANDLE`: `MIDL_ES_HANDLE_STYLE` = 2;
public const val `MES_ENCODE`: `MIDL_ES_CODE` = 0;
public const val `MES_ENCODE_NDR64`: `MIDL_ES_CODE` = 2;
public const val `MES_FIXED_BUFFER_HANDLE`: `MIDL_ES_HANDLE_STYLE` = 1;
public const val `MES_INCREMENTAL_HANDLE`: `MIDL_ES_HANDLE_STYLE` = 0;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `MIDL_ES_ALLOC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> Unit>>>;
public typealias `MIDL_ES_CODE` = Int;
public typealias `MIDL_ES_HANDLE_STYLE` = Int;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `MIDL_ES_READ` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `MIDL_ES_WRITE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `windows_sys`.`core`.`PCSTR`, UInt) -> Unit>>>;
// UNSUPPORTED Rust 831:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIDL_FORMAT_STRING {
//     pub Pad: i16,
//     pub Format: [u8; 1],
// }

// UNSUPPORTED Rust 837:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIDL_FORMAT_STRING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIDL_INTERCEPTION_INFO` (
    public var `Version`: UInt,
    public var `ProcString`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `ProcFormatOffsetTable`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `ProcCount`: UInt,
    public var `TypeString`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 851:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIDL_INTERCEPTION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIDL_INTERFACE_METHOD_PROPERTIES` (
    public var `MethodCount`: UShort,
    public var `MethodProperties`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`MIDL_METHOD_PROPERTY_MAP`>>?,
)
// UNSUPPORTED Rust 862:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIDL_INTERFACE_METHOD_PROPERTIES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIDL_METHOD_PROPERTY` (
    public var `Id`: UInt,
    public var `Value`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIDL_METHOD_PROPERTY_MAP` (
    public var `Count`: UInt,
    public var `Properties`: /* Rust *const */ kotlinx.cinterop.CPointer<`MIDL_METHOD_PROPERTY`>?,
)
// UNSUPPORTED Rust 879:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIDL_METHOD_PROPERTY_MAP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIDL_SERVER_INFO` (
    public var `pStubDesc`: /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_DESC`>?,
    public var `DispatchTable`: /* Rust *const */ kotlinx.cinterop.CPointer<`SERVER_ROUTINE`>?,
    public var `ProcString`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `FmtStringOffset`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `ThunkTable`: /* Rust *const */ kotlinx.cinterop.CPointer<`STUB_THUNK`>?,
    public var `pTransferSyntax`: /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_SYNTAX_IDENTIFIER`>?,
    public var `nCount`: ULong,
    public var `pSyntaxInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_SYNTAX_INFO`>?,
)
// UNSUPPORTED Rust 897:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for MIDL_SERVER_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIDL_STUBLESS_PROXY_INFO` (
    public var `pStubDesc`: /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_DESC`>?,
    public var `ProcFormatString`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `FormatStringOffset`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `pTransferSyntax`: /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_SYNTAX_IDENTIFIER`>?,
    public var `nCount`: ULong,
    public var `pSyntaxInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_SYNTAX_INFO`>?,
)
// UNSUPPORTED Rust 914:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for MIDL_STUBLESS_PROXY_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIDL_STUB_DESC` (
    public var `RpcInterfaceInformation`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `pfnAllocate`: `PFN_RPC_ALLOCATE`,
    public var `pfnFree`: `PFN_RPC_FREE`,
    public var `IMPLICIT_HANDLE_INFO`: `MIDL_STUB_DESC_0`,
    public var `apfnNdrRundownRoutines`: /* Rust *const */ kotlinx.cinterop.CPointer<`NDR_RUNDOWN`>?,
    public var `aGenericBindingRoutinePairs`: /* Rust *const */ kotlinx.cinterop.CPointer<`GENERIC_BINDING_ROUTINE_PAIR`>?,
    public var `apfnExprEval`: /* Rust *const */ kotlinx.cinterop.CPointer<`EXPR_EVAL`>?,
    public var `aXmitQuintuple`: /* Rust *const */ kotlinx.cinterop.CPointer<`XMIT_ROUTINE_QUINTUPLE`>?,
    public var `pFormatTypes`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `fCheckBounds`: Int,
    public var `Version`: UInt,
    public var `pMallocFreeStruct`: /* Rust *mut */ kotlinx.cinterop.CPointer<`MALLOC_FREE_STRUCT`>?,
    public var `MIDLVersion`: Int,
    public var `CommFaultOffsets`: /* Rust *const */ kotlinx.cinterop.CPointer<`COMM_FAULT_OFFSETS`>?,
    public var `aUserMarshalQuadruple`: /* Rust *const */ kotlinx.cinterop.CPointer<`USER_MARSHAL_ROUTINE_QUADRUPLE`>?,
    public var `NotifyRoutineTable`: /* Rust *const */ kotlinx.cinterop.CPointer<`NDR_NOTIFY_ROUTINE`>?,
    public var `mFlags`: ULong,
    public var `CsRoutineTables`: /* Rust *const */ kotlinx.cinterop.CPointer<`NDR_CS_ROUTINES`>?,
    public var `ProxyServerInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `pExprInfo`: /* Rust *const */ kotlinx.cinterop.CPointer<`NDR_EXPR_DESC`>?,
)
// UNSUPPORTED Rust 945:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for MIDL_STUB_DESC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 951:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub union MIDL_STUB_DESC_0 {
//     pub pAutoHandle: *mut *mut core::ffi::c_void,
//     pub pPrimitiveHandle: *mut *mut core::ffi::c_void,
//     pub pGenericBindingInfo: *mut GENERIC_BINDING_INFO,
// }

// UNSUPPORTED Rust 959:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for MIDL_STUB_DESC_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIDL_STUB_MESSAGE` (
    public var `RpcMsg`: /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_MESSAGE`>?,
    public var `Buffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `BufferStart`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `BufferEnd`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `BufferMark`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `BufferLength`: UInt,
    public var `MemorySize`: UInt,
    public var `Memory`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `IsClient`: UByte,
    public var `Pad`: UByte,
    public var `uFlags2`: UShort,
    public var `ReuseBuffer`: Int,
    public var `pAllocAllNodesContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`NDR_ALLOC_ALL_NODES_CONTEXT`>?,
    public var `pPointerQueueState`: /* Rust *mut */ kotlinx.cinterop.CPointer<`NDR_POINTER_QUEUE_STATE`>?,
    public var `IgnoreEmbeddedPointers`: Int,
    public var `PointerBufferMark`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `CorrDespIncrement`: UByte,
    public var `uFlags`: UByte,
    public var `UniquePtrCount`: UShort,
    public var `MaxCount`: ULong,
    public var `Offset`: UInt,
    public var `ActualCount`: UInt,
    public var `pfnAllocate`: `PFN_RPC_ALLOCATE`,
    public var `pfnFree`: `PFN_RPC_FREE`,
    public var `StackTop`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `pPresentedType`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `pTransmitType`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `SavedHandle`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `StubDesc`: /* Rust *const */ kotlinx.cinterop.CPointer<`MIDL_STUB_DESC`>?,
    public var `FullPtrXlatTables`: /* Rust *mut */ kotlinx.cinterop.CPointer<`FULL_PTR_XLAT_TABLES`>?,
    public var `FullPtrRefId`: UInt,
    public var `PointerLength`: UInt,
    public var `_bitfield`: Int,
    public var `dwDestContext`: UInt,
    public var `pvDestContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `SavedContextHandles`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`NDR_SCONTEXT`>>?,
    public var `ParamNumber`: Int,
    public var `pRpcChannelBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `pArrayInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`ARRAY_INFO`>?,
    public var `SizePtrCountArray`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `SizePtrOffsetArray`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `SizePtrLengthArray`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `pArgQueue`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `dwStubPhase`: UInt,
    public var `LowStackMark`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `pAsyncMsg`: `PNDR_ASYNC_MESSAGE`,
    public var `pCorrInfo`: `PNDR_CORRELATION_INFO`,
    public var `pCorrMemory`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `pMemoryList`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `pCSInfo`: Long,
    public var `ConformanceMark`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `VarianceMark`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `Unused`: Long,
    public var `pContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`_NDR_PROC_CONTEXT`>?,
    public var `ContextHandleHash`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `pUserMarshalList`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Reserved51_3`: Long,
    public var `Reserved51_4`: Long,
    public var `Reserved51_5`: Long,
)
// UNSUPPORTED Rust 1029:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for MIDL_STUB_MESSAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIDL_SYNTAX_INFO` (
    public var `TransferSyntax`: `RPC_SYNTAX_IDENTIFIER`,
    public var `DispatchTable`: /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_DISPATCH_TABLE`>?,
    public var `ProcString`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `FmtStringOffset`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `TypeString`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `aUserMarshalQuadruple`: /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `pMethodProperties`: /* Rust *const */ kotlinx.cinterop.CPointer<`MIDL_INTERFACE_METHOD_PROPERTIES`>?,
    public var `pReserved2`: ULong,
)
// UNSUPPORTED Rust 1047:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIDL_SYNTAX_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1052:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIDL_TYPE_PICKLING_INFO {
//     pub Version: u32,
//     pub Flags: u32,
//     pub Reserved: [usize; 3],
// }

// UNSUPPORTED Rust 1059:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIDL_TYPE_PICKLING_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIDL_WINRT_TYPE_SERIALIZATION_INFO` (
    public var `Version`: UInt,
    public var `TypeFormatString`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `FormatStringSize`: UShort,
    public var `TypeOffset`: UShort,
    public var `StubDesc`: /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_DESC`>?,
)
// UNSUPPORTED Rust 1074:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDR64_ARRAY_ELEMENT_INFO` (
    public var `ElementMemSize`: UInt,
    public var `Element`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1092:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDR64_ARRAY_ELEMENT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDR64_ARRAY_FLAGS` (
    public var `_bitfield`: UByte,
)
// UNSUPPORTED Rust 1102:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NDR64_BINDINGS {
//     pub Primitive: NDR64_BIND_PRIMITIVE,
//     pub Generic: NDR64_BIND_GENERIC,
//     pub Context: NDR64_BIND_CONTEXT,
// }

// UNSUPPORTED Rust 1109:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDR64_BINDINGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDR64_BIND_AND_NOTIFY_EXTENSION` (
    public var `Binding`: `NDR64_BIND_CONTEXT`,
    public var `NotifyIndex`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDR64_BIND_CONTEXT` (
    public var `HandleType`: UByte,
    public var `Flags`: UByte,
    public var `StackOffset`: UShort,
    public var `RoutineIndex`: UByte,
    public var `Ordinal`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDR64_BIND_GENERIC` (
    public var `HandleType`: UByte,
    public var `Flags`: UByte,
    public var `StackOffset`: UShort,
    public var `RoutineIndex`: UByte,
    public var `Size`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDR64_BIND_PRIMITIVE` (
    public var `HandleType`: UByte,
    public var `Flags`: UByte,
    public var `StackOffset`: UShort,
    public var `Reserved`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDR64_BOGUS_ARRAY_HEADER_FORMAT` (
    public var `FormatCode`: UByte,
    public var `Alignment`: UByte,
    public var `Flags`: `NDR64_ARRAY_FLAGS`,
    public var `NumberDims`: UByte,
    public var `NumberElements`: UInt,
    public var `Element`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1156:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDR64_BOGUS_ARRAY_HEADER_FORMAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDR64_BOGUS_STRUCTURE_HEADER_FORMAT` (
    public var `FormatCode`: UByte,
    public var `Alignment`: UByte,
    public var `Flags`: `NDR64_STRUCTURE_FLAGS`,
    public var `Reserve`: UByte,
    public var `MemorySize`: UInt,
    public var `OriginalMemberLayout`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `OriginalPointerLayout`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `PointerLayout`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1173:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDR64_BOGUS_STRUCTURE_HEADER_FORMAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDR64_BUFFER_ALIGN_FORMAT` (
    public var `FormatCode`: UByte,
    public var `Alignment`: UByte,
    public var `Reserved`: UShort,
    public var `Reserved2`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDR64_CONFORMANT_STRING_FORMAT` (
    public var `Header`: `NDR64_STRING_HEADER_FORMAT`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDR64_CONF_ARRAY_HEADER_FORMAT` (
    public var `FormatCode`: UByte,
    public var `Alignment`: UByte,
    public var `Flags`: `NDR64_ARRAY_FLAGS`,
    public var `Reserved`: UByte,
    public var `ElementSize`: UInt,
    public var `ConfDescriptor`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1201:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDR64_CONF_ARRAY_HEADER_FORMAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDR64_CONF_BOGUS_STRUCTURE_HEADER_FORMAT` (
    public var `FormatCode`: UByte,
    public var `Alignment`: UByte,
    public var `Flags`: `NDR64_STRUCTURE_FLAGS`,
    public var `Dimensions`: UByte,
    public var `MemorySize`: UInt,
    public var `OriginalMemberLayout`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `OriginalPointerLayout`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `PointerLayout`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ConfArrayDescription`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1219:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDR64_CONF_BOGUS_STRUCTURE_HEADER_FORMAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDR64_CONF_STRUCTURE_HEADER_FORMAT` (
    public var `FormatCode`: UByte,
    public var `Alignment`: UByte,
    public var `Flags`: `NDR64_STRUCTURE_FLAGS`,
    public var `Reserve`: UByte,
    public var `MemorySize`: UInt,
    public var `ArrayDescription`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1234:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDR64_CONF_STRUCTURE_HEADER_FORMAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDR64_CONF_VAR_ARRAY_HEADER_FORMAT` (
    public var `FormatCode`: UByte,
    public var `Alignment`: UByte,
    public var `Flags`: `NDR64_ARRAY_FLAGS`,
    public var `Reserved`: UByte,
    public var `ElementSize`: UInt,
    public var `ConfDescriptor`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `VarDescriptor`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1250:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDR64_CONF_VAR_ARRAY_HEADER_FORMAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDR64_CONF_VAR_BOGUS_ARRAY_HEADER_FORMAT` (
    public var `FixedArrayFormat`: `NDR64_BOGUS_ARRAY_HEADER_FORMAT`,
    public var `ConfDescription`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `VarDescription`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `OffsetDescription`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1263:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDR64_CONF_VAR_BOGUS_ARRAY_HEADER_FORMAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDR64_CONSTANT_IID_FORMAT` (
    public var `FormatCode`: UByte,
    public var `Flags`: UByte,
    public var `Reserved`: UShort,
    public var `Guid`: `windows_sys`.`core`.`GUID`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDR64_CONTEXT_HANDLE_FLAGS` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDR64_CONTEXT_HANDLE_FORMAT` (
    public var `FormatCode`: UByte,
    public var `ContextFlags`: UByte,
    public var `RundownRoutineIndex`: UByte,
    public var `Ordinal`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDR64_EMBEDDED_COMPLEX_FORMAT` (
    public var `FormatCode`: UByte,
    public var `Reserve1`: UByte,
    public var `Reserve2`: UShort,
    public var `Type`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1297:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDR64_EMBEDDED_COMPLEX_FORMAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDR64_ENCAPSULATED_UNION` (
    public var `FormatCode`: UByte,
    public var `Alignment`: UByte,
    public var `Flags`: UByte,
    public var `SwitchType`: UByte,
    public var `MemoryOffset`: UInt,
    public var `MemorySize`: UInt,
    public var `Reserved`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDR64_EXPR_CONST32` (
    public var `ExprType`: UByte,
    public var `Reserved`: UByte,
    public var `Reserved1`: UShort,
    public var `ConstValue`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDR64_EXPR_CONST64` (
    public var `ExprType`: UByte,
    public var `Reserved`: UByte,
    public var `Reserved1`: UShort,
    public var `ConstValue`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDR64_EXPR_NOOP` (
    public var `ExprType`: UByte,
    public var `Size`: UByte,
    public var `Reserved`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDR64_EXPR_OPERATOR` (
    public var `ExprType`: UByte,
    public var `Operator`: UByte,
    public var `CastType`: UByte,
    public var `Reserved`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDR64_EXPR_VAR` (
    public var `ExprType`: UByte,
    public var `VarType`: UByte,
    public var `Reserved`: UShort,
    public var `Offset`: UInt,
)
public const val `NDR64_FC_AUTO_HANDLE`: UInt = 3u;
public const val `NDR64_FC_BIND_GENERIC`: UInt = 1u;
public const val `NDR64_FC_BIND_PRIMITIVE`: UInt = 2u;
public const val `NDR64_FC_CALLBACK_HANDLE`: UInt = 4u;
public const val `NDR64_FC_EXPLICIT_HANDLE`: UInt = 0u;
public const val `NDR64_FC_NO_HANDLE`: UInt = 5u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDR64_FIXED_REPEAT_FORMAT` (
    public var `RepeatFormat`: `NDR64_REPEAT_FORMAT`,
    public var `Iterations`: UInt,
    public var `Reserved`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDR64_FIX_ARRAY_HEADER_FORMAT` (
    public var `FormatCode`: UByte,
    public var `Alignment`: UByte,
    public var `Flags`: `NDR64_ARRAY_FLAGS`,
    public var `Reserved`: UByte,
    public var `TotalSize`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDR64_IID_FLAGS` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDR64_IID_FORMAT` (
    public var `FormatCode`: UByte,
    public var `Flags`: UByte,
    public var `Reserved`: UShort,
    public var `IIDDescriptor`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1387:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDR64_IID_FORMAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDR64_MEMPAD_FORMAT` (
    public var `FormatCode`: UByte,
    public var `Reserve1`: UByte,
    public var `MemPad`: UShort,
    public var `Reserved2`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDR64_NON_CONFORMANT_STRING_FORMAT` (
    public var `Header`: `NDR64_STRING_HEADER_FORMAT`,
    public var `TotalSize`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDR64_NON_ENCAPSULATED_UNION` (
    public var `FormatCode`: UByte,
    public var `Alignment`: UByte,
    public var `Flags`: UByte,
    public var `SwitchType`: UByte,
    public var `MemorySize`: UInt,
    public var `Switch`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Reserved`: UInt,
)
// UNSUPPORTED Rust 1417:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDR64_NON_ENCAPSULATED_UNION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDR64_NO_REPEAT_FORMAT` (
    public var `FormatCode`: UByte,
    public var `Flags`: UByte,
    public var `Reserved1`: UShort,
    public var `Reserved2`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDR64_PARAM_FLAGS` (
    public var `_bitfield`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDR64_PARAM_FORMAT` (
    public var `Type`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Attributes`: `NDR64_PARAM_FLAGS`,
    public var `Reserved`: UShort,
    public var `StackOffset`: UInt,
)
// UNSUPPORTED Rust 1443:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDR64_PARAM_FORMAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDR64_PIPE_FLAGS` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDR64_PIPE_FORMAT` (
    public var `FormatCode`: UByte,
    public var `Flags`: UByte,
    public var `Alignment`: UByte,
    public var `Reserved`: UByte,
    public var `Type`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `MemorySize`: UInt,
    public var `BufferSize`: UInt,
)
// UNSUPPORTED Rust 1464:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDR64_PIPE_FORMAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDR64_POINTER_FORMAT` (
    public var `FormatCode`: UByte,
    public var `Flags`: UByte,
    public var `Reserved`: UShort,
    public var `Pointee`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1477:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDR64_POINTER_FORMAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDR64_POINTER_INSTANCE_HEADER_FORMAT` (
    public var `Offset`: UInt,
    public var `Reserved`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDR64_POINTER_REPEAT_FLAGS` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDR64_PROC_FLAGS` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDR64_PROC_FORMAT` (
    public var `Flags`: UInt,
    public var `StackSize`: UInt,
    public var `ConstantClientBufferSize`: UInt,
    public var `ConstantServerBufferSize`: UInt,
    public var `RpcFlags`: UShort,
    public var `FloatDoubleMask`: UShort,
    public var `NumberOfParams`: UShort,
    public var `ExtensionSize`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDR64_RANGED_STRING_FORMAT` (
    public var `Header`: `NDR64_STRING_HEADER_FORMAT`,
    public var `Reserved`: UInt,
    public var `Min`: ULong,
    public var `Max`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDR64_RANGE_FORMAT` (
    public var `FormatCode`: UByte,
    public var `RangeType`: UByte,
    public var `Reserved`: UShort,
    public var `MinValue`: Long,
    public var `MaxValue`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDR64_RANGE_PIPE_FORMAT` (
    public var `FormatCode`: UByte,
    public var `Flags`: UByte,
    public var `Alignment`: UByte,
    public var `Reserved`: UByte,
    public var `Type`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `MemorySize`: UInt,
    public var `BufferSize`: UInt,
    public var `MinValue`: UInt,
    public var `MaxValue`: UInt,
)
// UNSUPPORTED Rust 1540:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDR64_RANGE_PIPE_FORMAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDR64_REPEAT_FORMAT` (
    public var `FormatCode`: UByte,
    public var `Flags`: `NDR64_POINTER_REPEAT_FLAGS`,
    public var `Reserved`: UShort,
    public var `Increment`: UInt,
    public var `OffsetToArray`: UInt,
    public var `NumberOfPointers`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDR64_RPC_FLAGS` (
    public var `_bitfield`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDR64_SIMPLE_MEMBER_FORMAT` (
    public var `FormatCode`: UByte,
    public var `Reserved1`: UByte,
    public var `Reserved2`: UShort,
    public var `Reserved3`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDR64_SIMPLE_REGION_FORMAT` (
    public var `FormatCode`: UByte,
    public var `Alignment`: UByte,
    public var `RegionSize`: UShort,
    public var `Reserved`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDR64_SIZED_CONFORMANT_STRING_FORMAT` (
    public var `Header`: `NDR64_STRING_HEADER_FORMAT`,
    public var `SizeDescription`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1582:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDR64_SIZED_CONFORMANT_STRING_FORMAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDR64_STRING_FLAGS` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDR64_STRING_HEADER_FORMAT` (
    public var `FormatCode`: UByte,
    public var `Flags`: `NDR64_STRING_FLAGS`,
    public var `ElementSize`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDR64_STRUCTURE_FLAGS` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDR64_STRUCTURE_HEADER_FORMAT` (
    public var `FormatCode`: UByte,
    public var `Alignment`: UByte,
    public var `Flags`: `NDR64_STRUCTURE_FLAGS`,
    public var `Reserve`: UByte,
    public var `MemorySize`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDR64_SYSTEM_HANDLE_FORMAT` (
    public var `FormatCode`: UByte,
    public var `HandleType`: UByte,
    public var `DesiredAccess`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDR64_TRANSMIT_AS_FLAGS` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDR64_TRANSMIT_AS_FORMAT` (
    public var `FormatCode`: UByte,
    public var `Flags`: UByte,
    public var `RoutineIndex`: UShort,
    public var `TransmittedTypeWireAlignment`: UShort,
    public var `MemoryAlignment`: UShort,
    public var `PresentedTypeMemorySize`: UInt,
    public var `TransmittedTypeBufferSize`: UInt,
    public var `TransmittedType`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1637:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDR64_TRANSMIT_AS_FORMAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDR64_TYPE_STRICT_CONTEXT_HANDLE` (
    public var `FormatCode`: UByte,
    public var `RealFormatCode`: UByte,
    public var `Reserved`: UShort,
    public var `Type`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `CtxtFlags`: UInt,
    public var `CtxtID`: UInt,
)
// UNSUPPORTED Rust 1652:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDR64_TYPE_STRICT_CONTEXT_HANDLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDR64_UNION_ARM` (
    public var `CaseValue`: Long,
    public var `Type`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Reserved`: UInt,
)
// UNSUPPORTED Rust 1664:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDR64_UNION_ARM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDR64_UNION_ARM_SELECTOR` (
    public var `Reserved1`: UByte,
    public var `Alignment`: UByte,
    public var `Reserved2`: UShort,
    public var `Arms`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDR64_USER_MARSHAL_FLAGS` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDR64_USER_MARSHAL_FORMAT` (
    public var `FormatCode`: UByte,
    public var `Flags`: UByte,
    public var `RoutineIndex`: UShort,
    public var `TransmittedTypeWireAlignment`: UShort,
    public var `MemoryAlignment`: UShort,
    public var `UserTypeMemorySize`: UInt,
    public var `TransmittedTypeBufferSize`: UInt,
    public var `TransmittedType`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1694:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDR64_USER_MARSHAL_FORMAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDR64_VAR_ARRAY_HEADER_FORMAT` (
    public var `FormatCode`: UByte,
    public var `Alignment`: UByte,
    public var `Flags`: `NDR64_ARRAY_FLAGS`,
    public var `Reserved`: UByte,
    public var `TotalSize`: UInt,
    public var `ElementSize`: UInt,
    public var `VarDescriptor`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1710:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDR64_VAR_ARRAY_HEADER_FORMAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `NDR_ALLOC_ALL_NODES_CONTEXT` = Long;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDR_CS_ROUTINES` (
    public var `pSizeConvertRoutines`: /* Rust *mut */ kotlinx.cinterop.CPointer<`NDR_CS_SIZE_CONVERT_ROUTINES`>?,
    public var `pTagGettingRoutines`: /* Rust *mut */ kotlinx.cinterop.CPointer<`CS_TAG_GETTING_ROUTINE`>?,
)
// UNSUPPORTED Rust 1722:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDR_CS_ROUTINES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDR_CS_SIZE_CONVERT_ROUTINES` (
    public var `pfnNetSize`: `CS_TYPE_NET_SIZE_ROUTINE`,
    public var `pfnToNetCs`: `CS_TYPE_TO_NETCS_ROUTINE`,
    public var `pfnLocalSize`: `CS_TYPE_LOCAL_SIZE_ROUTINE`,
    public var `pfnFromNetCs`: `CS_TYPE_FROM_NETCS_ROUTINE`,
)
public const val `NDR_CUSTOM_OR_DEFAULT_ALLOCATOR`: UInt = 268435456u;
public const val `NDR_DEFAULT_ALLOCATOR`: UInt = 536870912u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDR_EXPR_DESC` (
    public var `pOffset`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `pFormatExpr`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 1743:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDR_EXPR_DESC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `NDR_NOTIFY2_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UByte) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `NDR_NOTIFY_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Unit>>>;
public typealias `NDR_POINTER_QUEUE_STATE` = Long;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `NDR_RUNDOWN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// UNSUPPORTED Rust 1752:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NDR_SCONTEXT {
//     pub pad: [*mut core::ffi::c_void; 2],
//     pub userContext: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1758:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDR_SCONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDR_USER_MARSHAL_INFO` (
    public var `InformationLevel`: UInt,
    public var `Anonymous`: `NDR_USER_MARSHAL_INFO_0`,
)
// UNSUPPORTED Rust 1770:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for NDR_USER_MARSHAL_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1776:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub union NDR_USER_MARSHAL_INFO_0 {
//     pub Level1: NDR_USER_MARSHAL_INFO_LEVEL1,
// }

// UNSUPPORTED Rust 1782:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for NDR_USER_MARSHAL_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1788:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
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

// UNSUPPORTED Rust 1799:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for NDR_USER_MARSHAL_INFO_LEVEL1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NT351_INTERFACE_SIZE`: UInt = 64u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PFN_RPCNOTIFICATION_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_ASYNC_STATE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `RPC_ASYNC_EVENT`) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_RPC_ALLOCATE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong) -> /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_RPC_FREE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
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
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PRPC_RUNDOWN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RDR_CALLOUT_STATE` (
    public var `LastError`: `RPC_STATUS`,
    public var `LastEEInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `LastCalledStage`: `RPC_HTTP_REDIRECTOR_STAGE`,
    public var `ServerName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `ServerPort`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `RemoteUser`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `AuthType`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `ResourceTypePresent`: UByte,
    public var `SessionIdPresent`: UByte,
    public var `InterfacePresent`: UByte,
    public var `ResourceType`: `windows_sys`.`core`.`GUID`,
    public var `SessionId`: `windows_sys`.`core`.`GUID`,
    public var `Interface`: `RPC_SYNTAX_IDENTIFIER`,
    public var `CertContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1840:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `RPCLT_PDU_FILTER_FUNC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, Int) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `RPC_ADDRESS_CHANGE_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
public typealias `RPC_ADDRESS_CHANGE_TYPE` = Int;
public typealias `RPC_ASYNC_EVENT` = Int;
// UNSUPPORTED Rust 1869:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
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

// UNSUPPORTED Rust 1879:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_IO")]
// impl Default for RPC_ASYNC_NOTIFICATION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RPC_ASYNC_NOTIFICATION_INFO_0` (
    public var `NotificationRoutine`: `PFN_RPCNOTIFICATION_ROUTINE`,
    public var `hThread`: `super`.`super`.`Foundation`.`HANDLE`,
)
// UNSUPPORTED Rust 1892:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_IO")]
// impl Default for RPC_ASYNC_NOTIFICATION_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RPC_ASYNC_NOTIFICATION_INFO_1` (
    public var `hIOPort`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `dwNumberOfBytesTransferred`: UInt,
    public var `dwCompletionKey`: ULong,
    public var `lpOverlapped`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`IO`.`OVERLAPPED`>?,
)
// UNSUPPORTED Rust 1907:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_IO")]
// impl Default for RPC_ASYNC_NOTIFICATION_INFO_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RPC_ASYNC_NOTIFICATION_INFO_2` (
    public var `hWnd`: `super`.`super`.`Foundation`.`HWND`,
    public var `Msg`: UInt,
)
// UNSUPPORTED Rust 1920:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_IO")]
// impl Default for RPC_ASYNC_NOTIFICATION_INFO_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1926:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
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

// UNSUPPORTED Rust 1942:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_IO")]
// impl Default for RPC_ASYNC_STATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `RPC_AUTH_KEY_RETRIEVAL_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `windows_sys`.`core`.`PCWSTR`, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_STATUS`>?) -> Unit>>>;
public const val `RPC_BHO_DONTLINGER`: `RPC_BINDING_HANDLE_OPTIONS_FLAGS` = 2u;
public const val `RPC_BHO_EXCLUSIVE_AND_GUARANTEED`: UInt = 4u;
public const val `RPC_BHO_NONCAUSAL`: `RPC_BINDING_HANDLE_OPTIONS_FLAGS` = 1u;
public const val `RPC_BHT_OBJECT_UUID_VALID`: UInt = 1u;
public typealias `RPC_BINDING_HANDLE_OPTIONS_FLAGS` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RPC_BINDING_HANDLE_OPTIONS_V1` (
    public var `Version`: UInt,
    public var `Flags`: `RPC_BINDING_HANDLE_OPTIONS_FLAGS`,
    public var `ComTimeout`: UInt,
    public var `CallTimeout`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RPC_BINDING_HANDLE_SECURITY_V1_A` (
    public var `Version`: UInt,
    public var `ServerPrincName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `AuthnLevel`: UInt,
    public var `AuthnSvc`: UInt,
    public var `AuthIdentity`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SEC_WINNT_AUTH_IDENTITY_A`>?,
    public var `SecurityQos`: /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_SECURITY_QOS`>?,
)
// UNSUPPORTED Rust 1973:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for RPC_BINDING_HANDLE_SECURITY_V1_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RPC_BINDING_HANDLE_SECURITY_V1_W` (
    public var `Version`: UInt,
    public var `ServerPrincName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `AuthnLevel`: UInt,
    public var `AuthnSvc`: UInt,
    public var `AuthIdentity`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SEC_WINNT_AUTH_IDENTITY_W`>?,
    public var `SecurityQos`: /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_SECURITY_QOS`>?,
)
// UNSUPPORTED Rust 1990:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for RPC_BINDING_HANDLE_SECURITY_V1_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RPC_BINDING_HANDLE_TEMPLATE_V1_A` (
    public var `Version`: UInt,
    public var `Flags`: UInt,
    public var `ProtocolSequence`: UInt,
    public var `NetworkAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `StringEndpoint`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `u1`: `RPC_BINDING_HANDLE_TEMPLATE_V1_A_0`,
    public var `ObjectUuid`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 2007:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RPC_BINDING_HANDLE_TEMPLATE_V1_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2012:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union RPC_BINDING_HANDLE_TEMPLATE_V1_A_0 {
//     pub Reserved: *mut u8,
// }

// UNSUPPORTED Rust 2017:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RPC_BINDING_HANDLE_TEMPLATE_V1_A_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RPC_BINDING_HANDLE_TEMPLATE_V1_W` (
    public var `Version`: UInt,
    public var `Flags`: UInt,
    public var `ProtocolSequence`: UInt,
    public var `NetworkAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `StringEndpoint`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `u1`: `RPC_BINDING_HANDLE_TEMPLATE_V1_W_0`,
    public var `ObjectUuid`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 2033:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RPC_BINDING_HANDLE_TEMPLATE_V1_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2038:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union RPC_BINDING_HANDLE_TEMPLATE_V1_W_0 {
//     pub Reserved: *mut u16,
// }

// UNSUPPORTED Rust 2043:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RPC_BINDING_HANDLE_TEMPLATE_V1_W_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2048:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RPC_BINDING_VECTOR {
//     pub Count: u32,
//     pub BindingH: [*mut core::ffi::c_void; 1],
// }

// UNSUPPORTED Rust 2054:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RPC_BINDING_VECTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `RPC_BLOCKING_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `RPC_STATUS`>>>;
public const val `RPC_BUFFER_ASYNC`: UInt = 32768u;
public const val `RPC_BUFFER_COMPLETE`: UInt = 4096u;
public const val `RPC_BUFFER_EXTRA`: UInt = 16384u;
public const val `RPC_BUFFER_NONOTIFY`: UInt = 65536u;
public const val `RPC_BUFFER_PARTIAL`: UInt = 8192u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RPC_CALL_ATTRIBUTES_V1_A` (
    public var `Version`: UInt,
    public var `Flags`: UInt,
    public var `ServerPrincipalNameBufferLength`: UInt,
    public var `ServerPrincipalName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `ClientPrincipalNameBufferLength`: UInt,
    public var `ClientPrincipalName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `AuthenticationLevel`: UInt,
    public var `AuthenticationService`: UInt,
    public var `NullSession`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 2078:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RPC_CALL_ATTRIBUTES_V1_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RPC_CALL_ATTRIBUTES_V1_W` (
    public var `Version`: UInt,
    public var `Flags`: UInt,
    public var `ServerPrincipalNameBufferLength`: UInt,
    public var `ServerPrincipalName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `ClientPrincipalNameBufferLength`: UInt,
    public var `ClientPrincipalName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `AuthenticationLevel`: UInt,
    public var `AuthenticationService`: UInt,
    public var `NullSession`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 2096:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RPC_CALL_ATTRIBUTES_V1_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RPC_CALL_ATTRIBUTES_V2_A` (
    public var `Version`: UInt,
    public var `Flags`: UInt,
    public var `ServerPrincipalNameBufferLength`: UInt,
    public var `ServerPrincipalName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `ClientPrincipalNameBufferLength`: UInt,
    public var `ClientPrincipalName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `AuthenticationLevel`: UInt,
    public var `AuthenticationService`: UInt,
    public var `NullSession`: `windows_sys`.`core`.`BOOL`,
    public var `KernelModeCaller`: `windows_sys`.`core`.`BOOL`,
    public var `ProtocolSequence`: UInt,
    public var `IsClientLocal`: UInt,
    public var `ClientPID`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `CallStatus`: UInt,
    public var `CallType`: `RpcCallType`,
    public var `CallLocalAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_CALL_LOCAL_ADDRESS_V1`>?,
    public var `OpNum`: UShort,
    public var `InterfaceUuid`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 2123:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RPC_CALL_ATTRIBUTES_V2_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RPC_CALL_ATTRIBUTES_V2_W` (
    public var `Version`: UInt,
    public var `Flags`: UInt,
    public var `ServerPrincipalNameBufferLength`: UInt,
    public var `ServerPrincipalName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `ClientPrincipalNameBufferLength`: UInt,
    public var `ClientPrincipalName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `AuthenticationLevel`: UInt,
    public var `AuthenticationService`: UInt,
    public var `NullSession`: `windows_sys`.`core`.`BOOL`,
    public var `KernelModeCaller`: `windows_sys`.`core`.`BOOL`,
    public var `ProtocolSequence`: UInt,
    public var `IsClientLocal`: `RpcCallClientLocality`,
    public var `ClientPID`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `CallStatus`: UInt,
    public var `CallType`: `RpcCallType`,
    public var `CallLocalAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_CALL_LOCAL_ADDRESS_V1`>?,
    public var `OpNum`: UShort,
    public var `InterfaceUuid`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 2150:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RPC_CALL_ATTRIBUTES_V2_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RPC_CALL_ATTRIBUTES_V3_A` (
    public var `Version`: UInt,
    public var `Flags`: UInt,
    public var `ServerPrincipalNameBufferLength`: UInt,
    public var `ServerPrincipalName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `ClientPrincipalNameBufferLength`: UInt,
    public var `ClientPrincipalName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `AuthenticationLevel`: UInt,
    public var `AuthenticationService`: UInt,
    public var `NullSession`: `windows_sys`.`core`.`BOOL`,
    public var `KernelModeCaller`: `windows_sys`.`core`.`BOOL`,
    public var `ProtocolSequence`: UInt,
    public var `IsClientLocal`: UInt,
    public var `ClientPID`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `CallStatus`: UInt,
    public var `CallType`: `RpcCallType`,
    public var `CallLocalAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_CALL_LOCAL_ADDRESS_V1`>?,
    public var `OpNum`: UShort,
    public var `InterfaceUuid`: `windows_sys`.`core`.`GUID`,
    public var `ClientIdentifierBufferLength`: UInt,
    public var `ClientIdentifier`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 2179:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RPC_CALL_ATTRIBUTES_V3_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RPC_CALL_ATTRIBUTES_V3_W` (
    public var `Version`: UInt,
    public var `Flags`: UInt,
    public var `ServerPrincipalNameBufferLength`: UInt,
    public var `ServerPrincipalName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `ClientPrincipalNameBufferLength`: UInt,
    public var `ClientPrincipalName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `AuthenticationLevel`: UInt,
    public var `AuthenticationService`: UInt,
    public var `NullSession`: `windows_sys`.`core`.`BOOL`,
    public var `KernelModeCaller`: `windows_sys`.`core`.`BOOL`,
    public var `ProtocolSequence`: UInt,
    public var `IsClientLocal`: `RpcCallClientLocality`,
    public var `ClientPID`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `CallStatus`: UInt,
    public var `CallType`: `RpcCallType`,
    public var `CallLocalAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_CALL_LOCAL_ADDRESS_V1`>?,
    public var `OpNum`: UShort,
    public var `InterfaceUuid`: `windows_sys`.`core`.`GUID`,
    public var `ClientIdentifierBufferLength`: UInt,
    public var `ClientIdentifier`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 2208:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RPC_CALL_ATTRIBUTES_V3_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RPC_CALL_ATTRIBUTES_VERSION`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RPC_CALL_LOCAL_ADDRESS_V1` (
    public var `Version`: UInt,
    public var `Buffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `BufferSize`: UInt,
    public var `AddressFormat`: `RpcLocalAddressFormat`,
)
// UNSUPPORTED Rust 2222:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RPC_CALL_LOCAL_ADDRESS_V1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RPC_CALL_STATUS_CANCELLED`: UInt = 1u;
public const val `RPC_CALL_STATUS_DISCONNECTED`: UInt = 2u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `RPC_CLIENT_ALLOC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong) -> /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `RPC_CLIENT_FREE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RPC_CLIENT_INFORMATION1` (
    public var `UserName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `ComputerName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `Privilege`: UShort,
    public var `AuthFlags`: UInt,
)
// UNSUPPORTED Rust 2239:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RPC_CLIENT_INFORMATION1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RPC_CLIENT_INTERFACE` (
    public var `Length`: UInt,
    public var `InterfaceId`: `RPC_SYNTAX_IDENTIFIER`,
    public var `TransferSyntax`: `RPC_SYNTAX_IDENTIFIER`,
    public var `DispatchTable`: /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_DISPATCH_TABLE`>?,
    public var `RpcProtseqEndpointCount`: UInt,
    public var `RpcProtseqEndpoint`: /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_PROTSEQ_ENDPOINT`>?,
    public var `Reserved`: ULong,
    public var `InterpreterInfo`: /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Flags`: UInt,
)
// UNSUPPORTED Rust 2257:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RPC_C_OPT_COOKIE_AUTH_DESCRIPTOR` (
    public var `BufferSize`: UInt,
    public var `Buffer`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 2351:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `RPC_DISPATCH_FUNCTION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_MESSAGE`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RPC_DISPATCH_TABLE` (
    public var `DispatchTableCount`: UInt,
    public var `DispatchTable`: `RPC_DISPATCH_FUNCTION`,
    public var `Reserved`: Long,
)
public const val `RPC_EEINFO_VERSION`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RPC_EE_INFO_PARAM` (
    public var `ParameterType`: `ExtendedErrorParamTypes`,
    public var `u`: `RPC_EE_INFO_PARAM_0`,
)
// UNSUPPORTED Rust 2430:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RPC_EE_INFO_PARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2435:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
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

// UNSUPPORTED Rust 2445:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RPC_EE_INFO_PARAM_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RPC_ENDPOINT_TEMPLATEA` (
    public var `Version`: UInt,
    public var `ProtSeq`: `windows_sys`.`core`.`PSTR`,
    public var `Endpoint`: `windows_sys`.`core`.`PSTR`,
    public var `SecurityDescriptor`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Backlog`: UInt,
)
// UNSUPPORTED Rust 2459:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RPC_ENDPOINT_TEMPLATEA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RPC_ENDPOINT_TEMPLATEW` (
    public var `Version`: UInt,
    public var `ProtSeq`: `windows_sys`.`core`.`PWSTR`,
    public var `Endpoint`: `windows_sys`.`core`.`PWSTR`,
    public var `SecurityDescriptor`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Backlog`: UInt,
)
// UNSUPPORTED Rust 2473:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RPC_ENDPOINT_TEMPLATEW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RPC_ERROR_ENUM_HANDLE` (
    public var `Signature`: UInt,
    public var `CurrentPos`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Head`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 2485:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RPC_ERROR_ENUM_HANDLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2490:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
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

// UNSUPPORTED Rust 2504:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RPC_EXTENDED_ERROR_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2509:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union RPC_EXTENDED_ERROR_INFO_0 {
//     pub SystemTime: super::super::Foundation::SYSTEMTIME,
//     pub FileTime: super::super::Foundation::FILETIME,
// }

// UNSUPPORTED Rust 2515:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RPC_EXTENDED_ERROR_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RPC_FLAGS_VALID_BIT`: UInt = 32768u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `RPC_FORWARD_FUNCTION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_VERSION`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> `RPC_STATUS`>>>;
public const val `RPC_FW_IF_FLAG_DCOM`: UInt = 1u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `RPC_HTTP_PROXY_FREE_STRING` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`) -> Unit>>>;
public typealias `RPC_HTTP_REDIRECTOR_STAGE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RPC_HTTP_TRANSPORT_CREDENTIALS_A` (
    public var `TransportCredentials`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SEC_WINNT_AUTH_IDENTITY_A`>?,
    public var `Flags`: `RPC_C_HTTP_FLAGS`,
    public var `AuthenticationTarget`: `RPC_C_HTTP_AUTHN_TARGET`,
    public var `NumberOfAuthnSchemes`: UInt,
    public var `AuthnSchemes`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `ServerCertificateSubject`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 2535:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RPC_HTTP_TRANSPORT_CREDENTIALS_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A` (
    public var `TransportCredentials`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SEC_WINNT_AUTH_IDENTITY_A`>?,
    public var `Flags`: `RPC_C_HTTP_FLAGS`,
    public var `AuthenticationTarget`: `RPC_C_HTTP_AUTHN_TARGET`,
    public var `NumberOfAuthnSchemes`: UInt,
    public var `AuthnSchemes`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `ServerCertificateSubject`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `ProxyCredentials`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SEC_WINNT_AUTH_IDENTITY_A`>?,
    public var `NumberOfProxyAuthnSchemes`: UInt,
    public var `ProxyAuthnSchemes`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
)
// UNSUPPORTED Rust 2553:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RPC_HTTP_TRANSPORT_CREDENTIALS_V2_W` (
    public var `TransportCredentials`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SEC_WINNT_AUTH_IDENTITY_W`>?,
    public var `Flags`: `RPC_C_HTTP_FLAGS`,
    public var `AuthenticationTarget`: `RPC_C_HTTP_AUTHN_TARGET`,
    public var `NumberOfAuthnSchemes`: UInt,
    public var `AuthnSchemes`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `ServerCertificateSubject`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `ProxyCredentials`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SEC_WINNT_AUTH_IDENTITY_W`>?,
    public var `NumberOfProxyAuthnSchemes`: UInt,
    public var `ProxyAuthnSchemes`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
)
// UNSUPPORTED Rust 2571:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RPC_HTTP_TRANSPORT_CREDENTIALS_V2_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RPC_HTTP_TRANSPORT_CREDENTIALS_V3_A` (
    public var `TransportCredentials`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Flags`: `RPC_C_HTTP_FLAGS`,
    public var `AuthenticationTarget`: `RPC_C_HTTP_AUTHN_TARGET`,
    public var `NumberOfAuthnSchemes`: UInt,
    public var `AuthnSchemes`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `ServerCertificateSubject`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `ProxyCredentials`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `NumberOfProxyAuthnSchemes`: UInt,
    public var `ProxyAuthnSchemes`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
)
// UNSUPPORTED Rust 2589:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RPC_HTTP_TRANSPORT_CREDENTIALS_V3_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W` (
    public var `TransportCredentials`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Flags`: `RPC_C_HTTP_FLAGS`,
    public var `AuthenticationTarget`: `RPC_C_HTTP_AUTHN_TARGET`,
    public var `NumberOfAuthnSchemes`: UInt,
    public var `AuthnSchemes`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `ServerCertificateSubject`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `ProxyCredentials`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `NumberOfProxyAuthnSchemes`: UInt,
    public var `ProxyAuthnSchemes`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
)
// UNSUPPORTED Rust 2607:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RPC_HTTP_TRANSPORT_CREDENTIALS_W` (
    public var `TransportCredentials`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SEC_WINNT_AUTH_IDENTITY_W`>?,
    public var `Flags`: `RPC_C_HTTP_FLAGS`,
    public var `AuthenticationTarget`: `RPC_C_HTTP_AUTHN_TARGET`,
    public var `NumberOfAuthnSchemes`: UInt,
    public var `AuthnSchemes`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `ServerCertificateSubject`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
)
// UNSUPPORTED Rust 2622:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `RPC_IF_CALLBACK_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `RPC_STATUS`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RPC_IF_ID` (
    public var `Uuid`: `windows_sys`.`core`.`GUID`,
    public var `VersMajor`: UShort,
    public var `VersMinor`: UShort,
)
// UNSUPPORTED Rust 2641:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RPC_IF_ID_VECTOR {
//     pub Count: u32,
//     pub IfId: [*mut RPC_IF_ID; 1],
// }

// UNSUPPORTED Rust 2647:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RPC_IF_ID_VECTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RPC_IF_OLE`: UInt = 2u;
public const val `RPC_IF_SEC_CACHE_PER_PROC`: UInt = 128u;
public const val `RPC_IF_SEC_NO_CACHE`: UInt = 64u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RPC_IMPORT_CONTEXT_P` (
    public var `LookupContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ProposedHandle`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Bindings`: /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_BINDING_VECTOR`>?,
)
// UNSUPPORTED Rust 2662:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RPC_IMPORT_CONTEXT_P {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `RPC_INTERFACE_GROUP_IDLE_CALLBACK_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt) -> Unit>>>;
public const val `RPC_INTERFACE_HAS_PIPES`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RPC_INTERFACE_TEMPLATEA` (
    public var `Version`: UInt,
    public var `IfSpec`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `MgrTypeUuid`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `MgrEpv`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Flags`: UInt,
    public var `MaxCalls`: UInt,
    public var `MaxRpcSize`: UInt,
    public var `IfCallback`: `RPC_IF_CALLBACK_FN`,
    public var `UuidVector`: /* Rust *mut */ kotlinx.cinterop.CPointer<`UUID_VECTOR`>?,
    public var `Annotation`: `windows_sys`.`core`.`PSTR`,
    public var `SecurityDescriptor`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 2684:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RPC_INTERFACE_TEMPLATEA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RPC_INTERFACE_TEMPLATEW` (
    public var `Version`: UInt,
    public var `IfSpec`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `MgrTypeUuid`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `MgrEpv`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Flags`: UInt,
    public var `MaxCalls`: UInt,
    public var `MaxRpcSize`: UInt,
    public var `IfCallback`: `RPC_IF_CALLBACK_FN`,
    public var `UuidVector`: /* Rust *mut */ kotlinx.cinterop.CPointer<`UUID_VECTOR`>?,
    public var `Annotation`: `windows_sys`.`core`.`PWSTR`,
    public var `SecurityDescriptor`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 2704:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RPC_INTERFACE_TEMPLATEW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RPC_MESSAGE` (
    public var `Handle`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `DataRepresentation`: UInt,
    public var `Buffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `BufferLength`: UInt,
    public var `ProcNum`: UInt,
    public var `TransferSyntax`: /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_SYNTAX_IDENTIFIER`>?,
    public var `RpcInterfaceInformation`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ReservedForRuntime`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ManagerEpv`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ImportContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `RpcFlags`: UInt,
)
// UNSUPPORTED Rust 2724:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RPC_MESSAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `RPC_MGMT_AUTHORIZATION_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_STATUS`>?) -> Int>>>;
public const val `RPC_NCA_FLAGS_BROADCAST`: UInt = 2u;
public const val `RPC_NCA_FLAGS_DEFAULT`: UInt = 0u;
public const val `RPC_NCA_FLAGS_IDEMPOTENT`: UInt = 1u;
public const val `RPC_NCA_FLAGS_MAYBE`: UInt = 4u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `RPC_NEW_HTTP_PROXY_CHANNEL` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`RPC_HTTP_REDIRECTOR_STAGE`, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) -> `RPC_STATUS`>>>;
public typealias `RPC_NOTIFICATIONS` = Int;
public typealias `RPC_NOTIFICATION_TYPES` = Int;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `RPC_OBJECT_INQ_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_STATUS`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RPC_POLICY` (
    public var `Length`: UInt,
    public var `EndpointFlags`: UInt,
    public var `NICFlags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RPC_PROTSEQ_ENDPOINT` (
    public var `RpcProtocolSequence`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `Endpoint`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 2751:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RPC_PROTSEQ_ENDPOINT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RPC_PROTSEQ_HTTP`: UInt = 4u;
public const val `RPC_PROTSEQ_LRPC`: UInt = 3u;
public const val `RPC_PROTSEQ_NMP`: UInt = 2u;
public const val `RPC_PROTSEQ_TCP`: UInt = 1u;
// UNSUPPORTED Rust 2760:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RPC_PROTSEQ_VECTORA {
//     pub Count: u32,
//     pub Protseq: [*mut u8; 1],
// }

// UNSUPPORTED Rust 2766:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RPC_PROTSEQ_VECTORA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2771:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RPC_PROTSEQ_VECTORW {
//     pub Count: u32,
//     pub Protseq: [*mut u16; 1],
// }

// UNSUPPORTED Rust 2777:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `RPC_SECURITY_CALLBACK_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RPC_SECURITY_QOS` (
    public var `Version`: UInt,
    public var `Capabilities`: `RPC_C_QOS_CAPABILITIES`,
    public var `IdentityTracking`: `RPC_C_QOS_IDENTITY`,
    public var `ImpersonationType`: `super`.`Com`.`RPC_C_IMP_LEVEL`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RPC_SECURITY_QOS_V2_A` (
    public var `Version`: UInt,
    public var `Capabilities`: `RPC_C_QOS_CAPABILITIES`,
    public var `IdentityTracking`: `RPC_C_QOS_IDENTITY`,
    public var `ImpersonationType`: `super`.`Com`.`RPC_C_IMP_LEVEL`,
    public var `AdditionalSecurityInfoType`: `RPC_C_AUTHN_INFO_TYPE`,
    public var `u`: `RPC_SECURITY_QOS_V2_A_0`,
)
// UNSUPPORTED Rust 2814:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for RPC_SECURITY_QOS_V2_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2820:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub union RPC_SECURITY_QOS_V2_A_0 {
//     pub HttpCredentials: *mut RPC_HTTP_TRANSPORT_CREDENTIALS_A,
// }

// UNSUPPORTED Rust 2826:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for RPC_SECURITY_QOS_V2_A_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RPC_SECURITY_QOS_V2_W` (
    public var `Version`: UInt,
    public var `Capabilities`: `RPC_C_QOS_CAPABILITIES`,
    public var `IdentityTracking`: `RPC_C_QOS_IDENTITY`,
    public var `ImpersonationType`: `super`.`Com`.`RPC_C_IMP_LEVEL`,
    public var `AdditionalSecurityInfoType`: `RPC_C_AUTHN_INFO_TYPE`,
    public var `u`: `RPC_SECURITY_QOS_V2_W_0`,
)
// UNSUPPORTED Rust 2843:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for RPC_SECURITY_QOS_V2_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2849:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub union RPC_SECURITY_QOS_V2_W_0 {
//     pub HttpCredentials: *mut RPC_HTTP_TRANSPORT_CREDENTIALS_W,
// }

// UNSUPPORTED Rust 2855:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for RPC_SECURITY_QOS_V2_W_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RPC_SECURITY_QOS_V3_A` (
    public var `Version`: UInt,
    public var `Capabilities`: `RPC_C_QOS_CAPABILITIES`,
    public var `IdentityTracking`: `RPC_C_QOS_IDENTITY`,
    public var `ImpersonationType`: `super`.`Com`.`RPC_C_IMP_LEVEL`,
    public var `AdditionalSecurityInfoType`: `RPC_C_AUTHN_INFO_TYPE`,
    public var `u`: `RPC_SECURITY_QOS_V3_A_0`,
    public var `Sid`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 2873:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for RPC_SECURITY_QOS_V3_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2879:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub union RPC_SECURITY_QOS_V3_A_0 {
//     pub HttpCredentials: *mut RPC_HTTP_TRANSPORT_CREDENTIALS_A,
// }

// UNSUPPORTED Rust 2885:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for RPC_SECURITY_QOS_V3_A_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RPC_SECURITY_QOS_V3_W` (
    public var `Version`: UInt,
    public var `Capabilities`: `RPC_C_QOS_CAPABILITIES`,
    public var `IdentityTracking`: `RPC_C_QOS_IDENTITY`,
    public var `ImpersonationType`: `super`.`Com`.`RPC_C_IMP_LEVEL`,
    public var `AdditionalSecurityInfoType`: `RPC_C_AUTHN_INFO_TYPE`,
    public var `u`: `RPC_SECURITY_QOS_V3_W_0`,
    public var `Sid`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 2903:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for RPC_SECURITY_QOS_V3_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2909:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub union RPC_SECURITY_QOS_V3_W_0 {
//     pub HttpCredentials: *mut RPC_HTTP_TRANSPORT_CREDENTIALS_W,
// }

// UNSUPPORTED Rust 2915:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for RPC_SECURITY_QOS_V3_W_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RPC_SECURITY_QOS_V4_A` (
    public var `Version`: UInt,
    public var `Capabilities`: `RPC_C_QOS_CAPABILITIES`,
    public var `IdentityTracking`: `RPC_C_QOS_IDENTITY`,
    public var `ImpersonationType`: `super`.`Com`.`RPC_C_IMP_LEVEL`,
    public var `AdditionalSecurityInfoType`: `RPC_C_AUTHN_INFO_TYPE`,
    public var `u`: `RPC_SECURITY_QOS_V4_A_0`,
    public var `Sid`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `EffectiveOnly`: UInt,
)
// UNSUPPORTED Rust 2934:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for RPC_SECURITY_QOS_V4_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2940:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub union RPC_SECURITY_QOS_V4_A_0 {
//     pub HttpCredentials: *mut RPC_HTTP_TRANSPORT_CREDENTIALS_A,
// }

// UNSUPPORTED Rust 2946:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for RPC_SECURITY_QOS_V4_A_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RPC_SECURITY_QOS_V4_W` (
    public var `Version`: UInt,
    public var `Capabilities`: `RPC_C_QOS_CAPABILITIES`,
    public var `IdentityTracking`: `RPC_C_QOS_IDENTITY`,
    public var `ImpersonationType`: `super`.`Com`.`RPC_C_IMP_LEVEL`,
    public var `AdditionalSecurityInfoType`: `RPC_C_AUTHN_INFO_TYPE`,
    public var `u`: `RPC_SECURITY_QOS_V4_W_0`,
    public var `Sid`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `EffectiveOnly`: UInt,
)
// UNSUPPORTED Rust 2965:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for RPC_SECURITY_QOS_V4_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2971:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub union RPC_SECURITY_QOS_V4_W_0 {
//     pub HttpCredentials: *mut RPC_HTTP_TRANSPORT_CREDENTIALS_W,
// }

// UNSUPPORTED Rust 2977:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for RPC_SECURITY_QOS_V4_W_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RPC_SECURITY_QOS_V5_A` (
    public var `Version`: UInt,
    public var `Capabilities`: `RPC_C_QOS_CAPABILITIES`,
    public var `IdentityTracking`: `RPC_C_QOS_IDENTITY`,
    public var `ImpersonationType`: `super`.`Com`.`RPC_C_IMP_LEVEL`,
    public var `AdditionalSecurityInfoType`: `RPC_C_AUTHN_INFO_TYPE`,
    public var `u`: `RPC_SECURITY_QOS_V5_A_0`,
    public var `Sid`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `EffectiveOnly`: UInt,
    public var `ServerSecurityDescriptor`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 2997:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for RPC_SECURITY_QOS_V5_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3003:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub union RPC_SECURITY_QOS_V5_A_0 {
//     pub HttpCredentials: *mut RPC_HTTP_TRANSPORT_CREDENTIALS_A,
// }

// UNSUPPORTED Rust 3009:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for RPC_SECURITY_QOS_V5_A_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RPC_SECURITY_QOS_V5_W` (
    public var `Version`: UInt,
    public var `Capabilities`: `RPC_C_QOS_CAPABILITIES`,
    public var `IdentityTracking`: `RPC_C_QOS_IDENTITY`,
    public var `ImpersonationType`: `super`.`Com`.`RPC_C_IMP_LEVEL`,
    public var `AdditionalSecurityInfoType`: `RPC_C_AUTHN_INFO_TYPE`,
    public var `u`: `RPC_SECURITY_QOS_V5_W_0`,
    public var `Sid`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `EffectiveOnly`: UInt,
    public var `ServerSecurityDescriptor`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 3029:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for RPC_SECURITY_QOS_V5_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3035:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub union RPC_SECURITY_QOS_V5_W_0 {
//     pub HttpCredentials: *mut RPC_HTTP_TRANSPORT_CREDENTIALS_W,
// }

// UNSUPPORTED Rust 3041:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for RPC_SECURITY_QOS_V5_W_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RPC_SEC_CONTEXT_KEY_INFO` (
    public var `EncryptAlgorithm`: UInt,
    public var `KeySize`: UInt,
    public var `SignatureAlgorithm`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RPC_SERVER_INTERFACE` (
    public var `Length`: UInt,
    public var `InterfaceId`: `RPC_SYNTAX_IDENTIFIER`,
    public var `TransferSyntax`: `RPC_SYNTAX_IDENTIFIER`,
    public var `DispatchTable`: /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_DISPATCH_TABLE`>?,
    public var `RpcProtseqEndpointCount`: UInt,
    public var `RpcProtseqEndpoint`: /* Rust *mut */ kotlinx.cinterop.CPointer<`RPC_PROTSEQ_ENDPOINT`>?,
    public var `DefaultManagerEpv`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `InterpreterInfo`: /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Flags`: UInt,
)
// UNSUPPORTED Rust 3067:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RPC_SERVER_INTERFACE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `RPC_SETFILTER_FUNC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`RPCLT_PDU_FILTER_FUNC`) -> Unit>>>;
// UNSUPPORTED Rust 3073:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RPC_STATS_VECTOR {
//     pub Count: u32,
//     pub Stats: [u32; 1],
// }

// UNSUPPORTED Rust 3079:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RPC_STATS_VECTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `RPC_STATUS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RPC_SYNTAX_IDENTIFIER` (
    public var `SyntaxGUID`: `windows_sys`.`core`.`GUID`,
    public var `SyntaxVersion`: `RPC_VERSION`,
)
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RPC_TRANSFER_SYNTAX` (
    public var `Uuid`: `windows_sys`.`core`.`GUID`,
    public var `VersMajor`: UShort,
    public var `VersMinor`: UShort,
)
public const val `RPC_TYPE_DISCONNECT_EVENT_CONTEXT_HANDLE`: UInt = 2147483648u;
public const val `RPC_TYPE_STRICT_CONTEXT_HANDLE`: UInt = 1073741824u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RPC_VERSION` (
    public var `MajorVersion`: UShort,
    public var `MinorVersion`: UShort,
)
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SCONTEXT_QUEUE` (
    public var `NumberOfObjects`: UInt,
    public var `ArrayOfObjects`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`NDR_SCONTEXT`>>?,
)
// UNSUPPORTED Rust 3256:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SCONTEXT_QUEUE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SEC_WINNT_AUTH_IDENTITY` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SEC_WINNT_AUTH_IDENTITY_A` (
    public var `User`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `UserLength`: UInt,
    public var `Domain`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `DomainLength`: UInt,
    public var `Password`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `PasswordLength`: UInt,
    public var `Flags`: `SEC_WINNT_AUTH_IDENTITY`,
)
// UNSUPPORTED Rust 3273:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SEC_WINNT_AUTH_IDENTITY_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SEC_WINNT_AUTH_IDENTITY_ANSI`: `SEC_WINNT_AUTH_IDENTITY` = 1u;
public const val `SEC_WINNT_AUTH_IDENTITY_UNICODE`: `SEC_WINNT_AUTH_IDENTITY` = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SEC_WINNT_AUTH_IDENTITY_W` (
    public var `User`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `UserLength`: UInt,
    public var `Domain`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `DomainLength`: UInt,
    public var `Password`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `PasswordLength`: UInt,
    public var `Flags`: `SEC_WINNT_AUTH_IDENTITY`,
)
// UNSUPPORTED Rust 3291:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SEC_WINNT_AUTH_IDENTITY_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SERVER_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Int>>>;
public const val `STUB_CALL_SERVER`: `STUB_PHASE` = 1;
public const val `STUB_CALL_SERVER_NO_HRESULT`: `STUB_PHASE` = 3;
public const val `STUB_MARSHAL`: `STUB_PHASE` = 2;
public typealias `STUB_PHASE` = Int;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public typealias `STUB_THUNK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?) -> Unit>>>;
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USER_MARSHAL_CB` (
    public var `Flags`: UInt,
    public var `pStubMsg`: /* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?,
    public var `pReserve`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `Signature`: UInt,
    public var `CBType`: `USER_MARSHAL_CB_TYPE`,
    public var `pFormat`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `pTypeFormat`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 3348:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `USER_MARSHAL_FREEING_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `USER_MARSHAL_MARSHALLING_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USER_MARSHAL_ROUTINE_QUADRUPLE` (
    public var `pfnBufferSize`: `USER_MARSHAL_SIZING_ROUTINE`,
    public var `pfnMarshall`: `USER_MARSHAL_MARSHALLING_ROUTINE`,
    public var `pfnUnmarshall`: `USER_MARSHAL_UNMARSHALLING_ROUTINE`,
    public var `pfnFree`: `USER_MARSHAL_FREEING_ROUTINE`,
)
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `USER_MARSHAL_SIZING_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `USER_MARSHAL_UNMARSHALLING_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?>>>;
// UNSUPPORTED Rust 3383:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct UUID_VECTOR {
//     pub Count: u32,
//     pub Uuid: [*mut windows_sys::core::GUID; 1],
// }

// UNSUPPORTED Rust 3389:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for UUID_VECTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `XLAT_CLIENT`: `XLAT_SIDE` = 2;
public const val `XLAT_SERVER`: `XLAT_SIDE` = 1;
public typealias `XLAT_SIDE` = Int;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public typealias `XMIT_HELPER_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`MIDL_STUB_MESSAGE`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `XMIT_ROUTINE_QUINTUPLE` (
    public var `pfnTranslateToXmit`: `XMIT_HELPER_ROUTINE`,
    public var `pfnTranslateFromXmit`: `XMIT_HELPER_ROUTINE`,
    public var `pfnFreeXmit`: `XMIT_HELPER_ROUTINE`,
    public var `pfnFreeInst`: `XMIT_HELPER_ROUTINE`,
)
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
