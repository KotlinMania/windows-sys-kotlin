@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.memory

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FARPROC
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HGLOBAL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HLOCAL

private object WindowsWin32SystemMemoryJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_AddSecureMemoryCacheCallback(pfncallback: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_AllocateUserPhysicalPages(hprocess: Long, numberofpages: Long, pagearray: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_AllocateUserPhysicalPages2(objecthandle: Long, numberofpages: Long, pagearray: Long, extendedparameters: Long, extendedparametercount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_AllocateUserPhysicalPagesNuma(hprocess: Long, numberofpages: Long, pagearray: Long, nndpreferred: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_CreateFileMapping2(file: Long, securityattributes: Long, desiredaccess: Int, pageprotection: Int, allocationattributes: Int, maximumsize: Long, name: Long, extendedparameters: Long, parametercount: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_CreateFileMappingA(hfile: Long, lpfilemappingattributes: Long, flprotect: Int, dwmaximumsizehigh: Int, dwmaximumsizelow: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_CreateFileMappingFromApp(hfile: Long, securityattributes: Long, pageprotection: Int, maximumsize: Long, name: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_CreateFileMappingNumaA(hfile: Long, lpfilemappingattributes: Long, flprotect: Int, dwmaximumsizehigh: Int, dwmaximumsizelow: Int, lpname: Long, nndpreferred: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_CreateFileMappingNumaW(hfile: Long, lpfilemappingattributes: Long, flprotect: Int, dwmaximumsizehigh: Int, dwmaximumsizelow: Int, lpname: Long, nndpreferred: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_CreateFileMappingW(hfile: Long, lpfilemappingattributes: Long, flprotect: Int, dwmaximumsizehigh: Int, dwmaximumsizelow: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_CreateMemoryResourceNotification(notificationtype: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_DiscardVirtualMemory(virtualaddress: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_FlushViewOfFile(lpbaseaddress: Long, dwnumberofbytestoflush: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_FreeUserPhysicalPages(hprocess: Long, numberofpages: Long, pagearray: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_GetLargePageMinimum(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_GetMemoryErrorHandlingCapabilities(capabilities: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_GetProcessHeap(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_GetProcessHeaps(numberofheaps: Int, processheaps: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_GetProcessWorkingSetSizeEx(hprocess: Long, lpminimumworkingsetsize: Long, lpmaximumworkingsetsize: Long, flags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_GetSystemFileCacheSize(lpminimumfilecachesize: Long, lpmaximumfilecachesize: Long, lpflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_GetWriteWatch(dwflags: Int, lpbaseaddress: Long, dwregionsize: Long, lpaddresses: Long, lpdwcount: Long, lpdwgranularity: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_GlobalAlloc(uflags: Int, dwbytes: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_GlobalFlags(hmem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_GlobalHandle(pmem: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_GlobalLock(hmem: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_GlobalReAlloc(hmem: Long, dwbytes: Long, uflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_GlobalSize(hmem: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_GlobalUnlock(hmem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_HeapAlloc(hheap: Long, dwflags: Int, dwbytes: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_HeapCompact(hheap: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_HeapCreate(floptions: Int, dwinitialsize: Long, dwmaximumsize: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_HeapDestroy(hheap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_HeapFree(hheap: Long, dwflags: Int, lpmem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_HeapLock(hheap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_HeapQueryInformation(heaphandle: Long, heapinformationclass: Int, heapinformation: Long, heapinformationlength: Long, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_HeapReAlloc(hheap: Long, dwflags: Int, lpmem: Long, dwbytes: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_HeapSetInformation(heaphandle: Long, heapinformationclass: Int, heapinformation: Long, heapinformationlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_HeapSize(hheap: Long, dwflags: Int, lpmem: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_HeapSummary(hheap: Long, dwflags: Int, lpsummary: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_HeapUnlock(hheap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_HeapValidate(hheap: Long, dwflags: Int, lpmem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_HeapWalk(hheap: Long, lpentry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_IsBadReadPtr(lp: Long, ucb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_IsBadStringPtrA(lpsz: Long, ucchmax: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_IsBadStringPtrW(lpsz: Long, ucchmax: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_IsBadWritePtr(lp: Long, ucb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_LocalAlloc(uflags: Int, ubytes: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_LocalFlags(hmem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_LocalHandle(pmem: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_LocalLock(hmem: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_LocalReAlloc(hmem: Long, ubytes: Long, uflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_LocalSize(hmem: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_LocalUnlock(hmem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_MapUserPhysicalPages(virtualaddress: Long, numberofpages: Long, pagearray: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_MapUserPhysicalPagesScatter(virtualaddresses: Long, numberofpages: Long, pagearray: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_OfferVirtualMemory(virtualaddress: Long, size: Long, priority: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_OpenDedicatedMemoryPartition(partition: Long, dedicatedmemorytypeid: Long, desiredaccess: Int, inherithandle: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_OpenFileMappingA(dwdesiredaccess: Int, binherithandle: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_OpenFileMappingFromApp(desiredaccess: Int, inherithandle: Int, name: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_OpenFileMappingW(dwdesiredaccess: Int, binherithandle: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_PrefetchVirtualMemory(hprocess: Long, numberofentries: Long, virtualaddresses: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_QueryMemoryResourceNotification(resourcenotificationhandle: Long, resourcestate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_QueryPartitionInformation(partition: Long, partitioninformationclass: Int, partitioninformation: Long, partitioninformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_QueryVirtualMemoryInformation(process: Long, virtualaddress: Long, memoryinformationclass: Int, memoryinformation: Long, memoryinformationsize: Long, returnsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_ReclaimVirtualMemory(virtualaddress: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_RegisterBadMemoryNotification(callback: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_RemoveSecureMemoryCacheCallback(pfncallback: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_ResetWriteWatch(lpbaseaddress: Long, dwregionsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_RtlCompareMemory(source1: Long, source2: Long, length: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_RtlCrc32(buffer: Long, size: Long, initialcrc: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_RtlCrc64(buffer: Long, size: Long, initialcrc: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_RtlIsZeroMemory(buffer: Long, length: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_SetProcessValidCallTargets(hprocess: Long, virtualaddress: Long, regionsize: Long, numberofoffsets: Int, offsetinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_SetProcessValidCallTargetsForMappedView(process: Long, virtualaddress: Long, regionsize: Long, numberofoffsets: Int, offsetinformation: Long, section: Long, expectedfileoffset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_SetProcessWorkingSetSizeEx(hprocess: Long, dwminimumworkingsetsize: Long, dwmaximumworkingsetsize: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_SetSystemFileCacheSize(minimumfilecachesize: Long, maximumfilecachesize: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_UnregisterBadMemoryNotification(registrationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_VirtualAlloc(lpaddress: Long, dwsize: Long, flallocationtype: Int, flprotect: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_VirtualAlloc2(process: Long, baseaddress: Long, size: Long, allocationtype: Int, pageprotection: Int, extendedparameters: Long, parametercount: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_VirtualAlloc2FromApp(process: Long, baseaddress: Long, size: Long, allocationtype: Int, pageprotection: Int, extendedparameters: Long, parametercount: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_VirtualAllocEx(hprocess: Long, lpaddress: Long, dwsize: Long, flallocationtype: Int, flprotect: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_VirtualAllocExNuma(hprocess: Long, lpaddress: Long, dwsize: Long, flallocationtype: Int, flprotect: Int, nndpreferred: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_VirtualAllocFromApp(baseaddress: Long, size: Long, allocationtype: Int, protection: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_VirtualFree(lpaddress: Long, dwsize: Long, dwfreetype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_VirtualFreeEx(hprocess: Long, lpaddress: Long, dwsize: Long, dwfreetype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_VirtualLock(lpaddress: Long, dwsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_VirtualProtect(lpaddress: Long, dwsize: Long, flnewprotect: Int, lpfloldprotect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_VirtualProtectEx(hprocess: Long, lpaddress: Long, dwsize: Long, flnewprotect: Int, lpfloldprotect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_VirtualProtectFromApp(address: Long, size: Long, newprotection: Int, oldprotection: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_VirtualQuery(lpaddress: Long, lpbuffer: Long, dwlength: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_VirtualQueryEx(hprocess: Long, lpaddress: Long, lpbuffer: Long, dwlength: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_VirtualUnlock(lpaddress: Long, dwsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_VirtualUnlockEx(process: Long, address: Long, size: Long): Int
}

public actual fun AddSecureMemoryCacheCallback(pfncallback: PSECURE_MEMORY_CACHE_CALLBACK): BOOL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_AddSecureMemoryCacheCallback(pfncallback.toLong())

public actual fun AllocateUserPhysicalPages(hprocess: HANDLE, numberofpages: Long, pagearray: Long): BOOL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_AllocateUserPhysicalPages(hprocess, numberofpages, pagearray)

public actual fun AllocateUserPhysicalPages2(objecthandle: HANDLE, numberofpages: Long, pagearray: Long, extendedparameters: Long, extendedparametercount: UInt): BOOL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_AllocateUserPhysicalPages2(objecthandle, numberofpages, pagearray, extendedparameters, extendedparametercount.toInt())

public actual fun AllocateUserPhysicalPagesNuma(hprocess: HANDLE, numberofpages: Long, pagearray: Long, nndpreferred: UInt): BOOL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_AllocateUserPhysicalPagesNuma(hprocess, numberofpages, pagearray, nndpreferred.toInt())

public actual fun CreateFileMapping2(file: HANDLE, securityattributes: Long, desiredaccess: UInt, pageprotection: PAGE_PROTECTION_FLAGS, allocationattributes: UInt, maximumsize: ULong, name: PCWSTR, extendedparameters: Long, parametercount: UInt): HANDLE =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_CreateFileMapping2(file, securityattributes, desiredaccess.toInt(), pageprotection.toInt(), allocationattributes.toInt(), maximumsize.toLong(), name, extendedparameters, parametercount.toInt())

public actual fun CreateFileMappingA(hfile: HANDLE, lpfilemappingattributes: Long, flprotect: PAGE_PROTECTION_FLAGS, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: PCSTR): HANDLE =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_CreateFileMappingA(hfile, lpfilemappingattributes, flprotect.toInt(), dwmaximumsizehigh.toInt(), dwmaximumsizelow.toInt(), lpname)

public actual fun CreateFileMappingFromApp(hfile: HANDLE, securityattributes: Long, pageprotection: PAGE_PROTECTION_FLAGS, maximumsize: ULong, name: PCWSTR): HANDLE =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_CreateFileMappingFromApp(hfile, securityattributes, pageprotection.toInt(), maximumsize.toLong(), name)

public actual fun CreateFileMappingNumaA(hfile: HANDLE, lpfilemappingattributes: Long, flprotect: PAGE_PROTECTION_FLAGS, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: PCSTR, nndpreferred: UInt): HANDLE =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_CreateFileMappingNumaA(hfile, lpfilemappingattributes, flprotect.toInt(), dwmaximumsizehigh.toInt(), dwmaximumsizelow.toInt(), lpname, nndpreferred.toInt())

public actual fun CreateFileMappingNumaW(hfile: HANDLE, lpfilemappingattributes: Long, flprotect: PAGE_PROTECTION_FLAGS, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: PCWSTR, nndpreferred: UInt): HANDLE =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_CreateFileMappingNumaW(hfile, lpfilemappingattributes, flprotect.toInt(), dwmaximumsizehigh.toInt(), dwmaximumsizelow.toInt(), lpname, nndpreferred.toInt())

public actual fun CreateFileMappingW(hfile: HANDLE, lpfilemappingattributes: Long, flprotect: PAGE_PROTECTION_FLAGS, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: PCWSTR): HANDLE =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_CreateFileMappingW(hfile, lpfilemappingattributes, flprotect.toInt(), dwmaximumsizehigh.toInt(), dwmaximumsizelow.toInt(), lpname)

public actual fun CreateMemoryResourceNotification(notificationtype: MEMORY_RESOURCE_NOTIFICATION_TYPE): HANDLE =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_CreateMemoryResourceNotification(notificationtype)

public actual fun DiscardVirtualMemory(virtualaddress: Long, size: ULong): UInt =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_DiscardVirtualMemory(virtualaddress, size.toLong()).toUInt()

public actual fun FlushViewOfFile(lpbaseaddress: Long, dwnumberofbytestoflush: ULong): BOOL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_FlushViewOfFile(lpbaseaddress, dwnumberofbytestoflush.toLong())

public actual fun FreeUserPhysicalPages(hprocess: HANDLE, numberofpages: Long, pagearray: Long): BOOL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_FreeUserPhysicalPages(hprocess, numberofpages, pagearray)

public actual fun GetLargePageMinimum(): ULong =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_GetLargePageMinimum().toULong()

public actual fun GetMemoryErrorHandlingCapabilities(capabilities: Long): BOOL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_GetMemoryErrorHandlingCapabilities(capabilities)

public actual fun GetProcessHeap(): HANDLE =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_GetProcessHeap()

public actual fun GetProcessHeaps(numberofheaps: UInt, processheaps: Long): UInt =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_GetProcessHeaps(numberofheaps.toInt(), processheaps).toUInt()

public actual fun GetProcessWorkingSetSizeEx(hprocess: HANDLE, lpminimumworkingsetsize: Long, lpmaximumworkingsetsize: Long, flags: Long): BOOL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_GetProcessWorkingSetSizeEx(hprocess, lpminimumworkingsetsize, lpmaximumworkingsetsize, flags)

public actual fun GetSystemFileCacheSize(lpminimumfilecachesize: Long, lpmaximumfilecachesize: Long, lpflags: Long): BOOL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_GetSystemFileCacheSize(lpminimumfilecachesize, lpmaximumfilecachesize, lpflags)

public actual fun GetWriteWatch(dwflags: UInt, lpbaseaddress: Long, dwregionsize: ULong, lpaddresses: Long, lpdwcount: Long, lpdwgranularity: Long): UInt =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_GetWriteWatch(dwflags.toInt(), lpbaseaddress, dwregionsize.toLong(), lpaddresses, lpdwcount, lpdwgranularity).toUInt()

public actual fun GlobalAlloc(uflags: GLOBAL_ALLOC_FLAGS, dwbytes: ULong): HGLOBAL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_GlobalAlloc(uflags.toInt(), dwbytes.toLong())

public actual fun GlobalFlags(hmem: HGLOBAL): UInt =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_GlobalFlags(hmem).toUInt()

public actual fun GlobalHandle(pmem: Long): HGLOBAL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_GlobalHandle(pmem)

public actual fun GlobalLock(hmem: HGLOBAL): Long =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_GlobalLock(hmem)

public actual fun GlobalReAlloc(hmem: HGLOBAL, dwbytes: ULong, uflags: UInt): HGLOBAL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_GlobalReAlloc(hmem, dwbytes.toLong(), uflags.toInt())

public actual fun GlobalSize(hmem: HGLOBAL): ULong =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_GlobalSize(hmem).toULong()

public actual fun GlobalUnlock(hmem: HGLOBAL): BOOL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_GlobalUnlock(hmem)

public actual fun HeapAlloc(hheap: HANDLE, dwflags: HEAP_FLAGS, dwbytes: ULong): Long =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_HeapAlloc(hheap, dwflags.toInt(), dwbytes.toLong())

public actual fun HeapCompact(hheap: HANDLE, dwflags: HEAP_FLAGS): ULong =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_HeapCompact(hheap, dwflags.toInt()).toULong()

public actual fun HeapCreate(floptions: HEAP_FLAGS, dwinitialsize: ULong, dwmaximumsize: ULong): HANDLE =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_HeapCreate(floptions.toInt(), dwinitialsize.toLong(), dwmaximumsize.toLong())

public actual fun HeapDestroy(hheap: HANDLE): BOOL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_HeapDestroy(hheap)

public actual fun HeapFree(hheap: HANDLE, dwflags: HEAP_FLAGS, lpmem: Long): BOOL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_HeapFree(hheap, dwflags.toInt(), lpmem)

public actual fun HeapLock(hheap: HANDLE): BOOL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_HeapLock(hheap)

public actual fun HeapQueryInformation(heaphandle: HANDLE, heapinformationclass: HEAP_INFORMATION_CLASS, heapinformation: Long, heapinformationlength: ULong, returnlength: Long): BOOL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_HeapQueryInformation(heaphandle, heapinformationclass, heapinformation, heapinformationlength.toLong(), returnlength)

public actual fun HeapReAlloc(hheap: HANDLE, dwflags: HEAP_FLAGS, lpmem: Long, dwbytes: ULong): Long =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_HeapReAlloc(hheap, dwflags.toInt(), lpmem, dwbytes.toLong())

public actual fun HeapSetInformation(heaphandle: HANDLE, heapinformationclass: HEAP_INFORMATION_CLASS, heapinformation: Long, heapinformationlength: ULong): BOOL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_HeapSetInformation(heaphandle, heapinformationclass, heapinformation, heapinformationlength.toLong())

public actual fun HeapSize(hheap: HANDLE, dwflags: HEAP_FLAGS, lpmem: Long): ULong =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_HeapSize(hheap, dwflags.toInt(), lpmem).toULong()

public actual fun HeapSummary(hheap: HANDLE, dwflags: UInt, lpsummary: Long): BOOL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_HeapSummary(hheap, dwflags.toInt(), lpsummary)

public actual fun HeapUnlock(hheap: HANDLE): BOOL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_HeapUnlock(hheap)

public actual fun HeapValidate(hheap: HANDLE, dwflags: HEAP_FLAGS, lpmem: Long): BOOL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_HeapValidate(hheap, dwflags.toInt(), lpmem)

public actual fun HeapWalk(hheap: HANDLE, lpentry: Long): BOOL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_HeapWalk(hheap, lpentry)

public actual fun IsBadCodePtr(lpfn: FARPROC): BOOL =
    0

public actual fun IsBadReadPtr(lp: Long, ucb: ULong): BOOL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_IsBadReadPtr(lp, ucb.toLong())

public actual fun IsBadStringPtrA(lpsz: PCSTR, ucchmax: ULong): BOOL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_IsBadStringPtrA(lpsz, ucchmax.toLong())

public actual fun IsBadStringPtrW(lpsz: PCWSTR, ucchmax: ULong): BOOL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_IsBadStringPtrW(lpsz, ucchmax.toLong())

public actual fun IsBadWritePtr(lp: Long, ucb: ULong): BOOL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_IsBadWritePtr(lp, ucb.toLong())

public actual fun LocalAlloc(uflags: LOCAL_ALLOC_FLAGS, ubytes: ULong): HLOCAL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_LocalAlloc(uflags.toInt(), ubytes.toLong())

public actual fun LocalFlags(hmem: HLOCAL): UInt =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_LocalFlags(hmem).toUInt()

public actual fun LocalHandle(pmem: Long): HLOCAL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_LocalHandle(pmem)

public actual fun LocalLock(hmem: HLOCAL): Long =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_LocalLock(hmem)

public actual fun LocalReAlloc(hmem: HLOCAL, ubytes: ULong, uflags: UInt): HLOCAL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_LocalReAlloc(hmem, ubytes.toLong(), uflags.toInt())

public actual fun LocalSize(hmem: HLOCAL): ULong =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_LocalSize(hmem).toULong()

public actual fun LocalUnlock(hmem: HLOCAL): BOOL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_LocalUnlock(hmem)

public actual fun MapUserPhysicalPages(virtualaddress: Long, numberofpages: ULong, pagearray: Long): BOOL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_MapUserPhysicalPages(virtualaddress, numberofpages.toLong(), pagearray)

public actual fun MapUserPhysicalPagesScatter(virtualaddresses: Long, numberofpages: ULong, pagearray: Long): BOOL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_MapUserPhysicalPagesScatter(virtualaddresses, numberofpages.toLong(), pagearray)

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
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_OfferVirtualMemory(virtualaddress, size.toLong(), priority).toUInt()

public actual fun OpenDedicatedMemoryPartition(partition: HANDLE, dedicatedmemorytypeid: ULong, desiredaccess: UInt, inherithandle: BOOL): HANDLE =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_OpenDedicatedMemoryPartition(partition, dedicatedmemorytypeid.toLong(), desiredaccess.toInt(), inherithandle)

public actual fun OpenFileMappingA(dwdesiredaccess: UInt, binherithandle: BOOL, lpname: PCSTR): HANDLE =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_OpenFileMappingA(dwdesiredaccess.toInt(), binherithandle, lpname)

public actual fun OpenFileMappingFromApp(desiredaccess: UInt, inherithandle: BOOL, name: PCWSTR): HANDLE =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_OpenFileMappingFromApp(desiredaccess.toInt(), inherithandle, name)

public actual fun OpenFileMappingW(dwdesiredaccess: UInt, binherithandle: BOOL, lpname: PCWSTR): HANDLE =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_OpenFileMappingW(dwdesiredaccess.toInt(), binherithandle, lpname)

public actual fun PrefetchVirtualMemory(hprocess: HANDLE, numberofentries: ULong, virtualaddresses: Long, flags: UInt): BOOL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_PrefetchVirtualMemory(hprocess, numberofentries.toLong(), virtualaddresses, flags.toInt())

public actual fun QueryMemoryResourceNotification(resourcenotificationhandle: HANDLE, resourcestate: Long): BOOL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_QueryMemoryResourceNotification(resourcenotificationhandle, resourcestate)

public actual fun QueryPartitionInformation(partition: HANDLE, partitioninformationclass: WIN32_MEMORY_PARTITION_INFORMATION_CLASS, partitioninformation: Long, partitioninformationlength: UInt): BOOL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_QueryPartitionInformation(partition, partitioninformationclass, partitioninformation, partitioninformationlength.toInt())

public actual fun QueryVirtualMemoryInformation(process: HANDLE, virtualaddress: Long, memoryinformationclass: WIN32_MEMORY_INFORMATION_CLASS, memoryinformation: Long, memoryinformationsize: ULong, returnsize: Long): BOOL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_QueryVirtualMemoryInformation(process, virtualaddress, memoryinformationclass, memoryinformation, memoryinformationsize.toLong(), returnsize)

public actual fun ReclaimVirtualMemory(virtualaddress: Long, size: ULong): UInt =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_ReclaimVirtualMemory(virtualaddress, size.toLong()).toUInt()

public actual fun RegisterBadMemoryNotification(callback: PBAD_MEMORY_CALLBACK_ROUTINE): Long =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_RegisterBadMemoryNotification(callback.toLong())

public actual fun RemoveSecureMemoryCacheCallback(pfncallback: PSECURE_MEMORY_CACHE_CALLBACK): BOOL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_RemoveSecureMemoryCacheCallback(pfncallback.toLong())

public actual fun ResetWriteWatch(lpbaseaddress: Long, dwregionsize: ULong): UInt =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_ResetWriteWatch(lpbaseaddress, dwregionsize.toLong()).toUInt()

public actual fun RtlCompareMemory(source1: Long, source2: Long, length: ULong): ULong =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_RtlCompareMemory(source1, source2, length.toLong()).toULong()

public actual fun RtlCrc32(buffer: Long, size: ULong, initialcrc: UInt): UInt =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_RtlCrc32(buffer, size.toLong(), initialcrc.toInt()).toUInt()

public actual fun RtlCrc64(buffer: Long, size: ULong, initialcrc: ULong): ULong =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_RtlCrc64(buffer, size.toLong(), initialcrc.toLong()).toULong()

public actual fun RtlIsZeroMemory(buffer: Long, length: ULong): Boolean =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_RtlIsZeroMemory(buffer, length.toLong())

public actual fun SetProcessValidCallTargets(hprocess: HANDLE, virtualaddress: Long, regionsize: ULong, numberofoffsets: UInt, offsetinformation: Long): BOOL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_SetProcessValidCallTargets(hprocess, virtualaddress, regionsize.toLong(), numberofoffsets.toInt(), offsetinformation)

public actual fun SetProcessValidCallTargetsForMappedView(process: HANDLE, virtualaddress: Long, regionsize: ULong, numberofoffsets: UInt, offsetinformation: Long, section: HANDLE, expectedfileoffset: ULong): BOOL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_SetProcessValidCallTargetsForMappedView(process, virtualaddress, regionsize.toLong(), numberofoffsets.toInt(), offsetinformation, section, expectedfileoffset.toLong())

public actual fun SetProcessWorkingSetSizeEx(hprocess: HANDLE, dwminimumworkingsetsize: ULong, dwmaximumworkingsetsize: ULong, flags: SETPROCESSWORKINGSETSIZEEX_FLAGS): BOOL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_SetProcessWorkingSetSizeEx(hprocess, dwminimumworkingsetsize.toLong(), dwmaximumworkingsetsize.toLong(), flags.toInt())

public actual fun SetSystemFileCacheSize(minimumfilecachesize: ULong, maximumfilecachesize: ULong, flags: UInt): BOOL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_SetSystemFileCacheSize(minimumfilecachesize.toLong(), maximumfilecachesize.toLong(), flags.toInt())

public actual fun UnmapViewOfFile(lpbaseaddress: MEMORY_MAPPED_VIEW_ADDRESS): BOOL =
    0

public actual fun UnmapViewOfFile2(process: HANDLE, baseaddress: MEMORY_MAPPED_VIEW_ADDRESS, unmapflags: UNMAP_VIEW_OF_FILE_FLAGS): BOOL =
    0

public actual fun UnmapViewOfFileEx(baseaddress: MEMORY_MAPPED_VIEW_ADDRESS, unmapflags: UNMAP_VIEW_OF_FILE_FLAGS): BOOL =
    0

public actual fun UnregisterBadMemoryNotification(registrationhandle: Long): BOOL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_UnregisterBadMemoryNotification(registrationhandle)

public actual fun VirtualAlloc(lpaddress: Long, dwsize: ULong, flallocationtype: VIRTUAL_ALLOCATION_TYPE, flprotect: PAGE_PROTECTION_FLAGS): Long =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_VirtualAlloc(lpaddress, dwsize.toLong(), flallocationtype.toInt(), flprotect.toInt())

public actual fun VirtualAlloc2(process: HANDLE, baseaddress: Long, size: ULong, allocationtype: VIRTUAL_ALLOCATION_TYPE, pageprotection: UInt, extendedparameters: Long, parametercount: UInt): Long =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_VirtualAlloc2(process, baseaddress, size.toLong(), allocationtype.toInt(), pageprotection.toInt(), extendedparameters, parametercount.toInt())

public actual fun VirtualAlloc2FromApp(process: HANDLE, baseaddress: Long, size: ULong, allocationtype: VIRTUAL_ALLOCATION_TYPE, pageprotection: UInt, extendedparameters: Long, parametercount: UInt): Long =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_VirtualAlloc2FromApp(process, baseaddress, size.toLong(), allocationtype.toInt(), pageprotection.toInt(), extendedparameters, parametercount.toInt())

public actual fun VirtualAllocEx(hprocess: HANDLE, lpaddress: Long, dwsize: ULong, flallocationtype: VIRTUAL_ALLOCATION_TYPE, flprotect: PAGE_PROTECTION_FLAGS): Long =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_VirtualAllocEx(hprocess, lpaddress, dwsize.toLong(), flallocationtype.toInt(), flprotect.toInt())

public actual fun VirtualAllocExNuma(hprocess: HANDLE, lpaddress: Long, dwsize: ULong, flallocationtype: VIRTUAL_ALLOCATION_TYPE, flprotect: UInt, nndpreferred: UInt): Long =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_VirtualAllocExNuma(hprocess, lpaddress, dwsize.toLong(), flallocationtype.toInt(), flprotect.toInt(), nndpreferred.toInt())

public actual fun VirtualAllocFromApp(baseaddress: Long, size: ULong, allocationtype: VIRTUAL_ALLOCATION_TYPE, protection: UInt): Long =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_VirtualAllocFromApp(baseaddress, size.toLong(), allocationtype.toInt(), protection.toInt())

public actual fun VirtualFree(lpaddress: Long, dwsize: ULong, dwfreetype: VIRTUAL_FREE_TYPE): BOOL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_VirtualFree(lpaddress, dwsize.toLong(), dwfreetype.toInt())

public actual fun VirtualFreeEx(hprocess: HANDLE, lpaddress: Long, dwsize: ULong, dwfreetype: VIRTUAL_FREE_TYPE): BOOL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_VirtualFreeEx(hprocess, lpaddress, dwsize.toLong(), dwfreetype.toInt())

public actual fun VirtualLock(lpaddress: Long, dwsize: ULong): BOOL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_VirtualLock(lpaddress, dwsize.toLong())

public actual fun VirtualProtect(lpaddress: Long, dwsize: ULong, flnewprotect: PAGE_PROTECTION_FLAGS, lpfloldprotect: Long): BOOL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_VirtualProtect(lpaddress, dwsize.toLong(), flnewprotect.toInt(), lpfloldprotect)

public actual fun VirtualProtectEx(hprocess: HANDLE, lpaddress: Long, dwsize: ULong, flnewprotect: PAGE_PROTECTION_FLAGS, lpfloldprotect: Long): BOOL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_VirtualProtectEx(hprocess, lpaddress, dwsize.toLong(), flnewprotect.toInt(), lpfloldprotect)

public actual fun VirtualProtectFromApp(address: Long, size: ULong, newprotection: UInt, oldprotection: Long): BOOL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_VirtualProtectFromApp(address, size.toLong(), newprotection.toInt(), oldprotection)

public actual fun VirtualQuery(lpaddress: Long, lpbuffer: Long, dwlength: ULong): ULong =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_VirtualQuery(lpaddress, lpbuffer, dwlength.toLong()).toULong()

public actual fun VirtualQueryEx(hprocess: HANDLE, lpaddress: Long, lpbuffer: Long, dwlength: ULong): ULong =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_VirtualQueryEx(hprocess, lpaddress, lpbuffer, dwlength.toLong()).toULong()

public actual fun VirtualUnlock(lpaddress: Long, dwsize: ULong): BOOL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_VirtualUnlock(lpaddress, dwsize.toLong())

public actual fun VirtualUnlockEx(process: HANDLE, address: Long, size: ULong): BOOL =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_VirtualUnlockEx(process, address, size.toLong())
