package io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DriverFsNotification
import io.github.kotlinmania.windowssys.windows.wdk.foundation.KspinLockQueueNumber
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Peprocess
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
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileAccessRights
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileFlagsAndAttributes
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileShareMode
import io.github.kotlinmania.windowssys.windows.win32.system.io.PioApcRoutine
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.EventType
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.String
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.WaitType

public expect fun applyControlToken(phcontext: COpaquePointer?, pinput: COpaquePointer?): Hresult

public expect fun ccAsyncCopyRead(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, wait: Boolean, buffer: COpaquePointer?, iostatus: COpaquePointer?, ioissuerthread: Pethread, asyncreadcontext: COpaquePointer?): Boolean

public expect fun ccCanIWrite(fileobject: COpaquePointer?, bytestowrite: UInt, wait: Boolean, retrying: UByte): Boolean

public expect fun ccCoherencyFlushAndPurgeCache(sectionobjectpointer: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, iostatus: COpaquePointer?, flags: UInt)

public expect fun ccCopyRead(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, wait: Boolean, buffer: COpaquePointer?, iostatus: COpaquePointer?): Boolean

public expect fun ccCopyReadEx(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, wait: Boolean, buffer: COpaquePointer?, iostatus: COpaquePointer?, ioissuerthread: Pethread): Boolean

public expect fun ccCopyWrite(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, wait: Boolean, buffer: COpaquePointer?): Boolean

public expect fun ccCopyWriteEx(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, wait: Boolean, buffer: COpaquePointer?, ioissuerthread: Pethread): Boolean

public expect fun ccCopyWriteWontFlush(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt): Boolean

public expect fun ccDeferWrite(fileobject: COpaquePointer?, postroutine: PccPostDeferredWrite, context1: COpaquePointer?, context2: COpaquePointer?, bytestowrite: UInt, retrying: Boolean)

public expect fun ccErrorCallbackRoutine(context: COpaquePointer?): Ntstatus

public expect fun ccFastCopyRead(fileobject: COpaquePointer?, fileoffset: UInt, length: UInt, pagecount: UInt, buffer: COpaquePointer?, iostatus: COpaquePointer?)

public expect fun ccFastCopyWrite(fileobject: COpaquePointer?, fileoffset: UInt, length: UInt, buffer: COpaquePointer?)

public expect fun ccFlushCache(sectionobjectpointer: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, iostatus: COpaquePointer?)

public expect fun ccGetDirtyPages(loghandle: COpaquePointer?, dirtypageroutine: PdirtyPageRoutine, context1: COpaquePointer?, context2: COpaquePointer?): Long

public expect fun ccGetFileObjectFromBcb(bcb: COpaquePointer?): COpaquePointer?

public expect fun ccGetFileObjectFromSectionPtrs(sectionobjectpointer: COpaquePointer?): COpaquePointer?

public expect fun ccGetFileObjectFromSectionPtrsRef(sectionobjectpointer: COpaquePointer?): COpaquePointer?

public expect fun ccGetFlushedValidData(sectionobjectpointer: COpaquePointer?, bcblistheld: Boolean): Long

public expect fun ccInitializeCacheMap(fileobject: COpaquePointer?, filesizes: COpaquePointer?, pinaccess: Boolean, callbacks: COpaquePointer?, lazywritecontext: COpaquePointer?)

public expect fun ccInitializeCacheMapEx(fileobject: COpaquePointer?, filesizes: COpaquePointer?, pinaccess: Boolean, callbacks: COpaquePointer?, lazywritecontext: COpaquePointer?, flags: UInt)

public expect fun ccIsCacheManagerCallbackNeeded(status: Ntstatus): Boolean

public expect fun ccIsThereDirtyData(vpb: COpaquePointer?): Boolean

public expect fun ccIsThereDirtyDataEx(vpb: COpaquePointer?, numberofdirtypages: COpaquePointer?): Boolean

public expect fun ccMapData(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, flags: UInt, bcb: COpaquePointer?, buffer: COpaquePointer?): Boolean

public expect fun ccMdlRead(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, mdlchain: COpaquePointer?, iostatus: COpaquePointer?)

public expect fun ccMdlReadComplete(fileobject: COpaquePointer?, mdlchain: COpaquePointer?)

public expect fun ccMdlWriteAbort(fileobject: COpaquePointer?, mdlchain: COpaquePointer?)

public expect fun ccMdlWriteComplete(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, mdlchain: COpaquePointer?)

public expect fun ccPinMappedData(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, flags: UInt, bcb: COpaquePointer?): Boolean

public expect fun ccPinRead(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, flags: UInt, bcb: COpaquePointer?, buffer: COpaquePointer?): Boolean

public expect fun ccPrepareMdlWrite(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, mdlchain: COpaquePointer?, iostatus: COpaquePointer?)

public expect fun ccPreparePinWrite(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, zero: Boolean, flags: UInt, bcb: COpaquePointer?, buffer: COpaquePointer?): Boolean

public expect fun ccPurgeCacheSection(sectionobjectpointer: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, flags: UInt): Boolean

public expect fun ccRemapBcb(bcb: COpaquePointer?): COpaquePointer?

public expect fun ccRepinBcb(bcb: COpaquePointer?)

public expect fun ccScheduleReadAhead(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt)

public expect fun ccScheduleReadAheadEx(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, ioissuerthread: Pethread)

public expect fun ccSetAdditionalCacheAttributes(fileobject: COpaquePointer?, disablereadahead: Boolean, disablewritebehind: Boolean)

public expect fun ccSetAdditionalCacheAttributesEx(fileobject: COpaquePointer?, flags: UInt)

public expect fun ccSetBcbOwnerPointer(bcb: COpaquePointer?, ownerpointer: COpaquePointer?)

public expect fun ccSetDirtyPageThreshold(fileobject: COpaquePointer?, dirtypagethreshold: UInt)

public expect fun ccSetDirtyPinnedData(bcbvoid: COpaquePointer?, lsn: COpaquePointer?)

public expect fun ccSetFileSizes(fileobject: COpaquePointer?, filesizes: COpaquePointer?)

public expect fun ccSetFileSizesEx(fileobject: COpaquePointer?, filesizes: COpaquePointer?): Ntstatus

public expect fun ccSetLogHandleForFile(fileobject: COpaquePointer?, loghandle: COpaquePointer?, flushtolsnroutine: PflushToLsn)

public expect fun ccSetParallelFlushFile(fileobject: COpaquePointer?, enableparallelflush: Boolean)

public expect fun ccSetReadAheadGranularity(fileobject: COpaquePointer?, granularity: UInt)

public expect fun ccUninitializeCacheMap(fileobject: COpaquePointer?, truncatesize: COpaquePointer?, uninitializeevent: COpaquePointer?): Boolean

public expect fun ccUnpinData(bcb: COpaquePointer?)

public expect fun ccUnpinDataForThread(bcb: COpaquePointer?, resourcethreadid: ULong)

public expect fun ccUnpinRepinnedBcb(bcb: COpaquePointer?, writethrough: Boolean, iostatus: COpaquePointer?)

public expect fun ccWaitForCurrentLazyWriterActivity(): Ntstatus

public expect fun ccZeroData(fileobject: COpaquePointer?, startoffset: COpaquePointer?, endoffset: COpaquePointer?, wait: Boolean): Boolean

public expect fun completeAuthToken(phcontext: COpaquePointer?, ptoken: COpaquePointer?): Hresult

public expect fun exDisableResourceBoostLite(resource: COpaquePointer?)

public expect fun exQueryPoolBlockSize(poolblock: COpaquePointer?, quotacharged: COpaquePointer?): ULong

public expect fun exportSecurityContext(phcontext: COpaquePointer?, fflags: UInt, ppackedcontext: COpaquePointer?, ptoken: COpaquePointer?): Hresult

public expect fun fsRtlAcknowledgeEcp(ecpcontext: COpaquePointer?)

public expect fun fsRtlAcquireFileExclusive(fileobject: COpaquePointer?)

public expect fun fsRtlAddBaseMcbEntry(mcb: COpaquePointer?, vbn: Long, lbn: Long, sectorcount: Long): Boolean

public expect fun fsRtlAddBaseMcbEntryEx(mcb: COpaquePointer?, vbn: Long, lbn: Long, sectorcount: Long): Ntstatus

public expect fun fsRtlAddLargeMcbEntry(mcb: COpaquePointer?, vbn: Long, lbn: Long, sectorcount: Long): Boolean

public expect fun fsRtlAddMcbEntry(mcb: COpaquePointer?, vbn: UInt, lbn: UInt, sectorcount: UInt): Boolean

public expect fun fsRtlAddToTunnelCache(cache: COpaquePointer?, directorykey: ULong, shortname: COpaquePointer?, longname: COpaquePointer?, keybyshortname: Boolean, datalength: UInt, data: COpaquePointer?)

public expect fun fsRtlAddToTunnelCacheEx(cache: COpaquePointer?, directorykey: ULong, shortname: COpaquePointer?, longname: COpaquePointer?, flags: UInt, datalength: UInt, data: COpaquePointer?)

public expect fun fsRtlAllocateAePushLock(pooltype: PoolType, tag: UInt): COpaquePointer?

public expect fun fsRtlAllocateExtraCreateParameter(ecptype: COpaquePointer?, sizeofcontext: UInt, flags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, pooltag: UInt, ecpcontext: COpaquePointer?): Ntstatus

public expect fun fsRtlAllocateExtraCreateParameterFromLookasideList(ecptype: COpaquePointer?, sizeofcontext: UInt, flags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, lookasidelist: COpaquePointer?, ecpcontext: COpaquePointer?): Ntstatus

public expect fun fsRtlAllocateExtraCreateParameterList(flags: UInt, ecplist: COpaquePointer?): Ntstatus

public expect fun fsRtlAllocateFileLock(completelockirproutine: PcompleteLockIrpRoutine, unlockroutine: PunlockRoutine): COpaquePointer?

public expect fun fsRtlAllocateResource(): COpaquePointer?

public expect fun fsRtlAreNamesEqual(constantnamea: COpaquePointer?, constantnameb: COpaquePointer?, ignorecase: Boolean, upcasetable: COpaquePointer?): Boolean

public expect fun fsRtlAreThereCurrentOrInProgressFileLocks(filelock: COpaquePointer?): Boolean

public expect fun fsRtlAreThereWaitingFileLocks(filelock: COpaquePointer?): Boolean

public expect fun fsRtlAreVolumeStartupApplicationsComplete(): Boolean

public expect fun fsRtlBalanceReads(targetdevice: COpaquePointer?): Ntstatus

public expect fun fsRtlCancellableWaitForMultipleObjects(count: UInt, objectarray: COpaquePointer?, waittype: WaitType, timeout: COpaquePointer?, waitblockarray: COpaquePointer?, irp: COpaquePointer?): Ntstatus

public expect fun fsRtlCancellableWaitForSingleObject(obj: COpaquePointer?, timeout: COpaquePointer?, irp: COpaquePointer?): Ntstatus

public expect fun fsRtlChangeBackingFileObject(currentfileobject: COpaquePointer?, newfileobject: COpaquePointer?, changebackingtype: FsrtlChangeBackingType, flags: UInt): Ntstatus

public expect fun fsRtlCheckLockForOplockRequest(filelock: COpaquePointer?, allocationsize: COpaquePointer?): Boolean

public expect fun fsRtlCheckLockForReadAccess(filelock: COpaquePointer?, irp: COpaquePointer?): Boolean

public expect fun fsRtlCheckLockForWriteAccess(filelock: COpaquePointer?, irp: COpaquePointer?): Boolean

public expect fun fsRtlCheckOplock(oplock: COpaquePointer?, irp: COpaquePointer?, context: COpaquePointer?, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus

public expect fun fsRtlCheckOplockEx(oplock: COpaquePointer?, irp: COpaquePointer?, flags: UInt, context: COpaquePointer?, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus

public expect fun fsRtlCheckOplockEx2(oplock: COpaquePointer?, irp: COpaquePointer?, flags: UInt, flagsex2: UInt, completionroutinecontext: COpaquePointer?, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp, timeout: ULong, notifycontext: COpaquePointer?, notifyroutine: PoplockNotifyRoutine): Ntstatus

public expect fun fsRtlCheckUpperOplock(oplock: COpaquePointer?, newloweroplockstate: UInt, completionroutinecontext: COpaquePointer?, completionroutine: PoplockWaitCompleteRoutine, prependroutine: PoplockFsPrepostIrp, flags: UInt): Ntstatus

public expect fun fsRtlCopyRead(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, wait: Boolean, lockkey: UInt, buffer: COpaquePointer?, iostatus: COpaquePointer?, deviceobject: COpaquePointer?): Boolean

public expect fun fsRtlCopyWrite(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, wait: Boolean, lockkey: UInt, buffer: COpaquePointer?, iostatus: COpaquePointer?, deviceobject: COpaquePointer?): Boolean

public expect fun fsRtlCreateSectionForDataScan(sectionhandle: COpaquePointer?, sectionobject: COpaquePointer?, sectionfilesize: COpaquePointer?, fileobject: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, maximumsize: COpaquePointer?, sectionpageprotection: UInt, allocationattributes: UInt, flags: UInt): Ntstatus

public expect fun fsRtlCurrentBatchOplock(oplock: COpaquePointer?): Boolean

public expect fun fsRtlCurrentOplock(oplock: COpaquePointer?): Boolean

public expect fun fsRtlCurrentOplockH(oplock: COpaquePointer?): Boolean

public expect fun fsRtlDeleteExtraCreateParameterLookasideList(lookaside: COpaquePointer?, flags: UInt)

public expect fun fsRtlDeleteKeyFromTunnelCache(cache: COpaquePointer?, directorykey: ULong)

public expect fun fsRtlDeleteTunnelCache(cache: COpaquePointer?)

public expect fun fsRtlDeregisterUncProvider(handle: Handle)

public expect fun fsRtlDismountComplete(deviceobject: COpaquePointer?, dismountstatus: Ntstatus)

public expect fun fsRtlDissectDbcs(path: String, firstname: COpaquePointer?, remainingname: COpaquePointer?)

public expect fun fsRtlDissectName(path: UnicodeString, firstname: COpaquePointer?, remainingname: COpaquePointer?)

public expect fun fsRtlDoesDbcsContainWildCards(name: COpaquePointer?): Boolean

public expect fun fsRtlDoesNameContainWildCards(name: COpaquePointer?): Boolean

public expect fun fsRtlFastCheckLockForRead(filelock: COpaquePointer?, startingbyte: COpaquePointer?, length: COpaquePointer?, key: UInt, fileobject: COpaquePointer?, processid: COpaquePointer?): Boolean

public expect fun fsRtlFastCheckLockForWrite(filelock: COpaquePointer?, startingbyte: COpaquePointer?, length: COpaquePointer?, key: UInt, fileobject: COpaquePointer?, processid: COpaquePointer?): Boolean

public expect fun fsRtlFastUnlockAll(filelock: COpaquePointer?, fileobject: COpaquePointer?, processid: Peprocess, context: COpaquePointer?): Ntstatus

public expect fun fsRtlFastUnlockAllByKey(filelock: COpaquePointer?, fileobject: COpaquePointer?, processid: Peprocess, key: UInt, context: COpaquePointer?): Ntstatus

public expect fun fsRtlFastUnlockSingle(filelock: COpaquePointer?, fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: COpaquePointer?, processid: Peprocess, key: UInt, context: COpaquePointer?, alreadysynchronized: Boolean): Ntstatus

public expect fun fsRtlFindExtraCreateParameter(ecplist: COpaquePointer?, ecptype: COpaquePointer?, ecpcontext: COpaquePointer?, ecpcontextsize: COpaquePointer?): Ntstatus

public expect fun fsRtlFindInTunnelCache(cache: COpaquePointer?, directorykey: ULong, name: COpaquePointer?, shortname: COpaquePointer?, longname: COpaquePointer?, datalength: COpaquePointer?, data: COpaquePointer?): Boolean

public expect fun fsRtlFindInTunnelCacheEx(cache: COpaquePointer?, directorykey: ULong, name: COpaquePointer?, shortname: COpaquePointer?, longname: COpaquePointer?, flags: UInt, datalength: COpaquePointer?, data: COpaquePointer?): Boolean

public expect fun fsRtlFreeAePushLock(aepushlock: COpaquePointer?)

public expect fun fsRtlFreeExtraCreateParameter(ecpcontext: COpaquePointer?)

public expect fun fsRtlFreeExtraCreateParameterList(ecplist: COpaquePointer?)

public expect fun fsRtlFreeFileLock(filelock: COpaquePointer?)

public expect fun fsRtlGetCurrentProcessLoaderList(): COpaquePointer?

public expect fun fsRtlGetEcpListFromIrp(irp: COpaquePointer?, ecplist: COpaquePointer?): Ntstatus

public expect fun fsRtlGetFileSize(fileobject: COpaquePointer?, filesize: COpaquePointer?): Ntstatus

public expect fun fsRtlGetNextBaseMcbEntry(mcb: COpaquePointer?, runindex: UInt, vbn: COpaquePointer?, lbn: COpaquePointer?, sectorcount: COpaquePointer?): Boolean

public expect fun fsRtlGetNextExtraCreateParameter(ecplist: COpaquePointer?, currentecpcontext: COpaquePointer?, nextecptype: COpaquePointer?, nextecpcontext: COpaquePointer?, nextecpcontextsize: COpaquePointer?): Ntstatus

public expect fun fsRtlGetNextFileLock(filelock: COpaquePointer?, restart: Boolean): COpaquePointer?

public expect fun fsRtlGetNextLargeMcbEntry(mcb: COpaquePointer?, runindex: UInt, vbn: COpaquePointer?, lbn: COpaquePointer?, sectorcount: COpaquePointer?): Boolean

public expect fun fsRtlGetNextMcbEntry(mcb: COpaquePointer?, runindex: UInt, vbn: COpaquePointer?, lbn: COpaquePointer?, sectorcount: COpaquePointer?): Boolean

public expect fun fsRtlGetSectorSizeInformation(deviceobject: COpaquePointer?, sectorsizeinfo: COpaquePointer?): Ntstatus

public expect fun fsRtlGetSupportedFeatures(deviceobject: COpaquePointer?, supportedfeatures: COpaquePointer?): Ntstatus

public expect fun fsRtlGetVirtualDiskNestingLevel(deviceobject: COpaquePointer?, nestinglevel: COpaquePointer?, nestingflags: COpaquePointer?): Ntstatus

public expect fun fsRtlIncrementCcFastMdlReadWait()

public expect fun fsRtlIncrementCcFastReadNoWait()

public expect fun fsRtlIncrementCcFastReadNotPossible()

public expect fun fsRtlIncrementCcFastReadResourceMiss()

public expect fun fsRtlIncrementCcFastReadWait()

public expect fun fsRtlInitExtraCreateParameterLookasideList(lookaside: COpaquePointer?, flags: UInt, size: ULong, tag: UInt)

public expect fun fsRtlInitializeBaseMcb(mcb: COpaquePointer?, pooltype: PoolType)

public expect fun fsRtlInitializeBaseMcbEx(mcb: COpaquePointer?, pooltype: PoolType, flags: UShort): Boolean

public expect fun fsRtlInitializeExtraCreateParameter(ecp: COpaquePointer?, ecpflags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, totalsize: UInt, ecptype: COpaquePointer?, listallocatedfrom: COpaquePointer?)

public expect fun fsRtlInitializeExtraCreateParameterList(ecplist: COpaquePointer?): Ntstatus

public expect fun fsRtlInitializeFileLock(filelock: COpaquePointer?, completelockirproutine: PcompleteLockIrpRoutine, unlockroutine: PunlockRoutine)

public expect fun fsRtlInitializeLargeMcb(mcb: COpaquePointer?, pooltype: PoolType)

public expect fun fsRtlInitializeMcb(mcb: COpaquePointer?, pooltype: PoolType)

public expect fun fsRtlInitializeOplock(oplock: COpaquePointer?)

public expect fun fsRtlInitializeTunnelCache(cache: COpaquePointer?)

public expect fun fsRtlInsertExtraCreateParameter(ecplist: COpaquePointer?, ecpcontext: COpaquePointer?): Ntstatus

public expect fun fsRtlInsertPerFileContext(perfilecontextpointer: COpaquePointer?, ptr: COpaquePointer?): Ntstatus

public expect fun fsRtlInsertPerFileObjectContext(fileobject: COpaquePointer?, ptr: COpaquePointer?): Ntstatus

public expect fun fsRtlInsertPerStreamContext(perstreamcontext: COpaquePointer?, ptr: COpaquePointer?): Ntstatus

public expect fun fsRtlIs32BitProcess(process: Peprocess): Boolean

public expect fun fsRtlIsDaxVolume(fileobject: COpaquePointer?): Boolean

public expect fun fsRtlIsDbcsInExpression(expression: COpaquePointer?, name: COpaquePointer?): Boolean

public expect fun fsRtlIsEcpAcknowledged(ecpcontext: COpaquePointer?): Boolean

public expect fun fsRtlIsEcpFromUserMode(ecpcontext: COpaquePointer?): Boolean

public expect fun fsRtlIsExtentDangling(startpage: UInt, numberofpages: UInt, flags: UInt): UInt

public expect fun fsRtlIsFatDbcsLegal(dbcsname: String, wildcardspermissible: Boolean, pathnamepermissible: Boolean, leadingbackslashpermissible: Boolean): Boolean

public expect fun fsRtlIsHpfsDbcsLegal(dbcsname: String, wildcardspermissible: Boolean, pathnamepermissible: Boolean, leadingbackslashpermissible: Boolean): Boolean

public expect fun fsRtlIsMobileOS(): Boolean

public expect fun fsRtlIsNameInExpression(expression: COpaquePointer?, name: COpaquePointer?, ignorecase: Boolean, upcasetable: Pcwstr): Boolean

public expect fun fsRtlIsNameInUnUpcasedExpression(expression: COpaquePointer?, name: COpaquePointer?, ignorecase: Boolean, upcasetable: Pcwstr): Boolean

public expect fun fsRtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag: UInt): Boolean

public expect fun fsRtlIsNtstatusExpected(exception: Ntstatus): Boolean

public expect fun fsRtlIsPagingFile(fileobject: COpaquePointer?): UInt

public expect fun fsRtlIsSystemPagingFile(fileobject: COpaquePointer?): UInt

public expect fun fsRtlIssueDeviceIoControl(deviceobject: COpaquePointer?, ioctl: UInt, flags: UByte, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt, iosbinformation: COpaquePointer?): Ntstatus

public expect fun fsRtlKernelFsControlFile(fileobject: COpaquePointer?, fscontrolcode: UInt, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt, retoutputbuffersize: COpaquePointer?): Ntstatus

public expect fun fsRtlLogCcFlushError(filename: COpaquePointer?, deviceobject: COpaquePointer?, sectionobjectpointer: COpaquePointer?, flusherror: Ntstatus, flags: UInt): Ntstatus

public expect fun fsRtlLookupBaseMcbEntry(mcb: COpaquePointer?, vbn: Long, lbn: COpaquePointer?, sectorcountfromlbn: COpaquePointer?, startinglbn: COpaquePointer?, sectorcountfromstartinglbn: COpaquePointer?, index: COpaquePointer?): Boolean

public expect fun fsRtlLookupLargeMcbEntry(mcb: COpaquePointer?, vbn: Long, lbn: COpaquePointer?, sectorcountfromlbn: COpaquePointer?, startinglbn: COpaquePointer?, sectorcountfromstartinglbn: COpaquePointer?, index: COpaquePointer?): Boolean

public expect fun fsRtlLookupLastBaseMcbEntry(mcb: COpaquePointer?, vbn: COpaquePointer?, lbn: COpaquePointer?): Boolean

public expect fun fsRtlLookupLastBaseMcbEntryAndIndex(opaquemcb: COpaquePointer?, largevbn: COpaquePointer?, largelbn: COpaquePointer?, index: COpaquePointer?): Boolean

public expect fun fsRtlLookupLastLargeMcbEntry(mcb: COpaquePointer?, vbn: COpaquePointer?, lbn: COpaquePointer?): Boolean

public expect fun fsRtlLookupLastLargeMcbEntryAndIndex(opaquemcb: COpaquePointer?, largevbn: COpaquePointer?, largelbn: COpaquePointer?, index: COpaquePointer?): Boolean

public expect fun fsRtlLookupLastMcbEntry(mcb: COpaquePointer?, vbn: COpaquePointer?, lbn: COpaquePointer?): Boolean

public expect fun fsRtlLookupMcbEntry(mcb: COpaquePointer?, vbn: UInt, lbn: COpaquePointer?, sectorcount: COpaquePointer?, index: COpaquePointer?): Boolean

public expect fun fsRtlLookupPerFileContext(perfilecontextpointer: COpaquePointer?, ownerid: COpaquePointer?, instanceid: COpaquePointer?): COpaquePointer?

public expect fun fsRtlLookupPerFileObjectContext(fileobject: COpaquePointer?, ownerid: COpaquePointer?, instanceid: COpaquePointer?): COpaquePointer?

public expect fun fsRtlLookupPerStreamContextInternal(streamcontext: COpaquePointer?, ownerid: COpaquePointer?, instanceid: COpaquePointer?): COpaquePointer?

public expect fun fsRtlMdlReadCompleteDev(fileobject: COpaquePointer?, mdlchain: COpaquePointer?, deviceobject: COpaquePointer?): Boolean

public expect fun fsRtlMdlReadDev(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, lockkey: UInt, mdlchain: COpaquePointer?, iostatus: COpaquePointer?, deviceobject: COpaquePointer?): Boolean

public expect fun fsRtlMdlReadEx(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, lockkey: UInt, mdlchain: COpaquePointer?, iostatus: COpaquePointer?): Ntstatus

public expect fun fsRtlMdlWriteCompleteDev(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, mdlchain: COpaquePointer?, deviceobject: COpaquePointer?): Boolean

public expect fun fsRtlMupGetProviderIdFromName(pprovidername: COpaquePointer?, pproviderid: COpaquePointer?): Ntstatus

public expect fun fsRtlMupGetProviderInfoFromFileObject(pfileobject: COpaquePointer?, level: UInt, pbuffer: COpaquePointer?, pbuffersize: COpaquePointer?): Ntstatus

public expect fun fsRtlNormalizeNtstatus(exception: Ntstatus, genericexception: Ntstatus): Ntstatus

public expect fun fsRtlNotifyCleanup(notifysync: PnotifySync, notifylist: COpaquePointer?, fscontext: COpaquePointer?)

public expect fun fsRtlNotifyCleanupAll(notifysync: PnotifySync, notifylist: COpaquePointer?)

public expect fun fsRtlNotifyFilterChangeDirectory(notifysync: PnotifySync, notifylist: COpaquePointer?, fscontext: COpaquePointer?, fulldirectoryname: COpaquePointer?, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifyirp: COpaquePointer?, traversecallback: PcheckForTraverseAccess, subjectcontext: COpaquePointer?, filtercallback: PfilterReportChange)

public expect fun fsRtlNotifyFilterReportChange(notifysync: PnotifySync, notifylist: COpaquePointer?, fulltargetname: COpaquePointer?, targetnameoffset: UShort, streamname: COpaquePointer?, normalizedparentname: COpaquePointer?, filtermatch: UInt, action: UInt, targetcontext: COpaquePointer?, filtercontext: COpaquePointer?)

public expect fun fsRtlNotifyFullChangeDirectory(notifysync: PnotifySync, notifylist: COpaquePointer?, fscontext: COpaquePointer?, fulldirectoryname: COpaquePointer?, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifyirp: COpaquePointer?, traversecallback: PcheckForTraverseAccess, subjectcontext: COpaquePointer?)

public expect fun fsRtlNotifyFullReportChange(notifysync: PnotifySync, notifylist: COpaquePointer?, fulltargetname: COpaquePointer?, targetnameoffset: UShort, streamname: COpaquePointer?, normalizedparentname: COpaquePointer?, filtermatch: UInt, action: UInt, targetcontext: COpaquePointer?)

public expect fun fsRtlNotifyInitializeSync(notifysync: COpaquePointer?)

public expect fun fsRtlNotifyUninitializeSync(notifysync: COpaquePointer?)

public expect fun fsRtlNotifyVolumeEvent(fileobject: COpaquePointer?, eventcode: UInt): Ntstatus

public expect fun fsRtlNotifyVolumeEventEx(fileobject: COpaquePointer?, eventcode: UInt, event: COpaquePointer?): Ntstatus

public expect fun fsRtlNumberOfRunsInBaseMcb(mcb: COpaquePointer?): UInt

public expect fun fsRtlNumberOfRunsInLargeMcb(mcb: COpaquePointer?): UInt

public expect fun fsRtlNumberOfRunsInMcb(mcb: COpaquePointer?): UInt

public expect fun fsRtlOplockBreakH(oplock: COpaquePointer?, irp: COpaquePointer?, flags: UInt, context: COpaquePointer?, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus

public expect fun fsRtlOplockBreakH2(oplock: COpaquePointer?, irp: COpaquePointer?, flags: UInt, context: COpaquePointer?, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp, grantedaccess: COpaquePointer?, shareaccess: COpaquePointer?): Ntstatus

public expect fun fsRtlOplockBreakToNone(oplock: COpaquePointer?, irpsp: COpaquePointer?, irp: COpaquePointer?, context: COpaquePointer?, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus

public expect fun fsRtlOplockBreakToNoneEx(oplock: COpaquePointer?, irp: COpaquePointer?, flags: UInt, context: COpaquePointer?, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus

public expect fun fsRtlOplockFsctrl(oplock: COpaquePointer?, irp: COpaquePointer?, opencount: UInt): Ntstatus

public expect fun fsRtlOplockFsctrlEx(oplock: COpaquePointer?, irp: COpaquePointer?, opencount: UInt, flags: UInt): Ntstatus

public expect fun fsRtlOplockGetAnyBreakOwnerProcess(oplock: COpaquePointer?): Peprocess

public expect fun fsRtlOplockIsFastIoPossible(oplock: COpaquePointer?): Boolean

public expect fun fsRtlOplockIsSharedRequest(irp: COpaquePointer?): Boolean

public expect fun fsRtlOplockKeysEqual(fo1: COpaquePointer?, fo2: COpaquePointer?): Boolean

public expect fun fsRtlPostPagingFileStackOverflow(context: COpaquePointer?, event: COpaquePointer?, stackoverflowroutine: PfsrtlStackOverflowRoutine)

public expect fun fsRtlPostStackOverflow(context: COpaquePointer?, event: COpaquePointer?, stackoverflowroutine: PfsrtlStackOverflowRoutine)

public expect fun fsRtlPrepareMdlWriteDev(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, lockkey: UInt, mdlchain: COpaquePointer?, iostatus: COpaquePointer?, deviceobject: COpaquePointer?): Boolean

public expect fun fsRtlPrepareMdlWriteEx(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, lockkey: UInt, mdlchain: COpaquePointer?, iostatus: COpaquePointer?): Ntstatus

public expect fun fsRtlPrepareToReuseEcp(ecpcontext: COpaquePointer?)

public expect fun fsRtlPrivateLock(filelock: COpaquePointer?, fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: COpaquePointer?, processid: Peprocess, key: UInt, failimmediately: Boolean, exclusivelock: Boolean, iosb: COpaquePointer?, irp: COpaquePointer?, context: COpaquePointer?, alreadysynchronized: Boolean): Boolean

public expect fun fsRtlProcessFileLock(filelock: COpaquePointer?, irp: COpaquePointer?, context: COpaquePointer?): Ntstatus

public expect fun fsRtlQueryCachedVdl(fileobject: COpaquePointer?, vdl: COpaquePointer?): Ntstatus

public expect fun fsRtlQueryInformationFile(fileobject: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass, retfileinformationsize: COpaquePointer?): Ntstatus

public expect fun fsRtlQueryKernelEaFile(fileobject: COpaquePointer?, returnedeadata: COpaquePointer?, length: UInt, returnsingleentry: Boolean, ealist: COpaquePointer?, ealistlength: UInt, eaindex: COpaquePointer?, restartscan: Boolean, lengthreturned: COpaquePointer?): Ntstatus

public expect fun fsRtlQueryMaximumVirtualDiskNestingLevel(): UInt

public expect fun fsRtlRegisterFileSystemFilterCallbacks(filterdriverobject: COpaquePointer?, callbacks: COpaquePointer?): Ntstatus

public expect fun fsRtlRegisterUncProvider(muphandle: COpaquePointer?, redirectordevicename: COpaquePointer?, mailslotssupported: Boolean): Ntstatus

public expect fun fsRtlRegisterUncProviderEx(muphandle: COpaquePointer?, redirdevname: COpaquePointer?, deviceobject: COpaquePointer?, flags: UInt): Ntstatus

public expect fun fsRtlRegisterUncProviderEx2(redirdevname: COpaquePointer?, deviceobject: COpaquePointer?, registration: COpaquePointer?, muphandle: COpaquePointer?): Ntstatus

public expect fun fsRtlReleaseFile(fileobject: COpaquePointer?)

public expect fun fsRtlRemoveBaseMcbEntry(mcb: COpaquePointer?, vbn: Long, sectorcount: Long): Boolean

public expect fun fsRtlRemoveDotsFromPath(originalstring: Pwstr, pathlength: UShort, newlength: COpaquePointer?): Ntstatus

public expect fun fsRtlRemoveExtraCreateParameter(ecplist: COpaquePointer?, ecptype: COpaquePointer?, ecpcontext: COpaquePointer?, ecpcontextsize: COpaquePointer?): Ntstatus

public expect fun fsRtlRemoveLargeMcbEntry(mcb: COpaquePointer?, vbn: Long, sectorcount: Long)

public expect fun fsRtlRemoveMcbEntry(mcb: COpaquePointer?, vbn: UInt, sectorcount: UInt)

public expect fun fsRtlRemovePerFileContext(perfilecontextpointer: COpaquePointer?, ownerid: COpaquePointer?, instanceid: COpaquePointer?): COpaquePointer?

public expect fun fsRtlRemovePerFileObjectContext(fileobject: COpaquePointer?, ownerid: COpaquePointer?, instanceid: COpaquePointer?): COpaquePointer?

public expect fun fsRtlRemovePerStreamContext(streamcontext: COpaquePointer?, ownerid: COpaquePointer?, instanceid: COpaquePointer?): COpaquePointer?

public expect fun fsRtlResetBaseMcb(mcb: COpaquePointer?)

public expect fun fsRtlResetLargeMcb(mcb: COpaquePointer?, selfsynchronized: Boolean)

public expect fun fsRtlSetDriverBacking(driverobj: COpaquePointer?, flags: UInt): Ntstatus

public expect fun fsRtlSetEcpListIntoIrp(irp: COpaquePointer?, ecplist: COpaquePointer?): Ntstatus

public expect fun fsRtlSetKernelEaFile(fileobject: COpaquePointer?, eabuffer: COpaquePointer?, length: UInt): Ntstatus

public expect fun fsRtlSplitBaseMcb(mcb: COpaquePointer?, vbn: Long, amount: Long): Boolean

public expect fun fsRtlSplitLargeMcb(mcb: COpaquePointer?, vbn: Long, amount: Long): Boolean

public expect fun fsRtlTeardownPerFileContexts(perfilecontextpointer: COpaquePointer?)

public expect fun fsRtlTeardownPerStreamContexts(advancedheader: COpaquePointer?)

public expect fun fsRtlTruncateBaseMcb(mcb: COpaquePointer?, vbn: Long)

public expect fun fsRtlTruncateLargeMcb(mcb: COpaquePointer?, vbn: Long)

public expect fun fsRtlTruncateMcb(mcb: COpaquePointer?, vbn: UInt)

public expect fun fsRtlUninitializeBaseMcb(mcb: COpaquePointer?)

public expect fun fsRtlUninitializeFileLock(filelock: COpaquePointer?)

public expect fun fsRtlUninitializeLargeMcb(mcb: COpaquePointer?)

public expect fun fsRtlUninitializeMcb(mcb: COpaquePointer?)

public expect fun fsRtlUninitializeOplock(oplock: COpaquePointer?)

public expect fun fsRtlUpdateDiskCounters(bytesread: ULong, byteswritten: ULong)

public expect fun fsRtlUpperOplockFsctrl(oplock: COpaquePointer?, irp: COpaquePointer?, opencount: UInt, loweroplockstate: UInt, flags: UInt): Ntstatus

public expect fun fsRtlValidateReparsePointBuffer(bufferlength: UInt, reparsebuffer: COpaquePointer?): Ntstatus

public expect fun fsRtlVolumeDeviceToCorrelationId(volumedeviceobject: COpaquePointer?, guid: COpaquePointer?): Ntstatus

public expect fun getSecurityUserInfo(logonid: COpaquePointer?, flags: UInt, userinformation: COpaquePointer?): Ntstatus

public expect fun ioAcquireVpbSpinLock(irql: COpaquePointer?)

public expect fun ioApplyPriorityInfoThread(inputpriorityinfo: COpaquePointer?, outputpriorityinfo: COpaquePointer?, thread: Pethread): Ntstatus

public expect fun ioCheckDesiredAccess(desiredaccess: COpaquePointer?, grantedaccess: UInt): Ntstatus

public expect fun ioCheckEaBufferValidity(eabuffer: COpaquePointer?, ealength: UInt, erroroffset: COpaquePointer?): Ntstatus

public expect fun ioCheckFunctionAccess(grantedaccess: UInt, majorfunction: UByte, minorfunction: UByte, iocontrolcode: UInt, arg1: COpaquePointer?, arg2: COpaquePointer?): Ntstatus

public expect fun ioCheckQuerySetFileInformation(fileinformationclass: FileInformationClass, length: UInt, setoperation: Boolean): Ntstatus

public expect fun ioCheckQuerySetVolumeInformation(fsinformationclass: FsInformationClass, length: UInt, setoperation: Boolean): Ntstatus

public expect fun ioCheckQuotaBufferValidity(quotabuffer: COpaquePointer?, quotalength: UInt, erroroffset: COpaquePointer?): Ntstatus

public expect fun ioClearFsTrackOffsetState(irp: COpaquePointer?): Ntstatus

public expect fun ioCreateStreamFileObject(fileobject: COpaquePointer?, deviceobject: COpaquePointer?): COpaquePointer?

public expect fun ioCreateStreamFileObjectEx(fileobject: COpaquePointer?, deviceobject: COpaquePointer?, filehandle: COpaquePointer?): COpaquePointer?

public expect fun ioCreateStreamFileObjectEx2(createoptions: COpaquePointer?, fileobject: COpaquePointer?, deviceobject: COpaquePointer?, streamfileobject: COpaquePointer?, filehandle: COpaquePointer?): Ntstatus

public expect fun ioCreateStreamFileObjectLite(fileobject: COpaquePointer?, deviceobject: COpaquePointer?): COpaquePointer?

public expect fun ioEnumerateDeviceObjectList(driverobject: COpaquePointer?, deviceobjectlist: COpaquePointer?, deviceobjectlistsize: UInt, actualnumberdeviceobjects: COpaquePointer?): Ntstatus

public expect fun ioEnumerateRegisteredFiltersList(driverobjectlist: COpaquePointer?, driverobjectlistsize: UInt, actualnumberdriverobjects: COpaquePointer?): Ntstatus

public expect fun ioFastQueryNetworkAttributes(objectattributes: COpaquePointer?, desiredaccess: UInt, openoptions: UInt, iostatus: COpaquePointer?, buffer: COpaquePointer?): Boolean

public expect fun ioGetAttachedDevice(deviceobject: COpaquePointer?): COpaquePointer?

public expect fun ioGetBaseFileSystemDeviceObject(fileobject: COpaquePointer?): COpaquePointer?

public expect fun ioGetDeviceAttachmentBaseRef(deviceobject: COpaquePointer?): COpaquePointer?

public expect fun ioGetDeviceToVerify(thread: Pethread): COpaquePointer?

public expect fun ioGetDiskDeviceObject(filesystemdeviceobject: COpaquePointer?, diskdeviceobject: COpaquePointer?): Ntstatus

public expect fun ioGetFsTrackOffsetState(irp: COpaquePointer?, retfstrackoffsetblob: COpaquePointer?, rettrackedoffset: COpaquePointer?): Ntstatus

public expect fun ioGetLowerDeviceObject(deviceobject: COpaquePointer?): COpaquePointer?

public expect fun ioGetOplockKeyContext(fileobject: COpaquePointer?): COpaquePointer?

public expect fun ioGetOplockKeyContextEx(fileobject: COpaquePointer?): COpaquePointer?

public expect fun ioGetRequestorProcess(irp: COpaquePointer?): Peprocess

public expect fun ioGetRequestorProcessId(irp: COpaquePointer?): UInt

public expect fun ioGetRequestorSessionId(irp: COpaquePointer?, psessionid: COpaquePointer?): Ntstatus

public expect fun ioIrpHasFsTrackOffsetExtensionType(irp: COpaquePointer?): Boolean

public expect fun ioIsOperationSynchronous(irp: COpaquePointer?): Boolean

public expect fun ioIsSystemThread(thread: Pethread): Boolean

public expect fun ioIsValidNameGraftingBuffer(irp: COpaquePointer?, reparsebuffer: COpaquePointer?): Boolean

public expect fun ioPageRead(fileobject: COpaquePointer?, memorydescriptorlist: COpaquePointer?, startingoffset: COpaquePointer?, event: COpaquePointer?, iostatusblock: COpaquePointer?): Ntstatus

public expect fun ioQueryFileDosDeviceName(fileobject: COpaquePointer?, objectnameinformation: COpaquePointer?): Ntstatus

public expect fun ioQueryFileInformation(fileobject: COpaquePointer?, fileinformationclass: FileInformationClass, length: UInt, fileinformation: COpaquePointer?, returnedlength: COpaquePointer?): Ntstatus

public expect fun ioQueryVolumeInformation(fileobject: COpaquePointer?, fsinformationclass: FsInformationClass, length: UInt, fsinformation: COpaquePointer?, returnedlength: COpaquePointer?): Ntstatus

public expect fun ioQueueThreadIrp(irp: COpaquePointer?)

public expect fun ioRegisterFileSystem(deviceobject: COpaquePointer?)

public expect fun ioRegisterFsRegistrationChange(driverobject: COpaquePointer?, drivernotificationroutine: DriverFsNotification): Ntstatus

public expect fun ioRegisterFsRegistrationChangeMountAware(driverobject: COpaquePointer?, drivernotificationroutine: DriverFsNotification, synchronizewithmounts: Boolean): Ntstatus

public expect fun ioReleaseVpbSpinLock(irql: UByte)

public expect fun ioReplaceFileObjectName(fileobject: COpaquePointer?, newfilename: Pcwstr, filenamelength: UShort): Ntstatus

public expect fun ioRequestDeviceRemovalForReset(physicaldeviceobject: COpaquePointer?, flags: UInt): Ntstatus

public expect fun ioRetrievePriorityInfo(irp: COpaquePointer?, fileobject: COpaquePointer?, thread: Pethread, priorityinfo: COpaquePointer?): Ntstatus

public expect fun ioSetDeviceToVerify(thread: Pethread, deviceobject: COpaquePointer?)

public expect fun ioSetFsTrackOffsetState(irp: COpaquePointer?, fstrackoffsetblob: COpaquePointer?, trackedoffset: Long): Ntstatus

public expect fun ioSetInformation(fileobject: COpaquePointer?, fileinformationclass: FileInformationClass, length: UInt, fileinformation: COpaquePointer?): Ntstatus

public expect fun ioSynchronousPageWrite(fileobject: COpaquePointer?, memorydescriptorlist: COpaquePointer?, startingoffset: COpaquePointer?, event: COpaquePointer?, iostatusblock: COpaquePointer?): Ntstatus

public expect fun ioThreadToProcess(thread: Pethread): Peprocess

public expect fun ioUnregisterFileSystem(deviceobject: COpaquePointer?)

public expect fun ioUnregisterFsRegistrationChange(driverobject: COpaquePointer?, drivernotificationroutine: DriverFsNotification)

public expect fun ioVerifyVolume(deviceobject: COpaquePointer?, allowrawmount: Boolean): Ntstatus

public expect fun keAcquireQueuedSpinLock(number: KspinLockQueueNumber): UByte

public expect fun keAcquireSpinLockRaiseToSynch(spinlock: COpaquePointer?): UByte

public expect fun keAttachProcess(process: Prkprocess)

public expect fun keDetachProcess()

public expect fun keInitializeMutant(mutant: COpaquePointer?, initialowner: Boolean)

public expect fun keInitializeQueue(queue: COpaquePointer?, count: UInt)

public expect fun keInsertHeadQueue(queue: COpaquePointer?, entry: COpaquePointer?): Int

public expect fun keInsertQueue(queue: COpaquePointer?, entry: COpaquePointer?): Int

public expect fun keReadStateMutant(mutant: COpaquePointer?): Int

public expect fun keReadStateQueue(queue: COpaquePointer?): Int

public expect fun keReleaseMutant(mutant: COpaquePointer?, increment: Int, abandoned: Boolean, wait: Boolean): Int

public expect fun keReleaseQueuedSpinLock(number: KspinLockQueueNumber, oldirql: UByte)

public expect fun keRemoveQueue(queue: COpaquePointer?, waitmode: Byte, timeout: COpaquePointer?): COpaquePointer?

public expect fun keRemoveQueueEx(queue: COpaquePointer?, waitmode: Byte, alertable: Boolean, timeout: COpaquePointer?, entryarray: COpaquePointer?, count: UInt): UInt

public expect fun keRundownQueue(queue: COpaquePointer?): COpaquePointer?

public expect fun keSetIdealProcessorThread(thread: Pkthread, processor: UByte): UByte

public expect fun keSetKernelStackSwapEnable(enable: Boolean): Boolean

public expect fun keStackAttachProcess(process: Prkprocess, apcstate: COpaquePointer?)

public expect fun keTryToAcquireQueuedSpinLock(number: KspinLockQueueNumber, oldirql: COpaquePointer?): UInt

public expect fun keUnstackDetachProcess(apcstate: COpaquePointer?)

public expect fun makeSignature(phcontext: COpaquePointer?, fqop: UInt, pmessage: COpaquePointer?, messageseqno: UInt): Hresult

public expect fun mapSecurityError(secstatus: Hresult): Ntstatus

public expect fun mmCanFileBeTruncated(sectionpointer: COpaquePointer?, newfilesize: COpaquePointer?): Boolean

public expect fun mmDoesFileHaveUserWritableReferences(sectionpointer: COpaquePointer?): UInt

public expect fun mmFlushImageSection(sectionobjectpointer: COpaquePointer?, flushtype: MmflushType): Boolean

public expect fun mmForceSectionClosed(sectionobjectpointer: COpaquePointer?, delayclose: Boolean): Boolean

public expect fun mmForceSectionClosedEx(sectionobjectpointer: COpaquePointer?, forcecloseflags: UInt): Boolean

public expect fun mmGetMaximumFileSectionSize(): ULong

public expect fun mmIsFileSectionActive(fssectionpointer: COpaquePointer?, flags: UInt, sectionisactive: COpaquePointer?): Ntstatus

public expect fun mmIsRecursiveIoFault(): Boolean

public expect fun mmMdlPagesAreZero(mdl: COpaquePointer?): UInt

public expect fun mmPrefetchPages(numberoflists: UInt, readlists: COpaquePointer?): Ntstatus

public expect fun mmSetAddressRangeModified(address: COpaquePointer?, length: ULong): Boolean

public expect fun ntAccessCheckAndAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, objecttypename: COpaquePointer?, objectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, desiredaccess: UInt, genericmapping: COpaquePointer?, objectcreation: Boolean, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, generateonclose: COpaquePointer?): Ntstatus

public expect fun ntAccessCheckByTypeAndAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, objecttypename: COpaquePointer?, objectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Boolean, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, generateonclose: COpaquePointer?): Ntstatus

public expect fun ntAccessCheckByTypeResultListAndAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, objecttypename: COpaquePointer?, objectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Boolean, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, generateonclose: COpaquePointer?): Ntstatus

public expect fun ntAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname: COpaquePointer?, handleid: COpaquePointer?, clienttoken: Handle, objecttypename: COpaquePointer?, objectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Boolean, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, generateonclose: COpaquePointer?): Ntstatus

public expect fun ntAdjustGroupsToken(tokenhandle: Handle, resettodefault: Boolean, newstate: COpaquePointer?, bufferlength: UInt, previousstate: COpaquePointer?, returnlength: COpaquePointer?): Ntstatus

public expect fun ntAdjustPrivilegesToken(tokenhandle: Handle, disableallprivileges: Boolean, newstate: COpaquePointer?, bufferlength: UInt, previousstate: COpaquePointer?, returnlength: COpaquePointer?): Ntstatus

public expect fun ntAllocateVirtualMemory(processhandle: Handle, baseaddress: COpaquePointer?, zerobits: ULong, regionsize: COpaquePointer?, allocationtype: UInt, protect: UInt): Ntstatus

public expect fun ntAllocateVirtualMemoryEx(processhandle: Handle, baseaddress: COpaquePointer?, regionsize: COpaquePointer?, allocationtype: UInt, pageprotection: UInt, extendedparameters: COpaquePointer?, extendedparametercount: UInt): Ntstatus

public expect fun ntCancelIoFileEx(filehandle: Handle, iorequesttocancel: COpaquePointer?, iostatusblock: COpaquePointer?): Ntstatus

public expect fun ntCloseObjectAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, generateonclose: Boolean): Ntstatus

public expect fun ntCreateDirectoryObject(directoryhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus

public expect fun ntCreateEvent(eventhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, eventtype: EventType, initialstate: Boolean): Ntstatus

public expect fun ntCreateFile(filehandle: COpaquePointer?, desiredaccess: FileAccessRights, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, allocationsize: COpaquePointer?, fileattributes: FileFlagsAndAttributes, shareaccess: FileShareMode, createdisposition: NtcreatefileCreateDisposition, createoptions: NtcreatefileCreateOptions, eabuffer: COpaquePointer?, ealength: UInt): Ntstatus

public expect fun ntCreateSection(sectionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, maximumsize: COpaquePointer?, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Handle): Ntstatus

public expect fun ntCreateSectionEx(sectionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, maximumsize: COpaquePointer?, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Handle, extendedparameters: COpaquePointer?, extendedparametercount: UInt): Ntstatus

public expect fun ntDeleteFile(objectattributes: COpaquePointer?): Ntstatus

public expect fun ntDeleteObjectAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, generateonclose: Boolean): Ntstatus

public expect fun ntDuplicateObject(sourceprocesshandle: Handle, sourcehandle: Handle, targetprocesshandle: Handle, targethandle: COpaquePointer?, desiredaccess: UInt, handleattributes: UInt, options: UInt): Ntstatus

public expect fun ntDuplicateToken(existingtokenhandle: Handle, desiredaccess: UInt, objectattributes: COpaquePointer?, effectiveonly: Boolean, tokentype: TokenType, newtokenhandle: COpaquePointer?): Ntstatus

public expect fun ntFilterToken(existingtokenhandle: Handle, flags: UInt, sidstodisable: COpaquePointer?, privilegestodelete: COpaquePointer?, restrictedsids: COpaquePointer?, newtokenhandle: COpaquePointer?): Ntstatus

public expect fun ntFlushBuffersFile(filehandle: Handle, iostatusblock: COpaquePointer?): Ntstatus

public expect fun ntFlushBuffersFileEx(filehandle: Handle, flags: UInt, parameters: COpaquePointer?, parameterssize: UInt, iostatusblock: COpaquePointer?): Ntstatus

public expect fun ntFlushVirtualMemory(processhandle: Handle, baseaddress: COpaquePointer?, regionsize: COpaquePointer?, iostatus: COpaquePointer?): Ntstatus

public expect fun ntFreeVirtualMemory(processhandle: Handle, baseaddress: COpaquePointer?, regionsize: COpaquePointer?, freetype: UInt): Ntstatus

public expect fun ntFsControlFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, fscontrolcode: UInt, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt): Ntstatus

public expect fun ntImpersonateAnonymousToken(threadhandle: Handle): Ntstatus

public expect fun ntLockFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, byteoffset: COpaquePointer?, length: COpaquePointer?, key: UInt, failimmediately: Boolean, exclusivelock: Boolean): Ntstatus

public expect fun ntNotifyChangeKey(keyhandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, completionfilter: UInt, watchtree: Boolean, buffer: COpaquePointer?, buffersize: UInt, asynchronous: Boolean): Ntstatus

public expect fun ntOpenDirectoryObject(directoryhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus

public expect fun ntOpenFile(filehandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, shareaccess: UInt, openoptions: UInt): Ntstatus

public expect fun ntOpenObjectAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, objecttypename: COpaquePointer?, objectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, grantedaccess: UInt, privileges: COpaquePointer?, objectcreation: Boolean, accessgranted: Boolean, generateonclose: COpaquePointer?): Ntstatus

public expect fun ntOpenProcessToken(processhandle: Handle, desiredaccess: UInt, tokenhandle: COpaquePointer?): Ntstatus

public expect fun ntOpenProcessTokenEx(processhandle: Handle, desiredaccess: UInt, handleattributes: UInt, tokenhandle: COpaquePointer?): Ntstatus

public expect fun ntOpenSymbolicLinkObject(linkhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus

public expect fun ntOpenThreadToken(threadhandle: Handle, desiredaccess: UInt, openasself: Boolean, tokenhandle: COpaquePointer?): Ntstatus

public expect fun ntOpenThreadTokenEx(threadhandle: Handle, desiredaccess: UInt, openasself: Boolean, handleattributes: UInt, tokenhandle: COpaquePointer?): Ntstatus

public expect fun ntPrivilegeCheck(clienttoken: Handle, requiredprivileges: COpaquePointer?, result: COpaquePointer?): Ntstatus

public expect fun ntPrivilegeObjectAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, clienttoken: Handle, desiredaccess: UInt, privileges: COpaquePointer?, accessgranted: Boolean): Ntstatus

public expect fun ntPrivilegedServiceAuditAlarm(subsystemname: COpaquePointer?, servicename: COpaquePointer?, clienttoken: Handle, privileges: COpaquePointer?, accessgranted: Boolean): Ntstatus

public expect fun ntQueryDirectoryFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass, returnsingleentry: Boolean, filename: COpaquePointer?, restartscan: Boolean): Ntstatus

public expect fun ntQueryDirectoryFileEx(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass, queryflags: UInt, filename: COpaquePointer?): Ntstatus

public expect fun ntQueryDirectoryObject(directoryhandle: Handle, buffer: COpaquePointer?, length: UInt, returnsingleentry: Boolean, restartscan: Boolean, context: COpaquePointer?, returnlength: COpaquePointer?): Ntstatus

public expect fun ntQueryEaFile(filehandle: Handle, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt, returnsingleentry: Boolean, ealist: COpaquePointer?, ealistlength: UInt, eaindex: COpaquePointer?, restartscan: Boolean): Ntstatus

public expect fun ntQueryFullAttributesFile(objectattributes: COpaquePointer?, fileinformation: COpaquePointer?): Ntstatus

public expect fun ntQueryInformationByName(objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass): Ntstatus

public expect fun ntQueryInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass): Ntstatus

public expect fun ntQueryInformationToken(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: COpaquePointer?, tokeninformationlength: UInt, returnlength: COpaquePointer?): Ntstatus

public expect fun ntQueryQuotaInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt, returnsingleentry: Boolean, sidlist: COpaquePointer?, sidlistlength: UInt, startsid: Psid, restartscan: Boolean): Ntstatus

public expect fun ntQuerySecurityObject(handle: Handle, securityinformation: UInt, securitydescriptor: PsecurityDescriptor, length: UInt, lengthneeded: COpaquePointer?): Ntstatus

public expect fun ntQuerySymbolicLinkObject(linkhandle: Handle, linktarget: COpaquePointer?, returnedlength: COpaquePointer?): Ntstatus

public expect fun ntQueryVirtualMemory(processhandle: Handle, baseaddress: COpaquePointer?, memoryinformationclass: MemoryInformationClass, memoryinformation: COpaquePointer?, memoryinformationlength: ULong, returnlength: COpaquePointer?): Ntstatus

public expect fun ntQueryVolumeInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, fsinformation: COpaquePointer?, length: UInt, fsinformationclass: FsInformationClass): Ntstatus

public expect fun ntReadFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt, byteoffset: COpaquePointer?, key: COpaquePointer?): Ntstatus

public expect fun ntSetEaFile(filehandle: Handle, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt): Ntstatus

public expect fun ntSetEvent(eventhandle: Handle, previousstate: COpaquePointer?): Ntstatus

public expect fun ntSetInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass): Ntstatus

public expect fun ntSetInformationToken(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: COpaquePointer?, tokeninformationlength: UInt): Ntstatus

public expect fun ntSetInformationVirtualMemory(processhandle: Handle, vminformationclass: VirtualMemoryInformationClass, numberofentries: ULong, virtualaddresses: COpaquePointer?, vminformation: COpaquePointer?, vminformationlength: UInt): Ntstatus

public expect fun ntSetQuotaInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt): Ntstatus

public expect fun ntSetSecurityObject(handle: Handle, securityinformation: UInt, securitydescriptor: PsecurityDescriptor): Ntstatus

public expect fun ntSetVolumeInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, fsinformation: COpaquePointer?, length: UInt, fsinformationclass: FsInformationClass): Ntstatus

public expect fun ntUnlockFile(filehandle: Handle, iostatusblock: COpaquePointer?, byteoffset: COpaquePointer?, length: COpaquePointer?, key: UInt): Ntstatus

public expect fun ntWriteFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt, byteoffset: COpaquePointer?, key: COpaquePointer?): Ntstatus

public expect fun obInsertObject(obj: COpaquePointer?, passedaccessstate: COpaquePointer?, desiredaccess: UInt, objectpointerbias: UInt, newobject: COpaquePointer?, handle: COpaquePointer?): Ntstatus

public expect fun obIsKernelHandle(handle: Handle): Boolean

public expect fun obMakeTemporaryObject(obj: COpaquePointer?)

public expect fun obOpenObjectByPointer(obj: COpaquePointer?, handleattributes: UInt, passedaccessstate: COpaquePointer?, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, handle: COpaquePointer?): Ntstatus

public expect fun obOpenObjectByPointerWithTag(obj: COpaquePointer?, handleattributes: UInt, passedaccessstate: COpaquePointer?, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, tag: UInt, handle: COpaquePointer?): Ntstatus

public expect fun obQueryNameString(obj: COpaquePointer?, objectnameinfo: COpaquePointer?, length: UInt, returnlength: COpaquePointer?): Ntstatus

public expect fun obQueryObjectAuditingByHandle(handle: Handle, generateonclose: COpaquePointer?): Ntstatus

public expect fun pfxFindPrefix(prefixtable: COpaquePointer?, fullname: COpaquePointer?): COpaquePointer?

public expect fun pfxInitialize(prefixtable: COpaquePointer?)

public expect fun pfxInsertPrefix(prefixtable: COpaquePointer?, prefix: COpaquePointer?, prefixtableentry: COpaquePointer?): Boolean

public expect fun pfxRemovePrefix(prefixtable: COpaquePointer?, prefixtableentry: COpaquePointer?)

public expect fun poQueueShutdownWorkItem(workitem: COpaquePointer?): Ntstatus

public expect fun psAssignImpersonationToken(thread: Pethread, token: Handle): Ntstatus

public expect fun psChargePoolQuota(process: Peprocess, pooltype: PoolType, amount: ULong)

public expect fun psChargeProcessPoolQuota(process: Peprocess, pooltype: PoolType, amount: ULong): Ntstatus

public expect fun psDereferenceImpersonationToken(impersonationtoken: COpaquePointer?)

public expect fun psDereferencePrimaryToken(primarytoken: COpaquePointer?)

public expect fun psDisableImpersonation(thread: Pethread, impersonationstate: COpaquePointer?): Boolean

public expect fun psGetProcessExitTime(): Long

public expect fun psGetThreadProcess(thread: Pethread): Peprocess

public expect fun psImpersonateClient(thread: Pethread, token: COpaquePointer?, copyonopen: Boolean, effectiveonly: Boolean, impersonationlevel: SecurityImpersonationLevel): Ntstatus

public expect fun psIsDiskCountersEnabled(): Boolean

public expect fun psIsSystemThread(thread: Pethread): Boolean

public expect fun psIsThreadTerminating(thread: Pethread): Boolean

public expect fun psLookupProcessByProcessId(processid: Handle, process: COpaquePointer?): Ntstatus

public expect fun psLookupThreadByThreadId(threadid: Handle, thread: COpaquePointer?): Ntstatus

public expect fun psReferenceImpersonationToken(thread: Pethread, copyonopen: COpaquePointer?, effectiveonly: COpaquePointer?, impersonationlevel: COpaquePointer?): COpaquePointer?

public expect fun psReferencePrimaryToken(process: Peprocess): COpaquePointer?

public expect fun psRestoreImpersonation(thread: Pethread, impersonationstate: COpaquePointer?)

public expect fun psReturnPoolQuota(process: Peprocess, pooltype: PoolType, amount: ULong)

public expect fun psRevertToSelf()

public expect fun psUpdateDiskCounters(process: Peprocess, bytesread: ULong, byteswritten: ULong, readoperationcount: UInt, writeoperationcount: UInt, flushoperationcount: UInt)

public expect fun querySecurityContextToken(phcontext: COpaquePointer?, token: COpaquePointer?): Hresult

public expect fun rtlAbsoluteToSelfRelativeSD(absolutesecuritydescriptor: PsecurityDescriptor, selfrelativesecuritydescriptor: PsecurityDescriptor, bufferlength: COpaquePointer?): Ntstatus

public expect fun rtlAddAccessAllowedAce(acl: COpaquePointer?, acerevision: UInt, accessmask: UInt, sid: Psid): Ntstatus

public expect fun rtlAddAccessAllowedAceEx(acl: COpaquePointer?, acerevision: UInt, aceflags: UInt, accessmask: UInt, sid: Psid): Ntstatus

public expect fun rtlAddAce(acl: COpaquePointer?, acerevision: UInt, startingaceindex: UInt, acelist: COpaquePointer?, acelistlength: UInt): Ntstatus

public expect fun rtlAllocateAndInitializeSid(identifierauthority: COpaquePointer?, subauthoritycount: UByte, subauthority0: UInt, subauthority1: UInt, subauthority2: UInt, subauthority3: UInt, subauthority4: UInt, subauthority5: UInt, subauthority6: UInt, subauthority7: UInt, sid: COpaquePointer?): Ntstatus

public expect fun rtlAllocateAndInitializeSidEx(identifierauthority: COpaquePointer?, subauthoritycount: UByte, subauthorities: COpaquePointer?, sid: COpaquePointer?): Ntstatus

public expect fun rtlAllocateHeap(heaphandle: COpaquePointer?, flags: UInt, size: ULong): COpaquePointer?

public expect fun rtlAppendStringToString(destination: COpaquePointer?, source: COpaquePointer?): Ntstatus

public expect fun rtlCompareAltitudes(altitude1: COpaquePointer?, altitude2: COpaquePointer?): Int

public expect fun rtlCompareMemoryUlong(source: COpaquePointer?, length: ULong, pattern: UInt): ULong

public expect fun rtlCompressBuffer(compressionformatandengine: UShort, uncompressedbuffer: COpaquePointer?, uncompressedbuffersize: UInt, compressedbuffer: COpaquePointer?, compressedbuffersize: UInt, uncompressedchunksize: UInt, finalcompressedsize: COpaquePointer?, workspace: COpaquePointer?): Ntstatus

public expect fun rtlCompressChunks(uncompressedbuffer: COpaquePointer?, uncompressedbuffersize: UInt, compressedbuffer: COpaquePointer?, compressedbuffersize: UInt, compresseddatainfo: COpaquePointer?, compresseddatainfolength: UInt, workspace: COpaquePointer?): Ntstatus

public expect fun rtlCopyLuid(destinationluid: COpaquePointer?, sourceluid: COpaquePointer?)

public expect fun rtlCopySid(destinationsidlength: UInt, destinationsid: Psid, sourcesid: Psid): Ntstatus

public expect fun rtlCreateAcl(acl: COpaquePointer?, acllength: UInt, aclrevision: UInt): Ntstatus

public expect fun rtlCreateHeap(flags: UInt, heapbase: COpaquePointer?, reservesize: ULong, commitsize: ULong, lock: COpaquePointer?, parameters: COpaquePointer?): COpaquePointer?

public expect fun rtlCreateServiceSid(servicename: COpaquePointer?, servicesid: Psid, servicesidlength: COpaquePointer?): Ntstatus

public expect fun rtlCreateSystemVolumeInformationFolder(volumerootpath: COpaquePointer?): Ntstatus

public expect fun rtlCreateUnicodeString(destinationstring: COpaquePointer?, sourcestring: Pcwstr): Boolean

public expect fun rtlCreateVirtualAccountSid(name: COpaquePointer?, basesubauthority: UInt, sid: Psid, sidlength: COpaquePointer?): Ntstatus

public expect fun rtlCustomCPToUnicodeN(customcp: COpaquePointer?, unicodestring: Pwstr, maxbytesinunicodestring: UInt, bytesinunicodestring: COpaquePointer?, customcpstring: Pcstr, bytesincustomcpstring: UInt): Ntstatus

public expect fun rtlDecompressBuffer(compressionformat: UShort, uncompressedbuffer: COpaquePointer?, uncompressedbuffersize: UInt, compressedbuffer: COpaquePointer?, compressedbuffersize: UInt, finaluncompressedsize: COpaquePointer?): Ntstatus

public expect fun rtlDecompressBufferEx(compressionformat: UShort, uncompressedbuffer: COpaquePointer?, uncompressedbuffersize: UInt, compressedbuffer: COpaquePointer?, compressedbuffersize: UInt, finaluncompressedsize: COpaquePointer?, workspace: COpaquePointer?): Ntstatus

public expect fun rtlDecompressBufferEx2(compressionformat: UShort, uncompressedbuffer: COpaquePointer?, uncompressedbuffersize: UInt, compressedbuffer: COpaquePointer?, compressedbuffersize: UInt, uncompressedchunksize: UInt, finaluncompressedsize: COpaquePointer?, workspace: COpaquePointer?): Ntstatus

public expect fun rtlDecompressChunks(uncompressedbuffer: COpaquePointer?, uncompressedbuffersize: UInt, compressedbuffer: COpaquePointer?, compressedbuffersize: UInt, compressedtail: COpaquePointer?, compressedtailsize: UInt, compresseddatainfo: COpaquePointer?): Ntstatus

public expect fun rtlDecompressFragment(compressionformat: UShort, uncompressedfragment: COpaquePointer?, uncompressedfragmentsize: UInt, compressedbuffer: COpaquePointer?, compressedbuffersize: UInt, fragmentoffset: UInt, finaluncompressedsize: COpaquePointer?, workspace: COpaquePointer?): Ntstatus

public expect fun rtlDecompressFragmentEx(compressionformat: UShort, uncompressedfragment: COpaquePointer?, uncompressedfragmentsize: UInt, compressedbuffer: COpaquePointer?, compressedbuffersize: UInt, fragmentoffset: UInt, uncompressedchunksize: UInt, finaluncompressedsize: COpaquePointer?, workspace: COpaquePointer?): Ntstatus

public expect fun rtlDeleteAce(acl: COpaquePointer?, aceindex: UInt): Ntstatus

public expect fun rtlDescribeChunk(compressionformat: UShort, compressedbuffer: COpaquePointer?, endofcompressedbufferplus1: COpaquePointer?, chunkbuffer: COpaquePointer?, chunksize: COpaquePointer?): Ntstatus

public expect fun rtlDestroyHeap(heaphandle: COpaquePointer?): COpaquePointer?

public expect fun rtlDosPathNameToNtPathNameUWithStatus(dosfilename: Pcwstr, ntfilename: COpaquePointer?, filepart: COpaquePointer?, reserved: COpaquePointer?): Ntstatus

public expect fun rtlDowncaseUnicodeString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus

public expect fun rtlDuplicateUnicodeString(flags: UInt, stringin: COpaquePointer?, stringout: COpaquePointer?): Ntstatus

public expect fun rtlEqualPrefixSid(sid1: Psid, sid2: Psid): Boolean

public expect fun rtlEqualSid(sid1: Psid, sid2: Psid): Boolean

public expect fun rtlFindUnicodePrefix(prefixtable: COpaquePointer?, fullname: COpaquePointer?, caseinsensitiveindex: UInt): COpaquePointer?

public expect fun rtlFreeHeap(heaphandle: COpaquePointer?, flags: UInt, baseaddress: COpaquePointer?): UInt

public expect fun rtlFreeSid(sid: Psid): COpaquePointer?

public expect fun rtlGenerate8dot3Name(name: COpaquePointer?, allowextendedcharacters: Boolean, context: COpaquePointer?, name8dot3: COpaquePointer?): Ntstatus

public expect fun rtlGetAce(acl: COpaquePointer?, aceindex: UInt, ace: COpaquePointer?): Ntstatus

public expect fun rtlGetCompressionWorkSpaceSize(compressionformatandengine: UShort, compressbufferworkspacesize: COpaquePointer?, compressfragmentworkspacesize: COpaquePointer?): Ntstatus

public expect fun rtlGetDaclSecurityDescriptor(securitydescriptor: PsecurityDescriptor, daclpresent: COpaquePointer?, dacl: COpaquePointer?, dacldefaulted: COpaquePointer?): Ntstatus

public expect fun rtlGetGroupSecurityDescriptor(securitydescriptor: PsecurityDescriptor, group: COpaquePointer?, groupdefaulted: COpaquePointer?): Ntstatus

public expect fun rtlGetOwnerSecurityDescriptor(securitydescriptor: PsecurityDescriptor, owner: COpaquePointer?, ownerdefaulted: COpaquePointer?): Ntstatus

public expect fun rtlGetSaclSecurityDescriptor(securitydescriptor: PsecurityDescriptor, saclpresent: COpaquePointer?, sacl: COpaquePointer?, sacldefaulted: COpaquePointer?): Ntstatus

public expect fun rtlIdentifierAuthoritySid(sid: Psid): COpaquePointer?

public expect fun rtlIdnToAscii(flags: UInt, sourcestring: Pcwstr, sourcestringlength: Int, destinationstring: Pwstr, destinationstringlength: COpaquePointer?): Ntstatus

public expect fun rtlIdnToNameprepUnicode(flags: UInt, sourcestring: Pcwstr, sourcestringlength: Int, destinationstring: Pwstr, destinationstringlength: COpaquePointer?): Ntstatus

public expect fun rtlIdnToUnicode(flags: UInt, sourcestring: Pcwstr, sourcestringlength: Int, destinationstring: Pwstr, destinationstringlength: COpaquePointer?): Ntstatus

public expect fun rtlInitCodePageTable(tablebase: COpaquePointer?, codepagetable: COpaquePointer?)

public expect fun rtlInitUnicodeStringEx(destinationstring: COpaquePointer?, sourcestring: Pcwstr): Ntstatus

public expect fun rtlInitializeSid(sid: Psid, identifierauthority: COpaquePointer?, subauthoritycount: UByte): Ntstatus

public expect fun rtlInitializeSidEx(sid: Psid, identifierauthority: COpaquePointer?, subauthoritycount: UByte, vararg variadicArgs: Long): Ntstatus

public expect fun rtlInitializeUnicodePrefix(prefixtable: COpaquePointer?)

public expect fun rtlInsertUnicodePrefix(prefixtable: COpaquePointer?, prefix: COpaquePointer?, prefixtableentry: COpaquePointer?): Boolean

public expect fun rtlIsCloudFilesPlaceholder(fileattributes: UInt, reparsetag: UInt): Boolean

public expect fun rtlIsDosDeviceNameU(dosfilename: Pcwstr): UInt

public expect fun rtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag: UInt): Boolean

public expect fun rtlIsNormalizedString(normform: UInt, sourcestring: Pcwstr, sourcestringlength: Int, normalized: COpaquePointer?): Ntstatus

public expect fun rtlIsPartialPlaceholder(fileattributes: UInt, reparsetag: UInt): Boolean

public expect fun rtlIsPartialPlaceholderFileHandle(filehandle: Handle, ispartialplaceholder: COpaquePointer?): Ntstatus

public expect fun rtlIsPartialPlaceholderFileInfo(infobuffer: COpaquePointer?, infoclass: FileInformationClass, ispartialplaceholder: COpaquePointer?): Ntstatus

public expect fun rtlIsSandboxedToken(context: COpaquePointer?, previousmode: Byte): Boolean

public expect fun rtlIsValidOemCharacter(char: Pwstr): Boolean

public expect fun rtlLengthRequiredSid(subauthoritycount: UInt): UInt

public expect fun rtlLengthSid(sid: Psid): UInt

public expect fun rtlMultiByteToUnicodeN(unicodestring: Pwstr, maxbytesinunicodestring: UInt, bytesinunicodestring: COpaquePointer?, multibytestring: Pcstr, bytesinmultibytestring: UInt): Ntstatus

public expect fun rtlMultiByteToUnicodeSize(bytesinunicodestring: COpaquePointer?, multibytestring: Pcstr, bytesinmultibytestring: UInt): Ntstatus

public expect fun rtlNextUnicodePrefix(prefixtable: COpaquePointer?, restart: Boolean): COpaquePointer?

public expect fun rtlNormalizeString(normform: UInt, sourcestring: Pcwstr, sourcestringlength: Int, destinationstring: Pwstr, destinationstringlength: COpaquePointer?): Ntstatus
