package io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
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
import io.github.kotlinmania.windowssys.windows.wdk.foundation.ObjectNameInformation
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Peprocess
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pethread
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pkthread
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PnotifySync
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PobjectType
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PoolType
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Prkprocess
import io.github.kotlinmania.windowssys.windows.wdk.foundation.SectionObjectPointers
import io.github.kotlinmania.windowssys.windows.wdk.foundation.SecuritySubjectContext
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
import io.github.kotlinmania.windowssys.windows.win32.security.SidIdentifierAuthority
import io.github.kotlinmania.windowssys.windows.win32.security.TokenGroups
import io.github.kotlinmania.windowssys.windows.win32.security.TokenInformationClass
import io.github.kotlinmania.windowssys.windows.win32.security.TokenPrivileges
import io.github.kotlinmania.windowssys.windows.win32.security.TokenType
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

public expect fun applyControlToken(phcontext: ConstPtr<SecHandle>, pinput: ConstPtr<SecBufferDesc>): Hresult

public expect fun ccAsyncCopyRead(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, wait: Boolean, buffer: MutPtr<CVoid>, iostatus: MutPtr<IoStatusBlock>, ioissuerthread: Pethread, asyncreadcontext: ConstPtr<CcAsyncReadContext>): Boolean

public expect fun ccCanIWrite(fileobject: ConstPtr<FileObject>, bytestowrite: UInt, wait: Boolean, retrying: UByte): Boolean

public expect fun ccCoherencyFlushAndPurgeCache(sectionobjectpointer: ConstPtr<SectionObjectPointers>, fileoffset: ConstPtr<Long>, length: UInt, iostatus: MutPtr<IoStatusBlock>, flags: UInt)

public expect fun ccCopyRead(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, wait: Boolean, buffer: MutPtr<CVoid>, iostatus: MutPtr<IoStatusBlock>): Boolean

public expect fun ccCopyReadEx(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, wait: Boolean, buffer: MutPtr<CVoid>, iostatus: MutPtr<IoStatusBlock>, ioissuerthread: Pethread): Boolean

public expect fun ccCopyWrite(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, wait: Boolean, buffer: ConstPtr<CVoid>): Boolean

public expect fun ccCopyWriteEx(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, wait: Boolean, buffer: ConstPtr<CVoid>, ioissuerthread: Pethread): Boolean

public expect fun ccCopyWriteWontFlush(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt): Boolean

public expect fun ccDeferWrite(fileobject: ConstPtr<FileObject>, postroutine: PccPostDeferredWrite, context1: ConstPtr<CVoid>, context2: ConstPtr<CVoid>, bytestowrite: UInt, retrying: Boolean)

public expect fun ccErrorCallbackRoutine(context: ConstPtr<CcErrorCallbackContext>): Ntstatus

public expect fun ccFastCopyRead(fileobject: ConstPtr<FileObject>, fileoffset: UInt, length: UInt, pagecount: UInt, buffer: MutPtr<CVoid>, iostatus: MutPtr<IoStatusBlock>)

public expect fun ccFastCopyWrite(fileobject: ConstPtr<FileObject>, fileoffset: UInt, length: UInt, buffer: ConstPtr<CVoid>)

public expect fun ccFlushCache(sectionobjectpointer: ConstPtr<SectionObjectPointers>, fileoffset: ConstPtr<Long>, length: UInt, iostatus: MutPtr<IoStatusBlock>)

public expect fun ccGetDirtyPages(loghandle: ConstPtr<CVoid>, dirtypageroutine: PdirtyPageRoutine, context1: ConstPtr<CVoid>, context2: ConstPtr<CVoid>): Long

public expect fun ccGetFileObjectFromBcb(bcb: ConstPtr<CVoid>): MutPtr<FileObject>

public expect fun ccGetFileObjectFromSectionPtrs(sectionobjectpointer: ConstPtr<SectionObjectPointers>): MutPtr<FileObject>

public expect fun ccGetFileObjectFromSectionPtrsRef(sectionobjectpointer: ConstPtr<SectionObjectPointers>): MutPtr<FileObject>

public expect fun ccGetFlushedValidData(sectionobjectpointer: ConstPtr<SectionObjectPointers>, bcblistheld: Boolean): Long

public expect fun ccInitializeCacheMap(fileobject: ConstPtr<FileObject>, filesizes: ConstPtr<CcFileSizes>, pinaccess: Boolean, callbacks: ConstPtr<CacheManagerCallbacks>, lazywritecontext: ConstPtr<CVoid>)

public expect fun ccInitializeCacheMapEx(fileobject: ConstPtr<FileObject>, filesizes: ConstPtr<CcFileSizes>, pinaccess: Boolean, callbacks: ConstPtr<CacheManagerCallbacks>, lazywritecontext: ConstPtr<CVoid>, flags: UInt)

public expect fun ccIsCacheManagerCallbackNeeded(status: Ntstatus): Boolean

public expect fun ccIsThereDirtyData(vpb: ConstPtr<Vpb>): Boolean

public expect fun ccIsThereDirtyDataEx(vpb: ConstPtr<Vpb>, numberofdirtypages: ConstPtr<UInt>): Boolean

public expect fun ccMapData(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, flags: UInt, bcb: MutPtr<MutPtr<CVoid>>, buffer: MutPtr<MutPtr<CVoid>>): Boolean

public expect fun ccMdlRead(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, mdlchain: MutPtr<MutPtr<Mdl>>, iostatus: MutPtr<IoStatusBlock>)

public expect fun ccMdlReadComplete(fileobject: ConstPtr<FileObject>, mdlchain: ConstPtr<Mdl>)

public expect fun ccMdlWriteAbort(fileobject: ConstPtr<FileObject>, mdlchain: ConstPtr<Mdl>)

public expect fun ccMdlWriteComplete(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, mdlchain: ConstPtr<Mdl>)

public expect fun ccPinMappedData(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, flags: UInt, bcb: MutPtr<MutPtr<CVoid>>): Boolean

public expect fun ccPinRead(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, flags: UInt, bcb: MutPtr<MutPtr<CVoid>>, buffer: MutPtr<MutPtr<CVoid>>): Boolean

public expect fun ccPrepareMdlWrite(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, mdlchain: MutPtr<MutPtr<Mdl>>, iostatus: MutPtr<IoStatusBlock>)

public expect fun ccPreparePinWrite(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, zero: Boolean, flags: UInt, bcb: MutPtr<MutPtr<CVoid>>, buffer: MutPtr<MutPtr<CVoid>>): Boolean

public expect fun ccPurgeCacheSection(sectionobjectpointer: ConstPtr<SectionObjectPointers>, fileoffset: ConstPtr<Long>, length: UInt, flags: UInt): Boolean

public expect fun ccRemapBcb(bcb: ConstPtr<CVoid>): MutPtr<CVoid>

public expect fun ccRepinBcb(bcb: ConstPtr<CVoid>)

public expect fun ccScheduleReadAhead(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt)

public expect fun ccScheduleReadAheadEx(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, ioissuerthread: Pethread)

public expect fun ccSetAdditionalCacheAttributes(fileobject: ConstPtr<FileObject>, disablereadahead: Boolean, disablewritebehind: Boolean)

public expect fun ccSetAdditionalCacheAttributesEx(fileobject: ConstPtr<FileObject>, flags: UInt)

public expect fun ccSetBcbOwnerPointer(bcb: ConstPtr<CVoid>, ownerpointer: ConstPtr<CVoid>)

public expect fun ccSetDirtyPageThreshold(fileobject: ConstPtr<FileObject>, dirtypagethreshold: UInt)

public expect fun ccSetDirtyPinnedData(bcbvoid: ConstPtr<CVoid>, lsn: ConstPtr<Long>)

public expect fun ccSetFileSizes(fileobject: ConstPtr<FileObject>, filesizes: ConstPtr<CcFileSizes>)

public expect fun ccSetFileSizesEx(fileobject: ConstPtr<FileObject>, filesizes: ConstPtr<CcFileSizes>): Ntstatus

public expect fun ccSetLogHandleForFile(fileobject: ConstPtr<FileObject>, loghandle: ConstPtr<CVoid>, flushtolsnroutine: PflushToLsn)

public expect fun ccSetParallelFlushFile(fileobject: ConstPtr<FileObject>, enableparallelflush: Boolean)

public expect fun ccSetReadAheadGranularity(fileobject: ConstPtr<FileObject>, granularity: UInt)

public expect fun ccUninitializeCacheMap(fileobject: ConstPtr<FileObject>, truncatesize: ConstPtr<Long>, uninitializeevent: ConstPtr<CacheUninitializeEvent>): Boolean

public expect fun ccUnpinData(bcb: ConstPtr<CVoid>)

public expect fun ccUnpinDataForThread(bcb: ConstPtr<CVoid>, resourcethreadid: ULong)

public expect fun ccUnpinRepinnedBcb(bcb: ConstPtr<CVoid>, writethrough: Boolean, iostatus: MutPtr<IoStatusBlock>)

public expect fun ccWaitForCurrentLazyWriterActivity(): Ntstatus

public expect fun ccZeroData(fileobject: ConstPtr<FileObject>, startoffset: ConstPtr<Long>, endoffset: ConstPtr<Long>, wait: Boolean): Boolean

public expect fun completeAuthToken(phcontext: ConstPtr<SecHandle>, ptoken: ConstPtr<SecBufferDesc>): Hresult

public expect fun exDisableResourceBoostLite(resource: ConstPtr<Eresource>)

public expect fun exQueryPoolBlockSize(poolblock: ConstPtr<CVoid>, quotacharged: MutPtr<Boolean>): ULong

public expect fun exportSecurityContext(phcontext: ConstPtr<SecHandle>, fflags: UInt, ppackedcontext: MutPtr<SecBuffer>, ptoken: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun fsRtlAcknowledgeEcp(ecpcontext: ConstPtr<CVoid>)

public expect fun fsRtlAcquireFileExclusive(fileobject: ConstPtr<FileObject>)

public expect fun fsRtlAddBaseMcbEntry(mcb: MutPtr<BaseMcb>, vbn: Long, lbn: Long, sectorcount: Long): Boolean

public expect fun fsRtlAddBaseMcbEntryEx(mcb: MutPtr<BaseMcb>, vbn: Long, lbn: Long, sectorcount: Long): Ntstatus

public expect fun fsRtlAddLargeMcbEntry(mcb: MutPtr<LargeMcb>, vbn: Long, lbn: Long, sectorcount: Long): Boolean

public expect fun fsRtlAddMcbEntry(mcb: MutPtr<Mcb>, vbn: UInt, lbn: UInt, sectorcount: UInt): Boolean

public expect fun fsRtlAddToTunnelCache(cache: MutPtr<Tunnel>, directorykey: ULong, shortname: ConstPtr<UnicodeString>, longname: ConstPtr<UnicodeString>, keybyshortname: Boolean, datalength: UInt, data: ConstPtr<CVoid>)

public expect fun fsRtlAddToTunnelCacheEx(cache: MutPtr<Tunnel>, directorykey: ULong, shortname: ConstPtr<UnicodeString>, longname: ConstPtr<UnicodeString>, flags: UInt, datalength: UInt, data: ConstPtr<CVoid>)

public expect fun fsRtlAllocateAePushLock(pooltype: PoolType, tag: UInt): MutPtr<CVoid>

public expect fun fsRtlAllocateExtraCreateParameter(ecptype: ConstPtr<Guid>, sizeofcontext: UInt, flags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, pooltag: UInt, ecpcontext: MutPtr<MutPtr<CVoid>>): Ntstatus

public expect fun fsRtlAllocateExtraCreateParameterFromLookasideList(ecptype: ConstPtr<Guid>, sizeofcontext: UInt, flags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, lookasidelist: MutPtr<CVoid>, ecpcontext: MutPtr<MutPtr<CVoid>>): Ntstatus

public expect fun fsRtlAllocateExtraCreateParameterList(flags: UInt, ecplist: MutPtr<MutPtr<EcpList>>): Ntstatus

public expect fun fsRtlAllocateFileLock(completelockirproutine: PcompleteLockIrpRoutine, unlockroutine: PunlockRoutine): MutPtr<FileLock>

public expect fun fsRtlAllocateResource(): MutPtr<Eresource>

public expect fun fsRtlAreNamesEqual(constantnamea: ConstPtr<UnicodeString>, constantnameb: ConstPtr<UnicodeString>, ignorecase: Boolean, upcasetable: ConstPtr<UShort>): Boolean

public expect fun fsRtlAreThereCurrentOrInProgressFileLocks(filelock: ConstPtr<FileLock>): Boolean

public expect fun fsRtlAreThereWaitingFileLocks(filelock: ConstPtr<FileLock>): Boolean

public expect fun fsRtlAreVolumeStartupApplicationsComplete(): Boolean

public expect fun fsRtlBalanceReads(targetdevice: ConstPtr<DeviceObject>): Ntstatus

public expect fun fsRtlCancellableWaitForMultipleObjects(count: UInt, objectarray: ConstPtr<ConstPtr<CVoid>>, waittype: WaitType, timeout: ConstPtr<Long>, waitblockarray: ConstPtr<KwaitBlock>, irp: ConstPtr<Irp>): Ntstatus

public expect fun fsRtlCancellableWaitForSingleObject(obj: ConstPtr<CVoid>, timeout: ConstPtr<Long>, irp: ConstPtr<Irp>): Ntstatus

public expect fun fsRtlChangeBackingFileObject(currentfileobject: ConstPtr<FileObject>, newfileobject: ConstPtr<FileObject>, changebackingtype: FsrtlChangeBackingType, flags: UInt): Ntstatus

public expect fun fsRtlCheckLockForOplockRequest(filelock: ConstPtr<FileLock>, allocationsize: ConstPtr<Long>): Boolean

public expect fun fsRtlCheckLockForReadAccess(filelock: ConstPtr<FileLock>, irp: ConstPtr<Irp>): Boolean

public expect fun fsRtlCheckLockForWriteAccess(filelock: ConstPtr<FileLock>, irp: ConstPtr<Irp>): Boolean

public expect fun fsRtlCheckOplock(oplock: ConstPtr<ConstPtr<CVoid>>, irp: ConstPtr<Irp>, context: ConstPtr<CVoid>, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus

public expect fun fsRtlCheckOplockEx(oplock: ConstPtr<ConstPtr<CVoid>>, irp: ConstPtr<Irp>, flags: UInt, context: ConstPtr<CVoid>, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus

public expect fun fsRtlCheckOplockEx2(oplock: ConstPtr<ConstPtr<CVoid>>, irp: ConstPtr<Irp>, flags: UInt, flagsex2: UInt, completionroutinecontext: ConstPtr<CVoid>, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp, timeout: ULong, notifycontext: ConstPtr<CVoid>, notifyroutine: PoplockNotifyRoutine): Ntstatus

public expect fun fsRtlCheckUpperOplock(oplock: ConstPtr<ConstPtr<CVoid>>, newloweroplockstate: UInt, completionroutinecontext: ConstPtr<CVoid>, completionroutine: PoplockWaitCompleteRoutine, prependroutine: PoplockFsPrepostIrp, flags: UInt): Ntstatus

public expect fun fsRtlCopyRead(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, wait: Boolean, lockkey: UInt, buffer: MutPtr<CVoid>, iostatus: MutPtr<IoStatusBlock>, deviceobject: ConstPtr<DeviceObject>): Boolean

public expect fun fsRtlCopyWrite(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, wait: Boolean, lockkey: UInt, buffer: ConstPtr<CVoid>, iostatus: MutPtr<IoStatusBlock>, deviceobject: ConstPtr<DeviceObject>): Boolean

public expect fun fsRtlCreateSectionForDataScan(sectionhandle: MutPtr<Handle>, sectionobject: MutPtr<MutPtr<CVoid>>, sectionfilesize: MutPtr<Long>, fileobject: ConstPtr<FileObject>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, maximumsize: ConstPtr<Long>, sectionpageprotection: UInt, allocationattributes: UInt, flags: UInt): Ntstatus

public expect fun fsRtlCurrentBatchOplock(oplock: ConstPtr<ConstPtr<CVoid>>): Boolean

public expect fun fsRtlCurrentOplock(oplock: ConstPtr<ConstPtr<CVoid>>): Boolean

public expect fun fsRtlCurrentOplockH(oplock: ConstPtr<ConstPtr<CVoid>>): Boolean

public expect fun fsRtlDeleteExtraCreateParameterLookasideList(lookaside: MutPtr<CVoid>, flags: UInt)

public expect fun fsRtlDeleteKeyFromTunnelCache(cache: MutPtr<Tunnel>, directorykey: ULong)

public expect fun fsRtlDeleteTunnelCache(cache: MutPtr<Tunnel>)

public expect fun fsRtlDeregisterUncProvider(handle: Handle)

public expect fun fsRtlDismountComplete(deviceobject: ConstPtr<DeviceObject>, dismountstatus: Ntstatus)

public expect fun fsRtlDissectDbcs(path: io.github.kotlinmania.windowssys.windows.win32.system.kernel.String, firstname: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, remainingname: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>)

public expect fun fsRtlDissectName(path: UnicodeString, firstname: MutPtr<UnicodeString>, remainingname: MutPtr<UnicodeString>)

public expect fun fsRtlDoesDbcsContainWildCards(name: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>): Boolean

public expect fun fsRtlDoesNameContainWildCards(name: ConstPtr<UnicodeString>): Boolean

public expect fun fsRtlFastCheckLockForRead(filelock: ConstPtr<FileLock>, startingbyte: ConstPtr<Long>, length: ConstPtr<Long>, key: UInt, fileobject: ConstPtr<FileObject>, processid: ConstPtr<CVoid>): Boolean

public expect fun fsRtlFastCheckLockForWrite(filelock: ConstPtr<FileLock>, startingbyte: ConstPtr<Long>, length: ConstPtr<Long>, key: UInt, fileobject: ConstPtr<CVoid>, processid: ConstPtr<CVoid>): Boolean

public expect fun fsRtlFastUnlockAll(filelock: ConstPtr<FileLock>, fileobject: ConstPtr<FileObject>, processid: Peprocess, context: ConstPtr<CVoid>): Ntstatus

public expect fun fsRtlFastUnlockAllByKey(filelock: ConstPtr<FileLock>, fileobject: ConstPtr<FileObject>, processid: Peprocess, key: UInt, context: ConstPtr<CVoid>): Ntstatus

public expect fun fsRtlFastUnlockSingle(filelock: ConstPtr<FileLock>, fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: ConstPtr<Long>, processid: Peprocess, key: UInt, context: ConstPtr<CVoid>, alreadysynchronized: Boolean): Ntstatus

public expect fun fsRtlFindExtraCreateParameter(ecplist: ConstPtr<EcpList>, ecptype: ConstPtr<Guid>, ecpcontext: MutPtr<MutPtr<CVoid>>, ecpcontextsize: MutPtr<UInt>): Ntstatus

public expect fun fsRtlFindInTunnelCache(cache: ConstPtr<Tunnel>, directorykey: ULong, name: ConstPtr<UnicodeString>, shortname: MutPtr<UnicodeString>, longname: MutPtr<UnicodeString>, datalength: MutPtr<UInt>, data: MutPtr<CVoid>): Boolean

public expect fun fsRtlFindInTunnelCacheEx(cache: ConstPtr<Tunnel>, directorykey: ULong, name: ConstPtr<UnicodeString>, shortname: MutPtr<UnicodeString>, longname: MutPtr<UnicodeString>, flags: UInt, datalength: MutPtr<UInt>, data: MutPtr<CVoid>): Boolean

public expect fun fsRtlFreeAePushLock(aepushlock: MutPtr<CVoid>)

public expect fun fsRtlFreeExtraCreateParameter(ecpcontext: ConstPtr<CVoid>)

public expect fun fsRtlFreeExtraCreateParameterList(ecplist: ConstPtr<EcpList>)

public expect fun fsRtlFreeFileLock(filelock: ConstPtr<FileLock>)

public expect fun fsRtlGetCurrentProcessLoaderList(): MutPtr<ListEntry>

public expect fun fsRtlGetEcpListFromIrp(irp: ConstPtr<Irp>, ecplist: MutPtr<MutPtr<EcpList>>): Ntstatus

public expect fun fsRtlGetFileSize(fileobject: ConstPtr<FileObject>, filesize: MutPtr<Long>): Ntstatus

public expect fun fsRtlGetNextBaseMcbEntry(mcb: ConstPtr<BaseMcb>, runindex: UInt, vbn: MutPtr<Long>, lbn: MutPtr<Long>, sectorcount: MutPtr<Long>): Boolean

public expect fun fsRtlGetNextExtraCreateParameter(ecplist: ConstPtr<EcpList>, currentecpcontext: ConstPtr<CVoid>, nextecptype: MutPtr<Guid>, nextecpcontext: MutPtr<MutPtr<CVoid>>, nextecpcontextsize: MutPtr<UInt>): Ntstatus

public expect fun fsRtlGetNextFileLock(filelock: ConstPtr<FileLock>, restart: Boolean): MutPtr<FileLockInfo>

public expect fun fsRtlGetNextLargeMcbEntry(mcb: ConstPtr<LargeMcb>, runindex: UInt, vbn: MutPtr<Long>, lbn: MutPtr<Long>, sectorcount: MutPtr<Long>): Boolean

public expect fun fsRtlGetNextMcbEntry(mcb: ConstPtr<Mcb>, runindex: UInt, vbn: MutPtr<UInt>, lbn: MutPtr<UInt>, sectorcount: MutPtr<UInt>): Boolean

public expect fun fsRtlGetSectorSizeInformation(deviceobject: ConstPtr<DeviceObject>, sectorsizeinfo: MutPtr<FileFsSectorSizeInformation>): Ntstatus

public expect fun fsRtlGetSupportedFeatures(deviceobject: ConstPtr<DeviceObject>, supportedfeatures: MutPtr<UInt>): Ntstatus

public expect fun fsRtlGetVirtualDiskNestingLevel(deviceobject: ConstPtr<DeviceObject>, nestinglevel: MutPtr<UInt>, nestingflags: MutPtr<UInt>): Ntstatus

public expect fun fsRtlIncrementCcFastMdlReadWait()

public expect fun fsRtlIncrementCcFastReadNoWait()

public expect fun fsRtlIncrementCcFastReadNotPossible()

public expect fun fsRtlIncrementCcFastReadResourceMiss()

public expect fun fsRtlIncrementCcFastReadWait()

public expect fun fsRtlInitExtraCreateParameterLookasideList(lookaside: MutPtr<CVoid>, flags: UInt, size: ULong, tag: UInt)

public expect fun fsRtlInitializeBaseMcb(mcb: MutPtr<BaseMcb>, pooltype: PoolType)

public expect fun fsRtlInitializeBaseMcbEx(mcb: MutPtr<BaseMcb>, pooltype: PoolType, flags: UShort): Boolean

public expect fun fsRtlInitializeExtraCreateParameter(ecp: MutPtr<EcpHeader>, ecpflags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, totalsize: UInt, ecptype: ConstPtr<Guid>, listallocatedfrom: ConstPtr<CVoid>)

public expect fun fsRtlInitializeExtraCreateParameterList(ecplist: MutPtr<EcpList>): Ntstatus

public expect fun fsRtlInitializeFileLock(filelock: MutPtr<FileLock>, completelockirproutine: PcompleteLockIrpRoutine, unlockroutine: PunlockRoutine)

public expect fun fsRtlInitializeLargeMcb(mcb: MutPtr<LargeMcb>, pooltype: PoolType)

public expect fun fsRtlInitializeMcb(mcb: MutPtr<Mcb>, pooltype: PoolType)

public expect fun fsRtlInitializeOplock(oplock: MutPtr<MutPtr<CVoid>>)

public expect fun fsRtlInitializeTunnelCache(cache: MutPtr<Tunnel>)

public expect fun fsRtlInsertExtraCreateParameter(ecplist: MutPtr<EcpList>, ecpcontext: MutPtr<CVoid>): Ntstatus

public expect fun fsRtlInsertPerFileContext(perfilecontextpointer: ConstPtr<ConstPtr<CVoid>>, ptr: ConstPtr<FsrtlPerFileContext>): Ntstatus

public expect fun fsRtlInsertPerFileObjectContext(fileobject: ConstPtr<FileObject>, ptr: ConstPtr<FsrtlPerFileobjectContext>): Ntstatus

public expect fun fsRtlInsertPerStreamContext(perstreamcontext: ConstPtr<FsrtlAdvancedFcbHeader>, ptr: ConstPtr<FsrtlPerStreamContext>): Ntstatus

public expect fun fsRtlIs32BitProcess(process: Peprocess): Boolean

public expect fun fsRtlIsDaxVolume(fileobject: ConstPtr<FileObject>): Boolean

public expect fun fsRtlIsDbcsInExpression(expression: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, name: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>): Boolean

public expect fun fsRtlIsEcpAcknowledged(ecpcontext: ConstPtr<CVoid>): Boolean

public expect fun fsRtlIsEcpFromUserMode(ecpcontext: ConstPtr<CVoid>): Boolean

public expect fun fsRtlIsExtentDangling(startpage: UInt, numberofpages: UInt, flags: UInt): UInt

public expect fun fsRtlIsFatDbcsLegal(dbcsname: io.github.kotlinmania.windowssys.windows.win32.system.kernel.String, wildcardspermissible: Boolean, pathnamepermissible: Boolean, leadingbackslashpermissible: Boolean): Boolean

public expect fun fsRtlIsHpfsDbcsLegal(dbcsname: io.github.kotlinmania.windowssys.windows.win32.system.kernel.String, wildcardspermissible: Boolean, pathnamepermissible: Boolean, leadingbackslashpermissible: Boolean): Boolean

public expect fun fsRtlIsMobileOS(): Boolean

public expect fun fsRtlIsNameInExpression(expression: ConstPtr<UnicodeString>, name: ConstPtr<UnicodeString>, ignorecase: Boolean, upcasetable: Pcwstr): Boolean

public expect fun fsRtlIsNameInUnUpcasedExpression(expression: ConstPtr<UnicodeString>, name: ConstPtr<UnicodeString>, ignorecase: Boolean, upcasetable: Pcwstr): Boolean

public expect fun fsRtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag: UInt): Boolean

public expect fun fsRtlIsNtstatusExpected(exception: Ntstatus): Boolean

public expect fun fsRtlIsPagingFile(fileobject: ConstPtr<FileObject>): UInt

public expect fun fsRtlIsSystemPagingFile(fileobject: ConstPtr<FileObject>): UInt

public expect fun fsRtlIssueDeviceIoControl(deviceobject: ConstPtr<DeviceObject>, ioctl: UInt, flags: UByte, inputbuffer: ConstPtr<CVoid>, inputbufferlength: UInt, outputbuffer: ConstPtr<CVoid>, outputbufferlength: UInt, iosbinformation: MutPtr<ULong>): Ntstatus

public expect fun fsRtlKernelFsControlFile(fileobject: ConstPtr<FileObject>, fscontrolcode: UInt, inputbuffer: ConstPtr<CVoid>, inputbufferlength: UInt, outputbuffer: MutPtr<CVoid>, outputbufferlength: UInt, retoutputbuffersize: MutPtr<UInt>): Ntstatus

public expect fun fsRtlLogCcFlushError(filename: ConstPtr<UnicodeString>, deviceobject: ConstPtr<DeviceObject>, sectionobjectpointer: ConstPtr<SectionObjectPointers>, flusherror: Ntstatus, flags: UInt): Ntstatus

public expect fun fsRtlLookupBaseMcbEntry(mcb: ConstPtr<BaseMcb>, vbn: Long, lbn: MutPtr<Long>, sectorcountfromlbn: MutPtr<Long>, startinglbn: MutPtr<Long>, sectorcountfromstartinglbn: MutPtr<Long>, index: MutPtr<UInt>): Boolean

public expect fun fsRtlLookupLargeMcbEntry(mcb: ConstPtr<LargeMcb>, vbn: Long, lbn: MutPtr<Long>, sectorcountfromlbn: MutPtr<Long>, startinglbn: MutPtr<Long>, sectorcountfromstartinglbn: MutPtr<Long>, index: MutPtr<UInt>): Boolean

public expect fun fsRtlLookupLastBaseMcbEntry(mcb: ConstPtr<BaseMcb>, vbn: MutPtr<Long>, lbn: MutPtr<Long>): Boolean

public expect fun fsRtlLookupLastBaseMcbEntryAndIndex(opaquemcb: ConstPtr<BaseMcb>, largevbn: MutPtr<Long>, largelbn: MutPtr<Long>, index: MutPtr<UInt>): Boolean

public expect fun fsRtlLookupLastLargeMcbEntry(mcb: ConstPtr<LargeMcb>, vbn: MutPtr<Long>, lbn: MutPtr<Long>): Boolean

public expect fun fsRtlLookupLastLargeMcbEntryAndIndex(opaquemcb: ConstPtr<LargeMcb>, largevbn: MutPtr<Long>, largelbn: MutPtr<Long>, index: MutPtr<UInt>): Boolean

public expect fun fsRtlLookupLastMcbEntry(mcb: ConstPtr<Mcb>, vbn: MutPtr<UInt>, lbn: MutPtr<UInt>): Boolean

public expect fun fsRtlLookupMcbEntry(mcb: ConstPtr<Mcb>, vbn: UInt, lbn: MutPtr<UInt>, sectorcount: MutPtr<UInt>, index: MutPtr<UInt>): Boolean

public expect fun fsRtlLookupPerFileContext(perfilecontextpointer: ConstPtr<ConstPtr<CVoid>>, ownerid: ConstPtr<CVoid>, instanceid: ConstPtr<CVoid>): MutPtr<FsrtlPerFileContext>

public expect fun fsRtlLookupPerFileObjectContext(fileobject: ConstPtr<FileObject>, ownerid: ConstPtr<CVoid>, instanceid: ConstPtr<CVoid>): MutPtr<FsrtlPerFileobjectContext>

public expect fun fsRtlLookupPerStreamContextInternal(streamcontext: ConstPtr<FsrtlAdvancedFcbHeader>, ownerid: ConstPtr<CVoid>, instanceid: ConstPtr<CVoid>): MutPtr<FsrtlPerStreamContext>

public expect fun fsRtlMdlReadCompleteDev(fileobject: ConstPtr<FileObject>, mdlchain: ConstPtr<Mdl>, deviceobject: ConstPtr<DeviceObject>): Boolean

public expect fun fsRtlMdlReadDev(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, lockkey: UInt, mdlchain: MutPtr<MutPtr<Mdl>>, iostatus: MutPtr<IoStatusBlock>, deviceobject: ConstPtr<DeviceObject>): Boolean

public expect fun fsRtlMdlReadEx(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, lockkey: UInt, mdlchain: MutPtr<MutPtr<Mdl>>, iostatus: MutPtr<IoStatusBlock>): Ntstatus

public expect fun fsRtlMdlWriteCompleteDev(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, mdlchain: ConstPtr<Mdl>, deviceobject: ConstPtr<DeviceObject>): Boolean

public expect fun fsRtlMupGetProviderIdFromName(pprovidername: ConstPtr<UnicodeString>, pproviderid: MutPtr<UInt>): Ntstatus

public expect fun fsRtlMupGetProviderInfoFromFileObject(pfileobject: ConstPtr<FileObject>, level: UInt, pbuffer: MutPtr<CVoid>, pbuffersize: MutPtr<UInt>): Ntstatus

public expect fun fsRtlNormalizeNtstatus(exception: Ntstatus, genericexception: Ntstatus): Ntstatus

public expect fun fsRtlNotifyCleanup(notifysync: PnotifySync, notifylist: ConstPtr<ListEntry>, fscontext: ConstPtr<CVoid>)

public expect fun fsRtlNotifyCleanupAll(notifysync: PnotifySync, notifylist: ConstPtr<ListEntry>)

public expect fun fsRtlNotifyFilterChangeDirectory(notifysync: PnotifySync, notifylist: ConstPtr<ListEntry>, fscontext: ConstPtr<CVoid>, fulldirectoryname: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifyirp: ConstPtr<Irp>, traversecallback: PcheckForTraverseAccess, subjectcontext: ConstPtr<SecuritySubjectContext>, filtercallback: PfilterReportChange)

public expect fun fsRtlNotifyFilterReportChange(notifysync: PnotifySync, notifylist: ConstPtr<ListEntry>, fulltargetname: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, targetnameoffset: UShort, streamname: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, normalizedparentname: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, filtermatch: UInt, action: UInt, targetcontext: ConstPtr<CVoid>, filtercontext: ConstPtr<CVoid>)

public expect fun fsRtlNotifyFullChangeDirectory(notifysync: PnotifySync, notifylist: ConstPtr<ListEntry>, fscontext: ConstPtr<CVoid>, fulldirectoryname: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifyirp: ConstPtr<Irp>, traversecallback: PcheckForTraverseAccess, subjectcontext: ConstPtr<SecuritySubjectContext>)

public expect fun fsRtlNotifyFullReportChange(notifysync: PnotifySync, notifylist: ConstPtr<ListEntry>, fulltargetname: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, targetnameoffset: UShort, streamname: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, normalizedparentname: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, filtermatch: UInt, action: UInt, targetcontext: ConstPtr<CVoid>)

public expect fun fsRtlNotifyInitializeSync(notifysync: MutPtr<PnotifySync>)

public expect fun fsRtlNotifyUninitializeSync(notifysync: MutPtr<PnotifySync>)

public expect fun fsRtlNotifyVolumeEvent(fileobject: ConstPtr<FileObject>, eventcode: UInt): Ntstatus

public expect fun fsRtlNotifyVolumeEventEx(fileobject: ConstPtr<FileObject>, eventcode: UInt, event: ConstPtr<TargetDeviceCustomNotification>): Ntstatus

public expect fun fsRtlNumberOfRunsInBaseMcb(mcb: ConstPtr<BaseMcb>): UInt

public expect fun fsRtlNumberOfRunsInLargeMcb(mcb: ConstPtr<LargeMcb>): UInt

public expect fun fsRtlNumberOfRunsInMcb(mcb: ConstPtr<Mcb>): UInt

public expect fun fsRtlOplockBreakH(oplock: ConstPtr<ConstPtr<CVoid>>, irp: ConstPtr<Irp>, flags: UInt, context: ConstPtr<CVoid>, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus

public expect fun fsRtlOplockBreakH2(oplock: ConstPtr<ConstPtr<CVoid>>, irp: ConstPtr<Irp>, flags: UInt, context: ConstPtr<CVoid>, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp, grantedaccess: ConstPtr<UInt>, shareaccess: ConstPtr<UShort>): Ntstatus

public expect fun fsRtlOplockBreakToNone(oplock: MutPtr<MutPtr<CVoid>>, irpsp: ConstPtr<IoStackLocation>, irp: ConstPtr<Irp>, context: ConstPtr<CVoid>, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus

public expect fun fsRtlOplockBreakToNoneEx(oplock: MutPtr<MutPtr<CVoid>>, irp: ConstPtr<Irp>, flags: UInt, context: ConstPtr<CVoid>, completionroutine: PoplockWaitCompleteRoutine, postirproutine: PoplockFsPrepostIrp): Ntstatus

public expect fun fsRtlOplockFsctrl(oplock: ConstPtr<ConstPtr<CVoid>>, irp: ConstPtr<Irp>, opencount: UInt): Ntstatus

public expect fun fsRtlOplockFsctrlEx(oplock: ConstPtr<ConstPtr<CVoid>>, irp: ConstPtr<Irp>, opencount: UInt, flags: UInt): Ntstatus

public expect fun fsRtlOplockGetAnyBreakOwnerProcess(oplock: ConstPtr<ConstPtr<CVoid>>): Peprocess

public expect fun fsRtlOplockIsFastIoPossible(oplock: ConstPtr<ConstPtr<CVoid>>): Boolean

public expect fun fsRtlOplockIsSharedRequest(irp: ConstPtr<Irp>): Boolean

public expect fun fsRtlOplockKeysEqual(fo1: ConstPtr<FileObject>, fo2: ConstPtr<FileObject>): Boolean

public expect fun fsRtlPostPagingFileStackOverflow(context: ConstPtr<CVoid>, event: ConstPtr<Kevent>, stackoverflowroutine: PfsrtlStackOverflowRoutine)

public expect fun fsRtlPostStackOverflow(context: ConstPtr<CVoid>, event: ConstPtr<Kevent>, stackoverflowroutine: PfsrtlStackOverflowRoutine)

public expect fun fsRtlPrepareMdlWriteDev(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, lockkey: UInt, mdlchain: MutPtr<MutPtr<Mdl>>, iostatus: MutPtr<IoStatusBlock>, deviceobject: ConstPtr<DeviceObject>): Boolean

public expect fun fsRtlPrepareMdlWriteEx(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, lockkey: UInt, mdlchain: MutPtr<MutPtr<Mdl>>, iostatus: MutPtr<IoStatusBlock>): Ntstatus

public expect fun fsRtlPrepareToReuseEcp(ecpcontext: ConstPtr<CVoid>)

public expect fun fsRtlPrivateLock(filelock: ConstPtr<FileLock>, fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: ConstPtr<Long>, processid: Peprocess, key: UInt, failimmediately: Boolean, exclusivelock: Boolean, iosb: MutPtr<IoStatusBlock>, irp: ConstPtr<Irp>, context: ConstPtr<CVoid>, alreadysynchronized: Boolean): Boolean

public expect fun fsRtlProcessFileLock(filelock: ConstPtr<FileLock>, irp: ConstPtr<Irp>, context: ConstPtr<CVoid>): Ntstatus

public expect fun fsRtlQueryCachedVdl(fileobject: ConstPtr<FileObject>, vdl: MutPtr<Long>): Ntstatus

public expect fun fsRtlQueryInformationFile(fileobject: ConstPtr<FileObject>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass, retfileinformationsize: MutPtr<UInt>): Ntstatus

public expect fun fsRtlQueryKernelEaFile(fileobject: ConstPtr<FileObject>, returnedeadata: MutPtr<CVoid>, length: UInt, returnsingleentry: Boolean, ealist: ConstPtr<CVoid>, ealistlength: UInt, eaindex: ConstPtr<UInt>, restartscan: Boolean, lengthreturned: MutPtr<UInt>): Ntstatus

public expect fun fsRtlQueryMaximumVirtualDiskNestingLevel(): UInt

public expect fun fsRtlRegisterFileSystemFilterCallbacks(filterdriverobject: ConstPtr<DriverObject>, callbacks: ConstPtr<FsFilterCallbacks>): Ntstatus

public expect fun fsRtlRegisterUncProvider(muphandle: MutPtr<Handle>, redirectordevicename: ConstPtr<UnicodeString>, mailslotssupported: Boolean): Ntstatus

public expect fun fsRtlRegisterUncProviderEx(muphandle: MutPtr<Handle>, redirdevname: ConstPtr<UnicodeString>, deviceobject: ConstPtr<DeviceObject>, flags: UInt): Ntstatus

public expect fun fsRtlRegisterUncProviderEx2(redirdevname: ConstPtr<UnicodeString>, deviceobject: ConstPtr<DeviceObject>, registration: ConstPtr<FsrtlUncProviderRegistration>, muphandle: MutPtr<Handle>): Ntstatus

public expect fun fsRtlReleaseFile(fileobject: ConstPtr<FileObject>)

public expect fun fsRtlRemoveBaseMcbEntry(mcb: MutPtr<BaseMcb>, vbn: Long, sectorcount: Long): Boolean

public expect fun fsRtlRemoveDotsFromPath(originalstring: Pwstr, pathlength: UShort, newlength: MutPtr<UShort>): Ntstatus

public expect fun fsRtlRemoveExtraCreateParameter(ecplist: MutPtr<EcpList>, ecptype: ConstPtr<Guid>, ecpcontext: MutPtr<MutPtr<CVoid>>, ecpcontextsize: MutPtr<UInt>): Ntstatus

public expect fun fsRtlRemoveLargeMcbEntry(mcb: MutPtr<LargeMcb>, vbn: Long, sectorcount: Long)

public expect fun fsRtlRemoveMcbEntry(mcb: MutPtr<Mcb>, vbn: UInt, sectorcount: UInt)

public expect fun fsRtlRemovePerFileContext(perfilecontextpointer: ConstPtr<ConstPtr<CVoid>>, ownerid: ConstPtr<CVoid>, instanceid: ConstPtr<CVoid>): MutPtr<FsrtlPerFileContext>

public expect fun fsRtlRemovePerFileObjectContext(fileobject: ConstPtr<FileObject>, ownerid: ConstPtr<CVoid>, instanceid: ConstPtr<CVoid>): MutPtr<FsrtlPerFileobjectContext>

public expect fun fsRtlRemovePerStreamContext(streamcontext: ConstPtr<FsrtlAdvancedFcbHeader>, ownerid: ConstPtr<CVoid>, instanceid: ConstPtr<CVoid>): MutPtr<FsrtlPerStreamContext>

public expect fun fsRtlResetBaseMcb(mcb: MutPtr<BaseMcb>)

public expect fun fsRtlResetLargeMcb(mcb: MutPtr<LargeMcb>, selfsynchronized: Boolean)

public expect fun fsRtlSetDriverBacking(driverobj: ConstPtr<DriverObject>, flags: UInt): Ntstatus

public expect fun fsRtlSetEcpListIntoIrp(irp: MutPtr<Irp>, ecplist: ConstPtr<EcpList>): Ntstatus

public expect fun fsRtlSetKernelEaFile(fileobject: ConstPtr<FileObject>, eabuffer: ConstPtr<CVoid>, length: UInt): Ntstatus

public expect fun fsRtlSplitBaseMcb(mcb: MutPtr<BaseMcb>, vbn: Long, amount: Long): Boolean

public expect fun fsRtlSplitLargeMcb(mcb: MutPtr<LargeMcb>, vbn: Long, amount: Long): Boolean

public expect fun fsRtlTeardownPerFileContexts(perfilecontextpointer: ConstPtr<ConstPtr<CVoid>>)

public expect fun fsRtlTeardownPerStreamContexts(advancedheader: ConstPtr<FsrtlAdvancedFcbHeader>)

public expect fun fsRtlTruncateBaseMcb(mcb: MutPtr<BaseMcb>, vbn: Long)

public expect fun fsRtlTruncateLargeMcb(mcb: MutPtr<LargeMcb>, vbn: Long)

public expect fun fsRtlTruncateMcb(mcb: MutPtr<Mcb>, vbn: UInt)

public expect fun fsRtlUninitializeBaseMcb(mcb: ConstPtr<BaseMcb>)

public expect fun fsRtlUninitializeFileLock(filelock: MutPtr<FileLock>)

public expect fun fsRtlUninitializeLargeMcb(mcb: MutPtr<LargeMcb>)

public expect fun fsRtlUninitializeMcb(mcb: MutPtr<Mcb>)

public expect fun fsRtlUninitializeOplock(oplock: MutPtr<MutPtr<CVoid>>)

public expect fun fsRtlUpdateDiskCounters(bytesread: ULong, byteswritten: ULong)

public expect fun fsRtlUpperOplockFsctrl(oplock: ConstPtr<ConstPtr<CVoid>>, irp: ConstPtr<Irp>, opencount: UInt, loweroplockstate: UInt, flags: UInt): Ntstatus

public expect fun fsRtlValidateReparsePointBuffer(bufferlength: UInt, reparsebuffer: ConstPtr<ReparseDataBuffer>): Ntstatus

public expect fun fsRtlVolumeDeviceToCorrelationId(volumedeviceobject: ConstPtr<DeviceObject>, guid: MutPtr<Guid>): Ntstatus

public expect fun getSecurityUserInfo(logonid: ConstPtr<Luid>, flags: UInt, userinformation: MutPtr<MutPtr<SecurityUserData>>): Ntstatus

public expect fun ioAcquireVpbSpinLock(irql: MutPtr<UByte>)

public expect fun ioApplyPriorityInfoThread(inputpriorityinfo: ConstPtr<IoPriorityInfo>, outputpriorityinfo: MutPtr<IoPriorityInfo>, thread: Pethread): Ntstatus

public expect fun ioCheckDesiredAccess(desiredaccess: MutPtr<UInt>, grantedaccess: UInt): Ntstatus

public expect fun ioCheckEaBufferValidity(eabuffer: ConstPtr<FileFullEaInformation>, ealength: UInt, erroroffset: MutPtr<UInt>): Ntstatus

public expect fun ioCheckFunctionAccess(grantedaccess: UInt, majorfunction: UByte, minorfunction: UByte, iocontrolcode: UInt, arg1: ConstPtr<CVoid>, arg2: ConstPtr<CVoid>): Ntstatus

public expect fun ioCheckQuerySetFileInformation(fileinformationclass: FileInformationClass, length: UInt, setoperation: Boolean): Ntstatus

public expect fun ioCheckQuerySetVolumeInformation(fsinformationclass: FsInformationClass, length: UInt, setoperation: Boolean): Ntstatus

public expect fun ioCheckQuotaBufferValidity(quotabuffer: ConstPtr<FileQuotaInformation>, quotalength: UInt, erroroffset: MutPtr<UInt>): Ntstatus

public expect fun ioClearFsTrackOffsetState(irp: MutPtr<Irp>): Ntstatus

public expect fun ioCreateStreamFileObject(fileobject: ConstPtr<FileObject>, deviceobject: ConstPtr<DeviceObject>): MutPtr<FileObject>

public expect fun ioCreateStreamFileObjectEx(fileobject: ConstPtr<FileObject>, deviceobject: ConstPtr<DeviceObject>, filehandle: MutPtr<Handle>): MutPtr<FileObject>

public expect fun ioCreateStreamFileObjectEx2(createoptions: ConstPtr<IoCreateStreamFileOptions>, fileobject: ConstPtr<FileObject>, deviceobject: ConstPtr<DeviceObject>, streamfileobject: MutPtr<MutPtr<FileObject>>, filehandle: MutPtr<Handle>): Ntstatus

public expect fun ioCreateStreamFileObjectLite(fileobject: ConstPtr<FileObject>, deviceobject: ConstPtr<DeviceObject>): MutPtr<FileObject>

public expect fun ioEnumerateDeviceObjectList(driverobject: ConstPtr<DriverObject>, deviceobjectlist: MutPtr<MutPtr<DeviceObject>>, deviceobjectlistsize: UInt, actualnumberdeviceobjects: MutPtr<UInt>): Ntstatus

public expect fun ioEnumerateRegisteredFiltersList(driverobjectlist: MutPtr<MutPtr<DriverObject>>, driverobjectlistsize: UInt, actualnumberdriverobjects: MutPtr<UInt>): Ntstatus

public expect fun ioFastQueryNetworkAttributes(objectattributes: ConstPtr<ObjectAttributes>, desiredaccess: UInt, openoptions: UInt, iostatus: MutPtr<IoStatusBlock>, buffer: MutPtr<FileNetworkOpenInformation>): Boolean

public expect fun ioGetAttachedDevice(deviceobject: ConstPtr<DeviceObject>): MutPtr<DeviceObject>

public expect fun ioGetBaseFileSystemDeviceObject(fileobject: ConstPtr<FileObject>): MutPtr<DeviceObject>

public expect fun ioGetDeviceAttachmentBaseRef(deviceobject: ConstPtr<DeviceObject>): MutPtr<DeviceObject>

public expect fun ioGetDeviceToVerify(thread: Pethread): MutPtr<DeviceObject>

public expect fun ioGetDiskDeviceObject(filesystemdeviceobject: ConstPtr<DeviceObject>, diskdeviceobject: MutPtr<MutPtr<DeviceObject>>): Ntstatus

public expect fun ioGetFsTrackOffsetState(irp: ConstPtr<Irp>, retfstrackoffsetblob: MutPtr<MutPtr<IoIrpExtTrackOffsetHeader>>, rettrackedoffset: MutPtr<Long>): Ntstatus

public expect fun ioGetLowerDeviceObject(deviceobject: ConstPtr<DeviceObject>): MutPtr<DeviceObject>

public expect fun ioGetOplockKeyContext(fileobject: ConstPtr<FileObject>): MutPtr<OplockKeyEcpContext>

public expect fun ioGetOplockKeyContextEx(fileobject: ConstPtr<FileObject>): MutPtr<OplockKeyContext>

public expect fun ioGetRequestorProcess(irp: ConstPtr<Irp>): Peprocess

public expect fun ioGetRequestorProcessId(irp: ConstPtr<Irp>): UInt

public expect fun ioGetRequestorSessionId(irp: ConstPtr<Irp>, psessionid: MutPtr<UInt>): Ntstatus

public expect fun ioIrpHasFsTrackOffsetExtensionType(irp: ConstPtr<Irp>): Boolean

public expect fun ioIsOperationSynchronous(irp: ConstPtr<Irp>): Boolean

public expect fun ioIsSystemThread(thread: Pethread): Boolean

public expect fun ioIsValidNameGraftingBuffer(irp: ConstPtr<Irp>, reparsebuffer: ConstPtr<ReparseDataBuffer>): Boolean

public expect fun ioPageRead(fileobject: ConstPtr<FileObject>, memorydescriptorlist: ConstPtr<Mdl>, startingoffset: ConstPtr<Long>, event: ConstPtr<Kevent>, iostatusblock: MutPtr<IoStatusBlock>): Ntstatus

public expect fun ioQueryFileDosDeviceName(fileobject: ConstPtr<FileObject>, objectnameinformation: MutPtr<MutPtr<ObjectNameInformation>>): Ntstatus

public expect fun ioQueryFileInformation(fileobject: ConstPtr<FileObject>, fileinformationclass: FileInformationClass, length: UInt, fileinformation: MutPtr<CVoid>, returnedlength: MutPtr<UInt>): Ntstatus

public expect fun ioQueryVolumeInformation(fileobject: ConstPtr<FileObject>, fsinformationclass: FsInformationClass, length: UInt, fsinformation: MutPtr<CVoid>, returnedlength: MutPtr<UInt>): Ntstatus

public expect fun ioQueueThreadIrp(irp: ConstPtr<Irp>)

public expect fun ioRegisterFileSystem(deviceobject: ConstPtr<DeviceObject>)

public expect fun ioRegisterFsRegistrationChange(driverobject: ConstPtr<DriverObject>, drivernotificationroutine: DriverFsNotification): Ntstatus

public expect fun ioRegisterFsRegistrationChangeMountAware(driverobject: ConstPtr<DriverObject>, drivernotificationroutine: DriverFsNotification, synchronizewithmounts: Boolean): Ntstatus

public expect fun ioReleaseVpbSpinLock(irql: UByte)

public expect fun ioReplaceFileObjectName(fileobject: ConstPtr<FileObject>, newfilename: Pcwstr, filenamelength: UShort): Ntstatus

public expect fun ioRequestDeviceRemovalForReset(physicaldeviceobject: ConstPtr<DeviceObject>, flags: UInt): Ntstatus

public expect fun ioRetrievePriorityInfo(irp: ConstPtr<Irp>, fileobject: ConstPtr<FileObject>, thread: Pethread, priorityinfo: MutPtr<IoPriorityInfo>): Ntstatus

public expect fun ioSetDeviceToVerify(thread: Pethread, deviceobject: ConstPtr<DeviceObject>)

public expect fun ioSetFsTrackOffsetState(irp: MutPtr<Irp>, fstrackoffsetblob: ConstPtr<IoIrpExtTrackOffsetHeader>, trackedoffset: Long): Ntstatus

public expect fun ioSetInformation(fileobject: ConstPtr<FileObject>, fileinformationclass: FileInformationClass, length: UInt, fileinformation: ConstPtr<CVoid>): Ntstatus

public expect fun ioSynchronousPageWrite(fileobject: ConstPtr<FileObject>, memorydescriptorlist: ConstPtr<Mdl>, startingoffset: ConstPtr<Long>, event: ConstPtr<Kevent>, iostatusblock: MutPtr<IoStatusBlock>): Ntstatus

public expect fun ioThreadToProcess(thread: Pethread): Peprocess

public expect fun ioUnregisterFileSystem(deviceobject: ConstPtr<DeviceObject>)

public expect fun ioUnregisterFsRegistrationChange(driverobject: ConstPtr<DriverObject>, drivernotificationroutine: DriverFsNotification)

public expect fun ioVerifyVolume(deviceobject: ConstPtr<DeviceObject>, allowrawmount: Boolean): Ntstatus

public expect fun keAcquireQueuedSpinLock(number: KspinLockQueueNumber): UByte

public expect fun keAcquireSpinLockRaiseToSynch(spinlock: MutPtr<ULong>): UByte

public expect fun keAttachProcess(process: Prkprocess)

public expect fun keDetachProcess()

public expect fun keInitializeMutant(mutant: MutPtr<Kmutant>, initialowner: Boolean)

public expect fun keInitializeQueue(queue: MutPtr<Kqueue>, count: UInt)

public expect fun keInsertHeadQueue(queue: MutPtr<Kqueue>, entry: MutPtr<ListEntry>): Int

public expect fun keInsertQueue(queue: MutPtr<Kqueue>, entry: MutPtr<ListEntry>): Int

public expect fun keReadStateMutant(mutant: ConstPtr<Kmutant>): Int

public expect fun keReadStateQueue(queue: ConstPtr<Kqueue>): Int

public expect fun keReleaseMutant(mutant: MutPtr<Kmutant>, increment: Int, abandoned: Boolean, wait: Boolean): Int

public expect fun keReleaseQueuedSpinLock(number: KspinLockQueueNumber, oldirql: UByte)

public expect fun keRemoveQueue(queue: MutPtr<Kqueue>, waitmode: Byte, timeout: ConstPtr<Long>): MutPtr<ListEntry>

public expect fun keRemoveQueueEx(queue: MutPtr<Kqueue>, waitmode: Byte, alertable: Boolean, timeout: ConstPtr<Long>, entryarray: MutPtr<MutPtr<ListEntry>>, count: UInt): UInt

public expect fun keRundownQueue(queue: MutPtr<Kqueue>): MutPtr<ListEntry>

public expect fun keSetIdealProcessorThread(thread: Pkthread, processor: UByte): UByte

public expect fun keSetKernelStackSwapEnable(enable: Boolean): Boolean

public expect fun keStackAttachProcess(process: Prkprocess, apcstate: MutPtr<KapcState>)

public expect fun keTryToAcquireQueuedSpinLock(number: KspinLockQueueNumber, oldirql: MutPtr<UByte>): UInt

public expect fun keUnstackDetachProcess(apcstate: ConstPtr<KapcState>)

public expect fun makeSignature(phcontext: ConstPtr<SecHandle>, fqop: UInt, pmessage: ConstPtr<SecBufferDesc>, messageseqno: UInt): Hresult

public expect fun mapSecurityError(secstatus: Hresult): Ntstatus

public expect fun mmCanFileBeTruncated(sectionpointer: ConstPtr<SectionObjectPointers>, newfilesize: ConstPtr<Long>): Boolean

public expect fun mmDoesFileHaveUserWritableReferences(sectionpointer: ConstPtr<SectionObjectPointers>): UInt

public expect fun mmFlushImageSection(sectionobjectpointer: ConstPtr<SectionObjectPointers>, flushtype: MmflushType): Boolean

public expect fun mmForceSectionClosed(sectionobjectpointer: ConstPtr<SectionObjectPointers>, delayclose: Boolean): Boolean

public expect fun mmForceSectionClosedEx(sectionobjectpointer: ConstPtr<SectionObjectPointers>, forcecloseflags: UInt): Boolean

public expect fun mmGetMaximumFileSectionSize(): ULong

public expect fun mmIsFileSectionActive(fssectionpointer: ConstPtr<SectionObjectPointers>, flags: UInt, sectionisactive: MutPtr<UInt>): Ntstatus

public expect fun mmIsRecursiveIoFault(): Boolean

public expect fun mmMdlPagesAreZero(mdl: ConstPtr<Mdl>): UInt

public expect fun mmPrefetchPages(numberoflists: UInt, readlists: ConstPtr<ConstPtr<ReadList>>): Ntstatus

public expect fun mmSetAddressRangeModified(address: ConstPtr<CVoid>, length: ULong): Boolean

public expect fun ntAccessCheckAndAuditAlarm(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, objecttypename: ConstPtr<UnicodeString>, objectname: ConstPtr<UnicodeString>, securitydescriptor: PsecurityDescriptor, desiredaccess: UInt, genericmapping: ConstPtr<GenericMapping>, objectcreation: Boolean, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Int>, generateonclose: MutPtr<Boolean>): Ntstatus

public expect fun ntAccessCheckByTypeAndAuditAlarm(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, objecttypename: ConstPtr<UnicodeString>, objectname: ConstPtr<UnicodeString>, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: ConstPtr<ObjectTypeList>, objecttypelistlength: UInt, genericmapping: ConstPtr<GenericMapping>, objectcreation: Boolean, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Int>, generateonclose: MutPtr<Boolean>): Ntstatus

public expect fun ntAccessCheckByTypeResultListAndAuditAlarm(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, objecttypename: ConstPtr<UnicodeString>, objectname: ConstPtr<UnicodeString>, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: ConstPtr<ObjectTypeList>, objecttypelistlength: UInt, genericmapping: ConstPtr<GenericMapping>, objectcreation: Boolean, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Int>, generateonclose: MutPtr<Boolean>): Ntstatus

public expect fun ntAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, clienttoken: Handle, objecttypename: ConstPtr<UnicodeString>, objectname: ConstPtr<UnicodeString>, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: ConstPtr<ObjectTypeList>, objecttypelistlength: UInt, genericmapping: ConstPtr<GenericMapping>, objectcreation: Boolean, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Int>, generateonclose: MutPtr<Boolean>): Ntstatus

public expect fun ntAdjustGroupsToken(tokenhandle: Handle, resettodefault: Boolean, newstate: ConstPtr<TokenGroups>, bufferlength: UInt, previousstate: MutPtr<TokenGroups>, returnlength: MutPtr<UInt>): Ntstatus

public expect fun ntAdjustPrivilegesToken(tokenhandle: Handle, disableallprivileges: Boolean, newstate: ConstPtr<TokenPrivileges>, bufferlength: UInt, previousstate: MutPtr<TokenPrivileges>, returnlength: MutPtr<UInt>): Ntstatus

public expect fun ntAllocateVirtualMemory(processhandle: Handle, baseaddress: MutPtr<MutPtr<CVoid>>, zerobits: ULong, regionsize: MutPtr<ULong>, allocationtype: UInt, protect: UInt): Ntstatus

public expect fun ntAllocateVirtualMemoryEx(processhandle: Handle, baseaddress: MutPtr<MutPtr<CVoid>>, regionsize: MutPtr<ULong>, allocationtype: UInt, pageprotection: UInt, extendedparameters: MutPtr<MemExtendedParameter>, extendedparametercount: UInt): Ntstatus

public expect fun ntCancelIoFileEx(filehandle: Handle, iorequesttocancel: ConstPtr<IoStatusBlock>, iostatusblock: MutPtr<IoStatusBlock>): Ntstatus

public expect fun ntCloseObjectAuditAlarm(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, generateonclose: Boolean): Ntstatus

public expect fun ntCreateDirectoryObject(directoryhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus

public expect fun ntCreateEvent(eventhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, eventtype: EventType, initialstate: Boolean): Ntstatus

public expect fun ntCreateFile(filehandle: MutPtr<Handle>, desiredaccess: FileAccessRights, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, allocationsize: ConstPtr<Long>, fileattributes: FileFlagsAndAttributes, shareaccess: FileShareMode, createdisposition: NtcreatefileCreateDisposition, createoptions: NtcreatefileCreateOptions, eabuffer: ConstPtr<CVoid>, ealength: UInt): Ntstatus

public expect fun ntCreateSection(sectionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, maximumsize: ConstPtr<Long>, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Handle): Ntstatus

public expect fun ntCreateSectionEx(sectionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, maximumsize: ConstPtr<Long>, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Handle, extendedparameters: MutPtr<MemExtendedParameter>, extendedparametercount: UInt): Ntstatus

public expect fun ntDeleteFile(objectattributes: ConstPtr<ObjectAttributes>): Ntstatus

public expect fun ntDeleteObjectAuditAlarm(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, generateonclose: Boolean): Ntstatus

public expect fun ntDuplicateObject(sourceprocesshandle: Handle, sourcehandle: Handle, targetprocesshandle: Handle, targethandle: MutPtr<Handle>, desiredaccess: UInt, handleattributes: UInt, options: UInt): Ntstatus

public expect fun ntDuplicateToken(existingtokenhandle: Handle, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, effectiveonly: Boolean, tokentype: TokenType, newtokenhandle: MutPtr<Handle>): Ntstatus

public expect fun ntFilterToken(existingtokenhandle: Handle, flags: UInt, sidstodisable: ConstPtr<TokenGroups>, privilegestodelete: ConstPtr<TokenPrivileges>, restrictedsids: ConstPtr<TokenGroups>, newtokenhandle: MutPtr<Handle>): Ntstatus

public expect fun ntFlushBuffersFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>): Ntstatus

public expect fun ntFlushBuffersFileEx(filehandle: Handle, flags: UInt, parameters: ConstPtr<CVoid>, parameterssize: UInt, iostatusblock: MutPtr<IoStatusBlock>): Ntstatus

public expect fun ntFlushVirtualMemory(processhandle: Handle, baseaddress: MutPtr<MutPtr<CVoid>>, regionsize: MutPtr<ULong>, iostatus: MutPtr<IoStatusBlock>): Ntstatus

public expect fun ntFreeVirtualMemory(processhandle: Handle, baseaddress: MutPtr<MutPtr<CVoid>>, regionsize: MutPtr<ULong>, freetype: UInt): Ntstatus

public expect fun ntFsControlFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, fscontrolcode: UInt, inputbuffer: ConstPtr<CVoid>, inputbufferlength: UInt, outputbuffer: MutPtr<CVoid>, outputbufferlength: UInt): Ntstatus

public expect fun ntImpersonateAnonymousToken(threadhandle: Handle): Ntstatus

public expect fun ntLockFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, byteoffset: ConstPtr<Long>, length: ConstPtr<Long>, key: UInt, failimmediately: Boolean, exclusivelock: Boolean): Ntstatus

public expect fun ntNotifyChangeKey(keyhandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, completionfilter: UInt, watchtree: Boolean, buffer: MutPtr<CVoid>, buffersize: UInt, asynchronous: Boolean): Ntstatus

public expect fun ntOpenDirectoryObject(directoryhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus

public expect fun ntOpenFile(filehandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, shareaccess: UInt, openoptions: UInt): Ntstatus

public expect fun ntOpenObjectAuditAlarm(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, objecttypename: ConstPtr<UnicodeString>, objectname: ConstPtr<UnicodeString>, securitydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, grantedaccess: UInt, privileges: ConstPtr<PrivilegeSet>, objectcreation: Boolean, accessgranted: Boolean, generateonclose: MutPtr<Boolean>): Ntstatus

public expect fun ntOpenProcessToken(processhandle: Handle, desiredaccess: UInt, tokenhandle: MutPtr<Handle>): Ntstatus

public expect fun ntOpenProcessTokenEx(processhandle: Handle, desiredaccess: UInt, handleattributes: UInt, tokenhandle: MutPtr<Handle>): Ntstatus

public expect fun ntOpenSymbolicLinkObject(linkhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus

public expect fun ntOpenThreadToken(threadhandle: Handle, desiredaccess: UInt, openasself: Boolean, tokenhandle: MutPtr<Handle>): Ntstatus

public expect fun ntOpenThreadTokenEx(threadhandle: Handle, desiredaccess: UInt, openasself: Boolean, handleattributes: UInt, tokenhandle: MutPtr<Handle>): Ntstatus

public expect fun ntPrivilegeCheck(clienttoken: Handle, requiredprivileges: MutPtr<PrivilegeSet>, result: MutPtr<Boolean>): Ntstatus

public expect fun ntPrivilegeObjectAuditAlarm(subsystemname: ConstPtr<UnicodeString>, handleid: ConstPtr<CVoid>, clienttoken: Handle, desiredaccess: UInt, privileges: ConstPtr<PrivilegeSet>, accessgranted: Boolean): Ntstatus

public expect fun ntPrivilegedServiceAuditAlarm(subsystemname: ConstPtr<UnicodeString>, servicename: ConstPtr<UnicodeString>, clienttoken: Handle, privileges: ConstPtr<PrivilegeSet>, accessgranted: Boolean): Ntstatus

public expect fun ntQueryDirectoryFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass, returnsingleentry: Boolean, filename: ConstPtr<UnicodeString>, restartscan: Boolean): Ntstatus

public expect fun ntQueryDirectoryFileEx(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass, queryflags: UInt, filename: ConstPtr<UnicodeString>): Ntstatus

public expect fun ntQueryDirectoryObject(directoryhandle: Handle, buffer: MutPtr<CVoid>, length: UInt, returnsingleentry: Boolean, restartscan: Boolean, context: MutPtr<UInt>, returnlength: MutPtr<UInt>): Ntstatus

public expect fun ntQueryEaFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, buffer: MutPtr<CVoid>, length: UInt, returnsingleentry: Boolean, ealist: ConstPtr<CVoid>, ealistlength: UInt, eaindex: ConstPtr<UInt>, restartscan: Boolean): Ntstatus

public expect fun ntQueryFullAttributesFile(objectattributes: ConstPtr<ObjectAttributes>, fileinformation: MutPtr<FileNetworkOpenInformation>): Ntstatus

public expect fun ntQueryInformationByName(objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass): Ntstatus

public expect fun ntQueryInformationFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass): Ntstatus

public expect fun ntQueryInformationToken(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: MutPtr<CVoid>, tokeninformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus

public expect fun ntQueryQuotaInformationFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, buffer: MutPtr<CVoid>, length: UInt, returnsingleentry: Boolean, sidlist: ConstPtr<CVoid>, sidlistlength: UInt, startsid: Psid, restartscan: Boolean): Ntstatus

public expect fun ntQuerySecurityObject(handle: Handle, securityinformation: UInt, securitydescriptor: PsecurityDescriptor, length: UInt, lengthneeded: MutPtr<UInt>): Ntstatus

public expect fun ntQuerySymbolicLinkObject(linkhandle: Handle, linktarget: MutPtr<UnicodeString>, returnedlength: MutPtr<UInt>): Ntstatus

public expect fun ntQueryVirtualMemory(processhandle: Handle, baseaddress: ConstPtr<CVoid>, memoryinformationclass: MemoryInformationClass, memoryinformation: MutPtr<CVoid>, memoryinformationlength: ULong, returnlength: MutPtr<ULong>): Ntstatus

public expect fun ntQueryVolumeInformationFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, fsinformation: MutPtr<CVoid>, length: UInt, fsinformationclass: FsInformationClass): Ntstatus

public expect fun ntReadFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, buffer: MutPtr<CVoid>, length: UInt, byteoffset: ConstPtr<Long>, key: ConstPtr<UInt>): Ntstatus

public expect fun ntSetEaFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, buffer: ConstPtr<CVoid>, length: UInt): Ntstatus

public expect fun ntSetEvent(eventhandle: Handle, previousstate: MutPtr<Int>): Ntstatus

public expect fun ntSetInformationFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, fileinformation: ConstPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass): Ntstatus

public expect fun ntSetInformationToken(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: ConstPtr<CVoid>, tokeninformationlength: UInt): Ntstatus

public expect fun ntSetInformationVirtualMemory(processhandle: Handle, vminformationclass: VirtualMemoryInformationClass, numberofentries: ULong, virtualaddresses: ConstPtr<MemoryRangeEntry>, vminformation: ConstPtr<CVoid>, vminformationlength: UInt): Ntstatus

public expect fun ntSetQuotaInformationFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, buffer: ConstPtr<CVoid>, length: UInt): Ntstatus

public expect fun ntSetSecurityObject(handle: Handle, securityinformation: UInt, securitydescriptor: PsecurityDescriptor): Ntstatus

public expect fun ntSetVolumeInformationFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, fsinformation: ConstPtr<CVoid>, length: UInt, fsinformationclass: FsInformationClass): Ntstatus

public expect fun ntUnlockFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, byteoffset: ConstPtr<Long>, length: ConstPtr<Long>, key: UInt): Ntstatus

public expect fun ntWriteFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, buffer: ConstPtr<CVoid>, length: UInt, byteoffset: ConstPtr<Long>, key: ConstPtr<UInt>): Ntstatus

public expect fun obInsertObject(obj: ConstPtr<CVoid>, passedaccessstate: MutPtr<AccessState>, desiredaccess: UInt, objectpointerbias: UInt, newobject: MutPtr<MutPtr<CVoid>>, handle: MutPtr<Handle>): Ntstatus

public expect fun obIsKernelHandle(handle: Handle): Boolean

public expect fun obMakeTemporaryObject(obj: ConstPtr<CVoid>)

public expect fun obOpenObjectByPointer(obj: ConstPtr<CVoid>, handleattributes: UInt, passedaccessstate: ConstPtr<AccessState>, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, handle: MutPtr<Handle>): Ntstatus

public expect fun obOpenObjectByPointerWithTag(obj: ConstPtr<CVoid>, handleattributes: UInt, passedaccessstate: ConstPtr<AccessState>, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, tag: UInt, handle: MutPtr<Handle>): Ntstatus

public expect fun obQueryNameString(obj: ConstPtr<CVoid>, objectnameinfo: MutPtr<ObjectNameInformation>, length: UInt, returnlength: MutPtr<UInt>): Ntstatus

public expect fun obQueryObjectAuditingByHandle(handle: Handle, generateonclose: MutPtr<Boolean>): Ntstatus

public expect fun pfxFindPrefix(prefixtable: ConstPtr<PrefixTable>, fullname: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>): MutPtr<PrefixTableEntry>

public expect fun pfxInitialize(prefixtable: MutPtr<PrefixTable>)

public expect fun pfxInsertPrefix(prefixtable: ConstPtr<PrefixTable>, prefix: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, prefixtableentry: MutPtr<PrefixTableEntry>): Boolean

public expect fun pfxRemovePrefix(prefixtable: ConstPtr<PrefixTable>, prefixtableentry: ConstPtr<PrefixTableEntry>)

public expect fun poQueueShutdownWorkItem(workitem: MutPtr<WorkQueueItem>): Ntstatus

public expect fun psAssignImpersonationToken(thread: Pethread, token: Handle): Ntstatus

public expect fun psChargePoolQuota(process: Peprocess, pooltype: PoolType, amount: ULong)

public expect fun psChargeProcessPoolQuota(process: Peprocess, pooltype: PoolType, amount: ULong): Ntstatus

public expect fun psDereferenceImpersonationToken(impersonationtoken: ConstPtr<CVoid>)

public expect fun psDereferencePrimaryToken(primarytoken: ConstPtr<CVoid>)

public expect fun psDisableImpersonation(thread: Pethread, impersonationstate: MutPtr<SeImpersonationState>): Boolean

public expect fun psGetProcessExitTime(): Long

public expect fun psGetThreadProcess(thread: Pethread): Peprocess

public expect fun psImpersonateClient(thread: Pethread, token: ConstPtr<CVoid>, copyonopen: Boolean, effectiveonly: Boolean, impersonationlevel: SecurityImpersonationLevel): Ntstatus

public expect fun psIsDiskCountersEnabled(): Boolean

public expect fun psIsSystemThread(thread: Pethread): Boolean

public expect fun psIsThreadTerminating(thread: Pethread): Boolean

public expect fun psLookupProcessByProcessId(processid: Handle, process: MutPtr<Peprocess>): Ntstatus

public expect fun psLookupThreadByThreadId(threadid: Handle, thread: MutPtr<Pethread>): Ntstatus

public expect fun psReferenceImpersonationToken(thread: Pethread, copyonopen: MutPtr<Boolean>, effectiveonly: MutPtr<Boolean>, impersonationlevel: MutPtr<SecurityImpersonationLevel>): MutPtr<CVoid>

public expect fun psReferencePrimaryToken(process: Peprocess): MutPtr<CVoid>

public expect fun psRestoreImpersonation(thread: Pethread, impersonationstate: ConstPtr<SeImpersonationState>)

public expect fun psReturnPoolQuota(process: Peprocess, pooltype: PoolType, amount: ULong)

public expect fun psRevertToSelf()

public expect fun psUpdateDiskCounters(process: Peprocess, bytesread: ULong, byteswritten: ULong, readoperationcount: UInt, writeoperationcount: UInt, flushoperationcount: UInt)

public expect fun querySecurityContextToken(phcontext: ConstPtr<SecHandle>, token: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun rtlAbsoluteToSelfRelativeSD(absolutesecuritydescriptor: PsecurityDescriptor, selfrelativesecuritydescriptor: PsecurityDescriptor, bufferlength: MutPtr<UInt>): Ntstatus

public expect fun rtlAddAccessAllowedAce(acl: MutPtr<Acl>, acerevision: UInt, accessmask: UInt, sid: Psid): Ntstatus

public expect fun rtlAddAccessAllowedAceEx(acl: MutPtr<Acl>, acerevision: UInt, aceflags: UInt, accessmask: UInt, sid: Psid): Ntstatus

public expect fun rtlAddAce(acl: MutPtr<Acl>, acerevision: UInt, startingaceindex: UInt, acelist: ConstPtr<CVoid>, acelistlength: UInt): Ntstatus

public expect fun rtlAllocateAndInitializeSid(identifierauthority: ConstPtr<SidIdentifierAuthority>, subauthoritycount: UByte, subauthority0: UInt, subauthority1: UInt, subauthority2: UInt, subauthority3: UInt, subauthority4: UInt, subauthority5: UInt, subauthority6: UInt, subauthority7: UInt, sid: MutPtr<Psid>): Ntstatus

public expect fun rtlAllocateAndInitializeSidEx(identifierauthority: ConstPtr<SidIdentifierAuthority>, subauthoritycount: UByte, subauthorities: ConstPtr<UInt>, sid: MutPtr<Psid>): Ntstatus

public expect fun rtlAllocateHeap(heaphandle: ConstPtr<CVoid>, flags: UInt, size: ULong): MutPtr<CVoid>

public expect fun rtlAppendStringToString(destination: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, source: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>): Ntstatus

public expect fun rtlCompareAltitudes(altitude1: ConstPtr<UnicodeString>, altitude2: ConstPtr<UnicodeString>): Int

public expect fun rtlCompareMemoryUlong(source: ConstPtr<CVoid>, length: ULong, pattern: UInt): ULong

public expect fun rtlCompressBuffer(compressionformatandengine: UShort, uncompressedbuffer: ConstPtr<UByte>, uncompressedbuffersize: UInt, compressedbuffer: MutPtr<UByte>, compressedbuffersize: UInt, uncompressedchunksize: UInt, finalcompressedsize: MutPtr<UInt>, workspace: ConstPtr<CVoid>): Ntstatus

public expect fun rtlCompressChunks(uncompressedbuffer: ConstPtr<UByte>, uncompressedbuffersize: UInt, compressedbuffer: MutPtr<UByte>, compressedbuffersize: UInt, compresseddatainfo: MutPtr<CompressedDataInfo>, compresseddatainfolength: UInt, workspace: ConstPtr<CVoid>): Ntstatus

public expect fun rtlCopyLuid(destinationluid: MutPtr<Luid>, sourceluid: ConstPtr<Luid>)

public expect fun rtlCopySid(destinationsidlength: UInt, destinationsid: Psid, sourcesid: Psid): Ntstatus

public expect fun rtlCreateAcl(acl: MutPtr<Acl>, acllength: UInt, aclrevision: UInt): Ntstatus

public expect fun rtlCreateHeap(flags: UInt, heapbase: ConstPtr<CVoid>, reservesize: ULong, commitsize: ULong, lock: ConstPtr<CVoid>, parameters: ConstPtr<RtlHeapParameters>): MutPtr<CVoid>

public expect fun rtlCreateServiceSid(servicename: ConstPtr<UnicodeString>, servicesid: Psid, servicesidlength: MutPtr<UInt>): Ntstatus

public expect fun rtlCreateSystemVolumeInformationFolder(volumerootpath: ConstPtr<UnicodeString>): Ntstatus

public expect fun rtlCreateUnicodeString(destinationstring: MutPtr<UnicodeString>, sourcestring: Pcwstr): Boolean

public expect fun rtlCreateVirtualAccountSid(name: ConstPtr<UnicodeString>, basesubauthority: UInt, sid: Psid, sidlength: MutPtr<UInt>): Ntstatus

public expect fun rtlCustomCPToUnicodeN(customcp: ConstPtr<Cptableinfo>, unicodestring: Pwstr, maxbytesinunicodestring: UInt, bytesinunicodestring: MutPtr<UInt>, customcpstring: Pcstr, bytesincustomcpstring: UInt): Ntstatus

public expect fun rtlDecompressBuffer(compressionformat: UShort, uncompressedbuffer: MutPtr<UByte>, uncompressedbuffersize: UInt, compressedbuffer: ConstPtr<UByte>, compressedbuffersize: UInt, finaluncompressedsize: MutPtr<UInt>): Ntstatus

public expect fun rtlDecompressBufferEx(compressionformat: UShort, uncompressedbuffer: MutPtr<UByte>, uncompressedbuffersize: UInt, compressedbuffer: ConstPtr<UByte>, compressedbuffersize: UInt, finaluncompressedsize: MutPtr<UInt>, workspace: ConstPtr<CVoid>): Ntstatus

public expect fun rtlDecompressBufferEx2(compressionformat: UShort, uncompressedbuffer: MutPtr<UByte>, uncompressedbuffersize: UInt, compressedbuffer: ConstPtr<UByte>, compressedbuffersize: UInt, uncompressedchunksize: UInt, finaluncompressedsize: MutPtr<UInt>, workspace: ConstPtr<CVoid>): Ntstatus

public expect fun rtlDecompressChunks(uncompressedbuffer: MutPtr<UByte>, uncompressedbuffersize: UInt, compressedbuffer: ConstPtr<UByte>, compressedbuffersize: UInt, compressedtail: ConstPtr<UByte>, compressedtailsize: UInt, compresseddatainfo: ConstPtr<CompressedDataInfo>): Ntstatus

public expect fun rtlDecompressFragment(compressionformat: UShort, uncompressedfragment: MutPtr<UByte>, uncompressedfragmentsize: UInt, compressedbuffer: ConstPtr<UByte>, compressedbuffersize: UInt, fragmentoffset: UInt, finaluncompressedsize: MutPtr<UInt>, workspace: ConstPtr<CVoid>): Ntstatus

public expect fun rtlDecompressFragmentEx(compressionformat: UShort, uncompressedfragment: MutPtr<UByte>, uncompressedfragmentsize: UInt, compressedbuffer: ConstPtr<UByte>, compressedbuffersize: UInt, fragmentoffset: UInt, uncompressedchunksize: UInt, finaluncompressedsize: MutPtr<UInt>, workspace: ConstPtr<CVoid>): Ntstatus

public expect fun rtlDeleteAce(acl: MutPtr<Acl>, aceindex: UInt): Ntstatus

public expect fun rtlDescribeChunk(compressionformat: UShort, compressedbuffer: MutPtr<MutPtr<UByte>>, endofcompressedbufferplus1: ConstPtr<UByte>, chunkbuffer: MutPtr<MutPtr<UByte>>, chunksize: MutPtr<UInt>): Ntstatus

public expect fun rtlDestroyHeap(heaphandle: ConstPtr<CVoid>): MutPtr<CVoid>

public expect fun rtlDosPathNameToNtPathNameUWithStatus(dosfilename: Pcwstr, ntfilename: MutPtr<UnicodeString>, filepart: MutPtr<Pwstr>, reserved: ConstPtr<CVoid>): Ntstatus

public expect fun rtlDowncaseUnicodeString(destinationstring: MutPtr<UnicodeString>, sourcestring: ConstPtr<UnicodeString>, allocatedestinationstring: Boolean): Ntstatus

public expect fun rtlDuplicateUnicodeString(flags: UInt, stringin: ConstPtr<UnicodeString>, stringout: MutPtr<UnicodeString>): Ntstatus

public expect fun rtlEqualPrefixSid(sid1: Psid, sid2: Psid): Boolean

public expect fun rtlEqualSid(sid1: Psid, sid2: Psid): Boolean

public expect fun rtlFindUnicodePrefix(prefixtable: ConstPtr<UnicodePrefixTable>, fullname: ConstPtr<UnicodeString>, caseinsensitiveindex: UInt): MutPtr<UnicodePrefixTableEntry>

public expect fun rtlFreeHeap(heaphandle: ConstPtr<CVoid>, flags: UInt, baseaddress: ConstPtr<CVoid>): UInt

public expect fun rtlFreeSid(sid: Psid): MutPtr<CVoid>

public expect fun rtlGenerate8dot3Name(name: ConstPtr<UnicodeString>, allowextendedcharacters: Boolean, context: MutPtr<GenerateNameContext>, name8dot3: MutPtr<UnicodeString>): Ntstatus

public expect fun rtlGetAce(acl: ConstPtr<Acl>, aceindex: UInt, ace: MutPtr<MutPtr<CVoid>>): Ntstatus

public expect fun rtlGetCompressionWorkSpaceSize(compressionformatandengine: UShort, compressbufferworkspacesize: MutPtr<UInt>, compressfragmentworkspacesize: MutPtr<UInt>): Ntstatus

public expect fun rtlGetDaclSecurityDescriptor(securitydescriptor: PsecurityDescriptor, daclpresent: MutPtr<Boolean>, dacl: MutPtr<MutPtr<Acl>>, dacldefaulted: MutPtr<Boolean>): Ntstatus

public expect fun rtlGetGroupSecurityDescriptor(securitydescriptor: PsecurityDescriptor, group: MutPtr<Psid>, groupdefaulted: MutPtr<Boolean>): Ntstatus

public expect fun rtlGetOwnerSecurityDescriptor(securitydescriptor: PsecurityDescriptor, owner: MutPtr<Psid>, ownerdefaulted: MutPtr<Boolean>): Ntstatus

public expect fun rtlGetSaclSecurityDescriptor(securitydescriptor: PsecurityDescriptor, saclpresent: MutPtr<Boolean>, sacl: MutPtr<MutPtr<Acl>>, sacldefaulted: MutPtr<Boolean>): Ntstatus

public expect fun rtlIdentifierAuthoritySid(sid: Psid): MutPtr<SidIdentifierAuthority>

public expect fun rtlIdnToAscii(flags: UInt, sourcestring: Pcwstr, sourcestringlength: Int, destinationstring: Pwstr, destinationstringlength: MutPtr<Int>): Ntstatus

public expect fun rtlIdnToNameprepUnicode(flags: UInt, sourcestring: Pcwstr, sourcestringlength: Int, destinationstring: Pwstr, destinationstringlength: MutPtr<Int>): Ntstatus

public expect fun rtlIdnToUnicode(flags: UInt, sourcestring: Pcwstr, sourcestringlength: Int, destinationstring: Pwstr, destinationstringlength: MutPtr<Int>): Ntstatus

public expect fun rtlInitCodePageTable(tablebase: ConstPtr<UShort>, codepagetable: MutPtr<Cptableinfo>)

public expect fun rtlInitUnicodeStringEx(destinationstring: MutPtr<UnicodeString>, sourcestring: Pcwstr): Ntstatus

public expect fun rtlInitializeSid(sid: Psid, identifierauthority: ConstPtr<SidIdentifierAuthority>, subauthoritycount: UByte): Ntstatus

public expect fun rtlInitializeSidEx(sid: Psid, identifierauthority: ConstPtr<SidIdentifierAuthority>, subauthoritycount: UByte, vararg variadicArgs: Long): Ntstatus

public expect fun rtlInitializeUnicodePrefix(prefixtable: MutPtr<UnicodePrefixTable>)

public expect fun rtlInsertUnicodePrefix(prefixtable: ConstPtr<UnicodePrefixTable>, prefix: ConstPtr<UnicodeString>, prefixtableentry: MutPtr<UnicodePrefixTableEntry>): Boolean

public expect fun rtlIsCloudFilesPlaceholder(fileattributes: UInt, reparsetag: UInt): Boolean

public expect fun rtlIsDosDeviceNameU(dosfilename: Pcwstr): UInt

public expect fun rtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag: UInt): Boolean

public expect fun rtlIsNormalizedString(normform: UInt, sourcestring: Pcwstr, sourcestringlength: Int, normalized: MutPtr<Boolean>): Ntstatus

public expect fun rtlIsPartialPlaceholder(fileattributes: UInt, reparsetag: UInt): Boolean

public expect fun rtlIsPartialPlaceholderFileHandle(filehandle: Handle, ispartialplaceholder: MutPtr<Boolean>): Ntstatus

public expect fun rtlIsPartialPlaceholderFileInfo(infobuffer: ConstPtr<CVoid>, infoclass: FileInformationClass, ispartialplaceholder: MutPtr<Boolean>): Ntstatus

public expect fun rtlIsSandboxedToken(context: ConstPtr<SecuritySubjectContext>, previousmode: Byte): Boolean

public expect fun rtlIsValidOemCharacter(char: Pwstr): Boolean

public expect fun rtlLengthRequiredSid(subauthoritycount: UInt): UInt

public expect fun rtlLengthSid(sid: Psid): UInt

public expect fun rtlMultiByteToUnicodeN(unicodestring: Pwstr, maxbytesinunicodestring: UInt, bytesinunicodestring: MutPtr<UInt>, multibytestring: Pcstr, bytesinmultibytestring: UInt): Ntstatus

public expect fun rtlMultiByteToUnicodeSize(bytesinunicodestring: MutPtr<UInt>, multibytestring: Pcstr, bytesinmultibytestring: UInt): Ntstatus

public expect fun rtlNextUnicodePrefix(prefixtable: ConstPtr<UnicodePrefixTable>, restart: Boolean): MutPtr<UnicodePrefixTableEntry>

public expect fun rtlNormalizeString(normform: UInt, sourcestring: Pcwstr, sourcestringlength: Int, destinationstring: Pwstr, destinationstringlength: MutPtr<Int>): Ntstatus
