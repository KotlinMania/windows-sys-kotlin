@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.windows.wdk.foundation.IoPriorityHint
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Peprocess
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pethread
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PnotifySync
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PoolType
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FileInformationClass
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FsInformationClass
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.PcheckForTraverseAccess
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.PfilterReportChange
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.PfsrtlExtraCreateParameterCleanupCallback
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.PunlockRoutine
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.WorkQueueType
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.FilterInformationClass
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.FilterVolumeInformationClass
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.InstanceInformationClass
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.WaitType

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWdkStorageFilesystemMinifiltersNapiAddon(): Boolean

private val _windowsWdkStorageFilesystemMinifiltersNapiAvailable: Boolean = _initWindowsWdkStorageFilesystemMinifiltersNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltAcknowledgeEcp(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltAcknowledgeEcp(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltAcquirePushLockExclusive(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltAcquirePushLockExclusive(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltAcquirePushLockExclusiveEx(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltAcquirePushLockExclusiveEx(p0: String, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltAcquirePushLockShared(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltAcquirePushLockShared(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltAcquirePushLockSharedEx(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltAcquirePushLockSharedEx(p0: String, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltAcquireResourceExclusive(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltAcquireResourceExclusive(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltAcquireResourceShared(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltAcquireResourceShared(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltAddOpenReparseEntry(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltAddOpenReparseEntry(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltAdjustDeviceStackSizeForIoRedirection(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltAdjustDeviceStackSizeForIoRedirection(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocateCallbackData(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocateCallbackData(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocateCallbackDataEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocateCallbackDataEx(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocateContext(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocateContext(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocateDeferredIoWorkItem()")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocateDeferredIoWorkItem(): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocateExtraCreateParameter(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocateExtraCreateParameter(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocateExtraCreateParameterFromLookasideList(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocateExtraCreateParameterFromLookasideList(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocateExtraCreateParameterList(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocateExtraCreateParameterList(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocateFileLock(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocateFileLock(p0: String, p1: String): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocateGenericWorkItem()")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocateGenericWorkItem(): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocatePoolAlignedWithTag(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocatePoolAlignedWithTag(p0: String, p1: Int, p2: String, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltApplyPriorityInfoThread(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltApplyPriorityInfoThread(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltAttachVolume(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltAttachVolume(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltAttachVolumeAtAltitude(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltAttachVolumeAtAltitude(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltBuildDefaultSecurityDescriptor(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltBuildDefaultSecurityDescriptor(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltCancelFileOpen(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCancelFileOpen(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltCancelIo(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCancelIo(p0: String): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltCancellableWaitForMultipleObjects(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCancellableWaitForMultipleObjects(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltCancellableWaitForSingleObject(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCancellableWaitForSingleObject(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltCbdqDisable(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCbdqDisable(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltCbdqEnable(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCbdqEnable(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltCbdqInitialize(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCbdqInitialize(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltCbdqInsertIo(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCbdqInsertIo(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltCbdqRemoveIo(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCbdqRemoveIo(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltCbdqRemoveNextIo(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCbdqRemoveNextIo(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltCheckAndGrowNameControl(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCheckAndGrowNameControl(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltCheckLockForReadAccess(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCheckLockForReadAccess(p0: String, p1: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltCheckLockForWriteAccess(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCheckLockForWriteAccess(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltCheckOplock(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCheckOplock(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltCheckOplockEx(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCheckOplockEx(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltClearCallbackDataDirty(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltClearCallbackDataDirty(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltClearCancelCompletion(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltClearCancelCompletion(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltClose(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltClose(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltCloseClientPort(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCloseClientPort(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltCloseCommunicationPort(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCloseCommunicationPort(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltCloseSectionForDataScan(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCloseSectionForDataScan(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltCommitComplete(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCommitComplete(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltCommitFinalizeComplete(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCommitFinalizeComplete(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltCompareInstanceAltitudes(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCompareInstanceAltitudes(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltCompletePendedPostOperation(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCompletePendedPostOperation(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltCompletePendedPreOperation(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCompletePendedPreOperation(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltCopyOpenReparseList(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCopyOpenReparseList(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltCreateCommunicationPort(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCreateCommunicationPort(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltCreateFile(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCreateFile(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: Int, p8: Int, p9: Int, p10: Int, p11: String, p12: Int, p13: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltCreateFileEx(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCreateFileEx(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String, p8: Int, p9: Int, p10: Int, p11: Int, p12: String, p13: Int, p14: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltCreateFileEx2(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCreateFileEx2(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String, p8: Int, p9: Int, p10: Int, p11: Int, p12: String, p13: Int, p14: Int, p15: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltCreateMailslotFile(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCreateMailslotFile(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: Int, p8: Int, p9: Int, p10: String, p11: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltCreateNamedPipeFile(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCreateNamedPipeFile(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: Int, p8: Int, p9: Int, p10: Int, p11: Int, p12: Int, p13: Int, p14: Int, p15: Int, p16: String, p17: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltCreateSectionForDataScan(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCreateSectionForDataScan(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: Int, p7: Int, p8: Int, p9: String, p10: String, p11: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltCreateSystemVolumeInformationFolder(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCreateSystemVolumeInformationFolder(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltCurrentBatchOplock(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCurrentBatchOplock(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltCurrentOplock(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCurrentOplock(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltCurrentOplockH(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCurrentOplockH(p0: String): Boolean

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltDecodeParameters(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltDecodeParameters(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltDeleteContext(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltDeleteContext(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltDeleteExtraCreateParameterLookasideList(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltDeleteExtraCreateParameterLookasideList(p0: String, p1: String, p2: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltDeleteFileContext(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltDeleteFileContext(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltDeleteInstanceContext(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltDeleteInstanceContext(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltDeletePushLock(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltDeletePushLock(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltDeleteStreamContext(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltDeleteStreamContext(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltDeleteStreamHandleContext(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltDeleteStreamHandleContext(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltDeleteTransactionContext(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltDeleteTransactionContext(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltDeleteVolumeContext(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltDeleteVolumeContext(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltDetachVolume(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltDetachVolume(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltDeviceIoControlFile(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltDeviceIoControlFile(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltDoCompletionProcessingWhenSafe(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltDoCompletionProcessingWhenSafe(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltEnlistInTransaction(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltEnlistInTransaction(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltEnumerateFilterInformation(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltEnumerateFilterInformation(p0: Int, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltEnumerateFilters(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltEnumerateFilters(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltEnumerateInstanceInformationByDeviceObject(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltEnumerateInstanceInformationByDeviceObject(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltEnumerateInstanceInformationByFilter(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltEnumerateInstanceInformationByFilter(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltEnumerateInstanceInformationByVolume(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltEnumerateInstanceInformationByVolume(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltEnumerateInstanceInformationByVolumeName(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltEnumerateInstanceInformationByVolumeName(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltEnumerateInstances(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltEnumerateInstances(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltEnumerateVolumeInformation(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltEnumerateVolumeInformation(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltEnumerateVolumes(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltEnumerateVolumes(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltFastIoMdlRead(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltFastIoMdlRead(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltFastIoMdlReadComplete(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltFastIoMdlReadComplete(p0: String, p1: String, p2: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltFastIoMdlWriteComplete(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltFastIoMdlWriteComplete(p0: String, p1: String, p2: String, p3: String): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltFastIoPrepareMdlWrite(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltFastIoPrepareMdlWrite(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: String): Boolean

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltFindExtraCreateParameter(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltFindExtraCreateParameter(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltFlushBuffers(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltFlushBuffers(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltFlushBuffers2(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltFlushBuffers2(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltFreeCallbackData(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltFreeCallbackData(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltFreeDeferredIoWorkItem(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltFreeDeferredIoWorkItem(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltFreeExtraCreateParameter(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltFreeExtraCreateParameter(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltFreeExtraCreateParameterList(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltFreeExtraCreateParameterList(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltFreeFileLock(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltFreeFileLock(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltFreeGenericWorkItem(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltFreeGenericWorkItem(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltFreeOpenReparseList(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltFreeOpenReparseList(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltFreePoolAlignedWithTag(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltFreePoolAlignedWithTag(p0: String, p1: String, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltFreeSecurityDescriptor(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltFreeSecurityDescriptor(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltFsControlFile(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltFsControlFile(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetActivityIdCallbackData(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetActivityIdCallbackData(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetBottomInstance(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetBottomInstance(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetContexts(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetContexts(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetContextsEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetContextsEx(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetDestinationFileNameInformation(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetDestinationFileNameInformation(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetDeviceObject(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetDeviceObject(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetDiskDeviceObject(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetDiskDeviceObject(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetEcpListFromCallbackData(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetEcpListFromCallbackData(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetFileContext(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetFileContext(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetFileNameInformation(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetFileNameInformation(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetFileNameInformationUnsafe(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetFileNameInformationUnsafe(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetFileSystemType(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetFileSystemType(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetFilterFromInstance(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetFilterFromInstance(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetFilterFromName(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetFilterFromName(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetFilterInformation(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetFilterInformation(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetFsZeroingOffset(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetFsZeroingOffset(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetInstanceContext(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetInstanceContext(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetInstanceInformation(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetInstanceInformation(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetIoAttributionHandleFromCallbackData(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetIoAttributionHandleFromCallbackData(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetIoPriorityHint(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetIoPriorityHint(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetIoPriorityHintFromCallbackData(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetIoPriorityHintFromCallbackData(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetIoPriorityHintFromFileObject(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetIoPriorityHintFromFileObject(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetIoPriorityHintFromThread(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetIoPriorityHintFromThread(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetIrpName(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetIrpName(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetLowerInstance(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetLowerInstance(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetNewSystemBufferAddress(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetNewSystemBufferAddress(p0: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetNextExtraCreateParameter(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetNextExtraCreateParameter(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetRequestorProcess(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetRequestorProcess(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetRequestorProcessId(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetRequestorProcessId(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetRequestorProcessIdEx(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetRequestorProcessIdEx(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetRequestorSessionId(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetRequestorSessionId(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetRoutineAddress(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetRoutineAddress(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetSectionContext(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetSectionContext(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetStreamContext(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetStreamContext(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetStreamHandleContext(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetStreamHandleContext(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetSwappedBufferMdlAddress(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetSwappedBufferMdlAddress(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetTopInstance(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetTopInstance(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetTransactionContext(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetTransactionContext(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetTunneledName(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetTunneledName(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetUpperInstance(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetUpperInstance(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeContext(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeContext(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeFromDeviceObject(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeFromDeviceObject(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeFromFileObject(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeFromFileObject(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeFromInstance(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeFromInstance(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeFromName(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeFromName(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeGuidName(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeGuidName(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeInformation(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeInformation(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeInstanceFromName(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeInstanceFromName(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeName(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeName(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeProperties(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeProperties(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltInitExtraCreateParameterLookasideList(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltInitExtraCreateParameterLookasideList(p0: String, p1: String, p2: Int, p3: String, p4: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltInitializeFileLock(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltInitializeFileLock(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltInitializeOplock(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltInitializeOplock(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltInitializePushLock(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltInitializePushLock(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltInsertExtraCreateParameter(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltInsertExtraCreateParameter(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltIs32bitProcess(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltIs32bitProcess(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltIsCallbackDataDirty(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltIsCallbackDataDirty(p0: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltIsDirectory(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltIsDirectory(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltIsEcpAcknowledged(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltIsEcpAcknowledged(p0: String, p1: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltIsEcpFromUserMode(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltIsEcpFromUserMode(p0: String, p1: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltIsFltMgrVolumeDeviceObject(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltIsFltMgrVolumeDeviceObject(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltIsIoCanceled(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltIsIoCanceled(p0: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltIsIoRedirectionAllowed(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltIsIoRedirectionAllowed(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltIsIoRedirectionAllowedForOperation(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltIsIoRedirectionAllowedForOperation(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltIsOperationSynchronous(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltIsOperationSynchronous(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltIsVolumeSnapshot(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltIsVolumeSnapshot(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltIsVolumeWritable(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltIsVolumeWritable(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltLoadFilter(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltLoadFilter(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltLockUserBuffer(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltLockUserBuffer(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltObjectDereference(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltObjectDereference(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltObjectReference(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltObjectReference(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltOpenVolume(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltOpenVolume(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltOplockBreakH(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltOplockBreakH(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltOplockBreakToNone(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltOplockBreakToNone(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltOplockBreakToNoneEx(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltOplockBreakToNoneEx(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltOplockFsctrl(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltOplockFsctrl(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltOplockFsctrlEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltOplockFsctrlEx(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltOplockIsFastIoPossible(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltOplockIsFastIoPossible(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltOplockIsSharedRequest(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltOplockIsSharedRequest(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltOplockKeysEqual(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltOplockKeysEqual(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltParseFileName(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltParseFileName(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltParseFileNameInformation(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltParseFileNameInformation(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltPerformAsynchronousIo(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltPerformAsynchronousIo(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltPerformSynchronousIo(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltPerformSynchronousIo(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltPrePrepareComplete(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltPrePrepareComplete(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltPrepareComplete(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltPrepareComplete(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltPrepareToReuseEcp(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltPrepareToReuseEcp(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltProcessFileLock(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltProcessFileLock(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltPropagateActivityIdToThread(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltPropagateActivityIdToThread(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltPropagateIrpExtension(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltPropagateIrpExtension(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltPurgeFileNameInformationCache(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltPurgeFileNameInformationCache(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltQueryDirectoryFile(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltQueryDirectoryFile(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Boolean, p6: String, p7: Boolean, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltQueryDirectoryFileEx(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltQueryDirectoryFileEx(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltQueryEaFile(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltQueryEaFile(p0: String, p1: String, p2: String, p3: Int, p4: Boolean, p5: String, p6: Int, p7: String, p8: Boolean, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltQueryInformationByName(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltQueryInformationByName(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltQueryInformationFile(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltQueryInformationFile(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltQueryQuotaInformationFile(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltQueryQuotaInformationFile(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Boolean, p6: String, p7: Int, p8: String, p9: Boolean, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltQuerySecurityObject(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltQuerySecurityObject(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltQueryVolumeInformation(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltQueryVolumeInformation(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltQueryVolumeInformationFile(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltQueryVolumeInformationFile(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltQueueDeferredIoWorkItem(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltQueueDeferredIoWorkItem(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltQueueGenericWorkItem(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltQueueGenericWorkItem(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltReadFile(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltReadFile(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltReadFileEx(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltReadFileEx(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: String, p9: String, p10: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltReferenceContext(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltReferenceContext(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltReferenceFileNameInformation(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltReferenceFileNameInformation(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltRegisterFilter(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltRegisterFilter(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltRegisterForDataScan(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltRegisterForDataScan(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltReissueSynchronousIo(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltReissueSynchronousIo(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltReleaseContext(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltReleaseContext(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltReleaseContexts(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltReleaseContexts(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltReleaseContextsEx(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltReleaseContextsEx(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltReleaseFileNameInformation(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltReleaseFileNameInformation(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltReleasePushLock(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltReleasePushLock(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltReleasePushLockEx(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltReleasePushLockEx(p0: String, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltReleaseResource(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltReleaseResource(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltRemoveExtraCreateParameter(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltRemoveExtraCreateParameter(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltRemoveOpenReparseEntry(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltRemoveOpenReparseEntry(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltRequestFileInfoOnCreateCompletion(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltRequestFileInfoOnCreateCompletion(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltRequestOperationStatusCallback(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltRequestOperationStatusCallback(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltRetainSwappedBufferMdlAddress(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltRetainSwappedBufferMdlAddress(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltRetrieveFileInfoOnCreateCompletion(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltRetrieveFileInfoOnCreateCompletion(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltRetrieveFileInfoOnCreateCompletionEx(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltRetrieveFileInfoOnCreateCompletionEx(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltRetrieveIoPriorityInfo(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltRetrieveIoPriorityInfo(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltReuseCallbackData(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltReuseCallbackData(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltRollbackComplete(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltRollbackComplete(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltRollbackEnlistment(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltRollbackEnlistment(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltSendMessage(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSendMessage(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltSetActivityIdCallbackData(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSetActivityIdCallbackData(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltSetCallbackDataDirty(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSetCallbackDataDirty(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltSetCancelCompletion(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSetCancelCompletion(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltSetEaFile(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSetEaFile(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltSetEcpListIntoCallbackData(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSetEcpListIntoCallbackData(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltSetFileContext(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSetFileContext(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltSetFsZeroingOffset(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSetFsZeroingOffset(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltSetFsZeroingOffsetRequired(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSetFsZeroingOffsetRequired(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltSetInformationFile(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSetInformationFile(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltSetInstanceContext(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSetInstanceContext(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltSetIoPriorityHintIntoCallbackData(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSetIoPriorityHintIntoCallbackData(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltSetIoPriorityHintIntoFileObject(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSetIoPriorityHintIntoFileObject(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltSetIoPriorityHintIntoThread(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSetIoPriorityHintIntoThread(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltSetQuotaInformationFile(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSetQuotaInformationFile(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltSetSecurityObject(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSetSecurityObject(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltSetStreamContext(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSetStreamContext(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltSetStreamHandleContext(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSetStreamHandleContext(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltSetTransactionContext(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSetTransactionContext(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltSetVolumeContext(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSetVolumeContext(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltSetVolumeInformation(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSetVolumeInformation(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltStartFiltering(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltStartFiltering(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltSupportsFileContexts(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSupportsFileContexts(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltSupportsFileContextsEx(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSupportsFileContextsEx(p0: String, p1: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltSupportsStreamContexts(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSupportsStreamContexts(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltSupportsStreamHandleContexts(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSupportsStreamHandleContexts(p0: String): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltTagFile(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltTagFile(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltTagFileEx(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltTagFileEx(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: Int, p7: String, p8: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltUninitializeFileLock(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltUninitializeFileLock(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltUninitializeOplock(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltUninitializeOplock(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltUnloadFilter(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltUnloadFilter(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltUnregisterFilter(p0)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltUnregisterFilter(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltUntagFile(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltUntagFile(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltVetoBypassIo(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltVetoBypassIo(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltWriteFile(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltWriteFile(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltWriteFileEx(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltWriteFileEx(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: String, p9: String, p10: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_storage_filesystem_minifilters_fltpTraceRedirectedFileIo(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltpTraceRedirectedFileIo(p0: String, p1: String): Int

public actual fun fltAcknowledgeEcp(filter: PfltFilter, ecpcontext: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltAcknowledgeEcp(filter.toString(), (ecpcontext?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltAcquirePushLockExclusive(pushlock: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltAcquirePushLockExclusive((pushlock?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltAcquirePushLockExclusiveEx(pushlock: COpaquePointer?, flags: UInt) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltAcquirePushLockExclusiveEx((pushlock?.value ?: 0L).toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltAcquirePushLockShared(pushlock: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltAcquirePushLockShared((pushlock?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltAcquirePushLockSharedEx(pushlock: COpaquePointer?, flags: UInt) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltAcquirePushLockSharedEx((pushlock?.value ?: 0L).toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltAcquireResourceExclusive(resource: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltAcquireResourceExclusive((resource?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltAcquireResourceShared(resource: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltAcquireResourceShared((resource?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltAddOpenReparseEntry(filter: PfltFilter, data: COpaquePointer?, openreparseentry: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltAddOpenReparseEntry(filter.toString(), (data?.value ?: 0L).toString(), (openreparseentry?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltAdjustDeviceStackSizeForIoRedirection(sourceinstance: PfltInstance, targetinstance: PfltInstance, sourcedevicestacksizemodified: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltAdjustDeviceStackSizeForIoRedirection(sourceinstance.toString(), targetinstance.toString(), (sourcedevicestacksizemodified?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltAllocateCallbackData(instance: PfltInstance, fileobject: COpaquePointer?, retnewcallbackdata: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocateCallbackData(instance.toString(), (fileobject?.value ?: 0L).toString(), (retnewcallbackdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltAllocateCallbackDataEx(instance: PfltInstance, fileobject: COpaquePointer?, flags: UInt, retnewcallbackdata: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocateCallbackDataEx(instance.toString(), (fileobject?.value ?: 0L).toString(), flags.toInt(), (retnewcallbackdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltAllocateContext(filter: PfltFilter, contexttype: UShort, contextsize: ULong, pooltype: PoolType, returnedcontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocateContext(filter.toString(), contexttype.toInt(), contextsize.toString(), pooltype, (returnedcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltAllocateDeferredIoWorkItem(): PfltDeferredIoWorkitem =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocateDeferredIoWorkItem().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltAllocateExtraCreateParameter(filter: PfltFilter, ecptype: COpaquePointer?, sizeofcontext: UInt, flags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, pooltag: UInt, ecpcontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocateExtraCreateParameter(filter.toString(), (ecptype?.value ?: 0L).toString(), sizeofcontext.toInt(), flags.toInt(), 0L.toString(), pooltag.toInt(), (ecpcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltAllocateExtraCreateParameterFromLookasideList(filter: PfltFilter, ecptype: COpaquePointer?, sizeofcontext: UInt, flags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, lookasidelist: COpaquePointer?, ecpcontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocateExtraCreateParameterFromLookasideList(filter.toString(), (ecptype?.value ?: 0L).toString(), sizeofcontext.toInt(), flags.toInt(), 0L.toString(), (lookasidelist?.value ?: 0L).toString(), (ecpcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltAllocateExtraCreateParameterList(filter: PfltFilter, flags: UInt, ecplist: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocateExtraCreateParameterList(filter.toString(), flags.toInt(), (ecplist?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltAllocateFileLock(completelockcallbackdataroutine: PfltCompleteLockCallbackDataRoutine, unlockroutine: PunlockRoutine): COpaquePointer? =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocateFileLock(0L.toString(), 0L.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltAllocateGenericWorkItem(): PfltGenericWorkitem =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocateGenericWorkItem().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltAllocatePoolAlignedWithTag(instance: PfltInstance, pooltype: PoolType, numberofbytes: ULong, tag: UInt): COpaquePointer? =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocatePoolAlignedWithTag(instance.toString(), pooltype, numberofbytes.toString(), tag.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltApplyPriorityInfoThread(inputpriorityinfo: COpaquePointer?, outputpriorityinfo: COpaquePointer?, thread: Pethread): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltApplyPriorityInfoThread((inputpriorityinfo?.value ?: 0L).toString(), (outputpriorityinfo?.value ?: 0L).toString(), thread.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltAttachVolume(filter: PfltFilter, volume: PfltVolume, instancename: COpaquePointer?, retinstance: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltAttachVolume(filter.toString(), volume.toString(), (instancename?.value ?: 0L).toString(), (retinstance?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltAttachVolumeAtAltitude(filter: PfltFilter, volume: PfltVolume, altitude: COpaquePointer?, instancename: COpaquePointer?, retinstance: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltAttachVolumeAtAltitude(filter.toString(), volume.toString(), (altitude?.value ?: 0L).toString(), (instancename?.value ?: 0L).toString(), (retinstance?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltBuildDefaultSecurityDescriptor(securitydescriptor: COpaquePointer?, desiredaccess: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltBuildDefaultSecurityDescriptor((securitydescriptor?.value ?: 0L).toString(), desiredaccess.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCancelFileOpen(instance: PfltInstance, fileobject: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCancelFileOpen(instance.toString(), (fileobject?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltCancelIo(callbackdata: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCancelIo((callbackdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCancellableWaitForMultipleObjects(count: UInt, objectarray: COpaquePointer?, waittype: WaitType, timeout: COpaquePointer?, waitblockarray: COpaquePointer?, callbackdata: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCancellableWaitForMultipleObjects(count.toInt(), (objectarray?.value ?: 0L).toString(), waittype, (timeout?.value ?: 0L).toString(), (waitblockarray?.value ?: 0L).toString(), (callbackdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCancellableWaitForSingleObject(obj: COpaquePointer?, timeout: COpaquePointer?, callbackdata: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCancellableWaitForSingleObject((obj?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString(), (callbackdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCbdqDisable(cbdq: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCbdqDisable((cbdq?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltCbdqEnable(cbdq: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCbdqEnable((cbdq?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltCbdqInitialize(instance: PfltInstance, cbdq: COpaquePointer?, cbdqinsertio: PfltCallbackDataQueueInsertIo, cbdqremoveio: PfltCallbackDataQueueRemoveIo, cbdqpeeknextio: PfltCallbackDataQueuePeekNextIo, cbdqacquire: PfltCallbackDataQueueAcquire, cbdqrelease: PfltCallbackDataQueueRelease, cbdqcompletecanceledio: PfltCallbackDataQueueCompleteCanceledIo): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCbdqInitialize(instance.toString(), (cbdq?.value ?: 0L).toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCbdqInsertIo(cbdq: COpaquePointer?, cbd: COpaquePointer?, context: COpaquePointer?, insertcontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCbdqInsertIo((cbdq?.value ?: 0L).toString(), (cbd?.value ?: 0L).toString(), (context?.value ?: 0L).toString(), (insertcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCbdqRemoveIo(cbdq: COpaquePointer?, context: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCbdqRemoveIo((cbdq?.value ?: 0L).toString(), (context?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCbdqRemoveNextIo(cbdq: COpaquePointer?, peekcontext: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCbdqRemoveNextIo((cbdq?.value ?: 0L).toString(), (peekcontext?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCheckAndGrowNameControl(namectrl: COpaquePointer?, newsize: UShort): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCheckAndGrowNameControl((namectrl?.value ?: 0L).toString(), newsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCheckLockForReadAccess(filelock: COpaquePointer?, callbackdata: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCheckLockForReadAccess((filelock?.value ?: 0L).toString(), (callbackdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCheckLockForWriteAccess(filelock: COpaquePointer?, callbackdata: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCheckLockForWriteAccess((filelock?.value ?: 0L).toString(), (callbackdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCheckOplock(oplock: COpaquePointer?, callbackdata: COpaquePointer?, context: COpaquePointer?, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCheckOplock((oplock?.value ?: 0L).toString(), (callbackdata?.value ?: 0L).toString(), (context?.value ?: 0L).toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCheckOplockEx(oplock: COpaquePointer?, callbackdata: COpaquePointer?, flags: UInt, context: COpaquePointer?, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCheckOplockEx((oplock?.value ?: 0L).toString(), (callbackdata?.value ?: 0L).toString(), flags.toInt(), (context?.value ?: 0L).toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltClearCallbackDataDirty(data: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltClearCallbackDataDirty((data?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltClearCancelCompletion(callbackdata: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltClearCancelCompletion((callbackdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltClose(filehandle: Handle): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltClose((filehandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCloseClientPort(filter: PfltFilter, clientport: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCloseClientPort(filter.toString(), (clientport?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltCloseCommunicationPort(serverport: PfltPort) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCloseCommunicationPort(serverport.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltCloseSectionForDataScan(sectioncontext: PfltContext): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCloseSectionForDataScan((sectioncontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCommitComplete(instance: PfltInstance, transaction: COpaquePointer?, transactioncontext: PfltContext): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCommitComplete(instance.toString(), (transaction?.value ?: 0L).toString(), (transactioncontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCommitFinalizeComplete(instance: PfltInstance, transaction: COpaquePointer?, transactioncontext: PfltContext): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCommitFinalizeComplete(instance.toString(), (transaction?.value ?: 0L).toString(), (transactioncontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCompareInstanceAltitudes(instance1: PfltInstance, instance2: PfltInstance): Int =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCompareInstanceAltitudes(instance1.toString(), instance2.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCompletePendedPostOperation(callbackdata: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCompletePendedPostOperation((callbackdata?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltCompletePendedPreOperation(callbackdata: COpaquePointer?, callbackstatus: FltPreopCallbackStatus, context: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCompletePendedPreOperation((callbackdata?.value ?: 0L).toString(), callbackstatus, (context?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltCopyOpenReparseList(filter: PfltFilter, data: COpaquePointer?, ecplist: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCopyOpenReparseList(filter.toString(), (data?.value ?: 0L).toString(), (ecplist?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCreateCommunicationPort(filter: PfltFilter, serverport: COpaquePointer?, objectattributes: COpaquePointer?, serverportcookie: COpaquePointer?, connectnotifycallback: PfltConnectNotify, disconnectnotifycallback: PfltDisconnectNotify, messagenotifycallback: PfltMessageNotify, maxconnections: Int): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCreateCommunicationPort(filter.toString(), (serverport?.value ?: 0L).toString(), (objectattributes?.value ?: 0L).toString(), (serverportcookie?.value ?: 0L).toString(), 0L.toString(), 0L.toString(), 0L.toString(), maxconnections) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCreateFile(filter: PfltFilter, instance: PfltInstance, filehandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, allocationsize: COpaquePointer?, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: COpaquePointer?, ealength: UInt, flags: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCreateFile(filter.toString(), instance.toString(), (filehandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), (allocationsize?.value ?: 0L).toString(), fileattributes.toInt(), shareaccess.toInt(), createdisposition.toInt(), createoptions.toInt(), (eabuffer?.value ?: 0L).toString(), ealength.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCreateFileEx(filter: PfltFilter, instance: PfltInstance, filehandle: COpaquePointer?, fileobject: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, allocationsize: COpaquePointer?, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: COpaquePointer?, ealength: UInt, flags: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCreateFileEx(filter.toString(), instance.toString(), (filehandle?.value ?: 0L).toString(), (fileobject?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), (allocationsize?.value ?: 0L).toString(), fileattributes.toInt(), shareaccess.toInt(), createdisposition.toInt(), createoptions.toInt(), (eabuffer?.value ?: 0L).toString(), ealength.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCreateFileEx2(filter: PfltFilter, instance: PfltInstance, filehandle: COpaquePointer?, fileobject: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, allocationsize: COpaquePointer?, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: COpaquePointer?, ealength: UInt, flags: UInt, drivercontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCreateFileEx2(filter.toString(), instance.toString(), (filehandle?.value ?: 0L).toString(), (fileobject?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), (allocationsize?.value ?: 0L).toString(), fileattributes.toInt(), shareaccess.toInt(), createdisposition.toInt(), createoptions.toInt(), (eabuffer?.value ?: 0L).toString(), ealength.toInt(), flags.toInt(), (drivercontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCreateMailslotFile(filter: PfltFilter, instance: PfltInstance, filehandle: COpaquePointer?, fileobject: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, createoptions: UInt, mailslotquota: UInt, maximummessagesize: UInt, readtimeout: COpaquePointer?, drivercontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCreateMailslotFile(filter.toString(), instance.toString(), (filehandle?.value ?: 0L).toString(), (fileobject?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), createoptions.toInt(), mailslotquota.toInt(), maximummessagesize.toInt(), (readtimeout?.value ?: 0L).toString(), (drivercontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCreateNamedPipeFile(filter: PfltFilter, instance: PfltInstance, filehandle: COpaquePointer?, fileobject: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, namedpipetype: UInt, readmode: UInt, completionmode: UInt, maximuminstances: UInt, inboundquota: UInt, outboundquota: UInt, defaulttimeout: COpaquePointer?, drivercontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCreateNamedPipeFile(filter.toString(), instance.toString(), (filehandle?.value ?: 0L).toString(), (fileobject?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), shareaccess.toInt(), createdisposition.toInt(), createoptions.toInt(), namedpipetype.toInt(), readmode.toInt(), completionmode.toInt(), maximuminstances.toInt(), inboundquota.toInt(), outboundquota.toInt(), (defaulttimeout?.value ?: 0L).toString(), (drivercontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCreateSectionForDataScan(instance: PfltInstance, fileobject: COpaquePointer?, sectioncontext: PfltContext, desiredaccess: UInt, objectattributes: COpaquePointer?, maximumsize: COpaquePointer?, sectionpageprotection: UInt, allocationattributes: UInt, flags: UInt, sectionhandle: COpaquePointer?, sectionobject: COpaquePointer?, sectionfilesize: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCreateSectionForDataScan(instance.toString(), (fileobject?.value ?: 0L).toString(), (sectioncontext?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), (maximumsize?.value ?: 0L).toString(), sectionpageprotection.toInt(), allocationattributes.toInt(), flags.toInt(), (sectionhandle?.value ?: 0L).toString(), (sectionobject?.value ?: 0L).toString(), (sectionfilesize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCreateSystemVolumeInformationFolder(instance: PfltInstance): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCreateSystemVolumeInformationFolder(instance.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCurrentBatchOplock(oplock: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCurrentBatchOplock((oplock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCurrentOplock(oplock: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCurrentOplock((oplock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCurrentOplockH(oplock: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltCurrentOplockH((oplock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltDecodeParameters(callbackdata: COpaquePointer?, mdladdresspointer: COpaquePointer?, buffer: COpaquePointer?, length: COpaquePointer?, desiredaccess: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltDecodeParameters((callbackdata?.value ?: 0L).toString(), (mdladdresspointer?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (length?.value ?: 0L).toString(), (desiredaccess?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltDeleteContext(context: PfltContext) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltDeleteContext((context?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltDeleteExtraCreateParameterLookasideList(filter: PfltFilter, lookaside: COpaquePointer?, flags: UInt) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltDeleteExtraCreateParameterLookasideList(filter.toString(), (lookaside?.value ?: 0L).toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltDeleteFileContext(instance: PfltInstance, fileobject: COpaquePointer?, oldcontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltDeleteFileContext(instance.toString(), (fileobject?.value ?: 0L).toString(), (oldcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltDeleteInstanceContext(instance: PfltInstance, oldcontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltDeleteInstanceContext(instance.toString(), (oldcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltDeletePushLock(pushlock: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltDeletePushLock((pushlock?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltDeleteStreamContext(instance: PfltInstance, fileobject: COpaquePointer?, oldcontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltDeleteStreamContext(instance.toString(), (fileobject?.value ?: 0L).toString(), (oldcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltDeleteStreamHandleContext(instance: PfltInstance, fileobject: COpaquePointer?, oldcontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltDeleteStreamHandleContext(instance.toString(), (fileobject?.value ?: 0L).toString(), (oldcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltDeleteTransactionContext(instance: PfltInstance, transaction: COpaquePointer?, oldcontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltDeleteTransactionContext(instance.toString(), (transaction?.value ?: 0L).toString(), (oldcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltDeleteVolumeContext(filter: PfltFilter, volume: PfltVolume, oldcontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltDeleteVolumeContext(filter.toString(), volume.toString(), (oldcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltDetachVolume(filter: PfltFilter, volume: PfltVolume, instancename: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltDetachVolume(filter.toString(), volume.toString(), (instancename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltDeviceIoControlFile(instance: PfltInstance, fileobject: COpaquePointer?, iocontrolcode: UInt, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt, lengthreturned: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltDeviceIoControlFile(instance.toString(), (fileobject?.value ?: 0L).toString(), iocontrolcode.toInt(), (inputbuffer?.value ?: 0L).toString(), inputbufferlength.toInt(), (outputbuffer?.value ?: 0L).toString(), outputbufferlength.toInt(), (lengthreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltDoCompletionProcessingWhenSafe(data: COpaquePointer?, fltobjects: COpaquePointer?, completioncontext: COpaquePointer?, flags: UInt, safepostcallback: PfltPostOperationCallback, retpostoperationstatus: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltDoCompletionProcessingWhenSafe((data?.value ?: 0L).toString(), (fltobjects?.value ?: 0L).toString(), (completioncontext?.value ?: 0L).toString(), flags.toInt(), 0L.toString(), (retpostoperationstatus?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltEnlistInTransaction(instance: PfltInstance, transaction: COpaquePointer?, transactioncontext: PfltContext, notificationmask: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltEnlistInTransaction(instance.toString(), (transaction?.value ?: 0L).toString(), (transactioncontext?.value ?: 0L).toString(), notificationmask.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltEnumerateFilterInformation(index: UInt, informationclass: FilterInformationClass, buffer: COpaquePointer?, buffersize: UInt, bytesreturned: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltEnumerateFilterInformation(index.toInt(), informationclass, (buffer?.value ?: 0L).toString(), buffersize.toInt(), (bytesreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltEnumerateFilters(filterlist: COpaquePointer?, filterlistsize: UInt, numberfiltersreturned: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltEnumerateFilters((filterlist?.value ?: 0L).toString(), filterlistsize.toInt(), (numberfiltersreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltEnumerateInstanceInformationByDeviceObject(deviceobject: COpaquePointer?, index: UInt, informationclass: InstanceInformationClass, buffer: COpaquePointer?, buffersize: UInt, bytesreturned: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltEnumerateInstanceInformationByDeviceObject((deviceobject?.value ?: 0L).toString(), index.toInt(), informationclass, (buffer?.value ?: 0L).toString(), buffersize.toInt(), (bytesreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltEnumerateInstanceInformationByFilter(filter: PfltFilter, index: UInt, informationclass: InstanceInformationClass, buffer: COpaquePointer?, buffersize: UInt, bytesreturned: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltEnumerateInstanceInformationByFilter(filter.toString(), index.toInt(), informationclass, (buffer?.value ?: 0L).toString(), buffersize.toInt(), (bytesreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltEnumerateInstanceInformationByVolume(volume: PfltVolume, index: UInt, informationclass: InstanceInformationClass, buffer: COpaquePointer?, buffersize: UInt, bytesreturned: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltEnumerateInstanceInformationByVolume(volume.toString(), index.toInt(), informationclass, (buffer?.value ?: 0L).toString(), buffersize.toInt(), (bytesreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltEnumerateInstanceInformationByVolumeName(volumename: COpaquePointer?, index: UInt, informationclass: InstanceInformationClass, buffer: COpaquePointer?, buffersize: UInt, bytesreturned: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltEnumerateInstanceInformationByVolumeName((volumename?.value ?: 0L).toString(), index.toInt(), informationclass, (buffer?.value ?: 0L).toString(), buffersize.toInt(), (bytesreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltEnumerateInstances(volume: PfltVolume, filter: PfltFilter, instancelist: COpaquePointer?, instancelistsize: UInt, numberinstancesreturned: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltEnumerateInstances(volume.toString(), filter.toString(), (instancelist?.value ?: 0L).toString(), instancelistsize.toInt(), (numberinstancesreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltEnumerateVolumeInformation(filter: PfltFilter, index: UInt, informationclass: FilterVolumeInformationClass, buffer: COpaquePointer?, buffersize: UInt, bytesreturned: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltEnumerateVolumeInformation(filter.toString(), index.toInt(), informationclass, (buffer?.value ?: 0L).toString(), buffersize.toInt(), (bytesreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltEnumerateVolumes(filter: PfltFilter, volumelist: COpaquePointer?, volumelistsize: UInt, numbervolumesreturned: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltEnumerateVolumes(filter.toString(), (volumelist?.value ?: 0L).toString(), volumelistsize.toInt(), (numbervolumesreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltFastIoMdlRead(initiatinginstance: PfltInstance, fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, lockkey: UInt, mdlchain: COpaquePointer?, iostatus: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltFastIoMdlRead(initiatinginstance.toString(), (fileobject?.value ?: 0L).toString(), (fileoffset?.value ?: 0L).toString(), length.toInt(), lockkey.toInt(), (mdlchain?.value ?: 0L).toString(), (iostatus?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltFastIoMdlReadComplete(initiatinginstance: PfltInstance, fileobject: COpaquePointer?, mdlchain: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltFastIoMdlReadComplete(initiatinginstance.toString(), (fileobject?.value ?: 0L).toString(), (mdlchain?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltFastIoMdlWriteComplete(initiatinginstance: PfltInstance, fileobject: COpaquePointer?, fileoffset: COpaquePointer?, mdlchain: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltFastIoMdlWriteComplete(initiatinginstance.toString(), (fileobject?.value ?: 0L).toString(), (fileoffset?.value ?: 0L).toString(), (mdlchain?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltFastIoPrepareMdlWrite(initiatinginstance: PfltInstance, fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, lockkey: UInt, mdlchain: COpaquePointer?, iostatus: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltFastIoPrepareMdlWrite(initiatinginstance.toString(), (fileobject?.value ?: 0L).toString(), (fileoffset?.value ?: 0L).toString(), length.toInt(), lockkey.toInt(), (mdlchain?.value ?: 0L).toString(), (iostatus?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltFindExtraCreateParameter(filter: PfltFilter, ecplist: COpaquePointer?, ecptype: COpaquePointer?, ecpcontext: COpaquePointer?, ecpcontextsize: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltFindExtraCreateParameter(filter.toString(), (ecplist?.value ?: 0L).toString(), (ecptype?.value ?: 0L).toString(), (ecpcontext?.value ?: 0L).toString(), (ecpcontextsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltFlushBuffers(instance: PfltInstance, fileobject: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltFlushBuffers(instance.toString(), (fileobject?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltFlushBuffers2(instance: PfltInstance, fileobject: COpaquePointer?, flushtype: UInt, callbackdata: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltFlushBuffers2(instance.toString(), (fileobject?.value ?: 0L).toString(), flushtype.toInt(), (callbackdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltFreeCallbackData(callbackdata: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltFreeCallbackData((callbackdata?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltFreeDeferredIoWorkItem(fltworkitem: PfltDeferredIoWorkitem) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltFreeDeferredIoWorkItem(fltworkitem.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltFreeExtraCreateParameter(filter: PfltFilter, ecpcontext: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltFreeExtraCreateParameter(filter.toString(), (ecpcontext?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltFreeExtraCreateParameterList(filter: PfltFilter, ecplist: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltFreeExtraCreateParameterList(filter.toString(), (ecplist?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltFreeFileLock(filelock: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltFreeFileLock((filelock?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltFreeGenericWorkItem(fltworkitem: PfltGenericWorkitem) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltFreeGenericWorkItem(fltworkitem.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltFreeOpenReparseList(filter: PfltFilter, ecplist: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltFreeOpenReparseList(filter.toString(), (ecplist?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltFreePoolAlignedWithTag(instance: PfltInstance, buffer: COpaquePointer?, tag: UInt) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltFreePoolAlignedWithTag(instance.toString(), (buffer?.value ?: 0L).toString(), tag.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltFreeSecurityDescriptor(securitydescriptor: PsecurityDescriptor) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltFreeSecurityDescriptor((securitydescriptor?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltFsControlFile(instance: PfltInstance, fileobject: COpaquePointer?, fscontrolcode: UInt, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt, lengthreturned: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltFsControlFile(instance.toString(), (fileobject?.value ?: 0L).toString(), fscontrolcode.toInt(), (inputbuffer?.value ?: 0L).toString(), inputbufferlength.toInt(), (outputbuffer?.value ?: 0L).toString(), outputbufferlength.toInt(), (lengthreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetActivityIdCallbackData(callbackdata: COpaquePointer?, guid: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetActivityIdCallbackData((callbackdata?.value ?: 0L).toString(), (guid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetBottomInstance(volume: PfltVolume, instance: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetBottomInstance(volume.toString(), (instance?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetContexts(fltobjects: COpaquePointer?, desiredcontexts: UShort, contexts: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetContexts((fltobjects?.value ?: 0L).toString(), desiredcontexts.toInt(), (contexts?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltGetContextsEx(fltobjects: COpaquePointer?, desiredcontexts: UShort, contextssize: ULong, contexts: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetContextsEx((fltobjects?.value ?: 0L).toString(), desiredcontexts.toInt(), contextssize.toString(), (contexts?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetDestinationFileNameInformation(instance: PfltInstance, fileobject: COpaquePointer?, rootdirectory: Handle, filename: Pcwstr, filenamelength: UInt, nameoptions: UInt, retfilenameinformation: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetDestinationFileNameInformation(instance.toString(), (fileobject?.value ?: 0L).toString(), (rootdirectory?.value ?: 0L).toString(), (filename?.value ?: 0L).toString(), filenamelength.toInt(), nameoptions.toInt(), (retfilenameinformation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetDeviceObject(volume: PfltVolume, deviceobject: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetDeviceObject(volume.toString(), (deviceobject?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetDiskDeviceObject(volume: PfltVolume, diskdeviceobject: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetDiskDeviceObject(volume.toString(), (diskdeviceobject?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetEcpListFromCallbackData(filter: PfltFilter, callbackdata: COpaquePointer?, ecplist: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetEcpListFromCallbackData(filter.toString(), (callbackdata?.value ?: 0L).toString(), (ecplist?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetFileContext(instance: PfltInstance, fileobject: COpaquePointer?, context: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetFileContext(instance.toString(), (fileobject?.value ?: 0L).toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetFileNameInformation(callbackdata: COpaquePointer?, nameoptions: UInt, filenameinformation: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetFileNameInformation((callbackdata?.value ?: 0L).toString(), nameoptions.toInt(), (filenameinformation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetFileNameInformationUnsafe(fileobject: COpaquePointer?, instance: PfltInstance, nameoptions: UInt, filenameinformation: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetFileNameInformationUnsafe((fileobject?.value ?: 0L).toString(), instance.toString(), nameoptions.toInt(), (filenameinformation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetFileSystemType(fltobject: COpaquePointer?, filesystemtype: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetFileSystemType((fltobject?.value ?: 0L).toString(), (filesystemtype?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetFilterFromInstance(instance: PfltInstance, retfilter: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetFilterFromInstance(instance.toString(), (retfilter?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetFilterFromName(filtername: COpaquePointer?, retfilter: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetFilterFromName((filtername?.value ?: 0L).toString(), (retfilter?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetFilterInformation(filter: PfltFilter, informationclass: FilterInformationClass, buffer: COpaquePointer?, buffersize: UInt, bytesreturned: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetFilterInformation(filter.toString(), informationclass, (buffer?.value ?: 0L).toString(), buffersize.toInt(), (bytesreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetFsZeroingOffset(data: COpaquePointer?, zeroingoffset: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetFsZeroingOffset((data?.value ?: 0L).toString(), (zeroingoffset?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetInstanceContext(instance: PfltInstance, context: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetInstanceContext(instance.toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetInstanceInformation(instance: PfltInstance, informationclass: InstanceInformationClass, buffer: COpaquePointer?, buffersize: UInt, bytesreturned: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetInstanceInformation(instance.toString(), informationclass, (buffer?.value ?: 0L).toString(), buffersize.toInt(), (bytesreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetIoAttributionHandleFromCallbackData(data: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetIoAttributionHandleFromCallbackData((data?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetIoPriorityHint(data: COpaquePointer?): IoPriorityHint =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetIoPriorityHint((data?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetIoPriorityHintFromCallbackData(data: COpaquePointer?): IoPriorityHint =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetIoPriorityHintFromCallbackData((data?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetIoPriorityHintFromFileObject(fileobject: COpaquePointer?): IoPriorityHint =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetIoPriorityHintFromFileObject((fileobject?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetIoPriorityHintFromThread(thread: Pethread): IoPriorityHint =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetIoPriorityHintFromThread(thread.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetIrpName(irpmajorcode: UByte): Pstr =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetIrpName(irpmajorcode.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetLowerInstance(currentinstance: PfltInstance, lowerinstance: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetLowerInstance(currentinstance.toString(), (lowerinstance?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetNewSystemBufferAddress(callbackdata: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetNewSystemBufferAddress((callbackdata?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetNextExtraCreateParameter(filter: PfltFilter, ecplist: COpaquePointer?, currentecpcontext: COpaquePointer?, nextecptype: COpaquePointer?, nextecpcontext: COpaquePointer?, nextecpcontextsize: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetNextExtraCreateParameter(filter.toString(), (ecplist?.value ?: 0L).toString(), (currentecpcontext?.value ?: 0L).toString(), (nextecptype?.value ?: 0L).toString(), (nextecpcontext?.value ?: 0L).toString(), (nextecpcontextsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetRequestorProcess(callbackdata: COpaquePointer?): Peprocess =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetRequestorProcess((callbackdata?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetRequestorProcessId(callbackdata: COpaquePointer?): UInt =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetRequestorProcessId((callbackdata?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetRequestorProcessIdEx(callbackdata: COpaquePointer?): Handle =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetRequestorProcessIdEx((callbackdata?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetRequestorSessionId(callbackdata: COpaquePointer?, sessionid: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetRequestorSessionId((callbackdata?.value ?: 0L).toString(), (sessionid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetRoutineAddress(fltmgrroutinename: Pcstr): COpaquePointer? =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetRoutineAddress((fltmgrroutinename?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetSectionContext(instance: PfltInstance, fileobject: COpaquePointer?, context: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetSectionContext(instance.toString(), (fileobject?.value ?: 0L).toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetStreamContext(instance: PfltInstance, fileobject: COpaquePointer?, context: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetStreamContext(instance.toString(), (fileobject?.value ?: 0L).toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetStreamHandleContext(instance: PfltInstance, fileobject: COpaquePointer?, context: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetStreamHandleContext(instance.toString(), (fileobject?.value ?: 0L).toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetSwappedBufferMdlAddress(callbackdata: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetSwappedBufferMdlAddress((callbackdata?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetTopInstance(volume: PfltVolume, instance: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetTopInstance(volume.toString(), (instance?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetTransactionContext(instance: PfltInstance, transaction: COpaquePointer?, context: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetTransactionContext(instance.toString(), (transaction?.value ?: 0L).toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetTunneledName(callbackdata: COpaquePointer?, filenameinformation: COpaquePointer?, rettunneledfilenameinformation: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetTunneledName((callbackdata?.value ?: 0L).toString(), (filenameinformation?.value ?: 0L).toString(), (rettunneledfilenameinformation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetUpperInstance(currentinstance: PfltInstance, upperinstance: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetUpperInstance(currentinstance.toString(), (upperinstance?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetVolumeContext(filter: PfltFilter, volume: PfltVolume, context: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeContext(filter.toString(), volume.toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetVolumeFromDeviceObject(filter: PfltFilter, deviceobject: COpaquePointer?, retvolume: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeFromDeviceObject(filter.toString(), (deviceobject?.value ?: 0L).toString(), (retvolume?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetVolumeFromFileObject(filter: PfltFilter, fileobject: COpaquePointer?, retvolume: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeFromFileObject(filter.toString(), (fileobject?.value ?: 0L).toString(), (retvolume?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetVolumeFromInstance(instance: PfltInstance, retvolume: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeFromInstance(instance.toString(), (retvolume?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetVolumeFromName(filter: PfltFilter, volumename: COpaquePointer?, retvolume: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeFromName(filter.toString(), (volumename?.value ?: 0L).toString(), (retvolume?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetVolumeGuidName(volume: PfltVolume, volumeguidname: COpaquePointer?, buffersizeneeded: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeGuidName(volume.toString(), (volumeguidname?.value ?: 0L).toString(), (buffersizeneeded?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetVolumeInformation(volume: PfltVolume, informationclass: FilterVolumeInformationClass, buffer: COpaquePointer?, buffersize: UInt, bytesreturned: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeInformation(volume.toString(), informationclass, (buffer?.value ?: 0L).toString(), buffersize.toInt(), (bytesreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetVolumeInstanceFromName(filter: PfltFilter, volume: PfltVolume, instancename: COpaquePointer?, retinstance: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeInstanceFromName(filter.toString(), volume.toString(), (instancename?.value ?: 0L).toString(), (retinstance?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetVolumeName(volume: PfltVolume, volumename: COpaquePointer?, buffersizeneeded: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeName(volume.toString(), (volumename?.value ?: 0L).toString(), (buffersizeneeded?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetVolumeProperties(volume: PfltVolume, volumeproperties: COpaquePointer?, volumepropertieslength: UInt, lengthreturned: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeProperties(volume.toString(), (volumeproperties?.value ?: 0L).toString(), volumepropertieslength.toInt(), (lengthreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltInitExtraCreateParameterLookasideList(filter: PfltFilter, lookaside: COpaquePointer?, flags: UInt, size: ULong, tag: UInt) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltInitExtraCreateParameterLookasideList(filter.toString(), (lookaside?.value ?: 0L).toString(), flags.toInt(), size.toString(), tag.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltInitializeFileLock(filelock: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltInitializeFileLock((filelock?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltInitializeOplock(oplock: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltInitializeOplock((oplock?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltInitializePushLock(pushlock: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltInitializePushLock((pushlock?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltInsertExtraCreateParameter(filter: PfltFilter, ecplist: COpaquePointer?, ecpcontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltInsertExtraCreateParameter(filter.toString(), (ecplist?.value ?: 0L).toString(), (ecpcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltIs32bitProcess(callbackdata: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltIs32bitProcess((callbackdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltIsCallbackDataDirty(data: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltIsCallbackDataDirty((data?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltIsDirectory(fileobject: COpaquePointer?, instance: PfltInstance, isdirectory: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltIsDirectory((fileobject?.value ?: 0L).toString(), instance.toString(), (isdirectory?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltIsEcpAcknowledged(filter: PfltFilter, ecpcontext: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltIsEcpAcknowledged(filter.toString(), (ecpcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltIsEcpFromUserMode(filter: PfltFilter, ecpcontext: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltIsEcpFromUserMode(filter.toString(), (ecpcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltIsFltMgrVolumeDeviceObject(deviceobject: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltIsFltMgrVolumeDeviceObject((deviceobject?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltIsIoCanceled(callbackdata: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltIsIoCanceled((callbackdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltIsIoRedirectionAllowed(sourceinstance: PfltInstance, targetinstance: PfltInstance, redirectionallowed: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltIsIoRedirectionAllowed(sourceinstance.toString(), targetinstance.toString(), (redirectionallowed?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltIsIoRedirectionAllowedForOperation(data: COpaquePointer?, targetinstance: PfltInstance, redirectionallowedthisio: COpaquePointer?, redirectionallowedallio: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltIsIoRedirectionAllowedForOperation((data?.value ?: 0L).toString(), targetinstance.toString(), (redirectionallowedthisio?.value ?: 0L).toString(), (redirectionallowedallio?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltIsOperationSynchronous(callbackdata: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltIsOperationSynchronous((callbackdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltIsVolumeSnapshot(fltobject: COpaquePointer?, issnapshotvolume: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltIsVolumeSnapshot((fltobject?.value ?: 0L).toString(), (issnapshotvolume?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltIsVolumeWritable(fltobject: COpaquePointer?, iswritable: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltIsVolumeWritable((fltobject?.value ?: 0L).toString(), (iswritable?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltLoadFilter(filtername: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltLoadFilter((filtername?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltLockUserBuffer(callbackdata: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltLockUserBuffer((callbackdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltNotifyFilterChangeDirectory(notifysync: PnotifySync, notifylist: COpaquePointer?, fscontext: COpaquePointer?, fulldirectoryname: COpaquePointer?, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifycallbackdata: COpaquePointer?, traversecallback: PcheckForTraverseAccess, subjectcontext: COpaquePointer?, filtercallback: PfilterReportChange): Unit =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltObjectDereference(fltobject: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltObjectDereference((fltobject?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltObjectReference(fltobject: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltObjectReference((fltobject?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltOpenVolume(instance: PfltInstance, volumehandle: COpaquePointer?, volumefileobject: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltOpenVolume(instance.toString(), (volumehandle?.value ?: 0L).toString(), (volumefileobject?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltOplockBreakH(oplock: COpaquePointer?, callbackdata: COpaquePointer?, flags: UInt, context: COpaquePointer?, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltOplockBreakH((oplock?.value ?: 0L).toString(), (callbackdata?.value ?: 0L).toString(), flags.toInt(), (context?.value ?: 0L).toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltOplockBreakToNone(oplock: COpaquePointer?, callbackdata: COpaquePointer?, context: COpaquePointer?, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltOplockBreakToNone((oplock?.value ?: 0L).toString(), (callbackdata?.value ?: 0L).toString(), (context?.value ?: 0L).toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltOplockBreakToNoneEx(oplock: COpaquePointer?, callbackdata: COpaquePointer?, flags: UInt, context: COpaquePointer?, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltOplockBreakToNoneEx((oplock?.value ?: 0L).toString(), (callbackdata?.value ?: 0L).toString(), flags.toInt(), (context?.value ?: 0L).toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltOplockFsctrl(oplock: COpaquePointer?, callbackdata: COpaquePointer?, opencount: UInt): FltPreopCallbackStatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltOplockFsctrl((oplock?.value ?: 0L).toString(), (callbackdata?.value ?: 0L).toString(), opencount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltOplockFsctrlEx(oplock: COpaquePointer?, callbackdata: COpaquePointer?, opencount: UInt, flags: UInt): FltPreopCallbackStatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltOplockFsctrlEx((oplock?.value ?: 0L).toString(), (callbackdata?.value ?: 0L).toString(), opencount.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltOplockIsFastIoPossible(oplock: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltOplockIsFastIoPossible((oplock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltOplockIsSharedRequest(callbackdata: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltOplockIsSharedRequest((callbackdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltOplockKeysEqual(fo1: COpaquePointer?, fo2: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltOplockKeysEqual((fo1?.value ?: 0L).toString(), (fo2?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltParseFileName(filename: COpaquePointer?, extension: COpaquePointer?, stream: COpaquePointer?, finalcomponent: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltParseFileName((filename?.value ?: 0L).toString(), (extension?.value ?: 0L).toString(), (stream?.value ?: 0L).toString(), (finalcomponent?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltParseFileNameInformation(filenameinformation: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltParseFileNameInformation((filenameinformation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltPerformAsynchronousIo(callbackdata: COpaquePointer?, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltPerformAsynchronousIo((callbackdata?.value ?: 0L).toString(), 0L.toString(), (callbackcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltPerformSynchronousIo(callbackdata: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltPerformSynchronousIo((callbackdata?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltPrePrepareComplete(instance: PfltInstance, transaction: COpaquePointer?, transactioncontext: PfltContext): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltPrePrepareComplete(instance.toString(), (transaction?.value ?: 0L).toString(), (transactioncontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltPrepareComplete(instance: PfltInstance, transaction: COpaquePointer?, transactioncontext: PfltContext): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltPrepareComplete(instance.toString(), (transaction?.value ?: 0L).toString(), (transactioncontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltPrepareToReuseEcp(filter: PfltFilter, ecpcontext: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltPrepareToReuseEcp(filter.toString(), (ecpcontext?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltProcessFileLock(filelock: COpaquePointer?, callbackdata: COpaquePointer?, context: COpaquePointer?): FltPreopCallbackStatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltProcessFileLock((filelock?.value ?: 0L).toString(), (callbackdata?.value ?: 0L).toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltPropagateActivityIdToThread(callbackdata: COpaquePointer?, propagateid: COpaquePointer?, originalid: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltPropagateActivityIdToThread((callbackdata?.value ?: 0L).toString(), (propagateid?.value ?: 0L).toString(), (originalid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltPropagateIrpExtension(sourcedata: COpaquePointer?, targetdata: COpaquePointer?, flags: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltPropagateIrpExtension((sourcedata?.value ?: 0L).toString(), (targetdata?.value ?: 0L).toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltPurgeFileNameInformationCache(instance: PfltInstance, fileobject: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltPurgeFileNameInformationCache(instance.toString(), (fileobject?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltQueryDirectoryFile(instance: PfltInstance, fileobject: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass, returnsingleentry: Boolean, filename: COpaquePointer?, restartscan: Boolean, lengthreturned: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltQueryDirectoryFile(instance.toString(), (fileobject?.value ?: 0L).toString(), (fileinformation?.value ?: 0L).toString(), length.toInt(), fileinformationclass, returnsingleentry, (filename?.value ?: 0L).toString(), restartscan, (lengthreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltQueryDirectoryFileEx(instance: PfltInstance, fileobject: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass, queryflags: UInt, filename: COpaquePointer?, lengthreturned: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltQueryDirectoryFileEx(instance.toString(), (fileobject?.value ?: 0L).toString(), (fileinformation?.value ?: 0L).toString(), length.toInt(), fileinformationclass, queryflags.toInt(), (filename?.value ?: 0L).toString(), (lengthreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltQueryEaFile(instance: PfltInstance, fileobject: COpaquePointer?, returnedeadata: COpaquePointer?, length: UInt, returnsingleentry: Boolean, ealist: COpaquePointer?, ealistlength: UInt, eaindex: COpaquePointer?, restartscan: Boolean, lengthreturned: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltQueryEaFile(instance.toString(), (fileobject?.value ?: 0L).toString(), (returnedeadata?.value ?: 0L).toString(), length.toInt(), returnsingleentry, (ealist?.value ?: 0L).toString(), ealistlength.toInt(), (eaindex?.value ?: 0L).toString(), restartscan, (lengthreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltQueryInformationByName(filter: PfltFilter, instance: PfltInstance, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass, drivercontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltQueryInformationByName(filter.toString(), instance.toString(), (objectattributes?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), (fileinformation?.value ?: 0L).toString(), length.toInt(), fileinformationclass, (drivercontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltQueryInformationFile(instance: PfltInstance, fileobject: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass, lengthreturned: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltQueryInformationFile(instance.toString(), (fileobject?.value ?: 0L).toString(), (fileinformation?.value ?: 0L).toString(), length.toInt(), fileinformationclass, (lengthreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltQueryQuotaInformationFile(instance: PfltInstance, fileobject: COpaquePointer?, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt, returnsingleentry: Boolean, sidlist: COpaquePointer?, sidlistlength: UInt, startsid: COpaquePointer?, restartscan: Boolean, lengthreturned: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltQueryQuotaInformationFile(instance.toString(), (fileobject?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), length.toInt(), returnsingleentry, (sidlist?.value ?: 0L).toString(), sidlistlength.toInt(), (startsid?.value ?: 0L).toString(), restartscan, (lengthreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltQuerySecurityObject(instance: PfltInstance, fileobject: COpaquePointer?, securityinformation: UInt, securitydescriptor: PsecurityDescriptor, length: UInt, lengthneeded: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltQuerySecurityObject(instance.toString(), (fileobject?.value ?: 0L).toString(), securityinformation.toInt(), (securitydescriptor?.value ?: 0L).toString(), length.toInt(), (lengthneeded?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltQueryVolumeInformation(instance: PfltInstance, iosb: COpaquePointer?, fsinformation: COpaquePointer?, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltQueryVolumeInformation(instance.toString(), (iosb?.value ?: 0L).toString(), (fsinformation?.value ?: 0L).toString(), length.toInt(), fsinformationclass) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltQueryVolumeInformationFile(instance: PfltInstance, fileobject: COpaquePointer?, fsinformation: COpaquePointer?, length: UInt, fsinformationclass: FsInformationClass, lengthreturned: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltQueryVolumeInformationFile(instance.toString(), (fileobject?.value ?: 0L).toString(), (fsinformation?.value ?: 0L).toString(), length.toInt(), fsinformationclass, (lengthreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltQueueDeferredIoWorkItem(fltworkitem: PfltDeferredIoWorkitem, data: COpaquePointer?, workerroutine: PfltDeferredIoWorkitemRoutine, queuetype: WorkQueueType, context: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltQueueDeferredIoWorkItem(fltworkitem.toString(), (data?.value ?: 0L).toString(), 0L.toString(), queuetype, (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltQueueGenericWorkItem(fltworkitem: PfltGenericWorkitem, fltobject: COpaquePointer?, workerroutine: PfltGenericWorkitemRoutine, queuetype: WorkQueueType, context: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltQueueGenericWorkItem(fltworkitem.toString(), (fltobject?.value ?: 0L).toString(), 0L.toString(), queuetype, (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltReadFile(initiatinginstance: PfltInstance, fileobject: COpaquePointer?, byteoffset: COpaquePointer?, length: UInt, buffer: COpaquePointer?, flags: UInt, bytesread: COpaquePointer?, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltReadFile(initiatinginstance.toString(), (fileobject?.value ?: 0L).toString(), (byteoffset?.value ?: 0L).toString(), length.toInt(), (buffer?.value ?: 0L).toString(), flags.toInt(), (bytesread?.value ?: 0L).toString(), 0L.toString(), (callbackcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltReadFileEx(initiatinginstance: PfltInstance, fileobject: COpaquePointer?, byteoffset: COpaquePointer?, length: UInt, buffer: COpaquePointer?, flags: UInt, bytesread: COpaquePointer?, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: COpaquePointer?, key: COpaquePointer?, mdl: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltReadFileEx(initiatinginstance.toString(), (fileobject?.value ?: 0L).toString(), (byteoffset?.value ?: 0L).toString(), length.toInt(), (buffer?.value ?: 0L).toString(), flags.toInt(), (bytesread?.value ?: 0L).toString(), 0L.toString(), (callbackcontext?.value ?: 0L).toString(), (key?.value ?: 0L).toString(), (mdl?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltReferenceContext(context: PfltContext) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltReferenceContext((context?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltReferenceFileNameInformation(filenameinformation: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltReferenceFileNameInformation((filenameinformation?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltRegisterFilter(driver: COpaquePointer?, registration: COpaquePointer?, retfilter: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltRegisterFilter((driver?.value ?: 0L).toString(), (registration?.value ?: 0L).toString(), (retfilter?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltRegisterForDataScan(instance: PfltInstance): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltRegisterForDataScan(instance.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltReissueSynchronousIo(initiatinginstance: PfltInstance, callbackdata: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltReissueSynchronousIo(initiatinginstance.toString(), (callbackdata?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltReleaseContext(context: PfltContext) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltReleaseContext((context?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltReleaseContexts(contexts: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltReleaseContexts((contexts?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltReleaseContextsEx(contextssize: ULong, contexts: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltReleaseContextsEx(contextssize.toString(), (contexts?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltReleaseFileNameInformation(filenameinformation: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltReleaseFileNameInformation((filenameinformation?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltReleasePushLock(pushlock: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltReleasePushLock((pushlock?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltReleasePushLockEx(pushlock: COpaquePointer?, flags: UInt) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltReleasePushLockEx((pushlock?.value ?: 0L).toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltReleaseResource(resource: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltReleaseResource((resource?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltRemoveExtraCreateParameter(filter: PfltFilter, ecplist: COpaquePointer?, ecptype: COpaquePointer?, ecpcontext: COpaquePointer?, ecpcontextsize: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltRemoveExtraCreateParameter(filter.toString(), (ecplist?.value ?: 0L).toString(), (ecptype?.value ?: 0L).toString(), (ecpcontext?.value ?: 0L).toString(), (ecpcontextsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltRemoveOpenReparseEntry(filter: PfltFilter, data: COpaquePointer?, openreparseentry: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltRemoveOpenReparseEntry(filter.toString(), (data?.value ?: 0L).toString(), (openreparseentry?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltRequestFileInfoOnCreateCompletion(filter: PfltFilter, data: COpaquePointer?, infoclassflags: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltRequestFileInfoOnCreateCompletion(filter.toString(), (data?.value ?: 0L).toString(), infoclassflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltRequestOperationStatusCallback(data: COpaquePointer?, callbackroutine: PfltGetOperationStatusCallback, requestercontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltRequestOperationStatusCallback((data?.value ?: 0L).toString(), 0L.toString(), (requestercontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltRetainSwappedBufferMdlAddress(callbackdata: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltRetainSwappedBufferMdlAddress((callbackdata?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltRetrieveFileInfoOnCreateCompletion(filter: PfltFilter, data: COpaquePointer?, infoclass: UInt, size: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltRetrieveFileInfoOnCreateCompletion(filter.toString(), (data?.value ?: 0L).toString(), infoclass.toInt(), (size?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltRetrieveFileInfoOnCreateCompletionEx(filter: PfltFilter, data: COpaquePointer?, infoclass: UInt, retinfosize: COpaquePointer?, retinfobuffer: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltRetrieveFileInfoOnCreateCompletionEx(filter.toString(), (data?.value ?: 0L).toString(), infoclass.toInt(), (retinfosize?.value ?: 0L).toString(), (retinfobuffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltRetrieveIoPriorityInfo(data: COpaquePointer?, fileobject: COpaquePointer?, thread: Pethread, priorityinfo: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltRetrieveIoPriorityInfo((data?.value ?: 0L).toString(), (fileobject?.value ?: 0L).toString(), thread.toString(), (priorityinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltReuseCallbackData(callbackdata: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltReuseCallbackData((callbackdata?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltRollbackComplete(instance: PfltInstance, transaction: COpaquePointer?, transactioncontext: PfltContext): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltRollbackComplete(instance.toString(), (transaction?.value ?: 0L).toString(), (transactioncontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltRollbackEnlistment(instance: PfltInstance, transaction: COpaquePointer?, transactioncontext: PfltContext): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltRollbackEnlistment(instance.toString(), (transaction?.value ?: 0L).toString(), (transactioncontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSendMessage(filter: PfltFilter, clientport: COpaquePointer?, senderbuffer: COpaquePointer?, senderbufferlength: UInt, replybuffer: COpaquePointer?, replylength: COpaquePointer?, timeout: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSendMessage(filter.toString(), (clientport?.value ?: 0L).toString(), (senderbuffer?.value ?: 0L).toString(), senderbufferlength.toInt(), (replybuffer?.value ?: 0L).toString(), (replylength?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetActivityIdCallbackData(callbackdata: COpaquePointer?, guid: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSetActivityIdCallbackData((callbackdata?.value ?: 0L).toString(), (guid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetCallbackDataDirty(data: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSetCallbackDataDirty((data?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltSetCancelCompletion(callbackdata: COpaquePointer?, canceledcallback: PfltCompleteCanceledCallback): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSetCancelCompletion((callbackdata?.value ?: 0L).toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetEaFile(instance: PfltInstance, fileobject: COpaquePointer?, eabuffer: COpaquePointer?, length: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSetEaFile(instance.toString(), (fileobject?.value ?: 0L).toString(), (eabuffer?.value ?: 0L).toString(), length.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetEcpListIntoCallbackData(filter: PfltFilter, callbackdata: COpaquePointer?, ecplist: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSetEcpListIntoCallbackData(filter.toString(), (callbackdata?.value ?: 0L).toString(), (ecplist?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetFileContext(instance: PfltInstance, fileobject: COpaquePointer?, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSetFileContext(instance.toString(), (fileobject?.value ?: 0L).toString(), operation, (newcontext?.value ?: 0L).toString(), (oldcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetFsZeroingOffset(data: COpaquePointer?, zeroingoffset: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSetFsZeroingOffset((data?.value ?: 0L).toString(), zeroingoffset.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetFsZeroingOffsetRequired(data: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSetFsZeroingOffsetRequired((data?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetInformationFile(instance: PfltInstance, fileobject: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSetInformationFile(instance.toString(), (fileobject?.value ?: 0L).toString(), (fileinformation?.value ?: 0L).toString(), length.toInt(), fileinformationclass) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetInstanceContext(instance: PfltInstance, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSetInstanceContext(instance.toString(), operation, (newcontext?.value ?: 0L).toString(), (oldcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetIoPriorityHintIntoCallbackData(data: COpaquePointer?, priorityhint: IoPriorityHint): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSetIoPriorityHintIntoCallbackData((data?.value ?: 0L).toString(), priorityhint) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetIoPriorityHintIntoFileObject(fileobject: COpaquePointer?, priorityhint: IoPriorityHint): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSetIoPriorityHintIntoFileObject((fileobject?.value ?: 0L).toString(), priorityhint) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetIoPriorityHintIntoThread(thread: Pethread, priorityhint: IoPriorityHint): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSetIoPriorityHintIntoThread(thread.toString(), priorityhint) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetQuotaInformationFile(instance: PfltInstance, fileobject: COpaquePointer?, buffer: COpaquePointer?, length: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSetQuotaInformationFile(instance.toString(), (fileobject?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), length.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetSecurityObject(instance: PfltInstance, fileobject: COpaquePointer?, securityinformation: UInt, securitydescriptor: PsecurityDescriptor): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSetSecurityObject(instance.toString(), (fileobject?.value ?: 0L).toString(), securityinformation.toInt(), (securitydescriptor?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetStreamContext(instance: PfltInstance, fileobject: COpaquePointer?, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSetStreamContext(instance.toString(), (fileobject?.value ?: 0L).toString(), operation, (newcontext?.value ?: 0L).toString(), (oldcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetStreamHandleContext(instance: PfltInstance, fileobject: COpaquePointer?, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSetStreamHandleContext(instance.toString(), (fileobject?.value ?: 0L).toString(), operation, (newcontext?.value ?: 0L).toString(), (oldcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetTransactionContext(instance: PfltInstance, transaction: COpaquePointer?, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSetTransactionContext(instance.toString(), (transaction?.value ?: 0L).toString(), operation, (newcontext?.value ?: 0L).toString(), (oldcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetVolumeContext(volume: PfltVolume, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSetVolumeContext(volume.toString(), operation, (newcontext?.value ?: 0L).toString(), (oldcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetVolumeInformation(instance: PfltInstance, iosb: COpaquePointer?, fsinformation: COpaquePointer?, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSetVolumeInformation(instance.toString(), (iosb?.value ?: 0L).toString(), (fsinformation?.value ?: 0L).toString(), length.toInt(), fsinformationclass) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltStartFiltering(filter: PfltFilter): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltStartFiltering(filter.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSupportsFileContexts(fileobject: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSupportsFileContexts((fileobject?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSupportsFileContextsEx(fileobject: COpaquePointer?, instance: PfltInstance): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSupportsFileContextsEx((fileobject?.value ?: 0L).toString(), instance.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSupportsStreamContexts(fileobject: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSupportsStreamContexts((fileobject?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSupportsStreamHandleContexts(fileobject: COpaquePointer?): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltSupportsStreamHandleContexts((fileobject?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltTagFile(initiatinginstance: PfltInstance, fileobject: COpaquePointer?, filetag: UInt, guid: COpaquePointer?, databuffer: COpaquePointer?, databufferlength: UShort): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltTagFile(initiatinginstance.toString(), (fileobject?.value ?: 0L).toString(), filetag.toInt(), (guid?.value ?: 0L).toString(), (databuffer?.value ?: 0L).toString(), databufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltTagFileEx(initiatinginstance: PfltInstance, fileobject: COpaquePointer?, filetag: UInt, guid: COpaquePointer?, databuffer: COpaquePointer?, databufferlength: UShort, existingfiletag: UInt, existingguid: COpaquePointer?, flags: UInt): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltTagFileEx(initiatinginstance.toString(), (fileobject?.value ?: 0L).toString(), filetag.toInt(), (guid?.value ?: 0L).toString(), (databuffer?.value ?: 0L).toString(), databufferlength.toInt(), existingfiletag.toInt(), (existingguid?.value ?: 0L).toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltUninitializeFileLock(filelock: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltUninitializeFileLock((filelock?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltUninitializeOplock(oplock: COpaquePointer?) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltUninitializeOplock((oplock?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltUnloadFilter(filtername: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltUnloadFilter((filtername?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltUnregisterFilter(filter: PfltFilter) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltUnregisterFilter(filter.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltUntagFile(initiatinginstance: PfltInstance, fileobject: COpaquePointer?, filetag: UInt, guid: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltUntagFile(initiatinginstance.toString(), (fileobject?.value ?: 0L).toString(), filetag.toInt(), (guid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltVetoBypassIo(callbackdata: COpaquePointer?, fltobjects: COpaquePointer?, operationstatus: Ntstatus, failurereason: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltVetoBypassIo((callbackdata?.value ?: 0L).toString(), (fltobjects?.value ?: 0L).toString(), operationstatus, (failurereason?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltWriteFile(initiatinginstance: PfltInstance, fileobject: COpaquePointer?, byteoffset: COpaquePointer?, length: UInt, buffer: COpaquePointer?, flags: UInt, byteswritten: COpaquePointer?, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltWriteFile(initiatinginstance.toString(), (fileobject?.value ?: 0L).toString(), (byteoffset?.value ?: 0L).toString(), length.toInt(), (buffer?.value ?: 0L).toString(), flags.toInt(), (byteswritten?.value ?: 0L).toString(), 0L.toString(), (callbackcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltWriteFileEx(initiatinginstance: PfltInstance, fileobject: COpaquePointer?, byteoffset: COpaquePointer?, length: UInt, buffer: COpaquePointer?, flags: UInt, byteswritten: COpaquePointer?, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: COpaquePointer?, key: COpaquePointer?, mdl: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltWriteFileEx(initiatinginstance.toString(), (fileobject?.value ?: 0L).toString(), (byteoffset?.value ?: 0L).toString(), length.toInt(), (buffer?.value ?: 0L).toString(), flags.toInt(), (byteswritten?.value ?: 0L).toString(), 0L.toString(), (callbackcontext?.value ?: 0L).toString(), (key?.value ?: 0L).toString(), (mdl?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltpTraceRedirectedFileIo(originatingfileobject: COpaquePointer?, childcallbackdata: COpaquePointer?): Ntstatus =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAvailable) _wasm_windowssys_windows_wdk_storage_filesystem_minifilters_fltpTraceRedirectedFileIo((originatingfileobject?.value ?: 0L).toString(), (childcallbackdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
