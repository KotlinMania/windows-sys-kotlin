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

private object WindowsWdkStorageFilesystemMinifiltersJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltAcknowledgeEcp(filter: Long, ecpcontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquirePushLockExclusive(pushlock: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquirePushLockExclusiveEx(pushlock: Long, flags: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquirePushLockShared(pushlock: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquirePushLockSharedEx(pushlock: Long, flags: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquireResourceExclusive(resource: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquireResourceShared(resource: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltAddOpenReparseEntry(filter: Long, data: Long, openreparseentry: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltAdjustDeviceStackSizeForIoRedirection(sourceinstance: Long, targetinstance: Long, sourcedevicestacksizemodified: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateCallbackData(instance: Long, fileobject: Long, retnewcallbackdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateCallbackDataEx(instance: Long, fileobject: Long, flags: Int, retnewcallbackdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateContext(filter: Long, contexttype: Short, contextsize: Long, pooltype: Int, returnedcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateDeferredIoWorkItem(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateExtraCreateParameterList(filter: Long, flags: Int, ecplist: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateGenericWorkItem(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocatePoolAlignedWithTag(instance: Long, pooltype: Int, numberofbytes: Long, tag: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltApplyPriorityInfoThread(inputpriorityinfo: Long, outputpriorityinfo: Long, thread: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltAttachVolume(filter: Long, volume: Long, instancename: Long, retinstance: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltAttachVolumeAtAltitude(filter: Long, volume: Long, altitude: Long, instancename: Long, retinstance: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltBuildDefaultSecurityDescriptor(securitydescriptor: Long, desiredaccess: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltCancelFileOpen(instance: Long, fileobject: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltCancelIo(callbackdata: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltCancellableWaitForMultipleObjects(count: Int, objectarray: Long, waittype: Int, timeout: Long, waitblockarray: Long, callbackdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltCancellableWaitForSingleObject(obj: Long, timeout: Long, callbackdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqDisable(cbdq: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqEnable(cbdq: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqInitialize(instance: Long, cbdq: Long, cbdqinsertio: Long, cbdqremoveio: Long, cbdqpeeknextio: Long, cbdqacquire: Long, cbdqrelease: Long, cbdqcompletecanceledio: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqInsertIo(cbdq: Long, cbd: Long, context: Long, insertcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqRemoveIo(cbdq: Long, context: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqRemoveNextIo(cbdq: Long, peekcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltCheckAndGrowNameControl(namectrl: Long, newsize: Short): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltCheckLockForReadAccess(filelock: Long, callbackdata: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltCheckLockForWriteAccess(filelock: Long, callbackdata: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltCheckOplock(oplock: Long, callbackdata: Long, context: Long, waitcompletionroutine: Long, prepostcallbackdataroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltCheckOplockEx(oplock: Long, callbackdata: Long, flags: Int, context: Long, waitcompletionroutine: Long, prepostcallbackdataroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltClearCallbackDataDirty(data: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltClearCancelCompletion(callbackdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltClose(filehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltCloseClientPort(filter: Long, clientport: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltCloseCommunicationPort(serverport: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltCloseSectionForDataScan(sectioncontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltCommitComplete(instance: Long, transaction: Long, transactioncontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltCommitFinalizeComplete(instance: Long, transaction: Long, transactioncontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltCompareInstanceAltitudes(instance1: Long, instance2: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltCompletePendedPostOperation(callbackdata: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltCompletePendedPreOperation(callbackdata: Long, callbackstatus: Int, context: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltCopyOpenReparseList(filter: Long, data: Long, ecplist: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateCommunicationPort(filter: Long, serverport: Long, objectattributes: Long, serverportcookie: Long, connectnotifycallback: Long, disconnectnotifycallback: Long, messagenotifycallback: Long, maxconnections: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateFile(filter: Long, instance: Long, filehandle: Long, desiredaccess: Int, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: Int, shareaccess: Int, createdisposition: Int, createoptions: Int, eabuffer: Long, ealength: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateFileEx(filter: Long, instance: Long, filehandle: Long, fileobject: Long, desiredaccess: Int, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: Int, shareaccess: Int, createdisposition: Int, createoptions: Int, eabuffer: Long, ealength: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateFileEx2(filter: Long, instance: Long, filehandle: Long, fileobject: Long, desiredaccess: Int, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: Int, shareaccess: Int, createdisposition: Int, createoptions: Int, eabuffer: Long, ealength: Int, flags: Int, drivercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateMailslotFile(filter: Long, instance: Long, filehandle: Long, fileobject: Long, desiredaccess: Int, objectattributes: Long, iostatusblock: Long, createoptions: Int, mailslotquota: Int, maximummessagesize: Int, readtimeout: Long, drivercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateNamedPipeFile(filter: Long, instance: Long, filehandle: Long, fileobject: Long, desiredaccess: Int, objectattributes: Long, iostatusblock: Long, shareaccess: Int, createdisposition: Int, createoptions: Int, namedpipetype: Int, readmode: Int, completionmode: Int, maximuminstances: Int, inboundquota: Int, outboundquota: Int, defaulttimeout: Long, drivercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateSectionForDataScan(instance: Long, fileobject: Long, sectioncontext: Long, desiredaccess: Int, objectattributes: Long, maximumsize: Long, sectionpageprotection: Int, allocationattributes: Int, flags: Int, sectionhandle: Long, sectionobject: Long, sectionfilesize: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateSystemVolumeInformationFolder(instance: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltCurrentBatchOplock(oplock: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltCurrentOplock(oplock: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltCurrentOplockH(oplock: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltDecodeParameters(callbackdata: Long, mdladdresspointer: Long, buffer: Long, length: Long, desiredaccess: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteContext(context: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteExtraCreateParameterLookasideList(filter: Long, lookaside: Long, flags: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteFileContext(instance: Long, fileobject: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteInstanceContext(instance: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltDeletePushLock(pushlock: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteStreamContext(instance: Long, fileobject: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteStreamHandleContext(instance: Long, fileobject: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteTransactionContext(instance: Long, transaction: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteVolumeContext(filter: Long, volume: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltDetachVolume(filter: Long, volume: Long, instancename: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltDeviceIoControlFile(instance: Long, fileobject: Long, iocontrolcode: Int, inputbuffer: Long, inputbufferlength: Int, outputbuffer: Long, outputbufferlength: Int, lengthreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltDoCompletionProcessingWhenSafe(data: Long, fltobjects: Long, completioncontext: Long, flags: Int, safepostcallback: Long, retpostoperationstatus: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltEnlistInTransaction(instance: Long, transaction: Long, transactioncontext: Long, notificationmask: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateFilterInformation(index: Int, informationclass: Int, buffer: Long, buffersize: Int, bytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateFilters(filterlist: Long, filterlistsize: Int, numberfiltersreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateInstanceInformationByDeviceObject(deviceobject: Long, index: Int, informationclass: Int, buffer: Long, buffersize: Int, bytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateInstanceInformationByFilter(filter: Long, index: Int, informationclass: Int, buffer: Long, buffersize: Int, bytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateInstanceInformationByVolume(volume: Long, index: Int, informationclass: Int, buffer: Long, buffersize: Int, bytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateInstanceInformationByVolumeName(volumename: Long, index: Int, informationclass: Int, buffer: Long, buffersize: Int, bytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateInstances(volume: Long, filter: Long, instancelist: Long, instancelistsize: Int, numberinstancesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateVolumeInformation(filter: Long, index: Int, informationclass: Int, buffer: Long, buffersize: Int, bytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateVolumes(filter: Long, volumelist: Long, volumelistsize: Int, numbervolumesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltFastIoMdlRead(initiatinginstance: Long, fileobject: Long, fileoffset: Long, length: Int, lockkey: Int, mdlchain: Long, iostatus: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltFastIoMdlReadComplete(initiatinginstance: Long, fileobject: Long, mdlchain: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltFastIoMdlWriteComplete(initiatinginstance: Long, fileobject: Long, fileoffset: Long, mdlchain: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltFastIoPrepareMdlWrite(initiatinginstance: Long, fileobject: Long, fileoffset: Long, length: Int, lockkey: Int, mdlchain: Long, iostatus: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltFindExtraCreateParameter(filter: Long, ecplist: Long, ecptype: Long, ecpcontext: Long, ecpcontextsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltFlushBuffers(instance: Long, fileobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltFlushBuffers2(instance: Long, fileobject: Long, flushtype: Int, callbackdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeCallbackData(callbackdata: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeDeferredIoWorkItem(fltworkitem: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeExtraCreateParameter(filter: Long, ecpcontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeExtraCreateParameterList(filter: Long, ecplist: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeFileLock(filelock: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeGenericWorkItem(fltworkitem: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeOpenReparseList(filter: Long, ecplist: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltFreePoolAlignedWithTag(instance: Long, buffer: Long, tag: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeSecurityDescriptor(securitydescriptor: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltFsControlFile(instance: Long, fileobject: Long, fscontrolcode: Int, inputbuffer: Long, inputbufferlength: Int, outputbuffer: Long, outputbufferlength: Int, lengthreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetActivityIdCallbackData(callbackdata: Long, guid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetBottomInstance(volume: Long, instance: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetContexts(fltobjects: Long, desiredcontexts: Short, contexts: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetContextsEx(fltobjects: Long, desiredcontexts: Short, contextssize: Long, contexts: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetDestinationFileNameInformation(instance: Long, fileobject: Long, rootdirectory: Long, filename: Long, filenamelength: Int, nameoptions: Int, retfilenameinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetDeviceObject(volume: Long, deviceobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetDiskDeviceObject(volume: Long, diskdeviceobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetEcpListFromCallbackData(filter: Long, callbackdata: Long, ecplist: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFileContext(instance: Long, fileobject: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFileNameInformation(callbackdata: Long, nameoptions: Int, filenameinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFileNameInformationUnsafe(fileobject: Long, instance: Long, nameoptions: Int, filenameinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFileSystemType(fltobject: Long, filesystemtype: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFilterFromInstance(instance: Long, retfilter: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFilterFromName(filtername: Long, retfilter: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFilterInformation(filter: Long, informationclass: Int, buffer: Long, buffersize: Int, bytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFsZeroingOffset(data: Long, zeroingoffset: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetInstanceContext(instance: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetInstanceInformation(instance: Long, informationclass: Int, buffer: Long, buffersize: Int, bytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIoAttributionHandleFromCallbackData(data: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIoPriorityHint(data: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIoPriorityHintFromCallbackData(data: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIoPriorityHintFromFileObject(fileobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIoPriorityHintFromThread(thread: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIrpName(irpmajorcode: Byte): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetLowerInstance(currentinstance: Long, lowerinstance: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetNewSystemBufferAddress(callbackdata: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetNextExtraCreateParameter(filter: Long, ecplist: Long, currentecpcontext: Long, nextecptype: Long, nextecpcontext: Long, nextecpcontextsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetRequestorProcess(callbackdata: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetRequestorProcessId(callbackdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetRequestorProcessIdEx(callbackdata: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetRequestorSessionId(callbackdata: Long, sessionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetRoutineAddress(fltmgrroutinename: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetSectionContext(instance: Long, fileobject: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetStreamContext(instance: Long, fileobject: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetStreamHandleContext(instance: Long, fileobject: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetSwappedBufferMdlAddress(callbackdata: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetTopInstance(volume: Long, instance: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetTransactionContext(instance: Long, transaction: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetTunneledName(callbackdata: Long, filenameinformation: Long, rettunneledfilenameinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetUpperInstance(currentinstance: Long, upperinstance: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeContext(filter: Long, volume: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeFromDeviceObject(filter: Long, deviceobject: Long, retvolume: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeFromFileObject(filter: Long, fileobject: Long, retvolume: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeFromInstance(instance: Long, retvolume: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeFromName(filter: Long, volumename: Long, retvolume: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeGuidName(volume: Long, volumeguidname: Long, buffersizeneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeInformation(volume: Long, informationclass: Int, buffer: Long, buffersize: Int, bytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeInstanceFromName(filter: Long, volume: Long, instancename: Long, retinstance: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeName(volume: Long, volumename: Long, buffersizeneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeProperties(volume: Long, volumeproperties: Long, volumepropertieslength: Int, lengthreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltInitExtraCreateParameterLookasideList(filter: Long, lookaside: Long, flags: Int, size: Long, tag: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltInitializeFileLock(filelock: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltInitializeOplock(oplock: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltInitializePushLock(pushlock: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltInsertExtraCreateParameter(filter: Long, ecplist: Long, ecpcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltIs32bitProcess(callbackdata: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltIsCallbackDataDirty(data: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltIsDirectory(fileobject: Long, instance: Long, isdirectory: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltIsEcpAcknowledged(filter: Long, ecpcontext: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltIsEcpFromUserMode(filter: Long, ecpcontext: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltIsFltMgrVolumeDeviceObject(deviceobject: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltIsIoCanceled(callbackdata: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltIsIoRedirectionAllowed(sourceinstance: Long, targetinstance: Long, redirectionallowed: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltIsIoRedirectionAllowedForOperation(data: Long, targetinstance: Long, redirectionallowedthisio: Long, redirectionallowedallio: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltIsOperationSynchronous(callbackdata: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltIsVolumeSnapshot(fltobject: Long, issnapshotvolume: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltIsVolumeWritable(fltobject: Long, iswritable: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltLoadFilter(filtername: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltLockUserBuffer(callbackdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltObjectDereference(fltobject: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltObjectReference(fltobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltOpenVolume(instance: Long, volumehandle: Long, volumefileobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockBreakH(oplock: Long, callbackdata: Long, flags: Int, context: Long, waitcompletionroutine: Long, prepostcallbackdataroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockBreakToNone(oplock: Long, callbackdata: Long, context: Long, waitcompletionroutine: Long, prepostcallbackdataroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockBreakToNoneEx(oplock: Long, callbackdata: Long, flags: Int, context: Long, waitcompletionroutine: Long, prepostcallbackdataroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockFsctrl(oplock: Long, callbackdata: Long, opencount: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockFsctrlEx(oplock: Long, callbackdata: Long, opencount: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockIsFastIoPossible(oplock: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockIsSharedRequest(callbackdata: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockKeysEqual(fo1: Long, fo2: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltParseFileName(filename: Long, extension: Long, stream: Long, finalcomponent: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltParseFileNameInformation(filenameinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltPerformAsynchronousIo(callbackdata: Long, callbackroutine: Long, callbackcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltPerformSynchronousIo(callbackdata: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltPrePrepareComplete(instance: Long, transaction: Long, transactioncontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltPrepareComplete(instance: Long, transaction: Long, transactioncontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltPrepareToReuseEcp(filter: Long, ecpcontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltProcessFileLock(filelock: Long, callbackdata: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltPropagateActivityIdToThread(callbackdata: Long, propagateid: Long, originalid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltPropagateIrpExtension(sourcedata: Long, targetdata: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltPurgeFileNameInformationCache(instance: Long, fileobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryDirectoryFile(instance: Long, fileobject: Long, fileinformation: Long, length: Int, fileinformationclass: Int, returnsingleentry: Boolean, filename: Long, restartscan: Boolean, lengthreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryDirectoryFileEx(instance: Long, fileobject: Long, fileinformation: Long, length: Int, fileinformationclass: Int, queryflags: Int, filename: Long, lengthreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryEaFile(instance: Long, fileobject: Long, returnedeadata: Long, length: Int, returnsingleentry: Boolean, ealist: Long, ealistlength: Int, eaindex: Long, restartscan: Boolean, lengthreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryInformationByName(filter: Long, instance: Long, objectattributes: Long, iostatusblock: Long, fileinformation: Long, length: Int, fileinformationclass: Int, drivercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryInformationFile(instance: Long, fileobject: Long, fileinformation: Long, length: Int, fileinformationclass: Int, lengthreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryQuotaInformationFile(instance: Long, fileobject: Long, iostatusblock: Long, buffer: Long, length: Int, returnsingleentry: Boolean, sidlist: Long, sidlistlength: Int, startsid: Long, restartscan: Boolean, lengthreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltQuerySecurityObject(instance: Long, fileobject: Long, securityinformation: Int, securitydescriptor: Long, length: Int, lengthneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryVolumeInformation(instance: Long, iosb: Long, fsinformation: Long, length: Int, fsinformationclass: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryVolumeInformationFile(instance: Long, fileobject: Long, fsinformation: Long, length: Int, fsinformationclass: Int, lengthreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltQueueDeferredIoWorkItem(fltworkitem: Long, data: Long, workerroutine: Long, queuetype: Int, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltQueueGenericWorkItem(fltworkitem: Long, fltobject: Long, workerroutine: Long, queuetype: Int, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltReadFile(initiatinginstance: Long, fileobject: Long, byteoffset: Long, length: Int, buffer: Long, flags: Int, bytesread: Long, callbackroutine: Long, callbackcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltReadFileEx(initiatinginstance: Long, fileobject: Long, byteoffset: Long, length: Int, buffer: Long, flags: Int, bytesread: Long, callbackroutine: Long, callbackcontext: Long, key: Long, mdl: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltReferenceContext(context: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltReferenceFileNameInformation(filenameinformation: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltRegisterFilter(driver: Long, registration: Long, retfilter: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltRegisterForDataScan(instance: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltReissueSynchronousIo(initiatinginstance: Long, callbackdata: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltReleaseContext(context: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltReleaseContexts(contexts: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltReleaseContextsEx(contextssize: Long, contexts: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltReleaseFileNameInformation(filenameinformation: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltReleasePushLock(pushlock: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltReleasePushLockEx(pushlock: Long, flags: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltReleaseResource(resource: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltRemoveExtraCreateParameter(filter: Long, ecplist: Long, ecptype: Long, ecpcontext: Long, ecpcontextsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltRemoveOpenReparseEntry(filter: Long, data: Long, openreparseentry: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltRequestFileInfoOnCreateCompletion(filter: Long, data: Long, infoclassflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltRequestOperationStatusCallback(data: Long, callbackroutine: Long, requestercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltRetainSwappedBufferMdlAddress(callbackdata: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltRetrieveFileInfoOnCreateCompletion(filter: Long, data: Long, infoclass: Int, size: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltRetrieveFileInfoOnCreateCompletionEx(filter: Long, data: Long, infoclass: Int, retinfosize: Long, retinfobuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltRetrieveIoPriorityInfo(data: Long, fileobject: Long, thread: Long, priorityinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltReuseCallbackData(callbackdata: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltRollbackComplete(instance: Long, transaction: Long, transactioncontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltRollbackEnlistment(instance: Long, transaction: Long, transactioncontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltSendMessage(filter: Long, clientport: Long, senderbuffer: Long, senderbufferlength: Int, replybuffer: Long, replylength: Long, timeout: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltSetActivityIdCallbackData(callbackdata: Long, guid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltSetCallbackDataDirty(data: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltSetCancelCompletion(callbackdata: Long, canceledcallback: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltSetEaFile(instance: Long, fileobject: Long, eabuffer: Long, length: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltSetEcpListIntoCallbackData(filter: Long, callbackdata: Long, ecplist: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltSetFileContext(instance: Long, fileobject: Long, operation: Int, newcontext: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltSetFsZeroingOffset(data: Long, zeroingoffset: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltSetFsZeroingOffsetRequired(data: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltSetInformationFile(instance: Long, fileobject: Long, fileinformation: Long, length: Int, fileinformationclass: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltSetInstanceContext(instance: Long, operation: Int, newcontext: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltSetIoPriorityHintIntoCallbackData(data: Long, priorityhint: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltSetIoPriorityHintIntoFileObject(fileobject: Long, priorityhint: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltSetIoPriorityHintIntoThread(thread: Long, priorityhint: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltSetQuotaInformationFile(instance: Long, fileobject: Long, buffer: Long, length: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltSetSecurityObject(instance: Long, fileobject: Long, securityinformation: Int, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltSetStreamContext(instance: Long, fileobject: Long, operation: Int, newcontext: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltSetStreamHandleContext(instance: Long, fileobject: Long, operation: Int, newcontext: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltSetTransactionContext(instance: Long, transaction: Long, operation: Int, newcontext: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltSetVolumeContext(volume: Long, operation: Int, newcontext: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltSetVolumeInformation(instance: Long, iosb: Long, fsinformation: Long, length: Int, fsinformationclass: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltStartFiltering(filter: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltSupportsFileContexts(fileobject: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltSupportsFileContextsEx(fileobject: Long, instance: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltSupportsStreamContexts(fileobject: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltSupportsStreamHandleContexts(fileobject: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltTagFile(initiatinginstance: Long, fileobject: Long, filetag: Int, guid: Long, databuffer: Long, databufferlength: Short): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltTagFileEx(initiatinginstance: Long, fileobject: Long, filetag: Int, guid: Long, databuffer: Long, databufferlength: Short, existingfiletag: Int, existingguid: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltUninitializeFileLock(filelock: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltUninitializeOplock(oplock: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltUnloadFilter(filtername: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltUnregisterFilter(filter: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltUntagFile(initiatinginstance: Long, fileobject: Long, filetag: Int, guid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltVetoBypassIo(callbackdata: Long, fltobjects: Long, operationstatus: Int, failurereason: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltWriteFile(initiatinginstance: Long, fileobject: Long, byteoffset: Long, length: Int, buffer: Long, flags: Int, byteswritten: Long, callbackroutine: Long, callbackcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltWriteFileEx(initiatinginstance: Long, fileobject: Long, byteoffset: Long, length: Int, buffer: Long, flags: Int, byteswritten: Long, callbackroutine: Long, callbackcontext: Long, key: Long, mdl: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_storage_filesystem_minifilters_FltpTraceRedirectedFileIo(originatingfileobject: Long, childcallbackdata: Long): Int
}

public actual fun FltAcknowledgeEcp(filter: PFLT_FILTER, ecpcontext: Long) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltAcknowledgeEcp(filter, ecpcontext)
}

public actual fun FltAcquirePushLockExclusive(pushlock: Long) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquirePushLockExclusive(pushlock)
}

public actual fun FltAcquirePushLockExclusiveEx(pushlock: Long, flags: UInt) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquirePushLockExclusiveEx(pushlock, flags.toInt())
}

public actual fun FltAcquirePushLockShared(pushlock: Long) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquirePushLockShared(pushlock)
}

public actual fun FltAcquirePushLockSharedEx(pushlock: Long, flags: UInt) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquirePushLockSharedEx(pushlock, flags.toInt())
}

public actual fun FltAcquireResourceExclusive(resource: Long) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquireResourceExclusive(resource)
}

public actual fun FltAcquireResourceShared(resource: Long) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltAcquireResourceShared(resource)
}

public actual fun FltAddOpenReparseEntry(filter: PFLT_FILTER, data: Long, openreparseentry: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltAddOpenReparseEntry(filter, data, openreparseentry)

public actual fun FltAdjustDeviceStackSizeForIoRedirection(sourceinstance: PFLT_INSTANCE, targetinstance: PFLT_INSTANCE, sourcedevicestacksizemodified: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltAdjustDeviceStackSizeForIoRedirection(sourceinstance, targetinstance, sourcedevicestacksizemodified)

public actual fun FltAllocateCallbackData(instance: PFLT_INSTANCE, fileobject: Long, retnewcallbackdata: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateCallbackData(instance, fileobject, retnewcallbackdata)

public actual fun FltAllocateCallbackDataEx(instance: PFLT_INSTANCE, fileobject: Long, flags: UInt, retnewcallbackdata: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateCallbackDataEx(instance, fileobject, flags.toInt(), retnewcallbackdata)

public actual fun FltAllocateContext(filter: PFLT_FILTER, contexttype: UShort, contextsize: ULong, pooltype: POOL_TYPE, returnedcontext: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateContext(filter, contexttype.toShort(), contextsize.toLong(), pooltype, returnedcontext)

public actual fun FltAllocateDeferredIoWorkItem(): PFLT_DEFERRED_IO_WORKITEM =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateDeferredIoWorkItem()

public actual fun FltAllocateExtraCreateParameter(filter: PFLT_FILTER, ecptype: Long, sizeofcontext: UInt, flags: UInt, cleanupcallback: PFSRTL_EXTRA_CREATE_PARAMETER_CLEANUP_CALLBACK, pooltag: UInt, ecpcontext: Long): NTSTATUS =
    0

public actual fun FltAllocateExtraCreateParameterFromLookasideList(filter: PFLT_FILTER, ecptype: Long, sizeofcontext: UInt, flags: UInt, cleanupcallback: PFSRTL_EXTRA_CREATE_PARAMETER_CLEANUP_CALLBACK, lookasidelist: Long, ecpcontext: Long): NTSTATUS =
    0

public actual fun FltAllocateExtraCreateParameterList(filter: PFLT_FILTER, flags: UInt, ecplist: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateExtraCreateParameterList(filter, flags.toInt(), ecplist)

public actual fun FltAllocateFileLock(completelockcallbackdataroutine: PFLT_COMPLETE_LOCK_CALLBACK_DATA_ROUTINE, unlockroutine: PUNLOCK_ROUTINE): Long =
    0L

public actual fun FltAllocateGenericWorkItem(): PFLT_GENERIC_WORKITEM =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocateGenericWorkItem()

public actual fun FltAllocatePoolAlignedWithTag(instance: PFLT_INSTANCE, pooltype: POOL_TYPE, numberofbytes: ULong, tag: UInt): Long =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltAllocatePoolAlignedWithTag(instance, pooltype, numberofbytes.toLong(), tag.toInt())

public actual fun FltApplyPriorityInfoThread(inputpriorityinfo: Long, outputpriorityinfo: Long, thread: PETHREAD): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltApplyPriorityInfoThread(inputpriorityinfo, outputpriorityinfo, thread)

public actual fun FltAttachVolume(filter: PFLT_FILTER, volume: PFLT_VOLUME, instancename: Long, retinstance: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltAttachVolume(filter, volume, instancename, retinstance)

public actual fun FltAttachVolumeAtAltitude(filter: PFLT_FILTER, volume: PFLT_VOLUME, altitude: Long, instancename: Long, retinstance: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltAttachVolumeAtAltitude(filter, volume, altitude, instancename, retinstance)

public actual fun FltBuildDefaultSecurityDescriptor(securitydescriptor: Long, desiredaccess: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltBuildDefaultSecurityDescriptor(securitydescriptor, desiredaccess.toInt())

public actual fun FltCancelFileOpen(instance: PFLT_INSTANCE, fileobject: Long) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltCancelFileOpen(instance, fileobject)
}

public actual fun FltCancelIo(callbackdata: Long): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltCancelIo(callbackdata)

public actual fun FltCancellableWaitForMultipleObjects(count: UInt, objectarray: Long, waittype: WAIT_TYPE, timeout: Long, waitblockarray: Long, callbackdata: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltCancellableWaitForMultipleObjects(count.toInt(), objectarray, waittype, timeout, waitblockarray, callbackdata)

public actual fun FltCancellableWaitForSingleObject(obj: Long, timeout: Long, callbackdata: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltCancellableWaitForSingleObject(obj, timeout, callbackdata)

public actual fun FltCbdqDisable(cbdq: Long) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqDisable(cbdq)
}

public actual fun FltCbdqEnable(cbdq: Long) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqEnable(cbdq)
}

public actual fun FltCbdqInitialize(instance: PFLT_INSTANCE, cbdq: Long, cbdqinsertio: PFLT_CALLBACK_DATA_QUEUE_INSERT_IO, cbdqremoveio: PFLT_CALLBACK_DATA_QUEUE_REMOVE_IO, cbdqpeeknextio: PFLT_CALLBACK_DATA_QUEUE_PEEK_NEXT_IO, cbdqacquire: PFLT_CALLBACK_DATA_QUEUE_ACQUIRE, cbdqrelease: PFLT_CALLBACK_DATA_QUEUE_RELEASE, cbdqcompletecanceledio: PFLT_CALLBACK_DATA_QUEUE_COMPLETE_CANCELED_IO): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqInitialize(instance, cbdq, cbdqinsertio.toLong(), cbdqremoveio.toLong(), cbdqpeeknextio.toLong(), cbdqacquire.toLong(), cbdqrelease.toLong(), cbdqcompletecanceledio.toLong())

public actual fun FltCbdqInsertIo(cbdq: Long, cbd: Long, context: Long, insertcontext: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqInsertIo(cbdq, cbd, context, insertcontext)

public actual fun FltCbdqRemoveIo(cbdq: Long, context: Long): Long =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqRemoveIo(cbdq, context)

public actual fun FltCbdqRemoveNextIo(cbdq: Long, peekcontext: Long): Long =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltCbdqRemoveNextIo(cbdq, peekcontext)

public actual fun FltCheckAndGrowNameControl(namectrl: Long, newsize: UShort): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltCheckAndGrowNameControl(namectrl, newsize.toShort())

public actual fun FltCheckLockForReadAccess(filelock: Long, callbackdata: Long): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltCheckLockForReadAccess(filelock, callbackdata)

public actual fun FltCheckLockForWriteAccess(filelock: Long, callbackdata: Long): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltCheckLockForWriteAccess(filelock, callbackdata)

public actual fun FltCheckOplock(oplock: Long, callbackdata: Long, context: Long, waitcompletionroutine: PFLTOPLOCK_WAIT_COMPLETE_ROUTINE, prepostcallbackdataroutine: PFLTOPLOCK_PREPOST_CALLBACKDATA_ROUTINE): FLT_PREOP_CALLBACK_STATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltCheckOplock(oplock, callbackdata, context, waitcompletionroutine.toLong(), prepostcallbackdataroutine.toLong())

public actual fun FltCheckOplockEx(oplock: Long, callbackdata: Long, flags: UInt, context: Long, waitcompletionroutine: PFLTOPLOCK_WAIT_COMPLETE_ROUTINE, prepostcallbackdataroutine: PFLTOPLOCK_PREPOST_CALLBACKDATA_ROUTINE): FLT_PREOP_CALLBACK_STATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltCheckOplockEx(oplock, callbackdata, flags.toInt(), context, waitcompletionroutine.toLong(), prepostcallbackdataroutine.toLong())

public actual fun FltClearCallbackDataDirty(data: Long) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltClearCallbackDataDirty(data)
}

public actual fun FltClearCancelCompletion(callbackdata: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltClearCancelCompletion(callbackdata)

public actual fun FltClose(filehandle: HANDLE): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltClose(filehandle)

public actual fun FltCloseClientPort(filter: PFLT_FILTER, clientport: Long) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltCloseClientPort(filter, clientport)
}

public actual fun FltCloseCommunicationPort(serverport: PFLT_PORT) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltCloseCommunicationPort(serverport)
}

public actual fun FltCloseSectionForDataScan(sectioncontext: PFLT_CONTEXT): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltCloseSectionForDataScan(sectioncontext)

public actual fun FltCommitComplete(instance: PFLT_INSTANCE, transaction: Long, transactioncontext: PFLT_CONTEXT): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltCommitComplete(instance, transaction, transactioncontext)

public actual fun FltCommitFinalizeComplete(instance: PFLT_INSTANCE, transaction: Long, transactioncontext: PFLT_CONTEXT): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltCommitFinalizeComplete(instance, transaction, transactioncontext)

public actual fun FltCompareInstanceAltitudes(instance1: PFLT_INSTANCE, instance2: PFLT_INSTANCE): Int =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltCompareInstanceAltitudes(instance1, instance2)

public actual fun FltCompletePendedPostOperation(callbackdata: Long) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltCompletePendedPostOperation(callbackdata)
}

public actual fun FltCompletePendedPreOperation(callbackdata: Long, callbackstatus: FLT_PREOP_CALLBACK_STATUS, context: Long) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltCompletePendedPreOperation(callbackdata, callbackstatus, context)
}

public actual fun FltCopyOpenReparseList(filter: PFLT_FILTER, data: Long, ecplist: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltCopyOpenReparseList(filter, data, ecplist)

public actual fun FltCreateCommunicationPort(filter: PFLT_FILTER, serverport: Long, objectattributes: Long, serverportcookie: Long, connectnotifycallback: PFLT_CONNECT_NOTIFY, disconnectnotifycallback: PFLT_DISCONNECT_NOTIFY, messagenotifycallback: PFLT_MESSAGE_NOTIFY, maxconnections: Int): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateCommunicationPort(filter, serverport, objectattributes, serverportcookie, connectnotifycallback.toLong(), disconnectnotifycallback.toLong(), messagenotifycallback.toLong(), maxconnections)

public actual fun FltCreateFile(filter: PFLT_FILTER, instance: PFLT_INSTANCE, filehandle: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: Long, ealength: UInt, flags: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateFile(filter, instance, filehandle, desiredaccess.toInt(), objectattributes, iostatusblock, allocationsize, fileattributes.toInt(), shareaccess.toInt(), createdisposition.toInt(), createoptions.toInt(), eabuffer, ealength.toInt(), flags.toInt())

public actual fun FltCreateFileEx(filter: PFLT_FILTER, instance: PFLT_INSTANCE, filehandle: Long, fileobject: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: Long, ealength: UInt, flags: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateFileEx(filter, instance, filehandle, fileobject, desiredaccess.toInt(), objectattributes, iostatusblock, allocationsize, fileattributes.toInt(), shareaccess.toInt(), createdisposition.toInt(), createoptions.toInt(), eabuffer, ealength.toInt(), flags.toInt())

public actual fun FltCreateFileEx2(filter: PFLT_FILTER, instance: PFLT_INSTANCE, filehandle: Long, fileobject: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: Long, ealength: UInt, flags: UInt, drivercontext: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateFileEx2(filter, instance, filehandle, fileobject, desiredaccess.toInt(), objectattributes, iostatusblock, allocationsize, fileattributes.toInt(), shareaccess.toInt(), createdisposition.toInt(), createoptions.toInt(), eabuffer, ealength.toInt(), flags.toInt(), drivercontext)

public actual fun FltCreateMailslotFile(filter: PFLT_FILTER, instance: PFLT_INSTANCE, filehandle: Long, fileobject: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, createoptions: UInt, mailslotquota: UInt, maximummessagesize: UInt, readtimeout: Long, drivercontext: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateMailslotFile(filter, instance, filehandle, fileobject, desiredaccess.toInt(), objectattributes, iostatusblock, createoptions.toInt(), mailslotquota.toInt(), maximummessagesize.toInt(), readtimeout, drivercontext)

public actual fun FltCreateNamedPipeFile(filter: PFLT_FILTER, instance: PFLT_INSTANCE, filehandle: Long, fileobject: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, namedpipetype: UInt, readmode: UInt, completionmode: UInt, maximuminstances: UInt, inboundquota: UInt, outboundquota: UInt, defaulttimeout: Long, drivercontext: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateNamedPipeFile(filter, instance, filehandle, fileobject, desiredaccess.toInt(), objectattributes, iostatusblock, shareaccess.toInt(), createdisposition.toInt(), createoptions.toInt(), namedpipetype.toInt(), readmode.toInt(), completionmode.toInt(), maximuminstances.toInt(), inboundquota.toInt(), outboundquota.toInt(), defaulttimeout, drivercontext)

public actual fun FltCreateSectionForDataScan(instance: PFLT_INSTANCE, fileobject: Long, sectioncontext: PFLT_CONTEXT, desiredaccess: UInt, objectattributes: Long, maximumsize: Long, sectionpageprotection: UInt, allocationattributes: UInt, flags: UInt, sectionhandle: Long, sectionobject: Long, sectionfilesize: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateSectionForDataScan(instance, fileobject, sectioncontext, desiredaccess.toInt(), objectattributes, maximumsize, sectionpageprotection.toInt(), allocationattributes.toInt(), flags.toInt(), sectionhandle, sectionobject, sectionfilesize)

public actual fun FltCreateSystemVolumeInformationFolder(instance: PFLT_INSTANCE): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltCreateSystemVolumeInformationFolder(instance)

public actual fun FltCurrentBatchOplock(oplock: Long): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltCurrentBatchOplock(oplock)

public actual fun FltCurrentOplock(oplock: Long): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltCurrentOplock(oplock)

public actual fun FltCurrentOplockH(oplock: Long): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltCurrentOplockH(oplock)

public actual fun FltDecodeParameters(callbackdata: Long, mdladdresspointer: Long, buffer: Long, length: Long, desiredaccess: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltDecodeParameters(callbackdata, mdladdresspointer, buffer, length, desiredaccess)

public actual fun FltDeleteContext(context: PFLT_CONTEXT) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteContext(context)
}

public actual fun FltDeleteExtraCreateParameterLookasideList(filter: PFLT_FILTER, lookaside: Long, flags: UInt) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteExtraCreateParameterLookasideList(filter, lookaside, flags.toInt())
}

public actual fun FltDeleteFileContext(instance: PFLT_INSTANCE, fileobject: Long, oldcontext: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteFileContext(instance, fileobject, oldcontext)

public actual fun FltDeleteInstanceContext(instance: PFLT_INSTANCE, oldcontext: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteInstanceContext(instance, oldcontext)

public actual fun FltDeletePushLock(pushlock: Long) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltDeletePushLock(pushlock)
}

public actual fun FltDeleteStreamContext(instance: PFLT_INSTANCE, fileobject: Long, oldcontext: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteStreamContext(instance, fileobject, oldcontext)

public actual fun FltDeleteStreamHandleContext(instance: PFLT_INSTANCE, fileobject: Long, oldcontext: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteStreamHandleContext(instance, fileobject, oldcontext)

public actual fun FltDeleteTransactionContext(instance: PFLT_INSTANCE, transaction: Long, oldcontext: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteTransactionContext(instance, transaction, oldcontext)

public actual fun FltDeleteVolumeContext(filter: PFLT_FILTER, volume: PFLT_VOLUME, oldcontext: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltDeleteVolumeContext(filter, volume, oldcontext)

public actual fun FltDetachVolume(filter: PFLT_FILTER, volume: PFLT_VOLUME, instancename: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltDetachVolume(filter, volume, instancename)

public actual fun FltDeviceIoControlFile(instance: PFLT_INSTANCE, fileobject: Long, iocontrolcode: UInt, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt, lengthreturned: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltDeviceIoControlFile(instance, fileobject, iocontrolcode.toInt(), inputbuffer, inputbufferlength.toInt(), outputbuffer, outputbufferlength.toInt(), lengthreturned)

public actual fun FltDoCompletionProcessingWhenSafe(data: Long, fltobjects: Long, completioncontext: Long, flags: UInt, safepostcallback: PFLT_POST_OPERATION_CALLBACK, retpostoperationstatus: Long): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltDoCompletionProcessingWhenSafe(data, fltobjects, completioncontext, flags.toInt(), safepostcallback.toLong(), retpostoperationstatus)

public actual fun FltEnlistInTransaction(instance: PFLT_INSTANCE, transaction: Long, transactioncontext: PFLT_CONTEXT, notificationmask: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltEnlistInTransaction(instance, transaction, transactioncontext, notificationmask.toInt())

public actual fun FltEnumerateFilterInformation(index: UInt, informationclass: FILTER_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateFilterInformation(index.toInt(), informationclass, buffer, buffersize.toInt(), bytesreturned)

public actual fun FltEnumerateFilters(filterlist: Long, filterlistsize: UInt, numberfiltersreturned: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateFilters(filterlist, filterlistsize.toInt(), numberfiltersreturned)

public actual fun FltEnumerateInstanceInformationByDeviceObject(deviceobject: Long, index: UInt, informationclass: INSTANCE_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateInstanceInformationByDeviceObject(deviceobject, index.toInt(), informationclass, buffer, buffersize.toInt(), bytesreturned)

public actual fun FltEnumerateInstanceInformationByFilter(filter: PFLT_FILTER, index: UInt, informationclass: INSTANCE_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateInstanceInformationByFilter(filter, index.toInt(), informationclass, buffer, buffersize.toInt(), bytesreturned)

public actual fun FltEnumerateInstanceInformationByVolume(volume: PFLT_VOLUME, index: UInt, informationclass: INSTANCE_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateInstanceInformationByVolume(volume, index.toInt(), informationclass, buffer, buffersize.toInt(), bytesreturned)

public actual fun FltEnumerateInstanceInformationByVolumeName(volumename: Long, index: UInt, informationclass: INSTANCE_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateInstanceInformationByVolumeName(volumename, index.toInt(), informationclass, buffer, buffersize.toInt(), bytesreturned)

public actual fun FltEnumerateInstances(volume: PFLT_VOLUME, filter: PFLT_FILTER, instancelist: Long, instancelistsize: UInt, numberinstancesreturned: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateInstances(volume, filter, instancelist, instancelistsize.toInt(), numberinstancesreturned)

public actual fun FltEnumerateVolumeInformation(filter: PFLT_FILTER, index: UInt, informationclass: FILTER_VOLUME_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateVolumeInformation(filter, index.toInt(), informationclass, buffer, buffersize.toInt(), bytesreturned)

public actual fun FltEnumerateVolumes(filter: PFLT_FILTER, volumelist: Long, volumelistsize: UInt, numbervolumesreturned: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltEnumerateVolumes(filter, volumelist, volumelistsize.toInt(), numbervolumesreturned)

public actual fun FltFastIoMdlRead(initiatinginstance: PFLT_INSTANCE, fileobject: Long, fileoffset: Long, length: UInt, lockkey: UInt, mdlchain: Long, iostatus: Long): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltFastIoMdlRead(initiatinginstance, fileobject, fileoffset, length.toInt(), lockkey.toInt(), mdlchain, iostatus)

public actual fun FltFastIoMdlReadComplete(initiatinginstance: PFLT_INSTANCE, fileobject: Long, mdlchain: Long): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltFastIoMdlReadComplete(initiatinginstance, fileobject, mdlchain)

public actual fun FltFastIoMdlWriteComplete(initiatinginstance: PFLT_INSTANCE, fileobject: Long, fileoffset: Long, mdlchain: Long): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltFastIoMdlWriteComplete(initiatinginstance, fileobject, fileoffset, mdlchain)

public actual fun FltFastIoPrepareMdlWrite(initiatinginstance: PFLT_INSTANCE, fileobject: Long, fileoffset: Long, length: UInt, lockkey: UInt, mdlchain: Long, iostatus: Long): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltFastIoPrepareMdlWrite(initiatinginstance, fileobject, fileoffset, length.toInt(), lockkey.toInt(), mdlchain, iostatus)

public actual fun FltFindExtraCreateParameter(filter: PFLT_FILTER, ecplist: Long, ecptype: Long, ecpcontext: Long, ecpcontextsize: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltFindExtraCreateParameter(filter, ecplist, ecptype, ecpcontext, ecpcontextsize)

public actual fun FltFlushBuffers(instance: PFLT_INSTANCE, fileobject: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltFlushBuffers(instance, fileobject)

public actual fun FltFlushBuffers2(instance: PFLT_INSTANCE, fileobject: Long, flushtype: UInt, callbackdata: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltFlushBuffers2(instance, fileobject, flushtype.toInt(), callbackdata)

public actual fun FltFreeCallbackData(callbackdata: Long) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeCallbackData(callbackdata)
}

public actual fun FltFreeDeferredIoWorkItem(fltworkitem: PFLT_DEFERRED_IO_WORKITEM) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeDeferredIoWorkItem(fltworkitem)
}

public actual fun FltFreeExtraCreateParameter(filter: PFLT_FILTER, ecpcontext: Long) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeExtraCreateParameter(filter, ecpcontext)
}

public actual fun FltFreeExtraCreateParameterList(filter: PFLT_FILTER, ecplist: Long) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeExtraCreateParameterList(filter, ecplist)
}

public actual fun FltFreeFileLock(filelock: Long) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeFileLock(filelock)
}

public actual fun FltFreeGenericWorkItem(fltworkitem: PFLT_GENERIC_WORKITEM) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeGenericWorkItem(fltworkitem)
}

public actual fun FltFreeOpenReparseList(filter: PFLT_FILTER, ecplist: Long) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeOpenReparseList(filter, ecplist)
}

public actual fun FltFreePoolAlignedWithTag(instance: PFLT_INSTANCE, buffer: Long, tag: UInt) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltFreePoolAlignedWithTag(instance, buffer, tag.toInt())
}

public actual fun FltFreeSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltFreeSecurityDescriptor(securitydescriptor)
}

public actual fun FltFsControlFile(instance: PFLT_INSTANCE, fileobject: Long, fscontrolcode: UInt, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt, lengthreturned: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltFsControlFile(instance, fileobject, fscontrolcode.toInt(), inputbuffer, inputbufferlength.toInt(), outputbuffer, outputbufferlength.toInt(), lengthreturned)

public actual fun FltGetActivityIdCallbackData(callbackdata: Long, guid: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetActivityIdCallbackData(callbackdata, guid)

public actual fun FltGetBottomInstance(volume: PFLT_VOLUME, instance: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetBottomInstance(volume, instance)

public actual fun FltGetContexts(fltobjects: Long, desiredcontexts: UShort, contexts: Long) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetContexts(fltobjects, desiredcontexts.toShort(), contexts)
}

public actual fun FltGetContextsEx(fltobjects: Long, desiredcontexts: UShort, contextssize: ULong, contexts: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetContextsEx(fltobjects, desiredcontexts.toShort(), contextssize.toLong(), contexts)

public actual fun FltGetDestinationFileNameInformation(instance: PFLT_INSTANCE, fileobject: Long, rootdirectory: HANDLE, filename: PCWSTR, filenamelength: UInt, nameoptions: UInt, retfilenameinformation: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetDestinationFileNameInformation(instance, fileobject, rootdirectory, filename, filenamelength.toInt(), nameoptions.toInt(), retfilenameinformation)

public actual fun FltGetDeviceObject(volume: PFLT_VOLUME, deviceobject: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetDeviceObject(volume, deviceobject)

public actual fun FltGetDiskDeviceObject(volume: PFLT_VOLUME, diskdeviceobject: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetDiskDeviceObject(volume, diskdeviceobject)

public actual fun FltGetEcpListFromCallbackData(filter: PFLT_FILTER, callbackdata: Long, ecplist: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetEcpListFromCallbackData(filter, callbackdata, ecplist)

public actual fun FltGetFileContext(instance: PFLT_INSTANCE, fileobject: Long, context: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFileContext(instance, fileobject, context)

public actual fun FltGetFileNameInformation(callbackdata: Long, nameoptions: UInt, filenameinformation: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFileNameInformation(callbackdata, nameoptions.toInt(), filenameinformation)

public actual fun FltGetFileNameInformationUnsafe(fileobject: Long, instance: PFLT_INSTANCE, nameoptions: UInt, filenameinformation: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFileNameInformationUnsafe(fileobject, instance, nameoptions.toInt(), filenameinformation)

public actual fun FltGetFileSystemType(fltobject: Long, filesystemtype: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFileSystemType(fltobject, filesystemtype)

public actual fun FltGetFilterFromInstance(instance: PFLT_INSTANCE, retfilter: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFilterFromInstance(instance, retfilter)

public actual fun FltGetFilterFromName(filtername: Long, retfilter: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFilterFromName(filtername, retfilter)

public actual fun FltGetFilterInformation(filter: PFLT_FILTER, informationclass: FILTER_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFilterInformation(filter, informationclass, buffer, buffersize.toInt(), bytesreturned)

public actual fun FltGetFsZeroingOffset(data: Long, zeroingoffset: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetFsZeroingOffset(data, zeroingoffset)

public actual fun FltGetInstanceContext(instance: PFLT_INSTANCE, context: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetInstanceContext(instance, context)

public actual fun FltGetInstanceInformation(instance: PFLT_INSTANCE, informationclass: INSTANCE_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetInstanceInformation(instance, informationclass, buffer, buffersize.toInt(), bytesreturned)

public actual fun FltGetIoAttributionHandleFromCallbackData(data: Long): Long =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIoAttributionHandleFromCallbackData(data)

public actual fun FltGetIoPriorityHint(data: Long): IO_PRIORITY_HINT =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIoPriorityHint(data)

public actual fun FltGetIoPriorityHintFromCallbackData(data: Long): IO_PRIORITY_HINT =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIoPriorityHintFromCallbackData(data)

public actual fun FltGetIoPriorityHintFromFileObject(fileobject: Long): IO_PRIORITY_HINT =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIoPriorityHintFromFileObject(fileobject)

public actual fun FltGetIoPriorityHintFromThread(thread: PETHREAD): IO_PRIORITY_HINT =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIoPriorityHintFromThread(thread)

public actual fun FltGetIrpName(irpmajorcode: UByte): PSTR =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetIrpName(irpmajorcode.toByte())

public actual fun FltGetLowerInstance(currentinstance: PFLT_INSTANCE, lowerinstance: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetLowerInstance(currentinstance, lowerinstance)

public actual fun FltGetNewSystemBufferAddress(callbackdata: Long): Long =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetNewSystemBufferAddress(callbackdata)

public actual fun FltGetNextExtraCreateParameter(filter: PFLT_FILTER, ecplist: Long, currentecpcontext: Long, nextecptype: Long, nextecpcontext: Long, nextecpcontextsize: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetNextExtraCreateParameter(filter, ecplist, currentecpcontext, nextecptype, nextecpcontext, nextecpcontextsize)

public actual fun FltGetRequestorProcess(callbackdata: Long): PEPROCESS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetRequestorProcess(callbackdata)

public actual fun FltGetRequestorProcessId(callbackdata: Long): UInt =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetRequestorProcessId(callbackdata).toUInt()

public actual fun FltGetRequestorProcessIdEx(callbackdata: Long): HANDLE =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetRequestorProcessIdEx(callbackdata)

public actual fun FltGetRequestorSessionId(callbackdata: Long, sessionid: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetRequestorSessionId(callbackdata, sessionid)

public actual fun FltGetRoutineAddress(fltmgrroutinename: PCSTR): Long =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetRoutineAddress(fltmgrroutinename)

public actual fun FltGetSectionContext(instance: PFLT_INSTANCE, fileobject: Long, context: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetSectionContext(instance, fileobject, context)

public actual fun FltGetStreamContext(instance: PFLT_INSTANCE, fileobject: Long, context: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetStreamContext(instance, fileobject, context)

public actual fun FltGetStreamHandleContext(instance: PFLT_INSTANCE, fileobject: Long, context: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetStreamHandleContext(instance, fileobject, context)

public actual fun FltGetSwappedBufferMdlAddress(callbackdata: Long): Long =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetSwappedBufferMdlAddress(callbackdata)

public actual fun FltGetTopInstance(volume: PFLT_VOLUME, instance: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetTopInstance(volume, instance)

public actual fun FltGetTransactionContext(instance: PFLT_INSTANCE, transaction: Long, context: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetTransactionContext(instance, transaction, context)

public actual fun FltGetTunneledName(callbackdata: Long, filenameinformation: Long, rettunneledfilenameinformation: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetTunneledName(callbackdata, filenameinformation, rettunneledfilenameinformation)

public actual fun FltGetUpperInstance(currentinstance: PFLT_INSTANCE, upperinstance: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetUpperInstance(currentinstance, upperinstance)

public actual fun FltGetVolumeContext(filter: PFLT_FILTER, volume: PFLT_VOLUME, context: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeContext(filter, volume, context)

public actual fun FltGetVolumeFromDeviceObject(filter: PFLT_FILTER, deviceobject: Long, retvolume: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeFromDeviceObject(filter, deviceobject, retvolume)

public actual fun FltGetVolumeFromFileObject(filter: PFLT_FILTER, fileobject: Long, retvolume: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeFromFileObject(filter, fileobject, retvolume)

public actual fun FltGetVolumeFromInstance(instance: PFLT_INSTANCE, retvolume: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeFromInstance(instance, retvolume)

public actual fun FltGetVolumeFromName(filter: PFLT_FILTER, volumename: Long, retvolume: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeFromName(filter, volumename, retvolume)

public actual fun FltGetVolumeGuidName(volume: PFLT_VOLUME, volumeguidname: Long, buffersizeneeded: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeGuidName(volume, volumeguidname, buffersizeneeded)

public actual fun FltGetVolumeInformation(volume: PFLT_VOLUME, informationclass: FILTER_VOLUME_INFORMATION_CLASS, buffer: Long, buffersize: UInt, bytesreturned: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeInformation(volume, informationclass, buffer, buffersize.toInt(), bytesreturned)

public actual fun FltGetVolumeInstanceFromName(filter: PFLT_FILTER, volume: PFLT_VOLUME, instancename: Long, retinstance: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeInstanceFromName(filter, volume, instancename, retinstance)

public actual fun FltGetVolumeName(volume: PFLT_VOLUME, volumename: Long, buffersizeneeded: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeName(volume, volumename, buffersizeneeded)

public actual fun FltGetVolumeProperties(volume: PFLT_VOLUME, volumeproperties: Long, volumepropertieslength: UInt, lengthreturned: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltGetVolumeProperties(volume, volumeproperties, volumepropertieslength.toInt(), lengthreturned)

public actual fun FltInitExtraCreateParameterLookasideList(filter: PFLT_FILTER, lookaside: Long, flags: UInt, size: ULong, tag: UInt) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltInitExtraCreateParameterLookasideList(filter, lookaside, flags.toInt(), size.toLong(), tag.toInt())
}

public actual fun FltInitializeFileLock(filelock: Long) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltInitializeFileLock(filelock)
}

public actual fun FltInitializeOplock(oplock: Long) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltInitializeOplock(oplock)
}

public actual fun FltInitializePushLock(pushlock: Long) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltInitializePushLock(pushlock)
}

public actual fun FltInsertExtraCreateParameter(filter: PFLT_FILTER, ecplist: Long, ecpcontext: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltInsertExtraCreateParameter(filter, ecplist, ecpcontext)

public actual fun FltIs32bitProcess(callbackdata: Long): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltIs32bitProcess(callbackdata)

public actual fun FltIsCallbackDataDirty(data: Long): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltIsCallbackDataDirty(data)

public actual fun FltIsDirectory(fileobject: Long, instance: PFLT_INSTANCE, isdirectory: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltIsDirectory(fileobject, instance, isdirectory)

public actual fun FltIsEcpAcknowledged(filter: PFLT_FILTER, ecpcontext: Long): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltIsEcpAcknowledged(filter, ecpcontext)

public actual fun FltIsEcpFromUserMode(filter: PFLT_FILTER, ecpcontext: Long): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltIsEcpFromUserMode(filter, ecpcontext)

public actual fun FltIsFltMgrVolumeDeviceObject(deviceobject: Long): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltIsFltMgrVolumeDeviceObject(deviceobject)

public actual fun FltIsIoCanceled(callbackdata: Long): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltIsIoCanceled(callbackdata)

public actual fun FltIsIoRedirectionAllowed(sourceinstance: PFLT_INSTANCE, targetinstance: PFLT_INSTANCE, redirectionallowed: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltIsIoRedirectionAllowed(sourceinstance, targetinstance, redirectionallowed)

public actual fun FltIsIoRedirectionAllowedForOperation(data: Long, targetinstance: PFLT_INSTANCE, redirectionallowedthisio: Long, redirectionallowedallio: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltIsIoRedirectionAllowedForOperation(data, targetinstance, redirectionallowedthisio, redirectionallowedallio)

public actual fun FltIsOperationSynchronous(callbackdata: Long): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltIsOperationSynchronous(callbackdata)

public actual fun FltIsVolumeSnapshot(fltobject: Long, issnapshotvolume: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltIsVolumeSnapshot(fltobject, issnapshotvolume)

public actual fun FltIsVolumeWritable(fltobject: Long, iswritable: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltIsVolumeWritable(fltobject, iswritable)

public actual fun FltLoadFilter(filtername: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltLoadFilter(filtername)

public actual fun FltLockUserBuffer(callbackdata: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltLockUserBuffer(callbackdata)

public actual fun FltNotifyFilterChangeDirectory(notifysync: PNOTIFY_SYNC, notifylist: Long, fscontext: Long, fulldirectoryname: Long, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifycallbackdata: Long, traversecallback: PCHECK_FOR_TRAVERSE_ACCESS, subjectcontext: Long, filtercallback: PFILTER_REPORT_CHANGE) {
}

public actual fun FltObjectDereference(fltobject: Long) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltObjectDereference(fltobject)
}

public actual fun FltObjectReference(fltobject: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltObjectReference(fltobject)

public actual fun FltOpenVolume(instance: PFLT_INSTANCE, volumehandle: Long, volumefileobject: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltOpenVolume(instance, volumehandle, volumefileobject)

public actual fun FltOplockBreakH(oplock: Long, callbackdata: Long, flags: UInt, context: Long, waitcompletionroutine: PFLTOPLOCK_WAIT_COMPLETE_ROUTINE, prepostcallbackdataroutine: PFLTOPLOCK_PREPOST_CALLBACKDATA_ROUTINE): FLT_PREOP_CALLBACK_STATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockBreakH(oplock, callbackdata, flags.toInt(), context, waitcompletionroutine.toLong(), prepostcallbackdataroutine.toLong())

public actual fun FltOplockBreakToNone(oplock: Long, callbackdata: Long, context: Long, waitcompletionroutine: PFLTOPLOCK_WAIT_COMPLETE_ROUTINE, prepostcallbackdataroutine: PFLTOPLOCK_PREPOST_CALLBACKDATA_ROUTINE): FLT_PREOP_CALLBACK_STATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockBreakToNone(oplock, callbackdata, context, waitcompletionroutine.toLong(), prepostcallbackdataroutine.toLong())

public actual fun FltOplockBreakToNoneEx(oplock: Long, callbackdata: Long, flags: UInt, context: Long, waitcompletionroutine: PFLTOPLOCK_WAIT_COMPLETE_ROUTINE, prepostcallbackdataroutine: PFLTOPLOCK_PREPOST_CALLBACKDATA_ROUTINE): FLT_PREOP_CALLBACK_STATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockBreakToNoneEx(oplock, callbackdata, flags.toInt(), context, waitcompletionroutine.toLong(), prepostcallbackdataroutine.toLong())

public actual fun FltOplockFsctrl(oplock: Long, callbackdata: Long, opencount: UInt): FLT_PREOP_CALLBACK_STATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockFsctrl(oplock, callbackdata, opencount.toInt())

public actual fun FltOplockFsctrlEx(oplock: Long, callbackdata: Long, opencount: UInt, flags: UInt): FLT_PREOP_CALLBACK_STATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockFsctrlEx(oplock, callbackdata, opencount.toInt(), flags.toInt())

public actual fun FltOplockIsFastIoPossible(oplock: Long): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockIsFastIoPossible(oplock)

public actual fun FltOplockIsSharedRequest(callbackdata: Long): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockIsSharedRequest(callbackdata)

public actual fun FltOplockKeysEqual(fo1: Long, fo2: Long): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltOplockKeysEqual(fo1, fo2)

public actual fun FltParseFileName(filename: Long, extension: Long, stream: Long, finalcomponent: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltParseFileName(filename, extension, stream, finalcomponent)

public actual fun FltParseFileNameInformation(filenameinformation: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltParseFileNameInformation(filenameinformation)

public actual fun FltPerformAsynchronousIo(callbackdata: Long, callbackroutine: PFLT_COMPLETED_ASYNC_IO_CALLBACK, callbackcontext: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltPerformAsynchronousIo(callbackdata, callbackroutine.toLong(), callbackcontext)

public actual fun FltPerformSynchronousIo(callbackdata: Long) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltPerformSynchronousIo(callbackdata)
}

public actual fun FltPrePrepareComplete(instance: PFLT_INSTANCE, transaction: Long, transactioncontext: PFLT_CONTEXT): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltPrePrepareComplete(instance, transaction, transactioncontext)

public actual fun FltPrepareComplete(instance: PFLT_INSTANCE, transaction: Long, transactioncontext: PFLT_CONTEXT): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltPrepareComplete(instance, transaction, transactioncontext)

public actual fun FltPrepareToReuseEcp(filter: PFLT_FILTER, ecpcontext: Long) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltPrepareToReuseEcp(filter, ecpcontext)
}

public actual fun FltProcessFileLock(filelock: Long, callbackdata: Long, context: Long): FLT_PREOP_CALLBACK_STATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltProcessFileLock(filelock, callbackdata, context)

public actual fun FltPropagateActivityIdToThread(callbackdata: Long, propagateid: Long, originalid: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltPropagateActivityIdToThread(callbackdata, propagateid, originalid)

public actual fun FltPropagateIrpExtension(sourcedata: Long, targetdata: Long, flags: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltPropagateIrpExtension(sourcedata, targetdata, flags.toInt())

public actual fun FltPurgeFileNameInformationCache(instance: PFLT_INSTANCE, fileobject: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltPurgeFileNameInformationCache(instance, fileobject)

public actual fun FltQueryDirectoryFile(instance: PFLT_INSTANCE, fileobject: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, returnsingleentry: Boolean, filename: Long, restartscan: Boolean, lengthreturned: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryDirectoryFile(instance, fileobject, fileinformation, length.toInt(), fileinformationclass, returnsingleentry, filename, restartscan, lengthreturned)

public actual fun FltQueryDirectoryFileEx(instance: PFLT_INSTANCE, fileobject: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, queryflags: UInt, filename: Long, lengthreturned: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryDirectoryFileEx(instance, fileobject, fileinformation, length.toInt(), fileinformationclass, queryflags.toInt(), filename, lengthreturned)

public actual fun FltQueryEaFile(instance: PFLT_INSTANCE, fileobject: Long, returnedeadata: Long, length: UInt, returnsingleentry: Boolean, ealist: Long, ealistlength: UInt, eaindex: Long, restartscan: Boolean, lengthreturned: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryEaFile(instance, fileobject, returnedeadata, length.toInt(), returnsingleentry, ealist, ealistlength.toInt(), eaindex, restartscan, lengthreturned)

public actual fun FltQueryInformationByName(filter: PFLT_FILTER, instance: PFLT_INSTANCE, objectattributes: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, drivercontext: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryInformationByName(filter, instance, objectattributes, iostatusblock, fileinformation, length.toInt(), fileinformationclass, drivercontext)

public actual fun FltQueryInformationFile(instance: PFLT_INSTANCE, fileobject: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, lengthreturned: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryInformationFile(instance, fileobject, fileinformation, length.toInt(), fileinformationclass, lengthreturned)

public actual fun FltQueryQuotaInformationFile(instance: PFLT_INSTANCE, fileobject: Long, iostatusblock: Long, buffer: Long, length: UInt, returnsingleentry: Boolean, sidlist: Long, sidlistlength: UInt, startsid: Long, restartscan: Boolean, lengthreturned: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryQuotaInformationFile(instance, fileobject, iostatusblock, buffer, length.toInt(), returnsingleentry, sidlist, sidlistlength.toInt(), startsid, restartscan, lengthreturned)

public actual fun FltQuerySecurityObject(instance: PFLT_INSTANCE, fileobject: Long, securityinformation: UInt, securitydescriptor: PSECURITY_DESCRIPTOR, length: UInt, lengthneeded: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltQuerySecurityObject(instance, fileobject, securityinformation.toInt(), securitydescriptor, length.toInt(), lengthneeded)

public actual fun FltQueryVolumeInformation(instance: PFLT_INSTANCE, iosb: Long, fsinformation: Long, length: UInt, fsinformationclass: FS_INFORMATION_CLASS): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryVolumeInformation(instance, iosb, fsinformation, length.toInt(), fsinformationclass)

public actual fun FltQueryVolumeInformationFile(instance: PFLT_INSTANCE, fileobject: Long, fsinformation: Long, length: UInt, fsinformationclass: FS_INFORMATION_CLASS, lengthreturned: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltQueryVolumeInformationFile(instance, fileobject, fsinformation, length.toInt(), fsinformationclass, lengthreturned)

public actual fun FltQueueDeferredIoWorkItem(fltworkitem: PFLT_DEFERRED_IO_WORKITEM, data: Long, workerroutine: PFLT_DEFERRED_IO_WORKITEM_ROUTINE, queuetype: WORK_QUEUE_TYPE, context: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltQueueDeferredIoWorkItem(fltworkitem, data, workerroutine.toLong(), queuetype, context)

public actual fun FltQueueGenericWorkItem(fltworkitem: PFLT_GENERIC_WORKITEM, fltobject: Long, workerroutine: PFLT_GENERIC_WORKITEM_ROUTINE, queuetype: WORK_QUEUE_TYPE, context: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltQueueGenericWorkItem(fltworkitem, fltobject, workerroutine.toLong(), queuetype, context)

public actual fun FltReadFile(initiatinginstance: PFLT_INSTANCE, fileobject: Long, byteoffset: Long, length: UInt, buffer: Long, flags: UInt, bytesread: Long, callbackroutine: PFLT_COMPLETED_ASYNC_IO_CALLBACK, callbackcontext: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltReadFile(initiatinginstance, fileobject, byteoffset, length.toInt(), buffer, flags.toInt(), bytesread, callbackroutine.toLong(), callbackcontext)

public actual fun FltReadFileEx(initiatinginstance: PFLT_INSTANCE, fileobject: Long, byteoffset: Long, length: UInt, buffer: Long, flags: UInt, bytesread: Long, callbackroutine: PFLT_COMPLETED_ASYNC_IO_CALLBACK, callbackcontext: Long, key: Long, mdl: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltReadFileEx(initiatinginstance, fileobject, byteoffset, length.toInt(), buffer, flags.toInt(), bytesread, callbackroutine.toLong(), callbackcontext, key, mdl)

public actual fun FltReferenceContext(context: PFLT_CONTEXT) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltReferenceContext(context)
}

public actual fun FltReferenceFileNameInformation(filenameinformation: Long) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltReferenceFileNameInformation(filenameinformation)
}

public actual fun FltRegisterFilter(driver: Long, registration: Long, retfilter: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltRegisterFilter(driver, registration, retfilter)

public actual fun FltRegisterForDataScan(instance: PFLT_INSTANCE): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltRegisterForDataScan(instance)

public actual fun FltReissueSynchronousIo(initiatinginstance: PFLT_INSTANCE, callbackdata: Long) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltReissueSynchronousIo(initiatinginstance, callbackdata)
}

public actual fun FltReleaseContext(context: PFLT_CONTEXT) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltReleaseContext(context)
}

public actual fun FltReleaseContexts(contexts: Long) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltReleaseContexts(contexts)
}

public actual fun FltReleaseContextsEx(contextssize: ULong, contexts: Long) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltReleaseContextsEx(contextssize.toLong(), contexts)
}

public actual fun FltReleaseFileNameInformation(filenameinformation: Long) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltReleaseFileNameInformation(filenameinformation)
}

public actual fun FltReleasePushLock(pushlock: Long) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltReleasePushLock(pushlock)
}

public actual fun FltReleasePushLockEx(pushlock: Long, flags: UInt) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltReleasePushLockEx(pushlock, flags.toInt())
}

public actual fun FltReleaseResource(resource: Long) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltReleaseResource(resource)
}

public actual fun FltRemoveExtraCreateParameter(filter: PFLT_FILTER, ecplist: Long, ecptype: Long, ecpcontext: Long, ecpcontextsize: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltRemoveExtraCreateParameter(filter, ecplist, ecptype, ecpcontext, ecpcontextsize)

public actual fun FltRemoveOpenReparseEntry(filter: PFLT_FILTER, data: Long, openreparseentry: Long) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltRemoveOpenReparseEntry(filter, data, openreparseentry)
}

public actual fun FltRequestFileInfoOnCreateCompletion(filter: PFLT_FILTER, data: Long, infoclassflags: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltRequestFileInfoOnCreateCompletion(filter, data, infoclassflags.toInt())

public actual fun FltRequestOperationStatusCallback(data: Long, callbackroutine: PFLT_GET_OPERATION_STATUS_CALLBACK, requestercontext: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltRequestOperationStatusCallback(data, callbackroutine.toLong(), requestercontext)

public actual fun FltRetainSwappedBufferMdlAddress(callbackdata: Long) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltRetainSwappedBufferMdlAddress(callbackdata)
}

public actual fun FltRetrieveFileInfoOnCreateCompletion(filter: PFLT_FILTER, data: Long, infoclass: UInt, size: Long): Long =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltRetrieveFileInfoOnCreateCompletion(filter, data, infoclass.toInt(), size)

public actual fun FltRetrieveFileInfoOnCreateCompletionEx(filter: PFLT_FILTER, data: Long, infoclass: UInt, retinfosize: Long, retinfobuffer: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltRetrieveFileInfoOnCreateCompletionEx(filter, data, infoclass.toInt(), retinfosize, retinfobuffer)

public actual fun FltRetrieveIoPriorityInfo(data: Long, fileobject: Long, thread: PETHREAD, priorityinfo: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltRetrieveIoPriorityInfo(data, fileobject, thread, priorityinfo)

public actual fun FltReuseCallbackData(callbackdata: Long) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltReuseCallbackData(callbackdata)
}

public actual fun FltRollbackComplete(instance: PFLT_INSTANCE, transaction: Long, transactioncontext: PFLT_CONTEXT): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltRollbackComplete(instance, transaction, transactioncontext)

public actual fun FltRollbackEnlistment(instance: PFLT_INSTANCE, transaction: Long, transactioncontext: PFLT_CONTEXT): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltRollbackEnlistment(instance, transaction, transactioncontext)

public actual fun FltSendMessage(filter: PFLT_FILTER, clientport: Long, senderbuffer: Long, senderbufferlength: UInt, replybuffer: Long, replylength: Long, timeout: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltSendMessage(filter, clientport, senderbuffer, senderbufferlength.toInt(), replybuffer, replylength, timeout)

public actual fun FltSetActivityIdCallbackData(callbackdata: Long, guid: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetActivityIdCallbackData(callbackdata, guid)

public actual fun FltSetCallbackDataDirty(data: Long) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetCallbackDataDirty(data)
}

public actual fun FltSetCancelCompletion(callbackdata: Long, canceledcallback: PFLT_COMPLETE_CANCELED_CALLBACK): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetCancelCompletion(callbackdata, canceledcallback.toLong())

public actual fun FltSetEaFile(instance: PFLT_INSTANCE, fileobject: Long, eabuffer: Long, length: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetEaFile(instance, fileobject, eabuffer, length.toInt())

public actual fun FltSetEcpListIntoCallbackData(filter: PFLT_FILTER, callbackdata: Long, ecplist: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetEcpListIntoCallbackData(filter, callbackdata, ecplist)

public actual fun FltSetFileContext(instance: PFLT_INSTANCE, fileobject: Long, operation: FLT_SET_CONTEXT_OPERATION, newcontext: PFLT_CONTEXT, oldcontext: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetFileContext(instance, fileobject, operation, newcontext, oldcontext)

public actual fun FltSetFsZeroingOffset(data: Long, zeroingoffset: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetFsZeroingOffset(data, zeroingoffset.toInt())

public actual fun FltSetFsZeroingOffsetRequired(data: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetFsZeroingOffsetRequired(data)

public actual fun FltSetInformationFile(instance: PFLT_INSTANCE, fileobject: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetInformationFile(instance, fileobject, fileinformation, length.toInt(), fileinformationclass)

public actual fun FltSetInstanceContext(instance: PFLT_INSTANCE, operation: FLT_SET_CONTEXT_OPERATION, newcontext: PFLT_CONTEXT, oldcontext: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetInstanceContext(instance, operation, newcontext, oldcontext)

public actual fun FltSetIoPriorityHintIntoCallbackData(data: Long, priorityhint: IO_PRIORITY_HINT): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetIoPriorityHintIntoCallbackData(data, priorityhint)

public actual fun FltSetIoPriorityHintIntoFileObject(fileobject: Long, priorityhint: IO_PRIORITY_HINT): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetIoPriorityHintIntoFileObject(fileobject, priorityhint)

public actual fun FltSetIoPriorityHintIntoThread(thread: PETHREAD, priorityhint: IO_PRIORITY_HINT): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetIoPriorityHintIntoThread(thread, priorityhint)

public actual fun FltSetQuotaInformationFile(instance: PFLT_INSTANCE, fileobject: Long, buffer: Long, length: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetQuotaInformationFile(instance, fileobject, buffer, length.toInt())

public actual fun FltSetSecurityObject(instance: PFLT_INSTANCE, fileobject: Long, securityinformation: UInt, securitydescriptor: PSECURITY_DESCRIPTOR): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetSecurityObject(instance, fileobject, securityinformation.toInt(), securitydescriptor)

public actual fun FltSetStreamContext(instance: PFLT_INSTANCE, fileobject: Long, operation: FLT_SET_CONTEXT_OPERATION, newcontext: PFLT_CONTEXT, oldcontext: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetStreamContext(instance, fileobject, operation, newcontext, oldcontext)

public actual fun FltSetStreamHandleContext(instance: PFLT_INSTANCE, fileobject: Long, operation: FLT_SET_CONTEXT_OPERATION, newcontext: PFLT_CONTEXT, oldcontext: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetStreamHandleContext(instance, fileobject, operation, newcontext, oldcontext)

public actual fun FltSetTransactionContext(instance: PFLT_INSTANCE, transaction: Long, operation: FLT_SET_CONTEXT_OPERATION, newcontext: PFLT_CONTEXT, oldcontext: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetTransactionContext(instance, transaction, operation, newcontext, oldcontext)

public actual fun FltSetVolumeContext(volume: PFLT_VOLUME, operation: FLT_SET_CONTEXT_OPERATION, newcontext: PFLT_CONTEXT, oldcontext: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetVolumeContext(volume, operation, newcontext, oldcontext)

public actual fun FltSetVolumeInformation(instance: PFLT_INSTANCE, iosb: Long, fsinformation: Long, length: UInt, fsinformationclass: FS_INFORMATION_CLASS): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltSetVolumeInformation(instance, iosb, fsinformation, length.toInt(), fsinformationclass)

public actual fun FltStartFiltering(filter: PFLT_FILTER): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltStartFiltering(filter)

public actual fun FltSupportsFileContexts(fileobject: Long): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltSupportsFileContexts(fileobject)

public actual fun FltSupportsFileContextsEx(fileobject: Long, instance: PFLT_INSTANCE): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltSupportsFileContextsEx(fileobject, instance)

public actual fun FltSupportsStreamContexts(fileobject: Long): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltSupportsStreamContexts(fileobject)

public actual fun FltSupportsStreamHandleContexts(fileobject: Long): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltSupportsStreamHandleContexts(fileobject)

public actual fun FltTagFile(initiatinginstance: PFLT_INSTANCE, fileobject: Long, filetag: UInt, guid: Long, databuffer: Long, databufferlength: UShort): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltTagFile(initiatinginstance, fileobject, filetag.toInt(), guid, databuffer, databufferlength.toShort())

public actual fun FltTagFileEx(initiatinginstance: PFLT_INSTANCE, fileobject: Long, filetag: UInt, guid: Long, databuffer: Long, databufferlength: UShort, existingfiletag: UInt, existingguid: Long, flags: UInt): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltTagFileEx(initiatinginstance, fileobject, filetag.toInt(), guid, databuffer, databufferlength.toShort(), existingfiletag.toInt(), existingguid, flags.toInt())

public actual fun FltUninitializeFileLock(filelock: Long) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltUninitializeFileLock(filelock)
}

public actual fun FltUninitializeOplock(oplock: Long) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltUninitializeOplock(oplock)
}

public actual fun FltUnloadFilter(filtername: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltUnloadFilter(filtername)

public actual fun FltUnregisterFilter(filter: PFLT_FILTER) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltUnregisterFilter(filter)
}

public actual fun FltUntagFile(initiatinginstance: PFLT_INSTANCE, fileobject: Long, filetag: UInt, guid: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltUntagFile(initiatinginstance, fileobject, filetag.toInt(), guid)

public actual fun FltVetoBypassIo(callbackdata: Long, fltobjects: Long, operationstatus: NTSTATUS, failurereason: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltVetoBypassIo(callbackdata, fltobjects, operationstatus, failurereason)

public actual fun FltWriteFile(initiatinginstance: PFLT_INSTANCE, fileobject: Long, byteoffset: Long, length: UInt, buffer: Long, flags: UInt, byteswritten: Long, callbackroutine: PFLT_COMPLETED_ASYNC_IO_CALLBACK, callbackcontext: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltWriteFile(initiatinginstance, fileobject, byteoffset, length.toInt(), buffer, flags.toInt(), byteswritten, callbackroutine.toLong(), callbackcontext)

public actual fun FltWriteFileEx(initiatinginstance: PFLT_INSTANCE, fileobject: Long, byteoffset: Long, length: UInt, buffer: Long, flags: UInt, byteswritten: Long, callbackroutine: PFLT_COMPLETED_ASYNC_IO_CALLBACK, callbackcontext: Long, key: Long, mdl: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltWriteFileEx(initiatinginstance, fileobject, byteoffset, length.toInt(), buffer, flags.toInt(), byteswritten, callbackroutine.toLong(), callbackcontext, key, mdl)

public actual fun FltpTraceRedirectedFileIo(originatingfileobject: Long, childcallbackdata: Long): NTSTATUS =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssys_windows_wdk_storage_filesystem_minifilters_FltpTraceRedirectedFileIo(originatingfileobject, childcallbackdata)
