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

public actual fun addSecureMemoryCacheCallback(pfncallback: PsecureMemoryCacheCallback): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun allocateUserPhysicalPages(hprocess: Handle, numberofpages: COpaquePointer?, pagearray: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun allocateUserPhysicalPages2(objecthandle: Handle, numberofpages: COpaquePointer?, pagearray: COpaquePointer?, extendedparameters: COpaquePointer?, extendedparametercount: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun allocateUserPhysicalPagesNuma(hprocess: Handle, numberofpages: COpaquePointer?, pagearray: COpaquePointer?, nndpreferred: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createFileMapping2(file: Handle, securityattributes: COpaquePointer?, desiredaccess: UInt, pageprotection: PageProtectionFlags, allocationattributes: UInt, maximumsize: ULong, name: Pcwstr, extendedparameters: COpaquePointer?, parametercount: UInt): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createFileMappingA(hfile: Handle, lpfilemappingattributes: COpaquePointer?, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcstr): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createFileMappingFromApp(hfile: Handle, securityattributes: COpaquePointer?, pageprotection: PageProtectionFlags, maximumsize: ULong, name: Pcwstr): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createFileMappingNumaA(hfile: Handle, lpfilemappingattributes: COpaquePointer?, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcstr, nndpreferred: UInt): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createFileMappingNumaW(hfile: Handle, lpfilemappingattributes: COpaquePointer?, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcwstr, nndpreferred: UInt): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createFileMappingW(hfile: Handle, lpfilemappingattributes: COpaquePointer?, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcwstr): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createMemoryResourceNotification(notificationtype: MemoryResourceNotificationType): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun discardVirtualMemory(virtualaddress: COpaquePointer?, size: ULong): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun flushViewOfFile(lpbaseaddress: COpaquePointer?, dwnumberofbytestoflush: ULong): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun freeUserPhysicalPages(hprocess: Handle, numberofpages: COpaquePointer?, pagearray: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getLargePageMinimum(): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getMemoryErrorHandlingCapabilities(capabilities: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getProcessHeap(): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getProcessHeaps(numberofheaps: UInt, processheaps: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getProcessWorkingSetSizeEx(hprocess: Handle, lpminimumworkingsetsize: COpaquePointer?, lpmaximumworkingsetsize: COpaquePointer?, flags: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getSystemFileCacheSize(lpminimumfilecachesize: COpaquePointer?, lpmaximumfilecachesize: COpaquePointer?, lpflags: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getWriteWatch(dwflags: UInt, lpbaseaddress: COpaquePointer?, dwregionsize: ULong, lpaddresses: COpaquePointer?, lpdwcount: COpaquePointer?, lpdwgranularity: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun globalAlloc(uflags: GlobalAllocFlags, dwbytes: ULong): Hglobal =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun globalFlags(hmem: Hglobal): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun globalHandle(pmem: COpaquePointer?): Hglobal =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun globalLock(hmem: Hglobal): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun globalReAlloc(hmem: Hglobal, dwbytes: ULong, uflags: UInt): Hglobal =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun globalSize(hmem: Hglobal): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun globalUnlock(hmem: Hglobal): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun heapAlloc(hheap: Handle, dwflags: HeapFlags, dwbytes: ULong): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun heapCompact(hheap: Handle, dwflags: HeapFlags): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun heapCreate(floptions: HeapFlags, dwinitialsize: ULong, dwmaximumsize: ULong): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun heapDestroy(hheap: Handle): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun heapFree(hheap: Handle, dwflags: HeapFlags, lpmem: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun heapLock(hheap: Handle): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun heapQueryInformation(heaphandle: Handle, heapinformationclass: HeapInformationClass, heapinformation: COpaquePointer?, heapinformationlength: ULong, returnlength: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun heapReAlloc(hheap: Handle, dwflags: HeapFlags, lpmem: COpaquePointer?, dwbytes: ULong): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun heapSetInformation(heaphandle: Handle, heapinformationclass: HeapInformationClass, heapinformation: COpaquePointer?, heapinformationlength: ULong): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun heapSize(hheap: Handle, dwflags: HeapFlags, lpmem: COpaquePointer?): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun heapSummary(hheap: Handle, dwflags: UInt, lpsummary: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun heapUnlock(hheap: Handle): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun heapValidate(hheap: Handle, dwflags: HeapFlags, lpmem: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun heapWalk(hheap: Handle, lpentry: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isBadCodePtr(lpfn: Farproc): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isBadReadPtr(lp: COpaquePointer?, ucb: ULong): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isBadStringPtrA(lpsz: Pcstr, ucchmax: ULong): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isBadStringPtrW(lpsz: Pcwstr, ucchmax: ULong): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isBadWritePtr(lp: COpaquePointer?, ucb: ULong): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun localAlloc(uflags: LocalAllocFlags, ubytes: ULong): Hlocal =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun localFlags(hmem: Hlocal): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun localHandle(pmem: COpaquePointer?): Hlocal =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun localLock(hmem: Hlocal): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun localReAlloc(hmem: Hlocal, ubytes: ULong, uflags: UInt): Hlocal =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun localSize(hmem: Hlocal): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun localUnlock(hmem: Hlocal): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mapUserPhysicalPages(virtualaddress: COpaquePointer?, numberofpages: ULong, pagearray: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mapUserPhysicalPagesScatter(virtualaddresses: COpaquePointer?, numberofpages: ULong, pagearray: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mapViewOfFile(hfilemappingobject: Handle, dwdesiredaccess: FileMap, dwfileoffsethigh: UInt, dwfileoffsetlow: UInt, dwnumberofbytestomap: ULong): MemoryMappedViewAddress =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mapViewOfFile3(filemapping: Handle, process: Handle, baseaddress: COpaquePointer?, offset: ULong, viewsize: ULong, allocationtype: VirtualAllocationType, pageprotection: UInt, extendedparameters: COpaquePointer?, parametercount: UInt): MemoryMappedViewAddress =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mapViewOfFile3FromApp(filemapping: Handle, process: Handle, baseaddress: COpaquePointer?, offset: ULong, viewsize: ULong, allocationtype: VirtualAllocationType, pageprotection: UInt, extendedparameters: COpaquePointer?, parametercount: UInt): MemoryMappedViewAddress =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mapViewOfFileEx(hfilemappingobject: Handle, dwdesiredaccess: FileMap, dwfileoffsethigh: UInt, dwfileoffsetlow: UInt, dwnumberofbytestomap: ULong, lpbaseaddress: COpaquePointer?): MemoryMappedViewAddress =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mapViewOfFileExNuma(hfilemappingobject: Handle, dwdesiredaccess: FileMap, dwfileoffsethigh: UInt, dwfileoffsetlow: UInt, dwnumberofbytestomap: ULong, lpbaseaddress: COpaquePointer?, nndpreferred: UInt): MemoryMappedViewAddress =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mapViewOfFileFromApp(hfilemappingobject: Handle, desiredaccess: FileMap, fileoffset: ULong, numberofbytestomap: ULong): MemoryMappedViewAddress =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mapViewOfFileNuma2(filemappinghandle: Handle, processhandle: Handle, offset: ULong, baseaddress: COpaquePointer?, viewsize: ULong, allocationtype: UInt, pageprotection: UInt, preferrednode: UInt): MemoryMappedViewAddress =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun offerVirtualMemory(virtualaddress: COpaquePointer?, size: ULong, priority: OfferPriority): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun openDedicatedMemoryPartition(partition: Handle, dedicatedmemorytypeid: ULong, desiredaccess: UInt, inherithandle: Bool): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun openFileMappingA(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcstr): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun openFileMappingFromApp(desiredaccess: UInt, inherithandle: Bool, name: Pcwstr): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun openFileMappingW(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcwstr): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun prefetchVirtualMemory(hprocess: Handle, numberofentries: ULong, virtualaddresses: COpaquePointer?, flags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun queryMemoryResourceNotification(resourcenotificationhandle: Handle, resourcestate: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun queryPartitionInformation(partition: Handle, partitioninformationclass: Win32MemoryPartitionInformationClass, partitioninformation: COpaquePointer?, partitioninformationlength: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun queryVirtualMemoryInformation(process: Handle, virtualaddress: COpaquePointer?, memoryinformationclass: Win32MemoryInformationClass, memoryinformation: COpaquePointer?, memoryinformationsize: ULong, returnsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun reclaimVirtualMemory(virtualaddress: COpaquePointer?, size: ULong): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun registerBadMemoryNotification(callback: PbadMemoryCallbackRoutine): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun removeSecureMemoryCacheCallback(pfncallback: PsecureMemoryCacheCallback): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun resetWriteWatch(lpbaseaddress: COpaquePointer?, dwregionsize: ULong): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlCompareMemory(source1: COpaquePointer?, source2: COpaquePointer?, length: ULong): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlCrc32(buffer: COpaquePointer?, size: ULong, initialcrc: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlCrc64(buffer: COpaquePointer?, size: ULong, initialcrc: ULong): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlIsZeroMemory(buffer: COpaquePointer?, length: ULong): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setProcessValidCallTargets(hprocess: Handle, virtualaddress: COpaquePointer?, regionsize: ULong, numberofoffsets: UInt, offsetinformation: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setProcessValidCallTargetsForMappedView(process: Handle, virtualaddress: COpaquePointer?, regionsize: ULong, numberofoffsets: UInt, offsetinformation: COpaquePointer?, section: Handle, expectedfileoffset: ULong): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setProcessWorkingSetSizeEx(hprocess: Handle, dwminimumworkingsetsize: ULong, dwmaximumworkingsetsize: ULong, flags: SetprocessworkingsetsizeexFlags): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setSystemFileCacheSize(minimumfilecachesize: ULong, maximumfilecachesize: ULong, flags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unmapViewOfFile(lpbaseaddress: MemoryMappedViewAddress): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unmapViewOfFile2(process: Handle, baseaddress: MemoryMappedViewAddress, unmapflags: UnmapViewOfFileFlags): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unmapViewOfFileEx(baseaddress: MemoryMappedViewAddress, unmapflags: UnmapViewOfFileFlags): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unregisterBadMemoryNotification(registrationhandle: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun virtualAlloc(lpaddress: COpaquePointer?, dwsize: ULong, flallocationtype: VirtualAllocationType, flprotect: PageProtectionFlags): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun virtualAlloc2(process: Handle, baseaddress: COpaquePointer?, size: ULong, allocationtype: VirtualAllocationType, pageprotection: UInt, extendedparameters: COpaquePointer?, parametercount: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun virtualAlloc2FromApp(process: Handle, baseaddress: COpaquePointer?, size: ULong, allocationtype: VirtualAllocationType, pageprotection: UInt, extendedparameters: COpaquePointer?, parametercount: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun virtualAllocEx(hprocess: Handle, lpaddress: COpaquePointer?, dwsize: ULong, flallocationtype: VirtualAllocationType, flprotect: PageProtectionFlags): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun virtualAllocExNuma(hprocess: Handle, lpaddress: COpaquePointer?, dwsize: ULong, flallocationtype: VirtualAllocationType, flprotect: UInt, nndpreferred: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun virtualAllocFromApp(baseaddress: COpaquePointer?, size: ULong, allocationtype: VirtualAllocationType, protection: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun virtualFree(lpaddress: COpaquePointer?, dwsize: ULong, dwfreetype: VirtualFreeType): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun virtualFreeEx(hprocess: Handle, lpaddress: COpaquePointer?, dwsize: ULong, dwfreetype: VirtualFreeType): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun virtualLock(lpaddress: COpaquePointer?, dwsize: ULong): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun virtualProtect(lpaddress: COpaquePointer?, dwsize: ULong, flnewprotect: PageProtectionFlags, lpfloldprotect: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun virtualProtectEx(hprocess: Handle, lpaddress: COpaquePointer?, dwsize: ULong, flnewprotect: PageProtectionFlags, lpfloldprotect: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun virtualProtectFromApp(address: COpaquePointer?, size: ULong, newprotection: UInt, oldprotection: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun virtualQuery(lpaddress: COpaquePointer?, lpbuffer: COpaquePointer?, dwlength: ULong): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun virtualQueryEx(hprocess: Handle, lpaddress: COpaquePointer?, lpbuffer: COpaquePointer?, dwlength: ULong): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun virtualUnlock(lpaddress: COpaquePointer?, dwsize: ULong): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun virtualUnlockEx(process: Handle, address: COpaquePointer?, size: ULong): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
