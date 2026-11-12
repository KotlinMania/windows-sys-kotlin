@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val windowsWin32SystemMemoryNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun addSecureMemoryCacheCallback(pfncallback: PsecureMemoryCacheCallback): Bool =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryAddSecureMemoryCacheCallback(0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allocateUserPhysicalPages(hprocess: Handle, numberofpages: MutPtr, pagearray: MutPtr): Bool =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryAllocateUserPhysicalPages(hprocess.rawAddress.toString(), numberofpages.rawAddress.toString(), pagearray.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allocateUserPhysicalPages2(objecthandle: Handle, numberofpages: MutPtr, pagearray: MutPtr, extendedparameters: MutPtr, extendedparametercount: UInt): Bool =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryAllocateUserPhysicalPages2(objecthandle.rawAddress.toString(), numberofpages.rawAddress.toString(), pagearray.rawAddress.toString(), extendedparameters.rawAddress.toString(), extendedparametercount.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allocateUserPhysicalPagesNuma(hprocess: Handle, numberofpages: MutPtr, pagearray: MutPtr, nndpreferred: UInt): Bool =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryAllocateUserPhysicalPagesNuma(hprocess.rawAddress.toString(), numberofpages.rawAddress.toString(), pagearray.rawAddress.toString(), nndpreferred.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFileMapping2(file: Handle, securityattributes: ConstPtr, desiredaccess: UInt, pageprotection: PageProtectionFlags, allocationattributes: UInt, maximumsize: ULong, name: Pcwstr, extendedparameters: MutPtr, parametercount: UInt): Handle =
    if (windowsWin32SystemMemoryNapiAddon != null) MutPtr((windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryCreateFileMapping2(file.rawAddress.toString(), securityattributes.rawAddress.toString(), desiredaccess.toInt(), pageprotection.toInt(), allocationattributes.toInt(), maximumsize.toString(), name.rawAddress.toString(), extendedparameters.rawAddress.toString(), parametercount.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFileMappingA(hfile: Handle, lpfilemappingattributes: ConstPtr, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcstr): Handle =
    if (windowsWin32SystemMemoryNapiAddon != null) MutPtr((windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryCreateFileMappingA(hfile.rawAddress.toString(), lpfilemappingattributes.rawAddress.toString(), flprotect.toInt(), dwmaximumsizehigh.toInt(), dwmaximumsizelow.toInt(), lpname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFileMappingFromApp(hfile: Handle, securityattributes: ConstPtr, pageprotection: PageProtectionFlags, maximumsize: ULong, name: Pcwstr): Handle =
    if (windowsWin32SystemMemoryNapiAddon != null) MutPtr((windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryCreateFileMappingFromApp(hfile.rawAddress.toString(), securityattributes.rawAddress.toString(), pageprotection.toInt(), maximumsize.toString(), name.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFileMappingNumaA(hfile: Handle, lpfilemappingattributes: ConstPtr, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcstr, nndpreferred: UInt): Handle =
    if (windowsWin32SystemMemoryNapiAddon != null) MutPtr((windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryCreateFileMappingNumaA(hfile.rawAddress.toString(), lpfilemappingattributes.rawAddress.toString(), flprotect.toInt(), dwmaximumsizehigh.toInt(), dwmaximumsizelow.toInt(), lpname.rawAddress.toString(), nndpreferred.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFileMappingNumaW(hfile: Handle, lpfilemappingattributes: ConstPtr, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcwstr, nndpreferred: UInt): Handle =
    if (windowsWin32SystemMemoryNapiAddon != null) MutPtr((windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryCreateFileMappingNumaW(hfile.rawAddress.toString(), lpfilemappingattributes.rawAddress.toString(), flprotect.toInt(), dwmaximumsizehigh.toInt(), dwmaximumsizelow.toInt(), lpname.rawAddress.toString(), nndpreferred.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFileMappingW(hfile: Handle, lpfilemappingattributes: ConstPtr, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcwstr): Handle =
    if (windowsWin32SystemMemoryNapiAddon != null) MutPtr((windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryCreateFileMappingW(hfile.rawAddress.toString(), lpfilemappingattributes.rawAddress.toString(), flprotect.toInt(), dwmaximumsizehigh.toInt(), dwmaximumsizelow.toInt(), lpname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createMemoryResourceNotification(notificationtype: MemoryResourceNotificationType): Handle =
    if (windowsWin32SystemMemoryNapiAddon != null) MutPtr((windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryCreateMemoryResourceNotification(notificationtype) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun discardVirtualMemory(virtualaddress: MutPtr, size: ULong): UInt =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryDiscardVirtualMemory(virtualaddress.rawAddress.toString(), size.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flushViewOfFile(lpbaseaddress: ConstPtr, dwnumberofbytestoflush: ULong): Bool =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryFlushViewOfFile(lpbaseaddress.rawAddress.toString(), dwnumberofbytestoflush.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeUserPhysicalPages(hprocess: Handle, numberofpages: MutPtr, pagearray: ConstPtr): Bool =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryFreeUserPhysicalPages(hprocess.rawAddress.toString(), numberofpages.rawAddress.toString(), pagearray.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLargePageMinimum(): ULong =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryGetLargePageMinimum() as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMemoryErrorHandlingCapabilities(capabilities: MutPtr): Bool =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryGetMemoryErrorHandlingCapabilities(capabilities.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessHeap(): Handle =
    if (windowsWin32SystemMemoryNapiAddon != null) MutPtr((windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryGetProcessHeap() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessHeaps(numberofheaps: UInt, processheaps: MutPtr): UInt =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryGetProcessHeaps(numberofheaps.toInt(), processheaps.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessWorkingSetSizeEx(hprocess: Handle, lpminimumworkingsetsize: MutPtr, lpmaximumworkingsetsize: MutPtr, flags: MutPtr): Bool =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryGetProcessWorkingSetSizeEx(hprocess.rawAddress.toString(), lpminimumworkingsetsize.rawAddress.toString(), lpmaximumworkingsetsize.rawAddress.toString(), flags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemFileCacheSize(lpminimumfilecachesize: MutPtr, lpmaximumfilecachesize: MutPtr, lpflags: MutPtr): Bool =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryGetSystemFileCacheSize(lpminimumfilecachesize.rawAddress.toString(), lpmaximumfilecachesize.rawAddress.toString(), lpflags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWriteWatch(dwflags: UInt, lpbaseaddress: ConstPtr, dwregionsize: ULong, lpaddresses: MutPtr, lpdwcount: MutPtr, lpdwgranularity: MutPtr): UInt =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryGetWriteWatch(dwflags.toInt(), lpbaseaddress.rawAddress.toString(), dwregionsize.toString(), lpaddresses.rawAddress.toString(), lpdwcount.rawAddress.toString(), lpdwgranularity.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalAlloc(uflags: GlobalAllocFlags, dwbytes: ULong): Hglobal =
    if (windowsWin32SystemMemoryNapiAddon != null) MutPtr((windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryGlobalAlloc(uflags.toInt(), dwbytes.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalFlags(hmem: Hglobal): UInt =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryGlobalFlags(hmem.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalHandle(pmem: ConstPtr): Hglobal =
    if (windowsWin32SystemMemoryNapiAddon != null) MutPtr((windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryGlobalHandle(pmem.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalLock(hmem: Hglobal): MutPtr =
    if (windowsWin32SystemMemoryNapiAddon != null) MutPtr((windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryGlobalLock(hmem.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalReAlloc(hmem: Hglobal, dwbytes: ULong, uflags: UInt): Hglobal =
    if (windowsWin32SystemMemoryNapiAddon != null) MutPtr((windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryGlobalReAlloc(hmem.rawAddress.toString(), dwbytes.toString(), uflags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalSize(hmem: Hglobal): ULong =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryGlobalSize(hmem.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalUnlock(hmem: Hglobal): Bool =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryGlobalUnlock(hmem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heapAlloc(hheap: Handle, dwflags: HeapFlags, dwbytes: ULong): MutPtr =
    if (windowsWin32SystemMemoryNapiAddon != null) MutPtr((windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryHeapAlloc(hheap.rawAddress.toString(), dwflags.toInt(), dwbytes.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heapCompact(hheap: Handle, dwflags: HeapFlags): ULong =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryHeapCompact(hheap.rawAddress.toString(), dwflags.toInt()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heapCreate(floptions: HeapFlags, dwinitialsize: ULong, dwmaximumsize: ULong): Handle =
    if (windowsWin32SystemMemoryNapiAddon != null) MutPtr((windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryHeapCreate(floptions.toInt(), dwinitialsize.toString(), dwmaximumsize.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heapDestroy(hheap: Handle): Bool =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryHeapDestroy(hheap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heapFree(hheap: Handle, dwflags: HeapFlags, lpmem: ConstPtr): Bool =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryHeapFree(hheap.rawAddress.toString(), dwflags.toInt(), lpmem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heapLock(hheap: Handle): Bool =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryHeapLock(hheap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heapQueryInformation(heaphandle: Handle, heapinformationclass: HeapInformationClass, heapinformation: MutPtr, heapinformationlength: ULong, returnlength: MutPtr): Bool =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryHeapQueryInformation(heaphandle.rawAddress.toString(), heapinformationclass, heapinformation.rawAddress.toString(), heapinformationlength.toString(), returnlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heapReAlloc(hheap: Handle, dwflags: HeapFlags, lpmem: ConstPtr, dwbytes: ULong): MutPtr =
    if (windowsWin32SystemMemoryNapiAddon != null) MutPtr((windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryHeapReAlloc(hheap.rawAddress.toString(), dwflags.toInt(), lpmem.rawAddress.toString(), dwbytes.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heapSetInformation(heaphandle: Handle, heapinformationclass: HeapInformationClass, heapinformation: ConstPtr, heapinformationlength: ULong): Bool =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryHeapSetInformation(heaphandle.rawAddress.toString(), heapinformationclass, heapinformation.rawAddress.toString(), heapinformationlength.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heapSize(hheap: Handle, dwflags: HeapFlags, lpmem: ConstPtr): ULong =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryHeapSize(hheap.rawAddress.toString(), dwflags.toInt(), lpmem.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heapSummary(hheap: Handle, dwflags: UInt, lpsummary: MutPtr): Bool =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryHeapSummary(hheap.rawAddress.toString(), dwflags.toInt(), lpsummary.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heapUnlock(hheap: Handle): Bool =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryHeapUnlock(hheap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heapValidate(hheap: Handle, dwflags: HeapFlags, lpmem: ConstPtr): Bool =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryHeapValidate(hheap.rawAddress.toString(), dwflags.toInt(), lpmem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heapWalk(hheap: Handle, lpentry: MutPtr): Bool =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryHeapWalk(hheap.rawAddress.toString(), lpentry.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isBadCodePtr(lpfn: Farproc): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isBadReadPtr(lp: ConstPtr, ucb: ULong): Bool =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryIsBadReadPtr(lp.rawAddress.toString(), ucb.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isBadStringPtrA(lpsz: Pcstr, ucchmax: ULong): Bool =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryIsBadStringPtrA(lpsz.rawAddress.toString(), ucchmax.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isBadStringPtrW(lpsz: Pcwstr, ucchmax: ULong): Bool =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryIsBadStringPtrW(lpsz.rawAddress.toString(), ucchmax.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isBadWritePtr(lp: ConstPtr, ucb: ULong): Bool =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryIsBadWritePtr(lp.rawAddress.toString(), ucb.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localAlloc(uflags: LocalAllocFlags, ubytes: ULong): Hlocal =
    if (windowsWin32SystemMemoryNapiAddon != null) MutPtr((windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryLocalAlloc(uflags.toInt(), ubytes.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localFlags(hmem: Hlocal): UInt =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryLocalFlags(hmem.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localHandle(pmem: ConstPtr): Hlocal =
    if (windowsWin32SystemMemoryNapiAddon != null) MutPtr((windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryLocalHandle(pmem.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localLock(hmem: Hlocal): MutPtr =
    if (windowsWin32SystemMemoryNapiAddon != null) MutPtr((windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryLocalLock(hmem.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localReAlloc(hmem: Hlocal, ubytes: ULong, uflags: UInt): Hlocal =
    if (windowsWin32SystemMemoryNapiAddon != null) MutPtr((windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryLocalReAlloc(hmem.rawAddress.toString(), ubytes.toString(), uflags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localSize(hmem: Hlocal): ULong =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryLocalSize(hmem.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localUnlock(hmem: Hlocal): Bool =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryLocalUnlock(hmem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapUserPhysicalPages(virtualaddress: ConstPtr, numberofpages: ULong, pagearray: ConstPtr): Bool =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryMapUserPhysicalPages(virtualaddress.rawAddress.toString(), numberofpages.toString(), pagearray.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapUserPhysicalPagesScatter(virtualaddresses: ConstPtr, numberofpages: ULong, pagearray: ConstPtr): Bool =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryMapUserPhysicalPagesScatter(virtualaddresses.rawAddress.toString(), numberofpages.toString(), pagearray.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapViewOfFile(hfilemappingobject: Handle, dwdesiredaccess: FileMap, dwfileoffsethigh: UInt, dwfileoffsetlow: UInt, dwnumberofbytestomap: ULong): MemoryMappedViewAddress =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapViewOfFile3(filemapping: Handle, process: Handle, baseaddress: ConstPtr, offset: ULong, viewsize: ULong, allocationtype: VirtualAllocationType, pageprotection: UInt, extendedparameters: MutPtr, parametercount: UInt): MemoryMappedViewAddress =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapViewOfFile3FromApp(filemapping: Handle, process: Handle, baseaddress: ConstPtr, offset: ULong, viewsize: ULong, allocationtype: VirtualAllocationType, pageprotection: UInt, extendedparameters: MutPtr, parametercount: UInt): MemoryMappedViewAddress =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapViewOfFileEx(hfilemappingobject: Handle, dwdesiredaccess: FileMap, dwfileoffsethigh: UInt, dwfileoffsetlow: UInt, dwnumberofbytestomap: ULong, lpbaseaddress: ConstPtr): MemoryMappedViewAddress =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapViewOfFileExNuma(hfilemappingobject: Handle, dwdesiredaccess: FileMap, dwfileoffsethigh: UInt, dwfileoffsetlow: UInt, dwnumberofbytestomap: ULong, lpbaseaddress: ConstPtr, nndpreferred: UInt): MemoryMappedViewAddress =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapViewOfFileFromApp(hfilemappingobject: Handle, desiredaccess: FileMap, fileoffset: ULong, numberofbytestomap: ULong): MemoryMappedViewAddress =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapViewOfFileNuma2(filemappinghandle: Handle, processhandle: Handle, offset: ULong, baseaddress: ConstPtr, viewsize: ULong, allocationtype: UInt, pageprotection: UInt, preferrednode: UInt): MemoryMappedViewAddress =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun offerVirtualMemory(virtualaddress: MutPtr, size: ULong, priority: OfferPriority): UInt =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryOfferVirtualMemory(virtualaddress.rawAddress.toString(), size.toString(), priority) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openDedicatedMemoryPartition(partition: Handle, dedicatedmemorytypeid: ULong, desiredaccess: UInt, inherithandle: Bool): Handle =
    if (windowsWin32SystemMemoryNapiAddon != null) MutPtr((windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryOpenDedicatedMemoryPartition(partition.rawAddress.toString(), dedicatedmemorytypeid.toString(), desiredaccess.toInt(), inherithandle) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openFileMappingA(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcstr): Handle =
    if (windowsWin32SystemMemoryNapiAddon != null) MutPtr((windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryOpenFileMappingA(dwdesiredaccess.toInt(), binherithandle, lpname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openFileMappingFromApp(desiredaccess: UInt, inherithandle: Bool, name: Pcwstr): Handle =
    if (windowsWin32SystemMemoryNapiAddon != null) MutPtr((windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryOpenFileMappingFromApp(desiredaccess.toInt(), inherithandle, name.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openFileMappingW(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcwstr): Handle =
    if (windowsWin32SystemMemoryNapiAddon != null) MutPtr((windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryOpenFileMappingW(dwdesiredaccess.toInt(), binherithandle, lpname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prefetchVirtualMemory(hprocess: Handle, numberofentries: ULong, virtualaddresses: ConstPtr, flags: UInt): Bool =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryPrefetchVirtualMemory(hprocess.rawAddress.toString(), numberofentries.toString(), virtualaddresses.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryMemoryResourceNotification(resourcenotificationhandle: Handle, resourcestate: MutPtr): Bool =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryQueryMemoryResourceNotification(resourcenotificationhandle.rawAddress.toString(), resourcestate.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryPartitionInformation(partition: Handle, partitioninformationclass: Win32MemoryPartitionInformationClass, partitioninformation: MutPtr, partitioninformationlength: UInt): Bool =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryQueryPartitionInformation(partition.rawAddress.toString(), partitioninformationclass, partitioninformation.rawAddress.toString(), partitioninformationlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryVirtualMemoryInformation(process: Handle, virtualaddress: ConstPtr, memoryinformationclass: Win32MemoryInformationClass, memoryinformation: MutPtr, memoryinformationsize: ULong, returnsize: MutPtr): Bool =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryQueryVirtualMemoryInformation(process.rawAddress.toString(), virtualaddress.rawAddress.toString(), memoryinformationclass, memoryinformation.rawAddress.toString(), memoryinformationsize.toString(), returnsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reclaimVirtualMemory(virtualaddress: ConstPtr, size: ULong): UInt =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryReclaimVirtualMemory(virtualaddress.rawAddress.toString(), size.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerBadMemoryNotification(callback: PbadMemoryCallbackRoutine): MutPtr =
    if (windowsWin32SystemMemoryNapiAddon != null) MutPtr((windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryRegisterBadMemoryNotification(0L.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeSecureMemoryCacheCallback(pfncallback: PsecureMemoryCacheCallback): Bool =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryRemoveSecureMemoryCacheCallback(0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resetWriteWatch(lpbaseaddress: ConstPtr, dwregionsize: ULong): UInt =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryResetWriteWatch(lpbaseaddress.rawAddress.toString(), dwregionsize.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCompareMemory(source1: ConstPtr, source2: ConstPtr, length: ULong): ULong =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryRtlCompareMemory(source1.rawAddress.toString(), source2.rawAddress.toString(), length.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCrc32(buffer: ConstPtr, size: ULong, initialcrc: UInt): UInt =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryRtlCrc32(buffer.rawAddress.toString(), size.toString(), initialcrc.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCrc64(buffer: ConstPtr, size: ULong, initialcrc: ULong): ULong =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryRtlCrc64(buffer.rawAddress.toString(), size.toString(), initialcrc.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsZeroMemory(buffer: ConstPtr, length: ULong): Boolean =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryRtlIsZeroMemory(buffer.rawAddress.toString(), length.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessValidCallTargets(hprocess: Handle, virtualaddress: ConstPtr, regionsize: ULong, numberofoffsets: UInt, offsetinformation: MutPtr): Bool =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemorySetProcessValidCallTargets(hprocess.rawAddress.toString(), virtualaddress.rawAddress.toString(), regionsize.toString(), numberofoffsets.toInt(), offsetinformation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessValidCallTargetsForMappedView(process: Handle, virtualaddress: ConstPtr, regionsize: ULong, numberofoffsets: UInt, offsetinformation: MutPtr, section: Handle, expectedfileoffset: ULong): Bool =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemorySetProcessValidCallTargetsForMappedView(process.rawAddress.toString(), virtualaddress.rawAddress.toString(), regionsize.toString(), numberofoffsets.toInt(), offsetinformation.rawAddress.toString(), section.rawAddress.toString(), expectedfileoffset.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessWorkingSetSizeEx(hprocess: Handle, dwminimumworkingsetsize: ULong, dwmaximumworkingsetsize: ULong, flags: SetprocessworkingsetsizeexFlags): Bool =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemorySetProcessWorkingSetSizeEx(hprocess.rawAddress.toString(), dwminimumworkingsetsize.toString(), dwmaximumworkingsetsize.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSystemFileCacheSize(minimumfilecachesize: ULong, maximumfilecachesize: ULong, flags: UInt): Bool =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemorySetSystemFileCacheSize(minimumfilecachesize.toString(), maximumfilecachesize.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unmapViewOfFile(lpbaseaddress: MemoryMappedViewAddress): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unmapViewOfFile2(process: Handle, baseaddress: MemoryMappedViewAddress, unmapflags: UnmapViewOfFileFlags): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unmapViewOfFileEx(baseaddress: MemoryMappedViewAddress, unmapflags: UnmapViewOfFileFlags): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterBadMemoryNotification(registrationhandle: ConstPtr): Bool =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryUnregisterBadMemoryNotification(registrationhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualAlloc(lpaddress: ConstPtr, dwsize: ULong, flallocationtype: VirtualAllocationType, flprotect: PageProtectionFlags): MutPtr =
    if (windowsWin32SystemMemoryNapiAddon != null) MutPtr((windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryVirtualAlloc(lpaddress.rawAddress.toString(), dwsize.toString(), flallocationtype.toInt(), flprotect.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualAlloc2(process: Handle, baseaddress: ConstPtr, size: ULong, allocationtype: VirtualAllocationType, pageprotection: UInt, extendedparameters: MutPtr, parametercount: UInt): MutPtr =
    if (windowsWin32SystemMemoryNapiAddon != null) MutPtr((windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryVirtualAlloc2(process.rawAddress.toString(), baseaddress.rawAddress.toString(), size.toString(), allocationtype.toInt(), pageprotection.toInt(), extendedparameters.rawAddress.toString(), parametercount.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualAlloc2FromApp(process: Handle, baseaddress: ConstPtr, size: ULong, allocationtype: VirtualAllocationType, pageprotection: UInt, extendedparameters: MutPtr, parametercount: UInt): MutPtr =
    if (windowsWin32SystemMemoryNapiAddon != null) MutPtr((windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryVirtualAlloc2FromApp(process.rawAddress.toString(), baseaddress.rawAddress.toString(), size.toString(), allocationtype.toInt(), pageprotection.toInt(), extendedparameters.rawAddress.toString(), parametercount.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualAllocEx(hprocess: Handle, lpaddress: ConstPtr, dwsize: ULong, flallocationtype: VirtualAllocationType, flprotect: PageProtectionFlags): MutPtr =
    if (windowsWin32SystemMemoryNapiAddon != null) MutPtr((windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryVirtualAllocEx(hprocess.rawAddress.toString(), lpaddress.rawAddress.toString(), dwsize.toString(), flallocationtype.toInt(), flprotect.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualAllocExNuma(hprocess: Handle, lpaddress: ConstPtr, dwsize: ULong, flallocationtype: VirtualAllocationType, flprotect: UInt, nndpreferred: UInt): MutPtr =
    if (windowsWin32SystemMemoryNapiAddon != null) MutPtr((windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryVirtualAllocExNuma(hprocess.rawAddress.toString(), lpaddress.rawAddress.toString(), dwsize.toString(), flallocationtype.toInt(), flprotect.toInt(), nndpreferred.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualAllocFromApp(baseaddress: ConstPtr, size: ULong, allocationtype: VirtualAllocationType, protection: UInt): MutPtr =
    if (windowsWin32SystemMemoryNapiAddon != null) MutPtr((windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryVirtualAllocFromApp(baseaddress.rawAddress.toString(), size.toString(), allocationtype.toInt(), protection.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualFree(lpaddress: MutPtr, dwsize: ULong, dwfreetype: VirtualFreeType): Bool =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryVirtualFree(lpaddress.rawAddress.toString(), dwsize.toString(), dwfreetype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualFreeEx(hprocess: Handle, lpaddress: MutPtr, dwsize: ULong, dwfreetype: VirtualFreeType): Bool =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryVirtualFreeEx(hprocess.rawAddress.toString(), lpaddress.rawAddress.toString(), dwsize.toString(), dwfreetype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualLock(lpaddress: ConstPtr, dwsize: ULong): Bool =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryVirtualLock(lpaddress.rawAddress.toString(), dwsize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualProtect(lpaddress: ConstPtr, dwsize: ULong, flnewprotect: PageProtectionFlags, lpfloldprotect: MutPtr): Bool =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryVirtualProtect(lpaddress.rawAddress.toString(), dwsize.toString(), flnewprotect.toInt(), lpfloldprotect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualProtectEx(hprocess: Handle, lpaddress: ConstPtr, dwsize: ULong, flnewprotect: PageProtectionFlags, lpfloldprotect: MutPtr): Bool =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryVirtualProtectEx(hprocess.rawAddress.toString(), lpaddress.rawAddress.toString(), dwsize.toString(), flnewprotect.toInt(), lpfloldprotect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualProtectFromApp(address: ConstPtr, size: ULong, newprotection: UInt, oldprotection: MutPtr): Bool =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryVirtualProtectFromApp(address.rawAddress.toString(), size.toString(), newprotection.toInt(), oldprotection.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualQuery(lpaddress: ConstPtr, lpbuffer: MutPtr, dwlength: ULong): ULong =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryVirtualQuery(lpaddress.rawAddress.toString(), lpbuffer.rawAddress.toString(), dwlength.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualQueryEx(hprocess: Handle, lpaddress: ConstPtr, lpbuffer: MutPtr, dwlength: ULong): ULong =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryVirtualQueryEx(hprocess.rawAddress.toString(), lpaddress.rawAddress.toString(), lpbuffer.rawAddress.toString(), dwlength.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualUnlock(lpaddress: ConstPtr, dwsize: ULong): Bool =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryVirtualUnlock(lpaddress.rawAddress.toString(), dwsize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualUnlockEx(process: Handle, address: ConstPtr, size: ULong): Bool =
    if (windowsWin32SystemMemoryNapiAddon != null) (windowsWin32SystemMemoryNapiAddon.windowssysWindowsWin32SystemMemoryVirtualUnlockEx(process.rawAddress.toString(), address.rawAddress.toString(), size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
