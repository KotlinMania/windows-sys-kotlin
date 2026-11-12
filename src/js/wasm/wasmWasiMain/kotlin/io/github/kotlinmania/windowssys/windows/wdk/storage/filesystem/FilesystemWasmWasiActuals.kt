@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun applyControlToken(phcontext: ConstPtr, pinput: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemApplyControlToken")

public actual fun ccAsyncCopyRead(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, wait: Boolean, buffer: MutPtr, iostatus: MutPtr, ioissuerthread: Pethread, asyncreadcontext: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcAsyncCopyRead")

public actual fun ccCanIWrite(fileobject: ConstPtr, bytestowrite: UInt, wait: Boolean, retrying: UByte): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcCanIWrite")

public actual fun ccCoherencyFlushAndPurgeCache(sectionobjectpointer: ConstPtr, fileoffset: ConstPtr, length: UInt, iostatus: MutPtr, flags: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcCoherencyFlushAndPurgeCache")

public actual fun ccCopyRead(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, wait: Boolean, buffer: MutPtr, iostatus: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcCopyRead")

public actual fun ccCopyReadEx(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, wait: Boolean, buffer: MutPtr, iostatus: MutPtr, ioissuerthread: Pethread): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcCopyReadEx")

public actual fun ccCopyWrite(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, wait: Boolean, buffer: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcCopyWrite")

public actual fun ccCopyWriteEx(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, wait: Boolean, buffer: ConstPtr, ioissuerthread: Pethread): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcCopyWriteEx")

public actual fun ccCopyWriteWontFlush(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcCopyWriteWontFlush")

public actual fun ccDeferWrite(fileobject: ConstPtr, postroutine: PccPostDeferredWrite, context1: ConstPtr, context2: ConstPtr, bytestowrite: UInt, retrying: Boolean): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcDeferWrite")

public actual fun ccErrorCallbackRoutine(context: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcErrorCallbackRoutine")

public actual fun ccFastCopyRead(fileobject: ConstPtr, fileoffset: UInt, length: UInt, pagecount: UInt, buffer: MutPtr, iostatus: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcFastCopyRead")

public actual fun ccFastCopyWrite(fileobject: ConstPtr, fileoffset: UInt, length: UInt, buffer: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcFastCopyWrite")

public actual fun ccFlushCache(sectionobjectpointer: ConstPtr, fileoffset: ConstPtr, length: UInt, iostatus: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcFlushCache")

public actual fun ccGetDirtyPages(loghandle: ConstPtr, dirtypageroutine: PdirtyPageRoutine, context1: ConstPtr, context2: ConstPtr): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcGetDirtyPages")

public actual fun ccGetFileObjectFromBcb(bcb: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcGetFileObjectFromBcb")

public actual fun ccGetFileObjectFromSectionPtrs(sectionobjectpointer: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcGetFileObjectFromSectionPtrs")

public actual fun ccGetFileObjectFromSectionPtrsRef(sectionobjectpointer: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcGetFileObjectFromSectionPtrsRef")

public actual fun ccGetFlushedValidData(sectionobjectpointer: ConstPtr, bcblistheld: Boolean): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcGetFlushedValidData")

public actual fun ccInitializeCacheMap(fileobject: ConstPtr, filesizes: ConstPtr, pinaccess: Boolean, callbacks: ConstPtr, lazywritecontext: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcInitializeCacheMap")

public actual fun ccInitializeCacheMapEx(fileobject: ConstPtr, filesizes: ConstPtr, pinaccess: Boolean, callbacks: ConstPtr, lazywritecontext: ConstPtr, flags: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcInitializeCacheMapEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemCcIsCacheManagerCallbackNeeded")
private external fun wasiWindowssysWindowsWdkStorageFilesystemCcIsCacheManagerCallbackNeeded(status: Int): Int

public actual fun ccIsCacheManagerCallbackNeeded(status: Ntstatus): Boolean =
    (wasiWindowssysWindowsWdkStorageFilesystemCcIsCacheManagerCallbackNeeded(status) != 0)

public actual fun ccIsThereDirtyData(vpb: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcIsThereDirtyData")

public actual fun ccIsThereDirtyDataEx(vpb: ConstPtr, numberofdirtypages: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcIsThereDirtyDataEx")

public actual fun ccMapData(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, flags: UInt, bcb: MutPtr, buffer: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcMapData")

public actual fun ccMdlRead(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, mdlchain: MutPtr, iostatus: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcMdlRead")

public actual fun ccMdlReadComplete(fileobject: ConstPtr, mdlchain: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcMdlReadComplete")

public actual fun ccMdlWriteAbort(fileobject: ConstPtr, mdlchain: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcMdlWriteAbort")

public actual fun ccMdlWriteComplete(fileobject: ConstPtr, fileoffset: ConstPtr, mdlchain: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcMdlWriteComplete")

public actual fun ccPinMappedData(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, flags: UInt, bcb: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcPinMappedData")

public actual fun ccPinRead(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, flags: UInt, bcb: MutPtr, buffer: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcPinRead")

public actual fun ccPrepareMdlWrite(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, mdlchain: MutPtr, iostatus: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcPrepareMdlWrite")

public actual fun ccPreparePinWrite(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, zero: Boolean, flags: UInt, bcb: MutPtr, buffer: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcPreparePinWrite")

public actual fun ccPurgeCacheSection(sectionobjectpointer: ConstPtr, fileoffset: ConstPtr, length: UInt, flags: UInt): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcPurgeCacheSection")

public actual fun ccRemapBcb(bcb: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcRemapBcb")

public actual fun ccRepinBcb(bcb: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcRepinBcb")

public actual fun ccScheduleReadAhead(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcScheduleReadAhead")

public actual fun ccScheduleReadAheadEx(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, ioissuerthread: Pethread): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcScheduleReadAheadEx")

public actual fun ccSetAdditionalCacheAttributes(fileobject: ConstPtr, disablereadahead: Boolean, disablewritebehind: Boolean): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcSetAdditionalCacheAttributes")

public actual fun ccSetAdditionalCacheAttributesEx(fileobject: ConstPtr, flags: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcSetAdditionalCacheAttributesEx")

public actual fun ccSetBcbOwnerPointer(bcb: ConstPtr, ownerpointer: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcSetBcbOwnerPointer")

public actual fun ccSetDirtyPageThreshold(fileobject: ConstPtr, dirtypagethreshold: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcSetDirtyPageThreshold")

public actual fun ccSetDirtyPinnedData(bcbvoid: ConstPtr, lsn: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcSetDirtyPinnedData")

public actual fun ccSetFileSizes(fileobject: ConstPtr, filesizes: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcSetFileSizes")

public actual fun ccSetFileSizesEx(fileobject: ConstPtr, filesizes: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcSetFileSizesEx")

public actual fun ccSetLogHandleForFile(fileobject: ConstPtr, loghandle: ConstPtr, flushtolsnroutine: PflushToLsn): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcSetLogHandleForFile")

public actual fun ccSetParallelFlushFile(fileobject: ConstPtr, enableparallelflush: Boolean): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcSetParallelFlushFile")

public actual fun ccSetReadAheadGranularity(fileobject: ConstPtr, granularity: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcSetReadAheadGranularity")

public actual fun ccUninitializeCacheMap(fileobject: ConstPtr, truncatesize: ConstPtr, uninitializeevent: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcUninitializeCacheMap")

public actual fun ccUnpinData(bcb: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcUnpinData")

public actual fun ccUnpinDataForThread(bcb: ConstPtr, resourcethreadid: ULong): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcUnpinDataForThread")

public actual fun ccUnpinRepinnedBcb(bcb: ConstPtr, writethrough: Boolean, iostatus: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcUnpinRepinnedBcb")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemCcWaitForCurrentLazyWriterActivity")
private external fun wasiWindowssysWindowsWdkStorageFilesystemCcWaitForCurrentLazyWriterActivity(): Int

public actual fun ccWaitForCurrentLazyWriterActivity(): Ntstatus =
    wasiWindowssysWindowsWdkStorageFilesystemCcWaitForCurrentLazyWriterActivity()

public actual fun ccZeroData(fileobject: ConstPtr, startoffset: ConstPtr, endoffset: ConstPtr, wait: Boolean): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCcZeroData")

public actual fun completeAuthToken(phcontext: ConstPtr, ptoken: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemCompleteAuthToken")

public actual fun exDisableResourceBoostLite(resource: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemExDisableResourceBoostLite")

public actual fun exQueryPoolBlockSize(poolblock: ConstPtr, quotacharged: MutPtr): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemExQueryPoolBlockSize")

public actual fun exportSecurityContext(phcontext: ConstPtr, fflags: UInt, ppackedcontext: MutPtr, ptoken: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemExportSecurityContext")

public actual fun fsRtlAcknowledgeEcp(ecpcontext: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlAcknowledgeEcp")

public actual fun fsRtlAcquireFileExclusive(fileobject: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlAcquireFileExclusive")

public actual fun fsRtlAddBaseMcbEntry(mcb: MutPtr, vbn: Long, lbn: Long, sectorcount: Long): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlAddBaseMcbEntry")

public actual fun fsRtlAddBaseMcbEntryEx(mcb: MutPtr, vbn: Long, lbn: Long, sectorcount: Long): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlAddBaseMcbEntryEx")

public actual fun fsRtlAddLargeMcbEntry(mcb: MutPtr, vbn: Long, lbn: Long, sectorcount: Long): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlAddLargeMcbEntry")

public actual fun fsRtlAddMcbEntry(mcb: MutPtr, vbn: UInt, lbn: UInt, sectorcount: UInt): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlAddMcbEntry")

public actual fun fsRtlAddToTunnelCache(cache: MutPtr, directorykey: ULong, shortname: ConstPtr, longname: ConstPtr, keybyshortname: Boolean, datalength: UInt, data: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlAddToTunnelCache")

public actual fun fsRtlAddToTunnelCacheEx(cache: MutPtr, directorykey: ULong, shortname: ConstPtr, longname: ConstPtr, flags: UInt, datalength: UInt, data: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlAddToTunnelCacheEx")

public actual fun fsRtlAllocateAePushLock(pooltype: PoolType, tag: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlAllocateAePushLock")

public actual fun fsRtlAllocateExtraCreateParameter(ecptype: ConstPtr, sizeofcontext: UInt, flags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, pooltag: UInt, ecpcontext: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlAllocateExtraCreateParameter")

public actual fun fsRtlAllocateExtraCreateParameterFromLookasideList(ecptype: ConstPtr, sizeofcontext: UInt, flags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, lookasidelist: MutPtr, ecpcontext: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlAllocateExtraCreateParameterFromLookasideList")

public actual fun fsRtlAllocateExtraCreateParameterList(flags: UInt, ecplist: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlAllocateExtraCreateParameterList")

public actual fun fsRtlAllocateFileLock(completelockirproutine: PcompleteLockIrpRoutine, unlockroutine: PunlockRoutine): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlAllocateFileLock")

public actual fun fsRtlAllocateResource(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlAllocateResource")

public actual fun fsRtlAreNamesEqual(constantnamea: ConstPtr, constantnameb: ConstPtr, ignorecase: Boolean, upcasetable: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlAreNamesEqual")

public actual fun fsRtlAreThereCurrentOrInProgressFileLocks(filelock: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlAreThereCurrentOrInProgressFileLocks")

public actual fun fsRtlAreThereWaitingFileLocks(filelock: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlAreThereWaitingFileLocks")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemFsRtlAreVolumeStartupApplicationsComplete")
private external fun wasiWindowssysWindowsWdkStorageFilesystemFsRtlAreVolumeStartupApplicationsComplete(): Int

public actual fun fsRtlAreVolumeStartupApplicationsComplete(): Boolean =
    (wasiWindowssysWindowsWdkStorageFilesystemFsRtlAreVolumeStartupApplicationsComplete() != 0)

public actual fun fsRtlBalanceReads(targetdevice: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlBalanceReads")

public actual fun fsRtlCancellableWaitForMultipleObjects(count: UInt, objectarray: ConstPtr, waittype: WaitType, timeout: ConstPtr, waitblockarray: ConstPtr, irp: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlCancellableWaitForMultipleObjects")

public actual fun fsRtlCancellableWaitForSingleObject(obj: ConstPtr, timeout: ConstPtr, irp: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlCancellableWaitForSingleObject")

public actual fun fsRtlChangeBackingFileObject(currentfileobject: ConstPtr, newfileobject: ConstPtr, changebackingtype: FsrtlChangeBackingType, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlChangeBackingFileObject")

public actual fun fsRtlCheckLockForOplockRequest(filelock: ConstPtr, allocationsize: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlCheckLockForOplockRequest")

public actual fun fsRtlCheckLockForReadAccess(filelock: ConstPtr, irp: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlCheckLockForReadAccess")

public actual fun fsRtlCheckLockForWriteAccess(filelock: ConstPtr, irp: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlCheckLockForWriteAccess")

public actual fun fsRtlCheckOplock(oplock: ConstPtr, irp: ConstPtr, context: ConstPtr, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlCheckOplock")

public actual fun fsRtlCheckOplockEx(oplock: ConstPtr, irp: ConstPtr, flags: UInt, context: ConstPtr, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlCheckOplockEx")

public actual fun fsRtlCheckOplockEx2(oplock: ConstPtr, irp: ConstPtr, flags: UInt, flagsex2: UInt, completionroutinecontext: ConstPtr, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp, timeout: ULong, notifycontext: ConstPtr, notifyroutine: PoplockNotifyRoutine): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlCheckOplockEx2")

public actual fun fsRtlCheckUpperOplock(oplock: ConstPtr, newloweroplockstate: UInt, completionroutinecontext: ConstPtr, completionroutine: PoplockWaitCompleteRoutine, prependroutine: PoplockFsPrepostIrp, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlCheckUpperOplock")

public actual fun fsRtlCopyRead(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, wait: Boolean, lockkey: UInt, buffer: MutPtr, iostatus: MutPtr, deviceobject: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlCopyRead")

public actual fun fsRtlCopyWrite(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, wait: Boolean, lockkey: UInt, buffer: ConstPtr, iostatus: MutPtr, deviceobject: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlCopyWrite")

public actual fun fsRtlCreateSectionForDataScan(sectionhandle: MutPtr, sectionobject: MutPtr, sectionfilesize: MutPtr, fileobject: ConstPtr, desiredaccess: UInt, objectattributes: ConstPtr, maximumsize: ConstPtr, sectionpageprotection: UInt, allocationattributes: UInt, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlCreateSectionForDataScan")

public actual fun fsRtlCurrentBatchOplock(oplock: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlCurrentBatchOplock")

public actual fun fsRtlCurrentOplock(oplock: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlCurrentOplock")

public actual fun fsRtlCurrentOplockH(oplock: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlCurrentOplockH")

public actual fun fsRtlDeleteExtraCreateParameterLookasideList(lookaside: MutPtr, flags: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlDeleteExtraCreateParameterLookasideList")

public actual fun fsRtlDeleteKeyFromTunnelCache(cache: MutPtr, directorykey: ULong): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlDeleteKeyFromTunnelCache")

public actual fun fsRtlDeleteTunnelCache(cache: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlDeleteTunnelCache")

public actual fun fsRtlDeregisterUncProvider(handle: Handle): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlDeregisterUncProvider")

public actual fun fsRtlDismountComplete(deviceobject: ConstPtr, dismountstatus: Ntstatus): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlDismountComplete")

public actual fun fsRtlDissectDbcs(path: io.github.kotlinmania.windowssys.windows.win32.system.kernel.String, firstname: MutPtr, remainingname: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlDissectDbcs")

public actual fun fsRtlDissectName(path: UnicodeString, firstname: MutPtr, remainingname: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlDissectName")

public actual fun fsRtlDoesDbcsContainWildCards(name: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlDoesDbcsContainWildCards")

public actual fun fsRtlDoesNameContainWildCards(name: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlDoesNameContainWildCards")

public actual fun fsRtlFastCheckLockForRead(filelock: ConstPtr, startingbyte: ConstPtr, length: ConstPtr, key: UInt, fileobject: ConstPtr, processid: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlFastCheckLockForRead")

public actual fun fsRtlFastCheckLockForWrite(filelock: ConstPtr, startingbyte: ConstPtr, length: ConstPtr, key: UInt, fileobject: ConstPtr, processid: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlFastCheckLockForWrite")

public actual fun fsRtlFastUnlockAll(filelock: ConstPtr, fileobject: ConstPtr, processid: Peprocess, context: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlFastUnlockAll")

public actual fun fsRtlFastUnlockAllByKey(filelock: ConstPtr, fileobject: ConstPtr, processid: Peprocess, key: UInt, context: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlFastUnlockAllByKey")

public actual fun fsRtlFastUnlockSingle(filelock: ConstPtr, fileobject: ConstPtr, fileoffset: ConstPtr, length: ConstPtr, processid: Peprocess, key: UInt, context: ConstPtr, alreadysynchronized: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlFastUnlockSingle")

public actual fun fsRtlFindExtraCreateParameter(ecplist: ConstPtr, ecptype: ConstPtr, ecpcontext: MutPtr, ecpcontextsize: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlFindExtraCreateParameter")

public actual fun fsRtlFindInTunnelCache(cache: ConstPtr, directorykey: ULong, name: ConstPtr, shortname: MutPtr, longname: MutPtr, datalength: MutPtr, data: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlFindInTunnelCache")

public actual fun fsRtlFindInTunnelCacheEx(cache: ConstPtr, directorykey: ULong, name: ConstPtr, shortname: MutPtr, longname: MutPtr, flags: UInt, datalength: MutPtr, data: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlFindInTunnelCacheEx")

public actual fun fsRtlFreeAePushLock(aepushlock: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlFreeAePushLock")

public actual fun fsRtlFreeExtraCreateParameter(ecpcontext: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlFreeExtraCreateParameter")

public actual fun fsRtlFreeExtraCreateParameterList(ecplist: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlFreeExtraCreateParameterList")

public actual fun fsRtlFreeFileLock(filelock: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlFreeFileLock")

public actual fun fsRtlGetCurrentProcessLoaderList(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlGetCurrentProcessLoaderList")

public actual fun fsRtlGetEcpListFromIrp(irp: ConstPtr, ecplist: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlGetEcpListFromIrp")

public actual fun fsRtlGetFileSize(fileobject: ConstPtr, filesize: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlGetFileSize")

public actual fun fsRtlGetNextBaseMcbEntry(mcb: ConstPtr, runindex: UInt, vbn: MutPtr, lbn: MutPtr, sectorcount: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlGetNextBaseMcbEntry")

public actual fun fsRtlGetNextExtraCreateParameter(ecplist: ConstPtr, currentecpcontext: ConstPtr, nextecptype: MutPtr, nextecpcontext: MutPtr, nextecpcontextsize: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlGetNextExtraCreateParameter")

public actual fun fsRtlGetNextFileLock(filelock: ConstPtr, restart: Boolean): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlGetNextFileLock")

public actual fun fsRtlGetNextLargeMcbEntry(mcb: ConstPtr, runindex: UInt, vbn: MutPtr, lbn: MutPtr, sectorcount: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlGetNextLargeMcbEntry")

public actual fun fsRtlGetNextMcbEntry(mcb: ConstPtr, runindex: UInt, vbn: MutPtr, lbn: MutPtr, sectorcount: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlGetNextMcbEntry")

public actual fun fsRtlGetSectorSizeInformation(deviceobject: ConstPtr, sectorsizeinfo: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlGetSectorSizeInformation")

public actual fun fsRtlGetSupportedFeatures(deviceobject: ConstPtr, supportedfeatures: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlGetSupportedFeatures")

public actual fun fsRtlGetVirtualDiskNestingLevel(deviceobject: ConstPtr, nestinglevel: MutPtr, nestingflags: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlGetVirtualDiskNestingLevel")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastMdlReadWait")
private external fun wasiWindowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastMdlReadWait(): Unit

public actual fun fsRtlIncrementCcFastMdlReadWait(): Unit =
    wasiWindowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastMdlReadWait()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadNoWait")
private external fun wasiWindowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadNoWait(): Unit

public actual fun fsRtlIncrementCcFastReadNoWait(): Unit =
    wasiWindowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadNoWait()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadNotPossible")
private external fun wasiWindowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadNotPossible(): Unit

public actual fun fsRtlIncrementCcFastReadNotPossible(): Unit =
    wasiWindowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadNotPossible()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadResourceMiss")
private external fun wasiWindowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadResourceMiss(): Unit

public actual fun fsRtlIncrementCcFastReadResourceMiss(): Unit =
    wasiWindowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadResourceMiss()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadWait")
private external fun wasiWindowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadWait(): Unit

public actual fun fsRtlIncrementCcFastReadWait(): Unit =
    wasiWindowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadWait()

public actual fun fsRtlInitExtraCreateParameterLookasideList(lookaside: MutPtr, flags: UInt, size: ULong, tag: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlInitExtraCreateParameterLookasideList")

public actual fun fsRtlInitializeBaseMcb(mcb: MutPtr, pooltype: PoolType): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlInitializeBaseMcb")

public actual fun fsRtlInitializeBaseMcbEx(mcb: MutPtr, pooltype: PoolType, flags: UShort): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlInitializeBaseMcbEx")

public actual fun fsRtlInitializeExtraCreateParameter(ecp: MutPtr, ecpflags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, totalsize: UInt, ecptype: ConstPtr, listallocatedfrom: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlInitializeExtraCreateParameter")

public actual fun fsRtlInitializeExtraCreateParameterList(ecplist: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlInitializeExtraCreateParameterList")

public actual fun fsRtlInitializeFileLock(filelock: MutPtr, completelockirproutine: PcompleteLockIrpRoutine, unlockroutine: PunlockRoutine): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlInitializeFileLock")

public actual fun fsRtlInitializeLargeMcb(mcb: MutPtr, pooltype: PoolType): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlInitializeLargeMcb")

public actual fun fsRtlInitializeMcb(mcb: MutPtr, pooltype: PoolType): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlInitializeMcb")

public actual fun fsRtlInitializeOplock(oplock: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlInitializeOplock")

public actual fun fsRtlInitializeTunnelCache(cache: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlInitializeTunnelCache")

public actual fun fsRtlInsertExtraCreateParameter(ecplist: MutPtr, ecpcontext: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlInsertExtraCreateParameter")

public actual fun fsRtlInsertPerFileContext(perfilecontextpointer: ConstPtr, ptr: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlInsertPerFileContext")

public actual fun fsRtlInsertPerFileObjectContext(fileobject: ConstPtr, ptr: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlInsertPerFileObjectContext")

public actual fun fsRtlInsertPerStreamContext(perstreamcontext: ConstPtr, ptr: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlInsertPerStreamContext")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemFsRtlIs32BitProcess")
private external fun wasiWindowssysWindowsWdkStorageFilesystemFsRtlIs32BitProcess(process: Long): Int

public actual fun fsRtlIs32BitProcess(process: Peprocess): Boolean =
    (wasiWindowssysWindowsWdkStorageFilesystemFsRtlIs32BitProcess(process) != 0)

public actual fun fsRtlIsDaxVolume(fileobject: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlIsDaxVolume")

public actual fun fsRtlIsDbcsInExpression(expression: ConstPtr, name: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlIsDbcsInExpression")

public actual fun fsRtlIsEcpAcknowledged(ecpcontext: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlIsEcpAcknowledged")

public actual fun fsRtlIsEcpFromUserMode(ecpcontext: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlIsEcpFromUserMode")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemFsRtlIsExtentDangling")
private external fun wasiWindowssysWindowsWdkStorageFilesystemFsRtlIsExtentDangling(startpage: Int, numberofpages: Int, flags: Int): Int

public actual fun fsRtlIsExtentDangling(startpage: UInt, numberofpages: UInt, flags: UInt): UInt =
    wasiWindowssysWindowsWdkStorageFilesystemFsRtlIsExtentDangling(startpage.toInt(), numberofpages.toInt(), flags.toInt()).toUInt()

public actual fun fsRtlIsFatDbcsLegal(dbcsname: io.github.kotlinmania.windowssys.windows.win32.system.kernel.String, wildcardspermissible: Boolean, pathnamepermissible: Boolean, leadingbackslashpermissible: Boolean): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlIsFatDbcsLegal")

public actual fun fsRtlIsHpfsDbcsLegal(dbcsname: io.github.kotlinmania.windowssys.windows.win32.system.kernel.String, wildcardspermissible: Boolean, pathnamepermissible: Boolean, leadingbackslashpermissible: Boolean): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlIsHpfsDbcsLegal")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemFsRtlIsMobileOS")
private external fun wasiWindowssysWindowsWdkStorageFilesystemFsRtlIsMobileOS(): Int

public actual fun fsRtlIsMobileOS(): Boolean =
    (wasiWindowssysWindowsWdkStorageFilesystemFsRtlIsMobileOS() != 0)

public actual fun fsRtlIsNameInExpression(expression: ConstPtr, name: ConstPtr, ignorecase: Boolean, upcasetable: Pcwstr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlIsNameInExpression")

public actual fun fsRtlIsNameInUnUpcasedExpression(expression: ConstPtr, name: ConstPtr, ignorecase: Boolean, upcasetable: Pcwstr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlIsNameInUnUpcasedExpression")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemFsRtlIsNonEmptyDirectoryReparsePointAllowed")
private external fun wasiWindowssysWindowsWdkStorageFilesystemFsRtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag: Int): Int

public actual fun fsRtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag: UInt): Boolean =
    (wasiWindowssysWindowsWdkStorageFilesystemFsRtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag.toInt()) != 0)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemFsRtlIsNtstatusExpected")
private external fun wasiWindowssysWindowsWdkStorageFilesystemFsRtlIsNtstatusExpected(exception: Int): Int

public actual fun fsRtlIsNtstatusExpected(exception: Ntstatus): Boolean =
    (wasiWindowssysWindowsWdkStorageFilesystemFsRtlIsNtstatusExpected(exception) != 0)

public actual fun fsRtlIsPagingFile(fileobject: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlIsPagingFile")

public actual fun fsRtlIsSystemPagingFile(fileobject: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlIsSystemPagingFile")

public actual fun fsRtlIssueDeviceIoControl(deviceobject: ConstPtr, ioctl: UInt, flags: UByte, inputbuffer: ConstPtr, inputbufferlength: UInt, outputbuffer: ConstPtr, outputbufferlength: UInt, iosbinformation: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlIssueDeviceIoControl")

public actual fun fsRtlKernelFsControlFile(fileobject: ConstPtr, fscontrolcode: UInt, inputbuffer: ConstPtr, inputbufferlength: UInt, outputbuffer: MutPtr, outputbufferlength: UInt, retoutputbuffersize: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlKernelFsControlFile")

public actual fun fsRtlLogCcFlushError(filename: ConstPtr, deviceobject: ConstPtr, sectionobjectpointer: ConstPtr, flusherror: Ntstatus, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlLogCcFlushError")

public actual fun fsRtlLookupBaseMcbEntry(mcb: ConstPtr, vbn: Long, lbn: MutPtr, sectorcountfromlbn: MutPtr, startinglbn: MutPtr, sectorcountfromstartinglbn: MutPtr, index: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlLookupBaseMcbEntry")

public actual fun fsRtlLookupLargeMcbEntry(mcb: ConstPtr, vbn: Long, lbn: MutPtr, sectorcountfromlbn: MutPtr, startinglbn: MutPtr, sectorcountfromstartinglbn: MutPtr, index: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlLookupLargeMcbEntry")

public actual fun fsRtlLookupLastBaseMcbEntry(mcb: ConstPtr, vbn: MutPtr, lbn: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlLookupLastBaseMcbEntry")

public actual fun fsRtlLookupLastBaseMcbEntryAndIndex(opaquemcb: ConstPtr, largevbn: MutPtr, largelbn: MutPtr, index: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlLookupLastBaseMcbEntryAndIndex")

public actual fun fsRtlLookupLastLargeMcbEntry(mcb: ConstPtr, vbn: MutPtr, lbn: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlLookupLastLargeMcbEntry")

public actual fun fsRtlLookupLastLargeMcbEntryAndIndex(opaquemcb: ConstPtr, largevbn: MutPtr, largelbn: MutPtr, index: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlLookupLastLargeMcbEntryAndIndex")

public actual fun fsRtlLookupLastMcbEntry(mcb: ConstPtr, vbn: MutPtr, lbn: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlLookupLastMcbEntry")

public actual fun fsRtlLookupMcbEntry(mcb: ConstPtr, vbn: UInt, lbn: MutPtr, sectorcount: MutPtr, index: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlLookupMcbEntry")

public actual fun fsRtlLookupPerFileContext(perfilecontextpointer: ConstPtr, ownerid: ConstPtr, instanceid: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlLookupPerFileContext")

public actual fun fsRtlLookupPerFileObjectContext(fileobject: ConstPtr, ownerid: ConstPtr, instanceid: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlLookupPerFileObjectContext")

public actual fun fsRtlLookupPerStreamContextInternal(streamcontext: ConstPtr, ownerid: ConstPtr, instanceid: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlLookupPerStreamContextInternal")

public actual fun fsRtlMdlReadCompleteDev(fileobject: ConstPtr, mdlchain: ConstPtr, deviceobject: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlMdlReadCompleteDev")

public actual fun fsRtlMdlReadDev(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, lockkey: UInt, mdlchain: MutPtr, iostatus: MutPtr, deviceobject: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlMdlReadDev")

public actual fun fsRtlMdlReadEx(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, lockkey: UInt, mdlchain: MutPtr, iostatus: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlMdlReadEx")

public actual fun fsRtlMdlWriteCompleteDev(fileobject: ConstPtr, fileoffset: ConstPtr, mdlchain: ConstPtr, deviceobject: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlMdlWriteCompleteDev")

public actual fun fsRtlMupGetProviderIdFromName(pprovidername: ConstPtr, pproviderid: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlMupGetProviderIdFromName")

public actual fun fsRtlMupGetProviderInfoFromFileObject(pfileobject: ConstPtr, level: UInt, pbuffer: MutPtr, pbuffersize: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlMupGetProviderInfoFromFileObject")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemFsRtlNormalizeNtstatus")
private external fun wasiWindowssysWindowsWdkStorageFilesystemFsRtlNormalizeNtstatus(exception: Int, genericexception: Int): Int

public actual fun fsRtlNormalizeNtstatus(exception: Ntstatus, genericexception: Ntstatus): Ntstatus =
    wasiWindowssysWindowsWdkStorageFilesystemFsRtlNormalizeNtstatus(exception, genericexception)

public actual fun fsRtlNotifyCleanup(notifysync: PnotifySync, notifylist: ConstPtr, fscontext: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlNotifyCleanup")

public actual fun fsRtlNotifyCleanupAll(notifysync: PnotifySync, notifylist: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlNotifyCleanupAll")

public actual fun fsRtlNotifyFilterChangeDirectory(notifysync: PnotifySync, notifylist: ConstPtr, fscontext: ConstPtr, fulldirectoryname: ConstPtr, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifyirp: ConstPtr, traversecallback: PcheckForTraverseAccess, subjectcontext: ConstPtr, filtercallback: PfilterReportChange): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlNotifyFilterChangeDirectory")

public actual fun fsRtlNotifyFilterReportChange(notifysync: PnotifySync, notifylist: ConstPtr, fulltargetname: ConstPtr, targetnameoffset: UShort, streamname: ConstPtr, normalizedparentname: ConstPtr, filtermatch: UInt, action: UInt, targetcontext: ConstPtr, filtercontext: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlNotifyFilterReportChange")

public actual fun fsRtlNotifyFullChangeDirectory(notifysync: PnotifySync, notifylist: ConstPtr, fscontext: ConstPtr, fulldirectoryname: MutPtr, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifyirp: ConstPtr, traversecallback: PcheckForTraverseAccess, subjectcontext: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlNotifyFullChangeDirectory")

public actual fun fsRtlNotifyFullReportChange(notifysync: PnotifySync, notifylist: ConstPtr, fulltargetname: ConstPtr, targetnameoffset: UShort, streamname: ConstPtr, normalizedparentname: ConstPtr, filtermatch: UInt, action: UInt, targetcontext: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlNotifyFullReportChange")

public actual fun fsRtlNotifyInitializeSync(notifysync: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlNotifyInitializeSync")

public actual fun fsRtlNotifyUninitializeSync(notifysync: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlNotifyUninitializeSync")

public actual fun fsRtlNotifyVolumeEvent(fileobject: ConstPtr, eventcode: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlNotifyVolumeEvent")

public actual fun fsRtlNotifyVolumeEventEx(fileobject: ConstPtr, eventcode: UInt, event: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlNotifyVolumeEventEx")

public actual fun fsRtlNumberOfRunsInBaseMcb(mcb: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlNumberOfRunsInBaseMcb")

public actual fun fsRtlNumberOfRunsInLargeMcb(mcb: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlNumberOfRunsInLargeMcb")

public actual fun fsRtlNumberOfRunsInMcb(mcb: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlNumberOfRunsInMcb")

public actual fun fsRtlOplockBreakH(oplock: ConstPtr, irp: ConstPtr, flags: UInt, context: ConstPtr, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlOplockBreakH")

public actual fun fsRtlOplockBreakH2(oplock: ConstPtr, irp: ConstPtr, flags: UInt, context: ConstPtr, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp, grantedaccess: ConstPtr, shareaccess: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlOplockBreakH2")

public actual fun fsRtlOplockBreakToNone(oplock: MutPtr, irpsp: ConstPtr, irp: ConstPtr, context: ConstPtr, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlOplockBreakToNone")

public actual fun fsRtlOplockBreakToNoneEx(oplock: MutPtr, irp: ConstPtr, flags: UInt, context: ConstPtr, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlOplockBreakToNoneEx")

public actual fun fsRtlOplockFsctrl(oplock: ConstPtr, irp: ConstPtr, opencount: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlOplockFsctrl")

public actual fun fsRtlOplockFsctrlEx(oplock: ConstPtr, irp: ConstPtr, opencount: UInt, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlOplockFsctrlEx")

public actual fun fsRtlOplockGetAnyBreakOwnerProcess(oplock: ConstPtr): Peprocess =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlOplockGetAnyBreakOwnerProcess")

public actual fun fsRtlOplockIsFastIoPossible(oplock: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlOplockIsFastIoPossible")

public actual fun fsRtlOplockIsSharedRequest(irp: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlOplockIsSharedRequest")

public actual fun fsRtlOplockKeysEqual(fo1: ConstPtr, fo2: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlOplockKeysEqual")

public actual fun fsRtlPostPagingFileStackOverflow(context: ConstPtr, event: ConstPtr, stackoverflowroutine: PfsrtlStackOverflowRoutine): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlPostPagingFileStackOverflow")

public actual fun fsRtlPostStackOverflow(context: ConstPtr, event: ConstPtr, stackoverflowroutine: PfsrtlStackOverflowRoutine): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlPostStackOverflow")

public actual fun fsRtlPrepareMdlWriteDev(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, lockkey: UInt, mdlchain: MutPtr, iostatus: MutPtr, deviceobject: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlPrepareMdlWriteDev")

public actual fun fsRtlPrepareMdlWriteEx(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, lockkey: UInt, mdlchain: MutPtr, iostatus: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlPrepareMdlWriteEx")

public actual fun fsRtlPrepareToReuseEcp(ecpcontext: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlPrepareToReuseEcp")

public actual fun fsRtlPrivateLock(filelock: ConstPtr, fileobject: ConstPtr, fileoffset: ConstPtr, length: ConstPtr, processid: Peprocess, key: UInt, failimmediately: Boolean, exclusivelock: Boolean, iosb: MutPtr, irp: ConstPtr, context: ConstPtr, alreadysynchronized: Boolean): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlPrivateLock")

public actual fun fsRtlProcessFileLock(filelock: ConstPtr, irp: ConstPtr, context: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlProcessFileLock")

public actual fun fsRtlQueryCachedVdl(fileobject: ConstPtr, vdl: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlQueryCachedVdl")

public actual fun fsRtlQueryInformationFile(fileobject: ConstPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass, retfileinformationsize: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlQueryInformationFile")

public actual fun fsRtlQueryKernelEaFile(fileobject: ConstPtr, returnedeadata: MutPtr, length: UInt, returnsingleentry: Boolean, ealist: ConstPtr, ealistlength: UInt, eaindex: ConstPtr, restartscan: Boolean, lengthreturned: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlQueryKernelEaFile")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemFsRtlQueryMaximumVirtualDiskNestingLevel")
private external fun wasiWindowssysWindowsWdkStorageFilesystemFsRtlQueryMaximumVirtualDiskNestingLevel(): Int

public actual fun fsRtlQueryMaximumVirtualDiskNestingLevel(): UInt =
    wasiWindowssysWindowsWdkStorageFilesystemFsRtlQueryMaximumVirtualDiskNestingLevel().toUInt()

public actual fun fsRtlRegisterFileSystemFilterCallbacks(filterdriverobject: ConstPtr, callbacks: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlRegisterFileSystemFilterCallbacks")

public actual fun fsRtlRegisterUncProvider(muphandle: MutPtr, redirectordevicename: ConstPtr, mailslotssupported: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlRegisterUncProvider")

public actual fun fsRtlRegisterUncProviderEx(muphandle: MutPtr, redirdevname: ConstPtr, deviceobject: ConstPtr, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlRegisterUncProviderEx")

public actual fun fsRtlRegisterUncProviderEx2(redirdevname: ConstPtr, deviceobject: ConstPtr, registration: ConstPtr, muphandle: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlRegisterUncProviderEx2")

public actual fun fsRtlReleaseFile(fileobject: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlReleaseFile")

public actual fun fsRtlRemoveBaseMcbEntry(mcb: MutPtr, vbn: Long, sectorcount: Long): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlRemoveBaseMcbEntry")

public actual fun fsRtlRemoveDotsFromPath(originalstring: Pwstr, pathlength: UShort, newlength: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlRemoveDotsFromPath")

public actual fun fsRtlRemoveExtraCreateParameter(ecplist: MutPtr, ecptype: ConstPtr, ecpcontext: MutPtr, ecpcontextsize: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlRemoveExtraCreateParameter")

public actual fun fsRtlRemoveLargeMcbEntry(mcb: MutPtr, vbn: Long, sectorcount: Long): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlRemoveLargeMcbEntry")

public actual fun fsRtlRemoveMcbEntry(mcb: MutPtr, vbn: UInt, sectorcount: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlRemoveMcbEntry")

public actual fun fsRtlRemovePerFileContext(perfilecontextpointer: ConstPtr, ownerid: ConstPtr, instanceid: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlRemovePerFileContext")

public actual fun fsRtlRemovePerFileObjectContext(fileobject: ConstPtr, ownerid: ConstPtr, instanceid: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlRemovePerFileObjectContext")

public actual fun fsRtlRemovePerStreamContext(streamcontext: ConstPtr, ownerid: ConstPtr, instanceid: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlRemovePerStreamContext")

public actual fun fsRtlResetBaseMcb(mcb: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlResetBaseMcb")

public actual fun fsRtlResetLargeMcb(mcb: MutPtr, selfsynchronized: Boolean): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlResetLargeMcb")

public actual fun fsRtlSetDriverBacking(driverobj: ConstPtr, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlSetDriverBacking")

public actual fun fsRtlSetEcpListIntoIrp(irp: MutPtr, ecplist: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlSetEcpListIntoIrp")

public actual fun fsRtlSetKernelEaFile(fileobject: ConstPtr, eabuffer: ConstPtr, length: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlSetKernelEaFile")

public actual fun fsRtlSplitBaseMcb(mcb: MutPtr, vbn: Long, amount: Long): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlSplitBaseMcb")

public actual fun fsRtlSplitLargeMcb(mcb: MutPtr, vbn: Long, amount: Long): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlSplitLargeMcb")

public actual fun fsRtlTeardownPerFileContexts(perfilecontextpointer: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlTeardownPerFileContexts")

public actual fun fsRtlTeardownPerStreamContexts(advancedheader: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlTeardownPerStreamContexts")

public actual fun fsRtlTruncateBaseMcb(mcb: MutPtr, vbn: Long): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlTruncateBaseMcb")

public actual fun fsRtlTruncateLargeMcb(mcb: MutPtr, vbn: Long): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlTruncateLargeMcb")

public actual fun fsRtlTruncateMcb(mcb: MutPtr, vbn: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlTruncateMcb")

public actual fun fsRtlUninitializeBaseMcb(mcb: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlUninitializeBaseMcb")

public actual fun fsRtlUninitializeFileLock(filelock: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlUninitializeFileLock")

public actual fun fsRtlUninitializeLargeMcb(mcb: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlUninitializeLargeMcb")

public actual fun fsRtlUninitializeMcb(mcb: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlUninitializeMcb")

public actual fun fsRtlUninitializeOplock(oplock: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlUninitializeOplock")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemFsRtlUpdateDiskCounters")
private external fun wasiWindowssysWindowsWdkStorageFilesystemFsRtlUpdateDiskCounters(bytesread: Long, byteswritten: Long): Unit

public actual fun fsRtlUpdateDiskCounters(bytesread: ULong, byteswritten: ULong): Unit =
    wasiWindowssysWindowsWdkStorageFilesystemFsRtlUpdateDiskCounters(bytesread.toLong(), byteswritten.toLong())

public actual fun fsRtlUpperOplockFsctrl(oplock: ConstPtr, irp: ConstPtr, opencount: UInt, loweroplockstate: UInt, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlUpperOplockFsctrl")

public actual fun fsRtlValidateReparsePointBuffer(bufferlength: UInt, reparsebuffer: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlValidateReparsePointBuffer")

public actual fun fsRtlVolumeDeviceToCorrelationId(volumedeviceobject: ConstPtr, guid: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemFsRtlVolumeDeviceToCorrelationId")

public actual fun getSecurityUserInfo(logonid: ConstPtr, flags: UInt, userinformation: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemGetSecurityUserInfo")

public actual fun ioAcquireVpbSpinLock(irql: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoAcquireVpbSpinLock")

public actual fun ioApplyPriorityInfoThread(inputpriorityinfo: ConstPtr, outputpriorityinfo: MutPtr, thread: Pethread): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoApplyPriorityInfoThread")

public actual fun ioCheckDesiredAccess(desiredaccess: MutPtr, grantedaccess: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoCheckDesiredAccess")

public actual fun ioCheckEaBufferValidity(eabuffer: ConstPtr, ealength: UInt, erroroffset: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoCheckEaBufferValidity")

public actual fun ioCheckFunctionAccess(grantedaccess: UInt, majorfunction: UByte, minorfunction: UByte, iocontrolcode: UInt, arg1: ConstPtr, arg2: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoCheckFunctionAccess")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemIoCheckQuerySetFileInformation")
private external fun wasiWindowssysWindowsWdkStorageFilesystemIoCheckQuerySetFileInformation(fileinformationclass: Int, length: Int, setoperation: Int): Int

public actual fun ioCheckQuerySetFileInformation(fileinformationclass: FileInformationClass, length: UInt, setoperation: Boolean): Ntstatus =
    wasiWindowssysWindowsWdkStorageFilesystemIoCheckQuerySetFileInformation(fileinformationclass, length.toInt(), if (setoperation) 1 else 0)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemIoCheckQuerySetVolumeInformation")
private external fun wasiWindowssysWindowsWdkStorageFilesystemIoCheckQuerySetVolumeInformation(fsinformationclass: Int, length: Int, setoperation: Int): Int

public actual fun ioCheckQuerySetVolumeInformation(fsinformationclass: FsInformationClass, length: UInt, setoperation: Boolean): Ntstatus =
    wasiWindowssysWindowsWdkStorageFilesystemIoCheckQuerySetVolumeInformation(fsinformationclass, length.toInt(), if (setoperation) 1 else 0)

public actual fun ioCheckQuotaBufferValidity(quotabuffer: ConstPtr, quotalength: UInt, erroroffset: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoCheckQuotaBufferValidity")

public actual fun ioClearFsTrackOffsetState(irp: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoClearFsTrackOffsetState")

public actual fun ioCreateStreamFileObject(fileobject: ConstPtr, deviceobject: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoCreateStreamFileObject")

public actual fun ioCreateStreamFileObjectEx(fileobject: ConstPtr, deviceobject: ConstPtr, filehandle: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoCreateStreamFileObjectEx")

public actual fun ioCreateStreamFileObjectEx2(createoptions: ConstPtr, fileobject: ConstPtr, deviceobject: ConstPtr, streamfileobject: MutPtr, filehandle: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoCreateStreamFileObjectEx2")

public actual fun ioCreateStreamFileObjectLite(fileobject: ConstPtr, deviceobject: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoCreateStreamFileObjectLite")

public actual fun ioEnumerateDeviceObjectList(driverobject: ConstPtr, deviceobjectlist: MutPtr, deviceobjectlistsize: UInt, actualnumberdeviceobjects: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoEnumerateDeviceObjectList")

public actual fun ioEnumerateRegisteredFiltersList(driverobjectlist: MutPtr, driverobjectlistsize: UInt, actualnumberdriverobjects: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoEnumerateRegisteredFiltersList")

public actual fun ioFastQueryNetworkAttributes(objectattributes: ConstPtr, desiredaccess: UInt, openoptions: UInt, iostatus: MutPtr, buffer: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoFastQueryNetworkAttributes")

public actual fun ioGetAttachedDevice(deviceobject: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoGetAttachedDevice")

public actual fun ioGetBaseFileSystemDeviceObject(fileobject: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoGetBaseFileSystemDeviceObject")

public actual fun ioGetDeviceAttachmentBaseRef(deviceobject: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoGetDeviceAttachmentBaseRef")

public actual fun ioGetDeviceToVerify(thread: Pethread): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoGetDeviceToVerify")

public actual fun ioGetDiskDeviceObject(filesystemdeviceobject: ConstPtr, diskdeviceobject: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoGetDiskDeviceObject")

public actual fun ioGetFsTrackOffsetState(irp: ConstPtr, retfstrackoffsetblob: MutPtr, rettrackedoffset: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoGetFsTrackOffsetState")

public actual fun ioGetLowerDeviceObject(deviceobject: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoGetLowerDeviceObject")

public actual fun ioGetOplockKeyContext(fileobject: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoGetOplockKeyContext")

public actual fun ioGetOplockKeyContextEx(fileobject: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoGetOplockKeyContextEx")

public actual fun ioGetRequestorProcess(irp: ConstPtr): Peprocess =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoGetRequestorProcess")

public actual fun ioGetRequestorProcessId(irp: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoGetRequestorProcessId")

public actual fun ioGetRequestorSessionId(irp: ConstPtr, psessionid: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoGetRequestorSessionId")

public actual fun ioIrpHasFsTrackOffsetExtensionType(irp: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoIrpHasFsTrackOffsetExtensionType")

public actual fun ioIsOperationSynchronous(irp: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoIsOperationSynchronous")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemIoIsSystemThread")
private external fun wasiWindowssysWindowsWdkStorageFilesystemIoIsSystemThread(thread: Long): Int

public actual fun ioIsSystemThread(thread: Pethread): Boolean =
    (wasiWindowssysWindowsWdkStorageFilesystemIoIsSystemThread(thread) != 0)

public actual fun ioIsValidNameGraftingBuffer(irp: ConstPtr, reparsebuffer: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoIsValidNameGraftingBuffer")

public actual fun ioPageRead(fileobject: ConstPtr, memorydescriptorlist: ConstPtr, startingoffset: ConstPtr, event: ConstPtr, iostatusblock: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoPageRead")

public actual fun ioQueryFileDosDeviceName(fileobject: ConstPtr, objectnameinformation: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoQueryFileDosDeviceName")

public actual fun ioQueryFileInformation(fileobject: ConstPtr, fileinformationclass: FileInformationClass, length: UInt, fileinformation: MutPtr, returnedlength: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoQueryFileInformation")

public actual fun ioQueryVolumeInformation(fileobject: ConstPtr, fsinformationclass: FsInformationClass, length: UInt, fsinformation: MutPtr, returnedlength: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoQueryVolumeInformation")

public actual fun ioQueueThreadIrp(irp: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoQueueThreadIrp")

public actual fun ioRegisterFileSystem(deviceobject: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoRegisterFileSystem")

public actual fun ioRegisterFsRegistrationChange(driverobject: ConstPtr, drivernotificationroutine: DriverFsNotification): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoRegisterFsRegistrationChange")

public actual fun ioRegisterFsRegistrationChangeMountAware(driverobject: ConstPtr, drivernotificationroutine: DriverFsNotification, synchronizewithmounts: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoRegisterFsRegistrationChangeMountAware")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemIoReleaseVpbSpinLock")
private external fun wasiWindowssysWindowsWdkStorageFilesystemIoReleaseVpbSpinLock(irql: Int): Unit

public actual fun ioReleaseVpbSpinLock(irql: UByte): Unit =
    wasiWindowssysWindowsWdkStorageFilesystemIoReleaseVpbSpinLock(irql.toInt())

public actual fun ioReplaceFileObjectName(fileobject: ConstPtr, newfilename: Pcwstr, filenamelength: UShort): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoReplaceFileObjectName")

public actual fun ioRequestDeviceRemovalForReset(physicaldeviceobject: ConstPtr, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoRequestDeviceRemovalForReset")

public actual fun ioRetrievePriorityInfo(irp: ConstPtr, fileobject: ConstPtr, thread: Pethread, priorityinfo: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoRetrievePriorityInfo")

public actual fun ioSetDeviceToVerify(thread: Pethread, deviceobject: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoSetDeviceToVerify")

public actual fun ioSetFsTrackOffsetState(irp: MutPtr, fstrackoffsetblob: ConstPtr, trackedoffset: Long): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoSetFsTrackOffsetState")

public actual fun ioSetInformation(fileobject: ConstPtr, fileinformationclass: FileInformationClass, length: UInt, fileinformation: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoSetInformation")

public actual fun ioSynchronousPageWrite(fileobject: ConstPtr, memorydescriptorlist: ConstPtr, startingoffset: ConstPtr, event: ConstPtr, iostatusblock: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoSynchronousPageWrite")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemIoThreadToProcess")
private external fun wasiWindowssysWindowsWdkStorageFilesystemIoThreadToProcess(thread: Long): Long

public actual fun ioThreadToProcess(thread: Pethread): Peprocess =
    wasiWindowssysWindowsWdkStorageFilesystemIoThreadToProcess(thread)

public actual fun ioUnregisterFileSystem(deviceobject: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoUnregisterFileSystem")

public actual fun ioUnregisterFsRegistrationChange(driverobject: ConstPtr, drivernotificationroutine: DriverFsNotification): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoUnregisterFsRegistrationChange")

public actual fun ioVerifyVolume(deviceobject: ConstPtr, allowrawmount: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemIoVerifyVolume")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemKeAcquireQueuedSpinLock")
private external fun wasiWindowssysWindowsWdkStorageFilesystemKeAcquireQueuedSpinLock(number: Int): Int

public actual fun keAcquireQueuedSpinLock(number: KspinLockQueueNumber): UByte =
    wasiWindowssysWindowsWdkStorageFilesystemKeAcquireQueuedSpinLock(number).toUByte()

public actual fun keAcquireSpinLockRaiseToSynch(spinlock: MutPtr): UByte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemKeAcquireSpinLockRaiseToSynch")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemKeAttachProcess")
private external fun wasiWindowssysWindowsWdkStorageFilesystemKeAttachProcess(process: Long): Unit

public actual fun keAttachProcess(process: Prkprocess): Unit =
    wasiWindowssysWindowsWdkStorageFilesystemKeAttachProcess(process)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemKeDetachProcess")
private external fun wasiWindowssysWindowsWdkStorageFilesystemKeDetachProcess(): Unit

public actual fun keDetachProcess(): Unit =
    wasiWindowssysWindowsWdkStorageFilesystemKeDetachProcess()

public actual fun keInitializeMutant(mutant: MutPtr, initialowner: Boolean): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemKeInitializeMutant")

public actual fun keInitializeQueue(queue: MutPtr, count: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemKeInitializeQueue")

public actual fun keInsertHeadQueue(queue: MutPtr, entry: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemKeInsertHeadQueue")

public actual fun keInsertQueue(queue: MutPtr, entry: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemKeInsertQueue")

public actual fun keReadStateMutant(mutant: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemKeReadStateMutant")

public actual fun keReadStateQueue(queue: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemKeReadStateQueue")

public actual fun keReleaseMutant(mutant: MutPtr, increment: Int, abandoned: Boolean, wait: Boolean): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemKeReleaseMutant")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemKeReleaseQueuedSpinLock")
private external fun wasiWindowssysWindowsWdkStorageFilesystemKeReleaseQueuedSpinLock(number: Int, oldirql: Int): Unit

public actual fun keReleaseQueuedSpinLock(number: KspinLockQueueNumber, oldirql: UByte): Unit =
    wasiWindowssysWindowsWdkStorageFilesystemKeReleaseQueuedSpinLock(number, oldirql.toInt())

public actual fun keRemoveQueue(queue: MutPtr, waitmode: Byte, timeout: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemKeRemoveQueue")

public actual fun keRemoveQueueEx(queue: MutPtr, waitmode: Byte, alertable: Boolean, timeout: ConstPtr, entryarray: MutPtr, count: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemKeRemoveQueueEx")

public actual fun keRundownQueue(queue: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemKeRundownQueue")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemKeSetIdealProcessorThread")
private external fun wasiWindowssysWindowsWdkStorageFilesystemKeSetIdealProcessorThread(thread: Long, processor: Int): Int

public actual fun keSetIdealProcessorThread(thread: Pkthread, processor: UByte): UByte =
    wasiWindowssysWindowsWdkStorageFilesystemKeSetIdealProcessorThread(thread, processor.toInt()).toUByte()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemKeSetKernelStackSwapEnable")
private external fun wasiWindowssysWindowsWdkStorageFilesystemKeSetKernelStackSwapEnable(enable: Int): Int

public actual fun keSetKernelStackSwapEnable(enable: Boolean): Boolean =
    (wasiWindowssysWindowsWdkStorageFilesystemKeSetKernelStackSwapEnable(if (enable) 1 else 0) != 0)

public actual fun keStackAttachProcess(process: Prkprocess, apcstate: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemKeStackAttachProcess")

public actual fun keTryToAcquireQueuedSpinLock(number: KspinLockQueueNumber, oldirql: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemKeTryToAcquireQueuedSpinLock")

public actual fun keUnstackDetachProcess(apcstate: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemKeUnstackDetachProcess")

public actual fun makeSignature(phcontext: ConstPtr, fqop: UInt, pmessage: ConstPtr, messageseqno: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMakeSignature")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemMapSecurityError")
private external fun wasiWindowssysWindowsWdkStorageFilesystemMapSecurityError(secstatus: Int): Int

public actual fun mapSecurityError(secstatus: Hresult): Ntstatus =
    wasiWindowssysWindowsWdkStorageFilesystemMapSecurityError(secstatus)

public actual fun mmCanFileBeTruncated(sectionpointer: ConstPtr, newfilesize: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMmCanFileBeTruncated")

public actual fun mmDoesFileHaveUserWritableReferences(sectionpointer: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMmDoesFileHaveUserWritableReferences")

public actual fun mmFlushImageSection(sectionobjectpointer: ConstPtr, flushtype: MmflushType): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMmFlushImageSection")

public actual fun mmForceSectionClosed(sectionobjectpointer: ConstPtr, delayclose: Boolean): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMmForceSectionClosed")

public actual fun mmForceSectionClosedEx(sectionobjectpointer: ConstPtr, forcecloseflags: UInt): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMmForceSectionClosedEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemMmGetMaximumFileSectionSize")
private external fun wasiWindowssysWindowsWdkStorageFilesystemMmGetMaximumFileSectionSize(): Long

public actual fun mmGetMaximumFileSectionSize(): ULong =
    wasiWindowssysWindowsWdkStorageFilesystemMmGetMaximumFileSectionSize().toULong()

public actual fun mmIsFileSectionActive(fssectionpointer: ConstPtr, flags: UInt, sectionisactive: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMmIsFileSectionActive")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemMmIsRecursiveIoFault")
private external fun wasiWindowssysWindowsWdkStorageFilesystemMmIsRecursiveIoFault(): Int

public actual fun mmIsRecursiveIoFault(): Boolean =
    (wasiWindowssysWindowsWdkStorageFilesystemMmIsRecursiveIoFault() != 0)

public actual fun mmMdlPagesAreZero(mdl: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMmMdlPagesAreZero")

public actual fun mmPrefetchPages(numberoflists: UInt, readlists: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMmPrefetchPages")

public actual fun mmSetAddressRangeModified(address: ConstPtr, length: ULong): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMmSetAddressRangeModified")

public actual fun ntAccessCheckAndAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, objecttypename: ConstPtr, objectname: ConstPtr, securitydescriptor: PsecurityDescriptor, desiredaccess: UInt, genericmapping: ConstPtr, objectcreation: Boolean, grantedaccess: MutPtr, accessstatus: MutPtr, generateonclose: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtAccessCheckAndAuditAlarm")

public actual fun ntAccessCheckByTypeAndAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, objecttypename: ConstPtr, objectname: ConstPtr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: ConstPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Boolean, grantedaccess: MutPtr, accessstatus: MutPtr, generateonclose: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtAccessCheckByTypeAndAuditAlarm")

public actual fun ntAccessCheckByTypeResultListAndAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, objecttypename: ConstPtr, objectname: ConstPtr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: ConstPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Boolean, grantedaccess: MutPtr, accessstatus: MutPtr, generateonclose: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtAccessCheckByTypeResultListAndAuditAlarm")

public actual fun ntAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname: ConstPtr, handleid: ConstPtr, clienttoken: Handle, objecttypename: ConstPtr, objectname: ConstPtr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: ConstPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Boolean, grantedaccess: MutPtr, accessstatus: MutPtr, generateonclose: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtAccessCheckByTypeResultListAndAuditAlarmByHandle")

public actual fun ntAdjustGroupsToken(tokenhandle: Handle, resettodefault: Boolean, newstate: ConstPtr, bufferlength: UInt, previousstate: MutPtr, returnlength: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtAdjustGroupsToken")

public actual fun ntAdjustPrivilegesToken(tokenhandle: Handle, disableallprivileges: Boolean, newstate: ConstPtr, bufferlength: UInt, previousstate: MutPtr, returnlength: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtAdjustPrivilegesToken")

public actual fun ntAllocateVirtualMemory(processhandle: Handle, baseaddress: MutPtr, zerobits: ULong, regionsize: MutPtr, allocationtype: UInt, protect: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtAllocateVirtualMemory")

public actual fun ntAllocateVirtualMemoryEx(processhandle: Handle, baseaddress: MutPtr, regionsize: MutPtr, allocationtype: UInt, pageprotection: UInt, extendedparameters: MutPtr, extendedparametercount: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtAllocateVirtualMemoryEx")

public actual fun ntCancelIoFileEx(filehandle: Handle, iorequesttocancel: ConstPtr, iostatusblock: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtCancelIoFileEx")

public actual fun ntCloseObjectAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, generateonclose: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtCloseObjectAuditAlarm")

public actual fun ntCreateDirectoryObject(directoryhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtCreateDirectoryObject")

public actual fun ntCreateEvent(eventhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, eventtype: EventType, initialstate: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtCreateEvent")

public actual fun ntCreateFile(filehandle: MutPtr, desiredaccess: FileAccessRights, objectattributes: ConstPtr, iostatusblock: MutPtr, allocationsize: ConstPtr, fileattributes: FileFlagsAndAttributes, shareaccess: FileShareMode, createdisposition: NtcreatefileCreateDisposition, createoptions: NtcreatefileCreateOptions, eabuffer: ConstPtr, ealength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtCreateFile")

public actual fun ntCreateSection(sectionhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, maximumsize: ConstPtr, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtCreateSection")

public actual fun ntCreateSectionEx(sectionhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, maximumsize: ConstPtr, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Handle, extendedparameters: MutPtr, extendedparametercount: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtCreateSectionEx")

public actual fun ntDeleteFile(objectattributes: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtDeleteFile")

public actual fun ntDeleteObjectAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, generateonclose: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtDeleteObjectAuditAlarm")

public actual fun ntDuplicateObject(sourceprocesshandle: Handle, sourcehandle: Handle, targetprocesshandle: Handle, targethandle: MutPtr, desiredaccess: UInt, handleattributes: UInt, options: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtDuplicateObject")

public actual fun ntDuplicateToken(existingtokenhandle: Handle, desiredaccess: UInt, objectattributes: ConstPtr, effectiveonly: Boolean, tokentype: TokenType, newtokenhandle: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtDuplicateToken")

public actual fun ntFilterToken(existingtokenhandle: Handle, flags: UInt, sidstodisable: ConstPtr, privilegestodelete: ConstPtr, restrictedsids: ConstPtr, newtokenhandle: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtFilterToken")

public actual fun ntFlushBuffersFile(filehandle: Handle, iostatusblock: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtFlushBuffersFile")

public actual fun ntFlushBuffersFileEx(filehandle: Handle, flags: UInt, parameters: ConstPtr, parameterssize: UInt, iostatusblock: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtFlushBuffersFileEx")

public actual fun ntFlushVirtualMemory(processhandle: Handle, baseaddress: MutPtr, regionsize: MutPtr, iostatus: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtFlushVirtualMemory")

public actual fun ntFreeVirtualMemory(processhandle: Handle, baseaddress: MutPtr, regionsize: MutPtr, freetype: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtFreeVirtualMemory")

public actual fun ntFsControlFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, fscontrolcode: UInt, inputbuffer: ConstPtr, inputbufferlength: UInt, outputbuffer: MutPtr, outputbufferlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtFsControlFile")

public actual fun ntImpersonateAnonymousToken(threadhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtImpersonateAnonymousToken")

public actual fun ntLockFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, byteoffset: ConstPtr, length: ConstPtr, key: UInt, failimmediately: Boolean, exclusivelock: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtLockFile")

public actual fun ntNotifyChangeKey(keyhandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, completionfilter: UInt, watchtree: Boolean, buffer: MutPtr, buffersize: UInt, asynchronous: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtNotifyChangeKey")

public actual fun ntOpenDirectoryObject(directoryhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtOpenDirectoryObject")

public actual fun ntOpenFile(filehandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, iostatusblock: MutPtr, shareaccess: UInt, openoptions: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtOpenFile")

public actual fun ntOpenObjectAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, objecttypename: ConstPtr, objectname: ConstPtr, securitydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, grantedaccess: UInt, privileges: ConstPtr, objectcreation: Boolean, accessgranted: Boolean, generateonclose: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtOpenObjectAuditAlarm")

public actual fun ntOpenProcessToken(processhandle: Handle, desiredaccess: UInt, tokenhandle: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtOpenProcessToken")

public actual fun ntOpenProcessTokenEx(processhandle: Handle, desiredaccess: UInt, handleattributes: UInt, tokenhandle: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtOpenProcessTokenEx")

public actual fun ntOpenSymbolicLinkObject(linkhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtOpenSymbolicLinkObject")

public actual fun ntOpenThreadToken(threadhandle: Handle, desiredaccess: UInt, openasself: Boolean, tokenhandle: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtOpenThreadToken")

public actual fun ntOpenThreadTokenEx(threadhandle: Handle, desiredaccess: UInt, openasself: Boolean, handleattributes: UInt, tokenhandle: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtOpenThreadTokenEx")

public actual fun ntPrivilegeCheck(clienttoken: Handle, requiredprivileges: MutPtr, result: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtPrivilegeCheck")

public actual fun ntPrivilegeObjectAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, clienttoken: Handle, desiredaccess: UInt, privileges: ConstPtr, accessgranted: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtPrivilegeObjectAuditAlarm")

public actual fun ntPrivilegedServiceAuditAlarm(subsystemname: ConstPtr, servicename: ConstPtr, clienttoken: Handle, privileges: ConstPtr, accessgranted: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtPrivilegedServiceAuditAlarm")

public actual fun ntQueryDirectoryFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass, returnsingleentry: Boolean, filename: ConstPtr, restartscan: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtQueryDirectoryFile")

public actual fun ntQueryDirectoryFileEx(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass, queryflags: UInt, filename: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtQueryDirectoryFileEx")

public actual fun ntQueryDirectoryObject(directoryhandle: Handle, buffer: MutPtr, length: UInt, returnsingleentry: Boolean, restartscan: Boolean, context: MutPtr, returnlength: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtQueryDirectoryObject")

public actual fun ntQueryEaFile(filehandle: Handle, iostatusblock: MutPtr, buffer: MutPtr, length: UInt, returnsingleentry: Boolean, ealist: ConstPtr, ealistlength: UInt, eaindex: ConstPtr, restartscan: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtQueryEaFile")

public actual fun ntQueryFullAttributesFile(objectattributes: ConstPtr, fileinformation: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtQueryFullAttributesFile")

public actual fun ntQueryInformationByName(objectattributes: ConstPtr, iostatusblock: MutPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtQueryInformationByName")

public actual fun ntQueryInformationFile(filehandle: Handle, iostatusblock: MutPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtQueryInformationFile")

public actual fun ntQueryInformationToken(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: MutPtr, tokeninformationlength: UInt, returnlength: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtQueryInformationToken")

public actual fun ntQueryQuotaInformationFile(filehandle: Handle, iostatusblock: MutPtr, buffer: MutPtr, length: UInt, returnsingleentry: Boolean, sidlist: ConstPtr, sidlistlength: UInt, startsid: Psid, restartscan: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtQueryQuotaInformationFile")

public actual fun ntQuerySecurityObject(handle: Handle, securityinformation: UInt, securitydescriptor: PsecurityDescriptor, length: UInt, lengthneeded: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtQuerySecurityObject")

public actual fun ntQuerySymbolicLinkObject(linkhandle: Handle, linktarget: MutPtr, returnedlength: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtQuerySymbolicLinkObject")

public actual fun ntQueryVirtualMemory(processhandle: Handle, baseaddress: ConstPtr, memoryinformationclass: MemoryInformationClass, memoryinformation: MutPtr, memoryinformationlength: ULong, returnlength: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtQueryVirtualMemory")

public actual fun ntQueryVolumeInformationFile(filehandle: Handle, iostatusblock: MutPtr, fsinformation: MutPtr, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtQueryVolumeInformationFile")

public actual fun ntReadFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, buffer: MutPtr, length: UInt, byteoffset: ConstPtr, key: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtReadFile")

public actual fun ntSetEaFile(filehandle: Handle, iostatusblock: MutPtr, buffer: ConstPtr, length: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtSetEaFile")

public actual fun ntSetEvent(eventhandle: Handle, previousstate: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtSetEvent")

public actual fun ntSetInformationFile(filehandle: Handle, iostatusblock: MutPtr, fileinformation: ConstPtr, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtSetInformationFile")

public actual fun ntSetInformationToken(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: ConstPtr, tokeninformationlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtSetInformationToken")

public actual fun ntSetInformationVirtualMemory(processhandle: Handle, vminformationclass: VirtualMemoryInformationClass, numberofentries: ULong, virtualaddresses: ConstPtr, vminformation: ConstPtr, vminformationlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtSetInformationVirtualMemory")

public actual fun ntSetQuotaInformationFile(filehandle: Handle, iostatusblock: MutPtr, buffer: ConstPtr, length: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtSetQuotaInformationFile")

public actual fun ntSetSecurityObject(handle: Handle, securityinformation: UInt, securitydescriptor: PsecurityDescriptor): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtSetSecurityObject")

public actual fun ntSetVolumeInformationFile(filehandle: Handle, iostatusblock: MutPtr, fsinformation: ConstPtr, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtSetVolumeInformationFile")

public actual fun ntUnlockFile(filehandle: Handle, iostatusblock: MutPtr, byteoffset: ConstPtr, length: ConstPtr, key: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtUnlockFile")

public actual fun ntWriteFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, buffer: ConstPtr, length: UInt, byteoffset: ConstPtr, key: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemNtWriteFile")

public actual fun obInsertObject(obj: ConstPtr, passedaccessstate: MutPtr, desiredaccess: UInt, objectpointerbias: UInt, newobject: MutPtr, handle: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemObInsertObject")

public actual fun obIsKernelHandle(handle: Handle): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemObIsKernelHandle")

public actual fun obMakeTemporaryObject(obj: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemObMakeTemporaryObject")

public actual fun obOpenObjectByPointer(obj: ConstPtr, handleattributes: UInt, passedaccessstate: ConstPtr, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, handle: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemObOpenObjectByPointer")

public actual fun obOpenObjectByPointerWithTag(obj: ConstPtr, handleattributes: UInt, passedaccessstate: ConstPtr, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, tag: UInt, handle: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemObOpenObjectByPointerWithTag")

public actual fun obQueryNameString(obj: ConstPtr, objectnameinfo: MutPtr, length: UInt, returnlength: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemObQueryNameString")

public actual fun obQueryObjectAuditingByHandle(handle: Handle, generateonclose: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemObQueryObjectAuditingByHandle")

public actual fun pfxFindPrefix(prefixtable: ConstPtr, fullname: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemPfxFindPrefix")

public actual fun pfxInitialize(prefixtable: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemPfxInitialize")

public actual fun pfxInsertPrefix(prefixtable: ConstPtr, prefix: ConstPtr, prefixtableentry: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemPfxInsertPrefix")

public actual fun pfxRemovePrefix(prefixtable: ConstPtr, prefixtableentry: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemPfxRemovePrefix")

public actual fun poQueueShutdownWorkItem(workitem: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemPoQueueShutdownWorkItem")

public actual fun psAssignImpersonationToken(thread: Pethread, token: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemPsAssignImpersonationToken")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemPsChargePoolQuota")
private external fun wasiWindowssysWindowsWdkStorageFilesystemPsChargePoolQuota(process: Long, pooltype: Int, amount: Long): Unit

public actual fun psChargePoolQuota(process: Peprocess, pooltype: PoolType, amount: ULong): Unit =
    wasiWindowssysWindowsWdkStorageFilesystemPsChargePoolQuota(process, pooltype, amount.toLong())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemPsChargeProcessPoolQuota")
private external fun wasiWindowssysWindowsWdkStorageFilesystemPsChargeProcessPoolQuota(process: Long, pooltype: Int, amount: Long): Int

public actual fun psChargeProcessPoolQuota(process: Peprocess, pooltype: PoolType, amount: ULong): Ntstatus =
    wasiWindowssysWindowsWdkStorageFilesystemPsChargeProcessPoolQuota(process, pooltype, amount.toLong())

public actual fun psDereferenceImpersonationToken(impersonationtoken: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemPsDereferenceImpersonationToken")

public actual fun psDereferencePrimaryToken(primarytoken: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemPsDereferencePrimaryToken")

public actual fun psDisableImpersonation(thread: Pethread, impersonationstate: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemPsDisableImpersonation")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemPsGetProcessExitTime")
private external fun wasiWindowssysWindowsWdkStorageFilesystemPsGetProcessExitTime(): Long

public actual fun psGetProcessExitTime(): Long =
    wasiWindowssysWindowsWdkStorageFilesystemPsGetProcessExitTime()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemPsGetThreadProcess")
private external fun wasiWindowssysWindowsWdkStorageFilesystemPsGetThreadProcess(thread: Long): Long

public actual fun psGetThreadProcess(thread: Pethread): Peprocess =
    wasiWindowssysWindowsWdkStorageFilesystemPsGetThreadProcess(thread)

public actual fun psImpersonateClient(thread: Pethread, token: ConstPtr, copyonopen: Boolean, effectiveonly: Boolean, impersonationlevel: SecurityImpersonationLevel): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemPsImpersonateClient")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemPsIsDiskCountersEnabled")
private external fun wasiWindowssysWindowsWdkStorageFilesystemPsIsDiskCountersEnabled(): Int

public actual fun psIsDiskCountersEnabled(): Boolean =
    (wasiWindowssysWindowsWdkStorageFilesystemPsIsDiskCountersEnabled() != 0)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemPsIsSystemThread")
private external fun wasiWindowssysWindowsWdkStorageFilesystemPsIsSystemThread(thread: Long): Int

public actual fun psIsSystemThread(thread: Pethread): Boolean =
    (wasiWindowssysWindowsWdkStorageFilesystemPsIsSystemThread(thread) != 0)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemPsIsThreadTerminating")
private external fun wasiWindowssysWindowsWdkStorageFilesystemPsIsThreadTerminating(thread: Long): Int

public actual fun psIsThreadTerminating(thread: Pethread): Boolean =
    (wasiWindowssysWindowsWdkStorageFilesystemPsIsThreadTerminating(thread) != 0)

public actual fun psLookupProcessByProcessId(processid: Handle, process: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemPsLookupProcessByProcessId")

public actual fun psLookupThreadByThreadId(threadid: Handle, thread: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemPsLookupThreadByThreadId")

public actual fun psReferenceImpersonationToken(thread: Pethread, copyonopen: MutPtr, effectiveonly: MutPtr, impersonationlevel: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemPsReferenceImpersonationToken")

public actual fun psReferencePrimaryToken(process: Peprocess): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemPsReferencePrimaryToken")

public actual fun psRestoreImpersonation(thread: Pethread, impersonationstate: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemPsRestoreImpersonation")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemPsReturnPoolQuota")
private external fun wasiWindowssysWindowsWdkStorageFilesystemPsReturnPoolQuota(process: Long, pooltype: Int, amount: Long): Unit

public actual fun psReturnPoolQuota(process: Peprocess, pooltype: PoolType, amount: ULong): Unit =
    wasiWindowssysWindowsWdkStorageFilesystemPsReturnPoolQuota(process, pooltype, amount.toLong())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemPsRevertToSelf")
private external fun wasiWindowssysWindowsWdkStorageFilesystemPsRevertToSelf(): Unit

public actual fun psRevertToSelf(): Unit =
    wasiWindowssysWindowsWdkStorageFilesystemPsRevertToSelf()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemPsUpdateDiskCounters")
private external fun wasiWindowssysWindowsWdkStorageFilesystemPsUpdateDiskCounters(process: Long, bytesread: Long, byteswritten: Long, readoperationcount: Int, writeoperationcount: Int, flushoperationcount: Int): Unit

public actual fun psUpdateDiskCounters(process: Peprocess, bytesread: ULong, byteswritten: ULong, readoperationcount: UInt, writeoperationcount: UInt, flushoperationcount: UInt): Unit =
    wasiWindowssysWindowsWdkStorageFilesystemPsUpdateDiskCounters(process, bytesread.toLong(), byteswritten.toLong(), readoperationcount.toInt(), writeoperationcount.toInt(), flushoperationcount.toInt())

public actual fun querySecurityContextToken(phcontext: ConstPtr, token: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemQuerySecurityContextToken")

public actual fun rtlAbsoluteToSelfRelativeSD(absolutesecuritydescriptor: PsecurityDescriptor, selfrelativesecuritydescriptor: PsecurityDescriptor, bufferlength: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlAbsoluteToSelfRelativeSD")

public actual fun rtlAddAccessAllowedAce(acl: MutPtr, acerevision: UInt, accessmask: UInt, sid: Psid): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlAddAccessAllowedAce")

public actual fun rtlAddAccessAllowedAceEx(acl: MutPtr, acerevision: UInt, aceflags: UInt, accessmask: UInt, sid: Psid): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlAddAccessAllowedAceEx")

public actual fun rtlAddAce(acl: MutPtr, acerevision: UInt, startingaceindex: UInt, acelist: ConstPtr, acelistlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlAddAce")

public actual fun rtlAllocateAndInitializeSid(identifierauthority: ConstPtr, subauthoritycount: UByte, subauthority0: UInt, subauthority1: UInt, subauthority2: UInt, subauthority3: UInt, subauthority4: UInt, subauthority5: UInt, subauthority6: UInt, subauthority7: UInt, sid: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlAllocateAndInitializeSid")

public actual fun rtlAllocateAndInitializeSidEx(identifierauthority: ConstPtr, subauthoritycount: UByte, subauthorities: ConstPtr, sid: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlAllocateAndInitializeSidEx")

public actual fun rtlAllocateHeap(heaphandle: ConstPtr, flags: UInt, size: ULong): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlAllocateHeap")

public actual fun rtlAppendStringToString(destination: MutPtr, source: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlAppendStringToString")

public actual fun rtlCompareAltitudes(altitude1: ConstPtr, altitude2: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlCompareAltitudes")

public actual fun rtlCompareMemoryUlong(source: ConstPtr, length: ULong, pattern: UInt): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlCompareMemoryUlong")

public actual fun rtlCompressBuffer(compressionformatandengine: UShort, uncompressedbuffer: ConstPtr, uncompressedbuffersize: UInt, compressedbuffer: MutPtr, compressedbuffersize: UInt, uncompressedchunksize: UInt, finalcompressedsize: MutPtr, workspace: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlCompressBuffer")

public actual fun rtlCompressChunks(uncompressedbuffer: ConstPtr, uncompressedbuffersize: UInt, compressedbuffer: MutPtr, compressedbuffersize: UInt, compresseddatainfo: MutPtr, compresseddatainfolength: UInt, workspace: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlCompressChunks")

public actual fun rtlCopyLuid(destinationluid: MutPtr, sourceluid: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlCopyLuid")

public actual fun rtlCopySid(destinationsidlength: UInt, destinationsid: Psid, sourcesid: Psid): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlCopySid")

public actual fun rtlCreateAcl(acl: MutPtr, acllength: UInt, aclrevision: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlCreateAcl")

public actual fun rtlCreateHeap(flags: UInt, heapbase: ConstPtr, reservesize: ULong, commitsize: ULong, lock: ConstPtr, parameters: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlCreateHeap")

public actual fun rtlCreateServiceSid(servicename: ConstPtr, servicesid: Psid, servicesidlength: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlCreateServiceSid")

public actual fun rtlCreateSystemVolumeInformationFolder(volumerootpath: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlCreateSystemVolumeInformationFolder")

public actual fun rtlCreateUnicodeString(destinationstring: MutPtr, sourcestring: Pcwstr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlCreateUnicodeString")

public actual fun rtlCreateVirtualAccountSid(name: ConstPtr, basesubauthority: UInt, sid: Psid, sidlength: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlCreateVirtualAccountSid")

public actual fun rtlCustomCPToUnicodeN(customcp: ConstPtr, unicodestring: Pwstr, maxbytesinunicodestring: UInt, bytesinunicodestring: MutPtr, customcpstring: Pcstr, bytesincustomcpstring: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlCustomCPToUnicodeN")

public actual fun rtlDecompressBuffer(compressionformat: UShort, uncompressedbuffer: MutPtr, uncompressedbuffersize: UInt, compressedbuffer: ConstPtr, compressedbuffersize: UInt, finaluncompressedsize: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlDecompressBuffer")

public actual fun rtlDecompressBufferEx(compressionformat: UShort, uncompressedbuffer: MutPtr, uncompressedbuffersize: UInt, compressedbuffer: ConstPtr, compressedbuffersize: UInt, finaluncompressedsize: MutPtr, workspace: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlDecompressBufferEx")

public actual fun rtlDecompressBufferEx2(compressionformat: UShort, uncompressedbuffer: MutPtr, uncompressedbuffersize: UInt, compressedbuffer: ConstPtr, compressedbuffersize: UInt, uncompressedchunksize: UInt, finaluncompressedsize: MutPtr, workspace: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlDecompressBufferEx2")

public actual fun rtlDecompressChunks(uncompressedbuffer: MutPtr, uncompressedbuffersize: UInt, compressedbuffer: ConstPtr, compressedbuffersize: UInt, compressedtail: ConstPtr, compressedtailsize: UInt, compresseddatainfo: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlDecompressChunks")

public actual fun rtlDecompressFragment(compressionformat: UShort, uncompressedfragment: MutPtr, uncompressedfragmentsize: UInt, compressedbuffer: ConstPtr, compressedbuffersize: UInt, fragmentoffset: UInt, finaluncompressedsize: MutPtr, workspace: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlDecompressFragment")

public actual fun rtlDecompressFragmentEx(compressionformat: UShort, uncompressedfragment: MutPtr, uncompressedfragmentsize: UInt, compressedbuffer: ConstPtr, compressedbuffersize: UInt, fragmentoffset: UInt, uncompressedchunksize: UInt, finaluncompressedsize: MutPtr, workspace: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlDecompressFragmentEx")

public actual fun rtlDeleteAce(acl: MutPtr, aceindex: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlDeleteAce")

public actual fun rtlDescribeChunk(compressionformat: UShort, compressedbuffer: MutPtr, endofcompressedbufferplus1: ConstPtr, chunkbuffer: MutPtr, chunksize: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlDescribeChunk")

public actual fun rtlDestroyHeap(heaphandle: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlDestroyHeap")

public actual fun rtlDosPathNameToNtPathNameUWithStatus(dosfilename: Pcwstr, ntfilename: MutPtr, filepart: MutPtr, reserved: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlDosPathNameToNtPathNameUWithStatus")

public actual fun rtlDowncaseUnicodeString(destinationstring: MutPtr, sourcestring: ConstPtr, allocatedestinationstring: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlDowncaseUnicodeString")

public actual fun rtlDuplicateUnicodeString(flags: UInt, stringin: ConstPtr, stringout: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlDuplicateUnicodeString")

public actual fun rtlEqualPrefixSid(sid1: Psid, sid2: Psid): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlEqualPrefixSid")

public actual fun rtlEqualSid(sid1: Psid, sid2: Psid): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlEqualSid")

public actual fun rtlFindUnicodePrefix(prefixtable: ConstPtr, fullname: ConstPtr, caseinsensitiveindex: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlFindUnicodePrefix")

public actual fun rtlFreeHeap(heaphandle: ConstPtr, flags: UInt, baseaddress: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlFreeHeap")

public actual fun rtlFreeSid(sid: Psid): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlFreeSid")

public actual fun rtlGenerate8dot3Name(name: ConstPtr, allowextendedcharacters: Boolean, context: MutPtr, name8dot3: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlGenerate8dot3Name")

public actual fun rtlGetAce(acl: ConstPtr, aceindex: UInt, ace: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlGetAce")

public actual fun rtlGetCompressionWorkSpaceSize(compressionformatandengine: UShort, compressbufferworkspacesize: MutPtr, compressfragmentworkspacesize: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlGetCompressionWorkSpaceSize")

public actual fun rtlGetDaclSecurityDescriptor(securitydescriptor: PsecurityDescriptor, daclpresent: MutPtr, dacl: MutPtr, dacldefaulted: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlGetDaclSecurityDescriptor")

public actual fun rtlGetGroupSecurityDescriptor(securitydescriptor: PsecurityDescriptor, group: MutPtr, groupdefaulted: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlGetGroupSecurityDescriptor")

public actual fun rtlGetOwnerSecurityDescriptor(securitydescriptor: PsecurityDescriptor, owner: MutPtr, ownerdefaulted: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlGetOwnerSecurityDescriptor")

public actual fun rtlGetSaclSecurityDescriptor(securitydescriptor: PsecurityDescriptor, saclpresent: MutPtr, sacl: MutPtr, sacldefaulted: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlGetSaclSecurityDescriptor")

public actual fun rtlIdentifierAuthoritySid(sid: Psid): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlIdentifierAuthoritySid")

public actual fun rtlIdnToAscii(flags: UInt, sourcestring: Pcwstr, sourcestringlength: Int, destinationstring: Pwstr, destinationstringlength: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlIdnToAscii")

public actual fun rtlIdnToNameprepUnicode(flags: UInt, sourcestring: Pcwstr, sourcestringlength: Int, destinationstring: Pwstr, destinationstringlength: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlIdnToNameprepUnicode")

public actual fun rtlIdnToUnicode(flags: UInt, sourcestring: Pcwstr, sourcestringlength: Int, destinationstring: Pwstr, destinationstringlength: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlIdnToUnicode")

public actual fun rtlInitCodePageTable(tablebase: ConstPtr, codepagetable: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlInitCodePageTable")

public actual fun rtlInitUnicodeStringEx(destinationstring: MutPtr, sourcestring: Pcwstr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlInitUnicodeStringEx")

public actual fun rtlInitializeSid(sid: Psid, identifierauthority: ConstPtr, subauthoritycount: UByte): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlInitializeSid")

public actual fun rtlInitializeSidEx(sid: Psid, identifierauthority: ConstPtr, subauthoritycount: UByte, vararg variadicArgs: Long): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlInitializeSidEx")

public actual fun rtlInitializeUnicodePrefix(prefixtable: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlInitializeUnicodePrefix")

public actual fun rtlInsertUnicodePrefix(prefixtable: ConstPtr, prefix: ConstPtr, prefixtableentry: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlInsertUnicodePrefix")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemRtlIsCloudFilesPlaceholder")
private external fun wasiWindowssysWindowsWdkStorageFilesystemRtlIsCloudFilesPlaceholder(fileattributes: Int, reparsetag: Int): Int

public actual fun rtlIsCloudFilesPlaceholder(fileattributes: UInt, reparsetag: UInt): Boolean =
    (wasiWindowssysWindowsWdkStorageFilesystemRtlIsCloudFilesPlaceholder(fileattributes.toInt(), reparsetag.toInt()) != 0)

public actual fun rtlIsDosDeviceNameU(dosfilename: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlIsDosDeviceNameU")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemRtlIsNonEmptyDirectoryReparsePointAllowed")
private external fun wasiWindowssysWindowsWdkStorageFilesystemRtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag: Int): Int

public actual fun rtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag: UInt): Boolean =
    (wasiWindowssysWindowsWdkStorageFilesystemRtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag.toInt()) != 0)

public actual fun rtlIsNormalizedString(normform: UInt, sourcestring: Pcwstr, sourcestringlength: Int, normalized: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlIsNormalizedString")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemRtlIsPartialPlaceholder")
private external fun wasiWindowssysWindowsWdkStorageFilesystemRtlIsPartialPlaceholder(fileattributes: Int, reparsetag: Int): Int

public actual fun rtlIsPartialPlaceholder(fileattributes: UInt, reparsetag: UInt): Boolean =
    (wasiWindowssysWindowsWdkStorageFilesystemRtlIsPartialPlaceholder(fileattributes.toInt(), reparsetag.toInt()) != 0)

public actual fun rtlIsPartialPlaceholderFileHandle(filehandle: Handle, ispartialplaceholder: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlIsPartialPlaceholderFileHandle")

public actual fun rtlIsPartialPlaceholderFileInfo(infobuffer: ConstPtr, infoclass: FileInformationClass, ispartialplaceholder: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlIsPartialPlaceholderFileInfo")

public actual fun rtlIsSandboxedToken(context: ConstPtr, previousmode: Byte): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlIsSandboxedToken")

public actual fun rtlIsValidOemCharacter(char: Pwstr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlIsValidOemCharacter")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemRtlLengthRequiredSid")
private external fun wasiWindowssysWindowsWdkStorageFilesystemRtlLengthRequiredSid(subauthoritycount: Int): Int

public actual fun rtlLengthRequiredSid(subauthoritycount: UInt): UInt =
    wasiWindowssysWindowsWdkStorageFilesystemRtlLengthRequiredSid(subauthoritycount.toInt()).toUInt()

public actual fun rtlLengthSid(sid: Psid): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlLengthSid")

public actual fun rtlMultiByteToUnicodeN(unicodestring: Pwstr, maxbytesinunicodestring: UInt, bytesinunicodestring: MutPtr, multibytestring: Pcstr, bytesinmultibytestring: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlMultiByteToUnicodeN")

public actual fun rtlMultiByteToUnicodeSize(bytesinunicodestring: MutPtr, multibytestring: Pcstr, bytesinmultibytestring: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlMultiByteToUnicodeSize")

public actual fun rtlNextUnicodePrefix(prefixtable: ConstPtr, restart: Boolean): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlNextUnicodePrefix")

public actual fun rtlNormalizeString(normform: UInt, sourcestring: Pcwstr, sourcestringlength: Int, destinationstring: Pwstr, destinationstringlength: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlNormalizeString")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemRtlNtStatusToDosErrorNoTeb")
private external fun wasiWindowssysWindowsWdkStorageFilesystemRtlNtStatusToDosErrorNoTeb(status: Int): Int

public actual fun rtlNtStatusToDosErrorNoTeb(status: Ntstatus): UInt =
    wasiWindowssysWindowsWdkStorageFilesystemRtlNtStatusToDosErrorNoTeb(status).toUInt()

public actual fun rtlOemStringToCountedUnicodeString(destinationstring: MutPtr, sourcestring: ConstPtr, allocatedestinationstring: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlOemStringToCountedUnicodeString")

public actual fun rtlOemStringToUnicodeString(destinationstring: MutPtr, sourcestring: ConstPtr, allocatedestinationstring: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlOemStringToUnicodeString")

public actual fun rtlOemToUnicodeN(unicodestring: Pwstr, maxbytesinunicodestring: UInt, bytesinunicodestring: MutPtr, oemstring: Pcstr, bytesinoemstring: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlOemToUnicodeN")

public actual fun rtlPrefixString(string1: ConstPtr, string2: ConstPtr, caseinsensitive: Boolean): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlPrefixString")

public actual fun rtlQueryPackageIdentity(tokenobject: ConstPtr, packagefullname: Pwstr, packagesize: MutPtr, appid: Pwstr, appidsize: MutPtr, packaged: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlQueryPackageIdentity")

public actual fun rtlQueryPackageIdentityEx(tokenobject: ConstPtr, packagefullname: Pwstr, packagesize: MutPtr, appid: Pwstr, appidsize: MutPtr, dynamicid: MutPtr, flags: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlQueryPackageIdentityEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemRtlQueryProcessPlaceholderCompatibilityMode")
private external fun wasiWindowssysWindowsWdkStorageFilesystemRtlQueryProcessPlaceholderCompatibilityMode(): Int

public actual fun rtlQueryProcessPlaceholderCompatibilityMode(): Byte =
    wasiWindowssysWindowsWdkStorageFilesystemRtlQueryProcessPlaceholderCompatibilityMode().toByte()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemRtlQueryThreadPlaceholderCompatibilityMode")
private external fun wasiWindowssysWindowsWdkStorageFilesystemRtlQueryThreadPlaceholderCompatibilityMode(): Int

public actual fun rtlQueryThreadPlaceholderCompatibilityMode(): Byte =
    wasiWindowssysWindowsWdkStorageFilesystemRtlQueryThreadPlaceholderCompatibilityMode().toByte()

public actual fun rtlRandom(seed: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlRandom")

public actual fun rtlRandomEx(seed: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlRandomEx")

public actual fun rtlRemoveUnicodePrefix(prefixtable: ConstPtr, prefixtableentry: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlRemoveUnicodePrefix")

public actual fun rtlReplaceSidInSd(securitydescriptor: PsecurityDescriptor, oldsid: Psid, newsid: Psid, numchanges: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlReplaceSidInSd")

public actual fun rtlReserveChunk(compressionformat: UShort, compressedbuffer: MutPtr, endofcompressedbufferplus1: ConstPtr, chunkbuffer: MutPtr, chunksize: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlReserveChunk")

public actual fun rtlSecondsSince1970ToTime(elapsedseconds: UInt, time: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlSecondsSince1970ToTime")

public actual fun rtlSecondsSince1980ToTime(elapsedseconds: UInt, time: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlSecondsSince1980ToTime")

public actual fun rtlSelfRelativeToAbsoluteSD(selfrelativesecuritydescriptor: PsecurityDescriptor, absolutesecuritydescriptor: PsecurityDescriptor, absolutesecuritydescriptorsize: MutPtr, dacl: MutPtr, daclsize: MutPtr, sacl: MutPtr, saclsize: MutPtr, owner: Psid, ownersize: MutPtr, primarygroup: Psid, primarygroupsize: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlSelfRelativeToAbsoluteSD")

public actual fun rtlSetGroupSecurityDescriptor(securitydescriptor: PsecurityDescriptor, group: Psid, groupdefaulted: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlSetGroupSecurityDescriptor")

public actual fun rtlSetOwnerSecurityDescriptor(securitydescriptor: PsecurityDescriptor, owner: Psid, ownerdefaulted: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlSetOwnerSecurityDescriptor")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemRtlSetProcessPlaceholderCompatibilityMode")
private external fun wasiWindowssysWindowsWdkStorageFilesystemRtlSetProcessPlaceholderCompatibilityMode(mode: Int): Int

public actual fun rtlSetProcessPlaceholderCompatibilityMode(mode: Byte): Byte =
    wasiWindowssysWindowsWdkStorageFilesystemRtlSetProcessPlaceholderCompatibilityMode(mode.toInt()).toByte()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemRtlSetThreadPlaceholderCompatibilityMode")
private external fun wasiWindowssysWindowsWdkStorageFilesystemRtlSetThreadPlaceholderCompatibilityMode(mode: Int): Int

public actual fun rtlSetThreadPlaceholderCompatibilityMode(mode: Byte): Byte =
    wasiWindowssysWindowsWdkStorageFilesystemRtlSetThreadPlaceholderCompatibilityMode(mode.toInt()).toByte()

public actual fun rtlSubAuthorityCountSid(sid: Psid): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlSubAuthorityCountSid")

public actual fun rtlSubAuthoritySid(sid: Psid, subauthority: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlSubAuthoritySid")

public actual fun rtlTimeToSecondsSince1980(time: ConstPtr, elapsedseconds: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlTimeToSecondsSince1980")

public actual fun rtlUnicodeStringToCountedOemString(destinationstring: MutPtr, sourcestring: ConstPtr, allocatedestinationstring: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlUnicodeStringToCountedOemString")

public actual fun rtlUnicodeToCustomCPN(customcp: ConstPtr, customcpstring: Pstr, maxbytesincustomcpstring: UInt, bytesincustomcpstring: MutPtr, unicodestring: Pcwstr, bytesinunicodestring: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlUnicodeToCustomCPN")

public actual fun rtlUnicodeToMultiByteN(multibytestring: Pstr, maxbytesinmultibytestring: UInt, bytesinmultibytestring: MutPtr, unicodestring: ConstPtr, bytesinunicodestring: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlUnicodeToMultiByteN")

public actual fun rtlUnicodeToOemN(oemstring: Pstr, maxbytesinoemstring: UInt, bytesinoemstring: MutPtr, unicodestring: ConstPtr, bytesinunicodestring: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlUnicodeToOemN")

public actual fun rtlUpcaseUnicodeStringToCountedOemString(destinationstring: MutPtr, sourcestring: ConstPtr, allocatedestinationstring: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlUpcaseUnicodeStringToCountedOemString")

public actual fun rtlUpcaseUnicodeStringToOemString(destinationstring: MutPtr, sourcestring: ConstPtr, allocatedestinationstring: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlUpcaseUnicodeStringToOemString")

public actual fun rtlUpcaseUnicodeToCustomCPN(customcp: ConstPtr, customcpstring: Pstr, maxbytesincustomcpstring: UInt, bytesincustomcpstring: MutPtr, unicodestring: Pcwstr, bytesinunicodestring: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlUpcaseUnicodeToCustomCPN")

public actual fun rtlUpcaseUnicodeToMultiByteN(multibytestring: Pstr, maxbytesinmultibytestring: UInt, bytesinmultibytestring: MutPtr, unicodestring: ConstPtr, bytesinunicodestring: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlUpcaseUnicodeToMultiByteN")

public actual fun rtlUpcaseUnicodeToOemN(oemstring: Pstr, maxbytesinoemstring: UInt, bytesinoemstring: MutPtr, unicodestring: ConstPtr, bytesinunicodestring: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlUpcaseUnicodeToOemN")

public actual fun rtlValidSid(sid: Psid): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlValidSid")

public actual fun rtlValidateUnicodeString(flags: UInt, string: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlValidateUnicodeString")

public actual fun rtlxOemStringToUnicodeSize(oemstring: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlxOemStringToUnicodeSize")

public actual fun rtlxUnicodeStringToOemSize(unicodestring: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemRtlxUnicodeStringToOemSize")

public actual fun seAccessCheckFromState(securitydescriptor: PsecurityDescriptor, primarytokeninformation: ConstPtr, clienttokeninformation: ConstPtr, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: MutPtr, genericmapping: ConstPtr, accessmode: Byte, grantedaccess: MutPtr, accessstatus: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeAccessCheckFromState")

public actual fun seAccessCheckFromStateEx(securitydescriptor: PsecurityDescriptor, primarytoken: ConstPtr, clienttoken: ConstPtr, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: MutPtr, genericmapping: ConstPtr, accessmode: Byte, grantedaccess: MutPtr, accessstatus: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeAccessCheckFromStateEx")

public actual fun seAdjustAccessStateForAccessConstraints(objecttype: ConstPtr, securitydescriptor: PsecurityDescriptor, accessstate: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeAdjustAccessStateForAccessConstraints")

public actual fun seAdjustAccessStateForTrustLabel(objecttype: ConstPtr, securitydescriptor: PsecurityDescriptor, accessstate: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeAdjustAccessStateForTrustLabel")

public actual fun seAdjustObjectSecurity(objectname: ConstPtr, originaldescriptor: PsecurityDescriptor, proposeddescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr, adjusteddescriptor: MutPtr, applyadjusteddescriptor: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeAdjustObjectSecurity")

public actual fun seAppendPrivileges(accessstate: MutPtr, privileges: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeAppendPrivileges")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemSeAuditFipsCryptoSelftests")
private external fun wasiWindowssysWindowsWdkStorageFilesystemSeAuditFipsCryptoSelftests(bsuccess: Int, selftestcode: Int): Unit

public actual fun seAuditFipsCryptoSelftests(bsuccess: Boolean, selftestcode: UInt): Unit =
    wasiWindowssysWindowsWdkStorageFilesystemSeAuditFipsCryptoSelftests(if (bsuccess) 1 else 0, selftestcode.toInt())

public actual fun seAuditHardLinkCreation(filename: ConstPtr, linkname: ConstPtr, bsuccess: Boolean): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeAuditHardLinkCreation")

public actual fun seAuditHardLinkCreationWithTransaction(filename: ConstPtr, linkname: ConstPtr, bsuccess: Boolean, transactionid: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeAuditHardLinkCreationWithTransaction")

public actual fun seAuditTransactionStateChange(transactionid: ConstPtr, resourcemanagerid: ConstPtr, newtransactionstate: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeAuditTransactionStateChange")

public actual fun seAuditingAnyFileEventsWithContext(securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeAuditingAnyFileEventsWithContext")

public actual fun seAuditingAnyFileEventsWithContextEx(securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr, stagingenabled: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeAuditingAnyFileEventsWithContextEx")

public actual fun seAuditingFileEvents(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeAuditingFileEvents")

public actual fun seAuditingFileEventsWithContext(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeAuditingFileEventsWithContext")

public actual fun seAuditingFileEventsWithContextEx(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr, stagingenabled: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeAuditingFileEventsWithContextEx")

public actual fun seAuditingFileOrGlobalEvents(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeAuditingFileOrGlobalEvents")

public actual fun seAuditingHardLinkEvents(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeAuditingHardLinkEvents")

public actual fun seAuditingHardLinkEventsWithContext(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeAuditingHardLinkEventsWithContext")

public actual fun seCaptureSubjectContextEx(thread: Pethread, process: Peprocess, subjectcontext: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeCaptureSubjectContextEx")

public actual fun seCheckForCriticalAceRemoval(currentdescriptor: PsecurityDescriptor, newdescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr, aceremoved: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeCheckForCriticalAceRemoval")

public actual fun seCreateClientSecurity(clientthread: Pethread, clientsecurityqos: ConstPtr, remotesession: Boolean, clientcontext: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeCreateClientSecurity")

public actual fun seCreateClientSecurityFromSubjectContext(subjectcontext: ConstPtr, clientsecurityqos: ConstPtr, serverisremote: Boolean, clientcontext: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeCreateClientSecurityFromSubjectContext")

public actual fun seDeleteClientSecurity(clientcontext: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeDeleteClientSecurity")

public actual fun seDeleteObjectAuditAlarm(obj: ConstPtr, handle: Handle): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeDeleteObjectAuditAlarm")

public actual fun seDeleteObjectAuditAlarmWithTransaction(obj: ConstPtr, handle: Handle, transactionid: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeDeleteObjectAuditAlarmWithTransaction")

public actual fun seExamineSacl(sacl: ConstPtr, resourcesacl: ConstPtr, token: ConstPtr, desiredaccess: UInt, accessgranted: Boolean, generateaudit: MutPtr, generatealarm: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeExamineSacl")

public actual fun seFilterToken(existingtoken: ConstPtr, flags: UInt, sidstodisable: ConstPtr, privilegestodelete: ConstPtr, restrictedsids: ConstPtr, filteredtoken: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeFilterToken")

public actual fun seFreePrivileges(privileges: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeFreePrivileges")

public actual fun seImpersonateClient(clientcontext: ConstPtr, serverthread: Pethread): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeImpersonateClient")

public actual fun seImpersonateClientEx(clientcontext: ConstPtr, serverthread: Pethread): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeImpersonateClientEx")

public actual fun seLocateProcessImageName(process: Peprocess, pimagefilename: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeLocateProcessImageName")

public actual fun seMarkLogonSessionForTerminationNotification(logonid: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeMarkLogonSessionForTerminationNotification")

public actual fun seMarkLogonSessionForTerminationNotificationEx(logonid: ConstPtr, pserversilo: Pesilo): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeMarkLogonSessionForTerminationNotificationEx")

public actual fun seOpenObjectAuditAlarm(objecttypename: ConstPtr, obj: ConstPtr, absoluteobjectname: ConstPtr, securitydescriptor: PsecurityDescriptor, accessstate: ConstPtr, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, generateonclose: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeOpenObjectAuditAlarm")

public actual fun seOpenObjectAuditAlarmWithTransaction(objecttypename: ConstPtr, obj: ConstPtr, absoluteobjectname: ConstPtr, securitydescriptor: PsecurityDescriptor, accessstate: ConstPtr, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, transactionid: ConstPtr, generateonclose: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeOpenObjectAuditAlarmWithTransaction")

public actual fun seOpenObjectForDeleteAuditAlarm(objecttypename: ConstPtr, obj: ConstPtr, absoluteobjectname: ConstPtr, securitydescriptor: PsecurityDescriptor, accessstate: ConstPtr, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, generateonclose: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeOpenObjectForDeleteAuditAlarm")

public actual fun seOpenObjectForDeleteAuditAlarmWithTransaction(objecttypename: ConstPtr, obj: ConstPtr, absoluteobjectname: ConstPtr, securitydescriptor: PsecurityDescriptor, accessstate: ConstPtr, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, transactionid: ConstPtr, generateonclose: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeOpenObjectForDeleteAuditAlarmWithTransaction")

public actual fun sePrivilegeCheck(requiredprivileges: MutPtr, subjectsecuritycontext: ConstPtr, accessmode: Byte): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSePrivilegeCheck")

public actual fun seQueryAuthenticationIdToken(token: ConstPtr, authenticationid: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeQueryAuthenticationIdToken")

public actual fun seQueryInformationToken(token: ConstPtr, tokeninformationclass: TokenInformationClass, tokeninformation: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeQueryInformationToken")

public actual fun seQuerySecurityDescriptorInfo(securityinformation: ConstPtr, securitydescriptor: PsecurityDescriptor, length: MutPtr, objectssecuritydescriptor: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeQuerySecurityDescriptorInfo")

public actual fun seQueryServerSiloToken(token: ConstPtr, pserversilo: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeQueryServerSiloToken")

public actual fun seQuerySessionIdToken(token: ConstPtr, sessionid: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeQuerySessionIdToken")

public actual fun seQuerySessionIdTokenEx(token: ConstPtr, sessionid: MutPtr, isservicesession: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeQuerySessionIdTokenEx")

public actual fun seRegisterLogonSessionTerminatedRoutine(callbackroutine: PseLogonSessionTerminatedRoutine): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeRegisterLogonSessionTerminatedRoutine")

public actual fun seRegisterLogonSessionTerminatedRoutineEx(callbackroutine: PseLogonSessionTerminatedRoutineEx, context: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeRegisterLogonSessionTerminatedRoutineEx")

public actual fun seReportSecurityEventWithSubCategory(flags: UInt, sourcename: ConstPtr, usersid: Psid, auditparameters: ConstPtr, auditsubcategoryid: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeReportSecurityEventWithSubCategory")

public actual fun seSetAccessStateGenericMapping(accessstate: MutPtr, genericmapping: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeSetAccessStateGenericMapping")

public actual fun seSetSecurityDescriptorInfo(obj: ConstPtr, securityinformation: ConstPtr, modificationdescriptor: PsecurityDescriptor, objectssecuritydescriptor: MutPtr, pooltype: PoolType, genericmapping: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeSetSecurityDescriptorInfo")

public actual fun seSetSecurityDescriptorInfoEx(obj: ConstPtr, securityinformation: ConstPtr, modificationdescriptor: PsecurityDescriptor, objectssecuritydescriptor: MutPtr, autoinheritflags: UInt, pooltype: PoolType, genericmapping: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeSetSecurityDescriptorInfoEx")

public actual fun seShouldCheckForAccessRightsFromParent(objecttype: ConstPtr, childdescriptor: PsecurityDescriptor, accessstate: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeShouldCheckForAccessRightsFromParent")

public actual fun seTokenFromAccessInformation(accessinformation: ConstPtr, token: MutPtr, length: UInt, requiredlength: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeTokenFromAccessInformation")

public actual fun seTokenIsAdmin(token: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeTokenIsAdmin")

public actual fun seTokenIsRestricted(token: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeTokenIsRestricted")

public actual fun seTokenIsWriteRestricted(token: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeTokenIsWriteRestricted")

public actual fun seTokenType(token: ConstPtr): TokenType =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeTokenType")

public actual fun seUnregisterLogonSessionTerminatedRoutine(callbackroutine: PseLogonSessionTerminatedRoutine): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeUnregisterLogonSessionTerminatedRoutine")

public actual fun seUnregisterLogonSessionTerminatedRoutineEx(callbackroutine: PseLogonSessionTerminatedRoutineEx, context: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSeUnregisterLogonSessionTerminatedRoutineEx")

public actual fun secLookupAccountName(name: ConstPtr, sidsize: MutPtr, sid: Psid, nameuse: MutPtr, domainsize: MutPtr, referenceddomain: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSecLookupAccountName")

public actual fun secLookupAccountSid(sid: Psid, namesize: MutPtr, namebuffer: MutPtr, domainsize: MutPtr, domainbuffer: MutPtr, nameuse: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSecLookupAccountSid")

public actual fun secLookupWellKnownSid(sidtype: WellKnownSidType, sid: Psid, sidbuffersize: UInt, sidsize: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSecLookupWellKnownSid")

public actual fun secMakeSPN(serviceclass: MutPtr, servicename: MutPtr, instancename: MutPtr, instanceport: UShort, referrer: MutPtr, spn: MutPtr, length: MutPtr, allocate: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSecMakeSPN")

public actual fun secMakeSPNEx(serviceclass: MutPtr, servicename: MutPtr, instancename: MutPtr, instanceport: UShort, referrer: MutPtr, targetinfo: MutPtr, spn: MutPtr, length: MutPtr, allocate: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSecMakeSPNEx")

public actual fun secMakeSPNEx2(serviceclass: MutPtr, servicename: MutPtr, instancename: MutPtr, instanceport: UShort, referrer: MutPtr, intargetinfo: MutPtr, spn: MutPtr, totalsize: MutPtr, allocate: Boolean, istargetinfomarshaled: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSecMakeSPNEx2")

public actual fun setContextAttributesW(phcontext: ConstPtr, ulattribute: UInt, pbuffer: ConstPtr, cbbuffer: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSetContextAttributesW")

public actual fun sspiAcceptSecurityContextAsync(asynccontext: MutPtr, phcredential: ConstPtr, phcontext: ConstPtr, pinput: ConstPtr, fcontextreq: UInt, targetdatarep: UInt, phnewcontext: ConstPtr, poutput: ConstPtr, pfcontextattr: ConstPtr, ptsexpiry: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSspiAcceptSecurityContextAsync")

public actual fun sspiAcquireCredentialsHandleAsyncA(asynccontext: MutPtr, pszprincipal: Pcstr, pszpackage: Pcstr, fcredentialuse: UInt, pvlogonid: ConstPtr, pauthdata: ConstPtr, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: ConstPtr, phcredential: ConstPtr, ptsexpiry: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSspiAcquireCredentialsHandleAsyncA")

public actual fun sspiAcquireCredentialsHandleAsyncW(asynccontext: MutPtr, pszprincipal: ConstPtr, pszpackage: ConstPtr, fcredentialuse: UInt, pvlogonid: ConstPtr, pauthdata: ConstPtr, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: ConstPtr, phcredential: ConstPtr, ptsexpiry: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSspiAcquireCredentialsHandleAsyncW")

public actual fun sspiCreateAsyncContext(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSspiCreateAsyncContext")

public actual fun sspiDeleteSecurityContextAsync(asynccontext: MutPtr, phcontext: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSspiDeleteSecurityContextAsync")

public actual fun sspiFreeAsyncContext(handle: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSspiFreeAsyncContext")

public actual fun sspiFreeCredentialsHandleAsync(asynccontext: MutPtr, phcredential: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSspiFreeCredentialsHandleAsync")

public actual fun sspiGetAsyncCallStatus(handle: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSspiGetAsyncCallStatus")

public actual fun sspiInitializeSecurityContextAsyncA(asynccontext: MutPtr, phcredential: ConstPtr, phcontext: ConstPtr, psztargetname: Pcstr, fcontextreq: UInt, reserved1: UInt, targetdatarep: UInt, pinput: ConstPtr, reserved2: UInt, phnewcontext: ConstPtr, poutput: ConstPtr, pfcontextattr: ConstPtr, ptsexpiry: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSspiInitializeSecurityContextAsyncA")

public actual fun sspiInitializeSecurityContextAsyncW(asynccontext: MutPtr, phcredential: ConstPtr, phcontext: ConstPtr, psztargetname: ConstPtr, fcontextreq: UInt, reserved1: UInt, targetdatarep: UInt, pinput: ConstPtr, reserved2: UInt, phnewcontext: ConstPtr, poutput: ConstPtr, pfcontextattr: ConstPtr, ptsexpiry: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSspiInitializeSecurityContextAsyncW")

public actual fun sspiReinitAsyncContext(handle: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSspiReinitAsyncContext")

public actual fun sspiSetAsyncNotifyCallback(context: ConstPtr, callback: SspiAsyncNotifyCallback, callbackdata: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemSspiSetAsyncNotifyCallback")

public actual fun verifySignature(phcontext: ConstPtr, pmessage: ConstPtr, messageseqno: UInt, pfqop: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemVerifySignature")

public actual fun zwAccessCheckAndAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, objecttypename: ConstPtr, objectname: ConstPtr, securitydescriptor: PsecurityDescriptor, desiredaccess: UInt, genericmapping: ConstPtr, objectcreation: Boolean, grantedaccess: MutPtr, accessstatus: MutPtr, generateonclose: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwAccessCheckAndAuditAlarm")

public actual fun zwAccessCheckByTypeAndAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, objecttypename: ConstPtr, objectname: ConstPtr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: ConstPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Boolean, grantedaccess: MutPtr, accessstatus: MutPtr, generateonclose: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwAccessCheckByTypeAndAuditAlarm")

public actual fun zwAccessCheckByTypeResultListAndAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, objecttypename: ConstPtr, objectname: ConstPtr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: ConstPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Boolean, grantedaccess: MutPtr, accessstatus: MutPtr, generateonclose: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwAccessCheckByTypeResultListAndAuditAlarm")

public actual fun zwAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname: ConstPtr, handleid: ConstPtr, clienttoken: Handle, objecttypename: ConstPtr, objectname: ConstPtr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: ConstPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Boolean, grantedaccess: MutPtr, accessstatus: MutPtr, generateonclose: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwAccessCheckByTypeResultListAndAuditAlarmByHandle")

public actual fun zwAdjustGroupsToken(tokenhandle: Handle, resettodefault: Boolean, newstate: ConstPtr, bufferlength: UInt, previousstate: MutPtr, returnlength: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwAdjustGroupsToken")

public actual fun zwAdjustPrivilegesToken(tokenhandle: Handle, disableallprivileges: Boolean, newstate: ConstPtr, bufferlength: UInt, previousstate: MutPtr, returnlength: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwAdjustPrivilegesToken")

public actual fun zwAllocateVirtualMemory(processhandle: Handle, baseaddress: MutPtr, zerobits: ULong, regionsize: MutPtr, allocationtype: UInt, protect: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwAllocateVirtualMemory")

public actual fun zwAllocateVirtualMemoryEx(processhandle: Handle, baseaddress: MutPtr, regionsize: MutPtr, allocationtype: UInt, pageprotection: UInt, extendedparameters: MutPtr, extendedparametercount: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwAllocateVirtualMemoryEx")

public actual fun zwCancelIoFileEx(filehandle: Handle, iorequesttocancel: ConstPtr, iostatusblock: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwCancelIoFileEx")

public actual fun zwCloseObjectAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, generateonclose: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwCloseObjectAuditAlarm")

public actual fun zwCreateDirectoryObject(directoryhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwCreateDirectoryObject")

public actual fun zwCreateEvent(eventhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, eventtype: EventType, initialstate: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwCreateEvent")

public actual fun zwCreateSectionEx(sectionhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, maximumsize: ConstPtr, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Handle, extendedparameters: MutPtr, extendedparametercount: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwCreateSectionEx")

public actual fun zwDeleteFile(objectattributes: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwDeleteFile")

public actual fun zwDeleteObjectAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, generateonclose: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwDeleteObjectAuditAlarm")

public actual fun zwDuplicateObject(sourceprocesshandle: Handle, sourcehandle: Handle, targetprocesshandle: Handle, targethandle: MutPtr, desiredaccess: UInt, handleattributes: UInt, options: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwDuplicateObject")

public actual fun zwDuplicateToken(existingtokenhandle: Handle, desiredaccess: UInt, objectattributes: ConstPtr, effectiveonly: Boolean, tokentype: TokenType, newtokenhandle: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwDuplicateToken")

public actual fun zwFilterToken(existingtokenhandle: Handle, flags: UInt, sidstodisable: ConstPtr, privilegestodelete: ConstPtr, restrictedsids: ConstPtr, newtokenhandle: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwFilterToken")

public actual fun zwFlushBuffersFile(filehandle: Handle, iostatusblock: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwFlushBuffersFile")

public actual fun zwFlushBuffersFileEx(filehandle: Handle, flags: UInt, parameters: ConstPtr, parameterssize: UInt, iostatusblock: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwFlushBuffersFileEx")

public actual fun zwFlushVirtualMemory(processhandle: Handle, baseaddress: MutPtr, regionsize: MutPtr, iostatus: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwFlushVirtualMemory")

public actual fun zwFreeVirtualMemory(processhandle: Handle, baseaddress: MutPtr, regionsize: MutPtr, freetype: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwFreeVirtualMemory")

public actual fun zwFsControlFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, fscontrolcode: UInt, inputbuffer: ConstPtr, inputbufferlength: UInt, outputbuffer: MutPtr, outputbufferlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwFsControlFile")

public actual fun zwImpersonateAnonymousToken(threadhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwImpersonateAnonymousToken")

public actual fun zwLockFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, byteoffset: ConstPtr, length: ConstPtr, key: UInt, failimmediately: Boolean, exclusivelock: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwLockFile")

public actual fun zwNotifyChangeKey(keyhandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, completionfilter: UInt, watchtree: Boolean, buffer: MutPtr, buffersize: UInt, asynchronous: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwNotifyChangeKey")

public actual fun zwOpenDirectoryObject(directoryhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwOpenDirectoryObject")

public actual fun zwOpenObjectAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, objecttypename: ConstPtr, objectname: ConstPtr, securitydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, grantedaccess: UInt, privileges: ConstPtr, objectcreation: Boolean, accessgranted: Boolean, generateonclose: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwOpenObjectAuditAlarm")

public actual fun zwOpenProcessToken(processhandle: Handle, desiredaccess: UInt, tokenhandle: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwOpenProcessToken")

public actual fun zwOpenProcessTokenEx(processhandle: Handle, desiredaccess: UInt, handleattributes: UInt, tokenhandle: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwOpenProcessTokenEx")

public actual fun zwOpenThreadToken(threadhandle: Handle, desiredaccess: UInt, openasself: Boolean, tokenhandle: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwOpenThreadToken")

public actual fun zwOpenThreadTokenEx(threadhandle: Handle, desiredaccess: UInt, openasself: Boolean, handleattributes: UInt, tokenhandle: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwOpenThreadTokenEx")

public actual fun zwPrivilegeCheck(clienttoken: Handle, requiredprivileges: MutPtr, result: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwPrivilegeCheck")

public actual fun zwPrivilegeObjectAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, clienttoken: Handle, desiredaccess: UInt, privileges: ConstPtr, accessgranted: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwPrivilegeObjectAuditAlarm")

public actual fun zwPrivilegedServiceAuditAlarm(subsystemname: ConstPtr, servicename: ConstPtr, clienttoken: Handle, privileges: ConstPtr, accessgranted: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwPrivilegedServiceAuditAlarm")

public actual fun zwQueryDirectoryFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass, returnsingleentry: Boolean, filename: ConstPtr, restartscan: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwQueryDirectoryFile")

public actual fun zwQueryDirectoryFileEx(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass, queryflags: UInt, filename: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwQueryDirectoryFileEx")

public actual fun zwQueryDirectoryObject(directoryhandle: Handle, buffer: MutPtr, length: UInt, returnsingleentry: Boolean, restartscan: Boolean, context: MutPtr, returnlength: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwQueryDirectoryObject")

public actual fun zwQueryEaFile(filehandle: Handle, iostatusblock: MutPtr, buffer: MutPtr, length: UInt, returnsingleentry: Boolean, ealist: ConstPtr, ealistlength: UInt, eaindex: ConstPtr, restartscan: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwQueryEaFile")

public actual fun zwQueryFullAttributesFile(objectattributes: ConstPtr, fileinformation: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwQueryFullAttributesFile")

public actual fun zwQueryInformationToken(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: MutPtr, tokeninformationlength: UInt, returnlength: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwQueryInformationToken")

public actual fun zwQueryObject(handle: Handle, objectinformationclass: ObjectInformationClass, objectinformation: MutPtr, objectinformationlength: UInt, returnlength: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwQueryObject")

public actual fun zwQueryQuotaInformationFile(filehandle: Handle, iostatusblock: MutPtr, buffer: MutPtr, length: UInt, returnsingleentry: Boolean, sidlist: ConstPtr, sidlistlength: UInt, startsid: Psid, restartscan: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwQueryQuotaInformationFile")

public actual fun zwQuerySecurityObject(handle: Handle, securityinformation: UInt, securitydescriptor: PsecurityDescriptor, length: UInt, lengthneeded: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwQuerySecurityObject")

public actual fun zwQueryVirtualMemory(processhandle: Handle, baseaddress: ConstPtr, memoryinformationclass: MemoryInformationClass, memoryinformation: MutPtr, memoryinformationlength: ULong, returnlength: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwQueryVirtualMemory")

public actual fun zwQueryVolumeInformationFile(filehandle: Handle, iostatusblock: MutPtr, fsinformation: MutPtr, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwQueryVolumeInformationFile")

public actual fun zwSetEaFile(filehandle: Handle, iostatusblock: MutPtr, buffer: ConstPtr, length: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwSetEaFile")

public actual fun zwSetEvent(eventhandle: Handle, previousstate: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwSetEvent")

public actual fun zwSetInformationToken(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: ConstPtr, tokeninformationlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwSetInformationToken")

public actual fun zwSetInformationVirtualMemory(processhandle: Handle, vminformationclass: VirtualMemoryInformationClass, numberofentries: ULong, virtualaddresses: ConstPtr, vminformation: ConstPtr, vminformationlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwSetInformationVirtualMemory")

public actual fun zwSetQuotaInformationFile(filehandle: Handle, iostatusblock: MutPtr, buffer: ConstPtr, length: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwSetQuotaInformationFile")

public actual fun zwSetSecurityObject(handle: Handle, securityinformation: UInt, securitydescriptor: PsecurityDescriptor): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwSetSecurityObject")

public actual fun zwSetVolumeInformationFile(filehandle: Handle, iostatusblock: MutPtr, fsinformation: ConstPtr, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwSetVolumeInformationFile")

public actual fun zwUnlockFile(filehandle: Handle, iostatusblock: MutPtr, byteoffset: ConstPtr, length: ConstPtr, key: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemZwUnlockFile")
