// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=qwave.dll, ABI=system, export=QOSAddSocketToFlow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `QOSAddSocketToFlow`(`qoshandle` : `super`.`super`.`Foundation`.`HANDLE`, `socket` : `super`.`super`.`Networking`.`WinSock`.`SOCKET`, `destaddr` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Networking`.`WinSock`.`SOCKADDR`>?, `traffictype` : `QOS_TRAFFIC_TYPE`, `flags` : UInt, `flowid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=qwave.dll, ABI=system, export=QOSCancel; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `QOSCancel`(`qoshandle` : `super`.`super`.`Foundation`.`HANDLE`, `overlapped` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=qwave.dll, ABI=system, export=QOSCloseHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `QOSCloseHandle`(`qoshandle` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=qwave.dll, ABI=system, export=QOSCreateHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `QOSCreateHandle`(`version` : /* Rust *const */ kotlinx.cinterop.CPointer<`QOS_VERSION`>?, `qoshandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=qwave.dll, ABI=system, export=QOSEnumerateFlows; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `QOSEnumerateFlows`(`qoshandle` : `super`.`super`.`Foundation`.`HANDLE`, `size` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=qwave.dll, ABI=system, export=QOSNotifyFlow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `QOSNotifyFlow`(`qoshandle` : `super`.`super`.`Foundation`.`HANDLE`, `flowid` : UInt, `operation` : `QOS_NOTIFY_FLOW`, `size` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `flags` : UInt, `overlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=qwave.dll, ABI=system, export=QOSQueryFlow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `QOSQueryFlow`(`qoshandle` : `super`.`super`.`Foundation`.`HANDLE`, `flowid` : UInt, `operation` : `QOS_QUERY_FLOW`, `size` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `flags` : UInt, `overlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=qwave.dll, ABI=system, export=QOSRemoveSocketFromFlow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `QOSRemoveSocketFromFlow`(`qoshandle` : `super`.`super`.`Foundation`.`HANDLE`, `socket` : `super`.`super`.`Networking`.`WinSock`.`SOCKET`, `flowid` : UInt, `flags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=qwave.dll, ABI=system, export=QOSSetFlow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `QOSSetFlow`(`qoshandle` : `super`.`super`.`Foundation`.`HANDLE`, `flowid` : UInt, `operation` : `QOS_SET_FLOW`, `size` : UInt, `buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `flags` : UInt, `overlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=qwave.dll, ABI=system, export=QOSStartTrackingClient; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `QOSStartTrackingClient`(`qoshandle` : `super`.`super`.`Foundation`.`HANDLE`, `destaddr` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Networking`.`WinSock`.`SOCKADDR`>?, `flags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=qwave.dll, ABI=system, export=QOSStopTrackingClient; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `QOSStopTrackingClient`(`qoshandle` : `super`.`super`.`Foundation`.`HANDLE`, `destaddr` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Networking`.`WinSock`.`SOCKADDR`>?, `flags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=traffic.dll, ABI=system, export=TcAddFilter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TcAddFilter`(`flowhandle` : `super`.`super`.`Foundation`.`HANDLE`, `pgenericfilter` : /* Rust *const */ kotlinx.cinterop.CPointer<`TC_GEN_FILTER`>?, `pfilterhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=traffic.dll, ABI=system, export=TcAddFlow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `TcAddFlow`(`ifchandle` : `super`.`super`.`Foundation`.`HANDLE`, `clflowctx` : `super`.`super`.`Foundation`.`HANDLE`, `flags` : UInt, `pgenericflow` : /* Rust *const */ kotlinx.cinterop.CPointer<`TC_GEN_FLOW`>?, `pflowhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=traffic.dll, ABI=system, export=TcCloseInterface; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TcCloseInterface`(`ifchandle` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=traffic.dll, ABI=system, export=TcDeleteFilter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TcDeleteFilter`(`filterhandle` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=traffic.dll, ABI=system, export=TcDeleteFlow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TcDeleteFlow`(`flowhandle` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=traffic.dll, ABI=system, export=TcDeregisterClient; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TcDeregisterClient`(`clienthandle` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=traffic.dll, ABI=system, export=TcEnumerateFlows; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `TcEnumerateFlows`(`ifchandle` : `super`.`super`.`Foundation`.`HANDLE`, `penumhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?, `pflowcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pbufsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ENUMERATION_BUFFER`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=traffic.dll, ABI=system, export=TcEnumerateInterfaces; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
public external fun `TcEnumerateInterfaces`(`clienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `pbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `interfacebuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`TC_IFC_DESCRIPTOR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=traffic.dll, ABI=system, export=TcGetFlowNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TcGetFlowNameA`(`flowhandle` : `super`.`super`.`Foundation`.`HANDLE`, `strsize` : UInt, `pflowname` : `windows_sys`.`core`.`PSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=traffic.dll, ABI=system, export=TcGetFlowNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TcGetFlowNameW`(`flowhandle` : `super`.`super`.`Foundation`.`HANDLE`, `strsize` : UInt, `pflowname` : `windows_sys`.`core`.`PWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=traffic.dll, ABI=system, export=TcModifyFlow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `TcModifyFlow`(`flowhandle` : `super`.`super`.`Foundation`.`HANDLE`, `pgenericflow` : /* Rust *const */ kotlinx.cinterop.CPointer<`TC_GEN_FLOW`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=traffic.dll, ABI=system, export=TcOpenInterfaceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TcOpenInterfaceA`(`pinterfacename` : `windows_sys`.`core`.`PCSTR`, `clienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `clifcctx` : `super`.`super`.`Foundation`.`HANDLE`, `pifchandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=traffic.dll, ABI=system, export=TcOpenInterfaceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TcOpenInterfaceW`(`pinterfacename` : `windows_sys`.`core`.`PCWSTR`, `clienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `clifcctx` : `super`.`super`.`Foundation`.`HANDLE`, `pifchandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=traffic.dll, ABI=system, export=TcQueryFlowA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TcQueryFlowA`(`pflowname` : `windows_sys`.`core`.`PCSTR`, `pguidparam` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=traffic.dll, ABI=system, export=TcQueryFlowW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TcQueryFlowW`(`pflowname` : `windows_sys`.`core`.`PCWSTR`, `pguidparam` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=traffic.dll, ABI=system, export=TcQueryInterface; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TcQueryInterface`(`ifchandle` : `super`.`super`.`Foundation`.`HANDLE`, `pguidparam` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `notifychange` : Boolean, `pbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=traffic.dll, ABI=system, export=TcRegisterClient; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TcRegisterClient`(`tciversion` : UInt, `clregctx` : `super`.`super`.`Foundation`.`HANDLE`, `clienthandlerlist` : /* Rust *const */ kotlinx.cinterop.CPointer<`TCI_CLIENT_FUNC_LIST`>?, `pclienthandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=traffic.dll, ABI=system, export=TcSetFlowA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TcSetFlowA`(`pflowname` : `windows_sys`.`core`.`PCSTR`, `pguidparam` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `buffersize` : UInt, `buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=traffic.dll, ABI=system, export=TcSetFlowW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TcSetFlowW`(`pflowname` : `windows_sys`.`core`.`PCWSTR`, `pguidparam` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `buffersize` : UInt, `buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=traffic.dll, ABI=system, export=TcSetInterface; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TcSetInterface`(`ifchandle` : `super`.`super`.`Foundation`.`HANDLE`, `pguidparam` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `buffersize` : UInt, `buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
public const val `ABLE_TO_RECV_RSVP`: UInt = 50002u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ADDRESS_LIST_DESCRIPTOR` (
    public var `MediaType`: UInt,
    public var `AddressList`: `super`.`Ndis`.`NETWORK_ADDRESS_LIST`,
)
public const val `ADM_CTRL_FAILED`: UInt = 3u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ADSPEC` (
    public var `adspec_header`: `RsvpObjHdr`,
    public var `adspec_body`: `IS_ADSPEC_BODY`,
)
public const val `AD_FLAG_BREAK_BIT`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `AD_GENERAL_PARAMS` (
    public var `IntServAwareHopCount`: UInt,
    public var `PathBandwidthEstimate`: UInt,
    public var `MinimumLatency`: UInt,
    public var `PathMTU`: UInt,
    public var `Flags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `AD_GUARANTEED` (
    public var `CTotal`: UInt,
    public var `DTotal`: UInt,
    public var `CSum`: UInt,
    public var `DSum`: UInt,
)
public const val `ALLOWED_TO_SEND_DATA`: UInt = 50001u;
public const val `ANY_DEST_ADDR`: UInt = 4294967295u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CBADMITRESULT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`LPM_HANDLE`, `RHANDLE`, UInt, Int, Int, /* Rust *mut */ kotlinx.cinterop.CPointer<`POLICY_DECISION`>?) -> /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CBGETRSVPOBJECTS` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`LPM_HANDLE`, `RHANDLE`, Int, Int, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`RsvpObjHdr`>>?) -> /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?>>>;
public const val `CONTROLLED_DELAY_SERV`: UInt = 4u;
public const val `CONTROLLED_LOAD_SERV`: UInt = 5u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CONTROL_SERVICE` (
    public var `Length`: UInt,
    public var `Service`: UInt,
    public var `Overrides`: `AD_GENERAL_PARAMS`,
    public var `Anonymous`: `CONTROL_SERVICE_0`,
)
// UNSUPPORTED Rust 91:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CONTROL_SERVICE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 96:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CONTROL_SERVICE_0 {
//     pub Guaranteed: AD_GUARANTEED,
//     pub ParamBuffer: [PARAM_BUFFER; 1],
// }

// UNSUPPORTED Rust 102:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CONTROL_SERVICE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CREDENTIAL_SUB_TYPE_ASCII_ID`: UInt = 1u;
public const val `CREDENTIAL_SUB_TYPE_KERBEROS_TKT`: UInt = 3u;
public const val `CREDENTIAL_SUB_TYPE_PGP_CERT`: UInt = 5u;
public const val `CREDENTIAL_SUB_TYPE_UNICODE_ID`: UInt = 2u;
public const val `CREDENTIAL_SUB_TYPE_X509_V3_CERT`: UInt = 4u;
public const val `CURRENT_TCI_VERSION`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CtrlLoadFlowspec` (
    public var `CL_spec_serv_hdr`: `IntServServiceHdr`,
    public var `CL_spec_parm_hdr`: `IntServParmHdr`,
    public var `CL_spec_parms`: `GenTspecParms`,
)
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `DD_TCP_DEVICE_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("\\Device\\Tcp");
public const val `DUP_RESULTS`: UInt = 4u;
public const val `END_TO_END_QOSABILITY`: UInt = 50006u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ENUMERATION_BUFFER` (
    public var `Length`: UInt,
    public var `OwnerProcessId`: UInt,
    public var `FlowNameLength`: UShort,
    public var `FlowName`: UShortArray,
    public var `pFlow`: /* Rust *mut */ kotlinx.cinterop.CPointer<`TC_GEN_FLOW`>?,
    public var `NumberOfFilters`: UInt,
    public var `GenericFilter`: Array<`TC_GEN_FILTER`>,
)
// UNSUPPORTED Rust 135:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for ENUMERATION_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ERROR_ADDRESS_TYPE_NOT_SUPPORTED`: UInt = 7511u;
public const val `ERROR_DS_MAPPING_EXISTS`: UInt = 7518u;
public const val `ERROR_DUPLICATE_FILTER`: UInt = 7509u;
public const val `ERROR_FILTER_CONFLICT`: UInt = 7510u;
public const val `ERROR_INCOMPATABLE_QOS`: UInt = 7513u;
public const val `ERROR_INCOMPATIBLE_TCI_VERSION`: UInt = 7501u;
public const val `ERROR_INVALID_ADDRESS_TYPE`: UInt = 7508u;
public const val `ERROR_INVALID_DIFFSERV_FLOW`: UInt = 7517u;
public const val `ERROR_INVALID_DS_CLASS`: UInt = 7520u;
public const val `ERROR_INVALID_FLOW_MODE`: UInt = 7516u;
public const val `ERROR_INVALID_PEAK_RATE`: UInt = 7504u;
public const val `ERROR_INVALID_QOS_PRIORITY`: UInt = 7506u;
public const val `ERROR_INVALID_SD_MODE`: UInt = 7505u;
public const val `ERROR_INVALID_SERVICE_TYPE`: UInt = 7502u;
public const val `ERROR_INVALID_SHAPE_RATE`: UInt = 7519u;
public const val `ERROR_INVALID_TOKEN_RATE`: UInt = 7503u;
public const val `ERROR_INVALID_TRAFFIC_CLASS`: UInt = 7507u;
public const val `ERROR_NO_MORE_INFO`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ERROR_SPEC` (
    public var `errs_header`: `RsvpObjHdr`,
    public var `errs_u`: `ERROR_SPEC_0`,
)
// UNSUPPORTED Rust 166:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for ERROR_SPEC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 172:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union ERROR_SPEC_0 {
//     pub errs_ipv4: Error_Spec_IPv4,
// }

// UNSUPPORTED Rust 178:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for ERROR_SPEC_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ERROR_SPECF_InPlace`: UInt = 1u;
public const val `ERROR_SPECF_NotGuilty`: UInt = 2u;
public const val `ERROR_TC_NOT_SUPPORTED`: UInt = 7514u;
public const val `ERROR_TC_OBJECT_LENGTH_INVALID`: UInt = 7515u;
public const val `ERROR_TC_SUPPORTED_OBJECTS_EXIST`: UInt = 7512u;
public const val `ERROR_TOO_MANY_CLIENTS`: UInt = 7521u;
public const val `ERR_FORWARD_OK`: UInt = 32768u;
public const val `ERR_Usage_globl`: UInt = 0u;
public const val `ERR_Usage_local`: UInt = 16u;
public const val `ERR_Usage_serv`: UInt = 17u;
public const val `ERR_global_mask`: UInt = 4095u;
public const val `EXPIRED_CREDENTIAL`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `Error_Spec_IPv4` (
    public var `errs_errnode`: `super`.`super`.`Networking`.`WinSock`.`IN_ADDR`,
    public var `errs_flags`: UByte,
    public var `errs_code`: UByte,
    public var `errs_value`: UShort,
)
// UNSUPPORTED Rust 205:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for Error_Spec_IPv4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FILTERSPECV4`: `FilterType` = 1;
public const val `FILTERSPECV4_GPI`: `FilterType` = 4;
public const val `FILTERSPECV6`: `FilterType` = 2;
public const val `FILTERSPECV6_FLOW`: `FilterType` = 3;
public const val `FILTERSPECV6_GPI`: `FilterType` = 5;
public const val `FILTERSPEC_END`: `FilterType` = 6;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FILTER_SPEC` (
    public var `filt_header`: `RsvpObjHdr`,
    public var `filt_u`: `FILTER_SPEC_0`,
)
// UNSUPPORTED Rust 224:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for FILTER_SPEC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 230:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union FILTER_SPEC_0 {
//     pub filt_ipv4: Filter_Spec_IPv4,
//     pub filt_ipv4gpi: Filter_Spec_IPv4GPI,
// }

// UNSUPPORTED Rust 237:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for FILTER_SPEC_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLOWDESCRIPTOR` (
    public var `FlowSpec`: `super`.`super`.`Networking`.`WinSock`.`FLOWSPEC`,
    public var `NumFilters`: UInt,
    public var `FilterList`: /* Rust *mut */ kotlinx.cinterop.CPointer<`RSVP_FILTERSPEC`>?,
)
// UNSUPPORTED Rust 251:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for FLOWDESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLOW_DESC` (
    public var `u1`: `FLOW_DESC_0`,
    public var `u2`: `FLOW_DESC_1`,
)
// UNSUPPORTED Rust 264:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for FLOW_DESC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 270:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union FLOW_DESC_0 {
//     pub stspec: *mut SENDER_TSPEC,
//     pub isflow: *mut IS_FLOWSPEC,
// }

// UNSUPPORTED Rust 277:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for FLOW_DESC_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 283:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union FLOW_DESC_1 {
//     pub stemp: *mut FILTER_SPEC,
//     pub fspec: *mut FILTER_SPEC,
// }

// UNSUPPORTED Rust 290:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for FLOW_DESC_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FLOW_DURATION`: UInt = 5u;
public const val `FORCE_IMMEDIATE_REFRESH`: UInt = 1u;
public const val `FSCTL_TCP_BASE`: UInt = 18u;
public const val `FVEB_UNLOCK_FLAG_AUK_OSFVEINFO`: UInt = 512u;
public const val `FVEB_UNLOCK_FLAG_CACHED`: UInt = 1u;
public const val `FVEB_UNLOCK_FLAG_EXTERNAL`: UInt = 32u;
public const val `FVEB_UNLOCK_FLAG_MEDIA`: UInt = 2u;
public const val `FVEB_UNLOCK_FLAG_NBP`: UInt = 256u;
public const val `FVEB_UNLOCK_FLAG_NONE`: UInt = 0u;
public const val `FVEB_UNLOCK_FLAG_PASSPHRASE`: UInt = 128u;
public const val `FVEB_UNLOCK_FLAG_PIN`: UInt = 16u;
public const val `FVEB_UNLOCK_FLAG_RECOVERY`: UInt = 64u;
public const val `FVEB_UNLOCK_FLAG_TPM`: UInt = 4u;
public typealias `FilterType` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `Filter_Spec_IPv4` (
    public var `filt_ipaddr`: `super`.`super`.`Networking`.`WinSock`.`IN_ADDR`,
    public var `filt_unused`: UShort,
    public var `filt_port`: UShort,
)
// UNSUPPORTED Rust 318:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for Filter_Spec_IPv4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `Filter_Spec_IPv4GPI` (
    public var `filt_ipaddr`: `super`.`super`.`Networking`.`WinSock`.`IN_ADDR`,
    public var `filt_gpi`: UInt,
)
// UNSUPPORTED Rust 331:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for Filter_Spec_IPv4GPI {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `GENERAL_INFO`: UInt = 1u;
public const val `GQOS_API`: UInt = 56400u;
public const val `GQOS_ERRORCODE_UNKNOWN`: UInt = 4294967295u;
public const val `GQOS_ERRORVALUE_UNKNOWN`: UInt = 4294967295u;
public const val `GQOS_KERNEL_TC`: UInt = 56700u;
public const val `GQOS_KERNEL_TC_SYS`: UInt = 56500u;
public const val `GQOS_NET_ADMISSION`: UInt = 56100u;
public const val `GQOS_NET_POLICY`: UInt = 56200u;
public const val `GQOS_NO_ERRORCODE`: UInt = 0u;
public const val `GQOS_NO_ERRORVALUE`: UInt = 0u;
public const val `GQOS_RSVP`: UInt = 56300u;
public const val `GQOS_RSVP_SYS`: UInt = 56600u;
public const val `GUARANTEED_SERV`: UInt = 2u;
public const val `GUAR_ADSPARM_C`: Int = 131;
public const val `GUAR_ADSPARM_Csum`: Int = 135;
public const val `GUAR_ADSPARM_Ctot`: Int = 133;
public const val `GUAR_ADSPARM_D`: Int = 132;
public const val `GUAR_ADSPARM_Dsum`: Int = 136;
public const val `GUAR_ADSPARM_Dtot`: Int = 134;
// UNSUPPORTED Rust 356:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_QOS_BESTEFFORT_BANDWIDTH: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xed885290_40ec_11d1_2c91_00aa00574915);

// UNSUPPORTED Rust 357:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_QOS_ENABLE_AVG_STATS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbafb6d11_27c4_4801_a46f_ef8080c188c8);

// UNSUPPORTED Rust 358:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_QOS_ENABLE_WINDOW_ADJUSTMENT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xaa966725_d3e9_4c55_b335_2a00279a1e64);

// UNSUPPORTED Rust 359:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_QOS_FLOW_8021P_CONFORMING: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x08c1e013_fcd2_11d2_be1e_00a0c99ee63b);

// UNSUPPORTED Rust 360:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_QOS_FLOW_8021P_NONCONFORMING: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x09023f91_fcd2_11d2_be1e_00a0c99ee63b);

// UNSUPPORTED Rust 361:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_QOS_FLOW_COUNT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1147f880_40ed_11d1_2c91_00aa00574915);

// UNSUPPORTED Rust 362:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_QOS_FLOW_IP_CONFORMING: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x07f99a8b_fcd2_11d2_be1e_00a0c99ee63b);

// UNSUPPORTED Rust 363:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_QOS_FLOW_IP_NONCONFORMING: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x087a5987_fcd2_11d2_be1e_00a0c99ee63b);

// UNSUPPORTED Rust 364:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_QOS_FLOW_MODE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5c82290a_515a_11d2_8e58_00c04fc9bfcb);

// UNSUPPORTED Rust 365:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_QOS_ISSLOW_FLOW: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xabf273a4_ee07_11d2_be1b_00a0c99ee63b);

// UNSUPPORTED Rust 366:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_QOS_LATENCY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfc408ef0_40ec_11d1_2c91_00aa00574915);

// UNSUPPORTED Rust 367:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_QOS_MAX_OUTSTANDING_SENDS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x161ffa86_6120_11d1_2c91_00aa00574915);

// UNSUPPORTED Rust 368:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_QOS_NON_BESTEFFORT_LIMIT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x185c44e0_40ed_11d1_2c91_00aa00574915);

// UNSUPPORTED Rust 369:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_QOS_REMAINING_BANDWIDTH: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc4c51720_40ec_11d1_2c91_00aa00574915);

// UNSUPPORTED Rust 370:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_QOS_STATISTICS_BUFFER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbb2c0980_e900_11d1_b07e_0080c71382bf);

// UNSUPPORTED Rust 371:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_QOS_TIMER_RESOLUTION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xba10cc88_f13e_11d2_be1b_00a0c99ee63b);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `Gads_parms_t` (
    public var `Gads_serv_hdr`: `IntServServiceHdr`,
    public var `Gads_Ctot_hdr`: `IntServParmHdr`,
    public var `Gads_Ctot`: UInt,
    public var `Gads_Dtot_hdr`: `IntServParmHdr`,
    public var `Gads_Dtot`: UInt,
    public var `Gads_Csum_hdr`: `IntServParmHdr`,
    public var `Gads_Csum`: UInt,
    public var `Gads_Dsum_hdr`: `IntServParmHdr`,
    public var `Gads_Dsum`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `GenAdspecParams` (
    public var `gen_parm_hdr`: `IntServServiceHdr`,
    public var `gen_parm_hopcnt_hdr`: `IntServParmHdr`,
    public var `gen_parm_hopcnt`: UInt,
    public var `gen_parm_pathbw_hdr`: `IntServParmHdr`,
    public var `gen_parm_path_bw`: Float,
    public var `gen_parm_minlat_hdr`: `IntServParmHdr`,
    public var `gen_parm_min_latency`: UInt,
    public var `gen_parm_compmtu_hdr`: `IntServParmHdr`,
    public var `gen_parm_composed_MTU`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `GenTspec` (
    public var `gen_Tspec_serv_hdr`: `IntServServiceHdr`,
    public var `gen_Tspec_parm_hdr`: `IntServParmHdr`,
    public var `gen_Tspec_parms`: `GenTspecParms`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `GenTspecParms` (
    public var `TB_Tspec_r`: Float,
    public var `TB_Tspec_b`: Float,
    public var `TB_Tspec_p`: Float,
    public var `TB_Tspec_m`: UInt,
    public var `TB_Tspec_M`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `GuarFlowSpec` (
    public var `Guar_serv_hdr`: `IntServServiceHdr`,
    public var `Guar_Tspec_hdr`: `IntServParmHdr`,
    public var `Guar_Tspec_parms`: `GenTspecParms`,
    public var `Guar_Rspec_hdr`: `IntServParmHdr`,
    public var `Guar_Rspec`: `GuarRspec`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `GuarRspec` (
    public var `Guar_R`: Float,
    public var `Guar_S`: UInt,
)
public const val `HIGHLY_DELAY_SENSITIVE`: UInt = 4294967294u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 64 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HSP_UPGRADE_IMAGEDATA` (
    public var `hashAlgID`: UShort,
    public var `digestSize`: UShort,
    public var `digest`: UByteArray,
    public var `fileName`: UShortArray,
)
// UNSUPPORTED Rust 438:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HSP_UPGRADE_IMAGEDATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IDENTITY_CHANGED`: UInt = 5u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IDPE_ATTR` (
    public var `PeAttribLength`: UShort,
    public var `PeAttribType`: UByte,
    public var `PeAttribSubType`: UByte,
    public var `PeAttribValue`: UByteArray,
)
// UNSUPPORTED Rust 452:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IDPE_ATTR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ID_ERROR_OBJECT` (
    public var `usIdErrLength`: UShort,
    public var `ucAType`: UByte,
    public var `ucSubType`: UByte,
    public var `usReserved`: UShort,
    public var `usIdErrorValue`: UShort,
    public var `ucIdErrData`: UByteArray,
)
// UNSUPPORTED Rust 467:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ID_ERROR_OBJECT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IF_MIB_STATS_ID`: UInt = 1u;
public const val `INFO_NOT_AVAILABLE`: UInt = 4294967295u;
public const val `INSUFFICIENT_PRIVILEGES`: UInt = 3u;
public const val `INTSERV_VERSION0`: UInt = 0u;
public const val `INTSERV_VERS_MASK`: UInt = 240u;
public const val `INV_LPM_HANDLE`: UInt = 1u;
public const val `INV_REQ_HANDLE`: UInt = 3u;
public const val `INV_RESULTS`: UInt = 5u;
// UNSUPPORTED Rust 480:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IN_ADDR_IPV4 {
//     pub Addr: u32,
//     pub AddrBytes: [u8; 4],
// }

// UNSUPPORTED Rust 486:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IN_ADDR_IPV4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IN_ADDR_IPV6` (
    public var `Addr`: UByteArray,
)
// UNSUPPORTED Rust 496:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IN_ADDR_IPV6 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IPX_PATTERN` (
    public var `Src`: `IPX_PATTERN_0`,
    public var `Dest`: `IPX_PATTERN_0`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IPX_PATTERN_0` (
    public var `NetworkAddress`: UInt,
    public var `NodeAddress`: UByteArray,
    public var `Socket`: UShort,
)
// UNSUPPORTED Rust 514:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPX_PATTERN_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IP_INTFC_INFO_ID`: UInt = 259u;
public const val `IP_MIB_ADDRTABLE_ENTRY_ID`: UInt = 258u;
public const val `IP_MIB_STATS_ID`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IP_PATTERN` (
    public var `Reserved1`: UInt,
    public var `Reserved2`: UInt,
    public var `SrcAddr`: UInt,
    public var `DstAddr`: UInt,
    public var `S_un`: `IP_PATTERN_0`,
    public var `ProtocolId`: UByte,
    public var `Reserved3`: UByteArray,
)
// UNSUPPORTED Rust 533:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IP_PATTERN {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 538:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IP_PATTERN_0 {
//     pub S_un_ports: IP_PATTERN_0_0,
//     pub S_un_icmp: IP_PATTERN_0_1,
//     pub S_Spi: u32,
// }

// UNSUPPORTED Rust 545:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IP_PATTERN_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IP_PATTERN_0_1` (
    public var `s_type`: UByte,
    public var `s_code`: UByte,
    public var `filler`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IP_PATTERN_0_0` (
    public var `s_srcport`: UShort,
    public var `s_dstport`: UShort,
)
public const val `ISPH_FLG_INV`: UInt = 128u;
public const val `ISSH_BREAK_BIT`: UInt = 128u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IS_ADSPEC_BODY` (
    public var `adspec_mh`: `IntServMainHdr`,
    public var `adspec_genparms`: `GenAdspecParams`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IS_FLOWSPEC` (
    public var `flow_header`: `RsvpObjHdr`,
    public var `flow_body`: `IntServFlowSpec`,
)
// UNSUPPORTED Rust 577:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IS_FLOWSPEC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IS_GUAR_RSPEC`: Int = 130;
public const val `IS_WKP_COMPOSED_MTU`: `int_serv_wkp` = 10;
public const val `IS_WKP_HOP_CNT`: `int_serv_wkp` = 4;
public const val `IS_WKP_MIN_LATENCY`: `int_serv_wkp` = 8;
public const val `IS_WKP_PATH_BW`: `int_serv_wkp` = 6;
public const val `IS_WKP_Q_TSPEC`: `int_serv_wkp` = 128;
public const val `IS_WKP_TB_TSPEC`: `int_serv_wkp` = 127;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IntServFlowSpec` (
    public var `spec_mh`: `IntServMainHdr`,
    public var `spec_u`: `IntServFlowSpec_0`,
)
// UNSUPPORTED Rust 595:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IntServFlowSpec {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 600:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IntServFlowSpec_0 {
//     pub CL_spec: CtrlLoadFlowspec,
//     pub G_spec: GuarFlowSpec,
//     pub Q_spec: QualAppFlowSpec,
// }

// UNSUPPORTED Rust 607:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IntServFlowSpec_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IntServMainHdr` (
    public var `ismh_version`: UByte,
    public var `ismh_unused`: UByte,
    public var `ismh_len32b`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IntServParmHdr` (
    public var `isph_parm_num`: UByte,
    public var `isph_flags`: UByte,
    public var `isph_len32b`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IntServServiceHdr` (
    public var `issh_service`: UByte,
    public var `issh_flags`: UByte,
    public var `issh_len32b`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IntServTspecBody` (
    public var `st_mh`: `IntServMainHdr`,
    public var `tspec_u`: `IntServTspecBody_0`,
)
// UNSUPPORTED Rust 639:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IntServTspecBody {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 644:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IntServTspecBody_0 {
//     pub gen_stspec: GenTspec,
//     pub qual_stspec: QualTspec,
// }

// UNSUPPORTED Rust 650:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IntServTspecBody_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `LINE_RATE`: UInt = 50003u;
public const val `LOCAL_QOSABILITY`: UInt = 50005u;
public const val `LOCAL_TRAFFIC_CONTROL`: UInt = 50004u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LPMIPTABLE` (
    public var `ulIfIndex`: UInt,
    public var `MediaType`: UInt,
    public var `IfIpAddr`: `super`.`super`.`Networking`.`WinSock`.`IN_ADDR`,
    public var `IfNetMask`: `super`.`super`.`Networking`.`WinSock`.`IN_ADDR`,
)
// UNSUPPORTED Rust 667:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for LPMIPTABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `LPM_API_VERSION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPM_HANDLE` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LPM_INIT_INFO` (
    public var `PcmVersionNumber`: UInt,
    public var `ResultTimeLimit`: UInt,
    public var `ConfiguredLpmCount`: Int,
    public var `AllocMemory`: `PALLOCMEM`,
    public var `FreeMemory`: `PFREEMEM`,
    public var `PcmAdmitResultCallback`: `CBADMITRESULT`,
    public var `GetRsvpObjectsCallback`: `CBGETRSVPOBJECTS`,
)
public const val `LPM_OK`: UInt = 0u;
public const val `LPM_PE_ALL_TYPES`: UInt = 0u;
public const val `LPM_PE_APP_IDENTITY`: UInt = 3u;
public const val `LPM_PE_USER_IDENTITY`: UInt = 2u;
public const val `LPM_RESULT_DEFER`: UInt = 1u;
public const val `LPM_RESULT_READY`: UInt = 0u;
public const val `LPM_TIME_OUT`: UInt = 2u;
public const val `LPV_DONT_CARE`: UInt = 65534u;
public const val `LPV_DROP_MSG`: UInt = 65533u;
public const val `LPV_MAX_PRIORITY`: UInt = 65280u;
public const val `LPV_MIN_PRIORITY`: UInt = 1u;
public const val `LPV_REJECT`: UInt = 65535u;
public const val `LPV_RESERVED`: UInt = 0u;
public const val `MAX_HSP_UPGRADE_FILENAME_LENGTH`: UInt = 64u;
public const val `MAX_PHYSADDR_SIZE`: UInt = 8u;
public const val `MAX_STRING_LENGTH`: UInt = 256u;
public const val `MODERATELY_DELAY_SENSITIVE`: UInt = 4294967293u;
public const val `OSDEVICE_TYPE_BLOCKIO_CDROM`: UInt = 65539u;
public const val `OSDEVICE_TYPE_BLOCKIO_FILE`: UInt = 65541u;
public const val `OSDEVICE_TYPE_BLOCKIO_HARDDISK`: UInt = 65537u;
public const val `OSDEVICE_TYPE_BLOCKIO_PARTITION`: UInt = 65540u;
public const val `OSDEVICE_TYPE_BLOCKIO_RAMDISK`: UInt = 65542u;
public const val `OSDEVICE_TYPE_BLOCKIO_REMOVABLEDISK`: UInt = 65538u;
public const val `OSDEVICE_TYPE_BLOCKIO_VIRTUALHARDDISK`: UInt = 65543u;
public const val `OSDEVICE_TYPE_CIMFS`: UInt = 393216u;
public const val `OSDEVICE_TYPE_COMPOSITE`: UInt = 327680u;
public const val `OSDEVICE_TYPE_SERIAL`: UInt = 131072u;
public const val `OSDEVICE_TYPE_UDP`: UInt = 196608u;
public const val `OSDEVICE_TYPE_UNKNOWN`: UInt = 0u;
public const val `OSDEVICE_TYPE_VMBUS`: UInt = 262144u;
public const val `Opt_Distinct`: UInt = 8u;
public const val `Opt_Explicit`: UInt = 2u;
public const val `Opt_Share_mask`: UInt = 24u;
public const val `Opt_Shared`: UInt = 16u;
public const val `Opt_SndSel_mask`: UInt = 7u;
public const val `Opt_Wildcard`: UInt = 1u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PALLOCMEM` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt) -> /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PARAM_BUFFER` (
    public var `ParameterId`: UInt,
    public var `Length`: UInt,
    public var `Buffer`: UByteArray,
)
// UNSUPPORTED Rust 730:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PARAM_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PCM_VERSION_1`: UInt = 1u;
public const val `PE_ATTRIB_TYPE_CREDENTIAL`: UInt = 2u;
public const val `PE_ATTRIB_TYPE_POLICY_LOCATOR`: UInt = 1u;
public const val `PE_TYPE_APPID`: UInt = 3u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFREEMEM` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `POLICY_DATA` (
    public var `PolicyObjHdr`: `RsvpObjHdr`,
    public var `usPeOffset`: UShort,
    public var `usReserved`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `POLICY_DECISION` (
    public var `lpvResult`: UInt,
    public var `wPolicyErrCode`: UShort,
    public var `wPolicyErrValue`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `POLICY_ELEMENT` (
    public var `usPeLength`: UShort,
    public var `usPeType`: UShort,
    public var `ucPeData`: UByteArray,
)
// UNSUPPORTED Rust 761:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for POLICY_ELEMENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `POLICY_ERRV_CRAZY_FLOWSPEC`: UInt = 57u;
public const val `POLICY_ERRV_EXPIRED_CREDENTIALS`: UInt = 4u;
public const val `POLICY_ERRV_EXPIRED_USER_TOKEN`: UInt = 51u;
public const val `POLICY_ERRV_GLOBAL_DEF_FLOW_COUNT`: UInt = 1u;
public const val `POLICY_ERRV_GLOBAL_DEF_FLOW_DURATION`: UInt = 9u;
public const val `POLICY_ERRV_GLOBAL_DEF_FLOW_RATE`: UInt = 17u;
public const val `POLICY_ERRV_GLOBAL_DEF_PEAK_RATE`: UInt = 25u;
public const val `POLICY_ERRV_GLOBAL_DEF_SUM_FLOW_RATE`: UInt = 33u;
public const val `POLICY_ERRV_GLOBAL_DEF_SUM_PEAK_RATE`: UInt = 41u;
public const val `POLICY_ERRV_GLOBAL_GRP_FLOW_COUNT`: UInt = 2u;
public const val `POLICY_ERRV_GLOBAL_GRP_FLOW_DURATION`: UInt = 10u;
public const val `POLICY_ERRV_GLOBAL_GRP_FLOW_RATE`: UInt = 18u;
public const val `POLICY_ERRV_GLOBAL_GRP_PEAK_RATE`: UInt = 26u;
public const val `POLICY_ERRV_GLOBAL_GRP_SUM_FLOW_RATE`: UInt = 34u;
public const val `POLICY_ERRV_GLOBAL_GRP_SUM_PEAK_RATE`: UInt = 42u;
public const val `POLICY_ERRV_GLOBAL_UNAUTH_USER_FLOW_COUNT`: UInt = 4u;
public const val `POLICY_ERRV_GLOBAL_UNAUTH_USER_FLOW_DURATION`: UInt = 12u;
public const val `POLICY_ERRV_GLOBAL_UNAUTH_USER_FLOW_RATE`: UInt = 20u;
public const val `POLICY_ERRV_GLOBAL_UNAUTH_USER_PEAK_RATE`: UInt = 28u;
public const val `POLICY_ERRV_GLOBAL_UNAUTH_USER_SUM_FLOW_RATE`: UInt = 36u;
public const val `POLICY_ERRV_GLOBAL_UNAUTH_USER_SUM_PEAK_RATE`: UInt = 44u;
public const val `POLICY_ERRV_GLOBAL_USER_FLOW_COUNT`: UInt = 3u;
public const val `POLICY_ERRV_GLOBAL_USER_FLOW_DURATION`: UInt = 11u;
public const val `POLICY_ERRV_GLOBAL_USER_FLOW_RATE`: UInt = 19u;
public const val `POLICY_ERRV_GLOBAL_USER_PEAK_RATE`: UInt = 27u;
public const val `POLICY_ERRV_GLOBAL_USER_SUM_FLOW_RATE`: UInt = 35u;
public const val `POLICY_ERRV_GLOBAL_USER_SUM_PEAK_RATE`: UInt = 43u;
public const val `POLICY_ERRV_IDENTITY_CHANGED`: UInt = 5u;
public const val `POLICY_ERRV_INSUFFICIENT_PRIVILEGES`: UInt = 3u;
public const val `POLICY_ERRV_NO_ACCEPTS`: UInt = 55u;
public const val `POLICY_ERRV_NO_MEMORY`: UInt = 56u;
public const val `POLICY_ERRV_NO_MORE_INFO`: UInt = 1u;
public const val `POLICY_ERRV_NO_PRIVILEGES`: UInt = 50u;
public const val `POLICY_ERRV_NO_RESOURCES`: UInt = 52u;
public const val `POLICY_ERRV_PRE_EMPTED`: UInt = 53u;
public const val `POLICY_ERRV_SUBNET_DEF_FLOW_COUNT`: UInt = 5u;
public const val `POLICY_ERRV_SUBNET_DEF_FLOW_DURATION`: UInt = 13u;
public const val `POLICY_ERRV_SUBNET_DEF_FLOW_RATE`: UInt = 21u;
public const val `POLICY_ERRV_SUBNET_DEF_PEAK_RATE`: UInt = 29u;
public const val `POLICY_ERRV_SUBNET_DEF_SUM_FLOW_RATE`: UInt = 37u;
public const val `POLICY_ERRV_SUBNET_DEF_SUM_PEAK_RATE`: UInt = 45u;
public const val `POLICY_ERRV_SUBNET_GRP_FLOW_COUNT`: UInt = 6u;
public const val `POLICY_ERRV_SUBNET_GRP_FLOW_DURATION`: UInt = 14u;
public const val `POLICY_ERRV_SUBNET_GRP_FLOW_RATE`: UInt = 22u;
public const val `POLICY_ERRV_SUBNET_GRP_PEAK_RATE`: UInt = 30u;
public const val `POLICY_ERRV_SUBNET_GRP_SUM_FLOW_RATE`: UInt = 38u;
public const val `POLICY_ERRV_SUBNET_GRP_SUM_PEAK_RATE`: UInt = 46u;
public const val `POLICY_ERRV_SUBNET_UNAUTH_USER_FLOW_COUNT`: UInt = 8u;
public const val `POLICY_ERRV_SUBNET_UNAUTH_USER_FLOW_DURATION`: UInt = 16u;
public const val `POLICY_ERRV_SUBNET_UNAUTH_USER_FLOW_RATE`: UInt = 24u;
public const val `POLICY_ERRV_SUBNET_UNAUTH_USER_PEAK_RATE`: UInt = 32u;
public const val `POLICY_ERRV_SUBNET_UNAUTH_USER_SUM_FLOW_RATE`: UInt = 40u;
public const val `POLICY_ERRV_SUBNET_UNAUTH_USER_SUM_PEAK_RATE`: UInt = 48u;
public const val `POLICY_ERRV_SUBNET_USER_FLOW_COUNT`: UInt = 7u;
public const val `POLICY_ERRV_SUBNET_USER_FLOW_DURATION`: UInt = 15u;
public const val `POLICY_ERRV_SUBNET_USER_FLOW_RATE`: UInt = 23u;
public const val `POLICY_ERRV_SUBNET_USER_PEAK_RATE`: UInt = 31u;
public const val `POLICY_ERRV_SUBNET_USER_SUM_FLOW_RATE`: UInt = 39u;
public const val `POLICY_ERRV_SUBNET_USER_SUM_PEAK_RATE`: UInt = 47u;
public const val `POLICY_ERRV_UNKNOWN`: UInt = 0u;
public const val `POLICY_ERRV_UNKNOWN_USER`: UInt = 49u;
public const val `POLICY_ERRV_UNSUPPORTED_CREDENTIAL_TYPE`: UInt = 2u;
public const val `POLICY_ERRV_USER_CHANGED`: UInt = 54u;
public const val `POLICY_LOCATOR_SUB_TYPE_ASCII_DN`: UInt = 1u;
public const val `POLICY_LOCATOR_SUB_TYPE_ASCII_DN_ENC`: UInt = 3u;
public const val `POLICY_LOCATOR_SUB_TYPE_UNICODE_DN`: UInt = 2u;
public const val `POLICY_LOCATOR_SUB_TYPE_UNICODE_DN_ENC`: UInt = 4u;
public const val `POSITIVE_INFINITY_RATE`: UInt = 4294967294u;
public const val `PREDICTIVE_SERV`: UInt = 3u;
public const val `QOSFlowRateCongestion`: `QOS_FLOWRATE_REASON` = 2;
public const val `QOSFlowRateContentChange`: `QOS_FLOWRATE_REASON` = 1;
public const val `QOSFlowRateHigherContentEncoding`: `QOS_FLOWRATE_REASON` = 3;
public const val `QOSFlowRateNotApplicable`: `QOS_FLOWRATE_REASON` = 0;
public const val `QOSFlowRateUserCaused`: `QOS_FLOWRATE_REASON` = 4;
public const val `QOSNotifyAvailable`: `QOS_NOTIFY_FLOW` = 2;
public const val `QOSNotifyCongested`: `QOS_NOTIFY_FLOW` = 0;
public const val `QOSNotifyUncongested`: `QOS_NOTIFY_FLOW` = 1;
public const val `QOSQueryFlowFundamentals`: `QOS_QUERY_FLOW` = 0;
public const val `QOSQueryOutgoingRate`: `QOS_QUERY_FLOW` = 2;
public const val `QOSQueryPacketPriority`: `QOS_QUERY_FLOW` = 1;
public const val `QOSSPBASE`: UInt = 50000u;
public const val `QOSSP_ERR_BASE`: UInt = 56000u;
public const val `QOSSetOutgoingDSCPValue`: `QOS_SET_FLOW` = 2;
public const val `QOSSetOutgoingRate`: `QOS_SET_FLOW` = 1;
public const val `QOSSetTrafficType`: `QOS_SET_FLOW` = 0;
public const val `QOSShapeAndMark`: `QOS_SHAPING` = 1;
public const val `QOSShapeOnly`: `QOS_SHAPING` = 0;
public const val `QOSTrafficTypeAudioVideo`: `QOS_TRAFFIC_TYPE` = 3;
public const val `QOSTrafficTypeBackground`: `QOS_TRAFFIC_TYPE` = 1;
public const val `QOSTrafficTypeBestEffort`: `QOS_TRAFFIC_TYPE` = 0;
public const val `QOSTrafficTypeControl`: `QOS_TRAFFIC_TYPE` = 5;
public const val `QOSTrafficTypeExcellentEffort`: `QOS_TRAFFIC_TYPE` = 2;
public const val `QOSTrafficTypeVoice`: `QOS_TRAFFIC_TYPE` = 4;
public const val `QOSUseNonConformantMarkings`: `QOS_SHAPING` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `QOS_DESTADDR` (
    public var `ObjectHdr`: `QOS_OBJECT_HDR`,
    public var `SocketAddress`: /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Networking`.`WinSock`.`SOCKADDR`>?,
    public var `SocketAddressLength`: UInt,
)
// UNSUPPORTED Rust 868:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for QOS_DESTADDR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `QOS_DIFFSERV` (
    public var `ObjectHdr`: `QOS_OBJECT_HDR`,
    public var `DSFieldCount`: UInt,
    public var `DiffservRule`: UByteArray,
)
// UNSUPPORTED Rust 881:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for QOS_DIFFSERV {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `QOS_DIFFSERV_RULE` (
    public var `InboundDSField`: UByte,
    public var `ConformingOutboundDSField`: UByte,
    public var `NonConformingOutboundDSField`: UByte,
    public var `ConformingUserPriority`: UByte,
    public var `NonConformingUserPriority`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `QOS_DS_CLASS` (
    public var `ObjectHdr`: `QOS_OBJECT_HDR`,
    public var `DSField`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `QOS_FLOWRATE_OUTGOING` (
    public var `Bandwidth`: ULong,
    public var `ShapingBehavior`: `QOS_SHAPING`,
    public var `Reason`: `QOS_FLOWRATE_REASON`,
)
public typealias `QOS_FLOWRATE_REASON` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `QOS_FLOW_FUNDAMENTALS` (
    public var `BottleneckBandwidthSet`: `windows_sys`.`core`.`BOOL`,
    public var `BottleneckBandwidth`: ULong,
    public var `AvailableBandwidthSet`: `windows_sys`.`core`.`BOOL`,
    public var `AvailableBandwidth`: ULong,
    public var `RTTSet`: `windows_sys`.`core`.`BOOL`,
    public var `RTT`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `QOS_FRIENDLY_NAME` (
    public var `ObjectHdr`: `QOS_OBJECT_HDR`,
    public var `FriendlyName`: UShortArray,
)
// UNSUPPORTED Rust 925:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for QOS_FRIENDLY_NAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `QOS_GENERAL_ID_BASE`: UInt = 2000u;
public const val `QOS_MAX_OBJECT_STRING_LENGTH`: UInt = 256u;
public const val `QOS_NON_ADAPTIVE_FLOW`: UInt = 2u;
public typealias `QOS_NOTIFY_FLOW` = Int;
public const val `QOS_NOT_SPECIFIED`: UInt = 4294967295u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `QOS_OBJECT_HDR` (
    public var `ObjectType`: UInt,
    public var `ObjectLength`: UInt,
)
public const val `QOS_OUTGOING_DEFAULT_MINIMUM_BANDWIDTH`: UInt = 4294967295u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `QOS_PACKET_PRIORITY` (
    public var `ConformantDSCPValue`: UInt,
    public var `NonConformantDSCPValue`: UInt,
    public var `ConformantL2Value`: UInt,
    public var `NonConformantL2Value`: UInt,
)
public const val `QOS_QUERYFLOW_FRESH`: UInt = 1u;
public typealias `QOS_QUERY_FLOW` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `QOS_SD_MODE` (
    public var `ObjectHdr`: `QOS_OBJECT_HDR`,
    public var `ShapeDiscardMode`: UInt,
)
public typealias `QOS_SET_FLOW` = Int;
public typealias `QOS_SHAPING` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `QOS_SHAPING_RATE` (
    public var `ObjectHdr`: `QOS_OBJECT_HDR`,
    public var `ShapingRate`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `QOS_TCP_TRAFFIC` (
    public var `ObjectHdr`: `QOS_OBJECT_HDR`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `QOS_TRAFFIC_CLASS` (
    public var `ObjectHdr`: `QOS_OBJECT_HDR`,
    public var `TrafficClass`: UInt,
)
public const val `QOS_TRAFFIC_GENERAL_ID_BASE`: UInt = 4000u;
public typealias `QOS_TRAFFIC_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `QOS_VERSION` (
    public var `MajorVersion`: UShort,
    public var `MinorVersion`: UShort,
)
public const val `QUALITATIVE_SERV`: UInt = 6u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `QualAppFlowSpec` (
    public var `Q_spec_serv_hdr`: `IntServServiceHdr`,
    public var `Q_spec_parm_hdr`: `IntServParmHdr`,
    public var `Q_spec_parms`: `QualTspecParms`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `QualTspec` (
    public var `qual_Tspec_serv_hdr`: `IntServServiceHdr`,
    public var `qual_Tspec_parm_hdr`: `IntServParmHdr`,
    public var `qual_Tspec_parms`: `QualTspecParms`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `QualTspecParms` (
    public var `TB_Tspec_M`: UInt,
)
public const val `RCVD_PATH_TEAR`: UInt = 1u;
public const val `RCVD_RESV_TEAR`: UInt = 2u;
public const val `RESOURCES_ALLOCATED`: UInt = 1u;
public const val `RESOURCES_MODIFIED`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RESV_STYLE` (
    public var `style_header`: `RsvpObjHdr`,
    public var `style_word`: UInt,
)
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `RHANDLE` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RSVP_ADSPEC` (
    public var `ObjectHdr`: `QOS_OBJECT_HDR`,
    public var `GeneralParams`: `AD_GENERAL_PARAMS`,
    public var `NumberOfServices`: UInt,
    public var `Services`: Array<`CONTROL_SERVICE`>,
)
// UNSUPPORTED Rust 1024:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RSVP_ADSPEC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RSVP_DEFAULT_STYLE`: UInt = 0u;
public const val `RSVP_Err_ADMISSION`: UInt = 1u;
public const val `RSVP_Err_AMBIG_FILTER`: UInt = 9u;
public const val `RSVP_Err_API_ERROR`: UInt = 20u;
public const val `RSVP_Err_BAD_DSTPORT`: UInt = 7u;
public const val `RSVP_Err_BAD_SNDPORT`: UInt = 8u;
public const val `RSVP_Err_BAD_STYLE`: UInt = 5u;
public const val `RSVP_Err_NONE`: UInt = 0u;
public const val `RSVP_Err_NO_PATH`: UInt = 3u;
public const val `RSVP_Err_NO_SENDER`: UInt = 4u;
public const val `RSVP_Err_POLICY`: UInt = 2u;
public const val `RSVP_Err_PREEMPTED`: UInt = 12u;
public const val `RSVP_Err_RSVP_SYS_ERROR`: UInt = 23u;
public const val `RSVP_Err_TC_ERROR`: UInt = 21u;
public const val `RSVP_Err_TC_SYS_ERROR`: UInt = 22u;
public const val `RSVP_Err_UNKNOWN_CTYPE`: UInt = 14u;
public const val `RSVP_Err_UNKNOWN_STYLE`: UInt = 6u;
public const val `RSVP_Err_UNKN_OBJ_CLASS`: UInt = 13u;
public const val `RSVP_Erv_API`: UInt = 2u;
public const val `RSVP_Erv_Bandwidth`: UInt = 2u;
public const val `RSVP_Erv_Bucket_szie`: UInt = 32770u;
public const val `RSVP_Erv_Conflict_Serv`: UInt = 1u;
public const val `RSVP_Erv_Crazy_Flowspec`: UInt = 3u;
public const val `RSVP_Erv_Crazy_Tspec`: UInt = 4u;
public const val `RSVP_Erv_DelayBnd`: UInt = 1u;
public const val `RSVP_Erv_Flow_Rate`: UInt = 32769u;
public const val `RSVP_Erv_MEMORY`: UInt = 1u;
public const val `RSVP_Erv_MTU`: UInt = 3u;
public const val `RSVP_Erv_Min_Policied_size`: UInt = 32772u;
public const val `RSVP_Erv_No_Serv`: UInt = 2u;
public const val `RSVP_Erv_Nonev`: UInt = 0u;
public const val `RSVP_Erv_Other`: UInt = 0u;
public const val `RSVP_Erv_Peak_Rate`: UInt = 32771u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RSVP_FILTERSPEC` (
    public var `Type`: `FilterType`,
    public var `Anonymous`: `RSVP_FILTERSPEC_0`,
)
// UNSUPPORTED Rust 1068:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RSVP_FILTERSPEC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1073:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union RSVP_FILTERSPEC_0 {
//     pub FilterSpecV4: RSVP_FILTERSPEC_V4,
//     pub FilterSpecV6: RSVP_FILTERSPEC_V6,
//     pub FilterSpecV6Flow: RSVP_FILTERSPEC_V6_FLOW,
//     pub FilterSpecV4Gpi: RSVP_FILTERSPEC_V4_GPI,
//     pub FilterSpecV6Gpi: RSVP_FILTERSPEC_V6_GPI,
// }

// UNSUPPORTED Rust 1082:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RSVP_FILTERSPEC_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RSVP_FILTERSPEC_V4` (
    public var `Address`: `IN_ADDR_IPV4`,
    public var `Unused`: UShort,
    public var `Port`: UShort,
)
// UNSUPPORTED Rust 1094:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RSVP_FILTERSPEC_V4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RSVP_FILTERSPEC_V4_GPI` (
    public var `Address`: `IN_ADDR_IPV4`,
    public var `GeneralPortId`: UInt,
)
// UNSUPPORTED Rust 1105:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RSVP_FILTERSPEC_V4_GPI {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RSVP_FILTERSPEC_V6` (
    public var `Address`: `IN_ADDR_IPV6`,
    public var `UnUsed`: UShort,
    public var `Port`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RSVP_FILTERSPEC_V6_FLOW` (
    public var `Address`: `IN_ADDR_IPV6`,
    public var `UnUsed`: UByte,
    public var `FlowLabel`: UByteArray,
)
// UNSUPPORTED Rust 1124:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RSVP_FILTERSPEC_V6_FLOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RSVP_FILTERSPEC_V6_GPI` (
    public var `Address`: `IN_ADDR_IPV6`,
    public var `GeneralPortId`: UInt,
)
public const val `RSVP_FIXED_FILTER_STYLE`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RSVP_HOP` (
    public var `hop_header`: `RsvpObjHdr`,
    public var `hop_u`: `RSVP_HOP_0`,
)
// UNSUPPORTED Rust 1143:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for RSVP_HOP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1149:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union RSVP_HOP_0 {
//     pub hop_ipv4: Rsvp_Hop_IPv4,
// }

// UNSUPPORTED Rust 1155:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for RSVP_HOP_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RSVP_MSG_OBJS` (
    public var `RsvpMsgType`: Int,
    public var `pRsvpSession`: /* Rust *mut */ kotlinx.cinterop.CPointer<`RSVP_SESSION`>?,
    public var `pRsvpFromHop`: /* Rust *mut */ kotlinx.cinterop.CPointer<`RSVP_HOP`>?,
    public var `pRsvpToHop`: /* Rust *mut */ kotlinx.cinterop.CPointer<`RSVP_HOP`>?,
    public var `pResvStyle`: /* Rust *mut */ kotlinx.cinterop.CPointer<`RESV_STYLE`>?,
    public var `pRsvpScope`: /* Rust *mut */ kotlinx.cinterop.CPointer<`RSVP_SCOPE`>?,
    public var `FlowDescCount`: Int,
    public var `pFlowDescs`: /* Rust *mut */ kotlinx.cinterop.CPointer<`FLOW_DESC`>?,
    public var `PdObjectCount`: Int,
    public var `ppPdObjects`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`POLICY_DATA`>>?,
    public var `pErrorSpec`: /* Rust *mut */ kotlinx.cinterop.CPointer<`ERROR_SPEC`>?,
    public var `pAdspec`: /* Rust *mut */ kotlinx.cinterop.CPointer<`ADSPEC`>?,
)
// UNSUPPORTED Rust 1178:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for RSVP_MSG_OBJS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RSVP_OBJECT_ID_BASE`: UInt = 1000u;
public const val `RSVP_PATH`: UInt = 1u;
public const val `RSVP_PATH_ERR`: UInt = 3u;
public const val `RSVP_PATH_TEAR`: UInt = 5u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RSVP_POLICY` (
    public var `Len`: UShort,
    public var `Type`: UShort,
    public var `Info`: UByteArray,
)
// UNSUPPORTED Rust 1195:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RSVP_POLICY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RSVP_POLICY_INFO` (
    public var `ObjectHdr`: `QOS_OBJECT_HDR`,
    public var `NumPolicyElement`: UInt,
    public var `PolicyElement`: Array<`RSVP_POLICY`>,
)
// UNSUPPORTED Rust 1207:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RSVP_POLICY_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RSVP_RESERVE_INFO` (
    public var `ObjectHdr`: `QOS_OBJECT_HDR`,
    public var `Style`: UInt,
    public var `ConfirmRequest`: UInt,
    public var `PolicyElementList`: /* Rust *mut */ kotlinx.cinterop.CPointer<`RSVP_POLICY_INFO`>?,
    public var `NumFlowDesc`: UInt,
    public var `FlowDescList`: /* Rust *mut */ kotlinx.cinterop.CPointer<`FLOWDESCRIPTOR`>?,
)
// UNSUPPORTED Rust 1223:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for RSVP_RESERVE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RSVP_RESV`: UInt = 2u;
public const val `RSVP_RESV_ERR`: UInt = 4u;
public const val `RSVP_RESV_TEAR`: UInt = 6u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RSVP_SCOPE` (
    public var `scopl_header`: `RsvpObjHdr`,
    public var `scope_u`: `RSVP_SCOPE_0`,
)
// UNSUPPORTED Rust 1239:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for RSVP_SCOPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1245:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union RSVP_SCOPE_0 {
//     pub scopl_ipv4: Scope_list_ipv4,
// }

// UNSUPPORTED Rust 1251:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for RSVP_SCOPE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RSVP_SESSION` (
    public var `sess_header`: `RsvpObjHdr`,
    public var `sess_u`: `RSVP_SESSION_0`,
)
// UNSUPPORTED Rust 1264:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for RSVP_SESSION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1270:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union RSVP_SESSION_0 {
//     pub sess_ipv4: Session_IPv4,
// }

// UNSUPPORTED Rust 1276:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for RSVP_SESSION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RSVP_SHARED_EXPLICIT_STYLE`: UInt = 3u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RSVP_STATUS_INFO` (
    public var `ObjectHdr`: `QOS_OBJECT_HDR`,
    public var `StatusCode`: UInt,
    public var `ExtendedStatus1`: UInt,
    public var `ExtendedStatus2`: UInt,
)
public const val `RSVP_WILDCARD_STYLE`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RsvpObjHdr` (
    public var `obj_length`: UShort,
    public var `obj_class`: UByte,
    public var `obj_ctype`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `Rsvp_Hop_IPv4` (
    public var `hop_ipaddr`: `super`.`super`.`Networking`.`WinSock`.`IN_ADDR`,
    public var `hop_LIH`: UInt,
)
// UNSUPPORTED Rust 1306:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for Rsvp_Hop_IPv4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SENDER_TSPEC` (
    public var `stspec_header`: `RsvpObjHdr`,
    public var `stspec_body`: `IntServTspecBody`,
)
// UNSUPPORTED Rust 1318:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SENDER_TSPEC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SERVICETYPE_BESTEFFORT`: UInt = 1u;
public const val `SERVICETYPE_CONTROLLEDLOAD`: UInt = 2u;
public const val `SERVICETYPE_GENERAL_INFORMATION`: UInt = 5u;
public const val `SERVICETYPE_GUARANTEED`: UInt = 3u;
public const val `SERVICETYPE_NETWORK_CONTROL`: UInt = 10u;
public const val `SERVICETYPE_NETWORK_UNAVAILABLE`: UInt = 4u;
public const val `SERVICETYPE_NOCHANGE`: UInt = 6u;
public const val `SERVICETYPE_NONCONFORMING`: UInt = 9u;
public const val `SERVICETYPE_NOTRAFFIC`: UInt = 0u;
public const val `SERVICETYPE_QUALITATIVE`: UInt = 13u;
public const val `SERVICE_BESTEFFORT`: UInt = 2147549184u;
public const val `SERVICE_CONTROLLEDLOAD`: UInt = 2147614720u;
public const val `SERVICE_GUARANTEED`: UInt = 2147745792u;
public const val `SERVICE_NO_QOS_SIGNALING`: UInt = 1073741824u;
public const val `SERVICE_NO_TRAFFIC_CONTROL`: UInt = 2164260864u;
public const val `SERVICE_QUALITATIVE`: UInt = 2149580800u;
public const val `SESSFLG_E_Police`: UInt = 1u;
public const val `SIPAERROR_FIRMWAREFAILURE`: UInt = 196609u;
public const val `SIPAERROR_INTERNALFAILURE`: UInt = 196611u;
public const val `SIPAEVENTTYPE_AGGREGATION`: UInt = 1073741824u;
public const val `SIPAEVENTTYPE_AUTHORITY`: UInt = 393216u;
public const val `SIPAEVENTTYPE_CONTAINER`: UInt = 65536u;
public const val `SIPAEVENTTYPE_DRTM`: UInt = 786432u;
public const val `SIPAEVENTTYPE_ELAM`: UInt = 589824u;
public const val `SIPAEVENTTYPE_ERROR`: UInt = 196608u;
public const val `SIPAEVENTTYPE_INFORMATION`: UInt = 131072u;
public const val `SIPAEVENTTYPE_KSR`: UInt = 720896u;
public const val `SIPAEVENTTYPE_LOADEDMODULE`: UInt = 458752u;
public const val `SIPAEVENTTYPE_NONMEASURED`: UInt = 2147483648u;
public const val `SIPAEVENTTYPE_OSPARAMETER`: UInt = 327680u;
public const val `SIPAEVENTTYPE_PREOSPARAMETER`: UInt = 262144u;
public const val `SIPAEVENTTYPE_TRUSTPOINT`: UInt = 524288u;
public const val `SIPAEVENTTYPE_VBS`: UInt = 655360u;
public const val `SIPAEVENT_APPLICATION_RETURN`: UInt = 131076u;
public const val `SIPAEVENT_APPLICATION_SVN`: UInt = 131081u;
public const val `SIPAEVENT_AUTHENTICODEHASH`: UInt = 458756u;
public const val `SIPAEVENT_AUTHORITYISSUER`: UInt = 458757u;
public const val `SIPAEVENT_AUTHORITYPUBKEY`: UInt = 393218u;
public const val `SIPAEVENT_AUTHORITYPUBLISHER`: UInt = 458760u;
public const val `SIPAEVENT_AUTHORITYSERIAL`: UInt = 458758u;
public const val `SIPAEVENT_AUTHORITYSHA1THUMBPRINT`: UInt = 458761u;
public const val `SIPAEVENT_BITLOCKER_UNLOCK`: UInt = 131077u;
public const val `SIPAEVENT_BOOTCOUNTER`: UInt = 131074u;
public const val `SIPAEVENT_BOOTDEBUGGING`: UInt = 262145u;
public const val `SIPAEVENT_BOOT_REVOCATION_LIST`: UInt = 262146u;
public const val `SIPAEVENT_CODEINTEGRITY`: UInt = 327682u;
public const val `SIPAEVENT_COUNTERID`: UInt = 131079u;
public const val `SIPAEVENT_DATAEXECUTIONPREVENTION`: UInt = 327684u;
public const val `SIPAEVENT_DRIVER_LOAD_POLICY`: UInt = 327694u;
public const val `SIPAEVENT_DRTM_AMD_SMM_HASH`: UInt = 786435u;
public const val `SIPAEVENT_DRTM_AMD_SMM_SIGNER_KEY`: UInt = 786436u;
public const val `SIPAEVENT_DRTM_SMM_LEVEL`: UInt = 786434u;
public const val `SIPAEVENT_DRTM_STATE_AUTH`: UInt = 786433u;
public const val `SIPAEVENT_DUMPS_DISABLED`: UInt = 327717u;
public const val `SIPAEVENT_DUMP_ENCRYPTION_ENABLED`: UInt = 327718u;
public const val `SIPAEVENT_DUMP_ENCRYPTION_KEY_DIGEST`: UInt = 327719u;
public const val `SIPAEVENT_ELAM_CONFIGURATION`: UInt = 589826u;
public const val `SIPAEVENT_ELAM_KEYNAME`: UInt = 589825u;
public const val `SIPAEVENT_ELAM_MEASURED`: UInt = 589828u;
public const val `SIPAEVENT_ELAM_POLICY`: UInt = 589827u;
public const val `SIPAEVENT_EVENTCOUNTER`: UInt = 131078u;
public const val `SIPAEVENT_FILEPATH`: UInt = 458753u;
public const val `SIPAEVENT_FLIGHTSIGNING`: UInt = 327713u;
public const val `SIPAEVENT_HASHALGORITHMID`: UInt = 458755u;
public const val `SIPAEVENT_HIBERNATION_DISABLED`: UInt = 327716u;
public const val `SIPAEVENT_HYPERVISOR_BOOT_DMA_PROTECTION`: UInt = 327728u;
public const val `SIPAEVENT_HYPERVISOR_DEBUG`: UInt = 327693u;
public const val `SIPAEVENT_HYPERVISOR_IOMMU_POLICY`: UInt = 327692u;
public const val `SIPAEVENT_HYPERVISOR_LAUNCH_TYPE`: UInt = 327690u;
public const val `SIPAEVENT_HYPERVISOR_MMIO_NX_POLICY`: UInt = 327696u;
public const val `SIPAEVENT_HYPERVISOR_MSR_FILTER_POLICY`: UInt = 327697u;
public const val `SIPAEVENT_HYPERVISOR_PATH`: UInt = 327691u;
public const val `SIPAEVENT_IMAGEBASE`: UInt = 458759u;
public const val `SIPAEVENT_IMAGESIZE`: UInt = 458754u;
public const val `SIPAEVENT_IMAGEVALIDATED`: UInt = 458762u;
public const val `SIPAEVENT_INFORMATION`: UInt = 131073u;
public const val `SIPAEVENT_KSR_SIGNATURE`: UInt = 720897u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SIPAEVENT_KSR_SIGNATURE_PAYLOAD` (
    public var `SignAlgID`: UInt,
    public var `SignatureLength`: UInt,
    public var `Signature`: UByteArray,
)
// UNSUPPORTED Rust 1407:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SIPAEVENT_KSR_SIGNATURE_PAYLOAD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SIPAEVENT_LSAISO_CONFIG`: UInt = 327720u;
public const val `SIPAEVENT_MODULE_HSP`: UInt = 458764u;
public const val `SIPAEVENT_MODULE_SVN`: UInt = 458763u;
public const val `SIPAEVENT_MORBIT_API_STATUS`: UInt = 131083u;
public const val `SIPAEVENT_MORBIT_NOT_CANCELABLE`: UInt = 131080u;
public const val `SIPAEVENT_NOAUTHORITY`: UInt = 393217u;
public const val `SIPAEVENT_OSDEVICE`: UInt = 327688u;
public const val `SIPAEVENT_OSKERNELDEBUG`: UInt = 327681u;
public const val `SIPAEVENT_OS_REVOCATION_LIST`: UInt = 327699u;
public const val `SIPAEVENT_PAGEFILE_ENCRYPTION_ENABLED`: UInt = 327714u;
public const val `SIPAEVENT_PHYSICALADDRESSEXTENSION`: UInt = 327687u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SIPAEVENT_REVOCATION_LIST_PAYLOAD` (
    public var `CreationTime`: Long,
    public var `DigestLength`: UInt,
    public var `HashAlgID`: UShort,
    public var `Digest`: UByteArray,
)
// UNSUPPORTED Rust 1431:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SIPAEVENT_REVOCATION_LIST_PAYLOAD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SIPAEVENT_SAFEMODE`: UInt = 327685u;
public const val `SIPAEVENT_SBCP_INFO`: UInt = 327721u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SIPAEVENT_SBCP_INFO_PAYLOAD_V1` (
    public var `PayloadVersion`: UInt,
    public var `VarDataOffset`: UInt,
    public var `HashAlgID`: UShort,
    public var `DigestLength`: UShort,
    public var `Options`: UInt,
    public var `SignersCount`: UInt,
    public var `VarData`: UByteArray,
)
// UNSUPPORTED Rust 1449:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SIPAEVENT_SBCP_INFO_PAYLOAD_V1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SIPAEVENT_SI_POLICY`: UInt = 327695u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SIPAEVENT_SI_POLICY_PAYLOAD` (
    public var `PolicyVersion`: ULong,
    public var `PolicyNameLength`: UShort,
    public var `HashAlgID`: UShort,
    public var `DigestLength`: UInt,
    public var `VarLengthData`: UByteArray,
)
// UNSUPPORTED Rust 1464:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SIPAEVENT_SI_POLICY_PAYLOAD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SIPAEVENT_SMT_STATUS`: UInt = 327700u;
public const val `SIPAEVENT_SVN_CHAIN_STATUS`: UInt = 131082u;
public const val `SIPAEVENT_SYSTEMROOT`: UInt = 327689u;
public const val `SIPAEVENT_TESTSIGNING`: UInt = 327683u;
public const val `SIPAEVENT_TRANSFER_CONTROL`: UInt = 131075u;
public const val `SIPAEVENT_VBS_DUMP_USES_AMEROOT`: UInt = 655369u;
public const val `SIPAEVENT_VBS_HVCI_POLICY`: UInt = 655367u;
public const val `SIPAEVENT_VBS_IOMMU_REQUIRED`: UInt = 655363u;
public const val `SIPAEVENT_VBS_MANDATORY_ENFORCEMENT`: UInt = 655366u;
public const val `SIPAEVENT_VBS_MICROSOFT_BOOT_CHAIN_REQUIRED`: UInt = 655368u;
public const val `SIPAEVENT_VBS_MMIO_NX_REQUIRED`: UInt = 655364u;
public const val `SIPAEVENT_VBS_MSR_FILTERING_REQUIRED`: UInt = 655365u;
public const val `SIPAEVENT_VBS_SECUREBOOT_REQUIRED`: UInt = 655362u;
public const val `SIPAEVENT_VBS_VSM_NOSECRETS_ENFORCED`: UInt = 655370u;
public const val `SIPAEVENT_VBS_VSM_REQUIRED`: UInt = 655361u;
public const val `SIPAEVENT_VSM_IDKS_INFO`: UInt = 327715u;
public const val `SIPAEVENT_VSM_IDK_INFO`: UInt = 327712u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SIPAEVENT_VSM_IDK_INFO_PAYLOAD` (
    public var `KeyAlgID`: UInt,
    public var `Anonymous`: `SIPAEVENT_VSM_IDK_INFO_PAYLOAD_0`,
)
// UNSUPPORTED Rust 1492:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SIPAEVENT_VSM_IDK_INFO_PAYLOAD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1497:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union SIPAEVENT_VSM_IDK_INFO_PAYLOAD_0 {
//     pub RsaKeyInfo: SIPAEVENT_VSM_IDK_RSA_INFO,
// }

// UNSUPPORTED Rust 1502:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SIPAEVENT_VSM_IDK_INFO_PAYLOAD_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SIPAEVENT_VSM_IDK_RSA_INFO` (
    public var `KeyBitLength`: UInt,
    public var `PublicExpLengthBytes`: UInt,
    public var `ModulusSizeBytes`: UInt,
    public var `PublicKeyData`: UByteArray,
)
// UNSUPPORTED Rust 1515:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SIPAEVENT_VSM_IDK_RSA_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SIPAEVENT_VSM_LAUNCH_TYPE`: UInt = 327698u;
public const val `SIPAEVENT_WINPE`: UInt = 327686u;
public const val `SIPAEV_ACTION`: UInt = 5u;
public const val `SIPAEV_AMD_SL_EVENT_BASE`: UInt = 32768u;
public const val `SIPAEV_AMD_SL_LOAD`: UInt = 32769u;
public const val `SIPAEV_AMD_SL_LOAD_1`: UInt = 32774u;
public const val `SIPAEV_AMD_SL_PSP_FW_SPLT`: UInt = 32770u;
public const val `SIPAEV_AMD_SL_PUB_KEY`: UInt = 32772u;
public const val `SIPAEV_AMD_SL_SEPARATOR`: UInt = 32775u;
public const val `SIPAEV_AMD_SL_SVN`: UInt = 32773u;
public const val `SIPAEV_AMD_SL_TSME_RB_FUSE`: UInt = 32771u;
public const val `SIPAEV_COMPACT_HASH`: UInt = 12u;
public const val `SIPAEV_CPU_MICROCODE`: UInt = 9u;
public const val `SIPAEV_EFI_ACTION`: UInt = 2147483655u;
public const val `SIPAEV_EFI_BOOT_SERVICES_APPLICATION`: UInt = 2147483651u;
public const val `SIPAEV_EFI_BOOT_SERVICES_DRIVER`: UInt = 2147483652u;
public const val `SIPAEV_EFI_EVENT_BASE`: UInt = 2147483648u;
public const val `SIPAEV_EFI_GPT_EVENT`: UInt = 2147483654u;
public const val `SIPAEV_EFI_HANDOFF_TABLES`: UInt = 2147483657u;
public const val `SIPAEV_EFI_HANDOFF_TABLES2`: UInt = 2147483659u;
public const val `SIPAEV_EFI_HCRTM_EVENT`: UInt = 2147483664u;
public const val `SIPAEV_EFI_PLATFORM_FIRMWARE_BLOB`: UInt = 2147483656u;
public const val `SIPAEV_EFI_PLATFORM_FIRMWARE_BLOB2`: UInt = 2147483658u;
public const val `SIPAEV_EFI_RUNTIME_SERVICES_DRIVER`: UInt = 2147483653u;
public const val `SIPAEV_EFI_SPDM_FIRMWARE_BLOB`: UInt = 2147483873u;
public const val `SIPAEV_EFI_SPDM_FIRMWARE_CONFIG`: UInt = 2147483874u;
public const val `SIPAEV_EFI_VARIABLE_AUTHORITY`: UInt = 2147483872u;
public const val `SIPAEV_EFI_VARIABLE_BOOT`: UInt = 2147483650u;
public const val `SIPAEV_EFI_VARIABLE_BOOT2`: UInt = 2147483660u;
public const val `SIPAEV_EFI_VARIABLE_DRIVER_CONFIG`: UInt = 2147483649u;
public const val `SIPAEV_EVENT_TAG`: UInt = 6u;
public const val `SIPAEV_IPL`: UInt = 13u;
public const val `SIPAEV_IPL_PARTITION_DATA`: UInt = 14u;
public const val `SIPAEV_NONHOST_CODE`: UInt = 15u;
public const val `SIPAEV_NONHOST_CONFIG`: UInt = 16u;
public const val `SIPAEV_NONHOST_INFO`: UInt = 17u;
public const val `SIPAEV_NO_ACTION`: UInt = 3u;
public const val `SIPAEV_OMIT_BOOT_DEVICE_EVENTS`: UInt = 18u;
public const val `SIPAEV_PLATFORM_CONFIG_FLAGS`: UInt = 10u;
public const val `SIPAEV_POST_CODE`: UInt = 1u;
public const val `SIPAEV_PREBOOT_CERT`: UInt = 0u;
public const val `SIPAEV_SEPARATOR`: UInt = 4u;
public const val `SIPAEV_S_CRTM_CONTENTS`: UInt = 7u;
public const val `SIPAEV_S_CRTM_VERSION`: UInt = 8u;
public const val `SIPAEV_TABLE_OF_DEVICES`: UInt = 11u;
public const val `SIPAEV_TXT_BIOSAC_REG_DATA`: UInt = 1034u;
public const val `SIPAEV_TXT_BOOT_POL_HASH`: UInt = 1050u;
public const val `SIPAEV_TXT_BPM_HASH`: UInt = 1047u;
public const val `SIPAEV_TXT_BPM_INFO_HASH`: UInt = 1049u;
public const val `SIPAEV_TXT_CAP_VALUE`: UInt = 1279u;
public const val `SIPAEV_TXT_COLD_BOOT_BIOS_HASH`: UInt = 1045u;
public const val `SIPAEV_TXT_COMBINED_HASH`: UInt = 1027u;
public const val `SIPAEV_TXT_CPU_SCRTM_STAT`: UInt = 1035u;
public const val `SIPAEV_TXT_ELEMENTS_HASH`: UInt = 1037u;
public const val `SIPAEV_TXT_EVENT_BASE`: UInt = 1024u;
public const val `SIPAEV_TXT_HASH_START`: UInt = 1026u;
public const val `SIPAEV_TXT_KM_HASH`: UInt = 1046u;
public const val `SIPAEV_TXT_KM_INFO_HASH`: UInt = 1048u;
public const val `SIPAEV_TXT_LCP_AUTHORITIES_HASH`: UInt = 1043u;
public const val `SIPAEV_TXT_LCP_CONTROL_HASH`: UInt = 1036u;
public const val `SIPAEV_TXT_LCP_DETAILS_HASH`: UInt = 1042u;
public const val `SIPAEV_TXT_LCP_HASH`: UInt = 1041u;
public const val `SIPAEV_TXT_MLE_HASH`: UInt = 1028u;
public const val `SIPAEV_TXT_NV_INFO_HASH`: UInt = 1044u;
public const val `SIPAEV_TXT_OSSINITDATA_CAP_HASH`: UInt = 1039u;
public const val `SIPAEV_TXT_PCR_MAPPING`: UInt = 1025u;
public const val `SIPAEV_TXT_RANDOM_VALUE`: UInt = 1278u;
public const val `SIPAEV_TXT_SINIT_PUBKEY_HASH`: UInt = 1040u;
public const val `SIPAEV_TXT_STM_HASH`: UInt = 1038u;
public const val `SIPAEV_UNUSED`: UInt = 2u;
public const val `SIPAHDRSIGNATURE`: UInt = 1279476311u;
public const val `SIPAKSRHDRSIGNATURE`: UInt = 1297240907u;
public const val `SIPALOGVERSION`: UInt = 1u;
public const val `STATE_TIMEOUT`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `Scope_list_ipv4` (
    public var `scopl_ipaddr`: Array<`super`.`super`.`Networking`.`WinSock`.`IN_ADDR`>,
)
// UNSUPPORTED Rust 1600:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for Scope_list_ipv4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `Session_IPv4` (
    public var `sess_destaddr`: `super`.`super`.`Networking`.`WinSock`.`IN_ADDR`,
    public var `sess_protid`: UByte,
    public var `sess_flags`: UByte,
    public var `sess_destport`: UShort,
)
// UNSUPPORTED Rust 1615:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for Session_IPv4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `TCBASE`: UInt = 7500u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 20 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TCG_PCClientPCREventStruct` (
    public var `pcrIndex`: UInt,
    public var `eventType`: UInt,
    public var `digest`: UByteArray,
    public var `eventDataSize`: UInt,
    public var `event`: UByteArray,
)
// UNSUPPORTED Rust 1631:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TCG_PCClientPCREventStruct {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TCG_PCClientTaggedEventStruct` (
    public var `EventID`: UInt,
    public var `EventDataSize`: UInt,
    public var `EventData`: UByteArray,
)
// UNSUPPORTED Rust 1643:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TCG_PCClientTaggedEventStruct {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `TCI_ADD_FLOW_COMPLETE_HANDLER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, UInt) -> Unit>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TCI_CLIENT_FUNC_LIST` (
    public var `ClNotifyHandler`: `TCI_NOTIFY_HANDLER`,
    public var `ClAddFlowCompleteHandler`: `TCI_ADD_FLOW_COMPLETE_HANDLER`,
    public var `ClModifyFlowCompleteHandler`: `TCI_MOD_FLOW_COMPLETE_HANDLER`,
    public var `ClDeleteFlowCompleteHandler`: `TCI_DEL_FLOW_COMPLETE_HANDLER`,
)
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `TCI_DEL_FLOW_COMPLETE_HANDLER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, UInt) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `TCI_MOD_FLOW_COMPLETE_HANDLER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, UInt) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `TCI_NOTIFY_HANDLER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`Foundation`.`HANDLE`, UInt, `super`.`super`.`Foundation`.`HANDLE`, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TC_GEN_FILTER` (
    public var `AddressType`: UShort,
    public var `PatternSize`: UInt,
    public var `Pattern`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Mask`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1668:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TC_GEN_FILTER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TC_GEN_FLOW` (
    public var `SendingFlowspec`: `super`.`super`.`Networking`.`WinSock`.`FLOWSPEC`,
    public var `ReceivingFlowspec`: `super`.`super`.`Networking`.`WinSock`.`FLOWSPEC`,
    public var `TcObjectsLength`: UInt,
    public var `TcObjects`: Array<`QOS_OBJECT_HDR`>,
)
// UNSUPPORTED Rust 1682:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for TC_GEN_FLOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TC_IFC_DESCRIPTOR` (
    public var `Length`: UInt,
    public var `pInterfaceName`: `windows_sys`.`core`.`PWSTR`,
    public var `pInterfaceID`: `windows_sys`.`core`.`PWSTR`,
    public var `AddressListDesc`: `ADDRESS_LIST_DESCRIPTOR`,
)
// UNSUPPORTED Rust 1697:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for TC_IFC_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `TC_NONCONF_BORROW`: UInt = 0u;
public const val `TC_NONCONF_BORROW_PLUS`: UInt = 3u;
public const val `TC_NONCONF_DISCARD`: UInt = 2u;
public const val `TC_NONCONF_SHAPE`: UInt = 1u;
public const val `TC_NOTIFY_FLOW_CLOSE`: UInt = 5u;
public const val `TC_NOTIFY_IFC_CHANGE`: UInt = 3u;
public const val `TC_NOTIFY_IFC_CLOSE`: UInt = 2u;
public const val `TC_NOTIFY_IFC_UP`: UInt = 1u;
public const val `TC_NOTIFY_PARAM_CHANGED`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TC_SUPPORTED_INFO_BUFFER` (
    public var `InstanceIDLength`: UShort,
    public var `InstanceID`: UShortArray,
    public var `InterfaceLuid`: ULong,
    public var `AddrListDesc`: `ADDRESS_LIST_DESCRIPTOR`,
)
// UNSUPPORTED Rust 1721:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for TC_SUPPORTED_INFO_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `UNSUPPORTED_CREDENTIAL_TYPE`: UInt = 2u;
public const val `WBCL_DIGEST_ALG_BITMAP_SHA3_256`: UInt = 32u;
public const val `WBCL_DIGEST_ALG_BITMAP_SHA3_384`: UInt = 64u;
public const val `WBCL_DIGEST_ALG_BITMAP_SHA3_512`: UInt = 128u;
public const val `WBCL_DIGEST_ALG_BITMAP_SHA_1`: UInt = 1u;
public const val `WBCL_DIGEST_ALG_BITMAP_SHA_2_256`: UInt = 2u;
public const val `WBCL_DIGEST_ALG_BITMAP_SHA_2_384`: UInt = 4u;
public const val `WBCL_DIGEST_ALG_BITMAP_SHA_2_512`: UInt = 8u;
public const val `WBCL_DIGEST_ALG_BITMAP_SM3_256`: UInt = 16u;
public const val `WBCL_DIGEST_ALG_ID_SHA3_256`: UInt = 39u;
public const val `WBCL_DIGEST_ALG_ID_SHA3_384`: UInt = 40u;
public const val `WBCL_DIGEST_ALG_ID_SHA3_512`: UInt = 41u;
public const val `WBCL_DIGEST_ALG_ID_SHA_1`: UInt = 4u;
public const val `WBCL_DIGEST_ALG_ID_SHA_2_256`: UInt = 11u;
public const val `WBCL_DIGEST_ALG_ID_SHA_2_384`: UInt = 12u;
public const val `WBCL_DIGEST_ALG_ID_SHA_2_512`: UInt = 13u;
public const val `WBCL_DIGEST_ALG_ID_SM3_256`: UInt = 18u;
public const val `WBCL_HASH_LEN_SHA1`: UInt = 20u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WBCL_Iterator` (
    public var `firstElementPtr`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `logSize`: UInt,
    public var `currentElementPtr`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `currentElementSize`: UInt,
    public var `digestSize`: UShort,
    public var `logFormat`: UShort,
    public var `numberOfDigests`: UInt,
    public var `digestSizes`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `supportedAlgorithms`: UInt,
    public var `hashAlgorithm`: UShort,
)
// UNSUPPORTED Rust 1759:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WBCL_Iterator {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WBCL_LogHdr` (
    public var `signature`: UInt,
    public var `version`: UInt,
    public var `entries`: UInt,
    public var `length`: UInt,
)
public const val `WBCL_MAX_HSP_UPGRADE_HASH_LEN`: UInt = 64u;
public const val `class_ADSPEC`: UInt = 13u;
public const val `class_CONFIRM`: UInt = 15u;
public const val `class_ERROR_SPEC`: UInt = 6u;
public const val `class_FILTER_SPEC`: UInt = 10u;
public const val `class_FLOWSPEC`: UInt = 9u;
public const val `class_INTEGRITY`: UInt = 4u;
public const val `class_IS_FLOWSPEC`: UInt = 9u;
public const val `class_MAX`: UInt = 15u;
public const val `class_NULL`: UInt = 0u;
public const val `class_POLICY_DATA`: UInt = 14u;
public const val `class_RSVP_HOP`: UInt = 3u;
public const val `class_SCOPE`: UInt = 7u;
public const val `class_SENDER_TEMPLATE`: UInt = 11u;
public const val `class_SENDER_TSPEC`: UInt = 12u;
public const val `class_SESSION`: UInt = 1u;
public const val `class_SESSION_GROUP`: UInt = 2u;
public const val `class_STYLE`: UInt = 8u;
public const val `class_TIME_VALUES`: UInt = 5u;
public const val `ctype_ADSPEC_INTSERV`: UInt = 2u;
public const val `ctype_ERROR_SPEC_ipv4`: UInt = 1u;
public const val `ctype_FILTER_SPEC_ipv4`: UInt = 1u;
public const val `ctype_FILTER_SPEC_ipv4GPI`: UInt = 4u;
public const val `ctype_FLOWSPEC_Intserv0`: UInt = 2u;
public const val `ctype_POLICY_DATA`: UInt = 1u;
public const val `ctype_RSVP_HOP_ipv4`: UInt = 1u;
public const val `ctype_SCOPE_list_ipv4`: UInt = 1u;
public const val `ctype_SENDER_TEMPLATE_ipv4`: UInt = 1u;
public const val `ctype_SENDER_TEMPLATE_ipv4GPI`: UInt = 4u;
public const val `ctype_SENDER_TSPEC`: UInt = 2u;
public const val `ctype_SESSION_ipv4`: UInt = 1u;
public const val `ctype_SESSION_ipv4GPI`: UInt = 3u;
public const val `ctype_STYLE`: UInt = 1u;
public typealias `int_serv_wkp` = Int;
public const val `ioctl_code`: UInt = 1u;
public const val `mCOMPANY`: UInt = 402653184u;
public const val `mIOC_IN`: UInt = 2147483648u;
public const val `mIOC_OUT`: UInt = 1073741824u;
public const val `mIOC_VENDOR`: UInt = 67108864u;
