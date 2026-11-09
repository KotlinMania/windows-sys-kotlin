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

private object WindowsWdkStorageFilesystemJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ApplyControlToken(phcontext: Long, pinput: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcAsyncCopyRead(fileobject: Long, fileoffset: Long, length: Int, wait: Boolean, buffer: Long, iostatus: Long, ioissuerthread: Long, asyncreadcontext: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcCanIWrite(fileobject: Long, bytestowrite: Int, wait: Boolean, retrying: Byte): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcCoherencyFlushAndPurgeCache(sectionobjectpointer: Long, fileoffset: Long, length: Int, iostatus: Long, flags: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcCopyRead(fileobject: Long, fileoffset: Long, length: Int, wait: Boolean, buffer: Long, iostatus: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcCopyReadEx(fileobject: Long, fileoffset: Long, length: Int, wait: Boolean, buffer: Long, iostatus: Long, ioissuerthread: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcCopyWrite(fileobject: Long, fileoffset: Long, length: Int, wait: Boolean, buffer: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcCopyWriteEx(fileobject: Long, fileoffset: Long, length: Int, wait: Boolean, buffer: Long, ioissuerthread: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcCopyWriteWontFlush(fileobject: Long, fileoffset: Long, length: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcDeferWrite(fileobject: Long, postroutine: Long, context1: Long, context2: Long, bytestowrite: Int, retrying: Boolean)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcErrorCallbackRoutine(context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcFastCopyRead(fileobject: Long, fileoffset: Int, length: Int, pagecount: Int, buffer: Long, iostatus: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcFastCopyWrite(fileobject: Long, fileoffset: Int, length: Int, buffer: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcFlushCache(sectionobjectpointer: Long, fileoffset: Long, length: Int, iostatus: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcGetDirtyPages(loghandle: Long, dirtypageroutine: Long, context1: Long, context2: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcGetFileObjectFromBcb(bcb: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcGetFileObjectFromSectionPtrs(sectionobjectpointer: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcGetFileObjectFromSectionPtrsRef(sectionobjectpointer: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcGetFlushedValidData(sectionobjectpointer: Long, bcblistheld: Boolean): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcInitializeCacheMap(fileobject: Long, filesizes: Long, pinaccess: Boolean, callbacks: Long, lazywritecontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcInitializeCacheMapEx(fileobject: Long, filesizes: Long, pinaccess: Boolean, callbacks: Long, lazywritecontext: Long, flags: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcIsCacheManagerCallbackNeeded(status: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcIsThereDirtyData(vpb: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcIsThereDirtyDataEx(vpb: Long, numberofdirtypages: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcMapData(fileobject: Long, fileoffset: Long, length: Int, flags: Int, bcb: Long, buffer: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcMdlRead(fileobject: Long, fileoffset: Long, length: Int, mdlchain: Long, iostatus: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcMdlReadComplete(fileobject: Long, mdlchain: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcMdlWriteAbort(fileobject: Long, mdlchain: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcMdlWriteComplete(fileobject: Long, fileoffset: Long, mdlchain: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcPinMappedData(fileobject: Long, fileoffset: Long, length: Int, flags: Int, bcb: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcPinRead(fileobject: Long, fileoffset: Long, length: Int, flags: Int, bcb: Long, buffer: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcPrepareMdlWrite(fileobject: Long, fileoffset: Long, length: Int, mdlchain: Long, iostatus: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcPreparePinWrite(fileobject: Long, fileoffset: Long, length: Int, zero: Boolean, flags: Int, bcb: Long, buffer: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcPurgeCacheSection(sectionobjectpointer: Long, fileoffset: Long, length: Int, flags: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcRemapBcb(bcb: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcRepinBcb(bcb: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcScheduleReadAhead(fileobject: Long, fileoffset: Long, length: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcScheduleReadAheadEx(fileobject: Long, fileoffset: Long, length: Int, ioissuerthread: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcSetAdditionalCacheAttributes(fileobject: Long, disablereadahead: Boolean, disablewritebehind: Boolean)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcSetAdditionalCacheAttributesEx(fileobject: Long, flags: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcSetBcbOwnerPointer(bcb: Long, ownerpointer: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcSetDirtyPageThreshold(fileobject: Long, dirtypagethreshold: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcSetDirtyPinnedData(bcbvoid: Long, lsn: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcSetFileSizes(fileobject: Long, filesizes: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcSetFileSizesEx(fileobject: Long, filesizes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcSetLogHandleForFile(fileobject: Long, loghandle: Long, flushtolsnroutine: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcSetParallelFlushFile(fileobject: Long, enableparallelflush: Boolean)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcSetReadAheadGranularity(fileobject: Long, granularity: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcUninitializeCacheMap(fileobject: Long, truncatesize: Long, uninitializeevent: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcUnpinData(bcb: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcUnpinDataForThread(bcb: Long, resourcethreadid: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcUnpinRepinnedBcb(bcb: Long, writethrough: Boolean, iostatus: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcWaitForCurrentLazyWriterActivity(): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CcZeroData(fileobject: Long, startoffset: Long, endoffset: Long, wait: Boolean): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_CompleteAuthToken(phcontext: Long, ptoken: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ExDisableResourceBoostLite(resource: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ExQueryPoolBlockSize(poolblock: Long, quotacharged: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ExportSecurityContext(phcontext: Long, fflags: Int, ppackedcontext: Long, ptoken: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlAcknowledgeEcp(ecpcontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlAcquireFileExclusive(fileobject: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlAddBaseMcbEntry(mcb: Long, vbn: Long, lbn: Long, sectorcount: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlAddBaseMcbEntryEx(mcb: Long, vbn: Long, lbn: Long, sectorcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlAddLargeMcbEntry(mcb: Long, vbn: Long, lbn: Long, sectorcount: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlAddMcbEntry(mcb: Long, vbn: Int, lbn: Int, sectorcount: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlAddToTunnelCache(cache: Long, directorykey: Long, shortname: Long, longname: Long, keybyshortname: Boolean, datalength: Int, data: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlAddToTunnelCacheEx(cache: Long, directorykey: Long, shortname: Long, longname: Long, flags: Int, datalength: Int, data: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlAllocateAePushLock(pooltype: Int, tag: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlAllocateExtraCreateParameter(ecptype: Long, sizeofcontext: Int, flags: Int, cleanupcallback: Long, pooltag: Int, ecpcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlAllocateExtraCreateParameterFromLookasideList(ecptype: Long, sizeofcontext: Int, flags: Int, cleanupcallback: Long, lookasidelist: Long, ecpcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlAllocateExtraCreateParameterList(flags: Int, ecplist: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlAllocateFileLock(completelockirproutine: Long, unlockroutine: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlAllocateResource(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlAreNamesEqual(constantnamea: Long, constantnameb: Long, ignorecase: Boolean, upcasetable: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlAreThereCurrentOrInProgressFileLocks(filelock: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlAreThereWaitingFileLocks(filelock: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlAreVolumeStartupApplicationsComplete(): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlBalanceReads(targetdevice: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlCancellableWaitForMultipleObjects(count: Int, objectarray: Long, waittype: Int, timeout: Long, waitblockarray: Long, irp: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlCancellableWaitForSingleObject(obj: Long, timeout: Long, irp: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlChangeBackingFileObject(currentfileobject: Long, newfileobject: Long, changebackingtype: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlCheckLockForOplockRequest(filelock: Long, allocationsize: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlCheckLockForReadAccess(filelock: Long, irp: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlCheckLockForWriteAccess(filelock: Long, irp: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlCheckOplock(oplock: Long, irp: Long, context: Long, completionroutine: Long, postirproutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlCheckOplockEx(oplock: Long, irp: Long, flags: Int, context: Long, completionroutine: Long, postirproutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlCheckOplockEx2(oplock: Long, irp: Long, flags: Int, flagsex2: Int, completionroutinecontext: Long, completionroutine: Long, postirproutine: Long, timeout: Long, notifycontext: Long, notifyroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlCheckUpperOplock(oplock: Long, newloweroplockstate: Int, completionroutinecontext: Long, completionroutine: Long, prependroutine: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlCopyRead(fileobject: Long, fileoffset: Long, length: Int, wait: Boolean, lockkey: Int, buffer: Long, iostatus: Long, deviceobject: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlCopyWrite(fileobject: Long, fileoffset: Long, length: Int, wait: Boolean, lockkey: Int, buffer: Long, iostatus: Long, deviceobject: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlCreateSectionForDataScan(sectionhandle: Long, sectionobject: Long, sectionfilesize: Long, fileobject: Long, desiredaccess: Int, objectattributes: Long, maximumsize: Long, sectionpageprotection: Int, allocationattributes: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlCurrentBatchOplock(oplock: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlCurrentOplock(oplock: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlCurrentOplockH(oplock: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlDeleteExtraCreateParameterLookasideList(lookaside: Long, flags: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlDeleteKeyFromTunnelCache(cache: Long, directorykey: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlDeleteTunnelCache(cache: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlDeregisterUncProvider(handle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlDismountComplete(deviceobject: Long, dismountstatus: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlDoesDbcsContainWildCards(name: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlDoesNameContainWildCards(name: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlFastCheckLockForRead(filelock: Long, startingbyte: Long, length: Long, key: Int, fileobject: Long, processid: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlFastCheckLockForWrite(filelock: Long, startingbyte: Long, length: Long, key: Int, fileobject: Long, processid: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlFastUnlockAll(filelock: Long, fileobject: Long, processid: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlFastUnlockAllByKey(filelock: Long, fileobject: Long, processid: Long, key: Int, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlFastUnlockSingle(filelock: Long, fileobject: Long, fileoffset: Long, length: Long, processid: Long, key: Int, context: Long, alreadysynchronized: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlFindExtraCreateParameter(ecplist: Long, ecptype: Long, ecpcontext: Long, ecpcontextsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlFindInTunnelCache(cache: Long, directorykey: Long, name: Long, shortname: Long, longname: Long, datalength: Long, data: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlFindInTunnelCacheEx(cache: Long, directorykey: Long, name: Long, shortname: Long, longname: Long, flags: Int, datalength: Long, data: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlFreeAePushLock(aepushlock: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlFreeExtraCreateParameter(ecpcontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlFreeExtraCreateParameterList(ecplist: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlFreeFileLock(filelock: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlGetCurrentProcessLoaderList(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlGetEcpListFromIrp(irp: Long, ecplist: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlGetFileSize(fileobject: Long, filesize: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlGetNextBaseMcbEntry(mcb: Long, runindex: Int, vbn: Long, lbn: Long, sectorcount: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlGetNextExtraCreateParameter(ecplist: Long, currentecpcontext: Long, nextecptype: Long, nextecpcontext: Long, nextecpcontextsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlGetNextFileLock(filelock: Long, restart: Boolean): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlGetNextLargeMcbEntry(mcb: Long, runindex: Int, vbn: Long, lbn: Long, sectorcount: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlGetNextMcbEntry(mcb: Long, runindex: Int, vbn: Long, lbn: Long, sectorcount: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlGetSectorSizeInformation(deviceobject: Long, sectorsizeinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlGetSupportedFeatures(deviceobject: Long, supportedfeatures: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlGetVirtualDiskNestingLevel(deviceobject: Long, nestinglevel: Long, nestingflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlIncrementCcFastMdlReadWait()

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlIncrementCcFastReadNoWait()

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlIncrementCcFastReadNotPossible()

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlIncrementCcFastReadResourceMiss()

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlIncrementCcFastReadWait()

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlInitExtraCreateParameterLookasideList(lookaside: Long, flags: Int, size: Long, tag: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlInitializeBaseMcb(mcb: Long, pooltype: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlInitializeBaseMcbEx(mcb: Long, pooltype: Int, flags: Short): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlInitializeExtraCreateParameter(ecp: Long, ecpflags: Int, cleanupcallback: Long, totalsize: Int, ecptype: Long, listallocatedfrom: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlInitializeExtraCreateParameterList(ecplist: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlInitializeFileLock(filelock: Long, completelockirproutine: Long, unlockroutine: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlInitializeLargeMcb(mcb: Long, pooltype: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlInitializeMcb(mcb: Long, pooltype: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlInitializeOplock(oplock: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlInitializeTunnelCache(cache: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlInsertExtraCreateParameter(ecplist: Long, ecpcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlInsertPerFileContext(perfilecontextpointer: Long, ptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlInsertPerFileObjectContext(fileobject: Long, ptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlInsertPerStreamContext(perstreamcontext: Long, ptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlIs32BitProcess(process: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlIsDaxVolume(fileobject: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlIsDbcsInExpression(expression: Long, name: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlIsEcpAcknowledged(ecpcontext: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlIsEcpFromUserMode(ecpcontext: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlIsExtentDangling(startpage: Int, numberofpages: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlIsMobileOS(): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlIsNameInExpression(expression: Long, name: Long, ignorecase: Boolean, upcasetable: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlIsNameInUnUpcasedExpression(expression: Long, name: Long, ignorecase: Boolean, upcasetable: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlIsNtstatusExpected(exception: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlIsPagingFile(fileobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlIsSystemPagingFile(fileobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlIssueDeviceIoControl(deviceobject: Long, ioctl: Int, flags: Byte, inputbuffer: Long, inputbufferlength: Int, outputbuffer: Long, outputbufferlength: Int, iosbinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlKernelFsControlFile(fileobject: Long, fscontrolcode: Int, inputbuffer: Long, inputbufferlength: Int, outputbuffer: Long, outputbufferlength: Int, retoutputbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlLogCcFlushError(filename: Long, deviceobject: Long, sectionobjectpointer: Long, flusherror: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlLookupBaseMcbEntry(mcb: Long, vbn: Long, lbn: Long, sectorcountfromlbn: Long, startinglbn: Long, sectorcountfromstartinglbn: Long, index: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlLookupLargeMcbEntry(mcb: Long, vbn: Long, lbn: Long, sectorcountfromlbn: Long, startinglbn: Long, sectorcountfromstartinglbn: Long, index: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlLookupLastBaseMcbEntry(mcb: Long, vbn: Long, lbn: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlLookupLastBaseMcbEntryAndIndex(opaquemcb: Long, largevbn: Long, largelbn: Long, index: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlLookupLastLargeMcbEntry(mcb: Long, vbn: Long, lbn: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlLookupLastLargeMcbEntryAndIndex(opaquemcb: Long, largevbn: Long, largelbn: Long, index: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlLookupLastMcbEntry(mcb: Long, vbn: Long, lbn: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlLookupMcbEntry(mcb: Long, vbn: Int, lbn: Long, sectorcount: Long, index: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlLookupPerFileContext(perfilecontextpointer: Long, ownerid: Long, instanceid: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlLookupPerFileObjectContext(fileobject: Long, ownerid: Long, instanceid: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlLookupPerStreamContextInternal(streamcontext: Long, ownerid: Long, instanceid: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlMdlReadCompleteDev(fileobject: Long, mdlchain: Long, deviceobject: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlMdlReadDev(fileobject: Long, fileoffset: Long, length: Int, lockkey: Int, mdlchain: Long, iostatus: Long, deviceobject: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlMdlReadEx(fileobject: Long, fileoffset: Long, length: Int, lockkey: Int, mdlchain: Long, iostatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlMdlWriteCompleteDev(fileobject: Long, fileoffset: Long, mdlchain: Long, deviceobject: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlMupGetProviderIdFromName(pprovidername: Long, pproviderid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlMupGetProviderInfoFromFileObject(pfileobject: Long, level: Int, pbuffer: Long, pbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlNormalizeNtstatus(exception: Int, genericexception: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlNotifyCleanup(notifysync: Long, notifylist: Long, fscontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlNotifyCleanupAll(notifysync: Long, notifylist: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlNotifyFilterChangeDirectory(notifysync: Long, notifylist: Long, fscontext: Long, fulldirectoryname: Long, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: Int, notifyirp: Long, traversecallback: Long, subjectcontext: Long, filtercallback: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlNotifyFilterReportChange(notifysync: Long, notifylist: Long, fulltargetname: Long, targetnameoffset: Short, streamname: Long, normalizedparentname: Long, filtermatch: Int, action: Int, targetcontext: Long, filtercontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlNotifyFullChangeDirectory(notifysync: Long, notifylist: Long, fscontext: Long, fulldirectoryname: Long, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: Int, notifyirp: Long, traversecallback: Long, subjectcontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlNotifyFullReportChange(notifysync: Long, notifylist: Long, fulltargetname: Long, targetnameoffset: Short, streamname: Long, normalizedparentname: Long, filtermatch: Int, action: Int, targetcontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlNotifyInitializeSync(notifysync: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlNotifyUninitializeSync(notifysync: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlNotifyVolumeEvent(fileobject: Long, eventcode: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlNotifyVolumeEventEx(fileobject: Long, eventcode: Int, event: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlNumberOfRunsInBaseMcb(mcb: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlNumberOfRunsInLargeMcb(mcb: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlNumberOfRunsInMcb(mcb: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlOplockBreakH(oplock: Long, irp: Long, flags: Int, context: Long, completionroutine: Long, postirproutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlOplockBreakH2(oplock: Long, irp: Long, flags: Int, context: Long, completionroutine: Long, postirproutine: Long, grantedaccess: Long, shareaccess: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlOplockBreakToNone(oplock: Long, irpsp: Long, irp: Long, context: Long, completionroutine: Long, postirproutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlOplockBreakToNoneEx(oplock: Long, irp: Long, flags: Int, context: Long, completionroutine: Long, postirproutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlOplockFsctrl(oplock: Long, irp: Long, opencount: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlOplockFsctrlEx(oplock: Long, irp: Long, opencount: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlOplockGetAnyBreakOwnerProcess(oplock: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlOplockIsFastIoPossible(oplock: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlOplockIsSharedRequest(irp: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlOplockKeysEqual(fo1: Long, fo2: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlPostPagingFileStackOverflow(context: Long, event: Long, stackoverflowroutine: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlPostStackOverflow(context: Long, event: Long, stackoverflowroutine: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlPrepareMdlWriteDev(fileobject: Long, fileoffset: Long, length: Int, lockkey: Int, mdlchain: Long, iostatus: Long, deviceobject: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlPrepareMdlWriteEx(fileobject: Long, fileoffset: Long, length: Int, lockkey: Int, mdlchain: Long, iostatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlPrepareToReuseEcp(ecpcontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlPrivateLock(filelock: Long, fileobject: Long, fileoffset: Long, length: Long, processid: Long, key: Int, failimmediately: Boolean, exclusivelock: Boolean, iosb: Long, irp: Long, context: Long, alreadysynchronized: Boolean): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlProcessFileLock(filelock: Long, irp: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlQueryCachedVdl(fileobject: Long, vdl: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlQueryInformationFile(fileobject: Long, fileinformation: Long, length: Int, fileinformationclass: Int, retfileinformationsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlQueryKernelEaFile(fileobject: Long, returnedeadata: Long, length: Int, returnsingleentry: Boolean, ealist: Long, ealistlength: Int, eaindex: Long, restartscan: Boolean, lengthreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlQueryMaximumVirtualDiskNestingLevel(): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlRegisterFileSystemFilterCallbacks(filterdriverobject: Long, callbacks: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlRegisterUncProvider(muphandle: Long, redirectordevicename: Long, mailslotssupported: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlRegisterUncProviderEx(muphandle: Long, redirdevname: Long, deviceobject: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlRegisterUncProviderEx2(redirdevname: Long, deviceobject: Long, registration: Long, muphandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlReleaseFile(fileobject: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlRemoveBaseMcbEntry(mcb: Long, vbn: Long, sectorcount: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlRemoveDotsFromPath(originalstring: Long, pathlength: Short, newlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlRemoveExtraCreateParameter(ecplist: Long, ecptype: Long, ecpcontext: Long, ecpcontextsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlRemoveLargeMcbEntry(mcb: Long, vbn: Long, sectorcount: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlRemoveMcbEntry(mcb: Long, vbn: Int, sectorcount: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlRemovePerFileContext(perfilecontextpointer: Long, ownerid: Long, instanceid: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlRemovePerFileObjectContext(fileobject: Long, ownerid: Long, instanceid: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlRemovePerStreamContext(streamcontext: Long, ownerid: Long, instanceid: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlResetBaseMcb(mcb: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlResetLargeMcb(mcb: Long, selfsynchronized: Boolean)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlSetDriverBacking(driverobj: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlSetEcpListIntoIrp(irp: Long, ecplist: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlSetKernelEaFile(fileobject: Long, eabuffer: Long, length: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlSplitBaseMcb(mcb: Long, vbn: Long, amount: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlSplitLargeMcb(mcb: Long, vbn: Long, amount: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlTeardownPerFileContexts(perfilecontextpointer: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlTeardownPerStreamContexts(advancedheader: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlTruncateBaseMcb(mcb: Long, vbn: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlTruncateLargeMcb(mcb: Long, vbn: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlTruncateMcb(mcb: Long, vbn: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlUninitializeBaseMcb(mcb: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlUninitializeFileLock(filelock: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlUninitializeLargeMcb(mcb: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlUninitializeMcb(mcb: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlUninitializeOplock(oplock: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlUpdateDiskCounters(bytesread: Long, byteswritten: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlUpperOplockFsctrl(oplock: Long, irp: Long, opencount: Int, loweroplockstate: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlValidateReparsePointBuffer(bufferlength: Int, reparsebuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_FsRtlVolumeDeviceToCorrelationId(volumedeviceobject: Long, guid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_GetSecurityUserInfo(logonid: Long, flags: Int, userinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoAcquireVpbSpinLock(irql: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoApplyPriorityInfoThread(inputpriorityinfo: Long, outputpriorityinfo: Long, thread: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoCheckDesiredAccess(desiredaccess: Long, grantedaccess: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoCheckEaBufferValidity(eabuffer: Long, ealength: Int, erroroffset: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoCheckFunctionAccess(grantedaccess: Int, majorfunction: Byte, minorfunction: Byte, iocontrolcode: Int, arg1: Long, arg2: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoCheckQuerySetFileInformation(fileinformationclass: Int, length: Int, setoperation: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoCheckQuerySetVolumeInformation(fsinformationclass: Int, length: Int, setoperation: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoCheckQuotaBufferValidity(quotabuffer: Long, quotalength: Int, erroroffset: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoClearFsTrackOffsetState(irp: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoCreateStreamFileObject(fileobject: Long, deviceobject: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoCreateStreamFileObjectEx(fileobject: Long, deviceobject: Long, filehandle: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoCreateStreamFileObjectEx2(createoptions: Long, fileobject: Long, deviceobject: Long, streamfileobject: Long, filehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoCreateStreamFileObjectLite(fileobject: Long, deviceobject: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoEnumerateDeviceObjectList(driverobject: Long, deviceobjectlist: Long, deviceobjectlistsize: Int, actualnumberdeviceobjects: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoEnumerateRegisteredFiltersList(driverobjectlist: Long, driverobjectlistsize: Int, actualnumberdriverobjects: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoFastQueryNetworkAttributes(objectattributes: Long, desiredaccess: Int, openoptions: Int, iostatus: Long, buffer: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoGetAttachedDevice(deviceobject: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoGetBaseFileSystemDeviceObject(fileobject: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoGetDeviceAttachmentBaseRef(deviceobject: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoGetDeviceToVerify(thread: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoGetDiskDeviceObject(filesystemdeviceobject: Long, diskdeviceobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoGetFsTrackOffsetState(irp: Long, retfstrackoffsetblob: Long, rettrackedoffset: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoGetLowerDeviceObject(deviceobject: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoGetOplockKeyContext(fileobject: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoGetOplockKeyContextEx(fileobject: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoGetRequestorProcess(irp: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoGetRequestorProcessId(irp: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoGetRequestorSessionId(irp: Long, psessionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoIrpHasFsTrackOffsetExtensionType(irp: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoIsOperationSynchronous(irp: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoIsSystemThread(thread: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoIsValidNameGraftingBuffer(irp: Long, reparsebuffer: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoPageRead(fileobject: Long, memorydescriptorlist: Long, startingoffset: Long, event: Long, iostatusblock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoQueryFileDosDeviceName(fileobject: Long, objectnameinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoQueryFileInformation(fileobject: Long, fileinformationclass: Int, length: Int, fileinformation: Long, returnedlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoQueryVolumeInformation(fileobject: Long, fsinformationclass: Int, length: Int, fsinformation: Long, returnedlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoQueueThreadIrp(irp: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoRegisterFileSystem(deviceobject: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoReleaseVpbSpinLock(irql: Byte)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoReplaceFileObjectName(fileobject: Long, newfilename: Long, filenamelength: Short): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoRequestDeviceRemovalForReset(physicaldeviceobject: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoRetrievePriorityInfo(irp: Long, fileobject: Long, thread: Long, priorityinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoSetDeviceToVerify(thread: Long, deviceobject: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoSetFsTrackOffsetState(irp: Long, fstrackoffsetblob: Long, trackedoffset: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoSetInformation(fileobject: Long, fileinformationclass: Int, length: Int, fileinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoSynchronousPageWrite(fileobject: Long, memorydescriptorlist: Long, startingoffset: Long, event: Long, iostatusblock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoThreadToProcess(thread: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoUnregisterFileSystem(deviceobject: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_IoVerifyVolume(deviceobject: Long, allowrawmount: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_KeAcquireQueuedSpinLock(number: Int): Byte

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_KeAcquireSpinLockRaiseToSynch(spinlock: Long): Byte

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_KeAttachProcess(process: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_KeDetachProcess()

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_KeInitializeMutant(mutant: Long, initialowner: Boolean)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_KeInitializeQueue(queue: Long, count: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_KeInsertHeadQueue(queue: Long, entry: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_KeInsertQueue(queue: Long, entry: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_KeReadStateMutant(mutant: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_KeReadStateQueue(queue: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_KeReleaseMutant(mutant: Long, increment: Int, abandoned: Boolean, wait: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_KeReleaseQueuedSpinLock(number: Int, oldirql: Byte)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_KeRemoveQueue(queue: Long, waitmode: Byte, timeout: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_KeRemoveQueueEx(queue: Long, waitmode: Byte, alertable: Boolean, timeout: Long, entryarray: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_KeRundownQueue(queue: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_KeSetIdealProcessorThread(thread: Long, processor: Byte): Byte

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_KeSetKernelStackSwapEnable(enable: Boolean): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_KeStackAttachProcess(process: Long, apcstate: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_KeTryToAcquireQueuedSpinLock(number: Int, oldirql: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_KeUnstackDetachProcess(apcstate: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_MakeSignature(phcontext: Long, fqop: Int, pmessage: Long, messageseqno: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_MapSecurityError(secstatus: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_MmCanFileBeTruncated(sectionpointer: Long, newfilesize: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_MmDoesFileHaveUserWritableReferences(sectionpointer: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_MmFlushImageSection(sectionobjectpointer: Long, flushtype: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_MmForceSectionClosed(sectionobjectpointer: Long, delayclose: Boolean): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_MmForceSectionClosedEx(sectionobjectpointer: Long, forcecloseflags: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_MmGetMaximumFileSectionSize(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_MmIsFileSectionActive(fssectionpointer: Long, flags: Int, sectionisactive: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_MmIsRecursiveIoFault(): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_MmMdlPagesAreZero(mdl: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_MmPrefetchPages(numberoflists: Int, readlists: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_MmSetAddressRangeModified(address: Long, length: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtAccessCheckAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, desiredaccess: Int, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtAccessCheckByTypeAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, principalselfsid: Long, desiredaccess: Int, audittype: Int, flags: Int, objecttypelist: Long, objecttypelistlength: Int, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtAccessCheckByTypeResultListAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, principalselfsid: Long, desiredaccess: Int, audittype: Int, flags: Int, objecttypelist: Long, objecttypelistlength: Int, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname: Long, handleid: Long, clienttoken: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, principalselfsid: Long, desiredaccess: Int, audittype: Int, flags: Int, objecttypelist: Long, objecttypelistlength: Int, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtAdjustGroupsToken(tokenhandle: Long, resettodefault: Boolean, newstate: Long, bufferlength: Int, previousstate: Long, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtAdjustPrivilegesToken(tokenhandle: Long, disableallprivileges: Boolean, newstate: Long, bufferlength: Int, previousstate: Long, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtAllocateVirtualMemory(processhandle: Long, baseaddress: Long, zerobits: Long, regionsize: Long, allocationtype: Int, protect: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtAllocateVirtualMemoryEx(processhandle: Long, baseaddress: Long, regionsize: Long, allocationtype: Int, pageprotection: Int, extendedparameters: Long, extendedparametercount: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtCancelIoFileEx(filehandle: Long, iorequesttocancel: Long, iostatusblock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtCloseObjectAuditAlarm(subsystemname: Long, handleid: Long, generateonclose: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtCreateDirectoryObject(directoryhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtCreateEvent(eventhandle: Long, desiredaccess: Int, objectattributes: Long, eventtype: Int, initialstate: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtCreateFile(filehandle: Long, desiredaccess: Int, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: Int, shareaccess: Int, createdisposition: Int, createoptions: Int, eabuffer: Long, ealength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtCreateSection(sectionhandle: Long, desiredaccess: Int, objectattributes: Long, maximumsize: Long, sectionpageprotection: Int, allocationattributes: Int, filehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtCreateSectionEx(sectionhandle: Long, desiredaccess: Int, objectattributes: Long, maximumsize: Long, sectionpageprotection: Int, allocationattributes: Int, filehandle: Long, extendedparameters: Long, extendedparametercount: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtDeleteFile(objectattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtDeleteObjectAuditAlarm(subsystemname: Long, handleid: Long, generateonclose: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtDuplicateObject(sourceprocesshandle: Long, sourcehandle: Long, targetprocesshandle: Long, targethandle: Long, desiredaccess: Int, handleattributes: Int, options: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtDuplicateToken(existingtokenhandle: Long, desiredaccess: Int, objectattributes: Long, effectiveonly: Boolean, tokentype: Int, newtokenhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtFilterToken(existingtokenhandle: Long, flags: Int, sidstodisable: Long, privilegestodelete: Long, restrictedsids: Long, newtokenhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtFlushBuffersFile(filehandle: Long, iostatusblock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtFlushBuffersFileEx(filehandle: Long, flags: Int, parameters: Long, parameterssize: Int, iostatusblock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtFlushVirtualMemory(processhandle: Long, baseaddress: Long, regionsize: Long, iostatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtFreeVirtualMemory(processhandle: Long, baseaddress: Long, regionsize: Long, freetype: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtImpersonateAnonymousToken(threadhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtOpenDirectoryObject(directoryhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtOpenFile(filehandle: Long, desiredaccess: Int, objectattributes: Long, iostatusblock: Long, shareaccess: Int, openoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtOpenObjectAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, clienttoken: Long, desiredaccess: Int, grantedaccess: Int, privileges: Long, objectcreation: Boolean, accessgranted: Boolean, generateonclose: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtOpenProcessToken(processhandle: Long, desiredaccess: Int, tokenhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtOpenProcessTokenEx(processhandle: Long, desiredaccess: Int, handleattributes: Int, tokenhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtOpenSymbolicLinkObject(linkhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtOpenThreadToken(threadhandle: Long, desiredaccess: Int, openasself: Boolean, tokenhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtOpenThreadTokenEx(threadhandle: Long, desiredaccess: Int, openasself: Boolean, handleattributes: Int, tokenhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtPrivilegeCheck(clienttoken: Long, requiredprivileges: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtPrivilegeObjectAuditAlarm(subsystemname: Long, handleid: Long, clienttoken: Long, desiredaccess: Int, privileges: Long, accessgranted: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtPrivilegedServiceAuditAlarm(subsystemname: Long, servicename: Long, clienttoken: Long, privileges: Long, accessgranted: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtQueryDirectoryObject(directoryhandle: Long, buffer: Long, length: Int, returnsingleentry: Boolean, restartscan: Boolean, context: Long, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtQueryEaFile(filehandle: Long, iostatusblock: Long, buffer: Long, length: Int, returnsingleentry: Boolean, ealist: Long, ealistlength: Int, eaindex: Long, restartscan: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtQueryFullAttributesFile(objectattributes: Long, fileinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtQueryInformationByName(objectattributes: Long, iostatusblock: Long, fileinformation: Long, length: Int, fileinformationclass: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtQueryInformationFile(filehandle: Long, iostatusblock: Long, fileinformation: Long, length: Int, fileinformationclass: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtQueryInformationToken(tokenhandle: Long, tokeninformationclass: Int, tokeninformation: Long, tokeninformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtQueryQuotaInformationFile(filehandle: Long, iostatusblock: Long, buffer: Long, length: Int, returnsingleentry: Boolean, sidlist: Long, sidlistlength: Int, startsid: Long, restartscan: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtQuerySecurityObject(handle: Long, securityinformation: Int, securitydescriptor: Long, length: Int, lengthneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtQuerySymbolicLinkObject(linkhandle: Long, linktarget: Long, returnedlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtQueryVirtualMemory(processhandle: Long, baseaddress: Long, memoryinformationclass: Int, memoryinformation: Long, memoryinformationlength: Long, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtQueryVolumeInformationFile(filehandle: Long, iostatusblock: Long, fsinformation: Long, length: Int, fsinformationclass: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtSetEaFile(filehandle: Long, iostatusblock: Long, buffer: Long, length: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtSetEvent(eventhandle: Long, previousstate: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtSetInformationFile(filehandle: Long, iostatusblock: Long, fileinformation: Long, length: Int, fileinformationclass: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtSetInformationToken(tokenhandle: Long, tokeninformationclass: Int, tokeninformation: Long, tokeninformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtSetInformationVirtualMemory(processhandle: Long, vminformationclass: Int, numberofentries: Long, virtualaddresses: Long, vminformation: Long, vminformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtSetQuotaInformationFile(filehandle: Long, iostatusblock: Long, buffer: Long, length: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtSetSecurityObject(handle: Long, securityinformation: Int, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtSetVolumeInformationFile(filehandle: Long, iostatusblock: Long, fsinformation: Long, length: Int, fsinformationclass: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_NtUnlockFile(filehandle: Long, iostatusblock: Long, byteoffset: Long, length: Long, key: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ObInsertObject(obj: Long, passedaccessstate: Long, desiredaccess: Int, objectpointerbias: Int, newobject: Long, handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ObIsKernelHandle(handle: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ObMakeTemporaryObject(obj: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ObOpenObjectByPointer(obj: Long, handleattributes: Int, passedaccessstate: Long, desiredaccess: Int, objecttype: Long, accessmode: Byte, handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ObOpenObjectByPointerWithTag(obj: Long, handleattributes: Int, passedaccessstate: Long, desiredaccess: Int, objecttype: Long, accessmode: Byte, tag: Int, handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ObQueryNameString(obj: Long, objectnameinfo: Long, length: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ObQueryObjectAuditingByHandle(handle: Long, generateonclose: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_PfxFindPrefix(prefixtable: Long, fullname: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_PfxInitialize(prefixtable: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_PfxInsertPrefix(prefixtable: Long, prefix: Long, prefixtableentry: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_PfxRemovePrefix(prefixtable: Long, prefixtableentry: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_PoQueueShutdownWorkItem(workitem: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_PsAssignImpersonationToken(thread: Long, token: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_PsChargePoolQuota(process: Long, pooltype: Int, amount: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_PsChargeProcessPoolQuota(process: Long, pooltype: Int, amount: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_PsDereferenceImpersonationToken(impersonationtoken: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_PsDereferencePrimaryToken(primarytoken: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_PsDisableImpersonation(thread: Long, impersonationstate: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_PsGetProcessExitTime(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_PsGetThreadProcess(thread: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_PsImpersonateClient(thread: Long, token: Long, copyonopen: Boolean, effectiveonly: Boolean, impersonationlevel: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_PsIsDiskCountersEnabled(): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_PsIsSystemThread(thread: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_PsIsThreadTerminating(thread: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_PsLookupProcessByProcessId(processid: Long, process: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_PsLookupThreadByThreadId(threadid: Long, thread: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_PsReferenceImpersonationToken(thread: Long, copyonopen: Long, effectiveonly: Long, impersonationlevel: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_PsReferencePrimaryToken(process: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_PsRestoreImpersonation(thread: Long, impersonationstate: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_PsReturnPoolQuota(process: Long, pooltype: Int, amount: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_PsRevertToSelf()

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_PsUpdateDiskCounters(process: Long, bytesread: Long, byteswritten: Long, readoperationcount: Int, writeoperationcount: Int, flushoperationcount: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_QuerySecurityContextToken(phcontext: Long, token: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlAbsoluteToSelfRelativeSD(absolutesecuritydescriptor: Long, selfrelativesecuritydescriptor: Long, bufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlAddAccessAllowedAce(acl: Long, acerevision: Int, accessmask: Int, sid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlAddAccessAllowedAceEx(acl: Long, acerevision: Int, aceflags: Int, accessmask: Int, sid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlAddAce(acl: Long, acerevision: Int, startingaceindex: Int, acelist: Long, acelistlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlAllocateAndInitializeSid(identifierauthority: Long, subauthoritycount: Byte, subauthority0: Int, subauthority1: Int, subauthority2: Int, subauthority3: Int, subauthority4: Int, subauthority5: Int, subauthority6: Int, subauthority7: Int, sid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlAllocateAndInitializeSidEx(identifierauthority: Long, subauthoritycount: Byte, subauthorities: Long, sid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlAllocateHeap(heaphandle: Long, flags: Int, size: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlAppendStringToString(destination: Long, source: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlCompareAltitudes(altitude1: Long, altitude2: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlCompareMemoryUlong(source: Long, length: Long, pattern: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlCompressBuffer(compressionformatandengine: Short, uncompressedbuffer: Long, uncompressedbuffersize: Int, compressedbuffer: Long, compressedbuffersize: Int, uncompressedchunksize: Int, finalcompressedsize: Long, workspace: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlCompressChunks(uncompressedbuffer: Long, uncompressedbuffersize: Int, compressedbuffer: Long, compressedbuffersize: Int, compresseddatainfo: Long, compresseddatainfolength: Int, workspace: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlCopyLuid(destinationluid: Long, sourceluid: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlCopySid(destinationsidlength: Int, destinationsid: Long, sourcesid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlCreateAcl(acl: Long, acllength: Int, aclrevision: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlCreateHeap(flags: Int, heapbase: Long, reservesize: Long, commitsize: Long, lock: Long, parameters: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlCreateServiceSid(servicename: Long, servicesid: Long, servicesidlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlCreateSystemVolumeInformationFolder(volumerootpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlCreateUnicodeString(destinationstring: Long, sourcestring: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlCreateVirtualAccountSid(name: Long, basesubauthority: Int, sid: Long, sidlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlCustomCPToUnicodeN(customcp: Long, unicodestring: Long, maxbytesinunicodestring: Int, bytesinunicodestring: Long, customcpstring: Long, bytesincustomcpstring: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlDecompressBuffer(compressionformat: Short, uncompressedbuffer: Long, uncompressedbuffersize: Int, compressedbuffer: Long, compressedbuffersize: Int, finaluncompressedsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlDecompressBufferEx(compressionformat: Short, uncompressedbuffer: Long, uncompressedbuffersize: Int, compressedbuffer: Long, compressedbuffersize: Int, finaluncompressedsize: Long, workspace: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlDecompressBufferEx2(compressionformat: Short, uncompressedbuffer: Long, uncompressedbuffersize: Int, compressedbuffer: Long, compressedbuffersize: Int, uncompressedchunksize: Int, finaluncompressedsize: Long, workspace: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlDecompressChunks(uncompressedbuffer: Long, uncompressedbuffersize: Int, compressedbuffer: Long, compressedbuffersize: Int, compressedtail: Long, compressedtailsize: Int, compresseddatainfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlDecompressFragment(compressionformat: Short, uncompressedfragment: Long, uncompressedfragmentsize: Int, compressedbuffer: Long, compressedbuffersize: Int, fragmentoffset: Int, finaluncompressedsize: Long, workspace: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlDecompressFragmentEx(compressionformat: Short, uncompressedfragment: Long, uncompressedfragmentsize: Int, compressedbuffer: Long, compressedbuffersize: Int, fragmentoffset: Int, uncompressedchunksize: Int, finaluncompressedsize: Long, workspace: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlDeleteAce(acl: Long, aceindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlDescribeChunk(compressionformat: Short, compressedbuffer: Long, endofcompressedbufferplus1: Long, chunkbuffer: Long, chunksize: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlDestroyHeap(heaphandle: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlDosPathNameToNtPathName_U_WithStatus(dosfilename: Long, ntfilename: Long, filepart: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlDowncaseUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlDuplicateUnicodeString(flags: Int, stringin: Long, stringout: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlEqualPrefixSid(sid1: Long, sid2: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlEqualSid(sid1: Long, sid2: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlFindUnicodePrefix(prefixtable: Long, fullname: Long, caseinsensitiveindex: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlFreeHeap(heaphandle: Long, flags: Int, baseaddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlFreeSid(sid: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlGenerate8dot3Name(name: Long, allowextendedcharacters: Boolean, context: Long, name8dot3: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlGetAce(acl: Long, aceindex: Int, ace: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlGetCompressionWorkSpaceSize(compressionformatandengine: Short, compressbufferworkspacesize: Long, compressfragmentworkspacesize: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlGetDaclSecurityDescriptor(securitydescriptor: Long, daclpresent: Long, dacl: Long, dacldefaulted: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlGetGroupSecurityDescriptor(securitydescriptor: Long, group: Long, groupdefaulted: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlGetOwnerSecurityDescriptor(securitydescriptor: Long, owner: Long, ownerdefaulted: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlGetSaclSecurityDescriptor(securitydescriptor: Long, saclpresent: Long, sacl: Long, sacldefaulted: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlIdentifierAuthoritySid(sid: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlIdnToAscii(flags: Int, sourcestring: Long, sourcestringlength: Int, destinationstring: Long, destinationstringlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlIdnToNameprepUnicode(flags: Int, sourcestring: Long, sourcestringlength: Int, destinationstring: Long, destinationstringlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlIdnToUnicode(flags: Int, sourcestring: Long, sourcestringlength: Int, destinationstring: Long, destinationstringlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlInitCodePageTable(tablebase: Long, codepagetable: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlInitUnicodeStringEx(destinationstring: Long, sourcestring: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlInitializeSid(sid: Long, identifierauthority: Long, subauthoritycount: Byte): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlInitializeUnicodePrefix(prefixtable: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlInsertUnicodePrefix(prefixtable: Long, prefix: Long, prefixtableentry: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlIsCloudFilesPlaceholder(fileattributes: Int, reparsetag: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlIsDosDeviceName_U(dosfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlIsNormalizedString(normform: Int, sourcestring: Long, sourcestringlength: Int, normalized: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlIsPartialPlaceholder(fileattributes: Int, reparsetag: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlIsPartialPlaceholderFileHandle(filehandle: Long, ispartialplaceholder: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlIsPartialPlaceholderFileInfo(infobuffer: Long, infoclass: Int, ispartialplaceholder: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlIsSandboxedToken(context: Long, previousmode: Byte): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlIsValidOemCharacter(char: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlLengthRequiredSid(subauthoritycount: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlLengthSid(sid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlMultiByteToUnicodeN(unicodestring: Long, maxbytesinunicodestring: Int, bytesinunicodestring: Long, multibytestring: Long, bytesinmultibytestring: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlMultiByteToUnicodeSize(bytesinunicodestring: Long, multibytestring: Long, bytesinmultibytestring: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlNextUnicodePrefix(prefixtable: Long, restart: Boolean): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlNormalizeString(normform: Int, sourcestring: Long, sourcestringlength: Int, destinationstring: Long, destinationstringlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlNtStatusToDosErrorNoTeb(status: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlOemStringToCountedUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlOemStringToUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlOemToUnicodeN(unicodestring: Long, maxbytesinunicodestring: Int, bytesinunicodestring: Long, oemstring: Long, bytesinoemstring: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlPrefixString(string1: Long, string2: Long, caseinsensitive: Boolean): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlQueryPackageIdentity(tokenobject: Long, packagefullname: Long, packagesize: Long, appid: Long, appidsize: Long, packaged: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlQueryPackageIdentityEx(tokenobject: Long, packagefullname: Long, packagesize: Long, appid: Long, appidsize: Long, dynamicid: Long, flags: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlQueryProcessPlaceholderCompatibilityMode(): Byte

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlQueryThreadPlaceholderCompatibilityMode(): Byte

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlRandom(seed: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlRandomEx(seed: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlRemoveUnicodePrefix(prefixtable: Long, prefixtableentry: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlReplaceSidInSd(securitydescriptor: Long, oldsid: Long, newsid: Long, numchanges: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlReserveChunk(compressionformat: Short, compressedbuffer: Long, endofcompressedbufferplus1: Long, chunkbuffer: Long, chunksize: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlSecondsSince1970ToTime(elapsedseconds: Int, time: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlSecondsSince1980ToTime(elapsedseconds: Int, time: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlSelfRelativeToAbsoluteSD(selfrelativesecuritydescriptor: Long, absolutesecuritydescriptor: Long, absolutesecuritydescriptorsize: Long, dacl: Long, daclsize: Long, sacl: Long, saclsize: Long, owner: Long, ownersize: Long, primarygroup: Long, primarygroupsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlSetGroupSecurityDescriptor(securitydescriptor: Long, group: Long, groupdefaulted: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlSetOwnerSecurityDescriptor(securitydescriptor: Long, owner: Long, ownerdefaulted: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlSetProcessPlaceholderCompatibilityMode(mode: Byte): Byte

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlSetThreadPlaceholderCompatibilityMode(mode: Byte): Byte

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlSubAuthorityCountSid(sid: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlSubAuthoritySid(sid: Long, subauthority: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlTimeToSecondsSince1980(time: Long, elapsedseconds: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlUnicodeStringToCountedOemString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlUnicodeToCustomCPN(customcp: Long, customcpstring: Long, maxbytesincustomcpstring: Int, bytesincustomcpstring: Long, unicodestring: Long, bytesinunicodestring: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlUnicodeToMultiByteN(multibytestring: Long, maxbytesinmultibytestring: Int, bytesinmultibytestring: Long, unicodestring: Long, bytesinunicodestring: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlUnicodeToOemN(oemstring: Long, maxbytesinoemstring: Int, bytesinoemstring: Long, unicodestring: Long, bytesinunicodestring: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlUpcaseUnicodeStringToCountedOemString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlUpcaseUnicodeStringToOemString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlUpcaseUnicodeToCustomCPN(customcp: Long, customcpstring: Long, maxbytesincustomcpstring: Int, bytesincustomcpstring: Long, unicodestring: Long, bytesinunicodestring: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlUpcaseUnicodeToMultiByteN(multibytestring: Long, maxbytesinmultibytestring: Int, bytesinmultibytestring: Long, unicodestring: Long, bytesinunicodestring: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlUpcaseUnicodeToOemN(oemstring: Long, maxbytesinoemstring: Int, bytesinoemstring: Long, unicodestring: Long, bytesinunicodestring: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlValidSid(sid: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlValidateUnicodeString(flags: Int, string: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlxOemStringToUnicodeSize(oemstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_RtlxUnicodeStringToOemSize(unicodestring: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeAccessCheckFromState(securitydescriptor: Long, primarytokeninformation: Long, clienttokeninformation: Long, desiredaccess: Int, previouslygrantedaccess: Int, privileges: Long, genericmapping: Long, accessmode: Byte, grantedaccess: Long, accessstatus: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeAccessCheckFromStateEx(securitydescriptor: Long, primarytoken: Long, clienttoken: Long, desiredaccess: Int, previouslygrantedaccess: Int, privileges: Long, genericmapping: Long, accessmode: Byte, grantedaccess: Long, accessstatus: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeAdjustAccessStateForAccessConstraints(objecttype: Long, securitydescriptor: Long, accessstate: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeAdjustAccessStateForTrustLabel(objecttype: Long, securitydescriptor: Long, accessstate: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeAdjustObjectSecurity(objectname: Long, originaldescriptor: Long, proposeddescriptor: Long, subjectsecuritycontext: Long, adjusteddescriptor: Long, applyadjusteddescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeAppendPrivileges(accessstate: Long, privileges: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeAuditFipsCryptoSelftests(bsuccess: Boolean, selftestcode: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeAuditHardLinkCreation(filename: Long, linkname: Long, bsuccess: Boolean)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeAuditHardLinkCreationWithTransaction(filename: Long, linkname: Long, bsuccess: Boolean, transactionid: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeAuditTransactionStateChange(transactionid: Long, resourcemanagerid: Long, newtransactionstate: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeAuditingAnyFileEventsWithContext(securitydescriptor: Long, subjectsecuritycontext: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeAuditingAnyFileEventsWithContextEx(securitydescriptor: Long, subjectsecuritycontext: Long, stagingenabled: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeAuditingFileEvents(accessgranted: Boolean, securitydescriptor: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeAuditingFileEventsWithContext(accessgranted: Boolean, securitydescriptor: Long, subjectsecuritycontext: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeAuditingFileEventsWithContextEx(accessgranted: Boolean, securitydescriptor: Long, subjectsecuritycontext: Long, stagingenabled: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeAuditingFileOrGlobalEvents(accessgranted: Boolean, securitydescriptor: Long, subjectsecuritycontext: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeAuditingHardLinkEvents(accessgranted: Boolean, securitydescriptor: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeAuditingHardLinkEventsWithContext(accessgranted: Boolean, securitydescriptor: Long, subjectsecuritycontext: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeCaptureSubjectContextEx(thread: Long, process: Long, subjectcontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeCheckForCriticalAceRemoval(currentdescriptor: Long, newdescriptor: Long, subjectsecuritycontext: Long, aceremoved: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeCreateClientSecurity(clientthread: Long, clientsecurityqos: Long, remotesession: Boolean, clientcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeCreateClientSecurityFromSubjectContext(subjectcontext: Long, clientsecurityqos: Long, serverisremote: Boolean, clientcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeDeleteClientSecurity(clientcontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeDeleteObjectAuditAlarm(obj: Long, handle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeDeleteObjectAuditAlarmWithTransaction(obj: Long, handle: Long, transactionid: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeExamineSacl(sacl: Long, resourcesacl: Long, token: Long, desiredaccess: Int, accessgranted: Boolean, generateaudit: Long, generatealarm: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeFilterToken(existingtoken: Long, flags: Int, sidstodisable: Long, privilegestodelete: Long, restrictedsids: Long, filteredtoken: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeFreePrivileges(privileges: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeImpersonateClient(clientcontext: Long, serverthread: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeImpersonateClientEx(clientcontext: Long, serverthread: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeLocateProcessImageName(process: Long, pimagefilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeMarkLogonSessionForTerminationNotification(logonid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeMarkLogonSessionForTerminationNotificationEx(logonid: Long, pserversilo: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeOpenObjectAuditAlarm(objecttypename: Long, obj: Long, absoluteobjectname: Long, securitydescriptor: Long, accessstate: Long, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, generateonclose: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeOpenObjectAuditAlarmWithTransaction(objecttypename: Long, obj: Long, absoluteobjectname: Long, securitydescriptor: Long, accessstate: Long, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, transactionid: Long, generateonclose: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeOpenObjectForDeleteAuditAlarm(objecttypename: Long, obj: Long, absoluteobjectname: Long, securitydescriptor: Long, accessstate: Long, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, generateonclose: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeOpenObjectForDeleteAuditAlarmWithTransaction(objecttypename: Long, obj: Long, absoluteobjectname: Long, securitydescriptor: Long, accessstate: Long, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, transactionid: Long, generateonclose: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SePrivilegeCheck(requiredprivileges: Long, subjectsecuritycontext: Long, accessmode: Byte): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeQueryAuthenticationIdToken(token: Long, authenticationid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeQueryInformationToken(token: Long, tokeninformationclass: Int, tokeninformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeQuerySecurityDescriptorInfo(securityinformation: Long, securitydescriptor: Long, length: Long, objectssecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeQueryServerSiloToken(token: Long, pserversilo: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeQuerySessionIdToken(token: Long, sessionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeQuerySessionIdTokenEx(token: Long, sessionid: Long, isservicesession: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeRegisterLogonSessionTerminatedRoutine(callbackroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeRegisterLogonSessionTerminatedRoutineEx(callbackroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeReportSecurityEventWithSubCategory(flags: Int, sourcename: Long, usersid: Long, auditparameters: Long, auditsubcategoryid: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeSetAccessStateGenericMapping(accessstate: Long, genericmapping: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeSetSecurityDescriptorInfo(obj: Long, securityinformation: Long, modificationdescriptor: Long, objectssecuritydescriptor: Long, pooltype: Int, genericmapping: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeSetSecurityDescriptorInfoEx(obj: Long, securityinformation: Long, modificationdescriptor: Long, objectssecuritydescriptor: Long, autoinheritflags: Int, pooltype: Int, genericmapping: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeShouldCheckForAccessRightsFromParent(objecttype: Long, childdescriptor: Long, accessstate: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeTokenFromAccessInformation(accessinformation: Long, token: Long, length: Int, requiredlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeTokenIsAdmin(token: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeTokenIsRestricted(token: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeTokenIsWriteRestricted(token: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeTokenType(token: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeUnregisterLogonSessionTerminatedRoutine(callbackroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SeUnregisterLogonSessionTerminatedRoutineEx(callbackroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SecLookupAccountName(name: Long, sidsize: Long, sid: Long, nameuse: Long, domainsize: Long, referenceddomain: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SecLookupAccountSid(sid: Long, namesize: Long, namebuffer: Long, domainsize: Long, domainbuffer: Long, nameuse: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SecLookupWellKnownSid(sidtype: Int, sid: Long, sidbuffersize: Int, sidsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SecMakeSPN(serviceclass: Long, servicename: Long, instancename: Long, instanceport: Short, referrer: Long, spn: Long, length: Long, allocate: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SecMakeSPNEx(serviceclass: Long, servicename: Long, instancename: Long, instanceport: Short, referrer: Long, targetinfo: Long, spn: Long, length: Long, allocate: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SecMakeSPNEx2(serviceclass: Long, servicename: Long, instancename: Long, instanceport: Short, referrer: Long, intargetinfo: Long, spn: Long, totalsize: Long, allocate: Boolean, istargetinfomarshaled: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SetContextAttributesW(phcontext: Long, ulattribute: Int, pbuffer: Long, cbbuffer: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SspiAcceptSecurityContextAsync(asynccontext: Long, phcredential: Long, phcontext: Long, pinput: Long, fcontextreq: Int, targetdatarep: Int, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SspiCreateAsyncContext(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SspiDeleteSecurityContextAsync(asynccontext: Long, phcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SspiFreeAsyncContext(handle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SspiFreeCredentialsHandleAsync(asynccontext: Long, phcredential: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SspiGetAsyncCallStatus(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SspiInitializeSecurityContextAsyncA(asynccontext: Long, phcredential: Long, phcontext: Long, psztargetname: Long, fcontextreq: Int, reserved1: Int, targetdatarep: Int, pinput: Long, reserved2: Int, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SspiInitializeSecurityContextAsyncW(asynccontext: Long, phcredential: Long, phcontext: Long, psztargetname: Long, fcontextreq: Int, reserved1: Int, targetdatarep: Int, pinput: Long, reserved2: Int, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SspiReinitAsyncContext(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_SspiSetAsyncNotifyCallback(context: Long, callback: Long, callbackdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_VerifySignature(phcontext: Long, pmessage: Long, messageseqno: Int, pfqop: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwAccessCheckAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, desiredaccess: Int, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwAccessCheckByTypeAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, principalselfsid: Long, desiredaccess: Int, audittype: Int, flags: Int, objecttypelist: Long, objecttypelistlength: Int, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwAccessCheckByTypeResultListAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, principalselfsid: Long, desiredaccess: Int, audittype: Int, flags: Int, objecttypelist: Long, objecttypelistlength: Int, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname: Long, handleid: Long, clienttoken: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, principalselfsid: Long, desiredaccess: Int, audittype: Int, flags: Int, objecttypelist: Long, objecttypelistlength: Int, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwAdjustGroupsToken(tokenhandle: Long, resettodefault: Boolean, newstate: Long, bufferlength: Int, previousstate: Long, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwAdjustPrivilegesToken(tokenhandle: Long, disableallprivileges: Boolean, newstate: Long, bufferlength: Int, previousstate: Long, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwAllocateVirtualMemory(processhandle: Long, baseaddress: Long, zerobits: Long, regionsize: Long, allocationtype: Int, protect: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwAllocateVirtualMemoryEx(processhandle: Long, baseaddress: Long, regionsize: Long, allocationtype: Int, pageprotection: Int, extendedparameters: Long, extendedparametercount: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwCancelIoFileEx(filehandle: Long, iorequesttocancel: Long, iostatusblock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwCloseObjectAuditAlarm(subsystemname: Long, handleid: Long, generateonclose: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwCreateDirectoryObject(directoryhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwCreateEvent(eventhandle: Long, desiredaccess: Int, objectattributes: Long, eventtype: Int, initialstate: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwCreateSectionEx(sectionhandle: Long, desiredaccess: Int, objectattributes: Long, maximumsize: Long, sectionpageprotection: Int, allocationattributes: Int, filehandle: Long, extendedparameters: Long, extendedparametercount: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwDeleteFile(objectattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwDeleteObjectAuditAlarm(subsystemname: Long, handleid: Long, generateonclose: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwDuplicateObject(sourceprocesshandle: Long, sourcehandle: Long, targetprocesshandle: Long, targethandle: Long, desiredaccess: Int, handleattributes: Int, options: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwDuplicateToken(existingtokenhandle: Long, desiredaccess: Int, objectattributes: Long, effectiveonly: Boolean, tokentype: Int, newtokenhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwFilterToken(existingtokenhandle: Long, flags: Int, sidstodisable: Long, privilegestodelete: Long, restrictedsids: Long, newtokenhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwFlushBuffersFile(filehandle: Long, iostatusblock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwFlushBuffersFileEx(filehandle: Long, flags: Int, parameters: Long, parameterssize: Int, iostatusblock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwFlushVirtualMemory(processhandle: Long, baseaddress: Long, regionsize: Long, iostatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwFreeVirtualMemory(processhandle: Long, baseaddress: Long, regionsize: Long, freetype: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwImpersonateAnonymousToken(threadhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwOpenDirectoryObject(directoryhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwOpenObjectAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, clienttoken: Long, desiredaccess: Int, grantedaccess: Int, privileges: Long, objectcreation: Boolean, accessgranted: Boolean, generateonclose: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwOpenProcessToken(processhandle: Long, desiredaccess: Int, tokenhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwOpenProcessTokenEx(processhandle: Long, desiredaccess: Int, handleattributes: Int, tokenhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwOpenThreadToken(threadhandle: Long, desiredaccess: Int, openasself: Boolean, tokenhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwOpenThreadTokenEx(threadhandle: Long, desiredaccess: Int, openasself: Boolean, handleattributes: Int, tokenhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwPrivilegeCheck(clienttoken: Long, requiredprivileges: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwPrivilegeObjectAuditAlarm(subsystemname: Long, handleid: Long, clienttoken: Long, desiredaccess: Int, privileges: Long, accessgranted: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwPrivilegedServiceAuditAlarm(subsystemname: Long, servicename: Long, clienttoken: Long, privileges: Long, accessgranted: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwQueryDirectoryObject(directoryhandle: Long, buffer: Long, length: Int, returnsingleentry: Boolean, restartscan: Boolean, context: Long, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwQueryEaFile(filehandle: Long, iostatusblock: Long, buffer: Long, length: Int, returnsingleentry: Boolean, ealist: Long, ealistlength: Int, eaindex: Long, restartscan: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwQueryFullAttributesFile(objectattributes: Long, fileinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwQueryInformationToken(tokenhandle: Long, tokeninformationclass: Int, tokeninformation: Long, tokeninformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwQueryObject(handle: Long, objectinformationclass: Int, objectinformation: Long, objectinformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwQueryQuotaInformationFile(filehandle: Long, iostatusblock: Long, buffer: Long, length: Int, returnsingleentry: Boolean, sidlist: Long, sidlistlength: Int, startsid: Long, restartscan: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwQuerySecurityObject(handle: Long, securityinformation: Int, securitydescriptor: Long, length: Int, lengthneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwQueryVirtualMemory(processhandle: Long, baseaddress: Long, memoryinformationclass: Int, memoryinformation: Long, memoryinformationlength: Long, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwQueryVolumeInformationFile(filehandle: Long, iostatusblock: Long, fsinformation: Long, length: Int, fsinformationclass: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwSetEaFile(filehandle: Long, iostatusblock: Long, buffer: Long, length: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwSetEvent(eventhandle: Long, previousstate: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwSetInformationToken(tokenhandle: Long, tokeninformationclass: Int, tokeninformation: Long, tokeninformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwSetInformationVirtualMemory(processhandle: Long, vminformationclass: Int, numberofentries: Long, virtualaddresses: Long, vminformation: Long, vminformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwSetQuotaInformationFile(filehandle: Long, iostatusblock: Long, buffer: Long, length: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwSetSecurityObject(handle: Long, securityinformation: Int, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwSetVolumeInformationFile(filehandle: Long, iostatusblock: Long, fsinformation: Long, length: Int, fsinformationclass: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_ZwUnlockFile(filehandle: Long, iostatusblock: Long, byteoffset: Long, length: Long, key: Int): Int
}

public actual fun ApplyControlToken(phcontext: Long, pinput: Long): HRESULT =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ApplyControlToken(phcontext, pinput)

public actual fun CcAsyncCopyRead(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, buffer: Long, iostatus: Long, ioissuerthread: PETHREAD, asyncreadcontext: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcAsyncCopyRead(fileobject, fileoffset, length.toInt(), wait, buffer, iostatus, ioissuerthread, asyncreadcontext)

public actual fun CcCanIWrite(fileobject: Long, bytestowrite: UInt, wait: Boolean, retrying: UByte): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcCanIWrite(fileobject, bytestowrite.toInt(), wait, retrying.toByte())

public actual fun CcCoherencyFlushAndPurgeCache(sectionobjectpointer: Long, fileoffset: Long, length: UInt, iostatus: Long, flags: UInt) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcCoherencyFlushAndPurgeCache(sectionobjectpointer, fileoffset, length.toInt(), iostatus, flags.toInt())
}

public actual fun CcCopyRead(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, buffer: Long, iostatus: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcCopyRead(fileobject, fileoffset, length.toInt(), wait, buffer, iostatus)

public actual fun CcCopyReadEx(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, buffer: Long, iostatus: Long, ioissuerthread: PETHREAD): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcCopyReadEx(fileobject, fileoffset, length.toInt(), wait, buffer, iostatus, ioissuerthread)

public actual fun CcCopyWrite(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, buffer: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcCopyWrite(fileobject, fileoffset, length.toInt(), wait, buffer)

public actual fun CcCopyWriteEx(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, buffer: Long, ioissuerthread: PETHREAD): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcCopyWriteEx(fileobject, fileoffset, length.toInt(), wait, buffer, ioissuerthread)

public actual fun CcCopyWriteWontFlush(fileobject: Long, fileoffset: Long, length: UInt): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcCopyWriteWontFlush(fileobject, fileoffset, length.toInt())

public actual fun CcDeferWrite(fileobject: Long, postroutine: PCC_POST_DEFERRED_WRITE, context1: Long, context2: Long, bytestowrite: UInt, retrying: Boolean) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcDeferWrite(fileobject, postroutine.toLong(), context1, context2, bytestowrite.toInt(), retrying)
}

public actual fun CcErrorCallbackRoutine(context: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcErrorCallbackRoutine(context)

public actual fun CcFastCopyRead(fileobject: Long, fileoffset: UInt, length: UInt, pagecount: UInt, buffer: Long, iostatus: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcFastCopyRead(fileobject, fileoffset.toInt(), length.toInt(), pagecount.toInt(), buffer, iostatus)
}

public actual fun CcFastCopyWrite(fileobject: Long, fileoffset: UInt, length: UInt, buffer: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcFastCopyWrite(fileobject, fileoffset.toInt(), length.toInt(), buffer)
}

public actual fun CcFlushCache(sectionobjectpointer: Long, fileoffset: Long, length: UInt, iostatus: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcFlushCache(sectionobjectpointer, fileoffset, length.toInt(), iostatus)
}

public actual fun CcGetDirtyPages(loghandle: Long, dirtypageroutine: PDIRTY_PAGE_ROUTINE, context1: Long, context2: Long): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcGetDirtyPages(loghandle, dirtypageroutine.toLong(), context1, context2)

public actual fun CcGetFileObjectFromBcb(bcb: Long): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcGetFileObjectFromBcb(bcb)

public actual fun CcGetFileObjectFromSectionPtrs(sectionobjectpointer: Long): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcGetFileObjectFromSectionPtrs(sectionobjectpointer)

public actual fun CcGetFileObjectFromSectionPtrsRef(sectionobjectpointer: Long): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcGetFileObjectFromSectionPtrsRef(sectionobjectpointer)

public actual fun CcGetFlushedValidData(sectionobjectpointer: Long, bcblistheld: Boolean): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcGetFlushedValidData(sectionobjectpointer, bcblistheld)

public actual fun CcInitializeCacheMap(fileobject: Long, filesizes: Long, pinaccess: Boolean, callbacks: Long, lazywritecontext: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcInitializeCacheMap(fileobject, filesizes, pinaccess, callbacks, lazywritecontext)
}

public actual fun CcInitializeCacheMapEx(fileobject: Long, filesizes: Long, pinaccess: Boolean, callbacks: Long, lazywritecontext: Long, flags: UInt) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcInitializeCacheMapEx(fileobject, filesizes, pinaccess, callbacks, lazywritecontext, flags.toInt())
}

public actual fun CcIsCacheManagerCallbackNeeded(status: NTSTATUS): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcIsCacheManagerCallbackNeeded(status)

public actual fun CcIsThereDirtyData(vpb: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcIsThereDirtyData(vpb)

public actual fun CcIsThereDirtyDataEx(vpb: Long, numberofdirtypages: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcIsThereDirtyDataEx(vpb, numberofdirtypages)

public actual fun CcMapData(fileobject: Long, fileoffset: Long, length: UInt, flags: UInt, bcb: Long, buffer: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcMapData(fileobject, fileoffset, length.toInt(), flags.toInt(), bcb, buffer)

public actual fun CcMdlRead(fileobject: Long, fileoffset: Long, length: UInt, mdlchain: Long, iostatus: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcMdlRead(fileobject, fileoffset, length.toInt(), mdlchain, iostatus)
}

public actual fun CcMdlReadComplete(fileobject: Long, mdlchain: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcMdlReadComplete(fileobject, mdlchain)
}

public actual fun CcMdlWriteAbort(fileobject: Long, mdlchain: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcMdlWriteAbort(fileobject, mdlchain)
}

public actual fun CcMdlWriteComplete(fileobject: Long, fileoffset: Long, mdlchain: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcMdlWriteComplete(fileobject, fileoffset, mdlchain)
}

public actual fun CcPinMappedData(fileobject: Long, fileoffset: Long, length: UInt, flags: UInt, bcb: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcPinMappedData(fileobject, fileoffset, length.toInt(), flags.toInt(), bcb)

public actual fun CcPinRead(fileobject: Long, fileoffset: Long, length: UInt, flags: UInt, bcb: Long, buffer: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcPinRead(fileobject, fileoffset, length.toInt(), flags.toInt(), bcb, buffer)

public actual fun CcPrepareMdlWrite(fileobject: Long, fileoffset: Long, length: UInt, mdlchain: Long, iostatus: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcPrepareMdlWrite(fileobject, fileoffset, length.toInt(), mdlchain, iostatus)
}

public actual fun CcPreparePinWrite(fileobject: Long, fileoffset: Long, length: UInt, zero: Boolean, flags: UInt, bcb: Long, buffer: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcPreparePinWrite(fileobject, fileoffset, length.toInt(), zero, flags.toInt(), bcb, buffer)

public actual fun CcPurgeCacheSection(sectionobjectpointer: Long, fileoffset: Long, length: UInt, flags: UInt): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcPurgeCacheSection(sectionobjectpointer, fileoffset, length.toInt(), flags.toInt())

public actual fun CcRemapBcb(bcb: Long): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcRemapBcb(bcb)

public actual fun CcRepinBcb(bcb: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcRepinBcb(bcb)
}

public actual fun CcScheduleReadAhead(fileobject: Long, fileoffset: Long, length: UInt) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcScheduleReadAhead(fileobject, fileoffset, length.toInt())
}

public actual fun CcScheduleReadAheadEx(fileobject: Long, fileoffset: Long, length: UInt, ioissuerthread: PETHREAD) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcScheduleReadAheadEx(fileobject, fileoffset, length.toInt(), ioissuerthread)
}

public actual fun CcSetAdditionalCacheAttributes(fileobject: Long, disablereadahead: Boolean, disablewritebehind: Boolean) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcSetAdditionalCacheAttributes(fileobject, disablereadahead, disablewritebehind)
}

public actual fun CcSetAdditionalCacheAttributesEx(fileobject: Long, flags: UInt) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcSetAdditionalCacheAttributesEx(fileobject, flags.toInt())
}

public actual fun CcSetBcbOwnerPointer(bcb: Long, ownerpointer: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcSetBcbOwnerPointer(bcb, ownerpointer)
}

public actual fun CcSetDirtyPageThreshold(fileobject: Long, dirtypagethreshold: UInt) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcSetDirtyPageThreshold(fileobject, dirtypagethreshold.toInt())
}

public actual fun CcSetDirtyPinnedData(bcbvoid: Long, lsn: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcSetDirtyPinnedData(bcbvoid, lsn)
}

public actual fun CcSetFileSizes(fileobject: Long, filesizes: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcSetFileSizes(fileobject, filesizes)
}

public actual fun CcSetFileSizesEx(fileobject: Long, filesizes: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcSetFileSizesEx(fileobject, filesizes)

public actual fun CcSetLogHandleForFile(fileobject: Long, loghandle: Long, flushtolsnroutine: PFLUSH_TO_LSN) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcSetLogHandleForFile(fileobject, loghandle, flushtolsnroutine.toLong())
}

public actual fun CcSetParallelFlushFile(fileobject: Long, enableparallelflush: Boolean) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcSetParallelFlushFile(fileobject, enableparallelflush)
}

public actual fun CcSetReadAheadGranularity(fileobject: Long, granularity: UInt) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcSetReadAheadGranularity(fileobject, granularity.toInt())
}

public actual fun CcUninitializeCacheMap(fileobject: Long, truncatesize: Long, uninitializeevent: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcUninitializeCacheMap(fileobject, truncatesize, uninitializeevent)

public actual fun CcUnpinData(bcb: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcUnpinData(bcb)
}

public actual fun CcUnpinDataForThread(bcb: Long, resourcethreadid: ULong) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcUnpinDataForThread(bcb, resourcethreadid.toLong())
}

public actual fun CcUnpinRepinnedBcb(bcb: Long, writethrough: Boolean, iostatus: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcUnpinRepinnedBcb(bcb, writethrough, iostatus)
}

public actual fun CcWaitForCurrentLazyWriterActivity(): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcWaitForCurrentLazyWriterActivity()

public actual fun CcZeroData(fileobject: Long, startoffset: Long, endoffset: Long, wait: Boolean): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CcZeroData(fileobject, startoffset, endoffset, wait)

public actual fun CompleteAuthToken(phcontext: Long, ptoken: Long): HRESULT =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_CompleteAuthToken(phcontext, ptoken)

public actual fun ExDisableResourceBoostLite(resource: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ExDisableResourceBoostLite(resource)
}

public actual fun ExQueryPoolBlockSize(poolblock: Long, quotacharged: Long): ULong =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ExQueryPoolBlockSize(poolblock, quotacharged).toULong()

public actual fun ExportSecurityContext(phcontext: Long, fflags: UInt, ppackedcontext: Long, ptoken: Long): HRESULT =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ExportSecurityContext(phcontext, fflags.toInt(), ppackedcontext, ptoken)

public actual fun FsRtlAcknowledgeEcp(ecpcontext: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlAcknowledgeEcp(ecpcontext)
}

public actual fun FsRtlAcquireFileExclusive(fileobject: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlAcquireFileExclusive(fileobject)
}

public actual fun FsRtlAddBaseMcbEntry(mcb: Long, vbn: Long, lbn: Long, sectorcount: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlAddBaseMcbEntry(mcb, vbn, lbn, sectorcount)

public actual fun FsRtlAddBaseMcbEntryEx(mcb: Long, vbn: Long, lbn: Long, sectorcount: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlAddBaseMcbEntryEx(mcb, vbn, lbn, sectorcount)

public actual fun FsRtlAddLargeMcbEntry(mcb: Long, vbn: Long, lbn: Long, sectorcount: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlAddLargeMcbEntry(mcb, vbn, lbn, sectorcount)

public actual fun FsRtlAddMcbEntry(mcb: Long, vbn: UInt, lbn: UInt, sectorcount: UInt): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlAddMcbEntry(mcb, vbn.toInt(), lbn.toInt(), sectorcount.toInt())

public actual fun FsRtlAddToTunnelCache(cache: Long, directorykey: ULong, shortname: Long, longname: Long, keybyshortname: Boolean, datalength: UInt, data: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlAddToTunnelCache(cache, directorykey.toLong(), shortname, longname, keybyshortname, datalength.toInt(), data)
}

public actual fun FsRtlAddToTunnelCacheEx(cache: Long, directorykey: ULong, shortname: Long, longname: Long, flags: UInt, datalength: UInt, data: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlAddToTunnelCacheEx(cache, directorykey.toLong(), shortname, longname, flags.toInt(), datalength.toInt(), data)
}

public actual fun FsRtlAllocateAePushLock(pooltype: POOL_TYPE, tag: UInt): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlAllocateAePushLock(pooltype, tag.toInt())

public actual fun FsRtlAllocateExtraCreateParameter(ecptype: Long, sizeofcontext: UInt, flags: UInt, cleanupcallback: PFSRTL_EXTRA_CREATE_PARAMETER_CLEANUP_CALLBACK, pooltag: UInt, ecpcontext: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlAllocateExtraCreateParameter(ecptype, sizeofcontext.toInt(), flags.toInt(), cleanupcallback.toLong(), pooltag.toInt(), ecpcontext)

public actual fun FsRtlAllocateExtraCreateParameterFromLookasideList(ecptype: Long, sizeofcontext: UInt, flags: UInt, cleanupcallback: PFSRTL_EXTRA_CREATE_PARAMETER_CLEANUP_CALLBACK, lookasidelist: Long, ecpcontext: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlAllocateExtraCreateParameterFromLookasideList(ecptype, sizeofcontext.toInt(), flags.toInt(), cleanupcallback.toLong(), lookasidelist, ecpcontext)

public actual fun FsRtlAllocateExtraCreateParameterList(flags: UInt, ecplist: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlAllocateExtraCreateParameterList(flags.toInt(), ecplist)

public actual fun FsRtlAllocateFileLock(completelockirproutine: PCOMPLETE_LOCK_IRP_ROUTINE, unlockroutine: PUNLOCK_ROUTINE): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlAllocateFileLock(completelockirproutine.toLong(), unlockroutine.toLong())

public actual fun FsRtlAllocateResource(): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlAllocateResource()

public actual fun FsRtlAreNamesEqual(constantnamea: Long, constantnameb: Long, ignorecase: Boolean, upcasetable: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlAreNamesEqual(constantnamea, constantnameb, ignorecase, upcasetable)

public actual fun FsRtlAreThereCurrentOrInProgressFileLocks(filelock: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlAreThereCurrentOrInProgressFileLocks(filelock)

public actual fun FsRtlAreThereWaitingFileLocks(filelock: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlAreThereWaitingFileLocks(filelock)

public actual fun FsRtlAreVolumeStartupApplicationsComplete(): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlAreVolumeStartupApplicationsComplete()

public actual fun FsRtlBalanceReads(targetdevice: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlBalanceReads(targetdevice)

public actual fun FsRtlCancellableWaitForMultipleObjects(count: UInt, objectarray: Long, waittype: WAIT_TYPE, timeout: Long, waitblockarray: Long, irp: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlCancellableWaitForMultipleObjects(count.toInt(), objectarray, waittype, timeout, waitblockarray, irp)

public actual fun FsRtlCancellableWaitForSingleObject(obj: Long, timeout: Long, irp: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlCancellableWaitForSingleObject(obj, timeout, irp)

public actual fun FsRtlChangeBackingFileObject(currentfileobject: Long, newfileobject: Long, changebackingtype: FSRTL_CHANGE_BACKING_TYPE, flags: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlChangeBackingFileObject(currentfileobject, newfileobject, changebackingtype, flags.toInt())

public actual fun FsRtlCheckLockForOplockRequest(filelock: Long, allocationsize: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlCheckLockForOplockRequest(filelock, allocationsize)

public actual fun FsRtlCheckLockForReadAccess(filelock: Long, irp: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlCheckLockForReadAccess(filelock, irp)

public actual fun FsRtlCheckLockForWriteAccess(filelock: Long, irp: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlCheckLockForWriteAccess(filelock, irp)

public actual fun FsRtlCheckOplock(oplock: Long, irp: Long, context: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlCheckOplock(oplock, irp, context, completionroutine.toLong(), postirproutine.toLong())

public actual fun FsRtlCheckOplockEx(oplock: Long, irp: Long, flags: UInt, context: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlCheckOplockEx(oplock, irp, flags.toInt(), context, completionroutine.toLong(), postirproutine.toLong())

public actual fun FsRtlCheckOplockEx2(oplock: Long, irp: Long, flags: UInt, flagsex2: UInt, completionroutinecontext: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP, timeout: ULong, notifycontext: Long, notifyroutine: POPLOCK_NOTIFY_ROUTINE): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlCheckOplockEx2(oplock, irp, flags.toInt(), flagsex2.toInt(), completionroutinecontext, completionroutine.toLong(), postirproutine.toLong(), timeout.toLong(), notifycontext, notifyroutine.toLong())

public actual fun FsRtlCheckUpperOplock(oplock: Long, newloweroplockstate: UInt, completionroutinecontext: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, prependroutine: POPLOCK_FS_PREPOST_IRP, flags: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlCheckUpperOplock(oplock, newloweroplockstate.toInt(), completionroutinecontext, completionroutine.toLong(), prependroutine.toLong(), flags.toInt())

public actual fun FsRtlCopyRead(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, lockkey: UInt, buffer: Long, iostatus: Long, deviceobject: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlCopyRead(fileobject, fileoffset, length.toInt(), wait, lockkey.toInt(), buffer, iostatus, deviceobject)

public actual fun FsRtlCopyWrite(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, lockkey: UInt, buffer: Long, iostatus: Long, deviceobject: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlCopyWrite(fileobject, fileoffset, length.toInt(), wait, lockkey.toInt(), buffer, iostatus, deviceobject)

public actual fun FsRtlCreateSectionForDataScan(sectionhandle: Long, sectionobject: Long, sectionfilesize: Long, fileobject: Long, desiredaccess: UInt, objectattributes: Long, maximumsize: Long, sectionpageprotection: UInt, allocationattributes: UInt, flags: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlCreateSectionForDataScan(sectionhandle, sectionobject, sectionfilesize, fileobject, desiredaccess.toInt(), objectattributes, maximumsize, sectionpageprotection.toInt(), allocationattributes.toInt(), flags.toInt())

public actual fun FsRtlCurrentBatchOplock(oplock: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlCurrentBatchOplock(oplock)

public actual fun FsRtlCurrentOplock(oplock: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlCurrentOplock(oplock)

public actual fun FsRtlCurrentOplockH(oplock: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlCurrentOplockH(oplock)

public actual fun FsRtlDeleteExtraCreateParameterLookasideList(lookaside: Long, flags: UInt) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlDeleteExtraCreateParameterLookasideList(lookaside, flags.toInt())
}

public actual fun FsRtlDeleteKeyFromTunnelCache(cache: Long, directorykey: ULong) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlDeleteKeyFromTunnelCache(cache, directorykey.toLong())
}

public actual fun FsRtlDeleteTunnelCache(cache: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlDeleteTunnelCache(cache)
}

public actual fun FsRtlDeregisterUncProvider(handle: HANDLE) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlDeregisterUncProvider(handle)
}

public actual fun FsRtlDismountComplete(deviceobject: Long, dismountstatus: NTSTATUS) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlDismountComplete(deviceobject, dismountstatus)
}

public actual fun FsRtlDissectDbcs(path: STRING, firstname: Long, remainingname: Long) {
}

public actual fun FsRtlDissectName(path: UNICODE_STRING, firstname: Long, remainingname: Long) {
}

public actual fun FsRtlDoesDbcsContainWildCards(name: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlDoesDbcsContainWildCards(name)

public actual fun FsRtlDoesNameContainWildCards(name: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlDoesNameContainWildCards(name)

public actual fun FsRtlFastCheckLockForRead(filelock: Long, startingbyte: Long, length: Long, key: UInt, fileobject: Long, processid: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlFastCheckLockForRead(filelock, startingbyte, length, key.toInt(), fileobject, processid)

public actual fun FsRtlFastCheckLockForWrite(filelock: Long, startingbyte: Long, length: Long, key: UInt, fileobject: Long, processid: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlFastCheckLockForWrite(filelock, startingbyte, length, key.toInt(), fileobject, processid)

public actual fun FsRtlFastUnlockAll(filelock: Long, fileobject: Long, processid: PEPROCESS, context: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlFastUnlockAll(filelock, fileobject, processid, context)

public actual fun FsRtlFastUnlockAllByKey(filelock: Long, fileobject: Long, processid: PEPROCESS, key: UInt, context: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlFastUnlockAllByKey(filelock, fileobject, processid, key.toInt(), context)

public actual fun FsRtlFastUnlockSingle(filelock: Long, fileobject: Long, fileoffset: Long, length: Long, processid: PEPROCESS, key: UInt, context: Long, alreadysynchronized: Boolean): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlFastUnlockSingle(filelock, fileobject, fileoffset, length, processid, key.toInt(), context, alreadysynchronized)

public actual fun FsRtlFindExtraCreateParameter(ecplist: Long, ecptype: Long, ecpcontext: Long, ecpcontextsize: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlFindExtraCreateParameter(ecplist, ecptype, ecpcontext, ecpcontextsize)

public actual fun FsRtlFindInTunnelCache(cache: Long, directorykey: ULong, name: Long, shortname: Long, longname: Long, datalength: Long, data: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlFindInTunnelCache(cache, directorykey.toLong(), name, shortname, longname, datalength, data)

public actual fun FsRtlFindInTunnelCacheEx(cache: Long, directorykey: ULong, name: Long, shortname: Long, longname: Long, flags: UInt, datalength: Long, data: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlFindInTunnelCacheEx(cache, directorykey.toLong(), name, shortname, longname, flags.toInt(), datalength, data)

public actual fun FsRtlFreeAePushLock(aepushlock: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlFreeAePushLock(aepushlock)
}

public actual fun FsRtlFreeExtraCreateParameter(ecpcontext: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlFreeExtraCreateParameter(ecpcontext)
}

public actual fun FsRtlFreeExtraCreateParameterList(ecplist: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlFreeExtraCreateParameterList(ecplist)
}

public actual fun FsRtlFreeFileLock(filelock: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlFreeFileLock(filelock)
}

public actual fun FsRtlGetCurrentProcessLoaderList(): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlGetCurrentProcessLoaderList()

public actual fun FsRtlGetEcpListFromIrp(irp: Long, ecplist: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlGetEcpListFromIrp(irp, ecplist)

public actual fun FsRtlGetFileSize(fileobject: Long, filesize: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlGetFileSize(fileobject, filesize)

public actual fun FsRtlGetNextBaseMcbEntry(mcb: Long, runindex: UInt, vbn: Long, lbn: Long, sectorcount: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlGetNextBaseMcbEntry(mcb, runindex.toInt(), vbn, lbn, sectorcount)

public actual fun FsRtlGetNextExtraCreateParameter(ecplist: Long, currentecpcontext: Long, nextecptype: Long, nextecpcontext: Long, nextecpcontextsize: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlGetNextExtraCreateParameter(ecplist, currentecpcontext, nextecptype, nextecpcontext, nextecpcontextsize)

public actual fun FsRtlGetNextFileLock(filelock: Long, restart: Boolean): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlGetNextFileLock(filelock, restart)

public actual fun FsRtlGetNextLargeMcbEntry(mcb: Long, runindex: UInt, vbn: Long, lbn: Long, sectorcount: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlGetNextLargeMcbEntry(mcb, runindex.toInt(), vbn, lbn, sectorcount)

public actual fun FsRtlGetNextMcbEntry(mcb: Long, runindex: UInt, vbn: Long, lbn: Long, sectorcount: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlGetNextMcbEntry(mcb, runindex.toInt(), vbn, lbn, sectorcount)

public actual fun FsRtlGetSectorSizeInformation(deviceobject: Long, sectorsizeinfo: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlGetSectorSizeInformation(deviceobject, sectorsizeinfo)

public actual fun FsRtlGetSupportedFeatures(deviceobject: Long, supportedfeatures: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlGetSupportedFeatures(deviceobject, supportedfeatures)

public actual fun FsRtlGetVirtualDiskNestingLevel(deviceobject: Long, nestinglevel: Long, nestingflags: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlGetVirtualDiskNestingLevel(deviceobject, nestinglevel, nestingflags)

public actual fun FsRtlIncrementCcFastMdlReadWait() {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlIncrementCcFastMdlReadWait()
}

public actual fun FsRtlIncrementCcFastReadNoWait() {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlIncrementCcFastReadNoWait()
}

public actual fun FsRtlIncrementCcFastReadNotPossible() {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlIncrementCcFastReadNotPossible()
}

public actual fun FsRtlIncrementCcFastReadResourceMiss() {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlIncrementCcFastReadResourceMiss()
}

public actual fun FsRtlIncrementCcFastReadWait() {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlIncrementCcFastReadWait()
}

public actual fun FsRtlInitExtraCreateParameterLookasideList(lookaside: Long, flags: UInt, size: ULong, tag: UInt) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlInitExtraCreateParameterLookasideList(lookaside, flags.toInt(), size.toLong(), tag.toInt())
}

public actual fun FsRtlInitializeBaseMcb(mcb: Long, pooltype: POOL_TYPE) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlInitializeBaseMcb(mcb, pooltype)
}

public actual fun FsRtlInitializeBaseMcbEx(mcb: Long, pooltype: POOL_TYPE, flags: UShort): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlInitializeBaseMcbEx(mcb, pooltype, flags.toShort())

public actual fun FsRtlInitializeExtraCreateParameter(ecp: Long, ecpflags: UInt, cleanupcallback: PFSRTL_EXTRA_CREATE_PARAMETER_CLEANUP_CALLBACK, totalsize: UInt, ecptype: Long, listallocatedfrom: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlInitializeExtraCreateParameter(ecp, ecpflags.toInt(), cleanupcallback.toLong(), totalsize.toInt(), ecptype, listallocatedfrom)
}

public actual fun FsRtlInitializeExtraCreateParameterList(ecplist: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlInitializeExtraCreateParameterList(ecplist)

public actual fun FsRtlInitializeFileLock(filelock: Long, completelockirproutine: PCOMPLETE_LOCK_IRP_ROUTINE, unlockroutine: PUNLOCK_ROUTINE) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlInitializeFileLock(filelock, completelockirproutine.toLong(), unlockroutine.toLong())
}

public actual fun FsRtlInitializeLargeMcb(mcb: Long, pooltype: POOL_TYPE) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlInitializeLargeMcb(mcb, pooltype)
}

public actual fun FsRtlInitializeMcb(mcb: Long, pooltype: POOL_TYPE) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlInitializeMcb(mcb, pooltype)
}

public actual fun FsRtlInitializeOplock(oplock: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlInitializeOplock(oplock)
}

public actual fun FsRtlInitializeTunnelCache(cache: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlInitializeTunnelCache(cache)
}

public actual fun FsRtlInsertExtraCreateParameter(ecplist: Long, ecpcontext: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlInsertExtraCreateParameter(ecplist, ecpcontext)

public actual fun FsRtlInsertPerFileContext(perfilecontextpointer: Long, ptr: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlInsertPerFileContext(perfilecontextpointer, ptr)

public actual fun FsRtlInsertPerFileObjectContext(fileobject: Long, ptr: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlInsertPerFileObjectContext(fileobject, ptr)

public actual fun FsRtlInsertPerStreamContext(perstreamcontext: Long, ptr: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlInsertPerStreamContext(perstreamcontext, ptr)

public actual fun FsRtlIs32BitProcess(process: PEPROCESS): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlIs32BitProcess(process)

public actual fun FsRtlIsDaxVolume(fileobject: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlIsDaxVolume(fileobject)

public actual fun FsRtlIsDbcsInExpression(expression: Long, name: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlIsDbcsInExpression(expression, name)

public actual fun FsRtlIsEcpAcknowledged(ecpcontext: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlIsEcpAcknowledged(ecpcontext)

public actual fun FsRtlIsEcpFromUserMode(ecpcontext: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlIsEcpFromUserMode(ecpcontext)

public actual fun FsRtlIsExtentDangling(startpage: UInt, numberofpages: UInt, flags: UInt): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlIsExtentDangling(startpage.toInt(), numberofpages.toInt(), flags.toInt()).toUInt()

public actual fun FsRtlIsFatDbcsLegal(dbcsname: STRING, wildcardspermissible: Boolean, pathnamepermissible: Boolean, leadingbackslashpermissible: Boolean): Boolean =
    false

public actual fun FsRtlIsHpfsDbcsLegal(dbcsname: STRING, wildcardspermissible: Boolean, pathnamepermissible: Boolean, leadingbackslashpermissible: Boolean): Boolean =
    false

public actual fun FsRtlIsMobileOS(): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlIsMobileOS()

public actual fun FsRtlIsNameInExpression(expression: Long, name: Long, ignorecase: Boolean, upcasetable: PCWSTR): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlIsNameInExpression(expression, name, ignorecase, upcasetable)

public actual fun FsRtlIsNameInUnUpcasedExpression(expression: Long, name: Long, ignorecase: Boolean, upcasetable: PCWSTR): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlIsNameInUnUpcasedExpression(expression, name, ignorecase, upcasetable)

public actual fun FsRtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag: UInt): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag.toInt())

public actual fun FsRtlIsNtstatusExpected(exception: NTSTATUS): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlIsNtstatusExpected(exception)

public actual fun FsRtlIsPagingFile(fileobject: Long): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlIsPagingFile(fileobject).toUInt()

public actual fun FsRtlIsSystemPagingFile(fileobject: Long): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlIsSystemPagingFile(fileobject).toUInt()

public actual fun FsRtlIssueDeviceIoControl(deviceobject: Long, ioctl: UInt, flags: UByte, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt, iosbinformation: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlIssueDeviceIoControl(deviceobject, ioctl.toInt(), flags.toByte(), inputbuffer, inputbufferlength.toInt(), outputbuffer, outputbufferlength.toInt(), iosbinformation)

public actual fun FsRtlKernelFsControlFile(fileobject: Long, fscontrolcode: UInt, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt, retoutputbuffersize: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlKernelFsControlFile(fileobject, fscontrolcode.toInt(), inputbuffer, inputbufferlength.toInt(), outputbuffer, outputbufferlength.toInt(), retoutputbuffersize)

public actual fun FsRtlLogCcFlushError(filename: Long, deviceobject: Long, sectionobjectpointer: Long, flusherror: NTSTATUS, flags: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlLogCcFlushError(filename, deviceobject, sectionobjectpointer, flusherror, flags.toInt())

public actual fun FsRtlLookupBaseMcbEntry(mcb: Long, vbn: Long, lbn: Long, sectorcountfromlbn: Long, startinglbn: Long, sectorcountfromstartinglbn: Long, index: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlLookupBaseMcbEntry(mcb, vbn, lbn, sectorcountfromlbn, startinglbn, sectorcountfromstartinglbn, index)

public actual fun FsRtlLookupLargeMcbEntry(mcb: Long, vbn: Long, lbn: Long, sectorcountfromlbn: Long, startinglbn: Long, sectorcountfromstartinglbn: Long, index: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlLookupLargeMcbEntry(mcb, vbn, lbn, sectorcountfromlbn, startinglbn, sectorcountfromstartinglbn, index)

public actual fun FsRtlLookupLastBaseMcbEntry(mcb: Long, vbn: Long, lbn: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlLookupLastBaseMcbEntry(mcb, vbn, lbn)

public actual fun FsRtlLookupLastBaseMcbEntryAndIndex(opaquemcb: Long, largevbn: Long, largelbn: Long, index: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlLookupLastBaseMcbEntryAndIndex(opaquemcb, largevbn, largelbn, index)

public actual fun FsRtlLookupLastLargeMcbEntry(mcb: Long, vbn: Long, lbn: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlLookupLastLargeMcbEntry(mcb, vbn, lbn)

public actual fun FsRtlLookupLastLargeMcbEntryAndIndex(opaquemcb: Long, largevbn: Long, largelbn: Long, index: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlLookupLastLargeMcbEntryAndIndex(opaquemcb, largevbn, largelbn, index)

public actual fun FsRtlLookupLastMcbEntry(mcb: Long, vbn: Long, lbn: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlLookupLastMcbEntry(mcb, vbn, lbn)

public actual fun FsRtlLookupMcbEntry(mcb: Long, vbn: UInt, lbn: Long, sectorcount: Long, index: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlLookupMcbEntry(mcb, vbn.toInt(), lbn, sectorcount, index)

public actual fun FsRtlLookupPerFileContext(perfilecontextpointer: Long, ownerid: Long, instanceid: Long): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlLookupPerFileContext(perfilecontextpointer, ownerid, instanceid)

public actual fun FsRtlLookupPerFileObjectContext(fileobject: Long, ownerid: Long, instanceid: Long): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlLookupPerFileObjectContext(fileobject, ownerid, instanceid)

public actual fun FsRtlLookupPerStreamContextInternal(streamcontext: Long, ownerid: Long, instanceid: Long): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlLookupPerStreamContextInternal(streamcontext, ownerid, instanceid)

public actual fun FsRtlMdlReadCompleteDev(fileobject: Long, mdlchain: Long, deviceobject: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlMdlReadCompleteDev(fileobject, mdlchain, deviceobject)

public actual fun FsRtlMdlReadDev(fileobject: Long, fileoffset: Long, length: UInt, lockkey: UInt, mdlchain: Long, iostatus: Long, deviceobject: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlMdlReadDev(fileobject, fileoffset, length.toInt(), lockkey.toInt(), mdlchain, iostatus, deviceobject)

public actual fun FsRtlMdlReadEx(fileobject: Long, fileoffset: Long, length: UInt, lockkey: UInt, mdlchain: Long, iostatus: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlMdlReadEx(fileobject, fileoffset, length.toInt(), lockkey.toInt(), mdlchain, iostatus)

public actual fun FsRtlMdlWriteCompleteDev(fileobject: Long, fileoffset: Long, mdlchain: Long, deviceobject: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlMdlWriteCompleteDev(fileobject, fileoffset, mdlchain, deviceobject)

public actual fun FsRtlMupGetProviderIdFromName(pprovidername: Long, pproviderid: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlMupGetProviderIdFromName(pprovidername, pproviderid)

public actual fun FsRtlMupGetProviderInfoFromFileObject(pfileobject: Long, level: UInt, pbuffer: Long, pbuffersize: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlMupGetProviderInfoFromFileObject(pfileobject, level.toInt(), pbuffer, pbuffersize)

public actual fun FsRtlNormalizeNtstatus(exception: NTSTATUS, genericexception: NTSTATUS): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlNormalizeNtstatus(exception, genericexception)

public actual fun FsRtlNotifyCleanup(notifysync: PNOTIFY_SYNC, notifylist: Long, fscontext: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlNotifyCleanup(notifysync, notifylist, fscontext)
}

public actual fun FsRtlNotifyCleanupAll(notifysync: PNOTIFY_SYNC, notifylist: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlNotifyCleanupAll(notifysync, notifylist)
}

public actual fun FsRtlNotifyFilterChangeDirectory(notifysync: PNOTIFY_SYNC, notifylist: Long, fscontext: Long, fulldirectoryname: Long, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifyirp: Long, traversecallback: PCHECK_FOR_TRAVERSE_ACCESS, subjectcontext: Long, filtercallback: PFILTER_REPORT_CHANGE) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlNotifyFilterChangeDirectory(notifysync, notifylist, fscontext, fulldirectoryname, watchtree, ignorebuffer, completionfilter.toInt(), notifyirp, traversecallback.toLong(), subjectcontext, filtercallback.toLong())
}

public actual fun FsRtlNotifyFilterReportChange(notifysync: PNOTIFY_SYNC, notifylist: Long, fulltargetname: Long, targetnameoffset: UShort, streamname: Long, normalizedparentname: Long, filtermatch: UInt, action: UInt, targetcontext: Long, filtercontext: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlNotifyFilterReportChange(notifysync, notifylist, fulltargetname, targetnameoffset.toShort(), streamname, normalizedparentname, filtermatch.toInt(), action.toInt(), targetcontext, filtercontext)
}

public actual fun FsRtlNotifyFullChangeDirectory(notifysync: PNOTIFY_SYNC, notifylist: Long, fscontext: Long, fulldirectoryname: Long, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifyirp: Long, traversecallback: PCHECK_FOR_TRAVERSE_ACCESS, subjectcontext: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlNotifyFullChangeDirectory(notifysync, notifylist, fscontext, fulldirectoryname, watchtree, ignorebuffer, completionfilter.toInt(), notifyirp, traversecallback.toLong(), subjectcontext)
}

public actual fun FsRtlNotifyFullReportChange(notifysync: PNOTIFY_SYNC, notifylist: Long, fulltargetname: Long, targetnameoffset: UShort, streamname: Long, normalizedparentname: Long, filtermatch: UInt, action: UInt, targetcontext: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlNotifyFullReportChange(notifysync, notifylist, fulltargetname, targetnameoffset.toShort(), streamname, normalizedparentname, filtermatch.toInt(), action.toInt(), targetcontext)
}

public actual fun FsRtlNotifyInitializeSync(notifysync: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlNotifyInitializeSync(notifysync)
}

public actual fun FsRtlNotifyUninitializeSync(notifysync: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlNotifyUninitializeSync(notifysync)
}

public actual fun FsRtlNotifyVolumeEvent(fileobject: Long, eventcode: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlNotifyVolumeEvent(fileobject, eventcode.toInt())

public actual fun FsRtlNotifyVolumeEventEx(fileobject: Long, eventcode: UInt, event: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlNotifyVolumeEventEx(fileobject, eventcode.toInt(), event)

public actual fun FsRtlNumberOfRunsInBaseMcb(mcb: Long): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlNumberOfRunsInBaseMcb(mcb).toUInt()

public actual fun FsRtlNumberOfRunsInLargeMcb(mcb: Long): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlNumberOfRunsInLargeMcb(mcb).toUInt()

public actual fun FsRtlNumberOfRunsInMcb(mcb: Long): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlNumberOfRunsInMcb(mcb).toUInt()

public actual fun FsRtlOplockBreakH(oplock: Long, irp: Long, flags: UInt, context: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlOplockBreakH(oplock, irp, flags.toInt(), context, completionroutine.toLong(), postirproutine.toLong())

public actual fun FsRtlOplockBreakH2(oplock: Long, irp: Long, flags: UInt, context: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP, grantedaccess: Long, shareaccess: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlOplockBreakH2(oplock, irp, flags.toInt(), context, completionroutine.toLong(), postirproutine.toLong(), grantedaccess, shareaccess)

public actual fun FsRtlOplockBreakToNone(oplock: Long, irpsp: Long, irp: Long, context: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlOplockBreakToNone(oplock, irpsp, irp, context, completionroutine.toLong(), postirproutine.toLong())

public actual fun FsRtlOplockBreakToNoneEx(oplock: Long, irp: Long, flags: UInt, context: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlOplockBreakToNoneEx(oplock, irp, flags.toInt(), context, completionroutine.toLong(), postirproutine.toLong())

public actual fun FsRtlOplockFsctrl(oplock: Long, irp: Long, opencount: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlOplockFsctrl(oplock, irp, opencount.toInt())

public actual fun FsRtlOplockFsctrlEx(oplock: Long, irp: Long, opencount: UInt, flags: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlOplockFsctrlEx(oplock, irp, opencount.toInt(), flags.toInt())

public actual fun FsRtlOplockGetAnyBreakOwnerProcess(oplock: Long): PEPROCESS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlOplockGetAnyBreakOwnerProcess(oplock)

public actual fun FsRtlOplockIsFastIoPossible(oplock: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlOplockIsFastIoPossible(oplock)

public actual fun FsRtlOplockIsSharedRequest(irp: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlOplockIsSharedRequest(irp)

public actual fun FsRtlOplockKeysEqual(fo1: Long, fo2: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlOplockKeysEqual(fo1, fo2)

public actual fun FsRtlPostPagingFileStackOverflow(context: Long, event: Long, stackoverflowroutine: PFSRTL_STACK_OVERFLOW_ROUTINE) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlPostPagingFileStackOverflow(context, event, stackoverflowroutine.toLong())
}

public actual fun FsRtlPostStackOverflow(context: Long, event: Long, stackoverflowroutine: PFSRTL_STACK_OVERFLOW_ROUTINE) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlPostStackOverflow(context, event, stackoverflowroutine.toLong())
}

public actual fun FsRtlPrepareMdlWriteDev(fileobject: Long, fileoffset: Long, length: UInt, lockkey: UInt, mdlchain: Long, iostatus: Long, deviceobject: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlPrepareMdlWriteDev(fileobject, fileoffset, length.toInt(), lockkey.toInt(), mdlchain, iostatus, deviceobject)

public actual fun FsRtlPrepareMdlWriteEx(fileobject: Long, fileoffset: Long, length: UInt, lockkey: UInt, mdlchain: Long, iostatus: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlPrepareMdlWriteEx(fileobject, fileoffset, length.toInt(), lockkey.toInt(), mdlchain, iostatus)

public actual fun FsRtlPrepareToReuseEcp(ecpcontext: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlPrepareToReuseEcp(ecpcontext)
}

public actual fun FsRtlPrivateLock(filelock: Long, fileobject: Long, fileoffset: Long, length: Long, processid: PEPROCESS, key: UInt, failimmediately: Boolean, exclusivelock: Boolean, iosb: Long, irp: Long, context: Long, alreadysynchronized: Boolean): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlPrivateLock(filelock, fileobject, fileoffset, length, processid, key.toInt(), failimmediately, exclusivelock, iosb, irp, context, alreadysynchronized)

public actual fun FsRtlProcessFileLock(filelock: Long, irp: Long, context: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlProcessFileLock(filelock, irp, context)

public actual fun FsRtlQueryCachedVdl(fileobject: Long, vdl: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlQueryCachedVdl(fileobject, vdl)

public actual fun FsRtlQueryInformationFile(fileobject: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, retfileinformationsize: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlQueryInformationFile(fileobject, fileinformation, length.toInt(), fileinformationclass, retfileinformationsize)

public actual fun FsRtlQueryKernelEaFile(fileobject: Long, returnedeadata: Long, length: UInt, returnsingleentry: Boolean, ealist: Long, ealistlength: UInt, eaindex: Long, restartscan: Boolean, lengthreturned: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlQueryKernelEaFile(fileobject, returnedeadata, length.toInt(), returnsingleentry, ealist, ealistlength.toInt(), eaindex, restartscan, lengthreturned)

public actual fun FsRtlQueryMaximumVirtualDiskNestingLevel(): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlQueryMaximumVirtualDiskNestingLevel().toUInt()

public actual fun FsRtlRegisterFileSystemFilterCallbacks(filterdriverobject: Long, callbacks: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlRegisterFileSystemFilterCallbacks(filterdriverobject, callbacks)

public actual fun FsRtlRegisterUncProvider(muphandle: Long, redirectordevicename: Long, mailslotssupported: Boolean): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlRegisterUncProvider(muphandle, redirectordevicename, mailslotssupported)

public actual fun FsRtlRegisterUncProviderEx(muphandle: Long, redirdevname: Long, deviceobject: Long, flags: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlRegisterUncProviderEx(muphandle, redirdevname, deviceobject, flags.toInt())

public actual fun FsRtlRegisterUncProviderEx2(redirdevname: Long, deviceobject: Long, registration: Long, muphandle: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlRegisterUncProviderEx2(redirdevname, deviceobject, registration, muphandle)

public actual fun FsRtlReleaseFile(fileobject: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlReleaseFile(fileobject)
}

public actual fun FsRtlRemoveBaseMcbEntry(mcb: Long, vbn: Long, sectorcount: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlRemoveBaseMcbEntry(mcb, vbn, sectorcount)

public actual fun FsRtlRemoveDotsFromPath(originalstring: PWSTR, pathlength: UShort, newlength: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlRemoveDotsFromPath(originalstring, pathlength.toShort(), newlength)

public actual fun FsRtlRemoveExtraCreateParameter(ecplist: Long, ecptype: Long, ecpcontext: Long, ecpcontextsize: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlRemoveExtraCreateParameter(ecplist, ecptype, ecpcontext, ecpcontextsize)

public actual fun FsRtlRemoveLargeMcbEntry(mcb: Long, vbn: Long, sectorcount: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlRemoveLargeMcbEntry(mcb, vbn, sectorcount)
}

public actual fun FsRtlRemoveMcbEntry(mcb: Long, vbn: UInt, sectorcount: UInt) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlRemoveMcbEntry(mcb, vbn.toInt(), sectorcount.toInt())
}

public actual fun FsRtlRemovePerFileContext(perfilecontextpointer: Long, ownerid: Long, instanceid: Long): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlRemovePerFileContext(perfilecontextpointer, ownerid, instanceid)

public actual fun FsRtlRemovePerFileObjectContext(fileobject: Long, ownerid: Long, instanceid: Long): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlRemovePerFileObjectContext(fileobject, ownerid, instanceid)

public actual fun FsRtlRemovePerStreamContext(streamcontext: Long, ownerid: Long, instanceid: Long): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlRemovePerStreamContext(streamcontext, ownerid, instanceid)

public actual fun FsRtlResetBaseMcb(mcb: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlResetBaseMcb(mcb)
}

public actual fun FsRtlResetLargeMcb(mcb: Long, selfsynchronized: Boolean) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlResetLargeMcb(mcb, selfsynchronized)
}

public actual fun FsRtlSetDriverBacking(driverobj: Long, flags: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlSetDriverBacking(driverobj, flags.toInt())

public actual fun FsRtlSetEcpListIntoIrp(irp: Long, ecplist: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlSetEcpListIntoIrp(irp, ecplist)

public actual fun FsRtlSetKernelEaFile(fileobject: Long, eabuffer: Long, length: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlSetKernelEaFile(fileobject, eabuffer, length.toInt())

public actual fun FsRtlSplitBaseMcb(mcb: Long, vbn: Long, amount: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlSplitBaseMcb(mcb, vbn, amount)

public actual fun FsRtlSplitLargeMcb(mcb: Long, vbn: Long, amount: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlSplitLargeMcb(mcb, vbn, amount)

public actual fun FsRtlTeardownPerFileContexts(perfilecontextpointer: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlTeardownPerFileContexts(perfilecontextpointer)
}

public actual fun FsRtlTeardownPerStreamContexts(advancedheader: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlTeardownPerStreamContexts(advancedheader)
}

public actual fun FsRtlTruncateBaseMcb(mcb: Long, vbn: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlTruncateBaseMcb(mcb, vbn)
}

public actual fun FsRtlTruncateLargeMcb(mcb: Long, vbn: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlTruncateLargeMcb(mcb, vbn)
}

public actual fun FsRtlTruncateMcb(mcb: Long, vbn: UInt) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlTruncateMcb(mcb, vbn.toInt())
}

public actual fun FsRtlUninitializeBaseMcb(mcb: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlUninitializeBaseMcb(mcb)
}

public actual fun FsRtlUninitializeFileLock(filelock: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlUninitializeFileLock(filelock)
}

public actual fun FsRtlUninitializeLargeMcb(mcb: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlUninitializeLargeMcb(mcb)
}

public actual fun FsRtlUninitializeMcb(mcb: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlUninitializeMcb(mcb)
}

public actual fun FsRtlUninitializeOplock(oplock: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlUninitializeOplock(oplock)
}

public actual fun FsRtlUpdateDiskCounters(bytesread: ULong, byteswritten: ULong) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlUpdateDiskCounters(bytesread.toLong(), byteswritten.toLong())
}

public actual fun FsRtlUpperOplockFsctrl(oplock: Long, irp: Long, opencount: UInt, loweroplockstate: UInt, flags: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlUpperOplockFsctrl(oplock, irp, opencount.toInt(), loweroplockstate.toInt(), flags.toInt())

public actual fun FsRtlValidateReparsePointBuffer(bufferlength: UInt, reparsebuffer: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlValidateReparsePointBuffer(bufferlength.toInt(), reparsebuffer)

public actual fun FsRtlVolumeDeviceToCorrelationId(volumedeviceobject: Long, guid: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_FsRtlVolumeDeviceToCorrelationId(volumedeviceobject, guid)

public actual fun GetSecurityUserInfo(logonid: Long, flags: UInt, userinformation: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_GetSecurityUserInfo(logonid, flags.toInt(), userinformation)

public actual fun IoAcquireVpbSpinLock(irql: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoAcquireVpbSpinLock(irql)
}

public actual fun IoApplyPriorityInfoThread(inputpriorityinfo: Long, outputpriorityinfo: Long, thread: PETHREAD): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoApplyPriorityInfoThread(inputpriorityinfo, outputpriorityinfo, thread)

public actual fun IoCheckDesiredAccess(desiredaccess: Long, grantedaccess: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoCheckDesiredAccess(desiredaccess, grantedaccess.toInt())

public actual fun IoCheckEaBufferValidity(eabuffer: Long, ealength: UInt, erroroffset: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoCheckEaBufferValidity(eabuffer, ealength.toInt(), erroroffset)

public actual fun IoCheckFunctionAccess(grantedaccess: UInt, majorfunction: UByte, minorfunction: UByte, iocontrolcode: UInt, arg1: Long, arg2: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoCheckFunctionAccess(grantedaccess.toInt(), majorfunction.toByte(), minorfunction.toByte(), iocontrolcode.toInt(), arg1, arg2)

public actual fun IoCheckQuerySetFileInformation(fileinformationclass: FILE_INFORMATION_CLASS, length: UInt, setoperation: Boolean): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoCheckQuerySetFileInformation(fileinformationclass, length.toInt(), setoperation)

public actual fun IoCheckQuerySetVolumeInformation(fsinformationclass: FS_INFORMATION_CLASS, length: UInt, setoperation: Boolean): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoCheckQuerySetVolumeInformation(fsinformationclass, length.toInt(), setoperation)

public actual fun IoCheckQuotaBufferValidity(quotabuffer: Long, quotalength: UInt, erroroffset: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoCheckQuotaBufferValidity(quotabuffer, quotalength.toInt(), erroroffset)

public actual fun IoClearFsTrackOffsetState(irp: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoClearFsTrackOffsetState(irp)

public actual fun IoCreateStreamFileObject(fileobject: Long, deviceobject: Long): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoCreateStreamFileObject(fileobject, deviceobject)

public actual fun IoCreateStreamFileObjectEx(fileobject: Long, deviceobject: Long, filehandle: Long): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoCreateStreamFileObjectEx(fileobject, deviceobject, filehandle)

public actual fun IoCreateStreamFileObjectEx2(createoptions: Long, fileobject: Long, deviceobject: Long, streamfileobject: Long, filehandle: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoCreateStreamFileObjectEx2(createoptions, fileobject, deviceobject, streamfileobject, filehandle)

public actual fun IoCreateStreamFileObjectLite(fileobject: Long, deviceobject: Long): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoCreateStreamFileObjectLite(fileobject, deviceobject)

public actual fun IoEnumerateDeviceObjectList(driverobject: Long, deviceobjectlist: Long, deviceobjectlistsize: UInt, actualnumberdeviceobjects: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoEnumerateDeviceObjectList(driverobject, deviceobjectlist, deviceobjectlistsize.toInt(), actualnumberdeviceobjects)

public actual fun IoEnumerateRegisteredFiltersList(driverobjectlist: Long, driverobjectlistsize: UInt, actualnumberdriverobjects: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoEnumerateRegisteredFiltersList(driverobjectlist, driverobjectlistsize.toInt(), actualnumberdriverobjects)

public actual fun IoFastQueryNetworkAttributes(objectattributes: Long, desiredaccess: UInt, openoptions: UInt, iostatus: Long, buffer: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoFastQueryNetworkAttributes(objectattributes, desiredaccess.toInt(), openoptions.toInt(), iostatus, buffer)

public actual fun IoGetAttachedDevice(deviceobject: Long): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoGetAttachedDevice(deviceobject)

public actual fun IoGetBaseFileSystemDeviceObject(fileobject: Long): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoGetBaseFileSystemDeviceObject(fileobject)

public actual fun IoGetDeviceAttachmentBaseRef(deviceobject: Long): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoGetDeviceAttachmentBaseRef(deviceobject)

public actual fun IoGetDeviceToVerify(thread: PETHREAD): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoGetDeviceToVerify(thread)

public actual fun IoGetDiskDeviceObject(filesystemdeviceobject: Long, diskdeviceobject: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoGetDiskDeviceObject(filesystemdeviceobject, diskdeviceobject)

public actual fun IoGetFsTrackOffsetState(irp: Long, retfstrackoffsetblob: Long, rettrackedoffset: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoGetFsTrackOffsetState(irp, retfstrackoffsetblob, rettrackedoffset)

public actual fun IoGetLowerDeviceObject(deviceobject: Long): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoGetLowerDeviceObject(deviceobject)

public actual fun IoGetOplockKeyContext(fileobject: Long): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoGetOplockKeyContext(fileobject)

public actual fun IoGetOplockKeyContextEx(fileobject: Long): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoGetOplockKeyContextEx(fileobject)

public actual fun IoGetRequestorProcess(irp: Long): PEPROCESS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoGetRequestorProcess(irp)

public actual fun IoGetRequestorProcessId(irp: Long): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoGetRequestorProcessId(irp).toUInt()

public actual fun IoGetRequestorSessionId(irp: Long, psessionid: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoGetRequestorSessionId(irp, psessionid)

public actual fun IoIrpHasFsTrackOffsetExtensionType(irp: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoIrpHasFsTrackOffsetExtensionType(irp)

public actual fun IoIsOperationSynchronous(irp: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoIsOperationSynchronous(irp)

public actual fun IoIsSystemThread(thread: PETHREAD): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoIsSystemThread(thread)

public actual fun IoIsValidNameGraftingBuffer(irp: Long, reparsebuffer: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoIsValidNameGraftingBuffer(irp, reparsebuffer)

public actual fun IoPageRead(fileobject: Long, memorydescriptorlist: Long, startingoffset: Long, event: Long, iostatusblock: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoPageRead(fileobject, memorydescriptorlist, startingoffset, event, iostatusblock)

public actual fun IoQueryFileDosDeviceName(fileobject: Long, objectnameinformation: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoQueryFileDosDeviceName(fileobject, objectnameinformation)

public actual fun IoQueryFileInformation(fileobject: Long, fileinformationclass: FILE_INFORMATION_CLASS, length: UInt, fileinformation: Long, returnedlength: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoQueryFileInformation(fileobject, fileinformationclass, length.toInt(), fileinformation, returnedlength)

public actual fun IoQueryVolumeInformation(fileobject: Long, fsinformationclass: FS_INFORMATION_CLASS, length: UInt, fsinformation: Long, returnedlength: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoQueryVolumeInformation(fileobject, fsinformationclass, length.toInt(), fsinformation, returnedlength)

public actual fun IoQueueThreadIrp(irp: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoQueueThreadIrp(irp)
}

public actual fun IoRegisterFileSystem(deviceobject: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoRegisterFileSystem(deviceobject)
}

public actual fun IoRegisterFsRegistrationChange(driverobject: Long, drivernotificationroutine: DRIVER_FS_NOTIFICATION): NTSTATUS =
    0

public actual fun IoRegisterFsRegistrationChangeMountAware(driverobject: Long, drivernotificationroutine: DRIVER_FS_NOTIFICATION, synchronizewithmounts: Boolean): NTSTATUS =
    0

public actual fun IoReleaseVpbSpinLock(irql: UByte) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoReleaseVpbSpinLock(irql.toByte())
}

public actual fun IoReplaceFileObjectName(fileobject: Long, newfilename: PCWSTR, filenamelength: UShort): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoReplaceFileObjectName(fileobject, newfilename, filenamelength.toShort())

public actual fun IoRequestDeviceRemovalForReset(physicaldeviceobject: Long, flags: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoRequestDeviceRemovalForReset(physicaldeviceobject, flags.toInt())

public actual fun IoRetrievePriorityInfo(irp: Long, fileobject: Long, thread: PETHREAD, priorityinfo: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoRetrievePriorityInfo(irp, fileobject, thread, priorityinfo)

public actual fun IoSetDeviceToVerify(thread: PETHREAD, deviceobject: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoSetDeviceToVerify(thread, deviceobject)
}

public actual fun IoSetFsTrackOffsetState(irp: Long, fstrackoffsetblob: Long, trackedoffset: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoSetFsTrackOffsetState(irp, fstrackoffsetblob, trackedoffset)

public actual fun IoSetInformation(fileobject: Long, fileinformationclass: FILE_INFORMATION_CLASS, length: UInt, fileinformation: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoSetInformation(fileobject, fileinformationclass, length.toInt(), fileinformation)

public actual fun IoSynchronousPageWrite(fileobject: Long, memorydescriptorlist: Long, startingoffset: Long, event: Long, iostatusblock: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoSynchronousPageWrite(fileobject, memorydescriptorlist, startingoffset, event, iostatusblock)

public actual fun IoThreadToProcess(thread: PETHREAD): PEPROCESS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoThreadToProcess(thread)

public actual fun IoUnregisterFileSystem(deviceobject: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoUnregisterFileSystem(deviceobject)
}

public actual fun IoUnregisterFsRegistrationChange(driverobject: Long, drivernotificationroutine: DRIVER_FS_NOTIFICATION) {
}

public actual fun IoVerifyVolume(deviceobject: Long, allowrawmount: Boolean): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_IoVerifyVolume(deviceobject, allowrawmount)

public actual fun KeAcquireQueuedSpinLock(number: KSPIN_LOCK_QUEUE_NUMBER): UByte =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_KeAcquireQueuedSpinLock(number).toUByte()

public actual fun KeAcquireSpinLockRaiseToSynch(spinlock: Long): UByte =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_KeAcquireSpinLockRaiseToSynch(spinlock).toUByte()

public actual fun KeAttachProcess(process: PRKPROCESS) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_KeAttachProcess(process)
}

public actual fun KeDetachProcess() {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_KeDetachProcess()
}

public actual fun KeInitializeMutant(mutant: Long, initialowner: Boolean) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_KeInitializeMutant(mutant, initialowner)
}

public actual fun KeInitializeQueue(queue: Long, count: UInt) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_KeInitializeQueue(queue, count.toInt())
}

public actual fun KeInsertHeadQueue(queue: Long, entry: Long): Int =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_KeInsertHeadQueue(queue, entry)

public actual fun KeInsertQueue(queue: Long, entry: Long): Int =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_KeInsertQueue(queue, entry)

public actual fun KeReadStateMutant(mutant: Long): Int =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_KeReadStateMutant(mutant)

public actual fun KeReadStateQueue(queue: Long): Int =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_KeReadStateQueue(queue)

public actual fun KeReleaseMutant(mutant: Long, increment: Int, abandoned: Boolean, wait: Boolean): Int =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_KeReleaseMutant(mutant, increment, abandoned, wait)

public actual fun KeReleaseQueuedSpinLock(number: KSPIN_LOCK_QUEUE_NUMBER, oldirql: UByte) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_KeReleaseQueuedSpinLock(number, oldirql.toByte())
}

public actual fun KeRemoveQueue(queue: Long, waitmode: Byte, timeout: Long): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_KeRemoveQueue(queue, waitmode, timeout)

public actual fun KeRemoveQueueEx(queue: Long, waitmode: Byte, alertable: Boolean, timeout: Long, entryarray: Long, count: UInt): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_KeRemoveQueueEx(queue, waitmode, alertable, timeout, entryarray, count.toInt()).toUInt()

public actual fun KeRundownQueue(queue: Long): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_KeRundownQueue(queue)

public actual fun KeSetIdealProcessorThread(thread: PKTHREAD, processor: UByte): UByte =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_KeSetIdealProcessorThread(thread, processor.toByte()).toUByte()

public actual fun KeSetKernelStackSwapEnable(enable: Boolean): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_KeSetKernelStackSwapEnable(enable)

public actual fun KeStackAttachProcess(process: PRKPROCESS, apcstate: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_KeStackAttachProcess(process, apcstate)
}

public actual fun KeTryToAcquireQueuedSpinLock(number: KSPIN_LOCK_QUEUE_NUMBER, oldirql: Long): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_KeTryToAcquireQueuedSpinLock(number, oldirql).toUInt()

public actual fun KeUnstackDetachProcess(apcstate: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_KeUnstackDetachProcess(apcstate)
}

public actual fun MakeSignature(phcontext: Long, fqop: UInt, pmessage: Long, messageseqno: UInt): HRESULT =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_MakeSignature(phcontext, fqop.toInt(), pmessage, messageseqno.toInt())

public actual fun MapSecurityError(secstatus: HRESULT): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_MapSecurityError(secstatus)

public actual fun MmCanFileBeTruncated(sectionpointer: Long, newfilesize: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_MmCanFileBeTruncated(sectionpointer, newfilesize)

public actual fun MmDoesFileHaveUserWritableReferences(sectionpointer: Long): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_MmDoesFileHaveUserWritableReferences(sectionpointer).toUInt()

public actual fun MmFlushImageSection(sectionobjectpointer: Long, flushtype: MMFLUSH_TYPE): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_MmFlushImageSection(sectionobjectpointer, flushtype)

public actual fun MmForceSectionClosed(sectionobjectpointer: Long, delayclose: Boolean): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_MmForceSectionClosed(sectionobjectpointer, delayclose)

public actual fun MmForceSectionClosedEx(sectionobjectpointer: Long, forcecloseflags: UInt): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_MmForceSectionClosedEx(sectionobjectpointer, forcecloseflags.toInt())

public actual fun MmGetMaximumFileSectionSize(): ULong =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_MmGetMaximumFileSectionSize().toULong()

public actual fun MmIsFileSectionActive(fssectionpointer: Long, flags: UInt, sectionisactive: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_MmIsFileSectionActive(fssectionpointer, flags.toInt(), sectionisactive)

public actual fun MmIsRecursiveIoFault(): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_MmIsRecursiveIoFault()

public actual fun MmMdlPagesAreZero(mdl: Long): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_MmMdlPagesAreZero(mdl).toUInt()

public actual fun MmPrefetchPages(numberoflists: UInt, readlists: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_MmPrefetchPages(numberoflists.toInt(), readlists)

public actual fun MmSetAddressRangeModified(address: Long, length: ULong): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_MmSetAddressRangeModified(address, length.toLong())

public actual fun NtAccessCheckAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, desiredaccess: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtAccessCheckAndAuditAlarm(subsystemname, handleid, objecttypename, objectname, securitydescriptor, desiredaccess.toInt(), genericmapping, objectcreation, grantedaccess, accessstatus, generateonclose)

public actual fun NtAccessCheckByTypeAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtAccessCheckByTypeAndAuditAlarm(subsystemname, handleid, objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist, objecttypelistlength.toInt(), genericmapping, objectcreation, grantedaccess, accessstatus, generateonclose)

public actual fun NtAccessCheckByTypeResultListAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtAccessCheckByTypeResultListAndAuditAlarm(subsystemname, handleid, objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist, objecttypelistlength.toInt(), genericmapping, objectcreation, grantedaccess, accessstatus, generateonclose)

public actual fun NtAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname: Long, handleid: Long, clienttoken: HANDLE, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname, handleid, clienttoken, objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist, objecttypelistlength.toInt(), genericmapping, objectcreation, grantedaccess, accessstatus, generateonclose)

public actual fun NtAdjustGroupsToken(tokenhandle: HANDLE, resettodefault: Boolean, newstate: Long, bufferlength: UInt, previousstate: Long, returnlength: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtAdjustGroupsToken(tokenhandle, resettodefault, newstate, bufferlength.toInt(), previousstate, returnlength)

public actual fun NtAdjustPrivilegesToken(tokenhandle: HANDLE, disableallprivileges: Boolean, newstate: Long, bufferlength: UInt, previousstate: Long, returnlength: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtAdjustPrivilegesToken(tokenhandle, disableallprivileges, newstate, bufferlength.toInt(), previousstate, returnlength)

public actual fun NtAllocateVirtualMemory(processhandle: HANDLE, baseaddress: Long, zerobits: ULong, regionsize: Long, allocationtype: UInt, protect: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtAllocateVirtualMemory(processhandle, baseaddress, zerobits.toLong(), regionsize, allocationtype.toInt(), protect.toInt())

public actual fun NtAllocateVirtualMemoryEx(processhandle: HANDLE, baseaddress: Long, regionsize: Long, allocationtype: UInt, pageprotection: UInt, extendedparameters: Long, extendedparametercount: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtAllocateVirtualMemoryEx(processhandle, baseaddress, regionsize, allocationtype.toInt(), pageprotection.toInt(), extendedparameters, extendedparametercount.toInt())

public actual fun NtCancelIoFileEx(filehandle: HANDLE, iorequesttocancel: Long, iostatusblock: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtCancelIoFileEx(filehandle, iorequesttocancel, iostatusblock)

public actual fun NtCloseObjectAuditAlarm(subsystemname: Long, handleid: Long, generateonclose: Boolean): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtCloseObjectAuditAlarm(subsystemname, handleid, generateonclose)

public actual fun NtCreateDirectoryObject(directoryhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtCreateDirectoryObject(directoryhandle, desiredaccess.toInt(), objectattributes)

public actual fun NtCreateEvent(eventhandle: Long, desiredaccess: UInt, objectattributes: Long, eventtype: EVENT_TYPE, initialstate: Boolean): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtCreateEvent(eventhandle, desiredaccess.toInt(), objectattributes, eventtype, initialstate)

public actual fun NtCreateFile(filehandle: Long, desiredaccess: FILE_ACCESS_RIGHTS, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: FILE_FLAGS_AND_ATTRIBUTES, shareaccess: FILE_SHARE_MODE, createdisposition: NTCREATEFILE_CREATE_DISPOSITION, createoptions: NTCREATEFILE_CREATE_OPTIONS, eabuffer: Long, ealength: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtCreateFile(filehandle, desiredaccess.toInt(), objectattributes, iostatusblock, allocationsize, fileattributes.toInt(), shareaccess.toInt(), createdisposition.toInt(), createoptions.toInt(), eabuffer, ealength.toInt())

public actual fun NtCreateSection(sectionhandle: Long, desiredaccess: UInt, objectattributes: Long, maximumsize: Long, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: HANDLE): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtCreateSection(sectionhandle, desiredaccess.toInt(), objectattributes, maximumsize, sectionpageprotection.toInt(), allocationattributes.toInt(), filehandle)

public actual fun NtCreateSectionEx(sectionhandle: Long, desiredaccess: UInt, objectattributes: Long, maximumsize: Long, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: HANDLE, extendedparameters: Long, extendedparametercount: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtCreateSectionEx(sectionhandle, desiredaccess.toInt(), objectattributes, maximumsize, sectionpageprotection.toInt(), allocationattributes.toInt(), filehandle, extendedparameters, extendedparametercount.toInt())

public actual fun NtDeleteFile(objectattributes: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtDeleteFile(objectattributes)

public actual fun NtDeleteObjectAuditAlarm(subsystemname: Long, handleid: Long, generateonclose: Boolean): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtDeleteObjectAuditAlarm(subsystemname, handleid, generateonclose)

public actual fun NtDuplicateObject(sourceprocesshandle: HANDLE, sourcehandle: HANDLE, targetprocesshandle: HANDLE, targethandle: Long, desiredaccess: UInt, handleattributes: UInt, options: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtDuplicateObject(sourceprocesshandle, sourcehandle, targetprocesshandle, targethandle, desiredaccess.toInt(), handleattributes.toInt(), options.toInt())

public actual fun NtDuplicateToken(existingtokenhandle: HANDLE, desiredaccess: UInt, objectattributes: Long, effectiveonly: Boolean, tokentype: TOKEN_TYPE, newtokenhandle: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtDuplicateToken(existingtokenhandle, desiredaccess.toInt(), objectattributes, effectiveonly, tokentype, newtokenhandle)

public actual fun NtFilterToken(existingtokenhandle: HANDLE, flags: UInt, sidstodisable: Long, privilegestodelete: Long, restrictedsids: Long, newtokenhandle: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtFilterToken(existingtokenhandle, flags.toInt(), sidstodisable, privilegestodelete, restrictedsids, newtokenhandle)

public actual fun NtFlushBuffersFile(filehandle: HANDLE, iostatusblock: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtFlushBuffersFile(filehandle, iostatusblock)

public actual fun NtFlushBuffersFileEx(filehandle: HANDLE, flags: UInt, parameters: Long, parameterssize: UInt, iostatusblock: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtFlushBuffersFileEx(filehandle, flags.toInt(), parameters, parameterssize.toInt(), iostatusblock)

public actual fun NtFlushVirtualMemory(processhandle: HANDLE, baseaddress: Long, regionsize: Long, iostatus: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtFlushVirtualMemory(processhandle, baseaddress, regionsize, iostatus)

public actual fun NtFreeVirtualMemory(processhandle: HANDLE, baseaddress: Long, regionsize: Long, freetype: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtFreeVirtualMemory(processhandle, baseaddress, regionsize, freetype.toInt())

public actual fun NtFsControlFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, fscontrolcode: UInt, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt): NTSTATUS =
    0

public actual fun NtImpersonateAnonymousToken(threadhandle: HANDLE): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtImpersonateAnonymousToken(threadhandle)

public actual fun NtLockFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, byteoffset: Long, length: Long, key: UInt, failimmediately: Boolean, exclusivelock: Boolean): NTSTATUS =
    0

public actual fun NtNotifyChangeKey(keyhandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, completionfilter: UInt, watchtree: Boolean, buffer: Long, buffersize: UInt, asynchronous: Boolean): NTSTATUS =
    0

public actual fun NtOpenDirectoryObject(directoryhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtOpenDirectoryObject(directoryhandle, desiredaccess.toInt(), objectattributes)

public actual fun NtOpenFile(filehandle: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, shareaccess: UInt, openoptions: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtOpenFile(filehandle, desiredaccess.toInt(), objectattributes, iostatusblock, shareaccess.toInt(), openoptions.toInt())

public actual fun NtOpenObjectAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, clienttoken: HANDLE, desiredaccess: UInt, grantedaccess: UInt, privileges: Long, objectcreation: Boolean, accessgranted: Boolean, generateonclose: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtOpenObjectAuditAlarm(subsystemname, handleid, objecttypename, objectname, securitydescriptor, clienttoken, desiredaccess.toInt(), grantedaccess.toInt(), privileges, objectcreation, accessgranted, generateonclose)

public actual fun NtOpenProcessToken(processhandle: HANDLE, desiredaccess: UInt, tokenhandle: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtOpenProcessToken(processhandle, desiredaccess.toInt(), tokenhandle)

public actual fun NtOpenProcessTokenEx(processhandle: HANDLE, desiredaccess: UInt, handleattributes: UInt, tokenhandle: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtOpenProcessTokenEx(processhandle, desiredaccess.toInt(), handleattributes.toInt(), tokenhandle)

public actual fun NtOpenSymbolicLinkObject(linkhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtOpenSymbolicLinkObject(linkhandle, desiredaccess.toInt(), objectattributes)

public actual fun NtOpenThreadToken(threadhandle: HANDLE, desiredaccess: UInt, openasself: Boolean, tokenhandle: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtOpenThreadToken(threadhandle, desiredaccess.toInt(), openasself, tokenhandle)

public actual fun NtOpenThreadTokenEx(threadhandle: HANDLE, desiredaccess: UInt, openasself: Boolean, handleattributes: UInt, tokenhandle: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtOpenThreadTokenEx(threadhandle, desiredaccess.toInt(), openasself, handleattributes.toInt(), tokenhandle)

public actual fun NtPrivilegeCheck(clienttoken: HANDLE, requiredprivileges: Long, result: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtPrivilegeCheck(clienttoken, requiredprivileges, result)

public actual fun NtPrivilegeObjectAuditAlarm(subsystemname: Long, handleid: Long, clienttoken: HANDLE, desiredaccess: UInt, privileges: Long, accessgranted: Boolean): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtPrivilegeObjectAuditAlarm(subsystemname, handleid, clienttoken, desiredaccess.toInt(), privileges, accessgranted)

public actual fun NtPrivilegedServiceAuditAlarm(subsystemname: Long, servicename: Long, clienttoken: HANDLE, privileges: Long, accessgranted: Boolean): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtPrivilegedServiceAuditAlarm(subsystemname, servicename, clienttoken, privileges, accessgranted)

public actual fun NtQueryDirectoryFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, returnsingleentry: Boolean, filename: Long, restartscan: Boolean): NTSTATUS =
    0

public actual fun NtQueryDirectoryFileEx(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, queryflags: UInt, filename: Long): NTSTATUS =
    0

public actual fun NtQueryDirectoryObject(directoryhandle: HANDLE, buffer: Long, length: UInt, returnsingleentry: Boolean, restartscan: Boolean, context: Long, returnlength: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtQueryDirectoryObject(directoryhandle, buffer, length.toInt(), returnsingleentry, restartscan, context, returnlength)

public actual fun NtQueryEaFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt, returnsingleentry: Boolean, ealist: Long, ealistlength: UInt, eaindex: Long, restartscan: Boolean): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtQueryEaFile(filehandle, iostatusblock, buffer, length.toInt(), returnsingleentry, ealist, ealistlength.toInt(), eaindex, restartscan)

public actual fun NtQueryFullAttributesFile(objectattributes: Long, fileinformation: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtQueryFullAttributesFile(objectattributes, fileinformation)

public actual fun NtQueryInformationByName(objectattributes: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtQueryInformationByName(objectattributes, iostatusblock, fileinformation, length.toInt(), fileinformationclass)

public actual fun NtQueryInformationFile(filehandle: HANDLE, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtQueryInformationFile(filehandle, iostatusblock, fileinformation, length.toInt(), fileinformationclass)

public actual fun NtQueryInformationToken(tokenhandle: HANDLE, tokeninformationclass: TOKEN_INFORMATION_CLASS, tokeninformation: Long, tokeninformationlength: UInt, returnlength: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtQueryInformationToken(tokenhandle, tokeninformationclass, tokeninformation, tokeninformationlength.toInt(), returnlength)

public actual fun NtQueryQuotaInformationFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt, returnsingleentry: Boolean, sidlist: Long, sidlistlength: UInt, startsid: PSID, restartscan: Boolean): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtQueryQuotaInformationFile(filehandle, iostatusblock, buffer, length.toInt(), returnsingleentry, sidlist, sidlistlength.toInt(), startsid, restartscan)

public actual fun NtQuerySecurityObject(handle: HANDLE, securityinformation: UInt, securitydescriptor: PSECURITY_DESCRIPTOR, length: UInt, lengthneeded: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtQuerySecurityObject(handle, securityinformation.toInt(), securitydescriptor, length.toInt(), lengthneeded)

public actual fun NtQuerySymbolicLinkObject(linkhandle: HANDLE, linktarget: Long, returnedlength: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtQuerySymbolicLinkObject(linkhandle, linktarget, returnedlength)

public actual fun NtQueryVirtualMemory(processhandle: HANDLE, baseaddress: Long, memoryinformationclass: MEMORY_INFORMATION_CLASS, memoryinformation: Long, memoryinformationlength: ULong, returnlength: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtQueryVirtualMemory(processhandle, baseaddress, memoryinformationclass, memoryinformation, memoryinformationlength.toLong(), returnlength)

public actual fun NtQueryVolumeInformationFile(filehandle: HANDLE, iostatusblock: Long, fsinformation: Long, length: UInt, fsinformationclass: FS_INFORMATION_CLASS): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtQueryVolumeInformationFile(filehandle, iostatusblock, fsinformation, length.toInt(), fsinformationclass)

public actual fun NtReadFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, buffer: Long, length: UInt, byteoffset: Long, key: Long): NTSTATUS =
    0

public actual fun NtSetEaFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtSetEaFile(filehandle, iostatusblock, buffer, length.toInt())

public actual fun NtSetEvent(eventhandle: HANDLE, previousstate: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtSetEvent(eventhandle, previousstate)

public actual fun NtSetInformationFile(filehandle: HANDLE, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtSetInformationFile(filehandle, iostatusblock, fileinformation, length.toInt(), fileinformationclass)

public actual fun NtSetInformationToken(tokenhandle: HANDLE, tokeninformationclass: TOKEN_INFORMATION_CLASS, tokeninformation: Long, tokeninformationlength: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtSetInformationToken(tokenhandle, tokeninformationclass, tokeninformation, tokeninformationlength.toInt())

public actual fun NtSetInformationVirtualMemory(processhandle: HANDLE, vminformationclass: VIRTUAL_MEMORY_INFORMATION_CLASS, numberofentries: ULong, virtualaddresses: Long, vminformation: Long, vminformationlength: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtSetInformationVirtualMemory(processhandle, vminformationclass, numberofentries.toLong(), virtualaddresses, vminformation, vminformationlength.toInt())

public actual fun NtSetQuotaInformationFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtSetQuotaInformationFile(filehandle, iostatusblock, buffer, length.toInt())

public actual fun NtSetSecurityObject(handle: HANDLE, securityinformation: UInt, securitydescriptor: PSECURITY_DESCRIPTOR): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtSetSecurityObject(handle, securityinformation.toInt(), securitydescriptor)

public actual fun NtSetVolumeInformationFile(filehandle: HANDLE, iostatusblock: Long, fsinformation: Long, length: UInt, fsinformationclass: FS_INFORMATION_CLASS): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtSetVolumeInformationFile(filehandle, iostatusblock, fsinformation, length.toInt(), fsinformationclass)

public actual fun NtUnlockFile(filehandle: HANDLE, iostatusblock: Long, byteoffset: Long, length: Long, key: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_NtUnlockFile(filehandle, iostatusblock, byteoffset, length, key.toInt())

public actual fun NtWriteFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, buffer: Long, length: UInt, byteoffset: Long, key: Long): NTSTATUS =
    0

public actual fun ObInsertObject(obj: Long, passedaccessstate: Long, desiredaccess: UInt, objectpointerbias: UInt, newobject: Long, handle: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ObInsertObject(obj, passedaccessstate, desiredaccess.toInt(), objectpointerbias.toInt(), newobject, handle)

public actual fun ObIsKernelHandle(handle: HANDLE): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ObIsKernelHandle(handle)

public actual fun ObMakeTemporaryObject(obj: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ObMakeTemporaryObject(obj)
}

public actual fun ObOpenObjectByPointer(obj: Long, handleattributes: UInt, passedaccessstate: Long, desiredaccess: UInt, objecttype: POBJECT_TYPE, accessmode: Byte, handle: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ObOpenObjectByPointer(obj, handleattributes.toInt(), passedaccessstate, desiredaccess.toInt(), objecttype, accessmode, handle)

public actual fun ObOpenObjectByPointerWithTag(obj: Long, handleattributes: UInt, passedaccessstate: Long, desiredaccess: UInt, objecttype: POBJECT_TYPE, accessmode: Byte, tag: UInt, handle: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ObOpenObjectByPointerWithTag(obj, handleattributes.toInt(), passedaccessstate, desiredaccess.toInt(), objecttype, accessmode, tag.toInt(), handle)

public actual fun ObQueryNameString(obj: Long, objectnameinfo: Long, length: UInt, returnlength: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ObQueryNameString(obj, objectnameinfo, length.toInt(), returnlength)

public actual fun ObQueryObjectAuditingByHandle(handle: HANDLE, generateonclose: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ObQueryObjectAuditingByHandle(handle, generateonclose)

public actual fun PfxFindPrefix(prefixtable: Long, fullname: Long): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_PfxFindPrefix(prefixtable, fullname)

public actual fun PfxInitialize(prefixtable: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_PfxInitialize(prefixtable)
}

public actual fun PfxInsertPrefix(prefixtable: Long, prefix: Long, prefixtableentry: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_PfxInsertPrefix(prefixtable, prefix, prefixtableentry)

public actual fun PfxRemovePrefix(prefixtable: Long, prefixtableentry: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_PfxRemovePrefix(prefixtable, prefixtableentry)
}

public actual fun PoQueueShutdownWorkItem(workitem: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_PoQueueShutdownWorkItem(workitem)

public actual fun PsAssignImpersonationToken(thread: PETHREAD, token: HANDLE): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_PsAssignImpersonationToken(thread, token)

public actual fun PsChargePoolQuota(process: PEPROCESS, pooltype: POOL_TYPE, amount: ULong) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_PsChargePoolQuota(process, pooltype, amount.toLong())
}

public actual fun PsChargeProcessPoolQuota(process: PEPROCESS, pooltype: POOL_TYPE, amount: ULong): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_PsChargeProcessPoolQuota(process, pooltype, amount.toLong())

public actual fun PsDereferenceImpersonationToken(impersonationtoken: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_PsDereferenceImpersonationToken(impersonationtoken)
}

public actual fun PsDereferencePrimaryToken(primarytoken: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_PsDereferencePrimaryToken(primarytoken)
}

public actual fun PsDisableImpersonation(thread: PETHREAD, impersonationstate: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_PsDisableImpersonation(thread, impersonationstate)

public actual fun PsGetProcessExitTime(): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_PsGetProcessExitTime()

public actual fun PsGetThreadProcess(thread: PETHREAD): PEPROCESS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_PsGetThreadProcess(thread)

public actual fun PsImpersonateClient(thread: PETHREAD, token: Long, copyonopen: Boolean, effectiveonly: Boolean, impersonationlevel: SECURITY_IMPERSONATION_LEVEL): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_PsImpersonateClient(thread, token, copyonopen, effectiveonly, impersonationlevel)

public actual fun PsIsDiskCountersEnabled(): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_PsIsDiskCountersEnabled()

public actual fun PsIsSystemThread(thread: PETHREAD): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_PsIsSystemThread(thread)

public actual fun PsIsThreadTerminating(thread: PETHREAD): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_PsIsThreadTerminating(thread)

public actual fun PsLookupProcessByProcessId(processid: HANDLE, process: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_PsLookupProcessByProcessId(processid, process)

public actual fun PsLookupThreadByThreadId(threadid: HANDLE, thread: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_PsLookupThreadByThreadId(threadid, thread)

public actual fun PsReferenceImpersonationToken(thread: PETHREAD, copyonopen: Long, effectiveonly: Long, impersonationlevel: Long): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_PsReferenceImpersonationToken(thread, copyonopen, effectiveonly, impersonationlevel)

public actual fun PsReferencePrimaryToken(process: PEPROCESS): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_PsReferencePrimaryToken(process)

public actual fun PsRestoreImpersonation(thread: PETHREAD, impersonationstate: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_PsRestoreImpersonation(thread, impersonationstate)
}

public actual fun PsReturnPoolQuota(process: PEPROCESS, pooltype: POOL_TYPE, amount: ULong) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_PsReturnPoolQuota(process, pooltype, amount.toLong())
}

public actual fun PsRevertToSelf() {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_PsRevertToSelf()
}

public actual fun PsUpdateDiskCounters(process: PEPROCESS, bytesread: ULong, byteswritten: ULong, readoperationcount: UInt, writeoperationcount: UInt, flushoperationcount: UInt) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_PsUpdateDiskCounters(process, bytesread.toLong(), byteswritten.toLong(), readoperationcount.toInt(), writeoperationcount.toInt(), flushoperationcount.toInt())
}

public actual fun QuerySecurityContextToken(phcontext: Long, token: Long): HRESULT =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_QuerySecurityContextToken(phcontext, token)

public actual fun RtlAbsoluteToSelfRelativeSD(absolutesecuritydescriptor: PSECURITY_DESCRIPTOR, selfrelativesecuritydescriptor: PSECURITY_DESCRIPTOR, bufferlength: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlAbsoluteToSelfRelativeSD(absolutesecuritydescriptor, selfrelativesecuritydescriptor, bufferlength)

public actual fun RtlAddAccessAllowedAce(acl: Long, acerevision: UInt, accessmask: UInt, sid: PSID): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlAddAccessAllowedAce(acl, acerevision.toInt(), accessmask.toInt(), sid)

public actual fun RtlAddAccessAllowedAceEx(acl: Long, acerevision: UInt, aceflags: UInt, accessmask: UInt, sid: PSID): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlAddAccessAllowedAceEx(acl, acerevision.toInt(), aceflags.toInt(), accessmask.toInt(), sid)

public actual fun RtlAddAce(acl: Long, acerevision: UInt, startingaceindex: UInt, acelist: Long, acelistlength: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlAddAce(acl, acerevision.toInt(), startingaceindex.toInt(), acelist, acelistlength.toInt())

public actual fun RtlAllocateAndInitializeSid(identifierauthority: Long, subauthoritycount: UByte, subauthority0: UInt, subauthority1: UInt, subauthority2: UInt, subauthority3: UInt, subauthority4: UInt, subauthority5: UInt, subauthority6: UInt, subauthority7: UInt, sid: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlAllocateAndInitializeSid(identifierauthority, subauthoritycount.toByte(), subauthority0.toInt(), subauthority1.toInt(), subauthority2.toInt(), subauthority3.toInt(), subauthority4.toInt(), subauthority5.toInt(), subauthority6.toInt(), subauthority7.toInt(), sid)

public actual fun RtlAllocateAndInitializeSidEx(identifierauthority: Long, subauthoritycount: UByte, subauthorities: Long, sid: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlAllocateAndInitializeSidEx(identifierauthority, subauthoritycount.toByte(), subauthorities, sid)

public actual fun RtlAllocateHeap(heaphandle: Long, flags: UInt, size: ULong): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlAllocateHeap(heaphandle, flags.toInt(), size.toLong())

public actual fun RtlAppendStringToString(destination: Long, source: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlAppendStringToString(destination, source)

public actual fun RtlCompareAltitudes(altitude1: Long, altitude2: Long): Int =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlCompareAltitudes(altitude1, altitude2)

public actual fun RtlCompareMemoryUlong(source: Long, length: ULong, pattern: UInt): ULong =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlCompareMemoryUlong(source, length.toLong(), pattern.toInt()).toULong()

public actual fun RtlCompressBuffer(compressionformatandengine: UShort, uncompressedbuffer: Long, uncompressedbuffersize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, uncompressedchunksize: UInt, finalcompressedsize: Long, workspace: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlCompressBuffer(compressionformatandengine.toShort(), uncompressedbuffer, uncompressedbuffersize.toInt(), compressedbuffer, compressedbuffersize.toInt(), uncompressedchunksize.toInt(), finalcompressedsize, workspace)

public actual fun RtlCompressChunks(uncompressedbuffer: Long, uncompressedbuffersize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, compresseddatainfo: Long, compresseddatainfolength: UInt, workspace: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlCompressChunks(uncompressedbuffer, uncompressedbuffersize.toInt(), compressedbuffer, compressedbuffersize.toInt(), compresseddatainfo, compresseddatainfolength.toInt(), workspace)

public actual fun RtlCopyLuid(destinationluid: Long, sourceluid: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlCopyLuid(destinationluid, sourceluid)
}

public actual fun RtlCopySid(destinationsidlength: UInt, destinationsid: PSID, sourcesid: PSID): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlCopySid(destinationsidlength.toInt(), destinationsid, sourcesid)

public actual fun RtlCreateAcl(acl: Long, acllength: UInt, aclrevision: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlCreateAcl(acl, acllength.toInt(), aclrevision.toInt())

public actual fun RtlCreateHeap(flags: UInt, heapbase: Long, reservesize: ULong, commitsize: ULong, lock: Long, parameters: Long): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlCreateHeap(flags.toInt(), heapbase, reservesize.toLong(), commitsize.toLong(), lock, parameters)

public actual fun RtlCreateServiceSid(servicename: Long, servicesid: PSID, servicesidlength: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlCreateServiceSid(servicename, servicesid, servicesidlength)

public actual fun RtlCreateSystemVolumeInformationFolder(volumerootpath: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlCreateSystemVolumeInformationFolder(volumerootpath)

public actual fun RtlCreateUnicodeString(destinationstring: Long, sourcestring: PCWSTR): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlCreateUnicodeString(destinationstring, sourcestring)

public actual fun RtlCreateVirtualAccountSid(name: Long, basesubauthority: UInt, sid: PSID, sidlength: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlCreateVirtualAccountSid(name, basesubauthority.toInt(), sid, sidlength)

public actual fun RtlCustomCPToUnicodeN(customcp: Long, unicodestring: PWSTR, maxbytesinunicodestring: UInt, bytesinunicodestring: Long, customcpstring: PCSTR, bytesincustomcpstring: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlCustomCPToUnicodeN(customcp, unicodestring, maxbytesinunicodestring.toInt(), bytesinunicodestring, customcpstring, bytesincustomcpstring.toInt())

public actual fun RtlDecompressBuffer(compressionformat: UShort, uncompressedbuffer: Long, uncompressedbuffersize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, finaluncompressedsize: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlDecompressBuffer(compressionformat.toShort(), uncompressedbuffer, uncompressedbuffersize.toInt(), compressedbuffer, compressedbuffersize.toInt(), finaluncompressedsize)

public actual fun RtlDecompressBufferEx(compressionformat: UShort, uncompressedbuffer: Long, uncompressedbuffersize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, finaluncompressedsize: Long, workspace: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlDecompressBufferEx(compressionformat.toShort(), uncompressedbuffer, uncompressedbuffersize.toInt(), compressedbuffer, compressedbuffersize.toInt(), finaluncompressedsize, workspace)

public actual fun RtlDecompressBufferEx2(compressionformat: UShort, uncompressedbuffer: Long, uncompressedbuffersize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, uncompressedchunksize: UInt, finaluncompressedsize: Long, workspace: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlDecompressBufferEx2(compressionformat.toShort(), uncompressedbuffer, uncompressedbuffersize.toInt(), compressedbuffer, compressedbuffersize.toInt(), uncompressedchunksize.toInt(), finaluncompressedsize, workspace)

public actual fun RtlDecompressChunks(uncompressedbuffer: Long, uncompressedbuffersize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, compressedtail: Long, compressedtailsize: UInt, compresseddatainfo: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlDecompressChunks(uncompressedbuffer, uncompressedbuffersize.toInt(), compressedbuffer, compressedbuffersize.toInt(), compressedtail, compressedtailsize.toInt(), compresseddatainfo)

public actual fun RtlDecompressFragment(compressionformat: UShort, uncompressedfragment: Long, uncompressedfragmentsize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, fragmentoffset: UInt, finaluncompressedsize: Long, workspace: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlDecompressFragment(compressionformat.toShort(), uncompressedfragment, uncompressedfragmentsize.toInt(), compressedbuffer, compressedbuffersize.toInt(), fragmentoffset.toInt(), finaluncompressedsize, workspace)

public actual fun RtlDecompressFragmentEx(compressionformat: UShort, uncompressedfragment: Long, uncompressedfragmentsize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, fragmentoffset: UInt, uncompressedchunksize: UInt, finaluncompressedsize: Long, workspace: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlDecompressFragmentEx(compressionformat.toShort(), uncompressedfragment, uncompressedfragmentsize.toInt(), compressedbuffer, compressedbuffersize.toInt(), fragmentoffset.toInt(), uncompressedchunksize.toInt(), finaluncompressedsize, workspace)

public actual fun RtlDeleteAce(acl: Long, aceindex: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlDeleteAce(acl, aceindex.toInt())

public actual fun RtlDescribeChunk(compressionformat: UShort, compressedbuffer: Long, endofcompressedbufferplus1: Long, chunkbuffer: Long, chunksize: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlDescribeChunk(compressionformat.toShort(), compressedbuffer, endofcompressedbufferplus1, chunkbuffer, chunksize)

public actual fun RtlDestroyHeap(heaphandle: Long): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlDestroyHeap(heaphandle)

public actual fun RtlDosPathNameToNtPathName_U_WithStatus(dosfilename: PCWSTR, ntfilename: Long, filepart: Long, reserved: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlDosPathNameToNtPathName_U_WithStatus(dosfilename, ntfilename, filepart, reserved)

public actual fun RtlDowncaseUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlDowncaseUnicodeString(destinationstring, sourcestring, allocatedestinationstring)

public actual fun RtlDuplicateUnicodeString(flags: UInt, stringin: Long, stringout: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlDuplicateUnicodeString(flags.toInt(), stringin, stringout)

public actual fun RtlEqualPrefixSid(sid1: PSID, sid2: PSID): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlEqualPrefixSid(sid1, sid2)

public actual fun RtlEqualSid(sid1: PSID, sid2: PSID): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlEqualSid(sid1, sid2)

public actual fun RtlFindUnicodePrefix(prefixtable: Long, fullname: Long, caseinsensitiveindex: UInt): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlFindUnicodePrefix(prefixtable, fullname, caseinsensitiveindex.toInt())

public actual fun RtlFreeHeap(heaphandle: Long, flags: UInt, baseaddress: Long): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlFreeHeap(heaphandle, flags.toInt(), baseaddress).toUInt()

public actual fun RtlFreeSid(sid: PSID): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlFreeSid(sid)

public actual fun RtlGenerate8dot3Name(name: Long, allowextendedcharacters: Boolean, context: Long, name8dot3: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlGenerate8dot3Name(name, allowextendedcharacters, context, name8dot3)

public actual fun RtlGetAce(acl: Long, aceindex: UInt, ace: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlGetAce(acl, aceindex.toInt(), ace)

public actual fun RtlGetCompressionWorkSpaceSize(compressionformatandengine: UShort, compressbufferworkspacesize: Long, compressfragmentworkspacesize: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlGetCompressionWorkSpaceSize(compressionformatandengine.toShort(), compressbufferworkspacesize, compressfragmentworkspacesize)

public actual fun RtlGetDaclSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, daclpresent: Long, dacl: Long, dacldefaulted: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlGetDaclSecurityDescriptor(securitydescriptor, daclpresent, dacl, dacldefaulted)

public actual fun RtlGetGroupSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, group: Long, groupdefaulted: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlGetGroupSecurityDescriptor(securitydescriptor, group, groupdefaulted)

public actual fun RtlGetOwnerSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, owner: Long, ownerdefaulted: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlGetOwnerSecurityDescriptor(securitydescriptor, owner, ownerdefaulted)

public actual fun RtlGetSaclSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, saclpresent: Long, sacl: Long, sacldefaulted: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlGetSaclSecurityDescriptor(securitydescriptor, saclpresent, sacl, sacldefaulted)

public actual fun RtlIdentifierAuthoritySid(sid: PSID): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlIdentifierAuthoritySid(sid)

public actual fun RtlIdnToAscii(flags: UInt, sourcestring: PCWSTR, sourcestringlength: Int, destinationstring: PWSTR, destinationstringlength: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlIdnToAscii(flags.toInt(), sourcestring, sourcestringlength, destinationstring, destinationstringlength)

public actual fun RtlIdnToNameprepUnicode(flags: UInt, sourcestring: PCWSTR, sourcestringlength: Int, destinationstring: PWSTR, destinationstringlength: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlIdnToNameprepUnicode(flags.toInt(), sourcestring, sourcestringlength, destinationstring, destinationstringlength)

public actual fun RtlIdnToUnicode(flags: UInt, sourcestring: PCWSTR, sourcestringlength: Int, destinationstring: PWSTR, destinationstringlength: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlIdnToUnicode(flags.toInt(), sourcestring, sourcestringlength, destinationstring, destinationstringlength)

public actual fun RtlInitCodePageTable(tablebase: Long, codepagetable: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlInitCodePageTable(tablebase, codepagetable)
}

public actual fun RtlInitUnicodeStringEx(destinationstring: Long, sourcestring: PCWSTR): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlInitUnicodeStringEx(destinationstring, sourcestring)

public actual fun RtlInitializeSid(sid: PSID, identifierauthority: Long, subauthoritycount: UByte): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlInitializeSid(sid, identifierauthority, subauthoritycount.toByte())

public actual fun RtlInitializeSidEx(sid: PSID, identifierauthority: Long, subauthoritycount: UByte): NTSTATUS =
    0

public actual fun RtlInitializeUnicodePrefix(prefixtable: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlInitializeUnicodePrefix(prefixtable)
}

public actual fun RtlInsertUnicodePrefix(prefixtable: Long, prefix: Long, prefixtableentry: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlInsertUnicodePrefix(prefixtable, prefix, prefixtableentry)

public actual fun RtlIsCloudFilesPlaceholder(fileattributes: UInt, reparsetag: UInt): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlIsCloudFilesPlaceholder(fileattributes.toInt(), reparsetag.toInt())

public actual fun RtlIsDosDeviceName_U(dosfilename: PCWSTR): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlIsDosDeviceName_U(dosfilename).toUInt()

public actual fun RtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag: UInt): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag.toInt())

public actual fun RtlIsNormalizedString(normform: UInt, sourcestring: PCWSTR, sourcestringlength: Int, normalized: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlIsNormalizedString(normform.toInt(), sourcestring, sourcestringlength, normalized)

public actual fun RtlIsPartialPlaceholder(fileattributes: UInt, reparsetag: UInt): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlIsPartialPlaceholder(fileattributes.toInt(), reparsetag.toInt())

public actual fun RtlIsPartialPlaceholderFileHandle(filehandle: HANDLE, ispartialplaceholder: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlIsPartialPlaceholderFileHandle(filehandle, ispartialplaceholder)

public actual fun RtlIsPartialPlaceholderFileInfo(infobuffer: Long, infoclass: FILE_INFORMATION_CLASS, ispartialplaceholder: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlIsPartialPlaceholderFileInfo(infobuffer, infoclass, ispartialplaceholder)

public actual fun RtlIsSandboxedToken(context: Long, previousmode: Byte): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlIsSandboxedToken(context, previousmode)

public actual fun RtlIsValidOemCharacter(char: PWSTR): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlIsValidOemCharacter(char)

public actual fun RtlLengthRequiredSid(subauthoritycount: UInt): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlLengthRequiredSid(subauthoritycount.toInt()).toUInt()

public actual fun RtlLengthSid(sid: PSID): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlLengthSid(sid).toUInt()

public actual fun RtlMultiByteToUnicodeN(unicodestring: PWSTR, maxbytesinunicodestring: UInt, bytesinunicodestring: Long, multibytestring: PCSTR, bytesinmultibytestring: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlMultiByteToUnicodeN(unicodestring, maxbytesinunicodestring.toInt(), bytesinunicodestring, multibytestring, bytesinmultibytestring.toInt())

public actual fun RtlMultiByteToUnicodeSize(bytesinunicodestring: Long, multibytestring: PCSTR, bytesinmultibytestring: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlMultiByteToUnicodeSize(bytesinunicodestring, multibytestring, bytesinmultibytestring.toInt())

public actual fun RtlNextUnicodePrefix(prefixtable: Long, restart: Boolean): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlNextUnicodePrefix(prefixtable, restart)

public actual fun RtlNormalizeString(normform: UInt, sourcestring: PCWSTR, sourcestringlength: Int, destinationstring: PWSTR, destinationstringlength: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlNormalizeString(normform.toInt(), sourcestring, sourcestringlength, destinationstring, destinationstringlength)

public actual fun RtlNtStatusToDosErrorNoTeb(status: NTSTATUS): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlNtStatusToDosErrorNoTeb(status).toUInt()

public actual fun RtlOemStringToCountedUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlOemStringToCountedUnicodeString(destinationstring, sourcestring, allocatedestinationstring)

public actual fun RtlOemStringToUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlOemStringToUnicodeString(destinationstring, sourcestring, allocatedestinationstring)

public actual fun RtlOemToUnicodeN(unicodestring: PWSTR, maxbytesinunicodestring: UInt, bytesinunicodestring: Long, oemstring: PCSTR, bytesinoemstring: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlOemToUnicodeN(unicodestring, maxbytesinunicodestring.toInt(), bytesinunicodestring, oemstring, bytesinoemstring.toInt())

public actual fun RtlPrefixString(string1: Long, string2: Long, caseinsensitive: Boolean): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlPrefixString(string1, string2, caseinsensitive)

public actual fun RtlQueryPackageIdentity(tokenobject: Long, packagefullname: PWSTR, packagesize: Long, appid: PWSTR, appidsize: Long, packaged: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlQueryPackageIdentity(tokenobject, packagefullname, packagesize, appid, appidsize, packaged)

public actual fun RtlQueryPackageIdentityEx(tokenobject: Long, packagefullname: PWSTR, packagesize: Long, appid: PWSTR, appidsize: Long, dynamicid: Long, flags: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlQueryPackageIdentityEx(tokenobject, packagefullname, packagesize, appid, appidsize, dynamicid, flags)

public actual fun RtlQueryProcessPlaceholderCompatibilityMode(): Byte =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlQueryProcessPlaceholderCompatibilityMode()

public actual fun RtlQueryThreadPlaceholderCompatibilityMode(): Byte =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlQueryThreadPlaceholderCompatibilityMode()

public actual fun RtlRandom(seed: Long): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlRandom(seed).toUInt()

public actual fun RtlRandomEx(seed: Long): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlRandomEx(seed).toUInt()

public actual fun RtlRemoveUnicodePrefix(prefixtable: Long, prefixtableentry: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlRemoveUnicodePrefix(prefixtable, prefixtableentry)
}

public actual fun RtlReplaceSidInSd(securitydescriptor: PSECURITY_DESCRIPTOR, oldsid: PSID, newsid: PSID, numchanges: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlReplaceSidInSd(securitydescriptor, oldsid, newsid, numchanges)

public actual fun RtlReserveChunk(compressionformat: UShort, compressedbuffer: Long, endofcompressedbufferplus1: Long, chunkbuffer: Long, chunksize: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlReserveChunk(compressionformat.toShort(), compressedbuffer, endofcompressedbufferplus1, chunkbuffer, chunksize.toInt())

public actual fun RtlSecondsSince1970ToTime(elapsedseconds: UInt, time: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlSecondsSince1970ToTime(elapsedseconds.toInt(), time)
}

public actual fun RtlSecondsSince1980ToTime(elapsedseconds: UInt, time: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlSecondsSince1980ToTime(elapsedseconds.toInt(), time)
}

public actual fun RtlSelfRelativeToAbsoluteSD(selfrelativesecuritydescriptor: PSECURITY_DESCRIPTOR, absolutesecuritydescriptor: PSECURITY_DESCRIPTOR, absolutesecuritydescriptorsize: Long, dacl: Long, daclsize: Long, sacl: Long, saclsize: Long, owner: PSID, ownersize: Long, primarygroup: PSID, primarygroupsize: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlSelfRelativeToAbsoluteSD(selfrelativesecuritydescriptor, absolutesecuritydescriptor, absolutesecuritydescriptorsize, dacl, daclsize, sacl, saclsize, owner, ownersize, primarygroup, primarygroupsize)

public actual fun RtlSetGroupSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, group: PSID, groupdefaulted: Boolean): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlSetGroupSecurityDescriptor(securitydescriptor, group, groupdefaulted)

public actual fun RtlSetOwnerSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, owner: PSID, ownerdefaulted: Boolean): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlSetOwnerSecurityDescriptor(securitydescriptor, owner, ownerdefaulted)

public actual fun RtlSetProcessPlaceholderCompatibilityMode(mode: Byte): Byte =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlSetProcessPlaceholderCompatibilityMode(mode)

public actual fun RtlSetThreadPlaceholderCompatibilityMode(mode: Byte): Byte =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlSetThreadPlaceholderCompatibilityMode(mode)

public actual fun RtlSubAuthorityCountSid(sid: PSID): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlSubAuthorityCountSid(sid)

public actual fun RtlSubAuthoritySid(sid: PSID, subauthority: UInt): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlSubAuthoritySid(sid, subauthority.toInt())

public actual fun RtlTimeToSecondsSince1980(time: Long, elapsedseconds: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlTimeToSecondsSince1980(time, elapsedseconds)

public actual fun RtlUnicodeStringToCountedOemString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlUnicodeStringToCountedOemString(destinationstring, sourcestring, allocatedestinationstring)

public actual fun RtlUnicodeToCustomCPN(customcp: Long, customcpstring: PSTR, maxbytesincustomcpstring: UInt, bytesincustomcpstring: Long, unicodestring: PCWSTR, bytesinunicodestring: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlUnicodeToCustomCPN(customcp, customcpstring, maxbytesincustomcpstring.toInt(), bytesincustomcpstring, unicodestring, bytesinunicodestring.toInt())

public actual fun RtlUnicodeToMultiByteN(multibytestring: PSTR, maxbytesinmultibytestring: UInt, bytesinmultibytestring: Long, unicodestring: Long, bytesinunicodestring: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlUnicodeToMultiByteN(multibytestring, maxbytesinmultibytestring.toInt(), bytesinmultibytestring, unicodestring, bytesinunicodestring.toInt())

public actual fun RtlUnicodeToOemN(oemstring: PSTR, maxbytesinoemstring: UInt, bytesinoemstring: Long, unicodestring: Long, bytesinunicodestring: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlUnicodeToOemN(oemstring, maxbytesinoemstring.toInt(), bytesinoemstring, unicodestring, bytesinunicodestring.toInt())

public actual fun RtlUpcaseUnicodeStringToCountedOemString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlUpcaseUnicodeStringToCountedOemString(destinationstring, sourcestring, allocatedestinationstring)

public actual fun RtlUpcaseUnicodeStringToOemString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlUpcaseUnicodeStringToOemString(destinationstring, sourcestring, allocatedestinationstring)

public actual fun RtlUpcaseUnicodeToCustomCPN(customcp: Long, customcpstring: PSTR, maxbytesincustomcpstring: UInt, bytesincustomcpstring: Long, unicodestring: PCWSTR, bytesinunicodestring: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlUpcaseUnicodeToCustomCPN(customcp, customcpstring, maxbytesincustomcpstring.toInt(), bytesincustomcpstring, unicodestring, bytesinunicodestring.toInt())

public actual fun RtlUpcaseUnicodeToMultiByteN(multibytestring: PSTR, maxbytesinmultibytestring: UInt, bytesinmultibytestring: Long, unicodestring: Long, bytesinunicodestring: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlUpcaseUnicodeToMultiByteN(multibytestring, maxbytesinmultibytestring.toInt(), bytesinmultibytestring, unicodestring, bytesinunicodestring.toInt())

public actual fun RtlUpcaseUnicodeToOemN(oemstring: PSTR, maxbytesinoemstring: UInt, bytesinoemstring: Long, unicodestring: Long, bytesinunicodestring: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlUpcaseUnicodeToOemN(oemstring, maxbytesinoemstring.toInt(), bytesinoemstring, unicodestring, bytesinunicodestring.toInt())

public actual fun RtlValidSid(sid: PSID): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlValidSid(sid)

public actual fun RtlValidateUnicodeString(flags: UInt, string: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlValidateUnicodeString(flags.toInt(), string)

public actual fun RtlxOemStringToUnicodeSize(oemstring: Long): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlxOemStringToUnicodeSize(oemstring).toUInt()

public actual fun RtlxUnicodeStringToOemSize(unicodestring: Long): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_RtlxUnicodeStringToOemSize(unicodestring).toUInt()

public actual fun SeAccessCheckFromState(securitydescriptor: PSECURITY_DESCRIPTOR, primarytokeninformation: Long, clienttokeninformation: Long, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: Long, genericmapping: Long, accessmode: Byte, grantedaccess: Long, accessstatus: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeAccessCheckFromState(securitydescriptor, primarytokeninformation, clienttokeninformation, desiredaccess.toInt(), previouslygrantedaccess.toInt(), privileges, genericmapping, accessmode, grantedaccess, accessstatus)

public actual fun SeAccessCheckFromStateEx(securitydescriptor: PSECURITY_DESCRIPTOR, primarytoken: Long, clienttoken: Long, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: Long, genericmapping: Long, accessmode: Byte, grantedaccess: Long, accessstatus: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeAccessCheckFromStateEx(securitydescriptor, primarytoken, clienttoken, desiredaccess.toInt(), previouslygrantedaccess.toInt(), privileges, genericmapping, accessmode, grantedaccess, accessstatus)

public actual fun SeAdjustAccessStateForAccessConstraints(objecttype: Long, securitydescriptor: PSECURITY_DESCRIPTOR, accessstate: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeAdjustAccessStateForAccessConstraints(objecttype, securitydescriptor, accessstate)
}

public actual fun SeAdjustAccessStateForTrustLabel(objecttype: Long, securitydescriptor: PSECURITY_DESCRIPTOR, accessstate: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeAdjustAccessStateForTrustLabel(objecttype, securitydescriptor, accessstate)
}

public actual fun SeAdjustObjectSecurity(objectname: Long, originaldescriptor: PSECURITY_DESCRIPTOR, proposeddescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long, adjusteddescriptor: Long, applyadjusteddescriptor: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeAdjustObjectSecurity(objectname, originaldescriptor, proposeddescriptor, subjectsecuritycontext, adjusteddescriptor, applyadjusteddescriptor)

public actual fun SeAppendPrivileges(accessstate: Long, privileges: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeAppendPrivileges(accessstate, privileges)

public actual fun SeAuditFipsCryptoSelftests(bsuccess: Boolean, selftestcode: UInt) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeAuditFipsCryptoSelftests(bsuccess, selftestcode.toInt())
}

public actual fun SeAuditHardLinkCreation(filename: Long, linkname: Long, bsuccess: Boolean) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeAuditHardLinkCreation(filename, linkname, bsuccess)
}

public actual fun SeAuditHardLinkCreationWithTransaction(filename: Long, linkname: Long, bsuccess: Boolean, transactionid: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeAuditHardLinkCreationWithTransaction(filename, linkname, bsuccess, transactionid)
}

public actual fun SeAuditTransactionStateChange(transactionid: Long, resourcemanagerid: Long, newtransactionstate: UInt) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeAuditTransactionStateChange(transactionid, resourcemanagerid, newtransactionstate.toInt())
}

public actual fun SeAuditingAnyFileEventsWithContext(securitydescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeAuditingAnyFileEventsWithContext(securitydescriptor, subjectsecuritycontext)

public actual fun SeAuditingAnyFileEventsWithContextEx(securitydescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long, stagingenabled: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeAuditingAnyFileEventsWithContextEx(securitydescriptor, subjectsecuritycontext, stagingenabled)

public actual fun SeAuditingFileEvents(accessgranted: Boolean, securitydescriptor: PSECURITY_DESCRIPTOR): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeAuditingFileEvents(accessgranted, securitydescriptor)

public actual fun SeAuditingFileEventsWithContext(accessgranted: Boolean, securitydescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeAuditingFileEventsWithContext(accessgranted, securitydescriptor, subjectsecuritycontext)

public actual fun SeAuditingFileEventsWithContextEx(accessgranted: Boolean, securitydescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long, stagingenabled: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeAuditingFileEventsWithContextEx(accessgranted, securitydescriptor, subjectsecuritycontext, stagingenabled)

public actual fun SeAuditingFileOrGlobalEvents(accessgranted: Boolean, securitydescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeAuditingFileOrGlobalEvents(accessgranted, securitydescriptor, subjectsecuritycontext)

public actual fun SeAuditingHardLinkEvents(accessgranted: Boolean, securitydescriptor: PSECURITY_DESCRIPTOR): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeAuditingHardLinkEvents(accessgranted, securitydescriptor)

public actual fun SeAuditingHardLinkEventsWithContext(accessgranted: Boolean, securitydescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeAuditingHardLinkEventsWithContext(accessgranted, securitydescriptor, subjectsecuritycontext)

public actual fun SeCaptureSubjectContextEx(thread: PETHREAD, process: PEPROCESS, subjectcontext: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeCaptureSubjectContextEx(thread, process, subjectcontext)
}

public actual fun SeCheckForCriticalAceRemoval(currentdescriptor: PSECURITY_DESCRIPTOR, newdescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long, aceremoved: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeCheckForCriticalAceRemoval(currentdescriptor, newdescriptor, subjectsecuritycontext, aceremoved)
}

public actual fun SeCreateClientSecurity(clientthread: PETHREAD, clientsecurityqos: Long, remotesession: Boolean, clientcontext: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeCreateClientSecurity(clientthread, clientsecurityqos, remotesession, clientcontext)

public actual fun SeCreateClientSecurityFromSubjectContext(subjectcontext: Long, clientsecurityqos: Long, serverisremote: Boolean, clientcontext: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeCreateClientSecurityFromSubjectContext(subjectcontext, clientsecurityqos, serverisremote, clientcontext)

public actual fun SeDeleteClientSecurity(clientcontext: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeDeleteClientSecurity(clientcontext)
}

public actual fun SeDeleteObjectAuditAlarm(obj: Long, handle: HANDLE) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeDeleteObjectAuditAlarm(obj, handle)
}

public actual fun SeDeleteObjectAuditAlarmWithTransaction(obj: Long, handle: HANDLE, transactionid: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeDeleteObjectAuditAlarmWithTransaction(obj, handle, transactionid)
}

public actual fun SeExamineSacl(sacl: Long, resourcesacl: Long, token: Long, desiredaccess: UInt, accessgranted: Boolean, generateaudit: Long, generatealarm: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeExamineSacl(sacl, resourcesacl, token, desiredaccess.toInt(), accessgranted, generateaudit, generatealarm)
}

public actual fun SeFilterToken(existingtoken: Long, flags: UInt, sidstodisable: Long, privilegestodelete: Long, restrictedsids: Long, filteredtoken: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeFilterToken(existingtoken, flags.toInt(), sidstodisable, privilegestodelete, restrictedsids, filteredtoken)

public actual fun SeFreePrivileges(privileges: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeFreePrivileges(privileges)
}

public actual fun SeImpersonateClient(clientcontext: Long, serverthread: PETHREAD) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeImpersonateClient(clientcontext, serverthread)
}

public actual fun SeImpersonateClientEx(clientcontext: Long, serverthread: PETHREAD): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeImpersonateClientEx(clientcontext, serverthread)

public actual fun SeLocateProcessImageName(process: PEPROCESS, pimagefilename: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeLocateProcessImageName(process, pimagefilename)

public actual fun SeMarkLogonSessionForTerminationNotification(logonid: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeMarkLogonSessionForTerminationNotification(logonid)

public actual fun SeMarkLogonSessionForTerminationNotificationEx(logonid: Long, pserversilo: PESILO): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeMarkLogonSessionForTerminationNotificationEx(logonid, pserversilo)

public actual fun SeOpenObjectAuditAlarm(objecttypename: Long, obj: Long, absoluteobjectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, accessstate: Long, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, generateonclose: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeOpenObjectAuditAlarm(objecttypename, obj, absoluteobjectname, securitydescriptor, accessstate, objectcreated, accessgranted, accessmode, generateonclose)
}

public actual fun SeOpenObjectAuditAlarmWithTransaction(objecttypename: Long, obj: Long, absoluteobjectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, accessstate: Long, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, transactionid: Long, generateonclose: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeOpenObjectAuditAlarmWithTransaction(objecttypename, obj, absoluteobjectname, securitydescriptor, accessstate, objectcreated, accessgranted, accessmode, transactionid, generateonclose)
}

public actual fun SeOpenObjectForDeleteAuditAlarm(objecttypename: Long, obj: Long, absoluteobjectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, accessstate: Long, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, generateonclose: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeOpenObjectForDeleteAuditAlarm(objecttypename, obj, absoluteobjectname, securitydescriptor, accessstate, objectcreated, accessgranted, accessmode, generateonclose)
}

public actual fun SeOpenObjectForDeleteAuditAlarmWithTransaction(objecttypename: Long, obj: Long, absoluteobjectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, accessstate: Long, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, transactionid: Long, generateonclose: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeOpenObjectForDeleteAuditAlarmWithTransaction(objecttypename, obj, absoluteobjectname, securitydescriptor, accessstate, objectcreated, accessgranted, accessmode, transactionid, generateonclose)
}

public actual fun SePrivilegeCheck(requiredprivileges: Long, subjectsecuritycontext: Long, accessmode: Byte): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SePrivilegeCheck(requiredprivileges, subjectsecuritycontext, accessmode)

public actual fun SeQueryAuthenticationIdToken(token: Long, authenticationid: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeQueryAuthenticationIdToken(token, authenticationid)

public actual fun SeQueryInformationToken(token: Long, tokeninformationclass: TOKEN_INFORMATION_CLASS, tokeninformation: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeQueryInformationToken(token, tokeninformationclass, tokeninformation)

public actual fun SeQuerySecurityDescriptorInfo(securityinformation: Long, securitydescriptor: PSECURITY_DESCRIPTOR, length: Long, objectssecuritydescriptor: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeQuerySecurityDescriptorInfo(securityinformation, securitydescriptor, length, objectssecuritydescriptor)

public actual fun SeQueryServerSiloToken(token: Long, pserversilo: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeQueryServerSiloToken(token, pserversilo)

public actual fun SeQuerySessionIdToken(token: Long, sessionid: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeQuerySessionIdToken(token, sessionid)

public actual fun SeQuerySessionIdTokenEx(token: Long, sessionid: Long, isservicesession: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeQuerySessionIdTokenEx(token, sessionid, isservicesession)

public actual fun SeRegisterLogonSessionTerminatedRoutine(callbackroutine: PSE_LOGON_SESSION_TERMINATED_ROUTINE): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeRegisterLogonSessionTerminatedRoutine(callbackroutine.toLong())

public actual fun SeRegisterLogonSessionTerminatedRoutineEx(callbackroutine: PSE_LOGON_SESSION_TERMINATED_ROUTINE_EX, context: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeRegisterLogonSessionTerminatedRoutineEx(callbackroutine.toLong(), context)

public actual fun SeReportSecurityEventWithSubCategory(flags: UInt, sourcename: Long, usersid: PSID, auditparameters: Long, auditsubcategoryid: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeReportSecurityEventWithSubCategory(flags.toInt(), sourcename, usersid, auditparameters, auditsubcategoryid.toInt())

public actual fun SeSetAccessStateGenericMapping(accessstate: Long, genericmapping: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeSetAccessStateGenericMapping(accessstate, genericmapping)
}

public actual fun SeSetSecurityDescriptorInfo(obj: Long, securityinformation: Long, modificationdescriptor: PSECURITY_DESCRIPTOR, objectssecuritydescriptor: Long, pooltype: POOL_TYPE, genericmapping: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeSetSecurityDescriptorInfo(obj, securityinformation, modificationdescriptor, objectssecuritydescriptor, pooltype, genericmapping)

public actual fun SeSetSecurityDescriptorInfoEx(obj: Long, securityinformation: Long, modificationdescriptor: PSECURITY_DESCRIPTOR, objectssecuritydescriptor: Long, autoinheritflags: UInt, pooltype: POOL_TYPE, genericmapping: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeSetSecurityDescriptorInfoEx(obj, securityinformation, modificationdescriptor, objectssecuritydescriptor, autoinheritflags.toInt(), pooltype, genericmapping)

public actual fun SeShouldCheckForAccessRightsFromParent(objecttype: Long, childdescriptor: PSECURITY_DESCRIPTOR, accessstate: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeShouldCheckForAccessRightsFromParent(objecttype, childdescriptor, accessstate)

public actual fun SeTokenFromAccessInformation(accessinformation: Long, token: Long, length: UInt, requiredlength: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeTokenFromAccessInformation(accessinformation, token, length.toInt(), requiredlength)

public actual fun SeTokenIsAdmin(token: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeTokenIsAdmin(token)

public actual fun SeTokenIsRestricted(token: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeTokenIsRestricted(token)

public actual fun SeTokenIsWriteRestricted(token: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeTokenIsWriteRestricted(token)

public actual fun SeTokenType(token: Long): TOKEN_TYPE =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeTokenType(token)

public actual fun SeUnregisterLogonSessionTerminatedRoutine(callbackroutine: PSE_LOGON_SESSION_TERMINATED_ROUTINE): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeUnregisterLogonSessionTerminatedRoutine(callbackroutine.toLong())

public actual fun SeUnregisterLogonSessionTerminatedRoutineEx(callbackroutine: PSE_LOGON_SESSION_TERMINATED_ROUTINE_EX, context: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SeUnregisterLogonSessionTerminatedRoutineEx(callbackroutine.toLong(), context)

public actual fun SecLookupAccountName(name: Long, sidsize: Long, sid: PSID, nameuse: Long, domainsize: Long, referenceddomain: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SecLookupAccountName(name, sidsize, sid, nameuse, domainsize, referenceddomain)

public actual fun SecLookupAccountSid(sid: PSID, namesize: Long, namebuffer: Long, domainsize: Long, domainbuffer: Long, nameuse: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SecLookupAccountSid(sid, namesize, namebuffer, domainsize, domainbuffer, nameuse)

public actual fun SecLookupWellKnownSid(sidtype: WELL_KNOWN_SID_TYPE, sid: PSID, sidbuffersize: UInt, sidsize: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SecLookupWellKnownSid(sidtype, sid, sidbuffersize.toInt(), sidsize)

public actual fun SecMakeSPN(serviceclass: Long, servicename: Long, instancename: Long, instanceport: UShort, referrer: Long, spn: Long, length: Long, allocate: Boolean): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SecMakeSPN(serviceclass, servicename, instancename, instanceport.toShort(), referrer, spn, length, allocate)

public actual fun SecMakeSPNEx(serviceclass: Long, servicename: Long, instancename: Long, instanceport: UShort, referrer: Long, targetinfo: Long, spn: Long, length: Long, allocate: Boolean): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SecMakeSPNEx(serviceclass, servicename, instancename, instanceport.toShort(), referrer, targetinfo, spn, length, allocate)

public actual fun SecMakeSPNEx2(serviceclass: Long, servicename: Long, instancename: Long, instanceport: UShort, referrer: Long, intargetinfo: Long, spn: Long, totalsize: Long, allocate: Boolean, istargetinfomarshaled: Boolean): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SecMakeSPNEx2(serviceclass, servicename, instancename, instanceport.toShort(), referrer, intargetinfo, spn, totalsize, allocate, istargetinfomarshaled)

public actual fun SetContextAttributesW(phcontext: Long, ulattribute: UInt, pbuffer: Long, cbbuffer: UInt): HRESULT =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SetContextAttributesW(phcontext, ulattribute.toInt(), pbuffer, cbbuffer.toInt())

public actual fun SspiAcceptSecurityContextAsync(asynccontext: Long, phcredential: Long, phcontext: Long, pinput: Long, fcontextreq: UInt, targetdatarep: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SspiAcceptSecurityContextAsync(asynccontext, phcredential, phcontext, pinput, fcontextreq.toInt(), targetdatarep.toInt(), phnewcontext, poutput, pfcontextattr, ptsexpiry)

public actual fun SspiAcquireCredentialsHandleAsyncA(asynccontext: Long, pszprincipal: PCSTR, pszpackage: PCSTR, fcredentialuse: UInt, pvlogonid: Long, pauthdata: Long, pgetkeyfn: SEC_GET_KEY_FN, pvgetkeyargument: Long, phcredential: Long, ptsexpiry: Long): HRESULT =
    0

public actual fun SspiAcquireCredentialsHandleAsyncW(asynccontext: Long, pszprincipal: Long, pszpackage: Long, fcredentialuse: UInt, pvlogonid: Long, pauthdata: Long, pgetkeyfn: SEC_GET_KEY_FN, pvgetkeyargument: Long, phcredential: Long, ptsexpiry: Long): HRESULT =
    0

public actual fun SspiCreateAsyncContext(): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SspiCreateAsyncContext()

public actual fun SspiDeleteSecurityContextAsync(asynccontext: Long, phcontext: Long): HRESULT =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SspiDeleteSecurityContextAsync(asynccontext, phcontext)

public actual fun SspiFreeAsyncContext(handle: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SspiFreeAsyncContext(handle)
}

public actual fun SspiFreeCredentialsHandleAsync(asynccontext: Long, phcredential: Long): HRESULT =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SspiFreeCredentialsHandleAsync(asynccontext, phcredential)

public actual fun SspiGetAsyncCallStatus(handle: Long): HRESULT =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SspiGetAsyncCallStatus(handle)

public actual fun SspiInitializeSecurityContextAsyncA(asynccontext: Long, phcredential: Long, phcontext: Long, psztargetname: PCSTR, fcontextreq: UInt, reserved1: UInt, targetdatarep: UInt, pinput: Long, reserved2: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SspiInitializeSecurityContextAsyncA(asynccontext, phcredential, phcontext, psztargetname, fcontextreq.toInt(), reserved1.toInt(), targetdatarep.toInt(), pinput, reserved2.toInt(), phnewcontext, poutput, pfcontextattr, ptsexpiry)

public actual fun SspiInitializeSecurityContextAsyncW(asynccontext: Long, phcredential: Long, phcontext: Long, psztargetname: Long, fcontextreq: UInt, reserved1: UInt, targetdatarep: UInt, pinput: Long, reserved2: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SspiInitializeSecurityContextAsyncW(asynccontext, phcredential, phcontext, psztargetname, fcontextreq.toInt(), reserved1.toInt(), targetdatarep.toInt(), pinput, reserved2.toInt(), phnewcontext, poutput, pfcontextattr, ptsexpiry)

public actual fun SspiReinitAsyncContext(handle: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SspiReinitAsyncContext(handle)

public actual fun SspiSetAsyncNotifyCallback(context: Long, callback: SspiAsyncNotifyCallback, callbackdata: Long): HRESULT =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_SspiSetAsyncNotifyCallback(context, callback.toLong(), callbackdata)

public actual fun VerifySignature(phcontext: Long, pmessage: Long, messageseqno: UInt, pfqop: Long): HRESULT =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_VerifySignature(phcontext, pmessage, messageseqno.toInt(), pfqop)

public actual fun ZwAccessCheckAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, desiredaccess: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwAccessCheckAndAuditAlarm(subsystemname, handleid, objecttypename, objectname, securitydescriptor, desiredaccess.toInt(), genericmapping, objectcreation, grantedaccess, accessstatus, generateonclose)

public actual fun ZwAccessCheckByTypeAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwAccessCheckByTypeAndAuditAlarm(subsystemname, handleid, objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist, objecttypelistlength.toInt(), genericmapping, objectcreation, grantedaccess, accessstatus, generateonclose)

public actual fun ZwAccessCheckByTypeResultListAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwAccessCheckByTypeResultListAndAuditAlarm(subsystemname, handleid, objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist, objecttypelistlength.toInt(), genericmapping, objectcreation, grantedaccess, accessstatus, generateonclose)

public actual fun ZwAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname: Long, handleid: Long, clienttoken: HANDLE, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname, handleid, clienttoken, objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist, objecttypelistlength.toInt(), genericmapping, objectcreation, grantedaccess, accessstatus, generateonclose)

public actual fun ZwAdjustGroupsToken(tokenhandle: HANDLE, resettodefault: Boolean, newstate: Long, bufferlength: UInt, previousstate: Long, returnlength: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwAdjustGroupsToken(tokenhandle, resettodefault, newstate, bufferlength.toInt(), previousstate, returnlength)

public actual fun ZwAdjustPrivilegesToken(tokenhandle: HANDLE, disableallprivileges: Boolean, newstate: Long, bufferlength: UInt, previousstate: Long, returnlength: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwAdjustPrivilegesToken(tokenhandle, disableallprivileges, newstate, bufferlength.toInt(), previousstate, returnlength)

public actual fun ZwAllocateVirtualMemory(processhandle: HANDLE, baseaddress: Long, zerobits: ULong, regionsize: Long, allocationtype: UInt, protect: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwAllocateVirtualMemory(processhandle, baseaddress, zerobits.toLong(), regionsize, allocationtype.toInt(), protect.toInt())

public actual fun ZwAllocateVirtualMemoryEx(processhandle: HANDLE, baseaddress: Long, regionsize: Long, allocationtype: UInt, pageprotection: UInt, extendedparameters: Long, extendedparametercount: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwAllocateVirtualMemoryEx(processhandle, baseaddress, regionsize, allocationtype.toInt(), pageprotection.toInt(), extendedparameters, extendedparametercount.toInt())

public actual fun ZwCancelIoFileEx(filehandle: HANDLE, iorequesttocancel: Long, iostatusblock: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwCancelIoFileEx(filehandle, iorequesttocancel, iostatusblock)

public actual fun ZwCloseObjectAuditAlarm(subsystemname: Long, handleid: Long, generateonclose: Boolean): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwCloseObjectAuditAlarm(subsystemname, handleid, generateonclose)

public actual fun ZwCreateDirectoryObject(directoryhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwCreateDirectoryObject(directoryhandle, desiredaccess.toInt(), objectattributes)

public actual fun ZwCreateEvent(eventhandle: Long, desiredaccess: UInt, objectattributes: Long, eventtype: EVENT_TYPE, initialstate: Boolean): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwCreateEvent(eventhandle, desiredaccess.toInt(), objectattributes, eventtype, initialstate)

public actual fun ZwCreateSectionEx(sectionhandle: Long, desiredaccess: UInt, objectattributes: Long, maximumsize: Long, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: HANDLE, extendedparameters: Long, extendedparametercount: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwCreateSectionEx(sectionhandle, desiredaccess.toInt(), objectattributes, maximumsize, sectionpageprotection.toInt(), allocationattributes.toInt(), filehandle, extendedparameters, extendedparametercount.toInt())

public actual fun ZwDeleteFile(objectattributes: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwDeleteFile(objectattributes)

public actual fun ZwDeleteObjectAuditAlarm(subsystemname: Long, handleid: Long, generateonclose: Boolean): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwDeleteObjectAuditAlarm(subsystemname, handleid, generateonclose)

public actual fun ZwDuplicateObject(sourceprocesshandle: HANDLE, sourcehandle: HANDLE, targetprocesshandle: HANDLE, targethandle: Long, desiredaccess: UInt, handleattributes: UInt, options: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwDuplicateObject(sourceprocesshandle, sourcehandle, targetprocesshandle, targethandle, desiredaccess.toInt(), handleattributes.toInt(), options.toInt())

public actual fun ZwDuplicateToken(existingtokenhandle: HANDLE, desiredaccess: UInt, objectattributes: Long, effectiveonly: Boolean, tokentype: TOKEN_TYPE, newtokenhandle: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwDuplicateToken(existingtokenhandle, desiredaccess.toInt(), objectattributes, effectiveonly, tokentype, newtokenhandle)

public actual fun ZwFilterToken(existingtokenhandle: HANDLE, flags: UInt, sidstodisable: Long, privilegestodelete: Long, restrictedsids: Long, newtokenhandle: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwFilterToken(existingtokenhandle, flags.toInt(), sidstodisable, privilegestodelete, restrictedsids, newtokenhandle)

public actual fun ZwFlushBuffersFile(filehandle: HANDLE, iostatusblock: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwFlushBuffersFile(filehandle, iostatusblock)

public actual fun ZwFlushBuffersFileEx(filehandle: HANDLE, flags: UInt, parameters: Long, parameterssize: UInt, iostatusblock: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwFlushBuffersFileEx(filehandle, flags.toInt(), parameters, parameterssize.toInt(), iostatusblock)

public actual fun ZwFlushVirtualMemory(processhandle: HANDLE, baseaddress: Long, regionsize: Long, iostatus: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwFlushVirtualMemory(processhandle, baseaddress, regionsize, iostatus)

public actual fun ZwFreeVirtualMemory(processhandle: HANDLE, baseaddress: Long, regionsize: Long, freetype: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwFreeVirtualMemory(processhandle, baseaddress, regionsize, freetype.toInt())

public actual fun ZwFsControlFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, fscontrolcode: UInt, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt): NTSTATUS =
    0

public actual fun ZwImpersonateAnonymousToken(threadhandle: HANDLE): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwImpersonateAnonymousToken(threadhandle)

public actual fun ZwLockFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, byteoffset: Long, length: Long, key: UInt, failimmediately: Boolean, exclusivelock: Boolean): NTSTATUS =
    0

public actual fun ZwNotifyChangeKey(keyhandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, completionfilter: UInt, watchtree: Boolean, buffer: Long, buffersize: UInt, asynchronous: Boolean): NTSTATUS =
    0

public actual fun ZwOpenDirectoryObject(directoryhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwOpenDirectoryObject(directoryhandle, desiredaccess.toInt(), objectattributes)

public actual fun ZwOpenObjectAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, clienttoken: HANDLE, desiredaccess: UInt, grantedaccess: UInt, privileges: Long, objectcreation: Boolean, accessgranted: Boolean, generateonclose: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwOpenObjectAuditAlarm(subsystemname, handleid, objecttypename, objectname, securitydescriptor, clienttoken, desiredaccess.toInt(), grantedaccess.toInt(), privileges, objectcreation, accessgranted, generateonclose)

public actual fun ZwOpenProcessToken(processhandle: HANDLE, desiredaccess: UInt, tokenhandle: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwOpenProcessToken(processhandle, desiredaccess.toInt(), tokenhandle)

public actual fun ZwOpenProcessTokenEx(processhandle: HANDLE, desiredaccess: UInt, handleattributes: UInt, tokenhandle: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwOpenProcessTokenEx(processhandle, desiredaccess.toInt(), handleattributes.toInt(), tokenhandle)

public actual fun ZwOpenThreadToken(threadhandle: HANDLE, desiredaccess: UInt, openasself: Boolean, tokenhandle: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwOpenThreadToken(threadhandle, desiredaccess.toInt(), openasself, tokenhandle)

public actual fun ZwOpenThreadTokenEx(threadhandle: HANDLE, desiredaccess: UInt, openasself: Boolean, handleattributes: UInt, tokenhandle: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwOpenThreadTokenEx(threadhandle, desiredaccess.toInt(), openasself, handleattributes.toInt(), tokenhandle)

public actual fun ZwPrivilegeCheck(clienttoken: HANDLE, requiredprivileges: Long, result: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwPrivilegeCheck(clienttoken, requiredprivileges, result)

public actual fun ZwPrivilegeObjectAuditAlarm(subsystemname: Long, handleid: Long, clienttoken: HANDLE, desiredaccess: UInt, privileges: Long, accessgranted: Boolean): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwPrivilegeObjectAuditAlarm(subsystemname, handleid, clienttoken, desiredaccess.toInt(), privileges, accessgranted)

public actual fun ZwPrivilegedServiceAuditAlarm(subsystemname: Long, servicename: Long, clienttoken: HANDLE, privileges: Long, accessgranted: Boolean): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwPrivilegedServiceAuditAlarm(subsystemname, servicename, clienttoken, privileges, accessgranted)

public actual fun ZwQueryDirectoryFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, returnsingleentry: Boolean, filename: Long, restartscan: Boolean): NTSTATUS =
    0

public actual fun ZwQueryDirectoryFileEx(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, queryflags: UInt, filename: Long): NTSTATUS =
    0

public actual fun ZwQueryDirectoryObject(directoryhandle: HANDLE, buffer: Long, length: UInt, returnsingleentry: Boolean, restartscan: Boolean, context: Long, returnlength: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwQueryDirectoryObject(directoryhandle, buffer, length.toInt(), returnsingleentry, restartscan, context, returnlength)

public actual fun ZwQueryEaFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt, returnsingleentry: Boolean, ealist: Long, ealistlength: UInt, eaindex: Long, restartscan: Boolean): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwQueryEaFile(filehandle, iostatusblock, buffer, length.toInt(), returnsingleentry, ealist, ealistlength.toInt(), eaindex, restartscan)

public actual fun ZwQueryFullAttributesFile(objectattributes: Long, fileinformation: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwQueryFullAttributesFile(objectattributes, fileinformation)

public actual fun ZwQueryInformationToken(tokenhandle: HANDLE, tokeninformationclass: TOKEN_INFORMATION_CLASS, tokeninformation: Long, tokeninformationlength: UInt, returnlength: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwQueryInformationToken(tokenhandle, tokeninformationclass, tokeninformation, tokeninformationlength.toInt(), returnlength)

public actual fun ZwQueryObject(handle: HANDLE, objectinformationclass: OBJECT_INFORMATION_CLASS, objectinformation: Long, objectinformationlength: UInt, returnlength: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwQueryObject(handle, objectinformationclass, objectinformation, objectinformationlength.toInt(), returnlength)

public actual fun ZwQueryQuotaInformationFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt, returnsingleentry: Boolean, sidlist: Long, sidlistlength: UInt, startsid: PSID, restartscan: Boolean): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwQueryQuotaInformationFile(filehandle, iostatusblock, buffer, length.toInt(), returnsingleentry, sidlist, sidlistlength.toInt(), startsid, restartscan)

public actual fun ZwQuerySecurityObject(handle: HANDLE, securityinformation: UInt, securitydescriptor: PSECURITY_DESCRIPTOR, length: UInt, lengthneeded: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwQuerySecurityObject(handle, securityinformation.toInt(), securitydescriptor, length.toInt(), lengthneeded)

public actual fun ZwQueryVirtualMemory(processhandle: HANDLE, baseaddress: Long, memoryinformationclass: MEMORY_INFORMATION_CLASS, memoryinformation: Long, memoryinformationlength: ULong, returnlength: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwQueryVirtualMemory(processhandle, baseaddress, memoryinformationclass, memoryinformation, memoryinformationlength.toLong(), returnlength)

public actual fun ZwQueryVolumeInformationFile(filehandle: HANDLE, iostatusblock: Long, fsinformation: Long, length: UInt, fsinformationclass: FS_INFORMATION_CLASS): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwQueryVolumeInformationFile(filehandle, iostatusblock, fsinformation, length.toInt(), fsinformationclass)

public actual fun ZwSetEaFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwSetEaFile(filehandle, iostatusblock, buffer, length.toInt())

public actual fun ZwSetEvent(eventhandle: HANDLE, previousstate: Long): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwSetEvent(eventhandle, previousstate)

public actual fun ZwSetInformationToken(tokenhandle: HANDLE, tokeninformationclass: TOKEN_INFORMATION_CLASS, tokeninformation: Long, tokeninformationlength: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwSetInformationToken(tokenhandle, tokeninformationclass, tokeninformation, tokeninformationlength.toInt())

public actual fun ZwSetInformationVirtualMemory(processhandle: HANDLE, vminformationclass: VIRTUAL_MEMORY_INFORMATION_CLASS, numberofentries: ULong, virtualaddresses: Long, vminformation: Long, vminformationlength: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwSetInformationVirtualMemory(processhandle, vminformationclass, numberofentries.toLong(), virtualaddresses, vminformation, vminformationlength.toInt())

public actual fun ZwSetQuotaInformationFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwSetQuotaInformationFile(filehandle, iostatusblock, buffer, length.toInt())

public actual fun ZwSetSecurityObject(handle: HANDLE, securityinformation: UInt, securitydescriptor: PSECURITY_DESCRIPTOR): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwSetSecurityObject(handle, securityinformation.toInt(), securitydescriptor)

public actual fun ZwSetVolumeInformationFile(filehandle: HANDLE, iostatusblock: Long, fsinformation: Long, length: UInt, fsinformationclass: FS_INFORMATION_CLASS): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwSetVolumeInformationFile(filehandle, iostatusblock, fsinformation, length.toInt(), fsinformationclass)

public actual fun ZwUnlockFile(filehandle: HANDLE, iostatusblock: Long, byteoffset: Long, length: Long, key: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemJniBridge.windowssys_windows_wdk_storage_filesystem_ZwUnlockFile(filehandle, iostatusblock, byteoffset, length, key.toInt())
