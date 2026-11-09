@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.memory

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FARPROC
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HGLOBAL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HLOCAL

private val _windowsWin32SystemMemoryNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun AddSecureMemoryCacheCallback(pfncallback: PSECURE_MEMORY_CACHE_CALLBACK): BOOL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_AddSecureMemoryCacheCallback(pfncallback.toLong().toString()) as Int) else 0

public actual fun AllocateUserPhysicalPages(hprocess: HANDLE, numberofpages: Long, pagearray: Long): BOOL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_AllocateUserPhysicalPages(hprocess.toString(), numberofpages.toString(), pagearray.toString()) as Int) else 0

public actual fun AllocateUserPhysicalPages2(objecthandle: HANDLE, numberofpages: Long, pagearray: Long, extendedparameters: Long, extendedparametercount: UInt): BOOL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_AllocateUserPhysicalPages2(objecthandle.toString(), numberofpages.toString(), pagearray.toString(), extendedparameters.toString(), extendedparametercount.toInt()) as Int) else 0

public actual fun AllocateUserPhysicalPagesNuma(hprocess: HANDLE, numberofpages: Long, pagearray: Long, nndpreferred: UInt): BOOL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_AllocateUserPhysicalPagesNuma(hprocess.toString(), numberofpages.toString(), pagearray.toString(), nndpreferred.toInt()) as Int) else 0

public actual fun CreateFileMapping2(file: HANDLE, securityattributes: Long, desiredaccess: UInt, pageprotection: PAGE_PROTECTION_FLAGS, allocationattributes: UInt, maximumsize: ULong, name: PCWSTR, extendedparameters: Long, parametercount: UInt): HANDLE =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_CreateFileMapping2(file.toString(), securityattributes.toString(), desiredaccess.toInt(), pageprotection.toInt(), allocationattributes.toInt(), maximumsize.toString(), name.toString(), extendedparameters.toString(), parametercount.toInt()) as String).toLong() else 0L

public actual fun CreateFileMappingA(hfile: HANDLE, lpfilemappingattributes: Long, flprotect: PAGE_PROTECTION_FLAGS, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: PCSTR): HANDLE =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_CreateFileMappingA(hfile.toString(), lpfilemappingattributes.toString(), flprotect.toInt(), dwmaximumsizehigh.toInt(), dwmaximumsizelow.toInt(), lpname.toString()) as String).toLong() else 0L

public actual fun CreateFileMappingFromApp(hfile: HANDLE, securityattributes: Long, pageprotection: PAGE_PROTECTION_FLAGS, maximumsize: ULong, name: PCWSTR): HANDLE =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_CreateFileMappingFromApp(hfile.toString(), securityattributes.toString(), pageprotection.toInt(), maximumsize.toString(), name.toString()) as String).toLong() else 0L

public actual fun CreateFileMappingNumaA(hfile: HANDLE, lpfilemappingattributes: Long, flprotect: PAGE_PROTECTION_FLAGS, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: PCSTR, nndpreferred: UInt): HANDLE =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_CreateFileMappingNumaA(hfile.toString(), lpfilemappingattributes.toString(), flprotect.toInt(), dwmaximumsizehigh.toInt(), dwmaximumsizelow.toInt(), lpname.toString(), nndpreferred.toInt()) as String).toLong() else 0L

public actual fun CreateFileMappingNumaW(hfile: HANDLE, lpfilemappingattributes: Long, flprotect: PAGE_PROTECTION_FLAGS, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: PCWSTR, nndpreferred: UInt): HANDLE =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_CreateFileMappingNumaW(hfile.toString(), lpfilemappingattributes.toString(), flprotect.toInt(), dwmaximumsizehigh.toInt(), dwmaximumsizelow.toInt(), lpname.toString(), nndpreferred.toInt()) as String).toLong() else 0L

public actual fun CreateFileMappingW(hfile: HANDLE, lpfilemappingattributes: Long, flprotect: PAGE_PROTECTION_FLAGS, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: PCWSTR): HANDLE =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_CreateFileMappingW(hfile.toString(), lpfilemappingattributes.toString(), flprotect.toInt(), dwmaximumsizehigh.toInt(), dwmaximumsizelow.toInt(), lpname.toString()) as String).toLong() else 0L

public actual fun CreateMemoryResourceNotification(notificationtype: MEMORY_RESOURCE_NOTIFICATION_TYPE): HANDLE =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_CreateMemoryResourceNotification(notificationtype) as String).toLong() else 0L

public actual fun DiscardVirtualMemory(virtualaddress: Long, size: ULong): UInt =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_DiscardVirtualMemory(virtualaddress.toString(), size.toString()) as Int).toUInt() else 0u

public actual fun FlushViewOfFile(lpbaseaddress: Long, dwnumberofbytestoflush: ULong): BOOL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_FlushViewOfFile(lpbaseaddress.toString(), dwnumberofbytestoflush.toString()) as Int) else 0

public actual fun FreeUserPhysicalPages(hprocess: HANDLE, numberofpages: Long, pagearray: Long): BOOL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_FreeUserPhysicalPages(hprocess.toString(), numberofpages.toString(), pagearray.toString()) as Int) else 0

public actual fun GetLargePageMinimum(): ULong =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_GetLargePageMinimum() as String).toULong() else 0uL

public actual fun GetMemoryErrorHandlingCapabilities(capabilities: Long): BOOL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_GetMemoryErrorHandlingCapabilities(capabilities.toString()) as Int) else 0

public actual fun GetProcessHeap(): HANDLE =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_GetProcessHeap() as String).toLong() else 0L

public actual fun GetProcessHeaps(numberofheaps: UInt, processheaps: Long): UInt =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_GetProcessHeaps(numberofheaps.toInt(), processheaps.toString()) as Int).toUInt() else 0u

public actual fun GetProcessWorkingSetSizeEx(hprocess: HANDLE, lpminimumworkingsetsize: Long, lpmaximumworkingsetsize: Long, flags: Long): BOOL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_GetProcessWorkingSetSizeEx(hprocess.toString(), lpminimumworkingsetsize.toString(), lpmaximumworkingsetsize.toString(), flags.toString()) as Int) else 0

public actual fun GetSystemFileCacheSize(lpminimumfilecachesize: Long, lpmaximumfilecachesize: Long, lpflags: Long): BOOL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_GetSystemFileCacheSize(lpminimumfilecachesize.toString(), lpmaximumfilecachesize.toString(), lpflags.toString()) as Int) else 0

public actual fun GetWriteWatch(dwflags: UInt, lpbaseaddress: Long, dwregionsize: ULong, lpaddresses: Long, lpdwcount: Long, lpdwgranularity: Long): UInt =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_GetWriteWatch(dwflags.toInt(), lpbaseaddress.toString(), dwregionsize.toString(), lpaddresses.toString(), lpdwcount.toString(), lpdwgranularity.toString()) as Int).toUInt() else 0u

public actual fun GlobalAlloc(uflags: GLOBAL_ALLOC_FLAGS, dwbytes: ULong): HGLOBAL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_GlobalAlloc(uflags.toInt(), dwbytes.toString()) as String).toLong() else 0L

public actual fun GlobalFlags(hmem: HGLOBAL): UInt =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_GlobalFlags(hmem.toString()) as Int).toUInt() else 0u

public actual fun GlobalHandle(pmem: Long): HGLOBAL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_GlobalHandle(pmem.toString()) as String).toLong() else 0L

public actual fun GlobalLock(hmem: HGLOBAL): Long =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_GlobalLock(hmem.toString()) as String).toLong() else 0L

public actual fun GlobalReAlloc(hmem: HGLOBAL, dwbytes: ULong, uflags: UInt): HGLOBAL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_GlobalReAlloc(hmem.toString(), dwbytes.toString(), uflags.toInt()) as String).toLong() else 0L

public actual fun GlobalSize(hmem: HGLOBAL): ULong =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_GlobalSize(hmem.toString()) as String).toULong() else 0uL

public actual fun GlobalUnlock(hmem: HGLOBAL): BOOL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_GlobalUnlock(hmem.toString()) as Int) else 0

public actual fun HeapAlloc(hheap: HANDLE, dwflags: HEAP_FLAGS, dwbytes: ULong): Long =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_HeapAlloc(hheap.toString(), dwflags.toInt(), dwbytes.toString()) as String).toLong() else 0L

public actual fun HeapCompact(hheap: HANDLE, dwflags: HEAP_FLAGS): ULong =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_HeapCompact(hheap.toString(), dwflags.toInt()) as String).toULong() else 0uL

public actual fun HeapCreate(floptions: HEAP_FLAGS, dwinitialsize: ULong, dwmaximumsize: ULong): HANDLE =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_HeapCreate(floptions.toInt(), dwinitialsize.toString(), dwmaximumsize.toString()) as String).toLong() else 0L

public actual fun HeapDestroy(hheap: HANDLE): BOOL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_HeapDestroy(hheap.toString()) as Int) else 0

public actual fun HeapFree(hheap: HANDLE, dwflags: HEAP_FLAGS, lpmem: Long): BOOL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_HeapFree(hheap.toString(), dwflags.toInt(), lpmem.toString()) as Int) else 0

public actual fun HeapLock(hheap: HANDLE): BOOL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_HeapLock(hheap.toString()) as Int) else 0

public actual fun HeapQueryInformation(heaphandle: HANDLE, heapinformationclass: HEAP_INFORMATION_CLASS, heapinformation: Long, heapinformationlength: ULong, returnlength: Long): BOOL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_HeapQueryInformation(heaphandle.toString(), heapinformationclass, heapinformation.toString(), heapinformationlength.toString(), returnlength.toString()) as Int) else 0

public actual fun HeapReAlloc(hheap: HANDLE, dwflags: HEAP_FLAGS, lpmem: Long, dwbytes: ULong): Long =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_HeapReAlloc(hheap.toString(), dwflags.toInt(), lpmem.toString(), dwbytes.toString()) as String).toLong() else 0L

public actual fun HeapSetInformation(heaphandle: HANDLE, heapinformationclass: HEAP_INFORMATION_CLASS, heapinformation: Long, heapinformationlength: ULong): BOOL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_HeapSetInformation(heaphandle.toString(), heapinformationclass, heapinformation.toString(), heapinformationlength.toString()) as Int) else 0

public actual fun HeapSize(hheap: HANDLE, dwflags: HEAP_FLAGS, lpmem: Long): ULong =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_HeapSize(hheap.toString(), dwflags.toInt(), lpmem.toString()) as String).toULong() else 0uL

public actual fun HeapSummary(hheap: HANDLE, dwflags: UInt, lpsummary: Long): BOOL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_HeapSummary(hheap.toString(), dwflags.toInt(), lpsummary.toString()) as Int) else 0

public actual fun HeapUnlock(hheap: HANDLE): BOOL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_HeapUnlock(hheap.toString()) as Int) else 0

public actual fun HeapValidate(hheap: HANDLE, dwflags: HEAP_FLAGS, lpmem: Long): BOOL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_HeapValidate(hheap.toString(), dwflags.toInt(), lpmem.toString()) as Int) else 0

public actual fun HeapWalk(hheap: HANDLE, lpentry: Long): BOOL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_HeapWalk(hheap.toString(), lpentry.toString()) as Int) else 0

public actual fun IsBadCodePtr(lpfn: FARPROC): BOOL =
    0

public actual fun IsBadReadPtr(lp: Long, ucb: ULong): BOOL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_IsBadReadPtr(lp.toString(), ucb.toString()) as Int) else 0

public actual fun IsBadStringPtrA(lpsz: PCSTR, ucchmax: ULong): BOOL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_IsBadStringPtrA(lpsz.toString(), ucchmax.toString()) as Int) else 0

public actual fun IsBadStringPtrW(lpsz: PCWSTR, ucchmax: ULong): BOOL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_IsBadStringPtrW(lpsz.toString(), ucchmax.toString()) as Int) else 0

public actual fun IsBadWritePtr(lp: Long, ucb: ULong): BOOL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_IsBadWritePtr(lp.toString(), ucb.toString()) as Int) else 0

public actual fun LocalAlloc(uflags: LOCAL_ALLOC_FLAGS, ubytes: ULong): HLOCAL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_LocalAlloc(uflags.toInt(), ubytes.toString()) as String).toLong() else 0L

public actual fun LocalFlags(hmem: HLOCAL): UInt =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_LocalFlags(hmem.toString()) as Int).toUInt() else 0u

public actual fun LocalHandle(pmem: Long): HLOCAL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_LocalHandle(pmem.toString()) as String).toLong() else 0L

public actual fun LocalLock(hmem: HLOCAL): Long =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_LocalLock(hmem.toString()) as String).toLong() else 0L

public actual fun LocalReAlloc(hmem: HLOCAL, ubytes: ULong, uflags: UInt): HLOCAL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_LocalReAlloc(hmem.toString(), ubytes.toString(), uflags.toInt()) as String).toLong() else 0L

public actual fun LocalSize(hmem: HLOCAL): ULong =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_LocalSize(hmem.toString()) as String).toULong() else 0uL

public actual fun LocalUnlock(hmem: HLOCAL): BOOL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_LocalUnlock(hmem.toString()) as Int) else 0

public actual fun MapUserPhysicalPages(virtualaddress: Long, numberofpages: ULong, pagearray: Long): BOOL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_MapUserPhysicalPages(virtualaddress.toString(), numberofpages.toString(), pagearray.toString()) as Int) else 0

public actual fun MapUserPhysicalPagesScatter(virtualaddresses: Long, numberofpages: ULong, pagearray: Long): BOOL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_MapUserPhysicalPagesScatter(virtualaddresses.toString(), numberofpages.toString(), pagearray.toString()) as Int) else 0

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
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_OfferVirtualMemory(virtualaddress.toString(), size.toString(), priority) as Int).toUInt() else 0u

public actual fun OpenDedicatedMemoryPartition(partition: HANDLE, dedicatedmemorytypeid: ULong, desiredaccess: UInt, inherithandle: BOOL): HANDLE =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_OpenDedicatedMemoryPartition(partition.toString(), dedicatedmemorytypeid.toString(), desiredaccess.toInt(), inherithandle) as String).toLong() else 0L

public actual fun OpenFileMappingA(dwdesiredaccess: UInt, binherithandle: BOOL, lpname: PCSTR): HANDLE =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_OpenFileMappingA(dwdesiredaccess.toInt(), binherithandle, lpname.toString()) as String).toLong() else 0L

public actual fun OpenFileMappingFromApp(desiredaccess: UInt, inherithandle: BOOL, name: PCWSTR): HANDLE =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_OpenFileMappingFromApp(desiredaccess.toInt(), inherithandle, name.toString()) as String).toLong() else 0L

public actual fun OpenFileMappingW(dwdesiredaccess: UInt, binherithandle: BOOL, lpname: PCWSTR): HANDLE =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_OpenFileMappingW(dwdesiredaccess.toInt(), binherithandle, lpname.toString()) as String).toLong() else 0L

public actual fun PrefetchVirtualMemory(hprocess: HANDLE, numberofentries: ULong, virtualaddresses: Long, flags: UInt): BOOL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_PrefetchVirtualMemory(hprocess.toString(), numberofentries.toString(), virtualaddresses.toString(), flags.toInt()) as Int) else 0

public actual fun QueryMemoryResourceNotification(resourcenotificationhandle: HANDLE, resourcestate: Long): BOOL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_QueryMemoryResourceNotification(resourcenotificationhandle.toString(), resourcestate.toString()) as Int) else 0

public actual fun QueryPartitionInformation(partition: HANDLE, partitioninformationclass: WIN32_MEMORY_PARTITION_INFORMATION_CLASS, partitioninformation: Long, partitioninformationlength: UInt): BOOL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_QueryPartitionInformation(partition.toString(), partitioninformationclass, partitioninformation.toString(), partitioninformationlength.toInt()) as Int) else 0

public actual fun QueryVirtualMemoryInformation(process: HANDLE, virtualaddress: Long, memoryinformationclass: WIN32_MEMORY_INFORMATION_CLASS, memoryinformation: Long, memoryinformationsize: ULong, returnsize: Long): BOOL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_QueryVirtualMemoryInformation(process.toString(), virtualaddress.toString(), memoryinformationclass, memoryinformation.toString(), memoryinformationsize.toString(), returnsize.toString()) as Int) else 0

public actual fun ReclaimVirtualMemory(virtualaddress: Long, size: ULong): UInt =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_ReclaimVirtualMemory(virtualaddress.toString(), size.toString()) as Int).toUInt() else 0u

public actual fun RegisterBadMemoryNotification(callback: PBAD_MEMORY_CALLBACK_ROUTINE): Long =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_RegisterBadMemoryNotification(callback.toLong().toString()) as String).toLong() else 0L

public actual fun RemoveSecureMemoryCacheCallback(pfncallback: PSECURE_MEMORY_CACHE_CALLBACK): BOOL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_RemoveSecureMemoryCacheCallback(pfncallback.toLong().toString()) as Int) else 0

public actual fun ResetWriteWatch(lpbaseaddress: Long, dwregionsize: ULong): UInt =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_ResetWriteWatch(lpbaseaddress.toString(), dwregionsize.toString()) as Int).toUInt() else 0u

public actual fun RtlCompareMemory(source1: Long, source2: Long, length: ULong): ULong =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_RtlCompareMemory(source1.toString(), source2.toString(), length.toString()) as String).toULong() else 0uL

public actual fun RtlCrc32(buffer: Long, size: ULong, initialcrc: UInt): UInt =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_RtlCrc32(buffer.toString(), size.toString(), initialcrc.toInt()) as Int).toUInt() else 0u

public actual fun RtlCrc64(buffer: Long, size: ULong, initialcrc: ULong): ULong =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_RtlCrc64(buffer.toString(), size.toString(), initialcrc.toString()) as String).toULong() else 0uL

public actual fun RtlIsZeroMemory(buffer: Long, length: ULong): Boolean =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_RtlIsZeroMemory(buffer.toString(), length.toString()) as Boolean) else false

public actual fun SetProcessValidCallTargets(hprocess: HANDLE, virtualaddress: Long, regionsize: ULong, numberofoffsets: UInt, offsetinformation: Long): BOOL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_SetProcessValidCallTargets(hprocess.toString(), virtualaddress.toString(), regionsize.toString(), numberofoffsets.toInt(), offsetinformation.toString()) as Int) else 0

public actual fun SetProcessValidCallTargetsForMappedView(process: HANDLE, virtualaddress: Long, regionsize: ULong, numberofoffsets: UInt, offsetinformation: Long, section: HANDLE, expectedfileoffset: ULong): BOOL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_SetProcessValidCallTargetsForMappedView(process.toString(), virtualaddress.toString(), regionsize.toString(), numberofoffsets.toInt(), offsetinformation.toString(), section.toString(), expectedfileoffset.toString()) as Int) else 0

public actual fun SetProcessWorkingSetSizeEx(hprocess: HANDLE, dwminimumworkingsetsize: ULong, dwmaximumworkingsetsize: ULong, flags: SETPROCESSWORKINGSETSIZEEX_FLAGS): BOOL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_SetProcessWorkingSetSizeEx(hprocess.toString(), dwminimumworkingsetsize.toString(), dwmaximumworkingsetsize.toString(), flags.toInt()) as Int) else 0

public actual fun SetSystemFileCacheSize(minimumfilecachesize: ULong, maximumfilecachesize: ULong, flags: UInt): BOOL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_SetSystemFileCacheSize(minimumfilecachesize.toString(), maximumfilecachesize.toString(), flags.toInt()) as Int) else 0

public actual fun UnmapViewOfFile(lpbaseaddress: MEMORY_MAPPED_VIEW_ADDRESS): BOOL =
    0

public actual fun UnmapViewOfFile2(process: HANDLE, baseaddress: MEMORY_MAPPED_VIEW_ADDRESS, unmapflags: UNMAP_VIEW_OF_FILE_FLAGS): BOOL =
    0

public actual fun UnmapViewOfFileEx(baseaddress: MEMORY_MAPPED_VIEW_ADDRESS, unmapflags: UNMAP_VIEW_OF_FILE_FLAGS): BOOL =
    0

public actual fun UnregisterBadMemoryNotification(registrationhandle: Long): BOOL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_UnregisterBadMemoryNotification(registrationhandle.toString()) as Int) else 0

public actual fun VirtualAlloc(lpaddress: Long, dwsize: ULong, flallocationtype: VIRTUAL_ALLOCATION_TYPE, flprotect: PAGE_PROTECTION_FLAGS): Long =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_VirtualAlloc(lpaddress.toString(), dwsize.toString(), flallocationtype.toInt(), flprotect.toInt()) as String).toLong() else 0L

public actual fun VirtualAlloc2(process: HANDLE, baseaddress: Long, size: ULong, allocationtype: VIRTUAL_ALLOCATION_TYPE, pageprotection: UInt, extendedparameters: Long, parametercount: UInt): Long =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_VirtualAlloc2(process.toString(), baseaddress.toString(), size.toString(), allocationtype.toInt(), pageprotection.toInt(), extendedparameters.toString(), parametercount.toInt()) as String).toLong() else 0L

public actual fun VirtualAlloc2FromApp(process: HANDLE, baseaddress: Long, size: ULong, allocationtype: VIRTUAL_ALLOCATION_TYPE, pageprotection: UInt, extendedparameters: Long, parametercount: UInt): Long =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_VirtualAlloc2FromApp(process.toString(), baseaddress.toString(), size.toString(), allocationtype.toInt(), pageprotection.toInt(), extendedparameters.toString(), parametercount.toInt()) as String).toLong() else 0L

public actual fun VirtualAllocEx(hprocess: HANDLE, lpaddress: Long, dwsize: ULong, flallocationtype: VIRTUAL_ALLOCATION_TYPE, flprotect: PAGE_PROTECTION_FLAGS): Long =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_VirtualAllocEx(hprocess.toString(), lpaddress.toString(), dwsize.toString(), flallocationtype.toInt(), flprotect.toInt()) as String).toLong() else 0L

public actual fun VirtualAllocExNuma(hprocess: HANDLE, lpaddress: Long, dwsize: ULong, flallocationtype: VIRTUAL_ALLOCATION_TYPE, flprotect: UInt, nndpreferred: UInt): Long =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_VirtualAllocExNuma(hprocess.toString(), lpaddress.toString(), dwsize.toString(), flallocationtype.toInt(), flprotect.toInt(), nndpreferred.toInt()) as String).toLong() else 0L

public actual fun VirtualAllocFromApp(baseaddress: Long, size: ULong, allocationtype: VIRTUAL_ALLOCATION_TYPE, protection: UInt): Long =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_VirtualAllocFromApp(baseaddress.toString(), size.toString(), allocationtype.toInt(), protection.toInt()) as String).toLong() else 0L

public actual fun VirtualFree(lpaddress: Long, dwsize: ULong, dwfreetype: VIRTUAL_FREE_TYPE): BOOL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_VirtualFree(lpaddress.toString(), dwsize.toString(), dwfreetype.toInt()) as Int) else 0

public actual fun VirtualFreeEx(hprocess: HANDLE, lpaddress: Long, dwsize: ULong, dwfreetype: VIRTUAL_FREE_TYPE): BOOL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_VirtualFreeEx(hprocess.toString(), lpaddress.toString(), dwsize.toString(), dwfreetype.toInt()) as Int) else 0

public actual fun VirtualLock(lpaddress: Long, dwsize: ULong): BOOL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_VirtualLock(lpaddress.toString(), dwsize.toString()) as Int) else 0

public actual fun VirtualProtect(lpaddress: Long, dwsize: ULong, flnewprotect: PAGE_PROTECTION_FLAGS, lpfloldprotect: Long): BOOL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_VirtualProtect(lpaddress.toString(), dwsize.toString(), flnewprotect.toInt(), lpfloldprotect.toString()) as Int) else 0

public actual fun VirtualProtectEx(hprocess: HANDLE, lpaddress: Long, dwsize: ULong, flnewprotect: PAGE_PROTECTION_FLAGS, lpfloldprotect: Long): BOOL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_VirtualProtectEx(hprocess.toString(), lpaddress.toString(), dwsize.toString(), flnewprotect.toInt(), lpfloldprotect.toString()) as Int) else 0

public actual fun VirtualProtectFromApp(address: Long, size: ULong, newprotection: UInt, oldprotection: Long): BOOL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_VirtualProtectFromApp(address.toString(), size.toString(), newprotection.toInt(), oldprotection.toString()) as Int) else 0

public actual fun VirtualQuery(lpaddress: Long, lpbuffer: Long, dwlength: ULong): ULong =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_VirtualQuery(lpaddress.toString(), lpbuffer.toString(), dwlength.toString()) as String).toULong() else 0uL

public actual fun VirtualQueryEx(hprocess: HANDLE, lpaddress: Long, lpbuffer: Long, dwlength: ULong): ULong =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_VirtualQueryEx(hprocess.toString(), lpaddress.toString(), lpbuffer.toString(), dwlength.toString()) as String).toULong() else 0uL

public actual fun VirtualUnlock(lpaddress: Long, dwsize: ULong): BOOL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_VirtualUnlock(lpaddress.toString(), dwsize.toString()) as Int) else 0

public actual fun VirtualUnlockEx(process: HANDLE, address: Long, size: ULong): BOOL =
    if (_windowsWin32SystemMemoryNapiAddon != null) (_windowsWin32SystemMemoryNapiAddon.windowssys_windows_win32_system_memory_VirtualUnlockEx(process.toString(), address.toString(), size.toString()) as Int) else 0
