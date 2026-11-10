@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.memory

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Farproc
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hglobal
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hlocal

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32SystemMemoryNapiAddon(): Boolean

private val _windowsWin32SystemMemoryNapiAvailable: Boolean = _initWindowsWin32SystemMemoryNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_addSecureMemoryCacheCallback(p0)")
private external fun _wasm_windowssys_windows_win32_system_memory_addSecureMemoryCacheCallback(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_allocateUserPhysicalPages(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_memory_allocateUserPhysicalPages(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_allocateUserPhysicalPages2(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_memory_allocateUserPhysicalPages2(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_allocateUserPhysicalPagesNuma(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_memory_allocateUserPhysicalPagesNuma(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_createFileMapping2(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_system_memory_createFileMapping2(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String, p7: String, p8: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_createFileMappingA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_memory_createFileMappingA(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_createFileMappingFromApp(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_memory_createFileMappingFromApp(p0: String, p1: String, p2: Int, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_createFileMappingNumaA(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_memory_createFileMappingNumaA(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_createFileMappingNumaW(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_memory_createFileMappingNumaW(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_createFileMappingW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_memory_createFileMappingW(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_createMemoryResourceNotification(p0)")
private external fun _wasm_windowssys_windows_win32_system_memory_createMemoryResourceNotification(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_discardVirtualMemory(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_memory_discardVirtualMemory(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_flushViewOfFile(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_memory_flushViewOfFile(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_freeUserPhysicalPages(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_memory_freeUserPhysicalPages(p0: String, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_getLargePageMinimum()")
private external fun _wasm_windowssys_windows_win32_system_memory_getLargePageMinimum(): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_getMemoryErrorHandlingCapabilities(p0)")
private external fun _wasm_windowssys_windows_win32_system_memory_getMemoryErrorHandlingCapabilities(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_getProcessHeap()")
private external fun _wasm_windowssys_windows_win32_system_memory_getProcessHeap(): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_getProcessHeaps(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_memory_getProcessHeaps(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_getProcessWorkingSetSizeEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_memory_getProcessWorkingSetSizeEx(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_getSystemFileCacheSize(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_memory_getSystemFileCacheSize(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_getWriteWatch(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_memory_getWriteWatch(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_globalAlloc(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_memory_globalAlloc(p0: Int, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_globalFlags(p0)")
private external fun _wasm_windowssys_windows_win32_system_memory_globalFlags(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_globalHandle(p0)")
private external fun _wasm_windowssys_windows_win32_system_memory_globalHandle(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_globalLock(p0)")
private external fun _wasm_windowssys_windows_win32_system_memory_globalLock(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_globalReAlloc(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_memory_globalReAlloc(p0: String, p1: String, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_globalSize(p0)")
private external fun _wasm_windowssys_windows_win32_system_memory_globalSize(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_globalUnlock(p0)")
private external fun _wasm_windowssys_windows_win32_system_memory_globalUnlock(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_heapAlloc(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_memory_heapAlloc(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_heapCompact(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_memory_heapCompact(p0: String, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_heapCreate(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_memory_heapCreate(p0: Int, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_heapDestroy(p0)")
private external fun _wasm_windowssys_windows_win32_system_memory_heapDestroy(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_heapFree(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_memory_heapFree(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_heapLock(p0)")
private external fun _wasm_windowssys_windows_win32_system_memory_heapLock(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_heapQueryInformation(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_memory_heapQueryInformation(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_heapReAlloc(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_memory_heapReAlloc(p0: String, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_heapSetInformation(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_memory_heapSetInformation(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_heapSize(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_memory_heapSize(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_heapSummary(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_memory_heapSummary(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_heapUnlock(p0)")
private external fun _wasm_windowssys_windows_win32_system_memory_heapUnlock(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_heapValidate(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_memory_heapValidate(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_heapWalk(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_memory_heapWalk(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_isBadReadPtr(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_memory_isBadReadPtr(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_isBadStringPtrA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_memory_isBadStringPtrA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_isBadStringPtrW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_memory_isBadStringPtrW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_isBadWritePtr(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_memory_isBadWritePtr(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_localAlloc(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_memory_localAlloc(p0: Int, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_localFlags(p0)")
private external fun _wasm_windowssys_windows_win32_system_memory_localFlags(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_localHandle(p0)")
private external fun _wasm_windowssys_windows_win32_system_memory_localHandle(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_localLock(p0)")
private external fun _wasm_windowssys_windows_win32_system_memory_localLock(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_localReAlloc(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_memory_localReAlloc(p0: String, p1: String, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_localSize(p0)")
private external fun _wasm_windowssys_windows_win32_system_memory_localSize(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_localUnlock(p0)")
private external fun _wasm_windowssys_windows_win32_system_memory_localUnlock(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_mapUserPhysicalPages(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_memory_mapUserPhysicalPages(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_mapUserPhysicalPagesScatter(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_memory_mapUserPhysicalPagesScatter(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_offerVirtualMemory(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_memory_offerVirtualMemory(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_openDedicatedMemoryPartition(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_memory_openDedicatedMemoryPartition(p0: String, p1: String, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_openFileMappingA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_memory_openFileMappingA(p0: Int, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_openFileMappingFromApp(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_memory_openFileMappingFromApp(p0: Int, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_openFileMappingW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_memory_openFileMappingW(p0: Int, p1: Int, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_prefetchVirtualMemory(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_memory_prefetchVirtualMemory(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_queryMemoryResourceNotification(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_memory_queryMemoryResourceNotification(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_queryPartitionInformation(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_memory_queryPartitionInformation(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_queryVirtualMemoryInformation(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_memory_queryVirtualMemoryInformation(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_reclaimVirtualMemory(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_memory_reclaimVirtualMemory(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_registerBadMemoryNotification(p0)")
private external fun _wasm_windowssys_windows_win32_system_memory_registerBadMemoryNotification(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_removeSecureMemoryCacheCallback(p0)")
private external fun _wasm_windowssys_windows_win32_system_memory_removeSecureMemoryCacheCallback(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_resetWriteWatch(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_memory_resetWriteWatch(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_rtlCompareMemory(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_memory_rtlCompareMemory(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_rtlCrc32(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_memory_rtlCrc32(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_rtlCrc64(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_memory_rtlCrc64(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_rtlIsZeroMemory(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_memory_rtlIsZeroMemory(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_setProcessValidCallTargets(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_memory_setProcessValidCallTargets(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_setProcessValidCallTargetsForMappedView(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_memory_setProcessValidCallTargetsForMappedView(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_setProcessWorkingSetSizeEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_memory_setProcessWorkingSetSizeEx(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_setSystemFileCacheSize(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_memory_setSystemFileCacheSize(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_unregisterBadMemoryNotification(p0)")
private external fun _wasm_windowssys_windows_win32_system_memory_unregisterBadMemoryNotification(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_virtualAlloc(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_memory_virtualAlloc(p0: String, p1: String, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_virtualAlloc2(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_memory_virtualAlloc2(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_virtualAlloc2FromApp(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_memory_virtualAlloc2FromApp(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_virtualAllocEx(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_memory_virtualAllocEx(p0: String, p1: String, p2: String, p3: Int, p4: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_virtualAllocExNuma(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_memory_virtualAllocExNuma(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_virtualAllocFromApp(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_memory_virtualAllocFromApp(p0: String, p1: String, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_virtualFree(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_memory_virtualFree(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_virtualFreeEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_memory_virtualFreeEx(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_virtualLock(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_memory_virtualLock(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_virtualProtect(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_memory_virtualProtect(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_virtualProtectEx(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_memory_virtualProtectEx(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_virtualProtectFromApp(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_memory_virtualProtectFromApp(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_virtualQuery(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_memory_virtualQuery(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_virtualQueryEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_memory_virtualQueryEx(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_virtualUnlock(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_memory_virtualUnlock(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_virtualUnlockEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_memory_virtualUnlockEx(p0: String, p1: String, p2: String): Int

public actual fun addSecureMemoryCacheCallback(pfncallback: PsecureMemoryCacheCallback): Bool =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_addSecureMemoryCacheCallback(0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allocateUserPhysicalPages(hprocess: Handle, numberofpages: COpaquePointer?, pagearray: COpaquePointer?): Bool =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_allocateUserPhysicalPages((hprocess?.value ?: 0L).toString(), (numberofpages?.value ?: 0L).toString(), (pagearray?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allocateUserPhysicalPages2(objecthandle: Handle, numberofpages: COpaquePointer?, pagearray: COpaquePointer?, extendedparameters: COpaquePointer?, extendedparametercount: UInt): Bool =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_allocateUserPhysicalPages2((objecthandle?.value ?: 0L).toString(), (numberofpages?.value ?: 0L).toString(), (pagearray?.value ?: 0L).toString(), (extendedparameters?.value ?: 0L).toString(), extendedparametercount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allocateUserPhysicalPagesNuma(hprocess: Handle, numberofpages: COpaquePointer?, pagearray: COpaquePointer?, nndpreferred: UInt): Bool =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_allocateUserPhysicalPagesNuma((hprocess?.value ?: 0L).toString(), (numberofpages?.value ?: 0L).toString(), (pagearray?.value ?: 0L).toString(), nndpreferred.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFileMapping2(file: Handle, securityattributes: COpaquePointer?, desiredaccess: UInt, pageprotection: PageProtectionFlags, allocationattributes: UInt, maximumsize: ULong, name: Pcwstr, extendedparameters: COpaquePointer?, parametercount: UInt): Handle =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_createFileMapping2((file?.value ?: 0L).toString(), (securityattributes?.value ?: 0L).toString(), desiredaccess.toInt(), pageprotection.toInt(), allocationattributes.toInt(), maximumsize.toString(), (name?.value ?: 0L).toString(), (extendedparameters?.value ?: 0L).toString(), parametercount.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFileMappingA(hfile: Handle, lpfilemappingattributes: COpaquePointer?, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcstr): Handle =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_createFileMappingA((hfile?.value ?: 0L).toString(), (lpfilemappingattributes?.value ?: 0L).toString(), flprotect.toInt(), dwmaximumsizehigh.toInt(), dwmaximumsizelow.toInt(), (lpname?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFileMappingFromApp(hfile: Handle, securityattributes: COpaquePointer?, pageprotection: PageProtectionFlags, maximumsize: ULong, name: Pcwstr): Handle =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_createFileMappingFromApp((hfile?.value ?: 0L).toString(), (securityattributes?.value ?: 0L).toString(), pageprotection.toInt(), maximumsize.toString(), (name?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFileMappingNumaA(hfile: Handle, lpfilemappingattributes: COpaquePointer?, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcstr, nndpreferred: UInt): Handle =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_createFileMappingNumaA((hfile?.value ?: 0L).toString(), (lpfilemappingattributes?.value ?: 0L).toString(), flprotect.toInt(), dwmaximumsizehigh.toInt(), dwmaximumsizelow.toInt(), (lpname?.value ?: 0L).toString(), nndpreferred.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFileMappingNumaW(hfile: Handle, lpfilemappingattributes: COpaquePointer?, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcwstr, nndpreferred: UInt): Handle =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_createFileMappingNumaW((hfile?.value ?: 0L).toString(), (lpfilemappingattributes?.value ?: 0L).toString(), flprotect.toInt(), dwmaximumsizehigh.toInt(), dwmaximumsizelow.toInt(), (lpname?.value ?: 0L).toString(), nndpreferred.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFileMappingW(hfile: Handle, lpfilemappingattributes: COpaquePointer?, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcwstr): Handle =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_createFileMappingW((hfile?.value ?: 0L).toString(), (lpfilemappingattributes?.value ?: 0L).toString(), flprotect.toInt(), dwmaximumsizehigh.toInt(), dwmaximumsizelow.toInt(), (lpname?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createMemoryResourceNotification(notificationtype: MemoryResourceNotificationType): Handle =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_createMemoryResourceNotification(notificationtype).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun discardVirtualMemory(virtualaddress: COpaquePointer?, size: ULong): UInt =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_discardVirtualMemory((virtualaddress?.value ?: 0L).toString(), size.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flushViewOfFile(lpbaseaddress: COpaquePointer?, dwnumberofbytestoflush: ULong): Bool =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_flushViewOfFile((lpbaseaddress?.value ?: 0L).toString(), dwnumberofbytestoflush.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeUserPhysicalPages(hprocess: Handle, numberofpages: COpaquePointer?, pagearray: COpaquePointer?): Bool =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_freeUserPhysicalPages((hprocess?.value ?: 0L).toString(), (numberofpages?.value ?: 0L).toString(), (pagearray?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLargePageMinimum(): ULong =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_getLargePageMinimum().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMemoryErrorHandlingCapabilities(capabilities: COpaquePointer?): Bool =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_getMemoryErrorHandlingCapabilities((capabilities?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessHeap(): Handle =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_getProcessHeap().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessHeaps(numberofheaps: UInt, processheaps: COpaquePointer?): UInt =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_getProcessHeaps(numberofheaps.toInt(), (processheaps?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessWorkingSetSizeEx(hprocess: Handle, lpminimumworkingsetsize: COpaquePointer?, lpmaximumworkingsetsize: COpaquePointer?, flags: COpaquePointer?): Bool =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_getProcessWorkingSetSizeEx((hprocess?.value ?: 0L).toString(), (lpminimumworkingsetsize?.value ?: 0L).toString(), (lpmaximumworkingsetsize?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemFileCacheSize(lpminimumfilecachesize: COpaquePointer?, lpmaximumfilecachesize: COpaquePointer?, lpflags: COpaquePointer?): Bool =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_getSystemFileCacheSize((lpminimumfilecachesize?.value ?: 0L).toString(), (lpmaximumfilecachesize?.value ?: 0L).toString(), (lpflags?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWriteWatch(dwflags: UInt, lpbaseaddress: COpaquePointer?, dwregionsize: ULong, lpaddresses: COpaquePointer?, lpdwcount: COpaquePointer?, lpdwgranularity: COpaquePointer?): UInt =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_getWriteWatch(dwflags.toInt(), (lpbaseaddress?.value ?: 0L).toString(), dwregionsize.toString(), (lpaddresses?.value ?: 0L).toString(), (lpdwcount?.value ?: 0L).toString(), (lpdwgranularity?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalAlloc(uflags: GlobalAllocFlags, dwbytes: ULong): Hglobal =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_globalAlloc(uflags.toInt(), dwbytes.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalFlags(hmem: Hglobal): UInt =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_globalFlags((hmem?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalHandle(pmem: COpaquePointer?): Hglobal =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_globalHandle((pmem?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalLock(hmem: Hglobal): COpaquePointer? =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_globalLock((hmem?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalReAlloc(hmem: Hglobal, dwbytes: ULong, uflags: UInt): Hglobal =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_globalReAlloc((hmem?.value ?: 0L).toString(), dwbytes.toString(), uflags.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalSize(hmem: Hglobal): ULong =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_globalSize((hmem?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalUnlock(hmem: Hglobal): Bool =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_globalUnlock((hmem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heapAlloc(hheap: Handle, dwflags: HeapFlags, dwbytes: ULong): COpaquePointer? =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_heapAlloc((hheap?.value ?: 0L).toString(), dwflags.toInt(), dwbytes.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heapCompact(hheap: Handle, dwflags: HeapFlags): ULong =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_heapCompact((hheap?.value ?: 0L).toString(), dwflags.toInt()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heapCreate(floptions: HeapFlags, dwinitialsize: ULong, dwmaximumsize: ULong): Handle =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_heapCreate(floptions.toInt(), dwinitialsize.toString(), dwmaximumsize.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heapDestroy(hheap: Handle): Bool =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_heapDestroy((hheap?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heapFree(hheap: Handle, dwflags: HeapFlags, lpmem: COpaquePointer?): Bool =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_heapFree((hheap?.value ?: 0L).toString(), dwflags.toInt(), (lpmem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heapLock(hheap: Handle): Bool =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_heapLock((hheap?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heapQueryInformation(heaphandle: Handle, heapinformationclass: HeapInformationClass, heapinformation: COpaquePointer?, heapinformationlength: ULong, returnlength: COpaquePointer?): Bool =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_heapQueryInformation((heaphandle?.value ?: 0L).toString(), heapinformationclass, (heapinformation?.value ?: 0L).toString(), heapinformationlength.toString(), (returnlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heapReAlloc(hheap: Handle, dwflags: HeapFlags, lpmem: COpaquePointer?, dwbytes: ULong): COpaquePointer? =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_heapReAlloc((hheap?.value ?: 0L).toString(), dwflags.toInt(), (lpmem?.value ?: 0L).toString(), dwbytes.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heapSetInformation(heaphandle: Handle, heapinformationclass: HeapInformationClass, heapinformation: COpaquePointer?, heapinformationlength: ULong): Bool =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_heapSetInformation((heaphandle?.value ?: 0L).toString(), heapinformationclass, (heapinformation?.value ?: 0L).toString(), heapinformationlength.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heapSize(hheap: Handle, dwflags: HeapFlags, lpmem: COpaquePointer?): ULong =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_heapSize((hheap?.value ?: 0L).toString(), dwflags.toInt(), (lpmem?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heapSummary(hheap: Handle, dwflags: UInt, lpsummary: COpaquePointer?): Bool =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_heapSummary((hheap?.value ?: 0L).toString(), dwflags.toInt(), (lpsummary?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heapUnlock(hheap: Handle): Bool =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_heapUnlock((hheap?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heapValidate(hheap: Handle, dwflags: HeapFlags, lpmem: COpaquePointer?): Bool =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_heapValidate((hheap?.value ?: 0L).toString(), dwflags.toInt(), (lpmem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heapWalk(hheap: Handle, lpentry: COpaquePointer?): Bool =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_heapWalk((hheap?.value ?: 0L).toString(), (lpentry?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isBadCodePtr(lpfn: Farproc): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isBadReadPtr(lp: COpaquePointer?, ucb: ULong): Bool =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_isBadReadPtr((lp?.value ?: 0L).toString(), ucb.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isBadStringPtrA(lpsz: Pcstr, ucchmax: ULong): Bool =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_isBadStringPtrA((lpsz?.value ?: 0L).toString(), ucchmax.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isBadStringPtrW(lpsz: Pcwstr, ucchmax: ULong): Bool =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_isBadStringPtrW((lpsz?.value ?: 0L).toString(), ucchmax.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isBadWritePtr(lp: COpaquePointer?, ucb: ULong): Bool =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_isBadWritePtr((lp?.value ?: 0L).toString(), ucb.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localAlloc(uflags: LocalAllocFlags, ubytes: ULong): Hlocal =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_localAlloc(uflags.toInt(), ubytes.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localFlags(hmem: Hlocal): UInt =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_localFlags((hmem?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localHandle(pmem: COpaquePointer?): Hlocal =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_localHandle((pmem?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localLock(hmem: Hlocal): COpaquePointer? =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_localLock((hmem?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localReAlloc(hmem: Hlocal, ubytes: ULong, uflags: UInt): Hlocal =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_localReAlloc((hmem?.value ?: 0L).toString(), ubytes.toString(), uflags.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localSize(hmem: Hlocal): ULong =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_localSize((hmem?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localUnlock(hmem: Hlocal): Bool =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_localUnlock((hmem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapUserPhysicalPages(virtualaddress: COpaquePointer?, numberofpages: ULong, pagearray: COpaquePointer?): Bool =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_mapUserPhysicalPages((virtualaddress?.value ?: 0L).toString(), numberofpages.toString(), (pagearray?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapUserPhysicalPagesScatter(virtualaddresses: COpaquePointer?, numberofpages: ULong, pagearray: COpaquePointer?): Bool =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_mapUserPhysicalPagesScatter((virtualaddresses?.value ?: 0L).toString(), numberofpages.toString(), (pagearray?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapViewOfFile(hfilemappingobject: Handle, dwdesiredaccess: FileMap, dwfileoffsethigh: UInt, dwfileoffsetlow: UInt, dwnumberofbytestomap: ULong): MemoryMappedViewAddress =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapViewOfFile3(filemapping: Handle, process: Handle, baseaddress: COpaquePointer?, offset: ULong, viewsize: ULong, allocationtype: VirtualAllocationType, pageprotection: UInt, extendedparameters: COpaquePointer?, parametercount: UInt): MemoryMappedViewAddress =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapViewOfFile3FromApp(filemapping: Handle, process: Handle, baseaddress: COpaquePointer?, offset: ULong, viewsize: ULong, allocationtype: VirtualAllocationType, pageprotection: UInt, extendedparameters: COpaquePointer?, parametercount: UInt): MemoryMappedViewAddress =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapViewOfFileEx(hfilemappingobject: Handle, dwdesiredaccess: FileMap, dwfileoffsethigh: UInt, dwfileoffsetlow: UInt, dwnumberofbytestomap: ULong, lpbaseaddress: COpaquePointer?): MemoryMappedViewAddress =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapViewOfFileExNuma(hfilemappingobject: Handle, dwdesiredaccess: FileMap, dwfileoffsethigh: UInt, dwfileoffsetlow: UInt, dwnumberofbytestomap: ULong, lpbaseaddress: COpaquePointer?, nndpreferred: UInt): MemoryMappedViewAddress =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapViewOfFileFromApp(hfilemappingobject: Handle, desiredaccess: FileMap, fileoffset: ULong, numberofbytestomap: ULong): MemoryMappedViewAddress =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapViewOfFileNuma2(filemappinghandle: Handle, processhandle: Handle, offset: ULong, baseaddress: COpaquePointer?, viewsize: ULong, allocationtype: UInt, pageprotection: UInt, preferrednode: UInt): MemoryMappedViewAddress =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun offerVirtualMemory(virtualaddress: COpaquePointer?, size: ULong, priority: OfferPriority): UInt =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_offerVirtualMemory((virtualaddress?.value ?: 0L).toString(), size.toString(), priority).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openDedicatedMemoryPartition(partition: Handle, dedicatedmemorytypeid: ULong, desiredaccess: UInt, inherithandle: Bool): Handle =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_openDedicatedMemoryPartition((partition?.value ?: 0L).toString(), dedicatedmemorytypeid.toString(), desiredaccess.toInt(), inherithandle).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openFileMappingA(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcstr): Handle =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_openFileMappingA(dwdesiredaccess.toInt(), binherithandle, (lpname?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openFileMappingFromApp(desiredaccess: UInt, inherithandle: Bool, name: Pcwstr): Handle =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_openFileMappingFromApp(desiredaccess.toInt(), inherithandle, (name?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openFileMappingW(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcwstr): Handle =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_openFileMappingW(dwdesiredaccess.toInt(), binherithandle, (lpname?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prefetchVirtualMemory(hprocess: Handle, numberofentries: ULong, virtualaddresses: COpaquePointer?, flags: UInt): Bool =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_prefetchVirtualMemory((hprocess?.value ?: 0L).toString(), numberofentries.toString(), (virtualaddresses?.value ?: 0L).toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryMemoryResourceNotification(resourcenotificationhandle: Handle, resourcestate: COpaquePointer?): Bool =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_queryMemoryResourceNotification((resourcenotificationhandle?.value ?: 0L).toString(), (resourcestate?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryPartitionInformation(partition: Handle, partitioninformationclass: Win32MemoryPartitionInformationClass, partitioninformation: COpaquePointer?, partitioninformationlength: UInt): Bool =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_queryPartitionInformation((partition?.value ?: 0L).toString(), partitioninformationclass, (partitioninformation?.value ?: 0L).toString(), partitioninformationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryVirtualMemoryInformation(process: Handle, virtualaddress: COpaquePointer?, memoryinformationclass: Win32MemoryInformationClass, memoryinformation: COpaquePointer?, memoryinformationsize: ULong, returnsize: COpaquePointer?): Bool =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_queryVirtualMemoryInformation((process?.value ?: 0L).toString(), (virtualaddress?.value ?: 0L).toString(), memoryinformationclass, (memoryinformation?.value ?: 0L).toString(), memoryinformationsize.toString(), (returnsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reclaimVirtualMemory(virtualaddress: COpaquePointer?, size: ULong): UInt =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_reclaimVirtualMemory((virtualaddress?.value ?: 0L).toString(), size.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerBadMemoryNotification(callback: PbadMemoryCallbackRoutine): COpaquePointer? =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_registerBadMemoryNotification(0L.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeSecureMemoryCacheCallback(pfncallback: PsecureMemoryCacheCallback): Bool =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_removeSecureMemoryCacheCallback(0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resetWriteWatch(lpbaseaddress: COpaquePointer?, dwregionsize: ULong): UInt =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_resetWriteWatch((lpbaseaddress?.value ?: 0L).toString(), dwregionsize.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCompareMemory(source1: COpaquePointer?, source2: COpaquePointer?, length: ULong): ULong =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_rtlCompareMemory((source1?.value ?: 0L).toString(), (source2?.value ?: 0L).toString(), length.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCrc32(buffer: COpaquePointer?, size: ULong, initialcrc: UInt): UInt =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_rtlCrc32((buffer?.value ?: 0L).toString(), size.toString(), initialcrc.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCrc64(buffer: COpaquePointer?, size: ULong, initialcrc: ULong): ULong =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_rtlCrc64((buffer?.value ?: 0L).toString(), size.toString(), initialcrc.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsZeroMemory(buffer: COpaquePointer?, length: ULong): Boolean =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_rtlIsZeroMemory((buffer?.value ?: 0L).toString(), length.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessValidCallTargets(hprocess: Handle, virtualaddress: COpaquePointer?, regionsize: ULong, numberofoffsets: UInt, offsetinformation: COpaquePointer?): Bool =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_setProcessValidCallTargets((hprocess?.value ?: 0L).toString(), (virtualaddress?.value ?: 0L).toString(), regionsize.toString(), numberofoffsets.toInt(), (offsetinformation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessValidCallTargetsForMappedView(process: Handle, virtualaddress: COpaquePointer?, regionsize: ULong, numberofoffsets: UInt, offsetinformation: COpaquePointer?, section: Handle, expectedfileoffset: ULong): Bool =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_setProcessValidCallTargetsForMappedView((process?.value ?: 0L).toString(), (virtualaddress?.value ?: 0L).toString(), regionsize.toString(), numberofoffsets.toInt(), (offsetinformation?.value ?: 0L).toString(), (section?.value ?: 0L).toString(), expectedfileoffset.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessWorkingSetSizeEx(hprocess: Handle, dwminimumworkingsetsize: ULong, dwmaximumworkingsetsize: ULong, flags: SetprocessworkingsetsizeexFlags): Bool =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_setProcessWorkingSetSizeEx((hprocess?.value ?: 0L).toString(), dwminimumworkingsetsize.toString(), dwmaximumworkingsetsize.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSystemFileCacheSize(minimumfilecachesize: ULong, maximumfilecachesize: ULong, flags: UInt): Bool =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_setSystemFileCacheSize(minimumfilecachesize.toString(), maximumfilecachesize.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unmapViewOfFile(lpbaseaddress: MemoryMappedViewAddress): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unmapViewOfFile2(process: Handle, baseaddress: MemoryMappedViewAddress, unmapflags: UnmapViewOfFileFlags): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unmapViewOfFileEx(baseaddress: MemoryMappedViewAddress, unmapflags: UnmapViewOfFileFlags): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterBadMemoryNotification(registrationhandle: COpaquePointer?): Bool =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_unregisterBadMemoryNotification((registrationhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualAlloc(lpaddress: COpaquePointer?, dwsize: ULong, flallocationtype: VirtualAllocationType, flprotect: PageProtectionFlags): COpaquePointer? =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_virtualAlloc((lpaddress?.value ?: 0L).toString(), dwsize.toString(), flallocationtype.toInt(), flprotect.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualAlloc2(process: Handle, baseaddress: COpaquePointer?, size: ULong, allocationtype: VirtualAllocationType, pageprotection: UInt, extendedparameters: COpaquePointer?, parametercount: UInt): COpaquePointer? =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_virtualAlloc2((process?.value ?: 0L).toString(), (baseaddress?.value ?: 0L).toString(), size.toString(), allocationtype.toInt(), pageprotection.toInt(), (extendedparameters?.value ?: 0L).toString(), parametercount.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualAlloc2FromApp(process: Handle, baseaddress: COpaquePointer?, size: ULong, allocationtype: VirtualAllocationType, pageprotection: UInt, extendedparameters: COpaquePointer?, parametercount: UInt): COpaquePointer? =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_virtualAlloc2FromApp((process?.value ?: 0L).toString(), (baseaddress?.value ?: 0L).toString(), size.toString(), allocationtype.toInt(), pageprotection.toInt(), (extendedparameters?.value ?: 0L).toString(), parametercount.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualAllocEx(hprocess: Handle, lpaddress: COpaquePointer?, dwsize: ULong, flallocationtype: VirtualAllocationType, flprotect: PageProtectionFlags): COpaquePointer? =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_virtualAllocEx((hprocess?.value ?: 0L).toString(), (lpaddress?.value ?: 0L).toString(), dwsize.toString(), flallocationtype.toInt(), flprotect.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualAllocExNuma(hprocess: Handle, lpaddress: COpaquePointer?, dwsize: ULong, flallocationtype: VirtualAllocationType, flprotect: UInt, nndpreferred: UInt): COpaquePointer? =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_virtualAllocExNuma((hprocess?.value ?: 0L).toString(), (lpaddress?.value ?: 0L).toString(), dwsize.toString(), flallocationtype.toInt(), flprotect.toInt(), nndpreferred.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualAllocFromApp(baseaddress: COpaquePointer?, size: ULong, allocationtype: VirtualAllocationType, protection: UInt): COpaquePointer? =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_virtualAllocFromApp((baseaddress?.value ?: 0L).toString(), size.toString(), allocationtype.toInt(), protection.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualFree(lpaddress: COpaquePointer?, dwsize: ULong, dwfreetype: VirtualFreeType): Bool =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_virtualFree((lpaddress?.value ?: 0L).toString(), dwsize.toString(), dwfreetype.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualFreeEx(hprocess: Handle, lpaddress: COpaquePointer?, dwsize: ULong, dwfreetype: VirtualFreeType): Bool =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_virtualFreeEx((hprocess?.value ?: 0L).toString(), (lpaddress?.value ?: 0L).toString(), dwsize.toString(), dwfreetype.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualLock(lpaddress: COpaquePointer?, dwsize: ULong): Bool =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_virtualLock((lpaddress?.value ?: 0L).toString(), dwsize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualProtect(lpaddress: COpaquePointer?, dwsize: ULong, flnewprotect: PageProtectionFlags, lpfloldprotect: COpaquePointer?): Bool =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_virtualProtect((lpaddress?.value ?: 0L).toString(), dwsize.toString(), flnewprotect.toInt(), (lpfloldprotect?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualProtectEx(hprocess: Handle, lpaddress: COpaquePointer?, dwsize: ULong, flnewprotect: PageProtectionFlags, lpfloldprotect: COpaquePointer?): Bool =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_virtualProtectEx((hprocess?.value ?: 0L).toString(), (lpaddress?.value ?: 0L).toString(), dwsize.toString(), flnewprotect.toInt(), (lpfloldprotect?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualProtectFromApp(address: COpaquePointer?, size: ULong, newprotection: UInt, oldprotection: COpaquePointer?): Bool =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_virtualProtectFromApp((address?.value ?: 0L).toString(), size.toString(), newprotection.toInt(), (oldprotection?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualQuery(lpaddress: COpaquePointer?, lpbuffer: COpaquePointer?, dwlength: ULong): ULong =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_virtualQuery((lpaddress?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), dwlength.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualQueryEx(hprocess: Handle, lpaddress: COpaquePointer?, lpbuffer: COpaquePointer?, dwlength: ULong): ULong =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_virtualQueryEx((hprocess?.value ?: 0L).toString(), (lpaddress?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), dwlength.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualUnlock(lpaddress: COpaquePointer?, dwsize: ULong): Bool =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_virtualUnlock((lpaddress?.value ?: 0L).toString(), dwsize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualUnlockEx(process: Handle, address: COpaquePointer?, size: ULong): Bool =
    if (_windowsWin32SystemMemoryNapiAvailable) _wasm_windowssys_windows_win32_system_memory_virtualUnlockEx((process?.value ?: 0L).toString(), (address?.value ?: 0L).toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
