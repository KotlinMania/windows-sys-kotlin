@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DriverFsNotification
import io.github.kotlinmania.windowssys.windows.wdk.foundation.KspinLockQueueNumber
import io.github.kotlinmania.windowssys.windows.wdk.foundation.ObjectInformationClass
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Peprocess
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pesilo
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pethread
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pkthread
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PnotifySync
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PobjectType
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PoolType
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Prkprocess
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString
import io.github.kotlinmania.windowssys.windows.win32.security.AuditEventType
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityImpersonationLevel
import io.github.kotlinmania.windowssys.windows.win32.security.TokenInformationClass
import io.github.kotlinmania.windowssys.windows.win32.security.TokenType
import io.github.kotlinmania.windowssys.windows.win32.security.WellKnownSidType
import io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.SecGetKeyFn
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileAccessRights
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileFlagsAndAttributes
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileShareMode
import io.github.kotlinmania.windowssys.windows.win32.system.io.PioApcRoutine
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.EventType
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.WaitType

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWdkStorageFilesystemNapiAddon(): Boolean

private val _windowsWdkStorageFilesystemNapiAvailable: Boolean = _initWindowsWdkStorageFilesystemNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_applyControlToken(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_applyControlToken(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccAsyncCopyRead(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccAsyncCopyRead(p0: String, p1: String, p2: Int, p3: Boolean, p4: String, p5: String, p6: String, p7: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccCanIWrite(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccCanIWrite(p0: String, p1: Int, p2: Boolean, p3: Int): Boolean

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccCoherencyFlushAndPurgeCache(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccCoherencyFlushAndPurgeCache(p0: String, p1: String, p2: Int, p3: String, p4: Int)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccCopyRead(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccCopyRead(p0: String, p1: String, p2: Int, p3: Boolean, p4: String, p5: String): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccCopyReadEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccCopyReadEx(p0: String, p1: String, p2: Int, p3: Boolean, p4: String, p5: String, p6: String): Boolean

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccCopyWrite(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccCopyWrite(p0: String, p1: String, p2: Int, p3: Boolean, p4: String): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccCopyWriteEx(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccCopyWriteEx(p0: String, p1: String, p2: Int, p3: Boolean, p4: String, p5: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccCopyWriteWontFlush(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccCopyWriteWontFlush(p0: String, p1: String, p2: Int): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccDeferWrite(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccDeferWrite(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Boolean)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccErrorCallbackRoutine(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccErrorCallbackRoutine(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccFastCopyRead(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccFastCopyRead(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccFastCopyWrite(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccFastCopyWrite(p0: String, p1: Int, p2: Int, p3: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccFlushCache(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccFlushCache(p0: String, p1: String, p2: Int, p3: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccGetDirtyPages(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccGetDirtyPages(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccGetFileObjectFromBcb(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccGetFileObjectFromBcb(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccGetFileObjectFromSectionPtrs(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccGetFileObjectFromSectionPtrs(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccGetFileObjectFromSectionPtrsRef(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccGetFileObjectFromSectionPtrsRef(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccGetFlushedValidData(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccGetFlushedValidData(p0: String, p1: Boolean): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccInitializeCacheMap(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccInitializeCacheMap(p0: String, p1: String, p2: Boolean, p3: String, p4: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccInitializeCacheMapEx(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccInitializeCacheMapEx(p0: String, p1: String, p2: Boolean, p3: String, p4: String, p5: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccIsCacheManagerCallbackNeeded(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccIsCacheManagerCallbackNeeded(p0: Int): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccIsThereDirtyData(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccIsThereDirtyData(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccIsThereDirtyDataEx(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccIsThereDirtyDataEx(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccMapData(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccMapData(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Boolean

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccMdlRead(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccMdlRead(p0: String, p1: String, p2: Int, p3: String, p4: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccMdlReadComplete(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccMdlReadComplete(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccMdlWriteAbort(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccMdlWriteAbort(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccMdlWriteComplete(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccMdlWriteComplete(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccPinMappedData(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccPinMappedData(p0: String, p1: String, p2: Int, p3: Int, p4: String): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccPinRead(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccPinRead(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Boolean

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccPrepareMdlWrite(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccPrepareMdlWrite(p0: String, p1: String, p2: Int, p3: String, p4: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccPreparePinWrite(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccPreparePinWrite(p0: String, p1: String, p2: Int, p3: Boolean, p4: Int, p5: String, p6: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccPurgeCacheSection(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccPurgeCacheSection(p0: String, p1: String, p2: Int, p3: Int): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccRemapBcb(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccRemapBcb(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccRepinBcb(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccRepinBcb(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccScheduleReadAhead(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccScheduleReadAhead(p0: String, p1: String, p2: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccScheduleReadAheadEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccScheduleReadAheadEx(p0: String, p1: String, p2: Int, p3: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccSetAdditionalCacheAttributes(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccSetAdditionalCacheAttributes(p0: String, p1: Boolean, p2: Boolean)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccSetAdditionalCacheAttributesEx(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccSetAdditionalCacheAttributesEx(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccSetBcbOwnerPointer(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccSetBcbOwnerPointer(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccSetDirtyPageThreshold(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccSetDirtyPageThreshold(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccSetDirtyPinnedData(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccSetDirtyPinnedData(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccSetFileSizes(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccSetFileSizes(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccSetFileSizesEx(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccSetFileSizesEx(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccSetLogHandleForFile(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccSetLogHandleForFile(p0: String, p1: String, p2: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccSetParallelFlushFile(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccSetParallelFlushFile(p0: String, p1: Boolean)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccSetReadAheadGranularity(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccSetReadAheadGranularity(p0: String, p1: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccUninitializeCacheMap(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccUninitializeCacheMap(p0: String, p1: String, p2: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccUnpinData(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccUnpinData(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccUnpinDataForThread(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccUnpinDataForThread(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccUnpinRepinnedBcb(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccUnpinRepinnedBcb(p0: String, p1: Boolean, p2: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccWaitForCurrentLazyWriterActivity()")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccWaitForCurrentLazyWriterActivity(): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ccZeroData(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ccZeroData(p0: String, p1: String, p2: String, p3: Boolean): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_completeAuthToken(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_completeAuthToken(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_exDisableResourceBoostLite(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_exDisableResourceBoostLite(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_exQueryPoolBlockSize(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_exQueryPoolBlockSize(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_exportSecurityContext(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_exportSecurityContext(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlAcknowledgeEcp(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlAcknowledgeEcp(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlAcquireFileExclusive(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlAcquireFileExclusive(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlAddBaseMcbEntry(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlAddBaseMcbEntry(p0: String, p1: String, p2: String, p3: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlAddBaseMcbEntryEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlAddBaseMcbEntryEx(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlAddLargeMcbEntry(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlAddLargeMcbEntry(p0: String, p1: String, p2: String, p3: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlAddMcbEntry(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlAddMcbEntry(p0: String, p1: Int, p2: Int, p3: Int): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlAddToTunnelCache(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlAddToTunnelCache(p0: String, p1: String, p2: String, p3: String, p4: Boolean, p5: Int, p6: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlAddToTunnelCacheEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlAddToTunnelCacheEx(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlAllocateAePushLock(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlAllocateAePushLock(p0: Int, p1: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlAllocateExtraCreateParameter(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlAllocateExtraCreateParameter(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlAllocateExtraCreateParameterFromLookasideList(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlAllocateExtraCreateParameterFromLookasideList(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlAllocateExtraCreateParameterList(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlAllocateExtraCreateParameterList(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlAllocateFileLock(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlAllocateFileLock(p0: String, p1: String): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlAllocateResource()")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlAllocateResource(): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlAreNamesEqual(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlAreNamesEqual(p0: String, p1: String, p2: Boolean, p3: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlAreThereCurrentOrInProgressFileLocks(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlAreThereCurrentOrInProgressFileLocks(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlAreThereWaitingFileLocks(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlAreThereWaitingFileLocks(p0: String): Boolean

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlAreVolumeStartupApplicationsComplete()")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlAreVolumeStartupApplicationsComplete(): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlBalanceReads(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlBalanceReads(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlCancellableWaitForMultipleObjects(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlCancellableWaitForMultipleObjects(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlCancellableWaitForSingleObject(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlCancellableWaitForSingleObject(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlChangeBackingFileObject(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlChangeBackingFileObject(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlCheckLockForOplockRequest(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlCheckLockForOplockRequest(p0: String, p1: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlCheckLockForReadAccess(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlCheckLockForReadAccess(p0: String, p1: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlCheckLockForWriteAccess(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlCheckLockForWriteAccess(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlCheckOplock(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlCheckOplock(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlCheckOplockEx(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlCheckOplockEx(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlCheckOplockEx2(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlCheckOplockEx2(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlCheckUpperOplock(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlCheckUpperOplock(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlCopyRead(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlCopyRead(p0: String, p1: String, p2: Int, p3: Boolean, p4: Int, p5: String, p6: String, p7: String): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlCopyWrite(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlCopyWrite(p0: String, p1: String, p2: Int, p3: Boolean, p4: Int, p5: String, p6: String, p7: String): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlCreateSectionForDataScan(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlCreateSectionForDataScan(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: Int, p8: Int, p9: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlCurrentBatchOplock(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlCurrentBatchOplock(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlCurrentOplock(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlCurrentOplock(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlCurrentOplockH(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlCurrentOplockH(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlDeleteExtraCreateParameterLookasideList(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlDeleteExtraCreateParameterLookasideList(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlDeleteKeyFromTunnelCache(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlDeleteKeyFromTunnelCache(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlDeleteTunnelCache(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlDeleteTunnelCache(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlDeregisterUncProvider(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlDeregisterUncProvider(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlDismountComplete(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlDismountComplete(p0: String, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlDoesDbcsContainWildCards(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlDoesDbcsContainWildCards(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlDoesNameContainWildCards(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlDoesNameContainWildCards(p0: String): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlFastCheckLockForRead(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlFastCheckLockForRead(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlFastCheckLockForWrite(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlFastCheckLockForWrite(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlFastUnlockAll(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlFastUnlockAll(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlFastUnlockAllByKey(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlFastUnlockAllByKey(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlFastUnlockSingle(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlFastUnlockSingle(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String, p7: Boolean): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlFindExtraCreateParameter(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlFindExtraCreateParameter(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlFindInTunnelCache(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlFindInTunnelCache(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlFindInTunnelCacheEx(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlFindInTunnelCacheEx(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String, p7: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlFreeAePushLock(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlFreeAePushLock(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlFreeExtraCreateParameter(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlFreeExtraCreateParameter(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlFreeExtraCreateParameterList(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlFreeExtraCreateParameterList(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlFreeFileLock(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlFreeFileLock(p0: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlGetCurrentProcessLoaderList()")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlGetCurrentProcessLoaderList(): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlGetEcpListFromIrp(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlGetEcpListFromIrp(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlGetFileSize(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlGetFileSize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlGetNextBaseMcbEntry(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlGetNextBaseMcbEntry(p0: String, p1: Int, p2: String, p3: String, p4: String): Boolean

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlGetNextExtraCreateParameter(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlGetNextExtraCreateParameter(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlGetNextFileLock(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlGetNextFileLock(p0: String, p1: Boolean): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlGetNextLargeMcbEntry(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlGetNextLargeMcbEntry(p0: String, p1: Int, p2: String, p3: String, p4: String): Boolean

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlGetNextMcbEntry(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlGetNextMcbEntry(p0: String, p1: Int, p2: String, p3: String, p4: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlGetSectorSizeInformation(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlGetSectorSizeInformation(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlGetSupportedFeatures(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlGetSupportedFeatures(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlGetVirtualDiskNestingLevel(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlGetVirtualDiskNestingLevel(p0: String, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlIncrementCcFastMdlReadWait()")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlIncrementCcFastMdlReadWait()

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlIncrementCcFastReadNoWait()")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlIncrementCcFastReadNoWait()

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlIncrementCcFastReadNotPossible()")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlIncrementCcFastReadNotPossible()

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlIncrementCcFastReadResourceMiss()")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlIncrementCcFastReadResourceMiss()

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlIncrementCcFastReadWait()")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlIncrementCcFastReadWait()

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlInitExtraCreateParameterLookasideList(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlInitExtraCreateParameterLookasideList(p0: String, p1: Int, p2: String, p3: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlInitializeBaseMcb(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlInitializeBaseMcb(p0: String, p1: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlInitializeBaseMcbEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlInitializeBaseMcbEx(p0: String, p1: Int, p2: Int): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlInitializeExtraCreateParameter(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlInitializeExtraCreateParameter(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlInitializeExtraCreateParameterList(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlInitializeExtraCreateParameterList(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlInitializeFileLock(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlInitializeFileLock(p0: String, p1: String, p2: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlInitializeLargeMcb(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlInitializeLargeMcb(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlInitializeMcb(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlInitializeMcb(p0: String, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlInitializeOplock(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlInitializeOplock(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlInitializeTunnelCache(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlInitializeTunnelCache(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlInsertExtraCreateParameter(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlInsertExtraCreateParameter(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlInsertPerFileContext(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlInsertPerFileContext(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlInsertPerFileObjectContext(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlInsertPerFileObjectContext(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlInsertPerStreamContext(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlInsertPerStreamContext(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlIs32BitProcess(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlIs32BitProcess(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlIsDaxVolume(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlIsDaxVolume(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlIsDbcsInExpression(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlIsDbcsInExpression(p0: String, p1: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlIsEcpAcknowledged(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlIsEcpAcknowledged(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlIsEcpFromUserMode(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlIsEcpFromUserMode(p0: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlIsExtentDangling(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlIsExtentDangling(p0: Int, p1: Int, p2: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlIsMobileOS()")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlIsMobileOS(): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlIsNameInExpression(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlIsNameInExpression(p0: String, p1: String, p2: Boolean, p3: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlIsNameInUnUpcasedExpression(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlIsNameInUnUpcasedExpression(p0: String, p1: String, p2: Boolean, p3: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlIsNonEmptyDirectoryReparsePointAllowed(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlIsNonEmptyDirectoryReparsePointAllowed(p0: Int): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlIsNtstatusExpected(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlIsNtstatusExpected(p0: Int): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlIsPagingFile(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlIsPagingFile(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlIsSystemPagingFile(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlIsSystemPagingFile(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlIssueDeviceIoControl(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlIssueDeviceIoControl(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlKernelFsControlFile(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlKernelFsControlFile(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlLogCcFlushError(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlLogCcFlushError(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlLookupBaseMcbEntry(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlLookupBaseMcbEntry(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlLookupLargeMcbEntry(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlLookupLargeMcbEntry(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlLookupLastBaseMcbEntry(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlLookupLastBaseMcbEntry(p0: String, p1: String, p2: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlLookupLastBaseMcbEntryAndIndex(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlLookupLastBaseMcbEntryAndIndex(p0: String, p1: String, p2: String, p3: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlLookupLastLargeMcbEntry(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlLookupLastLargeMcbEntry(p0: String, p1: String, p2: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlLookupLastLargeMcbEntryAndIndex(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlLookupLastLargeMcbEntryAndIndex(p0: String, p1: String, p2: String, p3: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlLookupLastMcbEntry(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlLookupLastMcbEntry(p0: String, p1: String, p2: String): Boolean

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlLookupMcbEntry(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlLookupMcbEntry(p0: String, p1: Int, p2: String, p3: String, p4: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlLookupPerFileContext(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlLookupPerFileContext(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlLookupPerFileObjectContext(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlLookupPerFileObjectContext(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlLookupPerStreamContextInternal(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlLookupPerStreamContextInternal(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlMdlReadCompleteDev(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlMdlReadCompleteDev(p0: String, p1: String, p2: String): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlMdlReadDev(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlMdlReadDev(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlMdlReadEx(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlMdlReadEx(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlMdlWriteCompleteDev(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlMdlWriteCompleteDev(p0: String, p1: String, p2: String, p3: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlMupGetProviderIdFromName(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlMupGetProviderIdFromName(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlMupGetProviderInfoFromFileObject(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlMupGetProviderInfoFromFileObject(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlNormalizeNtstatus(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlNormalizeNtstatus(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlNotifyCleanup(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlNotifyCleanup(p0: String, p1: String, p2: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlNotifyCleanupAll(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlNotifyCleanupAll(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlNotifyFilterChangeDirectory(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlNotifyFilterChangeDirectory(p0: String, p1: String, p2: String, p3: String, p4: Boolean, p5: Boolean, p6: Int, p7: String, p8: String, p9: String, p10: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlNotifyFilterReportChange(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlNotifyFilterReportChange(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: Int, p7: Int, p8: String, p9: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlNotifyFullChangeDirectory(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlNotifyFullChangeDirectory(p0: String, p1: String, p2: String, p3: String, p4: Boolean, p5: Boolean, p6: Int, p7: String, p8: String, p9: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlNotifyFullReportChange(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlNotifyFullReportChange(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: Int, p7: Int, p8: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlNotifyInitializeSync(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlNotifyInitializeSync(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlNotifyUninitializeSync(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlNotifyUninitializeSync(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlNotifyVolumeEvent(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlNotifyVolumeEvent(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlNotifyVolumeEventEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlNotifyVolumeEventEx(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlNumberOfRunsInBaseMcb(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlNumberOfRunsInBaseMcb(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlNumberOfRunsInLargeMcb(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlNumberOfRunsInLargeMcb(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlNumberOfRunsInMcb(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlNumberOfRunsInMcb(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlOplockBreakH(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlOplockBreakH(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlOplockBreakH2(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlOplockBreakH2(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlOplockBreakToNone(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlOplockBreakToNone(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlOplockBreakToNoneEx(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlOplockBreakToNoneEx(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlOplockFsctrl(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlOplockFsctrl(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlOplockFsctrlEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlOplockFsctrlEx(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlOplockGetAnyBreakOwnerProcess(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlOplockGetAnyBreakOwnerProcess(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlOplockIsFastIoPossible(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlOplockIsFastIoPossible(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlOplockIsSharedRequest(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlOplockIsSharedRequest(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlOplockKeysEqual(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlOplockKeysEqual(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlPostPagingFileStackOverflow(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlPostPagingFileStackOverflow(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlPostStackOverflow(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlPostStackOverflow(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlPrepareMdlWriteDev(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlPrepareMdlWriteDev(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlPrepareMdlWriteEx(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlPrepareMdlWriteEx(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlPrepareToReuseEcp(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlPrepareToReuseEcp(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlPrivateLock(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlPrivateLock(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: Boolean, p7: Boolean, p8: String, p9: String, p10: String, p11: Boolean): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlProcessFileLock(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlProcessFileLock(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlQueryCachedVdl(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlQueryCachedVdl(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlQueryInformationFile(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlQueryInformationFile(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlQueryKernelEaFile(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlQueryKernelEaFile(p0: String, p1: String, p2: Int, p3: Boolean, p4: String, p5: Int, p6: String, p7: Boolean, p8: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlQueryMaximumVirtualDiskNestingLevel()")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlQueryMaximumVirtualDiskNestingLevel(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlRegisterFileSystemFilterCallbacks(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlRegisterFileSystemFilterCallbacks(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlRegisterUncProvider(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlRegisterUncProvider(p0: String, p1: String, p2: Boolean): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlRegisterUncProviderEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlRegisterUncProviderEx(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlRegisterUncProviderEx2(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlRegisterUncProviderEx2(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlReleaseFile(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlReleaseFile(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlRemoveBaseMcbEntry(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlRemoveBaseMcbEntry(p0: String, p1: String, p2: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlRemoveDotsFromPath(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlRemoveDotsFromPath(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlRemoveExtraCreateParameter(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlRemoveExtraCreateParameter(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlRemoveLargeMcbEntry(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlRemoveLargeMcbEntry(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlRemoveMcbEntry(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlRemoveMcbEntry(p0: String, p1: Int, p2: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlRemovePerFileContext(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlRemovePerFileContext(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlRemovePerFileObjectContext(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlRemovePerFileObjectContext(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlRemovePerStreamContext(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlRemovePerStreamContext(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlResetBaseMcb(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlResetBaseMcb(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlResetLargeMcb(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlResetLargeMcb(p0: String, p1: Boolean)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlSetDriverBacking(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlSetDriverBacking(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlSetEcpListIntoIrp(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlSetEcpListIntoIrp(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlSetKernelEaFile(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlSetKernelEaFile(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlSplitBaseMcb(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlSplitBaseMcb(p0: String, p1: String, p2: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlSplitLargeMcb(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlSplitLargeMcb(p0: String, p1: String, p2: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlTeardownPerFileContexts(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlTeardownPerFileContexts(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlTeardownPerStreamContexts(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlTeardownPerStreamContexts(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlTruncateBaseMcb(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlTruncateBaseMcb(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlTruncateLargeMcb(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlTruncateLargeMcb(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlTruncateMcb(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlTruncateMcb(p0: String, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlUninitializeBaseMcb(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlUninitializeBaseMcb(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlUninitializeFileLock(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlUninitializeFileLock(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlUninitializeLargeMcb(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlUninitializeLargeMcb(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlUninitializeMcb(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlUninitializeMcb(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlUninitializeOplock(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlUninitializeOplock(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlUpdateDiskCounters(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlUpdateDiskCounters(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlUpperOplockFsctrl(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlUpperOplockFsctrl(p0: String, p1: String, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlValidateReparsePointBuffer(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlValidateReparsePointBuffer(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_fsRtlVolumeDeviceToCorrelationId(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlVolumeDeviceToCorrelationId(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_getSecurityUserInfo(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_getSecurityUserInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioAcquireVpbSpinLock(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioAcquireVpbSpinLock(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioApplyPriorityInfoThread(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioApplyPriorityInfoThread(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioCheckDesiredAccess(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioCheckDesiredAccess(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioCheckEaBufferValidity(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioCheckEaBufferValidity(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioCheckFunctionAccess(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioCheckFunctionAccess(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioCheckQuerySetFileInformation(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioCheckQuerySetFileInformation(p0: Int, p1: Int, p2: Boolean): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioCheckQuerySetVolumeInformation(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioCheckQuerySetVolumeInformation(p0: Int, p1: Int, p2: Boolean): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioCheckQuotaBufferValidity(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioCheckQuotaBufferValidity(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioClearFsTrackOffsetState(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioClearFsTrackOffsetState(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioCreateStreamFileObject(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioCreateStreamFileObject(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioCreateStreamFileObjectEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioCreateStreamFileObjectEx(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioCreateStreamFileObjectEx2(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioCreateStreamFileObjectEx2(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioCreateStreamFileObjectLite(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioCreateStreamFileObjectLite(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioEnumerateDeviceObjectList(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioEnumerateDeviceObjectList(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioEnumerateRegisteredFiltersList(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioEnumerateRegisteredFiltersList(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioFastQueryNetworkAttributes(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioFastQueryNetworkAttributes(p0: String, p1: Int, p2: Int, p3: String, p4: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioGetAttachedDevice(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioGetAttachedDevice(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioGetBaseFileSystemDeviceObject(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioGetBaseFileSystemDeviceObject(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioGetDeviceAttachmentBaseRef(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioGetDeviceAttachmentBaseRef(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioGetDeviceToVerify(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioGetDeviceToVerify(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioGetDiskDeviceObject(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioGetDiskDeviceObject(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioGetFsTrackOffsetState(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioGetFsTrackOffsetState(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioGetLowerDeviceObject(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioGetLowerDeviceObject(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioGetOplockKeyContext(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioGetOplockKeyContext(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioGetOplockKeyContextEx(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioGetOplockKeyContextEx(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioGetRequestorProcess(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioGetRequestorProcess(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioGetRequestorProcessId(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioGetRequestorProcessId(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioGetRequestorSessionId(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioGetRequestorSessionId(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioIrpHasFsTrackOffsetExtensionType(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioIrpHasFsTrackOffsetExtensionType(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioIsOperationSynchronous(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioIsOperationSynchronous(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioIsSystemThread(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioIsSystemThread(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioIsValidNameGraftingBuffer(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioIsValidNameGraftingBuffer(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioPageRead(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioPageRead(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioQueryFileDosDeviceName(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioQueryFileDosDeviceName(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioQueryFileInformation(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioQueryFileInformation(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioQueryVolumeInformation(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioQueryVolumeInformation(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioQueueThreadIrp(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioQueueThreadIrp(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioRegisterFileSystem(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioRegisterFileSystem(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioReleaseVpbSpinLock(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioReleaseVpbSpinLock(p0: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioReplaceFileObjectName(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioReplaceFileObjectName(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioRequestDeviceRemovalForReset(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioRequestDeviceRemovalForReset(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioRetrievePriorityInfo(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioRetrievePriorityInfo(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioSetDeviceToVerify(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioSetDeviceToVerify(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioSetFsTrackOffsetState(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioSetFsTrackOffsetState(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioSetInformation(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioSetInformation(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioSynchronousPageWrite(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioSynchronousPageWrite(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioThreadToProcess(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioThreadToProcess(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioUnregisterFileSystem(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioUnregisterFileSystem(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ioVerifyVolume(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ioVerifyVolume(p0: String, p1: Boolean): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_keAcquireQueuedSpinLock(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_keAcquireQueuedSpinLock(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_keAcquireSpinLockRaiseToSynch(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_keAcquireSpinLockRaiseToSynch(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_keAttachProcess(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_keAttachProcess(p0: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_keDetachProcess()")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_keDetachProcess()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_keInitializeMutant(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_keInitializeMutant(p0: String, p1: Boolean)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_keInitializeQueue(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_keInitializeQueue(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_keInsertHeadQueue(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_keInsertHeadQueue(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_keInsertQueue(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_keInsertQueue(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_keReadStateMutant(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_keReadStateMutant(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_keReadStateQueue(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_keReadStateQueue(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_keReleaseMutant(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_keReleaseMutant(p0: String, p1: Int, p2: Boolean, p3: Boolean): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_keReleaseQueuedSpinLock(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_keReleaseQueuedSpinLock(p0: Int, p1: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_keRemoveQueue(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_keRemoveQueue(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_keRemoveQueueEx(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_keRemoveQueueEx(p0: String, p1: Int, p2: Boolean, p3: String, p4: String, p5: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_keRundownQueue(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_keRundownQueue(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_keSetIdealProcessorThread(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_keSetIdealProcessorThread(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_keSetKernelStackSwapEnable(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_keSetKernelStackSwapEnable(p0: Boolean): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_keStackAttachProcess(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_keStackAttachProcess(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_keTryToAcquireQueuedSpinLock(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_keTryToAcquireQueuedSpinLock(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_keUnstackDetachProcess(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_keUnstackDetachProcess(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_makeSignature(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_makeSignature(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_mapSecurityError(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_mapSecurityError(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_mmCanFileBeTruncated(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_mmCanFileBeTruncated(p0: String, p1: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_mmDoesFileHaveUserWritableReferences(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_mmDoesFileHaveUserWritableReferences(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_mmFlushImageSection(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_mmFlushImageSection(p0: String, p1: Int): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_mmForceSectionClosed(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_mmForceSectionClosed(p0: String, p1: Boolean): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_mmForceSectionClosedEx(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_mmForceSectionClosedEx(p0: String, p1: Int): Boolean

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_mmGetMaximumFileSectionSize()")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_mmGetMaximumFileSectionSize(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_mmIsFileSectionActive(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_mmIsFileSectionActive(p0: String, p1: Int, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_mmIsRecursiveIoFault()")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_mmIsRecursiveIoFault(): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_mmMdlPagesAreZero(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_mmMdlPagesAreZero(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_mmPrefetchPages(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_mmPrefetchPages(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_mmSetAddressRangeModified(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_mmSetAddressRangeModified(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntAccessCheckAndAuditAlarm(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntAccessCheckAndAuditAlarm(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String, p7: Boolean, p8: String, p9: String, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntAccessCheckByTypeAndAuditAlarm(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntAccessCheckByTypeAndAuditAlarm(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: Int, p8: Int, p9: String, p10: Int, p11: String, p12: Boolean, p13: String, p14: String, p15: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntAccessCheckByTypeResultListAndAuditAlarm(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntAccessCheckByTypeResultListAndAuditAlarm(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: Int, p8: Int, p9: String, p10: Int, p11: String, p12: Boolean, p13: String, p14: String, p15: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntAccessCheckByTypeResultListAndAuditAlarmByHandle(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntAccessCheckByTypeResultListAndAuditAlarmByHandle(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int, p8: Int, p9: Int, p10: String, p11: Int, p12: String, p13: Boolean, p14: String, p15: String, p16: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntAdjustGroupsToken(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntAdjustGroupsToken(p0: String, p1: Boolean, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntAdjustPrivilegesToken(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntAdjustPrivilegesToken(p0: String, p1: Boolean, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntAllocateVirtualMemory(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntAllocateVirtualMemory(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntAllocateVirtualMemoryEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntAllocateVirtualMemoryEx(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntCancelIoFileEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntCancelIoFileEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntCloseObjectAuditAlarm(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntCloseObjectAuditAlarm(p0: String, p1: String, p2: Boolean): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntCreateDirectoryObject(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntCreateDirectoryObject(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntCreateEvent(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntCreateEvent(p0: String, p1: Int, p2: String, p3: Int, p4: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntCreateFile(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntCreateFile(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: Int, p7: Int, p8: Int, p9: String, p10: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntCreateSection(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntCreateSection(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntCreateSectionEx(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntCreateSectionEx(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: Int, p6: String, p7: String, p8: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntDeleteFile(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntDeleteFile(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntDeleteObjectAuditAlarm(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntDeleteObjectAuditAlarm(p0: String, p1: String, p2: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntDuplicateObject(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntDuplicateObject(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntDuplicateToken(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntDuplicateToken(p0: String, p1: Int, p2: String, p3: Boolean, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntFilterToken(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntFilterToken(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntFlushBuffersFile(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntFlushBuffersFile(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntFlushBuffersFileEx(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntFlushBuffersFileEx(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntFlushVirtualMemory(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntFlushVirtualMemory(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntFreeVirtualMemory(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntFreeVirtualMemory(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntFsControlFile(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntFsControlFile(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String, p7: Int, p8: String, p9: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntImpersonateAnonymousToken(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntImpersonateAnonymousToken(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntLockFile(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntLockFile(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int, p8: Boolean, p9: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntNotifyChangeKey(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntNotifyChangeKey(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: Boolean, p7: String, p8: Int, p9: Boolean): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntOpenDirectoryObject(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntOpenDirectoryObject(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntOpenFile(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntOpenFile(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntOpenObjectAuditAlarm(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntOpenObjectAuditAlarm(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: Int, p8: String, p9: Boolean, p10: Boolean, p11: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntOpenProcessToken(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntOpenProcessToken(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntOpenProcessTokenEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntOpenProcessTokenEx(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntOpenSymbolicLinkObject(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntOpenSymbolicLinkObject(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntOpenThreadToken(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntOpenThreadToken(p0: String, p1: Int, p2: Boolean, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntOpenThreadTokenEx(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntOpenThreadTokenEx(p0: String, p1: Int, p2: Boolean, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntPrivilegeCheck(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntPrivilegeCheck(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntPrivilegeObjectAuditAlarm(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntPrivilegeObjectAuditAlarm(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntPrivilegedServiceAuditAlarm(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntPrivilegedServiceAuditAlarm(p0: String, p1: String, p2: String, p3: String, p4: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntQueryDirectoryFile(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntQueryDirectoryFile(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: Int, p8: Boolean, p9: String, p10: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntQueryDirectoryFileEx(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntQueryDirectoryFileEx(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: Int, p8: Int, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntQueryDirectoryObject(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntQueryDirectoryObject(p0: String, p1: String, p2: Int, p3: Boolean, p4: Boolean, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntQueryEaFile(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntQueryEaFile(p0: String, p1: String, p2: String, p3: Int, p4: Boolean, p5: String, p6: Int, p7: String, p8: Boolean): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntQueryFullAttributesFile(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntQueryFullAttributesFile(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntQueryInformationByName(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntQueryInformationByName(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntQueryInformationFile(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntQueryInformationFile(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntQueryInformationToken(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntQueryInformationToken(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntQueryQuotaInformationFile(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntQueryQuotaInformationFile(p0: String, p1: String, p2: String, p3: Int, p4: Boolean, p5: String, p6: Int, p7: String, p8: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntQuerySecurityObject(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntQuerySecurityObject(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntQuerySymbolicLinkObject(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntQuerySymbolicLinkObject(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntQueryVirtualMemory(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntQueryVirtualMemory(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntQueryVolumeInformationFile(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntQueryVolumeInformationFile(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntReadFile(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntReadFile(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntSetEaFile(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntSetEaFile(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntSetEvent(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntSetEvent(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntSetInformationFile(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntSetInformationFile(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntSetInformationToken(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntSetInformationToken(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntSetInformationVirtualMemory(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntSetInformationVirtualMemory(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntSetQuotaInformationFile(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntSetQuotaInformationFile(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntSetSecurityObject(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntSetSecurityObject(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntSetVolumeInformationFile(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntSetVolumeInformationFile(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntUnlockFile(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntUnlockFile(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_ntWriteFile(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_ntWriteFile(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_obInsertObject(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_obInsertObject(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_obIsKernelHandle(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_obIsKernelHandle(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_obMakeTemporaryObject(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_obMakeTemporaryObject(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_obOpenObjectByPointer(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_obOpenObjectByPointer(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_obOpenObjectByPointerWithTag(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_obOpenObjectByPointerWithTag(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_obQueryNameString(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_obQueryNameString(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_obQueryObjectAuditingByHandle(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_obQueryObjectAuditingByHandle(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_pfxFindPrefix(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_pfxFindPrefix(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_pfxInitialize(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_pfxInitialize(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_pfxInsertPrefix(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_pfxInsertPrefix(p0: String, p1: String, p2: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_pfxRemovePrefix(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_pfxRemovePrefix(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_poQueueShutdownWorkItem(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_poQueueShutdownWorkItem(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_psAssignImpersonationToken(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_psAssignImpersonationToken(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_psChargePoolQuota(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_psChargePoolQuota(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_psChargeProcessPoolQuota(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_psChargeProcessPoolQuota(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_psDereferenceImpersonationToken(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_psDereferenceImpersonationToken(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_psDereferencePrimaryToken(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_psDereferencePrimaryToken(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_psDisableImpersonation(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_psDisableImpersonation(p0: String, p1: String): Boolean

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_psGetProcessExitTime()")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_psGetProcessExitTime(): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_psGetThreadProcess(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_psGetThreadProcess(p0: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_psImpersonateClient(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_psImpersonateClient(p0: String, p1: String, p2: Boolean, p3: Boolean, p4: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_psIsDiskCountersEnabled()")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_psIsDiskCountersEnabled(): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_psIsSystemThread(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_psIsSystemThread(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_psIsThreadTerminating(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_psIsThreadTerminating(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_psLookupProcessByProcessId(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_psLookupProcessByProcessId(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_psLookupThreadByThreadId(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_psLookupThreadByThreadId(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_psReferenceImpersonationToken(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_psReferenceImpersonationToken(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_psReferencePrimaryToken(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_psReferencePrimaryToken(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_psRestoreImpersonation(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_psRestoreImpersonation(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_psReturnPoolQuota(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_psReturnPoolQuota(p0: String, p1: Int, p2: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_psRevertToSelf()")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_psRevertToSelf()

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_psUpdateDiskCounters(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_psUpdateDiskCounters(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_querySecurityContextToken(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_querySecurityContextToken(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlAbsoluteToSelfRelativeSD(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlAbsoluteToSelfRelativeSD(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlAddAccessAllowedAce(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlAddAccessAllowedAce(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlAddAccessAllowedAceEx(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlAddAccessAllowedAceEx(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlAddAce(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlAddAce(p0: String, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlAllocateAndInitializeSid(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlAllocateAndInitializeSid(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int, p8: Int, p9: Int, p10: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlAllocateAndInitializeSidEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlAllocateAndInitializeSidEx(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlAllocateHeap(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlAllocateHeap(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlAppendStringToString(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlAppendStringToString(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlCompareAltitudes(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlCompareAltitudes(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlCompareMemoryUlong(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlCompareMemoryUlong(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlCompressBuffer(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlCompressBuffer(p0: Int, p1: String, p2: Int, p3: String, p4: Int, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlCompressChunks(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlCompressChunks(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlCopyLuid(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlCopyLuid(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlCopySid(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlCopySid(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlCreateAcl(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlCreateAcl(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlCreateHeap(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlCreateHeap(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlCreateServiceSid(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlCreateServiceSid(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlCreateSystemVolumeInformationFolder(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlCreateSystemVolumeInformationFolder(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlCreateUnicodeString(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlCreateUnicodeString(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlCreateVirtualAccountSid(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlCreateVirtualAccountSid(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlCustomCPToUnicodeN(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlCustomCPToUnicodeN(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlDecompressBuffer(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlDecompressBuffer(p0: Int, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlDecompressBufferEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlDecompressBufferEx(p0: Int, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlDecompressBufferEx2(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlDecompressBufferEx2(p0: Int, p1: String, p2: Int, p3: String, p4: Int, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlDecompressChunks(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlDecompressChunks(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlDecompressFragment(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlDecompressFragment(p0: Int, p1: String, p2: Int, p3: String, p4: Int, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlDecompressFragmentEx(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlDecompressFragmentEx(p0: Int, p1: String, p2: Int, p3: String, p4: Int, p5: Int, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlDeleteAce(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlDeleteAce(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlDescribeChunk(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlDescribeChunk(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlDestroyHeap(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlDestroyHeap(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlDosPathNameToNtPathNameUWithStatus(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlDosPathNameToNtPathNameUWithStatus(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlDowncaseUnicodeString(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlDowncaseUnicodeString(p0: String, p1: String, p2: Boolean): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlDuplicateUnicodeString(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlDuplicateUnicodeString(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlEqualPrefixSid(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlEqualPrefixSid(p0: String, p1: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlEqualSid(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlEqualSid(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlFindUnicodePrefix(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlFindUnicodePrefix(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlFreeHeap(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlFreeHeap(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlFreeSid(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlFreeSid(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlGenerate8dot3Name(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlGenerate8dot3Name(p0: String, p1: Boolean, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlGetAce(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlGetAce(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlGetCompressionWorkSpaceSize(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlGetCompressionWorkSpaceSize(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlGetDaclSecurityDescriptor(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlGetDaclSecurityDescriptor(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlGetGroupSecurityDescriptor(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlGetGroupSecurityDescriptor(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlGetOwnerSecurityDescriptor(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlGetOwnerSecurityDescriptor(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlGetSaclSecurityDescriptor(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlGetSaclSecurityDescriptor(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlIdentifierAuthoritySid(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlIdentifierAuthoritySid(p0: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlIdnToAscii(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlIdnToAscii(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlIdnToNameprepUnicode(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlIdnToNameprepUnicode(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlIdnToUnicode(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlIdnToUnicode(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlInitCodePageTable(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlInitCodePageTable(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlInitUnicodeStringEx(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlInitUnicodeStringEx(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlInitializeSid(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlInitializeSid(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlInitializeSidEx(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlInitializeSidEx(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlInitializeUnicodePrefix(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlInitializeUnicodePrefix(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlInsertUnicodePrefix(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlInsertUnicodePrefix(p0: String, p1: String, p2: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlIsCloudFilesPlaceholder(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlIsCloudFilesPlaceholder(p0: Int, p1: Int): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlIsDosDeviceNameU(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlIsDosDeviceNameU(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlIsNonEmptyDirectoryReparsePointAllowed(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlIsNonEmptyDirectoryReparsePointAllowed(p0: Int): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlIsNormalizedString(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlIsNormalizedString(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlIsPartialPlaceholder(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlIsPartialPlaceholder(p0: Int, p1: Int): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlIsPartialPlaceholderFileHandle(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlIsPartialPlaceholderFileHandle(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlIsPartialPlaceholderFileInfo(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlIsPartialPlaceholderFileInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlIsSandboxedToken(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlIsSandboxedToken(p0: String, p1: Int): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlIsValidOemCharacter(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlIsValidOemCharacter(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlLengthRequiredSid(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlLengthRequiredSid(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlLengthSid(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlLengthSid(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlMultiByteToUnicodeN(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlMultiByteToUnicodeN(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlMultiByteToUnicodeSize(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlMultiByteToUnicodeSize(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlNextUnicodePrefix(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlNextUnicodePrefix(p0: String, p1: Boolean): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlNormalizeString(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlNormalizeString(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlNtStatusToDosErrorNoTeb(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlNtStatusToDosErrorNoTeb(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlOemStringToCountedUnicodeString(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlOemStringToCountedUnicodeString(p0: String, p1: String, p2: Boolean): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlOemStringToUnicodeString(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlOemStringToUnicodeString(p0: String, p1: String, p2: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlOemToUnicodeN(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlOemToUnicodeN(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlPrefixString(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlPrefixString(p0: String, p1: String, p2: Boolean): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlQueryPackageIdentity(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlQueryPackageIdentity(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlQueryPackageIdentityEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlQueryPackageIdentityEx(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlQueryProcessPlaceholderCompatibilityMode()")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlQueryProcessPlaceholderCompatibilityMode(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlQueryThreadPlaceholderCompatibilityMode()")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlQueryThreadPlaceholderCompatibilityMode(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlRandom(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlRandom(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlRandomEx(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlRandomEx(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlRemoveUnicodePrefix(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlRemoveUnicodePrefix(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlReplaceSidInSd(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlReplaceSidInSd(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlReserveChunk(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlReserveChunk(p0: Int, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlSecondsSince1970ToTime(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlSecondsSince1970ToTime(p0: Int, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlSecondsSince1980ToTime(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlSecondsSince1980ToTime(p0: Int, p1: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlSelfRelativeToAbsoluteSD(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlSelfRelativeToAbsoluteSD(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String, p10: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlSetGroupSecurityDescriptor(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlSetGroupSecurityDescriptor(p0: String, p1: String, p2: Boolean): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlSetOwnerSecurityDescriptor(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlSetOwnerSecurityDescriptor(p0: String, p1: String, p2: Boolean): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlSetProcessPlaceholderCompatibilityMode(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlSetProcessPlaceholderCompatibilityMode(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlSetThreadPlaceholderCompatibilityMode(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlSetThreadPlaceholderCompatibilityMode(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlSubAuthorityCountSid(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlSubAuthorityCountSid(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlSubAuthoritySid(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlSubAuthoritySid(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlTimeToSecondsSince1980(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlTimeToSecondsSince1980(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlUnicodeStringToCountedOemString(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlUnicodeStringToCountedOemString(p0: String, p1: String, p2: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlUnicodeToCustomCPN(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlUnicodeToCustomCPN(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlUnicodeToMultiByteN(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlUnicodeToMultiByteN(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlUnicodeToOemN(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlUnicodeToOemN(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlUpcaseUnicodeStringToCountedOemString(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlUpcaseUnicodeStringToCountedOemString(p0: String, p1: String, p2: Boolean): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlUpcaseUnicodeStringToOemString(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlUpcaseUnicodeStringToOemString(p0: String, p1: String, p2: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlUpcaseUnicodeToCustomCPN(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlUpcaseUnicodeToCustomCPN(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlUpcaseUnicodeToMultiByteN(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlUpcaseUnicodeToMultiByteN(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlUpcaseUnicodeToOemN(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlUpcaseUnicodeToOemN(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlValidSid(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlValidSid(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlValidateUnicodeString(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlValidateUnicodeString(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlxOemStringToUnicodeSize(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlxOemStringToUnicodeSize(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_rtlxUnicodeStringToOemSize(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_rtlxUnicodeStringToOemSize(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seAccessCheckFromState(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seAccessCheckFromState(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: String, p7: Int, p8: String, p9: String): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seAccessCheckFromStateEx(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seAccessCheckFromStateEx(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: String, p7: Int, p8: String, p9: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seAdjustAccessStateForAccessConstraints(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seAdjustAccessStateForAccessConstraints(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seAdjustAccessStateForTrustLabel(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seAdjustAccessStateForTrustLabel(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seAdjustObjectSecurity(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seAdjustObjectSecurity(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seAppendPrivileges(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seAppendPrivileges(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seAuditFipsCryptoSelftests(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seAuditFipsCryptoSelftests(p0: Boolean, p1: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seAuditHardLinkCreation(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seAuditHardLinkCreation(p0: String, p1: String, p2: Boolean)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seAuditHardLinkCreationWithTransaction(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seAuditHardLinkCreationWithTransaction(p0: String, p1: String, p2: Boolean, p3: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seAuditTransactionStateChange(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seAuditTransactionStateChange(p0: String, p1: String, p2: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seAuditingAnyFileEventsWithContext(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seAuditingAnyFileEventsWithContext(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seAuditingAnyFileEventsWithContextEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seAuditingAnyFileEventsWithContextEx(p0: String, p1: String, p2: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seAuditingFileEvents(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seAuditingFileEvents(p0: Boolean, p1: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seAuditingFileEventsWithContext(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seAuditingFileEventsWithContext(p0: Boolean, p1: String, p2: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seAuditingFileEventsWithContextEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seAuditingFileEventsWithContextEx(p0: Boolean, p1: String, p2: String, p3: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seAuditingFileOrGlobalEvents(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seAuditingFileOrGlobalEvents(p0: Boolean, p1: String, p2: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seAuditingHardLinkEvents(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seAuditingHardLinkEvents(p0: Boolean, p1: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seAuditingHardLinkEventsWithContext(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seAuditingHardLinkEventsWithContext(p0: Boolean, p1: String, p2: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seCaptureSubjectContextEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seCaptureSubjectContextEx(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seCheckForCriticalAceRemoval(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seCheckForCriticalAceRemoval(p0: String, p1: String, p2: String, p3: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seCreateClientSecurity(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seCreateClientSecurity(p0: String, p1: String, p2: Boolean, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seCreateClientSecurityFromSubjectContext(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seCreateClientSecurityFromSubjectContext(p0: String, p1: String, p2: Boolean, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seDeleteClientSecurity(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seDeleteClientSecurity(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seDeleteObjectAuditAlarm(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seDeleteObjectAuditAlarm(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seDeleteObjectAuditAlarmWithTransaction(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seDeleteObjectAuditAlarmWithTransaction(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seExamineSacl(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seExamineSacl(p0: String, p1: String, p2: String, p3: Int, p4: Boolean, p5: String, p6: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seFilterToken(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seFilterToken(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seFreePrivileges(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seFreePrivileges(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seImpersonateClient(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seImpersonateClient(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seImpersonateClientEx(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seImpersonateClientEx(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seLocateProcessImageName(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seLocateProcessImageName(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seMarkLogonSessionForTerminationNotification(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seMarkLogonSessionForTerminationNotification(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seMarkLogonSessionForTerminationNotificationEx(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seMarkLogonSessionForTerminationNotificationEx(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seOpenObjectAuditAlarm(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seOpenObjectAuditAlarm(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Boolean, p6: Boolean, p7: Int, p8: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seOpenObjectAuditAlarmWithTransaction(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seOpenObjectAuditAlarmWithTransaction(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Boolean, p6: Boolean, p7: Int, p8: String, p9: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seOpenObjectForDeleteAuditAlarm(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seOpenObjectForDeleteAuditAlarm(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Boolean, p6: Boolean, p7: Int, p8: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seOpenObjectForDeleteAuditAlarmWithTransaction(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seOpenObjectForDeleteAuditAlarmWithTransaction(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Boolean, p6: Boolean, p7: Int, p8: String, p9: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_sePrivilegeCheck(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_sePrivilegeCheck(p0: String, p1: String, p2: Int): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seQueryAuthenticationIdToken(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seQueryAuthenticationIdToken(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seQueryInformationToken(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seQueryInformationToken(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seQuerySecurityDescriptorInfo(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seQuerySecurityDescriptorInfo(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seQueryServerSiloToken(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seQueryServerSiloToken(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seQuerySessionIdToken(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seQuerySessionIdToken(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seQuerySessionIdTokenEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seQuerySessionIdTokenEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seRegisterLogonSessionTerminatedRoutine(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seRegisterLogonSessionTerminatedRoutine(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seRegisterLogonSessionTerminatedRoutineEx(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seRegisterLogonSessionTerminatedRoutineEx(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seReportSecurityEventWithSubCategory(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seReportSecurityEventWithSubCategory(p0: Int, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seSetAccessStateGenericMapping(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seSetAccessStateGenericMapping(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seSetSecurityDescriptorInfo(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seSetSecurityDescriptorInfo(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seSetSecurityDescriptorInfoEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seSetSecurityDescriptorInfoEx(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seShouldCheckForAccessRightsFromParent(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seShouldCheckForAccessRightsFromParent(p0: String, p1: String, p2: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seTokenFromAccessInformation(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seTokenFromAccessInformation(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seTokenIsAdmin(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seTokenIsAdmin(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seTokenIsRestricted(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seTokenIsRestricted(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seTokenIsWriteRestricted(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seTokenIsWriteRestricted(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seTokenType(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seTokenType(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seUnregisterLogonSessionTerminatedRoutine(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seUnregisterLogonSessionTerminatedRoutine(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_seUnregisterLogonSessionTerminatedRoutineEx(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_seUnregisterLogonSessionTerminatedRoutineEx(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_secLookupAccountName(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_secLookupAccountName(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_secLookupAccountSid(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_secLookupAccountSid(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_secLookupWellKnownSid(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_secLookupWellKnownSid(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_secMakeSPN(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_secMakeSPN(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_secMakeSPNEx(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_secMakeSPNEx(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String, p8: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_secMakeSPNEx2(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_secMakeSPNEx2(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String, p8: Boolean, p9: Boolean): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_setContextAttributesW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_setContextAttributesW(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_sspiAcceptSecurityContextAsync(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_sspiAcceptSecurityContextAsync(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_sspiCreateAsyncContext()")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_sspiCreateAsyncContext(): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_sspiDeleteSecurityContextAsync(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_sspiDeleteSecurityContextAsync(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_sspiFreeAsyncContext(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_sspiFreeAsyncContext(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_sspiFreeCredentialsHandleAsync(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_sspiFreeCredentialsHandleAsync(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_sspiGetAsyncCallStatus(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_sspiGetAsyncCallStatus(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_sspiInitializeSecurityContextAsyncA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_sspiInitializeSecurityContextAsyncA(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: Int, p7: String, p8: Int, p9: String, p10: String, p11: String, p12: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_sspiInitializeSecurityContextAsyncW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_sspiInitializeSecurityContextAsyncW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: Int, p7: String, p8: Int, p9: String, p10: String, p11: String, p12: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_sspiReinitAsyncContext(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_sspiReinitAsyncContext(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_sspiSetAsyncNotifyCallback(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_sspiSetAsyncNotifyCallback(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_verifySignature(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_verifySignature(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwAccessCheckAndAuditAlarm(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwAccessCheckAndAuditAlarm(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String, p7: Boolean, p8: String, p9: String, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwAccessCheckByTypeAndAuditAlarm(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwAccessCheckByTypeAndAuditAlarm(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: Int, p8: Int, p9: String, p10: Int, p11: String, p12: Boolean, p13: String, p14: String, p15: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwAccessCheckByTypeResultListAndAuditAlarm(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwAccessCheckByTypeResultListAndAuditAlarm(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: Int, p8: Int, p9: String, p10: Int, p11: String, p12: Boolean, p13: String, p14: String, p15: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwAccessCheckByTypeResultListAndAuditAlarmByHandle(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwAccessCheckByTypeResultListAndAuditAlarmByHandle(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int, p8: Int, p9: Int, p10: String, p11: Int, p12: String, p13: Boolean, p14: String, p15: String, p16: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwAdjustGroupsToken(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwAdjustGroupsToken(p0: String, p1: Boolean, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwAdjustPrivilegesToken(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwAdjustPrivilegesToken(p0: String, p1: Boolean, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwAllocateVirtualMemory(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwAllocateVirtualMemory(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwAllocateVirtualMemoryEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwAllocateVirtualMemoryEx(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwCancelIoFileEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwCancelIoFileEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwCloseObjectAuditAlarm(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwCloseObjectAuditAlarm(p0: String, p1: String, p2: Boolean): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwCreateDirectoryObject(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwCreateDirectoryObject(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwCreateEvent(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwCreateEvent(p0: String, p1: Int, p2: String, p3: Int, p4: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwCreateSectionEx(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwCreateSectionEx(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: Int, p6: String, p7: String, p8: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwDeleteFile(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwDeleteFile(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwDeleteObjectAuditAlarm(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwDeleteObjectAuditAlarm(p0: String, p1: String, p2: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwDuplicateObject(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwDuplicateObject(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwDuplicateToken(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwDuplicateToken(p0: String, p1: Int, p2: String, p3: Boolean, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwFilterToken(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwFilterToken(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwFlushBuffersFile(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwFlushBuffersFile(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwFlushBuffersFileEx(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwFlushBuffersFileEx(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwFlushVirtualMemory(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwFlushVirtualMemory(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwFreeVirtualMemory(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwFreeVirtualMemory(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwFsControlFile(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwFsControlFile(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String, p7: Int, p8: String, p9: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwImpersonateAnonymousToken(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwImpersonateAnonymousToken(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwLockFile(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwLockFile(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int, p8: Boolean, p9: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwNotifyChangeKey(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwNotifyChangeKey(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: Boolean, p7: String, p8: Int, p9: Boolean): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwOpenDirectoryObject(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwOpenDirectoryObject(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwOpenObjectAuditAlarm(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwOpenObjectAuditAlarm(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: Int, p8: String, p9: Boolean, p10: Boolean, p11: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwOpenProcessToken(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwOpenProcessToken(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwOpenProcessTokenEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwOpenProcessTokenEx(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwOpenThreadToken(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwOpenThreadToken(p0: String, p1: Int, p2: Boolean, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwOpenThreadTokenEx(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwOpenThreadTokenEx(p0: String, p1: Int, p2: Boolean, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwPrivilegeCheck(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwPrivilegeCheck(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwPrivilegeObjectAuditAlarm(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwPrivilegeObjectAuditAlarm(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwPrivilegedServiceAuditAlarm(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwPrivilegedServiceAuditAlarm(p0: String, p1: String, p2: String, p3: String, p4: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwQueryDirectoryFile(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwQueryDirectoryFile(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: Int, p8: Boolean, p9: String, p10: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwQueryDirectoryFileEx(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwQueryDirectoryFileEx(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: Int, p8: Int, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwQueryDirectoryObject(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwQueryDirectoryObject(p0: String, p1: String, p2: Int, p3: Boolean, p4: Boolean, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwQueryEaFile(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwQueryEaFile(p0: String, p1: String, p2: String, p3: Int, p4: Boolean, p5: String, p6: Int, p7: String, p8: Boolean): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwQueryFullAttributesFile(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwQueryFullAttributesFile(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwQueryInformationToken(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwQueryInformationToken(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwQueryObject(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwQueryObject(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwQueryQuotaInformationFile(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwQueryQuotaInformationFile(p0: String, p1: String, p2: String, p3: Int, p4: Boolean, p5: String, p6: Int, p7: String, p8: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwQuerySecurityObject(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwQuerySecurityObject(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwQueryVirtualMemory(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwQueryVirtualMemory(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwQueryVolumeInformationFile(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwQueryVolumeInformationFile(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwSetEaFile(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwSetEaFile(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwSetEvent(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwSetEvent(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwSetInformationToken(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwSetInformationToken(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwSetInformationVirtualMemory(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwSetInformationVirtualMemory(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwSetQuotaInformationFile(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwSetQuotaInformationFile(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwSetSecurityObject(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwSetSecurityObject(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwSetVolumeInformationFile(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwSetVolumeInformationFile(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_zwUnlockFile(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_zwUnlockFile(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

public actual fun applyControlToken(phcontext: COpaquePointer?, pinput: COpaquePointer?): Hresult =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_applyControlToken((phcontext?.value ?: 0L).toString(), (pinput?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccAsyncCopyRead(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, wait: Boolean, buffer: COpaquePointer?, iostatus: COpaquePointer?, ioissuerthread: Pethread, asyncreadcontext: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ccAsyncCopyRead((fileobject?.value ?: 0L).toString(), (fileoffset?.value ?: 0L).toString(), length.toInt(), wait, (buffer?.value ?: 0L).toString(), (iostatus?.value ?: 0L).toString(), ioissuerthread.toString(), (asyncreadcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccCanIWrite(fileobject: COpaquePointer?, bytestowrite: UInt, wait: Boolean, retrying: UByte): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ccCanIWrite((fileobject?.value ?: 0L).toString(), bytestowrite.toInt(), wait, retrying.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccCoherencyFlushAndPurgeCache(sectionobjectpointer: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, iostatus: COpaquePointer?, flags: UInt) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_ccCoherencyFlushAndPurgeCache((sectionobjectpointer?.value ?: 0L).toString(), (fileoffset?.value ?: 0L).toString(), length.toInt(), (iostatus?.value ?: 0L).toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccCopyRead(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, wait: Boolean, buffer: COpaquePointer?, iostatus: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ccCopyRead((fileobject?.value ?: 0L).toString(), (fileoffset?.value ?: 0L).toString(), length.toInt(), wait, (buffer?.value ?: 0L).toString(), (iostatus?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccCopyReadEx(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, wait: Boolean, buffer: COpaquePointer?, iostatus: COpaquePointer?, ioissuerthread: Pethread): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ccCopyReadEx((fileobject?.value ?: 0L).toString(), (fileoffset?.value ?: 0L).toString(), length.toInt(), wait, (buffer?.value ?: 0L).toString(), (iostatus?.value ?: 0L).toString(), ioissuerthread.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccCopyWrite(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, wait: Boolean, buffer: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ccCopyWrite((fileobject?.value ?: 0L).toString(), (fileoffset?.value ?: 0L).toString(), length.toInt(), wait, (buffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccCopyWriteEx(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, wait: Boolean, buffer: COpaquePointer?, ioissuerthread: Pethread): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ccCopyWriteEx((fileobject?.value ?: 0L).toString(), (fileoffset?.value ?: 0L).toString(), length.toInt(), wait, (buffer?.value ?: 0L).toString(), ioissuerthread.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccCopyWriteWontFlush(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ccCopyWriteWontFlush((fileobject?.value ?: 0L).toString(), (fileoffset?.value ?: 0L).toString(), length.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccDeferWrite(fileobject: COpaquePointer?, postroutine: PccPostDeferredWrite, context1: COpaquePointer?, context2: COpaquePointer?, bytestowrite: UInt, retrying: Boolean) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_ccDeferWrite((fileobject?.value ?: 0L).toString(), 0L.toString(), (context1?.value ?: 0L).toString(), (context2?.value ?: 0L).toString(), bytestowrite.toInt(), retrying)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccErrorCallbackRoutine(context: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ccErrorCallbackRoutine((context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccFastCopyRead(fileobject: COpaquePointer?, fileoffset: UInt, length: UInt, pagecount: UInt, buffer: COpaquePointer?, iostatus: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_ccFastCopyRead((fileobject?.value ?: 0L).toString(), fileoffset.toInt(), length.toInt(), pagecount.toInt(), (buffer?.value ?: 0L).toString(), (iostatus?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccFastCopyWrite(fileobject: COpaquePointer?, fileoffset: UInt, length: UInt, buffer: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_ccFastCopyWrite((fileobject?.value ?: 0L).toString(), fileoffset.toInt(), length.toInt(), (buffer?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccFlushCache(sectionobjectpointer: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, iostatus: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_ccFlushCache((sectionobjectpointer?.value ?: 0L).toString(), (fileoffset?.value ?: 0L).toString(), length.toInt(), (iostatus?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccGetDirtyPages(loghandle: COpaquePointer?, dirtypageroutine: PdirtyPageRoutine, context1: COpaquePointer?, context2: COpaquePointer?): Long =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ccGetDirtyPages((loghandle?.value ?: 0L).toString(), 0L.toString(), (context1?.value ?: 0L).toString(), (context2?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccGetFileObjectFromBcb(bcb: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ccGetFileObjectFromBcb((bcb?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccGetFileObjectFromSectionPtrs(sectionobjectpointer: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ccGetFileObjectFromSectionPtrs((sectionobjectpointer?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccGetFileObjectFromSectionPtrsRef(sectionobjectpointer: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ccGetFileObjectFromSectionPtrsRef((sectionobjectpointer?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccGetFlushedValidData(sectionobjectpointer: COpaquePointer?, bcblistheld: Boolean): Long =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ccGetFlushedValidData((sectionobjectpointer?.value ?: 0L).toString(), bcblistheld).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccInitializeCacheMap(fileobject: COpaquePointer?, filesizes: COpaquePointer?, pinaccess: Boolean, callbacks: COpaquePointer?, lazywritecontext: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_ccInitializeCacheMap((fileobject?.value ?: 0L).toString(), (filesizes?.value ?: 0L).toString(), pinaccess, (callbacks?.value ?: 0L).toString(), (lazywritecontext?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccInitializeCacheMapEx(fileobject: COpaquePointer?, filesizes: COpaquePointer?, pinaccess: Boolean, callbacks: COpaquePointer?, lazywritecontext: COpaquePointer?, flags: UInt) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_ccInitializeCacheMapEx((fileobject?.value ?: 0L).toString(), (filesizes?.value ?: 0L).toString(), pinaccess, (callbacks?.value ?: 0L).toString(), (lazywritecontext?.value ?: 0L).toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccIsCacheManagerCallbackNeeded(status: Ntstatus): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ccIsCacheManagerCallbackNeeded(status) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccIsThereDirtyData(vpb: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ccIsThereDirtyData((vpb?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccIsThereDirtyDataEx(vpb: COpaquePointer?, numberofdirtypages: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ccIsThereDirtyDataEx((vpb?.value ?: 0L).toString(), (numberofdirtypages?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccMapData(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, flags: UInt, bcb: COpaquePointer?, buffer: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ccMapData((fileobject?.value ?: 0L).toString(), (fileoffset?.value ?: 0L).toString(), length.toInt(), flags.toInt(), (bcb?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccMdlRead(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, mdlchain: COpaquePointer?, iostatus: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_ccMdlRead((fileobject?.value ?: 0L).toString(), (fileoffset?.value ?: 0L).toString(), length.toInt(), (mdlchain?.value ?: 0L).toString(), (iostatus?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccMdlReadComplete(fileobject: COpaquePointer?, mdlchain: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_ccMdlReadComplete((fileobject?.value ?: 0L).toString(), (mdlchain?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccMdlWriteAbort(fileobject: COpaquePointer?, mdlchain: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_ccMdlWriteAbort((fileobject?.value ?: 0L).toString(), (mdlchain?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccMdlWriteComplete(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, mdlchain: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_ccMdlWriteComplete((fileobject?.value ?: 0L).toString(), (fileoffset?.value ?: 0L).toString(), (mdlchain?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccPinMappedData(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, flags: UInt, bcb: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ccPinMappedData((fileobject?.value ?: 0L).toString(), (fileoffset?.value ?: 0L).toString(), length.toInt(), flags.toInt(), (bcb?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccPinRead(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, flags: UInt, bcb: COpaquePointer?, buffer: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ccPinRead((fileobject?.value ?: 0L).toString(), (fileoffset?.value ?: 0L).toString(), length.toInt(), flags.toInt(), (bcb?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccPrepareMdlWrite(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, mdlchain: COpaquePointer?, iostatus: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_ccPrepareMdlWrite((fileobject?.value ?: 0L).toString(), (fileoffset?.value ?: 0L).toString(), length.toInt(), (mdlchain?.value ?: 0L).toString(), (iostatus?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccPreparePinWrite(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, zero: Boolean, flags: UInt, bcb: COpaquePointer?, buffer: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ccPreparePinWrite((fileobject?.value ?: 0L).toString(), (fileoffset?.value ?: 0L).toString(), length.toInt(), zero, flags.toInt(), (bcb?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccPurgeCacheSection(sectionobjectpointer: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, flags: UInt): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ccPurgeCacheSection((sectionobjectpointer?.value ?: 0L).toString(), (fileoffset?.value ?: 0L).toString(), length.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccRemapBcb(bcb: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ccRemapBcb((bcb?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccRepinBcb(bcb: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_ccRepinBcb((bcb?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccScheduleReadAhead(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_ccScheduleReadAhead((fileobject?.value ?: 0L).toString(), (fileoffset?.value ?: 0L).toString(), length.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccScheduleReadAheadEx(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, ioissuerthread: Pethread) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_ccScheduleReadAheadEx((fileobject?.value ?: 0L).toString(), (fileoffset?.value ?: 0L).toString(), length.toInt(), ioissuerthread.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccSetAdditionalCacheAttributes(fileobject: COpaquePointer?, disablereadahead: Boolean, disablewritebehind: Boolean) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_ccSetAdditionalCacheAttributes((fileobject?.value ?: 0L).toString(), disablereadahead, disablewritebehind)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccSetAdditionalCacheAttributesEx(fileobject: COpaquePointer?, flags: UInt) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_ccSetAdditionalCacheAttributesEx((fileobject?.value ?: 0L).toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccSetBcbOwnerPointer(bcb: COpaquePointer?, ownerpointer: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_ccSetBcbOwnerPointer((bcb?.value ?: 0L).toString(), (ownerpointer?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccSetDirtyPageThreshold(fileobject: COpaquePointer?, dirtypagethreshold: UInt) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_ccSetDirtyPageThreshold((fileobject?.value ?: 0L).toString(), dirtypagethreshold.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccSetDirtyPinnedData(bcbvoid: COpaquePointer?, lsn: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_ccSetDirtyPinnedData((bcbvoid?.value ?: 0L).toString(), (lsn?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccSetFileSizes(fileobject: COpaquePointer?, filesizes: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_ccSetFileSizes((fileobject?.value ?: 0L).toString(), (filesizes?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccSetFileSizesEx(fileobject: COpaquePointer?, filesizes: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ccSetFileSizesEx((fileobject?.value ?: 0L).toString(), (filesizes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccSetLogHandleForFile(fileobject: COpaquePointer?, loghandle: COpaquePointer?, flushtolsnroutine: PflushToLsn) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_ccSetLogHandleForFile((fileobject?.value ?: 0L).toString(), (loghandle?.value ?: 0L).toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccSetParallelFlushFile(fileobject: COpaquePointer?, enableparallelflush: Boolean) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_ccSetParallelFlushFile((fileobject?.value ?: 0L).toString(), enableparallelflush)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccSetReadAheadGranularity(fileobject: COpaquePointer?, granularity: UInt) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_ccSetReadAheadGranularity((fileobject?.value ?: 0L).toString(), granularity.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccUninitializeCacheMap(fileobject: COpaquePointer?, truncatesize: COpaquePointer?, uninitializeevent: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ccUninitializeCacheMap((fileobject?.value ?: 0L).toString(), (truncatesize?.value ?: 0L).toString(), (uninitializeevent?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccUnpinData(bcb: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_ccUnpinData((bcb?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccUnpinDataForThread(bcb: COpaquePointer?, resourcethreadid: ULong) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_ccUnpinDataForThread((bcb?.value ?: 0L).toString(), resourcethreadid.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccUnpinRepinnedBcb(bcb: COpaquePointer?, writethrough: Boolean, iostatus: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_ccUnpinRepinnedBcb((bcb?.value ?: 0L).toString(), writethrough, (iostatus?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccWaitForCurrentLazyWriterActivity(): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ccWaitForCurrentLazyWriterActivity() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccZeroData(fileobject: COpaquePointer?, startoffset: COpaquePointer?, endoffset: COpaquePointer?, wait: Boolean): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ccZeroData((fileobject?.value ?: 0L).toString(), (startoffset?.value ?: 0L).toString(), (endoffset?.value ?: 0L).toString(), wait) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun completeAuthToken(phcontext: COpaquePointer?, ptoken: COpaquePointer?): Hresult =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_completeAuthToken((phcontext?.value ?: 0L).toString(), (ptoken?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exDisableResourceBoostLite(resource: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_exDisableResourceBoostLite((resource?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exQueryPoolBlockSize(poolblock: COpaquePointer?, quotacharged: COpaquePointer?): ULong =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_exQueryPoolBlockSize((poolblock?.value ?: 0L).toString(), (quotacharged?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exportSecurityContext(phcontext: COpaquePointer?, fflags: UInt, ppackedcontext: COpaquePointer?, ptoken: COpaquePointer?): Hresult =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_exportSecurityContext((phcontext?.value ?: 0L).toString(), fflags.toInt(), (ppackedcontext?.value ?: 0L).toString(), (ptoken?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlAcknowledgeEcp(ecpcontext: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlAcknowledgeEcp((ecpcontext?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlAcquireFileExclusive(fileobject: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlAcquireFileExclusive((fileobject?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlAddBaseMcbEntry(mcb: COpaquePointer?, vbn: Long, lbn: Long, sectorcount: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlAddBaseMcbEntry((mcb?.value ?: 0L).toString(), vbn.toString(), lbn.toString(), sectorcount.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlAddBaseMcbEntryEx(mcb: COpaquePointer?, vbn: Long, lbn: Long, sectorcount: Long): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlAddBaseMcbEntryEx((mcb?.value ?: 0L).toString(), vbn.toString(), lbn.toString(), sectorcount.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlAddLargeMcbEntry(mcb: COpaquePointer?, vbn: Long, lbn: Long, sectorcount: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlAddLargeMcbEntry((mcb?.value ?: 0L).toString(), vbn.toString(), lbn.toString(), sectorcount.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlAddMcbEntry(mcb: COpaquePointer?, vbn: UInt, lbn: UInt, sectorcount: UInt): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlAddMcbEntry((mcb?.value ?: 0L).toString(), vbn.toInt(), lbn.toInt(), sectorcount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlAddToTunnelCache(cache: COpaquePointer?, directorykey: ULong, shortname: COpaquePointer?, longname: COpaquePointer?, keybyshortname: Boolean, datalength: UInt, data: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlAddToTunnelCache((cache?.value ?: 0L).toString(), directorykey.toString(), (shortname?.value ?: 0L).toString(), (longname?.value ?: 0L).toString(), keybyshortname, datalength.toInt(), (data?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlAddToTunnelCacheEx(cache: COpaquePointer?, directorykey: ULong, shortname: COpaquePointer?, longname: COpaquePointer?, flags: UInt, datalength: UInt, data: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlAddToTunnelCacheEx((cache?.value ?: 0L).toString(), directorykey.toString(), (shortname?.value ?: 0L).toString(), (longname?.value ?: 0L).toString(), flags.toInt(), datalength.toInt(), (data?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlAllocateAePushLock(pooltype: PoolType, tag: UInt): COpaquePointer? =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlAllocateAePushLock(pooltype, tag.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlAllocateExtraCreateParameter(ecptype: COpaquePointer?, sizeofcontext: UInt, flags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, pooltag: UInt, ecpcontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlAllocateExtraCreateParameter((ecptype?.value ?: 0L).toString(), sizeofcontext.toInt(), flags.toInt(), 0L.toString(), pooltag.toInt(), (ecpcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlAllocateExtraCreateParameterFromLookasideList(ecptype: COpaquePointer?, sizeofcontext: UInt, flags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, lookasidelist: COpaquePointer?, ecpcontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlAllocateExtraCreateParameterFromLookasideList((ecptype?.value ?: 0L).toString(), sizeofcontext.toInt(), flags.toInt(), 0L.toString(), (lookasidelist?.value ?: 0L).toString(), (ecpcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlAllocateExtraCreateParameterList(flags: UInt, ecplist: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlAllocateExtraCreateParameterList(flags.toInt(), (ecplist?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlAllocateFileLock(completelockirproutine: PcompleteLockIrpRoutine, unlockroutine: PunlockRoutine): COpaquePointer? =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlAllocateFileLock(0L.toString(), 0L.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlAllocateResource(): COpaquePointer? =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlAllocateResource().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlAreNamesEqual(constantnamea: COpaquePointer?, constantnameb: COpaquePointer?, ignorecase: Boolean, upcasetable: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlAreNamesEqual((constantnamea?.value ?: 0L).toString(), (constantnameb?.value ?: 0L).toString(), ignorecase, (upcasetable?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlAreThereCurrentOrInProgressFileLocks(filelock: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlAreThereCurrentOrInProgressFileLocks((filelock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlAreThereWaitingFileLocks(filelock: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlAreThereWaitingFileLocks((filelock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlAreVolumeStartupApplicationsComplete(): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlAreVolumeStartupApplicationsComplete() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlBalanceReads(targetdevice: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlBalanceReads((targetdevice?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlCancellableWaitForMultipleObjects(count: UInt, objectarray: COpaquePointer?, waittype: WaitType, timeout: COpaquePointer?, waitblockarray: COpaquePointer?, irp: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlCancellableWaitForMultipleObjects(count.toInt(), (objectarray?.value ?: 0L).toString(), waittype, (timeout?.value ?: 0L).toString(), (waitblockarray?.value ?: 0L).toString(), (irp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlCancellableWaitForSingleObject(obj: COpaquePointer?, timeout: COpaquePointer?, irp: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlCancellableWaitForSingleObject((obj?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString(), (irp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlChangeBackingFileObject(currentfileobject: COpaquePointer?, newfileobject: COpaquePointer?, changebackingtype: FsrtlChangeBackingType, flags: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlChangeBackingFileObject((currentfileobject?.value ?: 0L).toString(), (newfileobject?.value ?: 0L).toString(), changebackingtype, flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlCheckLockForOplockRequest(filelock: COpaquePointer?, allocationsize: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlCheckLockForOplockRequest((filelock?.value ?: 0L).toString(), (allocationsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlCheckLockForReadAccess(filelock: COpaquePointer?, irp: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlCheckLockForReadAccess((filelock?.value ?: 0L).toString(), (irp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlCheckLockForWriteAccess(filelock: COpaquePointer?, irp: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlCheckLockForWriteAccess((filelock?.value ?: 0L).toString(), (irp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlCheckOplock(oplock: COpaquePointer?, irp: COpaquePointer?, context: COpaquePointer?, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlCheckOplock((oplock?.value ?: 0L).toString(), (irp?.value ?: 0L).toString(), (context?.value ?: 0L).toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlCheckOplockEx(oplock: COpaquePointer?, irp: COpaquePointer?, flags: UInt, context: COpaquePointer?, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlCheckOplockEx((oplock?.value ?: 0L).toString(), (irp?.value ?: 0L).toString(), flags.toInt(), (context?.value ?: 0L).toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlCheckOplockEx2(oplock: COpaquePointer?, irp: COpaquePointer?, flags: UInt, flagsex2: UInt, completionroutinecontext: COpaquePointer?, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp, timeout: ULong, notifycontext: COpaquePointer?, notifyroutine: PoplockNotifyRoutine): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlCheckOplockEx2((oplock?.value ?: 0L).toString(), (irp?.value ?: 0L).toString(), flags.toInt(), flagsex2.toInt(), (completionroutinecontext?.value ?: 0L).toString(), 0L.toString(), 0L.toString(), timeout.toString(), (notifycontext?.value ?: 0L).toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlCheckUpperOplock(oplock: COpaquePointer?, newloweroplockstate: UInt, completionroutinecontext: COpaquePointer?, completionroutine: PoplockWaitCompleteRoutine, prependroutine: PoplockFsPrepostIrp, flags: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlCheckUpperOplock((oplock?.value ?: 0L).toString(), newloweroplockstate.toInt(), (completionroutinecontext?.value ?: 0L).toString(), 0L.toString(), 0L.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlCopyRead(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, wait: Boolean, lockkey: UInt, buffer: COpaquePointer?, iostatus: COpaquePointer?, deviceobject: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlCopyRead((fileobject?.value ?: 0L).toString(), (fileoffset?.value ?: 0L).toString(), length.toInt(), wait, lockkey.toInt(), (buffer?.value ?: 0L).toString(), (iostatus?.value ?: 0L).toString(), (deviceobject?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlCopyWrite(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, wait: Boolean, lockkey: UInt, buffer: COpaquePointer?, iostatus: COpaquePointer?, deviceobject: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlCopyWrite((fileobject?.value ?: 0L).toString(), (fileoffset?.value ?: 0L).toString(), length.toInt(), wait, lockkey.toInt(), (buffer?.value ?: 0L).toString(), (iostatus?.value ?: 0L).toString(), (deviceobject?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlCreateSectionForDataScan(sectionhandle: COpaquePointer?, sectionobject: COpaquePointer?, sectionfilesize: COpaquePointer?, fileobject: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, maximumsize: COpaquePointer?, sectionpageprotection: UInt, allocationattributes: UInt, flags: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlCreateSectionForDataScan((sectionhandle?.value ?: 0L).toString(), (sectionobject?.value ?: 0L).toString(), (sectionfilesize?.value ?: 0L).toString(), (fileobject?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), (maximumsize?.value ?: 0L).toString(), sectionpageprotection.toInt(), allocationattributes.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlCurrentBatchOplock(oplock: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlCurrentBatchOplock((oplock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlCurrentOplock(oplock: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlCurrentOplock((oplock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlCurrentOplockH(oplock: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlCurrentOplockH((oplock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlDeleteExtraCreateParameterLookasideList(lookaside: COpaquePointer?, flags: UInt) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlDeleteExtraCreateParameterLookasideList((lookaside?.value ?: 0L).toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlDeleteKeyFromTunnelCache(cache: COpaquePointer?, directorykey: ULong) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlDeleteKeyFromTunnelCache((cache?.value ?: 0L).toString(), directorykey.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlDeleteTunnelCache(cache: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlDeleteTunnelCache((cache?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlDeregisterUncProvider(handle: Handle) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlDeregisterUncProvider((handle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlDismountComplete(deviceobject: COpaquePointer?, dismountstatus: Ntstatus) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlDismountComplete((deviceobject?.value ?: 0L).toString(), dismountstatus)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlDissectDbcs(path: io.github.kotlinmania.windowssys.windows.win32.system.kernel.String, firstname: COpaquePointer?, remainingname: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun fsRtlDissectName(path: UnicodeString, firstname: COpaquePointer?, remainingname: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun fsRtlDoesDbcsContainWildCards(name: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlDoesDbcsContainWildCards((name?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlDoesNameContainWildCards(name: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlDoesNameContainWildCards((name?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlFastCheckLockForRead(filelock: COpaquePointer?, startingbyte: COpaquePointer?, length: COpaquePointer?, key: UInt, fileobject: COpaquePointer?, processid: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlFastCheckLockForRead((filelock?.value ?: 0L).toString(), (startingbyte?.value ?: 0L).toString(), (length?.value ?: 0L).toString(), key.toInt(), (fileobject?.value ?: 0L).toString(), (processid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlFastCheckLockForWrite(filelock: COpaquePointer?, startingbyte: COpaquePointer?, length: COpaquePointer?, key: UInt, fileobject: COpaquePointer?, processid: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlFastCheckLockForWrite((filelock?.value ?: 0L).toString(), (startingbyte?.value ?: 0L).toString(), (length?.value ?: 0L).toString(), key.toInt(), (fileobject?.value ?: 0L).toString(), (processid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlFastUnlockAll(filelock: COpaquePointer?, fileobject: COpaquePointer?, processid: Peprocess, context: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlFastUnlockAll((filelock?.value ?: 0L).toString(), (fileobject?.value ?: 0L).toString(), processid.toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlFastUnlockAllByKey(filelock: COpaquePointer?, fileobject: COpaquePointer?, processid: Peprocess, key: UInt, context: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlFastUnlockAllByKey((filelock?.value ?: 0L).toString(), (fileobject?.value ?: 0L).toString(), processid.toString(), key.toInt(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlFastUnlockSingle(filelock: COpaquePointer?, fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: COpaquePointer?, processid: Peprocess, key: UInt, context: COpaquePointer?, alreadysynchronized: Boolean): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlFastUnlockSingle((filelock?.value ?: 0L).toString(), (fileobject?.value ?: 0L).toString(), (fileoffset?.value ?: 0L).toString(), (length?.value ?: 0L).toString(), processid.toString(), key.toInt(), (context?.value ?: 0L).toString(), alreadysynchronized) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlFindExtraCreateParameter(ecplist: COpaquePointer?, ecptype: COpaquePointer?, ecpcontext: COpaquePointer?, ecpcontextsize: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlFindExtraCreateParameter((ecplist?.value ?: 0L).toString(), (ecptype?.value ?: 0L).toString(), (ecpcontext?.value ?: 0L).toString(), (ecpcontextsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlFindInTunnelCache(cache: COpaquePointer?, directorykey: ULong, name: COpaquePointer?, shortname: COpaquePointer?, longname: COpaquePointer?, datalength: COpaquePointer?, data: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlFindInTunnelCache((cache?.value ?: 0L).toString(), directorykey.toString(), (name?.value ?: 0L).toString(), (shortname?.value ?: 0L).toString(), (longname?.value ?: 0L).toString(), (datalength?.value ?: 0L).toString(), (data?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlFindInTunnelCacheEx(cache: COpaquePointer?, directorykey: ULong, name: COpaquePointer?, shortname: COpaquePointer?, longname: COpaquePointer?, flags: UInt, datalength: COpaquePointer?, data: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlFindInTunnelCacheEx((cache?.value ?: 0L).toString(), directorykey.toString(), (name?.value ?: 0L).toString(), (shortname?.value ?: 0L).toString(), (longname?.value ?: 0L).toString(), flags.toInt(), (datalength?.value ?: 0L).toString(), (data?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlFreeAePushLock(aepushlock: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlFreeAePushLock((aepushlock?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlFreeExtraCreateParameter(ecpcontext: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlFreeExtraCreateParameter((ecpcontext?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlFreeExtraCreateParameterList(ecplist: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlFreeExtraCreateParameterList((ecplist?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlFreeFileLock(filelock: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlFreeFileLock((filelock?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlGetCurrentProcessLoaderList(): COpaquePointer? =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlGetCurrentProcessLoaderList().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlGetEcpListFromIrp(irp: COpaquePointer?, ecplist: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlGetEcpListFromIrp((irp?.value ?: 0L).toString(), (ecplist?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlGetFileSize(fileobject: COpaquePointer?, filesize: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlGetFileSize((fileobject?.value ?: 0L).toString(), (filesize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlGetNextBaseMcbEntry(mcb: COpaquePointer?, runindex: UInt, vbn: COpaquePointer?, lbn: COpaquePointer?, sectorcount: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlGetNextBaseMcbEntry((mcb?.value ?: 0L).toString(), runindex.toInt(), (vbn?.value ?: 0L).toString(), (lbn?.value ?: 0L).toString(), (sectorcount?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlGetNextExtraCreateParameter(ecplist: COpaquePointer?, currentecpcontext: COpaquePointer?, nextecptype: COpaquePointer?, nextecpcontext: COpaquePointer?, nextecpcontextsize: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlGetNextExtraCreateParameter((ecplist?.value ?: 0L).toString(), (currentecpcontext?.value ?: 0L).toString(), (nextecptype?.value ?: 0L).toString(), (nextecpcontext?.value ?: 0L).toString(), (nextecpcontextsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlGetNextFileLock(filelock: COpaquePointer?, restart: Boolean): COpaquePointer? =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlGetNextFileLock((filelock?.value ?: 0L).toString(), restart).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlGetNextLargeMcbEntry(mcb: COpaquePointer?, runindex: UInt, vbn: COpaquePointer?, lbn: COpaquePointer?, sectorcount: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlGetNextLargeMcbEntry((mcb?.value ?: 0L).toString(), runindex.toInt(), (vbn?.value ?: 0L).toString(), (lbn?.value ?: 0L).toString(), (sectorcount?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlGetNextMcbEntry(mcb: COpaquePointer?, runindex: UInt, vbn: COpaquePointer?, lbn: COpaquePointer?, sectorcount: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlGetNextMcbEntry((mcb?.value ?: 0L).toString(), runindex.toInt(), (vbn?.value ?: 0L).toString(), (lbn?.value ?: 0L).toString(), (sectorcount?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlGetSectorSizeInformation(deviceobject: COpaquePointer?, sectorsizeinfo: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlGetSectorSizeInformation((deviceobject?.value ?: 0L).toString(), (sectorsizeinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlGetSupportedFeatures(deviceobject: COpaquePointer?, supportedfeatures: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlGetSupportedFeatures((deviceobject?.value ?: 0L).toString(), (supportedfeatures?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlGetVirtualDiskNestingLevel(deviceobject: COpaquePointer?, nestinglevel: COpaquePointer?, nestingflags: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlGetVirtualDiskNestingLevel((deviceobject?.value ?: 0L).toString(), (nestinglevel?.value ?: 0L).toString(), (nestingflags?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIncrementCcFastMdlReadWait() {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlIncrementCcFastMdlReadWait()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlIncrementCcFastReadNoWait() {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlIncrementCcFastReadNoWait()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlIncrementCcFastReadNotPossible() {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlIncrementCcFastReadNotPossible()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlIncrementCcFastReadResourceMiss() {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlIncrementCcFastReadResourceMiss()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlIncrementCcFastReadWait() {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlIncrementCcFastReadWait()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlInitExtraCreateParameterLookasideList(lookaside: COpaquePointer?, flags: UInt, size: ULong, tag: UInt) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlInitExtraCreateParameterLookasideList((lookaside?.value ?: 0L).toString(), flags.toInt(), size.toString(), tag.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlInitializeBaseMcb(mcb: COpaquePointer?, pooltype: PoolType) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlInitializeBaseMcb((mcb?.value ?: 0L).toString(), pooltype)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlInitializeBaseMcbEx(mcb: COpaquePointer?, pooltype: PoolType, flags: UShort): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlInitializeBaseMcbEx((mcb?.value ?: 0L).toString(), pooltype, flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlInitializeExtraCreateParameter(ecp: COpaquePointer?, ecpflags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, totalsize: UInt, ecptype: COpaquePointer?, listallocatedfrom: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlInitializeExtraCreateParameter((ecp?.value ?: 0L).toString(), ecpflags.toInt(), 0L.toString(), totalsize.toInt(), (ecptype?.value ?: 0L).toString(), (listallocatedfrom?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlInitializeExtraCreateParameterList(ecplist: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlInitializeExtraCreateParameterList((ecplist?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlInitializeFileLock(filelock: COpaquePointer?, completelockirproutine: PcompleteLockIrpRoutine, unlockroutine: PunlockRoutine) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlInitializeFileLock((filelock?.value ?: 0L).toString(), 0L.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlInitializeLargeMcb(mcb: COpaquePointer?, pooltype: PoolType) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlInitializeLargeMcb((mcb?.value ?: 0L).toString(), pooltype)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlInitializeMcb(mcb: COpaquePointer?, pooltype: PoolType) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlInitializeMcb((mcb?.value ?: 0L).toString(), pooltype)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlInitializeOplock(oplock: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlInitializeOplock((oplock?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlInitializeTunnelCache(cache: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlInitializeTunnelCache((cache?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlInsertExtraCreateParameter(ecplist: COpaquePointer?, ecpcontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlInsertExtraCreateParameter((ecplist?.value ?: 0L).toString(), (ecpcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlInsertPerFileContext(perfilecontextpointer: COpaquePointer?, ptr: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlInsertPerFileContext((perfilecontextpointer?.value ?: 0L).toString(), (ptr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlInsertPerFileObjectContext(fileobject: COpaquePointer?, ptr: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlInsertPerFileObjectContext((fileobject?.value ?: 0L).toString(), (ptr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlInsertPerStreamContext(perstreamcontext: COpaquePointer?, ptr: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlInsertPerStreamContext((perstreamcontext?.value ?: 0L).toString(), (ptr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIs32BitProcess(process: Peprocess): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlIs32BitProcess(process.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIsDaxVolume(fileobject: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlIsDaxVolume((fileobject?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIsDbcsInExpression(expression: COpaquePointer?, name: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlIsDbcsInExpression((expression?.value ?: 0L).toString(), (name?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIsEcpAcknowledged(ecpcontext: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlIsEcpAcknowledged((ecpcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIsEcpFromUserMode(ecpcontext: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlIsEcpFromUserMode((ecpcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIsExtentDangling(startpage: UInt, numberofpages: UInt, flags: UInt): UInt =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlIsExtentDangling(startpage.toInt(), numberofpages.toInt(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIsFatDbcsLegal(dbcsname: io.github.kotlinmania.windowssys.windows.win32.system.kernel.String, wildcardspermissible: Boolean, pathnamepermissible: Boolean, leadingbackslashpermissible: Boolean): Boolean =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIsHpfsDbcsLegal(dbcsname: io.github.kotlinmania.windowssys.windows.win32.system.kernel.String, wildcardspermissible: Boolean, pathnamepermissible: Boolean, leadingbackslashpermissible: Boolean): Boolean =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIsMobileOS(): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlIsMobileOS() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIsNameInExpression(expression: COpaquePointer?, name: COpaquePointer?, ignorecase: Boolean, upcasetable: Pcwstr): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlIsNameInExpression((expression?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), ignorecase, (upcasetable?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIsNameInUnUpcasedExpression(expression: COpaquePointer?, name: COpaquePointer?, ignorecase: Boolean, upcasetable: Pcwstr): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlIsNameInUnUpcasedExpression((expression?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), ignorecase, (upcasetable?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag: UInt): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIsNtstatusExpected(exception: Ntstatus): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlIsNtstatusExpected(exception) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIsPagingFile(fileobject: COpaquePointer?): UInt =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlIsPagingFile((fileobject?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIsSystemPagingFile(fileobject: COpaquePointer?): UInt =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlIsSystemPagingFile((fileobject?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIssueDeviceIoControl(deviceobject: COpaquePointer?, ioctl: UInt, flags: UByte, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt, iosbinformation: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlIssueDeviceIoControl((deviceobject?.value ?: 0L).toString(), ioctl.toInt(), flags.toInt(), (inputbuffer?.value ?: 0L).toString(), inputbufferlength.toInt(), (outputbuffer?.value ?: 0L).toString(), outputbufferlength.toInt(), (iosbinformation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlKernelFsControlFile(fileobject: COpaquePointer?, fscontrolcode: UInt, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt, retoutputbuffersize: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlKernelFsControlFile((fileobject?.value ?: 0L).toString(), fscontrolcode.toInt(), (inputbuffer?.value ?: 0L).toString(), inputbufferlength.toInt(), (outputbuffer?.value ?: 0L).toString(), outputbufferlength.toInt(), (retoutputbuffersize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlLogCcFlushError(filename: COpaquePointer?, deviceobject: COpaquePointer?, sectionobjectpointer: COpaquePointer?, flusherror: Ntstatus, flags: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlLogCcFlushError((filename?.value ?: 0L).toString(), (deviceobject?.value ?: 0L).toString(), (sectionobjectpointer?.value ?: 0L).toString(), flusherror, flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlLookupBaseMcbEntry(mcb: COpaquePointer?, vbn: Long, lbn: COpaquePointer?, sectorcountfromlbn: COpaquePointer?, startinglbn: COpaquePointer?, sectorcountfromstartinglbn: COpaquePointer?, index: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlLookupBaseMcbEntry((mcb?.value ?: 0L).toString(), vbn.toString(), (lbn?.value ?: 0L).toString(), (sectorcountfromlbn?.value ?: 0L).toString(), (startinglbn?.value ?: 0L).toString(), (sectorcountfromstartinglbn?.value ?: 0L).toString(), (index?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlLookupLargeMcbEntry(mcb: COpaquePointer?, vbn: Long, lbn: COpaquePointer?, sectorcountfromlbn: COpaquePointer?, startinglbn: COpaquePointer?, sectorcountfromstartinglbn: COpaquePointer?, index: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlLookupLargeMcbEntry((mcb?.value ?: 0L).toString(), vbn.toString(), (lbn?.value ?: 0L).toString(), (sectorcountfromlbn?.value ?: 0L).toString(), (startinglbn?.value ?: 0L).toString(), (sectorcountfromstartinglbn?.value ?: 0L).toString(), (index?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlLookupLastBaseMcbEntry(mcb: COpaquePointer?, vbn: COpaquePointer?, lbn: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlLookupLastBaseMcbEntry((mcb?.value ?: 0L).toString(), (vbn?.value ?: 0L).toString(), (lbn?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlLookupLastBaseMcbEntryAndIndex(opaquemcb: COpaquePointer?, largevbn: COpaquePointer?, largelbn: COpaquePointer?, index: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlLookupLastBaseMcbEntryAndIndex((opaquemcb?.value ?: 0L).toString(), (largevbn?.value ?: 0L).toString(), (largelbn?.value ?: 0L).toString(), (index?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlLookupLastLargeMcbEntry(mcb: COpaquePointer?, vbn: COpaquePointer?, lbn: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlLookupLastLargeMcbEntry((mcb?.value ?: 0L).toString(), (vbn?.value ?: 0L).toString(), (lbn?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlLookupLastLargeMcbEntryAndIndex(opaquemcb: COpaquePointer?, largevbn: COpaquePointer?, largelbn: COpaquePointer?, index: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlLookupLastLargeMcbEntryAndIndex((opaquemcb?.value ?: 0L).toString(), (largevbn?.value ?: 0L).toString(), (largelbn?.value ?: 0L).toString(), (index?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlLookupLastMcbEntry(mcb: COpaquePointer?, vbn: COpaquePointer?, lbn: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlLookupLastMcbEntry((mcb?.value ?: 0L).toString(), (vbn?.value ?: 0L).toString(), (lbn?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlLookupMcbEntry(mcb: COpaquePointer?, vbn: UInt, lbn: COpaquePointer?, sectorcount: COpaquePointer?, index: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlLookupMcbEntry((mcb?.value ?: 0L).toString(), vbn.toInt(), (lbn?.value ?: 0L).toString(), (sectorcount?.value ?: 0L).toString(), (index?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlLookupPerFileContext(perfilecontextpointer: COpaquePointer?, ownerid: COpaquePointer?, instanceid: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlLookupPerFileContext((perfilecontextpointer?.value ?: 0L).toString(), (ownerid?.value ?: 0L).toString(), (instanceid?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlLookupPerFileObjectContext(fileobject: COpaquePointer?, ownerid: COpaquePointer?, instanceid: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlLookupPerFileObjectContext((fileobject?.value ?: 0L).toString(), (ownerid?.value ?: 0L).toString(), (instanceid?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlLookupPerStreamContextInternal(streamcontext: COpaquePointer?, ownerid: COpaquePointer?, instanceid: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlLookupPerStreamContextInternal((streamcontext?.value ?: 0L).toString(), (ownerid?.value ?: 0L).toString(), (instanceid?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlMdlReadCompleteDev(fileobject: COpaquePointer?, mdlchain: COpaquePointer?, deviceobject: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlMdlReadCompleteDev((fileobject?.value ?: 0L).toString(), (mdlchain?.value ?: 0L).toString(), (deviceobject?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlMdlReadDev(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, lockkey: UInt, mdlchain: COpaquePointer?, iostatus: COpaquePointer?, deviceobject: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlMdlReadDev((fileobject?.value ?: 0L).toString(), (fileoffset?.value ?: 0L).toString(), length.toInt(), lockkey.toInt(), (mdlchain?.value ?: 0L).toString(), (iostatus?.value ?: 0L).toString(), (deviceobject?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlMdlReadEx(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, lockkey: UInt, mdlchain: COpaquePointer?, iostatus: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlMdlReadEx((fileobject?.value ?: 0L).toString(), (fileoffset?.value ?: 0L).toString(), length.toInt(), lockkey.toInt(), (mdlchain?.value ?: 0L).toString(), (iostatus?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlMdlWriteCompleteDev(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, mdlchain: COpaquePointer?, deviceobject: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlMdlWriteCompleteDev((fileobject?.value ?: 0L).toString(), (fileoffset?.value ?: 0L).toString(), (mdlchain?.value ?: 0L).toString(), (deviceobject?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlMupGetProviderIdFromName(pprovidername: COpaquePointer?, pproviderid: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlMupGetProviderIdFromName((pprovidername?.value ?: 0L).toString(), (pproviderid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlMupGetProviderInfoFromFileObject(pfileobject: COpaquePointer?, level: UInt, pbuffer: COpaquePointer?, pbuffersize: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlMupGetProviderInfoFromFileObject((pfileobject?.value ?: 0L).toString(), level.toInt(), (pbuffer?.value ?: 0L).toString(), (pbuffersize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlNormalizeNtstatus(exception: Ntstatus, genericexception: Ntstatus): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlNormalizeNtstatus(exception, genericexception) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlNotifyCleanup(notifysync: PnotifySync, notifylist: COpaquePointer?, fscontext: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlNotifyCleanup(notifysync.toString(), (notifylist?.value ?: 0L).toString(), (fscontext?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlNotifyCleanupAll(notifysync: PnotifySync, notifylist: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlNotifyCleanupAll(notifysync.toString(), (notifylist?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlNotifyFilterChangeDirectory(notifysync: PnotifySync, notifylist: COpaquePointer?, fscontext: COpaquePointer?, fulldirectoryname: COpaquePointer?, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifyirp: COpaquePointer?, traversecallback: PcheckForTraverseAccess, subjectcontext: COpaquePointer?, filtercallback: PfilterReportChange) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlNotifyFilterChangeDirectory(notifysync.toString(), (notifylist?.value ?: 0L).toString(), (fscontext?.value ?: 0L).toString(), (fulldirectoryname?.value ?: 0L).toString(), watchtree, ignorebuffer, completionfilter.toInt(), (notifyirp?.value ?: 0L).toString(), 0L.toString(), (subjectcontext?.value ?: 0L).toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlNotifyFilterReportChange(notifysync: PnotifySync, notifylist: COpaquePointer?, fulltargetname: COpaquePointer?, targetnameoffset: UShort, streamname: COpaquePointer?, normalizedparentname: COpaquePointer?, filtermatch: UInt, action: UInt, targetcontext: COpaquePointer?, filtercontext: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlNotifyFilterReportChange(notifysync.toString(), (notifylist?.value ?: 0L).toString(), (fulltargetname?.value ?: 0L).toString(), targetnameoffset.toInt(), (streamname?.value ?: 0L).toString(), (normalizedparentname?.value ?: 0L).toString(), filtermatch.toInt(), action.toInt(), (targetcontext?.value ?: 0L).toString(), (filtercontext?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlNotifyFullChangeDirectory(notifysync: PnotifySync, notifylist: COpaquePointer?, fscontext: COpaquePointer?, fulldirectoryname: COpaquePointer?, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifyirp: COpaquePointer?, traversecallback: PcheckForTraverseAccess, subjectcontext: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlNotifyFullChangeDirectory(notifysync.toString(), (notifylist?.value ?: 0L).toString(), (fscontext?.value ?: 0L).toString(), (fulldirectoryname?.value ?: 0L).toString(), watchtree, ignorebuffer, completionfilter.toInt(), (notifyirp?.value ?: 0L).toString(), 0L.toString(), (subjectcontext?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlNotifyFullReportChange(notifysync: PnotifySync, notifylist: COpaquePointer?, fulltargetname: COpaquePointer?, targetnameoffset: UShort, streamname: COpaquePointer?, normalizedparentname: COpaquePointer?, filtermatch: UInt, action: UInt, targetcontext: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlNotifyFullReportChange(notifysync.toString(), (notifylist?.value ?: 0L).toString(), (fulltargetname?.value ?: 0L).toString(), targetnameoffset.toInt(), (streamname?.value ?: 0L).toString(), (normalizedparentname?.value ?: 0L).toString(), filtermatch.toInt(), action.toInt(), (targetcontext?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlNotifyInitializeSync(notifysync: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlNotifyInitializeSync((notifysync?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlNotifyUninitializeSync(notifysync: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlNotifyUninitializeSync((notifysync?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlNotifyVolumeEvent(fileobject: COpaquePointer?, eventcode: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlNotifyVolumeEvent((fileobject?.value ?: 0L).toString(), eventcode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlNotifyVolumeEventEx(fileobject: COpaquePointer?, eventcode: UInt, event: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlNotifyVolumeEventEx((fileobject?.value ?: 0L).toString(), eventcode.toInt(), (event?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlNumberOfRunsInBaseMcb(mcb: COpaquePointer?): UInt =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlNumberOfRunsInBaseMcb((mcb?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlNumberOfRunsInLargeMcb(mcb: COpaquePointer?): UInt =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlNumberOfRunsInLargeMcb((mcb?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlNumberOfRunsInMcb(mcb: COpaquePointer?): UInt =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlNumberOfRunsInMcb((mcb?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlOplockBreakH(oplock: COpaquePointer?, irp: COpaquePointer?, flags: UInt, context: COpaquePointer?, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlOplockBreakH((oplock?.value ?: 0L).toString(), (irp?.value ?: 0L).toString(), flags.toInt(), (context?.value ?: 0L).toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlOplockBreakH2(oplock: COpaquePointer?, irp: COpaquePointer?, flags: UInt, context: COpaquePointer?, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp, grantedaccess: COpaquePointer?, shareaccess: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlOplockBreakH2((oplock?.value ?: 0L).toString(), (irp?.value ?: 0L).toString(), flags.toInt(), (context?.value ?: 0L).toString(), 0L.toString(), 0L.toString(), (grantedaccess?.value ?: 0L).toString(), (shareaccess?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlOplockBreakToNone(oplock: COpaquePointer?, irpsp: COpaquePointer?, irp: COpaquePointer?, context: COpaquePointer?, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlOplockBreakToNone((oplock?.value ?: 0L).toString(), (irpsp?.value ?: 0L).toString(), (irp?.value ?: 0L).toString(), (context?.value ?: 0L).toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlOplockBreakToNoneEx(oplock: COpaquePointer?, irp: COpaquePointer?, flags: UInt, context: COpaquePointer?, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlOplockBreakToNoneEx((oplock?.value ?: 0L).toString(), (irp?.value ?: 0L).toString(), flags.toInt(), (context?.value ?: 0L).toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlOplockFsctrl(oplock: COpaquePointer?, irp: COpaquePointer?, opencount: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlOplockFsctrl((oplock?.value ?: 0L).toString(), (irp?.value ?: 0L).toString(), opencount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlOplockFsctrlEx(oplock: COpaquePointer?, irp: COpaquePointer?, opencount: UInt, flags: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlOplockFsctrlEx((oplock?.value ?: 0L).toString(), (irp?.value ?: 0L).toString(), opencount.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlOplockGetAnyBreakOwnerProcess(oplock: COpaquePointer?): Peprocess =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlOplockGetAnyBreakOwnerProcess((oplock?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlOplockIsFastIoPossible(oplock: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlOplockIsFastIoPossible((oplock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlOplockIsSharedRequest(irp: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlOplockIsSharedRequest((irp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlOplockKeysEqual(fo1: COpaquePointer?, fo2: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlOplockKeysEqual((fo1?.value ?: 0L).toString(), (fo2?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlPostPagingFileStackOverflow(context: COpaquePointer?, event: COpaquePointer?, stackoverflowroutine: PfsrtlStackOverflowRoutine) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlPostPagingFileStackOverflow((context?.value ?: 0L).toString(), (event?.value ?: 0L).toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlPostStackOverflow(context: COpaquePointer?, event: COpaquePointer?, stackoverflowroutine: PfsrtlStackOverflowRoutine) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlPostStackOverflow((context?.value ?: 0L).toString(), (event?.value ?: 0L).toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlPrepareMdlWriteDev(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, lockkey: UInt, mdlchain: COpaquePointer?, iostatus: COpaquePointer?, deviceobject: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlPrepareMdlWriteDev((fileobject?.value ?: 0L).toString(), (fileoffset?.value ?: 0L).toString(), length.toInt(), lockkey.toInt(), (mdlchain?.value ?: 0L).toString(), (iostatus?.value ?: 0L).toString(), (deviceobject?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlPrepareMdlWriteEx(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, lockkey: UInt, mdlchain: COpaquePointer?, iostatus: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlPrepareMdlWriteEx((fileobject?.value ?: 0L).toString(), (fileoffset?.value ?: 0L).toString(), length.toInt(), lockkey.toInt(), (mdlchain?.value ?: 0L).toString(), (iostatus?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlPrepareToReuseEcp(ecpcontext: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlPrepareToReuseEcp((ecpcontext?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlPrivateLock(filelock: COpaquePointer?, fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: COpaquePointer?, processid: Peprocess, key: UInt, failimmediately: Boolean, exclusivelock: Boolean, iosb: COpaquePointer?, irp: COpaquePointer?, context: COpaquePointer?, alreadysynchronized: Boolean): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlPrivateLock((filelock?.value ?: 0L).toString(), (fileobject?.value ?: 0L).toString(), (fileoffset?.value ?: 0L).toString(), (length?.value ?: 0L).toString(), processid.toString(), key.toInt(), failimmediately, exclusivelock, (iosb?.value ?: 0L).toString(), (irp?.value ?: 0L).toString(), (context?.value ?: 0L).toString(), alreadysynchronized) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlProcessFileLock(filelock: COpaquePointer?, irp: COpaquePointer?, context: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlProcessFileLock((filelock?.value ?: 0L).toString(), (irp?.value ?: 0L).toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlQueryCachedVdl(fileobject: COpaquePointer?, vdl: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlQueryCachedVdl((fileobject?.value ?: 0L).toString(), (vdl?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlQueryInformationFile(fileobject: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass, retfileinformationsize: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlQueryInformationFile((fileobject?.value ?: 0L).toString(), (fileinformation?.value ?: 0L).toString(), length.toInt(), fileinformationclass, (retfileinformationsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlQueryKernelEaFile(fileobject: COpaquePointer?, returnedeadata: COpaquePointer?, length: UInt, returnsingleentry: Boolean, ealist: COpaquePointer?, ealistlength: UInt, eaindex: COpaquePointer?, restartscan: Boolean, lengthreturned: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlQueryKernelEaFile((fileobject?.value ?: 0L).toString(), (returnedeadata?.value ?: 0L).toString(), length.toInt(), returnsingleentry, (ealist?.value ?: 0L).toString(), ealistlength.toInt(), (eaindex?.value ?: 0L).toString(), restartscan, (lengthreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlQueryMaximumVirtualDiskNestingLevel(): UInt =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlQueryMaximumVirtualDiskNestingLevel().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlRegisterFileSystemFilterCallbacks(filterdriverobject: COpaquePointer?, callbacks: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlRegisterFileSystemFilterCallbacks((filterdriverobject?.value ?: 0L).toString(), (callbacks?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlRegisterUncProvider(muphandle: COpaquePointer?, redirectordevicename: COpaquePointer?, mailslotssupported: Boolean): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlRegisterUncProvider((muphandle?.value ?: 0L).toString(), (redirectordevicename?.value ?: 0L).toString(), mailslotssupported) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlRegisterUncProviderEx(muphandle: COpaquePointer?, redirdevname: COpaquePointer?, deviceobject: COpaquePointer?, flags: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlRegisterUncProviderEx((muphandle?.value ?: 0L).toString(), (redirdevname?.value ?: 0L).toString(), (deviceobject?.value ?: 0L).toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlRegisterUncProviderEx2(redirdevname: COpaquePointer?, deviceobject: COpaquePointer?, registration: COpaquePointer?, muphandle: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlRegisterUncProviderEx2((redirdevname?.value ?: 0L).toString(), (deviceobject?.value ?: 0L).toString(), (registration?.value ?: 0L).toString(), (muphandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlReleaseFile(fileobject: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlReleaseFile((fileobject?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlRemoveBaseMcbEntry(mcb: COpaquePointer?, vbn: Long, sectorcount: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlRemoveBaseMcbEntry((mcb?.value ?: 0L).toString(), vbn.toString(), sectorcount.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlRemoveDotsFromPath(originalstring: Pwstr, pathlength: UShort, newlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlRemoveDotsFromPath((originalstring?.value ?: 0L).toString(), pathlength.toInt(), (newlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlRemoveExtraCreateParameter(ecplist: COpaquePointer?, ecptype: COpaquePointer?, ecpcontext: COpaquePointer?, ecpcontextsize: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlRemoveExtraCreateParameter((ecplist?.value ?: 0L).toString(), (ecptype?.value ?: 0L).toString(), (ecpcontext?.value ?: 0L).toString(), (ecpcontextsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlRemoveLargeMcbEntry(mcb: COpaquePointer?, vbn: Long, sectorcount: Long) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlRemoveLargeMcbEntry((mcb?.value ?: 0L).toString(), vbn.toString(), sectorcount.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlRemoveMcbEntry(mcb: COpaquePointer?, vbn: UInt, sectorcount: UInt) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlRemoveMcbEntry((mcb?.value ?: 0L).toString(), vbn.toInt(), sectorcount.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlRemovePerFileContext(perfilecontextpointer: COpaquePointer?, ownerid: COpaquePointer?, instanceid: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlRemovePerFileContext((perfilecontextpointer?.value ?: 0L).toString(), (ownerid?.value ?: 0L).toString(), (instanceid?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlRemovePerFileObjectContext(fileobject: COpaquePointer?, ownerid: COpaquePointer?, instanceid: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlRemovePerFileObjectContext((fileobject?.value ?: 0L).toString(), (ownerid?.value ?: 0L).toString(), (instanceid?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlRemovePerStreamContext(streamcontext: COpaquePointer?, ownerid: COpaquePointer?, instanceid: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlRemovePerStreamContext((streamcontext?.value ?: 0L).toString(), (ownerid?.value ?: 0L).toString(), (instanceid?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlResetBaseMcb(mcb: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlResetBaseMcb((mcb?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlResetLargeMcb(mcb: COpaquePointer?, selfsynchronized: Boolean) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlResetLargeMcb((mcb?.value ?: 0L).toString(), selfsynchronized)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlSetDriverBacking(driverobj: COpaquePointer?, flags: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlSetDriverBacking((driverobj?.value ?: 0L).toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlSetEcpListIntoIrp(irp: COpaquePointer?, ecplist: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlSetEcpListIntoIrp((irp?.value ?: 0L).toString(), (ecplist?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlSetKernelEaFile(fileobject: COpaquePointer?, eabuffer: COpaquePointer?, length: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlSetKernelEaFile((fileobject?.value ?: 0L).toString(), (eabuffer?.value ?: 0L).toString(), length.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlSplitBaseMcb(mcb: COpaquePointer?, vbn: Long, amount: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlSplitBaseMcb((mcb?.value ?: 0L).toString(), vbn.toString(), amount.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlSplitLargeMcb(mcb: COpaquePointer?, vbn: Long, amount: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlSplitLargeMcb((mcb?.value ?: 0L).toString(), vbn.toString(), amount.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlTeardownPerFileContexts(perfilecontextpointer: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlTeardownPerFileContexts((perfilecontextpointer?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlTeardownPerStreamContexts(advancedheader: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlTeardownPerStreamContexts((advancedheader?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlTruncateBaseMcb(mcb: COpaquePointer?, vbn: Long) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlTruncateBaseMcb((mcb?.value ?: 0L).toString(), vbn.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlTruncateLargeMcb(mcb: COpaquePointer?, vbn: Long) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlTruncateLargeMcb((mcb?.value ?: 0L).toString(), vbn.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlTruncateMcb(mcb: COpaquePointer?, vbn: UInt) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlTruncateMcb((mcb?.value ?: 0L).toString(), vbn.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlUninitializeBaseMcb(mcb: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlUninitializeBaseMcb((mcb?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlUninitializeFileLock(filelock: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlUninitializeFileLock((filelock?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlUninitializeLargeMcb(mcb: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlUninitializeLargeMcb((mcb?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlUninitializeMcb(mcb: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlUninitializeMcb((mcb?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlUninitializeOplock(oplock: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlUninitializeOplock((oplock?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlUpdateDiskCounters(bytesread: ULong, byteswritten: ULong) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlUpdateDiskCounters(bytesread.toString(), byteswritten.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlUpperOplockFsctrl(oplock: COpaquePointer?, irp: COpaquePointer?, opencount: UInt, loweroplockstate: UInt, flags: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlUpperOplockFsctrl((oplock?.value ?: 0L).toString(), (irp?.value ?: 0L).toString(), opencount.toInt(), loweroplockstate.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlValidateReparsePointBuffer(bufferlength: UInt, reparsebuffer: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlValidateReparsePointBuffer(bufferlength.toInt(), (reparsebuffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlVolumeDeviceToCorrelationId(volumedeviceobject: COpaquePointer?, guid: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_fsRtlVolumeDeviceToCorrelationId((volumedeviceobject?.value ?: 0L).toString(), (guid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSecurityUserInfo(logonid: COpaquePointer?, flags: UInt, userinformation: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_getSecurityUserInfo((logonid?.value ?: 0L).toString(), flags.toInt(), (userinformation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAcquireVpbSpinLock(irql: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_ioAcquireVpbSpinLock((irql?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioApplyPriorityInfoThread(inputpriorityinfo: COpaquePointer?, outputpriorityinfo: COpaquePointer?, thread: Pethread): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ioApplyPriorityInfoThread((inputpriorityinfo?.value ?: 0L).toString(), (outputpriorityinfo?.value ?: 0L).toString(), thread.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCheckDesiredAccess(desiredaccess: COpaquePointer?, grantedaccess: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ioCheckDesiredAccess((desiredaccess?.value ?: 0L).toString(), grantedaccess.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCheckEaBufferValidity(eabuffer: COpaquePointer?, ealength: UInt, erroroffset: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ioCheckEaBufferValidity((eabuffer?.value ?: 0L).toString(), ealength.toInt(), (erroroffset?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCheckFunctionAccess(grantedaccess: UInt, majorfunction: UByte, minorfunction: UByte, iocontrolcode: UInt, arg1: COpaquePointer?, arg2: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ioCheckFunctionAccess(grantedaccess.toInt(), majorfunction.toInt(), minorfunction.toInt(), iocontrolcode.toInt(), (arg1?.value ?: 0L).toString(), (arg2?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCheckQuerySetFileInformation(fileinformationclass: FileInformationClass, length: UInt, setoperation: Boolean): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ioCheckQuerySetFileInformation(fileinformationclass, length.toInt(), setoperation) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCheckQuerySetVolumeInformation(fsinformationclass: FsInformationClass, length: UInt, setoperation: Boolean): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ioCheckQuerySetVolumeInformation(fsinformationclass, length.toInt(), setoperation) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCheckQuotaBufferValidity(quotabuffer: COpaquePointer?, quotalength: UInt, erroroffset: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ioCheckQuotaBufferValidity((quotabuffer?.value ?: 0L).toString(), quotalength.toInt(), (erroroffset?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioClearFsTrackOffsetState(irp: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ioClearFsTrackOffsetState((irp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCreateStreamFileObject(fileobject: COpaquePointer?, deviceobject: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ioCreateStreamFileObject((fileobject?.value ?: 0L).toString(), (deviceobject?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCreateStreamFileObjectEx(fileobject: COpaquePointer?, deviceobject: COpaquePointer?, filehandle: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ioCreateStreamFileObjectEx((fileobject?.value ?: 0L).toString(), (deviceobject?.value ?: 0L).toString(), (filehandle?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCreateStreamFileObjectEx2(createoptions: COpaquePointer?, fileobject: COpaquePointer?, deviceobject: COpaquePointer?, streamfileobject: COpaquePointer?, filehandle: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ioCreateStreamFileObjectEx2((createoptions?.value ?: 0L).toString(), (fileobject?.value ?: 0L).toString(), (deviceobject?.value ?: 0L).toString(), (streamfileobject?.value ?: 0L).toString(), (filehandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCreateStreamFileObjectLite(fileobject: COpaquePointer?, deviceobject: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ioCreateStreamFileObjectLite((fileobject?.value ?: 0L).toString(), (deviceobject?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioEnumerateDeviceObjectList(driverobject: COpaquePointer?, deviceobjectlist: COpaquePointer?, deviceobjectlistsize: UInt, actualnumberdeviceobjects: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ioEnumerateDeviceObjectList((driverobject?.value ?: 0L).toString(), (deviceobjectlist?.value ?: 0L).toString(), deviceobjectlistsize.toInt(), (actualnumberdeviceobjects?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioEnumerateRegisteredFiltersList(driverobjectlist: COpaquePointer?, driverobjectlistsize: UInt, actualnumberdriverobjects: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ioEnumerateRegisteredFiltersList((driverobjectlist?.value ?: 0L).toString(), driverobjectlistsize.toInt(), (actualnumberdriverobjects?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioFastQueryNetworkAttributes(objectattributes: COpaquePointer?, desiredaccess: UInt, openoptions: UInt, iostatus: COpaquePointer?, buffer: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ioFastQueryNetworkAttributes((objectattributes?.value ?: 0L).toString(), desiredaccess.toInt(), openoptions.toInt(), (iostatus?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetAttachedDevice(deviceobject: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ioGetAttachedDevice((deviceobject?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetBaseFileSystemDeviceObject(fileobject: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ioGetBaseFileSystemDeviceObject((fileobject?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetDeviceAttachmentBaseRef(deviceobject: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ioGetDeviceAttachmentBaseRef((deviceobject?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetDeviceToVerify(thread: Pethread): COpaquePointer? =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ioGetDeviceToVerify(thread.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetDiskDeviceObject(filesystemdeviceobject: COpaquePointer?, diskdeviceobject: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ioGetDiskDeviceObject((filesystemdeviceobject?.value ?: 0L).toString(), (diskdeviceobject?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetFsTrackOffsetState(irp: COpaquePointer?, retfstrackoffsetblob: COpaquePointer?, rettrackedoffset: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ioGetFsTrackOffsetState((irp?.value ?: 0L).toString(), (retfstrackoffsetblob?.value ?: 0L).toString(), (rettrackedoffset?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetLowerDeviceObject(deviceobject: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ioGetLowerDeviceObject((deviceobject?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetOplockKeyContext(fileobject: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ioGetOplockKeyContext((fileobject?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetOplockKeyContextEx(fileobject: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ioGetOplockKeyContextEx((fileobject?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetRequestorProcess(irp: COpaquePointer?): Peprocess =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ioGetRequestorProcess((irp?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetRequestorProcessId(irp: COpaquePointer?): UInt =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ioGetRequestorProcessId((irp?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetRequestorSessionId(irp: COpaquePointer?, psessionid: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ioGetRequestorSessionId((irp?.value ?: 0L).toString(), (psessionid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioIrpHasFsTrackOffsetExtensionType(irp: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ioIrpHasFsTrackOffsetExtensionType((irp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioIsOperationSynchronous(irp: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ioIsOperationSynchronous((irp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioIsSystemThread(thread: Pethread): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ioIsSystemThread(thread.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioIsValidNameGraftingBuffer(irp: COpaquePointer?, reparsebuffer: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ioIsValidNameGraftingBuffer((irp?.value ?: 0L).toString(), (reparsebuffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioPageRead(fileobject: COpaquePointer?, memorydescriptorlist: COpaquePointer?, startingoffset: COpaquePointer?, event: COpaquePointer?, iostatusblock: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ioPageRead((fileobject?.value ?: 0L).toString(), (memorydescriptorlist?.value ?: 0L).toString(), (startingoffset?.value ?: 0L).toString(), (event?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioQueryFileDosDeviceName(fileobject: COpaquePointer?, objectnameinformation: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ioQueryFileDosDeviceName((fileobject?.value ?: 0L).toString(), (objectnameinformation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioQueryFileInformation(fileobject: COpaquePointer?, fileinformationclass: FileInformationClass, length: UInt, fileinformation: COpaquePointer?, returnedlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ioQueryFileInformation((fileobject?.value ?: 0L).toString(), fileinformationclass, length.toInt(), (fileinformation?.value ?: 0L).toString(), (returnedlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioQueryVolumeInformation(fileobject: COpaquePointer?, fsinformationclass: FsInformationClass, length: UInt, fsinformation: COpaquePointer?, returnedlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ioQueryVolumeInformation((fileobject?.value ?: 0L).toString(), fsinformationclass, length.toInt(), (fsinformation?.value ?: 0L).toString(), (returnedlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioQueueThreadIrp(irp: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_ioQueueThreadIrp((irp?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioRegisterFileSystem(deviceobject: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_ioRegisterFileSystem((deviceobject?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioRegisterFsRegistrationChange(driverobject: COpaquePointer?, drivernotificationroutine: DriverFsNotification): Ntstatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioRegisterFsRegistrationChangeMountAware(driverobject: COpaquePointer?, drivernotificationroutine: DriverFsNotification, synchronizewithmounts: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioReleaseVpbSpinLock(irql: UByte) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_ioReleaseVpbSpinLock(irql.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioReplaceFileObjectName(fileobject: COpaquePointer?, newfilename: Pcwstr, filenamelength: UShort): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ioReplaceFileObjectName((fileobject?.value ?: 0L).toString(), (newfilename?.value ?: 0L).toString(), filenamelength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioRequestDeviceRemovalForReset(physicaldeviceobject: COpaquePointer?, flags: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ioRequestDeviceRemovalForReset((physicaldeviceobject?.value ?: 0L).toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioRetrievePriorityInfo(irp: COpaquePointer?, fileobject: COpaquePointer?, thread: Pethread, priorityinfo: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ioRetrievePriorityInfo((irp?.value ?: 0L).toString(), (fileobject?.value ?: 0L).toString(), thread.toString(), (priorityinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetDeviceToVerify(thread: Pethread, deviceobject: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_ioSetDeviceToVerify(thread.toString(), (deviceobject?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioSetFsTrackOffsetState(irp: COpaquePointer?, fstrackoffsetblob: COpaquePointer?, trackedoffset: Long): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ioSetFsTrackOffsetState((irp?.value ?: 0L).toString(), (fstrackoffsetblob?.value ?: 0L).toString(), trackedoffset.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetInformation(fileobject: COpaquePointer?, fileinformationclass: FileInformationClass, length: UInt, fileinformation: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ioSetInformation((fileobject?.value ?: 0L).toString(), fileinformationclass, length.toInt(), (fileinformation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSynchronousPageWrite(fileobject: COpaquePointer?, memorydescriptorlist: COpaquePointer?, startingoffset: COpaquePointer?, event: COpaquePointer?, iostatusblock: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ioSynchronousPageWrite((fileobject?.value ?: 0L).toString(), (memorydescriptorlist?.value ?: 0L).toString(), (startingoffset?.value ?: 0L).toString(), (event?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioThreadToProcess(thread: Pethread): Peprocess =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ioThreadToProcess(thread.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioUnregisterFileSystem(deviceobject: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_ioUnregisterFileSystem((deviceobject?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioUnregisterFsRegistrationChange(driverobject: COpaquePointer?, drivernotificationroutine: DriverFsNotification) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun ioVerifyVolume(deviceobject: COpaquePointer?, allowrawmount: Boolean): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ioVerifyVolume((deviceobject?.value ?: 0L).toString(), allowrawmount) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keAcquireQueuedSpinLock(number: KspinLockQueueNumber): UByte =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_keAcquireQueuedSpinLock(number).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keAcquireSpinLockRaiseToSynch(spinlock: COpaquePointer?): UByte =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_keAcquireSpinLockRaiseToSynch((spinlock?.value ?: 0L).toString()).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keAttachProcess(process: Prkprocess) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_keAttachProcess(process.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keDetachProcess() {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_keDetachProcess()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keInitializeMutant(mutant: COpaquePointer?, initialowner: Boolean) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_keInitializeMutant((mutant?.value ?: 0L).toString(), initialowner)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keInitializeQueue(queue: COpaquePointer?, count: UInt) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_keInitializeQueue((queue?.value ?: 0L).toString(), count.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keInsertHeadQueue(queue: COpaquePointer?, entry: COpaquePointer?): Int =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_keInsertHeadQueue((queue?.value ?: 0L).toString(), (entry?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keInsertQueue(queue: COpaquePointer?, entry: COpaquePointer?): Int =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_keInsertQueue((queue?.value ?: 0L).toString(), (entry?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keReadStateMutant(mutant: COpaquePointer?): Int =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_keReadStateMutant((mutant?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keReadStateQueue(queue: COpaquePointer?): Int =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_keReadStateQueue((queue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keReleaseMutant(mutant: COpaquePointer?, increment: Int, abandoned: Boolean, wait: Boolean): Int =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_keReleaseMutant((mutant?.value ?: 0L).toString(), increment, abandoned, wait) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keReleaseQueuedSpinLock(number: KspinLockQueueNumber, oldirql: UByte) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_keReleaseQueuedSpinLock(number, oldirql.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keRemoveQueue(queue: COpaquePointer?, waitmode: Byte, timeout: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_keRemoveQueue((queue?.value ?: 0L).toString(), waitmode.toInt(), (timeout?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keRemoveQueueEx(queue: COpaquePointer?, waitmode: Byte, alertable: Boolean, timeout: COpaquePointer?, entryarray: COpaquePointer?, count: UInt): UInt =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_keRemoveQueueEx((queue?.value ?: 0L).toString(), waitmode.toInt(), alertable, (timeout?.value ?: 0L).toString(), (entryarray?.value ?: 0L).toString(), count.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keRundownQueue(queue: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_keRundownQueue((queue?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keSetIdealProcessorThread(thread: Pkthread, processor: UByte): UByte =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_keSetIdealProcessorThread(thread.toString(), processor.toInt()).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keSetKernelStackSwapEnable(enable: Boolean): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_keSetKernelStackSwapEnable(enable) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keStackAttachProcess(process: Prkprocess, apcstate: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_keStackAttachProcess(process.toString(), (apcstate?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keTryToAcquireQueuedSpinLock(number: KspinLockQueueNumber, oldirql: COpaquePointer?): UInt =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_keTryToAcquireQueuedSpinLock(number, (oldirql?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keUnstackDetachProcess(apcstate: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_keUnstackDetachProcess((apcstate?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun makeSignature(phcontext: COpaquePointer?, fqop: UInt, pmessage: COpaquePointer?, messageseqno: UInt): Hresult =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_makeSignature((phcontext?.value ?: 0L).toString(), fqop.toInt(), (pmessage?.value ?: 0L).toString(), messageseqno.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapSecurityError(secstatus: Hresult): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_mapSecurityError(secstatus) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmCanFileBeTruncated(sectionpointer: COpaquePointer?, newfilesize: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_mmCanFileBeTruncated((sectionpointer?.value ?: 0L).toString(), (newfilesize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmDoesFileHaveUserWritableReferences(sectionpointer: COpaquePointer?): UInt =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_mmDoesFileHaveUserWritableReferences((sectionpointer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmFlushImageSection(sectionobjectpointer: COpaquePointer?, flushtype: MmflushType): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_mmFlushImageSection((sectionobjectpointer?.value ?: 0L).toString(), flushtype) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmForceSectionClosed(sectionobjectpointer: COpaquePointer?, delayclose: Boolean): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_mmForceSectionClosed((sectionobjectpointer?.value ?: 0L).toString(), delayclose) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmForceSectionClosedEx(sectionobjectpointer: COpaquePointer?, forcecloseflags: UInt): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_mmForceSectionClosedEx((sectionobjectpointer?.value ?: 0L).toString(), forcecloseflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmGetMaximumFileSectionSize(): ULong =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_mmGetMaximumFileSectionSize().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmIsFileSectionActive(fssectionpointer: COpaquePointer?, flags: UInt, sectionisactive: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_mmIsFileSectionActive((fssectionpointer?.value ?: 0L).toString(), flags.toInt(), (sectionisactive?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmIsRecursiveIoFault(): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_mmIsRecursiveIoFault() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmMdlPagesAreZero(mdl: COpaquePointer?): UInt =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_mmMdlPagesAreZero((mdl?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmPrefetchPages(numberoflists: UInt, readlists: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_mmPrefetchPages(numberoflists.toInt(), (readlists?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmSetAddressRangeModified(address: COpaquePointer?, length: ULong): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_mmSetAddressRangeModified((address?.value ?: 0L).toString(), length.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntAccessCheckAndAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, objecttypename: COpaquePointer?, objectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, desiredaccess: UInt, genericmapping: COpaquePointer?, objectcreation: Boolean, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, generateonclose: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntAccessCheckAndAuditAlarm((subsystemname?.value ?: 0L).toString(), (handleid?.value ?: 0L).toString(), (objecttypename?.value ?: 0L).toString(), (objectname?.value ?: 0L).toString(), (securitydescriptor?.value ?: 0L).toString(), desiredaccess.toInt(), (genericmapping?.value ?: 0L).toString(), objectcreation, (grantedaccess?.value ?: 0L).toString(), (accessstatus?.value ?: 0L).toString(), (generateonclose?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntAccessCheckByTypeAndAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, objecttypename: COpaquePointer?, objectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Boolean, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, generateonclose: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntAccessCheckByTypeAndAuditAlarm((subsystemname?.value ?: 0L).toString(), (handleid?.value ?: 0L).toString(), (objecttypename?.value ?: 0L).toString(), (objectname?.value ?: 0L).toString(), (securitydescriptor?.value ?: 0L).toString(), (principalselfsid?.value ?: 0L).toString(), desiredaccess.toInt(), audittype, flags.toInt(), (objecttypelist?.value ?: 0L).toString(), objecttypelistlength.toInt(), (genericmapping?.value ?: 0L).toString(), objectcreation, (grantedaccess?.value ?: 0L).toString(), (accessstatus?.value ?: 0L).toString(), (generateonclose?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntAccessCheckByTypeResultListAndAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, objecttypename: COpaquePointer?, objectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Boolean, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, generateonclose: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntAccessCheckByTypeResultListAndAuditAlarm((subsystemname?.value ?: 0L).toString(), (handleid?.value ?: 0L).toString(), (objecttypename?.value ?: 0L).toString(), (objectname?.value ?: 0L).toString(), (securitydescriptor?.value ?: 0L).toString(), (principalselfsid?.value ?: 0L).toString(), desiredaccess.toInt(), audittype, flags.toInt(), (objecttypelist?.value ?: 0L).toString(), objecttypelistlength.toInt(), (genericmapping?.value ?: 0L).toString(), objectcreation, (grantedaccess?.value ?: 0L).toString(), (accessstatus?.value ?: 0L).toString(), (generateonclose?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname: COpaquePointer?, handleid: COpaquePointer?, clienttoken: Handle, objecttypename: COpaquePointer?, objectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Boolean, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, generateonclose: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntAccessCheckByTypeResultListAndAuditAlarmByHandle((subsystemname?.value ?: 0L).toString(), (handleid?.value ?: 0L).toString(), (clienttoken?.value ?: 0L).toString(), (objecttypename?.value ?: 0L).toString(), (objectname?.value ?: 0L).toString(), (securitydescriptor?.value ?: 0L).toString(), (principalselfsid?.value ?: 0L).toString(), desiredaccess.toInt(), audittype, flags.toInt(), (objecttypelist?.value ?: 0L).toString(), objecttypelistlength.toInt(), (genericmapping?.value ?: 0L).toString(), objectcreation, (grantedaccess?.value ?: 0L).toString(), (accessstatus?.value ?: 0L).toString(), (generateonclose?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntAdjustGroupsToken(tokenhandle: Handle, resettodefault: Boolean, newstate: COpaquePointer?, bufferlength: UInt, previousstate: COpaquePointer?, returnlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntAdjustGroupsToken((tokenhandle?.value ?: 0L).toString(), resettodefault, (newstate?.value ?: 0L).toString(), bufferlength.toInt(), (previousstate?.value ?: 0L).toString(), (returnlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntAdjustPrivilegesToken(tokenhandle: Handle, disableallprivileges: Boolean, newstate: COpaquePointer?, bufferlength: UInt, previousstate: COpaquePointer?, returnlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntAdjustPrivilegesToken((tokenhandle?.value ?: 0L).toString(), disableallprivileges, (newstate?.value ?: 0L).toString(), bufferlength.toInt(), (previousstate?.value ?: 0L).toString(), (returnlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntAllocateVirtualMemory(processhandle: Handle, baseaddress: COpaquePointer?, zerobits: ULong, regionsize: COpaquePointer?, allocationtype: UInt, protect: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntAllocateVirtualMemory((processhandle?.value ?: 0L).toString(), (baseaddress?.value ?: 0L).toString(), zerobits.toString(), (regionsize?.value ?: 0L).toString(), allocationtype.toInt(), protect.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntAllocateVirtualMemoryEx(processhandle: Handle, baseaddress: COpaquePointer?, regionsize: COpaquePointer?, allocationtype: UInt, pageprotection: UInt, extendedparameters: COpaquePointer?, extendedparametercount: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntAllocateVirtualMemoryEx((processhandle?.value ?: 0L).toString(), (baseaddress?.value ?: 0L).toString(), (regionsize?.value ?: 0L).toString(), allocationtype.toInt(), pageprotection.toInt(), (extendedparameters?.value ?: 0L).toString(), extendedparametercount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCancelIoFileEx(filehandle: Handle, iorequesttocancel: COpaquePointer?, iostatusblock: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntCancelIoFileEx((filehandle?.value ?: 0L).toString(), (iorequesttocancel?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCloseObjectAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, generateonclose: Boolean): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntCloseObjectAuditAlarm((subsystemname?.value ?: 0L).toString(), (handleid?.value ?: 0L).toString(), generateonclose) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCreateDirectoryObject(directoryhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntCreateDirectoryObject((directoryhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCreateEvent(eventhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, eventtype: EventType, initialstate: Boolean): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntCreateEvent((eventhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), eventtype, initialstate) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCreateFile(filehandle: COpaquePointer?, desiredaccess: FileAccessRights, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, allocationsize: COpaquePointer?, fileattributes: FileFlagsAndAttributes, shareaccess: FileShareMode, createdisposition: NtcreatefileCreateDisposition, createoptions: NtcreatefileCreateOptions, eabuffer: COpaquePointer?, ealength: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntCreateFile((filehandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), (allocationsize?.value ?: 0L).toString(), fileattributes.toInt(), shareaccess.toInt(), createdisposition.toInt(), createoptions.toInt(), (eabuffer?.value ?: 0L).toString(), ealength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCreateSection(sectionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, maximumsize: COpaquePointer?, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Handle): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntCreateSection((sectionhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), (maximumsize?.value ?: 0L).toString(), sectionpageprotection.toInt(), allocationattributes.toInt(), (filehandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCreateSectionEx(sectionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, maximumsize: COpaquePointer?, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Handle, extendedparameters: COpaquePointer?, extendedparametercount: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntCreateSectionEx((sectionhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), (maximumsize?.value ?: 0L).toString(), sectionpageprotection.toInt(), allocationattributes.toInt(), (filehandle?.value ?: 0L).toString(), (extendedparameters?.value ?: 0L).toString(), extendedparametercount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntDeleteFile(objectattributes: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntDeleteFile((objectattributes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntDeleteObjectAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, generateonclose: Boolean): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntDeleteObjectAuditAlarm((subsystemname?.value ?: 0L).toString(), (handleid?.value ?: 0L).toString(), generateonclose) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntDuplicateObject(sourceprocesshandle: Handle, sourcehandle: Handle, targetprocesshandle: Handle, targethandle: COpaquePointer?, desiredaccess: UInt, handleattributes: UInt, options: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntDuplicateObject((sourceprocesshandle?.value ?: 0L).toString(), (sourcehandle?.value ?: 0L).toString(), (targetprocesshandle?.value ?: 0L).toString(), (targethandle?.value ?: 0L).toString(), desiredaccess.toInt(), handleattributes.toInt(), options.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntDuplicateToken(existingtokenhandle: Handle, desiredaccess: UInt, objectattributes: COpaquePointer?, effectiveonly: Boolean, tokentype: TokenType, newtokenhandle: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntDuplicateToken((existingtokenhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), effectiveonly, tokentype, (newtokenhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntFilterToken(existingtokenhandle: Handle, flags: UInt, sidstodisable: COpaquePointer?, privilegestodelete: COpaquePointer?, restrictedsids: COpaquePointer?, newtokenhandle: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntFilterToken((existingtokenhandle?.value ?: 0L).toString(), flags.toInt(), (sidstodisable?.value ?: 0L).toString(), (privilegestodelete?.value ?: 0L).toString(), (restrictedsids?.value ?: 0L).toString(), (newtokenhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntFlushBuffersFile(filehandle: Handle, iostatusblock: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntFlushBuffersFile((filehandle?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntFlushBuffersFileEx(filehandle: Handle, flags: UInt, parameters: COpaquePointer?, parameterssize: UInt, iostatusblock: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntFlushBuffersFileEx((filehandle?.value ?: 0L).toString(), flags.toInt(), (parameters?.value ?: 0L).toString(), parameterssize.toInt(), (iostatusblock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntFlushVirtualMemory(processhandle: Handle, baseaddress: COpaquePointer?, regionsize: COpaquePointer?, iostatus: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntFlushVirtualMemory((processhandle?.value ?: 0L).toString(), (baseaddress?.value ?: 0L).toString(), (regionsize?.value ?: 0L).toString(), (iostatus?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntFreeVirtualMemory(processhandle: Handle, baseaddress: COpaquePointer?, regionsize: COpaquePointer?, freetype: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntFreeVirtualMemory((processhandle?.value ?: 0L).toString(), (baseaddress?.value ?: 0L).toString(), (regionsize?.value ?: 0L).toString(), freetype.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntFsControlFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, fscontrolcode: UInt, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntFsControlFile((filehandle?.value ?: 0L).toString(), (event?.value ?: 0L).toString(), 0L.toString(), (apccontext?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), fscontrolcode.toInt(), (inputbuffer?.value ?: 0L).toString(), inputbufferlength.toInt(), (outputbuffer?.value ?: 0L).toString(), outputbufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntImpersonateAnonymousToken(threadhandle: Handle): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntImpersonateAnonymousToken((threadhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntLockFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, byteoffset: COpaquePointer?, length: COpaquePointer?, key: UInt, failimmediately: Boolean, exclusivelock: Boolean): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntLockFile((filehandle?.value ?: 0L).toString(), (event?.value ?: 0L).toString(), 0L.toString(), (apccontext?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), (byteoffset?.value ?: 0L).toString(), (length?.value ?: 0L).toString(), key.toInt(), failimmediately, exclusivelock) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntNotifyChangeKey(keyhandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, completionfilter: UInt, watchtree: Boolean, buffer: COpaquePointer?, buffersize: UInt, asynchronous: Boolean): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntNotifyChangeKey((keyhandle?.value ?: 0L).toString(), (event?.value ?: 0L).toString(), 0L.toString(), (apccontext?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), completionfilter.toInt(), watchtree, (buffer?.value ?: 0L).toString(), buffersize.toInt(), asynchronous) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenDirectoryObject(directoryhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntOpenDirectoryObject((directoryhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenFile(filehandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, shareaccess: UInt, openoptions: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntOpenFile((filehandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), shareaccess.toInt(), openoptions.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenObjectAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, objecttypename: COpaquePointer?, objectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, grantedaccess: UInt, privileges: COpaquePointer?, objectcreation: Boolean, accessgranted: Boolean, generateonclose: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntOpenObjectAuditAlarm((subsystemname?.value ?: 0L).toString(), (handleid?.value ?: 0L).toString(), (objecttypename?.value ?: 0L).toString(), (objectname?.value ?: 0L).toString(), (securitydescriptor?.value ?: 0L).toString(), (clienttoken?.value ?: 0L).toString(), desiredaccess.toInt(), grantedaccess.toInt(), (privileges?.value ?: 0L).toString(), objectcreation, accessgranted, (generateonclose?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenProcessToken(processhandle: Handle, desiredaccess: UInt, tokenhandle: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntOpenProcessToken((processhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (tokenhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenProcessTokenEx(processhandle: Handle, desiredaccess: UInt, handleattributes: UInt, tokenhandle: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntOpenProcessTokenEx((processhandle?.value ?: 0L).toString(), desiredaccess.toInt(), handleattributes.toInt(), (tokenhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenSymbolicLinkObject(linkhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntOpenSymbolicLinkObject((linkhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenThreadToken(threadhandle: Handle, desiredaccess: UInt, openasself: Boolean, tokenhandle: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntOpenThreadToken((threadhandle?.value ?: 0L).toString(), desiredaccess.toInt(), openasself, (tokenhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenThreadTokenEx(threadhandle: Handle, desiredaccess: UInt, openasself: Boolean, handleattributes: UInt, tokenhandle: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntOpenThreadTokenEx((threadhandle?.value ?: 0L).toString(), desiredaccess.toInt(), openasself, handleattributes.toInt(), (tokenhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntPrivilegeCheck(clienttoken: Handle, requiredprivileges: COpaquePointer?, result: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntPrivilegeCheck((clienttoken?.value ?: 0L).toString(), (requiredprivileges?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntPrivilegeObjectAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, clienttoken: Handle, desiredaccess: UInt, privileges: COpaquePointer?, accessgranted: Boolean): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntPrivilegeObjectAuditAlarm((subsystemname?.value ?: 0L).toString(), (handleid?.value ?: 0L).toString(), (clienttoken?.value ?: 0L).toString(), desiredaccess.toInt(), (privileges?.value ?: 0L).toString(), accessgranted) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntPrivilegedServiceAuditAlarm(subsystemname: COpaquePointer?, servicename: COpaquePointer?, clienttoken: Handle, privileges: COpaquePointer?, accessgranted: Boolean): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntPrivilegedServiceAuditAlarm((subsystemname?.value ?: 0L).toString(), (servicename?.value ?: 0L).toString(), (clienttoken?.value ?: 0L).toString(), (privileges?.value ?: 0L).toString(), accessgranted) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryDirectoryFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass, returnsingleentry: Boolean, filename: COpaquePointer?, restartscan: Boolean): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntQueryDirectoryFile((filehandle?.value ?: 0L).toString(), (event?.value ?: 0L).toString(), 0L.toString(), (apccontext?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), (fileinformation?.value ?: 0L).toString(), length.toInt(), fileinformationclass, returnsingleentry, (filename?.value ?: 0L).toString(), restartscan) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryDirectoryFileEx(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass, queryflags: UInt, filename: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntQueryDirectoryFileEx((filehandle?.value ?: 0L).toString(), (event?.value ?: 0L).toString(), 0L.toString(), (apccontext?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), (fileinformation?.value ?: 0L).toString(), length.toInt(), fileinformationclass, queryflags.toInt(), (filename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryDirectoryObject(directoryhandle: Handle, buffer: COpaquePointer?, length: UInt, returnsingleentry: Boolean, restartscan: Boolean, context: COpaquePointer?, returnlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntQueryDirectoryObject((directoryhandle?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), length.toInt(), returnsingleentry, restartscan, (context?.value ?: 0L).toString(), (returnlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryEaFile(filehandle: Handle, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt, returnsingleentry: Boolean, ealist: COpaquePointer?, ealistlength: UInt, eaindex: COpaquePointer?, restartscan: Boolean): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntQueryEaFile((filehandle?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), length.toInt(), returnsingleentry, (ealist?.value ?: 0L).toString(), ealistlength.toInt(), (eaindex?.value ?: 0L).toString(), restartscan) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryFullAttributesFile(objectattributes: COpaquePointer?, fileinformation: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntQueryFullAttributesFile((objectattributes?.value ?: 0L).toString(), (fileinformation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryInformationByName(objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntQueryInformationByName((objectattributes?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), (fileinformation?.value ?: 0L).toString(), length.toInt(), fileinformationclass) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntQueryInformationFile((filehandle?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), (fileinformation?.value ?: 0L).toString(), length.toInt(), fileinformationclass) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryInformationToken(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: COpaquePointer?, tokeninformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntQueryInformationToken((tokenhandle?.value ?: 0L).toString(), tokeninformationclass, (tokeninformation?.value ?: 0L).toString(), tokeninformationlength.toInt(), (returnlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryQuotaInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt, returnsingleentry: Boolean, sidlist: COpaquePointer?, sidlistlength: UInt, startsid: Psid, restartscan: Boolean): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntQueryQuotaInformationFile((filehandle?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), length.toInt(), returnsingleentry, (sidlist?.value ?: 0L).toString(), sidlistlength.toInt(), (startsid?.value ?: 0L).toString(), restartscan) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQuerySecurityObject(handle: Handle, securityinformation: UInt, securitydescriptor: PsecurityDescriptor, length: UInt, lengthneeded: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntQuerySecurityObject((handle?.value ?: 0L).toString(), securityinformation.toInt(), (securitydescriptor?.value ?: 0L).toString(), length.toInt(), (lengthneeded?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQuerySymbolicLinkObject(linkhandle: Handle, linktarget: COpaquePointer?, returnedlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntQuerySymbolicLinkObject((linkhandle?.value ?: 0L).toString(), (linktarget?.value ?: 0L).toString(), (returnedlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryVirtualMemory(processhandle: Handle, baseaddress: COpaquePointer?, memoryinformationclass: MemoryInformationClass, memoryinformation: COpaquePointer?, memoryinformationlength: ULong, returnlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntQueryVirtualMemory((processhandle?.value ?: 0L).toString(), (baseaddress?.value ?: 0L).toString(), memoryinformationclass, (memoryinformation?.value ?: 0L).toString(), memoryinformationlength.toString(), (returnlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryVolumeInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, fsinformation: COpaquePointer?, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntQueryVolumeInformationFile((filehandle?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), (fsinformation?.value ?: 0L).toString(), length.toInt(), fsinformationclass) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntReadFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt, byteoffset: COpaquePointer?, key: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntReadFile((filehandle?.value ?: 0L).toString(), (event?.value ?: 0L).toString(), 0L.toString(), (apccontext?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), length.toInt(), (byteoffset?.value ?: 0L).toString(), (key?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetEaFile(filehandle: Handle, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntSetEaFile((filehandle?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), length.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetEvent(eventhandle: Handle, previousstate: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntSetEvent((eventhandle?.value ?: 0L).toString(), (previousstate?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntSetInformationFile((filehandle?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), (fileinformation?.value ?: 0L).toString(), length.toInt(), fileinformationclass) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetInformationToken(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: COpaquePointer?, tokeninformationlength: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntSetInformationToken((tokenhandle?.value ?: 0L).toString(), tokeninformationclass, (tokeninformation?.value ?: 0L).toString(), tokeninformationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetInformationVirtualMemory(processhandle: Handle, vminformationclass: VirtualMemoryInformationClass, numberofentries: ULong, virtualaddresses: COpaquePointer?, vminformation: COpaquePointer?, vminformationlength: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntSetInformationVirtualMemory((processhandle?.value ?: 0L).toString(), vminformationclass, numberofentries.toString(), (virtualaddresses?.value ?: 0L).toString(), (vminformation?.value ?: 0L).toString(), vminformationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetQuotaInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntSetQuotaInformationFile((filehandle?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), length.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetSecurityObject(handle: Handle, securityinformation: UInt, securitydescriptor: PsecurityDescriptor): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntSetSecurityObject((handle?.value ?: 0L).toString(), securityinformation.toInt(), (securitydescriptor?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetVolumeInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, fsinformation: COpaquePointer?, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntSetVolumeInformationFile((filehandle?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), (fsinformation?.value ?: 0L).toString(), length.toInt(), fsinformationclass) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntUnlockFile(filehandle: Handle, iostatusblock: COpaquePointer?, byteoffset: COpaquePointer?, length: COpaquePointer?, key: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntUnlockFile((filehandle?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), (byteoffset?.value ?: 0L).toString(), (length?.value ?: 0L).toString(), key.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntWriteFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt, byteoffset: COpaquePointer?, key: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_ntWriteFile((filehandle?.value ?: 0L).toString(), (event?.value ?: 0L).toString(), 0L.toString(), (apccontext?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), length.toInt(), (byteoffset?.value ?: 0L).toString(), (key?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obInsertObject(obj: COpaquePointer?, passedaccessstate: COpaquePointer?, desiredaccess: UInt, objectpointerbias: UInt, newobject: COpaquePointer?, handle: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_obInsertObject((obj?.value ?: 0L).toString(), (passedaccessstate?.value ?: 0L).toString(), desiredaccess.toInt(), objectpointerbias.toInt(), (newobject?.value ?: 0L).toString(), (handle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obIsKernelHandle(handle: Handle): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_obIsKernelHandle((handle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obMakeTemporaryObject(obj: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_obMakeTemporaryObject((obj?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun obOpenObjectByPointer(obj: COpaquePointer?, handleattributes: UInt, passedaccessstate: COpaquePointer?, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, handle: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_obOpenObjectByPointer((obj?.value ?: 0L).toString(), handleattributes.toInt(), (passedaccessstate?.value ?: 0L).toString(), desiredaccess.toInt(), objecttype.toString(), accessmode.toInt(), (handle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obOpenObjectByPointerWithTag(obj: COpaquePointer?, handleattributes: UInt, passedaccessstate: COpaquePointer?, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, tag: UInt, handle: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_obOpenObjectByPointerWithTag((obj?.value ?: 0L).toString(), handleattributes.toInt(), (passedaccessstate?.value ?: 0L).toString(), desiredaccess.toInt(), objecttype.toString(), accessmode.toInt(), tag.toInt(), (handle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obQueryNameString(obj: COpaquePointer?, objectnameinfo: COpaquePointer?, length: UInt, returnlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_obQueryNameString((obj?.value ?: 0L).toString(), (objectnameinfo?.value ?: 0L).toString(), length.toInt(), (returnlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obQueryObjectAuditingByHandle(handle: Handle, generateonclose: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_obQueryObjectAuditingByHandle((handle?.value ?: 0L).toString(), (generateonclose?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfxFindPrefix(prefixtable: COpaquePointer?, fullname: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_pfxFindPrefix((prefixtable?.value ?: 0L).toString(), (fullname?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfxInitialize(prefixtable: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_pfxInitialize((prefixtable?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pfxInsertPrefix(prefixtable: COpaquePointer?, prefix: COpaquePointer?, prefixtableentry: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_pfxInsertPrefix((prefixtable?.value ?: 0L).toString(), (prefix?.value ?: 0L).toString(), (prefixtableentry?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfxRemovePrefix(prefixtable: COpaquePointer?, prefixtableentry: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_pfxRemovePrefix((prefixtable?.value ?: 0L).toString(), (prefixtableentry?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poQueueShutdownWorkItem(workitem: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_poQueueShutdownWorkItem((workitem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psAssignImpersonationToken(thread: Pethread, token: Handle): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_psAssignImpersonationToken(thread.toString(), (token?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psChargePoolQuota(process: Peprocess, pooltype: PoolType, amount: ULong) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_psChargePoolQuota(process.toString(), pooltype, amount.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun psChargeProcessPoolQuota(process: Peprocess, pooltype: PoolType, amount: ULong): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_psChargeProcessPoolQuota(process.toString(), pooltype, amount.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psDereferenceImpersonationToken(impersonationtoken: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_psDereferenceImpersonationToken((impersonationtoken?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun psDereferencePrimaryToken(primarytoken: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_psDereferencePrimaryToken((primarytoken?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun psDisableImpersonation(thread: Pethread, impersonationstate: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_psDisableImpersonation(thread.toString(), (impersonationstate?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetProcessExitTime(): Long =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_psGetProcessExitTime().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetThreadProcess(thread: Pethread): Peprocess =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_psGetThreadProcess(thread.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psImpersonateClient(thread: Pethread, token: COpaquePointer?, copyonopen: Boolean, effectiveonly: Boolean, impersonationlevel: SecurityImpersonationLevel): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_psImpersonateClient(thread.toString(), (token?.value ?: 0L).toString(), copyonopen, effectiveonly, impersonationlevel) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psIsDiskCountersEnabled(): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_psIsDiskCountersEnabled() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psIsSystemThread(thread: Pethread): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_psIsSystemThread(thread.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psIsThreadTerminating(thread: Pethread): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_psIsThreadTerminating(thread.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psLookupProcessByProcessId(processid: Handle, process: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_psLookupProcessByProcessId((processid?.value ?: 0L).toString(), (process?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psLookupThreadByThreadId(threadid: Handle, thread: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_psLookupThreadByThreadId((threadid?.value ?: 0L).toString(), (thread?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psReferenceImpersonationToken(thread: Pethread, copyonopen: COpaquePointer?, effectiveonly: COpaquePointer?, impersonationlevel: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_psReferenceImpersonationToken(thread.toString(), (copyonopen?.value ?: 0L).toString(), (effectiveonly?.value ?: 0L).toString(), (impersonationlevel?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psReferencePrimaryToken(process: Peprocess): COpaquePointer? =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_psReferencePrimaryToken(process.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psRestoreImpersonation(thread: Pethread, impersonationstate: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_psRestoreImpersonation(thread.toString(), (impersonationstate?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun psReturnPoolQuota(process: Peprocess, pooltype: PoolType, amount: ULong) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_psReturnPoolQuota(process.toString(), pooltype, amount.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun psRevertToSelf() {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_psRevertToSelf()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun psUpdateDiskCounters(process: Peprocess, bytesread: ULong, byteswritten: ULong, readoperationcount: UInt, writeoperationcount: UInt, flushoperationcount: UInt) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_psUpdateDiskCounters(process.toString(), bytesread.toString(), byteswritten.toString(), readoperationcount.toInt(), writeoperationcount.toInt(), flushoperationcount.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun querySecurityContextToken(phcontext: COpaquePointer?, token: COpaquePointer?): Hresult =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_querySecurityContextToken((phcontext?.value ?: 0L).toString(), (token?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlAbsoluteToSelfRelativeSD(absolutesecuritydescriptor: PsecurityDescriptor, selfrelativesecuritydescriptor: PsecurityDescriptor, bufferlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlAbsoluteToSelfRelativeSD((absolutesecuritydescriptor?.value ?: 0L).toString(), (selfrelativesecuritydescriptor?.value ?: 0L).toString(), (bufferlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlAddAccessAllowedAce(acl: COpaquePointer?, acerevision: UInt, accessmask: UInt, sid: Psid): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlAddAccessAllowedAce((acl?.value ?: 0L).toString(), acerevision.toInt(), accessmask.toInt(), (sid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlAddAccessAllowedAceEx(acl: COpaquePointer?, acerevision: UInt, aceflags: UInt, accessmask: UInt, sid: Psid): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlAddAccessAllowedAceEx((acl?.value ?: 0L).toString(), acerevision.toInt(), aceflags.toInt(), accessmask.toInt(), (sid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlAddAce(acl: COpaquePointer?, acerevision: UInt, startingaceindex: UInt, acelist: COpaquePointer?, acelistlength: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlAddAce((acl?.value ?: 0L).toString(), acerevision.toInt(), startingaceindex.toInt(), (acelist?.value ?: 0L).toString(), acelistlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlAllocateAndInitializeSid(identifierauthority: COpaquePointer?, subauthoritycount: UByte, subauthority0: UInt, subauthority1: UInt, subauthority2: UInt, subauthority3: UInt, subauthority4: UInt, subauthority5: UInt, subauthority6: UInt, subauthority7: UInt, sid: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlAllocateAndInitializeSid((identifierauthority?.value ?: 0L).toString(), subauthoritycount.toInt(), subauthority0.toInt(), subauthority1.toInt(), subauthority2.toInt(), subauthority3.toInt(), subauthority4.toInt(), subauthority5.toInt(), subauthority6.toInt(), subauthority7.toInt(), (sid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlAllocateAndInitializeSidEx(identifierauthority: COpaquePointer?, subauthoritycount: UByte, subauthorities: COpaquePointer?, sid: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlAllocateAndInitializeSidEx((identifierauthority?.value ?: 0L).toString(), subauthoritycount.toInt(), (subauthorities?.value ?: 0L).toString(), (sid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlAllocateHeap(heaphandle: COpaquePointer?, flags: UInt, size: ULong): COpaquePointer? =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlAllocateHeap((heaphandle?.value ?: 0L).toString(), flags.toInt(), size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlAppendStringToString(destination: COpaquePointer?, source: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlAppendStringToString((destination?.value ?: 0L).toString(), (source?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCompareAltitudes(altitude1: COpaquePointer?, altitude2: COpaquePointer?): Int =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlCompareAltitudes((altitude1?.value ?: 0L).toString(), (altitude2?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCompareMemoryUlong(source: COpaquePointer?, length: ULong, pattern: UInt): ULong =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlCompareMemoryUlong((source?.value ?: 0L).toString(), length.toString(), pattern.toInt()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCompressBuffer(compressionformatandengine: UShort, uncompressedbuffer: COpaquePointer?, uncompressedbuffersize: UInt, compressedbuffer: COpaquePointer?, compressedbuffersize: UInt, uncompressedchunksize: UInt, finalcompressedsize: COpaquePointer?, workspace: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlCompressBuffer(compressionformatandengine.toInt(), (uncompressedbuffer?.value ?: 0L).toString(), uncompressedbuffersize.toInt(), (compressedbuffer?.value ?: 0L).toString(), compressedbuffersize.toInt(), uncompressedchunksize.toInt(), (finalcompressedsize?.value ?: 0L).toString(), (workspace?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCompressChunks(uncompressedbuffer: COpaquePointer?, uncompressedbuffersize: UInt, compressedbuffer: COpaquePointer?, compressedbuffersize: UInt, compresseddatainfo: COpaquePointer?, compresseddatainfolength: UInt, workspace: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlCompressChunks((uncompressedbuffer?.value ?: 0L).toString(), uncompressedbuffersize.toInt(), (compressedbuffer?.value ?: 0L).toString(), compressedbuffersize.toInt(), (compresseddatainfo?.value ?: 0L).toString(), compresseddatainfolength.toInt(), (workspace?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCopyLuid(destinationluid: COpaquePointer?, sourceluid: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_rtlCopyLuid((destinationluid?.value ?: 0L).toString(), (sourceluid?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlCopySid(destinationsidlength: UInt, destinationsid: Psid, sourcesid: Psid): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlCopySid(destinationsidlength.toInt(), (destinationsid?.value ?: 0L).toString(), (sourcesid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCreateAcl(acl: COpaquePointer?, acllength: UInt, aclrevision: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlCreateAcl((acl?.value ?: 0L).toString(), acllength.toInt(), aclrevision.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCreateHeap(flags: UInt, heapbase: COpaquePointer?, reservesize: ULong, commitsize: ULong, lock: COpaquePointer?, parameters: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlCreateHeap(flags.toInt(), (heapbase?.value ?: 0L).toString(), reservesize.toString(), commitsize.toString(), (lock?.value ?: 0L).toString(), (parameters?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCreateServiceSid(servicename: COpaquePointer?, servicesid: Psid, servicesidlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlCreateServiceSid((servicename?.value ?: 0L).toString(), (servicesid?.value ?: 0L).toString(), (servicesidlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCreateSystemVolumeInformationFolder(volumerootpath: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlCreateSystemVolumeInformationFolder((volumerootpath?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCreateUnicodeString(destinationstring: COpaquePointer?, sourcestring: Pcwstr): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlCreateUnicodeString((destinationstring?.value ?: 0L).toString(), (sourcestring?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCreateVirtualAccountSid(name: COpaquePointer?, basesubauthority: UInt, sid: Psid, sidlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlCreateVirtualAccountSid((name?.value ?: 0L).toString(), basesubauthority.toInt(), (sid?.value ?: 0L).toString(), (sidlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCustomCPToUnicodeN(customcp: COpaquePointer?, unicodestring: Pwstr, maxbytesinunicodestring: UInt, bytesinunicodestring: COpaquePointer?, customcpstring: Pcstr, bytesincustomcpstring: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlCustomCPToUnicodeN((customcp?.value ?: 0L).toString(), (unicodestring?.value ?: 0L).toString(), maxbytesinunicodestring.toInt(), (bytesinunicodestring?.value ?: 0L).toString(), (customcpstring?.value ?: 0L).toString(), bytesincustomcpstring.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDecompressBuffer(compressionformat: UShort, uncompressedbuffer: COpaquePointer?, uncompressedbuffersize: UInt, compressedbuffer: COpaquePointer?, compressedbuffersize: UInt, finaluncompressedsize: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlDecompressBuffer(compressionformat.toInt(), (uncompressedbuffer?.value ?: 0L).toString(), uncompressedbuffersize.toInt(), (compressedbuffer?.value ?: 0L).toString(), compressedbuffersize.toInt(), (finaluncompressedsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDecompressBufferEx(compressionformat: UShort, uncompressedbuffer: COpaquePointer?, uncompressedbuffersize: UInt, compressedbuffer: COpaquePointer?, compressedbuffersize: UInt, finaluncompressedsize: COpaquePointer?, workspace: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlDecompressBufferEx(compressionformat.toInt(), (uncompressedbuffer?.value ?: 0L).toString(), uncompressedbuffersize.toInt(), (compressedbuffer?.value ?: 0L).toString(), compressedbuffersize.toInt(), (finaluncompressedsize?.value ?: 0L).toString(), (workspace?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDecompressBufferEx2(compressionformat: UShort, uncompressedbuffer: COpaquePointer?, uncompressedbuffersize: UInt, compressedbuffer: COpaquePointer?, compressedbuffersize: UInt, uncompressedchunksize: UInt, finaluncompressedsize: COpaquePointer?, workspace: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlDecompressBufferEx2(compressionformat.toInt(), (uncompressedbuffer?.value ?: 0L).toString(), uncompressedbuffersize.toInt(), (compressedbuffer?.value ?: 0L).toString(), compressedbuffersize.toInt(), uncompressedchunksize.toInt(), (finaluncompressedsize?.value ?: 0L).toString(), (workspace?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDecompressChunks(uncompressedbuffer: COpaquePointer?, uncompressedbuffersize: UInt, compressedbuffer: COpaquePointer?, compressedbuffersize: UInt, compressedtail: COpaquePointer?, compressedtailsize: UInt, compresseddatainfo: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlDecompressChunks((uncompressedbuffer?.value ?: 0L).toString(), uncompressedbuffersize.toInt(), (compressedbuffer?.value ?: 0L).toString(), compressedbuffersize.toInt(), (compressedtail?.value ?: 0L).toString(), compressedtailsize.toInt(), (compresseddatainfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDecompressFragment(compressionformat: UShort, uncompressedfragment: COpaquePointer?, uncompressedfragmentsize: UInt, compressedbuffer: COpaquePointer?, compressedbuffersize: UInt, fragmentoffset: UInt, finaluncompressedsize: COpaquePointer?, workspace: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlDecompressFragment(compressionformat.toInt(), (uncompressedfragment?.value ?: 0L).toString(), uncompressedfragmentsize.toInt(), (compressedbuffer?.value ?: 0L).toString(), compressedbuffersize.toInt(), fragmentoffset.toInt(), (finaluncompressedsize?.value ?: 0L).toString(), (workspace?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDecompressFragmentEx(compressionformat: UShort, uncompressedfragment: COpaquePointer?, uncompressedfragmentsize: UInt, compressedbuffer: COpaquePointer?, compressedbuffersize: UInt, fragmentoffset: UInt, uncompressedchunksize: UInt, finaluncompressedsize: COpaquePointer?, workspace: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlDecompressFragmentEx(compressionformat.toInt(), (uncompressedfragment?.value ?: 0L).toString(), uncompressedfragmentsize.toInt(), (compressedbuffer?.value ?: 0L).toString(), compressedbuffersize.toInt(), fragmentoffset.toInt(), uncompressedchunksize.toInt(), (finaluncompressedsize?.value ?: 0L).toString(), (workspace?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDeleteAce(acl: COpaquePointer?, aceindex: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlDeleteAce((acl?.value ?: 0L).toString(), aceindex.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDescribeChunk(compressionformat: UShort, compressedbuffer: COpaquePointer?, endofcompressedbufferplus1: COpaquePointer?, chunkbuffer: COpaquePointer?, chunksize: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlDescribeChunk(compressionformat.toInt(), (compressedbuffer?.value ?: 0L).toString(), (endofcompressedbufferplus1?.value ?: 0L).toString(), (chunkbuffer?.value ?: 0L).toString(), (chunksize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDestroyHeap(heaphandle: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlDestroyHeap((heaphandle?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDosPathNameToNtPathNameUWithStatus(dosfilename: Pcwstr, ntfilename: COpaquePointer?, filepart: COpaquePointer?, reserved: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlDosPathNameToNtPathNameUWithStatus((dosfilename?.value ?: 0L).toString(), (ntfilename?.value ?: 0L).toString(), (filepart?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDowncaseUnicodeString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlDowncaseUnicodeString((destinationstring?.value ?: 0L).toString(), (sourcestring?.value ?: 0L).toString(), allocatedestinationstring) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDuplicateUnicodeString(flags: UInt, stringin: COpaquePointer?, stringout: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlDuplicateUnicodeString(flags.toInt(), (stringin?.value ?: 0L).toString(), (stringout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlEqualPrefixSid(sid1: Psid, sid2: Psid): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlEqualPrefixSid((sid1?.value ?: 0L).toString(), (sid2?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlEqualSid(sid1: Psid, sid2: Psid): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlEqualSid((sid1?.value ?: 0L).toString(), (sid2?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFindUnicodePrefix(prefixtable: COpaquePointer?, fullname: COpaquePointer?, caseinsensitiveindex: UInt): COpaquePointer? =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlFindUnicodePrefix((prefixtable?.value ?: 0L).toString(), (fullname?.value ?: 0L).toString(), caseinsensitiveindex.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFreeHeap(heaphandle: COpaquePointer?, flags: UInt, baseaddress: COpaquePointer?): UInt =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlFreeHeap((heaphandle?.value ?: 0L).toString(), flags.toInt(), (baseaddress?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFreeSid(sid: Psid): COpaquePointer? =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlFreeSid((sid?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGenerate8dot3Name(name: COpaquePointer?, allowextendedcharacters: Boolean, context: COpaquePointer?, name8dot3: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlGenerate8dot3Name((name?.value ?: 0L).toString(), allowextendedcharacters, (context?.value ?: 0L).toString(), (name8dot3?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetAce(acl: COpaquePointer?, aceindex: UInt, ace: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlGetAce((acl?.value ?: 0L).toString(), aceindex.toInt(), (ace?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetCompressionWorkSpaceSize(compressionformatandengine: UShort, compressbufferworkspacesize: COpaquePointer?, compressfragmentworkspacesize: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlGetCompressionWorkSpaceSize(compressionformatandengine.toInt(), (compressbufferworkspacesize?.value ?: 0L).toString(), (compressfragmentworkspacesize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetDaclSecurityDescriptor(securitydescriptor: PsecurityDescriptor, daclpresent: COpaquePointer?, dacl: COpaquePointer?, dacldefaulted: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlGetDaclSecurityDescriptor((securitydescriptor?.value ?: 0L).toString(), (daclpresent?.value ?: 0L).toString(), (dacl?.value ?: 0L).toString(), (dacldefaulted?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetGroupSecurityDescriptor(securitydescriptor: PsecurityDescriptor, group: COpaquePointer?, groupdefaulted: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlGetGroupSecurityDescriptor((securitydescriptor?.value ?: 0L).toString(), (group?.value ?: 0L).toString(), (groupdefaulted?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetOwnerSecurityDescriptor(securitydescriptor: PsecurityDescriptor, owner: COpaquePointer?, ownerdefaulted: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlGetOwnerSecurityDescriptor((securitydescriptor?.value ?: 0L).toString(), (owner?.value ?: 0L).toString(), (ownerdefaulted?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetSaclSecurityDescriptor(securitydescriptor: PsecurityDescriptor, saclpresent: COpaquePointer?, sacl: COpaquePointer?, sacldefaulted: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlGetSaclSecurityDescriptor((securitydescriptor?.value ?: 0L).toString(), (saclpresent?.value ?: 0L).toString(), (sacl?.value ?: 0L).toString(), (sacldefaulted?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIdentifierAuthoritySid(sid: Psid): COpaquePointer? =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlIdentifierAuthoritySid((sid?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIdnToAscii(flags: UInt, sourcestring: Pcwstr, sourcestringlength: Int, destinationstring: Pwstr, destinationstringlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlIdnToAscii(flags.toInt(), (sourcestring?.value ?: 0L).toString(), sourcestringlength, (destinationstring?.value ?: 0L).toString(), (destinationstringlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIdnToNameprepUnicode(flags: UInt, sourcestring: Pcwstr, sourcestringlength: Int, destinationstring: Pwstr, destinationstringlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlIdnToNameprepUnicode(flags.toInt(), (sourcestring?.value ?: 0L).toString(), sourcestringlength, (destinationstring?.value ?: 0L).toString(), (destinationstringlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIdnToUnicode(flags: UInt, sourcestring: Pcwstr, sourcestringlength: Int, destinationstring: Pwstr, destinationstringlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlIdnToUnicode(flags.toInt(), (sourcestring?.value ?: 0L).toString(), sourcestringlength, (destinationstring?.value ?: 0L).toString(), (destinationstringlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInitCodePageTable(tablebase: COpaquePointer?, codepagetable: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_rtlInitCodePageTable((tablebase?.value ?: 0L).toString(), (codepagetable?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlInitUnicodeStringEx(destinationstring: COpaquePointer?, sourcestring: Pcwstr): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlInitUnicodeStringEx((destinationstring?.value ?: 0L).toString(), (sourcestring?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInitializeSid(sid: Psid, identifierauthority: COpaquePointer?, subauthoritycount: UByte): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlInitializeSid((sid?.value ?: 0L).toString(), (identifierauthority?.value ?: 0L).toString(), subauthoritycount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInitializeSidEx(sid: Psid, identifierauthority: COpaquePointer?, subauthoritycount: UByte, vararg variadicArgs: Long): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlInitializeSidEx((sid?.value ?: 0L).toString(), (identifierauthority?.value ?: 0L).toString(), subauthoritycount.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInitializeUnicodePrefix(prefixtable: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_rtlInitializeUnicodePrefix((prefixtable?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlInsertUnicodePrefix(prefixtable: COpaquePointer?, prefix: COpaquePointer?, prefixtableentry: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlInsertUnicodePrefix((prefixtable?.value ?: 0L).toString(), (prefix?.value ?: 0L).toString(), (prefixtableentry?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsCloudFilesPlaceholder(fileattributes: UInt, reparsetag: UInt): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlIsCloudFilesPlaceholder(fileattributes.toInt(), reparsetag.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsDosDeviceNameU(dosfilename: Pcwstr): UInt =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlIsDosDeviceNameU((dosfilename?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag: UInt): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsNormalizedString(normform: UInt, sourcestring: Pcwstr, sourcestringlength: Int, normalized: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlIsNormalizedString(normform.toInt(), (sourcestring?.value ?: 0L).toString(), sourcestringlength, (normalized?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsPartialPlaceholder(fileattributes: UInt, reparsetag: UInt): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlIsPartialPlaceholder(fileattributes.toInt(), reparsetag.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsPartialPlaceholderFileHandle(filehandle: Handle, ispartialplaceholder: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlIsPartialPlaceholderFileHandle((filehandle?.value ?: 0L).toString(), (ispartialplaceholder?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsPartialPlaceholderFileInfo(infobuffer: COpaquePointer?, infoclass: FileInformationClass, ispartialplaceholder: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlIsPartialPlaceholderFileInfo((infobuffer?.value ?: 0L).toString(), infoclass, (ispartialplaceholder?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsSandboxedToken(context: COpaquePointer?, previousmode: Byte): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlIsSandboxedToken((context?.value ?: 0L).toString(), previousmode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsValidOemCharacter(char: Pwstr): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlIsValidOemCharacter((char?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlLengthRequiredSid(subauthoritycount: UInt): UInt =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlLengthRequiredSid(subauthoritycount.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlLengthSid(sid: Psid): UInt =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlLengthSid((sid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlMultiByteToUnicodeN(unicodestring: Pwstr, maxbytesinunicodestring: UInt, bytesinunicodestring: COpaquePointer?, multibytestring: Pcstr, bytesinmultibytestring: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlMultiByteToUnicodeN((unicodestring?.value ?: 0L).toString(), maxbytesinunicodestring.toInt(), (bytesinunicodestring?.value ?: 0L).toString(), (multibytestring?.value ?: 0L).toString(), bytesinmultibytestring.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlMultiByteToUnicodeSize(bytesinunicodestring: COpaquePointer?, multibytestring: Pcstr, bytesinmultibytestring: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlMultiByteToUnicodeSize((bytesinunicodestring?.value ?: 0L).toString(), (multibytestring?.value ?: 0L).toString(), bytesinmultibytestring.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlNextUnicodePrefix(prefixtable: COpaquePointer?, restart: Boolean): COpaquePointer? =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlNextUnicodePrefix((prefixtable?.value ?: 0L).toString(), restart).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlNormalizeString(normform: UInt, sourcestring: Pcwstr, sourcestringlength: Int, destinationstring: Pwstr, destinationstringlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlNormalizeString(normform.toInt(), (sourcestring?.value ?: 0L).toString(), sourcestringlength, (destinationstring?.value ?: 0L).toString(), (destinationstringlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlNtStatusToDosErrorNoTeb(status: Ntstatus): UInt =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlNtStatusToDosErrorNoTeb(status).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlOemStringToCountedUnicodeString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlOemStringToCountedUnicodeString((destinationstring?.value ?: 0L).toString(), (sourcestring?.value ?: 0L).toString(), allocatedestinationstring) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlOemStringToUnicodeString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlOemStringToUnicodeString((destinationstring?.value ?: 0L).toString(), (sourcestring?.value ?: 0L).toString(), allocatedestinationstring) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlOemToUnicodeN(unicodestring: Pwstr, maxbytesinunicodestring: UInt, bytesinunicodestring: COpaquePointer?, oemstring: Pcstr, bytesinoemstring: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlOemToUnicodeN((unicodestring?.value ?: 0L).toString(), maxbytesinunicodestring.toInt(), (bytesinunicodestring?.value ?: 0L).toString(), (oemstring?.value ?: 0L).toString(), bytesinoemstring.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlPrefixString(string1: COpaquePointer?, string2: COpaquePointer?, caseinsensitive: Boolean): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlPrefixString((string1?.value ?: 0L).toString(), (string2?.value ?: 0L).toString(), caseinsensitive) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlQueryPackageIdentity(tokenobject: COpaquePointer?, packagefullname: Pwstr, packagesize: COpaquePointer?, appid: Pwstr, appidsize: COpaquePointer?, packaged: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlQueryPackageIdentity((tokenobject?.value ?: 0L).toString(), (packagefullname?.value ?: 0L).toString(), (packagesize?.value ?: 0L).toString(), (appid?.value ?: 0L).toString(), (appidsize?.value ?: 0L).toString(), (packaged?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlQueryPackageIdentityEx(tokenobject: COpaquePointer?, packagefullname: Pwstr, packagesize: COpaquePointer?, appid: Pwstr, appidsize: COpaquePointer?, dynamicid: COpaquePointer?, flags: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlQueryPackageIdentityEx((tokenobject?.value ?: 0L).toString(), (packagefullname?.value ?: 0L).toString(), (packagesize?.value ?: 0L).toString(), (appid?.value ?: 0L).toString(), (appidsize?.value ?: 0L).toString(), (dynamicid?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlQueryProcessPlaceholderCompatibilityMode(): Byte =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlQueryProcessPlaceholderCompatibilityMode().toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlQueryThreadPlaceholderCompatibilityMode(): Byte =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlQueryThreadPlaceholderCompatibilityMode().toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlRandom(seed: COpaquePointer?): UInt =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlRandom((seed?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlRandomEx(seed: COpaquePointer?): UInt =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlRandomEx((seed?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlRemoveUnicodePrefix(prefixtable: COpaquePointer?, prefixtableentry: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_rtlRemoveUnicodePrefix((prefixtable?.value ?: 0L).toString(), (prefixtableentry?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlReplaceSidInSd(securitydescriptor: PsecurityDescriptor, oldsid: Psid, newsid: Psid, numchanges: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlReplaceSidInSd((securitydescriptor?.value ?: 0L).toString(), (oldsid?.value ?: 0L).toString(), (newsid?.value ?: 0L).toString(), (numchanges?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlReserveChunk(compressionformat: UShort, compressedbuffer: COpaquePointer?, endofcompressedbufferplus1: COpaquePointer?, chunkbuffer: COpaquePointer?, chunksize: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlReserveChunk(compressionformat.toInt(), (compressedbuffer?.value ?: 0L).toString(), (endofcompressedbufferplus1?.value ?: 0L).toString(), (chunkbuffer?.value ?: 0L).toString(), chunksize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlSecondsSince1970ToTime(elapsedseconds: UInt, time: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_rtlSecondsSince1970ToTime(elapsedseconds.toInt(), (time?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlSecondsSince1980ToTime(elapsedseconds: UInt, time: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_rtlSecondsSince1980ToTime(elapsedseconds.toInt(), (time?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlSelfRelativeToAbsoluteSD(selfrelativesecuritydescriptor: PsecurityDescriptor, absolutesecuritydescriptor: PsecurityDescriptor, absolutesecuritydescriptorsize: COpaquePointer?, dacl: COpaquePointer?, daclsize: COpaquePointer?, sacl: COpaquePointer?, saclsize: COpaquePointer?, owner: Psid, ownersize: COpaquePointer?, primarygroup: Psid, primarygroupsize: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlSelfRelativeToAbsoluteSD((selfrelativesecuritydescriptor?.value ?: 0L).toString(), (absolutesecuritydescriptor?.value ?: 0L).toString(), (absolutesecuritydescriptorsize?.value ?: 0L).toString(), (dacl?.value ?: 0L).toString(), (daclsize?.value ?: 0L).toString(), (sacl?.value ?: 0L).toString(), (saclsize?.value ?: 0L).toString(), (owner?.value ?: 0L).toString(), (ownersize?.value ?: 0L).toString(), (primarygroup?.value ?: 0L).toString(), (primarygroupsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlSetGroupSecurityDescriptor(securitydescriptor: PsecurityDescriptor, group: Psid, groupdefaulted: Boolean): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlSetGroupSecurityDescriptor((securitydescriptor?.value ?: 0L).toString(), (group?.value ?: 0L).toString(), groupdefaulted) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlSetOwnerSecurityDescriptor(securitydescriptor: PsecurityDescriptor, owner: Psid, ownerdefaulted: Boolean): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlSetOwnerSecurityDescriptor((securitydescriptor?.value ?: 0L).toString(), (owner?.value ?: 0L).toString(), ownerdefaulted) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlSetProcessPlaceholderCompatibilityMode(mode: Byte): Byte =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlSetProcessPlaceholderCompatibilityMode(mode.toInt()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlSetThreadPlaceholderCompatibilityMode(mode: Byte): Byte =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlSetThreadPlaceholderCompatibilityMode(mode.toInt()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlSubAuthorityCountSid(sid: Psid): COpaquePointer? =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlSubAuthorityCountSid((sid?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlSubAuthoritySid(sid: Psid, subauthority: UInt): COpaquePointer? =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlSubAuthoritySid((sid?.value ?: 0L).toString(), subauthority.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlTimeToSecondsSince1980(time: COpaquePointer?, elapsedseconds: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlTimeToSecondsSince1980((time?.value ?: 0L).toString(), (elapsedseconds?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUnicodeStringToCountedOemString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlUnicodeStringToCountedOemString((destinationstring?.value ?: 0L).toString(), (sourcestring?.value ?: 0L).toString(), allocatedestinationstring) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUnicodeToCustomCPN(customcp: COpaquePointer?, customcpstring: Pstr, maxbytesincustomcpstring: UInt, bytesincustomcpstring: COpaquePointer?, unicodestring: Pcwstr, bytesinunicodestring: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlUnicodeToCustomCPN((customcp?.value ?: 0L).toString(), (customcpstring?.value ?: 0L).toString(), maxbytesincustomcpstring.toInt(), (bytesincustomcpstring?.value ?: 0L).toString(), (unicodestring?.value ?: 0L).toString(), bytesinunicodestring.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUnicodeToMultiByteN(multibytestring: Pstr, maxbytesinmultibytestring: UInt, bytesinmultibytestring: COpaquePointer?, unicodestring: COpaquePointer?, bytesinunicodestring: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlUnicodeToMultiByteN((multibytestring?.value ?: 0L).toString(), maxbytesinmultibytestring.toInt(), (bytesinmultibytestring?.value ?: 0L).toString(), (unicodestring?.value ?: 0L).toString(), bytesinunicodestring.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUnicodeToOemN(oemstring: Pstr, maxbytesinoemstring: UInt, bytesinoemstring: COpaquePointer?, unicodestring: COpaquePointer?, bytesinunicodestring: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlUnicodeToOemN((oemstring?.value ?: 0L).toString(), maxbytesinoemstring.toInt(), (bytesinoemstring?.value ?: 0L).toString(), (unicodestring?.value ?: 0L).toString(), bytesinunicodestring.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUpcaseUnicodeStringToCountedOemString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlUpcaseUnicodeStringToCountedOemString((destinationstring?.value ?: 0L).toString(), (sourcestring?.value ?: 0L).toString(), allocatedestinationstring) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUpcaseUnicodeStringToOemString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlUpcaseUnicodeStringToOemString((destinationstring?.value ?: 0L).toString(), (sourcestring?.value ?: 0L).toString(), allocatedestinationstring) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUpcaseUnicodeToCustomCPN(customcp: COpaquePointer?, customcpstring: Pstr, maxbytesincustomcpstring: UInt, bytesincustomcpstring: COpaquePointer?, unicodestring: Pcwstr, bytesinunicodestring: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlUpcaseUnicodeToCustomCPN((customcp?.value ?: 0L).toString(), (customcpstring?.value ?: 0L).toString(), maxbytesincustomcpstring.toInt(), (bytesincustomcpstring?.value ?: 0L).toString(), (unicodestring?.value ?: 0L).toString(), bytesinunicodestring.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUpcaseUnicodeToMultiByteN(multibytestring: Pstr, maxbytesinmultibytestring: UInt, bytesinmultibytestring: COpaquePointer?, unicodestring: COpaquePointer?, bytesinunicodestring: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlUpcaseUnicodeToMultiByteN((multibytestring?.value ?: 0L).toString(), maxbytesinmultibytestring.toInt(), (bytesinmultibytestring?.value ?: 0L).toString(), (unicodestring?.value ?: 0L).toString(), bytesinunicodestring.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUpcaseUnicodeToOemN(oemstring: Pstr, maxbytesinoemstring: UInt, bytesinoemstring: COpaquePointer?, unicodestring: COpaquePointer?, bytesinunicodestring: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlUpcaseUnicodeToOemN((oemstring?.value ?: 0L).toString(), maxbytesinoemstring.toInt(), (bytesinoemstring?.value ?: 0L).toString(), (unicodestring?.value ?: 0L).toString(), bytesinunicodestring.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlValidSid(sid: Psid): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlValidSid((sid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlValidateUnicodeString(flags: UInt, string: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlValidateUnicodeString(flags.toInt(), (string?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlxOemStringToUnicodeSize(oemstring: COpaquePointer?): UInt =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlxOemStringToUnicodeSize((oemstring?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlxUnicodeStringToOemSize(unicodestring: COpaquePointer?): UInt =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_rtlxUnicodeStringToOemSize((unicodestring?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seAccessCheckFromState(securitydescriptor: PsecurityDescriptor, primarytokeninformation: COpaquePointer?, clienttokeninformation: COpaquePointer?, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: COpaquePointer?, genericmapping: COpaquePointer?, accessmode: Byte, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_seAccessCheckFromState((securitydescriptor?.value ?: 0L).toString(), (primarytokeninformation?.value ?: 0L).toString(), (clienttokeninformation?.value ?: 0L).toString(), desiredaccess.toInt(), previouslygrantedaccess.toInt(), (privileges?.value ?: 0L).toString(), (genericmapping?.value ?: 0L).toString(), accessmode.toInt(), (grantedaccess?.value ?: 0L).toString(), (accessstatus?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seAccessCheckFromStateEx(securitydescriptor: PsecurityDescriptor, primarytoken: COpaquePointer?, clienttoken: COpaquePointer?, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: COpaquePointer?, genericmapping: COpaquePointer?, accessmode: Byte, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_seAccessCheckFromStateEx((securitydescriptor?.value ?: 0L).toString(), (primarytoken?.value ?: 0L).toString(), (clienttoken?.value ?: 0L).toString(), desiredaccess.toInt(), previouslygrantedaccess.toInt(), (privileges?.value ?: 0L).toString(), (genericmapping?.value ?: 0L).toString(), accessmode.toInt(), (grantedaccess?.value ?: 0L).toString(), (accessstatus?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seAdjustAccessStateForAccessConstraints(objecttype: COpaquePointer?, securitydescriptor: PsecurityDescriptor, accessstate: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_seAdjustAccessStateForAccessConstraints((objecttype?.value ?: 0L).toString(), (securitydescriptor?.value ?: 0L).toString(), (accessstate?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seAdjustAccessStateForTrustLabel(objecttype: COpaquePointer?, securitydescriptor: PsecurityDescriptor, accessstate: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_seAdjustAccessStateForTrustLabel((objecttype?.value ?: 0L).toString(), (securitydescriptor?.value ?: 0L).toString(), (accessstate?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seAdjustObjectSecurity(objectname: COpaquePointer?, originaldescriptor: PsecurityDescriptor, proposeddescriptor: PsecurityDescriptor, subjectsecuritycontext: COpaquePointer?, adjusteddescriptor: COpaquePointer?, applyadjusteddescriptor: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_seAdjustObjectSecurity((objectname?.value ?: 0L).toString(), (originaldescriptor?.value ?: 0L).toString(), (proposeddescriptor?.value ?: 0L).toString(), (subjectsecuritycontext?.value ?: 0L).toString(), (adjusteddescriptor?.value ?: 0L).toString(), (applyadjusteddescriptor?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seAppendPrivileges(accessstate: COpaquePointer?, privileges: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_seAppendPrivileges((accessstate?.value ?: 0L).toString(), (privileges?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seAuditFipsCryptoSelftests(bsuccess: Boolean, selftestcode: UInt) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_seAuditFipsCryptoSelftests(bsuccess, selftestcode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seAuditHardLinkCreation(filename: COpaquePointer?, linkname: COpaquePointer?, bsuccess: Boolean) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_seAuditHardLinkCreation((filename?.value ?: 0L).toString(), (linkname?.value ?: 0L).toString(), bsuccess)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seAuditHardLinkCreationWithTransaction(filename: COpaquePointer?, linkname: COpaquePointer?, bsuccess: Boolean, transactionid: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_seAuditHardLinkCreationWithTransaction((filename?.value ?: 0L).toString(), (linkname?.value ?: 0L).toString(), bsuccess, (transactionid?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seAuditTransactionStateChange(transactionid: COpaquePointer?, resourcemanagerid: COpaquePointer?, newtransactionstate: UInt) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_seAuditTransactionStateChange((transactionid?.value ?: 0L).toString(), (resourcemanagerid?.value ?: 0L).toString(), newtransactionstate.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seAuditingAnyFileEventsWithContext(securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_seAuditingAnyFileEventsWithContext((securitydescriptor?.value ?: 0L).toString(), (subjectsecuritycontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seAuditingAnyFileEventsWithContextEx(securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: COpaquePointer?, stagingenabled: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_seAuditingAnyFileEventsWithContextEx((securitydescriptor?.value ?: 0L).toString(), (subjectsecuritycontext?.value ?: 0L).toString(), (stagingenabled?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seAuditingFileEvents(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_seAuditingFileEvents(accessgranted, (securitydescriptor?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seAuditingFileEventsWithContext(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_seAuditingFileEventsWithContext(accessgranted, (securitydescriptor?.value ?: 0L).toString(), (subjectsecuritycontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seAuditingFileEventsWithContextEx(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: COpaquePointer?, stagingenabled: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_seAuditingFileEventsWithContextEx(accessgranted, (securitydescriptor?.value ?: 0L).toString(), (subjectsecuritycontext?.value ?: 0L).toString(), (stagingenabled?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seAuditingFileOrGlobalEvents(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_seAuditingFileOrGlobalEvents(accessgranted, (securitydescriptor?.value ?: 0L).toString(), (subjectsecuritycontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seAuditingHardLinkEvents(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_seAuditingHardLinkEvents(accessgranted, (securitydescriptor?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seAuditingHardLinkEventsWithContext(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_seAuditingHardLinkEventsWithContext(accessgranted, (securitydescriptor?.value ?: 0L).toString(), (subjectsecuritycontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seCaptureSubjectContextEx(thread: Pethread, process: Peprocess, subjectcontext: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_seCaptureSubjectContextEx(thread.toString(), process.toString(), (subjectcontext?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seCheckForCriticalAceRemoval(currentdescriptor: PsecurityDescriptor, newdescriptor: PsecurityDescriptor, subjectsecuritycontext: COpaquePointer?, aceremoved: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_seCheckForCriticalAceRemoval((currentdescriptor?.value ?: 0L).toString(), (newdescriptor?.value ?: 0L).toString(), (subjectsecuritycontext?.value ?: 0L).toString(), (aceremoved?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seCreateClientSecurity(clientthread: Pethread, clientsecurityqos: COpaquePointer?, remotesession: Boolean, clientcontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_seCreateClientSecurity(clientthread.toString(), (clientsecurityqos?.value ?: 0L).toString(), remotesession, (clientcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seCreateClientSecurityFromSubjectContext(subjectcontext: COpaquePointer?, clientsecurityqos: COpaquePointer?, serverisremote: Boolean, clientcontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_seCreateClientSecurityFromSubjectContext((subjectcontext?.value ?: 0L).toString(), (clientsecurityqos?.value ?: 0L).toString(), serverisremote, (clientcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seDeleteClientSecurity(clientcontext: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_seDeleteClientSecurity((clientcontext?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seDeleteObjectAuditAlarm(obj: COpaquePointer?, handle: Handle) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_seDeleteObjectAuditAlarm((obj?.value ?: 0L).toString(), (handle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seDeleteObjectAuditAlarmWithTransaction(obj: COpaquePointer?, handle: Handle, transactionid: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_seDeleteObjectAuditAlarmWithTransaction((obj?.value ?: 0L).toString(), (handle?.value ?: 0L).toString(), (transactionid?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seExamineSacl(sacl: COpaquePointer?, resourcesacl: COpaquePointer?, token: COpaquePointer?, desiredaccess: UInt, accessgranted: Boolean, generateaudit: COpaquePointer?, generatealarm: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_seExamineSacl((sacl?.value ?: 0L).toString(), (resourcesacl?.value ?: 0L).toString(), (token?.value ?: 0L).toString(), desiredaccess.toInt(), accessgranted, (generateaudit?.value ?: 0L).toString(), (generatealarm?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seFilterToken(existingtoken: COpaquePointer?, flags: UInt, sidstodisable: COpaquePointer?, privilegestodelete: COpaquePointer?, restrictedsids: COpaquePointer?, filteredtoken: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_seFilterToken((existingtoken?.value ?: 0L).toString(), flags.toInt(), (sidstodisable?.value ?: 0L).toString(), (privilegestodelete?.value ?: 0L).toString(), (restrictedsids?.value ?: 0L).toString(), (filteredtoken?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seFreePrivileges(privileges: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_seFreePrivileges((privileges?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seImpersonateClient(clientcontext: COpaquePointer?, serverthread: Pethread) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_seImpersonateClient((clientcontext?.value ?: 0L).toString(), serverthread.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seImpersonateClientEx(clientcontext: COpaquePointer?, serverthread: Pethread): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_seImpersonateClientEx((clientcontext?.value ?: 0L).toString(), serverthread.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seLocateProcessImageName(process: Peprocess, pimagefilename: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_seLocateProcessImageName(process.toString(), (pimagefilename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seMarkLogonSessionForTerminationNotification(logonid: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_seMarkLogonSessionForTerminationNotification((logonid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seMarkLogonSessionForTerminationNotificationEx(logonid: COpaquePointer?, pserversilo: Pesilo): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_seMarkLogonSessionForTerminationNotificationEx((logonid?.value ?: 0L).toString(), pserversilo.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seOpenObjectAuditAlarm(objecttypename: COpaquePointer?, obj: COpaquePointer?, absoluteobjectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, accessstate: COpaquePointer?, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, generateonclose: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_seOpenObjectAuditAlarm((objecttypename?.value ?: 0L).toString(), (obj?.value ?: 0L).toString(), (absoluteobjectname?.value ?: 0L).toString(), (securitydescriptor?.value ?: 0L).toString(), (accessstate?.value ?: 0L).toString(), objectcreated, accessgranted, accessmode.toInt(), (generateonclose?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seOpenObjectAuditAlarmWithTransaction(objecttypename: COpaquePointer?, obj: COpaquePointer?, absoluteobjectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, accessstate: COpaquePointer?, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, transactionid: COpaquePointer?, generateonclose: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_seOpenObjectAuditAlarmWithTransaction((objecttypename?.value ?: 0L).toString(), (obj?.value ?: 0L).toString(), (absoluteobjectname?.value ?: 0L).toString(), (securitydescriptor?.value ?: 0L).toString(), (accessstate?.value ?: 0L).toString(), objectcreated, accessgranted, accessmode.toInt(), (transactionid?.value ?: 0L).toString(), (generateonclose?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seOpenObjectForDeleteAuditAlarm(objecttypename: COpaquePointer?, obj: COpaquePointer?, absoluteobjectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, accessstate: COpaquePointer?, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, generateonclose: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_seOpenObjectForDeleteAuditAlarm((objecttypename?.value ?: 0L).toString(), (obj?.value ?: 0L).toString(), (absoluteobjectname?.value ?: 0L).toString(), (securitydescriptor?.value ?: 0L).toString(), (accessstate?.value ?: 0L).toString(), objectcreated, accessgranted, accessmode.toInt(), (generateonclose?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seOpenObjectForDeleteAuditAlarmWithTransaction(objecttypename: COpaquePointer?, obj: COpaquePointer?, absoluteobjectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, accessstate: COpaquePointer?, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, transactionid: COpaquePointer?, generateonclose: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_seOpenObjectForDeleteAuditAlarmWithTransaction((objecttypename?.value ?: 0L).toString(), (obj?.value ?: 0L).toString(), (absoluteobjectname?.value ?: 0L).toString(), (securitydescriptor?.value ?: 0L).toString(), (accessstate?.value ?: 0L).toString(), objectcreated, accessgranted, accessmode.toInt(), (transactionid?.value ?: 0L).toString(), (generateonclose?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sePrivilegeCheck(requiredprivileges: COpaquePointer?, subjectsecuritycontext: COpaquePointer?, accessmode: Byte): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_sePrivilegeCheck((requiredprivileges?.value ?: 0L).toString(), (subjectsecuritycontext?.value ?: 0L).toString(), accessmode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seQueryAuthenticationIdToken(token: COpaquePointer?, authenticationid: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_seQueryAuthenticationIdToken((token?.value ?: 0L).toString(), (authenticationid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seQueryInformationToken(token: COpaquePointer?, tokeninformationclass: TokenInformationClass, tokeninformation: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_seQueryInformationToken((token?.value ?: 0L).toString(), tokeninformationclass, (tokeninformation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seQuerySecurityDescriptorInfo(securityinformation: COpaquePointer?, securitydescriptor: PsecurityDescriptor, length: COpaquePointer?, objectssecuritydescriptor: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_seQuerySecurityDescriptorInfo((securityinformation?.value ?: 0L).toString(), (securitydescriptor?.value ?: 0L).toString(), (length?.value ?: 0L).toString(), (objectssecuritydescriptor?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seQueryServerSiloToken(token: COpaquePointer?, pserversilo: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_seQueryServerSiloToken((token?.value ?: 0L).toString(), (pserversilo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seQuerySessionIdToken(token: COpaquePointer?, sessionid: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_seQuerySessionIdToken((token?.value ?: 0L).toString(), (sessionid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seQuerySessionIdTokenEx(token: COpaquePointer?, sessionid: COpaquePointer?, isservicesession: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_seQuerySessionIdTokenEx((token?.value ?: 0L).toString(), (sessionid?.value ?: 0L).toString(), (isservicesession?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seRegisterLogonSessionTerminatedRoutine(callbackroutine: PseLogonSessionTerminatedRoutine): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_seRegisterLogonSessionTerminatedRoutine(0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seRegisterLogonSessionTerminatedRoutineEx(callbackroutine: PseLogonSessionTerminatedRoutineEx, context: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_seRegisterLogonSessionTerminatedRoutineEx(0L.toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seReportSecurityEventWithSubCategory(flags: UInt, sourcename: COpaquePointer?, usersid: Psid, auditparameters: COpaquePointer?, auditsubcategoryid: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_seReportSecurityEventWithSubCategory(flags.toInt(), (sourcename?.value ?: 0L).toString(), (usersid?.value ?: 0L).toString(), (auditparameters?.value ?: 0L).toString(), auditsubcategoryid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seSetAccessStateGenericMapping(accessstate: COpaquePointer?, genericmapping: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_seSetAccessStateGenericMapping((accessstate?.value ?: 0L).toString(), (genericmapping?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seSetSecurityDescriptorInfo(obj: COpaquePointer?, securityinformation: COpaquePointer?, modificationdescriptor: PsecurityDescriptor, objectssecuritydescriptor: COpaquePointer?, pooltype: PoolType, genericmapping: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_seSetSecurityDescriptorInfo((obj?.value ?: 0L).toString(), (securityinformation?.value ?: 0L).toString(), (modificationdescriptor?.value ?: 0L).toString(), (objectssecuritydescriptor?.value ?: 0L).toString(), pooltype, (genericmapping?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seSetSecurityDescriptorInfoEx(obj: COpaquePointer?, securityinformation: COpaquePointer?, modificationdescriptor: PsecurityDescriptor, objectssecuritydescriptor: COpaquePointer?, autoinheritflags: UInt, pooltype: PoolType, genericmapping: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_seSetSecurityDescriptorInfoEx((obj?.value ?: 0L).toString(), (securityinformation?.value ?: 0L).toString(), (modificationdescriptor?.value ?: 0L).toString(), (objectssecuritydescriptor?.value ?: 0L).toString(), autoinheritflags.toInt(), pooltype, (genericmapping?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seShouldCheckForAccessRightsFromParent(objecttype: COpaquePointer?, childdescriptor: PsecurityDescriptor, accessstate: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_seShouldCheckForAccessRightsFromParent((objecttype?.value ?: 0L).toString(), (childdescriptor?.value ?: 0L).toString(), (accessstate?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seTokenFromAccessInformation(accessinformation: COpaquePointer?, token: COpaquePointer?, length: UInt, requiredlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_seTokenFromAccessInformation((accessinformation?.value ?: 0L).toString(), (token?.value ?: 0L).toString(), length.toInt(), (requiredlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seTokenIsAdmin(token: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_seTokenIsAdmin((token?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seTokenIsRestricted(token: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_seTokenIsRestricted((token?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seTokenIsWriteRestricted(token: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_seTokenIsWriteRestricted((token?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seTokenType(token: COpaquePointer?): TokenType =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_seTokenType((token?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seUnregisterLogonSessionTerminatedRoutine(callbackroutine: PseLogonSessionTerminatedRoutine): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_seUnregisterLogonSessionTerminatedRoutine(0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seUnregisterLogonSessionTerminatedRoutineEx(callbackroutine: PseLogonSessionTerminatedRoutineEx, context: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_seUnregisterLogonSessionTerminatedRoutineEx(0L.toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun secLookupAccountName(name: COpaquePointer?, sidsize: COpaquePointer?, sid: Psid, nameuse: COpaquePointer?, domainsize: COpaquePointer?, referenceddomain: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_secLookupAccountName((name?.value ?: 0L).toString(), (sidsize?.value ?: 0L).toString(), (sid?.value ?: 0L).toString(), (nameuse?.value ?: 0L).toString(), (domainsize?.value ?: 0L).toString(), (referenceddomain?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun secLookupAccountSid(sid: Psid, namesize: COpaquePointer?, namebuffer: COpaquePointer?, domainsize: COpaquePointer?, domainbuffer: COpaquePointer?, nameuse: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_secLookupAccountSid((sid?.value ?: 0L).toString(), (namesize?.value ?: 0L).toString(), (namebuffer?.value ?: 0L).toString(), (domainsize?.value ?: 0L).toString(), (domainbuffer?.value ?: 0L).toString(), (nameuse?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun secLookupWellKnownSid(sidtype: WellKnownSidType, sid: Psid, sidbuffersize: UInt, sidsize: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_secLookupWellKnownSid(sidtype, (sid?.value ?: 0L).toString(), sidbuffersize.toInt(), (sidsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun secMakeSPN(serviceclass: COpaquePointer?, servicename: COpaquePointer?, instancename: COpaquePointer?, instanceport: UShort, referrer: COpaquePointer?, spn: COpaquePointer?, length: COpaquePointer?, allocate: Boolean): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_secMakeSPN((serviceclass?.value ?: 0L).toString(), (servicename?.value ?: 0L).toString(), (instancename?.value ?: 0L).toString(), instanceport.toInt(), (referrer?.value ?: 0L).toString(), (spn?.value ?: 0L).toString(), (length?.value ?: 0L).toString(), allocate) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun secMakeSPNEx(serviceclass: COpaquePointer?, servicename: COpaquePointer?, instancename: COpaquePointer?, instanceport: UShort, referrer: COpaquePointer?, targetinfo: COpaquePointer?, spn: COpaquePointer?, length: COpaquePointer?, allocate: Boolean): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_secMakeSPNEx((serviceclass?.value ?: 0L).toString(), (servicename?.value ?: 0L).toString(), (instancename?.value ?: 0L).toString(), instanceport.toInt(), (referrer?.value ?: 0L).toString(), (targetinfo?.value ?: 0L).toString(), (spn?.value ?: 0L).toString(), (length?.value ?: 0L).toString(), allocate) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun secMakeSPNEx2(serviceclass: COpaquePointer?, servicename: COpaquePointer?, instancename: COpaquePointer?, instanceport: UShort, referrer: COpaquePointer?, intargetinfo: COpaquePointer?, spn: COpaquePointer?, totalsize: COpaquePointer?, allocate: Boolean, istargetinfomarshaled: Boolean): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_secMakeSPNEx2((serviceclass?.value ?: 0L).toString(), (servicename?.value ?: 0L).toString(), (instancename?.value ?: 0L).toString(), instanceport.toInt(), (referrer?.value ?: 0L).toString(), (intargetinfo?.value ?: 0L).toString(), (spn?.value ?: 0L).toString(), (totalsize?.value ?: 0L).toString(), allocate, istargetinfomarshaled) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setContextAttributesW(phcontext: COpaquePointer?, ulattribute: UInt, pbuffer: COpaquePointer?, cbbuffer: UInt): Hresult =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_setContextAttributesW((phcontext?.value ?: 0L).toString(), ulattribute.toInt(), (pbuffer?.value ?: 0L).toString(), cbbuffer.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiAcceptSecurityContextAsync(asynccontext: COpaquePointer?, phcredential: COpaquePointer?, phcontext: COpaquePointer?, pinput: COpaquePointer?, fcontextreq: UInt, targetdatarep: UInt, phnewcontext: COpaquePointer?, poutput: COpaquePointer?, pfcontextattr: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_sspiAcceptSecurityContextAsync((asynccontext?.value ?: 0L).toString(), (phcredential?.value ?: 0L).toString(), (phcontext?.value ?: 0L).toString(), (pinput?.value ?: 0L).toString(), fcontextreq.toInt(), targetdatarep.toInt(), (phnewcontext?.value ?: 0L).toString(), (poutput?.value ?: 0L).toString(), (pfcontextattr?.value ?: 0L).toString(), (ptsexpiry?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiAcquireCredentialsHandleAsyncA(asynccontext: COpaquePointer?, pszprincipal: Pcstr, pszpackage: Pcstr, fcredentialuse: UInt, pvlogonid: COpaquePointer?, pauthdata: COpaquePointer?, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: COpaquePointer?, phcredential: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiAcquireCredentialsHandleAsyncW(asynccontext: COpaquePointer?, pszprincipal: COpaquePointer?, pszpackage: COpaquePointer?, fcredentialuse: UInt, pvlogonid: COpaquePointer?, pauthdata: COpaquePointer?, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: COpaquePointer?, phcredential: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiCreateAsyncContext(): COpaquePointer? =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_sspiCreateAsyncContext().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiDeleteSecurityContextAsync(asynccontext: COpaquePointer?, phcontext: COpaquePointer?): Hresult =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_sspiDeleteSecurityContextAsync((asynccontext?.value ?: 0L).toString(), (phcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiFreeAsyncContext(handle: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_sspiFreeAsyncContext((handle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sspiFreeCredentialsHandleAsync(asynccontext: COpaquePointer?, phcredential: COpaquePointer?): Hresult =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_sspiFreeCredentialsHandleAsync((asynccontext?.value ?: 0L).toString(), (phcredential?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiGetAsyncCallStatus(handle: COpaquePointer?): Hresult =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_sspiGetAsyncCallStatus((handle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiInitializeSecurityContextAsyncA(asynccontext: COpaquePointer?, phcredential: COpaquePointer?, phcontext: COpaquePointer?, psztargetname: Pcstr, fcontextreq: UInt, reserved1: UInt, targetdatarep: UInt, pinput: COpaquePointer?, reserved2: UInt, phnewcontext: COpaquePointer?, poutput: COpaquePointer?, pfcontextattr: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_sspiInitializeSecurityContextAsyncA((asynccontext?.value ?: 0L).toString(), (phcredential?.value ?: 0L).toString(), (phcontext?.value ?: 0L).toString(), (psztargetname?.value ?: 0L).toString(), fcontextreq.toInt(), reserved1.toInt(), targetdatarep.toInt(), (pinput?.value ?: 0L).toString(), reserved2.toInt(), (phnewcontext?.value ?: 0L).toString(), (poutput?.value ?: 0L).toString(), (pfcontextattr?.value ?: 0L).toString(), (ptsexpiry?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiInitializeSecurityContextAsyncW(asynccontext: COpaquePointer?, phcredential: COpaquePointer?, phcontext: COpaquePointer?, psztargetname: COpaquePointer?, fcontextreq: UInt, reserved1: UInt, targetdatarep: UInt, pinput: COpaquePointer?, reserved2: UInt, phnewcontext: COpaquePointer?, poutput: COpaquePointer?, pfcontextattr: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_sspiInitializeSecurityContextAsyncW((asynccontext?.value ?: 0L).toString(), (phcredential?.value ?: 0L).toString(), (phcontext?.value ?: 0L).toString(), (psztargetname?.value ?: 0L).toString(), fcontextreq.toInt(), reserved1.toInt(), targetdatarep.toInt(), (pinput?.value ?: 0L).toString(), reserved2.toInt(), (phnewcontext?.value ?: 0L).toString(), (poutput?.value ?: 0L).toString(), (pfcontextattr?.value ?: 0L).toString(), (ptsexpiry?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiReinitAsyncContext(handle: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_sspiReinitAsyncContext((handle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiSetAsyncNotifyCallback(context: COpaquePointer?, callback: SspiAsyncNotifyCallback, callbackdata: COpaquePointer?): Hresult =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_sspiSetAsyncNotifyCallback((context?.value ?: 0L).toString(), 0L.toString(), (callbackdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verifySignature(phcontext: COpaquePointer?, pmessage: COpaquePointer?, messageseqno: UInt, pfqop: COpaquePointer?): Hresult =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_verifySignature((phcontext?.value ?: 0L).toString(), (pmessage?.value ?: 0L).toString(), messageseqno.toInt(), (pfqop?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwAccessCheckAndAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, objecttypename: COpaquePointer?, objectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, desiredaccess: UInt, genericmapping: COpaquePointer?, objectcreation: Boolean, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, generateonclose: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwAccessCheckAndAuditAlarm((subsystemname?.value ?: 0L).toString(), (handleid?.value ?: 0L).toString(), (objecttypename?.value ?: 0L).toString(), (objectname?.value ?: 0L).toString(), (securitydescriptor?.value ?: 0L).toString(), desiredaccess.toInt(), (genericmapping?.value ?: 0L).toString(), objectcreation, (grantedaccess?.value ?: 0L).toString(), (accessstatus?.value ?: 0L).toString(), (generateonclose?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwAccessCheckByTypeAndAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, objecttypename: COpaquePointer?, objectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Boolean, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, generateonclose: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwAccessCheckByTypeAndAuditAlarm((subsystemname?.value ?: 0L).toString(), (handleid?.value ?: 0L).toString(), (objecttypename?.value ?: 0L).toString(), (objectname?.value ?: 0L).toString(), (securitydescriptor?.value ?: 0L).toString(), (principalselfsid?.value ?: 0L).toString(), desiredaccess.toInt(), audittype, flags.toInt(), (objecttypelist?.value ?: 0L).toString(), objecttypelistlength.toInt(), (genericmapping?.value ?: 0L).toString(), objectcreation, (grantedaccess?.value ?: 0L).toString(), (accessstatus?.value ?: 0L).toString(), (generateonclose?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwAccessCheckByTypeResultListAndAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, objecttypename: COpaquePointer?, objectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Boolean, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, generateonclose: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwAccessCheckByTypeResultListAndAuditAlarm((subsystemname?.value ?: 0L).toString(), (handleid?.value ?: 0L).toString(), (objecttypename?.value ?: 0L).toString(), (objectname?.value ?: 0L).toString(), (securitydescriptor?.value ?: 0L).toString(), (principalselfsid?.value ?: 0L).toString(), desiredaccess.toInt(), audittype, flags.toInt(), (objecttypelist?.value ?: 0L).toString(), objecttypelistlength.toInt(), (genericmapping?.value ?: 0L).toString(), objectcreation, (grantedaccess?.value ?: 0L).toString(), (accessstatus?.value ?: 0L).toString(), (generateonclose?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname: COpaquePointer?, handleid: COpaquePointer?, clienttoken: Handle, objecttypename: COpaquePointer?, objectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Boolean, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, generateonclose: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwAccessCheckByTypeResultListAndAuditAlarmByHandle((subsystemname?.value ?: 0L).toString(), (handleid?.value ?: 0L).toString(), (clienttoken?.value ?: 0L).toString(), (objecttypename?.value ?: 0L).toString(), (objectname?.value ?: 0L).toString(), (securitydescriptor?.value ?: 0L).toString(), (principalselfsid?.value ?: 0L).toString(), desiredaccess.toInt(), audittype, flags.toInt(), (objecttypelist?.value ?: 0L).toString(), objecttypelistlength.toInt(), (genericmapping?.value ?: 0L).toString(), objectcreation, (grantedaccess?.value ?: 0L).toString(), (accessstatus?.value ?: 0L).toString(), (generateonclose?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwAdjustGroupsToken(tokenhandle: Handle, resettodefault: Boolean, newstate: COpaquePointer?, bufferlength: UInt, previousstate: COpaquePointer?, returnlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwAdjustGroupsToken((tokenhandle?.value ?: 0L).toString(), resettodefault, (newstate?.value ?: 0L).toString(), bufferlength.toInt(), (previousstate?.value ?: 0L).toString(), (returnlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwAdjustPrivilegesToken(tokenhandle: Handle, disableallprivileges: Boolean, newstate: COpaquePointer?, bufferlength: UInt, previousstate: COpaquePointer?, returnlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwAdjustPrivilegesToken((tokenhandle?.value ?: 0L).toString(), disableallprivileges, (newstate?.value ?: 0L).toString(), bufferlength.toInt(), (previousstate?.value ?: 0L).toString(), (returnlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwAllocateVirtualMemory(processhandle: Handle, baseaddress: COpaquePointer?, zerobits: ULong, regionsize: COpaquePointer?, allocationtype: UInt, protect: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwAllocateVirtualMemory((processhandle?.value ?: 0L).toString(), (baseaddress?.value ?: 0L).toString(), zerobits.toString(), (regionsize?.value ?: 0L).toString(), allocationtype.toInt(), protect.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwAllocateVirtualMemoryEx(processhandle: Handle, baseaddress: COpaquePointer?, regionsize: COpaquePointer?, allocationtype: UInt, pageprotection: UInt, extendedparameters: COpaquePointer?, extendedparametercount: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwAllocateVirtualMemoryEx((processhandle?.value ?: 0L).toString(), (baseaddress?.value ?: 0L).toString(), (regionsize?.value ?: 0L).toString(), allocationtype.toInt(), pageprotection.toInt(), (extendedparameters?.value ?: 0L).toString(), extendedparametercount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCancelIoFileEx(filehandle: Handle, iorequesttocancel: COpaquePointer?, iostatusblock: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwCancelIoFileEx((filehandle?.value ?: 0L).toString(), (iorequesttocancel?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCloseObjectAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, generateonclose: Boolean): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwCloseObjectAuditAlarm((subsystemname?.value ?: 0L).toString(), (handleid?.value ?: 0L).toString(), generateonclose) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCreateDirectoryObject(directoryhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwCreateDirectoryObject((directoryhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCreateEvent(eventhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, eventtype: EventType, initialstate: Boolean): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwCreateEvent((eventhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), eventtype, initialstate) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCreateSectionEx(sectionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, maximumsize: COpaquePointer?, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Handle, extendedparameters: COpaquePointer?, extendedparametercount: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwCreateSectionEx((sectionhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), (maximumsize?.value ?: 0L).toString(), sectionpageprotection.toInt(), allocationattributes.toInt(), (filehandle?.value ?: 0L).toString(), (extendedparameters?.value ?: 0L).toString(), extendedparametercount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwDeleteFile(objectattributes: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwDeleteFile((objectattributes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwDeleteObjectAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, generateonclose: Boolean): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwDeleteObjectAuditAlarm((subsystemname?.value ?: 0L).toString(), (handleid?.value ?: 0L).toString(), generateonclose) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwDuplicateObject(sourceprocesshandle: Handle, sourcehandle: Handle, targetprocesshandle: Handle, targethandle: COpaquePointer?, desiredaccess: UInt, handleattributes: UInt, options: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwDuplicateObject((sourceprocesshandle?.value ?: 0L).toString(), (sourcehandle?.value ?: 0L).toString(), (targetprocesshandle?.value ?: 0L).toString(), (targethandle?.value ?: 0L).toString(), desiredaccess.toInt(), handleattributes.toInt(), options.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwDuplicateToken(existingtokenhandle: Handle, desiredaccess: UInt, objectattributes: COpaquePointer?, effectiveonly: Boolean, tokentype: TokenType, newtokenhandle: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwDuplicateToken((existingtokenhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), effectiveonly, tokentype, (newtokenhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwFilterToken(existingtokenhandle: Handle, flags: UInt, sidstodisable: COpaquePointer?, privilegestodelete: COpaquePointer?, restrictedsids: COpaquePointer?, newtokenhandle: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwFilterToken((existingtokenhandle?.value ?: 0L).toString(), flags.toInt(), (sidstodisable?.value ?: 0L).toString(), (privilegestodelete?.value ?: 0L).toString(), (restrictedsids?.value ?: 0L).toString(), (newtokenhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwFlushBuffersFile(filehandle: Handle, iostatusblock: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwFlushBuffersFile((filehandle?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwFlushBuffersFileEx(filehandle: Handle, flags: UInt, parameters: COpaquePointer?, parameterssize: UInt, iostatusblock: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwFlushBuffersFileEx((filehandle?.value ?: 0L).toString(), flags.toInt(), (parameters?.value ?: 0L).toString(), parameterssize.toInt(), (iostatusblock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwFlushVirtualMemory(processhandle: Handle, baseaddress: COpaquePointer?, regionsize: COpaquePointer?, iostatus: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwFlushVirtualMemory((processhandle?.value ?: 0L).toString(), (baseaddress?.value ?: 0L).toString(), (regionsize?.value ?: 0L).toString(), (iostatus?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwFreeVirtualMemory(processhandle: Handle, baseaddress: COpaquePointer?, regionsize: COpaquePointer?, freetype: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwFreeVirtualMemory((processhandle?.value ?: 0L).toString(), (baseaddress?.value ?: 0L).toString(), (regionsize?.value ?: 0L).toString(), freetype.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwFsControlFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, fscontrolcode: UInt, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwFsControlFile((filehandle?.value ?: 0L).toString(), (event?.value ?: 0L).toString(), 0L.toString(), (apccontext?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), fscontrolcode.toInt(), (inputbuffer?.value ?: 0L).toString(), inputbufferlength.toInt(), (outputbuffer?.value ?: 0L).toString(), outputbufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwImpersonateAnonymousToken(threadhandle: Handle): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwImpersonateAnonymousToken((threadhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwLockFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, byteoffset: COpaquePointer?, length: COpaquePointer?, key: UInt, failimmediately: Boolean, exclusivelock: Boolean): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwLockFile((filehandle?.value ?: 0L).toString(), (event?.value ?: 0L).toString(), 0L.toString(), (apccontext?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), (byteoffset?.value ?: 0L).toString(), (length?.value ?: 0L).toString(), key.toInt(), failimmediately, exclusivelock) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwNotifyChangeKey(keyhandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, completionfilter: UInt, watchtree: Boolean, buffer: COpaquePointer?, buffersize: UInt, asynchronous: Boolean): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwNotifyChangeKey((keyhandle?.value ?: 0L).toString(), (event?.value ?: 0L).toString(), 0L.toString(), (apccontext?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), completionfilter.toInt(), watchtree, (buffer?.value ?: 0L).toString(), buffersize.toInt(), asynchronous) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenDirectoryObject(directoryhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwOpenDirectoryObject((directoryhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenObjectAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, objecttypename: COpaquePointer?, objectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, grantedaccess: UInt, privileges: COpaquePointer?, objectcreation: Boolean, accessgranted: Boolean, generateonclose: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwOpenObjectAuditAlarm((subsystemname?.value ?: 0L).toString(), (handleid?.value ?: 0L).toString(), (objecttypename?.value ?: 0L).toString(), (objectname?.value ?: 0L).toString(), (securitydescriptor?.value ?: 0L).toString(), (clienttoken?.value ?: 0L).toString(), desiredaccess.toInt(), grantedaccess.toInt(), (privileges?.value ?: 0L).toString(), objectcreation, accessgranted, (generateonclose?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenProcessToken(processhandle: Handle, desiredaccess: UInt, tokenhandle: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwOpenProcessToken((processhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (tokenhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenProcessTokenEx(processhandle: Handle, desiredaccess: UInt, handleattributes: UInt, tokenhandle: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwOpenProcessTokenEx((processhandle?.value ?: 0L).toString(), desiredaccess.toInt(), handleattributes.toInt(), (tokenhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenThreadToken(threadhandle: Handle, desiredaccess: UInt, openasself: Boolean, tokenhandle: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwOpenThreadToken((threadhandle?.value ?: 0L).toString(), desiredaccess.toInt(), openasself, (tokenhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenThreadTokenEx(threadhandle: Handle, desiredaccess: UInt, openasself: Boolean, handleattributes: UInt, tokenhandle: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwOpenThreadTokenEx((threadhandle?.value ?: 0L).toString(), desiredaccess.toInt(), openasself, handleattributes.toInt(), (tokenhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwPrivilegeCheck(clienttoken: Handle, requiredprivileges: COpaquePointer?, result: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwPrivilegeCheck((clienttoken?.value ?: 0L).toString(), (requiredprivileges?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwPrivilegeObjectAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, clienttoken: Handle, desiredaccess: UInt, privileges: COpaquePointer?, accessgranted: Boolean): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwPrivilegeObjectAuditAlarm((subsystemname?.value ?: 0L).toString(), (handleid?.value ?: 0L).toString(), (clienttoken?.value ?: 0L).toString(), desiredaccess.toInt(), (privileges?.value ?: 0L).toString(), accessgranted) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwPrivilegedServiceAuditAlarm(subsystemname: COpaquePointer?, servicename: COpaquePointer?, clienttoken: Handle, privileges: COpaquePointer?, accessgranted: Boolean): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwPrivilegedServiceAuditAlarm((subsystemname?.value ?: 0L).toString(), (servicename?.value ?: 0L).toString(), (clienttoken?.value ?: 0L).toString(), (privileges?.value ?: 0L).toString(), accessgranted) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryDirectoryFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass, returnsingleentry: Boolean, filename: COpaquePointer?, restartscan: Boolean): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwQueryDirectoryFile((filehandle?.value ?: 0L).toString(), (event?.value ?: 0L).toString(), 0L.toString(), (apccontext?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), (fileinformation?.value ?: 0L).toString(), length.toInt(), fileinformationclass, returnsingleentry, (filename?.value ?: 0L).toString(), restartscan) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryDirectoryFileEx(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass, queryflags: UInt, filename: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwQueryDirectoryFileEx((filehandle?.value ?: 0L).toString(), (event?.value ?: 0L).toString(), 0L.toString(), (apccontext?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), (fileinformation?.value ?: 0L).toString(), length.toInt(), fileinformationclass, queryflags.toInt(), (filename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryDirectoryObject(directoryhandle: Handle, buffer: COpaquePointer?, length: UInt, returnsingleentry: Boolean, restartscan: Boolean, context: COpaquePointer?, returnlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwQueryDirectoryObject((directoryhandle?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), length.toInt(), returnsingleentry, restartscan, (context?.value ?: 0L).toString(), (returnlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryEaFile(filehandle: Handle, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt, returnsingleentry: Boolean, ealist: COpaquePointer?, ealistlength: UInt, eaindex: COpaquePointer?, restartscan: Boolean): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwQueryEaFile((filehandle?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), length.toInt(), returnsingleentry, (ealist?.value ?: 0L).toString(), ealistlength.toInt(), (eaindex?.value ?: 0L).toString(), restartscan) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryFullAttributesFile(objectattributes: COpaquePointer?, fileinformation: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwQueryFullAttributesFile((objectattributes?.value ?: 0L).toString(), (fileinformation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryInformationToken(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: COpaquePointer?, tokeninformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwQueryInformationToken((tokenhandle?.value ?: 0L).toString(), tokeninformationclass, (tokeninformation?.value ?: 0L).toString(), tokeninformationlength.toInt(), (returnlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryObject(handle: Handle, objectinformationclass: ObjectInformationClass, objectinformation: COpaquePointer?, objectinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwQueryObject((handle?.value ?: 0L).toString(), objectinformationclass, (objectinformation?.value ?: 0L).toString(), objectinformationlength.toInt(), (returnlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryQuotaInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt, returnsingleentry: Boolean, sidlist: COpaquePointer?, sidlistlength: UInt, startsid: Psid, restartscan: Boolean): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwQueryQuotaInformationFile((filehandle?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), length.toInt(), returnsingleentry, (sidlist?.value ?: 0L).toString(), sidlistlength.toInt(), (startsid?.value ?: 0L).toString(), restartscan) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQuerySecurityObject(handle: Handle, securityinformation: UInt, securitydescriptor: PsecurityDescriptor, length: UInt, lengthneeded: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwQuerySecurityObject((handle?.value ?: 0L).toString(), securityinformation.toInt(), (securitydescriptor?.value ?: 0L).toString(), length.toInt(), (lengthneeded?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryVirtualMemory(processhandle: Handle, baseaddress: COpaquePointer?, memoryinformationclass: MemoryInformationClass, memoryinformation: COpaquePointer?, memoryinformationlength: ULong, returnlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwQueryVirtualMemory((processhandle?.value ?: 0L).toString(), (baseaddress?.value ?: 0L).toString(), memoryinformationclass, (memoryinformation?.value ?: 0L).toString(), memoryinformationlength.toString(), (returnlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryVolumeInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, fsinformation: COpaquePointer?, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwQueryVolumeInformationFile((filehandle?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), (fsinformation?.value ?: 0L).toString(), length.toInt(), fsinformationclass) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetEaFile(filehandle: Handle, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwSetEaFile((filehandle?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), length.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetEvent(eventhandle: Handle, previousstate: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwSetEvent((eventhandle?.value ?: 0L).toString(), (previousstate?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetInformationToken(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: COpaquePointer?, tokeninformationlength: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwSetInformationToken((tokenhandle?.value ?: 0L).toString(), tokeninformationclass, (tokeninformation?.value ?: 0L).toString(), tokeninformationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetInformationVirtualMemory(processhandle: Handle, vminformationclass: VirtualMemoryInformationClass, numberofentries: ULong, virtualaddresses: COpaquePointer?, vminformation: COpaquePointer?, vminformationlength: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwSetInformationVirtualMemory((processhandle?.value ?: 0L).toString(), vminformationclass, numberofentries.toString(), (virtualaddresses?.value ?: 0L).toString(), (vminformation?.value ?: 0L).toString(), vminformationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetQuotaInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwSetQuotaInformationFile((filehandle?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), length.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetSecurityObject(handle: Handle, securityinformation: UInt, securitydescriptor: PsecurityDescriptor): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwSetSecurityObject((handle?.value ?: 0L).toString(), securityinformation.toInt(), (securitydescriptor?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetVolumeInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, fsinformation: COpaquePointer?, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwSetVolumeInformationFile((filehandle?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), (fsinformation?.value ?: 0L).toString(), length.toInt(), fsinformationclass) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwUnlockFile(filehandle: Handle, iostatusblock: COpaquePointer?, byteoffset: COpaquePointer?, length: COpaquePointer?, key: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_zwUnlockFile((filehandle?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), (byteoffset?.value ?: 0L).toString(), (length?.value ?: 0L).toString(), key.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")
