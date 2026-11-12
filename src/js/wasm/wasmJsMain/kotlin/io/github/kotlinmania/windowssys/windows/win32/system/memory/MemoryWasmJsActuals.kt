@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

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

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemMemoryNapiAddon(): Boolean

private val windowsWin32SystemMemoryNapiAvailable: Boolean = initWindowsWin32SystemMemoryNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryAddSecureMemoryCacheCallback(p0)")
private external fun wasmWindowssysWindowsWin32SystemMemoryAddSecureMemoryCacheCallback(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryAllocateUserPhysicalPages(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemMemoryAllocateUserPhysicalPages(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryAllocateUserPhysicalPages2(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemMemoryAllocateUserPhysicalPages2(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryAllocateUserPhysicalPagesNuma(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemMemoryAllocateUserPhysicalPagesNuma(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryCreateFileMapping2(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SystemMemoryCreateFileMapping2(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String, p7: String, p8: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryCreateFileMappingA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemMemoryCreateFileMappingA(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryCreateFileMappingFromApp(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemMemoryCreateFileMappingFromApp(p0: String, p1: String, p2: Int, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryCreateFileMappingNumaA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemMemoryCreateFileMappingNumaA(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryCreateFileMappingNumaW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemMemoryCreateFileMappingNumaW(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryCreateFileMappingW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemMemoryCreateFileMappingW(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryCreateMemoryResourceNotification(p0)")
private external fun wasmWindowssysWindowsWin32SystemMemoryCreateMemoryResourceNotification(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryDiscardVirtualMemory(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemMemoryDiscardVirtualMemory(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryFlushViewOfFile(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemMemoryFlushViewOfFile(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryFreeUserPhysicalPages(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemMemoryFreeUserPhysicalPages(p0: String, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryGetLargePageMinimum()")
private external fun wasmWindowssysWindowsWin32SystemMemoryGetLargePageMinimum(): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryGetMemoryErrorHandlingCapabilities(p0)")
private external fun wasmWindowssysWindowsWin32SystemMemoryGetMemoryErrorHandlingCapabilities(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryGetProcessHeap()")
private external fun wasmWindowssysWindowsWin32SystemMemoryGetProcessHeap(): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryGetProcessHeaps(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemMemoryGetProcessHeaps(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryGetProcessWorkingSetSizeEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemMemoryGetProcessWorkingSetSizeEx(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryGetSystemFileCacheSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemMemoryGetSystemFileCacheSize(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryGetWriteWatch(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemMemoryGetWriteWatch(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryGlobalAlloc(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemMemoryGlobalAlloc(p0: Int, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryGlobalFlags(p0)")
private external fun wasmWindowssysWindowsWin32SystemMemoryGlobalFlags(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryGlobalHandle(p0)")
private external fun wasmWindowssysWindowsWin32SystemMemoryGlobalHandle(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryGlobalLock(p0)")
private external fun wasmWindowssysWindowsWin32SystemMemoryGlobalLock(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryGlobalReAlloc(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemMemoryGlobalReAlloc(p0: String, p1: String, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryGlobalSize(p0)")
private external fun wasmWindowssysWindowsWin32SystemMemoryGlobalSize(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryGlobalUnlock(p0)")
private external fun wasmWindowssysWindowsWin32SystemMemoryGlobalUnlock(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryHeapAlloc(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemMemoryHeapAlloc(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryHeapCompact(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemMemoryHeapCompact(p0: String, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryHeapCreate(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemMemoryHeapCreate(p0: Int, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryHeapDestroy(p0)")
private external fun wasmWindowssysWindowsWin32SystemMemoryHeapDestroy(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryHeapFree(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemMemoryHeapFree(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryHeapLock(p0)")
private external fun wasmWindowssysWindowsWin32SystemMemoryHeapLock(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryHeapQueryInformation(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemMemoryHeapQueryInformation(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryHeapReAlloc(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemMemoryHeapReAlloc(p0: String, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryHeapSetInformation(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemMemoryHeapSetInformation(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryHeapSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemMemoryHeapSize(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryHeapSummary(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemMemoryHeapSummary(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryHeapUnlock(p0)")
private external fun wasmWindowssysWindowsWin32SystemMemoryHeapUnlock(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryHeapValidate(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemMemoryHeapValidate(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryHeapWalk(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemMemoryHeapWalk(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryIsBadReadPtr(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemMemoryIsBadReadPtr(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryIsBadStringPtrA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemMemoryIsBadStringPtrA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryIsBadStringPtrW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemMemoryIsBadStringPtrW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryIsBadWritePtr(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemMemoryIsBadWritePtr(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryLocalAlloc(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemMemoryLocalAlloc(p0: Int, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryLocalFlags(p0)")
private external fun wasmWindowssysWindowsWin32SystemMemoryLocalFlags(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryLocalHandle(p0)")
private external fun wasmWindowssysWindowsWin32SystemMemoryLocalHandle(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryLocalLock(p0)")
private external fun wasmWindowssysWindowsWin32SystemMemoryLocalLock(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryLocalReAlloc(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemMemoryLocalReAlloc(p0: String, p1: String, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryLocalSize(p0)")
private external fun wasmWindowssysWindowsWin32SystemMemoryLocalSize(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryLocalUnlock(p0)")
private external fun wasmWindowssysWindowsWin32SystemMemoryLocalUnlock(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryMapUserPhysicalPages(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemMemoryMapUserPhysicalPages(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryMapUserPhysicalPagesScatter(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemMemoryMapUserPhysicalPagesScatter(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryOfferVirtualMemory(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemMemoryOfferVirtualMemory(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryOpenDedicatedMemoryPartition(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemMemoryOpenDedicatedMemoryPartition(p0: String, p1: String, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryOpenFileMappingA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemMemoryOpenFileMappingA(p0: Int, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryOpenFileMappingFromApp(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemMemoryOpenFileMappingFromApp(p0: Int, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryOpenFileMappingW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemMemoryOpenFileMappingW(p0: Int, p1: Int, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryPrefetchVirtualMemory(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemMemoryPrefetchVirtualMemory(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryQueryMemoryResourceNotification(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemMemoryQueryMemoryResourceNotification(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryQueryPartitionInformation(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemMemoryQueryPartitionInformation(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryQueryVirtualMemoryInformation(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemMemoryQueryVirtualMemoryInformation(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryReclaimVirtualMemory(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemMemoryReclaimVirtualMemory(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryRegisterBadMemoryNotification(p0)")
private external fun wasmWindowssysWindowsWin32SystemMemoryRegisterBadMemoryNotification(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryRemoveSecureMemoryCacheCallback(p0)")
private external fun wasmWindowssysWindowsWin32SystemMemoryRemoveSecureMemoryCacheCallback(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryResetWriteWatch(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemMemoryResetWriteWatch(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryRtlCompareMemory(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemMemoryRtlCompareMemory(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryRtlCrc32(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemMemoryRtlCrc32(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryRtlCrc64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemMemoryRtlCrc64(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryRtlIsZeroMemory(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemMemoryRtlIsZeroMemory(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemorySetProcessValidCallTargets(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemMemorySetProcessValidCallTargets(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemorySetProcessValidCallTargetsForMappedView(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemMemorySetProcessValidCallTargetsForMappedView(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemorySetProcessWorkingSetSizeEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemMemorySetProcessWorkingSetSizeEx(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemorySetSystemFileCacheSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemMemorySetSystemFileCacheSize(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryUnregisterBadMemoryNotification(p0)")
private external fun wasmWindowssysWindowsWin32SystemMemoryUnregisterBadMemoryNotification(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryVirtualAlloc(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemMemoryVirtualAlloc(p0: String, p1: String, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryVirtualAlloc2(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemMemoryVirtualAlloc2(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryVirtualAlloc2FromApp(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemMemoryVirtualAlloc2FromApp(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryVirtualAllocEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemMemoryVirtualAllocEx(p0: String, p1: String, p2: String, p3: Int, p4: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryVirtualAllocExNuma(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemMemoryVirtualAllocExNuma(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryVirtualAllocFromApp(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemMemoryVirtualAllocFromApp(p0: String, p1: String, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryVirtualFree(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemMemoryVirtualFree(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryVirtualFreeEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemMemoryVirtualFreeEx(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryVirtualLock(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemMemoryVirtualLock(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryVirtualProtect(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemMemoryVirtualProtect(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryVirtualProtectEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemMemoryVirtualProtectEx(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryVirtualProtectFromApp(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemMemoryVirtualProtectFromApp(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryVirtualQuery(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemMemoryVirtualQuery(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryVirtualQueryEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemMemoryVirtualQueryEx(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryVirtualUnlock(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemMemoryVirtualUnlock(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryVirtualUnlockEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemMemoryVirtualUnlockEx(p0: String, p1: String, p2: String): Int

public actual fun addSecureMemoryCacheCallback(pfncallback: PsecureMemoryCacheCallback): Bool =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryAddSecureMemoryCacheCallback(0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allocateUserPhysicalPages(hprocess: Handle, numberofpages: MutPtr, pagearray: MutPtr): Bool =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryAllocateUserPhysicalPages(hprocess.rawAddress.toString(), numberofpages.rawAddress.toString(), pagearray.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allocateUserPhysicalPages2(objecthandle: Handle, numberofpages: MutPtr, pagearray: MutPtr, extendedparameters: MutPtr, extendedparametercount: UInt): Bool =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryAllocateUserPhysicalPages2(objecthandle.rawAddress.toString(), numberofpages.rawAddress.toString(), pagearray.rawAddress.toString(), extendedparameters.rawAddress.toString(), extendedparametercount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allocateUserPhysicalPagesNuma(hprocess: Handle, numberofpages: MutPtr, pagearray: MutPtr, nndpreferred: UInt): Bool =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryAllocateUserPhysicalPagesNuma(hprocess.rawAddress.toString(), numberofpages.rawAddress.toString(), pagearray.rawAddress.toString(), nndpreferred.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFileMapping2(file: Handle, securityattributes: ConstPtr, desiredaccess: UInt, pageprotection: PageProtectionFlags, allocationattributes: UInt, maximumsize: ULong, name: Pcwstr, extendedparameters: MutPtr, parametercount: UInt): Handle =
    if (windowsWin32SystemMemoryNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemMemoryCreateFileMapping2(file.rawAddress.toString(), securityattributes.rawAddress.toString(), desiredaccess.toInt(), pageprotection.toInt(), allocationattributes.toInt(), maximumsize.toString(), name.rawAddress.toString(), extendedparameters.rawAddress.toString(), parametercount.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFileMappingA(hfile: Handle, lpfilemappingattributes: ConstPtr, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcstr): Handle =
    if (windowsWin32SystemMemoryNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemMemoryCreateFileMappingA(hfile.rawAddress.toString(), lpfilemappingattributes.rawAddress.toString(), flprotect.toInt(), dwmaximumsizehigh.toInt(), dwmaximumsizelow.toInt(), lpname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFileMappingFromApp(hfile: Handle, securityattributes: ConstPtr, pageprotection: PageProtectionFlags, maximumsize: ULong, name: Pcwstr): Handle =
    if (windowsWin32SystemMemoryNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemMemoryCreateFileMappingFromApp(hfile.rawAddress.toString(), securityattributes.rawAddress.toString(), pageprotection.toInt(), maximumsize.toString(), name.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFileMappingNumaA(hfile: Handle, lpfilemappingattributes: ConstPtr, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcstr, nndpreferred: UInt): Handle =
    if (windowsWin32SystemMemoryNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemMemoryCreateFileMappingNumaA(hfile.rawAddress.toString(), lpfilemappingattributes.rawAddress.toString(), flprotect.toInt(), dwmaximumsizehigh.toInt(), dwmaximumsizelow.toInt(), lpname.rawAddress.toString(), nndpreferred.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFileMappingNumaW(hfile: Handle, lpfilemappingattributes: ConstPtr, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcwstr, nndpreferred: UInt): Handle =
    if (windowsWin32SystemMemoryNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemMemoryCreateFileMappingNumaW(hfile.rawAddress.toString(), lpfilemappingattributes.rawAddress.toString(), flprotect.toInt(), dwmaximumsizehigh.toInt(), dwmaximumsizelow.toInt(), lpname.rawAddress.toString(), nndpreferred.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFileMappingW(hfile: Handle, lpfilemappingattributes: ConstPtr, flprotect: PageProtectionFlags, dwmaximumsizehigh: UInt, dwmaximumsizelow: UInt, lpname: Pcwstr): Handle =
    if (windowsWin32SystemMemoryNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemMemoryCreateFileMappingW(hfile.rawAddress.toString(), lpfilemappingattributes.rawAddress.toString(), flprotect.toInt(), dwmaximumsizehigh.toInt(), dwmaximumsizelow.toInt(), lpname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createMemoryResourceNotification(notificationtype: MemoryResourceNotificationType): Handle =
    if (windowsWin32SystemMemoryNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemMemoryCreateMemoryResourceNotification(notificationtype).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun discardVirtualMemory(virtualaddress: MutPtr, size: ULong): UInt =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryDiscardVirtualMemory(virtualaddress.rawAddress.toString(), size.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flushViewOfFile(lpbaseaddress: ConstPtr, dwnumberofbytestoflush: ULong): Bool =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryFlushViewOfFile(lpbaseaddress.rawAddress.toString(), dwnumberofbytestoflush.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeUserPhysicalPages(hprocess: Handle, numberofpages: MutPtr, pagearray: ConstPtr): Bool =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryFreeUserPhysicalPages(hprocess.rawAddress.toString(), numberofpages.rawAddress.toString(), pagearray.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLargePageMinimum(): ULong =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryGetLargePageMinimum().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMemoryErrorHandlingCapabilities(capabilities: MutPtr): Bool =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryGetMemoryErrorHandlingCapabilities(capabilities.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessHeap(): Handle =
    if (windowsWin32SystemMemoryNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemMemoryGetProcessHeap().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessHeaps(numberofheaps: UInt, processheaps: MutPtr): UInt =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryGetProcessHeaps(numberofheaps.toInt(), processheaps.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessWorkingSetSizeEx(hprocess: Handle, lpminimumworkingsetsize: MutPtr, lpmaximumworkingsetsize: MutPtr, flags: MutPtr): Bool =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryGetProcessWorkingSetSizeEx(hprocess.rawAddress.toString(), lpminimumworkingsetsize.rawAddress.toString(), lpmaximumworkingsetsize.rawAddress.toString(), flags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemFileCacheSize(lpminimumfilecachesize: MutPtr, lpmaximumfilecachesize: MutPtr, lpflags: MutPtr): Bool =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryGetSystemFileCacheSize(lpminimumfilecachesize.rawAddress.toString(), lpmaximumfilecachesize.rawAddress.toString(), lpflags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWriteWatch(dwflags: UInt, lpbaseaddress: ConstPtr, dwregionsize: ULong, lpaddresses: MutPtr, lpdwcount: MutPtr, lpdwgranularity: MutPtr): UInt =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryGetWriteWatch(dwflags.toInt(), lpbaseaddress.rawAddress.toString(), dwregionsize.toString(), lpaddresses.rawAddress.toString(), lpdwcount.rawAddress.toString(), lpdwgranularity.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalAlloc(uflags: GlobalAllocFlags, dwbytes: ULong): Hglobal =
    if (windowsWin32SystemMemoryNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemMemoryGlobalAlloc(uflags.toInt(), dwbytes.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalFlags(hmem: Hglobal): UInt =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryGlobalFlags(hmem.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalHandle(pmem: ConstPtr): Hglobal =
    if (windowsWin32SystemMemoryNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemMemoryGlobalHandle(pmem.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalLock(hmem: Hglobal): MutPtr =
    if (windowsWin32SystemMemoryNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemMemoryGlobalLock(hmem.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalReAlloc(hmem: Hglobal, dwbytes: ULong, uflags: UInt): Hglobal =
    if (windowsWin32SystemMemoryNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemMemoryGlobalReAlloc(hmem.rawAddress.toString(), dwbytes.toString(), uflags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalSize(hmem: Hglobal): ULong =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryGlobalSize(hmem.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globalUnlock(hmem: Hglobal): Bool =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryGlobalUnlock(hmem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heapAlloc(hheap: Handle, dwflags: HeapFlags, dwbytes: ULong): MutPtr =
    if (windowsWin32SystemMemoryNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemMemoryHeapAlloc(hheap.rawAddress.toString(), dwflags.toInt(), dwbytes.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heapCompact(hheap: Handle, dwflags: HeapFlags): ULong =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryHeapCompact(hheap.rawAddress.toString(), dwflags.toInt()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heapCreate(floptions: HeapFlags, dwinitialsize: ULong, dwmaximumsize: ULong): Handle =
    if (windowsWin32SystemMemoryNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemMemoryHeapCreate(floptions.toInt(), dwinitialsize.toString(), dwmaximumsize.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heapDestroy(hheap: Handle): Bool =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryHeapDestroy(hheap.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heapFree(hheap: Handle, dwflags: HeapFlags, lpmem: ConstPtr): Bool =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryHeapFree(hheap.rawAddress.toString(), dwflags.toInt(), lpmem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heapLock(hheap: Handle): Bool =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryHeapLock(hheap.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heapQueryInformation(heaphandle: Handle, heapinformationclass: HeapInformationClass, heapinformation: MutPtr, heapinformationlength: ULong, returnlength: MutPtr): Bool =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryHeapQueryInformation(heaphandle.rawAddress.toString(), heapinformationclass, heapinformation.rawAddress.toString(), heapinformationlength.toString(), returnlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heapReAlloc(hheap: Handle, dwflags: HeapFlags, lpmem: ConstPtr, dwbytes: ULong): MutPtr =
    if (windowsWin32SystemMemoryNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemMemoryHeapReAlloc(hheap.rawAddress.toString(), dwflags.toInt(), lpmem.rawAddress.toString(), dwbytes.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heapSetInformation(heaphandle: Handle, heapinformationclass: HeapInformationClass, heapinformation: ConstPtr, heapinformationlength: ULong): Bool =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryHeapSetInformation(heaphandle.rawAddress.toString(), heapinformationclass, heapinformation.rawAddress.toString(), heapinformationlength.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heapSize(hheap: Handle, dwflags: HeapFlags, lpmem: ConstPtr): ULong =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryHeapSize(hheap.rawAddress.toString(), dwflags.toInt(), lpmem.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heapSummary(hheap: Handle, dwflags: UInt, lpsummary: MutPtr): Bool =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryHeapSummary(hheap.rawAddress.toString(), dwflags.toInt(), lpsummary.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heapUnlock(hheap: Handle): Bool =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryHeapUnlock(hheap.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heapValidate(hheap: Handle, dwflags: HeapFlags, lpmem: ConstPtr): Bool =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryHeapValidate(hheap.rawAddress.toString(), dwflags.toInt(), lpmem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heapWalk(hheap: Handle, lpentry: MutPtr): Bool =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryHeapWalk(hheap.rawAddress.toString(), lpentry.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isBadCodePtr(lpfn: Farproc): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isBadReadPtr(lp: ConstPtr, ucb: ULong): Bool =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryIsBadReadPtr(lp.rawAddress.toString(), ucb.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isBadStringPtrA(lpsz: Pcstr, ucchmax: ULong): Bool =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryIsBadStringPtrA(lpsz.rawAddress.toString(), ucchmax.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isBadStringPtrW(lpsz: Pcwstr, ucchmax: ULong): Bool =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryIsBadStringPtrW(lpsz.rawAddress.toString(), ucchmax.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isBadWritePtr(lp: ConstPtr, ucb: ULong): Bool =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryIsBadWritePtr(lp.rawAddress.toString(), ucb.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localAlloc(uflags: LocalAllocFlags, ubytes: ULong): Hlocal =
    if (windowsWin32SystemMemoryNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemMemoryLocalAlloc(uflags.toInt(), ubytes.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localFlags(hmem: Hlocal): UInt =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryLocalFlags(hmem.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localHandle(pmem: ConstPtr): Hlocal =
    if (windowsWin32SystemMemoryNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemMemoryLocalHandle(pmem.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localLock(hmem: Hlocal): MutPtr =
    if (windowsWin32SystemMemoryNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemMemoryLocalLock(hmem.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localReAlloc(hmem: Hlocal, ubytes: ULong, uflags: UInt): Hlocal =
    if (windowsWin32SystemMemoryNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemMemoryLocalReAlloc(hmem.rawAddress.toString(), ubytes.toString(), uflags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localSize(hmem: Hlocal): ULong =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryLocalSize(hmem.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localUnlock(hmem: Hlocal): Bool =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryLocalUnlock(hmem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapUserPhysicalPages(virtualaddress: ConstPtr, numberofpages: ULong, pagearray: ConstPtr): Bool =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryMapUserPhysicalPages(virtualaddress.rawAddress.toString(), numberofpages.toString(), pagearray.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapUserPhysicalPagesScatter(virtualaddresses: ConstPtr, numberofpages: ULong, pagearray: ConstPtr): Bool =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryMapUserPhysicalPagesScatter(virtualaddresses.rawAddress.toString(), numberofpages.toString(), pagearray.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

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
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryOfferVirtualMemory(virtualaddress.rawAddress.toString(), size.toString(), priority).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openDedicatedMemoryPartition(partition: Handle, dedicatedmemorytypeid: ULong, desiredaccess: UInt, inherithandle: Bool): Handle =
    if (windowsWin32SystemMemoryNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemMemoryOpenDedicatedMemoryPartition(partition.rawAddress.toString(), dedicatedmemorytypeid.toString(), desiredaccess.toInt(), inherithandle).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openFileMappingA(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcstr): Handle =
    if (windowsWin32SystemMemoryNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemMemoryOpenFileMappingA(dwdesiredaccess.toInt(), binherithandle, lpname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openFileMappingFromApp(desiredaccess: UInt, inherithandle: Bool, name: Pcwstr): Handle =
    if (windowsWin32SystemMemoryNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemMemoryOpenFileMappingFromApp(desiredaccess.toInt(), inherithandle, name.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openFileMappingW(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcwstr): Handle =
    if (windowsWin32SystemMemoryNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemMemoryOpenFileMappingW(dwdesiredaccess.toInt(), binherithandle, lpname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prefetchVirtualMemory(hprocess: Handle, numberofentries: ULong, virtualaddresses: ConstPtr, flags: UInt): Bool =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryPrefetchVirtualMemory(hprocess.rawAddress.toString(), numberofentries.toString(), virtualaddresses.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryMemoryResourceNotification(resourcenotificationhandle: Handle, resourcestate: MutPtr): Bool =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryQueryMemoryResourceNotification(resourcenotificationhandle.rawAddress.toString(), resourcestate.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryPartitionInformation(partition: Handle, partitioninformationclass: Win32MemoryPartitionInformationClass, partitioninformation: MutPtr, partitioninformationlength: UInt): Bool =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryQueryPartitionInformation(partition.rawAddress.toString(), partitioninformationclass, partitioninformation.rawAddress.toString(), partitioninformationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryVirtualMemoryInformation(process: Handle, virtualaddress: ConstPtr, memoryinformationclass: Win32MemoryInformationClass, memoryinformation: MutPtr, memoryinformationsize: ULong, returnsize: MutPtr): Bool =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryQueryVirtualMemoryInformation(process.rawAddress.toString(), virtualaddress.rawAddress.toString(), memoryinformationclass, memoryinformation.rawAddress.toString(), memoryinformationsize.toString(), returnsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reclaimVirtualMemory(virtualaddress: ConstPtr, size: ULong): UInt =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryReclaimVirtualMemory(virtualaddress.rawAddress.toString(), size.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerBadMemoryNotification(callback: PbadMemoryCallbackRoutine): MutPtr =
    if (windowsWin32SystemMemoryNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemMemoryRegisterBadMemoryNotification(0L.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeSecureMemoryCacheCallback(pfncallback: PsecureMemoryCacheCallback): Bool =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryRemoveSecureMemoryCacheCallback(0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resetWriteWatch(lpbaseaddress: ConstPtr, dwregionsize: ULong): UInt =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryResetWriteWatch(lpbaseaddress.rawAddress.toString(), dwregionsize.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCompareMemory(source1: ConstPtr, source2: ConstPtr, length: ULong): ULong =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryRtlCompareMemory(source1.rawAddress.toString(), source2.rawAddress.toString(), length.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCrc32(buffer: ConstPtr, size: ULong, initialcrc: UInt): UInt =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryRtlCrc32(buffer.rawAddress.toString(), size.toString(), initialcrc.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCrc64(buffer: ConstPtr, size: ULong, initialcrc: ULong): ULong =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryRtlCrc64(buffer.rawAddress.toString(), size.toString(), initialcrc.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsZeroMemory(buffer: ConstPtr, length: ULong): Boolean =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryRtlIsZeroMemory(buffer.rawAddress.toString(), length.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessValidCallTargets(hprocess: Handle, virtualaddress: ConstPtr, regionsize: ULong, numberofoffsets: UInt, offsetinformation: MutPtr): Bool =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemorySetProcessValidCallTargets(hprocess.rawAddress.toString(), virtualaddress.rawAddress.toString(), regionsize.toString(), numberofoffsets.toInt(), offsetinformation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessValidCallTargetsForMappedView(process: Handle, virtualaddress: ConstPtr, regionsize: ULong, numberofoffsets: UInt, offsetinformation: MutPtr, section: Handle, expectedfileoffset: ULong): Bool =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemorySetProcessValidCallTargetsForMappedView(process.rawAddress.toString(), virtualaddress.rawAddress.toString(), regionsize.toString(), numberofoffsets.toInt(), offsetinformation.rawAddress.toString(), section.rawAddress.toString(), expectedfileoffset.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessWorkingSetSizeEx(hprocess: Handle, dwminimumworkingsetsize: ULong, dwmaximumworkingsetsize: ULong, flags: SetprocessworkingsetsizeexFlags): Bool =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemorySetProcessWorkingSetSizeEx(hprocess.rawAddress.toString(), dwminimumworkingsetsize.toString(), dwmaximumworkingsetsize.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSystemFileCacheSize(minimumfilecachesize: ULong, maximumfilecachesize: ULong, flags: UInt): Bool =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemorySetSystemFileCacheSize(minimumfilecachesize.toString(), maximumfilecachesize.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unmapViewOfFile(lpbaseaddress: MemoryMappedViewAddress): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unmapViewOfFile2(process: Handle, baseaddress: MemoryMappedViewAddress, unmapflags: UnmapViewOfFileFlags): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unmapViewOfFileEx(baseaddress: MemoryMappedViewAddress, unmapflags: UnmapViewOfFileFlags): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterBadMemoryNotification(registrationhandle: ConstPtr): Bool =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryUnregisterBadMemoryNotification(registrationhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualAlloc(lpaddress: ConstPtr, dwsize: ULong, flallocationtype: VirtualAllocationType, flprotect: PageProtectionFlags): MutPtr =
    if (windowsWin32SystemMemoryNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemMemoryVirtualAlloc(lpaddress.rawAddress.toString(), dwsize.toString(), flallocationtype.toInt(), flprotect.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualAlloc2(process: Handle, baseaddress: ConstPtr, size: ULong, allocationtype: VirtualAllocationType, pageprotection: UInt, extendedparameters: MutPtr, parametercount: UInt): MutPtr =
    if (windowsWin32SystemMemoryNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemMemoryVirtualAlloc2(process.rawAddress.toString(), baseaddress.rawAddress.toString(), size.toString(), allocationtype.toInt(), pageprotection.toInt(), extendedparameters.rawAddress.toString(), parametercount.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualAlloc2FromApp(process: Handle, baseaddress: ConstPtr, size: ULong, allocationtype: VirtualAllocationType, pageprotection: UInt, extendedparameters: MutPtr, parametercount: UInt): MutPtr =
    if (windowsWin32SystemMemoryNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemMemoryVirtualAlloc2FromApp(process.rawAddress.toString(), baseaddress.rawAddress.toString(), size.toString(), allocationtype.toInt(), pageprotection.toInt(), extendedparameters.rawAddress.toString(), parametercount.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualAllocEx(hprocess: Handle, lpaddress: ConstPtr, dwsize: ULong, flallocationtype: VirtualAllocationType, flprotect: PageProtectionFlags): MutPtr =
    if (windowsWin32SystemMemoryNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemMemoryVirtualAllocEx(hprocess.rawAddress.toString(), lpaddress.rawAddress.toString(), dwsize.toString(), flallocationtype.toInt(), flprotect.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualAllocExNuma(hprocess: Handle, lpaddress: ConstPtr, dwsize: ULong, flallocationtype: VirtualAllocationType, flprotect: UInt, nndpreferred: UInt): MutPtr =
    if (windowsWin32SystemMemoryNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemMemoryVirtualAllocExNuma(hprocess.rawAddress.toString(), lpaddress.rawAddress.toString(), dwsize.toString(), flallocationtype.toInt(), flprotect.toInt(), nndpreferred.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualAllocFromApp(baseaddress: ConstPtr, size: ULong, allocationtype: VirtualAllocationType, protection: UInt): MutPtr =
    if (windowsWin32SystemMemoryNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemMemoryVirtualAllocFromApp(baseaddress.rawAddress.toString(), size.toString(), allocationtype.toInt(), protection.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualFree(lpaddress: MutPtr, dwsize: ULong, dwfreetype: VirtualFreeType): Bool =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryVirtualFree(lpaddress.rawAddress.toString(), dwsize.toString(), dwfreetype.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualFreeEx(hprocess: Handle, lpaddress: MutPtr, dwsize: ULong, dwfreetype: VirtualFreeType): Bool =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryVirtualFreeEx(hprocess.rawAddress.toString(), lpaddress.rawAddress.toString(), dwsize.toString(), dwfreetype.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualLock(lpaddress: ConstPtr, dwsize: ULong): Bool =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryVirtualLock(lpaddress.rawAddress.toString(), dwsize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualProtect(lpaddress: ConstPtr, dwsize: ULong, flnewprotect: PageProtectionFlags, lpfloldprotect: MutPtr): Bool =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryVirtualProtect(lpaddress.rawAddress.toString(), dwsize.toString(), flnewprotect.toInt(), lpfloldprotect.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualProtectEx(hprocess: Handle, lpaddress: ConstPtr, dwsize: ULong, flnewprotect: PageProtectionFlags, lpfloldprotect: MutPtr): Bool =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryVirtualProtectEx(hprocess.rawAddress.toString(), lpaddress.rawAddress.toString(), dwsize.toString(), flnewprotect.toInt(), lpfloldprotect.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualProtectFromApp(address: ConstPtr, size: ULong, newprotection: UInt, oldprotection: MutPtr): Bool =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryVirtualProtectFromApp(address.rawAddress.toString(), size.toString(), newprotection.toInt(), oldprotection.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualQuery(lpaddress: ConstPtr, lpbuffer: MutPtr, dwlength: ULong): ULong =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryVirtualQuery(lpaddress.rawAddress.toString(), lpbuffer.rawAddress.toString(), dwlength.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualQueryEx(hprocess: Handle, lpaddress: ConstPtr, lpbuffer: MutPtr, dwlength: ULong): ULong =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryVirtualQueryEx(hprocess.rawAddress.toString(), lpaddress.rawAddress.toString(), lpbuffer.rawAddress.toString(), dwlength.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualUnlock(lpaddress: ConstPtr, dwsize: ULong): Bool =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryVirtualUnlock(lpaddress.rawAddress.toString(), dwsize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualUnlockEx(process: Handle, address: ConstPtr, size: ULong): Bool =
    if (windowsWin32SystemMemoryNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryVirtualUnlockEx(process.rawAddress.toString(), address.rawAddress.toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
