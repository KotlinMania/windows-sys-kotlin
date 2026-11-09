@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun ApplyControlToken(phcontext: Long, pinput: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ApplyControlToken(phcontext.toCPointer<ByteVar>(), pinput.toCPointer<ByteVar>())

public actual fun CcAsyncCopyRead(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, buffer: Long, iostatus: Long, ioissuerthread: PETHREAD, asyncreadcontext: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcAsyncCopyRead(fileobject.toCPointer<ByteVar>(), fileoffset.toCPointer<ByteVar>(), length, wait, buffer.toCPointer<ByteVar>(), iostatus.toCPointer<ByteVar>(), ioissuerthread, asyncreadcontext.toCPointer<ByteVar>())

public actual fun CcCanIWrite(fileobject: Long, bytestowrite: UInt, wait: Boolean, retrying: UByte): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcCanIWrite(fileobject.toCPointer<ByteVar>(), bytestowrite, wait, retrying)

public actual fun CcCoherencyFlushAndPurgeCache(sectionobjectpointer: Long, fileoffset: Long, length: UInt, iostatus: Long, flags: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcCoherencyFlushAndPurgeCache(sectionobjectpointer.toCPointer<ByteVar>(), fileoffset.toCPointer<ByteVar>(), length, iostatus.toCPointer<ByteVar>(), flags)
}

public actual fun CcCopyRead(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, buffer: Long, iostatus: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcCopyRead(fileobject.toCPointer<ByteVar>(), fileoffset.toCPointer<ByteVar>(), length, wait, buffer.toCPointer<ByteVar>(), iostatus.toCPointer<ByteVar>())

public actual fun CcCopyReadEx(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, buffer: Long, iostatus: Long, ioissuerthread: PETHREAD): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcCopyReadEx(fileobject.toCPointer<ByteVar>(), fileoffset.toCPointer<ByteVar>(), length, wait, buffer.toCPointer<ByteVar>(), iostatus.toCPointer<ByteVar>(), ioissuerthread)

public actual fun CcCopyWrite(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, buffer: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcCopyWrite(fileobject.toCPointer<ByteVar>(), fileoffset.toCPointer<ByteVar>(), length, wait, buffer.toCPointer<ByteVar>())

public actual fun CcCopyWriteEx(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, buffer: Long, ioissuerthread: PETHREAD): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcCopyWriteEx(fileobject.toCPointer<ByteVar>(), fileoffset.toCPointer<ByteVar>(), length, wait, buffer.toCPointer<ByteVar>(), ioissuerthread)

public actual fun CcCopyWriteWontFlush(fileobject: Long, fileoffset: Long, length: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcCopyWriteWontFlush(fileobject.toCPointer<ByteVar>(), fileoffset.toCPointer<ByteVar>(), length)

public actual fun CcDeferWrite(fileobject: Long, postroutine: PCC_POST_DEFERRED_WRITE, context1: Long, context2: Long, bytestowrite: UInt, retrying: Boolean) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcDeferWrite(fileobject.toCPointer<ByteVar>(), postroutine.toLong().toCPointer<ByteVar>(), context1.toCPointer<ByteVar>(), context2.toCPointer<ByteVar>(), bytestowrite, retrying)
}

public actual fun CcErrorCallbackRoutine(context: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcErrorCallbackRoutine(context.toCPointer<ByteVar>())

public actual fun CcFastCopyRead(fileobject: Long, fileoffset: UInt, length: UInt, pagecount: UInt, buffer: Long, iostatus: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcFastCopyRead(fileobject.toCPointer<ByteVar>(), fileoffset, length, pagecount, buffer.toCPointer<ByteVar>(), iostatus.toCPointer<ByteVar>())
}

public actual fun CcFastCopyWrite(fileobject: Long, fileoffset: UInt, length: UInt, buffer: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcFastCopyWrite(fileobject.toCPointer<ByteVar>(), fileoffset, length, buffer.toCPointer<ByteVar>())
}

public actual fun CcFlushCache(sectionobjectpointer: Long, fileoffset: Long, length: UInt, iostatus: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcFlushCache(sectionobjectpointer.toCPointer<ByteVar>(), fileoffset.toCPointer<ByteVar>(), length, iostatus.toCPointer<ByteVar>())
}

public actual fun CcGetDirtyPages(loghandle: Long, dirtypageroutine: PDIRTY_PAGE_ROUTINE, context1: Long, context2: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcGetDirtyPages(loghandle.toCPointer<ByteVar>(), dirtypageroutine.toLong().toCPointer<ByteVar>(), context1.toCPointer<ByteVar>(), context2.toCPointer<ByteVar>())

public actual fun CcGetFileObjectFromBcb(bcb: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcGetFileObjectFromBcb(bcb.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CcGetFileObjectFromSectionPtrs(sectionobjectpointer: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcGetFileObjectFromSectionPtrs(sectionobjectpointer.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CcGetFileObjectFromSectionPtrsRef(sectionobjectpointer: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcGetFileObjectFromSectionPtrsRef(sectionobjectpointer.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CcGetFlushedValidData(sectionobjectpointer: Long, bcblistheld: Boolean): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcGetFlushedValidData(sectionobjectpointer.toCPointer<ByteVar>(), bcblistheld)

public actual fun CcInitializeCacheMap(fileobject: Long, filesizes: Long, pinaccess: Boolean, callbacks: Long, lazywritecontext: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcInitializeCacheMap(fileobject.toCPointer<ByteVar>(), filesizes.toCPointer<ByteVar>(), pinaccess, callbacks.toCPointer<ByteVar>(), lazywritecontext.toCPointer<ByteVar>())
}

public actual fun CcInitializeCacheMapEx(fileobject: Long, filesizes: Long, pinaccess: Boolean, callbacks: Long, lazywritecontext: Long, flags: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcInitializeCacheMapEx(fileobject.toCPointer<ByteVar>(), filesizes.toCPointer<ByteVar>(), pinaccess, callbacks.toCPointer<ByteVar>(), lazywritecontext.toCPointer<ByteVar>(), flags)
}

public actual fun CcIsCacheManagerCallbackNeeded(status: NTSTATUS): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcIsCacheManagerCallbackNeeded(status)

public actual fun CcIsThereDirtyData(vpb: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcIsThereDirtyData(vpb.toCPointer<ByteVar>())

public actual fun CcIsThereDirtyDataEx(vpb: Long, numberofdirtypages: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcIsThereDirtyDataEx(vpb.toCPointer<ByteVar>(), numberofdirtypages.toCPointer<ByteVar>())

public actual fun CcMapData(fileobject: Long, fileoffset: Long, length: UInt, flags: UInt, bcb: Long, buffer: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcMapData(fileobject.toCPointer<ByteVar>(), fileoffset.toCPointer<ByteVar>(), length, flags, bcb.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>())

public actual fun CcMdlRead(fileobject: Long, fileoffset: Long, length: UInt, mdlchain: Long, iostatus: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcMdlRead(fileobject.toCPointer<ByteVar>(), fileoffset.toCPointer<ByteVar>(), length, mdlchain.toCPointer<ByteVar>(), iostatus.toCPointer<ByteVar>())
}

public actual fun CcMdlReadComplete(fileobject: Long, mdlchain: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcMdlReadComplete(fileobject.toCPointer<ByteVar>(), mdlchain.toCPointer<ByteVar>())
}

public actual fun CcMdlWriteAbort(fileobject: Long, mdlchain: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcMdlWriteAbort(fileobject.toCPointer<ByteVar>(), mdlchain.toCPointer<ByteVar>())
}

public actual fun CcMdlWriteComplete(fileobject: Long, fileoffset: Long, mdlchain: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcMdlWriteComplete(fileobject.toCPointer<ByteVar>(), fileoffset.toCPointer<ByteVar>(), mdlchain.toCPointer<ByteVar>())
}

public actual fun CcPinMappedData(fileobject: Long, fileoffset: Long, length: UInt, flags: UInt, bcb: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcPinMappedData(fileobject.toCPointer<ByteVar>(), fileoffset.toCPointer<ByteVar>(), length, flags, bcb.toCPointer<ByteVar>())

public actual fun CcPinRead(fileobject: Long, fileoffset: Long, length: UInt, flags: UInt, bcb: Long, buffer: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcPinRead(fileobject.toCPointer<ByteVar>(), fileoffset.toCPointer<ByteVar>(), length, flags, bcb.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>())

public actual fun CcPrepareMdlWrite(fileobject: Long, fileoffset: Long, length: UInt, mdlchain: Long, iostatus: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcPrepareMdlWrite(fileobject.toCPointer<ByteVar>(), fileoffset.toCPointer<ByteVar>(), length, mdlchain.toCPointer<ByteVar>(), iostatus.toCPointer<ByteVar>())
}

public actual fun CcPreparePinWrite(fileobject: Long, fileoffset: Long, length: UInt, zero: Boolean, flags: UInt, bcb: Long, buffer: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcPreparePinWrite(fileobject.toCPointer<ByteVar>(), fileoffset.toCPointer<ByteVar>(), length, zero, flags, bcb.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>())

public actual fun CcPurgeCacheSection(sectionobjectpointer: Long, fileoffset: Long, length: UInt, flags: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcPurgeCacheSection(sectionobjectpointer.toCPointer<ByteVar>(), fileoffset.toCPointer<ByteVar>(), length, flags)

public actual fun CcRemapBcb(bcb: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcRemapBcb(bcb.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CcRepinBcb(bcb: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcRepinBcb(bcb.toCPointer<ByteVar>())
}

public actual fun CcScheduleReadAhead(fileobject: Long, fileoffset: Long, length: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcScheduleReadAhead(fileobject.toCPointer<ByteVar>(), fileoffset.toCPointer<ByteVar>(), length)
}

public actual fun CcScheduleReadAheadEx(fileobject: Long, fileoffset: Long, length: UInt, ioissuerthread: PETHREAD) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcScheduleReadAheadEx(fileobject.toCPointer<ByteVar>(), fileoffset.toCPointer<ByteVar>(), length, ioissuerthread)
}

public actual fun CcSetAdditionalCacheAttributes(fileobject: Long, disablereadahead: Boolean, disablewritebehind: Boolean) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcSetAdditionalCacheAttributes(fileobject.toCPointer<ByteVar>(), disablereadahead, disablewritebehind)
}

public actual fun CcSetAdditionalCacheAttributesEx(fileobject: Long, flags: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcSetAdditionalCacheAttributesEx(fileobject.toCPointer<ByteVar>(), flags)
}

public actual fun CcSetBcbOwnerPointer(bcb: Long, ownerpointer: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcSetBcbOwnerPointer(bcb.toCPointer<ByteVar>(), ownerpointer.toCPointer<ByteVar>())
}

public actual fun CcSetDirtyPageThreshold(fileobject: Long, dirtypagethreshold: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcSetDirtyPageThreshold(fileobject.toCPointer<ByteVar>(), dirtypagethreshold)
}

public actual fun CcSetDirtyPinnedData(bcbvoid: Long, lsn: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcSetDirtyPinnedData(bcbvoid.toCPointer<ByteVar>(), lsn.toCPointer<ByteVar>())
}

public actual fun CcSetFileSizes(fileobject: Long, filesizes: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcSetFileSizes(fileobject.toCPointer<ByteVar>(), filesizes.toCPointer<ByteVar>())
}

public actual fun CcSetFileSizesEx(fileobject: Long, filesizes: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcSetFileSizesEx(fileobject.toCPointer<ByteVar>(), filesizes.toCPointer<ByteVar>())

public actual fun CcSetLogHandleForFile(fileobject: Long, loghandle: Long, flushtolsnroutine: PFLUSH_TO_LSN) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcSetLogHandleForFile(fileobject.toCPointer<ByteVar>(), loghandle.toCPointer<ByteVar>(), flushtolsnroutine.toLong().toCPointer<ByteVar>())
}

public actual fun CcSetParallelFlushFile(fileobject: Long, enableparallelflush: Boolean) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcSetParallelFlushFile(fileobject.toCPointer<ByteVar>(), enableparallelflush)
}

public actual fun CcSetReadAheadGranularity(fileobject: Long, granularity: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcSetReadAheadGranularity(fileobject.toCPointer<ByteVar>(), granularity)
}

public actual fun CcUninitializeCacheMap(fileobject: Long, truncatesize: Long, uninitializeevent: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcUninitializeCacheMap(fileobject.toCPointer<ByteVar>(), truncatesize.toCPointer<ByteVar>(), uninitializeevent.toCPointer<ByteVar>())

public actual fun CcUnpinData(bcb: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcUnpinData(bcb.toCPointer<ByteVar>())
}

public actual fun CcUnpinDataForThread(bcb: Long, resourcethreadid: ULong) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcUnpinDataForThread(bcb.toCPointer<ByteVar>(), resourcethreadid)
}

public actual fun CcUnpinRepinnedBcb(bcb: Long, writethrough: Boolean, iostatus: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcUnpinRepinnedBcb(bcb.toCPointer<ByteVar>(), writethrough, iostatus.toCPointer<ByteVar>())
}

public actual fun CcWaitForCurrentLazyWriterActivity(): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcWaitForCurrentLazyWriterActivity()

public actual fun CcZeroData(fileobject: Long, startoffset: Long, endoffset: Long, wait: Boolean): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CcZeroData(fileobject.toCPointer<ByteVar>(), startoffset.toCPointer<ByteVar>(), endoffset.toCPointer<ByteVar>(), wait)

public actual fun CompleteAuthToken(phcontext: Long, ptoken: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_CompleteAuthToken(phcontext.toCPointer<ByteVar>(), ptoken.toCPointer<ByteVar>())

public actual fun ExDisableResourceBoostLite(resource: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ExDisableResourceBoostLite(resource.toCPointer<ByteVar>())
}

public actual fun ExQueryPoolBlockSize(poolblock: Long, quotacharged: Long): ULong =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ExQueryPoolBlockSize(poolblock.toCPointer<ByteVar>(), quotacharged.toCPointer<ByteVar>())

public actual fun ExportSecurityContext(phcontext: Long, fflags: UInt, ppackedcontext: Long, ptoken: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ExportSecurityContext(phcontext.toCPointer<ByteVar>(), fflags, ppackedcontext.toCPointer<ByteVar>(), ptoken.toCPointer<ByteVar>())

public actual fun FsRtlAcknowledgeEcp(ecpcontext: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlAcknowledgeEcp(ecpcontext.toCPointer<ByteVar>())
}

public actual fun FsRtlAcquireFileExclusive(fileobject: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlAcquireFileExclusive(fileobject.toCPointer<ByteVar>())
}

public actual fun FsRtlAddBaseMcbEntry(mcb: Long, vbn: Long, lbn: Long, sectorcount: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlAddBaseMcbEntry(mcb.toCPointer<ByteVar>(), vbn, lbn, sectorcount)

public actual fun FsRtlAddBaseMcbEntryEx(mcb: Long, vbn: Long, lbn: Long, sectorcount: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlAddBaseMcbEntryEx(mcb.toCPointer<ByteVar>(), vbn, lbn, sectorcount)

public actual fun FsRtlAddLargeMcbEntry(mcb: Long, vbn: Long, lbn: Long, sectorcount: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlAddLargeMcbEntry(mcb.toCPointer<ByteVar>(), vbn, lbn, sectorcount)

public actual fun FsRtlAddMcbEntry(mcb: Long, vbn: UInt, lbn: UInt, sectorcount: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlAddMcbEntry(mcb.toCPointer<ByteVar>(), vbn, lbn, sectorcount)

public actual fun FsRtlAddToTunnelCache(cache: Long, directorykey: ULong, shortname: Long, longname: Long, keybyshortname: Boolean, datalength: UInt, data: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlAddToTunnelCache(cache.toCPointer<ByteVar>(), directorykey, shortname.toCPointer<ByteVar>(), longname.toCPointer<ByteVar>(), keybyshortname, datalength, data.toCPointer<ByteVar>())
}

public actual fun FsRtlAddToTunnelCacheEx(cache: Long, directorykey: ULong, shortname: Long, longname: Long, flags: UInt, datalength: UInt, data: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlAddToTunnelCacheEx(cache.toCPointer<ByteVar>(), directorykey, shortname.toCPointer<ByteVar>(), longname.toCPointer<ByteVar>(), flags, datalength, data.toCPointer<ByteVar>())
}

public actual fun FsRtlAllocateAePushLock(pooltype: POOL_TYPE, tag: UInt): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlAllocateAePushLock(pooltype, tag)?.toLong() ?: 0L

public actual fun FsRtlAllocateExtraCreateParameter(ecptype: Long, sizeofcontext: UInt, flags: UInt, cleanupcallback: PFSRTL_EXTRA_CREATE_PARAMETER_CLEANUP_CALLBACK, pooltag: UInt, ecpcontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlAllocateExtraCreateParameter(ecptype.toCPointer<ByteVar>(), sizeofcontext, flags, cleanupcallback.toLong().toCPointer<ByteVar>(), pooltag, ecpcontext.toCPointer<ByteVar>())

public actual fun FsRtlAllocateExtraCreateParameterFromLookasideList(ecptype: Long, sizeofcontext: UInt, flags: UInt, cleanupcallback: PFSRTL_EXTRA_CREATE_PARAMETER_CLEANUP_CALLBACK, lookasidelist: Long, ecpcontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlAllocateExtraCreateParameterFromLookasideList(ecptype.toCPointer<ByteVar>(), sizeofcontext, flags, cleanupcallback.toLong().toCPointer<ByteVar>(), lookasidelist.toCPointer<ByteVar>(), ecpcontext.toCPointer<ByteVar>())

public actual fun FsRtlAllocateExtraCreateParameterList(flags: UInt, ecplist: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlAllocateExtraCreateParameterList(flags, ecplist.toCPointer<ByteVar>())

public actual fun FsRtlAllocateFileLock(completelockirproutine: PCOMPLETE_LOCK_IRP_ROUTINE, unlockroutine: PUNLOCK_ROUTINE): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlAllocateFileLock(completelockirproutine.toLong().toCPointer<ByteVar>(), unlockroutine.toLong().toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun FsRtlAllocateResource(): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlAllocateResource()?.toLong() ?: 0L

public actual fun FsRtlAreNamesEqual(constantnamea: Long, constantnameb: Long, ignorecase: Boolean, upcasetable: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlAreNamesEqual(constantnamea.toCPointer<ByteVar>(), constantnameb.toCPointer<ByteVar>(), ignorecase, upcasetable.toCPointer<ByteVar>())

public actual fun FsRtlAreThereCurrentOrInProgressFileLocks(filelock: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlAreThereCurrentOrInProgressFileLocks(filelock.toCPointer<ByteVar>())

public actual fun FsRtlAreThereWaitingFileLocks(filelock: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlAreThereWaitingFileLocks(filelock.toCPointer<ByteVar>())

public actual fun FsRtlAreVolumeStartupApplicationsComplete(): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlAreVolumeStartupApplicationsComplete()

public actual fun FsRtlBalanceReads(targetdevice: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlBalanceReads(targetdevice.toCPointer<ByteVar>())

public actual fun FsRtlCancellableWaitForMultipleObjects(count: UInt, objectarray: Long, waittype: WAIT_TYPE, timeout: Long, waitblockarray: Long, irp: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlCancellableWaitForMultipleObjects(count, objectarray.toCPointer<ByteVar>(), waittype, timeout.toCPointer<ByteVar>(), waitblockarray.toCPointer<ByteVar>(), irp.toCPointer<ByteVar>())

public actual fun FsRtlCancellableWaitForSingleObject(obj: Long, timeout: Long, irp: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlCancellableWaitForSingleObject(obj.toCPointer<ByteVar>(), timeout.toCPointer<ByteVar>(), irp.toCPointer<ByteVar>())

public actual fun FsRtlChangeBackingFileObject(currentfileobject: Long, newfileobject: Long, changebackingtype: FSRTL_CHANGE_BACKING_TYPE, flags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlChangeBackingFileObject(currentfileobject.toCPointer<ByteVar>(), newfileobject.toCPointer<ByteVar>(), changebackingtype, flags)

public actual fun FsRtlCheckLockForOplockRequest(filelock: Long, allocationsize: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlCheckLockForOplockRequest(filelock.toCPointer<ByteVar>(), allocationsize.toCPointer<ByteVar>())

public actual fun FsRtlCheckLockForReadAccess(filelock: Long, irp: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlCheckLockForReadAccess(filelock.toCPointer<ByteVar>(), irp.toCPointer<ByteVar>())

public actual fun FsRtlCheckLockForWriteAccess(filelock: Long, irp: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlCheckLockForWriteAccess(filelock.toCPointer<ByteVar>(), irp.toCPointer<ByteVar>())

public actual fun FsRtlCheckOplock(oplock: Long, irp: Long, context: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlCheckOplock(oplock.toCPointer<ByteVar>(), irp.toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), completionroutine.toLong().toCPointer<ByteVar>(), postirproutine.toLong().toCPointer<ByteVar>())

public actual fun FsRtlCheckOplockEx(oplock: Long, irp: Long, flags: UInt, context: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlCheckOplockEx(oplock.toCPointer<ByteVar>(), irp.toCPointer<ByteVar>(), flags, context.toCPointer<ByteVar>(), completionroutine.toLong().toCPointer<ByteVar>(), postirproutine.toLong().toCPointer<ByteVar>())

public actual fun FsRtlCheckOplockEx2(oplock: Long, irp: Long, flags: UInt, flagsex2: UInt, completionroutinecontext: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP, timeout: ULong, notifycontext: Long, notifyroutine: POPLOCK_NOTIFY_ROUTINE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlCheckOplockEx2(oplock.toCPointer<ByteVar>(), irp.toCPointer<ByteVar>(), flags, flagsex2, completionroutinecontext.toCPointer<ByteVar>(), completionroutine.toLong().toCPointer<ByteVar>(), postirproutine.toLong().toCPointer<ByteVar>(), timeout, notifycontext.toCPointer<ByteVar>(), notifyroutine.toLong().toCPointer<ByteVar>())

public actual fun FsRtlCheckUpperOplock(oplock: Long, newloweroplockstate: UInt, completionroutinecontext: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, prependroutine: POPLOCK_FS_PREPOST_IRP, flags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlCheckUpperOplock(oplock.toCPointer<ByteVar>(), newloweroplockstate, completionroutinecontext.toCPointer<ByteVar>(), completionroutine.toLong().toCPointer<ByteVar>(), prependroutine.toLong().toCPointer<ByteVar>(), flags)

public actual fun FsRtlCopyRead(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, lockkey: UInt, buffer: Long, iostatus: Long, deviceobject: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlCopyRead(fileobject.toCPointer<ByteVar>(), fileoffset.toCPointer<ByteVar>(), length, wait, lockkey, buffer.toCPointer<ByteVar>(), iostatus.toCPointer<ByteVar>(), deviceobject.toCPointer<ByteVar>())

public actual fun FsRtlCopyWrite(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, lockkey: UInt, buffer: Long, iostatus: Long, deviceobject: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlCopyWrite(fileobject.toCPointer<ByteVar>(), fileoffset.toCPointer<ByteVar>(), length, wait, lockkey, buffer.toCPointer<ByteVar>(), iostatus.toCPointer<ByteVar>(), deviceobject.toCPointer<ByteVar>())

public actual fun FsRtlCreateSectionForDataScan(sectionhandle: Long, sectionobject: Long, sectionfilesize: Long, fileobject: Long, desiredaccess: UInt, objectattributes: Long, maximumsize: Long, sectionpageprotection: UInt, allocationattributes: UInt, flags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlCreateSectionForDataScan(sectionhandle.toCPointer<ByteVar>(), sectionobject.toCPointer<ByteVar>(), sectionfilesize.toCPointer<ByteVar>(), fileobject.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), maximumsize.toCPointer<ByteVar>(), sectionpageprotection, allocationattributes, flags)

public actual fun FsRtlCurrentBatchOplock(oplock: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlCurrentBatchOplock(oplock.toCPointer<ByteVar>())

public actual fun FsRtlCurrentOplock(oplock: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlCurrentOplock(oplock.toCPointer<ByteVar>())

public actual fun FsRtlCurrentOplockH(oplock: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlCurrentOplockH(oplock.toCPointer<ByteVar>())

public actual fun FsRtlDeleteExtraCreateParameterLookasideList(lookaside: Long, flags: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlDeleteExtraCreateParameterLookasideList(lookaside.toCPointer<ByteVar>(), flags)
}

public actual fun FsRtlDeleteKeyFromTunnelCache(cache: Long, directorykey: ULong) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlDeleteKeyFromTunnelCache(cache.toCPointer<ByteVar>(), directorykey)
}

public actual fun FsRtlDeleteTunnelCache(cache: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlDeleteTunnelCache(cache.toCPointer<ByteVar>())
}

public actual fun FsRtlDeregisterUncProvider(handle: HANDLE) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlDeregisterUncProvider(handle.toCPointer<ByteVar>())
}

public actual fun FsRtlDismountComplete(deviceobject: Long, dismountstatus: NTSTATUS) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlDismountComplete(deviceobject.toCPointer<ByteVar>(), dismountstatus)
}

public actual fun FsRtlDissectDbcs(path: STRING, firstname: Long, remainingname: Long) {
}

public actual fun FsRtlDissectName(path: UNICODE_STRING, firstname: Long, remainingname: Long) {
}

public actual fun FsRtlDoesDbcsContainWildCards(name: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlDoesDbcsContainWildCards(name.toCPointer<ByteVar>())

public actual fun FsRtlDoesNameContainWildCards(name: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlDoesNameContainWildCards(name.toCPointer<ByteVar>())

public actual fun FsRtlFastCheckLockForRead(filelock: Long, startingbyte: Long, length: Long, key: UInt, fileobject: Long, processid: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlFastCheckLockForRead(filelock.toCPointer<ByteVar>(), startingbyte.toCPointer<ByteVar>(), length.toCPointer<ByteVar>(), key, fileobject.toCPointer<ByteVar>(), processid.toCPointer<ByteVar>())

public actual fun FsRtlFastCheckLockForWrite(filelock: Long, startingbyte: Long, length: Long, key: UInt, fileobject: Long, processid: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlFastCheckLockForWrite(filelock.toCPointer<ByteVar>(), startingbyte.toCPointer<ByteVar>(), length.toCPointer<ByteVar>(), key, fileobject.toCPointer<ByteVar>(), processid.toCPointer<ByteVar>())

public actual fun FsRtlFastUnlockAll(filelock: Long, fileobject: Long, processid: PEPROCESS, context: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlFastUnlockAll(filelock.toCPointer<ByteVar>(), fileobject.toCPointer<ByteVar>(), processid, context.toCPointer<ByteVar>())

public actual fun FsRtlFastUnlockAllByKey(filelock: Long, fileobject: Long, processid: PEPROCESS, key: UInt, context: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlFastUnlockAllByKey(filelock.toCPointer<ByteVar>(), fileobject.toCPointer<ByteVar>(), processid, key, context.toCPointer<ByteVar>())

public actual fun FsRtlFastUnlockSingle(filelock: Long, fileobject: Long, fileoffset: Long, length: Long, processid: PEPROCESS, key: UInt, context: Long, alreadysynchronized: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlFastUnlockSingle(filelock.toCPointer<ByteVar>(), fileobject.toCPointer<ByteVar>(), fileoffset.toCPointer<ByteVar>(), length.toCPointer<ByteVar>(), processid, key, context.toCPointer<ByteVar>(), alreadysynchronized)

public actual fun FsRtlFindExtraCreateParameter(ecplist: Long, ecptype: Long, ecpcontext: Long, ecpcontextsize: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlFindExtraCreateParameter(ecplist.toCPointer<ByteVar>(), ecptype.toCPointer<ByteVar>(), ecpcontext.toCPointer<ByteVar>(), ecpcontextsize.toCPointer<ByteVar>())

public actual fun FsRtlFindInTunnelCache(cache: Long, directorykey: ULong, name: Long, shortname: Long, longname: Long, datalength: Long, data: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlFindInTunnelCache(cache.toCPointer<ByteVar>(), directorykey, name.toCPointer<ByteVar>(), shortname.toCPointer<ByteVar>(), longname.toCPointer<ByteVar>(), datalength.toCPointer<ByteVar>(), data.toCPointer<ByteVar>())

public actual fun FsRtlFindInTunnelCacheEx(cache: Long, directorykey: ULong, name: Long, shortname: Long, longname: Long, flags: UInt, datalength: Long, data: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlFindInTunnelCacheEx(cache.toCPointer<ByteVar>(), directorykey, name.toCPointer<ByteVar>(), shortname.toCPointer<ByteVar>(), longname.toCPointer<ByteVar>(), flags, datalength.toCPointer<ByteVar>(), data.toCPointer<ByteVar>())

public actual fun FsRtlFreeAePushLock(aepushlock: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlFreeAePushLock(aepushlock.toCPointer<ByteVar>())
}

public actual fun FsRtlFreeExtraCreateParameter(ecpcontext: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlFreeExtraCreateParameter(ecpcontext.toCPointer<ByteVar>())
}

public actual fun FsRtlFreeExtraCreateParameterList(ecplist: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlFreeExtraCreateParameterList(ecplist.toCPointer<ByteVar>())
}

public actual fun FsRtlFreeFileLock(filelock: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlFreeFileLock(filelock.toCPointer<ByteVar>())
}

public actual fun FsRtlGetCurrentProcessLoaderList(): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlGetCurrentProcessLoaderList()?.toLong() ?: 0L

public actual fun FsRtlGetEcpListFromIrp(irp: Long, ecplist: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlGetEcpListFromIrp(irp.toCPointer<ByteVar>(), ecplist.toCPointer<ByteVar>())

public actual fun FsRtlGetFileSize(fileobject: Long, filesize: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlGetFileSize(fileobject.toCPointer<ByteVar>(), filesize.toCPointer<ByteVar>())

public actual fun FsRtlGetNextBaseMcbEntry(mcb: Long, runindex: UInt, vbn: Long, lbn: Long, sectorcount: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlGetNextBaseMcbEntry(mcb.toCPointer<ByteVar>(), runindex, vbn.toCPointer<ByteVar>(), lbn.toCPointer<ByteVar>(), sectorcount.toCPointer<ByteVar>())

public actual fun FsRtlGetNextExtraCreateParameter(ecplist: Long, currentecpcontext: Long, nextecptype: Long, nextecpcontext: Long, nextecpcontextsize: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlGetNextExtraCreateParameter(ecplist.toCPointer<ByteVar>(), currentecpcontext.toCPointer<ByteVar>(), nextecptype.toCPointer<ByteVar>(), nextecpcontext.toCPointer<ByteVar>(), nextecpcontextsize.toCPointer<ByteVar>())

public actual fun FsRtlGetNextFileLock(filelock: Long, restart: Boolean): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlGetNextFileLock(filelock.toCPointer<ByteVar>(), restart)?.toLong() ?: 0L

public actual fun FsRtlGetNextLargeMcbEntry(mcb: Long, runindex: UInt, vbn: Long, lbn: Long, sectorcount: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlGetNextLargeMcbEntry(mcb.toCPointer<ByteVar>(), runindex, vbn.toCPointer<ByteVar>(), lbn.toCPointer<ByteVar>(), sectorcount.toCPointer<ByteVar>())

public actual fun FsRtlGetNextMcbEntry(mcb: Long, runindex: UInt, vbn: Long, lbn: Long, sectorcount: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlGetNextMcbEntry(mcb.toCPointer<ByteVar>(), runindex, vbn.toCPointer<ByteVar>(), lbn.toCPointer<ByteVar>(), sectorcount.toCPointer<ByteVar>())

public actual fun FsRtlGetSectorSizeInformation(deviceobject: Long, sectorsizeinfo: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlGetSectorSizeInformation(deviceobject.toCPointer<ByteVar>(), sectorsizeinfo.toCPointer<ByteVar>())

public actual fun FsRtlGetSupportedFeatures(deviceobject: Long, supportedfeatures: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlGetSupportedFeatures(deviceobject.toCPointer<ByteVar>(), supportedfeatures.toCPointer<ByteVar>())

public actual fun FsRtlGetVirtualDiskNestingLevel(deviceobject: Long, nestinglevel: Long, nestingflags: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlGetVirtualDiskNestingLevel(deviceobject.toCPointer<ByteVar>(), nestinglevel.toCPointer<ByteVar>(), nestingflags.toCPointer<ByteVar>())

public actual fun FsRtlIncrementCcFastMdlReadWait() {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlIncrementCcFastMdlReadWait()
}

public actual fun FsRtlIncrementCcFastReadNoWait() {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlIncrementCcFastReadNoWait()
}

public actual fun FsRtlIncrementCcFastReadNotPossible() {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlIncrementCcFastReadNotPossible()
}

public actual fun FsRtlIncrementCcFastReadResourceMiss() {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlIncrementCcFastReadResourceMiss()
}

public actual fun FsRtlIncrementCcFastReadWait() {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlIncrementCcFastReadWait()
}

public actual fun FsRtlInitExtraCreateParameterLookasideList(lookaside: Long, flags: UInt, size: ULong, tag: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlInitExtraCreateParameterLookasideList(lookaside.toCPointer<ByteVar>(), flags, size, tag)
}

public actual fun FsRtlInitializeBaseMcb(mcb: Long, pooltype: POOL_TYPE) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlInitializeBaseMcb(mcb.toCPointer<ByteVar>(), pooltype)
}

public actual fun FsRtlInitializeBaseMcbEx(mcb: Long, pooltype: POOL_TYPE, flags: UShort): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlInitializeBaseMcbEx(mcb.toCPointer<ByteVar>(), pooltype, flags)

public actual fun FsRtlInitializeExtraCreateParameter(ecp: Long, ecpflags: UInt, cleanupcallback: PFSRTL_EXTRA_CREATE_PARAMETER_CLEANUP_CALLBACK, totalsize: UInt, ecptype: Long, listallocatedfrom: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlInitializeExtraCreateParameter(ecp.toCPointer<ByteVar>(), ecpflags, cleanupcallback.toLong().toCPointer<ByteVar>(), totalsize, ecptype.toCPointer<ByteVar>(), listallocatedfrom.toCPointer<ByteVar>())
}

public actual fun FsRtlInitializeExtraCreateParameterList(ecplist: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlInitializeExtraCreateParameterList(ecplist.toCPointer<ByteVar>())

public actual fun FsRtlInitializeFileLock(filelock: Long, completelockirproutine: PCOMPLETE_LOCK_IRP_ROUTINE, unlockroutine: PUNLOCK_ROUTINE) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlInitializeFileLock(filelock.toCPointer<ByteVar>(), completelockirproutine.toLong().toCPointer<ByteVar>(), unlockroutine.toLong().toCPointer<ByteVar>())
}

public actual fun FsRtlInitializeLargeMcb(mcb: Long, pooltype: POOL_TYPE) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlInitializeLargeMcb(mcb.toCPointer<ByteVar>(), pooltype)
}

public actual fun FsRtlInitializeMcb(mcb: Long, pooltype: POOL_TYPE) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlInitializeMcb(mcb.toCPointer<ByteVar>(), pooltype)
}

public actual fun FsRtlInitializeOplock(oplock: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlInitializeOplock(oplock.toCPointer<ByteVar>())
}

public actual fun FsRtlInitializeTunnelCache(cache: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlInitializeTunnelCache(cache.toCPointer<ByteVar>())
}

public actual fun FsRtlInsertExtraCreateParameter(ecplist: Long, ecpcontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlInsertExtraCreateParameter(ecplist.toCPointer<ByteVar>(), ecpcontext.toCPointer<ByteVar>())

public actual fun FsRtlInsertPerFileContext(perfilecontextpointer: Long, ptr: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlInsertPerFileContext(perfilecontextpointer.toCPointer<ByteVar>(), ptr.toCPointer<ByteVar>())

public actual fun FsRtlInsertPerFileObjectContext(fileobject: Long, ptr: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlInsertPerFileObjectContext(fileobject.toCPointer<ByteVar>(), ptr.toCPointer<ByteVar>())

public actual fun FsRtlInsertPerStreamContext(perstreamcontext: Long, ptr: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlInsertPerStreamContext(perstreamcontext.toCPointer<ByteVar>(), ptr.toCPointer<ByteVar>())

public actual fun FsRtlIs32BitProcess(process: PEPROCESS): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlIs32BitProcess(process)

public actual fun FsRtlIsDaxVolume(fileobject: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlIsDaxVolume(fileobject.toCPointer<ByteVar>())

public actual fun FsRtlIsDbcsInExpression(expression: Long, name: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlIsDbcsInExpression(expression.toCPointer<ByteVar>(), name.toCPointer<ByteVar>())

public actual fun FsRtlIsEcpAcknowledged(ecpcontext: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlIsEcpAcknowledged(ecpcontext.toCPointer<ByteVar>())

public actual fun FsRtlIsEcpFromUserMode(ecpcontext: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlIsEcpFromUserMode(ecpcontext.toCPointer<ByteVar>())

public actual fun FsRtlIsExtentDangling(startpage: UInt, numberofpages: UInt, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlIsExtentDangling(startpage, numberofpages, flags)

public actual fun FsRtlIsFatDbcsLegal(dbcsname: STRING, wildcardspermissible: Boolean, pathnamepermissible: Boolean, leadingbackslashpermissible: Boolean): Boolean =
    false

public actual fun FsRtlIsHpfsDbcsLegal(dbcsname: STRING, wildcardspermissible: Boolean, pathnamepermissible: Boolean, leadingbackslashpermissible: Boolean): Boolean =
    false

public actual fun FsRtlIsMobileOS(): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlIsMobileOS()

public actual fun FsRtlIsNameInExpression(expression: Long, name: Long, ignorecase: Boolean, upcasetable: PCWSTR): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlIsNameInExpression(expression.toCPointer<ByteVar>(), name.toCPointer<ByteVar>(), ignorecase, upcasetable.toCPointer<ByteVar>())

public actual fun FsRtlIsNameInUnUpcasedExpression(expression: Long, name: Long, ignorecase: Boolean, upcasetable: PCWSTR): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlIsNameInUnUpcasedExpression(expression.toCPointer<ByteVar>(), name.toCPointer<ByteVar>(), ignorecase, upcasetable.toCPointer<ByteVar>())

public actual fun FsRtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag)

public actual fun FsRtlIsNtstatusExpected(exception: NTSTATUS): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlIsNtstatusExpected(exception)

public actual fun FsRtlIsPagingFile(fileobject: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlIsPagingFile(fileobject.toCPointer<ByteVar>())

public actual fun FsRtlIsSystemPagingFile(fileobject: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlIsSystemPagingFile(fileobject.toCPointer<ByteVar>())

public actual fun FsRtlIssueDeviceIoControl(deviceobject: Long, ioctl: UInt, flags: UByte, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt, iosbinformation: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlIssueDeviceIoControl(deviceobject.toCPointer<ByteVar>(), ioctl, flags, inputbuffer.toCPointer<ByteVar>(), inputbufferlength, outputbuffer.toCPointer<ByteVar>(), outputbufferlength, iosbinformation.toCPointer<ByteVar>())

public actual fun FsRtlKernelFsControlFile(fileobject: Long, fscontrolcode: UInt, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt, retoutputbuffersize: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlKernelFsControlFile(fileobject.toCPointer<ByteVar>(), fscontrolcode, inputbuffer.toCPointer<ByteVar>(), inputbufferlength, outputbuffer.toCPointer<ByteVar>(), outputbufferlength, retoutputbuffersize.toCPointer<ByteVar>())

public actual fun FsRtlLogCcFlushError(filename: Long, deviceobject: Long, sectionobjectpointer: Long, flusherror: NTSTATUS, flags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlLogCcFlushError(filename.toCPointer<ByteVar>(), deviceobject.toCPointer<ByteVar>(), sectionobjectpointer.toCPointer<ByteVar>(), flusherror, flags)

public actual fun FsRtlLookupBaseMcbEntry(mcb: Long, vbn: Long, lbn: Long, sectorcountfromlbn: Long, startinglbn: Long, sectorcountfromstartinglbn: Long, index: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlLookupBaseMcbEntry(mcb.toCPointer<ByteVar>(), vbn, lbn.toCPointer<ByteVar>(), sectorcountfromlbn.toCPointer<ByteVar>(), startinglbn.toCPointer<ByteVar>(), sectorcountfromstartinglbn.toCPointer<ByteVar>(), index.toCPointer<ByteVar>())

public actual fun FsRtlLookupLargeMcbEntry(mcb: Long, vbn: Long, lbn: Long, sectorcountfromlbn: Long, startinglbn: Long, sectorcountfromstartinglbn: Long, index: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlLookupLargeMcbEntry(mcb.toCPointer<ByteVar>(), vbn, lbn.toCPointer<ByteVar>(), sectorcountfromlbn.toCPointer<ByteVar>(), startinglbn.toCPointer<ByteVar>(), sectorcountfromstartinglbn.toCPointer<ByteVar>(), index.toCPointer<ByteVar>())

public actual fun FsRtlLookupLastBaseMcbEntry(mcb: Long, vbn: Long, lbn: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlLookupLastBaseMcbEntry(mcb.toCPointer<ByteVar>(), vbn.toCPointer<ByteVar>(), lbn.toCPointer<ByteVar>())

public actual fun FsRtlLookupLastBaseMcbEntryAndIndex(opaquemcb: Long, largevbn: Long, largelbn: Long, index: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlLookupLastBaseMcbEntryAndIndex(opaquemcb.toCPointer<ByteVar>(), largevbn.toCPointer<ByteVar>(), largelbn.toCPointer<ByteVar>(), index.toCPointer<ByteVar>())

public actual fun FsRtlLookupLastLargeMcbEntry(mcb: Long, vbn: Long, lbn: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlLookupLastLargeMcbEntry(mcb.toCPointer<ByteVar>(), vbn.toCPointer<ByteVar>(), lbn.toCPointer<ByteVar>())

public actual fun FsRtlLookupLastLargeMcbEntryAndIndex(opaquemcb: Long, largevbn: Long, largelbn: Long, index: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlLookupLastLargeMcbEntryAndIndex(opaquemcb.toCPointer<ByteVar>(), largevbn.toCPointer<ByteVar>(), largelbn.toCPointer<ByteVar>(), index.toCPointer<ByteVar>())

public actual fun FsRtlLookupLastMcbEntry(mcb: Long, vbn: Long, lbn: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlLookupLastMcbEntry(mcb.toCPointer<ByteVar>(), vbn.toCPointer<ByteVar>(), lbn.toCPointer<ByteVar>())

public actual fun FsRtlLookupMcbEntry(mcb: Long, vbn: UInt, lbn: Long, sectorcount: Long, index: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlLookupMcbEntry(mcb.toCPointer<ByteVar>(), vbn, lbn.toCPointer<ByteVar>(), sectorcount.toCPointer<ByteVar>(), index.toCPointer<ByteVar>())

public actual fun FsRtlLookupPerFileContext(perfilecontextpointer: Long, ownerid: Long, instanceid: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlLookupPerFileContext(perfilecontextpointer.toCPointer<ByteVar>(), ownerid.toCPointer<ByteVar>(), instanceid.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun FsRtlLookupPerFileObjectContext(fileobject: Long, ownerid: Long, instanceid: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlLookupPerFileObjectContext(fileobject.toCPointer<ByteVar>(), ownerid.toCPointer<ByteVar>(), instanceid.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun FsRtlLookupPerStreamContextInternal(streamcontext: Long, ownerid: Long, instanceid: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlLookupPerStreamContextInternal(streamcontext.toCPointer<ByteVar>(), ownerid.toCPointer<ByteVar>(), instanceid.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun FsRtlMdlReadCompleteDev(fileobject: Long, mdlchain: Long, deviceobject: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlMdlReadCompleteDev(fileobject.toCPointer<ByteVar>(), mdlchain.toCPointer<ByteVar>(), deviceobject.toCPointer<ByteVar>())

public actual fun FsRtlMdlReadDev(fileobject: Long, fileoffset: Long, length: UInt, lockkey: UInt, mdlchain: Long, iostatus: Long, deviceobject: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlMdlReadDev(fileobject.toCPointer<ByteVar>(), fileoffset.toCPointer<ByteVar>(), length, lockkey, mdlchain.toCPointer<ByteVar>(), iostatus.toCPointer<ByteVar>(), deviceobject.toCPointer<ByteVar>())

public actual fun FsRtlMdlReadEx(fileobject: Long, fileoffset: Long, length: UInt, lockkey: UInt, mdlchain: Long, iostatus: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlMdlReadEx(fileobject.toCPointer<ByteVar>(), fileoffset.toCPointer<ByteVar>(), length, lockkey, mdlchain.toCPointer<ByteVar>(), iostatus.toCPointer<ByteVar>())

public actual fun FsRtlMdlWriteCompleteDev(fileobject: Long, fileoffset: Long, mdlchain: Long, deviceobject: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlMdlWriteCompleteDev(fileobject.toCPointer<ByteVar>(), fileoffset.toCPointer<ByteVar>(), mdlchain.toCPointer<ByteVar>(), deviceobject.toCPointer<ByteVar>())

public actual fun FsRtlMupGetProviderIdFromName(pprovidername: Long, pproviderid: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlMupGetProviderIdFromName(pprovidername.toCPointer<ByteVar>(), pproviderid.toCPointer<ByteVar>())

public actual fun FsRtlMupGetProviderInfoFromFileObject(pfileobject: Long, level: UInt, pbuffer: Long, pbuffersize: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlMupGetProviderInfoFromFileObject(pfileobject.toCPointer<ByteVar>(), level, pbuffer.toCPointer<ByteVar>(), pbuffersize.toCPointer<ByteVar>())

public actual fun FsRtlNormalizeNtstatus(exception: NTSTATUS, genericexception: NTSTATUS): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlNormalizeNtstatus(exception, genericexception)

public actual fun FsRtlNotifyCleanup(notifysync: PNOTIFY_SYNC, notifylist: Long, fscontext: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlNotifyCleanup(notifysync, notifylist.toCPointer<ByteVar>(), fscontext.toCPointer<ByteVar>())
}

public actual fun FsRtlNotifyCleanupAll(notifysync: PNOTIFY_SYNC, notifylist: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlNotifyCleanupAll(notifysync, notifylist.toCPointer<ByteVar>())
}

public actual fun FsRtlNotifyFilterChangeDirectory(notifysync: PNOTIFY_SYNC, notifylist: Long, fscontext: Long, fulldirectoryname: Long, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifyirp: Long, traversecallback: PCHECK_FOR_TRAVERSE_ACCESS, subjectcontext: Long, filtercallback: PFILTER_REPORT_CHANGE) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlNotifyFilterChangeDirectory(notifysync, notifylist.toCPointer<ByteVar>(), fscontext.toCPointer<ByteVar>(), fulldirectoryname.toCPointer<ByteVar>(), watchtree, ignorebuffer, completionfilter, notifyirp.toCPointer<ByteVar>(), traversecallback.toLong().toCPointer<ByteVar>(), subjectcontext.toCPointer<ByteVar>(), filtercallback.toLong().toCPointer<ByteVar>())
}

public actual fun FsRtlNotifyFilterReportChange(notifysync: PNOTIFY_SYNC, notifylist: Long, fulltargetname: Long, targetnameoffset: UShort, streamname: Long, normalizedparentname: Long, filtermatch: UInt, action: UInt, targetcontext: Long, filtercontext: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlNotifyFilterReportChange(notifysync, notifylist.toCPointer<ByteVar>(), fulltargetname.toCPointer<ByteVar>(), targetnameoffset, streamname.toCPointer<ByteVar>(), normalizedparentname.toCPointer<ByteVar>(), filtermatch, action, targetcontext.toCPointer<ByteVar>(), filtercontext.toCPointer<ByteVar>())
}

public actual fun FsRtlNotifyFullChangeDirectory(notifysync: PNOTIFY_SYNC, notifylist: Long, fscontext: Long, fulldirectoryname: Long, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifyirp: Long, traversecallback: PCHECK_FOR_TRAVERSE_ACCESS, subjectcontext: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlNotifyFullChangeDirectory(notifysync, notifylist.toCPointer<ByteVar>(), fscontext.toCPointer<ByteVar>(), fulldirectoryname.toCPointer<ByteVar>(), watchtree, ignorebuffer, completionfilter, notifyirp.toCPointer<ByteVar>(), traversecallback.toLong().toCPointer<ByteVar>(), subjectcontext.toCPointer<ByteVar>())
}

public actual fun FsRtlNotifyFullReportChange(notifysync: PNOTIFY_SYNC, notifylist: Long, fulltargetname: Long, targetnameoffset: UShort, streamname: Long, normalizedparentname: Long, filtermatch: UInt, action: UInt, targetcontext: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlNotifyFullReportChange(notifysync, notifylist.toCPointer<ByteVar>(), fulltargetname.toCPointer<ByteVar>(), targetnameoffset, streamname.toCPointer<ByteVar>(), normalizedparentname.toCPointer<ByteVar>(), filtermatch, action, targetcontext.toCPointer<ByteVar>())
}

public actual fun FsRtlNotifyInitializeSync(notifysync: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlNotifyInitializeSync(notifysync.toCPointer<ByteVar>())
}

public actual fun FsRtlNotifyUninitializeSync(notifysync: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlNotifyUninitializeSync(notifysync.toCPointer<ByteVar>())
}

public actual fun FsRtlNotifyVolumeEvent(fileobject: Long, eventcode: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlNotifyVolumeEvent(fileobject.toCPointer<ByteVar>(), eventcode)

public actual fun FsRtlNotifyVolumeEventEx(fileobject: Long, eventcode: UInt, event: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlNotifyVolumeEventEx(fileobject.toCPointer<ByteVar>(), eventcode, event.toCPointer<ByteVar>())

public actual fun FsRtlNumberOfRunsInBaseMcb(mcb: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlNumberOfRunsInBaseMcb(mcb.toCPointer<ByteVar>())

public actual fun FsRtlNumberOfRunsInLargeMcb(mcb: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlNumberOfRunsInLargeMcb(mcb.toCPointer<ByteVar>())

public actual fun FsRtlNumberOfRunsInMcb(mcb: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlNumberOfRunsInMcb(mcb.toCPointer<ByteVar>())

public actual fun FsRtlOplockBreakH(oplock: Long, irp: Long, flags: UInt, context: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlOplockBreakH(oplock.toCPointer<ByteVar>(), irp.toCPointer<ByteVar>(), flags, context.toCPointer<ByteVar>(), completionroutine.toLong().toCPointer<ByteVar>(), postirproutine.toLong().toCPointer<ByteVar>())

public actual fun FsRtlOplockBreakH2(oplock: Long, irp: Long, flags: UInt, context: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP, grantedaccess: Long, shareaccess: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlOplockBreakH2(oplock.toCPointer<ByteVar>(), irp.toCPointer<ByteVar>(), flags, context.toCPointer<ByteVar>(), completionroutine.toLong().toCPointer<ByteVar>(), postirproutine.toLong().toCPointer<ByteVar>(), grantedaccess.toCPointer<ByteVar>(), shareaccess.toCPointer<ByteVar>())

public actual fun FsRtlOplockBreakToNone(oplock: Long, irpsp: Long, irp: Long, context: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlOplockBreakToNone(oplock.toCPointer<ByteVar>(), irpsp.toCPointer<ByteVar>(), irp.toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), completionroutine.toLong().toCPointer<ByteVar>(), postirproutine.toLong().toCPointer<ByteVar>())

public actual fun FsRtlOplockBreakToNoneEx(oplock: Long, irp: Long, flags: UInt, context: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlOplockBreakToNoneEx(oplock.toCPointer<ByteVar>(), irp.toCPointer<ByteVar>(), flags, context.toCPointer<ByteVar>(), completionroutine.toLong().toCPointer<ByteVar>(), postirproutine.toLong().toCPointer<ByteVar>())

public actual fun FsRtlOplockFsctrl(oplock: Long, irp: Long, opencount: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlOplockFsctrl(oplock.toCPointer<ByteVar>(), irp.toCPointer<ByteVar>(), opencount)

public actual fun FsRtlOplockFsctrlEx(oplock: Long, irp: Long, opencount: UInt, flags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlOplockFsctrlEx(oplock.toCPointer<ByteVar>(), irp.toCPointer<ByteVar>(), opencount, flags)

public actual fun FsRtlOplockGetAnyBreakOwnerProcess(oplock: Long): PEPROCESS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlOplockGetAnyBreakOwnerProcess(oplock.toCPointer<ByteVar>())

public actual fun FsRtlOplockIsFastIoPossible(oplock: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlOplockIsFastIoPossible(oplock.toCPointer<ByteVar>())

public actual fun FsRtlOplockIsSharedRequest(irp: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlOplockIsSharedRequest(irp.toCPointer<ByteVar>())

public actual fun FsRtlOplockKeysEqual(fo1: Long, fo2: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlOplockKeysEqual(fo1.toCPointer<ByteVar>(), fo2.toCPointer<ByteVar>())

public actual fun FsRtlPostPagingFileStackOverflow(context: Long, event: Long, stackoverflowroutine: PFSRTL_STACK_OVERFLOW_ROUTINE) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlPostPagingFileStackOverflow(context.toCPointer<ByteVar>(), event.toCPointer<ByteVar>(), stackoverflowroutine.toLong().toCPointer<ByteVar>())
}

public actual fun FsRtlPostStackOverflow(context: Long, event: Long, stackoverflowroutine: PFSRTL_STACK_OVERFLOW_ROUTINE) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlPostStackOverflow(context.toCPointer<ByteVar>(), event.toCPointer<ByteVar>(), stackoverflowroutine.toLong().toCPointer<ByteVar>())
}

public actual fun FsRtlPrepareMdlWriteDev(fileobject: Long, fileoffset: Long, length: UInt, lockkey: UInt, mdlchain: Long, iostatus: Long, deviceobject: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlPrepareMdlWriteDev(fileobject.toCPointer<ByteVar>(), fileoffset.toCPointer<ByteVar>(), length, lockkey, mdlchain.toCPointer<ByteVar>(), iostatus.toCPointer<ByteVar>(), deviceobject.toCPointer<ByteVar>())

public actual fun FsRtlPrepareMdlWriteEx(fileobject: Long, fileoffset: Long, length: UInt, lockkey: UInt, mdlchain: Long, iostatus: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlPrepareMdlWriteEx(fileobject.toCPointer<ByteVar>(), fileoffset.toCPointer<ByteVar>(), length, lockkey, mdlchain.toCPointer<ByteVar>(), iostatus.toCPointer<ByteVar>())

public actual fun FsRtlPrepareToReuseEcp(ecpcontext: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlPrepareToReuseEcp(ecpcontext.toCPointer<ByteVar>())
}

public actual fun FsRtlPrivateLock(filelock: Long, fileobject: Long, fileoffset: Long, length: Long, processid: PEPROCESS, key: UInt, failimmediately: Boolean, exclusivelock: Boolean, iosb: Long, irp: Long, context: Long, alreadysynchronized: Boolean): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlPrivateLock(filelock.toCPointer<ByteVar>(), fileobject.toCPointer<ByteVar>(), fileoffset.toCPointer<ByteVar>(), length.toCPointer<ByteVar>(), processid, key, failimmediately, exclusivelock, iosb.toCPointer<ByteVar>(), irp.toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), alreadysynchronized)

public actual fun FsRtlProcessFileLock(filelock: Long, irp: Long, context: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlProcessFileLock(filelock.toCPointer<ByteVar>(), irp.toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun FsRtlQueryCachedVdl(fileobject: Long, vdl: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlQueryCachedVdl(fileobject.toCPointer<ByteVar>(), vdl.toCPointer<ByteVar>())

public actual fun FsRtlQueryInformationFile(fileobject: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, retfileinformationsize: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlQueryInformationFile(fileobject.toCPointer<ByteVar>(), fileinformation.toCPointer<ByteVar>(), length, fileinformationclass, retfileinformationsize.toCPointer<ByteVar>())

public actual fun FsRtlQueryKernelEaFile(fileobject: Long, returnedeadata: Long, length: UInt, returnsingleentry: Boolean, ealist: Long, ealistlength: UInt, eaindex: Long, restartscan: Boolean, lengthreturned: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlQueryKernelEaFile(fileobject.toCPointer<ByteVar>(), returnedeadata.toCPointer<ByteVar>(), length, returnsingleentry, ealist.toCPointer<ByteVar>(), ealistlength, eaindex.toCPointer<ByteVar>(), restartscan, lengthreturned.toCPointer<ByteVar>())

public actual fun FsRtlQueryMaximumVirtualDiskNestingLevel(): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlQueryMaximumVirtualDiskNestingLevel()

public actual fun FsRtlRegisterFileSystemFilterCallbacks(filterdriverobject: Long, callbacks: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlRegisterFileSystemFilterCallbacks(filterdriverobject.toCPointer<ByteVar>(), callbacks.toCPointer<ByteVar>())

public actual fun FsRtlRegisterUncProvider(muphandle: Long, redirectordevicename: Long, mailslotssupported: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlRegisterUncProvider(muphandle.toCPointer<ByteVar>(), redirectordevicename.toCPointer<ByteVar>(), mailslotssupported)

public actual fun FsRtlRegisterUncProviderEx(muphandle: Long, redirdevname: Long, deviceobject: Long, flags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlRegisterUncProviderEx(muphandle.toCPointer<ByteVar>(), redirdevname.toCPointer<ByteVar>(), deviceobject.toCPointer<ByteVar>(), flags)

public actual fun FsRtlRegisterUncProviderEx2(redirdevname: Long, deviceobject: Long, registration: Long, muphandle: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlRegisterUncProviderEx2(redirdevname.toCPointer<ByteVar>(), deviceobject.toCPointer<ByteVar>(), registration.toCPointer<ByteVar>(), muphandle.toCPointer<ByteVar>())

public actual fun FsRtlReleaseFile(fileobject: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlReleaseFile(fileobject.toCPointer<ByteVar>())
}

public actual fun FsRtlRemoveBaseMcbEntry(mcb: Long, vbn: Long, sectorcount: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlRemoveBaseMcbEntry(mcb.toCPointer<ByteVar>(), vbn, sectorcount)

public actual fun FsRtlRemoveDotsFromPath(originalstring: PWSTR, pathlength: UShort, newlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlRemoveDotsFromPath(originalstring.toCPointer<ByteVar>(), pathlength, newlength.toCPointer<ByteVar>())

public actual fun FsRtlRemoveExtraCreateParameter(ecplist: Long, ecptype: Long, ecpcontext: Long, ecpcontextsize: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlRemoveExtraCreateParameter(ecplist.toCPointer<ByteVar>(), ecptype.toCPointer<ByteVar>(), ecpcontext.toCPointer<ByteVar>(), ecpcontextsize.toCPointer<ByteVar>())

public actual fun FsRtlRemoveLargeMcbEntry(mcb: Long, vbn: Long, sectorcount: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlRemoveLargeMcbEntry(mcb.toCPointer<ByteVar>(), vbn, sectorcount)
}

public actual fun FsRtlRemoveMcbEntry(mcb: Long, vbn: UInt, sectorcount: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlRemoveMcbEntry(mcb.toCPointer<ByteVar>(), vbn, sectorcount)
}

public actual fun FsRtlRemovePerFileContext(perfilecontextpointer: Long, ownerid: Long, instanceid: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlRemovePerFileContext(perfilecontextpointer.toCPointer<ByteVar>(), ownerid.toCPointer<ByteVar>(), instanceid.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun FsRtlRemovePerFileObjectContext(fileobject: Long, ownerid: Long, instanceid: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlRemovePerFileObjectContext(fileobject.toCPointer<ByteVar>(), ownerid.toCPointer<ByteVar>(), instanceid.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun FsRtlRemovePerStreamContext(streamcontext: Long, ownerid: Long, instanceid: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlRemovePerStreamContext(streamcontext.toCPointer<ByteVar>(), ownerid.toCPointer<ByteVar>(), instanceid.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun FsRtlResetBaseMcb(mcb: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlResetBaseMcb(mcb.toCPointer<ByteVar>())
}

public actual fun FsRtlResetLargeMcb(mcb: Long, selfsynchronized: Boolean) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlResetLargeMcb(mcb.toCPointer<ByteVar>(), selfsynchronized)
}

public actual fun FsRtlSetDriverBacking(driverobj: Long, flags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlSetDriverBacking(driverobj.toCPointer<ByteVar>(), flags)

public actual fun FsRtlSetEcpListIntoIrp(irp: Long, ecplist: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlSetEcpListIntoIrp(irp.toCPointer<ByteVar>(), ecplist.toCPointer<ByteVar>())

public actual fun FsRtlSetKernelEaFile(fileobject: Long, eabuffer: Long, length: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlSetKernelEaFile(fileobject.toCPointer<ByteVar>(), eabuffer.toCPointer<ByteVar>(), length)

public actual fun FsRtlSplitBaseMcb(mcb: Long, vbn: Long, amount: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlSplitBaseMcb(mcb.toCPointer<ByteVar>(), vbn, amount)

public actual fun FsRtlSplitLargeMcb(mcb: Long, vbn: Long, amount: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlSplitLargeMcb(mcb.toCPointer<ByteVar>(), vbn, amount)

public actual fun FsRtlTeardownPerFileContexts(perfilecontextpointer: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlTeardownPerFileContexts(perfilecontextpointer.toCPointer<ByteVar>())
}

public actual fun FsRtlTeardownPerStreamContexts(advancedheader: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlTeardownPerStreamContexts(advancedheader.toCPointer<ByteVar>())
}

public actual fun FsRtlTruncateBaseMcb(mcb: Long, vbn: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlTruncateBaseMcb(mcb.toCPointer<ByteVar>(), vbn)
}

public actual fun FsRtlTruncateLargeMcb(mcb: Long, vbn: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlTruncateLargeMcb(mcb.toCPointer<ByteVar>(), vbn)
}

public actual fun FsRtlTruncateMcb(mcb: Long, vbn: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlTruncateMcb(mcb.toCPointer<ByteVar>(), vbn)
}

public actual fun FsRtlUninitializeBaseMcb(mcb: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlUninitializeBaseMcb(mcb.toCPointer<ByteVar>())
}

public actual fun FsRtlUninitializeFileLock(filelock: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlUninitializeFileLock(filelock.toCPointer<ByteVar>())
}

public actual fun FsRtlUninitializeLargeMcb(mcb: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlUninitializeLargeMcb(mcb.toCPointer<ByteVar>())
}

public actual fun FsRtlUninitializeMcb(mcb: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlUninitializeMcb(mcb.toCPointer<ByteVar>())
}

public actual fun FsRtlUninitializeOplock(oplock: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlUninitializeOplock(oplock.toCPointer<ByteVar>())
}

public actual fun FsRtlUpdateDiskCounters(bytesread: ULong, byteswritten: ULong) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlUpdateDiskCounters(bytesread, byteswritten)
}

public actual fun FsRtlUpperOplockFsctrl(oplock: Long, irp: Long, opencount: UInt, loweroplockstate: UInt, flags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlUpperOplockFsctrl(oplock.toCPointer<ByteVar>(), irp.toCPointer<ByteVar>(), opencount, loweroplockstate, flags)

public actual fun FsRtlValidateReparsePointBuffer(bufferlength: UInt, reparsebuffer: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlValidateReparsePointBuffer(bufferlength, reparsebuffer.toCPointer<ByteVar>())

public actual fun FsRtlVolumeDeviceToCorrelationId(volumedeviceobject: Long, guid: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_FsRtlVolumeDeviceToCorrelationId(volumedeviceobject.toCPointer<ByteVar>(), guid.toCPointer<ByteVar>())

public actual fun GetSecurityUserInfo(logonid: Long, flags: UInt, userinformation: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_GetSecurityUserInfo(logonid.toCPointer<ByteVar>(), flags, userinformation.toCPointer<ByteVar>())

public actual fun IoAcquireVpbSpinLock(irql: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoAcquireVpbSpinLock(irql.toCPointer<ByteVar>())
}

public actual fun IoApplyPriorityInfoThread(inputpriorityinfo: Long, outputpriorityinfo: Long, thread: PETHREAD): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoApplyPriorityInfoThread(inputpriorityinfo.toCPointer<ByteVar>(), outputpriorityinfo.toCPointer<ByteVar>(), thread)

public actual fun IoCheckDesiredAccess(desiredaccess: Long, grantedaccess: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoCheckDesiredAccess(desiredaccess.toCPointer<ByteVar>(), grantedaccess)

public actual fun IoCheckEaBufferValidity(eabuffer: Long, ealength: UInt, erroroffset: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoCheckEaBufferValidity(eabuffer.toCPointer<ByteVar>(), ealength, erroroffset.toCPointer<ByteVar>())

public actual fun IoCheckFunctionAccess(grantedaccess: UInt, majorfunction: UByte, minorfunction: UByte, iocontrolcode: UInt, arg1: Long, arg2: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoCheckFunctionAccess(grantedaccess, majorfunction, minorfunction, iocontrolcode, arg1.toCPointer<ByteVar>(), arg2.toCPointer<ByteVar>())

public actual fun IoCheckQuerySetFileInformation(fileinformationclass: FILE_INFORMATION_CLASS, length: UInt, setoperation: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoCheckQuerySetFileInformation(fileinformationclass, length, setoperation)

public actual fun IoCheckQuerySetVolumeInformation(fsinformationclass: FS_INFORMATION_CLASS, length: UInt, setoperation: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoCheckQuerySetVolumeInformation(fsinformationclass, length, setoperation)

public actual fun IoCheckQuotaBufferValidity(quotabuffer: Long, quotalength: UInt, erroroffset: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoCheckQuotaBufferValidity(quotabuffer.toCPointer<ByteVar>(), quotalength, erroroffset.toCPointer<ByteVar>())

public actual fun IoClearFsTrackOffsetState(irp: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoClearFsTrackOffsetState(irp.toCPointer<ByteVar>())

public actual fun IoCreateStreamFileObject(fileobject: Long, deviceobject: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoCreateStreamFileObject(fileobject.toCPointer<ByteVar>(), deviceobject.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun IoCreateStreamFileObjectEx(fileobject: Long, deviceobject: Long, filehandle: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoCreateStreamFileObjectEx(fileobject.toCPointer<ByteVar>(), deviceobject.toCPointer<ByteVar>(), filehandle.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun IoCreateStreamFileObjectEx2(createoptions: Long, fileobject: Long, deviceobject: Long, streamfileobject: Long, filehandle: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoCreateStreamFileObjectEx2(createoptions.toCPointer<ByteVar>(), fileobject.toCPointer<ByteVar>(), deviceobject.toCPointer<ByteVar>(), streamfileobject.toCPointer<ByteVar>(), filehandle.toCPointer<ByteVar>())

public actual fun IoCreateStreamFileObjectLite(fileobject: Long, deviceobject: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoCreateStreamFileObjectLite(fileobject.toCPointer<ByteVar>(), deviceobject.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun IoEnumerateDeviceObjectList(driverobject: Long, deviceobjectlist: Long, deviceobjectlistsize: UInt, actualnumberdeviceobjects: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoEnumerateDeviceObjectList(driverobject.toCPointer<ByteVar>(), deviceobjectlist.toCPointer<ByteVar>(), deviceobjectlistsize, actualnumberdeviceobjects.toCPointer<ByteVar>())

public actual fun IoEnumerateRegisteredFiltersList(driverobjectlist: Long, driverobjectlistsize: UInt, actualnumberdriverobjects: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoEnumerateRegisteredFiltersList(driverobjectlist.toCPointer<ByteVar>(), driverobjectlistsize, actualnumberdriverobjects.toCPointer<ByteVar>())

public actual fun IoFastQueryNetworkAttributes(objectattributes: Long, desiredaccess: UInt, openoptions: UInt, iostatus: Long, buffer: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoFastQueryNetworkAttributes(objectattributes.toCPointer<ByteVar>(), desiredaccess, openoptions, iostatus.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>())

public actual fun IoGetAttachedDevice(deviceobject: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoGetAttachedDevice(deviceobject.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun IoGetBaseFileSystemDeviceObject(fileobject: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoGetBaseFileSystemDeviceObject(fileobject.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun IoGetDeviceAttachmentBaseRef(deviceobject: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoGetDeviceAttachmentBaseRef(deviceobject.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun IoGetDeviceToVerify(thread: PETHREAD): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoGetDeviceToVerify(thread)?.toLong() ?: 0L

public actual fun IoGetDiskDeviceObject(filesystemdeviceobject: Long, diskdeviceobject: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoGetDiskDeviceObject(filesystemdeviceobject.toCPointer<ByteVar>(), diskdeviceobject.toCPointer<ByteVar>())

public actual fun IoGetFsTrackOffsetState(irp: Long, retfstrackoffsetblob: Long, rettrackedoffset: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoGetFsTrackOffsetState(irp.toCPointer<ByteVar>(), retfstrackoffsetblob.toCPointer<ByteVar>(), rettrackedoffset.toCPointer<ByteVar>())

public actual fun IoGetLowerDeviceObject(deviceobject: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoGetLowerDeviceObject(deviceobject.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun IoGetOplockKeyContext(fileobject: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoGetOplockKeyContext(fileobject.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun IoGetOplockKeyContextEx(fileobject: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoGetOplockKeyContextEx(fileobject.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun IoGetRequestorProcess(irp: Long): PEPROCESS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoGetRequestorProcess(irp.toCPointer<ByteVar>())

public actual fun IoGetRequestorProcessId(irp: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoGetRequestorProcessId(irp.toCPointer<ByteVar>())

public actual fun IoGetRequestorSessionId(irp: Long, psessionid: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoGetRequestorSessionId(irp.toCPointer<ByteVar>(), psessionid.toCPointer<ByteVar>())

public actual fun IoIrpHasFsTrackOffsetExtensionType(irp: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoIrpHasFsTrackOffsetExtensionType(irp.toCPointer<ByteVar>())

public actual fun IoIsOperationSynchronous(irp: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoIsOperationSynchronous(irp.toCPointer<ByteVar>())

public actual fun IoIsSystemThread(thread: PETHREAD): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoIsSystemThread(thread)

public actual fun IoIsValidNameGraftingBuffer(irp: Long, reparsebuffer: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoIsValidNameGraftingBuffer(irp.toCPointer<ByteVar>(), reparsebuffer.toCPointer<ByteVar>())

public actual fun IoPageRead(fileobject: Long, memorydescriptorlist: Long, startingoffset: Long, event: Long, iostatusblock: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoPageRead(fileobject.toCPointer<ByteVar>(), memorydescriptorlist.toCPointer<ByteVar>(), startingoffset.toCPointer<ByteVar>(), event.toCPointer<ByteVar>(), iostatusblock.toCPointer<ByteVar>())

public actual fun IoQueryFileDosDeviceName(fileobject: Long, objectnameinformation: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoQueryFileDosDeviceName(fileobject.toCPointer<ByteVar>(), objectnameinformation.toCPointer<ByteVar>())

public actual fun IoQueryFileInformation(fileobject: Long, fileinformationclass: FILE_INFORMATION_CLASS, length: UInt, fileinformation: Long, returnedlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoQueryFileInformation(fileobject.toCPointer<ByteVar>(), fileinformationclass, length, fileinformation.toCPointer<ByteVar>(), returnedlength.toCPointer<ByteVar>())

public actual fun IoQueryVolumeInformation(fileobject: Long, fsinformationclass: FS_INFORMATION_CLASS, length: UInt, fsinformation: Long, returnedlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoQueryVolumeInformation(fileobject.toCPointer<ByteVar>(), fsinformationclass, length, fsinformation.toCPointer<ByteVar>(), returnedlength.toCPointer<ByteVar>())

public actual fun IoQueueThreadIrp(irp: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoQueueThreadIrp(irp.toCPointer<ByteVar>())
}

public actual fun IoRegisterFileSystem(deviceobject: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoRegisterFileSystem(deviceobject.toCPointer<ByteVar>())
}

public actual fun IoRegisterFsRegistrationChange(driverobject: Long, drivernotificationroutine: DRIVER_FS_NOTIFICATION): NTSTATUS =
    0

public actual fun IoRegisterFsRegistrationChangeMountAware(driverobject: Long, drivernotificationroutine: DRIVER_FS_NOTIFICATION, synchronizewithmounts: Boolean): NTSTATUS =
    0

public actual fun IoReleaseVpbSpinLock(irql: UByte) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoReleaseVpbSpinLock(irql)
}

public actual fun IoReplaceFileObjectName(fileobject: Long, newfilename: PCWSTR, filenamelength: UShort): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoReplaceFileObjectName(fileobject.toCPointer<ByteVar>(), newfilename.toCPointer<ByteVar>(), filenamelength)

public actual fun IoRequestDeviceRemovalForReset(physicaldeviceobject: Long, flags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoRequestDeviceRemovalForReset(physicaldeviceobject.toCPointer<ByteVar>(), flags)

public actual fun IoRetrievePriorityInfo(irp: Long, fileobject: Long, thread: PETHREAD, priorityinfo: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoRetrievePriorityInfo(irp.toCPointer<ByteVar>(), fileobject.toCPointer<ByteVar>(), thread, priorityinfo.toCPointer<ByteVar>())

public actual fun IoSetDeviceToVerify(thread: PETHREAD, deviceobject: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoSetDeviceToVerify(thread, deviceobject.toCPointer<ByteVar>())
}

public actual fun IoSetFsTrackOffsetState(irp: Long, fstrackoffsetblob: Long, trackedoffset: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoSetFsTrackOffsetState(irp.toCPointer<ByteVar>(), fstrackoffsetblob.toCPointer<ByteVar>(), trackedoffset)

public actual fun IoSetInformation(fileobject: Long, fileinformationclass: FILE_INFORMATION_CLASS, length: UInt, fileinformation: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoSetInformation(fileobject.toCPointer<ByteVar>(), fileinformationclass, length, fileinformation.toCPointer<ByteVar>())

public actual fun IoSynchronousPageWrite(fileobject: Long, memorydescriptorlist: Long, startingoffset: Long, event: Long, iostatusblock: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoSynchronousPageWrite(fileobject.toCPointer<ByteVar>(), memorydescriptorlist.toCPointer<ByteVar>(), startingoffset.toCPointer<ByteVar>(), event.toCPointer<ByteVar>(), iostatusblock.toCPointer<ByteVar>())

public actual fun IoThreadToProcess(thread: PETHREAD): PEPROCESS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoThreadToProcess(thread)

public actual fun IoUnregisterFileSystem(deviceobject: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoUnregisterFileSystem(deviceobject.toCPointer<ByteVar>())
}

public actual fun IoUnregisterFsRegistrationChange(driverobject: Long, drivernotificationroutine: DRIVER_FS_NOTIFICATION) {
}

public actual fun IoVerifyVolume(deviceobject: Long, allowrawmount: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_IoVerifyVolume(deviceobject.toCPointer<ByteVar>(), allowrawmount)

public actual fun KeAcquireQueuedSpinLock(number: KSPIN_LOCK_QUEUE_NUMBER): UByte =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_KeAcquireQueuedSpinLock(number)

public actual fun KeAcquireSpinLockRaiseToSynch(spinlock: Long): UByte =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_KeAcquireSpinLockRaiseToSynch(spinlock.toCPointer<ByteVar>())

public actual fun KeAttachProcess(process: PRKPROCESS) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_KeAttachProcess(process)
}

public actual fun KeDetachProcess() {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_KeDetachProcess()
}

public actual fun KeInitializeMutant(mutant: Long, initialowner: Boolean) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_KeInitializeMutant(mutant.toCPointer<ByteVar>(), initialowner)
}

public actual fun KeInitializeQueue(queue: Long, count: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_KeInitializeQueue(queue.toCPointer<ByteVar>(), count)
}

public actual fun KeInsertHeadQueue(queue: Long, entry: Long): Int =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_KeInsertHeadQueue(queue.toCPointer<ByteVar>(), entry.toCPointer<ByteVar>())

public actual fun KeInsertQueue(queue: Long, entry: Long): Int =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_KeInsertQueue(queue.toCPointer<ByteVar>(), entry.toCPointer<ByteVar>())

public actual fun KeReadStateMutant(mutant: Long): Int =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_KeReadStateMutant(mutant.toCPointer<ByteVar>())

public actual fun KeReadStateQueue(queue: Long): Int =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_KeReadStateQueue(queue.toCPointer<ByteVar>())

public actual fun KeReleaseMutant(mutant: Long, increment: Int, abandoned: Boolean, wait: Boolean): Int =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_KeReleaseMutant(mutant.toCPointer<ByteVar>(), increment, abandoned, wait)

public actual fun KeReleaseQueuedSpinLock(number: KSPIN_LOCK_QUEUE_NUMBER, oldirql: UByte) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_KeReleaseQueuedSpinLock(number, oldirql)
}

public actual fun KeRemoveQueue(queue: Long, waitmode: Byte, timeout: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_KeRemoveQueue(queue.toCPointer<ByteVar>(), waitmode, timeout.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun KeRemoveQueueEx(queue: Long, waitmode: Byte, alertable: Boolean, timeout: Long, entryarray: Long, count: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_KeRemoveQueueEx(queue.toCPointer<ByteVar>(), waitmode, alertable, timeout.toCPointer<ByteVar>(), entryarray.toCPointer<ByteVar>(), count)

public actual fun KeRundownQueue(queue: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_KeRundownQueue(queue.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun KeSetIdealProcessorThread(thread: PKTHREAD, processor: UByte): UByte =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_KeSetIdealProcessorThread(thread, processor)

public actual fun KeSetKernelStackSwapEnable(enable: Boolean): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_KeSetKernelStackSwapEnable(enable)

public actual fun KeStackAttachProcess(process: PRKPROCESS, apcstate: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_KeStackAttachProcess(process, apcstate.toCPointer<ByteVar>())
}

public actual fun KeTryToAcquireQueuedSpinLock(number: KSPIN_LOCK_QUEUE_NUMBER, oldirql: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_KeTryToAcquireQueuedSpinLock(number, oldirql.toCPointer<ByteVar>())

public actual fun KeUnstackDetachProcess(apcstate: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_KeUnstackDetachProcess(apcstate.toCPointer<ByteVar>())
}

public actual fun MakeSignature(phcontext: Long, fqop: UInt, pmessage: Long, messageseqno: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_MakeSignature(phcontext.toCPointer<ByteVar>(), fqop, pmessage.toCPointer<ByteVar>(), messageseqno)

public actual fun MapSecurityError(secstatus: HRESULT): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_MapSecurityError(secstatus)

public actual fun MmCanFileBeTruncated(sectionpointer: Long, newfilesize: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_MmCanFileBeTruncated(sectionpointer.toCPointer<ByteVar>(), newfilesize.toCPointer<ByteVar>())

public actual fun MmDoesFileHaveUserWritableReferences(sectionpointer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_MmDoesFileHaveUserWritableReferences(sectionpointer.toCPointer<ByteVar>())

public actual fun MmFlushImageSection(sectionobjectpointer: Long, flushtype: MMFLUSH_TYPE): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_MmFlushImageSection(sectionobjectpointer.toCPointer<ByteVar>(), flushtype)

public actual fun MmForceSectionClosed(sectionobjectpointer: Long, delayclose: Boolean): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_MmForceSectionClosed(sectionobjectpointer.toCPointer<ByteVar>(), delayclose)

public actual fun MmForceSectionClosedEx(sectionobjectpointer: Long, forcecloseflags: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_MmForceSectionClosedEx(sectionobjectpointer.toCPointer<ByteVar>(), forcecloseflags)

public actual fun MmGetMaximumFileSectionSize(): ULong =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_MmGetMaximumFileSectionSize()

public actual fun MmIsFileSectionActive(fssectionpointer: Long, flags: UInt, sectionisactive: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_MmIsFileSectionActive(fssectionpointer.toCPointer<ByteVar>(), flags, sectionisactive.toCPointer<ByteVar>())

public actual fun MmIsRecursiveIoFault(): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_MmIsRecursiveIoFault()

public actual fun MmMdlPagesAreZero(mdl: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_MmMdlPagesAreZero(mdl.toCPointer<ByteVar>())

public actual fun MmPrefetchPages(numberoflists: UInt, readlists: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_MmPrefetchPages(numberoflists, readlists.toCPointer<ByteVar>())

public actual fun MmSetAddressRangeModified(address: Long, length: ULong): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_MmSetAddressRangeModified(address.toCPointer<ByteVar>(), length)

public actual fun NtAccessCheckAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, desiredaccess: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtAccessCheckAndAuditAlarm(subsystemname.toCPointer<ByteVar>(), handleid.toCPointer<ByteVar>(), objecttypename.toCPointer<ByteVar>(), objectname.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>(), desiredaccess, genericmapping.toCPointer<ByteVar>(), objectcreation, grantedaccess.toCPointer<ByteVar>(), accessstatus.toCPointer<ByteVar>(), generateonclose.toCPointer<ByteVar>())

public actual fun NtAccessCheckByTypeAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtAccessCheckByTypeAndAuditAlarm(subsystemname.toCPointer<ByteVar>(), handleid.toCPointer<ByteVar>(), objecttypename.toCPointer<ByteVar>(), objectname.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>(), principalselfsid.toCPointer<ByteVar>(), desiredaccess, audittype, flags, objecttypelist.toCPointer<ByteVar>(), objecttypelistlength, genericmapping.toCPointer<ByteVar>(), objectcreation, grantedaccess.toCPointer<ByteVar>(), accessstatus.toCPointer<ByteVar>(), generateonclose.toCPointer<ByteVar>())

public actual fun NtAccessCheckByTypeResultListAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtAccessCheckByTypeResultListAndAuditAlarm(subsystemname.toCPointer<ByteVar>(), handleid.toCPointer<ByteVar>(), objecttypename.toCPointer<ByteVar>(), objectname.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>(), principalselfsid.toCPointer<ByteVar>(), desiredaccess, audittype, flags, objecttypelist.toCPointer<ByteVar>(), objecttypelistlength, genericmapping.toCPointer<ByteVar>(), objectcreation, grantedaccess.toCPointer<ByteVar>(), accessstatus.toCPointer<ByteVar>(), generateonclose.toCPointer<ByteVar>())

public actual fun NtAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname: Long, handleid: Long, clienttoken: HANDLE, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname.toCPointer<ByteVar>(), handleid.toCPointer<ByteVar>(), clienttoken.toCPointer<ByteVar>(), objecttypename.toCPointer<ByteVar>(), objectname.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>(), principalselfsid.toCPointer<ByteVar>(), desiredaccess, audittype, flags, objecttypelist.toCPointer<ByteVar>(), objecttypelistlength, genericmapping.toCPointer<ByteVar>(), objectcreation, grantedaccess.toCPointer<ByteVar>(), accessstatus.toCPointer<ByteVar>(), generateonclose.toCPointer<ByteVar>())

public actual fun NtAdjustGroupsToken(tokenhandle: HANDLE, resettodefault: Boolean, newstate: Long, bufferlength: UInt, previousstate: Long, returnlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtAdjustGroupsToken(tokenhandle.toCPointer<ByteVar>(), resettodefault, newstate.toCPointer<ByteVar>(), bufferlength, previousstate.toCPointer<ByteVar>(), returnlength.toCPointer<ByteVar>())

public actual fun NtAdjustPrivilegesToken(tokenhandle: HANDLE, disableallprivileges: Boolean, newstate: Long, bufferlength: UInt, previousstate: Long, returnlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtAdjustPrivilegesToken(tokenhandle.toCPointer<ByteVar>(), disableallprivileges, newstate.toCPointer<ByteVar>(), bufferlength, previousstate.toCPointer<ByteVar>(), returnlength.toCPointer<ByteVar>())

public actual fun NtAllocateVirtualMemory(processhandle: HANDLE, baseaddress: Long, zerobits: ULong, regionsize: Long, allocationtype: UInt, protect: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtAllocateVirtualMemory(processhandle.toCPointer<ByteVar>(), baseaddress.toCPointer<ByteVar>(), zerobits, regionsize.toCPointer<ByteVar>(), allocationtype, protect)

public actual fun NtAllocateVirtualMemoryEx(processhandle: HANDLE, baseaddress: Long, regionsize: Long, allocationtype: UInt, pageprotection: UInt, extendedparameters: Long, extendedparametercount: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtAllocateVirtualMemoryEx(processhandle.toCPointer<ByteVar>(), baseaddress.toCPointer<ByteVar>(), regionsize.toCPointer<ByteVar>(), allocationtype, pageprotection, extendedparameters.toCPointer<ByteVar>(), extendedparametercount)

public actual fun NtCancelIoFileEx(filehandle: HANDLE, iorequesttocancel: Long, iostatusblock: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtCancelIoFileEx(filehandle.toCPointer<ByteVar>(), iorequesttocancel.toCPointer<ByteVar>(), iostatusblock.toCPointer<ByteVar>())

public actual fun NtCloseObjectAuditAlarm(subsystemname: Long, handleid: Long, generateonclose: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtCloseObjectAuditAlarm(subsystemname.toCPointer<ByteVar>(), handleid.toCPointer<ByteVar>(), generateonclose)

public actual fun NtCreateDirectoryObject(directoryhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtCreateDirectoryObject(directoryhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>())

public actual fun NtCreateEvent(eventhandle: Long, desiredaccess: UInt, objectattributes: Long, eventtype: EVENT_TYPE, initialstate: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtCreateEvent(eventhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), eventtype, initialstate)

public actual fun NtCreateFile(filehandle: Long, desiredaccess: FILE_ACCESS_RIGHTS, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: FILE_FLAGS_AND_ATTRIBUTES, shareaccess: FILE_SHARE_MODE, createdisposition: NTCREATEFILE_CREATE_DISPOSITION, createoptions: NTCREATEFILE_CREATE_OPTIONS, eabuffer: Long, ealength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtCreateFile(filehandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), iostatusblock.toCPointer<ByteVar>(), allocationsize.toCPointer<ByteVar>(), fileattributes, shareaccess, createdisposition, createoptions, eabuffer.toCPointer<ByteVar>(), ealength)

public actual fun NtCreateSection(sectionhandle: Long, desiredaccess: UInt, objectattributes: Long, maximumsize: Long, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: HANDLE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtCreateSection(sectionhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), maximumsize.toCPointer<ByteVar>(), sectionpageprotection, allocationattributes, filehandle.toCPointer<ByteVar>())

public actual fun NtCreateSectionEx(sectionhandle: Long, desiredaccess: UInt, objectattributes: Long, maximumsize: Long, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: HANDLE, extendedparameters: Long, extendedparametercount: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtCreateSectionEx(sectionhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), maximumsize.toCPointer<ByteVar>(), sectionpageprotection, allocationattributes, filehandle.toCPointer<ByteVar>(), extendedparameters.toCPointer<ByteVar>(), extendedparametercount)

public actual fun NtDeleteFile(objectattributes: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtDeleteFile(objectattributes.toCPointer<ByteVar>())

public actual fun NtDeleteObjectAuditAlarm(subsystemname: Long, handleid: Long, generateonclose: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtDeleteObjectAuditAlarm(subsystemname.toCPointer<ByteVar>(), handleid.toCPointer<ByteVar>(), generateonclose)

public actual fun NtDuplicateObject(sourceprocesshandle: HANDLE, sourcehandle: HANDLE, targetprocesshandle: HANDLE, targethandle: Long, desiredaccess: UInt, handleattributes: UInt, options: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtDuplicateObject(sourceprocesshandle.toCPointer<ByteVar>(), sourcehandle.toCPointer<ByteVar>(), targetprocesshandle.toCPointer<ByteVar>(), targethandle.toCPointer<ByteVar>(), desiredaccess, handleattributes, options)

public actual fun NtDuplicateToken(existingtokenhandle: HANDLE, desiredaccess: UInt, objectattributes: Long, effectiveonly: Boolean, tokentype: TOKEN_TYPE, newtokenhandle: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtDuplicateToken(existingtokenhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), effectiveonly, tokentype, newtokenhandle.toCPointer<ByteVar>())

public actual fun NtFilterToken(existingtokenhandle: HANDLE, flags: UInt, sidstodisable: Long, privilegestodelete: Long, restrictedsids: Long, newtokenhandle: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtFilterToken(existingtokenhandle.toCPointer<ByteVar>(), flags, sidstodisable.toCPointer<ByteVar>(), privilegestodelete.toCPointer<ByteVar>(), restrictedsids.toCPointer<ByteVar>(), newtokenhandle.toCPointer<ByteVar>())

public actual fun NtFlushBuffersFile(filehandle: HANDLE, iostatusblock: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtFlushBuffersFile(filehandle.toCPointer<ByteVar>(), iostatusblock.toCPointer<ByteVar>())

public actual fun NtFlushBuffersFileEx(filehandle: HANDLE, flags: UInt, parameters: Long, parameterssize: UInt, iostatusblock: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtFlushBuffersFileEx(filehandle.toCPointer<ByteVar>(), flags, parameters.toCPointer<ByteVar>(), parameterssize, iostatusblock.toCPointer<ByteVar>())

public actual fun NtFlushVirtualMemory(processhandle: HANDLE, baseaddress: Long, regionsize: Long, iostatus: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtFlushVirtualMemory(processhandle.toCPointer<ByteVar>(), baseaddress.toCPointer<ByteVar>(), regionsize.toCPointer<ByteVar>(), iostatus.toCPointer<ByteVar>())

public actual fun NtFreeVirtualMemory(processhandle: HANDLE, baseaddress: Long, regionsize: Long, freetype: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtFreeVirtualMemory(processhandle.toCPointer<ByteVar>(), baseaddress.toCPointer<ByteVar>(), regionsize.toCPointer<ByteVar>(), freetype)

public actual fun NtFsControlFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, fscontrolcode: UInt, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt): NTSTATUS =
    0

public actual fun NtImpersonateAnonymousToken(threadhandle: HANDLE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtImpersonateAnonymousToken(threadhandle.toCPointer<ByteVar>())

public actual fun NtLockFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, byteoffset: Long, length: Long, key: UInt, failimmediately: Boolean, exclusivelock: Boolean): NTSTATUS =
    0

public actual fun NtNotifyChangeKey(keyhandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, completionfilter: UInt, watchtree: Boolean, buffer: Long, buffersize: UInt, asynchronous: Boolean): NTSTATUS =
    0

public actual fun NtOpenDirectoryObject(directoryhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtOpenDirectoryObject(directoryhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>())

public actual fun NtOpenFile(filehandle: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, shareaccess: UInt, openoptions: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtOpenFile(filehandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), iostatusblock.toCPointer<ByteVar>(), shareaccess, openoptions)

public actual fun NtOpenObjectAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, clienttoken: HANDLE, desiredaccess: UInt, grantedaccess: UInt, privileges: Long, objectcreation: Boolean, accessgranted: Boolean, generateonclose: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtOpenObjectAuditAlarm(subsystemname.toCPointer<ByteVar>(), handleid.toCPointer<ByteVar>(), objecttypename.toCPointer<ByteVar>(), objectname.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>(), clienttoken.toCPointer<ByteVar>(), desiredaccess, grantedaccess, privileges.toCPointer<ByteVar>(), objectcreation, accessgranted, generateonclose.toCPointer<ByteVar>())

public actual fun NtOpenProcessToken(processhandle: HANDLE, desiredaccess: UInt, tokenhandle: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtOpenProcessToken(processhandle.toCPointer<ByteVar>(), desiredaccess, tokenhandle.toCPointer<ByteVar>())

public actual fun NtOpenProcessTokenEx(processhandle: HANDLE, desiredaccess: UInt, handleattributes: UInt, tokenhandle: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtOpenProcessTokenEx(processhandle.toCPointer<ByteVar>(), desiredaccess, handleattributes, tokenhandle.toCPointer<ByteVar>())

public actual fun NtOpenSymbolicLinkObject(linkhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtOpenSymbolicLinkObject(linkhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>())

public actual fun NtOpenThreadToken(threadhandle: HANDLE, desiredaccess: UInt, openasself: Boolean, tokenhandle: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtOpenThreadToken(threadhandle.toCPointer<ByteVar>(), desiredaccess, openasself, tokenhandle.toCPointer<ByteVar>())

public actual fun NtOpenThreadTokenEx(threadhandle: HANDLE, desiredaccess: UInt, openasself: Boolean, handleattributes: UInt, tokenhandle: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtOpenThreadTokenEx(threadhandle.toCPointer<ByteVar>(), desiredaccess, openasself, handleattributes, tokenhandle.toCPointer<ByteVar>())

public actual fun NtPrivilegeCheck(clienttoken: HANDLE, requiredprivileges: Long, result: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtPrivilegeCheck(clienttoken.toCPointer<ByteVar>(), requiredprivileges.toCPointer<ByteVar>(), result.toCPointer<ByteVar>())

public actual fun NtPrivilegeObjectAuditAlarm(subsystemname: Long, handleid: Long, clienttoken: HANDLE, desiredaccess: UInt, privileges: Long, accessgranted: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtPrivilegeObjectAuditAlarm(subsystemname.toCPointer<ByteVar>(), handleid.toCPointer<ByteVar>(), clienttoken.toCPointer<ByteVar>(), desiredaccess, privileges.toCPointer<ByteVar>(), accessgranted)

public actual fun NtPrivilegedServiceAuditAlarm(subsystemname: Long, servicename: Long, clienttoken: HANDLE, privileges: Long, accessgranted: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtPrivilegedServiceAuditAlarm(subsystemname.toCPointer<ByteVar>(), servicename.toCPointer<ByteVar>(), clienttoken.toCPointer<ByteVar>(), privileges.toCPointer<ByteVar>(), accessgranted)

public actual fun NtQueryDirectoryFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, returnsingleentry: Boolean, filename: Long, restartscan: Boolean): NTSTATUS =
    0

public actual fun NtQueryDirectoryFileEx(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, queryflags: UInt, filename: Long): NTSTATUS =
    0

public actual fun NtQueryDirectoryObject(directoryhandle: HANDLE, buffer: Long, length: UInt, returnsingleentry: Boolean, restartscan: Boolean, context: Long, returnlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtQueryDirectoryObject(directoryhandle.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), length, returnsingleentry, restartscan, context.toCPointer<ByteVar>(), returnlength.toCPointer<ByteVar>())

public actual fun NtQueryEaFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt, returnsingleentry: Boolean, ealist: Long, ealistlength: UInt, eaindex: Long, restartscan: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtQueryEaFile(filehandle.toCPointer<ByteVar>(), iostatusblock.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), length, returnsingleentry, ealist.toCPointer<ByteVar>(), ealistlength, eaindex.toCPointer<ByteVar>(), restartscan)

public actual fun NtQueryFullAttributesFile(objectattributes: Long, fileinformation: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtQueryFullAttributesFile(objectattributes.toCPointer<ByteVar>(), fileinformation.toCPointer<ByteVar>())

public actual fun NtQueryInformationByName(objectattributes: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtQueryInformationByName(objectattributes.toCPointer<ByteVar>(), iostatusblock.toCPointer<ByteVar>(), fileinformation.toCPointer<ByteVar>(), length, fileinformationclass)

public actual fun NtQueryInformationFile(filehandle: HANDLE, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtQueryInformationFile(filehandle.toCPointer<ByteVar>(), iostatusblock.toCPointer<ByteVar>(), fileinformation.toCPointer<ByteVar>(), length, fileinformationclass)

public actual fun NtQueryInformationToken(tokenhandle: HANDLE, tokeninformationclass: TOKEN_INFORMATION_CLASS, tokeninformation: Long, tokeninformationlength: UInt, returnlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtQueryInformationToken(tokenhandle.toCPointer<ByteVar>(), tokeninformationclass, tokeninformation.toCPointer<ByteVar>(), tokeninformationlength, returnlength.toCPointer<ByteVar>())

public actual fun NtQueryQuotaInformationFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt, returnsingleentry: Boolean, sidlist: Long, sidlistlength: UInt, startsid: PSID, restartscan: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtQueryQuotaInformationFile(filehandle.toCPointer<ByteVar>(), iostatusblock.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), length, returnsingleentry, sidlist.toCPointer<ByteVar>(), sidlistlength, startsid.toCPointer<ByteVar>(), restartscan)

public actual fun NtQuerySecurityObject(handle: HANDLE, securityinformation: UInt, securitydescriptor: PSECURITY_DESCRIPTOR, length: UInt, lengthneeded: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtQuerySecurityObject(handle.toCPointer<ByteVar>(), securityinformation, securitydescriptor.toCPointer<ByteVar>(), length, lengthneeded.toCPointer<ByteVar>())

public actual fun NtQuerySymbolicLinkObject(linkhandle: HANDLE, linktarget: Long, returnedlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtQuerySymbolicLinkObject(linkhandle.toCPointer<ByteVar>(), linktarget.toCPointer<ByteVar>(), returnedlength.toCPointer<ByteVar>())

public actual fun NtQueryVirtualMemory(processhandle: HANDLE, baseaddress: Long, memoryinformationclass: MEMORY_INFORMATION_CLASS, memoryinformation: Long, memoryinformationlength: ULong, returnlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtQueryVirtualMemory(processhandle.toCPointer<ByteVar>(), baseaddress.toCPointer<ByteVar>(), memoryinformationclass, memoryinformation.toCPointer<ByteVar>(), memoryinformationlength, returnlength.toCPointer<ByteVar>())

public actual fun NtQueryVolumeInformationFile(filehandle: HANDLE, iostatusblock: Long, fsinformation: Long, length: UInt, fsinformationclass: FS_INFORMATION_CLASS): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtQueryVolumeInformationFile(filehandle.toCPointer<ByteVar>(), iostatusblock.toCPointer<ByteVar>(), fsinformation.toCPointer<ByteVar>(), length, fsinformationclass)

public actual fun NtReadFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, buffer: Long, length: UInt, byteoffset: Long, key: Long): NTSTATUS =
    0

public actual fun NtSetEaFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtSetEaFile(filehandle.toCPointer<ByteVar>(), iostatusblock.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), length)

public actual fun NtSetEvent(eventhandle: HANDLE, previousstate: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtSetEvent(eventhandle.toCPointer<ByteVar>(), previousstate.toCPointer<ByteVar>())

public actual fun NtSetInformationFile(filehandle: HANDLE, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtSetInformationFile(filehandle.toCPointer<ByteVar>(), iostatusblock.toCPointer<ByteVar>(), fileinformation.toCPointer<ByteVar>(), length, fileinformationclass)

public actual fun NtSetInformationToken(tokenhandle: HANDLE, tokeninformationclass: TOKEN_INFORMATION_CLASS, tokeninformation: Long, tokeninformationlength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtSetInformationToken(tokenhandle.toCPointer<ByteVar>(), tokeninformationclass, tokeninformation.toCPointer<ByteVar>(), tokeninformationlength)

public actual fun NtSetInformationVirtualMemory(processhandle: HANDLE, vminformationclass: VIRTUAL_MEMORY_INFORMATION_CLASS, numberofentries: ULong, virtualaddresses: Long, vminformation: Long, vminformationlength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtSetInformationVirtualMemory(processhandle.toCPointer<ByteVar>(), vminformationclass, numberofentries, virtualaddresses.toCPointer<ByteVar>(), vminformation.toCPointer<ByteVar>(), vminformationlength)

public actual fun NtSetQuotaInformationFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtSetQuotaInformationFile(filehandle.toCPointer<ByteVar>(), iostatusblock.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), length)

public actual fun NtSetSecurityObject(handle: HANDLE, securityinformation: UInt, securitydescriptor: PSECURITY_DESCRIPTOR): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtSetSecurityObject(handle.toCPointer<ByteVar>(), securityinformation, securitydescriptor.toCPointer<ByteVar>())

public actual fun NtSetVolumeInformationFile(filehandle: HANDLE, iostatusblock: Long, fsinformation: Long, length: UInt, fsinformationclass: FS_INFORMATION_CLASS): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtSetVolumeInformationFile(filehandle.toCPointer<ByteVar>(), iostatusblock.toCPointer<ByteVar>(), fsinformation.toCPointer<ByteVar>(), length, fsinformationclass)

public actual fun NtUnlockFile(filehandle: HANDLE, iostatusblock: Long, byteoffset: Long, length: Long, key: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_NtUnlockFile(filehandle.toCPointer<ByteVar>(), iostatusblock.toCPointer<ByteVar>(), byteoffset.toCPointer<ByteVar>(), length.toCPointer<ByteVar>(), key)

public actual fun NtWriteFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, buffer: Long, length: UInt, byteoffset: Long, key: Long): NTSTATUS =
    0

public actual fun ObInsertObject(obj: Long, passedaccessstate: Long, desiredaccess: UInt, objectpointerbias: UInt, newobject: Long, handle: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ObInsertObject(obj.toCPointer<ByteVar>(), passedaccessstate.toCPointer<ByteVar>(), desiredaccess, objectpointerbias, newobject.toCPointer<ByteVar>(), handle.toCPointer<ByteVar>())

public actual fun ObIsKernelHandle(handle: HANDLE): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ObIsKernelHandle(handle.toCPointer<ByteVar>())

public actual fun ObMakeTemporaryObject(obj: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ObMakeTemporaryObject(obj.toCPointer<ByteVar>())
}

public actual fun ObOpenObjectByPointer(obj: Long, handleattributes: UInt, passedaccessstate: Long, desiredaccess: UInt, objecttype: POBJECT_TYPE, accessmode: Byte, handle: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ObOpenObjectByPointer(obj.toCPointer<ByteVar>(), handleattributes, passedaccessstate.toCPointer<ByteVar>(), desiredaccess, objecttype, accessmode, handle.toCPointer<ByteVar>())

public actual fun ObOpenObjectByPointerWithTag(obj: Long, handleattributes: UInt, passedaccessstate: Long, desiredaccess: UInt, objecttype: POBJECT_TYPE, accessmode: Byte, tag: UInt, handle: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ObOpenObjectByPointerWithTag(obj.toCPointer<ByteVar>(), handleattributes, passedaccessstate.toCPointer<ByteVar>(), desiredaccess, objecttype, accessmode, tag, handle.toCPointer<ByteVar>())

public actual fun ObQueryNameString(obj: Long, objectnameinfo: Long, length: UInt, returnlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ObQueryNameString(obj.toCPointer<ByteVar>(), objectnameinfo.toCPointer<ByteVar>(), length, returnlength.toCPointer<ByteVar>())

public actual fun ObQueryObjectAuditingByHandle(handle: HANDLE, generateonclose: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ObQueryObjectAuditingByHandle(handle.toCPointer<ByteVar>(), generateonclose.toCPointer<ByteVar>())

public actual fun PfxFindPrefix(prefixtable: Long, fullname: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_PfxFindPrefix(prefixtable.toCPointer<ByteVar>(), fullname.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun PfxInitialize(prefixtable: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_PfxInitialize(prefixtable.toCPointer<ByteVar>())
}

public actual fun PfxInsertPrefix(prefixtable: Long, prefix: Long, prefixtableentry: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_PfxInsertPrefix(prefixtable.toCPointer<ByteVar>(), prefix.toCPointer<ByteVar>(), prefixtableentry.toCPointer<ByteVar>())

public actual fun PfxRemovePrefix(prefixtable: Long, prefixtableentry: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_PfxRemovePrefix(prefixtable.toCPointer<ByteVar>(), prefixtableentry.toCPointer<ByteVar>())
}

public actual fun PoQueueShutdownWorkItem(workitem: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_PoQueueShutdownWorkItem(workitem.toCPointer<ByteVar>())

public actual fun PsAssignImpersonationToken(thread: PETHREAD, token: HANDLE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_PsAssignImpersonationToken(thread, token.toCPointer<ByteVar>())

public actual fun PsChargePoolQuota(process: PEPROCESS, pooltype: POOL_TYPE, amount: ULong) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_PsChargePoolQuota(process, pooltype, amount)
}

public actual fun PsChargeProcessPoolQuota(process: PEPROCESS, pooltype: POOL_TYPE, amount: ULong): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_PsChargeProcessPoolQuota(process, pooltype, amount)

public actual fun PsDereferenceImpersonationToken(impersonationtoken: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_PsDereferenceImpersonationToken(impersonationtoken.toCPointer<ByteVar>())
}

public actual fun PsDereferencePrimaryToken(primarytoken: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_PsDereferencePrimaryToken(primarytoken.toCPointer<ByteVar>())
}

public actual fun PsDisableImpersonation(thread: PETHREAD, impersonationstate: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_PsDisableImpersonation(thread, impersonationstate.toCPointer<ByteVar>())

public actual fun PsGetProcessExitTime(): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_PsGetProcessExitTime()

public actual fun PsGetThreadProcess(thread: PETHREAD): PEPROCESS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_PsGetThreadProcess(thread)

public actual fun PsImpersonateClient(thread: PETHREAD, token: Long, copyonopen: Boolean, effectiveonly: Boolean, impersonationlevel: SECURITY_IMPERSONATION_LEVEL): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_PsImpersonateClient(thread, token.toCPointer<ByteVar>(), copyonopen, effectiveonly, impersonationlevel)

public actual fun PsIsDiskCountersEnabled(): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_PsIsDiskCountersEnabled()

public actual fun PsIsSystemThread(thread: PETHREAD): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_PsIsSystemThread(thread)

public actual fun PsIsThreadTerminating(thread: PETHREAD): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_PsIsThreadTerminating(thread)

public actual fun PsLookupProcessByProcessId(processid: HANDLE, process: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_PsLookupProcessByProcessId(processid.toCPointer<ByteVar>(), process.toCPointer<ByteVar>())

public actual fun PsLookupThreadByThreadId(threadid: HANDLE, thread: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_PsLookupThreadByThreadId(threadid.toCPointer<ByteVar>(), thread.toCPointer<ByteVar>())

public actual fun PsReferenceImpersonationToken(thread: PETHREAD, copyonopen: Long, effectiveonly: Long, impersonationlevel: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_PsReferenceImpersonationToken(thread, copyonopen.toCPointer<ByteVar>(), effectiveonly.toCPointer<ByteVar>(), impersonationlevel.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun PsReferencePrimaryToken(process: PEPROCESS): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_PsReferencePrimaryToken(process)?.toLong() ?: 0L

public actual fun PsRestoreImpersonation(thread: PETHREAD, impersonationstate: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_PsRestoreImpersonation(thread, impersonationstate.toCPointer<ByteVar>())
}

public actual fun PsReturnPoolQuota(process: PEPROCESS, pooltype: POOL_TYPE, amount: ULong) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_PsReturnPoolQuota(process, pooltype, amount)
}

public actual fun PsRevertToSelf() {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_PsRevertToSelf()
}

public actual fun PsUpdateDiskCounters(process: PEPROCESS, bytesread: ULong, byteswritten: ULong, readoperationcount: UInt, writeoperationcount: UInt, flushoperationcount: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_PsUpdateDiskCounters(process, bytesread, byteswritten, readoperationcount, writeoperationcount, flushoperationcount)
}

public actual fun QuerySecurityContextToken(phcontext: Long, token: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_QuerySecurityContextToken(phcontext.toCPointer<ByteVar>(), token.toCPointer<ByteVar>())

public actual fun RtlAbsoluteToSelfRelativeSD(absolutesecuritydescriptor: PSECURITY_DESCRIPTOR, selfrelativesecuritydescriptor: PSECURITY_DESCRIPTOR, bufferlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlAbsoluteToSelfRelativeSD(absolutesecuritydescriptor.toCPointer<ByteVar>(), selfrelativesecuritydescriptor.toCPointer<ByteVar>(), bufferlength.toCPointer<ByteVar>())

public actual fun RtlAddAccessAllowedAce(acl: Long, acerevision: UInt, accessmask: UInt, sid: PSID): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlAddAccessAllowedAce(acl.toCPointer<ByteVar>(), acerevision, accessmask, sid.toCPointer<ByteVar>())

public actual fun RtlAddAccessAllowedAceEx(acl: Long, acerevision: UInt, aceflags: UInt, accessmask: UInt, sid: PSID): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlAddAccessAllowedAceEx(acl.toCPointer<ByteVar>(), acerevision, aceflags, accessmask, sid.toCPointer<ByteVar>())

public actual fun RtlAddAce(acl: Long, acerevision: UInt, startingaceindex: UInt, acelist: Long, acelistlength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlAddAce(acl.toCPointer<ByteVar>(), acerevision, startingaceindex, acelist.toCPointer<ByteVar>(), acelistlength)

public actual fun RtlAllocateAndInitializeSid(identifierauthority: Long, subauthoritycount: UByte, subauthority0: UInt, subauthority1: UInt, subauthority2: UInt, subauthority3: UInt, subauthority4: UInt, subauthority5: UInt, subauthority6: UInt, subauthority7: UInt, sid: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlAllocateAndInitializeSid(identifierauthority.toCPointer<ByteVar>(), subauthoritycount, subauthority0, subauthority1, subauthority2, subauthority3, subauthority4, subauthority5, subauthority6, subauthority7, sid.toCPointer<ByteVar>())

public actual fun RtlAllocateAndInitializeSidEx(identifierauthority: Long, subauthoritycount: UByte, subauthorities: Long, sid: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlAllocateAndInitializeSidEx(identifierauthority.toCPointer<ByteVar>(), subauthoritycount, subauthorities.toCPointer<ByteVar>(), sid.toCPointer<ByteVar>())

public actual fun RtlAllocateHeap(heaphandle: Long, flags: UInt, size: ULong): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlAllocateHeap(heaphandle.toCPointer<ByteVar>(), flags, size)?.toLong() ?: 0L

public actual fun RtlAppendStringToString(destination: Long, source: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlAppendStringToString(destination.toCPointer<ByteVar>(), source.toCPointer<ByteVar>())

public actual fun RtlCompareAltitudes(altitude1: Long, altitude2: Long): Int =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlCompareAltitudes(altitude1.toCPointer<ByteVar>(), altitude2.toCPointer<ByteVar>())

public actual fun RtlCompareMemoryUlong(source: Long, length: ULong, pattern: UInt): ULong =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlCompareMemoryUlong(source.toCPointer<ByteVar>(), length, pattern)

public actual fun RtlCompressBuffer(compressionformatandengine: UShort, uncompressedbuffer: Long, uncompressedbuffersize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, uncompressedchunksize: UInt, finalcompressedsize: Long, workspace: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlCompressBuffer(compressionformatandengine, uncompressedbuffer.toCPointer<ByteVar>(), uncompressedbuffersize, compressedbuffer.toCPointer<ByteVar>(), compressedbuffersize, uncompressedchunksize, finalcompressedsize.toCPointer<ByteVar>(), workspace.toCPointer<ByteVar>())

public actual fun RtlCompressChunks(uncompressedbuffer: Long, uncompressedbuffersize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, compresseddatainfo: Long, compresseddatainfolength: UInt, workspace: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlCompressChunks(uncompressedbuffer.toCPointer<ByteVar>(), uncompressedbuffersize, compressedbuffer.toCPointer<ByteVar>(), compressedbuffersize, compresseddatainfo.toCPointer<ByteVar>(), compresseddatainfolength, workspace.toCPointer<ByteVar>())

public actual fun RtlCopyLuid(destinationluid: Long, sourceluid: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlCopyLuid(destinationluid.toCPointer<ByteVar>(), sourceluid.toCPointer<ByteVar>())
}

public actual fun RtlCopySid(destinationsidlength: UInt, destinationsid: PSID, sourcesid: PSID): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlCopySid(destinationsidlength, destinationsid.toCPointer<ByteVar>(), sourcesid.toCPointer<ByteVar>())

public actual fun RtlCreateAcl(acl: Long, acllength: UInt, aclrevision: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlCreateAcl(acl.toCPointer<ByteVar>(), acllength, aclrevision)

public actual fun RtlCreateHeap(flags: UInt, heapbase: Long, reservesize: ULong, commitsize: ULong, lock: Long, parameters: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlCreateHeap(flags, heapbase.toCPointer<ByteVar>(), reservesize, commitsize, lock.toCPointer<ByteVar>(), parameters.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RtlCreateServiceSid(servicename: Long, servicesid: PSID, servicesidlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlCreateServiceSid(servicename.toCPointer<ByteVar>(), servicesid.toCPointer<ByteVar>(), servicesidlength.toCPointer<ByteVar>())

public actual fun RtlCreateSystemVolumeInformationFolder(volumerootpath: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlCreateSystemVolumeInformationFolder(volumerootpath.toCPointer<ByteVar>())

public actual fun RtlCreateUnicodeString(destinationstring: Long, sourcestring: PCWSTR): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlCreateUnicodeString(destinationstring.toCPointer<ByteVar>(), sourcestring.toCPointer<ByteVar>())

public actual fun RtlCreateVirtualAccountSid(name: Long, basesubauthority: UInt, sid: PSID, sidlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlCreateVirtualAccountSid(name.toCPointer<ByteVar>(), basesubauthority, sid.toCPointer<ByteVar>(), sidlength.toCPointer<ByteVar>())

public actual fun RtlCustomCPToUnicodeN(customcp: Long, unicodestring: PWSTR, maxbytesinunicodestring: UInt, bytesinunicodestring: Long, customcpstring: PCSTR, bytesincustomcpstring: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlCustomCPToUnicodeN(customcp.toCPointer<ByteVar>(), unicodestring.toCPointer<ByteVar>(), maxbytesinunicodestring, bytesinunicodestring.toCPointer<ByteVar>(), customcpstring.toCPointer<ByteVar>(), bytesincustomcpstring)

public actual fun RtlDecompressBuffer(compressionformat: UShort, uncompressedbuffer: Long, uncompressedbuffersize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, finaluncompressedsize: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlDecompressBuffer(compressionformat, uncompressedbuffer.toCPointer<ByteVar>(), uncompressedbuffersize, compressedbuffer.toCPointer<ByteVar>(), compressedbuffersize, finaluncompressedsize.toCPointer<ByteVar>())

public actual fun RtlDecompressBufferEx(compressionformat: UShort, uncompressedbuffer: Long, uncompressedbuffersize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, finaluncompressedsize: Long, workspace: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlDecompressBufferEx(compressionformat, uncompressedbuffer.toCPointer<ByteVar>(), uncompressedbuffersize, compressedbuffer.toCPointer<ByteVar>(), compressedbuffersize, finaluncompressedsize.toCPointer<ByteVar>(), workspace.toCPointer<ByteVar>())

public actual fun RtlDecompressBufferEx2(compressionformat: UShort, uncompressedbuffer: Long, uncompressedbuffersize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, uncompressedchunksize: UInt, finaluncompressedsize: Long, workspace: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlDecompressBufferEx2(compressionformat, uncompressedbuffer.toCPointer<ByteVar>(), uncompressedbuffersize, compressedbuffer.toCPointer<ByteVar>(), compressedbuffersize, uncompressedchunksize, finaluncompressedsize.toCPointer<ByteVar>(), workspace.toCPointer<ByteVar>())

public actual fun RtlDecompressChunks(uncompressedbuffer: Long, uncompressedbuffersize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, compressedtail: Long, compressedtailsize: UInt, compresseddatainfo: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlDecompressChunks(uncompressedbuffer.toCPointer<ByteVar>(), uncompressedbuffersize, compressedbuffer.toCPointer<ByteVar>(), compressedbuffersize, compressedtail.toCPointer<ByteVar>(), compressedtailsize, compresseddatainfo.toCPointer<ByteVar>())

public actual fun RtlDecompressFragment(compressionformat: UShort, uncompressedfragment: Long, uncompressedfragmentsize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, fragmentoffset: UInt, finaluncompressedsize: Long, workspace: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlDecompressFragment(compressionformat, uncompressedfragment.toCPointer<ByteVar>(), uncompressedfragmentsize, compressedbuffer.toCPointer<ByteVar>(), compressedbuffersize, fragmentoffset, finaluncompressedsize.toCPointer<ByteVar>(), workspace.toCPointer<ByteVar>())

public actual fun RtlDecompressFragmentEx(compressionformat: UShort, uncompressedfragment: Long, uncompressedfragmentsize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, fragmentoffset: UInt, uncompressedchunksize: UInt, finaluncompressedsize: Long, workspace: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlDecompressFragmentEx(compressionformat, uncompressedfragment.toCPointer<ByteVar>(), uncompressedfragmentsize, compressedbuffer.toCPointer<ByteVar>(), compressedbuffersize, fragmentoffset, uncompressedchunksize, finaluncompressedsize.toCPointer<ByteVar>(), workspace.toCPointer<ByteVar>())

public actual fun RtlDeleteAce(acl: Long, aceindex: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlDeleteAce(acl.toCPointer<ByteVar>(), aceindex)

public actual fun RtlDescribeChunk(compressionformat: UShort, compressedbuffer: Long, endofcompressedbufferplus1: Long, chunkbuffer: Long, chunksize: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlDescribeChunk(compressionformat, compressedbuffer.toCPointer<ByteVar>(), endofcompressedbufferplus1.toCPointer<ByteVar>(), chunkbuffer.toCPointer<ByteVar>(), chunksize.toCPointer<ByteVar>())

public actual fun RtlDestroyHeap(heaphandle: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlDestroyHeap(heaphandle.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RtlDosPathNameToNtPathName_U_WithStatus(dosfilename: PCWSTR, ntfilename: Long, filepart: Long, reserved: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlDosPathNameToNtPathName_U_WithStatus(dosfilename.toCPointer<ByteVar>(), ntfilename.toCPointer<ByteVar>(), filepart.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>())

public actual fun RtlDowncaseUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlDowncaseUnicodeString(destinationstring.toCPointer<ByteVar>(), sourcestring.toCPointer<ByteVar>(), allocatedestinationstring)

public actual fun RtlDuplicateUnicodeString(flags: UInt, stringin: Long, stringout: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlDuplicateUnicodeString(flags, stringin.toCPointer<ByteVar>(), stringout.toCPointer<ByteVar>())

public actual fun RtlEqualPrefixSid(sid1: PSID, sid2: PSID): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlEqualPrefixSid(sid1.toCPointer<ByteVar>(), sid2.toCPointer<ByteVar>())

public actual fun RtlEqualSid(sid1: PSID, sid2: PSID): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlEqualSid(sid1.toCPointer<ByteVar>(), sid2.toCPointer<ByteVar>())

public actual fun RtlFindUnicodePrefix(prefixtable: Long, fullname: Long, caseinsensitiveindex: UInt): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlFindUnicodePrefix(prefixtable.toCPointer<ByteVar>(), fullname.toCPointer<ByteVar>(), caseinsensitiveindex)?.toLong() ?: 0L

public actual fun RtlFreeHeap(heaphandle: Long, flags: UInt, baseaddress: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlFreeHeap(heaphandle.toCPointer<ByteVar>(), flags, baseaddress.toCPointer<ByteVar>())

public actual fun RtlFreeSid(sid: PSID): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlFreeSid(sid.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RtlGenerate8dot3Name(name: Long, allowextendedcharacters: Boolean, context: Long, name8dot3: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlGenerate8dot3Name(name.toCPointer<ByteVar>(), allowextendedcharacters, context.toCPointer<ByteVar>(), name8dot3.toCPointer<ByteVar>())

public actual fun RtlGetAce(acl: Long, aceindex: UInt, ace: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlGetAce(acl.toCPointer<ByteVar>(), aceindex, ace.toCPointer<ByteVar>())

public actual fun RtlGetCompressionWorkSpaceSize(compressionformatandengine: UShort, compressbufferworkspacesize: Long, compressfragmentworkspacesize: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlGetCompressionWorkSpaceSize(compressionformatandengine, compressbufferworkspacesize.toCPointer<ByteVar>(), compressfragmentworkspacesize.toCPointer<ByteVar>())

public actual fun RtlGetDaclSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, daclpresent: Long, dacl: Long, dacldefaulted: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlGetDaclSecurityDescriptor(securitydescriptor.toCPointer<ByteVar>(), daclpresent.toCPointer<ByteVar>(), dacl.toCPointer<ByteVar>(), dacldefaulted.toCPointer<ByteVar>())

public actual fun RtlGetGroupSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, group: Long, groupdefaulted: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlGetGroupSecurityDescriptor(securitydescriptor.toCPointer<ByteVar>(), group.toCPointer<ByteVar>(), groupdefaulted.toCPointer<ByteVar>())

public actual fun RtlGetOwnerSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, owner: Long, ownerdefaulted: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlGetOwnerSecurityDescriptor(securitydescriptor.toCPointer<ByteVar>(), owner.toCPointer<ByteVar>(), ownerdefaulted.toCPointer<ByteVar>())

public actual fun RtlGetSaclSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, saclpresent: Long, sacl: Long, sacldefaulted: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlGetSaclSecurityDescriptor(securitydescriptor.toCPointer<ByteVar>(), saclpresent.toCPointer<ByteVar>(), sacl.toCPointer<ByteVar>(), sacldefaulted.toCPointer<ByteVar>())

public actual fun RtlIdentifierAuthoritySid(sid: PSID): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlIdentifierAuthoritySid(sid.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RtlIdnToAscii(flags: UInt, sourcestring: PCWSTR, sourcestringlength: Int, destinationstring: PWSTR, destinationstringlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlIdnToAscii(flags, sourcestring.toCPointer<ByteVar>(), sourcestringlength, destinationstring.toCPointer<ByteVar>(), destinationstringlength.toCPointer<ByteVar>())

public actual fun RtlIdnToNameprepUnicode(flags: UInt, sourcestring: PCWSTR, sourcestringlength: Int, destinationstring: PWSTR, destinationstringlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlIdnToNameprepUnicode(flags, sourcestring.toCPointer<ByteVar>(), sourcestringlength, destinationstring.toCPointer<ByteVar>(), destinationstringlength.toCPointer<ByteVar>())

public actual fun RtlIdnToUnicode(flags: UInt, sourcestring: PCWSTR, sourcestringlength: Int, destinationstring: PWSTR, destinationstringlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlIdnToUnicode(flags, sourcestring.toCPointer<ByteVar>(), sourcestringlength, destinationstring.toCPointer<ByteVar>(), destinationstringlength.toCPointer<ByteVar>())

public actual fun RtlInitCodePageTable(tablebase: Long, codepagetable: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlInitCodePageTable(tablebase.toCPointer<ByteVar>(), codepagetable.toCPointer<ByteVar>())
}

public actual fun RtlInitUnicodeStringEx(destinationstring: Long, sourcestring: PCWSTR): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlInitUnicodeStringEx(destinationstring.toCPointer<ByteVar>(), sourcestring.toCPointer<ByteVar>())

public actual fun RtlInitializeSid(sid: PSID, identifierauthority: Long, subauthoritycount: UByte): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlInitializeSid(sid.toCPointer<ByteVar>(), identifierauthority.toCPointer<ByteVar>(), subauthoritycount)

public actual fun RtlInitializeSidEx(sid: PSID, identifierauthority: Long, subauthoritycount: UByte): NTSTATUS =
    0

public actual fun RtlInitializeUnicodePrefix(prefixtable: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlInitializeUnicodePrefix(prefixtable.toCPointer<ByteVar>())
}

public actual fun RtlInsertUnicodePrefix(prefixtable: Long, prefix: Long, prefixtableentry: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlInsertUnicodePrefix(prefixtable.toCPointer<ByteVar>(), prefix.toCPointer<ByteVar>(), prefixtableentry.toCPointer<ByteVar>())

public actual fun RtlIsCloudFilesPlaceholder(fileattributes: UInt, reparsetag: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlIsCloudFilesPlaceholder(fileattributes, reparsetag)

public actual fun RtlIsDosDeviceName_U(dosfilename: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlIsDosDeviceName_U(dosfilename.toCPointer<ByteVar>())

public actual fun RtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag)

public actual fun RtlIsNormalizedString(normform: UInt, sourcestring: PCWSTR, sourcestringlength: Int, normalized: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlIsNormalizedString(normform, sourcestring.toCPointer<ByteVar>(), sourcestringlength, normalized.toCPointer<ByteVar>())

public actual fun RtlIsPartialPlaceholder(fileattributes: UInt, reparsetag: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlIsPartialPlaceholder(fileattributes, reparsetag)

public actual fun RtlIsPartialPlaceholderFileHandle(filehandle: HANDLE, ispartialplaceholder: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlIsPartialPlaceholderFileHandle(filehandle.toCPointer<ByteVar>(), ispartialplaceholder.toCPointer<ByteVar>())

public actual fun RtlIsPartialPlaceholderFileInfo(infobuffer: Long, infoclass: FILE_INFORMATION_CLASS, ispartialplaceholder: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlIsPartialPlaceholderFileInfo(infobuffer.toCPointer<ByteVar>(), infoclass, ispartialplaceholder.toCPointer<ByteVar>())

public actual fun RtlIsSandboxedToken(context: Long, previousmode: Byte): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlIsSandboxedToken(context.toCPointer<ByteVar>(), previousmode)

public actual fun RtlIsValidOemCharacter(char: PWSTR): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlIsValidOemCharacter(char.toCPointer<ByteVar>())

public actual fun RtlLengthRequiredSid(subauthoritycount: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlLengthRequiredSid(subauthoritycount)

public actual fun RtlLengthSid(sid: PSID): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlLengthSid(sid.toCPointer<ByteVar>())

public actual fun RtlMultiByteToUnicodeN(unicodestring: PWSTR, maxbytesinunicodestring: UInt, bytesinunicodestring: Long, multibytestring: PCSTR, bytesinmultibytestring: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlMultiByteToUnicodeN(unicodestring.toCPointer<ByteVar>(), maxbytesinunicodestring, bytesinunicodestring.toCPointer<ByteVar>(), multibytestring.toCPointer<ByteVar>(), bytesinmultibytestring)

public actual fun RtlMultiByteToUnicodeSize(bytesinunicodestring: Long, multibytestring: PCSTR, bytesinmultibytestring: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlMultiByteToUnicodeSize(bytesinunicodestring.toCPointer<ByteVar>(), multibytestring.toCPointer<ByteVar>(), bytesinmultibytestring)

public actual fun RtlNextUnicodePrefix(prefixtable: Long, restart: Boolean): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlNextUnicodePrefix(prefixtable.toCPointer<ByteVar>(), restart)?.toLong() ?: 0L

public actual fun RtlNormalizeString(normform: UInt, sourcestring: PCWSTR, sourcestringlength: Int, destinationstring: PWSTR, destinationstringlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlNormalizeString(normform, sourcestring.toCPointer<ByteVar>(), sourcestringlength, destinationstring.toCPointer<ByteVar>(), destinationstringlength.toCPointer<ByteVar>())

public actual fun RtlNtStatusToDosErrorNoTeb(status: NTSTATUS): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlNtStatusToDosErrorNoTeb(status)

public actual fun RtlOemStringToCountedUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlOemStringToCountedUnicodeString(destinationstring.toCPointer<ByteVar>(), sourcestring.toCPointer<ByteVar>(), allocatedestinationstring)

public actual fun RtlOemStringToUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlOemStringToUnicodeString(destinationstring.toCPointer<ByteVar>(), sourcestring.toCPointer<ByteVar>(), allocatedestinationstring)

public actual fun RtlOemToUnicodeN(unicodestring: PWSTR, maxbytesinunicodestring: UInt, bytesinunicodestring: Long, oemstring: PCSTR, bytesinoemstring: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlOemToUnicodeN(unicodestring.toCPointer<ByteVar>(), maxbytesinunicodestring, bytesinunicodestring.toCPointer<ByteVar>(), oemstring.toCPointer<ByteVar>(), bytesinoemstring)

public actual fun RtlPrefixString(string1: Long, string2: Long, caseinsensitive: Boolean): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlPrefixString(string1.toCPointer<ByteVar>(), string2.toCPointer<ByteVar>(), caseinsensitive)

public actual fun RtlQueryPackageIdentity(tokenobject: Long, packagefullname: PWSTR, packagesize: Long, appid: PWSTR, appidsize: Long, packaged: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlQueryPackageIdentity(tokenobject.toCPointer<ByteVar>(), packagefullname.toCPointer<ByteVar>(), packagesize.toCPointer<ByteVar>(), appid.toCPointer<ByteVar>(), appidsize.toCPointer<ByteVar>(), packaged.toCPointer<ByteVar>())

public actual fun RtlQueryPackageIdentityEx(tokenobject: Long, packagefullname: PWSTR, packagesize: Long, appid: PWSTR, appidsize: Long, dynamicid: Long, flags: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlQueryPackageIdentityEx(tokenobject.toCPointer<ByteVar>(), packagefullname.toCPointer<ByteVar>(), packagesize.toCPointer<ByteVar>(), appid.toCPointer<ByteVar>(), appidsize.toCPointer<ByteVar>(), dynamicid.toCPointer<ByteVar>(), flags.toCPointer<ByteVar>())

public actual fun RtlQueryProcessPlaceholderCompatibilityMode(): Byte =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlQueryProcessPlaceholderCompatibilityMode()

public actual fun RtlQueryThreadPlaceholderCompatibilityMode(): Byte =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlQueryThreadPlaceholderCompatibilityMode()

public actual fun RtlRandom(seed: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlRandom(seed.toCPointer<ByteVar>())

public actual fun RtlRandomEx(seed: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlRandomEx(seed.toCPointer<ByteVar>())

public actual fun RtlRemoveUnicodePrefix(prefixtable: Long, prefixtableentry: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlRemoveUnicodePrefix(prefixtable.toCPointer<ByteVar>(), prefixtableentry.toCPointer<ByteVar>())
}

public actual fun RtlReplaceSidInSd(securitydescriptor: PSECURITY_DESCRIPTOR, oldsid: PSID, newsid: PSID, numchanges: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlReplaceSidInSd(securitydescriptor.toCPointer<ByteVar>(), oldsid.toCPointer<ByteVar>(), newsid.toCPointer<ByteVar>(), numchanges.toCPointer<ByteVar>())

public actual fun RtlReserveChunk(compressionformat: UShort, compressedbuffer: Long, endofcompressedbufferplus1: Long, chunkbuffer: Long, chunksize: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlReserveChunk(compressionformat, compressedbuffer.toCPointer<ByteVar>(), endofcompressedbufferplus1.toCPointer<ByteVar>(), chunkbuffer.toCPointer<ByteVar>(), chunksize)

public actual fun RtlSecondsSince1970ToTime(elapsedseconds: UInt, time: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlSecondsSince1970ToTime(elapsedseconds, time.toCPointer<ByteVar>())
}

public actual fun RtlSecondsSince1980ToTime(elapsedseconds: UInt, time: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlSecondsSince1980ToTime(elapsedseconds, time.toCPointer<ByteVar>())
}

public actual fun RtlSelfRelativeToAbsoluteSD(selfrelativesecuritydescriptor: PSECURITY_DESCRIPTOR, absolutesecuritydescriptor: PSECURITY_DESCRIPTOR, absolutesecuritydescriptorsize: Long, dacl: Long, daclsize: Long, sacl: Long, saclsize: Long, owner: PSID, ownersize: Long, primarygroup: PSID, primarygroupsize: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlSelfRelativeToAbsoluteSD(selfrelativesecuritydescriptor.toCPointer<ByteVar>(), absolutesecuritydescriptor.toCPointer<ByteVar>(), absolutesecuritydescriptorsize.toCPointer<ByteVar>(), dacl.toCPointer<ByteVar>(), daclsize.toCPointer<ByteVar>(), sacl.toCPointer<ByteVar>(), saclsize.toCPointer<ByteVar>(), owner.toCPointer<ByteVar>(), ownersize.toCPointer<ByteVar>(), primarygroup.toCPointer<ByteVar>(), primarygroupsize.toCPointer<ByteVar>())

public actual fun RtlSetGroupSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, group: PSID, groupdefaulted: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlSetGroupSecurityDescriptor(securitydescriptor.toCPointer<ByteVar>(), group.toCPointer<ByteVar>(), groupdefaulted)

public actual fun RtlSetOwnerSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, owner: PSID, ownerdefaulted: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlSetOwnerSecurityDescriptor(securitydescriptor.toCPointer<ByteVar>(), owner.toCPointer<ByteVar>(), ownerdefaulted)

public actual fun RtlSetProcessPlaceholderCompatibilityMode(mode: Byte): Byte =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlSetProcessPlaceholderCompatibilityMode(mode)

public actual fun RtlSetThreadPlaceholderCompatibilityMode(mode: Byte): Byte =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlSetThreadPlaceholderCompatibilityMode(mode)

public actual fun RtlSubAuthorityCountSid(sid: PSID): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlSubAuthorityCountSid(sid.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RtlSubAuthoritySid(sid: PSID, subauthority: UInt): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlSubAuthoritySid(sid.toCPointer<ByteVar>(), subauthority)?.toLong() ?: 0L

public actual fun RtlTimeToSecondsSince1980(time: Long, elapsedseconds: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlTimeToSecondsSince1980(time.toCPointer<ByteVar>(), elapsedseconds.toCPointer<ByteVar>())

public actual fun RtlUnicodeStringToCountedOemString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlUnicodeStringToCountedOemString(destinationstring.toCPointer<ByteVar>(), sourcestring.toCPointer<ByteVar>(), allocatedestinationstring)

public actual fun RtlUnicodeToCustomCPN(customcp: Long, customcpstring: PSTR, maxbytesincustomcpstring: UInt, bytesincustomcpstring: Long, unicodestring: PCWSTR, bytesinunicodestring: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlUnicodeToCustomCPN(customcp.toCPointer<ByteVar>(), customcpstring.toCPointer<ByteVar>(), maxbytesincustomcpstring, bytesincustomcpstring.toCPointer<ByteVar>(), unicodestring.toCPointer<ByteVar>(), bytesinunicodestring)

public actual fun RtlUnicodeToMultiByteN(multibytestring: PSTR, maxbytesinmultibytestring: UInt, bytesinmultibytestring: Long, unicodestring: Long, bytesinunicodestring: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlUnicodeToMultiByteN(multibytestring.toCPointer<ByteVar>(), maxbytesinmultibytestring, bytesinmultibytestring.toCPointer<ByteVar>(), unicodestring.toCPointer<ByteVar>(), bytesinunicodestring)

public actual fun RtlUnicodeToOemN(oemstring: PSTR, maxbytesinoemstring: UInt, bytesinoemstring: Long, unicodestring: Long, bytesinunicodestring: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlUnicodeToOemN(oemstring.toCPointer<ByteVar>(), maxbytesinoemstring, bytesinoemstring.toCPointer<ByteVar>(), unicodestring.toCPointer<ByteVar>(), bytesinunicodestring)

public actual fun RtlUpcaseUnicodeStringToCountedOemString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlUpcaseUnicodeStringToCountedOemString(destinationstring.toCPointer<ByteVar>(), sourcestring.toCPointer<ByteVar>(), allocatedestinationstring)

public actual fun RtlUpcaseUnicodeStringToOemString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlUpcaseUnicodeStringToOemString(destinationstring.toCPointer<ByteVar>(), sourcestring.toCPointer<ByteVar>(), allocatedestinationstring)

public actual fun RtlUpcaseUnicodeToCustomCPN(customcp: Long, customcpstring: PSTR, maxbytesincustomcpstring: UInt, bytesincustomcpstring: Long, unicodestring: PCWSTR, bytesinunicodestring: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlUpcaseUnicodeToCustomCPN(customcp.toCPointer<ByteVar>(), customcpstring.toCPointer<ByteVar>(), maxbytesincustomcpstring, bytesincustomcpstring.toCPointer<ByteVar>(), unicodestring.toCPointer<ByteVar>(), bytesinunicodestring)

public actual fun RtlUpcaseUnicodeToMultiByteN(multibytestring: PSTR, maxbytesinmultibytestring: UInt, bytesinmultibytestring: Long, unicodestring: Long, bytesinunicodestring: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlUpcaseUnicodeToMultiByteN(multibytestring.toCPointer<ByteVar>(), maxbytesinmultibytestring, bytesinmultibytestring.toCPointer<ByteVar>(), unicodestring.toCPointer<ByteVar>(), bytesinunicodestring)

public actual fun RtlUpcaseUnicodeToOemN(oemstring: PSTR, maxbytesinoemstring: UInt, bytesinoemstring: Long, unicodestring: Long, bytesinunicodestring: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlUpcaseUnicodeToOemN(oemstring.toCPointer<ByteVar>(), maxbytesinoemstring, bytesinoemstring.toCPointer<ByteVar>(), unicodestring.toCPointer<ByteVar>(), bytesinunicodestring)

public actual fun RtlValidSid(sid: PSID): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlValidSid(sid.toCPointer<ByteVar>())

public actual fun RtlValidateUnicodeString(flags: UInt, string: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlValidateUnicodeString(flags, string.toCPointer<ByteVar>())

public actual fun RtlxOemStringToUnicodeSize(oemstring: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlxOemStringToUnicodeSize(oemstring.toCPointer<ByteVar>())

public actual fun RtlxUnicodeStringToOemSize(unicodestring: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_RtlxUnicodeStringToOemSize(unicodestring.toCPointer<ByteVar>())

public actual fun SeAccessCheckFromState(securitydescriptor: PSECURITY_DESCRIPTOR, primarytokeninformation: Long, clienttokeninformation: Long, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: Long, genericmapping: Long, accessmode: Byte, grantedaccess: Long, accessstatus: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeAccessCheckFromState(securitydescriptor.toCPointer<ByteVar>(), primarytokeninformation.toCPointer<ByteVar>(), clienttokeninformation.toCPointer<ByteVar>(), desiredaccess, previouslygrantedaccess, privileges.toCPointer<ByteVar>(), genericmapping.toCPointer<ByteVar>(), accessmode, grantedaccess.toCPointer<ByteVar>(), accessstatus.toCPointer<ByteVar>())

public actual fun SeAccessCheckFromStateEx(securitydescriptor: PSECURITY_DESCRIPTOR, primarytoken: Long, clienttoken: Long, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: Long, genericmapping: Long, accessmode: Byte, grantedaccess: Long, accessstatus: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeAccessCheckFromStateEx(securitydescriptor.toCPointer<ByteVar>(), primarytoken.toCPointer<ByteVar>(), clienttoken.toCPointer<ByteVar>(), desiredaccess, previouslygrantedaccess, privileges.toCPointer<ByteVar>(), genericmapping.toCPointer<ByteVar>(), accessmode, grantedaccess.toCPointer<ByteVar>(), accessstatus.toCPointer<ByteVar>())

public actual fun SeAdjustAccessStateForAccessConstraints(objecttype: Long, securitydescriptor: PSECURITY_DESCRIPTOR, accessstate: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeAdjustAccessStateForAccessConstraints(objecttype.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>(), accessstate.toCPointer<ByteVar>())
}

public actual fun SeAdjustAccessStateForTrustLabel(objecttype: Long, securitydescriptor: PSECURITY_DESCRIPTOR, accessstate: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeAdjustAccessStateForTrustLabel(objecttype.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>(), accessstate.toCPointer<ByteVar>())
}

public actual fun SeAdjustObjectSecurity(objectname: Long, originaldescriptor: PSECURITY_DESCRIPTOR, proposeddescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long, adjusteddescriptor: Long, applyadjusteddescriptor: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeAdjustObjectSecurity(objectname.toCPointer<ByteVar>(), originaldescriptor.toCPointer<ByteVar>(), proposeddescriptor.toCPointer<ByteVar>(), subjectsecuritycontext.toCPointer<ByteVar>(), adjusteddescriptor.toCPointer<ByteVar>(), applyadjusteddescriptor.toCPointer<ByteVar>())

public actual fun SeAppendPrivileges(accessstate: Long, privileges: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeAppendPrivileges(accessstate.toCPointer<ByteVar>(), privileges.toCPointer<ByteVar>())

public actual fun SeAuditFipsCryptoSelftests(bsuccess: Boolean, selftestcode: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeAuditFipsCryptoSelftests(bsuccess, selftestcode)
}

public actual fun SeAuditHardLinkCreation(filename: Long, linkname: Long, bsuccess: Boolean) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeAuditHardLinkCreation(filename.toCPointer<ByteVar>(), linkname.toCPointer<ByteVar>(), bsuccess)
}

public actual fun SeAuditHardLinkCreationWithTransaction(filename: Long, linkname: Long, bsuccess: Boolean, transactionid: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeAuditHardLinkCreationWithTransaction(filename.toCPointer<ByteVar>(), linkname.toCPointer<ByteVar>(), bsuccess, transactionid.toCPointer<ByteVar>())
}

public actual fun SeAuditTransactionStateChange(transactionid: Long, resourcemanagerid: Long, newtransactionstate: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeAuditTransactionStateChange(transactionid.toCPointer<ByteVar>(), resourcemanagerid.toCPointer<ByteVar>(), newtransactionstate)
}

public actual fun SeAuditingAnyFileEventsWithContext(securitydescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeAuditingAnyFileEventsWithContext(securitydescriptor.toCPointer<ByteVar>(), subjectsecuritycontext.toCPointer<ByteVar>())

public actual fun SeAuditingAnyFileEventsWithContextEx(securitydescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long, stagingenabled: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeAuditingAnyFileEventsWithContextEx(securitydescriptor.toCPointer<ByteVar>(), subjectsecuritycontext.toCPointer<ByteVar>(), stagingenabled.toCPointer<ByteVar>())

public actual fun SeAuditingFileEvents(accessgranted: Boolean, securitydescriptor: PSECURITY_DESCRIPTOR): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeAuditingFileEvents(accessgranted, securitydescriptor.toCPointer<ByteVar>())

public actual fun SeAuditingFileEventsWithContext(accessgranted: Boolean, securitydescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeAuditingFileEventsWithContext(accessgranted, securitydescriptor.toCPointer<ByteVar>(), subjectsecuritycontext.toCPointer<ByteVar>())

public actual fun SeAuditingFileEventsWithContextEx(accessgranted: Boolean, securitydescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long, stagingenabled: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeAuditingFileEventsWithContextEx(accessgranted, securitydescriptor.toCPointer<ByteVar>(), subjectsecuritycontext.toCPointer<ByteVar>(), stagingenabled.toCPointer<ByteVar>())

public actual fun SeAuditingFileOrGlobalEvents(accessgranted: Boolean, securitydescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeAuditingFileOrGlobalEvents(accessgranted, securitydescriptor.toCPointer<ByteVar>(), subjectsecuritycontext.toCPointer<ByteVar>())

public actual fun SeAuditingHardLinkEvents(accessgranted: Boolean, securitydescriptor: PSECURITY_DESCRIPTOR): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeAuditingHardLinkEvents(accessgranted, securitydescriptor.toCPointer<ByteVar>())

public actual fun SeAuditingHardLinkEventsWithContext(accessgranted: Boolean, securitydescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeAuditingHardLinkEventsWithContext(accessgranted, securitydescriptor.toCPointer<ByteVar>(), subjectsecuritycontext.toCPointer<ByteVar>())

public actual fun SeCaptureSubjectContextEx(thread: PETHREAD, process: PEPROCESS, subjectcontext: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeCaptureSubjectContextEx(thread, process, subjectcontext.toCPointer<ByteVar>())
}

public actual fun SeCheckForCriticalAceRemoval(currentdescriptor: PSECURITY_DESCRIPTOR, newdescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long, aceremoved: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeCheckForCriticalAceRemoval(currentdescriptor.toCPointer<ByteVar>(), newdescriptor.toCPointer<ByteVar>(), subjectsecuritycontext.toCPointer<ByteVar>(), aceremoved.toCPointer<ByteVar>())
}

public actual fun SeCreateClientSecurity(clientthread: PETHREAD, clientsecurityqos: Long, remotesession: Boolean, clientcontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeCreateClientSecurity(clientthread, clientsecurityqos.toCPointer<ByteVar>(), remotesession, clientcontext.toCPointer<ByteVar>())

public actual fun SeCreateClientSecurityFromSubjectContext(subjectcontext: Long, clientsecurityqos: Long, serverisremote: Boolean, clientcontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeCreateClientSecurityFromSubjectContext(subjectcontext.toCPointer<ByteVar>(), clientsecurityqos.toCPointer<ByteVar>(), serverisremote, clientcontext.toCPointer<ByteVar>())

public actual fun SeDeleteClientSecurity(clientcontext: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeDeleteClientSecurity(clientcontext.toCPointer<ByteVar>())
}

public actual fun SeDeleteObjectAuditAlarm(obj: Long, handle: HANDLE) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeDeleteObjectAuditAlarm(obj.toCPointer<ByteVar>(), handle.toCPointer<ByteVar>())
}

public actual fun SeDeleteObjectAuditAlarmWithTransaction(obj: Long, handle: HANDLE, transactionid: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeDeleteObjectAuditAlarmWithTransaction(obj.toCPointer<ByteVar>(), handle.toCPointer<ByteVar>(), transactionid.toCPointer<ByteVar>())
}

public actual fun SeExamineSacl(sacl: Long, resourcesacl: Long, token: Long, desiredaccess: UInt, accessgranted: Boolean, generateaudit: Long, generatealarm: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeExamineSacl(sacl.toCPointer<ByteVar>(), resourcesacl.toCPointer<ByteVar>(), token.toCPointer<ByteVar>(), desiredaccess, accessgranted, generateaudit.toCPointer<ByteVar>(), generatealarm.toCPointer<ByteVar>())
}

public actual fun SeFilterToken(existingtoken: Long, flags: UInt, sidstodisable: Long, privilegestodelete: Long, restrictedsids: Long, filteredtoken: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeFilterToken(existingtoken.toCPointer<ByteVar>(), flags, sidstodisable.toCPointer<ByteVar>(), privilegestodelete.toCPointer<ByteVar>(), restrictedsids.toCPointer<ByteVar>(), filteredtoken.toCPointer<ByteVar>())

public actual fun SeFreePrivileges(privileges: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeFreePrivileges(privileges.toCPointer<ByteVar>())
}

public actual fun SeImpersonateClient(clientcontext: Long, serverthread: PETHREAD) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeImpersonateClient(clientcontext.toCPointer<ByteVar>(), serverthread)
}

public actual fun SeImpersonateClientEx(clientcontext: Long, serverthread: PETHREAD): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeImpersonateClientEx(clientcontext.toCPointer<ByteVar>(), serverthread)

public actual fun SeLocateProcessImageName(process: PEPROCESS, pimagefilename: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeLocateProcessImageName(process, pimagefilename.toCPointer<ByteVar>())

public actual fun SeMarkLogonSessionForTerminationNotification(logonid: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeMarkLogonSessionForTerminationNotification(logonid.toCPointer<ByteVar>())

public actual fun SeMarkLogonSessionForTerminationNotificationEx(logonid: Long, pserversilo: PESILO): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeMarkLogonSessionForTerminationNotificationEx(logonid.toCPointer<ByteVar>(), pserversilo)

public actual fun SeOpenObjectAuditAlarm(objecttypename: Long, obj: Long, absoluteobjectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, accessstate: Long, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, generateonclose: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeOpenObjectAuditAlarm(objecttypename.toCPointer<ByteVar>(), obj.toCPointer<ByteVar>(), absoluteobjectname.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>(), accessstate.toCPointer<ByteVar>(), objectcreated, accessgranted, accessmode, generateonclose.toCPointer<ByteVar>())
}

public actual fun SeOpenObjectAuditAlarmWithTransaction(objecttypename: Long, obj: Long, absoluteobjectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, accessstate: Long, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, transactionid: Long, generateonclose: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeOpenObjectAuditAlarmWithTransaction(objecttypename.toCPointer<ByteVar>(), obj.toCPointer<ByteVar>(), absoluteobjectname.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>(), accessstate.toCPointer<ByteVar>(), objectcreated, accessgranted, accessmode, transactionid.toCPointer<ByteVar>(), generateonclose.toCPointer<ByteVar>())
}

public actual fun SeOpenObjectForDeleteAuditAlarm(objecttypename: Long, obj: Long, absoluteobjectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, accessstate: Long, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, generateonclose: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeOpenObjectForDeleteAuditAlarm(objecttypename.toCPointer<ByteVar>(), obj.toCPointer<ByteVar>(), absoluteobjectname.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>(), accessstate.toCPointer<ByteVar>(), objectcreated, accessgranted, accessmode, generateonclose.toCPointer<ByteVar>())
}

public actual fun SeOpenObjectForDeleteAuditAlarmWithTransaction(objecttypename: Long, obj: Long, absoluteobjectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, accessstate: Long, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, transactionid: Long, generateonclose: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeOpenObjectForDeleteAuditAlarmWithTransaction(objecttypename.toCPointer<ByteVar>(), obj.toCPointer<ByteVar>(), absoluteobjectname.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>(), accessstate.toCPointer<ByteVar>(), objectcreated, accessgranted, accessmode, transactionid.toCPointer<ByteVar>(), generateonclose.toCPointer<ByteVar>())
}

public actual fun SePrivilegeCheck(requiredprivileges: Long, subjectsecuritycontext: Long, accessmode: Byte): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SePrivilegeCheck(requiredprivileges.toCPointer<ByteVar>(), subjectsecuritycontext.toCPointer<ByteVar>(), accessmode)

public actual fun SeQueryAuthenticationIdToken(token: Long, authenticationid: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeQueryAuthenticationIdToken(token.toCPointer<ByteVar>(), authenticationid.toCPointer<ByteVar>())

public actual fun SeQueryInformationToken(token: Long, tokeninformationclass: TOKEN_INFORMATION_CLASS, tokeninformation: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeQueryInformationToken(token.toCPointer<ByteVar>(), tokeninformationclass, tokeninformation.toCPointer<ByteVar>())

public actual fun SeQuerySecurityDescriptorInfo(securityinformation: Long, securitydescriptor: PSECURITY_DESCRIPTOR, length: Long, objectssecuritydescriptor: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeQuerySecurityDescriptorInfo(securityinformation.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>(), length.toCPointer<ByteVar>(), objectssecuritydescriptor.toCPointer<ByteVar>())

public actual fun SeQueryServerSiloToken(token: Long, pserversilo: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeQueryServerSiloToken(token.toCPointer<ByteVar>(), pserversilo.toCPointer<ByteVar>())

public actual fun SeQuerySessionIdToken(token: Long, sessionid: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeQuerySessionIdToken(token.toCPointer<ByteVar>(), sessionid.toCPointer<ByteVar>())

public actual fun SeQuerySessionIdTokenEx(token: Long, sessionid: Long, isservicesession: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeQuerySessionIdTokenEx(token.toCPointer<ByteVar>(), sessionid.toCPointer<ByteVar>(), isservicesession.toCPointer<ByteVar>())

public actual fun SeRegisterLogonSessionTerminatedRoutine(callbackroutine: PSE_LOGON_SESSION_TERMINATED_ROUTINE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeRegisterLogonSessionTerminatedRoutine(callbackroutine.toLong().toCPointer<ByteVar>())

public actual fun SeRegisterLogonSessionTerminatedRoutineEx(callbackroutine: PSE_LOGON_SESSION_TERMINATED_ROUTINE_EX, context: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeRegisterLogonSessionTerminatedRoutineEx(callbackroutine.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun SeReportSecurityEventWithSubCategory(flags: UInt, sourcename: Long, usersid: PSID, auditparameters: Long, auditsubcategoryid: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeReportSecurityEventWithSubCategory(flags, sourcename.toCPointer<ByteVar>(), usersid.toCPointer<ByteVar>(), auditparameters.toCPointer<ByteVar>(), auditsubcategoryid)

public actual fun SeSetAccessStateGenericMapping(accessstate: Long, genericmapping: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeSetAccessStateGenericMapping(accessstate.toCPointer<ByteVar>(), genericmapping.toCPointer<ByteVar>())
}

public actual fun SeSetSecurityDescriptorInfo(obj: Long, securityinformation: Long, modificationdescriptor: PSECURITY_DESCRIPTOR, objectssecuritydescriptor: Long, pooltype: POOL_TYPE, genericmapping: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeSetSecurityDescriptorInfo(obj.toCPointer<ByteVar>(), securityinformation.toCPointer<ByteVar>(), modificationdescriptor.toCPointer<ByteVar>(), objectssecuritydescriptor.toCPointer<ByteVar>(), pooltype, genericmapping.toCPointer<ByteVar>())

public actual fun SeSetSecurityDescriptorInfoEx(obj: Long, securityinformation: Long, modificationdescriptor: PSECURITY_DESCRIPTOR, objectssecuritydescriptor: Long, autoinheritflags: UInt, pooltype: POOL_TYPE, genericmapping: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeSetSecurityDescriptorInfoEx(obj.toCPointer<ByteVar>(), securityinformation.toCPointer<ByteVar>(), modificationdescriptor.toCPointer<ByteVar>(), objectssecuritydescriptor.toCPointer<ByteVar>(), autoinheritflags, pooltype, genericmapping.toCPointer<ByteVar>())

public actual fun SeShouldCheckForAccessRightsFromParent(objecttype: Long, childdescriptor: PSECURITY_DESCRIPTOR, accessstate: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeShouldCheckForAccessRightsFromParent(objecttype.toCPointer<ByteVar>(), childdescriptor.toCPointer<ByteVar>(), accessstate.toCPointer<ByteVar>())

public actual fun SeTokenFromAccessInformation(accessinformation: Long, token: Long, length: UInt, requiredlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeTokenFromAccessInformation(accessinformation.toCPointer<ByteVar>(), token.toCPointer<ByteVar>(), length, requiredlength.toCPointer<ByteVar>())

public actual fun SeTokenIsAdmin(token: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeTokenIsAdmin(token.toCPointer<ByteVar>())

public actual fun SeTokenIsRestricted(token: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeTokenIsRestricted(token.toCPointer<ByteVar>())

public actual fun SeTokenIsWriteRestricted(token: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeTokenIsWriteRestricted(token.toCPointer<ByteVar>())

public actual fun SeTokenType(token: Long): TOKEN_TYPE =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeTokenType(token.toCPointer<ByteVar>())

public actual fun SeUnregisterLogonSessionTerminatedRoutine(callbackroutine: PSE_LOGON_SESSION_TERMINATED_ROUTINE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeUnregisterLogonSessionTerminatedRoutine(callbackroutine.toLong().toCPointer<ByteVar>())

public actual fun SeUnregisterLogonSessionTerminatedRoutineEx(callbackroutine: PSE_LOGON_SESSION_TERMINATED_ROUTINE_EX, context: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SeUnregisterLogonSessionTerminatedRoutineEx(callbackroutine.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun SecLookupAccountName(name: Long, sidsize: Long, sid: PSID, nameuse: Long, domainsize: Long, referenceddomain: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SecLookupAccountName(name.toCPointer<ByteVar>(), sidsize.toCPointer<ByteVar>(), sid.toCPointer<ByteVar>(), nameuse.toCPointer<ByteVar>(), domainsize.toCPointer<ByteVar>(), referenceddomain.toCPointer<ByteVar>())

public actual fun SecLookupAccountSid(sid: PSID, namesize: Long, namebuffer: Long, domainsize: Long, domainbuffer: Long, nameuse: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SecLookupAccountSid(sid.toCPointer<ByteVar>(), namesize.toCPointer<ByteVar>(), namebuffer.toCPointer<ByteVar>(), domainsize.toCPointer<ByteVar>(), domainbuffer.toCPointer<ByteVar>(), nameuse.toCPointer<ByteVar>())

public actual fun SecLookupWellKnownSid(sidtype: WELL_KNOWN_SID_TYPE, sid: PSID, sidbuffersize: UInt, sidsize: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SecLookupWellKnownSid(sidtype, sid.toCPointer<ByteVar>(), sidbuffersize, sidsize.toCPointer<ByteVar>())

public actual fun SecMakeSPN(serviceclass: Long, servicename: Long, instancename: Long, instanceport: UShort, referrer: Long, spn: Long, length: Long, allocate: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SecMakeSPN(serviceclass.toCPointer<ByteVar>(), servicename.toCPointer<ByteVar>(), instancename.toCPointer<ByteVar>(), instanceport, referrer.toCPointer<ByteVar>(), spn.toCPointer<ByteVar>(), length.toCPointer<ByteVar>(), allocate)

public actual fun SecMakeSPNEx(serviceclass: Long, servicename: Long, instancename: Long, instanceport: UShort, referrer: Long, targetinfo: Long, spn: Long, length: Long, allocate: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SecMakeSPNEx(serviceclass.toCPointer<ByteVar>(), servicename.toCPointer<ByteVar>(), instancename.toCPointer<ByteVar>(), instanceport, referrer.toCPointer<ByteVar>(), targetinfo.toCPointer<ByteVar>(), spn.toCPointer<ByteVar>(), length.toCPointer<ByteVar>(), allocate)

public actual fun SecMakeSPNEx2(serviceclass: Long, servicename: Long, instancename: Long, instanceport: UShort, referrer: Long, intargetinfo: Long, spn: Long, totalsize: Long, allocate: Boolean, istargetinfomarshaled: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SecMakeSPNEx2(serviceclass.toCPointer<ByteVar>(), servicename.toCPointer<ByteVar>(), instancename.toCPointer<ByteVar>(), instanceport, referrer.toCPointer<ByteVar>(), intargetinfo.toCPointer<ByteVar>(), spn.toCPointer<ByteVar>(), totalsize.toCPointer<ByteVar>(), allocate, istargetinfomarshaled)

public actual fun SetContextAttributesW(phcontext: Long, ulattribute: UInt, pbuffer: Long, cbbuffer: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SetContextAttributesW(phcontext.toCPointer<ByteVar>(), ulattribute, pbuffer.toCPointer<ByteVar>(), cbbuffer)

public actual fun SspiAcceptSecurityContextAsync(asynccontext: Long, phcredential: Long, phcontext: Long, pinput: Long, fcontextreq: UInt, targetdatarep: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SspiAcceptSecurityContextAsync(asynccontext.toCPointer<ByteVar>(), phcredential.toCPointer<ByteVar>(), phcontext.toCPointer<ByteVar>(), pinput.toCPointer<ByteVar>(), fcontextreq, targetdatarep, phnewcontext.toCPointer<ByteVar>(), poutput.toCPointer<ByteVar>(), pfcontextattr.toCPointer<ByteVar>(), ptsexpiry.toCPointer<ByteVar>())

public actual fun SspiAcquireCredentialsHandleAsyncA(asynccontext: Long, pszprincipal: PCSTR, pszpackage: PCSTR, fcredentialuse: UInt, pvlogonid: Long, pauthdata: Long, pgetkeyfn: SEC_GET_KEY_FN, pvgetkeyargument: Long, phcredential: Long, ptsexpiry: Long): HRESULT =
    0

public actual fun SspiAcquireCredentialsHandleAsyncW(asynccontext: Long, pszprincipal: Long, pszpackage: Long, fcredentialuse: UInt, pvlogonid: Long, pauthdata: Long, pgetkeyfn: SEC_GET_KEY_FN, pvgetkeyargument: Long, phcredential: Long, ptsexpiry: Long): HRESULT =
    0

public actual fun SspiCreateAsyncContext(): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SspiCreateAsyncContext()?.toLong() ?: 0L

public actual fun SspiDeleteSecurityContextAsync(asynccontext: Long, phcontext: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SspiDeleteSecurityContextAsync(asynccontext.toCPointer<ByteVar>(), phcontext.toCPointer<ByteVar>())

public actual fun SspiFreeAsyncContext(handle: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SspiFreeAsyncContext(handle.toCPointer<ByteVar>())
}

public actual fun SspiFreeCredentialsHandleAsync(asynccontext: Long, phcredential: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SspiFreeCredentialsHandleAsync(asynccontext.toCPointer<ByteVar>(), phcredential.toCPointer<ByteVar>())

public actual fun SspiGetAsyncCallStatus(handle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SspiGetAsyncCallStatus(handle.toCPointer<ByteVar>())

public actual fun SspiInitializeSecurityContextAsyncA(asynccontext: Long, phcredential: Long, phcontext: Long, psztargetname: PCSTR, fcontextreq: UInt, reserved1: UInt, targetdatarep: UInt, pinput: Long, reserved2: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SspiInitializeSecurityContextAsyncA(asynccontext.toCPointer<ByteVar>(), phcredential.toCPointer<ByteVar>(), phcontext.toCPointer<ByteVar>(), psztargetname.toCPointer<ByteVar>(), fcontextreq, reserved1, targetdatarep, pinput.toCPointer<ByteVar>(), reserved2, phnewcontext.toCPointer<ByteVar>(), poutput.toCPointer<ByteVar>(), pfcontextattr.toCPointer<ByteVar>(), ptsexpiry.toCPointer<ByteVar>())

public actual fun SspiInitializeSecurityContextAsyncW(asynccontext: Long, phcredential: Long, phcontext: Long, psztargetname: Long, fcontextreq: UInt, reserved1: UInt, targetdatarep: UInt, pinput: Long, reserved2: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SspiInitializeSecurityContextAsyncW(asynccontext.toCPointer<ByteVar>(), phcredential.toCPointer<ByteVar>(), phcontext.toCPointer<ByteVar>(), psztargetname.toCPointer<ByteVar>(), fcontextreq, reserved1, targetdatarep, pinput.toCPointer<ByteVar>(), reserved2, phnewcontext.toCPointer<ByteVar>(), poutput.toCPointer<ByteVar>(), pfcontextattr.toCPointer<ByteVar>(), ptsexpiry.toCPointer<ByteVar>())

public actual fun SspiReinitAsyncContext(handle: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SspiReinitAsyncContext(handle.toCPointer<ByteVar>())

public actual fun SspiSetAsyncNotifyCallback(context: Long, callback: SspiAsyncNotifyCallback, callbackdata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_SspiSetAsyncNotifyCallback(context.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), callbackdata.toCPointer<ByteVar>())

public actual fun VerifySignature(phcontext: Long, pmessage: Long, messageseqno: UInt, pfqop: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_VerifySignature(phcontext.toCPointer<ByteVar>(), pmessage.toCPointer<ByteVar>(), messageseqno, pfqop.toCPointer<ByteVar>())

public actual fun ZwAccessCheckAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, desiredaccess: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwAccessCheckAndAuditAlarm(subsystemname.toCPointer<ByteVar>(), handleid.toCPointer<ByteVar>(), objecttypename.toCPointer<ByteVar>(), objectname.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>(), desiredaccess, genericmapping.toCPointer<ByteVar>(), objectcreation, grantedaccess.toCPointer<ByteVar>(), accessstatus.toCPointer<ByteVar>(), generateonclose.toCPointer<ByteVar>())

public actual fun ZwAccessCheckByTypeAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwAccessCheckByTypeAndAuditAlarm(subsystemname.toCPointer<ByteVar>(), handleid.toCPointer<ByteVar>(), objecttypename.toCPointer<ByteVar>(), objectname.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>(), principalselfsid.toCPointer<ByteVar>(), desiredaccess, audittype, flags, objecttypelist.toCPointer<ByteVar>(), objecttypelistlength, genericmapping.toCPointer<ByteVar>(), objectcreation, grantedaccess.toCPointer<ByteVar>(), accessstatus.toCPointer<ByteVar>(), generateonclose.toCPointer<ByteVar>())

public actual fun ZwAccessCheckByTypeResultListAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwAccessCheckByTypeResultListAndAuditAlarm(subsystemname.toCPointer<ByteVar>(), handleid.toCPointer<ByteVar>(), objecttypename.toCPointer<ByteVar>(), objectname.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>(), principalselfsid.toCPointer<ByteVar>(), desiredaccess, audittype, flags, objecttypelist.toCPointer<ByteVar>(), objecttypelistlength, genericmapping.toCPointer<ByteVar>(), objectcreation, grantedaccess.toCPointer<ByteVar>(), accessstatus.toCPointer<ByteVar>(), generateonclose.toCPointer<ByteVar>())

public actual fun ZwAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname: Long, handleid: Long, clienttoken: HANDLE, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname.toCPointer<ByteVar>(), handleid.toCPointer<ByteVar>(), clienttoken.toCPointer<ByteVar>(), objecttypename.toCPointer<ByteVar>(), objectname.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>(), principalselfsid.toCPointer<ByteVar>(), desiredaccess, audittype, flags, objecttypelist.toCPointer<ByteVar>(), objecttypelistlength, genericmapping.toCPointer<ByteVar>(), objectcreation, grantedaccess.toCPointer<ByteVar>(), accessstatus.toCPointer<ByteVar>(), generateonclose.toCPointer<ByteVar>())

public actual fun ZwAdjustGroupsToken(tokenhandle: HANDLE, resettodefault: Boolean, newstate: Long, bufferlength: UInt, previousstate: Long, returnlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwAdjustGroupsToken(tokenhandle.toCPointer<ByteVar>(), resettodefault, newstate.toCPointer<ByteVar>(), bufferlength, previousstate.toCPointer<ByteVar>(), returnlength.toCPointer<ByteVar>())

public actual fun ZwAdjustPrivilegesToken(tokenhandle: HANDLE, disableallprivileges: Boolean, newstate: Long, bufferlength: UInt, previousstate: Long, returnlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwAdjustPrivilegesToken(tokenhandle.toCPointer<ByteVar>(), disableallprivileges, newstate.toCPointer<ByteVar>(), bufferlength, previousstate.toCPointer<ByteVar>(), returnlength.toCPointer<ByteVar>())

public actual fun ZwAllocateVirtualMemory(processhandle: HANDLE, baseaddress: Long, zerobits: ULong, regionsize: Long, allocationtype: UInt, protect: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwAllocateVirtualMemory(processhandle.toCPointer<ByteVar>(), baseaddress.toCPointer<ByteVar>(), zerobits, regionsize.toCPointer<ByteVar>(), allocationtype, protect)

public actual fun ZwAllocateVirtualMemoryEx(processhandle: HANDLE, baseaddress: Long, regionsize: Long, allocationtype: UInt, pageprotection: UInt, extendedparameters: Long, extendedparametercount: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwAllocateVirtualMemoryEx(processhandle.toCPointer<ByteVar>(), baseaddress.toCPointer<ByteVar>(), regionsize.toCPointer<ByteVar>(), allocationtype, pageprotection, extendedparameters.toCPointer<ByteVar>(), extendedparametercount)

public actual fun ZwCancelIoFileEx(filehandle: HANDLE, iorequesttocancel: Long, iostatusblock: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwCancelIoFileEx(filehandle.toCPointer<ByteVar>(), iorequesttocancel.toCPointer<ByteVar>(), iostatusblock.toCPointer<ByteVar>())

public actual fun ZwCloseObjectAuditAlarm(subsystemname: Long, handleid: Long, generateonclose: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwCloseObjectAuditAlarm(subsystemname.toCPointer<ByteVar>(), handleid.toCPointer<ByteVar>(), generateonclose)

public actual fun ZwCreateDirectoryObject(directoryhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwCreateDirectoryObject(directoryhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>())

public actual fun ZwCreateEvent(eventhandle: Long, desiredaccess: UInt, objectattributes: Long, eventtype: EVENT_TYPE, initialstate: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwCreateEvent(eventhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), eventtype, initialstate)

public actual fun ZwCreateSectionEx(sectionhandle: Long, desiredaccess: UInt, objectattributes: Long, maximumsize: Long, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: HANDLE, extendedparameters: Long, extendedparametercount: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwCreateSectionEx(sectionhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), maximumsize.toCPointer<ByteVar>(), sectionpageprotection, allocationattributes, filehandle.toCPointer<ByteVar>(), extendedparameters.toCPointer<ByteVar>(), extendedparametercount)

public actual fun ZwDeleteFile(objectattributes: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwDeleteFile(objectattributes.toCPointer<ByteVar>())

public actual fun ZwDeleteObjectAuditAlarm(subsystemname: Long, handleid: Long, generateonclose: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwDeleteObjectAuditAlarm(subsystemname.toCPointer<ByteVar>(), handleid.toCPointer<ByteVar>(), generateonclose)

public actual fun ZwDuplicateObject(sourceprocesshandle: HANDLE, sourcehandle: HANDLE, targetprocesshandle: HANDLE, targethandle: Long, desiredaccess: UInt, handleattributes: UInt, options: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwDuplicateObject(sourceprocesshandle.toCPointer<ByteVar>(), sourcehandle.toCPointer<ByteVar>(), targetprocesshandle.toCPointer<ByteVar>(), targethandle.toCPointer<ByteVar>(), desiredaccess, handleattributes, options)

public actual fun ZwDuplicateToken(existingtokenhandle: HANDLE, desiredaccess: UInt, objectattributes: Long, effectiveonly: Boolean, tokentype: TOKEN_TYPE, newtokenhandle: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwDuplicateToken(existingtokenhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), effectiveonly, tokentype, newtokenhandle.toCPointer<ByteVar>())

public actual fun ZwFilterToken(existingtokenhandle: HANDLE, flags: UInt, sidstodisable: Long, privilegestodelete: Long, restrictedsids: Long, newtokenhandle: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwFilterToken(existingtokenhandle.toCPointer<ByteVar>(), flags, sidstodisable.toCPointer<ByteVar>(), privilegestodelete.toCPointer<ByteVar>(), restrictedsids.toCPointer<ByteVar>(), newtokenhandle.toCPointer<ByteVar>())

public actual fun ZwFlushBuffersFile(filehandle: HANDLE, iostatusblock: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwFlushBuffersFile(filehandle.toCPointer<ByteVar>(), iostatusblock.toCPointer<ByteVar>())

public actual fun ZwFlushBuffersFileEx(filehandle: HANDLE, flags: UInt, parameters: Long, parameterssize: UInt, iostatusblock: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwFlushBuffersFileEx(filehandle.toCPointer<ByteVar>(), flags, parameters.toCPointer<ByteVar>(), parameterssize, iostatusblock.toCPointer<ByteVar>())

public actual fun ZwFlushVirtualMemory(processhandle: HANDLE, baseaddress: Long, regionsize: Long, iostatus: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwFlushVirtualMemory(processhandle.toCPointer<ByteVar>(), baseaddress.toCPointer<ByteVar>(), regionsize.toCPointer<ByteVar>(), iostatus.toCPointer<ByteVar>())

public actual fun ZwFreeVirtualMemory(processhandle: HANDLE, baseaddress: Long, regionsize: Long, freetype: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwFreeVirtualMemory(processhandle.toCPointer<ByteVar>(), baseaddress.toCPointer<ByteVar>(), regionsize.toCPointer<ByteVar>(), freetype)

public actual fun ZwFsControlFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, fscontrolcode: UInt, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt): NTSTATUS =
    0

public actual fun ZwImpersonateAnonymousToken(threadhandle: HANDLE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwImpersonateAnonymousToken(threadhandle.toCPointer<ByteVar>())

public actual fun ZwLockFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, byteoffset: Long, length: Long, key: UInt, failimmediately: Boolean, exclusivelock: Boolean): NTSTATUS =
    0

public actual fun ZwNotifyChangeKey(keyhandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, completionfilter: UInt, watchtree: Boolean, buffer: Long, buffersize: UInt, asynchronous: Boolean): NTSTATUS =
    0

public actual fun ZwOpenDirectoryObject(directoryhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwOpenDirectoryObject(directoryhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>())

public actual fun ZwOpenObjectAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, clienttoken: HANDLE, desiredaccess: UInt, grantedaccess: UInt, privileges: Long, objectcreation: Boolean, accessgranted: Boolean, generateonclose: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwOpenObjectAuditAlarm(subsystemname.toCPointer<ByteVar>(), handleid.toCPointer<ByteVar>(), objecttypename.toCPointer<ByteVar>(), objectname.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>(), clienttoken.toCPointer<ByteVar>(), desiredaccess, grantedaccess, privileges.toCPointer<ByteVar>(), objectcreation, accessgranted, generateonclose.toCPointer<ByteVar>())

public actual fun ZwOpenProcessToken(processhandle: HANDLE, desiredaccess: UInt, tokenhandle: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwOpenProcessToken(processhandle.toCPointer<ByteVar>(), desiredaccess, tokenhandle.toCPointer<ByteVar>())

public actual fun ZwOpenProcessTokenEx(processhandle: HANDLE, desiredaccess: UInt, handleattributes: UInt, tokenhandle: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwOpenProcessTokenEx(processhandle.toCPointer<ByteVar>(), desiredaccess, handleattributes, tokenhandle.toCPointer<ByteVar>())

public actual fun ZwOpenThreadToken(threadhandle: HANDLE, desiredaccess: UInt, openasself: Boolean, tokenhandle: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwOpenThreadToken(threadhandle.toCPointer<ByteVar>(), desiredaccess, openasself, tokenhandle.toCPointer<ByteVar>())

public actual fun ZwOpenThreadTokenEx(threadhandle: HANDLE, desiredaccess: UInt, openasself: Boolean, handleattributes: UInt, tokenhandle: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwOpenThreadTokenEx(threadhandle.toCPointer<ByteVar>(), desiredaccess, openasself, handleattributes, tokenhandle.toCPointer<ByteVar>())

public actual fun ZwPrivilegeCheck(clienttoken: HANDLE, requiredprivileges: Long, result: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwPrivilegeCheck(clienttoken.toCPointer<ByteVar>(), requiredprivileges.toCPointer<ByteVar>(), result.toCPointer<ByteVar>())

public actual fun ZwPrivilegeObjectAuditAlarm(subsystemname: Long, handleid: Long, clienttoken: HANDLE, desiredaccess: UInt, privileges: Long, accessgranted: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwPrivilegeObjectAuditAlarm(subsystemname.toCPointer<ByteVar>(), handleid.toCPointer<ByteVar>(), clienttoken.toCPointer<ByteVar>(), desiredaccess, privileges.toCPointer<ByteVar>(), accessgranted)

public actual fun ZwPrivilegedServiceAuditAlarm(subsystemname: Long, servicename: Long, clienttoken: HANDLE, privileges: Long, accessgranted: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwPrivilegedServiceAuditAlarm(subsystemname.toCPointer<ByteVar>(), servicename.toCPointer<ByteVar>(), clienttoken.toCPointer<ByteVar>(), privileges.toCPointer<ByteVar>(), accessgranted)

public actual fun ZwQueryDirectoryFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, returnsingleentry: Boolean, filename: Long, restartscan: Boolean): NTSTATUS =
    0

public actual fun ZwQueryDirectoryFileEx(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, queryflags: UInt, filename: Long): NTSTATUS =
    0

public actual fun ZwQueryDirectoryObject(directoryhandle: HANDLE, buffer: Long, length: UInt, returnsingleentry: Boolean, restartscan: Boolean, context: Long, returnlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwQueryDirectoryObject(directoryhandle.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), length, returnsingleentry, restartscan, context.toCPointer<ByteVar>(), returnlength.toCPointer<ByteVar>())

public actual fun ZwQueryEaFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt, returnsingleentry: Boolean, ealist: Long, ealistlength: UInt, eaindex: Long, restartscan: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwQueryEaFile(filehandle.toCPointer<ByteVar>(), iostatusblock.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), length, returnsingleentry, ealist.toCPointer<ByteVar>(), ealistlength, eaindex.toCPointer<ByteVar>(), restartscan)

public actual fun ZwQueryFullAttributesFile(objectattributes: Long, fileinformation: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwQueryFullAttributesFile(objectattributes.toCPointer<ByteVar>(), fileinformation.toCPointer<ByteVar>())

public actual fun ZwQueryInformationToken(tokenhandle: HANDLE, tokeninformationclass: TOKEN_INFORMATION_CLASS, tokeninformation: Long, tokeninformationlength: UInt, returnlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwQueryInformationToken(tokenhandle.toCPointer<ByteVar>(), tokeninformationclass, tokeninformation.toCPointer<ByteVar>(), tokeninformationlength, returnlength.toCPointer<ByteVar>())

public actual fun ZwQueryObject(handle: HANDLE, objectinformationclass: OBJECT_INFORMATION_CLASS, objectinformation: Long, objectinformationlength: UInt, returnlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwQueryObject(handle.toCPointer<ByteVar>(), objectinformationclass, objectinformation.toCPointer<ByteVar>(), objectinformationlength, returnlength.toCPointer<ByteVar>())

public actual fun ZwQueryQuotaInformationFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt, returnsingleentry: Boolean, sidlist: Long, sidlistlength: UInt, startsid: PSID, restartscan: Boolean): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwQueryQuotaInformationFile(filehandle.toCPointer<ByteVar>(), iostatusblock.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), length, returnsingleentry, sidlist.toCPointer<ByteVar>(), sidlistlength, startsid.toCPointer<ByteVar>(), restartscan)

public actual fun ZwQuerySecurityObject(handle: HANDLE, securityinformation: UInt, securitydescriptor: PSECURITY_DESCRIPTOR, length: UInt, lengthneeded: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwQuerySecurityObject(handle.toCPointer<ByteVar>(), securityinformation, securitydescriptor.toCPointer<ByteVar>(), length, lengthneeded.toCPointer<ByteVar>())

public actual fun ZwQueryVirtualMemory(processhandle: HANDLE, baseaddress: Long, memoryinformationclass: MEMORY_INFORMATION_CLASS, memoryinformation: Long, memoryinformationlength: ULong, returnlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwQueryVirtualMemory(processhandle.toCPointer<ByteVar>(), baseaddress.toCPointer<ByteVar>(), memoryinformationclass, memoryinformation.toCPointer<ByteVar>(), memoryinformationlength, returnlength.toCPointer<ByteVar>())

public actual fun ZwQueryVolumeInformationFile(filehandle: HANDLE, iostatusblock: Long, fsinformation: Long, length: UInt, fsinformationclass: FS_INFORMATION_CLASS): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwQueryVolumeInformationFile(filehandle.toCPointer<ByteVar>(), iostatusblock.toCPointer<ByteVar>(), fsinformation.toCPointer<ByteVar>(), length, fsinformationclass)

public actual fun ZwSetEaFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwSetEaFile(filehandle.toCPointer<ByteVar>(), iostatusblock.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), length)

public actual fun ZwSetEvent(eventhandle: HANDLE, previousstate: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwSetEvent(eventhandle.toCPointer<ByteVar>(), previousstate.toCPointer<ByteVar>())

public actual fun ZwSetInformationToken(tokenhandle: HANDLE, tokeninformationclass: TOKEN_INFORMATION_CLASS, tokeninformation: Long, tokeninformationlength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwSetInformationToken(tokenhandle.toCPointer<ByteVar>(), tokeninformationclass, tokeninformation.toCPointer<ByteVar>(), tokeninformationlength)

public actual fun ZwSetInformationVirtualMemory(processhandle: HANDLE, vminformationclass: VIRTUAL_MEMORY_INFORMATION_CLASS, numberofentries: ULong, virtualaddresses: Long, vminformation: Long, vminformationlength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwSetInformationVirtualMemory(processhandle.toCPointer<ByteVar>(), vminformationclass, numberofentries, virtualaddresses.toCPointer<ByteVar>(), vminformation.toCPointer<ByteVar>(), vminformationlength)

public actual fun ZwSetQuotaInformationFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwSetQuotaInformationFile(filehandle.toCPointer<ByteVar>(), iostatusblock.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), length)

public actual fun ZwSetSecurityObject(handle: HANDLE, securityinformation: UInt, securitydescriptor: PSECURITY_DESCRIPTOR): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwSetSecurityObject(handle.toCPointer<ByteVar>(), securityinformation, securitydescriptor.toCPointer<ByteVar>())

public actual fun ZwSetVolumeInformationFile(filehandle: HANDLE, iostatusblock: Long, fsinformation: Long, length: UInt, fsinformationclass: FS_INFORMATION_CLASS): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwSetVolumeInformationFile(filehandle.toCPointer<ByteVar>(), iostatusblock.toCPointer<ByteVar>(), fsinformation.toCPointer<ByteVar>(), length, fsinformationclass)

public actual fun ZwUnlockFile(filehandle: HANDLE, iostatusblock: Long, byteoffset: Long, length: Long, key: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.cinterop.windowssys_windows_wdk_storage_filesystem_ZwUnlockFile(filehandle.toCPointer<ByteVar>(), iostatusblock.toCPointer<ByteVar>(), byteoffset.toCPointer<ByteVar>(), length.toCPointer<ByteVar>(), key)
