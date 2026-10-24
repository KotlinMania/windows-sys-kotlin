// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_System_Memory_NonVolatile")]
// pub mod NonVolatile;

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn AddSecureMemoryCacheCallback(pfncallback : PSECURE_MEMORY_CACHE_CALLBACK) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn AllocateUserPhysicalPages(hprocess : super::super::Foundation:: HANDLE, numberofpages : *mut usize, pagearray : *mut usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-core-memory-l1-1-8.dll" "system" fn AllocateUserPhysicalPages2(objecthandle : super::super::Foundation:: HANDLE, numberofpages : *mut usize, pagearray : *mut usize, extendedparameters : *mut MEM_EXTENDED_PARAMETER, extendedparametercount : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn AllocateUserPhysicalPagesNuma(hprocess : super::super::Foundation:: HANDLE, numberofpages : *mut usize, pagearray : *mut usize, nndpreferred : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("api-ms-win-core-memory-l1-1-7.dll" "system" fn CreateFileMapping2(file : super::super::Foundation:: HANDLE, securityattributes : *const super::super::Security:: SECURITY_ATTRIBUTES, desiredaccess : u32, pageprotection : PAGE_PROTECTION_FLAGS, allocationattributes : u32, maximumsize : u64, name : windows_sys::core::PCWSTR, extendedparameters : *mut MEM_EXTENDED_PARAMETER, parametercount : u32) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("kernel32.dll" "system" fn CreateFileMappingA(hfile : super::super::Foundation:: HANDLE, lpfilemappingattributes : *const super::super::Security:: SECURITY_ATTRIBUTES, flprotect : PAGE_PROTECTION_FLAGS, dwmaximumsizehigh : u32, dwmaximumsizelow : u32, lpname : windows_sys::core::PCSTR) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("kernel32.dll" "system" fn CreateFileMappingFromApp(hfile : super::super::Foundation:: HANDLE, securityattributes : *const super::super::Security:: SECURITY_ATTRIBUTES, pageprotection : PAGE_PROTECTION_FLAGS, maximumsize : u64, name : windows_sys::core::PCWSTR) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("kernel32.dll" "system" fn CreateFileMappingNumaA(hfile : super::super::Foundation:: HANDLE, lpfilemappingattributes : *const super::super::Security:: SECURITY_ATTRIBUTES, flprotect : PAGE_PROTECTION_FLAGS, dwmaximumsizehigh : u32, dwmaximumsizelow : u32, lpname : windows_sys::core::PCSTR, nndpreferred : u32) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("kernel32.dll" "system" fn CreateFileMappingNumaW(hfile : super::super::Foundation:: HANDLE, lpfilemappingattributes : *const super::super::Security:: SECURITY_ATTRIBUTES, flprotect : PAGE_PROTECTION_FLAGS, dwmaximumsizehigh : u32, dwmaximumsizelow : u32, lpname : windows_sys::core::PCWSTR, nndpreferred : u32) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("kernel32.dll" "system" fn CreateFileMappingW(hfile : super::super::Foundation:: HANDLE, lpfilemappingattributes : *const super::super::Security:: SECURITY_ATTRIBUTES, flprotect : PAGE_PROTECTION_FLAGS, dwmaximumsizehigh : u32, dwmaximumsizelow : u32, lpname : windows_sys::core::PCWSTR) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn CreateMemoryResourceNotification(notificationtype : MEMORY_RESOURCE_NOTIFICATION_TYPE) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn DiscardVirtualMemory(virtualaddress : *mut core::ffi::c_void, size : usize) -> u32);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn FlushViewOfFile(lpbaseaddress : *const core::ffi::c_void, dwnumberofbytestoflush : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn FreeUserPhysicalPages(hprocess : super::super::Foundation:: HANDLE, numberofpages : *mut usize, pagearray : *const usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetLargePageMinimum() -> usize);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetMemoryErrorHandlingCapabilities(capabilities : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetProcessHeap() -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetProcessHeaps(numberofheaps : u32, processheaps : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetProcessWorkingSetSizeEx(hprocess : super::super::Foundation:: HANDLE, lpminimumworkingsetsize : *mut usize, lpmaximumworkingsetsize : *mut usize, flags : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetSystemFileCacheSize(lpminimumfilecachesize : *mut usize, lpmaximumfilecachesize : *mut usize, lpflags : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetWriteWatch(dwflags : u32, lpbaseaddress : *const core::ffi::c_void, dwregionsize : usize, lpaddresses : *mut *mut core::ffi::c_void, lpdwcount : *mut usize, lpdwgranularity : *mut u32) -> u32);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GlobalAlloc(uflags : GLOBAL_ALLOC_FLAGS, dwbytes : usize) -> super::super::Foundation:: HGLOBAL);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GlobalFlags(hmem : super::super::Foundation:: HGLOBAL) -> u32);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GlobalHandle(pmem : *const core::ffi::c_void) -> super::super::Foundation:: HGLOBAL);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GlobalLock(hmem : super::super::Foundation:: HGLOBAL) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GlobalReAlloc(hmem : super::super::Foundation:: HGLOBAL, dwbytes : usize, uflags : u32) -> super::super::Foundation:: HGLOBAL);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GlobalSize(hmem : super::super::Foundation:: HGLOBAL) -> usize);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GlobalUnlock(hmem : super::super::Foundation:: HGLOBAL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn HeapAlloc(hheap : super::super::Foundation:: HANDLE, dwflags : HEAP_FLAGS, dwbytes : usize) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn HeapCompact(hheap : super::super::Foundation:: HANDLE, dwflags : HEAP_FLAGS) -> usize);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn HeapCreate(floptions : HEAP_FLAGS, dwinitialsize : usize, dwmaximumsize : usize) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn HeapDestroy(hheap : super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn HeapFree(hheap : super::super::Foundation:: HANDLE, dwflags : HEAP_FLAGS, lpmem : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn HeapLock(hheap : super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn HeapQueryInformation(heaphandle : super::super::Foundation:: HANDLE, heapinformationclass : HEAP_INFORMATION_CLASS, heapinformation : *mut core::ffi::c_void, heapinformationlength : usize, returnlength : *mut usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn HeapReAlloc(hheap : super::super::Foundation:: HANDLE, dwflags : HEAP_FLAGS, lpmem : *const core::ffi::c_void, dwbytes : usize) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn HeapSetInformation(heaphandle : super::super::Foundation:: HANDLE, heapinformationclass : HEAP_INFORMATION_CLASS, heapinformation : *const core::ffi::c_void, heapinformationlength : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn HeapSize(hheap : super::super::Foundation:: HANDLE, dwflags : HEAP_FLAGS, lpmem : *const core::ffi::c_void) -> usize);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn HeapSummary(hheap : super::super::Foundation:: HANDLE, dwflags : u32, lpsummary : *mut HEAP_SUMMARY) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn HeapUnlock(hheap : super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn HeapValidate(hheap : super::super::Foundation:: HANDLE, dwflags : HEAP_FLAGS, lpmem : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn HeapWalk(hheap : super::super::Foundation:: HANDLE, lpentry : *mut PROCESS_HEAP_ENTRY) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn IsBadCodePtr(lpfn : super::super::Foundation:: FARPROC) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn IsBadReadPtr(lp : *const core::ffi::c_void, ucb : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn IsBadStringPtrA(lpsz : windows_sys::core::PCSTR, ucchmax : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn IsBadStringPtrW(lpsz : windows_sys::core::PCWSTR, ucchmax : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn IsBadWritePtr(lp : *const core::ffi::c_void, ucb : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn LocalAlloc(uflags : LOCAL_ALLOC_FLAGS, ubytes : usize) -> super::super::Foundation:: HLOCAL);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn LocalFlags(hmem : super::super::Foundation:: HLOCAL) -> u32);

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn LocalHandle(pmem : *const core::ffi::c_void) -> super::super::Foundation:: HLOCAL);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn LocalLock(hmem : super::super::Foundation:: HLOCAL) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn LocalReAlloc(hmem : super::super::Foundation:: HLOCAL, ubytes : usize, uflags : u32) -> super::super::Foundation:: HLOCAL);

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn LocalSize(hmem : super::super::Foundation:: HLOCAL) -> usize);

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn LocalUnlock(hmem : super::super::Foundation:: HLOCAL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn MapUserPhysicalPages(virtualaddress : *const core::ffi::c_void, numberofpages : usize, pagearray : *const usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 64:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn MapUserPhysicalPagesScatter(virtualaddresses : *const *const core::ffi::c_void, numberofpages : usize, pagearray : *const usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 65:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn MapViewOfFile(hfilemappingobject : super::super::Foundation:: HANDLE, dwdesiredaccess : FILE_MAP, dwfileoffsethigh : u32, dwfileoffsetlow : u32, dwnumberofbytestomap : usize) -> MEMORY_MAPPED_VIEW_ADDRESS);

// UNSUPPORTED Rust 66:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-core-memory-l1-1-6.dll" "system" fn MapViewOfFile3(filemapping : super::super::Foundation:: HANDLE, process : super::super::Foundation:: HANDLE, baseaddress : *const core::ffi::c_void, offset : u64, viewsize : usize, allocationtype : VIRTUAL_ALLOCATION_TYPE, pageprotection : u32, extendedparameters : *mut MEM_EXTENDED_PARAMETER, parametercount : u32) -> MEMORY_MAPPED_VIEW_ADDRESS);

// UNSUPPORTED Rust 67:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-core-memory-l1-1-6.dll" "system" fn MapViewOfFile3FromApp(filemapping : super::super::Foundation:: HANDLE, process : super::super::Foundation:: HANDLE, baseaddress : *const core::ffi::c_void, offset : u64, viewsize : usize, allocationtype : VIRTUAL_ALLOCATION_TYPE, pageprotection : u32, extendedparameters : *mut MEM_EXTENDED_PARAMETER, parametercount : u32) -> MEMORY_MAPPED_VIEW_ADDRESS);

// UNSUPPORTED Rust 68:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn MapViewOfFileEx(hfilemappingobject : super::super::Foundation:: HANDLE, dwdesiredaccess : FILE_MAP, dwfileoffsethigh : u32, dwfileoffsetlow : u32, dwnumberofbytestomap : usize, lpbaseaddress : *const core::ffi::c_void) -> MEMORY_MAPPED_VIEW_ADDRESS);

// UNSUPPORTED Rust 69:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn MapViewOfFileExNuma(hfilemappingobject : super::super::Foundation:: HANDLE, dwdesiredaccess : FILE_MAP, dwfileoffsethigh : u32, dwfileoffsetlow : u32, dwnumberofbytestomap : usize, lpbaseaddress : *const core::ffi::c_void, nndpreferred : u32) -> MEMORY_MAPPED_VIEW_ADDRESS);

// UNSUPPORTED Rust 70:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn MapViewOfFileFromApp(hfilemappingobject : super::super::Foundation:: HANDLE, desiredaccess : FILE_MAP, fileoffset : u64, numberofbytestomap : usize) -> MEMORY_MAPPED_VIEW_ADDRESS);

// UNSUPPORTED Rust 71:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-core-memory-l1-1-5.dll" "system" fn MapViewOfFileNuma2(filemappinghandle : super::super::Foundation:: HANDLE, processhandle : super::super::Foundation:: HANDLE, offset : u64, baseaddress : *const core::ffi::c_void, viewsize : usize, allocationtype : u32, pageprotection : u32, preferrednode : u32) -> MEMORY_MAPPED_VIEW_ADDRESS);

// UNSUPPORTED Rust 72:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn OfferVirtualMemory(virtualaddress : *mut core::ffi::c_void, size : usize, priority : OFFER_PRIORITY) -> u32);

// UNSUPPORTED Rust 73:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-core-memory-l1-1-8.dll" "system" fn OpenDedicatedMemoryPartition(partition : super::super::Foundation:: HANDLE, dedicatedmemorytypeid : u64, desiredaccess : u32, inherithandle : windows_sys::core::BOOL) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 74:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn OpenFileMappingA(dwdesiredaccess : u32, binherithandle : windows_sys::core::BOOL, lpname : windows_sys::core::PCSTR) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 75:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-core-memory-l1-1-3.dll" "system" fn OpenFileMappingFromApp(desiredaccess : u32, inherithandle : windows_sys::core::BOOL, name : windows_sys::core::PCWSTR) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 76:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn OpenFileMappingW(dwdesiredaccess : u32, binherithandle : windows_sys::core::BOOL, lpname : windows_sys::core::PCWSTR) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 77:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn PrefetchVirtualMemory(hprocess : super::super::Foundation:: HANDLE, numberofentries : usize, virtualaddresses : *const WIN32_MEMORY_RANGE_ENTRY, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 78:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn QueryMemoryResourceNotification(resourcenotificationhandle : super::super::Foundation:: HANDLE, resourcestate : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 79:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-core-memory-l1-1-8.dll" "system" fn QueryPartitionInformation(partition : super::super::Foundation:: HANDLE, partitioninformationclass : WIN32_MEMORY_PARTITION_INFORMATION_CLASS, partitioninformation : *mut core::ffi::c_void, partitioninformationlength : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 80:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-core-memory-l1-1-4.dll" "system" fn QueryVirtualMemoryInformation(process : super::super::Foundation:: HANDLE, virtualaddress : *const core::ffi::c_void, memoryinformationclass : WIN32_MEMORY_INFORMATION_CLASS, memoryinformation : *mut core::ffi::c_void, memoryinformationsize : usize, returnsize : *mut usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 81:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn ReclaimVirtualMemory(virtualaddress : *const core::ffi::c_void, size : usize) -> u32);

// UNSUPPORTED Rust 82:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn RegisterBadMemoryNotification(callback : PBAD_MEMORY_CALLBACK_ROUTINE) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 83:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn RemoveSecureMemoryCacheCallback(pfncallback : PSECURE_MEMORY_CACHE_CALLBACK) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 84:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn ResetWriteWatch(lpbaseaddress : *const core::ffi::c_void, dwregionsize : usize) -> u32);

// UNSUPPORTED Rust 85:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn RtlCompareMemory(source1 : *const core::ffi::c_void, source2 : *const core::ffi::c_void, length : usize) -> usize);

// UNSUPPORTED Rust 86:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlCrc32(buffer : *const core::ffi::c_void, size : usize, initialcrc : u32) -> u32);

// UNSUPPORTED Rust 87:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlCrc64(buffer : *const core::ffi::c_void, size : usize, initialcrc : u64) -> u64);

// UNSUPPORTED Rust 88:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlIsZeroMemory(buffer : *const core::ffi::c_void, length : usize) -> bool);

// UNSUPPORTED Rust 89:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-core-memory-l1-1-3.dll" "system" fn SetProcessValidCallTargets(hprocess : super::super::Foundation:: HANDLE, virtualaddress : *const core::ffi::c_void, regionsize : usize, numberofoffsets : u32, offsetinformation : *mut CFG_CALL_TARGET_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 90:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-core-memory-l1-1-7.dll" "system" fn SetProcessValidCallTargetsForMappedView(process : super::super::Foundation:: HANDLE, virtualaddress : *const core::ffi::c_void, regionsize : usize, numberofoffsets : u32, offsetinformation : *mut CFG_CALL_TARGET_INFO, section : super::super::Foundation:: HANDLE, expectedfileoffset : u64) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 91:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn SetProcessWorkingSetSizeEx(hprocess : super::super::Foundation:: HANDLE, dwminimumworkingsetsize : usize, dwmaximumworkingsetsize : usize, flags : SETPROCESSWORKINGSETSIZEEX_FLAGS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 92:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn SetSystemFileCacheSize(minimumfilecachesize : usize, maximumfilecachesize : usize, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 93:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn UnmapViewOfFile(lpbaseaddress : MEMORY_MAPPED_VIEW_ADDRESS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 94:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-core-memory-l1-1-5.dll" "system" fn UnmapViewOfFile2(process : super::super::Foundation:: HANDLE, baseaddress : MEMORY_MAPPED_VIEW_ADDRESS, unmapflags : UNMAP_VIEW_OF_FILE_FLAGS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 95:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn UnmapViewOfFileEx(baseaddress : MEMORY_MAPPED_VIEW_ADDRESS, unmapflags : UNMAP_VIEW_OF_FILE_FLAGS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 96:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn UnregisterBadMemoryNotification(registrationhandle : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 97:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn VirtualAlloc(lpaddress : *const core::ffi::c_void, dwsize : usize, flallocationtype : VIRTUAL_ALLOCATION_TYPE, flprotect : PAGE_PROTECTION_FLAGS) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 98:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-core-memory-l1-1-6.dll" "system" fn VirtualAlloc2(process : super::super::Foundation:: HANDLE, baseaddress : *const core::ffi::c_void, size : usize, allocationtype : VIRTUAL_ALLOCATION_TYPE, pageprotection : u32, extendedparameters : *mut MEM_EXTENDED_PARAMETER, parametercount : u32) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 99:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-core-memory-l1-1-6.dll" "system" fn VirtualAlloc2FromApp(process : super::super::Foundation:: HANDLE, baseaddress : *const core::ffi::c_void, size : usize, allocationtype : VIRTUAL_ALLOCATION_TYPE, pageprotection : u32, extendedparameters : *mut MEM_EXTENDED_PARAMETER, parametercount : u32) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 100:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn VirtualAllocEx(hprocess : super::super::Foundation:: HANDLE, lpaddress : *const core::ffi::c_void, dwsize : usize, flallocationtype : VIRTUAL_ALLOCATION_TYPE, flprotect : PAGE_PROTECTION_FLAGS) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 101:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn VirtualAllocExNuma(hprocess : super::super::Foundation:: HANDLE, lpaddress : *const core::ffi::c_void, dwsize : usize, flallocationtype : VIRTUAL_ALLOCATION_TYPE, flprotect : u32, nndpreferred : u32) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 102:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-core-memory-l1-1-3.dll" "system" fn VirtualAllocFromApp(baseaddress : *const core::ffi::c_void, size : usize, allocationtype : VIRTUAL_ALLOCATION_TYPE, protection : u32) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 103:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn VirtualFree(lpaddress : *mut core::ffi::c_void, dwsize : usize, dwfreetype : VIRTUAL_FREE_TYPE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 104:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn VirtualFreeEx(hprocess : super::super::Foundation:: HANDLE, lpaddress : *mut core::ffi::c_void, dwsize : usize, dwfreetype : VIRTUAL_FREE_TYPE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 105:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn VirtualLock(lpaddress : *const core::ffi::c_void, dwsize : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 106:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn VirtualProtect(lpaddress : *const core::ffi::c_void, dwsize : usize, flnewprotect : PAGE_PROTECTION_FLAGS, lpfloldprotect : *mut PAGE_PROTECTION_FLAGS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 107:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn VirtualProtectEx(hprocess : super::super::Foundation:: HANDLE, lpaddress : *const core::ffi::c_void, dwsize : usize, flnewprotect : PAGE_PROTECTION_FLAGS, lpfloldprotect : *mut PAGE_PROTECTION_FLAGS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 108:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-core-memory-l1-1-3.dll" "system" fn VirtualProtectFromApp(address : *const core::ffi::c_void, size : usize, newprotection : u32, oldprotection : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 109:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn VirtualQuery(lpaddress : *const core::ffi::c_void, lpbuffer : *mut MEMORY_BASIC_INFORMATION, dwlength : usize) -> usize);

// UNSUPPORTED Rust 110:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn VirtualQueryEx(hprocess : super::super::Foundation:: HANDLE, lpaddress : *const core::ffi::c_void, lpbuffer : *mut MEMORY_BASIC_INFORMATION, dwlength : usize) -> usize);

// UNSUPPORTED Rust 111:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn VirtualUnlock(lpaddress : *const core::ffi::c_void, dwsize : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 112:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-core-memory-l1-1-5.dll" "system" fn VirtualUnlockEx(process : super::super::Foundation:: HANDLE, address : *const core::ffi::c_void, size : usize) -> windows_sys::core::BOOL);

public typealias `AtlThunkData_t` = Long;
// UNSUPPORTED Rust 114:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CFG_CALL_TARGET_INFO {
//     pub Offset: usize,
//     pub Flags: usize,
// }

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
// UNSUPPORTED Rust 155:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct HEAP_SUMMARY {
//     pub cb: u32,
//     pub cbAllocated: usize,
//     pub cbCommitted: usize,
//     pub cbReserved: usize,
//     pub cbMaxReserve: usize,
// }

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
// UNSUPPORTED Rust 180:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct MEMORY_BASIC_INFORMATION {
//     pub BaseAddress: *mut core::ffi::c_void,
//     pub AllocationBase: *mut core::ffi::c_void,
//     pub AllocationProtect: PAGE_PROTECTION_FLAGS,
//     pub RegionSize: usize,
//     pub State: VIRTUAL_ALLOCATION_TYPE,
//     pub Protect: PAGE_PROTECTION_FLAGS,
//     pub Type: PAGE_TYPE,
// }

// UNSUPPORTED Rust 192:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for MEMORY_BASIC_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 198:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct MEMORY_BASIC_INFORMATION {
//     pub BaseAddress: *mut core::ffi::c_void,
//     pub AllocationBase: *mut core::ffi::c_void,
//     pub AllocationProtect: PAGE_PROTECTION_FLAGS,
//     pub PartitionId: u16,
//     pub RegionSize: usize,
//     pub State: VIRTUAL_ALLOCATION_TYPE,
//     pub Protect: PAGE_PROTECTION_FLAGS,
//     pub Type: PAGE_TYPE,
// }

// UNSUPPORTED Rust 211:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for MEMORY_BASIC_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 217:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MEMORY_BASIC_INFORMATION32 {
//     pub BaseAddress: u32,
//     pub AllocationBase: u32,
//     pub AllocationProtect: PAGE_PROTECTION_FLAGS,
//     pub RegionSize: u32,
//     pub State: VIRTUAL_ALLOCATION_TYPE,
//     pub Protect: PAGE_PROTECTION_FLAGS,
//     pub Type: PAGE_TYPE,
// }

// UNSUPPORTED Rust 228:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MEMORY_BASIC_INFORMATION64 {
//     pub BaseAddress: u64,
//     pub AllocationBase: u64,
//     pub AllocationProtect: PAGE_PROTECTION_FLAGS,
//     pub __alignment1: u32,
//     pub RegionSize: u64,
//     pub State: VIRTUAL_ALLOCATION_TYPE,
//     pub Protect: PAGE_PROTECTION_FLAGS,
//     pub Type: PAGE_TYPE,
//     pub __alignment2: u32,
// }

// UNSUPPORTED Rust 241:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MEMORY_MAPPED_VIEW_ADDRESS {
//     pub Value: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 246:1: declaration Impl has no candidate rule
// impl Default for MEMORY_MAPPED_VIEW_ADDRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 251:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MEMORY_PARTITION_DEDICATED_MEMORY_ATTRIBUTE {
//     pub Type: MEM_DEDICATED_ATTRIBUTE_TYPE,
//     pub Reserved: u32,
//     pub Value: u64,
// }

// UNSUPPORTED Rust 258:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MEMORY_PARTITION_DEDICATED_MEMORY_INFORMATION {
//     pub NextEntryOffset: u32,
//     pub SizeOfInformation: u32,
//     pub Flags: u32,
//     pub AttributesOffset: u32,
//     pub AttributeCount: u32,
//     pub Reserved: u32,
//     pub TypeId: u64,
// }

public typealias `MEMORY_RESOURCE_NOTIFICATION_TYPE` = Int;
// UNSUPPORTED Rust 270:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MEM_ADDRESS_REQUIREMENTS {
//     pub LowestStartingAddress: *mut core::ffi::c_void,
//     pub HighestEndingAddress: *mut core::ffi::c_void,
//     pub Alignment: usize,
// }

// UNSUPPORTED Rust 277:1: declaration Impl has no candidate rule
// impl Default for MEM_ADDRESS_REQUIREMENTS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MEM_COMMIT`: `VIRTUAL_ALLOCATION_TYPE` = 4096u;
public const val `MEM_DECOMMIT`: `VIRTUAL_FREE_TYPE` = 16384u;
public typealias `MEM_DEDICATED_ATTRIBUTE_TYPE` = Int;
// UNSUPPORTED Rust 285:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MEM_EXTENDED_PARAMETER {
//     pub Anonymous1: MEM_EXTENDED_PARAMETER_0,
//     pub Anonymous2: MEM_EXTENDED_PARAMETER_1,
// }

// UNSUPPORTED Rust 291:1: declaration Impl has no candidate rule
// impl Default for MEM_EXTENDED_PARAMETER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 296:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MEM_EXTENDED_PARAMETER_0 {
//     pub _bitfield: u64,
// }

// UNSUPPORTED Rust 301:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MEM_EXTENDED_PARAMETER_1 {
//     pub ULong64: u64,
//     pub Pointer: *mut core::ffi::c_void,
//     pub Size: usize,
//     pub Handle: super::super::Foundation::HANDLE,
//     pub ULong: u32,
// }

// UNSUPPORTED Rust 310:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 385:1: generic scalar type unsupported
// pub type PBAD_MEMORY_CALLBACK_ROUTINE = Option<unsafe extern "system" fn()>;

// UNSUPPORTED Rust 386:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PROCESS_HEAP_ENTRY {
//     pub lpData: *mut core::ffi::c_void,
//     pub cbData: u32,
//     pub cbOverhead: u8,
//     pub iRegionIndex: u8,
//     pub wFlags: u16,
//     pub Anonymous: PROCESS_HEAP_ENTRY_0,
// }

// UNSUPPORTED Rust 396:1: declaration Impl has no candidate rule
// impl Default for PROCESS_HEAP_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 401:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PROCESS_HEAP_ENTRY_0 {
//     pub Block: PROCESS_HEAP_ENTRY_0_0,
//     pub Region: PROCESS_HEAP_ENTRY_0_1,
// }

// UNSUPPORTED Rust 407:1: declaration Impl has no candidate rule
// impl Default for PROCESS_HEAP_ENTRY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 412:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PROCESS_HEAP_ENTRY_0_0 {
//     pub hMem: super::super::Foundation::HANDLE,
//     pub dwReserved: [u32; 3],
// }

// UNSUPPORTED Rust 418:1: declaration Impl has no candidate rule
// impl Default for PROCESS_HEAP_ENTRY_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 423:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PROCESS_HEAP_ENTRY_0_1 {
//     pub dwCommittedSize: u32,
//     pub dwUnCommittedSize: u32,
//     pub lpFirstBlock: *mut core::ffi::c_void,
//     pub lpLastBlock: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 431:1: declaration Impl has no candidate rule
// impl Default for PROCESS_HEAP_ENTRY_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 436:1: generic scalar type unsupported
// pub type PSECURE_MEMORY_CACHE_CALLBACK = Option<unsafe extern "system" fn(addr: *const core::ffi::c_void, range: usize) -> bool>;

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
// UNSUPPORTED Rust 469:1: declaration Struct has no candidate rule
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

// UNSUPPORTED Rust 490:1: declaration Impl has no candidate rule
// impl Default for WIN32_MEMORY_PARTITION_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WIN32_MEMORY_PARTITION_INFORMATION_CLASS` = Int;
// UNSUPPORTED Rust 496:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WIN32_MEMORY_RANGE_ENTRY {
//     pub VirtualAddress: *mut core::ffi::c_void,
//     pub NumberOfBytes: usize,
// }

// UNSUPPORTED Rust 502:1: declaration Impl has no candidate rule
// impl Default for WIN32_MEMORY_RANGE_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 507:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WIN32_MEMORY_REGION_INFORMATION {
//     pub AllocationBase: *mut core::ffi::c_void,
//     pub AllocationProtect: u32,
//     pub Anonymous: WIN32_MEMORY_REGION_INFORMATION_0,
//     pub RegionSize: usize,
//     pub CommitSize: usize,
// }

// UNSUPPORTED Rust 516:1: declaration Impl has no candidate rule
// impl Default for WIN32_MEMORY_REGION_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 521:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WIN32_MEMORY_REGION_INFORMATION_0 {
//     pub Flags: u32,
//     pub Anonymous: WIN32_MEMORY_REGION_INFORMATION_0_0,
// }

// UNSUPPORTED Rust 527:1: declaration Impl has no candidate rule
// impl Default for WIN32_MEMORY_REGION_INFORMATION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 532:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WIN32_MEMORY_REGION_INFORMATION_0_0 {
//     pub _bitfield: u32,
// }

