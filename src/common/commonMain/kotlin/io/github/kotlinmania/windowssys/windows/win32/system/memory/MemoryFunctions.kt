package io.github.kotlinmania.windowssys.windows.win32.system.memory

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FARPROC
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HGLOBAL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HLOCAL

public fun interface FnCallback {
    public operator fun invoke(addr: Long, range: ULong): Boolean
}

public fun interface FnCallback1 {
    public operator fun invoke()
}

public fun AddSecureMemoryCacheCallback(pfncallback: PSECURE_MEMORY_CACHE_CALLBACK): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "AddSecureMemoryCacheCallback", longArrayOf(Win32DynamicFfi.objectSlot(pfncallback))).toInt()
}

public fun AllocateUserPhysicalPages(hprocess: HANDLE, numberofpages: Long, pagearray: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "AllocateUserPhysicalPages", longArrayOf(hprocess, numberofpages, pagearray)).toInt()
}

public fun AllocateUserPhysicalPages2(objecthandle: HANDLE, numberofpages: Long, pagearray: Long, extendedparameters: Long, extendedparametercount: UInt): BOOL {
    return Win32DynamicFfi.invoke("api-ms-win-core-memory-l1-1-8.dll", "AllocateUserPhysicalPages2", longArrayOf(objecthandle, numberofpages, pagearray, extendedparameters, extendedparametercount.toLong())).toInt()
}

public fun AllocateUserPhysicalPagesNuma(hprocess: HANDLE, numberofpages: Long, pagearray: Long, nndpreferred: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "AllocateUserPhysicalPagesNuma", longArrayOf(hprocess, numberofpages, pagearray, nndpreferred.toLong())).toInt()
}

public fun CreateFileMapping2(file: HANDLE, securityattributes: Long, desiredaccess: UInt, pageprotection: PAGE_PROTECTION_FLAGS, allocationattributes: UInt, maximumsize: ULong, name: PCWSTR, extendedparameters: Long, parametercount: UInt): HANDLE {
    return Win32DynamicFfi.invoke("api-ms-win-core-memory-l1-1-7.dll", "CreateFileMapping2", longArrayOf(file, securityattributes, desiredaccess.toLong(), pageprotection.toLong(), allocationattributes.toLong(), maximumsize.toLong(), name, extendedparameters, parametercount.toLong()))
}

public fun CreateFileMappingA(hfile: HANDLE, lpfilemappingattributes: Long, flprotect: PAGE_PROTECTION_FLAGS, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: PCSTR): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateFileMappingA", longArrayOf(hfile, lpfilemappingattributes, flprotect.toLong(), dwmaximumsizehigh.toLong(), dwmaximumsizelow.toLong(), lpname))
}

public fun CreateFileMappingFromApp(hfile: HANDLE, securityattributes: Long, pageprotection: PAGE_PROTECTION_FLAGS, maximumsize: ULong, name: PCWSTR): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateFileMappingFromApp", longArrayOf(hfile, securityattributes, pageprotection.toLong(), maximumsize.toLong(), name))
}

public fun CreateFileMappingNumaA(hfile: HANDLE, lpfilemappingattributes: Long, flprotect: PAGE_PROTECTION_FLAGS, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: PCSTR, nndpreferred: UInt): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateFileMappingNumaA", longArrayOf(hfile, lpfilemappingattributes, flprotect.toLong(), dwmaximumsizehigh.toLong(), dwmaximumsizelow.toLong(), lpname, nndpreferred.toLong()))
}

public fun CreateFileMappingNumaW(hfile: HANDLE, lpfilemappingattributes: Long, flprotect: PAGE_PROTECTION_FLAGS, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: PCWSTR, nndpreferred: UInt): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateFileMappingNumaW", longArrayOf(hfile, lpfilemappingattributes, flprotect.toLong(), dwmaximumsizehigh.toLong(), dwmaximumsizelow.toLong(), lpname, nndpreferred.toLong()))
}

public fun CreateFileMappingW(hfile: HANDLE, lpfilemappingattributes: Long, flprotect: PAGE_PROTECTION_FLAGS, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: PCWSTR): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateFileMappingW", longArrayOf(hfile, lpfilemappingattributes, flprotect.toLong(), dwmaximumsizehigh.toLong(), dwmaximumsizelow.toLong(), lpname))
}

public fun CreateMemoryResourceNotification(notificationtype: MEMORY_RESOURCE_NOTIFICATION_TYPE): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateMemoryResourceNotification", longArrayOf(notificationtype.toLong()))
}

public fun DiscardVirtualMemory(virtualaddress: Long, size: ULong): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "DiscardVirtualMemory", longArrayOf(virtualaddress, size.toLong())).toUInt()
}

public fun FlushViewOfFile(lpbaseaddress: Long, dwnumberofbytestoflush: ULong): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "FlushViewOfFile", longArrayOf(lpbaseaddress, dwnumberofbytestoflush.toLong())).toInt()
}

public fun FreeUserPhysicalPages(hprocess: HANDLE, numberofpages: Long, pagearray: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "FreeUserPhysicalPages", longArrayOf(hprocess, numberofpages, pagearray)).toInt()
}

public fun GetLargePageMinimum(): ULong {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetLargePageMinimum", longArrayOf()).toULong()
}

public fun GetMemoryErrorHandlingCapabilities(capabilities: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetMemoryErrorHandlingCapabilities", longArrayOf(capabilities)).toInt()
}

public fun GetProcessHeap(): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetProcessHeap", longArrayOf())
}

public fun GetProcessHeaps(numberofheaps: UInt, processheaps: Long): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetProcessHeaps", longArrayOf(numberofheaps.toLong(), processheaps)).toUInt()
}

public fun GetProcessWorkingSetSizeEx(hprocess: HANDLE, lpminimumworkingsetsize: Long, lpmaximumworkingsetsize: Long, flags: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetProcessWorkingSetSizeEx", longArrayOf(hprocess, lpminimumworkingsetsize, lpmaximumworkingsetsize, flags)).toInt()
}

public fun GetSystemFileCacheSize(lpminimumfilecachesize: Long, lpmaximumfilecachesize: Long, lpflags: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetSystemFileCacheSize", longArrayOf(lpminimumfilecachesize, lpmaximumfilecachesize, lpflags)).toInt()
}

public fun GetWriteWatch(dwflags: UInt, lpbaseaddress: Long, dwregionsize: ULong, lpaddresses: Long, lpdwcount: Long, lpdwgranularity: Long): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetWriteWatch", longArrayOf(dwflags.toLong(), lpbaseaddress, dwregionsize.toLong(), lpaddresses, lpdwcount, lpdwgranularity)).toUInt()
}

public fun GlobalAlloc(uflags: GLOBAL_ALLOC_FLAGS, dwbytes: ULong): HGLOBAL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GlobalAlloc", longArrayOf(uflags.toLong(), dwbytes.toLong()))
}

public fun GlobalFlags(hmem: HGLOBAL): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GlobalFlags", longArrayOf(hmem)).toUInt()
}

public fun GlobalHandle(pmem: Long): HGLOBAL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GlobalHandle", longArrayOf(pmem))
}

public fun GlobalLock(hmem: HGLOBAL): Long {
    return Win32DynamicFfi.invoke("kernel32.dll", "GlobalLock", longArrayOf(hmem))
}

public fun GlobalReAlloc(hmem: HGLOBAL, dwbytes: ULong, uflags: UInt): HGLOBAL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GlobalReAlloc", longArrayOf(hmem, dwbytes.toLong(), uflags.toLong()))
}

public fun GlobalSize(hmem: HGLOBAL): ULong {
    return Win32DynamicFfi.invoke("kernel32.dll", "GlobalSize", longArrayOf(hmem)).toULong()
}

public fun GlobalUnlock(hmem: HGLOBAL): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GlobalUnlock", longArrayOf(hmem)).toInt()
}

public fun HeapAlloc(hheap: HANDLE, dwflags: HEAP_FLAGS, dwbytes: ULong): Long {
    return Win32DynamicFfi.invoke("kernel32.dll", "HeapAlloc", longArrayOf(hheap, dwflags.toLong(), dwbytes.toLong()))
}

public fun HeapCompact(hheap: HANDLE, dwflags: HEAP_FLAGS): ULong {
    return Win32DynamicFfi.invoke("kernel32.dll", "HeapCompact", longArrayOf(hheap, dwflags.toLong())).toULong()
}

public fun HeapCreate(floptions: HEAP_FLAGS, dwinitialsize: ULong, dwmaximumsize: ULong): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "HeapCreate", longArrayOf(floptions.toLong(), dwinitialsize.toLong(), dwmaximumsize.toLong()))
}

public fun HeapDestroy(hheap: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "HeapDestroy", longArrayOf(hheap)).toInt()
}

public fun HeapFree(hheap: HANDLE, dwflags: HEAP_FLAGS, lpmem: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "HeapFree", longArrayOf(hheap, dwflags.toLong(), lpmem)).toInt()
}

public fun HeapLock(hheap: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "HeapLock", longArrayOf(hheap)).toInt()
}

public fun HeapQueryInformation(heaphandle: HANDLE, heapinformationclass: HEAP_INFORMATION_CLASS, heapinformation: Long, heapinformationlength: ULong, returnlength: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "HeapQueryInformation", longArrayOf(heaphandle, heapinformationclass.toLong(), heapinformation, heapinformationlength.toLong(), returnlength)).toInt()
}

public fun HeapReAlloc(hheap: HANDLE, dwflags: HEAP_FLAGS, lpmem: Long, dwbytes: ULong): Long {
    return Win32DynamicFfi.invoke("kernel32.dll", "HeapReAlloc", longArrayOf(hheap, dwflags.toLong(), lpmem, dwbytes.toLong()))
}

public fun HeapSetInformation(heaphandle: HANDLE, heapinformationclass: HEAP_INFORMATION_CLASS, heapinformation: Long, heapinformationlength: ULong): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "HeapSetInformation", longArrayOf(heaphandle, heapinformationclass.toLong(), heapinformation, heapinformationlength.toLong())).toInt()
}

public fun HeapSize(hheap: HANDLE, dwflags: HEAP_FLAGS, lpmem: Long): ULong {
    return Win32DynamicFfi.invoke("kernel32.dll", "HeapSize", longArrayOf(hheap, dwflags.toLong(), lpmem)).toULong()
}

public fun HeapSummary(hheap: HANDLE, dwflags: UInt, lpsummary: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "HeapSummary", longArrayOf(hheap, dwflags.toLong(), lpsummary)).toInt()
}

public fun HeapUnlock(hheap: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "HeapUnlock", longArrayOf(hheap)).toInt()
}

public fun HeapValidate(hheap: HANDLE, dwflags: HEAP_FLAGS, lpmem: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "HeapValidate", longArrayOf(hheap, dwflags.toLong(), lpmem)).toInt()
}

public fun HeapWalk(hheap: HANDLE, lpentry: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "HeapWalk", longArrayOf(hheap, lpentry)).toInt()
}

public fun IsBadCodePtr(lpfn: FARPROC): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "IsBadCodePtr", longArrayOf(Win32DynamicFfi.objectSlot(lpfn))).toInt()
}

public fun IsBadReadPtr(lp: Long, ucb: ULong): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "IsBadReadPtr", longArrayOf(lp, ucb.toLong())).toInt()
}

public fun IsBadStringPtrA(lpsz: PCSTR, ucchmax: ULong): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "IsBadStringPtrA", longArrayOf(lpsz, ucchmax.toLong())).toInt()
}

public fun IsBadStringPtrW(lpsz: PCWSTR, ucchmax: ULong): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "IsBadStringPtrW", longArrayOf(lpsz, ucchmax.toLong())).toInt()
}

public fun IsBadWritePtr(lp: Long, ucb: ULong): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "IsBadWritePtr", longArrayOf(lp, ucb.toLong())).toInt()
}

public fun LocalAlloc(uflags: LOCAL_ALLOC_FLAGS, ubytes: ULong): HLOCAL {
    return Win32DynamicFfi.invoke("kernel32.dll", "LocalAlloc", longArrayOf(uflags.toLong(), ubytes.toLong()))
}

public fun LocalFlags(hmem: HLOCAL): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "LocalFlags", longArrayOf(hmem)).toUInt()
}

public fun LocalHandle(pmem: Long): HLOCAL {
    return Win32DynamicFfi.invoke("kernel32.dll", "LocalHandle", longArrayOf(pmem))
}

public fun LocalLock(hmem: HLOCAL): Long {
    return Win32DynamicFfi.invoke("kernel32.dll", "LocalLock", longArrayOf(hmem))
}

public fun LocalReAlloc(hmem: HLOCAL, ubytes: ULong, uflags: UInt): HLOCAL {
    return Win32DynamicFfi.invoke("kernel32.dll", "LocalReAlloc", longArrayOf(hmem, ubytes.toLong(), uflags.toLong()))
}

public fun LocalSize(hmem: HLOCAL): ULong {
    return Win32DynamicFfi.invoke("kernel32.dll", "LocalSize", longArrayOf(hmem)).toULong()
}

public fun LocalUnlock(hmem: HLOCAL): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "LocalUnlock", longArrayOf(hmem)).toInt()
}

public fun MapUserPhysicalPages(virtualaddress: Long, numberofpages: ULong, pagearray: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "MapUserPhysicalPages", longArrayOf(virtualaddress, numberofpages.toLong(), pagearray)).toInt()
}

public fun MapUserPhysicalPagesScatter(virtualaddresses: Long, numberofpages: ULong, pagearray: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "MapUserPhysicalPagesScatter", longArrayOf(virtualaddresses, numberofpages.toLong(), pagearray)).toInt()
}

public fun MapViewOfFile(hfilemappingobject: HANDLE, dwdesiredaccess: FILE_MAP, dwfileoffsethigh: UInt, dwfileoffsetlow: UInt, dwnumberofbytestomap: ULong): MEMORY_MAPPED_VIEW_ADDRESS {
    val rawRet = Win32DynamicFfi.invoke("kernel32.dll", "MapViewOfFile", longArrayOf(hfilemappingobject, dwdesiredaccess.toLong(), dwfileoffsethigh.toLong(), dwfileoffsetlow.toLong(), dwnumberofbytestomap.toLong()))
    return MEMORY_MAPPED_VIEW_ADDRESS(Value = rawRet)
}

public fun MapViewOfFile3(filemapping: HANDLE, process: HANDLE, baseaddress: Long, offset: ULong, viewsize: ULong, allocationtype: VIRTUAL_ALLOCATION_TYPE, pageprotection: UInt, extendedparameters: Long, parametercount: UInt): MEMORY_MAPPED_VIEW_ADDRESS {
    val rawRet = Win32DynamicFfi.invoke("api-ms-win-core-memory-l1-1-6.dll", "MapViewOfFile3", longArrayOf(filemapping, process, baseaddress, offset.toLong(), viewsize.toLong(), allocationtype.toLong(), pageprotection.toLong(), extendedparameters, parametercount.toLong()))
    return MEMORY_MAPPED_VIEW_ADDRESS(Value = rawRet)
}

public fun MapViewOfFile3FromApp(filemapping: HANDLE, process: HANDLE, baseaddress: Long, offset: ULong, viewsize: ULong, allocationtype: VIRTUAL_ALLOCATION_TYPE, pageprotection: UInt, extendedparameters: Long, parametercount: UInt): MEMORY_MAPPED_VIEW_ADDRESS {
    val rawRet = Win32DynamicFfi.invoke("api-ms-win-core-memory-l1-1-6.dll", "MapViewOfFile3FromApp", longArrayOf(filemapping, process, baseaddress, offset.toLong(), viewsize.toLong(), allocationtype.toLong(), pageprotection.toLong(), extendedparameters, parametercount.toLong()))
    return MEMORY_MAPPED_VIEW_ADDRESS(Value = rawRet)
}

public fun MapViewOfFileEx(hfilemappingobject: HANDLE, dwdesiredaccess: FILE_MAP, dwfileoffsethigh: UInt, dwfileoffsetlow: UInt, dwnumberofbytestomap: ULong, lpbaseaddress: Long): MEMORY_MAPPED_VIEW_ADDRESS {
    val rawRet = Win32DynamicFfi.invoke("kernel32.dll", "MapViewOfFileEx", longArrayOf(hfilemappingobject, dwdesiredaccess.toLong(), dwfileoffsethigh.toLong(), dwfileoffsetlow.toLong(), dwnumberofbytestomap.toLong(), lpbaseaddress))
    return MEMORY_MAPPED_VIEW_ADDRESS(Value = rawRet)
}

public fun MapViewOfFileExNuma(hfilemappingobject: HANDLE, dwdesiredaccess: FILE_MAP, dwfileoffsethigh: UInt, dwfileoffsetlow: UInt, dwnumberofbytestomap: ULong, lpbaseaddress: Long, nndpreferred: UInt): MEMORY_MAPPED_VIEW_ADDRESS {
    val rawRet = Win32DynamicFfi.invoke("kernel32.dll", "MapViewOfFileExNuma", longArrayOf(hfilemappingobject, dwdesiredaccess.toLong(), dwfileoffsethigh.toLong(), dwfileoffsetlow.toLong(), dwnumberofbytestomap.toLong(), lpbaseaddress, nndpreferred.toLong()))
    return MEMORY_MAPPED_VIEW_ADDRESS(Value = rawRet)
}

public fun MapViewOfFileFromApp(hfilemappingobject: HANDLE, desiredaccess: FILE_MAP, fileoffset: ULong, numberofbytestomap: ULong): MEMORY_MAPPED_VIEW_ADDRESS {
    val rawRet = Win32DynamicFfi.invoke("kernel32.dll", "MapViewOfFileFromApp", longArrayOf(hfilemappingobject, desiredaccess.toLong(), fileoffset.toLong(), numberofbytestomap.toLong()))
    return MEMORY_MAPPED_VIEW_ADDRESS(Value = rawRet)
}

public fun MapViewOfFileNuma2(filemappinghandle: HANDLE, processhandle: HANDLE, offset: ULong, baseaddress: Long, viewsize: ULong, allocationtype: UInt, pageprotection: UInt, preferrednode: UInt): MEMORY_MAPPED_VIEW_ADDRESS {
    val rawRet = Win32DynamicFfi.invoke("api-ms-win-core-memory-l1-1-5.dll", "MapViewOfFileNuma2", longArrayOf(filemappinghandle, processhandle, offset.toLong(), baseaddress, viewsize.toLong(), allocationtype.toLong(), pageprotection.toLong(), preferrednode.toLong()))
    return MEMORY_MAPPED_VIEW_ADDRESS(Value = rawRet)
}

public fun OfferVirtualMemory(virtualaddress: Long, size: ULong, priority: OFFER_PRIORITY): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "OfferVirtualMemory", longArrayOf(virtualaddress, size.toLong(), priority.toLong())).toUInt()
}

public fun OpenDedicatedMemoryPartition(partition: HANDLE, dedicatedmemorytypeid: ULong, desiredaccess: UInt, inherithandle: BOOL): HANDLE {
    return Win32DynamicFfi.invoke("api-ms-win-core-memory-l1-1-8.dll", "OpenDedicatedMemoryPartition", longArrayOf(partition, dedicatedmemorytypeid.toLong(), desiredaccess.toLong(), inherithandle.toLong()))
}

public fun OpenFileMappingA(dwdesiredaccess: UInt, binherithandle: BOOL, lpname: PCSTR): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "OpenFileMappingA", longArrayOf(dwdesiredaccess.toLong(), binherithandle.toLong(), lpname))
}

public fun OpenFileMappingFromApp(desiredaccess: UInt, inherithandle: BOOL, name: PCWSTR): HANDLE {
    return Win32DynamicFfi.invoke("api-ms-win-core-memory-l1-1-3.dll", "OpenFileMappingFromApp", longArrayOf(desiredaccess.toLong(), inherithandle.toLong(), name))
}

public fun OpenFileMappingW(dwdesiredaccess: UInt, binherithandle: BOOL, lpname: PCWSTR): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "OpenFileMappingW", longArrayOf(dwdesiredaccess.toLong(), binherithandle.toLong(), lpname))
}

public fun PrefetchVirtualMemory(hprocess: HANDLE, numberofentries: ULong, virtualaddresses: Long, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "PrefetchVirtualMemory", longArrayOf(hprocess, numberofentries.toLong(), virtualaddresses, flags.toLong())).toInt()
}

public fun QueryMemoryResourceNotification(resourcenotificationhandle: HANDLE, resourcestate: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "QueryMemoryResourceNotification", longArrayOf(resourcenotificationhandle, resourcestate)).toInt()
}

public fun QueryPartitionInformation(partition: HANDLE, partitioninformationclass: WIN32_MEMORY_PARTITION_INFORMATION_CLASS, partitioninformation: Long, partitioninformationlength: UInt): BOOL {
    return Win32DynamicFfi.invoke("api-ms-win-core-memory-l1-1-8.dll", "QueryPartitionInformation", longArrayOf(partition, partitioninformationclass.toLong(), partitioninformation, partitioninformationlength.toLong())).toInt()
}

public fun QueryVirtualMemoryInformation(process: HANDLE, virtualaddress: Long, memoryinformationclass: WIN32_MEMORY_INFORMATION_CLASS, memoryinformation: Long, memoryinformationsize: ULong, returnsize: Long): BOOL {
    return Win32DynamicFfi.invoke("api-ms-win-core-memory-l1-1-4.dll", "QueryVirtualMemoryInformation", longArrayOf(process, virtualaddress, memoryinformationclass.toLong(), memoryinformation, memoryinformationsize.toLong(), returnsize)).toInt()
}

public fun ReclaimVirtualMemory(virtualaddress: Long, size: ULong): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "ReclaimVirtualMemory", longArrayOf(virtualaddress, size.toLong())).toUInt()
}

public fun RegisterBadMemoryNotification(callback: PBAD_MEMORY_CALLBACK_ROUTINE): Long {
    return Win32DynamicFfi.invoke("kernel32.dll", "RegisterBadMemoryNotification", longArrayOf(Win32DynamicFfi.objectSlot(callback)))
}

public fun RemoveSecureMemoryCacheCallback(pfncallback: PSECURE_MEMORY_CACHE_CALLBACK): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "RemoveSecureMemoryCacheCallback", longArrayOf(Win32DynamicFfi.objectSlot(pfncallback))).toInt()
}

public fun ResetWriteWatch(lpbaseaddress: Long, dwregionsize: ULong): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "ResetWriteWatch", longArrayOf(lpbaseaddress, dwregionsize.toLong())).toUInt()
}

public fun RtlCompareMemory(source1: Long, source2: Long, length: ULong): ULong {
    return Win32DynamicFfi.invoke("kernel32.dll", "RtlCompareMemory", longArrayOf(source1, source2, length.toLong())).toULong()
}

public fun RtlCrc32(buffer: Long, size: ULong, initialcrc: UInt): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlCrc32", longArrayOf(buffer, size.toLong(), initialcrc.toLong())).toUInt()
}

public fun RtlCrc64(buffer: Long, size: ULong, initialcrc: ULong): ULong {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlCrc64", longArrayOf(buffer, size.toLong(), initialcrc.toLong())).toULong()
}

public fun RtlIsZeroMemory(buffer: Long, length: ULong): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlIsZeroMemory", longArrayOf(buffer, length.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun SetProcessValidCallTargets(hprocess: HANDLE, virtualaddress: Long, regionsize: ULong, numberofoffsets: UInt, offsetinformation: Long): BOOL {
    return Win32DynamicFfi.invoke("api-ms-win-core-memory-l1-1-3.dll", "SetProcessValidCallTargets", longArrayOf(hprocess, virtualaddress, regionsize.toLong(), numberofoffsets.toLong(), offsetinformation)).toInt()
}

public fun SetProcessValidCallTargetsForMappedView(process: HANDLE, virtualaddress: Long, regionsize: ULong, numberofoffsets: UInt, offsetinformation: Long, section: HANDLE, expectedfileoffset: ULong): BOOL {
    return Win32DynamicFfi.invoke("api-ms-win-core-memory-l1-1-7.dll", "SetProcessValidCallTargetsForMappedView", longArrayOf(process, virtualaddress, regionsize.toLong(), numberofoffsets.toLong(), offsetinformation, section, expectedfileoffset.toLong())).toInt()
}

public fun SetProcessWorkingSetSizeEx(hprocess: HANDLE, dwminimumworkingsetsize: ULong, dwmaximumworkingsetsize: ULong, flags: SETPROCESSWORKINGSETSIZEEX_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetProcessWorkingSetSizeEx", longArrayOf(hprocess, dwminimumworkingsetsize.toLong(), dwmaximumworkingsetsize.toLong(), flags.toLong())).toInt()
}

public fun SetSystemFileCacheSize(minimumfilecachesize: ULong, maximumfilecachesize: ULong, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetSystemFileCacheSize", longArrayOf(minimumfilecachesize.toLong(), maximumfilecachesize.toLong(), flags.toLong())).toInt()
}

public fun UnmapViewOfFile(lpbaseaddress: MEMORY_MAPPED_VIEW_ADDRESS): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "UnmapViewOfFile", longArrayOf(lpbaseaddress.Value)).toInt()
}

public fun UnmapViewOfFile2(process: HANDLE, baseaddress: MEMORY_MAPPED_VIEW_ADDRESS, unmapflags: UNMAP_VIEW_OF_FILE_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("api-ms-win-core-memory-l1-1-5.dll", "UnmapViewOfFile2", longArrayOf(process, baseaddress.Value, unmapflags.toLong())).toInt()
}

public fun UnmapViewOfFileEx(baseaddress: MEMORY_MAPPED_VIEW_ADDRESS, unmapflags: UNMAP_VIEW_OF_FILE_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "UnmapViewOfFileEx", longArrayOf(baseaddress.Value, unmapflags.toLong())).toInt()
}

public fun UnregisterBadMemoryNotification(registrationhandle: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "UnregisterBadMemoryNotification", longArrayOf(registrationhandle)).toInt()
}

public fun VirtualAlloc(lpaddress: Long, dwsize: ULong, flallocationtype: VIRTUAL_ALLOCATION_TYPE, flprotect: PAGE_PROTECTION_FLAGS): Long {
    return Win32DynamicFfi.invoke("kernel32.dll", "VirtualAlloc", longArrayOf(lpaddress, dwsize.toLong(), flallocationtype.toLong(), flprotect.toLong()))
}

public fun VirtualAlloc2(process: HANDLE, baseaddress: Long, size: ULong, allocationtype: VIRTUAL_ALLOCATION_TYPE, pageprotection: UInt, extendedparameters: Long, parametercount: UInt): Long {
    return Win32DynamicFfi.invoke("api-ms-win-core-memory-l1-1-6.dll", "VirtualAlloc2", longArrayOf(process, baseaddress, size.toLong(), allocationtype.toLong(), pageprotection.toLong(), extendedparameters, parametercount.toLong()))
}

public fun VirtualAlloc2FromApp(process: HANDLE, baseaddress: Long, size: ULong, allocationtype: VIRTUAL_ALLOCATION_TYPE, pageprotection: UInt, extendedparameters: Long, parametercount: UInt): Long {
    return Win32DynamicFfi.invoke("api-ms-win-core-memory-l1-1-6.dll", "VirtualAlloc2FromApp", longArrayOf(process, baseaddress, size.toLong(), allocationtype.toLong(), pageprotection.toLong(), extendedparameters, parametercount.toLong()))
}

public fun VirtualAllocEx(hprocess: HANDLE, lpaddress: Long, dwsize: ULong, flallocationtype: VIRTUAL_ALLOCATION_TYPE, flprotect: PAGE_PROTECTION_FLAGS): Long {
    return Win32DynamicFfi.invoke("kernel32.dll", "VirtualAllocEx", longArrayOf(hprocess, lpaddress, dwsize.toLong(), flallocationtype.toLong(), flprotect.toLong()))
}

public fun VirtualAllocExNuma(hprocess: HANDLE, lpaddress: Long, dwsize: ULong, flallocationtype: VIRTUAL_ALLOCATION_TYPE, flprotect: UInt, nndpreferred: UInt): Long {
    return Win32DynamicFfi.invoke("kernel32.dll", "VirtualAllocExNuma", longArrayOf(hprocess, lpaddress, dwsize.toLong(), flallocationtype.toLong(), flprotect.toLong(), nndpreferred.toLong()))
}

public fun VirtualAllocFromApp(baseaddress: Long, size: ULong, allocationtype: VIRTUAL_ALLOCATION_TYPE, protection: UInt): Long {
    return Win32DynamicFfi.invoke("api-ms-win-core-memory-l1-1-3.dll", "VirtualAllocFromApp", longArrayOf(baseaddress, size.toLong(), allocationtype.toLong(), protection.toLong()))
}

public fun VirtualFree(lpaddress: Long, dwsize: ULong, dwfreetype: VIRTUAL_FREE_TYPE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "VirtualFree", longArrayOf(lpaddress, dwsize.toLong(), dwfreetype.toLong())).toInt()
}

public fun VirtualFreeEx(hprocess: HANDLE, lpaddress: Long, dwsize: ULong, dwfreetype: VIRTUAL_FREE_TYPE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "VirtualFreeEx", longArrayOf(hprocess, lpaddress, dwsize.toLong(), dwfreetype.toLong())).toInt()
}

public fun VirtualLock(lpaddress: Long, dwsize: ULong): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "VirtualLock", longArrayOf(lpaddress, dwsize.toLong())).toInt()
}

public fun VirtualProtect(lpaddress: Long, dwsize: ULong, flnewprotect: PAGE_PROTECTION_FLAGS, lpfloldprotect: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "VirtualProtect", longArrayOf(lpaddress, dwsize.toLong(), flnewprotect.toLong(), lpfloldprotect)).toInt()
}

public fun VirtualProtectEx(hprocess: HANDLE, lpaddress: Long, dwsize: ULong, flnewprotect: PAGE_PROTECTION_FLAGS, lpfloldprotect: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "VirtualProtectEx", longArrayOf(hprocess, lpaddress, dwsize.toLong(), flnewprotect.toLong(), lpfloldprotect)).toInt()
}

public fun VirtualProtectFromApp(address: Long, size: ULong, newprotection: UInt, oldprotection: Long): BOOL {
    return Win32DynamicFfi.invoke("api-ms-win-core-memory-l1-1-3.dll", "VirtualProtectFromApp", longArrayOf(address, size.toLong(), newprotection.toLong(), oldprotection)).toInt()
}

public fun VirtualQuery(lpaddress: Long, lpbuffer: Long, dwlength: ULong): ULong {
    return Win32DynamicFfi.invoke("kernel32.dll", "VirtualQuery", longArrayOf(lpaddress, lpbuffer, dwlength.toLong())).toULong()
}

public fun VirtualQueryEx(hprocess: HANDLE, lpaddress: Long, lpbuffer: Long, dwlength: ULong): ULong {
    return Win32DynamicFfi.invoke("kernel32.dll", "VirtualQueryEx", longArrayOf(hprocess, lpaddress, lpbuffer, dwlength.toLong())).toULong()
}

public fun VirtualUnlock(lpaddress: Long, dwsize: ULong): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "VirtualUnlock", longArrayOf(lpaddress, dwsize.toLong())).toInt()
}

public fun VirtualUnlockEx(process: HANDLE, address: Long, size: ULong): BOOL {
    return Win32DynamicFfi.invoke("api-ms-win-core-memory-l1-1-5.dll", "VirtualUnlockEx", longArrayOf(process, address, size.toLong())).toInt()
}
