package io.github.kotlinmania.windowssys.windows.win32.system.memory

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Farproc
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hglobal
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hlocal

public expect fun addSecureMemoryCacheCallback(pfncallback: PsecureMemoryCacheCallback): Bool

public expect fun allocateUserPhysicalPages(hprocess: Handle, numberofpages: COpaquePointer?, pagearray: COpaquePointer?): Bool

public expect fun allocateUserPhysicalPages2(objecthandle: Handle, numberofpages: COpaquePointer?, pagearray: COpaquePointer?, extendedparameters: COpaquePointer?, extendedparametercount: UInt): Bool

public expect fun allocateUserPhysicalPagesNuma(hprocess: Handle, numberofpages: COpaquePointer?, pagearray: COpaquePointer?, nndpreferred: UInt): Bool

public expect fun createFileMapping2(file: Handle, securityattributes: COpaquePointer?, desiredaccess: UInt, pageprotection: PageProtectionFlags, allocationattributes: UInt, maximumsize: ULong, name: Pcwstr, extendedparameters: COpaquePointer?, parametercount: UInt): Handle

public expect fun createFileMappingA(hfile: Handle, lpfilemappingattributes: COpaquePointer?, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcstr): Handle

public expect fun createFileMappingFromApp(hfile: Handle, securityattributes: COpaquePointer?, pageprotection: PageProtectionFlags, maximumsize: ULong, name: Pcwstr): Handle

public expect fun createFileMappingNumaA(hfile: Handle, lpfilemappingattributes: COpaquePointer?, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcstr, nndpreferred: UInt): Handle

public expect fun createFileMappingNumaW(hfile: Handle, lpfilemappingattributes: COpaquePointer?, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcwstr, nndpreferred: UInt): Handle

public expect fun createFileMappingW(hfile: Handle, lpfilemappingattributes: COpaquePointer?, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcwstr): Handle

public expect fun createMemoryResourceNotification(notificationtype: MemoryResourceNotificationType): Handle

public expect fun discardVirtualMemory(virtualaddress: COpaquePointer?, size: ULong): UInt

public expect fun flushViewOfFile(lpbaseaddress: COpaquePointer?, dwnumberofbytestoflush: ULong): Bool

public expect fun freeUserPhysicalPages(hprocess: Handle, numberofpages: COpaquePointer?, pagearray: COpaquePointer?): Bool

public expect fun getLargePageMinimum(): ULong

public expect fun getMemoryErrorHandlingCapabilities(capabilities: COpaquePointer?): Bool

public expect fun getProcessHeap(): Handle

public expect fun getProcessHeaps(numberofheaps: UInt, processheaps: COpaquePointer?): UInt

public expect fun getProcessWorkingSetSizeEx(hprocess: Handle, lpminimumworkingsetsize: COpaquePointer?, lpmaximumworkingsetsize: COpaquePointer?, flags: COpaquePointer?): Bool

public expect fun getSystemFileCacheSize(lpminimumfilecachesize: COpaquePointer?, lpmaximumfilecachesize: COpaquePointer?, lpflags: COpaquePointer?): Bool

public expect fun getWriteWatch(dwflags: UInt, lpbaseaddress: COpaquePointer?, dwregionsize: ULong, lpaddresses: COpaquePointer?, lpdwcount: COpaquePointer?, lpdwgranularity: COpaquePointer?): UInt

public expect fun globalAlloc(uflags: GlobalAllocFlags, dwbytes: ULong): Hglobal

public expect fun globalFlags(hmem: Hglobal): UInt

public expect fun globalHandle(pmem: COpaquePointer?): Hglobal

public expect fun globalLock(hmem: Hglobal): COpaquePointer?

public expect fun globalReAlloc(hmem: Hglobal, dwbytes: ULong, uflags: UInt): Hglobal

public expect fun globalSize(hmem: Hglobal): ULong

public expect fun globalUnlock(hmem: Hglobal): Bool

public expect fun heapAlloc(hheap: Handle, dwflags: HeapFlags, dwbytes: ULong): COpaquePointer?

public expect fun heapCompact(hheap: Handle, dwflags: HeapFlags): ULong

public expect fun heapCreate(floptions: HeapFlags, dwinitialsize: ULong, dwmaximumsize: ULong): Handle

public expect fun heapDestroy(hheap: Handle): Bool

public expect fun heapFree(hheap: Handle, dwflags: HeapFlags, lpmem: COpaquePointer?): Bool

public expect fun heapLock(hheap: Handle): Bool

public expect fun heapQueryInformation(heaphandle: Handle, heapinformationclass: HeapInformationClass, heapinformation: COpaquePointer?, heapinformationlength: ULong, returnlength: COpaquePointer?): Bool

public expect fun heapReAlloc(hheap: Handle, dwflags: HeapFlags, lpmem: COpaquePointer?, dwbytes: ULong): COpaquePointer?

public expect fun heapSetInformation(heaphandle: Handle, heapinformationclass: HeapInformationClass, heapinformation: COpaquePointer?, heapinformationlength: ULong): Bool

public expect fun heapSize(hheap: Handle, dwflags: HeapFlags, lpmem: COpaquePointer?): ULong

public expect fun heapSummary(hheap: Handle, dwflags: UInt, lpsummary: COpaquePointer?): Bool

public expect fun heapUnlock(hheap: Handle): Bool

public expect fun heapValidate(hheap: Handle, dwflags: HeapFlags, lpmem: COpaquePointer?): Bool

public expect fun heapWalk(hheap: Handle, lpentry: COpaquePointer?): Bool

public expect fun isBadCodePtr(lpfn: Farproc): Bool

public expect fun isBadReadPtr(lp: COpaquePointer?, ucb: ULong): Bool

public expect fun isBadStringPtrA(lpsz: Pcstr, ucchmax: ULong): Bool

public expect fun isBadStringPtrW(lpsz: Pcwstr, ucchmax: ULong): Bool

public expect fun isBadWritePtr(lp: COpaquePointer?, ucb: ULong): Bool

public expect fun localAlloc(uflags: LocalAllocFlags, ubytes: ULong): Hlocal

public expect fun localFlags(hmem: Hlocal): UInt

public expect fun localHandle(pmem: COpaquePointer?): Hlocal

public expect fun localLock(hmem: Hlocal): COpaquePointer?

public expect fun localReAlloc(hmem: Hlocal, ubytes: ULong, uflags: UInt): Hlocal

public expect fun localSize(hmem: Hlocal): ULong

public expect fun localUnlock(hmem: Hlocal): Bool

public expect fun mapUserPhysicalPages(virtualaddress: COpaquePointer?, numberofpages: ULong, pagearray: COpaquePointer?): Bool

public expect fun mapUserPhysicalPagesScatter(virtualaddresses: COpaquePointer?, numberofpages: ULong, pagearray: COpaquePointer?): Bool

public expect fun mapViewOfFile(hfilemappingobject: Handle, dwdesiredaccess: FileMap, dwfileoffsethigh: UInt, dwfileoffsetlow: UInt, dwnumberofbytestomap: ULong): MemoryMappedViewAddress

public expect fun mapViewOfFile3(filemapping: Handle, process: Handle, baseaddress: COpaquePointer?, offset: ULong, viewsize: ULong, allocationtype: VirtualAllocationType, pageprotection: UInt, extendedparameters: COpaquePointer?, parametercount: UInt): MemoryMappedViewAddress

public expect fun mapViewOfFile3FromApp(filemapping: Handle, process: Handle, baseaddress: COpaquePointer?, offset: ULong, viewsize: ULong, allocationtype: VirtualAllocationType, pageprotection: UInt, extendedparameters: COpaquePointer?, parametercount: UInt): MemoryMappedViewAddress

public expect fun mapViewOfFileEx(hfilemappingobject: Handle, dwdesiredaccess: FileMap, dwfileoffsethigh: UInt, dwfileoffsetlow: UInt, dwnumberofbytestomap: ULong, lpbaseaddress: COpaquePointer?): MemoryMappedViewAddress

public expect fun mapViewOfFileExNuma(hfilemappingobject: Handle, dwdesiredaccess: FileMap, dwfileoffsethigh: UInt, dwfileoffsetlow: UInt, dwnumberofbytestomap: ULong, lpbaseaddress: COpaquePointer?, nndpreferred: UInt): MemoryMappedViewAddress

public expect fun mapViewOfFileFromApp(hfilemappingobject: Handle, desiredaccess: FileMap, fileoffset: ULong, numberofbytestomap: ULong): MemoryMappedViewAddress

public expect fun mapViewOfFileNuma2(filemappinghandle: Handle, processhandle: Handle, offset: ULong, baseaddress: COpaquePointer?, viewsize: ULong, allocationtype: UInt, pageprotection: UInt, preferrednode: UInt): MemoryMappedViewAddress

public expect fun offerVirtualMemory(virtualaddress: COpaquePointer?, size: ULong, priority: OfferPriority): UInt

public expect fun openDedicatedMemoryPartition(partition: Handle, dedicatedmemorytypeid: ULong, desiredaccess: UInt, inherithandle: Bool): Handle

public expect fun openFileMappingA(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcstr): Handle

public expect fun openFileMappingFromApp(desiredaccess: UInt, inherithandle: Bool, name: Pcwstr): Handle

public expect fun openFileMappingW(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcwstr): Handle

public expect fun prefetchVirtualMemory(hprocess: Handle, numberofentries: ULong, virtualaddresses: COpaquePointer?, flags: UInt): Bool

public expect fun queryMemoryResourceNotification(resourcenotificationhandle: Handle, resourcestate: COpaquePointer?): Bool

public expect fun queryPartitionInformation(partition: Handle, partitioninformationclass: Win32MemoryPartitionInformationClass, partitioninformation: COpaquePointer?, partitioninformationlength: UInt): Bool

public expect fun queryVirtualMemoryInformation(process: Handle, virtualaddress: COpaquePointer?, memoryinformationclass: Win32MemoryInformationClass, memoryinformation: COpaquePointer?, memoryinformationsize: ULong, returnsize: COpaquePointer?): Bool

public expect fun reclaimVirtualMemory(virtualaddress: COpaquePointer?, size: ULong): UInt

public expect fun registerBadMemoryNotification(callback: PbadMemoryCallbackRoutine): COpaquePointer?

public expect fun removeSecureMemoryCacheCallback(pfncallback: PsecureMemoryCacheCallback): Bool

public expect fun resetWriteWatch(lpbaseaddress: COpaquePointer?, dwregionsize: ULong): UInt

public expect fun rtlCompareMemory(source1: COpaquePointer?, source2: COpaquePointer?, length: ULong): ULong

public expect fun rtlCrc32(buffer: COpaquePointer?, size: ULong, initialcrc: UInt): UInt

public expect fun rtlCrc64(buffer: COpaquePointer?, size: ULong, initialcrc: ULong): ULong

public expect fun rtlIsZeroMemory(buffer: COpaquePointer?, length: ULong): Boolean

public expect fun setProcessValidCallTargets(hprocess: Handle, virtualaddress: COpaquePointer?, regionsize: ULong, numberofoffsets: UInt, offsetinformation: COpaquePointer?): Bool

public expect fun setProcessValidCallTargetsForMappedView(process: Handle, virtualaddress: COpaquePointer?, regionsize: ULong, numberofoffsets: UInt, offsetinformation: COpaquePointer?, section: Handle, expectedfileoffset: ULong): Bool

public expect fun setProcessWorkingSetSizeEx(hprocess: Handle, dwminimumworkingsetsize: ULong, dwmaximumworkingsetsize: ULong, flags: SetprocessworkingsetsizeexFlags): Bool

public expect fun setSystemFileCacheSize(minimumfilecachesize: ULong, maximumfilecachesize: ULong, flags: UInt): Bool

public expect fun unmapViewOfFile(lpbaseaddress: MemoryMappedViewAddress): Bool

public expect fun unmapViewOfFile2(process: Handle, baseaddress: MemoryMappedViewAddress, unmapflags: UnmapViewOfFileFlags): Bool

public expect fun unmapViewOfFileEx(baseaddress: MemoryMappedViewAddress, unmapflags: UnmapViewOfFileFlags): Bool

public expect fun unregisterBadMemoryNotification(registrationhandle: COpaquePointer?): Bool

public expect fun virtualAlloc(lpaddress: COpaquePointer?, dwsize: ULong, flallocationtype: VirtualAllocationType, flprotect: PageProtectionFlags): COpaquePointer?

public expect fun virtualAlloc2(process: Handle, baseaddress: COpaquePointer?, size: ULong, allocationtype: VirtualAllocationType, pageprotection: UInt, extendedparameters: COpaquePointer?, parametercount: UInt): COpaquePointer?

public expect fun virtualAlloc2FromApp(process: Handle, baseaddress: COpaquePointer?, size: ULong, allocationtype: VirtualAllocationType, pageprotection: UInt, extendedparameters: COpaquePointer?, parametercount: UInt): COpaquePointer?

public expect fun virtualAllocEx(hprocess: Handle, lpaddress: COpaquePointer?, dwsize: ULong, flallocationtype: VirtualAllocationType, flprotect: PageProtectionFlags): COpaquePointer?

public expect fun virtualAllocExNuma(hprocess: Handle, lpaddress: COpaquePointer?, dwsize: ULong, flallocationtype: VirtualAllocationType, flprotect: UInt, nndpreferred: UInt): COpaquePointer?

public expect fun virtualAllocFromApp(baseaddress: COpaquePointer?, size: ULong, allocationtype: VirtualAllocationType, protection: UInt): COpaquePointer?

public expect fun virtualFree(lpaddress: COpaquePointer?, dwsize: ULong, dwfreetype: VirtualFreeType): Bool

public expect fun virtualFreeEx(hprocess: Handle, lpaddress: COpaquePointer?, dwsize: ULong, dwfreetype: VirtualFreeType): Bool

public expect fun virtualLock(lpaddress: COpaquePointer?, dwsize: ULong): Bool

public expect fun virtualProtect(lpaddress: COpaquePointer?, dwsize: ULong, flnewprotect: PageProtectionFlags, lpfloldprotect: COpaquePointer?): Bool

public expect fun virtualProtectEx(hprocess: Handle, lpaddress: COpaquePointer?, dwsize: ULong, flnewprotect: PageProtectionFlags, lpfloldprotect: COpaquePointer?): Bool

public expect fun virtualProtectFromApp(address: COpaquePointer?, size: ULong, newprotection: UInt, oldprotection: COpaquePointer?): Bool

public expect fun virtualQuery(lpaddress: COpaquePointer?, lpbuffer: COpaquePointer?, dwlength: ULong): ULong

public expect fun virtualQueryEx(hprocess: Handle, lpaddress: COpaquePointer?, lpbuffer: COpaquePointer?, dwlength: ULong): ULong

public expect fun virtualUnlock(lpaddress: COpaquePointer?, dwsize: ULong): Bool

public expect fun virtualUnlockEx(process: Handle, address: COpaquePointer?, size: ULong): Bool
