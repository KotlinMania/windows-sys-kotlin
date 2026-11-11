@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

public actual fun applyControlToken(phcontext: COpaquePointer?, pinput: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ccAsyncCopyRead(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, wait: Boolean, buffer: COpaquePointer?, iostatus: COpaquePointer?, ioissuerthread: Pethread, asyncreadcontext: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ccCanIWrite(fileobject: COpaquePointer?, bytestowrite: UInt, wait: Boolean, retrying: UByte): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ccCoherencyFlushAndPurgeCache(sectionobjectpointer: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, iostatus: COpaquePointer?, flags: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ccCopyRead(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, wait: Boolean, buffer: COpaquePointer?, iostatus: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ccCopyReadEx(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, wait: Boolean, buffer: COpaquePointer?, iostatus: COpaquePointer?, ioissuerthread: Pethread): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ccCopyWrite(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, wait: Boolean, buffer: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ccCopyWriteEx(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, wait: Boolean, buffer: COpaquePointer?, ioissuerthread: Pethread): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ccCopyWriteWontFlush(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ccDeferWrite(fileobject: COpaquePointer?, postroutine: PccPostDeferredWrite, context1: COpaquePointer?, context2: COpaquePointer?, bytestowrite: UInt, retrying: Boolean) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ccErrorCallbackRoutine(context: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ccFastCopyRead(fileobject: COpaquePointer?, fileoffset: UInt, length: UInt, pagecount: UInt, buffer: COpaquePointer?, iostatus: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ccFastCopyWrite(fileobject: COpaquePointer?, fileoffset: UInt, length: UInt, buffer: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ccFlushCache(sectionobjectpointer: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, iostatus: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ccGetDirtyPages(loghandle: COpaquePointer?, dirtypageroutine: PdirtyPageRoutine, context1: COpaquePointer?, context2: COpaquePointer?): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ccGetFileObjectFromBcb(bcb: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ccGetFileObjectFromSectionPtrs(sectionobjectpointer: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ccGetFileObjectFromSectionPtrsRef(sectionobjectpointer: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ccGetFlushedValidData(sectionobjectpointer: COpaquePointer?, bcblistheld: Boolean): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ccInitializeCacheMap(fileobject: COpaquePointer?, filesizes: COpaquePointer?, pinaccess: Boolean, callbacks: COpaquePointer?, lazywritecontext: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ccInitializeCacheMapEx(fileobject: COpaquePointer?, filesizes: COpaquePointer?, pinaccess: Boolean, callbacks: COpaquePointer?, lazywritecontext: COpaquePointer?, flags: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ccIsCacheManagerCallbackNeeded(status: Ntstatus): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ccIsThereDirtyData(vpb: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ccIsThereDirtyDataEx(vpb: COpaquePointer?, numberofdirtypages: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ccMapData(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, flags: UInt, bcb: COpaquePointer?, buffer: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ccMdlRead(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, mdlchain: COpaquePointer?, iostatus: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ccMdlReadComplete(fileobject: COpaquePointer?, mdlchain: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ccMdlWriteAbort(fileobject: COpaquePointer?, mdlchain: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ccMdlWriteComplete(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, mdlchain: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ccPinMappedData(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, flags: UInt, bcb: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ccPinRead(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, flags: UInt, bcb: COpaquePointer?, buffer: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ccPrepareMdlWrite(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, mdlchain: COpaquePointer?, iostatus: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ccPreparePinWrite(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, zero: Boolean, flags: UInt, bcb: COpaquePointer?, buffer: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ccPurgeCacheSection(sectionobjectpointer: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, flags: UInt): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ccRemapBcb(bcb: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ccRepinBcb(bcb: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ccScheduleReadAhead(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ccScheduleReadAheadEx(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, ioissuerthread: Pethread) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ccSetAdditionalCacheAttributes(fileobject: COpaquePointer?, disablereadahead: Boolean, disablewritebehind: Boolean) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ccSetAdditionalCacheAttributesEx(fileobject: COpaquePointer?, flags: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ccSetBcbOwnerPointer(bcb: COpaquePointer?, ownerpointer: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ccSetDirtyPageThreshold(fileobject: COpaquePointer?, dirtypagethreshold: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ccSetDirtyPinnedData(bcbvoid: COpaquePointer?, lsn: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ccSetFileSizes(fileobject: COpaquePointer?, filesizes: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ccSetFileSizesEx(fileobject: COpaquePointer?, filesizes: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ccSetLogHandleForFile(fileobject: COpaquePointer?, loghandle: COpaquePointer?, flushtolsnroutine: PflushToLsn) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ccSetParallelFlushFile(fileobject: COpaquePointer?, enableparallelflush: Boolean) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ccSetReadAheadGranularity(fileobject: COpaquePointer?, granularity: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ccUninitializeCacheMap(fileobject: COpaquePointer?, truncatesize: COpaquePointer?, uninitializeevent: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ccUnpinData(bcb: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ccUnpinDataForThread(bcb: COpaquePointer?, resourcethreadid: ULong) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ccUnpinRepinnedBcb(bcb: COpaquePointer?, writethrough: Boolean, iostatus: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ccWaitForCurrentLazyWriterActivity(): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ccZeroData(fileobject: COpaquePointer?, startoffset: COpaquePointer?, endoffset: COpaquePointer?, wait: Boolean): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun completeAuthToken(phcontext: COpaquePointer?, ptoken: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exDisableResourceBoostLite(resource: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun exQueryPoolBlockSize(poolblock: COpaquePointer?, quotacharged: COpaquePointer?): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exportSecurityContext(phcontext: COpaquePointer?, fflags: UInt, ppackedcontext: COpaquePointer?, ptoken: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlAcknowledgeEcp(ecpcontext: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlAcquireFileExclusive(fileobject: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlAddBaseMcbEntry(mcb: COpaquePointer?, vbn: Long, lbn: Long, sectorcount: Long): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlAddBaseMcbEntryEx(mcb: COpaquePointer?, vbn: Long, lbn: Long, sectorcount: Long): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlAddLargeMcbEntry(mcb: COpaquePointer?, vbn: Long, lbn: Long, sectorcount: Long): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlAddMcbEntry(mcb: COpaquePointer?, vbn: UInt, lbn: UInt, sectorcount: UInt): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlAddToTunnelCache(cache: COpaquePointer?, directorykey: ULong, shortname: COpaquePointer?, longname: COpaquePointer?, keybyshortname: Boolean, datalength: UInt, data: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlAddToTunnelCacheEx(cache: COpaquePointer?, directorykey: ULong, shortname: COpaquePointer?, longname: COpaquePointer?, flags: UInt, datalength: UInt, data: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlAllocateAePushLock(pooltype: PoolType, tag: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlAllocateExtraCreateParameter(ecptype: COpaquePointer?, sizeofcontext: UInt, flags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, pooltag: UInt, ecpcontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlAllocateExtraCreateParameterFromLookasideList(ecptype: COpaquePointer?, sizeofcontext: UInt, flags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, lookasidelist: COpaquePointer?, ecpcontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlAllocateExtraCreateParameterList(flags: UInt, ecplist: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlAllocateFileLock(completelockirproutine: PcompleteLockIrpRoutine, unlockroutine: PunlockRoutine): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlAllocateResource(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlAreNamesEqual(constantnamea: COpaquePointer?, constantnameb: COpaquePointer?, ignorecase: Boolean, upcasetable: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlAreThereCurrentOrInProgressFileLocks(filelock: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlAreThereWaitingFileLocks(filelock: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlAreVolumeStartupApplicationsComplete(): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlBalanceReads(targetdevice: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlCancellableWaitForMultipleObjects(count: UInt, objectarray: COpaquePointer?, waittype: WaitType, timeout: COpaquePointer?, waitblockarray: COpaquePointer?, irp: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlCancellableWaitForSingleObject(obj: COpaquePointer?, timeout: COpaquePointer?, irp: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlChangeBackingFileObject(currentfileobject: COpaquePointer?, newfileobject: COpaquePointer?, changebackingtype: FsrtlChangeBackingType, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlCheckLockForOplockRequest(filelock: COpaquePointer?, allocationsize: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlCheckLockForReadAccess(filelock: COpaquePointer?, irp: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlCheckLockForWriteAccess(filelock: COpaquePointer?, irp: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlCheckOplock(oplock: COpaquePointer?, irp: COpaquePointer?, context: COpaquePointer?, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlCheckOplockEx(oplock: COpaquePointer?, irp: COpaquePointer?, flags: UInt, context: COpaquePointer?, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlCheckOplockEx2(oplock: COpaquePointer?, irp: COpaquePointer?, flags: UInt, flagsex2: UInt, completionroutinecontext: COpaquePointer?, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp, timeout: ULong, notifycontext: COpaquePointer?, notifyroutine: PoplockNotifyRoutine): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlCheckUpperOplock(oplock: COpaquePointer?, newloweroplockstate: UInt, completionroutinecontext: COpaquePointer?, completionroutine: PoplockWaitCompleteRoutine, prependroutine: PoplockFsPrepostIrp, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlCopyRead(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, wait: Boolean, lockkey: UInt, buffer: COpaquePointer?, iostatus: COpaquePointer?, deviceobject: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlCopyWrite(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, wait: Boolean, lockkey: UInt, buffer: COpaquePointer?, iostatus: COpaquePointer?, deviceobject: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlCreateSectionForDataScan(sectionhandle: COpaquePointer?, sectionobject: COpaquePointer?, sectionfilesize: COpaquePointer?, fileobject: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, maximumsize: COpaquePointer?, sectionpageprotection: UInt, allocationattributes: UInt, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlCurrentBatchOplock(oplock: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlCurrentOplock(oplock: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlCurrentOplockH(oplock: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlDeleteExtraCreateParameterLookasideList(lookaside: COpaquePointer?, flags: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlDeleteKeyFromTunnelCache(cache: COpaquePointer?, directorykey: ULong) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlDeleteTunnelCache(cache: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlDeregisterUncProvider(handle: Handle) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlDismountComplete(deviceobject: COpaquePointer?, dismountstatus: Ntstatus) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlDissectDbcs(path: io.github.kotlinmania.windowssys.windows.win32.system.kernel.String, firstname: COpaquePointer?, remainingname: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlDissectName(path: UnicodeString, firstname: COpaquePointer?, remainingname: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlDoesDbcsContainWildCards(name: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlDoesNameContainWildCards(name: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlFastCheckLockForRead(filelock: COpaquePointer?, startingbyte: COpaquePointer?, length: COpaquePointer?, key: UInt, fileobject: COpaquePointer?, processid: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlFastCheckLockForWrite(filelock: COpaquePointer?, startingbyte: COpaquePointer?, length: COpaquePointer?, key: UInt, fileobject: COpaquePointer?, processid: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlFastUnlockAll(filelock: COpaquePointer?, fileobject: COpaquePointer?, processid: Peprocess, context: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlFastUnlockAllByKey(filelock: COpaquePointer?, fileobject: COpaquePointer?, processid: Peprocess, key: UInt, context: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlFastUnlockSingle(filelock: COpaquePointer?, fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: COpaquePointer?, processid: Peprocess, key: UInt, context: COpaquePointer?, alreadysynchronized: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlFindExtraCreateParameter(ecplist: COpaquePointer?, ecptype: COpaquePointer?, ecpcontext: COpaquePointer?, ecpcontextsize: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlFindInTunnelCache(cache: COpaquePointer?, directorykey: ULong, name: COpaquePointer?, shortname: COpaquePointer?, longname: COpaquePointer?, datalength: COpaquePointer?, data: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlFindInTunnelCacheEx(cache: COpaquePointer?, directorykey: ULong, name: COpaquePointer?, shortname: COpaquePointer?, longname: COpaquePointer?, flags: UInt, datalength: COpaquePointer?, data: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlFreeAePushLock(aepushlock: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlFreeExtraCreateParameter(ecpcontext: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlFreeExtraCreateParameterList(ecplist: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlFreeFileLock(filelock: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlGetCurrentProcessLoaderList(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlGetEcpListFromIrp(irp: COpaquePointer?, ecplist: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlGetFileSize(fileobject: COpaquePointer?, filesize: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlGetNextBaseMcbEntry(mcb: COpaquePointer?, runindex: UInt, vbn: COpaquePointer?, lbn: COpaquePointer?, sectorcount: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlGetNextExtraCreateParameter(ecplist: COpaquePointer?, currentecpcontext: COpaquePointer?, nextecptype: COpaquePointer?, nextecpcontext: COpaquePointer?, nextecpcontextsize: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlGetNextFileLock(filelock: COpaquePointer?, restart: Boolean): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlGetNextLargeMcbEntry(mcb: COpaquePointer?, runindex: UInt, vbn: COpaquePointer?, lbn: COpaquePointer?, sectorcount: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlGetNextMcbEntry(mcb: COpaquePointer?, runindex: UInt, vbn: COpaquePointer?, lbn: COpaquePointer?, sectorcount: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlGetSectorSizeInformation(deviceobject: COpaquePointer?, sectorsizeinfo: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlGetSupportedFeatures(deviceobject: COpaquePointer?, supportedfeatures: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlGetVirtualDiskNestingLevel(deviceobject: COpaquePointer?, nestinglevel: COpaquePointer?, nestingflags: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlIncrementCcFastMdlReadWait() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlIncrementCcFastReadNoWait() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlIncrementCcFastReadNotPossible() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlIncrementCcFastReadResourceMiss() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlIncrementCcFastReadWait() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlInitExtraCreateParameterLookasideList(lookaside: COpaquePointer?, flags: UInt, size: ULong, tag: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlInitializeBaseMcb(mcb: COpaquePointer?, pooltype: PoolType) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlInitializeBaseMcbEx(mcb: COpaquePointer?, pooltype: PoolType, flags: UShort): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlInitializeExtraCreateParameter(ecp: COpaquePointer?, ecpflags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, totalsize: UInt, ecptype: COpaquePointer?, listallocatedfrom: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlInitializeExtraCreateParameterList(ecplist: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlInitializeFileLock(filelock: COpaquePointer?, completelockirproutine: PcompleteLockIrpRoutine, unlockroutine: PunlockRoutine) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlInitializeLargeMcb(mcb: COpaquePointer?, pooltype: PoolType) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlInitializeMcb(mcb: COpaquePointer?, pooltype: PoolType) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlInitializeOplock(oplock: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlInitializeTunnelCache(cache: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlInsertExtraCreateParameter(ecplist: COpaquePointer?, ecpcontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlInsertPerFileContext(perfilecontextpointer: COpaquePointer?, ptr: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlInsertPerFileObjectContext(fileobject: COpaquePointer?, ptr: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlInsertPerStreamContext(perstreamcontext: COpaquePointer?, ptr: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlIs32BitProcess(process: Peprocess): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlIsDaxVolume(fileobject: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlIsDbcsInExpression(expression: COpaquePointer?, name: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlIsEcpAcknowledged(ecpcontext: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlIsEcpFromUserMode(ecpcontext: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlIsExtentDangling(startpage: UInt, numberofpages: UInt, flags: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlIsFatDbcsLegal(dbcsname: io.github.kotlinmania.windowssys.windows.win32.system.kernel.String, wildcardspermissible: Boolean, pathnamepermissible: Boolean, leadingbackslashpermissible: Boolean): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlIsHpfsDbcsLegal(dbcsname: io.github.kotlinmania.windowssys.windows.win32.system.kernel.String, wildcardspermissible: Boolean, pathnamepermissible: Boolean, leadingbackslashpermissible: Boolean): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlIsMobileOS(): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlIsNameInExpression(expression: COpaquePointer?, name: COpaquePointer?, ignorecase: Boolean, upcasetable: Pcwstr): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlIsNameInUnUpcasedExpression(expression: COpaquePointer?, name: COpaquePointer?, ignorecase: Boolean, upcasetable: Pcwstr): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag: UInt): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlIsNtstatusExpected(exception: Ntstatus): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlIsPagingFile(fileobject: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlIsSystemPagingFile(fileobject: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlIssueDeviceIoControl(deviceobject: COpaquePointer?, ioctl: UInt, flags: UByte, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt, iosbinformation: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlKernelFsControlFile(fileobject: COpaquePointer?, fscontrolcode: UInt, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt, retoutputbuffersize: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlLogCcFlushError(filename: COpaquePointer?, deviceobject: COpaquePointer?, sectionobjectpointer: COpaquePointer?, flusherror: Ntstatus, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlLookupBaseMcbEntry(mcb: COpaquePointer?, vbn: Long, lbn: COpaquePointer?, sectorcountfromlbn: COpaquePointer?, startinglbn: COpaquePointer?, sectorcountfromstartinglbn: COpaquePointer?, index: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlLookupLargeMcbEntry(mcb: COpaquePointer?, vbn: Long, lbn: COpaquePointer?, sectorcountfromlbn: COpaquePointer?, startinglbn: COpaquePointer?, sectorcountfromstartinglbn: COpaquePointer?, index: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlLookupLastBaseMcbEntry(mcb: COpaquePointer?, vbn: COpaquePointer?, lbn: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlLookupLastBaseMcbEntryAndIndex(opaquemcb: COpaquePointer?, largevbn: COpaquePointer?, largelbn: COpaquePointer?, index: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlLookupLastLargeMcbEntry(mcb: COpaquePointer?, vbn: COpaquePointer?, lbn: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlLookupLastLargeMcbEntryAndIndex(opaquemcb: COpaquePointer?, largevbn: COpaquePointer?, largelbn: COpaquePointer?, index: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlLookupLastMcbEntry(mcb: COpaquePointer?, vbn: COpaquePointer?, lbn: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlLookupMcbEntry(mcb: COpaquePointer?, vbn: UInt, lbn: COpaquePointer?, sectorcount: COpaquePointer?, index: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlLookupPerFileContext(perfilecontextpointer: COpaquePointer?, ownerid: COpaquePointer?, instanceid: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlLookupPerFileObjectContext(fileobject: COpaquePointer?, ownerid: COpaquePointer?, instanceid: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlLookupPerStreamContextInternal(streamcontext: COpaquePointer?, ownerid: COpaquePointer?, instanceid: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlMdlReadCompleteDev(fileobject: COpaquePointer?, mdlchain: COpaquePointer?, deviceobject: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlMdlReadDev(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, lockkey: UInt, mdlchain: COpaquePointer?, iostatus: COpaquePointer?, deviceobject: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlMdlReadEx(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, lockkey: UInt, mdlchain: COpaquePointer?, iostatus: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlMdlWriteCompleteDev(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, mdlchain: COpaquePointer?, deviceobject: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlMupGetProviderIdFromName(pprovidername: COpaquePointer?, pproviderid: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlMupGetProviderInfoFromFileObject(pfileobject: COpaquePointer?, level: UInt, pbuffer: COpaquePointer?, pbuffersize: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlNormalizeNtstatus(exception: Ntstatus, genericexception: Ntstatus): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlNotifyCleanup(notifysync: PnotifySync, notifylist: COpaquePointer?, fscontext: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlNotifyCleanupAll(notifysync: PnotifySync, notifylist: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlNotifyFilterChangeDirectory(notifysync: PnotifySync, notifylist: COpaquePointer?, fscontext: COpaquePointer?, fulldirectoryname: COpaquePointer?, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifyirp: COpaquePointer?, traversecallback: PcheckForTraverseAccess, subjectcontext: COpaquePointer?, filtercallback: PfilterReportChange) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlNotifyFilterReportChange(notifysync: PnotifySync, notifylist: COpaquePointer?, fulltargetname: COpaquePointer?, targetnameoffset: UShort, streamname: COpaquePointer?, normalizedparentname: COpaquePointer?, filtermatch: UInt, action: UInt, targetcontext: COpaquePointer?, filtercontext: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlNotifyFullChangeDirectory(notifysync: PnotifySync, notifylist: COpaquePointer?, fscontext: COpaquePointer?, fulldirectoryname: COpaquePointer?, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifyirp: COpaquePointer?, traversecallback: PcheckForTraverseAccess, subjectcontext: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlNotifyFullReportChange(notifysync: PnotifySync, notifylist: COpaquePointer?, fulltargetname: COpaquePointer?, targetnameoffset: UShort, streamname: COpaquePointer?, normalizedparentname: COpaquePointer?, filtermatch: UInt, action: UInt, targetcontext: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlNotifyInitializeSync(notifysync: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlNotifyUninitializeSync(notifysync: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlNotifyVolumeEvent(fileobject: COpaquePointer?, eventcode: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlNotifyVolumeEventEx(fileobject: COpaquePointer?, eventcode: UInt, event: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlNumberOfRunsInBaseMcb(mcb: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlNumberOfRunsInLargeMcb(mcb: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlNumberOfRunsInMcb(mcb: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlOplockBreakH(oplock: COpaquePointer?, irp: COpaquePointer?, flags: UInt, context: COpaquePointer?, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlOplockBreakH2(oplock: COpaquePointer?, irp: COpaquePointer?, flags: UInt, context: COpaquePointer?, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp, grantedaccess: COpaquePointer?, shareaccess: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlOplockBreakToNone(oplock: COpaquePointer?, irpsp: COpaquePointer?, irp: COpaquePointer?, context: COpaquePointer?, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlOplockBreakToNoneEx(oplock: COpaquePointer?, irp: COpaquePointer?, flags: UInt, context: COpaquePointer?, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlOplockFsctrl(oplock: COpaquePointer?, irp: COpaquePointer?, opencount: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlOplockFsctrlEx(oplock: COpaquePointer?, irp: COpaquePointer?, opencount: UInt, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlOplockGetAnyBreakOwnerProcess(oplock: COpaquePointer?): Peprocess =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlOplockIsFastIoPossible(oplock: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlOplockIsSharedRequest(irp: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlOplockKeysEqual(fo1: COpaquePointer?, fo2: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlPostPagingFileStackOverflow(context: COpaquePointer?, event: COpaquePointer?, stackoverflowroutine: PfsrtlStackOverflowRoutine) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlPostStackOverflow(context: COpaquePointer?, event: COpaquePointer?, stackoverflowroutine: PfsrtlStackOverflowRoutine) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlPrepareMdlWriteDev(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, lockkey: UInt, mdlchain: COpaquePointer?, iostatus: COpaquePointer?, deviceobject: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlPrepareMdlWriteEx(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, lockkey: UInt, mdlchain: COpaquePointer?, iostatus: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlPrepareToReuseEcp(ecpcontext: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlPrivateLock(filelock: COpaquePointer?, fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: COpaquePointer?, processid: Peprocess, key: UInt, failimmediately: Boolean, exclusivelock: Boolean, iosb: COpaquePointer?, irp: COpaquePointer?, context: COpaquePointer?, alreadysynchronized: Boolean): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlProcessFileLock(filelock: COpaquePointer?, irp: COpaquePointer?, context: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlQueryCachedVdl(fileobject: COpaquePointer?, vdl: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlQueryInformationFile(fileobject: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass, retfileinformationsize: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlQueryKernelEaFile(fileobject: COpaquePointer?, returnedeadata: COpaquePointer?, length: UInt, returnsingleentry: Boolean, ealist: COpaquePointer?, ealistlength: UInt, eaindex: COpaquePointer?, restartscan: Boolean, lengthreturned: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlQueryMaximumVirtualDiskNestingLevel(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlRegisterFileSystemFilterCallbacks(filterdriverobject: COpaquePointer?, callbacks: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlRegisterUncProvider(muphandle: COpaquePointer?, redirectordevicename: COpaquePointer?, mailslotssupported: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlRegisterUncProviderEx(muphandle: COpaquePointer?, redirdevname: COpaquePointer?, deviceobject: COpaquePointer?, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlRegisterUncProviderEx2(redirdevname: COpaquePointer?, deviceobject: COpaquePointer?, registration: COpaquePointer?, muphandle: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlReleaseFile(fileobject: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlRemoveBaseMcbEntry(mcb: COpaquePointer?, vbn: Long, sectorcount: Long): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlRemoveDotsFromPath(originalstring: Pwstr, pathlength: UShort, newlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlRemoveExtraCreateParameter(ecplist: COpaquePointer?, ecptype: COpaquePointer?, ecpcontext: COpaquePointer?, ecpcontextsize: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlRemoveLargeMcbEntry(mcb: COpaquePointer?, vbn: Long, sectorcount: Long) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlRemoveMcbEntry(mcb: COpaquePointer?, vbn: UInt, sectorcount: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlRemovePerFileContext(perfilecontextpointer: COpaquePointer?, ownerid: COpaquePointer?, instanceid: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlRemovePerFileObjectContext(fileobject: COpaquePointer?, ownerid: COpaquePointer?, instanceid: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlRemovePerStreamContext(streamcontext: COpaquePointer?, ownerid: COpaquePointer?, instanceid: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlResetBaseMcb(mcb: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlResetLargeMcb(mcb: COpaquePointer?, selfsynchronized: Boolean) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlSetDriverBacking(driverobj: COpaquePointer?, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlSetEcpListIntoIrp(irp: COpaquePointer?, ecplist: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlSetKernelEaFile(fileobject: COpaquePointer?, eabuffer: COpaquePointer?, length: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlSplitBaseMcb(mcb: COpaquePointer?, vbn: Long, amount: Long): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlSplitLargeMcb(mcb: COpaquePointer?, vbn: Long, amount: Long): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlTeardownPerFileContexts(perfilecontextpointer: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlTeardownPerStreamContexts(advancedheader: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlTruncateBaseMcb(mcb: COpaquePointer?, vbn: Long) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlTruncateLargeMcb(mcb: COpaquePointer?, vbn: Long) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlTruncateMcb(mcb: COpaquePointer?, vbn: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlUninitializeBaseMcb(mcb: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlUninitializeFileLock(filelock: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlUninitializeLargeMcb(mcb: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlUninitializeMcb(mcb: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlUninitializeOplock(oplock: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlUpdateDiskCounters(bytesread: ULong, byteswritten: ULong) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fsRtlUpperOplockFsctrl(oplock: COpaquePointer?, irp: COpaquePointer?, opencount: UInt, loweroplockstate: UInt, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlValidateReparsePointBuffer(bufferlength: UInt, reparsebuffer: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsRtlVolumeDeviceToCorrelationId(volumedeviceobject: COpaquePointer?, guid: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getSecurityUserInfo(logonid: COpaquePointer?, flags: UInt, userinformation: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioAcquireVpbSpinLock(irql: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioApplyPriorityInfoThread(inputpriorityinfo: COpaquePointer?, outputpriorityinfo: COpaquePointer?, thread: Pethread): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioCheckDesiredAccess(desiredaccess: COpaquePointer?, grantedaccess: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioCheckEaBufferValidity(eabuffer: COpaquePointer?, ealength: UInt, erroroffset: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioCheckFunctionAccess(grantedaccess: UInt, majorfunction: UByte, minorfunction: UByte, iocontrolcode: UInt, arg1: COpaquePointer?, arg2: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioCheckQuerySetFileInformation(fileinformationclass: FileInformationClass, length: UInt, setoperation: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioCheckQuerySetVolumeInformation(fsinformationclass: FsInformationClass, length: UInt, setoperation: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioCheckQuotaBufferValidity(quotabuffer: COpaquePointer?, quotalength: UInt, erroroffset: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioClearFsTrackOffsetState(irp: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioCreateStreamFileObject(fileobject: COpaquePointer?, deviceobject: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioCreateStreamFileObjectEx(fileobject: COpaquePointer?, deviceobject: COpaquePointer?, filehandle: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioCreateStreamFileObjectEx2(createoptions: COpaquePointer?, fileobject: COpaquePointer?, deviceobject: COpaquePointer?, streamfileobject: COpaquePointer?, filehandle: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioCreateStreamFileObjectLite(fileobject: COpaquePointer?, deviceobject: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioEnumerateDeviceObjectList(driverobject: COpaquePointer?, deviceobjectlist: COpaquePointer?, deviceobjectlistsize: UInt, actualnumberdeviceobjects: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioEnumerateRegisteredFiltersList(driverobjectlist: COpaquePointer?, driverobjectlistsize: UInt, actualnumberdriverobjects: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioFastQueryNetworkAttributes(objectattributes: COpaquePointer?, desiredaccess: UInt, openoptions: UInt, iostatus: COpaquePointer?, buffer: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioGetAttachedDevice(deviceobject: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioGetBaseFileSystemDeviceObject(fileobject: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioGetDeviceAttachmentBaseRef(deviceobject: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioGetDeviceToVerify(thread: Pethread): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioGetDiskDeviceObject(filesystemdeviceobject: COpaquePointer?, diskdeviceobject: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioGetFsTrackOffsetState(irp: COpaquePointer?, retfstrackoffsetblob: COpaquePointer?, rettrackedoffset: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioGetLowerDeviceObject(deviceobject: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioGetOplockKeyContext(fileobject: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioGetOplockKeyContextEx(fileobject: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioGetRequestorProcess(irp: COpaquePointer?): Peprocess =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioGetRequestorProcessId(irp: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioGetRequestorSessionId(irp: COpaquePointer?, psessionid: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioIrpHasFsTrackOffsetExtensionType(irp: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioIsOperationSynchronous(irp: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioIsSystemThread(thread: Pethread): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioIsValidNameGraftingBuffer(irp: COpaquePointer?, reparsebuffer: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioPageRead(fileobject: COpaquePointer?, memorydescriptorlist: COpaquePointer?, startingoffset: COpaquePointer?, event: COpaquePointer?, iostatusblock: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioQueryFileDosDeviceName(fileobject: COpaquePointer?, objectnameinformation: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioQueryFileInformation(fileobject: COpaquePointer?, fileinformationclass: FileInformationClass, length: UInt, fileinformation: COpaquePointer?, returnedlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioQueryVolumeInformation(fileobject: COpaquePointer?, fsinformationclass: FsInformationClass, length: UInt, fsinformation: COpaquePointer?, returnedlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioQueueThreadIrp(irp: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioRegisterFileSystem(deviceobject: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioRegisterFsRegistrationChange(driverobject: COpaquePointer?, drivernotificationroutine: DriverFsNotification): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioRegisterFsRegistrationChangeMountAware(driverobject: COpaquePointer?, drivernotificationroutine: DriverFsNotification, synchronizewithmounts: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioReleaseVpbSpinLock(irql: UByte) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioReplaceFileObjectName(fileobject: COpaquePointer?, newfilename: Pcwstr, filenamelength: UShort): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioRequestDeviceRemovalForReset(physicaldeviceobject: COpaquePointer?, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioRetrievePriorityInfo(irp: COpaquePointer?, fileobject: COpaquePointer?, thread: Pethread, priorityinfo: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioSetDeviceToVerify(thread: Pethread, deviceobject: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioSetFsTrackOffsetState(irp: COpaquePointer?, fstrackoffsetblob: COpaquePointer?, trackedoffset: Long): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioSetInformation(fileobject: COpaquePointer?, fileinformationclass: FileInformationClass, length: UInt, fileinformation: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioSynchronousPageWrite(fileobject: COpaquePointer?, memorydescriptorlist: COpaquePointer?, startingoffset: COpaquePointer?, event: COpaquePointer?, iostatusblock: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioThreadToProcess(thread: Pethread): Peprocess =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioUnregisterFileSystem(deviceobject: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioUnregisterFsRegistrationChange(driverobject: COpaquePointer?, drivernotificationroutine: DriverFsNotification) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ioVerifyVolume(deviceobject: COpaquePointer?, allowrawmount: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keAcquireQueuedSpinLock(number: KspinLockQueueNumber): UByte =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keAcquireSpinLockRaiseToSynch(spinlock: COpaquePointer?): UByte =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keAttachProcess(process: Prkprocess) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keDetachProcess() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keInitializeMutant(mutant: COpaquePointer?, initialowner: Boolean) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keInitializeQueue(queue: COpaquePointer?, count: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keInsertHeadQueue(queue: COpaquePointer?, entry: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keInsertQueue(queue: COpaquePointer?, entry: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keReadStateMutant(mutant: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keReadStateQueue(queue: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keReleaseMutant(mutant: COpaquePointer?, increment: Int, abandoned: Boolean, wait: Boolean): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keReleaseQueuedSpinLock(number: KspinLockQueueNumber, oldirql: UByte) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keRemoveQueue(queue: COpaquePointer?, waitmode: Byte, timeout: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keRemoveQueueEx(queue: COpaquePointer?, waitmode: Byte, alertable: Boolean, timeout: COpaquePointer?, entryarray: COpaquePointer?, count: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keRundownQueue(queue: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keSetIdealProcessorThread(thread: Pkthread, processor: UByte): UByte =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keSetKernelStackSwapEnable(enable: Boolean): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keStackAttachProcess(process: Prkprocess, apcstate: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun keTryToAcquireQueuedSpinLock(number: KspinLockQueueNumber, oldirql: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun keUnstackDetachProcess(apcstate: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun makeSignature(phcontext: COpaquePointer?, fqop: UInt, pmessage: COpaquePointer?, messageseqno: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mapSecurityError(secstatus: Hresult): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmCanFileBeTruncated(sectionpointer: COpaquePointer?, newfilesize: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmDoesFileHaveUserWritableReferences(sectionpointer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmFlushImageSection(sectionobjectpointer: COpaquePointer?, flushtype: MmflushType): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmForceSectionClosed(sectionobjectpointer: COpaquePointer?, delayclose: Boolean): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmForceSectionClosedEx(sectionobjectpointer: COpaquePointer?, forcecloseflags: UInt): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmGetMaximumFileSectionSize(): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmIsFileSectionActive(fssectionpointer: COpaquePointer?, flags: UInt, sectionisactive: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmIsRecursiveIoFault(): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmMdlPagesAreZero(mdl: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmPrefetchPages(numberoflists: UInt, readlists: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmSetAddressRangeModified(address: COpaquePointer?, length: ULong): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntAccessCheckAndAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, objecttypename: COpaquePointer?, objectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, desiredaccess: UInt, genericmapping: COpaquePointer?, objectcreation: Boolean, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, generateonclose: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntAccessCheckByTypeAndAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, objecttypename: COpaquePointer?, objectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Boolean, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, generateonclose: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntAccessCheckByTypeResultListAndAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, objecttypename: COpaquePointer?, objectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Boolean, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, generateonclose: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname: COpaquePointer?, handleid: COpaquePointer?, clienttoken: Handle, objecttypename: COpaquePointer?, objectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Boolean, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, generateonclose: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntAdjustGroupsToken(tokenhandle: Handle, resettodefault: Boolean, newstate: COpaquePointer?, bufferlength: UInt, previousstate: COpaquePointer?, returnlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntAdjustPrivilegesToken(tokenhandle: Handle, disableallprivileges: Boolean, newstate: COpaquePointer?, bufferlength: UInt, previousstate: COpaquePointer?, returnlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntAllocateVirtualMemory(processhandle: Handle, baseaddress: COpaquePointer?, zerobits: ULong, regionsize: COpaquePointer?, allocationtype: UInt, protect: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntAllocateVirtualMemoryEx(processhandle: Handle, baseaddress: COpaquePointer?, regionsize: COpaquePointer?, allocationtype: UInt, pageprotection: UInt, extendedparameters: COpaquePointer?, extendedparametercount: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntCancelIoFileEx(filehandle: Handle, iorequesttocancel: COpaquePointer?, iostatusblock: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntCloseObjectAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, generateonclose: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntCreateDirectoryObject(directoryhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntCreateEvent(eventhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, eventtype: EventType, initialstate: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntCreateFile(filehandle: COpaquePointer?, desiredaccess: FileAccessRights, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, allocationsize: COpaquePointer?, fileattributes: FileFlagsAndAttributes, shareaccess: FileShareMode, createdisposition: NtcreatefileCreateDisposition, createoptions: NtcreatefileCreateOptions, eabuffer: COpaquePointer?, ealength: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntCreateSection(sectionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, maximumsize: COpaquePointer?, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Handle): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntCreateSectionEx(sectionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, maximumsize: COpaquePointer?, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Handle, extendedparameters: COpaquePointer?, extendedparametercount: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntDeleteFile(objectattributes: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntDeleteObjectAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, generateonclose: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntDuplicateObject(sourceprocesshandle: Handle, sourcehandle: Handle, targetprocesshandle: Handle, targethandle: COpaquePointer?, desiredaccess: UInt, handleattributes: UInt, options: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntDuplicateToken(existingtokenhandle: Handle, desiredaccess: UInt, objectattributes: COpaquePointer?, effectiveonly: Boolean, tokentype: TokenType, newtokenhandle: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntFilterToken(existingtokenhandle: Handle, flags: UInt, sidstodisable: COpaquePointer?, privilegestodelete: COpaquePointer?, restrictedsids: COpaquePointer?, newtokenhandle: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntFlushBuffersFile(filehandle: Handle, iostatusblock: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntFlushBuffersFileEx(filehandle: Handle, flags: UInt, parameters: COpaquePointer?, parameterssize: UInt, iostatusblock: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntFlushVirtualMemory(processhandle: Handle, baseaddress: COpaquePointer?, regionsize: COpaquePointer?, iostatus: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntFreeVirtualMemory(processhandle: Handle, baseaddress: COpaquePointer?, regionsize: COpaquePointer?, freetype: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntFsControlFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, fscontrolcode: UInt, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntImpersonateAnonymousToken(threadhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntLockFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, byteoffset: COpaquePointer?, length: COpaquePointer?, key: UInt, failimmediately: Boolean, exclusivelock: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntNotifyChangeKey(keyhandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, completionfilter: UInt, watchtree: Boolean, buffer: COpaquePointer?, buffersize: UInt, asynchronous: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntOpenDirectoryObject(directoryhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntOpenFile(filehandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, shareaccess: UInt, openoptions: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntOpenObjectAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, objecttypename: COpaquePointer?, objectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, grantedaccess: UInt, privileges: COpaquePointer?, objectcreation: Boolean, accessgranted: Boolean, generateonclose: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntOpenProcessToken(processhandle: Handle, desiredaccess: UInt, tokenhandle: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntOpenProcessTokenEx(processhandle: Handle, desiredaccess: UInt, handleattributes: UInt, tokenhandle: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntOpenSymbolicLinkObject(linkhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntOpenThreadToken(threadhandle: Handle, desiredaccess: UInt, openasself: Boolean, tokenhandle: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntOpenThreadTokenEx(threadhandle: Handle, desiredaccess: UInt, openasself: Boolean, handleattributes: UInt, tokenhandle: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntPrivilegeCheck(clienttoken: Handle, requiredprivileges: COpaquePointer?, result: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntPrivilegeObjectAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, clienttoken: Handle, desiredaccess: UInt, privileges: COpaquePointer?, accessgranted: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntPrivilegedServiceAuditAlarm(subsystemname: COpaquePointer?, servicename: COpaquePointer?, clienttoken: Handle, privileges: COpaquePointer?, accessgranted: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntQueryDirectoryFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass, returnsingleentry: Boolean, filename: COpaquePointer?, restartscan: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntQueryDirectoryFileEx(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass, queryflags: UInt, filename: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntQueryDirectoryObject(directoryhandle: Handle, buffer: COpaquePointer?, length: UInt, returnsingleentry: Boolean, restartscan: Boolean, context: COpaquePointer?, returnlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntQueryEaFile(filehandle: Handle, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt, returnsingleentry: Boolean, ealist: COpaquePointer?, ealistlength: UInt, eaindex: COpaquePointer?, restartscan: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntQueryFullAttributesFile(objectattributes: COpaquePointer?, fileinformation: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntQueryInformationByName(objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntQueryInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntQueryInformationToken(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: COpaquePointer?, tokeninformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntQueryQuotaInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt, returnsingleentry: Boolean, sidlist: COpaquePointer?, sidlistlength: UInt, startsid: Psid, restartscan: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntQuerySecurityObject(handle: Handle, securityinformation: UInt, securitydescriptor: PsecurityDescriptor, length: UInt, lengthneeded: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntQuerySymbolicLinkObject(linkhandle: Handle, linktarget: COpaquePointer?, returnedlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntQueryVirtualMemory(processhandle: Handle, baseaddress: COpaquePointer?, memoryinformationclass: MemoryInformationClass, memoryinformation: COpaquePointer?, memoryinformationlength: ULong, returnlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntQueryVolumeInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, fsinformation: COpaquePointer?, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntReadFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt, byteoffset: COpaquePointer?, key: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntSetEaFile(filehandle: Handle, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntSetEvent(eventhandle: Handle, previousstate: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntSetInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntSetInformationToken(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: COpaquePointer?, tokeninformationlength: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntSetInformationVirtualMemory(processhandle: Handle, vminformationclass: VirtualMemoryInformationClass, numberofentries: ULong, virtualaddresses: COpaquePointer?, vminformation: COpaquePointer?, vminformationlength: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntSetQuotaInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntSetSecurityObject(handle: Handle, securityinformation: UInt, securitydescriptor: PsecurityDescriptor): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntSetVolumeInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, fsinformation: COpaquePointer?, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntUnlockFile(filehandle: Handle, iostatusblock: COpaquePointer?, byteoffset: COpaquePointer?, length: COpaquePointer?, key: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntWriteFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt, byteoffset: COpaquePointer?, key: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun obInsertObject(obj: COpaquePointer?, passedaccessstate: COpaquePointer?, desiredaccess: UInt, objectpointerbias: UInt, newobject: COpaquePointer?, handle: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun obIsKernelHandle(handle: Handle): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun obMakeTemporaryObject(obj: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun obOpenObjectByPointer(obj: COpaquePointer?, handleattributes: UInt, passedaccessstate: COpaquePointer?, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, handle: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun obOpenObjectByPointerWithTag(obj: COpaquePointer?, handleattributes: UInt, passedaccessstate: COpaquePointer?, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, tag: UInt, handle: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun obQueryNameString(obj: COpaquePointer?, objectnameinfo: COpaquePointer?, length: UInt, returnlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun obQueryObjectAuditingByHandle(handle: Handle, generateonclose: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pfxFindPrefix(prefixtable: COpaquePointer?, fullname: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pfxInitialize(prefixtable: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun pfxInsertPrefix(prefixtable: COpaquePointer?, prefix: COpaquePointer?, prefixtableentry: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pfxRemovePrefix(prefixtable: COpaquePointer?, prefixtableentry: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun poQueueShutdownWorkItem(workitem: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psAssignImpersonationToken(thread: Pethread, token: Handle): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psChargePoolQuota(process: Peprocess, pooltype: PoolType, amount: ULong) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun psChargeProcessPoolQuota(process: Peprocess, pooltype: PoolType, amount: ULong): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psDereferenceImpersonationToken(impersonationtoken: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun psDereferencePrimaryToken(primarytoken: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun psDisableImpersonation(thread: Pethread, impersonationstate: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psGetProcessExitTime(): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psGetThreadProcess(thread: Pethread): Peprocess =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psImpersonateClient(thread: Pethread, token: COpaquePointer?, copyonopen: Boolean, effectiveonly: Boolean, impersonationlevel: SecurityImpersonationLevel): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psIsDiskCountersEnabled(): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psIsSystemThread(thread: Pethread): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psIsThreadTerminating(thread: Pethread): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psLookupProcessByProcessId(processid: Handle, process: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psLookupThreadByThreadId(threadid: Handle, thread: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psReferenceImpersonationToken(thread: Pethread, copyonopen: COpaquePointer?, effectiveonly: COpaquePointer?, impersonationlevel: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psReferencePrimaryToken(process: Peprocess): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun psRestoreImpersonation(thread: Pethread, impersonationstate: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun psReturnPoolQuota(process: Peprocess, pooltype: PoolType, amount: ULong) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun psRevertToSelf() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun psUpdateDiskCounters(process: Peprocess, bytesread: ULong, byteswritten: ULong, readoperationcount: UInt, writeoperationcount: UInt, flushoperationcount: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun querySecurityContextToken(phcontext: COpaquePointer?, token: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlAbsoluteToSelfRelativeSD(absolutesecuritydescriptor: PsecurityDescriptor, selfrelativesecuritydescriptor: PsecurityDescriptor, bufferlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlAddAccessAllowedAce(acl: COpaquePointer?, acerevision: UInt, accessmask: UInt, sid: Psid): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlAddAccessAllowedAceEx(acl: COpaquePointer?, acerevision: UInt, aceflags: UInt, accessmask: UInt, sid: Psid): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlAddAce(acl: COpaquePointer?, acerevision: UInt, startingaceindex: UInt, acelist: COpaquePointer?, acelistlength: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlAllocateAndInitializeSid(identifierauthority: COpaquePointer?, subauthoritycount: UByte, subauthority0: UInt, subauthority1: UInt, subauthority2: UInt, subauthority3: UInt, subauthority4: UInt, subauthority5: UInt, subauthority6: UInt, subauthority7: UInt, sid: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlAllocateAndInitializeSidEx(identifierauthority: COpaquePointer?, subauthoritycount: UByte, subauthorities: COpaquePointer?, sid: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlAllocateHeap(heaphandle: COpaquePointer?, flags: UInt, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlAppendStringToString(destination: COpaquePointer?, source: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlCompareAltitudes(altitude1: COpaquePointer?, altitude2: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlCompareMemoryUlong(source: COpaquePointer?, length: ULong, pattern: UInt): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlCompressBuffer(compressionformatandengine: UShort, uncompressedbuffer: COpaquePointer?, uncompressedbuffersize: UInt, compressedbuffer: COpaquePointer?, compressedbuffersize: UInt, uncompressedchunksize: UInt, finalcompressedsize: COpaquePointer?, workspace: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlCompressChunks(uncompressedbuffer: COpaquePointer?, uncompressedbuffersize: UInt, compressedbuffer: COpaquePointer?, compressedbuffersize: UInt, compresseddatainfo: COpaquePointer?, compresseddatainfolength: UInt, workspace: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlCopyLuid(destinationluid: COpaquePointer?, sourceluid: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun rtlCopySid(destinationsidlength: UInt, destinationsid: Psid, sourcesid: Psid): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlCreateAcl(acl: COpaquePointer?, acllength: UInt, aclrevision: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlCreateHeap(flags: UInt, heapbase: COpaquePointer?, reservesize: ULong, commitsize: ULong, lock: COpaquePointer?, parameters: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlCreateServiceSid(servicename: COpaquePointer?, servicesid: Psid, servicesidlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlCreateSystemVolumeInformationFolder(volumerootpath: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlCreateUnicodeString(destinationstring: COpaquePointer?, sourcestring: Pcwstr): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlCreateVirtualAccountSid(name: COpaquePointer?, basesubauthority: UInt, sid: Psid, sidlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlCustomCPToUnicodeN(customcp: COpaquePointer?, unicodestring: Pwstr, maxbytesinunicodestring: UInt, bytesinunicodestring: COpaquePointer?, customcpstring: Pcstr, bytesincustomcpstring: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlDecompressBuffer(compressionformat: UShort, uncompressedbuffer: COpaquePointer?, uncompressedbuffersize: UInt, compressedbuffer: COpaquePointer?, compressedbuffersize: UInt, finaluncompressedsize: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlDecompressBufferEx(compressionformat: UShort, uncompressedbuffer: COpaquePointer?, uncompressedbuffersize: UInt, compressedbuffer: COpaquePointer?, compressedbuffersize: UInt, finaluncompressedsize: COpaquePointer?, workspace: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlDecompressBufferEx2(compressionformat: UShort, uncompressedbuffer: COpaquePointer?, uncompressedbuffersize: UInt, compressedbuffer: COpaquePointer?, compressedbuffersize: UInt, uncompressedchunksize: UInt, finaluncompressedsize: COpaquePointer?, workspace: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlDecompressChunks(uncompressedbuffer: COpaquePointer?, uncompressedbuffersize: UInt, compressedbuffer: COpaquePointer?, compressedbuffersize: UInt, compressedtail: COpaquePointer?, compressedtailsize: UInt, compresseddatainfo: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlDecompressFragment(compressionformat: UShort, uncompressedfragment: COpaquePointer?, uncompressedfragmentsize: UInt, compressedbuffer: COpaquePointer?, compressedbuffersize: UInt, fragmentoffset: UInt, finaluncompressedsize: COpaquePointer?, workspace: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlDecompressFragmentEx(compressionformat: UShort, uncompressedfragment: COpaquePointer?, uncompressedfragmentsize: UInt, compressedbuffer: COpaquePointer?, compressedbuffersize: UInt, fragmentoffset: UInt, uncompressedchunksize: UInt, finaluncompressedsize: COpaquePointer?, workspace: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlDeleteAce(acl: COpaquePointer?, aceindex: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlDescribeChunk(compressionformat: UShort, compressedbuffer: COpaquePointer?, endofcompressedbufferplus1: COpaquePointer?, chunkbuffer: COpaquePointer?, chunksize: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlDestroyHeap(heaphandle: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlDosPathNameToNtPathNameUWithStatus(dosfilename: Pcwstr, ntfilename: COpaquePointer?, filepart: COpaquePointer?, reserved: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlDowncaseUnicodeString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlDuplicateUnicodeString(flags: UInt, stringin: COpaquePointer?, stringout: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlEqualPrefixSid(sid1: Psid, sid2: Psid): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlEqualSid(sid1: Psid, sid2: Psid): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlFindUnicodePrefix(prefixtable: COpaquePointer?, fullname: COpaquePointer?, caseinsensitiveindex: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlFreeHeap(heaphandle: COpaquePointer?, flags: UInt, baseaddress: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlFreeSid(sid: Psid): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlGenerate8dot3Name(name: COpaquePointer?, allowextendedcharacters: Boolean, context: COpaquePointer?, name8dot3: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlGetAce(acl: COpaquePointer?, aceindex: UInt, ace: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlGetCompressionWorkSpaceSize(compressionformatandengine: UShort, compressbufferworkspacesize: COpaquePointer?, compressfragmentworkspacesize: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlGetDaclSecurityDescriptor(securitydescriptor: PsecurityDescriptor, daclpresent: COpaquePointer?, dacl: COpaquePointer?, dacldefaulted: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlGetGroupSecurityDescriptor(securitydescriptor: PsecurityDescriptor, group: COpaquePointer?, groupdefaulted: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlGetOwnerSecurityDescriptor(securitydescriptor: PsecurityDescriptor, owner: COpaquePointer?, ownerdefaulted: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlGetSaclSecurityDescriptor(securitydescriptor: PsecurityDescriptor, saclpresent: COpaquePointer?, sacl: COpaquePointer?, sacldefaulted: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlIdentifierAuthoritySid(sid: Psid): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlIdnToAscii(flags: UInt, sourcestring: Pcwstr, sourcestringlength: Int, destinationstring: Pwstr, destinationstringlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlIdnToNameprepUnicode(flags: UInt, sourcestring: Pcwstr, sourcestringlength: Int, destinationstring: Pwstr, destinationstringlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlIdnToUnicode(flags: UInt, sourcestring: Pcwstr, sourcestringlength: Int, destinationstring: Pwstr, destinationstringlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlInitCodePageTable(tablebase: COpaquePointer?, codepagetable: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun rtlInitUnicodeStringEx(destinationstring: COpaquePointer?, sourcestring: Pcwstr): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlInitializeSid(sid: Psid, identifierauthority: COpaquePointer?, subauthoritycount: UByte): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlInitializeSidEx(sid: Psid, identifierauthority: COpaquePointer?, subauthoritycount: UByte, vararg variadicArgs: Long): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlInitializeUnicodePrefix(prefixtable: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun rtlInsertUnicodePrefix(prefixtable: COpaquePointer?, prefix: COpaquePointer?, prefixtableentry: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlIsCloudFilesPlaceholder(fileattributes: UInt, reparsetag: UInt): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlIsDosDeviceNameU(dosfilename: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag: UInt): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlIsNormalizedString(normform: UInt, sourcestring: Pcwstr, sourcestringlength: Int, normalized: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlIsPartialPlaceholder(fileattributes: UInt, reparsetag: UInt): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlIsPartialPlaceholderFileHandle(filehandle: Handle, ispartialplaceholder: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlIsPartialPlaceholderFileInfo(infobuffer: COpaquePointer?, infoclass: FileInformationClass, ispartialplaceholder: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlIsSandboxedToken(context: COpaquePointer?, previousmode: Byte): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlIsValidOemCharacter(char: Pwstr): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlLengthRequiredSid(subauthoritycount: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlLengthSid(sid: Psid): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlMultiByteToUnicodeN(unicodestring: Pwstr, maxbytesinunicodestring: UInt, bytesinunicodestring: COpaquePointer?, multibytestring: Pcstr, bytesinmultibytestring: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlMultiByteToUnicodeSize(bytesinunicodestring: COpaquePointer?, multibytestring: Pcstr, bytesinmultibytestring: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlNextUnicodePrefix(prefixtable: COpaquePointer?, restart: Boolean): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlNormalizeString(normform: UInt, sourcestring: Pcwstr, sourcestringlength: Int, destinationstring: Pwstr, destinationstringlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlNtStatusToDosErrorNoTeb(status: Ntstatus): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlOemStringToCountedUnicodeString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlOemStringToUnicodeString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlOemToUnicodeN(unicodestring: Pwstr, maxbytesinunicodestring: UInt, bytesinunicodestring: COpaquePointer?, oemstring: Pcstr, bytesinoemstring: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlPrefixString(string1: COpaquePointer?, string2: COpaquePointer?, caseinsensitive: Boolean): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlQueryPackageIdentity(tokenobject: COpaquePointer?, packagefullname: Pwstr, packagesize: COpaquePointer?, appid: Pwstr, appidsize: COpaquePointer?, packaged: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlQueryPackageIdentityEx(tokenobject: COpaquePointer?, packagefullname: Pwstr, packagesize: COpaquePointer?, appid: Pwstr, appidsize: COpaquePointer?, dynamicid: COpaquePointer?, flags: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlQueryProcessPlaceholderCompatibilityMode(): Byte =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlQueryThreadPlaceholderCompatibilityMode(): Byte =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlRandom(seed: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlRandomEx(seed: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlRemoveUnicodePrefix(prefixtable: COpaquePointer?, prefixtableentry: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun rtlReplaceSidInSd(securitydescriptor: PsecurityDescriptor, oldsid: Psid, newsid: Psid, numchanges: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlReserveChunk(compressionformat: UShort, compressedbuffer: COpaquePointer?, endofcompressedbufferplus1: COpaquePointer?, chunkbuffer: COpaquePointer?, chunksize: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlSecondsSince1970ToTime(elapsedseconds: UInt, time: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun rtlSecondsSince1980ToTime(elapsedseconds: UInt, time: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun rtlSelfRelativeToAbsoluteSD(selfrelativesecuritydescriptor: PsecurityDescriptor, absolutesecuritydescriptor: PsecurityDescriptor, absolutesecuritydescriptorsize: COpaquePointer?, dacl: COpaquePointer?, daclsize: COpaquePointer?, sacl: COpaquePointer?, saclsize: COpaquePointer?, owner: Psid, ownersize: COpaquePointer?, primarygroup: Psid, primarygroupsize: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlSetGroupSecurityDescriptor(securitydescriptor: PsecurityDescriptor, group: Psid, groupdefaulted: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlSetOwnerSecurityDescriptor(securitydescriptor: PsecurityDescriptor, owner: Psid, ownerdefaulted: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlSetProcessPlaceholderCompatibilityMode(mode: Byte): Byte =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlSetThreadPlaceholderCompatibilityMode(mode: Byte): Byte =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlSubAuthorityCountSid(sid: Psid): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlSubAuthoritySid(sid: Psid, subauthority: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlTimeToSecondsSince1980(time: COpaquePointer?, elapsedseconds: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlUnicodeStringToCountedOemString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlUnicodeToCustomCPN(customcp: COpaquePointer?, customcpstring: Pstr, maxbytesincustomcpstring: UInt, bytesincustomcpstring: COpaquePointer?, unicodestring: Pcwstr, bytesinunicodestring: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlUnicodeToMultiByteN(multibytestring: Pstr, maxbytesinmultibytestring: UInt, bytesinmultibytestring: COpaquePointer?, unicodestring: COpaquePointer?, bytesinunicodestring: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlUnicodeToOemN(oemstring: Pstr, maxbytesinoemstring: UInt, bytesinoemstring: COpaquePointer?, unicodestring: COpaquePointer?, bytesinunicodestring: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlUpcaseUnicodeStringToCountedOemString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlUpcaseUnicodeStringToOemString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlUpcaseUnicodeToCustomCPN(customcp: COpaquePointer?, customcpstring: Pstr, maxbytesincustomcpstring: UInt, bytesincustomcpstring: COpaquePointer?, unicodestring: Pcwstr, bytesinunicodestring: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlUpcaseUnicodeToMultiByteN(multibytestring: Pstr, maxbytesinmultibytestring: UInt, bytesinmultibytestring: COpaquePointer?, unicodestring: COpaquePointer?, bytesinunicodestring: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlUpcaseUnicodeToOemN(oemstring: Pstr, maxbytesinoemstring: UInt, bytesinoemstring: COpaquePointer?, unicodestring: COpaquePointer?, bytesinunicodestring: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlValidSid(sid: Psid): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlValidateUnicodeString(flags: UInt, string: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlxOemStringToUnicodeSize(oemstring: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlxUnicodeStringToOemSize(unicodestring: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seAccessCheckFromState(securitydescriptor: PsecurityDescriptor, primarytokeninformation: COpaquePointer?, clienttokeninformation: COpaquePointer?, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: COpaquePointer?, genericmapping: COpaquePointer?, accessmode: Byte, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seAccessCheckFromStateEx(securitydescriptor: PsecurityDescriptor, primarytoken: COpaquePointer?, clienttoken: COpaquePointer?, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: COpaquePointer?, genericmapping: COpaquePointer?, accessmode: Byte, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seAdjustAccessStateForAccessConstraints(objecttype: COpaquePointer?, securitydescriptor: PsecurityDescriptor, accessstate: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun seAdjustAccessStateForTrustLabel(objecttype: COpaquePointer?, securitydescriptor: PsecurityDescriptor, accessstate: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun seAdjustObjectSecurity(objectname: COpaquePointer?, originaldescriptor: PsecurityDescriptor, proposeddescriptor: PsecurityDescriptor, subjectsecuritycontext: COpaquePointer?, adjusteddescriptor: COpaquePointer?, applyadjusteddescriptor: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seAppendPrivileges(accessstate: COpaquePointer?, privileges: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seAuditFipsCryptoSelftests(bsuccess: Boolean, selftestcode: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun seAuditHardLinkCreation(filename: COpaquePointer?, linkname: COpaquePointer?, bsuccess: Boolean) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun seAuditHardLinkCreationWithTransaction(filename: COpaquePointer?, linkname: COpaquePointer?, bsuccess: Boolean, transactionid: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun seAuditTransactionStateChange(transactionid: COpaquePointer?, resourcemanagerid: COpaquePointer?, newtransactionstate: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun seAuditingAnyFileEventsWithContext(securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seAuditingAnyFileEventsWithContextEx(securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: COpaquePointer?, stagingenabled: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seAuditingFileEvents(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seAuditingFileEventsWithContext(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seAuditingFileEventsWithContextEx(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: COpaquePointer?, stagingenabled: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seAuditingFileOrGlobalEvents(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seAuditingHardLinkEvents(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seAuditingHardLinkEventsWithContext(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seCaptureSubjectContextEx(thread: Pethread, process: Peprocess, subjectcontext: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun seCheckForCriticalAceRemoval(currentdescriptor: PsecurityDescriptor, newdescriptor: PsecurityDescriptor, subjectsecuritycontext: COpaquePointer?, aceremoved: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun seCreateClientSecurity(clientthread: Pethread, clientsecurityqos: COpaquePointer?, remotesession: Boolean, clientcontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seCreateClientSecurityFromSubjectContext(subjectcontext: COpaquePointer?, clientsecurityqos: COpaquePointer?, serverisremote: Boolean, clientcontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seDeleteClientSecurity(clientcontext: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun seDeleteObjectAuditAlarm(obj: COpaquePointer?, handle: Handle) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun seDeleteObjectAuditAlarmWithTransaction(obj: COpaquePointer?, handle: Handle, transactionid: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun seExamineSacl(sacl: COpaquePointer?, resourcesacl: COpaquePointer?, token: COpaquePointer?, desiredaccess: UInt, accessgranted: Boolean, generateaudit: COpaquePointer?, generatealarm: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun seFilterToken(existingtoken: COpaquePointer?, flags: UInt, sidstodisable: COpaquePointer?, privilegestodelete: COpaquePointer?, restrictedsids: COpaquePointer?, filteredtoken: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seFreePrivileges(privileges: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun seImpersonateClient(clientcontext: COpaquePointer?, serverthread: Pethread) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun seImpersonateClientEx(clientcontext: COpaquePointer?, serverthread: Pethread): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seLocateProcessImageName(process: Peprocess, pimagefilename: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seMarkLogonSessionForTerminationNotification(logonid: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seMarkLogonSessionForTerminationNotificationEx(logonid: COpaquePointer?, pserversilo: Pesilo): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seOpenObjectAuditAlarm(objecttypename: COpaquePointer?, obj: COpaquePointer?, absoluteobjectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, accessstate: COpaquePointer?, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, generateonclose: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun seOpenObjectAuditAlarmWithTransaction(objecttypename: COpaquePointer?, obj: COpaquePointer?, absoluteobjectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, accessstate: COpaquePointer?, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, transactionid: COpaquePointer?, generateonclose: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun seOpenObjectForDeleteAuditAlarm(objecttypename: COpaquePointer?, obj: COpaquePointer?, absoluteobjectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, accessstate: COpaquePointer?, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, generateonclose: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun seOpenObjectForDeleteAuditAlarmWithTransaction(objecttypename: COpaquePointer?, obj: COpaquePointer?, absoluteobjectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, accessstate: COpaquePointer?, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, transactionid: COpaquePointer?, generateonclose: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sePrivilegeCheck(requiredprivileges: COpaquePointer?, subjectsecuritycontext: COpaquePointer?, accessmode: Byte): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seQueryAuthenticationIdToken(token: COpaquePointer?, authenticationid: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seQueryInformationToken(token: COpaquePointer?, tokeninformationclass: TokenInformationClass, tokeninformation: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seQuerySecurityDescriptorInfo(securityinformation: COpaquePointer?, securitydescriptor: PsecurityDescriptor, length: COpaquePointer?, objectssecuritydescriptor: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seQueryServerSiloToken(token: COpaquePointer?, pserversilo: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seQuerySessionIdToken(token: COpaquePointer?, sessionid: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seQuerySessionIdTokenEx(token: COpaquePointer?, sessionid: COpaquePointer?, isservicesession: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seRegisterLogonSessionTerminatedRoutine(callbackroutine: PseLogonSessionTerminatedRoutine): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seRegisterLogonSessionTerminatedRoutineEx(callbackroutine: PseLogonSessionTerminatedRoutineEx, context: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seReportSecurityEventWithSubCategory(flags: UInt, sourcename: COpaquePointer?, usersid: Psid, auditparameters: COpaquePointer?, auditsubcategoryid: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seSetAccessStateGenericMapping(accessstate: COpaquePointer?, genericmapping: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun seSetSecurityDescriptorInfo(obj: COpaquePointer?, securityinformation: COpaquePointer?, modificationdescriptor: PsecurityDescriptor, objectssecuritydescriptor: COpaquePointer?, pooltype: PoolType, genericmapping: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seSetSecurityDescriptorInfoEx(obj: COpaquePointer?, securityinformation: COpaquePointer?, modificationdescriptor: PsecurityDescriptor, objectssecuritydescriptor: COpaquePointer?, autoinheritflags: UInt, pooltype: PoolType, genericmapping: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seShouldCheckForAccessRightsFromParent(objecttype: COpaquePointer?, childdescriptor: PsecurityDescriptor, accessstate: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seTokenFromAccessInformation(accessinformation: COpaquePointer?, token: COpaquePointer?, length: UInt, requiredlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seTokenIsAdmin(token: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seTokenIsRestricted(token: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seTokenIsWriteRestricted(token: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seTokenType(token: COpaquePointer?): TokenType =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seUnregisterLogonSessionTerminatedRoutine(callbackroutine: PseLogonSessionTerminatedRoutine): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seUnregisterLogonSessionTerminatedRoutineEx(callbackroutine: PseLogonSessionTerminatedRoutineEx, context: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun secLookupAccountName(name: COpaquePointer?, sidsize: COpaquePointer?, sid: Psid, nameuse: COpaquePointer?, domainsize: COpaquePointer?, referenceddomain: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun secLookupAccountSid(sid: Psid, namesize: COpaquePointer?, namebuffer: COpaquePointer?, domainsize: COpaquePointer?, domainbuffer: COpaquePointer?, nameuse: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun secLookupWellKnownSid(sidtype: WellKnownSidType, sid: Psid, sidbuffersize: UInt, sidsize: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun secMakeSPN(serviceclass: COpaquePointer?, servicename: COpaquePointer?, instancename: COpaquePointer?, instanceport: UShort, referrer: COpaquePointer?, spn: COpaquePointer?, length: COpaquePointer?, allocate: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun secMakeSPNEx(serviceclass: COpaquePointer?, servicename: COpaquePointer?, instancename: COpaquePointer?, instanceport: UShort, referrer: COpaquePointer?, targetinfo: COpaquePointer?, spn: COpaquePointer?, length: COpaquePointer?, allocate: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun secMakeSPNEx2(serviceclass: COpaquePointer?, servicename: COpaquePointer?, instancename: COpaquePointer?, instanceport: UShort, referrer: COpaquePointer?, intargetinfo: COpaquePointer?, spn: COpaquePointer?, totalsize: COpaquePointer?, allocate: Boolean, istargetinfomarshaled: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setContextAttributesW(phcontext: COpaquePointer?, ulattribute: UInt, pbuffer: COpaquePointer?, cbbuffer: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sspiAcceptSecurityContextAsync(asynccontext: COpaquePointer?, phcredential: COpaquePointer?, phcontext: COpaquePointer?, pinput: COpaquePointer?, fcontextreq: UInt, targetdatarep: UInt, phnewcontext: COpaquePointer?, poutput: COpaquePointer?, pfcontextattr: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sspiAcquireCredentialsHandleAsyncA(asynccontext: COpaquePointer?, pszprincipal: Pcstr, pszpackage: Pcstr, fcredentialuse: UInt, pvlogonid: COpaquePointer?, pauthdata: COpaquePointer?, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: COpaquePointer?, phcredential: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sspiAcquireCredentialsHandleAsyncW(asynccontext: COpaquePointer?, pszprincipal: COpaquePointer?, pszpackage: COpaquePointer?, fcredentialuse: UInt, pvlogonid: COpaquePointer?, pauthdata: COpaquePointer?, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: COpaquePointer?, phcredential: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sspiCreateAsyncContext(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sspiDeleteSecurityContextAsync(asynccontext: COpaquePointer?, phcontext: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sspiFreeAsyncContext(handle: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun sspiFreeCredentialsHandleAsync(asynccontext: COpaquePointer?, phcredential: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sspiGetAsyncCallStatus(handle: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sspiInitializeSecurityContextAsyncA(asynccontext: COpaquePointer?, phcredential: COpaquePointer?, phcontext: COpaquePointer?, psztargetname: Pcstr, fcontextreq: UInt, reserved1: UInt, targetdatarep: UInt, pinput: COpaquePointer?, reserved2: UInt, phnewcontext: COpaquePointer?, poutput: COpaquePointer?, pfcontextattr: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sspiInitializeSecurityContextAsyncW(asynccontext: COpaquePointer?, phcredential: COpaquePointer?, phcontext: COpaquePointer?, psztargetname: COpaquePointer?, fcontextreq: UInt, reserved1: UInt, targetdatarep: UInt, pinput: COpaquePointer?, reserved2: UInt, phnewcontext: COpaquePointer?, poutput: COpaquePointer?, pfcontextattr: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sspiReinitAsyncContext(handle: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sspiSetAsyncNotifyCallback(context: COpaquePointer?, callback: SspiAsyncNotifyCallback, callbackdata: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun verifySignature(phcontext: COpaquePointer?, pmessage: COpaquePointer?, messageseqno: UInt, pfqop: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwAccessCheckAndAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, objecttypename: COpaquePointer?, objectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, desiredaccess: UInt, genericmapping: COpaquePointer?, objectcreation: Boolean, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, generateonclose: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwAccessCheckByTypeAndAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, objecttypename: COpaquePointer?, objectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Boolean, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, generateonclose: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwAccessCheckByTypeResultListAndAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, objecttypename: COpaquePointer?, objectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Boolean, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, generateonclose: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname: COpaquePointer?, handleid: COpaquePointer?, clienttoken: Handle, objecttypename: COpaquePointer?, objectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Boolean, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, generateonclose: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwAdjustGroupsToken(tokenhandle: Handle, resettodefault: Boolean, newstate: COpaquePointer?, bufferlength: UInt, previousstate: COpaquePointer?, returnlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwAdjustPrivilegesToken(tokenhandle: Handle, disableallprivileges: Boolean, newstate: COpaquePointer?, bufferlength: UInt, previousstate: COpaquePointer?, returnlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwAllocateVirtualMemory(processhandle: Handle, baseaddress: COpaquePointer?, zerobits: ULong, regionsize: COpaquePointer?, allocationtype: UInt, protect: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwAllocateVirtualMemoryEx(processhandle: Handle, baseaddress: COpaquePointer?, regionsize: COpaquePointer?, allocationtype: UInt, pageprotection: UInt, extendedparameters: COpaquePointer?, extendedparametercount: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwCancelIoFileEx(filehandle: Handle, iorequesttocancel: COpaquePointer?, iostatusblock: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwCloseObjectAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, generateonclose: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwCreateDirectoryObject(directoryhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwCreateEvent(eventhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, eventtype: EventType, initialstate: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwCreateSectionEx(sectionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, maximumsize: COpaquePointer?, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Handle, extendedparameters: COpaquePointer?, extendedparametercount: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwDeleteFile(objectattributes: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwDeleteObjectAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, generateonclose: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwDuplicateObject(sourceprocesshandle: Handle, sourcehandle: Handle, targetprocesshandle: Handle, targethandle: COpaquePointer?, desiredaccess: UInt, handleattributes: UInt, options: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwDuplicateToken(existingtokenhandle: Handle, desiredaccess: UInt, objectattributes: COpaquePointer?, effectiveonly: Boolean, tokentype: TokenType, newtokenhandle: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwFilterToken(existingtokenhandle: Handle, flags: UInt, sidstodisable: COpaquePointer?, privilegestodelete: COpaquePointer?, restrictedsids: COpaquePointer?, newtokenhandle: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwFlushBuffersFile(filehandle: Handle, iostatusblock: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwFlushBuffersFileEx(filehandle: Handle, flags: UInt, parameters: COpaquePointer?, parameterssize: UInt, iostatusblock: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwFlushVirtualMemory(processhandle: Handle, baseaddress: COpaquePointer?, regionsize: COpaquePointer?, iostatus: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwFreeVirtualMemory(processhandle: Handle, baseaddress: COpaquePointer?, regionsize: COpaquePointer?, freetype: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwFsControlFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, fscontrolcode: UInt, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwImpersonateAnonymousToken(threadhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwLockFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, byteoffset: COpaquePointer?, length: COpaquePointer?, key: UInt, failimmediately: Boolean, exclusivelock: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwNotifyChangeKey(keyhandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, completionfilter: UInt, watchtree: Boolean, buffer: COpaquePointer?, buffersize: UInt, asynchronous: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwOpenDirectoryObject(directoryhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwOpenObjectAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, objecttypename: COpaquePointer?, objectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, grantedaccess: UInt, privileges: COpaquePointer?, objectcreation: Boolean, accessgranted: Boolean, generateonclose: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwOpenProcessToken(processhandle: Handle, desiredaccess: UInt, tokenhandle: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwOpenProcessTokenEx(processhandle: Handle, desiredaccess: UInt, handleattributes: UInt, tokenhandle: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwOpenThreadToken(threadhandle: Handle, desiredaccess: UInt, openasself: Boolean, tokenhandle: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwOpenThreadTokenEx(threadhandle: Handle, desiredaccess: UInt, openasself: Boolean, handleattributes: UInt, tokenhandle: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwPrivilegeCheck(clienttoken: Handle, requiredprivileges: COpaquePointer?, result: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwPrivilegeObjectAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, clienttoken: Handle, desiredaccess: UInt, privileges: COpaquePointer?, accessgranted: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwPrivilegedServiceAuditAlarm(subsystemname: COpaquePointer?, servicename: COpaquePointer?, clienttoken: Handle, privileges: COpaquePointer?, accessgranted: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwQueryDirectoryFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass, returnsingleentry: Boolean, filename: COpaquePointer?, restartscan: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwQueryDirectoryFileEx(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass, queryflags: UInt, filename: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwQueryDirectoryObject(directoryhandle: Handle, buffer: COpaquePointer?, length: UInt, returnsingleentry: Boolean, restartscan: Boolean, context: COpaquePointer?, returnlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwQueryEaFile(filehandle: Handle, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt, returnsingleentry: Boolean, ealist: COpaquePointer?, ealistlength: UInt, eaindex: COpaquePointer?, restartscan: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwQueryFullAttributesFile(objectattributes: COpaquePointer?, fileinformation: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwQueryInformationToken(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: COpaquePointer?, tokeninformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwQueryObject(handle: Handle, objectinformationclass: ObjectInformationClass, objectinformation: COpaquePointer?, objectinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwQueryQuotaInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt, returnsingleentry: Boolean, sidlist: COpaquePointer?, sidlistlength: UInt, startsid: Psid, restartscan: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwQuerySecurityObject(handle: Handle, securityinformation: UInt, securitydescriptor: PsecurityDescriptor, length: UInt, lengthneeded: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwQueryVirtualMemory(processhandle: Handle, baseaddress: COpaquePointer?, memoryinformationclass: MemoryInformationClass, memoryinformation: COpaquePointer?, memoryinformationlength: ULong, returnlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwQueryVolumeInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, fsinformation: COpaquePointer?, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwSetEaFile(filehandle: Handle, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwSetEvent(eventhandle: Handle, previousstate: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwSetInformationToken(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: COpaquePointer?, tokeninformationlength: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwSetInformationVirtualMemory(processhandle: Handle, vminformationclass: VirtualMemoryInformationClass, numberofentries: ULong, virtualaddresses: COpaquePointer?, vminformation: COpaquePointer?, vminformationlength: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwSetQuotaInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwSetSecurityObject(handle: Handle, securityinformation: UInt, securitydescriptor: PsecurityDescriptor): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwSetVolumeInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, fsinformation: COpaquePointer?, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwUnlockFile(filehandle: Handle, iostatusblock: COpaquePointer?, byteoffset: COpaquePointer?, length: COpaquePointer?, key: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
