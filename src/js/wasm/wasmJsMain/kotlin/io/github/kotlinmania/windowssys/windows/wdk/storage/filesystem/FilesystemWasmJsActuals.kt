@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.wdk.foundation.AccessState
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DeviceObject
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DriverFsNotification
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DriverObject
import io.github.kotlinmania.windowssys.windows.wdk.foundation.EcpHeader
import io.github.kotlinmania.windowssys.windows.wdk.foundation.EcpList
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Eresource
import io.github.kotlinmania.windowssys.windows.wdk.foundation.FileObject
import io.github.kotlinmania.windowssys.windows.wdk.foundation.IoStackLocation
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Irp
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Kevent
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Kmutant
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Kqueue
import io.github.kotlinmania.windowssys.windows.wdk.foundation.KspinLockQueueNumber
import io.github.kotlinmania.windowssys.windows.wdk.foundation.KwaitBlock
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Mdl
import io.github.kotlinmania.windowssys.windows.wdk.foundation.ObjectAttributes
import io.github.kotlinmania.windowssys.windows.wdk.foundation.ObjectInformationClass
import io.github.kotlinmania.windowssys.windows.wdk.foundation.ObjectNameInformation
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Peprocess
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pesilo
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pethread
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pkthread
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PnotifySync
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PobjectType
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PoolType
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Prkprocess
import io.github.kotlinmania.windowssys.windows.wdk.foundation.SectionObjectPointers
import io.github.kotlinmania.windowssys.windows.wdk.foundation.SecuritySubjectContext
import io.github.kotlinmania.windowssys.windows.wdk.foundation.SspiAsyncContext
import io.github.kotlinmania.windowssys.windows.wdk.foundation.TargetDeviceCustomNotification
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Vpb
import io.github.kotlinmania.windowssys.windows.wdk.foundation.WorkQueueItem
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString
import io.github.kotlinmania.windowssys.windows.win32.security.Acl
import io.github.kotlinmania.windowssys.windows.win32.security.AuditEventType
import io.github.kotlinmania.windowssys.windows.win32.security.GenericMapping
import io.github.kotlinmania.windowssys.windows.win32.security.ObjectTypeList
import io.github.kotlinmania.windowssys.windows.win32.security.PrivilegeSet
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.SeImpersonationState
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityImpersonationLevel
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityQualityOfService
import io.github.kotlinmania.windowssys.windows.win32.security.SidIdentifierAuthority
import io.github.kotlinmania.windowssys.windows.win32.security.SidNameUse
import io.github.kotlinmania.windowssys.windows.win32.security.TokenAccessInformation
import io.github.kotlinmania.windowssys.windows.win32.security.TokenGroups
import io.github.kotlinmania.windowssys.windows.win32.security.TokenInformationClass
import io.github.kotlinmania.windowssys.windows.win32.security.TokenPrivileges
import io.github.kotlinmania.windowssys.windows.win32.security.TokenType
import io.github.kotlinmania.windowssys.windows.win32.security.WellKnownSidType
import io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.SeAdtParameterArray
import io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.SecGetKeyFn
import io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.SecurityUserData
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileAccessRights
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileFlagsAndAttributes
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileShareMode
import io.github.kotlinmania.windowssys.windows.win32.system.io.IoStatusBlock
import io.github.kotlinmania.windowssys.windows.win32.system.io.PioApcRoutine
import io.github.kotlinmania.windowssys.windows.win32.system.ioctl.IoIrpExtTrackOffsetHeader
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.EventType
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.ListEntry
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.WaitType
import io.github.kotlinmania.windowssys.windows.win32.system.memory.MemExtendedParameter

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWdkStorageFilesystemNapiAddon(): Boolean

private val windowsWdkStorageFilesystemNapiAvailable: Boolean = initWindowsWdkStorageFilesystemNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemApplyControlToken(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemApplyControlToken(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcAsyncCopyRead(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcAsyncCopyRead(p0: String, p1: String, p2: Int, p3: Boolean, p4: String, p5: String, p6: String, p7: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcCanIWrite(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcCanIWrite(p0: String, p1: Int, p2: Boolean, p3: Int): Boolean

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcCoherencyFlushAndPurgeCache(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcCoherencyFlushAndPurgeCache(p0: String, p1: String, p2: Int, p3: String, p4: Int)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcCopyRead(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcCopyRead(p0: String, p1: String, p2: Int, p3: Boolean, p4: String, p5: String): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcCopyReadEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcCopyReadEx(p0: String, p1: String, p2: Int, p3: Boolean, p4: String, p5: String, p6: String): Boolean

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcCopyWrite(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcCopyWrite(p0: String, p1: String, p2: Int, p3: Boolean, p4: String): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcCopyWriteEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcCopyWriteEx(p0: String, p1: String, p2: Int, p3: Boolean, p4: String, p5: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcCopyWriteWontFlush(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcCopyWriteWontFlush(p0: String, p1: String, p2: Int): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcDeferWrite(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcDeferWrite(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Boolean)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcErrorCallbackRoutine(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcErrorCallbackRoutine(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcFastCopyRead(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcFastCopyRead(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcFastCopyWrite(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcFastCopyWrite(p0: String, p1: Int, p2: Int, p3: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcFlushCache(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcFlushCache(p0: String, p1: String, p2: Int, p3: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcGetDirtyPages(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcGetDirtyPages(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcGetFileObjectFromBcb(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcGetFileObjectFromBcb(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcGetFileObjectFromSectionPtrs(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcGetFileObjectFromSectionPtrs(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcGetFileObjectFromSectionPtrsRef(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcGetFileObjectFromSectionPtrsRef(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcGetFlushedValidData(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcGetFlushedValidData(p0: String, p1: Boolean): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcInitializeCacheMap(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcInitializeCacheMap(p0: String, p1: String, p2: Boolean, p3: String, p4: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcInitializeCacheMapEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcInitializeCacheMapEx(p0: String, p1: String, p2: Boolean, p3: String, p4: String, p5: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcIsCacheManagerCallbackNeeded(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcIsCacheManagerCallbackNeeded(p0: Int): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcIsThereDirtyData(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcIsThereDirtyData(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcIsThereDirtyDataEx(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcIsThereDirtyDataEx(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcMapData(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcMapData(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Boolean

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcMdlRead(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcMdlRead(p0: String, p1: String, p2: Int, p3: String, p4: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcMdlReadComplete(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcMdlReadComplete(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcMdlWriteAbort(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcMdlWriteAbort(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcMdlWriteComplete(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcMdlWriteComplete(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcPinMappedData(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcPinMappedData(p0: String, p1: String, p2: Int, p3: Int, p4: String): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcPinRead(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcPinRead(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Boolean

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcPrepareMdlWrite(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcPrepareMdlWrite(p0: String, p1: String, p2: Int, p3: String, p4: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcPreparePinWrite(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcPreparePinWrite(p0: String, p1: String, p2: Int, p3: Boolean, p4: Int, p5: String, p6: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcPurgeCacheSection(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcPurgeCacheSection(p0: String, p1: String, p2: Int, p3: Int): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcRemapBcb(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcRemapBcb(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcRepinBcb(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcRepinBcb(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcScheduleReadAhead(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcScheduleReadAhead(p0: String, p1: String, p2: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcScheduleReadAheadEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcScheduleReadAheadEx(p0: String, p1: String, p2: Int, p3: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcSetAdditionalCacheAttributes(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcSetAdditionalCacheAttributes(p0: String, p1: Boolean, p2: Boolean)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcSetAdditionalCacheAttributesEx(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcSetAdditionalCacheAttributesEx(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcSetBcbOwnerPointer(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcSetBcbOwnerPointer(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcSetDirtyPageThreshold(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcSetDirtyPageThreshold(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcSetDirtyPinnedData(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcSetDirtyPinnedData(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcSetFileSizes(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcSetFileSizes(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcSetFileSizesEx(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcSetFileSizesEx(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcSetLogHandleForFile(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcSetLogHandleForFile(p0: String, p1: String, p2: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcSetParallelFlushFile(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcSetParallelFlushFile(p0: String, p1: Boolean)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcSetReadAheadGranularity(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcSetReadAheadGranularity(p0: String, p1: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcUninitializeCacheMap(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcUninitializeCacheMap(p0: String, p1: String, p2: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcUnpinData(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcUnpinData(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcUnpinDataForThread(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcUnpinDataForThread(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcUnpinRepinnedBcb(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcUnpinRepinnedBcb(p0: String, p1: Boolean, p2: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcWaitForCurrentLazyWriterActivity()")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcWaitForCurrentLazyWriterActivity(): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCcZeroData(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCcZeroData(p0: String, p1: String, p2: String, p3: Boolean): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemCompleteAuthToken(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemCompleteAuthToken(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemExDisableResourceBoostLite(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemExDisableResourceBoostLite(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemExQueryPoolBlockSize(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemExQueryPoolBlockSize(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemExportSecurityContext(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemExportSecurityContext(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlAcknowledgeEcp(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlAcknowledgeEcp(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlAcquireFileExclusive(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlAcquireFileExclusive(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlAddBaseMcbEntry(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlAddBaseMcbEntry(p0: String, p1: String, p2: String, p3: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlAddBaseMcbEntryEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlAddBaseMcbEntryEx(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlAddLargeMcbEntry(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlAddLargeMcbEntry(p0: String, p1: String, p2: String, p3: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlAddMcbEntry(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlAddMcbEntry(p0: String, p1: Int, p2: Int, p3: Int): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlAddToTunnelCache(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlAddToTunnelCache(p0: String, p1: String, p2: String, p3: String, p4: Boolean, p5: Int, p6: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlAddToTunnelCacheEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlAddToTunnelCacheEx(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlAllocateAePushLock(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlAllocateAePushLock(p0: Int, p1: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlAllocateExtraCreateParameter(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlAllocateExtraCreateParameter(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlAllocateExtraCreateParameterFromLookasideList(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlAllocateExtraCreateParameterFromLookasideList(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlAllocateExtraCreateParameterList(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlAllocateExtraCreateParameterList(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlAllocateFileLock(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlAllocateFileLock(p0: String, p1: String): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlAllocateResource()")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlAllocateResource(): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlAreNamesEqual(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlAreNamesEqual(p0: String, p1: String, p2: Boolean, p3: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlAreThereCurrentOrInProgressFileLocks(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlAreThereCurrentOrInProgressFileLocks(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlAreThereWaitingFileLocks(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlAreThereWaitingFileLocks(p0: String): Boolean

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlAreVolumeStartupApplicationsComplete()")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlAreVolumeStartupApplicationsComplete(): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlBalanceReads(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlBalanceReads(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlCancellableWaitForMultipleObjects(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlCancellableWaitForMultipleObjects(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlCancellableWaitForSingleObject(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlCancellableWaitForSingleObject(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlChangeBackingFileObject(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlChangeBackingFileObject(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlCheckLockForOplockRequest(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlCheckLockForOplockRequest(p0: String, p1: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlCheckLockForReadAccess(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlCheckLockForReadAccess(p0: String, p1: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlCheckLockForWriteAccess(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlCheckLockForWriteAccess(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlCheckOplock(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlCheckOplock(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlCheckOplockEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlCheckOplockEx(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlCheckOplockEx2(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlCheckOplockEx2(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlCheckUpperOplock(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlCheckUpperOplock(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlCopyRead(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlCopyRead(p0: String, p1: String, p2: Int, p3: Boolean, p4: Int, p5: String, p6: String, p7: String): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlCopyWrite(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlCopyWrite(p0: String, p1: String, p2: Int, p3: Boolean, p4: Int, p5: String, p6: String, p7: String): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlCreateSectionForDataScan(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlCreateSectionForDataScan(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: Int, p8: Int, p9: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlCurrentBatchOplock(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlCurrentBatchOplock(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlCurrentOplock(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlCurrentOplock(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlCurrentOplockH(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlCurrentOplockH(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlDeleteExtraCreateParameterLookasideList(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlDeleteExtraCreateParameterLookasideList(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlDeleteKeyFromTunnelCache(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlDeleteKeyFromTunnelCache(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlDeleteTunnelCache(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlDeleteTunnelCache(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlDeregisterUncProvider(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlDeregisterUncProvider(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlDismountComplete(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlDismountComplete(p0: String, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlDoesDbcsContainWildCards(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlDoesDbcsContainWildCards(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlDoesNameContainWildCards(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlDoesNameContainWildCards(p0: String): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlFastCheckLockForRead(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlFastCheckLockForRead(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlFastCheckLockForWrite(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlFastCheckLockForWrite(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlFastUnlockAll(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlFastUnlockAll(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlFastUnlockAllByKey(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlFastUnlockAllByKey(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlFastUnlockSingle(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlFastUnlockSingle(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String, p7: Boolean): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlFindExtraCreateParameter(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlFindExtraCreateParameter(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlFindInTunnelCache(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlFindInTunnelCache(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlFindInTunnelCacheEx(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlFindInTunnelCacheEx(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String, p7: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlFreeAePushLock(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlFreeAePushLock(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlFreeExtraCreateParameter(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlFreeExtraCreateParameter(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlFreeExtraCreateParameterList(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlFreeExtraCreateParameterList(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlFreeFileLock(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlFreeFileLock(p0: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlGetCurrentProcessLoaderList()")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlGetCurrentProcessLoaderList(): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlGetEcpListFromIrp(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlGetEcpListFromIrp(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlGetFileSize(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlGetFileSize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlGetNextBaseMcbEntry(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlGetNextBaseMcbEntry(p0: String, p1: Int, p2: String, p3: String, p4: String): Boolean

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlGetNextExtraCreateParameter(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlGetNextExtraCreateParameter(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlGetNextFileLock(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlGetNextFileLock(p0: String, p1: Boolean): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlGetNextLargeMcbEntry(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlGetNextLargeMcbEntry(p0: String, p1: Int, p2: String, p3: String, p4: String): Boolean

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlGetNextMcbEntry(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlGetNextMcbEntry(p0: String, p1: Int, p2: String, p3: String, p4: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlGetSectorSizeInformation(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlGetSectorSizeInformation(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlGetSupportedFeatures(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlGetSupportedFeatures(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlGetVirtualDiskNestingLevel(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlGetVirtualDiskNestingLevel(p0: String, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastMdlReadWait()")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastMdlReadWait()

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadNoWait()")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadNoWait()

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadNotPossible()")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadNotPossible()

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadResourceMiss()")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadResourceMiss()

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadWait()")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadWait()

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlInitExtraCreateParameterLookasideList(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlInitExtraCreateParameterLookasideList(p0: String, p1: Int, p2: String, p3: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlInitializeBaseMcb(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlInitializeBaseMcb(p0: String, p1: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlInitializeBaseMcbEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlInitializeBaseMcbEx(p0: String, p1: Int, p2: Int): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlInitializeExtraCreateParameter(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlInitializeExtraCreateParameter(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlInitializeExtraCreateParameterList(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlInitializeExtraCreateParameterList(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlInitializeFileLock(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlInitializeFileLock(p0: String, p1: String, p2: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlInitializeLargeMcb(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlInitializeLargeMcb(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlInitializeMcb(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlInitializeMcb(p0: String, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlInitializeOplock(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlInitializeOplock(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlInitializeTunnelCache(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlInitializeTunnelCache(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlInsertExtraCreateParameter(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlInsertExtraCreateParameter(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlInsertPerFileContext(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlInsertPerFileContext(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlInsertPerFileObjectContext(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlInsertPerFileObjectContext(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlInsertPerStreamContext(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlInsertPerStreamContext(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlIs32BitProcess(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlIs32BitProcess(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlIsDaxVolume(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlIsDaxVolume(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlIsDbcsInExpression(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlIsDbcsInExpression(p0: String, p1: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlIsEcpAcknowledged(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlIsEcpAcknowledged(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlIsEcpFromUserMode(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlIsEcpFromUserMode(p0: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlIsExtentDangling(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlIsExtentDangling(p0: Int, p1: Int, p2: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlIsMobileOS()")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlIsMobileOS(): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlIsNameInExpression(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlIsNameInExpression(p0: String, p1: String, p2: Boolean, p3: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlIsNameInUnUpcasedExpression(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlIsNameInUnUpcasedExpression(p0: String, p1: String, p2: Boolean, p3: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlIsNonEmptyDirectoryReparsePointAllowed(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlIsNonEmptyDirectoryReparsePointAllowed(p0: Int): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlIsNtstatusExpected(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlIsNtstatusExpected(p0: Int): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlIsPagingFile(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlIsPagingFile(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlIsSystemPagingFile(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlIsSystemPagingFile(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlIssueDeviceIoControl(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlIssueDeviceIoControl(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlKernelFsControlFile(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlKernelFsControlFile(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlLogCcFlushError(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlLogCcFlushError(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlLookupBaseMcbEntry(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlLookupBaseMcbEntry(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlLookupLargeMcbEntry(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlLookupLargeMcbEntry(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlLookupLastBaseMcbEntry(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlLookupLastBaseMcbEntry(p0: String, p1: String, p2: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlLookupLastBaseMcbEntryAndIndex(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlLookupLastBaseMcbEntryAndIndex(p0: String, p1: String, p2: String, p3: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlLookupLastLargeMcbEntry(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlLookupLastLargeMcbEntry(p0: String, p1: String, p2: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlLookupLastLargeMcbEntryAndIndex(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlLookupLastLargeMcbEntryAndIndex(p0: String, p1: String, p2: String, p3: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlLookupLastMcbEntry(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlLookupLastMcbEntry(p0: String, p1: String, p2: String): Boolean

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlLookupMcbEntry(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlLookupMcbEntry(p0: String, p1: Int, p2: String, p3: String, p4: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlLookupPerFileContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlLookupPerFileContext(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlLookupPerFileObjectContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlLookupPerFileObjectContext(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlLookupPerStreamContextInternal(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlLookupPerStreamContextInternal(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlMdlReadCompleteDev(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlMdlReadCompleteDev(p0: String, p1: String, p2: String): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlMdlReadDev(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlMdlReadDev(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlMdlReadEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlMdlReadEx(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlMdlWriteCompleteDev(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlMdlWriteCompleteDev(p0: String, p1: String, p2: String, p3: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlMupGetProviderIdFromName(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlMupGetProviderIdFromName(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlMupGetProviderInfoFromFileObject(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlMupGetProviderInfoFromFileObject(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlNormalizeNtstatus(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlNormalizeNtstatus(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlNotifyCleanup(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlNotifyCleanup(p0: String, p1: String, p2: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlNotifyCleanupAll(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlNotifyCleanupAll(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlNotifyFilterChangeDirectory(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlNotifyFilterChangeDirectory(p0: String, p1: String, p2: String, p3: String, p4: Boolean, p5: Boolean, p6: Int, p7: String, p8: String, p9: String, p10: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlNotifyFilterReportChange(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlNotifyFilterReportChange(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: Int, p7: Int, p8: String, p9: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlNotifyFullChangeDirectory(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlNotifyFullChangeDirectory(p0: String, p1: String, p2: String, p3: String, p4: Boolean, p5: Boolean, p6: Int, p7: String, p8: String, p9: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlNotifyFullReportChange(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlNotifyFullReportChange(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: Int, p7: Int, p8: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlNotifyInitializeSync(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlNotifyInitializeSync(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlNotifyUninitializeSync(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlNotifyUninitializeSync(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlNotifyVolumeEvent(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlNotifyVolumeEvent(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlNotifyVolumeEventEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlNotifyVolumeEventEx(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlNumberOfRunsInBaseMcb(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlNumberOfRunsInBaseMcb(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlNumberOfRunsInLargeMcb(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlNumberOfRunsInLargeMcb(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlNumberOfRunsInMcb(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlNumberOfRunsInMcb(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlOplockBreakH(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlOplockBreakH(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlOplockBreakH2(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlOplockBreakH2(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlOplockBreakToNone(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlOplockBreakToNone(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlOplockBreakToNoneEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlOplockBreakToNoneEx(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlOplockFsctrl(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlOplockFsctrl(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlOplockFsctrlEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlOplockFsctrlEx(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlOplockGetAnyBreakOwnerProcess(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlOplockGetAnyBreakOwnerProcess(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlOplockIsFastIoPossible(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlOplockIsFastIoPossible(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlOplockIsSharedRequest(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlOplockIsSharedRequest(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlOplockKeysEqual(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlOplockKeysEqual(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlPostPagingFileStackOverflow(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlPostPagingFileStackOverflow(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlPostStackOverflow(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlPostStackOverflow(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlPrepareMdlWriteDev(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlPrepareMdlWriteDev(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlPrepareMdlWriteEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlPrepareMdlWriteEx(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlPrepareToReuseEcp(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlPrepareToReuseEcp(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlPrivateLock(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlPrivateLock(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: Boolean, p7: Boolean, p8: String, p9: String, p10: String, p11: Boolean): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlProcessFileLock(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlProcessFileLock(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlQueryCachedVdl(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlQueryCachedVdl(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlQueryInformationFile(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlQueryInformationFile(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlQueryKernelEaFile(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlQueryKernelEaFile(p0: String, p1: String, p2: Int, p3: Boolean, p4: String, p5: Int, p6: String, p7: Boolean, p8: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlQueryMaximumVirtualDiskNestingLevel()")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlQueryMaximumVirtualDiskNestingLevel(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlRegisterFileSystemFilterCallbacks(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlRegisterFileSystemFilterCallbacks(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlRegisterUncProvider(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlRegisterUncProvider(p0: String, p1: String, p2: Boolean): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlRegisterUncProviderEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlRegisterUncProviderEx(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlRegisterUncProviderEx2(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlRegisterUncProviderEx2(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlReleaseFile(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlReleaseFile(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlRemoveBaseMcbEntry(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlRemoveBaseMcbEntry(p0: String, p1: String, p2: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlRemoveDotsFromPath(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlRemoveDotsFromPath(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlRemoveExtraCreateParameter(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlRemoveExtraCreateParameter(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlRemoveLargeMcbEntry(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlRemoveLargeMcbEntry(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlRemoveMcbEntry(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlRemoveMcbEntry(p0: String, p1: Int, p2: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlRemovePerFileContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlRemovePerFileContext(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlRemovePerFileObjectContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlRemovePerFileObjectContext(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlRemovePerStreamContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlRemovePerStreamContext(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlResetBaseMcb(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlResetBaseMcb(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlResetLargeMcb(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlResetLargeMcb(p0: String, p1: Boolean)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlSetDriverBacking(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlSetDriverBacking(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlSetEcpListIntoIrp(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlSetEcpListIntoIrp(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlSetKernelEaFile(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlSetKernelEaFile(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlSplitBaseMcb(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlSplitBaseMcb(p0: String, p1: String, p2: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlSplitLargeMcb(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlSplitLargeMcb(p0: String, p1: String, p2: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlTeardownPerFileContexts(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlTeardownPerFileContexts(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlTeardownPerStreamContexts(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlTeardownPerStreamContexts(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlTruncateBaseMcb(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlTruncateBaseMcb(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlTruncateLargeMcb(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlTruncateLargeMcb(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlTruncateMcb(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlTruncateMcb(p0: String, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlUninitializeBaseMcb(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlUninitializeBaseMcb(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlUninitializeFileLock(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlUninitializeFileLock(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlUninitializeLargeMcb(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlUninitializeLargeMcb(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlUninitializeMcb(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlUninitializeMcb(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlUninitializeOplock(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlUninitializeOplock(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlUpdateDiskCounters(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlUpdateDiskCounters(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlUpperOplockFsctrl(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlUpperOplockFsctrl(p0: String, p1: String, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlValidateReparsePointBuffer(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlValidateReparsePointBuffer(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemFsRtlVolumeDeviceToCorrelationId(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemFsRtlVolumeDeviceToCorrelationId(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemGetSecurityUserInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemGetSecurityUserInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoAcquireVpbSpinLock(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoAcquireVpbSpinLock(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoApplyPriorityInfoThread(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoApplyPriorityInfoThread(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoCheckDesiredAccess(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoCheckDesiredAccess(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoCheckEaBufferValidity(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoCheckEaBufferValidity(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoCheckFunctionAccess(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoCheckFunctionAccess(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoCheckQuerySetFileInformation(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoCheckQuerySetFileInformation(p0: Int, p1: Int, p2: Boolean): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoCheckQuerySetVolumeInformation(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoCheckQuerySetVolumeInformation(p0: Int, p1: Int, p2: Boolean): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoCheckQuotaBufferValidity(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoCheckQuotaBufferValidity(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoClearFsTrackOffsetState(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoClearFsTrackOffsetState(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoCreateStreamFileObject(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoCreateStreamFileObject(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoCreateStreamFileObjectEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoCreateStreamFileObjectEx(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoCreateStreamFileObjectEx2(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoCreateStreamFileObjectEx2(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoCreateStreamFileObjectLite(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoCreateStreamFileObjectLite(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoEnumerateDeviceObjectList(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoEnumerateDeviceObjectList(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoEnumerateRegisteredFiltersList(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoEnumerateRegisteredFiltersList(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoFastQueryNetworkAttributes(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoFastQueryNetworkAttributes(p0: String, p1: Int, p2: Int, p3: String, p4: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoGetAttachedDevice(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoGetAttachedDevice(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoGetBaseFileSystemDeviceObject(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoGetBaseFileSystemDeviceObject(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoGetDeviceAttachmentBaseRef(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoGetDeviceAttachmentBaseRef(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoGetDeviceToVerify(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoGetDeviceToVerify(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoGetDiskDeviceObject(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoGetDiskDeviceObject(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoGetFsTrackOffsetState(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoGetFsTrackOffsetState(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoGetLowerDeviceObject(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoGetLowerDeviceObject(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoGetOplockKeyContext(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoGetOplockKeyContext(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoGetOplockKeyContextEx(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoGetOplockKeyContextEx(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoGetRequestorProcess(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoGetRequestorProcess(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoGetRequestorProcessId(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoGetRequestorProcessId(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoGetRequestorSessionId(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoGetRequestorSessionId(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoIrpHasFsTrackOffsetExtensionType(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoIrpHasFsTrackOffsetExtensionType(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoIsOperationSynchronous(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoIsOperationSynchronous(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoIsSystemThread(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoIsSystemThread(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoIsValidNameGraftingBuffer(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoIsValidNameGraftingBuffer(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoPageRead(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoPageRead(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoQueryFileDosDeviceName(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoQueryFileDosDeviceName(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoQueryFileInformation(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoQueryFileInformation(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoQueryVolumeInformation(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoQueryVolumeInformation(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoQueueThreadIrp(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoQueueThreadIrp(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoRegisterFileSystem(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoRegisterFileSystem(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoReleaseVpbSpinLock(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoReleaseVpbSpinLock(p0: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoReplaceFileObjectName(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoReplaceFileObjectName(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoRequestDeviceRemovalForReset(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoRequestDeviceRemovalForReset(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoRetrievePriorityInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoRetrievePriorityInfo(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoSetDeviceToVerify(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoSetDeviceToVerify(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoSetFsTrackOffsetState(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoSetFsTrackOffsetState(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoSetInformation(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoSetInformation(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoSynchronousPageWrite(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoSynchronousPageWrite(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoThreadToProcess(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoThreadToProcess(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoUnregisterFileSystem(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoUnregisterFileSystem(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemIoVerifyVolume(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemIoVerifyVolume(p0: String, p1: Boolean): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemKeAcquireQueuedSpinLock(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemKeAcquireQueuedSpinLock(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemKeAcquireSpinLockRaiseToSynch(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemKeAcquireSpinLockRaiseToSynch(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemKeAttachProcess(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemKeAttachProcess(p0: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemKeDetachProcess()")
private external fun wasmWindowssysWindowsWdkStorageFilesystemKeDetachProcess()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemKeInitializeMutant(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemKeInitializeMutant(p0: String, p1: Boolean)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemKeInitializeQueue(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemKeInitializeQueue(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemKeInsertHeadQueue(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemKeInsertHeadQueue(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemKeInsertQueue(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemKeInsertQueue(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemKeReadStateMutant(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemKeReadStateMutant(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemKeReadStateQueue(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemKeReadStateQueue(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemKeReleaseMutant(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemKeReleaseMutant(p0: String, p1: Int, p2: Boolean, p3: Boolean): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemKeReleaseQueuedSpinLock(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemKeReleaseQueuedSpinLock(p0: Int, p1: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemKeRemoveQueue(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemKeRemoveQueue(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemKeRemoveQueueEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemKeRemoveQueueEx(p0: String, p1: Int, p2: Boolean, p3: String, p4: String, p5: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemKeRundownQueue(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemKeRundownQueue(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemKeSetIdealProcessorThread(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemKeSetIdealProcessorThread(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemKeSetKernelStackSwapEnable(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemKeSetKernelStackSwapEnable(p0: Boolean): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemKeStackAttachProcess(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemKeStackAttachProcess(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemKeTryToAcquireQueuedSpinLock(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemKeTryToAcquireQueuedSpinLock(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemKeUnstackDetachProcess(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemKeUnstackDetachProcess(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMakeSignature(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMakeSignature(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMapSecurityError(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMapSecurityError(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMmCanFileBeTruncated(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMmCanFileBeTruncated(p0: String, p1: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMmDoesFileHaveUserWritableReferences(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMmDoesFileHaveUserWritableReferences(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMmFlushImageSection(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMmFlushImageSection(p0: String, p1: Int): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMmForceSectionClosed(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMmForceSectionClosed(p0: String, p1: Boolean): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMmForceSectionClosedEx(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMmForceSectionClosedEx(p0: String, p1: Int): Boolean

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMmGetMaximumFileSectionSize()")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMmGetMaximumFileSectionSize(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMmIsFileSectionActive(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMmIsFileSectionActive(p0: String, p1: Int, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMmIsRecursiveIoFault()")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMmIsRecursiveIoFault(): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMmMdlPagesAreZero(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMmMdlPagesAreZero(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMmPrefetchPages(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMmPrefetchPages(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemMmSetAddressRangeModified(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemMmSetAddressRangeModified(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtAccessCheckAndAuditAlarm(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtAccessCheckAndAuditAlarm(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String, p7: Boolean, p8: String, p9: String, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtAccessCheckByTypeAndAuditAlarm(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtAccessCheckByTypeAndAuditAlarm(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: Int, p8: Int, p9: String, p10: Int, p11: String, p12: Boolean, p13: String, p14: String, p15: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtAccessCheckByTypeResultListAndAuditAlarm(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtAccessCheckByTypeResultListAndAuditAlarm(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: Int, p8: Int, p9: String, p10: Int, p11: String, p12: Boolean, p13: String, p14: String, p15: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtAccessCheckByTypeResultListAndAuditAlarmByHandle(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtAccessCheckByTypeResultListAndAuditAlarmByHandle(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int, p8: Int, p9: Int, p10: String, p11: Int, p12: String, p13: Boolean, p14: String, p15: String, p16: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtAdjustGroupsToken(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtAdjustGroupsToken(p0: String, p1: Boolean, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtAdjustPrivilegesToken(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtAdjustPrivilegesToken(p0: String, p1: Boolean, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtAllocateVirtualMemory(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtAllocateVirtualMemory(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtAllocateVirtualMemoryEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtAllocateVirtualMemoryEx(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtCancelIoFileEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtCancelIoFileEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtCloseObjectAuditAlarm(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtCloseObjectAuditAlarm(p0: String, p1: String, p2: Boolean): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtCreateDirectoryObject(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtCreateDirectoryObject(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtCreateEvent(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtCreateEvent(p0: String, p1: Int, p2: String, p3: Int, p4: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtCreateFile(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtCreateFile(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: Int, p7: Int, p8: Int, p9: String, p10: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtCreateSection(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtCreateSection(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtCreateSectionEx(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtCreateSectionEx(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: Int, p6: String, p7: String, p8: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtDeleteFile(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtDeleteFile(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtDeleteObjectAuditAlarm(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtDeleteObjectAuditAlarm(p0: String, p1: String, p2: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtDuplicateObject(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtDuplicateObject(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtDuplicateToken(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtDuplicateToken(p0: String, p1: Int, p2: String, p3: Boolean, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtFilterToken(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtFilterToken(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtFlushBuffersFile(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtFlushBuffersFile(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtFlushBuffersFileEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtFlushBuffersFileEx(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtFlushVirtualMemory(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtFlushVirtualMemory(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtFreeVirtualMemory(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtFreeVirtualMemory(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtFsControlFile(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtFsControlFile(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String, p7: Int, p8: String, p9: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtImpersonateAnonymousToken(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtImpersonateAnonymousToken(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtLockFile(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtLockFile(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int, p8: Boolean, p9: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtNotifyChangeKey(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtNotifyChangeKey(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: Boolean, p7: String, p8: Int, p9: Boolean): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtOpenDirectoryObject(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtOpenDirectoryObject(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtOpenFile(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtOpenFile(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtOpenObjectAuditAlarm(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtOpenObjectAuditAlarm(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: Int, p8: String, p9: Boolean, p10: Boolean, p11: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtOpenProcessToken(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtOpenProcessToken(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtOpenProcessTokenEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtOpenProcessTokenEx(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtOpenSymbolicLinkObject(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtOpenSymbolicLinkObject(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtOpenThreadToken(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtOpenThreadToken(p0: String, p1: Int, p2: Boolean, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtOpenThreadTokenEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtOpenThreadTokenEx(p0: String, p1: Int, p2: Boolean, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtPrivilegeCheck(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtPrivilegeCheck(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtPrivilegeObjectAuditAlarm(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtPrivilegeObjectAuditAlarm(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtPrivilegedServiceAuditAlarm(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtPrivilegedServiceAuditAlarm(p0: String, p1: String, p2: String, p3: String, p4: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtQueryDirectoryFile(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtQueryDirectoryFile(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: Int, p8: Boolean, p9: String, p10: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtQueryDirectoryFileEx(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtQueryDirectoryFileEx(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: Int, p8: Int, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtQueryDirectoryObject(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtQueryDirectoryObject(p0: String, p1: String, p2: Int, p3: Boolean, p4: Boolean, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtQueryEaFile(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtQueryEaFile(p0: String, p1: String, p2: String, p3: Int, p4: Boolean, p5: String, p6: Int, p7: String, p8: Boolean): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtQueryFullAttributesFile(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtQueryFullAttributesFile(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtQueryInformationByName(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtQueryInformationByName(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtQueryInformationFile(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtQueryInformationFile(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtQueryInformationToken(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtQueryInformationToken(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtQueryQuotaInformationFile(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtQueryQuotaInformationFile(p0: String, p1: String, p2: String, p3: Int, p4: Boolean, p5: String, p6: Int, p7: String, p8: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtQuerySecurityObject(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtQuerySecurityObject(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtQuerySymbolicLinkObject(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtQuerySymbolicLinkObject(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtQueryVirtualMemory(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtQueryVirtualMemory(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtQueryVolumeInformationFile(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtQueryVolumeInformationFile(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtReadFile(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtReadFile(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtSetEaFile(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtSetEaFile(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtSetEvent(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtSetEvent(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtSetInformationFile(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtSetInformationFile(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtSetInformationToken(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtSetInformationToken(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtSetInformationVirtualMemory(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtSetInformationVirtualMemory(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtSetQuotaInformationFile(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtSetQuotaInformationFile(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtSetSecurityObject(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtSetSecurityObject(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtSetVolumeInformationFile(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtSetVolumeInformationFile(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtUnlockFile(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtUnlockFile(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemNtWriteFile(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemNtWriteFile(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemObInsertObject(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemObInsertObject(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemObIsKernelHandle(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemObIsKernelHandle(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemObMakeTemporaryObject(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemObMakeTemporaryObject(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemObOpenObjectByPointer(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemObOpenObjectByPointer(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemObOpenObjectByPointerWithTag(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemObOpenObjectByPointerWithTag(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemObQueryNameString(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemObQueryNameString(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemObQueryObjectAuditingByHandle(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemObQueryObjectAuditingByHandle(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemPfxFindPrefix(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemPfxFindPrefix(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemPfxInitialize(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemPfxInitialize(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemPfxInsertPrefix(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemPfxInsertPrefix(p0: String, p1: String, p2: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemPfxRemovePrefix(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemPfxRemovePrefix(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemPoQueueShutdownWorkItem(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemPoQueueShutdownWorkItem(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemPsAssignImpersonationToken(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemPsAssignImpersonationToken(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemPsChargePoolQuota(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemPsChargePoolQuota(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemPsChargeProcessPoolQuota(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemPsChargeProcessPoolQuota(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemPsDereferenceImpersonationToken(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemPsDereferenceImpersonationToken(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemPsDereferencePrimaryToken(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemPsDereferencePrimaryToken(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemPsDisableImpersonation(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemPsDisableImpersonation(p0: String, p1: String): Boolean

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemPsGetProcessExitTime()")
private external fun wasmWindowssysWindowsWdkStorageFilesystemPsGetProcessExitTime(): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemPsGetThreadProcess(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemPsGetThreadProcess(p0: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemPsImpersonateClient(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemPsImpersonateClient(p0: String, p1: String, p2: Boolean, p3: Boolean, p4: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemPsIsDiskCountersEnabled()")
private external fun wasmWindowssysWindowsWdkStorageFilesystemPsIsDiskCountersEnabled(): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemPsIsSystemThread(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemPsIsSystemThread(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemPsIsThreadTerminating(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemPsIsThreadTerminating(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemPsLookupProcessByProcessId(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemPsLookupProcessByProcessId(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemPsLookupThreadByThreadId(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemPsLookupThreadByThreadId(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemPsReferenceImpersonationToken(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemPsReferenceImpersonationToken(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemPsReferencePrimaryToken(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemPsReferencePrimaryToken(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemPsRestoreImpersonation(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemPsRestoreImpersonation(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemPsReturnPoolQuota(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemPsReturnPoolQuota(p0: String, p1: Int, p2: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemPsRevertToSelf()")
private external fun wasmWindowssysWindowsWdkStorageFilesystemPsRevertToSelf()

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemPsUpdateDiskCounters(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemPsUpdateDiskCounters(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemQuerySecurityContextToken(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemQuerySecurityContextToken(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlAbsoluteToSelfRelativeSD(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlAbsoluteToSelfRelativeSD(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlAddAccessAllowedAce(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlAddAccessAllowedAce(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlAddAccessAllowedAceEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlAddAccessAllowedAceEx(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlAddAce(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlAddAce(p0: String, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlAllocateAndInitializeSid(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlAllocateAndInitializeSid(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int, p8: Int, p9: Int, p10: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlAllocateAndInitializeSidEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlAllocateAndInitializeSidEx(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlAllocateHeap(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlAllocateHeap(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlAppendStringToString(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlAppendStringToString(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlCompareAltitudes(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlCompareAltitudes(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlCompareMemoryUlong(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlCompareMemoryUlong(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlCompressBuffer(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlCompressBuffer(p0: Int, p1: String, p2: Int, p3: String, p4: Int, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlCompressChunks(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlCompressChunks(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlCopyLuid(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlCopyLuid(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlCopySid(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlCopySid(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlCreateAcl(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlCreateAcl(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlCreateHeap(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlCreateHeap(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlCreateServiceSid(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlCreateServiceSid(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlCreateSystemVolumeInformationFolder(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlCreateSystemVolumeInformationFolder(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlCreateUnicodeString(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlCreateUnicodeString(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlCreateVirtualAccountSid(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlCreateVirtualAccountSid(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlCustomCPToUnicodeN(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlCustomCPToUnicodeN(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlDecompressBuffer(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlDecompressBuffer(p0: Int, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlDecompressBufferEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlDecompressBufferEx(p0: Int, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlDecompressBufferEx2(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlDecompressBufferEx2(p0: Int, p1: String, p2: Int, p3: String, p4: Int, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlDecompressChunks(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlDecompressChunks(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlDecompressFragment(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlDecompressFragment(p0: Int, p1: String, p2: Int, p3: String, p4: Int, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlDecompressFragmentEx(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlDecompressFragmentEx(p0: Int, p1: String, p2: Int, p3: String, p4: Int, p5: Int, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlDeleteAce(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlDeleteAce(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlDescribeChunk(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlDescribeChunk(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlDestroyHeap(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlDestroyHeap(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlDosPathNameToNtPathNameUWithStatus(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlDosPathNameToNtPathNameUWithStatus(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlDowncaseUnicodeString(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlDowncaseUnicodeString(p0: String, p1: String, p2: Boolean): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlDuplicateUnicodeString(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlDuplicateUnicodeString(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlEqualPrefixSid(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlEqualPrefixSid(p0: String, p1: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlEqualSid(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlEqualSid(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlFindUnicodePrefix(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlFindUnicodePrefix(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlFreeHeap(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlFreeHeap(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlFreeSid(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlFreeSid(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlGenerate8dot3Name(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlGenerate8dot3Name(p0: String, p1: Boolean, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlGetAce(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlGetAce(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlGetCompressionWorkSpaceSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlGetCompressionWorkSpaceSize(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlGetDaclSecurityDescriptor(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlGetDaclSecurityDescriptor(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlGetGroupSecurityDescriptor(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlGetGroupSecurityDescriptor(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlGetOwnerSecurityDescriptor(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlGetOwnerSecurityDescriptor(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlGetSaclSecurityDescriptor(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlGetSaclSecurityDescriptor(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlIdentifierAuthoritySid(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlIdentifierAuthoritySid(p0: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlIdnToAscii(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlIdnToAscii(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlIdnToNameprepUnicode(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlIdnToNameprepUnicode(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlIdnToUnicode(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlIdnToUnicode(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlInitCodePageTable(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlInitCodePageTable(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlInitUnicodeStringEx(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlInitUnicodeStringEx(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlInitializeSid(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlInitializeSid(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlInitializeSidEx(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlInitializeSidEx(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlInitializeUnicodePrefix(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlInitializeUnicodePrefix(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlInsertUnicodePrefix(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlInsertUnicodePrefix(p0: String, p1: String, p2: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlIsCloudFilesPlaceholder(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlIsCloudFilesPlaceholder(p0: Int, p1: Int): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlIsDosDeviceNameU(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlIsDosDeviceNameU(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlIsNonEmptyDirectoryReparsePointAllowed(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlIsNonEmptyDirectoryReparsePointAllowed(p0: Int): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlIsNormalizedString(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlIsNormalizedString(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlIsPartialPlaceholder(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlIsPartialPlaceholder(p0: Int, p1: Int): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlIsPartialPlaceholderFileHandle(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlIsPartialPlaceholderFileHandle(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlIsPartialPlaceholderFileInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlIsPartialPlaceholderFileInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlIsSandboxedToken(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlIsSandboxedToken(p0: String, p1: Int): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlIsValidOemCharacter(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlIsValidOemCharacter(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlLengthRequiredSid(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlLengthRequiredSid(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlLengthSid(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlLengthSid(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlMultiByteToUnicodeN(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlMultiByteToUnicodeN(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlMultiByteToUnicodeSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlMultiByteToUnicodeSize(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlNextUnicodePrefix(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlNextUnicodePrefix(p0: String, p1: Boolean): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlNormalizeString(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlNormalizeString(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlNtStatusToDosErrorNoTeb(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlNtStatusToDosErrorNoTeb(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlOemStringToCountedUnicodeString(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlOemStringToCountedUnicodeString(p0: String, p1: String, p2: Boolean): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlOemStringToUnicodeString(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlOemStringToUnicodeString(p0: String, p1: String, p2: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlOemToUnicodeN(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlOemToUnicodeN(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlPrefixString(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlPrefixString(p0: String, p1: String, p2: Boolean): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlQueryPackageIdentity(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlQueryPackageIdentity(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlQueryPackageIdentityEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlQueryPackageIdentityEx(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlQueryProcessPlaceholderCompatibilityMode()")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlQueryProcessPlaceholderCompatibilityMode(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlQueryThreadPlaceholderCompatibilityMode()")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlQueryThreadPlaceholderCompatibilityMode(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlRandom(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlRandom(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlRandomEx(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlRandomEx(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlRemoveUnicodePrefix(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlRemoveUnicodePrefix(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlReplaceSidInSd(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlReplaceSidInSd(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlReserveChunk(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlReserveChunk(p0: Int, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlSecondsSince1970ToTime(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlSecondsSince1970ToTime(p0: Int, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlSecondsSince1980ToTime(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlSecondsSince1980ToTime(p0: Int, p1: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlSelfRelativeToAbsoluteSD(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlSelfRelativeToAbsoluteSD(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String, p10: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlSetGroupSecurityDescriptor(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlSetGroupSecurityDescriptor(p0: String, p1: String, p2: Boolean): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlSetOwnerSecurityDescriptor(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlSetOwnerSecurityDescriptor(p0: String, p1: String, p2: Boolean): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlSetProcessPlaceholderCompatibilityMode(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlSetProcessPlaceholderCompatibilityMode(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlSetThreadPlaceholderCompatibilityMode(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlSetThreadPlaceholderCompatibilityMode(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlSubAuthorityCountSid(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlSubAuthorityCountSid(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlSubAuthoritySid(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlSubAuthoritySid(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlTimeToSecondsSince1980(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlTimeToSecondsSince1980(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlUnicodeStringToCountedOemString(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlUnicodeStringToCountedOemString(p0: String, p1: String, p2: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlUnicodeToCustomCPN(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlUnicodeToCustomCPN(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlUnicodeToMultiByteN(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlUnicodeToMultiByteN(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlUnicodeToOemN(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlUnicodeToOemN(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlUpcaseUnicodeStringToCountedOemString(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlUpcaseUnicodeStringToCountedOemString(p0: String, p1: String, p2: Boolean): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlUpcaseUnicodeStringToOemString(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlUpcaseUnicodeStringToOemString(p0: String, p1: String, p2: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlUpcaseUnicodeToCustomCPN(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlUpcaseUnicodeToCustomCPN(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlUpcaseUnicodeToMultiByteN(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlUpcaseUnicodeToMultiByteN(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlUpcaseUnicodeToOemN(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlUpcaseUnicodeToOemN(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlValidSid(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlValidSid(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlValidateUnicodeString(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlValidateUnicodeString(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlxOemStringToUnicodeSize(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlxOemStringToUnicodeSize(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemRtlxUnicodeStringToOemSize(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemRtlxUnicodeStringToOemSize(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeAccessCheckFromState(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeAccessCheckFromState(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: String, p7: Int, p8: String, p9: String): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeAccessCheckFromStateEx(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeAccessCheckFromStateEx(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: String, p7: Int, p8: String, p9: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeAdjustAccessStateForAccessConstraints(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeAdjustAccessStateForAccessConstraints(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeAdjustAccessStateForTrustLabel(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeAdjustAccessStateForTrustLabel(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeAdjustObjectSecurity(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeAdjustObjectSecurity(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeAppendPrivileges(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeAppendPrivileges(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeAuditFipsCryptoSelftests(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeAuditFipsCryptoSelftests(p0: Boolean, p1: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeAuditHardLinkCreation(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeAuditHardLinkCreation(p0: String, p1: String, p2: Boolean)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeAuditHardLinkCreationWithTransaction(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeAuditHardLinkCreationWithTransaction(p0: String, p1: String, p2: Boolean, p3: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeAuditTransactionStateChange(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeAuditTransactionStateChange(p0: String, p1: String, p2: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeAuditingAnyFileEventsWithContext(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeAuditingAnyFileEventsWithContext(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeAuditingAnyFileEventsWithContextEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeAuditingAnyFileEventsWithContextEx(p0: String, p1: String, p2: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeAuditingFileEvents(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeAuditingFileEvents(p0: Boolean, p1: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeAuditingFileEventsWithContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeAuditingFileEventsWithContext(p0: Boolean, p1: String, p2: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeAuditingFileEventsWithContextEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeAuditingFileEventsWithContextEx(p0: Boolean, p1: String, p2: String, p3: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeAuditingFileOrGlobalEvents(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeAuditingFileOrGlobalEvents(p0: Boolean, p1: String, p2: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeAuditingHardLinkEvents(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeAuditingHardLinkEvents(p0: Boolean, p1: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeAuditingHardLinkEventsWithContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeAuditingHardLinkEventsWithContext(p0: Boolean, p1: String, p2: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeCaptureSubjectContextEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeCaptureSubjectContextEx(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeCheckForCriticalAceRemoval(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeCheckForCriticalAceRemoval(p0: String, p1: String, p2: String, p3: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeCreateClientSecurity(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeCreateClientSecurity(p0: String, p1: String, p2: Boolean, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeCreateClientSecurityFromSubjectContext(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeCreateClientSecurityFromSubjectContext(p0: String, p1: String, p2: Boolean, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeDeleteClientSecurity(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeDeleteClientSecurity(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeDeleteObjectAuditAlarm(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeDeleteObjectAuditAlarm(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeDeleteObjectAuditAlarmWithTransaction(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeDeleteObjectAuditAlarmWithTransaction(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeExamineSacl(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeExamineSacl(p0: String, p1: String, p2: String, p3: Int, p4: Boolean, p5: String, p6: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeFilterToken(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeFilterToken(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeFreePrivileges(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeFreePrivileges(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeImpersonateClient(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeImpersonateClient(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeImpersonateClientEx(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeImpersonateClientEx(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeLocateProcessImageName(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeLocateProcessImageName(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeMarkLogonSessionForTerminationNotification(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeMarkLogonSessionForTerminationNotification(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeMarkLogonSessionForTerminationNotificationEx(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeMarkLogonSessionForTerminationNotificationEx(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeOpenObjectAuditAlarm(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeOpenObjectAuditAlarm(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Boolean, p6: Boolean, p7: Int, p8: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeOpenObjectAuditAlarmWithTransaction(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeOpenObjectAuditAlarmWithTransaction(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Boolean, p6: Boolean, p7: Int, p8: String, p9: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeOpenObjectForDeleteAuditAlarm(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeOpenObjectForDeleteAuditAlarm(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Boolean, p6: Boolean, p7: Int, p8: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeOpenObjectForDeleteAuditAlarmWithTransaction(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeOpenObjectForDeleteAuditAlarmWithTransaction(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Boolean, p6: Boolean, p7: Int, p8: String, p9: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSePrivilegeCheck(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSePrivilegeCheck(p0: String, p1: String, p2: Int): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeQueryAuthenticationIdToken(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeQueryAuthenticationIdToken(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeQueryInformationToken(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeQueryInformationToken(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeQuerySecurityDescriptorInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeQuerySecurityDescriptorInfo(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeQueryServerSiloToken(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeQueryServerSiloToken(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeQuerySessionIdToken(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeQuerySessionIdToken(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeQuerySessionIdTokenEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeQuerySessionIdTokenEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeRegisterLogonSessionTerminatedRoutine(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeRegisterLogonSessionTerminatedRoutine(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeRegisterLogonSessionTerminatedRoutineEx(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeRegisterLogonSessionTerminatedRoutineEx(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeReportSecurityEventWithSubCategory(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeReportSecurityEventWithSubCategory(p0: Int, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeSetAccessStateGenericMapping(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeSetAccessStateGenericMapping(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeSetSecurityDescriptorInfo(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeSetSecurityDescriptorInfo(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeSetSecurityDescriptorInfoEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeSetSecurityDescriptorInfoEx(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeShouldCheckForAccessRightsFromParent(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeShouldCheckForAccessRightsFromParent(p0: String, p1: String, p2: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeTokenFromAccessInformation(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeTokenFromAccessInformation(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeTokenIsAdmin(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeTokenIsAdmin(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeTokenIsRestricted(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeTokenIsRestricted(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeTokenIsWriteRestricted(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeTokenIsWriteRestricted(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeTokenType(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeTokenType(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeUnregisterLogonSessionTerminatedRoutine(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeUnregisterLogonSessionTerminatedRoutine(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSeUnregisterLogonSessionTerminatedRoutineEx(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSeUnregisterLogonSessionTerminatedRoutineEx(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSecLookupAccountName(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSecLookupAccountName(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSecLookupAccountSid(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSecLookupAccountSid(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSecLookupWellKnownSid(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSecLookupWellKnownSid(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSecMakeSPN(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSecMakeSPN(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSecMakeSPNEx(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSecMakeSPNEx(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String, p8: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSecMakeSPNEx2(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSecMakeSPNEx2(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String, p8: Boolean, p9: Boolean): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSetContextAttributesW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSetContextAttributesW(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSspiAcceptSecurityContextAsync(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSspiAcceptSecurityContextAsync(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSspiCreateAsyncContext()")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSspiCreateAsyncContext(): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSspiDeleteSecurityContextAsync(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSspiDeleteSecurityContextAsync(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSspiFreeAsyncContext(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSspiFreeAsyncContext(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSspiFreeCredentialsHandleAsync(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSspiFreeCredentialsHandleAsync(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSspiGetAsyncCallStatus(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSspiGetAsyncCallStatus(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSspiInitializeSecurityContextAsyncA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSspiInitializeSecurityContextAsyncA(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: Int, p7: String, p8: Int, p9: String, p10: String, p11: String, p12: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSspiInitializeSecurityContextAsyncW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSspiInitializeSecurityContextAsyncW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: Int, p7: String, p8: Int, p9: String, p10: String, p11: String, p12: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSspiReinitAsyncContext(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSspiReinitAsyncContext(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemSspiSetAsyncNotifyCallback(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemSspiSetAsyncNotifyCallback(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemVerifySignature(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemVerifySignature(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwAccessCheckAndAuditAlarm(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwAccessCheckAndAuditAlarm(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String, p7: Boolean, p8: String, p9: String, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwAccessCheckByTypeAndAuditAlarm(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwAccessCheckByTypeAndAuditAlarm(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: Int, p8: Int, p9: String, p10: Int, p11: String, p12: Boolean, p13: String, p14: String, p15: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwAccessCheckByTypeResultListAndAuditAlarm(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwAccessCheckByTypeResultListAndAuditAlarm(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: Int, p8: Int, p9: String, p10: Int, p11: String, p12: Boolean, p13: String, p14: String, p15: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwAccessCheckByTypeResultListAndAuditAlarmByHandle(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwAccessCheckByTypeResultListAndAuditAlarmByHandle(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int, p8: Int, p9: Int, p10: String, p11: Int, p12: String, p13: Boolean, p14: String, p15: String, p16: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwAdjustGroupsToken(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwAdjustGroupsToken(p0: String, p1: Boolean, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwAdjustPrivilegesToken(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwAdjustPrivilegesToken(p0: String, p1: Boolean, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwAllocateVirtualMemory(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwAllocateVirtualMemory(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwAllocateVirtualMemoryEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwAllocateVirtualMemoryEx(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwCancelIoFileEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwCancelIoFileEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwCloseObjectAuditAlarm(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwCloseObjectAuditAlarm(p0: String, p1: String, p2: Boolean): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwCreateDirectoryObject(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwCreateDirectoryObject(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwCreateEvent(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwCreateEvent(p0: String, p1: Int, p2: String, p3: Int, p4: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwCreateSectionEx(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwCreateSectionEx(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: Int, p6: String, p7: String, p8: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwDeleteFile(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwDeleteFile(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwDeleteObjectAuditAlarm(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwDeleteObjectAuditAlarm(p0: String, p1: String, p2: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwDuplicateObject(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwDuplicateObject(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwDuplicateToken(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwDuplicateToken(p0: String, p1: Int, p2: String, p3: Boolean, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwFilterToken(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwFilterToken(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwFlushBuffersFile(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwFlushBuffersFile(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwFlushBuffersFileEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwFlushBuffersFileEx(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwFlushVirtualMemory(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwFlushVirtualMemory(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwFreeVirtualMemory(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwFreeVirtualMemory(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwFsControlFile(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwFsControlFile(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String, p7: Int, p8: String, p9: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwImpersonateAnonymousToken(p0)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwImpersonateAnonymousToken(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwLockFile(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwLockFile(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int, p8: Boolean, p9: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwNotifyChangeKey(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwNotifyChangeKey(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: Boolean, p7: String, p8: Int, p9: Boolean): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwOpenDirectoryObject(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwOpenDirectoryObject(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwOpenObjectAuditAlarm(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwOpenObjectAuditAlarm(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: Int, p8: String, p9: Boolean, p10: Boolean, p11: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwOpenProcessToken(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwOpenProcessToken(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwOpenProcessTokenEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwOpenProcessTokenEx(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwOpenThreadToken(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwOpenThreadToken(p0: String, p1: Int, p2: Boolean, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwOpenThreadTokenEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwOpenThreadTokenEx(p0: String, p1: Int, p2: Boolean, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwPrivilegeCheck(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwPrivilegeCheck(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwPrivilegeObjectAuditAlarm(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwPrivilegeObjectAuditAlarm(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwPrivilegedServiceAuditAlarm(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwPrivilegedServiceAuditAlarm(p0: String, p1: String, p2: String, p3: String, p4: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwQueryDirectoryFile(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwQueryDirectoryFile(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: Int, p8: Boolean, p9: String, p10: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwQueryDirectoryFileEx(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwQueryDirectoryFileEx(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: Int, p8: Int, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwQueryDirectoryObject(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwQueryDirectoryObject(p0: String, p1: String, p2: Int, p3: Boolean, p4: Boolean, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwQueryEaFile(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwQueryEaFile(p0: String, p1: String, p2: String, p3: Int, p4: Boolean, p5: String, p6: Int, p7: String, p8: Boolean): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwQueryFullAttributesFile(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwQueryFullAttributesFile(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwQueryInformationToken(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwQueryInformationToken(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwQueryObject(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwQueryObject(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwQueryQuotaInformationFile(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwQueryQuotaInformationFile(p0: String, p1: String, p2: String, p3: Int, p4: Boolean, p5: String, p6: Int, p7: String, p8: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwQuerySecurityObject(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwQuerySecurityObject(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwQueryVirtualMemory(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwQueryVirtualMemory(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwQueryVolumeInformationFile(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwQueryVolumeInformationFile(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwSetEaFile(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwSetEaFile(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwSetEvent(p0, p1)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwSetEvent(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwSetInformationToken(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwSetInformationToken(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwSetInformationVirtualMemory(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwSetInformationVirtualMemory(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwSetQuotaInformationFile(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwSetQuotaInformationFile(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwSetSecurityObject(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwSetSecurityObject(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwSetVolumeInformationFile(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwSetVolumeInformationFile(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkStorageFilesystemZwUnlockFile(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkStorageFilesystemZwUnlockFile(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

public actual fun applyControlToken(phcontext: ConstPtr<SecHandle>, pinput: ConstPtr<SecBufferDesc>): Hresult =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemApplyControlToken(phcontext.rawAddress.toString(), pinput.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccAsyncCopyRead(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, wait: Boolean, buffer: MutPtr<CVoid>, iostatus: MutPtr<IoStatusBlock>, ioissuerthread: Pethread, asyncreadcontext: ConstPtr<CcAsyncReadContext>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemCcAsyncCopyRead(fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt(), wait, buffer.rawAddress.toString(), iostatus.rawAddress.toString(), ioissuerthread.toString(), asyncreadcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccCanIWrite(fileobject: ConstPtr<FileObject>, bytestowrite: UInt, wait: Boolean, retrying: UByte): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemCcCanIWrite(fileobject.rawAddress.toString(), bytestowrite.toInt(), wait, retrying.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccCoherencyFlushAndPurgeCache(sectionobjectpointer: ConstPtr<SectionObjectPointers>, fileoffset: ConstPtr<Long>, length: UInt, iostatus: MutPtr<IoStatusBlock>, flags: UInt) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemCcCoherencyFlushAndPurgeCache(sectionobjectpointer.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt(), iostatus.rawAddress.toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccCopyRead(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, wait: Boolean, buffer: MutPtr<CVoid>, iostatus: MutPtr<IoStatusBlock>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemCcCopyRead(fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt(), wait, buffer.rawAddress.toString(), iostatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccCopyReadEx(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, wait: Boolean, buffer: MutPtr<CVoid>, iostatus: MutPtr<IoStatusBlock>, ioissuerthread: Pethread): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemCcCopyReadEx(fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt(), wait, buffer.rawAddress.toString(), iostatus.rawAddress.toString(), ioissuerthread.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccCopyWrite(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, wait: Boolean, buffer: ConstPtr<CVoid>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemCcCopyWrite(fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt(), wait, buffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccCopyWriteEx(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, wait: Boolean, buffer: ConstPtr<CVoid>, ioissuerthread: Pethread): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemCcCopyWriteEx(fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt(), wait, buffer.rawAddress.toString(), ioissuerthread.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccCopyWriteWontFlush(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemCcCopyWriteWontFlush(fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccDeferWrite(fileobject: ConstPtr<FileObject>, postroutine: PccPostDeferredWrite, context1: ConstPtr<CVoid>, context2: ConstPtr<CVoid>, bytestowrite: UInt, retrying: Boolean) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemCcDeferWrite(fileobject.rawAddress.toString(), 0L.toString(), context1.rawAddress.toString(), context2.rawAddress.toString(), bytestowrite.toInt(), retrying)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccErrorCallbackRoutine(context: ConstPtr<CcErrorCallbackContext>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemCcErrorCallbackRoutine(context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccFastCopyRead(fileobject: ConstPtr<FileObject>, fileoffset: UInt, length: UInt, pagecount: UInt, buffer: MutPtr<CVoid>, iostatus: MutPtr<IoStatusBlock>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemCcFastCopyRead(fileobject.rawAddress.toString(), fileoffset.toInt(), length.toInt(), pagecount.toInt(), buffer.rawAddress.toString(), iostatus.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccFastCopyWrite(fileobject: ConstPtr<FileObject>, fileoffset: UInt, length: UInt, buffer: ConstPtr<CVoid>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemCcFastCopyWrite(fileobject.rawAddress.toString(), fileoffset.toInt(), length.toInt(), buffer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccFlushCache(sectionobjectpointer: ConstPtr<SectionObjectPointers>, fileoffset: ConstPtr<Long>, length: UInt, iostatus: MutPtr<IoStatusBlock>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemCcFlushCache(sectionobjectpointer.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt(), iostatus.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccGetDirtyPages(loghandle: ConstPtr<CVoid>, dirtypageroutine: PdirtyPageRoutine, context1: ConstPtr<CVoid>, context2: ConstPtr<CVoid>): Long =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemCcGetDirtyPages(loghandle.rawAddress.toString(), 0L.toString(), context1.rawAddress.toString(), context2.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccGetFileObjectFromBcb(bcb: ConstPtr<CVoid>): MutPtr<FileObject> =
    if (windowsWdkStorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemCcGetFileObjectFromBcb(bcb.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccGetFileObjectFromSectionPtrs(sectionobjectpointer: ConstPtr<SectionObjectPointers>): MutPtr<FileObject> =
    if (windowsWdkStorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemCcGetFileObjectFromSectionPtrs(sectionobjectpointer.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccGetFileObjectFromSectionPtrsRef(sectionobjectpointer: ConstPtr<SectionObjectPointers>): MutPtr<FileObject> =
    if (windowsWdkStorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemCcGetFileObjectFromSectionPtrsRef(sectionobjectpointer.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccGetFlushedValidData(sectionobjectpointer: ConstPtr<SectionObjectPointers>, bcblistheld: Boolean): Long =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemCcGetFlushedValidData(sectionobjectpointer.rawAddress.toString(), bcblistheld).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccInitializeCacheMap(fileobject: ConstPtr<FileObject>, filesizes: ConstPtr<CcFileSizes>, pinaccess: Boolean, callbacks: ConstPtr<CacheManagerCallbacks>, lazywritecontext: ConstPtr<CVoid>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemCcInitializeCacheMap(fileobject.rawAddress.toString(), filesizes.rawAddress.toString(), pinaccess, callbacks.rawAddress.toString(), lazywritecontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccInitializeCacheMapEx(fileobject: ConstPtr<FileObject>, filesizes: ConstPtr<CcFileSizes>, pinaccess: Boolean, callbacks: ConstPtr<CacheManagerCallbacks>, lazywritecontext: ConstPtr<CVoid>, flags: UInt) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemCcInitializeCacheMapEx(fileobject.rawAddress.toString(), filesizes.rawAddress.toString(), pinaccess, callbacks.rawAddress.toString(), lazywritecontext.rawAddress.toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccIsCacheManagerCallbackNeeded(status: Ntstatus): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemCcIsCacheManagerCallbackNeeded(status) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccIsThereDirtyData(vpb: ConstPtr<Vpb>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemCcIsThereDirtyData(vpb.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccIsThereDirtyDataEx(vpb: ConstPtr<Vpb>, numberofdirtypages: ConstPtr<UInt>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemCcIsThereDirtyDataEx(vpb.rawAddress.toString(), numberofdirtypages.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccMapData(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, flags: UInt, bcb: MutPtr<MutPtr<CVoid>>, buffer: MutPtr<MutPtr<CVoid>>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemCcMapData(fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt(), flags.toInt(), bcb.rawAddress.toString(), buffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccMdlRead(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, mdlchain: MutPtr<MutPtr<Mdl>>, iostatus: MutPtr<IoStatusBlock>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemCcMdlRead(fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt(), mdlchain.rawAddress.toString(), iostatus.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccMdlReadComplete(fileobject: ConstPtr<FileObject>, mdlchain: ConstPtr<Mdl>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemCcMdlReadComplete(fileobject.rawAddress.toString(), mdlchain.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccMdlWriteAbort(fileobject: ConstPtr<FileObject>, mdlchain: ConstPtr<Mdl>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemCcMdlWriteAbort(fileobject.rawAddress.toString(), mdlchain.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccMdlWriteComplete(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, mdlchain: ConstPtr<Mdl>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemCcMdlWriteComplete(fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), mdlchain.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccPinMappedData(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, flags: UInt, bcb: MutPtr<MutPtr<CVoid>>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemCcPinMappedData(fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt(), flags.toInt(), bcb.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccPinRead(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, flags: UInt, bcb: MutPtr<MutPtr<CVoid>>, buffer: MutPtr<MutPtr<CVoid>>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemCcPinRead(fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt(), flags.toInt(), bcb.rawAddress.toString(), buffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccPrepareMdlWrite(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, mdlchain: MutPtr<MutPtr<Mdl>>, iostatus: MutPtr<IoStatusBlock>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemCcPrepareMdlWrite(fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt(), mdlchain.rawAddress.toString(), iostatus.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccPreparePinWrite(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, zero: Boolean, flags: UInt, bcb: MutPtr<MutPtr<CVoid>>, buffer: MutPtr<MutPtr<CVoid>>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemCcPreparePinWrite(fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt(), zero, flags.toInt(), bcb.rawAddress.toString(), buffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccPurgeCacheSection(sectionobjectpointer: ConstPtr<SectionObjectPointers>, fileoffset: ConstPtr<Long>, length: UInt, flags: UInt): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemCcPurgeCacheSection(sectionobjectpointer.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccRemapBcb(bcb: ConstPtr<CVoid>): MutPtr<CVoid> =
    if (windowsWdkStorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemCcRemapBcb(bcb.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccRepinBcb(bcb: ConstPtr<CVoid>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemCcRepinBcb(bcb.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccScheduleReadAhead(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemCcScheduleReadAhead(fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccScheduleReadAheadEx(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, ioissuerthread: Pethread) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemCcScheduleReadAheadEx(fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt(), ioissuerthread.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccSetAdditionalCacheAttributes(fileobject: ConstPtr<FileObject>, disablereadahead: Boolean, disablewritebehind: Boolean) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemCcSetAdditionalCacheAttributes(fileobject.rawAddress.toString(), disablereadahead, disablewritebehind)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccSetAdditionalCacheAttributesEx(fileobject: ConstPtr<FileObject>, flags: UInt) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemCcSetAdditionalCacheAttributesEx(fileobject.rawAddress.toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccSetBcbOwnerPointer(bcb: ConstPtr<CVoid>, ownerpointer: ConstPtr<CVoid>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemCcSetBcbOwnerPointer(bcb.rawAddress.toString(), ownerpointer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccSetDirtyPageThreshold(fileobject: ConstPtr<FileObject>, dirtypagethreshold: UInt) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemCcSetDirtyPageThreshold(fileobject.rawAddress.toString(), dirtypagethreshold.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccSetDirtyPinnedData(bcbvoid: ConstPtr<CVoid>, lsn: ConstPtr<Long>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemCcSetDirtyPinnedData(bcbvoid.rawAddress.toString(), lsn.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccSetFileSizes(fileobject: ConstPtr<FileObject>, filesizes: ConstPtr<CcFileSizes>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemCcSetFileSizes(fileobject.rawAddress.toString(), filesizes.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccSetFileSizesEx(fileobject: ConstPtr<FileObject>, filesizes: ConstPtr<CcFileSizes>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemCcSetFileSizesEx(fileobject.rawAddress.toString(), filesizes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccSetLogHandleForFile(fileobject: ConstPtr<FileObject>, loghandle: ConstPtr<CVoid>, flushtolsnroutine: PflushToLsn) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemCcSetLogHandleForFile(fileobject.rawAddress.toString(), loghandle.rawAddress.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccSetParallelFlushFile(fileobject: ConstPtr<FileObject>, enableparallelflush: Boolean) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemCcSetParallelFlushFile(fileobject.rawAddress.toString(), enableparallelflush)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccSetReadAheadGranularity(fileobject: ConstPtr<FileObject>, granularity: UInt) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemCcSetReadAheadGranularity(fileobject.rawAddress.toString(), granularity.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccUninitializeCacheMap(fileobject: ConstPtr<FileObject>, truncatesize: ConstPtr<Long>, uninitializeevent: ConstPtr<CacheUninitializeEvent>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemCcUninitializeCacheMap(fileobject.rawAddress.toString(), truncatesize.rawAddress.toString(), uninitializeevent.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccUnpinData(bcb: ConstPtr<CVoid>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemCcUnpinData(bcb.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccUnpinDataForThread(bcb: ConstPtr<CVoid>, resourcethreadid: ULong) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemCcUnpinDataForThread(bcb.rawAddress.toString(), resourcethreadid.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccUnpinRepinnedBcb(bcb: ConstPtr<CVoid>, writethrough: Boolean, iostatus: MutPtr<IoStatusBlock>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemCcUnpinRepinnedBcb(bcb.rawAddress.toString(), writethrough, iostatus.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ccWaitForCurrentLazyWriterActivity(): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemCcWaitForCurrentLazyWriterActivity() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ccZeroData(fileobject: ConstPtr<FileObject>, startoffset: ConstPtr<Long>, endoffset: ConstPtr<Long>, wait: Boolean): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemCcZeroData(fileobject.rawAddress.toString(), startoffset.rawAddress.toString(), endoffset.rawAddress.toString(), wait) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun completeAuthToken(phcontext: ConstPtr<SecHandle>, ptoken: ConstPtr<SecBufferDesc>): Hresult =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemCompleteAuthToken(phcontext.rawAddress.toString(), ptoken.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exDisableResourceBoostLite(resource: ConstPtr<Eresource>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemExDisableResourceBoostLite(resource.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exQueryPoolBlockSize(poolblock: ConstPtr<CVoid>, quotacharged: MutPtr<Boolean>): ULong =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemExQueryPoolBlockSize(poolblock.rawAddress.toString(), quotacharged.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exportSecurityContext(phcontext: ConstPtr<SecHandle>, fflags: UInt, ppackedcontext: MutPtr<SecBuffer>, ptoken: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemExportSecurityContext(phcontext.rawAddress.toString(), fflags.toInt(), ppackedcontext.rawAddress.toString(), ptoken.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlAcknowledgeEcp(ecpcontext: ConstPtr<CVoid>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlAcknowledgeEcp(ecpcontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlAcquireFileExclusive(fileobject: ConstPtr<FileObject>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlAcquireFileExclusive(fileobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlAddBaseMcbEntry(mcb: MutPtr<BaseMcb>, vbn: Long, lbn: Long, sectorcount: Long): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlAddBaseMcbEntry(mcb.rawAddress.toString(), vbn.toString(), lbn.toString(), sectorcount.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlAddBaseMcbEntryEx(mcb: MutPtr<BaseMcb>, vbn: Long, lbn: Long, sectorcount: Long): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlAddBaseMcbEntryEx(mcb.rawAddress.toString(), vbn.toString(), lbn.toString(), sectorcount.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlAddLargeMcbEntry(mcb: MutPtr<LargeMcb>, vbn: Long, lbn: Long, sectorcount: Long): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlAddLargeMcbEntry(mcb.rawAddress.toString(), vbn.toString(), lbn.toString(), sectorcount.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlAddMcbEntry(mcb: MutPtr<Mcb>, vbn: UInt, lbn: UInt, sectorcount: UInt): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlAddMcbEntry(mcb.rawAddress.toString(), vbn.toInt(), lbn.toInt(), sectorcount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlAddToTunnelCache(cache: MutPtr<Tunnel>, directorykey: ULong, shortname: ConstPtr<UnicodeString>, longname: ConstPtr<UnicodeString>, keybyshortname: Boolean, datalength: UInt, data: ConstPtr<CVoid>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlAddToTunnelCache(cache.rawAddress.toString(), directorykey.toString(), shortname.rawAddress.toString(), longname.rawAddress.toString(), keybyshortname, datalength.toInt(), data.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlAddToTunnelCacheEx(cache: MutPtr<Tunnel>, directorykey: ULong, shortname: ConstPtr<UnicodeString>, longname: ConstPtr<UnicodeString>, flags: UInt, datalength: UInt, data: ConstPtr<CVoid>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlAddToTunnelCacheEx(cache.rawAddress.toString(), directorykey.toString(), shortname.rawAddress.toString(), longname.rawAddress.toString(), flags.toInt(), datalength.toInt(), data.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlAllocateAePushLock(pooltype: PoolType, tag: UInt): MutPtr<CVoid> =
    if (windowsWdkStorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemFsRtlAllocateAePushLock(pooltype, tag.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlAllocateExtraCreateParameter(ecptype: ConstPtr<Guid>, sizeofcontext: UInt, flags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, pooltag: UInt, ecpcontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlAllocateExtraCreateParameter(ecptype.rawAddress.toString(), sizeofcontext.toInt(), flags.toInt(), 0L.toString(), pooltag.toInt(), ecpcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlAllocateExtraCreateParameterFromLookasideList(ecptype: ConstPtr<Guid>, sizeofcontext: UInt, flags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, lookasidelist: MutPtr<CVoid>, ecpcontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlAllocateExtraCreateParameterFromLookasideList(ecptype.rawAddress.toString(), sizeofcontext.toInt(), flags.toInt(), 0L.toString(), lookasidelist.rawAddress.toString(), ecpcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlAllocateExtraCreateParameterList(flags: UInt, ecplist: MutPtr<MutPtr<EcpList>>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlAllocateExtraCreateParameterList(flags.toInt(), ecplist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlAllocateFileLock(completelockirproutine: PcompleteLockIrpRoutine, unlockroutine: PunlockRoutine): MutPtr<FileLock> =
    if (windowsWdkStorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemFsRtlAllocateFileLock(0L.toString(), 0L.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlAllocateResource(): MutPtr<Eresource> =
    if (windowsWdkStorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemFsRtlAllocateResource().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlAreNamesEqual(constantnamea: ConstPtr<UnicodeString>, constantnameb: ConstPtr<UnicodeString>, ignorecase: Boolean, upcasetable: ConstPtr<UShort>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlAreNamesEqual(constantnamea.rawAddress.toString(), constantnameb.rawAddress.toString(), ignorecase, upcasetable.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlAreThereCurrentOrInProgressFileLocks(filelock: ConstPtr<FileLock>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlAreThereCurrentOrInProgressFileLocks(filelock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlAreThereWaitingFileLocks(filelock: ConstPtr<FileLock>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlAreThereWaitingFileLocks(filelock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlAreVolumeStartupApplicationsComplete(): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlAreVolumeStartupApplicationsComplete() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlBalanceReads(targetdevice: ConstPtr<DeviceObject>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlBalanceReads(targetdevice.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlCancellableWaitForMultipleObjects(count: UInt, objectarray: ConstPtr<ConstPtr<CVoid>>, waittype: WaitType, timeout: ConstPtr<Long>, waitblockarray: ConstPtr<KwaitBlock>, irp: ConstPtr<Irp>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlCancellableWaitForMultipleObjects(count.toInt(), objectarray.rawAddress.toString(), waittype, timeout.rawAddress.toString(), waitblockarray.rawAddress.toString(), irp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlCancellableWaitForSingleObject(obj: ConstPtr<CVoid>, timeout: ConstPtr<Long>, irp: ConstPtr<Irp>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlCancellableWaitForSingleObject(obj.rawAddress.toString(), timeout.rawAddress.toString(), irp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlChangeBackingFileObject(currentfileobject: ConstPtr<FileObject>, newfileobject: ConstPtr<FileObject>, changebackingtype: FsrtlChangeBackingType, flags: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlChangeBackingFileObject(currentfileobject.rawAddress.toString(), newfileobject.rawAddress.toString(), changebackingtype, flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlCheckLockForOplockRequest(filelock: ConstPtr<FileLock>, allocationsize: ConstPtr<Long>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlCheckLockForOplockRequest(filelock.rawAddress.toString(), allocationsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlCheckLockForReadAccess(filelock: ConstPtr<FileLock>, irp: ConstPtr<Irp>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlCheckLockForReadAccess(filelock.rawAddress.toString(), irp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlCheckLockForWriteAccess(filelock: ConstPtr<FileLock>, irp: ConstPtr<Irp>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlCheckLockForWriteAccess(filelock.rawAddress.toString(), irp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlCheckOplock(oplock: ConstPtr<ConstPtr<CVoid>>, irp: ConstPtr<Irp>, context: ConstPtr<CVoid>, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlCheckOplock(oplock.rawAddress.toString(), irp.rawAddress.toString(), context.rawAddress.toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlCheckOplockEx(oplock: ConstPtr<ConstPtr<CVoid>>, irp: ConstPtr<Irp>, flags: UInt, context: ConstPtr<CVoid>, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlCheckOplockEx(oplock.rawAddress.toString(), irp.rawAddress.toString(), flags.toInt(), context.rawAddress.toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlCheckOplockEx2(oplock: ConstPtr<ConstPtr<CVoid>>, irp: ConstPtr<Irp>, flags: UInt, flagsex2: UInt, completionroutinecontext: ConstPtr<CVoid>, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp, timeout: ULong, notifycontext: ConstPtr<CVoid>, notifyroutine: PoplockNotifyRoutine): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlCheckOplockEx2(oplock.rawAddress.toString(), irp.rawAddress.toString(), flags.toInt(), flagsex2.toInt(), completionroutinecontext.rawAddress.toString(), 0L.toString(), 0L.toString(), timeout.toString(), notifycontext.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlCheckUpperOplock(oplock: ConstPtr<ConstPtr<CVoid>>, newloweroplockstate: UInt, completionroutinecontext: ConstPtr<CVoid>, completionroutine: PoplockWaitCompleteRoutine, prependroutine: PoplockFsPrepostIrp, flags: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlCheckUpperOplock(oplock.rawAddress.toString(), newloweroplockstate.toInt(), completionroutinecontext.rawAddress.toString(), 0L.toString(), 0L.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlCopyRead(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, wait: Boolean, lockkey: UInt, buffer: MutPtr<CVoid>, iostatus: MutPtr<IoStatusBlock>, deviceobject: ConstPtr<DeviceObject>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlCopyRead(fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt(), wait, lockkey.toInt(), buffer.rawAddress.toString(), iostatus.rawAddress.toString(), deviceobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlCopyWrite(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, wait: Boolean, lockkey: UInt, buffer: ConstPtr<CVoid>, iostatus: MutPtr<IoStatusBlock>, deviceobject: ConstPtr<DeviceObject>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlCopyWrite(fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt(), wait, lockkey.toInt(), buffer.rawAddress.toString(), iostatus.rawAddress.toString(), deviceobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlCreateSectionForDataScan(sectionhandle: MutPtr<Handle>, sectionobject: MutPtr<MutPtr<CVoid>>, sectionfilesize: MutPtr<Long>, fileobject: ConstPtr<FileObject>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, maximumsize: ConstPtr<Long>, sectionpageprotection: UInt, allocationattributes: UInt, flags: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlCreateSectionForDataScan(sectionhandle.rawAddress.toString(), sectionobject.rawAddress.toString(), sectionfilesize.rawAddress.toString(), fileobject.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), maximumsize.rawAddress.toString(), sectionpageprotection.toInt(), allocationattributes.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlCurrentBatchOplock(oplock: ConstPtr<ConstPtr<CVoid>>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlCurrentBatchOplock(oplock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlCurrentOplock(oplock: ConstPtr<ConstPtr<CVoid>>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlCurrentOplock(oplock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlCurrentOplockH(oplock: ConstPtr<ConstPtr<CVoid>>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlCurrentOplockH(oplock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlDeleteExtraCreateParameterLookasideList(lookaside: MutPtr<CVoid>, flags: UInt) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlDeleteExtraCreateParameterLookasideList(lookaside.rawAddress.toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlDeleteKeyFromTunnelCache(cache: MutPtr<Tunnel>, directorykey: ULong) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlDeleteKeyFromTunnelCache(cache.rawAddress.toString(), directorykey.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlDeleteTunnelCache(cache: MutPtr<Tunnel>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlDeleteTunnelCache(cache.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlDeregisterUncProvider(handle: Handle) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlDeregisterUncProvider(handle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlDismountComplete(deviceobject: ConstPtr<DeviceObject>, dismountstatus: Ntstatus) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlDismountComplete(deviceobject.rawAddress.toString(), dismountstatus)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlDissectDbcs(path: io.github.kotlinmania.windowssys.windows.win32.system.kernel.String, firstname: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, remainingname: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlDissectName(path: UnicodeString, firstname: MutPtr<UnicodeString>, remainingname: MutPtr<UnicodeString>): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlDoesDbcsContainWildCards(name: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlDoesDbcsContainWildCards(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlDoesNameContainWildCards(name: ConstPtr<UnicodeString>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlDoesNameContainWildCards(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlFastCheckLockForRead(filelock: ConstPtr<FileLock>, startingbyte: ConstPtr<Long>, length: ConstPtr<Long>, key: UInt, fileobject: ConstPtr<FileObject>, processid: ConstPtr<CVoid>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlFastCheckLockForRead(filelock.rawAddress.toString(), startingbyte.rawAddress.toString(), length.rawAddress.toString(), key.toInt(), fileobject.rawAddress.toString(), processid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlFastCheckLockForWrite(filelock: ConstPtr<FileLock>, startingbyte: ConstPtr<Long>, length: ConstPtr<Long>, key: UInt, fileobject: ConstPtr<CVoid>, processid: ConstPtr<CVoid>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlFastCheckLockForWrite(filelock.rawAddress.toString(), startingbyte.rawAddress.toString(), length.rawAddress.toString(), key.toInt(), fileobject.rawAddress.toString(), processid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlFastUnlockAll(filelock: ConstPtr<FileLock>, fileobject: ConstPtr<FileObject>, processid: Peprocess, context: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlFastUnlockAll(filelock.rawAddress.toString(), fileobject.rawAddress.toString(), processid.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlFastUnlockAllByKey(filelock: ConstPtr<FileLock>, fileobject: ConstPtr<FileObject>, processid: Peprocess, key: UInt, context: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlFastUnlockAllByKey(filelock.rawAddress.toString(), fileobject.rawAddress.toString(), processid.toString(), key.toInt(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlFastUnlockSingle(filelock: ConstPtr<FileLock>, fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: ConstPtr<Long>, processid: Peprocess, key: UInt, context: ConstPtr<CVoid>, alreadysynchronized: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlFastUnlockSingle(filelock.rawAddress.toString(), fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.rawAddress.toString(), processid.toString(), key.toInt(), context.rawAddress.toString(), alreadysynchronized) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlFindExtraCreateParameter(ecplist: ConstPtr<EcpList>, ecptype: ConstPtr<Guid>, ecpcontext: MutPtr<MutPtr<CVoid>>, ecpcontextsize: MutPtr<UInt>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlFindExtraCreateParameter(ecplist.rawAddress.toString(), ecptype.rawAddress.toString(), ecpcontext.rawAddress.toString(), ecpcontextsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlFindInTunnelCache(cache: ConstPtr<Tunnel>, directorykey: ULong, name: ConstPtr<UnicodeString>, shortname: MutPtr<UnicodeString>, longname: MutPtr<UnicodeString>, datalength: MutPtr<UInt>, data: MutPtr<CVoid>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlFindInTunnelCache(cache.rawAddress.toString(), directorykey.toString(), name.rawAddress.toString(), shortname.rawAddress.toString(), longname.rawAddress.toString(), datalength.rawAddress.toString(), data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlFindInTunnelCacheEx(cache: ConstPtr<Tunnel>, directorykey: ULong, name: ConstPtr<UnicodeString>, shortname: MutPtr<UnicodeString>, longname: MutPtr<UnicodeString>, flags: UInt, datalength: MutPtr<UInt>, data: MutPtr<CVoid>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlFindInTunnelCacheEx(cache.rawAddress.toString(), directorykey.toString(), name.rawAddress.toString(), shortname.rawAddress.toString(), longname.rawAddress.toString(), flags.toInt(), datalength.rawAddress.toString(), data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlFreeAePushLock(aepushlock: MutPtr<CVoid>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlFreeAePushLock(aepushlock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlFreeExtraCreateParameter(ecpcontext: ConstPtr<CVoid>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlFreeExtraCreateParameter(ecpcontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlFreeExtraCreateParameterList(ecplist: ConstPtr<EcpList>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlFreeExtraCreateParameterList(ecplist.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlFreeFileLock(filelock: ConstPtr<FileLock>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlFreeFileLock(filelock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlGetCurrentProcessLoaderList(): MutPtr<ListEntry> =
    if (windowsWdkStorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemFsRtlGetCurrentProcessLoaderList().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlGetEcpListFromIrp(irp: ConstPtr<Irp>, ecplist: MutPtr<MutPtr<EcpList>>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlGetEcpListFromIrp(irp.rawAddress.toString(), ecplist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlGetFileSize(fileobject: ConstPtr<FileObject>, filesize: MutPtr<Long>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlGetFileSize(fileobject.rawAddress.toString(), filesize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlGetNextBaseMcbEntry(mcb: ConstPtr<BaseMcb>, runindex: UInt, vbn: MutPtr<Long>, lbn: MutPtr<Long>, sectorcount: MutPtr<Long>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlGetNextBaseMcbEntry(mcb.rawAddress.toString(), runindex.toInt(), vbn.rawAddress.toString(), lbn.rawAddress.toString(), sectorcount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlGetNextExtraCreateParameter(ecplist: ConstPtr<EcpList>, currentecpcontext: ConstPtr<CVoid>, nextecptype: MutPtr<Guid>, nextecpcontext: MutPtr<MutPtr<CVoid>>, nextecpcontextsize: MutPtr<UInt>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlGetNextExtraCreateParameter(ecplist.rawAddress.toString(), currentecpcontext.rawAddress.toString(), nextecptype.rawAddress.toString(), nextecpcontext.rawAddress.toString(), nextecpcontextsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlGetNextFileLock(filelock: ConstPtr<FileLock>, restart: Boolean): MutPtr<FileLockInfo> =
    if (windowsWdkStorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemFsRtlGetNextFileLock(filelock.rawAddress.toString(), restart).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlGetNextLargeMcbEntry(mcb: ConstPtr<LargeMcb>, runindex: UInt, vbn: MutPtr<Long>, lbn: MutPtr<Long>, sectorcount: MutPtr<Long>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlGetNextLargeMcbEntry(mcb.rawAddress.toString(), runindex.toInt(), vbn.rawAddress.toString(), lbn.rawAddress.toString(), sectorcount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlGetNextMcbEntry(mcb: ConstPtr<Mcb>, runindex: UInt, vbn: MutPtr<UInt>, lbn: MutPtr<UInt>, sectorcount: MutPtr<UInt>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlGetNextMcbEntry(mcb.rawAddress.toString(), runindex.toInt(), vbn.rawAddress.toString(), lbn.rawAddress.toString(), sectorcount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlGetSectorSizeInformation(deviceobject: ConstPtr<DeviceObject>, sectorsizeinfo: MutPtr<FileFsSectorSizeInformation>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlGetSectorSizeInformation(deviceobject.rawAddress.toString(), sectorsizeinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlGetSupportedFeatures(deviceobject: ConstPtr<DeviceObject>, supportedfeatures: MutPtr<UInt>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlGetSupportedFeatures(deviceobject.rawAddress.toString(), supportedfeatures.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlGetVirtualDiskNestingLevel(deviceobject: ConstPtr<DeviceObject>, nestinglevel: MutPtr<UInt>, nestingflags: MutPtr<UInt>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlGetVirtualDiskNestingLevel(deviceobject.rawAddress.toString(), nestinglevel.rawAddress.toString(), nestingflags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIncrementCcFastMdlReadWait() {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastMdlReadWait()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlIncrementCcFastReadNoWait() {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadNoWait()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlIncrementCcFastReadNotPossible() {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadNotPossible()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlIncrementCcFastReadResourceMiss() {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadResourceMiss()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlIncrementCcFastReadWait() {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadWait()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlInitExtraCreateParameterLookasideList(lookaside: MutPtr<CVoid>, flags: UInt, size: ULong, tag: UInt) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlInitExtraCreateParameterLookasideList(lookaside.rawAddress.toString(), flags.toInt(), size.toString(), tag.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlInitializeBaseMcb(mcb: MutPtr<BaseMcb>, pooltype: PoolType) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlInitializeBaseMcb(mcb.rawAddress.toString(), pooltype)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlInitializeBaseMcbEx(mcb: MutPtr<BaseMcb>, pooltype: PoolType, flags: UShort): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlInitializeBaseMcbEx(mcb.rawAddress.toString(), pooltype, flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlInitializeExtraCreateParameter(ecp: MutPtr<EcpHeader>, ecpflags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, totalsize: UInt, ecptype: ConstPtr<Guid>, listallocatedfrom: ConstPtr<CVoid>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlInitializeExtraCreateParameter(ecp.rawAddress.toString(), ecpflags.toInt(), 0L.toString(), totalsize.toInt(), ecptype.rawAddress.toString(), listallocatedfrom.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlInitializeExtraCreateParameterList(ecplist: MutPtr<EcpList>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlInitializeExtraCreateParameterList(ecplist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlInitializeFileLock(filelock: MutPtr<FileLock>, completelockirproutine: PcompleteLockIrpRoutine, unlockroutine: PunlockRoutine) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlInitializeFileLock(filelock.rawAddress.toString(), 0L.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlInitializeLargeMcb(mcb: MutPtr<LargeMcb>, pooltype: PoolType) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlInitializeLargeMcb(mcb.rawAddress.toString(), pooltype)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlInitializeMcb(mcb: MutPtr<Mcb>, pooltype: PoolType) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlInitializeMcb(mcb.rawAddress.toString(), pooltype)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlInitializeOplock(oplock: MutPtr<MutPtr<CVoid>>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlInitializeOplock(oplock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlInitializeTunnelCache(cache: MutPtr<Tunnel>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlInitializeTunnelCache(cache.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlInsertExtraCreateParameter(ecplist: MutPtr<EcpList>, ecpcontext: MutPtr<CVoid>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlInsertExtraCreateParameter(ecplist.rawAddress.toString(), ecpcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlInsertPerFileContext(perfilecontextpointer: ConstPtr<ConstPtr<CVoid>>, ptr: ConstPtr<FsrtlPerFileContext>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlInsertPerFileContext(perfilecontextpointer.rawAddress.toString(), ptr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlInsertPerFileObjectContext(fileobject: ConstPtr<FileObject>, ptr: ConstPtr<FsrtlPerFileobjectContext>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlInsertPerFileObjectContext(fileobject.rawAddress.toString(), ptr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlInsertPerStreamContext(perstreamcontext: ConstPtr<FsrtlAdvancedFcbHeader>, ptr: ConstPtr<FsrtlPerStreamContext>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlInsertPerStreamContext(perstreamcontext.rawAddress.toString(), ptr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIs32BitProcess(process: Peprocess): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlIs32BitProcess(process.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIsDaxVolume(fileobject: ConstPtr<FileObject>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlIsDaxVolume(fileobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIsDbcsInExpression(expression: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, name: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlIsDbcsInExpression(expression.rawAddress.toString(), name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIsEcpAcknowledged(ecpcontext: ConstPtr<CVoid>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlIsEcpAcknowledged(ecpcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIsEcpFromUserMode(ecpcontext: ConstPtr<CVoid>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlIsEcpFromUserMode(ecpcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIsExtentDangling(startpage: UInt, numberofpages: UInt, flags: UInt): UInt =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlIsExtentDangling(startpage.toInt(), numberofpages.toInt(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIsFatDbcsLegal(dbcsname: io.github.kotlinmania.windowssys.windows.win32.system.kernel.String, wildcardspermissible: Boolean, pathnamepermissible: Boolean, leadingbackslashpermissible: Boolean): Boolean =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIsHpfsDbcsLegal(dbcsname: io.github.kotlinmania.windowssys.windows.win32.system.kernel.String, wildcardspermissible: Boolean, pathnamepermissible: Boolean, leadingbackslashpermissible: Boolean): Boolean =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIsMobileOS(): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlIsMobileOS() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIsNameInExpression(expression: ConstPtr<UnicodeString>, name: ConstPtr<UnicodeString>, ignorecase: Boolean, upcasetable: Pcwstr): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlIsNameInExpression(expression.rawAddress.toString(), name.rawAddress.toString(), ignorecase, upcasetable.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIsNameInUnUpcasedExpression(expression: ConstPtr<UnicodeString>, name: ConstPtr<UnicodeString>, ignorecase: Boolean, upcasetable: Pcwstr): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlIsNameInUnUpcasedExpression(expression.rawAddress.toString(), name.rawAddress.toString(), ignorecase, upcasetable.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag: UInt): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIsNtstatusExpected(exception: Ntstatus): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlIsNtstatusExpected(exception) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIsPagingFile(fileobject: ConstPtr<FileObject>): UInt =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlIsPagingFile(fileobject.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIsSystemPagingFile(fileobject: ConstPtr<FileObject>): UInt =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlIsSystemPagingFile(fileobject.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlIssueDeviceIoControl(deviceobject: ConstPtr<DeviceObject>, ioctl: UInt, flags: UByte, inputbuffer: ConstPtr<CVoid>, inputbufferlength: UInt, outputbuffer: ConstPtr<CVoid>, outputbufferlength: UInt, iosbinformation: MutPtr<ULong>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlIssueDeviceIoControl(deviceobject.rawAddress.toString(), ioctl.toInt(), flags.toInt(), inputbuffer.rawAddress.toString(), inputbufferlength.toInt(), outputbuffer.rawAddress.toString(), outputbufferlength.toInt(), iosbinformation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlKernelFsControlFile(fileobject: ConstPtr<FileObject>, fscontrolcode: UInt, inputbuffer: ConstPtr<CVoid>, inputbufferlength: UInt, outputbuffer: MutPtr<CVoid>, outputbufferlength: UInt, retoutputbuffersize: MutPtr<UInt>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlKernelFsControlFile(fileobject.rawAddress.toString(), fscontrolcode.toInt(), inputbuffer.rawAddress.toString(), inputbufferlength.toInt(), outputbuffer.rawAddress.toString(), outputbufferlength.toInt(), retoutputbuffersize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlLogCcFlushError(filename: ConstPtr<UnicodeString>, deviceobject: ConstPtr<DeviceObject>, sectionobjectpointer: ConstPtr<SectionObjectPointers>, flusherror: Ntstatus, flags: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlLogCcFlushError(filename.rawAddress.toString(), deviceobject.rawAddress.toString(), sectionobjectpointer.rawAddress.toString(), flusherror, flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlLookupBaseMcbEntry(mcb: ConstPtr<BaseMcb>, vbn: Long, lbn: MutPtr<Long>, sectorcountfromlbn: MutPtr<Long>, startinglbn: MutPtr<Long>, sectorcountfromstartinglbn: MutPtr<Long>, index: MutPtr<UInt>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlLookupBaseMcbEntry(mcb.rawAddress.toString(), vbn.toString(), lbn.rawAddress.toString(), sectorcountfromlbn.rawAddress.toString(), startinglbn.rawAddress.toString(), sectorcountfromstartinglbn.rawAddress.toString(), index.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlLookupLargeMcbEntry(mcb: ConstPtr<LargeMcb>, vbn: Long, lbn: MutPtr<Long>, sectorcountfromlbn: MutPtr<Long>, startinglbn: MutPtr<Long>, sectorcountfromstartinglbn: MutPtr<Long>, index: MutPtr<UInt>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlLookupLargeMcbEntry(mcb.rawAddress.toString(), vbn.toString(), lbn.rawAddress.toString(), sectorcountfromlbn.rawAddress.toString(), startinglbn.rawAddress.toString(), sectorcountfromstartinglbn.rawAddress.toString(), index.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlLookupLastBaseMcbEntry(mcb: ConstPtr<BaseMcb>, vbn: MutPtr<Long>, lbn: MutPtr<Long>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlLookupLastBaseMcbEntry(mcb.rawAddress.toString(), vbn.rawAddress.toString(), lbn.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlLookupLastBaseMcbEntryAndIndex(opaquemcb: ConstPtr<BaseMcb>, largevbn: MutPtr<Long>, largelbn: MutPtr<Long>, index: MutPtr<UInt>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlLookupLastBaseMcbEntryAndIndex(opaquemcb.rawAddress.toString(), largevbn.rawAddress.toString(), largelbn.rawAddress.toString(), index.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlLookupLastLargeMcbEntry(mcb: ConstPtr<LargeMcb>, vbn: MutPtr<Long>, lbn: MutPtr<Long>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlLookupLastLargeMcbEntry(mcb.rawAddress.toString(), vbn.rawAddress.toString(), lbn.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlLookupLastLargeMcbEntryAndIndex(opaquemcb: ConstPtr<LargeMcb>, largevbn: MutPtr<Long>, largelbn: MutPtr<Long>, index: MutPtr<UInt>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlLookupLastLargeMcbEntryAndIndex(opaquemcb.rawAddress.toString(), largevbn.rawAddress.toString(), largelbn.rawAddress.toString(), index.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlLookupLastMcbEntry(mcb: ConstPtr<Mcb>, vbn: MutPtr<UInt>, lbn: MutPtr<UInt>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlLookupLastMcbEntry(mcb.rawAddress.toString(), vbn.rawAddress.toString(), lbn.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlLookupMcbEntry(mcb: ConstPtr<Mcb>, vbn: UInt, lbn: MutPtr<UInt>, sectorcount: MutPtr<UInt>, index: MutPtr<UInt>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlLookupMcbEntry(mcb.rawAddress.toString(), vbn.toInt(), lbn.rawAddress.toString(), sectorcount.rawAddress.toString(), index.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlLookupPerFileContext(perfilecontextpointer: ConstPtr<ConstPtr<CVoid>>, ownerid: ConstPtr<CVoid>, instanceid: ConstPtr<CVoid>): MutPtr<FsrtlPerFileContext> =
    if (windowsWdkStorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemFsRtlLookupPerFileContext(perfilecontextpointer.rawAddress.toString(), ownerid.rawAddress.toString(), instanceid.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlLookupPerFileObjectContext(fileobject: ConstPtr<FileObject>, ownerid: ConstPtr<CVoid>, instanceid: ConstPtr<CVoid>): MutPtr<FsrtlPerFileobjectContext> =
    if (windowsWdkStorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemFsRtlLookupPerFileObjectContext(fileobject.rawAddress.toString(), ownerid.rawAddress.toString(), instanceid.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlLookupPerStreamContextInternal(streamcontext: ConstPtr<FsrtlAdvancedFcbHeader>, ownerid: ConstPtr<CVoid>, instanceid: ConstPtr<CVoid>): MutPtr<FsrtlPerStreamContext> =
    if (windowsWdkStorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemFsRtlLookupPerStreamContextInternal(streamcontext.rawAddress.toString(), ownerid.rawAddress.toString(), instanceid.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlMdlReadCompleteDev(fileobject: ConstPtr<FileObject>, mdlchain: ConstPtr<Mdl>, deviceobject: ConstPtr<DeviceObject>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlMdlReadCompleteDev(fileobject.rawAddress.toString(), mdlchain.rawAddress.toString(), deviceobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlMdlReadDev(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, lockkey: UInt, mdlchain: MutPtr<MutPtr<Mdl>>, iostatus: MutPtr<IoStatusBlock>, deviceobject: ConstPtr<DeviceObject>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlMdlReadDev(fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt(), lockkey.toInt(), mdlchain.rawAddress.toString(), iostatus.rawAddress.toString(), deviceobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlMdlReadEx(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, lockkey: UInt, mdlchain: MutPtr<MutPtr<Mdl>>, iostatus: MutPtr<IoStatusBlock>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlMdlReadEx(fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt(), lockkey.toInt(), mdlchain.rawAddress.toString(), iostatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlMdlWriteCompleteDev(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, mdlchain: ConstPtr<Mdl>, deviceobject: ConstPtr<DeviceObject>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlMdlWriteCompleteDev(fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), mdlchain.rawAddress.toString(), deviceobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlMupGetProviderIdFromName(pprovidername: ConstPtr<UnicodeString>, pproviderid: MutPtr<UInt>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlMupGetProviderIdFromName(pprovidername.rawAddress.toString(), pproviderid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlMupGetProviderInfoFromFileObject(pfileobject: ConstPtr<FileObject>, level: UInt, pbuffer: MutPtr<CVoid>, pbuffersize: MutPtr<UInt>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlMupGetProviderInfoFromFileObject(pfileobject.rawAddress.toString(), level.toInt(), pbuffer.rawAddress.toString(), pbuffersize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlNormalizeNtstatus(exception: Ntstatus, genericexception: Ntstatus): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlNormalizeNtstatus(exception, genericexception) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlNotifyCleanup(notifysync: PnotifySync, notifylist: ConstPtr<ListEntry>, fscontext: ConstPtr<CVoid>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlNotifyCleanup(notifysync.toString(), notifylist.rawAddress.toString(), fscontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlNotifyCleanupAll(notifysync: PnotifySync, notifylist: ConstPtr<ListEntry>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlNotifyCleanupAll(notifysync.toString(), notifylist.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlNotifyFilterChangeDirectory(notifysync: PnotifySync, notifylist: ConstPtr<ListEntry>, fscontext: ConstPtr<CVoid>, fulldirectoryname: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifyirp: ConstPtr<Irp>, traversecallback: PcheckForTraverseAccess, subjectcontext: ConstPtr<SecuritySubjectContext>, filtercallback: PfilterReportChange) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlNotifyFilterChangeDirectory(notifysync.toString(), notifylist.rawAddress.toString(), fscontext.rawAddress.toString(), fulldirectoryname.rawAddress.toString(), watchtree, ignorebuffer, completionfilter.toInt(), notifyirp.rawAddress.toString(), 0L.toString(), subjectcontext.rawAddress.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlNotifyFilterReportChange(notifysync: PnotifySync, notifylist: ConstPtr<ListEntry>, fulltargetname: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, targetnameoffset: UShort, streamname: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, normalizedparentname: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, filtermatch: UInt, action: UInt, targetcontext: ConstPtr<CVoid>, filtercontext: ConstPtr<CVoid>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlNotifyFilterReportChange(notifysync.toString(), notifylist.rawAddress.toString(), fulltargetname.rawAddress.toString(), targetnameoffset.toInt(), streamname.rawAddress.toString(), normalizedparentname.rawAddress.toString(), filtermatch.toInt(), action.toInt(), targetcontext.rawAddress.toString(), filtercontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlNotifyFullChangeDirectory(notifysync: PnotifySync, notifylist: ConstPtr<ListEntry>, fscontext: ConstPtr<CVoid>, fulldirectoryname: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifyirp: ConstPtr<Irp>, traversecallback: PcheckForTraverseAccess, subjectcontext: ConstPtr<SecuritySubjectContext>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlNotifyFullChangeDirectory(notifysync.toString(), notifylist.rawAddress.toString(), fscontext.rawAddress.toString(), fulldirectoryname.rawAddress.toString(), watchtree, ignorebuffer, completionfilter.toInt(), notifyirp.rawAddress.toString(), 0L.toString(), subjectcontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlNotifyFullReportChange(notifysync: PnotifySync, notifylist: ConstPtr<ListEntry>, fulltargetname: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, targetnameoffset: UShort, streamname: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, normalizedparentname: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, filtermatch: UInt, action: UInt, targetcontext: ConstPtr<CVoid>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlNotifyFullReportChange(notifysync.toString(), notifylist.rawAddress.toString(), fulltargetname.rawAddress.toString(), targetnameoffset.toInt(), streamname.rawAddress.toString(), normalizedparentname.rawAddress.toString(), filtermatch.toInt(), action.toInt(), targetcontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlNotifyInitializeSync(notifysync: MutPtr<PnotifySync>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlNotifyInitializeSync(notifysync.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlNotifyUninitializeSync(notifysync: MutPtr<PnotifySync>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlNotifyUninitializeSync(notifysync.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlNotifyVolumeEvent(fileobject: ConstPtr<FileObject>, eventcode: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlNotifyVolumeEvent(fileobject.rawAddress.toString(), eventcode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlNotifyVolumeEventEx(fileobject: ConstPtr<FileObject>, eventcode: UInt, event: ConstPtr<TargetDeviceCustomNotification>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlNotifyVolumeEventEx(fileobject.rawAddress.toString(), eventcode.toInt(), event.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlNumberOfRunsInBaseMcb(mcb: ConstPtr<BaseMcb>): UInt =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlNumberOfRunsInBaseMcb(mcb.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlNumberOfRunsInLargeMcb(mcb: ConstPtr<LargeMcb>): UInt =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlNumberOfRunsInLargeMcb(mcb.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlNumberOfRunsInMcb(mcb: ConstPtr<Mcb>): UInt =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlNumberOfRunsInMcb(mcb.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlOplockBreakH(oplock: ConstPtr<ConstPtr<CVoid>>, irp: ConstPtr<Irp>, flags: UInt, context: ConstPtr<CVoid>, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlOplockBreakH(oplock.rawAddress.toString(), irp.rawAddress.toString(), flags.toInt(), context.rawAddress.toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlOplockBreakH2(oplock: ConstPtr<ConstPtr<CVoid>>, irp: ConstPtr<Irp>, flags: UInt, context: ConstPtr<CVoid>, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp, grantedaccess: ConstPtr<UInt>, shareaccess: ConstPtr<UShort>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlOplockBreakH2(oplock.rawAddress.toString(), irp.rawAddress.toString(), flags.toInt(), context.rawAddress.toString(), 0L.toString(), 0L.toString(), grantedaccess.rawAddress.toString(), shareaccess.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlOplockBreakToNone(oplock: MutPtr<MutPtr<CVoid>>, irpsp: ConstPtr<IoStackLocation>, irp: ConstPtr<Irp>, context: ConstPtr<CVoid>, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlOplockBreakToNone(oplock.rawAddress.toString(), irpsp.rawAddress.toString(), irp.rawAddress.toString(), context.rawAddress.toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlOplockBreakToNoneEx(oplock: MutPtr<MutPtr<CVoid>>, irp: ConstPtr<Irp>, flags: UInt, context: ConstPtr<CVoid>, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlOplockBreakToNoneEx(oplock.rawAddress.toString(), irp.rawAddress.toString(), flags.toInt(), context.rawAddress.toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlOplockFsctrl(oplock: ConstPtr<ConstPtr<CVoid>>, irp: ConstPtr<Irp>, opencount: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlOplockFsctrl(oplock.rawAddress.toString(), irp.rawAddress.toString(), opencount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlOplockFsctrlEx(oplock: ConstPtr<ConstPtr<CVoid>>, irp: ConstPtr<Irp>, opencount: UInt, flags: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlOplockFsctrlEx(oplock.rawAddress.toString(), irp.rawAddress.toString(), opencount.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlOplockGetAnyBreakOwnerProcess(oplock: ConstPtr<ConstPtr<CVoid>>): Peprocess =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlOplockGetAnyBreakOwnerProcess(oplock.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlOplockIsFastIoPossible(oplock: ConstPtr<ConstPtr<CVoid>>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlOplockIsFastIoPossible(oplock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlOplockIsSharedRequest(irp: ConstPtr<Irp>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlOplockIsSharedRequest(irp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlOplockKeysEqual(fo1: ConstPtr<FileObject>, fo2: ConstPtr<FileObject>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlOplockKeysEqual(fo1.rawAddress.toString(), fo2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlPostPagingFileStackOverflow(context: ConstPtr<CVoid>, event: ConstPtr<Kevent>, stackoverflowroutine: PfsrtlStackOverflowRoutine) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlPostPagingFileStackOverflow(context.rawAddress.toString(), event.rawAddress.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlPostStackOverflow(context: ConstPtr<CVoid>, event: ConstPtr<Kevent>, stackoverflowroutine: PfsrtlStackOverflowRoutine) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlPostStackOverflow(context.rawAddress.toString(), event.rawAddress.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlPrepareMdlWriteDev(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, lockkey: UInt, mdlchain: MutPtr<MutPtr<Mdl>>, iostatus: MutPtr<IoStatusBlock>, deviceobject: ConstPtr<DeviceObject>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlPrepareMdlWriteDev(fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt(), lockkey.toInt(), mdlchain.rawAddress.toString(), iostatus.rawAddress.toString(), deviceobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlPrepareMdlWriteEx(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, lockkey: UInt, mdlchain: MutPtr<MutPtr<Mdl>>, iostatus: MutPtr<IoStatusBlock>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlPrepareMdlWriteEx(fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt(), lockkey.toInt(), mdlchain.rawAddress.toString(), iostatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlPrepareToReuseEcp(ecpcontext: ConstPtr<CVoid>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlPrepareToReuseEcp(ecpcontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlPrivateLock(filelock: ConstPtr<FileLock>, fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: ConstPtr<Long>, processid: Peprocess, key: UInt, failimmediately: Boolean, exclusivelock: Boolean, iosb: MutPtr<IoStatusBlock>, irp: ConstPtr<Irp>, context: ConstPtr<CVoid>, alreadysynchronized: Boolean): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlPrivateLock(filelock.rawAddress.toString(), fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.rawAddress.toString(), processid.toString(), key.toInt(), failimmediately, exclusivelock, iosb.rawAddress.toString(), irp.rawAddress.toString(), context.rawAddress.toString(), alreadysynchronized) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlProcessFileLock(filelock: ConstPtr<FileLock>, irp: ConstPtr<Irp>, context: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlProcessFileLock(filelock.rawAddress.toString(), irp.rawAddress.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlQueryCachedVdl(fileobject: ConstPtr<FileObject>, vdl: MutPtr<Long>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlQueryCachedVdl(fileobject.rawAddress.toString(), vdl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlQueryInformationFile(fileobject: ConstPtr<FileObject>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass, retfileinformationsize: MutPtr<UInt>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlQueryInformationFile(fileobject.rawAddress.toString(), fileinformation.rawAddress.toString(), length.toInt(), fileinformationclass, retfileinformationsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlQueryKernelEaFile(fileobject: ConstPtr<FileObject>, returnedeadata: MutPtr<CVoid>, length: UInt, returnsingleentry: Boolean, ealist: ConstPtr<CVoid>, ealistlength: UInt, eaindex: ConstPtr<UInt>, restartscan: Boolean, lengthreturned: MutPtr<UInt>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlQueryKernelEaFile(fileobject.rawAddress.toString(), returnedeadata.rawAddress.toString(), length.toInt(), returnsingleentry, ealist.rawAddress.toString(), ealistlength.toInt(), eaindex.rawAddress.toString(), restartscan, lengthreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlQueryMaximumVirtualDiskNestingLevel(): UInt =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlQueryMaximumVirtualDiskNestingLevel().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlRegisterFileSystemFilterCallbacks(filterdriverobject: ConstPtr<DriverObject>, callbacks: ConstPtr<FsFilterCallbacks>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlRegisterFileSystemFilterCallbacks(filterdriverobject.rawAddress.toString(), callbacks.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlRegisterUncProvider(muphandle: MutPtr<Handle>, redirectordevicename: ConstPtr<UnicodeString>, mailslotssupported: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlRegisterUncProvider(muphandle.rawAddress.toString(), redirectordevicename.rawAddress.toString(), mailslotssupported) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlRegisterUncProviderEx(muphandle: MutPtr<Handle>, redirdevname: ConstPtr<UnicodeString>, deviceobject: ConstPtr<DeviceObject>, flags: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlRegisterUncProviderEx(muphandle.rawAddress.toString(), redirdevname.rawAddress.toString(), deviceobject.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlRegisterUncProviderEx2(redirdevname: ConstPtr<UnicodeString>, deviceobject: ConstPtr<DeviceObject>, registration: ConstPtr<FsrtlUncProviderRegistration>, muphandle: MutPtr<Handle>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlRegisterUncProviderEx2(redirdevname.rawAddress.toString(), deviceobject.rawAddress.toString(), registration.rawAddress.toString(), muphandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlReleaseFile(fileobject: ConstPtr<FileObject>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlReleaseFile(fileobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlRemoveBaseMcbEntry(mcb: MutPtr<BaseMcb>, vbn: Long, sectorcount: Long): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlRemoveBaseMcbEntry(mcb.rawAddress.toString(), vbn.toString(), sectorcount.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlRemoveDotsFromPath(originalstring: Pwstr, pathlength: UShort, newlength: MutPtr<UShort>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlRemoveDotsFromPath(originalstring.rawAddress.toString(), pathlength.toInt(), newlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlRemoveExtraCreateParameter(ecplist: MutPtr<EcpList>, ecptype: ConstPtr<Guid>, ecpcontext: MutPtr<MutPtr<CVoid>>, ecpcontextsize: MutPtr<UInt>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlRemoveExtraCreateParameter(ecplist.rawAddress.toString(), ecptype.rawAddress.toString(), ecpcontext.rawAddress.toString(), ecpcontextsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlRemoveLargeMcbEntry(mcb: MutPtr<LargeMcb>, vbn: Long, sectorcount: Long) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlRemoveLargeMcbEntry(mcb.rawAddress.toString(), vbn.toString(), sectorcount.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlRemoveMcbEntry(mcb: MutPtr<Mcb>, vbn: UInt, sectorcount: UInt) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlRemoveMcbEntry(mcb.rawAddress.toString(), vbn.toInt(), sectorcount.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlRemovePerFileContext(perfilecontextpointer: ConstPtr<ConstPtr<CVoid>>, ownerid: ConstPtr<CVoid>, instanceid: ConstPtr<CVoid>): MutPtr<FsrtlPerFileContext> =
    if (windowsWdkStorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemFsRtlRemovePerFileContext(perfilecontextpointer.rawAddress.toString(), ownerid.rawAddress.toString(), instanceid.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlRemovePerFileObjectContext(fileobject: ConstPtr<FileObject>, ownerid: ConstPtr<CVoid>, instanceid: ConstPtr<CVoid>): MutPtr<FsrtlPerFileobjectContext> =
    if (windowsWdkStorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemFsRtlRemovePerFileObjectContext(fileobject.rawAddress.toString(), ownerid.rawAddress.toString(), instanceid.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlRemovePerStreamContext(streamcontext: ConstPtr<FsrtlAdvancedFcbHeader>, ownerid: ConstPtr<CVoid>, instanceid: ConstPtr<CVoid>): MutPtr<FsrtlPerStreamContext> =
    if (windowsWdkStorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemFsRtlRemovePerStreamContext(streamcontext.rawAddress.toString(), ownerid.rawAddress.toString(), instanceid.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlResetBaseMcb(mcb: MutPtr<BaseMcb>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlResetBaseMcb(mcb.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlResetLargeMcb(mcb: MutPtr<LargeMcb>, selfsynchronized: Boolean) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlResetLargeMcb(mcb.rawAddress.toString(), selfsynchronized)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlSetDriverBacking(driverobj: ConstPtr<DriverObject>, flags: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlSetDriverBacking(driverobj.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlSetEcpListIntoIrp(irp: MutPtr<Irp>, ecplist: ConstPtr<EcpList>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlSetEcpListIntoIrp(irp.rawAddress.toString(), ecplist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlSetKernelEaFile(fileobject: ConstPtr<FileObject>, eabuffer: ConstPtr<CVoid>, length: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlSetKernelEaFile(fileobject.rawAddress.toString(), eabuffer.rawAddress.toString(), length.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlSplitBaseMcb(mcb: MutPtr<BaseMcb>, vbn: Long, amount: Long): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlSplitBaseMcb(mcb.rawAddress.toString(), vbn.toString(), amount.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlSplitLargeMcb(mcb: MutPtr<LargeMcb>, vbn: Long, amount: Long): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlSplitLargeMcb(mcb.rawAddress.toString(), vbn.toString(), amount.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlTeardownPerFileContexts(perfilecontextpointer: ConstPtr<ConstPtr<CVoid>>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlTeardownPerFileContexts(perfilecontextpointer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlTeardownPerStreamContexts(advancedheader: ConstPtr<FsrtlAdvancedFcbHeader>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlTeardownPerStreamContexts(advancedheader.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlTruncateBaseMcb(mcb: MutPtr<BaseMcb>, vbn: Long) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlTruncateBaseMcb(mcb.rawAddress.toString(), vbn.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlTruncateLargeMcb(mcb: MutPtr<LargeMcb>, vbn: Long) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlTruncateLargeMcb(mcb.rawAddress.toString(), vbn.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlTruncateMcb(mcb: MutPtr<Mcb>, vbn: UInt) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlTruncateMcb(mcb.rawAddress.toString(), vbn.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlUninitializeBaseMcb(mcb: ConstPtr<BaseMcb>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlUninitializeBaseMcb(mcb.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlUninitializeFileLock(filelock: MutPtr<FileLock>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlUninitializeFileLock(filelock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlUninitializeLargeMcb(mcb: MutPtr<LargeMcb>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlUninitializeLargeMcb(mcb.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlUninitializeMcb(mcb: MutPtr<Mcb>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlUninitializeMcb(mcb.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlUninitializeOplock(oplock: MutPtr<MutPtr<CVoid>>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlUninitializeOplock(oplock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlUpdateDiskCounters(bytesread: ULong, byteswritten: ULong) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemFsRtlUpdateDiskCounters(bytesread.toString(), byteswritten.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlUpperOplockFsctrl(oplock: ConstPtr<ConstPtr<CVoid>>, irp: ConstPtr<Irp>, opencount: UInt, loweroplockstate: UInt, flags: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlUpperOplockFsctrl(oplock.rawAddress.toString(), irp.rawAddress.toString(), opencount.toInt(), loweroplockstate.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlValidateReparsePointBuffer(bufferlength: UInt, reparsebuffer: ConstPtr<ReparseDataBuffer>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlValidateReparsePointBuffer(bufferlength.toInt(), reparsebuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsRtlVolumeDeviceToCorrelationId(volumedeviceobject: ConstPtr<DeviceObject>, guid: MutPtr<Guid>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemFsRtlVolumeDeviceToCorrelationId(volumedeviceobject.rawAddress.toString(), guid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSecurityUserInfo(logonid: ConstPtr<Luid>, flags: UInt, userinformation: MutPtr<MutPtr<SecurityUserData>>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemGetSecurityUserInfo(logonid.rawAddress.toString(), flags.toInt(), userinformation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAcquireVpbSpinLock(irql: MutPtr<UByte>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemIoAcquireVpbSpinLock(irql.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioApplyPriorityInfoThread(inputpriorityinfo: ConstPtr<IoPriorityInfo>, outputpriorityinfo: MutPtr<IoPriorityInfo>, thread: Pethread): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemIoApplyPriorityInfoThread(inputpriorityinfo.rawAddress.toString(), outputpriorityinfo.rawAddress.toString(), thread.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCheckDesiredAccess(desiredaccess: MutPtr<UInt>, grantedaccess: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemIoCheckDesiredAccess(desiredaccess.rawAddress.toString(), grantedaccess.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCheckEaBufferValidity(eabuffer: ConstPtr<FileFullEaInformation>, ealength: UInt, erroroffset: MutPtr<UInt>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemIoCheckEaBufferValidity(eabuffer.rawAddress.toString(), ealength.toInt(), erroroffset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCheckFunctionAccess(grantedaccess: UInt, majorfunction: UByte, minorfunction: UByte, iocontrolcode: UInt, arg1: ConstPtr<CVoid>, arg2: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemIoCheckFunctionAccess(grantedaccess.toInt(), majorfunction.toInt(), minorfunction.toInt(), iocontrolcode.toInt(), arg1.rawAddress.toString(), arg2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCheckQuerySetFileInformation(fileinformationclass: FileInformationClass, length: UInt, setoperation: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemIoCheckQuerySetFileInformation(fileinformationclass, length.toInt(), setoperation) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCheckQuerySetVolumeInformation(fsinformationclass: FsInformationClass, length: UInt, setoperation: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemIoCheckQuerySetVolumeInformation(fsinformationclass, length.toInt(), setoperation) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCheckQuotaBufferValidity(quotabuffer: ConstPtr<FileQuotaInformation>, quotalength: UInt, erroroffset: MutPtr<UInt>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemIoCheckQuotaBufferValidity(quotabuffer.rawAddress.toString(), quotalength.toInt(), erroroffset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioClearFsTrackOffsetState(irp: MutPtr<Irp>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemIoClearFsTrackOffsetState(irp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCreateStreamFileObject(fileobject: ConstPtr<FileObject>, deviceobject: ConstPtr<DeviceObject>): MutPtr<FileObject> =
    if (windowsWdkStorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemIoCreateStreamFileObject(fileobject.rawAddress.toString(), deviceobject.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCreateStreamFileObjectEx(fileobject: ConstPtr<FileObject>, deviceobject: ConstPtr<DeviceObject>, filehandle: MutPtr<Handle>): MutPtr<FileObject> =
    if (windowsWdkStorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemIoCreateStreamFileObjectEx(fileobject.rawAddress.toString(), deviceobject.rawAddress.toString(), filehandle.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCreateStreamFileObjectEx2(createoptions: ConstPtr<IoCreateStreamFileOptions>, fileobject: ConstPtr<FileObject>, deviceobject: ConstPtr<DeviceObject>, streamfileobject: MutPtr<MutPtr<FileObject>>, filehandle: MutPtr<Handle>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemIoCreateStreamFileObjectEx2(createoptions.rawAddress.toString(), fileobject.rawAddress.toString(), deviceobject.rawAddress.toString(), streamfileobject.rawAddress.toString(), filehandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCreateStreamFileObjectLite(fileobject: ConstPtr<FileObject>, deviceobject: ConstPtr<DeviceObject>): MutPtr<FileObject> =
    if (windowsWdkStorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemIoCreateStreamFileObjectLite(fileobject.rawAddress.toString(), deviceobject.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioEnumerateDeviceObjectList(driverobject: ConstPtr<DriverObject>, deviceobjectlist: MutPtr<MutPtr<DeviceObject>>, deviceobjectlistsize: UInt, actualnumberdeviceobjects: MutPtr<UInt>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemIoEnumerateDeviceObjectList(driverobject.rawAddress.toString(), deviceobjectlist.rawAddress.toString(), deviceobjectlistsize.toInt(), actualnumberdeviceobjects.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioEnumerateRegisteredFiltersList(driverobjectlist: MutPtr<MutPtr<DriverObject>>, driverobjectlistsize: UInt, actualnumberdriverobjects: MutPtr<UInt>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemIoEnumerateRegisteredFiltersList(driverobjectlist.rawAddress.toString(), driverobjectlistsize.toInt(), actualnumberdriverobjects.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioFastQueryNetworkAttributes(objectattributes: ConstPtr<ObjectAttributes>, desiredaccess: UInt, openoptions: UInt, iostatus: MutPtr<IoStatusBlock>, buffer: MutPtr<FileNetworkOpenInformation>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemIoFastQueryNetworkAttributes(objectattributes.rawAddress.toString(), desiredaccess.toInt(), openoptions.toInt(), iostatus.rawAddress.toString(), buffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetAttachedDevice(deviceobject: ConstPtr<DeviceObject>): MutPtr<DeviceObject> =
    if (windowsWdkStorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemIoGetAttachedDevice(deviceobject.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetBaseFileSystemDeviceObject(fileobject: ConstPtr<FileObject>): MutPtr<DeviceObject> =
    if (windowsWdkStorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemIoGetBaseFileSystemDeviceObject(fileobject.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetDeviceAttachmentBaseRef(deviceobject: ConstPtr<DeviceObject>): MutPtr<DeviceObject> =
    if (windowsWdkStorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemIoGetDeviceAttachmentBaseRef(deviceobject.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetDeviceToVerify(thread: Pethread): MutPtr<DeviceObject> =
    if (windowsWdkStorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemIoGetDeviceToVerify(thread.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetDiskDeviceObject(filesystemdeviceobject: ConstPtr<DeviceObject>, diskdeviceobject: MutPtr<MutPtr<DeviceObject>>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemIoGetDiskDeviceObject(filesystemdeviceobject.rawAddress.toString(), diskdeviceobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetFsTrackOffsetState(irp: ConstPtr<Irp>, retfstrackoffsetblob: MutPtr<MutPtr<IoIrpExtTrackOffsetHeader>>, rettrackedoffset: MutPtr<Long>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemIoGetFsTrackOffsetState(irp.rawAddress.toString(), retfstrackoffsetblob.rawAddress.toString(), rettrackedoffset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetLowerDeviceObject(deviceobject: ConstPtr<DeviceObject>): MutPtr<DeviceObject> =
    if (windowsWdkStorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemIoGetLowerDeviceObject(deviceobject.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetOplockKeyContext(fileobject: ConstPtr<FileObject>): MutPtr<OplockKeyEcpContext> =
    if (windowsWdkStorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemIoGetOplockKeyContext(fileobject.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetOplockKeyContextEx(fileobject: ConstPtr<FileObject>): MutPtr<OplockKeyContext> =
    if (windowsWdkStorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemIoGetOplockKeyContextEx(fileobject.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetRequestorProcess(irp: ConstPtr<Irp>): Peprocess =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemIoGetRequestorProcess(irp.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetRequestorProcessId(irp: ConstPtr<Irp>): UInt =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemIoGetRequestorProcessId(irp.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetRequestorSessionId(irp: ConstPtr<Irp>, psessionid: MutPtr<UInt>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemIoGetRequestorSessionId(irp.rawAddress.toString(), psessionid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioIrpHasFsTrackOffsetExtensionType(irp: ConstPtr<Irp>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemIoIrpHasFsTrackOffsetExtensionType(irp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioIsOperationSynchronous(irp: ConstPtr<Irp>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemIoIsOperationSynchronous(irp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioIsSystemThread(thread: Pethread): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemIoIsSystemThread(thread.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioIsValidNameGraftingBuffer(irp: ConstPtr<Irp>, reparsebuffer: ConstPtr<ReparseDataBuffer>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemIoIsValidNameGraftingBuffer(irp.rawAddress.toString(), reparsebuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioPageRead(fileobject: ConstPtr<FileObject>, memorydescriptorlist: ConstPtr<Mdl>, startingoffset: ConstPtr<Long>, event: ConstPtr<Kevent>, iostatusblock: MutPtr<IoStatusBlock>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemIoPageRead(fileobject.rawAddress.toString(), memorydescriptorlist.rawAddress.toString(), startingoffset.rawAddress.toString(), event.rawAddress.toString(), iostatusblock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioQueryFileDosDeviceName(fileobject: ConstPtr<FileObject>, objectnameinformation: MutPtr<MutPtr<ObjectNameInformation>>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemIoQueryFileDosDeviceName(fileobject.rawAddress.toString(), objectnameinformation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioQueryFileInformation(fileobject: ConstPtr<FileObject>, fileinformationclass: FileInformationClass, length: UInt, fileinformation: MutPtr<CVoid>, returnedlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemIoQueryFileInformation(fileobject.rawAddress.toString(), fileinformationclass, length.toInt(), fileinformation.rawAddress.toString(), returnedlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioQueryVolumeInformation(fileobject: ConstPtr<FileObject>, fsinformationclass: FsInformationClass, length: UInt, fsinformation: MutPtr<CVoid>, returnedlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemIoQueryVolumeInformation(fileobject.rawAddress.toString(), fsinformationclass, length.toInt(), fsinformation.rawAddress.toString(), returnedlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioQueueThreadIrp(irp: ConstPtr<Irp>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemIoQueueThreadIrp(irp.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioRegisterFileSystem(deviceobject: ConstPtr<DeviceObject>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemIoRegisterFileSystem(deviceobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioRegisterFsRegistrationChange(driverobject: ConstPtr<DriverObject>, drivernotificationroutine: DriverFsNotification): Ntstatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioRegisterFsRegistrationChangeMountAware(driverobject: ConstPtr<DriverObject>, drivernotificationroutine: DriverFsNotification, synchronizewithmounts: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioReleaseVpbSpinLock(irql: UByte) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemIoReleaseVpbSpinLock(irql.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioReplaceFileObjectName(fileobject: ConstPtr<FileObject>, newfilename: Pcwstr, filenamelength: UShort): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemIoReplaceFileObjectName(fileobject.rawAddress.toString(), newfilename.rawAddress.toString(), filenamelength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioRequestDeviceRemovalForReset(physicaldeviceobject: ConstPtr<DeviceObject>, flags: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemIoRequestDeviceRemovalForReset(physicaldeviceobject.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioRetrievePriorityInfo(irp: ConstPtr<Irp>, fileobject: ConstPtr<FileObject>, thread: Pethread, priorityinfo: MutPtr<IoPriorityInfo>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemIoRetrievePriorityInfo(irp.rawAddress.toString(), fileobject.rawAddress.toString(), thread.toString(), priorityinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetDeviceToVerify(thread: Pethread, deviceobject: ConstPtr<DeviceObject>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemIoSetDeviceToVerify(thread.toString(), deviceobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioSetFsTrackOffsetState(irp: MutPtr<Irp>, fstrackoffsetblob: ConstPtr<IoIrpExtTrackOffsetHeader>, trackedoffset: Long): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemIoSetFsTrackOffsetState(irp.rawAddress.toString(), fstrackoffsetblob.rawAddress.toString(), trackedoffset.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetInformation(fileobject: ConstPtr<FileObject>, fileinformationclass: FileInformationClass, length: UInt, fileinformation: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemIoSetInformation(fileobject.rawAddress.toString(), fileinformationclass, length.toInt(), fileinformation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSynchronousPageWrite(fileobject: ConstPtr<FileObject>, memorydescriptorlist: ConstPtr<Mdl>, startingoffset: ConstPtr<Long>, event: ConstPtr<Kevent>, iostatusblock: MutPtr<IoStatusBlock>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemIoSynchronousPageWrite(fileobject.rawAddress.toString(), memorydescriptorlist.rawAddress.toString(), startingoffset.rawAddress.toString(), event.rawAddress.toString(), iostatusblock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioThreadToProcess(thread: Pethread): Peprocess =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemIoThreadToProcess(thread.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioUnregisterFileSystem(deviceobject: ConstPtr<DeviceObject>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemIoUnregisterFileSystem(deviceobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioUnregisterFsRegistrationChange(driverobject: ConstPtr<DriverObject>, drivernotificationroutine: DriverFsNotification): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioVerifyVolume(deviceobject: ConstPtr<DeviceObject>, allowrawmount: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemIoVerifyVolume(deviceobject.rawAddress.toString(), allowrawmount) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keAcquireQueuedSpinLock(number: KspinLockQueueNumber): UByte =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemKeAcquireQueuedSpinLock(number).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keAcquireSpinLockRaiseToSynch(spinlock: MutPtr<ULong>): UByte =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemKeAcquireSpinLockRaiseToSynch(spinlock.rawAddress.toString()).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keAttachProcess(process: Prkprocess) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemKeAttachProcess(process.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keDetachProcess() {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemKeDetachProcess()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keInitializeMutant(mutant: MutPtr<Kmutant>, initialowner: Boolean) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemKeInitializeMutant(mutant.rawAddress.toString(), initialowner)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keInitializeQueue(queue: MutPtr<Kqueue>, count: UInt) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemKeInitializeQueue(queue.rawAddress.toString(), count.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keInsertHeadQueue(queue: MutPtr<Kqueue>, entry: MutPtr<ListEntry>): Int =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemKeInsertHeadQueue(queue.rawAddress.toString(), entry.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keInsertQueue(queue: MutPtr<Kqueue>, entry: MutPtr<ListEntry>): Int =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemKeInsertQueue(queue.rawAddress.toString(), entry.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keReadStateMutant(mutant: ConstPtr<Kmutant>): Int =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemKeReadStateMutant(mutant.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keReadStateQueue(queue: ConstPtr<Kqueue>): Int =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemKeReadStateQueue(queue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keReleaseMutant(mutant: MutPtr<Kmutant>, increment: Int, abandoned: Boolean, wait: Boolean): Int =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemKeReleaseMutant(mutant.rawAddress.toString(), increment, abandoned, wait) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keReleaseQueuedSpinLock(number: KspinLockQueueNumber, oldirql: UByte) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemKeReleaseQueuedSpinLock(number, oldirql.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keRemoveQueue(queue: MutPtr<Kqueue>, waitmode: Byte, timeout: ConstPtr<Long>): MutPtr<ListEntry> =
    if (windowsWdkStorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemKeRemoveQueue(queue.rawAddress.toString(), waitmode.toInt(), timeout.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keRemoveQueueEx(queue: MutPtr<Kqueue>, waitmode: Byte, alertable: Boolean, timeout: ConstPtr<Long>, entryarray: MutPtr<MutPtr<ListEntry>>, count: UInt): UInt =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemKeRemoveQueueEx(queue.rawAddress.toString(), waitmode.toInt(), alertable, timeout.rawAddress.toString(), entryarray.rawAddress.toString(), count.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keRundownQueue(queue: MutPtr<Kqueue>): MutPtr<ListEntry> =
    if (windowsWdkStorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemKeRundownQueue(queue.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keSetIdealProcessorThread(thread: Pkthread, processor: UByte): UByte =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemKeSetIdealProcessorThread(thread.toString(), processor.toInt()).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keSetKernelStackSwapEnable(enable: Boolean): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemKeSetKernelStackSwapEnable(enable) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keStackAttachProcess(process: Prkprocess, apcstate: MutPtr<KapcState>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemKeStackAttachProcess(process.toString(), apcstate.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keTryToAcquireQueuedSpinLock(number: KspinLockQueueNumber, oldirql: MutPtr<UByte>): UInt =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemKeTryToAcquireQueuedSpinLock(number, oldirql.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keUnstackDetachProcess(apcstate: ConstPtr<KapcState>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemKeUnstackDetachProcess(apcstate.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun makeSignature(phcontext: ConstPtr<SecHandle>, fqop: UInt, pmessage: ConstPtr<SecBufferDesc>, messageseqno: UInt): Hresult =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMakeSignature(phcontext.rawAddress.toString(), fqop.toInt(), pmessage.rawAddress.toString(), messageseqno.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapSecurityError(secstatus: Hresult): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMapSecurityError(secstatus) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmCanFileBeTruncated(sectionpointer: ConstPtr<SectionObjectPointers>, newfilesize: ConstPtr<Long>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMmCanFileBeTruncated(sectionpointer.rawAddress.toString(), newfilesize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmDoesFileHaveUserWritableReferences(sectionpointer: ConstPtr<SectionObjectPointers>): UInt =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMmDoesFileHaveUserWritableReferences(sectionpointer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmFlushImageSection(sectionobjectpointer: ConstPtr<SectionObjectPointers>, flushtype: MmflushType): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMmFlushImageSection(sectionobjectpointer.rawAddress.toString(), flushtype) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmForceSectionClosed(sectionobjectpointer: ConstPtr<SectionObjectPointers>, delayclose: Boolean): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMmForceSectionClosed(sectionobjectpointer.rawAddress.toString(), delayclose) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmForceSectionClosedEx(sectionobjectpointer: ConstPtr<SectionObjectPointers>, forcecloseflags: UInt): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMmForceSectionClosedEx(sectionobjectpointer.rawAddress.toString(), forcecloseflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmGetMaximumFileSectionSize(): ULong =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMmGetMaximumFileSectionSize().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmIsFileSectionActive(fssectionpointer: ConstPtr<SectionObjectPointers>, flags: UInt, sectionisactive: MutPtr<UInt>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMmIsFileSectionActive(fssectionpointer.rawAddress.toString(), flags.toInt(), sectionisactive.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmIsRecursiveIoFault(): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMmIsRecursiveIoFault() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmMdlPagesAreZero(mdl: ConstPtr<Mdl>): UInt =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMmMdlPagesAreZero(mdl.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmPrefetchPages(numberoflists: UInt, readlists: ConstPtr<ConstPtr<ReadList>>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMmPrefetchPages(numberoflists.toInt(), readlists.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmSetAddressRangeModified(address: ConstPtr<CVoid>, length: ULong): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemMmSetAddressRangeModified(address.rawAddress.toString(), length.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntAccessCheckAndAuditAlarm(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, objecttypename: ConstPtr<UnicodeString>, objectname: ConstPtr<UnicodeString>, securitydescriptor: PsecurityDescriptor, desiredaccess: UInt, genericmapping: ConstPtr<GenericMapping>, objectcreation: Boolean, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Int>, generateonclose: MutPtr<Boolean>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtAccessCheckAndAuditAlarm(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), objecttypename.rawAddress.toString(), objectname.rawAddress.toString(), securitydescriptor.rawAddress.toString(), desiredaccess.toInt(), genericmapping.rawAddress.toString(), objectcreation, grantedaccess.rawAddress.toString(), accessstatus.rawAddress.toString(), generateonclose.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntAccessCheckByTypeAndAuditAlarm(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, objecttypename: ConstPtr<UnicodeString>, objectname: ConstPtr<UnicodeString>, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: ConstPtr<ObjectTypeList>, objecttypelistlength: UInt, genericmapping: ConstPtr<GenericMapping>, objectcreation: Boolean, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Int>, generateonclose: MutPtr<Boolean>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtAccessCheckByTypeAndAuditAlarm(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), objecttypename.rawAddress.toString(), objectname.rawAddress.toString(), securitydescriptor.rawAddress.toString(), principalselfsid.rawAddress.toString(), desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.rawAddress.toString(), objecttypelistlength.toInt(), genericmapping.rawAddress.toString(), objectcreation, grantedaccess.rawAddress.toString(), accessstatus.rawAddress.toString(), generateonclose.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntAccessCheckByTypeResultListAndAuditAlarm(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, objecttypename: ConstPtr<UnicodeString>, objectname: ConstPtr<UnicodeString>, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: ConstPtr<ObjectTypeList>, objecttypelistlength: UInt, genericmapping: ConstPtr<GenericMapping>, objectcreation: Boolean, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Int>, generateonclose: MutPtr<Boolean>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtAccessCheckByTypeResultListAndAuditAlarm(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), objecttypename.rawAddress.toString(), objectname.rawAddress.toString(), securitydescriptor.rawAddress.toString(), principalselfsid.rawAddress.toString(), desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.rawAddress.toString(), objecttypelistlength.toInt(), genericmapping.rawAddress.toString(), objectcreation, grantedaccess.rawAddress.toString(), accessstatus.rawAddress.toString(), generateonclose.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, clienttoken: Handle, objecttypename: ConstPtr<UnicodeString>, objectname: ConstPtr<UnicodeString>, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: ConstPtr<ObjectTypeList>, objecttypelistlength: UInt, genericmapping: ConstPtr<GenericMapping>, objectcreation: Boolean, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Int>, generateonclose: MutPtr<Boolean>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), clienttoken.rawAddress.toString(), objecttypename.rawAddress.toString(), objectname.rawAddress.toString(), securitydescriptor.rawAddress.toString(), principalselfsid.rawAddress.toString(), desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.rawAddress.toString(), objecttypelistlength.toInt(), genericmapping.rawAddress.toString(), objectcreation, grantedaccess.rawAddress.toString(), accessstatus.rawAddress.toString(), generateonclose.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntAdjustGroupsToken(tokenhandle: Handle, resettodefault: Boolean, newstate: ConstPtr<TokenGroups>, bufferlength: UInt, previousstate: MutPtr<TokenGroups>, returnlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtAdjustGroupsToken(tokenhandle.rawAddress.toString(), resettodefault, newstate.rawAddress.toString(), bufferlength.toInt(), previousstate.rawAddress.toString(), returnlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntAdjustPrivilegesToken(tokenhandle: Handle, disableallprivileges: Boolean, newstate: ConstPtr<TokenPrivileges>, bufferlength: UInt, previousstate: MutPtr<TokenPrivileges>, returnlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtAdjustPrivilegesToken(tokenhandle.rawAddress.toString(), disableallprivileges, newstate.rawAddress.toString(), bufferlength.toInt(), previousstate.rawAddress.toString(), returnlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntAllocateVirtualMemory(processhandle: Handle, baseaddress: MutPtr<MutPtr<CVoid>>, zerobits: ULong, regionsize: MutPtr<ULong>, allocationtype: UInt, protect: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtAllocateVirtualMemory(processhandle.rawAddress.toString(), baseaddress.rawAddress.toString(), zerobits.toString(), regionsize.rawAddress.toString(), allocationtype.toInt(), protect.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntAllocateVirtualMemoryEx(processhandle: Handle, baseaddress: MutPtr<MutPtr<CVoid>>, regionsize: MutPtr<ULong>, allocationtype: UInt, pageprotection: UInt, extendedparameters: MutPtr<MemExtendedParameter>, extendedparametercount: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtAllocateVirtualMemoryEx(processhandle.rawAddress.toString(), baseaddress.rawAddress.toString(), regionsize.rawAddress.toString(), allocationtype.toInt(), pageprotection.toInt(), extendedparameters.rawAddress.toString(), extendedparametercount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCancelIoFileEx(filehandle: Handle, iorequesttocancel: ConstPtr<IoStatusBlock>, iostatusblock: MutPtr<IoStatusBlock>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtCancelIoFileEx(filehandle.rawAddress.toString(), iorequesttocancel.rawAddress.toString(), iostatusblock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCloseObjectAuditAlarm(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, generateonclose: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtCloseObjectAuditAlarm(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), generateonclose) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCreateDirectoryObject(directoryhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtCreateDirectoryObject(directoryhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCreateEvent(eventhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, eventtype: EventType, initialstate: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtCreateEvent(eventhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), eventtype, initialstate) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCreateFile(filehandle: MutPtr<Handle>, desiredaccess: FileAccessRights, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, allocationsize: ConstPtr<Long>, fileattributes: FileFlagsAndAttributes, shareaccess: FileShareMode, createdisposition: NtcreatefileCreateDisposition, createoptions: NtcreatefileCreateOptions, eabuffer: ConstPtr<CVoid>, ealength: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtCreateFile(filehandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), iostatusblock.rawAddress.toString(), allocationsize.rawAddress.toString(), fileattributes.toInt(), shareaccess.toInt(), createdisposition.toInt(), createoptions.toInt(), eabuffer.rawAddress.toString(), ealength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCreateSection(sectionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, maximumsize: ConstPtr<Long>, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Handle): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtCreateSection(sectionhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), maximumsize.rawAddress.toString(), sectionpageprotection.toInt(), allocationattributes.toInt(), filehandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCreateSectionEx(sectionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, maximumsize: ConstPtr<Long>, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Handle, extendedparameters: MutPtr<MemExtendedParameter>, extendedparametercount: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtCreateSectionEx(sectionhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), maximumsize.rawAddress.toString(), sectionpageprotection.toInt(), allocationattributes.toInt(), filehandle.rawAddress.toString(), extendedparameters.rawAddress.toString(), extendedparametercount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntDeleteFile(objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtDeleteFile(objectattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntDeleteObjectAuditAlarm(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, generateonclose: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtDeleteObjectAuditAlarm(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), generateonclose) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntDuplicateObject(sourceprocesshandle: Handle, sourcehandle: Handle, targetprocesshandle: Handle, targethandle: MutPtr<Handle>, desiredaccess: UInt, handleattributes: UInt, options: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtDuplicateObject(sourceprocesshandle.rawAddress.toString(), sourcehandle.rawAddress.toString(), targetprocesshandle.rawAddress.toString(), targethandle.rawAddress.toString(), desiredaccess.toInt(), handleattributes.toInt(), options.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntDuplicateToken(existingtokenhandle: Handle, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, effectiveonly: Boolean, tokentype: TokenType, newtokenhandle: MutPtr<Handle>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtDuplicateToken(existingtokenhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), effectiveonly, tokentype, newtokenhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntFilterToken(existingtokenhandle: Handle, flags: UInt, sidstodisable: ConstPtr<TokenGroups>, privilegestodelete: ConstPtr<TokenPrivileges>, restrictedsids: ConstPtr<TokenGroups>, newtokenhandle: MutPtr<Handle>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtFilterToken(existingtokenhandle.rawAddress.toString(), flags.toInt(), sidstodisable.rawAddress.toString(), privilegestodelete.rawAddress.toString(), restrictedsids.rawAddress.toString(), newtokenhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntFlushBuffersFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtFlushBuffersFile(filehandle.rawAddress.toString(), iostatusblock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntFlushBuffersFileEx(filehandle: Handle, flags: UInt, parameters: ConstPtr<CVoid>, parameterssize: UInt, iostatusblock: MutPtr<IoStatusBlock>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtFlushBuffersFileEx(filehandle.rawAddress.toString(), flags.toInt(), parameters.rawAddress.toString(), parameterssize.toInt(), iostatusblock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntFlushVirtualMemory(processhandle: Handle, baseaddress: MutPtr<MutPtr<CVoid>>, regionsize: MutPtr<ULong>, iostatus: MutPtr<IoStatusBlock>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtFlushVirtualMemory(processhandle.rawAddress.toString(), baseaddress.rawAddress.toString(), regionsize.rawAddress.toString(), iostatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntFreeVirtualMemory(processhandle: Handle, baseaddress: MutPtr<MutPtr<CVoid>>, regionsize: MutPtr<ULong>, freetype: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtFreeVirtualMemory(processhandle.rawAddress.toString(), baseaddress.rawAddress.toString(), regionsize.rawAddress.toString(), freetype.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntFsControlFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, fscontrolcode: UInt, inputbuffer: ConstPtr<CVoid>, inputbufferlength: UInt, outputbuffer: MutPtr<CVoid>, outputbufferlength: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtFsControlFile(filehandle.rawAddress.toString(), event.rawAddress.toString(), 0L.toString(), apccontext.rawAddress.toString(), iostatusblock.rawAddress.toString(), fscontrolcode.toInt(), inputbuffer.rawAddress.toString(), inputbufferlength.toInt(), outputbuffer.rawAddress.toString(), outputbufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntImpersonateAnonymousToken(threadhandle: Handle): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtImpersonateAnonymousToken(threadhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntLockFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, byteoffset: ConstPtr<Long>, length: ConstPtr<Long>, key: UInt, failimmediately: Boolean, exclusivelock: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtLockFile(filehandle.rawAddress.toString(), event.rawAddress.toString(), 0L.toString(), apccontext.rawAddress.toString(), iostatusblock.rawAddress.toString(), byteoffset.rawAddress.toString(), length.rawAddress.toString(), key.toInt(), failimmediately, exclusivelock) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntNotifyChangeKey(keyhandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, completionfilter: UInt, watchtree: Boolean, buffer: MutPtr<CVoid>, buffersize: UInt, asynchronous: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtNotifyChangeKey(keyhandle.rawAddress.toString(), event.rawAddress.toString(), 0L.toString(), apccontext.rawAddress.toString(), iostatusblock.rawAddress.toString(), completionfilter.toInt(), watchtree, buffer.rawAddress.toString(), buffersize.toInt(), asynchronous) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenDirectoryObject(directoryhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtOpenDirectoryObject(directoryhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenFile(filehandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, shareaccess: UInt, openoptions: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtOpenFile(filehandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), iostatusblock.rawAddress.toString(), shareaccess.toInt(), openoptions.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenObjectAuditAlarm(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, objecttypename: ConstPtr<UnicodeString>, objectname: ConstPtr<UnicodeString>, securitydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, grantedaccess: UInt, privileges: ConstPtr<PrivilegeSet>, objectcreation: Boolean, accessgranted: Boolean, generateonclose: MutPtr<Boolean>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtOpenObjectAuditAlarm(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), objecttypename.rawAddress.toString(), objectname.rawAddress.toString(), securitydescriptor.rawAddress.toString(), clienttoken.rawAddress.toString(), desiredaccess.toInt(), grantedaccess.toInt(), privileges.rawAddress.toString(), objectcreation, accessgranted, generateonclose.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenProcessToken(processhandle: Handle, desiredaccess: UInt, tokenhandle: MutPtr<Handle>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtOpenProcessToken(processhandle.rawAddress.toString(), desiredaccess.toInt(), tokenhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenProcessTokenEx(processhandle: Handle, desiredaccess: UInt, handleattributes: UInt, tokenhandle: MutPtr<Handle>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtOpenProcessTokenEx(processhandle.rawAddress.toString(), desiredaccess.toInt(), handleattributes.toInt(), tokenhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenSymbolicLinkObject(linkhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtOpenSymbolicLinkObject(linkhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenThreadToken(threadhandle: Handle, desiredaccess: UInt, openasself: Boolean, tokenhandle: MutPtr<Handle>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtOpenThreadToken(threadhandle.rawAddress.toString(), desiredaccess.toInt(), openasself, tokenhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenThreadTokenEx(threadhandle: Handle, desiredaccess: UInt, openasself: Boolean, handleattributes: UInt, tokenhandle: MutPtr<Handle>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtOpenThreadTokenEx(threadhandle.rawAddress.toString(), desiredaccess.toInt(), openasself, handleattributes.toInt(), tokenhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntPrivilegeCheck(clienttoken: Handle, requiredprivileges: MutPtr<PrivilegeSet>, result: MutPtr<Boolean>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtPrivilegeCheck(clienttoken.rawAddress.toString(), requiredprivileges.rawAddress.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntPrivilegeObjectAuditAlarm(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, clienttoken: Handle, desiredaccess: UInt, privileges: ConstPtr<PrivilegeSet>, accessgranted: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtPrivilegeObjectAuditAlarm(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), clienttoken.rawAddress.toString(), desiredaccess.toInt(), privileges.rawAddress.toString(), accessgranted) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntPrivilegedServiceAuditAlarm(subsystemname: ConstPtr<UnicodeString>, servicename: ConstPtr<UnicodeString>, clienttoken: Handle, privileges: ConstPtr<PrivilegeSet>, accessgranted: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtPrivilegedServiceAuditAlarm(subsystemname.rawAddress.toString(), servicename.rawAddress.toString(), clienttoken.rawAddress.toString(), privileges.rawAddress.toString(), accessgranted) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryDirectoryFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass, returnsingleentry: Boolean, filename: ConstPtr<UnicodeString>, restartscan: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtQueryDirectoryFile(filehandle.rawAddress.toString(), event.rawAddress.toString(), 0L.toString(), apccontext.rawAddress.toString(), iostatusblock.rawAddress.toString(), fileinformation.rawAddress.toString(), length.toInt(), fileinformationclass, returnsingleentry, filename.rawAddress.toString(), restartscan) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryDirectoryFileEx(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass, queryflags: UInt, filename: ConstPtr<UnicodeString>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtQueryDirectoryFileEx(filehandle.rawAddress.toString(), event.rawAddress.toString(), 0L.toString(), apccontext.rawAddress.toString(), iostatusblock.rawAddress.toString(), fileinformation.rawAddress.toString(), length.toInt(), fileinformationclass, queryflags.toInt(), filename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryDirectoryObject(directoryhandle: Handle, buffer: MutPtr<CVoid>, length: UInt, returnsingleentry: Boolean, restartscan: Boolean, context: MutPtr<UInt>, returnlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtQueryDirectoryObject(directoryhandle.rawAddress.toString(), buffer.rawAddress.toString(), length.toInt(), returnsingleentry, restartscan, context.rawAddress.toString(), returnlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryEaFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, buffer: MutPtr<CVoid>, length: UInt, returnsingleentry: Boolean, ealist: ConstPtr<CVoid>, ealistlength: UInt, eaindex: ConstPtr<UInt>, restartscan: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtQueryEaFile(filehandle.rawAddress.toString(), iostatusblock.rawAddress.toString(), buffer.rawAddress.toString(), length.toInt(), returnsingleentry, ealist.rawAddress.toString(), ealistlength.toInt(), eaindex.rawAddress.toString(), restartscan) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryFullAttributesFile(objectattributes: ConstPtr<ObjectAttributes>, fileinformation: MutPtr<FileNetworkOpenInformation>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtQueryFullAttributesFile(objectattributes.rawAddress.toString(), fileinformation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryInformationByName(objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtQueryInformationByName(objectattributes.rawAddress.toString(), iostatusblock.rawAddress.toString(), fileinformation.rawAddress.toString(), length.toInt(), fileinformationclass) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryInformationFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtQueryInformationFile(filehandle.rawAddress.toString(), iostatusblock.rawAddress.toString(), fileinformation.rawAddress.toString(), length.toInt(), fileinformationclass) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryInformationToken(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: MutPtr<CVoid>, tokeninformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtQueryInformationToken(tokenhandle.rawAddress.toString(), tokeninformationclass, tokeninformation.rawAddress.toString(), tokeninformationlength.toInt(), returnlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryQuotaInformationFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, buffer: MutPtr<CVoid>, length: UInt, returnsingleentry: Boolean, sidlist: ConstPtr<CVoid>, sidlistlength: UInt, startsid: Psid, restartscan: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtQueryQuotaInformationFile(filehandle.rawAddress.toString(), iostatusblock.rawAddress.toString(), buffer.rawAddress.toString(), length.toInt(), returnsingleentry, sidlist.rawAddress.toString(), sidlistlength.toInt(), startsid.rawAddress.toString(), restartscan) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQuerySecurityObject(handle: Handle, securityinformation: UInt, securitydescriptor: PsecurityDescriptor, length: UInt, lengthneeded: MutPtr<UInt>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtQuerySecurityObject(handle.rawAddress.toString(), securityinformation.toInt(), securitydescriptor.rawAddress.toString(), length.toInt(), lengthneeded.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQuerySymbolicLinkObject(linkhandle: Handle, linktarget: MutPtr<UnicodeString>, returnedlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtQuerySymbolicLinkObject(linkhandle.rawAddress.toString(), linktarget.rawAddress.toString(), returnedlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryVirtualMemory(processhandle: Handle, baseaddress: ConstPtr<CVoid>, memoryinformationclass: MemoryInformationClass, memoryinformation: MutPtr<CVoid>, memoryinformationlength: ULong, returnlength: MutPtr<ULong>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtQueryVirtualMemory(processhandle.rawAddress.toString(), baseaddress.rawAddress.toString(), memoryinformationclass, memoryinformation.rawAddress.toString(), memoryinformationlength.toString(), returnlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryVolumeInformationFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, fsinformation: MutPtr<CVoid>, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtQueryVolumeInformationFile(filehandle.rawAddress.toString(), iostatusblock.rawAddress.toString(), fsinformation.rawAddress.toString(), length.toInt(), fsinformationclass) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntReadFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, buffer: MutPtr<CVoid>, length: UInt, byteoffset: ConstPtr<Long>, key: ConstPtr<UInt>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtReadFile(filehandle.rawAddress.toString(), event.rawAddress.toString(), 0L.toString(), apccontext.rawAddress.toString(), iostatusblock.rawAddress.toString(), buffer.rawAddress.toString(), length.toInt(), byteoffset.rawAddress.toString(), key.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetEaFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, buffer: ConstPtr<CVoid>, length: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtSetEaFile(filehandle.rawAddress.toString(), iostatusblock.rawAddress.toString(), buffer.rawAddress.toString(), length.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetEvent(eventhandle: Handle, previousstate: MutPtr<Int>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtSetEvent(eventhandle.rawAddress.toString(), previousstate.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetInformationFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, fileinformation: ConstPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtSetInformationFile(filehandle.rawAddress.toString(), iostatusblock.rawAddress.toString(), fileinformation.rawAddress.toString(), length.toInt(), fileinformationclass) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetInformationToken(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: ConstPtr<CVoid>, tokeninformationlength: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtSetInformationToken(tokenhandle.rawAddress.toString(), tokeninformationclass, tokeninformation.rawAddress.toString(), tokeninformationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetInformationVirtualMemory(processhandle: Handle, vminformationclass: VirtualMemoryInformationClass, numberofentries: ULong, virtualaddresses: ConstPtr<MemoryRangeEntry>, vminformation: ConstPtr<CVoid>, vminformationlength: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtSetInformationVirtualMemory(processhandle.rawAddress.toString(), vminformationclass, numberofentries.toString(), virtualaddresses.rawAddress.toString(), vminformation.rawAddress.toString(), vminformationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetQuotaInformationFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, buffer: ConstPtr<CVoid>, length: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtSetQuotaInformationFile(filehandle.rawAddress.toString(), iostatusblock.rawAddress.toString(), buffer.rawAddress.toString(), length.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetSecurityObject(handle: Handle, securityinformation: UInt, securitydescriptor: PsecurityDescriptor): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtSetSecurityObject(handle.rawAddress.toString(), securityinformation.toInt(), securitydescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetVolumeInformationFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, fsinformation: ConstPtr<CVoid>, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtSetVolumeInformationFile(filehandle.rawAddress.toString(), iostatusblock.rawAddress.toString(), fsinformation.rawAddress.toString(), length.toInt(), fsinformationclass) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntUnlockFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, byteoffset: ConstPtr<Long>, length: ConstPtr<Long>, key: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtUnlockFile(filehandle.rawAddress.toString(), iostatusblock.rawAddress.toString(), byteoffset.rawAddress.toString(), length.rawAddress.toString(), key.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntWriteFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, buffer: ConstPtr<CVoid>, length: UInt, byteoffset: ConstPtr<Long>, key: ConstPtr<UInt>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemNtWriteFile(filehandle.rawAddress.toString(), event.rawAddress.toString(), 0L.toString(), apccontext.rawAddress.toString(), iostatusblock.rawAddress.toString(), buffer.rawAddress.toString(), length.toInt(), byteoffset.rawAddress.toString(), key.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obInsertObject(obj: ConstPtr<CVoid>, passedaccessstate: MutPtr<AccessState>, desiredaccess: UInt, objectpointerbias: UInt, newobject: MutPtr<MutPtr<CVoid>>, handle: MutPtr<Handle>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemObInsertObject(obj.rawAddress.toString(), passedaccessstate.rawAddress.toString(), desiredaccess.toInt(), objectpointerbias.toInt(), newobject.rawAddress.toString(), handle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obIsKernelHandle(handle: Handle): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemObIsKernelHandle(handle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obMakeTemporaryObject(obj: ConstPtr<CVoid>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemObMakeTemporaryObject(obj.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun obOpenObjectByPointer(obj: ConstPtr<CVoid>, handleattributes: UInt, passedaccessstate: ConstPtr<AccessState>, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, handle: MutPtr<Handle>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemObOpenObjectByPointer(obj.rawAddress.toString(), handleattributes.toInt(), passedaccessstate.rawAddress.toString(), desiredaccess.toInt(), objecttype.toString(), accessmode.toInt(), handle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obOpenObjectByPointerWithTag(obj: ConstPtr<CVoid>, handleattributes: UInt, passedaccessstate: ConstPtr<AccessState>, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, tag: UInt, handle: MutPtr<Handle>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemObOpenObjectByPointerWithTag(obj.rawAddress.toString(), handleattributes.toInt(), passedaccessstate.rawAddress.toString(), desiredaccess.toInt(), objecttype.toString(), accessmode.toInt(), tag.toInt(), handle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obQueryNameString(obj: ConstPtr<CVoid>, objectnameinfo: MutPtr<ObjectNameInformation>, length: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemObQueryNameString(obj.rawAddress.toString(), objectnameinfo.rawAddress.toString(), length.toInt(), returnlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obQueryObjectAuditingByHandle(handle: Handle, generateonclose: MutPtr<Boolean>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemObQueryObjectAuditingByHandle(handle.rawAddress.toString(), generateonclose.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfxFindPrefix(prefixtable: ConstPtr<PrefixTable>, fullname: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>): MutPtr<PrefixTableEntry> =
    if (windowsWdkStorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemPfxFindPrefix(prefixtable.rawAddress.toString(), fullname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfxInitialize(prefixtable: MutPtr<PrefixTable>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemPfxInitialize(prefixtable.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pfxInsertPrefix(prefixtable: ConstPtr<PrefixTable>, prefix: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, prefixtableentry: MutPtr<PrefixTableEntry>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemPfxInsertPrefix(prefixtable.rawAddress.toString(), prefix.rawAddress.toString(), prefixtableentry.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfxRemovePrefix(prefixtable: ConstPtr<PrefixTable>, prefixtableentry: ConstPtr<PrefixTableEntry>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemPfxRemovePrefix(prefixtable.rawAddress.toString(), prefixtableentry.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poQueueShutdownWorkItem(workitem: MutPtr<WorkQueueItem>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemPoQueueShutdownWorkItem(workitem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psAssignImpersonationToken(thread: Pethread, token: Handle): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemPsAssignImpersonationToken(thread.toString(), token.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psChargePoolQuota(process: Peprocess, pooltype: PoolType, amount: ULong) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemPsChargePoolQuota(process.toString(), pooltype, amount.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun psChargeProcessPoolQuota(process: Peprocess, pooltype: PoolType, amount: ULong): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemPsChargeProcessPoolQuota(process.toString(), pooltype, amount.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psDereferenceImpersonationToken(impersonationtoken: ConstPtr<CVoid>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemPsDereferenceImpersonationToken(impersonationtoken.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun psDereferencePrimaryToken(primarytoken: ConstPtr<CVoid>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemPsDereferencePrimaryToken(primarytoken.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun psDisableImpersonation(thread: Pethread, impersonationstate: MutPtr<SeImpersonationState>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemPsDisableImpersonation(thread.toString(), impersonationstate.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetProcessExitTime(): Long =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemPsGetProcessExitTime().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetThreadProcess(thread: Pethread): Peprocess =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemPsGetThreadProcess(thread.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psImpersonateClient(thread: Pethread, token: ConstPtr<CVoid>, copyonopen: Boolean, effectiveonly: Boolean, impersonationlevel: SecurityImpersonationLevel): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemPsImpersonateClient(thread.toString(), token.rawAddress.toString(), copyonopen, effectiveonly, impersonationlevel) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psIsDiskCountersEnabled(): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemPsIsDiskCountersEnabled() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psIsSystemThread(thread: Pethread): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemPsIsSystemThread(thread.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psIsThreadTerminating(thread: Pethread): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemPsIsThreadTerminating(thread.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psLookupProcessByProcessId(processid: Handle, process: MutPtr<Peprocess>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemPsLookupProcessByProcessId(processid.rawAddress.toString(), process.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psLookupThreadByThreadId(threadid: Handle, thread: MutPtr<Pethread>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemPsLookupThreadByThreadId(threadid.rawAddress.toString(), thread.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psReferenceImpersonationToken(thread: Pethread, copyonopen: MutPtr<Boolean>, effectiveonly: MutPtr<Boolean>, impersonationlevel: MutPtr<SecurityImpersonationLevel>): MutPtr<CVoid> =
    if (windowsWdkStorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemPsReferenceImpersonationToken(thread.toString(), copyonopen.rawAddress.toString(), effectiveonly.rawAddress.toString(), impersonationlevel.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psReferencePrimaryToken(process: Peprocess): MutPtr<CVoid> =
    if (windowsWdkStorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemPsReferencePrimaryToken(process.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psRestoreImpersonation(thread: Pethread, impersonationstate: ConstPtr<SeImpersonationState>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemPsRestoreImpersonation(thread.toString(), impersonationstate.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun psReturnPoolQuota(process: Peprocess, pooltype: PoolType, amount: ULong) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemPsReturnPoolQuota(process.toString(), pooltype, amount.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun psRevertToSelf() {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemPsRevertToSelf()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun psUpdateDiskCounters(process: Peprocess, bytesread: ULong, byteswritten: ULong, readoperationcount: UInt, writeoperationcount: UInt, flushoperationcount: UInt) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemPsUpdateDiskCounters(process.toString(), bytesread.toString(), byteswritten.toString(), readoperationcount.toInt(), writeoperationcount.toInt(), flushoperationcount.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun querySecurityContextToken(phcontext: ConstPtr<SecHandle>, token: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemQuerySecurityContextToken(phcontext.rawAddress.toString(), token.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlAbsoluteToSelfRelativeSD(absolutesecuritydescriptor: PsecurityDescriptor, selfrelativesecuritydescriptor: PsecurityDescriptor, bufferlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlAbsoluteToSelfRelativeSD(absolutesecuritydescriptor.rawAddress.toString(), selfrelativesecuritydescriptor.rawAddress.toString(), bufferlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlAddAccessAllowedAce(acl: MutPtr<Acl>, acerevision: UInt, accessmask: UInt, sid: Psid): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlAddAccessAllowedAce(acl.rawAddress.toString(), acerevision.toInt(), accessmask.toInt(), sid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlAddAccessAllowedAceEx(acl: MutPtr<Acl>, acerevision: UInt, aceflags: UInt, accessmask: UInt, sid: Psid): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlAddAccessAllowedAceEx(acl.rawAddress.toString(), acerevision.toInt(), aceflags.toInt(), accessmask.toInt(), sid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlAddAce(acl: MutPtr<Acl>, acerevision: UInt, startingaceindex: UInt, acelist: ConstPtr<CVoid>, acelistlength: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlAddAce(acl.rawAddress.toString(), acerevision.toInt(), startingaceindex.toInt(), acelist.rawAddress.toString(), acelistlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlAllocateAndInitializeSid(identifierauthority: ConstPtr<SidIdentifierAuthority>, subauthoritycount: UByte, subauthority0: UInt, subauthority1: UInt, subauthority2: UInt, subauthority3: UInt, subauthority4: UInt, subauthority5: UInt, subauthority6: UInt, subauthority7: UInt, sid: MutPtr<Psid>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlAllocateAndInitializeSid(identifierauthority.rawAddress.toString(), subauthoritycount.toInt(), subauthority0.toInt(), subauthority1.toInt(), subauthority2.toInt(), subauthority3.toInt(), subauthority4.toInt(), subauthority5.toInt(), subauthority6.toInt(), subauthority7.toInt(), sid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlAllocateAndInitializeSidEx(identifierauthority: ConstPtr<SidIdentifierAuthority>, subauthoritycount: UByte, subauthorities: ConstPtr<UInt>, sid: MutPtr<Psid>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlAllocateAndInitializeSidEx(identifierauthority.rawAddress.toString(), subauthoritycount.toInt(), subauthorities.rawAddress.toString(), sid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlAllocateHeap(heaphandle: ConstPtr<CVoid>, flags: UInt, size: ULong): MutPtr<CVoid> =
    if (windowsWdkStorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemRtlAllocateHeap(heaphandle.rawAddress.toString(), flags.toInt(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlAppendStringToString(destination: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, source: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlAppendStringToString(destination.rawAddress.toString(), source.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCompareAltitudes(altitude1: ConstPtr<UnicodeString>, altitude2: ConstPtr<UnicodeString>): Int =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlCompareAltitudes(altitude1.rawAddress.toString(), altitude2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCompareMemoryUlong(source: ConstPtr<CVoid>, length: ULong, pattern: UInt): ULong =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlCompareMemoryUlong(source.rawAddress.toString(), length.toString(), pattern.toInt()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCompressBuffer(compressionformatandengine: UShort, uncompressedbuffer: ConstPtr<UByte>, uncompressedbuffersize: UInt, compressedbuffer: MutPtr<UByte>, compressedbuffersize: UInt, uncompressedchunksize: UInt, finalcompressedsize: MutPtr<UInt>, workspace: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlCompressBuffer(compressionformatandengine.toInt(), uncompressedbuffer.rawAddress.toString(), uncompressedbuffersize.toInt(), compressedbuffer.rawAddress.toString(), compressedbuffersize.toInt(), uncompressedchunksize.toInt(), finalcompressedsize.rawAddress.toString(), workspace.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCompressChunks(uncompressedbuffer: ConstPtr<UByte>, uncompressedbuffersize: UInt, compressedbuffer: MutPtr<UByte>, compressedbuffersize: UInt, compresseddatainfo: MutPtr<CompressedDataInfo>, compresseddatainfolength: UInt, workspace: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlCompressChunks(uncompressedbuffer.rawAddress.toString(), uncompressedbuffersize.toInt(), compressedbuffer.rawAddress.toString(), compressedbuffersize.toInt(), compresseddatainfo.rawAddress.toString(), compresseddatainfolength.toInt(), workspace.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCopyLuid(destinationluid: MutPtr<Luid>, sourceluid: ConstPtr<Luid>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemRtlCopyLuid(destinationluid.rawAddress.toString(), sourceluid.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlCopySid(destinationsidlength: UInt, destinationsid: Psid, sourcesid: Psid): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlCopySid(destinationsidlength.toInt(), destinationsid.rawAddress.toString(), sourcesid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCreateAcl(acl: MutPtr<Acl>, acllength: UInt, aclrevision: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlCreateAcl(acl.rawAddress.toString(), acllength.toInt(), aclrevision.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCreateHeap(flags: UInt, heapbase: ConstPtr<CVoid>, reservesize: ULong, commitsize: ULong, lock: ConstPtr<CVoid>, parameters: ConstPtr<RtlHeapParameters>): MutPtr<CVoid> =
    if (windowsWdkStorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemRtlCreateHeap(flags.toInt(), heapbase.rawAddress.toString(), reservesize.toString(), commitsize.toString(), lock.rawAddress.toString(), parameters.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCreateServiceSid(servicename: ConstPtr<UnicodeString>, servicesid: Psid, servicesidlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlCreateServiceSid(servicename.rawAddress.toString(), servicesid.rawAddress.toString(), servicesidlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCreateSystemVolumeInformationFolder(volumerootpath: ConstPtr<UnicodeString>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlCreateSystemVolumeInformationFolder(volumerootpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCreateUnicodeString(destinationstring: MutPtr<UnicodeString>, sourcestring: Pcwstr): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlCreateUnicodeString(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCreateVirtualAccountSid(name: ConstPtr<UnicodeString>, basesubauthority: UInt, sid: Psid, sidlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlCreateVirtualAccountSid(name.rawAddress.toString(), basesubauthority.toInt(), sid.rawAddress.toString(), sidlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCustomCPToUnicodeN(customcp: ConstPtr<Cptableinfo>, unicodestring: Pwstr, maxbytesinunicodestring: UInt, bytesinunicodestring: MutPtr<UInt>, customcpstring: Pcstr, bytesincustomcpstring: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlCustomCPToUnicodeN(customcp.rawAddress.toString(), unicodestring.rawAddress.toString(), maxbytesinunicodestring.toInt(), bytesinunicodestring.rawAddress.toString(), customcpstring.rawAddress.toString(), bytesincustomcpstring.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDecompressBuffer(compressionformat: UShort, uncompressedbuffer: MutPtr<UByte>, uncompressedbuffersize: UInt, compressedbuffer: ConstPtr<UByte>, compressedbuffersize: UInt, finaluncompressedsize: MutPtr<UInt>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlDecompressBuffer(compressionformat.toInt(), uncompressedbuffer.rawAddress.toString(), uncompressedbuffersize.toInt(), compressedbuffer.rawAddress.toString(), compressedbuffersize.toInt(), finaluncompressedsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDecompressBufferEx(compressionformat: UShort, uncompressedbuffer: MutPtr<UByte>, uncompressedbuffersize: UInt, compressedbuffer: ConstPtr<UByte>, compressedbuffersize: UInt, finaluncompressedsize: MutPtr<UInt>, workspace: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlDecompressBufferEx(compressionformat.toInt(), uncompressedbuffer.rawAddress.toString(), uncompressedbuffersize.toInt(), compressedbuffer.rawAddress.toString(), compressedbuffersize.toInt(), finaluncompressedsize.rawAddress.toString(), workspace.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDecompressBufferEx2(compressionformat: UShort, uncompressedbuffer: MutPtr<UByte>, uncompressedbuffersize: UInt, compressedbuffer: ConstPtr<UByte>, compressedbuffersize: UInt, uncompressedchunksize: UInt, finaluncompressedsize: MutPtr<UInt>, workspace: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlDecompressBufferEx2(compressionformat.toInt(), uncompressedbuffer.rawAddress.toString(), uncompressedbuffersize.toInt(), compressedbuffer.rawAddress.toString(), compressedbuffersize.toInt(), uncompressedchunksize.toInt(), finaluncompressedsize.rawAddress.toString(), workspace.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDecompressChunks(uncompressedbuffer: MutPtr<UByte>, uncompressedbuffersize: UInt, compressedbuffer: ConstPtr<UByte>, compressedbuffersize: UInt, compressedtail: ConstPtr<UByte>, compressedtailsize: UInt, compresseddatainfo: ConstPtr<CompressedDataInfo>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlDecompressChunks(uncompressedbuffer.rawAddress.toString(), uncompressedbuffersize.toInt(), compressedbuffer.rawAddress.toString(), compressedbuffersize.toInt(), compressedtail.rawAddress.toString(), compressedtailsize.toInt(), compresseddatainfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDecompressFragment(compressionformat: UShort, uncompressedfragment: MutPtr<UByte>, uncompressedfragmentsize: UInt, compressedbuffer: ConstPtr<UByte>, compressedbuffersize: UInt, fragmentoffset: UInt, finaluncompressedsize: MutPtr<UInt>, workspace: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlDecompressFragment(compressionformat.toInt(), uncompressedfragment.rawAddress.toString(), uncompressedfragmentsize.toInt(), compressedbuffer.rawAddress.toString(), compressedbuffersize.toInt(), fragmentoffset.toInt(), finaluncompressedsize.rawAddress.toString(), workspace.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDecompressFragmentEx(compressionformat: UShort, uncompressedfragment: MutPtr<UByte>, uncompressedfragmentsize: UInt, compressedbuffer: ConstPtr<UByte>, compressedbuffersize: UInt, fragmentoffset: UInt, uncompressedchunksize: UInt, finaluncompressedsize: MutPtr<UInt>, workspace: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlDecompressFragmentEx(compressionformat.toInt(), uncompressedfragment.rawAddress.toString(), uncompressedfragmentsize.toInt(), compressedbuffer.rawAddress.toString(), compressedbuffersize.toInt(), fragmentoffset.toInt(), uncompressedchunksize.toInt(), finaluncompressedsize.rawAddress.toString(), workspace.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDeleteAce(acl: MutPtr<Acl>, aceindex: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlDeleteAce(acl.rawAddress.toString(), aceindex.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDescribeChunk(compressionformat: UShort, compressedbuffer: MutPtr<MutPtr<UByte>>, endofcompressedbufferplus1: ConstPtr<UByte>, chunkbuffer: MutPtr<MutPtr<UByte>>, chunksize: MutPtr<UInt>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlDescribeChunk(compressionformat.toInt(), compressedbuffer.rawAddress.toString(), endofcompressedbufferplus1.rawAddress.toString(), chunkbuffer.rawAddress.toString(), chunksize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDestroyHeap(heaphandle: ConstPtr<CVoid>): MutPtr<CVoid> =
    if (windowsWdkStorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemRtlDestroyHeap(heaphandle.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDosPathNameToNtPathNameUWithStatus(dosfilename: Pcwstr, ntfilename: MutPtr<UnicodeString>, filepart: MutPtr<Pwstr>, reserved: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlDosPathNameToNtPathNameUWithStatus(dosfilename.rawAddress.toString(), ntfilename.rawAddress.toString(), filepart.rawAddress.toString(), reserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDowncaseUnicodeString(destinationstring: MutPtr<UnicodeString>, sourcestring: ConstPtr<UnicodeString>, allocatedestinationstring: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlDowncaseUnicodeString(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString(), allocatedestinationstring) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDuplicateUnicodeString(flags: UInt, stringin: ConstPtr<UnicodeString>, stringout: MutPtr<UnicodeString>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlDuplicateUnicodeString(flags.toInt(), stringin.rawAddress.toString(), stringout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlEqualPrefixSid(sid1: Psid, sid2: Psid): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlEqualPrefixSid(sid1.rawAddress.toString(), sid2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlEqualSid(sid1: Psid, sid2: Psid): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlEqualSid(sid1.rawAddress.toString(), sid2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFindUnicodePrefix(prefixtable: ConstPtr<UnicodePrefixTable>, fullname: ConstPtr<UnicodeString>, caseinsensitiveindex: UInt): MutPtr<UnicodePrefixTableEntry> =
    if (windowsWdkStorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemRtlFindUnicodePrefix(prefixtable.rawAddress.toString(), fullname.rawAddress.toString(), caseinsensitiveindex.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFreeHeap(heaphandle: ConstPtr<CVoid>, flags: UInt, baseaddress: ConstPtr<CVoid>): UInt =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlFreeHeap(heaphandle.rawAddress.toString(), flags.toInt(), baseaddress.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFreeSid(sid: Psid): MutPtr<CVoid> =
    if (windowsWdkStorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemRtlFreeSid(sid.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGenerate8dot3Name(name: ConstPtr<UnicodeString>, allowextendedcharacters: Boolean, context: MutPtr<GenerateNameContext>, name8dot3: MutPtr<UnicodeString>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlGenerate8dot3Name(name.rawAddress.toString(), allowextendedcharacters, context.rawAddress.toString(), name8dot3.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetAce(acl: ConstPtr<Acl>, aceindex: UInt, ace: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlGetAce(acl.rawAddress.toString(), aceindex.toInt(), ace.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetCompressionWorkSpaceSize(compressionformatandengine: UShort, compressbufferworkspacesize: MutPtr<UInt>, compressfragmentworkspacesize: MutPtr<UInt>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlGetCompressionWorkSpaceSize(compressionformatandengine.toInt(), compressbufferworkspacesize.rawAddress.toString(), compressfragmentworkspacesize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetDaclSecurityDescriptor(securitydescriptor: PsecurityDescriptor, daclpresent: MutPtr<Boolean>, dacl: MutPtr<MutPtr<Acl>>, dacldefaulted: MutPtr<Boolean>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlGetDaclSecurityDescriptor(securitydescriptor.rawAddress.toString(), daclpresent.rawAddress.toString(), dacl.rawAddress.toString(), dacldefaulted.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetGroupSecurityDescriptor(securitydescriptor: PsecurityDescriptor, group: MutPtr<Psid>, groupdefaulted: MutPtr<Boolean>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlGetGroupSecurityDescriptor(securitydescriptor.rawAddress.toString(), group.rawAddress.toString(), groupdefaulted.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetOwnerSecurityDescriptor(securitydescriptor: PsecurityDescriptor, owner: MutPtr<Psid>, ownerdefaulted: MutPtr<Boolean>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlGetOwnerSecurityDescriptor(securitydescriptor.rawAddress.toString(), owner.rawAddress.toString(), ownerdefaulted.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetSaclSecurityDescriptor(securitydescriptor: PsecurityDescriptor, saclpresent: MutPtr<Boolean>, sacl: MutPtr<MutPtr<Acl>>, sacldefaulted: MutPtr<Boolean>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlGetSaclSecurityDescriptor(securitydescriptor.rawAddress.toString(), saclpresent.rawAddress.toString(), sacl.rawAddress.toString(), sacldefaulted.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIdentifierAuthoritySid(sid: Psid): MutPtr<SidIdentifierAuthority> =
    if (windowsWdkStorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemRtlIdentifierAuthoritySid(sid.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIdnToAscii(flags: UInt, sourcestring: Pcwstr, sourcestringlength: Int, destinationstring: Pwstr, destinationstringlength: MutPtr<Int>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlIdnToAscii(flags.toInt(), sourcestring.rawAddress.toString(), sourcestringlength, destinationstring.rawAddress.toString(), destinationstringlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIdnToNameprepUnicode(flags: UInt, sourcestring: Pcwstr, sourcestringlength: Int, destinationstring: Pwstr, destinationstringlength: MutPtr<Int>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlIdnToNameprepUnicode(flags.toInt(), sourcestring.rawAddress.toString(), sourcestringlength, destinationstring.rawAddress.toString(), destinationstringlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIdnToUnicode(flags: UInt, sourcestring: Pcwstr, sourcestringlength: Int, destinationstring: Pwstr, destinationstringlength: MutPtr<Int>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlIdnToUnicode(flags.toInt(), sourcestring.rawAddress.toString(), sourcestringlength, destinationstring.rawAddress.toString(), destinationstringlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInitCodePageTable(tablebase: ConstPtr<UShort>, codepagetable: MutPtr<Cptableinfo>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemRtlInitCodePageTable(tablebase.rawAddress.toString(), codepagetable.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlInitUnicodeStringEx(destinationstring: MutPtr<UnicodeString>, sourcestring: Pcwstr): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlInitUnicodeStringEx(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInitializeSid(sid: Psid, identifierauthority: ConstPtr<SidIdentifierAuthority>, subauthoritycount: UByte): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlInitializeSid(sid.rawAddress.toString(), identifierauthority.rawAddress.toString(), subauthoritycount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInitializeSidEx(sid: Psid, identifierauthority: ConstPtr<SidIdentifierAuthority>, subauthoritycount: UByte, vararg variadicArgs: Long): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlInitializeSidEx(sid.rawAddress.toString(), identifierauthority.rawAddress.toString(), subauthoritycount.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInitializeUnicodePrefix(prefixtable: MutPtr<UnicodePrefixTable>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemRtlInitializeUnicodePrefix(prefixtable.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlInsertUnicodePrefix(prefixtable: ConstPtr<UnicodePrefixTable>, prefix: ConstPtr<UnicodeString>, prefixtableentry: MutPtr<UnicodePrefixTableEntry>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlInsertUnicodePrefix(prefixtable.rawAddress.toString(), prefix.rawAddress.toString(), prefixtableentry.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsCloudFilesPlaceholder(fileattributes: UInt, reparsetag: UInt): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlIsCloudFilesPlaceholder(fileattributes.toInt(), reparsetag.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsDosDeviceNameU(dosfilename: Pcwstr): UInt =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlIsDosDeviceNameU(dosfilename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag: UInt): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsNormalizedString(normform: UInt, sourcestring: Pcwstr, sourcestringlength: Int, normalized: MutPtr<Boolean>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlIsNormalizedString(normform.toInt(), sourcestring.rawAddress.toString(), sourcestringlength, normalized.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsPartialPlaceholder(fileattributes: UInt, reparsetag: UInt): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlIsPartialPlaceholder(fileattributes.toInt(), reparsetag.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsPartialPlaceholderFileHandle(filehandle: Handle, ispartialplaceholder: MutPtr<Boolean>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlIsPartialPlaceholderFileHandle(filehandle.rawAddress.toString(), ispartialplaceholder.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsPartialPlaceholderFileInfo(infobuffer: ConstPtr<CVoid>, infoclass: FileInformationClass, ispartialplaceholder: MutPtr<Boolean>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlIsPartialPlaceholderFileInfo(infobuffer.rawAddress.toString(), infoclass, ispartialplaceholder.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsSandboxedToken(context: ConstPtr<SecuritySubjectContext>, previousmode: Byte): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlIsSandboxedToken(context.rawAddress.toString(), previousmode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsValidOemCharacter(char: Pwstr): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlIsValidOemCharacter(char.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlLengthRequiredSid(subauthoritycount: UInt): UInt =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlLengthRequiredSid(subauthoritycount.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlLengthSid(sid: Psid): UInt =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlLengthSid(sid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlMultiByteToUnicodeN(unicodestring: Pwstr, maxbytesinunicodestring: UInt, bytesinunicodestring: MutPtr<UInt>, multibytestring: Pcstr, bytesinmultibytestring: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlMultiByteToUnicodeN(unicodestring.rawAddress.toString(), maxbytesinunicodestring.toInt(), bytesinunicodestring.rawAddress.toString(), multibytestring.rawAddress.toString(), bytesinmultibytestring.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlMultiByteToUnicodeSize(bytesinunicodestring: MutPtr<UInt>, multibytestring: Pcstr, bytesinmultibytestring: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlMultiByteToUnicodeSize(bytesinunicodestring.rawAddress.toString(), multibytestring.rawAddress.toString(), bytesinmultibytestring.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlNextUnicodePrefix(prefixtable: ConstPtr<UnicodePrefixTable>, restart: Boolean): MutPtr<UnicodePrefixTableEntry> =
    if (windowsWdkStorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemRtlNextUnicodePrefix(prefixtable.rawAddress.toString(), restart).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlNormalizeString(normform: UInt, sourcestring: Pcwstr, sourcestringlength: Int, destinationstring: Pwstr, destinationstringlength: MutPtr<Int>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlNormalizeString(normform.toInt(), sourcestring.rawAddress.toString(), sourcestringlength, destinationstring.rawAddress.toString(), destinationstringlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlNtStatusToDosErrorNoTeb(status: Ntstatus): UInt =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlNtStatusToDosErrorNoTeb(status).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlOemStringToCountedUnicodeString(destinationstring: MutPtr<UnicodeString>, sourcestring: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, allocatedestinationstring: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlOemStringToCountedUnicodeString(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString(), allocatedestinationstring) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlOemStringToUnicodeString(destinationstring: MutPtr<UnicodeString>, sourcestring: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, allocatedestinationstring: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlOemStringToUnicodeString(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString(), allocatedestinationstring) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlOemToUnicodeN(unicodestring: Pwstr, maxbytesinunicodestring: UInt, bytesinunicodestring: MutPtr<UInt>, oemstring: Pcstr, bytesinoemstring: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlOemToUnicodeN(unicodestring.rawAddress.toString(), maxbytesinunicodestring.toInt(), bytesinunicodestring.rawAddress.toString(), oemstring.rawAddress.toString(), bytesinoemstring.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlPrefixString(string1: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, string2: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, caseinsensitive: Boolean): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlPrefixString(string1.rawAddress.toString(), string2.rawAddress.toString(), caseinsensitive) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlQueryPackageIdentity(tokenobject: ConstPtr<CVoid>, packagefullname: Pwstr, packagesize: MutPtr<ULong>, appid: Pwstr, appidsize: MutPtr<ULong>, packaged: MutPtr<Boolean>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlQueryPackageIdentity(tokenobject.rawAddress.toString(), packagefullname.rawAddress.toString(), packagesize.rawAddress.toString(), appid.rawAddress.toString(), appidsize.rawAddress.toString(), packaged.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlQueryPackageIdentityEx(tokenobject: ConstPtr<CVoid>, packagefullname: Pwstr, packagesize: MutPtr<ULong>, appid: Pwstr, appidsize: MutPtr<ULong>, dynamicid: MutPtr<Guid>, flags: MutPtr<ULong>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlQueryPackageIdentityEx(tokenobject.rawAddress.toString(), packagefullname.rawAddress.toString(), packagesize.rawAddress.toString(), appid.rawAddress.toString(), appidsize.rawAddress.toString(), dynamicid.rawAddress.toString(), flags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlQueryProcessPlaceholderCompatibilityMode(): Byte =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlQueryProcessPlaceholderCompatibilityMode().toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlQueryThreadPlaceholderCompatibilityMode(): Byte =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlQueryThreadPlaceholderCompatibilityMode().toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlRandom(seed: MutPtr<UInt>): UInt =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlRandom(seed.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlRandomEx(seed: MutPtr<UInt>): UInt =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlRandomEx(seed.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlRemoveUnicodePrefix(prefixtable: ConstPtr<UnicodePrefixTable>, prefixtableentry: ConstPtr<UnicodePrefixTableEntry>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemRtlRemoveUnicodePrefix(prefixtable.rawAddress.toString(), prefixtableentry.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlReplaceSidInSd(securitydescriptor: PsecurityDescriptor, oldsid: Psid, newsid: Psid, numchanges: MutPtr<UInt>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlReplaceSidInSd(securitydescriptor.rawAddress.toString(), oldsid.rawAddress.toString(), newsid.rawAddress.toString(), numchanges.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlReserveChunk(compressionformat: UShort, compressedbuffer: MutPtr<MutPtr<UByte>>, endofcompressedbufferplus1: ConstPtr<UByte>, chunkbuffer: MutPtr<MutPtr<UByte>>, chunksize: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlReserveChunk(compressionformat.toInt(), compressedbuffer.rawAddress.toString(), endofcompressedbufferplus1.rawAddress.toString(), chunkbuffer.rawAddress.toString(), chunksize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlSecondsSince1970ToTime(elapsedseconds: UInt, time: MutPtr<Long>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemRtlSecondsSince1970ToTime(elapsedseconds.toInt(), time.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlSecondsSince1980ToTime(elapsedseconds: UInt, time: MutPtr<Long>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemRtlSecondsSince1980ToTime(elapsedseconds.toInt(), time.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlSelfRelativeToAbsoluteSD(selfrelativesecuritydescriptor: PsecurityDescriptor, absolutesecuritydescriptor: PsecurityDescriptor, absolutesecuritydescriptorsize: MutPtr<UInt>, dacl: MutPtr<Acl>, daclsize: MutPtr<UInt>, sacl: MutPtr<Acl>, saclsize: MutPtr<UInt>, owner: Psid, ownersize: MutPtr<UInt>, primarygroup: Psid, primarygroupsize: MutPtr<UInt>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlSelfRelativeToAbsoluteSD(selfrelativesecuritydescriptor.rawAddress.toString(), absolutesecuritydescriptor.rawAddress.toString(), absolutesecuritydescriptorsize.rawAddress.toString(), dacl.rawAddress.toString(), daclsize.rawAddress.toString(), sacl.rawAddress.toString(), saclsize.rawAddress.toString(), owner.rawAddress.toString(), ownersize.rawAddress.toString(), primarygroup.rawAddress.toString(), primarygroupsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlSetGroupSecurityDescriptor(securitydescriptor: PsecurityDescriptor, group: Psid, groupdefaulted: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlSetGroupSecurityDescriptor(securitydescriptor.rawAddress.toString(), group.rawAddress.toString(), groupdefaulted) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlSetOwnerSecurityDescriptor(securitydescriptor: PsecurityDescriptor, owner: Psid, ownerdefaulted: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlSetOwnerSecurityDescriptor(securitydescriptor.rawAddress.toString(), owner.rawAddress.toString(), ownerdefaulted) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlSetProcessPlaceholderCompatibilityMode(mode: Byte): Byte =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlSetProcessPlaceholderCompatibilityMode(mode.toInt()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlSetThreadPlaceholderCompatibilityMode(mode: Byte): Byte =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlSetThreadPlaceholderCompatibilityMode(mode.toInt()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlSubAuthorityCountSid(sid: Psid): MutPtr<UByte> =
    if (windowsWdkStorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemRtlSubAuthorityCountSid(sid.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlSubAuthoritySid(sid: Psid, subauthority: UInt): MutPtr<UInt> =
    if (windowsWdkStorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemRtlSubAuthoritySid(sid.rawAddress.toString(), subauthority.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlTimeToSecondsSince1980(time: ConstPtr<Long>, elapsedseconds: MutPtr<UInt>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlTimeToSecondsSince1980(time.rawAddress.toString(), elapsedseconds.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUnicodeStringToCountedOemString(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: ConstPtr<UnicodeString>, allocatedestinationstring: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlUnicodeStringToCountedOemString(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString(), allocatedestinationstring) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUnicodeToCustomCPN(customcp: ConstPtr<Cptableinfo>, customcpstring: Pstr, maxbytesincustomcpstring: UInt, bytesincustomcpstring: MutPtr<UInt>, unicodestring: Pcwstr, bytesinunicodestring: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlUnicodeToCustomCPN(customcp.rawAddress.toString(), customcpstring.rawAddress.toString(), maxbytesincustomcpstring.toInt(), bytesincustomcpstring.rawAddress.toString(), unicodestring.rawAddress.toString(), bytesinunicodestring.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUnicodeToMultiByteN(multibytestring: Pstr, maxbytesinmultibytestring: UInt, bytesinmultibytestring: MutPtr<UInt>, unicodestring: ConstPtr<UShort>, bytesinunicodestring: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlUnicodeToMultiByteN(multibytestring.rawAddress.toString(), maxbytesinmultibytestring.toInt(), bytesinmultibytestring.rawAddress.toString(), unicodestring.rawAddress.toString(), bytesinunicodestring.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUnicodeToOemN(oemstring: Pstr, maxbytesinoemstring: UInt, bytesinoemstring: MutPtr<UInt>, unicodestring: ConstPtr<UShort>, bytesinunicodestring: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlUnicodeToOemN(oemstring.rawAddress.toString(), maxbytesinoemstring.toInt(), bytesinoemstring.rawAddress.toString(), unicodestring.rawAddress.toString(), bytesinunicodestring.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUpcaseUnicodeStringToCountedOemString(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: ConstPtr<UnicodeString>, allocatedestinationstring: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlUpcaseUnicodeStringToCountedOemString(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString(), allocatedestinationstring) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUpcaseUnicodeStringToOemString(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: ConstPtr<UnicodeString>, allocatedestinationstring: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlUpcaseUnicodeStringToOemString(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString(), allocatedestinationstring) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUpcaseUnicodeToCustomCPN(customcp: ConstPtr<Cptableinfo>, customcpstring: Pstr, maxbytesincustomcpstring: UInt, bytesincustomcpstring: MutPtr<UInt>, unicodestring: Pcwstr, bytesinunicodestring: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlUpcaseUnicodeToCustomCPN(customcp.rawAddress.toString(), customcpstring.rawAddress.toString(), maxbytesincustomcpstring.toInt(), bytesincustomcpstring.rawAddress.toString(), unicodestring.rawAddress.toString(), bytesinunicodestring.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUpcaseUnicodeToMultiByteN(multibytestring: Pstr, maxbytesinmultibytestring: UInt, bytesinmultibytestring: MutPtr<UInt>, unicodestring: ConstPtr<UShort>, bytesinunicodestring: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlUpcaseUnicodeToMultiByteN(multibytestring.rawAddress.toString(), maxbytesinmultibytestring.toInt(), bytesinmultibytestring.rawAddress.toString(), unicodestring.rawAddress.toString(), bytesinunicodestring.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUpcaseUnicodeToOemN(oemstring: Pstr, maxbytesinoemstring: UInt, bytesinoemstring: MutPtr<UInt>, unicodestring: ConstPtr<UShort>, bytesinunicodestring: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlUpcaseUnicodeToOemN(oemstring.rawAddress.toString(), maxbytesinoemstring.toInt(), bytesinoemstring.rawAddress.toString(), unicodestring.rawAddress.toString(), bytesinunicodestring.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlValidSid(sid: Psid): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlValidSid(sid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlValidateUnicodeString(flags: UInt, string: ConstPtr<UnicodeString>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlValidateUnicodeString(flags.toInt(), string.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlxOemStringToUnicodeSize(oemstring: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>): UInt =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlxOemStringToUnicodeSize(oemstring.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlxUnicodeStringToOemSize(unicodestring: ConstPtr<UnicodeString>): UInt =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemRtlxUnicodeStringToOemSize(unicodestring.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seAccessCheckFromState(securitydescriptor: PsecurityDescriptor, primarytokeninformation: ConstPtr<TokenAccessInformation>, clienttokeninformation: ConstPtr<TokenAccessInformation>, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: MutPtr<MutPtr<PrivilegeSet>>, genericmapping: ConstPtr<GenericMapping>, accessmode: Byte, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Int>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSeAccessCheckFromState(securitydescriptor.rawAddress.toString(), primarytokeninformation.rawAddress.toString(), clienttokeninformation.rawAddress.toString(), desiredaccess.toInt(), previouslygrantedaccess.toInt(), privileges.rawAddress.toString(), genericmapping.rawAddress.toString(), accessmode.toInt(), grantedaccess.rawAddress.toString(), accessstatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seAccessCheckFromStateEx(securitydescriptor: PsecurityDescriptor, primarytoken: ConstPtr<CVoid>, clienttoken: ConstPtr<CVoid>, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: MutPtr<MutPtr<PrivilegeSet>>, genericmapping: ConstPtr<GenericMapping>, accessmode: Byte, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Int>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSeAccessCheckFromStateEx(securitydescriptor.rawAddress.toString(), primarytoken.rawAddress.toString(), clienttoken.rawAddress.toString(), desiredaccess.toInt(), previouslygrantedaccess.toInt(), privileges.rawAddress.toString(), genericmapping.rawAddress.toString(), accessmode.toInt(), grantedaccess.rawAddress.toString(), accessstatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seAdjustAccessStateForAccessConstraints(objecttype: ConstPtr<CVoid>, securitydescriptor: PsecurityDescriptor, accessstate: MutPtr<AccessState>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemSeAdjustAccessStateForAccessConstraints(objecttype.rawAddress.toString(), securitydescriptor.rawAddress.toString(), accessstate.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seAdjustAccessStateForTrustLabel(objecttype: ConstPtr<CVoid>, securitydescriptor: PsecurityDescriptor, accessstate: MutPtr<AccessState>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemSeAdjustAccessStateForTrustLabel(objecttype.rawAddress.toString(), securitydescriptor.rawAddress.toString(), accessstate.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seAdjustObjectSecurity(objectname: ConstPtr<UnicodeString>, originaldescriptor: PsecurityDescriptor, proposeddescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr<SecuritySubjectContext>, adjusteddescriptor: MutPtr<PsecurityDescriptor>, applyadjusteddescriptor: MutPtr<Boolean>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSeAdjustObjectSecurity(objectname.rawAddress.toString(), originaldescriptor.rawAddress.toString(), proposeddescriptor.rawAddress.toString(), subjectsecuritycontext.rawAddress.toString(), adjusteddescriptor.rawAddress.toString(), applyadjusteddescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seAppendPrivileges(accessstate: MutPtr<AccessState>, privileges: ConstPtr<PrivilegeSet>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSeAppendPrivileges(accessstate.rawAddress.toString(), privileges.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seAuditFipsCryptoSelftests(bsuccess: Boolean, selftestcode: UInt) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemSeAuditFipsCryptoSelftests(bsuccess, selftestcode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seAuditHardLinkCreation(filename: ConstPtr<UnicodeString>, linkname: ConstPtr<UnicodeString>, bsuccess: Boolean) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemSeAuditHardLinkCreation(filename.rawAddress.toString(), linkname.rawAddress.toString(), bsuccess)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seAuditHardLinkCreationWithTransaction(filename: ConstPtr<UnicodeString>, linkname: ConstPtr<UnicodeString>, bsuccess: Boolean, transactionid: ConstPtr<Guid>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemSeAuditHardLinkCreationWithTransaction(filename.rawAddress.toString(), linkname.rawAddress.toString(), bsuccess, transactionid.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seAuditTransactionStateChange(transactionid: ConstPtr<Guid>, resourcemanagerid: ConstPtr<Guid>, newtransactionstate: UInt) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemSeAuditTransactionStateChange(transactionid.rawAddress.toString(), resourcemanagerid.rawAddress.toString(), newtransactionstate.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seAuditingAnyFileEventsWithContext(securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr<SecuritySubjectContext>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSeAuditingAnyFileEventsWithContext(securitydescriptor.rawAddress.toString(), subjectsecuritycontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seAuditingAnyFileEventsWithContextEx(securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr<SecuritySubjectContext>, stagingenabled: MutPtr<Boolean>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSeAuditingAnyFileEventsWithContextEx(securitydescriptor.rawAddress.toString(), subjectsecuritycontext.rawAddress.toString(), stagingenabled.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seAuditingFileEvents(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSeAuditingFileEvents(accessgranted, securitydescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seAuditingFileEventsWithContext(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr<SecuritySubjectContext>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSeAuditingFileEventsWithContext(accessgranted, securitydescriptor.rawAddress.toString(), subjectsecuritycontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seAuditingFileEventsWithContextEx(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr<SecuritySubjectContext>, stagingenabled: MutPtr<Boolean>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSeAuditingFileEventsWithContextEx(accessgranted, securitydescriptor.rawAddress.toString(), subjectsecuritycontext.rawAddress.toString(), stagingenabled.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seAuditingFileOrGlobalEvents(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr<SecuritySubjectContext>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSeAuditingFileOrGlobalEvents(accessgranted, securitydescriptor.rawAddress.toString(), subjectsecuritycontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seAuditingHardLinkEvents(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSeAuditingHardLinkEvents(accessgranted, securitydescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seAuditingHardLinkEventsWithContext(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr<SecuritySubjectContext>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSeAuditingHardLinkEventsWithContext(accessgranted, securitydescriptor.rawAddress.toString(), subjectsecuritycontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seCaptureSubjectContextEx(thread: Pethread, process: Peprocess, subjectcontext: MutPtr<SecuritySubjectContext>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemSeCaptureSubjectContextEx(thread.toString(), process.toString(), subjectcontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seCheckForCriticalAceRemoval(currentdescriptor: PsecurityDescriptor, newdescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr<SecuritySubjectContext>, aceremoved: MutPtr<Boolean>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemSeCheckForCriticalAceRemoval(currentdescriptor.rawAddress.toString(), newdescriptor.rawAddress.toString(), subjectsecuritycontext.rawAddress.toString(), aceremoved.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seCreateClientSecurity(clientthread: Pethread, clientsecurityqos: ConstPtr<SecurityQualityOfService>, remotesession: Boolean, clientcontext: MutPtr<SecurityClientContext>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSeCreateClientSecurity(clientthread.toString(), clientsecurityqos.rawAddress.toString(), remotesession, clientcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seCreateClientSecurityFromSubjectContext(subjectcontext: ConstPtr<SecuritySubjectContext>, clientsecurityqos: ConstPtr<SecurityQualityOfService>, serverisremote: Boolean, clientcontext: MutPtr<SecurityClientContext>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSeCreateClientSecurityFromSubjectContext(subjectcontext.rawAddress.toString(), clientsecurityqos.rawAddress.toString(), serverisremote, clientcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seDeleteClientSecurity(clientcontext: MutPtr<SecurityClientContext>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemSeDeleteClientSecurity(clientcontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seDeleteObjectAuditAlarm(obj: ConstPtr<CVoid>, handle: Handle) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemSeDeleteObjectAuditAlarm(obj.rawAddress.toString(), handle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seDeleteObjectAuditAlarmWithTransaction(obj: ConstPtr<CVoid>, handle: Handle, transactionid: ConstPtr<Guid>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemSeDeleteObjectAuditAlarmWithTransaction(obj.rawAddress.toString(), handle.rawAddress.toString(), transactionid.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seExamineSacl(sacl: ConstPtr<Acl>, resourcesacl: ConstPtr<Acl>, token: ConstPtr<CVoid>, desiredaccess: UInt, accessgranted: Boolean, generateaudit: MutPtr<Boolean>, generatealarm: MutPtr<Boolean>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemSeExamineSacl(sacl.rawAddress.toString(), resourcesacl.rawAddress.toString(), token.rawAddress.toString(), desiredaccess.toInt(), accessgranted, generateaudit.rawAddress.toString(), generatealarm.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seFilterToken(existingtoken: ConstPtr<CVoid>, flags: UInt, sidstodisable: ConstPtr<TokenGroups>, privilegestodelete: ConstPtr<TokenPrivileges>, restrictedsids: ConstPtr<TokenGroups>, filteredtoken: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSeFilterToken(existingtoken.rawAddress.toString(), flags.toInt(), sidstodisable.rawAddress.toString(), privilegestodelete.rawAddress.toString(), restrictedsids.rawAddress.toString(), filteredtoken.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seFreePrivileges(privileges: ConstPtr<PrivilegeSet>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemSeFreePrivileges(privileges.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seImpersonateClient(clientcontext: ConstPtr<SecurityClientContext>, serverthread: Pethread) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemSeImpersonateClient(clientcontext.rawAddress.toString(), serverthread.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seImpersonateClientEx(clientcontext: ConstPtr<SecurityClientContext>, serverthread: Pethread): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSeImpersonateClientEx(clientcontext.rawAddress.toString(), serverthread.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seLocateProcessImageName(process: Peprocess, pimagefilename: MutPtr<MutPtr<UnicodeString>>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSeLocateProcessImageName(process.toString(), pimagefilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seMarkLogonSessionForTerminationNotification(logonid: ConstPtr<Luid>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSeMarkLogonSessionForTerminationNotification(logonid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seMarkLogonSessionForTerminationNotificationEx(logonid: ConstPtr<Luid>, pserversilo: Pesilo): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSeMarkLogonSessionForTerminationNotificationEx(logonid.rawAddress.toString(), pserversilo.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seOpenObjectAuditAlarm(objecttypename: ConstPtr<UnicodeString>, obj: ConstPtr<CVoid>, absoluteobjectname: ConstPtr<UnicodeString>, securitydescriptor: PsecurityDescriptor, accessstate: ConstPtr<AccessState>, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, generateonclose: MutPtr<Boolean>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemSeOpenObjectAuditAlarm(objecttypename.rawAddress.toString(), obj.rawAddress.toString(), absoluteobjectname.rawAddress.toString(), securitydescriptor.rawAddress.toString(), accessstate.rawAddress.toString(), objectcreated, accessgranted, accessmode.toInt(), generateonclose.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seOpenObjectAuditAlarmWithTransaction(objecttypename: ConstPtr<UnicodeString>, obj: ConstPtr<CVoid>, absoluteobjectname: ConstPtr<UnicodeString>, securitydescriptor: PsecurityDescriptor, accessstate: ConstPtr<AccessState>, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, transactionid: ConstPtr<Guid>, generateonclose: MutPtr<Boolean>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemSeOpenObjectAuditAlarmWithTransaction(objecttypename.rawAddress.toString(), obj.rawAddress.toString(), absoluteobjectname.rawAddress.toString(), securitydescriptor.rawAddress.toString(), accessstate.rawAddress.toString(), objectcreated, accessgranted, accessmode.toInt(), transactionid.rawAddress.toString(), generateonclose.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seOpenObjectForDeleteAuditAlarm(objecttypename: ConstPtr<UnicodeString>, obj: ConstPtr<CVoid>, absoluteobjectname: ConstPtr<UnicodeString>, securitydescriptor: PsecurityDescriptor, accessstate: ConstPtr<AccessState>, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, generateonclose: MutPtr<Boolean>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemSeOpenObjectForDeleteAuditAlarm(objecttypename.rawAddress.toString(), obj.rawAddress.toString(), absoluteobjectname.rawAddress.toString(), securitydescriptor.rawAddress.toString(), accessstate.rawAddress.toString(), objectcreated, accessgranted, accessmode.toInt(), generateonclose.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seOpenObjectForDeleteAuditAlarmWithTransaction(objecttypename: ConstPtr<UnicodeString>, obj: ConstPtr<CVoid>, absoluteobjectname: ConstPtr<UnicodeString>, securitydescriptor: PsecurityDescriptor, accessstate: ConstPtr<AccessState>, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, transactionid: ConstPtr<Guid>, generateonclose: MutPtr<Boolean>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemSeOpenObjectForDeleteAuditAlarmWithTransaction(objecttypename.rawAddress.toString(), obj.rawAddress.toString(), absoluteobjectname.rawAddress.toString(), securitydescriptor.rawAddress.toString(), accessstate.rawAddress.toString(), objectcreated, accessgranted, accessmode.toInt(), transactionid.rawAddress.toString(), generateonclose.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sePrivilegeCheck(requiredprivileges: MutPtr<PrivilegeSet>, subjectsecuritycontext: ConstPtr<SecuritySubjectContext>, accessmode: Byte): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSePrivilegeCheck(requiredprivileges.rawAddress.toString(), subjectsecuritycontext.rawAddress.toString(), accessmode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seQueryAuthenticationIdToken(token: ConstPtr<CVoid>, authenticationid: MutPtr<Luid>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSeQueryAuthenticationIdToken(token.rawAddress.toString(), authenticationid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seQueryInformationToken(token: ConstPtr<CVoid>, tokeninformationclass: TokenInformationClass, tokeninformation: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSeQueryInformationToken(token.rawAddress.toString(), tokeninformationclass, tokeninformation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seQuerySecurityDescriptorInfo(securityinformation: ConstPtr<UInt>, securitydescriptor: PsecurityDescriptor, length: MutPtr<UInt>, objectssecuritydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSeQuerySecurityDescriptorInfo(securityinformation.rawAddress.toString(), securitydescriptor.rawAddress.toString(), length.rawAddress.toString(), objectssecuritydescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seQueryServerSiloToken(token: ConstPtr<CVoid>, pserversilo: MutPtr<Pesilo>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSeQueryServerSiloToken(token.rawAddress.toString(), pserversilo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seQuerySessionIdToken(token: ConstPtr<CVoid>, sessionid: MutPtr<UInt>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSeQuerySessionIdToken(token.rawAddress.toString(), sessionid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seQuerySessionIdTokenEx(token: ConstPtr<CVoid>, sessionid: MutPtr<UInt>, isservicesession: MutPtr<Boolean>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSeQuerySessionIdTokenEx(token.rawAddress.toString(), sessionid.rawAddress.toString(), isservicesession.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seRegisterLogonSessionTerminatedRoutine(callbackroutine: PseLogonSessionTerminatedRoutine): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSeRegisterLogonSessionTerminatedRoutine(0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seRegisterLogonSessionTerminatedRoutineEx(callbackroutine: PseLogonSessionTerminatedRoutineEx, context: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSeRegisterLogonSessionTerminatedRoutineEx(0L.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seReportSecurityEventWithSubCategory(flags: UInt, sourcename: ConstPtr<UnicodeString>, usersid: Psid, auditparameters: ConstPtr<SeAdtParameterArray>, auditsubcategoryid: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSeReportSecurityEventWithSubCategory(flags.toInt(), sourcename.rawAddress.toString(), usersid.rawAddress.toString(), auditparameters.rawAddress.toString(), auditsubcategoryid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seSetAccessStateGenericMapping(accessstate: MutPtr<AccessState>, genericmapping: ConstPtr<GenericMapping>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemSeSetAccessStateGenericMapping(accessstate.rawAddress.toString(), genericmapping.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seSetSecurityDescriptorInfo(obj: ConstPtr<CVoid>, securityinformation: ConstPtr<UInt>, modificationdescriptor: PsecurityDescriptor, objectssecuritydescriptor: MutPtr<PsecurityDescriptor>, pooltype: PoolType, genericmapping: ConstPtr<GenericMapping>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSeSetSecurityDescriptorInfo(obj.rawAddress.toString(), securityinformation.rawAddress.toString(), modificationdescriptor.rawAddress.toString(), objectssecuritydescriptor.rawAddress.toString(), pooltype, genericmapping.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seSetSecurityDescriptorInfoEx(obj: ConstPtr<CVoid>, securityinformation: ConstPtr<UInt>, modificationdescriptor: PsecurityDescriptor, objectssecuritydescriptor: MutPtr<PsecurityDescriptor>, autoinheritflags: UInt, pooltype: PoolType, genericmapping: ConstPtr<GenericMapping>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSeSetSecurityDescriptorInfoEx(obj.rawAddress.toString(), securityinformation.rawAddress.toString(), modificationdescriptor.rawAddress.toString(), objectssecuritydescriptor.rawAddress.toString(), autoinheritflags.toInt(), pooltype, genericmapping.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seShouldCheckForAccessRightsFromParent(objecttype: ConstPtr<CVoid>, childdescriptor: PsecurityDescriptor, accessstate: ConstPtr<AccessState>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSeShouldCheckForAccessRightsFromParent(objecttype.rawAddress.toString(), childdescriptor.rawAddress.toString(), accessstate.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seTokenFromAccessInformation(accessinformation: ConstPtr<TokenAccessInformation>, token: MutPtr<CVoid>, length: UInt, requiredlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSeTokenFromAccessInformation(accessinformation.rawAddress.toString(), token.rawAddress.toString(), length.toInt(), requiredlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seTokenIsAdmin(token: ConstPtr<CVoid>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSeTokenIsAdmin(token.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seTokenIsRestricted(token: ConstPtr<CVoid>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSeTokenIsRestricted(token.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seTokenIsWriteRestricted(token: ConstPtr<CVoid>): Boolean =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSeTokenIsWriteRestricted(token.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seTokenType(token: ConstPtr<CVoid>): TokenType =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSeTokenType(token.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seUnregisterLogonSessionTerminatedRoutine(callbackroutine: PseLogonSessionTerminatedRoutine): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSeUnregisterLogonSessionTerminatedRoutine(0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seUnregisterLogonSessionTerminatedRoutineEx(callbackroutine: PseLogonSessionTerminatedRoutineEx, context: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSeUnregisterLogonSessionTerminatedRoutineEx(0L.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun secLookupAccountName(name: ConstPtr<UnicodeString>, sidsize: MutPtr<UInt>, sid: Psid, nameuse: MutPtr<SidNameUse>, domainsize: MutPtr<UInt>, referenceddomain: MutPtr<UnicodeString>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSecLookupAccountName(name.rawAddress.toString(), sidsize.rawAddress.toString(), sid.rawAddress.toString(), nameuse.rawAddress.toString(), domainsize.rawAddress.toString(), referenceddomain.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun secLookupAccountSid(sid: Psid, namesize: MutPtr<UInt>, namebuffer: MutPtr<UnicodeString>, domainsize: MutPtr<UInt>, domainbuffer: MutPtr<UnicodeString>, nameuse: MutPtr<SidNameUse>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSecLookupAccountSid(sid.rawAddress.toString(), namesize.rawAddress.toString(), namebuffer.rawAddress.toString(), domainsize.rawAddress.toString(), domainbuffer.rawAddress.toString(), nameuse.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun secLookupWellKnownSid(sidtype: WellKnownSidType, sid: Psid, sidbuffersize: UInt, sidsize: MutPtr<UInt>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSecLookupWellKnownSid(sidtype, sid.rawAddress.toString(), sidbuffersize.toInt(), sidsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun secMakeSPN(serviceclass: MutPtr<UnicodeString>, servicename: MutPtr<UnicodeString>, instancename: MutPtr<UnicodeString>, instanceport: UShort, referrer: MutPtr<UnicodeString>, spn: MutPtr<UnicodeString>, length: MutPtr<UInt>, allocate: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSecMakeSPN(serviceclass.rawAddress.toString(), servicename.rawAddress.toString(), instancename.rawAddress.toString(), instanceport.toInt(), referrer.rawAddress.toString(), spn.rawAddress.toString(), length.rawAddress.toString(), allocate) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun secMakeSPNEx(serviceclass: MutPtr<UnicodeString>, servicename: MutPtr<UnicodeString>, instancename: MutPtr<UnicodeString>, instanceport: UShort, referrer: MutPtr<UnicodeString>, targetinfo: MutPtr<UnicodeString>, spn: MutPtr<UnicodeString>, length: MutPtr<UInt>, allocate: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSecMakeSPNEx(serviceclass.rawAddress.toString(), servicename.rawAddress.toString(), instancename.rawAddress.toString(), instanceport.toInt(), referrer.rawAddress.toString(), targetinfo.rawAddress.toString(), spn.rawAddress.toString(), length.rawAddress.toString(), allocate) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun secMakeSPNEx2(serviceclass: MutPtr<UnicodeString>, servicename: MutPtr<UnicodeString>, instancename: MutPtr<UnicodeString>, instanceport: UShort, referrer: MutPtr<UnicodeString>, intargetinfo: MutPtr<UnicodeString>, spn: MutPtr<UnicodeString>, totalsize: MutPtr<UInt>, allocate: Boolean, istargetinfomarshaled: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSecMakeSPNEx2(serviceclass.rawAddress.toString(), servicename.rawAddress.toString(), instancename.rawAddress.toString(), instanceport.toInt(), referrer.rawAddress.toString(), intargetinfo.rawAddress.toString(), spn.rawAddress.toString(), totalsize.rawAddress.toString(), allocate, istargetinfomarshaled) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setContextAttributesW(phcontext: ConstPtr<SecHandle>, ulattribute: UInt, pbuffer: ConstPtr<CVoid>, cbbuffer: UInt): Hresult =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSetContextAttributesW(phcontext.rawAddress.toString(), ulattribute.toInt(), pbuffer.rawAddress.toString(), cbbuffer.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiAcceptSecurityContextAsync(asynccontext: MutPtr<SspiAsyncContext>, phcredential: ConstPtr<SecHandle>, phcontext: ConstPtr<SecHandle>, pinput: ConstPtr<SecBufferDesc>, fcontextreq: UInt, targetdatarep: UInt, phnewcontext: ConstPtr<SecHandle>, poutput: ConstPtr<SecBufferDesc>, pfcontextattr: ConstPtr<UInt>, ptsexpiry: ConstPtr<Long>): Hresult =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSspiAcceptSecurityContextAsync(asynccontext.rawAddress.toString(), phcredential.rawAddress.toString(), phcontext.rawAddress.toString(), pinput.rawAddress.toString(), fcontextreq.toInt(), targetdatarep.toInt(), phnewcontext.rawAddress.toString(), poutput.rawAddress.toString(), pfcontextattr.rawAddress.toString(), ptsexpiry.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiAcquireCredentialsHandleAsyncA(asynccontext: MutPtr<SspiAsyncContext>, pszprincipal: Pcstr, pszpackage: Pcstr, fcredentialuse: UInt, pvlogonid: ConstPtr<CVoid>, pauthdata: ConstPtr<CVoid>, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: ConstPtr<CVoid>, phcredential: ConstPtr<SecHandle>, ptsexpiry: ConstPtr<Long>): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiAcquireCredentialsHandleAsyncW(asynccontext: MutPtr<SspiAsyncContext>, pszprincipal: ConstPtr<UnicodeString>, pszpackage: ConstPtr<UnicodeString>, fcredentialuse: UInt, pvlogonid: ConstPtr<CVoid>, pauthdata: ConstPtr<CVoid>, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: ConstPtr<CVoid>, phcredential: ConstPtr<SecHandle>, ptsexpiry: ConstPtr<Long>): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiCreateAsyncContext(): MutPtr<SspiAsyncContext> =
    if (windowsWdkStorageFilesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWdkStorageFilesystemSspiCreateAsyncContext().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiDeleteSecurityContextAsync(asynccontext: MutPtr<SspiAsyncContext>, phcontext: ConstPtr<SecHandle>): Hresult =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSspiDeleteSecurityContextAsync(asynccontext.rawAddress.toString(), phcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiFreeAsyncContext(handle: ConstPtr<SspiAsyncContext>) {
    if (windowsWdkStorageFilesystemNapiAvailable) {
        wasmWindowssysWindowsWdkStorageFilesystemSspiFreeAsyncContext(handle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sspiFreeCredentialsHandleAsync(asynccontext: MutPtr<SspiAsyncContext>, phcredential: ConstPtr<SecHandle>): Hresult =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSspiFreeCredentialsHandleAsync(asynccontext.rawAddress.toString(), phcredential.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiGetAsyncCallStatus(handle: ConstPtr<SspiAsyncContext>): Hresult =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSspiGetAsyncCallStatus(handle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiInitializeSecurityContextAsyncA(asynccontext: MutPtr<SspiAsyncContext>, phcredential: ConstPtr<SecHandle>, phcontext: ConstPtr<SecHandle>, psztargetname: Pcstr, fcontextreq: UInt, reserved1: UInt, targetdatarep: UInt, pinput: ConstPtr<SecBufferDesc>, reserved2: UInt, phnewcontext: ConstPtr<SecHandle>, poutput: ConstPtr<SecBufferDesc>, pfcontextattr: ConstPtr<UInt>, ptsexpiry: ConstPtr<Long>): Hresult =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSspiInitializeSecurityContextAsyncA(asynccontext.rawAddress.toString(), phcredential.rawAddress.toString(), phcontext.rawAddress.toString(), psztargetname.rawAddress.toString(), fcontextreq.toInt(), reserved1.toInt(), targetdatarep.toInt(), pinput.rawAddress.toString(), reserved2.toInt(), phnewcontext.rawAddress.toString(), poutput.rawAddress.toString(), pfcontextattr.rawAddress.toString(), ptsexpiry.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiInitializeSecurityContextAsyncW(asynccontext: MutPtr<SspiAsyncContext>, phcredential: ConstPtr<SecHandle>, phcontext: ConstPtr<SecHandle>, psztargetname: ConstPtr<UnicodeString>, fcontextreq: UInt, reserved1: UInt, targetdatarep: UInt, pinput: ConstPtr<SecBufferDesc>, reserved2: UInt, phnewcontext: ConstPtr<SecHandle>, poutput: ConstPtr<SecBufferDesc>, pfcontextattr: ConstPtr<UInt>, ptsexpiry: ConstPtr<Long>): Hresult =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSspiInitializeSecurityContextAsyncW(asynccontext.rawAddress.toString(), phcredential.rawAddress.toString(), phcontext.rawAddress.toString(), psztargetname.rawAddress.toString(), fcontextreq.toInt(), reserved1.toInt(), targetdatarep.toInt(), pinput.rawAddress.toString(), reserved2.toInt(), phnewcontext.rawAddress.toString(), poutput.rawAddress.toString(), pfcontextattr.rawAddress.toString(), ptsexpiry.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiReinitAsyncContext(handle: MutPtr<SspiAsyncContext>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSspiReinitAsyncContext(handle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiSetAsyncNotifyCallback(context: ConstPtr<SspiAsyncContext>, callback: SspiAsyncNotifyCallback, callbackdata: ConstPtr<CVoid>): Hresult =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemSspiSetAsyncNotifyCallback(context.rawAddress.toString(), 0L.toString(), callbackdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verifySignature(phcontext: ConstPtr<SecHandle>, pmessage: ConstPtr<SecBufferDesc>, messageseqno: UInt, pfqop: MutPtr<UInt>): Hresult =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemVerifySignature(phcontext.rawAddress.toString(), pmessage.rawAddress.toString(), messageseqno.toInt(), pfqop.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwAccessCheckAndAuditAlarm(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, objecttypename: ConstPtr<UnicodeString>, objectname: ConstPtr<UnicodeString>, securitydescriptor: PsecurityDescriptor, desiredaccess: UInt, genericmapping: ConstPtr<GenericMapping>, objectcreation: Boolean, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Int>, generateonclose: MutPtr<Boolean>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwAccessCheckAndAuditAlarm(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), objecttypename.rawAddress.toString(), objectname.rawAddress.toString(), securitydescriptor.rawAddress.toString(), desiredaccess.toInt(), genericmapping.rawAddress.toString(), objectcreation, grantedaccess.rawAddress.toString(), accessstatus.rawAddress.toString(), generateonclose.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwAccessCheckByTypeAndAuditAlarm(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, objecttypename: ConstPtr<UnicodeString>, objectname: ConstPtr<UnicodeString>, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: ConstPtr<ObjectTypeList>, objecttypelistlength: UInt, genericmapping: ConstPtr<GenericMapping>, objectcreation: Boolean, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Int>, generateonclose: MutPtr<Boolean>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwAccessCheckByTypeAndAuditAlarm(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), objecttypename.rawAddress.toString(), objectname.rawAddress.toString(), securitydescriptor.rawAddress.toString(), principalselfsid.rawAddress.toString(), desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.rawAddress.toString(), objecttypelistlength.toInt(), genericmapping.rawAddress.toString(), objectcreation, grantedaccess.rawAddress.toString(), accessstatus.rawAddress.toString(), generateonclose.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwAccessCheckByTypeResultListAndAuditAlarm(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, objecttypename: ConstPtr<UnicodeString>, objectname: ConstPtr<UnicodeString>, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: ConstPtr<ObjectTypeList>, objecttypelistlength: UInt, genericmapping: ConstPtr<GenericMapping>, objectcreation: Boolean, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Int>, generateonclose: MutPtr<Boolean>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwAccessCheckByTypeResultListAndAuditAlarm(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), objecttypename.rawAddress.toString(), objectname.rawAddress.toString(), securitydescriptor.rawAddress.toString(), principalselfsid.rawAddress.toString(), desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.rawAddress.toString(), objecttypelistlength.toInt(), genericmapping.rawAddress.toString(), objectcreation, grantedaccess.rawAddress.toString(), accessstatus.rawAddress.toString(), generateonclose.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, clienttoken: Handle, objecttypename: ConstPtr<UnicodeString>, objectname: ConstPtr<UnicodeString>, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: ConstPtr<ObjectTypeList>, objecttypelistlength: UInt, genericmapping: ConstPtr<GenericMapping>, objectcreation: Boolean, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Int>, generateonclose: MutPtr<Boolean>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), clienttoken.rawAddress.toString(), objecttypename.rawAddress.toString(), objectname.rawAddress.toString(), securitydescriptor.rawAddress.toString(), principalselfsid.rawAddress.toString(), desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.rawAddress.toString(), objecttypelistlength.toInt(), genericmapping.rawAddress.toString(), objectcreation, grantedaccess.rawAddress.toString(), accessstatus.rawAddress.toString(), generateonclose.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwAdjustGroupsToken(tokenhandle: Handle, resettodefault: Boolean, newstate: ConstPtr<TokenGroups>, bufferlength: UInt, previousstate: MutPtr<TokenGroups>, returnlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwAdjustGroupsToken(tokenhandle.rawAddress.toString(), resettodefault, newstate.rawAddress.toString(), bufferlength.toInt(), previousstate.rawAddress.toString(), returnlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwAdjustPrivilegesToken(tokenhandle: Handle, disableallprivileges: Boolean, newstate: ConstPtr<TokenPrivileges>, bufferlength: UInt, previousstate: MutPtr<TokenPrivileges>, returnlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwAdjustPrivilegesToken(tokenhandle.rawAddress.toString(), disableallprivileges, newstate.rawAddress.toString(), bufferlength.toInt(), previousstate.rawAddress.toString(), returnlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwAllocateVirtualMemory(processhandle: Handle, baseaddress: MutPtr<MutPtr<CVoid>>, zerobits: ULong, regionsize: MutPtr<ULong>, allocationtype: UInt, protect: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwAllocateVirtualMemory(processhandle.rawAddress.toString(), baseaddress.rawAddress.toString(), zerobits.toString(), regionsize.rawAddress.toString(), allocationtype.toInt(), protect.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwAllocateVirtualMemoryEx(processhandle: Handle, baseaddress: MutPtr<MutPtr<CVoid>>, regionsize: MutPtr<ULong>, allocationtype: UInt, pageprotection: UInt, extendedparameters: MutPtr<MemExtendedParameter>, extendedparametercount: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwAllocateVirtualMemoryEx(processhandle.rawAddress.toString(), baseaddress.rawAddress.toString(), regionsize.rawAddress.toString(), allocationtype.toInt(), pageprotection.toInt(), extendedparameters.rawAddress.toString(), extendedparametercount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCancelIoFileEx(filehandle: Handle, iorequesttocancel: ConstPtr<IoStatusBlock>, iostatusblock: MutPtr<IoStatusBlock>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwCancelIoFileEx(filehandle.rawAddress.toString(), iorequesttocancel.rawAddress.toString(), iostatusblock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCloseObjectAuditAlarm(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, generateonclose: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwCloseObjectAuditAlarm(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), generateonclose) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCreateDirectoryObject(directoryhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwCreateDirectoryObject(directoryhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCreateEvent(eventhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, eventtype: EventType, initialstate: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwCreateEvent(eventhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), eventtype, initialstate) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCreateSectionEx(sectionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, maximumsize: ConstPtr<Long>, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Handle, extendedparameters: MutPtr<MemExtendedParameter>, extendedparametercount: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwCreateSectionEx(sectionhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), maximumsize.rawAddress.toString(), sectionpageprotection.toInt(), allocationattributes.toInt(), filehandle.rawAddress.toString(), extendedparameters.rawAddress.toString(), extendedparametercount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwDeleteFile(objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwDeleteFile(objectattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwDeleteObjectAuditAlarm(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, generateonclose: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwDeleteObjectAuditAlarm(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), generateonclose) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwDuplicateObject(sourceprocesshandle: Handle, sourcehandle: Handle, targetprocesshandle: Handle, targethandle: MutPtr<Handle>, desiredaccess: UInt, handleattributes: UInt, options: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwDuplicateObject(sourceprocesshandle.rawAddress.toString(), sourcehandle.rawAddress.toString(), targetprocesshandle.rawAddress.toString(), targethandle.rawAddress.toString(), desiredaccess.toInt(), handleattributes.toInt(), options.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwDuplicateToken(existingtokenhandle: Handle, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, effectiveonly: Boolean, tokentype: TokenType, newtokenhandle: MutPtr<Handle>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwDuplicateToken(existingtokenhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), effectiveonly, tokentype, newtokenhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwFilterToken(existingtokenhandle: Handle, flags: UInt, sidstodisable: ConstPtr<TokenGroups>, privilegestodelete: ConstPtr<TokenPrivileges>, restrictedsids: ConstPtr<TokenGroups>, newtokenhandle: MutPtr<Handle>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwFilterToken(existingtokenhandle.rawAddress.toString(), flags.toInt(), sidstodisable.rawAddress.toString(), privilegestodelete.rawAddress.toString(), restrictedsids.rawAddress.toString(), newtokenhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwFlushBuffersFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwFlushBuffersFile(filehandle.rawAddress.toString(), iostatusblock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwFlushBuffersFileEx(filehandle: Handle, flags: UInt, parameters: ConstPtr<CVoid>, parameterssize: UInt, iostatusblock: MutPtr<IoStatusBlock>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwFlushBuffersFileEx(filehandle.rawAddress.toString(), flags.toInt(), parameters.rawAddress.toString(), parameterssize.toInt(), iostatusblock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwFlushVirtualMemory(processhandle: Handle, baseaddress: MutPtr<MutPtr<CVoid>>, regionsize: MutPtr<ULong>, iostatus: MutPtr<IoStatusBlock>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwFlushVirtualMemory(processhandle.rawAddress.toString(), baseaddress.rawAddress.toString(), regionsize.rawAddress.toString(), iostatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwFreeVirtualMemory(processhandle: Handle, baseaddress: MutPtr<MutPtr<CVoid>>, regionsize: MutPtr<ULong>, freetype: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwFreeVirtualMemory(processhandle.rawAddress.toString(), baseaddress.rawAddress.toString(), regionsize.rawAddress.toString(), freetype.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwFsControlFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, fscontrolcode: UInt, inputbuffer: ConstPtr<CVoid>, inputbufferlength: UInt, outputbuffer: MutPtr<CVoid>, outputbufferlength: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwFsControlFile(filehandle.rawAddress.toString(), event.rawAddress.toString(), 0L.toString(), apccontext.rawAddress.toString(), iostatusblock.rawAddress.toString(), fscontrolcode.toInt(), inputbuffer.rawAddress.toString(), inputbufferlength.toInt(), outputbuffer.rawAddress.toString(), outputbufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwImpersonateAnonymousToken(threadhandle: Handle): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwImpersonateAnonymousToken(threadhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwLockFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, byteoffset: ConstPtr<Long>, length: ConstPtr<Long>, key: UInt, failimmediately: Boolean, exclusivelock: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwLockFile(filehandle.rawAddress.toString(), event.rawAddress.toString(), 0L.toString(), apccontext.rawAddress.toString(), iostatusblock.rawAddress.toString(), byteoffset.rawAddress.toString(), length.rawAddress.toString(), key.toInt(), failimmediately, exclusivelock) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwNotifyChangeKey(keyhandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, completionfilter: UInt, watchtree: Boolean, buffer: MutPtr<CVoid>, buffersize: UInt, asynchronous: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwNotifyChangeKey(keyhandle.rawAddress.toString(), event.rawAddress.toString(), 0L.toString(), apccontext.rawAddress.toString(), iostatusblock.rawAddress.toString(), completionfilter.toInt(), watchtree, buffer.rawAddress.toString(), buffersize.toInt(), asynchronous) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenDirectoryObject(directoryhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwOpenDirectoryObject(directoryhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenObjectAuditAlarm(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, objecttypename: ConstPtr<UnicodeString>, objectname: ConstPtr<UnicodeString>, securitydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, grantedaccess: UInt, privileges: ConstPtr<PrivilegeSet>, objectcreation: Boolean, accessgranted: Boolean, generateonclose: MutPtr<Boolean>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwOpenObjectAuditAlarm(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), objecttypename.rawAddress.toString(), objectname.rawAddress.toString(), securitydescriptor.rawAddress.toString(), clienttoken.rawAddress.toString(), desiredaccess.toInt(), grantedaccess.toInt(), privileges.rawAddress.toString(), objectcreation, accessgranted, generateonclose.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenProcessToken(processhandle: Handle, desiredaccess: UInt, tokenhandle: MutPtr<Handle>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwOpenProcessToken(processhandle.rawAddress.toString(), desiredaccess.toInt(), tokenhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenProcessTokenEx(processhandle: Handle, desiredaccess: UInt, handleattributes: UInt, tokenhandle: MutPtr<Handle>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwOpenProcessTokenEx(processhandle.rawAddress.toString(), desiredaccess.toInt(), handleattributes.toInt(), tokenhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenThreadToken(threadhandle: Handle, desiredaccess: UInt, openasself: Boolean, tokenhandle: MutPtr<Handle>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwOpenThreadToken(threadhandle.rawAddress.toString(), desiredaccess.toInt(), openasself, tokenhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenThreadTokenEx(threadhandle: Handle, desiredaccess: UInt, openasself: Boolean, handleattributes: UInt, tokenhandle: MutPtr<Handle>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwOpenThreadTokenEx(threadhandle.rawAddress.toString(), desiredaccess.toInt(), openasself, handleattributes.toInt(), tokenhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwPrivilegeCheck(clienttoken: Handle, requiredprivileges: MutPtr<PrivilegeSet>, result: MutPtr<Boolean>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwPrivilegeCheck(clienttoken.rawAddress.toString(), requiredprivileges.rawAddress.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwPrivilegeObjectAuditAlarm(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, clienttoken: Handle, desiredaccess: UInt, privileges: ConstPtr<PrivilegeSet>, accessgranted: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwPrivilegeObjectAuditAlarm(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), clienttoken.rawAddress.toString(), desiredaccess.toInt(), privileges.rawAddress.toString(), accessgranted) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwPrivilegedServiceAuditAlarm(subsystemname: ConstPtr<UnicodeString>, servicename: ConstPtr<UnicodeString>, clienttoken: Handle, privileges: ConstPtr<PrivilegeSet>, accessgranted: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwPrivilegedServiceAuditAlarm(subsystemname.rawAddress.toString(), servicename.rawAddress.toString(), clienttoken.rawAddress.toString(), privileges.rawAddress.toString(), accessgranted) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryDirectoryFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass, returnsingleentry: Boolean, filename: ConstPtr<UnicodeString>, restartscan: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwQueryDirectoryFile(filehandle.rawAddress.toString(), event.rawAddress.toString(), 0L.toString(), apccontext.rawAddress.toString(), iostatusblock.rawAddress.toString(), fileinformation.rawAddress.toString(), length.toInt(), fileinformationclass, returnsingleentry, filename.rawAddress.toString(), restartscan) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryDirectoryFileEx(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass, queryflags: UInt, filename: ConstPtr<UnicodeString>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwQueryDirectoryFileEx(filehandle.rawAddress.toString(), event.rawAddress.toString(), 0L.toString(), apccontext.rawAddress.toString(), iostatusblock.rawAddress.toString(), fileinformation.rawAddress.toString(), length.toInt(), fileinformationclass, queryflags.toInt(), filename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryDirectoryObject(directoryhandle: Handle, buffer: MutPtr<CVoid>, length: UInt, returnsingleentry: Boolean, restartscan: Boolean, context: MutPtr<UInt>, returnlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwQueryDirectoryObject(directoryhandle.rawAddress.toString(), buffer.rawAddress.toString(), length.toInt(), returnsingleentry, restartscan, context.rawAddress.toString(), returnlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryEaFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, buffer: MutPtr<CVoid>, length: UInt, returnsingleentry: Boolean, ealist: ConstPtr<CVoid>, ealistlength: UInt, eaindex: ConstPtr<UInt>, restartscan: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwQueryEaFile(filehandle.rawAddress.toString(), iostatusblock.rawAddress.toString(), buffer.rawAddress.toString(), length.toInt(), returnsingleentry, ealist.rawAddress.toString(), ealistlength.toInt(), eaindex.rawAddress.toString(), restartscan) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryFullAttributesFile(objectattributes: ConstPtr<ObjectAttributes>, fileinformation: MutPtr<FileNetworkOpenInformation>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwQueryFullAttributesFile(objectattributes.rawAddress.toString(), fileinformation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryInformationToken(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: MutPtr<CVoid>, tokeninformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwQueryInformationToken(tokenhandle.rawAddress.toString(), tokeninformationclass, tokeninformation.rawAddress.toString(), tokeninformationlength.toInt(), returnlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryObject(handle: Handle, objectinformationclass: ObjectInformationClass, objectinformation: MutPtr<CVoid>, objectinformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwQueryObject(handle.rawAddress.toString(), objectinformationclass, objectinformation.rawAddress.toString(), objectinformationlength.toInt(), returnlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryQuotaInformationFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, buffer: MutPtr<CVoid>, length: UInt, returnsingleentry: Boolean, sidlist: ConstPtr<CVoid>, sidlistlength: UInt, startsid: Psid, restartscan: Boolean): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwQueryQuotaInformationFile(filehandle.rawAddress.toString(), iostatusblock.rawAddress.toString(), buffer.rawAddress.toString(), length.toInt(), returnsingleentry, sidlist.rawAddress.toString(), sidlistlength.toInt(), startsid.rawAddress.toString(), restartscan) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQuerySecurityObject(handle: Handle, securityinformation: UInt, securitydescriptor: PsecurityDescriptor, length: UInt, lengthneeded: MutPtr<UInt>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwQuerySecurityObject(handle.rawAddress.toString(), securityinformation.toInt(), securitydescriptor.rawAddress.toString(), length.toInt(), lengthneeded.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryVirtualMemory(processhandle: Handle, baseaddress: ConstPtr<CVoid>, memoryinformationclass: MemoryInformationClass, memoryinformation: MutPtr<CVoid>, memoryinformationlength: ULong, returnlength: MutPtr<ULong>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwQueryVirtualMemory(processhandle.rawAddress.toString(), baseaddress.rawAddress.toString(), memoryinformationclass, memoryinformation.rawAddress.toString(), memoryinformationlength.toString(), returnlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryVolumeInformationFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, fsinformation: MutPtr<CVoid>, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwQueryVolumeInformationFile(filehandle.rawAddress.toString(), iostatusblock.rawAddress.toString(), fsinformation.rawAddress.toString(), length.toInt(), fsinformationclass) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetEaFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, buffer: ConstPtr<CVoid>, length: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwSetEaFile(filehandle.rawAddress.toString(), iostatusblock.rawAddress.toString(), buffer.rawAddress.toString(), length.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetEvent(eventhandle: Handle, previousstate: MutPtr<Int>): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwSetEvent(eventhandle.rawAddress.toString(), previousstate.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetInformationToken(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: ConstPtr<CVoid>, tokeninformationlength: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwSetInformationToken(tokenhandle.rawAddress.toString(), tokeninformationclass, tokeninformation.rawAddress.toString(), tokeninformationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetInformationVirtualMemory(processhandle: Handle, vminformationclass: VirtualMemoryInformationClass, numberofentries: ULong, virtualaddresses: ConstPtr<MemoryRangeEntry>, vminformation: ConstPtr<CVoid>, vminformationlength: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwSetInformationVirtualMemory(processhandle.rawAddress.toString(), vminformationclass, numberofentries.toString(), virtualaddresses.rawAddress.toString(), vminformation.rawAddress.toString(), vminformationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetQuotaInformationFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, buffer: ConstPtr<CVoid>, length: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwSetQuotaInformationFile(filehandle.rawAddress.toString(), iostatusblock.rawAddress.toString(), buffer.rawAddress.toString(), length.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetSecurityObject(handle: Handle, securityinformation: UInt, securitydescriptor: PsecurityDescriptor): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwSetSecurityObject(handle.rawAddress.toString(), securityinformation.toInt(), securitydescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetVolumeInformationFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, fsinformation: ConstPtr<CVoid>, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwSetVolumeInformationFile(filehandle.rawAddress.toString(), iostatusblock.rawAddress.toString(), fsinformation.rawAddress.toString(), length.toInt(), fsinformationclass) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwUnlockFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, byteoffset: ConstPtr<Long>, length: ConstPtr<Long>, key: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemNapiAvailable) wasmWindowssysWindowsWdkStorageFilesystemZwUnlockFile(filehandle.rawAddress.toString(), iostatusblock.rawAddress.toString(), byteoffset.rawAddress.toString(), length.rawAddress.toString(), key.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")
