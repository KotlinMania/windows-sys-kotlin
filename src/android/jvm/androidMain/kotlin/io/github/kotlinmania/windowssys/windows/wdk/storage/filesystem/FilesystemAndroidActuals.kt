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

private object WindowsWdkStorageFilesystemJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_applyControlToken(phcontext: Long, pinput: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccAsyncCopyRead(fileobject: Long, fileoffset: Long, length: Int, wait: Boolean, buffer: Long, iostatus: Long, ioissuerthread: Long, asyncreadcontext: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccCanIWrite(fileobject: Long, bytestowrite: Int, wait: Boolean, retrying: Byte): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccCoherencyFlushAndPurgeCache(sectionobjectpointer: Long, fileoffset: Long, length: Int, iostatus: Long, flags: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccCopyRead(fileobject: Long, fileoffset: Long, length: Int, wait: Boolean, buffer: Long, iostatus: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccCopyReadEx(fileobject: Long, fileoffset: Long, length: Int, wait: Boolean, buffer: Long, iostatus: Long, ioissuerthread: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccCopyWrite(fileobject: Long, fileoffset: Long, length: Int, wait: Boolean, buffer: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccCopyWriteEx(fileobject: Long, fileoffset: Long, length: Int, wait: Boolean, buffer: Long, ioissuerthread: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccCopyWriteWontFlush(fileobject: Long, fileoffset: Long, length: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccDeferWrite(fileobject: Long, postroutine: Long, context1: Long, context2: Long, bytestowrite: Int, retrying: Boolean)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccErrorCallbackRoutine(context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccFastCopyRead(fileobject: Long, fileoffset: Int, length: Int, pagecount: Int, buffer: Long, iostatus: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccFastCopyWrite(fileobject: Long, fileoffset: Int, length: Int, buffer: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccFlushCache(sectionobjectpointer: Long, fileoffset: Long, length: Int, iostatus: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccGetDirtyPages(loghandle: Long, dirtypageroutine: Long, context1: Long, context2: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccGetFileObjectFromBcb(bcb: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccGetFileObjectFromSectionPtrs(sectionobjectpointer: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccGetFileObjectFromSectionPtrsRef(sectionobjectpointer: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccGetFlushedValidData(sectionobjectpointer: Long, bcblistheld: Boolean): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccInitializeCacheMap(fileobject: Long, filesizes: Long, pinaccess: Boolean, callbacks: Long, lazywritecontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccInitializeCacheMapEx(fileobject: Long, filesizes: Long, pinaccess: Boolean, callbacks: Long, lazywritecontext: Long, flags: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccIsCacheManagerCallbackNeeded(status: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccIsThereDirtyData(vpb: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccIsThereDirtyDataEx(vpb: Long, numberofdirtypages: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccMapData(fileobject: Long, fileoffset: Long, length: Int, flags: Int, bcb: Long, buffer: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccMdlRead(fileobject: Long, fileoffset: Long, length: Int, mdlchain: Long, iostatus: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccMdlReadComplete(fileobject: Long, mdlchain: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccMdlWriteAbort(fileobject: Long, mdlchain: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccMdlWriteComplete(fileobject: Long, fileoffset: Long, mdlchain: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccPinMappedData(fileobject: Long, fileoffset: Long, length: Int, flags: Int, bcb: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccPinRead(fileobject: Long, fileoffset: Long, length: Int, flags: Int, bcb: Long, buffer: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccPrepareMdlWrite(fileobject: Long, fileoffset: Long, length: Int, mdlchain: Long, iostatus: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccPreparePinWrite(fileobject: Long, fileoffset: Long, length: Int, zero: Boolean, flags: Int, bcb: Long, buffer: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccPurgeCacheSection(sectionobjectpointer: Long, fileoffset: Long, length: Int, flags: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccRemapBcb(bcb: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccRepinBcb(bcb: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccScheduleReadAhead(fileobject: Long, fileoffset: Long, length: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccScheduleReadAheadEx(fileobject: Long, fileoffset: Long, length: Int, ioissuerthread: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccSetAdditionalCacheAttributes(fileobject: Long, disablereadahead: Boolean, disablewritebehind: Boolean)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccSetAdditionalCacheAttributesEx(fileobject: Long, flags: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccSetBcbOwnerPointer(bcb: Long, ownerpointer: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccSetDirtyPageThreshold(fileobject: Long, dirtypagethreshold: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccSetDirtyPinnedData(bcbvoid: Long, lsn: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccSetFileSizes(fileobject: Long, filesizes: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccSetFileSizesEx(fileobject: Long, filesizes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccSetLogHandleForFile(fileobject: Long, loghandle: Long, flushtolsnroutine: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccSetParallelFlushFile(fileobject: Long, enableparallelflush: Boolean)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccSetReadAheadGranularity(fileobject: Long, granularity: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccUninitializeCacheMap(fileobject: Long, truncatesize: Long, uninitializeevent: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccUnpinData(bcb: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccUnpinDataForThread(bcb: Long, resourcethreadid: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccUnpinRepinnedBcb(bcb: Long, writethrough: Boolean, iostatus: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccWaitForCurrentLazyWriterActivity(): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ccZeroData(fileobject: Long, startoffset: Long, endoffset: Long, wait: Boolean): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_completeAuthToken(phcontext: Long, ptoken: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_exDisableResourceBoostLite(resource: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_exQueryPoolBlockSize(poolblock: Long, quotacharged: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_exportSecurityContext(phcontext: Long, fflags: Int, ppackedcontext: Long, ptoken: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlAcknowledgeEcp(ecpcontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlAcquireFileExclusive(fileobject: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlAddBaseMcbEntry(mcb: Long, vbn: Long, lbn: Long, sectorcount: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlAddBaseMcbEntryEx(mcb: Long, vbn: Long, lbn: Long, sectorcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlAddLargeMcbEntry(mcb: Long, vbn: Long, lbn: Long, sectorcount: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlAddMcbEntry(mcb: Long, vbn: Int, lbn: Int, sectorcount: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlAddToTunnelCache(cache: Long, directorykey: Long, shortname: Long, longname: Long, keybyshortname: Boolean, datalength: Int, data: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlAddToTunnelCacheEx(cache: Long, directorykey: Long, shortname: Long, longname: Long, flags: Int, datalength: Int, data: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlAllocateAePushLock(pooltype: Int, tag: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlAllocateExtraCreateParameter(ecptype: Long, sizeofcontext: Int, flags: Int, cleanupcallback: Long, pooltag: Int, ecpcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlAllocateExtraCreateParameterFromLookasideList(ecptype: Long, sizeofcontext: Int, flags: Int, cleanupcallback: Long, lookasidelist: Long, ecpcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlAllocateExtraCreateParameterList(flags: Int, ecplist: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlAllocateFileLock(completelockirproutine: Long, unlockroutine: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlAllocateResource(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlAreNamesEqual(constantnamea: Long, constantnameb: Long, ignorecase: Boolean, upcasetable: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlAreThereCurrentOrInProgressFileLocks(filelock: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlAreThereWaitingFileLocks(filelock: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlAreVolumeStartupApplicationsComplete(): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlBalanceReads(targetdevice: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlCancellableWaitForMultipleObjects(count: Int, objectarray: Long, waittype: Int, timeout: Long, waitblockarray: Long, irp: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlCancellableWaitForSingleObject(obj: Long, timeout: Long, irp: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlChangeBackingFileObject(currentfileobject: Long, newfileobject: Long, changebackingtype: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlCheckLockForOplockRequest(filelock: Long, allocationsize: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlCheckLockForReadAccess(filelock: Long, irp: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlCheckLockForWriteAccess(filelock: Long, irp: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlCheckOplock(oplock: Long, irp: Long, context: Long, completionroutine: Long, postirproutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlCheckOplockEx(oplock: Long, irp: Long, flags: Int, context: Long, completionroutine: Long, postirproutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlCheckOplockEx2(oplock: Long, irp: Long, flags: Int, flagsex2: Int, completionroutinecontext: Long, completionroutine: Long, postirproutine: Long, timeout: Long, notifycontext: Long, notifyroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlCheckUpperOplock(oplock: Long, newloweroplockstate: Int, completionroutinecontext: Long, completionroutine: Long, prependroutine: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlCopyRead(fileobject: Long, fileoffset: Long, length: Int, wait: Boolean, lockkey: Int, buffer: Long, iostatus: Long, deviceobject: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlCopyWrite(fileobject: Long, fileoffset: Long, length: Int, wait: Boolean, lockkey: Int, buffer: Long, iostatus: Long, deviceobject: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlCreateSectionForDataScan(sectionhandle: Long, sectionobject: Long, sectionfilesize: Long, fileobject: Long, desiredaccess: Int, objectattributes: Long, maximumsize: Long, sectionpageprotection: Int, allocationattributes: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlCurrentBatchOplock(oplock: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlCurrentOplock(oplock: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlCurrentOplockH(oplock: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlDeleteExtraCreateParameterLookasideList(lookaside: Long, flags: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlDeleteKeyFromTunnelCache(cache: Long, directorykey: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlDeleteTunnelCache(cache: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlDeregisterUncProvider(handle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlDismountComplete(deviceobject: Long, dismountstatus: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlDoesDbcsContainWildCards(name: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlDoesNameContainWildCards(name: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlFastCheckLockForRead(filelock: Long, startingbyte: Long, length: Long, key: Int, fileobject: Long, processid: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlFastCheckLockForWrite(filelock: Long, startingbyte: Long, length: Long, key: Int, fileobject: Long, processid: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlFastUnlockAll(filelock: Long, fileobject: Long, processid: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlFastUnlockAllByKey(filelock: Long, fileobject: Long, processid: Long, key: Int, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlFastUnlockSingle(filelock: Long, fileobject: Long, fileoffset: Long, length: Long, processid: Long, key: Int, context: Long, alreadysynchronized: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlFindExtraCreateParameter(ecplist: Long, ecptype: Long, ecpcontext: Long, ecpcontextsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlFindInTunnelCache(cache: Long, directorykey: Long, name: Long, shortname: Long, longname: Long, datalength: Long, data: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlFindInTunnelCacheEx(cache: Long, directorykey: Long, name: Long, shortname: Long, longname: Long, flags: Int, datalength: Long, data: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlFreeAePushLock(aepushlock: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlFreeExtraCreateParameter(ecpcontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlFreeExtraCreateParameterList(ecplist: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlFreeFileLock(filelock: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlGetCurrentProcessLoaderList(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlGetEcpListFromIrp(irp: Long, ecplist: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlGetFileSize(fileobject: Long, filesize: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlGetNextBaseMcbEntry(mcb: Long, runindex: Int, vbn: Long, lbn: Long, sectorcount: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlGetNextExtraCreateParameter(ecplist: Long, currentecpcontext: Long, nextecptype: Long, nextecpcontext: Long, nextecpcontextsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlGetNextFileLock(filelock: Long, restart: Boolean): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlGetNextLargeMcbEntry(mcb: Long, runindex: Int, vbn: Long, lbn: Long, sectorcount: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlGetNextMcbEntry(mcb: Long, runindex: Int, vbn: Long, lbn: Long, sectorcount: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlGetSectorSizeInformation(deviceobject: Long, sectorsizeinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlGetSupportedFeatures(deviceobject: Long, supportedfeatures: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlGetVirtualDiskNestingLevel(deviceobject: Long, nestinglevel: Long, nestingflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlIncrementCcFastMdlReadWait()

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlIncrementCcFastReadNoWait()

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlIncrementCcFastReadNotPossible()

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlIncrementCcFastReadResourceMiss()

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlIncrementCcFastReadWait()

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlInitExtraCreateParameterLookasideList(lookaside: Long, flags: Int, size: Long, tag: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlInitializeBaseMcb(mcb: Long, pooltype: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlInitializeBaseMcbEx(mcb: Long, pooltype: Int, flags: Short): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlInitializeExtraCreateParameter(ecp: Long, ecpflags: Int, cleanupcallback: Long, totalsize: Int, ecptype: Long, listallocatedfrom: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlInitializeExtraCreateParameterList(ecplist: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlInitializeFileLock(filelock: Long, completelockirproutine: Long, unlockroutine: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlInitializeLargeMcb(mcb: Long, pooltype: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlInitializeMcb(mcb: Long, pooltype: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlInitializeOplock(oplock: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlInitializeTunnelCache(cache: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlInsertExtraCreateParameter(ecplist: Long, ecpcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlInsertPerFileContext(perfilecontextpointer: Long, ptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlInsertPerFileObjectContext(fileobject: Long, ptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlInsertPerStreamContext(perstreamcontext: Long, ptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlIs32BitProcess(process: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlIsDaxVolume(fileobject: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlIsDbcsInExpression(expression: Long, name: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlIsEcpAcknowledged(ecpcontext: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlIsEcpFromUserMode(ecpcontext: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlIsExtentDangling(startpage: Int, numberofpages: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlIsMobileOS(): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlIsNameInExpression(expression: Long, name: Long, ignorecase: Boolean, upcasetable: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlIsNameInUnUpcasedExpression(expression: Long, name: Long, ignorecase: Boolean, upcasetable: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlIsNtstatusExpected(exception: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlIsPagingFile(fileobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlIsSystemPagingFile(fileobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlIssueDeviceIoControl(deviceobject: Long, ioctl: Int, flags: Byte, inputbuffer: Long, inputbufferlength: Int, outputbuffer: Long, outputbufferlength: Int, iosbinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlKernelFsControlFile(fileobject: Long, fscontrolcode: Int, inputbuffer: Long, inputbufferlength: Int, outputbuffer: Long, outputbufferlength: Int, retoutputbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlLogCcFlushError(filename: Long, deviceobject: Long, sectionobjectpointer: Long, flusherror: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlLookupBaseMcbEntry(mcb: Long, vbn: Long, lbn: Long, sectorcountfromlbn: Long, startinglbn: Long, sectorcountfromstartinglbn: Long, index: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlLookupLargeMcbEntry(mcb: Long, vbn: Long, lbn: Long, sectorcountfromlbn: Long, startinglbn: Long, sectorcountfromstartinglbn: Long, index: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlLookupLastBaseMcbEntry(mcb: Long, vbn: Long, lbn: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlLookupLastBaseMcbEntryAndIndex(opaquemcb: Long, largevbn: Long, largelbn: Long, index: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlLookupLastLargeMcbEntry(mcb: Long, vbn: Long, lbn: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlLookupLastLargeMcbEntryAndIndex(opaquemcb: Long, largevbn: Long, largelbn: Long, index: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlLookupLastMcbEntry(mcb: Long, vbn: Long, lbn: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlLookupMcbEntry(mcb: Long, vbn: Int, lbn: Long, sectorcount: Long, index: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlLookupPerFileContext(perfilecontextpointer: Long, ownerid: Long, instanceid: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlLookupPerFileObjectContext(fileobject: Long, ownerid: Long, instanceid: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlLookupPerStreamContextInternal(streamcontext: Long, ownerid: Long, instanceid: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlMdlReadCompleteDev(fileobject: Long, mdlchain: Long, deviceobject: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlMdlReadDev(fileobject: Long, fileoffset: Long, length: Int, lockkey: Int, mdlchain: Long, iostatus: Long, deviceobject: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlMdlReadEx(fileobject: Long, fileoffset: Long, length: Int, lockkey: Int, mdlchain: Long, iostatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlMdlWriteCompleteDev(fileobject: Long, fileoffset: Long, mdlchain: Long, deviceobject: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlMupGetProviderIdFromName(pprovidername: Long, pproviderid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlMupGetProviderInfoFromFileObject(pfileobject: Long, level: Int, pbuffer: Long, pbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlNormalizeNtstatus(exception: Int, genericexception: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlNotifyCleanup(notifysync: Long, notifylist: Long, fscontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlNotifyCleanupAll(notifysync: Long, notifylist: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlNotifyFilterChangeDirectory(notifysync: Long, notifylist: Long, fscontext: Long, fulldirectoryname: Long, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: Int, notifyirp: Long, traversecallback: Long, subjectcontext: Long, filtercallback: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlNotifyFilterReportChange(notifysync: Long, notifylist: Long, fulltargetname: Long, targetnameoffset: Short, streamname: Long, normalizedparentname: Long, filtermatch: Int, action: Int, targetcontext: Long, filtercontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlNotifyFullChangeDirectory(notifysync: Long, notifylist: Long, fscontext: Long, fulldirectoryname: Long, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: Int, notifyirp: Long, traversecallback: Long, subjectcontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlNotifyFullReportChange(notifysync: Long, notifylist: Long, fulltargetname: Long, targetnameoffset: Short, streamname: Long, normalizedparentname: Long, filtermatch: Int, action: Int, targetcontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlNotifyInitializeSync(notifysync: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlNotifyUninitializeSync(notifysync: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlNotifyVolumeEvent(fileobject: Long, eventcode: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlNotifyVolumeEventEx(fileobject: Long, eventcode: Int, event: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlNumberOfRunsInBaseMcb(mcb: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlNumberOfRunsInLargeMcb(mcb: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlNumberOfRunsInMcb(mcb: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlOplockBreakH(oplock: Long, irp: Long, flags: Int, context: Long, completionroutine: Long, postirproutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlOplockBreakH2(oplock: Long, irp: Long, flags: Int, context: Long, completionroutine: Long, postirproutine: Long, grantedaccess: Long, shareaccess: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlOplockBreakToNone(oplock: Long, irpsp: Long, irp: Long, context: Long, completionroutine: Long, postirproutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlOplockBreakToNoneEx(oplock: Long, irp: Long, flags: Int, context: Long, completionroutine: Long, postirproutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlOplockFsctrl(oplock: Long, irp: Long, opencount: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlOplockFsctrlEx(oplock: Long, irp: Long, opencount: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlOplockGetAnyBreakOwnerProcess(oplock: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlOplockIsFastIoPossible(oplock: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlOplockIsSharedRequest(irp: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlOplockKeysEqual(fo1: Long, fo2: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlPostPagingFileStackOverflow(context: Long, event: Long, stackoverflowroutine: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlPostStackOverflow(context: Long, event: Long, stackoverflowroutine: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlPrepareMdlWriteDev(fileobject: Long, fileoffset: Long, length: Int, lockkey: Int, mdlchain: Long, iostatus: Long, deviceobject: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlPrepareMdlWriteEx(fileobject: Long, fileoffset: Long, length: Int, lockkey: Int, mdlchain: Long, iostatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlPrepareToReuseEcp(ecpcontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlPrivateLock(filelock: Long, fileobject: Long, fileoffset: Long, length: Long, processid: Long, key: Int, failimmediately: Boolean, exclusivelock: Boolean, iosb: Long, irp: Long, context: Long, alreadysynchronized: Boolean): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlProcessFileLock(filelock: Long, irp: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlQueryCachedVdl(fileobject: Long, vdl: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlQueryInformationFile(fileobject: Long, fileinformation: Long, length: Int, fileinformationclass: Int, retfileinformationsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlQueryKernelEaFile(fileobject: Long, returnedeadata: Long, length: Int, returnsingleentry: Boolean, ealist: Long, ealistlength: Int, eaindex: Long, restartscan: Boolean, lengthreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlQueryMaximumVirtualDiskNestingLevel(): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlRegisterFileSystemFilterCallbacks(filterdriverobject: Long, callbacks: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlRegisterUncProvider(muphandle: Long, redirectordevicename: Long, mailslotssupported: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlRegisterUncProviderEx(muphandle: Long, redirdevname: Long, deviceobject: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlRegisterUncProviderEx2(redirdevname: Long, deviceobject: Long, registration: Long, muphandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlReleaseFile(fileobject: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlRemoveBaseMcbEntry(mcb: Long, vbn: Long, sectorcount: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlRemoveDotsFromPath(originalstring: Long, pathlength: Short, newlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlRemoveExtraCreateParameter(ecplist: Long, ecptype: Long, ecpcontext: Long, ecpcontextsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlRemoveLargeMcbEntry(mcb: Long, vbn: Long, sectorcount: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlRemoveMcbEntry(mcb: Long, vbn: Int, sectorcount: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlRemovePerFileContext(perfilecontextpointer: Long, ownerid: Long, instanceid: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlRemovePerFileObjectContext(fileobject: Long, ownerid: Long, instanceid: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlRemovePerStreamContext(streamcontext: Long, ownerid: Long, instanceid: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlResetBaseMcb(mcb: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlResetLargeMcb(mcb: Long, selfsynchronized: Boolean)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlSetDriverBacking(driverobj: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlSetEcpListIntoIrp(irp: Long, ecplist: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlSetKernelEaFile(fileobject: Long, eabuffer: Long, length: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlSplitBaseMcb(mcb: Long, vbn: Long, amount: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlSplitLargeMcb(mcb: Long, vbn: Long, amount: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlTeardownPerFileContexts(perfilecontextpointer: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlTeardownPerStreamContexts(advancedheader: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlTruncateBaseMcb(mcb: Long, vbn: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlTruncateLargeMcb(mcb: Long, vbn: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlTruncateMcb(mcb: Long, vbn: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlUninitializeBaseMcb(mcb: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlUninitializeFileLock(filelock: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlUninitializeLargeMcb(mcb: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlUninitializeMcb(mcb: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlUninitializeOplock(oplock: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlUpdateDiskCounters(bytesread: Long, byteswritten: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlUpperOplockFsctrl(oplock: Long, irp: Long, opencount: Int, loweroplockstate: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlValidateReparsePointBuffer(bufferlength: Int, reparsebuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_fsRtlVolumeDeviceToCorrelationId(volumedeviceobject: Long, guid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_getSecurityUserInfo(logonid: Long, flags: Int, userinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioAcquireVpbSpinLock(irql: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioApplyPriorityInfoThread(inputpriorityinfo: Long, outputpriorityinfo: Long, thread: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioCheckDesiredAccess(desiredaccess: Long, grantedaccess: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioCheckEaBufferValidity(eabuffer: Long, ealength: Int, erroroffset: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioCheckFunctionAccess(grantedaccess: Int, majorfunction: Byte, minorfunction: Byte, iocontrolcode: Int, arg1: Long, arg2: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioCheckQuerySetFileInformation(fileinformationclass: Int, length: Int, setoperation: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioCheckQuerySetVolumeInformation(fsinformationclass: Int, length: Int, setoperation: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioCheckQuotaBufferValidity(quotabuffer: Long, quotalength: Int, erroroffset: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioClearFsTrackOffsetState(irp: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioCreateStreamFileObject(fileobject: Long, deviceobject: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioCreateStreamFileObjectEx(fileobject: Long, deviceobject: Long, filehandle: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioCreateStreamFileObjectEx2(createoptions: Long, fileobject: Long, deviceobject: Long, streamfileobject: Long, filehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioCreateStreamFileObjectLite(fileobject: Long, deviceobject: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioEnumerateDeviceObjectList(driverobject: Long, deviceobjectlist: Long, deviceobjectlistsize: Int, actualnumberdeviceobjects: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioEnumerateRegisteredFiltersList(driverobjectlist: Long, driverobjectlistsize: Int, actualnumberdriverobjects: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioFastQueryNetworkAttributes(objectattributes: Long, desiredaccess: Int, openoptions: Int, iostatus: Long, buffer: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioGetAttachedDevice(deviceobject: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioGetBaseFileSystemDeviceObject(fileobject: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioGetDeviceAttachmentBaseRef(deviceobject: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioGetDeviceToVerify(thread: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioGetDiskDeviceObject(filesystemdeviceobject: Long, diskdeviceobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioGetFsTrackOffsetState(irp: Long, retfstrackoffsetblob: Long, rettrackedoffset: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioGetLowerDeviceObject(deviceobject: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioGetOplockKeyContext(fileobject: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioGetOplockKeyContextEx(fileobject: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioGetRequestorProcess(irp: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioGetRequestorProcessId(irp: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioGetRequestorSessionId(irp: Long, psessionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioIrpHasFsTrackOffsetExtensionType(irp: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioIsOperationSynchronous(irp: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioIsSystemThread(thread: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioIsValidNameGraftingBuffer(irp: Long, reparsebuffer: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioPageRead(fileobject: Long, memorydescriptorlist: Long, startingoffset: Long, event: Long, iostatusblock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioQueryFileDosDeviceName(fileobject: Long, objectnameinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioQueryFileInformation(fileobject: Long, fileinformationclass: Int, length: Int, fileinformation: Long, returnedlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioQueryVolumeInformation(fileobject: Long, fsinformationclass: Int, length: Int, fsinformation: Long, returnedlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioQueueThreadIrp(irp: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioRegisterFileSystem(deviceobject: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioReleaseVpbSpinLock(irql: Byte)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioReplaceFileObjectName(fileobject: Long, newfilename: Long, filenamelength: Short): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioRequestDeviceRemovalForReset(physicaldeviceobject: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioRetrievePriorityInfo(irp: Long, fileobject: Long, thread: Long, priorityinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioSetDeviceToVerify(thread: Long, deviceobject: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioSetFsTrackOffsetState(irp: Long, fstrackoffsetblob: Long, trackedoffset: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioSetInformation(fileobject: Long, fileinformationclass: Int, length: Int, fileinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioSynchronousPageWrite(fileobject: Long, memorydescriptorlist: Long, startingoffset: Long, event: Long, iostatusblock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioThreadToProcess(thread: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioUnregisterFileSystem(deviceobject: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ioVerifyVolume(deviceobject: Long, allowrawmount: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_keAcquireQueuedSpinLock(number: Int): Byte

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_keAcquireSpinLockRaiseToSynch(spinlock: Long): Byte

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_keAttachProcess(process: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_keDetachProcess()

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_keInitializeMutant(mutant: Long, initialowner: Boolean)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_keInitializeQueue(queue: Long, count: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_keInsertHeadQueue(queue: Long, entry: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_keInsertQueue(queue: Long, entry: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_keReadStateMutant(mutant: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_keReadStateQueue(queue: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_keReleaseMutant(mutant: Long, increment: Int, abandoned: Boolean, wait: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_keReleaseQueuedSpinLock(number: Int, oldirql: Byte)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_keRemoveQueue(queue: Long, waitmode: Byte, timeout: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_keRemoveQueueEx(queue: Long, waitmode: Byte, alertable: Boolean, timeout: Long, entryarray: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_keRundownQueue(queue: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_keSetIdealProcessorThread(thread: Long, processor: Byte): Byte

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_keSetKernelStackSwapEnable(enable: Boolean): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_keStackAttachProcess(process: Long, apcstate: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_keTryToAcquireQueuedSpinLock(number: Int, oldirql: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_keUnstackDetachProcess(apcstate: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_makeSignature(phcontext: Long, fqop: Int, pmessage: Long, messageseqno: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_mapSecurityError(secstatus: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_mmCanFileBeTruncated(sectionpointer: Long, newfilesize: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_mmDoesFileHaveUserWritableReferences(sectionpointer: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_mmFlushImageSection(sectionobjectpointer: Long, flushtype: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_mmForceSectionClosed(sectionobjectpointer: Long, delayclose: Boolean): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_mmForceSectionClosedEx(sectionobjectpointer: Long, forcecloseflags: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_mmGetMaximumFileSectionSize(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_mmIsFileSectionActive(fssectionpointer: Long, flags: Int, sectionisactive: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_mmIsRecursiveIoFault(): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_mmMdlPagesAreZero(mdl: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_mmPrefetchPages(numberoflists: Int, readlists: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_mmSetAddressRangeModified(address: Long, length: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntAccessCheckAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, desiredaccess: Int, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntAccessCheckByTypeAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, principalselfsid: Long, desiredaccess: Int, audittype: Int, flags: Int, objecttypelist: Long, objecttypelistlength: Int, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntAccessCheckByTypeResultListAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, principalselfsid: Long, desiredaccess: Int, audittype: Int, flags: Int, objecttypelist: Long, objecttypelistlength: Int, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname: Long, handleid: Long, clienttoken: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, principalselfsid: Long, desiredaccess: Int, audittype: Int, flags: Int, objecttypelist: Long, objecttypelistlength: Int, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntAdjustGroupsToken(tokenhandle: Long, resettodefault: Boolean, newstate: Long, bufferlength: Int, previousstate: Long, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntAdjustPrivilegesToken(tokenhandle: Long, disableallprivileges: Boolean, newstate: Long, bufferlength: Int, previousstate: Long, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntAllocateVirtualMemory(processhandle: Long, baseaddress: Long, zerobits: Long, regionsize: Long, allocationtype: Int, protect: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntAllocateVirtualMemoryEx(processhandle: Long, baseaddress: Long, regionsize: Long, allocationtype: Int, pageprotection: Int, extendedparameters: Long, extendedparametercount: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntCancelIoFileEx(filehandle: Long, iorequesttocancel: Long, iostatusblock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntCloseObjectAuditAlarm(subsystemname: Long, handleid: Long, generateonclose: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntCreateDirectoryObject(directoryhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntCreateEvent(eventhandle: Long, desiredaccess: Int, objectattributes: Long, eventtype: Int, initialstate: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntCreateFile(filehandle: Long, desiredaccess: Int, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: Int, shareaccess: Int, createdisposition: Int, createoptions: Int, eabuffer: Long, ealength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntCreateSection(sectionhandle: Long, desiredaccess: Int, objectattributes: Long, maximumsize: Long, sectionpageprotection: Int, allocationattributes: Int, filehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntCreateSectionEx(sectionhandle: Long, desiredaccess: Int, objectattributes: Long, maximumsize: Long, sectionpageprotection: Int, allocationattributes: Int, filehandle: Long, extendedparameters: Long, extendedparametercount: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntDeleteFile(objectattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntDeleteObjectAuditAlarm(subsystemname: Long, handleid: Long, generateonclose: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntDuplicateObject(sourceprocesshandle: Long, sourcehandle: Long, targetprocesshandle: Long, targethandle: Long, desiredaccess: Int, handleattributes: Int, options: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntDuplicateToken(existingtokenhandle: Long, desiredaccess: Int, objectattributes: Long, effectiveonly: Boolean, tokentype: Int, newtokenhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntFilterToken(existingtokenhandle: Long, flags: Int, sidstodisable: Long, privilegestodelete: Long, restrictedsids: Long, newtokenhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntFlushBuffersFile(filehandle: Long, iostatusblock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntFlushBuffersFileEx(filehandle: Long, flags: Int, parameters: Long, parameterssize: Int, iostatusblock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntFlushVirtualMemory(processhandle: Long, baseaddress: Long, regionsize: Long, iostatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntFreeVirtualMemory(processhandle: Long, baseaddress: Long, regionsize: Long, freetype: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntFsControlFile(filehandle: Long, event: Long, apcroutine: Long, apccontext: Long, iostatusblock: Long, fscontrolcode: Int, inputbuffer: Long, inputbufferlength: Int, outputbuffer: Long, outputbufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntImpersonateAnonymousToken(threadhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntLockFile(filehandle: Long, event: Long, apcroutine: Long, apccontext: Long, iostatusblock: Long, byteoffset: Long, length: Long, key: Int, failimmediately: Boolean, exclusivelock: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntNotifyChangeKey(keyhandle: Long, event: Long, apcroutine: Long, apccontext: Long, iostatusblock: Long, completionfilter: Int, watchtree: Boolean, buffer: Long, buffersize: Int, asynchronous: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntOpenDirectoryObject(directoryhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntOpenFile(filehandle: Long, desiredaccess: Int, objectattributes: Long, iostatusblock: Long, shareaccess: Int, openoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntOpenObjectAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, clienttoken: Long, desiredaccess: Int, grantedaccess: Int, privileges: Long, objectcreation: Boolean, accessgranted: Boolean, generateonclose: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntOpenProcessToken(processhandle: Long, desiredaccess: Int, tokenhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntOpenProcessTokenEx(processhandle: Long, desiredaccess: Int, handleattributes: Int, tokenhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntOpenSymbolicLinkObject(linkhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntOpenThreadToken(threadhandle: Long, desiredaccess: Int, openasself: Boolean, tokenhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntOpenThreadTokenEx(threadhandle: Long, desiredaccess: Int, openasself: Boolean, handleattributes: Int, tokenhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntPrivilegeCheck(clienttoken: Long, requiredprivileges: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntPrivilegeObjectAuditAlarm(subsystemname: Long, handleid: Long, clienttoken: Long, desiredaccess: Int, privileges: Long, accessgranted: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntPrivilegedServiceAuditAlarm(subsystemname: Long, servicename: Long, clienttoken: Long, privileges: Long, accessgranted: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntQueryDirectoryFile(filehandle: Long, event: Long, apcroutine: Long, apccontext: Long, iostatusblock: Long, fileinformation: Long, length: Int, fileinformationclass: Int, returnsingleentry: Boolean, filename: Long, restartscan: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntQueryDirectoryFileEx(filehandle: Long, event: Long, apcroutine: Long, apccontext: Long, iostatusblock: Long, fileinformation: Long, length: Int, fileinformationclass: Int, queryflags: Int, filename: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntQueryDirectoryObject(directoryhandle: Long, buffer: Long, length: Int, returnsingleentry: Boolean, restartscan: Boolean, context: Long, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntQueryEaFile(filehandle: Long, iostatusblock: Long, buffer: Long, length: Int, returnsingleentry: Boolean, ealist: Long, ealistlength: Int, eaindex: Long, restartscan: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntQueryFullAttributesFile(objectattributes: Long, fileinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntQueryInformationByName(objectattributes: Long, iostatusblock: Long, fileinformation: Long, length: Int, fileinformationclass: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntQueryInformationFile(filehandle: Long, iostatusblock: Long, fileinformation: Long, length: Int, fileinformationclass: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntQueryInformationToken(tokenhandle: Long, tokeninformationclass: Int, tokeninformation: Long, tokeninformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntQueryQuotaInformationFile(filehandle: Long, iostatusblock: Long, buffer: Long, length: Int, returnsingleentry: Boolean, sidlist: Long, sidlistlength: Int, startsid: Long, restartscan: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntQuerySecurityObject(handle: Long, securityinformation: Int, securitydescriptor: Long, length: Int, lengthneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntQuerySymbolicLinkObject(linkhandle: Long, linktarget: Long, returnedlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntQueryVirtualMemory(processhandle: Long, baseaddress: Long, memoryinformationclass: Int, memoryinformation: Long, memoryinformationlength: Long, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntQueryVolumeInformationFile(filehandle: Long, iostatusblock: Long, fsinformation: Long, length: Int, fsinformationclass: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntReadFile(filehandle: Long, event: Long, apcroutine: Long, apccontext: Long, iostatusblock: Long, buffer: Long, length: Int, byteoffset: Long, key: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntSetEaFile(filehandle: Long, iostatusblock: Long, buffer: Long, length: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntSetEvent(eventhandle: Long, previousstate: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntSetInformationFile(filehandle: Long, iostatusblock: Long, fileinformation: Long, length: Int, fileinformationclass: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntSetInformationToken(tokenhandle: Long, tokeninformationclass: Int, tokeninformation: Long, tokeninformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntSetInformationVirtualMemory(processhandle: Long, vminformationclass: Int, numberofentries: Long, virtualaddresses: Long, vminformation: Long, vminformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntSetQuotaInformationFile(filehandle: Long, iostatusblock: Long, buffer: Long, length: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntSetSecurityObject(handle: Long, securityinformation: Int, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntSetVolumeInformationFile(filehandle: Long, iostatusblock: Long, fsinformation: Long, length: Int, fsinformationclass: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntUnlockFile(filehandle: Long, iostatusblock: Long, byteoffset: Long, length: Long, key: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ntWriteFile(filehandle: Long, event: Long, apcroutine: Long, apccontext: Long, iostatusblock: Long, buffer: Long, length: Int, byteoffset: Long, key: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_obInsertObject(obj: Long, passedaccessstate: Long, desiredaccess: Int, objectpointerbias: Int, newobject: Long, handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_obIsKernelHandle(handle: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_obMakeTemporaryObject(obj: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_obOpenObjectByPointer(obj: Long, handleattributes: Int, passedaccessstate: Long, desiredaccess: Int, objecttype: Long, accessmode: Byte, handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_obOpenObjectByPointerWithTag(obj: Long, handleattributes: Int, passedaccessstate: Long, desiredaccess: Int, objecttype: Long, accessmode: Byte, tag: Int, handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_obQueryNameString(obj: Long, objectnameinfo: Long, length: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_obQueryObjectAuditingByHandle(handle: Long, generateonclose: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_pfxFindPrefix(prefixtable: Long, fullname: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_pfxInitialize(prefixtable: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_pfxInsertPrefix(prefixtable: Long, prefix: Long, prefixtableentry: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_pfxRemovePrefix(prefixtable: Long, prefixtableentry: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_poQueueShutdownWorkItem(workitem: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_psAssignImpersonationToken(thread: Long, token: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_psChargePoolQuota(process: Long, pooltype: Int, amount: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_psChargeProcessPoolQuota(process: Long, pooltype: Int, amount: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_psDereferenceImpersonationToken(impersonationtoken: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_psDereferencePrimaryToken(primarytoken: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_psDisableImpersonation(thread: Long, impersonationstate: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_psGetProcessExitTime(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_psGetThreadProcess(thread: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_psImpersonateClient(thread: Long, token: Long, copyonopen: Boolean, effectiveonly: Boolean, impersonationlevel: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_psIsDiskCountersEnabled(): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_psIsSystemThread(thread: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_psIsThreadTerminating(thread: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_psLookupProcessByProcessId(processid: Long, process: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_psLookupThreadByThreadId(threadid: Long, thread: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_psReferenceImpersonationToken(thread: Long, copyonopen: Long, effectiveonly: Long, impersonationlevel: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_psReferencePrimaryToken(process: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_psRestoreImpersonation(thread: Long, impersonationstate: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_psReturnPoolQuota(process: Long, pooltype: Int, amount: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_psRevertToSelf()

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_psUpdateDiskCounters(process: Long, bytesread: Long, byteswritten: Long, readoperationcount: Int, writeoperationcount: Int, flushoperationcount: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_querySecurityContextToken(phcontext: Long, token: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlAbsoluteToSelfRelativeSD(absolutesecuritydescriptor: Long, selfrelativesecuritydescriptor: Long, bufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlAddAccessAllowedAce(acl: Long, acerevision: Int, accessmask: Int, sid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlAddAccessAllowedAceEx(acl: Long, acerevision: Int, aceflags: Int, accessmask: Int, sid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlAddAce(acl: Long, acerevision: Int, startingaceindex: Int, acelist: Long, acelistlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlAllocateAndInitializeSid(identifierauthority: Long, subauthoritycount: Byte, subauthority0: Int, subauthority1: Int, subauthority2: Int, subauthority3: Int, subauthority4: Int, subauthority5: Int, subauthority6: Int, subauthority7: Int, sid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlAllocateAndInitializeSidEx(identifierauthority: Long, subauthoritycount: Byte, subauthorities: Long, sid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlAllocateHeap(heaphandle: Long, flags: Int, size: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlAppendStringToString(destination: Long, source: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlCompareAltitudes(altitude1: Long, altitude2: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlCompareMemoryUlong(source: Long, length: Long, pattern: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlCompressBuffer(compressionformatandengine: Short, uncompressedbuffer: Long, uncompressedbuffersize: Int, compressedbuffer: Long, compressedbuffersize: Int, uncompressedchunksize: Int, finalcompressedsize: Long, workspace: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlCompressChunks(uncompressedbuffer: Long, uncompressedbuffersize: Int, compressedbuffer: Long, compressedbuffersize: Int, compresseddatainfo: Long, compresseddatainfolength: Int, workspace: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlCopyLuid(destinationluid: Long, sourceluid: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlCopySid(destinationsidlength: Int, destinationsid: Long, sourcesid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlCreateAcl(acl: Long, acllength: Int, aclrevision: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlCreateHeap(flags: Int, heapbase: Long, reservesize: Long, commitsize: Long, lock: Long, parameters: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlCreateServiceSid(servicename: Long, servicesid: Long, servicesidlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlCreateSystemVolumeInformationFolder(volumerootpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlCreateUnicodeString(destinationstring: Long, sourcestring: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlCreateVirtualAccountSid(name: Long, basesubauthority: Int, sid: Long, sidlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlCustomCPToUnicodeN(customcp: Long, unicodestring: Long, maxbytesinunicodestring: Int, bytesinunicodestring: Long, customcpstring: Long, bytesincustomcpstring: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlDecompressBuffer(compressionformat: Short, uncompressedbuffer: Long, uncompressedbuffersize: Int, compressedbuffer: Long, compressedbuffersize: Int, finaluncompressedsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlDecompressBufferEx(compressionformat: Short, uncompressedbuffer: Long, uncompressedbuffersize: Int, compressedbuffer: Long, compressedbuffersize: Int, finaluncompressedsize: Long, workspace: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlDecompressBufferEx2(compressionformat: Short, uncompressedbuffer: Long, uncompressedbuffersize: Int, compressedbuffer: Long, compressedbuffersize: Int, uncompressedchunksize: Int, finaluncompressedsize: Long, workspace: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlDecompressChunks(uncompressedbuffer: Long, uncompressedbuffersize: Int, compressedbuffer: Long, compressedbuffersize: Int, compressedtail: Long, compressedtailsize: Int, compresseddatainfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlDecompressFragment(compressionformat: Short, uncompressedfragment: Long, uncompressedfragmentsize: Int, compressedbuffer: Long, compressedbuffersize: Int, fragmentoffset: Int, finaluncompressedsize: Long, workspace: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlDecompressFragmentEx(compressionformat: Short, uncompressedfragment: Long, uncompressedfragmentsize: Int, compressedbuffer: Long, compressedbuffersize: Int, fragmentoffset: Int, uncompressedchunksize: Int, finaluncompressedsize: Long, workspace: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlDeleteAce(acl: Long, aceindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlDescribeChunk(compressionformat: Short, compressedbuffer: Long, endofcompressedbufferplus1: Long, chunkbuffer: Long, chunksize: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlDestroyHeap(heaphandle: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlDosPathNameToNtPathNameUWithStatus(dosfilename: Long, ntfilename: Long, filepart: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlDowncaseUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlDuplicateUnicodeString(flags: Int, stringin: Long, stringout: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlEqualPrefixSid(sid1: Long, sid2: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlEqualSid(sid1: Long, sid2: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlFindUnicodePrefix(prefixtable: Long, fullname: Long, caseinsensitiveindex: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlFreeHeap(heaphandle: Long, flags: Int, baseaddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlFreeSid(sid: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlGenerate8dot3Name(name: Long, allowextendedcharacters: Boolean, context: Long, name8dot3: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlGetAce(acl: Long, aceindex: Int, ace: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlGetCompressionWorkSpaceSize(compressionformatandengine: Short, compressbufferworkspacesize: Long, compressfragmentworkspacesize: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlGetDaclSecurityDescriptor(securitydescriptor: Long, daclpresent: Long, dacl: Long, dacldefaulted: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlGetGroupSecurityDescriptor(securitydescriptor: Long, group: Long, groupdefaulted: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlGetOwnerSecurityDescriptor(securitydescriptor: Long, owner: Long, ownerdefaulted: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlGetSaclSecurityDescriptor(securitydescriptor: Long, saclpresent: Long, sacl: Long, sacldefaulted: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlIdentifierAuthoritySid(sid: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlIdnToAscii(flags: Int, sourcestring: Long, sourcestringlength: Int, destinationstring: Long, destinationstringlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlIdnToNameprepUnicode(flags: Int, sourcestring: Long, sourcestringlength: Int, destinationstring: Long, destinationstringlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlIdnToUnicode(flags: Int, sourcestring: Long, sourcestringlength: Int, destinationstring: Long, destinationstringlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlInitCodePageTable(tablebase: Long, codepagetable: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlInitUnicodeStringEx(destinationstring: Long, sourcestring: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlInitializeSid(sid: Long, identifierauthority: Long, subauthoritycount: Byte): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlInitializeSidEx(sid: Long, identifierauthority: Long, subauthoritycount: Byte, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlInitializeUnicodePrefix(prefixtable: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlInsertUnicodePrefix(prefixtable: Long, prefix: Long, prefixtableentry: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlIsCloudFilesPlaceholder(fileattributes: Int, reparsetag: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlIsDosDeviceNameU(dosfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlIsNormalizedString(normform: Int, sourcestring: Long, sourcestringlength: Int, normalized: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlIsPartialPlaceholder(fileattributes: Int, reparsetag: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlIsPartialPlaceholderFileHandle(filehandle: Long, ispartialplaceholder: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlIsPartialPlaceholderFileInfo(infobuffer: Long, infoclass: Int, ispartialplaceholder: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlIsSandboxedToken(context: Long, previousmode: Byte): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlIsValidOemCharacter(char: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlLengthRequiredSid(subauthoritycount: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlLengthSid(sid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlMultiByteToUnicodeN(unicodestring: Long, maxbytesinunicodestring: Int, bytesinunicodestring: Long, multibytestring: Long, bytesinmultibytestring: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlMultiByteToUnicodeSize(bytesinunicodestring: Long, multibytestring: Long, bytesinmultibytestring: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlNextUnicodePrefix(prefixtable: Long, restart: Boolean): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlNormalizeString(normform: Int, sourcestring: Long, sourcestringlength: Int, destinationstring: Long, destinationstringlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlNtStatusToDosErrorNoTeb(status: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlOemStringToCountedUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlOemStringToUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlOemToUnicodeN(unicodestring: Long, maxbytesinunicodestring: Int, bytesinunicodestring: Long, oemstring: Long, bytesinoemstring: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlPrefixString(string1: Long, string2: Long, caseinsensitive: Boolean): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlQueryPackageIdentity(tokenobject: Long, packagefullname: Long, packagesize: Long, appid: Long, appidsize: Long, packaged: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlQueryPackageIdentityEx(tokenobject: Long, packagefullname: Long, packagesize: Long, appid: Long, appidsize: Long, dynamicid: Long, flags: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlQueryProcessPlaceholderCompatibilityMode(): Byte

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlQueryThreadPlaceholderCompatibilityMode(): Byte

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlRandom(seed: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlRandomEx(seed: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlRemoveUnicodePrefix(prefixtable: Long, prefixtableentry: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlReplaceSidInSd(securitydescriptor: Long, oldsid: Long, newsid: Long, numchanges: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlReserveChunk(compressionformat: Short, compressedbuffer: Long, endofcompressedbufferplus1: Long, chunkbuffer: Long, chunksize: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlSecondsSince1970ToTime(elapsedseconds: Int, time: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlSecondsSince1980ToTime(elapsedseconds: Int, time: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlSelfRelativeToAbsoluteSD(selfrelativesecuritydescriptor: Long, absolutesecuritydescriptor: Long, absolutesecuritydescriptorsize: Long, dacl: Long, daclsize: Long, sacl: Long, saclsize: Long, owner: Long, ownersize: Long, primarygroup: Long, primarygroupsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlSetGroupSecurityDescriptor(securitydescriptor: Long, group: Long, groupdefaulted: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlSetOwnerSecurityDescriptor(securitydescriptor: Long, owner: Long, ownerdefaulted: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlSetProcessPlaceholderCompatibilityMode(mode: Byte): Byte

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlSetThreadPlaceholderCompatibilityMode(mode: Byte): Byte

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlSubAuthorityCountSid(sid: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlSubAuthoritySid(sid: Long, subauthority: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlTimeToSecondsSince1980(time: Long, elapsedseconds: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlUnicodeStringToCountedOemString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlUnicodeToCustomCPN(customcp: Long, customcpstring: Long, maxbytesincustomcpstring: Int, bytesincustomcpstring: Long, unicodestring: Long, bytesinunicodestring: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlUnicodeToMultiByteN(multibytestring: Long, maxbytesinmultibytestring: Int, bytesinmultibytestring: Long, unicodestring: Long, bytesinunicodestring: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlUnicodeToOemN(oemstring: Long, maxbytesinoemstring: Int, bytesinoemstring: Long, unicodestring: Long, bytesinunicodestring: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlUpcaseUnicodeStringToCountedOemString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlUpcaseUnicodeStringToOemString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlUpcaseUnicodeToCustomCPN(customcp: Long, customcpstring: Long, maxbytesincustomcpstring: Int, bytesincustomcpstring: Long, unicodestring: Long, bytesinunicodestring: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlUpcaseUnicodeToMultiByteN(multibytestring: Long, maxbytesinmultibytestring: Int, bytesinmultibytestring: Long, unicodestring: Long, bytesinunicodestring: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlUpcaseUnicodeToOemN(oemstring: Long, maxbytesinoemstring: Int, bytesinoemstring: Long, unicodestring: Long, bytesinunicodestring: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlValidSid(sid: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlValidateUnicodeString(flags: Int, string: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlxOemStringToUnicodeSize(oemstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_rtlxUnicodeStringToOemSize(unicodestring: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seAccessCheckFromState(securitydescriptor: Long, primarytokeninformation: Long, clienttokeninformation: Long, desiredaccess: Int, previouslygrantedaccess: Int, privileges: Long, genericmapping: Long, accessmode: Byte, grantedaccess: Long, accessstatus: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seAccessCheckFromStateEx(securitydescriptor: Long, primarytoken: Long, clienttoken: Long, desiredaccess: Int, previouslygrantedaccess: Int, privileges: Long, genericmapping: Long, accessmode: Byte, grantedaccess: Long, accessstatus: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seAdjustAccessStateForAccessConstraints(objecttype: Long, securitydescriptor: Long, accessstate: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seAdjustAccessStateForTrustLabel(objecttype: Long, securitydescriptor: Long, accessstate: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seAdjustObjectSecurity(objectname: Long, originaldescriptor: Long, proposeddescriptor: Long, subjectsecuritycontext: Long, adjusteddescriptor: Long, applyadjusteddescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seAppendPrivileges(accessstate: Long, privileges: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seAuditFipsCryptoSelftests(bsuccess: Boolean, selftestcode: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seAuditHardLinkCreation(filename: Long, linkname: Long, bsuccess: Boolean)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seAuditHardLinkCreationWithTransaction(filename: Long, linkname: Long, bsuccess: Boolean, transactionid: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seAuditTransactionStateChange(transactionid: Long, resourcemanagerid: Long, newtransactionstate: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seAuditingAnyFileEventsWithContext(securitydescriptor: Long, subjectsecuritycontext: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seAuditingAnyFileEventsWithContextEx(securitydescriptor: Long, subjectsecuritycontext: Long, stagingenabled: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seAuditingFileEvents(accessgranted: Boolean, securitydescriptor: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seAuditingFileEventsWithContext(accessgranted: Boolean, securitydescriptor: Long, subjectsecuritycontext: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seAuditingFileEventsWithContextEx(accessgranted: Boolean, securitydescriptor: Long, subjectsecuritycontext: Long, stagingenabled: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seAuditingFileOrGlobalEvents(accessgranted: Boolean, securitydescriptor: Long, subjectsecuritycontext: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seAuditingHardLinkEvents(accessgranted: Boolean, securitydescriptor: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seAuditingHardLinkEventsWithContext(accessgranted: Boolean, securitydescriptor: Long, subjectsecuritycontext: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seCaptureSubjectContextEx(thread: Long, process: Long, subjectcontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seCheckForCriticalAceRemoval(currentdescriptor: Long, newdescriptor: Long, subjectsecuritycontext: Long, aceremoved: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seCreateClientSecurity(clientthread: Long, clientsecurityqos: Long, remotesession: Boolean, clientcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seCreateClientSecurityFromSubjectContext(subjectcontext: Long, clientsecurityqos: Long, serverisremote: Boolean, clientcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seDeleteClientSecurity(clientcontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seDeleteObjectAuditAlarm(obj: Long, handle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seDeleteObjectAuditAlarmWithTransaction(obj: Long, handle: Long, transactionid: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seExamineSacl(sacl: Long, resourcesacl: Long, token: Long, desiredaccess: Int, accessgranted: Boolean, generateaudit: Long, generatealarm: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seFilterToken(existingtoken: Long, flags: Int, sidstodisable: Long, privilegestodelete: Long, restrictedsids: Long, filteredtoken: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seFreePrivileges(privileges: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seImpersonateClient(clientcontext: Long, serverthread: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seImpersonateClientEx(clientcontext: Long, serverthread: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seLocateProcessImageName(process: Long, pimagefilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seMarkLogonSessionForTerminationNotification(logonid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seMarkLogonSessionForTerminationNotificationEx(logonid: Long, pserversilo: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seOpenObjectAuditAlarm(objecttypename: Long, obj: Long, absoluteobjectname: Long, securitydescriptor: Long, accessstate: Long, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, generateonclose: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seOpenObjectAuditAlarmWithTransaction(objecttypename: Long, obj: Long, absoluteobjectname: Long, securitydescriptor: Long, accessstate: Long, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, transactionid: Long, generateonclose: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seOpenObjectForDeleteAuditAlarm(objecttypename: Long, obj: Long, absoluteobjectname: Long, securitydescriptor: Long, accessstate: Long, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, generateonclose: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seOpenObjectForDeleteAuditAlarmWithTransaction(objecttypename: Long, obj: Long, absoluteobjectname: Long, securitydescriptor: Long, accessstate: Long, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, transactionid: Long, generateonclose: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_sePrivilegeCheck(requiredprivileges: Long, subjectsecuritycontext: Long, accessmode: Byte): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seQueryAuthenticationIdToken(token: Long, authenticationid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seQueryInformationToken(token: Long, tokeninformationclass: Int, tokeninformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seQuerySecurityDescriptorInfo(securityinformation: Long, securitydescriptor: Long, length: Long, objectssecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seQueryServerSiloToken(token: Long, pserversilo: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seQuerySessionIdToken(token: Long, sessionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seQuerySessionIdTokenEx(token: Long, sessionid: Long, isservicesession: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seRegisterLogonSessionTerminatedRoutine(callbackroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seRegisterLogonSessionTerminatedRoutineEx(callbackroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seReportSecurityEventWithSubCategory(flags: Int, sourcename: Long, usersid: Long, auditparameters: Long, auditsubcategoryid: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seSetAccessStateGenericMapping(accessstate: Long, genericmapping: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seSetSecurityDescriptorInfo(obj: Long, securityinformation: Long, modificationdescriptor: Long, objectssecuritydescriptor: Long, pooltype: Int, genericmapping: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seSetSecurityDescriptorInfoEx(obj: Long, securityinformation: Long, modificationdescriptor: Long, objectssecuritydescriptor: Long, autoinheritflags: Int, pooltype: Int, genericmapping: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seShouldCheckForAccessRightsFromParent(objecttype: Long, childdescriptor: Long, accessstate: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seTokenFromAccessInformation(accessinformation: Long, token: Long, length: Int, requiredlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seTokenIsAdmin(token: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seTokenIsRestricted(token: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seTokenIsWriteRestricted(token: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seTokenType(token: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seUnregisterLogonSessionTerminatedRoutine(callbackroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_seUnregisterLogonSessionTerminatedRoutineEx(callbackroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_secLookupAccountName(name: Long, sidsize: Long, sid: Long, nameuse: Long, domainsize: Long, referenceddomain: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_secLookupAccountSid(sid: Long, namesize: Long, namebuffer: Long, domainsize: Long, domainbuffer: Long, nameuse: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_secLookupWellKnownSid(sidtype: Int, sid: Long, sidbuffersize: Int, sidsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_secMakeSPN(serviceclass: Long, servicename: Long, instancename: Long, instanceport: Short, referrer: Long, spn: Long, length: Long, allocate: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_secMakeSPNEx(serviceclass: Long, servicename: Long, instancename: Long, instanceport: Short, referrer: Long, targetinfo: Long, spn: Long, length: Long, allocate: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_secMakeSPNEx2(serviceclass: Long, servicename: Long, instancename: Long, instanceport: Short, referrer: Long, intargetinfo: Long, spn: Long, totalsize: Long, allocate: Boolean, istargetinfomarshaled: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_setContextAttributesW(phcontext: Long, ulattribute: Int, pbuffer: Long, cbbuffer: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_sspiAcceptSecurityContextAsync(asynccontext: Long, phcredential: Long, phcontext: Long, pinput: Long, fcontextreq: Int, targetdatarep: Int, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_sspiCreateAsyncContext(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_sspiDeleteSecurityContextAsync(asynccontext: Long, phcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_sspiFreeAsyncContext(handle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_sspiFreeCredentialsHandleAsync(asynccontext: Long, phcredential: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_sspiGetAsyncCallStatus(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_sspiInitializeSecurityContextAsyncA(asynccontext: Long, phcredential: Long, phcontext: Long, psztargetname: Long, fcontextreq: Int, reserved1: Int, targetdatarep: Int, pinput: Long, reserved2: Int, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_sspiInitializeSecurityContextAsyncW(asynccontext: Long, phcredential: Long, phcontext: Long, psztargetname: Long, fcontextreq: Int, reserved1: Int, targetdatarep: Int, pinput: Long, reserved2: Int, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_sspiReinitAsyncContext(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_sspiSetAsyncNotifyCallback(context: Long, callback: Long, callbackdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_verifySignature(phcontext: Long, pmessage: Long, messageseqno: Int, pfqop: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwAccessCheckAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, desiredaccess: Int, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwAccessCheckByTypeAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, principalselfsid: Long, desiredaccess: Int, audittype: Int, flags: Int, objecttypelist: Long, objecttypelistlength: Int, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwAccessCheckByTypeResultListAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, principalselfsid: Long, desiredaccess: Int, audittype: Int, flags: Int, objecttypelist: Long, objecttypelistlength: Int, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname: Long, handleid: Long, clienttoken: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, principalselfsid: Long, desiredaccess: Int, audittype: Int, flags: Int, objecttypelist: Long, objecttypelistlength: Int, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwAdjustGroupsToken(tokenhandle: Long, resettodefault: Boolean, newstate: Long, bufferlength: Int, previousstate: Long, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwAdjustPrivilegesToken(tokenhandle: Long, disableallprivileges: Boolean, newstate: Long, bufferlength: Int, previousstate: Long, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwAllocateVirtualMemory(processhandle: Long, baseaddress: Long, zerobits: Long, regionsize: Long, allocationtype: Int, protect: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwAllocateVirtualMemoryEx(processhandle: Long, baseaddress: Long, regionsize: Long, allocationtype: Int, pageprotection: Int, extendedparameters: Long, extendedparametercount: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwCancelIoFileEx(filehandle: Long, iorequesttocancel: Long, iostatusblock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwCloseObjectAuditAlarm(subsystemname: Long, handleid: Long, generateonclose: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwCreateDirectoryObject(directoryhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwCreateEvent(eventhandle: Long, desiredaccess: Int, objectattributes: Long, eventtype: Int, initialstate: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwCreateSectionEx(sectionhandle: Long, desiredaccess: Int, objectattributes: Long, maximumsize: Long, sectionpageprotection: Int, allocationattributes: Int, filehandle: Long, extendedparameters: Long, extendedparametercount: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwDeleteFile(objectattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwDeleteObjectAuditAlarm(subsystemname: Long, handleid: Long, generateonclose: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwDuplicateObject(sourceprocesshandle: Long, sourcehandle: Long, targetprocesshandle: Long, targethandle: Long, desiredaccess: Int, handleattributes: Int, options: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwDuplicateToken(existingtokenhandle: Long, desiredaccess: Int, objectattributes: Long, effectiveonly: Boolean, tokentype: Int, newtokenhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwFilterToken(existingtokenhandle: Long, flags: Int, sidstodisable: Long, privilegestodelete: Long, restrictedsids: Long, newtokenhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwFlushBuffersFile(filehandle: Long, iostatusblock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwFlushBuffersFileEx(filehandle: Long, flags: Int, parameters: Long, parameterssize: Int, iostatusblock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwFlushVirtualMemory(processhandle: Long, baseaddress: Long, regionsize: Long, iostatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwFreeVirtualMemory(processhandle: Long, baseaddress: Long, regionsize: Long, freetype: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwFsControlFile(filehandle: Long, event: Long, apcroutine: Long, apccontext: Long, iostatusblock: Long, fscontrolcode: Int, inputbuffer: Long, inputbufferlength: Int, outputbuffer: Long, outputbufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwImpersonateAnonymousToken(threadhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwLockFile(filehandle: Long, event: Long, apcroutine: Long, apccontext: Long, iostatusblock: Long, byteoffset: Long, length: Long, key: Int, failimmediately: Boolean, exclusivelock: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwNotifyChangeKey(keyhandle: Long, event: Long, apcroutine: Long, apccontext: Long, iostatusblock: Long, completionfilter: Int, watchtree: Boolean, buffer: Long, buffersize: Int, asynchronous: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwOpenDirectoryObject(directoryhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwOpenObjectAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, clienttoken: Long, desiredaccess: Int, grantedaccess: Int, privileges: Long, objectcreation: Boolean, accessgranted: Boolean, generateonclose: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwOpenProcessToken(processhandle: Long, desiredaccess: Int, tokenhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwOpenProcessTokenEx(processhandle: Long, desiredaccess: Int, handleattributes: Int, tokenhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwOpenThreadToken(threadhandle: Long, desiredaccess: Int, openasself: Boolean, tokenhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwOpenThreadTokenEx(threadhandle: Long, desiredaccess: Int, openasself: Boolean, handleattributes: Int, tokenhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwPrivilegeCheck(clienttoken: Long, requiredprivileges: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwPrivilegeObjectAuditAlarm(subsystemname: Long, handleid: Long, clienttoken: Long, desiredaccess: Int, privileges: Long, accessgranted: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwPrivilegedServiceAuditAlarm(subsystemname: Long, servicename: Long, clienttoken: Long, privileges: Long, accessgranted: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwQueryDirectoryFile(filehandle: Long, event: Long, apcroutine: Long, apccontext: Long, iostatusblock: Long, fileinformation: Long, length: Int, fileinformationclass: Int, returnsingleentry: Boolean, filename: Long, restartscan: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwQueryDirectoryFileEx(filehandle: Long, event: Long, apcroutine: Long, apccontext: Long, iostatusblock: Long, fileinformation: Long, length: Int, fileinformationclass: Int, queryflags: Int, filename: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwQueryDirectoryObject(directoryhandle: Long, buffer: Long, length: Int, returnsingleentry: Boolean, restartscan: Boolean, context: Long, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwQueryEaFile(filehandle: Long, iostatusblock: Long, buffer: Long, length: Int, returnsingleentry: Boolean, ealist: Long, ealistlength: Int, eaindex: Long, restartscan: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwQueryFullAttributesFile(objectattributes: Long, fileinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwQueryInformationToken(tokenhandle: Long, tokeninformationclass: Int, tokeninformation: Long, tokeninformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwQueryObject(handle: Long, objectinformationclass: Int, objectinformation: Long, objectinformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwQueryQuotaInformationFile(filehandle: Long, iostatusblock: Long, buffer: Long, length: Int, returnsingleentry: Boolean, sidlist: Long, sidlistlength: Int, startsid: Long, restartscan: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwQuerySecurityObject(handle: Long, securityinformation: Int, securitydescriptor: Long, length: Int, lengthneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwQueryVirtualMemory(processhandle: Long, baseaddress: Long, memoryinformationclass: Int, memoryinformation: Long, memoryinformationlength: Long, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwQueryVolumeInformationFile(filehandle: Long, iostatusblock: Long, fsinformation: Long, length: Int, fsinformationclass: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwSetEaFile(filehandle: Long, iostatusblock: Long, buffer: Long, length: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwSetEvent(eventhandle: Long, previousstate: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwSetInformationToken(tokenhandle: Long, tokeninformationclass: Int, tokeninformation: Long, tokeninformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwSetInformationVirtualMemory(processhandle: Long, vminformationclass: Int, numberofentries: Long, virtualaddresses: Long, vminformation: Long, vminformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwSetQuotaInformationFile(filehandle: Long, iostatusblock: Long, buffer: Long, length: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwSetSecurityObject(handle: Long, securityinformation: Int, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwSetVolumeInformationFile(filehandle: Long, iostatusblock: Long, fsinformation: Long, length: Int, fsinformationclass: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_zwUnlockFile(filehandle: Long, iostatusblock: Long, byteoffset: Long, length: Long, key: Int): Int
}

public actual fun applyControlToken(phcontext: COpaquePointer?, pinput: COpaquePointer?): Hresult =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_applyControlToken((phcontext?.value ?: 0L), (pinput?.value ?: 0L))

public actual fun ccAsyncCopyRead(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, wait: Boolean, buffer: COpaquePointer?, iostatus: COpaquePointer?, ioissuerthread: Pethread, asyncreadcontext: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccAsyncCopyRead((fileobject?.value ?: 0L), (fileoffset?.value ?: 0L), length.toInt(), wait, (buffer?.value ?: 0L), (iostatus?.value ?: 0L), ioissuerthread, (asyncreadcontext?.value ?: 0L))

public actual fun ccCanIWrite(fileobject: COpaquePointer?, bytestowrite: UInt, wait: Boolean, retrying: UByte): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccCanIWrite((fileobject?.value ?: 0L), bytestowrite.toInt(), wait, retrying.toByte())

public actual fun ccCoherencyFlushAndPurgeCache(sectionobjectpointer: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, iostatus: COpaquePointer?, flags: UInt) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccCoherencyFlushAndPurgeCache((sectionobjectpointer?.value ?: 0L), (fileoffset?.value ?: 0L), length.toInt(), (iostatus?.value ?: 0L), flags.toInt())
}

public actual fun ccCopyRead(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, wait: Boolean, buffer: COpaquePointer?, iostatus: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccCopyRead((fileobject?.value ?: 0L), (fileoffset?.value ?: 0L), length.toInt(), wait, (buffer?.value ?: 0L), (iostatus?.value ?: 0L))

public actual fun ccCopyReadEx(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, wait: Boolean, buffer: COpaquePointer?, iostatus: COpaquePointer?, ioissuerthread: Pethread): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccCopyReadEx((fileobject?.value ?: 0L), (fileoffset?.value ?: 0L), length.toInt(), wait, (buffer?.value ?: 0L), (iostatus?.value ?: 0L), ioissuerthread)

public actual fun ccCopyWrite(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, wait: Boolean, buffer: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccCopyWrite((fileobject?.value ?: 0L), (fileoffset?.value ?: 0L), length.toInt(), wait, (buffer?.value ?: 0L))

public actual fun ccCopyWriteEx(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, wait: Boolean, buffer: COpaquePointer?, ioissuerthread: Pethread): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccCopyWriteEx((fileobject?.value ?: 0L), (fileoffset?.value ?: 0L), length.toInt(), wait, (buffer?.value ?: 0L), ioissuerthread)

public actual fun ccCopyWriteWontFlush(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccCopyWriteWontFlush((fileobject?.value ?: 0L), (fileoffset?.value ?: 0L), length.toInt())

public actual fun ccDeferWrite(fileobject: COpaquePointer?, postroutine: PccPostDeferredWrite, context1: COpaquePointer?, context2: COpaquePointer?, bytestowrite: UInt, retrying: Boolean) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccDeferWrite((fileobject?.value ?: 0L), 0L, (context1?.value ?: 0L), (context2?.value ?: 0L), bytestowrite.toInt(), retrying)
}

public actual fun ccErrorCallbackRoutine(context: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccErrorCallbackRoutine((context?.value ?: 0L))

public actual fun ccFastCopyRead(fileobject: COpaquePointer?, fileoffset: UInt, length: UInt, pagecount: UInt, buffer: COpaquePointer?, iostatus: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccFastCopyRead((fileobject?.value ?: 0L), fileoffset.toInt(), length.toInt(), pagecount.toInt(), (buffer?.value ?: 0L), (iostatus?.value ?: 0L))
}

public actual fun ccFastCopyWrite(fileobject: COpaquePointer?, fileoffset: UInt, length: UInt, buffer: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccFastCopyWrite((fileobject?.value ?: 0L), fileoffset.toInt(), length.toInt(), (buffer?.value ?: 0L))
}

public actual fun ccFlushCache(sectionobjectpointer: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, iostatus: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccFlushCache((sectionobjectpointer?.value ?: 0L), (fileoffset?.value ?: 0L), length.toInt(), (iostatus?.value ?: 0L))
}

public actual fun ccGetDirtyPages(loghandle: COpaquePointer?, dirtypageroutine: PdirtyPageRoutine, context1: COpaquePointer?, context2: COpaquePointer?): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccGetDirtyPages((loghandle?.value ?: 0L), 0L, (context1?.value ?: 0L), (context2?.value ?: 0L))

public actual fun ccGetFileObjectFromBcb(bcb: COpaquePointer?): COpaquePointer? =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccGetFileObjectFromBcb((bcb?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ccGetFileObjectFromSectionPtrs(sectionobjectpointer: COpaquePointer?): COpaquePointer? =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccGetFileObjectFromSectionPtrs((sectionobjectpointer?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ccGetFileObjectFromSectionPtrsRef(sectionobjectpointer: COpaquePointer?): COpaquePointer? =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccGetFileObjectFromSectionPtrsRef((sectionobjectpointer?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ccGetFlushedValidData(sectionobjectpointer: COpaquePointer?, bcblistheld: Boolean): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccGetFlushedValidData((sectionobjectpointer?.value ?: 0L), bcblistheld)

public actual fun ccInitializeCacheMap(fileobject: COpaquePointer?, filesizes: COpaquePointer?, pinaccess: Boolean, callbacks: COpaquePointer?, lazywritecontext: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccInitializeCacheMap((fileobject?.value ?: 0L), (filesizes?.value ?: 0L), pinaccess, (callbacks?.value ?: 0L), (lazywritecontext?.value ?: 0L))
}

public actual fun ccInitializeCacheMapEx(fileobject: COpaquePointer?, filesizes: COpaquePointer?, pinaccess: Boolean, callbacks: COpaquePointer?, lazywritecontext: COpaquePointer?, flags: UInt) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccInitializeCacheMapEx((fileobject?.value ?: 0L), (filesizes?.value ?: 0L), pinaccess, (callbacks?.value ?: 0L), (lazywritecontext?.value ?: 0L), flags.toInt())
}

public actual fun ccIsCacheManagerCallbackNeeded(status: Ntstatus): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccIsCacheManagerCallbackNeeded(status)

public actual fun ccIsThereDirtyData(vpb: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccIsThereDirtyData((vpb?.value ?: 0L))

public actual fun ccIsThereDirtyDataEx(vpb: COpaquePointer?, numberofdirtypages: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccIsThereDirtyDataEx((vpb?.value ?: 0L), (numberofdirtypages?.value ?: 0L))

public actual fun ccMapData(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, flags: UInt, bcb: COpaquePointer?, buffer: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccMapData((fileobject?.value ?: 0L), (fileoffset?.value ?: 0L), length.toInt(), flags.toInt(), (bcb?.value ?: 0L), (buffer?.value ?: 0L))

public actual fun ccMdlRead(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, mdlchain: COpaquePointer?, iostatus: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccMdlRead((fileobject?.value ?: 0L), (fileoffset?.value ?: 0L), length.toInt(), (mdlchain?.value ?: 0L), (iostatus?.value ?: 0L))
}

public actual fun ccMdlReadComplete(fileobject: COpaquePointer?, mdlchain: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccMdlReadComplete((fileobject?.value ?: 0L), (mdlchain?.value ?: 0L))
}

public actual fun ccMdlWriteAbort(fileobject: COpaquePointer?, mdlchain: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccMdlWriteAbort((fileobject?.value ?: 0L), (mdlchain?.value ?: 0L))
}

public actual fun ccMdlWriteComplete(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, mdlchain: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccMdlWriteComplete((fileobject?.value ?: 0L), (fileoffset?.value ?: 0L), (mdlchain?.value ?: 0L))
}

public actual fun ccPinMappedData(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, flags: UInt, bcb: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccPinMappedData((fileobject?.value ?: 0L), (fileoffset?.value ?: 0L), length.toInt(), flags.toInt(), (bcb?.value ?: 0L))

public actual fun ccPinRead(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, flags: UInt, bcb: COpaquePointer?, buffer: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccPinRead((fileobject?.value ?: 0L), (fileoffset?.value ?: 0L), length.toInt(), flags.toInt(), (bcb?.value ?: 0L), (buffer?.value ?: 0L))

public actual fun ccPrepareMdlWrite(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, mdlchain: COpaquePointer?, iostatus: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccPrepareMdlWrite((fileobject?.value ?: 0L), (fileoffset?.value ?: 0L), length.toInt(), (mdlchain?.value ?: 0L), (iostatus?.value ?: 0L))
}

public actual fun ccPreparePinWrite(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, zero: Boolean, flags: UInt, bcb: COpaquePointer?, buffer: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccPreparePinWrite((fileobject?.value ?: 0L), (fileoffset?.value ?: 0L), length.toInt(), zero, flags.toInt(), (bcb?.value ?: 0L), (buffer?.value ?: 0L))

public actual fun ccPurgeCacheSection(sectionobjectpointer: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, flags: UInt): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccPurgeCacheSection((sectionobjectpointer?.value ?: 0L), (fileoffset?.value ?: 0L), length.toInt(), flags.toInt())

public actual fun ccRemapBcb(bcb: COpaquePointer?): COpaquePointer? =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccRemapBcb((bcb?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ccRepinBcb(bcb: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccRepinBcb((bcb?.value ?: 0L))
}

public actual fun ccScheduleReadAhead(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccScheduleReadAhead((fileobject?.value ?: 0L), (fileoffset?.value ?: 0L), length.toInt())
}

public actual fun ccScheduleReadAheadEx(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, ioissuerthread: Pethread) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccScheduleReadAheadEx((fileobject?.value ?: 0L), (fileoffset?.value ?: 0L), length.toInt(), ioissuerthread)
}

public actual fun ccSetAdditionalCacheAttributes(fileobject: COpaquePointer?, disablereadahead: Boolean, disablewritebehind: Boolean) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccSetAdditionalCacheAttributes((fileobject?.value ?: 0L), disablereadahead, disablewritebehind)
}

public actual fun ccSetAdditionalCacheAttributesEx(fileobject: COpaquePointer?, flags: UInt) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccSetAdditionalCacheAttributesEx((fileobject?.value ?: 0L), flags.toInt())
}

public actual fun ccSetBcbOwnerPointer(bcb: COpaquePointer?, ownerpointer: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccSetBcbOwnerPointer((bcb?.value ?: 0L), (ownerpointer?.value ?: 0L))
}

public actual fun ccSetDirtyPageThreshold(fileobject: COpaquePointer?, dirtypagethreshold: UInt) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccSetDirtyPageThreshold((fileobject?.value ?: 0L), dirtypagethreshold.toInt())
}

public actual fun ccSetDirtyPinnedData(bcbvoid: COpaquePointer?, lsn: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccSetDirtyPinnedData((bcbvoid?.value ?: 0L), (lsn?.value ?: 0L))
}

public actual fun ccSetFileSizes(fileobject: COpaquePointer?, filesizes: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccSetFileSizes((fileobject?.value ?: 0L), (filesizes?.value ?: 0L))
}

public actual fun ccSetFileSizesEx(fileobject: COpaquePointer?, filesizes: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccSetFileSizesEx((fileobject?.value ?: 0L), (filesizes?.value ?: 0L))

public actual fun ccSetLogHandleForFile(fileobject: COpaquePointer?, loghandle: COpaquePointer?, flushtolsnroutine: PflushToLsn) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccSetLogHandleForFile((fileobject?.value ?: 0L), (loghandle?.value ?: 0L), 0L)
}

public actual fun ccSetParallelFlushFile(fileobject: COpaquePointer?, enableparallelflush: Boolean) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccSetParallelFlushFile((fileobject?.value ?: 0L), enableparallelflush)
}

public actual fun ccSetReadAheadGranularity(fileobject: COpaquePointer?, granularity: UInt) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccSetReadAheadGranularity((fileobject?.value ?: 0L), granularity.toInt())
}

public actual fun ccUninitializeCacheMap(fileobject: COpaquePointer?, truncatesize: COpaquePointer?, uninitializeevent: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccUninitializeCacheMap((fileobject?.value ?: 0L), (truncatesize?.value ?: 0L), (uninitializeevent?.value ?: 0L))

public actual fun ccUnpinData(bcb: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccUnpinData((bcb?.value ?: 0L))
}

public actual fun ccUnpinDataForThread(bcb: COpaquePointer?, resourcethreadid: ULong) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccUnpinDataForThread((bcb?.value ?: 0L), resourcethreadid.toLong())
}

public actual fun ccUnpinRepinnedBcb(bcb: COpaquePointer?, writethrough: Boolean, iostatus: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccUnpinRepinnedBcb((bcb?.value ?: 0L), writethrough, (iostatus?.value ?: 0L))
}

public actual fun ccWaitForCurrentLazyWriterActivity(): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccWaitForCurrentLazyWriterActivity()

public actual fun ccZeroData(fileobject: COpaquePointer?, startoffset: COpaquePointer?, endoffset: COpaquePointer?, wait: Boolean): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ccZeroData((fileobject?.value ?: 0L), (startoffset?.value ?: 0L), (endoffset?.value ?: 0L), wait)

public actual fun completeAuthToken(phcontext: COpaquePointer?, ptoken: COpaquePointer?): Hresult =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_completeAuthToken((phcontext?.value ?: 0L), (ptoken?.value ?: 0L))

public actual fun exDisableResourceBoostLite(resource: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_exDisableResourceBoostLite((resource?.value ?: 0L))
}

public actual fun exQueryPoolBlockSize(poolblock: COpaquePointer?, quotacharged: COpaquePointer?): ULong =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_exQueryPoolBlockSize((poolblock?.value ?: 0L), (quotacharged?.value ?: 0L)).toULong()

public actual fun exportSecurityContext(phcontext: COpaquePointer?, fflags: UInt, ppackedcontext: COpaquePointer?, ptoken: COpaquePointer?): Hresult =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_exportSecurityContext((phcontext?.value ?: 0L), fflags.toInt(), (ppackedcontext?.value ?: 0L), (ptoken?.value ?: 0L))

public actual fun fsRtlAcknowledgeEcp(ecpcontext: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlAcknowledgeEcp((ecpcontext?.value ?: 0L))
}

public actual fun fsRtlAcquireFileExclusive(fileobject: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlAcquireFileExclusive((fileobject?.value ?: 0L))
}

public actual fun fsRtlAddBaseMcbEntry(mcb: COpaquePointer?, vbn: Long, lbn: Long, sectorcount: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlAddBaseMcbEntry((mcb?.value ?: 0L), vbn, lbn, sectorcount)

public actual fun fsRtlAddBaseMcbEntryEx(mcb: COpaquePointer?, vbn: Long, lbn: Long, sectorcount: Long): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlAddBaseMcbEntryEx((mcb?.value ?: 0L), vbn, lbn, sectorcount)

public actual fun fsRtlAddLargeMcbEntry(mcb: COpaquePointer?, vbn: Long, lbn: Long, sectorcount: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlAddLargeMcbEntry((mcb?.value ?: 0L), vbn, lbn, sectorcount)

public actual fun fsRtlAddMcbEntry(mcb: COpaquePointer?, vbn: UInt, lbn: UInt, sectorcount: UInt): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlAddMcbEntry((mcb?.value ?: 0L), vbn.toInt(), lbn.toInt(), sectorcount.toInt())

public actual fun fsRtlAddToTunnelCache(cache: COpaquePointer?, directorykey: ULong, shortname: COpaquePointer?, longname: COpaquePointer?, keybyshortname: Boolean, datalength: UInt, data: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlAddToTunnelCache((cache?.value ?: 0L), directorykey.toLong(), (shortname?.value ?: 0L), (longname?.value ?: 0L), keybyshortname, datalength.toInt(), (data?.value ?: 0L))
}

public actual fun fsRtlAddToTunnelCacheEx(cache: COpaquePointer?, directorykey: ULong, shortname: COpaquePointer?, longname: COpaquePointer?, flags: UInt, datalength: UInt, data: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlAddToTunnelCacheEx((cache?.value ?: 0L), directorykey.toLong(), (shortname?.value ?: 0L), (longname?.value ?: 0L), flags.toInt(), datalength.toInt(), (data?.value ?: 0L))
}

public actual fun fsRtlAllocateAePushLock(pooltype: PoolType, tag: UInt): COpaquePointer? =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlAllocateAePushLock(pooltype, tag.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fsRtlAllocateExtraCreateParameter(ecptype: COpaquePointer?, sizeofcontext: UInt, flags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, pooltag: UInt, ecpcontext: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlAllocateExtraCreateParameter((ecptype?.value ?: 0L), sizeofcontext.toInt(), flags.toInt(), 0L, pooltag.toInt(), (ecpcontext?.value ?: 0L))

public actual fun fsRtlAllocateExtraCreateParameterFromLookasideList(ecptype: COpaquePointer?, sizeofcontext: UInt, flags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, lookasidelist: COpaquePointer?, ecpcontext: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlAllocateExtraCreateParameterFromLookasideList((ecptype?.value ?: 0L), sizeofcontext.toInt(), flags.toInt(), 0L, (lookasidelist?.value ?: 0L), (ecpcontext?.value ?: 0L))

public actual fun fsRtlAllocateExtraCreateParameterList(flags: UInt, ecplist: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlAllocateExtraCreateParameterList(flags.toInt(), (ecplist?.value ?: 0L))

public actual fun fsRtlAllocateFileLock(completelockirproutine: PcompleteLockIrpRoutine, unlockroutine: PunlockRoutine): COpaquePointer? =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlAllocateFileLock(0L, 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fsRtlAllocateResource(): COpaquePointer? =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlAllocateResource().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fsRtlAreNamesEqual(constantnamea: COpaquePointer?, constantnameb: COpaquePointer?, ignorecase: Boolean, upcasetable: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlAreNamesEqual((constantnamea?.value ?: 0L), (constantnameb?.value ?: 0L), ignorecase, (upcasetable?.value ?: 0L))

public actual fun fsRtlAreThereCurrentOrInProgressFileLocks(filelock: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlAreThereCurrentOrInProgressFileLocks((filelock?.value ?: 0L))

public actual fun fsRtlAreThereWaitingFileLocks(filelock: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlAreThereWaitingFileLocks((filelock?.value ?: 0L))

public actual fun fsRtlAreVolumeStartupApplicationsComplete(): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlAreVolumeStartupApplicationsComplete()

public actual fun fsRtlBalanceReads(targetdevice: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlBalanceReads((targetdevice?.value ?: 0L))

public actual fun fsRtlCancellableWaitForMultipleObjects(count: UInt, objectarray: COpaquePointer?, waittype: WaitType, timeout: COpaquePointer?, waitblockarray: COpaquePointer?, irp: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlCancellableWaitForMultipleObjects(count.toInt(), (objectarray?.value ?: 0L), waittype, (timeout?.value ?: 0L), (waitblockarray?.value ?: 0L), (irp?.value ?: 0L))

public actual fun fsRtlCancellableWaitForSingleObject(obj: COpaquePointer?, timeout: COpaquePointer?, irp: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlCancellableWaitForSingleObject((obj?.value ?: 0L), (timeout?.value ?: 0L), (irp?.value ?: 0L))

public actual fun fsRtlChangeBackingFileObject(currentfileobject: COpaquePointer?, newfileobject: COpaquePointer?, changebackingtype: FsrtlChangeBackingType, flags: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlChangeBackingFileObject((currentfileobject?.value ?: 0L), (newfileobject?.value ?: 0L), changebackingtype, flags.toInt())

public actual fun fsRtlCheckLockForOplockRequest(filelock: COpaquePointer?, allocationsize: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlCheckLockForOplockRequest((filelock?.value ?: 0L), (allocationsize?.value ?: 0L))

public actual fun fsRtlCheckLockForReadAccess(filelock: COpaquePointer?, irp: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlCheckLockForReadAccess((filelock?.value ?: 0L), (irp?.value ?: 0L))

public actual fun fsRtlCheckLockForWriteAccess(filelock: COpaquePointer?, irp: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlCheckLockForWriteAccess((filelock?.value ?: 0L), (irp?.value ?: 0L))

public actual fun fsRtlCheckOplock(oplock: COpaquePointer?, irp: COpaquePointer?, context: COpaquePointer?, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlCheckOplock((oplock?.value ?: 0L), (irp?.value ?: 0L), (context?.value ?: 0L), 0L, 0L)

public actual fun fsRtlCheckOplockEx(oplock: COpaquePointer?, irp: COpaquePointer?, flags: UInt, context: COpaquePointer?, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlCheckOplockEx((oplock?.value ?: 0L), (irp?.value ?: 0L), flags.toInt(), (context?.value ?: 0L), 0L, 0L)

public actual fun fsRtlCheckOplockEx2(oplock: COpaquePointer?, irp: COpaquePointer?, flags: UInt, flagsex2: UInt, completionroutinecontext: COpaquePointer?, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp, timeout: ULong, notifycontext: COpaquePointer?, notifyroutine: PoplockNotifyRoutine): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlCheckOplockEx2((oplock?.value ?: 0L), (irp?.value ?: 0L), flags.toInt(), flagsex2.toInt(), (completionroutinecontext?.value ?: 0L), 0L, 0L, timeout.toLong(), (notifycontext?.value ?: 0L), 0L)

public actual fun fsRtlCheckUpperOplock(oplock: COpaquePointer?, newloweroplockstate: UInt, completionroutinecontext: COpaquePointer?, completionroutine: PoplockWaitCompleteRoutine, prependroutine: PoplockFsPrepostIrp, flags: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlCheckUpperOplock((oplock?.value ?: 0L), newloweroplockstate.toInt(), (completionroutinecontext?.value ?: 0L), 0L, 0L, flags.toInt())

public actual fun fsRtlCopyRead(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, wait: Boolean, lockkey: UInt, buffer: COpaquePointer?, iostatus: COpaquePointer?, deviceobject: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlCopyRead((fileobject?.value ?: 0L), (fileoffset?.value ?: 0L), length.toInt(), wait, lockkey.toInt(), (buffer?.value ?: 0L), (iostatus?.value ?: 0L), (deviceobject?.value ?: 0L))

public actual fun fsRtlCopyWrite(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, wait: Boolean, lockkey: UInt, buffer: COpaquePointer?, iostatus: COpaquePointer?, deviceobject: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlCopyWrite((fileobject?.value ?: 0L), (fileoffset?.value ?: 0L), length.toInt(), wait, lockkey.toInt(), (buffer?.value ?: 0L), (iostatus?.value ?: 0L), (deviceobject?.value ?: 0L))

public actual fun fsRtlCreateSectionForDataScan(sectionhandle: COpaquePointer?, sectionobject: COpaquePointer?, sectionfilesize: COpaquePointer?, fileobject: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, maximumsize: COpaquePointer?, sectionpageprotection: UInt, allocationattributes: UInt, flags: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlCreateSectionForDataScan((sectionhandle?.value ?: 0L), (sectionobject?.value ?: 0L), (sectionfilesize?.value ?: 0L), (fileobject?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), (maximumsize?.value ?: 0L), sectionpageprotection.toInt(), allocationattributes.toInt(), flags.toInt())

public actual fun fsRtlCurrentBatchOplock(oplock: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlCurrentBatchOplock((oplock?.value ?: 0L))

public actual fun fsRtlCurrentOplock(oplock: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlCurrentOplock((oplock?.value ?: 0L))

public actual fun fsRtlCurrentOplockH(oplock: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlCurrentOplockH((oplock?.value ?: 0L))

public actual fun fsRtlDeleteExtraCreateParameterLookasideList(lookaside: COpaquePointer?, flags: UInt) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlDeleteExtraCreateParameterLookasideList((lookaside?.value ?: 0L), flags.toInt())
}

public actual fun fsRtlDeleteKeyFromTunnelCache(cache: COpaquePointer?, directorykey: ULong) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlDeleteKeyFromTunnelCache((cache?.value ?: 0L), directorykey.toLong())
}

public actual fun fsRtlDeleteTunnelCache(cache: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlDeleteTunnelCache((cache?.value ?: 0L))
}

public actual fun fsRtlDeregisterUncProvider(handle: Handle) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlDeregisterUncProvider((handle?.value ?: 0L))
}

public actual fun fsRtlDismountComplete(deviceobject: COpaquePointer?, dismountstatus: Ntstatus) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlDismountComplete((deviceobject?.value ?: 0L), dismountstatus)
}

public actual fun fsRtlDissectDbcs(path: io.github.kotlinmania.windowssys.windows.win32.system.kernel.String, firstname: COpaquePointer?, remainingname: COpaquePointer?) {
}

public actual fun fsRtlDissectName(path: UnicodeString, firstname: COpaquePointer?, remainingname: COpaquePointer?) {
}

public actual fun fsRtlDoesDbcsContainWildCards(name: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlDoesDbcsContainWildCards((name?.value ?: 0L))

public actual fun fsRtlDoesNameContainWildCards(name: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlDoesNameContainWildCards((name?.value ?: 0L))

public actual fun fsRtlFastCheckLockForRead(filelock: COpaquePointer?, startingbyte: COpaquePointer?, length: COpaquePointer?, key: UInt, fileobject: COpaquePointer?, processid: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlFastCheckLockForRead((filelock?.value ?: 0L), (startingbyte?.value ?: 0L), (length?.value ?: 0L), key.toInt(), (fileobject?.value ?: 0L), (processid?.value ?: 0L))

public actual fun fsRtlFastCheckLockForWrite(filelock: COpaquePointer?, startingbyte: COpaquePointer?, length: COpaquePointer?, key: UInt, fileobject: COpaquePointer?, processid: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlFastCheckLockForWrite((filelock?.value ?: 0L), (startingbyte?.value ?: 0L), (length?.value ?: 0L), key.toInt(), (fileobject?.value ?: 0L), (processid?.value ?: 0L))

public actual fun fsRtlFastUnlockAll(filelock: COpaquePointer?, fileobject: COpaquePointer?, processid: Peprocess, context: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlFastUnlockAll((filelock?.value ?: 0L), (fileobject?.value ?: 0L), processid, (context?.value ?: 0L))

public actual fun fsRtlFastUnlockAllByKey(filelock: COpaquePointer?, fileobject: COpaquePointer?, processid: Peprocess, key: UInt, context: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlFastUnlockAllByKey((filelock?.value ?: 0L), (fileobject?.value ?: 0L), processid, key.toInt(), (context?.value ?: 0L))

public actual fun fsRtlFastUnlockSingle(filelock: COpaquePointer?, fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: COpaquePointer?, processid: Peprocess, key: UInt, context: COpaquePointer?, alreadysynchronized: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlFastUnlockSingle((filelock?.value ?: 0L), (fileobject?.value ?: 0L), (fileoffset?.value ?: 0L), (length?.value ?: 0L), processid, key.toInt(), (context?.value ?: 0L), alreadysynchronized)

public actual fun fsRtlFindExtraCreateParameter(ecplist: COpaquePointer?, ecptype: COpaquePointer?, ecpcontext: COpaquePointer?, ecpcontextsize: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlFindExtraCreateParameter((ecplist?.value ?: 0L), (ecptype?.value ?: 0L), (ecpcontext?.value ?: 0L), (ecpcontextsize?.value ?: 0L))

public actual fun fsRtlFindInTunnelCache(cache: COpaquePointer?, directorykey: ULong, name: COpaquePointer?, shortname: COpaquePointer?, longname: COpaquePointer?, datalength: COpaquePointer?, data: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlFindInTunnelCache((cache?.value ?: 0L), directorykey.toLong(), (name?.value ?: 0L), (shortname?.value ?: 0L), (longname?.value ?: 0L), (datalength?.value ?: 0L), (data?.value ?: 0L))

public actual fun fsRtlFindInTunnelCacheEx(cache: COpaquePointer?, directorykey: ULong, name: COpaquePointer?, shortname: COpaquePointer?, longname: COpaquePointer?, flags: UInt, datalength: COpaquePointer?, data: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlFindInTunnelCacheEx((cache?.value ?: 0L), directorykey.toLong(), (name?.value ?: 0L), (shortname?.value ?: 0L), (longname?.value ?: 0L), flags.toInt(), (datalength?.value ?: 0L), (data?.value ?: 0L))

public actual fun fsRtlFreeAePushLock(aepushlock: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlFreeAePushLock((aepushlock?.value ?: 0L))
}

public actual fun fsRtlFreeExtraCreateParameter(ecpcontext: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlFreeExtraCreateParameter((ecpcontext?.value ?: 0L))
}

public actual fun fsRtlFreeExtraCreateParameterList(ecplist: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlFreeExtraCreateParameterList((ecplist?.value ?: 0L))
}

public actual fun fsRtlFreeFileLock(filelock: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlFreeFileLock((filelock?.value ?: 0L))
}

public actual fun fsRtlGetCurrentProcessLoaderList(): COpaquePointer? =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlGetCurrentProcessLoaderList().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fsRtlGetEcpListFromIrp(irp: COpaquePointer?, ecplist: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlGetEcpListFromIrp((irp?.value ?: 0L), (ecplist?.value ?: 0L))

public actual fun fsRtlGetFileSize(fileobject: COpaquePointer?, filesize: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlGetFileSize((fileobject?.value ?: 0L), (filesize?.value ?: 0L))

public actual fun fsRtlGetNextBaseMcbEntry(mcb: COpaquePointer?, runindex: UInt, vbn: COpaquePointer?, lbn: COpaquePointer?, sectorcount: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlGetNextBaseMcbEntry((mcb?.value ?: 0L), runindex.toInt(), (vbn?.value ?: 0L), (lbn?.value ?: 0L), (sectorcount?.value ?: 0L))

public actual fun fsRtlGetNextExtraCreateParameter(ecplist: COpaquePointer?, currentecpcontext: COpaquePointer?, nextecptype: COpaquePointer?, nextecpcontext: COpaquePointer?, nextecpcontextsize: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlGetNextExtraCreateParameter((ecplist?.value ?: 0L), (currentecpcontext?.value ?: 0L), (nextecptype?.value ?: 0L), (nextecpcontext?.value ?: 0L), (nextecpcontextsize?.value ?: 0L))

public actual fun fsRtlGetNextFileLock(filelock: COpaquePointer?, restart: Boolean): COpaquePointer? =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlGetNextFileLock((filelock?.value ?: 0L), restart).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fsRtlGetNextLargeMcbEntry(mcb: COpaquePointer?, runindex: UInt, vbn: COpaquePointer?, lbn: COpaquePointer?, sectorcount: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlGetNextLargeMcbEntry((mcb?.value ?: 0L), runindex.toInt(), (vbn?.value ?: 0L), (lbn?.value ?: 0L), (sectorcount?.value ?: 0L))

public actual fun fsRtlGetNextMcbEntry(mcb: COpaquePointer?, runindex: UInt, vbn: COpaquePointer?, lbn: COpaquePointer?, sectorcount: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlGetNextMcbEntry((mcb?.value ?: 0L), runindex.toInt(), (vbn?.value ?: 0L), (lbn?.value ?: 0L), (sectorcount?.value ?: 0L))

public actual fun fsRtlGetSectorSizeInformation(deviceobject: COpaquePointer?, sectorsizeinfo: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlGetSectorSizeInformation((deviceobject?.value ?: 0L), (sectorsizeinfo?.value ?: 0L))

public actual fun fsRtlGetSupportedFeatures(deviceobject: COpaquePointer?, supportedfeatures: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlGetSupportedFeatures((deviceobject?.value ?: 0L), (supportedfeatures?.value ?: 0L))

public actual fun fsRtlGetVirtualDiskNestingLevel(deviceobject: COpaquePointer?, nestinglevel: COpaquePointer?, nestingflags: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlGetVirtualDiskNestingLevel((deviceobject?.value ?: 0L), (nestinglevel?.value ?: 0L), (nestingflags?.value ?: 0L))

public actual fun fsRtlIncrementCcFastMdlReadWait() {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlIncrementCcFastMdlReadWait()
}

public actual fun fsRtlIncrementCcFastReadNoWait() {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlIncrementCcFastReadNoWait()
}

public actual fun fsRtlIncrementCcFastReadNotPossible() {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlIncrementCcFastReadNotPossible()
}

public actual fun fsRtlIncrementCcFastReadResourceMiss() {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlIncrementCcFastReadResourceMiss()
}

public actual fun fsRtlIncrementCcFastReadWait() {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlIncrementCcFastReadWait()
}

public actual fun fsRtlInitExtraCreateParameterLookasideList(lookaside: COpaquePointer?, flags: UInt, size: ULong, tag: UInt) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlInitExtraCreateParameterLookasideList((lookaside?.value ?: 0L), flags.toInt(), size.toLong(), tag.toInt())
}

public actual fun fsRtlInitializeBaseMcb(mcb: COpaquePointer?, pooltype: PoolType) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlInitializeBaseMcb((mcb?.value ?: 0L), pooltype)
}

public actual fun fsRtlInitializeBaseMcbEx(mcb: COpaquePointer?, pooltype: PoolType, flags: UShort): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlInitializeBaseMcbEx((mcb?.value ?: 0L), pooltype, flags.toShort())

public actual fun fsRtlInitializeExtraCreateParameter(ecp: COpaquePointer?, ecpflags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, totalsize: UInt, ecptype: COpaquePointer?, listallocatedfrom: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlInitializeExtraCreateParameter((ecp?.value ?: 0L), ecpflags.toInt(), 0L, totalsize.toInt(), (ecptype?.value ?: 0L), (listallocatedfrom?.value ?: 0L))
}

public actual fun fsRtlInitializeExtraCreateParameterList(ecplist: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlInitializeExtraCreateParameterList((ecplist?.value ?: 0L))

public actual fun fsRtlInitializeFileLock(filelock: COpaquePointer?, completelockirproutine: PcompleteLockIrpRoutine, unlockroutine: PunlockRoutine) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlInitializeFileLock((filelock?.value ?: 0L), 0L, 0L)
}

public actual fun fsRtlInitializeLargeMcb(mcb: COpaquePointer?, pooltype: PoolType) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlInitializeLargeMcb((mcb?.value ?: 0L), pooltype)
}

public actual fun fsRtlInitializeMcb(mcb: COpaquePointer?, pooltype: PoolType) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlInitializeMcb((mcb?.value ?: 0L), pooltype)
}

public actual fun fsRtlInitializeOplock(oplock: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlInitializeOplock((oplock?.value ?: 0L))
}

public actual fun fsRtlInitializeTunnelCache(cache: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlInitializeTunnelCache((cache?.value ?: 0L))
}

public actual fun fsRtlInsertExtraCreateParameter(ecplist: COpaquePointer?, ecpcontext: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlInsertExtraCreateParameter((ecplist?.value ?: 0L), (ecpcontext?.value ?: 0L))

public actual fun fsRtlInsertPerFileContext(perfilecontextpointer: COpaquePointer?, ptr: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlInsertPerFileContext((perfilecontextpointer?.value ?: 0L), (ptr?.value ?: 0L))

public actual fun fsRtlInsertPerFileObjectContext(fileobject: COpaquePointer?, ptr: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlInsertPerFileObjectContext((fileobject?.value ?: 0L), (ptr?.value ?: 0L))

public actual fun fsRtlInsertPerStreamContext(perstreamcontext: COpaquePointer?, ptr: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlInsertPerStreamContext((perstreamcontext?.value ?: 0L), (ptr?.value ?: 0L))

public actual fun fsRtlIs32BitProcess(process: Peprocess): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlIs32BitProcess(process)

public actual fun fsRtlIsDaxVolume(fileobject: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlIsDaxVolume((fileobject?.value ?: 0L))

public actual fun fsRtlIsDbcsInExpression(expression: COpaquePointer?, name: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlIsDbcsInExpression((expression?.value ?: 0L), (name?.value ?: 0L))

public actual fun fsRtlIsEcpAcknowledged(ecpcontext: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlIsEcpAcknowledged((ecpcontext?.value ?: 0L))

public actual fun fsRtlIsEcpFromUserMode(ecpcontext: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlIsEcpFromUserMode((ecpcontext?.value ?: 0L))

public actual fun fsRtlIsExtentDangling(startpage: UInt, numberofpages: UInt, flags: UInt): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlIsExtentDangling(startpage.toInt(), numberofpages.toInt(), flags.toInt()).toUInt()

public actual fun fsRtlIsFatDbcsLegal(dbcsname: io.github.kotlinmania.windowssys.windows.win32.system.kernel.String, wildcardspermissible: Boolean, pathnamepermissible: Boolean, leadingbackslashpermissible: Boolean): Boolean =
    false

public actual fun fsRtlIsHpfsDbcsLegal(dbcsname: io.github.kotlinmania.windowssys.windows.win32.system.kernel.String, wildcardspermissible: Boolean, pathnamepermissible: Boolean, leadingbackslashpermissible: Boolean): Boolean =
    false

public actual fun fsRtlIsMobileOS(): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlIsMobileOS()

public actual fun fsRtlIsNameInExpression(expression: COpaquePointer?, name: COpaquePointer?, ignorecase: Boolean, upcasetable: Pcwstr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlIsNameInExpression((expression?.value ?: 0L), (name?.value ?: 0L), ignorecase, (upcasetable?.value ?: 0L))

public actual fun fsRtlIsNameInUnUpcasedExpression(expression: COpaquePointer?, name: COpaquePointer?, ignorecase: Boolean, upcasetable: Pcwstr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlIsNameInUnUpcasedExpression((expression?.value ?: 0L), (name?.value ?: 0L), ignorecase, (upcasetable?.value ?: 0L))

public actual fun fsRtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag: UInt): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag.toInt())

public actual fun fsRtlIsNtstatusExpected(exception: Ntstatus): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlIsNtstatusExpected(exception)

public actual fun fsRtlIsPagingFile(fileobject: COpaquePointer?): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlIsPagingFile((fileobject?.value ?: 0L)).toUInt()

public actual fun fsRtlIsSystemPagingFile(fileobject: COpaquePointer?): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlIsSystemPagingFile((fileobject?.value ?: 0L)).toUInt()

public actual fun fsRtlIssueDeviceIoControl(deviceobject: COpaquePointer?, ioctl: UInt, flags: UByte, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt, iosbinformation: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlIssueDeviceIoControl((deviceobject?.value ?: 0L), ioctl.toInt(), flags.toByte(), (inputbuffer?.value ?: 0L), inputbufferlength.toInt(), (outputbuffer?.value ?: 0L), outputbufferlength.toInt(), (iosbinformation?.value ?: 0L))

public actual fun fsRtlKernelFsControlFile(fileobject: COpaquePointer?, fscontrolcode: UInt, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt, retoutputbuffersize: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlKernelFsControlFile((fileobject?.value ?: 0L), fscontrolcode.toInt(), (inputbuffer?.value ?: 0L), inputbufferlength.toInt(), (outputbuffer?.value ?: 0L), outputbufferlength.toInt(), (retoutputbuffersize?.value ?: 0L))

public actual fun fsRtlLogCcFlushError(filename: COpaquePointer?, deviceobject: COpaquePointer?, sectionobjectpointer: COpaquePointer?, flusherror: Ntstatus, flags: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlLogCcFlushError((filename?.value ?: 0L), (deviceobject?.value ?: 0L), (sectionobjectpointer?.value ?: 0L), flusherror, flags.toInt())

public actual fun fsRtlLookupBaseMcbEntry(mcb: COpaquePointer?, vbn: Long, lbn: COpaquePointer?, sectorcountfromlbn: COpaquePointer?, startinglbn: COpaquePointer?, sectorcountfromstartinglbn: COpaquePointer?, index: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlLookupBaseMcbEntry((mcb?.value ?: 0L), vbn, (lbn?.value ?: 0L), (sectorcountfromlbn?.value ?: 0L), (startinglbn?.value ?: 0L), (sectorcountfromstartinglbn?.value ?: 0L), (index?.value ?: 0L))

public actual fun fsRtlLookupLargeMcbEntry(mcb: COpaquePointer?, vbn: Long, lbn: COpaquePointer?, sectorcountfromlbn: COpaquePointer?, startinglbn: COpaquePointer?, sectorcountfromstartinglbn: COpaquePointer?, index: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlLookupLargeMcbEntry((mcb?.value ?: 0L), vbn, (lbn?.value ?: 0L), (sectorcountfromlbn?.value ?: 0L), (startinglbn?.value ?: 0L), (sectorcountfromstartinglbn?.value ?: 0L), (index?.value ?: 0L))

public actual fun fsRtlLookupLastBaseMcbEntry(mcb: COpaquePointer?, vbn: COpaquePointer?, lbn: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlLookupLastBaseMcbEntry((mcb?.value ?: 0L), (vbn?.value ?: 0L), (lbn?.value ?: 0L))

public actual fun fsRtlLookupLastBaseMcbEntryAndIndex(opaquemcb: COpaquePointer?, largevbn: COpaquePointer?, largelbn: COpaquePointer?, index: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlLookupLastBaseMcbEntryAndIndex((opaquemcb?.value ?: 0L), (largevbn?.value ?: 0L), (largelbn?.value ?: 0L), (index?.value ?: 0L))

public actual fun fsRtlLookupLastLargeMcbEntry(mcb: COpaquePointer?, vbn: COpaquePointer?, lbn: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlLookupLastLargeMcbEntry((mcb?.value ?: 0L), (vbn?.value ?: 0L), (lbn?.value ?: 0L))

public actual fun fsRtlLookupLastLargeMcbEntryAndIndex(opaquemcb: COpaquePointer?, largevbn: COpaquePointer?, largelbn: COpaquePointer?, index: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlLookupLastLargeMcbEntryAndIndex((opaquemcb?.value ?: 0L), (largevbn?.value ?: 0L), (largelbn?.value ?: 0L), (index?.value ?: 0L))

public actual fun fsRtlLookupLastMcbEntry(mcb: COpaquePointer?, vbn: COpaquePointer?, lbn: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlLookupLastMcbEntry((mcb?.value ?: 0L), (vbn?.value ?: 0L), (lbn?.value ?: 0L))

public actual fun fsRtlLookupMcbEntry(mcb: COpaquePointer?, vbn: UInt, lbn: COpaquePointer?, sectorcount: COpaquePointer?, index: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlLookupMcbEntry((mcb?.value ?: 0L), vbn.toInt(), (lbn?.value ?: 0L), (sectorcount?.value ?: 0L), (index?.value ?: 0L))

public actual fun fsRtlLookupPerFileContext(perfilecontextpointer: COpaquePointer?, ownerid: COpaquePointer?, instanceid: COpaquePointer?): COpaquePointer? =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlLookupPerFileContext((perfilecontextpointer?.value ?: 0L), (ownerid?.value ?: 0L), (instanceid?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fsRtlLookupPerFileObjectContext(fileobject: COpaquePointer?, ownerid: COpaquePointer?, instanceid: COpaquePointer?): COpaquePointer? =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlLookupPerFileObjectContext((fileobject?.value ?: 0L), (ownerid?.value ?: 0L), (instanceid?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fsRtlLookupPerStreamContextInternal(streamcontext: COpaquePointer?, ownerid: COpaquePointer?, instanceid: COpaquePointer?): COpaquePointer? =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlLookupPerStreamContextInternal((streamcontext?.value ?: 0L), (ownerid?.value ?: 0L), (instanceid?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fsRtlMdlReadCompleteDev(fileobject: COpaquePointer?, mdlchain: COpaquePointer?, deviceobject: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlMdlReadCompleteDev((fileobject?.value ?: 0L), (mdlchain?.value ?: 0L), (deviceobject?.value ?: 0L))

public actual fun fsRtlMdlReadDev(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, lockkey: UInt, mdlchain: COpaquePointer?, iostatus: COpaquePointer?, deviceobject: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlMdlReadDev((fileobject?.value ?: 0L), (fileoffset?.value ?: 0L), length.toInt(), lockkey.toInt(), (mdlchain?.value ?: 0L), (iostatus?.value ?: 0L), (deviceobject?.value ?: 0L))

public actual fun fsRtlMdlReadEx(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, lockkey: UInt, mdlchain: COpaquePointer?, iostatus: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlMdlReadEx((fileobject?.value ?: 0L), (fileoffset?.value ?: 0L), length.toInt(), lockkey.toInt(), (mdlchain?.value ?: 0L), (iostatus?.value ?: 0L))

public actual fun fsRtlMdlWriteCompleteDev(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, mdlchain: COpaquePointer?, deviceobject: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlMdlWriteCompleteDev((fileobject?.value ?: 0L), (fileoffset?.value ?: 0L), (mdlchain?.value ?: 0L), (deviceobject?.value ?: 0L))

public actual fun fsRtlMupGetProviderIdFromName(pprovidername: COpaquePointer?, pproviderid: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlMupGetProviderIdFromName((pprovidername?.value ?: 0L), (pproviderid?.value ?: 0L))

public actual fun fsRtlMupGetProviderInfoFromFileObject(pfileobject: COpaquePointer?, level: UInt, pbuffer: COpaquePointer?, pbuffersize: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlMupGetProviderInfoFromFileObject((pfileobject?.value ?: 0L), level.toInt(), (pbuffer?.value ?: 0L), (pbuffersize?.value ?: 0L))

public actual fun fsRtlNormalizeNtstatus(exception: Ntstatus, genericexception: Ntstatus): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlNormalizeNtstatus(exception, genericexception)

public actual fun fsRtlNotifyCleanup(notifysync: PnotifySync, notifylist: COpaquePointer?, fscontext: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlNotifyCleanup(notifysync, (notifylist?.value ?: 0L), (fscontext?.value ?: 0L))
}

public actual fun fsRtlNotifyCleanupAll(notifysync: PnotifySync, notifylist: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlNotifyCleanupAll(notifysync, (notifylist?.value ?: 0L))
}

public actual fun fsRtlNotifyFilterChangeDirectory(notifysync: PnotifySync, notifylist: COpaquePointer?, fscontext: COpaquePointer?, fulldirectoryname: COpaquePointer?, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifyirp: COpaquePointer?, traversecallback: PcheckForTraverseAccess, subjectcontext: COpaquePointer?, filtercallback: PfilterReportChange) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlNotifyFilterChangeDirectory(notifysync, (notifylist?.value ?: 0L), (fscontext?.value ?: 0L), (fulldirectoryname?.value ?: 0L), watchtree, ignorebuffer, completionfilter.toInt(), (notifyirp?.value ?: 0L), 0L, (subjectcontext?.value ?: 0L), 0L)
}

public actual fun fsRtlNotifyFilterReportChange(notifysync: PnotifySync, notifylist: COpaquePointer?, fulltargetname: COpaquePointer?, targetnameoffset: UShort, streamname: COpaquePointer?, normalizedparentname: COpaquePointer?, filtermatch: UInt, action: UInt, targetcontext: COpaquePointer?, filtercontext: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlNotifyFilterReportChange(notifysync, (notifylist?.value ?: 0L), (fulltargetname?.value ?: 0L), targetnameoffset.toShort(), (streamname?.value ?: 0L), (normalizedparentname?.value ?: 0L), filtermatch.toInt(), action.toInt(), (targetcontext?.value ?: 0L), (filtercontext?.value ?: 0L))
}

public actual fun fsRtlNotifyFullChangeDirectory(notifysync: PnotifySync, notifylist: COpaquePointer?, fscontext: COpaquePointer?, fulldirectoryname: COpaquePointer?, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifyirp: COpaquePointer?, traversecallback: PcheckForTraverseAccess, subjectcontext: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlNotifyFullChangeDirectory(notifysync, (notifylist?.value ?: 0L), (fscontext?.value ?: 0L), (fulldirectoryname?.value ?: 0L), watchtree, ignorebuffer, completionfilter.toInt(), (notifyirp?.value ?: 0L), 0L, (subjectcontext?.value ?: 0L))
}

public actual fun fsRtlNotifyFullReportChange(notifysync: PnotifySync, notifylist: COpaquePointer?, fulltargetname: COpaquePointer?, targetnameoffset: UShort, streamname: COpaquePointer?, normalizedparentname: COpaquePointer?, filtermatch: UInt, action: UInt, targetcontext: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlNotifyFullReportChange(notifysync, (notifylist?.value ?: 0L), (fulltargetname?.value ?: 0L), targetnameoffset.toShort(), (streamname?.value ?: 0L), (normalizedparentname?.value ?: 0L), filtermatch.toInt(), action.toInt(), (targetcontext?.value ?: 0L))
}

public actual fun fsRtlNotifyInitializeSync(notifysync: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlNotifyInitializeSync((notifysync?.value ?: 0L))
}

public actual fun fsRtlNotifyUninitializeSync(notifysync: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlNotifyUninitializeSync((notifysync?.value ?: 0L))
}

public actual fun fsRtlNotifyVolumeEvent(fileobject: COpaquePointer?, eventcode: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlNotifyVolumeEvent((fileobject?.value ?: 0L), eventcode.toInt())

public actual fun fsRtlNotifyVolumeEventEx(fileobject: COpaquePointer?, eventcode: UInt, event: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlNotifyVolumeEventEx((fileobject?.value ?: 0L), eventcode.toInt(), (event?.value ?: 0L))

public actual fun fsRtlNumberOfRunsInBaseMcb(mcb: COpaquePointer?): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlNumberOfRunsInBaseMcb((mcb?.value ?: 0L)).toUInt()

public actual fun fsRtlNumberOfRunsInLargeMcb(mcb: COpaquePointer?): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlNumberOfRunsInLargeMcb((mcb?.value ?: 0L)).toUInt()

public actual fun fsRtlNumberOfRunsInMcb(mcb: COpaquePointer?): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlNumberOfRunsInMcb((mcb?.value ?: 0L)).toUInt()

public actual fun fsRtlOplockBreakH(oplock: COpaquePointer?, irp: COpaquePointer?, flags: UInt, context: COpaquePointer?, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlOplockBreakH((oplock?.value ?: 0L), (irp?.value ?: 0L), flags.toInt(), (context?.value ?: 0L), 0L, 0L)

public actual fun fsRtlOplockBreakH2(oplock: COpaquePointer?, irp: COpaquePointer?, flags: UInt, context: COpaquePointer?, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp, grantedaccess: COpaquePointer?, shareaccess: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlOplockBreakH2((oplock?.value ?: 0L), (irp?.value ?: 0L), flags.toInt(), (context?.value ?: 0L), 0L, 0L, (grantedaccess?.value ?: 0L), (shareaccess?.value ?: 0L))

public actual fun fsRtlOplockBreakToNone(oplock: COpaquePointer?, irpsp: COpaquePointer?, irp: COpaquePointer?, context: COpaquePointer?, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlOplockBreakToNone((oplock?.value ?: 0L), (irpsp?.value ?: 0L), (irp?.value ?: 0L), (context?.value ?: 0L), 0L, 0L)

public actual fun fsRtlOplockBreakToNoneEx(oplock: COpaquePointer?, irp: COpaquePointer?, flags: UInt, context: COpaquePointer?, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlOplockBreakToNoneEx((oplock?.value ?: 0L), (irp?.value ?: 0L), flags.toInt(), (context?.value ?: 0L), 0L, 0L)

public actual fun fsRtlOplockFsctrl(oplock: COpaquePointer?, irp: COpaquePointer?, opencount: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlOplockFsctrl((oplock?.value ?: 0L), (irp?.value ?: 0L), opencount.toInt())

public actual fun fsRtlOplockFsctrlEx(oplock: COpaquePointer?, irp: COpaquePointer?, opencount: UInt, flags: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlOplockFsctrlEx((oplock?.value ?: 0L), (irp?.value ?: 0L), opencount.toInt(), flags.toInt())

public actual fun fsRtlOplockGetAnyBreakOwnerProcess(oplock: COpaquePointer?): Peprocess =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlOplockGetAnyBreakOwnerProcess((oplock?.value ?: 0L))

public actual fun fsRtlOplockIsFastIoPossible(oplock: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlOplockIsFastIoPossible((oplock?.value ?: 0L))

public actual fun fsRtlOplockIsSharedRequest(irp: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlOplockIsSharedRequest((irp?.value ?: 0L))

public actual fun fsRtlOplockKeysEqual(fo1: COpaquePointer?, fo2: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlOplockKeysEqual((fo1?.value ?: 0L), (fo2?.value ?: 0L))

public actual fun fsRtlPostPagingFileStackOverflow(context: COpaquePointer?, event: COpaquePointer?, stackoverflowroutine: PfsrtlStackOverflowRoutine) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlPostPagingFileStackOverflow((context?.value ?: 0L), (event?.value ?: 0L), 0L)
}

public actual fun fsRtlPostStackOverflow(context: COpaquePointer?, event: COpaquePointer?, stackoverflowroutine: PfsrtlStackOverflowRoutine) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlPostStackOverflow((context?.value ?: 0L), (event?.value ?: 0L), 0L)
}

public actual fun fsRtlPrepareMdlWriteDev(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, lockkey: UInt, mdlchain: COpaquePointer?, iostatus: COpaquePointer?, deviceobject: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlPrepareMdlWriteDev((fileobject?.value ?: 0L), (fileoffset?.value ?: 0L), length.toInt(), lockkey.toInt(), (mdlchain?.value ?: 0L), (iostatus?.value ?: 0L), (deviceobject?.value ?: 0L))

public actual fun fsRtlPrepareMdlWriteEx(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, lockkey: UInt, mdlchain: COpaquePointer?, iostatus: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlPrepareMdlWriteEx((fileobject?.value ?: 0L), (fileoffset?.value ?: 0L), length.toInt(), lockkey.toInt(), (mdlchain?.value ?: 0L), (iostatus?.value ?: 0L))

public actual fun fsRtlPrepareToReuseEcp(ecpcontext: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlPrepareToReuseEcp((ecpcontext?.value ?: 0L))
}

public actual fun fsRtlPrivateLock(filelock: COpaquePointer?, fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: COpaquePointer?, processid: Peprocess, key: UInt, failimmediately: Boolean, exclusivelock: Boolean, iosb: COpaquePointer?, irp: COpaquePointer?, context: COpaquePointer?, alreadysynchronized: Boolean): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlPrivateLock((filelock?.value ?: 0L), (fileobject?.value ?: 0L), (fileoffset?.value ?: 0L), (length?.value ?: 0L), processid, key.toInt(), failimmediately, exclusivelock, (iosb?.value ?: 0L), (irp?.value ?: 0L), (context?.value ?: 0L), alreadysynchronized)

public actual fun fsRtlProcessFileLock(filelock: COpaquePointer?, irp: COpaquePointer?, context: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlProcessFileLock((filelock?.value ?: 0L), (irp?.value ?: 0L), (context?.value ?: 0L))

public actual fun fsRtlQueryCachedVdl(fileobject: COpaquePointer?, vdl: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlQueryCachedVdl((fileobject?.value ?: 0L), (vdl?.value ?: 0L))

public actual fun fsRtlQueryInformationFile(fileobject: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass, retfileinformationsize: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlQueryInformationFile((fileobject?.value ?: 0L), (fileinformation?.value ?: 0L), length.toInt(), fileinformationclass, (retfileinformationsize?.value ?: 0L))

public actual fun fsRtlQueryKernelEaFile(fileobject: COpaquePointer?, returnedeadata: COpaquePointer?, length: UInt, returnsingleentry: Boolean, ealist: COpaquePointer?, ealistlength: UInt, eaindex: COpaquePointer?, restartscan: Boolean, lengthreturned: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlQueryKernelEaFile((fileobject?.value ?: 0L), (returnedeadata?.value ?: 0L), length.toInt(), returnsingleentry, (ealist?.value ?: 0L), ealistlength.toInt(), (eaindex?.value ?: 0L), restartscan, (lengthreturned?.value ?: 0L))

public actual fun fsRtlQueryMaximumVirtualDiskNestingLevel(): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlQueryMaximumVirtualDiskNestingLevel().toUInt()

public actual fun fsRtlRegisterFileSystemFilterCallbacks(filterdriverobject: COpaquePointer?, callbacks: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlRegisterFileSystemFilterCallbacks((filterdriverobject?.value ?: 0L), (callbacks?.value ?: 0L))

public actual fun fsRtlRegisterUncProvider(muphandle: COpaquePointer?, redirectordevicename: COpaquePointer?, mailslotssupported: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlRegisterUncProvider((muphandle?.value ?: 0L), (redirectordevicename?.value ?: 0L), mailslotssupported)

public actual fun fsRtlRegisterUncProviderEx(muphandle: COpaquePointer?, redirdevname: COpaquePointer?, deviceobject: COpaquePointer?, flags: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlRegisterUncProviderEx((muphandle?.value ?: 0L), (redirdevname?.value ?: 0L), (deviceobject?.value ?: 0L), flags.toInt())

public actual fun fsRtlRegisterUncProviderEx2(redirdevname: COpaquePointer?, deviceobject: COpaquePointer?, registration: COpaquePointer?, muphandle: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlRegisterUncProviderEx2((redirdevname?.value ?: 0L), (deviceobject?.value ?: 0L), (registration?.value ?: 0L), (muphandle?.value ?: 0L))

public actual fun fsRtlReleaseFile(fileobject: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlReleaseFile((fileobject?.value ?: 0L))
}

public actual fun fsRtlRemoveBaseMcbEntry(mcb: COpaquePointer?, vbn: Long, sectorcount: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlRemoveBaseMcbEntry((mcb?.value ?: 0L), vbn, sectorcount)

public actual fun fsRtlRemoveDotsFromPath(originalstring: Pwstr, pathlength: UShort, newlength: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlRemoveDotsFromPath((originalstring?.value ?: 0L), pathlength.toShort(), (newlength?.value ?: 0L))

public actual fun fsRtlRemoveExtraCreateParameter(ecplist: COpaquePointer?, ecptype: COpaquePointer?, ecpcontext: COpaquePointer?, ecpcontextsize: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlRemoveExtraCreateParameter((ecplist?.value ?: 0L), (ecptype?.value ?: 0L), (ecpcontext?.value ?: 0L), (ecpcontextsize?.value ?: 0L))

public actual fun fsRtlRemoveLargeMcbEntry(mcb: COpaquePointer?, vbn: Long, sectorcount: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlRemoveLargeMcbEntry((mcb?.value ?: 0L), vbn, sectorcount)
}

public actual fun fsRtlRemoveMcbEntry(mcb: COpaquePointer?, vbn: UInt, sectorcount: UInt) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlRemoveMcbEntry((mcb?.value ?: 0L), vbn.toInt(), sectorcount.toInt())
}

public actual fun fsRtlRemovePerFileContext(perfilecontextpointer: COpaquePointer?, ownerid: COpaquePointer?, instanceid: COpaquePointer?): COpaquePointer? =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlRemovePerFileContext((perfilecontextpointer?.value ?: 0L), (ownerid?.value ?: 0L), (instanceid?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fsRtlRemovePerFileObjectContext(fileobject: COpaquePointer?, ownerid: COpaquePointer?, instanceid: COpaquePointer?): COpaquePointer? =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlRemovePerFileObjectContext((fileobject?.value ?: 0L), (ownerid?.value ?: 0L), (instanceid?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fsRtlRemovePerStreamContext(streamcontext: COpaquePointer?, ownerid: COpaquePointer?, instanceid: COpaquePointer?): COpaquePointer? =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlRemovePerStreamContext((streamcontext?.value ?: 0L), (ownerid?.value ?: 0L), (instanceid?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fsRtlResetBaseMcb(mcb: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlResetBaseMcb((mcb?.value ?: 0L))
}

public actual fun fsRtlResetLargeMcb(mcb: COpaquePointer?, selfsynchronized: Boolean) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlResetLargeMcb((mcb?.value ?: 0L), selfsynchronized)
}

public actual fun fsRtlSetDriverBacking(driverobj: COpaquePointer?, flags: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlSetDriverBacking((driverobj?.value ?: 0L), flags.toInt())

public actual fun fsRtlSetEcpListIntoIrp(irp: COpaquePointer?, ecplist: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlSetEcpListIntoIrp((irp?.value ?: 0L), (ecplist?.value ?: 0L))

public actual fun fsRtlSetKernelEaFile(fileobject: COpaquePointer?, eabuffer: COpaquePointer?, length: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlSetKernelEaFile((fileobject?.value ?: 0L), (eabuffer?.value ?: 0L), length.toInt())

public actual fun fsRtlSplitBaseMcb(mcb: COpaquePointer?, vbn: Long, amount: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlSplitBaseMcb((mcb?.value ?: 0L), vbn, amount)

public actual fun fsRtlSplitLargeMcb(mcb: COpaquePointer?, vbn: Long, amount: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlSplitLargeMcb((mcb?.value ?: 0L), vbn, amount)

public actual fun fsRtlTeardownPerFileContexts(perfilecontextpointer: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlTeardownPerFileContexts((perfilecontextpointer?.value ?: 0L))
}

public actual fun fsRtlTeardownPerStreamContexts(advancedheader: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlTeardownPerStreamContexts((advancedheader?.value ?: 0L))
}

public actual fun fsRtlTruncateBaseMcb(mcb: COpaquePointer?, vbn: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlTruncateBaseMcb((mcb?.value ?: 0L), vbn)
}

public actual fun fsRtlTruncateLargeMcb(mcb: COpaquePointer?, vbn: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlTruncateLargeMcb((mcb?.value ?: 0L), vbn)
}

public actual fun fsRtlTruncateMcb(mcb: COpaquePointer?, vbn: UInt) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlTruncateMcb((mcb?.value ?: 0L), vbn.toInt())
}

public actual fun fsRtlUninitializeBaseMcb(mcb: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlUninitializeBaseMcb((mcb?.value ?: 0L))
}

public actual fun fsRtlUninitializeFileLock(filelock: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlUninitializeFileLock((filelock?.value ?: 0L))
}

public actual fun fsRtlUninitializeLargeMcb(mcb: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlUninitializeLargeMcb((mcb?.value ?: 0L))
}

public actual fun fsRtlUninitializeMcb(mcb: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlUninitializeMcb((mcb?.value ?: 0L))
}

public actual fun fsRtlUninitializeOplock(oplock: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlUninitializeOplock((oplock?.value ?: 0L))
}

public actual fun fsRtlUpdateDiskCounters(bytesread: ULong, byteswritten: ULong) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlUpdateDiskCounters(bytesread.toLong(), byteswritten.toLong())
}

public actual fun fsRtlUpperOplockFsctrl(oplock: COpaquePointer?, irp: COpaquePointer?, opencount: UInt, loweroplockstate: UInt, flags: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlUpperOplockFsctrl((oplock?.value ?: 0L), (irp?.value ?: 0L), opencount.toInt(), loweroplockstate.toInt(), flags.toInt())

public actual fun fsRtlValidateReparsePointBuffer(bufferlength: UInt, reparsebuffer: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlValidateReparsePointBuffer(bufferlength.toInt(), (reparsebuffer?.value ?: 0L))

public actual fun fsRtlVolumeDeviceToCorrelationId(volumedeviceobject: COpaquePointer?, guid: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_fsRtlVolumeDeviceToCorrelationId((volumedeviceobject?.value ?: 0L), (guid?.value ?: 0L))

public actual fun getSecurityUserInfo(logonid: COpaquePointer?, flags: UInt, userinformation: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_getSecurityUserInfo((logonid?.value ?: 0L), flags.toInt(), (userinformation?.value ?: 0L))

public actual fun ioAcquireVpbSpinLock(irql: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioAcquireVpbSpinLock((irql?.value ?: 0L))
}

public actual fun ioApplyPriorityInfoThread(inputpriorityinfo: COpaquePointer?, outputpriorityinfo: COpaquePointer?, thread: Pethread): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioApplyPriorityInfoThread((inputpriorityinfo?.value ?: 0L), (outputpriorityinfo?.value ?: 0L), thread)

public actual fun ioCheckDesiredAccess(desiredaccess: COpaquePointer?, grantedaccess: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioCheckDesiredAccess((desiredaccess?.value ?: 0L), grantedaccess.toInt())

public actual fun ioCheckEaBufferValidity(eabuffer: COpaquePointer?, ealength: UInt, erroroffset: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioCheckEaBufferValidity((eabuffer?.value ?: 0L), ealength.toInt(), (erroroffset?.value ?: 0L))

public actual fun ioCheckFunctionAccess(grantedaccess: UInt, majorfunction: UByte, minorfunction: UByte, iocontrolcode: UInt, arg1: COpaquePointer?, arg2: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioCheckFunctionAccess(grantedaccess.toInt(), majorfunction.toByte(), minorfunction.toByte(), iocontrolcode.toInt(), (arg1?.value ?: 0L), (arg2?.value ?: 0L))

public actual fun ioCheckQuerySetFileInformation(fileinformationclass: FileInformationClass, length: UInt, setoperation: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioCheckQuerySetFileInformation(fileinformationclass, length.toInt(), setoperation)

public actual fun ioCheckQuerySetVolumeInformation(fsinformationclass: FsInformationClass, length: UInt, setoperation: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioCheckQuerySetVolumeInformation(fsinformationclass, length.toInt(), setoperation)

public actual fun ioCheckQuotaBufferValidity(quotabuffer: COpaquePointer?, quotalength: UInt, erroroffset: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioCheckQuotaBufferValidity((quotabuffer?.value ?: 0L), quotalength.toInt(), (erroroffset?.value ?: 0L))

public actual fun ioClearFsTrackOffsetState(irp: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioClearFsTrackOffsetState((irp?.value ?: 0L))

public actual fun ioCreateStreamFileObject(fileobject: COpaquePointer?, deviceobject: COpaquePointer?): COpaquePointer? =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioCreateStreamFileObject((fileobject?.value ?: 0L), (deviceobject?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ioCreateStreamFileObjectEx(fileobject: COpaquePointer?, deviceobject: COpaquePointer?, filehandle: COpaquePointer?): COpaquePointer? =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioCreateStreamFileObjectEx((fileobject?.value ?: 0L), (deviceobject?.value ?: 0L), (filehandle?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ioCreateStreamFileObjectEx2(createoptions: COpaquePointer?, fileobject: COpaquePointer?, deviceobject: COpaquePointer?, streamfileobject: COpaquePointer?, filehandle: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioCreateStreamFileObjectEx2((createoptions?.value ?: 0L), (fileobject?.value ?: 0L), (deviceobject?.value ?: 0L), (streamfileobject?.value ?: 0L), (filehandle?.value ?: 0L))

public actual fun ioCreateStreamFileObjectLite(fileobject: COpaquePointer?, deviceobject: COpaquePointer?): COpaquePointer? =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioCreateStreamFileObjectLite((fileobject?.value ?: 0L), (deviceobject?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ioEnumerateDeviceObjectList(driverobject: COpaquePointer?, deviceobjectlist: COpaquePointer?, deviceobjectlistsize: UInt, actualnumberdeviceobjects: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioEnumerateDeviceObjectList((driverobject?.value ?: 0L), (deviceobjectlist?.value ?: 0L), deviceobjectlistsize.toInt(), (actualnumberdeviceobjects?.value ?: 0L))

public actual fun ioEnumerateRegisteredFiltersList(driverobjectlist: COpaquePointer?, driverobjectlistsize: UInt, actualnumberdriverobjects: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioEnumerateRegisteredFiltersList((driverobjectlist?.value ?: 0L), driverobjectlistsize.toInt(), (actualnumberdriverobjects?.value ?: 0L))

public actual fun ioFastQueryNetworkAttributes(objectattributes: COpaquePointer?, desiredaccess: UInt, openoptions: UInt, iostatus: COpaquePointer?, buffer: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioFastQueryNetworkAttributes((objectattributes?.value ?: 0L), desiredaccess.toInt(), openoptions.toInt(), (iostatus?.value ?: 0L), (buffer?.value ?: 0L))

public actual fun ioGetAttachedDevice(deviceobject: COpaquePointer?): COpaquePointer? =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioGetAttachedDevice((deviceobject?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ioGetBaseFileSystemDeviceObject(fileobject: COpaquePointer?): COpaquePointer? =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioGetBaseFileSystemDeviceObject((fileobject?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ioGetDeviceAttachmentBaseRef(deviceobject: COpaquePointer?): COpaquePointer? =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioGetDeviceAttachmentBaseRef((deviceobject?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ioGetDeviceToVerify(thread: Pethread): COpaquePointer? =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioGetDeviceToVerify(thread).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ioGetDiskDeviceObject(filesystemdeviceobject: COpaquePointer?, diskdeviceobject: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioGetDiskDeviceObject((filesystemdeviceobject?.value ?: 0L), (diskdeviceobject?.value ?: 0L))

public actual fun ioGetFsTrackOffsetState(irp: COpaquePointer?, retfstrackoffsetblob: COpaquePointer?, rettrackedoffset: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioGetFsTrackOffsetState((irp?.value ?: 0L), (retfstrackoffsetblob?.value ?: 0L), (rettrackedoffset?.value ?: 0L))

public actual fun ioGetLowerDeviceObject(deviceobject: COpaquePointer?): COpaquePointer? =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioGetLowerDeviceObject((deviceobject?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ioGetOplockKeyContext(fileobject: COpaquePointer?): COpaquePointer? =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioGetOplockKeyContext((fileobject?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ioGetOplockKeyContextEx(fileobject: COpaquePointer?): COpaquePointer? =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioGetOplockKeyContextEx((fileobject?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ioGetRequestorProcess(irp: COpaquePointer?): Peprocess =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioGetRequestorProcess((irp?.value ?: 0L))

public actual fun ioGetRequestorProcessId(irp: COpaquePointer?): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioGetRequestorProcessId((irp?.value ?: 0L)).toUInt()

public actual fun ioGetRequestorSessionId(irp: COpaquePointer?, psessionid: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioGetRequestorSessionId((irp?.value ?: 0L), (psessionid?.value ?: 0L))

public actual fun ioIrpHasFsTrackOffsetExtensionType(irp: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioIrpHasFsTrackOffsetExtensionType((irp?.value ?: 0L))

public actual fun ioIsOperationSynchronous(irp: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioIsOperationSynchronous((irp?.value ?: 0L))

public actual fun ioIsSystemThread(thread: Pethread): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioIsSystemThread(thread)

public actual fun ioIsValidNameGraftingBuffer(irp: COpaquePointer?, reparsebuffer: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioIsValidNameGraftingBuffer((irp?.value ?: 0L), (reparsebuffer?.value ?: 0L))

public actual fun ioPageRead(fileobject: COpaquePointer?, memorydescriptorlist: COpaquePointer?, startingoffset: COpaquePointer?, event: COpaquePointer?, iostatusblock: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioPageRead((fileobject?.value ?: 0L), (memorydescriptorlist?.value ?: 0L), (startingoffset?.value ?: 0L), (event?.value ?: 0L), (iostatusblock?.value ?: 0L))

public actual fun ioQueryFileDosDeviceName(fileobject: COpaquePointer?, objectnameinformation: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioQueryFileDosDeviceName((fileobject?.value ?: 0L), (objectnameinformation?.value ?: 0L))

public actual fun ioQueryFileInformation(fileobject: COpaquePointer?, fileinformationclass: FileInformationClass, length: UInt, fileinformation: COpaquePointer?, returnedlength: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioQueryFileInformation((fileobject?.value ?: 0L), fileinformationclass, length.toInt(), (fileinformation?.value ?: 0L), (returnedlength?.value ?: 0L))

public actual fun ioQueryVolumeInformation(fileobject: COpaquePointer?, fsinformationclass: FsInformationClass, length: UInt, fsinformation: COpaquePointer?, returnedlength: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioQueryVolumeInformation((fileobject?.value ?: 0L), fsinformationclass, length.toInt(), (fsinformation?.value ?: 0L), (returnedlength?.value ?: 0L))

public actual fun ioQueueThreadIrp(irp: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioQueueThreadIrp((irp?.value ?: 0L))
}

public actual fun ioRegisterFileSystem(deviceobject: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioRegisterFileSystem((deviceobject?.value ?: 0L))
}

public actual fun ioRegisterFsRegistrationChange(driverobject: COpaquePointer?, drivernotificationroutine: DriverFsNotification): Ntstatus =
    0

public actual fun ioRegisterFsRegistrationChangeMountAware(driverobject: COpaquePointer?, drivernotificationroutine: DriverFsNotification, synchronizewithmounts: Boolean): Ntstatus =
    0

public actual fun ioReleaseVpbSpinLock(irql: UByte) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioReleaseVpbSpinLock(irql.toByte())
}

public actual fun ioReplaceFileObjectName(fileobject: COpaquePointer?, newfilename: Pcwstr, filenamelength: UShort): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioReplaceFileObjectName((fileobject?.value ?: 0L), (newfilename?.value ?: 0L), filenamelength.toShort())

public actual fun ioRequestDeviceRemovalForReset(physicaldeviceobject: COpaquePointer?, flags: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioRequestDeviceRemovalForReset((physicaldeviceobject?.value ?: 0L), flags.toInt())

public actual fun ioRetrievePriorityInfo(irp: COpaquePointer?, fileobject: COpaquePointer?, thread: Pethread, priorityinfo: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioRetrievePriorityInfo((irp?.value ?: 0L), (fileobject?.value ?: 0L), thread, (priorityinfo?.value ?: 0L))

public actual fun ioSetDeviceToVerify(thread: Pethread, deviceobject: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioSetDeviceToVerify(thread, (deviceobject?.value ?: 0L))
}

public actual fun ioSetFsTrackOffsetState(irp: COpaquePointer?, fstrackoffsetblob: COpaquePointer?, trackedoffset: Long): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioSetFsTrackOffsetState((irp?.value ?: 0L), (fstrackoffsetblob?.value ?: 0L), trackedoffset)

public actual fun ioSetInformation(fileobject: COpaquePointer?, fileinformationclass: FileInformationClass, length: UInt, fileinformation: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioSetInformation((fileobject?.value ?: 0L), fileinformationclass, length.toInt(), (fileinformation?.value ?: 0L))

public actual fun ioSynchronousPageWrite(fileobject: COpaquePointer?, memorydescriptorlist: COpaquePointer?, startingoffset: COpaquePointer?, event: COpaquePointer?, iostatusblock: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioSynchronousPageWrite((fileobject?.value ?: 0L), (memorydescriptorlist?.value ?: 0L), (startingoffset?.value ?: 0L), (event?.value ?: 0L), (iostatusblock?.value ?: 0L))

public actual fun ioThreadToProcess(thread: Pethread): Peprocess =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioThreadToProcess(thread)

public actual fun ioUnregisterFileSystem(deviceobject: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioUnregisterFileSystem((deviceobject?.value ?: 0L))
}

public actual fun ioUnregisterFsRegistrationChange(driverobject: COpaquePointer?, drivernotificationroutine: DriverFsNotification) {
}

public actual fun ioVerifyVolume(deviceobject: COpaquePointer?, allowrawmount: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ioVerifyVolume((deviceobject?.value ?: 0L), allowrawmount)

public actual fun keAcquireQueuedSpinLock(number: KspinLockQueueNumber): UByte =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_keAcquireQueuedSpinLock(number).toUByte()

public actual fun keAcquireSpinLockRaiseToSynch(spinlock: COpaquePointer?): UByte =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_keAcquireSpinLockRaiseToSynch((spinlock?.value ?: 0L)).toUByte()

public actual fun keAttachProcess(process: Prkprocess) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_keAttachProcess(process)
}

public actual fun keDetachProcess() {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_keDetachProcess()
}

public actual fun keInitializeMutant(mutant: COpaquePointer?, initialowner: Boolean) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_keInitializeMutant((mutant?.value ?: 0L), initialowner)
}

public actual fun keInitializeQueue(queue: COpaquePointer?, count: UInt) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_keInitializeQueue((queue?.value ?: 0L), count.toInt())
}

public actual fun keInsertHeadQueue(queue: COpaquePointer?, entry: COpaquePointer?): Int =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_keInsertHeadQueue((queue?.value ?: 0L), (entry?.value ?: 0L))

public actual fun keInsertQueue(queue: COpaquePointer?, entry: COpaquePointer?): Int =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_keInsertQueue((queue?.value ?: 0L), (entry?.value ?: 0L))

public actual fun keReadStateMutant(mutant: COpaquePointer?): Int =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_keReadStateMutant((mutant?.value ?: 0L))

public actual fun keReadStateQueue(queue: COpaquePointer?): Int =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_keReadStateQueue((queue?.value ?: 0L))

public actual fun keReleaseMutant(mutant: COpaquePointer?, increment: Int, abandoned: Boolean, wait: Boolean): Int =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_keReleaseMutant((mutant?.value ?: 0L), increment, abandoned, wait)

public actual fun keReleaseQueuedSpinLock(number: KspinLockQueueNumber, oldirql: UByte) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_keReleaseQueuedSpinLock(number, oldirql.toByte())
}

public actual fun keRemoveQueue(queue: COpaquePointer?, waitmode: Byte, timeout: COpaquePointer?): COpaquePointer? =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_keRemoveQueue((queue?.value ?: 0L), waitmode, (timeout?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun keRemoveQueueEx(queue: COpaquePointer?, waitmode: Byte, alertable: Boolean, timeout: COpaquePointer?, entryarray: COpaquePointer?, count: UInt): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_keRemoveQueueEx((queue?.value ?: 0L), waitmode, alertable, (timeout?.value ?: 0L), (entryarray?.value ?: 0L), count.toInt()).toUInt()

public actual fun keRundownQueue(queue: COpaquePointer?): COpaquePointer? =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_keRundownQueue((queue?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun keSetIdealProcessorThread(thread: Pkthread, processor: UByte): UByte =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_keSetIdealProcessorThread(thread, processor.toByte()).toUByte()

public actual fun keSetKernelStackSwapEnable(enable: Boolean): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_keSetKernelStackSwapEnable(enable)

public actual fun keStackAttachProcess(process: Prkprocess, apcstate: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_keStackAttachProcess(process, (apcstate?.value ?: 0L))
}

public actual fun keTryToAcquireQueuedSpinLock(number: KspinLockQueueNumber, oldirql: COpaquePointer?): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_keTryToAcquireQueuedSpinLock(number, (oldirql?.value ?: 0L)).toUInt()

public actual fun keUnstackDetachProcess(apcstate: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_keUnstackDetachProcess((apcstate?.value ?: 0L))
}

public actual fun makeSignature(phcontext: COpaquePointer?, fqop: UInt, pmessage: COpaquePointer?, messageseqno: UInt): Hresult =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_makeSignature((phcontext?.value ?: 0L), fqop.toInt(), (pmessage?.value ?: 0L), messageseqno.toInt())

public actual fun mapSecurityError(secstatus: Hresult): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_mapSecurityError(secstatus)

public actual fun mmCanFileBeTruncated(sectionpointer: COpaquePointer?, newfilesize: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_mmCanFileBeTruncated((sectionpointer?.value ?: 0L), (newfilesize?.value ?: 0L))

public actual fun mmDoesFileHaveUserWritableReferences(sectionpointer: COpaquePointer?): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_mmDoesFileHaveUserWritableReferences((sectionpointer?.value ?: 0L)).toUInt()

public actual fun mmFlushImageSection(sectionobjectpointer: COpaquePointer?, flushtype: MmflushType): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_mmFlushImageSection((sectionobjectpointer?.value ?: 0L), flushtype)

public actual fun mmForceSectionClosed(sectionobjectpointer: COpaquePointer?, delayclose: Boolean): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_mmForceSectionClosed((sectionobjectpointer?.value ?: 0L), delayclose)

public actual fun mmForceSectionClosedEx(sectionobjectpointer: COpaquePointer?, forcecloseflags: UInt): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_mmForceSectionClosedEx((sectionobjectpointer?.value ?: 0L), forcecloseflags.toInt())

public actual fun mmGetMaximumFileSectionSize(): ULong =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_mmGetMaximumFileSectionSize().toULong()

public actual fun mmIsFileSectionActive(fssectionpointer: COpaquePointer?, flags: UInt, sectionisactive: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_mmIsFileSectionActive((fssectionpointer?.value ?: 0L), flags.toInt(), (sectionisactive?.value ?: 0L))

public actual fun mmIsRecursiveIoFault(): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_mmIsRecursiveIoFault()

public actual fun mmMdlPagesAreZero(mdl: COpaquePointer?): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_mmMdlPagesAreZero((mdl?.value ?: 0L)).toUInt()

public actual fun mmPrefetchPages(numberoflists: UInt, readlists: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_mmPrefetchPages(numberoflists.toInt(), (readlists?.value ?: 0L))

public actual fun mmSetAddressRangeModified(address: COpaquePointer?, length: ULong): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_mmSetAddressRangeModified((address?.value ?: 0L), length.toLong())

public actual fun ntAccessCheckAndAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, objecttypename: COpaquePointer?, objectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, desiredaccess: UInt, genericmapping: COpaquePointer?, objectcreation: Boolean, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, generateonclose: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntAccessCheckAndAuditAlarm((subsystemname?.value ?: 0L), (handleid?.value ?: 0L), (objecttypename?.value ?: 0L), (objectname?.value ?: 0L), (securitydescriptor?.value ?: 0L), desiredaccess.toInt(), (genericmapping?.value ?: 0L), objectcreation, (grantedaccess?.value ?: 0L), (accessstatus?.value ?: 0L), (generateonclose?.value ?: 0L))

public actual fun ntAccessCheckByTypeAndAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, objecttypename: COpaquePointer?, objectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Boolean, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, generateonclose: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntAccessCheckByTypeAndAuditAlarm((subsystemname?.value ?: 0L), (handleid?.value ?: 0L), (objecttypename?.value ?: 0L), (objectname?.value ?: 0L), (securitydescriptor?.value ?: 0L), (principalselfsid?.value ?: 0L), desiredaccess.toInt(), audittype, flags.toInt(), (objecttypelist?.value ?: 0L), objecttypelistlength.toInt(), (genericmapping?.value ?: 0L), objectcreation, (grantedaccess?.value ?: 0L), (accessstatus?.value ?: 0L), (generateonclose?.value ?: 0L))

public actual fun ntAccessCheckByTypeResultListAndAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, objecttypename: COpaquePointer?, objectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Boolean, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, generateonclose: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntAccessCheckByTypeResultListAndAuditAlarm((subsystemname?.value ?: 0L), (handleid?.value ?: 0L), (objecttypename?.value ?: 0L), (objectname?.value ?: 0L), (securitydescriptor?.value ?: 0L), (principalselfsid?.value ?: 0L), desiredaccess.toInt(), audittype, flags.toInt(), (objecttypelist?.value ?: 0L), objecttypelistlength.toInt(), (genericmapping?.value ?: 0L), objectcreation, (grantedaccess?.value ?: 0L), (accessstatus?.value ?: 0L), (generateonclose?.value ?: 0L))

public actual fun ntAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname: COpaquePointer?, handleid: COpaquePointer?, clienttoken: Handle, objecttypename: COpaquePointer?, objectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Boolean, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, generateonclose: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntAccessCheckByTypeResultListAndAuditAlarmByHandle((subsystemname?.value ?: 0L), (handleid?.value ?: 0L), (clienttoken?.value ?: 0L), (objecttypename?.value ?: 0L), (objectname?.value ?: 0L), (securitydescriptor?.value ?: 0L), (principalselfsid?.value ?: 0L), desiredaccess.toInt(), audittype, flags.toInt(), (objecttypelist?.value ?: 0L), objecttypelistlength.toInt(), (genericmapping?.value ?: 0L), objectcreation, (grantedaccess?.value ?: 0L), (accessstatus?.value ?: 0L), (generateonclose?.value ?: 0L))

public actual fun ntAdjustGroupsToken(tokenhandle: Handle, resettodefault: Boolean, newstate: COpaquePointer?, bufferlength: UInt, previousstate: COpaquePointer?, returnlength: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntAdjustGroupsToken((tokenhandle?.value ?: 0L), resettodefault, (newstate?.value ?: 0L), bufferlength.toInt(), (previousstate?.value ?: 0L), (returnlength?.value ?: 0L))

public actual fun ntAdjustPrivilegesToken(tokenhandle: Handle, disableallprivileges: Boolean, newstate: COpaquePointer?, bufferlength: UInt, previousstate: COpaquePointer?, returnlength: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntAdjustPrivilegesToken((tokenhandle?.value ?: 0L), disableallprivileges, (newstate?.value ?: 0L), bufferlength.toInt(), (previousstate?.value ?: 0L), (returnlength?.value ?: 0L))

public actual fun ntAllocateVirtualMemory(processhandle: Handle, baseaddress: COpaquePointer?, zerobits: ULong, regionsize: COpaquePointer?, allocationtype: UInt, protect: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntAllocateVirtualMemory((processhandle?.value ?: 0L), (baseaddress?.value ?: 0L), zerobits.toLong(), (regionsize?.value ?: 0L), allocationtype.toInt(), protect.toInt())

public actual fun ntAllocateVirtualMemoryEx(processhandle: Handle, baseaddress: COpaquePointer?, regionsize: COpaquePointer?, allocationtype: UInt, pageprotection: UInt, extendedparameters: COpaquePointer?, extendedparametercount: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntAllocateVirtualMemoryEx((processhandle?.value ?: 0L), (baseaddress?.value ?: 0L), (regionsize?.value ?: 0L), allocationtype.toInt(), pageprotection.toInt(), (extendedparameters?.value ?: 0L), extendedparametercount.toInt())

public actual fun ntCancelIoFileEx(filehandle: Handle, iorequesttocancel: COpaquePointer?, iostatusblock: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntCancelIoFileEx((filehandle?.value ?: 0L), (iorequesttocancel?.value ?: 0L), (iostatusblock?.value ?: 0L))

public actual fun ntCloseObjectAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, generateonclose: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntCloseObjectAuditAlarm((subsystemname?.value ?: 0L), (handleid?.value ?: 0L), generateonclose)

public actual fun ntCreateDirectoryObject(directoryhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntCreateDirectoryObject((directoryhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L))

public actual fun ntCreateEvent(eventhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, eventtype: EventType, initialstate: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntCreateEvent((eventhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), eventtype, initialstate)

public actual fun ntCreateFile(filehandle: COpaquePointer?, desiredaccess: FileAccessRights, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, allocationsize: COpaquePointer?, fileattributes: FileFlagsAndAttributes, shareaccess: FileShareMode, createdisposition: NtcreatefileCreateDisposition, createoptions: NtcreatefileCreateOptions, eabuffer: COpaquePointer?, ealength: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntCreateFile((filehandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), (iostatusblock?.value ?: 0L), (allocationsize?.value ?: 0L), fileattributes.toInt(), shareaccess.toInt(), createdisposition.toInt(), createoptions.toInt(), (eabuffer?.value ?: 0L), ealength.toInt())

public actual fun ntCreateSection(sectionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, maximumsize: COpaquePointer?, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Handle): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntCreateSection((sectionhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), (maximumsize?.value ?: 0L), sectionpageprotection.toInt(), allocationattributes.toInt(), (filehandle?.value ?: 0L))

public actual fun ntCreateSectionEx(sectionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, maximumsize: COpaquePointer?, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Handle, extendedparameters: COpaquePointer?, extendedparametercount: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntCreateSectionEx((sectionhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), (maximumsize?.value ?: 0L), sectionpageprotection.toInt(), allocationattributes.toInt(), (filehandle?.value ?: 0L), (extendedparameters?.value ?: 0L), extendedparametercount.toInt())

public actual fun ntDeleteFile(objectattributes: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntDeleteFile((objectattributes?.value ?: 0L))

public actual fun ntDeleteObjectAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, generateonclose: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntDeleteObjectAuditAlarm((subsystemname?.value ?: 0L), (handleid?.value ?: 0L), generateonclose)

public actual fun ntDuplicateObject(sourceprocesshandle: Handle, sourcehandle: Handle, targetprocesshandle: Handle, targethandle: COpaquePointer?, desiredaccess: UInt, handleattributes: UInt, options: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntDuplicateObject((sourceprocesshandle?.value ?: 0L), (sourcehandle?.value ?: 0L), (targetprocesshandle?.value ?: 0L), (targethandle?.value ?: 0L), desiredaccess.toInt(), handleattributes.toInt(), options.toInt())

public actual fun ntDuplicateToken(existingtokenhandle: Handle, desiredaccess: UInt, objectattributes: COpaquePointer?, effectiveonly: Boolean, tokentype: TokenType, newtokenhandle: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntDuplicateToken((existingtokenhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), effectiveonly, tokentype, (newtokenhandle?.value ?: 0L))

public actual fun ntFilterToken(existingtokenhandle: Handle, flags: UInt, sidstodisable: COpaquePointer?, privilegestodelete: COpaquePointer?, restrictedsids: COpaquePointer?, newtokenhandle: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntFilterToken((existingtokenhandle?.value ?: 0L), flags.toInt(), (sidstodisable?.value ?: 0L), (privilegestodelete?.value ?: 0L), (restrictedsids?.value ?: 0L), (newtokenhandle?.value ?: 0L))

public actual fun ntFlushBuffersFile(filehandle: Handle, iostatusblock: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntFlushBuffersFile((filehandle?.value ?: 0L), (iostatusblock?.value ?: 0L))

public actual fun ntFlushBuffersFileEx(filehandle: Handle, flags: UInt, parameters: COpaquePointer?, parameterssize: UInt, iostatusblock: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntFlushBuffersFileEx((filehandle?.value ?: 0L), flags.toInt(), (parameters?.value ?: 0L), parameterssize.toInt(), (iostatusblock?.value ?: 0L))

public actual fun ntFlushVirtualMemory(processhandle: Handle, baseaddress: COpaquePointer?, regionsize: COpaquePointer?, iostatus: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntFlushVirtualMemory((processhandle?.value ?: 0L), (baseaddress?.value ?: 0L), (regionsize?.value ?: 0L), (iostatus?.value ?: 0L))

public actual fun ntFreeVirtualMemory(processhandle: Handle, baseaddress: COpaquePointer?, regionsize: COpaquePointer?, freetype: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntFreeVirtualMemory((processhandle?.value ?: 0L), (baseaddress?.value ?: 0L), (regionsize?.value ?: 0L), freetype.toInt())

public actual fun ntFsControlFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, fscontrolcode: UInt, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntFsControlFile((filehandle?.value ?: 0L), (event?.value ?: 0L), 0L, (apccontext?.value ?: 0L), (iostatusblock?.value ?: 0L), fscontrolcode.toInt(), (inputbuffer?.value ?: 0L), inputbufferlength.toInt(), (outputbuffer?.value ?: 0L), outputbufferlength.toInt())

public actual fun ntImpersonateAnonymousToken(threadhandle: Handle): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntImpersonateAnonymousToken((threadhandle?.value ?: 0L))

public actual fun ntLockFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, byteoffset: COpaquePointer?, length: COpaquePointer?, key: UInt, failimmediately: Boolean, exclusivelock: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntLockFile((filehandle?.value ?: 0L), (event?.value ?: 0L), 0L, (apccontext?.value ?: 0L), (iostatusblock?.value ?: 0L), (byteoffset?.value ?: 0L), (length?.value ?: 0L), key.toInt(), failimmediately, exclusivelock)

public actual fun ntNotifyChangeKey(keyhandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, completionfilter: UInt, watchtree: Boolean, buffer: COpaquePointer?, buffersize: UInt, asynchronous: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntNotifyChangeKey((keyhandle?.value ?: 0L), (event?.value ?: 0L), 0L, (apccontext?.value ?: 0L), (iostatusblock?.value ?: 0L), completionfilter.toInt(), watchtree, (buffer?.value ?: 0L), buffersize.toInt(), asynchronous)

public actual fun ntOpenDirectoryObject(directoryhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntOpenDirectoryObject((directoryhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L))

public actual fun ntOpenFile(filehandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, shareaccess: UInt, openoptions: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntOpenFile((filehandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), (iostatusblock?.value ?: 0L), shareaccess.toInt(), openoptions.toInt())

public actual fun ntOpenObjectAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, objecttypename: COpaquePointer?, objectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, grantedaccess: UInt, privileges: COpaquePointer?, objectcreation: Boolean, accessgranted: Boolean, generateonclose: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntOpenObjectAuditAlarm((subsystemname?.value ?: 0L), (handleid?.value ?: 0L), (objecttypename?.value ?: 0L), (objectname?.value ?: 0L), (securitydescriptor?.value ?: 0L), (clienttoken?.value ?: 0L), desiredaccess.toInt(), grantedaccess.toInt(), (privileges?.value ?: 0L), objectcreation, accessgranted, (generateonclose?.value ?: 0L))

public actual fun ntOpenProcessToken(processhandle: Handle, desiredaccess: UInt, tokenhandle: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntOpenProcessToken((processhandle?.value ?: 0L), desiredaccess.toInt(), (tokenhandle?.value ?: 0L))

public actual fun ntOpenProcessTokenEx(processhandle: Handle, desiredaccess: UInt, handleattributes: UInt, tokenhandle: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntOpenProcessTokenEx((processhandle?.value ?: 0L), desiredaccess.toInt(), handleattributes.toInt(), (tokenhandle?.value ?: 0L))

public actual fun ntOpenSymbolicLinkObject(linkhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntOpenSymbolicLinkObject((linkhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L))

public actual fun ntOpenThreadToken(threadhandle: Handle, desiredaccess: UInt, openasself: Boolean, tokenhandle: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntOpenThreadToken((threadhandle?.value ?: 0L), desiredaccess.toInt(), openasself, (tokenhandle?.value ?: 0L))

public actual fun ntOpenThreadTokenEx(threadhandle: Handle, desiredaccess: UInt, openasself: Boolean, handleattributes: UInt, tokenhandle: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntOpenThreadTokenEx((threadhandle?.value ?: 0L), desiredaccess.toInt(), openasself, handleattributes.toInt(), (tokenhandle?.value ?: 0L))

public actual fun ntPrivilegeCheck(clienttoken: Handle, requiredprivileges: COpaquePointer?, result: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntPrivilegeCheck((clienttoken?.value ?: 0L), (requiredprivileges?.value ?: 0L), (result?.value ?: 0L))

public actual fun ntPrivilegeObjectAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, clienttoken: Handle, desiredaccess: UInt, privileges: COpaquePointer?, accessgranted: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntPrivilegeObjectAuditAlarm((subsystemname?.value ?: 0L), (handleid?.value ?: 0L), (clienttoken?.value ?: 0L), desiredaccess.toInt(), (privileges?.value ?: 0L), accessgranted)

public actual fun ntPrivilegedServiceAuditAlarm(subsystemname: COpaquePointer?, servicename: COpaquePointer?, clienttoken: Handle, privileges: COpaquePointer?, accessgranted: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntPrivilegedServiceAuditAlarm((subsystemname?.value ?: 0L), (servicename?.value ?: 0L), (clienttoken?.value ?: 0L), (privileges?.value ?: 0L), accessgranted)

public actual fun ntQueryDirectoryFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass, returnsingleentry: Boolean, filename: COpaquePointer?, restartscan: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntQueryDirectoryFile((filehandle?.value ?: 0L), (event?.value ?: 0L), 0L, (apccontext?.value ?: 0L), (iostatusblock?.value ?: 0L), (fileinformation?.value ?: 0L), length.toInt(), fileinformationclass, returnsingleentry, (filename?.value ?: 0L), restartscan)

public actual fun ntQueryDirectoryFileEx(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass, queryflags: UInt, filename: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntQueryDirectoryFileEx((filehandle?.value ?: 0L), (event?.value ?: 0L), 0L, (apccontext?.value ?: 0L), (iostatusblock?.value ?: 0L), (fileinformation?.value ?: 0L), length.toInt(), fileinformationclass, queryflags.toInt(), (filename?.value ?: 0L))

public actual fun ntQueryDirectoryObject(directoryhandle: Handle, buffer: COpaquePointer?, length: UInt, returnsingleentry: Boolean, restartscan: Boolean, context: COpaquePointer?, returnlength: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntQueryDirectoryObject((directoryhandle?.value ?: 0L), (buffer?.value ?: 0L), length.toInt(), returnsingleentry, restartscan, (context?.value ?: 0L), (returnlength?.value ?: 0L))

public actual fun ntQueryEaFile(filehandle: Handle, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt, returnsingleentry: Boolean, ealist: COpaquePointer?, ealistlength: UInt, eaindex: COpaquePointer?, restartscan: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntQueryEaFile((filehandle?.value ?: 0L), (iostatusblock?.value ?: 0L), (buffer?.value ?: 0L), length.toInt(), returnsingleentry, (ealist?.value ?: 0L), ealistlength.toInt(), (eaindex?.value ?: 0L), restartscan)

public actual fun ntQueryFullAttributesFile(objectattributes: COpaquePointer?, fileinformation: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntQueryFullAttributesFile((objectattributes?.value ?: 0L), (fileinformation?.value ?: 0L))

public actual fun ntQueryInformationByName(objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntQueryInformationByName((objectattributes?.value ?: 0L), (iostatusblock?.value ?: 0L), (fileinformation?.value ?: 0L), length.toInt(), fileinformationclass)

public actual fun ntQueryInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntQueryInformationFile((filehandle?.value ?: 0L), (iostatusblock?.value ?: 0L), (fileinformation?.value ?: 0L), length.toInt(), fileinformationclass)

public actual fun ntQueryInformationToken(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: COpaquePointer?, tokeninformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntQueryInformationToken((tokenhandle?.value ?: 0L), tokeninformationclass, (tokeninformation?.value ?: 0L), tokeninformationlength.toInt(), (returnlength?.value ?: 0L))

public actual fun ntQueryQuotaInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt, returnsingleentry: Boolean, sidlist: COpaquePointer?, sidlistlength: UInt, startsid: Psid, restartscan: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntQueryQuotaInformationFile((filehandle?.value ?: 0L), (iostatusblock?.value ?: 0L), (buffer?.value ?: 0L), length.toInt(), returnsingleentry, (sidlist?.value ?: 0L), sidlistlength.toInt(), (startsid?.value ?: 0L), restartscan)

public actual fun ntQuerySecurityObject(handle: Handle, securityinformation: UInt, securitydescriptor: PsecurityDescriptor, length: UInt, lengthneeded: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntQuerySecurityObject((handle?.value ?: 0L), securityinformation.toInt(), (securitydescriptor?.value ?: 0L), length.toInt(), (lengthneeded?.value ?: 0L))

public actual fun ntQuerySymbolicLinkObject(linkhandle: Handle, linktarget: COpaquePointer?, returnedlength: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntQuerySymbolicLinkObject((linkhandle?.value ?: 0L), (linktarget?.value ?: 0L), (returnedlength?.value ?: 0L))

public actual fun ntQueryVirtualMemory(processhandle: Handle, baseaddress: COpaquePointer?, memoryinformationclass: MemoryInformationClass, memoryinformation: COpaquePointer?, memoryinformationlength: ULong, returnlength: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntQueryVirtualMemory((processhandle?.value ?: 0L), (baseaddress?.value ?: 0L), memoryinformationclass, (memoryinformation?.value ?: 0L), memoryinformationlength.toLong(), (returnlength?.value ?: 0L))

public actual fun ntQueryVolumeInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, fsinformation: COpaquePointer?, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntQueryVolumeInformationFile((filehandle?.value ?: 0L), (iostatusblock?.value ?: 0L), (fsinformation?.value ?: 0L), length.toInt(), fsinformationclass)

public actual fun ntReadFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt, byteoffset: COpaquePointer?, key: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntReadFile((filehandle?.value ?: 0L), (event?.value ?: 0L), 0L, (apccontext?.value ?: 0L), (iostatusblock?.value ?: 0L), (buffer?.value ?: 0L), length.toInt(), (byteoffset?.value ?: 0L), (key?.value ?: 0L))

public actual fun ntSetEaFile(filehandle: Handle, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntSetEaFile((filehandle?.value ?: 0L), (iostatusblock?.value ?: 0L), (buffer?.value ?: 0L), length.toInt())

public actual fun ntSetEvent(eventhandle: Handle, previousstate: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntSetEvent((eventhandle?.value ?: 0L), (previousstate?.value ?: 0L))

public actual fun ntSetInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntSetInformationFile((filehandle?.value ?: 0L), (iostatusblock?.value ?: 0L), (fileinformation?.value ?: 0L), length.toInt(), fileinformationclass)

public actual fun ntSetInformationToken(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: COpaquePointer?, tokeninformationlength: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntSetInformationToken((tokenhandle?.value ?: 0L), tokeninformationclass, (tokeninformation?.value ?: 0L), tokeninformationlength.toInt())

public actual fun ntSetInformationVirtualMemory(processhandle: Handle, vminformationclass: VirtualMemoryInformationClass, numberofentries: ULong, virtualaddresses: COpaquePointer?, vminformation: COpaquePointer?, vminformationlength: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntSetInformationVirtualMemory((processhandle?.value ?: 0L), vminformationclass, numberofentries.toLong(), (virtualaddresses?.value ?: 0L), (vminformation?.value ?: 0L), vminformationlength.toInt())

public actual fun ntSetQuotaInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntSetQuotaInformationFile((filehandle?.value ?: 0L), (iostatusblock?.value ?: 0L), (buffer?.value ?: 0L), length.toInt())

public actual fun ntSetSecurityObject(handle: Handle, securityinformation: UInt, securitydescriptor: PsecurityDescriptor): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntSetSecurityObject((handle?.value ?: 0L), securityinformation.toInt(), (securitydescriptor?.value ?: 0L))

public actual fun ntSetVolumeInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, fsinformation: COpaquePointer?, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntSetVolumeInformationFile((filehandle?.value ?: 0L), (iostatusblock?.value ?: 0L), (fsinformation?.value ?: 0L), length.toInt(), fsinformationclass)

public actual fun ntUnlockFile(filehandle: Handle, iostatusblock: COpaquePointer?, byteoffset: COpaquePointer?, length: COpaquePointer?, key: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntUnlockFile((filehandle?.value ?: 0L), (iostatusblock?.value ?: 0L), (byteoffset?.value ?: 0L), (length?.value ?: 0L), key.toInt())

public actual fun ntWriteFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt, byteoffset: COpaquePointer?, key: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ntWriteFile((filehandle?.value ?: 0L), (event?.value ?: 0L), 0L, (apccontext?.value ?: 0L), (iostatusblock?.value ?: 0L), (buffer?.value ?: 0L), length.toInt(), (byteoffset?.value ?: 0L), (key?.value ?: 0L))

public actual fun obInsertObject(obj: COpaquePointer?, passedaccessstate: COpaquePointer?, desiredaccess: UInt, objectpointerbias: UInt, newobject: COpaquePointer?, handle: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_obInsertObject((obj?.value ?: 0L), (passedaccessstate?.value ?: 0L), desiredaccess.toInt(), objectpointerbias.toInt(), (newobject?.value ?: 0L), (handle?.value ?: 0L))

public actual fun obIsKernelHandle(handle: Handle): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_obIsKernelHandle((handle?.value ?: 0L))

public actual fun obMakeTemporaryObject(obj: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_obMakeTemporaryObject((obj?.value ?: 0L))
}

public actual fun obOpenObjectByPointer(obj: COpaquePointer?, handleattributes: UInt, passedaccessstate: COpaquePointer?, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, handle: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_obOpenObjectByPointer((obj?.value ?: 0L), handleattributes.toInt(), (passedaccessstate?.value ?: 0L), desiredaccess.toInt(), objecttype, accessmode, (handle?.value ?: 0L))

public actual fun obOpenObjectByPointerWithTag(obj: COpaquePointer?, handleattributes: UInt, passedaccessstate: COpaquePointer?, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, tag: UInt, handle: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_obOpenObjectByPointerWithTag((obj?.value ?: 0L), handleattributes.toInt(), (passedaccessstate?.value ?: 0L), desiredaccess.toInt(), objecttype, accessmode, tag.toInt(), (handle?.value ?: 0L))

public actual fun obQueryNameString(obj: COpaquePointer?, objectnameinfo: COpaquePointer?, length: UInt, returnlength: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_obQueryNameString((obj?.value ?: 0L), (objectnameinfo?.value ?: 0L), length.toInt(), (returnlength?.value ?: 0L))

public actual fun obQueryObjectAuditingByHandle(handle: Handle, generateonclose: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_obQueryObjectAuditingByHandle((handle?.value ?: 0L), (generateonclose?.value ?: 0L))

public actual fun pfxFindPrefix(prefixtable: COpaquePointer?, fullname: COpaquePointer?): COpaquePointer? =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_pfxFindPrefix((prefixtable?.value ?: 0L), (fullname?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pfxInitialize(prefixtable: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_pfxInitialize((prefixtable?.value ?: 0L))
}

public actual fun pfxInsertPrefix(prefixtable: COpaquePointer?, prefix: COpaquePointer?, prefixtableentry: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_pfxInsertPrefix((prefixtable?.value ?: 0L), (prefix?.value ?: 0L), (prefixtableentry?.value ?: 0L))

public actual fun pfxRemovePrefix(prefixtable: COpaquePointer?, prefixtableentry: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_pfxRemovePrefix((prefixtable?.value ?: 0L), (prefixtableentry?.value ?: 0L))
}

public actual fun poQueueShutdownWorkItem(workitem: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_poQueueShutdownWorkItem((workitem?.value ?: 0L))

public actual fun psAssignImpersonationToken(thread: Pethread, token: Handle): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_psAssignImpersonationToken(thread, (token?.value ?: 0L))

public actual fun psChargePoolQuota(process: Peprocess, pooltype: PoolType, amount: ULong) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_psChargePoolQuota(process, pooltype, amount.toLong())
}

public actual fun psChargeProcessPoolQuota(process: Peprocess, pooltype: PoolType, amount: ULong): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_psChargeProcessPoolQuota(process, pooltype, amount.toLong())

public actual fun psDereferenceImpersonationToken(impersonationtoken: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_psDereferenceImpersonationToken((impersonationtoken?.value ?: 0L))
}

public actual fun psDereferencePrimaryToken(primarytoken: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_psDereferencePrimaryToken((primarytoken?.value ?: 0L))
}

public actual fun psDisableImpersonation(thread: Pethread, impersonationstate: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_psDisableImpersonation(thread, (impersonationstate?.value ?: 0L))

public actual fun psGetProcessExitTime(): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_psGetProcessExitTime()

public actual fun psGetThreadProcess(thread: Pethread): Peprocess =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_psGetThreadProcess(thread)

public actual fun psImpersonateClient(thread: Pethread, token: COpaquePointer?, copyonopen: Boolean, effectiveonly: Boolean, impersonationlevel: SecurityImpersonationLevel): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_psImpersonateClient(thread, (token?.value ?: 0L), copyonopen, effectiveonly, impersonationlevel)

public actual fun psIsDiskCountersEnabled(): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_psIsDiskCountersEnabled()

public actual fun psIsSystemThread(thread: Pethread): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_psIsSystemThread(thread)

public actual fun psIsThreadTerminating(thread: Pethread): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_psIsThreadTerminating(thread)

public actual fun psLookupProcessByProcessId(processid: Handle, process: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_psLookupProcessByProcessId((processid?.value ?: 0L), (process?.value ?: 0L))

public actual fun psLookupThreadByThreadId(threadid: Handle, thread: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_psLookupThreadByThreadId((threadid?.value ?: 0L), (thread?.value ?: 0L))

public actual fun psReferenceImpersonationToken(thread: Pethread, copyonopen: COpaquePointer?, effectiveonly: COpaquePointer?, impersonationlevel: COpaquePointer?): COpaquePointer? =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_psReferenceImpersonationToken(thread, (copyonopen?.value ?: 0L), (effectiveonly?.value ?: 0L), (impersonationlevel?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun psReferencePrimaryToken(process: Peprocess): COpaquePointer? =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_psReferencePrimaryToken(process).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun psRestoreImpersonation(thread: Pethread, impersonationstate: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_psRestoreImpersonation(thread, (impersonationstate?.value ?: 0L))
}

public actual fun psReturnPoolQuota(process: Peprocess, pooltype: PoolType, amount: ULong) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_psReturnPoolQuota(process, pooltype, amount.toLong())
}

public actual fun psRevertToSelf() {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_psRevertToSelf()
}

public actual fun psUpdateDiskCounters(process: Peprocess, bytesread: ULong, byteswritten: ULong, readoperationcount: UInt, writeoperationcount: UInt, flushoperationcount: UInt) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_psUpdateDiskCounters(process, bytesread.toLong(), byteswritten.toLong(), readoperationcount.toInt(), writeoperationcount.toInt(), flushoperationcount.toInt())
}

public actual fun querySecurityContextToken(phcontext: COpaquePointer?, token: COpaquePointer?): Hresult =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_querySecurityContextToken((phcontext?.value ?: 0L), (token?.value ?: 0L))

public actual fun rtlAbsoluteToSelfRelativeSD(absolutesecuritydescriptor: PsecurityDescriptor, selfrelativesecuritydescriptor: PsecurityDescriptor, bufferlength: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlAbsoluteToSelfRelativeSD((absolutesecuritydescriptor?.value ?: 0L), (selfrelativesecuritydescriptor?.value ?: 0L), (bufferlength?.value ?: 0L))

public actual fun rtlAddAccessAllowedAce(acl: COpaquePointer?, acerevision: UInt, accessmask: UInt, sid: Psid): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlAddAccessAllowedAce((acl?.value ?: 0L), acerevision.toInt(), accessmask.toInt(), (sid?.value ?: 0L))

public actual fun rtlAddAccessAllowedAceEx(acl: COpaquePointer?, acerevision: UInt, aceflags: UInt, accessmask: UInt, sid: Psid): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlAddAccessAllowedAceEx((acl?.value ?: 0L), acerevision.toInt(), aceflags.toInt(), accessmask.toInt(), (sid?.value ?: 0L))

public actual fun rtlAddAce(acl: COpaquePointer?, acerevision: UInt, startingaceindex: UInt, acelist: COpaquePointer?, acelistlength: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlAddAce((acl?.value ?: 0L), acerevision.toInt(), startingaceindex.toInt(), (acelist?.value ?: 0L), acelistlength.toInt())

public actual fun rtlAllocateAndInitializeSid(identifierauthority: COpaquePointer?, subauthoritycount: UByte, subauthority0: UInt, subauthority1: UInt, subauthority2: UInt, subauthority3: UInt, subauthority4: UInt, subauthority5: UInt, subauthority6: UInt, subauthority7: UInt, sid: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlAllocateAndInitializeSid((identifierauthority?.value ?: 0L), subauthoritycount.toByte(), subauthority0.toInt(), subauthority1.toInt(), subauthority2.toInt(), subauthority3.toInt(), subauthority4.toInt(), subauthority5.toInt(), subauthority6.toInt(), subauthority7.toInt(), (sid?.value ?: 0L))

public actual fun rtlAllocateAndInitializeSidEx(identifierauthority: COpaquePointer?, subauthoritycount: UByte, subauthorities: COpaquePointer?, sid: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlAllocateAndInitializeSidEx((identifierauthority?.value ?: 0L), subauthoritycount.toByte(), (subauthorities?.value ?: 0L), (sid?.value ?: 0L))

public actual fun rtlAllocateHeap(heaphandle: COpaquePointer?, flags: UInt, size: ULong): COpaquePointer? =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlAllocateHeap((heaphandle?.value ?: 0L), flags.toInt(), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlAppendStringToString(destination: COpaquePointer?, source: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlAppendStringToString((destination?.value ?: 0L), (source?.value ?: 0L))

public actual fun rtlCompareAltitudes(altitude1: COpaquePointer?, altitude2: COpaquePointer?): Int =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlCompareAltitudes((altitude1?.value ?: 0L), (altitude2?.value ?: 0L))

public actual fun rtlCompareMemoryUlong(source: COpaquePointer?, length: ULong, pattern: UInt): ULong =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlCompareMemoryUlong((source?.value ?: 0L), length.toLong(), pattern.toInt()).toULong()

public actual fun rtlCompressBuffer(compressionformatandengine: UShort, uncompressedbuffer: COpaquePointer?, uncompressedbuffersize: UInt, compressedbuffer: COpaquePointer?, compressedbuffersize: UInt, uncompressedchunksize: UInt, finalcompressedsize: COpaquePointer?, workspace: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlCompressBuffer(compressionformatandengine.toShort(), (uncompressedbuffer?.value ?: 0L), uncompressedbuffersize.toInt(), (compressedbuffer?.value ?: 0L), compressedbuffersize.toInt(), uncompressedchunksize.toInt(), (finalcompressedsize?.value ?: 0L), (workspace?.value ?: 0L))

public actual fun rtlCompressChunks(uncompressedbuffer: COpaquePointer?, uncompressedbuffersize: UInt, compressedbuffer: COpaquePointer?, compressedbuffersize: UInt, compresseddatainfo: COpaquePointer?, compresseddatainfolength: UInt, workspace: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlCompressChunks((uncompressedbuffer?.value ?: 0L), uncompressedbuffersize.toInt(), (compressedbuffer?.value ?: 0L), compressedbuffersize.toInt(), (compresseddatainfo?.value ?: 0L), compresseddatainfolength.toInt(), (workspace?.value ?: 0L))

public actual fun rtlCopyLuid(destinationluid: COpaquePointer?, sourceluid: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlCopyLuid((destinationluid?.value ?: 0L), (sourceluid?.value ?: 0L))
}

public actual fun rtlCopySid(destinationsidlength: UInt, destinationsid: Psid, sourcesid: Psid): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlCopySid(destinationsidlength.toInt(), (destinationsid?.value ?: 0L), (sourcesid?.value ?: 0L))

public actual fun rtlCreateAcl(acl: COpaquePointer?, acllength: UInt, aclrevision: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlCreateAcl((acl?.value ?: 0L), acllength.toInt(), aclrevision.toInt())

public actual fun rtlCreateHeap(flags: UInt, heapbase: COpaquePointer?, reservesize: ULong, commitsize: ULong, lock: COpaquePointer?, parameters: COpaquePointer?): COpaquePointer? =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlCreateHeap(flags.toInt(), (heapbase?.value ?: 0L), reservesize.toLong(), commitsize.toLong(), (lock?.value ?: 0L), (parameters?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlCreateServiceSid(servicename: COpaquePointer?, servicesid: Psid, servicesidlength: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlCreateServiceSid((servicename?.value ?: 0L), (servicesid?.value ?: 0L), (servicesidlength?.value ?: 0L))

public actual fun rtlCreateSystemVolumeInformationFolder(volumerootpath: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlCreateSystemVolumeInformationFolder((volumerootpath?.value ?: 0L))

public actual fun rtlCreateUnicodeString(destinationstring: COpaquePointer?, sourcestring: Pcwstr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlCreateUnicodeString((destinationstring?.value ?: 0L), (sourcestring?.value ?: 0L))

public actual fun rtlCreateVirtualAccountSid(name: COpaquePointer?, basesubauthority: UInt, sid: Psid, sidlength: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlCreateVirtualAccountSid((name?.value ?: 0L), basesubauthority.toInt(), (sid?.value ?: 0L), (sidlength?.value ?: 0L))

public actual fun rtlCustomCPToUnicodeN(customcp: COpaquePointer?, unicodestring: Pwstr, maxbytesinunicodestring: UInt, bytesinunicodestring: COpaquePointer?, customcpstring: Pcstr, bytesincustomcpstring: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlCustomCPToUnicodeN((customcp?.value ?: 0L), (unicodestring?.value ?: 0L), maxbytesinunicodestring.toInt(), (bytesinunicodestring?.value ?: 0L), (customcpstring?.value ?: 0L), bytesincustomcpstring.toInt())

public actual fun rtlDecompressBuffer(compressionformat: UShort, uncompressedbuffer: COpaquePointer?, uncompressedbuffersize: UInt, compressedbuffer: COpaquePointer?, compressedbuffersize: UInt, finaluncompressedsize: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlDecompressBuffer(compressionformat.toShort(), (uncompressedbuffer?.value ?: 0L), uncompressedbuffersize.toInt(), (compressedbuffer?.value ?: 0L), compressedbuffersize.toInt(), (finaluncompressedsize?.value ?: 0L))

public actual fun rtlDecompressBufferEx(compressionformat: UShort, uncompressedbuffer: COpaquePointer?, uncompressedbuffersize: UInt, compressedbuffer: COpaquePointer?, compressedbuffersize: UInt, finaluncompressedsize: COpaquePointer?, workspace: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlDecompressBufferEx(compressionformat.toShort(), (uncompressedbuffer?.value ?: 0L), uncompressedbuffersize.toInt(), (compressedbuffer?.value ?: 0L), compressedbuffersize.toInt(), (finaluncompressedsize?.value ?: 0L), (workspace?.value ?: 0L))

public actual fun rtlDecompressBufferEx2(compressionformat: UShort, uncompressedbuffer: COpaquePointer?, uncompressedbuffersize: UInt, compressedbuffer: COpaquePointer?, compressedbuffersize: UInt, uncompressedchunksize: UInt, finaluncompressedsize: COpaquePointer?, workspace: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlDecompressBufferEx2(compressionformat.toShort(), (uncompressedbuffer?.value ?: 0L), uncompressedbuffersize.toInt(), (compressedbuffer?.value ?: 0L), compressedbuffersize.toInt(), uncompressedchunksize.toInt(), (finaluncompressedsize?.value ?: 0L), (workspace?.value ?: 0L))

public actual fun rtlDecompressChunks(uncompressedbuffer: COpaquePointer?, uncompressedbuffersize: UInt, compressedbuffer: COpaquePointer?, compressedbuffersize: UInt, compressedtail: COpaquePointer?, compressedtailsize: UInt, compresseddatainfo: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlDecompressChunks((uncompressedbuffer?.value ?: 0L), uncompressedbuffersize.toInt(), (compressedbuffer?.value ?: 0L), compressedbuffersize.toInt(), (compressedtail?.value ?: 0L), compressedtailsize.toInt(), (compresseddatainfo?.value ?: 0L))

public actual fun rtlDecompressFragment(compressionformat: UShort, uncompressedfragment: COpaquePointer?, uncompressedfragmentsize: UInt, compressedbuffer: COpaquePointer?, compressedbuffersize: UInt, fragmentoffset: UInt, finaluncompressedsize: COpaquePointer?, workspace: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlDecompressFragment(compressionformat.toShort(), (uncompressedfragment?.value ?: 0L), uncompressedfragmentsize.toInt(), (compressedbuffer?.value ?: 0L), compressedbuffersize.toInt(), fragmentoffset.toInt(), (finaluncompressedsize?.value ?: 0L), (workspace?.value ?: 0L))

public actual fun rtlDecompressFragmentEx(compressionformat: UShort, uncompressedfragment: COpaquePointer?, uncompressedfragmentsize: UInt, compressedbuffer: COpaquePointer?, compressedbuffersize: UInt, fragmentoffset: UInt, uncompressedchunksize: UInt, finaluncompressedsize: COpaquePointer?, workspace: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlDecompressFragmentEx(compressionformat.toShort(), (uncompressedfragment?.value ?: 0L), uncompressedfragmentsize.toInt(), (compressedbuffer?.value ?: 0L), compressedbuffersize.toInt(), fragmentoffset.toInt(), uncompressedchunksize.toInt(), (finaluncompressedsize?.value ?: 0L), (workspace?.value ?: 0L))

public actual fun rtlDeleteAce(acl: COpaquePointer?, aceindex: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlDeleteAce((acl?.value ?: 0L), aceindex.toInt())

public actual fun rtlDescribeChunk(compressionformat: UShort, compressedbuffer: COpaquePointer?, endofcompressedbufferplus1: COpaquePointer?, chunkbuffer: COpaquePointer?, chunksize: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlDescribeChunk(compressionformat.toShort(), (compressedbuffer?.value ?: 0L), (endofcompressedbufferplus1?.value ?: 0L), (chunkbuffer?.value ?: 0L), (chunksize?.value ?: 0L))

public actual fun rtlDestroyHeap(heaphandle: COpaquePointer?): COpaquePointer? =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlDestroyHeap((heaphandle?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlDosPathNameToNtPathNameUWithStatus(dosfilename: Pcwstr, ntfilename: COpaquePointer?, filepart: COpaquePointer?, reserved: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlDosPathNameToNtPathNameUWithStatus((dosfilename?.value ?: 0L), (ntfilename?.value ?: 0L), (filepart?.value ?: 0L), (reserved?.value ?: 0L))

public actual fun rtlDowncaseUnicodeString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlDowncaseUnicodeString((destinationstring?.value ?: 0L), (sourcestring?.value ?: 0L), allocatedestinationstring)

public actual fun rtlDuplicateUnicodeString(flags: UInt, stringin: COpaquePointer?, stringout: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlDuplicateUnicodeString(flags.toInt(), (stringin?.value ?: 0L), (stringout?.value ?: 0L))

public actual fun rtlEqualPrefixSid(sid1: Psid, sid2: Psid): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlEqualPrefixSid((sid1?.value ?: 0L), (sid2?.value ?: 0L))

public actual fun rtlEqualSid(sid1: Psid, sid2: Psid): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlEqualSid((sid1?.value ?: 0L), (sid2?.value ?: 0L))

public actual fun rtlFindUnicodePrefix(prefixtable: COpaquePointer?, fullname: COpaquePointer?, caseinsensitiveindex: UInt): COpaquePointer? =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlFindUnicodePrefix((prefixtable?.value ?: 0L), (fullname?.value ?: 0L), caseinsensitiveindex.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlFreeHeap(heaphandle: COpaquePointer?, flags: UInt, baseaddress: COpaquePointer?): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlFreeHeap((heaphandle?.value ?: 0L), flags.toInt(), (baseaddress?.value ?: 0L)).toUInt()

public actual fun rtlFreeSid(sid: Psid): COpaquePointer? =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlFreeSid((sid?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlGenerate8dot3Name(name: COpaquePointer?, allowextendedcharacters: Boolean, context: COpaquePointer?, name8dot3: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlGenerate8dot3Name((name?.value ?: 0L), allowextendedcharacters, (context?.value ?: 0L), (name8dot3?.value ?: 0L))

public actual fun rtlGetAce(acl: COpaquePointer?, aceindex: UInt, ace: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlGetAce((acl?.value ?: 0L), aceindex.toInt(), (ace?.value ?: 0L))

public actual fun rtlGetCompressionWorkSpaceSize(compressionformatandengine: UShort, compressbufferworkspacesize: COpaquePointer?, compressfragmentworkspacesize: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlGetCompressionWorkSpaceSize(compressionformatandengine.toShort(), (compressbufferworkspacesize?.value ?: 0L), (compressfragmentworkspacesize?.value ?: 0L))

public actual fun rtlGetDaclSecurityDescriptor(securitydescriptor: PsecurityDescriptor, daclpresent: COpaquePointer?, dacl: COpaquePointer?, dacldefaulted: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlGetDaclSecurityDescriptor((securitydescriptor?.value ?: 0L), (daclpresent?.value ?: 0L), (dacl?.value ?: 0L), (dacldefaulted?.value ?: 0L))

public actual fun rtlGetGroupSecurityDescriptor(securitydescriptor: PsecurityDescriptor, group: COpaquePointer?, groupdefaulted: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlGetGroupSecurityDescriptor((securitydescriptor?.value ?: 0L), (group?.value ?: 0L), (groupdefaulted?.value ?: 0L))

public actual fun rtlGetOwnerSecurityDescriptor(securitydescriptor: PsecurityDescriptor, owner: COpaquePointer?, ownerdefaulted: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlGetOwnerSecurityDescriptor((securitydescriptor?.value ?: 0L), (owner?.value ?: 0L), (ownerdefaulted?.value ?: 0L))

public actual fun rtlGetSaclSecurityDescriptor(securitydescriptor: PsecurityDescriptor, saclpresent: COpaquePointer?, sacl: COpaquePointer?, sacldefaulted: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlGetSaclSecurityDescriptor((securitydescriptor?.value ?: 0L), (saclpresent?.value ?: 0L), (sacl?.value ?: 0L), (sacldefaulted?.value ?: 0L))

public actual fun rtlIdentifierAuthoritySid(sid: Psid): COpaquePointer? =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlIdentifierAuthoritySid((sid?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlIdnToAscii(flags: UInt, sourcestring: Pcwstr, sourcestringlength: Int, destinationstring: Pwstr, destinationstringlength: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlIdnToAscii(flags.toInt(), (sourcestring?.value ?: 0L), sourcestringlength, (destinationstring?.value ?: 0L), (destinationstringlength?.value ?: 0L))

public actual fun rtlIdnToNameprepUnicode(flags: UInt, sourcestring: Pcwstr, sourcestringlength: Int, destinationstring: Pwstr, destinationstringlength: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlIdnToNameprepUnicode(flags.toInt(), (sourcestring?.value ?: 0L), sourcestringlength, (destinationstring?.value ?: 0L), (destinationstringlength?.value ?: 0L))

public actual fun rtlIdnToUnicode(flags: UInt, sourcestring: Pcwstr, sourcestringlength: Int, destinationstring: Pwstr, destinationstringlength: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlIdnToUnicode(flags.toInt(), (sourcestring?.value ?: 0L), sourcestringlength, (destinationstring?.value ?: 0L), (destinationstringlength?.value ?: 0L))

public actual fun rtlInitCodePageTable(tablebase: COpaquePointer?, codepagetable: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlInitCodePageTable((tablebase?.value ?: 0L), (codepagetable?.value ?: 0L))
}

public actual fun rtlInitUnicodeStringEx(destinationstring: COpaquePointer?, sourcestring: Pcwstr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlInitUnicodeStringEx((destinationstring?.value ?: 0L), (sourcestring?.value ?: 0L))

public actual fun rtlInitializeSid(sid: Psid, identifierauthority: COpaquePointer?, subauthoritycount: UByte): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlInitializeSid((sid?.value ?: 0L), (identifierauthority?.value ?: 0L), subauthoritycount.toByte())

public actual fun rtlInitializeSidEx(sid: Psid, identifierauthority: COpaquePointer?, subauthoritycount: UByte, vararg variadicArgs: Long): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlInitializeSidEx((sid?.value ?: 0L), (identifierauthority?.value ?: 0L), subauthoritycount.toByte(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun rtlInitializeUnicodePrefix(prefixtable: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlInitializeUnicodePrefix((prefixtable?.value ?: 0L))
}

public actual fun rtlInsertUnicodePrefix(prefixtable: COpaquePointer?, prefix: COpaquePointer?, prefixtableentry: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlInsertUnicodePrefix((prefixtable?.value ?: 0L), (prefix?.value ?: 0L), (prefixtableentry?.value ?: 0L))

public actual fun rtlIsCloudFilesPlaceholder(fileattributes: UInt, reparsetag: UInt): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlIsCloudFilesPlaceholder(fileattributes.toInt(), reparsetag.toInt())

public actual fun rtlIsDosDeviceNameU(dosfilename: Pcwstr): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlIsDosDeviceNameU((dosfilename?.value ?: 0L)).toUInt()

public actual fun rtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag: UInt): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag.toInt())

public actual fun rtlIsNormalizedString(normform: UInt, sourcestring: Pcwstr, sourcestringlength: Int, normalized: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlIsNormalizedString(normform.toInt(), (sourcestring?.value ?: 0L), sourcestringlength, (normalized?.value ?: 0L))

public actual fun rtlIsPartialPlaceholder(fileattributes: UInt, reparsetag: UInt): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlIsPartialPlaceholder(fileattributes.toInt(), reparsetag.toInt())

public actual fun rtlIsPartialPlaceholderFileHandle(filehandle: Handle, ispartialplaceholder: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlIsPartialPlaceholderFileHandle((filehandle?.value ?: 0L), (ispartialplaceholder?.value ?: 0L))

public actual fun rtlIsPartialPlaceholderFileInfo(infobuffer: COpaquePointer?, infoclass: FileInformationClass, ispartialplaceholder: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlIsPartialPlaceholderFileInfo((infobuffer?.value ?: 0L), infoclass, (ispartialplaceholder?.value ?: 0L))

public actual fun rtlIsSandboxedToken(context: COpaquePointer?, previousmode: Byte): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlIsSandboxedToken((context?.value ?: 0L), previousmode)

public actual fun rtlIsValidOemCharacter(char: Pwstr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlIsValidOemCharacter((char?.value ?: 0L))

public actual fun rtlLengthRequiredSid(subauthoritycount: UInt): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlLengthRequiredSid(subauthoritycount.toInt()).toUInt()

public actual fun rtlLengthSid(sid: Psid): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlLengthSid((sid?.value ?: 0L)).toUInt()

public actual fun rtlMultiByteToUnicodeN(unicodestring: Pwstr, maxbytesinunicodestring: UInt, bytesinunicodestring: COpaquePointer?, multibytestring: Pcstr, bytesinmultibytestring: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlMultiByteToUnicodeN((unicodestring?.value ?: 0L), maxbytesinunicodestring.toInt(), (bytesinunicodestring?.value ?: 0L), (multibytestring?.value ?: 0L), bytesinmultibytestring.toInt())

public actual fun rtlMultiByteToUnicodeSize(bytesinunicodestring: COpaquePointer?, multibytestring: Pcstr, bytesinmultibytestring: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlMultiByteToUnicodeSize((bytesinunicodestring?.value ?: 0L), (multibytestring?.value ?: 0L), bytesinmultibytestring.toInt())

public actual fun rtlNextUnicodePrefix(prefixtable: COpaquePointer?, restart: Boolean): COpaquePointer? =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlNextUnicodePrefix((prefixtable?.value ?: 0L), restart).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlNormalizeString(normform: UInt, sourcestring: Pcwstr, sourcestringlength: Int, destinationstring: Pwstr, destinationstringlength: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlNormalizeString(normform.toInt(), (sourcestring?.value ?: 0L), sourcestringlength, (destinationstring?.value ?: 0L), (destinationstringlength?.value ?: 0L))

public actual fun rtlNtStatusToDosErrorNoTeb(status: Ntstatus): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlNtStatusToDosErrorNoTeb(status).toUInt()

public actual fun rtlOemStringToCountedUnicodeString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlOemStringToCountedUnicodeString((destinationstring?.value ?: 0L), (sourcestring?.value ?: 0L), allocatedestinationstring)

public actual fun rtlOemStringToUnicodeString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlOemStringToUnicodeString((destinationstring?.value ?: 0L), (sourcestring?.value ?: 0L), allocatedestinationstring)

public actual fun rtlOemToUnicodeN(unicodestring: Pwstr, maxbytesinunicodestring: UInt, bytesinunicodestring: COpaquePointer?, oemstring: Pcstr, bytesinoemstring: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlOemToUnicodeN((unicodestring?.value ?: 0L), maxbytesinunicodestring.toInt(), (bytesinunicodestring?.value ?: 0L), (oemstring?.value ?: 0L), bytesinoemstring.toInt())

public actual fun rtlPrefixString(string1: COpaquePointer?, string2: COpaquePointer?, caseinsensitive: Boolean): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlPrefixString((string1?.value ?: 0L), (string2?.value ?: 0L), caseinsensitive)

public actual fun rtlQueryPackageIdentity(tokenobject: COpaquePointer?, packagefullname: Pwstr, packagesize: COpaquePointer?, appid: Pwstr, appidsize: COpaquePointer?, packaged: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlQueryPackageIdentity((tokenobject?.value ?: 0L), (packagefullname?.value ?: 0L), (packagesize?.value ?: 0L), (appid?.value ?: 0L), (appidsize?.value ?: 0L), (packaged?.value ?: 0L))

public actual fun rtlQueryPackageIdentityEx(tokenobject: COpaquePointer?, packagefullname: Pwstr, packagesize: COpaquePointer?, appid: Pwstr, appidsize: COpaquePointer?, dynamicid: COpaquePointer?, flags: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlQueryPackageIdentityEx((tokenobject?.value ?: 0L), (packagefullname?.value ?: 0L), (packagesize?.value ?: 0L), (appid?.value ?: 0L), (appidsize?.value ?: 0L), (dynamicid?.value ?: 0L), (flags?.value ?: 0L))

public actual fun rtlQueryProcessPlaceholderCompatibilityMode(): Byte =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlQueryProcessPlaceholderCompatibilityMode()

public actual fun rtlQueryThreadPlaceholderCompatibilityMode(): Byte =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlQueryThreadPlaceholderCompatibilityMode()

public actual fun rtlRandom(seed: COpaquePointer?): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlRandom((seed?.value ?: 0L)).toUInt()

public actual fun rtlRandomEx(seed: COpaquePointer?): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlRandomEx((seed?.value ?: 0L)).toUInt()

public actual fun rtlRemoveUnicodePrefix(prefixtable: COpaquePointer?, prefixtableentry: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlRemoveUnicodePrefix((prefixtable?.value ?: 0L), (prefixtableentry?.value ?: 0L))
}

public actual fun rtlReplaceSidInSd(securitydescriptor: PsecurityDescriptor, oldsid: Psid, newsid: Psid, numchanges: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlReplaceSidInSd((securitydescriptor?.value ?: 0L), (oldsid?.value ?: 0L), (newsid?.value ?: 0L), (numchanges?.value ?: 0L))

public actual fun rtlReserveChunk(compressionformat: UShort, compressedbuffer: COpaquePointer?, endofcompressedbufferplus1: COpaquePointer?, chunkbuffer: COpaquePointer?, chunksize: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlReserveChunk(compressionformat.toShort(), (compressedbuffer?.value ?: 0L), (endofcompressedbufferplus1?.value ?: 0L), (chunkbuffer?.value ?: 0L), chunksize.toInt())

public actual fun rtlSecondsSince1970ToTime(elapsedseconds: UInt, time: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlSecondsSince1970ToTime(elapsedseconds.toInt(), (time?.value ?: 0L))
}

public actual fun rtlSecondsSince1980ToTime(elapsedseconds: UInt, time: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlSecondsSince1980ToTime(elapsedseconds.toInt(), (time?.value ?: 0L))
}

public actual fun rtlSelfRelativeToAbsoluteSD(selfrelativesecuritydescriptor: PsecurityDescriptor, absolutesecuritydescriptor: PsecurityDescriptor, absolutesecuritydescriptorsize: COpaquePointer?, dacl: COpaquePointer?, daclsize: COpaquePointer?, sacl: COpaquePointer?, saclsize: COpaquePointer?, owner: Psid, ownersize: COpaquePointer?, primarygroup: Psid, primarygroupsize: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlSelfRelativeToAbsoluteSD((selfrelativesecuritydescriptor?.value ?: 0L), (absolutesecuritydescriptor?.value ?: 0L), (absolutesecuritydescriptorsize?.value ?: 0L), (dacl?.value ?: 0L), (daclsize?.value ?: 0L), (sacl?.value ?: 0L), (saclsize?.value ?: 0L), (owner?.value ?: 0L), (ownersize?.value ?: 0L), (primarygroup?.value ?: 0L), (primarygroupsize?.value ?: 0L))

public actual fun rtlSetGroupSecurityDescriptor(securitydescriptor: PsecurityDescriptor, group: Psid, groupdefaulted: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlSetGroupSecurityDescriptor((securitydescriptor?.value ?: 0L), (group?.value ?: 0L), groupdefaulted)

public actual fun rtlSetOwnerSecurityDescriptor(securitydescriptor: PsecurityDescriptor, owner: Psid, ownerdefaulted: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlSetOwnerSecurityDescriptor((securitydescriptor?.value ?: 0L), (owner?.value ?: 0L), ownerdefaulted)

public actual fun rtlSetProcessPlaceholderCompatibilityMode(mode: Byte): Byte =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlSetProcessPlaceholderCompatibilityMode(mode)

public actual fun rtlSetThreadPlaceholderCompatibilityMode(mode: Byte): Byte =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlSetThreadPlaceholderCompatibilityMode(mode)

public actual fun rtlSubAuthorityCountSid(sid: Psid): COpaquePointer? =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlSubAuthorityCountSid((sid?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlSubAuthoritySid(sid: Psid, subauthority: UInt): COpaquePointer? =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlSubAuthoritySid((sid?.value ?: 0L), subauthority.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlTimeToSecondsSince1980(time: COpaquePointer?, elapsedseconds: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlTimeToSecondsSince1980((time?.value ?: 0L), (elapsedseconds?.value ?: 0L))

public actual fun rtlUnicodeStringToCountedOemString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlUnicodeStringToCountedOemString((destinationstring?.value ?: 0L), (sourcestring?.value ?: 0L), allocatedestinationstring)

public actual fun rtlUnicodeToCustomCPN(customcp: COpaquePointer?, customcpstring: Pstr, maxbytesincustomcpstring: UInt, bytesincustomcpstring: COpaquePointer?, unicodestring: Pcwstr, bytesinunicodestring: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlUnicodeToCustomCPN((customcp?.value ?: 0L), (customcpstring?.value ?: 0L), maxbytesincustomcpstring.toInt(), (bytesincustomcpstring?.value ?: 0L), (unicodestring?.value ?: 0L), bytesinunicodestring.toInt())

public actual fun rtlUnicodeToMultiByteN(multibytestring: Pstr, maxbytesinmultibytestring: UInt, bytesinmultibytestring: COpaquePointer?, unicodestring: COpaquePointer?, bytesinunicodestring: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlUnicodeToMultiByteN((multibytestring?.value ?: 0L), maxbytesinmultibytestring.toInt(), (bytesinmultibytestring?.value ?: 0L), (unicodestring?.value ?: 0L), bytesinunicodestring.toInt())

public actual fun rtlUnicodeToOemN(oemstring: Pstr, maxbytesinoemstring: UInt, bytesinoemstring: COpaquePointer?, unicodestring: COpaquePointer?, bytesinunicodestring: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlUnicodeToOemN((oemstring?.value ?: 0L), maxbytesinoemstring.toInt(), (bytesinoemstring?.value ?: 0L), (unicodestring?.value ?: 0L), bytesinunicodestring.toInt())

public actual fun rtlUpcaseUnicodeStringToCountedOemString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlUpcaseUnicodeStringToCountedOemString((destinationstring?.value ?: 0L), (sourcestring?.value ?: 0L), allocatedestinationstring)

public actual fun rtlUpcaseUnicodeStringToOemString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlUpcaseUnicodeStringToOemString((destinationstring?.value ?: 0L), (sourcestring?.value ?: 0L), allocatedestinationstring)

public actual fun rtlUpcaseUnicodeToCustomCPN(customcp: COpaquePointer?, customcpstring: Pstr, maxbytesincustomcpstring: UInt, bytesincustomcpstring: COpaquePointer?, unicodestring: Pcwstr, bytesinunicodestring: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlUpcaseUnicodeToCustomCPN((customcp?.value ?: 0L), (customcpstring?.value ?: 0L), maxbytesincustomcpstring.toInt(), (bytesincustomcpstring?.value ?: 0L), (unicodestring?.value ?: 0L), bytesinunicodestring.toInt())

public actual fun rtlUpcaseUnicodeToMultiByteN(multibytestring: Pstr, maxbytesinmultibytestring: UInt, bytesinmultibytestring: COpaquePointer?, unicodestring: COpaquePointer?, bytesinunicodestring: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlUpcaseUnicodeToMultiByteN((multibytestring?.value ?: 0L), maxbytesinmultibytestring.toInt(), (bytesinmultibytestring?.value ?: 0L), (unicodestring?.value ?: 0L), bytesinunicodestring.toInt())

public actual fun rtlUpcaseUnicodeToOemN(oemstring: Pstr, maxbytesinoemstring: UInt, bytesinoemstring: COpaquePointer?, unicodestring: COpaquePointer?, bytesinunicodestring: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlUpcaseUnicodeToOemN((oemstring?.value ?: 0L), maxbytesinoemstring.toInt(), (bytesinoemstring?.value ?: 0L), (unicodestring?.value ?: 0L), bytesinunicodestring.toInt())

public actual fun rtlValidSid(sid: Psid): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlValidSid((sid?.value ?: 0L))

public actual fun rtlValidateUnicodeString(flags: UInt, string: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlValidateUnicodeString(flags.toInt(), (string?.value ?: 0L))

public actual fun rtlxOemStringToUnicodeSize(oemstring: COpaquePointer?): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlxOemStringToUnicodeSize((oemstring?.value ?: 0L)).toUInt()

public actual fun rtlxUnicodeStringToOemSize(unicodestring: COpaquePointer?): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_rtlxUnicodeStringToOemSize((unicodestring?.value ?: 0L)).toUInt()

public actual fun seAccessCheckFromState(securitydescriptor: PsecurityDescriptor, primarytokeninformation: COpaquePointer?, clienttokeninformation: COpaquePointer?, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: COpaquePointer?, genericmapping: COpaquePointer?, accessmode: Byte, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seAccessCheckFromState((securitydescriptor?.value ?: 0L), (primarytokeninformation?.value ?: 0L), (clienttokeninformation?.value ?: 0L), desiredaccess.toInt(), previouslygrantedaccess.toInt(), (privileges?.value ?: 0L), (genericmapping?.value ?: 0L), accessmode, (grantedaccess?.value ?: 0L), (accessstatus?.value ?: 0L))

public actual fun seAccessCheckFromStateEx(securitydescriptor: PsecurityDescriptor, primarytoken: COpaquePointer?, clienttoken: COpaquePointer?, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: COpaquePointer?, genericmapping: COpaquePointer?, accessmode: Byte, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seAccessCheckFromStateEx((securitydescriptor?.value ?: 0L), (primarytoken?.value ?: 0L), (clienttoken?.value ?: 0L), desiredaccess.toInt(), previouslygrantedaccess.toInt(), (privileges?.value ?: 0L), (genericmapping?.value ?: 0L), accessmode, (grantedaccess?.value ?: 0L), (accessstatus?.value ?: 0L))

public actual fun seAdjustAccessStateForAccessConstraints(objecttype: COpaquePointer?, securitydescriptor: PsecurityDescriptor, accessstate: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seAdjustAccessStateForAccessConstraints((objecttype?.value ?: 0L), (securitydescriptor?.value ?: 0L), (accessstate?.value ?: 0L))
}

public actual fun seAdjustAccessStateForTrustLabel(objecttype: COpaquePointer?, securitydescriptor: PsecurityDescriptor, accessstate: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seAdjustAccessStateForTrustLabel((objecttype?.value ?: 0L), (securitydescriptor?.value ?: 0L), (accessstate?.value ?: 0L))
}

public actual fun seAdjustObjectSecurity(objectname: COpaquePointer?, originaldescriptor: PsecurityDescriptor, proposeddescriptor: PsecurityDescriptor, subjectsecuritycontext: COpaquePointer?, adjusteddescriptor: COpaquePointer?, applyadjusteddescriptor: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seAdjustObjectSecurity((objectname?.value ?: 0L), (originaldescriptor?.value ?: 0L), (proposeddescriptor?.value ?: 0L), (subjectsecuritycontext?.value ?: 0L), (adjusteddescriptor?.value ?: 0L), (applyadjusteddescriptor?.value ?: 0L))

public actual fun seAppendPrivileges(accessstate: COpaquePointer?, privileges: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seAppendPrivileges((accessstate?.value ?: 0L), (privileges?.value ?: 0L))

public actual fun seAuditFipsCryptoSelftests(bsuccess: Boolean, selftestcode: UInt) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seAuditFipsCryptoSelftests(bsuccess, selftestcode.toInt())
}

public actual fun seAuditHardLinkCreation(filename: COpaquePointer?, linkname: COpaquePointer?, bsuccess: Boolean) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seAuditHardLinkCreation((filename?.value ?: 0L), (linkname?.value ?: 0L), bsuccess)
}

public actual fun seAuditHardLinkCreationWithTransaction(filename: COpaquePointer?, linkname: COpaquePointer?, bsuccess: Boolean, transactionid: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seAuditHardLinkCreationWithTransaction((filename?.value ?: 0L), (linkname?.value ?: 0L), bsuccess, (transactionid?.value ?: 0L))
}

public actual fun seAuditTransactionStateChange(transactionid: COpaquePointer?, resourcemanagerid: COpaquePointer?, newtransactionstate: UInt) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seAuditTransactionStateChange((transactionid?.value ?: 0L), (resourcemanagerid?.value ?: 0L), newtransactionstate.toInt())
}

public actual fun seAuditingAnyFileEventsWithContext(securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seAuditingAnyFileEventsWithContext((securitydescriptor?.value ?: 0L), (subjectsecuritycontext?.value ?: 0L))

public actual fun seAuditingAnyFileEventsWithContextEx(securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: COpaquePointer?, stagingenabled: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seAuditingAnyFileEventsWithContextEx((securitydescriptor?.value ?: 0L), (subjectsecuritycontext?.value ?: 0L), (stagingenabled?.value ?: 0L))

public actual fun seAuditingFileEvents(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seAuditingFileEvents(accessgranted, (securitydescriptor?.value ?: 0L))

public actual fun seAuditingFileEventsWithContext(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seAuditingFileEventsWithContext(accessgranted, (securitydescriptor?.value ?: 0L), (subjectsecuritycontext?.value ?: 0L))

public actual fun seAuditingFileEventsWithContextEx(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: COpaquePointer?, stagingenabled: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seAuditingFileEventsWithContextEx(accessgranted, (securitydescriptor?.value ?: 0L), (subjectsecuritycontext?.value ?: 0L), (stagingenabled?.value ?: 0L))

public actual fun seAuditingFileOrGlobalEvents(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seAuditingFileOrGlobalEvents(accessgranted, (securitydescriptor?.value ?: 0L), (subjectsecuritycontext?.value ?: 0L))

public actual fun seAuditingHardLinkEvents(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seAuditingHardLinkEvents(accessgranted, (securitydescriptor?.value ?: 0L))

public actual fun seAuditingHardLinkEventsWithContext(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seAuditingHardLinkEventsWithContext(accessgranted, (securitydescriptor?.value ?: 0L), (subjectsecuritycontext?.value ?: 0L))

public actual fun seCaptureSubjectContextEx(thread: Pethread, process: Peprocess, subjectcontext: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seCaptureSubjectContextEx(thread, process, (subjectcontext?.value ?: 0L))
}

public actual fun seCheckForCriticalAceRemoval(currentdescriptor: PsecurityDescriptor, newdescriptor: PsecurityDescriptor, subjectsecuritycontext: COpaquePointer?, aceremoved: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seCheckForCriticalAceRemoval((currentdescriptor?.value ?: 0L), (newdescriptor?.value ?: 0L), (subjectsecuritycontext?.value ?: 0L), (aceremoved?.value ?: 0L))
}

public actual fun seCreateClientSecurity(clientthread: Pethread, clientsecurityqos: COpaquePointer?, remotesession: Boolean, clientcontext: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seCreateClientSecurity(clientthread, (clientsecurityqos?.value ?: 0L), remotesession, (clientcontext?.value ?: 0L))

public actual fun seCreateClientSecurityFromSubjectContext(subjectcontext: COpaquePointer?, clientsecurityqos: COpaquePointer?, serverisremote: Boolean, clientcontext: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seCreateClientSecurityFromSubjectContext((subjectcontext?.value ?: 0L), (clientsecurityqos?.value ?: 0L), serverisremote, (clientcontext?.value ?: 0L))

public actual fun seDeleteClientSecurity(clientcontext: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seDeleteClientSecurity((clientcontext?.value ?: 0L))
}

public actual fun seDeleteObjectAuditAlarm(obj: COpaquePointer?, handle: Handle) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seDeleteObjectAuditAlarm((obj?.value ?: 0L), (handle?.value ?: 0L))
}

public actual fun seDeleteObjectAuditAlarmWithTransaction(obj: COpaquePointer?, handle: Handle, transactionid: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seDeleteObjectAuditAlarmWithTransaction((obj?.value ?: 0L), (handle?.value ?: 0L), (transactionid?.value ?: 0L))
}

public actual fun seExamineSacl(sacl: COpaquePointer?, resourcesacl: COpaquePointer?, token: COpaquePointer?, desiredaccess: UInt, accessgranted: Boolean, generateaudit: COpaquePointer?, generatealarm: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seExamineSacl((sacl?.value ?: 0L), (resourcesacl?.value ?: 0L), (token?.value ?: 0L), desiredaccess.toInt(), accessgranted, (generateaudit?.value ?: 0L), (generatealarm?.value ?: 0L))
}

public actual fun seFilterToken(existingtoken: COpaquePointer?, flags: UInt, sidstodisable: COpaquePointer?, privilegestodelete: COpaquePointer?, restrictedsids: COpaquePointer?, filteredtoken: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seFilterToken((existingtoken?.value ?: 0L), flags.toInt(), (sidstodisable?.value ?: 0L), (privilegestodelete?.value ?: 0L), (restrictedsids?.value ?: 0L), (filteredtoken?.value ?: 0L))

public actual fun seFreePrivileges(privileges: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seFreePrivileges((privileges?.value ?: 0L))
}

public actual fun seImpersonateClient(clientcontext: COpaquePointer?, serverthread: Pethread) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seImpersonateClient((clientcontext?.value ?: 0L), serverthread)
}

public actual fun seImpersonateClientEx(clientcontext: COpaquePointer?, serverthread: Pethread): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seImpersonateClientEx((clientcontext?.value ?: 0L), serverthread)

public actual fun seLocateProcessImageName(process: Peprocess, pimagefilename: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seLocateProcessImageName(process, (pimagefilename?.value ?: 0L))

public actual fun seMarkLogonSessionForTerminationNotification(logonid: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seMarkLogonSessionForTerminationNotification((logonid?.value ?: 0L))

public actual fun seMarkLogonSessionForTerminationNotificationEx(logonid: COpaquePointer?, pserversilo: Pesilo): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seMarkLogonSessionForTerminationNotificationEx((logonid?.value ?: 0L), pserversilo)

public actual fun seOpenObjectAuditAlarm(objecttypename: COpaquePointer?, obj: COpaquePointer?, absoluteobjectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, accessstate: COpaquePointer?, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, generateonclose: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seOpenObjectAuditAlarm((objecttypename?.value ?: 0L), (obj?.value ?: 0L), (absoluteobjectname?.value ?: 0L), (securitydescriptor?.value ?: 0L), (accessstate?.value ?: 0L), objectcreated, accessgranted, accessmode, (generateonclose?.value ?: 0L))
}

public actual fun seOpenObjectAuditAlarmWithTransaction(objecttypename: COpaquePointer?, obj: COpaquePointer?, absoluteobjectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, accessstate: COpaquePointer?, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, transactionid: COpaquePointer?, generateonclose: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seOpenObjectAuditAlarmWithTransaction((objecttypename?.value ?: 0L), (obj?.value ?: 0L), (absoluteobjectname?.value ?: 0L), (securitydescriptor?.value ?: 0L), (accessstate?.value ?: 0L), objectcreated, accessgranted, accessmode, (transactionid?.value ?: 0L), (generateonclose?.value ?: 0L))
}

public actual fun seOpenObjectForDeleteAuditAlarm(objecttypename: COpaquePointer?, obj: COpaquePointer?, absoluteobjectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, accessstate: COpaquePointer?, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, generateonclose: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seOpenObjectForDeleteAuditAlarm((objecttypename?.value ?: 0L), (obj?.value ?: 0L), (absoluteobjectname?.value ?: 0L), (securitydescriptor?.value ?: 0L), (accessstate?.value ?: 0L), objectcreated, accessgranted, accessmode, (generateonclose?.value ?: 0L))
}

public actual fun seOpenObjectForDeleteAuditAlarmWithTransaction(objecttypename: COpaquePointer?, obj: COpaquePointer?, absoluteobjectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, accessstate: COpaquePointer?, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, transactionid: COpaquePointer?, generateonclose: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seOpenObjectForDeleteAuditAlarmWithTransaction((objecttypename?.value ?: 0L), (obj?.value ?: 0L), (absoluteobjectname?.value ?: 0L), (securitydescriptor?.value ?: 0L), (accessstate?.value ?: 0L), objectcreated, accessgranted, accessmode, (transactionid?.value ?: 0L), (generateonclose?.value ?: 0L))
}

public actual fun sePrivilegeCheck(requiredprivileges: COpaquePointer?, subjectsecuritycontext: COpaquePointer?, accessmode: Byte): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_sePrivilegeCheck((requiredprivileges?.value ?: 0L), (subjectsecuritycontext?.value ?: 0L), accessmode)

public actual fun seQueryAuthenticationIdToken(token: COpaquePointer?, authenticationid: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seQueryAuthenticationIdToken((token?.value ?: 0L), (authenticationid?.value ?: 0L))

public actual fun seQueryInformationToken(token: COpaquePointer?, tokeninformationclass: TokenInformationClass, tokeninformation: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seQueryInformationToken((token?.value ?: 0L), tokeninformationclass, (tokeninformation?.value ?: 0L))

public actual fun seQuerySecurityDescriptorInfo(securityinformation: COpaquePointer?, securitydescriptor: PsecurityDescriptor, length: COpaquePointer?, objectssecuritydescriptor: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seQuerySecurityDescriptorInfo((securityinformation?.value ?: 0L), (securitydescriptor?.value ?: 0L), (length?.value ?: 0L), (objectssecuritydescriptor?.value ?: 0L))

public actual fun seQueryServerSiloToken(token: COpaquePointer?, pserversilo: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seQueryServerSiloToken((token?.value ?: 0L), (pserversilo?.value ?: 0L))

public actual fun seQuerySessionIdToken(token: COpaquePointer?, sessionid: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seQuerySessionIdToken((token?.value ?: 0L), (sessionid?.value ?: 0L))

public actual fun seQuerySessionIdTokenEx(token: COpaquePointer?, sessionid: COpaquePointer?, isservicesession: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seQuerySessionIdTokenEx((token?.value ?: 0L), (sessionid?.value ?: 0L), (isservicesession?.value ?: 0L))

public actual fun seRegisterLogonSessionTerminatedRoutine(callbackroutine: PseLogonSessionTerminatedRoutine): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seRegisterLogonSessionTerminatedRoutine(0L)

public actual fun seRegisterLogonSessionTerminatedRoutineEx(callbackroutine: PseLogonSessionTerminatedRoutineEx, context: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seRegisterLogonSessionTerminatedRoutineEx(0L, (context?.value ?: 0L))

public actual fun seReportSecurityEventWithSubCategory(flags: UInt, sourcename: COpaquePointer?, usersid: Psid, auditparameters: COpaquePointer?, auditsubcategoryid: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seReportSecurityEventWithSubCategory(flags.toInt(), (sourcename?.value ?: 0L), (usersid?.value ?: 0L), (auditparameters?.value ?: 0L), auditsubcategoryid.toInt())

public actual fun seSetAccessStateGenericMapping(accessstate: COpaquePointer?, genericmapping: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seSetAccessStateGenericMapping((accessstate?.value ?: 0L), (genericmapping?.value ?: 0L))
}

public actual fun seSetSecurityDescriptorInfo(obj: COpaquePointer?, securityinformation: COpaquePointer?, modificationdescriptor: PsecurityDescriptor, objectssecuritydescriptor: COpaquePointer?, pooltype: PoolType, genericmapping: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seSetSecurityDescriptorInfo((obj?.value ?: 0L), (securityinformation?.value ?: 0L), (modificationdescriptor?.value ?: 0L), (objectssecuritydescriptor?.value ?: 0L), pooltype, (genericmapping?.value ?: 0L))

public actual fun seSetSecurityDescriptorInfoEx(obj: COpaquePointer?, securityinformation: COpaquePointer?, modificationdescriptor: PsecurityDescriptor, objectssecuritydescriptor: COpaquePointer?, autoinheritflags: UInt, pooltype: PoolType, genericmapping: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seSetSecurityDescriptorInfoEx((obj?.value ?: 0L), (securityinformation?.value ?: 0L), (modificationdescriptor?.value ?: 0L), (objectssecuritydescriptor?.value ?: 0L), autoinheritflags.toInt(), pooltype, (genericmapping?.value ?: 0L))

public actual fun seShouldCheckForAccessRightsFromParent(objecttype: COpaquePointer?, childdescriptor: PsecurityDescriptor, accessstate: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seShouldCheckForAccessRightsFromParent((objecttype?.value ?: 0L), (childdescriptor?.value ?: 0L), (accessstate?.value ?: 0L))

public actual fun seTokenFromAccessInformation(accessinformation: COpaquePointer?, token: COpaquePointer?, length: UInt, requiredlength: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seTokenFromAccessInformation((accessinformation?.value ?: 0L), (token?.value ?: 0L), length.toInt(), (requiredlength?.value ?: 0L))

public actual fun seTokenIsAdmin(token: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seTokenIsAdmin((token?.value ?: 0L))

public actual fun seTokenIsRestricted(token: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seTokenIsRestricted((token?.value ?: 0L))

public actual fun seTokenIsWriteRestricted(token: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seTokenIsWriteRestricted((token?.value ?: 0L))

public actual fun seTokenType(token: COpaquePointer?): TokenType =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seTokenType((token?.value ?: 0L))

public actual fun seUnregisterLogonSessionTerminatedRoutine(callbackroutine: PseLogonSessionTerminatedRoutine): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seUnregisterLogonSessionTerminatedRoutine(0L)

public actual fun seUnregisterLogonSessionTerminatedRoutineEx(callbackroutine: PseLogonSessionTerminatedRoutineEx, context: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_seUnregisterLogonSessionTerminatedRoutineEx(0L, (context?.value ?: 0L))

public actual fun secLookupAccountName(name: COpaquePointer?, sidsize: COpaquePointer?, sid: Psid, nameuse: COpaquePointer?, domainsize: COpaquePointer?, referenceddomain: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_secLookupAccountName((name?.value ?: 0L), (sidsize?.value ?: 0L), (sid?.value ?: 0L), (nameuse?.value ?: 0L), (domainsize?.value ?: 0L), (referenceddomain?.value ?: 0L))

public actual fun secLookupAccountSid(sid: Psid, namesize: COpaquePointer?, namebuffer: COpaquePointer?, domainsize: COpaquePointer?, domainbuffer: COpaquePointer?, nameuse: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_secLookupAccountSid((sid?.value ?: 0L), (namesize?.value ?: 0L), (namebuffer?.value ?: 0L), (domainsize?.value ?: 0L), (domainbuffer?.value ?: 0L), (nameuse?.value ?: 0L))

public actual fun secLookupWellKnownSid(sidtype: WellKnownSidType, sid: Psid, sidbuffersize: UInt, sidsize: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_secLookupWellKnownSid(sidtype, (sid?.value ?: 0L), sidbuffersize.toInt(), (sidsize?.value ?: 0L))

public actual fun secMakeSPN(serviceclass: COpaquePointer?, servicename: COpaquePointer?, instancename: COpaquePointer?, instanceport: UShort, referrer: COpaquePointer?, spn: COpaquePointer?, length: COpaquePointer?, allocate: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_secMakeSPN((serviceclass?.value ?: 0L), (servicename?.value ?: 0L), (instancename?.value ?: 0L), instanceport.toShort(), (referrer?.value ?: 0L), (spn?.value ?: 0L), (length?.value ?: 0L), allocate)

public actual fun secMakeSPNEx(serviceclass: COpaquePointer?, servicename: COpaquePointer?, instancename: COpaquePointer?, instanceport: UShort, referrer: COpaquePointer?, targetinfo: COpaquePointer?, spn: COpaquePointer?, length: COpaquePointer?, allocate: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_secMakeSPNEx((serviceclass?.value ?: 0L), (servicename?.value ?: 0L), (instancename?.value ?: 0L), instanceport.toShort(), (referrer?.value ?: 0L), (targetinfo?.value ?: 0L), (spn?.value ?: 0L), (length?.value ?: 0L), allocate)

public actual fun secMakeSPNEx2(serviceclass: COpaquePointer?, servicename: COpaquePointer?, instancename: COpaquePointer?, instanceport: UShort, referrer: COpaquePointer?, intargetinfo: COpaquePointer?, spn: COpaquePointer?, totalsize: COpaquePointer?, allocate: Boolean, istargetinfomarshaled: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_secMakeSPNEx2((serviceclass?.value ?: 0L), (servicename?.value ?: 0L), (instancename?.value ?: 0L), instanceport.toShort(), (referrer?.value ?: 0L), (intargetinfo?.value ?: 0L), (spn?.value ?: 0L), (totalsize?.value ?: 0L), allocate, istargetinfomarshaled)

public actual fun setContextAttributesW(phcontext: COpaquePointer?, ulattribute: UInt, pbuffer: COpaquePointer?, cbbuffer: UInt): Hresult =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_setContextAttributesW((phcontext?.value ?: 0L), ulattribute.toInt(), (pbuffer?.value ?: 0L), cbbuffer.toInt())

public actual fun sspiAcceptSecurityContextAsync(asynccontext: COpaquePointer?, phcredential: COpaquePointer?, phcontext: COpaquePointer?, pinput: COpaquePointer?, fcontextreq: UInt, targetdatarep: UInt, phnewcontext: COpaquePointer?, poutput: COpaquePointer?, pfcontextattr: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_sspiAcceptSecurityContextAsync((asynccontext?.value ?: 0L), (phcredential?.value ?: 0L), (phcontext?.value ?: 0L), (pinput?.value ?: 0L), fcontextreq.toInt(), targetdatarep.toInt(), (phnewcontext?.value ?: 0L), (poutput?.value ?: 0L), (pfcontextattr?.value ?: 0L), (ptsexpiry?.value ?: 0L))

public actual fun sspiAcquireCredentialsHandleAsyncA(asynccontext: COpaquePointer?, pszprincipal: Pcstr, pszpackage: Pcstr, fcredentialuse: UInt, pvlogonid: COpaquePointer?, pauthdata: COpaquePointer?, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: COpaquePointer?, phcredential: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    0

public actual fun sspiAcquireCredentialsHandleAsyncW(asynccontext: COpaquePointer?, pszprincipal: COpaquePointer?, pszpackage: COpaquePointer?, fcredentialuse: UInt, pvlogonid: COpaquePointer?, pauthdata: COpaquePointer?, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: COpaquePointer?, phcredential: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    0

public actual fun sspiCreateAsyncContext(): COpaquePointer? =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_sspiCreateAsyncContext().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sspiDeleteSecurityContextAsync(asynccontext: COpaquePointer?, phcontext: COpaquePointer?): Hresult =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_sspiDeleteSecurityContextAsync((asynccontext?.value ?: 0L), (phcontext?.value ?: 0L))

public actual fun sspiFreeAsyncContext(handle: COpaquePointer?) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_sspiFreeAsyncContext((handle?.value ?: 0L))
}

public actual fun sspiFreeCredentialsHandleAsync(asynccontext: COpaquePointer?, phcredential: COpaquePointer?): Hresult =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_sspiFreeCredentialsHandleAsync((asynccontext?.value ?: 0L), (phcredential?.value ?: 0L))

public actual fun sspiGetAsyncCallStatus(handle: COpaquePointer?): Hresult =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_sspiGetAsyncCallStatus((handle?.value ?: 0L))

public actual fun sspiInitializeSecurityContextAsyncA(asynccontext: COpaquePointer?, phcredential: COpaquePointer?, phcontext: COpaquePointer?, psztargetname: Pcstr, fcontextreq: UInt, reserved1: UInt, targetdatarep: UInt, pinput: COpaquePointer?, reserved2: UInt, phnewcontext: COpaquePointer?, poutput: COpaquePointer?, pfcontextattr: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_sspiInitializeSecurityContextAsyncA((asynccontext?.value ?: 0L), (phcredential?.value ?: 0L), (phcontext?.value ?: 0L), (psztargetname?.value ?: 0L), fcontextreq.toInt(), reserved1.toInt(), targetdatarep.toInt(), (pinput?.value ?: 0L), reserved2.toInt(), (phnewcontext?.value ?: 0L), (poutput?.value ?: 0L), (pfcontextattr?.value ?: 0L), (ptsexpiry?.value ?: 0L))

public actual fun sspiInitializeSecurityContextAsyncW(asynccontext: COpaquePointer?, phcredential: COpaquePointer?, phcontext: COpaquePointer?, psztargetname: COpaquePointer?, fcontextreq: UInt, reserved1: UInt, targetdatarep: UInt, pinput: COpaquePointer?, reserved2: UInt, phnewcontext: COpaquePointer?, poutput: COpaquePointer?, pfcontextattr: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_sspiInitializeSecurityContextAsyncW((asynccontext?.value ?: 0L), (phcredential?.value ?: 0L), (phcontext?.value ?: 0L), (psztargetname?.value ?: 0L), fcontextreq.toInt(), reserved1.toInt(), targetdatarep.toInt(), (pinput?.value ?: 0L), reserved2.toInt(), (phnewcontext?.value ?: 0L), (poutput?.value ?: 0L), (pfcontextattr?.value ?: 0L), (ptsexpiry?.value ?: 0L))

public actual fun sspiReinitAsyncContext(handle: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_sspiReinitAsyncContext((handle?.value ?: 0L))

public actual fun sspiSetAsyncNotifyCallback(context: COpaquePointer?, callback: SspiAsyncNotifyCallback, callbackdata: COpaquePointer?): Hresult =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_sspiSetAsyncNotifyCallback((context?.value ?: 0L), 0L, (callbackdata?.value ?: 0L))

public actual fun verifySignature(phcontext: COpaquePointer?, pmessage: COpaquePointer?, messageseqno: UInt, pfqop: COpaquePointer?): Hresult =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_verifySignature((phcontext?.value ?: 0L), (pmessage?.value ?: 0L), messageseqno.toInt(), (pfqop?.value ?: 0L))

public actual fun zwAccessCheckAndAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, objecttypename: COpaquePointer?, objectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, desiredaccess: UInt, genericmapping: COpaquePointer?, objectcreation: Boolean, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, generateonclose: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwAccessCheckAndAuditAlarm((subsystemname?.value ?: 0L), (handleid?.value ?: 0L), (objecttypename?.value ?: 0L), (objectname?.value ?: 0L), (securitydescriptor?.value ?: 0L), desiredaccess.toInt(), (genericmapping?.value ?: 0L), objectcreation, (grantedaccess?.value ?: 0L), (accessstatus?.value ?: 0L), (generateonclose?.value ?: 0L))

public actual fun zwAccessCheckByTypeAndAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, objecttypename: COpaquePointer?, objectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Boolean, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, generateonclose: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwAccessCheckByTypeAndAuditAlarm((subsystemname?.value ?: 0L), (handleid?.value ?: 0L), (objecttypename?.value ?: 0L), (objectname?.value ?: 0L), (securitydescriptor?.value ?: 0L), (principalselfsid?.value ?: 0L), desiredaccess.toInt(), audittype, flags.toInt(), (objecttypelist?.value ?: 0L), objecttypelistlength.toInt(), (genericmapping?.value ?: 0L), objectcreation, (grantedaccess?.value ?: 0L), (accessstatus?.value ?: 0L), (generateonclose?.value ?: 0L))

public actual fun zwAccessCheckByTypeResultListAndAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, objecttypename: COpaquePointer?, objectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Boolean, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, generateonclose: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwAccessCheckByTypeResultListAndAuditAlarm((subsystemname?.value ?: 0L), (handleid?.value ?: 0L), (objecttypename?.value ?: 0L), (objectname?.value ?: 0L), (securitydescriptor?.value ?: 0L), (principalselfsid?.value ?: 0L), desiredaccess.toInt(), audittype, flags.toInt(), (objecttypelist?.value ?: 0L), objecttypelistlength.toInt(), (genericmapping?.value ?: 0L), objectcreation, (grantedaccess?.value ?: 0L), (accessstatus?.value ?: 0L), (generateonclose?.value ?: 0L))

public actual fun zwAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname: COpaquePointer?, handleid: COpaquePointer?, clienttoken: Handle, objecttypename: COpaquePointer?, objectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Boolean, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, generateonclose: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwAccessCheckByTypeResultListAndAuditAlarmByHandle((subsystemname?.value ?: 0L), (handleid?.value ?: 0L), (clienttoken?.value ?: 0L), (objecttypename?.value ?: 0L), (objectname?.value ?: 0L), (securitydescriptor?.value ?: 0L), (principalselfsid?.value ?: 0L), desiredaccess.toInt(), audittype, flags.toInt(), (objecttypelist?.value ?: 0L), objecttypelistlength.toInt(), (genericmapping?.value ?: 0L), objectcreation, (grantedaccess?.value ?: 0L), (accessstatus?.value ?: 0L), (generateonclose?.value ?: 0L))

public actual fun zwAdjustGroupsToken(tokenhandle: Handle, resettodefault: Boolean, newstate: COpaquePointer?, bufferlength: UInt, previousstate: COpaquePointer?, returnlength: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwAdjustGroupsToken((tokenhandle?.value ?: 0L), resettodefault, (newstate?.value ?: 0L), bufferlength.toInt(), (previousstate?.value ?: 0L), (returnlength?.value ?: 0L))

public actual fun zwAdjustPrivilegesToken(tokenhandle: Handle, disableallprivileges: Boolean, newstate: COpaquePointer?, bufferlength: UInt, previousstate: COpaquePointer?, returnlength: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwAdjustPrivilegesToken((tokenhandle?.value ?: 0L), disableallprivileges, (newstate?.value ?: 0L), bufferlength.toInt(), (previousstate?.value ?: 0L), (returnlength?.value ?: 0L))

public actual fun zwAllocateVirtualMemory(processhandle: Handle, baseaddress: COpaquePointer?, zerobits: ULong, regionsize: COpaquePointer?, allocationtype: UInt, protect: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwAllocateVirtualMemory((processhandle?.value ?: 0L), (baseaddress?.value ?: 0L), zerobits.toLong(), (regionsize?.value ?: 0L), allocationtype.toInt(), protect.toInt())

public actual fun zwAllocateVirtualMemoryEx(processhandle: Handle, baseaddress: COpaquePointer?, regionsize: COpaquePointer?, allocationtype: UInt, pageprotection: UInt, extendedparameters: COpaquePointer?, extendedparametercount: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwAllocateVirtualMemoryEx((processhandle?.value ?: 0L), (baseaddress?.value ?: 0L), (regionsize?.value ?: 0L), allocationtype.toInt(), pageprotection.toInt(), (extendedparameters?.value ?: 0L), extendedparametercount.toInt())

public actual fun zwCancelIoFileEx(filehandle: Handle, iorequesttocancel: COpaquePointer?, iostatusblock: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwCancelIoFileEx((filehandle?.value ?: 0L), (iorequesttocancel?.value ?: 0L), (iostatusblock?.value ?: 0L))

public actual fun zwCloseObjectAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, generateonclose: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwCloseObjectAuditAlarm((subsystemname?.value ?: 0L), (handleid?.value ?: 0L), generateonclose)

public actual fun zwCreateDirectoryObject(directoryhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwCreateDirectoryObject((directoryhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L))

public actual fun zwCreateEvent(eventhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, eventtype: EventType, initialstate: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwCreateEvent((eventhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), eventtype, initialstate)

public actual fun zwCreateSectionEx(sectionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, maximumsize: COpaquePointer?, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Handle, extendedparameters: COpaquePointer?, extendedparametercount: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwCreateSectionEx((sectionhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), (maximumsize?.value ?: 0L), sectionpageprotection.toInt(), allocationattributes.toInt(), (filehandle?.value ?: 0L), (extendedparameters?.value ?: 0L), extendedparametercount.toInt())

public actual fun zwDeleteFile(objectattributes: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwDeleteFile((objectattributes?.value ?: 0L))

public actual fun zwDeleteObjectAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, generateonclose: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwDeleteObjectAuditAlarm((subsystemname?.value ?: 0L), (handleid?.value ?: 0L), generateonclose)

public actual fun zwDuplicateObject(sourceprocesshandle: Handle, sourcehandle: Handle, targetprocesshandle: Handle, targethandle: COpaquePointer?, desiredaccess: UInt, handleattributes: UInt, options: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwDuplicateObject((sourceprocesshandle?.value ?: 0L), (sourcehandle?.value ?: 0L), (targetprocesshandle?.value ?: 0L), (targethandle?.value ?: 0L), desiredaccess.toInt(), handleattributes.toInt(), options.toInt())

public actual fun zwDuplicateToken(existingtokenhandle: Handle, desiredaccess: UInt, objectattributes: COpaquePointer?, effectiveonly: Boolean, tokentype: TokenType, newtokenhandle: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwDuplicateToken((existingtokenhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), effectiveonly, tokentype, (newtokenhandle?.value ?: 0L))

public actual fun zwFilterToken(existingtokenhandle: Handle, flags: UInt, sidstodisable: COpaquePointer?, privilegestodelete: COpaquePointer?, restrictedsids: COpaquePointer?, newtokenhandle: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwFilterToken((existingtokenhandle?.value ?: 0L), flags.toInt(), (sidstodisable?.value ?: 0L), (privilegestodelete?.value ?: 0L), (restrictedsids?.value ?: 0L), (newtokenhandle?.value ?: 0L))

public actual fun zwFlushBuffersFile(filehandle: Handle, iostatusblock: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwFlushBuffersFile((filehandle?.value ?: 0L), (iostatusblock?.value ?: 0L))

public actual fun zwFlushBuffersFileEx(filehandle: Handle, flags: UInt, parameters: COpaquePointer?, parameterssize: UInt, iostatusblock: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwFlushBuffersFileEx((filehandle?.value ?: 0L), flags.toInt(), (parameters?.value ?: 0L), parameterssize.toInt(), (iostatusblock?.value ?: 0L))

public actual fun zwFlushVirtualMemory(processhandle: Handle, baseaddress: COpaquePointer?, regionsize: COpaquePointer?, iostatus: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwFlushVirtualMemory((processhandle?.value ?: 0L), (baseaddress?.value ?: 0L), (regionsize?.value ?: 0L), (iostatus?.value ?: 0L))

public actual fun zwFreeVirtualMemory(processhandle: Handle, baseaddress: COpaquePointer?, regionsize: COpaquePointer?, freetype: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwFreeVirtualMemory((processhandle?.value ?: 0L), (baseaddress?.value ?: 0L), (regionsize?.value ?: 0L), freetype.toInt())

public actual fun zwFsControlFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, fscontrolcode: UInt, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwFsControlFile((filehandle?.value ?: 0L), (event?.value ?: 0L), 0L, (apccontext?.value ?: 0L), (iostatusblock?.value ?: 0L), fscontrolcode.toInt(), (inputbuffer?.value ?: 0L), inputbufferlength.toInt(), (outputbuffer?.value ?: 0L), outputbufferlength.toInt())

public actual fun zwImpersonateAnonymousToken(threadhandle: Handle): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwImpersonateAnonymousToken((threadhandle?.value ?: 0L))

public actual fun zwLockFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, byteoffset: COpaquePointer?, length: COpaquePointer?, key: UInt, failimmediately: Boolean, exclusivelock: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwLockFile((filehandle?.value ?: 0L), (event?.value ?: 0L), 0L, (apccontext?.value ?: 0L), (iostatusblock?.value ?: 0L), (byteoffset?.value ?: 0L), (length?.value ?: 0L), key.toInt(), failimmediately, exclusivelock)

public actual fun zwNotifyChangeKey(keyhandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, completionfilter: UInt, watchtree: Boolean, buffer: COpaquePointer?, buffersize: UInt, asynchronous: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwNotifyChangeKey((keyhandle?.value ?: 0L), (event?.value ?: 0L), 0L, (apccontext?.value ?: 0L), (iostatusblock?.value ?: 0L), completionfilter.toInt(), watchtree, (buffer?.value ?: 0L), buffersize.toInt(), asynchronous)

public actual fun zwOpenDirectoryObject(directoryhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwOpenDirectoryObject((directoryhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L))

public actual fun zwOpenObjectAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, objecttypename: COpaquePointer?, objectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, grantedaccess: UInt, privileges: COpaquePointer?, objectcreation: Boolean, accessgranted: Boolean, generateonclose: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwOpenObjectAuditAlarm((subsystemname?.value ?: 0L), (handleid?.value ?: 0L), (objecttypename?.value ?: 0L), (objectname?.value ?: 0L), (securitydescriptor?.value ?: 0L), (clienttoken?.value ?: 0L), desiredaccess.toInt(), grantedaccess.toInt(), (privileges?.value ?: 0L), objectcreation, accessgranted, (generateonclose?.value ?: 0L))

public actual fun zwOpenProcessToken(processhandle: Handle, desiredaccess: UInt, tokenhandle: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwOpenProcessToken((processhandle?.value ?: 0L), desiredaccess.toInt(), (tokenhandle?.value ?: 0L))

public actual fun zwOpenProcessTokenEx(processhandle: Handle, desiredaccess: UInt, handleattributes: UInt, tokenhandle: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwOpenProcessTokenEx((processhandle?.value ?: 0L), desiredaccess.toInt(), handleattributes.toInt(), (tokenhandle?.value ?: 0L))

public actual fun zwOpenThreadToken(threadhandle: Handle, desiredaccess: UInt, openasself: Boolean, tokenhandle: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwOpenThreadToken((threadhandle?.value ?: 0L), desiredaccess.toInt(), openasself, (tokenhandle?.value ?: 0L))

public actual fun zwOpenThreadTokenEx(threadhandle: Handle, desiredaccess: UInt, openasself: Boolean, handleattributes: UInt, tokenhandle: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwOpenThreadTokenEx((threadhandle?.value ?: 0L), desiredaccess.toInt(), openasself, handleattributes.toInt(), (tokenhandle?.value ?: 0L))

public actual fun zwPrivilegeCheck(clienttoken: Handle, requiredprivileges: COpaquePointer?, result: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwPrivilegeCheck((clienttoken?.value ?: 0L), (requiredprivileges?.value ?: 0L), (result?.value ?: 0L))

public actual fun zwPrivilegeObjectAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, clienttoken: Handle, desiredaccess: UInt, privileges: COpaquePointer?, accessgranted: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwPrivilegeObjectAuditAlarm((subsystemname?.value ?: 0L), (handleid?.value ?: 0L), (clienttoken?.value ?: 0L), desiredaccess.toInt(), (privileges?.value ?: 0L), accessgranted)

public actual fun zwPrivilegedServiceAuditAlarm(subsystemname: COpaquePointer?, servicename: COpaquePointer?, clienttoken: Handle, privileges: COpaquePointer?, accessgranted: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwPrivilegedServiceAuditAlarm((subsystemname?.value ?: 0L), (servicename?.value ?: 0L), (clienttoken?.value ?: 0L), (privileges?.value ?: 0L), accessgranted)

public actual fun zwQueryDirectoryFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass, returnsingleentry: Boolean, filename: COpaquePointer?, restartscan: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwQueryDirectoryFile((filehandle?.value ?: 0L), (event?.value ?: 0L), 0L, (apccontext?.value ?: 0L), (iostatusblock?.value ?: 0L), (fileinformation?.value ?: 0L), length.toInt(), fileinformationclass, returnsingleentry, (filename?.value ?: 0L), restartscan)

public actual fun zwQueryDirectoryFileEx(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass, queryflags: UInt, filename: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwQueryDirectoryFileEx((filehandle?.value ?: 0L), (event?.value ?: 0L), 0L, (apccontext?.value ?: 0L), (iostatusblock?.value ?: 0L), (fileinformation?.value ?: 0L), length.toInt(), fileinformationclass, queryflags.toInt(), (filename?.value ?: 0L))

public actual fun zwQueryDirectoryObject(directoryhandle: Handle, buffer: COpaquePointer?, length: UInt, returnsingleentry: Boolean, restartscan: Boolean, context: COpaquePointer?, returnlength: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwQueryDirectoryObject((directoryhandle?.value ?: 0L), (buffer?.value ?: 0L), length.toInt(), returnsingleentry, restartscan, (context?.value ?: 0L), (returnlength?.value ?: 0L))

public actual fun zwQueryEaFile(filehandle: Handle, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt, returnsingleentry: Boolean, ealist: COpaquePointer?, ealistlength: UInt, eaindex: COpaquePointer?, restartscan: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwQueryEaFile((filehandle?.value ?: 0L), (iostatusblock?.value ?: 0L), (buffer?.value ?: 0L), length.toInt(), returnsingleentry, (ealist?.value ?: 0L), ealistlength.toInt(), (eaindex?.value ?: 0L), restartscan)

public actual fun zwQueryFullAttributesFile(objectattributes: COpaquePointer?, fileinformation: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwQueryFullAttributesFile((objectattributes?.value ?: 0L), (fileinformation?.value ?: 0L))

public actual fun zwQueryInformationToken(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: COpaquePointer?, tokeninformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwQueryInformationToken((tokenhandle?.value ?: 0L), tokeninformationclass, (tokeninformation?.value ?: 0L), tokeninformationlength.toInt(), (returnlength?.value ?: 0L))

public actual fun zwQueryObject(handle: Handle, objectinformationclass: ObjectInformationClass, objectinformation: COpaquePointer?, objectinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwQueryObject((handle?.value ?: 0L), objectinformationclass, (objectinformation?.value ?: 0L), objectinformationlength.toInt(), (returnlength?.value ?: 0L))

public actual fun zwQueryQuotaInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt, returnsingleentry: Boolean, sidlist: COpaquePointer?, sidlistlength: UInt, startsid: Psid, restartscan: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwQueryQuotaInformationFile((filehandle?.value ?: 0L), (iostatusblock?.value ?: 0L), (buffer?.value ?: 0L), length.toInt(), returnsingleentry, (sidlist?.value ?: 0L), sidlistlength.toInt(), (startsid?.value ?: 0L), restartscan)

public actual fun zwQuerySecurityObject(handle: Handle, securityinformation: UInt, securitydescriptor: PsecurityDescriptor, length: UInt, lengthneeded: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwQuerySecurityObject((handle?.value ?: 0L), securityinformation.toInt(), (securitydescriptor?.value ?: 0L), length.toInt(), (lengthneeded?.value ?: 0L))

public actual fun zwQueryVirtualMemory(processhandle: Handle, baseaddress: COpaquePointer?, memoryinformationclass: MemoryInformationClass, memoryinformation: COpaquePointer?, memoryinformationlength: ULong, returnlength: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwQueryVirtualMemory((processhandle?.value ?: 0L), (baseaddress?.value ?: 0L), memoryinformationclass, (memoryinformation?.value ?: 0L), memoryinformationlength.toLong(), (returnlength?.value ?: 0L))

public actual fun zwQueryVolumeInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, fsinformation: COpaquePointer?, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwQueryVolumeInformationFile((filehandle?.value ?: 0L), (iostatusblock?.value ?: 0L), (fsinformation?.value ?: 0L), length.toInt(), fsinformationclass)

public actual fun zwSetEaFile(filehandle: Handle, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwSetEaFile((filehandle?.value ?: 0L), (iostatusblock?.value ?: 0L), (buffer?.value ?: 0L), length.toInt())

public actual fun zwSetEvent(eventhandle: Handle, previousstate: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwSetEvent((eventhandle?.value ?: 0L), (previousstate?.value ?: 0L))

public actual fun zwSetInformationToken(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: COpaquePointer?, tokeninformationlength: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwSetInformationToken((tokenhandle?.value ?: 0L), tokeninformationclass, (tokeninformation?.value ?: 0L), tokeninformationlength.toInt())

public actual fun zwSetInformationVirtualMemory(processhandle: Handle, vminformationclass: VirtualMemoryInformationClass, numberofentries: ULong, virtualaddresses: COpaquePointer?, vminformation: COpaquePointer?, vminformationlength: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwSetInformationVirtualMemory((processhandle?.value ?: 0L), vminformationclass, numberofentries.toLong(), (virtualaddresses?.value ?: 0L), (vminformation?.value ?: 0L), vminformationlength.toInt())

public actual fun zwSetQuotaInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwSetQuotaInformationFile((filehandle?.value ?: 0L), (iostatusblock?.value ?: 0L), (buffer?.value ?: 0L), length.toInt())

public actual fun zwSetSecurityObject(handle: Handle, securityinformation: UInt, securitydescriptor: PsecurityDescriptor): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwSetSecurityObject((handle?.value ?: 0L), securityinformation.toInt(), (securitydescriptor?.value ?: 0L))

public actual fun zwSetVolumeInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, fsinformation: COpaquePointer?, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwSetVolumeInformationFile((filehandle?.value ?: 0L), (iostatusblock?.value ?: 0L), (fsinformation?.value ?: 0L), length.toInt(), fsinformationclass)

public actual fun zwUnlockFile(filehandle: Handle, iostatusblock: COpaquePointer?, byteoffset: COpaquePointer?, length: COpaquePointer?, key: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_zwUnlockFile((filehandle?.value ?: 0L), (iostatusblock?.value ?: 0L), (byteoffset?.value ?: 0L), (length?.value ?: 0L), key.toInt())
