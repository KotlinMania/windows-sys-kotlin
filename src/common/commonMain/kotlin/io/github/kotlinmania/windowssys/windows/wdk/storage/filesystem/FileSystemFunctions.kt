package io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem

import io.github.kotlinmania.windowssys.Win32DynamicFfi
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

public fun interface FnCallback {
    public operator fun invoke(context1: Long, context2: Long)
}

public fun interface FnCallback1 {
    public operator fun invoke(fileobject: Long, fileoffset: Long, length: UInt, oldestlsn: Long, newestlsn: Long, context1: Long, context2: Long)
}

public fun interface FnCallback2 {
    public operator fun invoke(context: Long, irp: Long): NTSTATUS
}

public fun interface FnCallback3 {
    public operator fun invoke(notifyparams: Long): NTSTATUS
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

public fun CcAsyncCopyRead(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, buffer: Long, iostatus: Long, ioissuerthread: PETHREAD, asyncreadcontext: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "CcAsyncCopyRead", longArrayOf(fileobject, fileoffset, length.toLong(), if (wait) 1L else 0L, buffer, iostatus, ioissuerthread, asyncreadcontext))
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

public fun CcCopyReadEx(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, buffer: Long, iostatus: Long, ioissuerthread: PETHREAD): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "CcCopyReadEx", longArrayOf(fileobject, fileoffset, length.toLong(), if (wait) 1L else 0L, buffer, iostatus, ioissuerthread))
    return (rawRet and 0xFFL) != 0L
}

public fun CcCopyWrite(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, buffer: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "CcCopyWrite", longArrayOf(fileobject, fileoffset, length.toLong(), if (wait) 1L else 0L, buffer))
    return (rawRet and 0xFFL) != 0L
}

public fun CcCopyWriteEx(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, buffer: Long, ioissuerthread: PETHREAD): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "CcCopyWriteEx", longArrayOf(fileobject, fileoffset, length.toLong(), if (wait) 1L else 0L, buffer, ioissuerthread))
    return (rawRet and 0xFFL) != 0L
}

public fun CcCopyWriteWontFlush(fileobject: Long, fileoffset: Long, length: UInt): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "CcCopyWriteWontFlush", longArrayOf(fileobject, fileoffset, length.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun CcDeferWrite(fileobject: Long, postroutine: PCC_POST_DEFERRED_WRITE, context1: Long, context2: Long, bytestowrite: UInt, retrying: Boolean) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "CcDeferWrite", longArrayOf(fileobject, Win32DynamicFfi.objectSlot(postroutine), context1, context2, bytestowrite.toLong(), if (retrying) 1L else 0L))
}

public fun CcErrorCallbackRoutine(context: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "CcErrorCallbackRoutine", longArrayOf(context)).toInt()
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

public fun CcIsCacheManagerCallbackNeeded(status: NTSTATUS): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "CcIsCacheManagerCallbackNeeded", longArrayOf(status.toLong()))
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

public fun CcScheduleReadAheadEx(fileobject: Long, fileoffset: Long, length: UInt, ioissuerthread: PETHREAD) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "CcScheduleReadAheadEx", longArrayOf(fileobject, fileoffset, length.toLong(), ioissuerthread))
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

public fun CcSetFileSizesEx(fileobject: Long, filesizes: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "CcSetFileSizesEx", longArrayOf(fileobject, filesizes)).toInt()
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

public fun CcWaitForCurrentLazyWriterActivity(): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "CcWaitForCurrentLazyWriterActivity", longArrayOf()).toInt()
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

public fun FsRtlAddBaseMcbEntryEx(mcb: Long, vbn: Long, lbn: Long, sectorcount: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlAddBaseMcbEntryEx", longArrayOf(mcb, vbn, lbn, sectorcount)).toInt()
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

public fun FsRtlAllocateAePushLock(pooltype: POOL_TYPE, tag: UInt): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlAllocateAePushLock", longArrayOf(pooltype.toLong(), tag.toLong()))
}

public fun FsRtlAllocateExtraCreateParameter(ecptype: Long, sizeofcontext: UInt, flags: UInt, cleanupcallback: PFSRTL_EXTRA_CREATE_PARAMETER_CLEANUP_CALLBACK, pooltag: UInt, ecpcontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlAllocateExtraCreateParameter", longArrayOf(ecptype, sizeofcontext.toLong(), flags.toLong(), Win32DynamicFfi.objectSlot(cleanupcallback), pooltag.toLong(), ecpcontext)).toInt()
}

public fun FsRtlAllocateExtraCreateParameterFromLookasideList(ecptype: Long, sizeofcontext: UInt, flags: UInt, cleanupcallback: PFSRTL_EXTRA_CREATE_PARAMETER_CLEANUP_CALLBACK, lookasidelist: Long, ecpcontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlAllocateExtraCreateParameterFromLookasideList", longArrayOf(ecptype, sizeofcontext.toLong(), flags.toLong(), Win32DynamicFfi.objectSlot(cleanupcallback), lookasidelist, ecpcontext)).toInt()
}

public fun FsRtlAllocateExtraCreateParameterList(flags: UInt, ecplist: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlAllocateExtraCreateParameterList", longArrayOf(flags.toLong(), ecplist)).toInt()
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

public fun FsRtlBalanceReads(targetdevice: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlBalanceReads", longArrayOf(targetdevice)).toInt()
}

public fun FsRtlCancellableWaitForMultipleObjects(count: UInt, objectarray: Long, waittype: WAIT_TYPE, timeout: Long, waitblockarray: Long, irp: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlCancellableWaitForMultipleObjects", longArrayOf(count.toLong(), objectarray, waittype.toLong(), timeout, waitblockarray, irp)).toInt()
}

public fun FsRtlCancellableWaitForSingleObject(obj: Long, timeout: Long, irp: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlCancellableWaitForSingleObject", longArrayOf(obj, timeout, irp)).toInt()
}

public fun FsRtlChangeBackingFileObject(currentfileobject: Long, newfileobject: Long, changebackingtype: FSRTL_CHANGE_BACKING_TYPE, flags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlChangeBackingFileObject", longArrayOf(currentfileobject, newfileobject, changebackingtype.toLong(), flags.toLong())).toInt()
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

public fun FsRtlCheckOplock(oplock: Long, irp: Long, context: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlCheckOplock", longArrayOf(oplock, irp, context, Win32DynamicFfi.objectSlot(completionroutine), Win32DynamicFfi.objectSlot(postirproutine))).toInt()
}

public fun FsRtlCheckOplockEx(oplock: Long, irp: Long, flags: UInt, context: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlCheckOplockEx", longArrayOf(oplock, irp, flags.toLong(), context, Win32DynamicFfi.objectSlot(completionroutine), Win32DynamicFfi.objectSlot(postirproutine))).toInt()
}

public fun FsRtlCheckOplockEx2(oplock: Long, irp: Long, flags: UInt, flagsex2: UInt, completionroutinecontext: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP, timeout: ULong, notifycontext: Long, notifyroutine: POPLOCK_NOTIFY_ROUTINE): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlCheckOplockEx2", longArrayOf(oplock, irp, flags.toLong(), flagsex2.toLong(), completionroutinecontext, Win32DynamicFfi.objectSlot(completionroutine), Win32DynamicFfi.objectSlot(postirproutine), timeout.toLong(), notifycontext, Win32DynamicFfi.objectSlot(notifyroutine))).toInt()
}

public fun FsRtlCheckUpperOplock(oplock: Long, newloweroplockstate: UInt, completionroutinecontext: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, prependroutine: POPLOCK_FS_PREPOST_IRP, flags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlCheckUpperOplock", longArrayOf(oplock, newloweroplockstate.toLong(), completionroutinecontext, Win32DynamicFfi.objectSlot(completionroutine), Win32DynamicFfi.objectSlot(prependroutine), flags.toLong())).toInt()
}

public fun FsRtlCopyRead(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, lockkey: UInt, buffer: Long, iostatus: Long, deviceobject: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlCopyRead", longArrayOf(fileobject, fileoffset, length.toLong(), if (wait) 1L else 0L, lockkey.toLong(), buffer, iostatus, deviceobject))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlCopyWrite(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, lockkey: UInt, buffer: Long, iostatus: Long, deviceobject: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlCopyWrite", longArrayOf(fileobject, fileoffset, length.toLong(), if (wait) 1L else 0L, lockkey.toLong(), buffer, iostatus, deviceobject))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlCreateSectionForDataScan(sectionhandle: Long, sectionobject: Long, sectionfilesize: Long, fileobject: Long, desiredaccess: UInt, objectattributes: Long, maximumsize: Long, sectionpageprotection: UInt, allocationattributes: UInt, flags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlCreateSectionForDataScan", longArrayOf(sectionhandle, sectionobject, sectionfilesize, fileobject, desiredaccess.toLong(), objectattributes, maximumsize, sectionpageprotection.toLong(), allocationattributes.toLong(), flags.toLong())).toInt()
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

public fun FsRtlDeregisterUncProvider(handle: HANDLE) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlDeregisterUncProvider", longArrayOf(handle))
}

public fun FsRtlDismountComplete(deviceobject: Long, dismountstatus: NTSTATUS) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlDismountComplete", longArrayOf(deviceobject, dismountstatus.toLong()))
}

public fun FsRtlDissectDbcs(path: STRING, firstname: Long, remainingname: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlDissectDbcs", longArrayOf(run { val buf = ByteArray(16); buf[0] = (path.Length.toInt() and 0xFF).toByte(); buf[1] = ((path.Length.toInt() ushr 8) and 0xFF).toByte(); buf[2] = (path.MaximumLength.toInt() and 0xFF).toByte(); buf[3] = ((path.MaximumLength.toInt() ushr 8) and 0xFF).toByte(); buf[8] = (path.Buffer and 0xFF).toByte(); buf[9] = ((path.Buffer ushr 8) and 0xFF).toByte(); buf[10] = ((path.Buffer ushr 16) and 0xFF).toByte(); buf[11] = ((path.Buffer ushr 24) and 0xFF).toByte(); buf[12] = ((path.Buffer ushr 32) and 0xFF).toByte(); buf[13] = ((path.Buffer ushr 40) and 0xFF).toByte(); buf[14] = ((path.Buffer ushr 48) and 0xFF).toByte(); buf[15] = ((path.Buffer ushr 56) and 0xFF).toByte(); val ptr = Win32DynamicFfi.allocZeroed(16); Win32DynamicFfi.writeBytes(ptr, buf); ptr }, firstname, remainingname))
}

public fun FsRtlDissectName(path: UNICODE_STRING, firstname: Long, remainingname: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlDissectName", longArrayOf(run { val buf = ByteArray(16); buf[0] = (path.Length.toInt() and 0xFF).toByte(); buf[1] = ((path.Length.toInt() ushr 8) and 0xFF).toByte(); buf[2] = (path.MaximumLength.toInt() and 0xFF).toByte(); buf[3] = ((path.MaximumLength.toInt() ushr 8) and 0xFF).toByte(); buf[8] = (path.Buffer and 0xFF).toByte(); buf[9] = ((path.Buffer ushr 8) and 0xFF).toByte(); buf[10] = ((path.Buffer ushr 16) and 0xFF).toByte(); buf[11] = ((path.Buffer ushr 24) and 0xFF).toByte(); buf[12] = ((path.Buffer ushr 32) and 0xFF).toByte(); buf[13] = ((path.Buffer ushr 40) and 0xFF).toByte(); buf[14] = ((path.Buffer ushr 48) and 0xFF).toByte(); buf[15] = ((path.Buffer ushr 56) and 0xFF).toByte(); val ptr = Win32DynamicFfi.allocZeroed(16); Win32DynamicFfi.writeBytes(ptr, buf); ptr }, firstname, remainingname))
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

public fun FsRtlFastUnlockAll(filelock: Long, fileobject: Long, processid: PEPROCESS, context: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlFastUnlockAll", longArrayOf(filelock, fileobject, processid, context)).toInt()
}

public fun FsRtlFastUnlockAllByKey(filelock: Long, fileobject: Long, processid: PEPROCESS, key: UInt, context: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlFastUnlockAllByKey", longArrayOf(filelock, fileobject, processid, key.toLong(), context)).toInt()
}

public fun FsRtlFastUnlockSingle(filelock: Long, fileobject: Long, fileoffset: Long, length: Long, processid: PEPROCESS, key: UInt, context: Long, alreadysynchronized: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlFastUnlockSingle", longArrayOf(filelock, fileobject, fileoffset, length, processid, key.toLong(), context, if (alreadysynchronized) 1L else 0L)).toInt()
}

public fun FsRtlFindExtraCreateParameter(ecplist: Long, ecptype: Long, ecpcontext: Long, ecpcontextsize: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlFindExtraCreateParameter", longArrayOf(ecplist, ecptype, ecpcontext, ecpcontextsize)).toInt()
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

public fun FsRtlGetEcpListFromIrp(irp: Long, ecplist: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlGetEcpListFromIrp", longArrayOf(irp, ecplist)).toInt()
}

public fun FsRtlGetFileSize(fileobject: Long, filesize: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlGetFileSize", longArrayOf(fileobject, filesize)).toInt()
}

public fun FsRtlGetNextBaseMcbEntry(mcb: Long, runindex: UInt, vbn: Long, lbn: Long, sectorcount: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlGetNextBaseMcbEntry", longArrayOf(mcb, runindex.toLong(), vbn, lbn, sectorcount))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlGetNextExtraCreateParameter(ecplist: Long, currentecpcontext: Long, nextecptype: Long, nextecpcontext: Long, nextecpcontextsize: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlGetNextExtraCreateParameter", longArrayOf(ecplist, currentecpcontext, nextecptype, nextecpcontext, nextecpcontextsize)).toInt()
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

public fun FsRtlGetSectorSizeInformation(deviceobject: Long, sectorsizeinfo: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlGetSectorSizeInformation", longArrayOf(deviceobject, sectorsizeinfo)).toInt()
}

public fun FsRtlGetSupportedFeatures(deviceobject: Long, supportedfeatures: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlGetSupportedFeatures", longArrayOf(deviceobject, supportedfeatures)).toInt()
}

public fun FsRtlGetVirtualDiskNestingLevel(deviceobject: Long, nestinglevel: Long, nestingflags: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlGetVirtualDiskNestingLevel", longArrayOf(deviceobject, nestinglevel, nestingflags)).toInt()
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

public fun FsRtlInitializeBaseMcb(mcb: Long, pooltype: POOL_TYPE) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlInitializeBaseMcb", longArrayOf(mcb, pooltype.toLong()))
}

public fun FsRtlInitializeBaseMcbEx(mcb: Long, pooltype: POOL_TYPE, flags: UShort): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlInitializeBaseMcbEx", longArrayOf(mcb, pooltype.toLong(), flags.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlInitializeExtraCreateParameter(ecp: Long, ecpflags: UInt, cleanupcallback: PFSRTL_EXTRA_CREATE_PARAMETER_CLEANUP_CALLBACK, totalsize: UInt, ecptype: Long, listallocatedfrom: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlInitializeExtraCreateParameter", longArrayOf(ecp, ecpflags.toLong(), Win32DynamicFfi.objectSlot(cleanupcallback), totalsize.toLong(), ecptype, listallocatedfrom))
}

public fun FsRtlInitializeExtraCreateParameterList(ecplist: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlInitializeExtraCreateParameterList", longArrayOf(ecplist)).toInt()
}

public fun FsRtlInitializeFileLock(filelock: Long, completelockirproutine: PCOMPLETE_LOCK_IRP_ROUTINE, unlockroutine: PUNLOCK_ROUTINE) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlInitializeFileLock", longArrayOf(filelock, Win32DynamicFfi.objectSlot(completelockirproutine), Win32DynamicFfi.objectSlot(unlockroutine)))
}

public fun FsRtlInitializeLargeMcb(mcb: Long, pooltype: POOL_TYPE) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlInitializeLargeMcb", longArrayOf(mcb, pooltype.toLong()))
}

public fun FsRtlInitializeMcb(mcb: Long, pooltype: POOL_TYPE) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlInitializeMcb", longArrayOf(mcb, pooltype.toLong()))
}

public fun FsRtlInitializeOplock(oplock: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlInitializeOplock", longArrayOf(oplock))
}

public fun FsRtlInitializeTunnelCache(cache: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlInitializeTunnelCache", longArrayOf(cache))
}

public fun FsRtlInsertExtraCreateParameter(ecplist: Long, ecpcontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlInsertExtraCreateParameter", longArrayOf(ecplist, ecpcontext)).toInt()
}

public fun FsRtlInsertPerFileContext(perfilecontextpointer: Long, ptr: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlInsertPerFileContext", longArrayOf(perfilecontextpointer, ptr)).toInt()
}

public fun FsRtlInsertPerFileObjectContext(fileobject: Long, ptr: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlInsertPerFileObjectContext", longArrayOf(fileobject, ptr)).toInt()
}

public fun FsRtlInsertPerStreamContext(perstreamcontext: Long, ptr: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlInsertPerStreamContext", longArrayOf(perstreamcontext, ptr)).toInt()
}

public fun FsRtlIs32BitProcess(process: PEPROCESS): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlIs32BitProcess", longArrayOf(process))
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

public fun FsRtlIsFatDbcsLegal(dbcsname: STRING, wildcardspermissible: Boolean, pathnamepermissible: Boolean, leadingbackslashpermissible: Boolean): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlIsFatDbcsLegal", longArrayOf(run { val buf = ByteArray(16); buf[0] = (dbcsname.Length.toInt() and 0xFF).toByte(); buf[1] = ((dbcsname.Length.toInt() ushr 8) and 0xFF).toByte(); buf[2] = (dbcsname.MaximumLength.toInt() and 0xFF).toByte(); buf[3] = ((dbcsname.MaximumLength.toInt() ushr 8) and 0xFF).toByte(); buf[8] = (dbcsname.Buffer and 0xFF).toByte(); buf[9] = ((dbcsname.Buffer ushr 8) and 0xFF).toByte(); buf[10] = ((dbcsname.Buffer ushr 16) and 0xFF).toByte(); buf[11] = ((dbcsname.Buffer ushr 24) and 0xFF).toByte(); buf[12] = ((dbcsname.Buffer ushr 32) and 0xFF).toByte(); buf[13] = ((dbcsname.Buffer ushr 40) and 0xFF).toByte(); buf[14] = ((dbcsname.Buffer ushr 48) and 0xFF).toByte(); buf[15] = ((dbcsname.Buffer ushr 56) and 0xFF).toByte(); val ptr = Win32DynamicFfi.allocZeroed(16); Win32DynamicFfi.writeBytes(ptr, buf); ptr }, if (wildcardspermissible) 1L else 0L, if (pathnamepermissible) 1L else 0L, if (leadingbackslashpermissible) 1L else 0L))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlIsHpfsDbcsLegal(dbcsname: STRING, wildcardspermissible: Boolean, pathnamepermissible: Boolean, leadingbackslashpermissible: Boolean): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlIsHpfsDbcsLegal", longArrayOf(run { val buf = ByteArray(16); buf[0] = (dbcsname.Length.toInt() and 0xFF).toByte(); buf[1] = ((dbcsname.Length.toInt() ushr 8) and 0xFF).toByte(); buf[2] = (dbcsname.MaximumLength.toInt() and 0xFF).toByte(); buf[3] = ((dbcsname.MaximumLength.toInt() ushr 8) and 0xFF).toByte(); buf[8] = (dbcsname.Buffer and 0xFF).toByte(); buf[9] = ((dbcsname.Buffer ushr 8) and 0xFF).toByte(); buf[10] = ((dbcsname.Buffer ushr 16) and 0xFF).toByte(); buf[11] = ((dbcsname.Buffer ushr 24) and 0xFF).toByte(); buf[12] = ((dbcsname.Buffer ushr 32) and 0xFF).toByte(); buf[13] = ((dbcsname.Buffer ushr 40) and 0xFF).toByte(); buf[14] = ((dbcsname.Buffer ushr 48) and 0xFF).toByte(); buf[15] = ((dbcsname.Buffer ushr 56) and 0xFF).toByte(); val ptr = Win32DynamicFfi.allocZeroed(16); Win32DynamicFfi.writeBytes(ptr, buf); ptr }, if (wildcardspermissible) 1L else 0L, if (pathnamepermissible) 1L else 0L, if (leadingbackslashpermissible) 1L else 0L))
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

public fun FsRtlIsNtstatusExpected(exception: NTSTATUS): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlIsNtstatusExpected", longArrayOf(exception.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlIsPagingFile(fileobject: Long): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlIsPagingFile", longArrayOf(fileobject)).toUInt()
}

public fun FsRtlIsSystemPagingFile(fileobject: Long): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlIsSystemPagingFile", longArrayOf(fileobject)).toUInt()
}

public fun FsRtlIssueDeviceIoControl(deviceobject: Long, ioctl: UInt, flags: UByte, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt, iosbinformation: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlIssueDeviceIoControl", longArrayOf(deviceobject, ioctl.toLong(), flags.toLong(), inputbuffer, inputbufferlength.toLong(), outputbuffer, outputbufferlength.toLong(), iosbinformation)).toInt()
}

public fun FsRtlKernelFsControlFile(fileobject: Long, fscontrolcode: UInt, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt, retoutputbuffersize: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlKernelFsControlFile", longArrayOf(fileobject, fscontrolcode.toLong(), inputbuffer, inputbufferlength.toLong(), outputbuffer, outputbufferlength.toLong(), retoutputbuffersize)).toInt()
}

public fun FsRtlLogCcFlushError(filename: Long, deviceobject: Long, sectionobjectpointer: Long, flusherror: NTSTATUS, flags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlLogCcFlushError", longArrayOf(filename, deviceobject, sectionobjectpointer, flusherror.toLong(), flags.toLong())).toInt()
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

public fun FsRtlMdlReadEx(fileobject: Long, fileoffset: Long, length: UInt, lockkey: UInt, mdlchain: Long, iostatus: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlMdlReadEx", longArrayOf(fileobject, fileoffset, length.toLong(), lockkey.toLong(), mdlchain, iostatus)).toInt()
}

public fun FsRtlMdlWriteCompleteDev(fileobject: Long, fileoffset: Long, mdlchain: Long, deviceobject: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlMdlWriteCompleteDev", longArrayOf(fileobject, fileoffset, mdlchain, deviceobject))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlMupGetProviderIdFromName(pprovidername: Long, pproviderid: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlMupGetProviderIdFromName", longArrayOf(pprovidername, pproviderid)).toInt()
}

public fun FsRtlMupGetProviderInfoFromFileObject(pfileobject: Long, level: UInt, pbuffer: Long, pbuffersize: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlMupGetProviderInfoFromFileObject", longArrayOf(pfileobject, level.toLong(), pbuffer, pbuffersize)).toInt()
}

public fun FsRtlNormalizeNtstatus(exception: NTSTATUS, genericexception: NTSTATUS): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlNormalizeNtstatus", longArrayOf(exception.toLong(), genericexception.toLong())).toInt()
}

public fun FsRtlNotifyCleanup(notifysync: PNOTIFY_SYNC, notifylist: Long, fscontext: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlNotifyCleanup", longArrayOf(notifysync, notifylist, fscontext))
}

public fun FsRtlNotifyCleanupAll(notifysync: PNOTIFY_SYNC, notifylist: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlNotifyCleanupAll", longArrayOf(notifysync, notifylist))
}

public fun FsRtlNotifyFilterChangeDirectory(notifysync: PNOTIFY_SYNC, notifylist: Long, fscontext: Long, fulldirectoryname: Long, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifyirp: Long, traversecallback: PCHECK_FOR_TRAVERSE_ACCESS, subjectcontext: Long, filtercallback: PFILTER_REPORT_CHANGE) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlNotifyFilterChangeDirectory", longArrayOf(notifysync, notifylist, fscontext, fulldirectoryname, if (watchtree) 1L else 0L, if (ignorebuffer) 1L else 0L, completionfilter.toLong(), notifyirp, Win32DynamicFfi.objectSlot(traversecallback), subjectcontext, Win32DynamicFfi.objectSlot(filtercallback)))
}

public fun FsRtlNotifyFilterReportChange(notifysync: PNOTIFY_SYNC, notifylist: Long, fulltargetname: Long, targetnameoffset: UShort, streamname: Long, normalizedparentname: Long, filtermatch: UInt, action: UInt, targetcontext: Long, filtercontext: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlNotifyFilterReportChange", longArrayOf(notifysync, notifylist, fulltargetname, targetnameoffset.toLong(), streamname, normalizedparentname, filtermatch.toLong(), action.toLong(), targetcontext, filtercontext))
}

public fun FsRtlNotifyFullChangeDirectory(notifysync: PNOTIFY_SYNC, notifylist: Long, fscontext: Long, fulldirectoryname: Long, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifyirp: Long, traversecallback: PCHECK_FOR_TRAVERSE_ACCESS, subjectcontext: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlNotifyFullChangeDirectory", longArrayOf(notifysync, notifylist, fscontext, fulldirectoryname, if (watchtree) 1L else 0L, if (ignorebuffer) 1L else 0L, completionfilter.toLong(), notifyirp, Win32DynamicFfi.objectSlot(traversecallback), subjectcontext))
}

public fun FsRtlNotifyFullReportChange(notifysync: PNOTIFY_SYNC, notifylist: Long, fulltargetname: Long, targetnameoffset: UShort, streamname: Long, normalizedparentname: Long, filtermatch: UInt, action: UInt, targetcontext: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlNotifyFullReportChange", longArrayOf(notifysync, notifylist, fulltargetname, targetnameoffset.toLong(), streamname, normalizedparentname, filtermatch.toLong(), action.toLong(), targetcontext))
}

public fun FsRtlNotifyInitializeSync(notifysync: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlNotifyInitializeSync", longArrayOf(notifysync))
}

public fun FsRtlNotifyUninitializeSync(notifysync: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlNotifyUninitializeSync", longArrayOf(notifysync))
}

public fun FsRtlNotifyVolumeEvent(fileobject: Long, eventcode: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlNotifyVolumeEvent", longArrayOf(fileobject, eventcode.toLong())).toInt()
}

public fun FsRtlNotifyVolumeEventEx(fileobject: Long, eventcode: UInt, event: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlNotifyVolumeEventEx", longArrayOf(fileobject, eventcode.toLong(), event)).toInt()
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

public fun FsRtlOplockBreakH(oplock: Long, irp: Long, flags: UInt, context: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlOplockBreakH", longArrayOf(oplock, irp, flags.toLong(), context, Win32DynamicFfi.objectSlot(completionroutine), Win32DynamicFfi.objectSlot(postirproutine))).toInt()
}

public fun FsRtlOplockBreakH2(oplock: Long, irp: Long, flags: UInt, context: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP, grantedaccess: Long, shareaccess: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlOplockBreakH2", longArrayOf(oplock, irp, flags.toLong(), context, Win32DynamicFfi.objectSlot(completionroutine), Win32DynamicFfi.objectSlot(postirproutine), grantedaccess, shareaccess)).toInt()
}

public fun FsRtlOplockBreakToNone(oplock: Long, irpsp: Long, irp: Long, context: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlOplockBreakToNone", longArrayOf(oplock, irpsp, irp, context, Win32DynamicFfi.objectSlot(completionroutine), Win32DynamicFfi.objectSlot(postirproutine))).toInt()
}

public fun FsRtlOplockBreakToNoneEx(oplock: Long, irp: Long, flags: UInt, context: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlOplockBreakToNoneEx", longArrayOf(oplock, irp, flags.toLong(), context, Win32DynamicFfi.objectSlot(completionroutine), Win32DynamicFfi.objectSlot(postirproutine))).toInt()
}

public fun FsRtlOplockFsctrl(oplock: Long, irp: Long, opencount: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlOplockFsctrl", longArrayOf(oplock, irp, opencount.toLong())).toInt()
}

public fun FsRtlOplockFsctrlEx(oplock: Long, irp: Long, opencount: UInt, flags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlOplockFsctrlEx", longArrayOf(oplock, irp, opencount.toLong(), flags.toLong())).toInt()
}

public fun FsRtlOplockGetAnyBreakOwnerProcess(oplock: Long): PEPROCESS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlOplockGetAnyBreakOwnerProcess", longArrayOf(oplock))
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

public fun FsRtlPrepareMdlWriteEx(fileobject: Long, fileoffset: Long, length: UInt, lockkey: UInt, mdlchain: Long, iostatus: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlPrepareMdlWriteEx", longArrayOf(fileobject, fileoffset, length.toLong(), lockkey.toLong(), mdlchain, iostatus)).toInt()
}

public fun FsRtlPrepareToReuseEcp(ecpcontext: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlPrepareToReuseEcp", longArrayOf(ecpcontext))
}

public fun FsRtlPrivateLock(filelock: Long, fileobject: Long, fileoffset: Long, length: Long, processid: PEPROCESS, key: UInt, failimmediately: Boolean, exclusivelock: Boolean, iosb: Long, irp: Long, context: Long, alreadysynchronized: Boolean): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlPrivateLock", longArrayOf(filelock, fileobject, fileoffset, length, processid, key.toLong(), if (failimmediately) 1L else 0L, if (exclusivelock) 1L else 0L, iosb, irp, context, if (alreadysynchronized) 1L else 0L))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlProcessFileLock(filelock: Long, irp: Long, context: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlProcessFileLock", longArrayOf(filelock, irp, context)).toInt()
}

public fun FsRtlQueryCachedVdl(fileobject: Long, vdl: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlQueryCachedVdl", longArrayOf(fileobject, vdl)).toInt()
}

public fun FsRtlQueryInformationFile(fileobject: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, retfileinformationsize: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlQueryInformationFile", longArrayOf(fileobject, fileinformation, length.toLong(), fileinformationclass.toLong(), retfileinformationsize)).toInt()
}

public fun FsRtlQueryKernelEaFile(fileobject: Long, returnedeadata: Long, length: UInt, returnsingleentry: Boolean, ealist: Long, ealistlength: UInt, eaindex: Long, restartscan: Boolean, lengthreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlQueryKernelEaFile", longArrayOf(fileobject, returnedeadata, length.toLong(), if (returnsingleentry) 1L else 0L, ealist, ealistlength.toLong(), eaindex, if (restartscan) 1L else 0L, lengthreturned)).toInt()
}

public fun FsRtlQueryMaximumVirtualDiskNestingLevel(): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlQueryMaximumVirtualDiskNestingLevel", longArrayOf()).toUInt()
}

public fun FsRtlRegisterFileSystemFilterCallbacks(filterdriverobject: Long, callbacks: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlRegisterFileSystemFilterCallbacks", longArrayOf(filterdriverobject, callbacks)).toInt()
}

public fun FsRtlRegisterUncProvider(muphandle: Long, redirectordevicename: Long, mailslotssupported: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlRegisterUncProvider", longArrayOf(muphandle, redirectordevicename, if (mailslotssupported) 1L else 0L)).toInt()
}

public fun FsRtlRegisterUncProviderEx(muphandle: Long, redirdevname: Long, deviceobject: Long, flags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlRegisterUncProviderEx", longArrayOf(muphandle, redirdevname, deviceobject, flags.toLong())).toInt()
}

public fun FsRtlRegisterUncProviderEx2(redirdevname: Long, deviceobject: Long, registration: Long, muphandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlRegisterUncProviderEx2", longArrayOf(redirdevname, deviceobject, registration, muphandle)).toInt()
}

public fun FsRtlReleaseFile(fileobject: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlReleaseFile", longArrayOf(fileobject))
}

public fun FsRtlRemoveBaseMcbEntry(mcb: Long, vbn: Long, sectorcount: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlRemoveBaseMcbEntry", longArrayOf(mcb, vbn, sectorcount))
    return (rawRet and 0xFFL) != 0L
}

public fun FsRtlRemoveDotsFromPath(originalstring: PWSTR, pathlength: UShort, newlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlRemoveDotsFromPath", longArrayOf(originalstring, pathlength.toLong(), newlength)).toInt()
}

public fun FsRtlRemoveExtraCreateParameter(ecplist: Long, ecptype: Long, ecpcontext: Long, ecpcontextsize: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlRemoveExtraCreateParameter", longArrayOf(ecplist, ecptype, ecpcontext, ecpcontextsize)).toInt()
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

public fun FsRtlSetDriverBacking(driverobj: Long, flags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlSetDriverBacking", longArrayOf(driverobj, flags.toLong())).toInt()
}

public fun FsRtlSetEcpListIntoIrp(irp: Long, ecplist: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlSetEcpListIntoIrp", longArrayOf(irp, ecplist)).toInt()
}

public fun FsRtlSetKernelEaFile(fileobject: Long, eabuffer: Long, length: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlSetKernelEaFile", longArrayOf(fileobject, eabuffer, length.toLong())).toInt()
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

public fun FsRtlUpperOplockFsctrl(oplock: Long, irp: Long, opencount: UInt, loweroplockstate: UInt, flags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlUpperOplockFsctrl", longArrayOf(oplock, irp, opencount.toLong(), loweroplockstate.toLong(), flags.toLong())).toInt()
}

public fun FsRtlValidateReparsePointBuffer(bufferlength: UInt, reparsebuffer: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlValidateReparsePointBuffer", longArrayOf(bufferlength.toLong(), reparsebuffer)).toInt()
}

public fun FsRtlVolumeDeviceToCorrelationId(volumedeviceobject: Long, guid: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "FsRtlVolumeDeviceToCorrelationId", longArrayOf(volumedeviceobject, guid)).toInt()
}

public fun GetSecurityUserInfo(logonid: Long, flags: UInt, userinformation: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("secur32.dll", "GetSecurityUserInfo", longArrayOf(logonid, flags.toLong(), userinformation)).toInt()
}

public fun IoAcquireVpbSpinLock(irql: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoAcquireVpbSpinLock", longArrayOf(irql))
}

public fun IoApplyPriorityInfoThread(inputpriorityinfo: Long, outputpriorityinfo: Long, thread: PETHREAD): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoApplyPriorityInfoThread", longArrayOf(inputpriorityinfo, outputpriorityinfo, thread)).toInt()
}

public fun IoCheckDesiredAccess(desiredaccess: Long, grantedaccess: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoCheckDesiredAccess", longArrayOf(desiredaccess, grantedaccess.toLong())).toInt()
}

public fun IoCheckEaBufferValidity(eabuffer: Long, ealength: UInt, erroroffset: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoCheckEaBufferValidity", longArrayOf(eabuffer, ealength.toLong(), erroroffset)).toInt()
}

public fun IoCheckFunctionAccess(grantedaccess: UInt, majorfunction: UByte, minorfunction: UByte, iocontrolcode: UInt, arg1: Long, arg2: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoCheckFunctionAccess", longArrayOf(grantedaccess.toLong(), majorfunction.toLong(), minorfunction.toLong(), iocontrolcode.toLong(), arg1, arg2)).toInt()
}

public fun IoCheckQuerySetFileInformation(fileinformationclass: FILE_INFORMATION_CLASS, length: UInt, setoperation: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoCheckQuerySetFileInformation", longArrayOf(fileinformationclass.toLong(), length.toLong(), if (setoperation) 1L else 0L)).toInt()
}

public fun IoCheckQuerySetVolumeInformation(fsinformationclass: FS_INFORMATION_CLASS, length: UInt, setoperation: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoCheckQuerySetVolumeInformation", longArrayOf(fsinformationclass.toLong(), length.toLong(), if (setoperation) 1L else 0L)).toInt()
}

public fun IoCheckQuotaBufferValidity(quotabuffer: Long, quotalength: UInt, erroroffset: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoCheckQuotaBufferValidity", longArrayOf(quotabuffer, quotalength.toLong(), erroroffset)).toInt()
}

public fun IoClearFsTrackOffsetState(irp: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoClearFsTrackOffsetState", longArrayOf(irp)).toInt()
}

public fun IoCreateStreamFileObject(fileobject: Long, deviceobject: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoCreateStreamFileObject", longArrayOf(fileobject, deviceobject))
}

public fun IoCreateStreamFileObjectEx(fileobject: Long, deviceobject: Long, filehandle: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoCreateStreamFileObjectEx", longArrayOf(fileobject, deviceobject, filehandle))
}

public fun IoCreateStreamFileObjectEx2(createoptions: Long, fileobject: Long, deviceobject: Long, streamfileobject: Long, filehandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoCreateStreamFileObjectEx2", longArrayOf(createoptions, fileobject, deviceobject, streamfileobject, filehandle)).toInt()
}

public fun IoCreateStreamFileObjectLite(fileobject: Long, deviceobject: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoCreateStreamFileObjectLite", longArrayOf(fileobject, deviceobject))
}

public fun IoEnumerateDeviceObjectList(driverobject: Long, deviceobjectlist: Long, deviceobjectlistsize: UInt, actualnumberdeviceobjects: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoEnumerateDeviceObjectList", longArrayOf(driverobject, deviceobjectlist, deviceobjectlistsize.toLong(), actualnumberdeviceobjects)).toInt()
}

public fun IoEnumerateRegisteredFiltersList(driverobjectlist: Long, driverobjectlistsize: UInt, actualnumberdriverobjects: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoEnumerateRegisteredFiltersList", longArrayOf(driverobjectlist, driverobjectlistsize.toLong(), actualnumberdriverobjects)).toInt()
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

public fun IoGetDeviceToVerify(thread: PETHREAD): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetDeviceToVerify", longArrayOf(thread))
}

public fun IoGetDiskDeviceObject(filesystemdeviceobject: Long, diskdeviceobject: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetDiskDeviceObject", longArrayOf(filesystemdeviceobject, diskdeviceobject)).toInt()
}

public fun IoGetFsTrackOffsetState(irp: Long, retfstrackoffsetblob: Long, rettrackedoffset: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetFsTrackOffsetState", longArrayOf(irp, retfstrackoffsetblob, rettrackedoffset)).toInt()
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

public fun IoGetRequestorProcess(irp: Long): PEPROCESS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetRequestorProcess", longArrayOf(irp))
}

public fun IoGetRequestorProcessId(irp: Long): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetRequestorProcessId", longArrayOf(irp)).toUInt()
}

public fun IoGetRequestorSessionId(irp: Long, psessionid: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoGetRequestorSessionId", longArrayOf(irp, psessionid)).toInt()
}

public fun IoIrpHasFsTrackOffsetExtensionType(irp: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "IoIrpHasFsTrackOffsetExtensionType", longArrayOf(irp))
    return (rawRet and 0xFFL) != 0L
}

public fun IoIsOperationSynchronous(irp: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "IoIsOperationSynchronous", longArrayOf(irp))
    return (rawRet and 0xFFL) != 0L
}

public fun IoIsSystemThread(thread: PETHREAD): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "IoIsSystemThread", longArrayOf(thread))
    return (rawRet and 0xFFL) != 0L
}

public fun IoIsValidNameGraftingBuffer(irp: Long, reparsebuffer: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "IoIsValidNameGraftingBuffer", longArrayOf(irp, reparsebuffer))
    return (rawRet and 0xFFL) != 0L
}

public fun IoPageRead(fileobject: Long, memorydescriptorlist: Long, startingoffset: Long, event: Long, iostatusblock: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoPageRead", longArrayOf(fileobject, memorydescriptorlist, startingoffset, event, iostatusblock)).toInt()
}

public fun IoQueryFileDosDeviceName(fileobject: Long, objectnameinformation: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoQueryFileDosDeviceName", longArrayOf(fileobject, objectnameinformation)).toInt()
}

public fun IoQueryFileInformation(fileobject: Long, fileinformationclass: FILE_INFORMATION_CLASS, length: UInt, fileinformation: Long, returnedlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoQueryFileInformation", longArrayOf(fileobject, fileinformationclass.toLong(), length.toLong(), fileinformation, returnedlength)).toInt()
}

public fun IoQueryVolumeInformation(fileobject: Long, fsinformationclass: FS_INFORMATION_CLASS, length: UInt, fsinformation: Long, returnedlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoQueryVolumeInformation", longArrayOf(fileobject, fsinformationclass.toLong(), length.toLong(), fsinformation, returnedlength)).toInt()
}

public fun IoQueueThreadIrp(irp: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoQueueThreadIrp", longArrayOf(irp))
}

public fun IoRegisterFileSystem(deviceobject: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoRegisterFileSystem", longArrayOf(deviceobject))
}

public fun IoRegisterFsRegistrationChange(driverobject: Long, drivernotificationroutine: DRIVER_FS_NOTIFICATION): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoRegisterFsRegistrationChange", longArrayOf(driverobject, Win32DynamicFfi.objectSlot(drivernotificationroutine))).toInt()
}

public fun IoRegisterFsRegistrationChangeMountAware(driverobject: Long, drivernotificationroutine: DRIVER_FS_NOTIFICATION, synchronizewithmounts: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoRegisterFsRegistrationChangeMountAware", longArrayOf(driverobject, Win32DynamicFfi.objectSlot(drivernotificationroutine), if (synchronizewithmounts) 1L else 0L)).toInt()
}

public fun IoReleaseVpbSpinLock(irql: UByte) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoReleaseVpbSpinLock", longArrayOf(irql.toLong()))
}

public fun IoReplaceFileObjectName(fileobject: Long, newfilename: PCWSTR, filenamelength: UShort): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoReplaceFileObjectName", longArrayOf(fileobject, newfilename, filenamelength.toLong())).toInt()
}

public fun IoRequestDeviceRemovalForReset(physicaldeviceobject: Long, flags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoRequestDeviceRemovalForReset", longArrayOf(physicaldeviceobject, flags.toLong())).toInt()
}

public fun IoRetrievePriorityInfo(irp: Long, fileobject: Long, thread: PETHREAD, priorityinfo: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoRetrievePriorityInfo", longArrayOf(irp, fileobject, thread, priorityinfo)).toInt()
}

public fun IoSetDeviceToVerify(thread: PETHREAD, deviceobject: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoSetDeviceToVerify", longArrayOf(thread, deviceobject))
}

public fun IoSetFsTrackOffsetState(irp: Long, fstrackoffsetblob: Long, trackedoffset: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoSetFsTrackOffsetState", longArrayOf(irp, fstrackoffsetblob, trackedoffset)).toInt()
}

public fun IoSetInformation(fileobject: Long, fileinformationclass: FILE_INFORMATION_CLASS, length: UInt, fileinformation: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoSetInformation", longArrayOf(fileobject, fileinformationclass.toLong(), length.toLong(), fileinformation)).toInt()
}

public fun IoSynchronousPageWrite(fileobject: Long, memorydescriptorlist: Long, startingoffset: Long, event: Long, iostatusblock: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoSynchronousPageWrite", longArrayOf(fileobject, memorydescriptorlist, startingoffset, event, iostatusblock)).toInt()
}

public fun IoThreadToProcess(thread: PETHREAD): PEPROCESS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoThreadToProcess", longArrayOf(thread))
}

public fun IoUnregisterFileSystem(deviceobject: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoUnregisterFileSystem", longArrayOf(deviceobject))
}

public fun IoUnregisterFsRegistrationChange(driverobject: Long, drivernotificationroutine: DRIVER_FS_NOTIFICATION) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "IoUnregisterFsRegistrationChange", longArrayOf(driverobject, Win32DynamicFfi.objectSlot(drivernotificationroutine)))
}

public fun IoVerifyVolume(deviceobject: Long, allowrawmount: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "IoVerifyVolume", longArrayOf(deviceobject, if (allowrawmount) 1L else 0L)).toInt()
}

public fun KeAcquireQueuedSpinLock(number: KSPIN_LOCK_QUEUE_NUMBER): UByte {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeAcquireQueuedSpinLock", longArrayOf(number.toLong())).toUByte()
}

public fun KeAcquireSpinLockRaiseToSynch(spinlock: Long): UByte {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeAcquireSpinLockRaiseToSynch", longArrayOf(spinlock)).toUByte()
}

public fun KeAttachProcess(process: PRKPROCESS) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeAttachProcess", longArrayOf(process))
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

public fun KeReleaseQueuedSpinLock(number: KSPIN_LOCK_QUEUE_NUMBER, oldirql: UByte) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeReleaseQueuedSpinLock", longArrayOf(number.toLong(), oldirql.toLong()))
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

public fun KeSetIdealProcessorThread(thread: PKTHREAD, processor: UByte): UByte {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeSetIdealProcessorThread", longArrayOf(thread, processor.toLong())).toUByte()
}

public fun KeSetKernelStackSwapEnable(enable: Boolean): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "KeSetKernelStackSwapEnable", longArrayOf(if (enable) 1L else 0L))
    return (rawRet and 0xFFL) != 0L
}

public fun KeStackAttachProcess(process: PRKPROCESS, apcstate: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeStackAttachProcess", longArrayOf(process, apcstate))
}

public fun KeTryToAcquireQueuedSpinLock(number: KSPIN_LOCK_QUEUE_NUMBER, oldirql: Long): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "KeTryToAcquireQueuedSpinLock", longArrayOf(number.toLong(), oldirql)).toUInt()
}

public fun KeUnstackDetachProcess(apcstate: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "KeUnstackDetachProcess", longArrayOf(apcstate))
}

public fun MakeSignature(phcontext: Long, fqop: UInt, pmessage: Long, messageseqno: UInt): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "MakeSignature", longArrayOf(phcontext, fqop.toLong(), pmessage, messageseqno.toLong())).toInt()
}

public fun MapSecurityError(secstatus: HRESULT): NTSTATUS {
    return Win32DynamicFfi.invoke("ksecdd.sys", "MapSecurityError", longArrayOf(secstatus.toLong())).toInt()
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

public fun MmIsFileSectionActive(fssectionpointer: Long, flags: UInt, sectionisactive: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmIsFileSectionActive", longArrayOf(fssectionpointer, flags.toLong(), sectionisactive)).toInt()
}

public fun MmIsRecursiveIoFault(): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "MmIsRecursiveIoFault", longArrayOf())
    return (rawRet and 0xFFL) != 0L
}

public fun MmMdlPagesAreZero(mdl: Long): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmMdlPagesAreZero", longArrayOf(mdl)).toUInt()
}

public fun MmPrefetchPages(numberoflists: UInt, readlists: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "MmPrefetchPages", longArrayOf(numberoflists.toLong(), readlists)).toInt()
}

public fun MmSetAddressRangeModified(address: Long, length: ULong): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "MmSetAddressRangeModified", longArrayOf(address, length.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun NtAccessCheckAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, desiredaccess: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtAccessCheckAndAuditAlarm", longArrayOf(subsystemname, handleid, objecttypename, objectname, securitydescriptor, desiredaccess.toLong(), genericmapping, if (objectcreation) 1L else 0L, grantedaccess, accessstatus, generateonclose)).toInt()
}

public fun NtAccessCheckByTypeAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtAccessCheckByTypeAndAuditAlarm", longArrayOf(subsystemname, handleid, objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess.toLong(), audittype.toLong(), flags.toLong(), objecttypelist, objecttypelistlength.toLong(), genericmapping, if (objectcreation) 1L else 0L, grantedaccess, accessstatus, generateonclose)).toInt()
}

public fun NtAccessCheckByTypeResultListAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtAccessCheckByTypeResultListAndAuditAlarm", longArrayOf(subsystemname, handleid, objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess.toLong(), audittype.toLong(), flags.toLong(), objecttypelist, objecttypelistlength.toLong(), genericmapping, if (objectcreation) 1L else 0L, grantedaccess, accessstatus, generateonclose)).toInt()
}

public fun NtAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname: Long, handleid: Long, clienttoken: HANDLE, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtAccessCheckByTypeResultListAndAuditAlarmByHandle", longArrayOf(subsystemname, handleid, clienttoken, objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess.toLong(), audittype.toLong(), flags.toLong(), objecttypelist, objecttypelistlength.toLong(), genericmapping, if (objectcreation) 1L else 0L, grantedaccess, accessstatus, generateonclose)).toInt()
}

public fun NtAdjustGroupsToken(tokenhandle: HANDLE, resettodefault: Boolean, newstate: Long, bufferlength: UInt, previousstate: Long, returnlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtAdjustGroupsToken", longArrayOf(tokenhandle, if (resettodefault) 1L else 0L, newstate, bufferlength.toLong(), previousstate, returnlength)).toInt()
}

public fun NtAdjustPrivilegesToken(tokenhandle: HANDLE, disableallprivileges: Boolean, newstate: Long, bufferlength: UInt, previousstate: Long, returnlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtAdjustPrivilegesToken", longArrayOf(tokenhandle, if (disableallprivileges) 1L else 0L, newstate, bufferlength.toLong(), previousstate, returnlength)).toInt()
}

public fun NtAllocateVirtualMemory(processhandle: HANDLE, baseaddress: Long, zerobits: ULong, regionsize: Long, allocationtype: UInt, protect: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtAllocateVirtualMemory", longArrayOf(processhandle, baseaddress, zerobits.toLong(), regionsize, allocationtype.toLong(), protect.toLong())).toInt()
}

public fun NtAllocateVirtualMemoryEx(processhandle: HANDLE, baseaddress: Long, regionsize: Long, allocationtype: UInt, pageprotection: UInt, extendedparameters: Long, extendedparametercount: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtAllocateVirtualMemoryEx", longArrayOf(processhandle, baseaddress, regionsize, allocationtype.toLong(), pageprotection.toLong(), extendedparameters, extendedparametercount.toLong())).toInt()
}

public fun NtCancelIoFileEx(filehandle: HANDLE, iorequesttocancel: Long, iostatusblock: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtCancelIoFileEx", longArrayOf(filehandle, iorequesttocancel, iostatusblock)).toInt()
}

public fun NtCloseObjectAuditAlarm(subsystemname: Long, handleid: Long, generateonclose: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtCloseObjectAuditAlarm", longArrayOf(subsystemname, handleid, if (generateonclose) 1L else 0L)).toInt()
}

public fun NtCreateDirectoryObject(directoryhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtCreateDirectoryObject", longArrayOf(directoryhandle, desiredaccess.toLong(), objectattributes)).toInt()
}

public fun NtCreateEvent(eventhandle: Long, desiredaccess: UInt, objectattributes: Long, eventtype: EVENT_TYPE, initialstate: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtCreateEvent", longArrayOf(eventhandle, desiredaccess.toLong(), objectattributes, eventtype.toLong(), if (initialstate) 1L else 0L)).toInt()
}

public fun NtCreateFile(filehandle: Long, desiredaccess: FILE_ACCESS_RIGHTS, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: FILE_FLAGS_AND_ATTRIBUTES, shareaccess: FILE_SHARE_MODE, createdisposition: NTCREATEFILE_CREATE_DISPOSITION, createoptions: NTCREATEFILE_CREATE_OPTIONS, eabuffer: Long, ealength: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtCreateFile", longArrayOf(filehandle, desiredaccess.toLong(), objectattributes, iostatusblock, allocationsize, fileattributes.toLong(), shareaccess.toLong(), createdisposition.toLong(), createoptions.toLong(), eabuffer, ealength.toLong())).toInt()
}

public fun NtCreateSection(sectionhandle: Long, desiredaccess: UInt, objectattributes: Long, maximumsize: Long, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtCreateSection", longArrayOf(sectionhandle, desiredaccess.toLong(), objectattributes, maximumsize, sectionpageprotection.toLong(), allocationattributes.toLong(), filehandle)).toInt()
}

public fun NtCreateSectionEx(sectionhandle: Long, desiredaccess: UInt, objectattributes: Long, maximumsize: Long, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: HANDLE, extendedparameters: Long, extendedparametercount: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtCreateSectionEx", longArrayOf(sectionhandle, desiredaccess.toLong(), objectattributes, maximumsize, sectionpageprotection.toLong(), allocationattributes.toLong(), filehandle, extendedparameters, extendedparametercount.toLong())).toInt()
}

public fun NtDeleteFile(objectattributes: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtDeleteFile", longArrayOf(objectattributes)).toInt()
}

public fun NtDeleteObjectAuditAlarm(subsystemname: Long, handleid: Long, generateonclose: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtDeleteObjectAuditAlarm", longArrayOf(subsystemname, handleid, if (generateonclose) 1L else 0L)).toInt()
}

public fun NtDuplicateObject(sourceprocesshandle: HANDLE, sourcehandle: HANDLE, targetprocesshandle: HANDLE, targethandle: Long, desiredaccess: UInt, handleattributes: UInt, options: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtDuplicateObject", longArrayOf(sourceprocesshandle, sourcehandle, targetprocesshandle, targethandle, desiredaccess.toLong(), handleattributes.toLong(), options.toLong())).toInt()
}

public fun NtDuplicateToken(existingtokenhandle: HANDLE, desiredaccess: UInt, objectattributes: Long, effectiveonly: Boolean, tokentype: TOKEN_TYPE, newtokenhandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtDuplicateToken", longArrayOf(existingtokenhandle, desiredaccess.toLong(), objectattributes, if (effectiveonly) 1L else 0L, tokentype.toLong(), newtokenhandle)).toInt()
}

public fun NtFilterToken(existingtokenhandle: HANDLE, flags: UInt, sidstodisable: Long, privilegestodelete: Long, restrictedsids: Long, newtokenhandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtFilterToken", longArrayOf(existingtokenhandle, flags.toLong(), sidstodisable, privilegestodelete, restrictedsids, newtokenhandle)).toInt()
}

public fun NtFlushBuffersFile(filehandle: HANDLE, iostatusblock: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtFlushBuffersFile", longArrayOf(filehandle, iostatusblock)).toInt()
}

public fun NtFlushBuffersFileEx(filehandle: HANDLE, flags: UInt, parameters: Long, parameterssize: UInt, iostatusblock: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtFlushBuffersFileEx", longArrayOf(filehandle, flags.toLong(), parameters, parameterssize.toLong(), iostatusblock)).toInt()
}

public fun NtFlushVirtualMemory(processhandle: HANDLE, baseaddress: Long, regionsize: Long, iostatus: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtFlushVirtualMemory", longArrayOf(processhandle, baseaddress, regionsize, iostatus)).toInt()
}

public fun NtFreeVirtualMemory(processhandle: HANDLE, baseaddress: Long, regionsize: Long, freetype: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtFreeVirtualMemory", longArrayOf(processhandle, baseaddress, regionsize, freetype.toLong())).toInt()
}

public fun NtFsControlFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, fscontrolcode: UInt, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtFsControlFile", longArrayOf(filehandle, event, Win32DynamicFfi.objectSlot(apcroutine), apccontext, iostatusblock, fscontrolcode.toLong(), inputbuffer, inputbufferlength.toLong(), outputbuffer, outputbufferlength.toLong())).toInt()
}

public fun NtImpersonateAnonymousToken(threadhandle: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtImpersonateAnonymousToken", longArrayOf(threadhandle)).toInt()
}

public fun NtLockFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, byteoffset: Long, length: Long, key: UInt, failimmediately: Boolean, exclusivelock: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtLockFile", longArrayOf(filehandle, event, Win32DynamicFfi.objectSlot(apcroutine), apccontext, iostatusblock, byteoffset, length, key.toLong(), if (failimmediately) 1L else 0L, if (exclusivelock) 1L else 0L)).toInt()
}

public fun NtNotifyChangeKey(keyhandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, completionfilter: UInt, watchtree: Boolean, buffer: Long, buffersize: UInt, asynchronous: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtNotifyChangeKey", longArrayOf(keyhandle, event, Win32DynamicFfi.objectSlot(apcroutine), apccontext, iostatusblock, completionfilter.toLong(), if (watchtree) 1L else 0L, buffer, buffersize.toLong(), if (asynchronous) 1L else 0L)).toInt()
}

public fun NtOpenDirectoryObject(directoryhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtOpenDirectoryObject", longArrayOf(directoryhandle, desiredaccess.toLong(), objectattributes)).toInt()
}

public fun NtOpenFile(filehandle: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, shareaccess: UInt, openoptions: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtOpenFile", longArrayOf(filehandle, desiredaccess.toLong(), objectattributes, iostatusblock, shareaccess.toLong(), openoptions.toLong())).toInt()
}

public fun NtOpenObjectAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, clienttoken: HANDLE, desiredaccess: UInt, grantedaccess: UInt, privileges: Long, objectcreation: Boolean, accessgranted: Boolean, generateonclose: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtOpenObjectAuditAlarm", longArrayOf(subsystemname, handleid, objecttypename, objectname, securitydescriptor, clienttoken, desiredaccess.toLong(), grantedaccess.toLong(), privileges, if (objectcreation) 1L else 0L, if (accessgranted) 1L else 0L, generateonclose)).toInt()
}

public fun NtOpenProcessToken(processhandle: HANDLE, desiredaccess: UInt, tokenhandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtOpenProcessToken", longArrayOf(processhandle, desiredaccess.toLong(), tokenhandle)).toInt()
}

public fun NtOpenProcessTokenEx(processhandle: HANDLE, desiredaccess: UInt, handleattributes: UInt, tokenhandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtOpenProcessTokenEx", longArrayOf(processhandle, desiredaccess.toLong(), handleattributes.toLong(), tokenhandle)).toInt()
}

public fun NtOpenSymbolicLinkObject(linkhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtOpenSymbolicLinkObject", longArrayOf(linkhandle, desiredaccess.toLong(), objectattributes)).toInt()
}

public fun NtOpenThreadToken(threadhandle: HANDLE, desiredaccess: UInt, openasself: Boolean, tokenhandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtOpenThreadToken", longArrayOf(threadhandle, desiredaccess.toLong(), if (openasself) 1L else 0L, tokenhandle)).toInt()
}

public fun NtOpenThreadTokenEx(threadhandle: HANDLE, desiredaccess: UInt, openasself: Boolean, handleattributes: UInt, tokenhandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtOpenThreadTokenEx", longArrayOf(threadhandle, desiredaccess.toLong(), if (openasself) 1L else 0L, handleattributes.toLong(), tokenhandle)).toInt()
}

public fun NtPrivilegeCheck(clienttoken: HANDLE, requiredprivileges: Long, result: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtPrivilegeCheck", longArrayOf(clienttoken, requiredprivileges, result)).toInt()
}

public fun NtPrivilegeObjectAuditAlarm(subsystemname: Long, handleid: Long, clienttoken: HANDLE, desiredaccess: UInt, privileges: Long, accessgranted: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtPrivilegeObjectAuditAlarm", longArrayOf(subsystemname, handleid, clienttoken, desiredaccess.toLong(), privileges, if (accessgranted) 1L else 0L)).toInt()
}

public fun NtPrivilegedServiceAuditAlarm(subsystemname: Long, servicename: Long, clienttoken: HANDLE, privileges: Long, accessgranted: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtPrivilegedServiceAuditAlarm", longArrayOf(subsystemname, servicename, clienttoken, privileges, if (accessgranted) 1L else 0L)).toInt()
}

public fun NtQueryDirectoryFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, returnsingleentry: Boolean, filename: Long, restartscan: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtQueryDirectoryFile", longArrayOf(filehandle, event, Win32DynamicFfi.objectSlot(apcroutine), apccontext, iostatusblock, fileinformation, length.toLong(), fileinformationclass.toLong(), if (returnsingleentry) 1L else 0L, filename, if (restartscan) 1L else 0L)).toInt()
}

public fun NtQueryDirectoryFileEx(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, queryflags: UInt, filename: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtQueryDirectoryFileEx", longArrayOf(filehandle, event, Win32DynamicFfi.objectSlot(apcroutine), apccontext, iostatusblock, fileinformation, length.toLong(), fileinformationclass.toLong(), queryflags.toLong(), filename)).toInt()
}

public fun NtQueryDirectoryObject(directoryhandle: HANDLE, buffer: Long, length: UInt, returnsingleentry: Boolean, restartscan: Boolean, context: Long, returnlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtQueryDirectoryObject", longArrayOf(directoryhandle, buffer, length.toLong(), if (returnsingleentry) 1L else 0L, if (restartscan) 1L else 0L, context, returnlength)).toInt()
}

public fun NtQueryEaFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt, returnsingleentry: Boolean, ealist: Long, ealistlength: UInt, eaindex: Long, restartscan: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtQueryEaFile", longArrayOf(filehandle, iostatusblock, buffer, length.toLong(), if (returnsingleentry) 1L else 0L, ealist, ealistlength.toLong(), eaindex, if (restartscan) 1L else 0L)).toInt()
}

public fun NtQueryFullAttributesFile(objectattributes: Long, fileinformation: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtQueryFullAttributesFile", longArrayOf(objectattributes, fileinformation)).toInt()
}

public fun NtQueryInformationByName(objectattributes: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtQueryInformationByName", longArrayOf(objectattributes, iostatusblock, fileinformation, length.toLong(), fileinformationclass.toLong())).toInt()
}

public fun NtQueryInformationFile(filehandle: HANDLE, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtQueryInformationFile", longArrayOf(filehandle, iostatusblock, fileinformation, length.toLong(), fileinformationclass.toLong())).toInt()
}

public fun NtQueryInformationToken(tokenhandle: HANDLE, tokeninformationclass: TOKEN_INFORMATION_CLASS, tokeninformation: Long, tokeninformationlength: UInt, returnlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtQueryInformationToken", longArrayOf(tokenhandle, tokeninformationclass.toLong(), tokeninformation, tokeninformationlength.toLong(), returnlength)).toInt()
}

public fun NtQueryQuotaInformationFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt, returnsingleentry: Boolean, sidlist: Long, sidlistlength: UInt, startsid: PSID, restartscan: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtQueryQuotaInformationFile", longArrayOf(filehandle, iostatusblock, buffer, length.toLong(), if (returnsingleentry) 1L else 0L, sidlist, sidlistlength.toLong(), startsid, if (restartscan) 1L else 0L)).toInt()
}

public fun NtQuerySecurityObject(handle: HANDLE, securityinformation: UInt, securitydescriptor: PSECURITY_DESCRIPTOR, length: UInt, lengthneeded: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtQuerySecurityObject", longArrayOf(handle, securityinformation.toLong(), securitydescriptor, length.toLong(), lengthneeded)).toInt()
}

public fun NtQuerySymbolicLinkObject(linkhandle: HANDLE, linktarget: Long, returnedlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtQuerySymbolicLinkObject", longArrayOf(linkhandle, linktarget, returnedlength)).toInt()
}

public fun NtQueryVirtualMemory(processhandle: HANDLE, baseaddress: Long, memoryinformationclass: MEMORY_INFORMATION_CLASS, memoryinformation: Long, memoryinformationlength: ULong, returnlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtQueryVirtualMemory", longArrayOf(processhandle, baseaddress, memoryinformationclass.toLong(), memoryinformation, memoryinformationlength.toLong(), returnlength)).toInt()
}

public fun NtQueryVolumeInformationFile(filehandle: HANDLE, iostatusblock: Long, fsinformation: Long, length: UInt, fsinformationclass: FS_INFORMATION_CLASS): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtQueryVolumeInformationFile", longArrayOf(filehandle, iostatusblock, fsinformation, length.toLong(), fsinformationclass.toLong())).toInt()
}

public fun NtReadFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, buffer: Long, length: UInt, byteoffset: Long, key: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtReadFile", longArrayOf(filehandle, event, Win32DynamicFfi.objectSlot(apcroutine), apccontext, iostatusblock, buffer, length.toLong(), byteoffset, key)).toInt()
}

public fun NtSetEaFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtSetEaFile", longArrayOf(filehandle, iostatusblock, buffer, length.toLong())).toInt()
}

public fun NtSetEvent(eventhandle: HANDLE, previousstate: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtSetEvent", longArrayOf(eventhandle, previousstate)).toInt()
}

public fun NtSetInformationFile(filehandle: HANDLE, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtSetInformationFile", longArrayOf(filehandle, iostatusblock, fileinformation, length.toLong(), fileinformationclass.toLong())).toInt()
}

public fun NtSetInformationToken(tokenhandle: HANDLE, tokeninformationclass: TOKEN_INFORMATION_CLASS, tokeninformation: Long, tokeninformationlength: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtSetInformationToken", longArrayOf(tokenhandle, tokeninformationclass.toLong(), tokeninformation, tokeninformationlength.toLong())).toInt()
}

public fun NtSetInformationVirtualMemory(processhandle: HANDLE, vminformationclass: VIRTUAL_MEMORY_INFORMATION_CLASS, numberofentries: ULong, virtualaddresses: Long, vminformation: Long, vminformationlength: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtSetInformationVirtualMemory", longArrayOf(processhandle, vminformationclass.toLong(), numberofentries.toLong(), virtualaddresses, vminformation, vminformationlength.toLong())).toInt()
}

public fun NtSetQuotaInformationFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtSetQuotaInformationFile", longArrayOf(filehandle, iostatusblock, buffer, length.toLong())).toInt()
}

public fun NtSetSecurityObject(handle: HANDLE, securityinformation: UInt, securitydescriptor: PSECURITY_DESCRIPTOR): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtSetSecurityObject", longArrayOf(handle, securityinformation.toLong(), securitydescriptor)).toInt()
}

public fun NtSetVolumeInformationFile(filehandle: HANDLE, iostatusblock: Long, fsinformation: Long, length: UInt, fsinformationclass: FS_INFORMATION_CLASS): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtSetVolumeInformationFile", longArrayOf(filehandle, iostatusblock, fsinformation, length.toLong(), fsinformationclass.toLong())).toInt()
}

public fun NtUnlockFile(filehandle: HANDLE, iostatusblock: Long, byteoffset: Long, length: Long, key: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtUnlockFile", longArrayOf(filehandle, iostatusblock, byteoffset, length, key.toLong())).toInt()
}

public fun NtWriteFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, buffer: Long, length: UInt, byteoffset: Long, key: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtWriteFile", longArrayOf(filehandle, event, Win32DynamicFfi.objectSlot(apcroutine), apccontext, iostatusblock, buffer, length.toLong(), byteoffset, key)).toInt()
}

public fun ObInsertObject(obj: Long, passedaccessstate: Long, desiredaccess: UInt, objectpointerbias: UInt, newobject: Long, handle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ObInsertObject", longArrayOf(obj, passedaccessstate, desiredaccess.toLong(), objectpointerbias.toLong(), newobject, handle)).toInt()
}

public fun ObIsKernelHandle(handle: HANDLE): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "ObIsKernelHandle", longArrayOf(handle))
    return (rawRet and 0xFFL) != 0L
}

public fun ObMakeTemporaryObject(obj: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "ObMakeTemporaryObject", longArrayOf(obj))
}

public fun ObOpenObjectByPointer(obj: Long, handleattributes: UInt, passedaccessstate: Long, desiredaccess: UInt, objecttype: POBJECT_TYPE, accessmode: Byte, handle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ObOpenObjectByPointer", longArrayOf(obj, handleattributes.toLong(), passedaccessstate, desiredaccess.toLong(), objecttype, accessmode.toLong(), handle)).toInt()
}

public fun ObOpenObjectByPointerWithTag(obj: Long, handleattributes: UInt, passedaccessstate: Long, desiredaccess: UInt, objecttype: POBJECT_TYPE, accessmode: Byte, tag: UInt, handle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ObOpenObjectByPointerWithTag", longArrayOf(obj, handleattributes.toLong(), passedaccessstate, desiredaccess.toLong(), objecttype, accessmode.toLong(), tag.toLong(), handle)).toInt()
}

public fun ObQueryNameString(obj: Long, objectnameinfo: Long, length: UInt, returnlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ObQueryNameString", longArrayOf(obj, objectnameinfo, length.toLong(), returnlength)).toInt()
}

public fun ObQueryObjectAuditingByHandle(handle: HANDLE, generateonclose: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "ObQueryObjectAuditingByHandle", longArrayOf(handle, generateonclose)).toInt()
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

public fun PoQueueShutdownWorkItem(workitem: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PoQueueShutdownWorkItem", longArrayOf(workitem)).toInt()
}

public fun PsAssignImpersonationToken(thread: PETHREAD, token: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsAssignImpersonationToken", longArrayOf(thread, token)).toInt()
}

public fun PsChargePoolQuota(process: PEPROCESS, pooltype: POOL_TYPE, amount: ULong) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PsChargePoolQuota", longArrayOf(process, pooltype.toLong(), amount.toLong()))
}

public fun PsChargeProcessPoolQuota(process: PEPROCESS, pooltype: POOL_TYPE, amount: ULong): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsChargeProcessPoolQuota", longArrayOf(process, pooltype.toLong(), amount.toLong())).toInt()
}

public fun PsDereferenceImpersonationToken(impersonationtoken: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PsDereferenceImpersonationToken", longArrayOf(impersonationtoken))
}

public fun PsDereferencePrimaryToken(primarytoken: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PsDereferencePrimaryToken", longArrayOf(primarytoken))
}

public fun PsDisableImpersonation(thread: PETHREAD, impersonationstate: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "PsDisableImpersonation", longArrayOf(thread, impersonationstate))
    return (rawRet and 0xFFL) != 0L
}

public fun PsGetProcessExitTime(): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsGetProcessExitTime", longArrayOf())
}

public fun PsGetThreadProcess(thread: PETHREAD): PEPROCESS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsGetThreadProcess", longArrayOf(thread))
}

public fun PsImpersonateClient(thread: PETHREAD, token: Long, copyonopen: Boolean, effectiveonly: Boolean, impersonationlevel: SECURITY_IMPERSONATION_LEVEL): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsImpersonateClient", longArrayOf(thread, token, if (copyonopen) 1L else 0L, if (effectiveonly) 1L else 0L, impersonationlevel.toLong())).toInt()
}

public fun PsIsDiskCountersEnabled(): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "PsIsDiskCountersEnabled", longArrayOf())
    return (rawRet and 0xFFL) != 0L
}

public fun PsIsSystemThread(thread: PETHREAD): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "PsIsSystemThread", longArrayOf(thread))
    return (rawRet and 0xFFL) != 0L
}

public fun PsIsThreadTerminating(thread: PETHREAD): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "PsIsThreadTerminating", longArrayOf(thread))
    return (rawRet and 0xFFL) != 0L
}

public fun PsLookupProcessByProcessId(processid: HANDLE, process: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsLookupProcessByProcessId", longArrayOf(processid, process)).toInt()
}

public fun PsLookupThreadByThreadId(threadid: HANDLE, thread: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsLookupThreadByThreadId", longArrayOf(threadid, thread)).toInt()
}

public fun PsReferenceImpersonationToken(thread: PETHREAD, copyonopen: Long, effectiveonly: Long, impersonationlevel: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsReferenceImpersonationToken", longArrayOf(thread, copyonopen, effectiveonly, impersonationlevel))
}

public fun PsReferencePrimaryToken(process: PEPROCESS): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "PsReferencePrimaryToken", longArrayOf(process))
}

public fun PsRestoreImpersonation(thread: PETHREAD, impersonationstate: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PsRestoreImpersonation", longArrayOf(thread, impersonationstate))
}

public fun PsReturnPoolQuota(process: PEPROCESS, pooltype: POOL_TYPE, amount: ULong) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PsReturnPoolQuota", longArrayOf(process, pooltype.toLong(), amount.toLong()))
}

public fun PsRevertToSelf() {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PsRevertToSelf", longArrayOf())
}

public fun PsUpdateDiskCounters(process: PEPROCESS, bytesread: ULong, byteswritten: ULong, readoperationcount: UInt, writeoperationcount: UInt, flushoperationcount: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "PsUpdateDiskCounters", longArrayOf(process, bytesread.toLong(), byteswritten.toLong(), readoperationcount.toLong(), writeoperationcount.toLong(), flushoperationcount.toLong()))
}

public fun QuerySecurityContextToken(phcontext: Long, token: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "QuerySecurityContextToken", longArrayOf(phcontext, token)).toInt()
}

public fun RtlAbsoluteToSelfRelativeSD(absolutesecuritydescriptor: PSECURITY_DESCRIPTOR, selfrelativesecuritydescriptor: PSECURITY_DESCRIPTOR, bufferlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlAbsoluteToSelfRelativeSD", longArrayOf(absolutesecuritydescriptor, selfrelativesecuritydescriptor, bufferlength)).toInt()
}

public fun RtlAddAccessAllowedAce(acl: Long, acerevision: UInt, accessmask: UInt, sid: PSID): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlAddAccessAllowedAce", longArrayOf(acl, acerevision.toLong(), accessmask.toLong(), sid)).toInt()
}

public fun RtlAddAccessAllowedAceEx(acl: Long, acerevision: UInt, aceflags: UInt, accessmask: UInt, sid: PSID): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlAddAccessAllowedAceEx", longArrayOf(acl, acerevision.toLong(), aceflags.toLong(), accessmask.toLong(), sid)).toInt()
}

public fun RtlAddAce(acl: Long, acerevision: UInt, startingaceindex: UInt, acelist: Long, acelistlength: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlAddAce", longArrayOf(acl, acerevision.toLong(), startingaceindex.toLong(), acelist, acelistlength.toLong())).toInt()
}

public fun RtlAllocateAndInitializeSid(identifierauthority: Long, subauthoritycount: UByte, subauthority0: UInt, subauthority1: UInt, subauthority2: UInt, subauthority3: UInt, subauthority4: UInt, subauthority5: UInt, subauthority6: UInt, subauthority7: UInt, sid: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlAllocateAndInitializeSid", longArrayOf(identifierauthority, subauthoritycount.toLong(), subauthority0.toLong(), subauthority1.toLong(), subauthority2.toLong(), subauthority3.toLong(), subauthority4.toLong(), subauthority5.toLong(), subauthority6.toLong(), subauthority7.toLong(), sid)).toInt()
}

public fun RtlAllocateAndInitializeSidEx(identifierauthority: Long, subauthoritycount: UByte, subauthorities: Long, sid: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlAllocateAndInitializeSidEx", longArrayOf(identifierauthority, subauthoritycount.toLong(), subauthorities, sid)).toInt()
}

public fun RtlAllocateHeap(heaphandle: Long, flags: UInt, size: ULong): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlAllocateHeap", longArrayOf(heaphandle, flags.toLong(), size.toLong()))
}

public fun RtlAppendStringToString(destination: Long, source: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlAppendStringToString", longArrayOf(destination, source)).toInt()
}

public fun RtlCompareAltitudes(altitude1: Long, altitude2: Long): Int {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlCompareAltitudes", longArrayOf(altitude1, altitude2)).toInt()
}

public fun RtlCompareMemoryUlong(source: Long, length: ULong, pattern: UInt): ULong {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlCompareMemoryUlong", longArrayOf(source, length.toLong(), pattern.toLong())).toULong()
}

public fun RtlCompressBuffer(compressionformatandengine: UShort, uncompressedbuffer: Long, uncompressedbuffersize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, uncompressedchunksize: UInt, finalcompressedsize: Long, workspace: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlCompressBuffer", longArrayOf(compressionformatandengine.toLong(), uncompressedbuffer, uncompressedbuffersize.toLong(), compressedbuffer, compressedbuffersize.toLong(), uncompressedchunksize.toLong(), finalcompressedsize, workspace)).toInt()
}

public fun RtlCompressChunks(uncompressedbuffer: Long, uncompressedbuffersize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, compresseddatainfo: Long, compresseddatainfolength: UInt, workspace: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "RtlCompressChunks", longArrayOf(uncompressedbuffer, uncompressedbuffersize.toLong(), compressedbuffer, compressedbuffersize.toLong(), compresseddatainfo, compresseddatainfolength.toLong(), workspace)).toInt()
}

public fun RtlCopyLuid(destinationluid: Long, sourceluid: Long) {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlCopyLuid", longArrayOf(destinationluid, sourceluid))
}

public fun RtlCopySid(destinationsidlength: UInt, destinationsid: PSID, sourcesid: PSID): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlCopySid", longArrayOf(destinationsidlength.toLong(), destinationsid, sourcesid)).toInt()
}

public fun RtlCreateAcl(acl: Long, acllength: UInt, aclrevision: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlCreateAcl", longArrayOf(acl, acllength.toLong(), aclrevision.toLong())).toInt()
}

public fun RtlCreateHeap(flags: UInt, heapbase: Long, reservesize: ULong, commitsize: ULong, lock: Long, parameters: Long): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlCreateHeap", longArrayOf(flags.toLong(), heapbase, reservesize.toLong(), commitsize.toLong(), lock, parameters))
}

public fun RtlCreateServiceSid(servicename: Long, servicesid: PSID, servicesidlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlCreateServiceSid", longArrayOf(servicename, servicesid, servicesidlength)).toInt()
}

public fun RtlCreateSystemVolumeInformationFolder(volumerootpath: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlCreateSystemVolumeInformationFolder", longArrayOf(volumerootpath)).toInt()
}

public fun RtlCreateUnicodeString(destinationstring: Long, sourcestring: PCWSTR): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlCreateUnicodeString", longArrayOf(destinationstring, sourcestring))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlCreateVirtualAccountSid(name: Long, basesubauthority: UInt, sid: PSID, sidlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlCreateVirtualAccountSid", longArrayOf(name, basesubauthority.toLong(), sid, sidlength)).toInt()
}

public fun RtlCustomCPToUnicodeN(customcp: Long, unicodestring: PWSTR, maxbytesinunicodestring: UInt, bytesinunicodestring: Long, customcpstring: PCSTR, bytesincustomcpstring: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlCustomCPToUnicodeN", longArrayOf(customcp, unicodestring, maxbytesinunicodestring.toLong(), bytesinunicodestring, customcpstring, bytesincustomcpstring.toLong())).toInt()
}

public fun RtlDecompressBuffer(compressionformat: UShort, uncompressedbuffer: Long, uncompressedbuffersize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, finaluncompressedsize: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlDecompressBuffer", longArrayOf(compressionformat.toLong(), uncompressedbuffer, uncompressedbuffersize.toLong(), compressedbuffer, compressedbuffersize.toLong(), finaluncompressedsize)).toInt()
}

public fun RtlDecompressBufferEx(compressionformat: UShort, uncompressedbuffer: Long, uncompressedbuffersize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, finaluncompressedsize: Long, workspace: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlDecompressBufferEx", longArrayOf(compressionformat.toLong(), uncompressedbuffer, uncompressedbuffersize.toLong(), compressedbuffer, compressedbuffersize.toLong(), finaluncompressedsize, workspace)).toInt()
}

public fun RtlDecompressBufferEx2(compressionformat: UShort, uncompressedbuffer: Long, uncompressedbuffersize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, uncompressedchunksize: UInt, finaluncompressedsize: Long, workspace: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "RtlDecompressBufferEx2", longArrayOf(compressionformat.toLong(), uncompressedbuffer, uncompressedbuffersize.toLong(), compressedbuffer, compressedbuffersize.toLong(), uncompressedchunksize.toLong(), finaluncompressedsize, workspace)).toInt()
}

public fun RtlDecompressChunks(uncompressedbuffer: Long, uncompressedbuffersize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, compressedtail: Long, compressedtailsize: UInt, compresseddatainfo: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "RtlDecompressChunks", longArrayOf(uncompressedbuffer, uncompressedbuffersize.toLong(), compressedbuffer, compressedbuffersize.toLong(), compressedtail, compressedtailsize.toLong(), compresseddatainfo)).toInt()
}

public fun RtlDecompressFragment(compressionformat: UShort, uncompressedfragment: Long, uncompressedfragmentsize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, fragmentoffset: UInt, finaluncompressedsize: Long, workspace: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlDecompressFragment", longArrayOf(compressionformat.toLong(), uncompressedfragment, uncompressedfragmentsize.toLong(), compressedbuffer, compressedbuffersize.toLong(), fragmentoffset.toLong(), finaluncompressedsize, workspace)).toInt()
}

public fun RtlDecompressFragmentEx(compressionformat: UShort, uncompressedfragment: Long, uncompressedfragmentsize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, fragmentoffset: UInt, uncompressedchunksize: UInt, finaluncompressedsize: Long, workspace: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "RtlDecompressFragmentEx", longArrayOf(compressionformat.toLong(), uncompressedfragment, uncompressedfragmentsize.toLong(), compressedbuffer, compressedbuffersize.toLong(), fragmentoffset.toLong(), uncompressedchunksize.toLong(), finaluncompressedsize, workspace)).toInt()
}

public fun RtlDeleteAce(acl: Long, aceindex: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlDeleteAce", longArrayOf(acl, aceindex.toLong())).toInt()
}

public fun RtlDescribeChunk(compressionformat: UShort, compressedbuffer: Long, endofcompressedbufferplus1: Long, chunkbuffer: Long, chunksize: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "RtlDescribeChunk", longArrayOf(compressionformat.toLong(), compressedbuffer, endofcompressedbufferplus1, chunkbuffer, chunksize)).toInt()
}

public fun RtlDestroyHeap(heaphandle: Long): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlDestroyHeap", longArrayOf(heaphandle))
}

public fun RtlDosPathNameToNtPathName_U_WithStatus(dosfilename: PCWSTR, ntfilename: Long, filepart: Long, reserved: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlDosPathNameToNtPathName_U_WithStatus", longArrayOf(dosfilename, ntfilename, filepart, reserved)).toInt()
}

public fun RtlDowncaseUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlDowncaseUnicodeString", longArrayOf(destinationstring, sourcestring, if (allocatedestinationstring) 1L else 0L)).toInt()
}

public fun RtlDuplicateUnicodeString(flags: UInt, stringin: Long, stringout: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlDuplicateUnicodeString", longArrayOf(flags.toLong(), stringin, stringout)).toInt()
}

public fun RtlEqualPrefixSid(sid1: PSID, sid2: PSID): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlEqualPrefixSid", longArrayOf(sid1, sid2))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlEqualSid(sid1: PSID, sid2: PSID): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlEqualSid", longArrayOf(sid1, sid2))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlFindUnicodePrefix(prefixtable: Long, fullname: Long, caseinsensitiveindex: UInt): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "RtlFindUnicodePrefix", longArrayOf(prefixtable, fullname, caseinsensitiveindex.toLong()))
}

public fun RtlFreeHeap(heaphandle: Long, flags: UInt, baseaddress: Long): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlFreeHeap", longArrayOf(heaphandle, flags.toLong(), baseaddress)).toUInt()
}

public fun RtlFreeSid(sid: PSID): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlFreeSid", longArrayOf(sid))
}

public fun RtlGenerate8dot3Name(name: Long, allowextendedcharacters: Boolean, context: Long, name8dot3: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlGenerate8dot3Name", longArrayOf(name, if (allowextendedcharacters) 1L else 0L, context, name8dot3)).toInt()
}

public fun RtlGetAce(acl: Long, aceindex: UInt, ace: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlGetAce", longArrayOf(acl, aceindex.toLong(), ace)).toInt()
}

public fun RtlGetCompressionWorkSpaceSize(compressionformatandengine: UShort, compressbufferworkspacesize: Long, compressfragmentworkspacesize: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlGetCompressionWorkSpaceSize", longArrayOf(compressionformatandengine.toLong(), compressbufferworkspacesize, compressfragmentworkspacesize)).toInt()
}

public fun RtlGetDaclSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, daclpresent: Long, dacl: Long, dacldefaulted: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlGetDaclSecurityDescriptor", longArrayOf(securitydescriptor, daclpresent, dacl, dacldefaulted)).toInt()
}

public fun RtlGetGroupSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, group: Long, groupdefaulted: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlGetGroupSecurityDescriptor", longArrayOf(securitydescriptor, group, groupdefaulted)).toInt()
}

public fun RtlGetOwnerSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, owner: Long, ownerdefaulted: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlGetOwnerSecurityDescriptor", longArrayOf(securitydescriptor, owner, ownerdefaulted)).toInt()
}

public fun RtlGetSaclSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, saclpresent: Long, sacl: Long, sacldefaulted: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlGetSaclSecurityDescriptor", longArrayOf(securitydescriptor, saclpresent, sacl, sacldefaulted)).toInt()
}

public fun RtlIdentifierAuthoritySid(sid: PSID): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlIdentifierAuthoritySid", longArrayOf(sid))
}

public fun RtlIdnToAscii(flags: UInt, sourcestring: PCWSTR, sourcestringlength: Int, destinationstring: PWSTR, destinationstringlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlIdnToAscii", longArrayOf(flags.toLong(), sourcestring, sourcestringlength.toLong(), destinationstring, destinationstringlength)).toInt()
}

public fun RtlIdnToNameprepUnicode(flags: UInt, sourcestring: PCWSTR, sourcestringlength: Int, destinationstring: PWSTR, destinationstringlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlIdnToNameprepUnicode", longArrayOf(flags.toLong(), sourcestring, sourcestringlength.toLong(), destinationstring, destinationstringlength)).toInt()
}

public fun RtlIdnToUnicode(flags: UInt, sourcestring: PCWSTR, sourcestringlength: Int, destinationstring: PWSTR, destinationstringlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlIdnToUnicode", longArrayOf(flags.toLong(), sourcestring, sourcestringlength.toLong(), destinationstring, destinationstringlength)).toInt()
}

public fun RtlInitCodePageTable(tablebase: Long, codepagetable: Long) {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlInitCodePageTable", longArrayOf(tablebase, codepagetable))
}

public fun RtlInitUnicodeStringEx(destinationstring: Long, sourcestring: PCWSTR): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlInitUnicodeStringEx", longArrayOf(destinationstring, sourcestring)).toInt()
}

public fun RtlInitializeSid(sid: PSID, identifierauthority: Long, subauthoritycount: UByte): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlInitializeSid", longArrayOf(sid, identifierauthority, subauthoritycount.toLong())).toInt()
}

public fun RtlInitializeSidEx(sid: PSID, identifierauthority: Long, subauthoritycount: UByte, vararg variadicArgs: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlInitializeSidEx", longArrayOf(sid, identifierauthority, subauthoritycount.toLong()) + variadicArgs).toInt()
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

public fun RtlIsNormalizedString(normform: UInt, sourcestring: PCWSTR, sourcestringlength: Int, normalized: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlIsNormalizedString", longArrayOf(normform.toLong(), sourcestring, sourcestringlength.toLong(), normalized)).toInt()
}

public fun RtlIsPartialPlaceholder(fileattributes: UInt, reparsetag: UInt): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlIsPartialPlaceholder", longArrayOf(fileattributes.toLong(), reparsetag.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlIsPartialPlaceholderFileHandle(filehandle: HANDLE, ispartialplaceholder: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlIsPartialPlaceholderFileHandle", longArrayOf(filehandle, ispartialplaceholder)).toInt()
}

public fun RtlIsPartialPlaceholderFileInfo(infobuffer: Long, infoclass: FILE_INFORMATION_CLASS, ispartialplaceholder: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlIsPartialPlaceholderFileInfo", longArrayOf(infobuffer, infoclass.toLong(), ispartialplaceholder)).toInt()
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

public fun RtlLengthSid(sid: PSID): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlLengthSid", longArrayOf(sid)).toUInt()
}

public fun RtlMultiByteToUnicodeN(unicodestring: PWSTR, maxbytesinunicodestring: UInt, bytesinunicodestring: Long, multibytestring: PCSTR, bytesinmultibytestring: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlMultiByteToUnicodeN", longArrayOf(unicodestring, maxbytesinunicodestring.toLong(), bytesinunicodestring, multibytestring, bytesinmultibytestring.toLong())).toInt()
}

public fun RtlMultiByteToUnicodeSize(bytesinunicodestring: Long, multibytestring: PCSTR, bytesinmultibytestring: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlMultiByteToUnicodeSize", longArrayOf(bytesinunicodestring, multibytestring, bytesinmultibytestring.toLong())).toInt()
}

public fun RtlNextUnicodePrefix(prefixtable: Long, restart: Boolean): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "RtlNextUnicodePrefix", longArrayOf(prefixtable, if (restart) 1L else 0L))
}

public fun RtlNormalizeString(normform: UInt, sourcestring: PCWSTR, sourcestringlength: Int, destinationstring: PWSTR, destinationstringlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlNormalizeString", longArrayOf(normform.toLong(), sourcestring, sourcestringlength.toLong(), destinationstring, destinationstringlength)).toInt()
}
