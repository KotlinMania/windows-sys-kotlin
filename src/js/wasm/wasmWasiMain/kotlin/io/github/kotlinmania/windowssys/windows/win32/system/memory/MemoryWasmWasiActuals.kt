@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun addSecureMemoryCacheCallback(pfncallback: PsecureMemoryCacheCallback): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryAddSecureMemoryCacheCallback")

public actual fun allocateUserPhysicalPages(hprocess: Handle, numberofpages: MutPtr, pagearray: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryAllocateUserPhysicalPages")

public actual fun allocateUserPhysicalPages2(objecthandle: Handle, numberofpages: MutPtr, pagearray: MutPtr, extendedparameters: MutPtr, extendedparametercount: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryAllocateUserPhysicalPages2")

public actual fun allocateUserPhysicalPagesNuma(hprocess: Handle, numberofpages: MutPtr, pagearray: MutPtr, nndpreferred: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryAllocateUserPhysicalPagesNuma")

public actual fun createFileMapping2(file: Handle, securityattributes: ConstPtr, desiredaccess: UInt, pageprotection: PageProtectionFlags, allocationattributes: UInt, maximumsize: ULong, name: Pcwstr, extendedparameters: MutPtr, parametercount: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryCreateFileMapping2")

public actual fun createFileMappingA(hfile: Handle, lpfilemappingattributes: ConstPtr, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryCreateFileMappingA")

public actual fun createFileMappingFromApp(hfile: Handle, securityattributes: ConstPtr, pageprotection: PageProtectionFlags, maximumsize: ULong, name: Pcwstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryCreateFileMappingFromApp")

public actual fun createFileMappingNumaA(hfile: Handle, lpfilemappingattributes: ConstPtr, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcstr, nndpreferred: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryCreateFileMappingNumaA")

public actual fun createFileMappingNumaW(hfile: Handle, lpfilemappingattributes: ConstPtr, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcwstr, nndpreferred: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryCreateFileMappingNumaW")

public actual fun createFileMappingW(hfile: Handle, lpfilemappingattributes: ConstPtr, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcwstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryCreateFileMappingW")

public actual fun createMemoryResourceNotification(notificationtype: MemoryResourceNotificationType): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryCreateMemoryResourceNotification")

public actual fun discardVirtualMemory(virtualaddress: MutPtr, size: ULong): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryDiscardVirtualMemory")

public actual fun flushViewOfFile(lpbaseaddress: ConstPtr, dwnumberofbytestoflush: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryFlushViewOfFile")

public actual fun freeUserPhysicalPages(hprocess: Handle, numberofpages: MutPtr, pagearray: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryFreeUserPhysicalPages")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemMemoryGetLargePageMinimum")
private external fun wasiWindowssysWindowsWin32SystemMemoryGetLargePageMinimum(): Long

public actual fun getLargePageMinimum(): ULong =
    wasiWindowssysWindowsWin32SystemMemoryGetLargePageMinimum().toULong()

public actual fun getMemoryErrorHandlingCapabilities(capabilities: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryGetMemoryErrorHandlingCapabilities")

public actual fun getProcessHeap(): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryGetProcessHeap")

public actual fun getProcessHeaps(numberofheaps: UInt, processheaps: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryGetProcessHeaps")

public actual fun getProcessWorkingSetSizeEx(hprocess: Handle, lpminimumworkingsetsize: MutPtr, lpmaximumworkingsetsize: MutPtr, flags: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryGetProcessWorkingSetSizeEx")

public actual fun getSystemFileCacheSize(lpminimumfilecachesize: MutPtr, lpmaximumfilecachesize: MutPtr, lpflags: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryGetSystemFileCacheSize")

public actual fun getWriteWatch(dwflags: UInt, lpbaseaddress: ConstPtr, dwregionsize: ULong, lpaddresses: MutPtr, lpdwcount: MutPtr, lpdwgranularity: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryGetWriteWatch")

public actual fun globalAlloc(uflags: GlobalAllocFlags, dwbytes: ULong): Hglobal =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryGlobalAlloc")

public actual fun globalFlags(hmem: Hglobal): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryGlobalFlags")

public actual fun globalHandle(pmem: ConstPtr): Hglobal =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryGlobalHandle")

public actual fun globalLock(hmem: Hglobal): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryGlobalLock")

public actual fun globalReAlloc(hmem: Hglobal, dwbytes: ULong, uflags: UInt): Hglobal =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryGlobalReAlloc")

public actual fun globalSize(hmem: Hglobal): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryGlobalSize")

public actual fun globalUnlock(hmem: Hglobal): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryGlobalUnlock")

public actual fun heapAlloc(hheap: Handle, dwflags: HeapFlags, dwbytes: ULong): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryHeapAlloc")

public actual fun heapCompact(hheap: Handle, dwflags: HeapFlags): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryHeapCompact")

public actual fun heapCreate(floptions: HeapFlags, dwinitialsize: ULong, dwmaximumsize: ULong): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryHeapCreate")

public actual fun heapDestroy(hheap: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryHeapDestroy")

public actual fun heapFree(hheap: Handle, dwflags: HeapFlags, lpmem: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryHeapFree")

public actual fun heapLock(hheap: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryHeapLock")

public actual fun heapQueryInformation(heaphandle: Handle, heapinformationclass: HeapInformationClass, heapinformation: MutPtr, heapinformationlength: ULong, returnlength: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryHeapQueryInformation")

public actual fun heapReAlloc(hheap: Handle, dwflags: HeapFlags, lpmem: ConstPtr, dwbytes: ULong): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryHeapReAlloc")

public actual fun heapSetInformation(heaphandle: Handle, heapinformationclass: HeapInformationClass, heapinformation: ConstPtr, heapinformationlength: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryHeapSetInformation")

public actual fun heapSize(hheap: Handle, dwflags: HeapFlags, lpmem: ConstPtr): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryHeapSize")

public actual fun heapSummary(hheap: Handle, dwflags: UInt, lpsummary: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryHeapSummary")

public actual fun heapUnlock(hheap: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryHeapUnlock")

public actual fun heapValidate(hheap: Handle, dwflags: HeapFlags, lpmem: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryHeapValidate")

public actual fun heapWalk(hheap: Handle, lpentry: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryHeapWalk")

public actual fun isBadCodePtr(lpfn: Farproc): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryIsBadCodePtr")

public actual fun isBadReadPtr(lp: ConstPtr, ucb: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryIsBadReadPtr")

public actual fun isBadStringPtrA(lpsz: Pcstr, ucchmax: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryIsBadStringPtrA")

public actual fun isBadStringPtrW(lpsz: Pcwstr, ucchmax: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryIsBadStringPtrW")

public actual fun isBadWritePtr(lp: ConstPtr, ucb: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryIsBadWritePtr")

public actual fun localAlloc(uflags: LocalAllocFlags, ubytes: ULong): Hlocal =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryLocalAlloc")

public actual fun localFlags(hmem: Hlocal): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryLocalFlags")

public actual fun localHandle(pmem: ConstPtr): Hlocal =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryLocalHandle")

public actual fun localLock(hmem: Hlocal): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryLocalLock")

public actual fun localReAlloc(hmem: Hlocal, ubytes: ULong, uflags: UInt): Hlocal =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryLocalReAlloc")

public actual fun localSize(hmem: Hlocal): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryLocalSize")

public actual fun localUnlock(hmem: Hlocal): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryLocalUnlock")

public actual fun mapUserPhysicalPages(virtualaddress: ConstPtr, numberofpages: ULong, pagearray: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryMapUserPhysicalPages")

public actual fun mapUserPhysicalPagesScatter(virtualaddresses: ConstPtr, numberofpages: ULong, pagearray: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryMapUserPhysicalPagesScatter")

public actual fun mapViewOfFile(hfilemappingobject: Handle, dwdesiredaccess: FileMap, dwfileoffsethigh: UInt, dwfileoffsetlow: UInt, dwnumberofbytestomap: ULong): MemoryMappedViewAddress =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryMapViewOfFile")

public actual fun mapViewOfFile3(filemapping: Handle, process: Handle, baseaddress: ConstPtr, offset: ULong, viewsize: ULong, allocationtype: VirtualAllocationType, pageprotection: UInt, extendedparameters: MutPtr, parametercount: UInt): MemoryMappedViewAddress =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryMapViewOfFile3")

public actual fun mapViewOfFile3FromApp(filemapping: Handle, process: Handle, baseaddress: ConstPtr, offset: ULong, viewsize: ULong, allocationtype: VirtualAllocationType, pageprotection: UInt, extendedparameters: MutPtr, parametercount: UInt): MemoryMappedViewAddress =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryMapViewOfFile3FromApp")

public actual fun mapViewOfFileEx(hfilemappingobject: Handle, dwdesiredaccess: FileMap, dwfileoffsethigh: UInt, dwfileoffsetlow: UInt, dwnumberofbytestomap: ULong, lpbaseaddress: ConstPtr): MemoryMappedViewAddress =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryMapViewOfFileEx")

public actual fun mapViewOfFileExNuma(hfilemappingobject: Handle, dwdesiredaccess: FileMap, dwfileoffsethigh: UInt, dwfileoffsetlow: UInt, dwnumberofbytestomap: ULong, lpbaseaddress: ConstPtr, nndpreferred: UInt): MemoryMappedViewAddress =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryMapViewOfFileExNuma")

public actual fun mapViewOfFileFromApp(hfilemappingobject: Handle, desiredaccess: FileMap, fileoffset: ULong, numberofbytestomap: ULong): MemoryMappedViewAddress =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryMapViewOfFileFromApp")

public actual fun mapViewOfFileNuma2(filemappinghandle: Handle, processhandle: Handle, offset: ULong, baseaddress: ConstPtr, viewsize: ULong, allocationtype: UInt, pageprotection: UInt, preferrednode: UInt): MemoryMappedViewAddress =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryMapViewOfFileNuma2")

public actual fun offerVirtualMemory(virtualaddress: MutPtr, size: ULong, priority: OfferPriority): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryOfferVirtualMemory")

public actual fun openDedicatedMemoryPartition(partition: Handle, dedicatedmemorytypeid: ULong, desiredaccess: UInt, inherithandle: Bool): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryOpenDedicatedMemoryPartition")

public actual fun openFileMappingA(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryOpenFileMappingA")

public actual fun openFileMappingFromApp(desiredaccess: UInt, inherithandle: Bool, name: Pcwstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryOpenFileMappingFromApp")

public actual fun openFileMappingW(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcwstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryOpenFileMappingW")

public actual fun prefetchVirtualMemory(hprocess: Handle, numberofentries: ULong, virtualaddresses: ConstPtr, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryPrefetchVirtualMemory")

public actual fun queryMemoryResourceNotification(resourcenotificationhandle: Handle, resourcestate: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryQueryMemoryResourceNotification")

public actual fun queryPartitionInformation(partition: Handle, partitioninformationclass: Win32MemoryPartitionInformationClass, partitioninformation: MutPtr, partitioninformationlength: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryQueryPartitionInformation")

public actual fun queryVirtualMemoryInformation(process: Handle, virtualaddress: ConstPtr, memoryinformationclass: Win32MemoryInformationClass, memoryinformation: MutPtr, memoryinformationsize: ULong, returnsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryQueryVirtualMemoryInformation")

public actual fun reclaimVirtualMemory(virtualaddress: ConstPtr, size: ULong): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryReclaimVirtualMemory")

public actual fun registerBadMemoryNotification(callback: PbadMemoryCallbackRoutine): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryRegisterBadMemoryNotification")

public actual fun removeSecureMemoryCacheCallback(pfncallback: PsecureMemoryCacheCallback): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryRemoveSecureMemoryCacheCallback")

public actual fun resetWriteWatch(lpbaseaddress: ConstPtr, dwregionsize: ULong): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryResetWriteWatch")

public actual fun rtlCompareMemory(source1: ConstPtr, source2: ConstPtr, length: ULong): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryRtlCompareMemory")

public actual fun rtlCrc32(buffer: ConstPtr, size: ULong, initialcrc: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryRtlCrc32")

public actual fun rtlCrc64(buffer: ConstPtr, size: ULong, initialcrc: ULong): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryRtlCrc64")

public actual fun rtlIsZeroMemory(buffer: ConstPtr, length: ULong): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryRtlIsZeroMemory")

public actual fun setProcessValidCallTargets(hprocess: Handle, virtualaddress: ConstPtr, regionsize: ULong, numberofoffsets: UInt, offsetinformation: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemorySetProcessValidCallTargets")

public actual fun setProcessValidCallTargetsForMappedView(process: Handle, virtualaddress: ConstPtr, regionsize: ULong, numberofoffsets: UInt, offsetinformation: MutPtr, section: Handle, expectedfileoffset: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemorySetProcessValidCallTargetsForMappedView")

public actual fun setProcessWorkingSetSizeEx(hprocess: Handle, dwminimumworkingsetsize: ULong, dwmaximumworkingsetsize: ULong, flags: SetprocessworkingsetsizeexFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemorySetProcessWorkingSetSizeEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemMemorySetSystemFileCacheSize")
private external fun wasiWindowssysWindowsWin32SystemMemorySetSystemFileCacheSize(minimumfilecachesize: Long, maximumfilecachesize: Long, flags: Int): Int

public actual fun setSystemFileCacheSize(minimumfilecachesize: ULong, maximumfilecachesize: ULong, flags: UInt): Bool =
    wasiWindowssysWindowsWin32SystemMemorySetSystemFileCacheSize(minimumfilecachesize.toLong(), maximumfilecachesize.toLong(), flags.toInt())

public actual fun unmapViewOfFile(lpbaseaddress: MemoryMappedViewAddress): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryUnmapViewOfFile")

public actual fun unmapViewOfFile2(process: Handle, baseaddress: MemoryMappedViewAddress, unmapflags: UnmapViewOfFileFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryUnmapViewOfFile2")

public actual fun unmapViewOfFileEx(baseaddress: MemoryMappedViewAddress, unmapflags: UnmapViewOfFileFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryUnmapViewOfFileEx")

public actual fun unregisterBadMemoryNotification(registrationhandle: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryUnregisterBadMemoryNotification")

public actual fun virtualAlloc(lpaddress: ConstPtr, dwsize: ULong, flallocationtype: VirtualAllocationType, flprotect: PageProtectionFlags): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryVirtualAlloc")

public actual fun virtualAlloc2(process: Handle, baseaddress: ConstPtr, size: ULong, allocationtype: VirtualAllocationType, pageprotection: UInt, extendedparameters: MutPtr, parametercount: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryVirtualAlloc2")

public actual fun virtualAlloc2FromApp(process: Handle, baseaddress: ConstPtr, size: ULong, allocationtype: VirtualAllocationType, pageprotection: UInt, extendedparameters: MutPtr, parametercount: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryVirtualAlloc2FromApp")

public actual fun virtualAllocEx(hprocess: Handle, lpaddress: ConstPtr, dwsize: ULong, flallocationtype: VirtualAllocationType, flprotect: PageProtectionFlags): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryVirtualAllocEx")

public actual fun virtualAllocExNuma(hprocess: Handle, lpaddress: ConstPtr, dwsize: ULong, flallocationtype: VirtualAllocationType, flprotect: UInt, nndpreferred: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryVirtualAllocExNuma")

public actual fun virtualAllocFromApp(baseaddress: ConstPtr, size: ULong, allocationtype: VirtualAllocationType, protection: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryVirtualAllocFromApp")

public actual fun virtualFree(lpaddress: MutPtr, dwsize: ULong, dwfreetype: VirtualFreeType): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryVirtualFree")

public actual fun virtualFreeEx(hprocess: Handle, lpaddress: MutPtr, dwsize: ULong, dwfreetype: VirtualFreeType): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryVirtualFreeEx")

public actual fun virtualLock(lpaddress: ConstPtr, dwsize: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryVirtualLock")

public actual fun virtualProtect(lpaddress: ConstPtr, dwsize: ULong, flnewprotect: PageProtectionFlags, lpfloldprotect: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryVirtualProtect")

public actual fun virtualProtectEx(hprocess: Handle, lpaddress: ConstPtr, dwsize: ULong, flnewprotect: PageProtectionFlags, lpfloldprotect: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryVirtualProtectEx")

public actual fun virtualProtectFromApp(address: ConstPtr, size: ULong, newprotection: UInt, oldprotection: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryVirtualProtectFromApp")

public actual fun virtualQuery(lpaddress: ConstPtr, lpbuffer: MutPtr, dwlength: ULong): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryVirtualQuery")

public actual fun virtualQueryEx(hprocess: Handle, lpaddress: ConstPtr, lpbuffer: MutPtr, dwlength: ULong): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryVirtualQueryEx")

public actual fun virtualUnlock(lpaddress: ConstPtr, dwsize: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryVirtualUnlock")

public actual fun virtualUnlockEx(process: Handle, address: ConstPtr, size: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemMemoryVirtualUnlockEx")
