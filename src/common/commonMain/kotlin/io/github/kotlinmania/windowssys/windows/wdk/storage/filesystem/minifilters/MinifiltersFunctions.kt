package io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters

import io.github.kotlinmania.windowssys.Win32DynamicFfi
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

public fun interface FnCallback {
    public operator fun invoke(context: Long, callbackdata: Long): NTSTATUS
}

public fun interface FnCallback1 {
    public operator fun invoke(cbdq: Long, cbd: Long, insertcontext: Long): NTSTATUS
}

public fun interface FnCallback2 {
    public operator fun invoke(cbdq: Long, cbd: Long)
}

public fun interface FnCallback3 {
    public operator fun invoke(cbdq: Long, cbd: Long, peekcontext: Long): Long
}

public fun interface FnCallback4 {
    public operator fun invoke(cbdq: Long, irql: UByte)
}

public fun interface FnCallback5 {
    public operator fun invoke(clientport: PFLT_PORT, serverportcookie: Long, connectioncontext: Long, sizeofcontext: UInt, connectionportcookie: Long): NTSTATUS
}

public fun interface FnCallback6 {
    public operator fun invoke(connectioncookie: Long)
}

public fun interface FnCallback7 {
    public operator fun invoke(portcookie: Long, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt, returnoutputbufferlength: Long): NTSTATUS
}

public fun interface FnCallback8 {
    public operator fun invoke(data: Long, fltobjects: Long, completioncontext: Long, flags: UInt): FLT_POSTOP_CALLBACK_STATUS
}

public fun interface FnCallback9 {
    public operator fun invoke(callbackdata: Long, context: PFLT_CONTEXT)
}

public fun interface FnCallback10 {
    public operator fun invoke(fltworkitem: PFLT_DEFERRED_IO_WORKITEM, callbackdata: Long, context: Long)
}

public fun interface FnCallback11 {
    public operator fun invoke(fltworkitem: PFLT_GENERIC_WORKITEM, fltobject: Long, context: Long)
}

public fun interface FnCallback12 {
    public operator fun invoke(fltobjects: Long, iopbsnapshot: Long, operationstatus: NTSTATUS, requestercontext: Long)
}

public fun FltAcknowledgeEcp(filter: PFLT_FILTER, ecpcontext: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltAcknowledgeEcp", longArrayOf(filter, ecpcontext))
}

public fun FltAcquirePushLockExclusive(pushlock: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltAcquirePushLockExclusive", longArrayOf(pushlock))
}

public fun FltAcquirePushLockExclusiveEx(pushlock: Long, flags: UInt) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltAcquirePushLockExclusiveEx", longArrayOf(pushlock, flags.toLong()))
}

public fun FltAcquirePushLockShared(pushlock: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltAcquirePushLockShared", longArrayOf(pushlock))
}

public fun FltAcquirePushLockSharedEx(pushlock: Long, flags: UInt) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltAcquirePushLockSharedEx", longArrayOf(pushlock, flags.toLong()))
}

public fun FltAcquireResourceExclusive(resource: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltAcquireResourceExclusive", longArrayOf(resource))
}

public fun FltAcquireResourceShared(resource: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltAcquireResourceShared", longArrayOf(resource))
}

public fun FltAddOpenReparseEntry(filter: PFLT_FILTER, data: Long, openreparseentry: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltAddOpenReparseEntry", longArrayOf(filter, data, openreparseentry)).toInt()
}

public fun FltAdjustDeviceStackSizeForIoRedirection(sourceinstance: PFLT_INSTANCE, targetinstance: PFLT_INSTANCE, sourcedevicestacksizemodified: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltAdjustDeviceStackSizeForIoRedirection", longArrayOf(sourceinstance, targetinstance, sourcedevicestacksizemodified)).toInt()
}

public fun FltAllocateCallbackData(instance: PFLT_INSTANCE, fileobject: Long, retnewcallbackdata: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltAllocateCallbackData", longArrayOf(instance, fileobject, retnewcallbackdata)).toInt()
}

public fun FltAllocateCallbackDataEx(instance: PFLT_INSTANCE, fileobject: Long, flags: UInt, retnewcallbackdata: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltAllocateCallbackDataEx", longArrayOf(instance, fileobject, flags.toLong(), retnewcallbackdata)).toInt()
}

public fun FltAllocateContext(filter: PFLT_FILTER, contexttype: UShort, contextsize: ULong, pooltype: POOL_TYPE, returnedcontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltAllocateContext", longArrayOf(filter, contexttype.toLong(), contextsize.toLong(), pooltype.toLong(), returnedcontext)).toInt()
}

public fun FltAllocateDeferredIoWorkItem(): PFLT_DEFERRED_IO_WORKITEM {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltAllocateDeferredIoWorkItem", longArrayOf())
}

public fun FltAllocateExtraCreateParameter(filter: PFLT_FILTER, ecptype: Long, sizeofcontext: UInt, flags: UInt, cleanupcallback: PFSRTL_EXTRA_CREATE_PARAMETER_CLEANUP_CALLBACK, pooltag: UInt, ecpcontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltAllocateExtraCreateParameter", longArrayOf(filter, ecptype, sizeofcontext.toLong(), flags.toLong(), Win32DynamicFfi.objectSlot(cleanupcallback), pooltag.toLong(), ecpcontext)).toInt()
}

public fun FltAllocateExtraCreateParameterFromLookasideList(filter: PFLT_FILTER, ecptype: Long, sizeofcontext: UInt, flags: UInt, cleanupcallback: PFSRTL_EXTRA_CREATE_PARAMETER_CLEANUP_CALLBACK, lookasidelist: Long, ecpcontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltAllocateExtraCreateParameterFromLookasideList", longArrayOf(filter, ecptype, sizeofcontext.toLong(), flags.toLong(), Win32DynamicFfi.objectSlot(cleanupcallback), lookasidelist, ecpcontext)).toInt()
}

public fun FltAllocateExtraCreateParameterList(filter: PFLT_FILTER, flags: UInt, ecplist: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltAllocateExtraCreateParameterList", longArrayOf(filter, flags.toLong(), ecplist)).toInt()
}

public fun FltAllocateFileLock(completelockcallbackdataroutine: PFLT_COMPLETE_LOCK_CALLBACK_DATA_ROUTINE, unlockroutine: PUNLOCK_ROUTINE): Long {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltAllocateFileLock", longArrayOf(Win32DynamicFfi.objectSlot(completelockcallbackdataroutine), Win32DynamicFfi.objectSlot(unlockroutine)))
}

public fun FltAllocateGenericWorkItem(): PFLT_GENERIC_WORKITEM {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltAllocateGenericWorkItem", longArrayOf())
}

public fun FltAllocatePoolAlignedWithTag(instance: PFLT_INSTANCE, pooltype: POOL_TYPE, numberofbytes: ULong, tag: UInt): Long {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltAllocatePoolAlignedWithTag", longArrayOf(instance, pooltype.toLong(), numberofbytes.toLong(), tag.toLong()))
}

public fun FltApplyPriorityInfoThread(inputpriorityinfo: Long, outputpriorityinfo: Long, thread: PETHREAD): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltApplyPriorityInfoThread", longArrayOf(inputpriorityinfo, outputpriorityinfo, thread)).toInt()
}

public fun FltAttachVolume(filter: PFLT_FILTER, volume: PFLT_VOLUME, instancename: Long, retinstance: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltAttachVolume", longArrayOf(filter, volume, instancename, retinstance)).toInt()
}

public fun FltAttachVolumeAtAltitude(filter: PFLT_FILTER, volume: PFLT_VOLUME, altitude: Long, instancename: Long, retinstance: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltAttachVolumeAtAltitude", longArrayOf(filter, volume, altitude, instancename, retinstance)).toInt()
}

public fun FltBuildDefaultSecurityDescriptor(securitydescriptor: Long, desiredaccess: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltBuildDefaultSecurityDescriptor", longArrayOf(securitydescriptor, desiredaccess.toLong())).toInt()
}

public fun FltCancelFileOpen(instance: PFLT_INSTANCE, fileobject: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltCancelFileOpen", longArrayOf(instance, fileobject))
}

public fun FltCancelIo(callbackdata: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("fltmgr.sys", "FltCancelIo", longArrayOf(callbackdata))
    return (rawRet and 0xFFL) != 0L
}

public fun FltCancellableWaitForMultipleObjects(count: UInt, objectarray: Long, waittype: WAIT_TYPE, timeout: Long, waitblockarray: Long, callbackdata: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltCancellableWaitForMultipleObjects", longArrayOf(count.toLong(), objectarray, waittype.toLong(), timeout, waitblockarray, callbackdata)).toInt()
}

public fun FltCancellableWaitForSingleObject(obj: Long, timeout: Long, callbackdata: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltCancellableWaitForSingleObject", longArrayOf(obj, timeout, callbackdata)).toInt()
}

public fun FltCbdqDisable(cbdq: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltCbdqDisable", longArrayOf(cbdq))
}

public fun FltCbdqEnable(cbdq: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltCbdqEnable", longArrayOf(cbdq))
}

public fun FltCbdqInitialize(instance: PFLT_INSTANCE, cbdq: Long, cbdqinsertio: PFLT_CALLBACK_DATA_QUEUE_INSERT_IO, cbdqremoveio: PFLT_CALLBACK_DATA_QUEUE_REMOVE_IO, cbdqpeeknextio: PFLT_CALLBACK_DATA_QUEUE_PEEK_NEXT_IO, cbdqacquire: PFLT_CALLBACK_DATA_QUEUE_ACQUIRE, cbdqrelease: PFLT_CALLBACK_DATA_QUEUE_RELEASE, cbdqcompletecanceledio: PFLT_CALLBACK_DATA_QUEUE_COMPLETE_CANCELED_IO): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltCbdqInitialize", longArrayOf(instance, cbdq, Win32DynamicFfi.objectSlot(cbdqinsertio), Win32DynamicFfi.objectSlot(cbdqremoveio), Win32DynamicFfi.objectSlot(cbdqpeeknextio), Win32DynamicFfi.objectSlot(cbdqacquire), Win32DynamicFfi.objectSlot(cbdqrelease), Win32DynamicFfi.objectSlot(cbdqcompletecanceledio))).toInt()
}

public fun FltCbdqInsertIo(cbdq: Long, cbd: Long, context: Long, insertcontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltCbdqInsertIo", longArrayOf(cbdq, cbd, context, insertcontext)).toInt()
}

public fun FltCbdqRemoveIo(cbdq: Long, context: Long): Long {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltCbdqRemoveIo", longArrayOf(cbdq, context))
}

public fun FltCbdqRemoveNextIo(cbdq: Long, peekcontext: Long): Long {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltCbdqRemoveNextIo", longArrayOf(cbdq, peekcontext))
}

public fun FltCheckAndGrowNameControl(namectrl: Long, newsize: UShort): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltCheckAndGrowNameControl", longArrayOf(namectrl, newsize.toLong())).toInt()
}

public fun FltCheckLockForReadAccess(filelock: Long, callbackdata: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("fltmgr.sys", "FltCheckLockForReadAccess", longArrayOf(filelock, callbackdata))
    return (rawRet and 0xFFL) != 0L
}

public fun FltCheckLockForWriteAccess(filelock: Long, callbackdata: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("fltmgr.sys", "FltCheckLockForWriteAccess", longArrayOf(filelock, callbackdata))
    return (rawRet and 0xFFL) != 0L
}

public fun FltCheckOplock(oplock: Long, callbackdata: Long, context: Long, waitcompletionroutine: PFLTOPLOCK_WAIT_COMPLETE_ROUTINE, prepostcallbackdataroutine: PFLTOPLOCK_PREPOST_CALLBACKDATA_ROUTINE): FLT_PREOP_CALLBACK_STATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltCheckOplock", longArrayOf(oplock, callbackdata, context, Win32DynamicFfi.objectSlot(waitcompletionroutine), Win32DynamicFfi.objectSlot(prepostcallbackdataroutine))).toInt()
}

public fun FltCheckOplockEx(oplock: Long, callbackdata: Long, flags: UInt, context: Long, waitcompletionroutine: PFLTOPLOCK_WAIT_COMPLETE_ROUTINE, prepostcallbackdataroutine: PFLTOPLOCK_PREPOST_CALLBACKDATA_ROUTINE): FLT_PREOP_CALLBACK_STATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltCheckOplockEx", longArrayOf(oplock, callbackdata, flags.toLong(), context, Win32DynamicFfi.objectSlot(waitcompletionroutine), Win32DynamicFfi.objectSlot(prepostcallbackdataroutine))).toInt()
}

public fun FltClearCallbackDataDirty(data: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltClearCallbackDataDirty", longArrayOf(data))
}

public fun FltClearCancelCompletion(callbackdata: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltClearCancelCompletion", longArrayOf(callbackdata)).toInt()
}

public fun FltClose(filehandle: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltClose", longArrayOf(filehandle)).toInt()
}

public fun FltCloseClientPort(filter: PFLT_FILTER, clientport: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltCloseClientPort", longArrayOf(filter, clientport))
}

public fun FltCloseCommunicationPort(serverport: PFLT_PORT) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltCloseCommunicationPort", longArrayOf(serverport))
}

public fun FltCloseSectionForDataScan(sectioncontext: PFLT_CONTEXT): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltCloseSectionForDataScan", longArrayOf(sectioncontext)).toInt()
}

public fun FltCommitComplete(instance: PFLT_INSTANCE, transaction: Long, transactioncontext: PFLT_CONTEXT): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltCommitComplete", longArrayOf(instance, transaction, transactioncontext)).toInt()
}

public fun FltCommitFinalizeComplete(instance: PFLT_INSTANCE, transaction: Long, transactioncontext: PFLT_CONTEXT): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltCommitFinalizeComplete", longArrayOf(instance, transaction, transactioncontext)).toInt()
}

public fun FltCompareInstanceAltitudes(instance1: PFLT_INSTANCE, instance2: PFLT_INSTANCE): Int {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltCompareInstanceAltitudes", longArrayOf(instance1, instance2)).toInt()
}

public fun FltCompletePendedPostOperation(callbackdata: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltCompletePendedPostOperation", longArrayOf(callbackdata))
}

public fun FltCompletePendedPreOperation(callbackdata: Long, callbackstatus: FLT_PREOP_CALLBACK_STATUS, context: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltCompletePendedPreOperation", longArrayOf(callbackdata, callbackstatus.toLong(), context))
}

public fun FltCopyOpenReparseList(filter: PFLT_FILTER, data: Long, ecplist: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltCopyOpenReparseList", longArrayOf(filter, data, ecplist)).toInt()
}

public fun FltCreateCommunicationPort(filter: PFLT_FILTER, serverport: Long, objectattributes: Long, serverportcookie: Long, connectnotifycallback: PFLT_CONNECT_NOTIFY, disconnectnotifycallback: PFLT_DISCONNECT_NOTIFY, messagenotifycallback: PFLT_MESSAGE_NOTIFY, maxconnections: Int): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltCreateCommunicationPort", longArrayOf(filter, serverport, objectattributes, serverportcookie, Win32DynamicFfi.objectSlot(connectnotifycallback), Win32DynamicFfi.objectSlot(disconnectnotifycallback), Win32DynamicFfi.objectSlot(messagenotifycallback), maxconnections.toLong())).toInt()
}

public fun FltCreateFile(filter: PFLT_FILTER, instance: PFLT_INSTANCE, filehandle: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: Long, ealength: UInt, flags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltCreateFile", longArrayOf(filter, instance, filehandle, desiredaccess.toLong(), objectattributes, iostatusblock, allocationsize, fileattributes.toLong(), shareaccess.toLong(), createdisposition.toLong(), createoptions.toLong(), eabuffer, ealength.toLong(), flags.toLong())).toInt()
}

public fun FltCreateFileEx(filter: PFLT_FILTER, instance: PFLT_INSTANCE, filehandle: Long, fileobject: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: Long, ealength: UInt, flags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltCreateFileEx", longArrayOf(filter, instance, filehandle, fileobject, desiredaccess.toLong(), objectattributes, iostatusblock, allocationsize, fileattributes.toLong(), shareaccess.toLong(), createdisposition.toLong(), createoptions.toLong(), eabuffer, ealength.toLong(), flags.toLong())).toInt()
}

public fun FltCreateFileEx2(filter: PFLT_FILTER, instance: PFLT_INSTANCE, filehandle: Long, fileobject: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: Long, ealength: UInt, flags: UInt, drivercontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltCreateFileEx2", longArrayOf(filter, instance, filehandle, fileobject, desiredaccess.toLong(), objectattributes, iostatusblock, allocationsize, fileattributes.toLong(), shareaccess.toLong(), createdisposition.toLong(), createoptions.toLong(), eabuffer, ealength.toLong(), flags.toLong(), drivercontext)).toInt()
}

public fun FltCreateMailslotFile(filter: PFLT_FILTER, instance: PFLT_INSTANCE, filehandle: Long, fileobject: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, createoptions: UInt, mailslotquota: UInt, maximummessagesize: UInt, readtimeout: Long, drivercontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltCreateMailslotFile", longArrayOf(filter, instance, filehandle, fileobject, desiredaccess.toLong(), objectattributes, iostatusblock, createoptions.toLong(), mailslotquota.toLong(), maximummessagesize.toLong(), readtimeout, drivercontext)).toInt()
}

public fun FltCreateNamedPipeFile(filter: PFLT_FILTER, instance: PFLT_INSTANCE, filehandle: Long, fileobject: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, namedpipetype: UInt, readmode: UInt, completionmode: UInt, maximuminstances: UInt, inboundquota: UInt, outboundquota: UInt, defaulttimeout: Long, drivercontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltCreateNamedPipeFile", longArrayOf(filter, instance, filehandle, fileobject, desiredaccess.toLong(), objectattributes, iostatusblock, shareaccess.toLong(), createdisposition.toLong(), createoptions.toLong(), namedpipetype.toLong(), readmode.toLong(), completionmode.toLong(), maximuminstances.toLong(), inboundquota.toLong(), outboundquota.toLong(), defaulttimeout, drivercontext)).toInt()
}

public fun FltCreateSectionForDataScan(instance: PFLT_INSTANCE, fileobject: Long, sectioncontext: PFLT_CONTEXT, desiredaccess: UInt, objectattributes: Long, maximumsize: Long, sectionpageprotection: UInt, allocationattributes: UInt, flags: UInt, sectionhandle: Long, sectionobject: Long, sectionfilesize: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltCreateSectionForDataScan", longArrayOf(instance, fileobject, sectioncontext, desiredaccess.toLong(), objectattributes, maximumsize, sectionpageprotection.toLong(), allocationattributes.toLong(), flags.toLong(), sectionhandle, sectionobject, sectionfilesize)).toInt()
}

public fun FltCreateSystemVolumeInformationFolder(instance: PFLT_INSTANCE): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltCreateSystemVolumeInformationFolder", longArrayOf(instance)).toInt()
}

public fun FltCurrentBatchOplock(oplock: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("fltmgr.sys", "FltCurrentBatchOplock", longArrayOf(oplock))
    return (rawRet and 0xFFL) != 0L
}

public fun FltCurrentOplock(oplock: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("fltmgr.sys", "FltCurrentOplock", longArrayOf(oplock))
    return (rawRet and 0xFFL) != 0L
}

public fun FltCurrentOplockH(oplock: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("fltmgr.sys", "FltCurrentOplockH", longArrayOf(oplock))
    return (rawRet and 0xFFL) != 0L
}

public fun FltDecodeParameters(callbackdata: Long, mdladdresspointer: Long, buffer: Long, length: Long, desiredaccess: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltDecodeParameters", longArrayOf(callbackdata, mdladdresspointer, buffer, length, desiredaccess)).toInt()
}

public fun FltDeleteContext(context: PFLT_CONTEXT) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltDeleteContext", longArrayOf(context))
}

public fun FltDeleteExtraCreateParameterLookasideList(filter: PFLT_FILTER, lookaside: Long, flags: UInt) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltDeleteExtraCreateParameterLookasideList", longArrayOf(filter, lookaside, flags.toLong()))
}

public fun FltDeleteFileContext(instance: PFLT_INSTANCE, fileobject: Long, oldcontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltDeleteFileContext", longArrayOf(instance, fileobject, oldcontext)).toInt()
}

public fun FltDeleteInstanceContext(instance: PFLT_INSTANCE, oldcontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltDeleteInstanceContext", longArrayOf(instance, oldcontext)).toInt()
}

public fun FltDeletePushLock(pushlock: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltDeletePushLock", longArrayOf(pushlock))
}

public fun FltDeleteStreamContext(instance: PFLT_INSTANCE, fileobject: Long, oldcontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltDeleteStreamContext", longArrayOf(instance, fileobject, oldcontext)).toInt()
}

public fun FltDeleteStreamHandleContext(instance: PFLT_INSTANCE, fileobject: Long, oldcontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltDeleteStreamHandleContext", longArrayOf(instance, fileobject, oldcontext)).toInt()
}

public fun FltDeleteTransactionContext(instance: PFLT_INSTANCE, transaction: Long, oldcontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltDeleteTransactionContext", longArrayOf(instance, transaction, oldcontext)).toInt()
}

public fun FltDeleteVolumeContext(filter: PFLT_FILTER, volume: PFLT_VOLUME, oldcontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltDeleteVolumeContext", longArrayOf(filter, volume, oldcontext)).toInt()
}

public fun FltDetachVolume(filter: PFLT_FILTER, volume: PFLT_VOLUME, instancename: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltDetachVolume", longArrayOf(filter, volume, instancename)).toInt()
}

public fun FltDeviceIoControlFile(instance: PFLT_INSTANCE, fileobject: Long, iocontrolcode: UInt, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt, lengthreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltDeviceIoControlFile", longArrayOf(instance, fileobject, iocontrolcode.toLong(), inputbuffer, inputbufferlength.toLong(), outputbuffer, outputbufferlength.toLong(), lengthreturned)).toInt()
}

public fun FltDoCompletionProcessingWhenSafe(data: Long, fltobjects: Long, completioncontext: Long, flags: UInt, safepostcallback: PFLT_POST_OPERATION_CALLBACK, retpostoperationstatus: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("fltmgr.sys", "FltDoCompletionProcessingWhenSafe", longArrayOf(data, fltobjects, completioncontext, flags.toLong(), Win32DynamicFfi.objectSlot(safepostcallback), retpostoperationstatus))
    return (rawRet and 0xFFL) != 0L
}

public fun FltEnlistInTransaction(instance: PFLT_INSTANCE, transaction: Long, transactioncontext: PFLT_CONTEXT, notificationmask: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltEnlistInTransaction", longArrayOf(instance, transaction, transactioncontext, notificationmask.toLong())).toInt()
}

public fun FltEnumerateFilterInformation(index: UInt, informationclass: FILTER_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltEnumerateFilterInformation", longArrayOf(index.toLong(), informationclass.toLong(), buffer, buffersize.toLong(), bytesreturned)).toInt()
}

public fun FltEnumerateFilters(filterlist: Long, filterlistsize: UInt, numberfiltersreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltEnumerateFilters", longArrayOf(filterlist, filterlistsize.toLong(), numberfiltersreturned)).toInt()
}

public fun FltEnumerateInstanceInformationByDeviceObject(deviceobject: Long, index: UInt, informationclass: INSTANCE_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltEnumerateInstanceInformationByDeviceObject", longArrayOf(deviceobject, index.toLong(), informationclass.toLong(), buffer, buffersize.toLong(), bytesreturned)).toInt()
}

public fun FltEnumerateInstanceInformationByFilter(filter: PFLT_FILTER, index: UInt, informationclass: INSTANCE_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltEnumerateInstanceInformationByFilter", longArrayOf(filter, index.toLong(), informationclass.toLong(), buffer, buffersize.toLong(), bytesreturned)).toInt()
}

public fun FltEnumerateInstanceInformationByVolume(volume: PFLT_VOLUME, index: UInt, informationclass: INSTANCE_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltEnumerateInstanceInformationByVolume", longArrayOf(volume, index.toLong(), informationclass.toLong(), buffer, buffersize.toLong(), bytesreturned)).toInt()
}

public fun FltEnumerateInstanceInformationByVolumeName(volumename: Long, index: UInt, informationclass: INSTANCE_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltEnumerateInstanceInformationByVolumeName", longArrayOf(volumename, index.toLong(), informationclass.toLong(), buffer, buffersize.toLong(), bytesreturned)).toInt()
}

public fun FltEnumerateInstances(volume: PFLT_VOLUME, filter: PFLT_FILTER, instancelist: Long, instancelistsize: UInt, numberinstancesreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltEnumerateInstances", longArrayOf(volume, filter, instancelist, instancelistsize.toLong(), numberinstancesreturned)).toInt()
}

public fun FltEnumerateVolumeInformation(filter: PFLT_FILTER, index: UInt, informationclass: FILTER_VOLUME_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltEnumerateVolumeInformation", longArrayOf(filter, index.toLong(), informationclass.toLong(), buffer, buffersize.toLong(), bytesreturned)).toInt()
}

public fun FltEnumerateVolumes(filter: PFLT_FILTER, volumelist: Long, volumelistsize: UInt, numbervolumesreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltEnumerateVolumes", longArrayOf(filter, volumelist, volumelistsize.toLong(), numbervolumesreturned)).toInt()
}

public fun FltFastIoMdlRead(initiatinginstance: PFLT_INSTANCE, fileobject: Long, fileoffset: Long, length: UInt, lockkey: UInt, mdlchain: Long, iostatus: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("fltmgr.sys", "FltFastIoMdlRead", longArrayOf(initiatinginstance, fileobject, fileoffset, length.toLong(), lockkey.toLong(), mdlchain, iostatus))
    return (rawRet and 0xFFL) != 0L
}

public fun FltFastIoMdlReadComplete(initiatinginstance: PFLT_INSTANCE, fileobject: Long, mdlchain: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("fltmgr.sys", "FltFastIoMdlReadComplete", longArrayOf(initiatinginstance, fileobject, mdlchain))
    return (rawRet and 0xFFL) != 0L
}

public fun FltFastIoMdlWriteComplete(initiatinginstance: PFLT_INSTANCE, fileobject: Long, fileoffset: Long, mdlchain: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("fltmgr.sys", "FltFastIoMdlWriteComplete", longArrayOf(initiatinginstance, fileobject, fileoffset, mdlchain))
    return (rawRet and 0xFFL) != 0L
}

public fun FltFastIoPrepareMdlWrite(initiatinginstance: PFLT_INSTANCE, fileobject: Long, fileoffset: Long, length: UInt, lockkey: UInt, mdlchain: Long, iostatus: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("fltmgr.sys", "FltFastIoPrepareMdlWrite", longArrayOf(initiatinginstance, fileobject, fileoffset, length.toLong(), lockkey.toLong(), mdlchain, iostatus))
    return (rawRet and 0xFFL) != 0L
}

public fun FltFindExtraCreateParameter(filter: PFLT_FILTER, ecplist: Long, ecptype: Long, ecpcontext: Long, ecpcontextsize: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltFindExtraCreateParameter", longArrayOf(filter, ecplist, ecptype, ecpcontext, ecpcontextsize)).toInt()
}

public fun FltFlushBuffers(instance: PFLT_INSTANCE, fileobject: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltFlushBuffers", longArrayOf(instance, fileobject)).toInt()
}

public fun FltFlushBuffers2(instance: PFLT_INSTANCE, fileobject: Long, flushtype: UInt, callbackdata: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltFlushBuffers2", longArrayOf(instance, fileobject, flushtype.toLong(), callbackdata)).toInt()
}

public fun FltFreeCallbackData(callbackdata: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltFreeCallbackData", longArrayOf(callbackdata))
}

public fun FltFreeDeferredIoWorkItem(fltworkitem: PFLT_DEFERRED_IO_WORKITEM) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltFreeDeferredIoWorkItem", longArrayOf(fltworkitem))
}

public fun FltFreeExtraCreateParameter(filter: PFLT_FILTER, ecpcontext: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltFreeExtraCreateParameter", longArrayOf(filter, ecpcontext))
}

public fun FltFreeExtraCreateParameterList(filter: PFLT_FILTER, ecplist: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltFreeExtraCreateParameterList", longArrayOf(filter, ecplist))
}

public fun FltFreeFileLock(filelock: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltFreeFileLock", longArrayOf(filelock))
}

public fun FltFreeGenericWorkItem(fltworkitem: PFLT_GENERIC_WORKITEM) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltFreeGenericWorkItem", longArrayOf(fltworkitem))
}

public fun FltFreeOpenReparseList(filter: PFLT_FILTER, ecplist: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltFreeOpenReparseList", longArrayOf(filter, ecplist))
}

public fun FltFreePoolAlignedWithTag(instance: PFLT_INSTANCE, buffer: Long, tag: UInt) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltFreePoolAlignedWithTag", longArrayOf(instance, buffer, tag.toLong()))
}

public fun FltFreeSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltFreeSecurityDescriptor", longArrayOf(securitydescriptor))
}

public fun FltFsControlFile(instance: PFLT_INSTANCE, fileobject: Long, fscontrolcode: UInt, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt, lengthreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltFsControlFile", longArrayOf(instance, fileobject, fscontrolcode.toLong(), inputbuffer, inputbufferlength.toLong(), outputbuffer, outputbufferlength.toLong(), lengthreturned)).toInt()
}

public fun FltGetActivityIdCallbackData(callbackdata: Long, guid: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetActivityIdCallbackData", longArrayOf(callbackdata, guid)).toInt()
}

public fun FltGetBottomInstance(volume: PFLT_VOLUME, instance: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetBottomInstance", longArrayOf(volume, instance)).toInt()
}

public fun FltGetContexts(fltobjects: Long, desiredcontexts: UShort, contexts: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltGetContexts", longArrayOf(fltobjects, desiredcontexts.toLong(), contexts))
}

public fun FltGetContextsEx(fltobjects: Long, desiredcontexts: UShort, contextssize: ULong, contexts: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetContextsEx", longArrayOf(fltobjects, desiredcontexts.toLong(), contextssize.toLong(), contexts)).toInt()
}

public fun FltGetDestinationFileNameInformation(instance: PFLT_INSTANCE, fileobject: Long, rootdirectory: HANDLE, filename: PCWSTR, filenamelength: UInt, nameoptions: UInt, retfilenameinformation: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetDestinationFileNameInformation", longArrayOf(instance, fileobject, rootdirectory, filename, filenamelength.toLong(), nameoptions.toLong(), retfilenameinformation)).toInt()
}

public fun FltGetDeviceObject(volume: PFLT_VOLUME, deviceobject: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetDeviceObject", longArrayOf(volume, deviceobject)).toInt()
}

public fun FltGetDiskDeviceObject(volume: PFLT_VOLUME, diskdeviceobject: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetDiskDeviceObject", longArrayOf(volume, diskdeviceobject)).toInt()
}

public fun FltGetEcpListFromCallbackData(filter: PFLT_FILTER, callbackdata: Long, ecplist: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetEcpListFromCallbackData", longArrayOf(filter, callbackdata, ecplist)).toInt()
}

public fun FltGetFileContext(instance: PFLT_INSTANCE, fileobject: Long, context: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetFileContext", longArrayOf(instance, fileobject, context)).toInt()
}

public fun FltGetFileNameInformation(callbackdata: Long, nameoptions: UInt, filenameinformation: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetFileNameInformation", longArrayOf(callbackdata, nameoptions.toLong(), filenameinformation)).toInt()
}

public fun FltGetFileNameInformationUnsafe(fileobject: Long, instance: PFLT_INSTANCE, nameoptions: UInt, filenameinformation: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetFileNameInformationUnsafe", longArrayOf(fileobject, instance, nameoptions.toLong(), filenameinformation)).toInt()
}

public fun FltGetFileSystemType(fltobject: Long, filesystemtype: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetFileSystemType", longArrayOf(fltobject, filesystemtype)).toInt()
}

public fun FltGetFilterFromInstance(instance: PFLT_INSTANCE, retfilter: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetFilterFromInstance", longArrayOf(instance, retfilter)).toInt()
}

public fun FltGetFilterFromName(filtername: Long, retfilter: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetFilterFromName", longArrayOf(filtername, retfilter)).toInt()
}

public fun FltGetFilterInformation(filter: PFLT_FILTER, informationclass: FILTER_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetFilterInformation", longArrayOf(filter, informationclass.toLong(), buffer, buffersize.toLong(), bytesreturned)).toInt()
}

public fun FltGetFsZeroingOffset(data: Long, zeroingoffset: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetFsZeroingOffset", longArrayOf(data, zeroingoffset)).toInt()
}

public fun FltGetInstanceContext(instance: PFLT_INSTANCE, context: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetInstanceContext", longArrayOf(instance, context)).toInt()
}

public fun FltGetInstanceInformation(instance: PFLT_INSTANCE, informationclass: INSTANCE_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetInstanceInformation", longArrayOf(instance, informationclass.toLong(), buffer, buffersize.toLong(), bytesreturned)).toInt()
}

public fun FltGetIoAttributionHandleFromCallbackData(data: Long): Long {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetIoAttributionHandleFromCallbackData", longArrayOf(data))
}

public fun FltGetIoPriorityHint(data: Long): IO_PRIORITY_HINT {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetIoPriorityHint", longArrayOf(data)).toInt()
}

public fun FltGetIoPriorityHintFromCallbackData(data: Long): IO_PRIORITY_HINT {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetIoPriorityHintFromCallbackData", longArrayOf(data)).toInt()
}

public fun FltGetIoPriorityHintFromFileObject(fileobject: Long): IO_PRIORITY_HINT {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetIoPriorityHintFromFileObject", longArrayOf(fileobject)).toInt()
}

public fun FltGetIoPriorityHintFromThread(thread: PETHREAD): IO_PRIORITY_HINT {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetIoPriorityHintFromThread", longArrayOf(thread)).toInt()
}

public fun FltGetIrpName(irpmajorcode: UByte): PSTR {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetIrpName", longArrayOf(irpmajorcode.toLong()))
}

public fun FltGetLowerInstance(currentinstance: PFLT_INSTANCE, lowerinstance: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetLowerInstance", longArrayOf(currentinstance, lowerinstance)).toInt()
}

public fun FltGetNewSystemBufferAddress(callbackdata: Long): Long {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetNewSystemBufferAddress", longArrayOf(callbackdata))
}

public fun FltGetNextExtraCreateParameter(filter: PFLT_FILTER, ecplist: Long, currentecpcontext: Long, nextecptype: Long, nextecpcontext: Long, nextecpcontextsize: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetNextExtraCreateParameter", longArrayOf(filter, ecplist, currentecpcontext, nextecptype, nextecpcontext, nextecpcontextsize)).toInt()
}

public fun FltGetRequestorProcess(callbackdata: Long): PEPROCESS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetRequestorProcess", longArrayOf(callbackdata))
}

public fun FltGetRequestorProcessId(callbackdata: Long): UInt {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetRequestorProcessId", longArrayOf(callbackdata)).toUInt()
}

public fun FltGetRequestorProcessIdEx(callbackdata: Long): HANDLE {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetRequestorProcessIdEx", longArrayOf(callbackdata))
}

public fun FltGetRequestorSessionId(callbackdata: Long, sessionid: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetRequestorSessionId", longArrayOf(callbackdata, sessionid)).toInt()
}

public fun FltGetRoutineAddress(fltmgrroutinename: PCSTR): Long {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetRoutineAddress", longArrayOf(fltmgrroutinename))
}

public fun FltGetSectionContext(instance: PFLT_INSTANCE, fileobject: Long, context: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetSectionContext", longArrayOf(instance, fileobject, context)).toInt()
}

public fun FltGetStreamContext(instance: PFLT_INSTANCE, fileobject: Long, context: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetStreamContext", longArrayOf(instance, fileobject, context)).toInt()
}

public fun FltGetStreamHandleContext(instance: PFLT_INSTANCE, fileobject: Long, context: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetStreamHandleContext", longArrayOf(instance, fileobject, context)).toInt()
}

public fun FltGetSwappedBufferMdlAddress(callbackdata: Long): Long {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetSwappedBufferMdlAddress", longArrayOf(callbackdata))
}

public fun FltGetTopInstance(volume: PFLT_VOLUME, instance: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetTopInstance", longArrayOf(volume, instance)).toInt()
}

public fun FltGetTransactionContext(instance: PFLT_INSTANCE, transaction: Long, context: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetTransactionContext", longArrayOf(instance, transaction, context)).toInt()
}

public fun FltGetTunneledName(callbackdata: Long, filenameinformation: Long, rettunneledfilenameinformation: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetTunneledName", longArrayOf(callbackdata, filenameinformation, rettunneledfilenameinformation)).toInt()
}

public fun FltGetUpperInstance(currentinstance: PFLT_INSTANCE, upperinstance: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetUpperInstance", longArrayOf(currentinstance, upperinstance)).toInt()
}

public fun FltGetVolumeContext(filter: PFLT_FILTER, volume: PFLT_VOLUME, context: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetVolumeContext", longArrayOf(filter, volume, context)).toInt()
}

public fun FltGetVolumeFromDeviceObject(filter: PFLT_FILTER, deviceobject: Long, retvolume: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetVolumeFromDeviceObject", longArrayOf(filter, deviceobject, retvolume)).toInt()
}

public fun FltGetVolumeFromFileObject(filter: PFLT_FILTER, fileobject: Long, retvolume: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetVolumeFromFileObject", longArrayOf(filter, fileobject, retvolume)).toInt()
}

public fun FltGetVolumeFromInstance(instance: PFLT_INSTANCE, retvolume: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetVolumeFromInstance", longArrayOf(instance, retvolume)).toInt()
}

public fun FltGetVolumeFromName(filter: PFLT_FILTER, volumename: Long, retvolume: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetVolumeFromName", longArrayOf(filter, volumename, retvolume)).toInt()
}

public fun FltGetVolumeGuidName(volume: PFLT_VOLUME, volumeguidname: Long, buffersizeneeded: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetVolumeGuidName", longArrayOf(volume, volumeguidname, buffersizeneeded)).toInt()
}

public fun FltGetVolumeInformation(volume: PFLT_VOLUME, informationclass: FILTER_VOLUME_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetVolumeInformation", longArrayOf(volume, informationclass.toLong(), buffer, buffersize.toLong(), bytesreturned)).toInt()
}

public fun FltGetVolumeInstanceFromName(filter: PFLT_FILTER, volume: PFLT_VOLUME, instancename: Long, retinstance: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetVolumeInstanceFromName", longArrayOf(filter, volume, instancename, retinstance)).toInt()
}

public fun FltGetVolumeName(volume: PFLT_VOLUME, volumename: Long, buffersizeneeded: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetVolumeName", longArrayOf(volume, volumename, buffersizeneeded)).toInt()
}

public fun FltGetVolumeProperties(volume: PFLT_VOLUME, volumeproperties: Long, volumepropertieslength: UInt, lengthreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetVolumeProperties", longArrayOf(volume, volumeproperties, volumepropertieslength.toLong(), lengthreturned)).toInt()
}

public fun FltInitExtraCreateParameterLookasideList(filter: PFLT_FILTER, lookaside: Long, flags: UInt, size: ULong, tag: UInt) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltInitExtraCreateParameterLookasideList", longArrayOf(filter, lookaside, flags.toLong(), size.toLong(), tag.toLong()))
}

public fun FltInitializeFileLock(filelock: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltInitializeFileLock", longArrayOf(filelock))
}

public fun FltInitializeOplock(oplock: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltInitializeOplock", longArrayOf(oplock))
}

public fun FltInitializePushLock(pushlock: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltInitializePushLock", longArrayOf(pushlock))
}

public fun FltInsertExtraCreateParameter(filter: PFLT_FILTER, ecplist: Long, ecpcontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltInsertExtraCreateParameter", longArrayOf(filter, ecplist, ecpcontext)).toInt()
}

public fun FltIs32bitProcess(callbackdata: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("fltmgr.sys", "FltIs32bitProcess", longArrayOf(callbackdata))
    return (rawRet and 0xFFL) != 0L
}

public fun FltIsCallbackDataDirty(data: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("fltmgr.sys", "FltIsCallbackDataDirty", longArrayOf(data))
    return (rawRet and 0xFFL) != 0L
}

public fun FltIsDirectory(fileobject: Long, instance: PFLT_INSTANCE, isdirectory: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltIsDirectory", longArrayOf(fileobject, instance, isdirectory)).toInt()
}

public fun FltIsEcpAcknowledged(filter: PFLT_FILTER, ecpcontext: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("fltmgr.sys", "FltIsEcpAcknowledged", longArrayOf(filter, ecpcontext))
    return (rawRet and 0xFFL) != 0L
}

public fun FltIsEcpFromUserMode(filter: PFLT_FILTER, ecpcontext: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("fltmgr.sys", "FltIsEcpFromUserMode", longArrayOf(filter, ecpcontext))
    return (rawRet and 0xFFL) != 0L
}

public fun FltIsFltMgrVolumeDeviceObject(deviceobject: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("fltmgr.sys", "FltIsFltMgrVolumeDeviceObject", longArrayOf(deviceobject))
    return (rawRet and 0xFFL) != 0L
}

public fun FltIsIoCanceled(callbackdata: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("fltmgr.sys", "FltIsIoCanceled", longArrayOf(callbackdata))
    return (rawRet and 0xFFL) != 0L
}

public fun FltIsIoRedirectionAllowed(sourceinstance: PFLT_INSTANCE, targetinstance: PFLT_INSTANCE, redirectionallowed: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltIsIoRedirectionAllowed", longArrayOf(sourceinstance, targetinstance, redirectionallowed)).toInt()
}

public fun FltIsIoRedirectionAllowedForOperation(data: Long, targetinstance: PFLT_INSTANCE, redirectionallowedthisio: Long, redirectionallowedallio: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltIsIoRedirectionAllowedForOperation", longArrayOf(data, targetinstance, redirectionallowedthisio, redirectionallowedallio)).toInt()
}

public fun FltIsOperationSynchronous(callbackdata: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("fltmgr.sys", "FltIsOperationSynchronous", longArrayOf(callbackdata))
    return (rawRet and 0xFFL) != 0L
}

public fun FltIsVolumeSnapshot(fltobject: Long, issnapshotvolume: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltIsVolumeSnapshot", longArrayOf(fltobject, issnapshotvolume)).toInt()
}

public fun FltIsVolumeWritable(fltobject: Long, iswritable: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltIsVolumeWritable", longArrayOf(fltobject, iswritable)).toInt()
}

public fun FltLoadFilter(filtername: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltLoadFilter", longArrayOf(filtername)).toInt()
}

public fun FltLockUserBuffer(callbackdata: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltLockUserBuffer", longArrayOf(callbackdata)).toInt()
}

public fun FltNotifyFilterChangeDirectory(notifysync: PNOTIFY_SYNC, notifylist: Long, fscontext: Long, fulldirectoryname: Long, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifycallbackdata: Long, traversecallback: PCHECK_FOR_TRAVERSE_ACCESS, subjectcontext: Long, filtercallback: PFILTER_REPORT_CHANGE) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltNotifyFilterChangeDirectory", longArrayOf(notifysync, notifylist, fscontext, fulldirectoryname, if (watchtree) 1L else 0L, if (ignorebuffer) 1L else 0L, completionfilter.toLong(), notifycallbackdata, Win32DynamicFfi.objectSlot(traversecallback), subjectcontext, Win32DynamicFfi.objectSlot(filtercallback)))
}

public fun FltObjectDereference(fltobject: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltObjectDereference", longArrayOf(fltobject))
}

public fun FltObjectReference(fltobject: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltObjectReference", longArrayOf(fltobject)).toInt()
}

public fun FltOpenVolume(instance: PFLT_INSTANCE, volumehandle: Long, volumefileobject: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltOpenVolume", longArrayOf(instance, volumehandle, volumefileobject)).toInt()
}

public fun FltOplockBreakH(oplock: Long, callbackdata: Long, flags: UInt, context: Long, waitcompletionroutine: PFLTOPLOCK_WAIT_COMPLETE_ROUTINE, prepostcallbackdataroutine: PFLTOPLOCK_PREPOST_CALLBACKDATA_ROUTINE): FLT_PREOP_CALLBACK_STATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltOplockBreakH", longArrayOf(oplock, callbackdata, flags.toLong(), context, Win32DynamicFfi.objectSlot(waitcompletionroutine), Win32DynamicFfi.objectSlot(prepostcallbackdataroutine))).toInt()
}

public fun FltOplockBreakToNone(oplock: Long, callbackdata: Long, context: Long, waitcompletionroutine: PFLTOPLOCK_WAIT_COMPLETE_ROUTINE, prepostcallbackdataroutine: PFLTOPLOCK_PREPOST_CALLBACKDATA_ROUTINE): FLT_PREOP_CALLBACK_STATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltOplockBreakToNone", longArrayOf(oplock, callbackdata, context, Win32DynamicFfi.objectSlot(waitcompletionroutine), Win32DynamicFfi.objectSlot(prepostcallbackdataroutine))).toInt()
}

public fun FltOplockBreakToNoneEx(oplock: Long, callbackdata: Long, flags: UInt, context: Long, waitcompletionroutine: PFLTOPLOCK_WAIT_COMPLETE_ROUTINE, prepostcallbackdataroutine: PFLTOPLOCK_PREPOST_CALLBACKDATA_ROUTINE): FLT_PREOP_CALLBACK_STATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltOplockBreakToNoneEx", longArrayOf(oplock, callbackdata, flags.toLong(), context, Win32DynamicFfi.objectSlot(waitcompletionroutine), Win32DynamicFfi.objectSlot(prepostcallbackdataroutine))).toInt()
}

public fun FltOplockFsctrl(oplock: Long, callbackdata: Long, opencount: UInt): FLT_PREOP_CALLBACK_STATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltOplockFsctrl", longArrayOf(oplock, callbackdata, opencount.toLong())).toInt()
}

public fun FltOplockFsctrlEx(oplock: Long, callbackdata: Long, opencount: UInt, flags: UInt): FLT_PREOP_CALLBACK_STATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltOplockFsctrlEx", longArrayOf(oplock, callbackdata, opencount.toLong(), flags.toLong())).toInt()
}

public fun FltOplockIsFastIoPossible(oplock: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("fltmgr.sys", "FltOplockIsFastIoPossible", longArrayOf(oplock))
    return (rawRet and 0xFFL) != 0L
}

public fun FltOplockIsSharedRequest(callbackdata: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("fltmgr.sys", "FltOplockIsSharedRequest", longArrayOf(callbackdata))
    return (rawRet and 0xFFL) != 0L
}

public fun FltOplockKeysEqual(fo1: Long, fo2: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("fltmgr.sys", "FltOplockKeysEqual", longArrayOf(fo1, fo2))
    return (rawRet and 0xFFL) != 0L
}

public fun FltParseFileName(filename: Long, extension: Long, stream: Long, finalcomponent: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltParseFileName", longArrayOf(filename, extension, stream, finalcomponent)).toInt()
}

public fun FltParseFileNameInformation(filenameinformation: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltParseFileNameInformation", longArrayOf(filenameinformation)).toInt()
}

public fun FltPerformAsynchronousIo(callbackdata: Long, callbackroutine: PFLT_COMPLETED_ASYNC_IO_CALLBACK, callbackcontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltPerformAsynchronousIo", longArrayOf(callbackdata, Win32DynamicFfi.objectSlot(callbackroutine), callbackcontext)).toInt()
}

public fun FltPerformSynchronousIo(callbackdata: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltPerformSynchronousIo", longArrayOf(callbackdata))
}

public fun FltPrePrepareComplete(instance: PFLT_INSTANCE, transaction: Long, transactioncontext: PFLT_CONTEXT): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltPrePrepareComplete", longArrayOf(instance, transaction, transactioncontext)).toInt()
}

public fun FltPrepareComplete(instance: PFLT_INSTANCE, transaction: Long, transactioncontext: PFLT_CONTEXT): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltPrepareComplete", longArrayOf(instance, transaction, transactioncontext)).toInt()
}

public fun FltPrepareToReuseEcp(filter: PFLT_FILTER, ecpcontext: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltPrepareToReuseEcp", longArrayOf(filter, ecpcontext))
}

public fun FltProcessFileLock(filelock: Long, callbackdata: Long, context: Long): FLT_PREOP_CALLBACK_STATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltProcessFileLock", longArrayOf(filelock, callbackdata, context)).toInt()
}

public fun FltPropagateActivityIdToThread(callbackdata: Long, propagateid: Long, originalid: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltPropagateActivityIdToThread", longArrayOf(callbackdata, propagateid, originalid)).toInt()
}

public fun FltPropagateIrpExtension(sourcedata: Long, targetdata: Long, flags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltPropagateIrpExtension", longArrayOf(sourcedata, targetdata, flags.toLong())).toInt()
}

public fun FltPurgeFileNameInformationCache(instance: PFLT_INSTANCE, fileobject: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltPurgeFileNameInformationCache", longArrayOf(instance, fileobject)).toInt()
}

public fun FltQueryDirectoryFile(instance: PFLT_INSTANCE, fileobject: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, returnsingleentry: Boolean, filename: Long, restartscan: Boolean, lengthreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltQueryDirectoryFile", longArrayOf(instance, fileobject, fileinformation, length.toLong(), fileinformationclass.toLong(), if (returnsingleentry) 1L else 0L, filename, if (restartscan) 1L else 0L, lengthreturned)).toInt()
}

public fun FltQueryDirectoryFileEx(instance: PFLT_INSTANCE, fileobject: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, queryflags: UInt, filename: Long, lengthreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltQueryDirectoryFileEx", longArrayOf(instance, fileobject, fileinformation, length.toLong(), fileinformationclass.toLong(), queryflags.toLong(), filename, lengthreturned)).toInt()
}

public fun FltQueryEaFile(instance: PFLT_INSTANCE, fileobject: Long, returnedeadata: Long, length: UInt, returnsingleentry: Boolean, ealist: Long, ealistlength: UInt, eaindex: Long, restartscan: Boolean, lengthreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltQueryEaFile", longArrayOf(instance, fileobject, returnedeadata, length.toLong(), if (returnsingleentry) 1L else 0L, ealist, ealistlength.toLong(), eaindex, if (restartscan) 1L else 0L, lengthreturned)).toInt()
}

public fun FltQueryInformationByName(filter: PFLT_FILTER, instance: PFLT_INSTANCE, objectattributes: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, drivercontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltQueryInformationByName", longArrayOf(filter, instance, objectattributes, iostatusblock, fileinformation, length.toLong(), fileinformationclass.toLong(), drivercontext)).toInt()
}

public fun FltQueryInformationFile(instance: PFLT_INSTANCE, fileobject: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, lengthreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltQueryInformationFile", longArrayOf(instance, fileobject, fileinformation, length.toLong(), fileinformationclass.toLong(), lengthreturned)).toInt()
}

public fun FltQueryQuotaInformationFile(instance: PFLT_INSTANCE, fileobject: Long, iostatusblock: Long, buffer: Long, length: UInt, returnsingleentry: Boolean, sidlist: Long, sidlistlength: UInt, startsid: Long, restartscan: Boolean, lengthreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltQueryQuotaInformationFile", longArrayOf(instance, fileobject, iostatusblock, buffer, length.toLong(), if (returnsingleentry) 1L else 0L, sidlist, sidlistlength.toLong(), startsid, if (restartscan) 1L else 0L, lengthreturned)).toInt()
}

public fun FltQuerySecurityObject(instance: PFLT_INSTANCE, fileobject: Long, securityinformation: UInt, securitydescriptor: PSECURITY_DESCRIPTOR, length: UInt, lengthneeded: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltQuerySecurityObject", longArrayOf(instance, fileobject, securityinformation.toLong(), securitydescriptor, length.toLong(), lengthneeded)).toInt()
}

public fun FltQueryVolumeInformation(instance: PFLT_INSTANCE, iosb: Long, fsinformation: Long, length: UInt, fsinformationclass: FS_INFORMATION_CLASS): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltQueryVolumeInformation", longArrayOf(instance, iosb, fsinformation, length.toLong(), fsinformationclass.toLong())).toInt()
}

public fun FltQueryVolumeInformationFile(instance: PFLT_INSTANCE, fileobject: Long, fsinformation: Long, length: UInt, fsinformationclass: FS_INFORMATION_CLASS, lengthreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltQueryVolumeInformationFile", longArrayOf(instance, fileobject, fsinformation, length.toLong(), fsinformationclass.toLong(), lengthreturned)).toInt()
}

public fun FltQueueDeferredIoWorkItem(fltworkitem: PFLT_DEFERRED_IO_WORKITEM, data: Long, workerroutine: PFLT_DEFERRED_IO_WORKITEM_ROUTINE, queuetype: WORK_QUEUE_TYPE, context: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltQueueDeferredIoWorkItem", longArrayOf(fltworkitem, data, Win32DynamicFfi.objectSlot(workerroutine), queuetype.toLong(), context)).toInt()
}

public fun FltQueueGenericWorkItem(fltworkitem: PFLT_GENERIC_WORKITEM, fltobject: Long, workerroutine: PFLT_GENERIC_WORKITEM_ROUTINE, queuetype: WORK_QUEUE_TYPE, context: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltQueueGenericWorkItem", longArrayOf(fltworkitem, fltobject, Win32DynamicFfi.objectSlot(workerroutine), queuetype.toLong(), context)).toInt()
}

public fun FltReadFile(initiatinginstance: PFLT_INSTANCE, fileobject: Long, byteoffset: Long, length: UInt, buffer: Long, flags: UInt, bytesread: Long, callbackroutine: PFLT_COMPLETED_ASYNC_IO_CALLBACK, callbackcontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltReadFile", longArrayOf(initiatinginstance, fileobject, byteoffset, length.toLong(), buffer, flags.toLong(), bytesread, Win32DynamicFfi.objectSlot(callbackroutine), callbackcontext)).toInt()
}

public fun FltReadFileEx(initiatinginstance: PFLT_INSTANCE, fileobject: Long, byteoffset: Long, length: UInt, buffer: Long, flags: UInt, bytesread: Long, callbackroutine: PFLT_COMPLETED_ASYNC_IO_CALLBACK, callbackcontext: Long, key: Long, mdl: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltReadFileEx", longArrayOf(initiatinginstance, fileobject, byteoffset, length.toLong(), buffer, flags.toLong(), bytesread, Win32DynamicFfi.objectSlot(callbackroutine), callbackcontext, key, mdl)).toInt()
}

public fun FltReferenceContext(context: PFLT_CONTEXT) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltReferenceContext", longArrayOf(context))
}

public fun FltReferenceFileNameInformation(filenameinformation: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltReferenceFileNameInformation", longArrayOf(filenameinformation))
}

public fun FltRegisterFilter(driver: Long, registration: Long, retfilter: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltRegisterFilter", longArrayOf(driver, registration, retfilter)).toInt()
}

public fun FltRegisterForDataScan(instance: PFLT_INSTANCE): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltRegisterForDataScan", longArrayOf(instance)).toInt()
}

public fun FltReissueSynchronousIo(initiatinginstance: PFLT_INSTANCE, callbackdata: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltReissueSynchronousIo", longArrayOf(initiatinginstance, callbackdata))
}

public fun FltReleaseContext(context: PFLT_CONTEXT) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltReleaseContext", longArrayOf(context))
}

public fun FltReleaseContexts(contexts: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltReleaseContexts", longArrayOf(contexts))
}

public fun FltReleaseContextsEx(contextssize: ULong, contexts: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltReleaseContextsEx", longArrayOf(contextssize.toLong(), contexts))
}

public fun FltReleaseFileNameInformation(filenameinformation: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltReleaseFileNameInformation", longArrayOf(filenameinformation))
}

public fun FltReleasePushLock(pushlock: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltReleasePushLock", longArrayOf(pushlock))
}

public fun FltReleasePushLockEx(pushlock: Long, flags: UInt) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltReleasePushLockEx", longArrayOf(pushlock, flags.toLong()))
}

public fun FltReleaseResource(resource: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltReleaseResource", longArrayOf(resource))
}

public fun FltRemoveExtraCreateParameter(filter: PFLT_FILTER, ecplist: Long, ecptype: Long, ecpcontext: Long, ecpcontextsize: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltRemoveExtraCreateParameter", longArrayOf(filter, ecplist, ecptype, ecpcontext, ecpcontextsize)).toInt()
}

public fun FltRemoveOpenReparseEntry(filter: PFLT_FILTER, data: Long, openreparseentry: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltRemoveOpenReparseEntry", longArrayOf(filter, data, openreparseentry))
}

public fun FltRequestFileInfoOnCreateCompletion(filter: PFLT_FILTER, data: Long, infoclassflags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltRequestFileInfoOnCreateCompletion", longArrayOf(filter, data, infoclassflags.toLong())).toInt()
}

public fun FltRequestOperationStatusCallback(data: Long, callbackroutine: PFLT_GET_OPERATION_STATUS_CALLBACK, requestercontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltRequestOperationStatusCallback", longArrayOf(data, Win32DynamicFfi.objectSlot(callbackroutine), requestercontext)).toInt()
}

public fun FltRetainSwappedBufferMdlAddress(callbackdata: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltRetainSwappedBufferMdlAddress", longArrayOf(callbackdata))
}

public fun FltRetrieveFileInfoOnCreateCompletion(filter: PFLT_FILTER, data: Long, infoclass: UInt, size: Long): Long {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltRetrieveFileInfoOnCreateCompletion", longArrayOf(filter, data, infoclass.toLong(), size))
}

public fun FltRetrieveFileInfoOnCreateCompletionEx(filter: PFLT_FILTER, data: Long, infoclass: UInt, retinfosize: Long, retinfobuffer: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltRetrieveFileInfoOnCreateCompletionEx", longArrayOf(filter, data, infoclass.toLong(), retinfosize, retinfobuffer)).toInt()
}

public fun FltRetrieveIoPriorityInfo(data: Long, fileobject: Long, thread: PETHREAD, priorityinfo: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltRetrieveIoPriorityInfo", longArrayOf(data, fileobject, thread, priorityinfo)).toInt()
}

public fun FltReuseCallbackData(callbackdata: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltReuseCallbackData", longArrayOf(callbackdata))
}

public fun FltRollbackComplete(instance: PFLT_INSTANCE, transaction: Long, transactioncontext: PFLT_CONTEXT): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltRollbackComplete", longArrayOf(instance, transaction, transactioncontext)).toInt()
}

public fun FltRollbackEnlistment(instance: PFLT_INSTANCE, transaction: Long, transactioncontext: PFLT_CONTEXT): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltRollbackEnlistment", longArrayOf(instance, transaction, transactioncontext)).toInt()
}

public fun FltSendMessage(filter: PFLT_FILTER, clientport: Long, senderbuffer: Long, senderbufferlength: UInt, replybuffer: Long, replylength: Long, timeout: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltSendMessage", longArrayOf(filter, clientport, senderbuffer, senderbufferlength.toLong(), replybuffer, replylength, timeout)).toInt()
}

public fun FltSetActivityIdCallbackData(callbackdata: Long, guid: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltSetActivityIdCallbackData", longArrayOf(callbackdata, guid)).toInt()
}

public fun FltSetCallbackDataDirty(data: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltSetCallbackDataDirty", longArrayOf(data))
}

public fun FltSetCancelCompletion(callbackdata: Long, canceledcallback: PFLT_COMPLETE_CANCELED_CALLBACK): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltSetCancelCompletion", longArrayOf(callbackdata, Win32DynamicFfi.objectSlot(canceledcallback))).toInt()
}

public fun FltSetEaFile(instance: PFLT_INSTANCE, fileobject: Long, eabuffer: Long, length: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltSetEaFile", longArrayOf(instance, fileobject, eabuffer, length.toLong())).toInt()
}

public fun FltSetEcpListIntoCallbackData(filter: PFLT_FILTER, callbackdata: Long, ecplist: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltSetEcpListIntoCallbackData", longArrayOf(filter, callbackdata, ecplist)).toInt()
}

public fun FltSetFileContext(instance: PFLT_INSTANCE, fileobject: Long, operation: FLT_SET_CONTEXT_OPERATION, newcontext: PFLT_CONTEXT, oldcontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltSetFileContext", longArrayOf(instance, fileobject, operation.toLong(), newcontext, oldcontext)).toInt()
}

public fun FltSetFsZeroingOffset(data: Long, zeroingoffset: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltSetFsZeroingOffset", longArrayOf(data, zeroingoffset.toLong())).toInt()
}

public fun FltSetFsZeroingOffsetRequired(data: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltSetFsZeroingOffsetRequired", longArrayOf(data)).toInt()
}

public fun FltSetInformationFile(instance: PFLT_INSTANCE, fileobject: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltSetInformationFile", longArrayOf(instance, fileobject, fileinformation, length.toLong(), fileinformationclass.toLong())).toInt()
}

public fun FltSetInstanceContext(instance: PFLT_INSTANCE, operation: FLT_SET_CONTEXT_OPERATION, newcontext: PFLT_CONTEXT, oldcontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltSetInstanceContext", longArrayOf(instance, operation.toLong(), newcontext, oldcontext)).toInt()
}

public fun FltSetIoPriorityHintIntoCallbackData(data: Long, priorityhint: IO_PRIORITY_HINT): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltSetIoPriorityHintIntoCallbackData", longArrayOf(data, priorityhint.toLong())).toInt()
}

public fun FltSetIoPriorityHintIntoFileObject(fileobject: Long, priorityhint: IO_PRIORITY_HINT): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltSetIoPriorityHintIntoFileObject", longArrayOf(fileobject, priorityhint.toLong())).toInt()
}

public fun FltSetIoPriorityHintIntoThread(thread: PETHREAD, priorityhint: IO_PRIORITY_HINT): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltSetIoPriorityHintIntoThread", longArrayOf(thread, priorityhint.toLong())).toInt()
}

public fun FltSetQuotaInformationFile(instance: PFLT_INSTANCE, fileobject: Long, buffer: Long, length: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltSetQuotaInformationFile", longArrayOf(instance, fileobject, buffer, length.toLong())).toInt()
}

public fun FltSetSecurityObject(instance: PFLT_INSTANCE, fileobject: Long, securityinformation: UInt, securitydescriptor: PSECURITY_DESCRIPTOR): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltSetSecurityObject", longArrayOf(instance, fileobject, securityinformation.toLong(), securitydescriptor)).toInt()
}

public fun FltSetStreamContext(instance: PFLT_INSTANCE, fileobject: Long, operation: FLT_SET_CONTEXT_OPERATION, newcontext: PFLT_CONTEXT, oldcontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltSetStreamContext", longArrayOf(instance, fileobject, operation.toLong(), newcontext, oldcontext)).toInt()
}

public fun FltSetStreamHandleContext(instance: PFLT_INSTANCE, fileobject: Long, operation: FLT_SET_CONTEXT_OPERATION, newcontext: PFLT_CONTEXT, oldcontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltSetStreamHandleContext", longArrayOf(instance, fileobject, operation.toLong(), newcontext, oldcontext)).toInt()
}

public fun FltSetTransactionContext(instance: PFLT_INSTANCE, transaction: Long, operation: FLT_SET_CONTEXT_OPERATION, newcontext: PFLT_CONTEXT, oldcontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltSetTransactionContext", longArrayOf(instance, transaction, operation.toLong(), newcontext, oldcontext)).toInt()
}

public fun FltSetVolumeContext(volume: PFLT_VOLUME, operation: FLT_SET_CONTEXT_OPERATION, newcontext: PFLT_CONTEXT, oldcontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltSetVolumeContext", longArrayOf(volume, operation.toLong(), newcontext, oldcontext)).toInt()
}

public fun FltSetVolumeInformation(instance: PFLT_INSTANCE, iosb: Long, fsinformation: Long, length: UInt, fsinformationclass: FS_INFORMATION_CLASS): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltSetVolumeInformation", longArrayOf(instance, iosb, fsinformation, length.toLong(), fsinformationclass.toLong())).toInt()
}

public fun FltStartFiltering(filter: PFLT_FILTER): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltStartFiltering", longArrayOf(filter)).toInt()
}

public fun FltSupportsFileContexts(fileobject: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("fltmgr.sys", "FltSupportsFileContexts", longArrayOf(fileobject))
    return (rawRet and 0xFFL) != 0L
}

public fun FltSupportsFileContextsEx(fileobject: Long, instance: PFLT_INSTANCE): Boolean {
    val rawRet = Win32DynamicFfi.invoke("fltmgr.sys", "FltSupportsFileContextsEx", longArrayOf(fileobject, instance))
    return (rawRet and 0xFFL) != 0L
}

public fun FltSupportsStreamContexts(fileobject: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("fltmgr.sys", "FltSupportsStreamContexts", longArrayOf(fileobject))
    return (rawRet and 0xFFL) != 0L
}

public fun FltSupportsStreamHandleContexts(fileobject: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("fltmgr.sys", "FltSupportsStreamHandleContexts", longArrayOf(fileobject))
    return (rawRet and 0xFFL) != 0L
}

public fun FltTagFile(initiatinginstance: PFLT_INSTANCE, fileobject: Long, filetag: UInt, guid: Long, databuffer: Long, databufferlength: UShort): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltTagFile", longArrayOf(initiatinginstance, fileobject, filetag.toLong(), guid, databuffer, databufferlength.toLong())).toInt()
}

public fun FltTagFileEx(initiatinginstance: PFLT_INSTANCE, fileobject: Long, filetag: UInt, guid: Long, databuffer: Long, databufferlength: UShort, existingfiletag: UInt, existingguid: Long, flags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltTagFileEx", longArrayOf(initiatinginstance, fileobject, filetag.toLong(), guid, databuffer, databufferlength.toLong(), existingfiletag.toLong(), existingguid, flags.toLong())).toInt()
}

public fun FltUninitializeFileLock(filelock: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltUninitializeFileLock", longArrayOf(filelock))
}

public fun FltUninitializeOplock(oplock: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltUninitializeOplock", longArrayOf(oplock))
}

public fun FltUnloadFilter(filtername: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltUnloadFilter", longArrayOf(filtername)).toInt()
}

public fun FltUnregisterFilter(filter: PFLT_FILTER) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltUnregisterFilter", longArrayOf(filter))
}

public fun FltUntagFile(initiatinginstance: PFLT_INSTANCE, fileobject: Long, filetag: UInt, guid: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltUntagFile", longArrayOf(initiatinginstance, fileobject, filetag.toLong(), guid)).toInt()
}

public fun FltVetoBypassIo(callbackdata: Long, fltobjects: Long, operationstatus: NTSTATUS, failurereason: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltVetoBypassIo", longArrayOf(callbackdata, fltobjects, operationstatus.toLong(), failurereason)).toInt()
}

public fun FltWriteFile(initiatinginstance: PFLT_INSTANCE, fileobject: Long, byteoffset: Long, length: UInt, buffer: Long, flags: UInt, byteswritten: Long, callbackroutine: PFLT_COMPLETED_ASYNC_IO_CALLBACK, callbackcontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltWriteFile", longArrayOf(initiatinginstance, fileobject, byteoffset, length.toLong(), buffer, flags.toLong(), byteswritten, Win32DynamicFfi.objectSlot(callbackroutine), callbackcontext)).toInt()
}

public fun FltWriteFileEx(initiatinginstance: PFLT_INSTANCE, fileobject: Long, byteoffset: Long, length: UInt, buffer: Long, flags: UInt, byteswritten: Long, callbackroutine: PFLT_COMPLETED_ASYNC_IO_CALLBACK, callbackcontext: Long, key: Long, mdl: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltWriteFileEx", longArrayOf(initiatinginstance, fileobject, byteoffset, length.toLong(), buffer, flags.toLong(), byteswritten, Win32DynamicFfi.objectSlot(callbackroutine), callbackcontext, key, mdl)).toInt()
}

public fun FltpTraceRedirectedFileIo(originatingfileobject: Long, childcallbackdata: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltpTraceRedirectedFileIo", longArrayOf(originatingfileobject, childcallbackdata)).toInt()
}
