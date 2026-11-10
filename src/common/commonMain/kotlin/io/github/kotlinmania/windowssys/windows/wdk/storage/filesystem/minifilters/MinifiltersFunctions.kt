package io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters

import io.github.kotlinmania.windowssys.COpaquePointer
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

public expect fun fltAcknowledgeEcp(filter: PfltFilter, ecpcontext: COpaquePointer?)

public expect fun fltAcquirePushLockExclusive(pushlock: COpaquePointer?)

public expect fun fltAcquirePushLockExclusiveEx(pushlock: COpaquePointer?, flags: UInt)

public expect fun fltAcquirePushLockShared(pushlock: COpaquePointer?)

public expect fun fltAcquirePushLockSharedEx(pushlock: COpaquePointer?, flags: UInt)

public expect fun fltAcquireResourceExclusive(resource: COpaquePointer?)

public expect fun fltAcquireResourceShared(resource: COpaquePointer?)

public expect fun fltAddOpenReparseEntry(filter: PfltFilter, data: COpaquePointer?, openreparseentry: COpaquePointer?): Ntstatus

public expect fun fltAdjustDeviceStackSizeForIoRedirection(sourceinstance: PfltInstance, targetinstance: PfltInstance, sourcedevicestacksizemodified: COpaquePointer?): Ntstatus

public expect fun fltAllocateCallbackData(instance: PfltInstance, fileobject: COpaquePointer?, retnewcallbackdata: COpaquePointer?): Ntstatus

public expect fun fltAllocateCallbackDataEx(instance: PfltInstance, fileobject: COpaquePointer?, flags: UInt, retnewcallbackdata: COpaquePointer?): Ntstatus

public expect fun fltAllocateContext(filter: PfltFilter, contexttype: UShort, contextsize: ULong, pooltype: PoolType, returnedcontext: COpaquePointer?): Ntstatus

public expect fun fltAllocateDeferredIoWorkItem(): PfltDeferredIoWorkitem

public expect fun fltAllocateExtraCreateParameter(filter: PfltFilter, ecptype: COpaquePointer?, sizeofcontext: UInt, flags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, pooltag: UInt, ecpcontext: COpaquePointer?): Ntstatus

public expect fun fltAllocateExtraCreateParameterFromLookasideList(filter: PfltFilter, ecptype: COpaquePointer?, sizeofcontext: UInt, flags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, lookasidelist: COpaquePointer?, ecpcontext: COpaquePointer?): Ntstatus

public expect fun fltAllocateExtraCreateParameterList(filter: PfltFilter, flags: UInt, ecplist: COpaquePointer?): Ntstatus

public expect fun fltAllocateFileLock(completelockcallbackdataroutine: PfltCompleteLockCallbackDataRoutine, unlockroutine: PunlockRoutine): COpaquePointer?

public expect fun fltAllocateGenericWorkItem(): PfltGenericWorkitem

public expect fun fltAllocatePoolAlignedWithTag(instance: PfltInstance, pooltype: PoolType, numberofbytes: ULong, tag: UInt): COpaquePointer?

public expect fun fltApplyPriorityInfoThread(inputpriorityinfo: COpaquePointer?, outputpriorityinfo: COpaquePointer?, thread: Pethread): Ntstatus

public expect fun fltAttachVolume(filter: PfltFilter, volume: PfltVolume, instancename: COpaquePointer?, retinstance: COpaquePointer?): Ntstatus

public expect fun fltAttachVolumeAtAltitude(filter: PfltFilter, volume: PfltVolume, altitude: COpaquePointer?, instancename: COpaquePointer?, retinstance: COpaquePointer?): Ntstatus

public expect fun fltBuildDefaultSecurityDescriptor(securitydescriptor: COpaquePointer?, desiredaccess: UInt): Ntstatus

public expect fun fltCancelFileOpen(instance: PfltInstance, fileobject: COpaquePointer?)

public expect fun fltCancelIo(callbackdata: COpaquePointer?): Boolean

public expect fun fltCancellableWaitForMultipleObjects(count: UInt, objectarray: COpaquePointer?, waittype: WaitType, timeout: COpaquePointer?, waitblockarray: COpaquePointer?, callbackdata: COpaquePointer?): Ntstatus

public expect fun fltCancellableWaitForSingleObject(obj: COpaquePointer?, timeout: COpaquePointer?, callbackdata: COpaquePointer?): Ntstatus

public expect fun fltCbdqDisable(cbdq: COpaquePointer?)

public expect fun fltCbdqEnable(cbdq: COpaquePointer?)

public expect fun fltCbdqInitialize(instance: PfltInstance, cbdq: COpaquePointer?, cbdqinsertio: PfltCallbackDataQueueInsertIo, cbdqremoveio: PfltCallbackDataQueueRemoveIo, cbdqpeeknextio: PfltCallbackDataQueuePeekNextIo, cbdqacquire: PfltCallbackDataQueueAcquire, cbdqrelease: PfltCallbackDataQueueRelease, cbdqcompletecanceledio: PfltCallbackDataQueueCompleteCanceledIo): Ntstatus

public expect fun fltCbdqInsertIo(cbdq: COpaquePointer?, cbd: COpaquePointer?, context: COpaquePointer?, insertcontext: COpaquePointer?): Ntstatus

public expect fun fltCbdqRemoveIo(cbdq: COpaquePointer?, context: COpaquePointer?): COpaquePointer?

public expect fun fltCbdqRemoveNextIo(cbdq: COpaquePointer?, peekcontext: COpaquePointer?): COpaquePointer?

public expect fun fltCheckAndGrowNameControl(namectrl: COpaquePointer?, newsize: UShort): Ntstatus

public expect fun fltCheckLockForReadAccess(filelock: COpaquePointer?, callbackdata: COpaquePointer?): Boolean

public expect fun fltCheckLockForWriteAccess(filelock: COpaquePointer?, callbackdata: COpaquePointer?): Boolean

public expect fun fltCheckOplock(oplock: COpaquePointer?, callbackdata: COpaquePointer?, context: COpaquePointer?, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus

public expect fun fltCheckOplockEx(oplock: COpaquePointer?, callbackdata: COpaquePointer?, flags: UInt, context: COpaquePointer?, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus

public expect fun fltClearCallbackDataDirty(data: COpaquePointer?)

public expect fun fltClearCancelCompletion(callbackdata: COpaquePointer?): Ntstatus

public expect fun fltClose(filehandle: Handle): Ntstatus

public expect fun fltCloseClientPort(filter: PfltFilter, clientport: COpaquePointer?)

public expect fun fltCloseCommunicationPort(serverport: PfltPort)

public expect fun fltCloseSectionForDataScan(sectioncontext: PfltContext): Ntstatus

public expect fun fltCommitComplete(instance: PfltInstance, transaction: COpaquePointer?, transactioncontext: PfltContext): Ntstatus

public expect fun fltCommitFinalizeComplete(instance: PfltInstance, transaction: COpaquePointer?, transactioncontext: PfltContext): Ntstatus

public expect fun fltCompareInstanceAltitudes(instance1: PfltInstance, instance2: PfltInstance): Int

public expect fun fltCompletePendedPostOperation(callbackdata: COpaquePointer?)

public expect fun fltCompletePendedPreOperation(callbackdata: COpaquePointer?, callbackstatus: FltPreopCallbackStatus, context: COpaquePointer?)

public expect fun fltCopyOpenReparseList(filter: PfltFilter, data: COpaquePointer?, ecplist: COpaquePointer?): Ntstatus

public expect fun fltCreateCommunicationPort(filter: PfltFilter, serverport: COpaquePointer?, objectattributes: COpaquePointer?, serverportcookie: COpaquePointer?, connectnotifycallback: PfltConnectNotify, disconnectnotifycallback: PfltDisconnectNotify, messagenotifycallback: PfltMessageNotify, maxconnections: Int): Ntstatus

public expect fun fltCreateFile(filter: PfltFilter, instance: PfltInstance, filehandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, allocationsize: COpaquePointer?, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: COpaquePointer?, ealength: UInt, flags: UInt): Ntstatus

public expect fun fltCreateFileEx(filter: PfltFilter, instance: PfltInstance, filehandle: COpaquePointer?, fileobject: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, allocationsize: COpaquePointer?, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: COpaquePointer?, ealength: UInt, flags: UInt): Ntstatus

public expect fun fltCreateFileEx2(filter: PfltFilter, instance: PfltInstance, filehandle: COpaquePointer?, fileobject: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, allocationsize: COpaquePointer?, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: COpaquePointer?, ealength: UInt, flags: UInt, drivercontext: COpaquePointer?): Ntstatus

public expect fun fltCreateMailslotFile(filter: PfltFilter, instance: PfltInstance, filehandle: COpaquePointer?, fileobject: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, createoptions: UInt, mailslotquota: UInt, maximummessagesize: UInt, readtimeout: COpaquePointer?, drivercontext: COpaquePointer?): Ntstatus

public expect fun fltCreateNamedPipeFile(filter: PfltFilter, instance: PfltInstance, filehandle: COpaquePointer?, fileobject: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, namedpipetype: UInt, readmode: UInt, completionmode: UInt, maximuminstances: UInt, inboundquota: UInt, outboundquota: UInt, defaulttimeout: COpaquePointer?, drivercontext: COpaquePointer?): Ntstatus

public expect fun fltCreateSectionForDataScan(instance: PfltInstance, fileobject: COpaquePointer?, sectioncontext: PfltContext, desiredaccess: UInt, objectattributes: COpaquePointer?, maximumsize: COpaquePointer?, sectionpageprotection: UInt, allocationattributes: UInt, flags: UInt, sectionhandle: COpaquePointer?, sectionobject: COpaquePointer?, sectionfilesize: COpaquePointer?): Ntstatus

public expect fun fltCreateSystemVolumeInformationFolder(instance: PfltInstance): Ntstatus

public expect fun fltCurrentBatchOplock(oplock: COpaquePointer?): Boolean

public expect fun fltCurrentOplock(oplock: COpaquePointer?): Boolean

public expect fun fltCurrentOplockH(oplock: COpaquePointer?): Boolean

public expect fun fltDecodeParameters(callbackdata: COpaquePointer?, mdladdresspointer: COpaquePointer?, buffer: COpaquePointer?, length: COpaquePointer?, desiredaccess: COpaquePointer?): Ntstatus

public expect fun fltDeleteContext(context: PfltContext)

public expect fun fltDeleteExtraCreateParameterLookasideList(filter: PfltFilter, lookaside: COpaquePointer?, flags: UInt)

public expect fun fltDeleteFileContext(instance: PfltInstance, fileobject: COpaquePointer?, oldcontext: COpaquePointer?): Ntstatus

public expect fun fltDeleteInstanceContext(instance: PfltInstance, oldcontext: COpaquePointer?): Ntstatus

public expect fun fltDeletePushLock(pushlock: COpaquePointer?)

public expect fun fltDeleteStreamContext(instance: PfltInstance, fileobject: COpaquePointer?, oldcontext: COpaquePointer?): Ntstatus

public expect fun fltDeleteStreamHandleContext(instance: PfltInstance, fileobject: COpaquePointer?, oldcontext: COpaquePointer?): Ntstatus

public expect fun fltDeleteTransactionContext(instance: PfltInstance, transaction: COpaquePointer?, oldcontext: COpaquePointer?): Ntstatus

public expect fun fltDeleteVolumeContext(filter: PfltFilter, volume: PfltVolume, oldcontext: COpaquePointer?): Ntstatus

public expect fun fltDetachVolume(filter: PfltFilter, volume: PfltVolume, instancename: COpaquePointer?): Ntstatus

public expect fun fltDeviceIoControlFile(instance: PfltInstance, fileobject: COpaquePointer?, iocontrolcode: UInt, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt, lengthreturned: COpaquePointer?): Ntstatus

public expect fun fltDoCompletionProcessingWhenSafe(data: COpaquePointer?, fltobjects: COpaquePointer?, completioncontext: COpaquePointer?, flags: UInt, safepostcallback: PfltPostOperationCallback, retpostoperationstatus: COpaquePointer?): Boolean

public expect fun fltEnlistInTransaction(instance: PfltInstance, transaction: COpaquePointer?, transactioncontext: PfltContext, notificationmask: UInt): Ntstatus

public expect fun fltEnumerateFilterInformation(index: UInt, informationclass: FilterInformationClass, buffer: COpaquePointer?, buffersize: UInt, bytesreturned: COpaquePointer?): Ntstatus

public expect fun fltEnumerateFilters(filterlist: COpaquePointer?, filterlistsize: UInt, numberfiltersreturned: COpaquePointer?): Ntstatus

public expect fun fltEnumerateInstanceInformationByDeviceObject(deviceobject: COpaquePointer?, index: UInt, informationclass: InstanceInformationClass, buffer: COpaquePointer?, buffersize: UInt, bytesreturned: COpaquePointer?): Ntstatus

public expect fun fltEnumerateInstanceInformationByFilter(filter: PfltFilter, index: UInt, informationclass: InstanceInformationClass, buffer: COpaquePointer?, buffersize: UInt, bytesreturned: COpaquePointer?): Ntstatus

public expect fun fltEnumerateInstanceInformationByVolume(volume: PfltVolume, index: UInt, informationclass: InstanceInformationClass, buffer: COpaquePointer?, buffersize: UInt, bytesreturned: COpaquePointer?): Ntstatus

public expect fun fltEnumerateInstanceInformationByVolumeName(volumename: COpaquePointer?, index: UInt, informationclass: InstanceInformationClass, buffer: COpaquePointer?, buffersize: UInt, bytesreturned: COpaquePointer?): Ntstatus

public expect fun fltEnumerateInstances(volume: PfltVolume, filter: PfltFilter, instancelist: COpaquePointer?, instancelistsize: UInt, numberinstancesreturned: COpaquePointer?): Ntstatus

public expect fun fltEnumerateVolumeInformation(filter: PfltFilter, index: UInt, informationclass: FilterVolumeInformationClass, buffer: COpaquePointer?, buffersize: UInt, bytesreturned: COpaquePointer?): Ntstatus

public expect fun fltEnumerateVolumes(filter: PfltFilter, volumelist: COpaquePointer?, volumelistsize: UInt, numbervolumesreturned: COpaquePointer?): Ntstatus

public expect fun fltFastIoMdlRead(initiatinginstance: PfltInstance, fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, lockkey: UInt, mdlchain: COpaquePointer?, iostatus: COpaquePointer?): Boolean

public expect fun fltFastIoMdlReadComplete(initiatinginstance: PfltInstance, fileobject: COpaquePointer?, mdlchain: COpaquePointer?): Boolean

public expect fun fltFastIoMdlWriteComplete(initiatinginstance: PfltInstance, fileobject: COpaquePointer?, fileoffset: COpaquePointer?, mdlchain: COpaquePointer?): Boolean

public expect fun fltFastIoPrepareMdlWrite(initiatinginstance: PfltInstance, fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, lockkey: UInt, mdlchain: COpaquePointer?, iostatus: COpaquePointer?): Boolean

public expect fun fltFindExtraCreateParameter(filter: PfltFilter, ecplist: COpaquePointer?, ecptype: COpaquePointer?, ecpcontext: COpaquePointer?, ecpcontextsize: COpaquePointer?): Ntstatus

public expect fun fltFlushBuffers(instance: PfltInstance, fileobject: COpaquePointer?): Ntstatus

public expect fun fltFlushBuffers2(instance: PfltInstance, fileobject: COpaquePointer?, flushtype: UInt, callbackdata: COpaquePointer?): Ntstatus

public expect fun fltFreeCallbackData(callbackdata: COpaquePointer?)

public expect fun fltFreeDeferredIoWorkItem(fltworkitem: PfltDeferredIoWorkitem)

public expect fun fltFreeExtraCreateParameter(filter: PfltFilter, ecpcontext: COpaquePointer?)

public expect fun fltFreeExtraCreateParameterList(filter: PfltFilter, ecplist: COpaquePointer?)

public expect fun fltFreeFileLock(filelock: COpaquePointer?)

public expect fun fltFreeGenericWorkItem(fltworkitem: PfltGenericWorkitem)

public expect fun fltFreeOpenReparseList(filter: PfltFilter, ecplist: COpaquePointer?)

public expect fun fltFreePoolAlignedWithTag(instance: PfltInstance, buffer: COpaquePointer?, tag: UInt)

public expect fun fltFreeSecurityDescriptor(securitydescriptor: PsecurityDescriptor)

public expect fun fltFsControlFile(instance: PfltInstance, fileobject: COpaquePointer?, fscontrolcode: UInt, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt, lengthreturned: COpaquePointer?): Ntstatus

public expect fun fltGetActivityIdCallbackData(callbackdata: COpaquePointer?, guid: COpaquePointer?): Ntstatus

public expect fun fltGetBottomInstance(volume: PfltVolume, instance: COpaquePointer?): Ntstatus

public expect fun fltGetContexts(fltobjects: COpaquePointer?, desiredcontexts: UShort, contexts: COpaquePointer?)

public expect fun fltGetContextsEx(fltobjects: COpaquePointer?, desiredcontexts: UShort, contextssize: ULong, contexts: COpaquePointer?): Ntstatus

public expect fun fltGetDestinationFileNameInformation(instance: PfltInstance, fileobject: COpaquePointer?, rootdirectory: Handle, filename: Pcwstr, filenamelength: UInt, nameoptions: UInt, retfilenameinformation: COpaquePointer?): Ntstatus

public expect fun fltGetDeviceObject(volume: PfltVolume, deviceobject: COpaquePointer?): Ntstatus

public expect fun fltGetDiskDeviceObject(volume: PfltVolume, diskdeviceobject: COpaquePointer?): Ntstatus

public expect fun fltGetEcpListFromCallbackData(filter: PfltFilter, callbackdata: COpaquePointer?, ecplist: COpaquePointer?): Ntstatus

public expect fun fltGetFileContext(instance: PfltInstance, fileobject: COpaquePointer?, context: COpaquePointer?): Ntstatus

public expect fun fltGetFileNameInformation(callbackdata: COpaquePointer?, nameoptions: UInt, filenameinformation: COpaquePointer?): Ntstatus

public expect fun fltGetFileNameInformationUnsafe(fileobject: COpaquePointer?, instance: PfltInstance, nameoptions: UInt, filenameinformation: COpaquePointer?): Ntstatus

public expect fun fltGetFileSystemType(fltobject: COpaquePointer?, filesystemtype: COpaquePointer?): Ntstatus

public expect fun fltGetFilterFromInstance(instance: PfltInstance, retfilter: COpaquePointer?): Ntstatus

public expect fun fltGetFilterFromName(filtername: COpaquePointer?, retfilter: COpaquePointer?): Ntstatus

public expect fun fltGetFilterInformation(filter: PfltFilter, informationclass: FilterInformationClass, buffer: COpaquePointer?, buffersize: UInt, bytesreturned: COpaquePointer?): Ntstatus

public expect fun fltGetFsZeroingOffset(data: COpaquePointer?, zeroingoffset: COpaquePointer?): Ntstatus

public expect fun fltGetInstanceContext(instance: PfltInstance, context: COpaquePointer?): Ntstatus

public expect fun fltGetInstanceInformation(instance: PfltInstance, informationclass: InstanceInformationClass, buffer: COpaquePointer?, buffersize: UInt, bytesreturned: COpaquePointer?): Ntstatus

public expect fun fltGetIoAttributionHandleFromCallbackData(data: COpaquePointer?): COpaquePointer?

public expect fun fltGetIoPriorityHint(data: COpaquePointer?): IoPriorityHint

public expect fun fltGetIoPriorityHintFromCallbackData(data: COpaquePointer?): IoPriorityHint

public expect fun fltGetIoPriorityHintFromFileObject(fileobject: COpaquePointer?): IoPriorityHint

public expect fun fltGetIoPriorityHintFromThread(thread: Pethread): IoPriorityHint

public expect fun fltGetIrpName(irpmajorcode: UByte): Pstr

public expect fun fltGetLowerInstance(currentinstance: PfltInstance, lowerinstance: COpaquePointer?): Ntstatus

public expect fun fltGetNewSystemBufferAddress(callbackdata: COpaquePointer?): COpaquePointer?

public expect fun fltGetNextExtraCreateParameter(filter: PfltFilter, ecplist: COpaquePointer?, currentecpcontext: COpaquePointer?, nextecptype: COpaquePointer?, nextecpcontext: COpaquePointer?, nextecpcontextsize: COpaquePointer?): Ntstatus

public expect fun fltGetRequestorProcess(callbackdata: COpaquePointer?): Peprocess

public expect fun fltGetRequestorProcessId(callbackdata: COpaquePointer?): UInt

public expect fun fltGetRequestorProcessIdEx(callbackdata: COpaquePointer?): Handle

public expect fun fltGetRequestorSessionId(callbackdata: COpaquePointer?, sessionid: COpaquePointer?): Ntstatus

public expect fun fltGetRoutineAddress(fltmgrroutinename: Pcstr): COpaquePointer?

public expect fun fltGetSectionContext(instance: PfltInstance, fileobject: COpaquePointer?, context: COpaquePointer?): Ntstatus

public expect fun fltGetStreamContext(instance: PfltInstance, fileobject: COpaquePointer?, context: COpaquePointer?): Ntstatus

public expect fun fltGetStreamHandleContext(instance: PfltInstance, fileobject: COpaquePointer?, context: COpaquePointer?): Ntstatus

public expect fun fltGetSwappedBufferMdlAddress(callbackdata: COpaquePointer?): COpaquePointer?

public expect fun fltGetTopInstance(volume: PfltVolume, instance: COpaquePointer?): Ntstatus

public expect fun fltGetTransactionContext(instance: PfltInstance, transaction: COpaquePointer?, context: COpaquePointer?): Ntstatus

public expect fun fltGetTunneledName(callbackdata: COpaquePointer?, filenameinformation: COpaquePointer?, rettunneledfilenameinformation: COpaquePointer?): Ntstatus

public expect fun fltGetUpperInstance(currentinstance: PfltInstance, upperinstance: COpaquePointer?): Ntstatus

public expect fun fltGetVolumeContext(filter: PfltFilter, volume: PfltVolume, context: COpaquePointer?): Ntstatus

public expect fun fltGetVolumeFromDeviceObject(filter: PfltFilter, deviceobject: COpaquePointer?, retvolume: COpaquePointer?): Ntstatus

public expect fun fltGetVolumeFromFileObject(filter: PfltFilter, fileobject: COpaquePointer?, retvolume: COpaquePointer?): Ntstatus

public expect fun fltGetVolumeFromInstance(instance: PfltInstance, retvolume: COpaquePointer?): Ntstatus

public expect fun fltGetVolumeFromName(filter: PfltFilter, volumename: COpaquePointer?, retvolume: COpaquePointer?): Ntstatus

public expect fun fltGetVolumeGuidName(volume: PfltVolume, volumeguidname: COpaquePointer?, buffersizeneeded: COpaquePointer?): Ntstatus

public expect fun fltGetVolumeInformation(volume: PfltVolume, informationclass: FilterVolumeInformationClass, buffer: COpaquePointer?, buffersize: UInt, bytesreturned: COpaquePointer?): Ntstatus

public expect fun fltGetVolumeInstanceFromName(filter: PfltFilter, volume: PfltVolume, instancename: COpaquePointer?, retinstance: COpaquePointer?): Ntstatus

public expect fun fltGetVolumeName(volume: PfltVolume, volumename: COpaquePointer?, buffersizeneeded: COpaquePointer?): Ntstatus

public expect fun fltGetVolumeProperties(volume: PfltVolume, volumeproperties: COpaquePointer?, volumepropertieslength: UInt, lengthreturned: COpaquePointer?): Ntstatus

public expect fun fltInitExtraCreateParameterLookasideList(filter: PfltFilter, lookaside: COpaquePointer?, flags: UInt, size: ULong, tag: UInt)

public expect fun fltInitializeFileLock(filelock: COpaquePointer?)

public expect fun fltInitializeOplock(oplock: COpaquePointer?)

public expect fun fltInitializePushLock(pushlock: COpaquePointer?)

public expect fun fltInsertExtraCreateParameter(filter: PfltFilter, ecplist: COpaquePointer?, ecpcontext: COpaquePointer?): Ntstatus

public expect fun fltIs32bitProcess(callbackdata: COpaquePointer?): Boolean

public expect fun fltIsCallbackDataDirty(data: COpaquePointer?): Boolean

public expect fun fltIsDirectory(fileobject: COpaquePointer?, instance: PfltInstance, isdirectory: COpaquePointer?): Ntstatus

public expect fun fltIsEcpAcknowledged(filter: PfltFilter, ecpcontext: COpaquePointer?): Boolean

public expect fun fltIsEcpFromUserMode(filter: PfltFilter, ecpcontext: COpaquePointer?): Boolean

public expect fun fltIsFltMgrVolumeDeviceObject(deviceobject: COpaquePointer?): Boolean

public expect fun fltIsIoCanceled(callbackdata: COpaquePointer?): Boolean

public expect fun fltIsIoRedirectionAllowed(sourceinstance: PfltInstance, targetinstance: PfltInstance, redirectionallowed: COpaquePointer?): Ntstatus

public expect fun fltIsIoRedirectionAllowedForOperation(data: COpaquePointer?, targetinstance: PfltInstance, redirectionallowedthisio: COpaquePointer?, redirectionallowedallio: COpaquePointer?): Ntstatus

public expect fun fltIsOperationSynchronous(callbackdata: COpaquePointer?): Boolean

public expect fun fltIsVolumeSnapshot(fltobject: COpaquePointer?, issnapshotvolume: COpaquePointer?): Ntstatus

public expect fun fltIsVolumeWritable(fltobject: COpaquePointer?, iswritable: COpaquePointer?): Ntstatus

public expect fun fltLoadFilter(filtername: COpaquePointer?): Ntstatus

public expect fun fltLockUserBuffer(callbackdata: COpaquePointer?): Ntstatus

public expect fun fltNotifyFilterChangeDirectory(notifysync: PnotifySync, notifylist: COpaquePointer?, fscontext: COpaquePointer?, fulldirectoryname: COpaquePointer?, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifycallbackdata: COpaquePointer?, traversecallback: PcheckForTraverseAccess, subjectcontext: COpaquePointer?, filtercallback: PfilterReportChange)

public expect fun fltObjectDereference(fltobject: COpaquePointer?)

public expect fun fltObjectReference(fltobject: COpaquePointer?): Ntstatus

public expect fun fltOpenVolume(instance: PfltInstance, volumehandle: COpaquePointer?, volumefileobject: COpaquePointer?): Ntstatus

public expect fun fltOplockBreakH(oplock: COpaquePointer?, callbackdata: COpaquePointer?, flags: UInt, context: COpaquePointer?, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus

public expect fun fltOplockBreakToNone(oplock: COpaquePointer?, callbackdata: COpaquePointer?, context: COpaquePointer?, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus

public expect fun fltOplockBreakToNoneEx(oplock: COpaquePointer?, callbackdata: COpaquePointer?, flags: UInt, context: COpaquePointer?, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus

public expect fun fltOplockFsctrl(oplock: COpaquePointer?, callbackdata: COpaquePointer?, opencount: UInt): FltPreopCallbackStatus

public expect fun fltOplockFsctrlEx(oplock: COpaquePointer?, callbackdata: COpaquePointer?, opencount: UInt, flags: UInt): FltPreopCallbackStatus

public expect fun fltOplockIsFastIoPossible(oplock: COpaquePointer?): Boolean

public expect fun fltOplockIsSharedRequest(callbackdata: COpaquePointer?): Boolean

public expect fun fltOplockKeysEqual(fo1: COpaquePointer?, fo2: COpaquePointer?): Boolean

public expect fun fltParseFileName(filename: COpaquePointer?, extension: COpaquePointer?, stream: COpaquePointer?, finalcomponent: COpaquePointer?): Ntstatus

public expect fun fltParseFileNameInformation(filenameinformation: COpaquePointer?): Ntstatus

public expect fun fltPerformAsynchronousIo(callbackdata: COpaquePointer?, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: COpaquePointer?): Ntstatus

public expect fun fltPerformSynchronousIo(callbackdata: COpaquePointer?)

public expect fun fltPrePrepareComplete(instance: PfltInstance, transaction: COpaquePointer?, transactioncontext: PfltContext): Ntstatus

public expect fun fltPrepareComplete(instance: PfltInstance, transaction: COpaquePointer?, transactioncontext: PfltContext): Ntstatus

public expect fun fltPrepareToReuseEcp(filter: PfltFilter, ecpcontext: COpaquePointer?)

public expect fun fltProcessFileLock(filelock: COpaquePointer?, callbackdata: COpaquePointer?, context: COpaquePointer?): FltPreopCallbackStatus

public expect fun fltPropagateActivityIdToThread(callbackdata: COpaquePointer?, propagateid: COpaquePointer?, originalid: COpaquePointer?): Ntstatus

public expect fun fltPropagateIrpExtension(sourcedata: COpaquePointer?, targetdata: COpaquePointer?, flags: UInt): Ntstatus

public expect fun fltPurgeFileNameInformationCache(instance: PfltInstance, fileobject: COpaquePointer?): Ntstatus

public expect fun fltQueryDirectoryFile(instance: PfltInstance, fileobject: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass, returnsingleentry: Boolean, filename: COpaquePointer?, restartscan: Boolean, lengthreturned: COpaquePointer?): Ntstatus

public expect fun fltQueryDirectoryFileEx(instance: PfltInstance, fileobject: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass, queryflags: UInt, filename: COpaquePointer?, lengthreturned: COpaquePointer?): Ntstatus

public expect fun fltQueryEaFile(instance: PfltInstance, fileobject: COpaquePointer?, returnedeadata: COpaquePointer?, length: UInt, returnsingleentry: Boolean, ealist: COpaquePointer?, ealistlength: UInt, eaindex: COpaquePointer?, restartscan: Boolean, lengthreturned: COpaquePointer?): Ntstatus

public expect fun fltQueryInformationByName(filter: PfltFilter, instance: PfltInstance, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass, drivercontext: COpaquePointer?): Ntstatus

public expect fun fltQueryInformationFile(instance: PfltInstance, fileobject: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass, lengthreturned: COpaquePointer?): Ntstatus

public expect fun fltQueryQuotaInformationFile(instance: PfltInstance, fileobject: COpaquePointer?, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt, returnsingleentry: Boolean, sidlist: COpaquePointer?, sidlistlength: UInt, startsid: COpaquePointer?, restartscan: Boolean, lengthreturned: COpaquePointer?): Ntstatus

public expect fun fltQuerySecurityObject(instance: PfltInstance, fileobject: COpaquePointer?, securityinformation: UInt, securitydescriptor: PsecurityDescriptor, length: UInt, lengthneeded: COpaquePointer?): Ntstatus

public expect fun fltQueryVolumeInformation(instance: PfltInstance, iosb: COpaquePointer?, fsinformation: COpaquePointer?, length: UInt, fsinformationclass: FsInformationClass): Ntstatus

public expect fun fltQueryVolumeInformationFile(instance: PfltInstance, fileobject: COpaquePointer?, fsinformation: COpaquePointer?, length: UInt, fsinformationclass: FsInformationClass, lengthreturned: COpaquePointer?): Ntstatus

public expect fun fltQueueDeferredIoWorkItem(fltworkitem: PfltDeferredIoWorkitem, data: COpaquePointer?, workerroutine: PfltDeferredIoWorkitemRoutine, queuetype: WorkQueueType, context: COpaquePointer?): Ntstatus

public expect fun fltQueueGenericWorkItem(fltworkitem: PfltGenericWorkitem, fltobject: COpaquePointer?, workerroutine: PfltGenericWorkitemRoutine, queuetype: WorkQueueType, context: COpaquePointer?): Ntstatus

public expect fun fltReadFile(initiatinginstance: PfltInstance, fileobject: COpaquePointer?, byteoffset: COpaquePointer?, length: UInt, buffer: COpaquePointer?, flags: UInt, bytesread: COpaquePointer?, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: COpaquePointer?): Ntstatus

public expect fun fltReadFileEx(initiatinginstance: PfltInstance, fileobject: COpaquePointer?, byteoffset: COpaquePointer?, length: UInt, buffer: COpaquePointer?, flags: UInt, bytesread: COpaquePointer?, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: COpaquePointer?, key: COpaquePointer?, mdl: COpaquePointer?): Ntstatus

public expect fun fltReferenceContext(context: PfltContext)

public expect fun fltReferenceFileNameInformation(filenameinformation: COpaquePointer?)

public expect fun fltRegisterFilter(driver: COpaquePointer?, registration: COpaquePointer?, retfilter: COpaquePointer?): Ntstatus

public expect fun fltRegisterForDataScan(instance: PfltInstance): Ntstatus

public expect fun fltReissueSynchronousIo(initiatinginstance: PfltInstance, callbackdata: COpaquePointer?)

public expect fun fltReleaseContext(context: PfltContext)

public expect fun fltReleaseContexts(contexts: COpaquePointer?)

public expect fun fltReleaseContextsEx(contextssize: ULong, contexts: COpaquePointer?)

public expect fun fltReleaseFileNameInformation(filenameinformation: COpaquePointer?)

public expect fun fltReleasePushLock(pushlock: COpaquePointer?)

public expect fun fltReleasePushLockEx(pushlock: COpaquePointer?, flags: UInt)

public expect fun fltReleaseResource(resource: COpaquePointer?)

public expect fun fltRemoveExtraCreateParameter(filter: PfltFilter, ecplist: COpaquePointer?, ecptype: COpaquePointer?, ecpcontext: COpaquePointer?, ecpcontextsize: COpaquePointer?): Ntstatus

public expect fun fltRemoveOpenReparseEntry(filter: PfltFilter, data: COpaquePointer?, openreparseentry: COpaquePointer?)

public expect fun fltRequestFileInfoOnCreateCompletion(filter: PfltFilter, data: COpaquePointer?, infoclassflags: UInt): Ntstatus

public expect fun fltRequestOperationStatusCallback(data: COpaquePointer?, callbackroutine: PfltGetOperationStatusCallback, requestercontext: COpaquePointer?): Ntstatus

public expect fun fltRetainSwappedBufferMdlAddress(callbackdata: COpaquePointer?)

public expect fun fltRetrieveFileInfoOnCreateCompletion(filter: PfltFilter, data: COpaquePointer?, infoclass: UInt, size: COpaquePointer?): COpaquePointer?

public expect fun fltRetrieveFileInfoOnCreateCompletionEx(filter: PfltFilter, data: COpaquePointer?, infoclass: UInt, retinfosize: COpaquePointer?, retinfobuffer: COpaquePointer?): Ntstatus

public expect fun fltRetrieveIoPriorityInfo(data: COpaquePointer?, fileobject: COpaquePointer?, thread: Pethread, priorityinfo: COpaquePointer?): Ntstatus

public expect fun fltReuseCallbackData(callbackdata: COpaquePointer?)

public expect fun fltRollbackComplete(instance: PfltInstance, transaction: COpaquePointer?, transactioncontext: PfltContext): Ntstatus

public expect fun fltRollbackEnlistment(instance: PfltInstance, transaction: COpaquePointer?, transactioncontext: PfltContext): Ntstatus

public expect fun fltSendMessage(filter: PfltFilter, clientport: COpaquePointer?, senderbuffer: COpaquePointer?, senderbufferlength: UInt, replybuffer: COpaquePointer?, replylength: COpaquePointer?, timeout: COpaquePointer?): Ntstatus

public expect fun fltSetActivityIdCallbackData(callbackdata: COpaquePointer?, guid: COpaquePointer?): Ntstatus

public expect fun fltSetCallbackDataDirty(data: COpaquePointer?)

public expect fun fltSetCancelCompletion(callbackdata: COpaquePointer?, canceledcallback: PfltCompleteCanceledCallback): Ntstatus

public expect fun fltSetEaFile(instance: PfltInstance, fileobject: COpaquePointer?, eabuffer: COpaquePointer?, length: UInt): Ntstatus

public expect fun fltSetEcpListIntoCallbackData(filter: PfltFilter, callbackdata: COpaquePointer?, ecplist: COpaquePointer?): Ntstatus

public expect fun fltSetFileContext(instance: PfltInstance, fileobject: COpaquePointer?, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: COpaquePointer?): Ntstatus

public expect fun fltSetFsZeroingOffset(data: COpaquePointer?, zeroingoffset: UInt): Ntstatus

public expect fun fltSetFsZeroingOffsetRequired(data: COpaquePointer?): Ntstatus

public expect fun fltSetInformationFile(instance: PfltInstance, fileobject: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass): Ntstatus

public expect fun fltSetInstanceContext(instance: PfltInstance, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: COpaquePointer?): Ntstatus

public expect fun fltSetIoPriorityHintIntoCallbackData(data: COpaquePointer?, priorityhint: IoPriorityHint): Ntstatus

public expect fun fltSetIoPriorityHintIntoFileObject(fileobject: COpaquePointer?, priorityhint: IoPriorityHint): Ntstatus

public expect fun fltSetIoPriorityHintIntoThread(thread: Pethread, priorityhint: IoPriorityHint): Ntstatus

public expect fun fltSetQuotaInformationFile(instance: PfltInstance, fileobject: COpaquePointer?, buffer: COpaquePointer?, length: UInt): Ntstatus

public expect fun fltSetSecurityObject(instance: PfltInstance, fileobject: COpaquePointer?, securityinformation: UInt, securitydescriptor: PsecurityDescriptor): Ntstatus

public expect fun fltSetStreamContext(instance: PfltInstance, fileobject: COpaquePointer?, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: COpaquePointer?): Ntstatus

public expect fun fltSetStreamHandleContext(instance: PfltInstance, fileobject: COpaquePointer?, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: COpaquePointer?): Ntstatus

public expect fun fltSetTransactionContext(instance: PfltInstance, transaction: COpaquePointer?, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: COpaquePointer?): Ntstatus

public expect fun fltSetVolumeContext(volume: PfltVolume, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: COpaquePointer?): Ntstatus

public expect fun fltSetVolumeInformation(instance: PfltInstance, iosb: COpaquePointer?, fsinformation: COpaquePointer?, length: UInt, fsinformationclass: FsInformationClass): Ntstatus

public expect fun fltStartFiltering(filter: PfltFilter): Ntstatus

public expect fun fltSupportsFileContexts(fileobject: COpaquePointer?): Boolean

public expect fun fltSupportsFileContextsEx(fileobject: COpaquePointer?, instance: PfltInstance): Boolean

public expect fun fltSupportsStreamContexts(fileobject: COpaquePointer?): Boolean

public expect fun fltSupportsStreamHandleContexts(fileobject: COpaquePointer?): Boolean

public expect fun fltTagFile(initiatinginstance: PfltInstance, fileobject: COpaquePointer?, filetag: UInt, guid: COpaquePointer?, databuffer: COpaquePointer?, databufferlength: UShort): Ntstatus

public expect fun fltTagFileEx(initiatinginstance: PfltInstance, fileobject: COpaquePointer?, filetag: UInt, guid: COpaquePointer?, databuffer: COpaquePointer?, databufferlength: UShort, existingfiletag: UInt, existingguid: COpaquePointer?, flags: UInt): Ntstatus

public expect fun fltUninitializeFileLock(filelock: COpaquePointer?)

public expect fun fltUninitializeOplock(oplock: COpaquePointer?)

public expect fun fltUnloadFilter(filtername: COpaquePointer?): Ntstatus

public expect fun fltUnregisterFilter(filter: PfltFilter)

public expect fun fltUntagFile(initiatinginstance: PfltInstance, fileobject: COpaquePointer?, filetag: UInt, guid: COpaquePointer?): Ntstatus

public expect fun fltVetoBypassIo(callbackdata: COpaquePointer?, fltobjects: COpaquePointer?, operationstatus: Ntstatus, failurereason: COpaquePointer?): Ntstatus

public expect fun fltWriteFile(initiatinginstance: PfltInstance, fileobject: COpaquePointer?, byteoffset: COpaquePointer?, length: UInt, buffer: COpaquePointer?, flags: UInt, byteswritten: COpaquePointer?, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: COpaquePointer?): Ntstatus

public expect fun fltWriteFileEx(initiatinginstance: PfltInstance, fileobject: COpaquePointer?, byteoffset: COpaquePointer?, length: UInt, buffer: COpaquePointer?, flags: UInt, byteswritten: COpaquePointer?, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: COpaquePointer?, key: COpaquePointer?, mdl: COpaquePointer?): Ntstatus

public expect fun fltpTraceRedirectedFileIo(originatingfileobject: COpaquePointer?, childcallbackdata: COpaquePointer?): Ntstatus
