@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object WindowsWdkStorageFilesystemJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemApplyControlToken(phcontext: Long, pinput: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcAsyncCopyRead(fileobject: Long, fileoffset: Long, length: Int, wait: Boolean, buffer: Long, iostatus: Long, ioissuerthread: Long, asyncreadcontext: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcCanIWrite(fileobject: Long, bytestowrite: Int, wait: Boolean, retrying: Byte): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcCoherencyFlushAndPurgeCache(sectionobjectpointer: Long, fileoffset: Long, length: Int, iostatus: Long, flags: Int)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcCopyRead(fileobject: Long, fileoffset: Long, length: Int, wait: Boolean, buffer: Long, iostatus: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcCopyReadEx(fileobject: Long, fileoffset: Long, length: Int, wait: Boolean, buffer: Long, iostatus: Long, ioissuerthread: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcCopyWrite(fileobject: Long, fileoffset: Long, length: Int, wait: Boolean, buffer: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcCopyWriteEx(fileobject: Long, fileoffset: Long, length: Int, wait: Boolean, buffer: Long, ioissuerthread: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcCopyWriteWontFlush(fileobject: Long, fileoffset: Long, length: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcDeferWrite(fileobject: Long, postroutine: Long, context1: Long, context2: Long, bytestowrite: Int, retrying: Boolean)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcErrorCallbackRoutine(context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcFastCopyRead(fileobject: Long, fileoffset: Int, length: Int, pagecount: Int, buffer: Long, iostatus: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcFastCopyWrite(fileobject: Long, fileoffset: Int, length: Int, buffer: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcFlushCache(sectionobjectpointer: Long, fileoffset: Long, length: Int, iostatus: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcGetDirtyPages(loghandle: Long, dirtypageroutine: Long, context1: Long, context2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcGetFileObjectFromBcb(bcb: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcGetFileObjectFromSectionPtrs(sectionobjectpointer: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcGetFileObjectFromSectionPtrsRef(sectionobjectpointer: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcGetFlushedValidData(sectionobjectpointer: Long, bcblistheld: Boolean): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcInitializeCacheMap(fileobject: Long, filesizes: Long, pinaccess: Boolean, callbacks: Long, lazywritecontext: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcInitializeCacheMapEx(fileobject: Long, filesizes: Long, pinaccess: Boolean, callbacks: Long, lazywritecontext: Long, flags: Int)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcIsCacheManagerCallbackNeeded(status: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcIsThereDirtyData(vpb: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcIsThereDirtyDataEx(vpb: Long, numberofdirtypages: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcMapData(fileobject: Long, fileoffset: Long, length: Int, flags: Int, bcb: Long, buffer: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcMdlRead(fileobject: Long, fileoffset: Long, length: Int, mdlchain: Long, iostatus: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcMdlReadComplete(fileobject: Long, mdlchain: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcMdlWriteAbort(fileobject: Long, mdlchain: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcMdlWriteComplete(fileobject: Long, fileoffset: Long, mdlchain: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcPinMappedData(fileobject: Long, fileoffset: Long, length: Int, flags: Int, bcb: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcPinRead(fileobject: Long, fileoffset: Long, length: Int, flags: Int, bcb: Long, buffer: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcPrepareMdlWrite(fileobject: Long, fileoffset: Long, length: Int, mdlchain: Long, iostatus: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcPreparePinWrite(fileobject: Long, fileoffset: Long, length: Int, zero: Boolean, flags: Int, bcb: Long, buffer: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcPurgeCacheSection(sectionobjectpointer: Long, fileoffset: Long, length: Int, flags: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcRemapBcb(bcb: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcRepinBcb(bcb: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcScheduleReadAhead(fileobject: Long, fileoffset: Long, length: Int)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcScheduleReadAheadEx(fileobject: Long, fileoffset: Long, length: Int, ioissuerthread: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcSetAdditionalCacheAttributes(fileobject: Long, disablereadahead: Boolean, disablewritebehind: Boolean)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcSetAdditionalCacheAttributesEx(fileobject: Long, flags: Int)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcSetBcbOwnerPointer(bcb: Long, ownerpointer: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcSetDirtyPageThreshold(fileobject: Long, dirtypagethreshold: Int)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcSetDirtyPinnedData(bcbvoid: Long, lsn: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcSetFileSizes(fileobject: Long, filesizes: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcSetFileSizesEx(fileobject: Long, filesizes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcSetLogHandleForFile(fileobject: Long, loghandle: Long, flushtolsnroutine: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcSetParallelFlushFile(fileobject: Long, enableparallelflush: Boolean)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcSetReadAheadGranularity(fileobject: Long, granularity: Int)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcUninitializeCacheMap(fileobject: Long, truncatesize: Long, uninitializeevent: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcUnpinData(bcb: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcUnpinDataForThread(bcb: Long, resourcethreadid: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcUnpinRepinnedBcb(bcb: Long, writethrough: Boolean, iostatus: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcWaitForCurrentLazyWriterActivity(): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCcZeroData(fileobject: Long, startoffset: Long, endoffset: Long, wait: Boolean): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemCompleteAuthToken(phcontext: Long, ptoken: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemExDisableResourceBoostLite(resource: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemExQueryPoolBlockSize(poolblock: Long, quotacharged: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemExportSecurityContext(phcontext: Long, fflags: Int, ppackedcontext: Long, ptoken: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlAcknowledgeEcp(ecpcontext: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlAcquireFileExclusive(fileobject: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlAddBaseMcbEntry(mcb: Long, vbn: Long, lbn: Long, sectorcount: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlAddBaseMcbEntryEx(mcb: Long, vbn: Long, lbn: Long, sectorcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlAddLargeMcbEntry(mcb: Long, vbn: Long, lbn: Long, sectorcount: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlAddMcbEntry(mcb: Long, vbn: Int, lbn: Int, sectorcount: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlAddToTunnelCache(cache: Long, directorykey: Long, shortname: Long, longname: Long, keybyshortname: Boolean, datalength: Int, data: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlAddToTunnelCacheEx(cache: Long, directorykey: Long, shortname: Long, longname: Long, flags: Int, datalength: Int, data: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlAllocateAePushLock(pooltype: Int, tag: Int): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlAllocateExtraCreateParameter(ecptype: Long, sizeofcontext: Int, flags: Int, cleanupcallback: Long, pooltag: Int, ecpcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlAllocateExtraCreateParameterFromLookasideList(ecptype: Long, sizeofcontext: Int, flags: Int, cleanupcallback: Long, lookasidelist: Long, ecpcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlAllocateExtraCreateParameterList(flags: Int, ecplist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlAllocateFileLock(completelockirproutine: Long, unlockroutine: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlAllocateResource(): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlAreNamesEqual(constantnamea: Long, constantnameb: Long, ignorecase: Boolean, upcasetable: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlAreThereCurrentOrInProgressFileLocks(filelock: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlAreThereWaitingFileLocks(filelock: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlAreVolumeStartupApplicationsComplete(): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlBalanceReads(targetdevice: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlCancellableWaitForMultipleObjects(count: Int, objectarray: Long, waittype: Int, timeout: Long, waitblockarray: Long, irp: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlCancellableWaitForSingleObject(obj: Long, timeout: Long, irp: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlChangeBackingFileObject(currentfileobject: Long, newfileobject: Long, changebackingtype: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlCheckLockForOplockRequest(filelock: Long, allocationsize: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlCheckLockForReadAccess(filelock: Long, irp: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlCheckLockForWriteAccess(filelock: Long, irp: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlCheckOplock(oplock: Long, irp: Long, context: Long, completionroutine: Long, postirproutine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlCheckOplockEx(oplock: Long, irp: Long, flags: Int, context: Long, completionroutine: Long, postirproutine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlCheckOplockEx2(oplock: Long, irp: Long, flags: Int, flagsex2: Int, completionroutinecontext: Long, completionroutine: Long, postirproutine: Long, timeout: Long, notifycontext: Long, notifyroutine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlCheckUpperOplock(oplock: Long, newloweroplockstate: Int, completionroutinecontext: Long, completionroutine: Long, prependroutine: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlCopyRead(fileobject: Long, fileoffset: Long, length: Int, wait: Boolean, lockkey: Int, buffer: Long, iostatus: Long, deviceobject: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlCopyWrite(fileobject: Long, fileoffset: Long, length: Int, wait: Boolean, lockkey: Int, buffer: Long, iostatus: Long, deviceobject: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlCreateSectionForDataScan(sectionhandle: Long, sectionobject: Long, sectionfilesize: Long, fileobject: Long, desiredaccess: Int, objectattributes: Long, maximumsize: Long, sectionpageprotection: Int, allocationattributes: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlCurrentBatchOplock(oplock: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlCurrentOplock(oplock: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlCurrentOplockH(oplock: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlDeleteExtraCreateParameterLookasideList(lookaside: Long, flags: Int)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlDeleteKeyFromTunnelCache(cache: Long, directorykey: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlDeleteTunnelCache(cache: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlDeregisterUncProvider(handle: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlDismountComplete(deviceobject: Long, dismountstatus: Int)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlDoesDbcsContainWildCards(name: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlDoesNameContainWildCards(name: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlFastCheckLockForRead(filelock: Long, startingbyte: Long, length: Long, key: Int, fileobject: Long, processid: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlFastCheckLockForWrite(filelock: Long, startingbyte: Long, length: Long, key: Int, fileobject: Long, processid: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlFastUnlockAll(filelock: Long, fileobject: Long, processid: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlFastUnlockAllByKey(filelock: Long, fileobject: Long, processid: Long, key: Int, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlFastUnlockSingle(filelock: Long, fileobject: Long, fileoffset: Long, length: Long, processid: Long, key: Int, context: Long, alreadysynchronized: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlFindExtraCreateParameter(ecplist: Long, ecptype: Long, ecpcontext: Long, ecpcontextsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlFindInTunnelCache(cache: Long, directorykey: Long, name: Long, shortname: Long, longname: Long, datalength: Long, data: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlFindInTunnelCacheEx(cache: Long, directorykey: Long, name: Long, shortname: Long, longname: Long, flags: Int, datalength: Long, data: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlFreeAePushLock(aepushlock: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlFreeExtraCreateParameter(ecpcontext: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlFreeExtraCreateParameterList(ecplist: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlFreeFileLock(filelock: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlGetCurrentProcessLoaderList(): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlGetEcpListFromIrp(irp: Long, ecplist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlGetFileSize(fileobject: Long, filesize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlGetNextBaseMcbEntry(mcb: Long, runindex: Int, vbn: Long, lbn: Long, sectorcount: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlGetNextExtraCreateParameter(ecplist: Long, currentecpcontext: Long, nextecptype: Long, nextecpcontext: Long, nextecpcontextsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlGetNextFileLock(filelock: Long, restart: Boolean): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlGetNextLargeMcbEntry(mcb: Long, runindex: Int, vbn: Long, lbn: Long, sectorcount: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlGetNextMcbEntry(mcb: Long, runindex: Int, vbn: Long, lbn: Long, sectorcount: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlGetSectorSizeInformation(deviceobject: Long, sectorsizeinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlGetSupportedFeatures(deviceobject: Long, supportedfeatures: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlGetVirtualDiskNestingLevel(deviceobject: Long, nestinglevel: Long, nestingflags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastMdlReadWait()

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadNoWait()

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadNotPossible()

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadResourceMiss()

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadWait()

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlInitExtraCreateParameterLookasideList(lookaside: Long, flags: Int, size: Long, tag: Int)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlInitializeBaseMcb(mcb: Long, pooltype: Int)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlInitializeBaseMcbEx(mcb: Long, pooltype: Int, flags: Short): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlInitializeExtraCreateParameter(ecp: Long, ecpflags: Int, cleanupcallback: Long, totalsize: Int, ecptype: Long, listallocatedfrom: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlInitializeExtraCreateParameterList(ecplist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlInitializeFileLock(filelock: Long, completelockirproutine: Long, unlockroutine: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlInitializeLargeMcb(mcb: Long, pooltype: Int)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlInitializeMcb(mcb: Long, pooltype: Int)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlInitializeOplock(oplock: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlInitializeTunnelCache(cache: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlInsertExtraCreateParameter(ecplist: Long, ecpcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlInsertPerFileContext(perfilecontextpointer: Long, ptr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlInsertPerFileObjectContext(fileobject: Long, ptr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlInsertPerStreamContext(perstreamcontext: Long, ptr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlIs32BitProcess(process: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlIsDaxVolume(fileobject: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlIsDbcsInExpression(expression: Long, name: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlIsEcpAcknowledged(ecpcontext: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlIsEcpFromUserMode(ecpcontext: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlIsExtentDangling(startpage: Int, numberofpages: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlIsMobileOS(): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlIsNameInExpression(expression: Long, name: Long, ignorecase: Boolean, upcasetable: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlIsNameInUnUpcasedExpression(expression: Long, name: Long, ignorecase: Boolean, upcasetable: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlIsNtstatusExpected(exception: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlIsPagingFile(fileobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlIsSystemPagingFile(fileobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlIssueDeviceIoControl(deviceobject: Long, ioctl: Int, flags: Byte, inputbuffer: Long, inputbufferlength: Int, outputbuffer: Long, outputbufferlength: Int, iosbinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlKernelFsControlFile(fileobject: Long, fscontrolcode: Int, inputbuffer: Long, inputbufferlength: Int, outputbuffer: Long, outputbufferlength: Int, retoutputbuffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlLogCcFlushError(filename: Long, deviceobject: Long, sectionobjectpointer: Long, flusherror: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlLookupBaseMcbEntry(mcb: Long, vbn: Long, lbn: Long, sectorcountfromlbn: Long, startinglbn: Long, sectorcountfromstartinglbn: Long, index: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlLookupLargeMcbEntry(mcb: Long, vbn: Long, lbn: Long, sectorcountfromlbn: Long, startinglbn: Long, sectorcountfromstartinglbn: Long, index: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlLookupLastBaseMcbEntry(mcb: Long, vbn: Long, lbn: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlLookupLastBaseMcbEntryAndIndex(opaquemcb: Long, largevbn: Long, largelbn: Long, index: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlLookupLastLargeMcbEntry(mcb: Long, vbn: Long, lbn: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlLookupLastLargeMcbEntryAndIndex(opaquemcb: Long, largevbn: Long, largelbn: Long, index: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlLookupLastMcbEntry(mcb: Long, vbn: Long, lbn: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlLookupMcbEntry(mcb: Long, vbn: Int, lbn: Long, sectorcount: Long, index: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlLookupPerFileContext(perfilecontextpointer: Long, ownerid: Long, instanceid: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlLookupPerFileObjectContext(fileobject: Long, ownerid: Long, instanceid: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlLookupPerStreamContextInternal(streamcontext: Long, ownerid: Long, instanceid: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlMdlReadCompleteDev(fileobject: Long, mdlchain: Long, deviceobject: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlMdlReadDev(fileobject: Long, fileoffset: Long, length: Int, lockkey: Int, mdlchain: Long, iostatus: Long, deviceobject: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlMdlReadEx(fileobject: Long, fileoffset: Long, length: Int, lockkey: Int, mdlchain: Long, iostatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlMdlWriteCompleteDev(fileobject: Long, fileoffset: Long, mdlchain: Long, deviceobject: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlMupGetProviderIdFromName(pprovidername: Long, pproviderid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlMupGetProviderInfoFromFileObject(pfileobject: Long, level: Int, pbuffer: Long, pbuffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlNormalizeNtstatus(exception: Int, genericexception: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlNotifyCleanup(notifysync: Long, notifylist: Long, fscontext: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlNotifyCleanupAll(notifysync: Long, notifylist: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlNotifyFilterChangeDirectory(notifysync: Long, notifylist: Long, fscontext: Long, fulldirectoryname: Long, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: Int, notifyirp: Long, traversecallback: Long, subjectcontext: Long, filtercallback: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlNotifyFilterReportChange(notifysync: Long, notifylist: Long, fulltargetname: Long, targetnameoffset: Short, streamname: Long, normalizedparentname: Long, filtermatch: Int, action: Int, targetcontext: Long, filtercontext: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlNotifyFullChangeDirectory(notifysync: Long, notifylist: Long, fscontext: Long, fulldirectoryname: Long, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: Int, notifyirp: Long, traversecallback: Long, subjectcontext: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlNotifyFullReportChange(notifysync: Long, notifylist: Long, fulltargetname: Long, targetnameoffset: Short, streamname: Long, normalizedparentname: Long, filtermatch: Int, action: Int, targetcontext: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlNotifyInitializeSync(notifysync: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlNotifyUninitializeSync(notifysync: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlNotifyVolumeEvent(fileobject: Long, eventcode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlNotifyVolumeEventEx(fileobject: Long, eventcode: Int, event: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlNumberOfRunsInBaseMcb(mcb: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlNumberOfRunsInLargeMcb(mcb: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlNumberOfRunsInMcb(mcb: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlOplockBreakH(oplock: Long, irp: Long, flags: Int, context: Long, completionroutine: Long, postirproutine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlOplockBreakH2(oplock: Long, irp: Long, flags: Int, context: Long, completionroutine: Long, postirproutine: Long, grantedaccess: Long, shareaccess: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlOplockBreakToNone(oplock: Long, irpsp: Long, irp: Long, context: Long, completionroutine: Long, postirproutine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlOplockBreakToNoneEx(oplock: Long, irp: Long, flags: Int, context: Long, completionroutine: Long, postirproutine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlOplockFsctrl(oplock: Long, irp: Long, opencount: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlOplockFsctrlEx(oplock: Long, irp: Long, opencount: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlOplockGetAnyBreakOwnerProcess(oplock: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlOplockIsFastIoPossible(oplock: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlOplockIsSharedRequest(irp: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlOplockKeysEqual(fo1: Long, fo2: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlPostPagingFileStackOverflow(context: Long, event: Long, stackoverflowroutine: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlPostStackOverflow(context: Long, event: Long, stackoverflowroutine: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlPrepareMdlWriteDev(fileobject: Long, fileoffset: Long, length: Int, lockkey: Int, mdlchain: Long, iostatus: Long, deviceobject: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlPrepareMdlWriteEx(fileobject: Long, fileoffset: Long, length: Int, lockkey: Int, mdlchain: Long, iostatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlPrepareToReuseEcp(ecpcontext: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlPrivateLock(filelock: Long, fileobject: Long, fileoffset: Long, length: Long, processid: Long, key: Int, failimmediately: Boolean, exclusivelock: Boolean, iosb: Long, irp: Long, context: Long, alreadysynchronized: Boolean): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlProcessFileLock(filelock: Long, irp: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlQueryCachedVdl(fileobject: Long, vdl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlQueryInformationFile(fileobject: Long, fileinformation: Long, length: Int, fileinformationclass: Int, retfileinformationsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlQueryKernelEaFile(fileobject: Long, returnedeadata: Long, length: Int, returnsingleentry: Boolean, ealist: Long, ealistlength: Int, eaindex: Long, restartscan: Boolean, lengthreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlQueryMaximumVirtualDiskNestingLevel(): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlRegisterFileSystemFilterCallbacks(filterdriverobject: Long, callbacks: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlRegisterUncProvider(muphandle: Long, redirectordevicename: Long, mailslotssupported: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlRegisterUncProviderEx(muphandle: Long, redirdevname: Long, deviceobject: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlRegisterUncProviderEx2(redirdevname: Long, deviceobject: Long, registration: Long, muphandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlReleaseFile(fileobject: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlRemoveBaseMcbEntry(mcb: Long, vbn: Long, sectorcount: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlRemoveDotsFromPath(originalstring: Long, pathlength: Short, newlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlRemoveExtraCreateParameter(ecplist: Long, ecptype: Long, ecpcontext: Long, ecpcontextsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlRemoveLargeMcbEntry(mcb: Long, vbn: Long, sectorcount: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlRemoveMcbEntry(mcb: Long, vbn: Int, sectorcount: Int)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlRemovePerFileContext(perfilecontextpointer: Long, ownerid: Long, instanceid: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlRemovePerFileObjectContext(fileobject: Long, ownerid: Long, instanceid: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlRemovePerStreamContext(streamcontext: Long, ownerid: Long, instanceid: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlResetBaseMcb(mcb: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlResetLargeMcb(mcb: Long, selfsynchronized: Boolean)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlSetDriverBacking(driverobj: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlSetEcpListIntoIrp(irp: Long, ecplist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlSetKernelEaFile(fileobject: Long, eabuffer: Long, length: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlSplitBaseMcb(mcb: Long, vbn: Long, amount: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlSplitLargeMcb(mcb: Long, vbn: Long, amount: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlTeardownPerFileContexts(perfilecontextpointer: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlTeardownPerStreamContexts(advancedheader: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlTruncateBaseMcb(mcb: Long, vbn: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlTruncateLargeMcb(mcb: Long, vbn: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlTruncateMcb(mcb: Long, vbn: Int)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlUninitializeBaseMcb(mcb: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlUninitializeFileLock(filelock: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlUninitializeLargeMcb(mcb: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlUninitializeMcb(mcb: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlUninitializeOplock(oplock: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlUpdateDiskCounters(bytesread: Long, byteswritten: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlUpperOplockFsctrl(oplock: Long, irp: Long, opencount: Int, loweroplockstate: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlValidateReparsePointBuffer(bufferlength: Int, reparsebuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemFsRtlVolumeDeviceToCorrelationId(volumedeviceobject: Long, guid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemGetSecurityUserInfo(logonid: Long, flags: Int, userinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoAcquireVpbSpinLock(irql: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoApplyPriorityInfoThread(inputpriorityinfo: Long, outputpriorityinfo: Long, thread: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoCheckDesiredAccess(desiredaccess: Long, grantedaccess: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoCheckEaBufferValidity(eabuffer: Long, ealength: Int, erroroffset: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoCheckFunctionAccess(grantedaccess: Int, majorfunction: Byte, minorfunction: Byte, iocontrolcode: Int, arg1: Long, arg2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoCheckQuerySetFileInformation(fileinformationclass: Int, length: Int, setoperation: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoCheckQuerySetVolumeInformation(fsinformationclass: Int, length: Int, setoperation: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoCheckQuotaBufferValidity(quotabuffer: Long, quotalength: Int, erroroffset: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoClearFsTrackOffsetState(irp: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoCreateStreamFileObject(fileobject: Long, deviceobject: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoCreateStreamFileObjectEx(fileobject: Long, deviceobject: Long, filehandle: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoCreateStreamFileObjectEx2(createoptions: Long, fileobject: Long, deviceobject: Long, streamfileobject: Long, filehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoCreateStreamFileObjectLite(fileobject: Long, deviceobject: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoEnumerateDeviceObjectList(driverobject: Long, deviceobjectlist: Long, deviceobjectlistsize: Int, actualnumberdeviceobjects: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoEnumerateRegisteredFiltersList(driverobjectlist: Long, driverobjectlistsize: Int, actualnumberdriverobjects: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoFastQueryNetworkAttributes(objectattributes: Long, desiredaccess: Int, openoptions: Int, iostatus: Long, buffer: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoGetAttachedDevice(deviceobject: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoGetBaseFileSystemDeviceObject(fileobject: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoGetDeviceAttachmentBaseRef(deviceobject: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoGetDeviceToVerify(thread: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoGetDiskDeviceObject(filesystemdeviceobject: Long, diskdeviceobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoGetFsTrackOffsetState(irp: Long, retfstrackoffsetblob: Long, rettrackedoffset: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoGetLowerDeviceObject(deviceobject: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoGetOplockKeyContext(fileobject: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoGetOplockKeyContextEx(fileobject: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoGetRequestorProcess(irp: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoGetRequestorProcessId(irp: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoGetRequestorSessionId(irp: Long, psessionid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoIrpHasFsTrackOffsetExtensionType(irp: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoIsOperationSynchronous(irp: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoIsSystemThread(thread: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoIsValidNameGraftingBuffer(irp: Long, reparsebuffer: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoPageRead(fileobject: Long, memorydescriptorlist: Long, startingoffset: Long, event: Long, iostatusblock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoQueryFileDosDeviceName(fileobject: Long, objectnameinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoQueryFileInformation(fileobject: Long, fileinformationclass: Int, length: Int, fileinformation: Long, returnedlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoQueryVolumeInformation(fileobject: Long, fsinformationclass: Int, length: Int, fsinformation: Long, returnedlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoQueueThreadIrp(irp: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoRegisterFileSystem(deviceobject: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoReleaseVpbSpinLock(irql: Byte)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoReplaceFileObjectName(fileobject: Long, newfilename: Long, filenamelength: Short): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoRequestDeviceRemovalForReset(physicaldeviceobject: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoRetrievePriorityInfo(irp: Long, fileobject: Long, thread: Long, priorityinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoSetDeviceToVerify(thread: Long, deviceobject: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoSetFsTrackOffsetState(irp: Long, fstrackoffsetblob: Long, trackedoffset: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoSetInformation(fileobject: Long, fileinformationclass: Int, length: Int, fileinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoSynchronousPageWrite(fileobject: Long, memorydescriptorlist: Long, startingoffset: Long, event: Long, iostatusblock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoThreadToProcess(thread: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoUnregisterFileSystem(deviceobject: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemIoVerifyVolume(deviceobject: Long, allowrawmount: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemKeAcquireQueuedSpinLock(number: Int): Byte

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemKeAcquireSpinLockRaiseToSynch(spinlock: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemKeAttachProcess(process: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemKeDetachProcess()

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemKeInitializeMutant(mutant: Long, initialowner: Boolean)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemKeInitializeQueue(queue: Long, count: Int)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemKeInsertHeadQueue(queue: Long, entry: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemKeInsertQueue(queue: Long, entry: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemKeReadStateMutant(mutant: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemKeReadStateQueue(queue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemKeReleaseMutant(mutant: Long, increment: Int, abandoned: Boolean, wait: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemKeReleaseQueuedSpinLock(number: Int, oldirql: Byte)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemKeRemoveQueue(queue: Long, waitmode: Byte, timeout: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemKeRemoveQueueEx(queue: Long, waitmode: Byte, alertable: Boolean, timeout: Long, entryarray: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemKeRundownQueue(queue: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemKeSetIdealProcessorThread(thread: Long, processor: Byte): Byte

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemKeSetKernelStackSwapEnable(enable: Boolean): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemKeStackAttachProcess(process: Long, apcstate: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemKeTryToAcquireQueuedSpinLock(number: Int, oldirql: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemKeUnstackDetachProcess(apcstate: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMakeSignature(phcontext: Long, fqop: Int, pmessage: Long, messageseqno: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMapSecurityError(secstatus: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMmCanFileBeTruncated(sectionpointer: Long, newfilesize: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMmDoesFileHaveUserWritableReferences(sectionpointer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMmFlushImageSection(sectionobjectpointer: Long, flushtype: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMmForceSectionClosed(sectionobjectpointer: Long, delayclose: Boolean): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMmForceSectionClosedEx(sectionobjectpointer: Long, forcecloseflags: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMmGetMaximumFileSectionSize(): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMmIsFileSectionActive(fssectionpointer: Long, flags: Int, sectionisactive: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMmIsRecursiveIoFault(): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMmMdlPagesAreZero(mdl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMmPrefetchPages(numberoflists: Int, readlists: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMmSetAddressRangeModified(address: Long, length: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtAccessCheckAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, desiredaccess: Int, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtAccessCheckByTypeAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, principalselfsid: Long, desiredaccess: Int, audittype: Int, flags: Int, objecttypelist: Long, objecttypelistlength: Int, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtAccessCheckByTypeResultListAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, principalselfsid: Long, desiredaccess: Int, audittype: Int, flags: Int, objecttypelist: Long, objecttypelistlength: Int, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname: Long, handleid: Long, clienttoken: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, principalselfsid: Long, desiredaccess: Int, audittype: Int, flags: Int, objecttypelist: Long, objecttypelistlength: Int, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtAdjustGroupsToken(tokenhandle: Long, resettodefault: Boolean, newstate: Long, bufferlength: Int, previousstate: Long, returnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtAdjustPrivilegesToken(tokenhandle: Long, disableallprivileges: Boolean, newstate: Long, bufferlength: Int, previousstate: Long, returnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtAllocateVirtualMemory(processhandle: Long, baseaddress: Long, zerobits: Long, regionsize: Long, allocationtype: Int, protect: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtAllocateVirtualMemoryEx(processhandle: Long, baseaddress: Long, regionsize: Long, allocationtype: Int, pageprotection: Int, extendedparameters: Long, extendedparametercount: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtCancelIoFileEx(filehandle: Long, iorequesttocancel: Long, iostatusblock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtCloseObjectAuditAlarm(subsystemname: Long, handleid: Long, generateonclose: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtCreateDirectoryObject(directoryhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtCreateEvent(eventhandle: Long, desiredaccess: Int, objectattributes: Long, eventtype: Int, initialstate: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtCreateFile(filehandle: Long, desiredaccess: Int, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: Int, shareaccess: Int, createdisposition: Int, createoptions: Int, eabuffer: Long, ealength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtCreateSection(sectionhandle: Long, desiredaccess: Int, objectattributes: Long, maximumsize: Long, sectionpageprotection: Int, allocationattributes: Int, filehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtCreateSectionEx(sectionhandle: Long, desiredaccess: Int, objectattributes: Long, maximumsize: Long, sectionpageprotection: Int, allocationattributes: Int, filehandle: Long, extendedparameters: Long, extendedparametercount: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtDeleteFile(objectattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtDeleteObjectAuditAlarm(subsystemname: Long, handleid: Long, generateonclose: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtDuplicateObject(sourceprocesshandle: Long, sourcehandle: Long, targetprocesshandle: Long, targethandle: Long, desiredaccess: Int, handleattributes: Int, options: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtDuplicateToken(existingtokenhandle: Long, desiredaccess: Int, objectattributes: Long, effectiveonly: Boolean, tokentype: Int, newtokenhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtFilterToken(existingtokenhandle: Long, flags: Int, sidstodisable: Long, privilegestodelete: Long, restrictedsids: Long, newtokenhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtFlushBuffersFile(filehandle: Long, iostatusblock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtFlushBuffersFileEx(filehandle: Long, flags: Int, parameters: Long, parameterssize: Int, iostatusblock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtFlushVirtualMemory(processhandle: Long, baseaddress: Long, regionsize: Long, iostatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtFreeVirtualMemory(processhandle: Long, baseaddress: Long, regionsize: Long, freetype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtFsControlFile(filehandle: Long, event: Long, apcroutine: Long, apccontext: Long, iostatusblock: Long, fscontrolcode: Int, inputbuffer: Long, inputbufferlength: Int, outputbuffer: Long, outputbufferlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtImpersonateAnonymousToken(threadhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtLockFile(filehandle: Long, event: Long, apcroutine: Long, apccontext: Long, iostatusblock: Long, byteoffset: Long, length: Long, key: Int, failimmediately: Boolean, exclusivelock: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtNotifyChangeKey(keyhandle: Long, event: Long, apcroutine: Long, apccontext: Long, iostatusblock: Long, completionfilter: Int, watchtree: Boolean, buffer: Long, buffersize: Int, asynchronous: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtOpenDirectoryObject(directoryhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtOpenFile(filehandle: Long, desiredaccess: Int, objectattributes: Long, iostatusblock: Long, shareaccess: Int, openoptions: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtOpenObjectAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, clienttoken: Long, desiredaccess: Int, grantedaccess: Int, privileges: Long, objectcreation: Boolean, accessgranted: Boolean, generateonclose: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtOpenProcessToken(processhandle: Long, desiredaccess: Int, tokenhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtOpenProcessTokenEx(processhandle: Long, desiredaccess: Int, handleattributes: Int, tokenhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtOpenSymbolicLinkObject(linkhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtOpenThreadToken(threadhandle: Long, desiredaccess: Int, openasself: Boolean, tokenhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtOpenThreadTokenEx(threadhandle: Long, desiredaccess: Int, openasself: Boolean, handleattributes: Int, tokenhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtPrivilegeCheck(clienttoken: Long, requiredprivileges: Long, result: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtPrivilegeObjectAuditAlarm(subsystemname: Long, handleid: Long, clienttoken: Long, desiredaccess: Int, privileges: Long, accessgranted: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtPrivilegedServiceAuditAlarm(subsystemname: Long, servicename: Long, clienttoken: Long, privileges: Long, accessgranted: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtQueryDirectoryFile(filehandle: Long, event: Long, apcroutine: Long, apccontext: Long, iostatusblock: Long, fileinformation: Long, length: Int, fileinformationclass: Int, returnsingleentry: Boolean, filename: Long, restartscan: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtQueryDirectoryFileEx(filehandle: Long, event: Long, apcroutine: Long, apccontext: Long, iostatusblock: Long, fileinformation: Long, length: Int, fileinformationclass: Int, queryflags: Int, filename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtQueryDirectoryObject(directoryhandle: Long, buffer: Long, length: Int, returnsingleentry: Boolean, restartscan: Boolean, context: Long, returnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtQueryEaFile(filehandle: Long, iostatusblock: Long, buffer: Long, length: Int, returnsingleentry: Boolean, ealist: Long, ealistlength: Int, eaindex: Long, restartscan: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtQueryFullAttributesFile(objectattributes: Long, fileinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtQueryInformationByName(objectattributes: Long, iostatusblock: Long, fileinformation: Long, length: Int, fileinformationclass: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtQueryInformationFile(filehandle: Long, iostatusblock: Long, fileinformation: Long, length: Int, fileinformationclass: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtQueryInformationToken(tokenhandle: Long, tokeninformationclass: Int, tokeninformation: Long, tokeninformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtQueryQuotaInformationFile(filehandle: Long, iostatusblock: Long, buffer: Long, length: Int, returnsingleentry: Boolean, sidlist: Long, sidlistlength: Int, startsid: Long, restartscan: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtQuerySecurityObject(handle: Long, securityinformation: Int, securitydescriptor: Long, length: Int, lengthneeded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtQuerySymbolicLinkObject(linkhandle: Long, linktarget: Long, returnedlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtQueryVirtualMemory(processhandle: Long, baseaddress: Long, memoryinformationclass: Int, memoryinformation: Long, memoryinformationlength: Long, returnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtQueryVolumeInformationFile(filehandle: Long, iostatusblock: Long, fsinformation: Long, length: Int, fsinformationclass: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtReadFile(filehandle: Long, event: Long, apcroutine: Long, apccontext: Long, iostatusblock: Long, buffer: Long, length: Int, byteoffset: Long, key: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtSetEaFile(filehandle: Long, iostatusblock: Long, buffer: Long, length: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtSetEvent(eventhandle: Long, previousstate: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtSetInformationFile(filehandle: Long, iostatusblock: Long, fileinformation: Long, length: Int, fileinformationclass: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtSetInformationToken(tokenhandle: Long, tokeninformationclass: Int, tokeninformation: Long, tokeninformationlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtSetInformationVirtualMemory(processhandle: Long, vminformationclass: Int, numberofentries: Long, virtualaddresses: Long, vminformation: Long, vminformationlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtSetQuotaInformationFile(filehandle: Long, iostatusblock: Long, buffer: Long, length: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtSetSecurityObject(handle: Long, securityinformation: Int, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtSetVolumeInformationFile(filehandle: Long, iostatusblock: Long, fsinformation: Long, length: Int, fsinformationclass: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtUnlockFile(filehandle: Long, iostatusblock: Long, byteoffset: Long, length: Long, key: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemNtWriteFile(filehandle: Long, event: Long, apcroutine: Long, apccontext: Long, iostatusblock: Long, buffer: Long, length: Int, byteoffset: Long, key: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemObInsertObject(obj: Long, passedaccessstate: Long, desiredaccess: Int, objectpointerbias: Int, newobject: Long, handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemObIsKernelHandle(handle: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemObMakeTemporaryObject(obj: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemObOpenObjectByPointer(obj: Long, handleattributes: Int, passedaccessstate: Long, desiredaccess: Int, objecttype: Long, accessmode: Byte, handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemObOpenObjectByPointerWithTag(obj: Long, handleattributes: Int, passedaccessstate: Long, desiredaccess: Int, objecttype: Long, accessmode: Byte, tag: Int, handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemObQueryNameString(obj: Long, objectnameinfo: Long, length: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemObQueryObjectAuditingByHandle(handle: Long, generateonclose: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemPfxFindPrefix(prefixtable: Long, fullname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemPfxInitialize(prefixtable: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemPfxInsertPrefix(prefixtable: Long, prefix: Long, prefixtableentry: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemPfxRemovePrefix(prefixtable: Long, prefixtableentry: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemPoQueueShutdownWorkItem(workitem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemPsAssignImpersonationToken(thread: Long, token: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemPsChargePoolQuota(process: Long, pooltype: Int, amount: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemPsChargeProcessPoolQuota(process: Long, pooltype: Int, amount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemPsDereferenceImpersonationToken(impersonationtoken: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemPsDereferencePrimaryToken(primarytoken: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemPsDisableImpersonation(thread: Long, impersonationstate: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemPsGetProcessExitTime(): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemPsGetThreadProcess(thread: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemPsImpersonateClient(thread: Long, token: Long, copyonopen: Boolean, effectiveonly: Boolean, impersonationlevel: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemPsIsDiskCountersEnabled(): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemPsIsSystemThread(thread: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemPsIsThreadTerminating(thread: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemPsLookupProcessByProcessId(processid: Long, process: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemPsLookupThreadByThreadId(threadid: Long, thread: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemPsReferenceImpersonationToken(thread: Long, copyonopen: Long, effectiveonly: Long, impersonationlevel: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemPsReferencePrimaryToken(process: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemPsRestoreImpersonation(thread: Long, impersonationstate: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemPsReturnPoolQuota(process: Long, pooltype: Int, amount: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemPsRevertToSelf()

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemPsUpdateDiskCounters(process: Long, bytesread: Long, byteswritten: Long, readoperationcount: Int, writeoperationcount: Int, flushoperationcount: Int)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemQuerySecurityContextToken(phcontext: Long, token: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlAbsoluteToSelfRelativeSD(absolutesecuritydescriptor: Long, selfrelativesecuritydescriptor: Long, bufferlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlAddAccessAllowedAce(acl: Long, acerevision: Int, accessmask: Int, sid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlAddAccessAllowedAceEx(acl: Long, acerevision: Int, aceflags: Int, accessmask: Int, sid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlAddAce(acl: Long, acerevision: Int, startingaceindex: Int, acelist: Long, acelistlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlAllocateAndInitializeSid(identifierauthority: Long, subauthoritycount: Byte, subauthority0: Int, subauthority1: Int, subauthority2: Int, subauthority3: Int, subauthority4: Int, subauthority5: Int, subauthority6: Int, subauthority7: Int, sid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlAllocateAndInitializeSidEx(identifierauthority: Long, subauthoritycount: Byte, subauthorities: Long, sid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlAllocateHeap(heaphandle: Long, flags: Int, size: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlAppendStringToString(destination: Long, source: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlCompareAltitudes(altitude1: Long, altitude2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlCompareMemoryUlong(source: Long, length: Long, pattern: Int): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlCompressBuffer(compressionformatandengine: Short, uncompressedbuffer: Long, uncompressedbuffersize: Int, compressedbuffer: Long, compressedbuffersize: Int, uncompressedchunksize: Int, finalcompressedsize: Long, workspace: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlCompressChunks(uncompressedbuffer: Long, uncompressedbuffersize: Int, compressedbuffer: Long, compressedbuffersize: Int, compresseddatainfo: Long, compresseddatainfolength: Int, workspace: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlCopyLuid(destinationluid: Long, sourceluid: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlCopySid(destinationsidlength: Int, destinationsid: Long, sourcesid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlCreateAcl(acl: Long, acllength: Int, aclrevision: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlCreateHeap(flags: Int, heapbase: Long, reservesize: Long, commitsize: Long, lock: Long, parameters: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlCreateServiceSid(servicename: Long, servicesid: Long, servicesidlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlCreateSystemVolumeInformationFolder(volumerootpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlCreateUnicodeString(destinationstring: Long, sourcestring: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlCreateVirtualAccountSid(name: Long, basesubauthority: Int, sid: Long, sidlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlCustomCPToUnicodeN(customcp: Long, unicodestring: Long, maxbytesinunicodestring: Int, bytesinunicodestring: Long, customcpstring: Long, bytesincustomcpstring: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlDecompressBuffer(compressionformat: Short, uncompressedbuffer: Long, uncompressedbuffersize: Int, compressedbuffer: Long, compressedbuffersize: Int, finaluncompressedsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlDecompressBufferEx(compressionformat: Short, uncompressedbuffer: Long, uncompressedbuffersize: Int, compressedbuffer: Long, compressedbuffersize: Int, finaluncompressedsize: Long, workspace: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlDecompressBufferEx2(compressionformat: Short, uncompressedbuffer: Long, uncompressedbuffersize: Int, compressedbuffer: Long, compressedbuffersize: Int, uncompressedchunksize: Int, finaluncompressedsize: Long, workspace: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlDecompressChunks(uncompressedbuffer: Long, uncompressedbuffersize: Int, compressedbuffer: Long, compressedbuffersize: Int, compressedtail: Long, compressedtailsize: Int, compresseddatainfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlDecompressFragment(compressionformat: Short, uncompressedfragment: Long, uncompressedfragmentsize: Int, compressedbuffer: Long, compressedbuffersize: Int, fragmentoffset: Int, finaluncompressedsize: Long, workspace: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlDecompressFragmentEx(compressionformat: Short, uncompressedfragment: Long, uncompressedfragmentsize: Int, compressedbuffer: Long, compressedbuffersize: Int, fragmentoffset: Int, uncompressedchunksize: Int, finaluncompressedsize: Long, workspace: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlDeleteAce(acl: Long, aceindex: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlDescribeChunk(compressionformat: Short, compressedbuffer: Long, endofcompressedbufferplus1: Long, chunkbuffer: Long, chunksize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlDestroyHeap(heaphandle: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlDosPathNameToNtPathNameUWithStatus(dosfilename: Long, ntfilename: Long, filepart: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlDowncaseUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlDuplicateUnicodeString(flags: Int, stringin: Long, stringout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlEqualPrefixSid(sid1: Long, sid2: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlEqualSid(sid1: Long, sid2: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlFindUnicodePrefix(prefixtable: Long, fullname: Long, caseinsensitiveindex: Int): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlFreeHeap(heaphandle: Long, flags: Int, baseaddress: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlFreeSid(sid: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlGenerate8dot3Name(name: Long, allowextendedcharacters: Boolean, context: Long, name8dot3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlGetAce(acl: Long, aceindex: Int, ace: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlGetCompressionWorkSpaceSize(compressionformatandengine: Short, compressbufferworkspacesize: Long, compressfragmentworkspacesize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlGetDaclSecurityDescriptor(securitydescriptor: Long, daclpresent: Long, dacl: Long, dacldefaulted: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlGetGroupSecurityDescriptor(securitydescriptor: Long, group: Long, groupdefaulted: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlGetOwnerSecurityDescriptor(securitydescriptor: Long, owner: Long, ownerdefaulted: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlGetSaclSecurityDescriptor(securitydescriptor: Long, saclpresent: Long, sacl: Long, sacldefaulted: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlIdentifierAuthoritySid(sid: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlIdnToAscii(flags: Int, sourcestring: Long, sourcestringlength: Int, destinationstring: Long, destinationstringlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlIdnToNameprepUnicode(flags: Int, sourcestring: Long, sourcestringlength: Int, destinationstring: Long, destinationstringlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlIdnToUnicode(flags: Int, sourcestring: Long, sourcestringlength: Int, destinationstring: Long, destinationstringlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlInitCodePageTable(tablebase: Long, codepagetable: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlInitUnicodeStringEx(destinationstring: Long, sourcestring: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlInitializeSid(sid: Long, identifierauthority: Long, subauthoritycount: Byte): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlInitializeSidEx(sid: Long, identifierauthority: Long, subauthoritycount: Byte, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlInitializeUnicodePrefix(prefixtable: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlInsertUnicodePrefix(prefixtable: Long, prefix: Long, prefixtableentry: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlIsCloudFilesPlaceholder(fileattributes: Int, reparsetag: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlIsDosDeviceNameU(dosfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlIsNormalizedString(normform: Int, sourcestring: Long, sourcestringlength: Int, normalized: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlIsPartialPlaceholder(fileattributes: Int, reparsetag: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlIsPartialPlaceholderFileHandle(filehandle: Long, ispartialplaceholder: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlIsPartialPlaceholderFileInfo(infobuffer: Long, infoclass: Int, ispartialplaceholder: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlIsSandboxedToken(context: Long, previousmode: Byte): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlIsValidOemCharacter(char: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlLengthRequiredSid(subauthoritycount: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlLengthSid(sid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlMultiByteToUnicodeN(unicodestring: Long, maxbytesinunicodestring: Int, bytesinunicodestring: Long, multibytestring: Long, bytesinmultibytestring: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlMultiByteToUnicodeSize(bytesinunicodestring: Long, multibytestring: Long, bytesinmultibytestring: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlNextUnicodePrefix(prefixtable: Long, restart: Boolean): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlNormalizeString(normform: Int, sourcestring: Long, sourcestringlength: Int, destinationstring: Long, destinationstringlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlNtStatusToDosErrorNoTeb(status: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlOemStringToCountedUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlOemStringToUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlOemToUnicodeN(unicodestring: Long, maxbytesinunicodestring: Int, bytesinunicodestring: Long, oemstring: Long, bytesinoemstring: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlPrefixString(string1: Long, string2: Long, caseinsensitive: Boolean): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlQueryPackageIdentity(tokenobject: Long, packagefullname: Long, packagesize: Long, appid: Long, appidsize: Long, packaged: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlQueryPackageIdentityEx(tokenobject: Long, packagefullname: Long, packagesize: Long, appid: Long, appidsize: Long, dynamicid: Long, flags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlQueryProcessPlaceholderCompatibilityMode(): Byte

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlQueryThreadPlaceholderCompatibilityMode(): Byte

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlRandom(seed: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlRandomEx(seed: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlRemoveUnicodePrefix(prefixtable: Long, prefixtableentry: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlReplaceSidInSd(securitydescriptor: Long, oldsid: Long, newsid: Long, numchanges: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlReserveChunk(compressionformat: Short, compressedbuffer: Long, endofcompressedbufferplus1: Long, chunkbuffer: Long, chunksize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlSecondsSince1970ToTime(elapsedseconds: Int, time: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlSecondsSince1980ToTime(elapsedseconds: Int, time: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlSelfRelativeToAbsoluteSD(selfrelativesecuritydescriptor: Long, absolutesecuritydescriptor: Long, absolutesecuritydescriptorsize: Long, dacl: Long, daclsize: Long, sacl: Long, saclsize: Long, owner: Long, ownersize: Long, primarygroup: Long, primarygroupsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlSetGroupSecurityDescriptor(securitydescriptor: Long, group: Long, groupdefaulted: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlSetOwnerSecurityDescriptor(securitydescriptor: Long, owner: Long, ownerdefaulted: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlSetProcessPlaceholderCompatibilityMode(mode: Byte): Byte

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlSetThreadPlaceholderCompatibilityMode(mode: Byte): Byte

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlSubAuthorityCountSid(sid: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlSubAuthoritySid(sid: Long, subauthority: Int): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlTimeToSecondsSince1980(time: Long, elapsedseconds: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlUnicodeStringToCountedOemString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlUnicodeToCustomCPN(customcp: Long, customcpstring: Long, maxbytesincustomcpstring: Int, bytesincustomcpstring: Long, unicodestring: Long, bytesinunicodestring: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlUnicodeToMultiByteN(multibytestring: Long, maxbytesinmultibytestring: Int, bytesinmultibytestring: Long, unicodestring: Long, bytesinunicodestring: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlUnicodeToOemN(oemstring: Long, maxbytesinoemstring: Int, bytesinoemstring: Long, unicodestring: Long, bytesinunicodestring: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlUpcaseUnicodeStringToCountedOemString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlUpcaseUnicodeStringToOemString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlUpcaseUnicodeToCustomCPN(customcp: Long, customcpstring: Long, maxbytesincustomcpstring: Int, bytesincustomcpstring: Long, unicodestring: Long, bytesinunicodestring: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlUpcaseUnicodeToMultiByteN(multibytestring: Long, maxbytesinmultibytestring: Int, bytesinmultibytestring: Long, unicodestring: Long, bytesinunicodestring: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlUpcaseUnicodeToOemN(oemstring: Long, maxbytesinoemstring: Int, bytesinoemstring: Long, unicodestring: Long, bytesinunicodestring: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlValidSid(sid: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlValidateUnicodeString(flags: Int, string: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlxOemStringToUnicodeSize(oemstring: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemRtlxUnicodeStringToOemSize(unicodestring: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeAccessCheckFromState(securitydescriptor: Long, primarytokeninformation: Long, clienttokeninformation: Long, desiredaccess: Int, previouslygrantedaccess: Int, privileges: Long, genericmapping: Long, accessmode: Byte, grantedaccess: Long, accessstatus: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeAccessCheckFromStateEx(securitydescriptor: Long, primarytoken: Long, clienttoken: Long, desiredaccess: Int, previouslygrantedaccess: Int, privileges: Long, genericmapping: Long, accessmode: Byte, grantedaccess: Long, accessstatus: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeAdjustAccessStateForAccessConstraints(objecttype: Long, securitydescriptor: Long, accessstate: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeAdjustAccessStateForTrustLabel(objecttype: Long, securitydescriptor: Long, accessstate: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeAdjustObjectSecurity(objectname: Long, originaldescriptor: Long, proposeddescriptor: Long, subjectsecuritycontext: Long, adjusteddescriptor: Long, applyadjusteddescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeAppendPrivileges(accessstate: Long, privileges: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeAuditFipsCryptoSelftests(bsuccess: Boolean, selftestcode: Int)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeAuditHardLinkCreation(filename: Long, linkname: Long, bsuccess: Boolean)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeAuditHardLinkCreationWithTransaction(filename: Long, linkname: Long, bsuccess: Boolean, transactionid: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeAuditTransactionStateChange(transactionid: Long, resourcemanagerid: Long, newtransactionstate: Int)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeAuditingAnyFileEventsWithContext(securitydescriptor: Long, subjectsecuritycontext: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeAuditingAnyFileEventsWithContextEx(securitydescriptor: Long, subjectsecuritycontext: Long, stagingenabled: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeAuditingFileEvents(accessgranted: Boolean, securitydescriptor: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeAuditingFileEventsWithContext(accessgranted: Boolean, securitydescriptor: Long, subjectsecuritycontext: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeAuditingFileEventsWithContextEx(accessgranted: Boolean, securitydescriptor: Long, subjectsecuritycontext: Long, stagingenabled: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeAuditingFileOrGlobalEvents(accessgranted: Boolean, securitydescriptor: Long, subjectsecuritycontext: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeAuditingHardLinkEvents(accessgranted: Boolean, securitydescriptor: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeAuditingHardLinkEventsWithContext(accessgranted: Boolean, securitydescriptor: Long, subjectsecuritycontext: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeCaptureSubjectContextEx(thread: Long, process: Long, subjectcontext: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeCheckForCriticalAceRemoval(currentdescriptor: Long, newdescriptor: Long, subjectsecuritycontext: Long, aceremoved: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeCreateClientSecurity(clientthread: Long, clientsecurityqos: Long, remotesession: Boolean, clientcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeCreateClientSecurityFromSubjectContext(subjectcontext: Long, clientsecurityqos: Long, serverisremote: Boolean, clientcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeDeleteClientSecurity(clientcontext: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeDeleteObjectAuditAlarm(obj: Long, handle: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeDeleteObjectAuditAlarmWithTransaction(obj: Long, handle: Long, transactionid: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeExamineSacl(sacl: Long, resourcesacl: Long, token: Long, desiredaccess: Int, accessgranted: Boolean, generateaudit: Long, generatealarm: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeFilterToken(existingtoken: Long, flags: Int, sidstodisable: Long, privilegestodelete: Long, restrictedsids: Long, filteredtoken: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeFreePrivileges(privileges: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeImpersonateClient(clientcontext: Long, serverthread: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeImpersonateClientEx(clientcontext: Long, serverthread: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeLocateProcessImageName(process: Long, pimagefilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeMarkLogonSessionForTerminationNotification(logonid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeMarkLogonSessionForTerminationNotificationEx(logonid: Long, pserversilo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeOpenObjectAuditAlarm(objecttypename: Long, obj: Long, absoluteobjectname: Long, securitydescriptor: Long, accessstate: Long, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, generateonclose: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeOpenObjectAuditAlarmWithTransaction(objecttypename: Long, obj: Long, absoluteobjectname: Long, securitydescriptor: Long, accessstate: Long, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, transactionid: Long, generateonclose: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeOpenObjectForDeleteAuditAlarm(objecttypename: Long, obj: Long, absoluteobjectname: Long, securitydescriptor: Long, accessstate: Long, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, generateonclose: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeOpenObjectForDeleteAuditAlarmWithTransaction(objecttypename: Long, obj: Long, absoluteobjectname: Long, securitydescriptor: Long, accessstate: Long, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, transactionid: Long, generateonclose: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSePrivilegeCheck(requiredprivileges: Long, subjectsecuritycontext: Long, accessmode: Byte): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeQueryAuthenticationIdToken(token: Long, authenticationid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeQueryInformationToken(token: Long, tokeninformationclass: Int, tokeninformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeQuerySecurityDescriptorInfo(securityinformation: Long, securitydescriptor: Long, length: Long, objectssecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeQueryServerSiloToken(token: Long, pserversilo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeQuerySessionIdToken(token: Long, sessionid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeQuerySessionIdTokenEx(token: Long, sessionid: Long, isservicesession: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeRegisterLogonSessionTerminatedRoutine(callbackroutine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeRegisterLogonSessionTerminatedRoutineEx(callbackroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeReportSecurityEventWithSubCategory(flags: Int, sourcename: Long, usersid: Long, auditparameters: Long, auditsubcategoryid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeSetAccessStateGenericMapping(accessstate: Long, genericmapping: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeSetSecurityDescriptorInfo(obj: Long, securityinformation: Long, modificationdescriptor: Long, objectssecuritydescriptor: Long, pooltype: Int, genericmapping: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeSetSecurityDescriptorInfoEx(obj: Long, securityinformation: Long, modificationdescriptor: Long, objectssecuritydescriptor: Long, autoinheritflags: Int, pooltype: Int, genericmapping: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeShouldCheckForAccessRightsFromParent(objecttype: Long, childdescriptor: Long, accessstate: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeTokenFromAccessInformation(accessinformation: Long, token: Long, length: Int, requiredlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeTokenIsAdmin(token: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeTokenIsRestricted(token: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeTokenIsWriteRestricted(token: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeTokenType(token: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeUnregisterLogonSessionTerminatedRoutine(callbackroutine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSeUnregisterLogonSessionTerminatedRoutineEx(callbackroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSecLookupAccountName(name: Long, sidsize: Long, sid: Long, nameuse: Long, domainsize: Long, referenceddomain: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSecLookupAccountSid(sid: Long, namesize: Long, namebuffer: Long, domainsize: Long, domainbuffer: Long, nameuse: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSecLookupWellKnownSid(sidtype: Int, sid: Long, sidbuffersize: Int, sidsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSecMakeSPN(serviceclass: Long, servicename: Long, instancename: Long, instanceport: Short, referrer: Long, spn: Long, length: Long, allocate: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSecMakeSPNEx(serviceclass: Long, servicename: Long, instancename: Long, instanceport: Short, referrer: Long, targetinfo: Long, spn: Long, length: Long, allocate: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSecMakeSPNEx2(serviceclass: Long, servicename: Long, instancename: Long, instanceport: Short, referrer: Long, intargetinfo: Long, spn: Long, totalsize: Long, allocate: Boolean, istargetinfomarshaled: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSetContextAttributesW(phcontext: Long, ulattribute: Int, pbuffer: Long, cbbuffer: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSspiAcceptSecurityContextAsync(asynccontext: Long, phcredential: Long, phcontext: Long, pinput: Long, fcontextreq: Int, targetdatarep: Int, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSspiCreateAsyncContext(): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSspiDeleteSecurityContextAsync(asynccontext: Long, phcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSspiFreeAsyncContext(handle: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSspiFreeCredentialsHandleAsync(asynccontext: Long, phcredential: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSspiGetAsyncCallStatus(handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSspiInitializeSecurityContextAsyncA(asynccontext: Long, phcredential: Long, phcontext: Long, psztargetname: Long, fcontextreq: Int, reserved1: Int, targetdatarep: Int, pinput: Long, reserved2: Int, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSspiInitializeSecurityContextAsyncW(asynccontext: Long, phcredential: Long, phcontext: Long, psztargetname: Long, fcontextreq: Int, reserved1: Int, targetdatarep: Int, pinput: Long, reserved2: Int, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSspiReinitAsyncContext(handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemSspiSetAsyncNotifyCallback(context: Long, callback: Long, callbackdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemVerifySignature(phcontext: Long, pmessage: Long, messageseqno: Int, pfqop: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwAccessCheckAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, desiredaccess: Int, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwAccessCheckByTypeAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, principalselfsid: Long, desiredaccess: Int, audittype: Int, flags: Int, objecttypelist: Long, objecttypelistlength: Int, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwAccessCheckByTypeResultListAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, principalselfsid: Long, desiredaccess: Int, audittype: Int, flags: Int, objecttypelist: Long, objecttypelistlength: Int, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname: Long, handleid: Long, clienttoken: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, principalselfsid: Long, desiredaccess: Int, audittype: Int, flags: Int, objecttypelist: Long, objecttypelistlength: Int, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwAdjustGroupsToken(tokenhandle: Long, resettodefault: Boolean, newstate: Long, bufferlength: Int, previousstate: Long, returnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwAdjustPrivilegesToken(tokenhandle: Long, disableallprivileges: Boolean, newstate: Long, bufferlength: Int, previousstate: Long, returnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwAllocateVirtualMemory(processhandle: Long, baseaddress: Long, zerobits: Long, regionsize: Long, allocationtype: Int, protect: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwAllocateVirtualMemoryEx(processhandle: Long, baseaddress: Long, regionsize: Long, allocationtype: Int, pageprotection: Int, extendedparameters: Long, extendedparametercount: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwCancelIoFileEx(filehandle: Long, iorequesttocancel: Long, iostatusblock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwCloseObjectAuditAlarm(subsystemname: Long, handleid: Long, generateonclose: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwCreateDirectoryObject(directoryhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwCreateEvent(eventhandle: Long, desiredaccess: Int, objectattributes: Long, eventtype: Int, initialstate: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwCreateSectionEx(sectionhandle: Long, desiredaccess: Int, objectattributes: Long, maximumsize: Long, sectionpageprotection: Int, allocationattributes: Int, filehandle: Long, extendedparameters: Long, extendedparametercount: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwDeleteFile(objectattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwDeleteObjectAuditAlarm(subsystemname: Long, handleid: Long, generateonclose: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwDuplicateObject(sourceprocesshandle: Long, sourcehandle: Long, targetprocesshandle: Long, targethandle: Long, desiredaccess: Int, handleattributes: Int, options: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwDuplicateToken(existingtokenhandle: Long, desiredaccess: Int, objectattributes: Long, effectiveonly: Boolean, tokentype: Int, newtokenhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwFilterToken(existingtokenhandle: Long, flags: Int, sidstodisable: Long, privilegestodelete: Long, restrictedsids: Long, newtokenhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwFlushBuffersFile(filehandle: Long, iostatusblock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwFlushBuffersFileEx(filehandle: Long, flags: Int, parameters: Long, parameterssize: Int, iostatusblock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwFlushVirtualMemory(processhandle: Long, baseaddress: Long, regionsize: Long, iostatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwFreeVirtualMemory(processhandle: Long, baseaddress: Long, regionsize: Long, freetype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwFsControlFile(filehandle: Long, event: Long, apcroutine: Long, apccontext: Long, iostatusblock: Long, fscontrolcode: Int, inputbuffer: Long, inputbufferlength: Int, outputbuffer: Long, outputbufferlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwImpersonateAnonymousToken(threadhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwLockFile(filehandle: Long, event: Long, apcroutine: Long, apccontext: Long, iostatusblock: Long, byteoffset: Long, length: Long, key: Int, failimmediately: Boolean, exclusivelock: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwNotifyChangeKey(keyhandle: Long, event: Long, apcroutine: Long, apccontext: Long, iostatusblock: Long, completionfilter: Int, watchtree: Boolean, buffer: Long, buffersize: Int, asynchronous: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwOpenDirectoryObject(directoryhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwOpenObjectAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Long, clienttoken: Long, desiredaccess: Int, grantedaccess: Int, privileges: Long, objectcreation: Boolean, accessgranted: Boolean, generateonclose: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwOpenProcessToken(processhandle: Long, desiredaccess: Int, tokenhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwOpenProcessTokenEx(processhandle: Long, desiredaccess: Int, handleattributes: Int, tokenhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwOpenThreadToken(threadhandle: Long, desiredaccess: Int, openasself: Boolean, tokenhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwOpenThreadTokenEx(threadhandle: Long, desiredaccess: Int, openasself: Boolean, handleattributes: Int, tokenhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwPrivilegeCheck(clienttoken: Long, requiredprivileges: Long, result: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwPrivilegeObjectAuditAlarm(subsystemname: Long, handleid: Long, clienttoken: Long, desiredaccess: Int, privileges: Long, accessgranted: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwPrivilegedServiceAuditAlarm(subsystemname: Long, servicename: Long, clienttoken: Long, privileges: Long, accessgranted: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwQueryDirectoryFile(filehandle: Long, event: Long, apcroutine: Long, apccontext: Long, iostatusblock: Long, fileinformation: Long, length: Int, fileinformationclass: Int, returnsingleentry: Boolean, filename: Long, restartscan: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwQueryDirectoryFileEx(filehandle: Long, event: Long, apcroutine: Long, apccontext: Long, iostatusblock: Long, fileinformation: Long, length: Int, fileinformationclass: Int, queryflags: Int, filename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwQueryDirectoryObject(directoryhandle: Long, buffer: Long, length: Int, returnsingleentry: Boolean, restartscan: Boolean, context: Long, returnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwQueryEaFile(filehandle: Long, iostatusblock: Long, buffer: Long, length: Int, returnsingleentry: Boolean, ealist: Long, ealistlength: Int, eaindex: Long, restartscan: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwQueryFullAttributesFile(objectattributes: Long, fileinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwQueryInformationToken(tokenhandle: Long, tokeninformationclass: Int, tokeninformation: Long, tokeninformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwQueryObject(handle: Long, objectinformationclass: Int, objectinformation: Long, objectinformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwQueryQuotaInformationFile(filehandle: Long, iostatusblock: Long, buffer: Long, length: Int, returnsingleentry: Boolean, sidlist: Long, sidlistlength: Int, startsid: Long, restartscan: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwQuerySecurityObject(handle: Long, securityinformation: Int, securitydescriptor: Long, length: Int, lengthneeded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwQueryVirtualMemory(processhandle: Long, baseaddress: Long, memoryinformationclass: Int, memoryinformation: Long, memoryinformationlength: Long, returnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwQueryVolumeInformationFile(filehandle: Long, iostatusblock: Long, fsinformation: Long, length: Int, fsinformationclass: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwSetEaFile(filehandle: Long, iostatusblock: Long, buffer: Long, length: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwSetEvent(eventhandle: Long, previousstate: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwSetInformationToken(tokenhandle: Long, tokeninformationclass: Int, tokeninformation: Long, tokeninformationlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwSetInformationVirtualMemory(processhandle: Long, vminformationclass: Int, numberofentries: Long, virtualaddresses: Long, vminformation: Long, vminformationlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwSetQuotaInformationFile(filehandle: Long, iostatusblock: Long, buffer: Long, length: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwSetSecurityObject(handle: Long, securityinformation: Int, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwSetVolumeInformationFile(filehandle: Long, iostatusblock: Long, fsinformation: Long, length: Int, fsinformationclass: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemZwUnlockFile(filehandle: Long, iostatusblock: Long, byteoffset: Long, length: Long, key: Int): Int
}

public actual fun applyControlToken(phcontext: ConstPtr, pinput: ConstPtr): Hresult =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemApplyControlToken(phcontext.rawAddress, pinput.rawAddress)

public actual fun ccAsyncCopyRead(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, wait: Boolean, buffer: MutPtr, iostatus: MutPtr, ioissuerthread: Pethread, asyncreadcontext: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcAsyncCopyRead(fileobject.rawAddress, fileoffset.rawAddress, length.toInt(), wait, buffer.rawAddress, iostatus.rawAddress, ioissuerthread, asyncreadcontext.rawAddress)

public actual fun ccCanIWrite(fileobject: ConstPtr, bytestowrite: UInt, wait: Boolean, retrying: UByte): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcCanIWrite(fileobject.rawAddress, bytestowrite.toInt(), wait, retrying.toByte())

public actual fun ccCoherencyFlushAndPurgeCache(sectionobjectpointer: ConstPtr, fileoffset: ConstPtr, length: UInt, iostatus: MutPtr, flags: UInt) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcCoherencyFlushAndPurgeCache(sectionobjectpointer.rawAddress, fileoffset.rawAddress, length.toInt(), iostatus.rawAddress, flags.toInt())
}

public actual fun ccCopyRead(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, wait: Boolean, buffer: MutPtr, iostatus: MutPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcCopyRead(fileobject.rawAddress, fileoffset.rawAddress, length.toInt(), wait, buffer.rawAddress, iostatus.rawAddress)

public actual fun ccCopyReadEx(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, wait: Boolean, buffer: MutPtr, iostatus: MutPtr, ioissuerthread: Pethread): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcCopyReadEx(fileobject.rawAddress, fileoffset.rawAddress, length.toInt(), wait, buffer.rawAddress, iostatus.rawAddress, ioissuerthread)

public actual fun ccCopyWrite(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, wait: Boolean, buffer: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcCopyWrite(fileobject.rawAddress, fileoffset.rawAddress, length.toInt(), wait, buffer.rawAddress)

public actual fun ccCopyWriteEx(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, wait: Boolean, buffer: ConstPtr, ioissuerthread: Pethread): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcCopyWriteEx(fileobject.rawAddress, fileoffset.rawAddress, length.toInt(), wait, buffer.rawAddress, ioissuerthread)

public actual fun ccCopyWriteWontFlush(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcCopyWriteWontFlush(fileobject.rawAddress, fileoffset.rawAddress, length.toInt())

public actual fun ccDeferWrite(fileobject: ConstPtr, postroutine: PccPostDeferredWrite, context1: ConstPtr, context2: ConstPtr, bytestowrite: UInt, retrying: Boolean) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcDeferWrite(fileobject.rawAddress, 0L, context1.rawAddress, context2.rawAddress, bytestowrite.toInt(), retrying)
}

public actual fun ccErrorCallbackRoutine(context: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcErrorCallbackRoutine(context.rawAddress)

public actual fun ccFastCopyRead(fileobject: ConstPtr, fileoffset: UInt, length: UInt, pagecount: UInt, buffer: MutPtr, iostatus: MutPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcFastCopyRead(fileobject.rawAddress, fileoffset.toInt(), length.toInt(), pagecount.toInt(), buffer.rawAddress, iostatus.rawAddress)
}

public actual fun ccFastCopyWrite(fileobject: ConstPtr, fileoffset: UInt, length: UInt, buffer: ConstPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcFastCopyWrite(fileobject.rawAddress, fileoffset.toInt(), length.toInt(), buffer.rawAddress)
}

public actual fun ccFlushCache(sectionobjectpointer: ConstPtr, fileoffset: ConstPtr, length: UInt, iostatus: MutPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcFlushCache(sectionobjectpointer.rawAddress, fileoffset.rawAddress, length.toInt(), iostatus.rawAddress)
}

public actual fun ccGetDirtyPages(loghandle: ConstPtr, dirtypageroutine: PdirtyPageRoutine, context1: ConstPtr, context2: ConstPtr): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcGetDirtyPages(loghandle.rawAddress, 0L, context1.rawAddress, context2.rawAddress)

public actual fun ccGetFileObjectFromBcb(bcb: ConstPtr): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcGetFileObjectFromBcb(bcb.rawAddress))

public actual fun ccGetFileObjectFromSectionPtrs(sectionobjectpointer: ConstPtr): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcGetFileObjectFromSectionPtrs(sectionobjectpointer.rawAddress))

public actual fun ccGetFileObjectFromSectionPtrsRef(sectionobjectpointer: ConstPtr): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcGetFileObjectFromSectionPtrsRef(sectionobjectpointer.rawAddress))

public actual fun ccGetFlushedValidData(sectionobjectpointer: ConstPtr, bcblistheld: Boolean): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcGetFlushedValidData(sectionobjectpointer.rawAddress, bcblistheld)

public actual fun ccInitializeCacheMap(fileobject: ConstPtr, filesizes: ConstPtr, pinaccess: Boolean, callbacks: ConstPtr, lazywritecontext: ConstPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcInitializeCacheMap(fileobject.rawAddress, filesizes.rawAddress, pinaccess, callbacks.rawAddress, lazywritecontext.rawAddress)
}

public actual fun ccInitializeCacheMapEx(fileobject: ConstPtr, filesizes: ConstPtr, pinaccess: Boolean, callbacks: ConstPtr, lazywritecontext: ConstPtr, flags: UInt) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcInitializeCacheMapEx(fileobject.rawAddress, filesizes.rawAddress, pinaccess, callbacks.rawAddress, lazywritecontext.rawAddress, flags.toInt())
}

public actual fun ccIsCacheManagerCallbackNeeded(status: Ntstatus): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcIsCacheManagerCallbackNeeded(status)

public actual fun ccIsThereDirtyData(vpb: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcIsThereDirtyData(vpb.rawAddress)

public actual fun ccIsThereDirtyDataEx(vpb: ConstPtr, numberofdirtypages: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcIsThereDirtyDataEx(vpb.rawAddress, numberofdirtypages.rawAddress)

public actual fun ccMapData(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, flags: UInt, bcb: MutPtr, buffer: MutPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcMapData(fileobject.rawAddress, fileoffset.rawAddress, length.toInt(), flags.toInt(), bcb.rawAddress, buffer.rawAddress)

public actual fun ccMdlRead(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, mdlchain: MutPtr, iostatus: MutPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcMdlRead(fileobject.rawAddress, fileoffset.rawAddress, length.toInt(), mdlchain.rawAddress, iostatus.rawAddress)
}

public actual fun ccMdlReadComplete(fileobject: ConstPtr, mdlchain: ConstPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcMdlReadComplete(fileobject.rawAddress, mdlchain.rawAddress)
}

public actual fun ccMdlWriteAbort(fileobject: ConstPtr, mdlchain: ConstPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcMdlWriteAbort(fileobject.rawAddress, mdlchain.rawAddress)
}

public actual fun ccMdlWriteComplete(fileobject: ConstPtr, fileoffset: ConstPtr, mdlchain: ConstPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcMdlWriteComplete(fileobject.rawAddress, fileoffset.rawAddress, mdlchain.rawAddress)
}

public actual fun ccPinMappedData(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, flags: UInt, bcb: MutPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcPinMappedData(fileobject.rawAddress, fileoffset.rawAddress, length.toInt(), flags.toInt(), bcb.rawAddress)

public actual fun ccPinRead(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, flags: UInt, bcb: MutPtr, buffer: MutPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcPinRead(fileobject.rawAddress, fileoffset.rawAddress, length.toInt(), flags.toInt(), bcb.rawAddress, buffer.rawAddress)

public actual fun ccPrepareMdlWrite(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, mdlchain: MutPtr, iostatus: MutPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcPrepareMdlWrite(fileobject.rawAddress, fileoffset.rawAddress, length.toInt(), mdlchain.rawAddress, iostatus.rawAddress)
}

public actual fun ccPreparePinWrite(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, zero: Boolean, flags: UInt, bcb: MutPtr, buffer: MutPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcPreparePinWrite(fileobject.rawAddress, fileoffset.rawAddress, length.toInt(), zero, flags.toInt(), bcb.rawAddress, buffer.rawAddress)

public actual fun ccPurgeCacheSection(sectionobjectpointer: ConstPtr, fileoffset: ConstPtr, length: UInt, flags: UInt): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcPurgeCacheSection(sectionobjectpointer.rawAddress, fileoffset.rawAddress, length.toInt(), flags.toInt())

public actual fun ccRemapBcb(bcb: ConstPtr): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcRemapBcb(bcb.rawAddress))

public actual fun ccRepinBcb(bcb: ConstPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcRepinBcb(bcb.rawAddress)
}

public actual fun ccScheduleReadAhead(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcScheduleReadAhead(fileobject.rawAddress, fileoffset.rawAddress, length.toInt())
}

public actual fun ccScheduleReadAheadEx(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, ioissuerthread: Pethread) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcScheduleReadAheadEx(fileobject.rawAddress, fileoffset.rawAddress, length.toInt(), ioissuerthread)
}

public actual fun ccSetAdditionalCacheAttributes(fileobject: ConstPtr, disablereadahead: Boolean, disablewritebehind: Boolean) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcSetAdditionalCacheAttributes(fileobject.rawAddress, disablereadahead, disablewritebehind)
}

public actual fun ccSetAdditionalCacheAttributesEx(fileobject: ConstPtr, flags: UInt) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcSetAdditionalCacheAttributesEx(fileobject.rawAddress, flags.toInt())
}

public actual fun ccSetBcbOwnerPointer(bcb: ConstPtr, ownerpointer: ConstPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcSetBcbOwnerPointer(bcb.rawAddress, ownerpointer.rawAddress)
}

public actual fun ccSetDirtyPageThreshold(fileobject: ConstPtr, dirtypagethreshold: UInt) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcSetDirtyPageThreshold(fileobject.rawAddress, dirtypagethreshold.toInt())
}

public actual fun ccSetDirtyPinnedData(bcbvoid: ConstPtr, lsn: ConstPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcSetDirtyPinnedData(bcbvoid.rawAddress, lsn.rawAddress)
}

public actual fun ccSetFileSizes(fileobject: ConstPtr, filesizes: ConstPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcSetFileSizes(fileobject.rawAddress, filesizes.rawAddress)
}

public actual fun ccSetFileSizesEx(fileobject: ConstPtr, filesizes: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcSetFileSizesEx(fileobject.rawAddress, filesizes.rawAddress)

public actual fun ccSetLogHandleForFile(fileobject: ConstPtr, loghandle: ConstPtr, flushtolsnroutine: PflushToLsn) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcSetLogHandleForFile(fileobject.rawAddress, loghandle.rawAddress, 0L)
}

public actual fun ccSetParallelFlushFile(fileobject: ConstPtr, enableparallelflush: Boolean) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcSetParallelFlushFile(fileobject.rawAddress, enableparallelflush)
}

public actual fun ccSetReadAheadGranularity(fileobject: ConstPtr, granularity: UInt) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcSetReadAheadGranularity(fileobject.rawAddress, granularity.toInt())
}

public actual fun ccUninitializeCacheMap(fileobject: ConstPtr, truncatesize: ConstPtr, uninitializeevent: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcUninitializeCacheMap(fileobject.rawAddress, truncatesize.rawAddress, uninitializeevent.rawAddress)

public actual fun ccUnpinData(bcb: ConstPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcUnpinData(bcb.rawAddress)
}

public actual fun ccUnpinDataForThread(bcb: ConstPtr, resourcethreadid: ULong) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcUnpinDataForThread(bcb.rawAddress, resourcethreadid.toLong())
}

public actual fun ccUnpinRepinnedBcb(bcb: ConstPtr, writethrough: Boolean, iostatus: MutPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcUnpinRepinnedBcb(bcb.rawAddress, writethrough, iostatus.rawAddress)
}

public actual fun ccWaitForCurrentLazyWriterActivity(): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcWaitForCurrentLazyWriterActivity()

public actual fun ccZeroData(fileobject: ConstPtr, startoffset: ConstPtr, endoffset: ConstPtr, wait: Boolean): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCcZeroData(fileobject.rawAddress, startoffset.rawAddress, endoffset.rawAddress, wait)

public actual fun completeAuthToken(phcontext: ConstPtr, ptoken: ConstPtr): Hresult =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemCompleteAuthToken(phcontext.rawAddress, ptoken.rawAddress)

public actual fun exDisableResourceBoostLite(resource: ConstPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemExDisableResourceBoostLite(resource.rawAddress)
}

public actual fun exQueryPoolBlockSize(poolblock: ConstPtr, quotacharged: MutPtr): ULong =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemExQueryPoolBlockSize(poolblock.rawAddress, quotacharged.rawAddress).toULong()

public actual fun exportSecurityContext(phcontext: ConstPtr, fflags: UInt, ppackedcontext: MutPtr, ptoken: MutPtr): Hresult =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemExportSecurityContext(phcontext.rawAddress, fflags.toInt(), ppackedcontext.rawAddress, ptoken.rawAddress)

public actual fun fsRtlAcknowledgeEcp(ecpcontext: ConstPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlAcknowledgeEcp(ecpcontext.rawAddress)
}

public actual fun fsRtlAcquireFileExclusive(fileobject: ConstPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlAcquireFileExclusive(fileobject.rawAddress)
}

public actual fun fsRtlAddBaseMcbEntry(mcb: MutPtr, vbn: Long, lbn: Long, sectorcount: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlAddBaseMcbEntry(mcb.rawAddress, vbn, lbn, sectorcount)

public actual fun fsRtlAddBaseMcbEntryEx(mcb: MutPtr, vbn: Long, lbn: Long, sectorcount: Long): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlAddBaseMcbEntryEx(mcb.rawAddress, vbn, lbn, sectorcount)

public actual fun fsRtlAddLargeMcbEntry(mcb: MutPtr, vbn: Long, lbn: Long, sectorcount: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlAddLargeMcbEntry(mcb.rawAddress, vbn, lbn, sectorcount)

public actual fun fsRtlAddMcbEntry(mcb: MutPtr, vbn: UInt, lbn: UInt, sectorcount: UInt): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlAddMcbEntry(mcb.rawAddress, vbn.toInt(), lbn.toInt(), sectorcount.toInt())

public actual fun fsRtlAddToTunnelCache(cache: MutPtr, directorykey: ULong, shortname: ConstPtr, longname: ConstPtr, keybyshortname: Boolean, datalength: UInt, data: ConstPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlAddToTunnelCache(cache.rawAddress, directorykey.toLong(), shortname.rawAddress, longname.rawAddress, keybyshortname, datalength.toInt(), data.rawAddress)
}

public actual fun fsRtlAddToTunnelCacheEx(cache: MutPtr, directorykey: ULong, shortname: ConstPtr, longname: ConstPtr, flags: UInt, datalength: UInt, data: ConstPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlAddToTunnelCacheEx(cache.rawAddress, directorykey.toLong(), shortname.rawAddress, longname.rawAddress, flags.toInt(), datalength.toInt(), data.rawAddress)
}

public actual fun fsRtlAllocateAePushLock(pooltype: PoolType, tag: UInt): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlAllocateAePushLock(pooltype, tag.toInt()))

public actual fun fsRtlAllocateExtraCreateParameter(ecptype: ConstPtr, sizeofcontext: UInt, flags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, pooltag: UInt, ecpcontext: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlAllocateExtraCreateParameter(ecptype.rawAddress, sizeofcontext.toInt(), flags.toInt(), 0L, pooltag.toInt(), ecpcontext.rawAddress)

public actual fun fsRtlAllocateExtraCreateParameterFromLookasideList(ecptype: ConstPtr, sizeofcontext: UInt, flags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, lookasidelist: MutPtr, ecpcontext: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlAllocateExtraCreateParameterFromLookasideList(ecptype.rawAddress, sizeofcontext.toInt(), flags.toInt(), 0L, lookasidelist.rawAddress, ecpcontext.rawAddress)

public actual fun fsRtlAllocateExtraCreateParameterList(flags: UInt, ecplist: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlAllocateExtraCreateParameterList(flags.toInt(), ecplist.rawAddress)

public actual fun fsRtlAllocateFileLock(completelockirproutine: PcompleteLockIrpRoutine, unlockroutine: PunlockRoutine): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlAllocateFileLock(0L, 0L))

public actual fun fsRtlAllocateResource(): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlAllocateResource())

public actual fun fsRtlAreNamesEqual(constantnamea: ConstPtr, constantnameb: ConstPtr, ignorecase: Boolean, upcasetable: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlAreNamesEqual(constantnamea.rawAddress, constantnameb.rawAddress, ignorecase, upcasetable.rawAddress)

public actual fun fsRtlAreThereCurrentOrInProgressFileLocks(filelock: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlAreThereCurrentOrInProgressFileLocks(filelock.rawAddress)

public actual fun fsRtlAreThereWaitingFileLocks(filelock: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlAreThereWaitingFileLocks(filelock.rawAddress)

public actual fun fsRtlAreVolumeStartupApplicationsComplete(): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlAreVolumeStartupApplicationsComplete()

public actual fun fsRtlBalanceReads(targetdevice: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlBalanceReads(targetdevice.rawAddress)

public actual fun fsRtlCancellableWaitForMultipleObjects(count: UInt, objectarray: ConstPtr, waittype: WaitType, timeout: ConstPtr, waitblockarray: ConstPtr, irp: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlCancellableWaitForMultipleObjects(count.toInt(), objectarray.rawAddress, waittype, timeout.rawAddress, waitblockarray.rawAddress, irp.rawAddress)

public actual fun fsRtlCancellableWaitForSingleObject(obj: ConstPtr, timeout: ConstPtr, irp: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlCancellableWaitForSingleObject(obj.rawAddress, timeout.rawAddress, irp.rawAddress)

public actual fun fsRtlChangeBackingFileObject(currentfileobject: ConstPtr, newfileobject: ConstPtr, changebackingtype: FsrtlChangeBackingType, flags: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlChangeBackingFileObject(currentfileobject.rawAddress, newfileobject.rawAddress, changebackingtype, flags.toInt())

public actual fun fsRtlCheckLockForOplockRequest(filelock: ConstPtr, allocationsize: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlCheckLockForOplockRequest(filelock.rawAddress, allocationsize.rawAddress)

public actual fun fsRtlCheckLockForReadAccess(filelock: ConstPtr, irp: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlCheckLockForReadAccess(filelock.rawAddress, irp.rawAddress)

public actual fun fsRtlCheckLockForWriteAccess(filelock: ConstPtr, irp: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlCheckLockForWriteAccess(filelock.rawAddress, irp.rawAddress)

public actual fun fsRtlCheckOplock(oplock: ConstPtr, irp: ConstPtr, context: ConstPtr, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlCheckOplock(oplock.rawAddress, irp.rawAddress, context.rawAddress, 0L, 0L)

public actual fun fsRtlCheckOplockEx(oplock: ConstPtr, irp: ConstPtr, flags: UInt, context: ConstPtr, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlCheckOplockEx(oplock.rawAddress, irp.rawAddress, flags.toInt(), context.rawAddress, 0L, 0L)

public actual fun fsRtlCheckOplockEx2(oplock: ConstPtr, irp: ConstPtr, flags: UInt, flagsex2: UInt, completionroutinecontext: ConstPtr, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp, timeout: ULong, notifycontext: ConstPtr, notifyroutine: PoplockNotifyRoutine): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlCheckOplockEx2(oplock.rawAddress, irp.rawAddress, flags.toInt(), flagsex2.toInt(), completionroutinecontext.rawAddress, 0L, 0L, timeout.toLong(), notifycontext.rawAddress, 0L)

public actual fun fsRtlCheckUpperOplock(oplock: ConstPtr, newloweroplockstate: UInt, completionroutinecontext: ConstPtr, completionroutine: PoplockWaitCompleteRoutine, prependroutine: PoplockFsPrepostIrp, flags: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlCheckUpperOplock(oplock.rawAddress, newloweroplockstate.toInt(), completionroutinecontext.rawAddress, 0L, 0L, flags.toInt())

public actual fun fsRtlCopyRead(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, wait: Boolean, lockkey: UInt, buffer: MutPtr, iostatus: MutPtr, deviceobject: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlCopyRead(fileobject.rawAddress, fileoffset.rawAddress, length.toInt(), wait, lockkey.toInt(), buffer.rawAddress, iostatus.rawAddress, deviceobject.rawAddress)

public actual fun fsRtlCopyWrite(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, wait: Boolean, lockkey: UInt, buffer: ConstPtr, iostatus: MutPtr, deviceobject: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlCopyWrite(fileobject.rawAddress, fileoffset.rawAddress, length.toInt(), wait, lockkey.toInt(), buffer.rawAddress, iostatus.rawAddress, deviceobject.rawAddress)

public actual fun fsRtlCreateSectionForDataScan(sectionhandle: MutPtr, sectionobject: MutPtr, sectionfilesize: MutPtr, fileobject: ConstPtr, desiredaccess: UInt, objectattributes: ConstPtr, maximumsize: ConstPtr, sectionpageprotection: UInt, allocationattributes: UInt, flags: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlCreateSectionForDataScan(sectionhandle.rawAddress, sectionobject.rawAddress, sectionfilesize.rawAddress, fileobject.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, maximumsize.rawAddress, sectionpageprotection.toInt(), allocationattributes.toInt(), flags.toInt())

public actual fun fsRtlCurrentBatchOplock(oplock: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlCurrentBatchOplock(oplock.rawAddress)

public actual fun fsRtlCurrentOplock(oplock: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlCurrentOplock(oplock.rawAddress)

public actual fun fsRtlCurrentOplockH(oplock: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlCurrentOplockH(oplock.rawAddress)

public actual fun fsRtlDeleteExtraCreateParameterLookasideList(lookaside: MutPtr, flags: UInt) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlDeleteExtraCreateParameterLookasideList(lookaside.rawAddress, flags.toInt())
}

public actual fun fsRtlDeleteKeyFromTunnelCache(cache: MutPtr, directorykey: ULong) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlDeleteKeyFromTunnelCache(cache.rawAddress, directorykey.toLong())
}

public actual fun fsRtlDeleteTunnelCache(cache: MutPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlDeleteTunnelCache(cache.rawAddress)
}

public actual fun fsRtlDeregisterUncProvider(handle: Handle) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlDeregisterUncProvider(handle.rawAddress)
}

public actual fun fsRtlDismountComplete(deviceobject: ConstPtr, dismountstatus: Ntstatus) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlDismountComplete(deviceobject.rawAddress, dismountstatus)
}

public actual fun fsRtlDissectDbcs(path: io.github.kotlinmania.windowssys.windows.win32.system.kernel.String, firstname: MutPtr, remainingname: MutPtr) {
}

public actual fun fsRtlDissectName(path: UnicodeString, firstname: MutPtr, remainingname: MutPtr) {
}

public actual fun fsRtlDoesDbcsContainWildCards(name: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlDoesDbcsContainWildCards(name.rawAddress)

public actual fun fsRtlDoesNameContainWildCards(name: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlDoesNameContainWildCards(name.rawAddress)

public actual fun fsRtlFastCheckLockForRead(filelock: ConstPtr, startingbyte: ConstPtr, length: ConstPtr, key: UInt, fileobject: ConstPtr, processid: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlFastCheckLockForRead(filelock.rawAddress, startingbyte.rawAddress, length.rawAddress, key.toInt(), fileobject.rawAddress, processid.rawAddress)

public actual fun fsRtlFastCheckLockForWrite(filelock: ConstPtr, startingbyte: ConstPtr, length: ConstPtr, key: UInt, fileobject: ConstPtr, processid: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlFastCheckLockForWrite(filelock.rawAddress, startingbyte.rawAddress, length.rawAddress, key.toInt(), fileobject.rawAddress, processid.rawAddress)

public actual fun fsRtlFastUnlockAll(filelock: ConstPtr, fileobject: ConstPtr, processid: Peprocess, context: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlFastUnlockAll(filelock.rawAddress, fileobject.rawAddress, processid, context.rawAddress)

public actual fun fsRtlFastUnlockAllByKey(filelock: ConstPtr, fileobject: ConstPtr, processid: Peprocess, key: UInt, context: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlFastUnlockAllByKey(filelock.rawAddress, fileobject.rawAddress, processid, key.toInt(), context.rawAddress)

public actual fun fsRtlFastUnlockSingle(filelock: ConstPtr, fileobject: ConstPtr, fileoffset: ConstPtr, length: ConstPtr, processid: Peprocess, key: UInt, context: ConstPtr, alreadysynchronized: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlFastUnlockSingle(filelock.rawAddress, fileobject.rawAddress, fileoffset.rawAddress, length.rawAddress, processid, key.toInt(), context.rawAddress, alreadysynchronized)

public actual fun fsRtlFindExtraCreateParameter(ecplist: ConstPtr, ecptype: ConstPtr, ecpcontext: MutPtr, ecpcontextsize: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlFindExtraCreateParameter(ecplist.rawAddress, ecptype.rawAddress, ecpcontext.rawAddress, ecpcontextsize.rawAddress)

public actual fun fsRtlFindInTunnelCache(cache: ConstPtr, directorykey: ULong, name: ConstPtr, shortname: MutPtr, longname: MutPtr, datalength: MutPtr, data: MutPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlFindInTunnelCache(cache.rawAddress, directorykey.toLong(), name.rawAddress, shortname.rawAddress, longname.rawAddress, datalength.rawAddress, data.rawAddress)

public actual fun fsRtlFindInTunnelCacheEx(cache: ConstPtr, directorykey: ULong, name: ConstPtr, shortname: MutPtr, longname: MutPtr, flags: UInt, datalength: MutPtr, data: MutPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlFindInTunnelCacheEx(cache.rawAddress, directorykey.toLong(), name.rawAddress, shortname.rawAddress, longname.rawAddress, flags.toInt(), datalength.rawAddress, data.rawAddress)

public actual fun fsRtlFreeAePushLock(aepushlock: MutPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlFreeAePushLock(aepushlock.rawAddress)
}

public actual fun fsRtlFreeExtraCreateParameter(ecpcontext: ConstPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlFreeExtraCreateParameter(ecpcontext.rawAddress)
}

public actual fun fsRtlFreeExtraCreateParameterList(ecplist: ConstPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlFreeExtraCreateParameterList(ecplist.rawAddress)
}

public actual fun fsRtlFreeFileLock(filelock: ConstPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlFreeFileLock(filelock.rawAddress)
}

public actual fun fsRtlGetCurrentProcessLoaderList(): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlGetCurrentProcessLoaderList())

public actual fun fsRtlGetEcpListFromIrp(irp: ConstPtr, ecplist: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlGetEcpListFromIrp(irp.rawAddress, ecplist.rawAddress)

public actual fun fsRtlGetFileSize(fileobject: ConstPtr, filesize: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlGetFileSize(fileobject.rawAddress, filesize.rawAddress)

public actual fun fsRtlGetNextBaseMcbEntry(mcb: ConstPtr, runindex: UInt, vbn: MutPtr, lbn: MutPtr, sectorcount: MutPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlGetNextBaseMcbEntry(mcb.rawAddress, runindex.toInt(), vbn.rawAddress, lbn.rawAddress, sectorcount.rawAddress)

public actual fun fsRtlGetNextExtraCreateParameter(ecplist: ConstPtr, currentecpcontext: ConstPtr, nextecptype: MutPtr, nextecpcontext: MutPtr, nextecpcontextsize: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlGetNextExtraCreateParameter(ecplist.rawAddress, currentecpcontext.rawAddress, nextecptype.rawAddress, nextecpcontext.rawAddress, nextecpcontextsize.rawAddress)

public actual fun fsRtlGetNextFileLock(filelock: ConstPtr, restart: Boolean): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlGetNextFileLock(filelock.rawAddress, restart))

public actual fun fsRtlGetNextLargeMcbEntry(mcb: ConstPtr, runindex: UInt, vbn: MutPtr, lbn: MutPtr, sectorcount: MutPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlGetNextLargeMcbEntry(mcb.rawAddress, runindex.toInt(), vbn.rawAddress, lbn.rawAddress, sectorcount.rawAddress)

public actual fun fsRtlGetNextMcbEntry(mcb: ConstPtr, runindex: UInt, vbn: MutPtr, lbn: MutPtr, sectorcount: MutPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlGetNextMcbEntry(mcb.rawAddress, runindex.toInt(), vbn.rawAddress, lbn.rawAddress, sectorcount.rawAddress)

public actual fun fsRtlGetSectorSizeInformation(deviceobject: ConstPtr, sectorsizeinfo: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlGetSectorSizeInformation(deviceobject.rawAddress, sectorsizeinfo.rawAddress)

public actual fun fsRtlGetSupportedFeatures(deviceobject: ConstPtr, supportedfeatures: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlGetSupportedFeatures(deviceobject.rawAddress, supportedfeatures.rawAddress)

public actual fun fsRtlGetVirtualDiskNestingLevel(deviceobject: ConstPtr, nestinglevel: MutPtr, nestingflags: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlGetVirtualDiskNestingLevel(deviceobject.rawAddress, nestinglevel.rawAddress, nestingflags.rawAddress)

public actual fun fsRtlIncrementCcFastMdlReadWait() {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastMdlReadWait()
}

public actual fun fsRtlIncrementCcFastReadNoWait() {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadNoWait()
}

public actual fun fsRtlIncrementCcFastReadNotPossible() {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadNotPossible()
}

public actual fun fsRtlIncrementCcFastReadResourceMiss() {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadResourceMiss()
}

public actual fun fsRtlIncrementCcFastReadWait() {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadWait()
}

public actual fun fsRtlInitExtraCreateParameterLookasideList(lookaside: MutPtr, flags: UInt, size: ULong, tag: UInt) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlInitExtraCreateParameterLookasideList(lookaside.rawAddress, flags.toInt(), size.toLong(), tag.toInt())
}

public actual fun fsRtlInitializeBaseMcb(mcb: MutPtr, pooltype: PoolType) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlInitializeBaseMcb(mcb.rawAddress, pooltype)
}

public actual fun fsRtlInitializeBaseMcbEx(mcb: MutPtr, pooltype: PoolType, flags: UShort): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlInitializeBaseMcbEx(mcb.rawAddress, pooltype, flags.toShort())

public actual fun fsRtlInitializeExtraCreateParameter(ecp: MutPtr, ecpflags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, totalsize: UInt, ecptype: ConstPtr, listallocatedfrom: ConstPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlInitializeExtraCreateParameter(ecp.rawAddress, ecpflags.toInt(), 0L, totalsize.toInt(), ecptype.rawAddress, listallocatedfrom.rawAddress)
}

public actual fun fsRtlInitializeExtraCreateParameterList(ecplist: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlInitializeExtraCreateParameterList(ecplist.rawAddress)

public actual fun fsRtlInitializeFileLock(filelock: MutPtr, completelockirproutine: PcompleteLockIrpRoutine, unlockroutine: PunlockRoutine) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlInitializeFileLock(filelock.rawAddress, 0L, 0L)
}

public actual fun fsRtlInitializeLargeMcb(mcb: MutPtr, pooltype: PoolType) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlInitializeLargeMcb(mcb.rawAddress, pooltype)
}

public actual fun fsRtlInitializeMcb(mcb: MutPtr, pooltype: PoolType) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlInitializeMcb(mcb.rawAddress, pooltype)
}

public actual fun fsRtlInitializeOplock(oplock: MutPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlInitializeOplock(oplock.rawAddress)
}

public actual fun fsRtlInitializeTunnelCache(cache: MutPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlInitializeTunnelCache(cache.rawAddress)
}

public actual fun fsRtlInsertExtraCreateParameter(ecplist: MutPtr, ecpcontext: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlInsertExtraCreateParameter(ecplist.rawAddress, ecpcontext.rawAddress)

public actual fun fsRtlInsertPerFileContext(perfilecontextpointer: ConstPtr, ptr: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlInsertPerFileContext(perfilecontextpointer.rawAddress, ptr.rawAddress)

public actual fun fsRtlInsertPerFileObjectContext(fileobject: ConstPtr, ptr: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlInsertPerFileObjectContext(fileobject.rawAddress, ptr.rawAddress)

public actual fun fsRtlInsertPerStreamContext(perstreamcontext: ConstPtr, ptr: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlInsertPerStreamContext(perstreamcontext.rawAddress, ptr.rawAddress)

public actual fun fsRtlIs32BitProcess(process: Peprocess): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlIs32BitProcess(process)

public actual fun fsRtlIsDaxVolume(fileobject: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlIsDaxVolume(fileobject.rawAddress)

public actual fun fsRtlIsDbcsInExpression(expression: ConstPtr, name: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlIsDbcsInExpression(expression.rawAddress, name.rawAddress)

public actual fun fsRtlIsEcpAcknowledged(ecpcontext: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlIsEcpAcknowledged(ecpcontext.rawAddress)

public actual fun fsRtlIsEcpFromUserMode(ecpcontext: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlIsEcpFromUserMode(ecpcontext.rawAddress)

public actual fun fsRtlIsExtentDangling(startpage: UInt, numberofpages: UInt, flags: UInt): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlIsExtentDangling(startpage.toInt(), numberofpages.toInt(), flags.toInt()).toUInt()

public actual fun fsRtlIsFatDbcsLegal(dbcsname: io.github.kotlinmania.windowssys.windows.win32.system.kernel.String, wildcardspermissible: Boolean, pathnamepermissible: Boolean, leadingbackslashpermissible: Boolean): Boolean =
    false

public actual fun fsRtlIsHpfsDbcsLegal(dbcsname: io.github.kotlinmania.windowssys.windows.win32.system.kernel.String, wildcardspermissible: Boolean, pathnamepermissible: Boolean, leadingbackslashpermissible: Boolean): Boolean =
    false

public actual fun fsRtlIsMobileOS(): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlIsMobileOS()

public actual fun fsRtlIsNameInExpression(expression: ConstPtr, name: ConstPtr, ignorecase: Boolean, upcasetable: Pcwstr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlIsNameInExpression(expression.rawAddress, name.rawAddress, ignorecase, upcasetable.rawAddress)

public actual fun fsRtlIsNameInUnUpcasedExpression(expression: ConstPtr, name: ConstPtr, ignorecase: Boolean, upcasetable: Pcwstr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlIsNameInUnUpcasedExpression(expression.rawAddress, name.rawAddress, ignorecase, upcasetable.rawAddress)

public actual fun fsRtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag: UInt): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag.toInt())

public actual fun fsRtlIsNtstatusExpected(exception: Ntstatus): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlIsNtstatusExpected(exception)

public actual fun fsRtlIsPagingFile(fileobject: ConstPtr): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlIsPagingFile(fileobject.rawAddress).toUInt()

public actual fun fsRtlIsSystemPagingFile(fileobject: ConstPtr): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlIsSystemPagingFile(fileobject.rawAddress).toUInt()

public actual fun fsRtlIssueDeviceIoControl(deviceobject: ConstPtr, ioctl: UInt, flags: UByte, inputbuffer: ConstPtr, inputbufferlength: UInt, outputbuffer: ConstPtr, outputbufferlength: UInt, iosbinformation: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlIssueDeviceIoControl(deviceobject.rawAddress, ioctl.toInt(), flags.toByte(), inputbuffer.rawAddress, inputbufferlength.toInt(), outputbuffer.rawAddress, outputbufferlength.toInt(), iosbinformation.rawAddress)

public actual fun fsRtlKernelFsControlFile(fileobject: ConstPtr, fscontrolcode: UInt, inputbuffer: ConstPtr, inputbufferlength: UInt, outputbuffer: MutPtr, outputbufferlength: UInt, retoutputbuffersize: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlKernelFsControlFile(fileobject.rawAddress, fscontrolcode.toInt(), inputbuffer.rawAddress, inputbufferlength.toInt(), outputbuffer.rawAddress, outputbufferlength.toInt(), retoutputbuffersize.rawAddress)

public actual fun fsRtlLogCcFlushError(filename: ConstPtr, deviceobject: ConstPtr, sectionobjectpointer: ConstPtr, flusherror: Ntstatus, flags: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlLogCcFlushError(filename.rawAddress, deviceobject.rawAddress, sectionobjectpointer.rawAddress, flusherror, flags.toInt())

public actual fun fsRtlLookupBaseMcbEntry(mcb: ConstPtr, vbn: Long, lbn: MutPtr, sectorcountfromlbn: MutPtr, startinglbn: MutPtr, sectorcountfromstartinglbn: MutPtr, index: MutPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlLookupBaseMcbEntry(mcb.rawAddress, vbn, lbn.rawAddress, sectorcountfromlbn.rawAddress, startinglbn.rawAddress, sectorcountfromstartinglbn.rawAddress, index.rawAddress)

public actual fun fsRtlLookupLargeMcbEntry(mcb: ConstPtr, vbn: Long, lbn: MutPtr, sectorcountfromlbn: MutPtr, startinglbn: MutPtr, sectorcountfromstartinglbn: MutPtr, index: MutPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlLookupLargeMcbEntry(mcb.rawAddress, vbn, lbn.rawAddress, sectorcountfromlbn.rawAddress, startinglbn.rawAddress, sectorcountfromstartinglbn.rawAddress, index.rawAddress)

public actual fun fsRtlLookupLastBaseMcbEntry(mcb: ConstPtr, vbn: MutPtr, lbn: MutPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlLookupLastBaseMcbEntry(mcb.rawAddress, vbn.rawAddress, lbn.rawAddress)

public actual fun fsRtlLookupLastBaseMcbEntryAndIndex(opaquemcb: ConstPtr, largevbn: MutPtr, largelbn: MutPtr, index: MutPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlLookupLastBaseMcbEntryAndIndex(opaquemcb.rawAddress, largevbn.rawAddress, largelbn.rawAddress, index.rawAddress)

public actual fun fsRtlLookupLastLargeMcbEntry(mcb: ConstPtr, vbn: MutPtr, lbn: MutPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlLookupLastLargeMcbEntry(mcb.rawAddress, vbn.rawAddress, lbn.rawAddress)

public actual fun fsRtlLookupLastLargeMcbEntryAndIndex(opaquemcb: ConstPtr, largevbn: MutPtr, largelbn: MutPtr, index: MutPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlLookupLastLargeMcbEntryAndIndex(opaquemcb.rawAddress, largevbn.rawAddress, largelbn.rawAddress, index.rawAddress)

public actual fun fsRtlLookupLastMcbEntry(mcb: ConstPtr, vbn: MutPtr, lbn: MutPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlLookupLastMcbEntry(mcb.rawAddress, vbn.rawAddress, lbn.rawAddress)

public actual fun fsRtlLookupMcbEntry(mcb: ConstPtr, vbn: UInt, lbn: MutPtr, sectorcount: MutPtr, index: MutPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlLookupMcbEntry(mcb.rawAddress, vbn.toInt(), lbn.rawAddress, sectorcount.rawAddress, index.rawAddress)

public actual fun fsRtlLookupPerFileContext(perfilecontextpointer: ConstPtr, ownerid: ConstPtr, instanceid: ConstPtr): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlLookupPerFileContext(perfilecontextpointer.rawAddress, ownerid.rawAddress, instanceid.rawAddress))

public actual fun fsRtlLookupPerFileObjectContext(fileobject: ConstPtr, ownerid: ConstPtr, instanceid: ConstPtr): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlLookupPerFileObjectContext(fileobject.rawAddress, ownerid.rawAddress, instanceid.rawAddress))

public actual fun fsRtlLookupPerStreamContextInternal(streamcontext: ConstPtr, ownerid: ConstPtr, instanceid: ConstPtr): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlLookupPerStreamContextInternal(streamcontext.rawAddress, ownerid.rawAddress, instanceid.rawAddress))

public actual fun fsRtlMdlReadCompleteDev(fileobject: ConstPtr, mdlchain: ConstPtr, deviceobject: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlMdlReadCompleteDev(fileobject.rawAddress, mdlchain.rawAddress, deviceobject.rawAddress)

public actual fun fsRtlMdlReadDev(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, lockkey: UInt, mdlchain: MutPtr, iostatus: MutPtr, deviceobject: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlMdlReadDev(fileobject.rawAddress, fileoffset.rawAddress, length.toInt(), lockkey.toInt(), mdlchain.rawAddress, iostatus.rawAddress, deviceobject.rawAddress)

public actual fun fsRtlMdlReadEx(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, lockkey: UInt, mdlchain: MutPtr, iostatus: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlMdlReadEx(fileobject.rawAddress, fileoffset.rawAddress, length.toInt(), lockkey.toInt(), mdlchain.rawAddress, iostatus.rawAddress)

public actual fun fsRtlMdlWriteCompleteDev(fileobject: ConstPtr, fileoffset: ConstPtr, mdlchain: ConstPtr, deviceobject: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlMdlWriteCompleteDev(fileobject.rawAddress, fileoffset.rawAddress, mdlchain.rawAddress, deviceobject.rawAddress)

public actual fun fsRtlMupGetProviderIdFromName(pprovidername: ConstPtr, pproviderid: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlMupGetProviderIdFromName(pprovidername.rawAddress, pproviderid.rawAddress)

public actual fun fsRtlMupGetProviderInfoFromFileObject(pfileobject: ConstPtr, level: UInt, pbuffer: MutPtr, pbuffersize: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlMupGetProviderInfoFromFileObject(pfileobject.rawAddress, level.toInt(), pbuffer.rawAddress, pbuffersize.rawAddress)

public actual fun fsRtlNormalizeNtstatus(exception: Ntstatus, genericexception: Ntstatus): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlNormalizeNtstatus(exception, genericexception)

public actual fun fsRtlNotifyCleanup(notifysync: PnotifySync, notifylist: ConstPtr, fscontext: ConstPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlNotifyCleanup(notifysync, notifylist.rawAddress, fscontext.rawAddress)
}

public actual fun fsRtlNotifyCleanupAll(notifysync: PnotifySync, notifylist: ConstPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlNotifyCleanupAll(notifysync, notifylist.rawAddress)
}

public actual fun fsRtlNotifyFilterChangeDirectory(notifysync: PnotifySync, notifylist: ConstPtr, fscontext: ConstPtr, fulldirectoryname: ConstPtr, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifyirp: ConstPtr, traversecallback: PcheckForTraverseAccess, subjectcontext: ConstPtr, filtercallback: PfilterReportChange) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlNotifyFilterChangeDirectory(notifysync, notifylist.rawAddress, fscontext.rawAddress, fulldirectoryname.rawAddress, watchtree, ignorebuffer, completionfilter.toInt(), notifyirp.rawAddress, 0L, subjectcontext.rawAddress, 0L)
}

public actual fun fsRtlNotifyFilterReportChange(notifysync: PnotifySync, notifylist: ConstPtr, fulltargetname: ConstPtr, targetnameoffset: UShort, streamname: ConstPtr, normalizedparentname: ConstPtr, filtermatch: UInt, action: UInt, targetcontext: ConstPtr, filtercontext: ConstPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlNotifyFilterReportChange(notifysync, notifylist.rawAddress, fulltargetname.rawAddress, targetnameoffset.toShort(), streamname.rawAddress, normalizedparentname.rawAddress, filtermatch.toInt(), action.toInt(), targetcontext.rawAddress, filtercontext.rawAddress)
}

public actual fun fsRtlNotifyFullChangeDirectory(notifysync: PnotifySync, notifylist: ConstPtr, fscontext: ConstPtr, fulldirectoryname: MutPtr, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifyirp: ConstPtr, traversecallback: PcheckForTraverseAccess, subjectcontext: ConstPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlNotifyFullChangeDirectory(notifysync, notifylist.rawAddress, fscontext.rawAddress, fulldirectoryname.rawAddress, watchtree, ignorebuffer, completionfilter.toInt(), notifyirp.rawAddress, 0L, subjectcontext.rawAddress)
}

public actual fun fsRtlNotifyFullReportChange(notifysync: PnotifySync, notifylist: ConstPtr, fulltargetname: ConstPtr, targetnameoffset: UShort, streamname: ConstPtr, normalizedparentname: ConstPtr, filtermatch: UInt, action: UInt, targetcontext: ConstPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlNotifyFullReportChange(notifysync, notifylist.rawAddress, fulltargetname.rawAddress, targetnameoffset.toShort(), streamname.rawAddress, normalizedparentname.rawAddress, filtermatch.toInt(), action.toInt(), targetcontext.rawAddress)
}

public actual fun fsRtlNotifyInitializeSync(notifysync: MutPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlNotifyInitializeSync(notifysync.rawAddress)
}

public actual fun fsRtlNotifyUninitializeSync(notifysync: MutPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlNotifyUninitializeSync(notifysync.rawAddress)
}

public actual fun fsRtlNotifyVolumeEvent(fileobject: ConstPtr, eventcode: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlNotifyVolumeEvent(fileobject.rawAddress, eventcode.toInt())

public actual fun fsRtlNotifyVolumeEventEx(fileobject: ConstPtr, eventcode: UInt, event: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlNotifyVolumeEventEx(fileobject.rawAddress, eventcode.toInt(), event.rawAddress)

public actual fun fsRtlNumberOfRunsInBaseMcb(mcb: ConstPtr): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlNumberOfRunsInBaseMcb(mcb.rawAddress).toUInt()

public actual fun fsRtlNumberOfRunsInLargeMcb(mcb: ConstPtr): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlNumberOfRunsInLargeMcb(mcb.rawAddress).toUInt()

public actual fun fsRtlNumberOfRunsInMcb(mcb: ConstPtr): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlNumberOfRunsInMcb(mcb.rawAddress).toUInt()

public actual fun fsRtlOplockBreakH(oplock: ConstPtr, irp: ConstPtr, flags: UInt, context: ConstPtr, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlOplockBreakH(oplock.rawAddress, irp.rawAddress, flags.toInt(), context.rawAddress, 0L, 0L)

public actual fun fsRtlOplockBreakH2(oplock: ConstPtr, irp: ConstPtr, flags: UInt, context: ConstPtr, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp, grantedaccess: ConstPtr, shareaccess: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlOplockBreakH2(oplock.rawAddress, irp.rawAddress, flags.toInt(), context.rawAddress, 0L, 0L, grantedaccess.rawAddress, shareaccess.rawAddress)

public actual fun fsRtlOplockBreakToNone(oplock: MutPtr, irpsp: ConstPtr, irp: ConstPtr, context: ConstPtr, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlOplockBreakToNone(oplock.rawAddress, irpsp.rawAddress, irp.rawAddress, context.rawAddress, 0L, 0L)

public actual fun fsRtlOplockBreakToNoneEx(oplock: MutPtr, irp: ConstPtr, flags: UInt, context: ConstPtr, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlOplockBreakToNoneEx(oplock.rawAddress, irp.rawAddress, flags.toInt(), context.rawAddress, 0L, 0L)

public actual fun fsRtlOplockFsctrl(oplock: ConstPtr, irp: ConstPtr, opencount: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlOplockFsctrl(oplock.rawAddress, irp.rawAddress, opencount.toInt())

public actual fun fsRtlOplockFsctrlEx(oplock: ConstPtr, irp: ConstPtr, opencount: UInt, flags: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlOplockFsctrlEx(oplock.rawAddress, irp.rawAddress, opencount.toInt(), flags.toInt())

public actual fun fsRtlOplockGetAnyBreakOwnerProcess(oplock: ConstPtr): Peprocess =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlOplockGetAnyBreakOwnerProcess(oplock.rawAddress)

public actual fun fsRtlOplockIsFastIoPossible(oplock: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlOplockIsFastIoPossible(oplock.rawAddress)

public actual fun fsRtlOplockIsSharedRequest(irp: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlOplockIsSharedRequest(irp.rawAddress)

public actual fun fsRtlOplockKeysEqual(fo1: ConstPtr, fo2: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlOplockKeysEqual(fo1.rawAddress, fo2.rawAddress)

public actual fun fsRtlPostPagingFileStackOverflow(context: ConstPtr, event: ConstPtr, stackoverflowroutine: PfsrtlStackOverflowRoutine) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlPostPagingFileStackOverflow(context.rawAddress, event.rawAddress, 0L)
}

public actual fun fsRtlPostStackOverflow(context: ConstPtr, event: ConstPtr, stackoverflowroutine: PfsrtlStackOverflowRoutine) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlPostStackOverflow(context.rawAddress, event.rawAddress, 0L)
}

public actual fun fsRtlPrepareMdlWriteDev(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, lockkey: UInt, mdlchain: MutPtr, iostatus: MutPtr, deviceobject: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlPrepareMdlWriteDev(fileobject.rawAddress, fileoffset.rawAddress, length.toInt(), lockkey.toInt(), mdlchain.rawAddress, iostatus.rawAddress, deviceobject.rawAddress)

public actual fun fsRtlPrepareMdlWriteEx(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, lockkey: UInt, mdlchain: MutPtr, iostatus: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlPrepareMdlWriteEx(fileobject.rawAddress, fileoffset.rawAddress, length.toInt(), lockkey.toInt(), mdlchain.rawAddress, iostatus.rawAddress)

public actual fun fsRtlPrepareToReuseEcp(ecpcontext: ConstPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlPrepareToReuseEcp(ecpcontext.rawAddress)
}

public actual fun fsRtlPrivateLock(filelock: ConstPtr, fileobject: ConstPtr, fileoffset: ConstPtr, length: ConstPtr, processid: Peprocess, key: UInt, failimmediately: Boolean, exclusivelock: Boolean, iosb: MutPtr, irp: ConstPtr, context: ConstPtr, alreadysynchronized: Boolean): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlPrivateLock(filelock.rawAddress, fileobject.rawAddress, fileoffset.rawAddress, length.rawAddress, processid, key.toInt(), failimmediately, exclusivelock, iosb.rawAddress, irp.rawAddress, context.rawAddress, alreadysynchronized)

public actual fun fsRtlProcessFileLock(filelock: ConstPtr, irp: ConstPtr, context: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlProcessFileLock(filelock.rawAddress, irp.rawAddress, context.rawAddress)

public actual fun fsRtlQueryCachedVdl(fileobject: ConstPtr, vdl: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlQueryCachedVdl(fileobject.rawAddress, vdl.rawAddress)

public actual fun fsRtlQueryInformationFile(fileobject: ConstPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass, retfileinformationsize: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlQueryInformationFile(fileobject.rawAddress, fileinformation.rawAddress, length.toInt(), fileinformationclass, retfileinformationsize.rawAddress)

public actual fun fsRtlQueryKernelEaFile(fileobject: ConstPtr, returnedeadata: MutPtr, length: UInt, returnsingleentry: Boolean, ealist: ConstPtr, ealistlength: UInt, eaindex: ConstPtr, restartscan: Boolean, lengthreturned: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlQueryKernelEaFile(fileobject.rawAddress, returnedeadata.rawAddress, length.toInt(), returnsingleentry, ealist.rawAddress, ealistlength.toInt(), eaindex.rawAddress, restartscan, lengthreturned.rawAddress)

public actual fun fsRtlQueryMaximumVirtualDiskNestingLevel(): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlQueryMaximumVirtualDiskNestingLevel().toUInt()

public actual fun fsRtlRegisterFileSystemFilterCallbacks(filterdriverobject: ConstPtr, callbacks: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlRegisterFileSystemFilterCallbacks(filterdriverobject.rawAddress, callbacks.rawAddress)

public actual fun fsRtlRegisterUncProvider(muphandle: MutPtr, redirectordevicename: ConstPtr, mailslotssupported: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlRegisterUncProvider(muphandle.rawAddress, redirectordevicename.rawAddress, mailslotssupported)

public actual fun fsRtlRegisterUncProviderEx(muphandle: MutPtr, redirdevname: ConstPtr, deviceobject: ConstPtr, flags: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlRegisterUncProviderEx(muphandle.rawAddress, redirdevname.rawAddress, deviceobject.rawAddress, flags.toInt())

public actual fun fsRtlRegisterUncProviderEx2(redirdevname: ConstPtr, deviceobject: ConstPtr, registration: ConstPtr, muphandle: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlRegisterUncProviderEx2(redirdevname.rawAddress, deviceobject.rawAddress, registration.rawAddress, muphandle.rawAddress)

public actual fun fsRtlReleaseFile(fileobject: ConstPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlReleaseFile(fileobject.rawAddress)
}

public actual fun fsRtlRemoveBaseMcbEntry(mcb: MutPtr, vbn: Long, sectorcount: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlRemoveBaseMcbEntry(mcb.rawAddress, vbn, sectorcount)

public actual fun fsRtlRemoveDotsFromPath(originalstring: Pwstr, pathlength: UShort, newlength: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlRemoveDotsFromPath(originalstring.rawAddress, pathlength.toShort(), newlength.rawAddress)

public actual fun fsRtlRemoveExtraCreateParameter(ecplist: MutPtr, ecptype: ConstPtr, ecpcontext: MutPtr, ecpcontextsize: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlRemoveExtraCreateParameter(ecplist.rawAddress, ecptype.rawAddress, ecpcontext.rawAddress, ecpcontextsize.rawAddress)

public actual fun fsRtlRemoveLargeMcbEntry(mcb: MutPtr, vbn: Long, sectorcount: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlRemoveLargeMcbEntry(mcb.rawAddress, vbn, sectorcount)
}

public actual fun fsRtlRemoveMcbEntry(mcb: MutPtr, vbn: UInt, sectorcount: UInt) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlRemoveMcbEntry(mcb.rawAddress, vbn.toInt(), sectorcount.toInt())
}

public actual fun fsRtlRemovePerFileContext(perfilecontextpointer: ConstPtr, ownerid: ConstPtr, instanceid: ConstPtr): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlRemovePerFileContext(perfilecontextpointer.rawAddress, ownerid.rawAddress, instanceid.rawAddress))

public actual fun fsRtlRemovePerFileObjectContext(fileobject: ConstPtr, ownerid: ConstPtr, instanceid: ConstPtr): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlRemovePerFileObjectContext(fileobject.rawAddress, ownerid.rawAddress, instanceid.rawAddress))

public actual fun fsRtlRemovePerStreamContext(streamcontext: ConstPtr, ownerid: ConstPtr, instanceid: ConstPtr): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlRemovePerStreamContext(streamcontext.rawAddress, ownerid.rawAddress, instanceid.rawAddress))

public actual fun fsRtlResetBaseMcb(mcb: MutPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlResetBaseMcb(mcb.rawAddress)
}

public actual fun fsRtlResetLargeMcb(mcb: MutPtr, selfsynchronized: Boolean) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlResetLargeMcb(mcb.rawAddress, selfsynchronized)
}

public actual fun fsRtlSetDriverBacking(driverobj: ConstPtr, flags: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlSetDriverBacking(driverobj.rawAddress, flags.toInt())

public actual fun fsRtlSetEcpListIntoIrp(irp: MutPtr, ecplist: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlSetEcpListIntoIrp(irp.rawAddress, ecplist.rawAddress)

public actual fun fsRtlSetKernelEaFile(fileobject: ConstPtr, eabuffer: ConstPtr, length: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlSetKernelEaFile(fileobject.rawAddress, eabuffer.rawAddress, length.toInt())

public actual fun fsRtlSplitBaseMcb(mcb: MutPtr, vbn: Long, amount: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlSplitBaseMcb(mcb.rawAddress, vbn, amount)

public actual fun fsRtlSplitLargeMcb(mcb: MutPtr, vbn: Long, amount: Long): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlSplitLargeMcb(mcb.rawAddress, vbn, amount)

public actual fun fsRtlTeardownPerFileContexts(perfilecontextpointer: ConstPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlTeardownPerFileContexts(perfilecontextpointer.rawAddress)
}

public actual fun fsRtlTeardownPerStreamContexts(advancedheader: ConstPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlTeardownPerStreamContexts(advancedheader.rawAddress)
}

public actual fun fsRtlTruncateBaseMcb(mcb: MutPtr, vbn: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlTruncateBaseMcb(mcb.rawAddress, vbn)
}

public actual fun fsRtlTruncateLargeMcb(mcb: MutPtr, vbn: Long) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlTruncateLargeMcb(mcb.rawAddress, vbn)
}

public actual fun fsRtlTruncateMcb(mcb: MutPtr, vbn: UInt) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlTruncateMcb(mcb.rawAddress, vbn.toInt())
}

public actual fun fsRtlUninitializeBaseMcb(mcb: ConstPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlUninitializeBaseMcb(mcb.rawAddress)
}

public actual fun fsRtlUninitializeFileLock(filelock: MutPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlUninitializeFileLock(filelock.rawAddress)
}

public actual fun fsRtlUninitializeLargeMcb(mcb: MutPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlUninitializeLargeMcb(mcb.rawAddress)
}

public actual fun fsRtlUninitializeMcb(mcb: MutPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlUninitializeMcb(mcb.rawAddress)
}

public actual fun fsRtlUninitializeOplock(oplock: MutPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlUninitializeOplock(oplock.rawAddress)
}

public actual fun fsRtlUpdateDiskCounters(bytesread: ULong, byteswritten: ULong) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlUpdateDiskCounters(bytesread.toLong(), byteswritten.toLong())
}

public actual fun fsRtlUpperOplockFsctrl(oplock: ConstPtr, irp: ConstPtr, opencount: UInt, loweroplockstate: UInt, flags: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlUpperOplockFsctrl(oplock.rawAddress, irp.rawAddress, opencount.toInt(), loweroplockstate.toInt(), flags.toInt())

public actual fun fsRtlValidateReparsePointBuffer(bufferlength: UInt, reparsebuffer: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlValidateReparsePointBuffer(bufferlength.toInt(), reparsebuffer.rawAddress)

public actual fun fsRtlVolumeDeviceToCorrelationId(volumedeviceobject: ConstPtr, guid: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemFsRtlVolumeDeviceToCorrelationId(volumedeviceobject.rawAddress, guid.rawAddress)

public actual fun getSecurityUserInfo(logonid: ConstPtr, flags: UInt, userinformation: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemGetSecurityUserInfo(logonid.rawAddress, flags.toInt(), userinformation.rawAddress)

public actual fun ioAcquireVpbSpinLock(irql: MutPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoAcquireVpbSpinLock(irql.rawAddress)
}

public actual fun ioApplyPriorityInfoThread(inputpriorityinfo: ConstPtr, outputpriorityinfo: MutPtr, thread: Pethread): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoApplyPriorityInfoThread(inputpriorityinfo.rawAddress, outputpriorityinfo.rawAddress, thread)

public actual fun ioCheckDesiredAccess(desiredaccess: MutPtr, grantedaccess: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoCheckDesiredAccess(desiredaccess.rawAddress, grantedaccess.toInt())

public actual fun ioCheckEaBufferValidity(eabuffer: ConstPtr, ealength: UInt, erroroffset: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoCheckEaBufferValidity(eabuffer.rawAddress, ealength.toInt(), erroroffset.rawAddress)

public actual fun ioCheckFunctionAccess(grantedaccess: UInt, majorfunction: UByte, minorfunction: UByte, iocontrolcode: UInt, arg1: ConstPtr, arg2: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoCheckFunctionAccess(grantedaccess.toInt(), majorfunction.toByte(), minorfunction.toByte(), iocontrolcode.toInt(), arg1.rawAddress, arg2.rawAddress)

public actual fun ioCheckQuerySetFileInformation(fileinformationclass: FileInformationClass, length: UInt, setoperation: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoCheckQuerySetFileInformation(fileinformationclass, length.toInt(), setoperation)

public actual fun ioCheckQuerySetVolumeInformation(fsinformationclass: FsInformationClass, length: UInt, setoperation: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoCheckQuerySetVolumeInformation(fsinformationclass, length.toInt(), setoperation)

public actual fun ioCheckQuotaBufferValidity(quotabuffer: ConstPtr, quotalength: UInt, erroroffset: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoCheckQuotaBufferValidity(quotabuffer.rawAddress, quotalength.toInt(), erroroffset.rawAddress)

public actual fun ioClearFsTrackOffsetState(irp: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoClearFsTrackOffsetState(irp.rawAddress)

public actual fun ioCreateStreamFileObject(fileobject: ConstPtr, deviceobject: ConstPtr): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoCreateStreamFileObject(fileobject.rawAddress, deviceobject.rawAddress))

public actual fun ioCreateStreamFileObjectEx(fileobject: ConstPtr, deviceobject: ConstPtr, filehandle: MutPtr): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoCreateStreamFileObjectEx(fileobject.rawAddress, deviceobject.rawAddress, filehandle.rawAddress))

public actual fun ioCreateStreamFileObjectEx2(createoptions: ConstPtr, fileobject: ConstPtr, deviceobject: ConstPtr, streamfileobject: MutPtr, filehandle: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoCreateStreamFileObjectEx2(createoptions.rawAddress, fileobject.rawAddress, deviceobject.rawAddress, streamfileobject.rawAddress, filehandle.rawAddress)

public actual fun ioCreateStreamFileObjectLite(fileobject: ConstPtr, deviceobject: ConstPtr): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoCreateStreamFileObjectLite(fileobject.rawAddress, deviceobject.rawAddress))

public actual fun ioEnumerateDeviceObjectList(driverobject: ConstPtr, deviceobjectlist: MutPtr, deviceobjectlistsize: UInt, actualnumberdeviceobjects: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoEnumerateDeviceObjectList(driverobject.rawAddress, deviceobjectlist.rawAddress, deviceobjectlistsize.toInt(), actualnumberdeviceobjects.rawAddress)

public actual fun ioEnumerateRegisteredFiltersList(driverobjectlist: MutPtr, driverobjectlistsize: UInt, actualnumberdriverobjects: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoEnumerateRegisteredFiltersList(driverobjectlist.rawAddress, driverobjectlistsize.toInt(), actualnumberdriverobjects.rawAddress)

public actual fun ioFastQueryNetworkAttributes(objectattributes: ConstPtr, desiredaccess: UInt, openoptions: UInt, iostatus: MutPtr, buffer: MutPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoFastQueryNetworkAttributes(objectattributes.rawAddress, desiredaccess.toInt(), openoptions.toInt(), iostatus.rawAddress, buffer.rawAddress)

public actual fun ioGetAttachedDevice(deviceobject: ConstPtr): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoGetAttachedDevice(deviceobject.rawAddress))

public actual fun ioGetBaseFileSystemDeviceObject(fileobject: ConstPtr): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoGetBaseFileSystemDeviceObject(fileobject.rawAddress))

public actual fun ioGetDeviceAttachmentBaseRef(deviceobject: ConstPtr): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoGetDeviceAttachmentBaseRef(deviceobject.rawAddress))

public actual fun ioGetDeviceToVerify(thread: Pethread): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoGetDeviceToVerify(thread))

public actual fun ioGetDiskDeviceObject(filesystemdeviceobject: ConstPtr, diskdeviceobject: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoGetDiskDeviceObject(filesystemdeviceobject.rawAddress, diskdeviceobject.rawAddress)

public actual fun ioGetFsTrackOffsetState(irp: ConstPtr, retfstrackoffsetblob: MutPtr, rettrackedoffset: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoGetFsTrackOffsetState(irp.rawAddress, retfstrackoffsetblob.rawAddress, rettrackedoffset.rawAddress)

public actual fun ioGetLowerDeviceObject(deviceobject: ConstPtr): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoGetLowerDeviceObject(deviceobject.rawAddress))

public actual fun ioGetOplockKeyContext(fileobject: ConstPtr): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoGetOplockKeyContext(fileobject.rawAddress))

public actual fun ioGetOplockKeyContextEx(fileobject: ConstPtr): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoGetOplockKeyContextEx(fileobject.rawAddress))

public actual fun ioGetRequestorProcess(irp: ConstPtr): Peprocess =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoGetRequestorProcess(irp.rawAddress)

public actual fun ioGetRequestorProcessId(irp: ConstPtr): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoGetRequestorProcessId(irp.rawAddress).toUInt()

public actual fun ioGetRequestorSessionId(irp: ConstPtr, psessionid: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoGetRequestorSessionId(irp.rawAddress, psessionid.rawAddress)

public actual fun ioIrpHasFsTrackOffsetExtensionType(irp: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoIrpHasFsTrackOffsetExtensionType(irp.rawAddress)

public actual fun ioIsOperationSynchronous(irp: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoIsOperationSynchronous(irp.rawAddress)

public actual fun ioIsSystemThread(thread: Pethread): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoIsSystemThread(thread)

public actual fun ioIsValidNameGraftingBuffer(irp: ConstPtr, reparsebuffer: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoIsValidNameGraftingBuffer(irp.rawAddress, reparsebuffer.rawAddress)

public actual fun ioPageRead(fileobject: ConstPtr, memorydescriptorlist: ConstPtr, startingoffset: ConstPtr, event: ConstPtr, iostatusblock: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoPageRead(fileobject.rawAddress, memorydescriptorlist.rawAddress, startingoffset.rawAddress, event.rawAddress, iostatusblock.rawAddress)

public actual fun ioQueryFileDosDeviceName(fileobject: ConstPtr, objectnameinformation: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoQueryFileDosDeviceName(fileobject.rawAddress, objectnameinformation.rawAddress)

public actual fun ioQueryFileInformation(fileobject: ConstPtr, fileinformationclass: FileInformationClass, length: UInt, fileinformation: MutPtr, returnedlength: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoQueryFileInformation(fileobject.rawAddress, fileinformationclass, length.toInt(), fileinformation.rawAddress, returnedlength.rawAddress)

public actual fun ioQueryVolumeInformation(fileobject: ConstPtr, fsinformationclass: FsInformationClass, length: UInt, fsinformation: MutPtr, returnedlength: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoQueryVolumeInformation(fileobject.rawAddress, fsinformationclass, length.toInt(), fsinformation.rawAddress, returnedlength.rawAddress)

public actual fun ioQueueThreadIrp(irp: ConstPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoQueueThreadIrp(irp.rawAddress)
}

public actual fun ioRegisterFileSystem(deviceobject: ConstPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoRegisterFileSystem(deviceobject.rawAddress)
}

public actual fun ioRegisterFsRegistrationChange(driverobject: ConstPtr, drivernotificationroutine: DriverFsNotification): Ntstatus =
    0

public actual fun ioRegisterFsRegistrationChangeMountAware(driverobject: ConstPtr, drivernotificationroutine: DriverFsNotification, synchronizewithmounts: Boolean): Ntstatus =
    0

public actual fun ioReleaseVpbSpinLock(irql: UByte) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoReleaseVpbSpinLock(irql.toByte())
}

public actual fun ioReplaceFileObjectName(fileobject: ConstPtr, newfilename: Pcwstr, filenamelength: UShort): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoReplaceFileObjectName(fileobject.rawAddress, newfilename.rawAddress, filenamelength.toShort())

public actual fun ioRequestDeviceRemovalForReset(physicaldeviceobject: ConstPtr, flags: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoRequestDeviceRemovalForReset(physicaldeviceobject.rawAddress, flags.toInt())

public actual fun ioRetrievePriorityInfo(irp: ConstPtr, fileobject: ConstPtr, thread: Pethread, priorityinfo: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoRetrievePriorityInfo(irp.rawAddress, fileobject.rawAddress, thread, priorityinfo.rawAddress)

public actual fun ioSetDeviceToVerify(thread: Pethread, deviceobject: ConstPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoSetDeviceToVerify(thread, deviceobject.rawAddress)
}

public actual fun ioSetFsTrackOffsetState(irp: MutPtr, fstrackoffsetblob: ConstPtr, trackedoffset: Long): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoSetFsTrackOffsetState(irp.rawAddress, fstrackoffsetblob.rawAddress, trackedoffset)

public actual fun ioSetInformation(fileobject: ConstPtr, fileinformationclass: FileInformationClass, length: UInt, fileinformation: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoSetInformation(fileobject.rawAddress, fileinformationclass, length.toInt(), fileinformation.rawAddress)

public actual fun ioSynchronousPageWrite(fileobject: ConstPtr, memorydescriptorlist: ConstPtr, startingoffset: ConstPtr, event: ConstPtr, iostatusblock: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoSynchronousPageWrite(fileobject.rawAddress, memorydescriptorlist.rawAddress, startingoffset.rawAddress, event.rawAddress, iostatusblock.rawAddress)

public actual fun ioThreadToProcess(thread: Pethread): Peprocess =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoThreadToProcess(thread)

public actual fun ioUnregisterFileSystem(deviceobject: ConstPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoUnregisterFileSystem(deviceobject.rawAddress)
}

public actual fun ioUnregisterFsRegistrationChange(driverobject: ConstPtr, drivernotificationroutine: DriverFsNotification) {
}

public actual fun ioVerifyVolume(deviceobject: ConstPtr, allowrawmount: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemIoVerifyVolume(deviceobject.rawAddress, allowrawmount)

public actual fun keAcquireQueuedSpinLock(number: KspinLockQueueNumber): UByte =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemKeAcquireQueuedSpinLock(number).toUByte()

public actual fun keAcquireSpinLockRaiseToSynch(spinlock: MutPtr): UByte =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemKeAcquireSpinLockRaiseToSynch(spinlock.rawAddress).toUByte()

public actual fun keAttachProcess(process: Prkprocess) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemKeAttachProcess(process)
}

public actual fun keDetachProcess() {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemKeDetachProcess()
}

public actual fun keInitializeMutant(mutant: MutPtr, initialowner: Boolean) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemKeInitializeMutant(mutant.rawAddress, initialowner)
}

public actual fun keInitializeQueue(queue: MutPtr, count: UInt) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemKeInitializeQueue(queue.rawAddress, count.toInt())
}

public actual fun keInsertHeadQueue(queue: MutPtr, entry: MutPtr): Int =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemKeInsertHeadQueue(queue.rawAddress, entry.rawAddress)

public actual fun keInsertQueue(queue: MutPtr, entry: MutPtr): Int =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemKeInsertQueue(queue.rawAddress, entry.rawAddress)

public actual fun keReadStateMutant(mutant: ConstPtr): Int =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemKeReadStateMutant(mutant.rawAddress)

public actual fun keReadStateQueue(queue: ConstPtr): Int =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemKeReadStateQueue(queue.rawAddress)

public actual fun keReleaseMutant(mutant: MutPtr, increment: Int, abandoned: Boolean, wait: Boolean): Int =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemKeReleaseMutant(mutant.rawAddress, increment, abandoned, wait)

public actual fun keReleaseQueuedSpinLock(number: KspinLockQueueNumber, oldirql: UByte) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemKeReleaseQueuedSpinLock(number, oldirql.toByte())
}

public actual fun keRemoveQueue(queue: MutPtr, waitmode: Byte, timeout: ConstPtr): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemKeRemoveQueue(queue.rawAddress, waitmode, timeout.rawAddress))

public actual fun keRemoveQueueEx(queue: MutPtr, waitmode: Byte, alertable: Boolean, timeout: ConstPtr, entryarray: MutPtr, count: UInt): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemKeRemoveQueueEx(queue.rawAddress, waitmode, alertable, timeout.rawAddress, entryarray.rawAddress, count.toInt()).toUInt()

public actual fun keRundownQueue(queue: MutPtr): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemKeRundownQueue(queue.rawAddress))

public actual fun keSetIdealProcessorThread(thread: Pkthread, processor: UByte): UByte =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemKeSetIdealProcessorThread(thread, processor.toByte()).toUByte()

public actual fun keSetKernelStackSwapEnable(enable: Boolean): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemKeSetKernelStackSwapEnable(enable)

public actual fun keStackAttachProcess(process: Prkprocess, apcstate: MutPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemKeStackAttachProcess(process, apcstate.rawAddress)
}

public actual fun keTryToAcquireQueuedSpinLock(number: KspinLockQueueNumber, oldirql: MutPtr): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemKeTryToAcquireQueuedSpinLock(number, oldirql.rawAddress).toUInt()

public actual fun keUnstackDetachProcess(apcstate: ConstPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemKeUnstackDetachProcess(apcstate.rawAddress)
}

public actual fun makeSignature(phcontext: ConstPtr, fqop: UInt, pmessage: ConstPtr, messageseqno: UInt): Hresult =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemMakeSignature(phcontext.rawAddress, fqop.toInt(), pmessage.rawAddress, messageseqno.toInt())

public actual fun mapSecurityError(secstatus: Hresult): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemMapSecurityError(secstatus)

public actual fun mmCanFileBeTruncated(sectionpointer: ConstPtr, newfilesize: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemMmCanFileBeTruncated(sectionpointer.rawAddress, newfilesize.rawAddress)

public actual fun mmDoesFileHaveUserWritableReferences(sectionpointer: ConstPtr): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemMmDoesFileHaveUserWritableReferences(sectionpointer.rawAddress).toUInt()

public actual fun mmFlushImageSection(sectionobjectpointer: ConstPtr, flushtype: MmflushType): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemMmFlushImageSection(sectionobjectpointer.rawAddress, flushtype)

public actual fun mmForceSectionClosed(sectionobjectpointer: ConstPtr, delayclose: Boolean): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemMmForceSectionClosed(sectionobjectpointer.rawAddress, delayclose)

public actual fun mmForceSectionClosedEx(sectionobjectpointer: ConstPtr, forcecloseflags: UInt): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemMmForceSectionClosedEx(sectionobjectpointer.rawAddress, forcecloseflags.toInt())

public actual fun mmGetMaximumFileSectionSize(): ULong =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemMmGetMaximumFileSectionSize().toULong()

public actual fun mmIsFileSectionActive(fssectionpointer: ConstPtr, flags: UInt, sectionisactive: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemMmIsFileSectionActive(fssectionpointer.rawAddress, flags.toInt(), sectionisactive.rawAddress)

public actual fun mmIsRecursiveIoFault(): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemMmIsRecursiveIoFault()

public actual fun mmMdlPagesAreZero(mdl: ConstPtr): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemMmMdlPagesAreZero(mdl.rawAddress).toUInt()

public actual fun mmPrefetchPages(numberoflists: UInt, readlists: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemMmPrefetchPages(numberoflists.toInt(), readlists.rawAddress)

public actual fun mmSetAddressRangeModified(address: ConstPtr, length: ULong): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemMmSetAddressRangeModified(address.rawAddress, length.toLong())

public actual fun ntAccessCheckAndAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, objecttypename: ConstPtr, objectname: ConstPtr, securitydescriptor: PsecurityDescriptor, desiredaccess: UInt, genericmapping: ConstPtr, objectcreation: Boolean, grantedaccess: MutPtr, accessstatus: MutPtr, generateonclose: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtAccessCheckAndAuditAlarm(subsystemname.rawAddress, handleid.rawAddress, objecttypename.rawAddress, objectname.rawAddress, securitydescriptor.rawAddress, desiredaccess.toInt(), genericmapping.rawAddress, objectcreation, grantedaccess.rawAddress, accessstatus.rawAddress, generateonclose.rawAddress)

public actual fun ntAccessCheckByTypeAndAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, objecttypename: ConstPtr, objectname: ConstPtr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: ConstPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Boolean, grantedaccess: MutPtr, accessstatus: MutPtr, generateonclose: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtAccessCheckByTypeAndAuditAlarm(subsystemname.rawAddress, handleid.rawAddress, objecttypename.rawAddress, objectname.rawAddress, securitydescriptor.rawAddress, principalselfsid.rawAddress, desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.rawAddress, objecttypelistlength.toInt(), genericmapping.rawAddress, objectcreation, grantedaccess.rawAddress, accessstatus.rawAddress, generateonclose.rawAddress)

public actual fun ntAccessCheckByTypeResultListAndAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, objecttypename: ConstPtr, objectname: ConstPtr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: ConstPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Boolean, grantedaccess: MutPtr, accessstatus: MutPtr, generateonclose: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtAccessCheckByTypeResultListAndAuditAlarm(subsystemname.rawAddress, handleid.rawAddress, objecttypename.rawAddress, objectname.rawAddress, securitydescriptor.rawAddress, principalselfsid.rawAddress, desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.rawAddress, objecttypelistlength.toInt(), genericmapping.rawAddress, objectcreation, grantedaccess.rawAddress, accessstatus.rawAddress, generateonclose.rawAddress)

public actual fun ntAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname: ConstPtr, handleid: ConstPtr, clienttoken: Handle, objecttypename: ConstPtr, objectname: ConstPtr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: ConstPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Boolean, grantedaccess: MutPtr, accessstatus: MutPtr, generateonclose: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname.rawAddress, handleid.rawAddress, clienttoken.rawAddress, objecttypename.rawAddress, objectname.rawAddress, securitydescriptor.rawAddress, principalselfsid.rawAddress, desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.rawAddress, objecttypelistlength.toInt(), genericmapping.rawAddress, objectcreation, grantedaccess.rawAddress, accessstatus.rawAddress, generateonclose.rawAddress)

public actual fun ntAdjustGroupsToken(tokenhandle: Handle, resettodefault: Boolean, newstate: ConstPtr, bufferlength: UInt, previousstate: MutPtr, returnlength: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtAdjustGroupsToken(tokenhandle.rawAddress, resettodefault, newstate.rawAddress, bufferlength.toInt(), previousstate.rawAddress, returnlength.rawAddress)

public actual fun ntAdjustPrivilegesToken(tokenhandle: Handle, disableallprivileges: Boolean, newstate: ConstPtr, bufferlength: UInt, previousstate: MutPtr, returnlength: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtAdjustPrivilegesToken(tokenhandle.rawAddress, disableallprivileges, newstate.rawAddress, bufferlength.toInt(), previousstate.rawAddress, returnlength.rawAddress)

public actual fun ntAllocateVirtualMemory(processhandle: Handle, baseaddress: MutPtr, zerobits: ULong, regionsize: MutPtr, allocationtype: UInt, protect: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtAllocateVirtualMemory(processhandle.rawAddress, baseaddress.rawAddress, zerobits.toLong(), regionsize.rawAddress, allocationtype.toInt(), protect.toInt())

public actual fun ntAllocateVirtualMemoryEx(processhandle: Handle, baseaddress: MutPtr, regionsize: MutPtr, allocationtype: UInt, pageprotection: UInt, extendedparameters: MutPtr, extendedparametercount: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtAllocateVirtualMemoryEx(processhandle.rawAddress, baseaddress.rawAddress, regionsize.rawAddress, allocationtype.toInt(), pageprotection.toInt(), extendedparameters.rawAddress, extendedparametercount.toInt())

public actual fun ntCancelIoFileEx(filehandle: Handle, iorequesttocancel: ConstPtr, iostatusblock: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtCancelIoFileEx(filehandle.rawAddress, iorequesttocancel.rawAddress, iostatusblock.rawAddress)

public actual fun ntCloseObjectAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, generateonclose: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtCloseObjectAuditAlarm(subsystemname.rawAddress, handleid.rawAddress, generateonclose)

public actual fun ntCreateDirectoryObject(directoryhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtCreateDirectoryObject(directoryhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress)

public actual fun ntCreateEvent(eventhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, eventtype: EventType, initialstate: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtCreateEvent(eventhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, eventtype, initialstate)

public actual fun ntCreateFile(filehandle: MutPtr, desiredaccess: FileAccessRights, objectattributes: ConstPtr, iostatusblock: MutPtr, allocationsize: ConstPtr, fileattributes: FileFlagsAndAttributes, shareaccess: FileShareMode, createdisposition: NtcreatefileCreateDisposition, createoptions: NtcreatefileCreateOptions, eabuffer: ConstPtr, ealength: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtCreateFile(filehandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, iostatusblock.rawAddress, allocationsize.rawAddress, fileattributes.toInt(), shareaccess.toInt(), createdisposition.toInt(), createoptions.toInt(), eabuffer.rawAddress, ealength.toInt())

public actual fun ntCreateSection(sectionhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, maximumsize: ConstPtr, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Handle): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtCreateSection(sectionhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, maximumsize.rawAddress, sectionpageprotection.toInt(), allocationattributes.toInt(), filehandle.rawAddress)

public actual fun ntCreateSectionEx(sectionhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, maximumsize: ConstPtr, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Handle, extendedparameters: MutPtr, extendedparametercount: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtCreateSectionEx(sectionhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, maximumsize.rawAddress, sectionpageprotection.toInt(), allocationattributes.toInt(), filehandle.rawAddress, extendedparameters.rawAddress, extendedparametercount.toInt())

public actual fun ntDeleteFile(objectattributes: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtDeleteFile(objectattributes.rawAddress)

public actual fun ntDeleteObjectAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, generateonclose: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtDeleteObjectAuditAlarm(subsystemname.rawAddress, handleid.rawAddress, generateonclose)

public actual fun ntDuplicateObject(sourceprocesshandle: Handle, sourcehandle: Handle, targetprocesshandle: Handle, targethandle: MutPtr, desiredaccess: UInt, handleattributes: UInt, options: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtDuplicateObject(sourceprocesshandle.rawAddress, sourcehandle.rawAddress, targetprocesshandle.rawAddress, targethandle.rawAddress, desiredaccess.toInt(), handleattributes.toInt(), options.toInt())

public actual fun ntDuplicateToken(existingtokenhandle: Handle, desiredaccess: UInt, objectattributes: ConstPtr, effectiveonly: Boolean, tokentype: TokenType, newtokenhandle: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtDuplicateToken(existingtokenhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, effectiveonly, tokentype, newtokenhandle.rawAddress)

public actual fun ntFilterToken(existingtokenhandle: Handle, flags: UInt, sidstodisable: ConstPtr, privilegestodelete: ConstPtr, restrictedsids: ConstPtr, newtokenhandle: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtFilterToken(existingtokenhandle.rawAddress, flags.toInt(), sidstodisable.rawAddress, privilegestodelete.rawAddress, restrictedsids.rawAddress, newtokenhandle.rawAddress)

public actual fun ntFlushBuffersFile(filehandle: Handle, iostatusblock: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtFlushBuffersFile(filehandle.rawAddress, iostatusblock.rawAddress)

public actual fun ntFlushBuffersFileEx(filehandle: Handle, flags: UInt, parameters: ConstPtr, parameterssize: UInt, iostatusblock: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtFlushBuffersFileEx(filehandle.rawAddress, flags.toInt(), parameters.rawAddress, parameterssize.toInt(), iostatusblock.rawAddress)

public actual fun ntFlushVirtualMemory(processhandle: Handle, baseaddress: MutPtr, regionsize: MutPtr, iostatus: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtFlushVirtualMemory(processhandle.rawAddress, baseaddress.rawAddress, regionsize.rawAddress, iostatus.rawAddress)

public actual fun ntFreeVirtualMemory(processhandle: Handle, baseaddress: MutPtr, regionsize: MutPtr, freetype: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtFreeVirtualMemory(processhandle.rawAddress, baseaddress.rawAddress, regionsize.rawAddress, freetype.toInt())

public actual fun ntFsControlFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, fscontrolcode: UInt, inputbuffer: ConstPtr, inputbufferlength: UInt, outputbuffer: MutPtr, outputbufferlength: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtFsControlFile(filehandle.rawAddress, event.rawAddress, 0L, apccontext.rawAddress, iostatusblock.rawAddress, fscontrolcode.toInt(), inputbuffer.rawAddress, inputbufferlength.toInt(), outputbuffer.rawAddress, outputbufferlength.toInt())

public actual fun ntImpersonateAnonymousToken(threadhandle: Handle): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtImpersonateAnonymousToken(threadhandle.rawAddress)

public actual fun ntLockFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, byteoffset: ConstPtr, length: ConstPtr, key: UInt, failimmediately: Boolean, exclusivelock: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtLockFile(filehandle.rawAddress, event.rawAddress, 0L, apccontext.rawAddress, iostatusblock.rawAddress, byteoffset.rawAddress, length.rawAddress, key.toInt(), failimmediately, exclusivelock)

public actual fun ntNotifyChangeKey(keyhandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, completionfilter: UInt, watchtree: Boolean, buffer: MutPtr, buffersize: UInt, asynchronous: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtNotifyChangeKey(keyhandle.rawAddress, event.rawAddress, 0L, apccontext.rawAddress, iostatusblock.rawAddress, completionfilter.toInt(), watchtree, buffer.rawAddress, buffersize.toInt(), asynchronous)

public actual fun ntOpenDirectoryObject(directoryhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtOpenDirectoryObject(directoryhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress)

public actual fun ntOpenFile(filehandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, iostatusblock: MutPtr, shareaccess: UInt, openoptions: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtOpenFile(filehandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, iostatusblock.rawAddress, shareaccess.toInt(), openoptions.toInt())

public actual fun ntOpenObjectAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, objecttypename: ConstPtr, objectname: ConstPtr, securitydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, grantedaccess: UInt, privileges: ConstPtr, objectcreation: Boolean, accessgranted: Boolean, generateonclose: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtOpenObjectAuditAlarm(subsystemname.rawAddress, handleid.rawAddress, objecttypename.rawAddress, objectname.rawAddress, securitydescriptor.rawAddress, clienttoken.rawAddress, desiredaccess.toInt(), grantedaccess.toInt(), privileges.rawAddress, objectcreation, accessgranted, generateonclose.rawAddress)

public actual fun ntOpenProcessToken(processhandle: Handle, desiredaccess: UInt, tokenhandle: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtOpenProcessToken(processhandle.rawAddress, desiredaccess.toInt(), tokenhandle.rawAddress)

public actual fun ntOpenProcessTokenEx(processhandle: Handle, desiredaccess: UInt, handleattributes: UInt, tokenhandle: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtOpenProcessTokenEx(processhandle.rawAddress, desiredaccess.toInt(), handleattributes.toInt(), tokenhandle.rawAddress)

public actual fun ntOpenSymbolicLinkObject(linkhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtOpenSymbolicLinkObject(linkhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress)

public actual fun ntOpenThreadToken(threadhandle: Handle, desiredaccess: UInt, openasself: Boolean, tokenhandle: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtOpenThreadToken(threadhandle.rawAddress, desiredaccess.toInt(), openasself, tokenhandle.rawAddress)

public actual fun ntOpenThreadTokenEx(threadhandle: Handle, desiredaccess: UInt, openasself: Boolean, handleattributes: UInt, tokenhandle: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtOpenThreadTokenEx(threadhandle.rawAddress, desiredaccess.toInt(), openasself, handleattributes.toInt(), tokenhandle.rawAddress)

public actual fun ntPrivilegeCheck(clienttoken: Handle, requiredprivileges: MutPtr, result: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtPrivilegeCheck(clienttoken.rawAddress, requiredprivileges.rawAddress, result.rawAddress)

public actual fun ntPrivilegeObjectAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, clienttoken: Handle, desiredaccess: UInt, privileges: ConstPtr, accessgranted: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtPrivilegeObjectAuditAlarm(subsystemname.rawAddress, handleid.rawAddress, clienttoken.rawAddress, desiredaccess.toInt(), privileges.rawAddress, accessgranted)

public actual fun ntPrivilegedServiceAuditAlarm(subsystemname: ConstPtr, servicename: ConstPtr, clienttoken: Handle, privileges: ConstPtr, accessgranted: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtPrivilegedServiceAuditAlarm(subsystemname.rawAddress, servicename.rawAddress, clienttoken.rawAddress, privileges.rawAddress, accessgranted)

public actual fun ntQueryDirectoryFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass, returnsingleentry: Boolean, filename: ConstPtr, restartscan: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtQueryDirectoryFile(filehandle.rawAddress, event.rawAddress, 0L, apccontext.rawAddress, iostatusblock.rawAddress, fileinformation.rawAddress, length.toInt(), fileinformationclass, returnsingleentry, filename.rawAddress, restartscan)

public actual fun ntQueryDirectoryFileEx(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass, queryflags: UInt, filename: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtQueryDirectoryFileEx(filehandle.rawAddress, event.rawAddress, 0L, apccontext.rawAddress, iostatusblock.rawAddress, fileinformation.rawAddress, length.toInt(), fileinformationclass, queryflags.toInt(), filename.rawAddress)

public actual fun ntQueryDirectoryObject(directoryhandle: Handle, buffer: MutPtr, length: UInt, returnsingleentry: Boolean, restartscan: Boolean, context: MutPtr, returnlength: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtQueryDirectoryObject(directoryhandle.rawAddress, buffer.rawAddress, length.toInt(), returnsingleentry, restartscan, context.rawAddress, returnlength.rawAddress)

public actual fun ntQueryEaFile(filehandle: Handle, iostatusblock: MutPtr, buffer: MutPtr, length: UInt, returnsingleentry: Boolean, ealist: ConstPtr, ealistlength: UInt, eaindex: ConstPtr, restartscan: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtQueryEaFile(filehandle.rawAddress, iostatusblock.rawAddress, buffer.rawAddress, length.toInt(), returnsingleentry, ealist.rawAddress, ealistlength.toInt(), eaindex.rawAddress, restartscan)

public actual fun ntQueryFullAttributesFile(objectattributes: ConstPtr, fileinformation: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtQueryFullAttributesFile(objectattributes.rawAddress, fileinformation.rawAddress)

public actual fun ntQueryInformationByName(objectattributes: ConstPtr, iostatusblock: MutPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtQueryInformationByName(objectattributes.rawAddress, iostatusblock.rawAddress, fileinformation.rawAddress, length.toInt(), fileinformationclass)

public actual fun ntQueryInformationFile(filehandle: Handle, iostatusblock: MutPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtQueryInformationFile(filehandle.rawAddress, iostatusblock.rawAddress, fileinformation.rawAddress, length.toInt(), fileinformationclass)

public actual fun ntQueryInformationToken(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: MutPtr, tokeninformationlength: UInt, returnlength: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtQueryInformationToken(tokenhandle.rawAddress, tokeninformationclass, tokeninformation.rawAddress, tokeninformationlength.toInt(), returnlength.rawAddress)

public actual fun ntQueryQuotaInformationFile(filehandle: Handle, iostatusblock: MutPtr, buffer: MutPtr, length: UInt, returnsingleentry: Boolean, sidlist: ConstPtr, sidlistlength: UInt, startsid: Psid, restartscan: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtQueryQuotaInformationFile(filehandle.rawAddress, iostatusblock.rawAddress, buffer.rawAddress, length.toInt(), returnsingleentry, sidlist.rawAddress, sidlistlength.toInt(), startsid.rawAddress, restartscan)

public actual fun ntQuerySecurityObject(handle: Handle, securityinformation: UInt, securitydescriptor: PsecurityDescriptor, length: UInt, lengthneeded: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtQuerySecurityObject(handle.rawAddress, securityinformation.toInt(), securitydescriptor.rawAddress, length.toInt(), lengthneeded.rawAddress)

public actual fun ntQuerySymbolicLinkObject(linkhandle: Handle, linktarget: MutPtr, returnedlength: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtQuerySymbolicLinkObject(linkhandle.rawAddress, linktarget.rawAddress, returnedlength.rawAddress)

public actual fun ntQueryVirtualMemory(processhandle: Handle, baseaddress: ConstPtr, memoryinformationclass: MemoryInformationClass, memoryinformation: MutPtr, memoryinformationlength: ULong, returnlength: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtQueryVirtualMemory(processhandle.rawAddress, baseaddress.rawAddress, memoryinformationclass, memoryinformation.rawAddress, memoryinformationlength.toLong(), returnlength.rawAddress)

public actual fun ntQueryVolumeInformationFile(filehandle: Handle, iostatusblock: MutPtr, fsinformation: MutPtr, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtQueryVolumeInformationFile(filehandle.rawAddress, iostatusblock.rawAddress, fsinformation.rawAddress, length.toInt(), fsinformationclass)

public actual fun ntReadFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, buffer: MutPtr, length: UInt, byteoffset: ConstPtr, key: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtReadFile(filehandle.rawAddress, event.rawAddress, 0L, apccontext.rawAddress, iostatusblock.rawAddress, buffer.rawAddress, length.toInt(), byteoffset.rawAddress, key.rawAddress)

public actual fun ntSetEaFile(filehandle: Handle, iostatusblock: MutPtr, buffer: ConstPtr, length: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtSetEaFile(filehandle.rawAddress, iostatusblock.rawAddress, buffer.rawAddress, length.toInt())

public actual fun ntSetEvent(eventhandle: Handle, previousstate: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtSetEvent(eventhandle.rawAddress, previousstate.rawAddress)

public actual fun ntSetInformationFile(filehandle: Handle, iostatusblock: MutPtr, fileinformation: ConstPtr, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtSetInformationFile(filehandle.rawAddress, iostatusblock.rawAddress, fileinformation.rawAddress, length.toInt(), fileinformationclass)

public actual fun ntSetInformationToken(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: ConstPtr, tokeninformationlength: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtSetInformationToken(tokenhandle.rawAddress, tokeninformationclass, tokeninformation.rawAddress, tokeninformationlength.toInt())

public actual fun ntSetInformationVirtualMemory(processhandle: Handle, vminformationclass: VirtualMemoryInformationClass, numberofentries: ULong, virtualaddresses: ConstPtr, vminformation: ConstPtr, vminformationlength: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtSetInformationVirtualMemory(processhandle.rawAddress, vminformationclass, numberofentries.toLong(), virtualaddresses.rawAddress, vminformation.rawAddress, vminformationlength.toInt())

public actual fun ntSetQuotaInformationFile(filehandle: Handle, iostatusblock: MutPtr, buffer: ConstPtr, length: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtSetQuotaInformationFile(filehandle.rawAddress, iostatusblock.rawAddress, buffer.rawAddress, length.toInt())

public actual fun ntSetSecurityObject(handle: Handle, securityinformation: UInt, securitydescriptor: PsecurityDescriptor): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtSetSecurityObject(handle.rawAddress, securityinformation.toInt(), securitydescriptor.rawAddress)

public actual fun ntSetVolumeInformationFile(filehandle: Handle, iostatusblock: MutPtr, fsinformation: ConstPtr, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtSetVolumeInformationFile(filehandle.rawAddress, iostatusblock.rawAddress, fsinformation.rawAddress, length.toInt(), fsinformationclass)

public actual fun ntUnlockFile(filehandle: Handle, iostatusblock: MutPtr, byteoffset: ConstPtr, length: ConstPtr, key: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtUnlockFile(filehandle.rawAddress, iostatusblock.rawAddress, byteoffset.rawAddress, length.rawAddress, key.toInt())

public actual fun ntWriteFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, buffer: ConstPtr, length: UInt, byteoffset: ConstPtr, key: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemNtWriteFile(filehandle.rawAddress, event.rawAddress, 0L, apccontext.rawAddress, iostatusblock.rawAddress, buffer.rawAddress, length.toInt(), byteoffset.rawAddress, key.rawAddress)

public actual fun obInsertObject(obj: ConstPtr, passedaccessstate: MutPtr, desiredaccess: UInt, objectpointerbias: UInt, newobject: MutPtr, handle: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemObInsertObject(obj.rawAddress, passedaccessstate.rawAddress, desiredaccess.toInt(), objectpointerbias.toInt(), newobject.rawAddress, handle.rawAddress)

public actual fun obIsKernelHandle(handle: Handle): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemObIsKernelHandle(handle.rawAddress)

public actual fun obMakeTemporaryObject(obj: ConstPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemObMakeTemporaryObject(obj.rawAddress)
}

public actual fun obOpenObjectByPointer(obj: ConstPtr, handleattributes: UInt, passedaccessstate: ConstPtr, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, handle: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemObOpenObjectByPointer(obj.rawAddress, handleattributes.toInt(), passedaccessstate.rawAddress, desiredaccess.toInt(), objecttype, accessmode, handle.rawAddress)

public actual fun obOpenObjectByPointerWithTag(obj: ConstPtr, handleattributes: UInt, passedaccessstate: ConstPtr, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, tag: UInt, handle: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemObOpenObjectByPointerWithTag(obj.rawAddress, handleattributes.toInt(), passedaccessstate.rawAddress, desiredaccess.toInt(), objecttype, accessmode, tag.toInt(), handle.rawAddress)

public actual fun obQueryNameString(obj: ConstPtr, objectnameinfo: MutPtr, length: UInt, returnlength: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemObQueryNameString(obj.rawAddress, objectnameinfo.rawAddress, length.toInt(), returnlength.rawAddress)

public actual fun obQueryObjectAuditingByHandle(handle: Handle, generateonclose: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemObQueryObjectAuditingByHandle(handle.rawAddress, generateonclose.rawAddress)

public actual fun pfxFindPrefix(prefixtable: ConstPtr, fullname: ConstPtr): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemPfxFindPrefix(prefixtable.rawAddress, fullname.rawAddress))

public actual fun pfxInitialize(prefixtable: MutPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemPfxInitialize(prefixtable.rawAddress)
}

public actual fun pfxInsertPrefix(prefixtable: ConstPtr, prefix: ConstPtr, prefixtableentry: MutPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemPfxInsertPrefix(prefixtable.rawAddress, prefix.rawAddress, prefixtableentry.rawAddress)

public actual fun pfxRemovePrefix(prefixtable: ConstPtr, prefixtableentry: ConstPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemPfxRemovePrefix(prefixtable.rawAddress, prefixtableentry.rawAddress)
}

public actual fun poQueueShutdownWorkItem(workitem: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemPoQueueShutdownWorkItem(workitem.rawAddress)

public actual fun psAssignImpersonationToken(thread: Pethread, token: Handle): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemPsAssignImpersonationToken(thread, token.rawAddress)

public actual fun psChargePoolQuota(process: Peprocess, pooltype: PoolType, amount: ULong) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemPsChargePoolQuota(process, pooltype, amount.toLong())
}

public actual fun psChargeProcessPoolQuota(process: Peprocess, pooltype: PoolType, amount: ULong): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemPsChargeProcessPoolQuota(process, pooltype, amount.toLong())

public actual fun psDereferenceImpersonationToken(impersonationtoken: ConstPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemPsDereferenceImpersonationToken(impersonationtoken.rawAddress)
}

public actual fun psDereferencePrimaryToken(primarytoken: ConstPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemPsDereferencePrimaryToken(primarytoken.rawAddress)
}

public actual fun psDisableImpersonation(thread: Pethread, impersonationstate: MutPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemPsDisableImpersonation(thread, impersonationstate.rawAddress)

public actual fun psGetProcessExitTime(): Long =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemPsGetProcessExitTime()

public actual fun psGetThreadProcess(thread: Pethread): Peprocess =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemPsGetThreadProcess(thread)

public actual fun psImpersonateClient(thread: Pethread, token: ConstPtr, copyonopen: Boolean, effectiveonly: Boolean, impersonationlevel: SecurityImpersonationLevel): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemPsImpersonateClient(thread, token.rawAddress, copyonopen, effectiveonly, impersonationlevel)

public actual fun psIsDiskCountersEnabled(): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemPsIsDiskCountersEnabled()

public actual fun psIsSystemThread(thread: Pethread): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemPsIsSystemThread(thread)

public actual fun psIsThreadTerminating(thread: Pethread): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemPsIsThreadTerminating(thread)

public actual fun psLookupProcessByProcessId(processid: Handle, process: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemPsLookupProcessByProcessId(processid.rawAddress, process.rawAddress)

public actual fun psLookupThreadByThreadId(threadid: Handle, thread: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemPsLookupThreadByThreadId(threadid.rawAddress, thread.rawAddress)

public actual fun psReferenceImpersonationToken(thread: Pethread, copyonopen: MutPtr, effectiveonly: MutPtr, impersonationlevel: MutPtr): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemPsReferenceImpersonationToken(thread, copyonopen.rawAddress, effectiveonly.rawAddress, impersonationlevel.rawAddress))

public actual fun psReferencePrimaryToken(process: Peprocess): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemPsReferencePrimaryToken(process))

public actual fun psRestoreImpersonation(thread: Pethread, impersonationstate: ConstPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemPsRestoreImpersonation(thread, impersonationstate.rawAddress)
}

public actual fun psReturnPoolQuota(process: Peprocess, pooltype: PoolType, amount: ULong) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemPsReturnPoolQuota(process, pooltype, amount.toLong())
}

public actual fun psRevertToSelf() {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemPsRevertToSelf()
}

public actual fun psUpdateDiskCounters(process: Peprocess, bytesread: ULong, byteswritten: ULong, readoperationcount: UInt, writeoperationcount: UInt, flushoperationcount: UInt) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemPsUpdateDiskCounters(process, bytesread.toLong(), byteswritten.toLong(), readoperationcount.toInt(), writeoperationcount.toInt(), flushoperationcount.toInt())
}

public actual fun querySecurityContextToken(phcontext: ConstPtr, token: MutPtr): Hresult =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemQuerySecurityContextToken(phcontext.rawAddress, token.rawAddress)

public actual fun rtlAbsoluteToSelfRelativeSD(absolutesecuritydescriptor: PsecurityDescriptor, selfrelativesecuritydescriptor: PsecurityDescriptor, bufferlength: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlAbsoluteToSelfRelativeSD(absolutesecuritydescriptor.rawAddress, selfrelativesecuritydescriptor.rawAddress, bufferlength.rawAddress)

public actual fun rtlAddAccessAllowedAce(acl: MutPtr, acerevision: UInt, accessmask: UInt, sid: Psid): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlAddAccessAllowedAce(acl.rawAddress, acerevision.toInt(), accessmask.toInt(), sid.rawAddress)

public actual fun rtlAddAccessAllowedAceEx(acl: MutPtr, acerevision: UInt, aceflags: UInt, accessmask: UInt, sid: Psid): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlAddAccessAllowedAceEx(acl.rawAddress, acerevision.toInt(), aceflags.toInt(), accessmask.toInt(), sid.rawAddress)

public actual fun rtlAddAce(acl: MutPtr, acerevision: UInt, startingaceindex: UInt, acelist: ConstPtr, acelistlength: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlAddAce(acl.rawAddress, acerevision.toInt(), startingaceindex.toInt(), acelist.rawAddress, acelistlength.toInt())

public actual fun rtlAllocateAndInitializeSid(identifierauthority: ConstPtr, subauthoritycount: UByte, subauthority0: UInt, subauthority1: UInt, subauthority2: UInt, subauthority3: UInt, subauthority4: UInt, subauthority5: UInt, subauthority6: UInt, subauthority7: UInt, sid: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlAllocateAndInitializeSid(identifierauthority.rawAddress, subauthoritycount.toByte(), subauthority0.toInt(), subauthority1.toInt(), subauthority2.toInt(), subauthority3.toInt(), subauthority4.toInt(), subauthority5.toInt(), subauthority6.toInt(), subauthority7.toInt(), sid.rawAddress)

public actual fun rtlAllocateAndInitializeSidEx(identifierauthority: ConstPtr, subauthoritycount: UByte, subauthorities: ConstPtr, sid: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlAllocateAndInitializeSidEx(identifierauthority.rawAddress, subauthoritycount.toByte(), subauthorities.rawAddress, sid.rawAddress)

public actual fun rtlAllocateHeap(heaphandle: ConstPtr, flags: UInt, size: ULong): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlAllocateHeap(heaphandle.rawAddress, flags.toInt(), size.toLong()))

public actual fun rtlAppendStringToString(destination: MutPtr, source: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlAppendStringToString(destination.rawAddress, source.rawAddress)

public actual fun rtlCompareAltitudes(altitude1: ConstPtr, altitude2: ConstPtr): Int =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlCompareAltitudes(altitude1.rawAddress, altitude2.rawAddress)

public actual fun rtlCompareMemoryUlong(source: ConstPtr, length: ULong, pattern: UInt): ULong =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlCompareMemoryUlong(source.rawAddress, length.toLong(), pattern.toInt()).toULong()

public actual fun rtlCompressBuffer(compressionformatandengine: UShort, uncompressedbuffer: ConstPtr, uncompressedbuffersize: UInt, compressedbuffer: MutPtr, compressedbuffersize: UInt, uncompressedchunksize: UInt, finalcompressedsize: MutPtr, workspace: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlCompressBuffer(compressionformatandengine.toShort(), uncompressedbuffer.rawAddress, uncompressedbuffersize.toInt(), compressedbuffer.rawAddress, compressedbuffersize.toInt(), uncompressedchunksize.toInt(), finalcompressedsize.rawAddress, workspace.rawAddress)

public actual fun rtlCompressChunks(uncompressedbuffer: ConstPtr, uncompressedbuffersize: UInt, compressedbuffer: MutPtr, compressedbuffersize: UInt, compresseddatainfo: MutPtr, compresseddatainfolength: UInt, workspace: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlCompressChunks(uncompressedbuffer.rawAddress, uncompressedbuffersize.toInt(), compressedbuffer.rawAddress, compressedbuffersize.toInt(), compresseddatainfo.rawAddress, compresseddatainfolength.toInt(), workspace.rawAddress)

public actual fun rtlCopyLuid(destinationluid: MutPtr, sourceluid: ConstPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlCopyLuid(destinationluid.rawAddress, sourceluid.rawAddress)
}

public actual fun rtlCopySid(destinationsidlength: UInt, destinationsid: Psid, sourcesid: Psid): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlCopySid(destinationsidlength.toInt(), destinationsid.rawAddress, sourcesid.rawAddress)

public actual fun rtlCreateAcl(acl: MutPtr, acllength: UInt, aclrevision: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlCreateAcl(acl.rawAddress, acllength.toInt(), aclrevision.toInt())

public actual fun rtlCreateHeap(flags: UInt, heapbase: ConstPtr, reservesize: ULong, commitsize: ULong, lock: ConstPtr, parameters: ConstPtr): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlCreateHeap(flags.toInt(), heapbase.rawAddress, reservesize.toLong(), commitsize.toLong(), lock.rawAddress, parameters.rawAddress))

public actual fun rtlCreateServiceSid(servicename: ConstPtr, servicesid: Psid, servicesidlength: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlCreateServiceSid(servicename.rawAddress, servicesid.rawAddress, servicesidlength.rawAddress)

public actual fun rtlCreateSystemVolumeInformationFolder(volumerootpath: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlCreateSystemVolumeInformationFolder(volumerootpath.rawAddress)

public actual fun rtlCreateUnicodeString(destinationstring: MutPtr, sourcestring: Pcwstr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlCreateUnicodeString(destinationstring.rawAddress, sourcestring.rawAddress)

public actual fun rtlCreateVirtualAccountSid(name: ConstPtr, basesubauthority: UInt, sid: Psid, sidlength: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlCreateVirtualAccountSid(name.rawAddress, basesubauthority.toInt(), sid.rawAddress, sidlength.rawAddress)

public actual fun rtlCustomCPToUnicodeN(customcp: ConstPtr, unicodestring: Pwstr, maxbytesinunicodestring: UInt, bytesinunicodestring: MutPtr, customcpstring: Pcstr, bytesincustomcpstring: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlCustomCPToUnicodeN(customcp.rawAddress, unicodestring.rawAddress, maxbytesinunicodestring.toInt(), bytesinunicodestring.rawAddress, customcpstring.rawAddress, bytesincustomcpstring.toInt())

public actual fun rtlDecompressBuffer(compressionformat: UShort, uncompressedbuffer: MutPtr, uncompressedbuffersize: UInt, compressedbuffer: ConstPtr, compressedbuffersize: UInt, finaluncompressedsize: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlDecompressBuffer(compressionformat.toShort(), uncompressedbuffer.rawAddress, uncompressedbuffersize.toInt(), compressedbuffer.rawAddress, compressedbuffersize.toInt(), finaluncompressedsize.rawAddress)

public actual fun rtlDecompressBufferEx(compressionformat: UShort, uncompressedbuffer: MutPtr, uncompressedbuffersize: UInt, compressedbuffer: ConstPtr, compressedbuffersize: UInt, finaluncompressedsize: MutPtr, workspace: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlDecompressBufferEx(compressionformat.toShort(), uncompressedbuffer.rawAddress, uncompressedbuffersize.toInt(), compressedbuffer.rawAddress, compressedbuffersize.toInt(), finaluncompressedsize.rawAddress, workspace.rawAddress)

public actual fun rtlDecompressBufferEx2(compressionformat: UShort, uncompressedbuffer: MutPtr, uncompressedbuffersize: UInt, compressedbuffer: ConstPtr, compressedbuffersize: UInt, uncompressedchunksize: UInt, finaluncompressedsize: MutPtr, workspace: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlDecompressBufferEx2(compressionformat.toShort(), uncompressedbuffer.rawAddress, uncompressedbuffersize.toInt(), compressedbuffer.rawAddress, compressedbuffersize.toInt(), uncompressedchunksize.toInt(), finaluncompressedsize.rawAddress, workspace.rawAddress)

public actual fun rtlDecompressChunks(uncompressedbuffer: MutPtr, uncompressedbuffersize: UInt, compressedbuffer: ConstPtr, compressedbuffersize: UInt, compressedtail: ConstPtr, compressedtailsize: UInt, compresseddatainfo: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlDecompressChunks(uncompressedbuffer.rawAddress, uncompressedbuffersize.toInt(), compressedbuffer.rawAddress, compressedbuffersize.toInt(), compressedtail.rawAddress, compressedtailsize.toInt(), compresseddatainfo.rawAddress)

public actual fun rtlDecompressFragment(compressionformat: UShort, uncompressedfragment: MutPtr, uncompressedfragmentsize: UInt, compressedbuffer: ConstPtr, compressedbuffersize: UInt, fragmentoffset: UInt, finaluncompressedsize: MutPtr, workspace: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlDecompressFragment(compressionformat.toShort(), uncompressedfragment.rawAddress, uncompressedfragmentsize.toInt(), compressedbuffer.rawAddress, compressedbuffersize.toInt(), fragmentoffset.toInt(), finaluncompressedsize.rawAddress, workspace.rawAddress)

public actual fun rtlDecompressFragmentEx(compressionformat: UShort, uncompressedfragment: MutPtr, uncompressedfragmentsize: UInt, compressedbuffer: ConstPtr, compressedbuffersize: UInt, fragmentoffset: UInt, uncompressedchunksize: UInt, finaluncompressedsize: MutPtr, workspace: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlDecompressFragmentEx(compressionformat.toShort(), uncompressedfragment.rawAddress, uncompressedfragmentsize.toInt(), compressedbuffer.rawAddress, compressedbuffersize.toInt(), fragmentoffset.toInt(), uncompressedchunksize.toInt(), finaluncompressedsize.rawAddress, workspace.rawAddress)

public actual fun rtlDeleteAce(acl: MutPtr, aceindex: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlDeleteAce(acl.rawAddress, aceindex.toInt())

public actual fun rtlDescribeChunk(compressionformat: UShort, compressedbuffer: MutPtr, endofcompressedbufferplus1: ConstPtr, chunkbuffer: MutPtr, chunksize: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlDescribeChunk(compressionformat.toShort(), compressedbuffer.rawAddress, endofcompressedbufferplus1.rawAddress, chunkbuffer.rawAddress, chunksize.rawAddress)

public actual fun rtlDestroyHeap(heaphandle: ConstPtr): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlDestroyHeap(heaphandle.rawAddress))

public actual fun rtlDosPathNameToNtPathNameUWithStatus(dosfilename: Pcwstr, ntfilename: MutPtr, filepart: MutPtr, reserved: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlDosPathNameToNtPathNameUWithStatus(dosfilename.rawAddress, ntfilename.rawAddress, filepart.rawAddress, reserved.rawAddress)

public actual fun rtlDowncaseUnicodeString(destinationstring: MutPtr, sourcestring: ConstPtr, allocatedestinationstring: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlDowncaseUnicodeString(destinationstring.rawAddress, sourcestring.rawAddress, allocatedestinationstring)

public actual fun rtlDuplicateUnicodeString(flags: UInt, stringin: ConstPtr, stringout: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlDuplicateUnicodeString(flags.toInt(), stringin.rawAddress, stringout.rawAddress)

public actual fun rtlEqualPrefixSid(sid1: Psid, sid2: Psid): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlEqualPrefixSid(sid1.rawAddress, sid2.rawAddress)

public actual fun rtlEqualSid(sid1: Psid, sid2: Psid): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlEqualSid(sid1.rawAddress, sid2.rawAddress)

public actual fun rtlFindUnicodePrefix(prefixtable: ConstPtr, fullname: ConstPtr, caseinsensitiveindex: UInt): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlFindUnicodePrefix(prefixtable.rawAddress, fullname.rawAddress, caseinsensitiveindex.toInt()))

public actual fun rtlFreeHeap(heaphandle: ConstPtr, flags: UInt, baseaddress: ConstPtr): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlFreeHeap(heaphandle.rawAddress, flags.toInt(), baseaddress.rawAddress).toUInt()

public actual fun rtlFreeSid(sid: Psid): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlFreeSid(sid.rawAddress))

public actual fun rtlGenerate8dot3Name(name: ConstPtr, allowextendedcharacters: Boolean, context: MutPtr, name8dot3: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlGenerate8dot3Name(name.rawAddress, allowextendedcharacters, context.rawAddress, name8dot3.rawAddress)

public actual fun rtlGetAce(acl: ConstPtr, aceindex: UInt, ace: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlGetAce(acl.rawAddress, aceindex.toInt(), ace.rawAddress)

public actual fun rtlGetCompressionWorkSpaceSize(compressionformatandengine: UShort, compressbufferworkspacesize: MutPtr, compressfragmentworkspacesize: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlGetCompressionWorkSpaceSize(compressionformatandengine.toShort(), compressbufferworkspacesize.rawAddress, compressfragmentworkspacesize.rawAddress)

public actual fun rtlGetDaclSecurityDescriptor(securitydescriptor: PsecurityDescriptor, daclpresent: MutPtr, dacl: MutPtr, dacldefaulted: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlGetDaclSecurityDescriptor(securitydescriptor.rawAddress, daclpresent.rawAddress, dacl.rawAddress, dacldefaulted.rawAddress)

public actual fun rtlGetGroupSecurityDescriptor(securitydescriptor: PsecurityDescriptor, group: MutPtr, groupdefaulted: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlGetGroupSecurityDescriptor(securitydescriptor.rawAddress, group.rawAddress, groupdefaulted.rawAddress)

public actual fun rtlGetOwnerSecurityDescriptor(securitydescriptor: PsecurityDescriptor, owner: MutPtr, ownerdefaulted: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlGetOwnerSecurityDescriptor(securitydescriptor.rawAddress, owner.rawAddress, ownerdefaulted.rawAddress)

public actual fun rtlGetSaclSecurityDescriptor(securitydescriptor: PsecurityDescriptor, saclpresent: MutPtr, sacl: MutPtr, sacldefaulted: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlGetSaclSecurityDescriptor(securitydescriptor.rawAddress, saclpresent.rawAddress, sacl.rawAddress, sacldefaulted.rawAddress)

public actual fun rtlIdentifierAuthoritySid(sid: Psid): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlIdentifierAuthoritySid(sid.rawAddress))

public actual fun rtlIdnToAscii(flags: UInt, sourcestring: Pcwstr, sourcestringlength: Int, destinationstring: Pwstr, destinationstringlength: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlIdnToAscii(flags.toInt(), sourcestring.rawAddress, sourcestringlength, destinationstring.rawAddress, destinationstringlength.rawAddress)

public actual fun rtlIdnToNameprepUnicode(flags: UInt, sourcestring: Pcwstr, sourcestringlength: Int, destinationstring: Pwstr, destinationstringlength: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlIdnToNameprepUnicode(flags.toInt(), sourcestring.rawAddress, sourcestringlength, destinationstring.rawAddress, destinationstringlength.rawAddress)

public actual fun rtlIdnToUnicode(flags: UInt, sourcestring: Pcwstr, sourcestringlength: Int, destinationstring: Pwstr, destinationstringlength: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlIdnToUnicode(flags.toInt(), sourcestring.rawAddress, sourcestringlength, destinationstring.rawAddress, destinationstringlength.rawAddress)

public actual fun rtlInitCodePageTable(tablebase: ConstPtr, codepagetable: MutPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlInitCodePageTable(tablebase.rawAddress, codepagetable.rawAddress)
}

public actual fun rtlInitUnicodeStringEx(destinationstring: MutPtr, sourcestring: Pcwstr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlInitUnicodeStringEx(destinationstring.rawAddress, sourcestring.rawAddress)

public actual fun rtlInitializeSid(sid: Psid, identifierauthority: ConstPtr, subauthoritycount: UByte): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlInitializeSid(sid.rawAddress, identifierauthority.rawAddress, subauthoritycount.toByte())

public actual fun rtlInitializeSidEx(sid: Psid, identifierauthority: ConstPtr, subauthoritycount: UByte, vararg variadicArgs: Long): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlInitializeSidEx(sid.rawAddress, identifierauthority.rawAddress, subauthoritycount.toByte(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun rtlInitializeUnicodePrefix(prefixtable: MutPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlInitializeUnicodePrefix(prefixtable.rawAddress)
}

public actual fun rtlInsertUnicodePrefix(prefixtable: ConstPtr, prefix: ConstPtr, prefixtableentry: MutPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlInsertUnicodePrefix(prefixtable.rawAddress, prefix.rawAddress, prefixtableentry.rawAddress)

public actual fun rtlIsCloudFilesPlaceholder(fileattributes: UInt, reparsetag: UInt): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlIsCloudFilesPlaceholder(fileattributes.toInt(), reparsetag.toInt())

public actual fun rtlIsDosDeviceNameU(dosfilename: Pcwstr): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlIsDosDeviceNameU(dosfilename.rawAddress).toUInt()

public actual fun rtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag: UInt): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag.toInt())

public actual fun rtlIsNormalizedString(normform: UInt, sourcestring: Pcwstr, sourcestringlength: Int, normalized: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlIsNormalizedString(normform.toInt(), sourcestring.rawAddress, sourcestringlength, normalized.rawAddress)

public actual fun rtlIsPartialPlaceholder(fileattributes: UInt, reparsetag: UInt): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlIsPartialPlaceholder(fileattributes.toInt(), reparsetag.toInt())

public actual fun rtlIsPartialPlaceholderFileHandle(filehandle: Handle, ispartialplaceholder: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlIsPartialPlaceholderFileHandle(filehandle.rawAddress, ispartialplaceholder.rawAddress)

public actual fun rtlIsPartialPlaceholderFileInfo(infobuffer: ConstPtr, infoclass: FileInformationClass, ispartialplaceholder: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlIsPartialPlaceholderFileInfo(infobuffer.rawAddress, infoclass, ispartialplaceholder.rawAddress)

public actual fun rtlIsSandboxedToken(context: ConstPtr, previousmode: Byte): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlIsSandboxedToken(context.rawAddress, previousmode)

public actual fun rtlIsValidOemCharacter(char: Pwstr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlIsValidOemCharacter(char.rawAddress)

public actual fun rtlLengthRequiredSid(subauthoritycount: UInt): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlLengthRequiredSid(subauthoritycount.toInt()).toUInt()

public actual fun rtlLengthSid(sid: Psid): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlLengthSid(sid.rawAddress).toUInt()

public actual fun rtlMultiByteToUnicodeN(unicodestring: Pwstr, maxbytesinunicodestring: UInt, bytesinunicodestring: MutPtr, multibytestring: Pcstr, bytesinmultibytestring: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlMultiByteToUnicodeN(unicodestring.rawAddress, maxbytesinunicodestring.toInt(), bytesinunicodestring.rawAddress, multibytestring.rawAddress, bytesinmultibytestring.toInt())

public actual fun rtlMultiByteToUnicodeSize(bytesinunicodestring: MutPtr, multibytestring: Pcstr, bytesinmultibytestring: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlMultiByteToUnicodeSize(bytesinunicodestring.rawAddress, multibytestring.rawAddress, bytesinmultibytestring.toInt())

public actual fun rtlNextUnicodePrefix(prefixtable: ConstPtr, restart: Boolean): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlNextUnicodePrefix(prefixtable.rawAddress, restart))

public actual fun rtlNormalizeString(normform: UInt, sourcestring: Pcwstr, sourcestringlength: Int, destinationstring: Pwstr, destinationstringlength: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlNormalizeString(normform.toInt(), sourcestring.rawAddress, sourcestringlength, destinationstring.rawAddress, destinationstringlength.rawAddress)

public actual fun rtlNtStatusToDosErrorNoTeb(status: Ntstatus): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlNtStatusToDosErrorNoTeb(status).toUInt()

public actual fun rtlOemStringToCountedUnicodeString(destinationstring: MutPtr, sourcestring: ConstPtr, allocatedestinationstring: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlOemStringToCountedUnicodeString(destinationstring.rawAddress, sourcestring.rawAddress, allocatedestinationstring)

public actual fun rtlOemStringToUnicodeString(destinationstring: MutPtr, sourcestring: ConstPtr, allocatedestinationstring: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlOemStringToUnicodeString(destinationstring.rawAddress, sourcestring.rawAddress, allocatedestinationstring)

public actual fun rtlOemToUnicodeN(unicodestring: Pwstr, maxbytesinunicodestring: UInt, bytesinunicodestring: MutPtr, oemstring: Pcstr, bytesinoemstring: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlOemToUnicodeN(unicodestring.rawAddress, maxbytesinunicodestring.toInt(), bytesinunicodestring.rawAddress, oemstring.rawAddress, bytesinoemstring.toInt())

public actual fun rtlPrefixString(string1: ConstPtr, string2: ConstPtr, caseinsensitive: Boolean): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlPrefixString(string1.rawAddress, string2.rawAddress, caseinsensitive)

public actual fun rtlQueryPackageIdentity(tokenobject: ConstPtr, packagefullname: Pwstr, packagesize: MutPtr, appid: Pwstr, appidsize: MutPtr, packaged: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlQueryPackageIdentity(tokenobject.rawAddress, packagefullname.rawAddress, packagesize.rawAddress, appid.rawAddress, appidsize.rawAddress, packaged.rawAddress)

public actual fun rtlQueryPackageIdentityEx(tokenobject: ConstPtr, packagefullname: Pwstr, packagesize: MutPtr, appid: Pwstr, appidsize: MutPtr, dynamicid: MutPtr, flags: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlQueryPackageIdentityEx(tokenobject.rawAddress, packagefullname.rawAddress, packagesize.rawAddress, appid.rawAddress, appidsize.rawAddress, dynamicid.rawAddress, flags.rawAddress)

public actual fun rtlQueryProcessPlaceholderCompatibilityMode(): Byte =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlQueryProcessPlaceholderCompatibilityMode()

public actual fun rtlQueryThreadPlaceholderCompatibilityMode(): Byte =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlQueryThreadPlaceholderCompatibilityMode()

public actual fun rtlRandom(seed: MutPtr): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlRandom(seed.rawAddress).toUInt()

public actual fun rtlRandomEx(seed: MutPtr): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlRandomEx(seed.rawAddress).toUInt()

public actual fun rtlRemoveUnicodePrefix(prefixtable: ConstPtr, prefixtableentry: ConstPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlRemoveUnicodePrefix(prefixtable.rawAddress, prefixtableentry.rawAddress)
}

public actual fun rtlReplaceSidInSd(securitydescriptor: PsecurityDescriptor, oldsid: Psid, newsid: Psid, numchanges: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlReplaceSidInSd(securitydescriptor.rawAddress, oldsid.rawAddress, newsid.rawAddress, numchanges.rawAddress)

public actual fun rtlReserveChunk(compressionformat: UShort, compressedbuffer: MutPtr, endofcompressedbufferplus1: ConstPtr, chunkbuffer: MutPtr, chunksize: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlReserveChunk(compressionformat.toShort(), compressedbuffer.rawAddress, endofcompressedbufferplus1.rawAddress, chunkbuffer.rawAddress, chunksize.toInt())

public actual fun rtlSecondsSince1970ToTime(elapsedseconds: UInt, time: MutPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlSecondsSince1970ToTime(elapsedseconds.toInt(), time.rawAddress)
}

public actual fun rtlSecondsSince1980ToTime(elapsedseconds: UInt, time: MutPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlSecondsSince1980ToTime(elapsedseconds.toInt(), time.rawAddress)
}

public actual fun rtlSelfRelativeToAbsoluteSD(selfrelativesecuritydescriptor: PsecurityDescriptor, absolutesecuritydescriptor: PsecurityDescriptor, absolutesecuritydescriptorsize: MutPtr, dacl: MutPtr, daclsize: MutPtr, sacl: MutPtr, saclsize: MutPtr, owner: Psid, ownersize: MutPtr, primarygroup: Psid, primarygroupsize: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlSelfRelativeToAbsoluteSD(selfrelativesecuritydescriptor.rawAddress, absolutesecuritydescriptor.rawAddress, absolutesecuritydescriptorsize.rawAddress, dacl.rawAddress, daclsize.rawAddress, sacl.rawAddress, saclsize.rawAddress, owner.rawAddress, ownersize.rawAddress, primarygroup.rawAddress, primarygroupsize.rawAddress)

public actual fun rtlSetGroupSecurityDescriptor(securitydescriptor: PsecurityDescriptor, group: Psid, groupdefaulted: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlSetGroupSecurityDescriptor(securitydescriptor.rawAddress, group.rawAddress, groupdefaulted)

public actual fun rtlSetOwnerSecurityDescriptor(securitydescriptor: PsecurityDescriptor, owner: Psid, ownerdefaulted: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlSetOwnerSecurityDescriptor(securitydescriptor.rawAddress, owner.rawAddress, ownerdefaulted)

public actual fun rtlSetProcessPlaceholderCompatibilityMode(mode: Byte): Byte =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlSetProcessPlaceholderCompatibilityMode(mode)

public actual fun rtlSetThreadPlaceholderCompatibilityMode(mode: Byte): Byte =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlSetThreadPlaceholderCompatibilityMode(mode)

public actual fun rtlSubAuthorityCountSid(sid: Psid): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlSubAuthorityCountSid(sid.rawAddress))

public actual fun rtlSubAuthoritySid(sid: Psid, subauthority: UInt): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlSubAuthoritySid(sid.rawAddress, subauthority.toInt()))

public actual fun rtlTimeToSecondsSince1980(time: ConstPtr, elapsedseconds: MutPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlTimeToSecondsSince1980(time.rawAddress, elapsedseconds.rawAddress)

public actual fun rtlUnicodeStringToCountedOemString(destinationstring: MutPtr, sourcestring: ConstPtr, allocatedestinationstring: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlUnicodeStringToCountedOemString(destinationstring.rawAddress, sourcestring.rawAddress, allocatedestinationstring)

public actual fun rtlUnicodeToCustomCPN(customcp: ConstPtr, customcpstring: Pstr, maxbytesincustomcpstring: UInt, bytesincustomcpstring: MutPtr, unicodestring: Pcwstr, bytesinunicodestring: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlUnicodeToCustomCPN(customcp.rawAddress, customcpstring.rawAddress, maxbytesincustomcpstring.toInt(), bytesincustomcpstring.rawAddress, unicodestring.rawAddress, bytesinunicodestring.toInt())

public actual fun rtlUnicodeToMultiByteN(multibytestring: Pstr, maxbytesinmultibytestring: UInt, bytesinmultibytestring: MutPtr, unicodestring: ConstPtr, bytesinunicodestring: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlUnicodeToMultiByteN(multibytestring.rawAddress, maxbytesinmultibytestring.toInt(), bytesinmultibytestring.rawAddress, unicodestring.rawAddress, bytesinunicodestring.toInt())

public actual fun rtlUnicodeToOemN(oemstring: Pstr, maxbytesinoemstring: UInt, bytesinoemstring: MutPtr, unicodestring: ConstPtr, bytesinunicodestring: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlUnicodeToOemN(oemstring.rawAddress, maxbytesinoemstring.toInt(), bytesinoemstring.rawAddress, unicodestring.rawAddress, bytesinunicodestring.toInt())

public actual fun rtlUpcaseUnicodeStringToCountedOemString(destinationstring: MutPtr, sourcestring: ConstPtr, allocatedestinationstring: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlUpcaseUnicodeStringToCountedOemString(destinationstring.rawAddress, sourcestring.rawAddress, allocatedestinationstring)

public actual fun rtlUpcaseUnicodeStringToOemString(destinationstring: MutPtr, sourcestring: ConstPtr, allocatedestinationstring: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlUpcaseUnicodeStringToOemString(destinationstring.rawAddress, sourcestring.rawAddress, allocatedestinationstring)

public actual fun rtlUpcaseUnicodeToCustomCPN(customcp: ConstPtr, customcpstring: Pstr, maxbytesincustomcpstring: UInt, bytesincustomcpstring: MutPtr, unicodestring: Pcwstr, bytesinunicodestring: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlUpcaseUnicodeToCustomCPN(customcp.rawAddress, customcpstring.rawAddress, maxbytesincustomcpstring.toInt(), bytesincustomcpstring.rawAddress, unicodestring.rawAddress, bytesinunicodestring.toInt())

public actual fun rtlUpcaseUnicodeToMultiByteN(multibytestring: Pstr, maxbytesinmultibytestring: UInt, bytesinmultibytestring: MutPtr, unicodestring: ConstPtr, bytesinunicodestring: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlUpcaseUnicodeToMultiByteN(multibytestring.rawAddress, maxbytesinmultibytestring.toInt(), bytesinmultibytestring.rawAddress, unicodestring.rawAddress, bytesinunicodestring.toInt())

public actual fun rtlUpcaseUnicodeToOemN(oemstring: Pstr, maxbytesinoemstring: UInt, bytesinoemstring: MutPtr, unicodestring: ConstPtr, bytesinunicodestring: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlUpcaseUnicodeToOemN(oemstring.rawAddress, maxbytesinoemstring.toInt(), bytesinoemstring.rawAddress, unicodestring.rawAddress, bytesinunicodestring.toInt())

public actual fun rtlValidSid(sid: Psid): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlValidSid(sid.rawAddress)

public actual fun rtlValidateUnicodeString(flags: UInt, string: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlValidateUnicodeString(flags.toInt(), string.rawAddress)

public actual fun rtlxOemStringToUnicodeSize(oemstring: ConstPtr): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlxOemStringToUnicodeSize(oemstring.rawAddress).toUInt()

public actual fun rtlxUnicodeStringToOemSize(unicodestring: ConstPtr): UInt =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemRtlxUnicodeStringToOemSize(unicodestring.rawAddress).toUInt()

public actual fun seAccessCheckFromState(securitydescriptor: PsecurityDescriptor, primarytokeninformation: ConstPtr, clienttokeninformation: ConstPtr, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: MutPtr, genericmapping: ConstPtr, accessmode: Byte, grantedaccess: MutPtr, accessstatus: MutPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeAccessCheckFromState(securitydescriptor.rawAddress, primarytokeninformation.rawAddress, clienttokeninformation.rawAddress, desiredaccess.toInt(), previouslygrantedaccess.toInt(), privileges.rawAddress, genericmapping.rawAddress, accessmode, grantedaccess.rawAddress, accessstatus.rawAddress)

public actual fun seAccessCheckFromStateEx(securitydescriptor: PsecurityDescriptor, primarytoken: ConstPtr, clienttoken: ConstPtr, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: MutPtr, genericmapping: ConstPtr, accessmode: Byte, grantedaccess: MutPtr, accessstatus: MutPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeAccessCheckFromStateEx(securitydescriptor.rawAddress, primarytoken.rawAddress, clienttoken.rawAddress, desiredaccess.toInt(), previouslygrantedaccess.toInt(), privileges.rawAddress, genericmapping.rawAddress, accessmode, grantedaccess.rawAddress, accessstatus.rawAddress)

public actual fun seAdjustAccessStateForAccessConstraints(objecttype: ConstPtr, securitydescriptor: PsecurityDescriptor, accessstate: MutPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeAdjustAccessStateForAccessConstraints(objecttype.rawAddress, securitydescriptor.rawAddress, accessstate.rawAddress)
}

public actual fun seAdjustAccessStateForTrustLabel(objecttype: ConstPtr, securitydescriptor: PsecurityDescriptor, accessstate: MutPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeAdjustAccessStateForTrustLabel(objecttype.rawAddress, securitydescriptor.rawAddress, accessstate.rawAddress)
}

public actual fun seAdjustObjectSecurity(objectname: ConstPtr, originaldescriptor: PsecurityDescriptor, proposeddescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr, adjusteddescriptor: MutPtr, applyadjusteddescriptor: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeAdjustObjectSecurity(objectname.rawAddress, originaldescriptor.rawAddress, proposeddescriptor.rawAddress, subjectsecuritycontext.rawAddress, adjusteddescriptor.rawAddress, applyadjusteddescriptor.rawAddress)

public actual fun seAppendPrivileges(accessstate: MutPtr, privileges: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeAppendPrivileges(accessstate.rawAddress, privileges.rawAddress)

public actual fun seAuditFipsCryptoSelftests(bsuccess: Boolean, selftestcode: UInt) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeAuditFipsCryptoSelftests(bsuccess, selftestcode.toInt())
}

public actual fun seAuditHardLinkCreation(filename: ConstPtr, linkname: ConstPtr, bsuccess: Boolean) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeAuditHardLinkCreation(filename.rawAddress, linkname.rawAddress, bsuccess)
}

public actual fun seAuditHardLinkCreationWithTransaction(filename: ConstPtr, linkname: ConstPtr, bsuccess: Boolean, transactionid: ConstPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeAuditHardLinkCreationWithTransaction(filename.rawAddress, linkname.rawAddress, bsuccess, transactionid.rawAddress)
}

public actual fun seAuditTransactionStateChange(transactionid: ConstPtr, resourcemanagerid: ConstPtr, newtransactionstate: UInt) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeAuditTransactionStateChange(transactionid.rawAddress, resourcemanagerid.rawAddress, newtransactionstate.toInt())
}

public actual fun seAuditingAnyFileEventsWithContext(securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeAuditingAnyFileEventsWithContext(securitydescriptor.rawAddress, subjectsecuritycontext.rawAddress)

public actual fun seAuditingAnyFileEventsWithContextEx(securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr, stagingenabled: MutPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeAuditingAnyFileEventsWithContextEx(securitydescriptor.rawAddress, subjectsecuritycontext.rawAddress, stagingenabled.rawAddress)

public actual fun seAuditingFileEvents(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeAuditingFileEvents(accessgranted, securitydescriptor.rawAddress)

public actual fun seAuditingFileEventsWithContext(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeAuditingFileEventsWithContext(accessgranted, securitydescriptor.rawAddress, subjectsecuritycontext.rawAddress)

public actual fun seAuditingFileEventsWithContextEx(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr, stagingenabled: MutPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeAuditingFileEventsWithContextEx(accessgranted, securitydescriptor.rawAddress, subjectsecuritycontext.rawAddress, stagingenabled.rawAddress)

public actual fun seAuditingFileOrGlobalEvents(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeAuditingFileOrGlobalEvents(accessgranted, securitydescriptor.rawAddress, subjectsecuritycontext.rawAddress)

public actual fun seAuditingHardLinkEvents(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeAuditingHardLinkEvents(accessgranted, securitydescriptor.rawAddress)

public actual fun seAuditingHardLinkEventsWithContext(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeAuditingHardLinkEventsWithContext(accessgranted, securitydescriptor.rawAddress, subjectsecuritycontext.rawAddress)

public actual fun seCaptureSubjectContextEx(thread: Pethread, process: Peprocess, subjectcontext: MutPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeCaptureSubjectContextEx(thread, process, subjectcontext.rawAddress)
}

public actual fun seCheckForCriticalAceRemoval(currentdescriptor: PsecurityDescriptor, newdescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr, aceremoved: MutPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeCheckForCriticalAceRemoval(currentdescriptor.rawAddress, newdescriptor.rawAddress, subjectsecuritycontext.rawAddress, aceremoved.rawAddress)
}

public actual fun seCreateClientSecurity(clientthread: Pethread, clientsecurityqos: ConstPtr, remotesession: Boolean, clientcontext: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeCreateClientSecurity(clientthread, clientsecurityqos.rawAddress, remotesession, clientcontext.rawAddress)

public actual fun seCreateClientSecurityFromSubjectContext(subjectcontext: ConstPtr, clientsecurityqos: ConstPtr, serverisremote: Boolean, clientcontext: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeCreateClientSecurityFromSubjectContext(subjectcontext.rawAddress, clientsecurityqos.rawAddress, serverisremote, clientcontext.rawAddress)

public actual fun seDeleteClientSecurity(clientcontext: MutPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeDeleteClientSecurity(clientcontext.rawAddress)
}

public actual fun seDeleteObjectAuditAlarm(obj: ConstPtr, handle: Handle) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeDeleteObjectAuditAlarm(obj.rawAddress, handle.rawAddress)
}

public actual fun seDeleteObjectAuditAlarmWithTransaction(obj: ConstPtr, handle: Handle, transactionid: ConstPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeDeleteObjectAuditAlarmWithTransaction(obj.rawAddress, handle.rawAddress, transactionid.rawAddress)
}

public actual fun seExamineSacl(sacl: ConstPtr, resourcesacl: ConstPtr, token: ConstPtr, desiredaccess: UInt, accessgranted: Boolean, generateaudit: MutPtr, generatealarm: MutPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeExamineSacl(sacl.rawAddress, resourcesacl.rawAddress, token.rawAddress, desiredaccess.toInt(), accessgranted, generateaudit.rawAddress, generatealarm.rawAddress)
}

public actual fun seFilterToken(existingtoken: ConstPtr, flags: UInt, sidstodisable: ConstPtr, privilegestodelete: ConstPtr, restrictedsids: ConstPtr, filteredtoken: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeFilterToken(existingtoken.rawAddress, flags.toInt(), sidstodisable.rawAddress, privilegestodelete.rawAddress, restrictedsids.rawAddress, filteredtoken.rawAddress)

public actual fun seFreePrivileges(privileges: ConstPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeFreePrivileges(privileges.rawAddress)
}

public actual fun seImpersonateClient(clientcontext: ConstPtr, serverthread: Pethread) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeImpersonateClient(clientcontext.rawAddress, serverthread)
}

public actual fun seImpersonateClientEx(clientcontext: ConstPtr, serverthread: Pethread): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeImpersonateClientEx(clientcontext.rawAddress, serverthread)

public actual fun seLocateProcessImageName(process: Peprocess, pimagefilename: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeLocateProcessImageName(process, pimagefilename.rawAddress)

public actual fun seMarkLogonSessionForTerminationNotification(logonid: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeMarkLogonSessionForTerminationNotification(logonid.rawAddress)

public actual fun seMarkLogonSessionForTerminationNotificationEx(logonid: ConstPtr, pserversilo: Pesilo): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeMarkLogonSessionForTerminationNotificationEx(logonid.rawAddress, pserversilo)

public actual fun seOpenObjectAuditAlarm(objecttypename: ConstPtr, obj: ConstPtr, absoluteobjectname: ConstPtr, securitydescriptor: PsecurityDescriptor, accessstate: ConstPtr, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, generateonclose: MutPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeOpenObjectAuditAlarm(objecttypename.rawAddress, obj.rawAddress, absoluteobjectname.rawAddress, securitydescriptor.rawAddress, accessstate.rawAddress, objectcreated, accessgranted, accessmode, generateonclose.rawAddress)
}

public actual fun seOpenObjectAuditAlarmWithTransaction(objecttypename: ConstPtr, obj: ConstPtr, absoluteobjectname: ConstPtr, securitydescriptor: PsecurityDescriptor, accessstate: ConstPtr, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, transactionid: ConstPtr, generateonclose: MutPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeOpenObjectAuditAlarmWithTransaction(objecttypename.rawAddress, obj.rawAddress, absoluteobjectname.rawAddress, securitydescriptor.rawAddress, accessstate.rawAddress, objectcreated, accessgranted, accessmode, transactionid.rawAddress, generateonclose.rawAddress)
}

public actual fun seOpenObjectForDeleteAuditAlarm(objecttypename: ConstPtr, obj: ConstPtr, absoluteobjectname: ConstPtr, securitydescriptor: PsecurityDescriptor, accessstate: ConstPtr, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, generateonclose: MutPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeOpenObjectForDeleteAuditAlarm(objecttypename.rawAddress, obj.rawAddress, absoluteobjectname.rawAddress, securitydescriptor.rawAddress, accessstate.rawAddress, objectcreated, accessgranted, accessmode, generateonclose.rawAddress)
}

public actual fun seOpenObjectForDeleteAuditAlarmWithTransaction(objecttypename: ConstPtr, obj: ConstPtr, absoluteobjectname: ConstPtr, securitydescriptor: PsecurityDescriptor, accessstate: ConstPtr, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, transactionid: ConstPtr, generateonclose: MutPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeOpenObjectForDeleteAuditAlarmWithTransaction(objecttypename.rawAddress, obj.rawAddress, absoluteobjectname.rawAddress, securitydescriptor.rawAddress, accessstate.rawAddress, objectcreated, accessgranted, accessmode, transactionid.rawAddress, generateonclose.rawAddress)
}

public actual fun sePrivilegeCheck(requiredprivileges: MutPtr, subjectsecuritycontext: ConstPtr, accessmode: Byte): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSePrivilegeCheck(requiredprivileges.rawAddress, subjectsecuritycontext.rawAddress, accessmode)

public actual fun seQueryAuthenticationIdToken(token: ConstPtr, authenticationid: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeQueryAuthenticationIdToken(token.rawAddress, authenticationid.rawAddress)

public actual fun seQueryInformationToken(token: ConstPtr, tokeninformationclass: TokenInformationClass, tokeninformation: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeQueryInformationToken(token.rawAddress, tokeninformationclass, tokeninformation.rawAddress)

public actual fun seQuerySecurityDescriptorInfo(securityinformation: ConstPtr, securitydescriptor: PsecurityDescriptor, length: MutPtr, objectssecuritydescriptor: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeQuerySecurityDescriptorInfo(securityinformation.rawAddress, securitydescriptor.rawAddress, length.rawAddress, objectssecuritydescriptor.rawAddress)

public actual fun seQueryServerSiloToken(token: ConstPtr, pserversilo: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeQueryServerSiloToken(token.rawAddress, pserversilo.rawAddress)

public actual fun seQuerySessionIdToken(token: ConstPtr, sessionid: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeQuerySessionIdToken(token.rawAddress, sessionid.rawAddress)

public actual fun seQuerySessionIdTokenEx(token: ConstPtr, sessionid: MutPtr, isservicesession: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeQuerySessionIdTokenEx(token.rawAddress, sessionid.rawAddress, isservicesession.rawAddress)

public actual fun seRegisterLogonSessionTerminatedRoutine(callbackroutine: PseLogonSessionTerminatedRoutine): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeRegisterLogonSessionTerminatedRoutine(0L)

public actual fun seRegisterLogonSessionTerminatedRoutineEx(callbackroutine: PseLogonSessionTerminatedRoutineEx, context: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeRegisterLogonSessionTerminatedRoutineEx(0L, context.rawAddress)

public actual fun seReportSecurityEventWithSubCategory(flags: UInt, sourcename: ConstPtr, usersid: Psid, auditparameters: ConstPtr, auditsubcategoryid: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeReportSecurityEventWithSubCategory(flags.toInt(), sourcename.rawAddress, usersid.rawAddress, auditparameters.rawAddress, auditsubcategoryid.toInt())

public actual fun seSetAccessStateGenericMapping(accessstate: MutPtr, genericmapping: ConstPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeSetAccessStateGenericMapping(accessstate.rawAddress, genericmapping.rawAddress)
}

public actual fun seSetSecurityDescriptorInfo(obj: ConstPtr, securityinformation: ConstPtr, modificationdescriptor: PsecurityDescriptor, objectssecuritydescriptor: MutPtr, pooltype: PoolType, genericmapping: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeSetSecurityDescriptorInfo(obj.rawAddress, securityinformation.rawAddress, modificationdescriptor.rawAddress, objectssecuritydescriptor.rawAddress, pooltype, genericmapping.rawAddress)

public actual fun seSetSecurityDescriptorInfoEx(obj: ConstPtr, securityinformation: ConstPtr, modificationdescriptor: PsecurityDescriptor, objectssecuritydescriptor: MutPtr, autoinheritflags: UInt, pooltype: PoolType, genericmapping: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeSetSecurityDescriptorInfoEx(obj.rawAddress, securityinformation.rawAddress, modificationdescriptor.rawAddress, objectssecuritydescriptor.rawAddress, autoinheritflags.toInt(), pooltype, genericmapping.rawAddress)

public actual fun seShouldCheckForAccessRightsFromParent(objecttype: ConstPtr, childdescriptor: PsecurityDescriptor, accessstate: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeShouldCheckForAccessRightsFromParent(objecttype.rawAddress, childdescriptor.rawAddress, accessstate.rawAddress)

public actual fun seTokenFromAccessInformation(accessinformation: ConstPtr, token: MutPtr, length: UInt, requiredlength: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeTokenFromAccessInformation(accessinformation.rawAddress, token.rawAddress, length.toInt(), requiredlength.rawAddress)

public actual fun seTokenIsAdmin(token: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeTokenIsAdmin(token.rawAddress)

public actual fun seTokenIsRestricted(token: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeTokenIsRestricted(token.rawAddress)

public actual fun seTokenIsWriteRestricted(token: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeTokenIsWriteRestricted(token.rawAddress)

public actual fun seTokenType(token: ConstPtr): TokenType =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeTokenType(token.rawAddress)

public actual fun seUnregisterLogonSessionTerminatedRoutine(callbackroutine: PseLogonSessionTerminatedRoutine): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeUnregisterLogonSessionTerminatedRoutine(0L)

public actual fun seUnregisterLogonSessionTerminatedRoutineEx(callbackroutine: PseLogonSessionTerminatedRoutineEx, context: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSeUnregisterLogonSessionTerminatedRoutineEx(0L, context.rawAddress)

public actual fun secLookupAccountName(name: ConstPtr, sidsize: MutPtr, sid: Psid, nameuse: MutPtr, domainsize: MutPtr, referenceddomain: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSecLookupAccountName(name.rawAddress, sidsize.rawAddress, sid.rawAddress, nameuse.rawAddress, domainsize.rawAddress, referenceddomain.rawAddress)

public actual fun secLookupAccountSid(sid: Psid, namesize: MutPtr, namebuffer: MutPtr, domainsize: MutPtr, domainbuffer: MutPtr, nameuse: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSecLookupAccountSid(sid.rawAddress, namesize.rawAddress, namebuffer.rawAddress, domainsize.rawAddress, domainbuffer.rawAddress, nameuse.rawAddress)

public actual fun secLookupWellKnownSid(sidtype: WellKnownSidType, sid: Psid, sidbuffersize: UInt, sidsize: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSecLookupWellKnownSid(sidtype, sid.rawAddress, sidbuffersize.toInt(), sidsize.rawAddress)

public actual fun secMakeSPN(serviceclass: MutPtr, servicename: MutPtr, instancename: MutPtr, instanceport: UShort, referrer: MutPtr, spn: MutPtr, length: MutPtr, allocate: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSecMakeSPN(serviceclass.rawAddress, servicename.rawAddress, instancename.rawAddress, instanceport.toShort(), referrer.rawAddress, spn.rawAddress, length.rawAddress, allocate)

public actual fun secMakeSPNEx(serviceclass: MutPtr, servicename: MutPtr, instancename: MutPtr, instanceport: UShort, referrer: MutPtr, targetinfo: MutPtr, spn: MutPtr, length: MutPtr, allocate: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSecMakeSPNEx(serviceclass.rawAddress, servicename.rawAddress, instancename.rawAddress, instanceport.toShort(), referrer.rawAddress, targetinfo.rawAddress, spn.rawAddress, length.rawAddress, allocate)

public actual fun secMakeSPNEx2(serviceclass: MutPtr, servicename: MutPtr, instancename: MutPtr, instanceport: UShort, referrer: MutPtr, intargetinfo: MutPtr, spn: MutPtr, totalsize: MutPtr, allocate: Boolean, istargetinfomarshaled: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSecMakeSPNEx2(serviceclass.rawAddress, servicename.rawAddress, instancename.rawAddress, instanceport.toShort(), referrer.rawAddress, intargetinfo.rawAddress, spn.rawAddress, totalsize.rawAddress, allocate, istargetinfomarshaled)

public actual fun setContextAttributesW(phcontext: ConstPtr, ulattribute: UInt, pbuffer: ConstPtr, cbbuffer: UInt): Hresult =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSetContextAttributesW(phcontext.rawAddress, ulattribute.toInt(), pbuffer.rawAddress, cbbuffer.toInt())

public actual fun sspiAcceptSecurityContextAsync(asynccontext: MutPtr, phcredential: ConstPtr, phcontext: ConstPtr, pinput: ConstPtr, fcontextreq: UInt, targetdatarep: UInt, phnewcontext: ConstPtr, poutput: ConstPtr, pfcontextattr: ConstPtr, ptsexpiry: ConstPtr): Hresult =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSspiAcceptSecurityContextAsync(asynccontext.rawAddress, phcredential.rawAddress, phcontext.rawAddress, pinput.rawAddress, fcontextreq.toInt(), targetdatarep.toInt(), phnewcontext.rawAddress, poutput.rawAddress, pfcontextattr.rawAddress, ptsexpiry.rawAddress)

public actual fun sspiAcquireCredentialsHandleAsyncA(asynccontext: MutPtr, pszprincipal: Pcstr, pszpackage: Pcstr, fcredentialuse: UInt, pvlogonid: ConstPtr, pauthdata: ConstPtr, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: ConstPtr, phcredential: ConstPtr, ptsexpiry: ConstPtr): Hresult =
    0

public actual fun sspiAcquireCredentialsHandleAsyncW(asynccontext: MutPtr, pszprincipal: ConstPtr, pszpackage: ConstPtr, fcredentialuse: UInt, pvlogonid: ConstPtr, pauthdata: ConstPtr, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: ConstPtr, phcredential: ConstPtr, ptsexpiry: ConstPtr): Hresult =
    0

public actual fun sspiCreateAsyncContext(): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSspiCreateAsyncContext())

public actual fun sspiDeleteSecurityContextAsync(asynccontext: MutPtr, phcontext: ConstPtr): Hresult =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSspiDeleteSecurityContextAsync(asynccontext.rawAddress, phcontext.rawAddress)

public actual fun sspiFreeAsyncContext(handle: ConstPtr) {
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSspiFreeAsyncContext(handle.rawAddress)
}

public actual fun sspiFreeCredentialsHandleAsync(asynccontext: MutPtr, phcredential: ConstPtr): Hresult =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSspiFreeCredentialsHandleAsync(asynccontext.rawAddress, phcredential.rawAddress)

public actual fun sspiGetAsyncCallStatus(handle: ConstPtr): Hresult =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSspiGetAsyncCallStatus(handle.rawAddress)

public actual fun sspiInitializeSecurityContextAsyncA(asynccontext: MutPtr, phcredential: ConstPtr, phcontext: ConstPtr, psztargetname: Pcstr, fcontextreq: UInt, reserved1: UInt, targetdatarep: UInt, pinput: ConstPtr, reserved2: UInt, phnewcontext: ConstPtr, poutput: ConstPtr, pfcontextattr: ConstPtr, ptsexpiry: ConstPtr): Hresult =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSspiInitializeSecurityContextAsyncA(asynccontext.rawAddress, phcredential.rawAddress, phcontext.rawAddress, psztargetname.rawAddress, fcontextreq.toInt(), reserved1.toInt(), targetdatarep.toInt(), pinput.rawAddress, reserved2.toInt(), phnewcontext.rawAddress, poutput.rawAddress, pfcontextattr.rawAddress, ptsexpiry.rawAddress)

public actual fun sspiInitializeSecurityContextAsyncW(asynccontext: MutPtr, phcredential: ConstPtr, phcontext: ConstPtr, psztargetname: ConstPtr, fcontextreq: UInt, reserved1: UInt, targetdatarep: UInt, pinput: ConstPtr, reserved2: UInt, phnewcontext: ConstPtr, poutput: ConstPtr, pfcontextattr: ConstPtr, ptsexpiry: ConstPtr): Hresult =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSspiInitializeSecurityContextAsyncW(asynccontext.rawAddress, phcredential.rawAddress, phcontext.rawAddress, psztargetname.rawAddress, fcontextreq.toInt(), reserved1.toInt(), targetdatarep.toInt(), pinput.rawAddress, reserved2.toInt(), phnewcontext.rawAddress, poutput.rawAddress, pfcontextattr.rawAddress, ptsexpiry.rawAddress)

public actual fun sspiReinitAsyncContext(handle: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSspiReinitAsyncContext(handle.rawAddress)

public actual fun sspiSetAsyncNotifyCallback(context: ConstPtr, callback: SspiAsyncNotifyCallback, callbackdata: ConstPtr): Hresult =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemSspiSetAsyncNotifyCallback(context.rawAddress, 0L, callbackdata.rawAddress)

public actual fun verifySignature(phcontext: ConstPtr, pmessage: ConstPtr, messageseqno: UInt, pfqop: MutPtr): Hresult =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemVerifySignature(phcontext.rawAddress, pmessage.rawAddress, messageseqno.toInt(), pfqop.rawAddress)

public actual fun zwAccessCheckAndAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, objecttypename: ConstPtr, objectname: ConstPtr, securitydescriptor: PsecurityDescriptor, desiredaccess: UInt, genericmapping: ConstPtr, objectcreation: Boolean, grantedaccess: MutPtr, accessstatus: MutPtr, generateonclose: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwAccessCheckAndAuditAlarm(subsystemname.rawAddress, handleid.rawAddress, objecttypename.rawAddress, objectname.rawAddress, securitydescriptor.rawAddress, desiredaccess.toInt(), genericmapping.rawAddress, objectcreation, grantedaccess.rawAddress, accessstatus.rawAddress, generateonclose.rawAddress)

public actual fun zwAccessCheckByTypeAndAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, objecttypename: ConstPtr, objectname: ConstPtr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: ConstPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Boolean, grantedaccess: MutPtr, accessstatus: MutPtr, generateonclose: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwAccessCheckByTypeAndAuditAlarm(subsystemname.rawAddress, handleid.rawAddress, objecttypename.rawAddress, objectname.rawAddress, securitydescriptor.rawAddress, principalselfsid.rawAddress, desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.rawAddress, objecttypelistlength.toInt(), genericmapping.rawAddress, objectcreation, grantedaccess.rawAddress, accessstatus.rawAddress, generateonclose.rawAddress)

public actual fun zwAccessCheckByTypeResultListAndAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, objecttypename: ConstPtr, objectname: ConstPtr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: ConstPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Boolean, grantedaccess: MutPtr, accessstatus: MutPtr, generateonclose: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwAccessCheckByTypeResultListAndAuditAlarm(subsystemname.rawAddress, handleid.rawAddress, objecttypename.rawAddress, objectname.rawAddress, securitydescriptor.rawAddress, principalselfsid.rawAddress, desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.rawAddress, objecttypelistlength.toInt(), genericmapping.rawAddress, objectcreation, grantedaccess.rawAddress, accessstatus.rawAddress, generateonclose.rawAddress)

public actual fun zwAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname: ConstPtr, handleid: ConstPtr, clienttoken: Handle, objecttypename: ConstPtr, objectname: ConstPtr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: ConstPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Boolean, grantedaccess: MutPtr, accessstatus: MutPtr, generateonclose: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname.rawAddress, handleid.rawAddress, clienttoken.rawAddress, objecttypename.rawAddress, objectname.rawAddress, securitydescriptor.rawAddress, principalselfsid.rawAddress, desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.rawAddress, objecttypelistlength.toInt(), genericmapping.rawAddress, objectcreation, grantedaccess.rawAddress, accessstatus.rawAddress, generateonclose.rawAddress)

public actual fun zwAdjustGroupsToken(tokenhandle: Handle, resettodefault: Boolean, newstate: ConstPtr, bufferlength: UInt, previousstate: MutPtr, returnlength: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwAdjustGroupsToken(tokenhandle.rawAddress, resettodefault, newstate.rawAddress, bufferlength.toInt(), previousstate.rawAddress, returnlength.rawAddress)

public actual fun zwAdjustPrivilegesToken(tokenhandle: Handle, disableallprivileges: Boolean, newstate: ConstPtr, bufferlength: UInt, previousstate: MutPtr, returnlength: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwAdjustPrivilegesToken(tokenhandle.rawAddress, disableallprivileges, newstate.rawAddress, bufferlength.toInt(), previousstate.rawAddress, returnlength.rawAddress)

public actual fun zwAllocateVirtualMemory(processhandle: Handle, baseaddress: MutPtr, zerobits: ULong, regionsize: MutPtr, allocationtype: UInt, protect: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwAllocateVirtualMemory(processhandle.rawAddress, baseaddress.rawAddress, zerobits.toLong(), regionsize.rawAddress, allocationtype.toInt(), protect.toInt())

public actual fun zwAllocateVirtualMemoryEx(processhandle: Handle, baseaddress: MutPtr, regionsize: MutPtr, allocationtype: UInt, pageprotection: UInt, extendedparameters: MutPtr, extendedparametercount: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwAllocateVirtualMemoryEx(processhandle.rawAddress, baseaddress.rawAddress, regionsize.rawAddress, allocationtype.toInt(), pageprotection.toInt(), extendedparameters.rawAddress, extendedparametercount.toInt())

public actual fun zwCancelIoFileEx(filehandle: Handle, iorequesttocancel: ConstPtr, iostatusblock: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwCancelIoFileEx(filehandle.rawAddress, iorequesttocancel.rawAddress, iostatusblock.rawAddress)

public actual fun zwCloseObjectAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, generateonclose: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwCloseObjectAuditAlarm(subsystemname.rawAddress, handleid.rawAddress, generateonclose)

public actual fun zwCreateDirectoryObject(directoryhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwCreateDirectoryObject(directoryhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress)

public actual fun zwCreateEvent(eventhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, eventtype: EventType, initialstate: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwCreateEvent(eventhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, eventtype, initialstate)

public actual fun zwCreateSectionEx(sectionhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, maximumsize: ConstPtr, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Handle, extendedparameters: MutPtr, extendedparametercount: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwCreateSectionEx(sectionhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, maximumsize.rawAddress, sectionpageprotection.toInt(), allocationattributes.toInt(), filehandle.rawAddress, extendedparameters.rawAddress, extendedparametercount.toInt())

public actual fun zwDeleteFile(objectattributes: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwDeleteFile(objectattributes.rawAddress)

public actual fun zwDeleteObjectAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, generateonclose: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwDeleteObjectAuditAlarm(subsystemname.rawAddress, handleid.rawAddress, generateonclose)

public actual fun zwDuplicateObject(sourceprocesshandle: Handle, sourcehandle: Handle, targetprocesshandle: Handle, targethandle: MutPtr, desiredaccess: UInt, handleattributes: UInt, options: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwDuplicateObject(sourceprocesshandle.rawAddress, sourcehandle.rawAddress, targetprocesshandle.rawAddress, targethandle.rawAddress, desiredaccess.toInt(), handleattributes.toInt(), options.toInt())

public actual fun zwDuplicateToken(existingtokenhandle: Handle, desiredaccess: UInt, objectattributes: ConstPtr, effectiveonly: Boolean, tokentype: TokenType, newtokenhandle: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwDuplicateToken(existingtokenhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, effectiveonly, tokentype, newtokenhandle.rawAddress)

public actual fun zwFilterToken(existingtokenhandle: Handle, flags: UInt, sidstodisable: ConstPtr, privilegestodelete: ConstPtr, restrictedsids: ConstPtr, newtokenhandle: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwFilterToken(existingtokenhandle.rawAddress, flags.toInt(), sidstodisable.rawAddress, privilegestodelete.rawAddress, restrictedsids.rawAddress, newtokenhandle.rawAddress)

public actual fun zwFlushBuffersFile(filehandle: Handle, iostatusblock: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwFlushBuffersFile(filehandle.rawAddress, iostatusblock.rawAddress)

public actual fun zwFlushBuffersFileEx(filehandle: Handle, flags: UInt, parameters: ConstPtr, parameterssize: UInt, iostatusblock: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwFlushBuffersFileEx(filehandle.rawAddress, flags.toInt(), parameters.rawAddress, parameterssize.toInt(), iostatusblock.rawAddress)

public actual fun zwFlushVirtualMemory(processhandle: Handle, baseaddress: MutPtr, regionsize: MutPtr, iostatus: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwFlushVirtualMemory(processhandle.rawAddress, baseaddress.rawAddress, regionsize.rawAddress, iostatus.rawAddress)

public actual fun zwFreeVirtualMemory(processhandle: Handle, baseaddress: MutPtr, regionsize: MutPtr, freetype: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwFreeVirtualMemory(processhandle.rawAddress, baseaddress.rawAddress, regionsize.rawAddress, freetype.toInt())

public actual fun zwFsControlFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, fscontrolcode: UInt, inputbuffer: ConstPtr, inputbufferlength: UInt, outputbuffer: MutPtr, outputbufferlength: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwFsControlFile(filehandle.rawAddress, event.rawAddress, 0L, apccontext.rawAddress, iostatusblock.rawAddress, fscontrolcode.toInt(), inputbuffer.rawAddress, inputbufferlength.toInt(), outputbuffer.rawAddress, outputbufferlength.toInt())

public actual fun zwImpersonateAnonymousToken(threadhandle: Handle): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwImpersonateAnonymousToken(threadhandle.rawAddress)

public actual fun zwLockFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, byteoffset: ConstPtr, length: ConstPtr, key: UInt, failimmediately: Boolean, exclusivelock: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwLockFile(filehandle.rawAddress, event.rawAddress, 0L, apccontext.rawAddress, iostatusblock.rawAddress, byteoffset.rawAddress, length.rawAddress, key.toInt(), failimmediately, exclusivelock)

public actual fun zwNotifyChangeKey(keyhandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, completionfilter: UInt, watchtree: Boolean, buffer: MutPtr, buffersize: UInt, asynchronous: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwNotifyChangeKey(keyhandle.rawAddress, event.rawAddress, 0L, apccontext.rawAddress, iostatusblock.rawAddress, completionfilter.toInt(), watchtree, buffer.rawAddress, buffersize.toInt(), asynchronous)

public actual fun zwOpenDirectoryObject(directoryhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwOpenDirectoryObject(directoryhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress)

public actual fun zwOpenObjectAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, objecttypename: ConstPtr, objectname: ConstPtr, securitydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, grantedaccess: UInt, privileges: ConstPtr, objectcreation: Boolean, accessgranted: Boolean, generateonclose: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwOpenObjectAuditAlarm(subsystemname.rawAddress, handleid.rawAddress, objecttypename.rawAddress, objectname.rawAddress, securitydescriptor.rawAddress, clienttoken.rawAddress, desiredaccess.toInt(), grantedaccess.toInt(), privileges.rawAddress, objectcreation, accessgranted, generateonclose.rawAddress)

public actual fun zwOpenProcessToken(processhandle: Handle, desiredaccess: UInt, tokenhandle: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwOpenProcessToken(processhandle.rawAddress, desiredaccess.toInt(), tokenhandle.rawAddress)

public actual fun zwOpenProcessTokenEx(processhandle: Handle, desiredaccess: UInt, handleattributes: UInt, tokenhandle: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwOpenProcessTokenEx(processhandle.rawAddress, desiredaccess.toInt(), handleattributes.toInt(), tokenhandle.rawAddress)

public actual fun zwOpenThreadToken(threadhandle: Handle, desiredaccess: UInt, openasself: Boolean, tokenhandle: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwOpenThreadToken(threadhandle.rawAddress, desiredaccess.toInt(), openasself, tokenhandle.rawAddress)

public actual fun zwOpenThreadTokenEx(threadhandle: Handle, desiredaccess: UInt, openasself: Boolean, handleattributes: UInt, tokenhandle: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwOpenThreadTokenEx(threadhandle.rawAddress, desiredaccess.toInt(), openasself, handleattributes.toInt(), tokenhandle.rawAddress)

public actual fun zwPrivilegeCheck(clienttoken: Handle, requiredprivileges: MutPtr, result: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwPrivilegeCheck(clienttoken.rawAddress, requiredprivileges.rawAddress, result.rawAddress)

public actual fun zwPrivilegeObjectAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, clienttoken: Handle, desiredaccess: UInt, privileges: ConstPtr, accessgranted: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwPrivilegeObjectAuditAlarm(subsystemname.rawAddress, handleid.rawAddress, clienttoken.rawAddress, desiredaccess.toInt(), privileges.rawAddress, accessgranted)

public actual fun zwPrivilegedServiceAuditAlarm(subsystemname: ConstPtr, servicename: ConstPtr, clienttoken: Handle, privileges: ConstPtr, accessgranted: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwPrivilegedServiceAuditAlarm(subsystemname.rawAddress, servicename.rawAddress, clienttoken.rawAddress, privileges.rawAddress, accessgranted)

public actual fun zwQueryDirectoryFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass, returnsingleentry: Boolean, filename: ConstPtr, restartscan: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwQueryDirectoryFile(filehandle.rawAddress, event.rawAddress, 0L, apccontext.rawAddress, iostatusblock.rawAddress, fileinformation.rawAddress, length.toInt(), fileinformationclass, returnsingleentry, filename.rawAddress, restartscan)

public actual fun zwQueryDirectoryFileEx(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass, queryflags: UInt, filename: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwQueryDirectoryFileEx(filehandle.rawAddress, event.rawAddress, 0L, apccontext.rawAddress, iostatusblock.rawAddress, fileinformation.rawAddress, length.toInt(), fileinformationclass, queryflags.toInt(), filename.rawAddress)

public actual fun zwQueryDirectoryObject(directoryhandle: Handle, buffer: MutPtr, length: UInt, returnsingleentry: Boolean, restartscan: Boolean, context: MutPtr, returnlength: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwQueryDirectoryObject(directoryhandle.rawAddress, buffer.rawAddress, length.toInt(), returnsingleentry, restartscan, context.rawAddress, returnlength.rawAddress)

public actual fun zwQueryEaFile(filehandle: Handle, iostatusblock: MutPtr, buffer: MutPtr, length: UInt, returnsingleentry: Boolean, ealist: ConstPtr, ealistlength: UInt, eaindex: ConstPtr, restartscan: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwQueryEaFile(filehandle.rawAddress, iostatusblock.rawAddress, buffer.rawAddress, length.toInt(), returnsingleentry, ealist.rawAddress, ealistlength.toInt(), eaindex.rawAddress, restartscan)

public actual fun zwQueryFullAttributesFile(objectattributes: ConstPtr, fileinformation: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwQueryFullAttributesFile(objectattributes.rawAddress, fileinformation.rawAddress)

public actual fun zwQueryInformationToken(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: MutPtr, tokeninformationlength: UInt, returnlength: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwQueryInformationToken(tokenhandle.rawAddress, tokeninformationclass, tokeninformation.rawAddress, tokeninformationlength.toInt(), returnlength.rawAddress)

public actual fun zwQueryObject(handle: Handle, objectinformationclass: ObjectInformationClass, objectinformation: MutPtr, objectinformationlength: UInt, returnlength: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwQueryObject(handle.rawAddress, objectinformationclass, objectinformation.rawAddress, objectinformationlength.toInt(), returnlength.rawAddress)

public actual fun zwQueryQuotaInformationFile(filehandle: Handle, iostatusblock: MutPtr, buffer: MutPtr, length: UInt, returnsingleentry: Boolean, sidlist: ConstPtr, sidlistlength: UInt, startsid: Psid, restartscan: Boolean): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwQueryQuotaInformationFile(filehandle.rawAddress, iostatusblock.rawAddress, buffer.rawAddress, length.toInt(), returnsingleentry, sidlist.rawAddress, sidlistlength.toInt(), startsid.rawAddress, restartscan)

public actual fun zwQuerySecurityObject(handle: Handle, securityinformation: UInt, securitydescriptor: PsecurityDescriptor, length: UInt, lengthneeded: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwQuerySecurityObject(handle.rawAddress, securityinformation.toInt(), securitydescriptor.rawAddress, length.toInt(), lengthneeded.rawAddress)

public actual fun zwQueryVirtualMemory(processhandle: Handle, baseaddress: ConstPtr, memoryinformationclass: MemoryInformationClass, memoryinformation: MutPtr, memoryinformationlength: ULong, returnlength: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwQueryVirtualMemory(processhandle.rawAddress, baseaddress.rawAddress, memoryinformationclass, memoryinformation.rawAddress, memoryinformationlength.toLong(), returnlength.rawAddress)

public actual fun zwQueryVolumeInformationFile(filehandle: Handle, iostatusblock: MutPtr, fsinformation: MutPtr, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwQueryVolumeInformationFile(filehandle.rawAddress, iostatusblock.rawAddress, fsinformation.rawAddress, length.toInt(), fsinformationclass)

public actual fun zwSetEaFile(filehandle: Handle, iostatusblock: MutPtr, buffer: ConstPtr, length: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwSetEaFile(filehandle.rawAddress, iostatusblock.rawAddress, buffer.rawAddress, length.toInt())

public actual fun zwSetEvent(eventhandle: Handle, previousstate: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwSetEvent(eventhandle.rawAddress, previousstate.rawAddress)

public actual fun zwSetInformationToken(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: ConstPtr, tokeninformationlength: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwSetInformationToken(tokenhandle.rawAddress, tokeninformationclass, tokeninformation.rawAddress, tokeninformationlength.toInt())

public actual fun zwSetInformationVirtualMemory(processhandle: Handle, vminformationclass: VirtualMemoryInformationClass, numberofentries: ULong, virtualaddresses: ConstPtr, vminformation: ConstPtr, vminformationlength: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwSetInformationVirtualMemory(processhandle.rawAddress, vminformationclass, numberofentries.toLong(), virtualaddresses.rawAddress, vminformation.rawAddress, vminformationlength.toInt())

public actual fun zwSetQuotaInformationFile(filehandle: Handle, iostatusblock: MutPtr, buffer: ConstPtr, length: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwSetQuotaInformationFile(filehandle.rawAddress, iostatusblock.rawAddress, buffer.rawAddress, length.toInt())

public actual fun zwSetSecurityObject(handle: Handle, securityinformation: UInt, securitydescriptor: PsecurityDescriptor): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwSetSecurityObject(handle.rawAddress, securityinformation.toInt(), securitydescriptor.rawAddress)

public actual fun zwSetVolumeInformationFile(filehandle: Handle, iostatusblock: MutPtr, fsinformation: ConstPtr, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwSetVolumeInformationFile(filehandle.rawAddress, iostatusblock.rawAddress, fsinformation.rawAddress, length.toInt(), fsinformationclass)

public actual fun zwUnlockFile(filehandle: Handle, iostatusblock: MutPtr, byteoffset: ConstPtr, length: ConstPtr, key: UInt): Ntstatus =
    WindowsWdkStorageFilesystemJniBridge.windowssysWindowsWdkStorageFilesystemZwUnlockFile(filehandle.rawAddress, iostatusblock.rawAddress, byteoffset.rawAddress, length.rawAddress, key.toInt())
