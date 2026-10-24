// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Mod has no candidate rule; syntax: no per-file syntax rule for Mod
// #[cfg(feature = "Win32_System_Memory_NonVolatile")]
// pub mod NonVolatile;

// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=AddSecureMemoryCacheCallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddSecureMemoryCacheCallback`(`pfncallback` : `PSECURE_MEMORY_CACHE_CALLBACK`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=AllocateUserPhysicalPages; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AllocateUserPhysicalPages`(`hprocess` : `super`.`super`.`Foundation`.`HANDLE`, `numberofpages` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `pagearray` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-memory-l1-1-8.dll, ABI=system, export=AllocateUserPhysicalPages2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AllocateUserPhysicalPages2`(`objecthandle` : `super`.`super`.`Foundation`.`HANDLE`, `numberofpages` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `pagearray` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `extendedparameters` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MEM_EXTENDED_PARAMETER`>?, `extendedparametercount` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=AllocateUserPhysicalPagesNuma; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AllocateUserPhysicalPagesNuma`(`hprocess` : `super`.`super`.`Foundation`.`HANDLE`, `numberofpages` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `pagearray` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `nndpreferred` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-memory-l1-1-7.dll, ABI=system, export=CreateFileMapping2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `CreateFileMapping2`(`file` : `super`.`super`.`Foundation`.`HANDLE`, `securityattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?, `desiredaccess` : UInt, `pageprotection` : `PAGE_PROTECTION_FLAGS`, `allocationattributes` : UInt, `maximumsize` : ULong, `name` : `windows_sys`.`core`.`PCWSTR`, `extendedparameters` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MEM_EXTENDED_PARAMETER`>?, `parametercount` : UInt) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CreateFileMappingA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `CreateFileMappingA`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `lpfilemappingattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?, `flprotect` : `PAGE_PROTECTION_FLAGS`, `dwmaximumsizehigh` : UInt, `dwmaximumsizelow` : UInt, `lpname` : `windows_sys`.`core`.`PCSTR`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CreateFileMappingFromApp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `CreateFileMappingFromApp`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `securityattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?, `pageprotection` : `PAGE_PROTECTION_FLAGS`, `maximumsize` : ULong, `name` : `windows_sys`.`core`.`PCWSTR`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CreateFileMappingNumaA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `CreateFileMappingNumaA`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `lpfilemappingattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?, `flprotect` : `PAGE_PROTECTION_FLAGS`, `dwmaximumsizehigh` : UInt, `dwmaximumsizelow` : UInt, `lpname` : `windows_sys`.`core`.`PCSTR`, `nndpreferred` : UInt) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CreateFileMappingNumaW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `CreateFileMappingNumaW`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `lpfilemappingattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?, `flprotect` : `PAGE_PROTECTION_FLAGS`, `dwmaximumsizehigh` : UInt, `dwmaximumsizelow` : UInt, `lpname` : `windows_sys`.`core`.`PCWSTR`, `nndpreferred` : UInt) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CreateFileMappingW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `CreateFileMappingW`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `lpfilemappingattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?, `flprotect` : `PAGE_PROTECTION_FLAGS`, `dwmaximumsizehigh` : UInt, `dwmaximumsizelow` : UInt, `lpname` : `windows_sys`.`core`.`PCWSTR`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CreateMemoryResourceNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateMemoryResourceNotification`(`notificationtype` : `MEMORY_RESOURCE_NOTIFICATION_TYPE`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=DiscardVirtualMemory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DiscardVirtualMemory`(`virtualaddress` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `size` : ULong) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=FlushViewOfFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FlushViewOfFile`(`lpbaseaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwnumberofbytestoflush` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=FreeUserPhysicalPages; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FreeUserPhysicalPages`(`hprocess` : `super`.`super`.`Foundation`.`HANDLE`, `numberofpages` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `pagearray` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetLargePageMinimum; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetLargePageMinimum`() : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetMemoryErrorHandlingCapabilities; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetMemoryErrorHandlingCapabilities`(`capabilities` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetProcessHeap; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetProcessHeap`() : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetProcessHeaps; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetProcessHeaps`(`numberofheaps` : UInt, `processheaps` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetProcessWorkingSetSizeEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetProcessWorkingSetSizeEx`(`hprocess` : `super`.`super`.`Foundation`.`HANDLE`, `lpminimumworkingsetsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `lpmaximumworkingsetsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `flags` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetSystemFileCacheSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetSystemFileCacheSize`(`lpminimumfilecachesize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `lpmaximumfilecachesize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `lpflags` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetWriteWatch; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetWriteWatch`(`dwflags` : UInt, `lpbaseaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwregionsize` : ULong, `lpaddresses` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `lpdwcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `lpdwgranularity` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GlobalAlloc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GlobalAlloc`(`uflags` : `GLOBAL_ALLOC_FLAGS`, `dwbytes` : ULong) : `super`.`super`.`Foundation`.`HGLOBAL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GlobalFlags; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GlobalFlags`(`hmem` : `super`.`super`.`Foundation`.`HGLOBAL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GlobalHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GlobalHandle`(`pmem` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`Foundation`.`HGLOBAL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GlobalLock; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GlobalLock`(`hmem` : `super`.`super`.`Foundation`.`HGLOBAL`) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GlobalReAlloc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GlobalReAlloc`(`hmem` : `super`.`super`.`Foundation`.`HGLOBAL`, `dwbytes` : ULong, `uflags` : UInt) : `super`.`super`.`Foundation`.`HGLOBAL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GlobalSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GlobalSize`(`hmem` : `super`.`super`.`Foundation`.`HGLOBAL`) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GlobalUnlock; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GlobalUnlock`(`hmem` : `super`.`super`.`Foundation`.`HGLOBAL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=HeapAlloc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HeapAlloc`(`hheap` : `super`.`super`.`Foundation`.`HANDLE`, `dwflags` : `HEAP_FLAGS`, `dwbytes` : ULong) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=HeapCompact; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HeapCompact`(`hheap` : `super`.`super`.`Foundation`.`HANDLE`, `dwflags` : `HEAP_FLAGS`) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=HeapCreate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HeapCreate`(`floptions` : `HEAP_FLAGS`, `dwinitialsize` : ULong, `dwmaximumsize` : ULong) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=HeapDestroy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HeapDestroy`(`hheap` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=HeapFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HeapFree`(`hheap` : `super`.`super`.`Foundation`.`HANDLE`, `dwflags` : `HEAP_FLAGS`, `lpmem` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=HeapLock; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HeapLock`(`hheap` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=HeapQueryInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HeapQueryInformation`(`heaphandle` : `super`.`super`.`Foundation`.`HANDLE`, `heapinformationclass` : `HEAP_INFORMATION_CLASS`, `heapinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `heapinformationlength` : ULong, `returnlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=HeapReAlloc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HeapReAlloc`(`hheap` : `super`.`super`.`Foundation`.`HANDLE`, `dwflags` : `HEAP_FLAGS`, `lpmem` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwbytes` : ULong) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=HeapSetInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HeapSetInformation`(`heaphandle` : `super`.`super`.`Foundation`.`HANDLE`, `heapinformationclass` : `HEAP_INFORMATION_CLASS`, `heapinformation` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `heapinformationlength` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=HeapSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HeapSize`(`hheap` : `super`.`super`.`Foundation`.`HANDLE`, `dwflags` : `HEAP_FLAGS`, `lpmem` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=HeapSummary; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HeapSummary`(`hheap` : `super`.`super`.`Foundation`.`HANDLE`, `dwflags` : UInt, `lpsummary` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HEAP_SUMMARY`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=HeapUnlock; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HeapUnlock`(`hheap` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=HeapValidate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HeapValidate`(`hheap` : `super`.`super`.`Foundation`.`HANDLE`, `dwflags` : `HEAP_FLAGS`, `lpmem` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=HeapWalk; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HeapWalk`(`hheap` : `super`.`super`.`Foundation`.`HANDLE`, `lpentry` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PROCESS_HEAP_ENTRY`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=IsBadCodePtr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsBadCodePtr`(`lpfn` : `super`.`super`.`Foundation`.`FARPROC`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=IsBadReadPtr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsBadReadPtr`(`lp` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ucb` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=IsBadStringPtrA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsBadStringPtrA`(`lpsz` : `windows_sys`.`core`.`PCSTR`, `ucchmax` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=IsBadStringPtrW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsBadStringPtrW`(`lpsz` : `windows_sys`.`core`.`PCWSTR`, `ucchmax` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=IsBadWritePtr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsBadWritePtr`(`lp` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ucb` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=LocalAlloc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LocalAlloc`(`uflags` : `LOCAL_ALLOC_FLAGS`, `ubytes` : ULong) : `super`.`super`.`Foundation`.`HLOCAL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=LocalFlags; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LocalFlags`(`hmem` : `super`.`super`.`Foundation`.`HLOCAL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=LocalHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LocalHandle`(`pmem` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`Foundation`.`HLOCAL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=LocalLock; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LocalLock`(`hmem` : `super`.`super`.`Foundation`.`HLOCAL`) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=LocalReAlloc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LocalReAlloc`(`hmem` : `super`.`super`.`Foundation`.`HLOCAL`, `ubytes` : ULong, `uflags` : UInt) : `super`.`super`.`Foundation`.`HLOCAL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=LocalSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LocalSize`(`hmem` : `super`.`super`.`Foundation`.`HLOCAL`) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=LocalUnlock; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LocalUnlock`(`hmem` : `super`.`super`.`Foundation`.`HLOCAL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=MapUserPhysicalPages; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MapUserPhysicalPages`(`virtualaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `numberofpages` : ULong, `pagearray` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=MapUserPhysicalPagesScatter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MapUserPhysicalPagesScatter`(`virtualaddresses` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `numberofpages` : ULong, `pagearray` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=MapViewOfFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MapViewOfFile`(`hfilemappingobject` : `super`.`super`.`Foundation`.`HANDLE`, `dwdesiredaccess` : `FILE_MAP`, `dwfileoffsethigh` : UInt, `dwfileoffsetlow` : UInt, `dwnumberofbytestomap` : ULong) : `MEMORY_MAPPED_VIEW_ADDRESS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-memory-l1-1-6.dll, ABI=system, export=MapViewOfFile3; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MapViewOfFile3`(`filemapping` : `super`.`super`.`Foundation`.`HANDLE`, `process` : `super`.`super`.`Foundation`.`HANDLE`, `baseaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `offset` : ULong, `viewsize` : ULong, `allocationtype` : `VIRTUAL_ALLOCATION_TYPE`, `pageprotection` : UInt, `extendedparameters` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MEM_EXTENDED_PARAMETER`>?, `parametercount` : UInt) : `MEMORY_MAPPED_VIEW_ADDRESS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-memory-l1-1-6.dll, ABI=system, export=MapViewOfFile3FromApp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MapViewOfFile3FromApp`(`filemapping` : `super`.`super`.`Foundation`.`HANDLE`, `process` : `super`.`super`.`Foundation`.`HANDLE`, `baseaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `offset` : ULong, `viewsize` : ULong, `allocationtype` : `VIRTUAL_ALLOCATION_TYPE`, `pageprotection` : UInt, `extendedparameters` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MEM_EXTENDED_PARAMETER`>?, `parametercount` : UInt) : `MEMORY_MAPPED_VIEW_ADDRESS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=MapViewOfFileEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MapViewOfFileEx`(`hfilemappingobject` : `super`.`super`.`Foundation`.`HANDLE`, `dwdesiredaccess` : `FILE_MAP`, `dwfileoffsethigh` : UInt, `dwfileoffsetlow` : UInt, `dwnumberofbytestomap` : ULong, `lpbaseaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `MEMORY_MAPPED_VIEW_ADDRESS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=MapViewOfFileExNuma; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MapViewOfFileExNuma`(`hfilemappingobject` : `super`.`super`.`Foundation`.`HANDLE`, `dwdesiredaccess` : `FILE_MAP`, `dwfileoffsethigh` : UInt, `dwfileoffsetlow` : UInt, `dwnumberofbytestomap` : ULong, `lpbaseaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `nndpreferred` : UInt) : `MEMORY_MAPPED_VIEW_ADDRESS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=MapViewOfFileFromApp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MapViewOfFileFromApp`(`hfilemappingobject` : `super`.`super`.`Foundation`.`HANDLE`, `desiredaccess` : `FILE_MAP`, `fileoffset` : ULong, `numberofbytestomap` : ULong) : `MEMORY_MAPPED_VIEW_ADDRESS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-memory-l1-1-5.dll, ABI=system, export=MapViewOfFileNuma2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MapViewOfFileNuma2`(`filemappinghandle` : `super`.`super`.`Foundation`.`HANDLE`, `processhandle` : `super`.`super`.`Foundation`.`HANDLE`, `offset` : ULong, `baseaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `viewsize` : ULong, `allocationtype` : UInt, `pageprotection` : UInt, `preferrednode` : UInt) : `MEMORY_MAPPED_VIEW_ADDRESS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=OfferVirtualMemory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OfferVirtualMemory`(`virtualaddress` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `size` : ULong, `priority` : `OFFER_PRIORITY`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-memory-l1-1-8.dll, ABI=system, export=OpenDedicatedMemoryPartition; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OpenDedicatedMemoryPartition`(`partition` : `super`.`super`.`Foundation`.`HANDLE`, `dedicatedmemorytypeid` : ULong, `desiredaccess` : UInt, `inherithandle` : `windows_sys`.`core`.`BOOL`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=OpenFileMappingA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OpenFileMappingA`(`dwdesiredaccess` : UInt, `binherithandle` : `windows_sys`.`core`.`BOOL`, `lpname` : `windows_sys`.`core`.`PCSTR`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-memory-l1-1-3.dll, ABI=system, export=OpenFileMappingFromApp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OpenFileMappingFromApp`(`desiredaccess` : UInt, `inherithandle` : `windows_sys`.`core`.`BOOL`, `name` : `windows_sys`.`core`.`PCWSTR`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=OpenFileMappingW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OpenFileMappingW`(`dwdesiredaccess` : UInt, `binherithandle` : `windows_sys`.`core`.`BOOL`, `lpname` : `windows_sys`.`core`.`PCWSTR`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=PrefetchVirtualMemory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PrefetchVirtualMemory`(`hprocess` : `super`.`super`.`Foundation`.`HANDLE`, `numberofentries` : ULong, `virtualaddresses` : /* Rust *const */ kotlinx.cinterop.CPointer<`WIN32_MEMORY_RANGE_ENTRY`>?, `flags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=QueryMemoryResourceNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `QueryMemoryResourceNotification`(`resourcenotificationhandle` : `super`.`super`.`Foundation`.`HANDLE`, `resourcestate` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-memory-l1-1-8.dll, ABI=system, export=QueryPartitionInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `QueryPartitionInformation`(`partition` : `super`.`super`.`Foundation`.`HANDLE`, `partitioninformationclass` : `WIN32_MEMORY_PARTITION_INFORMATION_CLASS`, `partitioninformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `partitioninformationlength` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-memory-l1-1-4.dll, ABI=system, export=QueryVirtualMemoryInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `QueryVirtualMemoryInformation`(`process` : `super`.`super`.`Foundation`.`HANDLE`, `virtualaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `memoryinformationclass` : `WIN32_MEMORY_INFORMATION_CLASS`, `memoryinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `memoryinformationsize` : ULong, `returnsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=ReclaimVirtualMemory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReclaimVirtualMemory`(`virtualaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `size` : ULong) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=RegisterBadMemoryNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegisterBadMemoryNotification`(`callback` : `PBAD_MEMORY_CALLBACK_ROUTINE`) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=RemoveSecureMemoryCacheCallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RemoveSecureMemoryCacheCallback`(`pfncallback` : `PSECURE_MEMORY_CACHE_CALLBACK`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=ResetWriteWatch; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ResetWriteWatch`(`lpbaseaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwregionsize` : ULong) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=RtlCompareMemory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtlCompareMemory`(`source1` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `source2` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `length` : ULong) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=RtlCrc32; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtlCrc32`(`buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `size` : ULong, `initialcrc` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=RtlCrc64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtlCrc64`(`buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `size` : ULong, `initialcrc` : ULong) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=RtlIsZeroMemory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtlIsZeroMemory`(`buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `length` : ULong) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-memory-l1-1-3.dll, ABI=system, export=SetProcessValidCallTargets; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetProcessValidCallTargets`(`hprocess` : `super`.`super`.`Foundation`.`HANDLE`, `virtualaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `regionsize` : ULong, `numberofoffsets` : UInt, `offsetinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CFG_CALL_TARGET_INFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-memory-l1-1-7.dll, ABI=system, export=SetProcessValidCallTargetsForMappedView; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetProcessValidCallTargetsForMappedView`(`process` : `super`.`super`.`Foundation`.`HANDLE`, `virtualaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `regionsize` : ULong, `numberofoffsets` : UInt, `offsetinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CFG_CALL_TARGET_INFO`>?, `section` : `super`.`super`.`Foundation`.`HANDLE`, `expectedfileoffset` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetProcessWorkingSetSizeEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetProcessWorkingSetSizeEx`(`hprocess` : `super`.`super`.`Foundation`.`HANDLE`, `dwminimumworkingsetsize` : ULong, `dwmaximumworkingsetsize` : ULong, `flags` : `SETPROCESSWORKINGSETSIZEEX_FLAGS`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetSystemFileCacheSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetSystemFileCacheSize`(`minimumfilecachesize` : ULong, `maximumfilecachesize` : ULong, `flags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=UnmapViewOfFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UnmapViewOfFile`(`lpbaseaddress` : `MEMORY_MAPPED_VIEW_ADDRESS`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-memory-l1-1-5.dll, ABI=system, export=UnmapViewOfFile2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UnmapViewOfFile2`(`process` : `super`.`super`.`Foundation`.`HANDLE`, `baseaddress` : `MEMORY_MAPPED_VIEW_ADDRESS`, `unmapflags` : `UNMAP_VIEW_OF_FILE_FLAGS`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=UnmapViewOfFileEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UnmapViewOfFileEx`(`baseaddress` : `MEMORY_MAPPED_VIEW_ADDRESS`, `unmapflags` : `UNMAP_VIEW_OF_FILE_FLAGS`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=UnregisterBadMemoryNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UnregisterBadMemoryNotification`(`registrationhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=VirtualAlloc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VirtualAlloc`(`lpaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwsize` : ULong, `flallocationtype` : `VIRTUAL_ALLOCATION_TYPE`, `flprotect` : `PAGE_PROTECTION_FLAGS`) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-memory-l1-1-6.dll, ABI=system, export=VirtualAlloc2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VirtualAlloc2`(`process` : `super`.`super`.`Foundation`.`HANDLE`, `baseaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `size` : ULong, `allocationtype` : `VIRTUAL_ALLOCATION_TYPE`, `pageprotection` : UInt, `extendedparameters` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MEM_EXTENDED_PARAMETER`>?, `parametercount` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-memory-l1-1-6.dll, ABI=system, export=VirtualAlloc2FromApp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VirtualAlloc2FromApp`(`process` : `super`.`super`.`Foundation`.`HANDLE`, `baseaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `size` : ULong, `allocationtype` : `VIRTUAL_ALLOCATION_TYPE`, `pageprotection` : UInt, `extendedparameters` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MEM_EXTENDED_PARAMETER`>?, `parametercount` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=VirtualAllocEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VirtualAllocEx`(`hprocess` : `super`.`super`.`Foundation`.`HANDLE`, `lpaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwsize` : ULong, `flallocationtype` : `VIRTUAL_ALLOCATION_TYPE`, `flprotect` : `PAGE_PROTECTION_FLAGS`) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=VirtualAllocExNuma; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VirtualAllocExNuma`(`hprocess` : `super`.`super`.`Foundation`.`HANDLE`, `lpaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwsize` : ULong, `flallocationtype` : `VIRTUAL_ALLOCATION_TYPE`, `flprotect` : UInt, `nndpreferred` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-memory-l1-1-3.dll, ABI=system, export=VirtualAllocFromApp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VirtualAllocFromApp`(`baseaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `size` : ULong, `allocationtype` : `VIRTUAL_ALLOCATION_TYPE`, `protection` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=VirtualFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VirtualFree`(`lpaddress` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwsize` : ULong, `dwfreetype` : `VIRTUAL_FREE_TYPE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=VirtualFreeEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VirtualFreeEx`(`hprocess` : `super`.`super`.`Foundation`.`HANDLE`, `lpaddress` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwsize` : ULong, `dwfreetype` : `VIRTUAL_FREE_TYPE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=VirtualLock; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VirtualLock`(`lpaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwsize` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=VirtualProtect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VirtualProtect`(`lpaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwsize` : ULong, `flnewprotect` : `PAGE_PROTECTION_FLAGS`, `lpfloldprotect` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PAGE_PROTECTION_FLAGS`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=VirtualProtectEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VirtualProtectEx`(`hprocess` : `super`.`super`.`Foundation`.`HANDLE`, `lpaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwsize` : ULong, `flnewprotect` : `PAGE_PROTECTION_FLAGS`, `lpfloldprotect` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PAGE_PROTECTION_FLAGS`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-memory-l1-1-3.dll, ABI=system, export=VirtualProtectFromApp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VirtualProtectFromApp`(`address` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `size` : ULong, `newprotection` : UInt, `oldprotection` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=VirtualQuery; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VirtualQuery`(`lpaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MEMORY_BASIC_INFORMATION`>?, `dwlength` : ULong) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=VirtualQueryEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VirtualQueryEx`(`hprocess` : `super`.`super`.`Foundation`.`HANDLE`, `lpaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MEMORY_BASIC_INFORMATION`>?, `dwlength` : ULong) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=VirtualUnlock; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VirtualUnlock`(`lpaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwsize` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-memory-l1-1-5.dll, ABI=system, export=VirtualUnlockEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VirtualUnlockEx`(`process` : `super`.`super`.`Foundation`.`HANDLE`, `address` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `size` : ULong) : `windows_sys`.`core`.`BOOL`
public typealias `AtlThunkData_t` = Long;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CFG_CALL_TARGET_INFO` (
    public var `Offset`: ULong,
    public var `Flags`: ULong,
)
public const val `FILE_CACHE_MAX_HARD_DISABLE`: UInt = 2u;
public const val `FILE_CACHE_MAX_HARD_ENABLE`: UInt = 1u;
public const val `FILE_CACHE_MIN_HARD_DISABLE`: UInt = 8u;
public const val `FILE_CACHE_MIN_HARD_ENABLE`: UInt = 4u;
public typealias `FILE_MAP` = UInt;
public const val `FILE_MAP_ALL_ACCESS`: `FILE_MAP` = 983071u;
public const val `FILE_MAP_COPY`: `FILE_MAP` = 1u;
public const val `FILE_MAP_EXECUTE`: `FILE_MAP` = 32u;
public const val `FILE_MAP_LARGE_PAGES`: `FILE_MAP` = 536870912u;
public const val `FILE_MAP_READ`: `FILE_MAP` = 4u;
public const val `FILE_MAP_RESERVE`: `FILE_MAP` = 2147483648u;
public const val `FILE_MAP_TARGETS_INVALID`: `FILE_MAP` = 1073741824u;
public const val `FILE_MAP_WRITE`: `FILE_MAP` = 2u;
public const val `GHND`: `GLOBAL_ALLOC_FLAGS` = 66u;
public typealias `GLOBAL_ALLOC_FLAGS` = UInt;
public const val `GMEM_FIXED`: `GLOBAL_ALLOC_FLAGS` = 0u;
public const val `GMEM_MOVEABLE`: `GLOBAL_ALLOC_FLAGS` = 2u;
public const val `GMEM_ZEROINIT`: `GLOBAL_ALLOC_FLAGS` = 64u;
public const val `GPTR`: `GLOBAL_ALLOC_FLAGS` = 64u;
public const val `HEAP_CREATE_ALIGN_16`: `HEAP_FLAGS` = 65536u;
public const val `HEAP_CREATE_ENABLE_EXECUTE`: `HEAP_FLAGS` = 262144u;
public const val `HEAP_CREATE_ENABLE_TRACING`: `HEAP_FLAGS` = 131072u;
public const val `HEAP_CREATE_HARDENED`: `HEAP_FLAGS` = 512u;
public const val `HEAP_CREATE_SEGMENT_HEAP`: `HEAP_FLAGS` = 256u;
public const val `HEAP_DISABLE_COALESCE_ON_FREE`: `HEAP_FLAGS` = 128u;
public typealias `HEAP_FLAGS` = UInt;
public const val `HEAP_FREE_CHECKING_ENABLED`: `HEAP_FLAGS` = 64u;
public const val `HEAP_GENERATE_EXCEPTIONS`: `HEAP_FLAGS` = 4u;
public const val `HEAP_GROWABLE`: `HEAP_FLAGS` = 2u;
public typealias `HEAP_INFORMATION_CLASS` = Int;
public const val `HEAP_MAXIMUM_TAG`: `HEAP_FLAGS` = 4095u;
public const val `HEAP_NONE`: `HEAP_FLAGS` = 0u;
public const val `HEAP_NO_SERIALIZE`: `HEAP_FLAGS` = 1u;
public const val `HEAP_PSEUDO_TAG_FLAG`: `HEAP_FLAGS` = 32768u;
public const val `HEAP_REALLOC_IN_PLACE_ONLY`: `HEAP_FLAGS` = 16u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HEAP_SUMMARY` (
    public var `cb`: UInt,
    public var `cbAllocated`: ULong,
    public var `cbCommitted`: ULong,
    public var `cbReserved`: ULong,
    public var `cbMaxReserve`: ULong,
)
public const val `HEAP_TAG_SHIFT`: `HEAP_FLAGS` = 18u;
public const val `HEAP_TAIL_CHECKING_ENABLED`: `HEAP_FLAGS` = 32u;
public const val `HEAP_ZERO_MEMORY`: `HEAP_FLAGS` = 8u;
public const val `HeapCompatibilityInformation`: `HEAP_INFORMATION_CLASS` = 0;
public const val `HeapEnableTerminationOnCorruption`: `HEAP_INFORMATION_CLASS` = 1;
public const val `HeapOptimizeResources`: `HEAP_INFORMATION_CLASS` = 3;
public const val `HeapTag`: `HEAP_INFORMATION_CLASS` = 7;
public const val `HighMemoryResourceNotification`: `MEMORY_RESOURCE_NOTIFICATION_TYPE` = 1;
public const val `LHND`: `LOCAL_ALLOC_FLAGS` = 66u;
public const val `LMEM_FIXED`: `LOCAL_ALLOC_FLAGS` = 0u;
public const val `LMEM_MOVEABLE`: `LOCAL_ALLOC_FLAGS` = 2u;
public const val `LMEM_ZEROINIT`: `LOCAL_ALLOC_FLAGS` = 64u;
public typealias `LOCAL_ALLOC_FLAGS` = UInt;
public const val `LPTR`: `LOCAL_ALLOC_FLAGS` = 64u;
public const val `LowMemoryResourceNotification`: `MEMORY_RESOURCE_NOTIFICATION_TYPE` = 0;
public const val `MEHC_PATROL_SCRUBBER_PRESENT`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MEMORY_BASIC_INFORMATION` (
    public var `BaseAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `AllocationBase`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `AllocationProtect`: `PAGE_PROTECTION_FLAGS`,
    public var `RegionSize`: ULong,
    public var `State`: `VIRTUAL_ALLOCATION_TYPE`,
    public var `Protect`: `PAGE_PROTECTION_FLAGS`,
    public var `Type`: `PAGE_TYPE`,
)
// UNSUPPORTED Rust 192:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for MEMORY_BASIC_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MEMORY_BASIC_INFORMATION` (
    public var `BaseAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `AllocationBase`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `AllocationProtect`: `PAGE_PROTECTION_FLAGS`,
    public var `PartitionId`: UShort,
    public var `RegionSize`: ULong,
    public var `State`: `VIRTUAL_ALLOCATION_TYPE`,
    public var `Protect`: `PAGE_PROTECTION_FLAGS`,
    public var `Type`: `PAGE_TYPE`,
)
// UNSUPPORTED Rust 211:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for MEMORY_BASIC_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MEMORY_BASIC_INFORMATION32` (
    public var `BaseAddress`: UInt,
    public var `AllocationBase`: UInt,
    public var `AllocationProtect`: `PAGE_PROTECTION_FLAGS`,
    public var `RegionSize`: UInt,
    public var `State`: `VIRTUAL_ALLOCATION_TYPE`,
    public var `Protect`: `PAGE_PROTECTION_FLAGS`,
    public var `Type`: `PAGE_TYPE`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MEMORY_BASIC_INFORMATION64` (
    public var `BaseAddress`: ULong,
    public var `AllocationBase`: ULong,
    public var `AllocationProtect`: `PAGE_PROTECTION_FLAGS`,
    public var `__alignment1`: UInt,
    public var `RegionSize`: ULong,
    public var `State`: `VIRTUAL_ALLOCATION_TYPE`,
    public var `Protect`: `PAGE_PROTECTION_FLAGS`,
    public var `Type`: `PAGE_TYPE`,
    public var `__alignment2`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MEMORY_MAPPED_VIEW_ADDRESS` (
    public var `Value`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 246:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MEMORY_MAPPED_VIEW_ADDRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MEMORY_PARTITION_DEDICATED_MEMORY_ATTRIBUTE` (
    public var `Type`: `MEM_DEDICATED_ATTRIBUTE_TYPE`,
    public var `Reserved`: UInt,
    public var `Value`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MEMORY_PARTITION_DEDICATED_MEMORY_INFORMATION` (
    public var `NextEntryOffset`: UInt,
    public var `SizeOfInformation`: UInt,
    public var `Flags`: UInt,
    public var `AttributesOffset`: UInt,
    public var `AttributeCount`: UInt,
    public var `Reserved`: UInt,
    public var `TypeId`: ULong,
)
public typealias `MEMORY_RESOURCE_NOTIFICATION_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MEM_ADDRESS_REQUIREMENTS` (
    public var `LowestStartingAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `HighestEndingAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Alignment`: ULong,
)
// UNSUPPORTED Rust 277:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MEM_ADDRESS_REQUIREMENTS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MEM_COMMIT`: `VIRTUAL_ALLOCATION_TYPE` = 4096u;
public const val `MEM_DECOMMIT`: `VIRTUAL_FREE_TYPE` = 16384u;
public typealias `MEM_DEDICATED_ATTRIBUTE_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MEM_EXTENDED_PARAMETER` (
    public var `Anonymous1`: `MEM_EXTENDED_PARAMETER_0`,
    public var `Anonymous2`: `MEM_EXTENDED_PARAMETER_1`,
)
// UNSUPPORTED Rust 291:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MEM_EXTENDED_PARAMETER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MEM_EXTENDED_PARAMETER_0` (
    public var `_bitfield`: ULong,
)
// UNSUPPORTED Rust 301:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MEM_EXTENDED_PARAMETER_1 {
//     pub ULong64: u64,
//     pub Pointer: *mut core::ffi::c_void,
//     pub Size: usize,
//     pub Handle: super::super::Foundation::HANDLE,
//     pub ULong: u32,
// }

// UNSUPPORTED Rust 310:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MEM_EXTENDED_PARAMETER_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `MEM_EXTENDED_PARAMETER_TYPE` = Int;
public const val `MEM_FREE`: `VIRTUAL_ALLOCATION_TYPE` = 65536u;
public const val `MEM_IMAGE`: `PAGE_TYPE` = 16777216u;
public const val `MEM_LARGE_PAGES`: `VIRTUAL_ALLOCATION_TYPE` = 536870912u;
public const val `MEM_MAPPED`: `PAGE_TYPE` = 262144u;
public const val `MEM_PRESERVE_PLACEHOLDER`: `UNMAP_VIEW_OF_FILE_FLAGS` = 2u;
public const val `MEM_PRIVATE`: `PAGE_TYPE` = 131072u;
public const val `MEM_RELEASE`: `VIRTUAL_FREE_TYPE` = 32768u;
public const val `MEM_REPLACE_PLACEHOLDER`: `VIRTUAL_ALLOCATION_TYPE` = 16384u;
public const val `MEM_RESERVE`: `VIRTUAL_ALLOCATION_TYPE` = 8192u;
public const val `MEM_RESERVE_PLACEHOLDER`: `VIRTUAL_ALLOCATION_TYPE` = 262144u;
public const val `MEM_RESET`: `VIRTUAL_ALLOCATION_TYPE` = 524288u;
public const val `MEM_RESET_UNDO`: `VIRTUAL_ALLOCATION_TYPE` = 16777216u;
public typealias `MEM_SECTION_EXTENDED_PARAMETER_TYPE` = Int;
public const val `MEM_UNMAP_NONE`: `UNMAP_VIEW_OF_FILE_FLAGS` = 0u;
public const val `MEM_UNMAP_WITH_TRANSIENT_BOOST`: `UNMAP_VIEW_OF_FILE_FLAGS` = 1u;
public const val `MemDedicatedAttributeMax`: `MEM_DEDICATED_ATTRIBUTE_TYPE` = 4;
public const val `MemDedicatedAttributeReadBandwidth`: `MEM_DEDICATED_ATTRIBUTE_TYPE` = 0;
public const val `MemDedicatedAttributeReadLatency`: `MEM_DEDICATED_ATTRIBUTE_TYPE` = 1;
public const val `MemDedicatedAttributeWriteBandwidth`: `MEM_DEDICATED_ATTRIBUTE_TYPE` = 2;
public const val `MemDedicatedAttributeWriteLatency`: `MEM_DEDICATED_ATTRIBUTE_TYPE` = 3;
public const val `MemExtendedParameterAddressRequirements`: `MEM_EXTENDED_PARAMETER_TYPE` = 1;
public const val `MemExtendedParameterAttributeFlags`: `MEM_EXTENDED_PARAMETER_TYPE` = 5;
public const val `MemExtendedParameterImageMachine`: `MEM_EXTENDED_PARAMETER_TYPE` = 6;
public const val `MemExtendedParameterInvalidType`: `MEM_EXTENDED_PARAMETER_TYPE` = 0;
public const val `MemExtendedParameterMax`: `MEM_EXTENDED_PARAMETER_TYPE` = 7;
public const val `MemExtendedParameterNumaNode`: `MEM_EXTENDED_PARAMETER_TYPE` = 2;
public const val `MemExtendedParameterPartitionHandle`: `MEM_EXTENDED_PARAMETER_TYPE` = 3;
public const val `MemExtendedParameterUserPhysicalHandle`: `MEM_EXTENDED_PARAMETER_TYPE` = 4;
public const val `MemSectionExtendedParameterInvalidType`: `MEM_SECTION_EXTENDED_PARAMETER_TYPE` = 0;
public const val `MemSectionExtendedParameterMax`: `MEM_SECTION_EXTENDED_PARAMETER_TYPE` = 4;
public const val `MemSectionExtendedParameterNumaNode`: `MEM_SECTION_EXTENDED_PARAMETER_TYPE` = 2;
public const val `MemSectionExtendedParameterSigningLevel`: `MEM_SECTION_EXTENDED_PARAMETER_TYPE` = 3;
public const val `MemSectionExtendedParameterUserPhysicalFlags`: `MEM_SECTION_EXTENDED_PARAMETER_TYPE` = 1;
public const val `MemoryPartitionDedicatedMemoryInfo`: `WIN32_MEMORY_PARTITION_INFORMATION_CLASS` = 1;
public const val `MemoryPartitionInfo`: `WIN32_MEMORY_PARTITION_INFORMATION_CLASS` = 0;
public const val `MemoryRegionInfo`: `WIN32_MEMORY_INFORMATION_CLASS` = 0;
public const val `NONZEROLHND`: `LOCAL_ALLOC_FLAGS` = 2u;
public const val `NONZEROLPTR`: `LOCAL_ALLOC_FLAGS` = 0u;
public typealias `OFFER_PRIORITY` = Int;
public const val `PAGE_ENCLAVE_DECOMMIT`: `PAGE_PROTECTION_FLAGS` = 268435456u;
public const val `PAGE_ENCLAVE_MASK`: `PAGE_PROTECTION_FLAGS` = 268435456u;
public const val `PAGE_ENCLAVE_SS_FIRST`: `PAGE_PROTECTION_FLAGS` = 268435457u;
public const val `PAGE_ENCLAVE_SS_REST`: `PAGE_PROTECTION_FLAGS` = 268435458u;
public const val `PAGE_ENCLAVE_THREAD_CONTROL`: `PAGE_PROTECTION_FLAGS` = 2147483648u;
public const val `PAGE_ENCLAVE_UNVALIDATED`: `PAGE_PROTECTION_FLAGS` = 536870912u;
public const val `PAGE_EXECUTE`: `PAGE_PROTECTION_FLAGS` = 16u;
public const val `PAGE_EXECUTE_READ`: `PAGE_PROTECTION_FLAGS` = 32u;
public const val `PAGE_EXECUTE_READWRITE`: `PAGE_PROTECTION_FLAGS` = 64u;
public const val `PAGE_EXECUTE_WRITECOPY`: `PAGE_PROTECTION_FLAGS` = 128u;
public const val `PAGE_GRAPHICS_COHERENT`: `PAGE_PROTECTION_FLAGS` = 131072u;
public const val `PAGE_GRAPHICS_EXECUTE`: `PAGE_PROTECTION_FLAGS` = 16384u;
public const val `PAGE_GRAPHICS_EXECUTE_READ`: `PAGE_PROTECTION_FLAGS` = 32768u;
public const val `PAGE_GRAPHICS_EXECUTE_READWRITE`: `PAGE_PROTECTION_FLAGS` = 65536u;
public const val `PAGE_GRAPHICS_NOACCESS`: `PAGE_PROTECTION_FLAGS` = 2048u;
public const val `PAGE_GRAPHICS_NOCACHE`: `PAGE_PROTECTION_FLAGS` = 262144u;
public const val `PAGE_GRAPHICS_READONLY`: `PAGE_PROTECTION_FLAGS` = 4096u;
public const val `PAGE_GRAPHICS_READWRITE`: `PAGE_PROTECTION_FLAGS` = 8192u;
public const val `PAGE_GUARD`: `PAGE_PROTECTION_FLAGS` = 256u;
public const val `PAGE_NOACCESS`: `PAGE_PROTECTION_FLAGS` = 1u;
public const val `PAGE_NOCACHE`: `PAGE_PROTECTION_FLAGS` = 512u;
public typealias `PAGE_PROTECTION_FLAGS` = UInt;
public const val `PAGE_READONLY`: `PAGE_PROTECTION_FLAGS` = 2u;
public const val `PAGE_READWRITE`: `PAGE_PROTECTION_FLAGS` = 4u;
public const val `PAGE_REVERT_TO_FILE_MAP`: `PAGE_PROTECTION_FLAGS` = 2147483648u;
public const val `PAGE_TARGETS_INVALID`: `PAGE_PROTECTION_FLAGS` = 1073741824u;
public const val `PAGE_TARGETS_NO_UPDATE`: `PAGE_PROTECTION_FLAGS` = 1073741824u;
public typealias `PAGE_TYPE` = UInt;
public const val `PAGE_WRITECOMBINE`: `PAGE_PROTECTION_FLAGS` = 1024u;
public const val `PAGE_WRITECOPY`: `PAGE_PROTECTION_FLAGS` = 8u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PBAD_MEMORY_CALLBACK_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Unit>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROCESS_HEAP_ENTRY` (
    public var `lpData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `cbData`: UInt,
    public var `cbOverhead`: UByte,
    public var `iRegionIndex`: UByte,
    public var `wFlags`: UShort,
    public var `Anonymous`: `PROCESS_HEAP_ENTRY_0`,
)
// UNSUPPORTED Rust 396:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESS_HEAP_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 401:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PROCESS_HEAP_ENTRY_0 {
//     pub Block: PROCESS_HEAP_ENTRY_0_0,
//     pub Region: PROCESS_HEAP_ENTRY_0_1,
// }

// UNSUPPORTED Rust 407:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESS_HEAP_ENTRY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 412:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PROCESS_HEAP_ENTRY_0_0 {
//     pub hMem: super::super::Foundation::HANDLE,
//     pub dwReserved: [u32; 3],
// }

// UNSUPPORTED Rust 418:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESS_HEAP_ENTRY_0_0 {
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
public class `PROCESS_HEAP_ENTRY_0_1` (
    public var `dwCommittedSize`: UInt,
    public var `dwUnCommittedSize`: UInt,
    public var `lpFirstBlock`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `lpLastBlock`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 431:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESS_HEAP_ENTRY_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSECURE_MEMORY_CACHE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, ULong) -> Boolean>>>;
public const val `QUOTA_LIMITS_HARDWS_MAX_DISABLE`: `SETPROCESSWORKINGSETSIZEEX_FLAGS` = 8u;
public const val `QUOTA_LIMITS_HARDWS_MAX_ENABLE`: `SETPROCESSWORKINGSETSIZEEX_FLAGS` = 4u;
public const val `QUOTA_LIMITS_HARDWS_MIN_DISABLE`: `SETPROCESSWORKINGSETSIZEEX_FLAGS` = 2u;
public const val `QUOTA_LIMITS_HARDWS_MIN_ENABLE`: `SETPROCESSWORKINGSETSIZEEX_FLAGS` = 1u;
public const val `SECTION_ALL_ACCESS`: `SECTION_FLAGS` = 983071u;
public const val `SECTION_EXTEND_SIZE`: `SECTION_FLAGS` = 16u;
public typealias `SECTION_FLAGS` = UInt;
public const val `SECTION_MAP_EXECUTE`: `SECTION_FLAGS` = 8u;
public const val `SECTION_MAP_EXECUTE_EXPLICIT`: `SECTION_FLAGS` = 32u;
public const val `SECTION_MAP_READ`: `SECTION_FLAGS` = 4u;
public const val `SECTION_MAP_WRITE`: `SECTION_FLAGS` = 2u;
public const val `SECTION_QUERY`: `SECTION_FLAGS` = 1u;
public const val `SEC_64K_PAGES`: `PAGE_PROTECTION_FLAGS` = 524288u;
public const val `SEC_COMMIT`: `PAGE_PROTECTION_FLAGS` = 134217728u;
public const val `SEC_FILE`: `PAGE_PROTECTION_FLAGS` = 8388608u;
public const val `SEC_IMAGE`: `PAGE_PROTECTION_FLAGS` = 16777216u;
public const val `SEC_IMAGE_NO_EXECUTE`: `PAGE_PROTECTION_FLAGS` = 285212672u;
public const val `SEC_LARGE_PAGES`: `PAGE_PROTECTION_FLAGS` = 2147483648u;
public const val `SEC_NOCACHE`: `PAGE_PROTECTION_FLAGS` = 268435456u;
public const val `SEC_PARTITION_OWNER_HANDLE`: `PAGE_PROTECTION_FLAGS` = 262144u;
public const val `SEC_PROTECTED_IMAGE`: `PAGE_PROTECTION_FLAGS` = 33554432u;
public const val `SEC_RESERVE`: `PAGE_PROTECTION_FLAGS` = 67108864u;
public const val `SEC_WRITECOMBINE`: `PAGE_PROTECTION_FLAGS` = 1073741824u;
public typealias `SETPROCESSWORKINGSETSIZEEX_FLAGS` = UInt;
public typealias `UNMAP_VIEW_OF_FILE_FLAGS` = UInt;
public typealias `VIRTUAL_ALLOCATION_TYPE` = UInt;
public typealias `VIRTUAL_FREE_TYPE` = UInt;
public const val `VmOfferPriorityBelowNormal`: `OFFER_PRIORITY` = 3;
public const val `VmOfferPriorityLow`: `OFFER_PRIORITY` = 2;
public const val `VmOfferPriorityNormal`: `OFFER_PRIORITY` = 4;
public const val `VmOfferPriorityVeryLow`: `OFFER_PRIORITY` = 1;
public typealias `WIN32_MEMORY_INFORMATION_CLASS` = Int;
// UNSUPPORTED Rust 469:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WIN32_MEMORY_PARTITION_INFORMATION {
//     pub Flags: u32,
//     pub NumaNode: u32,
//     pub Channel: u32,
//     pub NumberOfNumaNodes: u32,
//     pub ResidentAvailablePages: u64,
//     pub CommittedPages: u64,
//     pub CommitLimit: u64,
//     pub PeakCommitment: u64,
//     pub TotalNumberOfPages: u64,
//     pub AvailablePages: u64,
//     pub ZeroPages: u64,
//     pub FreePages: u64,
//     pub StandbyPages: u64,
//     pub Reserved: [u64; 16],
//     pub MaximumCommitLimit: u64,
//     pub Reserved2: u64,
//     pub PartitionId: u32,
// }

// UNSUPPORTED Rust 490:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WIN32_MEMORY_PARTITION_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WIN32_MEMORY_PARTITION_INFORMATION_CLASS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WIN32_MEMORY_RANGE_ENTRY` (
    public var `VirtualAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `NumberOfBytes`: ULong,
)
// UNSUPPORTED Rust 502:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WIN32_MEMORY_RANGE_ENTRY {
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
public class `WIN32_MEMORY_REGION_INFORMATION` (
    public var `AllocationBase`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `AllocationProtect`: UInt,
    public var `Anonymous`: `WIN32_MEMORY_REGION_INFORMATION_0`,
    public var `RegionSize`: ULong,
    public var `CommitSize`: ULong,
)
// UNSUPPORTED Rust 516:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WIN32_MEMORY_REGION_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 521:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WIN32_MEMORY_REGION_INFORMATION_0 {
//     pub Flags: u32,
//     pub Anonymous: WIN32_MEMORY_REGION_INFORMATION_0_0,
// }

// UNSUPPORTED Rust 527:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WIN32_MEMORY_REGION_INFORMATION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WIN32_MEMORY_REGION_INFORMATION_0_0` (
    public var `_bitfield`: UInt,
)
