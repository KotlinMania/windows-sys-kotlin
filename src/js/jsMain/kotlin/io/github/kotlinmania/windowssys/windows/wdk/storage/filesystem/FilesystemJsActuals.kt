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

private val _windowsWdkStorageFilesystemNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun ApplyControlToken(phcontext: Long, pinput: Long): HRESULT =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ApplyControlToken(phcontext.toString(), pinput.toString()) as Int) else 0

public actual fun CcAsyncCopyRead(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, buffer: Long, iostatus: Long, ioissuerthread: PETHREAD, asyncreadcontext: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcAsyncCopyRead(fileobject.toString(), fileoffset.toString(), length.toInt(), wait, buffer.toString(), iostatus.toString(), ioissuerthread.toString(), asyncreadcontext.toString()) as Boolean) else false

public actual fun CcCanIWrite(fileobject: Long, bytestowrite: UInt, wait: Boolean, retrying: UByte): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcCanIWrite(fileobject.toString(), bytestowrite.toInt(), wait, retrying.toInt()) as Boolean) else false

public actual fun CcCoherencyFlushAndPurgeCache(sectionobjectpointer: Long, fileoffset: Long, length: UInt, iostatus: Long, flags: UInt) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcCoherencyFlushAndPurgeCache(sectionobjectpointer.toString(), fileoffset.toString(), length.toInt(), iostatus.toString(), flags.toInt())
    }
}

public actual fun CcCopyRead(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, buffer: Long, iostatus: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcCopyRead(fileobject.toString(), fileoffset.toString(), length.toInt(), wait, buffer.toString(), iostatus.toString()) as Boolean) else false

public actual fun CcCopyReadEx(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, buffer: Long, iostatus: Long, ioissuerthread: PETHREAD): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcCopyReadEx(fileobject.toString(), fileoffset.toString(), length.toInt(), wait, buffer.toString(), iostatus.toString(), ioissuerthread.toString()) as Boolean) else false

public actual fun CcCopyWrite(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, buffer: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcCopyWrite(fileobject.toString(), fileoffset.toString(), length.toInt(), wait, buffer.toString()) as Boolean) else false

public actual fun CcCopyWriteEx(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, buffer: Long, ioissuerthread: PETHREAD): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcCopyWriteEx(fileobject.toString(), fileoffset.toString(), length.toInt(), wait, buffer.toString(), ioissuerthread.toString()) as Boolean) else false

public actual fun CcCopyWriteWontFlush(fileobject: Long, fileoffset: Long, length: UInt): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcCopyWriteWontFlush(fileobject.toString(), fileoffset.toString(), length.toInt()) as Boolean) else false

public actual fun CcDeferWrite(fileobject: Long, postroutine: PCC_POST_DEFERRED_WRITE, context1: Long, context2: Long, bytestowrite: UInt, retrying: Boolean) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcDeferWrite(fileobject.toString(), postroutine.toLong().toString(), context1.toString(), context2.toString(), bytestowrite.toInt(), retrying)
    }
}

public actual fun CcErrorCallbackRoutine(context: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcErrorCallbackRoutine(context.toString()) as Int) else 0

public actual fun CcFastCopyRead(fileobject: Long, fileoffset: UInt, length: UInt, pagecount: UInt, buffer: Long, iostatus: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcFastCopyRead(fileobject.toString(), fileoffset.toInt(), length.toInt(), pagecount.toInt(), buffer.toString(), iostatus.toString())
    }
}

public actual fun CcFastCopyWrite(fileobject: Long, fileoffset: UInt, length: UInt, buffer: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcFastCopyWrite(fileobject.toString(), fileoffset.toInt(), length.toInt(), buffer.toString())
    }
}

public actual fun CcFlushCache(sectionobjectpointer: Long, fileoffset: Long, length: UInt, iostatus: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcFlushCache(sectionobjectpointer.toString(), fileoffset.toString(), length.toInt(), iostatus.toString())
    }
}

public actual fun CcGetDirtyPages(loghandle: Long, dirtypageroutine: PDIRTY_PAGE_ROUTINE, context1: Long, context2: Long): Long =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcGetDirtyPages(loghandle.toString(), dirtypageroutine.toLong().toString(), context1.toString(), context2.toString()) as String).toLong() else 0L

public actual fun CcGetFileObjectFromBcb(bcb: Long): Long =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcGetFileObjectFromBcb(bcb.toString()) as String).toLong() else 0L

public actual fun CcGetFileObjectFromSectionPtrs(sectionobjectpointer: Long): Long =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcGetFileObjectFromSectionPtrs(sectionobjectpointer.toString()) as String).toLong() else 0L

public actual fun CcGetFileObjectFromSectionPtrsRef(sectionobjectpointer: Long): Long =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcGetFileObjectFromSectionPtrsRef(sectionobjectpointer.toString()) as String).toLong() else 0L

public actual fun CcGetFlushedValidData(sectionobjectpointer: Long, bcblistheld: Boolean): Long =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcGetFlushedValidData(sectionobjectpointer.toString(), bcblistheld) as String).toLong() else 0L

public actual fun CcInitializeCacheMap(fileobject: Long, filesizes: Long, pinaccess: Boolean, callbacks: Long, lazywritecontext: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcInitializeCacheMap(fileobject.toString(), filesizes.toString(), pinaccess, callbacks.toString(), lazywritecontext.toString())
    }
}

public actual fun CcInitializeCacheMapEx(fileobject: Long, filesizes: Long, pinaccess: Boolean, callbacks: Long, lazywritecontext: Long, flags: UInt) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcInitializeCacheMapEx(fileobject.toString(), filesizes.toString(), pinaccess, callbacks.toString(), lazywritecontext.toString(), flags.toInt())
    }
}

public actual fun CcIsCacheManagerCallbackNeeded(status: NTSTATUS): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcIsCacheManagerCallbackNeeded(status) as Boolean) else false

public actual fun CcIsThereDirtyData(vpb: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcIsThereDirtyData(vpb.toString()) as Boolean) else false

public actual fun CcIsThereDirtyDataEx(vpb: Long, numberofdirtypages: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcIsThereDirtyDataEx(vpb.toString(), numberofdirtypages.toString()) as Boolean) else false

public actual fun CcMapData(fileobject: Long, fileoffset: Long, length: UInt, flags: UInt, bcb: Long, buffer: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcMapData(fileobject.toString(), fileoffset.toString(), length.toInt(), flags.toInt(), bcb.toString(), buffer.toString()) as Boolean) else false

public actual fun CcMdlRead(fileobject: Long, fileoffset: Long, length: UInt, mdlchain: Long, iostatus: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcMdlRead(fileobject.toString(), fileoffset.toString(), length.toInt(), mdlchain.toString(), iostatus.toString())
    }
}

public actual fun CcMdlReadComplete(fileobject: Long, mdlchain: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcMdlReadComplete(fileobject.toString(), mdlchain.toString())
    }
}

public actual fun CcMdlWriteAbort(fileobject: Long, mdlchain: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcMdlWriteAbort(fileobject.toString(), mdlchain.toString())
    }
}

public actual fun CcMdlWriteComplete(fileobject: Long, fileoffset: Long, mdlchain: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcMdlWriteComplete(fileobject.toString(), fileoffset.toString(), mdlchain.toString())
    }
}

public actual fun CcPinMappedData(fileobject: Long, fileoffset: Long, length: UInt, flags: UInt, bcb: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcPinMappedData(fileobject.toString(), fileoffset.toString(), length.toInt(), flags.toInt(), bcb.toString()) as Boolean) else false

public actual fun CcPinRead(fileobject: Long, fileoffset: Long, length: UInt, flags: UInt, bcb: Long, buffer: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcPinRead(fileobject.toString(), fileoffset.toString(), length.toInt(), flags.toInt(), bcb.toString(), buffer.toString()) as Boolean) else false

public actual fun CcPrepareMdlWrite(fileobject: Long, fileoffset: Long, length: UInt, mdlchain: Long, iostatus: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcPrepareMdlWrite(fileobject.toString(), fileoffset.toString(), length.toInt(), mdlchain.toString(), iostatus.toString())
    }
}

public actual fun CcPreparePinWrite(fileobject: Long, fileoffset: Long, length: UInt, zero: Boolean, flags: UInt, bcb: Long, buffer: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcPreparePinWrite(fileobject.toString(), fileoffset.toString(), length.toInt(), zero, flags.toInt(), bcb.toString(), buffer.toString()) as Boolean) else false

public actual fun CcPurgeCacheSection(sectionobjectpointer: Long, fileoffset: Long, length: UInt, flags: UInt): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcPurgeCacheSection(sectionobjectpointer.toString(), fileoffset.toString(), length.toInt(), flags.toInt()) as Boolean) else false

public actual fun CcRemapBcb(bcb: Long): Long =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcRemapBcb(bcb.toString()) as String).toLong() else 0L

public actual fun CcRepinBcb(bcb: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcRepinBcb(bcb.toString())
    }
}

public actual fun CcScheduleReadAhead(fileobject: Long, fileoffset: Long, length: UInt) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcScheduleReadAhead(fileobject.toString(), fileoffset.toString(), length.toInt())
    }
}

public actual fun CcScheduleReadAheadEx(fileobject: Long, fileoffset: Long, length: UInt, ioissuerthread: PETHREAD) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcScheduleReadAheadEx(fileobject.toString(), fileoffset.toString(), length.toInt(), ioissuerthread.toString())
    }
}

public actual fun CcSetAdditionalCacheAttributes(fileobject: Long, disablereadahead: Boolean, disablewritebehind: Boolean) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcSetAdditionalCacheAttributes(fileobject.toString(), disablereadahead, disablewritebehind)
    }
}

public actual fun CcSetAdditionalCacheAttributesEx(fileobject: Long, flags: UInt) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcSetAdditionalCacheAttributesEx(fileobject.toString(), flags.toInt())
    }
}

public actual fun CcSetBcbOwnerPointer(bcb: Long, ownerpointer: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcSetBcbOwnerPointer(bcb.toString(), ownerpointer.toString())
    }
}

public actual fun CcSetDirtyPageThreshold(fileobject: Long, dirtypagethreshold: UInt) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcSetDirtyPageThreshold(fileobject.toString(), dirtypagethreshold.toInt())
    }
}

public actual fun CcSetDirtyPinnedData(bcbvoid: Long, lsn: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcSetDirtyPinnedData(bcbvoid.toString(), lsn.toString())
    }
}

public actual fun CcSetFileSizes(fileobject: Long, filesizes: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcSetFileSizes(fileobject.toString(), filesizes.toString())
    }
}

public actual fun CcSetFileSizesEx(fileobject: Long, filesizes: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcSetFileSizesEx(fileobject.toString(), filesizes.toString()) as Int) else 0

public actual fun CcSetLogHandleForFile(fileobject: Long, loghandle: Long, flushtolsnroutine: PFLUSH_TO_LSN) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcSetLogHandleForFile(fileobject.toString(), loghandle.toString(), flushtolsnroutine.toLong().toString())
    }
}

public actual fun CcSetParallelFlushFile(fileobject: Long, enableparallelflush: Boolean) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcSetParallelFlushFile(fileobject.toString(), enableparallelflush)
    }
}

public actual fun CcSetReadAheadGranularity(fileobject: Long, granularity: UInt) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcSetReadAheadGranularity(fileobject.toString(), granularity.toInt())
    }
}

public actual fun CcUninitializeCacheMap(fileobject: Long, truncatesize: Long, uninitializeevent: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcUninitializeCacheMap(fileobject.toString(), truncatesize.toString(), uninitializeevent.toString()) as Boolean) else false

public actual fun CcUnpinData(bcb: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcUnpinData(bcb.toString())
    }
}

public actual fun CcUnpinDataForThread(bcb: Long, resourcethreadid: ULong) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcUnpinDataForThread(bcb.toString(), resourcethreadid.toString())
    }
}

public actual fun CcUnpinRepinnedBcb(bcb: Long, writethrough: Boolean, iostatus: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcUnpinRepinnedBcb(bcb.toString(), writethrough, iostatus.toString())
    }
}

public actual fun CcWaitForCurrentLazyWriterActivity(): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcWaitForCurrentLazyWriterActivity() as Int) else 0

public actual fun CcZeroData(fileobject: Long, startoffset: Long, endoffset: Long, wait: Boolean): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CcZeroData(fileobject.toString(), startoffset.toString(), endoffset.toString(), wait) as Boolean) else false

public actual fun CompleteAuthToken(phcontext: Long, ptoken: Long): HRESULT =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_CompleteAuthToken(phcontext.toString(), ptoken.toString()) as Int) else 0

public actual fun ExDisableResourceBoostLite(resource: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ExDisableResourceBoostLite(resource.toString())
    }
}

public actual fun ExQueryPoolBlockSize(poolblock: Long, quotacharged: Long): ULong =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ExQueryPoolBlockSize(poolblock.toString(), quotacharged.toString()) as String).toULong() else 0uL

public actual fun ExportSecurityContext(phcontext: Long, fflags: UInt, ppackedcontext: Long, ptoken: Long): HRESULT =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ExportSecurityContext(phcontext.toString(), fflags.toInt(), ppackedcontext.toString(), ptoken.toString()) as Int) else 0

public actual fun FsRtlAcknowledgeEcp(ecpcontext: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlAcknowledgeEcp(ecpcontext.toString())
    }
}

public actual fun FsRtlAcquireFileExclusive(fileobject: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlAcquireFileExclusive(fileobject.toString())
    }
}

public actual fun FsRtlAddBaseMcbEntry(mcb: Long, vbn: Long, lbn: Long, sectorcount: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlAddBaseMcbEntry(mcb.toString(), vbn.toString(), lbn.toString(), sectorcount.toString()) as Boolean) else false

public actual fun FsRtlAddBaseMcbEntryEx(mcb: Long, vbn: Long, lbn: Long, sectorcount: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlAddBaseMcbEntryEx(mcb.toString(), vbn.toString(), lbn.toString(), sectorcount.toString()) as Int) else 0

public actual fun FsRtlAddLargeMcbEntry(mcb: Long, vbn: Long, lbn: Long, sectorcount: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlAddLargeMcbEntry(mcb.toString(), vbn.toString(), lbn.toString(), sectorcount.toString()) as Boolean) else false

public actual fun FsRtlAddMcbEntry(mcb: Long, vbn: UInt, lbn: UInt, sectorcount: UInt): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlAddMcbEntry(mcb.toString(), vbn.toInt(), lbn.toInt(), sectorcount.toInt()) as Boolean) else false

public actual fun FsRtlAddToTunnelCache(cache: Long, directorykey: ULong, shortname: Long, longname: Long, keybyshortname: Boolean, datalength: UInt, data: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlAddToTunnelCache(cache.toString(), directorykey.toString(), shortname.toString(), longname.toString(), keybyshortname, datalength.toInt(), data.toString())
    }
}

public actual fun FsRtlAddToTunnelCacheEx(cache: Long, directorykey: ULong, shortname: Long, longname: Long, flags: UInt, datalength: UInt, data: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlAddToTunnelCacheEx(cache.toString(), directorykey.toString(), shortname.toString(), longname.toString(), flags.toInt(), datalength.toInt(), data.toString())
    }
}

public actual fun FsRtlAllocateAePushLock(pooltype: POOL_TYPE, tag: UInt): Long =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlAllocateAePushLock(pooltype, tag.toInt()) as String).toLong() else 0L

public actual fun FsRtlAllocateExtraCreateParameter(ecptype: Long, sizeofcontext: UInt, flags: UInt, cleanupcallback: PFSRTL_EXTRA_CREATE_PARAMETER_CLEANUP_CALLBACK, pooltag: UInt, ecpcontext: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlAllocateExtraCreateParameter(ecptype.toString(), sizeofcontext.toInt(), flags.toInt(), cleanupcallback.toLong().toString(), pooltag.toInt(), ecpcontext.toString()) as Int) else 0

public actual fun FsRtlAllocateExtraCreateParameterFromLookasideList(ecptype: Long, sizeofcontext: UInt, flags: UInt, cleanupcallback: PFSRTL_EXTRA_CREATE_PARAMETER_CLEANUP_CALLBACK, lookasidelist: Long, ecpcontext: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlAllocateExtraCreateParameterFromLookasideList(ecptype.toString(), sizeofcontext.toInt(), flags.toInt(), cleanupcallback.toLong().toString(), lookasidelist.toString(), ecpcontext.toString()) as Int) else 0

public actual fun FsRtlAllocateExtraCreateParameterList(flags: UInt, ecplist: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlAllocateExtraCreateParameterList(flags.toInt(), ecplist.toString()) as Int) else 0

public actual fun FsRtlAllocateFileLock(completelockirproutine: PCOMPLETE_LOCK_IRP_ROUTINE, unlockroutine: PUNLOCK_ROUTINE): Long =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlAllocateFileLock(completelockirproutine.toLong().toString(), unlockroutine.toLong().toString()) as String).toLong() else 0L

public actual fun FsRtlAllocateResource(): Long =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlAllocateResource() as String).toLong() else 0L

public actual fun FsRtlAreNamesEqual(constantnamea: Long, constantnameb: Long, ignorecase: Boolean, upcasetable: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlAreNamesEqual(constantnamea.toString(), constantnameb.toString(), ignorecase, upcasetable.toString()) as Boolean) else false

public actual fun FsRtlAreThereCurrentOrInProgressFileLocks(filelock: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlAreThereCurrentOrInProgressFileLocks(filelock.toString()) as Boolean) else false

public actual fun FsRtlAreThereWaitingFileLocks(filelock: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlAreThereWaitingFileLocks(filelock.toString()) as Boolean) else false

public actual fun FsRtlAreVolumeStartupApplicationsComplete(): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlAreVolumeStartupApplicationsComplete() as Boolean) else false

public actual fun FsRtlBalanceReads(targetdevice: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlBalanceReads(targetdevice.toString()) as Int) else 0

public actual fun FsRtlCancellableWaitForMultipleObjects(count: UInt, objectarray: Long, waittype: WAIT_TYPE, timeout: Long, waitblockarray: Long, irp: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlCancellableWaitForMultipleObjects(count.toInt(), objectarray.toString(), waittype, timeout.toString(), waitblockarray.toString(), irp.toString()) as Int) else 0

public actual fun FsRtlCancellableWaitForSingleObject(obj: Long, timeout: Long, irp: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlCancellableWaitForSingleObject(obj.toString(), timeout.toString(), irp.toString()) as Int) else 0

public actual fun FsRtlChangeBackingFileObject(currentfileobject: Long, newfileobject: Long, changebackingtype: FSRTL_CHANGE_BACKING_TYPE, flags: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlChangeBackingFileObject(currentfileobject.toString(), newfileobject.toString(), changebackingtype, flags.toInt()) as Int) else 0

public actual fun FsRtlCheckLockForOplockRequest(filelock: Long, allocationsize: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlCheckLockForOplockRequest(filelock.toString(), allocationsize.toString()) as Boolean) else false

public actual fun FsRtlCheckLockForReadAccess(filelock: Long, irp: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlCheckLockForReadAccess(filelock.toString(), irp.toString()) as Boolean) else false

public actual fun FsRtlCheckLockForWriteAccess(filelock: Long, irp: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlCheckLockForWriteAccess(filelock.toString(), irp.toString()) as Boolean) else false

public actual fun FsRtlCheckOplock(oplock: Long, irp: Long, context: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlCheckOplock(oplock.toString(), irp.toString(), context.toString(), completionroutine.toLong().toString(), postirproutine.toLong().toString()) as Int) else 0

public actual fun FsRtlCheckOplockEx(oplock: Long, irp: Long, flags: UInt, context: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlCheckOplockEx(oplock.toString(), irp.toString(), flags.toInt(), context.toString(), completionroutine.toLong().toString(), postirproutine.toLong().toString()) as Int) else 0

public actual fun FsRtlCheckOplockEx2(oplock: Long, irp: Long, flags: UInt, flagsex2: UInt, completionroutinecontext: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP, timeout: ULong, notifycontext: Long, notifyroutine: POPLOCK_NOTIFY_ROUTINE): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlCheckOplockEx2(oplock.toString(), irp.toString(), flags.toInt(), flagsex2.toInt(), completionroutinecontext.toString(), completionroutine.toLong().toString(), postirproutine.toLong().toString(), timeout.toString(), notifycontext.toString(), notifyroutine.toLong().toString()) as Int) else 0

public actual fun FsRtlCheckUpperOplock(oplock: Long, newloweroplockstate: UInt, completionroutinecontext: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, prependroutine: POPLOCK_FS_PREPOST_IRP, flags: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlCheckUpperOplock(oplock.toString(), newloweroplockstate.toInt(), completionroutinecontext.toString(), completionroutine.toLong().toString(), prependroutine.toLong().toString(), flags.toInt()) as Int) else 0

public actual fun FsRtlCopyRead(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, lockkey: UInt, buffer: Long, iostatus: Long, deviceobject: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlCopyRead(fileobject.toString(), fileoffset.toString(), length.toInt(), wait, lockkey.toInt(), buffer.toString(), iostatus.toString(), deviceobject.toString()) as Boolean) else false

public actual fun FsRtlCopyWrite(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, lockkey: UInt, buffer: Long, iostatus: Long, deviceobject: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlCopyWrite(fileobject.toString(), fileoffset.toString(), length.toInt(), wait, lockkey.toInt(), buffer.toString(), iostatus.toString(), deviceobject.toString()) as Boolean) else false

public actual fun FsRtlCreateSectionForDataScan(sectionhandle: Long, sectionobject: Long, sectionfilesize: Long, fileobject: Long, desiredaccess: UInt, objectattributes: Long, maximumsize: Long, sectionpageprotection: UInt, allocationattributes: UInt, flags: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlCreateSectionForDataScan(sectionhandle.toString(), sectionobject.toString(), sectionfilesize.toString(), fileobject.toString(), desiredaccess.toInt(), objectattributes.toString(), maximumsize.toString(), sectionpageprotection.toInt(), allocationattributes.toInt(), flags.toInt()) as Int) else 0

public actual fun FsRtlCurrentBatchOplock(oplock: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlCurrentBatchOplock(oplock.toString()) as Boolean) else false

public actual fun FsRtlCurrentOplock(oplock: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlCurrentOplock(oplock.toString()) as Boolean) else false

public actual fun FsRtlCurrentOplockH(oplock: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlCurrentOplockH(oplock.toString()) as Boolean) else false

public actual fun FsRtlDeleteExtraCreateParameterLookasideList(lookaside: Long, flags: UInt) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlDeleteExtraCreateParameterLookasideList(lookaside.toString(), flags.toInt())
    }
}

public actual fun FsRtlDeleteKeyFromTunnelCache(cache: Long, directorykey: ULong) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlDeleteKeyFromTunnelCache(cache.toString(), directorykey.toString())
    }
}

public actual fun FsRtlDeleteTunnelCache(cache: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlDeleteTunnelCache(cache.toString())
    }
}

public actual fun FsRtlDeregisterUncProvider(handle: HANDLE) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlDeregisterUncProvider(handle.toString())
    }
}

public actual fun FsRtlDismountComplete(deviceobject: Long, dismountstatus: NTSTATUS) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlDismountComplete(deviceobject.toString(), dismountstatus)
    }
}

public actual fun FsRtlDissectDbcs(path: STRING, firstname: Long, remainingname: Long) {
}

public actual fun FsRtlDissectName(path: UNICODE_STRING, firstname: Long, remainingname: Long) {
}

public actual fun FsRtlDoesDbcsContainWildCards(name: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlDoesDbcsContainWildCards(name.toString()) as Boolean) else false

public actual fun FsRtlDoesNameContainWildCards(name: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlDoesNameContainWildCards(name.toString()) as Boolean) else false

public actual fun FsRtlFastCheckLockForRead(filelock: Long, startingbyte: Long, length: Long, key: UInt, fileobject: Long, processid: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlFastCheckLockForRead(filelock.toString(), startingbyte.toString(), length.toString(), key.toInt(), fileobject.toString(), processid.toString()) as Boolean) else false

public actual fun FsRtlFastCheckLockForWrite(filelock: Long, startingbyte: Long, length: Long, key: UInt, fileobject: Long, processid: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlFastCheckLockForWrite(filelock.toString(), startingbyte.toString(), length.toString(), key.toInt(), fileobject.toString(), processid.toString()) as Boolean) else false

public actual fun FsRtlFastUnlockAll(filelock: Long, fileobject: Long, processid: PEPROCESS, context: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlFastUnlockAll(filelock.toString(), fileobject.toString(), processid.toString(), context.toString()) as Int) else 0

public actual fun FsRtlFastUnlockAllByKey(filelock: Long, fileobject: Long, processid: PEPROCESS, key: UInt, context: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlFastUnlockAllByKey(filelock.toString(), fileobject.toString(), processid.toString(), key.toInt(), context.toString()) as Int) else 0

public actual fun FsRtlFastUnlockSingle(filelock: Long, fileobject: Long, fileoffset: Long, length: Long, processid: PEPROCESS, key: UInt, context: Long, alreadysynchronized: Boolean): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlFastUnlockSingle(filelock.toString(), fileobject.toString(), fileoffset.toString(), length.toString(), processid.toString(), key.toInt(), context.toString(), alreadysynchronized) as Int) else 0

public actual fun FsRtlFindExtraCreateParameter(ecplist: Long, ecptype: Long, ecpcontext: Long, ecpcontextsize: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlFindExtraCreateParameter(ecplist.toString(), ecptype.toString(), ecpcontext.toString(), ecpcontextsize.toString()) as Int) else 0

public actual fun FsRtlFindInTunnelCache(cache: Long, directorykey: ULong, name: Long, shortname: Long, longname: Long, datalength: Long, data: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlFindInTunnelCache(cache.toString(), directorykey.toString(), name.toString(), shortname.toString(), longname.toString(), datalength.toString(), data.toString()) as Boolean) else false

public actual fun FsRtlFindInTunnelCacheEx(cache: Long, directorykey: ULong, name: Long, shortname: Long, longname: Long, flags: UInt, datalength: Long, data: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlFindInTunnelCacheEx(cache.toString(), directorykey.toString(), name.toString(), shortname.toString(), longname.toString(), flags.toInt(), datalength.toString(), data.toString()) as Boolean) else false

public actual fun FsRtlFreeAePushLock(aepushlock: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlFreeAePushLock(aepushlock.toString())
    }
}

public actual fun FsRtlFreeExtraCreateParameter(ecpcontext: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlFreeExtraCreateParameter(ecpcontext.toString())
    }
}

public actual fun FsRtlFreeExtraCreateParameterList(ecplist: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlFreeExtraCreateParameterList(ecplist.toString())
    }
}

public actual fun FsRtlFreeFileLock(filelock: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlFreeFileLock(filelock.toString())
    }
}

public actual fun FsRtlGetCurrentProcessLoaderList(): Long =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlGetCurrentProcessLoaderList() as String).toLong() else 0L

public actual fun FsRtlGetEcpListFromIrp(irp: Long, ecplist: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlGetEcpListFromIrp(irp.toString(), ecplist.toString()) as Int) else 0

public actual fun FsRtlGetFileSize(fileobject: Long, filesize: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlGetFileSize(fileobject.toString(), filesize.toString()) as Int) else 0

public actual fun FsRtlGetNextBaseMcbEntry(mcb: Long, runindex: UInt, vbn: Long, lbn: Long, sectorcount: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlGetNextBaseMcbEntry(mcb.toString(), runindex.toInt(), vbn.toString(), lbn.toString(), sectorcount.toString()) as Boolean) else false

public actual fun FsRtlGetNextExtraCreateParameter(ecplist: Long, currentecpcontext: Long, nextecptype: Long, nextecpcontext: Long, nextecpcontextsize: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlGetNextExtraCreateParameter(ecplist.toString(), currentecpcontext.toString(), nextecptype.toString(), nextecpcontext.toString(), nextecpcontextsize.toString()) as Int) else 0

public actual fun FsRtlGetNextFileLock(filelock: Long, restart: Boolean): Long =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlGetNextFileLock(filelock.toString(), restart) as String).toLong() else 0L

public actual fun FsRtlGetNextLargeMcbEntry(mcb: Long, runindex: UInt, vbn: Long, lbn: Long, sectorcount: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlGetNextLargeMcbEntry(mcb.toString(), runindex.toInt(), vbn.toString(), lbn.toString(), sectorcount.toString()) as Boolean) else false

public actual fun FsRtlGetNextMcbEntry(mcb: Long, runindex: UInt, vbn: Long, lbn: Long, sectorcount: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlGetNextMcbEntry(mcb.toString(), runindex.toInt(), vbn.toString(), lbn.toString(), sectorcount.toString()) as Boolean) else false

public actual fun FsRtlGetSectorSizeInformation(deviceobject: Long, sectorsizeinfo: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlGetSectorSizeInformation(deviceobject.toString(), sectorsizeinfo.toString()) as Int) else 0

public actual fun FsRtlGetSupportedFeatures(deviceobject: Long, supportedfeatures: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlGetSupportedFeatures(deviceobject.toString(), supportedfeatures.toString()) as Int) else 0

public actual fun FsRtlGetVirtualDiskNestingLevel(deviceobject: Long, nestinglevel: Long, nestingflags: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlGetVirtualDiskNestingLevel(deviceobject.toString(), nestinglevel.toString(), nestingflags.toString()) as Int) else 0

public actual fun FsRtlIncrementCcFastMdlReadWait() {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlIncrementCcFastMdlReadWait()
    }
}

public actual fun FsRtlIncrementCcFastReadNoWait() {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlIncrementCcFastReadNoWait()
    }
}

public actual fun FsRtlIncrementCcFastReadNotPossible() {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlIncrementCcFastReadNotPossible()
    }
}

public actual fun FsRtlIncrementCcFastReadResourceMiss() {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlIncrementCcFastReadResourceMiss()
    }
}

public actual fun FsRtlIncrementCcFastReadWait() {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlIncrementCcFastReadWait()
    }
}

public actual fun FsRtlInitExtraCreateParameterLookasideList(lookaside: Long, flags: UInt, size: ULong, tag: UInt) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlInitExtraCreateParameterLookasideList(lookaside.toString(), flags.toInt(), size.toString(), tag.toInt())
    }
}

public actual fun FsRtlInitializeBaseMcb(mcb: Long, pooltype: POOL_TYPE) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlInitializeBaseMcb(mcb.toString(), pooltype)
    }
}

public actual fun FsRtlInitializeBaseMcbEx(mcb: Long, pooltype: POOL_TYPE, flags: UShort): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlInitializeBaseMcbEx(mcb.toString(), pooltype, flags.toInt()) as Boolean) else false

public actual fun FsRtlInitializeExtraCreateParameter(ecp: Long, ecpflags: UInt, cleanupcallback: PFSRTL_EXTRA_CREATE_PARAMETER_CLEANUP_CALLBACK, totalsize: UInt, ecptype: Long, listallocatedfrom: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlInitializeExtraCreateParameter(ecp.toString(), ecpflags.toInt(), cleanupcallback.toLong().toString(), totalsize.toInt(), ecptype.toString(), listallocatedfrom.toString())
    }
}

public actual fun FsRtlInitializeExtraCreateParameterList(ecplist: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlInitializeExtraCreateParameterList(ecplist.toString()) as Int) else 0

public actual fun FsRtlInitializeFileLock(filelock: Long, completelockirproutine: PCOMPLETE_LOCK_IRP_ROUTINE, unlockroutine: PUNLOCK_ROUTINE) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlInitializeFileLock(filelock.toString(), completelockirproutine.toLong().toString(), unlockroutine.toLong().toString())
    }
}

public actual fun FsRtlInitializeLargeMcb(mcb: Long, pooltype: POOL_TYPE) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlInitializeLargeMcb(mcb.toString(), pooltype)
    }
}

public actual fun FsRtlInitializeMcb(mcb: Long, pooltype: POOL_TYPE) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlInitializeMcb(mcb.toString(), pooltype)
    }
}

public actual fun FsRtlInitializeOplock(oplock: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlInitializeOplock(oplock.toString())
    }
}

public actual fun FsRtlInitializeTunnelCache(cache: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlInitializeTunnelCache(cache.toString())
    }
}

public actual fun FsRtlInsertExtraCreateParameter(ecplist: Long, ecpcontext: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlInsertExtraCreateParameter(ecplist.toString(), ecpcontext.toString()) as Int) else 0

public actual fun FsRtlInsertPerFileContext(perfilecontextpointer: Long, ptr: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlInsertPerFileContext(perfilecontextpointer.toString(), ptr.toString()) as Int) else 0

public actual fun FsRtlInsertPerFileObjectContext(fileobject: Long, ptr: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlInsertPerFileObjectContext(fileobject.toString(), ptr.toString()) as Int) else 0

public actual fun FsRtlInsertPerStreamContext(perstreamcontext: Long, ptr: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlInsertPerStreamContext(perstreamcontext.toString(), ptr.toString()) as Int) else 0

public actual fun FsRtlIs32BitProcess(process: PEPROCESS): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlIs32BitProcess(process.toString()) as Boolean) else false

public actual fun FsRtlIsDaxVolume(fileobject: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlIsDaxVolume(fileobject.toString()) as Boolean) else false

public actual fun FsRtlIsDbcsInExpression(expression: Long, name: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlIsDbcsInExpression(expression.toString(), name.toString()) as Boolean) else false

public actual fun FsRtlIsEcpAcknowledged(ecpcontext: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlIsEcpAcknowledged(ecpcontext.toString()) as Boolean) else false

public actual fun FsRtlIsEcpFromUserMode(ecpcontext: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlIsEcpFromUserMode(ecpcontext.toString()) as Boolean) else false

public actual fun FsRtlIsExtentDangling(startpage: UInt, numberofpages: UInt, flags: UInt): UInt =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlIsExtentDangling(startpage.toInt(), numberofpages.toInt(), flags.toInt()) as Int).toUInt() else 0u

public actual fun FsRtlIsFatDbcsLegal(dbcsname: STRING, wildcardspermissible: Boolean, pathnamepermissible: Boolean, leadingbackslashpermissible: Boolean): Boolean =
    false

public actual fun FsRtlIsHpfsDbcsLegal(dbcsname: STRING, wildcardspermissible: Boolean, pathnamepermissible: Boolean, leadingbackslashpermissible: Boolean): Boolean =
    false

public actual fun FsRtlIsMobileOS(): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlIsMobileOS() as Boolean) else false

public actual fun FsRtlIsNameInExpression(expression: Long, name: Long, ignorecase: Boolean, upcasetable: PCWSTR): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlIsNameInExpression(expression.toString(), name.toString(), ignorecase, upcasetable.toString()) as Boolean) else false

public actual fun FsRtlIsNameInUnUpcasedExpression(expression: Long, name: Long, ignorecase: Boolean, upcasetable: PCWSTR): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlIsNameInUnUpcasedExpression(expression.toString(), name.toString(), ignorecase, upcasetable.toString()) as Boolean) else false

public actual fun FsRtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag: UInt): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag.toInt()) as Boolean) else false

public actual fun FsRtlIsNtstatusExpected(exception: NTSTATUS): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlIsNtstatusExpected(exception) as Boolean) else false

public actual fun FsRtlIsPagingFile(fileobject: Long): UInt =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlIsPagingFile(fileobject.toString()) as Int).toUInt() else 0u

public actual fun FsRtlIsSystemPagingFile(fileobject: Long): UInt =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlIsSystemPagingFile(fileobject.toString()) as Int).toUInt() else 0u

public actual fun FsRtlIssueDeviceIoControl(deviceobject: Long, ioctl: UInt, flags: UByte, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt, iosbinformation: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlIssueDeviceIoControl(deviceobject.toString(), ioctl.toInt(), flags.toInt(), inputbuffer.toString(), inputbufferlength.toInt(), outputbuffer.toString(), outputbufferlength.toInt(), iosbinformation.toString()) as Int) else 0

public actual fun FsRtlKernelFsControlFile(fileobject: Long, fscontrolcode: UInt, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt, retoutputbuffersize: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlKernelFsControlFile(fileobject.toString(), fscontrolcode.toInt(), inputbuffer.toString(), inputbufferlength.toInt(), outputbuffer.toString(), outputbufferlength.toInt(), retoutputbuffersize.toString()) as Int) else 0

public actual fun FsRtlLogCcFlushError(filename: Long, deviceobject: Long, sectionobjectpointer: Long, flusherror: NTSTATUS, flags: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlLogCcFlushError(filename.toString(), deviceobject.toString(), sectionobjectpointer.toString(), flusherror, flags.toInt()) as Int) else 0

public actual fun FsRtlLookupBaseMcbEntry(mcb: Long, vbn: Long, lbn: Long, sectorcountfromlbn: Long, startinglbn: Long, sectorcountfromstartinglbn: Long, index: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlLookupBaseMcbEntry(mcb.toString(), vbn.toString(), lbn.toString(), sectorcountfromlbn.toString(), startinglbn.toString(), sectorcountfromstartinglbn.toString(), index.toString()) as Boolean) else false

public actual fun FsRtlLookupLargeMcbEntry(mcb: Long, vbn: Long, lbn: Long, sectorcountfromlbn: Long, startinglbn: Long, sectorcountfromstartinglbn: Long, index: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlLookupLargeMcbEntry(mcb.toString(), vbn.toString(), lbn.toString(), sectorcountfromlbn.toString(), startinglbn.toString(), sectorcountfromstartinglbn.toString(), index.toString()) as Boolean) else false

public actual fun FsRtlLookupLastBaseMcbEntry(mcb: Long, vbn: Long, lbn: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlLookupLastBaseMcbEntry(mcb.toString(), vbn.toString(), lbn.toString()) as Boolean) else false

public actual fun FsRtlLookupLastBaseMcbEntryAndIndex(opaquemcb: Long, largevbn: Long, largelbn: Long, index: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlLookupLastBaseMcbEntryAndIndex(opaquemcb.toString(), largevbn.toString(), largelbn.toString(), index.toString()) as Boolean) else false

public actual fun FsRtlLookupLastLargeMcbEntry(mcb: Long, vbn: Long, lbn: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlLookupLastLargeMcbEntry(mcb.toString(), vbn.toString(), lbn.toString()) as Boolean) else false

public actual fun FsRtlLookupLastLargeMcbEntryAndIndex(opaquemcb: Long, largevbn: Long, largelbn: Long, index: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlLookupLastLargeMcbEntryAndIndex(opaquemcb.toString(), largevbn.toString(), largelbn.toString(), index.toString()) as Boolean) else false

public actual fun FsRtlLookupLastMcbEntry(mcb: Long, vbn: Long, lbn: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlLookupLastMcbEntry(mcb.toString(), vbn.toString(), lbn.toString()) as Boolean) else false

public actual fun FsRtlLookupMcbEntry(mcb: Long, vbn: UInt, lbn: Long, sectorcount: Long, index: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlLookupMcbEntry(mcb.toString(), vbn.toInt(), lbn.toString(), sectorcount.toString(), index.toString()) as Boolean) else false

public actual fun FsRtlLookupPerFileContext(perfilecontextpointer: Long, ownerid: Long, instanceid: Long): Long =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlLookupPerFileContext(perfilecontextpointer.toString(), ownerid.toString(), instanceid.toString()) as String).toLong() else 0L

public actual fun FsRtlLookupPerFileObjectContext(fileobject: Long, ownerid: Long, instanceid: Long): Long =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlLookupPerFileObjectContext(fileobject.toString(), ownerid.toString(), instanceid.toString()) as String).toLong() else 0L

public actual fun FsRtlLookupPerStreamContextInternal(streamcontext: Long, ownerid: Long, instanceid: Long): Long =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlLookupPerStreamContextInternal(streamcontext.toString(), ownerid.toString(), instanceid.toString()) as String).toLong() else 0L

public actual fun FsRtlMdlReadCompleteDev(fileobject: Long, mdlchain: Long, deviceobject: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlMdlReadCompleteDev(fileobject.toString(), mdlchain.toString(), deviceobject.toString()) as Boolean) else false

public actual fun FsRtlMdlReadDev(fileobject: Long, fileoffset: Long, length: UInt, lockkey: UInt, mdlchain: Long, iostatus: Long, deviceobject: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlMdlReadDev(fileobject.toString(), fileoffset.toString(), length.toInt(), lockkey.toInt(), mdlchain.toString(), iostatus.toString(), deviceobject.toString()) as Boolean) else false

public actual fun FsRtlMdlReadEx(fileobject: Long, fileoffset: Long, length: UInt, lockkey: UInt, mdlchain: Long, iostatus: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlMdlReadEx(fileobject.toString(), fileoffset.toString(), length.toInt(), lockkey.toInt(), mdlchain.toString(), iostatus.toString()) as Int) else 0

public actual fun FsRtlMdlWriteCompleteDev(fileobject: Long, fileoffset: Long, mdlchain: Long, deviceobject: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlMdlWriteCompleteDev(fileobject.toString(), fileoffset.toString(), mdlchain.toString(), deviceobject.toString()) as Boolean) else false

public actual fun FsRtlMupGetProviderIdFromName(pprovidername: Long, pproviderid: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlMupGetProviderIdFromName(pprovidername.toString(), pproviderid.toString()) as Int) else 0

public actual fun FsRtlMupGetProviderInfoFromFileObject(pfileobject: Long, level: UInt, pbuffer: Long, pbuffersize: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlMupGetProviderInfoFromFileObject(pfileobject.toString(), level.toInt(), pbuffer.toString(), pbuffersize.toString()) as Int) else 0

public actual fun FsRtlNormalizeNtstatus(exception: NTSTATUS, genericexception: NTSTATUS): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlNormalizeNtstatus(exception, genericexception) as Int) else 0

public actual fun FsRtlNotifyCleanup(notifysync: PNOTIFY_SYNC, notifylist: Long, fscontext: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlNotifyCleanup(notifysync.toString(), notifylist.toString(), fscontext.toString())
    }
}

public actual fun FsRtlNotifyCleanupAll(notifysync: PNOTIFY_SYNC, notifylist: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlNotifyCleanupAll(notifysync.toString(), notifylist.toString())
    }
}

public actual fun FsRtlNotifyFilterChangeDirectory(notifysync: PNOTIFY_SYNC, notifylist: Long, fscontext: Long, fulldirectoryname: Long, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifyirp: Long, traversecallback: PCHECK_FOR_TRAVERSE_ACCESS, subjectcontext: Long, filtercallback: PFILTER_REPORT_CHANGE) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlNotifyFilterChangeDirectory(notifysync.toString(), notifylist.toString(), fscontext.toString(), fulldirectoryname.toString(), watchtree, ignorebuffer, completionfilter.toInt(), notifyirp.toString(), traversecallback.toLong().toString(), subjectcontext.toString(), filtercallback.toLong().toString())
    }
}

public actual fun FsRtlNotifyFilterReportChange(notifysync: PNOTIFY_SYNC, notifylist: Long, fulltargetname: Long, targetnameoffset: UShort, streamname: Long, normalizedparentname: Long, filtermatch: UInt, action: UInt, targetcontext: Long, filtercontext: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlNotifyFilterReportChange(notifysync.toString(), notifylist.toString(), fulltargetname.toString(), targetnameoffset.toInt(), streamname.toString(), normalizedparentname.toString(), filtermatch.toInt(), action.toInt(), targetcontext.toString(), filtercontext.toString())
    }
}

public actual fun FsRtlNotifyFullChangeDirectory(notifysync: PNOTIFY_SYNC, notifylist: Long, fscontext: Long, fulldirectoryname: Long, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifyirp: Long, traversecallback: PCHECK_FOR_TRAVERSE_ACCESS, subjectcontext: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlNotifyFullChangeDirectory(notifysync.toString(), notifylist.toString(), fscontext.toString(), fulldirectoryname.toString(), watchtree, ignorebuffer, completionfilter.toInt(), notifyirp.toString(), traversecallback.toLong().toString(), subjectcontext.toString())
    }
}

public actual fun FsRtlNotifyFullReportChange(notifysync: PNOTIFY_SYNC, notifylist: Long, fulltargetname: Long, targetnameoffset: UShort, streamname: Long, normalizedparentname: Long, filtermatch: UInt, action: UInt, targetcontext: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlNotifyFullReportChange(notifysync.toString(), notifylist.toString(), fulltargetname.toString(), targetnameoffset.toInt(), streamname.toString(), normalizedparentname.toString(), filtermatch.toInt(), action.toInt(), targetcontext.toString())
    }
}

public actual fun FsRtlNotifyInitializeSync(notifysync: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlNotifyInitializeSync(notifysync.toString())
    }
}

public actual fun FsRtlNotifyUninitializeSync(notifysync: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlNotifyUninitializeSync(notifysync.toString())
    }
}

public actual fun FsRtlNotifyVolumeEvent(fileobject: Long, eventcode: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlNotifyVolumeEvent(fileobject.toString(), eventcode.toInt()) as Int) else 0

public actual fun FsRtlNotifyVolumeEventEx(fileobject: Long, eventcode: UInt, event: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlNotifyVolumeEventEx(fileobject.toString(), eventcode.toInt(), event.toString()) as Int) else 0

public actual fun FsRtlNumberOfRunsInBaseMcb(mcb: Long): UInt =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlNumberOfRunsInBaseMcb(mcb.toString()) as Int).toUInt() else 0u

public actual fun FsRtlNumberOfRunsInLargeMcb(mcb: Long): UInt =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlNumberOfRunsInLargeMcb(mcb.toString()) as Int).toUInt() else 0u

public actual fun FsRtlNumberOfRunsInMcb(mcb: Long): UInt =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlNumberOfRunsInMcb(mcb.toString()) as Int).toUInt() else 0u

public actual fun FsRtlOplockBreakH(oplock: Long, irp: Long, flags: UInt, context: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlOplockBreakH(oplock.toString(), irp.toString(), flags.toInt(), context.toString(), completionroutine.toLong().toString(), postirproutine.toLong().toString()) as Int) else 0

public actual fun FsRtlOplockBreakH2(oplock: Long, irp: Long, flags: UInt, context: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP, grantedaccess: Long, shareaccess: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlOplockBreakH2(oplock.toString(), irp.toString(), flags.toInt(), context.toString(), completionroutine.toLong().toString(), postirproutine.toLong().toString(), grantedaccess.toString(), shareaccess.toString()) as Int) else 0

public actual fun FsRtlOplockBreakToNone(oplock: Long, irpsp: Long, irp: Long, context: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlOplockBreakToNone(oplock.toString(), irpsp.toString(), irp.toString(), context.toString(), completionroutine.toLong().toString(), postirproutine.toLong().toString()) as Int) else 0

public actual fun FsRtlOplockBreakToNoneEx(oplock: Long, irp: Long, flags: UInt, context: Long, completionroutine: POPLOCK_WAIT_COMPLETE_ROUTINE, postirproutine: POPLOCK_FS_PREPOST_IRP): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlOplockBreakToNoneEx(oplock.toString(), irp.toString(), flags.toInt(), context.toString(), completionroutine.toLong().toString(), postirproutine.toLong().toString()) as Int) else 0

public actual fun FsRtlOplockFsctrl(oplock: Long, irp: Long, opencount: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlOplockFsctrl(oplock.toString(), irp.toString(), opencount.toInt()) as Int) else 0

public actual fun FsRtlOplockFsctrlEx(oplock: Long, irp: Long, opencount: UInt, flags: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlOplockFsctrlEx(oplock.toString(), irp.toString(), opencount.toInt(), flags.toInt()) as Int) else 0

public actual fun FsRtlOplockGetAnyBreakOwnerProcess(oplock: Long): PEPROCESS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlOplockGetAnyBreakOwnerProcess(oplock.toString()) as String).toLong() else 0L

public actual fun FsRtlOplockIsFastIoPossible(oplock: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlOplockIsFastIoPossible(oplock.toString()) as Boolean) else false

public actual fun FsRtlOplockIsSharedRequest(irp: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlOplockIsSharedRequest(irp.toString()) as Boolean) else false

public actual fun FsRtlOplockKeysEqual(fo1: Long, fo2: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlOplockKeysEqual(fo1.toString(), fo2.toString()) as Boolean) else false

public actual fun FsRtlPostPagingFileStackOverflow(context: Long, event: Long, stackoverflowroutine: PFSRTL_STACK_OVERFLOW_ROUTINE) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlPostPagingFileStackOverflow(context.toString(), event.toString(), stackoverflowroutine.toLong().toString())
    }
}

public actual fun FsRtlPostStackOverflow(context: Long, event: Long, stackoverflowroutine: PFSRTL_STACK_OVERFLOW_ROUTINE) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlPostStackOverflow(context.toString(), event.toString(), stackoverflowroutine.toLong().toString())
    }
}

public actual fun FsRtlPrepareMdlWriteDev(fileobject: Long, fileoffset: Long, length: UInt, lockkey: UInt, mdlchain: Long, iostatus: Long, deviceobject: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlPrepareMdlWriteDev(fileobject.toString(), fileoffset.toString(), length.toInt(), lockkey.toInt(), mdlchain.toString(), iostatus.toString(), deviceobject.toString()) as Boolean) else false

public actual fun FsRtlPrepareMdlWriteEx(fileobject: Long, fileoffset: Long, length: UInt, lockkey: UInt, mdlchain: Long, iostatus: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlPrepareMdlWriteEx(fileobject.toString(), fileoffset.toString(), length.toInt(), lockkey.toInt(), mdlchain.toString(), iostatus.toString()) as Int) else 0

public actual fun FsRtlPrepareToReuseEcp(ecpcontext: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlPrepareToReuseEcp(ecpcontext.toString())
    }
}

public actual fun FsRtlPrivateLock(filelock: Long, fileobject: Long, fileoffset: Long, length: Long, processid: PEPROCESS, key: UInt, failimmediately: Boolean, exclusivelock: Boolean, iosb: Long, irp: Long, context: Long, alreadysynchronized: Boolean): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlPrivateLock(filelock.toString(), fileobject.toString(), fileoffset.toString(), length.toString(), processid.toString(), key.toInt(), failimmediately, exclusivelock, iosb.toString(), irp.toString(), context.toString(), alreadysynchronized) as Boolean) else false

public actual fun FsRtlProcessFileLock(filelock: Long, irp: Long, context: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlProcessFileLock(filelock.toString(), irp.toString(), context.toString()) as Int) else 0

public actual fun FsRtlQueryCachedVdl(fileobject: Long, vdl: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlQueryCachedVdl(fileobject.toString(), vdl.toString()) as Int) else 0

public actual fun FsRtlQueryInformationFile(fileobject: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, retfileinformationsize: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlQueryInformationFile(fileobject.toString(), fileinformation.toString(), length.toInt(), fileinformationclass, retfileinformationsize.toString()) as Int) else 0

public actual fun FsRtlQueryKernelEaFile(fileobject: Long, returnedeadata: Long, length: UInt, returnsingleentry: Boolean, ealist: Long, ealistlength: UInt, eaindex: Long, restartscan: Boolean, lengthreturned: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlQueryKernelEaFile(fileobject.toString(), returnedeadata.toString(), length.toInt(), returnsingleentry, ealist.toString(), ealistlength.toInt(), eaindex.toString(), restartscan, lengthreturned.toString()) as Int) else 0

public actual fun FsRtlQueryMaximumVirtualDiskNestingLevel(): UInt =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlQueryMaximumVirtualDiskNestingLevel() as Int).toUInt() else 0u

public actual fun FsRtlRegisterFileSystemFilterCallbacks(filterdriverobject: Long, callbacks: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlRegisterFileSystemFilterCallbacks(filterdriverobject.toString(), callbacks.toString()) as Int) else 0

public actual fun FsRtlRegisterUncProvider(muphandle: Long, redirectordevicename: Long, mailslotssupported: Boolean): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlRegisterUncProvider(muphandle.toString(), redirectordevicename.toString(), mailslotssupported) as Int) else 0

public actual fun FsRtlRegisterUncProviderEx(muphandle: Long, redirdevname: Long, deviceobject: Long, flags: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlRegisterUncProviderEx(muphandle.toString(), redirdevname.toString(), deviceobject.toString(), flags.toInt()) as Int) else 0

public actual fun FsRtlRegisterUncProviderEx2(redirdevname: Long, deviceobject: Long, registration: Long, muphandle: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlRegisterUncProviderEx2(redirdevname.toString(), deviceobject.toString(), registration.toString(), muphandle.toString()) as Int) else 0

public actual fun FsRtlReleaseFile(fileobject: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlReleaseFile(fileobject.toString())
    }
}

public actual fun FsRtlRemoveBaseMcbEntry(mcb: Long, vbn: Long, sectorcount: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlRemoveBaseMcbEntry(mcb.toString(), vbn.toString(), sectorcount.toString()) as Boolean) else false

public actual fun FsRtlRemoveDotsFromPath(originalstring: PWSTR, pathlength: UShort, newlength: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlRemoveDotsFromPath(originalstring.toString(), pathlength.toInt(), newlength.toString()) as Int) else 0

public actual fun FsRtlRemoveExtraCreateParameter(ecplist: Long, ecptype: Long, ecpcontext: Long, ecpcontextsize: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlRemoveExtraCreateParameter(ecplist.toString(), ecptype.toString(), ecpcontext.toString(), ecpcontextsize.toString()) as Int) else 0

public actual fun FsRtlRemoveLargeMcbEntry(mcb: Long, vbn: Long, sectorcount: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlRemoveLargeMcbEntry(mcb.toString(), vbn.toString(), sectorcount.toString())
    }
}

public actual fun FsRtlRemoveMcbEntry(mcb: Long, vbn: UInt, sectorcount: UInt) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlRemoveMcbEntry(mcb.toString(), vbn.toInt(), sectorcount.toInt())
    }
}

public actual fun FsRtlRemovePerFileContext(perfilecontextpointer: Long, ownerid: Long, instanceid: Long): Long =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlRemovePerFileContext(perfilecontextpointer.toString(), ownerid.toString(), instanceid.toString()) as String).toLong() else 0L

public actual fun FsRtlRemovePerFileObjectContext(fileobject: Long, ownerid: Long, instanceid: Long): Long =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlRemovePerFileObjectContext(fileobject.toString(), ownerid.toString(), instanceid.toString()) as String).toLong() else 0L

public actual fun FsRtlRemovePerStreamContext(streamcontext: Long, ownerid: Long, instanceid: Long): Long =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlRemovePerStreamContext(streamcontext.toString(), ownerid.toString(), instanceid.toString()) as String).toLong() else 0L

public actual fun FsRtlResetBaseMcb(mcb: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlResetBaseMcb(mcb.toString())
    }
}

public actual fun FsRtlResetLargeMcb(mcb: Long, selfsynchronized: Boolean) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlResetLargeMcb(mcb.toString(), selfsynchronized)
    }
}

public actual fun FsRtlSetDriverBacking(driverobj: Long, flags: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlSetDriverBacking(driverobj.toString(), flags.toInt()) as Int) else 0

public actual fun FsRtlSetEcpListIntoIrp(irp: Long, ecplist: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlSetEcpListIntoIrp(irp.toString(), ecplist.toString()) as Int) else 0

public actual fun FsRtlSetKernelEaFile(fileobject: Long, eabuffer: Long, length: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlSetKernelEaFile(fileobject.toString(), eabuffer.toString(), length.toInt()) as Int) else 0

public actual fun FsRtlSplitBaseMcb(mcb: Long, vbn: Long, amount: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlSplitBaseMcb(mcb.toString(), vbn.toString(), amount.toString()) as Boolean) else false

public actual fun FsRtlSplitLargeMcb(mcb: Long, vbn: Long, amount: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlSplitLargeMcb(mcb.toString(), vbn.toString(), amount.toString()) as Boolean) else false

public actual fun FsRtlTeardownPerFileContexts(perfilecontextpointer: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlTeardownPerFileContexts(perfilecontextpointer.toString())
    }
}

public actual fun FsRtlTeardownPerStreamContexts(advancedheader: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlTeardownPerStreamContexts(advancedheader.toString())
    }
}

public actual fun FsRtlTruncateBaseMcb(mcb: Long, vbn: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlTruncateBaseMcb(mcb.toString(), vbn.toString())
    }
}

public actual fun FsRtlTruncateLargeMcb(mcb: Long, vbn: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlTruncateLargeMcb(mcb.toString(), vbn.toString())
    }
}

public actual fun FsRtlTruncateMcb(mcb: Long, vbn: UInt) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlTruncateMcb(mcb.toString(), vbn.toInt())
    }
}

public actual fun FsRtlUninitializeBaseMcb(mcb: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlUninitializeBaseMcb(mcb.toString())
    }
}

public actual fun FsRtlUninitializeFileLock(filelock: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlUninitializeFileLock(filelock.toString())
    }
}

public actual fun FsRtlUninitializeLargeMcb(mcb: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlUninitializeLargeMcb(mcb.toString())
    }
}

public actual fun FsRtlUninitializeMcb(mcb: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlUninitializeMcb(mcb.toString())
    }
}

public actual fun FsRtlUninitializeOplock(oplock: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlUninitializeOplock(oplock.toString())
    }
}

public actual fun FsRtlUpdateDiskCounters(bytesread: ULong, byteswritten: ULong) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlUpdateDiskCounters(bytesread.toString(), byteswritten.toString())
    }
}

public actual fun FsRtlUpperOplockFsctrl(oplock: Long, irp: Long, opencount: UInt, loweroplockstate: UInt, flags: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlUpperOplockFsctrl(oplock.toString(), irp.toString(), opencount.toInt(), loweroplockstate.toInt(), flags.toInt()) as Int) else 0

public actual fun FsRtlValidateReparsePointBuffer(bufferlength: UInt, reparsebuffer: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlValidateReparsePointBuffer(bufferlength.toInt(), reparsebuffer.toString()) as Int) else 0

public actual fun FsRtlVolumeDeviceToCorrelationId(volumedeviceobject: Long, guid: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_FsRtlVolumeDeviceToCorrelationId(volumedeviceobject.toString(), guid.toString()) as Int) else 0

public actual fun GetSecurityUserInfo(logonid: Long, flags: UInt, userinformation: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_GetSecurityUserInfo(logonid.toString(), flags.toInt(), userinformation.toString()) as Int) else 0

public actual fun IoAcquireVpbSpinLock(irql: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoAcquireVpbSpinLock(irql.toString())
    }
}

public actual fun IoApplyPriorityInfoThread(inputpriorityinfo: Long, outputpriorityinfo: Long, thread: PETHREAD): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoApplyPriorityInfoThread(inputpriorityinfo.toString(), outputpriorityinfo.toString(), thread.toString()) as Int) else 0

public actual fun IoCheckDesiredAccess(desiredaccess: Long, grantedaccess: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoCheckDesiredAccess(desiredaccess.toString(), grantedaccess.toInt()) as Int) else 0

public actual fun IoCheckEaBufferValidity(eabuffer: Long, ealength: UInt, erroroffset: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoCheckEaBufferValidity(eabuffer.toString(), ealength.toInt(), erroroffset.toString()) as Int) else 0

public actual fun IoCheckFunctionAccess(grantedaccess: UInt, majorfunction: UByte, minorfunction: UByte, iocontrolcode: UInt, arg1: Long, arg2: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoCheckFunctionAccess(grantedaccess.toInt(), majorfunction.toInt(), minorfunction.toInt(), iocontrolcode.toInt(), arg1.toString(), arg2.toString()) as Int) else 0

public actual fun IoCheckQuerySetFileInformation(fileinformationclass: FILE_INFORMATION_CLASS, length: UInt, setoperation: Boolean): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoCheckQuerySetFileInformation(fileinformationclass, length.toInt(), setoperation) as Int) else 0

public actual fun IoCheckQuerySetVolumeInformation(fsinformationclass: FS_INFORMATION_CLASS, length: UInt, setoperation: Boolean): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoCheckQuerySetVolumeInformation(fsinformationclass, length.toInt(), setoperation) as Int) else 0

public actual fun IoCheckQuotaBufferValidity(quotabuffer: Long, quotalength: UInt, erroroffset: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoCheckQuotaBufferValidity(quotabuffer.toString(), quotalength.toInt(), erroroffset.toString()) as Int) else 0

public actual fun IoClearFsTrackOffsetState(irp: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoClearFsTrackOffsetState(irp.toString()) as Int) else 0

public actual fun IoCreateStreamFileObject(fileobject: Long, deviceobject: Long): Long =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoCreateStreamFileObject(fileobject.toString(), deviceobject.toString()) as String).toLong() else 0L

public actual fun IoCreateStreamFileObjectEx(fileobject: Long, deviceobject: Long, filehandle: Long): Long =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoCreateStreamFileObjectEx(fileobject.toString(), deviceobject.toString(), filehandle.toString()) as String).toLong() else 0L

public actual fun IoCreateStreamFileObjectEx2(createoptions: Long, fileobject: Long, deviceobject: Long, streamfileobject: Long, filehandle: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoCreateStreamFileObjectEx2(createoptions.toString(), fileobject.toString(), deviceobject.toString(), streamfileobject.toString(), filehandle.toString()) as Int) else 0

public actual fun IoCreateStreamFileObjectLite(fileobject: Long, deviceobject: Long): Long =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoCreateStreamFileObjectLite(fileobject.toString(), deviceobject.toString()) as String).toLong() else 0L

public actual fun IoEnumerateDeviceObjectList(driverobject: Long, deviceobjectlist: Long, deviceobjectlistsize: UInt, actualnumberdeviceobjects: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoEnumerateDeviceObjectList(driverobject.toString(), deviceobjectlist.toString(), deviceobjectlistsize.toInt(), actualnumberdeviceobjects.toString()) as Int) else 0

public actual fun IoEnumerateRegisteredFiltersList(driverobjectlist: Long, driverobjectlistsize: UInt, actualnumberdriverobjects: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoEnumerateRegisteredFiltersList(driverobjectlist.toString(), driverobjectlistsize.toInt(), actualnumberdriverobjects.toString()) as Int) else 0

public actual fun IoFastQueryNetworkAttributes(objectattributes: Long, desiredaccess: UInt, openoptions: UInt, iostatus: Long, buffer: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoFastQueryNetworkAttributes(objectattributes.toString(), desiredaccess.toInt(), openoptions.toInt(), iostatus.toString(), buffer.toString()) as Boolean) else false

public actual fun IoGetAttachedDevice(deviceobject: Long): Long =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoGetAttachedDevice(deviceobject.toString()) as String).toLong() else 0L

public actual fun IoGetBaseFileSystemDeviceObject(fileobject: Long): Long =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoGetBaseFileSystemDeviceObject(fileobject.toString()) as String).toLong() else 0L

public actual fun IoGetDeviceAttachmentBaseRef(deviceobject: Long): Long =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoGetDeviceAttachmentBaseRef(deviceobject.toString()) as String).toLong() else 0L

public actual fun IoGetDeviceToVerify(thread: PETHREAD): Long =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoGetDeviceToVerify(thread.toString()) as String).toLong() else 0L

public actual fun IoGetDiskDeviceObject(filesystemdeviceobject: Long, diskdeviceobject: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoGetDiskDeviceObject(filesystemdeviceobject.toString(), diskdeviceobject.toString()) as Int) else 0

public actual fun IoGetFsTrackOffsetState(irp: Long, retfstrackoffsetblob: Long, rettrackedoffset: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoGetFsTrackOffsetState(irp.toString(), retfstrackoffsetblob.toString(), rettrackedoffset.toString()) as Int) else 0

public actual fun IoGetLowerDeviceObject(deviceobject: Long): Long =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoGetLowerDeviceObject(deviceobject.toString()) as String).toLong() else 0L

public actual fun IoGetOplockKeyContext(fileobject: Long): Long =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoGetOplockKeyContext(fileobject.toString()) as String).toLong() else 0L

public actual fun IoGetOplockKeyContextEx(fileobject: Long): Long =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoGetOplockKeyContextEx(fileobject.toString()) as String).toLong() else 0L

public actual fun IoGetRequestorProcess(irp: Long): PEPROCESS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoGetRequestorProcess(irp.toString()) as String).toLong() else 0L

public actual fun IoGetRequestorProcessId(irp: Long): UInt =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoGetRequestorProcessId(irp.toString()) as Int).toUInt() else 0u

public actual fun IoGetRequestorSessionId(irp: Long, psessionid: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoGetRequestorSessionId(irp.toString(), psessionid.toString()) as Int) else 0

public actual fun IoIrpHasFsTrackOffsetExtensionType(irp: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoIrpHasFsTrackOffsetExtensionType(irp.toString()) as Boolean) else false

public actual fun IoIsOperationSynchronous(irp: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoIsOperationSynchronous(irp.toString()) as Boolean) else false

public actual fun IoIsSystemThread(thread: PETHREAD): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoIsSystemThread(thread.toString()) as Boolean) else false

public actual fun IoIsValidNameGraftingBuffer(irp: Long, reparsebuffer: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoIsValidNameGraftingBuffer(irp.toString(), reparsebuffer.toString()) as Boolean) else false

public actual fun IoPageRead(fileobject: Long, memorydescriptorlist: Long, startingoffset: Long, event: Long, iostatusblock: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoPageRead(fileobject.toString(), memorydescriptorlist.toString(), startingoffset.toString(), event.toString(), iostatusblock.toString()) as Int) else 0

public actual fun IoQueryFileDosDeviceName(fileobject: Long, objectnameinformation: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoQueryFileDosDeviceName(fileobject.toString(), objectnameinformation.toString()) as Int) else 0

public actual fun IoQueryFileInformation(fileobject: Long, fileinformationclass: FILE_INFORMATION_CLASS, length: UInt, fileinformation: Long, returnedlength: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoQueryFileInformation(fileobject.toString(), fileinformationclass, length.toInt(), fileinformation.toString(), returnedlength.toString()) as Int) else 0

public actual fun IoQueryVolumeInformation(fileobject: Long, fsinformationclass: FS_INFORMATION_CLASS, length: UInt, fsinformation: Long, returnedlength: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoQueryVolumeInformation(fileobject.toString(), fsinformationclass, length.toInt(), fsinformation.toString(), returnedlength.toString()) as Int) else 0

public actual fun IoQueueThreadIrp(irp: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoQueueThreadIrp(irp.toString())
    }
}

public actual fun IoRegisterFileSystem(deviceobject: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoRegisterFileSystem(deviceobject.toString())
    }
}

public actual fun IoRegisterFsRegistrationChange(driverobject: Long, drivernotificationroutine: DRIVER_FS_NOTIFICATION): NTSTATUS =
    0

public actual fun IoRegisterFsRegistrationChangeMountAware(driverobject: Long, drivernotificationroutine: DRIVER_FS_NOTIFICATION, synchronizewithmounts: Boolean): NTSTATUS =
    0

public actual fun IoReleaseVpbSpinLock(irql: UByte) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoReleaseVpbSpinLock(irql.toInt())
    }
}

public actual fun IoReplaceFileObjectName(fileobject: Long, newfilename: PCWSTR, filenamelength: UShort): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoReplaceFileObjectName(fileobject.toString(), newfilename.toString(), filenamelength.toInt()) as Int) else 0

public actual fun IoRequestDeviceRemovalForReset(physicaldeviceobject: Long, flags: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoRequestDeviceRemovalForReset(physicaldeviceobject.toString(), flags.toInt()) as Int) else 0

public actual fun IoRetrievePriorityInfo(irp: Long, fileobject: Long, thread: PETHREAD, priorityinfo: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoRetrievePriorityInfo(irp.toString(), fileobject.toString(), thread.toString(), priorityinfo.toString()) as Int) else 0

public actual fun IoSetDeviceToVerify(thread: PETHREAD, deviceobject: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoSetDeviceToVerify(thread.toString(), deviceobject.toString())
    }
}

public actual fun IoSetFsTrackOffsetState(irp: Long, fstrackoffsetblob: Long, trackedoffset: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoSetFsTrackOffsetState(irp.toString(), fstrackoffsetblob.toString(), trackedoffset.toString()) as Int) else 0

public actual fun IoSetInformation(fileobject: Long, fileinformationclass: FILE_INFORMATION_CLASS, length: UInt, fileinformation: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoSetInformation(fileobject.toString(), fileinformationclass, length.toInt(), fileinformation.toString()) as Int) else 0

public actual fun IoSynchronousPageWrite(fileobject: Long, memorydescriptorlist: Long, startingoffset: Long, event: Long, iostatusblock: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoSynchronousPageWrite(fileobject.toString(), memorydescriptorlist.toString(), startingoffset.toString(), event.toString(), iostatusblock.toString()) as Int) else 0

public actual fun IoThreadToProcess(thread: PETHREAD): PEPROCESS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoThreadToProcess(thread.toString()) as String).toLong() else 0L

public actual fun IoUnregisterFileSystem(deviceobject: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoUnregisterFileSystem(deviceobject.toString())
    }
}

public actual fun IoUnregisterFsRegistrationChange(driverobject: Long, drivernotificationroutine: DRIVER_FS_NOTIFICATION) {
}

public actual fun IoVerifyVolume(deviceobject: Long, allowrawmount: Boolean): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_IoVerifyVolume(deviceobject.toString(), allowrawmount) as Int) else 0

public actual fun KeAcquireQueuedSpinLock(number: KSPIN_LOCK_QUEUE_NUMBER): UByte =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_KeAcquireQueuedSpinLock(number) as Int).toUByte() else 0u

public actual fun KeAcquireSpinLockRaiseToSynch(spinlock: Long): UByte =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_KeAcquireSpinLockRaiseToSynch(spinlock.toString()) as Int).toUByte() else 0u

public actual fun KeAttachProcess(process: PRKPROCESS) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_KeAttachProcess(process.toString())
    }
}

public actual fun KeDetachProcess() {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_KeDetachProcess()
    }
}

public actual fun KeInitializeMutant(mutant: Long, initialowner: Boolean) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_KeInitializeMutant(mutant.toString(), initialowner)
    }
}

public actual fun KeInitializeQueue(queue: Long, count: UInt) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_KeInitializeQueue(queue.toString(), count.toInt())
    }
}

public actual fun KeInsertHeadQueue(queue: Long, entry: Long): Int =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_KeInsertHeadQueue(queue.toString(), entry.toString()) as Int) else 0

public actual fun KeInsertQueue(queue: Long, entry: Long): Int =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_KeInsertQueue(queue.toString(), entry.toString()) as Int) else 0

public actual fun KeReadStateMutant(mutant: Long): Int =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_KeReadStateMutant(mutant.toString()) as Int) else 0

public actual fun KeReadStateQueue(queue: Long): Int =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_KeReadStateQueue(queue.toString()) as Int) else 0

public actual fun KeReleaseMutant(mutant: Long, increment: Int, abandoned: Boolean, wait: Boolean): Int =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_KeReleaseMutant(mutant.toString(), increment, abandoned, wait) as Int) else 0

public actual fun KeReleaseQueuedSpinLock(number: KSPIN_LOCK_QUEUE_NUMBER, oldirql: UByte) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_KeReleaseQueuedSpinLock(number, oldirql.toInt())
    }
}

public actual fun KeRemoveQueue(queue: Long, waitmode: Byte, timeout: Long): Long =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_KeRemoveQueue(queue.toString(), waitmode.toInt(), timeout.toString()) as String).toLong() else 0L

public actual fun KeRemoveQueueEx(queue: Long, waitmode: Byte, alertable: Boolean, timeout: Long, entryarray: Long, count: UInt): UInt =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_KeRemoveQueueEx(queue.toString(), waitmode.toInt(), alertable, timeout.toString(), entryarray.toString(), count.toInt()) as Int).toUInt() else 0u

public actual fun KeRundownQueue(queue: Long): Long =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_KeRundownQueue(queue.toString()) as String).toLong() else 0L

public actual fun KeSetIdealProcessorThread(thread: PKTHREAD, processor: UByte): UByte =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_KeSetIdealProcessorThread(thread.toString(), processor.toInt()) as Int).toUByte() else 0u

public actual fun KeSetKernelStackSwapEnable(enable: Boolean): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_KeSetKernelStackSwapEnable(enable) as Boolean) else false

public actual fun KeStackAttachProcess(process: PRKPROCESS, apcstate: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_KeStackAttachProcess(process.toString(), apcstate.toString())
    }
}

public actual fun KeTryToAcquireQueuedSpinLock(number: KSPIN_LOCK_QUEUE_NUMBER, oldirql: Long): UInt =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_KeTryToAcquireQueuedSpinLock(number, oldirql.toString()) as Int).toUInt() else 0u

public actual fun KeUnstackDetachProcess(apcstate: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_KeUnstackDetachProcess(apcstate.toString())
    }
}

public actual fun MakeSignature(phcontext: Long, fqop: UInt, pmessage: Long, messageseqno: UInt): HRESULT =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_MakeSignature(phcontext.toString(), fqop.toInt(), pmessage.toString(), messageseqno.toInt()) as Int) else 0

public actual fun MapSecurityError(secstatus: HRESULT): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_MapSecurityError(secstatus) as Int) else 0

public actual fun MmCanFileBeTruncated(sectionpointer: Long, newfilesize: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_MmCanFileBeTruncated(sectionpointer.toString(), newfilesize.toString()) as Boolean) else false

public actual fun MmDoesFileHaveUserWritableReferences(sectionpointer: Long): UInt =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_MmDoesFileHaveUserWritableReferences(sectionpointer.toString()) as Int).toUInt() else 0u

public actual fun MmFlushImageSection(sectionobjectpointer: Long, flushtype: MMFLUSH_TYPE): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_MmFlushImageSection(sectionobjectpointer.toString(), flushtype) as Boolean) else false

public actual fun MmForceSectionClosed(sectionobjectpointer: Long, delayclose: Boolean): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_MmForceSectionClosed(sectionobjectpointer.toString(), delayclose) as Boolean) else false

public actual fun MmForceSectionClosedEx(sectionobjectpointer: Long, forcecloseflags: UInt): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_MmForceSectionClosedEx(sectionobjectpointer.toString(), forcecloseflags.toInt()) as Boolean) else false

public actual fun MmGetMaximumFileSectionSize(): ULong =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_MmGetMaximumFileSectionSize() as String).toULong() else 0uL

public actual fun MmIsFileSectionActive(fssectionpointer: Long, flags: UInt, sectionisactive: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_MmIsFileSectionActive(fssectionpointer.toString(), flags.toInt(), sectionisactive.toString()) as Int) else 0

public actual fun MmIsRecursiveIoFault(): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_MmIsRecursiveIoFault() as Boolean) else false

public actual fun MmMdlPagesAreZero(mdl: Long): UInt =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_MmMdlPagesAreZero(mdl.toString()) as Int).toUInt() else 0u

public actual fun MmPrefetchPages(numberoflists: UInt, readlists: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_MmPrefetchPages(numberoflists.toInt(), readlists.toString()) as Int) else 0

public actual fun MmSetAddressRangeModified(address: Long, length: ULong): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_MmSetAddressRangeModified(address.toString(), length.toString()) as Boolean) else false

public actual fun NtAccessCheckAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, desiredaccess: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtAccessCheckAndAuditAlarm(subsystemname.toString(), handleid.toString(), objecttypename.toString(), objectname.toString(), securitydescriptor.toString(), desiredaccess.toInt(), genericmapping.toString(), objectcreation, grantedaccess.toString(), accessstatus.toString(), generateonclose.toString()) as Int) else 0

public actual fun NtAccessCheckByTypeAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtAccessCheckByTypeAndAuditAlarm(subsystemname.toString(), handleid.toString(), objecttypename.toString(), objectname.toString(), securitydescriptor.toString(), principalselfsid.toString(), desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.toString(), objecttypelistlength.toInt(), genericmapping.toString(), objectcreation, grantedaccess.toString(), accessstatus.toString(), generateonclose.toString()) as Int) else 0

public actual fun NtAccessCheckByTypeResultListAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtAccessCheckByTypeResultListAndAuditAlarm(subsystemname.toString(), handleid.toString(), objecttypename.toString(), objectname.toString(), securitydescriptor.toString(), principalselfsid.toString(), desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.toString(), objecttypelistlength.toInt(), genericmapping.toString(), objectcreation, grantedaccess.toString(), accessstatus.toString(), generateonclose.toString()) as Int) else 0

public actual fun NtAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname: Long, handleid: Long, clienttoken: HANDLE, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname.toString(), handleid.toString(), clienttoken.toString(), objecttypename.toString(), objectname.toString(), securitydescriptor.toString(), principalselfsid.toString(), desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.toString(), objecttypelistlength.toInt(), genericmapping.toString(), objectcreation, grantedaccess.toString(), accessstatus.toString(), generateonclose.toString()) as Int) else 0

public actual fun NtAdjustGroupsToken(tokenhandle: HANDLE, resettodefault: Boolean, newstate: Long, bufferlength: UInt, previousstate: Long, returnlength: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtAdjustGroupsToken(tokenhandle.toString(), resettodefault, newstate.toString(), bufferlength.toInt(), previousstate.toString(), returnlength.toString()) as Int) else 0

public actual fun NtAdjustPrivilegesToken(tokenhandle: HANDLE, disableallprivileges: Boolean, newstate: Long, bufferlength: UInt, previousstate: Long, returnlength: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtAdjustPrivilegesToken(tokenhandle.toString(), disableallprivileges, newstate.toString(), bufferlength.toInt(), previousstate.toString(), returnlength.toString()) as Int) else 0

public actual fun NtAllocateVirtualMemory(processhandle: HANDLE, baseaddress: Long, zerobits: ULong, regionsize: Long, allocationtype: UInt, protect: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtAllocateVirtualMemory(processhandle.toString(), baseaddress.toString(), zerobits.toString(), regionsize.toString(), allocationtype.toInt(), protect.toInt()) as Int) else 0

public actual fun NtAllocateVirtualMemoryEx(processhandle: HANDLE, baseaddress: Long, regionsize: Long, allocationtype: UInt, pageprotection: UInt, extendedparameters: Long, extendedparametercount: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtAllocateVirtualMemoryEx(processhandle.toString(), baseaddress.toString(), regionsize.toString(), allocationtype.toInt(), pageprotection.toInt(), extendedparameters.toString(), extendedparametercount.toInt()) as Int) else 0

public actual fun NtCancelIoFileEx(filehandle: HANDLE, iorequesttocancel: Long, iostatusblock: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtCancelIoFileEx(filehandle.toString(), iorequesttocancel.toString(), iostatusblock.toString()) as Int) else 0

public actual fun NtCloseObjectAuditAlarm(subsystemname: Long, handleid: Long, generateonclose: Boolean): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtCloseObjectAuditAlarm(subsystemname.toString(), handleid.toString(), generateonclose) as Int) else 0

public actual fun NtCreateDirectoryObject(directoryhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtCreateDirectoryObject(directoryhandle.toString(), desiredaccess.toInt(), objectattributes.toString()) as Int) else 0

public actual fun NtCreateEvent(eventhandle: Long, desiredaccess: UInt, objectattributes: Long, eventtype: EVENT_TYPE, initialstate: Boolean): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtCreateEvent(eventhandle.toString(), desiredaccess.toInt(), objectattributes.toString(), eventtype, initialstate) as Int) else 0

public actual fun NtCreateFile(filehandle: Long, desiredaccess: FILE_ACCESS_RIGHTS, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: FILE_FLAGS_AND_ATTRIBUTES, shareaccess: FILE_SHARE_MODE, createdisposition: NTCREATEFILE_CREATE_DISPOSITION, createoptions: NTCREATEFILE_CREATE_OPTIONS, eabuffer: Long, ealength: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtCreateFile(filehandle.toString(), desiredaccess.toInt(), objectattributes.toString(), iostatusblock.toString(), allocationsize.toString(), fileattributes.toInt(), shareaccess.toInt(), createdisposition.toInt(), createoptions.toInt(), eabuffer.toString(), ealength.toInt()) as Int) else 0

public actual fun NtCreateSection(sectionhandle: Long, desiredaccess: UInt, objectattributes: Long, maximumsize: Long, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: HANDLE): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtCreateSection(sectionhandle.toString(), desiredaccess.toInt(), objectattributes.toString(), maximumsize.toString(), sectionpageprotection.toInt(), allocationattributes.toInt(), filehandle.toString()) as Int) else 0

public actual fun NtCreateSectionEx(sectionhandle: Long, desiredaccess: UInt, objectattributes: Long, maximumsize: Long, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: HANDLE, extendedparameters: Long, extendedparametercount: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtCreateSectionEx(sectionhandle.toString(), desiredaccess.toInt(), objectattributes.toString(), maximumsize.toString(), sectionpageprotection.toInt(), allocationattributes.toInt(), filehandle.toString(), extendedparameters.toString(), extendedparametercount.toInt()) as Int) else 0

public actual fun NtDeleteFile(objectattributes: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtDeleteFile(objectattributes.toString()) as Int) else 0

public actual fun NtDeleteObjectAuditAlarm(subsystemname: Long, handleid: Long, generateonclose: Boolean): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtDeleteObjectAuditAlarm(subsystemname.toString(), handleid.toString(), generateonclose) as Int) else 0

public actual fun NtDuplicateObject(sourceprocesshandle: HANDLE, sourcehandle: HANDLE, targetprocesshandle: HANDLE, targethandle: Long, desiredaccess: UInt, handleattributes: UInt, options: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtDuplicateObject(sourceprocesshandle.toString(), sourcehandle.toString(), targetprocesshandle.toString(), targethandle.toString(), desiredaccess.toInt(), handleattributes.toInt(), options.toInt()) as Int) else 0

public actual fun NtDuplicateToken(existingtokenhandle: HANDLE, desiredaccess: UInt, objectattributes: Long, effectiveonly: Boolean, tokentype: TOKEN_TYPE, newtokenhandle: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtDuplicateToken(existingtokenhandle.toString(), desiredaccess.toInt(), objectattributes.toString(), effectiveonly, tokentype, newtokenhandle.toString()) as Int) else 0

public actual fun NtFilterToken(existingtokenhandle: HANDLE, flags: UInt, sidstodisable: Long, privilegestodelete: Long, restrictedsids: Long, newtokenhandle: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtFilterToken(existingtokenhandle.toString(), flags.toInt(), sidstodisable.toString(), privilegestodelete.toString(), restrictedsids.toString(), newtokenhandle.toString()) as Int) else 0

public actual fun NtFlushBuffersFile(filehandle: HANDLE, iostatusblock: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtFlushBuffersFile(filehandle.toString(), iostatusblock.toString()) as Int) else 0

public actual fun NtFlushBuffersFileEx(filehandle: HANDLE, flags: UInt, parameters: Long, parameterssize: UInt, iostatusblock: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtFlushBuffersFileEx(filehandle.toString(), flags.toInt(), parameters.toString(), parameterssize.toInt(), iostatusblock.toString()) as Int) else 0

public actual fun NtFlushVirtualMemory(processhandle: HANDLE, baseaddress: Long, regionsize: Long, iostatus: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtFlushVirtualMemory(processhandle.toString(), baseaddress.toString(), regionsize.toString(), iostatus.toString()) as Int) else 0

public actual fun NtFreeVirtualMemory(processhandle: HANDLE, baseaddress: Long, regionsize: Long, freetype: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtFreeVirtualMemory(processhandle.toString(), baseaddress.toString(), regionsize.toString(), freetype.toInt()) as Int) else 0

public actual fun NtFsControlFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, fscontrolcode: UInt, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt): NTSTATUS =
    0

public actual fun NtImpersonateAnonymousToken(threadhandle: HANDLE): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtImpersonateAnonymousToken(threadhandle.toString()) as Int) else 0

public actual fun NtLockFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, byteoffset: Long, length: Long, key: UInt, failimmediately: Boolean, exclusivelock: Boolean): NTSTATUS =
    0

public actual fun NtNotifyChangeKey(keyhandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, completionfilter: UInt, watchtree: Boolean, buffer: Long, buffersize: UInt, asynchronous: Boolean): NTSTATUS =
    0

public actual fun NtOpenDirectoryObject(directoryhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtOpenDirectoryObject(directoryhandle.toString(), desiredaccess.toInt(), objectattributes.toString()) as Int) else 0

public actual fun NtOpenFile(filehandle: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, shareaccess: UInt, openoptions: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtOpenFile(filehandle.toString(), desiredaccess.toInt(), objectattributes.toString(), iostatusblock.toString(), shareaccess.toInt(), openoptions.toInt()) as Int) else 0

public actual fun NtOpenObjectAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, clienttoken: HANDLE, desiredaccess: UInt, grantedaccess: UInt, privileges: Long, objectcreation: Boolean, accessgranted: Boolean, generateonclose: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtOpenObjectAuditAlarm(subsystemname.toString(), handleid.toString(), objecttypename.toString(), objectname.toString(), securitydescriptor.toString(), clienttoken.toString(), desiredaccess.toInt(), grantedaccess.toInt(), privileges.toString(), objectcreation, accessgranted, generateonclose.toString()) as Int) else 0

public actual fun NtOpenProcessToken(processhandle: HANDLE, desiredaccess: UInt, tokenhandle: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtOpenProcessToken(processhandle.toString(), desiredaccess.toInt(), tokenhandle.toString()) as Int) else 0

public actual fun NtOpenProcessTokenEx(processhandle: HANDLE, desiredaccess: UInt, handleattributes: UInt, tokenhandle: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtOpenProcessTokenEx(processhandle.toString(), desiredaccess.toInt(), handleattributes.toInt(), tokenhandle.toString()) as Int) else 0

public actual fun NtOpenSymbolicLinkObject(linkhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtOpenSymbolicLinkObject(linkhandle.toString(), desiredaccess.toInt(), objectattributes.toString()) as Int) else 0

public actual fun NtOpenThreadToken(threadhandle: HANDLE, desiredaccess: UInt, openasself: Boolean, tokenhandle: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtOpenThreadToken(threadhandle.toString(), desiredaccess.toInt(), openasself, tokenhandle.toString()) as Int) else 0

public actual fun NtOpenThreadTokenEx(threadhandle: HANDLE, desiredaccess: UInt, openasself: Boolean, handleattributes: UInt, tokenhandle: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtOpenThreadTokenEx(threadhandle.toString(), desiredaccess.toInt(), openasself, handleattributes.toInt(), tokenhandle.toString()) as Int) else 0

public actual fun NtPrivilegeCheck(clienttoken: HANDLE, requiredprivileges: Long, result: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtPrivilegeCheck(clienttoken.toString(), requiredprivileges.toString(), result.toString()) as Int) else 0

public actual fun NtPrivilegeObjectAuditAlarm(subsystemname: Long, handleid: Long, clienttoken: HANDLE, desiredaccess: UInt, privileges: Long, accessgranted: Boolean): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtPrivilegeObjectAuditAlarm(subsystemname.toString(), handleid.toString(), clienttoken.toString(), desiredaccess.toInt(), privileges.toString(), accessgranted) as Int) else 0

public actual fun NtPrivilegedServiceAuditAlarm(subsystemname: Long, servicename: Long, clienttoken: HANDLE, privileges: Long, accessgranted: Boolean): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtPrivilegedServiceAuditAlarm(subsystemname.toString(), servicename.toString(), clienttoken.toString(), privileges.toString(), accessgranted) as Int) else 0

public actual fun NtQueryDirectoryFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, returnsingleentry: Boolean, filename: Long, restartscan: Boolean): NTSTATUS =
    0

public actual fun NtQueryDirectoryFileEx(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, queryflags: UInt, filename: Long): NTSTATUS =
    0

public actual fun NtQueryDirectoryObject(directoryhandle: HANDLE, buffer: Long, length: UInt, returnsingleentry: Boolean, restartscan: Boolean, context: Long, returnlength: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtQueryDirectoryObject(directoryhandle.toString(), buffer.toString(), length.toInt(), returnsingleentry, restartscan, context.toString(), returnlength.toString()) as Int) else 0

public actual fun NtQueryEaFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt, returnsingleentry: Boolean, ealist: Long, ealistlength: UInt, eaindex: Long, restartscan: Boolean): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtQueryEaFile(filehandle.toString(), iostatusblock.toString(), buffer.toString(), length.toInt(), returnsingleentry, ealist.toString(), ealistlength.toInt(), eaindex.toString(), restartscan) as Int) else 0

public actual fun NtQueryFullAttributesFile(objectattributes: Long, fileinformation: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtQueryFullAttributesFile(objectattributes.toString(), fileinformation.toString()) as Int) else 0

public actual fun NtQueryInformationByName(objectattributes: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtQueryInformationByName(objectattributes.toString(), iostatusblock.toString(), fileinformation.toString(), length.toInt(), fileinformationclass) as Int) else 0

public actual fun NtQueryInformationFile(filehandle: HANDLE, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtQueryInformationFile(filehandle.toString(), iostatusblock.toString(), fileinformation.toString(), length.toInt(), fileinformationclass) as Int) else 0

public actual fun NtQueryInformationToken(tokenhandle: HANDLE, tokeninformationclass: TOKEN_INFORMATION_CLASS, tokeninformation: Long, tokeninformationlength: UInt, returnlength: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtQueryInformationToken(tokenhandle.toString(), tokeninformationclass, tokeninformation.toString(), tokeninformationlength.toInt(), returnlength.toString()) as Int) else 0

public actual fun NtQueryQuotaInformationFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt, returnsingleentry: Boolean, sidlist: Long, sidlistlength: UInt, startsid: PSID, restartscan: Boolean): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtQueryQuotaInformationFile(filehandle.toString(), iostatusblock.toString(), buffer.toString(), length.toInt(), returnsingleentry, sidlist.toString(), sidlistlength.toInt(), startsid.toString(), restartscan) as Int) else 0

public actual fun NtQuerySecurityObject(handle: HANDLE, securityinformation: UInt, securitydescriptor: PSECURITY_DESCRIPTOR, length: UInt, lengthneeded: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtQuerySecurityObject(handle.toString(), securityinformation.toInt(), securitydescriptor.toString(), length.toInt(), lengthneeded.toString()) as Int) else 0

public actual fun NtQuerySymbolicLinkObject(linkhandle: HANDLE, linktarget: Long, returnedlength: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtQuerySymbolicLinkObject(linkhandle.toString(), linktarget.toString(), returnedlength.toString()) as Int) else 0

public actual fun NtQueryVirtualMemory(processhandle: HANDLE, baseaddress: Long, memoryinformationclass: MEMORY_INFORMATION_CLASS, memoryinformation: Long, memoryinformationlength: ULong, returnlength: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtQueryVirtualMemory(processhandle.toString(), baseaddress.toString(), memoryinformationclass, memoryinformation.toString(), memoryinformationlength.toString(), returnlength.toString()) as Int) else 0

public actual fun NtQueryVolumeInformationFile(filehandle: HANDLE, iostatusblock: Long, fsinformation: Long, length: UInt, fsinformationclass: FS_INFORMATION_CLASS): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtQueryVolumeInformationFile(filehandle.toString(), iostatusblock.toString(), fsinformation.toString(), length.toInt(), fsinformationclass) as Int) else 0

public actual fun NtReadFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, buffer: Long, length: UInt, byteoffset: Long, key: Long): NTSTATUS =
    0

public actual fun NtSetEaFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtSetEaFile(filehandle.toString(), iostatusblock.toString(), buffer.toString(), length.toInt()) as Int) else 0

public actual fun NtSetEvent(eventhandle: HANDLE, previousstate: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtSetEvent(eventhandle.toString(), previousstate.toString()) as Int) else 0

public actual fun NtSetInformationFile(filehandle: HANDLE, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtSetInformationFile(filehandle.toString(), iostatusblock.toString(), fileinformation.toString(), length.toInt(), fileinformationclass) as Int) else 0

public actual fun NtSetInformationToken(tokenhandle: HANDLE, tokeninformationclass: TOKEN_INFORMATION_CLASS, tokeninformation: Long, tokeninformationlength: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtSetInformationToken(tokenhandle.toString(), tokeninformationclass, tokeninformation.toString(), tokeninformationlength.toInt()) as Int) else 0

public actual fun NtSetInformationVirtualMemory(processhandle: HANDLE, vminformationclass: VIRTUAL_MEMORY_INFORMATION_CLASS, numberofentries: ULong, virtualaddresses: Long, vminformation: Long, vminformationlength: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtSetInformationVirtualMemory(processhandle.toString(), vminformationclass, numberofentries.toString(), virtualaddresses.toString(), vminformation.toString(), vminformationlength.toInt()) as Int) else 0

public actual fun NtSetQuotaInformationFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtSetQuotaInformationFile(filehandle.toString(), iostatusblock.toString(), buffer.toString(), length.toInt()) as Int) else 0

public actual fun NtSetSecurityObject(handle: HANDLE, securityinformation: UInt, securitydescriptor: PSECURITY_DESCRIPTOR): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtSetSecurityObject(handle.toString(), securityinformation.toInt(), securitydescriptor.toString()) as Int) else 0

public actual fun NtSetVolumeInformationFile(filehandle: HANDLE, iostatusblock: Long, fsinformation: Long, length: UInt, fsinformationclass: FS_INFORMATION_CLASS): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtSetVolumeInformationFile(filehandle.toString(), iostatusblock.toString(), fsinformation.toString(), length.toInt(), fsinformationclass) as Int) else 0

public actual fun NtUnlockFile(filehandle: HANDLE, iostatusblock: Long, byteoffset: Long, length: Long, key: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_NtUnlockFile(filehandle.toString(), iostatusblock.toString(), byteoffset.toString(), length.toString(), key.toInt()) as Int) else 0

public actual fun NtWriteFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, buffer: Long, length: UInt, byteoffset: Long, key: Long): NTSTATUS =
    0

public actual fun ObInsertObject(obj: Long, passedaccessstate: Long, desiredaccess: UInt, objectpointerbias: UInt, newobject: Long, handle: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ObInsertObject(obj.toString(), passedaccessstate.toString(), desiredaccess.toInt(), objectpointerbias.toInt(), newobject.toString(), handle.toString()) as Int) else 0

public actual fun ObIsKernelHandle(handle: HANDLE): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ObIsKernelHandle(handle.toString()) as Boolean) else false

public actual fun ObMakeTemporaryObject(obj: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ObMakeTemporaryObject(obj.toString())
    }
}

public actual fun ObOpenObjectByPointer(obj: Long, handleattributes: UInt, passedaccessstate: Long, desiredaccess: UInt, objecttype: POBJECT_TYPE, accessmode: Byte, handle: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ObOpenObjectByPointer(obj.toString(), handleattributes.toInt(), passedaccessstate.toString(), desiredaccess.toInt(), objecttype.toString(), accessmode.toInt(), handle.toString()) as Int) else 0

public actual fun ObOpenObjectByPointerWithTag(obj: Long, handleattributes: UInt, passedaccessstate: Long, desiredaccess: UInt, objecttype: POBJECT_TYPE, accessmode: Byte, tag: UInt, handle: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ObOpenObjectByPointerWithTag(obj.toString(), handleattributes.toInt(), passedaccessstate.toString(), desiredaccess.toInt(), objecttype.toString(), accessmode.toInt(), tag.toInt(), handle.toString()) as Int) else 0

public actual fun ObQueryNameString(obj: Long, objectnameinfo: Long, length: UInt, returnlength: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ObQueryNameString(obj.toString(), objectnameinfo.toString(), length.toInt(), returnlength.toString()) as Int) else 0

public actual fun ObQueryObjectAuditingByHandle(handle: HANDLE, generateonclose: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ObQueryObjectAuditingByHandle(handle.toString(), generateonclose.toString()) as Int) else 0

public actual fun PfxFindPrefix(prefixtable: Long, fullname: Long): Long =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_PfxFindPrefix(prefixtable.toString(), fullname.toString()) as String).toLong() else 0L

public actual fun PfxInitialize(prefixtable: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_PfxInitialize(prefixtable.toString())
    }
}

public actual fun PfxInsertPrefix(prefixtable: Long, prefix: Long, prefixtableentry: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_PfxInsertPrefix(prefixtable.toString(), prefix.toString(), prefixtableentry.toString()) as Boolean) else false

public actual fun PfxRemovePrefix(prefixtable: Long, prefixtableentry: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_PfxRemovePrefix(prefixtable.toString(), prefixtableentry.toString())
    }
}

public actual fun PoQueueShutdownWorkItem(workitem: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_PoQueueShutdownWorkItem(workitem.toString()) as Int) else 0

public actual fun PsAssignImpersonationToken(thread: PETHREAD, token: HANDLE): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_PsAssignImpersonationToken(thread.toString(), token.toString()) as Int) else 0

public actual fun PsChargePoolQuota(process: PEPROCESS, pooltype: POOL_TYPE, amount: ULong) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_PsChargePoolQuota(process.toString(), pooltype, amount.toString())
    }
}

public actual fun PsChargeProcessPoolQuota(process: PEPROCESS, pooltype: POOL_TYPE, amount: ULong): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_PsChargeProcessPoolQuota(process.toString(), pooltype, amount.toString()) as Int) else 0

public actual fun PsDereferenceImpersonationToken(impersonationtoken: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_PsDereferenceImpersonationToken(impersonationtoken.toString())
    }
}

public actual fun PsDereferencePrimaryToken(primarytoken: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_PsDereferencePrimaryToken(primarytoken.toString())
    }
}

public actual fun PsDisableImpersonation(thread: PETHREAD, impersonationstate: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_PsDisableImpersonation(thread.toString(), impersonationstate.toString()) as Boolean) else false

public actual fun PsGetProcessExitTime(): Long =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_PsGetProcessExitTime() as String).toLong() else 0L

public actual fun PsGetThreadProcess(thread: PETHREAD): PEPROCESS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_PsGetThreadProcess(thread.toString()) as String).toLong() else 0L

public actual fun PsImpersonateClient(thread: PETHREAD, token: Long, copyonopen: Boolean, effectiveonly: Boolean, impersonationlevel: SECURITY_IMPERSONATION_LEVEL): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_PsImpersonateClient(thread.toString(), token.toString(), copyonopen, effectiveonly, impersonationlevel) as Int) else 0

public actual fun PsIsDiskCountersEnabled(): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_PsIsDiskCountersEnabled() as Boolean) else false

public actual fun PsIsSystemThread(thread: PETHREAD): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_PsIsSystemThread(thread.toString()) as Boolean) else false

public actual fun PsIsThreadTerminating(thread: PETHREAD): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_PsIsThreadTerminating(thread.toString()) as Boolean) else false

public actual fun PsLookupProcessByProcessId(processid: HANDLE, process: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_PsLookupProcessByProcessId(processid.toString(), process.toString()) as Int) else 0

public actual fun PsLookupThreadByThreadId(threadid: HANDLE, thread: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_PsLookupThreadByThreadId(threadid.toString(), thread.toString()) as Int) else 0

public actual fun PsReferenceImpersonationToken(thread: PETHREAD, copyonopen: Long, effectiveonly: Long, impersonationlevel: Long): Long =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_PsReferenceImpersonationToken(thread.toString(), copyonopen.toString(), effectiveonly.toString(), impersonationlevel.toString()) as String).toLong() else 0L

public actual fun PsReferencePrimaryToken(process: PEPROCESS): Long =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_PsReferencePrimaryToken(process.toString()) as String).toLong() else 0L

public actual fun PsRestoreImpersonation(thread: PETHREAD, impersonationstate: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_PsRestoreImpersonation(thread.toString(), impersonationstate.toString())
    }
}

public actual fun PsReturnPoolQuota(process: PEPROCESS, pooltype: POOL_TYPE, amount: ULong) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_PsReturnPoolQuota(process.toString(), pooltype, amount.toString())
    }
}

public actual fun PsRevertToSelf() {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_PsRevertToSelf()
    }
}

public actual fun PsUpdateDiskCounters(process: PEPROCESS, bytesread: ULong, byteswritten: ULong, readoperationcount: UInt, writeoperationcount: UInt, flushoperationcount: UInt) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_PsUpdateDiskCounters(process.toString(), bytesread.toString(), byteswritten.toString(), readoperationcount.toInt(), writeoperationcount.toInt(), flushoperationcount.toInt())
    }
}

public actual fun QuerySecurityContextToken(phcontext: Long, token: Long): HRESULT =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_QuerySecurityContextToken(phcontext.toString(), token.toString()) as Int) else 0

public actual fun RtlAbsoluteToSelfRelativeSD(absolutesecuritydescriptor: PSECURITY_DESCRIPTOR, selfrelativesecuritydescriptor: PSECURITY_DESCRIPTOR, bufferlength: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlAbsoluteToSelfRelativeSD(absolutesecuritydescriptor.toString(), selfrelativesecuritydescriptor.toString(), bufferlength.toString()) as Int) else 0

public actual fun RtlAddAccessAllowedAce(acl: Long, acerevision: UInt, accessmask: UInt, sid: PSID): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlAddAccessAllowedAce(acl.toString(), acerevision.toInt(), accessmask.toInt(), sid.toString()) as Int) else 0

public actual fun RtlAddAccessAllowedAceEx(acl: Long, acerevision: UInt, aceflags: UInt, accessmask: UInt, sid: PSID): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlAddAccessAllowedAceEx(acl.toString(), acerevision.toInt(), aceflags.toInt(), accessmask.toInt(), sid.toString()) as Int) else 0

public actual fun RtlAddAce(acl: Long, acerevision: UInt, startingaceindex: UInt, acelist: Long, acelistlength: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlAddAce(acl.toString(), acerevision.toInt(), startingaceindex.toInt(), acelist.toString(), acelistlength.toInt()) as Int) else 0

public actual fun RtlAllocateAndInitializeSid(identifierauthority: Long, subauthoritycount: UByte, subauthority0: UInt, subauthority1: UInt, subauthority2: UInt, subauthority3: UInt, subauthority4: UInt, subauthority5: UInt, subauthority6: UInt, subauthority7: UInt, sid: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlAllocateAndInitializeSid(identifierauthority.toString(), subauthoritycount.toInt(), subauthority0.toInt(), subauthority1.toInt(), subauthority2.toInt(), subauthority3.toInt(), subauthority4.toInt(), subauthority5.toInt(), subauthority6.toInt(), subauthority7.toInt(), sid.toString()) as Int) else 0

public actual fun RtlAllocateAndInitializeSidEx(identifierauthority: Long, subauthoritycount: UByte, subauthorities: Long, sid: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlAllocateAndInitializeSidEx(identifierauthority.toString(), subauthoritycount.toInt(), subauthorities.toString(), sid.toString()) as Int) else 0

public actual fun RtlAllocateHeap(heaphandle: Long, flags: UInt, size: ULong): Long =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlAllocateHeap(heaphandle.toString(), flags.toInt(), size.toString()) as String).toLong() else 0L

public actual fun RtlAppendStringToString(destination: Long, source: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlAppendStringToString(destination.toString(), source.toString()) as Int) else 0

public actual fun RtlCompareAltitudes(altitude1: Long, altitude2: Long): Int =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlCompareAltitudes(altitude1.toString(), altitude2.toString()) as Int) else 0

public actual fun RtlCompareMemoryUlong(source: Long, length: ULong, pattern: UInt): ULong =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlCompareMemoryUlong(source.toString(), length.toString(), pattern.toInt()) as String).toULong() else 0uL

public actual fun RtlCompressBuffer(compressionformatandengine: UShort, uncompressedbuffer: Long, uncompressedbuffersize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, uncompressedchunksize: UInt, finalcompressedsize: Long, workspace: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlCompressBuffer(compressionformatandengine.toInt(), uncompressedbuffer.toString(), uncompressedbuffersize.toInt(), compressedbuffer.toString(), compressedbuffersize.toInt(), uncompressedchunksize.toInt(), finalcompressedsize.toString(), workspace.toString()) as Int) else 0

public actual fun RtlCompressChunks(uncompressedbuffer: Long, uncompressedbuffersize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, compresseddatainfo: Long, compresseddatainfolength: UInt, workspace: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlCompressChunks(uncompressedbuffer.toString(), uncompressedbuffersize.toInt(), compressedbuffer.toString(), compressedbuffersize.toInt(), compresseddatainfo.toString(), compresseddatainfolength.toInt(), workspace.toString()) as Int) else 0

public actual fun RtlCopyLuid(destinationluid: Long, sourceluid: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlCopyLuid(destinationluid.toString(), sourceluid.toString())
    }
}

public actual fun RtlCopySid(destinationsidlength: UInt, destinationsid: PSID, sourcesid: PSID): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlCopySid(destinationsidlength.toInt(), destinationsid.toString(), sourcesid.toString()) as Int) else 0

public actual fun RtlCreateAcl(acl: Long, acllength: UInt, aclrevision: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlCreateAcl(acl.toString(), acllength.toInt(), aclrevision.toInt()) as Int) else 0

public actual fun RtlCreateHeap(flags: UInt, heapbase: Long, reservesize: ULong, commitsize: ULong, lock: Long, parameters: Long): Long =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlCreateHeap(flags.toInt(), heapbase.toString(), reservesize.toString(), commitsize.toString(), lock.toString(), parameters.toString()) as String).toLong() else 0L

public actual fun RtlCreateServiceSid(servicename: Long, servicesid: PSID, servicesidlength: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlCreateServiceSid(servicename.toString(), servicesid.toString(), servicesidlength.toString()) as Int) else 0

public actual fun RtlCreateSystemVolumeInformationFolder(volumerootpath: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlCreateSystemVolumeInformationFolder(volumerootpath.toString()) as Int) else 0

public actual fun RtlCreateUnicodeString(destinationstring: Long, sourcestring: PCWSTR): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlCreateUnicodeString(destinationstring.toString(), sourcestring.toString()) as Boolean) else false

public actual fun RtlCreateVirtualAccountSid(name: Long, basesubauthority: UInt, sid: PSID, sidlength: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlCreateVirtualAccountSid(name.toString(), basesubauthority.toInt(), sid.toString(), sidlength.toString()) as Int) else 0

public actual fun RtlCustomCPToUnicodeN(customcp: Long, unicodestring: PWSTR, maxbytesinunicodestring: UInt, bytesinunicodestring: Long, customcpstring: PCSTR, bytesincustomcpstring: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlCustomCPToUnicodeN(customcp.toString(), unicodestring.toString(), maxbytesinunicodestring.toInt(), bytesinunicodestring.toString(), customcpstring.toString(), bytesincustomcpstring.toInt()) as Int) else 0

public actual fun RtlDecompressBuffer(compressionformat: UShort, uncompressedbuffer: Long, uncompressedbuffersize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, finaluncompressedsize: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlDecompressBuffer(compressionformat.toInt(), uncompressedbuffer.toString(), uncompressedbuffersize.toInt(), compressedbuffer.toString(), compressedbuffersize.toInt(), finaluncompressedsize.toString()) as Int) else 0

public actual fun RtlDecompressBufferEx(compressionformat: UShort, uncompressedbuffer: Long, uncompressedbuffersize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, finaluncompressedsize: Long, workspace: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlDecompressBufferEx(compressionformat.toInt(), uncompressedbuffer.toString(), uncompressedbuffersize.toInt(), compressedbuffer.toString(), compressedbuffersize.toInt(), finaluncompressedsize.toString(), workspace.toString()) as Int) else 0

public actual fun RtlDecompressBufferEx2(compressionformat: UShort, uncompressedbuffer: Long, uncompressedbuffersize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, uncompressedchunksize: UInt, finaluncompressedsize: Long, workspace: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlDecompressBufferEx2(compressionformat.toInt(), uncompressedbuffer.toString(), uncompressedbuffersize.toInt(), compressedbuffer.toString(), compressedbuffersize.toInt(), uncompressedchunksize.toInt(), finaluncompressedsize.toString(), workspace.toString()) as Int) else 0

public actual fun RtlDecompressChunks(uncompressedbuffer: Long, uncompressedbuffersize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, compressedtail: Long, compressedtailsize: UInt, compresseddatainfo: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlDecompressChunks(uncompressedbuffer.toString(), uncompressedbuffersize.toInt(), compressedbuffer.toString(), compressedbuffersize.toInt(), compressedtail.toString(), compressedtailsize.toInt(), compresseddatainfo.toString()) as Int) else 0

public actual fun RtlDecompressFragment(compressionformat: UShort, uncompressedfragment: Long, uncompressedfragmentsize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, fragmentoffset: UInt, finaluncompressedsize: Long, workspace: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlDecompressFragment(compressionformat.toInt(), uncompressedfragment.toString(), uncompressedfragmentsize.toInt(), compressedbuffer.toString(), compressedbuffersize.toInt(), fragmentoffset.toInt(), finaluncompressedsize.toString(), workspace.toString()) as Int) else 0

public actual fun RtlDecompressFragmentEx(compressionformat: UShort, uncompressedfragment: Long, uncompressedfragmentsize: UInt, compressedbuffer: Long, compressedbuffersize: UInt, fragmentoffset: UInt, uncompressedchunksize: UInt, finaluncompressedsize: Long, workspace: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlDecompressFragmentEx(compressionformat.toInt(), uncompressedfragment.toString(), uncompressedfragmentsize.toInt(), compressedbuffer.toString(), compressedbuffersize.toInt(), fragmentoffset.toInt(), uncompressedchunksize.toInt(), finaluncompressedsize.toString(), workspace.toString()) as Int) else 0

public actual fun RtlDeleteAce(acl: Long, aceindex: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlDeleteAce(acl.toString(), aceindex.toInt()) as Int) else 0

public actual fun RtlDescribeChunk(compressionformat: UShort, compressedbuffer: Long, endofcompressedbufferplus1: Long, chunkbuffer: Long, chunksize: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlDescribeChunk(compressionformat.toInt(), compressedbuffer.toString(), endofcompressedbufferplus1.toString(), chunkbuffer.toString(), chunksize.toString()) as Int) else 0

public actual fun RtlDestroyHeap(heaphandle: Long): Long =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlDestroyHeap(heaphandle.toString()) as String).toLong() else 0L

public actual fun RtlDosPathNameToNtPathName_U_WithStatus(dosfilename: PCWSTR, ntfilename: Long, filepart: Long, reserved: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlDosPathNameToNtPathName_U_WithStatus(dosfilename.toString(), ntfilename.toString(), filepart.toString(), reserved.toString()) as Int) else 0

public actual fun RtlDowncaseUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlDowncaseUnicodeString(destinationstring.toString(), sourcestring.toString(), allocatedestinationstring) as Int) else 0

public actual fun RtlDuplicateUnicodeString(flags: UInt, stringin: Long, stringout: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlDuplicateUnicodeString(flags.toInt(), stringin.toString(), stringout.toString()) as Int) else 0

public actual fun RtlEqualPrefixSid(sid1: PSID, sid2: PSID): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlEqualPrefixSid(sid1.toString(), sid2.toString()) as Boolean) else false

public actual fun RtlEqualSid(sid1: PSID, sid2: PSID): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlEqualSid(sid1.toString(), sid2.toString()) as Boolean) else false

public actual fun RtlFindUnicodePrefix(prefixtable: Long, fullname: Long, caseinsensitiveindex: UInt): Long =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlFindUnicodePrefix(prefixtable.toString(), fullname.toString(), caseinsensitiveindex.toInt()) as String).toLong() else 0L

public actual fun RtlFreeHeap(heaphandle: Long, flags: UInt, baseaddress: Long): UInt =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlFreeHeap(heaphandle.toString(), flags.toInt(), baseaddress.toString()) as Int).toUInt() else 0u

public actual fun RtlFreeSid(sid: PSID): Long =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlFreeSid(sid.toString()) as String).toLong() else 0L

public actual fun RtlGenerate8dot3Name(name: Long, allowextendedcharacters: Boolean, context: Long, name8dot3: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlGenerate8dot3Name(name.toString(), allowextendedcharacters, context.toString(), name8dot3.toString()) as Int) else 0

public actual fun RtlGetAce(acl: Long, aceindex: UInt, ace: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlGetAce(acl.toString(), aceindex.toInt(), ace.toString()) as Int) else 0

public actual fun RtlGetCompressionWorkSpaceSize(compressionformatandengine: UShort, compressbufferworkspacesize: Long, compressfragmentworkspacesize: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlGetCompressionWorkSpaceSize(compressionformatandengine.toInt(), compressbufferworkspacesize.toString(), compressfragmentworkspacesize.toString()) as Int) else 0

public actual fun RtlGetDaclSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, daclpresent: Long, dacl: Long, dacldefaulted: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlGetDaclSecurityDescriptor(securitydescriptor.toString(), daclpresent.toString(), dacl.toString(), dacldefaulted.toString()) as Int) else 0

public actual fun RtlGetGroupSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, group: Long, groupdefaulted: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlGetGroupSecurityDescriptor(securitydescriptor.toString(), group.toString(), groupdefaulted.toString()) as Int) else 0

public actual fun RtlGetOwnerSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, owner: Long, ownerdefaulted: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlGetOwnerSecurityDescriptor(securitydescriptor.toString(), owner.toString(), ownerdefaulted.toString()) as Int) else 0

public actual fun RtlGetSaclSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, saclpresent: Long, sacl: Long, sacldefaulted: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlGetSaclSecurityDescriptor(securitydescriptor.toString(), saclpresent.toString(), sacl.toString(), sacldefaulted.toString()) as Int) else 0

public actual fun RtlIdentifierAuthoritySid(sid: PSID): Long =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlIdentifierAuthoritySid(sid.toString()) as String).toLong() else 0L

public actual fun RtlIdnToAscii(flags: UInt, sourcestring: PCWSTR, sourcestringlength: Int, destinationstring: PWSTR, destinationstringlength: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlIdnToAscii(flags.toInt(), sourcestring.toString(), sourcestringlength, destinationstring.toString(), destinationstringlength.toString()) as Int) else 0

public actual fun RtlIdnToNameprepUnicode(flags: UInt, sourcestring: PCWSTR, sourcestringlength: Int, destinationstring: PWSTR, destinationstringlength: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlIdnToNameprepUnicode(flags.toInt(), sourcestring.toString(), sourcestringlength, destinationstring.toString(), destinationstringlength.toString()) as Int) else 0

public actual fun RtlIdnToUnicode(flags: UInt, sourcestring: PCWSTR, sourcestringlength: Int, destinationstring: PWSTR, destinationstringlength: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlIdnToUnicode(flags.toInt(), sourcestring.toString(), sourcestringlength, destinationstring.toString(), destinationstringlength.toString()) as Int) else 0

public actual fun RtlInitCodePageTable(tablebase: Long, codepagetable: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlInitCodePageTable(tablebase.toString(), codepagetable.toString())
    }
}

public actual fun RtlInitUnicodeStringEx(destinationstring: Long, sourcestring: PCWSTR): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlInitUnicodeStringEx(destinationstring.toString(), sourcestring.toString()) as Int) else 0

public actual fun RtlInitializeSid(sid: PSID, identifierauthority: Long, subauthoritycount: UByte): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlInitializeSid(sid.toString(), identifierauthority.toString(), subauthoritycount.toInt()) as Int) else 0

public actual fun RtlInitializeSidEx(sid: PSID, identifierauthority: Long, subauthoritycount: UByte): NTSTATUS =
    0

public actual fun RtlInitializeUnicodePrefix(prefixtable: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlInitializeUnicodePrefix(prefixtable.toString())
    }
}

public actual fun RtlInsertUnicodePrefix(prefixtable: Long, prefix: Long, prefixtableentry: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlInsertUnicodePrefix(prefixtable.toString(), prefix.toString(), prefixtableentry.toString()) as Boolean) else false

public actual fun RtlIsCloudFilesPlaceholder(fileattributes: UInt, reparsetag: UInt): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlIsCloudFilesPlaceholder(fileattributes.toInt(), reparsetag.toInt()) as Boolean) else false

public actual fun RtlIsDosDeviceName_U(dosfilename: PCWSTR): UInt =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlIsDosDeviceName_U(dosfilename.toString()) as Int).toUInt() else 0u

public actual fun RtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag: UInt): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlIsNonEmptyDirectoryReparsePointAllowed(reparsetag.toInt()) as Boolean) else false

public actual fun RtlIsNormalizedString(normform: UInt, sourcestring: PCWSTR, sourcestringlength: Int, normalized: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlIsNormalizedString(normform.toInt(), sourcestring.toString(), sourcestringlength, normalized.toString()) as Int) else 0

public actual fun RtlIsPartialPlaceholder(fileattributes: UInt, reparsetag: UInt): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlIsPartialPlaceholder(fileattributes.toInt(), reparsetag.toInt()) as Boolean) else false

public actual fun RtlIsPartialPlaceholderFileHandle(filehandle: HANDLE, ispartialplaceholder: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlIsPartialPlaceholderFileHandle(filehandle.toString(), ispartialplaceholder.toString()) as Int) else 0

public actual fun RtlIsPartialPlaceholderFileInfo(infobuffer: Long, infoclass: FILE_INFORMATION_CLASS, ispartialplaceholder: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlIsPartialPlaceholderFileInfo(infobuffer.toString(), infoclass, ispartialplaceholder.toString()) as Int) else 0

public actual fun RtlIsSandboxedToken(context: Long, previousmode: Byte): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlIsSandboxedToken(context.toString(), previousmode.toInt()) as Boolean) else false

public actual fun RtlIsValidOemCharacter(char: PWSTR): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlIsValidOemCharacter(char.toString()) as Boolean) else false

public actual fun RtlLengthRequiredSid(subauthoritycount: UInt): UInt =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlLengthRequiredSid(subauthoritycount.toInt()) as Int).toUInt() else 0u

public actual fun RtlLengthSid(sid: PSID): UInt =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlLengthSid(sid.toString()) as Int).toUInt() else 0u

public actual fun RtlMultiByteToUnicodeN(unicodestring: PWSTR, maxbytesinunicodestring: UInt, bytesinunicodestring: Long, multibytestring: PCSTR, bytesinmultibytestring: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlMultiByteToUnicodeN(unicodestring.toString(), maxbytesinunicodestring.toInt(), bytesinunicodestring.toString(), multibytestring.toString(), bytesinmultibytestring.toInt()) as Int) else 0

public actual fun RtlMultiByteToUnicodeSize(bytesinunicodestring: Long, multibytestring: PCSTR, bytesinmultibytestring: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlMultiByteToUnicodeSize(bytesinunicodestring.toString(), multibytestring.toString(), bytesinmultibytestring.toInt()) as Int) else 0

public actual fun RtlNextUnicodePrefix(prefixtable: Long, restart: Boolean): Long =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlNextUnicodePrefix(prefixtable.toString(), restart) as String).toLong() else 0L

public actual fun RtlNormalizeString(normform: UInt, sourcestring: PCWSTR, sourcestringlength: Int, destinationstring: PWSTR, destinationstringlength: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlNormalizeString(normform.toInt(), sourcestring.toString(), sourcestringlength, destinationstring.toString(), destinationstringlength.toString()) as Int) else 0

public actual fun RtlNtStatusToDosErrorNoTeb(status: NTSTATUS): UInt =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlNtStatusToDosErrorNoTeb(status) as Int).toUInt() else 0u

public actual fun RtlOemStringToCountedUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlOemStringToCountedUnicodeString(destinationstring.toString(), sourcestring.toString(), allocatedestinationstring) as Int) else 0

public actual fun RtlOemStringToUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlOemStringToUnicodeString(destinationstring.toString(), sourcestring.toString(), allocatedestinationstring) as Int) else 0

public actual fun RtlOemToUnicodeN(unicodestring: PWSTR, maxbytesinunicodestring: UInt, bytesinunicodestring: Long, oemstring: PCSTR, bytesinoemstring: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlOemToUnicodeN(unicodestring.toString(), maxbytesinunicodestring.toInt(), bytesinunicodestring.toString(), oemstring.toString(), bytesinoemstring.toInt()) as Int) else 0

public actual fun RtlPrefixString(string1: Long, string2: Long, caseinsensitive: Boolean): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlPrefixString(string1.toString(), string2.toString(), caseinsensitive) as Boolean) else false

public actual fun RtlQueryPackageIdentity(tokenobject: Long, packagefullname: PWSTR, packagesize: Long, appid: PWSTR, appidsize: Long, packaged: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlQueryPackageIdentity(tokenobject.toString(), packagefullname.toString(), packagesize.toString(), appid.toString(), appidsize.toString(), packaged.toString()) as Int) else 0

public actual fun RtlQueryPackageIdentityEx(tokenobject: Long, packagefullname: PWSTR, packagesize: Long, appid: PWSTR, appidsize: Long, dynamicid: Long, flags: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlQueryPackageIdentityEx(tokenobject.toString(), packagefullname.toString(), packagesize.toString(), appid.toString(), appidsize.toString(), dynamicid.toString(), flags.toString()) as Int) else 0

public actual fun RtlQueryProcessPlaceholderCompatibilityMode(): Byte =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlQueryProcessPlaceholderCompatibilityMode() as Int).toByte() else 0

public actual fun RtlQueryThreadPlaceholderCompatibilityMode(): Byte =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlQueryThreadPlaceholderCompatibilityMode() as Int).toByte() else 0

public actual fun RtlRandom(seed: Long): UInt =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlRandom(seed.toString()) as Int).toUInt() else 0u

public actual fun RtlRandomEx(seed: Long): UInt =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlRandomEx(seed.toString()) as Int).toUInt() else 0u

public actual fun RtlRemoveUnicodePrefix(prefixtable: Long, prefixtableentry: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlRemoveUnicodePrefix(prefixtable.toString(), prefixtableentry.toString())
    }
}

public actual fun RtlReplaceSidInSd(securitydescriptor: PSECURITY_DESCRIPTOR, oldsid: PSID, newsid: PSID, numchanges: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlReplaceSidInSd(securitydescriptor.toString(), oldsid.toString(), newsid.toString(), numchanges.toString()) as Int) else 0

public actual fun RtlReserveChunk(compressionformat: UShort, compressedbuffer: Long, endofcompressedbufferplus1: Long, chunkbuffer: Long, chunksize: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlReserveChunk(compressionformat.toInt(), compressedbuffer.toString(), endofcompressedbufferplus1.toString(), chunkbuffer.toString(), chunksize.toInt()) as Int) else 0

public actual fun RtlSecondsSince1970ToTime(elapsedseconds: UInt, time: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlSecondsSince1970ToTime(elapsedseconds.toInt(), time.toString())
    }
}

public actual fun RtlSecondsSince1980ToTime(elapsedseconds: UInt, time: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlSecondsSince1980ToTime(elapsedseconds.toInt(), time.toString())
    }
}

public actual fun RtlSelfRelativeToAbsoluteSD(selfrelativesecuritydescriptor: PSECURITY_DESCRIPTOR, absolutesecuritydescriptor: PSECURITY_DESCRIPTOR, absolutesecuritydescriptorsize: Long, dacl: Long, daclsize: Long, sacl: Long, saclsize: Long, owner: PSID, ownersize: Long, primarygroup: PSID, primarygroupsize: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlSelfRelativeToAbsoluteSD(selfrelativesecuritydescriptor.toString(), absolutesecuritydescriptor.toString(), absolutesecuritydescriptorsize.toString(), dacl.toString(), daclsize.toString(), sacl.toString(), saclsize.toString(), owner.toString(), ownersize.toString(), primarygroup.toString(), primarygroupsize.toString()) as Int) else 0

public actual fun RtlSetGroupSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, group: PSID, groupdefaulted: Boolean): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlSetGroupSecurityDescriptor(securitydescriptor.toString(), group.toString(), groupdefaulted) as Int) else 0

public actual fun RtlSetOwnerSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, owner: PSID, ownerdefaulted: Boolean): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlSetOwnerSecurityDescriptor(securitydescriptor.toString(), owner.toString(), ownerdefaulted) as Int) else 0

public actual fun RtlSetProcessPlaceholderCompatibilityMode(mode: Byte): Byte =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlSetProcessPlaceholderCompatibilityMode(mode.toInt()) as Int).toByte() else 0

public actual fun RtlSetThreadPlaceholderCompatibilityMode(mode: Byte): Byte =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlSetThreadPlaceholderCompatibilityMode(mode.toInt()) as Int).toByte() else 0

public actual fun RtlSubAuthorityCountSid(sid: PSID): Long =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlSubAuthorityCountSid(sid.toString()) as String).toLong() else 0L

public actual fun RtlSubAuthoritySid(sid: PSID, subauthority: UInt): Long =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlSubAuthoritySid(sid.toString(), subauthority.toInt()) as String).toLong() else 0L

public actual fun RtlTimeToSecondsSince1980(time: Long, elapsedseconds: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlTimeToSecondsSince1980(time.toString(), elapsedseconds.toString()) as Boolean) else false

public actual fun RtlUnicodeStringToCountedOemString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlUnicodeStringToCountedOemString(destinationstring.toString(), sourcestring.toString(), allocatedestinationstring) as Int) else 0

public actual fun RtlUnicodeToCustomCPN(customcp: Long, customcpstring: PSTR, maxbytesincustomcpstring: UInt, bytesincustomcpstring: Long, unicodestring: PCWSTR, bytesinunicodestring: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlUnicodeToCustomCPN(customcp.toString(), customcpstring.toString(), maxbytesincustomcpstring.toInt(), bytesincustomcpstring.toString(), unicodestring.toString(), bytesinunicodestring.toInt()) as Int) else 0

public actual fun RtlUnicodeToMultiByteN(multibytestring: PSTR, maxbytesinmultibytestring: UInt, bytesinmultibytestring: Long, unicodestring: Long, bytesinunicodestring: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlUnicodeToMultiByteN(multibytestring.toString(), maxbytesinmultibytestring.toInt(), bytesinmultibytestring.toString(), unicodestring.toString(), bytesinunicodestring.toInt()) as Int) else 0

public actual fun RtlUnicodeToOemN(oemstring: PSTR, maxbytesinoemstring: UInt, bytesinoemstring: Long, unicodestring: Long, bytesinunicodestring: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlUnicodeToOemN(oemstring.toString(), maxbytesinoemstring.toInt(), bytesinoemstring.toString(), unicodestring.toString(), bytesinunicodestring.toInt()) as Int) else 0

public actual fun RtlUpcaseUnicodeStringToCountedOemString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlUpcaseUnicodeStringToCountedOemString(destinationstring.toString(), sourcestring.toString(), allocatedestinationstring) as Int) else 0

public actual fun RtlUpcaseUnicodeStringToOemString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlUpcaseUnicodeStringToOemString(destinationstring.toString(), sourcestring.toString(), allocatedestinationstring) as Int) else 0

public actual fun RtlUpcaseUnicodeToCustomCPN(customcp: Long, customcpstring: PSTR, maxbytesincustomcpstring: UInt, bytesincustomcpstring: Long, unicodestring: PCWSTR, bytesinunicodestring: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlUpcaseUnicodeToCustomCPN(customcp.toString(), customcpstring.toString(), maxbytesincustomcpstring.toInt(), bytesincustomcpstring.toString(), unicodestring.toString(), bytesinunicodestring.toInt()) as Int) else 0

public actual fun RtlUpcaseUnicodeToMultiByteN(multibytestring: PSTR, maxbytesinmultibytestring: UInt, bytesinmultibytestring: Long, unicodestring: Long, bytesinunicodestring: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlUpcaseUnicodeToMultiByteN(multibytestring.toString(), maxbytesinmultibytestring.toInt(), bytesinmultibytestring.toString(), unicodestring.toString(), bytesinunicodestring.toInt()) as Int) else 0

public actual fun RtlUpcaseUnicodeToOemN(oemstring: PSTR, maxbytesinoemstring: UInt, bytesinoemstring: Long, unicodestring: Long, bytesinunicodestring: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlUpcaseUnicodeToOemN(oemstring.toString(), maxbytesinoemstring.toInt(), bytesinoemstring.toString(), unicodestring.toString(), bytesinunicodestring.toInt()) as Int) else 0

public actual fun RtlValidSid(sid: PSID): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlValidSid(sid.toString()) as Boolean) else false

public actual fun RtlValidateUnicodeString(flags: UInt, string: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlValidateUnicodeString(flags.toInt(), string.toString()) as Int) else 0

public actual fun RtlxOemStringToUnicodeSize(oemstring: Long): UInt =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlxOemStringToUnicodeSize(oemstring.toString()) as Int).toUInt() else 0u

public actual fun RtlxUnicodeStringToOemSize(unicodestring: Long): UInt =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_RtlxUnicodeStringToOemSize(unicodestring.toString()) as Int).toUInt() else 0u

public actual fun SeAccessCheckFromState(securitydescriptor: PSECURITY_DESCRIPTOR, primarytokeninformation: Long, clienttokeninformation: Long, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: Long, genericmapping: Long, accessmode: Byte, grantedaccess: Long, accessstatus: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeAccessCheckFromState(securitydescriptor.toString(), primarytokeninformation.toString(), clienttokeninformation.toString(), desiredaccess.toInt(), previouslygrantedaccess.toInt(), privileges.toString(), genericmapping.toString(), accessmode.toInt(), grantedaccess.toString(), accessstatus.toString()) as Boolean) else false

public actual fun SeAccessCheckFromStateEx(securitydescriptor: PSECURITY_DESCRIPTOR, primarytoken: Long, clienttoken: Long, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: Long, genericmapping: Long, accessmode: Byte, grantedaccess: Long, accessstatus: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeAccessCheckFromStateEx(securitydescriptor.toString(), primarytoken.toString(), clienttoken.toString(), desiredaccess.toInt(), previouslygrantedaccess.toInt(), privileges.toString(), genericmapping.toString(), accessmode.toInt(), grantedaccess.toString(), accessstatus.toString()) as Boolean) else false

public actual fun SeAdjustAccessStateForAccessConstraints(objecttype: Long, securitydescriptor: PSECURITY_DESCRIPTOR, accessstate: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeAdjustAccessStateForAccessConstraints(objecttype.toString(), securitydescriptor.toString(), accessstate.toString())
    }
}

public actual fun SeAdjustAccessStateForTrustLabel(objecttype: Long, securitydescriptor: PSECURITY_DESCRIPTOR, accessstate: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeAdjustAccessStateForTrustLabel(objecttype.toString(), securitydescriptor.toString(), accessstate.toString())
    }
}

public actual fun SeAdjustObjectSecurity(objectname: Long, originaldescriptor: PSECURITY_DESCRIPTOR, proposeddescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long, adjusteddescriptor: Long, applyadjusteddescriptor: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeAdjustObjectSecurity(objectname.toString(), originaldescriptor.toString(), proposeddescriptor.toString(), subjectsecuritycontext.toString(), adjusteddescriptor.toString(), applyadjusteddescriptor.toString()) as Int) else 0

public actual fun SeAppendPrivileges(accessstate: Long, privileges: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeAppendPrivileges(accessstate.toString(), privileges.toString()) as Int) else 0

public actual fun SeAuditFipsCryptoSelftests(bsuccess: Boolean, selftestcode: UInt) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeAuditFipsCryptoSelftests(bsuccess, selftestcode.toInt())
    }
}

public actual fun SeAuditHardLinkCreation(filename: Long, linkname: Long, bsuccess: Boolean) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeAuditHardLinkCreation(filename.toString(), linkname.toString(), bsuccess)
    }
}

public actual fun SeAuditHardLinkCreationWithTransaction(filename: Long, linkname: Long, bsuccess: Boolean, transactionid: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeAuditHardLinkCreationWithTransaction(filename.toString(), linkname.toString(), bsuccess, transactionid.toString())
    }
}

public actual fun SeAuditTransactionStateChange(transactionid: Long, resourcemanagerid: Long, newtransactionstate: UInt) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeAuditTransactionStateChange(transactionid.toString(), resourcemanagerid.toString(), newtransactionstate.toInt())
    }
}

public actual fun SeAuditingAnyFileEventsWithContext(securitydescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeAuditingAnyFileEventsWithContext(securitydescriptor.toString(), subjectsecuritycontext.toString()) as Boolean) else false

public actual fun SeAuditingAnyFileEventsWithContextEx(securitydescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long, stagingenabled: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeAuditingAnyFileEventsWithContextEx(securitydescriptor.toString(), subjectsecuritycontext.toString(), stagingenabled.toString()) as Boolean) else false

public actual fun SeAuditingFileEvents(accessgranted: Boolean, securitydescriptor: PSECURITY_DESCRIPTOR): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeAuditingFileEvents(accessgranted, securitydescriptor.toString()) as Boolean) else false

public actual fun SeAuditingFileEventsWithContext(accessgranted: Boolean, securitydescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeAuditingFileEventsWithContext(accessgranted, securitydescriptor.toString(), subjectsecuritycontext.toString()) as Boolean) else false

public actual fun SeAuditingFileEventsWithContextEx(accessgranted: Boolean, securitydescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long, stagingenabled: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeAuditingFileEventsWithContextEx(accessgranted, securitydescriptor.toString(), subjectsecuritycontext.toString(), stagingenabled.toString()) as Boolean) else false

public actual fun SeAuditingFileOrGlobalEvents(accessgranted: Boolean, securitydescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeAuditingFileOrGlobalEvents(accessgranted, securitydescriptor.toString(), subjectsecuritycontext.toString()) as Boolean) else false

public actual fun SeAuditingHardLinkEvents(accessgranted: Boolean, securitydescriptor: PSECURITY_DESCRIPTOR): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeAuditingHardLinkEvents(accessgranted, securitydescriptor.toString()) as Boolean) else false

public actual fun SeAuditingHardLinkEventsWithContext(accessgranted: Boolean, securitydescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeAuditingHardLinkEventsWithContext(accessgranted, securitydescriptor.toString(), subjectsecuritycontext.toString()) as Boolean) else false

public actual fun SeCaptureSubjectContextEx(thread: PETHREAD, process: PEPROCESS, subjectcontext: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeCaptureSubjectContextEx(thread.toString(), process.toString(), subjectcontext.toString())
    }
}

public actual fun SeCheckForCriticalAceRemoval(currentdescriptor: PSECURITY_DESCRIPTOR, newdescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long, aceremoved: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeCheckForCriticalAceRemoval(currentdescriptor.toString(), newdescriptor.toString(), subjectsecuritycontext.toString(), aceremoved.toString())
    }
}

public actual fun SeCreateClientSecurity(clientthread: PETHREAD, clientsecurityqos: Long, remotesession: Boolean, clientcontext: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeCreateClientSecurity(clientthread.toString(), clientsecurityqos.toString(), remotesession, clientcontext.toString()) as Int) else 0

public actual fun SeCreateClientSecurityFromSubjectContext(subjectcontext: Long, clientsecurityqos: Long, serverisremote: Boolean, clientcontext: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeCreateClientSecurityFromSubjectContext(subjectcontext.toString(), clientsecurityqos.toString(), serverisremote, clientcontext.toString()) as Int) else 0

public actual fun SeDeleteClientSecurity(clientcontext: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeDeleteClientSecurity(clientcontext.toString())
    }
}

public actual fun SeDeleteObjectAuditAlarm(obj: Long, handle: HANDLE) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeDeleteObjectAuditAlarm(obj.toString(), handle.toString())
    }
}

public actual fun SeDeleteObjectAuditAlarmWithTransaction(obj: Long, handle: HANDLE, transactionid: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeDeleteObjectAuditAlarmWithTransaction(obj.toString(), handle.toString(), transactionid.toString())
    }
}

public actual fun SeExamineSacl(sacl: Long, resourcesacl: Long, token: Long, desiredaccess: UInt, accessgranted: Boolean, generateaudit: Long, generatealarm: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeExamineSacl(sacl.toString(), resourcesacl.toString(), token.toString(), desiredaccess.toInt(), accessgranted, generateaudit.toString(), generatealarm.toString())
    }
}

public actual fun SeFilterToken(existingtoken: Long, flags: UInt, sidstodisable: Long, privilegestodelete: Long, restrictedsids: Long, filteredtoken: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeFilterToken(existingtoken.toString(), flags.toInt(), sidstodisable.toString(), privilegestodelete.toString(), restrictedsids.toString(), filteredtoken.toString()) as Int) else 0

public actual fun SeFreePrivileges(privileges: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeFreePrivileges(privileges.toString())
    }
}

public actual fun SeImpersonateClient(clientcontext: Long, serverthread: PETHREAD) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeImpersonateClient(clientcontext.toString(), serverthread.toString())
    }
}

public actual fun SeImpersonateClientEx(clientcontext: Long, serverthread: PETHREAD): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeImpersonateClientEx(clientcontext.toString(), serverthread.toString()) as Int) else 0

public actual fun SeLocateProcessImageName(process: PEPROCESS, pimagefilename: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeLocateProcessImageName(process.toString(), pimagefilename.toString()) as Int) else 0

public actual fun SeMarkLogonSessionForTerminationNotification(logonid: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeMarkLogonSessionForTerminationNotification(logonid.toString()) as Int) else 0

public actual fun SeMarkLogonSessionForTerminationNotificationEx(logonid: Long, pserversilo: PESILO): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeMarkLogonSessionForTerminationNotificationEx(logonid.toString(), pserversilo.toString()) as Int) else 0

public actual fun SeOpenObjectAuditAlarm(objecttypename: Long, obj: Long, absoluteobjectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, accessstate: Long, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, generateonclose: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeOpenObjectAuditAlarm(objecttypename.toString(), obj.toString(), absoluteobjectname.toString(), securitydescriptor.toString(), accessstate.toString(), objectcreated, accessgranted, accessmode.toInt(), generateonclose.toString())
    }
}

public actual fun SeOpenObjectAuditAlarmWithTransaction(objecttypename: Long, obj: Long, absoluteobjectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, accessstate: Long, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, transactionid: Long, generateonclose: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeOpenObjectAuditAlarmWithTransaction(objecttypename.toString(), obj.toString(), absoluteobjectname.toString(), securitydescriptor.toString(), accessstate.toString(), objectcreated, accessgranted, accessmode.toInt(), transactionid.toString(), generateonclose.toString())
    }
}

public actual fun SeOpenObjectForDeleteAuditAlarm(objecttypename: Long, obj: Long, absoluteobjectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, accessstate: Long, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, generateonclose: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeOpenObjectForDeleteAuditAlarm(objecttypename.toString(), obj.toString(), absoluteobjectname.toString(), securitydescriptor.toString(), accessstate.toString(), objectcreated, accessgranted, accessmode.toInt(), generateonclose.toString())
    }
}

public actual fun SeOpenObjectForDeleteAuditAlarmWithTransaction(objecttypename: Long, obj: Long, absoluteobjectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, accessstate: Long, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, transactionid: Long, generateonclose: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeOpenObjectForDeleteAuditAlarmWithTransaction(objecttypename.toString(), obj.toString(), absoluteobjectname.toString(), securitydescriptor.toString(), accessstate.toString(), objectcreated, accessgranted, accessmode.toInt(), transactionid.toString(), generateonclose.toString())
    }
}

public actual fun SePrivilegeCheck(requiredprivileges: Long, subjectsecuritycontext: Long, accessmode: Byte): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SePrivilegeCheck(requiredprivileges.toString(), subjectsecuritycontext.toString(), accessmode.toInt()) as Boolean) else false

public actual fun SeQueryAuthenticationIdToken(token: Long, authenticationid: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeQueryAuthenticationIdToken(token.toString(), authenticationid.toString()) as Int) else 0

public actual fun SeQueryInformationToken(token: Long, tokeninformationclass: TOKEN_INFORMATION_CLASS, tokeninformation: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeQueryInformationToken(token.toString(), tokeninformationclass, tokeninformation.toString()) as Int) else 0

public actual fun SeQuerySecurityDescriptorInfo(securityinformation: Long, securitydescriptor: PSECURITY_DESCRIPTOR, length: Long, objectssecuritydescriptor: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeQuerySecurityDescriptorInfo(securityinformation.toString(), securitydescriptor.toString(), length.toString(), objectssecuritydescriptor.toString()) as Int) else 0

public actual fun SeQueryServerSiloToken(token: Long, pserversilo: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeQueryServerSiloToken(token.toString(), pserversilo.toString()) as Int) else 0

public actual fun SeQuerySessionIdToken(token: Long, sessionid: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeQuerySessionIdToken(token.toString(), sessionid.toString()) as Int) else 0

public actual fun SeQuerySessionIdTokenEx(token: Long, sessionid: Long, isservicesession: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeQuerySessionIdTokenEx(token.toString(), sessionid.toString(), isservicesession.toString()) as Int) else 0

public actual fun SeRegisterLogonSessionTerminatedRoutine(callbackroutine: PSE_LOGON_SESSION_TERMINATED_ROUTINE): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeRegisterLogonSessionTerminatedRoutine(callbackroutine.toLong().toString()) as Int) else 0

public actual fun SeRegisterLogonSessionTerminatedRoutineEx(callbackroutine: PSE_LOGON_SESSION_TERMINATED_ROUTINE_EX, context: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeRegisterLogonSessionTerminatedRoutineEx(callbackroutine.toLong().toString(), context.toString()) as Int) else 0

public actual fun SeReportSecurityEventWithSubCategory(flags: UInt, sourcename: Long, usersid: PSID, auditparameters: Long, auditsubcategoryid: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeReportSecurityEventWithSubCategory(flags.toInt(), sourcename.toString(), usersid.toString(), auditparameters.toString(), auditsubcategoryid.toInt()) as Int) else 0

public actual fun SeSetAccessStateGenericMapping(accessstate: Long, genericmapping: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeSetAccessStateGenericMapping(accessstate.toString(), genericmapping.toString())
    }
}

public actual fun SeSetSecurityDescriptorInfo(obj: Long, securityinformation: Long, modificationdescriptor: PSECURITY_DESCRIPTOR, objectssecuritydescriptor: Long, pooltype: POOL_TYPE, genericmapping: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeSetSecurityDescriptorInfo(obj.toString(), securityinformation.toString(), modificationdescriptor.toString(), objectssecuritydescriptor.toString(), pooltype, genericmapping.toString()) as Int) else 0

public actual fun SeSetSecurityDescriptorInfoEx(obj: Long, securityinformation: Long, modificationdescriptor: PSECURITY_DESCRIPTOR, objectssecuritydescriptor: Long, autoinheritflags: UInt, pooltype: POOL_TYPE, genericmapping: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeSetSecurityDescriptorInfoEx(obj.toString(), securityinformation.toString(), modificationdescriptor.toString(), objectssecuritydescriptor.toString(), autoinheritflags.toInt(), pooltype, genericmapping.toString()) as Int) else 0

public actual fun SeShouldCheckForAccessRightsFromParent(objecttype: Long, childdescriptor: PSECURITY_DESCRIPTOR, accessstate: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeShouldCheckForAccessRightsFromParent(objecttype.toString(), childdescriptor.toString(), accessstate.toString()) as Boolean) else false

public actual fun SeTokenFromAccessInformation(accessinformation: Long, token: Long, length: UInt, requiredlength: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeTokenFromAccessInformation(accessinformation.toString(), token.toString(), length.toInt(), requiredlength.toString()) as Int) else 0

public actual fun SeTokenIsAdmin(token: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeTokenIsAdmin(token.toString()) as Boolean) else false

public actual fun SeTokenIsRestricted(token: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeTokenIsRestricted(token.toString()) as Boolean) else false

public actual fun SeTokenIsWriteRestricted(token: Long): Boolean =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeTokenIsWriteRestricted(token.toString()) as Boolean) else false

public actual fun SeTokenType(token: Long): TOKEN_TYPE =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeTokenType(token.toString()) as Int) else 0

public actual fun SeUnregisterLogonSessionTerminatedRoutine(callbackroutine: PSE_LOGON_SESSION_TERMINATED_ROUTINE): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeUnregisterLogonSessionTerminatedRoutine(callbackroutine.toLong().toString()) as Int) else 0

public actual fun SeUnregisterLogonSessionTerminatedRoutineEx(callbackroutine: PSE_LOGON_SESSION_TERMINATED_ROUTINE_EX, context: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SeUnregisterLogonSessionTerminatedRoutineEx(callbackroutine.toLong().toString(), context.toString()) as Int) else 0

public actual fun SecLookupAccountName(name: Long, sidsize: Long, sid: PSID, nameuse: Long, domainsize: Long, referenceddomain: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SecLookupAccountName(name.toString(), sidsize.toString(), sid.toString(), nameuse.toString(), domainsize.toString(), referenceddomain.toString()) as Int) else 0

public actual fun SecLookupAccountSid(sid: PSID, namesize: Long, namebuffer: Long, domainsize: Long, domainbuffer: Long, nameuse: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SecLookupAccountSid(sid.toString(), namesize.toString(), namebuffer.toString(), domainsize.toString(), domainbuffer.toString(), nameuse.toString()) as Int) else 0

public actual fun SecLookupWellKnownSid(sidtype: WELL_KNOWN_SID_TYPE, sid: PSID, sidbuffersize: UInt, sidsize: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SecLookupWellKnownSid(sidtype, sid.toString(), sidbuffersize.toInt(), sidsize.toString()) as Int) else 0

public actual fun SecMakeSPN(serviceclass: Long, servicename: Long, instancename: Long, instanceport: UShort, referrer: Long, spn: Long, length: Long, allocate: Boolean): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SecMakeSPN(serviceclass.toString(), servicename.toString(), instancename.toString(), instanceport.toInt(), referrer.toString(), spn.toString(), length.toString(), allocate) as Int) else 0

public actual fun SecMakeSPNEx(serviceclass: Long, servicename: Long, instancename: Long, instanceport: UShort, referrer: Long, targetinfo: Long, spn: Long, length: Long, allocate: Boolean): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SecMakeSPNEx(serviceclass.toString(), servicename.toString(), instancename.toString(), instanceport.toInt(), referrer.toString(), targetinfo.toString(), spn.toString(), length.toString(), allocate) as Int) else 0

public actual fun SecMakeSPNEx2(serviceclass: Long, servicename: Long, instancename: Long, instanceport: UShort, referrer: Long, intargetinfo: Long, spn: Long, totalsize: Long, allocate: Boolean, istargetinfomarshaled: Boolean): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SecMakeSPNEx2(serviceclass.toString(), servicename.toString(), instancename.toString(), instanceport.toInt(), referrer.toString(), intargetinfo.toString(), spn.toString(), totalsize.toString(), allocate, istargetinfomarshaled) as Int) else 0

public actual fun SetContextAttributesW(phcontext: Long, ulattribute: UInt, pbuffer: Long, cbbuffer: UInt): HRESULT =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SetContextAttributesW(phcontext.toString(), ulattribute.toInt(), pbuffer.toString(), cbbuffer.toInt()) as Int) else 0

public actual fun SspiAcceptSecurityContextAsync(asynccontext: Long, phcredential: Long, phcontext: Long, pinput: Long, fcontextreq: UInt, targetdatarep: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SspiAcceptSecurityContextAsync(asynccontext.toString(), phcredential.toString(), phcontext.toString(), pinput.toString(), fcontextreq.toInt(), targetdatarep.toInt(), phnewcontext.toString(), poutput.toString(), pfcontextattr.toString(), ptsexpiry.toString()) as Int) else 0

public actual fun SspiAcquireCredentialsHandleAsyncA(asynccontext: Long, pszprincipal: PCSTR, pszpackage: PCSTR, fcredentialuse: UInt, pvlogonid: Long, pauthdata: Long, pgetkeyfn: SEC_GET_KEY_FN, pvgetkeyargument: Long, phcredential: Long, ptsexpiry: Long): HRESULT =
    0

public actual fun SspiAcquireCredentialsHandleAsyncW(asynccontext: Long, pszprincipal: Long, pszpackage: Long, fcredentialuse: UInt, pvlogonid: Long, pauthdata: Long, pgetkeyfn: SEC_GET_KEY_FN, pvgetkeyargument: Long, phcredential: Long, ptsexpiry: Long): HRESULT =
    0

public actual fun SspiCreateAsyncContext(): Long =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SspiCreateAsyncContext() as String).toLong() else 0L

public actual fun SspiDeleteSecurityContextAsync(asynccontext: Long, phcontext: Long): HRESULT =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SspiDeleteSecurityContextAsync(asynccontext.toString(), phcontext.toString()) as Int) else 0

public actual fun SspiFreeAsyncContext(handle: Long) {
    if (_windowsWdkStorageFilesystemNapiAddon != null) {
        _windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SspiFreeAsyncContext(handle.toString())
    }
}

public actual fun SspiFreeCredentialsHandleAsync(asynccontext: Long, phcredential: Long): HRESULT =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SspiFreeCredentialsHandleAsync(asynccontext.toString(), phcredential.toString()) as Int) else 0

public actual fun SspiGetAsyncCallStatus(handle: Long): HRESULT =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SspiGetAsyncCallStatus(handle.toString()) as Int) else 0

public actual fun SspiInitializeSecurityContextAsyncA(asynccontext: Long, phcredential: Long, phcontext: Long, psztargetname: PCSTR, fcontextreq: UInt, reserved1: UInt, targetdatarep: UInt, pinput: Long, reserved2: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SspiInitializeSecurityContextAsyncA(asynccontext.toString(), phcredential.toString(), phcontext.toString(), psztargetname.toString(), fcontextreq.toInt(), reserved1.toInt(), targetdatarep.toInt(), pinput.toString(), reserved2.toInt(), phnewcontext.toString(), poutput.toString(), pfcontextattr.toString(), ptsexpiry.toString()) as Int) else 0

public actual fun SspiInitializeSecurityContextAsyncW(asynccontext: Long, phcredential: Long, phcontext: Long, psztargetname: Long, fcontextreq: UInt, reserved1: UInt, targetdatarep: UInt, pinput: Long, reserved2: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SspiInitializeSecurityContextAsyncW(asynccontext.toString(), phcredential.toString(), phcontext.toString(), psztargetname.toString(), fcontextreq.toInt(), reserved1.toInt(), targetdatarep.toInt(), pinput.toString(), reserved2.toInt(), phnewcontext.toString(), poutput.toString(), pfcontextattr.toString(), ptsexpiry.toString()) as Int) else 0

public actual fun SspiReinitAsyncContext(handle: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SspiReinitAsyncContext(handle.toString()) as Int) else 0

public actual fun SspiSetAsyncNotifyCallback(context: Long, callback: SspiAsyncNotifyCallback, callbackdata: Long): HRESULT =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_SspiSetAsyncNotifyCallback(context.toString(), callback.toLong().toString(), callbackdata.toString()) as Int) else 0

public actual fun VerifySignature(phcontext: Long, pmessage: Long, messageseqno: UInt, pfqop: Long): HRESULT =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_VerifySignature(phcontext.toString(), pmessage.toString(), messageseqno.toInt(), pfqop.toString()) as Int) else 0

public actual fun ZwAccessCheckAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, desiredaccess: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwAccessCheckAndAuditAlarm(subsystemname.toString(), handleid.toString(), objecttypename.toString(), objectname.toString(), securitydescriptor.toString(), desiredaccess.toInt(), genericmapping.toString(), objectcreation, grantedaccess.toString(), accessstatus.toString(), generateonclose.toString()) as Int) else 0

public actual fun ZwAccessCheckByTypeAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwAccessCheckByTypeAndAuditAlarm(subsystemname.toString(), handleid.toString(), objecttypename.toString(), objectname.toString(), securitydescriptor.toString(), principalselfsid.toString(), desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.toString(), objecttypelistlength.toInt(), genericmapping.toString(), objectcreation, grantedaccess.toString(), accessstatus.toString(), generateonclose.toString()) as Int) else 0

public actual fun ZwAccessCheckByTypeResultListAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwAccessCheckByTypeResultListAndAuditAlarm(subsystemname.toString(), handleid.toString(), objecttypename.toString(), objectname.toString(), securitydescriptor.toString(), principalselfsid.toString(), desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.toString(), objecttypelistlength.toInt(), genericmapping.toString(), objectcreation, grantedaccess.toString(), accessstatus.toString(), generateonclose.toString()) as Int) else 0

public actual fun ZwAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname: Long, handleid: Long, clienttoken: HANDLE, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname.toString(), handleid.toString(), clienttoken.toString(), objecttypename.toString(), objectname.toString(), securitydescriptor.toString(), principalselfsid.toString(), desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.toString(), objecttypelistlength.toInt(), genericmapping.toString(), objectcreation, grantedaccess.toString(), accessstatus.toString(), generateonclose.toString()) as Int) else 0

public actual fun ZwAdjustGroupsToken(tokenhandle: HANDLE, resettodefault: Boolean, newstate: Long, bufferlength: UInt, previousstate: Long, returnlength: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwAdjustGroupsToken(tokenhandle.toString(), resettodefault, newstate.toString(), bufferlength.toInt(), previousstate.toString(), returnlength.toString()) as Int) else 0

public actual fun ZwAdjustPrivilegesToken(tokenhandle: HANDLE, disableallprivileges: Boolean, newstate: Long, bufferlength: UInt, previousstate: Long, returnlength: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwAdjustPrivilegesToken(tokenhandle.toString(), disableallprivileges, newstate.toString(), bufferlength.toInt(), previousstate.toString(), returnlength.toString()) as Int) else 0

public actual fun ZwAllocateVirtualMemory(processhandle: HANDLE, baseaddress: Long, zerobits: ULong, regionsize: Long, allocationtype: UInt, protect: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwAllocateVirtualMemory(processhandle.toString(), baseaddress.toString(), zerobits.toString(), regionsize.toString(), allocationtype.toInt(), protect.toInt()) as Int) else 0

public actual fun ZwAllocateVirtualMemoryEx(processhandle: HANDLE, baseaddress: Long, regionsize: Long, allocationtype: UInt, pageprotection: UInt, extendedparameters: Long, extendedparametercount: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwAllocateVirtualMemoryEx(processhandle.toString(), baseaddress.toString(), regionsize.toString(), allocationtype.toInt(), pageprotection.toInt(), extendedparameters.toString(), extendedparametercount.toInt()) as Int) else 0

public actual fun ZwCancelIoFileEx(filehandle: HANDLE, iorequesttocancel: Long, iostatusblock: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwCancelIoFileEx(filehandle.toString(), iorequesttocancel.toString(), iostatusblock.toString()) as Int) else 0

public actual fun ZwCloseObjectAuditAlarm(subsystemname: Long, handleid: Long, generateonclose: Boolean): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwCloseObjectAuditAlarm(subsystemname.toString(), handleid.toString(), generateonclose) as Int) else 0

public actual fun ZwCreateDirectoryObject(directoryhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwCreateDirectoryObject(directoryhandle.toString(), desiredaccess.toInt(), objectattributes.toString()) as Int) else 0

public actual fun ZwCreateEvent(eventhandle: Long, desiredaccess: UInt, objectattributes: Long, eventtype: EVENT_TYPE, initialstate: Boolean): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwCreateEvent(eventhandle.toString(), desiredaccess.toInt(), objectattributes.toString(), eventtype, initialstate) as Int) else 0

public actual fun ZwCreateSectionEx(sectionhandle: Long, desiredaccess: UInt, objectattributes: Long, maximumsize: Long, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: HANDLE, extendedparameters: Long, extendedparametercount: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwCreateSectionEx(sectionhandle.toString(), desiredaccess.toInt(), objectattributes.toString(), maximumsize.toString(), sectionpageprotection.toInt(), allocationattributes.toInt(), filehandle.toString(), extendedparameters.toString(), extendedparametercount.toInt()) as Int) else 0

public actual fun ZwDeleteFile(objectattributes: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwDeleteFile(objectattributes.toString()) as Int) else 0

public actual fun ZwDeleteObjectAuditAlarm(subsystemname: Long, handleid: Long, generateonclose: Boolean): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwDeleteObjectAuditAlarm(subsystemname.toString(), handleid.toString(), generateonclose) as Int) else 0

public actual fun ZwDuplicateObject(sourceprocesshandle: HANDLE, sourcehandle: HANDLE, targetprocesshandle: HANDLE, targethandle: Long, desiredaccess: UInt, handleattributes: UInt, options: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwDuplicateObject(sourceprocesshandle.toString(), sourcehandle.toString(), targetprocesshandle.toString(), targethandle.toString(), desiredaccess.toInt(), handleattributes.toInt(), options.toInt()) as Int) else 0

public actual fun ZwDuplicateToken(existingtokenhandle: HANDLE, desiredaccess: UInt, objectattributes: Long, effectiveonly: Boolean, tokentype: TOKEN_TYPE, newtokenhandle: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwDuplicateToken(existingtokenhandle.toString(), desiredaccess.toInt(), objectattributes.toString(), effectiveonly, tokentype, newtokenhandle.toString()) as Int) else 0

public actual fun ZwFilterToken(existingtokenhandle: HANDLE, flags: UInt, sidstodisable: Long, privilegestodelete: Long, restrictedsids: Long, newtokenhandle: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwFilterToken(existingtokenhandle.toString(), flags.toInt(), sidstodisable.toString(), privilegestodelete.toString(), restrictedsids.toString(), newtokenhandle.toString()) as Int) else 0

public actual fun ZwFlushBuffersFile(filehandle: HANDLE, iostatusblock: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwFlushBuffersFile(filehandle.toString(), iostatusblock.toString()) as Int) else 0

public actual fun ZwFlushBuffersFileEx(filehandle: HANDLE, flags: UInt, parameters: Long, parameterssize: UInt, iostatusblock: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwFlushBuffersFileEx(filehandle.toString(), flags.toInt(), parameters.toString(), parameterssize.toInt(), iostatusblock.toString()) as Int) else 0

public actual fun ZwFlushVirtualMemory(processhandle: HANDLE, baseaddress: Long, regionsize: Long, iostatus: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwFlushVirtualMemory(processhandle.toString(), baseaddress.toString(), regionsize.toString(), iostatus.toString()) as Int) else 0

public actual fun ZwFreeVirtualMemory(processhandle: HANDLE, baseaddress: Long, regionsize: Long, freetype: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwFreeVirtualMemory(processhandle.toString(), baseaddress.toString(), regionsize.toString(), freetype.toInt()) as Int) else 0

public actual fun ZwFsControlFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, fscontrolcode: UInt, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt): NTSTATUS =
    0

public actual fun ZwImpersonateAnonymousToken(threadhandle: HANDLE): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwImpersonateAnonymousToken(threadhandle.toString()) as Int) else 0

public actual fun ZwLockFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, byteoffset: Long, length: Long, key: UInt, failimmediately: Boolean, exclusivelock: Boolean): NTSTATUS =
    0

public actual fun ZwNotifyChangeKey(keyhandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, completionfilter: UInt, watchtree: Boolean, buffer: Long, buffersize: UInt, asynchronous: Boolean): NTSTATUS =
    0

public actual fun ZwOpenDirectoryObject(directoryhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwOpenDirectoryObject(directoryhandle.toString(), desiredaccess.toInt(), objectattributes.toString()) as Int) else 0

public actual fun ZwOpenObjectAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, clienttoken: HANDLE, desiredaccess: UInt, grantedaccess: UInt, privileges: Long, objectcreation: Boolean, accessgranted: Boolean, generateonclose: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwOpenObjectAuditAlarm(subsystemname.toString(), handleid.toString(), objecttypename.toString(), objectname.toString(), securitydescriptor.toString(), clienttoken.toString(), desiredaccess.toInt(), grantedaccess.toInt(), privileges.toString(), objectcreation, accessgranted, generateonclose.toString()) as Int) else 0

public actual fun ZwOpenProcessToken(processhandle: HANDLE, desiredaccess: UInt, tokenhandle: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwOpenProcessToken(processhandle.toString(), desiredaccess.toInt(), tokenhandle.toString()) as Int) else 0

public actual fun ZwOpenProcessTokenEx(processhandle: HANDLE, desiredaccess: UInt, handleattributes: UInt, tokenhandle: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwOpenProcessTokenEx(processhandle.toString(), desiredaccess.toInt(), handleattributes.toInt(), tokenhandle.toString()) as Int) else 0

public actual fun ZwOpenThreadToken(threadhandle: HANDLE, desiredaccess: UInt, openasself: Boolean, tokenhandle: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwOpenThreadToken(threadhandle.toString(), desiredaccess.toInt(), openasself, tokenhandle.toString()) as Int) else 0

public actual fun ZwOpenThreadTokenEx(threadhandle: HANDLE, desiredaccess: UInt, openasself: Boolean, handleattributes: UInt, tokenhandle: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwOpenThreadTokenEx(threadhandle.toString(), desiredaccess.toInt(), openasself, handleattributes.toInt(), tokenhandle.toString()) as Int) else 0

public actual fun ZwPrivilegeCheck(clienttoken: HANDLE, requiredprivileges: Long, result: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwPrivilegeCheck(clienttoken.toString(), requiredprivileges.toString(), result.toString()) as Int) else 0

public actual fun ZwPrivilegeObjectAuditAlarm(subsystemname: Long, handleid: Long, clienttoken: HANDLE, desiredaccess: UInt, privileges: Long, accessgranted: Boolean): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwPrivilegeObjectAuditAlarm(subsystemname.toString(), handleid.toString(), clienttoken.toString(), desiredaccess.toInt(), privileges.toString(), accessgranted) as Int) else 0

public actual fun ZwPrivilegedServiceAuditAlarm(subsystemname: Long, servicename: Long, clienttoken: HANDLE, privileges: Long, accessgranted: Boolean): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwPrivilegedServiceAuditAlarm(subsystemname.toString(), servicename.toString(), clienttoken.toString(), privileges.toString(), accessgranted) as Int) else 0

public actual fun ZwQueryDirectoryFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, returnsingleentry: Boolean, filename: Long, restartscan: Boolean): NTSTATUS =
    0

public actual fun ZwQueryDirectoryFileEx(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, queryflags: UInt, filename: Long): NTSTATUS =
    0

public actual fun ZwQueryDirectoryObject(directoryhandle: HANDLE, buffer: Long, length: UInt, returnsingleentry: Boolean, restartscan: Boolean, context: Long, returnlength: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwQueryDirectoryObject(directoryhandle.toString(), buffer.toString(), length.toInt(), returnsingleentry, restartscan, context.toString(), returnlength.toString()) as Int) else 0

public actual fun ZwQueryEaFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt, returnsingleentry: Boolean, ealist: Long, ealistlength: UInt, eaindex: Long, restartscan: Boolean): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwQueryEaFile(filehandle.toString(), iostatusblock.toString(), buffer.toString(), length.toInt(), returnsingleentry, ealist.toString(), ealistlength.toInt(), eaindex.toString(), restartscan) as Int) else 0

public actual fun ZwQueryFullAttributesFile(objectattributes: Long, fileinformation: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwQueryFullAttributesFile(objectattributes.toString(), fileinformation.toString()) as Int) else 0

public actual fun ZwQueryInformationToken(tokenhandle: HANDLE, tokeninformationclass: TOKEN_INFORMATION_CLASS, tokeninformation: Long, tokeninformationlength: UInt, returnlength: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwQueryInformationToken(tokenhandle.toString(), tokeninformationclass, tokeninformation.toString(), tokeninformationlength.toInt(), returnlength.toString()) as Int) else 0

public actual fun ZwQueryObject(handle: HANDLE, objectinformationclass: OBJECT_INFORMATION_CLASS, objectinformation: Long, objectinformationlength: UInt, returnlength: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwQueryObject(handle.toString(), objectinformationclass, objectinformation.toString(), objectinformationlength.toInt(), returnlength.toString()) as Int) else 0

public actual fun ZwQueryQuotaInformationFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt, returnsingleentry: Boolean, sidlist: Long, sidlistlength: UInt, startsid: PSID, restartscan: Boolean): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwQueryQuotaInformationFile(filehandle.toString(), iostatusblock.toString(), buffer.toString(), length.toInt(), returnsingleentry, sidlist.toString(), sidlistlength.toInt(), startsid.toString(), restartscan) as Int) else 0

public actual fun ZwQuerySecurityObject(handle: HANDLE, securityinformation: UInt, securitydescriptor: PSECURITY_DESCRIPTOR, length: UInt, lengthneeded: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwQuerySecurityObject(handle.toString(), securityinformation.toInt(), securitydescriptor.toString(), length.toInt(), lengthneeded.toString()) as Int) else 0

public actual fun ZwQueryVirtualMemory(processhandle: HANDLE, baseaddress: Long, memoryinformationclass: MEMORY_INFORMATION_CLASS, memoryinformation: Long, memoryinformationlength: ULong, returnlength: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwQueryVirtualMemory(processhandle.toString(), baseaddress.toString(), memoryinformationclass, memoryinformation.toString(), memoryinformationlength.toString(), returnlength.toString()) as Int) else 0

public actual fun ZwQueryVolumeInformationFile(filehandle: HANDLE, iostatusblock: Long, fsinformation: Long, length: UInt, fsinformationclass: FS_INFORMATION_CLASS): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwQueryVolumeInformationFile(filehandle.toString(), iostatusblock.toString(), fsinformation.toString(), length.toInt(), fsinformationclass) as Int) else 0

public actual fun ZwSetEaFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwSetEaFile(filehandle.toString(), iostatusblock.toString(), buffer.toString(), length.toInt()) as Int) else 0

public actual fun ZwSetEvent(eventhandle: HANDLE, previousstate: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwSetEvent(eventhandle.toString(), previousstate.toString()) as Int) else 0

public actual fun ZwSetInformationToken(tokenhandle: HANDLE, tokeninformationclass: TOKEN_INFORMATION_CLASS, tokeninformation: Long, tokeninformationlength: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwSetInformationToken(tokenhandle.toString(), tokeninformationclass, tokeninformation.toString(), tokeninformationlength.toInt()) as Int) else 0

public actual fun ZwSetInformationVirtualMemory(processhandle: HANDLE, vminformationclass: VIRTUAL_MEMORY_INFORMATION_CLASS, numberofentries: ULong, virtualaddresses: Long, vminformation: Long, vminformationlength: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwSetInformationVirtualMemory(processhandle.toString(), vminformationclass, numberofentries.toString(), virtualaddresses.toString(), vminformation.toString(), vminformationlength.toInt()) as Int) else 0

public actual fun ZwSetQuotaInformationFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwSetQuotaInformationFile(filehandle.toString(), iostatusblock.toString(), buffer.toString(), length.toInt()) as Int) else 0

public actual fun ZwSetSecurityObject(handle: HANDLE, securityinformation: UInt, securitydescriptor: PSECURITY_DESCRIPTOR): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwSetSecurityObject(handle.toString(), securityinformation.toInt(), securitydescriptor.toString()) as Int) else 0

public actual fun ZwSetVolumeInformationFile(filehandle: HANDLE, iostatusblock: Long, fsinformation: Long, length: UInt, fsinformationclass: FS_INFORMATION_CLASS): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwSetVolumeInformationFile(filehandle.toString(), iostatusblock.toString(), fsinformation.toString(), length.toInt(), fsinformationclass) as Int) else 0

public actual fun ZwUnlockFile(filehandle: HANDLE, iostatusblock: Long, byteoffset: Long, length: Long, key: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemNapiAddon != null) (_windowsWdkStorageFilesystemNapiAddon.windowssys_windows_wdk_storage_filesystem_ZwUnlockFile(filehandle.toString(), iostatusblock.toString(), byteoffset.toString(), length.toString(), key.toInt()) as Int) else 0
