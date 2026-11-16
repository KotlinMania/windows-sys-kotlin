package io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.windows.wdk.foundation.IoPriorityHint
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Peprocess
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pethread
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PnotifySync
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PoolType
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FileInformationClass
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FsInformationClass
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.PcheckForTraverseAccess
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.PfilterReportChange
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.PfsrtlExtraCreateParameterCleanupCallback
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.PunlockRoutine
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.WorkQueueType
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.FilterInformationClass
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.FilterVolumeInformationClass
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.InstanceInformationClass
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.WaitType

public expect fun fltAcknowledgeEcp(filter: PfltFilter, ecpcontext: ConstPtr)

public expect fun fltAcquirePushLockExclusive(pushlock: MutPtr)

public expect fun fltAcquirePushLockExclusiveEx(pushlock: MutPtr, flags: UInt)

public expect fun fltAcquirePushLockShared(pushlock: MutPtr)

public expect fun fltAcquirePushLockSharedEx(pushlock: MutPtr, flags: UInt)

public expect fun fltAcquireResourceExclusive(resource: MutPtr)

public expect fun fltAcquireResourceShared(resource: MutPtr)

public expect fun fltAddOpenReparseEntry(filter: PfltFilter, data: ConstPtr, openreparseentry: ConstPtr): Ntstatus

public expect fun fltAdjustDeviceStackSizeForIoRedirection(sourceinstance: PfltInstance, targetinstance: PfltInstance, sourcedevicestacksizemodified: MutPtr): Ntstatus

public expect fun fltAllocateCallbackData(instance: PfltInstance, fileobject: ConstPtr, retnewcallbackdata: MutPtr): Ntstatus

public expect fun fltAllocateCallbackDataEx(instance: PfltInstance, fileobject: ConstPtr, flags: UInt, retnewcallbackdata: MutPtr): Ntstatus

public expect fun fltAllocateContext(filter: PfltFilter, contexttype: UShort, contextsize: ULong, pooltype: PoolType, returnedcontext: MutPtr): Ntstatus

public expect fun fltAllocateDeferredIoWorkItem(): PfltDeferredIoWorkitem

public expect fun fltAllocateExtraCreateParameter(filter: PfltFilter, ecptype: ConstPtr, sizeofcontext: UInt, flags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, pooltag: UInt, ecpcontext: MutPtr): Ntstatus

public expect fun fltAllocateExtraCreateParameterFromLookasideList(filter: PfltFilter, ecptype: ConstPtr, sizeofcontext: UInt, flags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, lookasidelist: MutPtr, ecpcontext: MutPtr): Ntstatus

public expect fun fltAllocateExtraCreateParameterList(filter: PfltFilter, flags: UInt, ecplist: MutPtr): Ntstatus

public expect fun fltAllocateFileLock(completelockcallbackdataroutine: PfltCompleteLockCallbackDataRoutine, unlockroutine: PunlockRoutine): MutPtr

public expect fun fltAllocateGenericWorkItem(): PfltGenericWorkitem

public expect fun fltAllocatePoolAlignedWithTag(instance: PfltInstance, pooltype: PoolType, numberofbytes: ULong, tag: UInt): MutPtr

public expect fun fltApplyPriorityInfoThread(inputpriorityinfo: ConstPtr, outputpriorityinfo: MutPtr, thread: Pethread): Ntstatus

public expect fun fltAttachVolume(filter: PfltFilter, volume: PfltVolume, instancename: ConstPtr, retinstance: MutPtr): Ntstatus

public expect fun fltAttachVolumeAtAltitude(filter: PfltFilter, volume: PfltVolume, altitude: ConstPtr, instancename: ConstPtr, retinstance: MutPtr): Ntstatus

public expect fun fltBuildDefaultSecurityDescriptor(securitydescriptor: MutPtr, desiredaccess: UInt): Ntstatus

public expect fun fltCancelFileOpen(instance: PfltInstance, fileobject: ConstPtr)

public expect fun fltCancelIo(callbackdata: ConstPtr): Boolean

public expect fun fltCancellableWaitForMultipleObjects(count: UInt, objectarray: ConstPtr, waittype: WaitType, timeout: ConstPtr, waitblockarray: ConstPtr, callbackdata: ConstPtr): Ntstatus

public expect fun fltCancellableWaitForSingleObject(obj: ConstPtr, timeout: ConstPtr, callbackdata: ConstPtr): Ntstatus

public expect fun fltCbdqDisable(cbdq: MutPtr)

public expect fun fltCbdqEnable(cbdq: MutPtr)

public expect fun fltCbdqInitialize(instance: PfltInstance, cbdq: MutPtr, cbdqinsertio: PfltCallbackDataQueueInsertIo, cbdqremoveio: PfltCallbackDataQueueRemoveIo, cbdqpeeknextio: PfltCallbackDataQueuePeekNextIo, cbdqacquire: PfltCallbackDataQueueAcquire, cbdqrelease: PfltCallbackDataQueueRelease, cbdqcompletecanceledio: PfltCallbackDataQueueCompleteCanceledIo): Ntstatus

public expect fun fltCbdqInsertIo(cbdq: MutPtr, cbd: ConstPtr, context: ConstPtr, insertcontext: ConstPtr): Ntstatus

public expect fun fltCbdqRemoveIo(cbdq: MutPtr, context: ConstPtr): MutPtr

public expect fun fltCbdqRemoveNextIo(cbdq: MutPtr, peekcontext: ConstPtr): MutPtr

public expect fun fltCheckAndGrowNameControl(namectrl: MutPtr, newsize: UShort): Ntstatus

public expect fun fltCheckLockForReadAccess(filelock: ConstPtr, callbackdata: ConstPtr): Boolean

public expect fun fltCheckLockForWriteAccess(filelock: ConstPtr, callbackdata: ConstPtr): Boolean

public expect fun fltCheckOplock(oplock: ConstPtr, callbackdata: ConstPtr, context: ConstPtr, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus

public expect fun fltCheckOplockEx(oplock: ConstPtr, callbackdata: ConstPtr, flags: UInt, context: ConstPtr, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus

public expect fun fltClearCallbackDataDirty(data: MutPtr)

public expect fun fltClearCancelCompletion(callbackdata: ConstPtr): Ntstatus

public expect fun fltClose(filehandle: Handle): Ntstatus

public expect fun fltCloseClientPort(filter: PfltFilter, clientport: MutPtr)

public expect fun fltCloseCommunicationPort(serverport: PfltPort)

public expect fun fltCloseSectionForDataScan(sectioncontext: PfltContext): Ntstatus

public expect fun fltCommitComplete(instance: PfltInstance, transaction: ConstPtr, transactioncontext: PfltContext): Ntstatus

public expect fun fltCommitFinalizeComplete(instance: PfltInstance, transaction: ConstPtr, transactioncontext: PfltContext): Ntstatus

public expect fun fltCompareInstanceAltitudes(instance1: PfltInstance, instance2: PfltInstance): Int

public expect fun fltCompletePendedPostOperation(callbackdata: ConstPtr)

public expect fun fltCompletePendedPreOperation(callbackdata: ConstPtr, callbackstatus: FltPreopCallbackStatus, context: ConstPtr)

public expect fun fltCopyOpenReparseList(filter: PfltFilter, data: ConstPtr, ecplist: MutPtr): Ntstatus

public expect fun fltCreateCommunicationPort(filter: PfltFilter, serverport: MutPtr, objectattributes: ConstPtr, serverportcookie: ConstPtr, connectnotifycallback: PfltConnectNotify, disconnectnotifycallback: PfltDisconnectNotify, messagenotifycallback: PfltMessageNotify, maxconnections: Int): Ntstatus

public expect fun fltCreateFile(filter: PfltFilter, instance: PfltInstance, filehandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, iostatusblock: MutPtr, allocationsize: ConstPtr, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: ConstPtr, ealength: UInt, flags: UInt): Ntstatus

public expect fun fltCreateFileEx(filter: PfltFilter, instance: PfltInstance, filehandle: MutPtr, fileobject: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, iostatusblock: MutPtr, allocationsize: ConstPtr, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: ConstPtr, ealength: UInt, flags: UInt): Ntstatus

public expect fun fltCreateFileEx2(filter: PfltFilter, instance: PfltInstance, filehandle: MutPtr, fileobject: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, iostatusblock: MutPtr, allocationsize: ConstPtr, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: ConstPtr, ealength: UInt, flags: UInt, drivercontext: ConstPtr): Ntstatus

public expect fun fltCreateMailslotFile(filter: PfltFilter, instance: PfltInstance, filehandle: MutPtr, fileobject: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, iostatusblock: MutPtr, createoptions: UInt, mailslotquota: UInt, maximummessagesize: UInt, readtimeout: ConstPtr, drivercontext: ConstPtr): Ntstatus

public expect fun fltCreateNamedPipeFile(filter: PfltFilter, instance: PfltInstance, filehandle: MutPtr, fileobject: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, iostatusblock: MutPtr, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, namedpipetype: UInt, readmode: UInt, completionmode: UInt, maximuminstances: UInt, inboundquota: UInt, outboundquota: UInt, defaulttimeout: ConstPtr, drivercontext: ConstPtr): Ntstatus

public expect fun fltCreateSectionForDataScan(instance: PfltInstance, fileobject: ConstPtr, sectioncontext: PfltContext, desiredaccess: UInt, objectattributes: ConstPtr, maximumsize: ConstPtr, sectionpageprotection: UInt, allocationattributes: UInt, flags: UInt, sectionhandle: MutPtr, sectionobject: MutPtr, sectionfilesize: MutPtr): Ntstatus

public expect fun fltCreateSystemVolumeInformationFolder(instance: PfltInstance): Ntstatus

public expect fun fltCurrentBatchOplock(oplock: ConstPtr): Boolean

public expect fun fltCurrentOplock(oplock: ConstPtr): Boolean

public expect fun fltCurrentOplockH(oplock: ConstPtr): Boolean

public expect fun fltDecodeParameters(callbackdata: ConstPtr, mdladdresspointer: MutPtr, buffer: MutPtr, length: MutPtr, desiredaccess: MutPtr): Ntstatus

public expect fun fltDeleteContext(context: PfltContext)

public expect fun fltDeleteExtraCreateParameterLookasideList(filter: PfltFilter, lookaside: MutPtr, flags: UInt)

public expect fun fltDeleteFileContext(instance: PfltInstance, fileobject: ConstPtr, oldcontext: MutPtr): Ntstatus

public expect fun fltDeleteInstanceContext(instance: PfltInstance, oldcontext: MutPtr): Ntstatus

public expect fun fltDeletePushLock(pushlock: ConstPtr)

public expect fun fltDeleteStreamContext(instance: PfltInstance, fileobject: ConstPtr, oldcontext: MutPtr): Ntstatus

public expect fun fltDeleteStreamHandleContext(instance: PfltInstance, fileobject: ConstPtr, oldcontext: MutPtr): Ntstatus

public expect fun fltDeleteTransactionContext(instance: PfltInstance, transaction: ConstPtr, oldcontext: MutPtr): Ntstatus

public expect fun fltDeleteVolumeContext(filter: PfltFilter, volume: PfltVolume, oldcontext: MutPtr): Ntstatus

public expect fun fltDetachVolume(filter: PfltFilter, volume: PfltVolume, instancename: ConstPtr): Ntstatus

public expect fun fltDeviceIoControlFile(instance: PfltInstance, fileobject: ConstPtr, iocontrolcode: UInt, inputbuffer: ConstPtr, inputbufferlength: UInt, outputbuffer: MutPtr, outputbufferlength: UInt, lengthreturned: MutPtr): Ntstatus

public expect fun fltDoCompletionProcessingWhenSafe(data: ConstPtr, fltobjects: ConstPtr, completioncontext: ConstPtr, flags: UInt, safepostcallback: PfltPostOperationCallback, retpostoperationstatus: MutPtr): Boolean

public expect fun fltEnlistInTransaction(instance: PfltInstance, transaction: ConstPtr, transactioncontext: PfltContext, notificationmask: UInt): Ntstatus

public expect fun fltEnumerateFilterInformation(index: UInt, informationclass: FilterInformationClass, buffer: MutPtr, buffersize: UInt, bytesreturned: MutPtr): Ntstatus

public expect fun fltEnumerateFilters(filterlist: MutPtr, filterlistsize: UInt, numberfiltersreturned: MutPtr): Ntstatus

public expect fun fltEnumerateInstanceInformationByDeviceObject(deviceobject: ConstPtr, index: UInt, informationclass: InstanceInformationClass, buffer: MutPtr, buffersize: UInt, bytesreturned: MutPtr): Ntstatus

public expect fun fltEnumerateInstanceInformationByFilter(filter: PfltFilter, index: UInt, informationclass: InstanceInformationClass, buffer: MutPtr, buffersize: UInt, bytesreturned: MutPtr): Ntstatus

public expect fun fltEnumerateInstanceInformationByVolume(volume: PfltVolume, index: UInt, informationclass: InstanceInformationClass, buffer: MutPtr, buffersize: UInt, bytesreturned: MutPtr): Ntstatus

public expect fun fltEnumerateInstanceInformationByVolumeName(volumename: ConstPtr, index: UInt, informationclass: InstanceInformationClass, buffer: MutPtr, buffersize: UInt, bytesreturned: MutPtr): Ntstatus

public expect fun fltEnumerateInstances(volume: PfltVolume, filter: PfltFilter, instancelist: MutPtr, instancelistsize: UInt, numberinstancesreturned: MutPtr): Ntstatus

public expect fun fltEnumerateVolumeInformation(filter: PfltFilter, index: UInt, informationclass: FilterVolumeInformationClass, buffer: MutPtr, buffersize: UInt, bytesreturned: MutPtr): Ntstatus

public expect fun fltEnumerateVolumes(filter: PfltFilter, volumelist: MutPtr, volumelistsize: UInt, numbervolumesreturned: MutPtr): Ntstatus

public expect fun fltFastIoMdlRead(initiatinginstance: PfltInstance, fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, lockkey: UInt, mdlchain: MutPtr, iostatus: MutPtr): Boolean

public expect fun fltFastIoMdlReadComplete(initiatinginstance: PfltInstance, fileobject: ConstPtr, mdlchain: ConstPtr): Boolean

public expect fun fltFastIoMdlWriteComplete(initiatinginstance: PfltInstance, fileobject: ConstPtr, fileoffset: ConstPtr, mdlchain: ConstPtr): Boolean

public expect fun fltFastIoPrepareMdlWrite(initiatinginstance: PfltInstance, fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, lockkey: UInt, mdlchain: MutPtr, iostatus: MutPtr): Boolean

public expect fun fltFindExtraCreateParameter(filter: PfltFilter, ecplist: ConstPtr, ecptype: ConstPtr, ecpcontext: MutPtr, ecpcontextsize: MutPtr): Ntstatus

public expect fun fltFlushBuffers(instance: PfltInstance, fileobject: ConstPtr): Ntstatus

public expect fun fltFlushBuffers2(instance: PfltInstance, fileobject: ConstPtr, flushtype: UInt, callbackdata: ConstPtr): Ntstatus

public expect fun fltFreeCallbackData(callbackdata: ConstPtr)

public expect fun fltFreeDeferredIoWorkItem(fltworkitem: PfltDeferredIoWorkitem)

public expect fun fltFreeExtraCreateParameter(filter: PfltFilter, ecpcontext: ConstPtr)

public expect fun fltFreeExtraCreateParameterList(filter: PfltFilter, ecplist: ConstPtr)

public expect fun fltFreeFileLock(filelock: ConstPtr)

public expect fun fltFreeGenericWorkItem(fltworkitem: PfltGenericWorkitem)

public expect fun fltFreeOpenReparseList(filter: PfltFilter, ecplist: ConstPtr)

public expect fun fltFreePoolAlignedWithTag(instance: PfltInstance, buffer: ConstPtr, tag: UInt)

public expect fun fltFreeSecurityDescriptor(securitydescriptor: PsecurityDescriptor)

public expect fun fltFsControlFile(instance: PfltInstance, fileobject: ConstPtr, fscontrolcode: UInt, inputbuffer: ConstPtr, inputbufferlength: UInt, outputbuffer: MutPtr, outputbufferlength: UInt, lengthreturned: MutPtr): Ntstatus

public expect fun fltGetActivityIdCallbackData(callbackdata: ConstPtr, guid: MutPtr): Ntstatus

public expect fun fltGetBottomInstance(volume: PfltVolume, instance: MutPtr): Ntstatus

public expect fun fltGetContexts(fltobjects: ConstPtr, desiredcontexts: UShort, contexts: MutPtr)

public expect fun fltGetContextsEx(fltobjects: ConstPtr, desiredcontexts: UShort, contextssize: ULong, contexts: MutPtr): Ntstatus

public expect fun fltGetDestinationFileNameInformation(instance: PfltInstance, fileobject: ConstPtr, rootdirectory: Handle, filename: Pcwstr, filenamelength: UInt, nameoptions: UInt, retfilenameinformation: MutPtr): Ntstatus

public expect fun fltGetDeviceObject(volume: PfltVolume, deviceobject: MutPtr): Ntstatus

public expect fun fltGetDiskDeviceObject(volume: PfltVolume, diskdeviceobject: MutPtr): Ntstatus

public expect fun fltGetEcpListFromCallbackData(filter: PfltFilter, callbackdata: ConstPtr, ecplist: MutPtr): Ntstatus

public expect fun fltGetFileContext(instance: PfltInstance, fileobject: ConstPtr, context: MutPtr): Ntstatus

public expect fun fltGetFileNameInformation(callbackdata: ConstPtr, nameoptions: UInt, filenameinformation: MutPtr): Ntstatus

public expect fun fltGetFileNameInformationUnsafe(fileobject: ConstPtr, instance: PfltInstance, nameoptions: UInt, filenameinformation: MutPtr): Ntstatus

public expect fun fltGetFileSystemType(fltobject: ConstPtr, filesystemtype: MutPtr): Ntstatus

public expect fun fltGetFilterFromInstance(instance: PfltInstance, retfilter: MutPtr): Ntstatus

public expect fun fltGetFilterFromName(filtername: ConstPtr, retfilter: MutPtr): Ntstatus

public expect fun fltGetFilterInformation(filter: PfltFilter, informationclass: FilterInformationClass, buffer: MutPtr, buffersize: UInt, bytesreturned: MutPtr): Ntstatus

public expect fun fltGetFsZeroingOffset(data: ConstPtr, zeroingoffset: MutPtr): Ntstatus

public expect fun fltGetInstanceContext(instance: PfltInstance, context: MutPtr): Ntstatus

public expect fun fltGetInstanceInformation(instance: PfltInstance, informationclass: InstanceInformationClass, buffer: MutPtr, buffersize: UInt, bytesreturned: MutPtr): Ntstatus

public expect fun fltGetIoAttributionHandleFromCallbackData(data: ConstPtr): MutPtr

public expect fun fltGetIoPriorityHint(data: ConstPtr): IoPriorityHint

public expect fun fltGetIoPriorityHintFromCallbackData(data: ConstPtr): IoPriorityHint

public expect fun fltGetIoPriorityHintFromFileObject(fileobject: ConstPtr): IoPriorityHint

public expect fun fltGetIoPriorityHintFromThread(thread: Pethread): IoPriorityHint

public expect fun fltGetIrpName(irpmajorcode: UByte): Pstr

public expect fun fltGetLowerInstance(currentinstance: PfltInstance, lowerinstance: MutPtr): Ntstatus

public expect fun fltGetNewSystemBufferAddress(callbackdata: ConstPtr): MutPtr

public expect fun fltGetNextExtraCreateParameter(filter: PfltFilter, ecplist: ConstPtr, currentecpcontext: ConstPtr, nextecptype: MutPtr, nextecpcontext: MutPtr, nextecpcontextsize: MutPtr): Ntstatus

public expect fun fltGetRequestorProcess(callbackdata: ConstPtr): Peprocess

public expect fun fltGetRequestorProcessId(callbackdata: ConstPtr): UInt

public expect fun fltGetRequestorProcessIdEx(callbackdata: ConstPtr): Handle

public expect fun fltGetRequestorSessionId(callbackdata: ConstPtr, sessionid: MutPtr): Ntstatus

public expect fun fltGetRoutineAddress(fltmgrroutinename: Pcstr): MutPtr

public expect fun fltGetSectionContext(instance: PfltInstance, fileobject: ConstPtr, context: MutPtr): Ntstatus

public expect fun fltGetStreamContext(instance: PfltInstance, fileobject: ConstPtr, context: MutPtr): Ntstatus

public expect fun fltGetStreamHandleContext(instance: PfltInstance, fileobject: ConstPtr, context: MutPtr): Ntstatus

public expect fun fltGetSwappedBufferMdlAddress(callbackdata: ConstPtr): MutPtr

public expect fun fltGetTopInstance(volume: PfltVolume, instance: MutPtr): Ntstatus

public expect fun fltGetTransactionContext(instance: PfltInstance, transaction: ConstPtr, context: MutPtr): Ntstatus

public expect fun fltGetTunneledName(callbackdata: ConstPtr, filenameinformation: ConstPtr, rettunneledfilenameinformation: MutPtr): Ntstatus

public expect fun fltGetUpperInstance(currentinstance: PfltInstance, upperinstance: MutPtr): Ntstatus

public expect fun fltGetVolumeContext(filter: PfltFilter, volume: PfltVolume, context: MutPtr): Ntstatus

public expect fun fltGetVolumeFromDeviceObject(filter: PfltFilter, deviceobject: ConstPtr, retvolume: MutPtr): Ntstatus

public expect fun fltGetVolumeFromFileObject(filter: PfltFilter, fileobject: ConstPtr, retvolume: MutPtr): Ntstatus

public expect fun fltGetVolumeFromInstance(instance: PfltInstance, retvolume: MutPtr): Ntstatus

public expect fun fltGetVolumeFromName(filter: PfltFilter, volumename: ConstPtr, retvolume: MutPtr): Ntstatus

public expect fun fltGetVolumeGuidName(volume: PfltVolume, volumeguidname: MutPtr, buffersizeneeded: MutPtr): Ntstatus

public expect fun fltGetVolumeInformation(volume: PfltVolume, informationclass: FilterVolumeInformationClass, buffer: MutPtr, buffersize: UInt, bytesreturned: MutPtr): Ntstatus

public expect fun fltGetVolumeInstanceFromName(filter: PfltFilter, volume: PfltVolume, instancename: ConstPtr, retinstance: MutPtr): Ntstatus

public expect fun fltGetVolumeName(volume: PfltVolume, volumename: MutPtr, buffersizeneeded: MutPtr): Ntstatus

public expect fun fltGetVolumeProperties(volume: PfltVolume, volumeproperties: MutPtr, volumepropertieslength: UInt, lengthreturned: MutPtr): Ntstatus

public expect fun fltInitExtraCreateParameterLookasideList(filter: PfltFilter, lookaside: MutPtr, flags: UInt, size: ULong, tag: UInt)

public expect fun fltInitializeFileLock(filelock: MutPtr)

public expect fun fltInitializeOplock(oplock: MutPtr)

public expect fun fltInitializePushLock(pushlock: MutPtr)

public expect fun fltInsertExtraCreateParameter(filter: PfltFilter, ecplist: MutPtr, ecpcontext: MutPtr): Ntstatus

public expect fun fltIs32bitProcess(callbackdata: ConstPtr): Boolean

public expect fun fltIsCallbackDataDirty(data: ConstPtr): Boolean

public expect fun fltIsDirectory(fileobject: ConstPtr, instance: PfltInstance, isdirectory: MutPtr): Ntstatus

public expect fun fltIsEcpAcknowledged(filter: PfltFilter, ecpcontext: ConstPtr): Boolean

public expect fun fltIsEcpFromUserMode(filter: PfltFilter, ecpcontext: ConstPtr): Boolean

public expect fun fltIsFltMgrVolumeDeviceObject(deviceobject: ConstPtr): Boolean

public expect fun fltIsIoCanceled(callbackdata: ConstPtr): Boolean

public expect fun fltIsIoRedirectionAllowed(sourceinstance: PfltInstance, targetinstance: PfltInstance, redirectionallowed: MutPtr): Ntstatus

public expect fun fltIsIoRedirectionAllowedForOperation(data: ConstPtr, targetinstance: PfltInstance, redirectionallowedthisio: MutPtr, redirectionallowedallio: MutPtr): Ntstatus

public expect fun fltIsOperationSynchronous(callbackdata: ConstPtr): Boolean

public expect fun fltIsVolumeSnapshot(fltobject: ConstPtr, issnapshotvolume: MutPtr): Ntstatus

public expect fun fltIsVolumeWritable(fltobject: ConstPtr, iswritable: MutPtr): Ntstatus

public expect fun fltLoadFilter(filtername: ConstPtr): Ntstatus

public expect fun fltLockUserBuffer(callbackdata: ConstPtr): Ntstatus

public expect fun fltNotifyFilterChangeDirectory(notifysync: PnotifySync, notifylist: MutPtr, fscontext: ConstPtr, fulldirectoryname: ConstPtr, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifycallbackdata: ConstPtr, traversecallback: PcheckForTraverseAccess, subjectcontext: ConstPtr, filtercallback: PfilterReportChange)

public expect fun fltObjectDereference(fltobject: MutPtr)

public expect fun fltObjectReference(fltobject: MutPtr): Ntstatus

public expect fun fltOpenVolume(instance: PfltInstance, volumehandle: MutPtr, volumefileobject: MutPtr): Ntstatus

public expect fun fltOplockBreakH(oplock: ConstPtr, callbackdata: ConstPtr, flags: UInt, context: ConstPtr, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus

public expect fun fltOplockBreakToNone(oplock: ConstPtr, callbackdata: ConstPtr, context: ConstPtr, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus

public expect fun fltOplockBreakToNoneEx(oplock: ConstPtr, callbackdata: ConstPtr, flags: UInt, context: ConstPtr, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus

public expect fun fltOplockFsctrl(oplock: ConstPtr, callbackdata: ConstPtr, opencount: UInt): FltPreopCallbackStatus

public expect fun fltOplockFsctrlEx(oplock: ConstPtr, callbackdata: ConstPtr, opencount: UInt, flags: UInt): FltPreopCallbackStatus

public expect fun fltOplockIsFastIoPossible(oplock: ConstPtr): Boolean

public expect fun fltOplockIsSharedRequest(callbackdata: ConstPtr): Boolean

public expect fun fltOplockKeysEqual(fo1: ConstPtr, fo2: ConstPtr): Boolean

public expect fun fltParseFileName(filename: ConstPtr, extension: MutPtr, stream: MutPtr, finalcomponent: MutPtr): Ntstatus

public expect fun fltParseFileNameInformation(filenameinformation: MutPtr): Ntstatus

public expect fun fltPerformAsynchronousIo(callbackdata: MutPtr, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: ConstPtr): Ntstatus

public expect fun fltPerformSynchronousIo(callbackdata: MutPtr)

public expect fun fltPrePrepareComplete(instance: PfltInstance, transaction: ConstPtr, transactioncontext: PfltContext): Ntstatus

public expect fun fltPrepareComplete(instance: PfltInstance, transaction: ConstPtr, transactioncontext: PfltContext): Ntstatus

public expect fun fltPrepareToReuseEcp(filter: PfltFilter, ecpcontext: ConstPtr)

public expect fun fltProcessFileLock(filelock: ConstPtr, callbackdata: ConstPtr, context: ConstPtr): FltPreopCallbackStatus

public expect fun fltPropagateActivityIdToThread(callbackdata: ConstPtr, propagateid: MutPtr, originalid: MutPtr): Ntstatus

public expect fun fltPropagateIrpExtension(sourcedata: ConstPtr, targetdata: MutPtr, flags: UInt): Ntstatus

public expect fun fltPurgeFileNameInformationCache(instance: PfltInstance, fileobject: ConstPtr): Ntstatus

public expect fun fltQueryDirectoryFile(instance: PfltInstance, fileobject: ConstPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass, returnsingleentry: Boolean, filename: ConstPtr, restartscan: Boolean, lengthreturned: MutPtr): Ntstatus

public expect fun fltQueryDirectoryFileEx(instance: PfltInstance, fileobject: ConstPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass, queryflags: UInt, filename: ConstPtr, lengthreturned: MutPtr): Ntstatus

public expect fun fltQueryEaFile(instance: PfltInstance, fileobject: ConstPtr, returnedeadata: MutPtr, length: UInt, returnsingleentry: Boolean, ealist: ConstPtr, ealistlength: UInt, eaindex: ConstPtr, restartscan: Boolean, lengthreturned: MutPtr): Ntstatus

public expect fun fltQueryInformationByName(filter: PfltFilter, instance: PfltInstance, objectattributes: ConstPtr, iostatusblock: MutPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass, drivercontext: ConstPtr): Ntstatus

public expect fun fltQueryInformationFile(instance: PfltInstance, fileobject: ConstPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass, lengthreturned: MutPtr): Ntstatus

public expect fun fltQueryQuotaInformationFile(instance: PfltInstance, fileobject: ConstPtr, iostatusblock: MutPtr, buffer: MutPtr, length: UInt, returnsingleentry: Boolean, sidlist: ConstPtr, sidlistlength: UInt, startsid: ConstPtr, restartscan: Boolean, lengthreturned: MutPtr): Ntstatus

public expect fun fltQuerySecurityObject(instance: PfltInstance, fileobject: ConstPtr, securityinformation: UInt, securitydescriptor: PsecurityDescriptor, length: UInt, lengthneeded: MutPtr): Ntstatus

public expect fun fltQueryVolumeInformation(instance: PfltInstance, iosb: MutPtr, fsinformation: MutPtr, length: UInt, fsinformationclass: FsInformationClass): Ntstatus

public expect fun fltQueryVolumeInformationFile(instance: PfltInstance, fileobject: ConstPtr, fsinformation: MutPtr, length: UInt, fsinformationclass: FsInformationClass, lengthreturned: MutPtr): Ntstatus

public expect fun fltQueueDeferredIoWorkItem(fltworkitem: PfltDeferredIoWorkitem, data: ConstPtr, workerroutine: PfltDeferredIoWorkitemRoutine, queuetype: WorkQueueType, context: ConstPtr): Ntstatus

public expect fun fltQueueGenericWorkItem(fltworkitem: PfltGenericWorkitem, fltobject: ConstPtr, workerroutine: PfltGenericWorkitemRoutine, queuetype: WorkQueueType, context: ConstPtr): Ntstatus

public expect fun fltReadFile(initiatinginstance: PfltInstance, fileobject: ConstPtr, byteoffset: ConstPtr, length: UInt, buffer: MutPtr, flags: UInt, bytesread: MutPtr, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: ConstPtr): Ntstatus

public expect fun fltReadFileEx(initiatinginstance: PfltInstance, fileobject: ConstPtr, byteoffset: ConstPtr, length: UInt, buffer: MutPtr, flags: UInt, bytesread: MutPtr, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: ConstPtr, key: ConstPtr, mdl: ConstPtr): Ntstatus

public expect fun fltReferenceContext(context: PfltContext)

public expect fun fltReferenceFileNameInformation(filenameinformation: ConstPtr)

public expect fun fltRegisterFilter(driver: ConstPtr, registration: ConstPtr, retfilter: MutPtr): Ntstatus

public expect fun fltRegisterForDataScan(instance: PfltInstance): Ntstatus

public expect fun fltReissueSynchronousIo(initiatinginstance: PfltInstance, callbackdata: ConstPtr)

public expect fun fltReleaseContext(context: PfltContext)

public expect fun fltReleaseContexts(contexts: ConstPtr)

public expect fun fltReleaseContextsEx(contextssize: ULong, contexts: ConstPtr)

public expect fun fltReleaseFileNameInformation(filenameinformation: ConstPtr)

public expect fun fltReleasePushLock(pushlock: MutPtr)

public expect fun fltReleasePushLockEx(pushlock: MutPtr, flags: UInt)

public expect fun fltReleaseResource(resource: MutPtr)

public expect fun fltRemoveExtraCreateParameter(filter: PfltFilter, ecplist: MutPtr, ecptype: ConstPtr, ecpcontext: MutPtr, ecpcontextsize: MutPtr): Ntstatus

public expect fun fltRemoveOpenReparseEntry(filter: PfltFilter, data: ConstPtr, openreparseentry: ConstPtr)

public expect fun fltRequestFileInfoOnCreateCompletion(filter: PfltFilter, data: ConstPtr, infoclassflags: UInt): Ntstatus

public expect fun fltRequestOperationStatusCallback(data: ConstPtr, callbackroutine: PfltGetOperationStatusCallback, requestercontext: ConstPtr): Ntstatus

public expect fun fltRetainSwappedBufferMdlAddress(callbackdata: ConstPtr)

public expect fun fltRetrieveFileInfoOnCreateCompletion(filter: PfltFilter, data: ConstPtr, infoclass: UInt, size: MutPtr): MutPtr

public expect fun fltRetrieveFileInfoOnCreateCompletionEx(filter: PfltFilter, data: ConstPtr, infoclass: UInt, retinfosize: MutPtr, retinfobuffer: MutPtr): Ntstatus

public expect fun fltRetrieveIoPriorityInfo(data: ConstPtr, fileobject: ConstPtr, thread: Pethread, priorityinfo: MutPtr): Ntstatus

public expect fun fltReuseCallbackData(callbackdata: MutPtr)

public expect fun fltRollbackComplete(instance: PfltInstance, transaction: ConstPtr, transactioncontext: PfltContext): Ntstatus

public expect fun fltRollbackEnlistment(instance: PfltInstance, transaction: ConstPtr, transactioncontext: PfltContext): Ntstatus

public expect fun fltSendMessage(filter: PfltFilter, clientport: ConstPtr, senderbuffer: ConstPtr, senderbufferlength: UInt, replybuffer: MutPtr, replylength: MutPtr, timeout: ConstPtr): Ntstatus

public expect fun fltSetActivityIdCallbackData(callbackdata: MutPtr, guid: ConstPtr): Ntstatus

public expect fun fltSetCallbackDataDirty(data: MutPtr)

public expect fun fltSetCancelCompletion(callbackdata: ConstPtr, canceledcallback: PfltCompleteCanceledCallback): Ntstatus

public expect fun fltSetEaFile(instance: PfltInstance, fileobject: ConstPtr, eabuffer: ConstPtr, length: UInt): Ntstatus

public expect fun fltSetEcpListIntoCallbackData(filter: PfltFilter, callbackdata: ConstPtr, ecplist: ConstPtr): Ntstatus

public expect fun fltSetFileContext(instance: PfltInstance, fileobject: ConstPtr, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr): Ntstatus

public expect fun fltSetFsZeroingOffset(data: ConstPtr, zeroingoffset: UInt): Ntstatus

public expect fun fltSetFsZeroingOffsetRequired(data: ConstPtr): Ntstatus

public expect fun fltSetInformationFile(instance: PfltInstance, fileobject: ConstPtr, fileinformation: ConstPtr, length: UInt, fileinformationclass: FileInformationClass): Ntstatus

public expect fun fltSetInstanceContext(instance: PfltInstance, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr): Ntstatus

public expect fun fltSetIoPriorityHintIntoCallbackData(data: ConstPtr, priorityhint: IoPriorityHint): Ntstatus

public expect fun fltSetIoPriorityHintIntoFileObject(fileobject: ConstPtr, priorityhint: IoPriorityHint): Ntstatus

public expect fun fltSetIoPriorityHintIntoThread(thread: Pethread, priorityhint: IoPriorityHint): Ntstatus

public expect fun fltSetQuotaInformationFile(instance: PfltInstance, fileobject: ConstPtr, buffer: ConstPtr, length: UInt): Ntstatus

public expect fun fltSetSecurityObject(instance: PfltInstance, fileobject: ConstPtr, securityinformation: UInt, securitydescriptor: PsecurityDescriptor): Ntstatus

public expect fun fltSetStreamContext(instance: PfltInstance, fileobject: ConstPtr, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr): Ntstatus

public expect fun fltSetStreamHandleContext(instance: PfltInstance, fileobject: ConstPtr, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr): Ntstatus

public expect fun fltSetTransactionContext(instance: PfltInstance, transaction: ConstPtr, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr): Ntstatus

public expect fun fltSetVolumeContext(volume: PfltVolume, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr): Ntstatus

public expect fun fltSetVolumeInformation(instance: PfltInstance, iosb: MutPtr, fsinformation: MutPtr, length: UInt, fsinformationclass: FsInformationClass): Ntstatus

public expect fun fltStartFiltering(filter: PfltFilter): Ntstatus

public expect fun fltSupportsFileContexts(fileobject: ConstPtr): Boolean

public expect fun fltSupportsFileContextsEx(fileobject: ConstPtr, instance: PfltInstance): Boolean

public expect fun fltSupportsStreamContexts(fileobject: ConstPtr): Boolean

public expect fun fltSupportsStreamHandleContexts(fileobject: ConstPtr): Boolean

public expect fun fltTagFile(initiatinginstance: PfltInstance, fileobject: ConstPtr, filetag: UInt, guid: ConstPtr, databuffer: ConstPtr, databufferlength: UShort): Ntstatus

public expect fun fltTagFileEx(initiatinginstance: PfltInstance, fileobject: ConstPtr, filetag: UInt, guid: ConstPtr, databuffer: ConstPtr, databufferlength: UShort, existingfiletag: UInt, existingguid: ConstPtr, flags: UInt): Ntstatus

public expect fun fltUninitializeFileLock(filelock: ConstPtr)

public expect fun fltUninitializeOplock(oplock: ConstPtr)

public expect fun fltUnloadFilter(filtername: ConstPtr): Ntstatus

public expect fun fltUnregisterFilter(filter: PfltFilter)

public expect fun fltUntagFile(initiatinginstance: PfltInstance, fileobject: ConstPtr, filetag: UInt, guid: ConstPtr): Ntstatus

public expect fun fltVetoBypassIo(callbackdata: ConstPtr, fltobjects: ConstPtr, operationstatus: Ntstatus, failurereason: ConstPtr): Ntstatus

public expect fun fltWriteFile(initiatinginstance: PfltInstance, fileobject: ConstPtr, byteoffset: ConstPtr, length: UInt, buffer: ConstPtr, flags: UInt, byteswritten: MutPtr, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: ConstPtr): Ntstatus

public expect fun fltWriteFileEx(initiatinginstance: PfltInstance, fileobject: ConstPtr, byteoffset: ConstPtr, length: UInt, buffer: ConstPtr, flags: UInt, byteswritten: MutPtr, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: ConstPtr, key: ConstPtr, mdl: ConstPtr): Ntstatus

public expect fun fltpTraceRedirectedFileIo(originatingfileobject: ConstPtr, childcallbackdata: MutPtr): Ntstatus
