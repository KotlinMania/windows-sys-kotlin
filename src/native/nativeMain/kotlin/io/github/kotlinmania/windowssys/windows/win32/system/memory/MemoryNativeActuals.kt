@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.memory

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Farproc
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hglobal
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hlocal
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryAddSecureMemoryCacheCallback
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryAllocateUserPhysicalPages
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryAllocateUserPhysicalPages2
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryAllocateUserPhysicalPagesNuma
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryCreateFileMapping2
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryCreateFileMappingA
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryCreateFileMappingFromApp
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryCreateFileMappingNumaA
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryCreateFileMappingNumaW
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryCreateFileMappingW
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryCreateMemoryResourceNotification
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryDiscardVirtualMemory
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryFlushViewOfFile
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryFreeUserPhysicalPages
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryGetLargePageMinimum
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryGetMemoryErrorHandlingCapabilities
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryGetProcessHeap
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryGetProcessHeaps
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryGetProcessWorkingSetSizeEx
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryGetSystemFileCacheSize
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryGetWriteWatch
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryGlobalAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryGlobalFlags
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryGlobalHandle
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryGlobalLock
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryGlobalReAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryGlobalSize
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryGlobalUnlock
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryHeapAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryHeapCompact
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryHeapCreate
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryHeapDestroy
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryHeapFree
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryHeapLock
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryHeapQueryInformation
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryHeapReAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryHeapSetInformation
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryHeapSize
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryHeapSummary
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryHeapUnlock
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryHeapValidate
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryHeapWalk
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryIsBadReadPtr
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryIsBadStringPtrA
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryIsBadStringPtrW
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryIsBadWritePtr
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryLocalAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryLocalFlags
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryLocalHandle
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryLocalLock
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryLocalReAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryLocalSize
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryLocalUnlock
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryMapUserPhysicalPages
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryMapUserPhysicalPagesScatter
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryOfferVirtualMemory
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryOpenDedicatedMemoryPartition
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryOpenFileMappingA
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryOpenFileMappingFromApp
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryOpenFileMappingW
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryPrefetchVirtualMemory
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryQueryMemoryResourceNotification
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryQueryPartitionInformation
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryQueryVirtualMemoryInformation
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryReclaimVirtualMemory
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryRegisterBadMemoryNotification
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryRemoveSecureMemoryCacheCallback
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryResetWriteWatch
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryRtlCompareMemory
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryRtlCrc32
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryRtlCrc64
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryRtlIsZeroMemory
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemorySetProcessValidCallTargets
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemorySetProcessValidCallTargetsForMappedView
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemorySetProcessWorkingSetSizeEx
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemorySetSystemFileCacheSize
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryUnregisterBadMemoryNotification
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryVirtualAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryVirtualAlloc2
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryVirtualAlloc2FromApp
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryVirtualAllocEx
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryVirtualAllocExNuma
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryVirtualAllocFromApp
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryVirtualFree
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryVirtualFreeEx
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryVirtualLock
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryVirtualProtect
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryVirtualProtectEx
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryVirtualProtectFromApp
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryVirtualQuery
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryVirtualQueryEx
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryVirtualUnlock
import io.github.kotlinmania.windowssys.windows.win32.system.memory.cinterop.windowssysWindowsWin32SystemMemoryVirtualUnlockEx
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun addSecureMemoryCacheCallback(pfncallback: PsecureMemoryCacheCallback): Bool =
    windowssysWindowsWin32SystemMemoryAddSecureMemoryCacheCallback(0L.toCPointer<ByteVar>())

public actual fun allocateUserPhysicalPages(hprocess: Handle, numberofpages: MutPtr, pagearray: MutPtr): Bool =
    windowssysWindowsWin32SystemMemoryAllocateUserPhysicalPages(hprocess.rawAddress.toCPointer<ByteVar>(), numberofpages.rawAddress.toCPointer<ByteVar>(), pagearray.rawAddress.toCPointer<ByteVar>())

public actual fun allocateUserPhysicalPages2(objecthandle: Handle, numberofpages: MutPtr, pagearray: MutPtr, extendedparameters: MutPtr, extendedparametercount: UInt): Bool =
    windowssysWindowsWin32SystemMemoryAllocateUserPhysicalPages2(objecthandle.rawAddress.toCPointer<ByteVar>(), numberofpages.rawAddress.toCPointer<ByteVar>(), pagearray.rawAddress.toCPointer<ByteVar>(), extendedparameters.rawAddress.toCPointer<ByteVar>(), extendedparametercount)

public actual fun allocateUserPhysicalPagesNuma(hprocess: Handle, numberofpages: MutPtr, pagearray: MutPtr, nndpreferred: UInt): Bool =
    windowssysWindowsWin32SystemMemoryAllocateUserPhysicalPagesNuma(hprocess.rawAddress.toCPointer<ByteVar>(), numberofpages.rawAddress.toCPointer<ByteVar>(), pagearray.rawAddress.toCPointer<ByteVar>(), nndpreferred)

public actual fun createFileMapping2(file: Handle, securityattributes: ConstPtr, desiredaccess: UInt, pageprotection: PageProtectionFlags, allocationattributes: UInt, maximumsize: ULong, name: Pcwstr, extendedparameters: MutPtr, parametercount: UInt): Handle =
    MutPtr(windowssysWindowsWin32SystemMemoryCreateFileMapping2(file.rawAddress.toCPointer<ByteVar>(), securityattributes.rawAddress.toCPointer<ByteVar>(), desiredaccess, pageprotection, allocationattributes, maximumsize, name.rawAddress.toCPointer<ByteVar>(), extendedparameters.rawAddress.toCPointer<ByteVar>(), parametercount)?.toLong() ?: 0L)

public actual fun createFileMappingA(hfile: Handle, lpfilemappingattributes: ConstPtr, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcstr): Handle =
    MutPtr(windowssysWindowsWin32SystemMemoryCreateFileMappingA(hfile.rawAddress.toCPointer<ByteVar>(), lpfilemappingattributes.rawAddress.toCPointer<ByteVar>(), flprotect, dwmaximumsizehigh, dwmaximumsizelow, lpname.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun createFileMappingFromApp(hfile: Handle, securityattributes: ConstPtr, pageprotection: PageProtectionFlags, maximumsize: ULong, name: Pcwstr): Handle =
    MutPtr(windowssysWindowsWin32SystemMemoryCreateFileMappingFromApp(hfile.rawAddress.toCPointer<ByteVar>(), securityattributes.rawAddress.toCPointer<ByteVar>(), pageprotection, maximumsize, name.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun createFileMappingNumaA(hfile: Handle, lpfilemappingattributes: ConstPtr, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcstr, nndpreferred: UInt): Handle =
    MutPtr(windowssysWindowsWin32SystemMemoryCreateFileMappingNumaA(hfile.rawAddress.toCPointer<ByteVar>(), lpfilemappingattributes.rawAddress.toCPointer<ByteVar>(), flprotect, dwmaximumsizehigh, dwmaximumsizelow, lpname.rawAddress.toCPointer<ByteVar>(), nndpreferred)?.toLong() ?: 0L)

public actual fun createFileMappingNumaW(hfile: Handle, lpfilemappingattributes: ConstPtr, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcwstr, nndpreferred: UInt): Handle =
    MutPtr(windowssysWindowsWin32SystemMemoryCreateFileMappingNumaW(hfile.rawAddress.toCPointer<ByteVar>(), lpfilemappingattributes.rawAddress.toCPointer<ByteVar>(), flprotect, dwmaximumsizehigh, dwmaximumsizelow, lpname.rawAddress.toCPointer<ByteVar>(), nndpreferred)?.toLong() ?: 0L)

public actual fun createFileMappingW(hfile: Handle, lpfilemappingattributes: ConstPtr, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcwstr): Handle =
    MutPtr(windowssysWindowsWin32SystemMemoryCreateFileMappingW(hfile.rawAddress.toCPointer<ByteVar>(), lpfilemappingattributes.rawAddress.toCPointer<ByteVar>(), flprotect, dwmaximumsizehigh, dwmaximumsizelow, lpname.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun createMemoryResourceNotification(notificationtype: MemoryResourceNotificationType): Handle =
    MutPtr(windowssysWindowsWin32SystemMemoryCreateMemoryResourceNotification(notificationtype)?.toLong() ?: 0L)

public actual fun discardVirtualMemory(virtualaddress: MutPtr, size: ULong): UInt =
    windowssysWindowsWin32SystemMemoryDiscardVirtualMemory(virtualaddress.rawAddress.toCPointer<ByteVar>(), size)

public actual fun flushViewOfFile(lpbaseaddress: ConstPtr, dwnumberofbytestoflush: ULong): Bool =
    windowssysWindowsWin32SystemMemoryFlushViewOfFile(lpbaseaddress.rawAddress.toCPointer<ByteVar>(), dwnumberofbytestoflush)

public actual fun freeUserPhysicalPages(hprocess: Handle, numberofpages: MutPtr, pagearray: ConstPtr): Bool =
    windowssysWindowsWin32SystemMemoryFreeUserPhysicalPages(hprocess.rawAddress.toCPointer<ByteVar>(), numberofpages.rawAddress.toCPointer<ByteVar>(), pagearray.rawAddress.toCPointer<ByteVar>())

public actual fun getLargePageMinimum(): ULong =
    windowssysWindowsWin32SystemMemoryGetLargePageMinimum()

public actual fun getMemoryErrorHandlingCapabilities(capabilities: MutPtr): Bool =
    windowssysWindowsWin32SystemMemoryGetMemoryErrorHandlingCapabilities(capabilities.rawAddress.toCPointer<ByteVar>())

public actual fun getProcessHeap(): Handle =
    MutPtr(windowssysWindowsWin32SystemMemoryGetProcessHeap()?.toLong() ?: 0L)

public actual fun getProcessHeaps(numberofheaps: UInt, processheaps: MutPtr): UInt =
    windowssysWindowsWin32SystemMemoryGetProcessHeaps(numberofheaps, processheaps.rawAddress.toCPointer<ByteVar>())

public actual fun getProcessWorkingSetSizeEx(hprocess: Handle, lpminimumworkingsetsize: MutPtr, lpmaximumworkingsetsize: MutPtr, flags: MutPtr): Bool =
    windowssysWindowsWin32SystemMemoryGetProcessWorkingSetSizeEx(hprocess.rawAddress.toCPointer<ByteVar>(), lpminimumworkingsetsize.rawAddress.toCPointer<ByteVar>(), lpmaximumworkingsetsize.rawAddress.toCPointer<ByteVar>(), flags.rawAddress.toCPointer<ByteVar>())

public actual fun getSystemFileCacheSize(lpminimumfilecachesize: MutPtr, lpmaximumfilecachesize: MutPtr, lpflags: MutPtr): Bool =
    windowssysWindowsWin32SystemMemoryGetSystemFileCacheSize(lpminimumfilecachesize.rawAddress.toCPointer<ByteVar>(), lpmaximumfilecachesize.rawAddress.toCPointer<ByteVar>(), lpflags.rawAddress.toCPointer<ByteVar>())

public actual fun getWriteWatch(dwflags: UInt, lpbaseaddress: ConstPtr, dwregionsize: ULong, lpaddresses: MutPtr, lpdwcount: MutPtr, lpdwgranularity: MutPtr): UInt =
    windowssysWindowsWin32SystemMemoryGetWriteWatch(dwflags, lpbaseaddress.rawAddress.toCPointer<ByteVar>(), dwregionsize, lpaddresses.rawAddress.toCPointer<ByteVar>(), lpdwcount.rawAddress.toCPointer<ByteVar>(), lpdwgranularity.rawAddress.toCPointer<ByteVar>())

public actual fun globalAlloc(uflags: GlobalAllocFlags, dwbytes: ULong): Hglobal =
    MutPtr(windowssysWindowsWin32SystemMemoryGlobalAlloc(uflags, dwbytes)?.toLong() ?: 0L)

public actual fun globalFlags(hmem: Hglobal): UInt =
    windowssysWindowsWin32SystemMemoryGlobalFlags(hmem.rawAddress.toCPointer<ByteVar>())

public actual fun globalHandle(pmem: ConstPtr): Hglobal =
    MutPtr(windowssysWindowsWin32SystemMemoryGlobalHandle(pmem.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun globalLock(hmem: Hglobal): MutPtr =
    MutPtr(windowssysWindowsWin32SystemMemoryGlobalLock(hmem.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun globalReAlloc(hmem: Hglobal, dwbytes: ULong, uflags: UInt): Hglobal =
    MutPtr(windowssysWindowsWin32SystemMemoryGlobalReAlloc(hmem.rawAddress.toCPointer<ByteVar>(), dwbytes, uflags)?.toLong() ?: 0L)

public actual fun globalSize(hmem: Hglobal): ULong =
    windowssysWindowsWin32SystemMemoryGlobalSize(hmem.rawAddress.toCPointer<ByteVar>())

public actual fun globalUnlock(hmem: Hglobal): Bool =
    windowssysWindowsWin32SystemMemoryGlobalUnlock(hmem.rawAddress.toCPointer<ByteVar>())

public actual fun heapAlloc(hheap: Handle, dwflags: HeapFlags, dwbytes: ULong): MutPtr =
    MutPtr(windowssysWindowsWin32SystemMemoryHeapAlloc(hheap.rawAddress.toCPointer<ByteVar>(), dwflags, dwbytes)?.toLong() ?: 0L)

public actual fun heapCompact(hheap: Handle, dwflags: HeapFlags): ULong =
    windowssysWindowsWin32SystemMemoryHeapCompact(hheap.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun heapCreate(floptions: HeapFlags, dwinitialsize: ULong, dwmaximumsize: ULong): Handle =
    MutPtr(windowssysWindowsWin32SystemMemoryHeapCreate(floptions, dwinitialsize, dwmaximumsize)?.toLong() ?: 0L)

public actual fun heapDestroy(hheap: Handle): Bool =
    windowssysWindowsWin32SystemMemoryHeapDestroy(hheap.rawAddress.toCPointer<ByteVar>())

public actual fun heapFree(hheap: Handle, dwflags: HeapFlags, lpmem: ConstPtr): Bool =
    windowssysWindowsWin32SystemMemoryHeapFree(hheap.rawAddress.toCPointer<ByteVar>(), dwflags, lpmem.rawAddress.toCPointer<ByteVar>())

public actual fun heapLock(hheap: Handle): Bool =
    windowssysWindowsWin32SystemMemoryHeapLock(hheap.rawAddress.toCPointer<ByteVar>())

public actual fun heapQueryInformation(heaphandle: Handle, heapinformationclass: HeapInformationClass, heapinformation: MutPtr, heapinformationlength: ULong, returnlength: MutPtr): Bool =
    windowssysWindowsWin32SystemMemoryHeapQueryInformation(heaphandle.rawAddress.toCPointer<ByteVar>(), heapinformationclass, heapinformation.rawAddress.toCPointer<ByteVar>(), heapinformationlength, returnlength.rawAddress.toCPointer<ByteVar>())

public actual fun heapReAlloc(hheap: Handle, dwflags: HeapFlags, lpmem: ConstPtr, dwbytes: ULong): MutPtr =
    MutPtr(windowssysWindowsWin32SystemMemoryHeapReAlloc(hheap.rawAddress.toCPointer<ByteVar>(), dwflags, lpmem.rawAddress.toCPointer<ByteVar>(), dwbytes)?.toLong() ?: 0L)

public actual fun heapSetInformation(heaphandle: Handle, heapinformationclass: HeapInformationClass, heapinformation: ConstPtr, heapinformationlength: ULong): Bool =
    windowssysWindowsWin32SystemMemoryHeapSetInformation(heaphandle.rawAddress.toCPointer<ByteVar>(), heapinformationclass, heapinformation.rawAddress.toCPointer<ByteVar>(), heapinformationlength)

public actual fun heapSize(hheap: Handle, dwflags: HeapFlags, lpmem: ConstPtr): ULong =
    windowssysWindowsWin32SystemMemoryHeapSize(hheap.rawAddress.toCPointer<ByteVar>(), dwflags, lpmem.rawAddress.toCPointer<ByteVar>())

public actual fun heapSummary(hheap: Handle, dwflags: UInt, lpsummary: MutPtr): Bool =
    windowssysWindowsWin32SystemMemoryHeapSummary(hheap.rawAddress.toCPointer<ByteVar>(), dwflags, lpsummary.rawAddress.toCPointer<ByteVar>())

public actual fun heapUnlock(hheap: Handle): Bool =
    windowssysWindowsWin32SystemMemoryHeapUnlock(hheap.rawAddress.toCPointer<ByteVar>())

public actual fun heapValidate(hheap: Handle, dwflags: HeapFlags, lpmem: ConstPtr): Bool =
    windowssysWindowsWin32SystemMemoryHeapValidate(hheap.rawAddress.toCPointer<ByteVar>(), dwflags, lpmem.rawAddress.toCPointer<ByteVar>())

public actual fun heapWalk(hheap: Handle, lpentry: MutPtr): Bool =
    windowssysWindowsWin32SystemMemoryHeapWalk(hheap.rawAddress.toCPointer<ByteVar>(), lpentry.rawAddress.toCPointer<ByteVar>())

public actual fun isBadCodePtr(lpfn: Farproc): Bool =
    0

public actual fun isBadReadPtr(lp: ConstPtr, ucb: ULong): Bool =
    windowssysWindowsWin32SystemMemoryIsBadReadPtr(lp.rawAddress.toCPointer<ByteVar>(), ucb)

public actual fun isBadStringPtrA(lpsz: Pcstr, ucchmax: ULong): Bool =
    windowssysWindowsWin32SystemMemoryIsBadStringPtrA(lpsz.rawAddress.toCPointer<ByteVar>(), ucchmax)

public actual fun isBadStringPtrW(lpsz: Pcwstr, ucchmax: ULong): Bool =
    windowssysWindowsWin32SystemMemoryIsBadStringPtrW(lpsz.rawAddress.toCPointer<ByteVar>(), ucchmax)

public actual fun isBadWritePtr(lp: ConstPtr, ucb: ULong): Bool =
    windowssysWindowsWin32SystemMemoryIsBadWritePtr(lp.rawAddress.toCPointer<ByteVar>(), ucb)

public actual fun localAlloc(uflags: LocalAllocFlags, ubytes: ULong): Hlocal =
    MutPtr(windowssysWindowsWin32SystemMemoryLocalAlloc(uflags, ubytes)?.toLong() ?: 0L)

public actual fun localFlags(hmem: Hlocal): UInt =
    windowssysWindowsWin32SystemMemoryLocalFlags(hmem.rawAddress.toCPointer<ByteVar>())

public actual fun localHandle(pmem: ConstPtr): Hlocal =
    MutPtr(windowssysWindowsWin32SystemMemoryLocalHandle(pmem.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun localLock(hmem: Hlocal): MutPtr =
    MutPtr(windowssysWindowsWin32SystemMemoryLocalLock(hmem.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun localReAlloc(hmem: Hlocal, ubytes: ULong, uflags: UInt): Hlocal =
    MutPtr(windowssysWindowsWin32SystemMemoryLocalReAlloc(hmem.rawAddress.toCPointer<ByteVar>(), ubytes, uflags)?.toLong() ?: 0L)

public actual fun localSize(hmem: Hlocal): ULong =
    windowssysWindowsWin32SystemMemoryLocalSize(hmem.rawAddress.toCPointer<ByteVar>())

public actual fun localUnlock(hmem: Hlocal): Bool =
    windowssysWindowsWin32SystemMemoryLocalUnlock(hmem.rawAddress.toCPointer<ByteVar>())

public actual fun mapUserPhysicalPages(virtualaddress: ConstPtr, numberofpages: ULong, pagearray: ConstPtr): Bool =
    windowssysWindowsWin32SystemMemoryMapUserPhysicalPages(virtualaddress.rawAddress.toCPointer<ByteVar>(), numberofpages, pagearray.rawAddress.toCPointer<ByteVar>())

public actual fun mapUserPhysicalPagesScatter(virtualaddresses: ConstPtr, numberofpages: ULong, pagearray: ConstPtr): Bool =
    windowssysWindowsWin32SystemMemoryMapUserPhysicalPagesScatter(virtualaddresses.rawAddress.toCPointer<ByteVar>(), numberofpages, pagearray.rawAddress.toCPointer<ByteVar>())

public actual fun mapViewOfFile(hfilemappingobject: Handle, dwdesiredaccess: FileMap, dwfileoffsethigh: UInt, dwfileoffsetlow: UInt, dwnumberofbytestomap: ULong): MemoryMappedViewAddress =
    MemoryMappedViewAddress()

public actual fun mapViewOfFile3(filemapping: Handle, process: Handle, baseaddress: ConstPtr, offset: ULong, viewsize: ULong, allocationtype: VirtualAllocationType, pageprotection: UInt, extendedparameters: MutPtr, parametercount: UInt): MemoryMappedViewAddress =
    MemoryMappedViewAddress()

public actual fun mapViewOfFile3FromApp(filemapping: Handle, process: Handle, baseaddress: ConstPtr, offset: ULong, viewsize: ULong, allocationtype: VirtualAllocationType, pageprotection: UInt, extendedparameters: MutPtr, parametercount: UInt): MemoryMappedViewAddress =
    MemoryMappedViewAddress()

public actual fun mapViewOfFileEx(hfilemappingobject: Handle, dwdesiredaccess: FileMap, dwfileoffsethigh: UInt, dwfileoffsetlow: UInt, dwnumberofbytestomap: ULong, lpbaseaddress: ConstPtr): MemoryMappedViewAddress =
    MemoryMappedViewAddress()

public actual fun mapViewOfFileExNuma(hfilemappingobject: Handle, dwdesiredaccess: FileMap, dwfileoffsethigh: UInt, dwfileoffsetlow: UInt, dwnumberofbytestomap: ULong, lpbaseaddress: ConstPtr, nndpreferred: UInt): MemoryMappedViewAddress =
    MemoryMappedViewAddress()

public actual fun mapViewOfFileFromApp(hfilemappingobject: Handle, desiredaccess: FileMap, fileoffset: ULong, numberofbytestomap: ULong): MemoryMappedViewAddress =
    MemoryMappedViewAddress()

public actual fun mapViewOfFileNuma2(filemappinghandle: Handle, processhandle: Handle, offset: ULong, baseaddress: ConstPtr, viewsize: ULong, allocationtype: UInt, pageprotection: UInt, preferrednode: UInt): MemoryMappedViewAddress =
    MemoryMappedViewAddress()

public actual fun offerVirtualMemory(virtualaddress: MutPtr, size: ULong, priority: OfferPriority): UInt =
    windowssysWindowsWin32SystemMemoryOfferVirtualMemory(virtualaddress.rawAddress.toCPointer<ByteVar>(), size, priority)

public actual fun openDedicatedMemoryPartition(partition: Handle, dedicatedmemorytypeid: ULong, desiredaccess: UInt, inherithandle: Bool): Handle =
    MutPtr(windowssysWindowsWin32SystemMemoryOpenDedicatedMemoryPartition(partition.rawAddress.toCPointer<ByteVar>(), dedicatedmemorytypeid, desiredaccess, inherithandle)?.toLong() ?: 0L)

public actual fun openFileMappingA(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcstr): Handle =
    MutPtr(windowssysWindowsWin32SystemMemoryOpenFileMappingA(dwdesiredaccess, binherithandle, lpname.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun openFileMappingFromApp(desiredaccess: UInt, inherithandle: Bool, name: Pcwstr): Handle =
    MutPtr(windowssysWindowsWin32SystemMemoryOpenFileMappingFromApp(desiredaccess, inherithandle, name.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun openFileMappingW(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcwstr): Handle =
    MutPtr(windowssysWindowsWin32SystemMemoryOpenFileMappingW(dwdesiredaccess, binherithandle, lpname.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun prefetchVirtualMemory(hprocess: Handle, numberofentries: ULong, virtualaddresses: ConstPtr, flags: UInt): Bool =
    windowssysWindowsWin32SystemMemoryPrefetchVirtualMemory(hprocess.rawAddress.toCPointer<ByteVar>(), numberofentries, virtualaddresses.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun queryMemoryResourceNotification(resourcenotificationhandle: Handle, resourcestate: MutPtr): Bool =
    windowssysWindowsWin32SystemMemoryQueryMemoryResourceNotification(resourcenotificationhandle.rawAddress.toCPointer<ByteVar>(), resourcestate.rawAddress.toCPointer<ByteVar>())

public actual fun queryPartitionInformation(partition: Handle, partitioninformationclass: Win32MemoryPartitionInformationClass, partitioninformation: MutPtr, partitioninformationlength: UInt): Bool =
    windowssysWindowsWin32SystemMemoryQueryPartitionInformation(partition.rawAddress.toCPointer<ByteVar>(), partitioninformationclass, partitioninformation.rawAddress.toCPointer<ByteVar>(), partitioninformationlength)

public actual fun queryVirtualMemoryInformation(process: Handle, virtualaddress: ConstPtr, memoryinformationclass: Win32MemoryInformationClass, memoryinformation: MutPtr, memoryinformationsize: ULong, returnsize: MutPtr): Bool =
    windowssysWindowsWin32SystemMemoryQueryVirtualMemoryInformation(process.rawAddress.toCPointer<ByteVar>(), virtualaddress.rawAddress.toCPointer<ByteVar>(), memoryinformationclass, memoryinformation.rawAddress.toCPointer<ByteVar>(), memoryinformationsize, returnsize.rawAddress.toCPointer<ByteVar>())

public actual fun reclaimVirtualMemory(virtualaddress: ConstPtr, size: ULong): UInt =
    windowssysWindowsWin32SystemMemoryReclaimVirtualMemory(virtualaddress.rawAddress.toCPointer<ByteVar>(), size)

public actual fun registerBadMemoryNotification(callback: PbadMemoryCallbackRoutine): MutPtr =
    MutPtr(windowssysWindowsWin32SystemMemoryRegisterBadMemoryNotification(0L.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun removeSecureMemoryCacheCallback(pfncallback: PsecureMemoryCacheCallback): Bool =
    windowssysWindowsWin32SystemMemoryRemoveSecureMemoryCacheCallback(0L.toCPointer<ByteVar>())

public actual fun resetWriteWatch(lpbaseaddress: ConstPtr, dwregionsize: ULong): UInt =
    windowssysWindowsWin32SystemMemoryResetWriteWatch(lpbaseaddress.rawAddress.toCPointer<ByteVar>(), dwregionsize)

public actual fun rtlCompareMemory(source1: ConstPtr, source2: ConstPtr, length: ULong): ULong =
    windowssysWindowsWin32SystemMemoryRtlCompareMemory(source1.rawAddress.toCPointer<ByteVar>(), source2.rawAddress.toCPointer<ByteVar>(), length)

public actual fun rtlCrc32(buffer: ConstPtr, size: ULong, initialcrc: UInt): UInt =
    windowssysWindowsWin32SystemMemoryRtlCrc32(buffer.rawAddress.toCPointer<ByteVar>(), size, initialcrc)

public actual fun rtlCrc64(buffer: ConstPtr, size: ULong, initialcrc: ULong): ULong =
    windowssysWindowsWin32SystemMemoryRtlCrc64(buffer.rawAddress.toCPointer<ByteVar>(), size, initialcrc)

public actual fun rtlIsZeroMemory(buffer: ConstPtr, length: ULong): Boolean =
    windowssysWindowsWin32SystemMemoryRtlIsZeroMemory(buffer.rawAddress.toCPointer<ByteVar>(), length)

public actual fun setProcessValidCallTargets(hprocess: Handle, virtualaddress: ConstPtr, regionsize: ULong, numberofoffsets: UInt, offsetinformation: MutPtr): Bool =
    windowssysWindowsWin32SystemMemorySetProcessValidCallTargets(hprocess.rawAddress.toCPointer<ByteVar>(), virtualaddress.rawAddress.toCPointer<ByteVar>(), regionsize, numberofoffsets, offsetinformation.rawAddress.toCPointer<ByteVar>())

public actual fun setProcessValidCallTargetsForMappedView(process: Handle, virtualaddress: ConstPtr, regionsize: ULong, numberofoffsets: UInt, offsetinformation: MutPtr, section: Handle, expectedfileoffset: ULong): Bool =
    windowssysWindowsWin32SystemMemorySetProcessValidCallTargetsForMappedView(process.rawAddress.toCPointer<ByteVar>(), virtualaddress.rawAddress.toCPointer<ByteVar>(), regionsize, numberofoffsets, offsetinformation.rawAddress.toCPointer<ByteVar>(), section.rawAddress.toCPointer<ByteVar>(), expectedfileoffset)

public actual fun setProcessWorkingSetSizeEx(hprocess: Handle, dwminimumworkingsetsize: ULong, dwmaximumworkingsetsize: ULong, flags: SetprocessworkingsetsizeexFlags): Bool =
    windowssysWindowsWin32SystemMemorySetProcessWorkingSetSizeEx(hprocess.rawAddress.toCPointer<ByteVar>(), dwminimumworkingsetsize, dwmaximumworkingsetsize, flags)

public actual fun setSystemFileCacheSize(minimumfilecachesize: ULong, maximumfilecachesize: ULong, flags: UInt): Bool =
    windowssysWindowsWin32SystemMemorySetSystemFileCacheSize(minimumfilecachesize, maximumfilecachesize, flags)

public actual fun unmapViewOfFile(lpbaseaddress: MemoryMappedViewAddress): Bool =
    0

public actual fun unmapViewOfFile2(process: Handle, baseaddress: MemoryMappedViewAddress, unmapflags: UnmapViewOfFileFlags): Bool =
    0

public actual fun unmapViewOfFileEx(baseaddress: MemoryMappedViewAddress, unmapflags: UnmapViewOfFileFlags): Bool =
    0

public actual fun unregisterBadMemoryNotification(registrationhandle: ConstPtr): Bool =
    windowssysWindowsWin32SystemMemoryUnregisterBadMemoryNotification(registrationhandle.rawAddress.toCPointer<ByteVar>())

public actual fun virtualAlloc(lpaddress: ConstPtr, dwsize: ULong, flallocationtype: VirtualAllocationType, flprotect: PageProtectionFlags): MutPtr =
    MutPtr(windowssysWindowsWin32SystemMemoryVirtualAlloc(lpaddress.rawAddress.toCPointer<ByteVar>(), dwsize, flallocationtype, flprotect)?.toLong() ?: 0L)

public actual fun virtualAlloc2(process: Handle, baseaddress: ConstPtr, size: ULong, allocationtype: VirtualAllocationType, pageprotection: UInt, extendedparameters: MutPtr, parametercount: UInt): MutPtr =
    MutPtr(windowssysWindowsWin32SystemMemoryVirtualAlloc2(process.rawAddress.toCPointer<ByteVar>(), baseaddress.rawAddress.toCPointer<ByteVar>(), size, allocationtype, pageprotection, extendedparameters.rawAddress.toCPointer<ByteVar>(), parametercount)?.toLong() ?: 0L)

public actual fun virtualAlloc2FromApp(process: Handle, baseaddress: ConstPtr, size: ULong, allocationtype: VirtualAllocationType, pageprotection: UInt, extendedparameters: MutPtr, parametercount: UInt): MutPtr =
    MutPtr(windowssysWindowsWin32SystemMemoryVirtualAlloc2FromApp(process.rawAddress.toCPointer<ByteVar>(), baseaddress.rawAddress.toCPointer<ByteVar>(), size, allocationtype, pageprotection, extendedparameters.rawAddress.toCPointer<ByteVar>(), parametercount)?.toLong() ?: 0L)

public actual fun virtualAllocEx(hprocess: Handle, lpaddress: ConstPtr, dwsize: ULong, flallocationtype: VirtualAllocationType, flprotect: PageProtectionFlags): MutPtr =
    MutPtr(windowssysWindowsWin32SystemMemoryVirtualAllocEx(hprocess.rawAddress.toCPointer<ByteVar>(), lpaddress.rawAddress.toCPointer<ByteVar>(), dwsize, flallocationtype, flprotect)?.toLong() ?: 0L)

public actual fun virtualAllocExNuma(hprocess: Handle, lpaddress: ConstPtr, dwsize: ULong, flallocationtype: VirtualAllocationType, flprotect: UInt, nndpreferred: UInt): MutPtr =
    MutPtr(windowssysWindowsWin32SystemMemoryVirtualAllocExNuma(hprocess.rawAddress.toCPointer<ByteVar>(), lpaddress.rawAddress.toCPointer<ByteVar>(), dwsize, flallocationtype, flprotect, nndpreferred)?.toLong() ?: 0L)

public actual fun virtualAllocFromApp(baseaddress: ConstPtr, size: ULong, allocationtype: VirtualAllocationType, protection: UInt): MutPtr =
    MutPtr(windowssysWindowsWin32SystemMemoryVirtualAllocFromApp(baseaddress.rawAddress.toCPointer<ByteVar>(), size, allocationtype, protection)?.toLong() ?: 0L)

public actual fun virtualFree(lpaddress: MutPtr, dwsize: ULong, dwfreetype: VirtualFreeType): Bool =
    windowssysWindowsWin32SystemMemoryVirtualFree(lpaddress.rawAddress.toCPointer<ByteVar>(), dwsize, dwfreetype)

public actual fun virtualFreeEx(hprocess: Handle, lpaddress: MutPtr, dwsize: ULong, dwfreetype: VirtualFreeType): Bool =
    windowssysWindowsWin32SystemMemoryVirtualFreeEx(hprocess.rawAddress.toCPointer<ByteVar>(), lpaddress.rawAddress.toCPointer<ByteVar>(), dwsize, dwfreetype)

public actual fun virtualLock(lpaddress: ConstPtr, dwsize: ULong): Bool =
    windowssysWindowsWin32SystemMemoryVirtualLock(lpaddress.rawAddress.toCPointer<ByteVar>(), dwsize)

public actual fun virtualProtect(lpaddress: ConstPtr, dwsize: ULong, flnewprotect: PageProtectionFlags, lpfloldprotect: MutPtr): Bool =
    windowssysWindowsWin32SystemMemoryVirtualProtect(lpaddress.rawAddress.toCPointer<ByteVar>(), dwsize, flnewprotect, lpfloldprotect.rawAddress.toCPointer<ByteVar>())

public actual fun virtualProtectEx(hprocess: Handle, lpaddress: ConstPtr, dwsize: ULong, flnewprotect: PageProtectionFlags, lpfloldprotect: MutPtr): Bool =
    windowssysWindowsWin32SystemMemoryVirtualProtectEx(hprocess.rawAddress.toCPointer<ByteVar>(), lpaddress.rawAddress.toCPointer<ByteVar>(), dwsize, flnewprotect, lpfloldprotect.rawAddress.toCPointer<ByteVar>())

public actual fun virtualProtectFromApp(address: ConstPtr, size: ULong, newprotection: UInt, oldprotection: MutPtr): Bool =
    windowssysWindowsWin32SystemMemoryVirtualProtectFromApp(address.rawAddress.toCPointer<ByteVar>(), size, newprotection, oldprotection.rawAddress.toCPointer<ByteVar>())

public actual fun virtualQuery(lpaddress: ConstPtr, lpbuffer: MutPtr, dwlength: ULong): ULong =
    windowssysWindowsWin32SystemMemoryVirtualQuery(lpaddress.rawAddress.toCPointer<ByteVar>(), lpbuffer.rawAddress.toCPointer<ByteVar>(), dwlength)

public actual fun virtualQueryEx(hprocess: Handle, lpaddress: ConstPtr, lpbuffer: MutPtr, dwlength: ULong): ULong =
    windowssysWindowsWin32SystemMemoryVirtualQueryEx(hprocess.rawAddress.toCPointer<ByteVar>(), lpaddress.rawAddress.toCPointer<ByteVar>(), lpbuffer.rawAddress.toCPointer<ByteVar>(), dwlength)

public actual fun virtualUnlock(lpaddress: ConstPtr, dwsize: ULong): Bool =
    windowssysWindowsWin32SystemMemoryVirtualUnlock(lpaddress.rawAddress.toCPointer<ByteVar>(), dwsize)

public actual fun virtualUnlockEx(process: Handle, address: ConstPtr, size: ULong): Bool =
    windowssysWindowsWin32SystemMemoryVirtualUnlockEx(process.rawAddress.toCPointer<ByteVar>(), address.rawAddress.toCPointer<ByteVar>(), size)
