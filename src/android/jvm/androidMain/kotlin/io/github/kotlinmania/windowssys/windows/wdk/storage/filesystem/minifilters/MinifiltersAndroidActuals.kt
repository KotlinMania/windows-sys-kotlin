@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object WindowsWdkStorageFilesystemMinifiltersJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltAcknowledgeEcp(filter: Long, ecpcontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltAcquirePushLockExclusive(pushlock: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltAcquirePushLockExclusiveEx(pushlock: Long, flags: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltAcquirePushLockShared(pushlock: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltAcquirePushLockSharedEx(pushlock: Long, flags: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltAcquireResourceExclusive(resource: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltAcquireResourceShared(resource: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltAddOpenReparseEntry(filter: Long, data: Long, openreparseentry: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltAdjustDeviceStackSizeForIoRedirection(sourceinstance: Long, targetinstance: Long, sourcedevicestacksizemodified: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocateCallbackData(instance: Long, fileobject: Long, retnewcallbackdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocateCallbackDataEx(instance: Long, fileobject: Long, flags: Int, retnewcallbackdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocateContext(filter: Long, contexttype: Short, contextsize: Long, pooltype: Int, returnedcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocateDeferredIoWorkItem(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocateExtraCreateParameter(filter: Long, ecptype: Long, sizeofcontext: Int, flags: Int, cleanupcallback: Long, pooltag: Int, ecpcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocateExtraCreateParameterFromLookasideList(filter: Long, ecptype: Long, sizeofcontext: Int, flags: Int, cleanupcallback: Long, lookasidelist: Long, ecpcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocateExtraCreateParameterList(filter: Long, flags: Int, ecplist: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocateFileLock(completelockcallbackdataroutine: Long, unlockroutine: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocateGenericWorkItem(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocatePoolAlignedWithTag(instance: Long, pooltype: Int, numberofbytes: Long, tag: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltApplyPriorityInfoThread(inputpriorityinfo: Long, outputpriorityinfo: Long, thread: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltAttachVolume(filter: Long, volume: Long, instancename: Long, retinstance: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltAttachVolumeAtAltitude(filter: Long, volume: Long, altitude: Long, instancename: Long, retinstance: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltBuildDefaultSecurityDescriptor(securitydescriptor: Long, desiredaccess: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltCancelFileOpen(instance: Long, fileobject: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltCancelIo(callbackdata: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltCancellableWaitForMultipleObjects(count: Int, objectarray: Long, waittype: Int, timeout: Long, waitblockarray: Long, callbackdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltCancellableWaitForSingleObject(obj: Long, timeout: Long, callbackdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltCbdqDisable(cbdq: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltCbdqEnable(cbdq: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltCbdqInitialize(instance: Long, cbdq: Long, cbdqinsertio: Long, cbdqremoveio: Long, cbdqpeeknextio: Long, cbdqacquire: Long, cbdqrelease: Long, cbdqcompletecanceledio: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltCbdqInsertIo(cbdq: Long, cbd: Long, context: Long, insertcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltCbdqRemoveIo(cbdq: Long, context: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltCbdqRemoveNextIo(cbdq: Long, peekcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltCheckAndGrowNameControl(namectrl: Long, newsize: Short): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltCheckLockForReadAccess(filelock: Long, callbackdata: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltCheckLockForWriteAccess(filelock: Long, callbackdata: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltCheckOplock(oplock: Long, callbackdata: Long, context: Long, waitcompletionroutine: Long, prepostcallbackdataroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltCheckOplockEx(oplock: Long, callbackdata: Long, flags: Int, context: Long, waitcompletionroutine: Long, prepostcallbackdataroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltClearCallbackDataDirty(data: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltClearCancelCompletion(callbackdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltClose(filehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltCloseClientPort(filter: Long, clientport: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltCloseCommunicationPort(serverport: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltCloseSectionForDataScan(sectioncontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltCommitComplete(instance: Long, transaction: Long, transactioncontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltCommitFinalizeComplete(instance: Long, transaction: Long, transactioncontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltCompareInstanceAltitudes(instance1: Long, instance2: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltCompletePendedPostOperation(callbackdata: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltCompletePendedPreOperation(callbackdata: Long, callbackstatus: Int, context: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltCopyOpenReparseList(filter: Long, data: Long, ecplist: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltCreateCommunicationPort(filter: Long, serverport: Long, objectattributes: Long, serverportcookie: Long, connectnotifycallback: Long, disconnectnotifycallback: Long, messagenotifycallback: Long, maxconnections: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltCreateFile(filter: Long, instance: Long, filehandle: Long, desiredaccess: Int, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: Int, shareaccess: Int, createdisposition: Int, createoptions: Int, eabuffer: Long, ealength: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltCreateFileEx(filter: Long, instance: Long, filehandle: Long, fileobject: Long, desiredaccess: Int, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: Int, shareaccess: Int, createdisposition: Int, createoptions: Int, eabuffer: Long, ealength: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltCreateFileEx2(filter: Long, instance: Long, filehandle: Long, fileobject: Long, desiredaccess: Int, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: Int, shareaccess: Int, createdisposition: Int, createoptions: Int, eabuffer: Long, ealength: Int, flags: Int, drivercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltCreateMailslotFile(filter: Long, instance: Long, filehandle: Long, fileobject: Long, desiredaccess: Int, objectattributes: Long, iostatusblock: Long, createoptions: Int, mailslotquota: Int, maximummessagesize: Int, readtimeout: Long, drivercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltCreateNamedPipeFile(filter: Long, instance: Long, filehandle: Long, fileobject: Long, desiredaccess: Int, objectattributes: Long, iostatusblock: Long, shareaccess: Int, createdisposition: Int, createoptions: Int, namedpipetype: Int, readmode: Int, completionmode: Int, maximuminstances: Int, inboundquota: Int, outboundquota: Int, defaulttimeout: Long, drivercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltCreateSectionForDataScan(instance: Long, fileobject: Long, sectioncontext: Long, desiredaccess: Int, objectattributes: Long, maximumsize: Long, sectionpageprotection: Int, allocationattributes: Int, flags: Int, sectionhandle: Long, sectionobject: Long, sectionfilesize: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltCreateSystemVolumeInformationFolder(instance: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltCurrentBatchOplock(oplock: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltCurrentOplock(oplock: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltCurrentOplockH(oplock: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltDecodeParameters(callbackdata: Long, mdladdresspointer: Long, buffer: Long, length: Long, desiredaccess: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltDeleteContext(context: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltDeleteExtraCreateParameterLookasideList(filter: Long, lookaside: Long, flags: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltDeleteFileContext(instance: Long, fileobject: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltDeleteInstanceContext(instance: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltDeletePushLock(pushlock: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltDeleteStreamContext(instance: Long, fileobject: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltDeleteStreamHandleContext(instance: Long, fileobject: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltDeleteTransactionContext(instance: Long, transaction: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltDeleteVolumeContext(filter: Long, volume: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltDetachVolume(filter: Long, volume: Long, instancename: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltDeviceIoControlFile(instance: Long, fileobject: Long, iocontrolcode: Int, inputbuffer: Long, inputbufferlength: Int, outputbuffer: Long, outputbufferlength: Int, lengthreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltDoCompletionProcessingWhenSafe(data: Long, fltobjects: Long, completioncontext: Long, flags: Int, safepostcallback: Long, retpostoperationstatus: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltEnlistInTransaction(instance: Long, transaction: Long, transactioncontext: Long, notificationmask: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltEnumerateFilterInformation(index: Int, informationclass: Int, buffer: Long, buffersize: Int, bytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltEnumerateFilters(filterlist: Long, filterlistsize: Int, numberfiltersreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltEnumerateInstanceInformationByDeviceObject(deviceobject: Long, index: Int, informationclass: Int, buffer: Long, buffersize: Int, bytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltEnumerateInstanceInformationByFilter(filter: Long, index: Int, informationclass: Int, buffer: Long, buffersize: Int, bytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltEnumerateInstanceInformationByVolume(volume: Long, index: Int, informationclass: Int, buffer: Long, buffersize: Int, bytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltEnumerateInstanceInformationByVolumeName(volumename: Long, index: Int, informationclass: Int, buffer: Long, buffersize: Int, bytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltEnumerateInstances(volume: Long, filter: Long, instancelist: Long, instancelistsize: Int, numberinstancesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltEnumerateVolumeInformation(filter: Long, index: Int, informationclass: Int, buffer: Long, buffersize: Int, bytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltEnumerateVolumes(filter: Long, volumelist: Long, volumelistsize: Int, numbervolumesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltFastIoMdlRead(initiatinginstance: Long, fileobject: Long, fileoffset: Long, length: Int, lockkey: Int, mdlchain: Long, iostatus: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltFastIoMdlReadComplete(initiatinginstance: Long, fileobject: Long, mdlchain: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltFastIoMdlWriteComplete(initiatinginstance: Long, fileobject: Long, fileoffset: Long, mdlchain: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltFastIoPrepareMdlWrite(initiatinginstance: Long, fileobject: Long, fileoffset: Long, length: Int, lockkey: Int, mdlchain: Long, iostatus: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltFindExtraCreateParameter(filter: Long, ecplist: Long, ecptype: Long, ecpcontext: Long, ecpcontextsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltFlushBuffers(instance: Long, fileobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltFlushBuffers2(instance: Long, fileobject: Long, flushtype: Int, callbackdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltFreeCallbackData(callbackdata: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltFreeDeferredIoWorkItem(fltworkitem: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltFreeExtraCreateParameter(filter: Long, ecpcontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltFreeExtraCreateParameterList(filter: Long, ecplist: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltFreeFileLock(filelock: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltFreeGenericWorkItem(fltworkitem: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltFreeOpenReparseList(filter: Long, ecplist: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltFreePoolAlignedWithTag(instance: Long, buffer: Long, tag: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltFreeSecurityDescriptor(securitydescriptor: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltFsControlFile(instance: Long, fileobject: Long, fscontrolcode: Int, inputbuffer: Long, inputbufferlength: Int, outputbuffer: Long, outputbufferlength: Int, lengthreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetActivityIdCallbackData(callbackdata: Long, guid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetBottomInstance(volume: Long, instance: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetContexts(fltobjects: Long, desiredcontexts: Short, contexts: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetContextsEx(fltobjects: Long, desiredcontexts: Short, contextssize: Long, contexts: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetDestinationFileNameInformation(instance: Long, fileobject: Long, rootdirectory: Long, filename: Long, filenamelength: Int, nameoptions: Int, retfilenameinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetDeviceObject(volume: Long, deviceobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetDiskDeviceObject(volume: Long, diskdeviceobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetEcpListFromCallbackData(filter: Long, callbackdata: Long, ecplist: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetFileContext(instance: Long, fileobject: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetFileNameInformation(callbackdata: Long, nameoptions: Int, filenameinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetFileNameInformationUnsafe(fileobject: Long, instance: Long, nameoptions: Int, filenameinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetFileSystemType(fltobject: Long, filesystemtype: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetFilterFromInstance(instance: Long, retfilter: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetFilterFromName(filtername: Long, retfilter: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetFilterInformation(filter: Long, informationclass: Int, buffer: Long, buffersize: Int, bytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetFsZeroingOffset(data: Long, zeroingoffset: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetInstanceContext(instance: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetInstanceInformation(instance: Long, informationclass: Int, buffer: Long, buffersize: Int, bytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetIoAttributionHandleFromCallbackData(data: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetIoPriorityHint(data: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetIoPriorityHintFromCallbackData(data: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetIoPriorityHintFromFileObject(fileobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetIoPriorityHintFromThread(thread: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetIrpName(irpmajorcode: Byte): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetLowerInstance(currentinstance: Long, lowerinstance: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetNewSystemBufferAddress(callbackdata: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetNextExtraCreateParameter(filter: Long, ecplist: Long, currentecpcontext: Long, nextecptype: Long, nextecpcontext: Long, nextecpcontextsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetRequestorProcess(callbackdata: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetRequestorProcessId(callbackdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetRequestorProcessIdEx(callbackdata: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetRequestorSessionId(callbackdata: Long, sessionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetRoutineAddress(fltmgrroutinename: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetSectionContext(instance: Long, fileobject: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetStreamContext(instance: Long, fileobject: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetStreamHandleContext(instance: Long, fileobject: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetSwappedBufferMdlAddress(callbackdata: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetTopInstance(volume: Long, instance: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetTransactionContext(instance: Long, transaction: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetTunneledName(callbackdata: Long, filenameinformation: Long, rettunneledfilenameinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetUpperInstance(currentinstance: Long, upperinstance: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeContext(filter: Long, volume: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeFromDeviceObject(filter: Long, deviceobject: Long, retvolume: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeFromFileObject(filter: Long, fileobject: Long, retvolume: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeFromInstance(instance: Long, retvolume: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeFromName(filter: Long, volumename: Long, retvolume: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeGuidName(volume: Long, volumeguidname: Long, buffersizeneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeInformation(volume: Long, informationclass: Int, buffer: Long, buffersize: Int, bytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeInstanceFromName(filter: Long, volume: Long, instancename: Long, retinstance: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeName(volume: Long, volumename: Long, buffersizeneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeProperties(volume: Long, volumeproperties: Long, volumepropertieslength: Int, lengthreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltInitExtraCreateParameterLookasideList(filter: Long, lookaside: Long, flags: Int, size: Long, tag: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltInitializeFileLock(filelock: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltInitializeOplock(oplock: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltInitializePushLock(pushlock: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltInsertExtraCreateParameter(filter: Long, ecplist: Long, ecpcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltIs32bitProcess(callbackdata: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltIsCallbackDataDirty(data: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltIsDirectory(fileobject: Long, instance: Long, isdirectory: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltIsEcpAcknowledged(filter: Long, ecpcontext: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltIsEcpFromUserMode(filter: Long, ecpcontext: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltIsFltMgrVolumeDeviceObject(deviceobject: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltIsIoCanceled(callbackdata: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltIsIoRedirectionAllowed(sourceinstance: Long, targetinstance: Long, redirectionallowed: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltIsIoRedirectionAllowedForOperation(data: Long, targetinstance: Long, redirectionallowedthisio: Long, redirectionallowedallio: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltIsOperationSynchronous(callbackdata: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltIsVolumeSnapshot(fltobject: Long, issnapshotvolume: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltIsVolumeWritable(fltobject: Long, iswritable: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltLoadFilter(filtername: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltLockUserBuffer(callbackdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltObjectDereference(fltobject: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltObjectReference(fltobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltOpenVolume(instance: Long, volumehandle: Long, volumefileobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltOplockBreakH(oplock: Long, callbackdata: Long, flags: Int, context: Long, waitcompletionroutine: Long, prepostcallbackdataroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltOplockBreakToNone(oplock: Long, callbackdata: Long, context: Long, waitcompletionroutine: Long, prepostcallbackdataroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltOplockBreakToNoneEx(oplock: Long, callbackdata: Long, flags: Int, context: Long, waitcompletionroutine: Long, prepostcallbackdataroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltOplockFsctrl(oplock: Long, callbackdata: Long, opencount: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltOplockFsctrlEx(oplock: Long, callbackdata: Long, opencount: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltOplockIsFastIoPossible(oplock: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltOplockIsSharedRequest(callbackdata: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltOplockKeysEqual(fo1: Long, fo2: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltParseFileName(filename: Long, extension: Long, stream: Long, finalcomponent: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltParseFileNameInformation(filenameinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltPerformAsynchronousIo(callbackdata: Long, callbackroutine: Long, callbackcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltPerformSynchronousIo(callbackdata: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltPrePrepareComplete(instance: Long, transaction: Long, transactioncontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltPrepareComplete(instance: Long, transaction: Long, transactioncontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltPrepareToReuseEcp(filter: Long, ecpcontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltProcessFileLock(filelock: Long, callbackdata: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltPropagateActivityIdToThread(callbackdata: Long, propagateid: Long, originalid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltPropagateIrpExtension(sourcedata: Long, targetdata: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltPurgeFileNameInformationCache(instance: Long, fileobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltQueryDirectoryFile(instance: Long, fileobject: Long, fileinformation: Long, length: Int, fileinformationclass: Int, returnsingleentry: Boolean, filename: Long, restartscan: Boolean, lengthreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltQueryDirectoryFileEx(instance: Long, fileobject: Long, fileinformation: Long, length: Int, fileinformationclass: Int, queryflags: Int, filename: Long, lengthreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltQueryEaFile(instance: Long, fileobject: Long, returnedeadata: Long, length: Int, returnsingleentry: Boolean, ealist: Long, ealistlength: Int, eaindex: Long, restartscan: Boolean, lengthreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltQueryInformationByName(filter: Long, instance: Long, objectattributes: Long, iostatusblock: Long, fileinformation: Long, length: Int, fileinformationclass: Int, drivercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltQueryInformationFile(instance: Long, fileobject: Long, fileinformation: Long, length: Int, fileinformationclass: Int, lengthreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltQueryQuotaInformationFile(instance: Long, fileobject: Long, iostatusblock: Long, buffer: Long, length: Int, returnsingleentry: Boolean, sidlist: Long, sidlistlength: Int, startsid: Long, restartscan: Boolean, lengthreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltQuerySecurityObject(instance: Long, fileobject: Long, securityinformation: Int, securitydescriptor: Long, length: Int, lengthneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltQueryVolumeInformation(instance: Long, iosb: Long, fsinformation: Long, length: Int, fsinformationclass: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltQueryVolumeInformationFile(instance: Long, fileobject: Long, fsinformation: Long, length: Int, fsinformationclass: Int, lengthreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltQueueDeferredIoWorkItem(fltworkitem: Long, data: Long, workerroutine: Long, queuetype: Int, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltQueueGenericWorkItem(fltworkitem: Long, fltobject: Long, workerroutine: Long, queuetype: Int, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltReadFile(initiatinginstance: Long, fileobject: Long, byteoffset: Long, length: Int, buffer: Long, flags: Int, bytesread: Long, callbackroutine: Long, callbackcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltReadFileEx(initiatinginstance: Long, fileobject: Long, byteoffset: Long, length: Int, buffer: Long, flags: Int, bytesread: Long, callbackroutine: Long, callbackcontext: Long, key: Long, mdl: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltReferenceContext(context: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltReferenceFileNameInformation(filenameinformation: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltRegisterFilter(driver: Long, registration: Long, retfilter: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltRegisterForDataScan(instance: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltReissueSynchronousIo(initiatinginstance: Long, callbackdata: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltReleaseContext(context: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltReleaseContexts(contexts: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltReleaseContextsEx(contextssize: Long, contexts: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltReleaseFileNameInformation(filenameinformation: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltReleasePushLock(pushlock: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltReleasePushLockEx(pushlock: Long, flags: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltReleaseResource(resource: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltRemoveExtraCreateParameter(filter: Long, ecplist: Long, ecptype: Long, ecpcontext: Long, ecpcontextsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltRemoveOpenReparseEntry(filter: Long, data: Long, openreparseentry: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltRequestFileInfoOnCreateCompletion(filter: Long, data: Long, infoclassflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltRequestOperationStatusCallback(data: Long, callbackroutine: Long, requestercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltRetainSwappedBufferMdlAddress(callbackdata: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltRetrieveFileInfoOnCreateCompletion(filter: Long, data: Long, infoclass: Int, size: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltRetrieveFileInfoOnCreateCompletionEx(filter: Long, data: Long, infoclass: Int, retinfosize: Long, retinfobuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltRetrieveIoPriorityInfo(data: Long, fileobject: Long, thread: Long, priorityinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltReuseCallbackData(callbackdata: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltRollbackComplete(instance: Long, transaction: Long, transactioncontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltRollbackEnlistment(instance: Long, transaction: Long, transactioncontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltSendMessage(filter: Long, clientport: Long, senderbuffer: Long, senderbufferlength: Int, replybuffer: Long, replylength: Long, timeout: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltSetActivityIdCallbackData(callbackdata: Long, guid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltSetCallbackDataDirty(data: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltSetCancelCompletion(callbackdata: Long, canceledcallback: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltSetEaFile(instance: Long, fileobject: Long, eabuffer: Long, length: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltSetEcpListIntoCallbackData(filter: Long, callbackdata: Long, ecplist: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltSetFileContext(instance: Long, fileobject: Long, operation: Int, newcontext: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltSetFsZeroingOffset(data: Long, zeroingoffset: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltSetFsZeroingOffsetRequired(data: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltSetInformationFile(instance: Long, fileobject: Long, fileinformation: Long, length: Int, fileinformationclass: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltSetInstanceContext(instance: Long, operation: Int, newcontext: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltSetIoPriorityHintIntoCallbackData(data: Long, priorityhint: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltSetIoPriorityHintIntoFileObject(fileobject: Long, priorityhint: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltSetIoPriorityHintIntoThread(thread: Long, priorityhint: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltSetQuotaInformationFile(instance: Long, fileobject: Long, buffer: Long, length: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltSetSecurityObject(instance: Long, fileobject: Long, securityinformation: Int, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltSetStreamContext(instance: Long, fileobject: Long, operation: Int, newcontext: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltSetStreamHandleContext(instance: Long, fileobject: Long, operation: Int, newcontext: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltSetTransactionContext(instance: Long, transaction: Long, operation: Int, newcontext: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltSetVolumeContext(volume: Long, operation: Int, newcontext: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltSetVolumeInformation(instance: Long, iosb: Long, fsinformation: Long, length: Int, fsinformationclass: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltStartFiltering(filter: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltSupportsFileContexts(fileobject: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltSupportsFileContextsEx(fileobject: Long, instance: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltSupportsStreamContexts(fileobject: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltSupportsStreamHandleContexts(fileobject: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltTagFile(initiatinginstance: Long, fileobject: Long, filetag: Int, guid: Long, databuffer: Long, databufferlength: Short): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltTagFileEx(initiatinginstance: Long, fileobject: Long, filetag: Int, guid: Long, databuffer: Long, databufferlength: Short, existingfiletag: Int, existingguid: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltUninitializeFileLock(filelock: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltUninitializeOplock(oplock: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltUnloadFilter(filtername: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltUnregisterFilter(filter: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltUntagFile(initiatinginstance: Long, fileobject: Long, filetag: Int, guid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltVetoBypassIo(callbackdata: Long, fltobjects: Long, operationstatus: Int, failurereason: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltWriteFile(initiatinginstance: Long, fileobject: Long, byteoffset: Long, length: Int, buffer: Long, flags: Int, byteswritten: Long, callbackroutine: Long, callbackcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltWriteFileEx(initiatinginstance: Long, fileobject: Long, byteoffset: Long, length: Int, buffer: Long, flags: Int, byteswritten: Long, callbackroutine: Long, callbackcontext: Long, key: Long, mdl: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_fltpTraceRedirectedFileIo(originatingfileobject: Long, childcallbackdata: Long): Int
}

public actual fun fltAcknowledgeEcp(filter: PfltFilter, ecpcontext: COpaquePointer?) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltAcknowledgeEcp(filter, (ecpcontext?.value ?: 0L))
}

public actual fun fltAcquirePushLockExclusive(pushlock: COpaquePointer?) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltAcquirePushLockExclusive((pushlock?.value ?: 0L))
}

public actual fun fltAcquirePushLockExclusiveEx(pushlock: COpaquePointer?, flags: UInt) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltAcquirePushLockExclusiveEx((pushlock?.value ?: 0L), flags.toInt())
}

public actual fun fltAcquirePushLockShared(pushlock: COpaquePointer?) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltAcquirePushLockShared((pushlock?.value ?: 0L))
}

public actual fun fltAcquirePushLockSharedEx(pushlock: COpaquePointer?, flags: UInt) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltAcquirePushLockSharedEx((pushlock?.value ?: 0L), flags.toInt())
}

public actual fun fltAcquireResourceExclusive(resource: COpaquePointer?) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltAcquireResourceExclusive((resource?.value ?: 0L))
}

public actual fun fltAcquireResourceShared(resource: COpaquePointer?) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltAcquireResourceShared((resource?.value ?: 0L))
}

public actual fun fltAddOpenReparseEntry(filter: PfltFilter, data: COpaquePointer?, openreparseentry: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltAddOpenReparseEntry(filter, (data?.value ?: 0L), (openreparseentry?.value ?: 0L))

public actual fun fltAdjustDeviceStackSizeForIoRedirection(sourceinstance: PfltInstance, targetinstance: PfltInstance, sourcedevicestacksizemodified: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltAdjustDeviceStackSizeForIoRedirection(sourceinstance, targetinstance, (sourcedevicestacksizemodified?.value ?: 0L))

public actual fun fltAllocateCallbackData(instance: PfltInstance, fileobject: COpaquePointer?, retnewcallbackdata: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocateCallbackData(instance, (fileobject?.value ?: 0L), (retnewcallbackdata?.value ?: 0L))

public actual fun fltAllocateCallbackDataEx(instance: PfltInstance, fileobject: COpaquePointer?, flags: UInt, retnewcallbackdata: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocateCallbackDataEx(instance, (fileobject?.value ?: 0L), flags.toInt(), (retnewcallbackdata?.value ?: 0L))

public actual fun fltAllocateContext(filter: PfltFilter, contexttype: UShort, contextsize: ULong, pooltype: PoolType, returnedcontext: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocateContext(filter, contexttype.toShort(), contextsize.toLong(), pooltype, (returnedcontext?.value ?: 0L))

public actual fun fltAllocateDeferredIoWorkItem(): PfltDeferredIoWorkitem =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocateDeferredIoWorkItem()

public actual fun fltAllocateExtraCreateParameter(filter: PfltFilter, ecptype: COpaquePointer?, sizeofcontext: UInt, flags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, pooltag: UInt, ecpcontext: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocateExtraCreateParameter(filter, (ecptype?.value ?: 0L), sizeofcontext.toInt(), flags.toInt(), 0L, pooltag.toInt(), (ecpcontext?.value ?: 0L))

public actual fun fltAllocateExtraCreateParameterFromLookasideList(filter: PfltFilter, ecptype: COpaquePointer?, sizeofcontext: UInt, flags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, lookasidelist: COpaquePointer?, ecpcontext: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocateExtraCreateParameterFromLookasideList(filter, (ecptype?.value ?: 0L), sizeofcontext.toInt(), flags.toInt(), 0L, (lookasidelist?.value ?: 0L), (ecpcontext?.value ?: 0L))

public actual fun fltAllocateExtraCreateParameterList(filter: PfltFilter, flags: UInt, ecplist: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocateExtraCreateParameterList(filter, flags.toInt(), (ecplist?.value ?: 0L))

public actual fun fltAllocateFileLock(completelockcallbackdataroutine: PfltCompleteLockCallbackDataRoutine, unlockroutine: PunlockRoutine): COpaquePointer? =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocateFileLock(0L, 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fltAllocateGenericWorkItem(): PfltGenericWorkitem =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocateGenericWorkItem()

public actual fun fltAllocatePoolAlignedWithTag(instance: PfltInstance, pooltype: PoolType, numberofbytes: ULong, tag: UInt): COpaquePointer? =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltAllocatePoolAlignedWithTag(instance, pooltype, numberofbytes.toLong(), tag.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fltApplyPriorityInfoThread(inputpriorityinfo: COpaquePointer?, outputpriorityinfo: COpaquePointer?, thread: Pethread): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltApplyPriorityInfoThread((inputpriorityinfo?.value ?: 0L), (outputpriorityinfo?.value ?: 0L), thread)

public actual fun fltAttachVolume(filter: PfltFilter, volume: PfltVolume, instancename: COpaquePointer?, retinstance: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltAttachVolume(filter, volume, (instancename?.value ?: 0L), (retinstance?.value ?: 0L))

public actual fun fltAttachVolumeAtAltitude(filter: PfltFilter, volume: PfltVolume, altitude: COpaquePointer?, instancename: COpaquePointer?, retinstance: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltAttachVolumeAtAltitude(filter, volume, (altitude?.value ?: 0L), (instancename?.value ?: 0L), (retinstance?.value ?: 0L))

public actual fun fltBuildDefaultSecurityDescriptor(securitydescriptor: COpaquePointer?, desiredaccess: UInt): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltBuildDefaultSecurityDescriptor((securitydescriptor?.value ?: 0L), desiredaccess.toInt())

public actual fun fltCancelFileOpen(instance: PfltInstance, fileobject: COpaquePointer?) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltCancelFileOpen(instance, (fileobject?.value ?: 0L))
}

public actual fun fltCancelIo(callbackdata: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltCancelIo((callbackdata?.value ?: 0L))

public actual fun fltCancellableWaitForMultipleObjects(count: UInt, objectarray: COpaquePointer?, waittype: WaitType, timeout: COpaquePointer?, waitblockarray: COpaquePointer?, callbackdata: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltCancellableWaitForMultipleObjects(count.toInt(), (objectarray?.value ?: 0L), waittype, (timeout?.value ?: 0L), (waitblockarray?.value ?: 0L), (callbackdata?.value ?: 0L))

public actual fun fltCancellableWaitForSingleObject(obj: COpaquePointer?, timeout: COpaquePointer?, callbackdata: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltCancellableWaitForSingleObject((obj?.value ?: 0L), (timeout?.value ?: 0L), (callbackdata?.value ?: 0L))

public actual fun fltCbdqDisable(cbdq: COpaquePointer?) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltCbdqDisable((cbdq?.value ?: 0L))
}

public actual fun fltCbdqEnable(cbdq: COpaquePointer?) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltCbdqEnable((cbdq?.value ?: 0L))
}

public actual fun fltCbdqInitialize(instance: PfltInstance, cbdq: COpaquePointer?, cbdqinsertio: PfltCallbackDataQueueInsertIo, cbdqremoveio: PfltCallbackDataQueueRemoveIo, cbdqpeeknextio: PfltCallbackDataQueuePeekNextIo, cbdqacquire: PfltCallbackDataQueueAcquire, cbdqrelease: PfltCallbackDataQueueRelease, cbdqcompletecanceledio: PfltCallbackDataQueueCompleteCanceledIo): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltCbdqInitialize(instance, (cbdq?.value ?: 0L), 0L, 0L, 0L, 0L, 0L, 0L)

public actual fun fltCbdqInsertIo(cbdq: COpaquePointer?, cbd: COpaquePointer?, context: COpaquePointer?, insertcontext: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltCbdqInsertIo((cbdq?.value ?: 0L), (cbd?.value ?: 0L), (context?.value ?: 0L), (insertcontext?.value ?: 0L))

public actual fun fltCbdqRemoveIo(cbdq: COpaquePointer?, context: COpaquePointer?): COpaquePointer? =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltCbdqRemoveIo((cbdq?.value ?: 0L), (context?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fltCbdqRemoveNextIo(cbdq: COpaquePointer?, peekcontext: COpaquePointer?): COpaquePointer? =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltCbdqRemoveNextIo((cbdq?.value ?: 0L), (peekcontext?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fltCheckAndGrowNameControl(namectrl: COpaquePointer?, newsize: UShort): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltCheckAndGrowNameControl((namectrl?.value ?: 0L), newsize.toShort())

public actual fun fltCheckLockForReadAccess(filelock: COpaquePointer?, callbackdata: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltCheckLockForReadAccess((filelock?.value ?: 0L), (callbackdata?.value ?: 0L))

public actual fun fltCheckLockForWriteAccess(filelock: COpaquePointer?, callbackdata: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltCheckLockForWriteAccess((filelock?.value ?: 0L), (callbackdata?.value ?: 0L))

public actual fun fltCheckOplock(oplock: COpaquePointer?, callbackdata: COpaquePointer?, context: COpaquePointer?, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltCheckOplock((oplock?.value ?: 0L), (callbackdata?.value ?: 0L), (context?.value ?: 0L), 0L, 0L)

public actual fun fltCheckOplockEx(oplock: COpaquePointer?, callbackdata: COpaquePointer?, flags: UInt, context: COpaquePointer?, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltCheckOplockEx((oplock?.value ?: 0L), (callbackdata?.value ?: 0L), flags.toInt(), (context?.value ?: 0L), 0L, 0L)

public actual fun fltClearCallbackDataDirty(data: COpaquePointer?) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltClearCallbackDataDirty((data?.value ?: 0L))
}

public actual fun fltClearCancelCompletion(callbackdata: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltClearCancelCompletion((callbackdata?.value ?: 0L))

public actual fun fltClose(filehandle: Handle): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltClose((filehandle?.value ?: 0L))

public actual fun fltCloseClientPort(filter: PfltFilter, clientport: COpaquePointer?) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltCloseClientPort(filter, (clientport?.value ?: 0L))
}

public actual fun fltCloseCommunicationPort(serverport: PfltPort) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltCloseCommunicationPort(serverport)
}

public actual fun fltCloseSectionForDataScan(sectioncontext: PfltContext): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltCloseSectionForDataScan((sectioncontext?.value ?: 0L))

public actual fun fltCommitComplete(instance: PfltInstance, transaction: COpaquePointer?, transactioncontext: PfltContext): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltCommitComplete(instance, (transaction?.value ?: 0L), (transactioncontext?.value ?: 0L))

public actual fun fltCommitFinalizeComplete(instance: PfltInstance, transaction: COpaquePointer?, transactioncontext: PfltContext): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltCommitFinalizeComplete(instance, (transaction?.value ?: 0L), (transactioncontext?.value ?: 0L))

public actual fun fltCompareInstanceAltitudes(instance1: PfltInstance, instance2: PfltInstance): Int =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltCompareInstanceAltitudes(instance1, instance2)

public actual fun fltCompletePendedPostOperation(callbackdata: COpaquePointer?) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltCompletePendedPostOperation((callbackdata?.value ?: 0L))
}

public actual fun fltCompletePendedPreOperation(callbackdata: COpaquePointer?, callbackstatus: FltPreopCallbackStatus, context: COpaquePointer?) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltCompletePendedPreOperation((callbackdata?.value ?: 0L), callbackstatus, (context?.value ?: 0L))
}

public actual fun fltCopyOpenReparseList(filter: PfltFilter, data: COpaquePointer?, ecplist: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltCopyOpenReparseList(filter, (data?.value ?: 0L), (ecplist?.value ?: 0L))

public actual fun fltCreateCommunicationPort(filter: PfltFilter, serverport: COpaquePointer?, objectattributes: COpaquePointer?, serverportcookie: COpaquePointer?, connectnotifycallback: PfltConnectNotify, disconnectnotifycallback: PfltDisconnectNotify, messagenotifycallback: PfltMessageNotify, maxconnections: Int): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltCreateCommunicationPort(filter, (serverport?.value ?: 0L), (objectattributes?.value ?: 0L), (serverportcookie?.value ?: 0L), 0L, 0L, 0L, maxconnections)

public actual fun fltCreateFile(filter: PfltFilter, instance: PfltInstance, filehandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, allocationsize: COpaquePointer?, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: COpaquePointer?, ealength: UInt, flags: UInt): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltCreateFile(filter, instance, (filehandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), (iostatusblock?.value ?: 0L), (allocationsize?.value ?: 0L), fileattributes.toInt(), shareaccess.toInt(), createdisposition.toInt(), createoptions.toInt(), (eabuffer?.value ?: 0L), ealength.toInt(), flags.toInt())

public actual fun fltCreateFileEx(filter: PfltFilter, instance: PfltInstance, filehandle: COpaquePointer?, fileobject: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, allocationsize: COpaquePointer?, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: COpaquePointer?, ealength: UInt, flags: UInt): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltCreateFileEx(filter, instance, (filehandle?.value ?: 0L), (fileobject?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), (iostatusblock?.value ?: 0L), (allocationsize?.value ?: 0L), fileattributes.toInt(), shareaccess.toInt(), createdisposition.toInt(), createoptions.toInt(), (eabuffer?.value ?: 0L), ealength.toInt(), flags.toInt())

public actual fun fltCreateFileEx2(filter: PfltFilter, instance: PfltInstance, filehandle: COpaquePointer?, fileobject: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, allocationsize: COpaquePointer?, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: COpaquePointer?, ealength: UInt, flags: UInt, drivercontext: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltCreateFileEx2(filter, instance, (filehandle?.value ?: 0L), (fileobject?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), (iostatusblock?.value ?: 0L), (allocationsize?.value ?: 0L), fileattributes.toInt(), shareaccess.toInt(), createdisposition.toInt(), createoptions.toInt(), (eabuffer?.value ?: 0L), ealength.toInt(), flags.toInt(), (drivercontext?.value ?: 0L))

public actual fun fltCreateMailslotFile(filter: PfltFilter, instance: PfltInstance, filehandle: COpaquePointer?, fileobject: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, createoptions: UInt, mailslotquota: UInt, maximummessagesize: UInt, readtimeout: COpaquePointer?, drivercontext: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltCreateMailslotFile(filter, instance, (filehandle?.value ?: 0L), (fileobject?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), (iostatusblock?.value ?: 0L), createoptions.toInt(), mailslotquota.toInt(), maximummessagesize.toInt(), (readtimeout?.value ?: 0L), (drivercontext?.value ?: 0L))

public actual fun fltCreateNamedPipeFile(filter: PfltFilter, instance: PfltInstance, filehandle: COpaquePointer?, fileobject: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, namedpipetype: UInt, readmode: UInt, completionmode: UInt, maximuminstances: UInt, inboundquota: UInt, outboundquota: UInt, defaulttimeout: COpaquePointer?, drivercontext: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltCreateNamedPipeFile(filter, instance, (filehandle?.value ?: 0L), (fileobject?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), (iostatusblock?.value ?: 0L), shareaccess.toInt(), createdisposition.toInt(), createoptions.toInt(), namedpipetype.toInt(), readmode.toInt(), completionmode.toInt(), maximuminstances.toInt(), inboundquota.toInt(), outboundquota.toInt(), (defaulttimeout?.value ?: 0L), (drivercontext?.value ?: 0L))

public actual fun fltCreateSectionForDataScan(instance: PfltInstance, fileobject: COpaquePointer?, sectioncontext: PfltContext, desiredaccess: UInt, objectattributes: COpaquePointer?, maximumsize: COpaquePointer?, sectionpageprotection: UInt, allocationattributes: UInt, flags: UInt, sectionhandle: COpaquePointer?, sectionobject: COpaquePointer?, sectionfilesize: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltCreateSectionForDataScan(instance, (fileobject?.value ?: 0L), (sectioncontext?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), (maximumsize?.value ?: 0L), sectionpageprotection.toInt(), allocationattributes.toInt(), flags.toInt(), (sectionhandle?.value ?: 0L), (sectionobject?.value ?: 0L), (sectionfilesize?.value ?: 0L))

public actual fun fltCreateSystemVolumeInformationFolder(instance: PfltInstance): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltCreateSystemVolumeInformationFolder(instance)

public actual fun fltCurrentBatchOplock(oplock: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltCurrentBatchOplock((oplock?.value ?: 0L))

public actual fun fltCurrentOplock(oplock: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltCurrentOplock((oplock?.value ?: 0L))

public actual fun fltCurrentOplockH(oplock: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltCurrentOplockH((oplock?.value ?: 0L))

public actual fun fltDecodeParameters(callbackdata: COpaquePointer?, mdladdresspointer: COpaquePointer?, buffer: COpaquePointer?, length: COpaquePointer?, desiredaccess: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltDecodeParameters((callbackdata?.value ?: 0L), (mdladdresspointer?.value ?: 0L), (buffer?.value ?: 0L), (length?.value ?: 0L), (desiredaccess?.value ?: 0L))

public actual fun fltDeleteContext(context: PfltContext) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltDeleteContext((context?.value ?: 0L))
}

public actual fun fltDeleteExtraCreateParameterLookasideList(filter: PfltFilter, lookaside: COpaquePointer?, flags: UInt) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltDeleteExtraCreateParameterLookasideList(filter, (lookaside?.value ?: 0L), flags.toInt())
}

public actual fun fltDeleteFileContext(instance: PfltInstance, fileobject: COpaquePointer?, oldcontext: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltDeleteFileContext(instance, (fileobject?.value ?: 0L), (oldcontext?.value ?: 0L))

public actual fun fltDeleteInstanceContext(instance: PfltInstance, oldcontext: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltDeleteInstanceContext(instance, (oldcontext?.value ?: 0L))

public actual fun fltDeletePushLock(pushlock: COpaquePointer?) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltDeletePushLock((pushlock?.value ?: 0L))
}

public actual fun fltDeleteStreamContext(instance: PfltInstance, fileobject: COpaquePointer?, oldcontext: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltDeleteStreamContext(instance, (fileobject?.value ?: 0L), (oldcontext?.value ?: 0L))

public actual fun fltDeleteStreamHandleContext(instance: PfltInstance, fileobject: COpaquePointer?, oldcontext: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltDeleteStreamHandleContext(instance, (fileobject?.value ?: 0L), (oldcontext?.value ?: 0L))

public actual fun fltDeleteTransactionContext(instance: PfltInstance, transaction: COpaquePointer?, oldcontext: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltDeleteTransactionContext(instance, (transaction?.value ?: 0L), (oldcontext?.value ?: 0L))

public actual fun fltDeleteVolumeContext(filter: PfltFilter, volume: PfltVolume, oldcontext: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltDeleteVolumeContext(filter, volume, (oldcontext?.value ?: 0L))

public actual fun fltDetachVolume(filter: PfltFilter, volume: PfltVolume, instancename: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltDetachVolume(filter, volume, (instancename?.value ?: 0L))

public actual fun fltDeviceIoControlFile(instance: PfltInstance, fileobject: COpaquePointer?, iocontrolcode: UInt, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt, lengthreturned: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltDeviceIoControlFile(instance, (fileobject?.value ?: 0L), iocontrolcode.toInt(), (inputbuffer?.value ?: 0L), inputbufferlength.toInt(), (outputbuffer?.value ?: 0L), outputbufferlength.toInt(), (lengthreturned?.value ?: 0L))

public actual fun fltDoCompletionProcessingWhenSafe(data: COpaquePointer?, fltobjects: COpaquePointer?, completioncontext: COpaquePointer?, flags: UInt, safepostcallback: PfltPostOperationCallback, retpostoperationstatus: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltDoCompletionProcessingWhenSafe((data?.value ?: 0L), (fltobjects?.value ?: 0L), (completioncontext?.value ?: 0L), flags.toInt(), 0L, (retpostoperationstatus?.value ?: 0L))

public actual fun fltEnlistInTransaction(instance: PfltInstance, transaction: COpaquePointer?, transactioncontext: PfltContext, notificationmask: UInt): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltEnlistInTransaction(instance, (transaction?.value ?: 0L), (transactioncontext?.value ?: 0L), notificationmask.toInt())

public actual fun fltEnumerateFilterInformation(index: UInt, informationclass: FilterInformationClass, buffer: COpaquePointer?, buffersize: UInt, bytesreturned: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltEnumerateFilterInformation(index.toInt(), informationclass, (buffer?.value ?: 0L), buffersize.toInt(), (bytesreturned?.value ?: 0L))

public actual fun fltEnumerateFilters(filterlist: COpaquePointer?, filterlistsize: UInt, numberfiltersreturned: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltEnumerateFilters((filterlist?.value ?: 0L), filterlistsize.toInt(), (numberfiltersreturned?.value ?: 0L))

public actual fun fltEnumerateInstanceInformationByDeviceObject(deviceobject: COpaquePointer?, index: UInt, informationclass: InstanceInformationClass, buffer: COpaquePointer?, buffersize: UInt, bytesreturned: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltEnumerateInstanceInformationByDeviceObject((deviceobject?.value ?: 0L), index.toInt(), informationclass, (buffer?.value ?: 0L), buffersize.toInt(), (bytesreturned?.value ?: 0L))

public actual fun fltEnumerateInstanceInformationByFilter(filter: PfltFilter, index: UInt, informationclass: InstanceInformationClass, buffer: COpaquePointer?, buffersize: UInt, bytesreturned: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltEnumerateInstanceInformationByFilter(filter, index.toInt(), informationclass, (buffer?.value ?: 0L), buffersize.toInt(), (bytesreturned?.value ?: 0L))

public actual fun fltEnumerateInstanceInformationByVolume(volume: PfltVolume, index: UInt, informationclass: InstanceInformationClass, buffer: COpaquePointer?, buffersize: UInt, bytesreturned: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltEnumerateInstanceInformationByVolume(volume, index.toInt(), informationclass, (buffer?.value ?: 0L), buffersize.toInt(), (bytesreturned?.value ?: 0L))

public actual fun fltEnumerateInstanceInformationByVolumeName(volumename: COpaquePointer?, index: UInt, informationclass: InstanceInformationClass, buffer: COpaquePointer?, buffersize: UInt, bytesreturned: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltEnumerateInstanceInformationByVolumeName((volumename?.value ?: 0L), index.toInt(), informationclass, (buffer?.value ?: 0L), buffersize.toInt(), (bytesreturned?.value ?: 0L))

public actual fun fltEnumerateInstances(volume: PfltVolume, filter: PfltFilter, instancelist: COpaquePointer?, instancelistsize: UInt, numberinstancesreturned: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltEnumerateInstances(volume, filter, (instancelist?.value ?: 0L), instancelistsize.toInt(), (numberinstancesreturned?.value ?: 0L))

public actual fun fltEnumerateVolumeInformation(filter: PfltFilter, index: UInt, informationclass: FilterVolumeInformationClass, buffer: COpaquePointer?, buffersize: UInt, bytesreturned: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltEnumerateVolumeInformation(filter, index.toInt(), informationclass, (buffer?.value ?: 0L), buffersize.toInt(), (bytesreturned?.value ?: 0L))

public actual fun fltEnumerateVolumes(filter: PfltFilter, volumelist: COpaquePointer?, volumelistsize: UInt, numbervolumesreturned: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltEnumerateVolumes(filter, (volumelist?.value ?: 0L), volumelistsize.toInt(), (numbervolumesreturned?.value ?: 0L))

public actual fun fltFastIoMdlRead(initiatinginstance: PfltInstance, fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, lockkey: UInt, mdlchain: COpaquePointer?, iostatus: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltFastIoMdlRead(initiatinginstance, (fileobject?.value ?: 0L), (fileoffset?.value ?: 0L), length.toInt(), lockkey.toInt(), (mdlchain?.value ?: 0L), (iostatus?.value ?: 0L))

public actual fun fltFastIoMdlReadComplete(initiatinginstance: PfltInstance, fileobject: COpaquePointer?, mdlchain: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltFastIoMdlReadComplete(initiatinginstance, (fileobject?.value ?: 0L), (mdlchain?.value ?: 0L))

public actual fun fltFastIoMdlWriteComplete(initiatinginstance: PfltInstance, fileobject: COpaquePointer?, fileoffset: COpaquePointer?, mdlchain: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltFastIoMdlWriteComplete(initiatinginstance, (fileobject?.value ?: 0L), (fileoffset?.value ?: 0L), (mdlchain?.value ?: 0L))

public actual fun fltFastIoPrepareMdlWrite(initiatinginstance: PfltInstance, fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, lockkey: UInt, mdlchain: COpaquePointer?, iostatus: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltFastIoPrepareMdlWrite(initiatinginstance, (fileobject?.value ?: 0L), (fileoffset?.value ?: 0L), length.toInt(), lockkey.toInt(), (mdlchain?.value ?: 0L), (iostatus?.value ?: 0L))

public actual fun fltFindExtraCreateParameter(filter: PfltFilter, ecplist: COpaquePointer?, ecptype: COpaquePointer?, ecpcontext: COpaquePointer?, ecpcontextsize: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltFindExtraCreateParameter(filter, (ecplist?.value ?: 0L), (ecptype?.value ?: 0L), (ecpcontext?.value ?: 0L), (ecpcontextsize?.value ?: 0L))

public actual fun fltFlushBuffers(instance: PfltInstance, fileobject: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltFlushBuffers(instance, (fileobject?.value ?: 0L))

public actual fun fltFlushBuffers2(instance: PfltInstance, fileobject: COpaquePointer?, flushtype: UInt, callbackdata: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltFlushBuffers2(instance, (fileobject?.value ?: 0L), flushtype.toInt(), (callbackdata?.value ?: 0L))

public actual fun fltFreeCallbackData(callbackdata: COpaquePointer?) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltFreeCallbackData((callbackdata?.value ?: 0L))
}

public actual fun fltFreeDeferredIoWorkItem(fltworkitem: PfltDeferredIoWorkitem) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltFreeDeferredIoWorkItem(fltworkitem)
}

public actual fun fltFreeExtraCreateParameter(filter: PfltFilter, ecpcontext: COpaquePointer?) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltFreeExtraCreateParameter(filter, (ecpcontext?.value ?: 0L))
}

public actual fun fltFreeExtraCreateParameterList(filter: PfltFilter, ecplist: COpaquePointer?) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltFreeExtraCreateParameterList(filter, (ecplist?.value ?: 0L))
}

public actual fun fltFreeFileLock(filelock: COpaquePointer?) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltFreeFileLock((filelock?.value ?: 0L))
}

public actual fun fltFreeGenericWorkItem(fltworkitem: PfltGenericWorkitem) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltFreeGenericWorkItem(fltworkitem)
}

public actual fun fltFreeOpenReparseList(filter: PfltFilter, ecplist: COpaquePointer?) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltFreeOpenReparseList(filter, (ecplist?.value ?: 0L))
}

public actual fun fltFreePoolAlignedWithTag(instance: PfltInstance, buffer: COpaquePointer?, tag: UInt) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltFreePoolAlignedWithTag(instance, (buffer?.value ?: 0L), tag.toInt())
}

public actual fun fltFreeSecurityDescriptor(securitydescriptor: PsecurityDescriptor) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltFreeSecurityDescriptor((securitydescriptor?.value ?: 0L))
}

public actual fun fltFsControlFile(instance: PfltInstance, fileobject: COpaquePointer?, fscontrolcode: UInt, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt, lengthreturned: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltFsControlFile(instance, (fileobject?.value ?: 0L), fscontrolcode.toInt(), (inputbuffer?.value ?: 0L), inputbufferlength.toInt(), (outputbuffer?.value ?: 0L), outputbufferlength.toInt(), (lengthreturned?.value ?: 0L))

public actual fun fltGetActivityIdCallbackData(callbackdata: COpaquePointer?, guid: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetActivityIdCallbackData((callbackdata?.value ?: 0L), (guid?.value ?: 0L))

public actual fun fltGetBottomInstance(volume: PfltVolume, instance: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetBottomInstance(volume, (instance?.value ?: 0L))

public actual fun fltGetContexts(fltobjects: COpaquePointer?, desiredcontexts: UShort, contexts: COpaquePointer?) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetContexts((fltobjects?.value ?: 0L), desiredcontexts.toShort(), (contexts?.value ?: 0L))
}

public actual fun fltGetContextsEx(fltobjects: COpaquePointer?, desiredcontexts: UShort, contextssize: ULong, contexts: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetContextsEx((fltobjects?.value ?: 0L), desiredcontexts.toShort(), contextssize.toLong(), (contexts?.value ?: 0L))

public actual fun fltGetDestinationFileNameInformation(instance: PfltInstance, fileobject: COpaquePointer?, rootdirectory: Handle, filename: Pcwstr, filenamelength: UInt, nameoptions: UInt, retfilenameinformation: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetDestinationFileNameInformation(instance, (fileobject?.value ?: 0L), (rootdirectory?.value ?: 0L), (filename?.value ?: 0L), filenamelength.toInt(), nameoptions.toInt(), (retfilenameinformation?.value ?: 0L))

public actual fun fltGetDeviceObject(volume: PfltVolume, deviceobject: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetDeviceObject(volume, (deviceobject?.value ?: 0L))

public actual fun fltGetDiskDeviceObject(volume: PfltVolume, diskdeviceobject: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetDiskDeviceObject(volume, (diskdeviceobject?.value ?: 0L))

public actual fun fltGetEcpListFromCallbackData(filter: PfltFilter, callbackdata: COpaquePointer?, ecplist: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetEcpListFromCallbackData(filter, (callbackdata?.value ?: 0L), (ecplist?.value ?: 0L))

public actual fun fltGetFileContext(instance: PfltInstance, fileobject: COpaquePointer?, context: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetFileContext(instance, (fileobject?.value ?: 0L), (context?.value ?: 0L))

public actual fun fltGetFileNameInformation(callbackdata: COpaquePointer?, nameoptions: UInt, filenameinformation: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetFileNameInformation((callbackdata?.value ?: 0L), nameoptions.toInt(), (filenameinformation?.value ?: 0L))

public actual fun fltGetFileNameInformationUnsafe(fileobject: COpaquePointer?, instance: PfltInstance, nameoptions: UInt, filenameinformation: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetFileNameInformationUnsafe((fileobject?.value ?: 0L), instance, nameoptions.toInt(), (filenameinformation?.value ?: 0L))

public actual fun fltGetFileSystemType(fltobject: COpaquePointer?, filesystemtype: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetFileSystemType((fltobject?.value ?: 0L), (filesystemtype?.value ?: 0L))

public actual fun fltGetFilterFromInstance(instance: PfltInstance, retfilter: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetFilterFromInstance(instance, (retfilter?.value ?: 0L))

public actual fun fltGetFilterFromName(filtername: COpaquePointer?, retfilter: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetFilterFromName((filtername?.value ?: 0L), (retfilter?.value ?: 0L))

public actual fun fltGetFilterInformation(filter: PfltFilter, informationclass: FilterInformationClass, buffer: COpaquePointer?, buffersize: UInt, bytesreturned: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetFilterInformation(filter, informationclass, (buffer?.value ?: 0L), buffersize.toInt(), (bytesreturned?.value ?: 0L))

public actual fun fltGetFsZeroingOffset(data: COpaquePointer?, zeroingoffset: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetFsZeroingOffset((data?.value ?: 0L), (zeroingoffset?.value ?: 0L))

public actual fun fltGetInstanceContext(instance: PfltInstance, context: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetInstanceContext(instance, (context?.value ?: 0L))

public actual fun fltGetInstanceInformation(instance: PfltInstance, informationclass: InstanceInformationClass, buffer: COpaquePointer?, buffersize: UInt, bytesreturned: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetInstanceInformation(instance, informationclass, (buffer?.value ?: 0L), buffersize.toInt(), (bytesreturned?.value ?: 0L))

public actual fun fltGetIoAttributionHandleFromCallbackData(data: COpaquePointer?): COpaquePointer? =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetIoAttributionHandleFromCallbackData((data?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fltGetIoPriorityHint(data: COpaquePointer?): IoPriorityHint =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetIoPriorityHint((data?.value ?: 0L))

public actual fun fltGetIoPriorityHintFromCallbackData(data: COpaquePointer?): IoPriorityHint =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetIoPriorityHintFromCallbackData((data?.value ?: 0L))

public actual fun fltGetIoPriorityHintFromFileObject(fileobject: COpaquePointer?): IoPriorityHint =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetIoPriorityHintFromFileObject((fileobject?.value ?: 0L))

public actual fun fltGetIoPriorityHintFromThread(thread: Pethread): IoPriorityHint =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetIoPriorityHintFromThread(thread)

public actual fun fltGetIrpName(irpmajorcode: UByte): Pstr =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetIrpName(irpmajorcode.toByte()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fltGetLowerInstance(currentinstance: PfltInstance, lowerinstance: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetLowerInstance(currentinstance, (lowerinstance?.value ?: 0L))

public actual fun fltGetNewSystemBufferAddress(callbackdata: COpaquePointer?): COpaquePointer? =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetNewSystemBufferAddress((callbackdata?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fltGetNextExtraCreateParameter(filter: PfltFilter, ecplist: COpaquePointer?, currentecpcontext: COpaquePointer?, nextecptype: COpaquePointer?, nextecpcontext: COpaquePointer?, nextecpcontextsize: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetNextExtraCreateParameter(filter, (ecplist?.value ?: 0L), (currentecpcontext?.value ?: 0L), (nextecptype?.value ?: 0L), (nextecpcontext?.value ?: 0L), (nextecpcontextsize?.value ?: 0L))

public actual fun fltGetRequestorProcess(callbackdata: COpaquePointer?): Peprocess =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetRequestorProcess((callbackdata?.value ?: 0L))

public actual fun fltGetRequestorProcessId(callbackdata: COpaquePointer?): UInt =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetRequestorProcessId((callbackdata?.value ?: 0L)).toUInt()

public actual fun fltGetRequestorProcessIdEx(callbackdata: COpaquePointer?): Handle =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetRequestorProcessIdEx((callbackdata?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fltGetRequestorSessionId(callbackdata: COpaquePointer?, sessionid: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetRequestorSessionId((callbackdata?.value ?: 0L), (sessionid?.value ?: 0L))

public actual fun fltGetRoutineAddress(fltmgrroutinename: Pcstr): COpaquePointer? =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetRoutineAddress((fltmgrroutinename?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fltGetSectionContext(instance: PfltInstance, fileobject: COpaquePointer?, context: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetSectionContext(instance, (fileobject?.value ?: 0L), (context?.value ?: 0L))

public actual fun fltGetStreamContext(instance: PfltInstance, fileobject: COpaquePointer?, context: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetStreamContext(instance, (fileobject?.value ?: 0L), (context?.value ?: 0L))

public actual fun fltGetStreamHandleContext(instance: PfltInstance, fileobject: COpaquePointer?, context: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetStreamHandleContext(instance, (fileobject?.value ?: 0L), (context?.value ?: 0L))

public actual fun fltGetSwappedBufferMdlAddress(callbackdata: COpaquePointer?): COpaquePointer? =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetSwappedBufferMdlAddress((callbackdata?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fltGetTopInstance(volume: PfltVolume, instance: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetTopInstance(volume, (instance?.value ?: 0L))

public actual fun fltGetTransactionContext(instance: PfltInstance, transaction: COpaquePointer?, context: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetTransactionContext(instance, (transaction?.value ?: 0L), (context?.value ?: 0L))

public actual fun fltGetTunneledName(callbackdata: COpaquePointer?, filenameinformation: COpaquePointer?, rettunneledfilenameinformation: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetTunneledName((callbackdata?.value ?: 0L), (filenameinformation?.value ?: 0L), (rettunneledfilenameinformation?.value ?: 0L))

public actual fun fltGetUpperInstance(currentinstance: PfltInstance, upperinstance: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetUpperInstance(currentinstance, (upperinstance?.value ?: 0L))

public actual fun fltGetVolumeContext(filter: PfltFilter, volume: PfltVolume, context: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeContext(filter, volume, (context?.value ?: 0L))

public actual fun fltGetVolumeFromDeviceObject(filter: PfltFilter, deviceobject: COpaquePointer?, retvolume: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeFromDeviceObject(filter, (deviceobject?.value ?: 0L), (retvolume?.value ?: 0L))

public actual fun fltGetVolumeFromFileObject(filter: PfltFilter, fileobject: COpaquePointer?, retvolume: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeFromFileObject(filter, (fileobject?.value ?: 0L), (retvolume?.value ?: 0L))

public actual fun fltGetVolumeFromInstance(instance: PfltInstance, retvolume: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeFromInstance(instance, (retvolume?.value ?: 0L))

public actual fun fltGetVolumeFromName(filter: PfltFilter, volumename: COpaquePointer?, retvolume: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeFromName(filter, (volumename?.value ?: 0L), (retvolume?.value ?: 0L))

public actual fun fltGetVolumeGuidName(volume: PfltVolume, volumeguidname: COpaquePointer?, buffersizeneeded: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeGuidName(volume, (volumeguidname?.value ?: 0L), (buffersizeneeded?.value ?: 0L))

public actual fun fltGetVolumeInformation(volume: PfltVolume, informationclass: FilterVolumeInformationClass, buffer: COpaquePointer?, buffersize: UInt, bytesreturned: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeInformation(volume, informationclass, (buffer?.value ?: 0L), buffersize.toInt(), (bytesreturned?.value ?: 0L))

public actual fun fltGetVolumeInstanceFromName(filter: PfltFilter, volume: PfltVolume, instancename: COpaquePointer?, retinstance: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeInstanceFromName(filter, volume, (instancename?.value ?: 0L), (retinstance?.value ?: 0L))

public actual fun fltGetVolumeName(volume: PfltVolume, volumename: COpaquePointer?, buffersizeneeded: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeName(volume, (volumename?.value ?: 0L), (buffersizeneeded?.value ?: 0L))

public actual fun fltGetVolumeProperties(volume: PfltVolume, volumeproperties: COpaquePointer?, volumepropertieslength: UInt, lengthreturned: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltGetVolumeProperties(volume, (volumeproperties?.value ?: 0L), volumepropertieslength.toInt(), (lengthreturned?.value ?: 0L))

public actual fun fltInitExtraCreateParameterLookasideList(filter: PfltFilter, lookaside: COpaquePointer?, flags: UInt, size: ULong, tag: UInt) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltInitExtraCreateParameterLookasideList(filter, (lookaside?.value ?: 0L), flags.toInt(), size.toLong(), tag.toInt())
}

public actual fun fltInitializeFileLock(filelock: COpaquePointer?) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltInitializeFileLock((filelock?.value ?: 0L))
}

public actual fun fltInitializeOplock(oplock: COpaquePointer?) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltInitializeOplock((oplock?.value ?: 0L))
}

public actual fun fltInitializePushLock(pushlock: COpaquePointer?) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltInitializePushLock((pushlock?.value ?: 0L))
}

public actual fun fltInsertExtraCreateParameter(filter: PfltFilter, ecplist: COpaquePointer?, ecpcontext: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltInsertExtraCreateParameter(filter, (ecplist?.value ?: 0L), (ecpcontext?.value ?: 0L))

public actual fun fltIs32bitProcess(callbackdata: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltIs32bitProcess((callbackdata?.value ?: 0L))

public actual fun fltIsCallbackDataDirty(data: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltIsCallbackDataDirty((data?.value ?: 0L))

public actual fun fltIsDirectory(fileobject: COpaquePointer?, instance: PfltInstance, isdirectory: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltIsDirectory((fileobject?.value ?: 0L), instance, (isdirectory?.value ?: 0L))

public actual fun fltIsEcpAcknowledged(filter: PfltFilter, ecpcontext: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltIsEcpAcknowledged(filter, (ecpcontext?.value ?: 0L))

public actual fun fltIsEcpFromUserMode(filter: PfltFilter, ecpcontext: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltIsEcpFromUserMode(filter, (ecpcontext?.value ?: 0L))

public actual fun fltIsFltMgrVolumeDeviceObject(deviceobject: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltIsFltMgrVolumeDeviceObject((deviceobject?.value ?: 0L))

public actual fun fltIsIoCanceled(callbackdata: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltIsIoCanceled((callbackdata?.value ?: 0L))

public actual fun fltIsIoRedirectionAllowed(sourceinstance: PfltInstance, targetinstance: PfltInstance, redirectionallowed: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltIsIoRedirectionAllowed(sourceinstance, targetinstance, (redirectionallowed?.value ?: 0L))

public actual fun fltIsIoRedirectionAllowedForOperation(data: COpaquePointer?, targetinstance: PfltInstance, redirectionallowedthisio: COpaquePointer?, redirectionallowedallio: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltIsIoRedirectionAllowedForOperation((data?.value ?: 0L), targetinstance, (redirectionallowedthisio?.value ?: 0L), (redirectionallowedallio?.value ?: 0L))

public actual fun fltIsOperationSynchronous(callbackdata: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltIsOperationSynchronous((callbackdata?.value ?: 0L))

public actual fun fltIsVolumeSnapshot(fltobject: COpaquePointer?, issnapshotvolume: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltIsVolumeSnapshot((fltobject?.value ?: 0L), (issnapshotvolume?.value ?: 0L))

public actual fun fltIsVolumeWritable(fltobject: COpaquePointer?, iswritable: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltIsVolumeWritable((fltobject?.value ?: 0L), (iswritable?.value ?: 0L))

public actual fun fltLoadFilter(filtername: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltLoadFilter((filtername?.value ?: 0L))

public actual fun fltLockUserBuffer(callbackdata: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltLockUserBuffer((callbackdata?.value ?: 0L))

public actual fun fltNotifyFilterChangeDirectory(notifysync: PnotifySync, notifylist: COpaquePointer?, fscontext: COpaquePointer?, fulldirectoryname: COpaquePointer?, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifycallbackdata: COpaquePointer?, traversecallback: PcheckForTraverseAccess, subjectcontext: COpaquePointer?, filtercallback: PfilterReportChange) {
}

public actual fun fltObjectDereference(fltobject: COpaquePointer?) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltObjectDereference((fltobject?.value ?: 0L))
}

public actual fun fltObjectReference(fltobject: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltObjectReference((fltobject?.value ?: 0L))

public actual fun fltOpenVolume(instance: PfltInstance, volumehandle: COpaquePointer?, volumefileobject: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltOpenVolume(instance, (volumehandle?.value ?: 0L), (volumefileobject?.value ?: 0L))

public actual fun fltOplockBreakH(oplock: COpaquePointer?, callbackdata: COpaquePointer?, flags: UInt, context: COpaquePointer?, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltOplockBreakH((oplock?.value ?: 0L), (callbackdata?.value ?: 0L), flags.toInt(), (context?.value ?: 0L), 0L, 0L)

public actual fun fltOplockBreakToNone(oplock: COpaquePointer?, callbackdata: COpaquePointer?, context: COpaquePointer?, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltOplockBreakToNone((oplock?.value ?: 0L), (callbackdata?.value ?: 0L), (context?.value ?: 0L), 0L, 0L)

public actual fun fltOplockBreakToNoneEx(oplock: COpaquePointer?, callbackdata: COpaquePointer?, flags: UInt, context: COpaquePointer?, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltOplockBreakToNoneEx((oplock?.value ?: 0L), (callbackdata?.value ?: 0L), flags.toInt(), (context?.value ?: 0L), 0L, 0L)

public actual fun fltOplockFsctrl(oplock: COpaquePointer?, callbackdata: COpaquePointer?, opencount: UInt): FltPreopCallbackStatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltOplockFsctrl((oplock?.value ?: 0L), (callbackdata?.value ?: 0L), opencount.toInt())

public actual fun fltOplockFsctrlEx(oplock: COpaquePointer?, callbackdata: COpaquePointer?, opencount: UInt, flags: UInt): FltPreopCallbackStatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltOplockFsctrlEx((oplock?.value ?: 0L), (callbackdata?.value ?: 0L), opencount.toInt(), flags.toInt())

public actual fun fltOplockIsFastIoPossible(oplock: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltOplockIsFastIoPossible((oplock?.value ?: 0L))

public actual fun fltOplockIsSharedRequest(callbackdata: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltOplockIsSharedRequest((callbackdata?.value ?: 0L))

public actual fun fltOplockKeysEqual(fo1: COpaquePointer?, fo2: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltOplockKeysEqual((fo1?.value ?: 0L), (fo2?.value ?: 0L))

public actual fun fltParseFileName(filename: COpaquePointer?, extension: COpaquePointer?, stream: COpaquePointer?, finalcomponent: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltParseFileName((filename?.value ?: 0L), (extension?.value ?: 0L), (stream?.value ?: 0L), (finalcomponent?.value ?: 0L))

public actual fun fltParseFileNameInformation(filenameinformation: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltParseFileNameInformation((filenameinformation?.value ?: 0L))

public actual fun fltPerformAsynchronousIo(callbackdata: COpaquePointer?, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltPerformAsynchronousIo((callbackdata?.value ?: 0L), 0L, (callbackcontext?.value ?: 0L))

public actual fun fltPerformSynchronousIo(callbackdata: COpaquePointer?) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltPerformSynchronousIo((callbackdata?.value ?: 0L))
}

public actual fun fltPrePrepareComplete(instance: PfltInstance, transaction: COpaquePointer?, transactioncontext: PfltContext): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltPrePrepareComplete(instance, (transaction?.value ?: 0L), (transactioncontext?.value ?: 0L))

public actual fun fltPrepareComplete(instance: PfltInstance, transaction: COpaquePointer?, transactioncontext: PfltContext): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltPrepareComplete(instance, (transaction?.value ?: 0L), (transactioncontext?.value ?: 0L))

public actual fun fltPrepareToReuseEcp(filter: PfltFilter, ecpcontext: COpaquePointer?) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltPrepareToReuseEcp(filter, (ecpcontext?.value ?: 0L))
}

public actual fun fltProcessFileLock(filelock: COpaquePointer?, callbackdata: COpaquePointer?, context: COpaquePointer?): FltPreopCallbackStatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltProcessFileLock((filelock?.value ?: 0L), (callbackdata?.value ?: 0L), (context?.value ?: 0L))

public actual fun fltPropagateActivityIdToThread(callbackdata: COpaquePointer?, propagateid: COpaquePointer?, originalid: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltPropagateActivityIdToThread((callbackdata?.value ?: 0L), (propagateid?.value ?: 0L), (originalid?.value ?: 0L))

public actual fun fltPropagateIrpExtension(sourcedata: COpaquePointer?, targetdata: COpaquePointer?, flags: UInt): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltPropagateIrpExtension((sourcedata?.value ?: 0L), (targetdata?.value ?: 0L), flags.toInt())

public actual fun fltPurgeFileNameInformationCache(instance: PfltInstance, fileobject: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltPurgeFileNameInformationCache(instance, (fileobject?.value ?: 0L))

public actual fun fltQueryDirectoryFile(instance: PfltInstance, fileobject: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass, returnsingleentry: Boolean, filename: COpaquePointer?, restartscan: Boolean, lengthreturned: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltQueryDirectoryFile(instance, (fileobject?.value ?: 0L), (fileinformation?.value ?: 0L), length.toInt(), fileinformationclass, returnsingleentry, (filename?.value ?: 0L), restartscan, (lengthreturned?.value ?: 0L))

public actual fun fltQueryDirectoryFileEx(instance: PfltInstance, fileobject: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass, queryflags: UInt, filename: COpaquePointer?, lengthreturned: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltQueryDirectoryFileEx(instance, (fileobject?.value ?: 0L), (fileinformation?.value ?: 0L), length.toInt(), fileinformationclass, queryflags.toInt(), (filename?.value ?: 0L), (lengthreturned?.value ?: 0L))

public actual fun fltQueryEaFile(instance: PfltInstance, fileobject: COpaquePointer?, returnedeadata: COpaquePointer?, length: UInt, returnsingleentry: Boolean, ealist: COpaquePointer?, ealistlength: UInt, eaindex: COpaquePointer?, restartscan: Boolean, lengthreturned: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltQueryEaFile(instance, (fileobject?.value ?: 0L), (returnedeadata?.value ?: 0L), length.toInt(), returnsingleentry, (ealist?.value ?: 0L), ealistlength.toInt(), (eaindex?.value ?: 0L), restartscan, (lengthreturned?.value ?: 0L))

public actual fun fltQueryInformationByName(filter: PfltFilter, instance: PfltInstance, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass, drivercontext: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltQueryInformationByName(filter, instance, (objectattributes?.value ?: 0L), (iostatusblock?.value ?: 0L), (fileinformation?.value ?: 0L), length.toInt(), fileinformationclass, (drivercontext?.value ?: 0L))

public actual fun fltQueryInformationFile(instance: PfltInstance, fileobject: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass, lengthreturned: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltQueryInformationFile(instance, (fileobject?.value ?: 0L), (fileinformation?.value ?: 0L), length.toInt(), fileinformationclass, (lengthreturned?.value ?: 0L))

public actual fun fltQueryQuotaInformationFile(instance: PfltInstance, fileobject: COpaquePointer?, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt, returnsingleentry: Boolean, sidlist: COpaquePointer?, sidlistlength: UInt, startsid: COpaquePointer?, restartscan: Boolean, lengthreturned: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltQueryQuotaInformationFile(instance, (fileobject?.value ?: 0L), (iostatusblock?.value ?: 0L), (buffer?.value ?: 0L), length.toInt(), returnsingleentry, (sidlist?.value ?: 0L), sidlistlength.toInt(), (startsid?.value ?: 0L), restartscan, (lengthreturned?.value ?: 0L))

public actual fun fltQuerySecurityObject(instance: PfltInstance, fileobject: COpaquePointer?, securityinformation: UInt, securitydescriptor: PsecurityDescriptor, length: UInt, lengthneeded: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltQuerySecurityObject(instance, (fileobject?.value ?: 0L), securityinformation.toInt(), (securitydescriptor?.value ?: 0L), length.toInt(), (lengthneeded?.value ?: 0L))

public actual fun fltQueryVolumeInformation(instance: PfltInstance, iosb: COpaquePointer?, fsinformation: COpaquePointer?, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltQueryVolumeInformation(instance, (iosb?.value ?: 0L), (fsinformation?.value ?: 0L), length.toInt(), fsinformationclass)

public actual fun fltQueryVolumeInformationFile(instance: PfltInstance, fileobject: COpaquePointer?, fsinformation: COpaquePointer?, length: UInt, fsinformationclass: FsInformationClass, lengthreturned: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltQueryVolumeInformationFile(instance, (fileobject?.value ?: 0L), (fsinformation?.value ?: 0L), length.toInt(), fsinformationclass, (lengthreturned?.value ?: 0L))

public actual fun fltQueueDeferredIoWorkItem(fltworkitem: PfltDeferredIoWorkitem, data: COpaquePointer?, workerroutine: PfltDeferredIoWorkitemRoutine, queuetype: WorkQueueType, context: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltQueueDeferredIoWorkItem(fltworkitem, (data?.value ?: 0L), 0L, queuetype, (context?.value ?: 0L))

public actual fun fltQueueGenericWorkItem(fltworkitem: PfltGenericWorkitem, fltobject: COpaquePointer?, workerroutine: PfltGenericWorkitemRoutine, queuetype: WorkQueueType, context: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltQueueGenericWorkItem(fltworkitem, (fltobject?.value ?: 0L), 0L, queuetype, (context?.value ?: 0L))

public actual fun fltReadFile(initiatinginstance: PfltInstance, fileobject: COpaquePointer?, byteoffset: COpaquePointer?, length: UInt, buffer: COpaquePointer?, flags: UInt, bytesread: COpaquePointer?, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltReadFile(initiatinginstance, (fileobject?.value ?: 0L), (byteoffset?.value ?: 0L), length.toInt(), (buffer?.value ?: 0L), flags.toInt(), (bytesread?.value ?: 0L), 0L, (callbackcontext?.value ?: 0L))

public actual fun fltReadFileEx(initiatinginstance: PfltInstance, fileobject: COpaquePointer?, byteoffset: COpaquePointer?, length: UInt, buffer: COpaquePointer?, flags: UInt, bytesread: COpaquePointer?, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: COpaquePointer?, key: COpaquePointer?, mdl: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltReadFileEx(initiatinginstance, (fileobject?.value ?: 0L), (byteoffset?.value ?: 0L), length.toInt(), (buffer?.value ?: 0L), flags.toInt(), (bytesread?.value ?: 0L), 0L, (callbackcontext?.value ?: 0L), (key?.value ?: 0L), (mdl?.value ?: 0L))

public actual fun fltReferenceContext(context: PfltContext) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltReferenceContext((context?.value ?: 0L))
}

public actual fun fltReferenceFileNameInformation(filenameinformation: COpaquePointer?) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltReferenceFileNameInformation((filenameinformation?.value ?: 0L))
}

public actual fun fltRegisterFilter(driver: COpaquePointer?, registration: COpaquePointer?, retfilter: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltRegisterFilter((driver?.value ?: 0L), (registration?.value ?: 0L), (retfilter?.value ?: 0L))

public actual fun fltRegisterForDataScan(instance: PfltInstance): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltRegisterForDataScan(instance)

public actual fun fltReissueSynchronousIo(initiatinginstance: PfltInstance, callbackdata: COpaquePointer?) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltReissueSynchronousIo(initiatinginstance, (callbackdata?.value ?: 0L))
}

public actual fun fltReleaseContext(context: PfltContext) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltReleaseContext((context?.value ?: 0L))
}

public actual fun fltReleaseContexts(contexts: COpaquePointer?) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltReleaseContexts((contexts?.value ?: 0L))
}

public actual fun fltReleaseContextsEx(contextssize: ULong, contexts: COpaquePointer?) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltReleaseContextsEx(contextssize.toLong(), (contexts?.value ?: 0L))
}

public actual fun fltReleaseFileNameInformation(filenameinformation: COpaquePointer?) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltReleaseFileNameInformation((filenameinformation?.value ?: 0L))
}

public actual fun fltReleasePushLock(pushlock: COpaquePointer?) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltReleasePushLock((pushlock?.value ?: 0L))
}

public actual fun fltReleasePushLockEx(pushlock: COpaquePointer?, flags: UInt) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltReleasePushLockEx((pushlock?.value ?: 0L), flags.toInt())
}

public actual fun fltReleaseResource(resource: COpaquePointer?) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltReleaseResource((resource?.value ?: 0L))
}

public actual fun fltRemoveExtraCreateParameter(filter: PfltFilter, ecplist: COpaquePointer?, ecptype: COpaquePointer?, ecpcontext: COpaquePointer?, ecpcontextsize: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltRemoveExtraCreateParameter(filter, (ecplist?.value ?: 0L), (ecptype?.value ?: 0L), (ecpcontext?.value ?: 0L), (ecpcontextsize?.value ?: 0L))

public actual fun fltRemoveOpenReparseEntry(filter: PfltFilter, data: COpaquePointer?, openreparseentry: COpaquePointer?) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltRemoveOpenReparseEntry(filter, (data?.value ?: 0L), (openreparseentry?.value ?: 0L))
}

public actual fun fltRequestFileInfoOnCreateCompletion(filter: PfltFilter, data: COpaquePointer?, infoclassflags: UInt): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltRequestFileInfoOnCreateCompletion(filter, (data?.value ?: 0L), infoclassflags.toInt())

public actual fun fltRequestOperationStatusCallback(data: COpaquePointer?, callbackroutine: PfltGetOperationStatusCallback, requestercontext: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltRequestOperationStatusCallback((data?.value ?: 0L), 0L, (requestercontext?.value ?: 0L))

public actual fun fltRetainSwappedBufferMdlAddress(callbackdata: COpaquePointer?) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltRetainSwappedBufferMdlAddress((callbackdata?.value ?: 0L))
}

public actual fun fltRetrieveFileInfoOnCreateCompletion(filter: PfltFilter, data: COpaquePointer?, infoclass: UInt, size: COpaquePointer?): COpaquePointer? =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltRetrieveFileInfoOnCreateCompletion(filter, (data?.value ?: 0L), infoclass.toInt(), (size?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fltRetrieveFileInfoOnCreateCompletionEx(filter: PfltFilter, data: COpaquePointer?, infoclass: UInt, retinfosize: COpaquePointer?, retinfobuffer: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltRetrieveFileInfoOnCreateCompletionEx(filter, (data?.value ?: 0L), infoclass.toInt(), (retinfosize?.value ?: 0L), (retinfobuffer?.value ?: 0L))

public actual fun fltRetrieveIoPriorityInfo(data: COpaquePointer?, fileobject: COpaquePointer?, thread: Pethread, priorityinfo: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltRetrieveIoPriorityInfo((data?.value ?: 0L), (fileobject?.value ?: 0L), thread, (priorityinfo?.value ?: 0L))

public actual fun fltReuseCallbackData(callbackdata: COpaquePointer?) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltReuseCallbackData((callbackdata?.value ?: 0L))
}

public actual fun fltRollbackComplete(instance: PfltInstance, transaction: COpaquePointer?, transactioncontext: PfltContext): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltRollbackComplete(instance, (transaction?.value ?: 0L), (transactioncontext?.value ?: 0L))

public actual fun fltRollbackEnlistment(instance: PfltInstance, transaction: COpaquePointer?, transactioncontext: PfltContext): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltRollbackEnlistment(instance, (transaction?.value ?: 0L), (transactioncontext?.value ?: 0L))

public actual fun fltSendMessage(filter: PfltFilter, clientport: COpaquePointer?, senderbuffer: COpaquePointer?, senderbufferlength: UInt, replybuffer: COpaquePointer?, replylength: COpaquePointer?, timeout: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltSendMessage(filter, (clientport?.value ?: 0L), (senderbuffer?.value ?: 0L), senderbufferlength.toInt(), (replybuffer?.value ?: 0L), (replylength?.value ?: 0L), (timeout?.value ?: 0L))

public actual fun fltSetActivityIdCallbackData(callbackdata: COpaquePointer?, guid: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltSetActivityIdCallbackData((callbackdata?.value ?: 0L), (guid?.value ?: 0L))

public actual fun fltSetCallbackDataDirty(data: COpaquePointer?) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltSetCallbackDataDirty((data?.value ?: 0L))
}

public actual fun fltSetCancelCompletion(callbackdata: COpaquePointer?, canceledcallback: PfltCompleteCanceledCallback): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltSetCancelCompletion((callbackdata?.value ?: 0L), 0L)

public actual fun fltSetEaFile(instance: PfltInstance, fileobject: COpaquePointer?, eabuffer: COpaquePointer?, length: UInt): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltSetEaFile(instance, (fileobject?.value ?: 0L), (eabuffer?.value ?: 0L), length.toInt())

public actual fun fltSetEcpListIntoCallbackData(filter: PfltFilter, callbackdata: COpaquePointer?, ecplist: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltSetEcpListIntoCallbackData(filter, (callbackdata?.value ?: 0L), (ecplist?.value ?: 0L))

public actual fun fltSetFileContext(instance: PfltInstance, fileobject: COpaquePointer?, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltSetFileContext(instance, (fileobject?.value ?: 0L), operation, (newcontext?.value ?: 0L), (oldcontext?.value ?: 0L))

public actual fun fltSetFsZeroingOffset(data: COpaquePointer?, zeroingoffset: UInt): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltSetFsZeroingOffset((data?.value ?: 0L), zeroingoffset.toInt())

public actual fun fltSetFsZeroingOffsetRequired(data: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltSetFsZeroingOffsetRequired((data?.value ?: 0L))

public actual fun fltSetInformationFile(instance: PfltInstance, fileobject: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltSetInformationFile(instance, (fileobject?.value ?: 0L), (fileinformation?.value ?: 0L), length.toInt(), fileinformationclass)

public actual fun fltSetInstanceContext(instance: PfltInstance, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltSetInstanceContext(instance, operation, (newcontext?.value ?: 0L), (oldcontext?.value ?: 0L))

public actual fun fltSetIoPriorityHintIntoCallbackData(data: COpaquePointer?, priorityhint: IoPriorityHint): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltSetIoPriorityHintIntoCallbackData((data?.value ?: 0L), priorityhint)

public actual fun fltSetIoPriorityHintIntoFileObject(fileobject: COpaquePointer?, priorityhint: IoPriorityHint): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltSetIoPriorityHintIntoFileObject((fileobject?.value ?: 0L), priorityhint)

public actual fun fltSetIoPriorityHintIntoThread(thread: Pethread, priorityhint: IoPriorityHint): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltSetIoPriorityHintIntoThread(thread, priorityhint)

public actual fun fltSetQuotaInformationFile(instance: PfltInstance, fileobject: COpaquePointer?, buffer: COpaquePointer?, length: UInt): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltSetQuotaInformationFile(instance, (fileobject?.value ?: 0L), (buffer?.value ?: 0L), length.toInt())

public actual fun fltSetSecurityObject(instance: PfltInstance, fileobject: COpaquePointer?, securityinformation: UInt, securitydescriptor: PsecurityDescriptor): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltSetSecurityObject(instance, (fileobject?.value ?: 0L), securityinformation.toInt(), (securitydescriptor?.value ?: 0L))

public actual fun fltSetStreamContext(instance: PfltInstance, fileobject: COpaquePointer?, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltSetStreamContext(instance, (fileobject?.value ?: 0L), operation, (newcontext?.value ?: 0L), (oldcontext?.value ?: 0L))

public actual fun fltSetStreamHandleContext(instance: PfltInstance, fileobject: COpaquePointer?, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltSetStreamHandleContext(instance, (fileobject?.value ?: 0L), operation, (newcontext?.value ?: 0L), (oldcontext?.value ?: 0L))

public actual fun fltSetTransactionContext(instance: PfltInstance, transaction: COpaquePointer?, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltSetTransactionContext(instance, (transaction?.value ?: 0L), operation, (newcontext?.value ?: 0L), (oldcontext?.value ?: 0L))

public actual fun fltSetVolumeContext(volume: PfltVolume, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltSetVolumeContext(volume, operation, (newcontext?.value ?: 0L), (oldcontext?.value ?: 0L))

public actual fun fltSetVolumeInformation(instance: PfltInstance, iosb: COpaquePointer?, fsinformation: COpaquePointer?, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltSetVolumeInformation(instance, (iosb?.value ?: 0L), (fsinformation?.value ?: 0L), length.toInt(), fsinformationclass)

public actual fun fltStartFiltering(filter: PfltFilter): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltStartFiltering(filter)

public actual fun fltSupportsFileContexts(fileobject: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltSupportsFileContexts((fileobject?.value ?: 0L))

public actual fun fltSupportsFileContextsEx(fileobject: COpaquePointer?, instance: PfltInstance): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltSupportsFileContextsEx((fileobject?.value ?: 0L), instance)

public actual fun fltSupportsStreamContexts(fileobject: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltSupportsStreamContexts((fileobject?.value ?: 0L))

public actual fun fltSupportsStreamHandleContexts(fileobject: COpaquePointer?): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltSupportsStreamHandleContexts((fileobject?.value ?: 0L))

public actual fun fltTagFile(initiatinginstance: PfltInstance, fileobject: COpaquePointer?, filetag: UInt, guid: COpaquePointer?, databuffer: COpaquePointer?, databufferlength: UShort): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltTagFile(initiatinginstance, (fileobject?.value ?: 0L), filetag.toInt(), (guid?.value ?: 0L), (databuffer?.value ?: 0L), databufferlength.toShort())

public actual fun fltTagFileEx(initiatinginstance: PfltInstance, fileobject: COpaquePointer?, filetag: UInt, guid: COpaquePointer?, databuffer: COpaquePointer?, databufferlength: UShort, existingfiletag: UInt, existingguid: COpaquePointer?, flags: UInt): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltTagFileEx(initiatinginstance, (fileobject?.value ?: 0L), filetag.toInt(), (guid?.value ?: 0L), (databuffer?.value ?: 0L), databufferlength.toShort(), existingfiletag.toInt(), (existingguid?.value ?: 0L), flags.toInt())

public actual fun fltUninitializeFileLock(filelock: COpaquePointer?) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltUninitializeFileLock((filelock?.value ?: 0L))
}

public actual fun fltUninitializeOplock(oplock: COpaquePointer?) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltUninitializeOplock((oplock?.value ?: 0L))
}

public actual fun fltUnloadFilter(filtername: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltUnloadFilter((filtername?.value ?: 0L))

public actual fun fltUnregisterFilter(filter: PfltFilter) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltUnregisterFilter(filter)
}

public actual fun fltUntagFile(initiatinginstance: PfltInstance, fileobject: COpaquePointer?, filetag: UInt, guid: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltUntagFile(initiatinginstance, (fileobject?.value ?: 0L), filetag.toInt(), (guid?.value ?: 0L))

public actual fun fltVetoBypassIo(callbackdata: COpaquePointer?, fltobjects: COpaquePointer?, operationstatus: Ntstatus, failurereason: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltVetoBypassIo((callbackdata?.value ?: 0L), (fltobjects?.value ?: 0L), operationstatus, (failurereason?.value ?: 0L))

public actual fun fltWriteFile(initiatinginstance: PfltInstance, fileobject: COpaquePointer?, byteoffset: COpaquePointer?, length: UInt, buffer: COpaquePointer?, flags: UInt, byteswritten: COpaquePointer?, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltWriteFile(initiatinginstance, (fileobject?.value ?: 0L), (byteoffset?.value ?: 0L), length.toInt(), (buffer?.value ?: 0L), flags.toInt(), (byteswritten?.value ?: 0L), 0L, (callbackcontext?.value ?: 0L))

public actual fun fltWriteFileEx(initiatinginstance: PfltInstance, fileobject: COpaquePointer?, byteoffset: COpaquePointer?, length: UInt, buffer: COpaquePointer?, flags: UInt, byteswritten: COpaquePointer?, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: COpaquePointer?, key: COpaquePointer?, mdl: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltWriteFileEx(initiatinginstance, (fileobject?.value ?: 0L), (byteoffset?.value ?: 0L), length.toInt(), (buffer?.value ?: 0L), flags.toInt(), (byteswritten?.value ?: 0L), 0L, (callbackcontext?.value ?: 0L), (key?.value ?: 0L), (mdl?.value ?: 0L))

public actual fun fltpTraceRedirectedFileIo(originatingfileobject: COpaquePointer?, childcallbackdata: COpaquePointer?): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_fltpTraceRedirectedFileIo((originatingfileobject?.value ?: 0L), (childcallbackdata?.value ?: 0L))
