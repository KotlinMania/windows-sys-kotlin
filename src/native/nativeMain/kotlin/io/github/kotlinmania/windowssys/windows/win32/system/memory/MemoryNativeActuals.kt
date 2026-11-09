@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.memory

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FARPROC
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HGLOBAL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HLOCAL
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun AddSecureMemoryCacheCallback(pfncallback: PSECURE_MEMORY_CACHE_CALLBACK): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_AddSecureMemoryCacheCallback(pfncallback.toLong().toCPointer<ByteVar>())

public actual fun AllocateUserPhysicalPages(hprocess: HANDLE, numberofpages: Long, pagearray: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_AllocateUserPhysicalPages(hprocess.toCPointer<ByteVar>(), numberofpages.toCPointer<ByteVar>(), pagearray.toCPointer<ByteVar>())

public actual fun AllocateUserPhysicalPages2(objecthandle: HANDLE, numberofpages: Long, pagearray: Long, extendedparameters: Long, extendedparametercount: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_AllocateUserPhysicalPages2(objecthandle.toCPointer<ByteVar>(), numberofpages.toCPointer<ByteVar>(), pagearray.toCPointer<ByteVar>(), extendedparameters.toCPointer<ByteVar>(), extendedparametercount)

public actual fun AllocateUserPhysicalPagesNuma(hprocess: HANDLE, numberofpages: Long, pagearray: Long, nndpreferred: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_AllocateUserPhysicalPagesNuma(hprocess.toCPointer<ByteVar>(), numberofpages.toCPointer<ByteVar>(), pagearray.toCPointer<ByteVar>(), nndpreferred)

public actual fun CreateFileMapping2(file: HANDLE, securityattributes: Long, desiredaccess: UInt, pageprotection: PAGE_PROTECTION_FLAGS, allocationattributes: UInt, maximumsize: ULong, name: PCWSTR, extendedparameters: Long, parametercount: UInt): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_CreateFileMapping2(file.toCPointer<ByteVar>(), securityattributes.toCPointer<ByteVar>(), desiredaccess, pageprotection, allocationattributes, maximumsize, name.toCPointer<ByteVar>(), extendedparameters.toCPointer<ByteVar>(), parametercount)?.toLong() ?: 0L

public actual fun CreateFileMappingA(hfile: HANDLE, lpfilemappingattributes: Long, flprotect: PAGE_PROTECTION_FLAGS, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: PCSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_CreateFileMappingA(hfile.toCPointer<ByteVar>(), lpfilemappingattributes.toCPointer<ByteVar>(), flprotect, dwmaximumsizehigh, dwmaximumsizelow, lpname.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateFileMappingFromApp(hfile: HANDLE, securityattributes: Long, pageprotection: PAGE_PROTECTION_FLAGS, maximumsize: ULong, name: PCWSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_CreateFileMappingFromApp(hfile.toCPointer<ByteVar>(), securityattributes.toCPointer<ByteVar>(), pageprotection, maximumsize, name.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateFileMappingNumaA(hfile: HANDLE, lpfilemappingattributes: Long, flprotect: PAGE_PROTECTION_FLAGS, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: PCSTR, nndpreferred: UInt): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_CreateFileMappingNumaA(hfile.toCPointer<ByteVar>(), lpfilemappingattributes.toCPointer<ByteVar>(), flprotect, dwmaximumsizehigh, dwmaximumsizelow, lpname.toCPointer<ByteVar>(), nndpreferred)?.toLong() ?: 0L

public actual fun CreateFileMappingNumaW(hfile: HANDLE, lpfilemappingattributes: Long, flprotect: PAGE_PROTECTION_FLAGS, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: PCWSTR, nndpreferred: UInt): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_CreateFileMappingNumaW(hfile.toCPointer<ByteVar>(), lpfilemappingattributes.toCPointer<ByteVar>(), flprotect, dwmaximumsizehigh, dwmaximumsizelow, lpname.toCPointer<ByteVar>(), nndpreferred)?.toLong() ?: 0L

public actual fun CreateFileMappingW(hfile: HANDLE, lpfilemappingattributes: Long, flprotect: PAGE_PROTECTION_FLAGS, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: PCWSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_CreateFileMappingW(hfile.toCPointer<ByteVar>(), lpfilemappingattributes.toCPointer<ByteVar>(), flprotect, dwmaximumsizehigh, dwmaximumsizelow, lpname.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateMemoryResourceNotification(notificationtype: MEMORY_RESOURCE_NOTIFICATION_TYPE): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_CreateMemoryResourceNotification(notificationtype)?.toLong() ?: 0L

public actual fun DiscardVirtualMemory(virtualaddress: Long, size: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_DiscardVirtualMemory(virtualaddress.toCPointer<ByteVar>(), size)

public actual fun FlushViewOfFile(lpbaseaddress: Long, dwnumberofbytestoflush: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_FlushViewOfFile(lpbaseaddress.toCPointer<ByteVar>(), dwnumberofbytestoflush)

public actual fun FreeUserPhysicalPages(hprocess: HANDLE, numberofpages: Long, pagearray: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_FreeUserPhysicalPages(hprocess.toCPointer<ByteVar>(), numberofpages.toCPointer<ByteVar>(), pagearray.toCPointer<ByteVar>())

public actual fun GetLargePageMinimum(): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_GetLargePageMinimum()

public actual fun GetMemoryErrorHandlingCapabilities(capabilities: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_GetMemoryErrorHandlingCapabilities(capabilities.toCPointer<ByteVar>())

public actual fun GetProcessHeap(): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_GetProcessHeap()?.toLong() ?: 0L

public actual fun GetProcessHeaps(numberofheaps: UInt, processheaps: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_GetProcessHeaps(numberofheaps, processheaps.toCPointer<ByteVar>())

public actual fun GetProcessWorkingSetSizeEx(hprocess: HANDLE, lpminimumworkingsetsize: Long, lpmaximumworkingsetsize: Long, flags: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_GetProcessWorkingSetSizeEx(hprocess.toCPointer<ByteVar>(), lpminimumworkingsetsize.toCPointer<ByteVar>(), lpmaximumworkingsetsize.toCPointer<ByteVar>(), flags.toCPointer<ByteVar>())

public actual fun GetSystemFileCacheSize(lpminimumfilecachesize: Long, lpmaximumfilecachesize: Long, lpflags: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_GetSystemFileCacheSize(lpminimumfilecachesize.toCPointer<ByteVar>(), lpmaximumfilecachesize.toCPointer<ByteVar>(), lpflags.toCPointer<ByteVar>())

public actual fun GetWriteWatch(dwflags: UInt, lpbaseaddress: Long, dwregionsize: ULong, lpaddresses: Long, lpdwcount: Long, lpdwgranularity: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_GetWriteWatch(dwflags, lpbaseaddress.toCPointer<ByteVar>(), dwregionsize, lpaddresses.toCPointer<ByteVar>(), lpdwcount.toCPointer<ByteVar>(), lpdwgranularity.toCPointer<ByteVar>())

public actual fun GlobalAlloc(uflags: GLOBAL_ALLOC_FLAGS, dwbytes: ULong): HGLOBAL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_GlobalAlloc(uflags, dwbytes)?.toLong() ?: 0L

public actual fun GlobalFlags(hmem: HGLOBAL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_GlobalFlags(hmem.toCPointer<ByteVar>())

public actual fun GlobalHandle(pmem: Long): HGLOBAL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_GlobalHandle(pmem.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun GlobalLock(hmem: HGLOBAL): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_GlobalLock(hmem.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun GlobalReAlloc(hmem: HGLOBAL, dwbytes: ULong, uflags: UInt): HGLOBAL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_GlobalReAlloc(hmem.toCPointer<ByteVar>(), dwbytes, uflags)?.toLong() ?: 0L

public actual fun GlobalSize(hmem: HGLOBAL): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_GlobalSize(hmem.toCPointer<ByteVar>())

public actual fun GlobalUnlock(hmem: HGLOBAL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_GlobalUnlock(hmem.toCPointer<ByteVar>())

public actual fun HeapAlloc(hheap: HANDLE, dwflags: HEAP_FLAGS, dwbytes: ULong): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_HeapAlloc(hheap.toCPointer<ByteVar>(), dwflags, dwbytes)?.toLong() ?: 0L

public actual fun HeapCompact(hheap: HANDLE, dwflags: HEAP_FLAGS): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_HeapCompact(hheap.toCPointer<ByteVar>(), dwflags)

public actual fun HeapCreate(floptions: HEAP_FLAGS, dwinitialsize: ULong, dwmaximumsize: ULong): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_HeapCreate(floptions, dwinitialsize, dwmaximumsize)?.toLong() ?: 0L

public actual fun HeapDestroy(hheap: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_HeapDestroy(hheap.toCPointer<ByteVar>())

public actual fun HeapFree(hheap: HANDLE, dwflags: HEAP_FLAGS, lpmem: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_HeapFree(hheap.toCPointer<ByteVar>(), dwflags, lpmem.toCPointer<ByteVar>())

public actual fun HeapLock(hheap: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_HeapLock(hheap.toCPointer<ByteVar>())

public actual fun HeapQueryInformation(heaphandle: HANDLE, heapinformationclass: HEAP_INFORMATION_CLASS, heapinformation: Long, heapinformationlength: ULong, returnlength: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_HeapQueryInformation(heaphandle.toCPointer<ByteVar>(), heapinformationclass, heapinformation.toCPointer<ByteVar>(), heapinformationlength, returnlength.toCPointer<ByteVar>())

public actual fun HeapReAlloc(hheap: HANDLE, dwflags: HEAP_FLAGS, lpmem: Long, dwbytes: ULong): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_HeapReAlloc(hheap.toCPointer<ByteVar>(), dwflags, lpmem.toCPointer<ByteVar>(), dwbytes)?.toLong() ?: 0L

public actual fun HeapSetInformation(heaphandle: HANDLE, heapinformationclass: HEAP_INFORMATION_CLASS, heapinformation: Long, heapinformationlength: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_HeapSetInformation(heaphandle.toCPointer<ByteVar>(), heapinformationclass, heapinformation.toCPointer<ByteVar>(), heapinformationlength)

public actual fun HeapSize(hheap: HANDLE, dwflags: HEAP_FLAGS, lpmem: Long): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_HeapSize(hheap.toCPointer<ByteVar>(), dwflags, lpmem.toCPointer<ByteVar>())

public actual fun HeapSummary(hheap: HANDLE, dwflags: UInt, lpsummary: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_HeapSummary(hheap.toCPointer<ByteVar>(), dwflags, lpsummary.toCPointer<ByteVar>())

public actual fun HeapUnlock(hheap: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_HeapUnlock(hheap.toCPointer<ByteVar>())

public actual fun HeapValidate(hheap: HANDLE, dwflags: HEAP_FLAGS, lpmem: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_HeapValidate(hheap.toCPointer<ByteVar>(), dwflags, lpmem.toCPointer<ByteVar>())

public actual fun HeapWalk(hheap: HANDLE, lpentry: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_HeapWalk(hheap.toCPointer<ByteVar>(), lpentry.toCPointer<ByteVar>())

public actual fun IsBadCodePtr(lpfn: FARPROC): BOOL =
    0

public actual fun IsBadReadPtr(lp: Long, ucb: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_IsBadReadPtr(lp.toCPointer<ByteVar>(), ucb)

public actual fun IsBadStringPtrA(lpsz: PCSTR, ucchmax: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_IsBadStringPtrA(lpsz.toCPointer<ByteVar>(), ucchmax)

public actual fun IsBadStringPtrW(lpsz: PCWSTR, ucchmax: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_IsBadStringPtrW(lpsz.toCPointer<ByteVar>(), ucchmax)

public actual fun IsBadWritePtr(lp: Long, ucb: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_IsBadWritePtr(lp.toCPointer<ByteVar>(), ucb)

public actual fun LocalAlloc(uflags: LOCAL_ALLOC_FLAGS, ubytes: ULong): HLOCAL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_LocalAlloc(uflags, ubytes)?.toLong() ?: 0L

public actual fun LocalFlags(hmem: HLOCAL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_LocalFlags(hmem.toCPointer<ByteVar>())

public actual fun LocalHandle(pmem: Long): HLOCAL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_LocalHandle(pmem.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun LocalLock(hmem: HLOCAL): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_LocalLock(hmem.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun LocalReAlloc(hmem: HLOCAL, ubytes: ULong, uflags: UInt): HLOCAL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_LocalReAlloc(hmem.toCPointer<ByteVar>(), ubytes, uflags)?.toLong() ?: 0L

public actual fun LocalSize(hmem: HLOCAL): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_LocalSize(hmem.toCPointer<ByteVar>())

public actual fun LocalUnlock(hmem: HLOCAL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_LocalUnlock(hmem.toCPointer<ByteVar>())

public actual fun MapUserPhysicalPages(virtualaddress: Long, numberofpages: ULong, pagearray: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_MapUserPhysicalPages(virtualaddress.toCPointer<ByteVar>(), numberofpages, pagearray.toCPointer<ByteVar>())

public actual fun MapUserPhysicalPagesScatter(virtualaddresses: Long, numberofpages: ULong, pagearray: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_MapUserPhysicalPagesScatter(virtualaddresses.toCPointer<ByteVar>(), numberofpages, pagearray.toCPointer<ByteVar>())

public actual fun MapViewOfFile(hfilemappingobject: HANDLE, dwdesiredaccess: FILE_MAP, dwfileoffsethigh: UInt, dwfileoffsetlow: UInt, dwnumberofbytestomap: ULong): MEMORY_MAPPED_VIEW_ADDRESS =
    MEMORY_MAPPED_VIEW_ADDRESS()

public actual fun MapViewOfFile3(filemapping: HANDLE, process: HANDLE, baseaddress: Long, offset: ULong, viewsize: ULong, allocationtype: VIRTUAL_ALLOCATION_TYPE, pageprotection: UInt, extendedparameters: Long, parametercount: UInt): MEMORY_MAPPED_VIEW_ADDRESS =
    MEMORY_MAPPED_VIEW_ADDRESS()

public actual fun MapViewOfFile3FromApp(filemapping: HANDLE, process: HANDLE, baseaddress: Long, offset: ULong, viewsize: ULong, allocationtype: VIRTUAL_ALLOCATION_TYPE, pageprotection: UInt, extendedparameters: Long, parametercount: UInt): MEMORY_MAPPED_VIEW_ADDRESS =
    MEMORY_MAPPED_VIEW_ADDRESS()

public actual fun MapViewOfFileEx(hfilemappingobject: HANDLE, dwdesiredaccess: FILE_MAP, dwfileoffsethigh: UInt, dwfileoffsetlow: UInt, dwnumberofbytestomap: ULong, lpbaseaddress: Long): MEMORY_MAPPED_VIEW_ADDRESS =
    MEMORY_MAPPED_VIEW_ADDRESS()

public actual fun MapViewOfFileExNuma(hfilemappingobject: HANDLE, dwdesiredaccess: FILE_MAP, dwfileoffsethigh: UInt, dwfileoffsetlow: UInt, dwnumberofbytestomap: ULong, lpbaseaddress: Long, nndpreferred: UInt): MEMORY_MAPPED_VIEW_ADDRESS =
    MEMORY_MAPPED_VIEW_ADDRESS()

public actual fun MapViewOfFileFromApp(hfilemappingobject: HANDLE, desiredaccess: FILE_MAP, fileoffset: ULong, numberofbytestomap: ULong): MEMORY_MAPPED_VIEW_ADDRESS =
    MEMORY_MAPPED_VIEW_ADDRESS()

public actual fun MapViewOfFileNuma2(filemappinghandle: HANDLE, processhandle: HANDLE, offset: ULong, baseaddress: Long, viewsize: ULong, allocationtype: UInt, pageprotection: UInt, preferrednode: UInt): MEMORY_MAPPED_VIEW_ADDRESS =
    MEMORY_MAPPED_VIEW_ADDRESS()

public actual fun OfferVirtualMemory(virtualaddress: Long, size: ULong, priority: OFFER_PRIORITY): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_OfferVirtualMemory(virtualaddress.toCPointer<ByteVar>(), size, priority)

public actual fun OpenDedicatedMemoryPartition(partition: HANDLE, dedicatedmemorytypeid: ULong, desiredaccess: UInt, inherithandle: BOOL): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_OpenDedicatedMemoryPartition(partition.toCPointer<ByteVar>(), dedicatedmemorytypeid, desiredaccess, inherithandle)?.toLong() ?: 0L

public actual fun OpenFileMappingA(dwdesiredaccess: UInt, binherithandle: BOOL, lpname: PCSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_OpenFileMappingA(dwdesiredaccess, binherithandle, lpname.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun OpenFileMappingFromApp(desiredaccess: UInt, inherithandle: BOOL, name: PCWSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_OpenFileMappingFromApp(desiredaccess, inherithandle, name.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun OpenFileMappingW(dwdesiredaccess: UInt, binherithandle: BOOL, lpname: PCWSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_OpenFileMappingW(dwdesiredaccess, binherithandle, lpname.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun PrefetchVirtualMemory(hprocess: HANDLE, numberofentries: ULong, virtualaddresses: Long, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_PrefetchVirtualMemory(hprocess.toCPointer<ByteVar>(), numberofentries, virtualaddresses.toCPointer<ByteVar>(), flags)

public actual fun QueryMemoryResourceNotification(resourcenotificationhandle: HANDLE, resourcestate: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_QueryMemoryResourceNotification(resourcenotificationhandle.toCPointer<ByteVar>(), resourcestate.toCPointer<ByteVar>())

public actual fun QueryPartitionInformation(partition: HANDLE, partitioninformationclass: WIN32_MEMORY_PARTITION_INFORMATION_CLASS, partitioninformation: Long, partitioninformationlength: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_QueryPartitionInformation(partition.toCPointer<ByteVar>(), partitioninformationclass, partitioninformation.toCPointer<ByteVar>(), partitioninformationlength)

public actual fun QueryVirtualMemoryInformation(process: HANDLE, virtualaddress: Long, memoryinformationclass: WIN32_MEMORY_INFORMATION_CLASS, memoryinformation: Long, memoryinformationsize: ULong, returnsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_QueryVirtualMemoryInformation(process.toCPointer<ByteVar>(), virtualaddress.toCPointer<ByteVar>(), memoryinformationclass, memoryinformation.toCPointer<ByteVar>(), memoryinformationsize, returnsize.toCPointer<ByteVar>())

public actual fun ReclaimVirtualMemory(virtualaddress: Long, size: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_ReclaimVirtualMemory(virtualaddress.toCPointer<ByteVar>(), size)

public actual fun RegisterBadMemoryNotification(callback: PBAD_MEMORY_CALLBACK_ROUTINE): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_RegisterBadMemoryNotification(callback.toLong().toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RemoveSecureMemoryCacheCallback(pfncallback: PSECURE_MEMORY_CACHE_CALLBACK): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_RemoveSecureMemoryCacheCallback(pfncallback.toLong().toCPointer<ByteVar>())

public actual fun ResetWriteWatch(lpbaseaddress: Long, dwregionsize: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_ResetWriteWatch(lpbaseaddress.toCPointer<ByteVar>(), dwregionsize)

public actual fun RtlCompareMemory(source1: Long, source2: Long, length: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_RtlCompareMemory(source1.toCPointer<ByteVar>(), source2.toCPointer<ByteVar>(), length)

public actual fun RtlCrc32(buffer: Long, size: ULong, initialcrc: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_RtlCrc32(buffer.toCPointer<ByteVar>(), size, initialcrc)

public actual fun RtlCrc64(buffer: Long, size: ULong, initialcrc: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_RtlCrc64(buffer.toCPointer<ByteVar>(), size, initialcrc)

public actual fun RtlIsZeroMemory(buffer: Long, length: ULong): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_RtlIsZeroMemory(buffer.toCPointer<ByteVar>(), length)

public actual fun SetProcessValidCallTargets(hprocess: HANDLE, virtualaddress: Long, regionsize: ULong, numberofoffsets: UInt, offsetinformation: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_SetProcessValidCallTargets(hprocess.toCPointer<ByteVar>(), virtualaddress.toCPointer<ByteVar>(), regionsize, numberofoffsets, offsetinformation.toCPointer<ByteVar>())

public actual fun SetProcessValidCallTargetsForMappedView(process: HANDLE, virtualaddress: Long, regionsize: ULong, numberofoffsets: UInt, offsetinformation: Long, section: HANDLE, expectedfileoffset: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_SetProcessValidCallTargetsForMappedView(process.toCPointer<ByteVar>(), virtualaddress.toCPointer<ByteVar>(), regionsize, numberofoffsets, offsetinformation.toCPointer<ByteVar>(), section.toCPointer<ByteVar>(), expectedfileoffset)

public actual fun SetProcessWorkingSetSizeEx(hprocess: HANDLE, dwminimumworkingsetsize: ULong, dwmaximumworkingsetsize: ULong, flags: SETPROCESSWORKINGSETSIZEEX_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_SetProcessWorkingSetSizeEx(hprocess.toCPointer<ByteVar>(), dwminimumworkingsetsize, dwmaximumworkingsetsize, flags)

public actual fun SetSystemFileCacheSize(minimumfilecachesize: ULong, maximumfilecachesize: ULong, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_SetSystemFileCacheSize(minimumfilecachesize, maximumfilecachesize, flags)

public actual fun UnmapViewOfFile(lpbaseaddress: MEMORY_MAPPED_VIEW_ADDRESS): BOOL =
    0

public actual fun UnmapViewOfFile2(process: HANDLE, baseaddress: MEMORY_MAPPED_VIEW_ADDRESS, unmapflags: UNMAP_VIEW_OF_FILE_FLAGS): BOOL =
    0

public actual fun UnmapViewOfFileEx(baseaddress: MEMORY_MAPPED_VIEW_ADDRESS, unmapflags: UNMAP_VIEW_OF_FILE_FLAGS): BOOL =
    0

public actual fun UnregisterBadMemoryNotification(registrationhandle: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_UnregisterBadMemoryNotification(registrationhandle.toCPointer<ByteVar>())

public actual fun VirtualAlloc(lpaddress: Long, dwsize: ULong, flallocationtype: VIRTUAL_ALLOCATION_TYPE, flprotect: PAGE_PROTECTION_FLAGS): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_VirtualAlloc(lpaddress.toCPointer<ByteVar>(), dwsize, flallocationtype, flprotect)?.toLong() ?: 0L

public actual fun VirtualAlloc2(process: HANDLE, baseaddress: Long, size: ULong, allocationtype: VIRTUAL_ALLOCATION_TYPE, pageprotection: UInt, extendedparameters: Long, parametercount: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_VirtualAlloc2(process.toCPointer<ByteVar>(), baseaddress.toCPointer<ByteVar>(), size, allocationtype, pageprotection, extendedparameters.toCPointer<ByteVar>(), parametercount)?.toLong() ?: 0L

public actual fun VirtualAlloc2FromApp(process: HANDLE, baseaddress: Long, size: ULong, allocationtype: VIRTUAL_ALLOCATION_TYPE, pageprotection: UInt, extendedparameters: Long, parametercount: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_VirtualAlloc2FromApp(process.toCPointer<ByteVar>(), baseaddress.toCPointer<ByteVar>(), size, allocationtype, pageprotection, extendedparameters.toCPointer<ByteVar>(), parametercount)?.toLong() ?: 0L

public actual fun VirtualAllocEx(hprocess: HANDLE, lpaddress: Long, dwsize: ULong, flallocationtype: VIRTUAL_ALLOCATION_TYPE, flprotect: PAGE_PROTECTION_FLAGS): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_VirtualAllocEx(hprocess.toCPointer<ByteVar>(), lpaddress.toCPointer<ByteVar>(), dwsize, flallocationtype, flprotect)?.toLong() ?: 0L

public actual fun VirtualAllocExNuma(hprocess: HANDLE, lpaddress: Long, dwsize: ULong, flallocationtype: VIRTUAL_ALLOCATION_TYPE, flprotect: UInt, nndpreferred: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_VirtualAllocExNuma(hprocess.toCPointer<ByteVar>(), lpaddress.toCPointer<ByteVar>(), dwsize, flallocationtype, flprotect, nndpreferred)?.toLong() ?: 0L

public actual fun VirtualAllocFromApp(baseaddress: Long, size: ULong, allocationtype: VIRTUAL_ALLOCATION_TYPE, protection: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_VirtualAllocFromApp(baseaddress.toCPointer<ByteVar>(), size, allocationtype, protection)?.toLong() ?: 0L

public actual fun VirtualFree(lpaddress: Long, dwsize: ULong, dwfreetype: VIRTUAL_FREE_TYPE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_VirtualFree(lpaddress.toCPointer<ByteVar>(), dwsize, dwfreetype)

public actual fun VirtualFreeEx(hprocess: HANDLE, lpaddress: Long, dwsize: ULong, dwfreetype: VIRTUAL_FREE_TYPE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_VirtualFreeEx(hprocess.toCPointer<ByteVar>(), lpaddress.toCPointer<ByteVar>(), dwsize, dwfreetype)

public actual fun VirtualLock(lpaddress: Long, dwsize: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_VirtualLock(lpaddress.toCPointer<ByteVar>(), dwsize)

public actual fun VirtualProtect(lpaddress: Long, dwsize: ULong, flnewprotect: PAGE_PROTECTION_FLAGS, lpfloldprotect: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_VirtualProtect(lpaddress.toCPointer<ByteVar>(), dwsize, flnewprotect, lpfloldprotect.toCPointer<ByteVar>())

public actual fun VirtualProtectEx(hprocess: HANDLE, lpaddress: Long, dwsize: ULong, flnewprotect: PAGE_PROTECTION_FLAGS, lpfloldprotect: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_VirtualProtectEx(hprocess.toCPointer<ByteVar>(), lpaddress.toCPointer<ByteVar>(), dwsize, flnewprotect, lpfloldprotect.toCPointer<ByteVar>())

public actual fun VirtualProtectFromApp(address: Long, size: ULong, newprotection: UInt, oldprotection: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_VirtualProtectFromApp(address.toCPointer<ByteVar>(), size, newprotection, oldprotection.toCPointer<ByteVar>())

public actual fun VirtualQuery(lpaddress: Long, lpbuffer: Long, dwlength: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_VirtualQuery(lpaddress.toCPointer<ByteVar>(), lpbuffer.toCPointer<ByteVar>(), dwlength)

public actual fun VirtualQueryEx(hprocess: HANDLE, lpaddress: Long, lpbuffer: Long, dwlength: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_VirtualQueryEx(hprocess.toCPointer<ByteVar>(), lpaddress.toCPointer<ByteVar>(), lpbuffer.toCPointer<ByteVar>(), dwlength)

public actual fun VirtualUnlock(lpaddress: Long, dwsize: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_VirtualUnlock(lpaddress.toCPointer<ByteVar>(), dwsize)

public actual fun VirtualUnlockEx(process: HANDLE, address: Long, size: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_VirtualUnlockEx(process.toCPointer<ByteVar>(), address.toCPointer<ByteVar>(), size)
