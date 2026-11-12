@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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
private external fun initWindowsWdkStorageFilesystemMinifiltersNapiAddon(): Boolean

private val windowsWdkStorageFilesystemMinifiltersNapiAvailable: Boolean = initWindowsWdkStorageFilesystemMinifiltersNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltAcknowledgeEcp(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltAcknowledgeEcp(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockExclusive(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockExclusive(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockExclusiveEx(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockExclusiveEx(p0: String, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockShared(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockShared(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockSharedEx(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockSharedEx(p0: String, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquireResourceExclusive(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltAcquireResourceExclusive(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquireResourceShared(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltAcquireResourceShared(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltAddOpenReparseEntry(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltAddOpenReparseEntry(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltAdjustDeviceStackSizeForIoRedirection(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltAdjustDeviceStackSizeForIoRedirection(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateCallbackData(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateCallbackData(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateCallbackDataEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateCallbackDataEx(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateContext(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateContext(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateDeferredIoWorkItem()")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateDeferredIoWorkItem(): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateExtraCreateParameter(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateExtraCreateParameter(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateExtraCreateParameterFromLookasideList(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateExtraCreateParameterFromLookasideList(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateExtraCreateParameterList(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateExtraCreateParameterList(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateFileLock(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateFileLock(p0: String, p1: String): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateGenericWorkItem()")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateGenericWorkItem(): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocatePoolAlignedWithTag(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltAllocatePoolAlignedWithTag(p0: String, p1: Int, p2: String, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltApplyPriorityInfoThread(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltApplyPriorityInfoThread(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltAttachVolume(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltAttachVolume(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltAttachVolumeAtAltitude(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltAttachVolumeAtAltitude(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltBuildDefaultSecurityDescriptor(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltBuildDefaultSecurityDescriptor(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltCancelFileOpen(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCancelFileOpen(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltCancelIo(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCancelIo(p0: String): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltCancellableWaitForMultipleObjects(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCancellableWaitForMultipleObjects(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltCancellableWaitForSingleObject(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCancellableWaitForSingleObject(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqDisable(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqDisable(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqEnable(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqEnable(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqInitialize(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqInitialize(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqInsertIo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqInsertIo(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqRemoveIo(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqRemoveIo(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqRemoveNextIo(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqRemoveNextIo(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckAndGrowNameControl(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCheckAndGrowNameControl(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckLockForReadAccess(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCheckLockForReadAccess(p0: String, p1: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckLockForWriteAccess(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCheckLockForWriteAccess(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckOplock(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCheckOplock(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckOplockEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCheckOplockEx(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltClearCallbackDataDirty(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltClearCallbackDataDirty(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltClearCancelCompletion(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltClearCancelCompletion(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltClose(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltClose(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltCloseClientPort(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCloseClientPort(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltCloseCommunicationPort(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCloseCommunicationPort(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltCloseSectionForDataScan(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCloseSectionForDataScan(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltCommitComplete(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCommitComplete(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltCommitFinalizeComplete(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCommitFinalizeComplete(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltCompareInstanceAltitudes(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCompareInstanceAltitudes(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltCompletePendedPostOperation(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCompletePendedPostOperation(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltCompletePendedPreOperation(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCompletePendedPreOperation(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltCopyOpenReparseList(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCopyOpenReparseList(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateCommunicationPort(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCreateCommunicationPort(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateFile(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCreateFile(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: Int, p8: Int, p9: Int, p10: Int, p11: String, p12: Int, p13: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateFileEx(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCreateFileEx(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String, p8: Int, p9: Int, p10: Int, p11: Int, p12: String, p13: Int, p14: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateFileEx2(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCreateFileEx2(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String, p8: Int, p9: Int, p10: Int, p11: Int, p12: String, p13: Int, p14: Int, p15: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateMailslotFile(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCreateMailslotFile(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: Int, p8: Int, p9: Int, p10: String, p11: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateNamedPipeFile(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCreateNamedPipeFile(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: Int, p8: Int, p9: Int, p10: Int, p11: Int, p12: Int, p13: Int, p14: Int, p15: Int, p16: String, p17: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateSectionForDataScan(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCreateSectionForDataScan(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: Int, p7: Int, p8: Int, p9: String, p10: String, p11: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateSystemVolumeInformationFolder(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCreateSystemVolumeInformationFolder(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltCurrentBatchOplock(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCurrentBatchOplock(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltCurrentOplock(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCurrentOplock(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltCurrentOplockH(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCurrentOplockH(p0: String): Boolean

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltDecodeParameters(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltDecodeParameters(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteContext(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteContext(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteExtraCreateParameterLookasideList(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteExtraCreateParameterLookasideList(p0: String, p1: String, p2: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteFileContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteFileContext(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteInstanceContext(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteInstanceContext(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltDeletePushLock(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltDeletePushLock(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteStreamContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteStreamContext(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteStreamHandleContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteStreamHandleContext(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteTransactionContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteTransactionContext(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteVolumeContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteVolumeContext(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltDetachVolume(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltDetachVolume(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltDeviceIoControlFile(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltDeviceIoControlFile(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltDoCompletionProcessingWhenSafe(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltDoCompletionProcessingWhenSafe(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltEnlistInTransaction(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltEnlistInTransaction(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateFilterInformation(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateFilterInformation(p0: Int, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateFilters(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateFilters(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByDeviceObject(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByDeviceObject(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByFilter(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByFilter(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByVolume(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByVolume(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByVolumeName(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByVolumeName(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstances(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstances(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateVolumeInformation(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateVolumeInformation(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateVolumes(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateVolumes(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoMdlRead(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoMdlRead(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoMdlReadComplete(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoMdlReadComplete(p0: String, p1: String, p2: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoMdlWriteComplete(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoMdlWriteComplete(p0: String, p1: String, p2: String, p3: String): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoPrepareMdlWrite(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoPrepareMdlWrite(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: String): Boolean

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltFindExtraCreateParameter(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltFindExtraCreateParameter(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltFlushBuffers(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltFlushBuffers(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltFlushBuffers2(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltFlushBuffers2(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeCallbackData(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltFreeCallbackData(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeDeferredIoWorkItem(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltFreeDeferredIoWorkItem(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeExtraCreateParameter(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltFreeExtraCreateParameter(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeExtraCreateParameterList(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltFreeExtraCreateParameterList(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeFileLock(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltFreeFileLock(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeGenericWorkItem(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltFreeGenericWorkItem(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeOpenReparseList(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltFreeOpenReparseList(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltFreePoolAlignedWithTag(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltFreePoolAlignedWithTag(p0: String, p1: String, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeSecurityDescriptor(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltFreeSecurityDescriptor(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltFsControlFile(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltFsControlFile(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetActivityIdCallbackData(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetActivityIdCallbackData(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetBottomInstance(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetBottomInstance(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetContexts(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetContexts(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetContextsEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetContextsEx(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetDestinationFileNameInformation(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetDestinationFileNameInformation(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetDeviceObject(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetDeviceObject(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetDiskDeviceObject(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetDiskDeviceObject(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetEcpListFromCallbackData(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetEcpListFromCallbackData(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileContext(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileNameInformation(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileNameInformation(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileNameInformationUnsafe(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileNameInformationUnsafe(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileSystemType(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileSystemType(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFilterFromInstance(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetFilterFromInstance(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFilterFromName(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetFilterFromName(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFilterInformation(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetFilterInformation(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFsZeroingOffset(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetFsZeroingOffset(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetInstanceContext(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetInstanceContext(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetInstanceInformation(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetInstanceInformation(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoAttributionHandleFromCallbackData(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoAttributionHandleFromCallbackData(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHint(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHint(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHintFromCallbackData(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHintFromCallbackData(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHintFromFileObject(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHintFromFileObject(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHintFromThread(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHintFromThread(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIrpName(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetIrpName(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetLowerInstance(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetLowerInstance(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetNewSystemBufferAddress(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetNewSystemBufferAddress(p0: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetNextExtraCreateParameter(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetNextExtraCreateParameter(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorProcess(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorProcess(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorProcessId(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorProcessId(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorProcessIdEx(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorProcessIdEx(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorSessionId(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorSessionId(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRoutineAddress(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetRoutineAddress(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetSectionContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetSectionContext(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetStreamContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetStreamContext(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetStreamHandleContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetStreamHandleContext(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetSwappedBufferMdlAddress(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetSwappedBufferMdlAddress(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetTopInstance(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetTopInstance(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetTransactionContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetTransactionContext(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetTunneledName(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetTunneledName(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetUpperInstance(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetUpperInstance(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeContext(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromDeviceObject(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromDeviceObject(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromFileObject(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromFileObject(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromInstance(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromInstance(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromName(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromName(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeGuidName(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeGuidName(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeInformation(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeInformation(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeInstanceFromName(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeInstanceFromName(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeName(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeName(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeProperties(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeProperties(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltInitExtraCreateParameterLookasideList(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltInitExtraCreateParameterLookasideList(p0: String, p1: String, p2: Int, p3: String, p4: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltInitializeFileLock(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltInitializeFileLock(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltInitializeOplock(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltInitializeOplock(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltInitializePushLock(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltInitializePushLock(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltInsertExtraCreateParameter(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltInsertExtraCreateParameter(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltIs32bitProcess(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltIs32bitProcess(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltIsCallbackDataDirty(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltIsCallbackDataDirty(p0: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltIsDirectory(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltIsDirectory(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltIsEcpAcknowledged(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltIsEcpAcknowledged(p0: String, p1: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltIsEcpFromUserMode(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltIsEcpFromUserMode(p0: String, p1: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltIsFltMgrVolumeDeviceObject(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltIsFltMgrVolumeDeviceObject(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltIsIoCanceled(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltIsIoCanceled(p0: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltIsIoRedirectionAllowed(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltIsIoRedirectionAllowed(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltIsIoRedirectionAllowedForOperation(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltIsIoRedirectionAllowedForOperation(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltIsOperationSynchronous(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltIsOperationSynchronous(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltIsVolumeSnapshot(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltIsVolumeSnapshot(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltIsVolumeWritable(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltIsVolumeWritable(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltLoadFilter(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltLoadFilter(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltLockUserBuffer(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltLockUserBuffer(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltObjectDereference(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltObjectDereference(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltObjectReference(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltObjectReference(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltOpenVolume(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltOpenVolume(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockBreakH(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltOplockBreakH(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockBreakToNone(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltOplockBreakToNone(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockBreakToNoneEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltOplockBreakToNoneEx(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockFsctrl(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltOplockFsctrl(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockFsctrlEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltOplockFsctrlEx(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockIsFastIoPossible(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltOplockIsFastIoPossible(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockIsSharedRequest(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltOplockIsSharedRequest(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockKeysEqual(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltOplockKeysEqual(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltParseFileName(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltParseFileName(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltParseFileNameInformation(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltParseFileNameInformation(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltPerformAsynchronousIo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltPerformAsynchronousIo(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltPerformSynchronousIo(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltPerformSynchronousIo(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltPrePrepareComplete(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltPrePrepareComplete(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltPrepareComplete(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltPrepareComplete(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltPrepareToReuseEcp(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltPrepareToReuseEcp(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltProcessFileLock(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltProcessFileLock(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltPropagateActivityIdToThread(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltPropagateActivityIdToThread(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltPropagateIrpExtension(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltPropagateIrpExtension(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltPurgeFileNameInformationCache(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltPurgeFileNameInformationCache(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryDirectoryFile(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltQueryDirectoryFile(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Boolean, p6: String, p7: Boolean, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryDirectoryFileEx(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltQueryDirectoryFileEx(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryEaFile(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltQueryEaFile(p0: String, p1: String, p2: String, p3: Int, p4: Boolean, p5: String, p6: Int, p7: String, p8: Boolean, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryInformationByName(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltQueryInformationByName(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryInformationFile(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltQueryInformationFile(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryQuotaInformationFile(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltQueryQuotaInformationFile(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Boolean, p6: String, p7: Int, p8: String, p9: Boolean, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltQuerySecurityObject(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltQuerySecurityObject(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryVolumeInformation(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltQueryVolumeInformation(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryVolumeInformationFile(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltQueryVolumeInformationFile(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltQueueDeferredIoWorkItem(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltQueueDeferredIoWorkItem(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltQueueGenericWorkItem(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltQueueGenericWorkItem(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltReadFile(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltReadFile(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltReadFileEx(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltReadFileEx(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: String, p9: String, p10: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltReferenceContext(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltReferenceContext(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltReferenceFileNameInformation(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltReferenceFileNameInformation(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltRegisterFilter(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltRegisterFilter(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltRegisterForDataScan(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltRegisterForDataScan(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltReissueSynchronousIo(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltReissueSynchronousIo(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseContext(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseContext(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseContexts(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseContexts(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseContextsEx(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseContextsEx(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseFileNameInformation(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseFileNameInformation(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltReleasePushLock(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltReleasePushLock(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltReleasePushLockEx(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltReleasePushLockEx(p0: String, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseResource(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseResource(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltRemoveExtraCreateParameter(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltRemoveExtraCreateParameter(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltRemoveOpenReparseEntry(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltRemoveOpenReparseEntry(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltRequestFileInfoOnCreateCompletion(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltRequestFileInfoOnCreateCompletion(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltRequestOperationStatusCallback(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltRequestOperationStatusCallback(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltRetainSwappedBufferMdlAddress(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltRetainSwappedBufferMdlAddress(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltRetrieveFileInfoOnCreateCompletion(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltRetrieveFileInfoOnCreateCompletion(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltRetrieveFileInfoOnCreateCompletionEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltRetrieveFileInfoOnCreateCompletionEx(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltRetrieveIoPriorityInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltRetrieveIoPriorityInfo(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltReuseCallbackData(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltReuseCallbackData(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltRollbackComplete(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltRollbackComplete(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltRollbackEnlistment(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltRollbackEnlistment(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltSendMessage(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSendMessage(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetActivityIdCallbackData(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSetActivityIdCallbackData(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetCallbackDataDirty(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSetCallbackDataDirty(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetCancelCompletion(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSetCancelCompletion(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetEaFile(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSetEaFile(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetEcpListIntoCallbackData(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSetEcpListIntoCallbackData(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetFileContext(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSetFileContext(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetFsZeroingOffset(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSetFsZeroingOffset(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetFsZeroingOffsetRequired(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSetFsZeroingOffsetRequired(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetInformationFile(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSetInformationFile(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetInstanceContext(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSetInstanceContext(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetIoPriorityHintIntoCallbackData(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSetIoPriorityHintIntoCallbackData(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetIoPriorityHintIntoFileObject(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSetIoPriorityHintIntoFileObject(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetIoPriorityHintIntoThread(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSetIoPriorityHintIntoThread(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetQuotaInformationFile(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSetQuotaInformationFile(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetSecurityObject(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSetSecurityObject(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetStreamContext(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSetStreamContext(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetStreamHandleContext(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSetStreamHandleContext(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetTransactionContext(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSetTransactionContext(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetVolumeContext(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSetVolumeContext(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetVolumeInformation(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSetVolumeInformation(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltStartFiltering(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltStartFiltering(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsFileContexts(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsFileContexts(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsFileContextsEx(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsFileContextsEx(p0: String, p1: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsStreamContexts(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsStreamContexts(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsStreamHandleContexts(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsStreamHandleContexts(p0: String): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltTagFile(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltTagFile(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltTagFileEx(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltTagFileEx(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: Int, p7: String, p8: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltUninitializeFileLock(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltUninitializeFileLock(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltUninitializeOplock(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltUninitializeOplock(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltUnloadFilter(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltUnloadFilter(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltUnregisterFilter(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltUnregisterFilter(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltUntagFile(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltUntagFile(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltVetoBypassIo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltVetoBypassIo(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltWriteFile(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltWriteFile(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltWriteFileEx(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltWriteFileEx(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: String, p9: String, p10: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMinifiltersFltpTraceRedirectedFileIo(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltpTraceRedirectedFileIo(p0: String, p1: String): Int

public actual fun fltAcknowledgeEcp(filter: PfltFilter, ecpcontext: ConstPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltAcknowledgeEcp(filter.toString(), ecpcontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltAcquirePushLockExclusive(pushlock: MutPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockExclusive(pushlock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltAcquirePushLockExclusiveEx(pushlock: MutPtr, flags: UInt) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockExclusiveEx(pushlock.rawAddress.toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltAcquirePushLockShared(pushlock: MutPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockShared(pushlock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltAcquirePushLockSharedEx(pushlock: MutPtr, flags: UInt) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockSharedEx(pushlock.rawAddress.toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltAcquireResourceExclusive(resource: MutPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltAcquireResourceExclusive(resource.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltAcquireResourceShared(resource: MutPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltAcquireResourceShared(resource.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltAddOpenReparseEntry(filter: PfltFilter, data: ConstPtr, openreparseentry: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltAddOpenReparseEntry(filter.toString(), data.rawAddress.toString(), openreparseentry.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltAdjustDeviceStackSizeForIoRedirection(sourceinstance: PfltInstance, targetinstance: PfltInstance, sourcedevicestacksizemodified: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltAdjustDeviceStackSizeForIoRedirection(sourceinstance.toString(), targetinstance.toString(), sourcedevicestacksizemodified.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltAllocateCallbackData(instance: PfltInstance, fileobject: ConstPtr, retnewcallbackdata: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateCallbackData(instance.toString(), fileobject.rawAddress.toString(), retnewcallbackdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltAllocateCallbackDataEx(instance: PfltInstance, fileobject: ConstPtr, flags: UInt, retnewcallbackdata: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateCallbackDataEx(instance.toString(), fileobject.rawAddress.toString(), flags.toInt(), retnewcallbackdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltAllocateContext(filter: PfltFilter, contexttype: UShort, contextsize: ULong, pooltype: PoolType, returnedcontext: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateContext(filter.toString(), contexttype.toInt(), contextsize.toString(), pooltype, returnedcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltAllocateDeferredIoWorkItem(): PfltDeferredIoWorkitem =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateDeferredIoWorkItem().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltAllocateExtraCreateParameter(filter: PfltFilter, ecptype: ConstPtr, sizeofcontext: UInt, flags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, pooltag: UInt, ecpcontext: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateExtraCreateParameter(filter.toString(), ecptype.rawAddress.toString(), sizeofcontext.toInt(), flags.toInt(), 0L.toString(), pooltag.toInt(), ecpcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltAllocateExtraCreateParameterFromLookasideList(filter: PfltFilter, ecptype: ConstPtr, sizeofcontext: UInt, flags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, lookasidelist: MutPtr, ecpcontext: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateExtraCreateParameterFromLookasideList(filter.toString(), ecptype.rawAddress.toString(), sizeofcontext.toInt(), flags.toInt(), 0L.toString(), lookasidelist.rawAddress.toString(), ecpcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltAllocateExtraCreateParameterList(filter: PfltFilter, flags: UInt, ecplist: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateExtraCreateParameterList(filter.toString(), flags.toInt(), ecplist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltAllocateFileLock(completelockcallbackdataroutine: PfltCompleteLockCallbackDataRoutine, unlockroutine: PunlockRoutine): MutPtr =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateFileLock(0L.toString(), 0L.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltAllocateGenericWorkItem(): PfltGenericWorkitem =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateGenericWorkItem().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltAllocatePoolAlignedWithTag(instance: PfltInstance, pooltype: PoolType, numberofbytes: ULong, tag: UInt): MutPtr =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltAllocatePoolAlignedWithTag(instance.toString(), pooltype, numberofbytes.toString(), tag.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltApplyPriorityInfoThread(inputpriorityinfo: ConstPtr, outputpriorityinfo: MutPtr, thread: Pethread): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltApplyPriorityInfoThread(inputpriorityinfo.rawAddress.toString(), outputpriorityinfo.rawAddress.toString(), thread.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltAttachVolume(filter: PfltFilter, volume: PfltVolume, instancename: ConstPtr, retinstance: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltAttachVolume(filter.toString(), volume.toString(), instancename.rawAddress.toString(), retinstance.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltAttachVolumeAtAltitude(filter: PfltFilter, volume: PfltVolume, altitude: ConstPtr, instancename: ConstPtr, retinstance: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltAttachVolumeAtAltitude(filter.toString(), volume.toString(), altitude.rawAddress.toString(), instancename.rawAddress.toString(), retinstance.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltBuildDefaultSecurityDescriptor(securitydescriptor: MutPtr, desiredaccess: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltBuildDefaultSecurityDescriptor(securitydescriptor.rawAddress.toString(), desiredaccess.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCancelFileOpen(instance: PfltInstance, fileobject: ConstPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCancelFileOpen(instance.toString(), fileobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltCancelIo(callbackdata: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCancelIo(callbackdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCancellableWaitForMultipleObjects(count: UInt, objectarray: ConstPtr, waittype: WaitType, timeout: ConstPtr, waitblockarray: ConstPtr, callbackdata: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCancellableWaitForMultipleObjects(count.toInt(), objectarray.rawAddress.toString(), waittype, timeout.rawAddress.toString(), waitblockarray.rawAddress.toString(), callbackdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCancellableWaitForSingleObject(obj: ConstPtr, timeout: ConstPtr, callbackdata: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCancellableWaitForSingleObject(obj.rawAddress.toString(), timeout.rawAddress.toString(), callbackdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCbdqDisable(cbdq: MutPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqDisable(cbdq.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltCbdqEnable(cbdq: MutPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqEnable(cbdq.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltCbdqInitialize(instance: PfltInstance, cbdq: MutPtr, cbdqinsertio: PfltCallbackDataQueueInsertIo, cbdqremoveio: PfltCallbackDataQueueRemoveIo, cbdqpeeknextio: PfltCallbackDataQueuePeekNextIo, cbdqacquire: PfltCallbackDataQueueAcquire, cbdqrelease: PfltCallbackDataQueueRelease, cbdqcompletecanceledio: PfltCallbackDataQueueCompleteCanceledIo): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqInitialize(instance.toString(), cbdq.rawAddress.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCbdqInsertIo(cbdq: MutPtr, cbd: ConstPtr, context: ConstPtr, insertcontext: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqInsertIo(cbdq.rawAddress.toString(), cbd.rawAddress.toString(), context.rawAddress.toString(), insertcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCbdqRemoveIo(cbdq: MutPtr, context: ConstPtr): MutPtr =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqRemoveIo(cbdq.rawAddress.toString(), context.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCbdqRemoveNextIo(cbdq: MutPtr, peekcontext: ConstPtr): MutPtr =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqRemoveNextIo(cbdq.rawAddress.toString(), peekcontext.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCheckAndGrowNameControl(namectrl: MutPtr, newsize: UShort): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCheckAndGrowNameControl(namectrl.rawAddress.toString(), newsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCheckLockForReadAccess(filelock: ConstPtr, callbackdata: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCheckLockForReadAccess(filelock.rawAddress.toString(), callbackdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCheckLockForWriteAccess(filelock: ConstPtr, callbackdata: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCheckLockForWriteAccess(filelock.rawAddress.toString(), callbackdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCheckOplock(oplock: ConstPtr, callbackdata: ConstPtr, context: ConstPtr, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCheckOplock(oplock.rawAddress.toString(), callbackdata.rawAddress.toString(), context.rawAddress.toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCheckOplockEx(oplock: ConstPtr, callbackdata: ConstPtr, flags: UInt, context: ConstPtr, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCheckOplockEx(oplock.rawAddress.toString(), callbackdata.rawAddress.toString(), flags.toInt(), context.rawAddress.toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltClearCallbackDataDirty(data: MutPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltClearCallbackDataDirty(data.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltClearCancelCompletion(callbackdata: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltClearCancelCompletion(callbackdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltClose(filehandle: Handle): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltClose(filehandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCloseClientPort(filter: PfltFilter, clientport: MutPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCloseClientPort(filter.toString(), clientport.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltCloseCommunicationPort(serverport: PfltPort) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCloseCommunicationPort(serverport.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltCloseSectionForDataScan(sectioncontext: PfltContext): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCloseSectionForDataScan(sectioncontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCommitComplete(instance: PfltInstance, transaction: ConstPtr, transactioncontext: PfltContext): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCommitComplete(instance.toString(), transaction.rawAddress.toString(), transactioncontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCommitFinalizeComplete(instance: PfltInstance, transaction: ConstPtr, transactioncontext: PfltContext): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCommitFinalizeComplete(instance.toString(), transaction.rawAddress.toString(), transactioncontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCompareInstanceAltitudes(instance1: PfltInstance, instance2: PfltInstance): Int =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCompareInstanceAltitudes(instance1.toString(), instance2.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCompletePendedPostOperation(callbackdata: ConstPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCompletePendedPostOperation(callbackdata.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltCompletePendedPreOperation(callbackdata: ConstPtr, callbackstatus: FltPreopCallbackStatus, context: ConstPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCompletePendedPreOperation(callbackdata.rawAddress.toString(), callbackstatus, context.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltCopyOpenReparseList(filter: PfltFilter, data: ConstPtr, ecplist: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCopyOpenReparseList(filter.toString(), data.rawAddress.toString(), ecplist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCreateCommunicationPort(filter: PfltFilter, serverport: MutPtr, objectattributes: ConstPtr, serverportcookie: ConstPtr, connectnotifycallback: PfltConnectNotify, disconnectnotifycallback: PfltDisconnectNotify, messagenotifycallback: PfltMessageNotify, maxconnections: Int): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCreateCommunicationPort(filter.toString(), serverport.rawAddress.toString(), objectattributes.rawAddress.toString(), serverportcookie.rawAddress.toString(), 0L.toString(), 0L.toString(), 0L.toString(), maxconnections) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCreateFile(filter: PfltFilter, instance: PfltInstance, filehandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, iostatusblock: MutPtr, allocationsize: ConstPtr, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: ConstPtr, ealength: UInt, flags: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCreateFile(filter.toString(), instance.toString(), filehandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), iostatusblock.rawAddress.toString(), allocationsize.rawAddress.toString(), fileattributes.toInt(), shareaccess.toInt(), createdisposition.toInt(), createoptions.toInt(), eabuffer.rawAddress.toString(), ealength.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCreateFileEx(filter: PfltFilter, instance: PfltInstance, filehandle: MutPtr, fileobject: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, iostatusblock: MutPtr, allocationsize: ConstPtr, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: ConstPtr, ealength: UInt, flags: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCreateFileEx(filter.toString(), instance.toString(), filehandle.rawAddress.toString(), fileobject.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), iostatusblock.rawAddress.toString(), allocationsize.rawAddress.toString(), fileattributes.toInt(), shareaccess.toInt(), createdisposition.toInt(), createoptions.toInt(), eabuffer.rawAddress.toString(), ealength.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCreateFileEx2(filter: PfltFilter, instance: PfltInstance, filehandle: MutPtr, fileobject: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, iostatusblock: MutPtr, allocationsize: ConstPtr, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: ConstPtr, ealength: UInt, flags: UInt, drivercontext: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCreateFileEx2(filter.toString(), instance.toString(), filehandle.rawAddress.toString(), fileobject.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), iostatusblock.rawAddress.toString(), allocationsize.rawAddress.toString(), fileattributes.toInt(), shareaccess.toInt(), createdisposition.toInt(), createoptions.toInt(), eabuffer.rawAddress.toString(), ealength.toInt(), flags.toInt(), drivercontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCreateMailslotFile(filter: PfltFilter, instance: PfltInstance, filehandle: MutPtr, fileobject: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, iostatusblock: MutPtr, createoptions: UInt, mailslotquota: UInt, maximummessagesize: UInt, readtimeout: ConstPtr, drivercontext: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCreateMailslotFile(filter.toString(), instance.toString(), filehandle.rawAddress.toString(), fileobject.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), iostatusblock.rawAddress.toString(), createoptions.toInt(), mailslotquota.toInt(), maximummessagesize.toInt(), readtimeout.rawAddress.toString(), drivercontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCreateNamedPipeFile(filter: PfltFilter, instance: PfltInstance, filehandle: MutPtr, fileobject: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, iostatusblock: MutPtr, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, namedpipetype: UInt, readmode: UInt, completionmode: UInt, maximuminstances: UInt, inboundquota: UInt, outboundquota: UInt, defaulttimeout: ConstPtr, drivercontext: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCreateNamedPipeFile(filter.toString(), instance.toString(), filehandle.rawAddress.toString(), fileobject.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), iostatusblock.rawAddress.toString(), shareaccess.toInt(), createdisposition.toInt(), createoptions.toInt(), namedpipetype.toInt(), readmode.toInt(), completionmode.toInt(), maximuminstances.toInt(), inboundquota.toInt(), outboundquota.toInt(), defaulttimeout.rawAddress.toString(), drivercontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCreateSectionForDataScan(instance: PfltInstance, fileobject: ConstPtr, sectioncontext: PfltContext, desiredaccess: UInt, objectattributes: ConstPtr, maximumsize: ConstPtr, sectionpageprotection: UInt, allocationattributes: UInt, flags: UInt, sectionhandle: MutPtr, sectionobject: MutPtr, sectionfilesize: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCreateSectionForDataScan(instance.toString(), fileobject.rawAddress.toString(), sectioncontext.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), maximumsize.rawAddress.toString(), sectionpageprotection.toInt(), allocationattributes.toInt(), flags.toInt(), sectionhandle.rawAddress.toString(), sectionobject.rawAddress.toString(), sectionfilesize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCreateSystemVolumeInformationFolder(instance: PfltInstance): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCreateSystemVolumeInformationFolder(instance.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCurrentBatchOplock(oplock: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCurrentBatchOplock(oplock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCurrentOplock(oplock: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCurrentOplock(oplock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCurrentOplockH(oplock: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltCurrentOplockH(oplock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltDecodeParameters(callbackdata: ConstPtr, mdladdresspointer: MutPtr, buffer: MutPtr, length: MutPtr, desiredaccess: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltDecodeParameters(callbackdata.rawAddress.toString(), mdladdresspointer.rawAddress.toString(), buffer.rawAddress.toString(), length.rawAddress.toString(), desiredaccess.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltDeleteContext(context: PfltContext) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteContext(context.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltDeleteExtraCreateParameterLookasideList(filter: PfltFilter, lookaside: MutPtr, flags: UInt) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteExtraCreateParameterLookasideList(filter.toString(), lookaside.rawAddress.toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltDeleteFileContext(instance: PfltInstance, fileobject: ConstPtr, oldcontext: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteFileContext(instance.toString(), fileobject.rawAddress.toString(), oldcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltDeleteInstanceContext(instance: PfltInstance, oldcontext: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteInstanceContext(instance.toString(), oldcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltDeletePushLock(pushlock: ConstPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltDeletePushLock(pushlock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltDeleteStreamContext(instance: PfltInstance, fileobject: ConstPtr, oldcontext: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteStreamContext(instance.toString(), fileobject.rawAddress.toString(), oldcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltDeleteStreamHandleContext(instance: PfltInstance, fileobject: ConstPtr, oldcontext: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteStreamHandleContext(instance.toString(), fileobject.rawAddress.toString(), oldcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltDeleteTransactionContext(instance: PfltInstance, transaction: ConstPtr, oldcontext: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteTransactionContext(instance.toString(), transaction.rawAddress.toString(), oldcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltDeleteVolumeContext(filter: PfltFilter, volume: PfltVolume, oldcontext: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteVolumeContext(filter.toString(), volume.toString(), oldcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltDetachVolume(filter: PfltFilter, volume: PfltVolume, instancename: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltDetachVolume(filter.toString(), volume.toString(), instancename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltDeviceIoControlFile(instance: PfltInstance, fileobject: ConstPtr, iocontrolcode: UInt, inputbuffer: ConstPtr, inputbufferlength: UInt, outputbuffer: MutPtr, outputbufferlength: UInt, lengthreturned: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltDeviceIoControlFile(instance.toString(), fileobject.rawAddress.toString(), iocontrolcode.toInt(), inputbuffer.rawAddress.toString(), inputbufferlength.toInt(), outputbuffer.rawAddress.toString(), outputbufferlength.toInt(), lengthreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltDoCompletionProcessingWhenSafe(data: ConstPtr, fltobjects: ConstPtr, completioncontext: ConstPtr, flags: UInt, safepostcallback: PfltPostOperationCallback, retpostoperationstatus: MutPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltDoCompletionProcessingWhenSafe(data.rawAddress.toString(), fltobjects.rawAddress.toString(), completioncontext.rawAddress.toString(), flags.toInt(), 0L.toString(), retpostoperationstatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltEnlistInTransaction(instance: PfltInstance, transaction: ConstPtr, transactioncontext: PfltContext, notificationmask: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltEnlistInTransaction(instance.toString(), transaction.rawAddress.toString(), transactioncontext.rawAddress.toString(), notificationmask.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltEnumerateFilterInformation(index: UInt, informationclass: FilterInformationClass, buffer: MutPtr, buffersize: UInt, bytesreturned: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateFilterInformation(index.toInt(), informationclass, buffer.rawAddress.toString(), buffersize.toInt(), bytesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltEnumerateFilters(filterlist: MutPtr, filterlistsize: UInt, numberfiltersreturned: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateFilters(filterlist.rawAddress.toString(), filterlistsize.toInt(), numberfiltersreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltEnumerateInstanceInformationByDeviceObject(deviceobject: ConstPtr, index: UInt, informationclass: InstanceInformationClass, buffer: MutPtr, buffersize: UInt, bytesreturned: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByDeviceObject(deviceobject.rawAddress.toString(), index.toInt(), informationclass, buffer.rawAddress.toString(), buffersize.toInt(), bytesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltEnumerateInstanceInformationByFilter(filter: PfltFilter, index: UInt, informationclass: InstanceInformationClass, buffer: MutPtr, buffersize: UInt, bytesreturned: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByFilter(filter.toString(), index.toInt(), informationclass, buffer.rawAddress.toString(), buffersize.toInt(), bytesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltEnumerateInstanceInformationByVolume(volume: PfltVolume, index: UInt, informationclass: InstanceInformationClass, buffer: MutPtr, buffersize: UInt, bytesreturned: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByVolume(volume.toString(), index.toInt(), informationclass, buffer.rawAddress.toString(), buffersize.toInt(), bytesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltEnumerateInstanceInformationByVolumeName(volumename: ConstPtr, index: UInt, informationclass: InstanceInformationClass, buffer: MutPtr, buffersize: UInt, bytesreturned: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByVolumeName(volumename.rawAddress.toString(), index.toInt(), informationclass, buffer.rawAddress.toString(), buffersize.toInt(), bytesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltEnumerateInstances(volume: PfltVolume, filter: PfltFilter, instancelist: MutPtr, instancelistsize: UInt, numberinstancesreturned: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstances(volume.toString(), filter.toString(), instancelist.rawAddress.toString(), instancelistsize.toInt(), numberinstancesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltEnumerateVolumeInformation(filter: PfltFilter, index: UInt, informationclass: FilterVolumeInformationClass, buffer: MutPtr, buffersize: UInt, bytesreturned: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateVolumeInformation(filter.toString(), index.toInt(), informationclass, buffer.rawAddress.toString(), buffersize.toInt(), bytesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltEnumerateVolumes(filter: PfltFilter, volumelist: MutPtr, volumelistsize: UInt, numbervolumesreturned: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateVolumes(filter.toString(), volumelist.rawAddress.toString(), volumelistsize.toInt(), numbervolumesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltFastIoMdlRead(initiatinginstance: PfltInstance, fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, lockkey: UInt, mdlchain: MutPtr, iostatus: MutPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoMdlRead(initiatinginstance.toString(), fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt(), lockkey.toInt(), mdlchain.rawAddress.toString(), iostatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltFastIoMdlReadComplete(initiatinginstance: PfltInstance, fileobject: ConstPtr, mdlchain: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoMdlReadComplete(initiatinginstance.toString(), fileobject.rawAddress.toString(), mdlchain.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltFastIoMdlWriteComplete(initiatinginstance: PfltInstance, fileobject: ConstPtr, fileoffset: ConstPtr, mdlchain: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoMdlWriteComplete(initiatinginstance.toString(), fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), mdlchain.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltFastIoPrepareMdlWrite(initiatinginstance: PfltInstance, fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, lockkey: UInt, mdlchain: MutPtr, iostatus: MutPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoPrepareMdlWrite(initiatinginstance.toString(), fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt(), lockkey.toInt(), mdlchain.rawAddress.toString(), iostatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltFindExtraCreateParameter(filter: PfltFilter, ecplist: ConstPtr, ecptype: ConstPtr, ecpcontext: MutPtr, ecpcontextsize: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltFindExtraCreateParameter(filter.toString(), ecplist.rawAddress.toString(), ecptype.rawAddress.toString(), ecpcontext.rawAddress.toString(), ecpcontextsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltFlushBuffers(instance: PfltInstance, fileobject: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltFlushBuffers(instance.toString(), fileobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltFlushBuffers2(instance: PfltInstance, fileobject: ConstPtr, flushtype: UInt, callbackdata: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltFlushBuffers2(instance.toString(), fileobject.rawAddress.toString(), flushtype.toInt(), callbackdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltFreeCallbackData(callbackdata: ConstPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltFreeCallbackData(callbackdata.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltFreeDeferredIoWorkItem(fltworkitem: PfltDeferredIoWorkitem) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltFreeDeferredIoWorkItem(fltworkitem.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltFreeExtraCreateParameter(filter: PfltFilter, ecpcontext: ConstPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltFreeExtraCreateParameter(filter.toString(), ecpcontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltFreeExtraCreateParameterList(filter: PfltFilter, ecplist: ConstPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltFreeExtraCreateParameterList(filter.toString(), ecplist.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltFreeFileLock(filelock: ConstPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltFreeFileLock(filelock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltFreeGenericWorkItem(fltworkitem: PfltGenericWorkitem) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltFreeGenericWorkItem(fltworkitem.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltFreeOpenReparseList(filter: PfltFilter, ecplist: ConstPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltFreeOpenReparseList(filter.toString(), ecplist.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltFreePoolAlignedWithTag(instance: PfltInstance, buffer: ConstPtr, tag: UInt) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltFreePoolAlignedWithTag(instance.toString(), buffer.rawAddress.toString(), tag.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltFreeSecurityDescriptor(securitydescriptor: PsecurityDescriptor) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltFreeSecurityDescriptor(securitydescriptor.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltFsControlFile(instance: PfltInstance, fileobject: ConstPtr, fscontrolcode: UInt, inputbuffer: ConstPtr, inputbufferlength: UInt, outputbuffer: MutPtr, outputbufferlength: UInt, lengthreturned: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltFsControlFile(instance.toString(), fileobject.rawAddress.toString(), fscontrolcode.toInt(), inputbuffer.rawAddress.toString(), inputbufferlength.toInt(), outputbuffer.rawAddress.toString(), outputbufferlength.toInt(), lengthreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetActivityIdCallbackData(callbackdata: ConstPtr, guid: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetActivityIdCallbackData(callbackdata.rawAddress.toString(), guid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetBottomInstance(volume: PfltVolume, instance: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetBottomInstance(volume.toString(), instance.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetContexts(fltobjects: ConstPtr, desiredcontexts: UShort, contexts: MutPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetContexts(fltobjects.rawAddress.toString(), desiredcontexts.toInt(), contexts.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltGetContextsEx(fltobjects: ConstPtr, desiredcontexts: UShort, contextssize: ULong, contexts: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetContextsEx(fltobjects.rawAddress.toString(), desiredcontexts.toInt(), contextssize.toString(), contexts.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetDestinationFileNameInformation(instance: PfltInstance, fileobject: ConstPtr, rootdirectory: Handle, filename: Pcwstr, filenamelength: UInt, nameoptions: UInt, retfilenameinformation: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetDestinationFileNameInformation(instance.toString(), fileobject.rawAddress.toString(), rootdirectory.rawAddress.toString(), filename.rawAddress.toString(), filenamelength.toInt(), nameoptions.toInt(), retfilenameinformation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetDeviceObject(volume: PfltVolume, deviceobject: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetDeviceObject(volume.toString(), deviceobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetDiskDeviceObject(volume: PfltVolume, diskdeviceobject: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetDiskDeviceObject(volume.toString(), diskdeviceobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetEcpListFromCallbackData(filter: PfltFilter, callbackdata: ConstPtr, ecplist: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetEcpListFromCallbackData(filter.toString(), callbackdata.rawAddress.toString(), ecplist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetFileContext(instance: PfltInstance, fileobject: ConstPtr, context: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileContext(instance.toString(), fileobject.rawAddress.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetFileNameInformation(callbackdata: ConstPtr, nameoptions: UInt, filenameinformation: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileNameInformation(callbackdata.rawAddress.toString(), nameoptions.toInt(), filenameinformation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetFileNameInformationUnsafe(fileobject: ConstPtr, instance: PfltInstance, nameoptions: UInt, filenameinformation: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileNameInformationUnsafe(fileobject.rawAddress.toString(), instance.toString(), nameoptions.toInt(), filenameinformation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetFileSystemType(fltobject: ConstPtr, filesystemtype: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileSystemType(fltobject.rawAddress.toString(), filesystemtype.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetFilterFromInstance(instance: PfltInstance, retfilter: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetFilterFromInstance(instance.toString(), retfilter.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetFilterFromName(filtername: ConstPtr, retfilter: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetFilterFromName(filtername.rawAddress.toString(), retfilter.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetFilterInformation(filter: PfltFilter, informationclass: FilterInformationClass, buffer: MutPtr, buffersize: UInt, bytesreturned: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetFilterInformation(filter.toString(), informationclass, buffer.rawAddress.toString(), buffersize.toInt(), bytesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetFsZeroingOffset(data: ConstPtr, zeroingoffset: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetFsZeroingOffset(data.rawAddress.toString(), zeroingoffset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetInstanceContext(instance: PfltInstance, context: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetInstanceContext(instance.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetInstanceInformation(instance: PfltInstance, informationclass: InstanceInformationClass, buffer: MutPtr, buffersize: UInt, bytesreturned: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetInstanceInformation(instance.toString(), informationclass, buffer.rawAddress.toString(), buffersize.toInt(), bytesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetIoAttributionHandleFromCallbackData(data: ConstPtr): MutPtr =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoAttributionHandleFromCallbackData(data.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetIoPriorityHint(data: ConstPtr): IoPriorityHint =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHint(data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetIoPriorityHintFromCallbackData(data: ConstPtr): IoPriorityHint =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHintFromCallbackData(data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetIoPriorityHintFromFileObject(fileobject: ConstPtr): IoPriorityHint =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHintFromFileObject(fileobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetIoPriorityHintFromThread(thread: Pethread): IoPriorityHint =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHintFromThread(thread.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetIrpName(irpmajorcode: UByte): Pstr =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetIrpName(irpmajorcode.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetLowerInstance(currentinstance: PfltInstance, lowerinstance: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetLowerInstance(currentinstance.toString(), lowerinstance.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetNewSystemBufferAddress(callbackdata: ConstPtr): MutPtr =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetNewSystemBufferAddress(callbackdata.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetNextExtraCreateParameter(filter: PfltFilter, ecplist: ConstPtr, currentecpcontext: ConstPtr, nextecptype: MutPtr, nextecpcontext: MutPtr, nextecpcontextsize: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetNextExtraCreateParameter(filter.toString(), ecplist.rawAddress.toString(), currentecpcontext.rawAddress.toString(), nextecptype.rawAddress.toString(), nextecpcontext.rawAddress.toString(), nextecpcontextsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetRequestorProcess(callbackdata: ConstPtr): Peprocess =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorProcess(callbackdata.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetRequestorProcessId(callbackdata: ConstPtr): UInt =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorProcessId(callbackdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetRequestorProcessIdEx(callbackdata: ConstPtr): Handle =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorProcessIdEx(callbackdata.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetRequestorSessionId(callbackdata: ConstPtr, sessionid: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorSessionId(callbackdata.rawAddress.toString(), sessionid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetRoutineAddress(fltmgrroutinename: Pcstr): MutPtr =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetRoutineAddress(fltmgrroutinename.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetSectionContext(instance: PfltInstance, fileobject: ConstPtr, context: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetSectionContext(instance.toString(), fileobject.rawAddress.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetStreamContext(instance: PfltInstance, fileobject: ConstPtr, context: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetStreamContext(instance.toString(), fileobject.rawAddress.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetStreamHandleContext(instance: PfltInstance, fileobject: ConstPtr, context: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetStreamHandleContext(instance.toString(), fileobject.rawAddress.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetSwappedBufferMdlAddress(callbackdata: ConstPtr): MutPtr =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetSwappedBufferMdlAddress(callbackdata.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetTopInstance(volume: PfltVolume, instance: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetTopInstance(volume.toString(), instance.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetTransactionContext(instance: PfltInstance, transaction: ConstPtr, context: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetTransactionContext(instance.toString(), transaction.rawAddress.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetTunneledName(callbackdata: ConstPtr, filenameinformation: ConstPtr, rettunneledfilenameinformation: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetTunneledName(callbackdata.rawAddress.toString(), filenameinformation.rawAddress.toString(), rettunneledfilenameinformation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetUpperInstance(currentinstance: PfltInstance, upperinstance: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetUpperInstance(currentinstance.toString(), upperinstance.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetVolumeContext(filter: PfltFilter, volume: PfltVolume, context: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeContext(filter.toString(), volume.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetVolumeFromDeviceObject(filter: PfltFilter, deviceobject: ConstPtr, retvolume: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromDeviceObject(filter.toString(), deviceobject.rawAddress.toString(), retvolume.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetVolumeFromFileObject(filter: PfltFilter, fileobject: ConstPtr, retvolume: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromFileObject(filter.toString(), fileobject.rawAddress.toString(), retvolume.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetVolumeFromInstance(instance: PfltInstance, retvolume: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromInstance(instance.toString(), retvolume.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetVolumeFromName(filter: PfltFilter, volumename: ConstPtr, retvolume: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromName(filter.toString(), volumename.rawAddress.toString(), retvolume.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetVolumeGuidName(volume: PfltVolume, volumeguidname: MutPtr, buffersizeneeded: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeGuidName(volume.toString(), volumeguidname.rawAddress.toString(), buffersizeneeded.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetVolumeInformation(volume: PfltVolume, informationclass: FilterVolumeInformationClass, buffer: MutPtr, buffersize: UInt, bytesreturned: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeInformation(volume.toString(), informationclass, buffer.rawAddress.toString(), buffersize.toInt(), bytesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetVolumeInstanceFromName(filter: PfltFilter, volume: PfltVolume, instancename: ConstPtr, retinstance: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeInstanceFromName(filter.toString(), volume.toString(), instancename.rawAddress.toString(), retinstance.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetVolumeName(volume: PfltVolume, volumename: MutPtr, buffersizeneeded: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeName(volume.toString(), volumename.rawAddress.toString(), buffersizeneeded.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetVolumeProperties(volume: PfltVolume, volumeproperties: MutPtr, volumepropertieslength: UInt, lengthreturned: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeProperties(volume.toString(), volumeproperties.rawAddress.toString(), volumepropertieslength.toInt(), lengthreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltInitExtraCreateParameterLookasideList(filter: PfltFilter, lookaside: MutPtr, flags: UInt, size: ULong, tag: UInt) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltInitExtraCreateParameterLookasideList(filter.toString(), lookaside.rawAddress.toString(), flags.toInt(), size.toString(), tag.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltInitializeFileLock(filelock: MutPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltInitializeFileLock(filelock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltInitializeOplock(oplock: MutPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltInitializeOplock(oplock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltInitializePushLock(pushlock: MutPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltInitializePushLock(pushlock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltInsertExtraCreateParameter(filter: PfltFilter, ecplist: MutPtr, ecpcontext: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltInsertExtraCreateParameter(filter.toString(), ecplist.rawAddress.toString(), ecpcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltIs32bitProcess(callbackdata: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltIs32bitProcess(callbackdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltIsCallbackDataDirty(data: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltIsCallbackDataDirty(data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltIsDirectory(fileobject: ConstPtr, instance: PfltInstance, isdirectory: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltIsDirectory(fileobject.rawAddress.toString(), instance.toString(), isdirectory.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltIsEcpAcknowledged(filter: PfltFilter, ecpcontext: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltIsEcpAcknowledged(filter.toString(), ecpcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltIsEcpFromUserMode(filter: PfltFilter, ecpcontext: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltIsEcpFromUserMode(filter.toString(), ecpcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltIsFltMgrVolumeDeviceObject(deviceobject: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltIsFltMgrVolumeDeviceObject(deviceobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltIsIoCanceled(callbackdata: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltIsIoCanceled(callbackdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltIsIoRedirectionAllowed(sourceinstance: PfltInstance, targetinstance: PfltInstance, redirectionallowed: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltIsIoRedirectionAllowed(sourceinstance.toString(), targetinstance.toString(), redirectionallowed.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltIsIoRedirectionAllowedForOperation(data: ConstPtr, targetinstance: PfltInstance, redirectionallowedthisio: MutPtr, redirectionallowedallio: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltIsIoRedirectionAllowedForOperation(data.rawAddress.toString(), targetinstance.toString(), redirectionallowedthisio.rawAddress.toString(), redirectionallowedallio.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltIsOperationSynchronous(callbackdata: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltIsOperationSynchronous(callbackdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltIsVolumeSnapshot(fltobject: ConstPtr, issnapshotvolume: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltIsVolumeSnapshot(fltobject.rawAddress.toString(), issnapshotvolume.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltIsVolumeWritable(fltobject: ConstPtr, iswritable: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltIsVolumeWritable(fltobject.rawAddress.toString(), iswritable.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltLoadFilter(filtername: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltLoadFilter(filtername.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltLockUserBuffer(callbackdata: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltLockUserBuffer(callbackdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltNotifyFilterChangeDirectory(notifysync: PnotifySync, notifylist: MutPtr, fscontext: ConstPtr, fulldirectoryname: ConstPtr, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifycallbackdata: ConstPtr, traversecallback: PcheckForTraverseAccess, subjectcontext: ConstPtr, filtercallback: PfilterReportChange): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltObjectDereference(fltobject: MutPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltObjectDereference(fltobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltObjectReference(fltobject: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltObjectReference(fltobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltOpenVolume(instance: PfltInstance, volumehandle: MutPtr, volumefileobject: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltOpenVolume(instance.toString(), volumehandle.rawAddress.toString(), volumefileobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltOplockBreakH(oplock: ConstPtr, callbackdata: ConstPtr, flags: UInt, context: ConstPtr, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltOplockBreakH(oplock.rawAddress.toString(), callbackdata.rawAddress.toString(), flags.toInt(), context.rawAddress.toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltOplockBreakToNone(oplock: ConstPtr, callbackdata: ConstPtr, context: ConstPtr, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltOplockBreakToNone(oplock.rawAddress.toString(), callbackdata.rawAddress.toString(), context.rawAddress.toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltOplockBreakToNoneEx(oplock: ConstPtr, callbackdata: ConstPtr, flags: UInt, context: ConstPtr, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltOplockBreakToNoneEx(oplock.rawAddress.toString(), callbackdata.rawAddress.toString(), flags.toInt(), context.rawAddress.toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltOplockFsctrl(oplock: ConstPtr, callbackdata: ConstPtr, opencount: UInt): FltPreopCallbackStatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltOplockFsctrl(oplock.rawAddress.toString(), callbackdata.rawAddress.toString(), opencount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltOplockFsctrlEx(oplock: ConstPtr, callbackdata: ConstPtr, opencount: UInt, flags: UInt): FltPreopCallbackStatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltOplockFsctrlEx(oplock.rawAddress.toString(), callbackdata.rawAddress.toString(), opencount.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltOplockIsFastIoPossible(oplock: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltOplockIsFastIoPossible(oplock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltOplockIsSharedRequest(callbackdata: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltOplockIsSharedRequest(callbackdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltOplockKeysEqual(fo1: ConstPtr, fo2: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltOplockKeysEqual(fo1.rawAddress.toString(), fo2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltParseFileName(filename: ConstPtr, extension: MutPtr, stream: MutPtr, finalcomponent: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltParseFileName(filename.rawAddress.toString(), extension.rawAddress.toString(), stream.rawAddress.toString(), finalcomponent.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltParseFileNameInformation(filenameinformation: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltParseFileNameInformation(filenameinformation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltPerformAsynchronousIo(callbackdata: MutPtr, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltPerformAsynchronousIo(callbackdata.rawAddress.toString(), 0L.toString(), callbackcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltPerformSynchronousIo(callbackdata: MutPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltPerformSynchronousIo(callbackdata.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltPrePrepareComplete(instance: PfltInstance, transaction: ConstPtr, transactioncontext: PfltContext): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltPrePrepareComplete(instance.toString(), transaction.rawAddress.toString(), transactioncontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltPrepareComplete(instance: PfltInstance, transaction: ConstPtr, transactioncontext: PfltContext): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltPrepareComplete(instance.toString(), transaction.rawAddress.toString(), transactioncontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltPrepareToReuseEcp(filter: PfltFilter, ecpcontext: ConstPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltPrepareToReuseEcp(filter.toString(), ecpcontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltProcessFileLock(filelock: ConstPtr, callbackdata: ConstPtr, context: ConstPtr): FltPreopCallbackStatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltProcessFileLock(filelock.rawAddress.toString(), callbackdata.rawAddress.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltPropagateActivityIdToThread(callbackdata: ConstPtr, propagateid: MutPtr, originalid: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltPropagateActivityIdToThread(callbackdata.rawAddress.toString(), propagateid.rawAddress.toString(), originalid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltPropagateIrpExtension(sourcedata: ConstPtr, targetdata: MutPtr, flags: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltPropagateIrpExtension(sourcedata.rawAddress.toString(), targetdata.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltPurgeFileNameInformationCache(instance: PfltInstance, fileobject: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltPurgeFileNameInformationCache(instance.toString(), fileobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltQueryDirectoryFile(instance: PfltInstance, fileobject: ConstPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass, returnsingleentry: Boolean, filename: ConstPtr, restartscan: Boolean, lengthreturned: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltQueryDirectoryFile(instance.toString(), fileobject.rawAddress.toString(), fileinformation.rawAddress.toString(), length.toInt(), fileinformationclass, returnsingleentry, filename.rawAddress.toString(), restartscan, lengthreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltQueryDirectoryFileEx(instance: PfltInstance, fileobject: ConstPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass, queryflags: UInt, filename: ConstPtr, lengthreturned: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltQueryDirectoryFileEx(instance.toString(), fileobject.rawAddress.toString(), fileinformation.rawAddress.toString(), length.toInt(), fileinformationclass, queryflags.toInt(), filename.rawAddress.toString(), lengthreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltQueryEaFile(instance: PfltInstance, fileobject: ConstPtr, returnedeadata: MutPtr, length: UInt, returnsingleentry: Boolean, ealist: ConstPtr, ealistlength: UInt, eaindex: ConstPtr, restartscan: Boolean, lengthreturned: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltQueryEaFile(instance.toString(), fileobject.rawAddress.toString(), returnedeadata.rawAddress.toString(), length.toInt(), returnsingleentry, ealist.rawAddress.toString(), ealistlength.toInt(), eaindex.rawAddress.toString(), restartscan, lengthreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltQueryInformationByName(filter: PfltFilter, instance: PfltInstance, objectattributes: ConstPtr, iostatusblock: MutPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass, drivercontext: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltQueryInformationByName(filter.toString(), instance.toString(), objectattributes.rawAddress.toString(), iostatusblock.rawAddress.toString(), fileinformation.rawAddress.toString(), length.toInt(), fileinformationclass, drivercontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltQueryInformationFile(instance: PfltInstance, fileobject: ConstPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass, lengthreturned: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltQueryInformationFile(instance.toString(), fileobject.rawAddress.toString(), fileinformation.rawAddress.toString(), length.toInt(), fileinformationclass, lengthreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltQueryQuotaInformationFile(instance: PfltInstance, fileobject: ConstPtr, iostatusblock: MutPtr, buffer: MutPtr, length: UInt, returnsingleentry: Boolean, sidlist: ConstPtr, sidlistlength: UInt, startsid: ConstPtr, restartscan: Boolean, lengthreturned: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltQueryQuotaInformationFile(instance.toString(), fileobject.rawAddress.toString(), iostatusblock.rawAddress.toString(), buffer.rawAddress.toString(), length.toInt(), returnsingleentry, sidlist.rawAddress.toString(), sidlistlength.toInt(), startsid.rawAddress.toString(), restartscan, lengthreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltQuerySecurityObject(instance: PfltInstance, fileobject: ConstPtr, securityinformation: UInt, securitydescriptor: PsecurityDescriptor, length: UInt, lengthneeded: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltQuerySecurityObject(instance.toString(), fileobject.rawAddress.toString(), securityinformation.toInt(), securitydescriptor.rawAddress.toString(), length.toInt(), lengthneeded.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltQueryVolumeInformation(instance: PfltInstance, iosb: MutPtr, fsinformation: MutPtr, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltQueryVolumeInformation(instance.toString(), iosb.rawAddress.toString(), fsinformation.rawAddress.toString(), length.toInt(), fsinformationclass) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltQueryVolumeInformationFile(instance: PfltInstance, fileobject: ConstPtr, fsinformation: MutPtr, length: UInt, fsinformationclass: FsInformationClass, lengthreturned: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltQueryVolumeInformationFile(instance.toString(), fileobject.rawAddress.toString(), fsinformation.rawAddress.toString(), length.toInt(), fsinformationclass, lengthreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltQueueDeferredIoWorkItem(fltworkitem: PfltDeferredIoWorkitem, data: ConstPtr, workerroutine: PfltDeferredIoWorkitemRoutine, queuetype: WorkQueueType, context: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltQueueDeferredIoWorkItem(fltworkitem.toString(), data.rawAddress.toString(), 0L.toString(), queuetype, context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltQueueGenericWorkItem(fltworkitem: PfltGenericWorkitem, fltobject: ConstPtr, workerroutine: PfltGenericWorkitemRoutine, queuetype: WorkQueueType, context: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltQueueGenericWorkItem(fltworkitem.toString(), fltobject.rawAddress.toString(), 0L.toString(), queuetype, context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltReadFile(initiatinginstance: PfltInstance, fileobject: ConstPtr, byteoffset: ConstPtr, length: UInt, buffer: MutPtr, flags: UInt, bytesread: MutPtr, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltReadFile(initiatinginstance.toString(), fileobject.rawAddress.toString(), byteoffset.rawAddress.toString(), length.toInt(), buffer.rawAddress.toString(), flags.toInt(), bytesread.rawAddress.toString(), 0L.toString(), callbackcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltReadFileEx(initiatinginstance: PfltInstance, fileobject: ConstPtr, byteoffset: ConstPtr, length: UInt, buffer: MutPtr, flags: UInt, bytesread: MutPtr, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: ConstPtr, key: ConstPtr, mdl: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltReadFileEx(initiatinginstance.toString(), fileobject.rawAddress.toString(), byteoffset.rawAddress.toString(), length.toInt(), buffer.rawAddress.toString(), flags.toInt(), bytesread.rawAddress.toString(), 0L.toString(), callbackcontext.rawAddress.toString(), key.rawAddress.toString(), mdl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltReferenceContext(context: PfltContext) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltReferenceContext(context.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltReferenceFileNameInformation(filenameinformation: ConstPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltReferenceFileNameInformation(filenameinformation.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltRegisterFilter(driver: ConstPtr, registration: ConstPtr, retfilter: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltRegisterFilter(driver.rawAddress.toString(), registration.rawAddress.toString(), retfilter.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltRegisterForDataScan(instance: PfltInstance): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltRegisterForDataScan(instance.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltReissueSynchronousIo(initiatinginstance: PfltInstance, callbackdata: ConstPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltReissueSynchronousIo(initiatinginstance.toString(), callbackdata.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltReleaseContext(context: PfltContext) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseContext(context.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltReleaseContexts(contexts: ConstPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseContexts(contexts.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltReleaseContextsEx(contextssize: ULong, contexts: ConstPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseContextsEx(contextssize.toString(), contexts.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltReleaseFileNameInformation(filenameinformation: ConstPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseFileNameInformation(filenameinformation.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltReleasePushLock(pushlock: MutPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltReleasePushLock(pushlock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltReleasePushLockEx(pushlock: MutPtr, flags: UInt) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltReleasePushLockEx(pushlock.rawAddress.toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltReleaseResource(resource: MutPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseResource(resource.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltRemoveExtraCreateParameter(filter: PfltFilter, ecplist: MutPtr, ecptype: ConstPtr, ecpcontext: MutPtr, ecpcontextsize: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltRemoveExtraCreateParameter(filter.toString(), ecplist.rawAddress.toString(), ecptype.rawAddress.toString(), ecpcontext.rawAddress.toString(), ecpcontextsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltRemoveOpenReparseEntry(filter: PfltFilter, data: ConstPtr, openreparseentry: ConstPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltRemoveOpenReparseEntry(filter.toString(), data.rawAddress.toString(), openreparseentry.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltRequestFileInfoOnCreateCompletion(filter: PfltFilter, data: ConstPtr, infoclassflags: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltRequestFileInfoOnCreateCompletion(filter.toString(), data.rawAddress.toString(), infoclassflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltRequestOperationStatusCallback(data: ConstPtr, callbackroutine: PfltGetOperationStatusCallback, requestercontext: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltRequestOperationStatusCallback(data.rawAddress.toString(), 0L.toString(), requestercontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltRetainSwappedBufferMdlAddress(callbackdata: ConstPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltRetainSwappedBufferMdlAddress(callbackdata.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltRetrieveFileInfoOnCreateCompletion(filter: PfltFilter, data: ConstPtr, infoclass: UInt, size: MutPtr): MutPtr =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltRetrieveFileInfoOnCreateCompletion(filter.toString(), data.rawAddress.toString(), infoclass.toInt(), size.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltRetrieveFileInfoOnCreateCompletionEx(filter: PfltFilter, data: ConstPtr, infoclass: UInt, retinfosize: MutPtr, retinfobuffer: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltRetrieveFileInfoOnCreateCompletionEx(filter.toString(), data.rawAddress.toString(), infoclass.toInt(), retinfosize.rawAddress.toString(), retinfobuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltRetrieveIoPriorityInfo(data: ConstPtr, fileobject: ConstPtr, thread: Pethread, priorityinfo: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltRetrieveIoPriorityInfo(data.rawAddress.toString(), fileobject.rawAddress.toString(), thread.toString(), priorityinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltReuseCallbackData(callbackdata: MutPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltReuseCallbackData(callbackdata.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltRollbackComplete(instance: PfltInstance, transaction: ConstPtr, transactioncontext: PfltContext): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltRollbackComplete(instance.toString(), transaction.rawAddress.toString(), transactioncontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltRollbackEnlistment(instance: PfltInstance, transaction: ConstPtr, transactioncontext: PfltContext): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltRollbackEnlistment(instance.toString(), transaction.rawAddress.toString(), transactioncontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSendMessage(filter: PfltFilter, clientport: ConstPtr, senderbuffer: ConstPtr, senderbufferlength: UInt, replybuffer: MutPtr, replylength: MutPtr, timeout: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSendMessage(filter.toString(), clientport.rawAddress.toString(), senderbuffer.rawAddress.toString(), senderbufferlength.toInt(), replybuffer.rawAddress.toString(), replylength.rawAddress.toString(), timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetActivityIdCallbackData(callbackdata: MutPtr, guid: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSetActivityIdCallbackData(callbackdata.rawAddress.toString(), guid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetCallbackDataDirty(data: MutPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSetCallbackDataDirty(data.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltSetCancelCompletion(callbackdata: ConstPtr, canceledcallback: PfltCompleteCanceledCallback): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSetCancelCompletion(callbackdata.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetEaFile(instance: PfltInstance, fileobject: ConstPtr, eabuffer: ConstPtr, length: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSetEaFile(instance.toString(), fileobject.rawAddress.toString(), eabuffer.rawAddress.toString(), length.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetEcpListIntoCallbackData(filter: PfltFilter, callbackdata: ConstPtr, ecplist: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSetEcpListIntoCallbackData(filter.toString(), callbackdata.rawAddress.toString(), ecplist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetFileContext(instance: PfltInstance, fileobject: ConstPtr, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSetFileContext(instance.toString(), fileobject.rawAddress.toString(), operation, newcontext.rawAddress.toString(), oldcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetFsZeroingOffset(data: ConstPtr, zeroingoffset: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSetFsZeroingOffset(data.rawAddress.toString(), zeroingoffset.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetFsZeroingOffsetRequired(data: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSetFsZeroingOffsetRequired(data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetInformationFile(instance: PfltInstance, fileobject: ConstPtr, fileinformation: ConstPtr, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSetInformationFile(instance.toString(), fileobject.rawAddress.toString(), fileinformation.rawAddress.toString(), length.toInt(), fileinformationclass) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetInstanceContext(instance: PfltInstance, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSetInstanceContext(instance.toString(), operation, newcontext.rawAddress.toString(), oldcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetIoPriorityHintIntoCallbackData(data: ConstPtr, priorityhint: IoPriorityHint): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSetIoPriorityHintIntoCallbackData(data.rawAddress.toString(), priorityhint) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetIoPriorityHintIntoFileObject(fileobject: ConstPtr, priorityhint: IoPriorityHint): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSetIoPriorityHintIntoFileObject(fileobject.rawAddress.toString(), priorityhint) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetIoPriorityHintIntoThread(thread: Pethread, priorityhint: IoPriorityHint): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSetIoPriorityHintIntoThread(thread.toString(), priorityhint) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetQuotaInformationFile(instance: PfltInstance, fileobject: ConstPtr, buffer: ConstPtr, length: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSetQuotaInformationFile(instance.toString(), fileobject.rawAddress.toString(), buffer.rawAddress.toString(), length.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetSecurityObject(instance: PfltInstance, fileobject: ConstPtr, securityinformation: UInt, securitydescriptor: PsecurityDescriptor): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSetSecurityObject(instance.toString(), fileobject.rawAddress.toString(), securityinformation.toInt(), securitydescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetStreamContext(instance: PfltInstance, fileobject: ConstPtr, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSetStreamContext(instance.toString(), fileobject.rawAddress.toString(), operation, newcontext.rawAddress.toString(), oldcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetStreamHandleContext(instance: PfltInstance, fileobject: ConstPtr, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSetStreamHandleContext(instance.toString(), fileobject.rawAddress.toString(), operation, newcontext.rawAddress.toString(), oldcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetTransactionContext(instance: PfltInstance, transaction: ConstPtr, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSetTransactionContext(instance.toString(), transaction.rawAddress.toString(), operation, newcontext.rawAddress.toString(), oldcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetVolumeContext(volume: PfltVolume, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSetVolumeContext(volume.toString(), operation, newcontext.rawAddress.toString(), oldcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetVolumeInformation(instance: PfltInstance, iosb: MutPtr, fsinformation: MutPtr, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSetVolumeInformation(instance.toString(), iosb.rawAddress.toString(), fsinformation.rawAddress.toString(), length.toInt(), fsinformationclass) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltStartFiltering(filter: PfltFilter): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltStartFiltering(filter.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSupportsFileContexts(fileobject: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsFileContexts(fileobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSupportsFileContextsEx(fileobject: ConstPtr, instance: PfltInstance): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsFileContextsEx(fileobject.rawAddress.toString(), instance.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSupportsStreamContexts(fileobject: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsStreamContexts(fileobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSupportsStreamHandleContexts(fileobject: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsStreamHandleContexts(fileobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltTagFile(initiatinginstance: PfltInstance, fileobject: ConstPtr, filetag: UInt, guid: ConstPtr, databuffer: ConstPtr, databufferlength: UShort): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltTagFile(initiatinginstance.toString(), fileobject.rawAddress.toString(), filetag.toInt(), guid.rawAddress.toString(), databuffer.rawAddress.toString(), databufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltTagFileEx(initiatinginstance: PfltInstance, fileobject: ConstPtr, filetag: UInt, guid: ConstPtr, databuffer: ConstPtr, databufferlength: UShort, existingfiletag: UInt, existingguid: ConstPtr, flags: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltTagFileEx(initiatinginstance.toString(), fileobject.rawAddress.toString(), filetag.toInt(), guid.rawAddress.toString(), databuffer.rawAddress.toString(), databufferlength.toInt(), existingfiletag.toInt(), existingguid.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltUninitializeFileLock(filelock: ConstPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltUninitializeFileLock(filelock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltUninitializeOplock(oplock: ConstPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltUninitializeOplock(oplock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltUnloadFilter(filtername: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltUnloadFilter(filtername.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltUnregisterFilter(filter: PfltFilter) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltUnregisterFilter(filter.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltUntagFile(initiatinginstance: PfltInstance, fileobject: ConstPtr, filetag: UInt, guid: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltUntagFile(initiatinginstance.toString(), fileobject.rawAddress.toString(), filetag.toInt(), guid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltVetoBypassIo(callbackdata: ConstPtr, fltobjects: ConstPtr, operationstatus: Ntstatus, failurereason: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltVetoBypassIo(callbackdata.rawAddress.toString(), fltobjects.rawAddress.toString(), operationstatus, failurereason.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltWriteFile(initiatinginstance: PfltInstance, fileobject: ConstPtr, byteoffset: ConstPtr, length: UInt, buffer: ConstPtr, flags: UInt, byteswritten: MutPtr, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltWriteFile(initiatinginstance.toString(), fileobject.rawAddress.toString(), byteoffset.rawAddress.toString(), length.toInt(), buffer.rawAddress.toString(), flags.toInt(), byteswritten.rawAddress.toString(), 0L.toString(), callbackcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltWriteFileEx(initiatinginstance: PfltInstance, fileobject: ConstPtr, byteoffset: ConstPtr, length: UInt, buffer: ConstPtr, flags: UInt, byteswritten: MutPtr, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: ConstPtr, key: ConstPtr, mdl: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltWriteFileEx(initiatinginstance.toString(), fileobject.rawAddress.toString(), byteoffset.rawAddress.toString(), length.toInt(), buffer.rawAddress.toString(), flags.toInt(), byteswritten.rawAddress.toString(), 0L.toString(), callbackcontext.rawAddress.toString(), key.rawAddress.toString(), mdl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltpTraceRedirectedFileIo(originatingfileobject: ConstPtr, childcallbackdata: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMinifiltersFltpTraceRedirectedFileIo(originatingfileobject.rawAddress.toString(), childcallbackdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
