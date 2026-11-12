@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.memory

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Farproc
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hglobal
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hlocal
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityAttributes

private object WindowsWin32SystemMemoryJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryAddSecureMemoryCacheCallback(pfncallback: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryAllocateUserPhysicalPages(hprocess: Long, numberofpages: Long, pagearray: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryAllocateUserPhysicalPages2(objecthandle: Long, numberofpages: Long, pagearray: Long, extendedparameters: Long, extendedparametercount: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryAllocateUserPhysicalPagesNuma(hprocess: Long, numberofpages: Long, pagearray: Long, nndpreferred: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryCreateFileMapping2(file: Long, securityattributes: Long, desiredaccess: Int, pageprotection: Int, allocationattributes: Int, maximumsize: Long, name: Long, extendedparameters: Long, parametercount: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryCreateFileMappingA(hfile: Long, lpfilemappingattributes: Long, flprotect: Int, dwmaximumsizehigh: Int, dwmaximumsizelow: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryCreateFileMappingFromApp(hfile: Long, securityattributes: Long, pageprotection: Int, maximumsize: Long, name: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryCreateFileMappingNumaA(hfile: Long, lpfilemappingattributes: Long, flprotect: Int, dwmaximumsizehigh: Int, dwmaximumsizelow: Int, lpname: Long, nndpreferred: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryCreateFileMappingNumaW(hfile: Long, lpfilemappingattributes: Long, flprotect: Int, dwmaximumsizehigh: Int, dwmaximumsizelow: Int, lpname: Long, nndpreferred: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryCreateFileMappingW(hfile: Long, lpfilemappingattributes: Long, flprotect: Int, dwmaximumsizehigh: Int, dwmaximumsizelow: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryCreateMemoryResourceNotification(notificationtype: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryDiscardVirtualMemory(virtualaddress: Long, size: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryFlushViewOfFile(lpbaseaddress: Long, dwnumberofbytestoflush: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryFreeUserPhysicalPages(hprocess: Long, numberofpages: Long, pagearray: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryGetLargePageMinimum(): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryGetMemoryErrorHandlingCapabilities(capabilities: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryGetProcessHeap(): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryGetProcessHeaps(numberofheaps: Int, processheaps: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryGetProcessWorkingSetSizeEx(hprocess: Long, lpminimumworkingsetsize: Long, lpmaximumworkingsetsize: Long, flags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryGetSystemFileCacheSize(lpminimumfilecachesize: Long, lpmaximumfilecachesize: Long, lpflags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryGetWriteWatch(dwflags: Int, lpbaseaddress: Long, dwregionsize: Long, lpaddresses: Long, lpdwcount: Long, lpdwgranularity: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryGlobalAlloc(uflags: Int, dwbytes: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryGlobalFlags(hmem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryGlobalHandle(pmem: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryGlobalLock(hmem: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryGlobalReAlloc(hmem: Long, dwbytes: Long, uflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryGlobalSize(hmem: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryGlobalUnlock(hmem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryHeapAlloc(hheap: Long, dwflags: Int, dwbytes: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryHeapCompact(hheap: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryHeapCreate(floptions: Int, dwinitialsize: Long, dwmaximumsize: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryHeapDestroy(hheap: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryHeapFree(hheap: Long, dwflags: Int, lpmem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryHeapLock(hheap: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryHeapQueryInformation(heaphandle: Long, heapinformationclass: Int, heapinformation: Long, heapinformationlength: Long, returnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryHeapReAlloc(hheap: Long, dwflags: Int, lpmem: Long, dwbytes: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryHeapSetInformation(heaphandle: Long, heapinformationclass: Int, heapinformation: Long, heapinformationlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryHeapSize(hheap: Long, dwflags: Int, lpmem: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryHeapSummary(hheap: Long, dwflags: Int, lpsummary: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryHeapUnlock(hheap: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryHeapValidate(hheap: Long, dwflags: Int, lpmem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryHeapWalk(hheap: Long, lpentry: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryIsBadReadPtr(lp: Long, ucb: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryIsBadStringPtrA(lpsz: Long, ucchmax: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryIsBadStringPtrW(lpsz: Long, ucchmax: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryIsBadWritePtr(lp: Long, ucb: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryLocalAlloc(uflags: Int, ubytes: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryLocalFlags(hmem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryLocalHandle(pmem: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryLocalLock(hmem: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryLocalReAlloc(hmem: Long, ubytes: Long, uflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryLocalSize(hmem: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryLocalUnlock(hmem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryMapUserPhysicalPages(virtualaddress: Long, numberofpages: Long, pagearray: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryMapUserPhysicalPagesScatter(virtualaddresses: Long, numberofpages: Long, pagearray: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryOfferVirtualMemory(virtualaddress: Long, size: Long, priority: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryOpenDedicatedMemoryPartition(partition: Long, dedicatedmemorytypeid: Long, desiredaccess: Int, inherithandle: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryOpenFileMappingA(dwdesiredaccess: Int, binherithandle: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryOpenFileMappingFromApp(desiredaccess: Int, inherithandle: Int, name: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryOpenFileMappingW(dwdesiredaccess: Int, binherithandle: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryPrefetchVirtualMemory(hprocess: Long, numberofentries: Long, virtualaddresses: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryQueryMemoryResourceNotification(resourcenotificationhandle: Long, resourcestate: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryQueryPartitionInformation(partition: Long, partitioninformationclass: Int, partitioninformation: Long, partitioninformationlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryQueryVirtualMemoryInformation(process: Long, virtualaddress: Long, memoryinformationclass: Int, memoryinformation: Long, memoryinformationsize: Long, returnsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryReclaimVirtualMemory(virtualaddress: Long, size: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryRegisterBadMemoryNotification(callback: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryRemoveSecureMemoryCacheCallback(pfncallback: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryResetWriteWatch(lpbaseaddress: Long, dwregionsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryRtlCompareMemory(source1: Long, source2: Long, length: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryRtlCrc32(buffer: Long, size: Long, initialcrc: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryRtlCrc64(buffer: Long, size: Long, initialcrc: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryRtlIsZeroMemory(buffer: Long, length: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemorySetProcessValidCallTargets(hprocess: Long, virtualaddress: Long, regionsize: Long, numberofoffsets: Int, offsetinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemorySetProcessValidCallTargetsForMappedView(process: Long, virtualaddress: Long, regionsize: Long, numberofoffsets: Int, offsetinformation: Long, section: Long, expectedfileoffset: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemorySetProcessWorkingSetSizeEx(hprocess: Long, dwminimumworkingsetsize: Long, dwmaximumworkingsetsize: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemorySetSystemFileCacheSize(minimumfilecachesize: Long, maximumfilecachesize: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryUnregisterBadMemoryNotification(registrationhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryVirtualAlloc(lpaddress: Long, dwsize: Long, flallocationtype: Int, flprotect: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryVirtualAlloc2(process: Long, baseaddress: Long, size: Long, allocationtype: Int, pageprotection: Int, extendedparameters: Long, parametercount: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryVirtualAlloc2FromApp(process: Long, baseaddress: Long, size: Long, allocationtype: Int, pageprotection: Int, extendedparameters: Long, parametercount: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryVirtualAllocEx(hprocess: Long, lpaddress: Long, dwsize: Long, flallocationtype: Int, flprotect: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryVirtualAllocExNuma(hprocess: Long, lpaddress: Long, dwsize: Long, flallocationtype: Int, flprotect: Int, nndpreferred: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryVirtualAllocFromApp(baseaddress: Long, size: Long, allocationtype: Int, protection: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryVirtualFree(lpaddress: Long, dwsize: Long, dwfreetype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryVirtualFreeEx(hprocess: Long, lpaddress: Long, dwsize: Long, dwfreetype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryVirtualLock(lpaddress: Long, dwsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryVirtualProtect(lpaddress: Long, dwsize: Long, flnewprotect: Int, lpfloldprotect: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryVirtualProtectEx(hprocess: Long, lpaddress: Long, dwsize: Long, flnewprotect: Int, lpfloldprotect: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryVirtualProtectFromApp(address: Long, size: Long, newprotection: Int, oldprotection: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryVirtualQuery(lpaddress: Long, lpbuffer: Long, dwlength: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryVirtualQueryEx(hprocess: Long, lpaddress: Long, lpbuffer: Long, dwlength: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryVirtualUnlock(lpaddress: Long, dwsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryVirtualUnlockEx(process: Long, address: Long, size: Long): Int
}

public actual fun addSecureMemoryCacheCallback(pfncallback: PsecureMemoryCacheCallback): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryAddSecureMemoryCacheCallback(0L)

public actual fun allocateUserPhysicalPages(hprocess: Handle, numberofpages: MutPtr<ULong>, pagearray: MutPtr<ULong>): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryAllocateUserPhysicalPages(hprocess.rawAddress, numberofpages.rawAddress, pagearray.rawAddress)

public actual fun allocateUserPhysicalPages2(objecthandle: Handle, numberofpages: MutPtr<ULong>, pagearray: MutPtr<ULong>, extendedparameters: MutPtr<MemExtendedParameter>, extendedparametercount: UInt): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryAllocateUserPhysicalPages2(objecthandle.rawAddress, numberofpages.rawAddress, pagearray.rawAddress, extendedparameters.rawAddress, extendedparametercount.toInt())

public actual fun allocateUserPhysicalPagesNuma(hprocess: Handle, numberofpages: MutPtr<ULong>, pagearray: MutPtr<ULong>, nndpreferred: UInt): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryAllocateUserPhysicalPagesNuma(hprocess.rawAddress, numberofpages.rawAddress, pagearray.rawAddress, nndpreferred.toInt())

public actual fun createFileMapping2(file: Handle, securityattributes: ConstPtr<SecurityAttributes>, desiredaccess: UInt, pageprotection: PageProtectionFlags, allocationattributes: UInt, maximumsize: ULong, name: Pcwstr, extendedparameters: MutPtr<MemExtendedParameter>, parametercount: UInt): Handle =
    MutPtr(WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryCreateFileMapping2(file.rawAddress, securityattributes.rawAddress, desiredaccess.toInt(), pageprotection.toInt(), allocationattributes.toInt(), maximumsize.toLong(), name.rawAddress, extendedparameters.rawAddress, parametercount.toInt()))

public actual fun createFileMappingA(hfile: Handle, lpfilemappingattributes: ConstPtr<SecurityAttributes>, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcstr): Handle =
    MutPtr(WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryCreateFileMappingA(hfile.rawAddress, lpfilemappingattributes.rawAddress, flprotect.toInt(), dwmaximumsizehigh.toInt(), dwmaximumsizelow.toInt(), lpname.rawAddress))

public actual fun createFileMappingFromApp(hfile: Handle, securityattributes: ConstPtr<SecurityAttributes>, pageprotection: PageProtectionFlags, maximumsize: ULong, name: Pcwstr): Handle =
    MutPtr(WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryCreateFileMappingFromApp(hfile.rawAddress, securityattributes.rawAddress, pageprotection.toInt(), maximumsize.toLong(), name.rawAddress))

public actual fun createFileMappingNumaA(hfile: Handle, lpfilemappingattributes: ConstPtr<SecurityAttributes>, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcstr, nndpreferred: UInt): Handle =
    MutPtr(WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryCreateFileMappingNumaA(hfile.rawAddress, lpfilemappingattributes.rawAddress, flprotect.toInt(), dwmaximumsizehigh.toInt(), dwmaximumsizelow.toInt(), lpname.rawAddress, nndpreferred.toInt()))

public actual fun createFileMappingNumaW(hfile: Handle, lpfilemappingattributes: ConstPtr<SecurityAttributes>, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcwstr, nndpreferred: UInt): Handle =
    MutPtr(WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryCreateFileMappingNumaW(hfile.rawAddress, lpfilemappingattributes.rawAddress, flprotect.toInt(), dwmaximumsizehigh.toInt(), dwmaximumsizelow.toInt(), lpname.rawAddress, nndpreferred.toInt()))

public actual fun createFileMappingW(hfile: Handle, lpfilemappingattributes: ConstPtr<SecurityAttributes>, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcwstr): Handle =
    MutPtr(WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryCreateFileMappingW(hfile.rawAddress, lpfilemappingattributes.rawAddress, flprotect.toInt(), dwmaximumsizehigh.toInt(), dwmaximumsizelow.toInt(), lpname.rawAddress))

public actual fun createMemoryResourceNotification(notificationtype: MemoryResourceNotificationType): Handle =
    MutPtr(WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryCreateMemoryResourceNotification(notificationtype))

public actual fun discardVirtualMemory(virtualaddress: MutPtr<CVoid>, size: ULong): UInt =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryDiscardVirtualMemory(virtualaddress.rawAddress, size.toLong()).toUInt()

public actual fun flushViewOfFile(lpbaseaddress: ConstPtr<CVoid>, dwnumberofbytestoflush: ULong): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryFlushViewOfFile(lpbaseaddress.rawAddress, dwnumberofbytestoflush.toLong())

public actual fun freeUserPhysicalPages(hprocess: Handle, numberofpages: MutPtr<ULong>, pagearray: ConstPtr<ULong>): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryFreeUserPhysicalPages(hprocess.rawAddress, numberofpages.rawAddress, pagearray.rawAddress)

public actual fun getLargePageMinimum(): ULong =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryGetLargePageMinimum().toULong()

public actual fun getMemoryErrorHandlingCapabilities(capabilities: MutPtr<UInt>): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryGetMemoryErrorHandlingCapabilities(capabilities.rawAddress)

public actual fun getProcessHeap(): Handle =
    MutPtr(WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryGetProcessHeap())

public actual fun getProcessHeaps(numberofheaps: UInt, processheaps: MutPtr<Handle>): UInt =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryGetProcessHeaps(numberofheaps.toInt(), processheaps.rawAddress).toUInt()

public actual fun getProcessWorkingSetSizeEx(hprocess: Handle, lpminimumworkingsetsize: MutPtr<ULong>, lpmaximumworkingsetsize: MutPtr<ULong>, flags: MutPtr<UInt>): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryGetProcessWorkingSetSizeEx(hprocess.rawAddress, lpminimumworkingsetsize.rawAddress, lpmaximumworkingsetsize.rawAddress, flags.rawAddress)

public actual fun getSystemFileCacheSize(lpminimumfilecachesize: MutPtr<ULong>, lpmaximumfilecachesize: MutPtr<ULong>, lpflags: MutPtr<UInt>): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryGetSystemFileCacheSize(lpminimumfilecachesize.rawAddress, lpmaximumfilecachesize.rawAddress, lpflags.rawAddress)

public actual fun getWriteWatch(dwflags: UInt, lpbaseaddress: ConstPtr<CVoid>, dwregionsize: ULong, lpaddresses: MutPtr<MutPtr<CVoid>>, lpdwcount: MutPtr<ULong>, lpdwgranularity: MutPtr<UInt>): UInt =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryGetWriteWatch(dwflags.toInt(), lpbaseaddress.rawAddress, dwregionsize.toLong(), lpaddresses.rawAddress, lpdwcount.rawAddress, lpdwgranularity.rawAddress).toUInt()

public actual fun globalAlloc(uflags: GlobalAllocFlags, dwbytes: ULong): Hglobal =
    MutPtr(WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryGlobalAlloc(uflags.toInt(), dwbytes.toLong()))

public actual fun globalFlags(hmem: Hglobal): UInt =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryGlobalFlags(hmem.rawAddress).toUInt()

public actual fun globalHandle(pmem: ConstPtr<CVoid>): Hglobal =
    MutPtr(WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryGlobalHandle(pmem.rawAddress))

public actual fun globalLock(hmem: Hglobal): MutPtr<CVoid> =
    MutPtr(WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryGlobalLock(hmem.rawAddress))

public actual fun globalReAlloc(hmem: Hglobal, dwbytes: ULong, uflags: UInt): Hglobal =
    MutPtr(WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryGlobalReAlloc(hmem.rawAddress, dwbytes.toLong(), uflags.toInt()))

public actual fun globalSize(hmem: Hglobal): ULong =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryGlobalSize(hmem.rawAddress).toULong()

public actual fun globalUnlock(hmem: Hglobal): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryGlobalUnlock(hmem.rawAddress)

public actual fun heapAlloc(hheap: Handle, dwflags: HeapFlags, dwbytes: ULong): MutPtr<CVoid> =
    MutPtr(WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryHeapAlloc(hheap.rawAddress, dwflags.toInt(), dwbytes.toLong()))

public actual fun heapCompact(hheap: Handle, dwflags: HeapFlags): ULong =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryHeapCompact(hheap.rawAddress, dwflags.toInt()).toULong()

public actual fun heapCreate(floptions: HeapFlags, dwinitialsize: ULong, dwmaximumsize: ULong): Handle =
    MutPtr(WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryHeapCreate(floptions.toInt(), dwinitialsize.toLong(), dwmaximumsize.toLong()))

public actual fun heapDestroy(hheap: Handle): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryHeapDestroy(hheap.rawAddress)

public actual fun heapFree(hheap: Handle, dwflags: HeapFlags, lpmem: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryHeapFree(hheap.rawAddress, dwflags.toInt(), lpmem.rawAddress)

public actual fun heapLock(hheap: Handle): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryHeapLock(hheap.rawAddress)

public actual fun heapQueryInformation(heaphandle: Handle, heapinformationclass: HeapInformationClass, heapinformation: MutPtr<CVoid>, heapinformationlength: ULong, returnlength: MutPtr<ULong>): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryHeapQueryInformation(heaphandle.rawAddress, heapinformationclass, heapinformation.rawAddress, heapinformationlength.toLong(), returnlength.rawAddress)

public actual fun heapReAlloc(hheap: Handle, dwflags: HeapFlags, lpmem: ConstPtr<CVoid>, dwbytes: ULong): MutPtr<CVoid> =
    MutPtr(WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryHeapReAlloc(hheap.rawAddress, dwflags.toInt(), lpmem.rawAddress, dwbytes.toLong()))

public actual fun heapSetInformation(heaphandle: Handle, heapinformationclass: HeapInformationClass, heapinformation: ConstPtr<CVoid>, heapinformationlength: ULong): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryHeapSetInformation(heaphandle.rawAddress, heapinformationclass, heapinformation.rawAddress, heapinformationlength.toLong())

public actual fun heapSize(hheap: Handle, dwflags: HeapFlags, lpmem: ConstPtr<CVoid>): ULong =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryHeapSize(hheap.rawAddress, dwflags.toInt(), lpmem.rawAddress).toULong()

public actual fun heapSummary(hheap: Handle, dwflags: UInt, lpsummary: MutPtr<HeapSummary>): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryHeapSummary(hheap.rawAddress, dwflags.toInt(), lpsummary.rawAddress)

public actual fun heapUnlock(hheap: Handle): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryHeapUnlock(hheap.rawAddress)

public actual fun heapValidate(hheap: Handle, dwflags: HeapFlags, lpmem: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryHeapValidate(hheap.rawAddress, dwflags.toInt(), lpmem.rawAddress)

public actual fun heapWalk(hheap: Handle, lpentry: MutPtr<ProcessHeapEntry>): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryHeapWalk(hheap.rawAddress, lpentry.rawAddress)

public actual fun isBadCodePtr(lpfn: Farproc): Bool =
    0

public actual fun isBadReadPtr(lp: ConstPtr<CVoid>, ucb: ULong): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryIsBadReadPtr(lp.rawAddress, ucb.toLong())

public actual fun isBadStringPtrA(lpsz: Pcstr, ucchmax: ULong): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryIsBadStringPtrA(lpsz.rawAddress, ucchmax.toLong())

public actual fun isBadStringPtrW(lpsz: Pcwstr, ucchmax: ULong): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryIsBadStringPtrW(lpsz.rawAddress, ucchmax.toLong())

public actual fun isBadWritePtr(lp: ConstPtr<CVoid>, ucb: ULong): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryIsBadWritePtr(lp.rawAddress, ucb.toLong())

public actual fun localAlloc(uflags: LocalAllocFlags, ubytes: ULong): Hlocal =
    MutPtr(WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryLocalAlloc(uflags.toInt(), ubytes.toLong()))

public actual fun localFlags(hmem: Hlocal): UInt =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryLocalFlags(hmem.rawAddress).toUInt()

public actual fun localHandle(pmem: ConstPtr<CVoid>): Hlocal =
    MutPtr(WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryLocalHandle(pmem.rawAddress))

public actual fun localLock(hmem: Hlocal): MutPtr<CVoid> =
    MutPtr(WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryLocalLock(hmem.rawAddress))

public actual fun localReAlloc(hmem: Hlocal, ubytes: ULong, uflags: UInt): Hlocal =
    MutPtr(WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryLocalReAlloc(hmem.rawAddress, ubytes.toLong(), uflags.toInt()))

public actual fun localSize(hmem: Hlocal): ULong =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryLocalSize(hmem.rawAddress).toULong()

public actual fun localUnlock(hmem: Hlocal): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryLocalUnlock(hmem.rawAddress)

public actual fun mapUserPhysicalPages(virtualaddress: ConstPtr<CVoid>, numberofpages: ULong, pagearray: ConstPtr<ULong>): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryMapUserPhysicalPages(virtualaddress.rawAddress, numberofpages.toLong(), pagearray.rawAddress)

public actual fun mapUserPhysicalPagesScatter(virtualaddresses: ConstPtr<ConstPtr<CVoid>>, numberofpages: ULong, pagearray: ConstPtr<ULong>): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryMapUserPhysicalPagesScatter(virtualaddresses.rawAddress, numberofpages.toLong(), pagearray.rawAddress)

public actual fun mapViewOfFile(hfilemappingobject: Handle, dwdesiredaccess: FileMap, dwfileoffsethigh: UInt, dwfileoffsetlow: UInt, dwnumberofbytestomap: ULong): MemoryMappedViewAddress =
    MemoryMappedViewAddress()

public actual fun mapViewOfFile3(filemapping: Handle, process: Handle, baseaddress: ConstPtr<CVoid>, offset: ULong, viewsize: ULong, allocationtype: VirtualAllocationType, pageprotection: UInt, extendedparameters: MutPtr<MemExtendedParameter>, parametercount: UInt): MemoryMappedViewAddress =
    MemoryMappedViewAddress()

public actual fun mapViewOfFile3FromApp(filemapping: Handle, process: Handle, baseaddress: ConstPtr<CVoid>, offset: ULong, viewsize: ULong, allocationtype: VirtualAllocationType, pageprotection: UInt, extendedparameters: MutPtr<MemExtendedParameter>, parametercount: UInt): MemoryMappedViewAddress =
    MemoryMappedViewAddress()

public actual fun mapViewOfFileEx(hfilemappingobject: Handle, dwdesiredaccess: FileMap, dwfileoffsethigh: UInt, dwfileoffsetlow: UInt, dwnumberofbytestomap: ULong, lpbaseaddress: ConstPtr<CVoid>): MemoryMappedViewAddress =
    MemoryMappedViewAddress()

public actual fun mapViewOfFileExNuma(hfilemappingobject: Handle, dwdesiredaccess: FileMap, dwfileoffsethigh: UInt, dwfileoffsetlow: UInt, dwnumberofbytestomap: ULong, lpbaseaddress: ConstPtr<CVoid>, nndpreferred: UInt): MemoryMappedViewAddress =
    MemoryMappedViewAddress()

public actual fun mapViewOfFileFromApp(hfilemappingobject: Handle, desiredaccess: FileMap, fileoffset: ULong, numberofbytestomap: ULong): MemoryMappedViewAddress =
    MemoryMappedViewAddress()

public actual fun mapViewOfFileNuma2(filemappinghandle: Handle, processhandle: Handle, offset: ULong, baseaddress: ConstPtr<CVoid>, viewsize: ULong, allocationtype: UInt, pageprotection: UInt, preferrednode: UInt): MemoryMappedViewAddress =
    MemoryMappedViewAddress()

public actual fun offerVirtualMemory(virtualaddress: MutPtr<CVoid>, size: ULong, priority: OfferPriority): UInt =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryOfferVirtualMemory(virtualaddress.rawAddress, size.toLong(), priority).toUInt()

public actual fun openDedicatedMemoryPartition(partition: Handle, dedicatedmemorytypeid: ULong, desiredaccess: UInt, inherithandle: Bool): Handle =
    MutPtr(WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryOpenDedicatedMemoryPartition(partition.rawAddress, dedicatedmemorytypeid.toLong(), desiredaccess.toInt(), inherithandle))

public actual fun openFileMappingA(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcstr): Handle =
    MutPtr(WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryOpenFileMappingA(dwdesiredaccess.toInt(), binherithandle, lpname.rawAddress))

public actual fun openFileMappingFromApp(desiredaccess: UInt, inherithandle: Bool, name: Pcwstr): Handle =
    MutPtr(WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryOpenFileMappingFromApp(desiredaccess.toInt(), inherithandle, name.rawAddress))

public actual fun openFileMappingW(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcwstr): Handle =
    MutPtr(WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryOpenFileMappingW(dwdesiredaccess.toInt(), binherithandle, lpname.rawAddress))

public actual fun prefetchVirtualMemory(hprocess: Handle, numberofentries: ULong, virtualaddresses: ConstPtr<Win32MemoryRangeEntry>, flags: UInt): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryPrefetchVirtualMemory(hprocess.rawAddress, numberofentries.toLong(), virtualaddresses.rawAddress, flags.toInt())

public actual fun queryMemoryResourceNotification(resourcenotificationhandle: Handle, resourcestate: MutPtr<Bool>): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryQueryMemoryResourceNotification(resourcenotificationhandle.rawAddress, resourcestate.rawAddress)

public actual fun queryPartitionInformation(partition: Handle, partitioninformationclass: Win32MemoryPartitionInformationClass, partitioninformation: MutPtr<CVoid>, partitioninformationlength: UInt): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryQueryPartitionInformation(partition.rawAddress, partitioninformationclass, partitioninformation.rawAddress, partitioninformationlength.toInt())

public actual fun queryVirtualMemoryInformation(process: Handle, virtualaddress: ConstPtr<CVoid>, memoryinformationclass: Win32MemoryInformationClass, memoryinformation: MutPtr<CVoid>, memoryinformationsize: ULong, returnsize: MutPtr<ULong>): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryQueryVirtualMemoryInformation(process.rawAddress, virtualaddress.rawAddress, memoryinformationclass, memoryinformation.rawAddress, memoryinformationsize.toLong(), returnsize.rawAddress)

public actual fun reclaimVirtualMemory(virtualaddress: ConstPtr<CVoid>, size: ULong): UInt =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryReclaimVirtualMemory(virtualaddress.rawAddress, size.toLong()).toUInt()

public actual fun registerBadMemoryNotification(callback: PbadMemoryCallbackRoutine): MutPtr<CVoid> =
    MutPtr(WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryRegisterBadMemoryNotification(0L))

public actual fun removeSecureMemoryCacheCallback(pfncallback: PsecureMemoryCacheCallback): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryRemoveSecureMemoryCacheCallback(0L)

public actual fun resetWriteWatch(lpbaseaddress: ConstPtr<CVoid>, dwregionsize: ULong): UInt =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryResetWriteWatch(lpbaseaddress.rawAddress, dwregionsize.toLong()).toUInt()

public actual fun rtlCompareMemory(source1: ConstPtr<CVoid>, source2: ConstPtr<CVoid>, length: ULong): ULong =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryRtlCompareMemory(source1.rawAddress, source2.rawAddress, length.toLong()).toULong()

public actual fun rtlCrc32(buffer: ConstPtr<CVoid>, size: ULong, initialcrc: UInt): UInt =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryRtlCrc32(buffer.rawAddress, size.toLong(), initialcrc.toInt()).toUInt()

public actual fun rtlCrc64(buffer: ConstPtr<CVoid>, size: ULong, initialcrc: ULong): ULong =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryRtlCrc64(buffer.rawAddress, size.toLong(), initialcrc.toLong()).toULong()

public actual fun rtlIsZeroMemory(buffer: ConstPtr<CVoid>, length: ULong): Boolean =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryRtlIsZeroMemory(buffer.rawAddress, length.toLong())

public actual fun setProcessValidCallTargets(hprocess: Handle, virtualaddress: ConstPtr<CVoid>, regionsize: ULong, numberofoffsets: UInt, offsetinformation: MutPtr<CfgCallTargetInfo>): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemorySetProcessValidCallTargets(hprocess.rawAddress, virtualaddress.rawAddress, regionsize.toLong(), numberofoffsets.toInt(), offsetinformation.rawAddress)

public actual fun setProcessValidCallTargetsForMappedView(process: Handle, virtualaddress: ConstPtr<CVoid>, regionsize: ULong, numberofoffsets: UInt, offsetinformation: MutPtr<CfgCallTargetInfo>, section: Handle, expectedfileoffset: ULong): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemorySetProcessValidCallTargetsForMappedView(process.rawAddress, virtualaddress.rawAddress, regionsize.toLong(), numberofoffsets.toInt(), offsetinformation.rawAddress, section.rawAddress, expectedfileoffset.toLong())

public actual fun setProcessWorkingSetSizeEx(hprocess: Handle, dwminimumworkingsetsize: ULong, dwmaximumworkingsetsize: ULong, flags: SetprocessworkingsetsizeexFlags): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemorySetProcessWorkingSetSizeEx(hprocess.rawAddress, dwminimumworkingsetsize.toLong(), dwmaximumworkingsetsize.toLong(), flags.toInt())

public actual fun setSystemFileCacheSize(minimumfilecachesize: ULong, maximumfilecachesize: ULong, flags: UInt): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemorySetSystemFileCacheSize(minimumfilecachesize.toLong(), maximumfilecachesize.toLong(), flags.toInt())

public actual fun unmapViewOfFile(lpbaseaddress: MemoryMappedViewAddress): Bool =
    0

public actual fun unmapViewOfFile2(process: Handle, baseaddress: MemoryMappedViewAddress, unmapflags: UnmapViewOfFileFlags): Bool =
    0

public actual fun unmapViewOfFileEx(baseaddress: MemoryMappedViewAddress, unmapflags: UnmapViewOfFileFlags): Bool =
    0

public actual fun unregisterBadMemoryNotification(registrationhandle: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryUnregisterBadMemoryNotification(registrationhandle.rawAddress)

public actual fun virtualAlloc(lpaddress: ConstPtr<CVoid>, dwsize: ULong, flallocationtype: VirtualAllocationType, flprotect: PageProtectionFlags): MutPtr<CVoid> =
    MutPtr(WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryVirtualAlloc(lpaddress.rawAddress, dwsize.toLong(), flallocationtype.toInt(), flprotect.toInt()))

public actual fun virtualAlloc2(process: Handle, baseaddress: ConstPtr<CVoid>, size: ULong, allocationtype: VirtualAllocationType, pageprotection: UInt, extendedparameters: MutPtr<MemExtendedParameter>, parametercount: UInt): MutPtr<CVoid> =
    MutPtr(WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryVirtualAlloc2(process.rawAddress, baseaddress.rawAddress, size.toLong(), allocationtype.toInt(), pageprotection.toInt(), extendedparameters.rawAddress, parametercount.toInt()))

public actual fun virtualAlloc2FromApp(process: Handle, baseaddress: ConstPtr<CVoid>, size: ULong, allocationtype: VirtualAllocationType, pageprotection: UInt, extendedparameters: MutPtr<MemExtendedParameter>, parametercount: UInt): MutPtr<CVoid> =
    MutPtr(WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryVirtualAlloc2FromApp(process.rawAddress, baseaddress.rawAddress, size.toLong(), allocationtype.toInt(), pageprotection.toInt(), extendedparameters.rawAddress, parametercount.toInt()))

public actual fun virtualAllocEx(hprocess: Handle, lpaddress: ConstPtr<CVoid>, dwsize: ULong, flallocationtype: VirtualAllocationType, flprotect: PageProtectionFlags): MutPtr<CVoid> =
    MutPtr(WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryVirtualAllocEx(hprocess.rawAddress, lpaddress.rawAddress, dwsize.toLong(), flallocationtype.toInt(), flprotect.toInt()))

public actual fun virtualAllocExNuma(hprocess: Handle, lpaddress: ConstPtr<CVoid>, dwsize: ULong, flallocationtype: VirtualAllocationType, flprotect: UInt, nndpreferred: UInt): MutPtr<CVoid> =
    MutPtr(WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryVirtualAllocExNuma(hprocess.rawAddress, lpaddress.rawAddress, dwsize.toLong(), flallocationtype.toInt(), flprotect.toInt(), nndpreferred.toInt()))

public actual fun virtualAllocFromApp(baseaddress: ConstPtr<CVoid>, size: ULong, allocationtype: VirtualAllocationType, protection: UInt): MutPtr<CVoid> =
    MutPtr(WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryVirtualAllocFromApp(baseaddress.rawAddress, size.toLong(), allocationtype.toInt(), protection.toInt()))

public actual fun virtualFree(lpaddress: MutPtr<CVoid>, dwsize: ULong, dwfreetype: VirtualFreeType): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryVirtualFree(lpaddress.rawAddress, dwsize.toLong(), dwfreetype.toInt())

public actual fun virtualFreeEx(hprocess: Handle, lpaddress: MutPtr<CVoid>, dwsize: ULong, dwfreetype: VirtualFreeType): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryVirtualFreeEx(hprocess.rawAddress, lpaddress.rawAddress, dwsize.toLong(), dwfreetype.toInt())

public actual fun virtualLock(lpaddress: ConstPtr<CVoid>, dwsize: ULong): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryVirtualLock(lpaddress.rawAddress, dwsize.toLong())

public actual fun virtualProtect(lpaddress: ConstPtr<CVoid>, dwsize: ULong, flnewprotect: PageProtectionFlags, lpfloldprotect: MutPtr<PageProtectionFlags>): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryVirtualProtect(lpaddress.rawAddress, dwsize.toLong(), flnewprotect.toInt(), lpfloldprotect.rawAddress)

public actual fun virtualProtectEx(hprocess: Handle, lpaddress: ConstPtr<CVoid>, dwsize: ULong, flnewprotect: PageProtectionFlags, lpfloldprotect: MutPtr<PageProtectionFlags>): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryVirtualProtectEx(hprocess.rawAddress, lpaddress.rawAddress, dwsize.toLong(), flnewprotect.toInt(), lpfloldprotect.rawAddress)

public actual fun virtualProtectFromApp(address: ConstPtr<CVoid>, size: ULong, newprotection: UInt, oldprotection: MutPtr<UInt>): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryVirtualProtectFromApp(address.rawAddress, size.toLong(), newprotection.toInt(), oldprotection.rawAddress)

public actual fun virtualQuery(lpaddress: ConstPtr<CVoid>, lpbuffer: MutPtr<MemoryBasicInformation>, dwlength: ULong): ULong =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryVirtualQuery(lpaddress.rawAddress, lpbuffer.rawAddress, dwlength.toLong()).toULong()

public actual fun virtualQueryEx(hprocess: Handle, lpaddress: ConstPtr<CVoid>, lpbuffer: MutPtr<MemoryBasicInformation>, dwlength: ULong): ULong =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryVirtualQueryEx(hprocess.rawAddress, lpaddress.rawAddress, lpbuffer.rawAddress, dwlength.toLong()).toULong()

public actual fun virtualUnlock(lpaddress: ConstPtr<CVoid>, dwsize: ULong): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryVirtualUnlock(lpaddress.rawAddress, dwsize.toLong())

public actual fun virtualUnlockEx(process: Handle, address: ConstPtr<CVoid>, size: ULong): Bool =
    WindowsWin32SystemMemoryJniBridge.windowssysWindowsWin32SystemMemoryVirtualUnlockEx(process.rawAddress, address.rawAddress, size.toLong())
