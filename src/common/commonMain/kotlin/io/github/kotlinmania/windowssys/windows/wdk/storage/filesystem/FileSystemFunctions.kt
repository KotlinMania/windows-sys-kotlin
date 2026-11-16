package io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.WaitType

public expect fun applyControlToken(phcontext: ConstPtr, pinput: ConstPtr): Hresult

public expect fun ccAsyncCopyRead(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, wait: Boolean, buffer: MutPtr, iostatus: MutPtr, ioissuerthread: Pethread, asyncreadcontext: ConstPtr): Boolean

public expect fun ccCanIWrite(fileobject: ConstPtr, bytestowrite: UInt, wait: Boolean, retrying: UByte): Boolean

public expect fun ccCoherencyFlushAndPurgeCache(sectionobjectpointer: ConstPtr, fileoffset: ConstPtr, length: UInt, iostatus: MutPtr, flags: UInt)

public expect fun ccCopyRead(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, wait: Boolean, buffer: MutPtr, iostatus: MutPtr): Boolean

public expect fun ccCopyReadEx(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, wait: Boolean, buffer: MutPtr, iostatus: MutPtr, ioissuerthread: Pethread): Boolean

public expect fun ccCopyWrite(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, wait: Boolean, buffer: ConstPtr): Boolean

public expect fun ccCopyWriteEx(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, wait: Boolean, buffer: ConstPtr, ioissuerthread: Pethread): Boolean

public expect fun ccCopyWriteWontFlush(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt): Boolean

public expect fun ccDeferWrite(fileobject: ConstPtr, postroutine: PccPostDeferredWrite, context1: ConstPtr, context2: ConstPtr, bytestowrite: UInt, retrying: Boolean)

public expect fun ccErrorCallbackRoutine(context: ConstPtr): Ntstatus

public expect fun ccFastCopyRead(fileobject: ConstPtr, fileoffset: UInt, length: UInt, pagecount: UInt, buffer: MutPtr, iostatus: MutPtr)

public expect fun ccFastCopyWrite(fileobject: ConstPtr, fileoffset: UInt, length: UInt, buffer: ConstPtr)

public expect fun ccFlushCache(sectionobjectpointer: ConstPtr, fileoffset: ConstPtr, length: UInt, iostatus: MutPtr)

public expect fun ccGetDirtyPages(loghandle: ConstPtr, dirtypageroutine: PdirtyPageRoutine, context1: ConstPtr, context2: ConstPtr): Long

public expect fun ccGetFileObjectFromBcb(bcb: ConstPtr): MutPtr

public expect fun ccGetFileObjectFromSectionPtrs(sectionobjectpointer: ConstPtr): MutPtr

public expect fun ccGetFileObjectFromSectionPtrsRef(sectionobjectpointer: ConstPtr): MutPtr

public expect fun ccGetFlushedValidData(sectionobjectpointer: ConstPtr, bcblistheld: Boolean): Long

public expect fun ccInitializeCacheMap(fileobject: ConstPtr, filesizes: ConstPtr, pinaccess: Boolean, callbacks: ConstPtr, lazywritecontext: ConstPtr)

public expect fun ccInitializeCacheMapEx(fileobject: ConstPtr, filesizes: ConstPtr, pinaccess: Boolean, callbacks: ConstPtr, lazywritecontext: ConstPtr, flags: UInt)

public expect fun ccIsCacheManagerCallbackNeeded(status: Ntstatus): Boolean

public expect fun ccIsThereDirtyData(vpb: ConstPtr): Boolean

public expect fun ccIsThereDirtyDataEx(vpb: ConstPtr, numberofdirtypages: ConstPtr): Boolean

public expect fun ccMapData(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, flags: UInt, bcb: MutPtr, buffer: MutPtr): Boolean

public expect fun ccMdlRead(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, mdlchain: MutPtr, iostatus: MutPtr)

public expect fun ccMdlReadComplete(fileobject: ConstPtr, mdlchain: ConstPtr)

public expect fun ccMdlWriteAbort(fileobject: ConstPtr, mdlchain: ConstPtr)

public expect fun ccMdlWriteComplete(fileobject: ConstPtr, fileoffset: ConstPtr, mdlchain: ConstPtr)

public expect fun ccPinMappedData(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, flags: UInt, bcb: MutPtr): Boolean

public expect fun ccPinRead(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, flags: UInt, bcb: MutPtr, buffer: MutPtr): Boolean

public expect fun ccPrepareMdlWrite(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, mdlchain: MutPtr, iostatus: MutPtr)

public expect fun ccPreparePinWrite(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, zero: Boolean, flags: UInt, bcb: MutPtr, buffer: MutPtr): Boolean

public expect fun ccPurgeCacheSection(sectionobjectpointer: ConstPtr, fileoffset: ConstPtr, length: UInt, flags: UInt): Boolean

public expect fun ccRemapBcb(bcb: ConstPtr): MutPtr

public expect fun ccRepinBcb(bcb: ConstPtr)

public expect fun ccScheduleReadAhead(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt)

public expect fun ccScheduleReadAheadEx(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, ioissuerthread: Pethread)

public expect fun ccSetAdditionalCacheAttributes(fileobject: ConstPtr, disablereadahead: Boolean, disablewritebehind: Boolean)

public expect fun ccSetAdditionalCacheAttributesEx(fileobject: ConstPtr, flags: UInt)

public expect fun ccSetBcbOwnerPointer(bcb: ConstPtr, ownerpointer: ConstPtr)

public expect fun ccSetDirtyPageThreshold(fileobject: ConstPtr, dirtypagethreshold: UInt)

public expect fun ccSetDirtyPinnedData(bcbvoid: ConstPtr, lsn: ConstPtr)

public expect fun ccSetFileSizes(fileobject: ConstPtr, filesizes: ConstPtr)

public expect fun ccSetFileSizesEx(fileobject: ConstPtr, filesizes: ConstPtr): Ntstatus

public expect fun ccSetLogHandleForFile(fileobject: ConstPtr, loghandle: ConstPtr, flushtolsnroutine: PflushToLsn)

public expect fun ccSetParallelFlushFile(fileobject: ConstPtr, enableparallelflush: Boolean)

public expect fun ccSetReadAheadGranularity(fileobject: ConstPtr, granularity: UInt)

public expect fun ccUninitializeCacheMap(fileobject: ConstPtr, truncatesize: ConstPtr, uninitializeevent: ConstPtr): Boolean

public expect fun ccUnpinData(bcb: ConstPtr)

public expect fun ccUnpinDataForThread(bcb: ConstPtr, resourcethreadid: ULong)

public expect fun ccUnpinRepinnedBcb(bcb: ConstPtr, writethrough: Boolean, iostatus: MutPtr)

public expect fun ccWaitForCurrentLazyWriterActivity(): Ntstatus

public expect fun ccZeroData(fileobject: ConstPtr, startoffset: ConstPtr, endoffset: ConstPtr, wait: Boolean): Boolean

public expect fun completeAuthToken(phcontext: ConstPtr, ptoken: ConstPtr): Hresult

public expect fun exDisableResourceBoostLite(resource: ConstPtr)

public expect fun exQueryPoolBlockSize(poolblock: ConstPtr, quotacharged: MutPtr): ULong

public expect fun exportSecurityContext(phcontext: ConstPtr, fflags: UInt, ppackedcontext: MutPtr, ptoken: MutPtr): Hresult

public expect fun fsRtlAcknowledgeEcp(ecpcontext: ConstPtr)

public expect fun fsRtlAcquireFileExclusive(fileobject: ConstPtr)

public expect fun fsRtlAddBaseMcbEntry(mcb: MutPtr, vbn: Long, lbn: Long, sectorcount: Long): Boolean

public expect fun fsRtlAddBaseMcbEntryEx(mcb: MutPtr, vbn: Long, lbn: Long, sectorcount: Long): Ntstatus

public expect fun fsRtlAddLargeMcbEntry(mcb: MutPtr, vbn: Long, lbn: Long, sectorcount: Long): Boolean

public expect fun fsRtlAddMcbEntry(mcb: MutPtr, vbn: UInt, lbn: UInt, sectorcount: UInt): Boolean

public expect fun fsRtlAddToTunnelCache(cache: MutPtr, directorykey: ULong, shortname: ConstPtr, longname: ConstPtr, keybyshortname: Boolean, datalength: UInt, data: ConstPtr)

public expect fun fsRtlAddToTunnelCacheEx(cache: MutPtr, directorykey: ULong, shortname: ConstPtr, longname: ConstPtr, flags: UInt, datalength: UInt, data: ConstPtr)

public expect fun fsRtlAllocateAePushLock(pooltype: PoolType, tag: UInt): MutPtr

public expect fun fsRtlAllocateExtraCreateParameter(ecptype: ConstPtr, sizeofcontext: UInt, flags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, pooltag: UInt, ecpcontext: MutPtr): Ntstatus

public expect fun fsRtlAllocateExtraCreateParameterFromLookasideList(ecptype: ConstPtr, sizeofcontext: UInt, flags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, lookasidelist: MutPtr, ecpcontext: MutPtr): Ntstatus

public expect fun fsRtlAllocateExtraCreateParameterList(flags: UInt, ecplist: MutPtr): Ntstatus

public expect fun fsRtlAllocateFileLock(completelockirproutine: PcompleteLockIrpRoutine, unlockroutine: PunlockRoutine): MutPtr

public expect fun fsRtlAllocateResource(): MutPtr

public expect fun fsRtlAreNamesEqual(constantnamea: ConstPtr, constantnameb: ConstPtr, ignorecase: Boolean, upcasetable: ConstPtr): Boolean

public expect fun fsRtlAreThereCurrentOrInProgressFileLocks(filelock: ConstPtr): Boolean

public expect fun fsRtlAreThereWaitingFileLocks(filelock: ConstPtr): Boolean

public expect fun fsRtlAreVolumeStartupApplicationsComplete(): Boolean

public expect fun fsRtlBalanceReads(targetdevice: ConstPtr): Ntstatus

public expect fun fsRtlCancellableWaitForMultipleObjects(count: UInt, objectarray: ConstPtr, waittype: WaitType, timeout: ConstPtr, waitblockarray: ConstPtr, irp: ConstPtr): Ntstatus

public expect fun fsRtlCancellableWaitForSingleObject(obj: ConstPtr, timeout: ConstPtr, irp: ConstPtr): Ntstatus

public expect fun fsRtlChangeBackingFileObject(currentfileobject: ConstPtr, newfileobject: ConstPtr, changebackingtype: FsrtlChangeBackingType, flags: UInt): Ntstatus

public expect fun fsRtlCheckLockForOplockRequest(filelock: ConstPtr, allocationsize: ConstPtr): Boolean

public expect fun fsRtlCheckLockForReadAccess(filelock: ConstPtr, irp: ConstPtr): Boolean

public expect fun fsRtlCheckLockForWriteAccess(filelock: ConstPtr, irp: ConstPtr): Boolean

public expect fun fsRtlCheckOplock(oplock: ConstPtr, irp: ConstPtr, context: ConstPtr, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus

public expect fun fsRtlCheckOplockEx(oplock: ConstPtr, irp: ConstPtr, flags: UInt, context: ConstPtr, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus

public expect fun fsRtlCheckOplockEx2(oplock: ConstPtr, irp: ConstPtr, flags: UInt, flagsex2: UInt, completionroutinecontext: ConstPtr, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp, timeout: ULong, notifycontext: ConstPtr, notifyroutine: PoplockNotifyRoutine): Ntstatus

public expect fun fsRtlCheckUpperOplock(oplock: ConstPtr, newloweroplockstate: UInt, completionroutinecontext: ConstPtr, completionroutine: PoplockWaitCompleteRoutine, prependroutine: PoplockFsPrepostIrp, flags: UInt): Ntstatus

public expect fun fsRtlCopyRead(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, wait: Boolean, lockkey: UInt, buffer: MutPtr, iostatus: MutPtr, deviceobject: ConstPtr): Boolean

public expect fun fsRtlCopyWrite(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, wait: Boolean, lockkey: UInt, buffer: ConstPtr, iostatus: MutPtr, deviceobject: ConstPtr): Boolean

public expect fun fsRtlCreateSectionForDataScan(sectionhandle: MutPtr, sectionobject: MutPtr, sectionfilesize: MutPtr, fileobject: ConstPtr, desiredaccess: UInt, objectattributes: ConstPtr, maximumsize: ConstPtr, sectionpageprotection: UInt, allocationattributes: UInt, flags: UInt): Ntstatus

public expect fun fsRtlCurrentBatchOplock(oplock: ConstPtr): Boolean

public expect fun fsRtlCurrentOplock(oplock: ConstPtr): Boolean

public expect fun fsRtlCurrentOplockH(oplock: ConstPtr): Boolean

public expect fun fsRtlDeleteExtraCreateParameterLookasideList(lookaside: MutPtr, flags: UInt)

public expect fun fsRtlDeleteKeyFromTunnelCache(cache: MutPtr, directorykey: ULong)

public expect fun fsRtlDeleteTunnelCache(cache: MutPtr)

public expect fun fsRtlDeregisterUncProvider(handle: Handle)

public expect fun fsRtlDismountComplete(deviceobject: ConstPtr, dismountstatus: Ntstatus)

public expect fun fsRtlDissectDbcs(path: io.github.kotlinmania.windowssys.windows.win32.system.kernel.String, firstname: MutPtr, remainingname: MutPtr)

public expect fun fsRtlDissectName(path: UnicodeString, firstname: MutPtr, remainingname: MutPtr)

public expect fun fsRtlDoesDbcsContainWildCards(name: ConstPtr): Boolean

public expect fun fsRtlDoesNameContainWildCards(name: ConstPtr): Boolean

public expect fun fsRtlFastCheckLockForRead(filelock: ConstPtr, startingbyte: ConstPtr, length: ConstPtr, key: UInt, fileobject: ConstPtr, processid: ConstPtr): Boolean

public expect fun fsRtlFastCheckLockForWrite(filelock: ConstPtr, startingbyte: ConstPtr, length: ConstPtr, key: UInt, fileobject: ConstPtr, processid: ConstPtr): Boolean

public expect fun fsRtlFastUnlockAll(filelock: ConstPtr, fileobject: ConstPtr, processid: Peprocess, context: ConstPtr): Ntstatus

public expect fun fsRtlFastUnlockAllByKey(filelock: ConstPtr, fileobject: ConstPtr, processid: Peprocess, key: UInt, context: ConstPtr): Ntstatus

public expect fun fsRtlFastUnlockSingle(filelock: ConstPtr, fileobject: ConstPtr, fileoffset: ConstPtr, length: ConstPtr, processid: Peprocess, key: UInt, context: ConstPtr, alreadysynchronized: Boolean): Ntstatus

public expect fun fsRtlFindExtraCreateParameter(ecplist: ConstPtr, ecptype: ConstPtr, ecpcontext: MutPtr, ecpcontextsize: MutPtr): Ntstatus

public expect fun fsRtlFindInTunnelCache(cache: ConstPtr, directorykey: ULong, name: ConstPtr, shortname: MutPtr, longname: MutPtr, datalength: MutPtr, data: MutPtr): Boolean

public expect fun fsRtlFindInTunnelCacheEx(cache: ConstPtr, directorykey: ULong, name: ConstPtr, shortname: MutPtr, longname: MutPtr, flags: UInt, datalength: MutPtr, data: MutPtr): Boolean

public expect fun fsRtlFreeAePushLock(aepushlock: MutPtr)

public expect fun fsRtlFreeExtraCreateParameter(ecpcontext: ConstPtr)

public expect fun fsRtlFreeExtraCreateParameterList(ecplist: ConstPtr)

public expect fun fsRtlFreeFileLock(filelock: ConstPtr)

public expect fun fsRtlGetCurrentProcessLoaderList(): MutPtr

public expect fun fsRtlGetEcpListFromIrp(irp: ConstPtr, ecplist: MutPtr): Ntstatus

public expect fun fsRtlGetFileSize(fileobject: ConstPtr, filesize: MutPtr): Ntstatus

public expect fun fsRtlGetNextBaseMcbEntry(mcb: ConstPtr, runindex: UInt, vbn: MutPtr, lbn: MutPtr, sectorcount: MutPtr): Boolean

public expect fun fsRtlGetNextExtraCreateParameter(ecplist: ConstPtr, currentecpcontext: ConstPtr, nextecptype: MutPtr, nextecpcontext: MutPtr, nextecpcontextsize: MutPtr): Ntstatus

public expect fun fsRtlGetNextFileLock(filelock: ConstPtr, restart: Boolean): MutPtr

public expect fun fsRtlGetNextLargeMcbEntry(mcb: ConstPtr, runindex: UInt, vbn: MutPtr, lbn: MutPtr, sectorcount: MutPtr): Boolean

public expect fun fsRtlGetNextMcbEntry(mcb: ConstPtr, runindex: UInt, vbn: MutPtr, lbn: MutPtr, sectorcount: MutPtr): Boolean

public expect fun fsRtlGetSectorSizeInformation(deviceobject: ConstPtr, sectorsizeinfo: MutPtr): Ntstatus

public expect fun fsRtlGetSupportedFeatures(deviceobject: ConstPtr, supportedfeatures: MutPtr): Ntstatus

public expect fun fsRtlGetVirtualDiskNestingLevel(deviceobject: ConstPtr, nestinglevel: MutPtr, nestingflags: MutPtr): Ntstatus

public expect fun fsRtlIncrementCcFastMdlReadWait()

public expect fun fsRtlIncrementCcFastReadNoWait()

public expect fun fsRtlIncrementCcFastReadNotPossible()

public expect fun fsRtlIncrementCcFastReadResourceMiss()

public expect fun fsRtlIncrementCcFastReadWait()

public expect fun fsRtlInitExtraCreateParameterLookasideList(lookaside: MutPtr, flags: UInt, size: ULong, tag: UInt)

public expect fun fsRtlInitializeBaseMcb(mcb: MutPtr, pooltype: PoolType)

public expect fun fsRtlInitializeBaseMcbEx(mcb: MutPtr, pooltype: PoolType, flags: UShort): Boolean

public expect fun fsRtlInitializeExtraCreateParameter(ecp: MutPtr, ecpflags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, totalsize: UInt, ecptype: ConstPtr, listallocatedfrom: ConstPtr)

public expect fun fsRtlInitializeExtraCreateParameterList(ecplist: MutPtr): Ntstatus

public expect fun fsRtlInitializeFileLock(filelock: MutPtr, completelockirproutine: PcompleteLockIrpRoutine, unlockroutine: PunlockRoutine)

public expect fun fsRtlInitializeLargeMcb(mcb: MutPtr, pooltype: PoolType)

public expect fun fsRtlInitializeMcb(mcb: MutPtr, pooltype: PoolType)

public expect fun fsRtlInitializeOplock(oplock: MutPtr)

public expect fun fsRtlInitializeTunnelCache(cache: MutPtr)

public expect fun fsRtlInsertExtraCreateParameter(ecplist: MutPtr, ecpcontext: MutPtr): Ntstatus

public expect fun fsRtlInsertPerFileContext(perfilecontextpointer: ConstPtr, ptr: ConstPtr): Ntstatus

public expect fun fsRtlInsertPerFileObjectContext(fileobject: ConstPtr, ptr: ConstPtr): Ntstatus

public expect fun fsRtlInsertPerStreamContext(perstreamcontext: ConstPtr, ptr: ConstPtr): Ntstatus

public expect fun fsRtlIs32BitProcess(process: Peprocess): Boolean

public expect fun fsRtlIsDaxVolume(fileobject: ConstPtr): Boolean

public expect fun fsRtlIsDbcsInExpression(expression: ConstPtr, name: ConstPtr): Boolean

public expect fun fsRtlIsEcpAcknowledged(ecpcontext: ConstPtr): Boolean

public expect fun fsRtlIsEcpFromUserMode(ecpcontext: ConstPtr): Boolean

public expect fun fsRtlIsExtentDangling(startpage: UInt, numberofpages: UInt, flags: UInt): UInt

public expect fun fsRtlIsFatDbcsLegal(dbcsname: io.github.kotlinmania.windowssys.windows.win32.system.kernel.String, wildcardspermissible: Boolean, pathnamepermissible: Boolean, leadingbackslashpermissible: Boolean): Boolean

public expect fun fsRtlIsHpfsDbcsLegal(dbcsname: io.github.kotlinmania.windowssys.windows.win32.system.kernel.String, wildcardspermissible: Boolean, pathnamepermissible: Boolean, leadingbackslashpermissible: Boolean): Boolean

public expect fun fsRtlIsMobileOS(): Boolean

public expect fun fsRtlIsNameInExpression(expression: ConstPtr, name: ConstPtr, ignorecase: Boolean, upcasetable: Pcwstr): Boolean

public expect fun fsRtlIsNameInUnUpcasedExpression(expression: ConstPtr, name: ConstPtr, ignorecase: Boolean, upcasetable: Pcwstr): Boolean

public expect fun fsRtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag: UInt): Boolean

public expect fun fsRtlIsNtstatusExpected(exception: Ntstatus): Boolean

public expect fun fsRtlIsPagingFile(fileobject: ConstPtr): UInt

public expect fun fsRtlIsSystemPagingFile(fileobject: ConstPtr): UInt

public expect fun fsRtlIssueDeviceIoControl(deviceobject: ConstPtr, ioctl: UInt, flags: UByte, inputbuffer: ConstPtr, inputbufferlength: UInt, outputbuffer: ConstPtr, outputbufferlength: UInt, iosbinformation: MutPtr): Ntstatus

public expect fun fsRtlKernelFsControlFile(fileobject: ConstPtr, fscontrolcode: UInt, inputbuffer: ConstPtr, inputbufferlength: UInt, outputbuffer: MutPtr, outputbufferlength: UInt, retoutputbuffersize: MutPtr): Ntstatus

public expect fun fsRtlLogCcFlushError(filename: ConstPtr, deviceobject: ConstPtr, sectionobjectpointer: ConstPtr, flusherror: Ntstatus, flags: UInt): Ntstatus

public expect fun fsRtlLookupBaseMcbEntry(mcb: ConstPtr, vbn: Long, lbn: MutPtr, sectorcountfromlbn: MutPtr, startinglbn: MutPtr, sectorcountfromstartinglbn: MutPtr, index: MutPtr): Boolean

public expect fun fsRtlLookupLargeMcbEntry(mcb: ConstPtr, vbn: Long, lbn: MutPtr, sectorcountfromlbn: MutPtr, startinglbn: MutPtr, sectorcountfromstartinglbn: MutPtr, index: MutPtr): Boolean

public expect fun fsRtlLookupLastBaseMcbEntry(mcb: ConstPtr, vbn: MutPtr, lbn: MutPtr): Boolean

public expect fun fsRtlLookupLastBaseMcbEntryAndIndex(opaquemcb: ConstPtr, largevbn: MutPtr, largelbn: MutPtr, index: MutPtr): Boolean

public expect fun fsRtlLookupLastLargeMcbEntry(mcb: ConstPtr, vbn: MutPtr, lbn: MutPtr): Boolean

public expect fun fsRtlLookupLastLargeMcbEntryAndIndex(opaquemcb: ConstPtr, largevbn: MutPtr, largelbn: MutPtr, index: MutPtr): Boolean

public expect fun fsRtlLookupLastMcbEntry(mcb: ConstPtr, vbn: MutPtr, lbn: MutPtr): Boolean

public expect fun fsRtlLookupMcbEntry(mcb: ConstPtr, vbn: UInt, lbn: MutPtr, sectorcount: MutPtr, index: MutPtr): Boolean

public expect fun fsRtlLookupPerFileContext(perfilecontextpointer: ConstPtr, ownerid: ConstPtr, instanceid: ConstPtr): MutPtr

public expect fun fsRtlLookupPerFileObjectContext(fileobject: ConstPtr, ownerid: ConstPtr, instanceid: ConstPtr): MutPtr

public expect fun fsRtlLookupPerStreamContextInternal(streamcontext: ConstPtr, ownerid: ConstPtr, instanceid: ConstPtr): MutPtr

public expect fun fsRtlMdlReadCompleteDev(fileobject: ConstPtr, mdlchain: ConstPtr, deviceobject: ConstPtr): Boolean

public expect fun fsRtlMdlReadDev(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, lockkey: UInt, mdlchain: MutPtr, iostatus: MutPtr, deviceobject: ConstPtr): Boolean

public expect fun fsRtlMdlReadEx(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, lockkey: UInt, mdlchain: MutPtr, iostatus: MutPtr): Ntstatus

public expect fun fsRtlMdlWriteCompleteDev(fileobject: ConstPtr, fileoffset: ConstPtr, mdlchain: ConstPtr, deviceobject: ConstPtr): Boolean

public expect fun fsRtlMupGetProviderIdFromName(pprovidername: ConstPtr, pproviderid: MutPtr): Ntstatus

public expect fun fsRtlMupGetProviderInfoFromFileObject(pfileobject: ConstPtr, level: UInt, pbuffer: MutPtr, pbuffersize: MutPtr): Ntstatus

public expect fun fsRtlNormalizeNtstatus(exception: Ntstatus, genericexception: Ntstatus): Ntstatus

public expect fun fsRtlNotifyCleanup(notifysync: PnotifySync, notifylist: ConstPtr, fscontext: ConstPtr)

public expect fun fsRtlNotifyCleanupAll(notifysync: PnotifySync, notifylist: ConstPtr)

public expect fun fsRtlNotifyFilterChangeDirectory(notifysync: PnotifySync, notifylist: ConstPtr, fscontext: ConstPtr, fulldirectoryname: ConstPtr, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifyirp: ConstPtr, traversecallback: PcheckForTraverseAccess, subjectcontext: ConstPtr, filtercallback: PfilterReportChange)

public expect fun fsRtlNotifyFilterReportChange(notifysync: PnotifySync, notifylist: ConstPtr, fulltargetname: ConstPtr, targetnameoffset: UShort, streamname: ConstPtr, normalizedparentname: ConstPtr, filtermatch: UInt, action: UInt, targetcontext: ConstPtr, filtercontext: ConstPtr)

public expect fun fsRtlNotifyFullChangeDirectory(notifysync: PnotifySync, notifylist: ConstPtr, fscontext: ConstPtr, fulldirectoryname: MutPtr, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifyirp: ConstPtr, traversecallback: PcheckForTraverseAccess, subjectcontext: ConstPtr)

public expect fun fsRtlNotifyFullReportChange(notifysync: PnotifySync, notifylist: ConstPtr, fulltargetname: ConstPtr, targetnameoffset: UShort, streamname: ConstPtr, normalizedparentname: ConstPtr, filtermatch: UInt, action: UInt, targetcontext: ConstPtr)

public expect fun fsRtlNotifyInitializeSync(notifysync: MutPtr)

public expect fun fsRtlNotifyUninitializeSync(notifysync: MutPtr)

public expect fun fsRtlNotifyVolumeEvent(fileobject: ConstPtr, eventcode: UInt): Ntstatus

public expect fun fsRtlNotifyVolumeEventEx(fileobject: ConstPtr, eventcode: UInt, event: ConstPtr): Ntstatus

public expect fun fsRtlNumberOfRunsInBaseMcb(mcb: ConstPtr): UInt

public expect fun fsRtlNumberOfRunsInLargeMcb(mcb: ConstPtr): UInt

public expect fun fsRtlNumberOfRunsInMcb(mcb: ConstPtr): UInt

public expect fun fsRtlOplockBreakH(oplock: ConstPtr, irp: ConstPtr, flags: UInt, context: ConstPtr, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus

public expect fun fsRtlOplockBreakH2(oplock: ConstPtr, irp: ConstPtr, flags: UInt, context: ConstPtr, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp, grantedaccess: ConstPtr, shareaccess: ConstPtr): Ntstatus

public expect fun fsRtlOplockBreakToNone(oplock: MutPtr, irpsp: ConstPtr, irp: ConstPtr, context: ConstPtr, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus

public expect fun fsRtlOplockBreakToNoneEx(oplock: MutPtr, irp: ConstPtr, flags: UInt, context: ConstPtr, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus

public expect fun fsRtlOplockFsctrl(oplock: ConstPtr, irp: ConstPtr, opencount: UInt): Ntstatus

public expect fun fsRtlOplockFsctrlEx(oplock: ConstPtr, irp: ConstPtr, opencount: UInt, flags: UInt): Ntstatus

public expect fun fsRtlOplockGetAnyBreakOwnerProcess(oplock: ConstPtr): Peprocess

public expect fun fsRtlOplockIsFastIoPossible(oplock: ConstPtr): Boolean

public expect fun fsRtlOplockIsSharedRequest(irp: ConstPtr): Boolean

public expect fun fsRtlOplockKeysEqual(fo1: ConstPtr, fo2: ConstPtr): Boolean

public expect fun fsRtlPostPagingFileStackOverflow(context: ConstPtr, event: ConstPtr, stackoverflowroutine: PfsrtlStackOverflowRoutine)

public expect fun fsRtlPostStackOverflow(context: ConstPtr, event: ConstPtr, stackoverflowroutine: PfsrtlStackOverflowRoutine)

public expect fun fsRtlPrepareMdlWriteDev(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, lockkey: UInt, mdlchain: MutPtr, iostatus: MutPtr, deviceobject: ConstPtr): Boolean

public expect fun fsRtlPrepareMdlWriteEx(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, lockkey: UInt, mdlchain: MutPtr, iostatus: MutPtr): Ntstatus

public expect fun fsRtlPrepareToReuseEcp(ecpcontext: ConstPtr)

public expect fun fsRtlPrivateLock(filelock: ConstPtr, fileobject: ConstPtr, fileoffset: ConstPtr, length: ConstPtr, processid: Peprocess, key: UInt, failimmediately: Boolean, exclusivelock: Boolean, iosb: MutPtr, irp: ConstPtr, context: ConstPtr, alreadysynchronized: Boolean): Boolean

public expect fun fsRtlProcessFileLock(filelock: ConstPtr, irp: ConstPtr, context: ConstPtr): Ntstatus

public expect fun fsRtlQueryCachedVdl(fileobject: ConstPtr, vdl: MutPtr): Ntstatus

public expect fun fsRtlQueryInformationFile(fileobject: ConstPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass, retfileinformationsize: MutPtr): Ntstatus

public expect fun fsRtlQueryKernelEaFile(fileobject: ConstPtr, returnedeadata: MutPtr, length: UInt, returnsingleentry: Boolean, ealist: ConstPtr, ealistlength: UInt, eaindex: ConstPtr, restartscan: Boolean, lengthreturned: MutPtr): Ntstatus

public expect fun fsRtlQueryMaximumVirtualDiskNestingLevel(): UInt

public expect fun fsRtlRegisterFileSystemFilterCallbacks(filterdriverobject: ConstPtr, callbacks: ConstPtr): Ntstatus

public expect fun fsRtlRegisterUncProvider(muphandle: MutPtr, redirectordevicename: ConstPtr, mailslotssupported: Boolean): Ntstatus

public expect fun fsRtlRegisterUncProviderEx(muphandle: MutPtr, redirdevname: ConstPtr, deviceobject: ConstPtr, flags: UInt): Ntstatus

public expect fun fsRtlRegisterUncProviderEx2(redirdevname: ConstPtr, deviceobject: ConstPtr, registration: ConstPtr, muphandle: MutPtr): Ntstatus

public expect fun fsRtlReleaseFile(fileobject: ConstPtr)

public expect fun fsRtlRemoveBaseMcbEntry(mcb: MutPtr, vbn: Long, sectorcount: Long): Boolean

public expect fun fsRtlRemoveDotsFromPath(originalstring: Pwstr, pathlength: UShort, newlength: MutPtr): Ntstatus

public expect fun fsRtlRemoveExtraCreateParameter(ecplist: MutPtr, ecptype: ConstPtr, ecpcontext: MutPtr, ecpcontextsize: MutPtr): Ntstatus

public expect fun fsRtlRemoveLargeMcbEntry(mcb: MutPtr, vbn: Long, sectorcount: Long)

public expect fun fsRtlRemoveMcbEntry(mcb: MutPtr, vbn: UInt, sectorcount: UInt)

public expect fun fsRtlRemovePerFileContext(perfilecontextpointer: ConstPtr, ownerid: ConstPtr, instanceid: ConstPtr): MutPtr

public expect fun fsRtlRemovePerFileObjectContext(fileobject: ConstPtr, ownerid: ConstPtr, instanceid: ConstPtr): MutPtr

public expect fun fsRtlRemovePerStreamContext(streamcontext: ConstPtr, ownerid: ConstPtr, instanceid: ConstPtr): MutPtr

public expect fun fsRtlResetBaseMcb(mcb: MutPtr)

public expect fun fsRtlResetLargeMcb(mcb: MutPtr, selfsynchronized: Boolean)

public expect fun fsRtlSetDriverBacking(driverobj: ConstPtr, flags: UInt): Ntstatus

public expect fun fsRtlSetEcpListIntoIrp(irp: MutPtr, ecplist: ConstPtr): Ntstatus

public expect fun fsRtlSetKernelEaFile(fileobject: ConstPtr, eabuffer: ConstPtr, length: UInt): Ntstatus

public expect fun fsRtlSplitBaseMcb(mcb: MutPtr, vbn: Long, amount: Long): Boolean

public expect fun fsRtlSplitLargeMcb(mcb: MutPtr, vbn: Long, amount: Long): Boolean

public expect fun fsRtlTeardownPerFileContexts(perfilecontextpointer: ConstPtr)

public expect fun fsRtlTeardownPerStreamContexts(advancedheader: ConstPtr)

public expect fun fsRtlTruncateBaseMcb(mcb: MutPtr, vbn: Long)

public expect fun fsRtlTruncateLargeMcb(mcb: MutPtr, vbn: Long)

public expect fun fsRtlTruncateMcb(mcb: MutPtr, vbn: UInt)

public expect fun fsRtlUninitializeBaseMcb(mcb: ConstPtr)

public expect fun fsRtlUninitializeFileLock(filelock: MutPtr)

public expect fun fsRtlUninitializeLargeMcb(mcb: MutPtr)

public expect fun fsRtlUninitializeMcb(mcb: MutPtr)

public expect fun fsRtlUninitializeOplock(oplock: MutPtr)

public expect fun fsRtlUpdateDiskCounters(bytesread: ULong, byteswritten: ULong)

public expect fun fsRtlUpperOplockFsctrl(oplock: ConstPtr, irp: ConstPtr, opencount: UInt, loweroplockstate: UInt, flags: UInt): Ntstatus

public expect fun fsRtlValidateReparsePointBuffer(bufferlength: UInt, reparsebuffer: ConstPtr): Ntstatus

public expect fun fsRtlVolumeDeviceToCorrelationId(volumedeviceobject: ConstPtr, guid: MutPtr): Ntstatus

public expect fun getSecurityUserInfo(logonid: ConstPtr, flags: UInt, userinformation: MutPtr): Ntstatus

public expect fun ioAcquireVpbSpinLock(irql: MutPtr)

public expect fun ioApplyPriorityInfoThread(inputpriorityinfo: ConstPtr, outputpriorityinfo: MutPtr, thread: Pethread): Ntstatus

public expect fun ioCheckDesiredAccess(desiredaccess: MutPtr, grantedaccess: UInt): Ntstatus

public expect fun ioCheckEaBufferValidity(eabuffer: ConstPtr, ealength: UInt, erroroffset: MutPtr): Ntstatus

public expect fun ioCheckFunctionAccess(grantedaccess: UInt, majorfunction: UByte, minorfunction: UByte, iocontrolcode: UInt, arg1: ConstPtr, arg2: ConstPtr): Ntstatus

public expect fun ioCheckQuerySetFileInformation(fileinformationclass: FileInformationClass, length: UInt, setoperation: Boolean): Ntstatus

public expect fun ioCheckQuerySetVolumeInformation(fsinformationclass: FsInformationClass, length: UInt, setoperation: Boolean): Ntstatus

public expect fun ioCheckQuotaBufferValidity(quotabuffer: ConstPtr, quotalength: UInt, erroroffset: MutPtr): Ntstatus

public expect fun ioClearFsTrackOffsetState(irp: MutPtr): Ntstatus

public expect fun ioCreateStreamFileObject(fileobject: ConstPtr, deviceobject: ConstPtr): MutPtr

public expect fun ioCreateStreamFileObjectEx(fileobject: ConstPtr, deviceobject: ConstPtr, filehandle: MutPtr): MutPtr

public expect fun ioCreateStreamFileObjectEx2(createoptions: ConstPtr, fileobject: ConstPtr, deviceobject: ConstPtr, streamfileobject: MutPtr, filehandle: MutPtr): Ntstatus

public expect fun ioCreateStreamFileObjectLite(fileobject: ConstPtr, deviceobject: ConstPtr): MutPtr

public expect fun ioEnumerateDeviceObjectList(driverobject: ConstPtr, deviceobjectlist: MutPtr, deviceobjectlistsize: UInt, actualnumberdeviceobjects: MutPtr): Ntstatus

public expect fun ioEnumerateRegisteredFiltersList(driverobjectlist: MutPtr, driverobjectlistsize: UInt, actualnumberdriverobjects: MutPtr): Ntstatus

public expect fun ioFastQueryNetworkAttributes(objectattributes: ConstPtr, desiredaccess: UInt, openoptions: UInt, iostatus: MutPtr, buffer: MutPtr): Boolean

public expect fun ioGetAttachedDevice(deviceobject: ConstPtr): MutPtr

public expect fun ioGetBaseFileSystemDeviceObject(fileobject: ConstPtr): MutPtr

public expect fun ioGetDeviceAttachmentBaseRef(deviceobject: ConstPtr): MutPtr

public expect fun ioGetDeviceToVerify(thread: Pethread): MutPtr

public expect fun ioGetDiskDeviceObject(filesystemdeviceobject: ConstPtr, diskdeviceobject: MutPtr): Ntstatus

public expect fun ioGetFsTrackOffsetState(irp: ConstPtr, retfstrackoffsetblob: MutPtr, rettrackedoffset: MutPtr): Ntstatus

public expect fun ioGetLowerDeviceObject(deviceobject: ConstPtr): MutPtr

public expect fun ioGetOplockKeyContext(fileobject: ConstPtr): MutPtr

public expect fun ioGetOplockKeyContextEx(fileobject: ConstPtr): MutPtr

public expect fun ioGetRequestorProcess(irp: ConstPtr): Peprocess

public expect fun ioGetRequestorProcessId(irp: ConstPtr): UInt

public expect fun ioGetRequestorSessionId(irp: ConstPtr, psessionid: MutPtr): Ntstatus

public expect fun ioIrpHasFsTrackOffsetExtensionType(irp: ConstPtr): Boolean

public expect fun ioIsOperationSynchronous(irp: ConstPtr): Boolean

public expect fun ioIsSystemThread(thread: Pethread): Boolean

public expect fun ioIsValidNameGraftingBuffer(irp: ConstPtr, reparsebuffer: ConstPtr): Boolean

public expect fun ioPageRead(fileobject: ConstPtr, memorydescriptorlist: ConstPtr, startingoffset: ConstPtr, event: ConstPtr, iostatusblock: MutPtr): Ntstatus

public expect fun ioQueryFileDosDeviceName(fileobject: ConstPtr, objectnameinformation: MutPtr): Ntstatus

public expect fun ioQueryFileInformation(fileobject: ConstPtr, fileinformationclass: FileInformationClass, length: UInt, fileinformation: MutPtr, returnedlength: MutPtr): Ntstatus

public expect fun ioQueryVolumeInformation(fileobject: ConstPtr, fsinformationclass: FsInformationClass, length: UInt, fsinformation: MutPtr, returnedlength: MutPtr): Ntstatus

public expect fun ioQueueThreadIrp(irp: ConstPtr)

public expect fun ioRegisterFileSystem(deviceobject: ConstPtr)

public expect fun ioRegisterFsRegistrationChange(driverobject: ConstPtr, drivernotificationroutine: DriverFsNotification): Ntstatus

public expect fun ioRegisterFsRegistrationChangeMountAware(driverobject: ConstPtr, drivernotificationroutine: DriverFsNotification, synchronizewithmounts: Boolean): Ntstatus

public expect fun ioReleaseVpbSpinLock(irql: UByte)

public expect fun ioReplaceFileObjectName(fileobject: ConstPtr, newfilename: Pcwstr, filenamelength: UShort): Ntstatus

public expect fun ioRequestDeviceRemovalForReset(physicaldeviceobject: ConstPtr, flags: UInt): Ntstatus

public expect fun ioRetrievePriorityInfo(irp: ConstPtr, fileobject: ConstPtr, thread: Pethread, priorityinfo: MutPtr): Ntstatus

public expect fun ioSetDeviceToVerify(thread: Pethread, deviceobject: ConstPtr)

public expect fun ioSetFsTrackOffsetState(irp: MutPtr, fstrackoffsetblob: ConstPtr, trackedoffset: Long): Ntstatus

public expect fun ioSetInformation(fileobject: ConstPtr, fileinformationclass: FileInformationClass, length: UInt, fileinformation: ConstPtr): Ntstatus

public expect fun ioSynchronousPageWrite(fileobject: ConstPtr, memorydescriptorlist: ConstPtr, startingoffset: ConstPtr, event: ConstPtr, iostatusblock: MutPtr): Ntstatus

public expect fun ioThreadToProcess(thread: Pethread): Peprocess

public expect fun ioUnregisterFileSystem(deviceobject: ConstPtr)

public expect fun ioUnregisterFsRegistrationChange(driverobject: ConstPtr, drivernotificationroutine: DriverFsNotification)

public expect fun ioVerifyVolume(deviceobject: ConstPtr, allowrawmount: Boolean): Ntstatus

public expect fun keAcquireQueuedSpinLock(number: KspinLockQueueNumber): UByte

public expect fun keAcquireSpinLockRaiseToSynch(spinlock: MutPtr): UByte

public expect fun keAttachProcess(process: Prkprocess)

public expect fun keDetachProcess()

public expect fun keInitializeMutant(mutant: MutPtr, initialowner: Boolean)

public expect fun keInitializeQueue(queue: MutPtr, count: UInt)

public expect fun keInsertHeadQueue(queue: MutPtr, entry: MutPtr): Int

public expect fun keInsertQueue(queue: MutPtr, entry: MutPtr): Int

public expect fun keReadStateMutant(mutant: ConstPtr): Int

public expect fun keReadStateQueue(queue: ConstPtr): Int

public expect fun keReleaseMutant(mutant: MutPtr, increment: Int, abandoned: Boolean, wait: Boolean): Int

public expect fun keReleaseQueuedSpinLock(number: KspinLockQueueNumber, oldirql: UByte)

public expect fun keRemoveQueue(queue: MutPtr, waitmode: Byte, timeout: ConstPtr): MutPtr

public expect fun keRemoveQueueEx(queue: MutPtr, waitmode: Byte, alertable: Boolean, timeout: ConstPtr, entryarray: MutPtr, count: UInt): UInt

public expect fun keRundownQueue(queue: MutPtr): MutPtr

public expect fun keSetIdealProcessorThread(thread: Pkthread, processor: UByte): UByte

public expect fun keSetKernelStackSwapEnable(enable: Boolean): Boolean

public expect fun keStackAttachProcess(process: Prkprocess, apcstate: MutPtr)

public expect fun keTryToAcquireQueuedSpinLock(number: KspinLockQueueNumber, oldirql: MutPtr): UInt

public expect fun keUnstackDetachProcess(apcstate: ConstPtr)

public expect fun makeSignature(phcontext: ConstPtr, fqop: UInt, pmessage: ConstPtr, messageseqno: UInt): Hresult

public expect fun mapSecurityError(secstatus: Hresult): Ntstatus

public expect fun mmCanFileBeTruncated(sectionpointer: ConstPtr, newfilesize: ConstPtr): Boolean

public expect fun mmDoesFileHaveUserWritableReferences(sectionpointer: ConstPtr): UInt

public expect fun mmFlushImageSection(sectionobjectpointer: ConstPtr, flushtype: MmflushType): Boolean

public expect fun mmForceSectionClosed(sectionobjectpointer: ConstPtr, delayclose: Boolean): Boolean

public expect fun mmForceSectionClosedEx(sectionobjectpointer: ConstPtr, forcecloseflags: UInt): Boolean

public expect fun mmGetMaximumFileSectionSize(): ULong

public expect fun mmIsFileSectionActive(fssectionpointer: ConstPtr, flags: UInt, sectionisactive: MutPtr): Ntstatus

public expect fun mmIsRecursiveIoFault(): Boolean

public expect fun mmMdlPagesAreZero(mdl: ConstPtr): UInt

public expect fun mmPrefetchPages(numberoflists: UInt, readlists: ConstPtr): Ntstatus

public expect fun mmSetAddressRangeModified(address: ConstPtr, length: ULong): Boolean

public expect fun ntAccessCheckAndAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, objecttypename: ConstPtr, objectname: ConstPtr, securitydescriptor: PsecurityDescriptor, desiredaccess: UInt, genericmapping: ConstPtr, objectcreation: Boolean, grantedaccess: MutPtr, accessstatus: MutPtr, generateonclose: MutPtr): Ntstatus

public expect fun ntAccessCheckByTypeAndAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, objecttypename: ConstPtr, objectname: ConstPtr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: ConstPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Boolean, grantedaccess: MutPtr, accessstatus: MutPtr, generateonclose: MutPtr): Ntstatus

public expect fun ntAccessCheckByTypeResultListAndAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, objecttypename: ConstPtr, objectname: ConstPtr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: ConstPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Boolean, grantedaccess: MutPtr, accessstatus: MutPtr, generateonclose: MutPtr): Ntstatus

public expect fun ntAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname: ConstPtr, handleid: ConstPtr, clienttoken: Handle, objecttypename: ConstPtr, objectname: ConstPtr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: ConstPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Boolean, grantedaccess: MutPtr, accessstatus: MutPtr, generateonclose: MutPtr): Ntstatus

public expect fun ntAdjustGroupsToken(tokenhandle: Handle, resettodefault: Boolean, newstate: ConstPtr, bufferlength: UInt, previousstate: MutPtr, returnlength: MutPtr): Ntstatus

public expect fun ntAdjustPrivilegesToken(tokenhandle: Handle, disableallprivileges: Boolean, newstate: ConstPtr, bufferlength: UInt, previousstate: MutPtr, returnlength: MutPtr): Ntstatus

public expect fun ntAllocateVirtualMemory(processhandle: Handle, baseaddress: MutPtr, zerobits: ULong, regionsize: MutPtr, allocationtype: UInt, protect: UInt): Ntstatus

public expect fun ntAllocateVirtualMemoryEx(processhandle: Handle, baseaddress: MutPtr, regionsize: MutPtr, allocationtype: UInt, pageprotection: UInt, extendedparameters: MutPtr, extendedparametercount: UInt): Ntstatus

public expect fun ntCancelIoFileEx(filehandle: Handle, iorequesttocancel: ConstPtr, iostatusblock: MutPtr): Ntstatus

public expect fun ntCloseObjectAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, generateonclose: Boolean): Ntstatus

public expect fun ntCreateDirectoryObject(directoryhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus

public expect fun ntCreateEvent(eventhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, eventtype: EventType, initialstate: Boolean): Ntstatus

public expect fun ntCreateFile(filehandle: MutPtr, desiredaccess: FileAccessRights, objectattributes: ConstPtr, iostatusblock: MutPtr, allocationsize: ConstPtr, fileattributes: FileFlagsAndAttributes, shareaccess: FileShareMode, createdisposition: NtcreatefileCreateDisposition, createoptions: NtcreatefileCreateOptions, eabuffer: ConstPtr, ealength: UInt): Ntstatus

public expect fun ntCreateSection(sectionhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, maximumsize: ConstPtr, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Handle): Ntstatus

public expect fun ntCreateSectionEx(sectionhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, maximumsize: ConstPtr, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Handle, extendedparameters: MutPtr, extendedparametercount: UInt): Ntstatus

public expect fun ntDeleteFile(objectattributes: ConstPtr): Ntstatus

public expect fun ntDeleteObjectAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, generateonclose: Boolean): Ntstatus

public expect fun ntDuplicateObject(sourceprocesshandle: Handle, sourcehandle: Handle, targetprocesshandle: Handle, targethandle: MutPtr, desiredaccess: UInt, handleattributes: UInt, options: UInt): Ntstatus

public expect fun ntDuplicateToken(existingtokenhandle: Handle, desiredaccess: UInt, objectattributes: ConstPtr, effectiveonly: Boolean, tokentype: TokenType, newtokenhandle: MutPtr): Ntstatus

public expect fun ntFilterToken(existingtokenhandle: Handle, flags: UInt, sidstodisable: ConstPtr, privilegestodelete: ConstPtr, restrictedsids: ConstPtr, newtokenhandle: MutPtr): Ntstatus

public expect fun ntFlushBuffersFile(filehandle: Handle, iostatusblock: MutPtr): Ntstatus

public expect fun ntFlushBuffersFileEx(filehandle: Handle, flags: UInt, parameters: ConstPtr, parameterssize: UInt, iostatusblock: MutPtr): Ntstatus

public expect fun ntFlushVirtualMemory(processhandle: Handle, baseaddress: MutPtr, regionsize: MutPtr, iostatus: MutPtr): Ntstatus

public expect fun ntFreeVirtualMemory(processhandle: Handle, baseaddress: MutPtr, regionsize: MutPtr, freetype: UInt): Ntstatus

public expect fun ntFsControlFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, fscontrolcode: UInt, inputbuffer: ConstPtr, inputbufferlength: UInt, outputbuffer: MutPtr, outputbufferlength: UInt): Ntstatus

public expect fun ntImpersonateAnonymousToken(threadhandle: Handle): Ntstatus

public expect fun ntLockFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, byteoffset: ConstPtr, length: ConstPtr, key: UInt, failimmediately: Boolean, exclusivelock: Boolean): Ntstatus

public expect fun ntNotifyChangeKey(keyhandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, completionfilter: UInt, watchtree: Boolean, buffer: MutPtr, buffersize: UInt, asynchronous: Boolean): Ntstatus

public expect fun ntOpenDirectoryObject(directoryhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus

public expect fun ntOpenFile(filehandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, iostatusblock: MutPtr, shareaccess: UInt, openoptions: UInt): Ntstatus

public expect fun ntOpenObjectAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, objecttypename: ConstPtr, objectname: ConstPtr, securitydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, grantedaccess: UInt, privileges: ConstPtr, objectcreation: Boolean, accessgranted: Boolean, generateonclose: MutPtr): Ntstatus

public expect fun ntOpenProcessToken(processhandle: Handle, desiredaccess: UInt, tokenhandle: MutPtr): Ntstatus

public expect fun ntOpenProcessTokenEx(processhandle: Handle, desiredaccess: UInt, handleattributes: UInt, tokenhandle: MutPtr): Ntstatus

public expect fun ntOpenSymbolicLinkObject(linkhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus

public expect fun ntOpenThreadToken(threadhandle: Handle, desiredaccess: UInt, openasself: Boolean, tokenhandle: MutPtr): Ntstatus

public expect fun ntOpenThreadTokenEx(threadhandle: Handle, desiredaccess: UInt, openasself: Boolean, handleattributes: UInt, tokenhandle: MutPtr): Ntstatus

public expect fun ntPrivilegeCheck(clienttoken: Handle, requiredprivileges: MutPtr, result: MutPtr): Ntstatus

public expect fun ntPrivilegeObjectAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, clienttoken: Handle, desiredaccess: UInt, privileges: ConstPtr, accessgranted: Boolean): Ntstatus

public expect fun ntPrivilegedServiceAuditAlarm(subsystemname: ConstPtr, servicename: ConstPtr, clienttoken: Handle, privileges: ConstPtr, accessgranted: Boolean): Ntstatus

public expect fun ntQueryDirectoryFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass, returnsingleentry: Boolean, filename: ConstPtr, restartscan: Boolean): Ntstatus

public expect fun ntQueryDirectoryFileEx(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass, queryflags: UInt, filename: ConstPtr): Ntstatus

public expect fun ntQueryDirectoryObject(directoryhandle: Handle, buffer: MutPtr, length: UInt, returnsingleentry: Boolean, restartscan: Boolean, context: MutPtr, returnlength: MutPtr): Ntstatus

public expect fun ntQueryEaFile(filehandle: Handle, iostatusblock: MutPtr, buffer: MutPtr, length: UInt, returnsingleentry: Boolean, ealist: ConstPtr, ealistlength: UInt, eaindex: ConstPtr, restartscan: Boolean): Ntstatus

public expect fun ntQueryFullAttributesFile(objectattributes: ConstPtr, fileinformation: MutPtr): Ntstatus

public expect fun ntQueryInformationByName(objectattributes: ConstPtr, iostatusblock: MutPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass): Ntstatus

public expect fun ntQueryInformationFile(filehandle: Handle, iostatusblock: MutPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass): Ntstatus

public expect fun ntQueryInformationToken(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: MutPtr, tokeninformationlength: UInt, returnlength: MutPtr): Ntstatus

public expect fun ntQueryQuotaInformationFile(filehandle: Handle, iostatusblock: MutPtr, buffer: MutPtr, length: UInt, returnsingleentry: Boolean, sidlist: ConstPtr, sidlistlength: UInt, startsid: Psid, restartscan: Boolean): Ntstatus

public expect fun ntQuerySecurityObject(handle: Handle, securityinformation: UInt, securitydescriptor: PsecurityDescriptor, length: UInt, lengthneeded: MutPtr): Ntstatus

public expect fun ntQuerySymbolicLinkObject(linkhandle: Handle, linktarget: MutPtr, returnedlength: MutPtr): Ntstatus

public expect fun ntQueryVirtualMemory(processhandle: Handle, baseaddress: ConstPtr, memoryinformationclass: MemoryInformationClass, memoryinformation: MutPtr, memoryinformationlength: ULong, returnlength: MutPtr): Ntstatus

public expect fun ntQueryVolumeInformationFile(filehandle: Handle, iostatusblock: MutPtr, fsinformation: MutPtr, length: UInt, fsinformationclass: FsInformationClass): Ntstatus

public expect fun ntReadFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, buffer: MutPtr, length: UInt, byteoffset: ConstPtr, key: ConstPtr): Ntstatus

public expect fun ntSetEaFile(filehandle: Handle, iostatusblock: MutPtr, buffer: ConstPtr, length: UInt): Ntstatus

public expect fun ntSetEvent(eventhandle: Handle, previousstate: MutPtr): Ntstatus

public expect fun ntSetInformationFile(filehandle: Handle, iostatusblock: MutPtr, fileinformation: ConstPtr, length: UInt, fileinformationclass: FileInformationClass): Ntstatus

public expect fun ntSetInformationToken(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: ConstPtr, tokeninformationlength: UInt): Ntstatus

public expect fun ntSetInformationVirtualMemory(processhandle: Handle, vminformationclass: VirtualMemoryInformationClass, numberofentries: ULong, virtualaddresses: ConstPtr, vminformation: ConstPtr, vminformationlength: UInt): Ntstatus

public expect fun ntSetQuotaInformationFile(filehandle: Handle, iostatusblock: MutPtr, buffer: ConstPtr, length: UInt): Ntstatus

public expect fun ntSetSecurityObject(handle: Handle, securityinformation: UInt, securitydescriptor: PsecurityDescriptor): Ntstatus

public expect fun ntSetVolumeInformationFile(filehandle: Handle, iostatusblock: MutPtr, fsinformation: ConstPtr, length: UInt, fsinformationclass: FsInformationClass): Ntstatus

public expect fun ntUnlockFile(filehandle: Handle, iostatusblock: MutPtr, byteoffset: ConstPtr, length: ConstPtr, key: UInt): Ntstatus

public expect fun ntWriteFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, buffer: ConstPtr, length: UInt, byteoffset: ConstPtr, key: ConstPtr): Ntstatus

public expect fun obInsertObject(obj: ConstPtr, passedaccessstate: MutPtr, desiredaccess: UInt, objectpointerbias: UInt, newobject: MutPtr, handle: MutPtr): Ntstatus

public expect fun obIsKernelHandle(handle: Handle): Boolean

public expect fun obMakeTemporaryObject(obj: ConstPtr)

public expect fun obOpenObjectByPointer(obj: ConstPtr, handleattributes: UInt, passedaccessstate: ConstPtr, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, handle: MutPtr): Ntstatus

public expect fun obOpenObjectByPointerWithTag(obj: ConstPtr, handleattributes: UInt, passedaccessstate: ConstPtr, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, tag: UInt, handle: MutPtr): Ntstatus

public expect fun obQueryNameString(obj: ConstPtr, objectnameinfo: MutPtr, length: UInt, returnlength: MutPtr): Ntstatus

public expect fun obQueryObjectAuditingByHandle(handle: Handle, generateonclose: MutPtr): Ntstatus

public expect fun pfxFindPrefix(prefixtable: ConstPtr, fullname: ConstPtr): MutPtr

public expect fun pfxInitialize(prefixtable: MutPtr)

public expect fun pfxInsertPrefix(prefixtable: ConstPtr, prefix: ConstPtr, prefixtableentry: MutPtr): Boolean

public expect fun pfxRemovePrefix(prefixtable: ConstPtr, prefixtableentry: ConstPtr)

public expect fun poQueueShutdownWorkItem(workitem: MutPtr): Ntstatus

public expect fun psAssignImpersonationToken(thread: Pethread, token: Handle): Ntstatus

public expect fun psChargePoolQuota(process: Peprocess, pooltype: PoolType, amount: ULong)

public expect fun psChargeProcessPoolQuota(process: Peprocess, pooltype: PoolType, amount: ULong): Ntstatus

public expect fun psDereferenceImpersonationToken(impersonationtoken: ConstPtr)

public expect fun psDereferencePrimaryToken(primarytoken: ConstPtr)

public expect fun psDisableImpersonation(thread: Pethread, impersonationstate: MutPtr): Boolean

public expect fun psGetProcessExitTime(): Long

public expect fun psGetThreadProcess(thread: Pethread): Peprocess

public expect fun psImpersonateClient(thread: Pethread, token: ConstPtr, copyonopen: Boolean, effectiveonly: Boolean, impersonationlevel: SecurityImpersonationLevel): Ntstatus

public expect fun psIsDiskCountersEnabled(): Boolean

public expect fun psIsSystemThread(thread: Pethread): Boolean

public expect fun psIsThreadTerminating(thread: Pethread): Boolean

public expect fun psLookupProcessByProcessId(processid: Handle, process: MutPtr): Ntstatus

public expect fun psLookupThreadByThreadId(threadid: Handle, thread: MutPtr): Ntstatus

public expect fun psReferenceImpersonationToken(thread: Pethread, copyonopen: MutPtr, effectiveonly: MutPtr, impersonationlevel: MutPtr): MutPtr

public expect fun psReferencePrimaryToken(process: Peprocess): MutPtr

public expect fun psRestoreImpersonation(thread: Pethread, impersonationstate: ConstPtr)

public expect fun psReturnPoolQuota(process: Peprocess, pooltype: PoolType, amount: ULong)

public expect fun psRevertToSelf()

public expect fun psUpdateDiskCounters(process: Peprocess, bytesread: ULong, byteswritten: ULong, readoperationcount: UInt, writeoperationcount: UInt, flushoperationcount: UInt)

public expect fun querySecurityContextToken(phcontext: ConstPtr, token: MutPtr): Hresult

public expect fun rtlAbsoluteToSelfRelativeSD(absolutesecuritydescriptor: PsecurityDescriptor, selfrelativesecuritydescriptor: PsecurityDescriptor, bufferlength: MutPtr): Ntstatus

public expect fun rtlAddAccessAllowedAce(acl: MutPtr, acerevision: UInt, accessmask: UInt, sid: Psid): Ntstatus

public expect fun rtlAddAccessAllowedAceEx(acl: MutPtr, acerevision: UInt, aceflags: UInt, accessmask: UInt, sid: Psid): Ntstatus

public expect fun rtlAddAce(acl: MutPtr, acerevision: UInt, startingaceindex: UInt, acelist: ConstPtr, acelistlength: UInt): Ntstatus

public expect fun rtlAllocateAndInitializeSid(identifierauthority: ConstPtr, subauthoritycount: UByte, subauthority0: UInt, subauthority1: UInt, subauthority2: UInt, subauthority3: UInt, subauthority4: UInt, subauthority5: UInt, subauthority6: UInt, subauthority7: UInt, sid: MutPtr): Ntstatus

public expect fun rtlAllocateAndInitializeSidEx(identifierauthority: ConstPtr, subauthoritycount: UByte, subauthorities: ConstPtr, sid: MutPtr): Ntstatus

public expect fun rtlAllocateHeap(heaphandle: ConstPtr, flags: UInt, size: ULong): MutPtr

public expect fun rtlAppendStringToString(destination: MutPtr, source: ConstPtr): Ntstatus

public expect fun rtlCompareAltitudes(altitude1: ConstPtr, altitude2: ConstPtr): Int

public expect fun rtlCompareMemoryUlong(source: ConstPtr, length: ULong, pattern: UInt): ULong

public expect fun rtlCompressBuffer(compressionformatandengine: UShort, uncompressedbuffer: ConstPtr, uncompressedbuffersize: UInt, compressedbuffer: MutPtr, compressedbuffersize: UInt, uncompressedchunksize: UInt, finalcompressedsize: MutPtr, workspace: ConstPtr): Ntstatus

public expect fun rtlCompressChunks(uncompressedbuffer: ConstPtr, uncompressedbuffersize: UInt, compressedbuffer: MutPtr, compressedbuffersize: UInt, compresseddatainfo: MutPtr, compresseddatainfolength: UInt, workspace: ConstPtr): Ntstatus

public expect fun rtlCopyLuid(destinationluid: MutPtr, sourceluid: ConstPtr)

public expect fun rtlCopySid(destinationsidlength: UInt, destinationsid: Psid, sourcesid: Psid): Ntstatus

public expect fun rtlCreateAcl(acl: MutPtr, acllength: UInt, aclrevision: UInt): Ntstatus

public expect fun rtlCreateHeap(flags: UInt, heapbase: ConstPtr, reservesize: ULong, commitsize: ULong, lock: ConstPtr, parameters: ConstPtr): MutPtr

public expect fun rtlCreateServiceSid(servicename: ConstPtr, servicesid: Psid, servicesidlength: MutPtr): Ntstatus

public expect fun rtlCreateSystemVolumeInformationFolder(volumerootpath: ConstPtr): Ntstatus

public expect fun rtlCreateUnicodeString(destinationstring: MutPtr, sourcestring: Pcwstr): Boolean

public expect fun rtlCreateVirtualAccountSid(name: ConstPtr, basesubauthority: UInt, sid: Psid, sidlength: MutPtr): Ntstatus

public expect fun rtlCustomCPToUnicodeN(customcp: ConstPtr, unicodestring: Pwstr, maxbytesinunicodestring: UInt, bytesinunicodestring: MutPtr, customcpstring: Pcstr, bytesincustomcpstring: UInt): Ntstatus

public expect fun rtlDecompressBuffer(compressionformat: UShort, uncompressedbuffer: MutPtr, uncompressedbuffersize: UInt, compressedbuffer: ConstPtr, compressedbuffersize: UInt, finaluncompressedsize: MutPtr): Ntstatus

public expect fun rtlDecompressBufferEx(compressionformat: UShort, uncompressedbuffer: MutPtr, uncompressedbuffersize: UInt, compressedbuffer: ConstPtr, compressedbuffersize: UInt, finaluncompressedsize: MutPtr, workspace: ConstPtr): Ntstatus

public expect fun rtlDecompressBufferEx2(compressionformat: UShort, uncompressedbuffer: MutPtr, uncompressedbuffersize: UInt, compressedbuffer: ConstPtr, compressedbuffersize: UInt, uncompressedchunksize: UInt, finaluncompressedsize: MutPtr, workspace: ConstPtr): Ntstatus

public expect fun rtlDecompressChunks(uncompressedbuffer: MutPtr, uncompressedbuffersize: UInt, compressedbuffer: ConstPtr, compressedbuffersize: UInt, compressedtail: ConstPtr, compressedtailsize: UInt, compresseddatainfo: ConstPtr): Ntstatus

public expect fun rtlDecompressFragment(compressionformat: UShort, uncompressedfragment: MutPtr, uncompressedfragmentsize: UInt, compressedbuffer: ConstPtr, compressedbuffersize: UInt, fragmentoffset: UInt, finaluncompressedsize: MutPtr, workspace: ConstPtr): Ntstatus

public expect fun rtlDecompressFragmentEx(compressionformat: UShort, uncompressedfragment: MutPtr, uncompressedfragmentsize: UInt, compressedbuffer: ConstPtr, compressedbuffersize: UInt, fragmentoffset: UInt, uncompressedchunksize: UInt, finaluncompressedsize: MutPtr, workspace: ConstPtr): Ntstatus

public expect fun rtlDeleteAce(acl: MutPtr, aceindex: UInt): Ntstatus

public expect fun rtlDescribeChunk(compressionformat: UShort, compressedbuffer: MutPtr, endofcompressedbufferplus1: ConstPtr, chunkbuffer: MutPtr, chunksize: MutPtr): Ntstatus

public expect fun rtlDestroyHeap(heaphandle: ConstPtr): MutPtr

public expect fun rtlDosPathNameToNtPathNameUWithStatus(dosfilename: Pcwstr, ntfilename: MutPtr, filepart: MutPtr, reserved: ConstPtr): Ntstatus

public expect fun rtlDowncaseUnicodeString(destinationstring: MutPtr, sourcestring: ConstPtr, allocatedestinationstring: Boolean): Ntstatus

public expect fun rtlDuplicateUnicodeString(flags: UInt, stringin: ConstPtr, stringout: MutPtr): Ntstatus

public expect fun rtlEqualPrefixSid(sid1: Psid, sid2: Psid): Boolean

public expect fun rtlEqualSid(sid1: Psid, sid2: Psid): Boolean

public expect fun rtlFindUnicodePrefix(prefixtable: ConstPtr, fullname: ConstPtr, caseinsensitiveindex: UInt): MutPtr

public expect fun rtlFreeHeap(heaphandle: ConstPtr, flags: UInt, baseaddress: ConstPtr): UInt

public expect fun rtlFreeSid(sid: Psid): MutPtr

public expect fun rtlGenerate8dot3Name(name: ConstPtr, allowextendedcharacters: Boolean, context: MutPtr, name8dot3: MutPtr): Ntstatus

public expect fun rtlGetAce(acl: ConstPtr, aceindex: UInt, ace: MutPtr): Ntstatus

public expect fun rtlGetCompressionWorkSpaceSize(compressionformatandengine: UShort, compressbufferworkspacesize: MutPtr, compressfragmentworkspacesize: MutPtr): Ntstatus

public expect fun rtlGetDaclSecurityDescriptor(securitydescriptor: PsecurityDescriptor, daclpresent: MutPtr, dacl: MutPtr, dacldefaulted: MutPtr): Ntstatus

public expect fun rtlGetGroupSecurityDescriptor(securitydescriptor: PsecurityDescriptor, group: MutPtr, groupdefaulted: MutPtr): Ntstatus

public expect fun rtlGetOwnerSecurityDescriptor(securitydescriptor: PsecurityDescriptor, owner: MutPtr, ownerdefaulted: MutPtr): Ntstatus

public expect fun rtlGetSaclSecurityDescriptor(securitydescriptor: PsecurityDescriptor, saclpresent: MutPtr, sacl: MutPtr, sacldefaulted: MutPtr): Ntstatus

public expect fun rtlIdentifierAuthoritySid(sid: Psid): MutPtr

public expect fun rtlIdnToAscii(flags: UInt, sourcestring: Pcwstr, sourcestringlength: Int, destinationstring: Pwstr, destinationstringlength: MutPtr): Ntstatus

public expect fun rtlIdnToNameprepUnicode(flags: UInt, sourcestring: Pcwstr, sourcestringlength: Int, destinationstring: Pwstr, destinationstringlength: MutPtr): Ntstatus

public expect fun rtlIdnToUnicode(flags: UInt, sourcestring: Pcwstr, sourcestringlength: Int, destinationstring: Pwstr, destinationstringlength: MutPtr): Ntstatus

public expect fun rtlInitCodePageTable(tablebase: ConstPtr, codepagetable: MutPtr)

public expect fun rtlInitUnicodeStringEx(destinationstring: MutPtr, sourcestring: Pcwstr): Ntstatus

public expect fun rtlInitializeSid(sid: Psid, identifierauthority: ConstPtr, subauthoritycount: UByte): Ntstatus

public expect fun rtlInitializeSidEx(sid: Psid, identifierauthority: ConstPtr, subauthoritycount: UByte, vararg variadicArgs: Long): Ntstatus

public expect fun rtlInitializeUnicodePrefix(prefixtable: MutPtr)

public expect fun rtlInsertUnicodePrefix(prefixtable: ConstPtr, prefix: ConstPtr, prefixtableentry: MutPtr): Boolean

public expect fun rtlIsCloudFilesPlaceholder(fileattributes: UInt, reparsetag: UInt): Boolean

public expect fun rtlIsDosDeviceNameU(dosfilename: Pcwstr): UInt

public expect fun rtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag: UInt): Boolean

public expect fun rtlIsNormalizedString(normform: UInt, sourcestring: Pcwstr, sourcestringlength: Int, normalized: MutPtr): Ntstatus

public expect fun rtlIsPartialPlaceholder(fileattributes: UInt, reparsetag: UInt): Boolean

public expect fun rtlIsPartialPlaceholderFileHandle(filehandle: Handle, ispartialplaceholder: MutPtr): Ntstatus

public expect fun rtlIsPartialPlaceholderFileInfo(infobuffer: ConstPtr, infoclass: FileInformationClass, ispartialplaceholder: MutPtr): Ntstatus

public expect fun rtlIsSandboxedToken(context: ConstPtr, previousmode: Byte): Boolean

public expect fun rtlIsValidOemCharacter(char: Pwstr): Boolean

public expect fun rtlLengthRequiredSid(subauthoritycount: UInt): UInt

public expect fun rtlLengthSid(sid: Psid): UInt

public expect fun rtlMultiByteToUnicodeN(unicodestring: Pwstr, maxbytesinunicodestring: UInt, bytesinunicodestring: MutPtr, multibytestring: Pcstr, bytesinmultibytestring: UInt): Ntstatus

public expect fun rtlMultiByteToUnicodeSize(bytesinunicodestring: MutPtr, multibytestring: Pcstr, bytesinmultibytestring: UInt): Ntstatus

public expect fun rtlNextUnicodePrefix(prefixtable: ConstPtr, restart: Boolean): MutPtr

public expect fun rtlNormalizeString(normform: UInt, sourcestring: Pcwstr, sourcestringlength: Int, destinationstring: Pwstr, destinationstringlength: MutPtr): Ntstatus
