@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun FltAcknowledgeEcp(filter: PFLT_FILTER, ecpcontext: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltAcknowledgeEcp(filter, ecpcontext.toCPointer<ByteVar>())
}

public actual fun FltAcquirePushLockExclusive(pushlock: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquirePushLockExclusive(pushlock.toCPointer<ByteVar>())
}

public actual fun FltAcquirePushLockExclusiveEx(pushlock: Long, flags: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquirePushLockExclusiveEx(pushlock.toCPointer<ByteVar>(), flags)
}

public actual fun FltAcquirePushLockShared(pushlock: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquirePushLockShared(pushlock.toCPointer<ByteVar>())
}

public actual fun FltAcquirePushLockSharedEx(pushlock: Long, flags: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquirePushLockSharedEx(pushlock.toCPointer<ByteVar>(), flags)
}

public actual fun FltAcquireResourceExclusive(resource: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquireResourceExclusive(resource.toCPointer<ByteVar>())
}

public actual fun FltAcquireResourceShared(resource: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquireResourceShared(resource.toCPointer<ByteVar>())
}

public actual fun FltAddOpenReparseEntry(filter: PFLT_FILTER, data: Long, openreparseentry: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltAddOpenReparseEntry(filter, data.toCPointer<ByteVar>(), openreparseentry.toCPointer<ByteVar>())

public actual fun FltAdjustDeviceStackSizeForIoRedirection(sourceinstance: PFLT_INSTANCE, targetinstance: PFLT_INSTANCE, sourcedevicestacksizemodified: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltAdjustDeviceStackSizeForIoRedirection(sourceinstance, targetinstance, sourcedevicestacksizemodified.toCPointer<ByteVar>())

public actual fun FltAllocateCallbackData(instance: PFLT_INSTANCE, fileobject: Long, retnewcallbackdata: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateCallbackData(instance, fileobject.toCPointer<ByteVar>(), retnewcallbackdata.toCPointer<ByteVar>())

public actual fun FltAllocateCallbackDataEx(instance: PFLT_INSTANCE, fileobject: Long, flags: UInt, retnewcallbackdata: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateCallbackDataEx(instance, fileobject.toCPointer<ByteVar>(), flags, retnewcallbackdata.toCPointer<ByteVar>())

public actual fun FltAllocateContext(filter: PFLT_FILTER, contexttype: UShort, contextsize: ULong, pooltype: POOL_TYPE, returnedcontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateContext(filter, contexttype, contextsize, pooltype, returnedcontext.toCPointer<ByteVar>())

public actual fun FltAllocateDeferredIoWorkItem(): PFLT_DEFERRED_IO_WORKITEM =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateDeferredIoWorkItem()

public actual fun FltAllocateExtraCreateParameter(filter: PFLT_FILTER, ecptype: Long, sizeofcontext: UInt, flags: UInt, cleanupcallback: PFSRTL_EXTRA_CREATE_PARAMETER_CLEANUP_CALLBACK, pooltag: UInt, ecpcontext: Long): NTSTATUS =
    0

public actual fun FltAllocateExtraCreateParameterFromLookasideList(filter: PFLT_FILTER, ecptype: Long, sizeofcontext: UInt, flags: UInt, cleanupcallback: PFSRTL_EXTRA_CREATE_PARAMETER_CLEANUP_CALLBACK, lookasidelist: Long, ecpcontext: Long): NTSTATUS =
    0

public actual fun FltAllocateExtraCreateParameterList(filter: PFLT_FILTER, flags: UInt, ecplist: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateExtraCreateParameterList(filter, flags, ecplist.toCPointer<ByteVar>())

public actual fun FltAllocateFileLock(completelockcallbackdataroutine: PFLT_COMPLETE_LOCK_CALLBACK_DATA_ROUTINE, unlockroutine: PUNLOCK_ROUTINE): Long =
    0L

public actual fun FltAllocateGenericWorkItem(): PFLT_GENERIC_WORKITEM =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateGenericWorkItem()

public actual fun FltAllocatePoolAlignedWithTag(instance: PFLT_INSTANCE, pooltype: POOL_TYPE, numberofbytes: ULong, tag: UInt): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocatePoolAlignedWithTag(instance, pooltype, numberofbytes, tag)?.toLong() ?: 0L

public actual fun FltApplyPriorityInfoThread(inputpriorityinfo: Long, outputpriorityinfo: Long, thread: PETHREAD): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltApplyPriorityInfoThread(inputpriorityinfo.toCPointer<ByteVar>(), outputpriorityinfo.toCPointer<ByteVar>(), thread)

public actual fun FltAttachVolume(filter: PFLT_FILTER, volume: PFLT_VOLUME, instancename: Long, retinstance: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltAttachVolume(filter, volume, instancename.toCPointer<ByteVar>(), retinstance.toCPointer<ByteVar>())

public actual fun FltAttachVolumeAtAltitude(filter: PFLT_FILTER, volume: PFLT_VOLUME, altitude: Long, instancename: Long, retinstance: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltAttachVolumeAtAltitude(filter, volume, altitude.toCPointer<ByteVar>(), instancename.toCPointer<ByteVar>(), retinstance.toCPointer<ByteVar>())

public actual fun FltBuildDefaultSecurityDescriptor(securitydescriptor: Long, desiredaccess: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltBuildDefaultSecurityDescriptor(securitydescriptor.toCPointer<ByteVar>(), desiredaccess)

public actual fun FltCancelFileOpen(instance: PFLT_INSTANCE, fileobject: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltCancelFileOpen(instance, fileobject.toCPointer<ByteVar>())
}

public actual fun FltCancelIo(callbackdata: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltCancelIo(callbackdata.toCPointer<ByteVar>())

public actual fun FltCancellableWaitForMultipleObjects(count: UInt, objectarray: Long, waittype: WAIT_TYPE, timeout: Long, waitblockarray: Long, callbackdata: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltCancellableWaitForMultipleObjects(count, objectarray.toCPointer<ByteVar>(), waittype, timeout.toCPointer<ByteVar>(), waitblockarray.toCPointer<ByteVar>(), callbackdata.toCPointer<ByteVar>())

public actual fun FltCancellableWaitForSingleObject(obj: Long, timeout: Long, callbackdata: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltCancellableWaitForSingleObject(obj.toCPointer<ByteVar>(), timeout.toCPointer<ByteVar>(), callbackdata.toCPointer<ByteVar>())

public actual fun FltCbdqDisable(cbdq: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqDisable(cbdq.toCPointer<ByteVar>())
}

public actual fun FltCbdqEnable(cbdq: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqEnable(cbdq.toCPointer<ByteVar>())
}

public actual fun FltCbdqInitialize(instance: PFLT_INSTANCE, cbdq: Long, cbdqinsertio: PFLT_CALLBACK_DATA_QUEUE_INSERT_IO, cbdqremoveio: PFLT_CALLBACK_DATA_QUEUE_REMOVE_IO, cbdqpeeknextio: PFLT_CALLBACK_DATA_QUEUE_PEEK_NEXT_IO, cbdqacquire: PFLT_CALLBACK_DATA_QUEUE_ACQUIRE, cbdqrelease: PFLT_CALLBACK_DATA_QUEUE_RELEASE, cbdqcompletecanceledio: PFLT_CALLBACK_DATA_QUEUE_COMPLETE_CANCELED_IO): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqInitialize(instance, cbdq.toCPointer<ByteVar>(), cbdqinsertio.toLong().toCPointer<ByteVar>(), cbdqremoveio.toLong().toCPointer<ByteVar>(), cbdqpeeknextio.toLong().toCPointer<ByteVar>(), cbdqacquire.toLong().toCPointer<ByteVar>(), cbdqrelease.toLong().toCPointer<ByteVar>(), cbdqcompletecanceledio.toLong().toCPointer<ByteVar>())

public actual fun FltCbdqInsertIo(cbdq: Long, cbd: Long, context: Long, insertcontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqInsertIo(cbdq.toCPointer<ByteVar>(), cbd.toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), insertcontext.toCPointer<ByteVar>())

public actual fun FltCbdqRemoveIo(cbdq: Long, context: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqRemoveIo(cbdq.toCPointer<ByteVar>(), context.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun FltCbdqRemoveNextIo(cbdq: Long, peekcontext: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqRemoveNextIo(cbdq.toCPointer<ByteVar>(), peekcontext.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun FltCheckAndGrowNameControl(namectrl: Long, newsize: UShort): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltCheckAndGrowNameControl(namectrl.toCPointer<ByteVar>(), newsize)

public actual fun FltCheckLockForReadAccess(filelock: Long, callbackdata: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltCheckLockForReadAccess(filelock.toCPointer<ByteVar>(), callbackdata.toCPointer<ByteVar>())

public actual fun FltCheckLockForWriteAccess(filelock: Long, callbackdata: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltCheckLockForWriteAccess(filelock.toCPointer<ByteVar>(), callbackdata.toCPointer<ByteVar>())

public actual fun FltCheckOplock(oplock: Long, callbackdata: Long, context: Long, waitcompletionroutine: PFLTOPLOCK_WAIT_COMPLETE_ROUTINE, prepostcallbackdataroutine: PFLTOPLOCK_PREPOST_CALLBACKDATA_ROUTINE): FLT_PREOP_CALLBACK_STATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltCheckOplock(oplock.toCPointer<ByteVar>(), callbackdata.toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), waitcompletionroutine.toLong().toCPointer<ByteVar>(), prepostcallbackdataroutine.toLong().toCPointer<ByteVar>())

public actual fun FltCheckOplockEx(oplock: Long, callbackdata: Long, flags: UInt, context: Long, waitcompletionroutine: PFLTOPLOCK_WAIT_COMPLETE_ROUTINE, prepostcallbackdataroutine: PFLTOPLOCK_PREPOST_CALLBACKDATA_ROUTINE): FLT_PREOP_CALLBACK_STATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltCheckOplockEx(oplock.toCPointer<ByteVar>(), callbackdata.toCPointer<ByteVar>(), flags, context.toCPointer<ByteVar>(), waitcompletionroutine.toLong().toCPointer<ByteVar>(), prepostcallbackdataroutine.toLong().toCPointer<ByteVar>())

public actual fun FltClearCallbackDataDirty(data: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltClearCallbackDataDirty(data.toCPointer<ByteVar>())
}

public actual fun FltClearCancelCompletion(callbackdata: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltClearCancelCompletion(callbackdata.toCPointer<ByteVar>())

public actual fun FltClose(filehandle: HANDLE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltClose(filehandle.toCPointer<ByteVar>())

public actual fun FltCloseClientPort(filter: PFLT_FILTER, clientport: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltCloseClientPort(filter, clientport.toCPointer<ByteVar>())
}

public actual fun FltCloseCommunicationPort(serverport: PFLT_PORT) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltCloseCommunicationPort(serverport)
}

public actual fun FltCloseSectionForDataScan(sectioncontext: PFLT_CONTEXT): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltCloseSectionForDataScan(sectioncontext.toCPointer<ByteVar>())

public actual fun FltCommitComplete(instance: PFLT_INSTANCE, transaction: Long, transactioncontext: PFLT_CONTEXT): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltCommitComplete(instance, transaction.toCPointer<ByteVar>(), transactioncontext.toCPointer<ByteVar>())

public actual fun FltCommitFinalizeComplete(instance: PFLT_INSTANCE, transaction: Long, transactioncontext: PFLT_CONTEXT): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltCommitFinalizeComplete(instance, transaction.toCPointer<ByteVar>(), transactioncontext.toCPointer<ByteVar>())

public actual fun FltCompareInstanceAltitudes(instance1: PFLT_INSTANCE, instance2: PFLT_INSTANCE): Int =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltCompareInstanceAltitudes(instance1, instance2)

public actual fun FltCompletePendedPostOperation(callbackdata: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltCompletePendedPostOperation(callbackdata.toCPointer<ByteVar>())
}

public actual fun FltCompletePendedPreOperation(callbackdata: Long, callbackstatus: FLT_PREOP_CALLBACK_STATUS, context: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltCompletePendedPreOperation(callbackdata.toCPointer<ByteVar>(), callbackstatus, context.toCPointer<ByteVar>())
}

public actual fun FltCopyOpenReparseList(filter: PFLT_FILTER, data: Long, ecplist: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltCopyOpenReparseList(filter, data.toCPointer<ByteVar>(), ecplist.toCPointer<ByteVar>())

public actual fun FltCreateCommunicationPort(filter: PFLT_FILTER, serverport: Long, objectattributes: Long, serverportcookie: Long, connectnotifycallback: PFLT_CONNECT_NOTIFY, disconnectnotifycallback: PFLT_DISCONNECT_NOTIFY, messagenotifycallback: PFLT_MESSAGE_NOTIFY, maxconnections: Int): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateCommunicationPort(filter, serverport.toCPointer<ByteVar>(), objectattributes.toCPointer<ByteVar>(), serverportcookie.toCPointer<ByteVar>(), connectnotifycallback.toLong().toCPointer<ByteVar>(), disconnectnotifycallback.toLong().toCPointer<ByteVar>(), messagenotifycallback.toLong().toCPointer<ByteVar>(), maxconnections)

public actual fun FltCreateFile(filter: PFLT_FILTER, instance: PFLT_INSTANCE, filehandle: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: Long, ealength: UInt, flags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateFile(filter, instance, filehandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), iostatusblock.toCPointer<ByteVar>(), allocationsize.toCPointer<ByteVar>(), fileattributes, shareaccess, createdisposition, createoptions, eabuffer.toCPointer<ByteVar>(), ealength, flags)

public actual fun FltCreateFileEx(filter: PFLT_FILTER, instance: PFLT_INSTANCE, filehandle: Long, fileobject: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: Long, ealength: UInt, flags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateFileEx(filter, instance, filehandle.toCPointer<ByteVar>(), fileobject.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), iostatusblock.toCPointer<ByteVar>(), allocationsize.toCPointer<ByteVar>(), fileattributes, shareaccess, createdisposition, createoptions, eabuffer.toCPointer<ByteVar>(), ealength, flags)

public actual fun FltCreateFileEx2(filter: PFLT_FILTER, instance: PFLT_INSTANCE, filehandle: Long, fileobject: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: Long, ealength: UInt, flags: UInt, drivercontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateFileEx2(filter, instance, filehandle.toCPointer<ByteVar>(), fileobject.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), iostatusblock.toCPointer<ByteVar>(), allocationsize.toCPointer<ByteVar>(), fileattributes, shareaccess, createdisposition, createoptions, eabuffer.toCPointer<ByteVar>(), ealength, flags, drivercontext.toCPointer<ByteVar>())

public actual fun FltCreateMailslotFile(filter: PFLT_FILTER, instance: PFLT_INSTANCE, filehandle: Long, fileobject: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, createoptions: UInt, mailslotquota: UInt, maximummessagesize: UInt, readtimeout: Long, drivercontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateMailslotFile(filter, instance, filehandle.toCPointer<ByteVar>(), fileobject.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), iostatusblock.toCPointer<ByteVar>(), createoptions, mailslotquota, maximummessagesize, readtimeout.toCPointer<ByteVar>(), drivercontext.toCPointer<ByteVar>())

public actual fun FltCreateNamedPipeFile(filter: PFLT_FILTER, instance: PFLT_INSTANCE, filehandle: Long, fileobject: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, namedpipetype: UInt, readmode: UInt, completionmode: UInt, maximuminstances: UInt, inboundquota: UInt, outboundquota: UInt, defaulttimeout: Long, drivercontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateNamedPipeFile(filter, instance, filehandle.toCPointer<ByteVar>(), fileobject.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), iostatusblock.toCPointer<ByteVar>(), shareaccess, createdisposition, createoptions, namedpipetype, readmode, completionmode, maximuminstances, inboundquota, outboundquota, defaulttimeout.toCPointer<ByteVar>(), drivercontext.toCPointer<ByteVar>())

public actual fun FltCreateSectionForDataScan(instance: PFLT_INSTANCE, fileobject: Long, sectioncontext: PFLT_CONTEXT, desiredaccess: UInt, objectattributes: Long, maximumsize: Long, sectionpageprotection: UInt, allocationattributes: UInt, flags: UInt, sectionhandle: Long, sectionobject: Long, sectionfilesize: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateSectionForDataScan(instance, fileobject.toCPointer<ByteVar>(), sectioncontext.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), maximumsize.toCPointer<ByteVar>(), sectionpageprotection, allocationattributes, flags, sectionhandle.toCPointer<ByteVar>(), sectionobject.toCPointer<ByteVar>(), sectionfilesize.toCPointer<ByteVar>())

public actual fun FltCreateSystemVolumeInformationFolder(instance: PFLT_INSTANCE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateSystemVolumeInformationFolder(instance)

public actual fun FltCurrentBatchOplock(oplock: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltCurrentBatchOplock(oplock.toCPointer<ByteVar>())

public actual fun FltCurrentOplock(oplock: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltCurrentOplock(oplock.toCPointer<ByteVar>())

public actual fun FltCurrentOplockH(oplock: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltCurrentOplockH(oplock.toCPointer<ByteVar>())

public actual fun FltDecodeParameters(callbackdata: Long, mdladdresspointer: Long, buffer: Long, length: Long, desiredaccess: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltDecodeParameters(callbackdata.toCPointer<ByteVar>(), mdladdresspointer.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), length.toCPointer<ByteVar>(), desiredaccess.toCPointer<ByteVar>())

public actual fun FltDeleteContext(context: PFLT_CONTEXT) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteContext(context.toCPointer<ByteVar>())
}

public actual fun FltDeleteExtraCreateParameterLookasideList(filter: PFLT_FILTER, lookaside: Long, flags: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteExtraCreateParameterLookasideList(filter, lookaside.toCPointer<ByteVar>(), flags)
}

public actual fun FltDeleteFileContext(instance: PFLT_INSTANCE, fileobject: Long, oldcontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteFileContext(instance, fileobject.toCPointer<ByteVar>(), oldcontext.toCPointer<ByteVar>())

public actual fun FltDeleteInstanceContext(instance: PFLT_INSTANCE, oldcontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteInstanceContext(instance, oldcontext.toCPointer<ByteVar>())

public actual fun FltDeletePushLock(pushlock: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltDeletePushLock(pushlock.toCPointer<ByteVar>())
}

public actual fun FltDeleteStreamContext(instance: PFLT_INSTANCE, fileobject: Long, oldcontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteStreamContext(instance, fileobject.toCPointer<ByteVar>(), oldcontext.toCPointer<ByteVar>())

public actual fun FltDeleteStreamHandleContext(instance: PFLT_INSTANCE, fileobject: Long, oldcontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteStreamHandleContext(instance, fileobject.toCPointer<ByteVar>(), oldcontext.toCPointer<ByteVar>())

public actual fun FltDeleteTransactionContext(instance: PFLT_INSTANCE, transaction: Long, oldcontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteTransactionContext(instance, transaction.toCPointer<ByteVar>(), oldcontext.toCPointer<ByteVar>())

public actual fun FltDeleteVolumeContext(filter: PFLT_FILTER, volume: PFLT_VOLUME, oldcontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteVolumeContext(filter, volume, oldcontext.toCPointer<ByteVar>())

public actual fun FltDetachVolume(filter: PFLT_FILTER, volume: PFLT_VOLUME, instancename: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltDetachVolume(filter, volume, instancename.toCPointer<ByteVar>())

public actual fun FltDeviceIoControlFile(instance: PFLT_INSTANCE, fileobject: Long, iocontrolcode: UInt, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt, lengthreturned: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltDeviceIoControlFile(instance, fileobject.toCPointer<ByteVar>(), iocontrolcode, inputbuffer.toCPointer<ByteVar>(), inputbufferlength, outputbuffer.toCPointer<ByteVar>(), outputbufferlength, lengthreturned.toCPointer<ByteVar>())

public actual fun FltDoCompletionProcessingWhenSafe(data: Long, fltobjects: Long, completioncontext: Long, flags: UInt, safepostcallback: PFLT_POST_OPERATION_CALLBACK, retpostoperationstatus: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltDoCompletionProcessingWhenSafe(data.toCPointer<ByteVar>(), fltobjects.toCPointer<ByteVar>(), completioncontext.toCPointer<ByteVar>(), flags, safepostcallback.toLong().toCPointer<ByteVar>(), retpostoperationstatus.toCPointer<ByteVar>())

public actual fun FltEnlistInTransaction(instance: PFLT_INSTANCE, transaction: Long, transactioncontext: PFLT_CONTEXT, notificationmask: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltEnlistInTransaction(instance, transaction.toCPointer<ByteVar>(), transactioncontext.toCPointer<ByteVar>(), notificationmask)

public actual fun FltEnumerateFilterInformation(index: UInt, informationclass: FILTER_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateFilterInformation(index, informationclass, buffer.toCPointer<ByteVar>(), buffersize, bytesreturned.toCPointer<ByteVar>())

public actual fun FltEnumerateFilters(filterlist: Long, filterlistsize: UInt, numberfiltersreturned: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateFilters(filterlist.toCPointer<ByteVar>(), filterlistsize, numberfiltersreturned.toCPointer<ByteVar>())

public actual fun FltEnumerateInstanceInformationByDeviceObject(deviceobject: Long, index: UInt, informationclass: INSTANCE_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateInstanceInformationByDeviceObject(deviceobject.toCPointer<ByteVar>(), index, informationclass, buffer.toCPointer<ByteVar>(), buffersize, bytesreturned.toCPointer<ByteVar>())

public actual fun FltEnumerateInstanceInformationByFilter(filter: PFLT_FILTER, index: UInt, informationclass: INSTANCE_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateInstanceInformationByFilter(filter, index, informationclass, buffer.toCPointer<ByteVar>(), buffersize, bytesreturned.toCPointer<ByteVar>())

public actual fun FltEnumerateInstanceInformationByVolume(volume: PFLT_VOLUME, index: UInt, informationclass: INSTANCE_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateInstanceInformationByVolume(volume, index, informationclass, buffer.toCPointer<ByteVar>(), buffersize, bytesreturned.toCPointer<ByteVar>())

public actual fun FltEnumerateInstanceInformationByVolumeName(volumename: Long, index: UInt, informationclass: INSTANCE_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateInstanceInformationByVolumeName(volumename.toCPointer<ByteVar>(), index, informationclass, buffer.toCPointer<ByteVar>(), buffersize, bytesreturned.toCPointer<ByteVar>())

public actual fun FltEnumerateInstances(volume: PFLT_VOLUME, filter: PFLT_FILTER, instancelist: Long, instancelistsize: UInt, numberinstancesreturned: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateInstances(volume, filter, instancelist.toCPointer<ByteVar>(), instancelistsize, numberinstancesreturned.toCPointer<ByteVar>())

public actual fun FltEnumerateVolumeInformation(filter: PFLT_FILTER, index: UInt, informationclass: FILTER_VOLUME_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateVolumeInformation(filter, index, informationclass, buffer.toCPointer<ByteVar>(), buffersize, bytesreturned.toCPointer<ByteVar>())

public actual fun FltEnumerateVolumes(filter: PFLT_FILTER, volumelist: Long, volumelistsize: UInt, numbervolumesreturned: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateVolumes(filter, volumelist.toCPointer<ByteVar>(), volumelistsize, numbervolumesreturned.toCPointer<ByteVar>())

public actual fun FltFastIoMdlRead(initiatinginstance: PFLT_INSTANCE, fileobject: Long, fileoffset: Long, length: UInt, lockkey: UInt, mdlchain: Long, iostatus: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltFastIoMdlRead(initiatinginstance, fileobject.toCPointer<ByteVar>(), fileoffset.toCPointer<ByteVar>(), length, lockkey, mdlchain.toCPointer<ByteVar>(), iostatus.toCPointer<ByteVar>())

public actual fun FltFastIoMdlReadComplete(initiatinginstance: PFLT_INSTANCE, fileobject: Long, mdlchain: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltFastIoMdlReadComplete(initiatinginstance, fileobject.toCPointer<ByteVar>(), mdlchain.toCPointer<ByteVar>())

public actual fun FltFastIoMdlWriteComplete(initiatinginstance: PFLT_INSTANCE, fileobject: Long, fileoffset: Long, mdlchain: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltFastIoMdlWriteComplete(initiatinginstance, fileobject.toCPointer<ByteVar>(), fileoffset.toCPointer<ByteVar>(), mdlchain.toCPointer<ByteVar>())

public actual fun FltFastIoPrepareMdlWrite(initiatinginstance: PFLT_INSTANCE, fileobject: Long, fileoffset: Long, length: UInt, lockkey: UInt, mdlchain: Long, iostatus: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltFastIoPrepareMdlWrite(initiatinginstance, fileobject.toCPointer<ByteVar>(), fileoffset.toCPointer<ByteVar>(), length, lockkey, mdlchain.toCPointer<ByteVar>(), iostatus.toCPointer<ByteVar>())

public actual fun FltFindExtraCreateParameter(filter: PFLT_FILTER, ecplist: Long, ecptype: Long, ecpcontext: Long, ecpcontextsize: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltFindExtraCreateParameter(filter, ecplist.toCPointer<ByteVar>(), ecptype.toCPointer<ByteVar>(), ecpcontext.toCPointer<ByteVar>(), ecpcontextsize.toCPointer<ByteVar>())

public actual fun FltFlushBuffers(instance: PFLT_INSTANCE, fileobject: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltFlushBuffers(instance, fileobject.toCPointer<ByteVar>())

public actual fun FltFlushBuffers2(instance: PFLT_INSTANCE, fileobject: Long, flushtype: UInt, callbackdata: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltFlushBuffers2(instance, fileobject.toCPointer<ByteVar>(), flushtype, callbackdata.toCPointer<ByteVar>())

public actual fun FltFreeCallbackData(callbackdata: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeCallbackData(callbackdata.toCPointer<ByteVar>())
}

public actual fun FltFreeDeferredIoWorkItem(fltworkitem: PFLT_DEFERRED_IO_WORKITEM) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeDeferredIoWorkItem(fltworkitem)
}

public actual fun FltFreeExtraCreateParameter(filter: PFLT_FILTER, ecpcontext: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeExtraCreateParameter(filter, ecpcontext.toCPointer<ByteVar>())
}

public actual fun FltFreeExtraCreateParameterList(filter: PFLT_FILTER, ecplist: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeExtraCreateParameterList(filter, ecplist.toCPointer<ByteVar>())
}

public actual fun FltFreeFileLock(filelock: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeFileLock(filelock.toCPointer<ByteVar>())
}

public actual fun FltFreeGenericWorkItem(fltworkitem: PFLT_GENERIC_WORKITEM) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeGenericWorkItem(fltworkitem)
}

public actual fun FltFreeOpenReparseList(filter: PFLT_FILTER, ecplist: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeOpenReparseList(filter, ecplist.toCPointer<ByteVar>())
}

public actual fun FltFreePoolAlignedWithTag(instance: PFLT_INSTANCE, buffer: Long, tag: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltFreePoolAlignedWithTag(instance, buffer.toCPointer<ByteVar>(), tag)
}

public actual fun FltFreeSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeSecurityDescriptor(securitydescriptor.toCPointer<ByteVar>())
}

public actual fun FltFsControlFile(instance: PFLT_INSTANCE, fileobject: Long, fscontrolcode: UInt, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt, lengthreturned: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltFsControlFile(instance, fileobject.toCPointer<ByteVar>(), fscontrolcode, inputbuffer.toCPointer<ByteVar>(), inputbufferlength, outputbuffer.toCPointer<ByteVar>(), outputbufferlength, lengthreturned.toCPointer<ByteVar>())

public actual fun FltGetActivityIdCallbackData(callbackdata: Long, guid: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetActivityIdCallbackData(callbackdata.toCPointer<ByteVar>(), guid.toCPointer<ByteVar>())

public actual fun FltGetBottomInstance(volume: PFLT_VOLUME, instance: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetBottomInstance(volume, instance.toCPointer<ByteVar>())

public actual fun FltGetContexts(fltobjects: Long, desiredcontexts: UShort, contexts: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetContexts(fltobjects.toCPointer<ByteVar>(), desiredcontexts, contexts.toCPointer<ByteVar>())
}

public actual fun FltGetContextsEx(fltobjects: Long, desiredcontexts: UShort, contextssize: ULong, contexts: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetContextsEx(fltobjects.toCPointer<ByteVar>(), desiredcontexts, contextssize, contexts.toCPointer<ByteVar>())

public actual fun FltGetDestinationFileNameInformation(instance: PFLT_INSTANCE, fileobject: Long, rootdirectory: HANDLE, filename: PCWSTR, filenamelength: UInt, nameoptions: UInt, retfilenameinformation: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetDestinationFileNameInformation(instance, fileobject.toCPointer<ByteVar>(), rootdirectory.toCPointer<ByteVar>(), filename.toCPointer<ByteVar>(), filenamelength, nameoptions, retfilenameinformation.toCPointer<ByteVar>())

public actual fun FltGetDeviceObject(volume: PFLT_VOLUME, deviceobject: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetDeviceObject(volume, deviceobject.toCPointer<ByteVar>())

public actual fun FltGetDiskDeviceObject(volume: PFLT_VOLUME, diskdeviceobject: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetDiskDeviceObject(volume, diskdeviceobject.toCPointer<ByteVar>())

public actual fun FltGetEcpListFromCallbackData(filter: PFLT_FILTER, callbackdata: Long, ecplist: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetEcpListFromCallbackData(filter, callbackdata.toCPointer<ByteVar>(), ecplist.toCPointer<ByteVar>())

public actual fun FltGetFileContext(instance: PFLT_INSTANCE, fileobject: Long, context: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFileContext(instance, fileobject.toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun FltGetFileNameInformation(callbackdata: Long, nameoptions: UInt, filenameinformation: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFileNameInformation(callbackdata.toCPointer<ByteVar>(), nameoptions, filenameinformation.toCPointer<ByteVar>())

public actual fun FltGetFileNameInformationUnsafe(fileobject: Long, instance: PFLT_INSTANCE, nameoptions: UInt, filenameinformation: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFileNameInformationUnsafe(fileobject.toCPointer<ByteVar>(), instance, nameoptions, filenameinformation.toCPointer<ByteVar>())

public actual fun FltGetFileSystemType(fltobject: Long, filesystemtype: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFileSystemType(fltobject.toCPointer<ByteVar>(), filesystemtype.toCPointer<ByteVar>())

public actual fun FltGetFilterFromInstance(instance: PFLT_INSTANCE, retfilter: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFilterFromInstance(instance, retfilter.toCPointer<ByteVar>())

public actual fun FltGetFilterFromName(filtername: Long, retfilter: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFilterFromName(filtername.toCPointer<ByteVar>(), retfilter.toCPointer<ByteVar>())

public actual fun FltGetFilterInformation(filter: PFLT_FILTER, informationclass: FILTER_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFilterInformation(filter, informationclass, buffer.toCPointer<ByteVar>(), buffersize, bytesreturned.toCPointer<ByteVar>())

public actual fun FltGetFsZeroingOffset(data: Long, zeroingoffset: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFsZeroingOffset(data.toCPointer<ByteVar>(), zeroingoffset.toCPointer<ByteVar>())

public actual fun FltGetInstanceContext(instance: PFLT_INSTANCE, context: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetInstanceContext(instance, context.toCPointer<ByteVar>())

public actual fun FltGetInstanceInformation(instance: PFLT_INSTANCE, informationclass: INSTANCE_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetInstanceInformation(instance, informationclass, buffer.toCPointer<ByteVar>(), buffersize, bytesreturned.toCPointer<ByteVar>())

public actual fun FltGetIoAttributionHandleFromCallbackData(data: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIoAttributionHandleFromCallbackData(data.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun FltGetIoPriorityHint(data: Long): IO_PRIORITY_HINT =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIoPriorityHint(data.toCPointer<ByteVar>())

public actual fun FltGetIoPriorityHintFromCallbackData(data: Long): IO_PRIORITY_HINT =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIoPriorityHintFromCallbackData(data.toCPointer<ByteVar>())

public actual fun FltGetIoPriorityHintFromFileObject(fileobject: Long): IO_PRIORITY_HINT =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIoPriorityHintFromFileObject(fileobject.toCPointer<ByteVar>())

public actual fun FltGetIoPriorityHintFromThread(thread: PETHREAD): IO_PRIORITY_HINT =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIoPriorityHintFromThread(thread)

public actual fun FltGetIrpName(irpmajorcode: UByte): PSTR =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIrpName(irpmajorcode)?.toLong() ?: 0L

public actual fun FltGetLowerInstance(currentinstance: PFLT_INSTANCE, lowerinstance: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetLowerInstance(currentinstance, lowerinstance.toCPointer<ByteVar>())

public actual fun FltGetNewSystemBufferAddress(callbackdata: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetNewSystemBufferAddress(callbackdata.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun FltGetNextExtraCreateParameter(filter: PFLT_FILTER, ecplist: Long, currentecpcontext: Long, nextecptype: Long, nextecpcontext: Long, nextecpcontextsize: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetNextExtraCreateParameter(filter, ecplist.toCPointer<ByteVar>(), currentecpcontext.toCPointer<ByteVar>(), nextecptype.toCPointer<ByteVar>(), nextecpcontext.toCPointer<ByteVar>(), nextecpcontextsize.toCPointer<ByteVar>())

public actual fun FltGetRequestorProcess(callbackdata: Long): PEPROCESS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetRequestorProcess(callbackdata.toCPointer<ByteVar>())

public actual fun FltGetRequestorProcessId(callbackdata: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetRequestorProcessId(callbackdata.toCPointer<ByteVar>())

public actual fun FltGetRequestorProcessIdEx(callbackdata: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetRequestorProcessIdEx(callbackdata.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun FltGetRequestorSessionId(callbackdata: Long, sessionid: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetRequestorSessionId(callbackdata.toCPointer<ByteVar>(), sessionid.toCPointer<ByteVar>())

public actual fun FltGetRoutineAddress(fltmgrroutinename: PCSTR): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetRoutineAddress(fltmgrroutinename.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun FltGetSectionContext(instance: PFLT_INSTANCE, fileobject: Long, context: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetSectionContext(instance, fileobject.toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun FltGetStreamContext(instance: PFLT_INSTANCE, fileobject: Long, context: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetStreamContext(instance, fileobject.toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun FltGetStreamHandleContext(instance: PFLT_INSTANCE, fileobject: Long, context: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetStreamHandleContext(instance, fileobject.toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun FltGetSwappedBufferMdlAddress(callbackdata: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetSwappedBufferMdlAddress(callbackdata.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun FltGetTopInstance(volume: PFLT_VOLUME, instance: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetTopInstance(volume, instance.toCPointer<ByteVar>())

public actual fun FltGetTransactionContext(instance: PFLT_INSTANCE, transaction: Long, context: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetTransactionContext(instance, transaction.toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun FltGetTunneledName(callbackdata: Long, filenameinformation: Long, rettunneledfilenameinformation: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetTunneledName(callbackdata.toCPointer<ByteVar>(), filenameinformation.toCPointer<ByteVar>(), rettunneledfilenameinformation.toCPointer<ByteVar>())

public actual fun FltGetUpperInstance(currentinstance: PFLT_INSTANCE, upperinstance: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetUpperInstance(currentinstance, upperinstance.toCPointer<ByteVar>())

public actual fun FltGetVolumeContext(filter: PFLT_FILTER, volume: PFLT_VOLUME, context: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeContext(filter, volume, context.toCPointer<ByteVar>())

public actual fun FltGetVolumeFromDeviceObject(filter: PFLT_FILTER, deviceobject: Long, retvolume: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeFromDeviceObject(filter, deviceobject.toCPointer<ByteVar>(), retvolume.toCPointer<ByteVar>())

public actual fun FltGetVolumeFromFileObject(filter: PFLT_FILTER, fileobject: Long, retvolume: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeFromFileObject(filter, fileobject.toCPointer<ByteVar>(), retvolume.toCPointer<ByteVar>())

public actual fun FltGetVolumeFromInstance(instance: PFLT_INSTANCE, retvolume: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeFromInstance(instance, retvolume.toCPointer<ByteVar>())

public actual fun FltGetVolumeFromName(filter: PFLT_FILTER, volumename: Long, retvolume: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeFromName(filter, volumename.toCPointer<ByteVar>(), retvolume.toCPointer<ByteVar>())

public actual fun FltGetVolumeGuidName(volume: PFLT_VOLUME, volumeguidname: Long, buffersizeneeded: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeGuidName(volume, volumeguidname.toCPointer<ByteVar>(), buffersizeneeded.toCPointer<ByteVar>())

public actual fun FltGetVolumeInformation(volume: PFLT_VOLUME, informationclass: FILTER_VOLUME_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeInformation(volume, informationclass, buffer.toCPointer<ByteVar>(), buffersize, bytesreturned.toCPointer<ByteVar>())

public actual fun FltGetVolumeInstanceFromName(filter: PFLT_FILTER, volume: PFLT_VOLUME, instancename: Long, retinstance: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeInstanceFromName(filter, volume, instancename.toCPointer<ByteVar>(), retinstance.toCPointer<ByteVar>())

public actual fun FltGetVolumeName(volume: PFLT_VOLUME, volumename: Long, buffersizeneeded: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeName(volume, volumename.toCPointer<ByteVar>(), buffersizeneeded.toCPointer<ByteVar>())

public actual fun FltGetVolumeProperties(volume: PFLT_VOLUME, volumeproperties: Long, volumepropertieslength: UInt, lengthreturned: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeProperties(volume, volumeproperties.toCPointer<ByteVar>(), volumepropertieslength, lengthreturned.toCPointer<ByteVar>())

public actual fun FltInitExtraCreateParameterLookasideList(filter: PFLT_FILTER, lookaside: Long, flags: UInt, size: ULong, tag: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltInitExtraCreateParameterLookasideList(filter, lookaside.toCPointer<ByteVar>(), flags, size, tag)
}

public actual fun FltInitializeFileLock(filelock: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltInitializeFileLock(filelock.toCPointer<ByteVar>())
}

public actual fun FltInitializeOplock(oplock: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltInitializeOplock(oplock.toCPointer<ByteVar>())
}

public actual fun FltInitializePushLock(pushlock: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltInitializePushLock(pushlock.toCPointer<ByteVar>())
}

public actual fun FltInsertExtraCreateParameter(filter: PFLT_FILTER, ecplist: Long, ecpcontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltInsertExtraCreateParameter(filter, ecplist.toCPointer<ByteVar>(), ecpcontext.toCPointer<ByteVar>())

public actual fun FltIs32bitProcess(callbackdata: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltIs32bitProcess(callbackdata.toCPointer<ByteVar>())

public actual fun FltIsCallbackDataDirty(data: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltIsCallbackDataDirty(data.toCPointer<ByteVar>())

public actual fun FltIsDirectory(fileobject: Long, instance: PFLT_INSTANCE, isdirectory: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltIsDirectory(fileobject.toCPointer<ByteVar>(), instance, isdirectory.toCPointer<ByteVar>())

public actual fun FltIsEcpAcknowledged(filter: PFLT_FILTER, ecpcontext: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltIsEcpAcknowledged(filter, ecpcontext.toCPointer<ByteVar>())

public actual fun FltIsEcpFromUserMode(filter: PFLT_FILTER, ecpcontext: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltIsEcpFromUserMode(filter, ecpcontext.toCPointer<ByteVar>())

public actual fun FltIsFltMgrVolumeDeviceObject(deviceobject: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltIsFltMgrVolumeDeviceObject(deviceobject.toCPointer<ByteVar>())

public actual fun FltIsIoCanceled(callbackdata: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltIsIoCanceled(callbackdata.toCPointer<ByteVar>())

public actual fun FltIsIoRedirectionAllowed(sourceinstance: PFLT_INSTANCE, targetinstance: PFLT_INSTANCE, redirectionallowed: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltIsIoRedirectionAllowed(sourceinstance, targetinstance, redirectionallowed.toCPointer<ByteVar>())

public actual fun FltIsIoRedirectionAllowedForOperation(data: Long, targetinstance: PFLT_INSTANCE, redirectionallowedthisio: Long, redirectionallowedallio: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltIsIoRedirectionAllowedForOperation(data.toCPointer<ByteVar>(), targetinstance, redirectionallowedthisio.toCPointer<ByteVar>(), redirectionallowedallio.toCPointer<ByteVar>())

public actual fun FltIsOperationSynchronous(callbackdata: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltIsOperationSynchronous(callbackdata.toCPointer<ByteVar>())

public actual fun FltIsVolumeSnapshot(fltobject: Long, issnapshotvolume: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltIsVolumeSnapshot(fltobject.toCPointer<ByteVar>(), issnapshotvolume.toCPointer<ByteVar>())

public actual fun FltIsVolumeWritable(fltobject: Long, iswritable: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltIsVolumeWritable(fltobject.toCPointer<ByteVar>(), iswritable.toCPointer<ByteVar>())

public actual fun FltLoadFilter(filtername: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltLoadFilter(filtername.toCPointer<ByteVar>())

public actual fun FltLockUserBuffer(callbackdata: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltLockUserBuffer(callbackdata.toCPointer<ByteVar>())

public actual fun FltNotifyFilterChangeDirectory(notifysync: PNOTIFY_SYNC, notifylist: Long, fscontext: Long, fulldirectoryname: Long, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifycallbackdata: Long, traversecallback: PCHECK_FOR_TRAVERSE_ACCESS, subjectcontext: Long, filtercallback: PFILTER_REPORT_CHANGE) {
}

public actual fun FltObjectDereference(fltobject: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltObjectDereference(fltobject.toCPointer<ByteVar>())
}

public actual fun FltObjectReference(fltobject: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltObjectReference(fltobject.toCPointer<ByteVar>())

public actual fun FltOpenVolume(instance: PFLT_INSTANCE, volumehandle: Long, volumefileobject: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltOpenVolume(instance, volumehandle.toCPointer<ByteVar>(), volumefileobject.toCPointer<ByteVar>())

public actual fun FltOplockBreakH(oplock: Long, callbackdata: Long, flags: UInt, context: Long, waitcompletionroutine: PFLTOPLOCK_WAIT_COMPLETE_ROUTINE, prepostcallbackdataroutine: PFLTOPLOCK_PREPOST_CALLBACKDATA_ROUTINE): FLT_PREOP_CALLBACK_STATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockBreakH(oplock.toCPointer<ByteVar>(), callbackdata.toCPointer<ByteVar>(), flags, context.toCPointer<ByteVar>(), waitcompletionroutine.toLong().toCPointer<ByteVar>(), prepostcallbackdataroutine.toLong().toCPointer<ByteVar>())

public actual fun FltOplockBreakToNone(oplock: Long, callbackdata: Long, context: Long, waitcompletionroutine: PFLTOPLOCK_WAIT_COMPLETE_ROUTINE, prepostcallbackdataroutine: PFLTOPLOCK_PREPOST_CALLBACKDATA_ROUTINE): FLT_PREOP_CALLBACK_STATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockBreakToNone(oplock.toCPointer<ByteVar>(), callbackdata.toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), waitcompletionroutine.toLong().toCPointer<ByteVar>(), prepostcallbackdataroutine.toLong().toCPointer<ByteVar>())

public actual fun FltOplockBreakToNoneEx(oplock: Long, callbackdata: Long, flags: UInt, context: Long, waitcompletionroutine: PFLTOPLOCK_WAIT_COMPLETE_ROUTINE, prepostcallbackdataroutine: PFLTOPLOCK_PREPOST_CALLBACKDATA_ROUTINE): FLT_PREOP_CALLBACK_STATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockBreakToNoneEx(oplock.toCPointer<ByteVar>(), callbackdata.toCPointer<ByteVar>(), flags, context.toCPointer<ByteVar>(), waitcompletionroutine.toLong().toCPointer<ByteVar>(), prepostcallbackdataroutine.toLong().toCPointer<ByteVar>())

public actual fun FltOplockFsctrl(oplock: Long, callbackdata: Long, opencount: UInt): FLT_PREOP_CALLBACK_STATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockFsctrl(oplock.toCPointer<ByteVar>(), callbackdata.toCPointer<ByteVar>(), opencount)

public actual fun FltOplockFsctrlEx(oplock: Long, callbackdata: Long, opencount: UInt, flags: UInt): FLT_PREOP_CALLBACK_STATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockFsctrlEx(oplock.toCPointer<ByteVar>(), callbackdata.toCPointer<ByteVar>(), opencount, flags)

public actual fun FltOplockIsFastIoPossible(oplock: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockIsFastIoPossible(oplock.toCPointer<ByteVar>())

public actual fun FltOplockIsSharedRequest(callbackdata: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockIsSharedRequest(callbackdata.toCPointer<ByteVar>())

public actual fun FltOplockKeysEqual(fo1: Long, fo2: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockKeysEqual(fo1.toCPointer<ByteVar>(), fo2.toCPointer<ByteVar>())

public actual fun FltParseFileName(filename: Long, extension: Long, stream: Long, finalcomponent: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltParseFileName(filename.toCPointer<ByteVar>(), extension.toCPointer<ByteVar>(), stream.toCPointer<ByteVar>(), finalcomponent.toCPointer<ByteVar>())

public actual fun FltParseFileNameInformation(filenameinformation: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltParseFileNameInformation(filenameinformation.toCPointer<ByteVar>())

public actual fun FltPerformAsynchronousIo(callbackdata: Long, callbackroutine: PFLT_COMPLETED_ASYNC_IO_CALLBACK, callbackcontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltPerformAsynchronousIo(callbackdata.toCPointer<ByteVar>(), callbackroutine.toLong().toCPointer<ByteVar>(), callbackcontext.toCPointer<ByteVar>())

public actual fun FltPerformSynchronousIo(callbackdata: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltPerformSynchronousIo(callbackdata.toCPointer<ByteVar>())
}

public actual fun FltPrePrepareComplete(instance: PFLT_INSTANCE, transaction: Long, transactioncontext: PFLT_CONTEXT): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltPrePrepareComplete(instance, transaction.toCPointer<ByteVar>(), transactioncontext.toCPointer<ByteVar>())

public actual fun FltPrepareComplete(instance: PFLT_INSTANCE, transaction: Long, transactioncontext: PFLT_CONTEXT): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltPrepareComplete(instance, transaction.toCPointer<ByteVar>(), transactioncontext.toCPointer<ByteVar>())

public actual fun FltPrepareToReuseEcp(filter: PFLT_FILTER, ecpcontext: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltPrepareToReuseEcp(filter, ecpcontext.toCPointer<ByteVar>())
}

public actual fun FltProcessFileLock(filelock: Long, callbackdata: Long, context: Long): FLT_PREOP_CALLBACK_STATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltProcessFileLock(filelock.toCPointer<ByteVar>(), callbackdata.toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun FltPropagateActivityIdToThread(callbackdata: Long, propagateid: Long, originalid: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltPropagateActivityIdToThread(callbackdata.toCPointer<ByteVar>(), propagateid.toCPointer<ByteVar>(), originalid.toCPointer<ByteVar>())

public actual fun FltPropagateIrpExtension(sourcedata: Long, targetdata: Long, flags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltPropagateIrpExtension(sourcedata.toCPointer<ByteVar>(), targetdata.toCPointer<ByteVar>(), flags)

public actual fun FltPurgeFileNameInformationCache(instance: PFLT_INSTANCE, fileobject: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltPurgeFileNameInformationCache(instance, fileobject.toCPointer<ByteVar>())

public actual fun FltQueryDirectoryFile(instance: PFLT_INSTANCE, fileobject: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, returnsingleentry: Boolean, filename: Long, restartscan: Boolean, lengthreturned: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryDirectoryFile(instance, fileobject.toCPointer<ByteVar>(), fileinformation.toCPointer<ByteVar>(), length, fileinformationclass, returnsingleentry, filename.toCPointer<ByteVar>(), restartscan, lengthreturned.toCPointer<ByteVar>())

public actual fun FltQueryDirectoryFileEx(instance: PFLT_INSTANCE, fileobject: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, queryflags: UInt, filename: Long, lengthreturned: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryDirectoryFileEx(instance, fileobject.toCPointer<ByteVar>(), fileinformation.toCPointer<ByteVar>(), length, fileinformationclass, queryflags, filename.toCPointer<ByteVar>(), lengthreturned.toCPointer<ByteVar>())

public actual fun FltQueryEaFile(instance: PFLT_INSTANCE, fileobject: Long, returnedeadata: Long, length: UInt, returnsingleentry: Boolean, ealist: Long, ealistlength: UInt, eaindex: Long, restartscan: Boolean, lengthreturned: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryEaFile(instance, fileobject.toCPointer<ByteVar>(), returnedeadata.toCPointer<ByteVar>(), length, returnsingleentry, ealist.toCPointer<ByteVar>(), ealistlength, eaindex.toCPointer<ByteVar>(), restartscan, lengthreturned.toCPointer<ByteVar>())

public actual fun FltQueryInformationByName(filter: PFLT_FILTER, instance: PFLT_INSTANCE, objectattributes: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, drivercontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryInformationByName(filter, instance, objectattributes.toCPointer<ByteVar>(), iostatusblock.toCPointer<ByteVar>(), fileinformation.toCPointer<ByteVar>(), length, fileinformationclass, drivercontext.toCPointer<ByteVar>())

public actual fun FltQueryInformationFile(instance: PFLT_INSTANCE, fileobject: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, lengthreturned: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryInformationFile(instance, fileobject.toCPointer<ByteVar>(), fileinformation.toCPointer<ByteVar>(), length, fileinformationclass, lengthreturned.toCPointer<ByteVar>())

public actual fun FltQueryQuotaInformationFile(instance: PFLT_INSTANCE, fileobject: Long, iostatusblock: Long, buffer: Long, length: UInt, returnsingleentry: Boolean, sidlist: Long, sidlistlength: UInt, startsid: Long, restartscan: Boolean, lengthreturned: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryQuotaInformationFile(instance, fileobject.toCPointer<ByteVar>(), iostatusblock.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), length, returnsingleentry, sidlist.toCPointer<ByteVar>(), sidlistlength, startsid.toCPointer<ByteVar>(), restartscan, lengthreturned.toCPointer<ByteVar>())

public actual fun FltQuerySecurityObject(instance: PFLT_INSTANCE, fileobject: Long, securityinformation: UInt, securitydescriptor: PSECURITY_DESCRIPTOR, length: UInt, lengthneeded: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltQuerySecurityObject(instance, fileobject.toCPointer<ByteVar>(), securityinformation, securitydescriptor.toCPointer<ByteVar>(), length, lengthneeded.toCPointer<ByteVar>())

public actual fun FltQueryVolumeInformation(instance: PFLT_INSTANCE, iosb: Long, fsinformation: Long, length: UInt, fsinformationclass: FS_INFORMATION_CLASS): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryVolumeInformation(instance, iosb.toCPointer<ByteVar>(), fsinformation.toCPointer<ByteVar>(), length, fsinformationclass)

public actual fun FltQueryVolumeInformationFile(instance: PFLT_INSTANCE, fileobject: Long, fsinformation: Long, length: UInt, fsinformationclass: FS_INFORMATION_CLASS, lengthreturned: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryVolumeInformationFile(instance, fileobject.toCPointer<ByteVar>(), fsinformation.toCPointer<ByteVar>(), length, fsinformationclass, lengthreturned.toCPointer<ByteVar>())

public actual fun FltQueueDeferredIoWorkItem(fltworkitem: PFLT_DEFERRED_IO_WORKITEM, data: Long, workerroutine: PFLT_DEFERRED_IO_WORKITEM_ROUTINE, queuetype: WORK_QUEUE_TYPE, context: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltQueueDeferredIoWorkItem(fltworkitem, data.toCPointer<ByteVar>(), workerroutine.toLong().toCPointer<ByteVar>(), queuetype, context.toCPointer<ByteVar>())

public actual fun FltQueueGenericWorkItem(fltworkitem: PFLT_GENERIC_WORKITEM, fltobject: Long, workerroutine: PFLT_GENERIC_WORKITEM_ROUTINE, queuetype: WORK_QUEUE_TYPE, context: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltQueueGenericWorkItem(fltworkitem, fltobject.toCPointer<ByteVar>(), workerroutine.toLong().toCPointer<ByteVar>(), queuetype, context.toCPointer<ByteVar>())

public actual fun FltReadFile(initiatinginstance: PFLT_INSTANCE, fileobject: Long, byteoffset: Long, length: UInt, buffer: Long, flags: UInt, bytesread: Long, callbackroutine: PFLT_COMPLETED_ASYNC_IO_CALLBACK, callbackcontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltReadFile(initiatinginstance, fileobject.toCPointer<ByteVar>(), byteoffset.toCPointer<ByteVar>(), length, buffer.toCPointer<ByteVar>(), flags, bytesread.toCPointer<ByteVar>(), callbackroutine.toLong().toCPointer<ByteVar>(), callbackcontext.toCPointer<ByteVar>())

public actual fun FltReadFileEx(initiatinginstance: PFLT_INSTANCE, fileobject: Long, byteoffset: Long, length: UInt, buffer: Long, flags: UInt, bytesread: Long, callbackroutine: PFLT_COMPLETED_ASYNC_IO_CALLBACK, callbackcontext: Long, key: Long, mdl: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltReadFileEx(initiatinginstance, fileobject.toCPointer<ByteVar>(), byteoffset.toCPointer<ByteVar>(), length, buffer.toCPointer<ByteVar>(), flags, bytesread.toCPointer<ByteVar>(), callbackroutine.toLong().toCPointer<ByteVar>(), callbackcontext.toCPointer<ByteVar>(), key.toCPointer<ByteVar>(), mdl.toCPointer<ByteVar>())

public actual fun FltReferenceContext(context: PFLT_CONTEXT) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltReferenceContext(context.toCPointer<ByteVar>())
}

public actual fun FltReferenceFileNameInformation(filenameinformation: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltReferenceFileNameInformation(filenameinformation.toCPointer<ByteVar>())
}

public actual fun FltRegisterFilter(driver: Long, registration: Long, retfilter: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltRegisterFilter(driver.toCPointer<ByteVar>(), registration.toCPointer<ByteVar>(), retfilter.toCPointer<ByteVar>())

public actual fun FltRegisterForDataScan(instance: PFLT_INSTANCE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltRegisterForDataScan(instance)

public actual fun FltReissueSynchronousIo(initiatinginstance: PFLT_INSTANCE, callbackdata: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltReissueSynchronousIo(initiatinginstance, callbackdata.toCPointer<ByteVar>())
}

public actual fun FltReleaseContext(context: PFLT_CONTEXT) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltReleaseContext(context.toCPointer<ByteVar>())
}

public actual fun FltReleaseContexts(contexts: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltReleaseContexts(contexts.toCPointer<ByteVar>())
}

public actual fun FltReleaseContextsEx(contextssize: ULong, contexts: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltReleaseContextsEx(contextssize, contexts.toCPointer<ByteVar>())
}

public actual fun FltReleaseFileNameInformation(filenameinformation: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltReleaseFileNameInformation(filenameinformation.toCPointer<ByteVar>())
}

public actual fun FltReleasePushLock(pushlock: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltReleasePushLock(pushlock.toCPointer<ByteVar>())
}

public actual fun FltReleasePushLockEx(pushlock: Long, flags: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltReleasePushLockEx(pushlock.toCPointer<ByteVar>(), flags)
}

public actual fun FltReleaseResource(resource: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltReleaseResource(resource.toCPointer<ByteVar>())
}

public actual fun FltRemoveExtraCreateParameter(filter: PFLT_FILTER, ecplist: Long, ecptype: Long, ecpcontext: Long, ecpcontextsize: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltRemoveExtraCreateParameter(filter, ecplist.toCPointer<ByteVar>(), ecptype.toCPointer<ByteVar>(), ecpcontext.toCPointer<ByteVar>(), ecpcontextsize.toCPointer<ByteVar>())

public actual fun FltRemoveOpenReparseEntry(filter: PFLT_FILTER, data: Long, openreparseentry: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltRemoveOpenReparseEntry(filter, data.toCPointer<ByteVar>(), openreparseentry.toCPointer<ByteVar>())
}

public actual fun FltRequestFileInfoOnCreateCompletion(filter: PFLT_FILTER, data: Long, infoclassflags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltRequestFileInfoOnCreateCompletion(filter, data.toCPointer<ByteVar>(), infoclassflags)

public actual fun FltRequestOperationStatusCallback(data: Long, callbackroutine: PFLT_GET_OPERATION_STATUS_CALLBACK, requestercontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltRequestOperationStatusCallback(data.toCPointer<ByteVar>(), callbackroutine.toLong().toCPointer<ByteVar>(), requestercontext.toCPointer<ByteVar>())

public actual fun FltRetainSwappedBufferMdlAddress(callbackdata: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltRetainSwappedBufferMdlAddress(callbackdata.toCPointer<ByteVar>())
}

public actual fun FltRetrieveFileInfoOnCreateCompletion(filter: PFLT_FILTER, data: Long, infoclass: UInt, size: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltRetrieveFileInfoOnCreateCompletion(filter, data.toCPointer<ByteVar>(), infoclass, size.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun FltRetrieveFileInfoOnCreateCompletionEx(filter: PFLT_FILTER, data: Long, infoclass: UInt, retinfosize: Long, retinfobuffer: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltRetrieveFileInfoOnCreateCompletionEx(filter, data.toCPointer<ByteVar>(), infoclass, retinfosize.toCPointer<ByteVar>(), retinfobuffer.toCPointer<ByteVar>())

public actual fun FltRetrieveIoPriorityInfo(data: Long, fileobject: Long, thread: PETHREAD, priorityinfo: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltRetrieveIoPriorityInfo(data.toCPointer<ByteVar>(), fileobject.toCPointer<ByteVar>(), thread, priorityinfo.toCPointer<ByteVar>())

public actual fun FltReuseCallbackData(callbackdata: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltReuseCallbackData(callbackdata.toCPointer<ByteVar>())
}

public actual fun FltRollbackComplete(instance: PFLT_INSTANCE, transaction: Long, transactioncontext: PFLT_CONTEXT): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltRollbackComplete(instance, transaction.toCPointer<ByteVar>(), transactioncontext.toCPointer<ByteVar>())

public actual fun FltRollbackEnlistment(instance: PFLT_INSTANCE, transaction: Long, transactioncontext: PFLT_CONTEXT): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltRollbackEnlistment(instance, transaction.toCPointer<ByteVar>(), transactioncontext.toCPointer<ByteVar>())

public actual fun FltSendMessage(filter: PFLT_FILTER, clientport: Long, senderbuffer: Long, senderbufferlength: UInt, replybuffer: Long, replylength: Long, timeout: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltSendMessage(filter, clientport.toCPointer<ByteVar>(), senderbuffer.toCPointer<ByteVar>(), senderbufferlength, replybuffer.toCPointer<ByteVar>(), replylength.toCPointer<ByteVar>(), timeout.toCPointer<ByteVar>())

public actual fun FltSetActivityIdCallbackData(callbackdata: Long, guid: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetActivityIdCallbackData(callbackdata.toCPointer<ByteVar>(), guid.toCPointer<ByteVar>())

public actual fun FltSetCallbackDataDirty(data: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetCallbackDataDirty(data.toCPointer<ByteVar>())
}

public actual fun FltSetCancelCompletion(callbackdata: Long, canceledcallback: PFLT_COMPLETE_CANCELED_CALLBACK): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetCancelCompletion(callbackdata.toCPointer<ByteVar>(), canceledcallback.toLong().toCPointer<ByteVar>())

public actual fun FltSetEaFile(instance: PFLT_INSTANCE, fileobject: Long, eabuffer: Long, length: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetEaFile(instance, fileobject.toCPointer<ByteVar>(), eabuffer.toCPointer<ByteVar>(), length)

public actual fun FltSetEcpListIntoCallbackData(filter: PFLT_FILTER, callbackdata: Long, ecplist: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetEcpListIntoCallbackData(filter, callbackdata.toCPointer<ByteVar>(), ecplist.toCPointer<ByteVar>())

public actual fun FltSetFileContext(instance: PFLT_INSTANCE, fileobject: Long, operation: FLT_SET_CONTEXT_OPERATION, newcontext: PFLT_CONTEXT, oldcontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetFileContext(instance, fileobject.toCPointer<ByteVar>(), operation, newcontext.toCPointer<ByteVar>(), oldcontext.toCPointer<ByteVar>())

public actual fun FltSetFsZeroingOffset(data: Long, zeroingoffset: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetFsZeroingOffset(data.toCPointer<ByteVar>(), zeroingoffset)

public actual fun FltSetFsZeroingOffsetRequired(data: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetFsZeroingOffsetRequired(data.toCPointer<ByteVar>())

public actual fun FltSetInformationFile(instance: PFLT_INSTANCE, fileobject: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetInformationFile(instance, fileobject.toCPointer<ByteVar>(), fileinformation.toCPointer<ByteVar>(), length, fileinformationclass)

public actual fun FltSetInstanceContext(instance: PFLT_INSTANCE, operation: FLT_SET_CONTEXT_OPERATION, newcontext: PFLT_CONTEXT, oldcontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetInstanceContext(instance, operation, newcontext.toCPointer<ByteVar>(), oldcontext.toCPointer<ByteVar>())

public actual fun FltSetIoPriorityHintIntoCallbackData(data: Long, priorityhint: IO_PRIORITY_HINT): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetIoPriorityHintIntoCallbackData(data.toCPointer<ByteVar>(), priorityhint)

public actual fun FltSetIoPriorityHintIntoFileObject(fileobject: Long, priorityhint: IO_PRIORITY_HINT): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetIoPriorityHintIntoFileObject(fileobject.toCPointer<ByteVar>(), priorityhint)

public actual fun FltSetIoPriorityHintIntoThread(thread: PETHREAD, priorityhint: IO_PRIORITY_HINT): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetIoPriorityHintIntoThread(thread, priorityhint)

public actual fun FltSetQuotaInformationFile(instance: PFLT_INSTANCE, fileobject: Long, buffer: Long, length: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetQuotaInformationFile(instance, fileobject.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), length)

public actual fun FltSetSecurityObject(instance: PFLT_INSTANCE, fileobject: Long, securityinformation: UInt, securitydescriptor: PSECURITY_DESCRIPTOR): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetSecurityObject(instance, fileobject.toCPointer<ByteVar>(), securityinformation, securitydescriptor.toCPointer<ByteVar>())

public actual fun FltSetStreamContext(instance: PFLT_INSTANCE, fileobject: Long, operation: FLT_SET_CONTEXT_OPERATION, newcontext: PFLT_CONTEXT, oldcontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetStreamContext(instance, fileobject.toCPointer<ByteVar>(), operation, newcontext.toCPointer<ByteVar>(), oldcontext.toCPointer<ByteVar>())

public actual fun FltSetStreamHandleContext(instance: PFLT_INSTANCE, fileobject: Long, operation: FLT_SET_CONTEXT_OPERATION, newcontext: PFLT_CONTEXT, oldcontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetStreamHandleContext(instance, fileobject.toCPointer<ByteVar>(), operation, newcontext.toCPointer<ByteVar>(), oldcontext.toCPointer<ByteVar>())

public actual fun FltSetTransactionContext(instance: PFLT_INSTANCE, transaction: Long, operation: FLT_SET_CONTEXT_OPERATION, newcontext: PFLT_CONTEXT, oldcontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetTransactionContext(instance, transaction.toCPointer<ByteVar>(), operation, newcontext.toCPointer<ByteVar>(), oldcontext.toCPointer<ByteVar>())

public actual fun FltSetVolumeContext(volume: PFLT_VOLUME, operation: FLT_SET_CONTEXT_OPERATION, newcontext: PFLT_CONTEXT, oldcontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetVolumeContext(volume, operation, newcontext.toCPointer<ByteVar>(), oldcontext.toCPointer<ByteVar>())

public actual fun FltSetVolumeInformation(instance: PFLT_INSTANCE, iosb: Long, fsinformation: Long, length: UInt, fsinformationclass: FS_INFORMATION_CLASS): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetVolumeInformation(instance, iosb.toCPointer<ByteVar>(), fsinformation.toCPointer<ByteVar>(), length, fsinformationclass)

public actual fun FltStartFiltering(filter: PFLT_FILTER): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltStartFiltering(filter)

public actual fun FltSupportsFileContexts(fileobject: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltSupportsFileContexts(fileobject.toCPointer<ByteVar>())

public actual fun FltSupportsFileContextsEx(fileobject: Long, instance: PFLT_INSTANCE): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltSupportsFileContextsEx(fileobject.toCPointer<ByteVar>(), instance)

public actual fun FltSupportsStreamContexts(fileobject: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltSupportsStreamContexts(fileobject.toCPointer<ByteVar>())

public actual fun FltSupportsStreamHandleContexts(fileobject: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltSupportsStreamHandleContexts(fileobject.toCPointer<ByteVar>())

public actual fun FltTagFile(initiatinginstance: PFLT_INSTANCE, fileobject: Long, filetag: UInt, guid: Long, databuffer: Long, databufferlength: UShort): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltTagFile(initiatinginstance, fileobject.toCPointer<ByteVar>(), filetag, guid.toCPointer<ByteVar>(), databuffer.toCPointer<ByteVar>(), databufferlength)

public actual fun FltTagFileEx(initiatinginstance: PFLT_INSTANCE, fileobject: Long, filetag: UInt, guid: Long, databuffer: Long, databufferlength: UShort, existingfiletag: UInt, existingguid: Long, flags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltTagFileEx(initiatinginstance, fileobject.toCPointer<ByteVar>(), filetag, guid.toCPointer<ByteVar>(), databuffer.toCPointer<ByteVar>(), databufferlength, existingfiletag, existingguid.toCPointer<ByteVar>(), flags)

public actual fun FltUninitializeFileLock(filelock: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltUninitializeFileLock(filelock.toCPointer<ByteVar>())
}

public actual fun FltUninitializeOplock(oplock: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltUninitializeOplock(oplock.toCPointer<ByteVar>())
}

public actual fun FltUnloadFilter(filtername: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltUnloadFilter(filtername.toCPointer<ByteVar>())

public actual fun FltUnregisterFilter(filter: PFLT_FILTER) {
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltUnregisterFilter(filter)
}

public actual fun FltUntagFile(initiatinginstance: PFLT_INSTANCE, fileobject: Long, filetag: UInt, guid: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltUntagFile(initiatinginstance, fileobject.toCPointer<ByteVar>(), filetag, guid.toCPointer<ByteVar>())

public actual fun FltVetoBypassIo(callbackdata: Long, fltobjects: Long, operationstatus: NTSTATUS, failurereason: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltVetoBypassIo(callbackdata.toCPointer<ByteVar>(), fltobjects.toCPointer<ByteVar>(), operationstatus, failurereason.toCPointer<ByteVar>())

public actual fun FltWriteFile(initiatinginstance: PFLT_INSTANCE, fileobject: Long, byteoffset: Long, length: UInt, buffer: Long, flags: UInt, byteswritten: Long, callbackroutine: PFLT_COMPLETED_ASYNC_IO_CALLBACK, callbackcontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltWriteFile(initiatinginstance, fileobject.toCPointer<ByteVar>(), byteoffset.toCPointer<ByteVar>(), length, buffer.toCPointer<ByteVar>(), flags, byteswritten.toCPointer<ByteVar>(), callbackroutine.toLong().toCPointer<ByteVar>(), callbackcontext.toCPointer<ByteVar>())

public actual fun FltWriteFileEx(initiatinginstance: PFLT_INSTANCE, fileobject: Long, byteoffset: Long, length: UInt, buffer: Long, flags: UInt, byteswritten: Long, callbackroutine: PFLT_COMPLETED_ASYNC_IO_CALLBACK, callbackcontext: Long, key: Long, mdl: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltWriteFileEx(initiatinginstance, fileobject.toCPointer<ByteVar>(), byteoffset.toCPointer<ByteVar>(), length, buffer.toCPointer<ByteVar>(), flags, byteswritten.toCPointer<ByteVar>(), callbackroutine.toLong().toCPointer<ByteVar>(), callbackcontext.toCPointer<ByteVar>(), key.toCPointer<ByteVar>(), mdl.toCPointer<ByteVar>())

public actual fun FltpTraceRedirectedFileIo(originatingfileobject: Long, childcallbackdata: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters.cinterop.windowssys_windows_wdk_storage_filesystem_minifilters_FltpTraceRedirectedFileIo(originatingfileobject.toCPointer<ByteVar>(), childcallbackdata.toCPointer<ByteVar>())
