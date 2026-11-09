package io.github.kotlinmania.windowssys.windows.win32.system.memory

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FARPROC
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HGLOBAL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HLOCAL

public expect fun AddSecureMemoryCacheCallback(pfncallback: PSECURE_MEMORY_CACHE_CALLBACK): BOOL

public expect fun AllocateUserPhysicalPages(hprocess: HANDLE, numberofpages: Long, pagearray: Long): BOOL

public expect fun AllocateUserPhysicalPages2(objecthandle: HANDLE, numberofpages: Long, pagearray: Long, extendedparameters: Long, extendedparametercount: UInt): BOOL

public expect fun AllocateUserPhysicalPagesNuma(hprocess: HANDLE, numberofpages: Long, pagearray: Long, nndpreferred: UInt): BOOL

public expect fun CreateFileMapping2(file: HANDLE, securityattributes: Long, desiredaccess: UInt, pageprotection: PAGE_PROTECTION_FLAGS, allocationattributes: UInt, maximumsize: ULong, name: PCWSTR, extendedparameters: Long, parametercount: UInt): HANDLE

public expect fun CreateFileMappingA(hfile: HANDLE, lpfilemappingattributes: Long, flprotect: PAGE_PROTECTION_FLAGS, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: PCSTR): HANDLE

public expect fun CreateFileMappingFromApp(hfile: HANDLE, securityattributes: Long, pageprotection: PAGE_PROTECTION_FLAGS, maximumsize: ULong, name: PCWSTR): HANDLE

public expect fun CreateFileMappingNumaA(hfile: HANDLE, lpfilemappingattributes: Long, flprotect: PAGE_PROTECTION_FLAGS, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: PCSTR, nndpreferred: UInt): HANDLE

public expect fun CreateFileMappingNumaW(hfile: HANDLE, lpfilemappingattributes: Long, flprotect: PAGE_PROTECTION_FLAGS, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: PCWSTR, nndpreferred: UInt): HANDLE

public expect fun CreateFileMappingW(hfile: HANDLE, lpfilemappingattributes: Long, flprotect: PAGE_PROTECTION_FLAGS, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: PCWSTR): HANDLE

public expect fun CreateMemoryResourceNotification(notificationtype: MEMORY_RESOURCE_NOTIFICATION_TYPE): HANDLE

public expect fun DiscardVirtualMemory(virtualaddress: Long, size: ULong): UInt

public expect fun FlushViewOfFile(lpbaseaddress: Long, dwnumberofbytestoflush: ULong): BOOL

public expect fun FreeUserPhysicalPages(hprocess: HANDLE, numberofpages: Long, pagearray: Long): BOOL

public expect fun GetLargePageMinimum(): ULong

public expect fun GetMemoryErrorHandlingCapabilities(capabilities: Long): BOOL

public expect fun GetProcessHeap(): HANDLE

public expect fun GetProcessHeaps(numberofheaps: UInt, processheaps: Long): UInt

public expect fun GetProcessWorkingSetSizeEx(hprocess: HANDLE, lpminimumworkingsetsize: Long, lpmaximumworkingsetsize: Long, flags: Long): BOOL

public expect fun GetSystemFileCacheSize(lpminimumfilecachesize: Long, lpmaximumfilecachesize: Long, lpflags: Long): BOOL

public expect fun GetWriteWatch(dwflags: UInt, lpbaseaddress: Long, dwregionsize: ULong, lpaddresses: Long, lpdwcount: Long, lpdwgranularity: Long): UInt

public expect fun GlobalAlloc(uflags: GLOBAL_ALLOC_FLAGS, dwbytes: ULong): HGLOBAL

public expect fun GlobalFlags(hmem: HGLOBAL): UInt

public expect fun GlobalHandle(pmem: Long): HGLOBAL

public expect fun GlobalLock(hmem: HGLOBAL): Long

public expect fun GlobalReAlloc(hmem: HGLOBAL, dwbytes: ULong, uflags: UInt): HGLOBAL

public expect fun GlobalSize(hmem: HGLOBAL): ULong

public expect fun GlobalUnlock(hmem: HGLOBAL): BOOL

public expect fun HeapAlloc(hheap: HANDLE, dwflags: HEAP_FLAGS, dwbytes: ULong): Long

public expect fun HeapCompact(hheap: HANDLE, dwflags: HEAP_FLAGS): ULong

public expect fun HeapCreate(floptions: HEAP_FLAGS, dwinitialsize: ULong, dwmaximumsize: ULong): HANDLE

public expect fun HeapDestroy(hheap: HANDLE): BOOL

public expect fun HeapFree(hheap: HANDLE, dwflags: HEAP_FLAGS, lpmem: Long): BOOL

public expect fun HeapLock(hheap: HANDLE): BOOL

public expect fun HeapQueryInformation(heaphandle: HANDLE, heapinformationclass: HEAP_INFORMATION_CLASS, heapinformation: Long, heapinformationlength: ULong, returnlength: Long): BOOL

public expect fun HeapReAlloc(hheap: HANDLE, dwflags: HEAP_FLAGS, lpmem: Long, dwbytes: ULong): Long

public expect fun HeapSetInformation(heaphandle: HANDLE, heapinformationclass: HEAP_INFORMATION_CLASS, heapinformation: Long, heapinformationlength: ULong): BOOL

public expect fun HeapSize(hheap: HANDLE, dwflags: HEAP_FLAGS, lpmem: Long): ULong

public expect fun HeapSummary(hheap: HANDLE, dwflags: UInt, lpsummary: Long): BOOL

public expect fun HeapUnlock(hheap: HANDLE): BOOL

public expect fun HeapValidate(hheap: HANDLE, dwflags: HEAP_FLAGS, lpmem: Long): BOOL

public expect fun HeapWalk(hheap: HANDLE, lpentry: Long): BOOL

public expect fun IsBadCodePtr(lpfn: FARPROC): BOOL

public expect fun IsBadReadPtr(lp: Long, ucb: ULong): BOOL

public expect fun IsBadStringPtrA(lpsz: PCSTR, ucchmax: ULong): BOOL

public expect fun IsBadStringPtrW(lpsz: PCWSTR, ucchmax: ULong): BOOL

public expect fun IsBadWritePtr(lp: Long, ucb: ULong): BOOL

public expect fun LocalAlloc(uflags: LOCAL_ALLOC_FLAGS, ubytes: ULong): HLOCAL

public expect fun LocalFlags(hmem: HLOCAL): UInt

public expect fun LocalHandle(pmem: Long): HLOCAL

public expect fun LocalLock(hmem: HLOCAL): Long

public expect fun LocalReAlloc(hmem: HLOCAL, ubytes: ULong, uflags: UInt): HLOCAL

public expect fun LocalSize(hmem: HLOCAL): ULong

public expect fun LocalUnlock(hmem: HLOCAL): BOOL

public expect fun MapUserPhysicalPages(virtualaddress: Long, numberofpages: ULong, pagearray: Long): BOOL

public expect fun MapUserPhysicalPagesScatter(virtualaddresses: Long, numberofpages: ULong, pagearray: Long): BOOL

public expect fun MapViewOfFile(hfilemappingobject: HANDLE, dwdesiredaccess: FILE_MAP, dwfileoffsethigh: UInt, dwfileoffsetlow: UInt, dwnumberofbytestomap: ULong): MEMORY_MAPPED_VIEW_ADDRESS

public expect fun MapViewOfFile3(filemapping: HANDLE, process: HANDLE, baseaddress: Long, offset: ULong, viewsize: ULong, allocationtype: VIRTUAL_ALLOCATION_TYPE, pageprotection: UInt, extendedparameters: Long, parametercount: UInt): MEMORY_MAPPED_VIEW_ADDRESS

public expect fun MapViewOfFile3FromApp(filemapping: HANDLE, process: HANDLE, baseaddress: Long, offset: ULong, viewsize: ULong, allocationtype: VIRTUAL_ALLOCATION_TYPE, pageprotection: UInt, extendedparameters: Long, parametercount: UInt): MEMORY_MAPPED_VIEW_ADDRESS

public expect fun MapViewOfFileEx(hfilemappingobject: HANDLE, dwdesiredaccess: FILE_MAP, dwfileoffsethigh: UInt, dwfileoffsetlow: UInt, dwnumberofbytestomap: ULong, lpbaseaddress: Long): MEMORY_MAPPED_VIEW_ADDRESS

public expect fun MapViewOfFileExNuma(hfilemappingobject: HANDLE, dwdesiredaccess: FILE_MAP, dwfileoffsethigh: UInt, dwfileoffsetlow: UInt, dwnumberofbytestomap: ULong, lpbaseaddress: Long, nndpreferred: UInt): MEMORY_MAPPED_VIEW_ADDRESS

public expect fun MapViewOfFileFromApp(hfilemappingobject: HANDLE, desiredaccess: FILE_MAP, fileoffset: ULong, numberofbytestomap: ULong): MEMORY_MAPPED_VIEW_ADDRESS

public expect fun MapViewOfFileNuma2(filemappinghandle: HANDLE, processhandle: HANDLE, offset: ULong, baseaddress: Long, viewsize: ULong, allocationtype: UInt, pageprotection: UInt, preferrednode: UInt): MEMORY_MAPPED_VIEW_ADDRESS

public expect fun OfferVirtualMemory(virtualaddress: Long, size: ULong, priority: OFFER_PRIORITY): UInt

public expect fun OpenDedicatedMemoryPartition(partition: HANDLE, dedicatedmemorytypeid: ULong, desiredaccess: UInt, inherithandle: BOOL): HANDLE

public expect fun OpenFileMappingA(dwdesiredaccess: UInt, binherithandle: BOOL, lpname: PCSTR): HANDLE

public expect fun OpenFileMappingFromApp(desiredaccess: UInt, inherithandle: BOOL, name: PCWSTR): HANDLE

public expect fun OpenFileMappingW(dwdesiredaccess: UInt, binherithandle: BOOL, lpname: PCWSTR): HANDLE

public expect fun PrefetchVirtualMemory(hprocess: HANDLE, numberofentries: ULong, virtualaddresses: Long, flags: UInt): BOOL

public expect fun QueryMemoryResourceNotification(resourcenotificationhandle: HANDLE, resourcestate: Long): BOOL

public expect fun QueryPartitionInformation(partition: HANDLE, partitioninformationclass: WIN32_MEMORY_PARTITION_INFORMATION_CLASS, partitioninformation: Long, partitioninformationlength: UInt): BOOL

public expect fun QueryVirtualMemoryInformation(process: HANDLE, virtualaddress: Long, memoryinformationclass: WIN32_MEMORY_INFORMATION_CLASS, memoryinformation: Long, memoryinformationsize: ULong, returnsize: Long): BOOL

public expect fun ReclaimVirtualMemory(virtualaddress: Long, size: ULong): UInt

public expect fun RegisterBadMemoryNotification(callback: PBAD_MEMORY_CALLBACK_ROUTINE): Long

public expect fun RemoveSecureMemoryCacheCallback(pfncallback: PSECURE_MEMORY_CACHE_CALLBACK): BOOL

public expect fun ResetWriteWatch(lpbaseaddress: Long, dwregionsize: ULong): UInt

public expect fun RtlCompareMemory(source1: Long, source2: Long, length: ULong): ULong

public expect fun RtlCrc32(buffer: Long, size: ULong, initialcrc: UInt): UInt

public expect fun RtlCrc64(buffer: Long, size: ULong, initialcrc: ULong): ULong

public expect fun RtlIsZeroMemory(buffer: Long, length: ULong): Boolean

public expect fun SetProcessValidCallTargets(hprocess: HANDLE, virtualaddress: Long, regionsize: ULong, numberofoffsets: UInt, offsetinformation: Long): BOOL

public expect fun SetProcessValidCallTargetsForMappedView(process: HANDLE, virtualaddress: Long, regionsize: ULong, numberofoffsets: UInt, offsetinformation: Long, section: HANDLE, expectedfileoffset: ULong): BOOL

public expect fun SetProcessWorkingSetSizeEx(hprocess: HANDLE, dwminimumworkingsetsize: ULong, dwmaximumworkingsetsize: ULong, flags: SETPROCESSWORKINGSETSIZEEX_FLAGS): BOOL

public expect fun SetSystemFileCacheSize(minimumfilecachesize: ULong, maximumfilecachesize: ULong, flags: UInt): BOOL

public expect fun UnmapViewOfFile(lpbaseaddress: MEMORY_MAPPED_VIEW_ADDRESS): BOOL

public expect fun UnmapViewOfFile2(process: HANDLE, baseaddress: MEMORY_MAPPED_VIEW_ADDRESS, unmapflags: UNMAP_VIEW_OF_FILE_FLAGS): BOOL

public expect fun UnmapViewOfFileEx(baseaddress: MEMORY_MAPPED_VIEW_ADDRESS, unmapflags: UNMAP_VIEW_OF_FILE_FLAGS): BOOL

public expect fun UnregisterBadMemoryNotification(registrationhandle: Long): BOOL

public expect fun VirtualAlloc(lpaddress: Long, dwsize: ULong, flallocationtype: VIRTUAL_ALLOCATION_TYPE, flprotect: PAGE_PROTECTION_FLAGS): Long

public expect fun VirtualAlloc2(process: HANDLE, baseaddress: Long, size: ULong, allocationtype: VIRTUAL_ALLOCATION_TYPE, pageprotection: UInt, extendedparameters: Long, parametercount: UInt): Long

public expect fun VirtualAlloc2FromApp(process: HANDLE, baseaddress: Long, size: ULong, allocationtype: VIRTUAL_ALLOCATION_TYPE, pageprotection: UInt, extendedparameters: Long, parametercount: UInt): Long

public expect fun VirtualAllocEx(hprocess: HANDLE, lpaddress: Long, dwsize: ULong, flallocationtype: VIRTUAL_ALLOCATION_TYPE, flprotect: PAGE_PROTECTION_FLAGS): Long

public expect fun VirtualAllocExNuma(hprocess: HANDLE, lpaddress: Long, dwsize: ULong, flallocationtype: VIRTUAL_ALLOCATION_TYPE, flprotect: UInt, nndpreferred: UInt): Long

public expect fun VirtualAllocFromApp(baseaddress: Long, size: ULong, allocationtype: VIRTUAL_ALLOCATION_TYPE, protection: UInt): Long

public expect fun VirtualFree(lpaddress: Long, dwsize: ULong, dwfreetype: VIRTUAL_FREE_TYPE): BOOL

public expect fun VirtualFreeEx(hprocess: HANDLE, lpaddress: Long, dwsize: ULong, dwfreetype: VIRTUAL_FREE_TYPE): BOOL

public expect fun VirtualLock(lpaddress: Long, dwsize: ULong): BOOL

public expect fun VirtualProtect(lpaddress: Long, dwsize: ULong, flnewprotect: PAGE_PROTECTION_FLAGS, lpfloldprotect: Long): BOOL

public expect fun VirtualProtectEx(hprocess: HANDLE, lpaddress: Long, dwsize: ULong, flnewprotect: PAGE_PROTECTION_FLAGS, lpfloldprotect: Long): BOOL

public expect fun VirtualProtectFromApp(address: Long, size: ULong, newprotection: UInt, oldprotection: Long): BOOL

public expect fun VirtualQuery(lpaddress: Long, lpbuffer: Long, dwlength: ULong): ULong

public expect fun VirtualQueryEx(hprocess: HANDLE, lpaddress: Long, lpbuffer: Long, dwlength: ULong): ULong

public expect fun VirtualUnlock(lpaddress: Long, dwsize: ULong): BOOL

public expect fun VirtualUnlockEx(process: HANDLE, address: Long, size: ULong): BOOL
