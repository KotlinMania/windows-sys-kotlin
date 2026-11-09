@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DRIVER_FS_NOTIFICATION
import io.github.kotlinmania.windowssys.windows.wdk.foundation.KSPIN_LOCK_QUEUE_NUMBER
import io.github.kotlinmania.windowssys.windows.wdk.foundation.OBJECT_INFORMATION_CLASS
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PEPROCESS
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PESILO
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PETHREAD
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PKTHREAD
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PNOTIFY_SYNC
import io.github.kotlinmania.windowssys.windows.wdk.foundation.POBJECT_TYPE
import io.github.kotlinmania.windowssys.windows.wdk.foundation.POOL_TYPE
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PRKPROCESS
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.foundation.UNICODE_STRING
import io.github.kotlinmania.windowssys.windows.win32.security.AUDIT_EVENT_TYPE
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR
import io.github.kotlinmania.windowssys.windows.win32.security.PSID
import io.github.kotlinmania.windowssys.windows.win32.security.SECURITY_IMPERSONATION_LEVEL
import io.github.kotlinmania.windowssys.windows.win32.security.TOKEN_INFORMATION_CLASS
import io.github.kotlinmania.windowssys.windows.win32.security.TOKEN_TYPE
import io.github.kotlinmania.windowssys.windows.win32.security.WELL_KNOWN_SID_TYPE
import io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.SEC_GET_KEY_FN
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FILE_ACCESS_RIGHTS
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FILE_FLAGS_AND_ATTRIBUTES
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FILE_SHARE_MODE
import io.github.kotlinmania.windowssys.windows.win32.system.io.PIO_APC_ROUTINE
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.EVENT_TYPE
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.STRING
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.WAIT_TYPE

public actual fun ApplyControlToken(phcontext: Long, pinput: Long): HRESULT =
    0

public actual fun CcAsyncCopyRead(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, buffer: Long, iostatus: Long, ioissuerthread: PETHREAD, asyncreadcontext: Long): Boolean =
    false

public actual fun CcCanIWrite(fileobject: Long, bytestowrite: UInt, wait: Boolean, retrying: UByte): Boolean =
    false

public actual fun CcCoherencyFlushAndPurgeCache(sectionobjectpointer: Long, fileoffset: Long, length: UInt, iostatus: Long, flags: UInt) {
}

public actual fun CcCopyRead(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, buffer: Long, iostatus: Long): Boolean =
    false

public actual fun CcCopyReadEx(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, buffer: Long, iostatus: Long, ioissuerthread: PETHREAD): Boolean =
    false

public actual fun CcCopyWrite(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, buffer: Long): Boolean =
    false

public actual fun CcCopyWriteEx(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, buffer: Long, ioissuerthread: PETHREAD): Boolean =
    false

public actual fun CcCopyWriteWontFlush(fileobject: Long, fileoffset: Long, length: UInt): Boolean =
    false

public actual fun CcDeferWrite(fileobject: Long, postroutine: PCC_POST_DEFERRED_WRITE, context1: Long, context2: Long, bytestowrite: UInt, retrying: Boolean) {
}

public actual fun CcErrorCallbackRoutine(context: Long): NTSTATUS =
    0

public actual fun CcFastCopyRead(fileobject: Long, fileoffset: UInt, length: UInt, pagecount: UInt, buffer: Long, iostatus: Long) {
}

public actual fun CcFastCopyWrite(fileobject: Long, fileoffset: UInt, length: UInt, buffer: Long) {
}

public actual fun CcFlushCache(sectionobjectpointer: Long, fileoffset: Long, length: UInt, iostatus: Long) {
}

public actual fun CcGetDirtyPages(loghandle: Long, dirtypageroutine: PDIRTY_PAGE_ROUTINE, context1: Long, context2: Long): Long =
    0L

public actual fun CcGetFileObjectFromBcb(bcb: Long): Long =
    0L

public actual fun CcGetFileObjectFromSectionPtrs(sectionobjectpointer: Long): Long =
    0L

public actual fun CcGetFileObjectFromSectionPtrsRef(sectionobjectpointer: Long): Long =
    0L

public actual fun CcGetFlushedValidData(sectionobjectpointer: Long, bcblistheld: Boolean): Long =
    0L

public actual fun CcInitializeCacheMap(fileobject: Long, filesizes: Long, pinaccess: Boolean, callbacks: Long, lazywritecontext: Long) {
}

public actual fun CcInitializeCacheMapEx(fileobject: Long, filesizes: Long, pinaccess: Boolean, callbacks: Long, lazywritecontext: Long, flags: UInt) {
}

public actual fun CcIsCacheManagerCallbackNeeded(status: NTSTATUS): Boolean =
    false

public actual fun CcIsThereDirtyData(vpb: Long): Boolean =
    false

public actual fun CcIsThereDirtyDataEx(vpb: Long, numberofdirtypages: Long): Boolean =
    false

public actual fun CcMapData(fileobject: Long, fileoffset: Long, length: UInt, flags: UInt, bcb: Long, buffer: Long): Boolean =
    false

public actual fun CcMdlRead(fileobject: Long, fileoffset: Long, length: UInt, mdlchain: Long, iostatus: Long) {
}

public actual fun CcMdlReadComplete(fileobject: Long, mdlchain: Long) {
}

public actual fun CcMdlWriteAbort(fileobject: Long, mdlchain: Long) {
}

public actual fun CcMdlWriteComplete(fileobject: Long, fileoffset: Long, mdlchain: Long) {
}

public actual fun CcPinMappedData(fileobject: Long, fileoffset: Long, length: UInt, flags: UInt, bcb: Long): Boolean =
    false

public actual fun CcPinRead(fileobject: Long, fileoffset: Long, length: UInt, flags: UInt, bcb: Long, buffer: Long): Boolean =
    false

public actual fun CcPrepareMdlWrite(fileobject: Long, fileoffset: Long, length: UInt, mdlchain: Long, iostatus: Long) {
}

public actual fun CcPreparePinWrite(fileobject: Long, fileoffset: Long, length: UInt, zero: Boolean, flags: UInt, bcb: Long, buffer: Long): Boolean =
    false

public actual fun CcPurgeCacheSection(sectionobjectpointer: Long, fileoffset: Long, length: UInt, flags: UInt): Boolean =
    false

public actual fun CcRemapBcb(bcb: Long): Long =
    0L

public actual fun CcRepinBcb(bcb: Long) {
}

public actual fun CcScheduleReadAhead(fileobject: Long, fileoffset: Long, length: UInt) {
}

public actual fun CcScheduleReadAheadEx(fileobject: Long, fileoffset: Long, length: UInt, ioissuerthread: PETHREAD) {
}

public actual fun CcSetAdditionalCacheAttributes(fileobject: Long, disablereadahead: Boolean, disablewritebehind: Boolean) {
}

public actual fun CcSetAdditionalCacheAttributesEx(fileobject: Long, flags: UInt) {
}

public actual fun CcSetBcbOwnerPointer(bcb: Long, ownerpointer: Long) {
}

public actual fun CcSetDirtyPageThreshold(fileobject: Long, dirtypagethreshold: UInt) {
}

public actual fun CcSetDirtyPinnedData(bcbvoid: Long, lsn: Long) {
}

public actual fun CcSetFileSizes(fileobject: Long, filesizes: Long) {
}

public actual fun CcSetFileSizesEx(fileobject: Long, filesizes: Long): NTSTATUS =
    0

public actual fun CcSetLogHandleForFile(fileobject: Long, loghandle: Long, flushtolsnroutine: PFLUSH_TO_LSN) {
}

public actual fun CcSetParallelFlushFile(fileobject: Long, enableparallelflush: Boolean) {
}

public actual fun CcSetReadAheadGranularity(fileobject: Long, granularity: UInt) {
}

public actual fun CcUninitializeCacheMap(fileobject: Long, truncatesize: Long, uninitializeevent: Long): Boolean =
    false

public actual fun CcUnpinData(bcb: Long) {
}

public actual fun CcUnpinDataForThread(bcb: Long, resourcethreadid: ULong) {
}

public actual fun CcUnpinRepinnedBcb(bcb: Long, writethrough: Boolean, iostatus: Long) {
}

public actual fun CcWaitForCurrentLazyWriterActivity(): NTSTATUS =
    0

public actual fun CcZeroData(fileobject: Long, startoffset: Long, endoffset: Long, wait: Boolean): Boolean =
    false

public actual fun CompleteAuthToken(phcontext: Long, ptoken: Long): HRESULT =
    0

public actual fun ExDisableResourceBoostLite(resource: Long) {
}

public actual fun ExQueryPoolBlockSize(poolblock: Long, quotacharged: Long): ULong =
    0uL

public actual fun ExportSecurityContext(phcontext: Long, fflags: UInt, ppackedcontext: Long, ptoken: Long): HRESULT =
    0

public actual fun FsRtlAcknowledgeEcp(ecpcontext: Long) {
}

public actual fun FsRtlAcquireFileExclusive(fileobject: Long) {
}

public actual fun FsRtlAddBaseMcbEntry(mcb: Long, vbn: Long, lbn: Long, sectorcount: Long): Boolean =
    false

public actual fun FsRtlAddBaseMcbEntryEx(mcb: Long, vbn: Long, lbn: Long, sectorcount: Long): NTSTATUS =
    0

public actual fun FsRtlAddLargeMcbEntry(mcb: Long, vbn: Long, lbn: Long, sectorcount: Long): Boolean =
    false

public actual fun FsRtlAddMcbEntry(mcb: Long, vbn: UInt, lbn: UInt, sectorcount: UInt): Boolean =
    false

public actual fun FsRtlAddToTunnelCache(cache: Long, directorykey: ULong, shortname: Long, longname: Long, keybyshortname: Boolean, datalength: UInt, data: Long) {
}

public actual fun FsRtlAddToTunnelCacheEx(cache: Long, directorykey: ULong, shortname: Long, longname: Long, flags: UInt, datalength: UInt, data: Long) {
}

public actual fun FsRtlAllocateAePushLock(pooltype: POOL_TYPE, tag: UInt): Long =
    0L

public actual fun FsRtlAllocateExtraCreateParameter(ecptype: Long, sizeofcontext: UInt, flags: UInt, cleanupcallback: PFSRTL_EXTRA_CREATE_PARAMETER_CLEANUP_CALLBACK, pooltag: UInt, ecpcontext: Long): NTSTATUS =
    0

public actual fun FsRtlAllocateExtraCreateParameterFromLookasideList(ecptype: Long, sizeofcontext: UInt, flags: UInt, cleanupcallback: PFSRTL_EXTRA_CREATE_PARAMETER_CLEANUP_CALLBACK, lookasidelist: Long, ecpcontext: Long): NTSTATUS =
    0

public actual fun FsRtlAllocateExtraCreateParameterList(flags: UInt, ecplist: Long): NTSTATUS =
    0

public actual fun FsRtlAllocateFileLock(completelockirproutine: PCOMPLETE_LOCK_IRP_ROUTINE, unlockroutine: PUNLOCK_ROUTINE): Long =
    0L

public actual fun FsRtlAllocateResource(): Long =
    0L

public actual fun FsRtlAreNamesEqual(constantnamea: Long, constantnameb: Long, ignorecase: Boolean, upcasetable: Long): Boolean =
    false

public actual fun FsRtlAreThereCurrentOrInProgressFileLocks(filelock: Long): Boolean =
    false

public actual fun FsRtlAreThereWaitingFileLocks(filelock: Long): Boolean =
    false

public actual fun FsRtlAreVolumeStartupApplicationsComplete(): Boolean =
    false

public actual fun FsRtlBalanceReads(targetdevice: Long): NTSTATUS =
    0

public actual fun FsRtlCancellableWaitForMultipleObjects(count: UInt, objectarray: Long, waittype: WAIT_TYPE, timeout: Long, waitblockarray: Long, irp: Long): NTSTATUS =
    0

public actual fun FsRtlCancellableWaitForSingleObject(obj: Long, timeout: Long, irp: Long): NTSTATUS =
    0

public actual fun FsRtlChangeBackingFileObject(currentfileobject: Long, newfileobject: Long, changebackingtype: FSRTL_CHANGE_BACKING_TYPE, flags: UInt): NTSTATUS =
    0

public actual fun FsRtlCheckLockForOplockRequest(filelock: Long, allocationsize: Long): Boolean =
    false

public actual fun FsRtlCheckLockForReadAccess(filelock: Long, irp: Long): Boolean =
    false

public actual fun FsRtlCheckLockForWriteAccess(filelock: Long, irp: Long): Boolean =
    false

public actual fun FsRtlCheckOplock(oplock: Long, irp: Long, context: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP): NTSTATUS =
    0

public actual fun FsRtlCheckOplockEx(oplock: Long, irp: Long, flags: UInt, context: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP): NTSTATUS =
    0

public actual fun FsRtlCheckOplockEx2(oplock: Long, irp: Long, flags: UInt, flagsex2: UInt, completionroutinecontext: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP, timeout: ULong, notifycontext: Long, notifyroutine: POPLOCK_NOTIFY_ROUTINE): NTSTATUS =
    0

public actual fun FsRtlCheckUpperOplock(oplock: Long, newloweroplockstate: UInt, completionroutinecontext: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, prependroutine: POPLOCK_FS_PREPOST_IRP, flags: UInt): NTSTATUS =
    0

public actual fun FsRtlCopyRead(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, lockkey: UInt, buffer: Long, iostatus: Long, deviceobject: Long): Boolean =
    false

public actual fun FsRtlCopyWrite(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, lockkey: UInt, buffer: Long, iostatus: Long, deviceobject: Long): Boolean =
    false

public actual fun FsRtlCreateSectionForDataScan(sectionhandle: Long, sectionobject: Long, sectionfilesize: Long, fileobject: Long, desiredaccess: UInt, objectattributes: Long, maximumsize: Long, sectionpageprotection: UInt, allocationattributes: UInt, flags: UInt): NTSTATUS =
    0

public actual fun FsRtlCurrentBatchOplock(oplock: Long): Boolean =
    false

public actual fun FsRtlCurrentOplock(oplock: Long): Boolean =
    false

public actual fun FsRtlCurrentOplockH(oplock: Long): Boolean =
    false

public actual fun FsRtlDeleteExtraCreateParameterLookasideList(lookaside: Long, flags: UInt) {
}

public actual fun FsRtlDeleteKeyFromTunnelCache(cache: Long, directorykey: ULong) {
}

public actual fun FsRtlDeleteTunnelCache(cache: Long) {
}

public actual fun FsRtlDeregisterUncProvider(handle: HANDLE) {
}

public actual fun FsRtlDismountComplete(deviceobject: Long, dismountstatus: NTSTATUS) {
}

public actual fun FsRtlDissectDbcs(path: STRING, firstname: Long, remainingname: Long) {
}

public actual fun FsRtlDissectName(path: UNICODE_STRING, firstname: Long, remainingname: Long) {
}

public actual fun FsRtlDoesDbcsContainWildCards(name: Long): Boolean =
    false

public actual fun FsRtlDoesNameContainWildCards(name: Long): Boolean =
    false

public actual fun FsRtlFastCheckLockForRead(filelock: Long, startingbyte: Long, length: Long, key: UInt, fileobject: Long, processid: Long): Boolean =
    false

public actual fun FsRtlFastCheckLockForWrite(filelock: Long, startingbyte: Long, length: Long, key: UInt, fileobject: Long, processid: Long): Boolean =
    false

public actual fun FsRtlFastUnlockAll(filelock: Long, fileobject: Long, processid: PEPROCESS, context: Long): NTSTATUS =
    0

public actual fun FsRtlFastUnlockAllByKey(filelock: Long, fileobject: Long, processid: PEPROCESS, key: UInt, context: Long): NTSTATUS =
    0

public actual fun FsRtlFastUnlockSingle(filelock: Long, fileobject: Long, fileoffset: Long, length: Long, processid: PEPROCESS, key: UInt, context: Long, alreadysynchronized: Boolean): NTSTATUS =
    0

public actual fun FsRtlFindExtraCreateParameter(ecplist: Long, ecptype: Long, ecpcontext: Long, ecpcontextsize: Long): NTSTATUS =
    0

public actual fun FsRtlFindInTunnelCache(cache: Long, directorykey: ULong, name: Long, shortname: Long, longname: Long, datalength: Long, data: Long): Boolean =
    false

public actual fun FsRtlFindInTunnelCacheEx(cache: Long, directorykey: ULong, name: Long, shortname: Long, longname: Long, flags: UInt, datalength: Long, data: Long): Boolean =
    false

public actual fun FsRtlFreeAePushLock(aepushlock: Long) {
}

public actual fun FsRtlFreeExtraCreateParameter(ecpcontext: Long) {
}

public actual fun FsRtlFreeExtraCreateParameterList(ecplist: Long) {
}

public actual fun FsRtlFreeFileLock(filelock: Long) {
}

public actual fun FsRtlGetCurrentProcessLoaderList(): Long =
    0L

public actual fun FsRtlGetEcpListFromIrp(irp: Long, ecplist: Long): NTSTATUS =
    0

public actual fun FsRtlGetFileSize(fileobject: Long, filesize: Long): NTSTATUS =
    0

public actual fun FsRtlGetNextBaseMcbEntry(mcb: Long, runindex: UInt, vbn: Long, lbn: Long, sectorcount: Long): Boolean =
    false

public actual fun FsRtlGetNextExtraCreateParameter(ecplist: Long, currentecpcontext: Long, nextecptype: Long, nextecpcontext: Long, nextecpcontextsize: Long): NTSTATUS =
    0

public actual fun FsRtlGetNextFileLock(filelock: Long, restart: Boolean): Long =
    0L

public actual fun FsRtlGetNextLargeMcbEntry(mcb: Long, runindex: UInt, vbn: Long, lbn: Long, sectorcount: Long): Boolean =
    false

public actual fun FsRtlGetNextMcbEntry(mcb: Long, runindex: UInt, vbn: Long, lbn: Long, sectorcount: Long): Boolean =
    false

public actual fun FsRtlGetSectorSizeInformation(deviceobject: Long, sectorsizeinfo: Long): NTSTATUS =
    0

public actual fun FsRtlGetSupportedFeatures(deviceobject: Long, supportedfeatures: Long): NTSTATUS =
    0

public actual fun FsRtlGetVirtualDiskNestingLevel(deviceobject: Long, nestinglevel: Long, nestingflags: Long): NTSTATUS =
    0

public actual fun FsRtlIncrementCcFastMdlReadWait() {
}

public actual fun FsRtlIncrementCcFastReadNoWait() {
}

public actual fun FsRtlIncrementCcFastReadNotPossible() {
}

public actual fun FsRtlIncrementCcFastReadResourceMiss() {
}

public actual fun FsRtlIncrementCcFastReadWait() {
}

public actual fun FsRtlInitExtraCreateParameterLookasideList(lookaside: Long, flags: UInt, size: ULong, tag: UInt) {
}

public actual fun FsRtlInitializeBaseMcb(mcb: Long, pooltype: POOL_TYPE) {
}

public actual fun FsRtlInitializeBaseMcbEx(mcb: Long, pooltype: POOL_TYPE, flags: UShort): Boolean =
    false

public actual fun FsRtlInitializeExtraCreateParameter(ecp: Long, ecpflags: UInt, cleanupcallback: PFSRTL_EXTRA_CREATE_PARAMETER_CLEANUP_CALLBACK, totalsize: UInt, ecptype: Long, listallocatedfrom: Long) {
}

public actual fun FsRtlInitializeExtraCreateParameterList(ecplist: Long): NTSTATUS =
    0

public actual fun FsRtlInitializeFileLock(filelock: Long, completelockirproutine: PCOMPLETE_LOCK_IRP_ROUTINE, unlockroutine: PUNLOCK_ROUTINE) {
}

public actual fun FsRtlInitializeLargeMcb(mcb: Long, pooltype: POOL_TYPE) {
}

public actual fun FsRtlInitializeMcb(mcb: Long, pooltype: POOL_TYPE) {
}

public actual fun FsRtlInitializeOplock(oplock: Long) {
}

public actual fun FsRtlInitializeTunnelCache(cache: Long) {
}

public actual fun FsRtlInsertExtraCreateParameter(ecplist: Long, ecpcontext: Long): NTSTATUS =
    0

public actual fun FsRtlInsertPerFileContext(perfilecontextpointer: Long, ptr: Long): NTSTATUS =
    0

public actual fun FsRtlInsertPerFileObjectContext(fileobject: Long, ptr: Long): NTSTATUS =
    0

public actual fun FsRtlInsertPerStreamContext(perstreamcontext: Long, ptr: Long): NTSTATUS =
    0

public actual fun FsRtlIs32BitProcess(process: PEPROCESS): Boolean =
    false

public actual fun FsRtlIsDaxVolume(fileobject: Long): Boolean =
    false

public actual fun FsRtlIsDbcsInExpression(expression: Long, name: Long): Boolean =
    false

public actual fun FsRtlIsEcpAcknowledged(ecpcontext: Long): Boolean =
    false

public actual fun FsRtlIsEcpFromUserMode(ecpcontext: Long): Boolean =
    false

public actual fun FsRtlIsExtentDangling(startpage: UInt, numberofpages: UInt, flags: UInt): UInt =
    0u

public actual fun FsRtlIsFatDbcsLegal(dbcsname: STRING, wildcardspermissible: Boolean, pathnamepermissible: Boolean, leadingbackslashpermissible: Boolean): Boolean =
    false

public actual fun FsRtlIsHpfsDbcsLegal(dbcsname: STRING, wildcardspermissible: Boolean, pathnamepermissible: Boolean, leadingbackslashpermissible: Boolean): Boolean =
    false

public actual fun FsRtlIsMobileOS(): Boolean =
    false

public actual fun FsRtlIsNameInExpression(expression: Long, name: Long, ignorecase: Boolean, upcasetable: PCWSTR): Boolean =
    false

public actual fun FsRtlIsNameInUnUpcasedExpression(expression: Long, name: Long, ignorecase: Boolean, upcasetable: PCWSTR): Boolean =
    false

public actual fun FsRtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag: UInt): Boolean =
    false

public actual fun FsRtlIsNtstatusExpected(exception: NTSTATUS): Boolean =
    false

public actual fun FsRtlIsPagingFile(fileobject: Long): UInt =
    0u

public actual fun FsRtlIsSystemPagingFile(fileobject: Long): UInt =
    0u

public actual fun FsRtlIssueDeviceIoControl(deviceobject: Long, ioctl: UInt, flags: UByte, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt, iosbinformation: Long): NTSTATUS =
    0

public actual fun FsRtlKernelFsControlFile(fileobject: Long, fscontrolcode: UInt, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt, retoutputbuffersize: Long): NTSTATUS =
    0

public actual fun FsRtlLogCcFlushError(filename: Long, deviceobject: Long, sectionobjectpointer: Long, flusherror: NTSTATUS, flags: UInt): NTSTATUS =
    0

public actual fun FsRtlLookupBaseMcbEntry(mcb: Long, vbn: Long, lbn: Long, sectorcountfromlbn: Long, startinglbn: Long, sectorcountfromstartinglbn: Long, index: Long): Boolean =
    false

public actual fun FsRtlLookupLargeMcbEntry(mcb: Long, vbn: Long, lbn: Long, sectorcountfromlbn: Long, startinglbn: Long, sectorcountfromstartinglbn: Long, index: Long): Boolean =
    false

public actual fun FsRtlLookupLastBaseMcbEntry(mcb: Long, vbn: Long, lbn: Long): Boolean =
    false

public actual fun FsRtlLookupLastBaseMcbEntryAndIndex(opaquemcb: Long, largevbn: Long, largelbn: Long, index: Long): Boolean =
    false

public actual fun FsRtlLookupLastLargeMcbEntry(mcb: Long, vbn: Long, lbn: Long): Boolean =
    false

public actual fun FsRtlLookupLastLargeMcbEntryAndIndex(opaquemcb: Long, largevbn: Long, largelbn: Long, index: Long): Boolean =
    false

public actual fun FsRtlLookupLastMcbEntry(mcb: Long, vbn: Long, lbn: Long): Boolean =
    false

public actual fun FsRtlLookupMcbEntry(mcb: Long, vbn: UInt, lbn: Long, sectorcount: Long, index: Long): Boolean =
    false

public actual fun FsRtlLookupPerFileContext(perfilecontextpointer: Long, ownerid: Long, instanceid: Long): Long =
    0L

public actual fun FsRtlLookupPerFileObjectContext(fileobject: Long, ownerid: Long, instanceid: Long): Long =
    0L

public actual fun FsRtlLookupPerStreamContextInternal(streamcontext: Long, ownerid: Long, instanceid: Long): Long =
    0L

public actual fun FsRtlMdlReadCompleteDev(fileobject: Long, mdlchain: Long, deviceobject: Long): Boolean =
    false

public actual fun FsRtlMdlReadDev(fileobject: Long, fileoffset: Long, length: UInt, lockkey: UInt, mdlchain: Long, iostatus: Long, deviceobject: Long): Boolean =
    false

public actual fun FsRtlMdlReadEx(fileobject: Long, fileoffset: Long, length: UInt, lockkey: UInt, mdlchain: Long, iostatus: Long): NTSTATUS =
    0

public actual fun FsRtlMdlWriteCompleteDev(fileobject: Long, fileoffset: Long, mdlchain: Long, deviceobject: Long): Boolean =
    false

public actual fun FsRtlMupGetProviderIdFromName(pprovidername: Long, pproviderid: Long): NTSTATUS =
    0

public actual fun FsRtlMupGetProviderInfoFromFileObject(pfileobject: Long, level: UInt, pbuffer: Long, pbuffersize: Long): NTSTATUS =
    0

public actual fun FsRtlNormalizeNtstatus(exception: NTSTATUS, genericexception: NTSTATUS): NTSTATUS =
    0

public actual fun FsRtlNotifyCleanup(notifysync: PNOTIFY_SYNC, notifylist: Long, fscontext: Long) {
}

public actual fun FsRtlNotifyCleanupAll(notifysync: PNOTIFY_SYNC, notifylist: Long) {
}

public actual fun FsRtlNotifyFilterChangeDirectory(notifysync: PNOTIFY_SYNC, notifylist: Long, fscontext: Long, fulldirectoryname: Long, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifyirp: Long, traversecallback: PCHECK_FOR_TRAVERSE_ACCESS, subjectcontext: Long, filtercallback: PFILTER_REPORT_CHANGE) {
}

public actual fun FsRtlNotifyFilterReportChange(notifysync: PNOTIFY_SYNC, notifylist: Long, fulltargetname: Long, targetnameoffset: UShort, streamname: Long, normalizedparentname: Long, filtermatch: UInt, action: UInt, targetcontext: Long, filtercontext: Long) {
}

public actual fun FsRtlNotifyFullChangeDirectory(notifysync: PNOTIFY_SYNC, notifylist: Long, fscontext: Long, fulldirectoryname: Long, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifyirp: Long, traversecallback: PCHECK_FOR_TRAVERSE_ACCESS, subjectcontext: Long) {
}

public actual fun FsRtlNotifyFullReportChange(notifysync: PNOTIFY_SYNC, notifylist: Long, fulltargetname: Long, targetnameoffset: UShort, streamname: Long, normalizedparentname: Long, filtermatch: UInt, action: UInt, targetcontext: Long) {
}

public actual fun FsRtlNotifyInitializeSync(notifysync: Long) {
}

public actual fun FsRtlNotifyUninitializeSync(notifysync: Long) {
}

public actual fun FsRtlNotifyVolumeEvent(fileobject: Long, eventcode: UInt): NTSTATUS =
    0

public actual fun FsRtlNotifyVolumeEventEx(fileobject: Long, eventcode: UInt, event: Long): NTSTATUS =
    0

public actual fun FsRtlNumberOfRunsInBaseMcb(mcb: Long): UInt =
    0u

public actual fun FsRtlNumberOfRunsInLargeMcb(mcb: Long): UInt =
    0u

public actual fun FsRtlNumberOfRunsInMcb(mcb: Long): UInt =
    0u

public actual fun FsRtlOplockBreakH(oplock: Long, irp: Long, flags: UInt, context: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP): NTSTATUS =
    0

public actual fun FsRtlOplockBreakH2(oplock: Long, irp: Long, flags: UInt, context: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP, grantedaccess: Long, shareaccess: Long): NTSTATUS =
    0

public actual fun FsRtlOplockBreakToNone(oplock: Long, irpsp: Long, irp: Long, context: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP): NTSTATUS =
    0

public actual fun FsRtlOplockBreakToNoneEx(oplock: Long, irp: Long, flags: UInt, context: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP): NTSTATUS =
    0

public actual fun FsRtlOplockFsctrl(oplock: Long, irp: Long, opencount: UInt): NTSTATUS =
    0

public actual fun FsRtlOplockFsctrlEx(oplock: Long, irp: Long, opencount: UInt, flags: UInt): NTSTATUS =
    0

public actual fun FsRtlOplockGetAnyBreakOwnerProcess(oplock: Long): PEPROCESS =
    0L

public actual fun FsRtlOplockIsFastIoPossible(oplock: Long): Boolean =
    false

public actual fun FsRtlOplockIsSharedRequest(irp: Long): Boolean =
    false

public actual fun FsRtlOplockKeysEqual(fo1: Long, fo2: Long): Boolean =
    false

public actual fun FsRtlPostPagingFileStackOverflow(context: Long, event: Long, stackoverflowroutine: PFSRTL_STACK_OVERFLOW_ROUTINE) {
}

public actual fun FsRtlPostStackOverflow(context: Long, event: Long, stackoverflowroutine: PFSRTL_STACK_OVERFLOW_ROUTINE) {
}

public actual fun FsRtlPrepareMdlWriteDev(fileobject: Long, fileoffset: Long, length: UInt, lockkey: UInt, mdlchain: Long, iostatus: Long, deviceobject: Long): Boolean =
    false

public actual fun FsRtlPrepareMdlWriteEx(fileobject: Long, fileoffset: Long, length: UInt, lockkey: UInt, mdlchain: Long, iostatus: Long): NTSTATUS =
    0

public actual fun FsRtlPrepareToReuseEcp(ecpcontext: Long) {
}

public actual fun FsRtlPrivateLock(filelock: Long, fileobject: Long, fileoffset: Long, length: Long, processid: PEPROCESS, key: UInt, failimmediately: Boolean, exclusivelock: Boolean, iosb: Long, irp: Long, context: Long, alreadysynchronized: Boolean): Boolean =
    false

public actual fun FsRtlProcessFileLock(filelock: Long, irp: Long, context: Long): NTSTATUS =
    0

public actual fun FsRtlQueryCachedVdl(fileobject: Long, vdl: Long): NTSTATUS =
    0

public actual fun FsRtlQueryInformationFile(fileobject: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, retfileinformationsize: Long): NTSTATUS =
    0

public actual fun FsRtlQueryKernelEaFile(fileobject: Long, returnedeadata: Long, length: UInt, returnsingleentry: Boolean, ealist: Long, ealistlength: UInt, eaindex: Long, restartscan: Boolean, lengthreturned: Long): NTSTATUS =
    0

public actual fun FsRtlQueryMaximumVirtualDiskNestingLevel(): UInt =
    0u

public actual fun FsRtlRegisterFileSystemFilterCallbacks(filterdriverobject: Long, callbacks: Long): NTSTATUS =
    0

public actual fun FsRtlRegisterUncProvider(muphandle: Long, redirectordevicename: Long, mailslotssupported: Boolean): NTSTATUS =
    0

public actual fun FsRtlRegisterUncProviderEx(muphandle: Long, redirdevname: Long, deviceobject: Long, flags: UInt): NTSTATUS =
    0

public actual fun FsRtlRegisterUncProviderEx2(redirdevname: Long, deviceobject: Long, registration: Long, muphandle: Long): NTSTATUS =
    0

public actual fun FsRtlReleaseFile(fileobject: Long) {
}

public actual fun FsRtlRemoveBaseMcbEntry(mcb: Long, vbn: Long, sectorcount: Long): Boolean =
    false

public actual fun FsRtlRemoveDotsFromPath(originalstring: PWSTR, pathlength: UShort, newlength: Long): NTSTATUS =
    0

public actual fun FsRtlRemoveExtraCreateParameter(ecplist: Long, ecptype: Long, ecpcontext: Long, ecpcontextsize: Long): NTSTATUS =
    0

public actual fun FsRtlRemoveLargeMcbEntry(mcb: Long, vbn: Long, sectorcount: Long) {
}

public actual fun FsRtlRemoveMcbEntry(mcb: Long, vbn: UInt, sectorcount: UInt) {
}

public actual fun FsRtlRemovePerFileContext(perfilecontextpointer: Long, ownerid: Long, instanceid: Long): Long =
    0L

public actual fun FsRtlRemovePerFileObjectContext(fileobject: Long, ownerid: Long, instanceid: Long): Long =
    0L

public actual fun FsRtlRemovePerStreamContext(streamcontext: Long, ownerid: Long, instanceid: Long): Long =
    0L

public actual fun FsRtlResetBaseMcb(mcb: Long) {
}

public actual fun FsRtlResetLargeMcb(mcb: Long, selfsynchronized: Boolean) {
}

public actual fun FsRtlSetDriverBacking(driverobj: Long, flags: UInt): NTSTATUS =
    0

public actual fun FsRtlSetEcpListIntoIrp(irp: Long, ecplist: Long): NTSTATUS =
    0

public actual fun FsRtlSetKernelEaFile(fileobject: Long, eabuffer: Long, length: UInt): NTSTATUS =
    0

public actual fun FsRtlSplitBaseMcb(mcb: Long, vbn: Long, amount: Long): Boolean =
    false

public actual fun FsRtlSplitLargeMcb(mcb: Long, vbn: Long, amount: Long): Boolean =
    false

public actual fun FsRtlTeardownPerFileContexts(perfilecontextpointer: Long) {
}

public actual fun FsRtlTeardownPerStreamContexts(advancedheader: Long) {
}

public actual fun FsRtlTruncateBaseMcb(mcb: Long, vbn: Long) {
}

public actual fun FsRtlTruncateLargeMcb(mcb: Long, vbn: Long) {
}

public actual fun FsRtlTruncateMcb(mcb: Long, vbn: UInt) {
}

public actual fun FsRtlUninitializeBaseMcb(mcb: Long) {
}

public actual fun FsRtlUninitializeFileLock(filelock: Long) {
}

public actual fun FsRtlUninitializeLargeMcb(mcb: Long) {
}

public actual fun FsRtlUninitializeMcb(mcb: Long) {
}

public actual fun FsRtlUninitializeOplock(oplock: Long) {
}

public actual fun FsRtlUpdateDiskCounters(bytesread: ULong, byteswritten: ULong) {
}

public actual fun FsRtlUpperOplockFsctrl(oplock: Long, irp: Long, opencount: UInt, loweroplockstate: UInt, flags: UInt): NTSTATUS =
    0

public actual fun FsRtlValidateReparsePointBuffer(bufferlength: UInt, reparsebuffer: Long): NTSTATUS =
    0

public actual fun FsRtlVolumeDeviceToCorrelationId(volumedeviceobject: Long, guid: Long): NTSTATUS =
    0

public actual fun GetSecurityUserInfo(logonid: Long, flags: UInt, userinformation: Long): NTSTATUS =
    0

public actual fun IoAcquireVpbSpinLock(irql: Long) {
}

public actual fun IoApplyPriorityInfoThread(inputpriorityinfo: Long, outputpriorityinfo: Long, thread: PETHREAD): NTSTATUS =
    0

public actual fun IoCheckDesiredAccess(desiredaccess: Long, grantedaccess: UInt): NTSTATUS =
    0

public actual fun IoCheckEaBufferValidity(eabuffer: Long, ealength: UInt, erroroffset: Long): NTSTATUS =
    0

public actual fun IoCheckFunctionAccess(grantedaccess: UInt, majorfunction: UByte, minorfunction: UByte, iocontrolcode: UInt, arg1: Long, arg2: Long): NTSTATUS =
    0

public actual fun IoCheckQuerySetFileInformation(fileinformationclass: FILE_INFORMATION_CLASS, length: UInt, setoperation: Boolean): NTSTATUS =
    0

public actual fun IoCheckQuerySetVolumeInformation(fsinformationclass: FS_INFORMATION_CLASS, length: UInt, setoperation: Boolean): NTSTATUS =
    0

public actual fun IoCheckQuotaBufferValidity(quotabuffer: Long, quotalength: UInt, erroroffset: Long): NTSTATUS =
    0

public actual fun IoClearFsTrackOffsetState(irp: Long): NTSTATUS =
    0

public actual fun IoCreateStreamFileObject(fileobject: Long, deviceobject: Long): Long =
    0L

public actual fun IoCreateStreamFileObjectEx(fileobject: Long, deviceobject: Long, filehandle: Long): Long =
    0L

public actual fun IoCreateStreamFileObjectEx2(createoptions: Long, fileobject: Long, deviceobject: Long, streamfileobject: Long, filehandle: Long): NTSTATUS =
    0

public actual fun IoCreateStreamFileObjectLite(fileobject: Long, deviceobject: Long): Long =
    0L

public actual fun IoEnumerateDeviceObjectList(driverobject: Long, deviceobjectlist: Long, deviceobjectlistsize: UInt, actualnumberdeviceobjects: Long): NTSTATUS =
    0

public actual fun IoEnumerateRegisteredFiltersList(driverobjectlist: Long, driverobjectlistsize: UInt, actualnumberdriverobjects: Long): NTSTATUS =
    0

public actual fun IoFastQueryNetworkAttributes(objectattributes: Long, desiredaccess: UInt, openoptions: UInt, iostatus: Long, buffer: Long): Boolean =
    false

public actual fun IoGetAttachedDevice(deviceobject: Long): Long =
    0L

public actual fun IoGetBaseFileSystemDeviceObject(fileobject: Long): Long =
    0L

public actual fun IoGetDeviceAttachmentBaseRef(deviceobject: Long): Long =
    0L

public actual fun IoGetDeviceToVerify(thread: PETHREAD): Long =
    0L

public actual fun IoGetDiskDeviceObject(filesystemdeviceobject: Long, diskdeviceobject: Long): NTSTATUS =
    0

public actual fun IoGetFsTrackOffsetState(irp: Long, retfstrackoffsetblob: Long, rettrackedoffset: Long): NTSTATUS =
    0

public actual fun IoGetLowerDeviceObject(deviceobject: Long): Long =
    0L

public actual fun IoGetOplockKeyContext(fileobject: Long): Long =
    0L

public actual fun IoGetOplockKeyContextEx(fileobject: Long): Long =
    0L

public actual fun IoGetRequestorProcess(irp: Long): PEPROCESS =
    0L

public actual fun IoGetRequestorProcessId(irp: Long): UInt =
    0u

public actual fun IoGetRequestorSessionId(irp: Long, psessionid: Long): NTSTATUS =
    0

public actual fun IoIrpHasFsTrackOffsetExtensionType(irp: Long): Boolean =
    false

public actual fun IoIsOperationSynchronous(irp: Long): Boolean =
    false

public actual fun IoIsSystemThread(thread: PETHREAD): Boolean =
    false

public actual fun IoIsValidNameGraftingBuffer(irp: Long, reparsebuffer: Long): Boolean =
    false

public actual fun IoPageRead(fileobject: Long, memorydescriptorlist: Long, startingoffset: Long, event: Long, iostatusblock: Long): NTSTATUS =
    0

public actual fun IoQueryFileDosDeviceName(fileobject: Long, objectnameinformation: Long): NTSTATUS =
    0

public actual fun IoQueryFileInformation(fileobject: Long, fileinformationclass: FILE_INFORMATION_CLASS, length: UInt, fileinformation: Long, returnedlength: Long): NTSTATUS =
    0

public actual fun IoQueryVolumeInformation(fileobject: Long, fsinformationclass: FS_INFORMATION_CLASS, length: UInt, fsinformation: Long, returnedlength: Long): NTSTATUS =
    0

public actual fun IoQueueThreadIrp(irp: Long) {
}

public actual fun IoRegisterFileSystem(deviceobject: Long) {
}

public actual fun IoRegisterFsRegistrationChange(driverobject: Long, drivernotificationroutine: DRIVER_FS_NOTIFICATION): NTSTATUS =
    0

public actual fun IoRegisterFsRegistrationChangeMountAware(driverobject: Long, drivernotificationroutine: DRIVER_FS_NOTIFICATION, synchronizewithmounts: Boolean): NTSTATUS =
    0

public actual fun IoReleaseVpbSpinLock(irql: UByte) {
}

public actual fun IoReplaceFileObjectName(fileobject: Long, newfilename: PCWSTR, filenamelength: UShort): NTSTATUS =
    0

public actual fun IoRequestDeviceRemovalForReset(physicaldeviceobject: Long, flags: UInt): NTSTATUS =
    0

public actual fun IoRetrievePriorityInfo(irp: Long, fileobject: Long, thread: PETHREAD, priorityinfo: Long): NTSTATUS =
    0

public actual fun IoSetDeviceToVerify(thread: PETHREAD, deviceobject: Long) {
}

public actual fun IoSetFsTrackOffsetState(irp: Long, fstrackoffsetblob: Long, trackedoffset: Long): NTSTATUS =
    0

public actual fun IoSetInformation(fileobject: Long, fileinformationclass: FILE_INFORMATION_CLASS, length: UInt, fileinformation: Long): NTSTATUS =
    0

public actual fun IoSynchronousPageWrite(fileobject: Long, memorydescriptorlist: Long, startingoffset: Long, event: Long, iostatusblock: Long): NTSTATUS =
    0

public actual fun IoThreadToProcess(thread: PETHREAD): PEPROCESS =
    0L

public actual fun IoUnregisterFileSystem(deviceobject: Long) {
}

public actual fun IoUnregisterFsRegistrationChange(driverobject: Long, drivernotificationroutine: DRIVER_FS_NOTIFICATION) {
}

public actual fun IoVerifyVolume(deviceobject: Long, allowrawmount: Boolean): NTSTATUS =
    0

public actual fun KeAcquireQueuedSpinLock(number: KSPIN_LOCK_QUEUE_NUMBER): UByte =
    0u

public actual fun KeAcquireSpinLockRaiseToSynch(spinlock: Long): UByte =
    0u

public actual fun KeAttachProcess(process: PRKPROCESS) {
}

public actual fun KeDetachProcess() {
}

public actual fun KeInitializeMutant(mutant: Long, initialowner: Boolean) {
}

public actual fun KeInitializeQueue(queue: Long, count: UInt) {
}

public actual fun KeInsertHeadQueue(queue: Long, entry: Long): Int =
    0

public actual fun KeInsertQueue(queue: Long, entry: Long): Int =
    0

public actual fun KeReadStateMutant(mutant: Long): Int =
    0

public actual fun KeReadStateQueue(queue: Long): Int =
    0

public actual fun KeReleaseMutant(mutant: Long, increment: Int, abandoned: Boolean, wait: Boolean): Int =
    0

public actual fun KeReleaseQueuedSpinLock(number: KSPIN_LOCK_QUEUE_NUMBER, oldirql: UByte) {
}

public actual fun KeRemoveQueue(queue: Long, waitmode: Byte, timeout: Long): Long =
    0L

public actual fun KeRemoveQueueEx(queue: Long, waitmode: Byte, alertable: Boolean, timeout: Long, entryarray: Long, count: UInt): UInt =
    0u

public actual fun KeRundownQueue(queue: Long): Long =
    0L

public actual fun KeSetIdealProcessorThread(thread: PKTHREAD, processor: UByte): UByte =
    0u

public actual fun KeSetKernelStackSwapEnable(enable: Boolean): Boolean =
    false

public actual fun KeStackAttachProcess(process: PRKPROCESS, apcstate: Long) {
}

public actual fun KeTryToAcquireQueuedSpinLock(number: KSPIN_LOCK_QUEUE_NUMBER, oldirql: Long): UInt =
    0u

public actual fun KeUnstackDetachProcess(apcstate: Long) {
}

public actual fun MakeSignature(phcontext: Long, fqop: UInt, pmessage: Long, messageseqno: UInt): HRESULT =
    0

public actual fun MapSecurityError(secstatus: HRESULT): NTSTATUS =
    0

public actual fun MmCanFileBeTruncated(sectionpointer: Long, newfilesize: Long): Boolean =
    false

public actual fun MmDoesFileHaveUserWritableReferences(sectionpointer: Long): UInt =
    0u

public actual fun MmFlushImageSection(sectionobjectpointer: Long, flushtype: MMFLUSH_TYPE): Boolean =
    false

public actual fun MmForceSectionClosed(sectionobjectpointer: Long, delayclose: Boolean): Boolean =
    false

public actual fun MmForceSectionClosedEx(sectionobjectpointer: Long, forcecloseflags: UInt): Boolean =
    false

public actual fun MmGetMaximumFileSectionSize(): ULong =
    0uL

public actual fun MmIsFileSectionActive(fssectionpointer: Long, flags: UInt, sectionisactive: Long): NTSTATUS =
    0

public actual fun MmIsRecursiveIoFault(): Boolean =
    false

public actual fun MmMdlPagesAreZero(mdl: Long): UInt =
    0u

public actual fun MmPrefetchPages(numberoflists: UInt, readlists: Long): NTSTATUS =
    0

public actual fun MmSetAddressRangeModified(address: Long, length: ULong): Boolean =
    false

public actual fun NtAccessCheckAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, desiredaccess: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS =
    0

public actual fun NtAccessCheckByTypeAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS =
    0

public actual fun NtAccessCheckByTypeResultListAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS =
    0

public actual fun NtAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname: Long, handleid: Long, clienttoken: HANDLE, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS =
    0

public actual fun NtAdjustGroupsToken(tokenhandle: HANDLE, resettodefault: Boolean, newstate: Long, bufferlength: UInt, previousstate: Long, returnlength: Long): NTSTATUS =
    0

public actual fun NtAdjustPrivilegesToken(tokenhandle: HANDLE, disableallprivileges: Boolean, newstate: Long, bufferlength: UInt, previousstate: Long, returnlength: Long): NTSTATUS =
    0

public actual fun NtAllocateVirtualMemory(processhandle: HANDLE, baseaddress: Long, zerobits: ULong, regionsize: Long, allocationtype: UInt, protect: UInt): NTSTATUS =
    0

public actual fun NtAllocateVirtualMemoryEx(processhandle: HANDLE, baseaddress: Long, regionsize: Long, allocationtype: UInt, pageprotection: UInt, extendedparameters: Long, extendedparametercount: UInt): NTSTATUS =
    0

public actual fun NtCancelIoFileEx(filehandle: HANDLE, iorequesttocancel: Long, iostatusblock: Long): NTSTATUS =
    0

public actual fun NtCloseObjectAuditAlarm(subsystemname: Long, handleid: Long, generateonclose: Boolean): NTSTATUS =
    0

public actual fun NtCreateDirectoryObject(directoryhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    0

public actual fun NtCreateEvent(eventhandle: Long, desiredaccess: UInt, objectattributes: Long, eventtype: EVENT_TYPE, initialstate: Boolean): NTSTATUS =
    0

public actual fun NtCreateFile(filehandle: Long, desiredaccess: FILE_ACCESS_RIGHTS, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: FILE_FLAGS_AND_ATTRIBUTES, shareaccess: FILE_SHARE_MODE, createdisposition: NTCREATEFILE_CREATE_DISPOSITION, createoptions: NTCREATEFILE_CREATE_OPTIONS, eabuffer: Long, ealength: UInt): NTSTATUS =
    0

public actual fun NtCreateSection(sectionhandle: Long, desiredaccess: UInt, objectattributes: Long, maximumsize: Long, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: HANDLE): NTSTATUS =
    0

public actual fun NtCreateSectionEx(sectionhandle: Long, desiredaccess: UInt, objectattributes: Long, maximumsize: Long, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: HANDLE, extendedparameters: Long, extendedparametercount: UInt): NTSTATUS =
    0

public actual fun NtDeleteFile(objectattributes: Long): NTSTATUS =
    0

public actual fun NtDeleteObjectAuditAlarm(subsystemname: Long, handleid: Long, generateonclose: Boolean): NTSTATUS =
    0

public actual fun NtDuplicateObject(sourceprocesshandle: HANDLE, sourcehandle: HANDLE, targetprocesshandle: HANDLE, targethandle: Long, desiredaccess: UInt, handleattributes: UInt, options: UInt): NTSTATUS =
    0

public actual fun NtDuplicateToken(existingtokenhandle: HANDLE, desiredaccess: UInt, objectattributes: Long, effectiveonly: Boolean, tokentype: TOKEN_TYPE, newtokenhandle: Long): NTSTATUS =
    0

public actual fun NtFilterToken(existingtokenhandle: HANDLE, flags: UInt, sidstodisable: Long, privilegestodelete: Long, restrictedsids: Long, newtokenhandle: Long): NTSTATUS =
    0

public actual fun NtFlushBuffersFile(filehandle: HANDLE, iostatusblock: Long): NTSTATUS =
    0

public actual fun NtFlushBuffersFileEx(filehandle: HANDLE, flags: UInt, parameters: Long, parameterssize: UInt, iostatusblock: Long): NTSTATUS =
    0

public actual fun NtFlushVirtualMemory(processhandle: HANDLE, baseaddress: Long, regionsize: Long, iostatus: Long): NTSTATUS =
    0

public actual fun NtFreeVirtualMemory(processhandle: HANDLE, baseaddress: Long, regionsize: Long, freetype: UInt): NTSTATUS =
    0

public actual fun NtFsControlFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, fscontrolcode: UInt, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt): NTSTATUS =
    0

public actual fun NtImpersonateAnonymousToken(threadhandle: HANDLE): NTSTATUS =
    0

public actual fun NtLockFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, byteoffset: Long, length: Long, key: UInt, failimmediately: Boolean, exclusivelock: Boolean): NTSTATUS =
    0

public actual fun NtNotifyChangeKey(keyhandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, completionfilter: UInt, watchtree: Boolean, buffer: Long, buffersize: UInt, asynchronous: Boolean): NTSTATUS =
    0

public actual fun NtOpenDirectoryObject(directoryhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    0

public actual fun NtOpenFile(filehandle: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, shareaccess: UInt, openoptions: UInt): NTSTATUS =
    0

public actual fun NtOpenObjectAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, clienttoken: HANDLE, desiredaccess: UInt, grantedaccess: UInt, privileges: Long, objectcreation: Boolean, accessgranted: Boolean, generateonclose: Long): NTSTATUS =
    0

public actual fun NtOpenProcessToken(processhandle: HANDLE, desiredaccess: UInt, tokenhandle: Long): NTSTATUS =
    0

public actual fun NtOpenProcessTokenEx(processhandle: HANDLE, desiredaccess: UInt, handleattributes: UInt, tokenhandle: Long): NTSTATUS =
    0

public actual fun NtOpenSymbolicLinkObject(linkhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    0

public actual fun NtOpenThreadToken(threadhandle: HANDLE, desiredaccess: UInt, openasself: Boolean, tokenhandle: Long): NTSTATUS =
    0

public actual fun NtOpenThreadTokenEx(threadhandle: HANDLE, desiredaccess: UInt, openasself: Boolean, handleattributes: UInt, tokenhandle: Long): NTSTATUS =
    0

public actual fun NtPrivilegeCheck(clienttoken: HANDLE, requiredprivileges: Long, result: Long): NTSTATUS =
    0

public actual fun NtPrivilegeObjectAuditAlarm(subsystemname: Long, handleid: Long, clienttoken: HANDLE, desiredaccess: UInt, privileges: Long, accessgranted: Boolean): NTSTATUS =
    0

public actual fun NtPrivilegedServiceAuditAlarm(subsystemname: Long, servicename: Long, clienttoken: HANDLE, privileges: Long, accessgranted: Boolean): NTSTATUS =
    0

public actual fun NtQueryDirectoryFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, returnsingleentry: Boolean, filename: Long, restartscan: Boolean): NTSTATUS =
    0

public actual fun NtQueryDirectoryFileEx(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, queryflags: UInt, filename: Long): NTSTATUS =
    0

public actual fun NtQueryDirectoryObject(directoryhandle: HANDLE, buffer: Long, length: UInt, returnsingleentry: Boolean, restartscan: Boolean, context: Long, returnlength: Long): NTSTATUS =
    0

public actual fun NtQueryEaFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt, returnsingleentry: Boolean, ealist: Long, ealistlength: UInt, eaindex: Long, restartscan: Boolean): NTSTATUS =
    0

public actual fun NtQueryFullAttributesFile(objectattributes: Long, fileinformation: Long): NTSTATUS =
    0

public actual fun NtQueryInformationByName(objectattributes: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS): NTSTATUS =
    0

public actual fun NtQueryInformationFile(filehandle: HANDLE, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS): NTSTATUS =
    0

public actual fun NtQueryInformationToken(tokenhandle: HANDLE, tokeninformationclass: TOKEN_INFORMATION_CLASS, tokeninformation: Long, tokeninformationlength: UInt, returnlength: Long): NTSTATUS =
    0

public actual fun NtQueryQuotaInformationFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt, returnsingleentry: Boolean, sidlist: Long, sidlistlength: UInt, startsid: PSID, restartscan: Boolean): NTSTATUS =
    0

public actual fun NtQuerySecurityObject(handle: HANDLE, securityinformation: UInt, securitydescriptor: PSECURITY_DESCRIPTOR, length: UInt, lengthneeded: Long): NTSTATUS =
    0

public actual fun NtQuerySymbolicLinkObject(linkhandle: HANDLE, linktarget: Long, returnedlength: Long): NTSTATUS =
    0

public actual fun NtQueryVirtualMemory(processhandle: HANDLE, baseaddress: Long, memoryinformationclass: MEMORY_INFORMATION_CLASS, memoryinformation: Long, memoryinformationlength: ULong, returnlength: Long): NTSTATUS =
    0

public actual fun NtQueryVolumeInformationFile(filehandle: HANDLE, iostatusblock: Long, fsinformation: Long, length: UInt, fsinformationclass: FS_INFORMATION_CLASS): NTSTATUS =
    0

public actual fun NtReadFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, buffer: Long, length: UInt, byteoffset: Long, key: Long): NTSTATUS =
    0

public actual fun NtSetEaFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt): NTSTATUS =
    0

public actual fun NtSetEvent(eventhandle: HANDLE, previousstate: Long): NTSTATUS =
    0

public actual fun NtSetInformationFile(filehandle: HANDLE, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS): NTSTATUS =
    0

public actual fun NtSetInformationToken(tokenhandle: HANDLE, tokeninformationclass: TOKEN_INFORMATION_CLASS, tokeninformation: Long, tokeninformationlength: UInt): NTSTATUS =
    0

public actual fun NtSetInformationVirtualMemory(processhandle: HANDLE, vminformationclass: VIRTUAL_MEMORY_INFORMATION_CLASS, numberofentries: ULong, virtualaddresses: Long, vminformation: Long, vminformationlength: UInt): NTSTATUS =
    0

public actual fun NtSetQuotaInformationFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt): NTSTATUS =
    0

public actual fun NtSetSecurityObject(handle: HANDLE, securityinformation: UInt, securitydescriptor: PSECURITY_DESCRIPTOR): NTSTATUS =
    0

public actual fun NtSetVolumeInformationFile(filehandle: HANDLE, iostatusblock: Long, fsinformation: Long, length: UInt, fsinformationclass: FS_INFORMATION_CLASS): NTSTATUS =
    0

public actual fun NtUnlockFile(filehandle: HANDLE, iostatusblock: Long, byteoffset: Long, length: Long, key: UInt): NTSTATUS =
    0

public actual fun NtWriteFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, buffer: Long, length: UInt, byteoffset: Long, key: Long): NTSTATUS =
    0

public actual fun ObInsertObject(obj: Long, passedaccessstate: Long, desiredaccess: UInt, objectpointerbias: UInt, newobject: Long, handle: Long): NTSTATUS =
    0

public actual fun ObIsKernelHandle(handle: HANDLE): Boolean =
    false

public actual fun ObMakeTemporaryObject(obj: Long) {
}

public actual fun ObOpenObjectByPointer(obj: Long, handleattributes: UInt, passedaccessstate: Long, desiredaccess: UInt, objecttype: POBJECT_TYPE, accessmode: Byte, handle: Long): NTSTATUS =
    0

public actual fun ObOpenObjectByPointerWithTag(obj: Long, handleattributes: UInt, passedaccessstate: Long, desiredaccess: UInt, objecttype: POBJECT_TYPE, accessmode: Byte, tag: UInt, handle: Long): NTSTATUS =
    0

public actual fun ObQueryNameString(obj: Long, objectnameinfo: Long, length: UInt, returnlength: Long): NTSTATUS =
    0

public actual fun ObQueryObjectAuditingByHandle(handle: HANDLE, generateonclose: Long): NTSTATUS =
    0

public actual fun PfxFindPrefix(prefixtable: Long, fullname: Long): Long =
    0L

public actual fun PfxInitialize(prefixtable: Long) {
}

public actual fun PfxInsertPrefix(prefixtable: Long, prefix: Long, prefixtableentry: Long): Boolean =
    false

public actual fun PfxRemovePrefix(prefixtable: Long, prefixtableentry: Long) {
}

public actual fun PoQueueShutdownWorkItem(workitem: Long): NTSTATUS =
    0

public actual fun PsAssignImpersonationToken(thread: PETHREAD, token: HANDLE): NTSTATUS =
    0

public actual fun PsChargePoolQuota(process: PEPROCESS, pooltype: POOL_TYPE, amount: ULong) {
}

public actual fun PsChargeProcessPoolQuota(process: PEPROCESS, pooltype: POOL_TYPE, amount: ULong): NTSTATUS =
    0

public actual fun PsDereferenceImpersonationToken(impersonationtoken: Long) {
}

public actual fun PsDereferencePrimaryToken(primarytoken: Long) {
}

public actual fun PsDisableImpersonation(thread: PETHREAD, impersonationstate: Long): Boolean =
    false

public actual fun PsGetProcessExitTime(): Long =
    0L

public actual fun PsGetThreadProcess(thread: PETHREAD): PEPROCESS =
    0L

public actual fun PsImpersonateClient(thread: PETHREAD, token: Long, copyonopen: Boolean, effectiveonly: Boolean, impersonationlevel: SECURITY_IMPERSONATION_LEVEL): NTSTATUS =
    0

public actual fun PsIsDiskCountersEnabled(): Boolean =
    false

public actual fun PsIsSystemThread(thread: PETHREAD): Boolean =
    false

public actual fun PsIsThreadTerminating(thread: PETHREAD): Boolean =
    false

public actual fun PsLookupProcessByProcessId(processid: HANDLE, process: Long): NTSTATUS =
    0

public actual fun PsLookupThreadByThreadId(threadid: HANDLE, thread: Long): NTSTATUS =
    0

public actual fun PsReferenceImpersonationToken(thread: PETHREAD, copyonopen: Long, effectiveonly: Long, impersonationlevel: Long): Long =
    0L

public actual fun PsReferencePrimaryToken(process: PEPROCESS): Long =
    0L

public actual fun PsRestoreImpersonation(thread: PETHREAD, impersonationstate: Long) {
}

public actual fun PsReturnPoolQuota(process: PEPROCESS, pooltype: POOL_TYPE, amount: ULong) {
}

public actual fun PsRevertToSelf() {
}

public actual fun PsUpdateDiskCounters(process: PEPROCESS, bytesread: ULong, byteswritten: ULong, readoperationcount: UInt, writeoperationcount: UInt, flushoperationcount: UInt) {
}

public actual fun QuerySecurityContextToken(phcontext: Long, token: Long): HRESULT =
    0

public actual fun RtlAbsoluteToSelfRelativeSD(absolutesecuritydescriptor: PSECURITY_DESCRIPTOR, selfrelativesecuritydescriptor: PSECURITY_DESCRIPTOR, bufferlength: Long): NTSTATUS =
    0

public actual fun RtlAddAccessAllowedAce(acl: Long, acerevision: UInt, accessmask: UInt, sid: PSID): NTSTATUS =
    0

public actual fun RtlAddAccessAllowedAceEx(acl: Long, acerevision: UInt, aceflags: UInt, accessmask: UInt, sid: PSID): NTSTATUS =
    0

public actual fun RtlAddAce(acl: Long, acerevision: UInt, startingaceindex: UInt, acelist: Long, acelistlength: UInt): NTSTATUS =
    0

public actual fun RtlAllocateAndInitializeSid(identifierauthority: Long, subauthoritycount: UByte, subauthority0: UInt, subauthority1: UInt, subauthority2: UInt, subauthority3: UInt, subauthority4: UInt, subauthority5: UInt, subauthority6: UInt, subauthority7: UInt, sid: Long): NTSTATUS =
    0

public actual fun RtlAllocateAndInitializeSidEx(identifierauthority: Long, subauthoritycount: UByte, subauthorities: Long, sid: Long): NTSTATUS =
    0

public actual fun RtlAllocateHeap(heaphandle: Long, flags: UInt, size: ULong): Long =
    0L

public actual fun RtlAppendStringToString(destination: Long, source: Long): NTSTATUS =
    0

public actual fun RtlCompareAltitudes(altitude1: Long, altitude2: Long): Int =
    0

public actual fun RtlCompareMemoryUlong(source: Long, length: ULong, pattern: UInt): ULong =
    0uL

public actual fun RtlCompressBuffer(compressionformatandengine: UShort, uncompressedbuffer: Long, uncompressedbuffersize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, uncompressedchunksize: UInt, finalcompressedsize: Long, workspace: Long): NTSTATUS =
    0

public actual fun RtlCompressChunks(uncompressedbuffer: Long, uncompressedbuffersize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, compresseddatainfo: Long, compresseddatainfolength: UInt, workspace: Long): NTSTATUS =
    0

public actual fun RtlCopyLuid(destinationluid: Long, sourceluid: Long) {
}

public actual fun RtlCopySid(destinationsidlength: UInt, destinationsid: PSID, sourcesid: PSID): NTSTATUS =
    0

public actual fun RtlCreateAcl(acl: Long, acllength: UInt, aclrevision: UInt): NTSTATUS =
    0

public actual fun RtlCreateHeap(flags: UInt, heapbase: Long, reservesize: ULong, commitsize: ULong, lock: Long, parameters: Long): Long =
    0L

public actual fun RtlCreateServiceSid(servicename: Long, servicesid: PSID, servicesidlength: Long): NTSTATUS =
    0

public actual fun RtlCreateSystemVolumeInformationFolder(volumerootpath: Long): NTSTATUS =
    0

public actual fun RtlCreateUnicodeString(destinationstring: Long, sourcestring: PCWSTR): Boolean =
    false

public actual fun RtlCreateVirtualAccountSid(name: Long, basesubauthority: UInt, sid: PSID, sidlength: Long): NTSTATUS =
    0

public actual fun RtlCustomCPToUnicodeN(customcp: Long, unicodestring: PWSTR, maxbytesinunicodestring: UInt, bytesinunicodestring: Long, customcpstring: PCSTR, bytesincustomcpstring: UInt): NTSTATUS =
    0

public actual fun RtlDecompressBuffer(compressionformat: UShort, uncompressedbuffer: Long, uncompressedbuffersize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, finaluncompressedsize: Long): NTSTATUS =
    0

public actual fun RtlDecompressBufferEx(compressionformat: UShort, uncompressedbuffer: Long, uncompressedbuffersize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, finaluncompressedsize: Long, workspace: Long): NTSTATUS =
    0

public actual fun RtlDecompressBufferEx2(compressionformat: UShort, uncompressedbuffer: Long, uncompressedbuffersize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, uncompressedchunksize: UInt, finaluncompressedsize: Long, workspace: Long): NTSTATUS =
    0

public actual fun RtlDecompressChunks(uncompressedbuffer: Long, uncompressedbuffersize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, compressedtail: Long, compressedtailsize: UInt, compresseddatainfo: Long): NTSTATUS =
    0

public actual fun RtlDecompressFragment(compressionformat: UShort, uncompressedfragment: Long, uncompressedfragmentsize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, fragmentoffset: UInt, finaluncompressedsize: Long, workspace: Long): NTSTATUS =
    0

public actual fun RtlDecompressFragmentEx(compressionformat: UShort, uncompressedfragment: Long, uncompressedfragmentsize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, fragmentoffset: UInt, uncompressedchunksize: UInt, finaluncompressedsize: Long, workspace: Long): NTSTATUS =
    0

public actual fun RtlDeleteAce(acl: Long, aceindex: UInt): NTSTATUS =
    0

public actual fun RtlDescribeChunk(compressionformat: UShort, compressedbuffer: Long, endofcompressedbufferplus1: Long, chunkbuffer: Long, chunksize: Long): NTSTATUS =
    0

public actual fun RtlDestroyHeap(heaphandle: Long): Long =
    0L

public actual fun RtlDosPathNameToNtPathName_U_WithStatus(dosfilename: PCWSTR, ntfilename: Long, filepart: Long, reserved: Long): NTSTATUS =
    0

public actual fun RtlDowncaseUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    0

public actual fun RtlDuplicateUnicodeString(flags: UInt, stringin: Long, stringout: Long): NTSTATUS =
    0

public actual fun RtlEqualPrefixSid(sid1: PSID, sid2: PSID): Boolean =
    false

public actual fun RtlEqualSid(sid1: PSID, sid2: PSID): Boolean =
    false

public actual fun RtlFindUnicodePrefix(prefixtable: Long, fullname: Long, caseinsensitiveindex: UInt): Long =
    0L

public actual fun RtlFreeHeap(heaphandle: Long, flags: UInt, baseaddress: Long): UInt =
    0u

public actual fun RtlFreeSid(sid: PSID): Long =
    0L

public actual fun RtlGenerate8dot3Name(name: Long, allowextendedcharacters: Boolean, context: Long, name8dot3: Long): NTSTATUS =
    0

public actual fun RtlGetAce(acl: Long, aceindex: UInt, ace: Long): NTSTATUS =
    0

public actual fun RtlGetCompressionWorkSpaceSize(compressionformatandengine: UShort, compressbufferworkspacesize: Long, compressfragmentworkspacesize: Long): NTSTATUS =
    0

public actual fun RtlGetDaclSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, daclpresent: Long, dacl: Long, dacldefaulted: Long): NTSTATUS =
    0

public actual fun RtlGetGroupSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, group: Long, groupdefaulted: Long): NTSTATUS =
    0

public actual fun RtlGetOwnerSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, owner: Long, ownerdefaulted: Long): NTSTATUS =
    0

public actual fun RtlGetSaclSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, saclpresent: Long, sacl: Long, sacldefaulted: Long): NTSTATUS =
    0

public actual fun RtlIdentifierAuthoritySid(sid: PSID): Long =
    0L

public actual fun RtlIdnToAscii(flags: UInt, sourcestring: PCWSTR, sourcestringlength: Int, destinationstring: PWSTR, destinationstringlength: Long): NTSTATUS =
    0

public actual fun RtlIdnToNameprepUnicode(flags: UInt, sourcestring: PCWSTR, sourcestringlength: Int, destinationstring: PWSTR, destinationstringlength: Long): NTSTATUS =
    0

public actual fun RtlIdnToUnicode(flags: UInt, sourcestring: PCWSTR, sourcestringlength: Int, destinationstring: PWSTR, destinationstringlength: Long): NTSTATUS =
    0

public actual fun RtlInitCodePageTable(tablebase: Long, codepagetable: Long) {
}

public actual fun RtlInitUnicodeStringEx(destinationstring: Long, sourcestring: PCWSTR): NTSTATUS =
    0

public actual fun RtlInitializeSid(sid: PSID, identifierauthority: Long, subauthoritycount: UByte): NTSTATUS =
    0

public actual fun RtlInitializeSidEx(sid: PSID, identifierauthority: Long, subauthoritycount: UByte): NTSTATUS =
    0

public actual fun RtlInitializeUnicodePrefix(prefixtable: Long) {
}

public actual fun RtlInsertUnicodePrefix(prefixtable: Long, prefix: Long, prefixtableentry: Long): Boolean =
    false

public actual fun RtlIsCloudFilesPlaceholder(fileattributes: UInt, reparsetag: UInt): Boolean =
    false

public actual fun RtlIsDosDeviceName_U(dosfilename: PCWSTR): UInt =
    0u

public actual fun RtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag: UInt): Boolean =
    false

public actual fun RtlIsNormalizedString(normform: UInt, sourcestring: PCWSTR, sourcestringlength: Int, normalized: Long): NTSTATUS =
    0

public actual fun RtlIsPartialPlaceholder(fileattributes: UInt, reparsetag: UInt): Boolean =
    false

public actual fun RtlIsPartialPlaceholderFileHandle(filehandle: HANDLE, ispartialplaceholder: Long): NTSTATUS =
    0

public actual fun RtlIsPartialPlaceholderFileInfo(infobuffer: Long, infoclass: FILE_INFORMATION_CLASS, ispartialplaceholder: Long): NTSTATUS =
    0

public actual fun RtlIsSandboxedToken(context: Long, previousmode: Byte): Boolean =
    false

public actual fun RtlIsValidOemCharacter(char: PWSTR): Boolean =
    false

public actual fun RtlLengthRequiredSid(subauthoritycount: UInt): UInt =
    0u

public actual fun RtlLengthSid(sid: PSID): UInt =
    0u

public actual fun RtlMultiByteToUnicodeN(unicodestring: PWSTR, maxbytesinunicodestring: UInt, bytesinunicodestring: Long, multibytestring: PCSTR, bytesinmultibytestring: UInt): NTSTATUS =
    0

public actual fun RtlMultiByteToUnicodeSize(bytesinunicodestring: Long, multibytestring: PCSTR, bytesinmultibytestring: UInt): NTSTATUS =
    0

public actual fun RtlNextUnicodePrefix(prefixtable: Long, restart: Boolean): Long =
    0L

public actual fun RtlNormalizeString(normform: UInt, sourcestring: PCWSTR, sourcestringlength: Int, destinationstring: PWSTR, destinationstringlength: Long): NTSTATUS =
    0

public actual fun RtlNtStatusToDosErrorNoTeb(status: NTSTATUS): UInt =
    0u

public actual fun RtlOemStringToCountedUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    0

public actual fun RtlOemStringToUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    0

public actual fun RtlOemToUnicodeN(unicodestring: PWSTR, maxbytesinunicodestring: UInt, bytesinunicodestring: Long, oemstring: PCSTR, bytesinoemstring: UInt): NTSTATUS =
    0

public actual fun RtlPrefixString(string1: Long, string2: Long, caseinsensitive: Boolean): Boolean =
    false

public actual fun RtlQueryPackageIdentity(tokenobject: Long, packagefullname: PWSTR, packagesize: Long, appid: PWSTR, appidsize: Long, packaged: Long): NTSTATUS =
    0

public actual fun RtlQueryPackageIdentityEx(tokenobject: Long, packagefullname: PWSTR, packagesize: Long, appid: PWSTR, appidsize: Long, dynamicid: Long, flags: Long): NTSTATUS =
    0

public actual fun RtlQueryProcessPlaceholderCompatibilityMode(): Byte =
    0

public actual fun RtlQueryThreadPlaceholderCompatibilityMode(): Byte =
    0

public actual fun RtlRandom(seed: Long): UInt =
    0u

public actual fun RtlRandomEx(seed: Long): UInt =
    0u

public actual fun RtlRemoveUnicodePrefix(prefixtable: Long, prefixtableentry: Long) {
}

public actual fun RtlReplaceSidInSd(securitydescriptor: PSECURITY_DESCRIPTOR, oldsid: PSID, newsid: PSID, numchanges: Long): NTSTATUS =
    0

public actual fun RtlReserveChunk(compressionformat: UShort, compressedbuffer: Long, endofcompressedbufferplus1: Long, chunkbuffer: Long, chunksize: UInt): NTSTATUS =
    0

public actual fun RtlSecondsSince1970ToTime(elapsedseconds: UInt, time: Long) {
}

public actual fun RtlSecondsSince1980ToTime(elapsedseconds: UInt, time: Long) {
}

public actual fun RtlSelfRelativeToAbsoluteSD(selfrelativesecuritydescriptor: PSECURITY_DESCRIPTOR, absolutesecuritydescriptor: PSECURITY_DESCRIPTOR, absolutesecuritydescriptorsize: Long, dacl: Long, daclsize: Long, sacl: Long, saclsize: Long, owner: PSID, ownersize: Long, primarygroup: PSID, primarygroupsize: Long): NTSTATUS =
    0

public actual fun RtlSetGroupSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, group: PSID, groupdefaulted: Boolean): NTSTATUS =
    0

public actual fun RtlSetOwnerSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, owner: PSID, ownerdefaulted: Boolean): NTSTATUS =
    0

public actual fun RtlSetProcessPlaceholderCompatibilityMode(mode: Byte): Byte =
    0

public actual fun RtlSetThreadPlaceholderCompatibilityMode(mode: Byte): Byte =
    0

public actual fun RtlSubAuthorityCountSid(sid: PSID): Long =
    0L

public actual fun RtlSubAuthoritySid(sid: PSID, subauthority: UInt): Long =
    0L

public actual fun RtlTimeToSecondsSince1980(time: Long, elapsedseconds: Long): Boolean =
    false

public actual fun RtlUnicodeStringToCountedOemString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    0

public actual fun RtlUnicodeToCustomCPN(customcp: Long, customcpstring: PSTR, maxbytesincustomcpstring: UInt, bytesincustomcpstring: Long, unicodestring: PCWSTR, bytesinunicodestring: UInt): NTSTATUS =
    0

public actual fun RtlUnicodeToMultiByteN(multibytestring: PSTR, maxbytesinmultibytestring: UInt, bytesinmultibytestring: Long, unicodestring: Long, bytesinunicodestring: UInt): NTSTATUS =
    0

public actual fun RtlUnicodeToOemN(oemstring: PSTR, maxbytesinoemstring: UInt, bytesinoemstring: Long, unicodestring: Long, bytesinunicodestring: UInt): NTSTATUS =
    0

public actual fun RtlUpcaseUnicodeStringToCountedOemString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    0

public actual fun RtlUpcaseUnicodeStringToOemString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    0

public actual fun RtlUpcaseUnicodeToCustomCPN(customcp: Long, customcpstring: PSTR, maxbytesincustomcpstring: UInt, bytesincustomcpstring: Long, unicodestring: PCWSTR, bytesinunicodestring: UInt): NTSTATUS =
    0

public actual fun RtlUpcaseUnicodeToMultiByteN(multibytestring: PSTR, maxbytesinmultibytestring: UInt, bytesinmultibytestring: Long, unicodestring: Long, bytesinunicodestring: UInt): NTSTATUS =
    0

public actual fun RtlUpcaseUnicodeToOemN(oemstring: PSTR, maxbytesinoemstring: UInt, bytesinoemstring: Long, unicodestring: Long, bytesinunicodestring: UInt): NTSTATUS =
    0

public actual fun RtlValidSid(sid: PSID): Boolean =
    false

public actual fun RtlValidateUnicodeString(flags: UInt, string: Long): NTSTATUS =
    0

public actual fun RtlxOemStringToUnicodeSize(oemstring: Long): UInt =
    0u

public actual fun RtlxUnicodeStringToOemSize(unicodestring: Long): UInt =
    0u

public actual fun SeAccessCheckFromState(securitydescriptor: PSECURITY_DESCRIPTOR, primarytokeninformation: Long, clienttokeninformation: Long, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: Long, genericmapping: Long, accessmode: Byte, grantedaccess: Long, accessstatus: Long): Boolean =
    false

public actual fun SeAccessCheckFromStateEx(securitydescriptor: PSECURITY_DESCRIPTOR, primarytoken: Long, clienttoken: Long, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: Long, genericmapping: Long, accessmode: Byte, grantedaccess: Long, accessstatus: Long): Boolean =
    false

public actual fun SeAdjustAccessStateForAccessConstraints(objecttype: Long, securitydescriptor: PSECURITY_DESCRIPTOR, accessstate: Long) {
}

public actual fun SeAdjustAccessStateForTrustLabel(objecttype: Long, securitydescriptor: PSECURITY_DESCRIPTOR, accessstate: Long) {
}

public actual fun SeAdjustObjectSecurity(objectname: Long, originaldescriptor: PSECURITY_DESCRIPTOR, proposeddescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long, adjusteddescriptor: Long, applyadjusteddescriptor: Long): NTSTATUS =
    0

public actual fun SeAppendPrivileges(accessstate: Long, privileges: Long): NTSTATUS =
    0

public actual fun SeAuditFipsCryptoSelftests(bsuccess: Boolean, selftestcode: UInt) {
}

public actual fun SeAuditHardLinkCreation(filename: Long, linkname: Long, bsuccess: Boolean) {
}

public actual fun SeAuditHardLinkCreationWithTransaction(filename: Long, linkname: Long, bsuccess: Boolean, transactionid: Long) {
}

public actual fun SeAuditTransactionStateChange(transactionid: Long, resourcemanagerid: Long, newtransactionstate: UInt) {
}

public actual fun SeAuditingAnyFileEventsWithContext(securitydescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long): Boolean =
    false

public actual fun SeAuditingAnyFileEventsWithContextEx(securitydescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long, stagingenabled: Long): Boolean =
    false

public actual fun SeAuditingFileEvents(accessgranted: Boolean, securitydescriptor: PSECURITY_DESCRIPTOR): Boolean =
    false

public actual fun SeAuditingFileEventsWithContext(accessgranted: Boolean, securitydescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long): Boolean =
    false

public actual fun SeAuditingFileEventsWithContextEx(accessgranted: Boolean, securitydescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long, stagingenabled: Long): Boolean =
    false

public actual fun SeAuditingFileOrGlobalEvents(accessgranted: Boolean, securitydescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long): Boolean =
    false

public actual fun SeAuditingHardLinkEvents(accessgranted: Boolean, securitydescriptor: PSECURITY_DESCRIPTOR): Boolean =
    false

public actual fun SeAuditingHardLinkEventsWithContext(accessgranted: Boolean, securitydescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long): Boolean =
    false

public actual fun SeCaptureSubjectContextEx(thread: PETHREAD, process: PEPROCESS, subjectcontext: Long) {
}

public actual fun SeCheckForCriticalAceRemoval(currentdescriptor: PSECURITY_DESCRIPTOR, newdescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long, aceremoved: Long) {
}

public actual fun SeCreateClientSecurity(clientthread: PETHREAD, clientsecurityqos: Long, remotesession: Boolean, clientcontext: Long): NTSTATUS =
    0

public actual fun SeCreateClientSecurityFromSubjectContext(subjectcontext: Long, clientsecurityqos: Long, serverisremote: Boolean, clientcontext: Long): NTSTATUS =
    0

public actual fun SeDeleteClientSecurity(clientcontext: Long) {
}

public actual fun SeDeleteObjectAuditAlarm(obj: Long, handle: HANDLE) {
}

public actual fun SeDeleteObjectAuditAlarmWithTransaction(obj: Long, handle: HANDLE, transactionid: Long) {
}

public actual fun SeExamineSacl(sacl: Long, resourcesacl: Long, token: Long, desiredaccess: UInt, accessgranted: Boolean, generateaudit: Long, generatealarm: Long) {
}

public actual fun SeFilterToken(existingtoken: Long, flags: UInt, sidstodisable: Long, privilegestodelete: Long, restrictedsids: Long, filteredtoken: Long): NTSTATUS =
    0

public actual fun SeFreePrivileges(privileges: Long) {
}

public actual fun SeImpersonateClient(clientcontext: Long, serverthread: PETHREAD) {
}

public actual fun SeImpersonateClientEx(clientcontext: Long, serverthread: PETHREAD): NTSTATUS =
    0

public actual fun SeLocateProcessImageName(process: PEPROCESS, pimagefilename: Long): NTSTATUS =
    0

public actual fun SeMarkLogonSessionForTerminationNotification(logonid: Long): NTSTATUS =
    0

public actual fun SeMarkLogonSessionForTerminationNotificationEx(logonid: Long, pserversilo: PESILO): NTSTATUS =
    0

public actual fun SeOpenObjectAuditAlarm(objecttypename: Long, obj: Long, absoluteobjectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, accessstate: Long, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, generateonclose: Long) {
}

public actual fun SeOpenObjectAuditAlarmWithTransaction(objecttypename: Long, obj: Long, absoluteobjectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, accessstate: Long, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, transactionid: Long, generateonclose: Long) {
}

public actual fun SeOpenObjectForDeleteAuditAlarm(objecttypename: Long, obj: Long, absoluteobjectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, accessstate: Long, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, generateonclose: Long) {
}

public actual fun SeOpenObjectForDeleteAuditAlarmWithTransaction(objecttypename: Long, obj: Long, absoluteobjectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, accessstate: Long, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, transactionid: Long, generateonclose: Long) {
}

public actual fun SePrivilegeCheck(requiredprivileges: Long, subjectsecuritycontext: Long, accessmode: Byte): Boolean =
    false

public actual fun SeQueryAuthenticationIdToken(token: Long, authenticationid: Long): NTSTATUS =
    0

public actual fun SeQueryInformationToken(token: Long, tokeninformationclass: TOKEN_INFORMATION_CLASS, tokeninformation: Long): NTSTATUS =
    0

public actual fun SeQuerySecurityDescriptorInfo(securityinformation: Long, securitydescriptor: PSECURITY_DESCRIPTOR, length: Long, objectssecuritydescriptor: Long): NTSTATUS =
    0

public actual fun SeQueryServerSiloToken(token: Long, pserversilo: Long): NTSTATUS =
    0

public actual fun SeQuerySessionIdToken(token: Long, sessionid: Long): NTSTATUS =
    0

public actual fun SeQuerySessionIdTokenEx(token: Long, sessionid: Long, isservicesession: Long): NTSTATUS =
    0

public actual fun SeRegisterLogonSessionTerminatedRoutine(callbackroutine: PSE_LOGON_SESSION_TERMINATED_ROUTINE): NTSTATUS =
    0

public actual fun SeRegisterLogonSessionTerminatedRoutineEx(callbackroutine: PSE_LOGON_SESSION_TERMINATED_ROUTINE_EX, context: Long): NTSTATUS =
    0

public actual fun SeReportSecurityEventWithSubCategory(flags: UInt, sourcename: Long, usersid: PSID, auditparameters: Long, auditsubcategoryid: UInt): NTSTATUS =
    0

public actual fun SeSetAccessStateGenericMapping(accessstate: Long, genericmapping: Long) {
}

public actual fun SeSetSecurityDescriptorInfo(obj: Long, securityinformation: Long, modificationdescriptor: PSECURITY_DESCRIPTOR, objectssecuritydescriptor: Long, pooltype: POOL_TYPE, genericmapping: Long): NTSTATUS =
    0

public actual fun SeSetSecurityDescriptorInfoEx(obj: Long, securityinformation: Long, modificationdescriptor: PSECURITY_DESCRIPTOR, objectssecuritydescriptor: Long, autoinheritflags: UInt, pooltype: POOL_TYPE, genericmapping: Long): NTSTATUS =
    0

public actual fun SeShouldCheckForAccessRightsFromParent(objecttype: Long, childdescriptor: PSECURITY_DESCRIPTOR, accessstate: Long): Boolean =
    false

public actual fun SeTokenFromAccessInformation(accessinformation: Long, token: Long, length: UInt, requiredlength: Long): NTSTATUS =
    0

public actual fun SeTokenIsAdmin(token: Long): Boolean =
    false

public actual fun SeTokenIsRestricted(token: Long): Boolean =
    false

public actual fun SeTokenIsWriteRestricted(token: Long): Boolean =
    false

public actual fun SeTokenType(token: Long): TOKEN_TYPE =
    0

public actual fun SeUnregisterLogonSessionTerminatedRoutine(callbackroutine: PSE_LOGON_SESSION_TERMINATED_ROUTINE): NTSTATUS =
    0

public actual fun SeUnregisterLogonSessionTerminatedRoutineEx(callbackroutine: PSE_LOGON_SESSION_TERMINATED_ROUTINE_EX, context: Long): NTSTATUS =
    0

public actual fun SecLookupAccountName(name: Long, sidsize: Long, sid: PSID, nameuse: Long, domainsize: Long, referenceddomain: Long): NTSTATUS =
    0

public actual fun SecLookupAccountSid(sid: PSID, namesize: Long, namebuffer: Long, domainsize: Long, domainbuffer: Long, nameuse: Long): NTSTATUS =
    0

public actual fun SecLookupWellKnownSid(sidtype: WELL_KNOWN_SID_TYPE, sid: PSID, sidbuffersize: UInt, sidsize: Long): NTSTATUS =
    0

public actual fun SecMakeSPN(serviceclass: Long, servicename: Long, instancename: Long, instanceport: UShort, referrer: Long, spn: Long, length: Long, allocate: Boolean): NTSTATUS =
    0

public actual fun SecMakeSPNEx(serviceclass: Long, servicename: Long, instancename: Long, instanceport: UShort, referrer: Long, targetinfo: Long, spn: Long, length: Long, allocate: Boolean): NTSTATUS =
    0

public actual fun SecMakeSPNEx2(serviceclass: Long, servicename: Long, instancename: Long, instanceport: UShort, referrer: Long, intargetinfo: Long, spn: Long, totalsize: Long, allocate: Boolean, istargetinfomarshaled: Boolean): NTSTATUS =
    0

public actual fun SetContextAttributesW(phcontext: Long, ulattribute: UInt, pbuffer: Long, cbbuffer: UInt): HRESULT =
    0

public actual fun SspiAcceptSecurityContextAsync(asynccontext: Long, phcredential: Long, phcontext: Long, pinput: Long, fcontextreq: UInt, targetdatarep: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT =
    0

public actual fun SspiAcquireCredentialsHandleAsyncA(asynccontext: Long, pszprincipal: PCSTR, pszpackage: PCSTR, fcredentialuse: UInt, pvlogonid: Long, pauthdata: Long, pgetkeyfn: SEC_GET_KEY_FN, pvgetkeyargument: Long, phcredential: Long, ptsexpiry: Long): HRESULT =
    0

public actual fun SspiAcquireCredentialsHandleAsyncW(asynccontext: Long, pszprincipal: Long, pszpackage: Long, fcredentialuse: UInt, pvlogonid: Long, pauthdata: Long, pgetkeyfn: SEC_GET_KEY_FN, pvgetkeyargument: Long, phcredential: Long, ptsexpiry: Long): HRESULT =
    0

public actual fun SspiCreateAsyncContext(): Long =
    0L

public actual fun SspiDeleteSecurityContextAsync(asynccontext: Long, phcontext: Long): HRESULT =
    0

public actual fun SspiFreeAsyncContext(handle: Long) {
}

public actual fun SspiFreeCredentialsHandleAsync(asynccontext: Long, phcredential: Long): HRESULT =
    0

public actual fun SspiGetAsyncCallStatus(handle: Long): HRESULT =
    0

public actual fun SspiInitializeSecurityContextAsyncA(asynccontext: Long, phcredential: Long, phcontext: Long, psztargetname: PCSTR, fcontextreq: UInt, reserved1: UInt, targetdatarep: UInt, pinput: Long, reserved2: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT =
    0

public actual fun SspiInitializeSecurityContextAsyncW(asynccontext: Long, phcredential: Long, phcontext: Long, psztargetname: Long, fcontextreq: UInt, reserved1: UInt, targetdatarep: UInt, pinput: Long, reserved2: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT =
    0

public actual fun SspiReinitAsyncContext(handle: Long): NTSTATUS =
    0

public actual fun SspiSetAsyncNotifyCallback(context: Long, callback: SspiAsyncNotifyCallback, callbackdata: Long): HRESULT =
    0

public actual fun VerifySignature(phcontext: Long, pmessage: Long, messageseqno: UInt, pfqop: Long): HRESULT =
    0

public actual fun ZwAccessCheckAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, desiredaccess: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS =
    0

public actual fun ZwAccessCheckByTypeAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS =
    0

public actual fun ZwAccessCheckByTypeResultListAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS =
    0

public actual fun ZwAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname: Long, handleid: Long, clienttoken: HANDLE, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS =
    0

public actual fun ZwAdjustGroupsToken(tokenhandle: HANDLE, resettodefault: Boolean, newstate: Long, bufferlength: UInt, previousstate: Long, returnlength: Long): NTSTATUS =
    0

public actual fun ZwAdjustPrivilegesToken(tokenhandle: HANDLE, disableallprivileges: Boolean, newstate: Long, bufferlength: UInt, previousstate: Long, returnlength: Long): NTSTATUS =
    0

public actual fun ZwAllocateVirtualMemory(processhandle: HANDLE, baseaddress: Long, zerobits: ULong, regionsize: Long, allocationtype: UInt, protect: UInt): NTSTATUS =
    0

public actual fun ZwAllocateVirtualMemoryEx(processhandle: HANDLE, baseaddress: Long, regionsize: Long, allocationtype: UInt, pageprotection: UInt, extendedparameters: Long, extendedparametercount: UInt): NTSTATUS =
    0

public actual fun ZwCancelIoFileEx(filehandle: HANDLE, iorequesttocancel: Long, iostatusblock: Long): NTSTATUS =
    0

public actual fun ZwCloseObjectAuditAlarm(subsystemname: Long, handleid: Long, generateonclose: Boolean): NTSTATUS =
    0

public actual fun ZwCreateDirectoryObject(directoryhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    0

public actual fun ZwCreateEvent(eventhandle: Long, desiredaccess: UInt, objectattributes: Long, eventtype: EVENT_TYPE, initialstate: Boolean): NTSTATUS =
    0

public actual fun ZwCreateSectionEx(sectionhandle: Long, desiredaccess: UInt, objectattributes: Long, maximumsize: Long, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: HANDLE, extendedparameters: Long, extendedparametercount: UInt): NTSTATUS =
    0

public actual fun ZwDeleteFile(objectattributes: Long): NTSTATUS =
    0

public actual fun ZwDeleteObjectAuditAlarm(subsystemname: Long, handleid: Long, generateonclose: Boolean): NTSTATUS =
    0

public actual fun ZwDuplicateObject(sourceprocesshandle: HANDLE, sourcehandle: HANDLE, targetprocesshandle: HANDLE, targethandle: Long, desiredaccess: UInt, handleattributes: UInt, options: UInt): NTSTATUS =
    0

public actual fun ZwDuplicateToken(existingtokenhandle: HANDLE, desiredaccess: UInt, objectattributes: Long, effectiveonly: Boolean, tokentype: TOKEN_TYPE, newtokenhandle: Long): NTSTATUS =
    0

public actual fun ZwFilterToken(existingtokenhandle: HANDLE, flags: UInt, sidstodisable: Long, privilegestodelete: Long, restrictedsids: Long, newtokenhandle: Long): NTSTATUS =
    0

public actual fun ZwFlushBuffersFile(filehandle: HANDLE, iostatusblock: Long): NTSTATUS =
    0

public actual fun ZwFlushBuffersFileEx(filehandle: HANDLE, flags: UInt, parameters: Long, parameterssize: UInt, iostatusblock: Long): NTSTATUS =
    0

public actual fun ZwFlushVirtualMemory(processhandle: HANDLE, baseaddress: Long, regionsize: Long, iostatus: Long): NTSTATUS =
    0

public actual fun ZwFreeVirtualMemory(processhandle: HANDLE, baseaddress: Long, regionsize: Long, freetype: UInt): NTSTATUS =
    0

public actual fun ZwFsControlFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, fscontrolcode: UInt, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt): NTSTATUS =
    0

public actual fun ZwImpersonateAnonymousToken(threadhandle: HANDLE): NTSTATUS =
    0

public actual fun ZwLockFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, byteoffset: Long, length: Long, key: UInt, failimmediately: Boolean, exclusivelock: Boolean): NTSTATUS =
    0

public actual fun ZwNotifyChangeKey(keyhandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, completionfilter: UInt, watchtree: Boolean, buffer: Long, buffersize: UInt, asynchronous: Boolean): NTSTATUS =
    0

public actual fun ZwOpenDirectoryObject(directoryhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    0

public actual fun ZwOpenObjectAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, clienttoken: HANDLE, desiredaccess: UInt, grantedaccess: UInt, privileges: Long, objectcreation: Boolean, accessgranted: Boolean, generateonclose: Long): NTSTATUS =
    0

public actual fun ZwOpenProcessToken(processhandle: HANDLE, desiredaccess: UInt, tokenhandle: Long): NTSTATUS =
    0

public actual fun ZwOpenProcessTokenEx(processhandle: HANDLE, desiredaccess: UInt, handleattributes: UInt, tokenhandle: Long): NTSTATUS =
    0

public actual fun ZwOpenThreadToken(threadhandle: HANDLE, desiredaccess: UInt, openasself: Boolean, tokenhandle: Long): NTSTATUS =
    0

public actual fun ZwOpenThreadTokenEx(threadhandle: HANDLE, desiredaccess: UInt, openasself: Boolean, handleattributes: UInt, tokenhandle: Long): NTSTATUS =
    0

public actual fun ZwPrivilegeCheck(clienttoken: HANDLE, requiredprivileges: Long, result: Long): NTSTATUS =
    0

public actual fun ZwPrivilegeObjectAuditAlarm(subsystemname: Long, handleid: Long, clienttoken: HANDLE, desiredaccess: UInt, privileges: Long, accessgranted: Boolean): NTSTATUS =
    0

public actual fun ZwPrivilegedServiceAuditAlarm(subsystemname: Long, servicename: Long, clienttoken: HANDLE, privileges: Long, accessgranted: Boolean): NTSTATUS =
    0

public actual fun ZwQueryDirectoryFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, returnsingleentry: Boolean, filename: Long, restartscan: Boolean): NTSTATUS =
    0

public actual fun ZwQueryDirectoryFileEx(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, queryflags: UInt, filename: Long): NTSTATUS =
    0

public actual fun ZwQueryDirectoryObject(directoryhandle: HANDLE, buffer: Long, length: UInt, returnsingleentry: Boolean, restartscan: Boolean, context: Long, returnlength: Long): NTSTATUS =
    0

public actual fun ZwQueryEaFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt, returnsingleentry: Boolean, ealist: Long, ealistlength: UInt, eaindex: Long, restartscan: Boolean): NTSTATUS =
    0

public actual fun ZwQueryFullAttributesFile(objectattributes: Long, fileinformation: Long): NTSTATUS =
    0

public actual fun ZwQueryInformationToken(tokenhandle: HANDLE, tokeninformationclass: TOKEN_INFORMATION_CLASS, tokeninformation: Long, tokeninformationlength: UInt, returnlength: Long): NTSTATUS =
    0

public actual fun ZwQueryObject(handle: HANDLE, objectinformationclass: OBJECT_INFORMATION_CLASS, objectinformation: Long, objectinformationlength: UInt, returnlength: Long): NTSTATUS =
    0

public actual fun ZwQueryQuotaInformationFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt, returnsingleentry: Boolean, sidlist: Long, sidlistlength: UInt, startsid: PSID, restartscan: Boolean): NTSTATUS =
    0

public actual fun ZwQuerySecurityObject(handle: HANDLE, securityinformation: UInt, securitydescriptor: PSECURITY_DESCRIPTOR, length: UInt, lengthneeded: Long): NTSTATUS =
    0

public actual fun ZwQueryVirtualMemory(processhandle: HANDLE, baseaddress: Long, memoryinformationclass: MEMORY_INFORMATION_CLASS, memoryinformation: Long, memoryinformationlength: ULong, returnlength: Long): NTSTATUS =
    0

public actual fun ZwQueryVolumeInformationFile(filehandle: HANDLE, iostatusblock: Long, fsinformation: Long, length: UInt, fsinformationclass: FS_INFORMATION_CLASS): NTSTATUS =
    0

public actual fun ZwSetEaFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt): NTSTATUS =
    0

public actual fun ZwSetEvent(eventhandle: HANDLE, previousstate: Long): NTSTATUS =
    0

public actual fun ZwSetInformationToken(tokenhandle: HANDLE, tokeninformationclass: TOKEN_INFORMATION_CLASS, tokeninformation: Long, tokeninformationlength: UInt): NTSTATUS =
    0

public actual fun ZwSetInformationVirtualMemory(processhandle: HANDLE, vminformationclass: VIRTUAL_MEMORY_INFORMATION_CLASS, numberofentries: ULong, virtualaddresses: Long, vminformation: Long, vminformationlength: UInt): NTSTATUS =
    0

public actual fun ZwSetQuotaInformationFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt): NTSTATUS =
    0

public actual fun ZwSetSecurityObject(handle: HANDLE, securityinformation: UInt, securitydescriptor: PSECURITY_DESCRIPTOR): NTSTATUS =
    0

public actual fun ZwSetVolumeInformationFile(filehandle: HANDLE, iostatusblock: Long, fsinformation: Long, length: UInt, fsinformationclass: FS_INFORMATION_CLASS): NTSTATUS =
    0

public actual fun ZwUnlockFile(filehandle: HANDLE, iostatusblock: Long, byteoffset: Long, length: Long, key: UInt): NTSTATUS =
    0
