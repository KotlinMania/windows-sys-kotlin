@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.memory

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Farproc
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hglobal
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hlocal
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_addSecureMemoryCacheCallback
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_allocateUserPhysicalPages
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_allocateUserPhysicalPages2
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_allocateUserPhysicalPagesNuma
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_createFileMapping2
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_createFileMappingA
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_createFileMappingFromApp
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_createFileMappingNumaA
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_createFileMappingNumaW
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_createFileMappingW
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_createMemoryResourceNotification
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_discardVirtualMemory
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_flushViewOfFile
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_freeUserPhysicalPages
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_getLargePageMinimum
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_getMemoryErrorHandlingCapabilities
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_getProcessHeap
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_getProcessHeaps
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_getProcessWorkingSetSizeEx
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_getSystemFileCacheSize
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_getWriteWatch
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_globalAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_globalFlags
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_globalHandle
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_globalLock
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_globalReAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_globalSize
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_globalUnlock
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_heapAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_heapCompact
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_heapCreate
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_heapDestroy
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_heapFree
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_heapLock
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_heapQueryInformation
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_heapReAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_heapSetInformation
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_heapSize
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_heapSummary
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_heapUnlock
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_heapValidate
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_heapWalk
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_isBadReadPtr
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_isBadStringPtrA
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_isBadStringPtrW
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_isBadWritePtr
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_localAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_localFlags
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_localHandle
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_localLock
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_localReAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_localSize
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_localUnlock
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_mapUserPhysicalPages
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_mapUserPhysicalPagesScatter
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_offerVirtualMemory
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_openDedicatedMemoryPartition
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_openFileMappingA
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_openFileMappingFromApp
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_openFileMappingW
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_prefetchVirtualMemory
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_queryMemoryResourceNotification
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_queryPartitionInformation
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_queryVirtualMemoryInformation
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_reclaimVirtualMemory
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_registerBadMemoryNotification
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_removeSecureMemoryCacheCallback
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_resetWriteWatch
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_rtlCompareMemory
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_rtlCrc32
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_rtlCrc64
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_rtlIsZeroMemory
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_setProcessValidCallTargets
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_setProcessValidCallTargetsForMappedView
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_setProcessWorkingSetSizeEx
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_setSystemFileCacheSize
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_unregisterBadMemoryNotification
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_virtualAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_virtualAlloc2
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_virtualAlloc2FromApp
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_virtualAllocEx
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_virtualAllocExNuma
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_virtualAllocFromApp
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_virtualFree
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_virtualFreeEx
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_virtualLock
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_virtualProtect
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_virtualProtectEx
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_virtualProtectFromApp
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_virtualQuery
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_virtualQueryEx
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_virtualUnlock
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssys_windows_win32_system_memory_virtualUnlockEx
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun addSecureMemoryCacheCallback(pfncallback: PsecureMemoryCacheCallback): Bool =
    windowssys_windows_win32_system_memory_addSecureMemoryCacheCallback(0L.toCPointer<ByteVar>())

public actual fun allocateUserPhysicalPages(hprocess: Handle, numberofpages: COpaquePointer?, pagearray: COpaquePointer?): Bool =
    windowssys_windows_win32_system_memory_allocateUserPhysicalPages(hprocess?.value?.toCPointer<ByteVar>(), numberofpages?.value?.toCPointer<ByteVar>(), pagearray?.value?.toCPointer<ByteVar>())

public actual fun allocateUserPhysicalPages2(objecthandle: Handle, numberofpages: COpaquePointer?, pagearray: COpaquePointer?, extendedparameters: COpaquePointer?, extendedparametercount: UInt): Bool =
    windowssys_windows_win32_system_memory_allocateUserPhysicalPages2(objecthandle?.value?.toCPointer<ByteVar>(), numberofpages?.value?.toCPointer<ByteVar>(), pagearray?.value?.toCPointer<ByteVar>(), extendedparameters?.value?.toCPointer<ByteVar>(), extendedparametercount)

public actual fun allocateUserPhysicalPagesNuma(hprocess: Handle, numberofpages: COpaquePointer?, pagearray: COpaquePointer?, nndpreferred: UInt): Bool =
    windowssys_windows_win32_system_memory_allocateUserPhysicalPagesNuma(hprocess?.value?.toCPointer<ByteVar>(), numberofpages?.value?.toCPointer<ByteVar>(), pagearray?.value?.toCPointer<ByteVar>(), nndpreferred)

public actual fun createFileMapping2(file: Handle, securityattributes: COpaquePointer?, desiredaccess: UInt, pageprotection: PageProtectionFlags, allocationattributes: UInt, maximumsize: ULong, name: Pcwstr, extendedparameters: COpaquePointer?, parametercount: UInt): Handle =
    windowssys_windows_win32_system_memory_createFileMapping2(file?.value?.toCPointer<ByteVar>(), securityattributes?.value?.toCPointer<ByteVar>(), desiredaccess, pageprotection, allocationattributes, maximumsize, name?.value?.toCPointer<ByteVar>(), extendedparameters?.value?.toCPointer<ByteVar>(), parametercount)?.let { COpaquePointer(it.toLong()) }

public actual fun createFileMappingA(hfile: Handle, lpfilemappingattributes: COpaquePointer?, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcstr): Handle =
    windowssys_windows_win32_system_memory_createFileMappingA(hfile?.value?.toCPointer<ByteVar>(), lpfilemappingattributes?.value?.toCPointer<ByteVar>(), flprotect, dwmaximumsizehigh, dwmaximumsizelow, lpname?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createFileMappingFromApp(hfile: Handle, securityattributes: COpaquePointer?, pageprotection: PageProtectionFlags, maximumsize: ULong, name: Pcwstr): Handle =
    windowssys_windows_win32_system_memory_createFileMappingFromApp(hfile?.value?.toCPointer<ByteVar>(), securityattributes?.value?.toCPointer<ByteVar>(), pageprotection, maximumsize, name?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createFileMappingNumaA(hfile: Handle, lpfilemappingattributes: COpaquePointer?, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcstr, nndpreferred: UInt): Handle =
    windowssys_windows_win32_system_memory_createFileMappingNumaA(hfile?.value?.toCPointer<ByteVar>(), lpfilemappingattributes?.value?.toCPointer<ByteVar>(), flprotect, dwmaximumsizehigh, dwmaximumsizelow, lpname?.value?.toCPointer<ByteVar>(), nndpreferred)?.let { COpaquePointer(it.toLong()) }

public actual fun createFileMappingNumaW(hfile: Handle, lpfilemappingattributes: COpaquePointer?, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcwstr, nndpreferred: UInt): Handle =
    windowssys_windows_win32_system_memory_createFileMappingNumaW(hfile?.value?.toCPointer<ByteVar>(), lpfilemappingattributes?.value?.toCPointer<ByteVar>(), flprotect, dwmaximumsizehigh, dwmaximumsizelow, lpname?.value?.toCPointer<ByteVar>(), nndpreferred)?.let { COpaquePointer(it.toLong()) }

public actual fun createFileMappingW(hfile: Handle, lpfilemappingattributes: COpaquePointer?, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcwstr): Handle =
    windowssys_windows_win32_system_memory_createFileMappingW(hfile?.value?.toCPointer<ByteVar>(), lpfilemappingattributes?.value?.toCPointer<ByteVar>(), flprotect, dwmaximumsizehigh, dwmaximumsizelow, lpname?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createMemoryResourceNotification(notificationtype: MemoryResourceNotificationType): Handle =
    windowssys_windows_win32_system_memory_createMemoryResourceNotification(notificationtype)?.let { COpaquePointer(it.toLong()) }

public actual fun discardVirtualMemory(virtualaddress: COpaquePointer?, size: ULong): UInt =
    windowssys_windows_win32_system_memory_discardVirtualMemory(virtualaddress?.value?.toCPointer<ByteVar>(), size)

public actual fun flushViewOfFile(lpbaseaddress: COpaquePointer?, dwnumberofbytestoflush: ULong): Bool =
    windowssys_windows_win32_system_memory_flushViewOfFile(lpbaseaddress?.value?.toCPointer<ByteVar>(), dwnumberofbytestoflush)

public actual fun freeUserPhysicalPages(hprocess: Handle, numberofpages: COpaquePointer?, pagearray: COpaquePointer?): Bool =
    windowssys_windows_win32_system_memory_freeUserPhysicalPages(hprocess?.value?.toCPointer<ByteVar>(), numberofpages?.value?.toCPointer<ByteVar>(), pagearray?.value?.toCPointer<ByteVar>())

public actual fun getLargePageMinimum(): ULong =
    windowssys_windows_win32_system_memory_getLargePageMinimum()

public actual fun getMemoryErrorHandlingCapabilities(capabilities: COpaquePointer?): Bool =
    windowssys_windows_win32_system_memory_getMemoryErrorHandlingCapabilities(capabilities?.value?.toCPointer<ByteVar>())

public actual fun getProcessHeap(): Handle =
    windowssys_windows_win32_system_memory_getProcessHeap()?.let { COpaquePointer(it.toLong()) }

public actual fun getProcessHeaps(numberofheaps: UInt, processheaps: COpaquePointer?): UInt =
    windowssys_windows_win32_system_memory_getProcessHeaps(numberofheaps, processheaps?.value?.toCPointer<ByteVar>())

public actual fun getProcessWorkingSetSizeEx(hprocess: Handle, lpminimumworkingsetsize: COpaquePointer?, lpmaximumworkingsetsize: COpaquePointer?, flags: COpaquePointer?): Bool =
    windowssys_windows_win32_system_memory_getProcessWorkingSetSizeEx(hprocess?.value?.toCPointer<ByteVar>(), lpminimumworkingsetsize?.value?.toCPointer<ByteVar>(), lpmaximumworkingsetsize?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun getSystemFileCacheSize(lpminimumfilecachesize: COpaquePointer?, lpmaximumfilecachesize: COpaquePointer?, lpflags: COpaquePointer?): Bool =
    windowssys_windows_win32_system_memory_getSystemFileCacheSize(lpminimumfilecachesize?.value?.toCPointer<ByteVar>(), lpmaximumfilecachesize?.value?.toCPointer<ByteVar>(), lpflags?.value?.toCPointer<ByteVar>())

public actual fun getWriteWatch(dwflags: UInt, lpbaseaddress: COpaquePointer?, dwregionsize: ULong, lpaddresses: COpaquePointer?, lpdwcount: COpaquePointer?, lpdwgranularity: COpaquePointer?): UInt =
    windowssys_windows_win32_system_memory_getWriteWatch(dwflags, lpbaseaddress?.value?.toCPointer<ByteVar>(), dwregionsize, lpaddresses?.value?.toCPointer<ByteVar>(), lpdwcount?.value?.toCPointer<ByteVar>(), lpdwgranularity?.value?.toCPointer<ByteVar>())

public actual fun globalAlloc(uflags: GlobalAllocFlags, dwbytes: ULong): Hglobal =
    windowssys_windows_win32_system_memory_globalAlloc(uflags, dwbytes)?.let { COpaquePointer(it.toLong()) }

public actual fun globalFlags(hmem: Hglobal): UInt =
    windowssys_windows_win32_system_memory_globalFlags(hmem?.value?.toCPointer<ByteVar>())

public actual fun globalHandle(pmem: COpaquePointer?): Hglobal =
    windowssys_windows_win32_system_memory_globalHandle(pmem?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun globalLock(hmem: Hglobal): COpaquePointer? =
    windowssys_windows_win32_system_memory_globalLock(hmem?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun globalReAlloc(hmem: Hglobal, dwbytes: ULong, uflags: UInt): Hglobal =
    windowssys_windows_win32_system_memory_globalReAlloc(hmem?.value?.toCPointer<ByteVar>(), dwbytes, uflags)?.let { COpaquePointer(it.toLong()) }

public actual fun globalSize(hmem: Hglobal): ULong =
    windowssys_windows_win32_system_memory_globalSize(hmem?.value?.toCPointer<ByteVar>())

public actual fun globalUnlock(hmem: Hglobal): Bool =
    windowssys_windows_win32_system_memory_globalUnlock(hmem?.value?.toCPointer<ByteVar>())

public actual fun heapAlloc(hheap: Handle, dwflags: HeapFlags, dwbytes: ULong): COpaquePointer? =
    windowssys_windows_win32_system_memory_heapAlloc(hheap?.value?.toCPointer<ByteVar>(), dwflags, dwbytes)?.let { COpaquePointer(it.toLong()) }

public actual fun heapCompact(hheap: Handle, dwflags: HeapFlags): ULong =
    windowssys_windows_win32_system_memory_heapCompact(hheap?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun heapCreate(floptions: HeapFlags, dwinitialsize: ULong, dwmaximumsize: ULong): Handle =
    windowssys_windows_win32_system_memory_heapCreate(floptions, dwinitialsize, dwmaximumsize)?.let { COpaquePointer(it.toLong()) }

public actual fun heapDestroy(hheap: Handle): Bool =
    windowssys_windows_win32_system_memory_heapDestroy(hheap?.value?.toCPointer<ByteVar>())

public actual fun heapFree(hheap: Handle, dwflags: HeapFlags, lpmem: COpaquePointer?): Bool =
    windowssys_windows_win32_system_memory_heapFree(hheap?.value?.toCPointer<ByteVar>(), dwflags, lpmem?.value?.toCPointer<ByteVar>())

public actual fun heapLock(hheap: Handle): Bool =
    windowssys_windows_win32_system_memory_heapLock(hheap?.value?.toCPointer<ByteVar>())

public actual fun heapQueryInformation(heaphandle: Handle, heapinformationclass: HeapInformationClass, heapinformation: COpaquePointer?, heapinformationlength: ULong, returnlength: COpaquePointer?): Bool =
    windowssys_windows_win32_system_memory_heapQueryInformation(heaphandle?.value?.toCPointer<ByteVar>(), heapinformationclass, heapinformation?.value?.toCPointer<ByteVar>(), heapinformationlength, returnlength?.value?.toCPointer<ByteVar>())

public actual fun heapReAlloc(hheap: Handle, dwflags: HeapFlags, lpmem: COpaquePointer?, dwbytes: ULong): COpaquePointer? =
    windowssys_windows_win32_system_memory_heapReAlloc(hheap?.value?.toCPointer<ByteVar>(), dwflags, lpmem?.value?.toCPointer<ByteVar>(), dwbytes)?.let { COpaquePointer(it.toLong()) }

public actual fun heapSetInformation(heaphandle: Handle, heapinformationclass: HeapInformationClass, heapinformation: COpaquePointer?, heapinformationlength: ULong): Bool =
    windowssys_windows_win32_system_memory_heapSetInformation(heaphandle?.value?.toCPointer<ByteVar>(), heapinformationclass, heapinformation?.value?.toCPointer<ByteVar>(), heapinformationlength)

public actual fun heapSize(hheap: Handle, dwflags: HeapFlags, lpmem: COpaquePointer?): ULong =
    windowssys_windows_win32_system_memory_heapSize(hheap?.value?.toCPointer<ByteVar>(), dwflags, lpmem?.value?.toCPointer<ByteVar>())

public actual fun heapSummary(hheap: Handle, dwflags: UInt, lpsummary: COpaquePointer?): Bool =
    windowssys_windows_win32_system_memory_heapSummary(hheap?.value?.toCPointer<ByteVar>(), dwflags, lpsummary?.value?.toCPointer<ByteVar>())

public actual fun heapUnlock(hheap: Handle): Bool =
    windowssys_windows_win32_system_memory_heapUnlock(hheap?.value?.toCPointer<ByteVar>())

public actual fun heapValidate(hheap: Handle, dwflags: HeapFlags, lpmem: COpaquePointer?): Bool =
    windowssys_windows_win32_system_memory_heapValidate(hheap?.value?.toCPointer<ByteVar>(), dwflags, lpmem?.value?.toCPointer<ByteVar>())

public actual fun heapWalk(hheap: Handle, lpentry: COpaquePointer?): Bool =
    windowssys_windows_win32_system_memory_heapWalk(hheap?.value?.toCPointer<ByteVar>(), lpentry?.value?.toCPointer<ByteVar>())

public actual fun isBadCodePtr(lpfn: Farproc): Bool =
    0

public actual fun isBadReadPtr(lp: COpaquePointer?, ucb: ULong): Bool =
    windowssys_windows_win32_system_memory_isBadReadPtr(lp?.value?.toCPointer<ByteVar>(), ucb)

public actual fun isBadStringPtrA(lpsz: Pcstr, ucchmax: ULong): Bool =
    windowssys_windows_win32_system_memory_isBadStringPtrA(lpsz?.value?.toCPointer<ByteVar>(), ucchmax)

public actual fun isBadStringPtrW(lpsz: Pcwstr, ucchmax: ULong): Bool =
    windowssys_windows_win32_system_memory_isBadStringPtrW(lpsz?.value?.toCPointer<ByteVar>(), ucchmax)

public actual fun isBadWritePtr(lp: COpaquePointer?, ucb: ULong): Bool =
    windowssys_windows_win32_system_memory_isBadWritePtr(lp?.value?.toCPointer<ByteVar>(), ucb)

public actual fun localAlloc(uflags: LocalAllocFlags, ubytes: ULong): Hlocal =
    windowssys_windows_win32_system_memory_localAlloc(uflags, ubytes)?.let { COpaquePointer(it.toLong()) }

public actual fun localFlags(hmem: Hlocal): UInt =
    windowssys_windows_win32_system_memory_localFlags(hmem?.value?.toCPointer<ByteVar>())

public actual fun localHandle(pmem: COpaquePointer?): Hlocal =
    windowssys_windows_win32_system_memory_localHandle(pmem?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun localLock(hmem: Hlocal): COpaquePointer? =
    windowssys_windows_win32_system_memory_localLock(hmem?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun localReAlloc(hmem: Hlocal, ubytes: ULong, uflags: UInt): Hlocal =
    windowssys_windows_win32_system_memory_localReAlloc(hmem?.value?.toCPointer<ByteVar>(), ubytes, uflags)?.let { COpaquePointer(it.toLong()) }

public actual fun localSize(hmem: Hlocal): ULong =
    windowssys_windows_win32_system_memory_localSize(hmem?.value?.toCPointer<ByteVar>())

public actual fun localUnlock(hmem: Hlocal): Bool =
    windowssys_windows_win32_system_memory_localUnlock(hmem?.value?.toCPointer<ByteVar>())

public actual fun mapUserPhysicalPages(virtualaddress: COpaquePointer?, numberofpages: ULong, pagearray: COpaquePointer?): Bool =
    windowssys_windows_win32_system_memory_mapUserPhysicalPages(virtualaddress?.value?.toCPointer<ByteVar>(), numberofpages, pagearray?.value?.toCPointer<ByteVar>())

public actual fun mapUserPhysicalPagesScatter(virtualaddresses: COpaquePointer?, numberofpages: ULong, pagearray: COpaquePointer?): Bool =
    windowssys_windows_win32_system_memory_mapUserPhysicalPagesScatter(virtualaddresses?.value?.toCPointer<ByteVar>(), numberofpages, pagearray?.value?.toCPointer<ByteVar>())

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
    windowssys_windows_win32_system_memory_offerVirtualMemory(virtualaddress?.value?.toCPointer<ByteVar>(), size, priority)

public actual fun openDedicatedMemoryPartition(partition: Handle, dedicatedmemorytypeid: ULong, desiredaccess: UInt, inherithandle: Bool): Handle =
    windowssys_windows_win32_system_memory_openDedicatedMemoryPartition(partition?.value?.toCPointer<ByteVar>(), dedicatedmemorytypeid, desiredaccess, inherithandle)?.let { COpaquePointer(it.toLong()) }

public actual fun openFileMappingA(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcstr): Handle =
    windowssys_windows_win32_system_memory_openFileMappingA(dwdesiredaccess, binherithandle, lpname?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun openFileMappingFromApp(desiredaccess: UInt, inherithandle: Bool, name: Pcwstr): Handle =
    windowssys_windows_win32_system_memory_openFileMappingFromApp(desiredaccess, inherithandle, name?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun openFileMappingW(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcwstr): Handle =
    windowssys_windows_win32_system_memory_openFileMappingW(dwdesiredaccess, binherithandle, lpname?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun prefetchVirtualMemory(hprocess: Handle, numberofentries: ULong, virtualaddresses: COpaquePointer?, flags: UInt): Bool =
    windowssys_windows_win32_system_memory_prefetchVirtualMemory(hprocess?.value?.toCPointer<ByteVar>(), numberofentries, virtualaddresses?.value?.toCPointer<ByteVar>(), flags)

public actual fun queryMemoryResourceNotification(resourcenotificationhandle: Handle, resourcestate: COpaquePointer?): Bool =
    windowssys_windows_win32_system_memory_queryMemoryResourceNotification(resourcenotificationhandle?.value?.toCPointer<ByteVar>(), resourcestate?.value?.toCPointer<ByteVar>())

public actual fun queryPartitionInformation(partition: Handle, partitioninformationclass: Win32MemoryPartitionInformationClass, partitioninformation: COpaquePointer?, partitioninformationlength: UInt): Bool =
    windowssys_windows_win32_system_memory_queryPartitionInformation(partition?.value?.toCPointer<ByteVar>(), partitioninformationclass, partitioninformation?.value?.toCPointer<ByteVar>(), partitioninformationlength)

public actual fun queryVirtualMemoryInformation(process: Handle, virtualaddress: COpaquePointer?, memoryinformationclass: Win32MemoryInformationClass, memoryinformation: COpaquePointer?, memoryinformationsize: ULong, returnsize: COpaquePointer?): Bool =
    windowssys_windows_win32_system_memory_queryVirtualMemoryInformation(process?.value?.toCPointer<ByteVar>(), virtualaddress?.value?.toCPointer<ByteVar>(), memoryinformationclass, memoryinformation?.value?.toCPointer<ByteVar>(), memoryinformationsize, returnsize?.value?.toCPointer<ByteVar>())

public actual fun reclaimVirtualMemory(virtualaddress: COpaquePointer?, size: ULong): UInt =
    windowssys_windows_win32_system_memory_reclaimVirtualMemory(virtualaddress?.value?.toCPointer<ByteVar>(), size)

public actual fun registerBadMemoryNotification(callback: PbadMemoryCallbackRoutine): COpaquePointer? =
    windowssys_windows_win32_system_memory_registerBadMemoryNotification(0L.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun removeSecureMemoryCacheCallback(pfncallback: PsecureMemoryCacheCallback): Bool =
    windowssys_windows_win32_system_memory_removeSecureMemoryCacheCallback(0L.toCPointer<ByteVar>())

public actual fun resetWriteWatch(lpbaseaddress: COpaquePointer?, dwregionsize: ULong): UInt =
    windowssys_windows_win32_system_memory_resetWriteWatch(lpbaseaddress?.value?.toCPointer<ByteVar>(), dwregionsize)

public actual fun rtlCompareMemory(source1: COpaquePointer?, source2: COpaquePointer?, length: ULong): ULong =
    windowssys_windows_win32_system_memory_rtlCompareMemory(source1?.value?.toCPointer<ByteVar>(), source2?.value?.toCPointer<ByteVar>(), length)

public actual fun rtlCrc32(buffer: COpaquePointer?, size: ULong, initialcrc: UInt): UInt =
    windowssys_windows_win32_system_memory_rtlCrc32(buffer?.value?.toCPointer<ByteVar>(), size, initialcrc)

public actual fun rtlCrc64(buffer: COpaquePointer?, size: ULong, initialcrc: ULong): ULong =
    windowssys_windows_win32_system_memory_rtlCrc64(buffer?.value?.toCPointer<ByteVar>(), size, initialcrc)

public actual fun rtlIsZeroMemory(buffer: COpaquePointer?, length: ULong): Boolean =
    windowssys_windows_win32_system_memory_rtlIsZeroMemory(buffer?.value?.toCPointer<ByteVar>(), length)

public actual fun setProcessValidCallTargets(hprocess: Handle, virtualaddress: COpaquePointer?, regionsize: ULong, numberofoffsets: UInt, offsetinformation: COpaquePointer?): Bool =
    windowssys_windows_win32_system_memory_setProcessValidCallTargets(hprocess?.value?.toCPointer<ByteVar>(), virtualaddress?.value?.toCPointer<ByteVar>(), regionsize, numberofoffsets, offsetinformation?.value?.toCPointer<ByteVar>())

public actual fun setProcessValidCallTargetsForMappedView(process: Handle, virtualaddress: COpaquePointer?, regionsize: ULong, numberofoffsets: UInt, offsetinformation: COpaquePointer?, section: Handle, expectedfileoffset: ULong): Bool =
    windowssys_windows_win32_system_memory_setProcessValidCallTargetsForMappedView(process?.value?.toCPointer<ByteVar>(), virtualaddress?.value?.toCPointer<ByteVar>(), regionsize, numberofoffsets, offsetinformation?.value?.toCPointer<ByteVar>(), section?.value?.toCPointer<ByteVar>(), expectedfileoffset)

public actual fun setProcessWorkingSetSizeEx(hprocess: Handle, dwminimumworkingsetsize: ULong, dwmaximumworkingsetsize: ULong, flags: SetprocessworkingsetsizeexFlags): Bool =
    windowssys_windows_win32_system_memory_setProcessWorkingSetSizeEx(hprocess?.value?.toCPointer<ByteVar>(), dwminimumworkingsetsize, dwmaximumworkingsetsize, flags)

public actual fun setSystemFileCacheSize(minimumfilecachesize: ULong, maximumfilecachesize: ULong, flags: UInt): Bool =
    windowssys_windows_win32_system_memory_setSystemFileCacheSize(minimumfilecachesize, maximumfilecachesize, flags)

public actual fun unmapViewOfFile(lpbaseaddress: MemoryMappedViewAddress): Bool =
    0

public actual fun unmapViewOfFile2(process: Handle, baseaddress: MemoryMappedViewAddress, unmapflags: UnmapViewOfFileFlags): Bool =
    0

public actual fun unmapViewOfFileEx(baseaddress: MemoryMappedViewAddress, unmapflags: UnmapViewOfFileFlags): Bool =
    0

public actual fun unregisterBadMemoryNotification(registrationhandle: COpaquePointer?): Bool =
    windowssys_windows_win32_system_memory_unregisterBadMemoryNotification(registrationhandle?.value?.toCPointer<ByteVar>())

public actual fun virtualAlloc(lpaddress: COpaquePointer?, dwsize: ULong, flallocationtype: VirtualAllocationType, flprotect: PageProtectionFlags): COpaquePointer? =
    windowssys_windows_win32_system_memory_virtualAlloc(lpaddress?.value?.toCPointer<ByteVar>(), dwsize, flallocationtype, flprotect)?.let { COpaquePointer(it.toLong()) }

public actual fun virtualAlloc2(process: Handle, baseaddress: COpaquePointer?, size: ULong, allocationtype: VirtualAllocationType, pageprotection: UInt, extendedparameters: COpaquePointer?, parametercount: UInt): COpaquePointer? =
    windowssys_windows_win32_system_memory_virtualAlloc2(process?.value?.toCPointer<ByteVar>(), baseaddress?.value?.toCPointer<ByteVar>(), size, allocationtype, pageprotection, extendedparameters?.value?.toCPointer<ByteVar>(), parametercount)?.let { COpaquePointer(it.toLong()) }

public actual fun virtualAlloc2FromApp(process: Handle, baseaddress: COpaquePointer?, size: ULong, allocationtype: VirtualAllocationType, pageprotection: UInt, extendedparameters: COpaquePointer?, parametercount: UInt): COpaquePointer? =
    windowssys_windows_win32_system_memory_virtualAlloc2FromApp(process?.value?.toCPointer<ByteVar>(), baseaddress?.value?.toCPointer<ByteVar>(), size, allocationtype, pageprotection, extendedparameters?.value?.toCPointer<ByteVar>(), parametercount)?.let { COpaquePointer(it.toLong()) }

public actual fun virtualAllocEx(hprocess: Handle, lpaddress: COpaquePointer?, dwsize: ULong, flallocationtype: VirtualAllocationType, flprotect: PageProtectionFlags): COpaquePointer? =
    windowssys_windows_win32_system_memory_virtualAllocEx(hprocess?.value?.toCPointer<ByteVar>(), lpaddress?.value?.toCPointer<ByteVar>(), dwsize, flallocationtype, flprotect)?.let { COpaquePointer(it.toLong()) }

public actual fun virtualAllocExNuma(hprocess: Handle, lpaddress: COpaquePointer?, dwsize: ULong, flallocationtype: VirtualAllocationType, flprotect: UInt, nndpreferred: UInt): COpaquePointer? =
    windowssys_windows_win32_system_memory_virtualAllocExNuma(hprocess?.value?.toCPointer<ByteVar>(), lpaddress?.value?.toCPointer<ByteVar>(), dwsize, flallocationtype, flprotect, nndpreferred)?.let { COpaquePointer(it.toLong()) }

public actual fun virtualAllocFromApp(baseaddress: COpaquePointer?, size: ULong, allocationtype: VirtualAllocationType, protection: UInt): COpaquePointer? =
    windowssys_windows_win32_system_memory_virtualAllocFromApp(baseaddress?.value?.toCPointer<ByteVar>(), size, allocationtype, protection)?.let { COpaquePointer(it.toLong()) }

public actual fun virtualFree(lpaddress: COpaquePointer?, dwsize: ULong, dwfreetype: VirtualFreeType): Bool =
    windowssys_windows_win32_system_memory_virtualFree(lpaddress?.value?.toCPointer<ByteVar>(), dwsize, dwfreetype)

public actual fun virtualFreeEx(hprocess: Handle, lpaddress: COpaquePointer?, dwsize: ULong, dwfreetype: VirtualFreeType): Bool =
    windowssys_windows_win32_system_memory_virtualFreeEx(hprocess?.value?.toCPointer<ByteVar>(), lpaddress?.value?.toCPointer<ByteVar>(), dwsize, dwfreetype)

public actual fun virtualLock(lpaddress: COpaquePointer?, dwsize: ULong): Bool =
    windowssys_windows_win32_system_memory_virtualLock(lpaddress?.value?.toCPointer<ByteVar>(), dwsize)

public actual fun virtualProtect(lpaddress: COpaquePointer?, dwsize: ULong, flnewprotect: PageProtectionFlags, lpfloldprotect: COpaquePointer?): Bool =
    windowssys_windows_win32_system_memory_virtualProtect(lpaddress?.value?.toCPointer<ByteVar>(), dwsize, flnewprotect, lpfloldprotect?.value?.toCPointer<ByteVar>())

public actual fun virtualProtectEx(hprocess: Handle, lpaddress: COpaquePointer?, dwsize: ULong, flnewprotect: PageProtectionFlags, lpfloldprotect: COpaquePointer?): Bool =
    windowssys_windows_win32_system_memory_virtualProtectEx(hprocess?.value?.toCPointer<ByteVar>(), lpaddress?.value?.toCPointer<ByteVar>(), dwsize, flnewprotect, lpfloldprotect?.value?.toCPointer<ByteVar>())

public actual fun virtualProtectFromApp(address: COpaquePointer?, size: ULong, newprotection: UInt, oldprotection: COpaquePointer?): Bool =
    windowssys_windows_win32_system_memory_virtualProtectFromApp(address?.value?.toCPointer<ByteVar>(), size, newprotection, oldprotection?.value?.toCPointer<ByteVar>())

public actual fun virtualQuery(lpaddress: COpaquePointer?, lpbuffer: COpaquePointer?, dwlength: ULong): ULong =
    windowssys_windows_win32_system_memory_virtualQuery(lpaddress?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>(), dwlength)

public actual fun virtualQueryEx(hprocess: Handle, lpaddress: COpaquePointer?, lpbuffer: COpaquePointer?, dwlength: ULong): ULong =
    windowssys_windows_win32_system_memory_virtualQueryEx(hprocess?.value?.toCPointer<ByteVar>(), lpaddress?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>(), dwlength)

public actual fun virtualUnlock(lpaddress: COpaquePointer?, dwsize: ULong): Bool =
    windowssys_windows_win32_system_memory_virtualUnlock(lpaddress?.value?.toCPointer<ByteVar>(), dwsize)

public actual fun virtualUnlockEx(process: Handle, address: COpaquePointer?, size: ULong): Bool =
    windowssys_windows_win32_system_memory_virtualUnlockEx(process?.value?.toCPointer<ByteVar>(), address?.value?.toCPointer<ByteVar>(), size)
