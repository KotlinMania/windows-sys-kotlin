@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.memory

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Farproc
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hglobal
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hlocal

private object WindowsWin32SystemMemoryJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_addSecureMemoryCacheCallback(pfncallback: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_allocateUserPhysicalPages(hprocess: Long, numberofpages: Long, pagearray: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_allocateUserPhysicalPages2(objecthandle: Long, numberofpages: Long, pagearray: Long, extendedparameters: Long, extendedparametercount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_allocateUserPhysicalPagesNuma(hprocess: Long, numberofpages: Long, pagearray: Long, nndpreferred: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_createFileMapping2(file: Long, securityattributes: Long, desiredaccess: Int, pageprotection: Int, allocationattributes: Int, maximumsize: Long, name: Long, extendedparameters: Long, parametercount: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_createFileMappingA(hfile: Long, lpfilemappingattributes: Long, flprotect: Int, dwmaximumsizehigh: Int, dwmaximumsizelow: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_createFileMappingFromApp(hfile: Long, securityattributes: Long, pageprotection: Int, maximumsize: Long, name: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_createFileMappingNumaA(hfile: Long, lpfilemappingattributes: Long, flprotect: Int, dwmaximumsizehigh: Int, dwmaximumsizelow: Int, lpname: Long, nndpreferred: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_createFileMappingNumaW(hfile: Long, lpfilemappingattributes: Long, flprotect: Int, dwmaximumsizehigh: Int, dwmaximumsizelow: Int, lpname: Long, nndpreferred: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_createFileMappingW(hfile: Long, lpfilemappingattributes: Long, flprotect: Int, dwmaximumsizehigh: Int, dwmaximumsizelow: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_createMemoryResourceNotification(notificationtype: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_discardVirtualMemory(virtualaddress: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_flushViewOfFile(lpbaseaddress: Long, dwnumberofbytestoflush: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_freeUserPhysicalPages(hprocess: Long, numberofpages: Long, pagearray: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_getLargePageMinimum(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_getMemoryErrorHandlingCapabilities(capabilities: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_getProcessHeap(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_getProcessHeaps(numberofheaps: Int, processheaps: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_getProcessWorkingSetSizeEx(hprocess: Long, lpminimumworkingsetsize: Long, lpmaximumworkingsetsize: Long, flags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_getSystemFileCacheSize(lpminimumfilecachesize: Long, lpmaximumfilecachesize: Long, lpflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_getWriteWatch(dwflags: Int, lpbaseaddress: Long, dwregionsize: Long, lpaddresses: Long, lpdwcount: Long, lpdwgranularity: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_globalAlloc(uflags: Int, dwbytes: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_globalFlags(hmem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_globalHandle(pmem: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_globalLock(hmem: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_globalReAlloc(hmem: Long, dwbytes: Long, uflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_globalSize(hmem: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_globalUnlock(hmem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_heapAlloc(hheap: Long, dwflags: Int, dwbytes: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_heapCompact(hheap: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_heapCreate(floptions: Int, dwinitialsize: Long, dwmaximumsize: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_heapDestroy(hheap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_heapFree(hheap: Long, dwflags: Int, lpmem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_heapLock(hheap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_heapQueryInformation(heaphandle: Long, heapinformationclass: Int, heapinformation: Long, heapinformationlength: Long, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_heapReAlloc(hheap: Long, dwflags: Int, lpmem: Long, dwbytes: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_heapSetInformation(heaphandle: Long, heapinformationclass: Int, heapinformation: Long, heapinformationlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_heapSize(hheap: Long, dwflags: Int, lpmem: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_heapSummary(hheap: Long, dwflags: Int, lpsummary: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_heapUnlock(hheap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_heapValidate(hheap: Long, dwflags: Int, lpmem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_heapWalk(hheap: Long, lpentry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_isBadReadPtr(lp: Long, ucb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_isBadStringPtrA(lpsz: Long, ucchmax: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_isBadStringPtrW(lpsz: Long, ucchmax: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_isBadWritePtr(lp: Long, ucb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_localAlloc(uflags: Int, ubytes: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_localFlags(hmem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_localHandle(pmem: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_localLock(hmem: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_localReAlloc(hmem: Long, ubytes: Long, uflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_localSize(hmem: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_localUnlock(hmem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_mapUserPhysicalPages(virtualaddress: Long, numberofpages: Long, pagearray: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_mapUserPhysicalPagesScatter(virtualaddresses: Long, numberofpages: Long, pagearray: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_offerVirtualMemory(virtualaddress: Long, size: Long, priority: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_openDedicatedMemoryPartition(partition: Long, dedicatedmemorytypeid: Long, desiredaccess: Int, inherithandle: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_openFileMappingA(dwdesiredaccess: Int, binherithandle: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_openFileMappingFromApp(desiredaccess: Int, inherithandle: Int, name: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_openFileMappingW(dwdesiredaccess: Int, binherithandle: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_prefetchVirtualMemory(hprocess: Long, numberofentries: Long, virtualaddresses: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_queryMemoryResourceNotification(resourcenotificationhandle: Long, resourcestate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_queryPartitionInformation(partition: Long, partitioninformationclass: Int, partitioninformation: Long, partitioninformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_queryVirtualMemoryInformation(process: Long, virtualaddress: Long, memoryinformationclass: Int, memoryinformation: Long, memoryinformationsize: Long, returnsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_reclaimVirtualMemory(virtualaddress: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_registerBadMemoryNotification(callback: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_removeSecureMemoryCacheCallback(pfncallback: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_resetWriteWatch(lpbaseaddress: Long, dwregionsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_rtlCompareMemory(source1: Long, source2: Long, length: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_rtlCrc32(buffer: Long, size: Long, initialcrc: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_rtlCrc64(buffer: Long, size: Long, initialcrc: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_rtlIsZeroMemory(buffer: Long, length: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_setProcessValidCallTargets(hprocess: Long, virtualaddress: Long, regionsize: Long, numberofoffsets: Int, offsetinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_setProcessValidCallTargetsForMappedView(process: Long, virtualaddress: Long, regionsize: Long, numberofoffsets: Int, offsetinformation: Long, section: Long, expectedfileoffset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_setProcessWorkingSetSizeEx(hprocess: Long, dwminimumworkingsetsize: Long, dwmaximumworkingsetsize: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_setSystemFileCacheSize(minimumfilecachesize: Long, maximumfilecachesize: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_unregisterBadMemoryNotification(registrationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_virtualAlloc(lpaddress: Long, dwsize: Long, flallocationtype: Int, flprotect: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_virtualAlloc2(process: Long, baseaddress: Long, size: Long, allocationtype: Int, pageprotection: Int, extendedparameters: Long, parametercount: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_virtualAlloc2FromApp(process: Long, baseaddress: Long, size: Long, allocationtype: Int, pageprotection: Int, extendedparameters: Long, parametercount: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_virtualAllocEx(hprocess: Long, lpaddress: Long, dwsize: Long, flallocationtype: Int, flprotect: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_virtualAllocExNuma(hprocess: Long, lpaddress: Long, dwsize: Long, flallocationtype: Int, flprotect: Int, nndpreferred: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_virtualAllocFromApp(baseaddress: Long, size: Long, allocationtype: Int, protection: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_virtualFree(lpaddress: Long, dwsize: Long, dwfreetype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_virtualFreeEx(hprocess: Long, lpaddress: Long, dwsize: Long, dwfreetype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_virtualLock(lpaddress: Long, dwsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_virtualProtect(lpaddress: Long, dwsize: Long, flnewprotect: Int, lpfloldprotect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_virtualProtectEx(hprocess: Long, lpaddress: Long, dwsize: Long, flnewprotect: Int, lpfloldprotect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_virtualProtectFromApp(address: Long, size: Long, newprotection: Int, oldprotection: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_virtualQuery(lpaddress: Long, lpbuffer: Long, dwlength: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_virtualQueryEx(hprocess: Long, lpaddress: Long, lpbuffer: Long, dwlength: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_virtualUnlock(lpaddress: Long, dwsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_virtualUnlockEx(process: Long, address: Long, size: Long): Int
}

public actual fun addSecureMemoryCacheCallback(pfncallback: PsecureMemoryCacheCallback): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_addSecureMemoryCacheCallback(0L)

public actual fun allocateUserPhysicalPages(hprocess: Handle, numberofpages: COpaquePointer?, pagearray: COpaquePointer?): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_allocateUserPhysicalPages((hprocess?.value ?: 0L), (numberofpages?.value ?: 0L), (pagearray?.value ?: 0L))

public actual fun allocateUserPhysicalPages2(objecthandle: Handle, numberofpages: COpaquePointer?, pagearray: COpaquePointer?, extendedparameters: COpaquePointer?, extendedparametercount: UInt): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_allocateUserPhysicalPages2((objecthandle?.value ?: 0L), (numberofpages?.value ?: 0L), (pagearray?.value ?: 0L), (extendedparameters?.value ?: 0L), extendedparametercount.toInt())

public actual fun allocateUserPhysicalPagesNuma(hprocess: Handle, numberofpages: COpaquePointer?, pagearray: COpaquePointer?, nndpreferred: UInt): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_allocateUserPhysicalPagesNuma((hprocess?.value ?: 0L), (numberofpages?.value ?: 0L), (pagearray?.value ?: 0L), nndpreferred.toInt())

public actual fun createFileMapping2(file: Handle, securityattributes: COpaquePointer?, desiredaccess: UInt, pageprotection: PageProtectionFlags, allocationattributes: UInt, maximumsize: ULong, name: Pcwstr, extendedparameters: COpaquePointer?, parametercount: UInt): Handle =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_createFileMapping2((file?.value ?: 0L), (securityattributes?.value ?: 0L), desiredaccess.toInt(), pageprotection.toInt(), allocationattributes.toInt(), maximumsize.toLong(), (name?.value ?: 0L), (extendedparameters?.value ?: 0L), parametercount.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createFileMappingA(hfile: Handle, lpfilemappingattributes: COpaquePointer?, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcstr): Handle =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_createFileMappingA((hfile?.value ?: 0L), (lpfilemappingattributes?.value ?: 0L), flprotect.toInt(), dwmaximumsizehigh.toInt(), dwmaximumsizelow.toInt(), (lpname?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createFileMappingFromApp(hfile: Handle, securityattributes: COpaquePointer?, pageprotection: PageProtectionFlags, maximumsize: ULong, name: Pcwstr): Handle =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_createFileMappingFromApp((hfile?.value ?: 0L), (securityattributes?.value ?: 0L), pageprotection.toInt(), maximumsize.toLong(), (name?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createFileMappingNumaA(hfile: Handle, lpfilemappingattributes: COpaquePointer?, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcstr, nndpreferred: UInt): Handle =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_createFileMappingNumaA((hfile?.value ?: 0L), (lpfilemappingattributes?.value ?: 0L), flprotect.toInt(), dwmaximumsizehigh.toInt(), dwmaximumsizelow.toInt(), (lpname?.value ?: 0L), nndpreferred.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createFileMappingNumaW(hfile: Handle, lpfilemappingattributes: COpaquePointer?, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcwstr, nndpreferred: UInt): Handle =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_createFileMappingNumaW((hfile?.value ?: 0L), (lpfilemappingattributes?.value ?: 0L), flprotect.toInt(), dwmaximumsizehigh.toInt(), dwmaximumsizelow.toInt(), (lpname?.value ?: 0L), nndpreferred.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createFileMappingW(hfile: Handle, lpfilemappingattributes: COpaquePointer?, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcwstr): Handle =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_createFileMappingW((hfile?.value ?: 0L), (lpfilemappingattributes?.value ?: 0L), flprotect.toInt(), dwmaximumsizehigh.toInt(), dwmaximumsizelow.toInt(), (lpname?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createMemoryResourceNotification(notificationtype: MemoryResourceNotificationType): Handle =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_createMemoryResourceNotification(notificationtype).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun discardVirtualMemory(virtualaddress: COpaquePointer?, size: ULong): UInt =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_discardVirtualMemory((virtualaddress?.value ?: 0L), size.toLong()).toUInt()

public actual fun flushViewOfFile(lpbaseaddress: COpaquePointer?, dwnumberofbytestoflush: ULong): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_flushViewOfFile((lpbaseaddress?.value ?: 0L), dwnumberofbytestoflush.toLong())

public actual fun freeUserPhysicalPages(hprocess: Handle, numberofpages: COpaquePointer?, pagearray: COpaquePointer?): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_freeUserPhysicalPages((hprocess?.value ?: 0L), (numberofpages?.value ?: 0L), (pagearray?.value ?: 0L))

public actual fun getLargePageMinimum(): ULong =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_getLargePageMinimum().toULong()

public actual fun getMemoryErrorHandlingCapabilities(capabilities: COpaquePointer?): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_getMemoryErrorHandlingCapabilities((capabilities?.value ?: 0L))

public actual fun getProcessHeap(): Handle =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_getProcessHeap().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getProcessHeaps(numberofheaps: UInt, processheaps: COpaquePointer?): UInt =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_getProcessHeaps(numberofheaps.toInt(), (processheaps?.value ?: 0L)).toUInt()

public actual fun getProcessWorkingSetSizeEx(hprocess: Handle, lpminimumworkingsetsize: COpaquePointer?, lpmaximumworkingsetsize: COpaquePointer?, flags: COpaquePointer?): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_getProcessWorkingSetSizeEx((hprocess?.value ?: 0L), (lpminimumworkingsetsize?.value ?: 0L), (lpmaximumworkingsetsize?.value ?: 0L), (flags?.value ?: 0L))

public actual fun getSystemFileCacheSize(lpminimumfilecachesize: COpaquePointer?, lpmaximumfilecachesize: COpaquePointer?, lpflags: COpaquePointer?): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_getSystemFileCacheSize((lpminimumfilecachesize?.value ?: 0L), (lpmaximumfilecachesize?.value ?: 0L), (lpflags?.value ?: 0L))

public actual fun getWriteWatch(dwflags: UInt, lpbaseaddress: COpaquePointer?, dwregionsize: ULong, lpaddresses: COpaquePointer?, lpdwcount: COpaquePointer?, lpdwgranularity: COpaquePointer?): UInt =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_getWriteWatch(dwflags.toInt(), (lpbaseaddress?.value ?: 0L), dwregionsize.toLong(), (lpaddresses?.value ?: 0L), (lpdwcount?.value ?: 0L), (lpdwgranularity?.value ?: 0L)).toUInt()

public actual fun globalAlloc(uflags: GlobalAllocFlags, dwbytes: ULong): Hglobal =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_globalAlloc(uflags.toInt(), dwbytes.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun globalFlags(hmem: Hglobal): UInt =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_globalFlags((hmem?.value ?: 0L)).toUInt()

public actual fun globalHandle(pmem: COpaquePointer?): Hglobal =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_globalHandle((pmem?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun globalLock(hmem: Hglobal): COpaquePointer? =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_globalLock((hmem?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun globalReAlloc(hmem: Hglobal, dwbytes: ULong, uflags: UInt): Hglobal =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_globalReAlloc((hmem?.value ?: 0L), dwbytes.toLong(), uflags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun globalSize(hmem: Hglobal): ULong =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_globalSize((hmem?.value ?: 0L)).toULong()

public actual fun globalUnlock(hmem: Hglobal): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_globalUnlock((hmem?.value ?: 0L))

public actual fun heapAlloc(hheap: Handle, dwflags: HeapFlags, dwbytes: ULong): COpaquePointer? =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_heapAlloc((hheap?.value ?: 0L), dwflags.toInt(), dwbytes.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun heapCompact(hheap: Handle, dwflags: HeapFlags): ULong =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_heapCompact((hheap?.value ?: 0L), dwflags.toInt()).toULong()

public actual fun heapCreate(floptions: HeapFlags, dwinitialsize: ULong, dwmaximumsize: ULong): Handle =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_heapCreate(floptions.toInt(), dwinitialsize.toLong(), dwmaximumsize.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun heapDestroy(hheap: Handle): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_heapDestroy((hheap?.value ?: 0L))

public actual fun heapFree(hheap: Handle, dwflags: HeapFlags, lpmem: COpaquePointer?): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_heapFree((hheap?.value ?: 0L), dwflags.toInt(), (lpmem?.value ?: 0L))

public actual fun heapLock(hheap: Handle): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_heapLock((hheap?.value ?: 0L))

public actual fun heapQueryInformation(heaphandle: Handle, heapinformationclass: HeapInformationClass, heapinformation: COpaquePointer?, heapinformationlength: ULong, returnlength: COpaquePointer?): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_heapQueryInformation((heaphandle?.value ?: 0L), heapinformationclass, (heapinformation?.value ?: 0L), heapinformationlength.toLong(), (returnlength?.value ?: 0L))

public actual fun heapReAlloc(hheap: Handle, dwflags: HeapFlags, lpmem: COpaquePointer?, dwbytes: ULong): COpaquePointer? =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_heapReAlloc((hheap?.value ?: 0L), dwflags.toInt(), (lpmem?.value ?: 0L), dwbytes.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun heapSetInformation(heaphandle: Handle, heapinformationclass: HeapInformationClass, heapinformation: COpaquePointer?, heapinformationlength: ULong): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_heapSetInformation((heaphandle?.value ?: 0L), heapinformationclass, (heapinformation?.value ?: 0L), heapinformationlength.toLong())

public actual fun heapSize(hheap: Handle, dwflags: HeapFlags, lpmem: COpaquePointer?): ULong =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_heapSize((hheap?.value ?: 0L), dwflags.toInt(), (lpmem?.value ?: 0L)).toULong()

public actual fun heapSummary(hheap: Handle, dwflags: UInt, lpsummary: COpaquePointer?): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_heapSummary((hheap?.value ?: 0L), dwflags.toInt(), (lpsummary?.value ?: 0L))

public actual fun heapUnlock(hheap: Handle): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_heapUnlock((hheap?.value ?: 0L))

public actual fun heapValidate(hheap: Handle, dwflags: HeapFlags, lpmem: COpaquePointer?): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_heapValidate((hheap?.value ?: 0L), dwflags.toInt(), (lpmem?.value ?: 0L))

public actual fun heapWalk(hheap: Handle, lpentry: COpaquePointer?): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_heapWalk((hheap?.value ?: 0L), (lpentry?.value ?: 0L))

public actual fun isBadCodePtr(lpfn: Farproc): Bool =
    0

public actual fun isBadReadPtr(lp: COpaquePointer?, ucb: ULong): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_isBadReadPtr((lp?.value ?: 0L), ucb.toLong())

public actual fun isBadStringPtrA(lpsz: Pcstr, ucchmax: ULong): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_isBadStringPtrA((lpsz?.value ?: 0L), ucchmax.toLong())

public actual fun isBadStringPtrW(lpsz: Pcwstr, ucchmax: ULong): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_isBadStringPtrW((lpsz?.value ?: 0L), ucchmax.toLong())

public actual fun isBadWritePtr(lp: COpaquePointer?, ucb: ULong): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_isBadWritePtr((lp?.value ?: 0L), ucb.toLong())

public actual fun localAlloc(uflags: LocalAllocFlags, ubytes: ULong): Hlocal =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_localAlloc(uflags.toInt(), ubytes.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun localFlags(hmem: Hlocal): UInt =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_localFlags((hmem?.value ?: 0L)).toUInt()

public actual fun localHandle(pmem: COpaquePointer?): Hlocal =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_localHandle((pmem?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun localLock(hmem: Hlocal): COpaquePointer? =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_localLock((hmem?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun localReAlloc(hmem: Hlocal, ubytes: ULong, uflags: UInt): Hlocal =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_localReAlloc((hmem?.value ?: 0L), ubytes.toLong(), uflags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun localSize(hmem: Hlocal): ULong =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_localSize((hmem?.value ?: 0L)).toULong()

public actual fun localUnlock(hmem: Hlocal): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_localUnlock((hmem?.value ?: 0L))

public actual fun mapUserPhysicalPages(virtualaddress: COpaquePointer?, numberofpages: ULong, pagearray: COpaquePointer?): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_mapUserPhysicalPages((virtualaddress?.value ?: 0L), numberofpages.toLong(), (pagearray?.value ?: 0L))

public actual fun mapUserPhysicalPagesScatter(virtualaddresses: COpaquePointer?, numberofpages: ULong, pagearray: COpaquePointer?): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_mapUserPhysicalPagesScatter((virtualaddresses?.value ?: 0L), numberofpages.toLong(), (pagearray?.value ?: 0L))

public actual fun mapViewOfFile(hfilemappingobject: Handle, dwdesiredaccess: FileMap, dwfileoffsethigh: UInt, dwfileoffsetlow: UInt, dwnumberofbytestomap: ULong): MemoryMappedViewAddress =
    MemoryMappedViewAddress()

public actual fun mapViewOfFile3(filemapping: Handle, process: Handle, baseaddress: COpaquePointer?, offset: ULong, viewsize: ULong, allocationtype: VirtualAllocationType, pageprotection: UInt, extendedparameters: COpaquePointer?, parametercount: UInt): MemoryMappedViewAddress =
    MemoryMappedViewAddress()

public actual fun mapViewOfFile3FromApp(filemapping: Handle, process: Handle, baseaddress: COpaquePointer?, offset: ULong, viewsize: ULong, allocationtype: VirtualAllocationType, pageprotection: UInt, extendedparameters: COpaquePointer?, parametercount: UInt): MemoryMappedViewAddress =
    MemoryMappedViewAddress()

public actual fun mapViewOfFileEx(hfilemappingobject: Handle, dwdesiredaccess: FileMap, dwfileoffsethigh: UInt, dwfileoffsetlow: UInt, dwnumberofbytestomap: ULong, lpbaseaddress: COpaquePointer?): MemoryMappedViewAddress =
    MemoryMappedViewAddress()

public actual fun mapViewOfFileExNuma(hfilemappingobject: Handle, dwdesiredaccess: FileMap, dwfileoffsethigh: UInt, dwfileoffsetlow: UInt, dwnumberofbytestomap: ULong, lpbaseaddress: COpaquePointer?, nndpreferred: UInt): MemoryMappedViewAddress =
    MemoryMappedViewAddress()

public actual fun mapViewOfFileFromApp(hfilemappingobject: Handle, desiredaccess: FileMap, fileoffset: ULong, numberofbytestomap: ULong): MemoryMappedViewAddress =
    MemoryMappedViewAddress()

public actual fun mapViewOfFileNuma2(filemappinghandle: Handle, processhandle: Handle, offset: ULong, baseaddress: COpaquePointer?, viewsize: ULong, allocationtype: UInt, pageprotection: UInt, preferrednode: UInt): MemoryMappedViewAddress =
    MemoryMappedViewAddress()

public actual fun offerVirtualMemory(virtualaddress: COpaquePointer?, size: ULong, priority: OfferPriority): UInt =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_offerVirtualMemory((virtualaddress?.value ?: 0L), size.toLong(), priority).toUInt()

public actual fun openDedicatedMemoryPartition(partition: Handle, dedicatedmemorytypeid: ULong, desiredaccess: UInt, inherithandle: Bool): Handle =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_openDedicatedMemoryPartition((partition?.value ?: 0L), dedicatedmemorytypeid.toLong(), desiredaccess.toInt(), inherithandle).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun openFileMappingA(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcstr): Handle =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_openFileMappingA(dwdesiredaccess.toInt(), binherithandle, (lpname?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun openFileMappingFromApp(desiredaccess: UInt, inherithandle: Bool, name: Pcwstr): Handle =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_openFileMappingFromApp(desiredaccess.toInt(), inherithandle, (name?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun openFileMappingW(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcwstr): Handle =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_openFileMappingW(dwdesiredaccess.toInt(), binherithandle, (lpname?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun prefetchVirtualMemory(hprocess: Handle, numberofentries: ULong, virtualaddresses: COpaquePointer?, flags: UInt): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_prefetchVirtualMemory((hprocess?.value ?: 0L), numberofentries.toLong(), (virtualaddresses?.value ?: 0L), flags.toInt())

public actual fun queryMemoryResourceNotification(resourcenotificationhandle: Handle, resourcestate: COpaquePointer?): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_queryMemoryResourceNotification((resourcenotificationhandle?.value ?: 0L), (resourcestate?.value ?: 0L))

public actual fun queryPartitionInformation(partition: Handle, partitioninformationclass: Win32MemoryPartitionInformationClass, partitioninformation: COpaquePointer?, partitioninformationlength: UInt): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_queryPartitionInformation((partition?.value ?: 0L), partitioninformationclass, (partitioninformation?.value ?: 0L), partitioninformationlength.toInt())

public actual fun queryVirtualMemoryInformation(process: Handle, virtualaddress: COpaquePointer?, memoryinformationclass: Win32MemoryInformationClass, memoryinformation: COpaquePointer?, memoryinformationsize: ULong, returnsize: COpaquePointer?): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_queryVirtualMemoryInformation((process?.value ?: 0L), (virtualaddress?.value ?: 0L), memoryinformationclass, (memoryinformation?.value ?: 0L), memoryinformationsize.toLong(), (returnsize?.value ?: 0L))

public actual fun reclaimVirtualMemory(virtualaddress: COpaquePointer?, size: ULong): UInt =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_reclaimVirtualMemory((virtualaddress?.value ?: 0L), size.toLong()).toUInt()

public actual fun registerBadMemoryNotification(callback: PbadMemoryCallbackRoutine): COpaquePointer? =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_registerBadMemoryNotification(0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun removeSecureMemoryCacheCallback(pfncallback: PsecureMemoryCacheCallback): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_removeSecureMemoryCacheCallback(0L)

public actual fun resetWriteWatch(lpbaseaddress: COpaquePointer?, dwregionsize: ULong): UInt =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_resetWriteWatch((lpbaseaddress?.value ?: 0L), dwregionsize.toLong()).toUInt()

public actual fun rtlCompareMemory(source1: COpaquePointer?, source2: COpaquePointer?, length: ULong): ULong =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_rtlCompareMemory((source1?.value ?: 0L), (source2?.value ?: 0L), length.toLong()).toULong()

public actual fun rtlCrc32(buffer: COpaquePointer?, size: ULong, initialcrc: UInt): UInt =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_rtlCrc32((buffer?.value ?: 0L), size.toLong(), initialcrc.toInt()).toUInt()

public actual fun rtlCrc64(buffer: COpaquePointer?, size: ULong, initialcrc: ULong): ULong =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_rtlCrc64((buffer?.value ?: 0L), size.toLong(), initialcrc.toLong()).toULong()

public actual fun rtlIsZeroMemory(buffer: COpaquePointer?, length: ULong): Boolean =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_rtlIsZeroMemory((buffer?.value ?: 0L), length.toLong())

public actual fun setProcessValidCallTargets(hprocess: Handle, virtualaddress: COpaquePointer?, regionsize: ULong, numberofoffsets: UInt, offsetinformation: COpaquePointer?): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_setProcessValidCallTargets((hprocess?.value ?: 0L), (virtualaddress?.value ?: 0L), regionsize.toLong(), numberofoffsets.toInt(), (offsetinformation?.value ?: 0L))

public actual fun setProcessValidCallTargetsForMappedView(process: Handle, virtualaddress: COpaquePointer?, regionsize: ULong, numberofoffsets: UInt, offsetinformation: COpaquePointer?, section: Handle, expectedfileoffset: ULong): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_setProcessValidCallTargetsForMappedView((process?.value ?: 0L), (virtualaddress?.value ?: 0L), regionsize.toLong(), numberofoffsets.toInt(), (offsetinformation?.value ?: 0L), (section?.value ?: 0L), expectedfileoffset.toLong())

public actual fun setProcessWorkingSetSizeEx(hprocess: Handle, dwminimumworkingsetsize: ULong, dwmaximumworkingsetsize: ULong, flags: SetprocessworkingsetsizeexFlags): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_setProcessWorkingSetSizeEx((hprocess?.value ?: 0L), dwminimumworkingsetsize.toLong(), dwmaximumworkingsetsize.toLong(), flags.toInt())

public actual fun setSystemFileCacheSize(minimumfilecachesize: ULong, maximumfilecachesize: ULong, flags: UInt): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_setSystemFileCacheSize(minimumfilecachesize.toLong(), maximumfilecachesize.toLong(), flags.toInt())

public actual fun unmapViewOfFile(lpbaseaddress: MemoryMappedViewAddress): Bool =
    0

public actual fun unmapViewOfFile2(process: Handle, baseaddress: MemoryMappedViewAddress, unmapflags: UnmapViewOfFileFlags): Bool =
    0

public actual fun unmapViewOfFileEx(baseaddress: MemoryMappedViewAddress, unmapflags: UnmapViewOfFileFlags): Bool =
    0

public actual fun unregisterBadMemoryNotification(registrationhandle: COpaquePointer?): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_unregisterBadMemoryNotification((registrationhandle?.value ?: 0L))

public actual fun virtualAlloc(lpaddress: COpaquePointer?, dwsize: ULong, flallocationtype: VirtualAllocationType, flprotect: PageProtectionFlags): COpaquePointer? =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_virtualAlloc((lpaddress?.value ?: 0L), dwsize.toLong(), flallocationtype.toInt(), flprotect.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun virtualAlloc2(process: Handle, baseaddress: COpaquePointer?, size: ULong, allocationtype: VirtualAllocationType, pageprotection: UInt, extendedparameters: COpaquePointer?, parametercount: UInt): COpaquePointer? =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_virtualAlloc2((process?.value ?: 0L), (baseaddress?.value ?: 0L), size.toLong(), allocationtype.toInt(), pageprotection.toInt(), (extendedparameters?.value ?: 0L), parametercount.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun virtualAlloc2FromApp(process: Handle, baseaddress: COpaquePointer?, size: ULong, allocationtype: VirtualAllocationType, pageprotection: UInt, extendedparameters: COpaquePointer?, parametercount: UInt): COpaquePointer? =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_virtualAlloc2FromApp((process?.value ?: 0L), (baseaddress?.value ?: 0L), size.toLong(), allocationtype.toInt(), pageprotection.toInt(), (extendedparameters?.value ?: 0L), parametercount.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun virtualAllocEx(hprocess: Handle, lpaddress: COpaquePointer?, dwsize: ULong, flallocationtype: VirtualAllocationType, flprotect: PageProtectionFlags): COpaquePointer? =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_virtualAllocEx((hprocess?.value ?: 0L), (lpaddress?.value ?: 0L), dwsize.toLong(), flallocationtype.toInt(), flprotect.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun virtualAllocExNuma(hprocess: Handle, lpaddress: COpaquePointer?, dwsize: ULong, flallocationtype: VirtualAllocationType, flprotect: UInt, nndpreferred: UInt): COpaquePointer? =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_virtualAllocExNuma((hprocess?.value ?: 0L), (lpaddress?.value ?: 0L), dwsize.toLong(), flallocationtype.toInt(), flprotect.toInt(), nndpreferred.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun virtualAllocFromApp(baseaddress: COpaquePointer?, size: ULong, allocationtype: VirtualAllocationType, protection: UInt): COpaquePointer? =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_virtualAllocFromApp((baseaddress?.value ?: 0L), size.toLong(), allocationtype.toInt(), protection.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun virtualFree(lpaddress: COpaquePointer?, dwsize: ULong, dwfreetype: VirtualFreeType): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_virtualFree((lpaddress?.value ?: 0L), dwsize.toLong(), dwfreetype.toInt())

public actual fun virtualFreeEx(hprocess: Handle, lpaddress: COpaquePointer?, dwsize: ULong, dwfreetype: VirtualFreeType): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_virtualFreeEx((hprocess?.value ?: 0L), (lpaddress?.value ?: 0L), dwsize.toLong(), dwfreetype.toInt())

public actual fun virtualLock(lpaddress: COpaquePointer?, dwsize: ULong): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_virtualLock((lpaddress?.value ?: 0L), dwsize.toLong())

public actual fun virtualProtect(lpaddress: COpaquePointer?, dwsize: ULong, flnewprotect: PageProtectionFlags, lpfloldprotect: COpaquePointer?): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_virtualProtect((lpaddress?.value ?: 0L), dwsize.toLong(), flnewprotect.toInt(), (lpfloldprotect?.value ?: 0L))

public actual fun virtualProtectEx(hprocess: Handle, lpaddress: COpaquePointer?, dwsize: ULong, flnewprotect: PageProtectionFlags, lpfloldprotect: COpaquePointer?): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_virtualProtectEx((hprocess?.value ?: 0L), (lpaddress?.value ?: 0L), dwsize.toLong(), flnewprotect.toInt(), (lpfloldprotect?.value ?: 0L))

public actual fun virtualProtectFromApp(address: COpaquePointer?, size: ULong, newprotection: UInt, oldprotection: COpaquePointer?): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_virtualProtectFromApp((address?.value ?: 0L), size.toLong(), newprotection.toInt(), (oldprotection?.value ?: 0L))

public actual fun virtualQuery(lpaddress: COpaquePointer?, lpbuffer: COpaquePointer?, dwlength: ULong): ULong =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_virtualQuery((lpaddress?.value ?: 0L), (lpbuffer?.value ?: 0L), dwlength.toLong()).toULong()

public actual fun virtualQueryEx(hprocess: Handle, lpaddress: COpaquePointer?, lpbuffer: COpaquePointer?, dwlength: ULong): ULong =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_virtualQueryEx((hprocess?.value ?: 0L), (lpaddress?.value ?: 0L), (lpbuffer?.value ?: 0L), dwlength.toLong()).toULong()

public actual fun virtualUnlock(lpaddress: COpaquePointer?, dwsize: ULong): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_virtualUnlock((lpaddress?.value ?: 0L), dwsize.toLong())

public actual fun virtualUnlockEx(process: Handle, address: COpaquePointer?, size: ULong): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssys_windows_win32_system_memory_virtualUnlockEx((process?.value ?: 0L), (address?.value ?: 0L), size.toLong())
