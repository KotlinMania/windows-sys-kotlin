@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters

import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.windows.wdk.foundation.IO_PRIORITY_HINT
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PEPROCESS
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PETHREAD
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PNOTIFY_SYNC
import io.github.kotlinmania.windowssys.windows.wdk.foundation.POOL_TYPE
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FILE_INFORMATION_CLASS
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FS_INFORMATION_CLASS
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.PCHECK_FOR_TRAVERSE_ACCESS
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.PFILTER_REPORT_CHANGE
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.PFSRTL_EXTRA_CREATE_PARAMETER_CLEANUP_CALLBACK
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.PUNLOCK_ROUTINE
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.WORK_QUEUE_TYPE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.FILTER_INFORMATION_CLASS
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.FILTER_VOLUME_INFORMATION_CLASS
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.INSTANCE_INFORMATION_CLASS
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.WAIT_TYPE

private val _windowsWdkStorageFilesystemMinifiltersNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun FltAcknowledgeEcp(filter: PFLT_FILTER, ecpcontext: Long) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltAcknowledgeEcp(filter.toString(), ecpcontext.toString())
    }
}

public actual fun FltAcquirePushLockExclusive(pushlock: Long) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquirePushLockExclusive(pushlock.toString())
    }
}

public actual fun FltAcquirePushLockExclusiveEx(pushlock: Long, flags: UInt) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquirePushLockExclusiveEx(pushlock.toString(), flags.toInt())
    }
}

public actual fun FltAcquirePushLockShared(pushlock: Long) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquirePushLockShared(pushlock.toString())
    }
}

public actual fun FltAcquirePushLockSharedEx(pushlock: Long, flags: UInt) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquirePushLockSharedEx(pushlock.toString(), flags.toInt())
    }
}

public actual fun FltAcquireResourceExclusive(resource: Long) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquireResourceExclusive(resource.toString())
    }
}

public actual fun FltAcquireResourceShared(resource: Long) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquireResourceShared(resource.toString())
    }
}

public actual fun FltAddOpenReparseEntry(filter: PFLT_FILTER, data: Long, openreparseentry: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltAddOpenReparseEntry(filter.toString(), data.toString(), openreparseentry.toString()) as Int) else 0

public actual fun FltAdjustDeviceStackSizeForIoRedirection(sourceinstance: PFLT_INSTANCE, targetinstance: PFLT_INSTANCE, sourcedevicestacksizemodified: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltAdjustDeviceStackSizeForIoRedirection(sourceinstance.toString(), targetinstance.toString(), sourcedevicestacksizemodified.toString()) as Int) else 0

public actual fun FltAllocateCallbackData(instance: PFLT_INSTANCE, fileobject: Long, retnewcallbackdata: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateCallbackData(instance.toString(), fileobject.toString(), retnewcallbackdata.toString()) as Int) else 0

public actual fun FltAllocateCallbackDataEx(instance: PFLT_INSTANCE, fileobject: Long, flags: UInt, retnewcallbackdata: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateCallbackDataEx(instance.toString(), fileobject.toString(), flags.toInt(), retnewcallbackdata.toString()) as Int) else 0

public actual fun FltAllocateContext(filter: PFLT_FILTER, contexttype: UShort, contextsize: ULong, pooltype: POOL_TYPE, returnedcontext: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateContext(filter.toString(), contexttype.toInt(), contextsize.toString(), pooltype, returnedcontext.toString()) as Int) else 0

public actual fun FltAllocateDeferredIoWorkItem(): PFLT_DEFERRED_IO_WORKITEM =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateDeferredIoWorkItem() as String).toLong() else 0L

public actual fun FltAllocateExtraCreateParameter(filter: PFLT_FILTER, ecptype: Long, sizeofcontext: UInt, flags: UInt, cleanupcallback: PFSRTL_EXTRA_CREATE_PARAMETER_CLEANUP_CALLBACK, pooltag: UInt, ecpcontext: Long): NTSTATUS =
    0

public actual fun FltAllocateExtraCreateParameterFromLookasideList(filter: PFLT_FILTER, ecptype: Long, sizeofcontext: UInt, flags: UInt, cleanupcallback: PFSRTL_EXTRA_CREATE_PARAMETER_CLEANUP_CALLBACK, lookasidelist: Long, ecpcontext: Long): NTSTATUS =
    0

public actual fun FltAllocateExtraCreateParameterList(filter: PFLT_FILTER, flags: UInt, ecplist: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateExtraCreateParameterList(filter.toString(), flags.toInt(), ecplist.toString()) as Int) else 0

public actual fun FltAllocateFileLock(completelockcallbackdataroutine: PFLT_COMPLETE_LOCK_CALLBACK_DATA_ROUTINE, unlockroutine: PUNLOCK_ROUTINE): Long =
    0L

public actual fun FltAllocateGenericWorkItem(): PFLT_GENERIC_WORKITEM =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateGenericWorkItem() as String).toLong() else 0L

public actual fun FltAllocatePoolAlignedWithTag(instance: PFLT_INSTANCE, pooltype: POOL_TYPE, numberofbytes: ULong, tag: UInt): Long =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocatePoolAlignedWithTag(instance.toString(), pooltype, numberofbytes.toString(), tag.toInt()) as String).toLong() else 0L

public actual fun FltApplyPriorityInfoThread(inputpriorityinfo: Long, outputpriorityinfo: Long, thread: PETHREAD): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltApplyPriorityInfoThread(inputpriorityinfo.toString(), outputpriorityinfo.toString(), thread.toString()) as Int) else 0

public actual fun FltAttachVolume(filter: PFLT_FILTER, volume: PFLT_VOLUME, instancename: Long, retinstance: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltAttachVolume(filter.toString(), volume.toString(), instancename.toString(), retinstance.toString()) as Int) else 0

public actual fun FltAttachVolumeAtAltitude(filter: PFLT_FILTER, volume: PFLT_VOLUME, altitude: Long, instancename: Long, retinstance: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltAttachVolumeAtAltitude(filter.toString(), volume.toString(), altitude.toString(), instancename.toString(), retinstance.toString()) as Int) else 0

public actual fun FltBuildDefaultSecurityDescriptor(securitydescriptor: Long, desiredaccess: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltBuildDefaultSecurityDescriptor(securitydescriptor.toString(), desiredaccess.toInt()) as Int) else 0

public actual fun FltCancelFileOpen(instance: PFLT_INSTANCE, fileobject: Long) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltCancelFileOpen(instance.toString(), fileobject.toString())
    }
}

public actual fun FltCancelIo(callbackdata: Long): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltCancelIo(callbackdata.toString()) as Boolean) else false

public actual fun FltCancellableWaitForMultipleObjects(count: UInt, objectarray: Long, waittype: WAIT_TYPE, timeout: Long, waitblockarray: Long, callbackdata: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltCancellableWaitForMultipleObjects(count.toInt(), objectarray.toString(), waittype, timeout.toString(), waitblockarray.toString(), callbackdata.toString()) as Int) else 0

public actual fun FltCancellableWaitForSingleObject(obj: Long, timeout: Long, callbackdata: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltCancellableWaitForSingleObject(obj.toString(), timeout.toString(), callbackdata.toString()) as Int) else 0

public actual fun FltCbdqDisable(cbdq: Long) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqDisable(cbdq.toString())
    }
}

public actual fun FltCbdqEnable(cbdq: Long) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqEnable(cbdq.toString())
    }
}

public actual fun FltCbdqInitialize(instance: PFLT_INSTANCE, cbdq: Long, cbdqinsertio: PFLT_CALLBACK_DATA_QUEUE_INSERT_IO, cbdqremoveio: PFLT_CALLBACK_DATA_QUEUE_REMOVE_IO, cbdqpeeknextio: PFLT_CALLBACK_DATA_QUEUE_PEEK_NEXT_IO, cbdqacquire: PFLT_CALLBACK_DATA_QUEUE_ACQUIRE, cbdqrelease: PFLT_CALLBACK_DATA_QUEUE_RELEASE, cbdqcompletecanceledio: PFLT_CALLBACK_DATA_QUEUE_COMPLETE_CANCELED_IO): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqInitialize(instance.toString(), cbdq.toString(), cbdqinsertio.toLong().toString(), cbdqremoveio.toLong().toString(), cbdqpeeknextio.toLong().toString(), cbdqacquire.toLong().toString(), cbdqrelease.toLong().toString(), cbdqcompletecanceledio.toLong().toString()) as Int) else 0

public actual fun FltCbdqInsertIo(cbdq: Long, cbd: Long, context: Long, insertcontext: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqInsertIo(cbdq.toString(), cbd.toString(), context.toString(), insertcontext.toString()) as Int) else 0

public actual fun FltCbdqRemoveIo(cbdq: Long, context: Long): Long =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqRemoveIo(cbdq.toString(), context.toString()) as String).toLong() else 0L

public actual fun FltCbdqRemoveNextIo(cbdq: Long, peekcontext: Long): Long =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqRemoveNextIo(cbdq.toString(), peekcontext.toString()) as String).toLong() else 0L

public actual fun FltCheckAndGrowNameControl(namectrl: Long, newsize: UShort): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltCheckAndGrowNameControl(namectrl.toString(), newsize.toInt()) as Int) else 0

public actual fun FltCheckLockForReadAccess(filelock: Long, callbackdata: Long): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltCheckLockForReadAccess(filelock.toString(), callbackdata.toString()) as Boolean) else false

public actual fun FltCheckLockForWriteAccess(filelock: Long, callbackdata: Long): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltCheckLockForWriteAccess(filelock.toString(), callbackdata.toString()) as Boolean) else false

public actual fun FltCheckOplock(oplock: Long, callbackdata: Long, context: Long, waitcompletionroutine: PFLTOPLOCK_WAIT_COMPLETE_ROUTINE, prepostcallbackdataroutine: PFLTOPLOCK_PREPOST_CALLBACKDATA_ROUTINE): FLT_PREOP_CALLBACK_STATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltCheckOplock(oplock.toString(), callbackdata.toString(), context.toString(), waitcompletionroutine.toLong().toString(), prepostcallbackdataroutine.toLong().toString()) as Int) else 0

public actual fun FltCheckOplockEx(oplock: Long, callbackdata: Long, flags: UInt, context: Long, waitcompletionroutine: PFLTOPLOCK_WAIT_COMPLETE_ROUTINE, prepostcallbackdataroutine: PFLTOPLOCK_PREPOST_CALLBACKDATA_ROUTINE): FLT_PREOP_CALLBACK_STATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltCheckOplockEx(oplock.toString(), callbackdata.toString(), flags.toInt(), context.toString(), waitcompletionroutine.toLong().toString(), prepostcallbackdataroutine.toLong().toString()) as Int) else 0

public actual fun FltClearCallbackDataDirty(data: Long) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltClearCallbackDataDirty(data.toString())
    }
}

public actual fun FltClearCancelCompletion(callbackdata: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltClearCancelCompletion(callbackdata.toString()) as Int) else 0

public actual fun FltClose(filehandle: HANDLE): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltClose(filehandle.toString()) as Int) else 0

public actual fun FltCloseClientPort(filter: PFLT_FILTER, clientport: Long) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltCloseClientPort(filter.toString(), clientport.toString())
    }
}

public actual fun FltCloseCommunicationPort(serverport: PFLT_PORT) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltCloseCommunicationPort(serverport.toString())
    }
}

public actual fun FltCloseSectionForDataScan(sectioncontext: PFLT_CONTEXT): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltCloseSectionForDataScan(sectioncontext.toString()) as Int) else 0

public actual fun FltCommitComplete(instance: PFLT_INSTANCE, transaction: Long, transactioncontext: PFLT_CONTEXT): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltCommitComplete(instance.toString(), transaction.toString(), transactioncontext.toString()) as Int) else 0

public actual fun FltCommitFinalizeComplete(instance: PFLT_INSTANCE, transaction: Long, transactioncontext: PFLT_CONTEXT): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltCommitFinalizeComplete(instance.toString(), transaction.toString(), transactioncontext.toString()) as Int) else 0

public actual fun FltCompareInstanceAltitudes(instance1: PFLT_INSTANCE, instance2: PFLT_INSTANCE): Int =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltCompareInstanceAltitudes(instance1.toString(), instance2.toString()) as Int) else 0

public actual fun FltCompletePendedPostOperation(callbackdata: Long) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltCompletePendedPostOperation(callbackdata.toString())
    }
}

public actual fun FltCompletePendedPreOperation(callbackdata: Long, callbackstatus: FLT_PREOP_CALLBACK_STATUS, context: Long) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltCompletePendedPreOperation(callbackdata.toString(), callbackstatus, context.toString())
    }
}

public actual fun FltCopyOpenReparseList(filter: PFLT_FILTER, data: Long, ecplist: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltCopyOpenReparseList(filter.toString(), data.toString(), ecplist.toString()) as Int) else 0

public actual fun FltCreateCommunicationPort(filter: PFLT_FILTER, serverport: Long, objectattributes: Long, serverportcookie: Long, connectnotifycallback: PFLT_CONNECT_NOTIFY, disconnectnotifycallback: PFLT_DISCONNECT_NOTIFY, messagenotifycallback: PFLT_MESSAGE_NOTIFY, maxconnections: Int): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateCommunicationPort(filter.toString(), serverport.toString(), objectattributes.toString(), serverportcookie.toString(), connectnotifycallback.toLong().toString(), disconnectnotifycallback.toLong().toString(), messagenotifycallback.toLong().toString(), maxconnections) as Int) else 0

public actual fun FltCreateFile(filter: PFLT_FILTER, instance: PFLT_INSTANCE, filehandle: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: Long, ealength: UInt, flags: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateFile(filter.toString(), instance.toString(), filehandle.toString(), desiredaccess.toInt(), objectattributes.toString(), iostatusblock.toString(), allocationsize.toString(), fileattributes.toInt(), shareaccess.toInt(), createdisposition.toInt(), createoptions.toInt(), eabuffer.toString(), ealength.toInt(), flags.toInt()) as Int) else 0

public actual fun FltCreateFileEx(filter: PFLT_FILTER, instance: PFLT_INSTANCE, filehandle: Long, fileobject: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: Long, ealength: UInt, flags: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateFileEx(filter.toString(), instance.toString(), filehandle.toString(), fileobject.toString(), desiredaccess.toInt(), objectattributes.toString(), iostatusblock.toString(), allocationsize.toString(), fileattributes.toInt(), shareaccess.toInt(), createdisposition.toInt(), createoptions.toInt(), eabuffer.toString(), ealength.toInt(), flags.toInt()) as Int) else 0

public actual fun FltCreateFileEx2(filter: PFLT_FILTER, instance: PFLT_INSTANCE, filehandle: Long, fileobject: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: Long, ealength: UInt, flags: UInt, drivercontext: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateFileEx2(filter.toString(), instance.toString(), filehandle.toString(), fileobject.toString(), desiredaccess.toInt(), objectattributes.toString(), iostatusblock.toString(), allocationsize.toString(), fileattributes.toInt(), shareaccess.toInt(), createdisposition.toInt(), createoptions.toInt(), eabuffer.toString(), ealength.toInt(), flags.toInt(), drivercontext.toString()) as Int) else 0

public actual fun FltCreateMailslotFile(filter: PFLT_FILTER, instance: PFLT_INSTANCE, filehandle: Long, fileobject: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, createoptions: UInt, mailslotquota: UInt, maximummessagesize: UInt, readtimeout: Long, drivercontext: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateMailslotFile(filter.toString(), instance.toString(), filehandle.toString(), fileobject.toString(), desiredaccess.toInt(), objectattributes.toString(), iostatusblock.toString(), createoptions.toInt(), mailslotquota.toInt(), maximummessagesize.toInt(), readtimeout.toString(), drivercontext.toString()) as Int) else 0

public actual fun FltCreateNamedPipeFile(filter: PFLT_FILTER, instance: PFLT_INSTANCE, filehandle: Long, fileobject: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, namedpipetype: UInt, readmode: UInt, completionmode: UInt, maximuminstances: UInt, inboundquota: UInt, outboundquota: UInt, defaulttimeout: Long, drivercontext: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateNamedPipeFile(filter.toString(), instance.toString(), filehandle.toString(), fileobject.toString(), desiredaccess.toInt(), objectattributes.toString(), iostatusblock.toString(), shareaccess.toInt(), createdisposition.toInt(), createoptions.toInt(), namedpipetype.toInt(), readmode.toInt(), completionmode.toInt(), maximuminstances.toInt(), inboundquota.toInt(), outboundquota.toInt(), defaulttimeout.toString(), drivercontext.toString()) as Int) else 0

public actual fun FltCreateSectionForDataScan(instance: PFLT_INSTANCE, fileobject: Long, sectioncontext: PFLT_CONTEXT, desiredaccess: UInt, objectattributes: Long, maximumsize: Long, sectionpageprotection: UInt, allocationattributes: UInt, flags: UInt, sectionhandle: Long, sectionobject: Long, sectionfilesize: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateSectionForDataScan(instance.toString(), fileobject.toString(), sectioncontext.toString(), desiredaccess.toInt(), objectattributes.toString(), maximumsize.toString(), sectionpageprotection.toInt(), allocationattributes.toInt(), flags.toInt(), sectionhandle.toString(), sectionobject.toString(), sectionfilesize.toString()) as Int) else 0

public actual fun FltCreateSystemVolumeInformationFolder(instance: PFLT_INSTANCE): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateSystemVolumeInformationFolder(instance.toString()) as Int) else 0

public actual fun FltCurrentBatchOplock(oplock: Long): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltCurrentBatchOplock(oplock.toString()) as Boolean) else false

public actual fun FltCurrentOplock(oplock: Long): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltCurrentOplock(oplock.toString()) as Boolean) else false

public actual fun FltCurrentOplockH(oplock: Long): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltCurrentOplockH(oplock.toString()) as Boolean) else false

public actual fun FltDecodeParameters(callbackdata: Long, mdladdresspointer: Long, buffer: Long, length: Long, desiredaccess: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltDecodeParameters(callbackdata.toString(), mdladdresspointer.toString(), buffer.toString(), length.toString(), desiredaccess.toString()) as Int) else 0

public actual fun FltDeleteContext(context: PFLT_CONTEXT) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteContext(context.toString())
    }
}

public actual fun FltDeleteExtraCreateParameterLookasideList(filter: PFLT_FILTER, lookaside: Long, flags: UInt) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteExtraCreateParameterLookasideList(filter.toString(), lookaside.toString(), flags.toInt())
    }
}

public actual fun FltDeleteFileContext(instance: PFLT_INSTANCE, fileobject: Long, oldcontext: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteFileContext(instance.toString(), fileobject.toString(), oldcontext.toString()) as Int) else 0

public actual fun FltDeleteInstanceContext(instance: PFLT_INSTANCE, oldcontext: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteInstanceContext(instance.toString(), oldcontext.toString()) as Int) else 0

public actual fun FltDeletePushLock(pushlock: Long) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltDeletePushLock(pushlock.toString())
    }
}

public actual fun FltDeleteStreamContext(instance: PFLT_INSTANCE, fileobject: Long, oldcontext: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteStreamContext(instance.toString(), fileobject.toString(), oldcontext.toString()) as Int) else 0

public actual fun FltDeleteStreamHandleContext(instance: PFLT_INSTANCE, fileobject: Long, oldcontext: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteStreamHandleContext(instance.toString(), fileobject.toString(), oldcontext.toString()) as Int) else 0

public actual fun FltDeleteTransactionContext(instance: PFLT_INSTANCE, transaction: Long, oldcontext: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteTransactionContext(instance.toString(), transaction.toString(), oldcontext.toString()) as Int) else 0

public actual fun FltDeleteVolumeContext(filter: PFLT_FILTER, volume: PFLT_VOLUME, oldcontext: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteVolumeContext(filter.toString(), volume.toString(), oldcontext.toString()) as Int) else 0

public actual fun FltDetachVolume(filter: PFLT_FILTER, volume: PFLT_VOLUME, instancename: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltDetachVolume(filter.toString(), volume.toString(), instancename.toString()) as Int) else 0

public actual fun FltDeviceIoControlFile(instance: PFLT_INSTANCE, fileobject: Long, iocontrolcode: UInt, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt, lengthreturned: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltDeviceIoControlFile(instance.toString(), fileobject.toString(), iocontrolcode.toInt(), inputbuffer.toString(), inputbufferlength.toInt(), outputbuffer.toString(), outputbufferlength.toInt(), lengthreturned.toString()) as Int) else 0

public actual fun FltDoCompletionProcessingWhenSafe(data: Long, fltobjects: Long, completioncontext: Long, flags: UInt, safepostcallback: PFLT_POST_OPERATION_CALLBACK, retpostoperationstatus: Long): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltDoCompletionProcessingWhenSafe(data.toString(), fltobjects.toString(), completioncontext.toString(), flags.toInt(), safepostcallback.toLong().toString(), retpostoperationstatus.toString()) as Boolean) else false

public actual fun FltEnlistInTransaction(instance: PFLT_INSTANCE, transaction: Long, transactioncontext: PFLT_CONTEXT, notificationmask: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltEnlistInTransaction(instance.toString(), transaction.toString(), transactioncontext.toString(), notificationmask.toInt()) as Int) else 0

public actual fun FltEnumerateFilterInformation(index: UInt, informationclass: FILTER_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateFilterInformation(index.toInt(), informationclass, buffer.toString(), buffersize.toInt(), bytesreturned.toString()) as Int) else 0

public actual fun FltEnumerateFilters(filterlist: Long, filterlistsize: UInt, numberfiltersreturned: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateFilters(filterlist.toString(), filterlistsize.toInt(), numberfiltersreturned.toString()) as Int) else 0

public actual fun FltEnumerateInstanceInformationByDeviceObject(deviceobject: Long, index: UInt, informationclass: INSTANCE_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateInstanceInformationByDeviceObject(deviceobject.toString(), index.toInt(), informationclass, buffer.toString(), buffersize.toInt(), bytesreturned.toString()) as Int) else 0

public actual fun FltEnumerateInstanceInformationByFilter(filter: PFLT_FILTER, index: UInt, informationclass: INSTANCE_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateInstanceInformationByFilter(filter.toString(), index.toInt(), informationclass, buffer.toString(), buffersize.toInt(), bytesreturned.toString()) as Int) else 0

public actual fun FltEnumerateInstanceInformationByVolume(volume: PFLT_VOLUME, index: UInt, informationclass: INSTANCE_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateInstanceInformationByVolume(volume.toString(), index.toInt(), informationclass, buffer.toString(), buffersize.toInt(), bytesreturned.toString()) as Int) else 0

public actual fun FltEnumerateInstanceInformationByVolumeName(volumename: Long, index: UInt, informationclass: INSTANCE_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateInstanceInformationByVolumeName(volumename.toString(), index.toInt(), informationclass, buffer.toString(), buffersize.toInt(), bytesreturned.toString()) as Int) else 0

public actual fun FltEnumerateInstances(volume: PFLT_VOLUME, filter: PFLT_FILTER, instancelist: Long, instancelistsize: UInt, numberinstancesreturned: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateInstances(volume.toString(), filter.toString(), instancelist.toString(), instancelistsize.toInt(), numberinstancesreturned.toString()) as Int) else 0

public actual fun FltEnumerateVolumeInformation(filter: PFLT_FILTER, index: UInt, informationclass: FILTER_VOLUME_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateVolumeInformation(filter.toString(), index.toInt(), informationclass, buffer.toString(), buffersize.toInt(), bytesreturned.toString()) as Int) else 0

public actual fun FltEnumerateVolumes(filter: PFLT_FILTER, volumelist: Long, volumelistsize: UInt, numbervolumesreturned: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateVolumes(filter.toString(), volumelist.toString(), volumelistsize.toInt(), numbervolumesreturned.toString()) as Int) else 0

public actual fun FltFastIoMdlRead(initiatinginstance: PFLT_INSTANCE, fileobject: Long, fileoffset: Long, length: UInt, lockkey: UInt, mdlchain: Long, iostatus: Long): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltFastIoMdlRead(initiatinginstance.toString(), fileobject.toString(), fileoffset.toString(), length.toInt(), lockkey.toInt(), mdlchain.toString(), iostatus.toString()) as Boolean) else false

public actual fun FltFastIoMdlReadComplete(initiatinginstance: PFLT_INSTANCE, fileobject: Long, mdlchain: Long): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltFastIoMdlReadComplete(initiatinginstance.toString(), fileobject.toString(), mdlchain.toString()) as Boolean) else false

public actual fun FltFastIoMdlWriteComplete(initiatinginstance: PFLT_INSTANCE, fileobject: Long, fileoffset: Long, mdlchain: Long): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltFastIoMdlWriteComplete(initiatinginstance.toString(), fileobject.toString(), fileoffset.toString(), mdlchain.toString()) as Boolean) else false

public actual fun FltFastIoPrepareMdlWrite(initiatinginstance: PFLT_INSTANCE, fileobject: Long, fileoffset: Long, length: UInt, lockkey: UInt, mdlchain: Long, iostatus: Long): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltFastIoPrepareMdlWrite(initiatinginstance.toString(), fileobject.toString(), fileoffset.toString(), length.toInt(), lockkey.toInt(), mdlchain.toString(), iostatus.toString()) as Boolean) else false

public actual fun FltFindExtraCreateParameter(filter: PFLT_FILTER, ecplist: Long, ecptype: Long, ecpcontext: Long, ecpcontextsize: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltFindExtraCreateParameter(filter.toString(), ecplist.toString(), ecptype.toString(), ecpcontext.toString(), ecpcontextsize.toString()) as Int) else 0

public actual fun FltFlushBuffers(instance: PFLT_INSTANCE, fileobject: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltFlushBuffers(instance.toString(), fileobject.toString()) as Int) else 0

public actual fun FltFlushBuffers2(instance: PFLT_INSTANCE, fileobject: Long, flushtype: UInt, callbackdata: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltFlushBuffers2(instance.toString(), fileobject.toString(), flushtype.toInt(), callbackdata.toString()) as Int) else 0

public actual fun FltFreeCallbackData(callbackdata: Long) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeCallbackData(callbackdata.toString())
    }
}

public actual fun FltFreeDeferredIoWorkItem(fltworkitem: PFLT_DEFERRED_IO_WORKITEM) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeDeferredIoWorkItem(fltworkitem.toString())
    }
}

public actual fun FltFreeExtraCreateParameter(filter: PFLT_FILTER, ecpcontext: Long) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeExtraCreateParameter(filter.toString(), ecpcontext.toString())
    }
}

public actual fun FltFreeExtraCreateParameterList(filter: PFLT_FILTER, ecplist: Long) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeExtraCreateParameterList(filter.toString(), ecplist.toString())
    }
}

public actual fun FltFreeFileLock(filelock: Long) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeFileLock(filelock.toString())
    }
}

public actual fun FltFreeGenericWorkItem(fltworkitem: PFLT_GENERIC_WORKITEM) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeGenericWorkItem(fltworkitem.toString())
    }
}

public actual fun FltFreeOpenReparseList(filter: PFLT_FILTER, ecplist: Long) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeOpenReparseList(filter.toString(), ecplist.toString())
    }
}

public actual fun FltFreePoolAlignedWithTag(instance: PFLT_INSTANCE, buffer: Long, tag: UInt) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltFreePoolAlignedWithTag(instance.toString(), buffer.toString(), tag.toInt())
    }
}

public actual fun FltFreeSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeSecurityDescriptor(securitydescriptor.toString())
    }
}

public actual fun FltFsControlFile(instance: PFLT_INSTANCE, fileobject: Long, fscontrolcode: UInt, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt, lengthreturned: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltFsControlFile(instance.toString(), fileobject.toString(), fscontrolcode.toInt(), inputbuffer.toString(), inputbufferlength.toInt(), outputbuffer.toString(), outputbufferlength.toInt(), lengthreturned.toString()) as Int) else 0

public actual fun FltGetActivityIdCallbackData(callbackdata: Long, guid: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetActivityIdCallbackData(callbackdata.toString(), guid.toString()) as Int) else 0

public actual fun FltGetBottomInstance(volume: PFLT_VOLUME, instance: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetBottomInstance(volume.toString(), instance.toString()) as Int) else 0

public actual fun FltGetContexts(fltobjects: Long, desiredcontexts: UShort, contexts: Long) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetContexts(fltobjects.toString(), desiredcontexts.toInt(), contexts.toString())
    }
}

public actual fun FltGetContextsEx(fltobjects: Long, desiredcontexts: UShort, contextssize: ULong, contexts: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetContextsEx(fltobjects.toString(), desiredcontexts.toInt(), contextssize.toString(), contexts.toString()) as Int) else 0

public actual fun FltGetDestinationFileNameInformation(instance: PFLT_INSTANCE, fileobject: Long, rootdirectory: HANDLE, filename: PCWSTR, filenamelength: UInt, nameoptions: UInt, retfilenameinformation: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetDestinationFileNameInformation(instance.toString(), fileobject.toString(), rootdirectory.toString(), filename.toString(), filenamelength.toInt(), nameoptions.toInt(), retfilenameinformation.toString()) as Int) else 0

public actual fun FltGetDeviceObject(volume: PFLT_VOLUME, deviceobject: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetDeviceObject(volume.toString(), deviceobject.toString()) as Int) else 0

public actual fun FltGetDiskDeviceObject(volume: PFLT_VOLUME, diskdeviceobject: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetDiskDeviceObject(volume.toString(), diskdeviceobject.toString()) as Int) else 0

public actual fun FltGetEcpListFromCallbackData(filter: PFLT_FILTER, callbackdata: Long, ecplist: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetEcpListFromCallbackData(filter.toString(), callbackdata.toString(), ecplist.toString()) as Int) else 0

public actual fun FltGetFileContext(instance: PFLT_INSTANCE, fileobject: Long, context: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFileContext(instance.toString(), fileobject.toString(), context.toString()) as Int) else 0

public actual fun FltGetFileNameInformation(callbackdata: Long, nameoptions: UInt, filenameinformation: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFileNameInformation(callbackdata.toString(), nameoptions.toInt(), filenameinformation.toString()) as Int) else 0

public actual fun FltGetFileNameInformationUnsafe(fileobject: Long, instance: PFLT_INSTANCE, nameoptions: UInt, filenameinformation: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFileNameInformationUnsafe(fileobject.toString(), instance.toString(), nameoptions.toInt(), filenameinformation.toString()) as Int) else 0

public actual fun FltGetFileSystemType(fltobject: Long, filesystemtype: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFileSystemType(fltobject.toString(), filesystemtype.toString()) as Int) else 0

public actual fun FltGetFilterFromInstance(instance: PFLT_INSTANCE, retfilter: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFilterFromInstance(instance.toString(), retfilter.toString()) as Int) else 0

public actual fun FltGetFilterFromName(filtername: Long, retfilter: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFilterFromName(filtername.toString(), retfilter.toString()) as Int) else 0

public actual fun FltGetFilterInformation(filter: PFLT_FILTER, informationclass: FILTER_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFilterInformation(filter.toString(), informationclass, buffer.toString(), buffersize.toInt(), bytesreturned.toString()) as Int) else 0

public actual fun FltGetFsZeroingOffset(data: Long, zeroingoffset: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFsZeroingOffset(data.toString(), zeroingoffset.toString()) as Int) else 0

public actual fun FltGetInstanceContext(instance: PFLT_INSTANCE, context: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetInstanceContext(instance.toString(), context.toString()) as Int) else 0

public actual fun FltGetInstanceInformation(instance: PFLT_INSTANCE, informationclass: INSTANCE_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetInstanceInformation(instance.toString(), informationclass, buffer.toString(), buffersize.toInt(), bytesreturned.toString()) as Int) else 0

public actual fun FltGetIoAttributionHandleFromCallbackData(data: Long): Long =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIoAttributionHandleFromCallbackData(data.toString()) as String).toLong() else 0L

public actual fun FltGetIoPriorityHint(data: Long): IO_PRIORITY_HINT =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIoPriorityHint(data.toString()) as Int) else 0

public actual fun FltGetIoPriorityHintFromCallbackData(data: Long): IO_PRIORITY_HINT =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIoPriorityHintFromCallbackData(data.toString()) as Int) else 0

public actual fun FltGetIoPriorityHintFromFileObject(fileobject: Long): IO_PRIORITY_HINT =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIoPriorityHintFromFileObject(fileobject.toString()) as Int) else 0

public actual fun FltGetIoPriorityHintFromThread(thread: PETHREAD): IO_PRIORITY_HINT =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIoPriorityHintFromThread(thread.toString()) as Int) else 0

public actual fun FltGetIrpName(irpmajorcode: UByte): PSTR =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIrpName(irpmajorcode.toInt()) as String).toLong() else 0L

public actual fun FltGetLowerInstance(currentinstance: PFLT_INSTANCE, lowerinstance: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetLowerInstance(currentinstance.toString(), lowerinstance.toString()) as Int) else 0

public actual fun FltGetNewSystemBufferAddress(callbackdata: Long): Long =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetNewSystemBufferAddress(callbackdata.toString()) as String).toLong() else 0L

public actual fun FltGetNextExtraCreateParameter(filter: PFLT_FILTER, ecplist: Long, currentecpcontext: Long, nextecptype: Long, nextecpcontext: Long, nextecpcontextsize: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetNextExtraCreateParameter(filter.toString(), ecplist.toString(), currentecpcontext.toString(), nextecptype.toString(), nextecpcontext.toString(), nextecpcontextsize.toString()) as Int) else 0

public actual fun FltGetRequestorProcess(callbackdata: Long): PEPROCESS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetRequestorProcess(callbackdata.toString()) as String).toLong() else 0L

public actual fun FltGetRequestorProcessId(callbackdata: Long): UInt =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetRequestorProcessId(callbackdata.toString()) as Int).toUInt() else 0u

public actual fun FltGetRequestorProcessIdEx(callbackdata: Long): HANDLE =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetRequestorProcessIdEx(callbackdata.toString()) as String).toLong() else 0L

public actual fun FltGetRequestorSessionId(callbackdata: Long, sessionid: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetRequestorSessionId(callbackdata.toString(), sessionid.toString()) as Int) else 0

public actual fun FltGetRoutineAddress(fltmgrroutinename: PCSTR): Long =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetRoutineAddress(fltmgrroutinename.toString()) as String).toLong() else 0L

public actual fun FltGetSectionContext(instance: PFLT_INSTANCE, fileobject: Long, context: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetSectionContext(instance.toString(), fileobject.toString(), context.toString()) as Int) else 0

public actual fun FltGetStreamContext(instance: PFLT_INSTANCE, fileobject: Long, context: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetStreamContext(instance.toString(), fileobject.toString(), context.toString()) as Int) else 0

public actual fun FltGetStreamHandleContext(instance: PFLT_INSTANCE, fileobject: Long, context: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetStreamHandleContext(instance.toString(), fileobject.toString(), context.toString()) as Int) else 0

public actual fun FltGetSwappedBufferMdlAddress(callbackdata: Long): Long =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetSwappedBufferMdlAddress(callbackdata.toString()) as String).toLong() else 0L

public actual fun FltGetTopInstance(volume: PFLT_VOLUME, instance: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetTopInstance(volume.toString(), instance.toString()) as Int) else 0

public actual fun FltGetTransactionContext(instance: PFLT_INSTANCE, transaction: Long, context: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetTransactionContext(instance.toString(), transaction.toString(), context.toString()) as Int) else 0

public actual fun FltGetTunneledName(callbackdata: Long, filenameinformation: Long, rettunneledfilenameinformation: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetTunneledName(callbackdata.toString(), filenameinformation.toString(), rettunneledfilenameinformation.toString()) as Int) else 0

public actual fun FltGetUpperInstance(currentinstance: PFLT_INSTANCE, upperinstance: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetUpperInstance(currentinstance.toString(), upperinstance.toString()) as Int) else 0

public actual fun FltGetVolumeContext(filter: PFLT_FILTER, volume: PFLT_VOLUME, context: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeContext(filter.toString(), volume.toString(), context.toString()) as Int) else 0

public actual fun FltGetVolumeFromDeviceObject(filter: PFLT_FILTER, deviceobject: Long, retvolume: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeFromDeviceObject(filter.toString(), deviceobject.toString(), retvolume.toString()) as Int) else 0

public actual fun FltGetVolumeFromFileObject(filter: PFLT_FILTER, fileobject: Long, retvolume: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeFromFileObject(filter.toString(), fileobject.toString(), retvolume.toString()) as Int) else 0

public actual fun FltGetVolumeFromInstance(instance: PFLT_INSTANCE, retvolume: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeFromInstance(instance.toString(), retvolume.toString()) as Int) else 0

public actual fun FltGetVolumeFromName(filter: PFLT_FILTER, volumename: Long, retvolume: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeFromName(filter.toString(), volumename.toString(), retvolume.toString()) as Int) else 0

public actual fun FltGetVolumeGuidName(volume: PFLT_VOLUME, volumeguidname: Long, buffersizeneeded: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeGuidName(volume.toString(), volumeguidname.toString(), buffersizeneeded.toString()) as Int) else 0

public actual fun FltGetVolumeInformation(volume: PFLT_VOLUME, informationclass: FILTER_VOLUME_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeInformation(volume.toString(), informationclass, buffer.toString(), buffersize.toInt(), bytesreturned.toString()) as Int) else 0

public actual fun FltGetVolumeInstanceFromName(filter: PFLT_FILTER, volume: PFLT_VOLUME, instancename: Long, retinstance: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeInstanceFromName(filter.toString(), volume.toString(), instancename.toString(), retinstance.toString()) as Int) else 0

public actual fun FltGetVolumeName(volume: PFLT_VOLUME, volumename: Long, buffersizeneeded: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeName(volume.toString(), volumename.toString(), buffersizeneeded.toString()) as Int) else 0

public actual fun FltGetVolumeProperties(volume: PFLT_VOLUME, volumeproperties: Long, volumepropertieslength: UInt, lengthreturned: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeProperties(volume.toString(), volumeproperties.toString(), volumepropertieslength.toInt(), lengthreturned.toString()) as Int) else 0

public actual fun FltInitExtraCreateParameterLookasideList(filter: PFLT_FILTER, lookaside: Long, flags: UInt, size: ULong, tag: UInt) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltInitExtraCreateParameterLookasideList(filter.toString(), lookaside.toString(), flags.toInt(), size.toString(), tag.toInt())
    }
}

public actual fun FltInitializeFileLock(filelock: Long) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltInitializeFileLock(filelock.toString())
    }
}

public actual fun FltInitializeOplock(oplock: Long) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltInitializeOplock(oplock.toString())
    }
}

public actual fun FltInitializePushLock(pushlock: Long) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltInitializePushLock(pushlock.toString())
    }
}

public actual fun FltInsertExtraCreateParameter(filter: PFLT_FILTER, ecplist: Long, ecpcontext: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltInsertExtraCreateParameter(filter.toString(), ecplist.toString(), ecpcontext.toString()) as Int) else 0

public actual fun FltIs32bitProcess(callbackdata: Long): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltIs32bitProcess(callbackdata.toString()) as Boolean) else false

public actual fun FltIsCallbackDataDirty(data: Long): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltIsCallbackDataDirty(data.toString()) as Boolean) else false

public actual fun FltIsDirectory(fileobject: Long, instance: PFLT_INSTANCE, isdirectory: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltIsDirectory(fileobject.toString(), instance.toString(), isdirectory.toString()) as Int) else 0

public actual fun FltIsEcpAcknowledged(filter: PFLT_FILTER, ecpcontext: Long): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltIsEcpAcknowledged(filter.toString(), ecpcontext.toString()) as Boolean) else false

public actual fun FltIsEcpFromUserMode(filter: PFLT_FILTER, ecpcontext: Long): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltIsEcpFromUserMode(filter.toString(), ecpcontext.toString()) as Boolean) else false

public actual fun FltIsFltMgrVolumeDeviceObject(deviceobject: Long): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltIsFltMgrVolumeDeviceObject(deviceobject.toString()) as Boolean) else false

public actual fun FltIsIoCanceled(callbackdata: Long): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltIsIoCanceled(callbackdata.toString()) as Boolean) else false

public actual fun FltIsIoRedirectionAllowed(sourceinstance: PFLT_INSTANCE, targetinstance: PFLT_INSTANCE, redirectionallowed: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltIsIoRedirectionAllowed(sourceinstance.toString(), targetinstance.toString(), redirectionallowed.toString()) as Int) else 0

public actual fun FltIsIoRedirectionAllowedForOperation(data: Long, targetinstance: PFLT_INSTANCE, redirectionallowedthisio: Long, redirectionallowedallio: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltIsIoRedirectionAllowedForOperation(data.toString(), targetinstance.toString(), redirectionallowedthisio.toString(), redirectionallowedallio.toString()) as Int) else 0

public actual fun FltIsOperationSynchronous(callbackdata: Long): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltIsOperationSynchronous(callbackdata.toString()) as Boolean) else false

public actual fun FltIsVolumeSnapshot(fltobject: Long, issnapshotvolume: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltIsVolumeSnapshot(fltobject.toString(), issnapshotvolume.toString()) as Int) else 0

public actual fun FltIsVolumeWritable(fltobject: Long, iswritable: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltIsVolumeWritable(fltobject.toString(), iswritable.toString()) as Int) else 0

public actual fun FltLoadFilter(filtername: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltLoadFilter(filtername.toString()) as Int) else 0

public actual fun FltLockUserBuffer(callbackdata: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltLockUserBuffer(callbackdata.toString()) as Int) else 0

public actual fun FltNotifyFilterChangeDirectory(notifysync: PNOTIFY_SYNC, notifylist: Long, fscontext: Long, fulldirectoryname: Long, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifycallbackdata: Long, traversecallback: PCHECK_FOR_TRAVERSE_ACCESS, subjectcontext: Long, filtercallback: PFILTER_REPORT_CHANGE) {
}

public actual fun FltObjectDereference(fltobject: Long) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltObjectDereference(fltobject.toString())
    }
}

public actual fun FltObjectReference(fltobject: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltObjectReference(fltobject.toString()) as Int) else 0

public actual fun FltOpenVolume(instance: PFLT_INSTANCE, volumehandle: Long, volumefileobject: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltOpenVolume(instance.toString(), volumehandle.toString(), volumefileobject.toString()) as Int) else 0

public actual fun FltOplockBreakH(oplock: Long, callbackdata: Long, flags: UInt, context: Long, waitcompletionroutine: PFLTOPLOCK_WAIT_COMPLETE_ROUTINE, prepostcallbackdataroutine: PFLTOPLOCK_PREPOST_CALLBACKDATA_ROUTINE): FLT_PREOP_CALLBACK_STATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockBreakH(oplock.toString(), callbackdata.toString(), flags.toInt(), context.toString(), waitcompletionroutine.toLong().toString(), prepostcallbackdataroutine.toLong().toString()) as Int) else 0

public actual fun FltOplockBreakToNone(oplock: Long, callbackdata: Long, context: Long, waitcompletionroutine: PFLTOPLOCK_WAIT_COMPLETE_ROUTINE, prepostcallbackdataroutine: PFLTOPLOCK_PREPOST_CALLBACKDATA_ROUTINE): FLT_PREOP_CALLBACK_STATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockBreakToNone(oplock.toString(), callbackdata.toString(), context.toString(), waitcompletionroutine.toLong().toString(), prepostcallbackdataroutine.toLong().toString()) as Int) else 0

public actual fun FltOplockBreakToNoneEx(oplock: Long, callbackdata: Long, flags: UInt, context: Long, waitcompletionroutine: PFLTOPLOCK_WAIT_COMPLETE_ROUTINE, prepostcallbackdataroutine: PFLTOPLOCK_PREPOST_CALLBACKDATA_ROUTINE): FLT_PREOP_CALLBACK_STATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockBreakToNoneEx(oplock.toString(), callbackdata.toString(), flags.toInt(), context.toString(), waitcompletionroutine.toLong().toString(), prepostcallbackdataroutine.toLong().toString()) as Int) else 0

public actual fun FltOplockFsctrl(oplock: Long, callbackdata: Long, opencount: UInt): FLT_PREOP_CALLBACK_STATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockFsctrl(oplock.toString(), callbackdata.toString(), opencount.toInt()) as Int) else 0

public actual fun FltOplockFsctrlEx(oplock: Long, callbackdata: Long, opencount: UInt, flags: UInt): FLT_PREOP_CALLBACK_STATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockFsctrlEx(oplock.toString(), callbackdata.toString(), opencount.toInt(), flags.toInt()) as Int) else 0

public actual fun FltOplockIsFastIoPossible(oplock: Long): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockIsFastIoPossible(oplock.toString()) as Boolean) else false

public actual fun FltOplockIsSharedRequest(callbackdata: Long): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockIsSharedRequest(callbackdata.toString()) as Boolean) else false

public actual fun FltOplockKeysEqual(fo1: Long, fo2: Long): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockKeysEqual(fo1.toString(), fo2.toString()) as Boolean) else false

public actual fun FltParseFileName(filename: Long, extension: Long, stream: Long, finalcomponent: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltParseFileName(filename.toString(), extension.toString(), stream.toString(), finalcomponent.toString()) as Int) else 0

public actual fun FltParseFileNameInformation(filenameinformation: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltParseFileNameInformation(filenameinformation.toString()) as Int) else 0

public actual fun FltPerformAsynchronousIo(callbackdata: Long, callbackroutine: PFLT_COMPLETED_ASYNC_IO_CALLBACK, callbackcontext: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltPerformAsynchronousIo(callbackdata.toString(), callbackroutine.toLong().toString(), callbackcontext.toString()) as Int) else 0

public actual fun FltPerformSynchronousIo(callbackdata: Long) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltPerformSynchronousIo(callbackdata.toString())
    }
}

public actual fun FltPrePrepareComplete(instance: PFLT_INSTANCE, transaction: Long, transactioncontext: PFLT_CONTEXT): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltPrePrepareComplete(instance.toString(), transaction.toString(), transactioncontext.toString()) as Int) else 0

public actual fun FltPrepareComplete(instance: PFLT_INSTANCE, transaction: Long, transactioncontext: PFLT_CONTEXT): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltPrepareComplete(instance.toString(), transaction.toString(), transactioncontext.toString()) as Int) else 0

public actual fun FltPrepareToReuseEcp(filter: PFLT_FILTER, ecpcontext: Long) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltPrepareToReuseEcp(filter.toString(), ecpcontext.toString())
    }
}

public actual fun FltProcessFileLock(filelock: Long, callbackdata: Long, context: Long): FLT_PREOP_CALLBACK_STATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltProcessFileLock(filelock.toString(), callbackdata.toString(), context.toString()) as Int) else 0

public actual fun FltPropagateActivityIdToThread(callbackdata: Long, propagateid: Long, originalid: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltPropagateActivityIdToThread(callbackdata.toString(), propagateid.toString(), originalid.toString()) as Int) else 0

public actual fun FltPropagateIrpExtension(sourcedata: Long, targetdata: Long, flags: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltPropagateIrpExtension(sourcedata.toString(), targetdata.toString(), flags.toInt()) as Int) else 0

public actual fun FltPurgeFileNameInformationCache(instance: PFLT_INSTANCE, fileobject: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltPurgeFileNameInformationCache(instance.toString(), fileobject.toString()) as Int) else 0

public actual fun FltQueryDirectoryFile(instance: PFLT_INSTANCE, fileobject: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, returnsingleentry: Boolean, filename: Long, restartscan: Boolean, lengthreturned: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryDirectoryFile(instance.toString(), fileobject.toString(), fileinformation.toString(), length.toInt(), fileinformationclass, returnsingleentry, filename.toString(), restartscan, lengthreturned.toString()) as Int) else 0

public actual fun FltQueryDirectoryFileEx(instance: PFLT_INSTANCE, fileobject: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, queryflags: UInt, filename: Long, lengthreturned: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryDirectoryFileEx(instance.toString(), fileobject.toString(), fileinformation.toString(), length.toInt(), fileinformationclass, queryflags.toInt(), filename.toString(), lengthreturned.toString()) as Int) else 0

public actual fun FltQueryEaFile(instance: PFLT_INSTANCE, fileobject: Long, returnedeadata: Long, length: UInt, returnsingleentry: Boolean, ealist: Long, ealistlength: UInt, eaindex: Long, restartscan: Boolean, lengthreturned: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryEaFile(instance.toString(), fileobject.toString(), returnedeadata.toString(), length.toInt(), returnsingleentry, ealist.toString(), ealistlength.toInt(), eaindex.toString(), restartscan, lengthreturned.toString()) as Int) else 0

public actual fun FltQueryInformationByName(filter: PFLT_FILTER, instance: PFLT_INSTANCE, objectattributes: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, drivercontext: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryInformationByName(filter.toString(), instance.toString(), objectattributes.toString(), iostatusblock.toString(), fileinformation.toString(), length.toInt(), fileinformationclass, drivercontext.toString()) as Int) else 0

public actual fun FltQueryInformationFile(instance: PFLT_INSTANCE, fileobject: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, lengthreturned: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryInformationFile(instance.toString(), fileobject.toString(), fileinformation.toString(), length.toInt(), fileinformationclass, lengthreturned.toString()) as Int) else 0

public actual fun FltQueryQuotaInformationFile(instance: PFLT_INSTANCE, fileobject: Long, iostatusblock: Long, buffer: Long, length: UInt, returnsingleentry: Boolean, sidlist: Long, sidlistlength: UInt, startsid: Long, restartscan: Boolean, lengthreturned: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryQuotaInformationFile(instance.toString(), fileobject.toString(), iostatusblock.toString(), buffer.toString(), length.toInt(), returnsingleentry, sidlist.toString(), sidlistlength.toInt(), startsid.toString(), restartscan, lengthreturned.toString()) as Int) else 0

public actual fun FltQuerySecurityObject(instance: PFLT_INSTANCE, fileobject: Long, securityinformation: UInt, securitydescriptor: PSECURITY_DESCRIPTOR, length: UInt, lengthneeded: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltQuerySecurityObject(instance.toString(), fileobject.toString(), securityinformation.toInt(), securitydescriptor.toString(), length.toInt(), lengthneeded.toString()) as Int) else 0

public actual fun FltQueryVolumeInformation(instance: PFLT_INSTANCE, iosb: Long, fsinformation: Long, length: UInt, fsinformationclass: FS_INFORMATION_CLASS): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryVolumeInformation(instance.toString(), iosb.toString(), fsinformation.toString(), length.toInt(), fsinformationclass) as Int) else 0

public actual fun FltQueryVolumeInformationFile(instance: PFLT_INSTANCE, fileobject: Long, fsinformation: Long, length: UInt, fsinformationclass: FS_INFORMATION_CLASS, lengthreturned: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryVolumeInformationFile(instance.toString(), fileobject.toString(), fsinformation.toString(), length.toInt(), fsinformationclass, lengthreturned.toString()) as Int) else 0

public actual fun FltQueueDeferredIoWorkItem(fltworkitem: PFLT_DEFERRED_IO_WORKITEM, data: Long, workerroutine: PFLT_DEFERRED_IO_WORKITEM_ROUTINE, queuetype: WORK_QUEUE_TYPE, context: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltQueueDeferredIoWorkItem(fltworkitem.toString(), data.toString(), workerroutine.toLong().toString(), queuetype, context.toString()) as Int) else 0

public actual fun FltQueueGenericWorkItem(fltworkitem: PFLT_GENERIC_WORKITEM, fltobject: Long, workerroutine: PFLT_GENERIC_WORKITEM_ROUTINE, queuetype: WORK_QUEUE_TYPE, context: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltQueueGenericWorkItem(fltworkitem.toString(), fltobject.toString(), workerroutine.toLong().toString(), queuetype, context.toString()) as Int) else 0

public actual fun FltReadFile(initiatinginstance: PFLT_INSTANCE, fileobject: Long, byteoffset: Long, length: UInt, buffer: Long, flags: UInt, bytesread: Long, callbackroutine: PFLT_COMPLETED_ASYNC_IO_CALLBACK, callbackcontext: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltReadFile(initiatinginstance.toString(), fileobject.toString(), byteoffset.toString(), length.toInt(), buffer.toString(), flags.toInt(), bytesread.toString(), callbackroutine.toLong().toString(), callbackcontext.toString()) as Int) else 0

public actual fun FltReadFileEx(initiatinginstance: PFLT_INSTANCE, fileobject: Long, byteoffset: Long, length: UInt, buffer: Long, flags: UInt, bytesread: Long, callbackroutine: PFLT_COMPLETED_ASYNC_IO_CALLBACK, callbackcontext: Long, key: Long, mdl: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltReadFileEx(initiatinginstance.toString(), fileobject.toString(), byteoffset.toString(), length.toInt(), buffer.toString(), flags.toInt(), bytesread.toString(), callbackroutine.toLong().toString(), callbackcontext.toString(), key.toString(), mdl.toString()) as Int) else 0

public actual fun FltReferenceContext(context: PFLT_CONTEXT) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltReferenceContext(context.toString())
    }
}

public actual fun FltReferenceFileNameInformation(filenameinformation: Long) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltReferenceFileNameInformation(filenameinformation.toString())
    }
}

public actual fun FltRegisterFilter(driver: Long, registration: Long, retfilter: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltRegisterFilter(driver.toString(), registration.toString(), retfilter.toString()) as Int) else 0

public actual fun FltRegisterForDataScan(instance: PFLT_INSTANCE): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltRegisterForDataScan(instance.toString()) as Int) else 0

public actual fun FltReissueSynchronousIo(initiatinginstance: PFLT_INSTANCE, callbackdata: Long) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltReissueSynchronousIo(initiatinginstance.toString(), callbackdata.toString())
    }
}

public actual fun FltReleaseContext(context: PFLT_CONTEXT) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltReleaseContext(context.toString())
    }
}

public actual fun FltReleaseContexts(contexts: Long) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltReleaseContexts(contexts.toString())
    }
}

public actual fun FltReleaseContextsEx(contextssize: ULong, contexts: Long) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltReleaseContextsEx(contextssize.toString(), contexts.toString())
    }
}

public actual fun FltReleaseFileNameInformation(filenameinformation: Long) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltReleaseFileNameInformation(filenameinformation.toString())
    }
}

public actual fun FltReleasePushLock(pushlock: Long) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltReleasePushLock(pushlock.toString())
    }
}

public actual fun FltReleasePushLockEx(pushlock: Long, flags: UInt) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltReleasePushLockEx(pushlock.toString(), flags.toInt())
    }
}

public actual fun FltReleaseResource(resource: Long) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltReleaseResource(resource.toString())
    }
}

public actual fun FltRemoveExtraCreateParameter(filter: PFLT_FILTER, ecplist: Long, ecptype: Long, ecpcontext: Long, ecpcontextsize: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltRemoveExtraCreateParameter(filter.toString(), ecplist.toString(), ecptype.toString(), ecpcontext.toString(), ecpcontextsize.toString()) as Int) else 0

public actual fun FltRemoveOpenReparseEntry(filter: PFLT_FILTER, data: Long, openreparseentry: Long) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltRemoveOpenReparseEntry(filter.toString(), data.toString(), openreparseentry.toString())
    }
}

public actual fun FltRequestFileInfoOnCreateCompletion(filter: PFLT_FILTER, data: Long, infoclassflags: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltRequestFileInfoOnCreateCompletion(filter.toString(), data.toString(), infoclassflags.toInt()) as Int) else 0

public actual fun FltRequestOperationStatusCallback(data: Long, callbackroutine: PFLT_GET_OPERATION_STATUS_CALLBACK, requestercontext: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltRequestOperationStatusCallback(data.toString(), callbackroutine.toLong().toString(), requestercontext.toString()) as Int) else 0

public actual fun FltRetainSwappedBufferMdlAddress(callbackdata: Long) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltRetainSwappedBufferMdlAddress(callbackdata.toString())
    }
}

public actual fun FltRetrieveFileInfoOnCreateCompletion(filter: PFLT_FILTER, data: Long, infoclass: UInt, size: Long): Long =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltRetrieveFileInfoOnCreateCompletion(filter.toString(), data.toString(), infoclass.toInt(), size.toString()) as String).toLong() else 0L

public actual fun FltRetrieveFileInfoOnCreateCompletionEx(filter: PFLT_FILTER, data: Long, infoclass: UInt, retinfosize: Long, retinfobuffer: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltRetrieveFileInfoOnCreateCompletionEx(filter.toString(), data.toString(), infoclass.toInt(), retinfosize.toString(), retinfobuffer.toString()) as Int) else 0

public actual fun FltRetrieveIoPriorityInfo(data: Long, fileobject: Long, thread: PETHREAD, priorityinfo: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltRetrieveIoPriorityInfo(data.toString(), fileobject.toString(), thread.toString(), priorityinfo.toString()) as Int) else 0

public actual fun FltReuseCallbackData(callbackdata: Long) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltReuseCallbackData(callbackdata.toString())
    }
}

public actual fun FltRollbackComplete(instance: PFLT_INSTANCE, transaction: Long, transactioncontext: PFLT_CONTEXT): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltRollbackComplete(instance.toString(), transaction.toString(), transactioncontext.toString()) as Int) else 0

public actual fun FltRollbackEnlistment(instance: PFLT_INSTANCE, transaction: Long, transactioncontext: PFLT_CONTEXT): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltRollbackEnlistment(instance.toString(), transaction.toString(), transactioncontext.toString()) as Int) else 0

public actual fun FltSendMessage(filter: PFLT_FILTER, clientport: Long, senderbuffer: Long, senderbufferlength: UInt, replybuffer: Long, replylength: Long, timeout: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltSendMessage(filter.toString(), clientport.toString(), senderbuffer.toString(), senderbufferlength.toInt(), replybuffer.toString(), replylength.toString(), timeout.toString()) as Int) else 0

public actual fun FltSetActivityIdCallbackData(callbackdata: Long, guid: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetActivityIdCallbackData(callbackdata.toString(), guid.toString()) as Int) else 0

public actual fun FltSetCallbackDataDirty(data: Long) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetCallbackDataDirty(data.toString())
    }
}

public actual fun FltSetCancelCompletion(callbackdata: Long, canceledcallback: PFLT_COMPLETE_CANCELED_CALLBACK): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetCancelCompletion(callbackdata.toString(), canceledcallback.toLong().toString()) as Int) else 0

public actual fun FltSetEaFile(instance: PFLT_INSTANCE, fileobject: Long, eabuffer: Long, length: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetEaFile(instance.toString(), fileobject.toString(), eabuffer.toString(), length.toInt()) as Int) else 0

public actual fun FltSetEcpListIntoCallbackData(filter: PFLT_FILTER, callbackdata: Long, ecplist: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetEcpListIntoCallbackData(filter.toString(), callbackdata.toString(), ecplist.toString()) as Int) else 0

public actual fun FltSetFileContext(instance: PFLT_INSTANCE, fileobject: Long, operation: FLT_SET_CONTEXT_OPERATION, newcontext: PFLT_CONTEXT, oldcontext: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetFileContext(instance.toString(), fileobject.toString(), operation, newcontext.toString(), oldcontext.toString()) as Int) else 0

public actual fun FltSetFsZeroingOffset(data: Long, zeroingoffset: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetFsZeroingOffset(data.toString(), zeroingoffset.toInt()) as Int) else 0

public actual fun FltSetFsZeroingOffsetRequired(data: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetFsZeroingOffsetRequired(data.toString()) as Int) else 0

public actual fun FltSetInformationFile(instance: PFLT_INSTANCE, fileobject: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetInformationFile(instance.toString(), fileobject.toString(), fileinformation.toString(), length.toInt(), fileinformationclass) as Int) else 0

public actual fun FltSetInstanceContext(instance: PFLT_INSTANCE, operation: FLT_SET_CONTEXT_OPERATION, newcontext: PFLT_CONTEXT, oldcontext: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetInstanceContext(instance.toString(), operation, newcontext.toString(), oldcontext.toString()) as Int) else 0

public actual fun FltSetIoPriorityHintIntoCallbackData(data: Long, priorityhint: IO_PRIORITY_HINT): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetIoPriorityHintIntoCallbackData(data.toString(), priorityhint) as Int) else 0

public actual fun FltSetIoPriorityHintIntoFileObject(fileobject: Long, priorityhint: IO_PRIORITY_HINT): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetIoPriorityHintIntoFileObject(fileobject.toString(), priorityhint) as Int) else 0

public actual fun FltSetIoPriorityHintIntoThread(thread: PETHREAD, priorityhint: IO_PRIORITY_HINT): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetIoPriorityHintIntoThread(thread.toString(), priorityhint) as Int) else 0

public actual fun FltSetQuotaInformationFile(instance: PFLT_INSTANCE, fileobject: Long, buffer: Long, length: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetQuotaInformationFile(instance.toString(), fileobject.toString(), buffer.toString(), length.toInt()) as Int) else 0

public actual fun FltSetSecurityObject(instance: PFLT_INSTANCE, fileobject: Long, securityinformation: UInt, securitydescriptor: PSECURITY_DESCRIPTOR): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetSecurityObject(instance.toString(), fileobject.toString(), securityinformation.toInt(), securitydescriptor.toString()) as Int) else 0

public actual fun FltSetStreamContext(instance: PFLT_INSTANCE, fileobject: Long, operation: FLT_SET_CONTEXT_OPERATION, newcontext: PFLT_CONTEXT, oldcontext: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetStreamContext(instance.toString(), fileobject.toString(), operation, newcontext.toString(), oldcontext.toString()) as Int) else 0

public actual fun FltSetStreamHandleContext(instance: PFLT_INSTANCE, fileobject: Long, operation: FLT_SET_CONTEXT_OPERATION, newcontext: PFLT_CONTEXT, oldcontext: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetStreamHandleContext(instance.toString(), fileobject.toString(), operation, newcontext.toString(), oldcontext.toString()) as Int) else 0

public actual fun FltSetTransactionContext(instance: PFLT_INSTANCE, transaction: Long, operation: FLT_SET_CONTEXT_OPERATION, newcontext: PFLT_CONTEXT, oldcontext: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetTransactionContext(instance.toString(), transaction.toString(), operation, newcontext.toString(), oldcontext.toString()) as Int) else 0

public actual fun FltSetVolumeContext(volume: PFLT_VOLUME, operation: FLT_SET_CONTEXT_OPERATION, newcontext: PFLT_CONTEXT, oldcontext: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetVolumeContext(volume.toString(), operation, newcontext.toString(), oldcontext.toString()) as Int) else 0

public actual fun FltSetVolumeInformation(instance: PFLT_INSTANCE, iosb: Long, fsinformation: Long, length: UInt, fsinformationclass: FS_INFORMATION_CLASS): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetVolumeInformation(instance.toString(), iosb.toString(), fsinformation.toString(), length.toInt(), fsinformationclass) as Int) else 0

public actual fun FltStartFiltering(filter: PFLT_FILTER): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltStartFiltering(filter.toString()) as Int) else 0

public actual fun FltSupportsFileContexts(fileobject: Long): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltSupportsFileContexts(fileobject.toString()) as Boolean) else false

public actual fun FltSupportsFileContextsEx(fileobject: Long, instance: PFLT_INSTANCE): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltSupportsFileContextsEx(fileobject.toString(), instance.toString()) as Boolean) else false

public actual fun FltSupportsStreamContexts(fileobject: Long): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltSupportsStreamContexts(fileobject.toString()) as Boolean) else false

public actual fun FltSupportsStreamHandleContexts(fileobject: Long): Boolean =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltSupportsStreamHandleContexts(fileobject.toString()) as Boolean) else false

public actual fun FltTagFile(initiatinginstance: PFLT_INSTANCE, fileobject: Long, filetag: UInt, guid: Long, databuffer: Long, databufferlength: UShort): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltTagFile(initiatinginstance.toString(), fileobject.toString(), filetag.toInt(), guid.toString(), databuffer.toString(), databufferlength.toInt()) as Int) else 0

public actual fun FltTagFileEx(initiatinginstance: PFLT_INSTANCE, fileobject: Long, filetag: UInt, guid: Long, databuffer: Long, databufferlength: UShort, existingfiletag: UInt, existingguid: Long, flags: UInt): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltTagFileEx(initiatinginstance.toString(), fileobject.toString(), filetag.toInt(), guid.toString(), databuffer.toString(), databufferlength.toInt(), existingfiletag.toInt(), existingguid.toString(), flags.toInt()) as Int) else 0

public actual fun FltUninitializeFileLock(filelock: Long) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltUninitializeFileLock(filelock.toString())
    }
}

public actual fun FltUninitializeOplock(oplock: Long) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltUninitializeOplock(oplock.toString())
    }
}

public actual fun FltUnloadFilter(filtername: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltUnloadFilter(filtername.toString()) as Int) else 0

public actual fun FltUnregisterFilter(filter: PFLT_FILTER) {
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        _windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltUnregisterFilter(filter.toString())
    }
}

public actual fun FltUntagFile(initiatinginstance: PFLT_INSTANCE, fileobject: Long, filetag: UInt, guid: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltUntagFile(initiatinginstance.toString(), fileobject.toString(), filetag.toInt(), guid.toString()) as Int) else 0

public actual fun FltVetoBypassIo(callbackdata: Long, fltobjects: Long, operationstatus: NTSTATUS, failurereason: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltVetoBypassIo(callbackdata.toString(), fltobjects.toString(), operationstatus, failurereason.toString()) as Int) else 0

public actual fun FltWriteFile(initiatinginstance: PFLT_INSTANCE, fileobject: Long, byteoffset: Long, length: UInt, buffer: Long, flags: UInt, byteswritten: Long, callbackroutine: PFLT_COMPLETED_ASYNC_IO_CALLBACK, callbackcontext: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltWriteFile(initiatinginstance.toString(), fileobject.toString(), byteoffset.toString(), length.toInt(), buffer.toString(), flags.toInt(), byteswritten.toString(), callbackroutine.toLong().toString(), callbackcontext.toString()) as Int) else 0

public actual fun FltWriteFileEx(initiatinginstance: PFLT_INSTANCE, fileobject: Long, byteoffset: Long, length: UInt, buffer: Long, flags: UInt, byteswritten: Long, callbackroutine: PFLT_COMPLETED_ASYNC_IO_CALLBACK, callbackcontext: Long, key: Long, mdl: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltWriteFileEx(initiatinginstance.toString(), fileobject.toString(), byteoffset.toString(), length.toInt(), buffer.toString(), flags.toInt(), byteswritten.toString(), callbackroutine.toLong().toString(), callbackcontext.toString(), key.toString(), mdl.toString()) as Int) else 0

public actual fun FltpTraceRedirectedFileIo(originatingfileobject: Long, childcallbackdata: Long): NTSTATUS =
    if (_windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (_windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssys_windows_wdk_storage_filesystem_minifilters_FltpTraceRedirectedFileIo(originatingfileobject.toString(), childcallbackdata.toString()) as Int) else 0
