package io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DRIVER_FS_NOTIFICATION
import io.github.kotlinmania.windowssys.windows.wdk.foundation.KSPIN_LOCK_QUEUE_NUMBER
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PEPROCESS
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
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FILE_ACCESS_RIGHTS
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FILE_FLAGS_AND_ATTRIBUTES
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FILE_SHARE_MODE
import io.github.kotlinmania.windowssys.windows.win32.system.io.PIO_APC_ROUTINE
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.EVENT_TYPE
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.STRING
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.WAIT_TYPE

public expect fun ApplyControlToken(phcontext: Long, pinput: Long): HRESULT

public expect fun CcAsyncCopyRead(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, buffer: Long, iostatus: Long, ioissuerthread: PETHREAD, asyncreadcontext: Long): Boolean

public expect fun CcCanIWrite(fileobject: Long, bytestowrite: UInt, wait: Boolean, retrying: UByte): Boolean

public expect fun CcCoherencyFlushAndPurgeCache(sectionobjectpointer: Long, fileoffset: Long, length: UInt, iostatus: Long, flags: UInt)

public expect fun CcCopyRead(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, buffer: Long, iostatus: Long): Boolean

public expect fun CcCopyReadEx(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, buffer: Long, iostatus: Long, ioissuerthread: PETHREAD): Boolean

public expect fun CcCopyWrite(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, buffer: Long): Boolean

public expect fun CcCopyWriteEx(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, buffer: Long, ioissuerthread: PETHREAD): Boolean

public expect fun CcCopyWriteWontFlush(fileobject: Long, fileoffset: Long, length: UInt): Boolean

public expect fun CcDeferWrite(fileobject: Long, postroutine: PCC_POST_DEFERRED_WRITE, context1: Long, context2: Long, bytestowrite: UInt, retrying: Boolean)

public expect fun CcErrorCallbackRoutine(context: Long): NTSTATUS

public expect fun CcFastCopyRead(fileobject: Long, fileoffset: UInt, length: UInt, pagecount: UInt, buffer: Long, iostatus: Long)

public expect fun CcFastCopyWrite(fileobject: Long, fileoffset: UInt, length: UInt, buffer: Long)

public expect fun CcFlushCache(sectionobjectpointer: Long, fileoffset: Long, length: UInt, iostatus: Long)

public expect fun CcGetDirtyPages(loghandle: Long, dirtypageroutine: PDIRTY_PAGE_ROUTINE, context1: Long, context2: Long): Long

public expect fun CcGetFileObjectFromBcb(bcb: Long): Long

public expect fun CcGetFileObjectFromSectionPtrs(sectionobjectpointer: Long): Long

public expect fun CcGetFileObjectFromSectionPtrsRef(sectionobjectpointer: Long): Long

public expect fun CcGetFlushedValidData(sectionobjectpointer: Long, bcblistheld: Boolean): Long

public expect fun CcInitializeCacheMap(fileobject: Long, filesizes: Long, pinaccess: Boolean, callbacks: Long, lazywritecontext: Long)

public expect fun CcInitializeCacheMapEx(fileobject: Long, filesizes: Long, pinaccess: Boolean, callbacks: Long, lazywritecontext: Long, flags: UInt)

public expect fun CcIsCacheManagerCallbackNeeded(status: NTSTATUS): Boolean

public expect fun CcIsThereDirtyData(vpb: Long): Boolean

public expect fun CcIsThereDirtyDataEx(vpb: Long, numberofdirtypages: Long): Boolean

public expect fun CcMapData(fileobject: Long, fileoffset: Long, length: UInt, flags: UInt, bcb: Long, buffer: Long): Boolean

public expect fun CcMdlRead(fileobject: Long, fileoffset: Long, length: UInt, mdlchain: Long, iostatus: Long)

public expect fun CcMdlReadComplete(fileobject: Long, mdlchain: Long)

public expect fun CcMdlWriteAbort(fileobject: Long, mdlchain: Long)

public expect fun CcMdlWriteComplete(fileobject: Long, fileoffset: Long, mdlchain: Long)

public expect fun CcPinMappedData(fileobject: Long, fileoffset: Long, length: UInt, flags: UInt, bcb: Long): Boolean

public expect fun CcPinRead(fileobject: Long, fileoffset: Long, length: UInt, flags: UInt, bcb: Long, buffer: Long): Boolean

public expect fun CcPrepareMdlWrite(fileobject: Long, fileoffset: Long, length: UInt, mdlchain: Long, iostatus: Long)

public expect fun CcPreparePinWrite(fileobject: Long, fileoffset: Long, length: UInt, zero: Boolean, flags: UInt, bcb: Long, buffer: Long): Boolean

public expect fun CcPurgeCacheSection(sectionobjectpointer: Long, fileoffset: Long, length: UInt, flags: UInt): Boolean

public expect fun CcRemapBcb(bcb: Long): Long

public expect fun CcRepinBcb(bcb: Long)

public expect fun CcScheduleReadAhead(fileobject: Long, fileoffset: Long, length: UInt)

public expect fun CcScheduleReadAheadEx(fileobject: Long, fileoffset: Long, length: UInt, ioissuerthread: PETHREAD)

public expect fun CcSetAdditionalCacheAttributes(fileobject: Long, disablereadahead: Boolean, disablewritebehind: Boolean)

public expect fun CcSetAdditionalCacheAttributesEx(fileobject: Long, flags: UInt)

public expect fun CcSetBcbOwnerPointer(bcb: Long, ownerpointer: Long)

public expect fun CcSetDirtyPageThreshold(fileobject: Long, dirtypagethreshold: UInt)

public expect fun CcSetDirtyPinnedData(bcbvoid: Long, lsn: Long)

public expect fun CcSetFileSizes(fileobject: Long, filesizes: Long)

public expect fun CcSetFileSizesEx(fileobject: Long, filesizes: Long): NTSTATUS

public expect fun CcSetLogHandleForFile(fileobject: Long, loghandle: Long, flushtolsnroutine: PFLUSH_TO_LSN)

public expect fun CcSetParallelFlushFile(fileobject: Long, enableparallelflush: Boolean)

public expect fun CcSetReadAheadGranularity(fileobject: Long, granularity: UInt)

public expect fun CcUninitializeCacheMap(fileobject: Long, truncatesize: Long, uninitializeevent: Long): Boolean

public expect fun CcUnpinData(bcb: Long)

public expect fun CcUnpinDataForThread(bcb: Long, resourcethreadid: ULong)

public expect fun CcUnpinRepinnedBcb(bcb: Long, writethrough: Boolean, iostatus: Long)

public expect fun CcWaitForCurrentLazyWriterActivity(): NTSTATUS

public expect fun CcZeroData(fileobject: Long, startoffset: Long, endoffset: Long, wait: Boolean): Boolean

public expect fun CompleteAuthToken(phcontext: Long, ptoken: Long): HRESULT

public expect fun ExDisableResourceBoostLite(resource: Long)

public expect fun ExQueryPoolBlockSize(poolblock: Long, quotacharged: Long): ULong

public expect fun ExportSecurityContext(phcontext: Long, fflags: UInt, ppackedcontext: Long, ptoken: Long): HRESULT

public expect fun FsRtlAcknowledgeEcp(ecpcontext: Long)

public expect fun FsRtlAcquireFileExclusive(fileobject: Long)

public expect fun FsRtlAddBaseMcbEntry(mcb: Long, vbn: Long, lbn: Long, sectorcount: Long): Boolean

public expect fun FsRtlAddBaseMcbEntryEx(mcb: Long, vbn: Long, lbn: Long, sectorcount: Long): NTSTATUS

public expect fun FsRtlAddLargeMcbEntry(mcb: Long, vbn: Long, lbn: Long, sectorcount: Long): Boolean

public expect fun FsRtlAddMcbEntry(mcb: Long, vbn: UInt, lbn: UInt, sectorcount: UInt): Boolean

public expect fun FsRtlAddToTunnelCache(cache: Long, directorykey: ULong, shortname: Long, longname: Long, keybyshortname: Boolean, datalength: UInt, data: Long)

public expect fun FsRtlAddToTunnelCacheEx(cache: Long, directorykey: ULong, shortname: Long, longname: Long, flags: UInt, datalength: UInt, data: Long)

public expect fun FsRtlAllocateAePushLock(pooltype: POOL_TYPE, tag: UInt): Long

public expect fun FsRtlAllocateExtraCreateParameter(ecptype: Long, sizeofcontext: UInt, flags: UInt, cleanupcallback: PFSRTL_EXTRA_CREATE_PARAMETER_CLEANUP_CALLBACK, pooltag: UInt, ecpcontext: Long): NTSTATUS

public expect fun FsRtlAllocateExtraCreateParameterFromLookasideList(ecptype: Long, sizeofcontext: UInt, flags: UInt, cleanupcallback: PFSRTL_EXTRA_CREATE_PARAMETER_CLEANUP_CALLBACK, lookasidelist: Long, ecpcontext: Long): NTSTATUS

public expect fun FsRtlAllocateExtraCreateParameterList(flags: UInt, ecplist: Long): NTSTATUS

public expect fun FsRtlAllocateFileLock(completelockirproutine: PCOMPLETE_LOCK_IRP_ROUTINE, unlockroutine: PUNLOCK_ROUTINE): Long

public expect fun FsRtlAllocateResource(): Long

public expect fun FsRtlAreNamesEqual(constantnamea: Long, constantnameb: Long, ignorecase: Boolean, upcasetable: Long): Boolean

public expect fun FsRtlAreThereCurrentOrInProgressFileLocks(filelock: Long): Boolean

public expect fun FsRtlAreThereWaitingFileLocks(filelock: Long): Boolean

public expect fun FsRtlAreVolumeStartupApplicationsComplete(): Boolean

public expect fun FsRtlBalanceReads(targetdevice: Long): NTSTATUS

public expect fun FsRtlCancellableWaitForMultipleObjects(count: UInt, objectarray: Long, waittype: WAIT_TYPE, timeout: Long, waitblockarray: Long, irp: Long): NTSTATUS

public expect fun FsRtlCancellableWaitForSingleObject(obj: Long, timeout: Long, irp: Long): NTSTATUS

public expect fun FsRtlChangeBackingFileObject(currentfileobject: Long, newfileobject: Long, changebackingtype: FSRTL_CHANGE_BACKING_TYPE, flags: UInt): NTSTATUS

public expect fun FsRtlCheckLockForOplockRequest(filelock: Long, allocationsize: Long): Boolean

public expect fun FsRtlCheckLockForReadAccess(filelock: Long, irp: Long): Boolean

public expect fun FsRtlCheckLockForWriteAccess(filelock: Long, irp: Long): Boolean

public expect fun FsRtlCheckOplock(oplock: Long, irp: Long, context: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP): NTSTATUS

public expect fun FsRtlCheckOplockEx(oplock: Long, irp: Long, flags: UInt, context: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP): NTSTATUS

public expect fun FsRtlCheckOplockEx2(oplock: Long, irp: Long, flags: UInt, flagsex2: UInt, completionroutinecontext: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP, timeout: ULong, notifycontext: Long, notifyroutine: POPLOCK_NOTIFY_ROUTINE): NTSTATUS

public expect fun FsRtlCheckUpperOplock(oplock: Long, newloweroplockstate: UInt, completionroutinecontext: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, prependroutine: POPLOCK_FS_PREPOST_IRP, flags: UInt): NTSTATUS

public expect fun FsRtlCopyRead(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, lockkey: UInt, buffer: Long, iostatus: Long, deviceobject: Long): Boolean

public expect fun FsRtlCopyWrite(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, lockkey: UInt, buffer: Long, iostatus: Long, deviceobject: Long): Boolean

public expect fun FsRtlCreateSectionForDataScan(sectionhandle: Long, sectionobject: Long, sectionfilesize: Long, fileobject: Long, desiredaccess: UInt, objectattributes: Long, maximumsize: Long, sectionpageprotection: UInt, allocationattributes: UInt, flags: UInt): NTSTATUS

public expect fun FsRtlCurrentBatchOplock(oplock: Long): Boolean

public expect fun FsRtlCurrentOplock(oplock: Long): Boolean

public expect fun FsRtlCurrentOplockH(oplock: Long): Boolean

public expect fun FsRtlDeleteExtraCreateParameterLookasideList(lookaside: Long, flags: UInt)

public expect fun FsRtlDeleteKeyFromTunnelCache(cache: Long, directorykey: ULong)

public expect fun FsRtlDeleteTunnelCache(cache: Long)

public expect fun FsRtlDeregisterUncProvider(handle: HANDLE)

public expect fun FsRtlDismountComplete(deviceobject: Long, dismountstatus: NTSTATUS)

public expect fun FsRtlDissectDbcs(path: STRING, firstname: Long, remainingname: Long)

public expect fun FsRtlDissectName(path: UNICODE_STRING, firstname: Long, remainingname: Long)

public expect fun FsRtlDoesDbcsContainWildCards(name: Long): Boolean

public expect fun FsRtlDoesNameContainWildCards(name: Long): Boolean

public expect fun FsRtlFastCheckLockForRead(filelock: Long, startingbyte: Long, length: Long, key: UInt, fileobject: Long, processid: Long): Boolean

public expect fun FsRtlFastCheckLockForWrite(filelock: Long, startingbyte: Long, length: Long, key: UInt, fileobject: Long, processid: Long): Boolean

public expect fun FsRtlFastUnlockAll(filelock: Long, fileobject: Long, processid: PEPROCESS, context: Long): NTSTATUS

public expect fun FsRtlFastUnlockAllByKey(filelock: Long, fileobject: Long, processid: PEPROCESS, key: UInt, context: Long): NTSTATUS

public expect fun FsRtlFastUnlockSingle(filelock: Long, fileobject: Long, fileoffset: Long, length: Long, processid: PEPROCESS, key: UInt, context: Long, alreadysynchronized: Boolean): NTSTATUS

public expect fun FsRtlFindExtraCreateParameter(ecplist: Long, ecptype: Long, ecpcontext: Long, ecpcontextsize: Long): NTSTATUS

public expect fun FsRtlFindInTunnelCache(cache: Long, directorykey: ULong, name: Long, shortname: Long, longname: Long, datalength: Long, data: Long): Boolean

public expect fun FsRtlFindInTunnelCacheEx(cache: Long, directorykey: ULong, name: Long, shortname: Long, longname: Long, flags: UInt, datalength: Long, data: Long): Boolean

public expect fun FsRtlFreeAePushLock(aepushlock: Long)

public expect fun FsRtlFreeExtraCreateParameter(ecpcontext: Long)

public expect fun FsRtlFreeExtraCreateParameterList(ecplist: Long)

public expect fun FsRtlFreeFileLock(filelock: Long)

public expect fun FsRtlGetCurrentProcessLoaderList(): Long

public expect fun FsRtlGetEcpListFromIrp(irp: Long, ecplist: Long): NTSTATUS

public expect fun FsRtlGetFileSize(fileobject: Long, filesize: Long): NTSTATUS

public expect fun FsRtlGetNextBaseMcbEntry(mcb: Long, runindex: UInt, vbn: Long, lbn: Long, sectorcount: Long): Boolean

public expect fun FsRtlGetNextExtraCreateParameter(ecplist: Long, currentecpcontext: Long, nextecptype: Long, nextecpcontext: Long, nextecpcontextsize: Long): NTSTATUS

public expect fun FsRtlGetNextFileLock(filelock: Long, restart: Boolean): Long

public expect fun FsRtlGetNextLargeMcbEntry(mcb: Long, runindex: UInt, vbn: Long, lbn: Long, sectorcount: Long): Boolean

public expect fun FsRtlGetNextMcbEntry(mcb: Long, runindex: UInt, vbn: Long, lbn: Long, sectorcount: Long): Boolean

public expect fun FsRtlGetSectorSizeInformation(deviceobject: Long, sectorsizeinfo: Long): NTSTATUS

public expect fun FsRtlGetSupportedFeatures(deviceobject: Long, supportedfeatures: Long): NTSTATUS

public expect fun FsRtlGetVirtualDiskNestingLevel(deviceobject: Long, nestinglevel: Long, nestingflags: Long): NTSTATUS

public expect fun FsRtlIncrementCcFastMdlReadWait()

public expect fun FsRtlIncrementCcFastReadNoWait()

public expect fun FsRtlIncrementCcFastReadNotPossible()

public expect fun FsRtlIncrementCcFastReadResourceMiss()

public expect fun FsRtlIncrementCcFastReadWait()

public expect fun FsRtlInitExtraCreateParameterLookasideList(lookaside: Long, flags: UInt, size: ULong, tag: UInt)

public expect fun FsRtlInitializeBaseMcb(mcb: Long, pooltype: POOL_TYPE)

public expect fun FsRtlInitializeBaseMcbEx(mcb: Long, pooltype: POOL_TYPE, flags: UShort): Boolean

public expect fun FsRtlInitializeExtraCreateParameter(ecp: Long, ecpflags: UInt, cleanupcallback: PFSRTL_EXTRA_CREATE_PARAMETER_CLEANUP_CALLBACK, totalsize: UInt, ecptype: Long, listallocatedfrom: Long)

public expect fun FsRtlInitializeExtraCreateParameterList(ecplist: Long): NTSTATUS

public expect fun FsRtlInitializeFileLock(filelock: Long, completelockirproutine: PCOMPLETE_LOCK_IRP_ROUTINE, unlockroutine: PUNLOCK_ROUTINE)

public expect fun FsRtlInitializeLargeMcb(mcb: Long, pooltype: POOL_TYPE)

public expect fun FsRtlInitializeMcb(mcb: Long, pooltype: POOL_TYPE)

public expect fun FsRtlInitializeOplock(oplock: Long)

public expect fun FsRtlInitializeTunnelCache(cache: Long)

public expect fun FsRtlInsertExtraCreateParameter(ecplist: Long, ecpcontext: Long): NTSTATUS

public expect fun FsRtlInsertPerFileContext(perfilecontextpointer: Long, ptr: Long): NTSTATUS

public expect fun FsRtlInsertPerFileObjectContext(fileobject: Long, ptr: Long): NTSTATUS

public expect fun FsRtlInsertPerStreamContext(perstreamcontext: Long, ptr: Long): NTSTATUS

public expect fun FsRtlIs32BitProcess(process: PEPROCESS): Boolean

public expect fun FsRtlIsDaxVolume(fileobject: Long): Boolean

public expect fun FsRtlIsDbcsInExpression(expression: Long, name: Long): Boolean

public expect fun FsRtlIsEcpAcknowledged(ecpcontext: Long): Boolean

public expect fun FsRtlIsEcpFromUserMode(ecpcontext: Long): Boolean

public expect fun FsRtlIsExtentDangling(startpage: UInt, numberofpages: UInt, flags: UInt): UInt

public expect fun FsRtlIsFatDbcsLegal(dbcsname: STRING, wildcardspermissible: Boolean, pathnamepermissible: Boolean, leadingbackslashpermissible: Boolean): Boolean

public expect fun FsRtlIsHpfsDbcsLegal(dbcsname: STRING, wildcardspermissible: Boolean, pathnamepermissible: Boolean, leadingbackslashpermissible: Boolean): Boolean

public expect fun FsRtlIsMobileOS(): Boolean

public expect fun FsRtlIsNameInExpression(expression: Long, name: Long, ignorecase: Boolean, upcasetable: PCWSTR): Boolean

public expect fun FsRtlIsNameInUnUpcasedExpression(expression: Long, name: Long, ignorecase: Boolean, upcasetable: PCWSTR): Boolean

public expect fun FsRtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag: UInt): Boolean

public expect fun FsRtlIsNtstatusExpected(exception: NTSTATUS): Boolean

public expect fun FsRtlIsPagingFile(fileobject: Long): UInt

public expect fun FsRtlIsSystemPagingFile(fileobject: Long): UInt

public expect fun FsRtlIssueDeviceIoControl(deviceobject: Long, ioctl: UInt, flags: UByte, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt, iosbinformation: Long): NTSTATUS

public expect fun FsRtlKernelFsControlFile(fileobject: Long, fscontrolcode: UInt, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt, retoutputbuffersize: Long): NTSTATUS

public expect fun FsRtlLogCcFlushError(filename: Long, deviceobject: Long, sectionobjectpointer: Long, flusherror: NTSTATUS, flags: UInt): NTSTATUS

public expect fun FsRtlLookupBaseMcbEntry(mcb: Long, vbn: Long, lbn: Long, sectorcountfromlbn: Long, startinglbn: Long, sectorcountfromstartinglbn: Long, index: Long): Boolean

public expect fun FsRtlLookupLargeMcbEntry(mcb: Long, vbn: Long, lbn: Long, sectorcountfromlbn: Long, startinglbn: Long, sectorcountfromstartinglbn: Long, index: Long): Boolean

public expect fun FsRtlLookupLastBaseMcbEntry(mcb: Long, vbn: Long, lbn: Long): Boolean

public expect fun FsRtlLookupLastBaseMcbEntryAndIndex(opaquemcb: Long, largevbn: Long, largelbn: Long, index: Long): Boolean

public expect fun FsRtlLookupLastLargeMcbEntry(mcb: Long, vbn: Long, lbn: Long): Boolean

public expect fun FsRtlLookupLastLargeMcbEntryAndIndex(opaquemcb: Long, largevbn: Long, largelbn: Long, index: Long): Boolean

public expect fun FsRtlLookupLastMcbEntry(mcb: Long, vbn: Long, lbn: Long): Boolean

public expect fun FsRtlLookupMcbEntry(mcb: Long, vbn: UInt, lbn: Long, sectorcount: Long, index: Long): Boolean

public expect fun FsRtlLookupPerFileContext(perfilecontextpointer: Long, ownerid: Long, instanceid: Long): Long

public expect fun FsRtlLookupPerFileObjectContext(fileobject: Long, ownerid: Long, instanceid: Long): Long

public expect fun FsRtlLookupPerStreamContextInternal(streamcontext: Long, ownerid: Long, instanceid: Long): Long

public expect fun FsRtlMdlReadCompleteDev(fileobject: Long, mdlchain: Long, deviceobject: Long): Boolean

public expect fun FsRtlMdlReadDev(fileobject: Long, fileoffset: Long, length: UInt, lockkey: UInt, mdlchain: Long, iostatus: Long, deviceobject: Long): Boolean

public expect fun FsRtlMdlReadEx(fileobject: Long, fileoffset: Long, length: UInt, lockkey: UInt, mdlchain: Long, iostatus: Long): NTSTATUS

public expect fun FsRtlMdlWriteCompleteDev(fileobject: Long, fileoffset: Long, mdlchain: Long, deviceobject: Long): Boolean

public expect fun FsRtlMupGetProviderIdFromName(pprovidername: Long, pproviderid: Long): NTSTATUS

public expect fun FsRtlMupGetProviderInfoFromFileObject(pfileobject: Long, level: UInt, pbuffer: Long, pbuffersize: Long): NTSTATUS

public expect fun FsRtlNormalizeNtstatus(exception: NTSTATUS, genericexception: NTSTATUS): NTSTATUS

public expect fun FsRtlNotifyCleanup(notifysync: PNOTIFY_SYNC, notifylist: Long, fscontext: Long)

public expect fun FsRtlNotifyCleanupAll(notifysync: PNOTIFY_SYNC, notifylist: Long)

public expect fun FsRtlNotifyFilterChangeDirectory(notifysync: PNOTIFY_SYNC, notifylist: Long, fscontext: Long, fulldirectoryname: Long, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifyirp: Long, traversecallback: PCHECK_FOR_TRAVERSE_ACCESS, subjectcontext: Long, filtercallback: PFILTER_REPORT_CHANGE)

public expect fun FsRtlNotifyFilterReportChange(notifysync: PNOTIFY_SYNC, notifylist: Long, fulltargetname: Long, targetnameoffset: UShort, streamname: Long, normalizedparentname: Long, filtermatch: UInt, action: UInt, targetcontext: Long, filtercontext: Long)

public expect fun FsRtlNotifyFullChangeDirectory(notifysync: PNOTIFY_SYNC, notifylist: Long, fscontext: Long, fulldirectoryname: Long, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifyirp: Long, traversecallback: PCHECK_FOR_TRAVERSE_ACCESS, subjectcontext: Long)

public expect fun FsRtlNotifyFullReportChange(notifysync: PNOTIFY_SYNC, notifylist: Long, fulltargetname: Long, targetnameoffset: UShort, streamname: Long, normalizedparentname: Long, filtermatch: UInt, action: UInt, targetcontext: Long)

public expect fun FsRtlNotifyInitializeSync(notifysync: Long)

public expect fun FsRtlNotifyUninitializeSync(notifysync: Long)

public expect fun FsRtlNotifyVolumeEvent(fileobject: Long, eventcode: UInt): NTSTATUS

public expect fun FsRtlNotifyVolumeEventEx(fileobject: Long, eventcode: UInt, event: Long): NTSTATUS

public expect fun FsRtlNumberOfRunsInBaseMcb(mcb: Long): UInt

public expect fun FsRtlNumberOfRunsInLargeMcb(mcb: Long): UInt

public expect fun FsRtlNumberOfRunsInMcb(mcb: Long): UInt

public expect fun FsRtlOplockBreakH(oplock: Long, irp: Long, flags: UInt, context: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP): NTSTATUS

public expect fun FsRtlOplockBreakH2(oplock: Long, irp: Long, flags: UInt, context: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP, grantedaccess: Long, shareaccess: Long): NTSTATUS

public expect fun FsRtlOplockBreakToNone(oplock: Long, irpsp: Long, irp: Long, context: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP): NTSTATUS

public expect fun FsRtlOplockBreakToNoneEx(oplock: Long, irp: Long, flags: UInt, context: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP): NTSTATUS

public expect fun FsRtlOplockFsctrl(oplock: Long, irp: Long, opencount: UInt): NTSTATUS

public expect fun FsRtlOplockFsctrlEx(oplock: Long, irp: Long, opencount: UInt, flags: UInt): NTSTATUS

public expect fun FsRtlOplockGetAnyBreakOwnerProcess(oplock: Long): PEPROCESS

public expect fun FsRtlOplockIsFastIoPossible(oplock: Long): Boolean

public expect fun FsRtlOplockIsSharedRequest(irp: Long): Boolean

public expect fun FsRtlOplockKeysEqual(fo1: Long, fo2: Long): Boolean

public expect fun FsRtlPostPagingFileStackOverflow(context: Long, event: Long, stackoverflowroutine: PFSRTL_STACK_OVERFLOW_ROUTINE)

public expect fun FsRtlPostStackOverflow(context: Long, event: Long, stackoverflowroutine: PFSRTL_STACK_OVERFLOW_ROUTINE)

public expect fun FsRtlPrepareMdlWriteDev(fileobject: Long, fileoffset: Long, length: UInt, lockkey: UInt, mdlchain: Long, iostatus: Long, deviceobject: Long): Boolean

public expect fun FsRtlPrepareMdlWriteEx(fileobject: Long, fileoffset: Long, length: UInt, lockkey: UInt, mdlchain: Long, iostatus: Long): NTSTATUS

public expect fun FsRtlPrepareToReuseEcp(ecpcontext: Long)

public expect fun FsRtlPrivateLock(filelock: Long, fileobject: Long, fileoffset: Long, length: Long, processid: PEPROCESS, key: UInt, failimmediately: Boolean, exclusivelock: Boolean, iosb: Long, irp: Long, context: Long, alreadysynchronized: Boolean): Boolean

public expect fun FsRtlProcessFileLock(filelock: Long, irp: Long, context: Long): NTSTATUS

public expect fun FsRtlQueryCachedVdl(fileobject: Long, vdl: Long): NTSTATUS

public expect fun FsRtlQueryInformationFile(fileobject: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, retfileinformationsize: Long): NTSTATUS

public expect fun FsRtlQueryKernelEaFile(fileobject: Long, returnedeadata: Long, length: UInt, returnsingleentry: Boolean, ealist: Long, ealistlength: UInt, eaindex: Long, restartscan: Boolean, lengthreturned: Long): NTSTATUS

public expect fun FsRtlQueryMaximumVirtualDiskNestingLevel(): UInt

public expect fun FsRtlRegisterFileSystemFilterCallbacks(filterdriverobject: Long, callbacks: Long): NTSTATUS

public expect fun FsRtlRegisterUncProvider(muphandle: Long, redirectordevicename: Long, mailslotssupported: Boolean): NTSTATUS

public expect fun FsRtlRegisterUncProviderEx(muphandle: Long, redirdevname: Long, deviceobject: Long, flags: UInt): NTSTATUS

public expect fun FsRtlRegisterUncProviderEx2(redirdevname: Long, deviceobject: Long, registration: Long, muphandle: Long): NTSTATUS

public expect fun FsRtlReleaseFile(fileobject: Long)

public expect fun FsRtlRemoveBaseMcbEntry(mcb: Long, vbn: Long, sectorcount: Long): Boolean

public expect fun FsRtlRemoveDotsFromPath(originalstring: PWSTR, pathlength: UShort, newlength: Long): NTSTATUS

public expect fun FsRtlRemoveExtraCreateParameter(ecplist: Long, ecptype: Long, ecpcontext: Long, ecpcontextsize: Long): NTSTATUS

public expect fun FsRtlRemoveLargeMcbEntry(mcb: Long, vbn: Long, sectorcount: Long)

public expect fun FsRtlRemoveMcbEntry(mcb: Long, vbn: UInt, sectorcount: UInt)

public expect fun FsRtlRemovePerFileContext(perfilecontextpointer: Long, ownerid: Long, instanceid: Long): Long

public expect fun FsRtlRemovePerFileObjectContext(fileobject: Long, ownerid: Long, instanceid: Long): Long

public expect fun FsRtlRemovePerStreamContext(streamcontext: Long, ownerid: Long, instanceid: Long): Long

public expect fun FsRtlResetBaseMcb(mcb: Long)

public expect fun FsRtlResetLargeMcb(mcb: Long, selfsynchronized: Boolean)

public expect fun FsRtlSetDriverBacking(driverobj: Long, flags: UInt): NTSTATUS

public expect fun FsRtlSetEcpListIntoIrp(irp: Long, ecplist: Long): NTSTATUS

public expect fun FsRtlSetKernelEaFile(fileobject: Long, eabuffer: Long, length: UInt): NTSTATUS

public expect fun FsRtlSplitBaseMcb(mcb: Long, vbn: Long, amount: Long): Boolean

public expect fun FsRtlSplitLargeMcb(mcb: Long, vbn: Long, amount: Long): Boolean

public expect fun FsRtlTeardownPerFileContexts(perfilecontextpointer: Long)

public expect fun FsRtlTeardownPerStreamContexts(advancedheader: Long)

public expect fun FsRtlTruncateBaseMcb(mcb: Long, vbn: Long)

public expect fun FsRtlTruncateLargeMcb(mcb: Long, vbn: Long)

public expect fun FsRtlTruncateMcb(mcb: Long, vbn: UInt)

public expect fun FsRtlUninitializeBaseMcb(mcb: Long)

public expect fun FsRtlUninitializeFileLock(filelock: Long)

public expect fun FsRtlUninitializeLargeMcb(mcb: Long)

public expect fun FsRtlUninitializeMcb(mcb: Long)

public expect fun FsRtlUninitializeOplock(oplock: Long)

public expect fun FsRtlUpdateDiskCounters(bytesread: ULong, byteswritten: ULong)

public expect fun FsRtlUpperOplockFsctrl(oplock: Long, irp: Long, opencount: UInt, loweroplockstate: UInt, flags: UInt): NTSTATUS

public expect fun FsRtlValidateReparsePointBuffer(bufferlength: UInt, reparsebuffer: Long): NTSTATUS

public expect fun FsRtlVolumeDeviceToCorrelationId(volumedeviceobject: Long, guid: Long): NTSTATUS

public expect fun GetSecurityUserInfo(logonid: Long, flags: UInt, userinformation: Long): NTSTATUS

public expect fun IoAcquireVpbSpinLock(irql: Long)

public expect fun IoApplyPriorityInfoThread(inputpriorityinfo: Long, outputpriorityinfo: Long, thread: PETHREAD): NTSTATUS

public expect fun IoCheckDesiredAccess(desiredaccess: Long, grantedaccess: UInt): NTSTATUS

public expect fun IoCheckEaBufferValidity(eabuffer: Long, ealength: UInt, erroroffset: Long): NTSTATUS

public expect fun IoCheckFunctionAccess(grantedaccess: UInt, majorfunction: UByte, minorfunction: UByte, iocontrolcode: UInt, arg1: Long, arg2: Long): NTSTATUS

public expect fun IoCheckQuerySetFileInformation(fileinformationclass: FILE_INFORMATION_CLASS, length: UInt, setoperation: Boolean): NTSTATUS

public expect fun IoCheckQuerySetVolumeInformation(fsinformationclass: FS_INFORMATION_CLASS, length: UInt, setoperation: Boolean): NTSTATUS

public expect fun IoCheckQuotaBufferValidity(quotabuffer: Long, quotalength: UInt, erroroffset: Long): NTSTATUS

public expect fun IoClearFsTrackOffsetState(irp: Long): NTSTATUS

public expect fun IoCreateStreamFileObject(fileobject: Long, deviceobject: Long): Long

public expect fun IoCreateStreamFileObjectEx(fileobject: Long, deviceobject: Long, filehandle: Long): Long

public expect fun IoCreateStreamFileObjectEx2(createoptions: Long, fileobject: Long, deviceobject: Long, streamfileobject: Long, filehandle: Long): NTSTATUS

public expect fun IoCreateStreamFileObjectLite(fileobject: Long, deviceobject: Long): Long

public expect fun IoEnumerateDeviceObjectList(driverobject: Long, deviceobjectlist: Long, deviceobjectlistsize: UInt, actualnumberdeviceobjects: Long): NTSTATUS

public expect fun IoEnumerateRegisteredFiltersList(driverobjectlist: Long, driverobjectlistsize: UInt, actualnumberdriverobjects: Long): NTSTATUS

public expect fun IoFastQueryNetworkAttributes(objectattributes: Long, desiredaccess: UInt, openoptions: UInt, iostatus: Long, buffer: Long): Boolean

public expect fun IoGetAttachedDevice(deviceobject: Long): Long

public expect fun IoGetBaseFileSystemDeviceObject(fileobject: Long): Long

public expect fun IoGetDeviceAttachmentBaseRef(deviceobject: Long): Long

public expect fun IoGetDeviceToVerify(thread: PETHREAD): Long

public expect fun IoGetDiskDeviceObject(filesystemdeviceobject: Long, diskdeviceobject: Long): NTSTATUS

public expect fun IoGetFsTrackOffsetState(irp: Long, retfstrackoffsetblob: Long, rettrackedoffset: Long): NTSTATUS

public expect fun IoGetLowerDeviceObject(deviceobject: Long): Long

public expect fun IoGetOplockKeyContext(fileobject: Long): Long

public expect fun IoGetOplockKeyContextEx(fileobject: Long): Long

public expect fun IoGetRequestorProcess(irp: Long): PEPROCESS

public expect fun IoGetRequestorProcessId(irp: Long): UInt

public expect fun IoGetRequestorSessionId(irp: Long, psessionid: Long): NTSTATUS

public expect fun IoIrpHasFsTrackOffsetExtensionType(irp: Long): Boolean

public expect fun IoIsOperationSynchronous(irp: Long): Boolean

public expect fun IoIsSystemThread(thread: PETHREAD): Boolean

public expect fun IoIsValidNameGraftingBuffer(irp: Long, reparsebuffer: Long): Boolean

public expect fun IoPageRead(fileobject: Long, memorydescriptorlist: Long, startingoffset: Long, event: Long, iostatusblock: Long): NTSTATUS

public expect fun IoQueryFileDosDeviceName(fileobject: Long, objectnameinformation: Long): NTSTATUS

public expect fun IoQueryFileInformation(fileobject: Long, fileinformationclass: FILE_INFORMATION_CLASS, length: UInt, fileinformation: Long, returnedlength: Long): NTSTATUS

public expect fun IoQueryVolumeInformation(fileobject: Long, fsinformationclass: FS_INFORMATION_CLASS, length: UInt, fsinformation: Long, returnedlength: Long): NTSTATUS

public expect fun IoQueueThreadIrp(irp: Long)

public expect fun IoRegisterFileSystem(deviceobject: Long)

public expect fun IoRegisterFsRegistrationChange(driverobject: Long, drivernotificationroutine: DRIVER_FS_NOTIFICATION): NTSTATUS

public expect fun IoRegisterFsRegistrationChangeMountAware(driverobject: Long, drivernotificationroutine: DRIVER_FS_NOTIFICATION, synchronizewithmounts: Boolean): NTSTATUS

public expect fun IoReleaseVpbSpinLock(irql: UByte)

public expect fun IoReplaceFileObjectName(fileobject: Long, newfilename: PCWSTR, filenamelength: UShort): NTSTATUS

public expect fun IoRequestDeviceRemovalForReset(physicaldeviceobject: Long, flags: UInt): NTSTATUS

public expect fun IoRetrievePriorityInfo(irp: Long, fileobject: Long, thread: PETHREAD, priorityinfo: Long): NTSTATUS

public expect fun IoSetDeviceToVerify(thread: PETHREAD, deviceobject: Long)

public expect fun IoSetFsTrackOffsetState(irp: Long, fstrackoffsetblob: Long, trackedoffset: Long): NTSTATUS

public expect fun IoSetInformation(fileobject: Long, fileinformationclass: FILE_INFORMATION_CLASS, length: UInt, fileinformation: Long): NTSTATUS

public expect fun IoSynchronousPageWrite(fileobject: Long, memorydescriptorlist: Long, startingoffset: Long, event: Long, iostatusblock: Long): NTSTATUS

public expect fun IoThreadToProcess(thread: PETHREAD): PEPROCESS

public expect fun IoUnregisterFileSystem(deviceobject: Long)

public expect fun IoUnregisterFsRegistrationChange(driverobject: Long, drivernotificationroutine: DRIVER_FS_NOTIFICATION)

public expect fun IoVerifyVolume(deviceobject: Long, allowrawmount: Boolean): NTSTATUS

public expect fun KeAcquireQueuedSpinLock(number: KSPIN_LOCK_QUEUE_NUMBER): UByte

public expect fun KeAcquireSpinLockRaiseToSynch(spinlock: Long): UByte

public expect fun KeAttachProcess(process: PRKPROCESS)

public expect fun KeDetachProcess()

public expect fun KeInitializeMutant(mutant: Long, initialowner: Boolean)

public expect fun KeInitializeQueue(queue: Long, count: UInt)

public expect fun KeInsertHeadQueue(queue: Long, entry: Long): Int

public expect fun KeInsertQueue(queue: Long, entry: Long): Int

public expect fun KeReadStateMutant(mutant: Long): Int

public expect fun KeReadStateQueue(queue: Long): Int

public expect fun KeReleaseMutant(mutant: Long, increment: Int, abandoned: Boolean, wait: Boolean): Int

public expect fun KeReleaseQueuedSpinLock(number: KSPIN_LOCK_QUEUE_NUMBER, oldirql: UByte)

public expect fun KeRemoveQueue(queue: Long, waitmode: Byte, timeout: Long): Long

public expect fun KeRemoveQueueEx(queue: Long, waitmode: Byte, alertable: Boolean, timeout: Long, entryarray: Long, count: UInt): UInt

public expect fun KeRundownQueue(queue: Long): Long

public expect fun KeSetIdealProcessorThread(thread: PKTHREAD, processor: UByte): UByte

public expect fun KeSetKernelStackSwapEnable(enable: Boolean): Boolean

public expect fun KeStackAttachProcess(process: PRKPROCESS, apcstate: Long)

public expect fun KeTryToAcquireQueuedSpinLock(number: KSPIN_LOCK_QUEUE_NUMBER, oldirql: Long): UInt

public expect fun KeUnstackDetachProcess(apcstate: Long)

public expect fun MakeSignature(phcontext: Long, fqop: UInt, pmessage: Long, messageseqno: UInt): HRESULT

public expect fun MapSecurityError(secstatus: HRESULT): NTSTATUS

public expect fun MmCanFileBeTruncated(sectionpointer: Long, newfilesize: Long): Boolean

public expect fun MmDoesFileHaveUserWritableReferences(sectionpointer: Long): UInt

public expect fun MmFlushImageSection(sectionobjectpointer: Long, flushtype: MMFLUSH_TYPE): Boolean

public expect fun MmForceSectionClosed(sectionobjectpointer: Long, delayclose: Boolean): Boolean

public expect fun MmForceSectionClosedEx(sectionobjectpointer: Long, forcecloseflags: UInt): Boolean

public expect fun MmGetMaximumFileSectionSize(): ULong

public expect fun MmIsFileSectionActive(fssectionpointer: Long, flags: UInt, sectionisactive: Long): NTSTATUS

public expect fun MmIsRecursiveIoFault(): Boolean

public expect fun MmMdlPagesAreZero(mdl: Long): UInt

public expect fun MmPrefetchPages(numberoflists: UInt, readlists: Long): NTSTATUS

public expect fun MmSetAddressRangeModified(address: Long, length: ULong): Boolean

public expect fun NtAccessCheckAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, desiredaccess: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS

public expect fun NtAccessCheckByTypeAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS

public expect fun NtAccessCheckByTypeResultListAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS

public expect fun NtAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname: Long, handleid: Long, clienttoken: HANDLE, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS

public expect fun NtAdjustGroupsToken(tokenhandle: HANDLE, resettodefault: Boolean, newstate: Long, bufferlength: UInt, previousstate: Long, returnlength: Long): NTSTATUS

public expect fun NtAdjustPrivilegesToken(tokenhandle: HANDLE, disableallprivileges: Boolean, newstate: Long, bufferlength: UInt, previousstate: Long, returnlength: Long): NTSTATUS

public expect fun NtAllocateVirtualMemory(processhandle: HANDLE, baseaddress: Long, zerobits: ULong, regionsize: Long, allocationtype: UInt, protect: UInt): NTSTATUS

public expect fun NtAllocateVirtualMemoryEx(processhandle: HANDLE, baseaddress: Long, regionsize: Long, allocationtype: UInt, pageprotection: UInt, extendedparameters: Long, extendedparametercount: UInt): NTSTATUS

public expect fun NtCancelIoFileEx(filehandle: HANDLE, iorequesttocancel: Long, iostatusblock: Long): NTSTATUS

public expect fun NtCloseObjectAuditAlarm(subsystemname: Long, handleid: Long, generateonclose: Boolean): NTSTATUS

public expect fun NtCreateDirectoryObject(directoryhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS

public expect fun NtCreateEvent(eventhandle: Long, desiredaccess: UInt, objectattributes: Long, eventtype: EVENT_TYPE, initialstate: Boolean): NTSTATUS

public expect fun NtCreateFile(filehandle: Long, desiredaccess: FILE_ACCESS_RIGHTS, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: FILE_FLAGS_AND_ATTRIBUTES, shareaccess: FILE_SHARE_MODE, createdisposition: NTCREATEFILE_CREATE_DISPOSITION, createoptions: NTCREATEFILE_CREATE_OPTIONS, eabuffer: Long, ealength: UInt): NTSTATUS

public expect fun NtCreateSection(sectionhandle: Long, desiredaccess: UInt, objectattributes: Long, maximumsize: Long, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: HANDLE): NTSTATUS

public expect fun NtCreateSectionEx(sectionhandle: Long, desiredaccess: UInt, objectattributes: Long, maximumsize: Long, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: HANDLE, extendedparameters: Long, extendedparametercount: UInt): NTSTATUS

public expect fun NtDeleteFile(objectattributes: Long): NTSTATUS

public expect fun NtDeleteObjectAuditAlarm(subsystemname: Long, handleid: Long, generateonclose: Boolean): NTSTATUS

public expect fun NtDuplicateObject(sourceprocesshandle: HANDLE, sourcehandle: HANDLE, targetprocesshandle: HANDLE, targethandle: Long, desiredaccess: UInt, handleattributes: UInt, options: UInt): NTSTATUS

public expect fun NtDuplicateToken(existingtokenhandle: HANDLE, desiredaccess: UInt, objectattributes: Long, effectiveonly: Boolean, tokentype: TOKEN_TYPE, newtokenhandle: Long): NTSTATUS

public expect fun NtFilterToken(existingtokenhandle: HANDLE, flags: UInt, sidstodisable: Long, privilegestodelete: Long, restrictedsids: Long, newtokenhandle: Long): NTSTATUS

public expect fun NtFlushBuffersFile(filehandle: HANDLE, iostatusblock: Long): NTSTATUS

public expect fun NtFlushBuffersFileEx(filehandle: HANDLE, flags: UInt, parameters: Long, parameterssize: UInt, iostatusblock: Long): NTSTATUS

public expect fun NtFlushVirtualMemory(processhandle: HANDLE, baseaddress: Long, regionsize: Long, iostatus: Long): NTSTATUS

public expect fun NtFreeVirtualMemory(processhandle: HANDLE, baseaddress: Long, regionsize: Long, freetype: UInt): NTSTATUS

public expect fun NtFsControlFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, fscontrolcode: UInt, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt): NTSTATUS

public expect fun NtImpersonateAnonymousToken(threadhandle: HANDLE): NTSTATUS

public expect fun NtLockFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, byteoffset: Long, length: Long, key: UInt, failimmediately: Boolean, exclusivelock: Boolean): NTSTATUS

public expect fun NtNotifyChangeKey(keyhandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, completionfilter: UInt, watchtree: Boolean, buffer: Long, buffersize: UInt, asynchronous: Boolean): NTSTATUS

public expect fun NtOpenDirectoryObject(directoryhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS

public expect fun NtOpenFile(filehandle: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, shareaccess: UInt, openoptions: UInt): NTSTATUS

public expect fun NtOpenObjectAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, clienttoken: HANDLE, desiredaccess: UInt, grantedaccess: UInt, privileges: Long, objectcreation: Boolean, accessgranted: Boolean, generateonclose: Long): NTSTATUS

public expect fun NtOpenProcessToken(processhandle: HANDLE, desiredaccess: UInt, tokenhandle: Long): NTSTATUS

public expect fun NtOpenProcessTokenEx(processhandle: HANDLE, desiredaccess: UInt, handleattributes: UInt, tokenhandle: Long): NTSTATUS

public expect fun NtOpenSymbolicLinkObject(linkhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS

public expect fun NtOpenThreadToken(threadhandle: HANDLE, desiredaccess: UInt, openasself: Boolean, tokenhandle: Long): NTSTATUS

public expect fun NtOpenThreadTokenEx(threadhandle: HANDLE, desiredaccess: UInt, openasself: Boolean, handleattributes: UInt, tokenhandle: Long): NTSTATUS

public expect fun NtPrivilegeCheck(clienttoken: HANDLE, requiredprivileges: Long, result: Long): NTSTATUS

public expect fun NtPrivilegeObjectAuditAlarm(subsystemname: Long, handleid: Long, clienttoken: HANDLE, desiredaccess: UInt, privileges: Long, accessgranted: Boolean): NTSTATUS

public expect fun NtPrivilegedServiceAuditAlarm(subsystemname: Long, servicename: Long, clienttoken: HANDLE, privileges: Long, accessgranted: Boolean): NTSTATUS

public expect fun NtQueryDirectoryFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, returnsingleentry: Boolean, filename: Long, restartscan: Boolean): NTSTATUS

public expect fun NtQueryDirectoryFileEx(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, queryflags: UInt, filename: Long): NTSTATUS

public expect fun NtQueryDirectoryObject(directoryhandle: HANDLE, buffer: Long, length: UInt, returnsingleentry: Boolean, restartscan: Boolean, context: Long, returnlength: Long): NTSTATUS

public expect fun NtQueryEaFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt, returnsingleentry: Boolean, ealist: Long, ealistlength: UInt, eaindex: Long, restartscan: Boolean): NTSTATUS

public expect fun NtQueryFullAttributesFile(objectattributes: Long, fileinformation: Long): NTSTATUS

public expect fun NtQueryInformationByName(objectattributes: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS): NTSTATUS

public expect fun NtQueryInformationFile(filehandle: HANDLE, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS): NTSTATUS

public expect fun NtQueryInformationToken(tokenhandle: HANDLE, tokeninformationclass: TOKEN_INFORMATION_CLASS, tokeninformation: Long, tokeninformationlength: UInt, returnlength: Long): NTSTATUS

public expect fun NtQueryQuotaInformationFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt, returnsingleentry: Boolean, sidlist: Long, sidlistlength: UInt, startsid: PSID, restartscan: Boolean): NTSTATUS

public expect fun NtQuerySecurityObject(handle: HANDLE, securityinformation: UInt, securitydescriptor: PSECURITY_DESCRIPTOR, length: UInt, lengthneeded: Long): NTSTATUS

public expect fun NtQuerySymbolicLinkObject(linkhandle: HANDLE, linktarget: Long, returnedlength: Long): NTSTATUS

public expect fun NtQueryVirtualMemory(processhandle: HANDLE, baseaddress: Long, memoryinformationclass: MEMORY_INFORMATION_CLASS, memoryinformation: Long, memoryinformationlength: ULong, returnlength: Long): NTSTATUS

public expect fun NtQueryVolumeInformationFile(filehandle: HANDLE, iostatusblock: Long, fsinformation: Long, length: UInt, fsinformationclass: FS_INFORMATION_CLASS): NTSTATUS

public expect fun NtReadFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, buffer: Long, length: UInt, byteoffset: Long, key: Long): NTSTATUS

public expect fun NtSetEaFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt): NTSTATUS

public expect fun NtSetEvent(eventhandle: HANDLE, previousstate: Long): NTSTATUS

public expect fun NtSetInformationFile(filehandle: HANDLE, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS): NTSTATUS

public expect fun NtSetInformationToken(tokenhandle: HANDLE, tokeninformationclass: TOKEN_INFORMATION_CLASS, tokeninformation: Long, tokeninformationlength: UInt): NTSTATUS

public expect fun NtSetInformationVirtualMemory(processhandle: HANDLE, vminformationclass: VIRTUAL_MEMORY_INFORMATION_CLASS, numberofentries: ULong, virtualaddresses: Long, vminformation: Long, vminformationlength: UInt): NTSTATUS

public expect fun NtSetQuotaInformationFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt): NTSTATUS

public expect fun NtSetSecurityObject(handle: HANDLE, securityinformation: UInt, securitydescriptor: PSECURITY_DESCRIPTOR): NTSTATUS

public expect fun NtSetVolumeInformationFile(filehandle: HANDLE, iostatusblock: Long, fsinformation: Long, length: UInt, fsinformationclass: FS_INFORMATION_CLASS): NTSTATUS

public expect fun NtUnlockFile(filehandle: HANDLE, iostatusblock: Long, byteoffset: Long, length: Long, key: UInt): NTSTATUS

public expect fun NtWriteFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, buffer: Long, length: UInt, byteoffset: Long, key: Long): NTSTATUS

public expect fun ObInsertObject(obj: Long, passedaccessstate: Long, desiredaccess: UInt, objectpointerbias: UInt, newobject: Long, handle: Long): NTSTATUS

public expect fun ObIsKernelHandle(handle: HANDLE): Boolean

public expect fun ObMakeTemporaryObject(obj: Long)

public expect fun ObOpenObjectByPointer(obj: Long, handleattributes: UInt, passedaccessstate: Long, desiredaccess: UInt, objecttype: POBJECT_TYPE, accessmode: Byte, handle: Long): NTSTATUS

public expect fun ObOpenObjectByPointerWithTag(obj: Long, handleattributes: UInt, passedaccessstate: Long, desiredaccess: UInt, objecttype: POBJECT_TYPE, accessmode: Byte, tag: UInt, handle: Long): NTSTATUS

public expect fun ObQueryNameString(obj: Long, objectnameinfo: Long, length: UInt, returnlength: Long): NTSTATUS

public expect fun ObQueryObjectAuditingByHandle(handle: HANDLE, generateonclose: Long): NTSTATUS

public expect fun PfxFindPrefix(prefixtable: Long, fullname: Long): Long

public expect fun PfxInitialize(prefixtable: Long)

public expect fun PfxInsertPrefix(prefixtable: Long, prefix: Long, prefixtableentry: Long): Boolean

public expect fun PfxRemovePrefix(prefixtable: Long, prefixtableentry: Long)

public expect fun PoQueueShutdownWorkItem(workitem: Long): NTSTATUS

public expect fun PsAssignImpersonationToken(thread: PETHREAD, token: HANDLE): NTSTATUS

public expect fun PsChargePoolQuota(process: PEPROCESS, pooltype: POOL_TYPE, amount: ULong)

public expect fun PsChargeProcessPoolQuota(process: PEPROCESS, pooltype: POOL_TYPE, amount: ULong): NTSTATUS

public expect fun PsDereferenceImpersonationToken(impersonationtoken: Long)

public expect fun PsDereferencePrimaryToken(primarytoken: Long)

public expect fun PsDisableImpersonation(thread: PETHREAD, impersonationstate: Long): Boolean

public expect fun PsGetProcessExitTime(): Long

public expect fun PsGetThreadProcess(thread: PETHREAD): PEPROCESS

public expect fun PsImpersonateClient(thread: PETHREAD, token: Long, copyonopen: Boolean, effectiveonly: Boolean, impersonationlevel: SECURITY_IMPERSONATION_LEVEL): NTSTATUS

public expect fun PsIsDiskCountersEnabled(): Boolean

public expect fun PsIsSystemThread(thread: PETHREAD): Boolean

public expect fun PsIsThreadTerminating(thread: PETHREAD): Boolean

public expect fun PsLookupProcessByProcessId(processid: HANDLE, process: Long): NTSTATUS

public expect fun PsLookupThreadByThreadId(threadid: HANDLE, thread: Long): NTSTATUS

public expect fun PsReferenceImpersonationToken(thread: PETHREAD, copyonopen: Long, effectiveonly: Long, impersonationlevel: Long): Long

public expect fun PsReferencePrimaryToken(process: PEPROCESS): Long

public expect fun PsRestoreImpersonation(thread: PETHREAD, impersonationstate: Long)

public expect fun PsReturnPoolQuota(process: PEPROCESS, pooltype: POOL_TYPE, amount: ULong)

public expect fun PsRevertToSelf()

public expect fun PsUpdateDiskCounters(process: PEPROCESS, bytesread: ULong, byteswritten: ULong, readoperationcount: UInt, writeoperationcount: UInt, flushoperationcount: UInt)

public expect fun QuerySecurityContextToken(phcontext: Long, token: Long): HRESULT

public expect fun RtlAbsoluteToSelfRelativeSD(absolutesecuritydescriptor: PSECURITY_DESCRIPTOR, selfrelativesecuritydescriptor: PSECURITY_DESCRIPTOR, bufferlength: Long): NTSTATUS

public expect fun RtlAddAccessAllowedAce(acl: Long, acerevision: UInt, accessmask: UInt, sid: PSID): NTSTATUS

public expect fun RtlAddAccessAllowedAceEx(acl: Long, acerevision: UInt, aceflags: UInt, accessmask: UInt, sid: PSID): NTSTATUS

public expect fun RtlAddAce(acl: Long, acerevision: UInt, startingaceindex: UInt, acelist: Long, acelistlength: UInt): NTSTATUS

public expect fun RtlAllocateAndInitializeSid(identifierauthority: Long, subauthoritycount: UByte, subauthority0: UInt, subauthority1: UInt, subauthority2: UInt, subauthority3: UInt, subauthority4: UInt, subauthority5: UInt, subauthority6: UInt, subauthority7: UInt, sid: Long): NTSTATUS

public expect fun RtlAllocateAndInitializeSidEx(identifierauthority: Long, subauthoritycount: UByte, subauthorities: Long, sid: Long): NTSTATUS

public expect fun RtlAllocateHeap(heaphandle: Long, flags: UInt, size: ULong): Long

public expect fun RtlAppendStringToString(destination: Long, source: Long): NTSTATUS

public expect fun RtlCompareAltitudes(altitude1: Long, altitude2: Long): Int

public expect fun RtlCompareMemoryUlong(source: Long, length: ULong, pattern: UInt): ULong

public expect fun RtlCompressBuffer(compressionformatandengine: UShort, uncompressedbuffer: Long, uncompressedbuffersize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, uncompressedchunksize: UInt, finalcompressedsize: Long, workspace: Long): NTSTATUS

public expect fun RtlCompressChunks(uncompressedbuffer: Long, uncompressedbuffersize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, compresseddatainfo: Long, compresseddatainfolength: UInt, workspace: Long): NTSTATUS

public expect fun RtlCopyLuid(destinationluid: Long, sourceluid: Long)

public expect fun RtlCopySid(destinationsidlength: UInt, destinationsid: PSID, sourcesid: PSID): NTSTATUS

public expect fun RtlCreateAcl(acl: Long, acllength: UInt, aclrevision: UInt): NTSTATUS

public expect fun RtlCreateHeap(flags: UInt, heapbase: Long, reservesize: ULong, commitsize: ULong, lock: Long, parameters: Long): Long

public expect fun RtlCreateServiceSid(servicename: Long, servicesid: PSID, servicesidlength: Long): NTSTATUS

public expect fun RtlCreateSystemVolumeInformationFolder(volumerootpath: Long): NTSTATUS

public expect fun RtlCreateUnicodeString(destinationstring: Long, sourcestring: PCWSTR): Boolean

public expect fun RtlCreateVirtualAccountSid(name: Long, basesubauthority: UInt, sid: PSID, sidlength: Long): NTSTATUS

public expect fun RtlCustomCPToUnicodeN(customcp: Long, unicodestring: PWSTR, maxbytesinunicodestring: UInt, bytesinunicodestring: Long, customcpstring: PCSTR, bytesincustomcpstring: UInt): NTSTATUS

public expect fun RtlDecompressBuffer(compressionformat: UShort, uncompressedbuffer: Long, uncompressedbuffersize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, finaluncompressedsize: Long): NTSTATUS

public expect fun RtlDecompressBufferEx(compressionformat: UShort, uncompressedbuffer: Long, uncompressedbuffersize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, finaluncompressedsize: Long, workspace: Long): NTSTATUS

public expect fun RtlDecompressBufferEx2(compressionformat: UShort, uncompressedbuffer: Long, uncompressedbuffersize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, uncompressedchunksize: UInt, finaluncompressedsize: Long, workspace: Long): NTSTATUS

public expect fun RtlDecompressChunks(uncompressedbuffer: Long, uncompressedbuffersize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, compressedtail: Long, compressedtailsize: UInt, compresseddatainfo: Long): NTSTATUS

public expect fun RtlDecompressFragment(compressionformat: UShort, uncompressedfragment: Long, uncompressedfragmentsize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, fragmentoffset: UInt, finaluncompressedsize: Long, workspace: Long): NTSTATUS

public expect fun RtlDecompressFragmentEx(compressionformat: UShort, uncompressedfragment: Long, uncompressedfragmentsize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, fragmentoffset: UInt, uncompressedchunksize: UInt, finaluncompressedsize: Long, workspace: Long): NTSTATUS

public expect fun RtlDeleteAce(acl: Long, aceindex: UInt): NTSTATUS

public expect fun RtlDescribeChunk(compressionformat: UShort, compressedbuffer: Long, endofcompressedbufferplus1: Long, chunkbuffer: Long, chunksize: Long): NTSTATUS

public expect fun RtlDestroyHeap(heaphandle: Long): Long

public expect fun RtlDosPathNameToNtPathName_U_WithStatus(dosfilename: PCWSTR, ntfilename: Long, filepart: Long, reserved: Long): NTSTATUS

public expect fun RtlDowncaseUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS

public expect fun RtlDuplicateUnicodeString(flags: UInt, stringin: Long, stringout: Long): NTSTATUS

public expect fun RtlEqualPrefixSid(sid1: PSID, sid2: PSID): Boolean

public expect fun RtlEqualSid(sid1: PSID, sid2: PSID): Boolean

public expect fun RtlFindUnicodePrefix(prefixtable: Long, fullname: Long, caseinsensitiveindex: UInt): Long

public expect fun RtlFreeHeap(heaphandle: Long, flags: UInt, baseaddress: Long): UInt

public expect fun RtlFreeSid(sid: PSID): Long

public expect fun RtlGenerate8dot3Name(name: Long, allowextendedcharacters: Boolean, context: Long, name8dot3: Long): NTSTATUS

public expect fun RtlGetAce(acl: Long, aceindex: UInt, ace: Long): NTSTATUS

public expect fun RtlGetCompressionWorkSpaceSize(compressionformatandengine: UShort, compressbufferworkspacesize: Long, compressfragmentworkspacesize: Long): NTSTATUS

public expect fun RtlGetDaclSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, daclpresent: Long, dacl: Long, dacldefaulted: Long): NTSTATUS

public expect fun RtlGetGroupSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, group: Long, groupdefaulted: Long): NTSTATUS

public expect fun RtlGetOwnerSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, owner: Long, ownerdefaulted: Long): NTSTATUS

public expect fun RtlGetSaclSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, saclpresent: Long, sacl: Long, sacldefaulted: Long): NTSTATUS

public expect fun RtlIdentifierAuthoritySid(sid: PSID): Long

public expect fun RtlIdnToAscii(flags: UInt, sourcestring: PCWSTR, sourcestringlength: Int, destinationstring: PWSTR, destinationstringlength: Long): NTSTATUS

public expect fun RtlIdnToNameprepUnicode(flags: UInt, sourcestring: PCWSTR, sourcestringlength: Int, destinationstring: PWSTR, destinationstringlength: Long): NTSTATUS

public expect fun RtlIdnToUnicode(flags: UInt, sourcestring: PCWSTR, sourcestringlength: Int, destinationstring: PWSTR, destinationstringlength: Long): NTSTATUS

public expect fun RtlInitCodePageTable(tablebase: Long, codepagetable: Long)

public expect fun RtlInitUnicodeStringEx(destinationstring: Long, sourcestring: PCWSTR): NTSTATUS

public expect fun RtlInitializeSid(sid: PSID, identifierauthority: Long, subauthoritycount: UByte): NTSTATUS

public expect fun RtlInitializeSidEx(sid: PSID, identifierauthority: Long, subauthoritycount: UByte, vararg variadicArgs: Long): NTSTATUS

public expect fun RtlInitializeUnicodePrefix(prefixtable: Long)

public expect fun RtlInsertUnicodePrefix(prefixtable: Long, prefix: Long, prefixtableentry: Long): Boolean

public expect fun RtlIsCloudFilesPlaceholder(fileattributes: UInt, reparsetag: UInt): Boolean

public expect fun RtlIsDosDeviceName_U(dosfilename: PCWSTR): UInt

public expect fun RtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag: UInt): Boolean

public expect fun RtlIsNormalizedString(normform: UInt, sourcestring: PCWSTR, sourcestringlength: Int, normalized: Long): NTSTATUS

public expect fun RtlIsPartialPlaceholder(fileattributes: UInt, reparsetag: UInt): Boolean

public expect fun RtlIsPartialPlaceholderFileHandle(filehandle: HANDLE, ispartialplaceholder: Long): NTSTATUS

public expect fun RtlIsPartialPlaceholderFileInfo(infobuffer: Long, infoclass: FILE_INFORMATION_CLASS, ispartialplaceholder: Long): NTSTATUS

public expect fun RtlIsSandboxedToken(context: Long, previousmode: Byte): Boolean

public expect fun RtlIsValidOemCharacter(char: PWSTR): Boolean

public expect fun RtlLengthRequiredSid(subauthoritycount: UInt): UInt

public expect fun RtlLengthSid(sid: PSID): UInt

public expect fun RtlMultiByteToUnicodeN(unicodestring: PWSTR, maxbytesinunicodestring: UInt, bytesinunicodestring: Long, multibytestring: PCSTR, bytesinmultibytestring: UInt): NTSTATUS

public expect fun RtlMultiByteToUnicodeSize(bytesinunicodestring: Long, multibytestring: PCSTR, bytesinmultibytestring: UInt): NTSTATUS

public expect fun RtlNextUnicodePrefix(prefixtable: Long, restart: Boolean): Long

public expect fun RtlNormalizeString(normform: UInt, sourcestring: PCWSTR, sourcestringlength: Int, destinationstring: PWSTR, destinationstringlength: Long): NTSTATUS
