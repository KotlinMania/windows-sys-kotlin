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

public expect fun FltAcknowledgeEcp(filter: PFLT_FILTER, ecpcontext: Long)

public expect fun FltAcquirePushLockExclusive(pushlock: Long)

public expect fun FltAcquirePushLockExclusiveEx(pushlock: Long, flags: UInt)

public expect fun FltAcquirePushLockShared(pushlock: Long)

public expect fun FltAcquirePushLockSharedEx(pushlock: Long, flags: UInt)

public expect fun FltAcquireResourceExclusive(resource: Long)

public expect fun FltAcquireResourceShared(resource: Long)

public expect fun FltAddOpenReparseEntry(filter: PFLT_FILTER, data: Long, openreparseentry: Long): NTSTATUS

public expect fun FltAdjustDeviceStackSizeForIoRedirection(sourceinstance: PFLT_INSTANCE, targetinstance: PFLT_INSTANCE, sourcedevicestacksizemodified: Long): NTSTATUS

public expect fun FltAllocateCallbackData(instance: PFLT_INSTANCE, fileobject: Long, retnewcallbackdata: Long): NTSTATUS

public expect fun FltAllocateCallbackDataEx(instance: PFLT_INSTANCE, fileobject: Long, flags: UInt, retnewcallbackdata: Long): NTSTATUS

public expect fun FltAllocateContext(filter: PFLT_FILTER, contexttype: UShort, contextsize: ULong, pooltype: POOL_TYPE, returnedcontext: Long): NTSTATUS

public expect fun FltAllocateDeferredIoWorkItem(): PFLT_DEFERRED_IO_WORKITEM

public expect fun FltAllocateExtraCreateParameter(filter: PFLT_FILTER, ecptype: Long, sizeofcontext: UInt, flags: UInt, cleanupcallback: PFSRTL_EXTRA_CREATE_PARAMETER_CLEANUP_CALLBACK, pooltag: UInt, ecpcontext: Long): NTSTATUS

public expect fun FltAllocateExtraCreateParameterFromLookasideList(filter: PFLT_FILTER, ecptype: Long, sizeofcontext: UInt, flags: UInt, cleanupcallback: PFSRTL_EXTRA_CREATE_PARAMETER_CLEANUP_CALLBACK, lookasidelist: Long, ecpcontext: Long): NTSTATUS

public expect fun FltAllocateExtraCreateParameterList(filter: PFLT_FILTER, flags: UInt, ecplist: Long): NTSTATUS

public expect fun FltAllocateFileLock(completelockcallbackdataroutine: PFLT_COMPLETE_LOCK_CALLBACK_DATA_ROUTINE, unlockroutine: PUNLOCK_ROUTINE): Long

public expect fun FltAllocateGenericWorkItem(): PFLT_GENERIC_WORKITEM

public expect fun FltAllocatePoolAlignedWithTag(instance: PFLT_INSTANCE, pooltype: POOL_TYPE, numberofbytes: ULong, tag: UInt): Long

public expect fun FltApplyPriorityInfoThread(inputpriorityinfo: Long, outputpriorityinfo: Long, thread: PETHREAD): NTSTATUS

public expect fun FltAttachVolume(filter: PFLT_FILTER, volume: PFLT_VOLUME, instancename: Long, retinstance: Long): NTSTATUS

public expect fun FltAttachVolumeAtAltitude(filter: PFLT_FILTER, volume: PFLT_VOLUME, altitude: Long, instancename: Long, retinstance: Long): NTSTATUS

public expect fun FltBuildDefaultSecurityDescriptor(securitydescriptor: Long, desiredaccess: UInt): NTSTATUS

public expect fun FltCancelFileOpen(instance: PFLT_INSTANCE, fileobject: Long)

public expect fun FltCancelIo(callbackdata: Long): Boolean

public expect fun FltCancellableWaitForMultipleObjects(count: UInt, objectarray: Long, waittype: WAIT_TYPE, timeout: Long, waitblockarray: Long, callbackdata: Long): NTSTATUS

public expect fun FltCancellableWaitForSingleObject(obj: Long, timeout: Long, callbackdata: Long): NTSTATUS

public expect fun FltCbdqDisable(cbdq: Long)

public expect fun FltCbdqEnable(cbdq: Long)

public expect fun FltCbdqInitialize(instance: PFLT_INSTANCE, cbdq: Long, cbdqinsertio: PFLT_CALLBACK_DATA_QUEUE_INSERT_IO, cbdqremoveio: PFLT_CALLBACK_DATA_QUEUE_REMOVE_IO, cbdqpeeknextio: PFLT_CALLBACK_DATA_QUEUE_PEEK_NEXT_IO, cbdqacquire: PFLT_CALLBACK_DATA_QUEUE_ACQUIRE, cbdqrelease: PFLT_CALLBACK_DATA_QUEUE_RELEASE, cbdqcompletecanceledio: PFLT_CALLBACK_DATA_QUEUE_COMPLETE_CANCELED_IO): NTSTATUS

public expect fun FltCbdqInsertIo(cbdq: Long, cbd: Long, context: Long, insertcontext: Long): NTSTATUS

public expect fun FltCbdqRemoveIo(cbdq: Long, context: Long): Long

public expect fun FltCbdqRemoveNextIo(cbdq: Long, peekcontext: Long): Long

public expect fun FltCheckAndGrowNameControl(namectrl: Long, newsize: UShort): NTSTATUS

public expect fun FltCheckLockForReadAccess(filelock: Long, callbackdata: Long): Boolean

public expect fun FltCheckLockForWriteAccess(filelock: Long, callbackdata: Long): Boolean

public expect fun FltCheckOplock(oplock: Long, callbackdata: Long, context: Long, waitcompletionroutine: PFLTOPLOCK_WAIT_COMPLETE_ROUTINE, prepostcallbackdataroutine: PFLTOPLOCK_PREPOST_CALLBACKDATA_ROUTINE): FLT_PREOP_CALLBACK_STATUS

public expect fun FltCheckOplockEx(oplock: Long, callbackdata: Long, flags: UInt, context: Long, waitcompletionroutine: PFLTOPLOCK_WAIT_COMPLETE_ROUTINE, prepostcallbackdataroutine: PFLTOPLOCK_PREPOST_CALLBACKDATA_ROUTINE): FLT_PREOP_CALLBACK_STATUS

public expect fun FltClearCallbackDataDirty(data: Long)

public expect fun FltClearCancelCompletion(callbackdata: Long): NTSTATUS

public expect fun FltClose(filehandle: HANDLE): NTSTATUS

public expect fun FltCloseClientPort(filter: PFLT_FILTER, clientport: Long)

public expect fun FltCloseCommunicationPort(serverport: PFLT_PORT)

public expect fun FltCloseSectionForDataScan(sectioncontext: PFLT_CONTEXT): NTSTATUS

public expect fun FltCommitComplete(instance: PFLT_INSTANCE, transaction: Long, transactioncontext: PFLT_CONTEXT): NTSTATUS

public expect fun FltCommitFinalizeComplete(instance: PFLT_INSTANCE, transaction: Long, transactioncontext: PFLT_CONTEXT): NTSTATUS

public expect fun FltCompareInstanceAltitudes(instance1: PFLT_INSTANCE, instance2: PFLT_INSTANCE): Int

public expect fun FltCompletePendedPostOperation(callbackdata: Long)

public expect fun FltCompletePendedPreOperation(callbackdata: Long, callbackstatus: FLT_PREOP_CALLBACK_STATUS, context: Long)

public expect fun FltCopyOpenReparseList(filter: PFLT_FILTER, data: Long, ecplist: Long): NTSTATUS

public expect fun FltCreateCommunicationPort(filter: PFLT_FILTER, serverport: Long, objectattributes: Long, serverportcookie: Long, connectnotifycallback: PFLT_CONNECT_NOTIFY, disconnectnotifycallback: PFLT_DISCONNECT_NOTIFY, messagenotifycallback: PFLT_MESSAGE_NOTIFY, maxconnections: Int): NTSTATUS

public expect fun FltCreateFile(filter: PFLT_FILTER, instance: PFLT_INSTANCE, filehandle: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: Long, ealength: UInt, flags: UInt): NTSTATUS

public expect fun FltCreateFileEx(filter: PFLT_FILTER, instance: PFLT_INSTANCE, filehandle: Long, fileobject: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: Long, ealength: UInt, flags: UInt): NTSTATUS

public expect fun FltCreateFileEx2(filter: PFLT_FILTER, instance: PFLT_INSTANCE, filehandle: Long, fileobject: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: Long, ealength: UInt, flags: UInt, drivercontext: Long): NTSTATUS

public expect fun FltCreateMailslotFile(filter: PFLT_FILTER, instance: PFLT_INSTANCE, filehandle: Long, fileobject: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, createoptions: UInt, mailslotquota: UInt, maximummessagesize: UInt, readtimeout: Long, drivercontext: Long): NTSTATUS

public expect fun FltCreateNamedPipeFile(filter: PFLT_FILTER, instance: PFLT_INSTANCE, filehandle: Long, fileobject: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, namedpipetype: UInt, readmode: UInt, completionmode: UInt, maximuminstances: UInt, inboundquota: UInt, outboundquota: UInt, defaulttimeout: Long, drivercontext: Long): NTSTATUS

public expect fun FltCreateSectionForDataScan(instance: PFLT_INSTANCE, fileobject: Long, sectioncontext: PFLT_CONTEXT, desiredaccess: UInt, objectattributes: Long, maximumsize: Long, sectionpageprotection: UInt, allocationattributes: UInt, flags: UInt, sectionhandle: Long, sectionobject: Long, sectionfilesize: Long): NTSTATUS

public expect fun FltCreateSystemVolumeInformationFolder(instance: PFLT_INSTANCE): NTSTATUS

public expect fun FltCurrentBatchOplock(oplock: Long): Boolean

public expect fun FltCurrentOplock(oplock: Long): Boolean

public expect fun FltCurrentOplockH(oplock: Long): Boolean

public expect fun FltDecodeParameters(callbackdata: Long, mdladdresspointer: Long, buffer: Long, length: Long, desiredaccess: Long): NTSTATUS

public expect fun FltDeleteContext(context: PFLT_CONTEXT)

public expect fun FltDeleteExtraCreateParameterLookasideList(filter: PFLT_FILTER, lookaside: Long, flags: UInt)

public expect fun FltDeleteFileContext(instance: PFLT_INSTANCE, fileobject: Long, oldcontext: Long): NTSTATUS

public expect fun FltDeleteInstanceContext(instance: PFLT_INSTANCE, oldcontext: Long): NTSTATUS

public expect fun FltDeletePushLock(pushlock: Long)

public expect fun FltDeleteStreamContext(instance: PFLT_INSTANCE, fileobject: Long, oldcontext: Long): NTSTATUS

public expect fun FltDeleteStreamHandleContext(instance: PFLT_INSTANCE, fileobject: Long, oldcontext: Long): NTSTATUS

public expect fun FltDeleteTransactionContext(instance: PFLT_INSTANCE, transaction: Long, oldcontext: Long): NTSTATUS

public expect fun FltDeleteVolumeContext(filter: PFLT_FILTER, volume: PFLT_VOLUME, oldcontext: Long): NTSTATUS

public expect fun FltDetachVolume(filter: PFLT_FILTER, volume: PFLT_VOLUME, instancename: Long): NTSTATUS

public expect fun FltDeviceIoControlFile(instance: PFLT_INSTANCE, fileobject: Long, iocontrolcode: UInt, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt, lengthreturned: Long): NTSTATUS

public expect fun FltDoCompletionProcessingWhenSafe(data: Long, fltobjects: Long, completioncontext: Long, flags: UInt, safepostcallback: PFLT_POST_OPERATION_CALLBACK, retpostoperationstatus: Long): Boolean

public expect fun FltEnlistInTransaction(instance: PFLT_INSTANCE, transaction: Long, transactioncontext: PFLT_CONTEXT, notificationmask: UInt): NTSTATUS

public expect fun FltEnumerateFilterInformation(index: UInt, informationclass: FILTER_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): NTSTATUS

public expect fun FltEnumerateFilters(filterlist: Long, filterlistsize: UInt, numberfiltersreturned: Long): NTSTATUS

public expect fun FltEnumerateInstanceInformationByDeviceObject(deviceobject: Long, index: UInt, informationclass: INSTANCE_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): NTSTATUS

public expect fun FltEnumerateInstanceInformationByFilter(filter: PFLT_FILTER, index: UInt, informationclass: INSTANCE_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): NTSTATUS

public expect fun FltEnumerateInstanceInformationByVolume(volume: PFLT_VOLUME, index: UInt, informationclass: INSTANCE_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): NTSTATUS

public expect fun FltEnumerateInstanceInformationByVolumeName(volumename: Long, index: UInt, informationclass: INSTANCE_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): NTSTATUS

public expect fun FltEnumerateInstances(volume: PFLT_VOLUME, filter: PFLT_FILTER, instancelist: Long, instancelistsize: UInt, numberinstancesreturned: Long): NTSTATUS

public expect fun FltEnumerateVolumeInformation(filter: PFLT_FILTER, index: UInt, informationclass: FILTER_VOLUME_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): NTSTATUS

public expect fun FltEnumerateVolumes(filter: PFLT_FILTER, volumelist: Long, volumelistsize: UInt, numbervolumesreturned: Long): NTSTATUS

public expect fun FltFastIoMdlRead(initiatinginstance: PFLT_INSTANCE, fileobject: Long, fileoffset: Long, length: UInt, lockkey: UInt, mdlchain: Long, iostatus: Long): Boolean

public expect fun FltFastIoMdlReadComplete(initiatinginstance: PFLT_INSTANCE, fileobject: Long, mdlchain: Long): Boolean

public expect fun FltFastIoMdlWriteComplete(initiatinginstance: PFLT_INSTANCE, fileobject: Long, fileoffset: Long, mdlchain: Long): Boolean

public expect fun FltFastIoPrepareMdlWrite(initiatinginstance: PFLT_INSTANCE, fileobject: Long, fileoffset: Long, length: UInt, lockkey: UInt, mdlchain: Long, iostatus: Long): Boolean

public expect fun FltFindExtraCreateParameter(filter: PFLT_FILTER, ecplist: Long, ecptype: Long, ecpcontext: Long, ecpcontextsize: Long): NTSTATUS

public expect fun FltFlushBuffers(instance: PFLT_INSTANCE, fileobject: Long): NTSTATUS

public expect fun FltFlushBuffers2(instance: PFLT_INSTANCE, fileobject: Long, flushtype: UInt, callbackdata: Long): NTSTATUS

public expect fun FltFreeCallbackData(callbackdata: Long)

public expect fun FltFreeDeferredIoWorkItem(fltworkitem: PFLT_DEFERRED_IO_WORKITEM)

public expect fun FltFreeExtraCreateParameter(filter: PFLT_FILTER, ecpcontext: Long)

public expect fun FltFreeExtraCreateParameterList(filter: PFLT_FILTER, ecplist: Long)

public expect fun FltFreeFileLock(filelock: Long)

public expect fun FltFreeGenericWorkItem(fltworkitem: PFLT_GENERIC_WORKITEM)

public expect fun FltFreeOpenReparseList(filter: PFLT_FILTER, ecplist: Long)

public expect fun FltFreePoolAlignedWithTag(instance: PFLT_INSTANCE, buffer: Long, tag: UInt)

public expect fun FltFreeSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR)

public expect fun FltFsControlFile(instance: PFLT_INSTANCE, fileobject: Long, fscontrolcode: UInt, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt, lengthreturned: Long): NTSTATUS

public expect fun FltGetActivityIdCallbackData(callbackdata: Long, guid: Long): NTSTATUS

public expect fun FltGetBottomInstance(volume: PFLT_VOLUME, instance: Long): NTSTATUS

public expect fun FltGetContexts(fltobjects: Long, desiredcontexts: UShort, contexts: Long)

public expect fun FltGetContextsEx(fltobjects: Long, desiredcontexts: UShort, contextssize: ULong, contexts: Long): NTSTATUS

public expect fun FltGetDestinationFileNameInformation(instance: PFLT_INSTANCE, fileobject: Long, rootdirectory: HANDLE, filename: PCWSTR, filenamelength: UInt, nameoptions: UInt, retfilenameinformation: Long): NTSTATUS

public expect fun FltGetDeviceObject(volume: PFLT_VOLUME, deviceobject: Long): NTSTATUS

public expect fun FltGetDiskDeviceObject(volume: PFLT_VOLUME, diskdeviceobject: Long): NTSTATUS

public expect fun FltGetEcpListFromCallbackData(filter: PFLT_FILTER, callbackdata: Long, ecplist: Long): NTSTATUS

public expect fun FltGetFileContext(instance: PFLT_INSTANCE, fileobject: Long, context: Long): NTSTATUS

public expect fun FltGetFileNameInformation(callbackdata: Long, nameoptions: UInt, filenameinformation: Long): NTSTATUS

public expect fun FltGetFileNameInformationUnsafe(fileobject: Long, instance: PFLT_INSTANCE, nameoptions: UInt, filenameinformation: Long): NTSTATUS

public expect fun FltGetFileSystemType(fltobject: Long, filesystemtype: Long): NTSTATUS

public expect fun FltGetFilterFromInstance(instance: PFLT_INSTANCE, retfilter: Long): NTSTATUS

public expect fun FltGetFilterFromName(filtername: Long, retfilter: Long): NTSTATUS

public expect fun FltGetFilterInformation(filter: PFLT_FILTER, informationclass: FILTER_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): NTSTATUS

public expect fun FltGetFsZeroingOffset(data: Long, zeroingoffset: Long): NTSTATUS

public expect fun FltGetInstanceContext(instance: PFLT_INSTANCE, context: Long): NTSTATUS

public expect fun FltGetInstanceInformation(instance: PFLT_INSTANCE, informationclass: INSTANCE_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): NTSTATUS

public expect fun FltGetIoAttributionHandleFromCallbackData(data: Long): Long

public expect fun FltGetIoPriorityHint(data: Long): IO_PRIORITY_HINT

public expect fun FltGetIoPriorityHintFromCallbackData(data: Long): IO_PRIORITY_HINT

public expect fun FltGetIoPriorityHintFromFileObject(fileobject: Long): IO_PRIORITY_HINT

public expect fun FltGetIoPriorityHintFromThread(thread: PETHREAD): IO_PRIORITY_HINT

public expect fun FltGetIrpName(irpmajorcode: UByte): PSTR

public expect fun FltGetLowerInstance(currentinstance: PFLT_INSTANCE, lowerinstance: Long): NTSTATUS

public expect fun FltGetNewSystemBufferAddress(callbackdata: Long): Long

public expect fun FltGetNextExtraCreateParameter(filter: PFLT_FILTER, ecplist: Long, currentecpcontext: Long, nextecptype: Long, nextecpcontext: Long, nextecpcontextsize: Long): NTSTATUS

public expect fun FltGetRequestorProcess(callbackdata: Long): PEPROCESS

public expect fun FltGetRequestorProcessId(callbackdata: Long): UInt

public expect fun FltGetRequestorProcessIdEx(callbackdata: Long): HANDLE

public expect fun FltGetRequestorSessionId(callbackdata: Long, sessionid: Long): NTSTATUS

public expect fun FltGetRoutineAddress(fltmgrroutinename: PCSTR): Long

public expect fun FltGetSectionContext(instance: PFLT_INSTANCE, fileobject: Long, context: Long): NTSTATUS

public expect fun FltGetStreamContext(instance: PFLT_INSTANCE, fileobject: Long, context: Long): NTSTATUS

public expect fun FltGetStreamHandleContext(instance: PFLT_INSTANCE, fileobject: Long, context: Long): NTSTATUS

public expect fun FltGetSwappedBufferMdlAddress(callbackdata: Long): Long

public expect fun FltGetTopInstance(volume: PFLT_VOLUME, instance: Long): NTSTATUS

public expect fun FltGetTransactionContext(instance: PFLT_INSTANCE, transaction: Long, context: Long): NTSTATUS

public expect fun FltGetTunneledName(callbackdata: Long, filenameinformation: Long, rettunneledfilenameinformation: Long): NTSTATUS

public expect fun FltGetUpperInstance(currentinstance: PFLT_INSTANCE, upperinstance: Long): NTSTATUS

public expect fun FltGetVolumeContext(filter: PFLT_FILTER, volume: PFLT_VOLUME, context: Long): NTSTATUS

public expect fun FltGetVolumeFromDeviceObject(filter: PFLT_FILTER, deviceobject: Long, retvolume: Long): NTSTATUS

public expect fun FltGetVolumeFromFileObject(filter: PFLT_FILTER, fileobject: Long, retvolume: Long): NTSTATUS

public expect fun FltGetVolumeFromInstance(instance: PFLT_INSTANCE, retvolume: Long): NTSTATUS

public expect fun FltGetVolumeFromName(filter: PFLT_FILTER, volumename: Long, retvolume: Long): NTSTATUS

public expect fun FltGetVolumeGuidName(volume: PFLT_VOLUME, volumeguidname: Long, buffersizeneeded: Long): NTSTATUS

public expect fun FltGetVolumeInformation(volume: PFLT_VOLUME, informationclass: FILTER_VOLUME_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): NTSTATUS

public expect fun FltGetVolumeInstanceFromName(filter: PFLT_FILTER, volume: PFLT_VOLUME, instancename: Long, retinstance: Long): NTSTATUS

public expect fun FltGetVolumeName(volume: PFLT_VOLUME, volumename: Long, buffersizeneeded: Long): NTSTATUS

public expect fun FltGetVolumeProperties(volume: PFLT_VOLUME, volumeproperties: Long, volumepropertieslength: UInt, lengthreturned: Long): NTSTATUS

public expect fun FltInitExtraCreateParameterLookasideList(filter: PFLT_FILTER, lookaside: Long, flags: UInt, size: ULong, tag: UInt)

public expect fun FltInitializeFileLock(filelock: Long)

public expect fun FltInitializeOplock(oplock: Long)

public expect fun FltInitializePushLock(pushlock: Long)

public expect fun FltInsertExtraCreateParameter(filter: PFLT_FILTER, ecplist: Long, ecpcontext: Long): NTSTATUS

public expect fun FltIs32bitProcess(callbackdata: Long): Boolean

public expect fun FltIsCallbackDataDirty(data: Long): Boolean

public expect fun FltIsDirectory(fileobject: Long, instance: PFLT_INSTANCE, isdirectory: Long): NTSTATUS

public expect fun FltIsEcpAcknowledged(filter: PFLT_FILTER, ecpcontext: Long): Boolean

public expect fun FltIsEcpFromUserMode(filter: PFLT_FILTER, ecpcontext: Long): Boolean

public expect fun FltIsFltMgrVolumeDeviceObject(deviceobject: Long): Boolean

public expect fun FltIsIoCanceled(callbackdata: Long): Boolean

public expect fun FltIsIoRedirectionAllowed(sourceinstance: PFLT_INSTANCE, targetinstance: PFLT_INSTANCE, redirectionallowed: Long): NTSTATUS

public expect fun FltIsIoRedirectionAllowedForOperation(data: Long, targetinstance: PFLT_INSTANCE, redirectionallowedthisio: Long, redirectionallowedallio: Long): NTSTATUS

public expect fun FltIsOperationSynchronous(callbackdata: Long): Boolean

public expect fun FltIsVolumeSnapshot(fltobject: Long, issnapshotvolume: Long): NTSTATUS

public expect fun FltIsVolumeWritable(fltobject: Long, iswritable: Long): NTSTATUS

public expect fun FltLoadFilter(filtername: Long): NTSTATUS

public expect fun FltLockUserBuffer(callbackdata: Long): NTSTATUS

public expect fun FltNotifyFilterChangeDirectory(notifysync: PNOTIFY_SYNC, notifylist: Long, fscontext: Long, fulldirectoryname: Long, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifycallbackdata: Long, traversecallback: PCHECK_FOR_TRAVERSE_ACCESS, subjectcontext: Long, filtercallback: PFILTER_REPORT_CHANGE)

public expect fun FltObjectDereference(fltobject: Long)

public expect fun FltObjectReference(fltobject: Long): NTSTATUS

public expect fun FltOpenVolume(instance: PFLT_INSTANCE, volumehandle: Long, volumefileobject: Long): NTSTATUS

public expect fun FltOplockBreakH(oplock: Long, callbackdata: Long, flags: UInt, context: Long, waitcompletionroutine: PFLTOPLOCK_WAIT_COMPLETE_ROUTINE, prepostcallbackdataroutine: PFLTOPLOCK_PREPOST_CALLBACKDATA_ROUTINE): FLT_PREOP_CALLBACK_STATUS

public expect fun FltOplockBreakToNone(oplock: Long, callbackdata: Long, context: Long, waitcompletionroutine: PFLTOPLOCK_WAIT_COMPLETE_ROUTINE, prepostcallbackdataroutine: PFLTOPLOCK_PREPOST_CALLBACKDATA_ROUTINE): FLT_PREOP_CALLBACK_STATUS

public expect fun FltOplockBreakToNoneEx(oplock: Long, callbackdata: Long, flags: UInt, context: Long, waitcompletionroutine: PFLTOPLOCK_WAIT_COMPLETE_ROUTINE, prepostcallbackdataroutine: PFLTOPLOCK_PREPOST_CALLBACKDATA_ROUTINE): FLT_PREOP_CALLBACK_STATUS

public expect fun FltOplockFsctrl(oplock: Long, callbackdata: Long, opencount: UInt): FLT_PREOP_CALLBACK_STATUS

public expect fun FltOplockFsctrlEx(oplock: Long, callbackdata: Long, opencount: UInt, flags: UInt): FLT_PREOP_CALLBACK_STATUS

public expect fun FltOplockIsFastIoPossible(oplock: Long): Boolean

public expect fun FltOplockIsSharedRequest(callbackdata: Long): Boolean

public expect fun FltOplockKeysEqual(fo1: Long, fo2: Long): Boolean

public expect fun FltParseFileName(filename: Long, extension: Long, stream: Long, finalcomponent: Long): NTSTATUS

public expect fun FltParseFileNameInformation(filenameinformation: Long): NTSTATUS

public expect fun FltPerformAsynchronousIo(callbackdata: Long, callbackroutine: PFLT_COMPLETED_ASYNC_IO_CALLBACK, callbackcontext: Long): NTSTATUS

public expect fun FltPerformSynchronousIo(callbackdata: Long)

public expect fun FltPrePrepareComplete(instance: PFLT_INSTANCE, transaction: Long, transactioncontext: PFLT_CONTEXT): NTSTATUS

public expect fun FltPrepareComplete(instance: PFLT_INSTANCE, transaction: Long, transactioncontext: PFLT_CONTEXT): NTSTATUS

public expect fun FltPrepareToReuseEcp(filter: PFLT_FILTER, ecpcontext: Long)

public expect fun FltProcessFileLock(filelock: Long, callbackdata: Long, context: Long): FLT_PREOP_CALLBACK_STATUS

public expect fun FltPropagateActivityIdToThread(callbackdata: Long, propagateid: Long, originalid: Long): NTSTATUS

public expect fun FltPropagateIrpExtension(sourcedata: Long, targetdata: Long, flags: UInt): NTSTATUS

public expect fun FltPurgeFileNameInformationCache(instance: PFLT_INSTANCE, fileobject: Long): NTSTATUS

public expect fun FltQueryDirectoryFile(instance: PFLT_INSTANCE, fileobject: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, returnsingleentry: Boolean, filename: Long, restartscan: Boolean, lengthreturned: Long): NTSTATUS

public expect fun FltQueryDirectoryFileEx(instance: PFLT_INSTANCE, fileobject: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, queryflags: UInt, filename: Long, lengthreturned: Long): NTSTATUS

public expect fun FltQueryEaFile(instance: PFLT_INSTANCE, fileobject: Long, returnedeadata: Long, length: UInt, returnsingleentry: Boolean, ealist: Long, ealistlength: UInt, eaindex: Long, restartscan: Boolean, lengthreturned: Long): NTSTATUS

public expect fun FltQueryInformationByName(filter: PFLT_FILTER, instance: PFLT_INSTANCE, objectattributes: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, drivercontext: Long): NTSTATUS

public expect fun FltQueryInformationFile(instance: PFLT_INSTANCE, fileobject: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, lengthreturned: Long): NTSTATUS

public expect fun FltQueryQuotaInformationFile(instance: PFLT_INSTANCE, fileobject: Long, iostatusblock: Long, buffer: Long, length: UInt, returnsingleentry: Boolean, sidlist: Long, sidlistlength: UInt, startsid: Long, restartscan: Boolean, lengthreturned: Long): NTSTATUS

public expect fun FltQuerySecurityObject(instance: PFLT_INSTANCE, fileobject: Long, securityinformation: UInt, securitydescriptor: PSECURITY_DESCRIPTOR, length: UInt, lengthneeded: Long): NTSTATUS

public expect fun FltQueryVolumeInformation(instance: PFLT_INSTANCE, iosb: Long, fsinformation: Long, length: UInt, fsinformationclass: FS_INFORMATION_CLASS): NTSTATUS

public expect fun FltQueryVolumeInformationFile(instance: PFLT_INSTANCE, fileobject: Long, fsinformation: Long, length: UInt, fsinformationclass: FS_INFORMATION_CLASS, lengthreturned: Long): NTSTATUS

public expect fun FltQueueDeferredIoWorkItem(fltworkitem: PFLT_DEFERRED_IO_WORKITEM, data: Long, workerroutine: PFLT_DEFERRED_IO_WORKITEM_ROUTINE, queuetype: WORK_QUEUE_TYPE, context: Long): NTSTATUS

public expect fun FltQueueGenericWorkItem(fltworkitem: PFLT_GENERIC_WORKITEM, fltobject: Long, workerroutine: PFLT_GENERIC_WORKITEM_ROUTINE, queuetype: WORK_QUEUE_TYPE, context: Long): NTSTATUS

public expect fun FltReadFile(initiatinginstance: PFLT_INSTANCE, fileobject: Long, byteoffset: Long, length: UInt, buffer: Long, flags: UInt, bytesread: Long, callbackroutine: PFLT_COMPLETED_ASYNC_IO_CALLBACK, callbackcontext: Long): NTSTATUS

public expect fun FltReadFileEx(initiatinginstance: PFLT_INSTANCE, fileobject: Long, byteoffset: Long, length: UInt, buffer: Long, flags: UInt, bytesread: Long, callbackroutine: PFLT_COMPLETED_ASYNC_IO_CALLBACK, callbackcontext: Long, key: Long, mdl: Long): NTSTATUS

public expect fun FltReferenceContext(context: PFLT_CONTEXT)

public expect fun FltReferenceFileNameInformation(filenameinformation: Long)

public expect fun FltRegisterFilter(driver: Long, registration: Long, retfilter: Long): NTSTATUS

public expect fun FltRegisterForDataScan(instance: PFLT_INSTANCE): NTSTATUS

public expect fun FltReissueSynchronousIo(initiatinginstance: PFLT_INSTANCE, callbackdata: Long)

public expect fun FltReleaseContext(context: PFLT_CONTEXT)

public expect fun FltReleaseContexts(contexts: Long)

public expect fun FltReleaseContextsEx(contextssize: ULong, contexts: Long)

public expect fun FltReleaseFileNameInformation(filenameinformation: Long)

public expect fun FltReleasePushLock(pushlock: Long)

public expect fun FltReleasePushLockEx(pushlock: Long, flags: UInt)

public expect fun FltReleaseResource(resource: Long)

public expect fun FltRemoveExtraCreateParameter(filter: PFLT_FILTER, ecplist: Long, ecptype: Long, ecpcontext: Long, ecpcontextsize: Long): NTSTATUS

public expect fun FltRemoveOpenReparseEntry(filter: PFLT_FILTER, data: Long, openreparseentry: Long)

public expect fun FltRequestFileInfoOnCreateCompletion(filter: PFLT_FILTER, data: Long, infoclassflags: UInt): NTSTATUS

public expect fun FltRequestOperationStatusCallback(data: Long, callbackroutine: PFLT_GET_OPERATION_STATUS_CALLBACK, requestercontext: Long): NTSTATUS

public expect fun FltRetainSwappedBufferMdlAddress(callbackdata: Long)

public expect fun FltRetrieveFileInfoOnCreateCompletion(filter: PFLT_FILTER, data: Long, infoclass: UInt, size: Long): Long

public expect fun FltRetrieveFileInfoOnCreateCompletionEx(filter: PFLT_FILTER, data: Long, infoclass: UInt, retinfosize: Long, retinfobuffer: Long): NTSTATUS

public expect fun FltRetrieveIoPriorityInfo(data: Long, fileobject: Long, thread: PETHREAD, priorityinfo: Long): NTSTATUS

public expect fun FltReuseCallbackData(callbackdata: Long)

public expect fun FltRollbackComplete(instance: PFLT_INSTANCE, transaction: Long, transactioncontext: PFLT_CONTEXT): NTSTATUS

public expect fun FltRollbackEnlistment(instance: PFLT_INSTANCE, transaction: Long, transactioncontext: PFLT_CONTEXT): NTSTATUS

public expect fun FltSendMessage(filter: PFLT_FILTER, clientport: Long, senderbuffer: Long, senderbufferlength: UInt, replybuffer: Long, replylength: Long, timeout: Long): NTSTATUS

public expect fun FltSetActivityIdCallbackData(callbackdata: Long, guid: Long): NTSTATUS

public expect fun FltSetCallbackDataDirty(data: Long)

public expect fun FltSetCancelCompletion(callbackdata: Long, canceledcallback: PFLT_COMPLETE_CANCELED_CALLBACK): NTSTATUS

public expect fun FltSetEaFile(instance: PFLT_INSTANCE, fileobject: Long, eabuffer: Long, length: UInt): NTSTATUS

public expect fun FltSetEcpListIntoCallbackData(filter: PFLT_FILTER, callbackdata: Long, ecplist: Long): NTSTATUS

public expect fun FltSetFileContext(instance: PFLT_INSTANCE, fileobject: Long, operation: FLT_SET_CONTEXT_OPERATION, newcontext: PFLT_CONTEXT, oldcontext: Long): NTSTATUS

public expect fun FltSetFsZeroingOffset(data: Long, zeroingoffset: UInt): NTSTATUS

public expect fun FltSetFsZeroingOffsetRequired(data: Long): NTSTATUS

public expect fun FltSetInformationFile(instance: PFLT_INSTANCE, fileobject: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS): NTSTATUS

public expect fun FltSetInstanceContext(instance: PFLT_INSTANCE, operation: FLT_SET_CONTEXT_OPERATION, newcontext: PFLT_CONTEXT, oldcontext: Long): NTSTATUS

public expect fun FltSetIoPriorityHintIntoCallbackData(data: Long, priorityhint: IO_PRIORITY_HINT): NTSTATUS

public expect fun FltSetIoPriorityHintIntoFileObject(fileobject: Long, priorityhint: IO_PRIORITY_HINT): NTSTATUS

public expect fun FltSetIoPriorityHintIntoThread(thread: PETHREAD, priorityhint: IO_PRIORITY_HINT): NTSTATUS

public expect fun FltSetQuotaInformationFile(instance: PFLT_INSTANCE, fileobject: Long, buffer: Long, length: UInt): NTSTATUS

public expect fun FltSetSecurityObject(instance: PFLT_INSTANCE, fileobject: Long, securityinformation: UInt, securitydescriptor: PSECURITY_DESCRIPTOR): NTSTATUS

public expect fun FltSetStreamContext(instance: PFLT_INSTANCE, fileobject: Long, operation: FLT_SET_CONTEXT_OPERATION, newcontext: PFLT_CONTEXT, oldcontext: Long): NTSTATUS

public expect fun FltSetStreamHandleContext(instance: PFLT_INSTANCE, fileobject: Long, operation: FLT_SET_CONTEXT_OPERATION, newcontext: PFLT_CONTEXT, oldcontext: Long): NTSTATUS

public expect fun FltSetTransactionContext(instance: PFLT_INSTANCE, transaction: Long, operation: FLT_SET_CONTEXT_OPERATION, newcontext: PFLT_CONTEXT, oldcontext: Long): NTSTATUS

public expect fun FltSetVolumeContext(volume: PFLT_VOLUME, operation: FLT_SET_CONTEXT_OPERATION, newcontext: PFLT_CONTEXT, oldcontext: Long): NTSTATUS

public expect fun FltSetVolumeInformation(instance: PFLT_INSTANCE, iosb: Long, fsinformation: Long, length: UInt, fsinformationclass: FS_INFORMATION_CLASS): NTSTATUS

public expect fun FltStartFiltering(filter: PFLT_FILTER): NTSTATUS

public expect fun FltSupportsFileContexts(fileobject: Long): Boolean

public expect fun FltSupportsFileContextsEx(fileobject: Long, instance: PFLT_INSTANCE): Boolean

public expect fun FltSupportsStreamContexts(fileobject: Long): Boolean

public expect fun FltSupportsStreamHandleContexts(fileobject: Long): Boolean

public expect fun FltTagFile(initiatinginstance: PFLT_INSTANCE, fileobject: Long, filetag: UInt, guid: Long, databuffer: Long, databufferlength: UShort): NTSTATUS

public expect fun FltTagFileEx(initiatinginstance: PFLT_INSTANCE, fileobject: Long, filetag: UInt, guid: Long, databuffer: Long, databufferlength: UShort, existingfiletag: UInt, existingguid: Long, flags: UInt): NTSTATUS

public expect fun FltUninitializeFileLock(filelock: Long)

public expect fun FltUninitializeOplock(oplock: Long)

public expect fun FltUnloadFilter(filtername: Long): NTSTATUS

public expect fun FltUnregisterFilter(filter: PFLT_FILTER)

public expect fun FltUntagFile(initiatinginstance: PFLT_INSTANCE, fileobject: Long, filetag: UInt, guid: Long): NTSTATUS

public expect fun FltVetoBypassIo(callbackdata: Long, fltobjects: Long, operationstatus: NTSTATUS, failurereason: Long): NTSTATUS

public expect fun FltWriteFile(initiatinginstance: PFLT_INSTANCE, fileobject: Long, byteoffset: Long, length: UInt, buffer: Long, flags: UInt, byteswritten: Long, callbackroutine: PFLT_COMPLETED_ASYNC_IO_CALLBACK, callbackcontext: Long): NTSTATUS

public expect fun FltWriteFileEx(initiatinginstance: PFLT_INSTANCE, fileobject: Long, byteoffset: Long, length: UInt, buffer: Long, flags: UInt, byteswritten: Long, callbackroutine: PFLT_COMPLETED_ASYNC_IO_CALLBACK, callbackcontext: Long, key: Long, mdl: Long): NTSTATUS

public expect fun FltpTraceRedirectedFileIo(originatingfileobject: Long, childcallbackdata: Long): NTSTATUS
