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

public expect fun addSecureMemoryCacheCallback(pfncallback: PsecureMemoryCacheCallback): Bool

public expect fun allocateUserPhysicalPages(hprocess: Handle, numberofpages: MutPtr<ULong>, pagearray: MutPtr<ULong>): Bool

public expect fun allocateUserPhysicalPages2(objecthandle: Handle, numberofpages: MutPtr<ULong>, pagearray: MutPtr<ULong>, extendedparameters: MutPtr<MemExtendedParameter>, extendedparametercount: UInt): Bool

public expect fun allocateUserPhysicalPagesNuma(hprocess: Handle, numberofpages: MutPtr<ULong>, pagearray: MutPtr<ULong>, nndpreferred: UInt): Bool

public expect fun createFileMapping2(file: Handle, securityattributes: ConstPtr<SecurityAttributes>, desiredaccess: UInt, pageprotection: PageProtectionFlags, allocationattributes: UInt, maximumsize: ULong, name: Pcwstr, extendedparameters: MutPtr<MemExtendedParameter>, parametercount: UInt): Handle

public expect fun createFileMappingA(hfile: Handle, lpfilemappingattributes: ConstPtr<SecurityAttributes>, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcstr): Handle

public expect fun createFileMappingFromApp(hfile: Handle, securityattributes: ConstPtr<SecurityAttributes>, pageprotection: PageProtectionFlags, maximumsize: ULong, name: Pcwstr): Handle

public expect fun createFileMappingNumaA(hfile: Handle, lpfilemappingattributes: ConstPtr<SecurityAttributes>, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcstr, nndpreferred: UInt): Handle

public expect fun createFileMappingNumaW(hfile: Handle, lpfilemappingattributes: ConstPtr<SecurityAttributes>, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcwstr, nndpreferred: UInt): Handle

public expect fun createFileMappingW(hfile: Handle, lpfilemappingattributes: ConstPtr<SecurityAttributes>, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcwstr): Handle

public expect fun createMemoryResourceNotification(notificationtype: MemoryResourceNotificationType): Handle

public expect fun discardVirtualMemory(virtualaddress: MutPtr<CVoid>, size: ULong): UInt

public expect fun flushViewOfFile(lpbaseaddress: ConstPtr<CVoid>, dwnumberofbytestoflush: ULong): Bool

public expect fun freeUserPhysicalPages(hprocess: Handle, numberofpages: MutPtr<ULong>, pagearray: ConstPtr<ULong>): Bool

public expect fun getLargePageMinimum(): ULong

public expect fun getMemoryErrorHandlingCapabilities(capabilities: MutPtr<UInt>): Bool

public expect fun getProcessHeap(): Handle

public expect fun getProcessHeaps(numberofheaps: UInt, processheaps: MutPtr<Handle>): UInt

public expect fun getProcessWorkingSetSizeEx(hprocess: Handle, lpminimumworkingsetsize: MutPtr<ULong>, lpmaximumworkingsetsize: MutPtr<ULong>, flags: MutPtr<UInt>): Bool

public expect fun getSystemFileCacheSize(lpminimumfilecachesize: MutPtr<ULong>, lpmaximumfilecachesize: MutPtr<ULong>, lpflags: MutPtr<UInt>): Bool

public expect fun getWriteWatch(dwflags: UInt, lpbaseaddress: ConstPtr<CVoid>, dwregionsize: ULong, lpaddresses: MutPtr<MutPtr<CVoid>>, lpdwcount: MutPtr<ULong>, lpdwgranularity: MutPtr<UInt>): UInt

public expect fun globalAlloc(uflags: GlobalAllocFlags, dwbytes: ULong): Hglobal

public expect fun globalFlags(hmem: Hglobal): UInt

public expect fun globalHandle(pmem: ConstPtr<CVoid>): Hglobal

public expect fun globalLock(hmem: Hglobal): MutPtr<CVoid>

public expect fun globalReAlloc(hmem: Hglobal, dwbytes: ULong, uflags: UInt): Hglobal

public expect fun globalSize(hmem: Hglobal): ULong

public expect fun globalUnlock(hmem: Hglobal): Bool

public expect fun heapAlloc(hheap: Handle, dwflags: HeapFlags, dwbytes: ULong): MutPtr<CVoid>

public expect fun heapCompact(hheap: Handle, dwflags: HeapFlags): ULong

public expect fun heapCreate(floptions: HeapFlags, dwinitialsize: ULong, dwmaximumsize: ULong): Handle

public expect fun heapDestroy(hheap: Handle): Bool

public expect fun heapFree(hheap: Handle, dwflags: HeapFlags, lpmem: ConstPtr<CVoid>): Bool

public expect fun heapLock(hheap: Handle): Bool

public expect fun heapQueryInformation(heaphandle: Handle, heapinformationclass: HeapInformationClass, heapinformation: MutPtr<CVoid>, heapinformationlength: ULong, returnlength: MutPtr<ULong>): Bool

public expect fun heapReAlloc(hheap: Handle, dwflags: HeapFlags, lpmem: ConstPtr<CVoid>, dwbytes: ULong): MutPtr<CVoid>

public expect fun heapSetInformation(heaphandle: Handle, heapinformationclass: HeapInformationClass, heapinformation: ConstPtr<CVoid>, heapinformationlength: ULong): Bool

public expect fun heapSize(hheap: Handle, dwflags: HeapFlags, lpmem: ConstPtr<CVoid>): ULong

public expect fun heapSummary(hheap: Handle, dwflags: UInt, lpsummary: MutPtr<HeapSummary>): Bool

public expect fun heapUnlock(hheap: Handle): Bool

public expect fun heapValidate(hheap: Handle, dwflags: HeapFlags, lpmem: ConstPtr<CVoid>): Bool

public expect fun heapWalk(hheap: Handle, lpentry: MutPtr<ProcessHeapEntry>): Bool

public expect fun isBadCodePtr(lpfn: Farproc): Bool

public expect fun isBadReadPtr(lp: ConstPtr<CVoid>, ucb: ULong): Bool

public expect fun isBadStringPtrA(lpsz: Pcstr, ucchmax: ULong): Bool

public expect fun isBadStringPtrW(lpsz: Pcwstr, ucchmax: ULong): Bool

public expect fun isBadWritePtr(lp: ConstPtr<CVoid>, ucb: ULong): Bool

public expect fun localAlloc(uflags: LocalAllocFlags, ubytes: ULong): Hlocal

public expect fun localFlags(hmem: Hlocal): UInt

public expect fun localHandle(pmem: ConstPtr<CVoid>): Hlocal

public expect fun localLock(hmem: Hlocal): MutPtr<CVoid>

public expect fun localReAlloc(hmem: Hlocal, ubytes: ULong, uflags: UInt): Hlocal

public expect fun localSize(hmem: Hlocal): ULong

public expect fun localUnlock(hmem: Hlocal): Bool

public expect fun mapUserPhysicalPages(virtualaddress: ConstPtr<CVoid>, numberofpages: ULong, pagearray: ConstPtr<ULong>): Bool

public expect fun mapUserPhysicalPagesScatter(virtualaddresses: ConstPtr<ConstPtr<CVoid>>, numberofpages: ULong, pagearray: ConstPtr<ULong>): Bool

public expect fun mapViewOfFile(hfilemappingobject: Handle, dwdesiredaccess: FileMap, dwfileoffsethigh: UInt, dwfileoffsetlow: UInt, dwnumberofbytestomap: ULong): MemoryMappedViewAddress

public expect fun mapViewOfFile3(filemapping: Handle, process: Handle, baseaddress: ConstPtr<CVoid>, offset: ULong, viewsize: ULong, allocationtype: VirtualAllocationType, pageprotection: UInt, extendedparameters: MutPtr<MemExtendedParameter>, parametercount: UInt): MemoryMappedViewAddress

public expect fun mapViewOfFile3FromApp(filemapping: Handle, process: Handle, baseaddress: ConstPtr<CVoid>, offset: ULong, viewsize: ULong, allocationtype: VirtualAllocationType, pageprotection: UInt, extendedparameters: MutPtr<MemExtendedParameter>, parametercount: UInt): MemoryMappedViewAddress

public expect fun mapViewOfFileEx(hfilemappingobject: Handle, dwdesiredaccess: FileMap, dwfileoffsethigh: UInt, dwfileoffsetlow: UInt, dwnumberofbytestomap: ULong, lpbaseaddress: ConstPtr<CVoid>): MemoryMappedViewAddress

public expect fun mapViewOfFileExNuma(hfilemappingobject: Handle, dwdesiredaccess: FileMap, dwfileoffsethigh: UInt, dwfileoffsetlow: UInt, dwnumberofbytestomap: ULong, lpbaseaddress: ConstPtr<CVoid>, nndpreferred: UInt): MemoryMappedViewAddress

public expect fun mapViewOfFileFromApp(hfilemappingobject: Handle, desiredaccess: FileMap, fileoffset: ULong, numberofbytestomap: ULong): MemoryMappedViewAddress

public expect fun mapViewOfFileNuma2(filemappinghandle: Handle, processhandle: Handle, offset: ULong, baseaddress: ConstPtr<CVoid>, viewsize: ULong, allocationtype: UInt, pageprotection: UInt, preferrednode: UInt): MemoryMappedViewAddress

public expect fun offerVirtualMemory(virtualaddress: MutPtr<CVoid>, size: ULong, priority: OfferPriority): UInt

public expect fun openDedicatedMemoryPartition(partition: Handle, dedicatedmemorytypeid: ULong, desiredaccess: UInt, inherithandle: Bool): Handle

public expect fun openFileMappingA(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcstr): Handle

public expect fun openFileMappingFromApp(desiredaccess: UInt, inherithandle: Bool, name: Pcwstr): Handle

public expect fun openFileMappingW(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcwstr): Handle

public expect fun prefetchVirtualMemory(hprocess: Handle, numberofentries: ULong, virtualaddresses: ConstPtr<Win32MemoryRangeEntry>, flags: UInt): Bool

public expect fun queryMemoryResourceNotification(resourcenotificationhandle: Handle, resourcestate: MutPtr<Bool>): Bool

public expect fun queryPartitionInformation(partition: Handle, partitioninformationclass: Win32MemoryPartitionInformationClass, partitioninformation: MutPtr<CVoid>, partitioninformationlength: UInt): Bool

public expect fun queryVirtualMemoryInformation(process: Handle, virtualaddress: ConstPtr<CVoid>, memoryinformationclass: Win32MemoryInformationClass, memoryinformation: MutPtr<CVoid>, memoryinformationsize: ULong, returnsize: MutPtr<ULong>): Bool

public expect fun reclaimVirtualMemory(virtualaddress: ConstPtr<CVoid>, size: ULong): UInt

public expect fun registerBadMemoryNotification(callback: PbadMemoryCallbackRoutine): MutPtr<CVoid>

public expect fun removeSecureMemoryCacheCallback(pfncallback: PsecureMemoryCacheCallback): Bool

public expect fun resetWriteWatch(lpbaseaddress: ConstPtr<CVoid>, dwregionsize: ULong): UInt

public expect fun rtlCompareMemory(source1: ConstPtr<CVoid>, source2: ConstPtr<CVoid>, length: ULong): ULong

public expect fun rtlCrc32(buffer: ConstPtr<CVoid>, size: ULong, initialcrc: UInt): UInt

public expect fun rtlCrc64(buffer: ConstPtr<CVoid>, size: ULong, initialcrc: ULong): ULong

public expect fun rtlIsZeroMemory(buffer: ConstPtr<CVoid>, length: ULong): Boolean

public expect fun setProcessValidCallTargets(hprocess: Handle, virtualaddress: ConstPtr<CVoid>, regionsize: ULong, numberofoffsets: UInt, offsetinformation: MutPtr<CfgCallTargetInfo>): Bool

public expect fun setProcessValidCallTargetsForMappedView(process: Handle, virtualaddress: ConstPtr<CVoid>, regionsize: ULong, numberofoffsets: UInt, offsetinformation: MutPtr<CfgCallTargetInfo>, section: Handle, expectedfileoffset: ULong): Bool

public expect fun setProcessWorkingSetSizeEx(hprocess: Handle, dwminimumworkingsetsize: ULong, dwmaximumworkingsetsize: ULong, flags: SetprocessworkingsetsizeexFlags): Bool

public expect fun setSystemFileCacheSize(minimumfilecachesize: ULong, maximumfilecachesize: ULong, flags: UInt): Bool

public expect fun unmapViewOfFile(lpbaseaddress: MemoryMappedViewAddress): Bool

public expect fun unmapViewOfFile2(process: Handle, baseaddress: MemoryMappedViewAddress, unmapflags: UnmapViewOfFileFlags): Bool

public expect fun unmapViewOfFileEx(baseaddress: MemoryMappedViewAddress, unmapflags: UnmapViewOfFileFlags): Bool

public expect fun unregisterBadMemoryNotification(registrationhandle: ConstPtr<CVoid>): Bool

public expect fun virtualAlloc(lpaddress: ConstPtr<CVoid>, dwsize: ULong, flallocationtype: VirtualAllocationType, flprotect: PageProtectionFlags): MutPtr<CVoid>

public expect fun virtualAlloc2(process: Handle, baseaddress: ConstPtr<CVoid>, size: ULong, allocationtype: VirtualAllocationType, pageprotection: UInt, extendedparameters: MutPtr<MemExtendedParameter>, parametercount: UInt): MutPtr<CVoid>

public expect fun virtualAlloc2FromApp(process: Handle, baseaddress: ConstPtr<CVoid>, size: ULong, allocationtype: VirtualAllocationType, pageprotection: UInt, extendedparameters: MutPtr<MemExtendedParameter>, parametercount: UInt): MutPtr<CVoid>

public expect fun virtualAllocEx(hprocess: Handle, lpaddress: ConstPtr<CVoid>, dwsize: ULong, flallocationtype: VirtualAllocationType, flprotect: PageProtectionFlags): MutPtr<CVoid>

public expect fun virtualAllocExNuma(hprocess: Handle, lpaddress: ConstPtr<CVoid>, dwsize: ULong, flallocationtype: VirtualAllocationType, flprotect: UInt, nndpreferred: UInt): MutPtr<CVoid>

public expect fun virtualAllocFromApp(baseaddress: ConstPtr<CVoid>, size: ULong, allocationtype: VirtualAllocationType, protection: UInt): MutPtr<CVoid>

public expect fun virtualFree(lpaddress: MutPtr<CVoid>, dwsize: ULong, dwfreetype: VirtualFreeType): Bool

public expect fun virtualFreeEx(hprocess: Handle, lpaddress: MutPtr<CVoid>, dwsize: ULong, dwfreetype: VirtualFreeType): Bool

public expect fun virtualLock(lpaddress: ConstPtr<CVoid>, dwsize: ULong): Bool

public expect fun virtualProtect(lpaddress: ConstPtr<CVoid>, dwsize: ULong, flnewprotect: PageProtectionFlags, lpfloldprotect: MutPtr<PageProtectionFlags>): Bool

public expect fun virtualProtectEx(hprocess: Handle, lpaddress: ConstPtr<CVoid>, dwsize: ULong, flnewprotect: PageProtectionFlags, lpfloldprotect: MutPtr<PageProtectionFlags>): Bool

public expect fun virtualProtectFromApp(address: ConstPtr<CVoid>, size: ULong, newprotection: UInt, oldprotection: MutPtr<UInt>): Bool

public expect fun virtualQuery(lpaddress: ConstPtr<CVoid>, lpbuffer: MutPtr<MemoryBasicInformation>, dwlength: ULong): ULong

public expect fun virtualQueryEx(hprocess: Handle, lpaddress: ConstPtr<CVoid>, lpbuffer: MutPtr<MemoryBasicInformation>, dwlength: ULong): ULong

public expect fun virtualUnlock(lpaddress: ConstPtr<CVoid>, dwsize: ULong): Bool

public expect fun virtualUnlockEx(process: Handle, address: ConstPtr<CVoid>, size: ULong): Bool
