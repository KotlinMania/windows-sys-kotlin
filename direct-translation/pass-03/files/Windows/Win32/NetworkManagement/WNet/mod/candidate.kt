// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mpr.dll, ABI=system, export=MultinetGetConnectionPerformanceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MultinetGetConnectionPerformanceA`(`lpnetresource` : /* Rust *const */ kotlinx.cinterop.CPointer<`NETRESOURCEA`>?, `lpnetconnectinfostruct` : /* Rust *mut */ kotlinx.cinterop.CPointer<`NETCONNECTINFOSTRUCT`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mpr.dll, ABI=system, export=MultinetGetConnectionPerformanceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MultinetGetConnectionPerformanceW`(`lpnetresource` : /* Rust *const */ kotlinx.cinterop.CPointer<`NETRESOURCEW`>?, `lpnetconnectinfostruct` : /* Rust *mut */ kotlinx.cinterop.CPointer<`NETCONNECTINFOSTRUCT`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=davclnt.dll, ABI=system, export=NPAddConnection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NPAddConnection`(`lpnetresource` : /* Rust *const */ kotlinx.cinterop.CPointer<`NETRESOURCEW`>?, `lppassword` : `windows_sys`.`core`.`PCWSTR`, `lpusername` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=davclnt.dll, ABI=system, export=NPAddConnection3; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NPAddConnection3`(`hwndowner` : `super`.`super`.`Foundation`.`HWND`, `lpnetresource` : /* Rust *const */ kotlinx.cinterop.CPointer<`NETRESOURCEW`>?, `lppassword` : `windows_sys`.`core`.`PCWSTR`, `lpusername` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : `NET_CONNECT_FLAGS`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntlanman.dll, ABI=system, export=NPAddConnection4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NPAddConnection4`(`hwndowner` : `super`.`super`.`Foundation`.`HWND`, `lpnetresource` : /* Rust *const */ kotlinx.cinterop.CPointer<`NETRESOURCEW`>?, `lpauthbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbauthbuffer` : UInt, `dwflags` : UInt, `lpuseoptions` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbuseoptions` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=davclnt.dll, ABI=system, export=NPCancelConnection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NPCancelConnection`(`lpname` : `windows_sys`.`core`.`PCWSTR`, `fforce` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntlanman.dll, ABI=system, export=NPCancelConnection2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NPCancelConnection2`(`lpname` : `windows_sys`.`core`.`PCWSTR`, `fforce` : `windows_sys`.`core`.`BOOL`, `dwflags` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=davclnt.dll, ABI=system, export=NPCloseEnum; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NPCloseEnum`(`henum` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=davclnt.dll, ABI=system, export=NPEnumResource; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NPEnumResource`(`henum` : `super`.`super`.`Foundation`.`HANDLE`, `lpccount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=davclnt.dll, ABI=system, export=NPFormatNetworkName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NPFormatNetworkName`(`lpremotename` : `windows_sys`.`core`.`PCWSTR`, `lpformattedname` : `windows_sys`.`core`.`PWSTR`, `lpnlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwflags` : `NETWORK_NAME_FORMAT_FLAGS`, `dwavecharperline` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=davclnt.dll, ABI=system, export=NPGetCaps; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NPGetCaps`(`ndex` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=davclnt.dll, ABI=system, export=NPGetConnection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NPGetConnection`(`lplocalname` : `windows_sys`.`core`.`PCWSTR`, `lpremotename` : `windows_sys`.`core`.`PWSTR`, `lpnbufferlen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntlanman.dll, ABI=system, export=NPGetConnection3; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NPGetConnection3`(`lplocalname` : `windows_sys`.`core`.`PCWSTR`, `dwlevel` : UInt, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntlanman.dll, ABI=system, export=NPGetConnectionPerformance; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NPGetConnectionPerformance`(`lpremotename` : `windows_sys`.`core`.`PCWSTR`, `lpnetconnectinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`NETCONNECTINFOSTRUCT`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntlanman.dll, ABI=system, export=NPGetPersistentUseOptionsForConnection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NPGetPersistentUseOptionsForConnection`(`lpremotepath` : `windows_sys`.`core`.`PCWSTR`, `lpreaduseoptions` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbreaduseoptions` : UInt, `lpwriteuseoptions` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `lpsizewriteuseoptions` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=davclnt.dll, ABI=system, export=NPGetResourceInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NPGetResourceInformation`(`lpnetresource` : /* Rust *const */ kotlinx.cinterop.CPointer<`NETRESOURCEW`>?, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lplpsystem` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=davclnt.dll, ABI=system, export=NPGetResourceParent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NPGetResourceParent`(`lpnetresource` : /* Rust *const */ kotlinx.cinterop.CPointer<`NETRESOURCEW`>?, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=davclnt.dll, ABI=system, export=NPGetUniversalName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NPGetUniversalName`(`lplocalpath` : `windows_sys`.`core`.`PCWSTR`, `dwinfolevel` : `UNC_INFO_LEVEL`, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=davclnt.dll, ABI=system, export=NPGetUser; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NPGetUser`(`lpname` : `windows_sys`.`core`.`PCWSTR`, `lpusername` : `windows_sys`.`core`.`PWSTR`, `lpnbufferlen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=davclnt.dll, ABI=system, export=NPOpenEnum; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NPOpenEnum`(`dwscope` : UInt, `dwtype` : UInt, `dwusage` : UInt, `lpnetresource` : /* Rust *const */ kotlinx.cinterop.CPointer<`NETRESOURCEW`>?, `lphenum` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mpr.dll, ABI=system, export=WNetAddConnection2A; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WNetAddConnection2A`(`lpnetresource` : /* Rust *const */ kotlinx.cinterop.CPointer<`NETRESOURCEA`>?, `lppassword` : `windows_sys`.`core`.`PCSTR`, `lpusername` : `windows_sys`.`core`.`PCSTR`, `dwflags` : `NET_CONNECT_FLAGS`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mpr.dll, ABI=system, export=WNetAddConnection2W; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WNetAddConnection2W`(`lpnetresource` : /* Rust *const */ kotlinx.cinterop.CPointer<`NETRESOURCEW`>?, `lppassword` : `windows_sys`.`core`.`PCWSTR`, `lpusername` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : `NET_CONNECT_FLAGS`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mpr.dll, ABI=system, export=WNetAddConnection3A; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WNetAddConnection3A`(`hwndowner` : `super`.`super`.`Foundation`.`HWND`, `lpnetresource` : /* Rust *const */ kotlinx.cinterop.CPointer<`NETRESOURCEA`>?, `lppassword` : `windows_sys`.`core`.`PCSTR`, `lpusername` : `windows_sys`.`core`.`PCSTR`, `dwflags` : `NET_CONNECT_FLAGS`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mpr.dll, ABI=system, export=WNetAddConnection3W; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WNetAddConnection3W`(`hwndowner` : `super`.`super`.`Foundation`.`HWND`, `lpnetresource` : /* Rust *const */ kotlinx.cinterop.CPointer<`NETRESOURCEW`>?, `lppassword` : `windows_sys`.`core`.`PCWSTR`, `lpusername` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : `NET_CONNECT_FLAGS`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mpr.dll, ABI=system, export=WNetAddConnection4A; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WNetAddConnection4A`(`hwndowner` : `super`.`super`.`Foundation`.`HWND`, `lpnetresource` : /* Rust *const */ kotlinx.cinterop.CPointer<`NETRESOURCEA`>?, `pauthbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbauthbuffer` : UInt, `dwflags` : `NET_CONNECT_FLAGS`, `lpuseoptions` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbuseoptions` : UInt) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mpr.dll, ABI=system, export=WNetAddConnection4W; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WNetAddConnection4W`(`hwndowner` : `super`.`super`.`Foundation`.`HWND`, `lpnetresource` : /* Rust *const */ kotlinx.cinterop.CPointer<`NETRESOURCEW`>?, `pauthbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbauthbuffer` : UInt, `dwflags` : `NET_CONNECT_FLAGS`, `lpuseoptions` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbuseoptions` : UInt) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mpr.dll, ABI=system, export=WNetAddConnectionA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WNetAddConnectionA`(`lpremotename` : `windows_sys`.`core`.`PCSTR`, `lppassword` : `windows_sys`.`core`.`PCSTR`, `lplocalname` : `windows_sys`.`core`.`PCSTR`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mpr.dll, ABI=system, export=WNetAddConnectionW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WNetAddConnectionW`(`lpremotename` : `windows_sys`.`core`.`PCWSTR`, `lppassword` : `windows_sys`.`core`.`PCWSTR`, `lplocalname` : `windows_sys`.`core`.`PCWSTR`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mpr.dll, ABI=system, export=WNetCancelConnection2A; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WNetCancelConnection2A`(`lpname` : `windows_sys`.`core`.`PCSTR`, `dwflags` : `NET_CONNECT_FLAGS`, `fforce` : `windows_sys`.`core`.`BOOL`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mpr.dll, ABI=system, export=WNetCancelConnection2W; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WNetCancelConnection2W`(`lpname` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : `NET_CONNECT_FLAGS`, `fforce` : `windows_sys`.`core`.`BOOL`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mpr.dll, ABI=system, export=WNetCancelConnectionA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WNetCancelConnectionA`(`lpname` : `windows_sys`.`core`.`PCSTR`, `fforce` : `windows_sys`.`core`.`BOOL`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mpr.dll, ABI=system, export=WNetCancelConnectionW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WNetCancelConnectionW`(`lpname` : `windows_sys`.`core`.`PCWSTR`, `fforce` : `windows_sys`.`core`.`BOOL`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mpr.dll, ABI=system, export=WNetCloseEnum; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WNetCloseEnum`(`henum` : `super`.`super`.`Foundation`.`HANDLE`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mpr.dll, ABI=system, export=WNetConnectionDialog; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WNetConnectionDialog`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `dwtype` : UInt) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mpr.dll, ABI=system, export=WNetConnectionDialog1A; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WNetConnectionDialog1A`(`lpconndlgstruct` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CONNECTDLGSTRUCTA`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mpr.dll, ABI=system, export=WNetConnectionDialog1W; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WNetConnectionDialog1W`(`lpconndlgstruct` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CONNECTDLGSTRUCTW`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mpr.dll, ABI=system, export=WNetDisconnectDialog; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WNetDisconnectDialog`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `dwtype` : UInt) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mpr.dll, ABI=system, export=WNetDisconnectDialog1A; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WNetDisconnectDialog1A`(`lpconndlgstruct` : /* Rust *const */ kotlinx.cinterop.CPointer<`DISCDLGSTRUCTA`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mpr.dll, ABI=system, export=WNetDisconnectDialog1W; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WNetDisconnectDialog1W`(`lpconndlgstruct` : /* Rust *const */ kotlinx.cinterop.CPointer<`DISCDLGSTRUCTW`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mpr.dll, ABI=system, export=WNetEnumResourceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WNetEnumResourceA`(`henum` : `super`.`super`.`Foundation`.`HANDLE`, `lpccount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mpr.dll, ABI=system, export=WNetEnumResourceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WNetEnumResourceW`(`henum` : `super`.`super`.`Foundation`.`HANDLE`, `lpccount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mpr.dll, ABI=system, export=WNetGetConnectionA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WNetGetConnectionA`(`lplocalname` : `windows_sys`.`core`.`PCSTR`, `lpremotename` : `windows_sys`.`core`.`PSTR`, `lpnlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mpr.dll, ABI=system, export=WNetGetConnectionW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WNetGetConnectionW`(`lplocalname` : `windows_sys`.`core`.`PCWSTR`, `lpremotename` : `windows_sys`.`core`.`PWSTR`, `lpnlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mpr.dll, ABI=system, export=WNetGetLastErrorA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WNetGetLastErrorA`(`lperror` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lperrorbuf` : `windows_sys`.`core`.`PSTR`, `nerrorbufsize` : UInt, `lpnamebuf` : `windows_sys`.`core`.`PSTR`, `nnamebufsize` : UInt) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mpr.dll, ABI=system, export=WNetGetLastErrorW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WNetGetLastErrorW`(`lperror` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lperrorbuf` : `windows_sys`.`core`.`PWSTR`, `nerrorbufsize` : UInt, `lpnamebuf` : `windows_sys`.`core`.`PWSTR`, `nnamebufsize` : UInt) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mpr.dll, ABI=system, export=WNetGetNetworkInformationA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WNetGetNetworkInformationA`(`lpprovider` : `windows_sys`.`core`.`PCSTR`, `lpnetinfostruct` : /* Rust *mut */ kotlinx.cinterop.CPointer<`NETINFOSTRUCT`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mpr.dll, ABI=system, export=WNetGetNetworkInformationW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WNetGetNetworkInformationW`(`lpprovider` : `windows_sys`.`core`.`PCWSTR`, `lpnetinfostruct` : /* Rust *mut */ kotlinx.cinterop.CPointer<`NETINFOSTRUCT`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mpr.dll, ABI=system, export=WNetGetProviderNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WNetGetProviderNameA`(`dwnettype` : UInt, `lpprovidername` : `windows_sys`.`core`.`PSTR`, `lpbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mpr.dll, ABI=system, export=WNetGetProviderNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WNetGetProviderNameW`(`dwnettype` : UInt, `lpprovidername` : `windows_sys`.`core`.`PWSTR`, `lpbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mpr.dll, ABI=system, export=WNetGetResourceInformationA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WNetGetResourceInformationA`(`lpnetresource` : /* Rust *const */ kotlinx.cinterop.CPointer<`NETRESOURCEA`>?, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpcbbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lplpsystem` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mpr.dll, ABI=system, export=WNetGetResourceInformationW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WNetGetResourceInformationW`(`lpnetresource` : /* Rust *const */ kotlinx.cinterop.CPointer<`NETRESOURCEW`>?, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpcbbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lplpsystem` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mpr.dll, ABI=system, export=WNetGetResourceParentA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WNetGetResourceParentA`(`lpnetresource` : /* Rust *const */ kotlinx.cinterop.CPointer<`NETRESOURCEA`>?, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpcbbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mpr.dll, ABI=system, export=WNetGetResourceParentW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WNetGetResourceParentW`(`lpnetresource` : /* Rust *const */ kotlinx.cinterop.CPointer<`NETRESOURCEW`>?, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpcbbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mpr.dll, ABI=system, export=WNetGetUniversalNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WNetGetUniversalNameA`(`lplocalpath` : `windows_sys`.`core`.`PCSTR`, `dwinfolevel` : `UNC_INFO_LEVEL`, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mpr.dll, ABI=system, export=WNetGetUniversalNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WNetGetUniversalNameW`(`lplocalpath` : `windows_sys`.`core`.`PCWSTR`, `dwinfolevel` : `UNC_INFO_LEVEL`, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mpr.dll, ABI=system, export=WNetGetUserA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WNetGetUserA`(`lpname` : `windows_sys`.`core`.`PCSTR`, `lpusername` : `windows_sys`.`core`.`PSTR`, `lpnlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mpr.dll, ABI=system, export=WNetGetUserW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WNetGetUserW`(`lpname` : `windows_sys`.`core`.`PCWSTR`, `lpusername` : `windows_sys`.`core`.`PWSTR`, `lpnlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mpr.dll, ABI=system, export=WNetOpenEnumA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WNetOpenEnumA`(`dwscope` : `NET_RESOURCE_SCOPE`, `dwtype` : `NET_RESOURCE_TYPE`, `dwusage` : `WNET_OPEN_ENUM_USAGE`, `lpnetresource` : /* Rust *const */ kotlinx.cinterop.CPointer<`NETRESOURCEA`>?, `lphenum` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mpr.dll, ABI=system, export=WNetOpenEnumW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WNetOpenEnumW`(`dwscope` : `NET_RESOURCE_SCOPE`, `dwtype` : `NET_RESOURCE_TYPE`, `dwusage` : `WNET_OPEN_ENUM_USAGE`, `lpnetresource` : /* Rust *const */ kotlinx.cinterop.CPointer<`NETRESOURCEW`>?, `lphenum` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mpr.dll, ABI=system, export=WNetSetLastErrorA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WNetSetLastErrorA`(`err` : UInt, `lperror` : `windows_sys`.`core`.`PCSTR`, `lpproviders` : `windows_sys`.`core`.`PCSTR`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mpr.dll, ABI=system, export=WNetSetLastErrorW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WNetSetLastErrorW`(`err` : UInt, `lperror` : `windows_sys`.`core`.`PCWSTR`, `lpproviders` : `windows_sys`.`core`.`PCWSTR`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mpr.dll, ABI=system, export=WNetUseConnection4A; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WNetUseConnection4A`(`hwndowner` : `super`.`super`.`Foundation`.`HWND`, `lpnetresource` : /* Rust *const */ kotlinx.cinterop.CPointer<`NETRESOURCEA`>?, `pauthbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbauthbuffer` : UInt, `dwflags` : UInt, `lpuseoptions` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbuseoptions` : UInt, `lpaccessname` : `windows_sys`.`core`.`PSTR`, `lpbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mpr.dll, ABI=system, export=WNetUseConnection4W; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WNetUseConnection4W`(`hwndowner` : `super`.`super`.`Foundation`.`HWND`, `lpnetresource` : /* Rust *const */ kotlinx.cinterop.CPointer<`NETRESOURCEW`>?, `pauthbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbauthbuffer` : UInt, `dwflags` : UInt, `lpuseoptions` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbuseoptions` : UInt, `lpaccessname` : `windows_sys`.`core`.`PWSTR`, `lpbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mpr.dll, ABI=system, export=WNetUseConnectionA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WNetUseConnectionA`(`hwndowner` : `super`.`super`.`Foundation`.`HWND`, `lpnetresource` : /* Rust *const */ kotlinx.cinterop.CPointer<`NETRESOURCEA`>?, `lppassword` : `windows_sys`.`core`.`PCSTR`, `lpuserid` : `windows_sys`.`core`.`PCSTR`, `dwflags` : `NET_CONNECT_FLAGS`, `lpaccessname` : `windows_sys`.`core`.`PSTR`, `lpbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mpr.dll, ABI=system, export=WNetUseConnectionW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WNetUseConnectionW`(`hwndowner` : `super`.`super`.`Foundation`.`HWND`, `lpnetresource` : /* Rust *const */ kotlinx.cinterop.CPointer<`NETRESOURCEW`>?, `lppassword` : `windows_sys`.`core`.`PCWSTR`, `lpuserid` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : `NET_CONNECT_FLAGS`, `lpaccessname` : `windows_sys`.`core`.`PWSTR`, `lpbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
public const val `CONNDLG_CONN_POINT`: `CONNECTDLGSTRUCT_FLAGS` = 2u;
public const val `CONNDLG_HIDE_BOX`: `CONNECTDLGSTRUCT_FLAGS` = 8u;
public const val `CONNDLG_NOT_PERSIST`: `CONNECTDLGSTRUCT_FLAGS` = 32u;
public const val `CONNDLG_PERSIST`: `CONNECTDLGSTRUCT_FLAGS` = 16u;
public const val `CONNDLG_RO_PATH`: `CONNECTDLGSTRUCT_FLAGS` = 1u;
public const val `CONNDLG_USE_MRU`: `CONNECTDLGSTRUCT_FLAGS` = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CONNECTDLGSTRUCTA` (
    public var `cbStructure`: UInt,
    public var `hwndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `lpConnRes`: /* Rust *mut */ kotlinx.cinterop.CPointer<`NETRESOURCEA`>?,
    public var `dwFlags`: `CONNECTDLGSTRUCT_FLAGS`,
    public var `dwDevNum`: UInt,
)
// UNSUPPORTED Rust 81:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CONNECTDLGSTRUCTA {
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
public class `CONNECTDLGSTRUCTW` (
    public var `cbStructure`: UInt,
    public var `hwndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `lpConnRes`: /* Rust *mut */ kotlinx.cinterop.CPointer<`NETRESOURCEW`>?,
    public var `dwFlags`: `CONNECTDLGSTRUCT_FLAGS`,
    public var `dwDevNum`: UInt,
)
// UNSUPPORTED Rust 95:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CONNECTDLGSTRUCTW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CONNECTDLGSTRUCT_FLAGS` = UInt;
public const val `CONNECT_CMD_SAVECRED`: `NET_CONNECT_FLAGS` = 4096u;
public const val `CONNECT_COMMANDLINE`: `NET_CONNECT_FLAGS` = 2048u;
public const val `CONNECT_CRED_RESET`: `NET_CONNECT_FLAGS` = 8192u;
public const val `CONNECT_CURRENT_MEDIA`: `NET_CONNECT_FLAGS` = 512u;
public const val `CONNECT_DEFERRED`: `NET_CONNECT_FLAGS` = 1024u;
public const val `CONNECT_GLOBAL_MAPPING`: `NET_CONNECT_FLAGS` = 262144u;
public const val `CONNECT_INTERACTIVE`: `NET_CONNECT_FLAGS` = 8u;
public const val `CONNECT_LOCALDRIVE`: `NET_CONNECT_FLAGS` = 256u;
public const val `CONNECT_NEED_DRIVE`: `NET_CONNECT_FLAGS` = 32u;
public const val `CONNECT_PROMPT`: `NET_CONNECT_FLAGS` = 16u;
public const val `CONNECT_REDIRECT`: `NET_CONNECT_FLAGS` = 128u;
public const val `CONNECT_REFCOUNT`: `NET_CONNECT_FLAGS` = 64u;
public const val `CONNECT_REQUIRE_INTEGRITY`: `NET_CONNECT_FLAGS` = 16384u;
public const val `CONNECT_REQUIRE_PRIVACY`: `NET_CONNECT_FLAGS` = 32768u;
public const val `CONNECT_RESERVED`: `NET_CONNECT_FLAGS` = 4278190080u;
public const val `CONNECT_TEMPORARY`: `NET_CONNECT_FLAGS` = 4u;
public const val `CONNECT_UPDATE_PROFILE`: `NET_CONNECT_FLAGS` = 1u;
public const val `CONNECT_UPDATE_RECENT`: `NET_CONNECT_FLAGS` = 2u;
public const val `CONNECT_WRITE_THROUGH_SEMANTICS`: `NET_CONNECT_FLAGS` = 65536u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DISCDLGSTRUCTA` (
    public var `cbStructure`: UInt,
    public var `hwndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `lpLocalName`: `windows_sys`.`core`.`PSTR`,
    public var `lpRemoteName`: `windows_sys`.`core`.`PSTR`,
    public var `dwFlags`: `DISCDLGSTRUCT_FLAGS`,
)
// UNSUPPORTED Rust 129:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DISCDLGSTRUCTA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DISCDLGSTRUCTW` (
    public var `cbStructure`: UInt,
    public var `hwndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `lpLocalName`: `windows_sys`.`core`.`PWSTR`,
    public var `lpRemoteName`: `windows_sys`.`core`.`PWSTR`,
    public var `dwFlags`: `DISCDLGSTRUCT_FLAGS`,
)
// UNSUPPORTED Rust 143:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DISCDLGSTRUCTW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DISCDLGSTRUCT_FLAGS` = UInt;
public const val `DISC_NO_FORCE`: `DISCDLGSTRUCT_FLAGS` = 64u;
public const val `DISC_UPDATE_PROFILE`: `DISCDLGSTRUCT_FLAGS` = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NETCONNECTINFOSTRUCT` (
    public var `cbStructure`: UInt,
    public var `dwFlags`: UInt,
    public var `dwSpeed`: UInt,
    public var `dwDelay`: UInt,
    public var `dwOptDataSize`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NETINFOSTRUCT` (
    public var `cbStructure`: UInt,
    public var `dwProviderVersion`: UInt,
    public var `dwStatus`: `super`.`super`.`Foundation`.`WIN32_ERROR`,
    public var `dwCharacteristics`: `NETINFOSTRUCT_CHARACTERISTICS`,
    public var `dwHandle`: ULong,
    public var `wNetType`: UShort,
    public var `dwPrinters`: UInt,
    public var `dwDrives`: UInt,
)
public typealias `NETINFOSTRUCT_CHARACTERISTICS` = UInt;
public const val `NETINFO_DISKRED`: `NETINFOSTRUCT_CHARACTERISTICS` = 4u;
public const val `NETINFO_DLL16`: `NETINFOSTRUCT_CHARACTERISTICS` = 1u;
public const val `NETINFO_PRINTERRED`: `NETINFOSTRUCT_CHARACTERISTICS` = 8u;
public const val `NETPROPERTY_PERSISTENT`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NETRESOURCEA` (
    public var `dwScope`: `NET_RESOURCE_SCOPE`,
    public var `dwType`: `NET_RESOURCE_TYPE`,
    public var `dwDisplayType`: UInt,
    public var `dwUsage`: UInt,
    public var `lpLocalName`: `windows_sys`.`core`.`PSTR`,
    public var `lpRemoteName`: `windows_sys`.`core`.`PSTR`,
    public var `lpComment`: `windows_sys`.`core`.`PSTR`,
    public var `lpProvider`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 189:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NETRESOURCEA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NETRESOURCEW` (
    public var `dwScope`: `NET_RESOURCE_SCOPE`,
    public var `dwType`: `NET_RESOURCE_TYPE`,
    public var `dwDisplayType`: UInt,
    public var `dwUsage`: UInt,
    public var `lpLocalName`: `windows_sys`.`core`.`PWSTR`,
    public var `lpRemoteName`: `windows_sys`.`core`.`PWSTR`,
    public var `lpComment`: `windows_sys`.`core`.`PWSTR`,
    public var `lpProvider`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 206:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NETRESOURCEW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `NETWORK_NAME_FORMAT_FLAGS` = UInt;
public typealias `NET_CONNECT_FLAGS` = UInt;
public typealias `NET_RESOURCE_SCOPE` = UInt;
public typealias `NET_RESOURCE_TYPE` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NOTIFYADD` (
    public var `hwndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `NetResource`: `NETRESOURCEA`,
    public var `dwAddFlags`: `NET_CONNECT_FLAGS`,
)
// UNSUPPORTED Rust 222:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NOTIFYADD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NOTIFYCANCEL` (
    public var `lpName`: `windows_sys`.`core`.`PWSTR`,
    public var `lpProvider`: `windows_sys`.`core`.`PWSTR`,
    public var `dwFlags`: UInt,
    public var `fForce`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 235:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NOTIFYCANCEL {
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
public class `NOTIFYINFO` (
    public var `dwNotifyStatus`: UInt,
    public var `dwOperationStatus`: UInt,
    public var `lpContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 247:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NOTIFYINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NOTIFY_POST`: UInt = 2u;
public const val `NOTIFY_PRE`: UInt = 1u;
public typealias `NPDIRECTORY_NOTIFY_OPERATION` = UInt;
public typealias `NP_PROPERTY_DIALOG_SELECTION` = UInt;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PF_AddConnectNotify` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`NOTIFYINFO`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`NOTIFYADD`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PF_CancelConnectNotify` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`NOTIFYINFO`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`NOTIFYCANCEL`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PF_NPAddConnection` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`NETRESOURCEW`>?, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PF_NPAddConnection3` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HWND`, /* Rust *const */ kotlinx.cinterop.CPointer<`NETRESOURCEW`>?, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, UInt) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PF_NPAddConnection4` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HWND`, /* Rust *const */ kotlinx.cinterop.CPointer<`NETRESOURCEW`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, UInt) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PF_NPCancelConnection` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`BOOL`) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PF_NPCancelConnection2` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`BOOL`, UInt) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PF_NPCloseEnum` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PF_NPDeviceMode` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HWND`) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PF_NPDirectoryNotify` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HWND`, `windows_sys`.`core`.`PCWSTR`, UInt) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PF_NPEnumResource` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PF_NPFMXEditPerm` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, `super`.`super`.`Foundation`.`HWND`, UInt) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PF_NPFMXGetPermCaps` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PF_NPFMXGetPermHelp` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, UInt, `windows_sys`.`core`.`BOOL`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PF_NPFormatNetworkName` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, UInt, UInt) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PF_NPGetCaps` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PF_NPGetConnection` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PF_NPGetConnection3` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PF_NPGetConnectionPerformance` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`NETCONNECTINFOSTRUCT`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PF_NPGetDirectoryType` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `windows_sys`.`core`.`BOOL`) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PF_NPGetPersistentUseOptionsForConnection` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PF_NPGetPropertyText` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, UInt, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PWSTR`, UInt, UInt) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PF_NPGetResourceInformation` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`NETRESOURCEW`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PF_NPGetResourceParent` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`NETRESOURCEW`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PF_NPGetUniversalName` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PF_NPGetUser` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PF_NPLogonNotify` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`LUID`>?, `windows_sys`.`core`.`PCWSTR`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `windows_sys`.`core`.`PCWSTR`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `windows_sys`.`core`.`PCWSTR`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PF_NPOpenEnum` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, UInt, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`NETRESOURCEW`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PF_NPPasswordChangeNotify` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `windows_sys`.`core`.`PCWSTR`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `windows_sys`.`core`.`PCWSTR`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PF_NPPropertyDialog` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HWND`, UInt, UInt, `windows_sys`.`core`.`PCWSTR`, UInt) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PF_NPSearchDialog` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HWND`, /* Rust *const */ kotlinx.cinterop.CPointer<`NETRESOURCEW`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> UInt>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `REMOTE_NAME_INFOA` (
    public var `lpUniversalName`: `windows_sys`.`core`.`PSTR`,
    public var `lpConnectionName`: `windows_sys`.`core`.`PSTR`,
    public var `lpRemainingPath`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 294:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for REMOTE_NAME_INFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `REMOTE_NAME_INFOW` (
    public var `lpUniversalName`: `windows_sys`.`core`.`PWSTR`,
    public var `lpConnectionName`: `windows_sys`.`core`.`PWSTR`,
    public var `lpRemainingPath`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 306:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for REMOTE_NAME_INFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `REMOTE_NAME_INFO_LEVEL`: `UNC_INFO_LEVEL` = 2u;
public const val `RESOURCEDISPLAYTYPE_DIRECTORY`: UInt = 9u;
public const val `RESOURCEDISPLAYTYPE_NDSCONTAINER`: UInt = 11u;
public const val `RESOURCEDISPLAYTYPE_NETWORK`: UInt = 6u;
public const val `RESOURCEDISPLAYTYPE_ROOT`: UInt = 7u;
public const val `RESOURCEDISPLAYTYPE_SHAREADMIN`: UInt = 8u;
public const val `RESOURCETYPE_ANY`: `NET_RESOURCE_TYPE` = 0u;
public const val `RESOURCETYPE_DISK`: `NET_RESOURCE_TYPE` = 1u;
public const val `RESOURCETYPE_PRINT`: `NET_RESOURCE_TYPE` = 2u;
public const val `RESOURCETYPE_RESERVED`: UInt = 8u;
public const val `RESOURCETYPE_UNKNOWN`: UInt = 4294967295u;
public const val `RESOURCEUSAGE_ALL`: `WNET_OPEN_ENUM_USAGE` = 19u;
public const val `RESOURCEUSAGE_ATTACHED`: `WNET_OPEN_ENUM_USAGE` = 16u;
public const val `RESOURCEUSAGE_CONNECTABLE`: `WNET_OPEN_ENUM_USAGE` = 1u;
public const val `RESOURCEUSAGE_CONTAINER`: `WNET_OPEN_ENUM_USAGE` = 2u;
public const val `RESOURCEUSAGE_NOLOCALDEVICE`: UInt = 4u;
public const val `RESOURCEUSAGE_NONE`: `WNET_OPEN_ENUM_USAGE` = 0u;
public const val `RESOURCEUSAGE_RESERVED`: UInt = 2147483648u;
public const val `RESOURCEUSAGE_SIBLING`: UInt = 8u;
public const val `RESOURCE_CONNECTED`: `NET_RESOURCE_SCOPE` = 1u;
public const val `RESOURCE_CONTEXT`: `NET_RESOURCE_SCOPE` = 5u;
public const val `RESOURCE_GLOBALNET`: `NET_RESOURCE_SCOPE` = 2u;
public const val `RESOURCE_RECENT`: UInt = 4u;
public const val `RESOURCE_REMEMBERED`: `NET_RESOURCE_SCOPE` = 3u;
public typealias `UNC_INFO_LEVEL` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `UNIVERSAL_NAME_INFOA` (
    public var `lpUniversalName`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 341:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for UNIVERSAL_NAME_INFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `UNIVERSAL_NAME_INFOW` (
    public var `lpUniversalName`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 351:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for UNIVERSAL_NAME_INFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `UNIVERSAL_NAME_INFO_LEVEL`: `UNC_INFO_LEVEL` = 1u;
public const val `WNCON_DYNAMIC`: UInt = 8u;
public const val `WNCON_FORNETCARD`: UInt = 1u;
public const val `WNCON_NOTROUTED`: UInt = 2u;
public const val `WNCON_SLOWLINK`: UInt = 4u;
public const val `WNDN_MKDIR`: `NPDIRECTORY_NOTIFY_OPERATION` = 1u;
public const val `WNDN_MVDIR`: `NPDIRECTORY_NOTIFY_OPERATION` = 3u;
public const val `WNDN_RMDIR`: `NPDIRECTORY_NOTIFY_OPERATION` = 2u;
public const val `WNDT_NETWORK`: UInt = 1u;
public const val `WNDT_NORMAL`: UInt = 0u;
public typealias `WNET_OPEN_ENUM_USAGE` = UInt;
public const val `WNFMT_ABBREVIATED`: `NETWORK_NAME_FORMAT_FLAGS` = 2u;
public const val `WNFMT_CONNECTION`: UInt = 32u;
public const val `WNFMT_INENUM`: UInt = 16u;
public const val `WNFMT_MULTILINE`: `NETWORK_NAME_FORMAT_FLAGS` = 1u;
public const val `WNGETCON_CONNECTED`: UInt = 0u;
public const val `WNGETCON_DISCONNECTED`: UInt = 1u;
public const val `WNNC_ADMIN`: UInt = 9u;
public const val `WNNC_ADM_DIRECTORYNOTIFY`: UInt = 2u;
public const val `WNNC_ADM_GETDIRECTORYTYPE`: UInt = 1u;
public const val `WNNC_CONNECTION`: UInt = 6u;
public const val `WNNC_CONNECTION_FLAGS`: UInt = 13u;
public const val `WNNC_CON_ADDCONNECTION`: UInt = 1u;
public const val `WNNC_CON_ADDCONNECTION3`: UInt = 8u;
public const val `WNNC_CON_ADDCONNECTION4`: UInt = 16u;
public const val `WNNC_CON_CANCELCONNECTION`: UInt = 2u;
public const val `WNNC_CON_CANCELCONNECTION2`: UInt = 32u;
public const val `WNNC_CON_DEFER`: UInt = 128u;
public const val `WNNC_CON_GETCONNECTIONS`: UInt = 4u;
public const val `WNNC_CON_GETPERFORMANCE`: UInt = 64u;
public const val `WNNC_DIALOG`: UInt = 8u;
public const val `WNNC_DLG_DEVICEMODE`: UInt = 1u;
public const val `WNNC_DLG_FORMATNETWORKNAME`: UInt = 128u;
public const val `WNNC_DLG_GETRESOURCEINFORMATION`: UInt = 2048u;
public const val `WNNC_DLG_GETRESOURCEPARENT`: UInt = 512u;
public const val `WNNC_DLG_PERMISSIONEDITOR`: UInt = 256u;
public const val `WNNC_DLG_PROPERTYDIALOG`: UInt = 32u;
public const val `WNNC_DLG_SEARCHDIALOG`: UInt = 64u;
public const val `WNNC_DRIVER_VERSION`: UInt = 3u;
public const val `WNNC_ENUMERATION`: UInt = 11u;
public const val `WNNC_ENUM_CONTEXT`: UInt = 4u;
public const val `WNNC_ENUM_GLOBAL`: UInt = 1u;
public const val `WNNC_ENUM_LOCAL`: UInt = 2u;
public const val `WNNC_ENUM_SHAREABLE`: UInt = 8u;
public const val `WNNC_NET_NONE`: UInt = 0u;
public const val `WNNC_NET_TYPE`: UInt = 2u;
public const val `WNNC_SPEC_VERSION`: UInt = 1u;
public const val `WNNC_SPEC_VERSION51`: UInt = 327681u;
public const val `WNNC_START`: UInt = 12u;
public const val `WNNC_USER`: UInt = 4u;
public const val `WNNC_USR_GETUSER`: UInt = 1u;
public const val `WNNC_WAIT_FOR_START`: UInt = 1u;
public const val `WNPERMC_AUDIT`: UInt = 2u;
public const val `WNPERMC_OWNER`: UInt = 4u;
public const val `WNPERMC_PERM`: UInt = 1u;
public typealias `WNPERM_DLG` = UInt;
public const val `WNPERM_DLG_AUDIT`: `WNPERM_DLG` = 1u;
public const val `WNPERM_DLG_OWNER`: `WNPERM_DLG` = 2u;
public const val `WNPERM_DLG_PERM`: `WNPERM_DLG` = 0u;
public const val `WNPS_DIR`: `NP_PROPERTY_DIALOG_SELECTION` = 1u;
public const val `WNPS_FILE`: `NP_PROPERTY_DIALOG_SELECTION` = 0u;
public const val `WNPS_MULT`: `NP_PROPERTY_DIALOG_SELECTION` = 2u;
public const val `WNSRCH_REFRESH_FIRST_LEVEL`: UInt = 1u;
public const val `WNTYPE_COMM`: UInt = 4u;
public const val `WNTYPE_DRIVE`: UInt = 1u;
public const val `WNTYPE_FILE`: UInt = 2u;
public const val `WNTYPE_PRINTER`: UInt = 3u;
public const val `WN_CREDENTIAL_CLASS`: UInt = 2u;
public const val `WN_NETWORK_CLASS`: UInt = 1u;
public const val `WN_NT_PASSWORD_CHANGED`: UInt = 2u;
public const val `WN_PRIMARY_AUTHENT_CLASS`: UInt = 4u;
public const val `WN_SERVICE_CLASS`: UInt = 8u;
public const val `WN_VALID_LOGON_ACCOUNT`: UInt = 1u;
