package io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun interface FnCallback {
    public operator fun invoke(context1: Long, context2: Long)
}

public fun interface FnCallback1 {
    public operator fun invoke(fileobject: Long, fileoffset: Long, length: UInt, oldestlsn: Long, newestlsn: Long, context1: Long, context2: Long)
}

public fun interface FnCallback2 {
    public operator fun invoke(context: Long, irp: Long): Win32.Foundation.NTSTATUS
}

public fun interface FnCallback3 {
    public operator fun invoke(notifyparams: Long): Win32.Foundation.NTSTATUS
}

public fun interface FnCallback4 {
    public operator fun invoke(notifycontext: Long, targetcontext: Long, subjectcontext: Long): Boolean
}

public fun interface FnCallback5 {
    public operator fun invoke(notifycontext: Long, filtercontext: Long): Boolean
}

public fun ApplyControlToken(phcontext: Long, pinput: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "ApplyControlToken", longArrayOf(phcontext, pinput)).toInt()
}

public fun CcAsyncCopyRead(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, buffer: Long, iostatus: Long, ioissuerthread: Foundation.PETHREAD, asyncreadcontext: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "CcAsyncCopyRead", longArrayOf(fileobject, fileoffset, length.toLong(), if (wait) 1L else 0L, buffer, iostatus, Win32DynamicFfi.objectSlot(ioissuerthread), asyncreadcontext))
    return (rawRet and 0xFFL) != 0L
}

public fun CcCanIWrite(fileobject: Long, bytestowrite: UInt, wait: Boolean, retrying: UByte): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "CcCanIWrite", longArrayOf(fileobject, bytestowrite.toLong(), if (wait) 1L else 0L, retrying.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun CcCoherencyFlushAndPurgeCache(sectionobjectpointer: Long, fileoffset: Long, length: UInt, iostatus: Long, flags: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "CcCoherencyFlushAndPurgeCache", longArrayOf(sectionobjectpointer, fileoffset, length.toLong(), iostatus, flags.toLong()))
}

public fun CcCopyRead(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, buffer: Long, iostatus: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "CcCopyRead", longArrayOf(fileobject, fileoffset, length.toLong(), if (wait) 1L else 0L, buffer, iostatus))
    return (rawRet and 0xFFL) != 0L
}

public fun CcCopyReadEx(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, buffer: Long, iostatus: Long, ioissuerthread: Foundation.PETHREAD): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "CcCopyReadEx", longArrayOf(fileobject, fileoffset, length.toLong(), if (wait) 1L else 0L, buffer, iostatus, Win32DynamicFfi.objectSlot(ioissuerthread)))
    return (rawRet and 0xFFL) != 0L
}

public fun CcCopyWrite(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, buffer: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "CcCopyWrite", longArrayOf(fileobject, fileoffset, length.toLong(), if (wait) 1L else 0L, buffer))
    return (rawRet and 0xFFL) != 0L
}

public fun CcCopyWriteEx(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, buffer: Long, ioissuerthread: Foundation.PETHREAD): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "CcCopyWriteEx", longArrayOf(fileobject, fileoffset, length.toLong(), if (wait) 1L else 0L, buffer, Win32DynamicFfi.objectSlot(ioissuerthread)))
    return (rawRet and 0xFFL) != 0L
}

public fun CcCopyWriteWontFlush(fileobject: Long, fileoffset: Long, length: UInt): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "CcCopyWriteWontFlush", longArrayOf(fileobject, fileoffset, length.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun CcDeferWrite(fileobject: Long, postroutine: PCC_POST_DEFERRED_WRITE, context1: Long, context2: Long, bytestowrite: UInt, retrying: Boolean) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "CcDeferWrite", longArrayOf(fileobject, Win32DynamicFfi.objectSlot(postroutine), context1, context2, bytestowrite.toLong(), if (retrying) 1L else 0L))
}

public fun CcErrorCallbackRoutine(context: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "CcErrorCallbackRoutine", longArrayOf(context))
    return Win32.Foundation.NTSTATUS()
}

public fun CcFastCopyRead(fileobject: Long, fileoffset: UInt, length: UInt, pagecount: UInt, buffer: Long, iostatus: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "CcFastCopyRead", longArrayOf(fileobject, fileoffset.toLong(), length.toLong(), pagecount.toLong(), buffer, iostatus))
}

public fun CcFastCopyWrite(fileobject: Long, fileoffset: UInt, length: UInt, buffer: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "CcFastCopyWrite", longArrayOf(fileobject, fileoffset.toLong(), length.toLong(), buffer))
}

public fun CcFlushCache(sectionobjectpointer: Long, fileoffset: Long, length: UInt, iostatus: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "CcFlushCache", longArrayOf(sectionobjectpointer, fileoffset, length.toLong(), iostatus))
}

public fun CcGetDirtyPages(loghandle: Long, dirtypageroutine: PDIRTY_PAGE_ROUTINE, context1: Long, context2: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "CcGetDirtyPages", longArrayOf(loghandle, Win32DynamicFfi.objectSlot(dirtypageroutine), context1, context2))
}

public fun CcGetFileObjectFromBcb(bcb: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "CcGetFileObjectFromBcb", longArrayOf(bcb))
}

public fun CcGetFileObjectFromSectionPtrs(sectionobjectpointer: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "CcGetFileObjectFromSectionPtrs", longArrayOf(sectionobjectpointer))
}

public fun CcGetFileObjectFromSectionPtrsRef(sectionobjectpointer: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "CcGetFileObjectFromSectionPtrsRef", longArrayOf(sectionobjectpointer))
}

public fun CcGetFlushedValidData(sectionobjectpointer: Long, bcblistheld: Boolean): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "CcGetFlushedValidData", longArrayOf(sectionobjectpointer, if (bcblistheld) 1L else 0L))
}

public fun CcInitializeCacheMap(fileobject: Long, filesizes: Long, pinaccess: Boolean, callbacks: Long, lazywritecontext: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "CcInitializeCacheMap", longArrayOf(fileobject, filesizes, if (pinaccess) 1L else 0L, callbacks, lazywritecontext))
}

public fun CcInitializeCacheMapEx(fileobject: Long, filesizes: Long, pinaccess: Boolean, callbacks: Long, lazywritecontext: Long, flags: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "CcInitializeCacheMapEx", longArrayOf(fileobject, filesizes, if (pinaccess) 1L else 0L, callbacks, lazywritecontext, flags.toLong()))
}

public fun CcIsCacheManagerCallbackNeeded(status: Win32.Foundation.NTSTATUS): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "CcIsCacheManagerCallbackNeeded", longArrayOf(Win32DynamicFfi.objectSlot(status)))
    return (rawRet and 0xFFL) != 0L
}

public fun CcIsThereDirtyData(vpb: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "CcIsThereDirtyData", longArrayOf(vpb))
    return (rawRet and 0xFFL) != 0L
}

public fun CcIsThereDirtyDataEx(vpb: Long, numberofdirtypages: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "CcIsThereDirtyDataEx", longArrayOf(vpb, numberofdirtypages))
    return (rawRet and 0xFFL) != 0L
}

public fun CcMapData(fileobject: Long, fileoffset: Long, length: UInt, flags: UInt, bcb: Long, buffer: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "CcMapData", longArrayOf(fileobject, fileoffset, length.toLong(), flags.toLong(), bcb, buffer))
    return (rawRet and 0xFFL) != 0L
}

public fun CcMdlRead(fileobject: Long, fileoffset: Long, length: UInt, mdlchain: Long, iostatus: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "CcMdlRead", longArrayOf(fileobject, fileoffset, length.toLong(), mdlchain, iostatus))
}

public fun CcMdlReadComplete(fileobject: Long, mdlchain: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "CcMdlReadComplete", longArrayOf(fileobject, mdlchain))
}

public fun CcMdlWriteAbort(fileobject: Long, mdlchain: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "CcMdlWriteAbort", longArrayOf(fileobject, mdlchain))
}

public fun CcMdlWriteComplete(fileobject: Long, fileoffset: Long, mdlchain: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "CcMdlWriteComplete", longArrayOf(fileobject, fileoffset, mdlchain))
}

public fun CcPinMappedData(fileobject: Long, fileoffset: Long, length: UInt, flags: UInt, bcb: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "CcPinMappedData", longArrayOf(fileobject, fileoffset, length.toLong(), flags.toLong(), bcb))
    return (rawRet and 0xFFL) != 0L
}

public fun CcPinRead(fileobject: Long, fileoffset: Long, length: UInt, flags: UInt, bcb: Long, buffer: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "CcPinRead", longArrayOf(fileobject, fileoffset, length.toLong(), flags.toLong(), bcb, buffer))
    return (rawRet and 0xFFL) != 0L
}

public fun CcPrepareMdlWrite(fileobject: Long, fileoffset: Long, length: UInt, mdlchain: Long, iostatus: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "CcPrepareMdlWrite", longArrayOf(fileobject, fileoffset, length.toLong(), mdlchain, iostatus))
}

public fun CcPreparePinWrite(fileobject: Long, fileoffset: Long, length: UInt, zero: Boolean, flags: UInt, bcb: Long, buffer: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "CcPreparePinWrite", longArrayOf(fileobject, fileoffset, length.toLong(), if (zero) 1L else 0L, flags.toLong(), bcb, buffer))
    return (rawRet and 0xFFL) != 0L
}

public fun CcPurgeCacheSection(sectionobjectpointer: Long, fileoffset: Long, length: UInt, flags: UInt): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "CcPurgeCacheSection", longArrayOf(sectionobjectpointer, fileoffset, length.toLong(), flags.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun CcRemapBcb(bcb: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "CcRemapBcb", longArrayOf(bcb))
}

public fun CcRepinBcb(bcb: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "CcRepinBcb", longArrayOf(bcb))
}

public fun CcScheduleReadAhead(fileobject: Long, fileoffset: Long, length: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "CcScheduleReadAhead", longArrayOf(fileobject, fileoffset, length.toLong()))
}

public fun CcScheduleReadAheadEx(fileobject: Long, fileoffset: Long, length: UInt, ioissuerthread: Foundation.PETHREAD) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "CcScheduleReadAheadEx", longArrayOf(fileobject, fileoffset, length.toLong(), Win32DynamicFfi.objectSlot(ioissuerthread)))
}

public fun CcSetAdditionalCacheAttributes(fileobject: Long, disablereadahead: Boolean, disablewritebehind: Boolean) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "CcSetAdditionalCacheAttributes", longArrayOf(fileobject, if (disablereadahead) 1L else 0L, if (disablewritebehind) 1L else 0L))
}

public fun CcSetAdditionalCacheAttributesEx(fileobject: Long, flags: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "CcSetAdditionalCacheAttributesEx", longArrayOf(fileobject, flags.toLong()))
}

public fun CcSetBcbOwnerPointer(bcb: Long, ownerpointer: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "CcSetBcbOwnerPointer", longArrayOf(bcb, ownerpointer))
}

public fun CcSetDirtyPageThreshold(fileobject: Long, dirtypagethreshold: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "CcSetDirtyPageThreshold", longArrayOf(fileobject, dirtypagethreshold.toLong()))
}

public fun CcSetDirtyPinnedData(bcbvoid: Long, lsn: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "CcSetDirtyPinnedData", longArrayOf(bcbvoid, lsn))
}

public fun CcSetFileSizes(fileobject: Long, filesizes: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "CcSetFileSizes", longArrayOf(fileobject, filesizes))
}

public fun CcSetFileSizesEx(fileobject: Long, filesizes: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "CcSetFileSizesEx", longArrayOf(fileobject, filesizes))
    return Win32.Foundation.NTSTATUS()
}

public fun CcSetLogHandleForFile(fileobject: Long, loghandle: Long, flushtolsnroutine: PFLUSH_TO_LSN) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "CcSetLogHandleForFile", longArrayOf(fileobject, loghandle, Win32DynamicFfi.objectSlot(flushtolsnroutine)))
}

public fun CcSetParallelFlushFile(fileobject: Long, enableparallelflush: Boolean) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "CcSetParallelFlushFile", longArrayOf(fileobject, if (enableparallelflush) 1L else 0L))
}

public fun CcSetReadAheadGranularity(fileobject: Long, granularity: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "CcSetReadAheadGranularity", longArrayOf(fileobject, granularity.toLong()))
}

public fun CcUninitializeCacheMap(fileobject: Long, truncatesize: Long, uninitializeevent: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "CcUninitializeCacheMap", longArrayOf(fileobject, truncatesize, uninitializeevent))
    return (rawRet and 0xFFL) != 0L
}

public fun CcUnpinData(bcb: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "CcUnpinData", longArrayOf(bcb))
}

public fun CcUnpinDataForThread(bcb: Long, resourcethreadid: ULong) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "CcUnpinDataForThread", longArrayOf(bcb, resourcethreadid.toLong()))
}

public fun CcUnpinRepinnedBcb(bcb: Long, writethrough: Boolean, iostatus: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "CcUnpinRepinnedBcb", longArrayOf(bcb, if (writethrough) 1L else 0L, iostatus))
}

public fun CcWaitForCurrentLazyWriterActivity(): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "CcWaitForCurrentLazyWriterActivity", longArrayOf())
    return Win32.Foundation.NTSTATUS()
}

public fun CcZeroData(fileobject: Long, startoffset: Long, endoffset: Long, wait: Boolean): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "CcZeroData", longArrayOf(fileobject, startoffset, endoffset, if (wait) 1L else 0L))
    return (rawRet and 0xFFL) != 0L
}

public fun CompleteAuthToken(phcontext: Long, ptoken: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "CompleteAuthToken", longArrayOf(phcontext, ptoken)).toInt()
}

public fun ExDisableResourceBoostLite(resource: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ExDisableResourceBoostLite", longArrayOf(resource))
}

public fun ExQueryPoolBlockSize(poolblock: Long, quotacharged: Long): ULong {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ExQueryPoolBlockSize", longArrayOf(poolblock, quotacharged)).toULong()
}

public fun ExportSecurityContext(phcontext: Long, fflags: UInt, ppackedcontext: Long, ptoken: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "ExportSecurityContext", longArrayOf(phcontext, fflags.toLong(), ppackedcontext, ptoken)).toInt()
}

public fun FsRtlAcknowledgeEcp(ecpcontext: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlAcknowledgeEcp", longArrayOf(ecpcontext))
}

public fun FsRtlAcquireFileExclusive(fileobject: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlAcquireFileExclusive", longArrayOf(fileobject))
}

public fun FsRtlAddBaseMcbEntry(mcb: Long, vbn: Long, lbn: Long, sectorcount: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlAddBaseMcbEntry", longArrayOf(mcb, vbn, lbn, sectorcount))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlAddBaseMcbEntryEx(mcb: Long, vbn: Long, lbn: Long, sectorcount: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlAddBaseMcbEntryEx", longArrayOf(mcb, vbn, lbn, sectorcount))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlAddLargeMcbEntry(mcb: Long, vbn: Long, lbn: Long, sectorcount: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlAddLargeMcbEntry", longArrayOf(mcb, vbn, lbn, sectorcount))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlAddMcbEntry(mcb: Long, vbn: UInt, lbn: UInt, sectorcount: UInt): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlAddMcbEntry", longArrayOf(mcb, vbn.toLong(), lbn.toLong(), sectorcount.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlAddToTunnelCache(cache: Long, directorykey: ULong, shortname: Long, longname: Long, keybyshortname: Boolean, datalength: UInt, data: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlAddToTunnelCache", longArrayOf(cache, directorykey.toLong(), shortname, longname, if (keybyshortname) 1L else 0L, datalength.toLong(), data))
}

public fun FsRtlAddToTunnelCacheEx(cache: Long, directorykey: ULong, shortname: Long, longname: Long, flags: UInt, datalength: UInt, data: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlAddToTunnelCacheEx", longArrayOf(cache, directorykey.toLong(), shortname, longname, flags.toLong(), datalength.toLong(), data))
}

public fun FsRtlAllocateAePushLock(pooltype: Foundation.POOL_TYPE, tag: UInt): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlAllocateAePushLock", longArrayOf(Win32DynamicFfi.objectSlot(pooltype), tag.toLong()))
}

public fun FsRtlAllocateExtraCreateParameter(ecptype: Long, sizeofcontext: UInt, flags: UInt, cleanupcallback: PFSRTL_EXTRA_CREATE_PARAMETER_CLEANUP_CALLBACK, pooltag: UInt, ecpcontext: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlAllocateExtraCreateParameter", longArrayOf(ecptype, sizeofcontext.toLong(), flags.toLong(), Win32DynamicFfi.objectSlot(cleanupcallback), pooltag.toLong(), ecpcontext))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlAllocateExtraCreateParameterFromLookasideList(ecptype: Long, sizeofcontext: UInt, flags: UInt, cleanupcallback: PFSRTL_EXTRA_CREATE_PARAMETER_CLEANUP_CALLBACK, lookasidelist: Long, ecpcontext: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlAllocateExtraCreateParameterFromLookasideList", longArrayOf(ecptype, sizeofcontext.toLong(), flags.toLong(), Win32DynamicFfi.objectSlot(cleanupcallback), lookasidelist, ecpcontext))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlAllocateExtraCreateParameterList(flags: UInt, ecplist: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlAllocateExtraCreateParameterList", longArrayOf(flags.toLong(), ecplist))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlAllocateFileLock(completelockirproutine: PCOMPLETE_LOCK_IRP_ROUTINE, unlockroutine: PUNLOCK_ROUTINE): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlAllocateFileLock", longArrayOf(Win32DynamicFfi.objectSlot(completelockirproutine), Win32DynamicFfi.objectSlot(unlockroutine)))
}

public fun FsRtlAllocateResource(): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlAllocateResource", longArrayOf())
}

public fun FsRtlAreNamesEqual(constantnamea: Long, constantnameb: Long, ignorecase: Boolean, upcasetable: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlAreNamesEqual", longArrayOf(constantnamea, constantnameb, if (ignorecase) 1L else 0L, upcasetable))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlAreThereCurrentOrInProgressFileLocks(filelock: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlAreThereCurrentOrInProgressFileLocks", longArrayOf(filelock))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlAreThereWaitingFileLocks(filelock: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlAreThereWaitingFileLocks", longArrayOf(filelock))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlAreVolumeStartupApplicationsComplete(): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlAreVolumeStartupApplicationsComplete", longArrayOf())
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlBalanceReads(targetdevice: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlBalanceReads", longArrayOf(targetdevice))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlCancellableWaitForMultipleObjects(count: UInt, objectarray: Long, waittype: Win32.System.Kernel.WAIT_TYPE, timeout: Long, waitblockarray: Long, irp: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlCancellableWaitForMultipleObjects", longArrayOf(count.toLong(), objectarray, Win32DynamicFfi.objectSlot(waittype), timeout, waitblockarray, irp))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlCancellableWaitForSingleObject(obj: Long, timeout: Long, irp: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlCancellableWaitForSingleObject", longArrayOf(obj, timeout, irp))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlChangeBackingFileObject(currentfileobject: Long, newfileobject: Long, changebackingtype: FSRTL_CHANGE_BACKING_TYPE, flags: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlChangeBackingFileObject", longArrayOf(currentfileobject, newfileobject, changebackingtype.toLong(), flags.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlCheckLockForOplockRequest(filelock: Long, allocationsize: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlCheckLockForOplockRequest", longArrayOf(filelock, allocationsize))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlCheckLockForReadAccess(filelock: Long, irp: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlCheckLockForReadAccess", longArrayOf(filelock, irp))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlCheckLockForWriteAccess(filelock: Long, irp: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlCheckLockForWriteAccess", longArrayOf(filelock, irp))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlCheckOplock(oplock: Long, irp: Long, context: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlCheckOplock", longArrayOf(oplock, irp, context, Win32DynamicFfi.objectSlot(completionroutine), Win32DynamicFfi.objectSlot(postirproutine)))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlCheckOplockEx(oplock: Long, irp: Long, flags: UInt, context: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlCheckOplockEx", longArrayOf(oplock, irp, flags.toLong(), context, Win32DynamicFfi.objectSlot(completionroutine), Win32DynamicFfi.objectSlot(postirproutine)))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlCheckOplockEx2(oplock: Long, irp: Long, flags: UInt, flagsex2: UInt, completionroutinecontext: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP, timeout: ULong, notifycontext: Long, notifyroutine: POPLOCK_NOTIFY_ROUTINE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlCheckOplockEx2", longArrayOf(oplock, irp, flags.toLong(), flagsex2.toLong(), completionroutinecontext, Win32DynamicFfi.objectSlot(completionroutine), Win32DynamicFfi.objectSlot(postirproutine), timeout.toLong(), notifycontext, Win32DynamicFfi.objectSlot(notifyroutine)))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlCheckUpperOplock(oplock: Long, newloweroplockstate: UInt, completionroutinecontext: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, prependroutine: POPLOCK_FS_PREPOST_IRP, flags: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlCheckUpperOplock", longArrayOf(oplock, newloweroplockstate.toLong(), completionroutinecontext, Win32DynamicFfi.objectSlot(completionroutine), Win32DynamicFfi.objectSlot(prependroutine), flags.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlCopyRead(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, lockkey: UInt, buffer: Long, iostatus: Long, deviceobject: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlCopyRead", longArrayOf(fileobject, fileoffset, length.toLong(), if (wait) 1L else 0L, lockkey.toLong(), buffer, iostatus, deviceobject))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlCopyWrite(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, lockkey: UInt, buffer: Long, iostatus: Long, deviceobject: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlCopyWrite", longArrayOf(fileobject, fileoffset, length.toLong(), if (wait) 1L else 0L, lockkey.toLong(), buffer, iostatus, deviceobject))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlCreateSectionForDataScan(sectionhandle: Long, sectionobject: Long, sectionfilesize: Long, fileobject: Long, desiredaccess: UInt, objectattributes: Long, maximumsize: Long, sectionpageprotection: UInt, allocationattributes: UInt, flags: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlCreateSectionForDataScan", longArrayOf(sectionhandle, sectionobject, sectionfilesize, fileobject, desiredaccess.toLong(), objectattributes, maximumsize, sectionpageprotection.toLong(), allocationattributes.toLong(), flags.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlCurrentBatchOplock(oplock: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlCurrentBatchOplock", longArrayOf(oplock))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlCurrentOplock(oplock: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlCurrentOplock", longArrayOf(oplock))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlCurrentOplockH(oplock: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlCurrentOplockH", longArrayOf(oplock))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlDeleteExtraCreateParameterLookasideList(lookaside: Long, flags: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlDeleteExtraCreateParameterLookasideList", longArrayOf(lookaside, flags.toLong()))
}

public fun FsRtlDeleteKeyFromTunnelCache(cache: Long, directorykey: ULong) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlDeleteKeyFromTunnelCache", longArrayOf(cache, directorykey.toLong()))
}

public fun FsRtlDeleteTunnelCache(cache: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlDeleteTunnelCache", longArrayOf(cache))
}

public fun FsRtlDeregisterUncProvider(handle: Win32.Foundation.HANDLE) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlDeregisterUncProvider", longArrayOf(Win32DynamicFfi.objectSlot(handle)))
}

public fun FsRtlDismountComplete(deviceobject: Long, dismountstatus: Win32.Foundation.NTSTATUS) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlDismountComplete", longArrayOf(deviceobject, Win32DynamicFfi.objectSlot(dismountstatus)))
}

public fun FsRtlDissectDbcs(path: Win32.System.Kernel.STRING, firstname: Long, remainingname: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlDissectDbcs", longArrayOf(Win32DynamicFfi.objectSlot(path), firstname, remainingname))
}

public fun FsRtlDissectName(path: Win32.Foundation.UNICODE_STRING, firstname: Long, remainingname: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlDissectName", longArrayOf(Win32DynamicFfi.objectSlot(path), firstname, remainingname))
}

public fun FsRtlDoesDbcsContainWildCards(name: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlDoesDbcsContainWildCards", longArrayOf(name))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlDoesNameContainWildCards(name: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlDoesNameContainWildCards", longArrayOf(name))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlFastCheckLockForRead(filelock: Long, startingbyte: Long, length: Long, key: UInt, fileobject: Long, processid: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlFastCheckLockForRead", longArrayOf(filelock, startingbyte, length, key.toLong(), fileobject, processid))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlFastCheckLockForWrite(filelock: Long, startingbyte: Long, length: Long, key: UInt, fileobject: Long, processid: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlFastCheckLockForWrite", longArrayOf(filelock, startingbyte, length, key.toLong(), fileobject, processid))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlFastUnlockAll(filelock: Long, fileobject: Long, processid: Foundation.PEPROCESS, context: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlFastUnlockAll", longArrayOf(filelock, fileobject, Win32DynamicFfi.objectSlot(processid), context))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlFastUnlockAllByKey(filelock: Long, fileobject: Long, processid: Foundation.PEPROCESS, key: UInt, context: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlFastUnlockAllByKey", longArrayOf(filelock, fileobject, Win32DynamicFfi.objectSlot(processid), key.toLong(), context))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlFastUnlockSingle(filelock: Long, fileobject: Long, fileoffset: Long, length: Long, processid: Foundation.PEPROCESS, key: UInt, context: Long, alreadysynchronized: Boolean): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlFastUnlockSingle", longArrayOf(filelock, fileobject, fileoffset, length, Win32DynamicFfi.objectSlot(processid), key.toLong(), context, if (alreadysynchronized) 1L else 0L))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlFindExtraCreateParameter(ecplist: Long, ecptype: Long, ecpcontext: Long, ecpcontextsize: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlFindExtraCreateParameter", longArrayOf(ecplist, ecptype, ecpcontext, ecpcontextsize))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlFindInTunnelCache(cache: Long, directorykey: ULong, name: Long, shortname: Long, longname: Long, datalength: Long, data: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlFindInTunnelCache", longArrayOf(cache, directorykey.toLong(), name, shortname, longname, datalength, data))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlFindInTunnelCacheEx(cache: Long, directorykey: ULong, name: Long, shortname: Long, longname: Long, flags: UInt, datalength: Long, data: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlFindInTunnelCacheEx", longArrayOf(cache, directorykey.toLong(), name, shortname, longname, flags.toLong(), datalength, data))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlFreeAePushLock(aepushlock: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlFreeAePushLock", longArrayOf(aepushlock))
}

public fun FsRtlFreeExtraCreateParameter(ecpcontext: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlFreeExtraCreateParameter", longArrayOf(ecpcontext))
}

public fun FsRtlFreeExtraCreateParameterList(ecplist: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlFreeExtraCreateParameterList", longArrayOf(ecplist))
}

public fun FsRtlFreeFileLock(filelock: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlFreeFileLock", longArrayOf(filelock))
}

public fun FsRtlGetCurrentProcessLoaderList(): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlGetCurrentProcessLoaderList", longArrayOf())
}

public fun FsRtlGetEcpListFromIrp(irp: Long, ecplist: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlGetEcpListFromIrp", longArrayOf(irp, ecplist))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlGetFileSize(fileobject: Long, filesize: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlGetFileSize", longArrayOf(fileobject, filesize))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlGetNextBaseMcbEntry(mcb: Long, runindex: UInt, vbn: Long, lbn: Long, sectorcount: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlGetNextBaseMcbEntry", longArrayOf(mcb, runindex.toLong(), vbn, lbn, sectorcount))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlGetNextExtraCreateParameter(ecplist: Long, currentecpcontext: Long, nextecptype: Long, nextecpcontext: Long, nextecpcontextsize: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlGetNextExtraCreateParameter", longArrayOf(ecplist, currentecpcontext, nextecptype, nextecpcontext, nextecpcontextsize))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlGetNextFileLock(filelock: Long, restart: Boolean): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlGetNextFileLock", longArrayOf(filelock, if (restart) 1L else 0L))
}

public fun FsRtlGetNextLargeMcbEntry(mcb: Long, runindex: UInt, vbn: Long, lbn: Long, sectorcount: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlGetNextLargeMcbEntry", longArrayOf(mcb, runindex.toLong(), vbn, lbn, sectorcount))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlGetNextMcbEntry(mcb: Long, runindex: UInt, vbn: Long, lbn: Long, sectorcount: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlGetNextMcbEntry", longArrayOf(mcb, runindex.toLong(), vbn, lbn, sectorcount))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlGetSectorSizeInformation(deviceobject: Long, sectorsizeinfo: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlGetSectorSizeInformation", longArrayOf(deviceobject, sectorsizeinfo))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlGetSupportedFeatures(deviceobject: Long, supportedfeatures: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlGetSupportedFeatures", longArrayOf(deviceobject, supportedfeatures))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlGetVirtualDiskNestingLevel(deviceobject: Long, nestinglevel: Long, nestingflags: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlGetVirtualDiskNestingLevel", longArrayOf(deviceobject, nestinglevel, nestingflags))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlIncrementCcFastMdlReadWait() {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlIncrementCcFastMdlReadWait", longArrayOf())
}

public fun FsRtlIncrementCcFastReadNoWait() {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlIncrementCcFastReadNoWait", longArrayOf())
}

public fun FsRtlIncrementCcFastReadNotPossible() {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlIncrementCcFastReadNotPossible", longArrayOf())
}

public fun FsRtlIncrementCcFastReadResourceMiss() {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlIncrementCcFastReadResourceMiss", longArrayOf())
}

public fun FsRtlIncrementCcFastReadWait() {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlIncrementCcFastReadWait", longArrayOf())
}

public fun FsRtlInitExtraCreateParameterLookasideList(lookaside: Long, flags: UInt, size: ULong, tag: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlInitExtraCreateParameterLookasideList", longArrayOf(lookaside, flags.toLong(), size.toLong(), tag.toLong()))
}

public fun FsRtlInitializeBaseMcb(mcb: Long, pooltype: Foundation.POOL_TYPE) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlInitializeBaseMcb", longArrayOf(mcb, Win32DynamicFfi.objectSlot(pooltype)))
}

public fun FsRtlInitializeBaseMcbEx(mcb: Long, pooltype: Foundation.POOL_TYPE, flags: UShort): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlInitializeBaseMcbEx", longArrayOf(mcb, Win32DynamicFfi.objectSlot(pooltype), flags.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlInitializeExtraCreateParameter(ecp: Long, ecpflags: UInt, cleanupcallback: PFSRTL_EXTRA_CREATE_PARAMETER_CLEANUP_CALLBACK, totalsize: UInt, ecptype: Long, listallocatedfrom: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlInitializeExtraCreateParameter", longArrayOf(ecp, ecpflags.toLong(), Win32DynamicFfi.objectSlot(cleanupcallback), totalsize.toLong(), ecptype, listallocatedfrom))
}

public fun FsRtlInitializeExtraCreateParameterList(ecplist: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlInitializeExtraCreateParameterList", longArrayOf(ecplist))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlInitializeFileLock(filelock: Long, completelockirproutine: PCOMPLETE_LOCK_IRP_ROUTINE, unlockroutine: PUNLOCK_ROUTINE) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlInitializeFileLock", longArrayOf(filelock, Win32DynamicFfi.objectSlot(completelockirproutine), Win32DynamicFfi.objectSlot(unlockroutine)))
}

public fun FsRtlInitializeLargeMcb(mcb: Long, pooltype: Foundation.POOL_TYPE) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlInitializeLargeMcb", longArrayOf(mcb, Win32DynamicFfi.objectSlot(pooltype)))
}

public fun FsRtlInitializeMcb(mcb: Long, pooltype: Foundation.POOL_TYPE) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlInitializeMcb", longArrayOf(mcb, Win32DynamicFfi.objectSlot(pooltype)))
}

public fun FsRtlInitializeOplock(oplock: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlInitializeOplock", longArrayOf(oplock))
}

public fun FsRtlInitializeTunnelCache(cache: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlInitializeTunnelCache", longArrayOf(cache))
}

public fun FsRtlInsertExtraCreateParameter(ecplist: Long, ecpcontext: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlInsertExtraCreateParameter", longArrayOf(ecplist, ecpcontext))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlInsertPerFileContext(perfilecontextpointer: Long, ptr: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlInsertPerFileContext", longArrayOf(perfilecontextpointer, ptr))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlInsertPerFileObjectContext(fileobject: Long, ptr: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlInsertPerFileObjectContext", longArrayOf(fileobject, ptr))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlInsertPerStreamContext(perstreamcontext: Long, ptr: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlInsertPerStreamContext", longArrayOf(perstreamcontext, ptr))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlIs32BitProcess(process: Foundation.PEPROCESS): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlIs32BitProcess", longArrayOf(Win32DynamicFfi.objectSlot(process)))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlIsDaxVolume(fileobject: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlIsDaxVolume", longArrayOf(fileobject))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlIsDbcsInExpression(expression: Long, name: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlIsDbcsInExpression", longArrayOf(expression, name))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlIsEcpAcknowledged(ecpcontext: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlIsEcpAcknowledged", longArrayOf(ecpcontext))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlIsEcpFromUserMode(ecpcontext: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlIsEcpFromUserMode", longArrayOf(ecpcontext))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlIsExtentDangling(startpage: UInt, numberofpages: UInt, flags: UInt): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlIsExtentDangling", longArrayOf(startpage.toLong(), numberofpages.toLong(), flags.toLong())).toUInt()
}

public fun FsRtlIsFatDbcsLegal(dbcsname: Win32.System.Kernel.STRING, wildcardspermissible: Boolean, pathnamepermissible: Boolean, leadingbackslashpermissible: Boolean): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlIsFatDbcsLegal", longArrayOf(Win32DynamicFfi.objectSlot(dbcsname), if (wildcardspermissible) 1L else 0L, if (pathnamepermissible) 1L else 0L, if (leadingbackslashpermissible) 1L else 0L))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlIsHpfsDbcsLegal(dbcsname: Win32.System.Kernel.STRING, wildcardspermissible: Boolean, pathnamepermissible: Boolean, leadingbackslashpermissible: Boolean): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlIsHpfsDbcsLegal", longArrayOf(Win32DynamicFfi.objectSlot(dbcsname), if (wildcardspermissible) 1L else 0L, if (pathnamepermissible) 1L else 0L, if (leadingbackslashpermissible) 1L else 0L))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlIsMobileOS(): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlIsMobileOS", longArrayOf())
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlIsNameInExpression(expression: Long, name: Long, ignorecase: Boolean, upcasetable: PCWSTR): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlIsNameInExpression", longArrayOf(expression, name, if (ignorecase) 1L else 0L, upcasetable))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlIsNameInUnUpcasedExpression(expression: Long, name: Long, ignorecase: Boolean, upcasetable: PCWSTR): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlIsNameInUnUpcasedExpression", longArrayOf(expression, name, if (ignorecase) 1L else 0L, upcasetable))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag: UInt): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlIsNonEmptyDirectoryReparsePointAllowed", longArrayOf(reparsetag.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlIsNtstatusExpected(exception: Win32.Foundation.NTSTATUS): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlIsNtstatusExpected", longArrayOf(Win32DynamicFfi.objectSlot(exception)))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlIsPagingFile(fileobject: Long): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlIsPagingFile", longArrayOf(fileobject)).toUInt()
}

public fun FsRtlIsSystemPagingFile(fileobject: Long): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlIsSystemPagingFile", longArrayOf(fileobject)).toUInt()
}

public fun FsRtlIssueDeviceIoControl(deviceobject: Long, ioctl: UInt, flags: UByte, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt, iosbinformation: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlIssueDeviceIoControl", longArrayOf(deviceobject, ioctl.toLong(), flags.toLong(), inputbuffer, inputbufferlength.toLong(), outputbuffer, outputbufferlength.toLong(), iosbinformation))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlKernelFsControlFile(fileobject: Long, fscontrolcode: UInt, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt, retoutputbuffersize: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlKernelFsControlFile", longArrayOf(fileobject, fscontrolcode.toLong(), inputbuffer, inputbufferlength.toLong(), outputbuffer, outputbufferlength.toLong(), retoutputbuffersize))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlLogCcFlushError(filename: Long, deviceobject: Long, sectionobjectpointer: Long, flusherror: Win32.Foundation.NTSTATUS, flags: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlLogCcFlushError", longArrayOf(filename, deviceobject, sectionobjectpointer, Win32DynamicFfi.objectSlot(flusherror), flags.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlLookupBaseMcbEntry(mcb: Long, vbn: Long, lbn: Long, sectorcountfromlbn: Long, startinglbn: Long, sectorcountfromstartinglbn: Long, index: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlLookupBaseMcbEntry", longArrayOf(mcb, vbn, lbn, sectorcountfromlbn, startinglbn, sectorcountfromstartinglbn, index))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlLookupLargeMcbEntry(mcb: Long, vbn: Long, lbn: Long, sectorcountfromlbn: Long, startinglbn: Long, sectorcountfromstartinglbn: Long, index: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlLookupLargeMcbEntry", longArrayOf(mcb, vbn, lbn, sectorcountfromlbn, startinglbn, sectorcountfromstartinglbn, index))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlLookupLastBaseMcbEntry(mcb: Long, vbn: Long, lbn: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlLookupLastBaseMcbEntry", longArrayOf(mcb, vbn, lbn))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlLookupLastBaseMcbEntryAndIndex(opaquemcb: Long, largevbn: Long, largelbn: Long, index: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlLookupLastBaseMcbEntryAndIndex", longArrayOf(opaquemcb, largevbn, largelbn, index))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlLookupLastLargeMcbEntry(mcb: Long, vbn: Long, lbn: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlLookupLastLargeMcbEntry", longArrayOf(mcb, vbn, lbn))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlLookupLastLargeMcbEntryAndIndex(opaquemcb: Long, largevbn: Long, largelbn: Long, index: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlLookupLastLargeMcbEntryAndIndex", longArrayOf(opaquemcb, largevbn, largelbn, index))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlLookupLastMcbEntry(mcb: Long, vbn: Long, lbn: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlLookupLastMcbEntry", longArrayOf(mcb, vbn, lbn))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlLookupMcbEntry(mcb: Long, vbn: UInt, lbn: Long, sectorcount: Long, index: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlLookupMcbEntry", longArrayOf(mcb, vbn.toLong(), lbn, sectorcount, index))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlLookupPerFileContext(perfilecontextpointer: Long, ownerid: Long, instanceid: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlLookupPerFileContext", longArrayOf(perfilecontextpointer, ownerid, instanceid))
}

public fun FsRtlLookupPerFileObjectContext(fileobject: Long, ownerid: Long, instanceid: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlLookupPerFileObjectContext", longArrayOf(fileobject, ownerid, instanceid))
}

public fun FsRtlLookupPerStreamContextInternal(streamcontext: Long, ownerid: Long, instanceid: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlLookupPerStreamContextInternal", longArrayOf(streamcontext, ownerid, instanceid))
}

public fun FsRtlMdlReadCompleteDev(fileobject: Long, mdlchain: Long, deviceobject: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlMdlReadCompleteDev", longArrayOf(fileobject, mdlchain, deviceobject))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlMdlReadDev(fileobject: Long, fileoffset: Long, length: UInt, lockkey: UInt, mdlchain: Long, iostatus: Long, deviceobject: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlMdlReadDev", longArrayOf(fileobject, fileoffset, length.toLong(), lockkey.toLong(), mdlchain, iostatus, deviceobject))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlMdlReadEx(fileobject: Long, fileoffset: Long, length: UInt, lockkey: UInt, mdlchain: Long, iostatus: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlMdlReadEx", longArrayOf(fileobject, fileoffset, length.toLong(), lockkey.toLong(), mdlchain, iostatus))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlMdlWriteCompleteDev(fileobject: Long, fileoffset: Long, mdlchain: Long, deviceobject: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlMdlWriteCompleteDev", longArrayOf(fileobject, fileoffset, mdlchain, deviceobject))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlMupGetProviderIdFromName(pprovidername: Long, pproviderid: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlMupGetProviderIdFromName", longArrayOf(pprovidername, pproviderid))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlMupGetProviderInfoFromFileObject(pfileobject: Long, level: UInt, pbuffer: Long, pbuffersize: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlMupGetProviderInfoFromFileObject", longArrayOf(pfileobject, level.toLong(), pbuffer, pbuffersize))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlNormalizeNtstatus(exception: Win32.Foundation.NTSTATUS, genericexception: Win32.Foundation.NTSTATUS): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlNormalizeNtstatus", longArrayOf(Win32DynamicFfi.objectSlot(exception), Win32DynamicFfi.objectSlot(genericexception)))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlNotifyCleanup(notifysync: Foundation.PNOTIFY_SYNC, notifylist: Long, fscontext: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlNotifyCleanup", longArrayOf(Win32DynamicFfi.objectSlot(notifysync), notifylist, fscontext))
}

public fun FsRtlNotifyCleanupAll(notifysync: Foundation.PNOTIFY_SYNC, notifylist: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlNotifyCleanupAll", longArrayOf(Win32DynamicFfi.objectSlot(notifysync), notifylist))
}

public fun FsRtlNotifyFilterChangeDirectory(notifysync: Foundation.PNOTIFY_SYNC, notifylist: Long, fscontext: Long, fulldirectoryname: Long, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifyirp: Long, traversecallback: PCHECK_FOR_TRAVERSE_ACCESS, subjectcontext: Long, filtercallback: PFILTER_REPORT_CHANGE) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlNotifyFilterChangeDirectory", longArrayOf(Win32DynamicFfi.objectSlot(notifysync), notifylist, fscontext, fulldirectoryname, if (watchtree) 1L else 0L, if (ignorebuffer) 1L else 0L, completionfilter.toLong(), notifyirp, Win32DynamicFfi.objectSlot(traversecallback), subjectcontext, Win32DynamicFfi.objectSlot(filtercallback)))
}

public fun FsRtlNotifyFilterReportChange(notifysync: Foundation.PNOTIFY_SYNC, notifylist: Long, fulltargetname: Long, targetnameoffset: UShort, streamname: Long, normalizedparentname: Long, filtermatch: UInt, action: UInt, targetcontext: Long, filtercontext: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlNotifyFilterReportChange", longArrayOf(Win32DynamicFfi.objectSlot(notifysync), notifylist, fulltargetname, targetnameoffset.toLong(), streamname, normalizedparentname, filtermatch.toLong(), action.toLong(), targetcontext, filtercontext))
}

public fun FsRtlNotifyFullChangeDirectory(notifysync: Foundation.PNOTIFY_SYNC, notifylist: Long, fscontext: Long, fulldirectoryname: Long, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifyirp: Long, traversecallback: PCHECK_FOR_TRAVERSE_ACCESS, subjectcontext: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlNotifyFullChangeDirectory", longArrayOf(Win32DynamicFfi.objectSlot(notifysync), notifylist, fscontext, fulldirectoryname, if (watchtree) 1L else 0L, if (ignorebuffer) 1L else 0L, completionfilter.toLong(), notifyirp, Win32DynamicFfi.objectSlot(traversecallback), subjectcontext))
}

public fun FsRtlNotifyFullReportChange(notifysync: Foundation.PNOTIFY_SYNC, notifylist: Long, fulltargetname: Long, targetnameoffset: UShort, streamname: Long, normalizedparentname: Long, filtermatch: UInt, action: UInt, targetcontext: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlNotifyFullReportChange", longArrayOf(Win32DynamicFfi.objectSlot(notifysync), notifylist, fulltargetname, targetnameoffset.toLong(), streamname, normalizedparentname, filtermatch.toLong(), action.toLong(), targetcontext))
}

public fun FsRtlNotifyInitializeSync(notifysync: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlNotifyInitializeSync", longArrayOf(notifysync))
}

public fun FsRtlNotifyUninitializeSync(notifysync: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlNotifyUninitializeSync", longArrayOf(notifysync))
}

public fun FsRtlNotifyVolumeEvent(fileobject: Long, eventcode: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlNotifyVolumeEvent", longArrayOf(fileobject, eventcode.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlNotifyVolumeEventEx(fileobject: Long, eventcode: UInt, event: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlNotifyVolumeEventEx", longArrayOf(fileobject, eventcode.toLong(), event))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlNumberOfRunsInBaseMcb(mcb: Long): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlNumberOfRunsInBaseMcb", longArrayOf(mcb)).toUInt()
}

public fun FsRtlNumberOfRunsInLargeMcb(mcb: Long): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlNumberOfRunsInLargeMcb", longArrayOf(mcb)).toUInt()
}

public fun FsRtlNumberOfRunsInMcb(mcb: Long): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlNumberOfRunsInMcb", longArrayOf(mcb)).toUInt()
}

public fun FsRtlOplockBreakH(oplock: Long, irp: Long, flags: UInt, context: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlOplockBreakH", longArrayOf(oplock, irp, flags.toLong(), context, Win32DynamicFfi.objectSlot(completionroutine), Win32DynamicFfi.objectSlot(postirproutine)))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlOplockBreakH2(oplock: Long, irp: Long, flags: UInt, context: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP, grantedaccess: Long, shareaccess: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlOplockBreakH2", longArrayOf(oplock, irp, flags.toLong(), context, Win32DynamicFfi.objectSlot(completionroutine), Win32DynamicFfi.objectSlot(postirproutine), grantedaccess, shareaccess))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlOplockBreakToNone(oplock: Long, irpsp: Long, irp: Long, context: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlOplockBreakToNone", longArrayOf(oplock, irpsp, irp, context, Win32DynamicFfi.objectSlot(completionroutine), Win32DynamicFfi.objectSlot(postirproutine)))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlOplockBreakToNoneEx(oplock: Long, irp: Long, flags: UInt, context: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlOplockBreakToNoneEx", longArrayOf(oplock, irp, flags.toLong(), context, Win32DynamicFfi.objectSlot(completionroutine), Win32DynamicFfi.objectSlot(postirproutine)))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlOplockFsctrl(oplock: Long, irp: Long, opencount: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlOplockFsctrl", longArrayOf(oplock, irp, opencount.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlOplockFsctrlEx(oplock: Long, irp: Long, opencount: UInt, flags: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlOplockFsctrlEx", longArrayOf(oplock, irp, opencount.toLong(), flags.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlOplockGetAnyBreakOwnerProcess(oplock: Long): Foundation.PEPROCESS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlOplockGetAnyBreakOwnerProcess", longArrayOf(oplock))
    return Foundation.PEPROCESS()
}

public fun FsRtlOplockIsFastIoPossible(oplock: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlOplockIsFastIoPossible", longArrayOf(oplock))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlOplockIsSharedRequest(irp: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlOplockIsSharedRequest", longArrayOf(irp))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlOplockKeysEqual(fo1: Long, fo2: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlOplockKeysEqual", longArrayOf(fo1, fo2))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlPostPagingFileStackOverflow(context: Long, event: Long, stackoverflowroutine: PFSRTL_STACK_OVERFLOW_ROUTINE) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlPostPagingFileStackOverflow", longArrayOf(context, event, Win32DynamicFfi.objectSlot(stackoverflowroutine)))
}

public fun FsRtlPostStackOverflow(context: Long, event: Long, stackoverflowroutine: PFSRTL_STACK_OVERFLOW_ROUTINE) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlPostStackOverflow", longArrayOf(context, event, Win32DynamicFfi.objectSlot(stackoverflowroutine)))
}

public fun FsRtlPrepareMdlWriteDev(fileobject: Long, fileoffset: Long, length: UInt, lockkey: UInt, mdlchain: Long, iostatus: Long, deviceobject: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlPrepareMdlWriteDev", longArrayOf(fileobject, fileoffset, length.toLong(), lockkey.toLong(), mdlchain, iostatus, deviceobject))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlPrepareMdlWriteEx(fileobject: Long, fileoffset: Long, length: UInt, lockkey: UInt, mdlchain: Long, iostatus: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlPrepareMdlWriteEx", longArrayOf(fileobject, fileoffset, length.toLong(), lockkey.toLong(), mdlchain, iostatus))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlPrepareToReuseEcp(ecpcontext: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlPrepareToReuseEcp", longArrayOf(ecpcontext))
}

public fun FsRtlPrivateLock(filelock: Long, fileobject: Long, fileoffset: Long, length: Long, processid: Foundation.PEPROCESS, key: UInt, failimmediately: Boolean, exclusivelock: Boolean, iosb: Long, irp: Long, context: Long, alreadysynchronized: Boolean): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlPrivateLock", longArrayOf(filelock, fileobject, fileoffset, length, Win32DynamicFfi.objectSlot(processid), key.toLong(), if (failimmediately) 1L else 0L, if (exclusivelock) 1L else 0L, iosb, irp, context, if (alreadysynchronized) 1L else 0L))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlProcessFileLock(filelock: Long, irp: Long, context: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlProcessFileLock", longArrayOf(filelock, irp, context))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlQueryCachedVdl(fileobject: Long, vdl: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlQueryCachedVdl", longArrayOf(fileobject, vdl))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlQueryInformationFile(fileobject: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, retfileinformationsize: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlQueryInformationFile", longArrayOf(fileobject, fileinformation, length.toLong(), fileinformationclass.toLong(), retfileinformationsize))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlQueryKernelEaFile(fileobject: Long, returnedeadata: Long, length: UInt, returnsingleentry: Boolean, ealist: Long, ealistlength: UInt, eaindex: Long, restartscan: Boolean, lengthreturned: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlQueryKernelEaFile", longArrayOf(fileobject, returnedeadata, length.toLong(), if (returnsingleentry) 1L else 0L, ealist, ealistlength.toLong(), eaindex, if (restartscan) 1L else 0L, lengthreturned))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlQueryMaximumVirtualDiskNestingLevel(): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlQueryMaximumVirtualDiskNestingLevel", longArrayOf()).toUInt()
}

public fun FsRtlRegisterFileSystemFilterCallbacks(filterdriverobject: Long, callbacks: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlRegisterFileSystemFilterCallbacks", longArrayOf(filterdriverobject, callbacks))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlRegisterUncProvider(muphandle: Long, redirectordevicename: Long, mailslotssupported: Boolean): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlRegisterUncProvider", longArrayOf(muphandle, redirectordevicename, if (mailslotssupported) 1L else 0L))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlRegisterUncProviderEx(muphandle: Long, redirdevname: Long, deviceobject: Long, flags: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlRegisterUncProviderEx", longArrayOf(muphandle, redirdevname, deviceobject, flags.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlRegisterUncProviderEx2(redirdevname: Long, deviceobject: Long, registration: Long, muphandle: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlRegisterUncProviderEx2", longArrayOf(redirdevname, deviceobject, registration, muphandle))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlReleaseFile(fileobject: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlReleaseFile", longArrayOf(fileobject))
}

public fun FsRtlRemoveBaseMcbEntry(mcb: Long, vbn: Long, sectorcount: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlRemoveBaseMcbEntry", longArrayOf(mcb, vbn, sectorcount))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlRemoveDotsFromPath(originalstring: PWSTR, pathlength: UShort, newlength: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlRemoveDotsFromPath", longArrayOf(originalstring, pathlength.toLong(), newlength))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlRemoveExtraCreateParameter(ecplist: Long, ecptype: Long, ecpcontext: Long, ecpcontextsize: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlRemoveExtraCreateParameter", longArrayOf(ecplist, ecptype, ecpcontext, ecpcontextsize))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlRemoveLargeMcbEntry(mcb: Long, vbn: Long, sectorcount: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlRemoveLargeMcbEntry", longArrayOf(mcb, vbn, sectorcount))
}

public fun FsRtlRemoveMcbEntry(mcb: Long, vbn: UInt, sectorcount: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlRemoveMcbEntry", longArrayOf(mcb, vbn.toLong(), sectorcount.toLong()))
}

public fun FsRtlRemovePerFileContext(perfilecontextpointer: Long, ownerid: Long, instanceid: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlRemovePerFileContext", longArrayOf(perfilecontextpointer, ownerid, instanceid))
}

public fun FsRtlRemovePerFileObjectContext(fileobject: Long, ownerid: Long, instanceid: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlRemovePerFileObjectContext", longArrayOf(fileobject, ownerid, instanceid))
}

public fun FsRtlRemovePerStreamContext(streamcontext: Long, ownerid: Long, instanceid: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlRemovePerStreamContext", longArrayOf(streamcontext, ownerid, instanceid))
}

public fun FsRtlResetBaseMcb(mcb: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlResetBaseMcb", longArrayOf(mcb))
}

public fun FsRtlResetLargeMcb(mcb: Long, selfsynchronized: Boolean) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlResetLargeMcb", longArrayOf(mcb, if (selfsynchronized) 1L else 0L))
}

public fun FsRtlSetDriverBacking(driverobj: Long, flags: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlSetDriverBacking", longArrayOf(driverobj, flags.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlSetEcpListIntoIrp(irp: Long, ecplist: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlSetEcpListIntoIrp", longArrayOf(irp, ecplist))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlSetKernelEaFile(fileobject: Long, eabuffer: Long, length: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlSetKernelEaFile", longArrayOf(fileobject, eabuffer, length.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlSplitBaseMcb(mcb: Long, vbn: Long, amount: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlSplitBaseMcb", longArrayOf(mcb, vbn, amount))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlSplitLargeMcb(mcb: Long, vbn: Long, amount: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlSplitLargeMcb", longArrayOf(mcb, vbn, amount))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlTeardownPerFileContexts(perfilecontextpointer: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlTeardownPerFileContexts", longArrayOf(perfilecontextpointer))
}

public fun FsRtlTeardownPerStreamContexts(advancedheader: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlTeardownPerStreamContexts", longArrayOf(advancedheader))
}

public fun FsRtlTruncateBaseMcb(mcb: Long, vbn: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlTruncateBaseMcb", longArrayOf(mcb, vbn))
}

public fun FsRtlTruncateLargeMcb(mcb: Long, vbn: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlTruncateLargeMcb", longArrayOf(mcb, vbn))
}

public fun FsRtlTruncateMcb(mcb: Long, vbn: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlTruncateMcb", longArrayOf(mcb, vbn.toLong()))
}

public fun FsRtlUninitializeBaseMcb(mcb: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlUninitializeBaseMcb", longArrayOf(mcb))
}

public fun FsRtlUninitializeFileLock(filelock: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlUninitializeFileLock", longArrayOf(filelock))
}

public fun FsRtlUninitializeLargeMcb(mcb: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlUninitializeLargeMcb", longArrayOf(mcb))
}

public fun FsRtlUninitializeMcb(mcb: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlUninitializeMcb", longArrayOf(mcb))
}

public fun FsRtlUninitializeOplock(oplock: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlUninitializeOplock", longArrayOf(oplock))
}

public fun FsRtlUpdateDiskCounters(bytesread: ULong, byteswritten: ULong) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlUpdateDiskCounters", longArrayOf(bytesread.toLong(), byteswritten.toLong()))
}

public fun FsRtlUpperOplockFsctrl(oplock: Long, irp: Long, opencount: UInt, loweroplockstate: UInt, flags: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlUpperOplockFsctrl", longArrayOf(oplock, irp, opencount.toLong(), loweroplockstate.toLong(), flags.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlValidateReparsePointBuffer(bufferlength: UInt, reparsebuffer: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlValidateReparsePointBuffer", longArrayOf(bufferlength.toLong(), reparsebuffer))
    return Win32.Foundation.NTSTATUS()
}

public fun FsRtlVolumeDeviceToCorrelationId(volumedeviceobject: Long, guid: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlVolumeDeviceToCorrelationId", longArrayOf(volumedeviceobject, guid))
    return Win32.Foundation.NTSTATUS()
}

public fun GetSecurityUserInfo(logonid: Long, flags: UInt, userinformation: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("secur32.dll", "GetSecurityUserInfo", longArrayOf(logonid, flags.toLong(), userinformation))
    return Win32.Foundation.NTSTATUS()
}

public fun IoAcquireVpbSpinLock(irql: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoAcquireVpbSpinLock", longArrayOf(irql))
}

public fun IoApplyPriorityInfoThread(inputpriorityinfo: Long, outputpriorityinfo: Long, thread: Foundation.PETHREAD): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoApplyPriorityInfoThread", longArrayOf(inputpriorityinfo, outputpriorityinfo, Win32DynamicFfi.objectSlot(thread)))
    return Win32.Foundation.NTSTATUS()
}

public fun IoCheckDesiredAccess(desiredaccess: Long, grantedaccess: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoCheckDesiredAccess", longArrayOf(desiredaccess, grantedaccess.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun IoCheckEaBufferValidity(eabuffer: Long, ealength: UInt, erroroffset: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoCheckEaBufferValidity", longArrayOf(eabuffer, ealength.toLong(), erroroffset))
    return Win32.Foundation.NTSTATUS()
}

public fun IoCheckFunctionAccess(grantedaccess: UInt, majorfunction: UByte, minorfunction: UByte, iocontrolcode: UInt, arg1: Long, arg2: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoCheckFunctionAccess", longArrayOf(grantedaccess.toLong(), majorfunction.toLong(), minorfunction.toLong(), iocontrolcode.toLong(), arg1, arg2))
    return Win32.Foundation.NTSTATUS()
}

public fun IoCheckQuerySetFileInformation(fileinformationclass: FILE_INFORMATION_CLASS, length: UInt, setoperation: Boolean): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoCheckQuerySetFileInformation", longArrayOf(fileinformationclass.toLong(), length.toLong(), if (setoperation) 1L else 0L))
    return Win32.Foundation.NTSTATUS()
}

public fun IoCheckQuerySetVolumeInformation(fsinformationclass: FS_INFORMATION_CLASS, length: UInt, setoperation: Boolean): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoCheckQuerySetVolumeInformation", longArrayOf(fsinformationclass.toLong(), length.toLong(), if (setoperation) 1L else 0L))
    return Win32.Foundation.NTSTATUS()
}

public fun IoCheckQuotaBufferValidity(quotabuffer: Long, quotalength: UInt, erroroffset: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoCheckQuotaBufferValidity", longArrayOf(quotabuffer, quotalength.toLong(), erroroffset))
    return Win32.Foundation.NTSTATUS()
}

public fun IoClearFsTrackOffsetState(irp: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoClearFsTrackOffsetState", longArrayOf(irp))
    return Win32.Foundation.NTSTATUS()
}

public fun IoCreateStreamFileObject(fileobject: Long, deviceobject: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoCreateStreamFileObject", longArrayOf(fileobject, deviceobject))
}

public fun IoCreateStreamFileObjectEx(fileobject: Long, deviceobject: Long, filehandle: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoCreateStreamFileObjectEx", longArrayOf(fileobject, deviceobject, filehandle))
}

public fun IoCreateStreamFileObjectEx2(createoptions: Long, fileobject: Long, deviceobject: Long, streamfileobject: Long, filehandle: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoCreateStreamFileObjectEx2", longArrayOf(createoptions, fileobject, deviceobject, streamfileobject, filehandle))
    return Win32.Foundation.NTSTATUS()
}

public fun IoCreateStreamFileObjectLite(fileobject: Long, deviceobject: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoCreateStreamFileObjectLite", longArrayOf(fileobject, deviceobject))
}

public fun IoEnumerateDeviceObjectList(driverobject: Long, deviceobjectlist: Long, deviceobjectlistsize: UInt, actualnumberdeviceobjects: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoEnumerateDeviceObjectList", longArrayOf(driverobject, deviceobjectlist, deviceobjectlistsize.toLong(), actualnumberdeviceobjects))
    return Win32.Foundation.NTSTATUS()
}

public fun IoEnumerateRegisteredFiltersList(driverobjectlist: Long, driverobjectlistsize: UInt, actualnumberdriverobjects: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoEnumerateRegisteredFiltersList", longArrayOf(driverobjectlist, driverobjectlistsize.toLong(), actualnumberdriverobjects))
    return Win32.Foundation.NTSTATUS()
}

public fun IoFastQueryNetworkAttributes(objectattributes: Long, desiredaccess: UInt, openoptions: UInt, iostatus: Long, buffer: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "IoFastQueryNetworkAttributes", longArrayOf(objectattributes, desiredaccess.toLong(), openoptions.toLong(), iostatus, buffer))
    return (rawRet and 0xFFL) != 0L
}

public fun IoGetAttachedDevice(deviceobject: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetAttachedDevice", longArrayOf(deviceobject))
}

public fun IoGetBaseFileSystemDeviceObject(fileobject: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetBaseFileSystemDeviceObject", longArrayOf(fileobject))
}

public fun IoGetDeviceAttachmentBaseRef(deviceobject: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetDeviceAttachmentBaseRef", longArrayOf(deviceobject))
}

public fun IoGetDeviceToVerify(thread: Foundation.PETHREAD): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetDeviceToVerify", longArrayOf(Win32DynamicFfi.objectSlot(thread)))
}

public fun IoGetDiskDeviceObject(filesystemdeviceobject: Long, diskdeviceobject: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetDiskDeviceObject", longArrayOf(filesystemdeviceobject, diskdeviceobject))
    return Win32.Foundation.NTSTATUS()
}

public fun IoGetFsTrackOffsetState(irp: Long, retfstrackoffsetblob: Long, rettrackedoffset: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetFsTrackOffsetState", longArrayOf(irp, retfstrackoffsetblob, rettrackedoffset))
    return Win32.Foundation.NTSTATUS()
}

public fun IoGetLowerDeviceObject(deviceobject: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetLowerDeviceObject", longArrayOf(deviceobject))
}

public fun IoGetOplockKeyContext(fileobject: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetOplockKeyContext", longArrayOf(fileobject))
}

public fun IoGetOplockKeyContextEx(fileobject: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetOplockKeyContextEx", longArrayOf(fileobject))
}

public fun IoGetRequestorProcess(irp: Long): Foundation.PEPROCESS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetRequestorProcess", longArrayOf(irp))
    return Foundation.PEPROCESS()
}

public fun IoGetRequestorProcessId(irp: Long): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetRequestorProcessId", longArrayOf(irp)).toUInt()
}

public fun IoGetRequestorSessionId(irp: Long, psessionid: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetRequestorSessionId", longArrayOf(irp, psessionid))
    return Win32.Foundation.NTSTATUS()
}

public fun IoIrpHasFsTrackOffsetExtensionType(irp: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "IoIrpHasFsTrackOffsetExtensionType", longArrayOf(irp))
    return (rawRet and 0xFFL) != 0L
}

public fun IoIsOperationSynchronous(irp: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "IoIsOperationSynchronous", longArrayOf(irp))
    return (rawRet and 0xFFL) != 0L
}

public fun IoIsSystemThread(thread: Foundation.PETHREAD): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "IoIsSystemThread", longArrayOf(Win32DynamicFfi.objectSlot(thread)))
    return (rawRet and 0xFFL) != 0L
}

public fun IoIsValidNameGraftingBuffer(irp: Long, reparsebuffer: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "IoIsValidNameGraftingBuffer", longArrayOf(irp, reparsebuffer))
    return (rawRet and 0xFFL) != 0L
}

public fun IoPageRead(fileobject: Long, memorydescriptorlist: Long, startingoffset: Long, event: Long, iostatusblock: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoPageRead", longArrayOf(fileobject, memorydescriptorlist, startingoffset, event, iostatusblock))
    return Win32.Foundation.NTSTATUS()
}

public fun IoQueryFileDosDeviceName(fileobject: Long, objectnameinformation: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoQueryFileDosDeviceName", longArrayOf(fileobject, objectnameinformation))
    return Win32.Foundation.NTSTATUS()
}

public fun IoQueryFileInformation(fileobject: Long, fileinformationclass: FILE_INFORMATION_CLASS, length: UInt, fileinformation: Long, returnedlength: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoQueryFileInformation", longArrayOf(fileobject, fileinformationclass.toLong(), length.toLong(), fileinformation, returnedlength))
    return Win32.Foundation.NTSTATUS()
}

public fun IoQueryVolumeInformation(fileobject: Long, fsinformationclass: FS_INFORMATION_CLASS, length: UInt, fsinformation: Long, returnedlength: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoQueryVolumeInformation", longArrayOf(fileobject, fsinformationclass.toLong(), length.toLong(), fsinformation, returnedlength))
    return Win32.Foundation.NTSTATUS()
}

public fun IoQueueThreadIrp(irp: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoQueueThreadIrp", longArrayOf(irp))
}

public fun IoRegisterFileSystem(deviceobject: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoRegisterFileSystem", longArrayOf(deviceobject))
}

public fun IoRegisterFsRegistrationChange(driverobject: Long, drivernotificationroutine: Foundation.DRIVER_FS_NOTIFICATION): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoRegisterFsRegistrationChange", longArrayOf(driverobject, Win32DynamicFfi.objectSlot(drivernotificationroutine)))
    return Win32.Foundation.NTSTATUS()
}

public fun IoRegisterFsRegistrationChangeMountAware(driverobject: Long, drivernotificationroutine: Foundation.DRIVER_FS_NOTIFICATION, synchronizewithmounts: Boolean): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoRegisterFsRegistrationChangeMountAware", longArrayOf(driverobject, Win32DynamicFfi.objectSlot(drivernotificationroutine), if (synchronizewithmounts) 1L else 0L))
    return Win32.Foundation.NTSTATUS()
}

public fun IoReleaseVpbSpinLock(irql: UByte) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoReleaseVpbSpinLock", longArrayOf(irql.toLong()))
}

public fun IoReplaceFileObjectName(fileobject: Long, newfilename: PCWSTR, filenamelength: UShort): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoReplaceFileObjectName", longArrayOf(fileobject, newfilename, filenamelength.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun IoRequestDeviceRemovalForReset(physicaldeviceobject: Long, flags: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoRequestDeviceRemovalForReset", longArrayOf(physicaldeviceobject, flags.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun IoRetrievePriorityInfo(irp: Long, fileobject: Long, thread: Foundation.PETHREAD, priorityinfo: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoRetrievePriorityInfo", longArrayOf(irp, fileobject, Win32DynamicFfi.objectSlot(thread), priorityinfo))
    return Win32.Foundation.NTSTATUS()
}

public fun IoSetDeviceToVerify(thread: Foundation.PETHREAD, deviceobject: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoSetDeviceToVerify", longArrayOf(Win32DynamicFfi.objectSlot(thread), deviceobject))
}

public fun IoSetFsTrackOffsetState(irp: Long, fstrackoffsetblob: Long, trackedoffset: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoSetFsTrackOffsetState", longArrayOf(irp, fstrackoffsetblob, trackedoffset))
    return Win32.Foundation.NTSTATUS()
}

public fun IoSetInformation(fileobject: Long, fileinformationclass: FILE_INFORMATION_CLASS, length: UInt, fileinformation: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoSetInformation", longArrayOf(fileobject, fileinformationclass.toLong(), length.toLong(), fileinformation))
    return Win32.Foundation.NTSTATUS()
}

public fun IoSynchronousPageWrite(fileobject: Long, memorydescriptorlist: Long, startingoffset: Long, event: Long, iostatusblock: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoSynchronousPageWrite", longArrayOf(fileobject, memorydescriptorlist, startingoffset, event, iostatusblock))
    return Win32.Foundation.NTSTATUS()
}

public fun IoThreadToProcess(thread: Foundation.PETHREAD): Foundation.PEPROCESS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoThreadToProcess", longArrayOf(Win32DynamicFfi.objectSlot(thread)))
    return Foundation.PEPROCESS()
}

public fun IoUnregisterFileSystem(deviceobject: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoUnregisterFileSystem", longArrayOf(deviceobject))
}

public fun IoUnregisterFsRegistrationChange(driverobject: Long, drivernotificationroutine: Foundation.DRIVER_FS_NOTIFICATION) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoUnregisterFsRegistrationChange", longArrayOf(driverobject, Win32DynamicFfi.objectSlot(drivernotificationroutine)))
}

public fun IoVerifyVolume(deviceobject: Long, allowrawmount: Boolean): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoVerifyVolume", longArrayOf(deviceobject, if (allowrawmount) 1L else 0L))
    return Win32.Foundation.NTSTATUS()
}

public fun KeAcquireQueuedSpinLock(number: Foundation.KSPIN_LOCK_QUEUE_NUMBER): UByte {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeAcquireQueuedSpinLock", longArrayOf(Win32DynamicFfi.objectSlot(number))).toUByte()
}

public fun KeAcquireSpinLockRaiseToSynch(spinlock: Long): UByte {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeAcquireSpinLockRaiseToSynch", longArrayOf(spinlock)).toUByte()
}

public fun KeAttachProcess(process: Foundation.PRKPROCESS) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeAttachProcess", longArrayOf(Win32DynamicFfi.objectSlot(process)))
}

public fun KeDetachProcess() {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeDetachProcess", longArrayOf())
}

public fun KeInitializeMutant(mutant: Long, initialowner: Boolean) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeInitializeMutant", longArrayOf(mutant, if (initialowner) 1L else 0L))
}

public fun KeInitializeQueue(queue: Long, count: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeInitializeQueue", longArrayOf(queue, count.toLong()))
}

public fun KeInsertHeadQueue(queue: Long, entry: Long): Int {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeInsertHeadQueue", longArrayOf(queue, entry)).toInt()
}

public fun KeInsertQueue(queue: Long, entry: Long): Int {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeInsertQueue", longArrayOf(queue, entry)).toInt()
}

public fun KeReadStateMutant(mutant: Long): Int {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeReadStateMutant", longArrayOf(mutant)).toInt()
}

public fun KeReadStateQueue(queue: Long): Int {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeReadStateQueue", longArrayOf(queue)).toInt()
}

public fun KeReleaseMutant(mutant: Long, increment: Int, abandoned: Boolean, wait: Boolean): Int {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeReleaseMutant", longArrayOf(mutant, increment.toLong(), if (abandoned) 1L else 0L, if (wait) 1L else 0L)).toInt()
}

public fun KeReleaseQueuedSpinLock(number: Foundation.KSPIN_LOCK_QUEUE_NUMBER, oldirql: UByte) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeReleaseQueuedSpinLock", longArrayOf(Win32DynamicFfi.objectSlot(number), oldirql.toLong()))
}

public fun KeRemoveQueue(queue: Long, waitmode: Byte, timeout: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeRemoveQueue", longArrayOf(queue, waitmode.toLong(), timeout))
}

public fun KeRemoveQueueEx(queue: Long, waitmode: Byte, alertable: Boolean, timeout: Long, entryarray: Long, count: UInt): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeRemoveQueueEx", longArrayOf(queue, waitmode.toLong(), if (alertable) 1L else 0L, timeout, entryarray, count.toLong())).toUInt()
}

public fun KeRundownQueue(queue: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeRundownQueue", longArrayOf(queue))
}

public fun KeSetIdealProcessorThread(thread: Foundation.PKTHREAD, processor: UByte): UByte {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeSetIdealProcessorThread", longArrayOf(Win32DynamicFfi.objectSlot(thread), processor.toLong())).toUByte()
}

public fun KeSetKernelStackSwapEnable(enable: Boolean): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "KeSetKernelStackSwapEnable", longArrayOf(if (enable) 1L else 0L))
    return (rawRet and 0xFFL) != 0L
}

public fun KeStackAttachProcess(process: Foundation.PRKPROCESS, apcstate: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeStackAttachProcess", longArrayOf(Win32DynamicFfi.objectSlot(process), apcstate))
}

public fun KeTryToAcquireQueuedSpinLock(number: Foundation.KSPIN_LOCK_QUEUE_NUMBER, oldirql: Long): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeTryToAcquireQueuedSpinLock", longArrayOf(Win32DynamicFfi.objectSlot(number), oldirql)).toUInt()
}

public fun KeUnstackDetachProcess(apcstate: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeUnstackDetachProcess", longArrayOf(apcstate))
}

public fun MakeSignature(phcontext: Long, fqop: UInt, pmessage: Long, messageseqno: UInt): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "MakeSignature", longArrayOf(phcontext, fqop.toLong(), pmessage, messageseqno.toLong())).toInt()
}

public fun MapSecurityError(secstatus: HRESULT): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ksecdd.sys", "MapSecurityError", longArrayOf(secstatus.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun MmCanFileBeTruncated(sectionpointer: Long, newfilesize: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "MmCanFileBeTruncated", longArrayOf(sectionpointer, newfilesize))
    return (rawRet and 0xFFL) != 0L
}

public fun MmDoesFileHaveUserWritableReferences(sectionpointer: Long): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmDoesFileHaveUserWritableReferences", longArrayOf(sectionpointer)).toUInt()
}

public fun MmFlushImageSection(sectionobjectpointer: Long, flushtype: MMFLUSH_TYPE): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "MmFlushImageSection", longArrayOf(sectionobjectpointer, flushtype.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun MmForceSectionClosed(sectionobjectpointer: Long, delayclose: Boolean): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "MmForceSectionClosed", longArrayOf(sectionobjectpointer, if (delayclose) 1L else 0L))
    return (rawRet and 0xFFL) != 0L
}

public fun MmForceSectionClosedEx(sectionobjectpointer: Long, forcecloseflags: UInt): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "MmForceSectionClosedEx", longArrayOf(sectionobjectpointer, forcecloseflags.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun MmGetMaximumFileSectionSize(): ULong {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmGetMaximumFileSectionSize", longArrayOf()).toULong()
}

public fun MmIsFileSectionActive(fssectionpointer: Long, flags: UInt, sectionisactive: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "MmIsFileSectionActive", longArrayOf(fssectionpointer, flags.toLong(), sectionisactive))
    return Win32.Foundation.NTSTATUS()
}

public fun MmIsRecursiveIoFault(): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "MmIsRecursiveIoFault", longArrayOf())
    return (rawRet and 0xFFL) != 0L
}

public fun MmMdlPagesAreZero(mdl: Long): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmMdlPagesAreZero", longArrayOf(mdl)).toUInt()
}

public fun MmPrefetchPages(numberoflists: UInt, readlists: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "MmPrefetchPages", longArrayOf(numberoflists.toLong(), readlists))
    return Win32.Foundation.NTSTATUS()
}

public fun MmSetAddressRangeModified(address: Long, length: ULong): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "MmSetAddressRangeModified", longArrayOf(address, length.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun NtAccessCheckAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Win32.Security.PSECURITY_DESCRIPTOR, desiredaccess: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtAccessCheckAndAuditAlarm", longArrayOf(subsystemname, handleid, objecttypename, objectname, Win32DynamicFfi.objectSlot(securitydescriptor), desiredaccess.toLong(), genericmapping, if (objectcreation) 1L else 0L, grantedaccess, accessstatus, generateonclose))
    return Win32.Foundation.NTSTATUS()
}

public fun NtAccessCheckByTypeAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Win32.Security.PSECURITY_DESCRIPTOR, principalselfsid: Win32.Security.PSID, desiredaccess: UInt, audittype: Win32.Security.AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtAccessCheckByTypeAndAuditAlarm", longArrayOf(subsystemname, handleid, objecttypename, objectname, Win32DynamicFfi.objectSlot(securitydescriptor), Win32DynamicFfi.objectSlot(principalselfsid), desiredaccess.toLong(), Win32DynamicFfi.objectSlot(audittype), flags.toLong(), objecttypelist, objecttypelistlength.toLong(), genericmapping, if (objectcreation) 1L else 0L, grantedaccess, accessstatus, generateonclose))
    return Win32.Foundation.NTSTATUS()
}

public fun NtAccessCheckByTypeResultListAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Win32.Security.PSECURITY_DESCRIPTOR, principalselfsid: Win32.Security.PSID, desiredaccess: UInt, audittype: Win32.Security.AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtAccessCheckByTypeResultListAndAuditAlarm", longArrayOf(subsystemname, handleid, objecttypename, objectname, Win32DynamicFfi.objectSlot(securitydescriptor), Win32DynamicFfi.objectSlot(principalselfsid), desiredaccess.toLong(), Win32DynamicFfi.objectSlot(audittype), flags.toLong(), objecttypelist, objecttypelistlength.toLong(), genericmapping, if (objectcreation) 1L else 0L, grantedaccess, accessstatus, generateonclose))
    return Win32.Foundation.NTSTATUS()
}

public fun NtAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname: Long, handleid: Long, clienttoken: Win32.Foundation.HANDLE, objecttypename: Long, objectname: Long, securitydescriptor: Win32.Security.PSECURITY_DESCRIPTOR, principalselfsid: Win32.Security.PSID, desiredaccess: UInt, audittype: Win32.Security.AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtAccessCheckByTypeResultListAndAuditAlarmByHandle", longArrayOf(subsystemname, handleid, Win32DynamicFfi.objectSlot(clienttoken), objecttypename, objectname, Win32DynamicFfi.objectSlot(securitydescriptor), Win32DynamicFfi.objectSlot(principalselfsid), desiredaccess.toLong(), Win32DynamicFfi.objectSlot(audittype), flags.toLong(), objecttypelist, objecttypelistlength.toLong(), genericmapping, if (objectcreation) 1L else 0L, grantedaccess, accessstatus, generateonclose))
    return Win32.Foundation.NTSTATUS()
}

public fun NtAdjustGroupsToken(tokenhandle: Win32.Foundation.HANDLE, resettodefault: Boolean, newstate: Long, bufferlength: UInt, previousstate: Long, returnlength: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtAdjustGroupsToken", longArrayOf(Win32DynamicFfi.objectSlot(tokenhandle), if (resettodefault) 1L else 0L, newstate, bufferlength.toLong(), previousstate, returnlength))
    return Win32.Foundation.NTSTATUS()
}

public fun NtAdjustPrivilegesToken(tokenhandle: Win32.Foundation.HANDLE, disableallprivileges: Boolean, newstate: Long, bufferlength: UInt, previousstate: Long, returnlength: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtAdjustPrivilegesToken", longArrayOf(Win32DynamicFfi.objectSlot(tokenhandle), if (disableallprivileges) 1L else 0L, newstate, bufferlength.toLong(), previousstate, returnlength))
    return Win32.Foundation.NTSTATUS()
}

public fun NtAllocateVirtualMemory(processhandle: Win32.Foundation.HANDLE, baseaddress: Long, zerobits: ULong, regionsize: Long, allocationtype: UInt, protect: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtAllocateVirtualMemory", longArrayOf(Win32DynamicFfi.objectSlot(processhandle), baseaddress, zerobits.toLong(), regionsize, allocationtype.toLong(), protect.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun NtAllocateVirtualMemoryEx(processhandle: Win32.Foundation.HANDLE, baseaddress: Long, regionsize: Long, allocationtype: UInt, pageprotection: UInt, extendedparameters: Long, extendedparametercount: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtAllocateVirtualMemoryEx", longArrayOf(Win32DynamicFfi.objectSlot(processhandle), baseaddress, regionsize, allocationtype.toLong(), pageprotection.toLong(), extendedparameters, extendedparametercount.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun NtCancelIoFileEx(filehandle: Win32.Foundation.HANDLE, iorequesttocancel: Long, iostatusblock: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtCancelIoFileEx", longArrayOf(Win32DynamicFfi.objectSlot(filehandle), iorequesttocancel, iostatusblock))
    return Win32.Foundation.NTSTATUS()
}

public fun NtCloseObjectAuditAlarm(subsystemname: Long, handleid: Long, generateonclose: Boolean): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtCloseObjectAuditAlarm", longArrayOf(subsystemname, handleid, if (generateonclose) 1L else 0L))
    return Win32.Foundation.NTSTATUS()
}

public fun NtCreateDirectoryObject(directoryhandle: Long, desiredaccess: UInt, objectattributes: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtCreateDirectoryObject", longArrayOf(directoryhandle, desiredaccess.toLong(), objectattributes))
    return Win32.Foundation.NTSTATUS()
}

public fun NtCreateEvent(eventhandle: Long, desiredaccess: UInt, objectattributes: Long, eventtype: Win32.System.Kernel.EVENT_TYPE, initialstate: Boolean): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtCreateEvent", longArrayOf(eventhandle, desiredaccess.toLong(), objectattributes, Win32DynamicFfi.objectSlot(eventtype), if (initialstate) 1L else 0L))
    return Win32.Foundation.NTSTATUS()
}

public fun NtCreateFile(filehandle: Long, desiredaccess: Win32.Storage.FileSystem.FILE_ACCESS_RIGHTS, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: Win32.Storage.FileSystem.FILE_FLAGS_AND_ATTRIBUTES, shareaccess: Win32.Storage.FileSystem.FILE_SHARE_MODE, createdisposition: NTCREATEFILE_CREATE_DISPOSITION, createoptions: NTCREATEFILE_CREATE_OPTIONS, eabuffer: Long, ealength: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtCreateFile", longArrayOf(filehandle, Win32DynamicFfi.objectSlot(desiredaccess), objectattributes, iostatusblock, allocationsize, Win32DynamicFfi.objectSlot(fileattributes), Win32DynamicFfi.objectSlot(shareaccess), createdisposition.toLong(), createoptions.toLong(), eabuffer, ealength.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun NtCreateSection(sectionhandle: Long, desiredaccess: UInt, objectattributes: Long, maximumsize: Long, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Win32.Foundation.HANDLE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtCreateSection", longArrayOf(sectionhandle, desiredaccess.toLong(), objectattributes, maximumsize, sectionpageprotection.toLong(), allocationattributes.toLong(), Win32DynamicFfi.objectSlot(filehandle)))
    return Win32.Foundation.NTSTATUS()
}

public fun NtCreateSectionEx(sectionhandle: Long, desiredaccess: UInt, objectattributes: Long, maximumsize: Long, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Win32.Foundation.HANDLE, extendedparameters: Long, extendedparametercount: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtCreateSectionEx", longArrayOf(sectionhandle, desiredaccess.toLong(), objectattributes, maximumsize, sectionpageprotection.toLong(), allocationattributes.toLong(), Win32DynamicFfi.objectSlot(filehandle), extendedparameters, extendedparametercount.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun NtDeleteFile(objectattributes: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtDeleteFile", longArrayOf(objectattributes))
    return Win32.Foundation.NTSTATUS()
}

public fun NtDeleteObjectAuditAlarm(subsystemname: Long, handleid: Long, generateonclose: Boolean): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtDeleteObjectAuditAlarm", longArrayOf(subsystemname, handleid, if (generateonclose) 1L else 0L))
    return Win32.Foundation.NTSTATUS()
}

public fun NtDuplicateObject(sourceprocesshandle: Win32.Foundation.HANDLE, sourcehandle: Win32.Foundation.HANDLE, targetprocesshandle: Win32.Foundation.HANDLE, targethandle: Long, desiredaccess: UInt, handleattributes: UInt, options: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtDuplicateObject", longArrayOf(Win32DynamicFfi.objectSlot(sourceprocesshandle), Win32DynamicFfi.objectSlot(sourcehandle), Win32DynamicFfi.objectSlot(targetprocesshandle), targethandle, desiredaccess.toLong(), handleattributes.toLong(), options.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun NtDuplicateToken(existingtokenhandle: Win32.Foundation.HANDLE, desiredaccess: UInt, objectattributes: Long, effectiveonly: Boolean, tokentype: Win32.Security.TOKEN_TYPE, newtokenhandle: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtDuplicateToken", longArrayOf(Win32DynamicFfi.objectSlot(existingtokenhandle), desiredaccess.toLong(), objectattributes, if (effectiveonly) 1L else 0L, Win32DynamicFfi.objectSlot(tokentype), newtokenhandle))
    return Win32.Foundation.NTSTATUS()
}

public fun NtFilterToken(existingtokenhandle: Win32.Foundation.HANDLE, flags: UInt, sidstodisable: Long, privilegestodelete: Long, restrictedsids: Long, newtokenhandle: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtFilterToken", longArrayOf(Win32DynamicFfi.objectSlot(existingtokenhandle), flags.toLong(), sidstodisable, privilegestodelete, restrictedsids, newtokenhandle))
    return Win32.Foundation.NTSTATUS()
}

public fun NtFlushBuffersFile(filehandle: Win32.Foundation.HANDLE, iostatusblock: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtFlushBuffersFile", longArrayOf(Win32DynamicFfi.objectSlot(filehandle), iostatusblock))
    return Win32.Foundation.NTSTATUS()
}

public fun NtFlushBuffersFileEx(filehandle: Win32.Foundation.HANDLE, flags: UInt, parameters: Long, parameterssize: UInt, iostatusblock: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtFlushBuffersFileEx", longArrayOf(Win32DynamicFfi.objectSlot(filehandle), flags.toLong(), parameters, parameterssize.toLong(), iostatusblock))
    return Win32.Foundation.NTSTATUS()
}

public fun NtFlushVirtualMemory(processhandle: Win32.Foundation.HANDLE, baseaddress: Long, regionsize: Long, iostatus: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtFlushVirtualMemory", longArrayOf(Win32DynamicFfi.objectSlot(processhandle), baseaddress, regionsize, iostatus))
    return Win32.Foundation.NTSTATUS()
}

public fun NtFreeVirtualMemory(processhandle: Win32.Foundation.HANDLE, baseaddress: Long, regionsize: Long, freetype: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtFreeVirtualMemory", longArrayOf(Win32DynamicFfi.objectSlot(processhandle), baseaddress, regionsize, freetype.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun NtFsControlFile(filehandle: Win32.Foundation.HANDLE, event: Win32.Foundation.HANDLE, apcroutine: Win32.System.IO.PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, fscontrolcode: UInt, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtFsControlFile", longArrayOf(Win32DynamicFfi.objectSlot(filehandle), Win32DynamicFfi.objectSlot(event), Win32DynamicFfi.objectSlot(apcroutine), apccontext, iostatusblock, fscontrolcode.toLong(), inputbuffer, inputbufferlength.toLong(), outputbuffer, outputbufferlength.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun NtImpersonateAnonymousToken(threadhandle: Win32.Foundation.HANDLE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtImpersonateAnonymousToken", longArrayOf(Win32DynamicFfi.objectSlot(threadhandle)))
    return Win32.Foundation.NTSTATUS()
}

public fun NtLockFile(filehandle: Win32.Foundation.HANDLE, event: Win32.Foundation.HANDLE, apcroutine: Win32.System.IO.PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, byteoffset: Long, length: Long, key: UInt, failimmediately: Boolean, exclusivelock: Boolean): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtLockFile", longArrayOf(Win32DynamicFfi.objectSlot(filehandle), Win32DynamicFfi.objectSlot(event), Win32DynamicFfi.objectSlot(apcroutine), apccontext, iostatusblock, byteoffset, length, key.toLong(), if (failimmediately) 1L else 0L, if (exclusivelock) 1L else 0L))
    return Win32.Foundation.NTSTATUS()
}

public fun NtNotifyChangeKey(keyhandle: Win32.Foundation.HANDLE, event: Win32.Foundation.HANDLE, apcroutine: Win32.System.IO.PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, completionfilter: UInt, watchtree: Boolean, buffer: Long, buffersize: UInt, asynchronous: Boolean): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtNotifyChangeKey", longArrayOf(Win32DynamicFfi.objectSlot(keyhandle), Win32DynamicFfi.objectSlot(event), Win32DynamicFfi.objectSlot(apcroutine), apccontext, iostatusblock, completionfilter.toLong(), if (watchtree) 1L else 0L, buffer, buffersize.toLong(), if (asynchronous) 1L else 0L))
    return Win32.Foundation.NTSTATUS()
}

public fun NtOpenDirectoryObject(directoryhandle: Long, desiredaccess: UInt, objectattributes: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtOpenDirectoryObject", longArrayOf(directoryhandle, desiredaccess.toLong(), objectattributes))
    return Win32.Foundation.NTSTATUS()
}

public fun NtOpenFile(filehandle: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, shareaccess: UInt, openoptions: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtOpenFile", longArrayOf(filehandle, desiredaccess.toLong(), objectattributes, iostatusblock, shareaccess.toLong(), openoptions.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun NtOpenObjectAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: Win32.Security.PSECURITY_DESCRIPTOR, clienttoken: Win32.Foundation.HANDLE, desiredaccess: UInt, grantedaccess: UInt, privileges: Long, objectcreation: Boolean, accessgranted: Boolean, generateonclose: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtOpenObjectAuditAlarm", longArrayOf(subsystemname, handleid, objecttypename, objectname, Win32DynamicFfi.objectSlot(securitydescriptor), Win32DynamicFfi.objectSlot(clienttoken), desiredaccess.toLong(), grantedaccess.toLong(), privileges, if (objectcreation) 1L else 0L, if (accessgranted) 1L else 0L, generateonclose))
    return Win32.Foundation.NTSTATUS()
}

public fun NtOpenProcessToken(processhandle: Win32.Foundation.HANDLE, desiredaccess: UInt, tokenhandle: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtOpenProcessToken", longArrayOf(Win32DynamicFfi.objectSlot(processhandle), desiredaccess.toLong(), tokenhandle))
    return Win32.Foundation.NTSTATUS()
}

public fun NtOpenProcessTokenEx(processhandle: Win32.Foundation.HANDLE, desiredaccess: UInt, handleattributes: UInt, tokenhandle: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtOpenProcessTokenEx", longArrayOf(Win32DynamicFfi.objectSlot(processhandle), desiredaccess.toLong(), handleattributes.toLong(), tokenhandle))
    return Win32.Foundation.NTSTATUS()
}

public fun NtOpenSymbolicLinkObject(linkhandle: Long, desiredaccess: UInt, objectattributes: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtOpenSymbolicLinkObject", longArrayOf(linkhandle, desiredaccess.toLong(), objectattributes))
    return Win32.Foundation.NTSTATUS()
}

public fun NtOpenThreadToken(threadhandle: Win32.Foundation.HANDLE, desiredaccess: UInt, openasself: Boolean, tokenhandle: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtOpenThreadToken", longArrayOf(Win32DynamicFfi.objectSlot(threadhandle), desiredaccess.toLong(), if (openasself) 1L else 0L, tokenhandle))
    return Win32.Foundation.NTSTATUS()
}

public fun NtOpenThreadTokenEx(threadhandle: Win32.Foundation.HANDLE, desiredaccess: UInt, openasself: Boolean, handleattributes: UInt, tokenhandle: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtOpenThreadTokenEx", longArrayOf(Win32DynamicFfi.objectSlot(threadhandle), desiredaccess.toLong(), if (openasself) 1L else 0L, handleattributes.toLong(), tokenhandle))
    return Win32.Foundation.NTSTATUS()
}

public fun NtPrivilegeCheck(clienttoken: Win32.Foundation.HANDLE, requiredprivileges: Long, result: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtPrivilegeCheck", longArrayOf(Win32DynamicFfi.objectSlot(clienttoken), requiredprivileges, result))
    return Win32.Foundation.NTSTATUS()
}

public fun NtPrivilegeObjectAuditAlarm(subsystemname: Long, handleid: Long, clienttoken: Win32.Foundation.HANDLE, desiredaccess: UInt, privileges: Long, accessgranted: Boolean): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtPrivilegeObjectAuditAlarm", longArrayOf(subsystemname, handleid, Win32DynamicFfi.objectSlot(clienttoken), desiredaccess.toLong(), privileges, if (accessgranted) 1L else 0L))
    return Win32.Foundation.NTSTATUS()
}

public fun NtPrivilegedServiceAuditAlarm(subsystemname: Long, servicename: Long, clienttoken: Win32.Foundation.HANDLE, privileges: Long, accessgranted: Boolean): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtPrivilegedServiceAuditAlarm", longArrayOf(subsystemname, servicename, Win32DynamicFfi.objectSlot(clienttoken), privileges, if (accessgranted) 1L else 0L))
    return Win32.Foundation.NTSTATUS()
}

public fun NtQueryDirectoryFile(filehandle: Win32.Foundation.HANDLE, event: Win32.Foundation.HANDLE, apcroutine: Win32.System.IO.PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, returnsingleentry: Boolean, filename: Long, restartscan: Boolean): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtQueryDirectoryFile", longArrayOf(Win32DynamicFfi.objectSlot(filehandle), Win32DynamicFfi.objectSlot(event), Win32DynamicFfi.objectSlot(apcroutine), apccontext, iostatusblock, fileinformation, length.toLong(), fileinformationclass.toLong(), if (returnsingleentry) 1L else 0L, filename, if (restartscan) 1L else 0L))
    return Win32.Foundation.NTSTATUS()
}

public fun NtQueryDirectoryFileEx(filehandle: Win32.Foundation.HANDLE, event: Win32.Foundation.HANDLE, apcroutine: Win32.System.IO.PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, queryflags: UInt, filename: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtQueryDirectoryFileEx", longArrayOf(Win32DynamicFfi.objectSlot(filehandle), Win32DynamicFfi.objectSlot(event), Win32DynamicFfi.objectSlot(apcroutine), apccontext, iostatusblock, fileinformation, length.toLong(), fileinformationclass.toLong(), queryflags.toLong(), filename))
    return Win32.Foundation.NTSTATUS()
}

public fun NtQueryDirectoryObject(directoryhandle: Win32.Foundation.HANDLE, buffer: Long, length: UInt, returnsingleentry: Boolean, restartscan: Boolean, context: Long, returnlength: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtQueryDirectoryObject", longArrayOf(Win32DynamicFfi.objectSlot(directoryhandle), buffer, length.toLong(), if (returnsingleentry) 1L else 0L, if (restartscan) 1L else 0L, context, returnlength))
    return Win32.Foundation.NTSTATUS()
}

public fun NtQueryEaFile(filehandle: Win32.Foundation.HANDLE, iostatusblock: Long, buffer: Long, length: UInt, returnsingleentry: Boolean, ealist: Long, ealistlength: UInt, eaindex: Long, restartscan: Boolean): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtQueryEaFile", longArrayOf(Win32DynamicFfi.objectSlot(filehandle), iostatusblock, buffer, length.toLong(), if (returnsingleentry) 1L else 0L, ealist, ealistlength.toLong(), eaindex, if (restartscan) 1L else 0L))
    return Win32.Foundation.NTSTATUS()
}

public fun NtQueryFullAttributesFile(objectattributes: Long, fileinformation: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtQueryFullAttributesFile", longArrayOf(objectattributes, fileinformation))
    return Win32.Foundation.NTSTATUS()
}

public fun NtQueryInformationByName(objectattributes: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtQueryInformationByName", longArrayOf(objectattributes, iostatusblock, fileinformation, length.toLong(), fileinformationclass.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun NtQueryInformationFile(filehandle: Win32.Foundation.HANDLE, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtQueryInformationFile", longArrayOf(Win32DynamicFfi.objectSlot(filehandle), iostatusblock, fileinformation, length.toLong(), fileinformationclass.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun NtQueryInformationToken(tokenhandle: Win32.Foundation.HANDLE, tokeninformationclass: Win32.Security.TOKEN_INFORMATION_CLASS, tokeninformation: Long, tokeninformationlength: UInt, returnlength: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtQueryInformationToken", longArrayOf(Win32DynamicFfi.objectSlot(tokenhandle), Win32DynamicFfi.objectSlot(tokeninformationclass), tokeninformation, tokeninformationlength.toLong(), returnlength))
    return Win32.Foundation.NTSTATUS()
}

public fun NtQueryQuotaInformationFile(filehandle: Win32.Foundation.HANDLE, iostatusblock: Long, buffer: Long, length: UInt, returnsingleentry: Boolean, sidlist: Long, sidlistlength: UInt, startsid: Win32.Security.PSID, restartscan: Boolean): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtQueryQuotaInformationFile", longArrayOf(Win32DynamicFfi.objectSlot(filehandle), iostatusblock, buffer, length.toLong(), if (returnsingleentry) 1L else 0L, sidlist, sidlistlength.toLong(), Win32DynamicFfi.objectSlot(startsid), if (restartscan) 1L else 0L))
    return Win32.Foundation.NTSTATUS()
}

public fun NtQuerySecurityObject(handle: Win32.Foundation.HANDLE, securityinformation: UInt, securitydescriptor: Win32.Security.PSECURITY_DESCRIPTOR, length: UInt, lengthneeded: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtQuerySecurityObject", longArrayOf(Win32DynamicFfi.objectSlot(handle), securityinformation.toLong(), Win32DynamicFfi.objectSlot(securitydescriptor), length.toLong(), lengthneeded))
    return Win32.Foundation.NTSTATUS()
}

public fun NtQuerySymbolicLinkObject(linkhandle: Win32.Foundation.HANDLE, linktarget: Long, returnedlength: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtQuerySymbolicLinkObject", longArrayOf(Win32DynamicFfi.objectSlot(linkhandle), linktarget, returnedlength))
    return Win32.Foundation.NTSTATUS()
}

public fun NtQueryVirtualMemory(processhandle: Win32.Foundation.HANDLE, baseaddress: Long, memoryinformationclass: MEMORY_INFORMATION_CLASS, memoryinformation: Long, memoryinformationlength: ULong, returnlength: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtQueryVirtualMemory", longArrayOf(Win32DynamicFfi.objectSlot(processhandle), baseaddress, memoryinformationclass.toLong(), memoryinformation, memoryinformationlength.toLong(), returnlength))
    return Win32.Foundation.NTSTATUS()
}

public fun NtQueryVolumeInformationFile(filehandle: Win32.Foundation.HANDLE, iostatusblock: Long, fsinformation: Long, length: UInt, fsinformationclass: FS_INFORMATION_CLASS): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtQueryVolumeInformationFile", longArrayOf(Win32DynamicFfi.objectSlot(filehandle), iostatusblock, fsinformation, length.toLong(), fsinformationclass.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun NtReadFile(filehandle: Win32.Foundation.HANDLE, event: Win32.Foundation.HANDLE, apcroutine: Win32.System.IO.PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, buffer: Long, length: UInt, byteoffset: Long, key: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtReadFile", longArrayOf(Win32DynamicFfi.objectSlot(filehandle), Win32DynamicFfi.objectSlot(event), Win32DynamicFfi.objectSlot(apcroutine), apccontext, iostatusblock, buffer, length.toLong(), byteoffset, key))
    return Win32.Foundation.NTSTATUS()
}

public fun NtSetEaFile(filehandle: Win32.Foundation.HANDLE, iostatusblock: Long, buffer: Long, length: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtSetEaFile", longArrayOf(Win32DynamicFfi.objectSlot(filehandle), iostatusblock, buffer, length.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun NtSetEvent(eventhandle: Win32.Foundation.HANDLE, previousstate: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtSetEvent", longArrayOf(Win32DynamicFfi.objectSlot(eventhandle), previousstate))
    return Win32.Foundation.NTSTATUS()
}

public fun NtSetInformationFile(filehandle: Win32.Foundation.HANDLE, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtSetInformationFile", longArrayOf(Win32DynamicFfi.objectSlot(filehandle), iostatusblock, fileinformation, length.toLong(), fileinformationclass.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun NtSetInformationToken(tokenhandle: Win32.Foundation.HANDLE, tokeninformationclass: Win32.Security.TOKEN_INFORMATION_CLASS, tokeninformation: Long, tokeninformationlength: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtSetInformationToken", longArrayOf(Win32DynamicFfi.objectSlot(tokenhandle), Win32DynamicFfi.objectSlot(tokeninformationclass), tokeninformation, tokeninformationlength.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun NtSetInformationVirtualMemory(processhandle: Win32.Foundation.HANDLE, vminformationclass: VIRTUAL_MEMORY_INFORMATION_CLASS, numberofentries: ULong, virtualaddresses: Long, vminformation: Long, vminformationlength: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtSetInformationVirtualMemory", longArrayOf(Win32DynamicFfi.objectSlot(processhandle), vminformationclass.toLong(), numberofentries.toLong(), virtualaddresses, vminformation, vminformationlength.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun NtSetQuotaInformationFile(filehandle: Win32.Foundation.HANDLE, iostatusblock: Long, buffer: Long, length: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtSetQuotaInformationFile", longArrayOf(Win32DynamicFfi.objectSlot(filehandle), iostatusblock, buffer, length.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun NtSetSecurityObject(handle: Win32.Foundation.HANDLE, securityinformation: UInt, securitydescriptor: Win32.Security.PSECURITY_DESCRIPTOR): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtSetSecurityObject", longArrayOf(Win32DynamicFfi.objectSlot(handle), securityinformation.toLong(), Win32DynamicFfi.objectSlot(securitydescriptor)))
    return Win32.Foundation.NTSTATUS()
}

public fun NtSetVolumeInformationFile(filehandle: Win32.Foundation.HANDLE, iostatusblock: Long, fsinformation: Long, length: UInt, fsinformationclass: FS_INFORMATION_CLASS): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtSetVolumeInformationFile", longArrayOf(Win32DynamicFfi.objectSlot(filehandle), iostatusblock, fsinformation, length.toLong(), fsinformationclass.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun NtUnlockFile(filehandle: Win32.Foundation.HANDLE, iostatusblock: Long, byteoffset: Long, length: Long, key: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtUnlockFile", longArrayOf(Win32DynamicFfi.objectSlot(filehandle), iostatusblock, byteoffset, length, key.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun NtWriteFile(filehandle: Win32.Foundation.HANDLE, event: Win32.Foundation.HANDLE, apcroutine: Win32.System.IO.PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, buffer: Long, length: UInt, byteoffset: Long, key: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtWriteFile", longArrayOf(Win32DynamicFfi.objectSlot(filehandle), Win32DynamicFfi.objectSlot(event), Win32DynamicFfi.objectSlot(apcroutine), apccontext, iostatusblock, buffer, length.toLong(), byteoffset, key))
    return Win32.Foundation.NTSTATUS()
}

public fun ObInsertObject(obj: Long, passedaccessstate: Long, desiredaccess: UInt, objectpointerbias: UInt, newobject: Long, handle: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ObInsertObject", longArrayOf(obj, passedaccessstate, desiredaccess.toLong(), objectpointerbias.toLong(), newobject, handle))
    return Win32.Foundation.NTSTATUS()
}

public fun ObIsKernelHandle(handle: Win32.Foundation.HANDLE): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "ObIsKernelHandle", longArrayOf(Win32DynamicFfi.objectSlot(handle)))
    return (rawRet and 0xFFL) != 0L
}

public fun ObMakeTemporaryObject(obj: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ObMakeTemporaryObject", longArrayOf(obj))
}

public fun ObOpenObjectByPointer(obj: Long, handleattributes: UInt, passedaccessstate: Long, desiredaccess: UInt, objecttype: Foundation.POBJECT_TYPE, accessmode: Byte, handle: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ObOpenObjectByPointer", longArrayOf(obj, handleattributes.toLong(), passedaccessstate, desiredaccess.toLong(), Win32DynamicFfi.objectSlot(objecttype), accessmode.toLong(), handle))
    return Win32.Foundation.NTSTATUS()
}

public fun ObOpenObjectByPointerWithTag(obj: Long, handleattributes: UInt, passedaccessstate: Long, desiredaccess: UInt, objecttype: Foundation.POBJECT_TYPE, accessmode: Byte, tag: UInt, handle: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ObOpenObjectByPointerWithTag", longArrayOf(obj, handleattributes.toLong(), passedaccessstate, desiredaccess.toLong(), Win32DynamicFfi.objectSlot(objecttype), accessmode.toLong(), tag.toLong(), handle))
    return Win32.Foundation.NTSTATUS()
}

public fun ObQueryNameString(obj: Long, objectnameinfo: Long, length: UInt, returnlength: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ObQueryNameString", longArrayOf(obj, objectnameinfo, length.toLong(), returnlength))
    return Win32.Foundation.NTSTATUS()
}

public fun ObQueryObjectAuditingByHandle(handle: Win32.Foundation.HANDLE, generateonclose: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ObQueryObjectAuditingByHandle", longArrayOf(Win32DynamicFfi.objectSlot(handle), generateonclose))
    return Win32.Foundation.NTSTATUS()
}

public fun PfxFindPrefix(prefixtable: Long, fullname: Long): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "PfxFindPrefix", longArrayOf(prefixtable, fullname))
}

public fun PfxInitialize(prefixtable: Long) {
    Win32DynamicFfi.invoke("ntdll.dll", "PfxInitialize", longArrayOf(prefixtable))
}

public fun PfxInsertPrefix(prefixtable: Long, prefix: Long, prefixtableentry: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "PfxInsertPrefix", longArrayOf(prefixtable, prefix, prefixtableentry))
    return (rawRet and 0xFFL) != 0L
}

public fun PfxRemovePrefix(prefixtable: Long, prefixtableentry: Long) {
    Win32DynamicFfi.invoke("ntdll.dll", "PfxRemovePrefix", longArrayOf(prefixtable, prefixtableentry))
}

public fun PoQueueShutdownWorkItem(workitem: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PoQueueShutdownWorkItem", longArrayOf(workitem))
    return Win32.Foundation.NTSTATUS()
}

public fun PsAssignImpersonationToken(thread: Foundation.PETHREAD, token: Win32.Foundation.HANDLE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PsAssignImpersonationToken", longArrayOf(Win32DynamicFfi.objectSlot(thread), Win32DynamicFfi.objectSlot(token)))
    return Win32.Foundation.NTSTATUS()
}

public fun PsChargePoolQuota(process: Foundation.PEPROCESS, pooltype: Foundation.POOL_TYPE, amount: ULong) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PsChargePoolQuota", longArrayOf(Win32DynamicFfi.objectSlot(process), Win32DynamicFfi.objectSlot(pooltype), amount.toLong()))
}

public fun PsChargeProcessPoolQuota(process: Foundation.PEPROCESS, pooltype: Foundation.POOL_TYPE, amount: ULong): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PsChargeProcessPoolQuota", longArrayOf(Win32DynamicFfi.objectSlot(process), Win32DynamicFfi.objectSlot(pooltype), amount.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun PsDereferenceImpersonationToken(impersonationtoken: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PsDereferenceImpersonationToken", longArrayOf(impersonationtoken))
}

public fun PsDereferencePrimaryToken(primarytoken: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PsDereferencePrimaryToken", longArrayOf(primarytoken))
}

public fun PsDisableImpersonation(thread: Foundation.PETHREAD, impersonationstate: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "PsDisableImpersonation", longArrayOf(Win32DynamicFfi.objectSlot(thread), impersonationstate))
    return (rawRet and 0xFFL) != 0L
}

public fun PsGetProcessExitTime(): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsGetProcessExitTime", longArrayOf())
}

public fun PsGetThreadProcess(thread: Foundation.PETHREAD): Foundation.PEPROCESS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PsGetThreadProcess", longArrayOf(Win32DynamicFfi.objectSlot(thread)))
    return Foundation.PEPROCESS()
}

public fun PsImpersonateClient(thread: Foundation.PETHREAD, token: Long, copyonopen: Boolean, effectiveonly: Boolean, impersonationlevel: Win32.Security.SECURITY_IMPERSONATION_LEVEL): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PsImpersonateClient", longArrayOf(Win32DynamicFfi.objectSlot(thread), token, if (copyonopen) 1L else 0L, if (effectiveonly) 1L else 0L, Win32DynamicFfi.objectSlot(impersonationlevel)))
    return Win32.Foundation.NTSTATUS()
}

public fun PsIsDiskCountersEnabled(): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "PsIsDiskCountersEnabled", longArrayOf())
    return (rawRet and 0xFFL) != 0L
}

public fun PsIsSystemThread(thread: Foundation.PETHREAD): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "PsIsSystemThread", longArrayOf(Win32DynamicFfi.objectSlot(thread)))
    return (rawRet and 0xFFL) != 0L
}

public fun PsIsThreadTerminating(thread: Foundation.PETHREAD): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "PsIsThreadTerminating", longArrayOf(Win32DynamicFfi.objectSlot(thread)))
    return (rawRet and 0xFFL) != 0L
}

public fun PsLookupProcessByProcessId(processid: Win32.Foundation.HANDLE, process: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PsLookupProcessByProcessId", longArrayOf(Win32DynamicFfi.objectSlot(processid), process))
    return Win32.Foundation.NTSTATUS()
}

public fun PsLookupThreadByThreadId(threadid: Win32.Foundation.HANDLE, thread: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PsLookupThreadByThreadId", longArrayOf(Win32DynamicFfi.objectSlot(threadid), thread))
    return Win32.Foundation.NTSTATUS()
}

public fun PsReferenceImpersonationToken(thread: Foundation.PETHREAD, copyonopen: Long, effectiveonly: Long, impersonationlevel: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsReferenceImpersonationToken", longArrayOf(Win32DynamicFfi.objectSlot(thread), copyonopen, effectiveonly, impersonationlevel))
}

public fun PsReferencePrimaryToken(process: Foundation.PEPROCESS): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsReferencePrimaryToken", longArrayOf(Win32DynamicFfi.objectSlot(process)))
}

public fun PsRestoreImpersonation(thread: Foundation.PETHREAD, impersonationstate: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PsRestoreImpersonation", longArrayOf(Win32DynamicFfi.objectSlot(thread), impersonationstate))
}

public fun PsReturnPoolQuota(process: Foundation.PEPROCESS, pooltype: Foundation.POOL_TYPE, amount: ULong) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PsReturnPoolQuota", longArrayOf(Win32DynamicFfi.objectSlot(process), Win32DynamicFfi.objectSlot(pooltype), amount.toLong()))
}

public fun PsRevertToSelf() {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PsRevertToSelf", longArrayOf())
}

public fun PsUpdateDiskCounters(process: Foundation.PEPROCESS, bytesread: ULong, byteswritten: ULong, readoperationcount: UInt, writeoperationcount: UInt, flushoperationcount: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PsUpdateDiskCounters", longArrayOf(Win32DynamicFfi.objectSlot(process), bytesread.toLong(), byteswritten.toLong(), readoperationcount.toLong(), writeoperationcount.toLong(), flushoperationcount.toLong()))
}

public fun QuerySecurityContextToken(phcontext: Long, token: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "QuerySecurityContextToken", longArrayOf(phcontext, token)).toInt()
}

public fun RtlAbsoluteToSelfRelativeSD(absolutesecuritydescriptor: Win32.Security.PSECURITY_DESCRIPTOR, selfrelativesecuritydescriptor: Win32.Security.PSECURITY_DESCRIPTOR, bufferlength: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlAbsoluteToSelfRelativeSD", longArrayOf(Win32DynamicFfi.objectSlot(absolutesecuritydescriptor), Win32DynamicFfi.objectSlot(selfrelativesecuritydescriptor), bufferlength))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlAddAccessAllowedAce(acl: Long, acerevision: UInt, accessmask: UInt, sid: Win32.Security.PSID): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlAddAccessAllowedAce", longArrayOf(acl, acerevision.toLong(), accessmask.toLong(), Win32DynamicFfi.objectSlot(sid)))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlAddAccessAllowedAceEx(acl: Long, acerevision: UInt, aceflags: UInt, accessmask: UInt, sid: Win32.Security.PSID): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlAddAccessAllowedAceEx", longArrayOf(acl, acerevision.toLong(), aceflags.toLong(), accessmask.toLong(), Win32DynamicFfi.objectSlot(sid)))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlAddAce(acl: Long, acerevision: UInt, startingaceindex: UInt, acelist: Long, acelistlength: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlAddAce", longArrayOf(acl, acerevision.toLong(), startingaceindex.toLong(), acelist, acelistlength.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlAllocateAndInitializeSid(identifierauthority: Long, subauthoritycount: UByte, subauthority0: UInt, subauthority1: UInt, subauthority2: UInt, subauthority3: UInt, subauthority4: UInt, subauthority5: UInt, subauthority6: UInt, subauthority7: UInt, sid: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlAllocateAndInitializeSid", longArrayOf(identifierauthority, subauthoritycount.toLong(), subauthority0.toLong(), subauthority1.toLong(), subauthority2.toLong(), subauthority3.toLong(), subauthority4.toLong(), subauthority5.toLong(), subauthority6.toLong(), subauthority7.toLong(), sid))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlAllocateAndInitializeSidEx(identifierauthority: Long, subauthoritycount: UByte, subauthorities: Long, sid: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlAllocateAndInitializeSidEx", longArrayOf(identifierauthority, subauthoritycount.toLong(), subauthorities, sid))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlAllocateHeap(heaphandle: Long, flags: UInt, size: ULong): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlAllocateHeap", longArrayOf(heaphandle, flags.toLong(), size.toLong()))
}

public fun RtlAppendStringToString(destination: Long, source: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlAppendStringToString", longArrayOf(destination, source))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlCompareAltitudes(altitude1: Long, altitude2: Long): Int {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlCompareAltitudes", longArrayOf(altitude1, altitude2)).toInt()
}

public fun RtlCompareMemoryUlong(source: Long, length: ULong, pattern: UInt): ULong {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlCompareMemoryUlong", longArrayOf(source, length.toLong(), pattern.toLong())).toULong()
}

public fun RtlCompressBuffer(compressionformatandengine: UShort, uncompressedbuffer: Long, uncompressedbuffersize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, uncompressedchunksize: UInt, finalcompressedsize: Long, workspace: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlCompressBuffer", longArrayOf(compressionformatandengine.toLong(), uncompressedbuffer, uncompressedbuffersize.toLong(), compressedbuffer, compressedbuffersize.toLong(), uncompressedchunksize.toLong(), finalcompressedsize, workspace))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlCompressChunks(uncompressedbuffer: Long, uncompressedbuffersize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, compresseddatainfo: Long, compresseddatainfolength: UInt, workspace: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "RtlCompressChunks", longArrayOf(uncompressedbuffer, uncompressedbuffersize.toLong(), compressedbuffer, compressedbuffersize.toLong(), compresseddatainfo, compresseddatainfolength.toLong(), workspace))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlCopyLuid(destinationluid: Long, sourceluid: Long) {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlCopyLuid", longArrayOf(destinationluid, sourceluid))
}

public fun RtlCopySid(destinationsidlength: UInt, destinationsid: Win32.Security.PSID, sourcesid: Win32.Security.PSID): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlCopySid", longArrayOf(destinationsidlength.toLong(), Win32DynamicFfi.objectSlot(destinationsid), Win32DynamicFfi.objectSlot(sourcesid)))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlCreateAcl(acl: Long, acllength: UInt, aclrevision: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlCreateAcl", longArrayOf(acl, acllength.toLong(), aclrevision.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlCreateHeap(flags: UInt, heapbase: Long, reservesize: ULong, commitsize: ULong, lock: Long, parameters: Long): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlCreateHeap", longArrayOf(flags.toLong(), heapbase, reservesize.toLong(), commitsize.toLong(), lock, parameters))
}

public fun RtlCreateServiceSid(servicename: Long, servicesid: Win32.Security.PSID, servicesidlength: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlCreateServiceSid", longArrayOf(servicename, Win32DynamicFfi.objectSlot(servicesid), servicesidlength))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlCreateSystemVolumeInformationFolder(volumerootpath: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlCreateSystemVolumeInformationFolder", longArrayOf(volumerootpath))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlCreateUnicodeString(destinationstring: Long, sourcestring: PCWSTR): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlCreateUnicodeString", longArrayOf(destinationstring, sourcestring))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlCreateVirtualAccountSid(name: Long, basesubauthority: UInt, sid: Win32.Security.PSID, sidlength: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlCreateVirtualAccountSid", longArrayOf(name, basesubauthority.toLong(), Win32DynamicFfi.objectSlot(sid), sidlength))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlCustomCPToUnicodeN(customcp: Long, unicodestring: PWSTR, maxbytesinunicodestring: UInt, bytesinunicodestring: Long, customcpstring: PCSTR, bytesincustomcpstring: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlCustomCPToUnicodeN", longArrayOf(customcp, unicodestring, maxbytesinunicodestring.toLong(), bytesinunicodestring, customcpstring, bytesincustomcpstring.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlDecompressBuffer(compressionformat: UShort, uncompressedbuffer: Long, uncompressedbuffersize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, finaluncompressedsize: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlDecompressBuffer", longArrayOf(compressionformat.toLong(), uncompressedbuffer, uncompressedbuffersize.toLong(), compressedbuffer, compressedbuffersize.toLong(), finaluncompressedsize))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlDecompressBufferEx(compressionformat: UShort, uncompressedbuffer: Long, uncompressedbuffersize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, finaluncompressedsize: Long, workspace: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlDecompressBufferEx", longArrayOf(compressionformat.toLong(), uncompressedbuffer, uncompressedbuffersize.toLong(), compressedbuffer, compressedbuffersize.toLong(), finaluncompressedsize, workspace))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlDecompressBufferEx2(compressionformat: UShort, uncompressedbuffer: Long, uncompressedbuffersize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, uncompressedchunksize: UInt, finaluncompressedsize: Long, workspace: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "RtlDecompressBufferEx2", longArrayOf(compressionformat.toLong(), uncompressedbuffer, uncompressedbuffersize.toLong(), compressedbuffer, compressedbuffersize.toLong(), uncompressedchunksize.toLong(), finaluncompressedsize, workspace))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlDecompressChunks(uncompressedbuffer: Long, uncompressedbuffersize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, compressedtail: Long, compressedtailsize: UInt, compresseddatainfo: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "RtlDecompressChunks", longArrayOf(uncompressedbuffer, uncompressedbuffersize.toLong(), compressedbuffer, compressedbuffersize.toLong(), compressedtail, compressedtailsize.toLong(), compresseddatainfo))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlDecompressFragment(compressionformat: UShort, uncompressedfragment: Long, uncompressedfragmentsize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, fragmentoffset: UInt, finaluncompressedsize: Long, workspace: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlDecompressFragment", longArrayOf(compressionformat.toLong(), uncompressedfragment, uncompressedfragmentsize.toLong(), compressedbuffer, compressedbuffersize.toLong(), fragmentoffset.toLong(), finaluncompressedsize, workspace))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlDecompressFragmentEx(compressionformat: UShort, uncompressedfragment: Long, uncompressedfragmentsize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, fragmentoffset: UInt, uncompressedchunksize: UInt, finaluncompressedsize: Long, workspace: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "RtlDecompressFragmentEx", longArrayOf(compressionformat.toLong(), uncompressedfragment, uncompressedfragmentsize.toLong(), compressedbuffer, compressedbuffersize.toLong(), fragmentoffset.toLong(), uncompressedchunksize.toLong(), finaluncompressedsize, workspace))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlDeleteAce(acl: Long, aceindex: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlDeleteAce", longArrayOf(acl, aceindex.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlDescribeChunk(compressionformat: UShort, compressedbuffer: Long, endofcompressedbufferplus1: Long, chunkbuffer: Long, chunksize: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "RtlDescribeChunk", longArrayOf(compressionformat.toLong(), compressedbuffer, endofcompressedbufferplus1, chunkbuffer, chunksize))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlDestroyHeap(heaphandle: Long): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlDestroyHeap", longArrayOf(heaphandle))
}

public fun RtlDosPathNameToNtPathName_U_WithStatus(dosfilename: PCWSTR, ntfilename: Long, filepart: Long, reserved: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlDosPathNameToNtPathName_U_WithStatus", longArrayOf(dosfilename, ntfilename, filepart, reserved))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlDowncaseUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlDowncaseUnicodeString", longArrayOf(destinationstring, sourcestring, if (allocatedestinationstring) 1L else 0L))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlDuplicateUnicodeString(flags: UInt, stringin: Long, stringout: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlDuplicateUnicodeString", longArrayOf(flags.toLong(), stringin, stringout))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlEqualPrefixSid(sid1: Win32.Security.PSID, sid2: Win32.Security.PSID): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlEqualPrefixSid", longArrayOf(Win32DynamicFfi.objectSlot(sid1), Win32DynamicFfi.objectSlot(sid2)))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlEqualSid(sid1: Win32.Security.PSID, sid2: Win32.Security.PSID): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlEqualSid", longArrayOf(Win32DynamicFfi.objectSlot(sid1), Win32DynamicFfi.objectSlot(sid2)))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlFindUnicodePrefix(prefixtable: Long, fullname: Long, caseinsensitiveindex: UInt): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "RtlFindUnicodePrefix", longArrayOf(prefixtable, fullname, caseinsensitiveindex.toLong()))
}

public fun RtlFreeHeap(heaphandle: Long, flags: UInt, baseaddress: Long): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlFreeHeap", longArrayOf(heaphandle, flags.toLong(), baseaddress)).toUInt()
}

public fun RtlFreeSid(sid: Win32.Security.PSID): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlFreeSid", longArrayOf(Win32DynamicFfi.objectSlot(sid)))
}

public fun RtlGenerate8dot3Name(name: Long, allowextendedcharacters: Boolean, context: Long, name8dot3: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlGenerate8dot3Name", longArrayOf(name, if (allowextendedcharacters) 1L else 0L, context, name8dot3))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlGetAce(acl: Long, aceindex: UInt, ace: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlGetAce", longArrayOf(acl, aceindex.toLong(), ace))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlGetCompressionWorkSpaceSize(compressionformatandengine: UShort, compressbufferworkspacesize: Long, compressfragmentworkspacesize: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlGetCompressionWorkSpaceSize", longArrayOf(compressionformatandengine.toLong(), compressbufferworkspacesize, compressfragmentworkspacesize))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlGetDaclSecurityDescriptor(securitydescriptor: Win32.Security.PSECURITY_DESCRIPTOR, daclpresent: Long, dacl: Long, dacldefaulted: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlGetDaclSecurityDescriptor", longArrayOf(Win32DynamicFfi.objectSlot(securitydescriptor), daclpresent, dacl, dacldefaulted))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlGetGroupSecurityDescriptor(securitydescriptor: Win32.Security.PSECURITY_DESCRIPTOR, group: Long, groupdefaulted: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlGetGroupSecurityDescriptor", longArrayOf(Win32DynamicFfi.objectSlot(securitydescriptor), group, groupdefaulted))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlGetOwnerSecurityDescriptor(securitydescriptor: Win32.Security.PSECURITY_DESCRIPTOR, owner: Long, ownerdefaulted: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlGetOwnerSecurityDescriptor", longArrayOf(Win32DynamicFfi.objectSlot(securitydescriptor), owner, ownerdefaulted))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlGetSaclSecurityDescriptor(securitydescriptor: Win32.Security.PSECURITY_DESCRIPTOR, saclpresent: Long, sacl: Long, sacldefaulted: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlGetSaclSecurityDescriptor", longArrayOf(Win32DynamicFfi.objectSlot(securitydescriptor), saclpresent, sacl, sacldefaulted))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlIdentifierAuthoritySid(sid: Win32.Security.PSID): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlIdentifierAuthoritySid", longArrayOf(Win32DynamicFfi.objectSlot(sid)))
}

public fun RtlIdnToAscii(flags: UInt, sourcestring: PCWSTR, sourcestringlength: Int, destinationstring: PWSTR, destinationstringlength: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlIdnToAscii", longArrayOf(flags.toLong(), sourcestring, sourcestringlength.toLong(), destinationstring, destinationstringlength))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlIdnToNameprepUnicode(flags: UInt, sourcestring: PCWSTR, sourcestringlength: Int, destinationstring: PWSTR, destinationstringlength: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlIdnToNameprepUnicode", longArrayOf(flags.toLong(), sourcestring, sourcestringlength.toLong(), destinationstring, destinationstringlength))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlIdnToUnicode(flags: UInt, sourcestring: PCWSTR, sourcestringlength: Int, destinationstring: PWSTR, destinationstringlength: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlIdnToUnicode", longArrayOf(flags.toLong(), sourcestring, sourcestringlength.toLong(), destinationstring, destinationstringlength))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlInitCodePageTable(tablebase: Long, codepagetable: Long) {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlInitCodePageTable", longArrayOf(tablebase, codepagetable))
}

public fun RtlInitUnicodeStringEx(destinationstring: Long, sourcestring: PCWSTR): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlInitUnicodeStringEx", longArrayOf(destinationstring, sourcestring))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlInitializeSid(sid: Win32.Security.PSID, identifierauthority: Long, subauthoritycount: UByte): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlInitializeSid", longArrayOf(Win32DynamicFfi.objectSlot(sid), identifierauthority, subauthoritycount.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlInitializeSidEx(sid: Win32.Security.PSID, identifierauthority: Long, subauthoritycount: UByte, vararg variadicArgs: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlInitializeSidEx", longArrayOf(Win32DynamicFfi.objectSlot(sid), identifierauthority, subauthoritycount.toLong()) + variadicArgs)
    return Win32.Foundation.NTSTATUS()
}

public fun RtlInitializeUnicodePrefix(prefixtable: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "RtlInitializeUnicodePrefix", longArrayOf(prefixtable))
}

public fun RtlInsertUnicodePrefix(prefixtable: Long, prefix: Long, prefixtableentry: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "RtlInsertUnicodePrefix", longArrayOf(prefixtable, prefix, prefixtableentry))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlIsCloudFilesPlaceholder(fileattributes: UInt, reparsetag: UInt): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlIsCloudFilesPlaceholder", longArrayOf(fileattributes.toLong(), reparsetag.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlIsDosDeviceName_U(dosfilename: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlIsDosDeviceName_U", longArrayOf(dosfilename)).toUInt()
}

public fun RtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag: UInt): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlIsNonEmptyDirectoryReparsePointAllowed", longArrayOf(reparsetag.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlIsNormalizedString(normform: UInt, sourcestring: PCWSTR, sourcestringlength: Int, normalized: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlIsNormalizedString", longArrayOf(normform.toLong(), sourcestring, sourcestringlength.toLong(), normalized))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlIsPartialPlaceholder(fileattributes: UInt, reparsetag: UInt): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlIsPartialPlaceholder", longArrayOf(fileattributes.toLong(), reparsetag.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlIsPartialPlaceholderFileHandle(filehandle: Win32.Foundation.HANDLE, ispartialplaceholder: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlIsPartialPlaceholderFileHandle", longArrayOf(Win32DynamicFfi.objectSlot(filehandle), ispartialplaceholder))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlIsPartialPlaceholderFileInfo(infobuffer: Long, infoclass: FILE_INFORMATION_CLASS, ispartialplaceholder: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlIsPartialPlaceholderFileInfo", longArrayOf(infobuffer, infoclass.toLong(), ispartialplaceholder))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlIsSandboxedToken(context: Long, previousmode: Byte): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "RtlIsSandboxedToken", longArrayOf(context, previousmode.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlIsValidOemCharacter(char: PWSTR): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "RtlIsValidOemCharacter", longArrayOf(char))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlLengthRequiredSid(subauthoritycount: UInt): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlLengthRequiredSid", longArrayOf(subauthoritycount.toLong())).toUInt()
}

public fun RtlLengthSid(sid: Win32.Security.PSID): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlLengthSid", longArrayOf(Win32DynamicFfi.objectSlot(sid))).toUInt()
}

public fun RtlMultiByteToUnicodeN(unicodestring: PWSTR, maxbytesinunicodestring: UInt, bytesinunicodestring: Long, multibytestring: PCSTR, bytesinmultibytestring: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlMultiByteToUnicodeN", longArrayOf(unicodestring, maxbytesinunicodestring.toLong(), bytesinunicodestring, multibytestring, bytesinmultibytestring.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlMultiByteToUnicodeSize(bytesinunicodestring: Long, multibytestring: PCSTR, bytesinmultibytestring: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlMultiByteToUnicodeSize", longArrayOf(bytesinunicodestring, multibytestring, bytesinmultibytestring.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlNextUnicodePrefix(prefixtable: Long, restart: Boolean): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "RtlNextUnicodePrefix", longArrayOf(prefixtable, if (restart) 1L else 0L))
}

public fun RtlNormalizeString(normform: UInt, sourcestring: PCWSTR, sourcestringlength: Int, destinationstring: PWSTR, destinationstringlength: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlNormalizeString", longArrayOf(normform.toLong(), sourcestring, sourcestringlength.toLong(), destinationstring, destinationstringlength))
    return Win32.Foundation.NTSTATUS()
}
