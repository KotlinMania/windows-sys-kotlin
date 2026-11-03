package io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FILE_INFORMATION_CLASS
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FS_INFORMATION_CLASS
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.PCHECK_FOR_TRAVERSE_ACCESS
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.PFILTER_REPORT_CHANGE
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.PFSRTL_EXTRA_CREATE_PARAMETER_CLEANUP_CALLBACK
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.PUNLOCK_ROUTINE

public fun interface FnCallback {
    public operator fun invoke(context: Long, callbackdata: Long): Win32.Foundation.NTSTATUS
}

public fun interface FnCallback1 {
    public operator fun invoke(cbdq: Long, cbd: Long, insertcontext: Long): Win32.Foundation.NTSTATUS
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
    public operator fun invoke(clientport: PFLT_PORT, serverportcookie: Long, connectioncontext: Long, sizeofcontext: UInt, connectionportcookie: Long): Win32.Foundation.NTSTATUS
}

public fun interface FnCallback6 {
    public operator fun invoke(connectioncookie: Long)
}

public fun interface FnCallback7 {
    public operator fun invoke(portcookie: Long, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt, returnoutputbufferlength: Long): Win32.Foundation.NTSTATUS
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
    public operator fun invoke(fltobjects: Long, iopbsnapshot: Long, operationstatus: Win32.Foundation.NTSTATUS, requestercontext: Long)
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

public fun FltAddOpenReparseEntry(filter: PFLT_FILTER, data: Long, openreparseentry: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltAddOpenReparseEntry", longArrayOf(filter, data, openreparseentry))
    return Win32.Foundation.NTSTATUS()
}

public fun FltAdjustDeviceStackSizeForIoRedirection(sourceinstance: PFLT_INSTANCE, targetinstance: PFLT_INSTANCE, sourcedevicestacksizemodified: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltAdjustDeviceStackSizeForIoRedirection", longArrayOf(sourceinstance, targetinstance, sourcedevicestacksizemodified))
    return Win32.Foundation.NTSTATUS()
}

public fun FltAllocateCallbackData(instance: PFLT_INSTANCE, fileobject: Long, retnewcallbackdata: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltAllocateCallbackData", longArrayOf(instance, fileobject, retnewcallbackdata))
    return Win32.Foundation.NTSTATUS()
}

public fun FltAllocateCallbackDataEx(instance: PFLT_INSTANCE, fileobject: Long, flags: UInt, retnewcallbackdata: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltAllocateCallbackDataEx", longArrayOf(instance, fileobject, flags.toLong(), retnewcallbackdata))
    return Win32.Foundation.NTSTATUS()
}

public fun FltAllocateContext(filter: PFLT_FILTER, contexttype: UShort, contextsize: ULong, pooltype: Foundation.POOL_TYPE, returnedcontext: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltAllocateContext", longArrayOf(filter, contexttype.toLong(), contextsize.toLong(), Win32DynamicFfi.objectSlot(pooltype), returnedcontext))
    return Win32.Foundation.NTSTATUS()
}

public fun FltAllocateDeferredIoWorkItem(): PFLT_DEFERRED_IO_WORKITEM {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltAllocateDeferredIoWorkItem", longArrayOf())
}

public fun FltAllocateExtraCreateParameter(filter: PFLT_FILTER, ecptype: Long, sizeofcontext: UInt, flags: UInt, cleanupcallback: PFSRTL_EXTRA_CREATE_PARAMETER_CLEANUP_CALLBACK, pooltag: UInt, ecpcontext: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltAllocateExtraCreateParameter", longArrayOf(filter, ecptype, sizeofcontext.toLong(), flags.toLong(), Win32DynamicFfi.objectSlot(cleanupcallback), pooltag.toLong(), ecpcontext))
    return Win32.Foundation.NTSTATUS()
}

public fun FltAllocateExtraCreateParameterFromLookasideList(filter: PFLT_FILTER, ecptype: Long, sizeofcontext: UInt, flags: UInt, cleanupcallback: PFSRTL_EXTRA_CREATE_PARAMETER_CLEANUP_CALLBACK, lookasidelist: Long, ecpcontext: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltAllocateExtraCreateParameterFromLookasideList", longArrayOf(filter, ecptype, sizeofcontext.toLong(), flags.toLong(), Win32DynamicFfi.objectSlot(cleanupcallback), lookasidelist, ecpcontext))
    return Win32.Foundation.NTSTATUS()
}

public fun FltAllocateExtraCreateParameterList(filter: PFLT_FILTER, flags: UInt, ecplist: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltAllocateExtraCreateParameterList", longArrayOf(filter, flags.toLong(), ecplist))
    return Win32.Foundation.NTSTATUS()
}

public fun FltAllocateFileLock(completelockcallbackdataroutine: PFLT_COMPLETE_LOCK_CALLBACK_DATA_ROUTINE, unlockroutine: PUNLOCK_ROUTINE): Long {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltAllocateFileLock", longArrayOf(Win32DynamicFfi.objectSlot(completelockcallbackdataroutine), Win32DynamicFfi.objectSlot(unlockroutine)))
}

public fun FltAllocateGenericWorkItem(): PFLT_GENERIC_WORKITEM {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltAllocateGenericWorkItem", longArrayOf())
}

public fun FltAllocatePoolAlignedWithTag(instance: PFLT_INSTANCE, pooltype: Foundation.POOL_TYPE, numberofbytes: ULong, tag: UInt): Long {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltAllocatePoolAlignedWithTag", longArrayOf(instance, Win32DynamicFfi.objectSlot(pooltype), numberofbytes.toLong(), tag.toLong()))
}

public fun FltApplyPriorityInfoThread(inputpriorityinfo: Long, outputpriorityinfo: Long, thread: Foundation.PETHREAD): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltApplyPriorityInfoThread", longArrayOf(inputpriorityinfo, outputpriorityinfo, Win32DynamicFfi.objectSlot(thread)))
    return Win32.Foundation.NTSTATUS()
}

public fun FltAttachVolume(filter: PFLT_FILTER, volume: PFLT_VOLUME, instancename: Long, retinstance: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltAttachVolume", longArrayOf(filter, volume, instancename, retinstance))
    return Win32.Foundation.NTSTATUS()
}

public fun FltAttachVolumeAtAltitude(filter: PFLT_FILTER, volume: PFLT_VOLUME, altitude: Long, instancename: Long, retinstance: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltAttachVolumeAtAltitude", longArrayOf(filter, volume, altitude, instancename, retinstance))
    return Win32.Foundation.NTSTATUS()
}

public fun FltBuildDefaultSecurityDescriptor(securitydescriptor: Long, desiredaccess: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltBuildDefaultSecurityDescriptor", longArrayOf(securitydescriptor, desiredaccess.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun FltCancelFileOpen(instance: PFLT_INSTANCE, fileobject: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltCancelFileOpen", longArrayOf(instance, fileobject))
}

public fun FltCancelIo(callbackdata: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("fltmgr.sys", "FltCancelIo", longArrayOf(callbackdata))
    return (rawRet and 0xFFL) != 0L
}

public fun FltCancellableWaitForMultipleObjects(count: UInt, objectarray: Long, waittype: Win32.System.Kernel.WAIT_TYPE, timeout: Long, waitblockarray: Long, callbackdata: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltCancellableWaitForMultipleObjects", longArrayOf(count.toLong(), objectarray, Win32DynamicFfi.objectSlot(waittype), timeout, waitblockarray, callbackdata))
    return Win32.Foundation.NTSTATUS()
}

public fun FltCancellableWaitForSingleObject(obj: Long, timeout: Long, callbackdata: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltCancellableWaitForSingleObject", longArrayOf(obj, timeout, callbackdata))
    return Win32.Foundation.NTSTATUS()
}

public fun FltCbdqDisable(cbdq: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltCbdqDisable", longArrayOf(cbdq))
}

public fun FltCbdqEnable(cbdq: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltCbdqEnable", longArrayOf(cbdq))
}

public fun FltCbdqInitialize(instance: PFLT_INSTANCE, cbdq: Long, cbdqinsertio: PFLT_CALLBACK_DATA_QUEUE_INSERT_IO, cbdqremoveio: PFLT_CALLBACK_DATA_QUEUE_REMOVE_IO, cbdqpeeknextio: PFLT_CALLBACK_DATA_QUEUE_PEEK_NEXT_IO, cbdqacquire: PFLT_CALLBACK_DATA_QUEUE_ACQUIRE, cbdqrelease: PFLT_CALLBACK_DATA_QUEUE_RELEASE, cbdqcompletecanceledio: PFLT_CALLBACK_DATA_QUEUE_COMPLETE_CANCELED_IO): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltCbdqInitialize", longArrayOf(instance, cbdq, Win32DynamicFfi.objectSlot(cbdqinsertio), Win32DynamicFfi.objectSlot(cbdqremoveio), Win32DynamicFfi.objectSlot(cbdqpeeknextio), Win32DynamicFfi.objectSlot(cbdqacquire), Win32DynamicFfi.objectSlot(cbdqrelease), Win32DynamicFfi.objectSlot(cbdqcompletecanceledio)))
    return Win32.Foundation.NTSTATUS()
}

public fun FltCbdqInsertIo(cbdq: Long, cbd: Long, context: Long, insertcontext: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltCbdqInsertIo", longArrayOf(cbdq, cbd, context, insertcontext))
    return Win32.Foundation.NTSTATUS()
}

public fun FltCbdqRemoveIo(cbdq: Long, context: Long): Long {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltCbdqRemoveIo", longArrayOf(cbdq, context))
}

public fun FltCbdqRemoveNextIo(cbdq: Long, peekcontext: Long): Long {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltCbdqRemoveNextIo", longArrayOf(cbdq, peekcontext))
}

public fun FltCheckAndGrowNameControl(namectrl: Long, newsize: UShort): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltCheckAndGrowNameControl", longArrayOf(namectrl, newsize.toLong()))
    return Win32.Foundation.NTSTATUS()
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

public fun FltClearCancelCompletion(callbackdata: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltClearCancelCompletion", longArrayOf(callbackdata))
    return Win32.Foundation.NTSTATUS()
}

public fun FltClose(filehandle: Win32.Foundation.HANDLE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltClose", longArrayOf(Win32DynamicFfi.objectSlot(filehandle)))
    return Win32.Foundation.NTSTATUS()
}

public fun FltCloseClientPort(filter: PFLT_FILTER, clientport: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltCloseClientPort", longArrayOf(filter, clientport))
}

public fun FltCloseCommunicationPort(serverport: PFLT_PORT) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltCloseCommunicationPort", longArrayOf(serverport))
}

public fun FltCloseSectionForDataScan(sectioncontext: PFLT_CONTEXT): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltCloseSectionForDataScan", longArrayOf(sectioncontext))
    return Win32.Foundation.NTSTATUS()
}

public fun FltCommitComplete(instance: PFLT_INSTANCE, transaction: Long, transactioncontext: PFLT_CONTEXT): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltCommitComplete", longArrayOf(instance, transaction, transactioncontext))
    return Win32.Foundation.NTSTATUS()
}

public fun FltCommitFinalizeComplete(instance: PFLT_INSTANCE, transaction: Long, transactioncontext: PFLT_CONTEXT): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltCommitFinalizeComplete", longArrayOf(instance, transaction, transactioncontext))
    return Win32.Foundation.NTSTATUS()
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

public fun FltCopyOpenReparseList(filter: PFLT_FILTER, data: Long, ecplist: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltCopyOpenReparseList", longArrayOf(filter, data, ecplist))
    return Win32.Foundation.NTSTATUS()
}

public fun FltCreateCommunicationPort(filter: PFLT_FILTER, serverport: Long, objectattributes: Long, serverportcookie: Long, connectnotifycallback: PFLT_CONNECT_NOTIFY, disconnectnotifycallback: PFLT_DISCONNECT_NOTIFY, messagenotifycallback: PFLT_MESSAGE_NOTIFY, maxconnections: Int): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltCreateCommunicationPort", longArrayOf(filter, serverport, objectattributes, serverportcookie, Win32DynamicFfi.objectSlot(connectnotifycallback), Win32DynamicFfi.objectSlot(disconnectnotifycallback), Win32DynamicFfi.objectSlot(messagenotifycallback), maxconnections.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun FltCreateFile(filter: PFLT_FILTER, instance: PFLT_INSTANCE, filehandle: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: Long, ealength: UInt, flags: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltCreateFile", longArrayOf(filter, instance, filehandle, desiredaccess.toLong(), objectattributes, iostatusblock, allocationsize, fileattributes.toLong(), shareaccess.toLong(), createdisposition.toLong(), createoptions.toLong(), eabuffer, ealength.toLong(), flags.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun FltCreateFileEx(filter: PFLT_FILTER, instance: PFLT_INSTANCE, filehandle: Long, fileobject: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: Long, ealength: UInt, flags: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltCreateFileEx", longArrayOf(filter, instance, filehandle, fileobject, desiredaccess.toLong(), objectattributes, iostatusblock, allocationsize, fileattributes.toLong(), shareaccess.toLong(), createdisposition.toLong(), createoptions.toLong(), eabuffer, ealength.toLong(), flags.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun FltCreateFileEx2(filter: PFLT_FILTER, instance: PFLT_INSTANCE, filehandle: Long, fileobject: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: Long, ealength: UInt, flags: UInt, drivercontext: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltCreateFileEx2", longArrayOf(filter, instance, filehandle, fileobject, desiredaccess.toLong(), objectattributes, iostatusblock, allocationsize, fileattributes.toLong(), shareaccess.toLong(), createdisposition.toLong(), createoptions.toLong(), eabuffer, ealength.toLong(), flags.toLong(), drivercontext))
    return Win32.Foundation.NTSTATUS()
}

public fun FltCreateMailslotFile(filter: PFLT_FILTER, instance: PFLT_INSTANCE, filehandle: Long, fileobject: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, createoptions: UInt, mailslotquota: UInt, maximummessagesize: UInt, readtimeout: Long, drivercontext: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltCreateMailslotFile", longArrayOf(filter, instance, filehandle, fileobject, desiredaccess.toLong(), objectattributes, iostatusblock, createoptions.toLong(), mailslotquota.toLong(), maximummessagesize.toLong(), readtimeout, drivercontext))
    return Win32.Foundation.NTSTATUS()
}

public fun FltCreateNamedPipeFile(filter: PFLT_FILTER, instance: PFLT_INSTANCE, filehandle: Long, fileobject: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, namedpipetype: UInt, readmode: UInt, completionmode: UInt, maximuminstances: UInt, inboundquota: UInt, outboundquota: UInt, defaulttimeout: Long, drivercontext: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltCreateNamedPipeFile", longArrayOf(filter, instance, filehandle, fileobject, desiredaccess.toLong(), objectattributes, iostatusblock, shareaccess.toLong(), createdisposition.toLong(), createoptions.toLong(), namedpipetype.toLong(), readmode.toLong(), completionmode.toLong(), maximuminstances.toLong(), inboundquota.toLong(), outboundquota.toLong(), defaulttimeout, drivercontext))
    return Win32.Foundation.NTSTATUS()
}

public fun FltCreateSectionForDataScan(instance: PFLT_INSTANCE, fileobject: Long, sectioncontext: PFLT_CONTEXT, desiredaccess: UInt, objectattributes: Long, maximumsize: Long, sectionpageprotection: UInt, allocationattributes: UInt, flags: UInt, sectionhandle: Long, sectionobject: Long, sectionfilesize: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltCreateSectionForDataScan", longArrayOf(instance, fileobject, sectioncontext, desiredaccess.toLong(), objectattributes, maximumsize, sectionpageprotection.toLong(), allocationattributes.toLong(), flags.toLong(), sectionhandle, sectionobject, sectionfilesize))
    return Win32.Foundation.NTSTATUS()
}

public fun FltCreateSystemVolumeInformationFolder(instance: PFLT_INSTANCE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltCreateSystemVolumeInformationFolder", longArrayOf(instance))
    return Win32.Foundation.NTSTATUS()
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

public fun FltDecodeParameters(callbackdata: Long, mdladdresspointer: Long, buffer: Long, length: Long, desiredaccess: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltDecodeParameters", longArrayOf(callbackdata, mdladdresspointer, buffer, length, desiredaccess))
    return Win32.Foundation.NTSTATUS()
}

public fun FltDeleteContext(context: PFLT_CONTEXT) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltDeleteContext", longArrayOf(context))
}

public fun FltDeleteExtraCreateParameterLookasideList(filter: PFLT_FILTER, lookaside: Long, flags: UInt) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltDeleteExtraCreateParameterLookasideList", longArrayOf(filter, lookaside, flags.toLong()))
}

public fun FltDeleteFileContext(instance: PFLT_INSTANCE, fileobject: Long, oldcontext: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltDeleteFileContext", longArrayOf(instance, fileobject, oldcontext))
    return Win32.Foundation.NTSTATUS()
}

public fun FltDeleteInstanceContext(instance: PFLT_INSTANCE, oldcontext: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltDeleteInstanceContext", longArrayOf(instance, oldcontext))
    return Win32.Foundation.NTSTATUS()
}

public fun FltDeletePushLock(pushlock: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltDeletePushLock", longArrayOf(pushlock))
}

public fun FltDeleteStreamContext(instance: PFLT_INSTANCE, fileobject: Long, oldcontext: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltDeleteStreamContext", longArrayOf(instance, fileobject, oldcontext))
    return Win32.Foundation.NTSTATUS()
}

public fun FltDeleteStreamHandleContext(instance: PFLT_INSTANCE, fileobject: Long, oldcontext: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltDeleteStreamHandleContext", longArrayOf(instance, fileobject, oldcontext))
    return Win32.Foundation.NTSTATUS()
}

public fun FltDeleteTransactionContext(instance: PFLT_INSTANCE, transaction: Long, oldcontext: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltDeleteTransactionContext", longArrayOf(instance, transaction, oldcontext))
    return Win32.Foundation.NTSTATUS()
}

public fun FltDeleteVolumeContext(filter: PFLT_FILTER, volume: PFLT_VOLUME, oldcontext: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltDeleteVolumeContext", longArrayOf(filter, volume, oldcontext))
    return Win32.Foundation.NTSTATUS()
}

public fun FltDetachVolume(filter: PFLT_FILTER, volume: PFLT_VOLUME, instancename: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltDetachVolume", longArrayOf(filter, volume, instancename))
    return Win32.Foundation.NTSTATUS()
}

public fun FltDeviceIoControlFile(instance: PFLT_INSTANCE, fileobject: Long, iocontrolcode: UInt, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt, lengthreturned: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltDeviceIoControlFile", longArrayOf(instance, fileobject, iocontrolcode.toLong(), inputbuffer, inputbufferlength.toLong(), outputbuffer, outputbufferlength.toLong(), lengthreturned))
    return Win32.Foundation.NTSTATUS()
}

public fun FltDoCompletionProcessingWhenSafe(data: Long, fltobjects: Long, completioncontext: Long, flags: UInt, safepostcallback: PFLT_POST_OPERATION_CALLBACK, retpostoperationstatus: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("fltmgr.sys", "FltDoCompletionProcessingWhenSafe", longArrayOf(data, fltobjects, completioncontext, flags.toLong(), Win32DynamicFfi.objectSlot(safepostcallback), retpostoperationstatus))
    return (rawRet and 0xFFL) != 0L
}

public fun FltEnlistInTransaction(instance: PFLT_INSTANCE, transaction: Long, transactioncontext: PFLT_CONTEXT, notificationmask: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltEnlistInTransaction", longArrayOf(instance, transaction, transactioncontext, notificationmask.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun FltEnumerateFilterInformation(index: UInt, informationclass: Win32.Storage.InstallableFileSystems.FILTER_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltEnumerateFilterInformation", longArrayOf(index.toLong(), Win32DynamicFfi.objectSlot(informationclass), buffer, buffersize.toLong(), bytesreturned))
    return Win32.Foundation.NTSTATUS()
}

public fun FltEnumerateFilters(filterlist: Long, filterlistsize: UInt, numberfiltersreturned: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltEnumerateFilters", longArrayOf(filterlist, filterlistsize.toLong(), numberfiltersreturned))
    return Win32.Foundation.NTSTATUS()
}

public fun FltEnumerateInstanceInformationByDeviceObject(deviceobject: Long, index: UInt, informationclass: Win32.Storage.InstallableFileSystems.INSTANCE_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltEnumerateInstanceInformationByDeviceObject", longArrayOf(deviceobject, index.toLong(), Win32DynamicFfi.objectSlot(informationclass), buffer, buffersize.toLong(), bytesreturned))
    return Win32.Foundation.NTSTATUS()
}

public fun FltEnumerateInstanceInformationByFilter(filter: PFLT_FILTER, index: UInt, informationclass: Win32.Storage.InstallableFileSystems.INSTANCE_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltEnumerateInstanceInformationByFilter", longArrayOf(filter, index.toLong(), Win32DynamicFfi.objectSlot(informationclass), buffer, buffersize.toLong(), bytesreturned))
    return Win32.Foundation.NTSTATUS()
}

public fun FltEnumerateInstanceInformationByVolume(volume: PFLT_VOLUME, index: UInt, informationclass: Win32.Storage.InstallableFileSystems.INSTANCE_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltEnumerateInstanceInformationByVolume", longArrayOf(volume, index.toLong(), Win32DynamicFfi.objectSlot(informationclass), buffer, buffersize.toLong(), bytesreturned))
    return Win32.Foundation.NTSTATUS()
}

public fun FltEnumerateInstanceInformationByVolumeName(volumename: Long, index: UInt, informationclass: Win32.Storage.InstallableFileSystems.INSTANCE_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltEnumerateInstanceInformationByVolumeName", longArrayOf(volumename, index.toLong(), Win32DynamicFfi.objectSlot(informationclass), buffer, buffersize.toLong(), bytesreturned))
    return Win32.Foundation.NTSTATUS()
}

public fun FltEnumerateInstances(volume: PFLT_VOLUME, filter: PFLT_FILTER, instancelist: Long, instancelistsize: UInt, numberinstancesreturned: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltEnumerateInstances", longArrayOf(volume, filter, instancelist, instancelistsize.toLong(), numberinstancesreturned))
    return Win32.Foundation.NTSTATUS()
}

public fun FltEnumerateVolumeInformation(filter: PFLT_FILTER, index: UInt, informationclass: Win32.Storage.InstallableFileSystems.FILTER_VOLUME_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltEnumerateVolumeInformation", longArrayOf(filter, index.toLong(), Win32DynamicFfi.objectSlot(informationclass), buffer, buffersize.toLong(), bytesreturned))
    return Win32.Foundation.NTSTATUS()
}

public fun FltEnumerateVolumes(filter: PFLT_FILTER, volumelist: Long, volumelistsize: UInt, numbervolumesreturned: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltEnumerateVolumes", longArrayOf(filter, volumelist, volumelistsize.toLong(), numbervolumesreturned))
    return Win32.Foundation.NTSTATUS()
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

public fun FltFindExtraCreateParameter(filter: PFLT_FILTER, ecplist: Long, ecptype: Long, ecpcontext: Long, ecpcontextsize: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltFindExtraCreateParameter", longArrayOf(filter, ecplist, ecptype, ecpcontext, ecpcontextsize))
    return Win32.Foundation.NTSTATUS()
}

public fun FltFlushBuffers(instance: PFLT_INSTANCE, fileobject: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltFlushBuffers", longArrayOf(instance, fileobject))
    return Win32.Foundation.NTSTATUS()
}

public fun FltFlushBuffers2(instance: PFLT_INSTANCE, fileobject: Long, flushtype: UInt, callbackdata: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltFlushBuffers2", longArrayOf(instance, fileobject, flushtype.toLong(), callbackdata))
    return Win32.Foundation.NTSTATUS()
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

public fun FltFreeSecurityDescriptor(securitydescriptor: Win32.Security.PSECURITY_DESCRIPTOR) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltFreeSecurityDescriptor", longArrayOf(Win32DynamicFfi.objectSlot(securitydescriptor)))
}

public fun FltFsControlFile(instance: PFLT_INSTANCE, fileobject: Long, fscontrolcode: UInt, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt, lengthreturned: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltFsControlFile", longArrayOf(instance, fileobject, fscontrolcode.toLong(), inputbuffer, inputbufferlength.toLong(), outputbuffer, outputbufferlength.toLong(), lengthreturned))
    return Win32.Foundation.NTSTATUS()
}

public fun FltGetActivityIdCallbackData(callbackdata: Long, guid: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltGetActivityIdCallbackData", longArrayOf(callbackdata, guid))
    return Win32.Foundation.NTSTATUS()
}

public fun FltGetBottomInstance(volume: PFLT_VOLUME, instance: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltGetBottomInstance", longArrayOf(volume, instance))
    return Win32.Foundation.NTSTATUS()
}

public fun FltGetContexts(fltobjects: Long, desiredcontexts: UShort, contexts: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltGetContexts", longArrayOf(fltobjects, desiredcontexts.toLong(), contexts))
}

public fun FltGetContextsEx(fltobjects: Long, desiredcontexts: UShort, contextssize: ULong, contexts: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltGetContextsEx", longArrayOf(fltobjects, desiredcontexts.toLong(), contextssize.toLong(), contexts))
    return Win32.Foundation.NTSTATUS()
}

public fun FltGetDestinationFileNameInformation(instance: PFLT_INSTANCE, fileobject: Long, rootdirectory: Win32.Foundation.HANDLE, filename: PCWSTR, filenamelength: UInt, nameoptions: UInt, retfilenameinformation: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltGetDestinationFileNameInformation", longArrayOf(instance, fileobject, Win32DynamicFfi.objectSlot(rootdirectory), filename, filenamelength.toLong(), nameoptions.toLong(), retfilenameinformation))
    return Win32.Foundation.NTSTATUS()
}

public fun FltGetDeviceObject(volume: PFLT_VOLUME, deviceobject: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltGetDeviceObject", longArrayOf(volume, deviceobject))
    return Win32.Foundation.NTSTATUS()
}

public fun FltGetDiskDeviceObject(volume: PFLT_VOLUME, diskdeviceobject: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltGetDiskDeviceObject", longArrayOf(volume, diskdeviceobject))
    return Win32.Foundation.NTSTATUS()
}

public fun FltGetEcpListFromCallbackData(filter: PFLT_FILTER, callbackdata: Long, ecplist: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltGetEcpListFromCallbackData", longArrayOf(filter, callbackdata, ecplist))
    return Win32.Foundation.NTSTATUS()
}

public fun FltGetFileContext(instance: PFLT_INSTANCE, fileobject: Long, context: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltGetFileContext", longArrayOf(instance, fileobject, context))
    return Win32.Foundation.NTSTATUS()
}

public fun FltGetFileNameInformation(callbackdata: Long, nameoptions: UInt, filenameinformation: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltGetFileNameInformation", longArrayOf(callbackdata, nameoptions.toLong(), filenameinformation))
    return Win32.Foundation.NTSTATUS()
}

public fun FltGetFileNameInformationUnsafe(fileobject: Long, instance: PFLT_INSTANCE, nameoptions: UInt, filenameinformation: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltGetFileNameInformationUnsafe", longArrayOf(fileobject, instance, nameoptions.toLong(), filenameinformation))
    return Win32.Foundation.NTSTATUS()
}

public fun FltGetFileSystemType(fltobject: Long, filesystemtype: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltGetFileSystemType", longArrayOf(fltobject, filesystemtype))
    return Win32.Foundation.NTSTATUS()
}

public fun FltGetFilterFromInstance(instance: PFLT_INSTANCE, retfilter: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltGetFilterFromInstance", longArrayOf(instance, retfilter))
    return Win32.Foundation.NTSTATUS()
}

public fun FltGetFilterFromName(filtername: Long, retfilter: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltGetFilterFromName", longArrayOf(filtername, retfilter))
    return Win32.Foundation.NTSTATUS()
}

public fun FltGetFilterInformation(filter: PFLT_FILTER, informationclass: Win32.Storage.InstallableFileSystems.FILTER_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltGetFilterInformation", longArrayOf(filter, Win32DynamicFfi.objectSlot(informationclass), buffer, buffersize.toLong(), bytesreturned))
    return Win32.Foundation.NTSTATUS()
}

public fun FltGetFsZeroingOffset(data: Long, zeroingoffset: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltGetFsZeroingOffset", longArrayOf(data, zeroingoffset))
    return Win32.Foundation.NTSTATUS()
}

public fun FltGetInstanceContext(instance: PFLT_INSTANCE, context: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltGetInstanceContext", longArrayOf(instance, context))
    return Win32.Foundation.NTSTATUS()
}

public fun FltGetInstanceInformation(instance: PFLT_INSTANCE, informationclass: Win32.Storage.InstallableFileSystems.INSTANCE_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltGetInstanceInformation", longArrayOf(instance, Win32DynamicFfi.objectSlot(informationclass), buffer, buffersize.toLong(), bytesreturned))
    return Win32.Foundation.NTSTATUS()
}

public fun FltGetIoAttributionHandleFromCallbackData(data: Long): Long {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetIoAttributionHandleFromCallbackData", longArrayOf(data))
}

public fun FltGetIoPriorityHint(data: Long): Foundation.IO_PRIORITY_HINT {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltGetIoPriorityHint", longArrayOf(data))
    return Foundation.IO_PRIORITY_HINT()
}

public fun FltGetIoPriorityHintFromCallbackData(data: Long): Foundation.IO_PRIORITY_HINT {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltGetIoPriorityHintFromCallbackData", longArrayOf(data))
    return Foundation.IO_PRIORITY_HINT()
}

public fun FltGetIoPriorityHintFromFileObject(fileobject: Long): Foundation.IO_PRIORITY_HINT {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltGetIoPriorityHintFromFileObject", longArrayOf(fileobject))
    return Foundation.IO_PRIORITY_HINT()
}

public fun FltGetIoPriorityHintFromThread(thread: Foundation.PETHREAD): Foundation.IO_PRIORITY_HINT {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltGetIoPriorityHintFromThread", longArrayOf(Win32DynamicFfi.objectSlot(thread)))
    return Foundation.IO_PRIORITY_HINT()
}

public fun FltGetIrpName(irpmajorcode: UByte): PSTR {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetIrpName", longArrayOf(irpmajorcode.toLong()))
}

public fun FltGetLowerInstance(currentinstance: PFLT_INSTANCE, lowerinstance: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltGetLowerInstance", longArrayOf(currentinstance, lowerinstance))
    return Win32.Foundation.NTSTATUS()
}

public fun FltGetNewSystemBufferAddress(callbackdata: Long): Long {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetNewSystemBufferAddress", longArrayOf(callbackdata))
}

public fun FltGetNextExtraCreateParameter(filter: PFLT_FILTER, ecplist: Long, currentecpcontext: Long, nextecptype: Long, nextecpcontext: Long, nextecpcontextsize: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltGetNextExtraCreateParameter", longArrayOf(filter, ecplist, currentecpcontext, nextecptype, nextecpcontext, nextecpcontextsize))
    return Win32.Foundation.NTSTATUS()
}

public fun FltGetRequestorProcess(callbackdata: Long): Foundation.PEPROCESS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltGetRequestorProcess", longArrayOf(callbackdata))
    return Foundation.PEPROCESS()
}

public fun FltGetRequestorProcessId(callbackdata: Long): UInt {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetRequestorProcessId", longArrayOf(callbackdata)).toUInt()
}

public fun FltGetRequestorProcessIdEx(callbackdata: Long): Win32.Foundation.HANDLE {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltGetRequestorProcessIdEx", longArrayOf(callbackdata))
    return Win32.Foundation.HANDLE()
}

public fun FltGetRequestorSessionId(callbackdata: Long, sessionid: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltGetRequestorSessionId", longArrayOf(callbackdata, sessionid))
    return Win32.Foundation.NTSTATUS()
}

public fun FltGetRoutineAddress(fltmgrroutinename: PCSTR): Long {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetRoutineAddress", longArrayOf(fltmgrroutinename))
}

public fun FltGetSectionContext(instance: PFLT_INSTANCE, fileobject: Long, context: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltGetSectionContext", longArrayOf(instance, fileobject, context))
    return Win32.Foundation.NTSTATUS()
}

public fun FltGetStreamContext(instance: PFLT_INSTANCE, fileobject: Long, context: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltGetStreamContext", longArrayOf(instance, fileobject, context))
    return Win32.Foundation.NTSTATUS()
}

public fun FltGetStreamHandleContext(instance: PFLT_INSTANCE, fileobject: Long, context: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltGetStreamHandleContext", longArrayOf(instance, fileobject, context))
    return Win32.Foundation.NTSTATUS()
}

public fun FltGetSwappedBufferMdlAddress(callbackdata: Long): Long {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltGetSwappedBufferMdlAddress", longArrayOf(callbackdata))
}

public fun FltGetTopInstance(volume: PFLT_VOLUME, instance: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltGetTopInstance", longArrayOf(volume, instance))
    return Win32.Foundation.NTSTATUS()
}

public fun FltGetTransactionContext(instance: PFLT_INSTANCE, transaction: Long, context: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltGetTransactionContext", longArrayOf(instance, transaction, context))
    return Win32.Foundation.NTSTATUS()
}

public fun FltGetTunneledName(callbackdata: Long, filenameinformation: Long, rettunneledfilenameinformation: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltGetTunneledName", longArrayOf(callbackdata, filenameinformation, rettunneledfilenameinformation))
    return Win32.Foundation.NTSTATUS()
}

public fun FltGetUpperInstance(currentinstance: PFLT_INSTANCE, upperinstance: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltGetUpperInstance", longArrayOf(currentinstance, upperinstance))
    return Win32.Foundation.NTSTATUS()
}

public fun FltGetVolumeContext(filter: PFLT_FILTER, volume: PFLT_VOLUME, context: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltGetVolumeContext", longArrayOf(filter, volume, context))
    return Win32.Foundation.NTSTATUS()
}

public fun FltGetVolumeFromDeviceObject(filter: PFLT_FILTER, deviceobject: Long, retvolume: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltGetVolumeFromDeviceObject", longArrayOf(filter, deviceobject, retvolume))
    return Win32.Foundation.NTSTATUS()
}

public fun FltGetVolumeFromFileObject(filter: PFLT_FILTER, fileobject: Long, retvolume: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltGetVolumeFromFileObject", longArrayOf(filter, fileobject, retvolume))
    return Win32.Foundation.NTSTATUS()
}

public fun FltGetVolumeFromInstance(instance: PFLT_INSTANCE, retvolume: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltGetVolumeFromInstance", longArrayOf(instance, retvolume))
    return Win32.Foundation.NTSTATUS()
}

public fun FltGetVolumeFromName(filter: PFLT_FILTER, volumename: Long, retvolume: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltGetVolumeFromName", longArrayOf(filter, volumename, retvolume))
    return Win32.Foundation.NTSTATUS()
}

public fun FltGetVolumeGuidName(volume: PFLT_VOLUME, volumeguidname: Long, buffersizeneeded: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltGetVolumeGuidName", longArrayOf(volume, volumeguidname, buffersizeneeded))
    return Win32.Foundation.NTSTATUS()
}

public fun FltGetVolumeInformation(volume: PFLT_VOLUME, informationclass: Win32.Storage.InstallableFileSystems.FILTER_VOLUME_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltGetVolumeInformation", longArrayOf(volume, Win32DynamicFfi.objectSlot(informationclass), buffer, buffersize.toLong(), bytesreturned))
    return Win32.Foundation.NTSTATUS()
}

public fun FltGetVolumeInstanceFromName(filter: PFLT_FILTER, volume: PFLT_VOLUME, instancename: Long, retinstance: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltGetVolumeInstanceFromName", longArrayOf(filter, volume, instancename, retinstance))
    return Win32.Foundation.NTSTATUS()
}

public fun FltGetVolumeName(volume: PFLT_VOLUME, volumename: Long, buffersizeneeded: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltGetVolumeName", longArrayOf(volume, volumename, buffersizeneeded))
    return Win32.Foundation.NTSTATUS()
}

public fun FltGetVolumeProperties(volume: PFLT_VOLUME, volumeproperties: Long, volumepropertieslength: UInt, lengthreturned: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltGetVolumeProperties", longArrayOf(volume, volumeproperties, volumepropertieslength.toLong(), lengthreturned))
    return Win32.Foundation.NTSTATUS()
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

public fun FltInsertExtraCreateParameter(filter: PFLT_FILTER, ecplist: Long, ecpcontext: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltInsertExtraCreateParameter", longArrayOf(filter, ecplist, ecpcontext))
    return Win32.Foundation.NTSTATUS()
}

public fun FltIs32bitProcess(callbackdata: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("fltmgr.sys", "FltIs32bitProcess", longArrayOf(callbackdata))
    return (rawRet and 0xFFL) != 0L
}

public fun FltIsCallbackDataDirty(data: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("fltmgr.sys", "FltIsCallbackDataDirty", longArrayOf(data))
    return (rawRet and 0xFFL) != 0L
}

public fun FltIsDirectory(fileobject: Long, instance: PFLT_INSTANCE, isdirectory: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltIsDirectory", longArrayOf(fileobject, instance, isdirectory))
    return Win32.Foundation.NTSTATUS()
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

public fun FltIsIoRedirectionAllowed(sourceinstance: PFLT_INSTANCE, targetinstance: PFLT_INSTANCE, redirectionallowed: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltIsIoRedirectionAllowed", longArrayOf(sourceinstance, targetinstance, redirectionallowed))
    return Win32.Foundation.NTSTATUS()
}

public fun FltIsIoRedirectionAllowedForOperation(data: Long, targetinstance: PFLT_INSTANCE, redirectionallowedthisio: Long, redirectionallowedallio: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltIsIoRedirectionAllowedForOperation", longArrayOf(data, targetinstance, redirectionallowedthisio, redirectionallowedallio))
    return Win32.Foundation.NTSTATUS()
}

public fun FltIsOperationSynchronous(callbackdata: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("fltmgr.sys", "FltIsOperationSynchronous", longArrayOf(callbackdata))
    return (rawRet and 0xFFL) != 0L
}

public fun FltIsVolumeSnapshot(fltobject: Long, issnapshotvolume: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltIsVolumeSnapshot", longArrayOf(fltobject, issnapshotvolume))
    return Win32.Foundation.NTSTATUS()
}

public fun FltIsVolumeWritable(fltobject: Long, iswritable: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltIsVolumeWritable", longArrayOf(fltobject, iswritable))
    return Win32.Foundation.NTSTATUS()
}

public fun FltLoadFilter(filtername: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltLoadFilter", longArrayOf(filtername))
    return Win32.Foundation.NTSTATUS()
}

public fun FltLockUserBuffer(callbackdata: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltLockUserBuffer", longArrayOf(callbackdata))
    return Win32.Foundation.NTSTATUS()
}

public fun FltNotifyFilterChangeDirectory(notifysync: Foundation.PNOTIFY_SYNC, notifylist: Long, fscontext: Long, fulldirectoryname: Long, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifycallbackdata: Long, traversecallback: PCHECK_FOR_TRAVERSE_ACCESS, subjectcontext: Long, filtercallback: PFILTER_REPORT_CHANGE) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltNotifyFilterChangeDirectory", longArrayOf(Win32DynamicFfi.objectSlot(notifysync), notifylist, fscontext, fulldirectoryname, if (watchtree) 1L else 0L, if (ignorebuffer) 1L else 0L, completionfilter.toLong(), notifycallbackdata, Win32DynamicFfi.objectSlot(traversecallback), subjectcontext, Win32DynamicFfi.objectSlot(filtercallback)))
}

public fun FltObjectDereference(fltobject: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltObjectDereference", longArrayOf(fltobject))
}

public fun FltObjectReference(fltobject: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltObjectReference", longArrayOf(fltobject))
    return Win32.Foundation.NTSTATUS()
}

public fun FltOpenVolume(instance: PFLT_INSTANCE, volumehandle: Long, volumefileobject: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltOpenVolume", longArrayOf(instance, volumehandle, volumefileobject))
    return Win32.Foundation.NTSTATUS()
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

public fun FltParseFileName(filename: Long, extension: Long, stream: Long, finalcomponent: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltParseFileName", longArrayOf(filename, extension, stream, finalcomponent))
    return Win32.Foundation.NTSTATUS()
}

public fun FltParseFileNameInformation(filenameinformation: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltParseFileNameInformation", longArrayOf(filenameinformation))
    return Win32.Foundation.NTSTATUS()
}

public fun FltPerformAsynchronousIo(callbackdata: Long, callbackroutine: PFLT_COMPLETED_ASYNC_IO_CALLBACK, callbackcontext: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltPerformAsynchronousIo", longArrayOf(callbackdata, Win32DynamicFfi.objectSlot(callbackroutine), callbackcontext))
    return Win32.Foundation.NTSTATUS()
}

public fun FltPerformSynchronousIo(callbackdata: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltPerformSynchronousIo", longArrayOf(callbackdata))
}

public fun FltPrePrepareComplete(instance: PFLT_INSTANCE, transaction: Long, transactioncontext: PFLT_CONTEXT): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltPrePrepareComplete", longArrayOf(instance, transaction, transactioncontext))
    return Win32.Foundation.NTSTATUS()
}

public fun FltPrepareComplete(instance: PFLT_INSTANCE, transaction: Long, transactioncontext: PFLT_CONTEXT): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltPrepareComplete", longArrayOf(instance, transaction, transactioncontext))
    return Win32.Foundation.NTSTATUS()
}

public fun FltPrepareToReuseEcp(filter: PFLT_FILTER, ecpcontext: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltPrepareToReuseEcp", longArrayOf(filter, ecpcontext))
}

public fun FltProcessFileLock(filelock: Long, callbackdata: Long, context: Long): FLT_PREOP_CALLBACK_STATUS {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltProcessFileLock", longArrayOf(filelock, callbackdata, context)).toInt()
}

public fun FltPropagateActivityIdToThread(callbackdata: Long, propagateid: Long, originalid: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltPropagateActivityIdToThread", longArrayOf(callbackdata, propagateid, originalid))
    return Win32.Foundation.NTSTATUS()
}

public fun FltPropagateIrpExtension(sourcedata: Long, targetdata: Long, flags: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltPropagateIrpExtension", longArrayOf(sourcedata, targetdata, flags.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun FltPurgeFileNameInformationCache(instance: PFLT_INSTANCE, fileobject: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltPurgeFileNameInformationCache", longArrayOf(instance, fileobject))
    return Win32.Foundation.NTSTATUS()
}

public fun FltQueryDirectoryFile(instance: PFLT_INSTANCE, fileobject: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, returnsingleentry: Boolean, filename: Long, restartscan: Boolean, lengthreturned: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltQueryDirectoryFile", longArrayOf(instance, fileobject, fileinformation, length.toLong(), fileinformationclass.toLong(), if (returnsingleentry) 1L else 0L, filename, if (restartscan) 1L else 0L, lengthreturned))
    return Win32.Foundation.NTSTATUS()
}

public fun FltQueryDirectoryFileEx(instance: PFLT_INSTANCE, fileobject: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, queryflags: UInt, filename: Long, lengthreturned: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltQueryDirectoryFileEx", longArrayOf(instance, fileobject, fileinformation, length.toLong(), fileinformationclass.toLong(), queryflags.toLong(), filename, lengthreturned))
    return Win32.Foundation.NTSTATUS()
}

public fun FltQueryEaFile(instance: PFLT_INSTANCE, fileobject: Long, returnedeadata: Long, length: UInt, returnsingleentry: Boolean, ealist: Long, ealistlength: UInt, eaindex: Long, restartscan: Boolean, lengthreturned: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltQueryEaFile", longArrayOf(instance, fileobject, returnedeadata, length.toLong(), if (returnsingleentry) 1L else 0L, ealist, ealistlength.toLong(), eaindex, if (restartscan) 1L else 0L, lengthreturned))
    return Win32.Foundation.NTSTATUS()
}

public fun FltQueryInformationByName(filter: PFLT_FILTER, instance: PFLT_INSTANCE, objectattributes: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, drivercontext: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltQueryInformationByName", longArrayOf(filter, instance, objectattributes, iostatusblock, fileinformation, length.toLong(), fileinformationclass.toLong(), drivercontext))
    return Win32.Foundation.NTSTATUS()
}

public fun FltQueryInformationFile(instance: PFLT_INSTANCE, fileobject: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, lengthreturned: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltQueryInformationFile", longArrayOf(instance, fileobject, fileinformation, length.toLong(), fileinformationclass.toLong(), lengthreturned))
    return Win32.Foundation.NTSTATUS()
}

public fun FltQueryQuotaInformationFile(instance: PFLT_INSTANCE, fileobject: Long, iostatusblock: Long, buffer: Long, length: UInt, returnsingleentry: Boolean, sidlist: Long, sidlistlength: UInt, startsid: Long, restartscan: Boolean, lengthreturned: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltQueryQuotaInformationFile", longArrayOf(instance, fileobject, iostatusblock, buffer, length.toLong(), if (returnsingleentry) 1L else 0L, sidlist, sidlistlength.toLong(), startsid, if (restartscan) 1L else 0L, lengthreturned))
    return Win32.Foundation.NTSTATUS()
}

public fun FltQuerySecurityObject(instance: PFLT_INSTANCE, fileobject: Long, securityinformation: UInt, securitydescriptor: Win32.Security.PSECURITY_DESCRIPTOR, length: UInt, lengthneeded: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltQuerySecurityObject", longArrayOf(instance, fileobject, securityinformation.toLong(), Win32DynamicFfi.objectSlot(securitydescriptor), length.toLong(), lengthneeded))
    return Win32.Foundation.NTSTATUS()
}

public fun FltQueryVolumeInformation(instance: PFLT_INSTANCE, iosb: Long, fsinformation: Long, length: UInt, fsinformationclass: FS_INFORMATION_CLASS): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltQueryVolumeInformation", longArrayOf(instance, iosb, fsinformation, length.toLong(), fsinformationclass.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun FltQueryVolumeInformationFile(instance: PFLT_INSTANCE, fileobject: Long, fsinformation: Long, length: UInt, fsinformationclass: FS_INFORMATION_CLASS, lengthreturned: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltQueryVolumeInformationFile", longArrayOf(instance, fileobject, fsinformation, length.toLong(), fsinformationclass.toLong(), lengthreturned))
    return Win32.Foundation.NTSTATUS()
}

public fun FltQueueDeferredIoWorkItem(fltworkitem: PFLT_DEFERRED_IO_WORKITEM, data: Long, workerroutine: PFLT_DEFERRED_IO_WORKITEM_ROUTINE, queuetype: System.SystemServices.WORK_QUEUE_TYPE, context: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltQueueDeferredIoWorkItem", longArrayOf(fltworkitem, data, Win32DynamicFfi.objectSlot(workerroutine), Win32DynamicFfi.objectSlot(queuetype), context))
    return Win32.Foundation.NTSTATUS()
}

public fun FltQueueGenericWorkItem(fltworkitem: PFLT_GENERIC_WORKITEM, fltobject: Long, workerroutine: PFLT_GENERIC_WORKITEM_ROUTINE, queuetype: System.SystemServices.WORK_QUEUE_TYPE, context: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltQueueGenericWorkItem", longArrayOf(fltworkitem, fltobject, Win32DynamicFfi.objectSlot(workerroutine), Win32DynamicFfi.objectSlot(queuetype), context))
    return Win32.Foundation.NTSTATUS()
}

public fun FltReadFile(initiatinginstance: PFLT_INSTANCE, fileobject: Long, byteoffset: Long, length: UInt, buffer: Long, flags: UInt, bytesread: Long, callbackroutine: PFLT_COMPLETED_ASYNC_IO_CALLBACK, callbackcontext: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltReadFile", longArrayOf(initiatinginstance, fileobject, byteoffset, length.toLong(), buffer, flags.toLong(), bytesread, Win32DynamicFfi.objectSlot(callbackroutine), callbackcontext))
    return Win32.Foundation.NTSTATUS()
}

public fun FltReadFileEx(initiatinginstance: PFLT_INSTANCE, fileobject: Long, byteoffset: Long, length: UInt, buffer: Long, flags: UInt, bytesread: Long, callbackroutine: PFLT_COMPLETED_ASYNC_IO_CALLBACK, callbackcontext: Long, key: Long, mdl: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltReadFileEx", longArrayOf(initiatinginstance, fileobject, byteoffset, length.toLong(), buffer, flags.toLong(), bytesread, Win32DynamicFfi.objectSlot(callbackroutine), callbackcontext, key, mdl))
    return Win32.Foundation.NTSTATUS()
}

public fun FltReferenceContext(context: PFLT_CONTEXT) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltReferenceContext", longArrayOf(context))
}

public fun FltReferenceFileNameInformation(filenameinformation: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltReferenceFileNameInformation", longArrayOf(filenameinformation))
}

public fun FltRegisterFilter(driver: Long, registration: Long, retfilter: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltRegisterFilter", longArrayOf(driver, registration, retfilter))
    return Win32.Foundation.NTSTATUS()
}

public fun FltRegisterForDataScan(instance: PFLT_INSTANCE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltRegisterForDataScan", longArrayOf(instance))
    return Win32.Foundation.NTSTATUS()
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

public fun FltRemoveExtraCreateParameter(filter: PFLT_FILTER, ecplist: Long, ecptype: Long, ecpcontext: Long, ecpcontextsize: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltRemoveExtraCreateParameter", longArrayOf(filter, ecplist, ecptype, ecpcontext, ecpcontextsize))
    return Win32.Foundation.NTSTATUS()
}

public fun FltRemoveOpenReparseEntry(filter: PFLT_FILTER, data: Long, openreparseentry: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltRemoveOpenReparseEntry", longArrayOf(filter, data, openreparseentry))
}

public fun FltRequestFileInfoOnCreateCompletion(filter: PFLT_FILTER, data: Long, infoclassflags: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltRequestFileInfoOnCreateCompletion", longArrayOf(filter, data, infoclassflags.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun FltRequestOperationStatusCallback(data: Long, callbackroutine: PFLT_GET_OPERATION_STATUS_CALLBACK, requestercontext: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltRequestOperationStatusCallback", longArrayOf(data, Win32DynamicFfi.objectSlot(callbackroutine), requestercontext))
    return Win32.Foundation.NTSTATUS()
}

public fun FltRetainSwappedBufferMdlAddress(callbackdata: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltRetainSwappedBufferMdlAddress", longArrayOf(callbackdata))
}

public fun FltRetrieveFileInfoOnCreateCompletion(filter: PFLT_FILTER, data: Long, infoclass: UInt, size: Long): Long {
    return Win32DynamicFfi.invoke("fltmgr.sys", "FltRetrieveFileInfoOnCreateCompletion", longArrayOf(filter, data, infoclass.toLong(), size))
}

public fun FltRetrieveFileInfoOnCreateCompletionEx(filter: PFLT_FILTER, data: Long, infoclass: UInt, retinfosize: Long, retinfobuffer: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltRetrieveFileInfoOnCreateCompletionEx", longArrayOf(filter, data, infoclass.toLong(), retinfosize, retinfobuffer))
    return Win32.Foundation.NTSTATUS()
}

public fun FltRetrieveIoPriorityInfo(data: Long, fileobject: Long, thread: Foundation.PETHREAD, priorityinfo: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltRetrieveIoPriorityInfo", longArrayOf(data, fileobject, Win32DynamicFfi.objectSlot(thread), priorityinfo))
    return Win32.Foundation.NTSTATUS()
}

public fun FltReuseCallbackData(callbackdata: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltReuseCallbackData", longArrayOf(callbackdata))
}

public fun FltRollbackComplete(instance: PFLT_INSTANCE, transaction: Long, transactioncontext: PFLT_CONTEXT): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltRollbackComplete", longArrayOf(instance, transaction, transactioncontext))
    return Win32.Foundation.NTSTATUS()
}

public fun FltRollbackEnlistment(instance: PFLT_INSTANCE, transaction: Long, transactioncontext: PFLT_CONTEXT): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltRollbackEnlistment", longArrayOf(instance, transaction, transactioncontext))
    return Win32.Foundation.NTSTATUS()
}

public fun FltSendMessage(filter: PFLT_FILTER, clientport: Long, senderbuffer: Long, senderbufferlength: UInt, replybuffer: Long, replylength: Long, timeout: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltSendMessage", longArrayOf(filter, clientport, senderbuffer, senderbufferlength.toLong(), replybuffer, replylength, timeout))
    return Win32.Foundation.NTSTATUS()
}

public fun FltSetActivityIdCallbackData(callbackdata: Long, guid: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltSetActivityIdCallbackData", longArrayOf(callbackdata, guid))
    return Win32.Foundation.NTSTATUS()
}

public fun FltSetCallbackDataDirty(data: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltSetCallbackDataDirty", longArrayOf(data))
}

public fun FltSetCancelCompletion(callbackdata: Long, canceledcallback: PFLT_COMPLETE_CANCELED_CALLBACK): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltSetCancelCompletion", longArrayOf(callbackdata, Win32DynamicFfi.objectSlot(canceledcallback)))
    return Win32.Foundation.NTSTATUS()
}

public fun FltSetEaFile(instance: PFLT_INSTANCE, fileobject: Long, eabuffer: Long, length: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltSetEaFile", longArrayOf(instance, fileobject, eabuffer, length.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun FltSetEcpListIntoCallbackData(filter: PFLT_FILTER, callbackdata: Long, ecplist: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltSetEcpListIntoCallbackData", longArrayOf(filter, callbackdata, ecplist))
    return Win32.Foundation.NTSTATUS()
}

public fun FltSetFileContext(instance: PFLT_INSTANCE, fileobject: Long, operation: FLT_SET_CONTEXT_OPERATION, newcontext: PFLT_CONTEXT, oldcontext: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltSetFileContext", longArrayOf(instance, fileobject, operation.toLong(), newcontext, oldcontext))
    return Win32.Foundation.NTSTATUS()
}

public fun FltSetFsZeroingOffset(data: Long, zeroingoffset: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltSetFsZeroingOffset", longArrayOf(data, zeroingoffset.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun FltSetFsZeroingOffsetRequired(data: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltSetFsZeroingOffsetRequired", longArrayOf(data))
    return Win32.Foundation.NTSTATUS()
}

public fun FltSetInformationFile(instance: PFLT_INSTANCE, fileobject: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltSetInformationFile", longArrayOf(instance, fileobject, fileinformation, length.toLong(), fileinformationclass.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun FltSetInstanceContext(instance: PFLT_INSTANCE, operation: FLT_SET_CONTEXT_OPERATION, newcontext: PFLT_CONTEXT, oldcontext: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltSetInstanceContext", longArrayOf(instance, operation.toLong(), newcontext, oldcontext))
    return Win32.Foundation.NTSTATUS()
}

public fun FltSetIoPriorityHintIntoCallbackData(data: Long, priorityhint: Foundation.IO_PRIORITY_HINT): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltSetIoPriorityHintIntoCallbackData", longArrayOf(data, Win32DynamicFfi.objectSlot(priorityhint)))
    return Win32.Foundation.NTSTATUS()
}

public fun FltSetIoPriorityHintIntoFileObject(fileobject: Long, priorityhint: Foundation.IO_PRIORITY_HINT): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltSetIoPriorityHintIntoFileObject", longArrayOf(fileobject, Win32DynamicFfi.objectSlot(priorityhint)))
    return Win32.Foundation.NTSTATUS()
}

public fun FltSetIoPriorityHintIntoThread(thread: Foundation.PETHREAD, priorityhint: Foundation.IO_PRIORITY_HINT): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltSetIoPriorityHintIntoThread", longArrayOf(Win32DynamicFfi.objectSlot(thread), Win32DynamicFfi.objectSlot(priorityhint)))
    return Win32.Foundation.NTSTATUS()
}

public fun FltSetQuotaInformationFile(instance: PFLT_INSTANCE, fileobject: Long, buffer: Long, length: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltSetQuotaInformationFile", longArrayOf(instance, fileobject, buffer, length.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun FltSetSecurityObject(instance: PFLT_INSTANCE, fileobject: Long, securityinformation: UInt, securitydescriptor: Win32.Security.PSECURITY_DESCRIPTOR): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltSetSecurityObject", longArrayOf(instance, fileobject, securityinformation.toLong(), Win32DynamicFfi.objectSlot(securitydescriptor)))
    return Win32.Foundation.NTSTATUS()
}

public fun FltSetStreamContext(instance: PFLT_INSTANCE, fileobject: Long, operation: FLT_SET_CONTEXT_OPERATION, newcontext: PFLT_CONTEXT, oldcontext: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltSetStreamContext", longArrayOf(instance, fileobject, operation.toLong(), newcontext, oldcontext))
    return Win32.Foundation.NTSTATUS()
}

public fun FltSetStreamHandleContext(instance: PFLT_INSTANCE, fileobject: Long, operation: FLT_SET_CONTEXT_OPERATION, newcontext: PFLT_CONTEXT, oldcontext: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltSetStreamHandleContext", longArrayOf(instance, fileobject, operation.toLong(), newcontext, oldcontext))
    return Win32.Foundation.NTSTATUS()
}

public fun FltSetTransactionContext(instance: PFLT_INSTANCE, transaction: Long, operation: FLT_SET_CONTEXT_OPERATION, newcontext: PFLT_CONTEXT, oldcontext: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltSetTransactionContext", longArrayOf(instance, transaction, operation.toLong(), newcontext, oldcontext))
    return Win32.Foundation.NTSTATUS()
}

public fun FltSetVolumeContext(volume: PFLT_VOLUME, operation: FLT_SET_CONTEXT_OPERATION, newcontext: PFLT_CONTEXT, oldcontext: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltSetVolumeContext", longArrayOf(volume, operation.toLong(), newcontext, oldcontext))
    return Win32.Foundation.NTSTATUS()
}

public fun FltSetVolumeInformation(instance: PFLT_INSTANCE, iosb: Long, fsinformation: Long, length: UInt, fsinformationclass: FS_INFORMATION_CLASS): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltSetVolumeInformation", longArrayOf(instance, iosb, fsinformation, length.toLong(), fsinformationclass.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun FltStartFiltering(filter: PFLT_FILTER): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltStartFiltering", longArrayOf(filter))
    return Win32.Foundation.NTSTATUS()
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

public fun FltTagFile(initiatinginstance: PFLT_INSTANCE, fileobject: Long, filetag: UInt, guid: Long, databuffer: Long, databufferlength: UShort): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltTagFile", longArrayOf(initiatinginstance, fileobject, filetag.toLong(), guid, databuffer, databufferlength.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun FltTagFileEx(initiatinginstance: PFLT_INSTANCE, fileobject: Long, filetag: UInt, guid: Long, databuffer: Long, databufferlength: UShort, existingfiletag: UInt, existingguid: Long, flags: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltTagFileEx", longArrayOf(initiatinginstance, fileobject, filetag.toLong(), guid, databuffer, databufferlength.toLong(), existingfiletag.toLong(), existingguid, flags.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun FltUninitializeFileLock(filelock: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltUninitializeFileLock", longArrayOf(filelock))
}

public fun FltUninitializeOplock(oplock: Long) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltUninitializeOplock", longArrayOf(oplock))
}

public fun FltUnloadFilter(filtername: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltUnloadFilter", longArrayOf(filtername))
    return Win32.Foundation.NTSTATUS()
}

public fun FltUnregisterFilter(filter: PFLT_FILTER) {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltUnregisterFilter", longArrayOf(filter))
}

public fun FltUntagFile(initiatinginstance: PFLT_INSTANCE, fileobject: Long, filetag: UInt, guid: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltUntagFile", longArrayOf(initiatinginstance, fileobject, filetag.toLong(), guid))
    return Win32.Foundation.NTSTATUS()
}

public fun FltVetoBypassIo(callbackdata: Long, fltobjects: Long, operationstatus: Win32.Foundation.NTSTATUS, failurereason: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltVetoBypassIo", longArrayOf(callbackdata, fltobjects, Win32DynamicFfi.objectSlot(operationstatus), failurereason))
    return Win32.Foundation.NTSTATUS()
}

public fun FltWriteFile(initiatinginstance: PFLT_INSTANCE, fileobject: Long, byteoffset: Long, length: UInt, buffer: Long, flags: UInt, byteswritten: Long, callbackroutine: PFLT_COMPLETED_ASYNC_IO_CALLBACK, callbackcontext: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltWriteFile", longArrayOf(initiatinginstance, fileobject, byteoffset, length.toLong(), buffer, flags.toLong(), byteswritten, Win32DynamicFfi.objectSlot(callbackroutine), callbackcontext))
    return Win32.Foundation.NTSTATUS()
}

public fun FltWriteFileEx(initiatinginstance: PFLT_INSTANCE, fileobject: Long, byteoffset: Long, length: UInt, buffer: Long, flags: UInt, byteswritten: Long, callbackroutine: PFLT_COMPLETED_ASYNC_IO_CALLBACK, callbackcontext: Long, key: Long, mdl: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltWriteFileEx", longArrayOf(initiatinginstance, fileobject, byteoffset, length.toLong(), buffer, flags.toLong(), byteswritten, Win32DynamicFfi.objectSlot(callbackroutine), callbackcontext, key, mdl))
    return Win32.Foundation.NTSTATUS()
}

public fun FltpTraceRedirectedFileIo(originatingfileobject: Long, childcallbackdata: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fltmgr.sys", "FltpTraceRedirectedFileIo", longArrayOf(originatingfileobject, childcallbackdata))
    return Win32.Foundation.NTSTATUS()
}
