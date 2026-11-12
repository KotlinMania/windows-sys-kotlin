@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object WindowsWdkStorageFilesystemMinifiltersJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltAcknowledgeEcp(filter: Long, ecpcontext: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockExclusive(pushlock: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockExclusiveEx(pushlock: Long, flags: Int)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockShared(pushlock: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockSharedEx(pushlock: Long, flags: Int)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquireResourceExclusive(resource: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquireResourceShared(resource: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltAddOpenReparseEntry(filter: Long, data: Long, openreparseentry: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltAdjustDeviceStackSizeForIoRedirection(sourceinstance: Long, targetinstance: Long, sourcedevicestacksizemodified: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateCallbackData(instance: Long, fileobject: Long, retnewcallbackdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateCallbackDataEx(instance: Long, fileobject: Long, flags: Int, retnewcallbackdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateContext(filter: Long, contexttype: Short, contextsize: Long, pooltype: Int, returnedcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateDeferredIoWorkItem(): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateExtraCreateParameter(filter: Long, ecptype: Long, sizeofcontext: Int, flags: Int, cleanupcallback: Long, pooltag: Int, ecpcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateExtraCreateParameterFromLookasideList(filter: Long, ecptype: Long, sizeofcontext: Int, flags: Int, cleanupcallback: Long, lookasidelist: Long, ecpcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateExtraCreateParameterList(filter: Long, flags: Int, ecplist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateFileLock(completelockcallbackdataroutine: Long, unlockroutine: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateGenericWorkItem(): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocatePoolAlignedWithTag(instance: Long, pooltype: Int, numberofbytes: Long, tag: Int): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltApplyPriorityInfoThread(inputpriorityinfo: Long, outputpriorityinfo: Long, thread: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltAttachVolume(filter: Long, volume: Long, instancename: Long, retinstance: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltAttachVolumeAtAltitude(filter: Long, volume: Long, altitude: Long, instancename: Long, retinstance: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltBuildDefaultSecurityDescriptor(securitydescriptor: Long, desiredaccess: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCancelFileOpen(instance: Long, fileobject: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCancelIo(callbackdata: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCancellableWaitForMultipleObjects(count: Int, objectarray: Long, waittype: Int, timeout: Long, waitblockarray: Long, callbackdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCancellableWaitForSingleObject(obj: Long, timeout: Long, callbackdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqDisable(cbdq: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqEnable(cbdq: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqInitialize(instance: Long, cbdq: Long, cbdqinsertio: Long, cbdqremoveio: Long, cbdqpeeknextio: Long, cbdqacquire: Long, cbdqrelease: Long, cbdqcompletecanceledio: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqInsertIo(cbdq: Long, cbd: Long, context: Long, insertcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqRemoveIo(cbdq: Long, context: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqRemoveNextIo(cbdq: Long, peekcontext: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckAndGrowNameControl(namectrl: Long, newsize: Short): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckLockForReadAccess(filelock: Long, callbackdata: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckLockForWriteAccess(filelock: Long, callbackdata: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckOplock(oplock: Long, callbackdata: Long, context: Long, waitcompletionroutine: Long, prepostcallbackdataroutine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckOplockEx(oplock: Long, callbackdata: Long, flags: Int, context: Long, waitcompletionroutine: Long, prepostcallbackdataroutine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltClearCallbackDataDirty(data: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltClearCancelCompletion(callbackdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltClose(filehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCloseClientPort(filter: Long, clientport: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCloseCommunicationPort(serverport: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCloseSectionForDataScan(sectioncontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCommitComplete(instance: Long, transaction: Long, transactioncontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCommitFinalizeComplete(instance: Long, transaction: Long, transactioncontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCompareInstanceAltitudes(instance1: Long, instance2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCompletePendedPostOperation(callbackdata: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCompletePendedPreOperation(callbackdata: Long, callbackstatus: Int, context: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCopyOpenReparseList(filter: Long, data: Long, ecplist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateCommunicationPort(filter: Long, serverport: Long, objectattributes: Long, serverportcookie: Long, connectnotifycallback: Long, disconnectnotifycallback: Long, messagenotifycallback: Long, maxconnections: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateFile(filter: Long, instance: Long, filehandle: Long, desiredaccess: Int, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: Int, shareaccess: Int, createdisposition: Int, createoptions: Int, eabuffer: Long, ealength: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateFileEx(filter: Long, instance: Long, filehandle: Long, fileobject: Long, desiredaccess: Int, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: Int, shareaccess: Int, createdisposition: Int, createoptions: Int, eabuffer: Long, ealength: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateFileEx2(filter: Long, instance: Long, filehandle: Long, fileobject: Long, desiredaccess: Int, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: Int, shareaccess: Int, createdisposition: Int, createoptions: Int, eabuffer: Long, ealength: Int, flags: Int, drivercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateMailslotFile(filter: Long, instance: Long, filehandle: Long, fileobject: Long, desiredaccess: Int, objectattributes: Long, iostatusblock: Long, createoptions: Int, mailslotquota: Int, maximummessagesize: Int, readtimeout: Long, drivercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateNamedPipeFile(filter: Long, instance: Long, filehandle: Long, fileobject: Long, desiredaccess: Int, objectattributes: Long, iostatusblock: Long, shareaccess: Int, createdisposition: Int, createoptions: Int, namedpipetype: Int, readmode: Int, completionmode: Int, maximuminstances: Int, inboundquota: Int, outboundquota: Int, defaulttimeout: Long, drivercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateSectionForDataScan(instance: Long, fileobject: Long, sectioncontext: Long, desiredaccess: Int, objectattributes: Long, maximumsize: Long, sectionpageprotection: Int, allocationattributes: Int, flags: Int, sectionhandle: Long, sectionobject: Long, sectionfilesize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateSystemVolumeInformationFolder(instance: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCurrentBatchOplock(oplock: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCurrentOplock(oplock: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCurrentOplockH(oplock: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltDecodeParameters(callbackdata: Long, mdladdresspointer: Long, buffer: Long, length: Long, desiredaccess: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteContext(context: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteExtraCreateParameterLookasideList(filter: Long, lookaside: Long, flags: Int)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteFileContext(instance: Long, fileobject: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteInstanceContext(instance: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltDeletePushLock(pushlock: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteStreamContext(instance: Long, fileobject: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteStreamHandleContext(instance: Long, fileobject: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteTransactionContext(instance: Long, transaction: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteVolumeContext(filter: Long, volume: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltDetachVolume(filter: Long, volume: Long, instancename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltDeviceIoControlFile(instance: Long, fileobject: Long, iocontrolcode: Int, inputbuffer: Long, inputbufferlength: Int, outputbuffer: Long, outputbufferlength: Int, lengthreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltDoCompletionProcessingWhenSafe(data: Long, fltobjects: Long, completioncontext: Long, flags: Int, safepostcallback: Long, retpostoperationstatus: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltEnlistInTransaction(instance: Long, transaction: Long, transactioncontext: Long, notificationmask: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateFilterInformation(index: Int, informationclass: Int, buffer: Long, buffersize: Int, bytesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateFilters(filterlist: Long, filterlistsize: Int, numberfiltersreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByDeviceObject(deviceobject: Long, index: Int, informationclass: Int, buffer: Long, buffersize: Int, bytesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByFilter(filter: Long, index: Int, informationclass: Int, buffer: Long, buffersize: Int, bytesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByVolume(volume: Long, index: Int, informationclass: Int, buffer: Long, buffersize: Int, bytesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByVolumeName(volumename: Long, index: Int, informationclass: Int, buffer: Long, buffersize: Int, bytesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstances(volume: Long, filter: Long, instancelist: Long, instancelistsize: Int, numberinstancesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateVolumeInformation(filter: Long, index: Int, informationclass: Int, buffer: Long, buffersize: Int, bytesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateVolumes(filter: Long, volumelist: Long, volumelistsize: Int, numbervolumesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoMdlRead(initiatinginstance: Long, fileobject: Long, fileoffset: Long, length: Int, lockkey: Int, mdlchain: Long, iostatus: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoMdlReadComplete(initiatinginstance: Long, fileobject: Long, mdlchain: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoMdlWriteComplete(initiatinginstance: Long, fileobject: Long, fileoffset: Long, mdlchain: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoPrepareMdlWrite(initiatinginstance: Long, fileobject: Long, fileoffset: Long, length: Int, lockkey: Int, mdlchain: Long, iostatus: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltFindExtraCreateParameter(filter: Long, ecplist: Long, ecptype: Long, ecpcontext: Long, ecpcontextsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltFlushBuffers(instance: Long, fileobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltFlushBuffers2(instance: Long, fileobject: Long, flushtype: Int, callbackdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeCallbackData(callbackdata: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeDeferredIoWorkItem(fltworkitem: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeExtraCreateParameter(filter: Long, ecpcontext: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeExtraCreateParameterList(filter: Long, ecplist: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeFileLock(filelock: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeGenericWorkItem(fltworkitem: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeOpenReparseList(filter: Long, ecplist: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltFreePoolAlignedWithTag(instance: Long, buffer: Long, tag: Int)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeSecurityDescriptor(securitydescriptor: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltFsControlFile(instance: Long, fileobject: Long, fscontrolcode: Int, inputbuffer: Long, inputbufferlength: Int, outputbuffer: Long, outputbufferlength: Int, lengthreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetActivityIdCallbackData(callbackdata: Long, guid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetBottomInstance(volume: Long, instance: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetContexts(fltobjects: Long, desiredcontexts: Short, contexts: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetContextsEx(fltobjects: Long, desiredcontexts: Short, contextssize: Long, contexts: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetDestinationFileNameInformation(instance: Long, fileobject: Long, rootdirectory: Long, filename: Long, filenamelength: Int, nameoptions: Int, retfilenameinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetDeviceObject(volume: Long, deviceobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetDiskDeviceObject(volume: Long, diskdeviceobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetEcpListFromCallbackData(filter: Long, callbackdata: Long, ecplist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileContext(instance: Long, fileobject: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileNameInformation(callbackdata: Long, nameoptions: Int, filenameinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileNameInformationUnsafe(fileobject: Long, instance: Long, nameoptions: Int, filenameinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileSystemType(fltobject: Long, filesystemtype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFilterFromInstance(instance: Long, retfilter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFilterFromName(filtername: Long, retfilter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFilterInformation(filter: Long, informationclass: Int, buffer: Long, buffersize: Int, bytesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFsZeroingOffset(data: Long, zeroingoffset: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetInstanceContext(instance: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetInstanceInformation(instance: Long, informationclass: Int, buffer: Long, buffersize: Int, bytesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoAttributionHandleFromCallbackData(data: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHint(data: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHintFromCallbackData(data: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHintFromFileObject(fileobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHintFromThread(thread: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIrpName(irpmajorcode: Byte): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetLowerInstance(currentinstance: Long, lowerinstance: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetNewSystemBufferAddress(callbackdata: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetNextExtraCreateParameter(filter: Long, ecplist: Long, currentecpcontext: Long, nextecptype: Long, nextecpcontext: Long, nextecpcontextsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorProcess(callbackdata: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorProcessId(callbackdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorProcessIdEx(callbackdata: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorSessionId(callbackdata: Long, sessionid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRoutineAddress(fltmgrroutinename: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetSectionContext(instance: Long, fileobject: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetStreamContext(instance: Long, fileobject: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetStreamHandleContext(instance: Long, fileobject: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetSwappedBufferMdlAddress(callbackdata: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetTopInstance(volume: Long, instance: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetTransactionContext(instance: Long, transaction: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetTunneledName(callbackdata: Long, filenameinformation: Long, rettunneledfilenameinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetUpperInstance(currentinstance: Long, upperinstance: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeContext(filter: Long, volume: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromDeviceObject(filter: Long, deviceobject: Long, retvolume: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromFileObject(filter: Long, fileobject: Long, retvolume: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromInstance(instance: Long, retvolume: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromName(filter: Long, volumename: Long, retvolume: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeGuidName(volume: Long, volumeguidname: Long, buffersizeneeded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeInformation(volume: Long, informationclass: Int, buffer: Long, buffersize: Int, bytesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeInstanceFromName(filter: Long, volume: Long, instancename: Long, retinstance: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeName(volume: Long, volumename: Long, buffersizeneeded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeProperties(volume: Long, volumeproperties: Long, volumepropertieslength: Int, lengthreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltInitExtraCreateParameterLookasideList(filter: Long, lookaside: Long, flags: Int, size: Long, tag: Int)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltInitializeFileLock(filelock: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltInitializeOplock(oplock: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltInitializePushLock(pushlock: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltInsertExtraCreateParameter(filter: Long, ecplist: Long, ecpcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltIs32bitProcess(callbackdata: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltIsCallbackDataDirty(data: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltIsDirectory(fileobject: Long, instance: Long, isdirectory: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltIsEcpAcknowledged(filter: Long, ecpcontext: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltIsEcpFromUserMode(filter: Long, ecpcontext: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltIsFltMgrVolumeDeviceObject(deviceobject: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltIsIoCanceled(callbackdata: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltIsIoRedirectionAllowed(sourceinstance: Long, targetinstance: Long, redirectionallowed: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltIsIoRedirectionAllowedForOperation(data: Long, targetinstance: Long, redirectionallowedthisio: Long, redirectionallowedallio: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltIsOperationSynchronous(callbackdata: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltIsVolumeSnapshot(fltobject: Long, issnapshotvolume: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltIsVolumeWritable(fltobject: Long, iswritable: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltLoadFilter(filtername: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltLockUserBuffer(callbackdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltObjectDereference(fltobject: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltObjectReference(fltobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltOpenVolume(instance: Long, volumehandle: Long, volumefileobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockBreakH(oplock: Long, callbackdata: Long, flags: Int, context: Long, waitcompletionroutine: Long, prepostcallbackdataroutine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockBreakToNone(oplock: Long, callbackdata: Long, context: Long, waitcompletionroutine: Long, prepostcallbackdataroutine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockBreakToNoneEx(oplock: Long, callbackdata: Long, flags: Int, context: Long, waitcompletionroutine: Long, prepostcallbackdataroutine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockFsctrl(oplock: Long, callbackdata: Long, opencount: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockFsctrlEx(oplock: Long, callbackdata: Long, opencount: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockIsFastIoPossible(oplock: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockIsSharedRequest(callbackdata: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockKeysEqual(fo1: Long, fo2: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltParseFileName(filename: Long, extension: Long, stream: Long, finalcomponent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltParseFileNameInformation(filenameinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltPerformAsynchronousIo(callbackdata: Long, callbackroutine: Long, callbackcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltPerformSynchronousIo(callbackdata: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltPrePrepareComplete(instance: Long, transaction: Long, transactioncontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltPrepareComplete(instance: Long, transaction: Long, transactioncontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltPrepareToReuseEcp(filter: Long, ecpcontext: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltProcessFileLock(filelock: Long, callbackdata: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltPropagateActivityIdToThread(callbackdata: Long, propagateid: Long, originalid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltPropagateIrpExtension(sourcedata: Long, targetdata: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltPurgeFileNameInformationCache(instance: Long, fileobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryDirectoryFile(instance: Long, fileobject: Long, fileinformation: Long, length: Int, fileinformationclass: Int, returnsingleentry: Boolean, filename: Long, restartscan: Boolean, lengthreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryDirectoryFileEx(instance: Long, fileobject: Long, fileinformation: Long, length: Int, fileinformationclass: Int, queryflags: Int, filename: Long, lengthreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryEaFile(instance: Long, fileobject: Long, returnedeadata: Long, length: Int, returnsingleentry: Boolean, ealist: Long, ealistlength: Int, eaindex: Long, restartscan: Boolean, lengthreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryInformationByName(filter: Long, instance: Long, objectattributes: Long, iostatusblock: Long, fileinformation: Long, length: Int, fileinformationclass: Int, drivercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryInformationFile(instance: Long, fileobject: Long, fileinformation: Long, length: Int, fileinformationclass: Int, lengthreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryQuotaInformationFile(instance: Long, fileobject: Long, iostatusblock: Long, buffer: Long, length: Int, returnsingleentry: Boolean, sidlist: Long, sidlistlength: Int, startsid: Long, restartscan: Boolean, lengthreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltQuerySecurityObject(instance: Long, fileobject: Long, securityinformation: Int, securitydescriptor: Long, length: Int, lengthneeded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryVolumeInformation(instance: Long, iosb: Long, fsinformation: Long, length: Int, fsinformationclass: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryVolumeInformationFile(instance: Long, fileobject: Long, fsinformation: Long, length: Int, fsinformationclass: Int, lengthreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltQueueDeferredIoWorkItem(fltworkitem: Long, data: Long, workerroutine: Long, queuetype: Int, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltQueueGenericWorkItem(fltworkitem: Long, fltobject: Long, workerroutine: Long, queuetype: Int, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltReadFile(initiatinginstance: Long, fileobject: Long, byteoffset: Long, length: Int, buffer: Long, flags: Int, bytesread: Long, callbackroutine: Long, callbackcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltReadFileEx(initiatinginstance: Long, fileobject: Long, byteoffset: Long, length: Int, buffer: Long, flags: Int, bytesread: Long, callbackroutine: Long, callbackcontext: Long, key: Long, mdl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltReferenceContext(context: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltReferenceFileNameInformation(filenameinformation: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltRegisterFilter(driver: Long, registration: Long, retfilter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltRegisterForDataScan(instance: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltReissueSynchronousIo(initiatinginstance: Long, callbackdata: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseContext(context: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseContexts(contexts: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseContextsEx(contextssize: Long, contexts: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseFileNameInformation(filenameinformation: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltReleasePushLock(pushlock: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltReleasePushLockEx(pushlock: Long, flags: Int)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseResource(resource: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltRemoveExtraCreateParameter(filter: Long, ecplist: Long, ecptype: Long, ecpcontext: Long, ecpcontextsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltRemoveOpenReparseEntry(filter: Long, data: Long, openreparseentry: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltRequestFileInfoOnCreateCompletion(filter: Long, data: Long, infoclassflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltRequestOperationStatusCallback(data: Long, callbackroutine: Long, requestercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltRetainSwappedBufferMdlAddress(callbackdata: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltRetrieveFileInfoOnCreateCompletion(filter: Long, data: Long, infoclass: Int, size: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltRetrieveFileInfoOnCreateCompletionEx(filter: Long, data: Long, infoclass: Int, retinfosize: Long, retinfobuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltRetrieveIoPriorityInfo(data: Long, fileobject: Long, thread: Long, priorityinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltReuseCallbackData(callbackdata: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltRollbackComplete(instance: Long, transaction: Long, transactioncontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltRollbackEnlistment(instance: Long, transaction: Long, transactioncontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSendMessage(filter: Long, clientport: Long, senderbuffer: Long, senderbufferlength: Int, replybuffer: Long, replylength: Long, timeout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSetActivityIdCallbackData(callbackdata: Long, guid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSetCallbackDataDirty(data: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSetCancelCompletion(callbackdata: Long, canceledcallback: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSetEaFile(instance: Long, fileobject: Long, eabuffer: Long, length: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSetEcpListIntoCallbackData(filter: Long, callbackdata: Long, ecplist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSetFileContext(instance: Long, fileobject: Long, operation: Int, newcontext: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSetFsZeroingOffset(data: Long, zeroingoffset: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSetFsZeroingOffsetRequired(data: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSetInformationFile(instance: Long, fileobject: Long, fileinformation: Long, length: Int, fileinformationclass: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSetInstanceContext(instance: Long, operation: Int, newcontext: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSetIoPriorityHintIntoCallbackData(data: Long, priorityhint: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSetIoPriorityHintIntoFileObject(fileobject: Long, priorityhint: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSetIoPriorityHintIntoThread(thread: Long, priorityhint: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSetQuotaInformationFile(instance: Long, fileobject: Long, buffer: Long, length: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSetSecurityObject(instance: Long, fileobject: Long, securityinformation: Int, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSetStreamContext(instance: Long, fileobject: Long, operation: Int, newcontext: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSetStreamHandleContext(instance: Long, fileobject: Long, operation: Int, newcontext: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSetTransactionContext(instance: Long, transaction: Long, operation: Int, newcontext: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSetVolumeContext(volume: Long, operation: Int, newcontext: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSetVolumeInformation(instance: Long, iosb: Long, fsinformation: Long, length: Int, fsinformationclass: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltStartFiltering(filter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsFileContexts(fileobject: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsFileContextsEx(fileobject: Long, instance: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsStreamContexts(fileobject: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsStreamHandleContexts(fileobject: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltTagFile(initiatinginstance: Long, fileobject: Long, filetag: Int, guid: Long, databuffer: Long, databufferlength: Short): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltTagFileEx(initiatinginstance: Long, fileobject: Long, filetag: Int, guid: Long, databuffer: Long, databufferlength: Short, existingfiletag: Int, existingguid: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltUninitializeFileLock(filelock: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltUninitializeOplock(oplock: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltUnloadFilter(filtername: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltUnregisterFilter(filter: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltUntagFile(initiatinginstance: Long, fileobject: Long, filetag: Int, guid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltVetoBypassIo(callbackdata: Long, fltobjects: Long, operationstatus: Int, failurereason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltWriteFile(initiatinginstance: Long, fileobject: Long, byteoffset: Long, length: Int, buffer: Long, flags: Int, byteswritten: Long, callbackroutine: Long, callbackcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltWriteFileEx(initiatinginstance: Long, fileobject: Long, byteoffset: Long, length: Int, buffer: Long, flags: Int, byteswritten: Long, callbackroutine: Long, callbackcontext: Long, key: Long, mdl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltpTraceRedirectedFileIo(originatingfileobject: Long, childcallbackdata: Long): Int
}

public actual fun fltAcknowledgeEcp(filter: PfltFilter, ecpcontext: ConstPtr) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltAcknowledgeEcp(filter, ecpcontext.rawAddress)
}

public actual fun fltAcquirePushLockExclusive(pushlock: MutPtr) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockExclusive(pushlock.rawAddress)
}

public actual fun fltAcquirePushLockExclusiveEx(pushlock: MutPtr, flags: UInt) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockExclusiveEx(pushlock.rawAddress, flags.toInt())
}

public actual fun fltAcquirePushLockShared(pushlock: MutPtr) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockShared(pushlock.rawAddress)
}

public actual fun fltAcquirePushLockSharedEx(pushlock: MutPtr, flags: UInt) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockSharedEx(pushlock.rawAddress, flags.toInt())
}

public actual fun fltAcquireResourceExclusive(resource: MutPtr) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquireResourceExclusive(resource.rawAddress)
}

public actual fun fltAcquireResourceShared(resource: MutPtr) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquireResourceShared(resource.rawAddress)
}

public actual fun fltAddOpenReparseEntry(filter: PfltFilter, data: ConstPtr, openreparseentry: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltAddOpenReparseEntry(filter, data.rawAddress, openreparseentry.rawAddress)

public actual fun fltAdjustDeviceStackSizeForIoRedirection(sourceinstance: PfltInstance, targetinstance: PfltInstance, sourcedevicestacksizemodified: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltAdjustDeviceStackSizeForIoRedirection(sourceinstance, targetinstance, sourcedevicestacksizemodified.rawAddress)

public actual fun fltAllocateCallbackData(instance: PfltInstance, fileobject: ConstPtr, retnewcallbackdata: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateCallbackData(instance, fileobject.rawAddress, retnewcallbackdata.rawAddress)

public actual fun fltAllocateCallbackDataEx(instance: PfltInstance, fileobject: ConstPtr, flags: UInt, retnewcallbackdata: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateCallbackDataEx(instance, fileobject.rawAddress, flags.toInt(), retnewcallbackdata.rawAddress)

public actual fun fltAllocateContext(filter: PfltFilter, contexttype: UShort, contextsize: ULong, pooltype: PoolType, returnedcontext: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateContext(filter, contexttype.toShort(), contextsize.toLong(), pooltype, returnedcontext.rawAddress)

public actual fun fltAllocateDeferredIoWorkItem(): PfltDeferredIoWorkitem =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateDeferredIoWorkItem()

public actual fun fltAllocateExtraCreateParameter(filter: PfltFilter, ecptype: ConstPtr, sizeofcontext: UInt, flags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, pooltag: UInt, ecpcontext: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateExtraCreateParameter(filter, ecptype.rawAddress, sizeofcontext.toInt(), flags.toInt(), 0L, pooltag.toInt(), ecpcontext.rawAddress)

public actual fun fltAllocateExtraCreateParameterFromLookasideList(filter: PfltFilter, ecptype: ConstPtr, sizeofcontext: UInt, flags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, lookasidelist: MutPtr, ecpcontext: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateExtraCreateParameterFromLookasideList(filter, ecptype.rawAddress, sizeofcontext.toInt(), flags.toInt(), 0L, lookasidelist.rawAddress, ecpcontext.rawAddress)

public actual fun fltAllocateExtraCreateParameterList(filter: PfltFilter, flags: UInt, ecplist: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateExtraCreateParameterList(filter, flags.toInt(), ecplist.rawAddress)

public actual fun fltAllocateFileLock(completelockcallbackdataroutine: PfltCompleteLockCallbackDataRoutine, unlockroutine: PunlockRoutine): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateFileLock(0L, 0L))

public actual fun fltAllocateGenericWorkItem(): PfltGenericWorkitem =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateGenericWorkItem()

public actual fun fltAllocatePoolAlignedWithTag(instance: PfltInstance, pooltype: PoolType, numberofbytes: ULong, tag: UInt): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocatePoolAlignedWithTag(instance, pooltype, numberofbytes.toLong(), tag.toInt()))

public actual fun fltApplyPriorityInfoThread(inputpriorityinfo: ConstPtr, outputpriorityinfo: MutPtr, thread: Pethread): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltApplyPriorityInfoThread(inputpriorityinfo.rawAddress, outputpriorityinfo.rawAddress, thread)

public actual fun fltAttachVolume(filter: PfltFilter, volume: PfltVolume, instancename: ConstPtr, retinstance: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltAttachVolume(filter, volume, instancename.rawAddress, retinstance.rawAddress)

public actual fun fltAttachVolumeAtAltitude(filter: PfltFilter, volume: PfltVolume, altitude: ConstPtr, instancename: ConstPtr, retinstance: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltAttachVolumeAtAltitude(filter, volume, altitude.rawAddress, instancename.rawAddress, retinstance.rawAddress)

public actual fun fltBuildDefaultSecurityDescriptor(securitydescriptor: MutPtr, desiredaccess: UInt): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltBuildDefaultSecurityDescriptor(securitydescriptor.rawAddress, desiredaccess.toInt())

public actual fun fltCancelFileOpen(instance: PfltInstance, fileobject: ConstPtr) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCancelFileOpen(instance, fileobject.rawAddress)
}

public actual fun fltCancelIo(callbackdata: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCancelIo(callbackdata.rawAddress)

public actual fun fltCancellableWaitForMultipleObjects(count: UInt, objectarray: ConstPtr, waittype: WaitType, timeout: ConstPtr, waitblockarray: ConstPtr, callbackdata: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCancellableWaitForMultipleObjects(count.toInt(), objectarray.rawAddress, waittype, timeout.rawAddress, waitblockarray.rawAddress, callbackdata.rawAddress)

public actual fun fltCancellableWaitForSingleObject(obj: ConstPtr, timeout: ConstPtr, callbackdata: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCancellableWaitForSingleObject(obj.rawAddress, timeout.rawAddress, callbackdata.rawAddress)

public actual fun fltCbdqDisable(cbdq: MutPtr) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqDisable(cbdq.rawAddress)
}

public actual fun fltCbdqEnable(cbdq: MutPtr) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqEnable(cbdq.rawAddress)
}

public actual fun fltCbdqInitialize(instance: PfltInstance, cbdq: MutPtr, cbdqinsertio: PfltCallbackDataQueueInsertIo, cbdqremoveio: PfltCallbackDataQueueRemoveIo, cbdqpeeknextio: PfltCallbackDataQueuePeekNextIo, cbdqacquire: PfltCallbackDataQueueAcquire, cbdqrelease: PfltCallbackDataQueueRelease, cbdqcompletecanceledio: PfltCallbackDataQueueCompleteCanceledIo): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqInitialize(instance, cbdq.rawAddress, 0L, 0L, 0L, 0L, 0L, 0L)

public actual fun fltCbdqInsertIo(cbdq: MutPtr, cbd: ConstPtr, context: ConstPtr, insertcontext: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqInsertIo(cbdq.rawAddress, cbd.rawAddress, context.rawAddress, insertcontext.rawAddress)

public actual fun fltCbdqRemoveIo(cbdq: MutPtr, context: ConstPtr): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqRemoveIo(cbdq.rawAddress, context.rawAddress))

public actual fun fltCbdqRemoveNextIo(cbdq: MutPtr, peekcontext: ConstPtr): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqRemoveNextIo(cbdq.rawAddress, peekcontext.rawAddress))

public actual fun fltCheckAndGrowNameControl(namectrl: MutPtr, newsize: UShort): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckAndGrowNameControl(namectrl.rawAddress, newsize.toShort())

public actual fun fltCheckLockForReadAccess(filelock: ConstPtr, callbackdata: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckLockForReadAccess(filelock.rawAddress, callbackdata.rawAddress)

public actual fun fltCheckLockForWriteAccess(filelock: ConstPtr, callbackdata: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckLockForWriteAccess(filelock.rawAddress, callbackdata.rawAddress)

public actual fun fltCheckOplock(oplock: ConstPtr, callbackdata: ConstPtr, context: ConstPtr, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckOplock(oplock.rawAddress, callbackdata.rawAddress, context.rawAddress, 0L, 0L)

public actual fun fltCheckOplockEx(oplock: ConstPtr, callbackdata: ConstPtr, flags: UInt, context: ConstPtr, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckOplockEx(oplock.rawAddress, callbackdata.rawAddress, flags.toInt(), context.rawAddress, 0L, 0L)

public actual fun fltClearCallbackDataDirty(data: MutPtr) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltClearCallbackDataDirty(data.rawAddress)
}

public actual fun fltClearCancelCompletion(callbackdata: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltClearCancelCompletion(callbackdata.rawAddress)

public actual fun fltClose(filehandle: Handle): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltClose(filehandle.rawAddress)

public actual fun fltCloseClientPort(filter: PfltFilter, clientport: MutPtr) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCloseClientPort(filter, clientport.rawAddress)
}

public actual fun fltCloseCommunicationPort(serverport: PfltPort) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCloseCommunicationPort(serverport)
}

public actual fun fltCloseSectionForDataScan(sectioncontext: PfltContext): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCloseSectionForDataScan(sectioncontext.rawAddress)

public actual fun fltCommitComplete(instance: PfltInstance, transaction: ConstPtr, transactioncontext: PfltContext): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCommitComplete(instance, transaction.rawAddress, transactioncontext.rawAddress)

public actual fun fltCommitFinalizeComplete(instance: PfltInstance, transaction: ConstPtr, transactioncontext: PfltContext): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCommitFinalizeComplete(instance, transaction.rawAddress, transactioncontext.rawAddress)

public actual fun fltCompareInstanceAltitudes(instance1: PfltInstance, instance2: PfltInstance): Int =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCompareInstanceAltitudes(instance1, instance2)

public actual fun fltCompletePendedPostOperation(callbackdata: ConstPtr) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCompletePendedPostOperation(callbackdata.rawAddress)
}

public actual fun fltCompletePendedPreOperation(callbackdata: ConstPtr, callbackstatus: FltPreopCallbackStatus, context: ConstPtr) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCompletePendedPreOperation(callbackdata.rawAddress, callbackstatus, context.rawAddress)
}

public actual fun fltCopyOpenReparseList(filter: PfltFilter, data: ConstPtr, ecplist: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCopyOpenReparseList(filter, data.rawAddress, ecplist.rawAddress)

public actual fun fltCreateCommunicationPort(filter: PfltFilter, serverport: MutPtr, objectattributes: ConstPtr, serverportcookie: ConstPtr, connectnotifycallback: PfltConnectNotify, disconnectnotifycallback: PfltDisconnectNotify, messagenotifycallback: PfltMessageNotify, maxconnections: Int): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateCommunicationPort(filter, serverport.rawAddress, objectattributes.rawAddress, serverportcookie.rawAddress, 0L, 0L, 0L, maxconnections)

public actual fun fltCreateFile(filter: PfltFilter, instance: PfltInstance, filehandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, iostatusblock: MutPtr, allocationsize: ConstPtr, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: ConstPtr, ealength: UInt, flags: UInt): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateFile(filter, instance, filehandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, iostatusblock.rawAddress, allocationsize.rawAddress, fileattributes.toInt(), shareaccess.toInt(), createdisposition.toInt(), createoptions.toInt(), eabuffer.rawAddress, ealength.toInt(), flags.toInt())

public actual fun fltCreateFileEx(filter: PfltFilter, instance: PfltInstance, filehandle: MutPtr, fileobject: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, iostatusblock: MutPtr, allocationsize: ConstPtr, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: ConstPtr, ealength: UInt, flags: UInt): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateFileEx(filter, instance, filehandle.rawAddress, fileobject.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, iostatusblock.rawAddress, allocationsize.rawAddress, fileattributes.toInt(), shareaccess.toInt(), createdisposition.toInt(), createoptions.toInt(), eabuffer.rawAddress, ealength.toInt(), flags.toInt())

public actual fun fltCreateFileEx2(filter: PfltFilter, instance: PfltInstance, filehandle: MutPtr, fileobject: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, iostatusblock: MutPtr, allocationsize: ConstPtr, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: ConstPtr, ealength: UInt, flags: UInt, drivercontext: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateFileEx2(filter, instance, filehandle.rawAddress, fileobject.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, iostatusblock.rawAddress, allocationsize.rawAddress, fileattributes.toInt(), shareaccess.toInt(), createdisposition.toInt(), createoptions.toInt(), eabuffer.rawAddress, ealength.toInt(), flags.toInt(), drivercontext.rawAddress)

public actual fun fltCreateMailslotFile(filter: PfltFilter, instance: PfltInstance, filehandle: MutPtr, fileobject: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, iostatusblock: MutPtr, createoptions: UInt, mailslotquota: UInt, maximummessagesize: UInt, readtimeout: ConstPtr, drivercontext: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateMailslotFile(filter, instance, filehandle.rawAddress, fileobject.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, iostatusblock.rawAddress, createoptions.toInt(), mailslotquota.toInt(), maximummessagesize.toInt(), readtimeout.rawAddress, drivercontext.rawAddress)

public actual fun fltCreateNamedPipeFile(filter: PfltFilter, instance: PfltInstance, filehandle: MutPtr, fileobject: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, iostatusblock: MutPtr, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, namedpipetype: UInt, readmode: UInt, completionmode: UInt, maximuminstances: UInt, inboundquota: UInt, outboundquota: UInt, defaulttimeout: ConstPtr, drivercontext: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateNamedPipeFile(filter, instance, filehandle.rawAddress, fileobject.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, iostatusblock.rawAddress, shareaccess.toInt(), createdisposition.toInt(), createoptions.toInt(), namedpipetype.toInt(), readmode.toInt(), completionmode.toInt(), maximuminstances.toInt(), inboundquota.toInt(), outboundquota.toInt(), defaulttimeout.rawAddress, drivercontext.rawAddress)

public actual fun fltCreateSectionForDataScan(instance: PfltInstance, fileobject: ConstPtr, sectioncontext: PfltContext, desiredaccess: UInt, objectattributes: ConstPtr, maximumsize: ConstPtr, sectionpageprotection: UInt, allocationattributes: UInt, flags: UInt, sectionhandle: MutPtr, sectionobject: MutPtr, sectionfilesize: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateSectionForDataScan(instance, fileobject.rawAddress, sectioncontext.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, maximumsize.rawAddress, sectionpageprotection.toInt(), allocationattributes.toInt(), flags.toInt(), sectionhandle.rawAddress, sectionobject.rawAddress, sectionfilesize.rawAddress)

public actual fun fltCreateSystemVolumeInformationFolder(instance: PfltInstance): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateSystemVolumeInformationFolder(instance)

public actual fun fltCurrentBatchOplock(oplock: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCurrentBatchOplock(oplock.rawAddress)

public actual fun fltCurrentOplock(oplock: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCurrentOplock(oplock.rawAddress)

public actual fun fltCurrentOplockH(oplock: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCurrentOplockH(oplock.rawAddress)

public actual fun fltDecodeParameters(callbackdata: ConstPtr, mdladdresspointer: MutPtr, buffer: MutPtr, length: MutPtr, desiredaccess: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltDecodeParameters(callbackdata.rawAddress, mdladdresspointer.rawAddress, buffer.rawAddress, length.rawAddress, desiredaccess.rawAddress)

public actual fun fltDeleteContext(context: PfltContext) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteContext(context.rawAddress)
}

public actual fun fltDeleteExtraCreateParameterLookasideList(filter: PfltFilter, lookaside: MutPtr, flags: UInt) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteExtraCreateParameterLookasideList(filter, lookaside.rawAddress, flags.toInt())
}

public actual fun fltDeleteFileContext(instance: PfltInstance, fileobject: ConstPtr, oldcontext: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteFileContext(instance, fileobject.rawAddress, oldcontext.rawAddress)

public actual fun fltDeleteInstanceContext(instance: PfltInstance, oldcontext: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteInstanceContext(instance, oldcontext.rawAddress)

public actual fun fltDeletePushLock(pushlock: ConstPtr) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltDeletePushLock(pushlock.rawAddress)
}

public actual fun fltDeleteStreamContext(instance: PfltInstance, fileobject: ConstPtr, oldcontext: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteStreamContext(instance, fileobject.rawAddress, oldcontext.rawAddress)

public actual fun fltDeleteStreamHandleContext(instance: PfltInstance, fileobject: ConstPtr, oldcontext: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteStreamHandleContext(instance, fileobject.rawAddress, oldcontext.rawAddress)

public actual fun fltDeleteTransactionContext(instance: PfltInstance, transaction: ConstPtr, oldcontext: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteTransactionContext(instance, transaction.rawAddress, oldcontext.rawAddress)

public actual fun fltDeleteVolumeContext(filter: PfltFilter, volume: PfltVolume, oldcontext: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteVolumeContext(filter, volume, oldcontext.rawAddress)

public actual fun fltDetachVolume(filter: PfltFilter, volume: PfltVolume, instancename: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltDetachVolume(filter, volume, instancename.rawAddress)

public actual fun fltDeviceIoControlFile(instance: PfltInstance, fileobject: ConstPtr, iocontrolcode: UInt, inputbuffer: ConstPtr, inputbufferlength: UInt, outputbuffer: MutPtr, outputbufferlength: UInt, lengthreturned: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltDeviceIoControlFile(instance, fileobject.rawAddress, iocontrolcode.toInt(), inputbuffer.rawAddress, inputbufferlength.toInt(), outputbuffer.rawAddress, outputbufferlength.toInt(), lengthreturned.rawAddress)

public actual fun fltDoCompletionProcessingWhenSafe(data: ConstPtr, fltobjects: ConstPtr, completioncontext: ConstPtr, flags: UInt, safepostcallback: PfltPostOperationCallback, retpostoperationstatus: MutPtr): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltDoCompletionProcessingWhenSafe(data.rawAddress, fltobjects.rawAddress, completioncontext.rawAddress, flags.toInt(), 0L, retpostoperationstatus.rawAddress)

public actual fun fltEnlistInTransaction(instance: PfltInstance, transaction: ConstPtr, transactioncontext: PfltContext, notificationmask: UInt): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltEnlistInTransaction(instance, transaction.rawAddress, transactioncontext.rawAddress, notificationmask.toInt())

public actual fun fltEnumerateFilterInformation(index: UInt, informationclass: FilterInformationClass, buffer: MutPtr, buffersize: UInt, bytesreturned: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateFilterInformation(index.toInt(), informationclass, buffer.rawAddress, buffersize.toInt(), bytesreturned.rawAddress)

public actual fun fltEnumerateFilters(filterlist: MutPtr, filterlistsize: UInt, numberfiltersreturned: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateFilters(filterlist.rawAddress, filterlistsize.toInt(), numberfiltersreturned.rawAddress)

public actual fun fltEnumerateInstanceInformationByDeviceObject(deviceobject: ConstPtr, index: UInt, informationclass: InstanceInformationClass, buffer: MutPtr, buffersize: UInt, bytesreturned: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByDeviceObject(deviceobject.rawAddress, index.toInt(), informationclass, buffer.rawAddress, buffersize.toInt(), bytesreturned.rawAddress)

public actual fun fltEnumerateInstanceInformationByFilter(filter: PfltFilter, index: UInt, informationclass: InstanceInformationClass, buffer: MutPtr, buffersize: UInt, bytesreturned: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByFilter(filter, index.toInt(), informationclass, buffer.rawAddress, buffersize.toInt(), bytesreturned.rawAddress)

public actual fun fltEnumerateInstanceInformationByVolume(volume: PfltVolume, index: UInt, informationclass: InstanceInformationClass, buffer: MutPtr, buffersize: UInt, bytesreturned: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByVolume(volume, index.toInt(), informationclass, buffer.rawAddress, buffersize.toInt(), bytesreturned.rawAddress)

public actual fun fltEnumerateInstanceInformationByVolumeName(volumename: ConstPtr, index: UInt, informationclass: InstanceInformationClass, buffer: MutPtr, buffersize: UInt, bytesreturned: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByVolumeName(volumename.rawAddress, index.toInt(), informationclass, buffer.rawAddress, buffersize.toInt(), bytesreturned.rawAddress)

public actual fun fltEnumerateInstances(volume: PfltVolume, filter: PfltFilter, instancelist: MutPtr, instancelistsize: UInt, numberinstancesreturned: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstances(volume, filter, instancelist.rawAddress, instancelistsize.toInt(), numberinstancesreturned.rawAddress)

public actual fun fltEnumerateVolumeInformation(filter: PfltFilter, index: UInt, informationclass: FilterVolumeInformationClass, buffer: MutPtr, buffersize: UInt, bytesreturned: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateVolumeInformation(filter, index.toInt(), informationclass, buffer.rawAddress, buffersize.toInt(), bytesreturned.rawAddress)

public actual fun fltEnumerateVolumes(filter: PfltFilter, volumelist: MutPtr, volumelistsize: UInt, numbervolumesreturned: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateVolumes(filter, volumelist.rawAddress, volumelistsize.toInt(), numbervolumesreturned.rawAddress)

public actual fun fltFastIoMdlRead(initiatinginstance: PfltInstance, fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, lockkey: UInt, mdlchain: MutPtr, iostatus: MutPtr): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoMdlRead(initiatinginstance, fileobject.rawAddress, fileoffset.rawAddress, length.toInt(), lockkey.toInt(), mdlchain.rawAddress, iostatus.rawAddress)

public actual fun fltFastIoMdlReadComplete(initiatinginstance: PfltInstance, fileobject: ConstPtr, mdlchain: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoMdlReadComplete(initiatinginstance, fileobject.rawAddress, mdlchain.rawAddress)

public actual fun fltFastIoMdlWriteComplete(initiatinginstance: PfltInstance, fileobject: ConstPtr, fileoffset: ConstPtr, mdlchain: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoMdlWriteComplete(initiatinginstance, fileobject.rawAddress, fileoffset.rawAddress, mdlchain.rawAddress)

public actual fun fltFastIoPrepareMdlWrite(initiatinginstance: PfltInstance, fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, lockkey: UInt, mdlchain: MutPtr, iostatus: MutPtr): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoPrepareMdlWrite(initiatinginstance, fileobject.rawAddress, fileoffset.rawAddress, length.toInt(), lockkey.toInt(), mdlchain.rawAddress, iostatus.rawAddress)

public actual fun fltFindExtraCreateParameter(filter: PfltFilter, ecplist: ConstPtr, ecptype: ConstPtr, ecpcontext: MutPtr, ecpcontextsize: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltFindExtraCreateParameter(filter, ecplist.rawAddress, ecptype.rawAddress, ecpcontext.rawAddress, ecpcontextsize.rawAddress)

public actual fun fltFlushBuffers(instance: PfltInstance, fileobject: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltFlushBuffers(instance, fileobject.rawAddress)

public actual fun fltFlushBuffers2(instance: PfltInstance, fileobject: ConstPtr, flushtype: UInt, callbackdata: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltFlushBuffers2(instance, fileobject.rawAddress, flushtype.toInt(), callbackdata.rawAddress)

public actual fun fltFreeCallbackData(callbackdata: ConstPtr) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeCallbackData(callbackdata.rawAddress)
}

public actual fun fltFreeDeferredIoWorkItem(fltworkitem: PfltDeferredIoWorkitem) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeDeferredIoWorkItem(fltworkitem)
}

public actual fun fltFreeExtraCreateParameter(filter: PfltFilter, ecpcontext: ConstPtr) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeExtraCreateParameter(filter, ecpcontext.rawAddress)
}

public actual fun fltFreeExtraCreateParameterList(filter: PfltFilter, ecplist: ConstPtr) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeExtraCreateParameterList(filter, ecplist.rawAddress)
}

public actual fun fltFreeFileLock(filelock: ConstPtr) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeFileLock(filelock.rawAddress)
}

public actual fun fltFreeGenericWorkItem(fltworkitem: PfltGenericWorkitem) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeGenericWorkItem(fltworkitem)
}

public actual fun fltFreeOpenReparseList(filter: PfltFilter, ecplist: ConstPtr) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeOpenReparseList(filter, ecplist.rawAddress)
}

public actual fun fltFreePoolAlignedWithTag(instance: PfltInstance, buffer: ConstPtr, tag: UInt) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltFreePoolAlignedWithTag(instance, buffer.rawAddress, tag.toInt())
}

public actual fun fltFreeSecurityDescriptor(securitydescriptor: PsecurityDescriptor) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeSecurityDescriptor(securitydescriptor.rawAddress)
}

public actual fun fltFsControlFile(instance: PfltInstance, fileobject: ConstPtr, fscontrolcode: UInt, inputbuffer: ConstPtr, inputbufferlength: UInt, outputbuffer: MutPtr, outputbufferlength: UInt, lengthreturned: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltFsControlFile(instance, fileobject.rawAddress, fscontrolcode.toInt(), inputbuffer.rawAddress, inputbufferlength.toInt(), outputbuffer.rawAddress, outputbufferlength.toInt(), lengthreturned.rawAddress)

public actual fun fltGetActivityIdCallbackData(callbackdata: ConstPtr, guid: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetActivityIdCallbackData(callbackdata.rawAddress, guid.rawAddress)

public actual fun fltGetBottomInstance(volume: PfltVolume, instance: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetBottomInstance(volume, instance.rawAddress)

public actual fun fltGetContexts(fltobjects: ConstPtr, desiredcontexts: UShort, contexts: MutPtr) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetContexts(fltobjects.rawAddress, desiredcontexts.toShort(), contexts.rawAddress)
}

public actual fun fltGetContextsEx(fltobjects: ConstPtr, desiredcontexts: UShort, contextssize: ULong, contexts: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetContextsEx(fltobjects.rawAddress, desiredcontexts.toShort(), contextssize.toLong(), contexts.rawAddress)

public actual fun fltGetDestinationFileNameInformation(instance: PfltInstance, fileobject: ConstPtr, rootdirectory: Handle, filename: Pcwstr, filenamelength: UInt, nameoptions: UInt, retfilenameinformation: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetDestinationFileNameInformation(instance, fileobject.rawAddress, rootdirectory.rawAddress, filename.rawAddress, filenamelength.toInt(), nameoptions.toInt(), retfilenameinformation.rawAddress)

public actual fun fltGetDeviceObject(volume: PfltVolume, deviceobject: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetDeviceObject(volume, deviceobject.rawAddress)

public actual fun fltGetDiskDeviceObject(volume: PfltVolume, diskdeviceobject: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetDiskDeviceObject(volume, diskdeviceobject.rawAddress)

public actual fun fltGetEcpListFromCallbackData(filter: PfltFilter, callbackdata: ConstPtr, ecplist: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetEcpListFromCallbackData(filter, callbackdata.rawAddress, ecplist.rawAddress)

public actual fun fltGetFileContext(instance: PfltInstance, fileobject: ConstPtr, context: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileContext(instance, fileobject.rawAddress, context.rawAddress)

public actual fun fltGetFileNameInformation(callbackdata: ConstPtr, nameoptions: UInt, filenameinformation: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileNameInformation(callbackdata.rawAddress, nameoptions.toInt(), filenameinformation.rawAddress)

public actual fun fltGetFileNameInformationUnsafe(fileobject: ConstPtr, instance: PfltInstance, nameoptions: UInt, filenameinformation: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileNameInformationUnsafe(fileobject.rawAddress, instance, nameoptions.toInt(), filenameinformation.rawAddress)

public actual fun fltGetFileSystemType(fltobject: ConstPtr, filesystemtype: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileSystemType(fltobject.rawAddress, filesystemtype.rawAddress)

public actual fun fltGetFilterFromInstance(instance: PfltInstance, retfilter: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFilterFromInstance(instance, retfilter.rawAddress)

public actual fun fltGetFilterFromName(filtername: ConstPtr, retfilter: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFilterFromName(filtername.rawAddress, retfilter.rawAddress)

public actual fun fltGetFilterInformation(filter: PfltFilter, informationclass: FilterInformationClass, buffer: MutPtr, buffersize: UInt, bytesreturned: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFilterInformation(filter, informationclass, buffer.rawAddress, buffersize.toInt(), bytesreturned.rawAddress)

public actual fun fltGetFsZeroingOffset(data: ConstPtr, zeroingoffset: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFsZeroingOffset(data.rawAddress, zeroingoffset.rawAddress)

public actual fun fltGetInstanceContext(instance: PfltInstance, context: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetInstanceContext(instance, context.rawAddress)

public actual fun fltGetInstanceInformation(instance: PfltInstance, informationclass: InstanceInformationClass, buffer: MutPtr, buffersize: UInt, bytesreturned: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetInstanceInformation(instance, informationclass, buffer.rawAddress, buffersize.toInt(), bytesreturned.rawAddress)

public actual fun fltGetIoAttributionHandleFromCallbackData(data: ConstPtr): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoAttributionHandleFromCallbackData(data.rawAddress))

public actual fun fltGetIoPriorityHint(data: ConstPtr): IoPriorityHint =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHint(data.rawAddress)

public actual fun fltGetIoPriorityHintFromCallbackData(data: ConstPtr): IoPriorityHint =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHintFromCallbackData(data.rawAddress)

public actual fun fltGetIoPriorityHintFromFileObject(fileobject: ConstPtr): IoPriorityHint =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHintFromFileObject(fileobject.rawAddress)

public actual fun fltGetIoPriorityHintFromThread(thread: Pethread): IoPriorityHint =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHintFromThread(thread)

public actual fun fltGetIrpName(irpmajorcode: UByte): Pstr =
    MutPtr(WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIrpName(irpmajorcode.toByte()))

public actual fun fltGetLowerInstance(currentinstance: PfltInstance, lowerinstance: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetLowerInstance(currentinstance, lowerinstance.rawAddress)

public actual fun fltGetNewSystemBufferAddress(callbackdata: ConstPtr): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetNewSystemBufferAddress(callbackdata.rawAddress))

public actual fun fltGetNextExtraCreateParameter(filter: PfltFilter, ecplist: ConstPtr, currentecpcontext: ConstPtr, nextecptype: MutPtr, nextecpcontext: MutPtr, nextecpcontextsize: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetNextExtraCreateParameter(filter, ecplist.rawAddress, currentecpcontext.rawAddress, nextecptype.rawAddress, nextecpcontext.rawAddress, nextecpcontextsize.rawAddress)

public actual fun fltGetRequestorProcess(callbackdata: ConstPtr): Peprocess =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorProcess(callbackdata.rawAddress)

public actual fun fltGetRequestorProcessId(callbackdata: ConstPtr): UInt =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorProcessId(callbackdata.rawAddress).toUInt()

public actual fun fltGetRequestorProcessIdEx(callbackdata: ConstPtr): Handle =
    MutPtr(WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorProcessIdEx(callbackdata.rawAddress))

public actual fun fltGetRequestorSessionId(callbackdata: ConstPtr, sessionid: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorSessionId(callbackdata.rawAddress, sessionid.rawAddress)

public actual fun fltGetRoutineAddress(fltmgrroutinename: Pcstr): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRoutineAddress(fltmgrroutinename.rawAddress))

public actual fun fltGetSectionContext(instance: PfltInstance, fileobject: ConstPtr, context: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetSectionContext(instance, fileobject.rawAddress, context.rawAddress)

public actual fun fltGetStreamContext(instance: PfltInstance, fileobject: ConstPtr, context: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetStreamContext(instance, fileobject.rawAddress, context.rawAddress)

public actual fun fltGetStreamHandleContext(instance: PfltInstance, fileobject: ConstPtr, context: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetStreamHandleContext(instance, fileobject.rawAddress, context.rawAddress)

public actual fun fltGetSwappedBufferMdlAddress(callbackdata: ConstPtr): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetSwappedBufferMdlAddress(callbackdata.rawAddress))

public actual fun fltGetTopInstance(volume: PfltVolume, instance: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetTopInstance(volume, instance.rawAddress)

public actual fun fltGetTransactionContext(instance: PfltInstance, transaction: ConstPtr, context: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetTransactionContext(instance, transaction.rawAddress, context.rawAddress)

public actual fun fltGetTunneledName(callbackdata: ConstPtr, filenameinformation: ConstPtr, rettunneledfilenameinformation: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetTunneledName(callbackdata.rawAddress, filenameinformation.rawAddress, rettunneledfilenameinformation.rawAddress)

public actual fun fltGetUpperInstance(currentinstance: PfltInstance, upperinstance: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetUpperInstance(currentinstance, upperinstance.rawAddress)

public actual fun fltGetVolumeContext(filter: PfltFilter, volume: PfltVolume, context: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeContext(filter, volume, context.rawAddress)

public actual fun fltGetVolumeFromDeviceObject(filter: PfltFilter, deviceobject: ConstPtr, retvolume: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromDeviceObject(filter, deviceobject.rawAddress, retvolume.rawAddress)

public actual fun fltGetVolumeFromFileObject(filter: PfltFilter, fileobject: ConstPtr, retvolume: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromFileObject(filter, fileobject.rawAddress, retvolume.rawAddress)

public actual fun fltGetVolumeFromInstance(instance: PfltInstance, retvolume: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromInstance(instance, retvolume.rawAddress)

public actual fun fltGetVolumeFromName(filter: PfltFilter, volumename: ConstPtr, retvolume: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromName(filter, volumename.rawAddress, retvolume.rawAddress)

public actual fun fltGetVolumeGuidName(volume: PfltVolume, volumeguidname: MutPtr, buffersizeneeded: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeGuidName(volume, volumeguidname.rawAddress, buffersizeneeded.rawAddress)

public actual fun fltGetVolumeInformation(volume: PfltVolume, informationclass: FilterVolumeInformationClass, buffer: MutPtr, buffersize: UInt, bytesreturned: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeInformation(volume, informationclass, buffer.rawAddress, buffersize.toInt(), bytesreturned.rawAddress)

public actual fun fltGetVolumeInstanceFromName(filter: PfltFilter, volume: PfltVolume, instancename: ConstPtr, retinstance: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeInstanceFromName(filter, volume, instancename.rawAddress, retinstance.rawAddress)

public actual fun fltGetVolumeName(volume: PfltVolume, volumename: MutPtr, buffersizeneeded: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeName(volume, volumename.rawAddress, buffersizeneeded.rawAddress)

public actual fun fltGetVolumeProperties(volume: PfltVolume, volumeproperties: MutPtr, volumepropertieslength: UInt, lengthreturned: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeProperties(volume, volumeproperties.rawAddress, volumepropertieslength.toInt(), lengthreturned.rawAddress)

public actual fun fltInitExtraCreateParameterLookasideList(filter: PfltFilter, lookaside: MutPtr, flags: UInt, size: ULong, tag: UInt) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltInitExtraCreateParameterLookasideList(filter, lookaside.rawAddress, flags.toInt(), size.toLong(), tag.toInt())
}

public actual fun fltInitializeFileLock(filelock: MutPtr) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltInitializeFileLock(filelock.rawAddress)
}

public actual fun fltInitializeOplock(oplock: MutPtr) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltInitializeOplock(oplock.rawAddress)
}

public actual fun fltInitializePushLock(pushlock: MutPtr) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltInitializePushLock(pushlock.rawAddress)
}

public actual fun fltInsertExtraCreateParameter(filter: PfltFilter, ecplist: MutPtr, ecpcontext: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltInsertExtraCreateParameter(filter, ecplist.rawAddress, ecpcontext.rawAddress)

public actual fun fltIs32bitProcess(callbackdata: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltIs32bitProcess(callbackdata.rawAddress)

public actual fun fltIsCallbackDataDirty(data: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltIsCallbackDataDirty(data.rawAddress)

public actual fun fltIsDirectory(fileobject: ConstPtr, instance: PfltInstance, isdirectory: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltIsDirectory(fileobject.rawAddress, instance, isdirectory.rawAddress)

public actual fun fltIsEcpAcknowledged(filter: PfltFilter, ecpcontext: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltIsEcpAcknowledged(filter, ecpcontext.rawAddress)

public actual fun fltIsEcpFromUserMode(filter: PfltFilter, ecpcontext: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltIsEcpFromUserMode(filter, ecpcontext.rawAddress)

public actual fun fltIsFltMgrVolumeDeviceObject(deviceobject: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltIsFltMgrVolumeDeviceObject(deviceobject.rawAddress)

public actual fun fltIsIoCanceled(callbackdata: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltIsIoCanceled(callbackdata.rawAddress)

public actual fun fltIsIoRedirectionAllowed(sourceinstance: PfltInstance, targetinstance: PfltInstance, redirectionallowed: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltIsIoRedirectionAllowed(sourceinstance, targetinstance, redirectionallowed.rawAddress)

public actual fun fltIsIoRedirectionAllowedForOperation(data: ConstPtr, targetinstance: PfltInstance, redirectionallowedthisio: MutPtr, redirectionallowedallio: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltIsIoRedirectionAllowedForOperation(data.rawAddress, targetinstance, redirectionallowedthisio.rawAddress, redirectionallowedallio.rawAddress)

public actual fun fltIsOperationSynchronous(callbackdata: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltIsOperationSynchronous(callbackdata.rawAddress)

public actual fun fltIsVolumeSnapshot(fltobject: ConstPtr, issnapshotvolume: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltIsVolumeSnapshot(fltobject.rawAddress, issnapshotvolume.rawAddress)

public actual fun fltIsVolumeWritable(fltobject: ConstPtr, iswritable: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltIsVolumeWritable(fltobject.rawAddress, iswritable.rawAddress)

public actual fun fltLoadFilter(filtername: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltLoadFilter(filtername.rawAddress)

public actual fun fltLockUserBuffer(callbackdata: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltLockUserBuffer(callbackdata.rawAddress)

public actual fun fltNotifyFilterChangeDirectory(notifysync: PnotifySync, notifylist: MutPtr, fscontext: ConstPtr, fulldirectoryname: ConstPtr, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifycallbackdata: ConstPtr, traversecallback: PcheckForTraverseAccess, subjectcontext: ConstPtr, filtercallback: PfilterReportChange) {
}

public actual fun fltObjectDereference(fltobject: MutPtr) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltObjectDereference(fltobject.rawAddress)
}

public actual fun fltObjectReference(fltobject: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltObjectReference(fltobject.rawAddress)

public actual fun fltOpenVolume(instance: PfltInstance, volumehandle: MutPtr, volumefileobject: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltOpenVolume(instance, volumehandle.rawAddress, volumefileobject.rawAddress)

public actual fun fltOplockBreakH(oplock: ConstPtr, callbackdata: ConstPtr, flags: UInt, context: ConstPtr, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockBreakH(oplock.rawAddress, callbackdata.rawAddress, flags.toInt(), context.rawAddress, 0L, 0L)

public actual fun fltOplockBreakToNone(oplock: ConstPtr, callbackdata: ConstPtr, context: ConstPtr, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockBreakToNone(oplock.rawAddress, callbackdata.rawAddress, context.rawAddress, 0L, 0L)

public actual fun fltOplockBreakToNoneEx(oplock: ConstPtr, callbackdata: ConstPtr, flags: UInt, context: ConstPtr, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockBreakToNoneEx(oplock.rawAddress, callbackdata.rawAddress, flags.toInt(), context.rawAddress, 0L, 0L)

public actual fun fltOplockFsctrl(oplock: ConstPtr, callbackdata: ConstPtr, opencount: UInt): FltPreopCallbackStatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockFsctrl(oplock.rawAddress, callbackdata.rawAddress, opencount.toInt())

public actual fun fltOplockFsctrlEx(oplock: ConstPtr, callbackdata: ConstPtr, opencount: UInt, flags: UInt): FltPreopCallbackStatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockFsctrlEx(oplock.rawAddress, callbackdata.rawAddress, opencount.toInt(), flags.toInt())

public actual fun fltOplockIsFastIoPossible(oplock: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockIsFastIoPossible(oplock.rawAddress)

public actual fun fltOplockIsSharedRequest(callbackdata: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockIsSharedRequest(callbackdata.rawAddress)

public actual fun fltOplockKeysEqual(fo1: ConstPtr, fo2: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockKeysEqual(fo1.rawAddress, fo2.rawAddress)

public actual fun fltParseFileName(filename: ConstPtr, extension: MutPtr, stream: MutPtr, finalcomponent: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltParseFileName(filename.rawAddress, extension.rawAddress, stream.rawAddress, finalcomponent.rawAddress)

public actual fun fltParseFileNameInformation(filenameinformation: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltParseFileNameInformation(filenameinformation.rawAddress)

public actual fun fltPerformAsynchronousIo(callbackdata: MutPtr, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltPerformAsynchronousIo(callbackdata.rawAddress, 0L, callbackcontext.rawAddress)

public actual fun fltPerformSynchronousIo(callbackdata: MutPtr) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltPerformSynchronousIo(callbackdata.rawAddress)
}

public actual fun fltPrePrepareComplete(instance: PfltInstance, transaction: ConstPtr, transactioncontext: PfltContext): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltPrePrepareComplete(instance, transaction.rawAddress, transactioncontext.rawAddress)

public actual fun fltPrepareComplete(instance: PfltInstance, transaction: ConstPtr, transactioncontext: PfltContext): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltPrepareComplete(instance, transaction.rawAddress, transactioncontext.rawAddress)

public actual fun fltPrepareToReuseEcp(filter: PfltFilter, ecpcontext: ConstPtr) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltPrepareToReuseEcp(filter, ecpcontext.rawAddress)
}

public actual fun fltProcessFileLock(filelock: ConstPtr, callbackdata: ConstPtr, context: ConstPtr): FltPreopCallbackStatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltProcessFileLock(filelock.rawAddress, callbackdata.rawAddress, context.rawAddress)

public actual fun fltPropagateActivityIdToThread(callbackdata: ConstPtr, propagateid: MutPtr, originalid: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltPropagateActivityIdToThread(callbackdata.rawAddress, propagateid.rawAddress, originalid.rawAddress)

public actual fun fltPropagateIrpExtension(sourcedata: ConstPtr, targetdata: MutPtr, flags: UInt): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltPropagateIrpExtension(sourcedata.rawAddress, targetdata.rawAddress, flags.toInt())

public actual fun fltPurgeFileNameInformationCache(instance: PfltInstance, fileobject: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltPurgeFileNameInformationCache(instance, fileobject.rawAddress)

public actual fun fltQueryDirectoryFile(instance: PfltInstance, fileobject: ConstPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass, returnsingleentry: Boolean, filename: ConstPtr, restartscan: Boolean, lengthreturned: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryDirectoryFile(instance, fileobject.rawAddress, fileinformation.rawAddress, length.toInt(), fileinformationclass, returnsingleentry, filename.rawAddress, restartscan, lengthreturned.rawAddress)

public actual fun fltQueryDirectoryFileEx(instance: PfltInstance, fileobject: ConstPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass, queryflags: UInt, filename: ConstPtr, lengthreturned: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryDirectoryFileEx(instance, fileobject.rawAddress, fileinformation.rawAddress, length.toInt(), fileinformationclass, queryflags.toInt(), filename.rawAddress, lengthreturned.rawAddress)

public actual fun fltQueryEaFile(instance: PfltInstance, fileobject: ConstPtr, returnedeadata: MutPtr, length: UInt, returnsingleentry: Boolean, ealist: ConstPtr, ealistlength: UInt, eaindex: ConstPtr, restartscan: Boolean, lengthreturned: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryEaFile(instance, fileobject.rawAddress, returnedeadata.rawAddress, length.toInt(), returnsingleentry, ealist.rawAddress, ealistlength.toInt(), eaindex.rawAddress, restartscan, lengthreturned.rawAddress)

public actual fun fltQueryInformationByName(filter: PfltFilter, instance: PfltInstance, objectattributes: ConstPtr, iostatusblock: MutPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass, drivercontext: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryInformationByName(filter, instance, objectattributes.rawAddress, iostatusblock.rawAddress, fileinformation.rawAddress, length.toInt(), fileinformationclass, drivercontext.rawAddress)

public actual fun fltQueryInformationFile(instance: PfltInstance, fileobject: ConstPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass, lengthreturned: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryInformationFile(instance, fileobject.rawAddress, fileinformation.rawAddress, length.toInt(), fileinformationclass, lengthreturned.rawAddress)

public actual fun fltQueryQuotaInformationFile(instance: PfltInstance, fileobject: ConstPtr, iostatusblock: MutPtr, buffer: MutPtr, length: UInt, returnsingleentry: Boolean, sidlist: ConstPtr, sidlistlength: UInt, startsid: ConstPtr, restartscan: Boolean, lengthreturned: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryQuotaInformationFile(instance, fileobject.rawAddress, iostatusblock.rawAddress, buffer.rawAddress, length.toInt(), returnsingleentry, sidlist.rawAddress, sidlistlength.toInt(), startsid.rawAddress, restartscan, lengthreturned.rawAddress)

public actual fun fltQuerySecurityObject(instance: PfltInstance, fileobject: ConstPtr, securityinformation: UInt, securitydescriptor: PsecurityDescriptor, length: UInt, lengthneeded: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltQuerySecurityObject(instance, fileobject.rawAddress, securityinformation.toInt(), securitydescriptor.rawAddress, length.toInt(), lengthneeded.rawAddress)

public actual fun fltQueryVolumeInformation(instance: PfltInstance, iosb: MutPtr, fsinformation: MutPtr, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryVolumeInformation(instance, iosb.rawAddress, fsinformation.rawAddress, length.toInt(), fsinformationclass)

public actual fun fltQueryVolumeInformationFile(instance: PfltInstance, fileobject: ConstPtr, fsinformation: MutPtr, length: UInt, fsinformationclass: FsInformationClass, lengthreturned: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryVolumeInformationFile(instance, fileobject.rawAddress, fsinformation.rawAddress, length.toInt(), fsinformationclass, lengthreturned.rawAddress)

public actual fun fltQueueDeferredIoWorkItem(fltworkitem: PfltDeferredIoWorkitem, data: ConstPtr, workerroutine: PfltDeferredIoWorkitemRoutine, queuetype: WorkQueueType, context: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltQueueDeferredIoWorkItem(fltworkitem, data.rawAddress, 0L, queuetype, context.rawAddress)

public actual fun fltQueueGenericWorkItem(fltworkitem: PfltGenericWorkitem, fltobject: ConstPtr, workerroutine: PfltGenericWorkitemRoutine, queuetype: WorkQueueType, context: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltQueueGenericWorkItem(fltworkitem, fltobject.rawAddress, 0L, queuetype, context.rawAddress)

public actual fun fltReadFile(initiatinginstance: PfltInstance, fileobject: ConstPtr, byteoffset: ConstPtr, length: UInt, buffer: MutPtr, flags: UInt, bytesread: MutPtr, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltReadFile(initiatinginstance, fileobject.rawAddress, byteoffset.rawAddress, length.toInt(), buffer.rawAddress, flags.toInt(), bytesread.rawAddress, 0L, callbackcontext.rawAddress)

public actual fun fltReadFileEx(initiatinginstance: PfltInstance, fileobject: ConstPtr, byteoffset: ConstPtr, length: UInt, buffer: MutPtr, flags: UInt, bytesread: MutPtr, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: ConstPtr, key: ConstPtr, mdl: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltReadFileEx(initiatinginstance, fileobject.rawAddress, byteoffset.rawAddress, length.toInt(), buffer.rawAddress, flags.toInt(), bytesread.rawAddress, 0L, callbackcontext.rawAddress, key.rawAddress, mdl.rawAddress)

public actual fun fltReferenceContext(context: PfltContext) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltReferenceContext(context.rawAddress)
}

public actual fun fltReferenceFileNameInformation(filenameinformation: ConstPtr) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltReferenceFileNameInformation(filenameinformation.rawAddress)
}

public actual fun fltRegisterFilter(driver: ConstPtr, registration: ConstPtr, retfilter: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltRegisterFilter(driver.rawAddress, registration.rawAddress, retfilter.rawAddress)

public actual fun fltRegisterForDataScan(instance: PfltInstance): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltRegisterForDataScan(instance)

public actual fun fltReissueSynchronousIo(initiatinginstance: PfltInstance, callbackdata: ConstPtr) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltReissueSynchronousIo(initiatinginstance, callbackdata.rawAddress)
}

public actual fun fltReleaseContext(context: PfltContext) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseContext(context.rawAddress)
}

public actual fun fltReleaseContexts(contexts: ConstPtr) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseContexts(contexts.rawAddress)
}

public actual fun fltReleaseContextsEx(contextssize: ULong, contexts: ConstPtr) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseContextsEx(contextssize.toLong(), contexts.rawAddress)
}

public actual fun fltReleaseFileNameInformation(filenameinformation: ConstPtr) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseFileNameInformation(filenameinformation.rawAddress)
}

public actual fun fltReleasePushLock(pushlock: MutPtr) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltReleasePushLock(pushlock.rawAddress)
}

public actual fun fltReleasePushLockEx(pushlock: MutPtr, flags: UInt) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltReleasePushLockEx(pushlock.rawAddress, flags.toInt())
}

public actual fun fltReleaseResource(resource: MutPtr) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseResource(resource.rawAddress)
}

public actual fun fltRemoveExtraCreateParameter(filter: PfltFilter, ecplist: MutPtr, ecptype: ConstPtr, ecpcontext: MutPtr, ecpcontextsize: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltRemoveExtraCreateParameter(filter, ecplist.rawAddress, ecptype.rawAddress, ecpcontext.rawAddress, ecpcontextsize.rawAddress)

public actual fun fltRemoveOpenReparseEntry(filter: PfltFilter, data: ConstPtr, openreparseentry: ConstPtr) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltRemoveOpenReparseEntry(filter, data.rawAddress, openreparseentry.rawAddress)
}

public actual fun fltRequestFileInfoOnCreateCompletion(filter: PfltFilter, data: ConstPtr, infoclassflags: UInt): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltRequestFileInfoOnCreateCompletion(filter, data.rawAddress, infoclassflags.toInt())

public actual fun fltRequestOperationStatusCallback(data: ConstPtr, callbackroutine: PfltGetOperationStatusCallback, requestercontext: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltRequestOperationStatusCallback(data.rawAddress, 0L, requestercontext.rawAddress)

public actual fun fltRetainSwappedBufferMdlAddress(callbackdata: ConstPtr) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltRetainSwappedBufferMdlAddress(callbackdata.rawAddress)
}

public actual fun fltRetrieveFileInfoOnCreateCompletion(filter: PfltFilter, data: ConstPtr, infoclass: UInt, size: MutPtr): MutPtr =
    MutPtr(WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltRetrieveFileInfoOnCreateCompletion(filter, data.rawAddress, infoclass.toInt(), size.rawAddress))

public actual fun fltRetrieveFileInfoOnCreateCompletionEx(filter: PfltFilter, data: ConstPtr, infoclass: UInt, retinfosize: MutPtr, retinfobuffer: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltRetrieveFileInfoOnCreateCompletionEx(filter, data.rawAddress, infoclass.toInt(), retinfosize.rawAddress, retinfobuffer.rawAddress)

public actual fun fltRetrieveIoPriorityInfo(data: ConstPtr, fileobject: ConstPtr, thread: Pethread, priorityinfo: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltRetrieveIoPriorityInfo(data.rawAddress, fileobject.rawAddress, thread, priorityinfo.rawAddress)

public actual fun fltReuseCallbackData(callbackdata: MutPtr) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltReuseCallbackData(callbackdata.rawAddress)
}

public actual fun fltRollbackComplete(instance: PfltInstance, transaction: ConstPtr, transactioncontext: PfltContext): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltRollbackComplete(instance, transaction.rawAddress, transactioncontext.rawAddress)

public actual fun fltRollbackEnlistment(instance: PfltInstance, transaction: ConstPtr, transactioncontext: PfltContext): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltRollbackEnlistment(instance, transaction.rawAddress, transactioncontext.rawAddress)

public actual fun fltSendMessage(filter: PfltFilter, clientport: ConstPtr, senderbuffer: ConstPtr, senderbufferlength: UInt, replybuffer: MutPtr, replylength: MutPtr, timeout: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSendMessage(filter, clientport.rawAddress, senderbuffer.rawAddress, senderbufferlength.toInt(), replybuffer.rawAddress, replylength.rawAddress, timeout.rawAddress)

public actual fun fltSetActivityIdCallbackData(callbackdata: MutPtr, guid: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetActivityIdCallbackData(callbackdata.rawAddress, guid.rawAddress)

public actual fun fltSetCallbackDataDirty(data: MutPtr) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetCallbackDataDirty(data.rawAddress)
}

public actual fun fltSetCancelCompletion(callbackdata: ConstPtr, canceledcallback: PfltCompleteCanceledCallback): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetCancelCompletion(callbackdata.rawAddress, 0L)

public actual fun fltSetEaFile(instance: PfltInstance, fileobject: ConstPtr, eabuffer: ConstPtr, length: UInt): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetEaFile(instance, fileobject.rawAddress, eabuffer.rawAddress, length.toInt())

public actual fun fltSetEcpListIntoCallbackData(filter: PfltFilter, callbackdata: ConstPtr, ecplist: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetEcpListIntoCallbackData(filter, callbackdata.rawAddress, ecplist.rawAddress)

public actual fun fltSetFileContext(instance: PfltInstance, fileobject: ConstPtr, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetFileContext(instance, fileobject.rawAddress, operation, newcontext.rawAddress, oldcontext.rawAddress)

public actual fun fltSetFsZeroingOffset(data: ConstPtr, zeroingoffset: UInt): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetFsZeroingOffset(data.rawAddress, zeroingoffset.toInt())

public actual fun fltSetFsZeroingOffsetRequired(data: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetFsZeroingOffsetRequired(data.rawAddress)

public actual fun fltSetInformationFile(instance: PfltInstance, fileobject: ConstPtr, fileinformation: ConstPtr, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetInformationFile(instance, fileobject.rawAddress, fileinformation.rawAddress, length.toInt(), fileinformationclass)

public actual fun fltSetInstanceContext(instance: PfltInstance, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetInstanceContext(instance, operation, newcontext.rawAddress, oldcontext.rawAddress)

public actual fun fltSetIoPriorityHintIntoCallbackData(data: ConstPtr, priorityhint: IoPriorityHint): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetIoPriorityHintIntoCallbackData(data.rawAddress, priorityhint)

public actual fun fltSetIoPriorityHintIntoFileObject(fileobject: ConstPtr, priorityhint: IoPriorityHint): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetIoPriorityHintIntoFileObject(fileobject.rawAddress, priorityhint)

public actual fun fltSetIoPriorityHintIntoThread(thread: Pethread, priorityhint: IoPriorityHint): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetIoPriorityHintIntoThread(thread, priorityhint)

public actual fun fltSetQuotaInformationFile(instance: PfltInstance, fileobject: ConstPtr, buffer: ConstPtr, length: UInt): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetQuotaInformationFile(instance, fileobject.rawAddress, buffer.rawAddress, length.toInt())

public actual fun fltSetSecurityObject(instance: PfltInstance, fileobject: ConstPtr, securityinformation: UInt, securitydescriptor: PsecurityDescriptor): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetSecurityObject(instance, fileobject.rawAddress, securityinformation.toInt(), securitydescriptor.rawAddress)

public actual fun fltSetStreamContext(instance: PfltInstance, fileobject: ConstPtr, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetStreamContext(instance, fileobject.rawAddress, operation, newcontext.rawAddress, oldcontext.rawAddress)

public actual fun fltSetStreamHandleContext(instance: PfltInstance, fileobject: ConstPtr, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetStreamHandleContext(instance, fileobject.rawAddress, operation, newcontext.rawAddress, oldcontext.rawAddress)

public actual fun fltSetTransactionContext(instance: PfltInstance, transaction: ConstPtr, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetTransactionContext(instance, transaction.rawAddress, operation, newcontext.rawAddress, oldcontext.rawAddress)

public actual fun fltSetVolumeContext(volume: PfltVolume, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetVolumeContext(volume, operation, newcontext.rawAddress, oldcontext.rawAddress)

public actual fun fltSetVolumeInformation(instance: PfltInstance, iosb: MutPtr, fsinformation: MutPtr, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetVolumeInformation(instance, iosb.rawAddress, fsinformation.rawAddress, length.toInt(), fsinformationclass)

public actual fun fltStartFiltering(filter: PfltFilter): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltStartFiltering(filter)

public actual fun fltSupportsFileContexts(fileobject: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsFileContexts(fileobject.rawAddress)

public actual fun fltSupportsFileContextsEx(fileobject: ConstPtr, instance: PfltInstance): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsFileContextsEx(fileobject.rawAddress, instance)

public actual fun fltSupportsStreamContexts(fileobject: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsStreamContexts(fileobject.rawAddress)

public actual fun fltSupportsStreamHandleContexts(fileobject: ConstPtr): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsStreamHandleContexts(fileobject.rawAddress)

public actual fun fltTagFile(initiatinginstance: PfltInstance, fileobject: ConstPtr, filetag: UInt, guid: ConstPtr, databuffer: ConstPtr, databufferlength: UShort): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltTagFile(initiatinginstance, fileobject.rawAddress, filetag.toInt(), guid.rawAddress, databuffer.rawAddress, databufferlength.toShort())

public actual fun fltTagFileEx(initiatinginstance: PfltInstance, fileobject: ConstPtr, filetag: UInt, guid: ConstPtr, databuffer: ConstPtr, databufferlength: UShort, existingfiletag: UInt, existingguid: ConstPtr, flags: UInt): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltTagFileEx(initiatinginstance, fileobject.rawAddress, filetag.toInt(), guid.rawAddress, databuffer.rawAddress, databufferlength.toShort(), existingfiletag.toInt(), existingguid.rawAddress, flags.toInt())

public actual fun fltUninitializeFileLock(filelock: ConstPtr) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltUninitializeFileLock(filelock.rawAddress)
}

public actual fun fltUninitializeOplock(oplock: ConstPtr) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltUninitializeOplock(oplock.rawAddress)
}

public actual fun fltUnloadFilter(filtername: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltUnloadFilter(filtername.rawAddress)

public actual fun fltUnregisterFilter(filter: PfltFilter) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltUnregisterFilter(filter)
}

public actual fun fltUntagFile(initiatinginstance: PfltInstance, fileobject: ConstPtr, filetag: UInt, guid: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltUntagFile(initiatinginstance, fileobject.rawAddress, filetag.toInt(), guid.rawAddress)

public actual fun fltVetoBypassIo(callbackdata: ConstPtr, fltobjects: ConstPtr, operationstatus: Ntstatus, failurereason: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltVetoBypassIo(callbackdata.rawAddress, fltobjects.rawAddress, operationstatus, failurereason.rawAddress)

public actual fun fltWriteFile(initiatinginstance: PfltInstance, fileobject: ConstPtr, byteoffset: ConstPtr, length: UInt, buffer: ConstPtr, flags: UInt, byteswritten: MutPtr, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltWriteFile(initiatinginstance, fileobject.rawAddress, byteoffset.rawAddress, length.toInt(), buffer.rawAddress, flags.toInt(), byteswritten.rawAddress, 0L, callbackcontext.rawAddress)

public actual fun fltWriteFileEx(initiatinginstance: PfltInstance, fileobject: ConstPtr, byteoffset: ConstPtr, length: UInt, buffer: ConstPtr, flags: UInt, byteswritten: MutPtr, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: ConstPtr, key: ConstPtr, mdl: ConstPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltWriteFileEx(initiatinginstance, fileobject.rawAddress, byteoffset.rawAddress, length.toInt(), buffer.rawAddress, flags.toInt(), byteswritten.rawAddress, 0L, callbackcontext.rawAddress, key.rawAddress, mdl.rawAddress)

public actual fun fltpTraceRedirectedFileIo(originatingfileobject: ConstPtr, childcallbackdata: MutPtr): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltpTraceRedirectedFileIo(originatingfileobject.rawAddress, childcallbackdata.rawAddress)
