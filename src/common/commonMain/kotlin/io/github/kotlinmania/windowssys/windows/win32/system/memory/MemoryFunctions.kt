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

public expect fun addSecureMemoryCacheCallback(pfncallback: PsecureMemoryCacheCallback): Bool

public expect fun allocateUserPhysicalPages(hprocess: Handle, numberofpages: MutPtr, pagearray: MutPtr): Bool

public expect fun allocateUserPhysicalPages2(objecthandle: Handle, numberofpages: MutPtr, pagearray: MutPtr, extendedparameters: MutPtr, extendedparametercount: UInt): Bool

public expect fun allocateUserPhysicalPagesNuma(hprocess: Handle, numberofpages: MutPtr, pagearray: MutPtr, nndpreferred: UInt): Bool

public expect fun createFileMapping2(file: Handle, securityattributes: ConstPtr, desiredaccess: UInt, pageprotection: PageProtectionFlags, allocationattributes: UInt, maximumsize: ULong, name: Pcwstr, extendedparameters: MutPtr, parametercount: UInt): Handle

public expect fun createFileMappingA(hfile: Handle, lpfilemappingattributes: ConstPtr, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcstr): Handle

public expect fun createFileMappingFromApp(hfile: Handle, securityattributes: ConstPtr, pageprotection: PageProtectionFlags, maximumsize: ULong, name: Pcwstr): Handle

public expect fun createFileMappingNumaA(hfile: Handle, lpfilemappingattributes: ConstPtr, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcstr, nndpreferred: UInt): Handle

public expect fun createFileMappingNumaW(hfile: Handle, lpfilemappingattributes: ConstPtr, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcwstr, nndpreferred: UInt): Handle

public expect fun createFileMappingW(hfile: Handle, lpfilemappingattributes: ConstPtr, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcwstr): Handle

public expect fun createMemoryResourceNotification(notificationtype: MemoryResourceNotificationType): Handle

public expect fun discardVirtualMemory(virtualaddress: MutPtr, size: ULong): UInt

public expect fun flushViewOfFile(lpbaseaddress: ConstPtr, dwnumberofbytestoflush: ULong): Bool

public expect fun freeUserPhysicalPages(hprocess: Handle, numberofpages: MutPtr, pagearray: ConstPtr): Bool

public expect fun getLargePageMinimum(): ULong

public expect fun getMemoryErrorHandlingCapabilities(capabilities: MutPtr): Bool

public expect fun getProcessHeap(): Handle

public expect fun getProcessHeaps(numberofheaps: UInt, processheaps: MutPtr): UInt

public expect fun getProcessWorkingSetSizeEx(hprocess: Handle, lpminimumworkingsetsize: MutPtr, lpmaximumworkingsetsize: MutPtr, flags: MutPtr): Bool

public expect fun getSystemFileCacheSize(lpminimumfilecachesize: MutPtr, lpmaximumfilecachesize: MutPtr, lpflags: MutPtr): Bool

public expect fun getWriteWatch(dwflags: UInt, lpbaseaddress: ConstPtr, dwregionsize: ULong, lpaddresses: MutPtr, lpdwcount: MutPtr, lpdwgranularity: MutPtr): UInt

public expect fun globalAlloc(uflags: GlobalAllocFlags, dwbytes: ULong): Hglobal

public expect fun globalFlags(hmem: Hglobal): UInt

public expect fun globalHandle(pmem: ConstPtr): Hglobal

public expect fun globalLock(hmem: Hglobal): MutPtr

public expect fun globalReAlloc(hmem: Hglobal, dwbytes: ULong, uflags: UInt): Hglobal

public expect fun globalSize(hmem: Hglobal): ULong

public expect fun globalUnlock(hmem: Hglobal): Bool

public expect fun heapAlloc(hheap: Handle, dwflags: HeapFlags, dwbytes: ULong): MutPtr

public expect fun heapCompact(hheap: Handle, dwflags: HeapFlags): ULong

public expect fun heapCreate(floptions: HeapFlags, dwinitialsize: ULong, dwmaximumsize: ULong): Handle

public expect fun heapDestroy(hheap: Handle): Bool

public expect fun heapFree(hheap: Handle, dwflags: HeapFlags, lpmem: ConstPtr): Bool

public expect fun heapLock(hheap: Handle): Bool

public expect fun heapQueryInformation(heaphandle: Handle, heapinformationclass: HeapInformationClass, heapinformation: MutPtr, heapinformationlength: ULong, returnlength: MutPtr): Bool

public expect fun heapReAlloc(hheap: Handle, dwflags: HeapFlags, lpmem: ConstPtr, dwbytes: ULong): MutPtr

public expect fun heapSetInformation(heaphandle: Handle, heapinformationclass: HeapInformationClass, heapinformation: ConstPtr, heapinformationlength: ULong): Bool

public expect fun heapSize(hheap: Handle, dwflags: HeapFlags, lpmem: ConstPtr): ULong

public expect fun heapSummary(hheap: Handle, dwflags: UInt, lpsummary: MutPtr): Bool

public expect fun heapUnlock(hheap: Handle): Bool

public expect fun heapValidate(hheap: Handle, dwflags: HeapFlags, lpmem: ConstPtr): Bool

public expect fun heapWalk(hheap: Handle, lpentry: MutPtr): Bool

public expect fun isBadCodePtr(lpfn: Farproc): Bool

public expect fun isBadReadPtr(lp: ConstPtr, ucb: ULong): Bool

public expect fun isBadStringPtrA(lpsz: Pcstr, ucchmax: ULong): Bool

public expect fun isBadStringPtrW(lpsz: Pcwstr, ucchmax: ULong): Bool

public expect fun isBadWritePtr(lp: ConstPtr, ucb: ULong): Bool

public expect fun localAlloc(uflags: LocalAllocFlags, ubytes: ULong): Hlocal

public expect fun localFlags(hmem: Hlocal): UInt

public expect fun localHandle(pmem: ConstPtr): Hlocal

public expect fun localLock(hmem: Hlocal): MutPtr

public expect fun localReAlloc(hmem: Hlocal, ubytes: ULong, uflags: UInt): Hlocal

public expect fun localSize(hmem: Hlocal): ULong

public expect fun localUnlock(hmem: Hlocal): Bool

public expect fun mapUserPhysicalPages(virtualaddress: ConstPtr, numberofpages: ULong, pagearray: ConstPtr): Bool

public expect fun mapUserPhysicalPagesScatter(virtualaddresses: ConstPtr, numberofpages: ULong, pagearray: ConstPtr): Bool

public expect fun mapViewOfFile(hfilemappingobject: Handle, dwdesiredaccess: FileMap, dwfileoffsethigh: UInt, dwfileoffsetlow: UInt, dwnumberofbytestomap: ULong): MemoryMappedViewAddress

public expect fun mapViewOfFile3(filemapping: Handle, process: Handle, baseaddress: ConstPtr, offset: ULong, viewsize: ULong, allocationtype: VirtualAllocationType, pageprotection: UInt, extendedparameters: MutPtr, parametercount: UInt): MemoryMappedViewAddress

public expect fun mapViewOfFile3FromApp(filemapping: Handle, process: Handle, baseaddress: ConstPtr, offset: ULong, viewsize: ULong, allocationtype: VirtualAllocationType, pageprotection: UInt, extendedparameters: MutPtr, parametercount: UInt): MemoryMappedViewAddress

public expect fun mapViewOfFileEx(hfilemappingobject: Handle, dwdesiredaccess: FileMap, dwfileoffsethigh: UInt, dwfileoffsetlow: UInt, dwnumberofbytestomap: ULong, lpbaseaddress: ConstPtr): MemoryMappedViewAddress

public expect fun mapViewOfFileExNuma(hfilemappingobject: Handle, dwdesiredaccess: FileMap, dwfileoffsethigh: UInt, dwfileoffsetlow: UInt, dwnumberofbytestomap: ULong, lpbaseaddress: ConstPtr, nndpreferred: UInt): MemoryMappedViewAddress

public expect fun mapViewOfFileFromApp(hfilemappingobject: Handle, desiredaccess: FileMap, fileoffset: ULong, numberofbytestomap: ULong): MemoryMappedViewAddress

public expect fun mapViewOfFileNuma2(filemappinghandle: Handle, processhandle: Handle, offset: ULong, baseaddress: ConstPtr, viewsize: ULong, allocationtype: UInt, pageprotection: UInt, preferrednode: UInt): MemoryMappedViewAddress

public expect fun offerVirtualMemory(virtualaddress: MutPtr, size: ULong, priority: OfferPriority): UInt

public expect fun openDedicatedMemoryPartition(partition: Handle, dedicatedmemorytypeid: ULong, desiredaccess: UInt, inherithandle: Bool): Handle

public expect fun openFileMappingA(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcstr): Handle

public expect fun openFileMappingFromApp(desiredaccess: UInt, inherithandle: Bool, name: Pcwstr): Handle

public expect fun openFileMappingW(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcwstr): Handle

public expect fun prefetchVirtualMemory(hprocess: Handle, numberofentries: ULong, virtualaddresses: ConstPtr, flags: UInt): Bool

public expect fun queryMemoryResourceNotification(resourcenotificationhandle: Handle, resourcestate: MutPtr): Bool

public expect fun queryPartitionInformation(partition: Handle, partitioninformationclass: Win32MemoryPartitionInformationClass, partitioninformation: MutPtr, partitioninformationlength: UInt): Bool

public expect fun queryVirtualMemoryInformation(process: Handle, virtualaddress: ConstPtr, memoryinformationclass: Win32MemoryInformationClass, memoryinformation: MutPtr, memoryinformationsize: ULong, returnsize: MutPtr): Bool

public expect fun reclaimVirtualMemory(virtualaddress: ConstPtr, size: ULong): UInt

public expect fun registerBadMemoryNotification(callback: PbadMemoryCallbackRoutine): MutPtr

public expect fun removeSecureMemoryCacheCallback(pfncallback: PsecureMemoryCacheCallback): Bool

public expect fun resetWriteWatch(lpbaseaddress: ConstPtr, dwregionsize: ULong): UInt

public expect fun rtlCompareMemory(source1: ConstPtr, source2: ConstPtr, length: ULong): ULong

public expect fun rtlCrc32(buffer: ConstPtr, size: ULong, initialcrc: UInt): UInt

public expect fun rtlCrc64(buffer: ConstPtr, size: ULong, initialcrc: ULong): ULong

public expect fun rtlIsZeroMemory(buffer: ConstPtr, length: ULong): Boolean

public expect fun setProcessValidCallTargets(hprocess: Handle, virtualaddress: ConstPtr, regionsize: ULong, numberofoffsets: UInt, offsetinformation: MutPtr): Bool

public expect fun setProcessValidCallTargetsForMappedView(process: Handle, virtualaddress: ConstPtr, regionsize: ULong, numberofoffsets: UInt, offsetinformation: MutPtr, section: Handle, expectedfileoffset: ULong): Bool

public expect fun setProcessWorkingSetSizeEx(hprocess: Handle, dwminimumworkingsetsize: ULong, dwmaximumworkingsetsize: ULong, flags: SetprocessworkingsetsizeexFlags): Bool

public expect fun setSystemFileCacheSize(minimumfilecachesize: ULong, maximumfilecachesize: ULong, flags: UInt): Bool

public expect fun unmapViewOfFile(lpbaseaddress: MemoryMappedViewAddress): Bool

public expect fun unmapViewOfFile2(process: Handle, baseaddress: MemoryMappedViewAddress, unmapflags: UnmapViewOfFileFlags): Bool

public expect fun unmapViewOfFileEx(baseaddress: MemoryMappedViewAddress, unmapflags: UnmapViewOfFileFlags): Bool

public expect fun unregisterBadMemoryNotification(registrationhandle: ConstPtr): Bool

public expect fun virtualAlloc(lpaddress: ConstPtr, dwsize: ULong, flallocationtype: VirtualAllocationType, flprotect: PageProtectionFlags): MutPtr

public expect fun virtualAlloc2(process: Handle, baseaddress: ConstPtr, size: ULong, allocationtype: VirtualAllocationType, pageprotection: UInt, extendedparameters: MutPtr, parametercount: UInt): MutPtr

public expect fun virtualAlloc2FromApp(process: Handle, baseaddress: ConstPtr, size: ULong, allocationtype: VirtualAllocationType, pageprotection: UInt, extendedparameters: MutPtr, parametercount: UInt): MutPtr

public expect fun virtualAllocEx(hprocess: Handle, lpaddress: ConstPtr, dwsize: ULong, flallocationtype: VirtualAllocationType, flprotect: PageProtectionFlags): MutPtr

public expect fun virtualAllocExNuma(hprocess: Handle, lpaddress: ConstPtr, dwsize: ULong, flallocationtype: VirtualAllocationType, flprotect: UInt, nndpreferred: UInt): MutPtr

public expect fun virtualAllocFromApp(baseaddress: ConstPtr, size: ULong, allocationtype: VirtualAllocationType, protection: UInt): MutPtr

public expect fun virtualFree(lpaddress: MutPtr, dwsize: ULong, dwfreetype: VirtualFreeType): Bool

public expect fun virtualFreeEx(hprocess: Handle, lpaddress: MutPtr, dwsize: ULong, dwfreetype: VirtualFreeType): Bool

public expect fun virtualLock(lpaddress: ConstPtr, dwsize: ULong): Bool

public expect fun virtualProtect(lpaddress: ConstPtr, dwsize: ULong, flnewprotect: PageProtectionFlags, lpfloldprotect: MutPtr): Bool

public expect fun virtualProtectEx(hprocess: Handle, lpaddress: ConstPtr, dwsize: ULong, flnewprotect: PageProtectionFlags, lpfloldprotect: MutPtr): Bool

public expect fun virtualProtectFromApp(address: ConstPtr, size: ULong, newprotection: UInt, oldprotection: MutPtr): Bool

public expect fun virtualQuery(lpaddress: ConstPtr, lpbuffer: MutPtr, dwlength: ULong): ULong

public expect fun virtualQueryEx(hprocess: Handle, lpaddress: ConstPtr, lpbuffer: MutPtr, dwlength: ULong): ULong

public expect fun virtualUnlock(lpaddress: ConstPtr, dwsize: ULong): Bool

public expect fun virtualUnlockEx(process: Handle, address: ConstPtr, size: ULong): Bool
