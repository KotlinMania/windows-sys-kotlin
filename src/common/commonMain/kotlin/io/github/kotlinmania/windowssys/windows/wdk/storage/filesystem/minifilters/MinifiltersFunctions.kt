package io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DeviceObject
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DriverObject
import io.github.kotlinmania.windowssys.windows.wdk.foundation.EcpList
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Eresource
import io.github.kotlinmania.windowssys.windows.wdk.foundation.FileObject
import io.github.kotlinmania.windowssys.windows.wdk.foundation.IoPriorityHint
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Ktransaction
import io.github.kotlinmania.windowssys.windows.wdk.foundation.KwaitBlock
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Mdl
import io.github.kotlinmania.windowssys.windows.wdk.foundation.ObjectAttributes
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Peprocess
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pethread
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PnotifySync
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PoolType
import io.github.kotlinmania.windowssys.windows.wdk.foundation.SecuritySubjectContext
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FileInformationClass
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FileLock
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FsInformationClass
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.IoPriorityInfo
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.OpenReparseListEntry
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.PcheckForTraverseAccess
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.PfilterReportChange
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.PfsrtlExtraCreateParameterCleanupCallback
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.PunlockRoutine
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.IoCsqIrpContext
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.IoDriverCreateContext
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.LockOperation
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.WorkQueueType
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.FilterInformationClass
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.FilterVolumeInformationClass
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.FltFilesystemType
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.InstanceInformationClass
import io.github.kotlinmania.windowssys.windows.win32.system.io.IoStatusBlock
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.ListEntry
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.WaitType

public expect fun fltAcknowledgeEcp(filter: PfltFilter, ecpcontext: ConstPtr<CVoid>)

public expect fun fltAcquirePushLockExclusive(pushlock: MutPtr<ULong>)

public expect fun fltAcquirePushLockExclusiveEx(pushlock: MutPtr<ULong>, flags: UInt)

public expect fun fltAcquirePushLockShared(pushlock: MutPtr<ULong>)

public expect fun fltAcquirePushLockSharedEx(pushlock: MutPtr<ULong>, flags: UInt)

public expect fun fltAcquireResourceExclusive(resource: MutPtr<Eresource>)

public expect fun fltAcquireResourceShared(resource: MutPtr<Eresource>)

public expect fun fltAddOpenReparseEntry(filter: PfltFilter, data: ConstPtr<FltCallbackData>, openreparseentry: ConstPtr<OpenReparseListEntry>): Ntstatus

public expect fun fltAdjustDeviceStackSizeForIoRedirection(sourceinstance: PfltInstance, targetinstance: PfltInstance, sourcedevicestacksizemodified: MutPtr<Boolean>): Ntstatus

public expect fun fltAllocateCallbackData(instance: PfltInstance, fileobject: ConstPtr<FileObject>, retnewcallbackdata: MutPtr<MutPtr<FltCallbackData>>): Ntstatus

public expect fun fltAllocateCallbackDataEx(instance: PfltInstance, fileobject: ConstPtr<FileObject>, flags: UInt, retnewcallbackdata: MutPtr<MutPtr<FltCallbackData>>): Ntstatus

public expect fun fltAllocateContext(filter: PfltFilter, contexttype: UShort, contextsize: ULong, pooltype: PoolType, returnedcontext: MutPtr<PfltContext>): Ntstatus

public expect fun fltAllocateDeferredIoWorkItem(): PfltDeferredIoWorkitem

public expect fun fltAllocateExtraCreateParameter(filter: PfltFilter, ecptype: ConstPtr<Guid>, sizeofcontext: UInt, flags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, pooltag: UInt, ecpcontext: MutPtr<MutPtr<CVoid>>): Ntstatus

public expect fun fltAllocateExtraCreateParameterFromLookasideList(filter: PfltFilter, ecptype: ConstPtr<Guid>, sizeofcontext: UInt, flags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, lookasidelist: MutPtr<CVoid>, ecpcontext: MutPtr<MutPtr<CVoid>>): Ntstatus

public expect fun fltAllocateExtraCreateParameterList(filter: PfltFilter, flags: UInt, ecplist: MutPtr<MutPtr<EcpList>>): Ntstatus

public expect fun fltAllocateFileLock(completelockcallbackdataroutine: PfltCompleteLockCallbackDataRoutine, unlockroutine: PunlockRoutine): MutPtr<FileLock>

public expect fun fltAllocateGenericWorkItem(): PfltGenericWorkitem

public expect fun fltAllocatePoolAlignedWithTag(instance: PfltInstance, pooltype: PoolType, numberofbytes: ULong, tag: UInt): MutPtr<CVoid>

public expect fun fltApplyPriorityInfoThread(inputpriorityinfo: ConstPtr<IoPriorityInfo>, outputpriorityinfo: MutPtr<IoPriorityInfo>, thread: Pethread): Ntstatus

public expect fun fltAttachVolume(filter: PfltFilter, volume: PfltVolume, instancename: ConstPtr<UnicodeString>, retinstance: MutPtr<PfltInstance>): Ntstatus

public expect fun fltAttachVolumeAtAltitude(filter: PfltFilter, volume: PfltVolume, altitude: ConstPtr<UnicodeString>, instancename: ConstPtr<UnicodeString>, retinstance: MutPtr<PfltInstance>): Ntstatus

public expect fun fltBuildDefaultSecurityDescriptor(securitydescriptor: MutPtr<PsecurityDescriptor>, desiredaccess: UInt): Ntstatus

public expect fun fltCancelFileOpen(instance: PfltInstance, fileobject: ConstPtr<FileObject>)

public expect fun fltCancelIo(callbackdata: ConstPtr<FltCallbackData>): Boolean

public expect fun fltCancellableWaitForMultipleObjects(count: UInt, objectarray: ConstPtr<ConstPtr<CVoid>>, waittype: WaitType, timeout: ConstPtr<Long>, waitblockarray: ConstPtr<KwaitBlock>, callbackdata: ConstPtr<FltCallbackData>): Ntstatus

public expect fun fltCancellableWaitForSingleObject(obj: ConstPtr<CVoid>, timeout: ConstPtr<Long>, callbackdata: ConstPtr<FltCallbackData>): Ntstatus

public expect fun fltCbdqDisable(cbdq: MutPtr<FltCallbackDataQueue>)

public expect fun fltCbdqEnable(cbdq: MutPtr<FltCallbackDataQueue>)

public expect fun fltCbdqInitialize(instance: PfltInstance, cbdq: MutPtr<FltCallbackDataQueue>, cbdqinsertio: PfltCallbackDataQueueInsertIo, cbdqremoveio: PfltCallbackDataQueueRemoveIo, cbdqpeeknextio: PfltCallbackDataQueuePeekNextIo, cbdqacquire: PfltCallbackDataQueueAcquire, cbdqrelease: PfltCallbackDataQueueRelease, cbdqcompletecanceledio: PfltCallbackDataQueueCompleteCanceledIo): Ntstatus

public expect fun fltCbdqInsertIo(cbdq: MutPtr<FltCallbackDataQueue>, cbd: ConstPtr<FltCallbackData>, context: ConstPtr<IoCsqIrpContext>, insertcontext: ConstPtr<CVoid>): Ntstatus

public expect fun fltCbdqRemoveIo(cbdq: MutPtr<FltCallbackDataQueue>, context: ConstPtr<IoCsqIrpContext>): MutPtr<FltCallbackData>

public expect fun fltCbdqRemoveNextIo(cbdq: MutPtr<FltCallbackDataQueue>, peekcontext: ConstPtr<CVoid>): MutPtr<FltCallbackData>

public expect fun fltCheckAndGrowNameControl(namectrl: MutPtr<FltNameControl>, newsize: UShort): Ntstatus

public expect fun fltCheckLockForReadAccess(filelock: ConstPtr<FileLock>, callbackdata: ConstPtr<FltCallbackData>): Boolean

public expect fun fltCheckLockForWriteAccess(filelock: ConstPtr<FileLock>, callbackdata: ConstPtr<FltCallbackData>): Boolean

public expect fun fltCheckOplock(oplock: ConstPtr<ConstPtr<CVoid>>, callbackdata: ConstPtr<FltCallbackData>, context: ConstPtr<CVoid>, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus

public expect fun fltCheckOplockEx(oplock: ConstPtr<ConstPtr<CVoid>>, callbackdata: ConstPtr<FltCallbackData>, flags: UInt, context: ConstPtr<CVoid>, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus

public expect fun fltClearCallbackDataDirty(data: MutPtr<FltCallbackData>)

public expect fun fltClearCancelCompletion(callbackdata: ConstPtr<FltCallbackData>): Ntstatus

public expect fun fltClose(filehandle: Handle): Ntstatus

public expect fun fltCloseClientPort(filter: PfltFilter, clientport: MutPtr<PfltPort>)

public expect fun fltCloseCommunicationPort(serverport: PfltPort)

public expect fun fltCloseSectionForDataScan(sectioncontext: PfltContext): Ntstatus

public expect fun fltCommitComplete(instance: PfltInstance, transaction: ConstPtr<Ktransaction>, transactioncontext: PfltContext): Ntstatus

public expect fun fltCommitFinalizeComplete(instance: PfltInstance, transaction: ConstPtr<Ktransaction>, transactioncontext: PfltContext): Ntstatus

public expect fun fltCompareInstanceAltitudes(instance1: PfltInstance, instance2: PfltInstance): Int

public expect fun fltCompletePendedPostOperation(callbackdata: ConstPtr<FltCallbackData>)

public expect fun fltCompletePendedPreOperation(callbackdata: ConstPtr<FltCallbackData>, callbackstatus: FltPreopCallbackStatus, context: ConstPtr<CVoid>)

public expect fun fltCopyOpenReparseList(filter: PfltFilter, data: ConstPtr<FltCallbackData>, ecplist: MutPtr<EcpList>): Ntstatus

public expect fun fltCreateCommunicationPort(filter: PfltFilter, serverport: MutPtr<PfltPort>, objectattributes: ConstPtr<ObjectAttributes>, serverportcookie: ConstPtr<CVoid>, connectnotifycallback: PfltConnectNotify, disconnectnotifycallback: PfltDisconnectNotify, messagenotifycallback: PfltMessageNotify, maxconnections: Int): Ntstatus

public expect fun fltCreateFile(filter: PfltFilter, instance: PfltInstance, filehandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, allocationsize: ConstPtr<Long>, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: ConstPtr<CVoid>, ealength: UInt, flags: UInt): Ntstatus

public expect fun fltCreateFileEx(filter: PfltFilter, instance: PfltInstance, filehandle: MutPtr<Handle>, fileobject: MutPtr<MutPtr<FileObject>>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, allocationsize: ConstPtr<Long>, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: ConstPtr<CVoid>, ealength: UInt, flags: UInt): Ntstatus

public expect fun fltCreateFileEx2(filter: PfltFilter, instance: PfltInstance, filehandle: MutPtr<Handle>, fileobject: MutPtr<MutPtr<FileObject>>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, allocationsize: ConstPtr<Long>, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: ConstPtr<CVoid>, ealength: UInt, flags: UInt, drivercontext: ConstPtr<IoDriverCreateContext>): Ntstatus

public expect fun fltCreateMailslotFile(filter: PfltFilter, instance: PfltInstance, filehandle: MutPtr<Handle>, fileobject: MutPtr<MutPtr<FileObject>>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, createoptions: UInt, mailslotquota: UInt, maximummessagesize: UInt, readtimeout: ConstPtr<Long>, drivercontext: ConstPtr<IoDriverCreateContext>): Ntstatus

public expect fun fltCreateNamedPipeFile(filter: PfltFilter, instance: PfltInstance, filehandle: MutPtr<Handle>, fileobject: MutPtr<MutPtr<FileObject>>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, namedpipetype: UInt, readmode: UInt, completionmode: UInt, maximuminstances: UInt, inboundquota: UInt, outboundquota: UInt, defaulttimeout: ConstPtr<Long>, drivercontext: ConstPtr<IoDriverCreateContext>): Ntstatus

public expect fun fltCreateSectionForDataScan(instance: PfltInstance, fileobject: ConstPtr<FileObject>, sectioncontext: PfltContext, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, maximumsize: ConstPtr<Long>, sectionpageprotection: UInt, allocationattributes: UInt, flags: UInt, sectionhandle: MutPtr<Handle>, sectionobject: MutPtr<MutPtr<CVoid>>, sectionfilesize: MutPtr<Long>): Ntstatus

public expect fun fltCreateSystemVolumeInformationFolder(instance: PfltInstance): Ntstatus

public expect fun fltCurrentBatchOplock(oplock: ConstPtr<ConstPtr<CVoid>>): Boolean

public expect fun fltCurrentOplock(oplock: ConstPtr<ConstPtr<CVoid>>): Boolean

public expect fun fltCurrentOplockH(oplock: ConstPtr<ConstPtr<CVoid>>): Boolean

public expect fun fltDecodeParameters(callbackdata: ConstPtr<FltCallbackData>, mdladdresspointer: MutPtr<MutPtr<MutPtr<Mdl>>>, buffer: MutPtr<MutPtr<MutPtr<CVoid>>>, length: MutPtr<MutPtr<UInt>>, desiredaccess: MutPtr<LockOperation>): Ntstatus

public expect fun fltDeleteContext(context: PfltContext)

public expect fun fltDeleteExtraCreateParameterLookasideList(filter: PfltFilter, lookaside: MutPtr<CVoid>, flags: UInt)

public expect fun fltDeleteFileContext(instance: PfltInstance, fileobject: ConstPtr<FileObject>, oldcontext: MutPtr<PfltContext>): Ntstatus

public expect fun fltDeleteInstanceContext(instance: PfltInstance, oldcontext: MutPtr<PfltContext>): Ntstatus

public expect fun fltDeletePushLock(pushlock: ConstPtr<ULong>)

public expect fun fltDeleteStreamContext(instance: PfltInstance, fileobject: ConstPtr<FileObject>, oldcontext: MutPtr<PfltContext>): Ntstatus

public expect fun fltDeleteStreamHandleContext(instance: PfltInstance, fileobject: ConstPtr<FileObject>, oldcontext: MutPtr<PfltContext>): Ntstatus

public expect fun fltDeleteTransactionContext(instance: PfltInstance, transaction: ConstPtr<Ktransaction>, oldcontext: MutPtr<PfltContext>): Ntstatus

public expect fun fltDeleteVolumeContext(filter: PfltFilter, volume: PfltVolume, oldcontext: MutPtr<PfltContext>): Ntstatus

public expect fun fltDetachVolume(filter: PfltFilter, volume: PfltVolume, instancename: ConstPtr<UnicodeString>): Ntstatus

public expect fun fltDeviceIoControlFile(instance: PfltInstance, fileobject: ConstPtr<FileObject>, iocontrolcode: UInt, inputbuffer: ConstPtr<CVoid>, inputbufferlength: UInt, outputbuffer: MutPtr<CVoid>, outputbufferlength: UInt, lengthreturned: MutPtr<UInt>): Ntstatus

public expect fun fltDoCompletionProcessingWhenSafe(data: ConstPtr<FltCallbackData>, fltobjects: ConstPtr<FltRelatedObjects>, completioncontext: ConstPtr<CVoid>, flags: UInt, safepostcallback: PfltPostOperationCallback, retpostoperationstatus: MutPtr<FltPostopCallbackStatus>): Boolean

public expect fun fltEnlistInTransaction(instance: PfltInstance, transaction: ConstPtr<Ktransaction>, transactioncontext: PfltContext, notificationmask: UInt): Ntstatus

public expect fun fltEnumerateFilterInformation(index: UInt, informationclass: FilterInformationClass, buffer: MutPtr<CVoid>, buffersize: UInt, bytesreturned: MutPtr<UInt>): Ntstatus

public expect fun fltEnumerateFilters(filterlist: MutPtr<PfltFilter>, filterlistsize: UInt, numberfiltersreturned: MutPtr<UInt>): Ntstatus

public expect fun fltEnumerateInstanceInformationByDeviceObject(deviceobject: ConstPtr<DeviceObject>, index: UInt, informationclass: InstanceInformationClass, buffer: MutPtr<CVoid>, buffersize: UInt, bytesreturned: MutPtr<UInt>): Ntstatus

public expect fun fltEnumerateInstanceInformationByFilter(filter: PfltFilter, index: UInt, informationclass: InstanceInformationClass, buffer: MutPtr<CVoid>, buffersize: UInt, bytesreturned: MutPtr<UInt>): Ntstatus

public expect fun fltEnumerateInstanceInformationByVolume(volume: PfltVolume, index: UInt, informationclass: InstanceInformationClass, buffer: MutPtr<CVoid>, buffersize: UInt, bytesreturned: MutPtr<UInt>): Ntstatus

public expect fun fltEnumerateInstanceInformationByVolumeName(volumename: ConstPtr<UnicodeString>, index: UInt, informationclass: InstanceInformationClass, buffer: MutPtr<CVoid>, buffersize: UInt, bytesreturned: MutPtr<UInt>): Ntstatus

public expect fun fltEnumerateInstances(volume: PfltVolume, filter: PfltFilter, instancelist: MutPtr<PfltInstance>, instancelistsize: UInt, numberinstancesreturned: MutPtr<UInt>): Ntstatus

public expect fun fltEnumerateVolumeInformation(filter: PfltFilter, index: UInt, informationclass: FilterVolumeInformationClass, buffer: MutPtr<CVoid>, buffersize: UInt, bytesreturned: MutPtr<UInt>): Ntstatus

public expect fun fltEnumerateVolumes(filter: PfltFilter, volumelist: MutPtr<PfltVolume>, volumelistsize: UInt, numbervolumesreturned: MutPtr<UInt>): Ntstatus

public expect fun fltFastIoMdlRead(initiatinginstance: PfltInstance, fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, lockkey: UInt, mdlchain: MutPtr<MutPtr<Mdl>>, iostatus: MutPtr<IoStatusBlock>): Boolean

public expect fun fltFastIoMdlReadComplete(initiatinginstance: PfltInstance, fileobject: ConstPtr<FileObject>, mdlchain: ConstPtr<Mdl>): Boolean

public expect fun fltFastIoMdlWriteComplete(initiatinginstance: PfltInstance, fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, mdlchain: ConstPtr<Mdl>): Boolean

public expect fun fltFastIoPrepareMdlWrite(initiatinginstance: PfltInstance, fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, lockkey: UInt, mdlchain: MutPtr<MutPtr<Mdl>>, iostatus: MutPtr<IoStatusBlock>): Boolean

public expect fun fltFindExtraCreateParameter(filter: PfltFilter, ecplist: ConstPtr<EcpList>, ecptype: ConstPtr<Guid>, ecpcontext: MutPtr<MutPtr<CVoid>>, ecpcontextsize: MutPtr<UInt>): Ntstatus

public expect fun fltFlushBuffers(instance: PfltInstance, fileobject: ConstPtr<FileObject>): Ntstatus

public expect fun fltFlushBuffers2(instance: PfltInstance, fileobject: ConstPtr<FileObject>, flushtype: UInt, callbackdata: ConstPtr<FltCallbackData>): Ntstatus

public expect fun fltFreeCallbackData(callbackdata: ConstPtr<FltCallbackData>)

public expect fun fltFreeDeferredIoWorkItem(fltworkitem: PfltDeferredIoWorkitem)

public expect fun fltFreeExtraCreateParameter(filter: PfltFilter, ecpcontext: ConstPtr<CVoid>)

public expect fun fltFreeExtraCreateParameterList(filter: PfltFilter, ecplist: ConstPtr<EcpList>)

public expect fun fltFreeFileLock(filelock: ConstPtr<FileLock>)

public expect fun fltFreeGenericWorkItem(fltworkitem: PfltGenericWorkitem)

public expect fun fltFreeOpenReparseList(filter: PfltFilter, ecplist: ConstPtr<EcpList>)

public expect fun fltFreePoolAlignedWithTag(instance: PfltInstance, buffer: ConstPtr<CVoid>, tag: UInt)

public expect fun fltFreeSecurityDescriptor(securitydescriptor: PsecurityDescriptor)

public expect fun fltFsControlFile(instance: PfltInstance, fileobject: ConstPtr<FileObject>, fscontrolcode: UInt, inputbuffer: ConstPtr<CVoid>, inputbufferlength: UInt, outputbuffer: MutPtr<CVoid>, outputbufferlength: UInt, lengthreturned: MutPtr<UInt>): Ntstatus

public expect fun fltGetActivityIdCallbackData(callbackdata: ConstPtr<FltCallbackData>, guid: MutPtr<Guid>): Ntstatus

public expect fun fltGetBottomInstance(volume: PfltVolume, instance: MutPtr<PfltInstance>): Ntstatus

public expect fun fltGetContexts(fltobjects: ConstPtr<FltRelatedObjects>, desiredcontexts: UShort, contexts: MutPtr<FltRelatedContexts>)

public expect fun fltGetContextsEx(fltobjects: ConstPtr<FltRelatedObjects>, desiredcontexts: UShort, contextssize: ULong, contexts: MutPtr<FltRelatedContextsEx>): Ntstatus

public expect fun fltGetDestinationFileNameInformation(instance: PfltInstance, fileobject: ConstPtr<FileObject>, rootdirectory: Handle, filename: Pcwstr, filenamelength: UInt, nameoptions: UInt, retfilenameinformation: MutPtr<MutPtr<FltFileNameInformation>>): Ntstatus

public expect fun fltGetDeviceObject(volume: PfltVolume, deviceobject: MutPtr<MutPtr<DeviceObject>>): Ntstatus

public expect fun fltGetDiskDeviceObject(volume: PfltVolume, diskdeviceobject: MutPtr<MutPtr<DeviceObject>>): Ntstatus

public expect fun fltGetEcpListFromCallbackData(filter: PfltFilter, callbackdata: ConstPtr<FltCallbackData>, ecplist: MutPtr<MutPtr<EcpList>>): Ntstatus

public expect fun fltGetFileContext(instance: PfltInstance, fileobject: ConstPtr<FileObject>, context: MutPtr<PfltContext>): Ntstatus

public expect fun fltGetFileNameInformation(callbackdata: ConstPtr<FltCallbackData>, nameoptions: UInt, filenameinformation: MutPtr<MutPtr<FltFileNameInformation>>): Ntstatus

public expect fun fltGetFileNameInformationUnsafe(fileobject: ConstPtr<FileObject>, instance: PfltInstance, nameoptions: UInt, filenameinformation: MutPtr<MutPtr<FltFileNameInformation>>): Ntstatus

public expect fun fltGetFileSystemType(fltobject: ConstPtr<CVoid>, filesystemtype: MutPtr<FltFilesystemType>): Ntstatus

public expect fun fltGetFilterFromInstance(instance: PfltInstance, retfilter: MutPtr<PfltFilter>): Ntstatus

public expect fun fltGetFilterFromName(filtername: ConstPtr<UnicodeString>, retfilter: MutPtr<PfltFilter>): Ntstatus

public expect fun fltGetFilterInformation(filter: PfltFilter, informationclass: FilterInformationClass, buffer: MutPtr<CVoid>, buffersize: UInt, bytesreturned: MutPtr<UInt>): Ntstatus

public expect fun fltGetFsZeroingOffset(data: ConstPtr<FltCallbackData>, zeroingoffset: MutPtr<UInt>): Ntstatus

public expect fun fltGetInstanceContext(instance: PfltInstance, context: MutPtr<PfltContext>): Ntstatus

public expect fun fltGetInstanceInformation(instance: PfltInstance, informationclass: InstanceInformationClass, buffer: MutPtr<CVoid>, buffersize: UInt, bytesreturned: MutPtr<UInt>): Ntstatus

public expect fun fltGetIoAttributionHandleFromCallbackData(data: ConstPtr<FltCallbackData>): MutPtr<CVoid>

public expect fun fltGetIoPriorityHint(data: ConstPtr<FltCallbackData>): IoPriorityHint

public expect fun fltGetIoPriorityHintFromCallbackData(data: ConstPtr<FltCallbackData>): IoPriorityHint

public expect fun fltGetIoPriorityHintFromFileObject(fileobject: ConstPtr<FileObject>): IoPriorityHint

public expect fun fltGetIoPriorityHintFromThread(thread: Pethread): IoPriorityHint

public expect fun fltGetIrpName(irpmajorcode: UByte): Pstr

public expect fun fltGetLowerInstance(currentinstance: PfltInstance, lowerinstance: MutPtr<PfltInstance>): Ntstatus

public expect fun fltGetNewSystemBufferAddress(callbackdata: ConstPtr<FltCallbackData>): MutPtr<CVoid>

public expect fun fltGetNextExtraCreateParameter(filter: PfltFilter, ecplist: ConstPtr<EcpList>, currentecpcontext: ConstPtr<CVoid>, nextecptype: MutPtr<Guid>, nextecpcontext: MutPtr<MutPtr<CVoid>>, nextecpcontextsize: MutPtr<UInt>): Ntstatus

public expect fun fltGetRequestorProcess(callbackdata: ConstPtr<FltCallbackData>): Peprocess

public expect fun fltGetRequestorProcessId(callbackdata: ConstPtr<FltCallbackData>): UInt

public expect fun fltGetRequestorProcessIdEx(callbackdata: ConstPtr<FltCallbackData>): Handle

public expect fun fltGetRequestorSessionId(callbackdata: ConstPtr<FltCallbackData>, sessionid: MutPtr<UInt>): Ntstatus

public expect fun fltGetRoutineAddress(fltmgrroutinename: Pcstr): MutPtr<CVoid>

public expect fun fltGetSectionContext(instance: PfltInstance, fileobject: ConstPtr<FileObject>, context: MutPtr<PfltContext>): Ntstatus

public expect fun fltGetStreamContext(instance: PfltInstance, fileobject: ConstPtr<FileObject>, context: MutPtr<PfltContext>): Ntstatus

public expect fun fltGetStreamHandleContext(instance: PfltInstance, fileobject: ConstPtr<FileObject>, context: MutPtr<PfltContext>): Ntstatus

public expect fun fltGetSwappedBufferMdlAddress(callbackdata: ConstPtr<FltCallbackData>): MutPtr<Mdl>

public expect fun fltGetTopInstance(volume: PfltVolume, instance: MutPtr<PfltInstance>): Ntstatus

public expect fun fltGetTransactionContext(instance: PfltInstance, transaction: ConstPtr<Ktransaction>, context: MutPtr<PfltContext>): Ntstatus

public expect fun fltGetTunneledName(callbackdata: ConstPtr<FltCallbackData>, filenameinformation: ConstPtr<FltFileNameInformation>, rettunneledfilenameinformation: MutPtr<MutPtr<FltFileNameInformation>>): Ntstatus

public expect fun fltGetUpperInstance(currentinstance: PfltInstance, upperinstance: MutPtr<PfltInstance>): Ntstatus

public expect fun fltGetVolumeContext(filter: PfltFilter, volume: PfltVolume, context: MutPtr<PfltContext>): Ntstatus

public expect fun fltGetVolumeFromDeviceObject(filter: PfltFilter, deviceobject: ConstPtr<DeviceObject>, retvolume: MutPtr<PfltVolume>): Ntstatus

public expect fun fltGetVolumeFromFileObject(filter: PfltFilter, fileobject: ConstPtr<FileObject>, retvolume: MutPtr<PfltVolume>): Ntstatus

public expect fun fltGetVolumeFromInstance(instance: PfltInstance, retvolume: MutPtr<PfltVolume>): Ntstatus

public expect fun fltGetVolumeFromName(filter: PfltFilter, volumename: ConstPtr<UnicodeString>, retvolume: MutPtr<PfltVolume>): Ntstatus

public expect fun fltGetVolumeGuidName(volume: PfltVolume, volumeguidname: MutPtr<UnicodeString>, buffersizeneeded: MutPtr<UInt>): Ntstatus

public expect fun fltGetVolumeInformation(volume: PfltVolume, informationclass: FilterVolumeInformationClass, buffer: MutPtr<CVoid>, buffersize: UInt, bytesreturned: MutPtr<UInt>): Ntstatus

public expect fun fltGetVolumeInstanceFromName(filter: PfltFilter, volume: PfltVolume, instancename: ConstPtr<UnicodeString>, retinstance: MutPtr<PfltInstance>): Ntstatus

public expect fun fltGetVolumeName(volume: PfltVolume, volumename: MutPtr<UnicodeString>, buffersizeneeded: MutPtr<UInt>): Ntstatus

public expect fun fltGetVolumeProperties(volume: PfltVolume, volumeproperties: MutPtr<FltVolumeProperties>, volumepropertieslength: UInt, lengthreturned: MutPtr<UInt>): Ntstatus

public expect fun fltInitExtraCreateParameterLookasideList(filter: PfltFilter, lookaside: MutPtr<CVoid>, flags: UInt, size: ULong, tag: UInt)

public expect fun fltInitializeFileLock(filelock: MutPtr<FileLock>)

public expect fun fltInitializeOplock(oplock: MutPtr<MutPtr<CVoid>>)

public expect fun fltInitializePushLock(pushlock: MutPtr<ULong>)

public expect fun fltInsertExtraCreateParameter(filter: PfltFilter, ecplist: MutPtr<EcpList>, ecpcontext: MutPtr<CVoid>): Ntstatus

public expect fun fltIs32bitProcess(callbackdata: ConstPtr<FltCallbackData>): Boolean

public expect fun fltIsCallbackDataDirty(data: ConstPtr<FltCallbackData>): Boolean

public expect fun fltIsDirectory(fileobject: ConstPtr<FileObject>, instance: PfltInstance, isdirectory: MutPtr<Boolean>): Ntstatus

public expect fun fltIsEcpAcknowledged(filter: PfltFilter, ecpcontext: ConstPtr<CVoid>): Boolean

public expect fun fltIsEcpFromUserMode(filter: PfltFilter, ecpcontext: ConstPtr<CVoid>): Boolean

public expect fun fltIsFltMgrVolumeDeviceObject(deviceobject: ConstPtr<DeviceObject>): Boolean

public expect fun fltIsIoCanceled(callbackdata: ConstPtr<FltCallbackData>): Boolean

public expect fun fltIsIoRedirectionAllowed(sourceinstance: PfltInstance, targetinstance: PfltInstance, redirectionallowed: MutPtr<Boolean>): Ntstatus

public expect fun fltIsIoRedirectionAllowedForOperation(data: ConstPtr<FltCallbackData>, targetinstance: PfltInstance, redirectionallowedthisio: MutPtr<Boolean>, redirectionallowedallio: MutPtr<Boolean>): Ntstatus

public expect fun fltIsOperationSynchronous(callbackdata: ConstPtr<FltCallbackData>): Boolean

public expect fun fltIsVolumeSnapshot(fltobject: ConstPtr<CVoid>, issnapshotvolume: MutPtr<Boolean>): Ntstatus

public expect fun fltIsVolumeWritable(fltobject: ConstPtr<CVoid>, iswritable: MutPtr<Boolean>): Ntstatus

public expect fun fltLoadFilter(filtername: ConstPtr<UnicodeString>): Ntstatus

public expect fun fltLockUserBuffer(callbackdata: ConstPtr<FltCallbackData>): Ntstatus

public expect fun fltNotifyFilterChangeDirectory(notifysync: PnotifySync, notifylist: MutPtr<ListEntry>, fscontext: ConstPtr<CVoid>, fulldirectoryname: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifycallbackdata: ConstPtr<FltCallbackData>, traversecallback: PcheckForTraverseAccess, subjectcontext: ConstPtr<SecuritySubjectContext>, filtercallback: PfilterReportChange)

public expect fun fltObjectDereference(fltobject: MutPtr<CVoid>)

public expect fun fltObjectReference(fltobject: MutPtr<CVoid>): Ntstatus

public expect fun fltOpenVolume(instance: PfltInstance, volumehandle: MutPtr<Handle>, volumefileobject: MutPtr<MutPtr<FileObject>>): Ntstatus

public expect fun fltOplockBreakH(oplock: ConstPtr<ConstPtr<CVoid>>, callbackdata: ConstPtr<FltCallbackData>, flags: UInt, context: ConstPtr<CVoid>, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus

public expect fun fltOplockBreakToNone(oplock: ConstPtr<ConstPtr<CVoid>>, callbackdata: ConstPtr<FltCallbackData>, context: ConstPtr<CVoid>, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus

public expect fun fltOplockBreakToNoneEx(oplock: ConstPtr<ConstPtr<CVoid>>, callbackdata: ConstPtr<FltCallbackData>, flags: UInt, context: ConstPtr<CVoid>, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus

public expect fun fltOplockFsctrl(oplock: ConstPtr<ConstPtr<CVoid>>, callbackdata: ConstPtr<FltCallbackData>, opencount: UInt): FltPreopCallbackStatus

public expect fun fltOplockFsctrlEx(oplock: ConstPtr<ConstPtr<CVoid>>, callbackdata: ConstPtr<FltCallbackData>, opencount: UInt, flags: UInt): FltPreopCallbackStatus

public expect fun fltOplockIsFastIoPossible(oplock: ConstPtr<ConstPtr<CVoid>>): Boolean

public expect fun fltOplockIsSharedRequest(callbackdata: ConstPtr<FltCallbackData>): Boolean

public expect fun fltOplockKeysEqual(fo1: ConstPtr<FileObject>, fo2: ConstPtr<FileObject>): Boolean

public expect fun fltParseFileName(filename: ConstPtr<UnicodeString>, extension: MutPtr<UnicodeString>, stream: MutPtr<UnicodeString>, finalcomponent: MutPtr<UnicodeString>): Ntstatus

public expect fun fltParseFileNameInformation(filenameinformation: MutPtr<FltFileNameInformation>): Ntstatus

public expect fun fltPerformAsynchronousIo(callbackdata: MutPtr<FltCallbackData>, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: ConstPtr<CVoid>): Ntstatus

public expect fun fltPerformSynchronousIo(callbackdata: MutPtr<FltCallbackData>)

public expect fun fltPrePrepareComplete(instance: PfltInstance, transaction: ConstPtr<Ktransaction>, transactioncontext: PfltContext): Ntstatus

public expect fun fltPrepareComplete(instance: PfltInstance, transaction: ConstPtr<Ktransaction>, transactioncontext: PfltContext): Ntstatus

public expect fun fltPrepareToReuseEcp(filter: PfltFilter, ecpcontext: ConstPtr<CVoid>)

public expect fun fltProcessFileLock(filelock: ConstPtr<FileLock>, callbackdata: ConstPtr<FltCallbackData>, context: ConstPtr<CVoid>): FltPreopCallbackStatus

public expect fun fltPropagateActivityIdToThread(callbackdata: ConstPtr<FltCallbackData>, propagateid: MutPtr<Guid>, originalid: MutPtr<MutPtr<Guid>>): Ntstatus

public expect fun fltPropagateIrpExtension(sourcedata: ConstPtr<FltCallbackData>, targetdata: MutPtr<FltCallbackData>, flags: UInt): Ntstatus

public expect fun fltPurgeFileNameInformationCache(instance: PfltInstance, fileobject: ConstPtr<FileObject>): Ntstatus

public expect fun fltQueryDirectoryFile(instance: PfltInstance, fileobject: ConstPtr<FileObject>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass, returnsingleentry: Boolean, filename: ConstPtr<UnicodeString>, restartscan: Boolean, lengthreturned: MutPtr<UInt>): Ntstatus

public expect fun fltQueryDirectoryFileEx(instance: PfltInstance, fileobject: ConstPtr<FileObject>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass, queryflags: UInt, filename: ConstPtr<UnicodeString>, lengthreturned: MutPtr<UInt>): Ntstatus

public expect fun fltQueryEaFile(instance: PfltInstance, fileobject: ConstPtr<FileObject>, returnedeadata: MutPtr<CVoid>, length: UInt, returnsingleentry: Boolean, ealist: ConstPtr<CVoid>, ealistlength: UInt, eaindex: ConstPtr<UInt>, restartscan: Boolean, lengthreturned: MutPtr<UInt>): Ntstatus

public expect fun fltQueryInformationByName(filter: PfltFilter, instance: PfltInstance, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass, drivercontext: ConstPtr<IoDriverCreateContext>): Ntstatus

public expect fun fltQueryInformationFile(instance: PfltInstance, fileobject: ConstPtr<FileObject>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass, lengthreturned: MutPtr<UInt>): Ntstatus

public expect fun fltQueryQuotaInformationFile(instance: PfltInstance, fileobject: ConstPtr<FileObject>, iostatusblock: MutPtr<IoStatusBlock>, buffer: MutPtr<CVoid>, length: UInt, returnsingleentry: Boolean, sidlist: ConstPtr<CVoid>, sidlistlength: UInt, startsid: ConstPtr<UInt>, restartscan: Boolean, lengthreturned: MutPtr<UInt>): Ntstatus

public expect fun fltQuerySecurityObject(instance: PfltInstance, fileobject: ConstPtr<FileObject>, securityinformation: UInt, securitydescriptor: PsecurityDescriptor, length: UInt, lengthneeded: MutPtr<UInt>): Ntstatus

public expect fun fltQueryVolumeInformation(instance: PfltInstance, iosb: MutPtr<IoStatusBlock>, fsinformation: MutPtr<CVoid>, length: UInt, fsinformationclass: FsInformationClass): Ntstatus

public expect fun fltQueryVolumeInformationFile(instance: PfltInstance, fileobject: ConstPtr<FileObject>, fsinformation: MutPtr<CVoid>, length: UInt, fsinformationclass: FsInformationClass, lengthreturned: MutPtr<UInt>): Ntstatus

public expect fun fltQueueDeferredIoWorkItem(fltworkitem: PfltDeferredIoWorkitem, data: ConstPtr<FltCallbackData>, workerroutine: PfltDeferredIoWorkitemRoutine, queuetype: WorkQueueType, context: ConstPtr<CVoid>): Ntstatus

public expect fun fltQueueGenericWorkItem(fltworkitem: PfltGenericWorkitem, fltobject: ConstPtr<CVoid>, workerroutine: PfltGenericWorkitemRoutine, queuetype: WorkQueueType, context: ConstPtr<CVoid>): Ntstatus

public expect fun fltReadFile(initiatinginstance: PfltInstance, fileobject: ConstPtr<FileObject>, byteoffset: ConstPtr<Long>, length: UInt, buffer: MutPtr<CVoid>, flags: UInt, bytesread: MutPtr<UInt>, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: ConstPtr<CVoid>): Ntstatus

public expect fun fltReadFileEx(initiatinginstance: PfltInstance, fileobject: ConstPtr<FileObject>, byteoffset: ConstPtr<Long>, length: UInt, buffer: MutPtr<CVoid>, flags: UInt, bytesread: MutPtr<UInt>, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: ConstPtr<CVoid>, key: ConstPtr<UInt>, mdl: ConstPtr<Mdl>): Ntstatus

public expect fun fltReferenceContext(context: PfltContext)

public expect fun fltReferenceFileNameInformation(filenameinformation: ConstPtr<FltFileNameInformation>)

public expect fun fltRegisterFilter(driver: ConstPtr<DriverObject>, registration: ConstPtr<FltRegistration>, retfilter: MutPtr<PfltFilter>): Ntstatus

public expect fun fltRegisterForDataScan(instance: PfltInstance): Ntstatus

public expect fun fltReissueSynchronousIo(initiatinginstance: PfltInstance, callbackdata: ConstPtr<FltCallbackData>)

public expect fun fltReleaseContext(context: PfltContext)

public expect fun fltReleaseContexts(contexts: ConstPtr<FltRelatedContexts>)

public expect fun fltReleaseContextsEx(contextssize: ULong, contexts: ConstPtr<FltRelatedContextsEx>)

public expect fun fltReleaseFileNameInformation(filenameinformation: ConstPtr<FltFileNameInformation>)

public expect fun fltReleasePushLock(pushlock: MutPtr<ULong>)

public expect fun fltReleasePushLockEx(pushlock: MutPtr<ULong>, flags: UInt)

public expect fun fltReleaseResource(resource: MutPtr<Eresource>)

public expect fun fltRemoveExtraCreateParameter(filter: PfltFilter, ecplist: MutPtr<EcpList>, ecptype: ConstPtr<Guid>, ecpcontext: MutPtr<MutPtr<CVoid>>, ecpcontextsize: MutPtr<UInt>): Ntstatus

public expect fun fltRemoveOpenReparseEntry(filter: PfltFilter, data: ConstPtr<FltCallbackData>, openreparseentry: ConstPtr<OpenReparseListEntry>)

public expect fun fltRequestFileInfoOnCreateCompletion(filter: PfltFilter, data: ConstPtr<FltCallbackData>, infoclassflags: UInt): Ntstatus

public expect fun fltRequestOperationStatusCallback(data: ConstPtr<FltCallbackData>, callbackroutine: PfltGetOperationStatusCallback, requestercontext: ConstPtr<CVoid>): Ntstatus

public expect fun fltRetainSwappedBufferMdlAddress(callbackdata: ConstPtr<FltCallbackData>)

public expect fun fltRetrieveFileInfoOnCreateCompletion(filter: PfltFilter, data: ConstPtr<FltCallbackData>, infoclass: UInt, size: MutPtr<UInt>): MutPtr<CVoid>

public expect fun fltRetrieveFileInfoOnCreateCompletionEx(filter: PfltFilter, data: ConstPtr<FltCallbackData>, infoclass: UInt, retinfosize: MutPtr<UInt>, retinfobuffer: MutPtr<MutPtr<CVoid>>): Ntstatus

public expect fun fltRetrieveIoPriorityInfo(data: ConstPtr<FltCallbackData>, fileobject: ConstPtr<FileObject>, thread: Pethread, priorityinfo: MutPtr<IoPriorityInfo>): Ntstatus

public expect fun fltReuseCallbackData(callbackdata: MutPtr<FltCallbackData>)

public expect fun fltRollbackComplete(instance: PfltInstance, transaction: ConstPtr<Ktransaction>, transactioncontext: PfltContext): Ntstatus

public expect fun fltRollbackEnlistment(instance: PfltInstance, transaction: ConstPtr<Ktransaction>, transactioncontext: PfltContext): Ntstatus

public expect fun fltSendMessage(filter: PfltFilter, clientport: ConstPtr<PfltPort>, senderbuffer: ConstPtr<CVoid>, senderbufferlength: UInt, replybuffer: MutPtr<CVoid>, replylength: MutPtr<UInt>, timeout: ConstPtr<Long>): Ntstatus

public expect fun fltSetActivityIdCallbackData(callbackdata: MutPtr<FltCallbackData>, guid: ConstPtr<Guid>): Ntstatus

public expect fun fltSetCallbackDataDirty(data: MutPtr<FltCallbackData>)

public expect fun fltSetCancelCompletion(callbackdata: ConstPtr<FltCallbackData>, canceledcallback: PfltCompleteCanceledCallback): Ntstatus

public expect fun fltSetEaFile(instance: PfltInstance, fileobject: ConstPtr<FileObject>, eabuffer: ConstPtr<CVoid>, length: UInt): Ntstatus

public expect fun fltSetEcpListIntoCallbackData(filter: PfltFilter, callbackdata: ConstPtr<FltCallbackData>, ecplist: ConstPtr<EcpList>): Ntstatus

public expect fun fltSetFileContext(instance: PfltInstance, fileobject: ConstPtr<FileObject>, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr<PfltContext>): Ntstatus

public expect fun fltSetFsZeroingOffset(data: ConstPtr<FltCallbackData>, zeroingoffset: UInt): Ntstatus

public expect fun fltSetFsZeroingOffsetRequired(data: ConstPtr<FltCallbackData>): Ntstatus

public expect fun fltSetInformationFile(instance: PfltInstance, fileobject: ConstPtr<FileObject>, fileinformation: ConstPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass): Ntstatus

public expect fun fltSetInstanceContext(instance: PfltInstance, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr<PfltContext>): Ntstatus

public expect fun fltSetIoPriorityHintIntoCallbackData(data: ConstPtr<FltCallbackData>, priorityhint: IoPriorityHint): Ntstatus

public expect fun fltSetIoPriorityHintIntoFileObject(fileobject: ConstPtr<FileObject>, priorityhint: IoPriorityHint): Ntstatus

public expect fun fltSetIoPriorityHintIntoThread(thread: Pethread, priorityhint: IoPriorityHint): Ntstatus

public expect fun fltSetQuotaInformationFile(instance: PfltInstance, fileobject: ConstPtr<FileObject>, buffer: ConstPtr<CVoid>, length: UInt): Ntstatus

public expect fun fltSetSecurityObject(instance: PfltInstance, fileobject: ConstPtr<FileObject>, securityinformation: UInt, securitydescriptor: PsecurityDescriptor): Ntstatus

public expect fun fltSetStreamContext(instance: PfltInstance, fileobject: ConstPtr<FileObject>, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr<PfltContext>): Ntstatus

public expect fun fltSetStreamHandleContext(instance: PfltInstance, fileobject: ConstPtr<FileObject>, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr<PfltContext>): Ntstatus

public expect fun fltSetTransactionContext(instance: PfltInstance, transaction: ConstPtr<Ktransaction>, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr<PfltContext>): Ntstatus

public expect fun fltSetVolumeContext(volume: PfltVolume, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr<PfltContext>): Ntstatus

public expect fun fltSetVolumeInformation(instance: PfltInstance, iosb: MutPtr<IoStatusBlock>, fsinformation: MutPtr<CVoid>, length: UInt, fsinformationclass: FsInformationClass): Ntstatus

public expect fun fltStartFiltering(filter: PfltFilter): Ntstatus

public expect fun fltSupportsFileContexts(fileobject: ConstPtr<FileObject>): Boolean

public expect fun fltSupportsFileContextsEx(fileobject: ConstPtr<FileObject>, instance: PfltInstance): Boolean

public expect fun fltSupportsStreamContexts(fileobject: ConstPtr<FileObject>): Boolean

public expect fun fltSupportsStreamHandleContexts(fileobject: ConstPtr<FileObject>): Boolean

public expect fun fltTagFile(initiatinginstance: PfltInstance, fileobject: ConstPtr<FileObject>, filetag: UInt, guid: ConstPtr<Guid>, databuffer: ConstPtr<CVoid>, databufferlength: UShort): Ntstatus

public expect fun fltTagFileEx(initiatinginstance: PfltInstance, fileobject: ConstPtr<FileObject>, filetag: UInt, guid: ConstPtr<Guid>, databuffer: ConstPtr<CVoid>, databufferlength: UShort, existingfiletag: UInt, existingguid: ConstPtr<Guid>, flags: UInt): Ntstatus

public expect fun fltUninitializeFileLock(filelock: ConstPtr<FileLock>)

public expect fun fltUninitializeOplock(oplock: ConstPtr<ConstPtr<CVoid>>)

public expect fun fltUnloadFilter(filtername: ConstPtr<UnicodeString>): Ntstatus

public expect fun fltUnregisterFilter(filter: PfltFilter)

public expect fun fltUntagFile(initiatinginstance: PfltInstance, fileobject: ConstPtr<FileObject>, filetag: UInt, guid: ConstPtr<Guid>): Ntstatus

public expect fun fltVetoBypassIo(callbackdata: ConstPtr<FltCallbackData>, fltobjects: ConstPtr<FltRelatedObjects>, operationstatus: Ntstatus, failurereason: ConstPtr<UnicodeString>): Ntstatus

public expect fun fltWriteFile(initiatinginstance: PfltInstance, fileobject: ConstPtr<FileObject>, byteoffset: ConstPtr<Long>, length: UInt, buffer: ConstPtr<CVoid>, flags: UInt, byteswritten: MutPtr<UInt>, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: ConstPtr<CVoid>): Ntstatus

public expect fun fltWriteFileEx(initiatinginstance: PfltInstance, fileobject: ConstPtr<FileObject>, byteoffset: ConstPtr<Long>, length: UInt, buffer: ConstPtr<CVoid>, flags: UInt, byteswritten: MutPtr<UInt>, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: ConstPtr<CVoid>, key: ConstPtr<UInt>, mdl: ConstPtr<Mdl>): Ntstatus

public expect fun fltpTraceRedirectedFileIo(originatingfileobject: ConstPtr<FileObject>, childcallbackdata: MutPtr<FltCallbackData>): Ntstatus
