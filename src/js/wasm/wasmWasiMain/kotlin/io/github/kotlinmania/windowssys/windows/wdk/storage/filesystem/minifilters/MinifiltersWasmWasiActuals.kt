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

public actual fun fltAcknowledgeEcp(filter: PfltFilter, ecpcontext: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltAcquirePushLockExclusive(pushlock: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltAcquirePushLockExclusiveEx(pushlock: COpaquePointer?, flags: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltAcquirePushLockShared(pushlock: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltAcquirePushLockSharedEx(pushlock: COpaquePointer?, flags: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltAcquireResourceExclusive(resource: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltAcquireResourceShared(resource: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltAddOpenReparseEntry(filter: PfltFilter, data: COpaquePointer?, openreparseentry: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltAdjustDeviceStackSizeForIoRedirection(sourceinstance: PfltInstance, targetinstance: PfltInstance, sourcedevicestacksizemodified: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltAllocateCallbackData(instance: PfltInstance, fileobject: COpaquePointer?, retnewcallbackdata: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltAllocateCallbackDataEx(instance: PfltInstance, fileobject: COpaquePointer?, flags: UInt, retnewcallbackdata: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltAllocateContext(filter: PfltFilter, contexttype: UShort, contextsize: ULong, pooltype: PoolType, returnedcontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltAllocateDeferredIoWorkItem(): PfltDeferredIoWorkitem =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltAllocateExtraCreateParameter(filter: PfltFilter, ecptype: COpaquePointer?, sizeofcontext: UInt, flags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, pooltag: UInt, ecpcontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltAllocateExtraCreateParameterFromLookasideList(filter: PfltFilter, ecptype: COpaquePointer?, sizeofcontext: UInt, flags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, lookasidelist: COpaquePointer?, ecpcontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltAllocateExtraCreateParameterList(filter: PfltFilter, flags: UInt, ecplist: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltAllocateFileLock(completelockcallbackdataroutine: PfltCompleteLockCallbackDataRoutine, unlockroutine: PunlockRoutine): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltAllocateGenericWorkItem(): PfltGenericWorkitem =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltAllocatePoolAlignedWithTag(instance: PfltInstance, pooltype: PoolType, numberofbytes: ULong, tag: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltApplyPriorityInfoThread(inputpriorityinfo: COpaquePointer?, outputpriorityinfo: COpaquePointer?, thread: Pethread): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltAttachVolume(filter: PfltFilter, volume: PfltVolume, instancename: COpaquePointer?, retinstance: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltAttachVolumeAtAltitude(filter: PfltFilter, volume: PfltVolume, altitude: COpaquePointer?, instancename: COpaquePointer?, retinstance: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltBuildDefaultSecurityDescriptor(securitydescriptor: COpaquePointer?, desiredaccess: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltCancelFileOpen(instance: PfltInstance, fileobject: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltCancelIo(callbackdata: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltCancellableWaitForMultipleObjects(count: UInt, objectarray: COpaquePointer?, waittype: WaitType, timeout: COpaquePointer?, waitblockarray: COpaquePointer?, callbackdata: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltCancellableWaitForSingleObject(obj: COpaquePointer?, timeout: COpaquePointer?, callbackdata: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltCbdqDisable(cbdq: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltCbdqEnable(cbdq: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltCbdqInitialize(instance: PfltInstance, cbdq: COpaquePointer?, cbdqinsertio: PfltCallbackDataQueueInsertIo, cbdqremoveio: PfltCallbackDataQueueRemoveIo, cbdqpeeknextio: PfltCallbackDataQueuePeekNextIo, cbdqacquire: PfltCallbackDataQueueAcquire, cbdqrelease: PfltCallbackDataQueueRelease, cbdqcompletecanceledio: PfltCallbackDataQueueCompleteCanceledIo): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltCbdqInsertIo(cbdq: COpaquePointer?, cbd: COpaquePointer?, context: COpaquePointer?, insertcontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltCbdqRemoveIo(cbdq: COpaquePointer?, context: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltCbdqRemoveNextIo(cbdq: COpaquePointer?, peekcontext: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltCheckAndGrowNameControl(namectrl: COpaquePointer?, newsize: UShort): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltCheckLockForReadAccess(filelock: COpaquePointer?, callbackdata: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltCheckLockForWriteAccess(filelock: COpaquePointer?, callbackdata: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltCheckOplock(oplock: COpaquePointer?, callbackdata: COpaquePointer?, context: COpaquePointer?, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltCheckOplockEx(oplock: COpaquePointer?, callbackdata: COpaquePointer?, flags: UInt, context: COpaquePointer?, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltClearCallbackDataDirty(data: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltClearCancelCompletion(callbackdata: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltClose(filehandle: Handle): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltCloseClientPort(filter: PfltFilter, clientport: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltCloseCommunicationPort(serverport: PfltPort) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltCloseSectionForDataScan(sectioncontext: PfltContext): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltCommitComplete(instance: PfltInstance, transaction: COpaquePointer?, transactioncontext: PfltContext): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltCommitFinalizeComplete(instance: PfltInstance, transaction: COpaquePointer?, transactioncontext: PfltContext): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltCompareInstanceAltitudes(instance1: PfltInstance, instance2: PfltInstance): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltCompletePendedPostOperation(callbackdata: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltCompletePendedPreOperation(callbackdata: COpaquePointer?, callbackstatus: FltPreopCallbackStatus, context: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltCopyOpenReparseList(filter: PfltFilter, data: COpaquePointer?, ecplist: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltCreateCommunicationPort(filter: PfltFilter, serverport: COpaquePointer?, objectattributes: COpaquePointer?, serverportcookie: COpaquePointer?, connectnotifycallback: PfltConnectNotify, disconnectnotifycallback: PfltDisconnectNotify, messagenotifycallback: PfltMessageNotify, maxconnections: Int): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltCreateFile(filter: PfltFilter, instance: PfltInstance, filehandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, allocationsize: COpaquePointer?, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: COpaquePointer?, ealength: UInt, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltCreateFileEx(filter: PfltFilter, instance: PfltInstance, filehandle: COpaquePointer?, fileobject: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, allocationsize: COpaquePointer?, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: COpaquePointer?, ealength: UInt, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltCreateFileEx2(filter: PfltFilter, instance: PfltInstance, filehandle: COpaquePointer?, fileobject: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, allocationsize: COpaquePointer?, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: COpaquePointer?, ealength: UInt, flags: UInt, drivercontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltCreateMailslotFile(filter: PfltFilter, instance: PfltInstance, filehandle: COpaquePointer?, fileobject: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, createoptions: UInt, mailslotquota: UInt, maximummessagesize: UInt, readtimeout: COpaquePointer?, drivercontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltCreateNamedPipeFile(filter: PfltFilter, instance: PfltInstance, filehandle: COpaquePointer?, fileobject: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, namedpipetype: UInt, readmode: UInt, completionmode: UInt, maximuminstances: UInt, inboundquota: UInt, outboundquota: UInt, defaulttimeout: COpaquePointer?, drivercontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltCreateSectionForDataScan(instance: PfltInstance, fileobject: COpaquePointer?, sectioncontext: PfltContext, desiredaccess: UInt, objectattributes: COpaquePointer?, maximumsize: COpaquePointer?, sectionpageprotection: UInt, allocationattributes: UInt, flags: UInt, sectionhandle: COpaquePointer?, sectionobject: COpaquePointer?, sectionfilesize: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltCreateSystemVolumeInformationFolder(instance: PfltInstance): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltCurrentBatchOplock(oplock: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltCurrentOplock(oplock: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltCurrentOplockH(oplock: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltDecodeParameters(callbackdata: COpaquePointer?, mdladdresspointer: COpaquePointer?, buffer: COpaquePointer?, length: COpaquePointer?, desiredaccess: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltDeleteContext(context: PfltContext) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltDeleteExtraCreateParameterLookasideList(filter: PfltFilter, lookaside: COpaquePointer?, flags: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltDeleteFileContext(instance: PfltInstance, fileobject: COpaquePointer?, oldcontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltDeleteInstanceContext(instance: PfltInstance, oldcontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltDeletePushLock(pushlock: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltDeleteStreamContext(instance: PfltInstance, fileobject: COpaquePointer?, oldcontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltDeleteStreamHandleContext(instance: PfltInstance, fileobject: COpaquePointer?, oldcontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltDeleteTransactionContext(instance: PfltInstance, transaction: COpaquePointer?, oldcontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltDeleteVolumeContext(filter: PfltFilter, volume: PfltVolume, oldcontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltDetachVolume(filter: PfltFilter, volume: PfltVolume, instancename: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltDeviceIoControlFile(instance: PfltInstance, fileobject: COpaquePointer?, iocontrolcode: UInt, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt, lengthreturned: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltDoCompletionProcessingWhenSafe(data: COpaquePointer?, fltobjects: COpaquePointer?, completioncontext: COpaquePointer?, flags: UInt, safepostcallback: PfltPostOperationCallback, retpostoperationstatus: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltEnlistInTransaction(instance: PfltInstance, transaction: COpaquePointer?, transactioncontext: PfltContext, notificationmask: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltEnumerateFilterInformation(index: UInt, informationclass: FilterInformationClass, buffer: COpaquePointer?, buffersize: UInt, bytesreturned: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltEnumerateFilters(filterlist: COpaquePointer?, filterlistsize: UInt, numberfiltersreturned: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltEnumerateInstanceInformationByDeviceObject(deviceobject: COpaquePointer?, index: UInt, informationclass: InstanceInformationClass, buffer: COpaquePointer?, buffersize: UInt, bytesreturned: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltEnumerateInstanceInformationByFilter(filter: PfltFilter, index: UInt, informationclass: InstanceInformationClass, buffer: COpaquePointer?, buffersize: UInt, bytesreturned: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltEnumerateInstanceInformationByVolume(volume: PfltVolume, index: UInt, informationclass: InstanceInformationClass, buffer: COpaquePointer?, buffersize: UInt, bytesreturned: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltEnumerateInstanceInformationByVolumeName(volumename: COpaquePointer?, index: UInt, informationclass: InstanceInformationClass, buffer: COpaquePointer?, buffersize: UInt, bytesreturned: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltEnumerateInstances(volume: PfltVolume, filter: PfltFilter, instancelist: COpaquePointer?, instancelistsize: UInt, numberinstancesreturned: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltEnumerateVolumeInformation(filter: PfltFilter, index: UInt, informationclass: FilterVolumeInformationClass, buffer: COpaquePointer?, buffersize: UInt, bytesreturned: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltEnumerateVolumes(filter: PfltFilter, volumelist: COpaquePointer?, volumelistsize: UInt, numbervolumesreturned: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltFastIoMdlRead(initiatinginstance: PfltInstance, fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, lockkey: UInt, mdlchain: COpaquePointer?, iostatus: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltFastIoMdlReadComplete(initiatinginstance: PfltInstance, fileobject: COpaquePointer?, mdlchain: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltFastIoMdlWriteComplete(initiatinginstance: PfltInstance, fileobject: COpaquePointer?, fileoffset: COpaquePointer?, mdlchain: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltFastIoPrepareMdlWrite(initiatinginstance: PfltInstance, fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, lockkey: UInt, mdlchain: COpaquePointer?, iostatus: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltFindExtraCreateParameter(filter: PfltFilter, ecplist: COpaquePointer?, ecptype: COpaquePointer?, ecpcontext: COpaquePointer?, ecpcontextsize: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltFlushBuffers(instance: PfltInstance, fileobject: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltFlushBuffers2(instance: PfltInstance, fileobject: COpaquePointer?, flushtype: UInt, callbackdata: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltFreeCallbackData(callbackdata: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltFreeDeferredIoWorkItem(fltworkitem: PfltDeferredIoWorkitem) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltFreeExtraCreateParameter(filter: PfltFilter, ecpcontext: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltFreeExtraCreateParameterList(filter: PfltFilter, ecplist: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltFreeFileLock(filelock: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltFreeGenericWorkItem(fltworkitem: PfltGenericWorkitem) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltFreeOpenReparseList(filter: PfltFilter, ecplist: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltFreePoolAlignedWithTag(instance: PfltInstance, buffer: COpaquePointer?, tag: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltFreeSecurityDescriptor(securitydescriptor: PsecurityDescriptor) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltFsControlFile(instance: PfltInstance, fileobject: COpaquePointer?, fscontrolcode: UInt, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt, lengthreturned: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetActivityIdCallbackData(callbackdata: COpaquePointer?, guid: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetBottomInstance(volume: PfltVolume, instance: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetContexts(fltobjects: COpaquePointer?, desiredcontexts: UShort, contexts: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltGetContextsEx(fltobjects: COpaquePointer?, desiredcontexts: UShort, contextssize: ULong, contexts: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetDestinationFileNameInformation(instance: PfltInstance, fileobject: COpaquePointer?, rootdirectory: Handle, filename: Pcwstr, filenamelength: UInt, nameoptions: UInt, retfilenameinformation: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetDeviceObject(volume: PfltVolume, deviceobject: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetDiskDeviceObject(volume: PfltVolume, diskdeviceobject: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetEcpListFromCallbackData(filter: PfltFilter, callbackdata: COpaquePointer?, ecplist: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetFileContext(instance: PfltInstance, fileobject: COpaquePointer?, context: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetFileNameInformation(callbackdata: COpaquePointer?, nameoptions: UInt, filenameinformation: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetFileNameInformationUnsafe(fileobject: COpaquePointer?, instance: PfltInstance, nameoptions: UInt, filenameinformation: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetFileSystemType(fltobject: COpaquePointer?, filesystemtype: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetFilterFromInstance(instance: PfltInstance, retfilter: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetFilterFromName(filtername: COpaquePointer?, retfilter: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetFilterInformation(filter: PfltFilter, informationclass: FilterInformationClass, buffer: COpaquePointer?, buffersize: UInt, bytesreturned: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetFsZeroingOffset(data: COpaquePointer?, zeroingoffset: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetInstanceContext(instance: PfltInstance, context: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetInstanceInformation(instance: PfltInstance, informationclass: InstanceInformationClass, buffer: COpaquePointer?, buffersize: UInt, bytesreturned: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetIoAttributionHandleFromCallbackData(data: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetIoPriorityHint(data: COpaquePointer?): IoPriorityHint =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetIoPriorityHintFromCallbackData(data: COpaquePointer?): IoPriorityHint =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetIoPriorityHintFromFileObject(fileobject: COpaquePointer?): IoPriorityHint =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetIoPriorityHintFromThread(thread: Pethread): IoPriorityHint =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetIrpName(irpmajorcode: UByte): Pstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetLowerInstance(currentinstance: PfltInstance, lowerinstance: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetNewSystemBufferAddress(callbackdata: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetNextExtraCreateParameter(filter: PfltFilter, ecplist: COpaquePointer?, currentecpcontext: COpaquePointer?, nextecptype: COpaquePointer?, nextecpcontext: COpaquePointer?, nextecpcontextsize: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetRequestorProcess(callbackdata: COpaquePointer?): Peprocess =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetRequestorProcessId(callbackdata: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetRequestorProcessIdEx(callbackdata: COpaquePointer?): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetRequestorSessionId(callbackdata: COpaquePointer?, sessionid: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetRoutineAddress(fltmgrroutinename: Pcstr): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetSectionContext(instance: PfltInstance, fileobject: COpaquePointer?, context: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetStreamContext(instance: PfltInstance, fileobject: COpaquePointer?, context: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetStreamHandleContext(instance: PfltInstance, fileobject: COpaquePointer?, context: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetSwappedBufferMdlAddress(callbackdata: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetTopInstance(volume: PfltVolume, instance: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetTransactionContext(instance: PfltInstance, transaction: COpaquePointer?, context: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetTunneledName(callbackdata: COpaquePointer?, filenameinformation: COpaquePointer?, rettunneledfilenameinformation: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetUpperInstance(currentinstance: PfltInstance, upperinstance: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetVolumeContext(filter: PfltFilter, volume: PfltVolume, context: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetVolumeFromDeviceObject(filter: PfltFilter, deviceobject: COpaquePointer?, retvolume: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetVolumeFromFileObject(filter: PfltFilter, fileobject: COpaquePointer?, retvolume: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetVolumeFromInstance(instance: PfltInstance, retvolume: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetVolumeFromName(filter: PfltFilter, volumename: COpaquePointer?, retvolume: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetVolumeGuidName(volume: PfltVolume, volumeguidname: COpaquePointer?, buffersizeneeded: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetVolumeInformation(volume: PfltVolume, informationclass: FilterVolumeInformationClass, buffer: COpaquePointer?, buffersize: UInt, bytesreturned: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetVolumeInstanceFromName(filter: PfltFilter, volume: PfltVolume, instancename: COpaquePointer?, retinstance: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetVolumeName(volume: PfltVolume, volumename: COpaquePointer?, buffersizeneeded: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltGetVolumeProperties(volume: PfltVolume, volumeproperties: COpaquePointer?, volumepropertieslength: UInt, lengthreturned: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltInitExtraCreateParameterLookasideList(filter: PfltFilter, lookaside: COpaquePointer?, flags: UInt, size: ULong, tag: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltInitializeFileLock(filelock: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltInitializeOplock(oplock: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltInitializePushLock(pushlock: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltInsertExtraCreateParameter(filter: PfltFilter, ecplist: COpaquePointer?, ecpcontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltIs32bitProcess(callbackdata: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltIsCallbackDataDirty(data: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltIsDirectory(fileobject: COpaquePointer?, instance: PfltInstance, isdirectory: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltIsEcpAcknowledged(filter: PfltFilter, ecpcontext: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltIsEcpFromUserMode(filter: PfltFilter, ecpcontext: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltIsFltMgrVolumeDeviceObject(deviceobject: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltIsIoCanceled(callbackdata: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltIsIoRedirectionAllowed(sourceinstance: PfltInstance, targetinstance: PfltInstance, redirectionallowed: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltIsIoRedirectionAllowedForOperation(data: COpaquePointer?, targetinstance: PfltInstance, redirectionallowedthisio: COpaquePointer?, redirectionallowedallio: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltIsOperationSynchronous(callbackdata: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltIsVolumeSnapshot(fltobject: COpaquePointer?, issnapshotvolume: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltIsVolumeWritable(fltobject: COpaquePointer?, iswritable: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltLoadFilter(filtername: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltLockUserBuffer(callbackdata: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltNotifyFilterChangeDirectory(notifysync: PnotifySync, notifylist: COpaquePointer?, fscontext: COpaquePointer?, fulldirectoryname: COpaquePointer?, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifycallbackdata: COpaquePointer?, traversecallback: PcheckForTraverseAccess, subjectcontext: COpaquePointer?, filtercallback: PfilterReportChange) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltObjectDereference(fltobject: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltObjectReference(fltobject: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltOpenVolume(instance: PfltInstance, volumehandle: COpaquePointer?, volumefileobject: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltOplockBreakH(oplock: COpaquePointer?, callbackdata: COpaquePointer?, flags: UInt, context: COpaquePointer?, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltOplockBreakToNone(oplock: COpaquePointer?, callbackdata: COpaquePointer?, context: COpaquePointer?, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltOplockBreakToNoneEx(oplock: COpaquePointer?, callbackdata: COpaquePointer?, flags: UInt, context: COpaquePointer?, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltOplockFsctrl(oplock: COpaquePointer?, callbackdata: COpaquePointer?, opencount: UInt): FltPreopCallbackStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltOplockFsctrlEx(oplock: COpaquePointer?, callbackdata: COpaquePointer?, opencount: UInt, flags: UInt): FltPreopCallbackStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltOplockIsFastIoPossible(oplock: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltOplockIsSharedRequest(callbackdata: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltOplockKeysEqual(fo1: COpaquePointer?, fo2: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltParseFileName(filename: COpaquePointer?, extension: COpaquePointer?, stream: COpaquePointer?, finalcomponent: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltParseFileNameInformation(filenameinformation: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltPerformAsynchronousIo(callbackdata: COpaquePointer?, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltPerformSynchronousIo(callbackdata: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltPrePrepareComplete(instance: PfltInstance, transaction: COpaquePointer?, transactioncontext: PfltContext): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltPrepareComplete(instance: PfltInstance, transaction: COpaquePointer?, transactioncontext: PfltContext): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltPrepareToReuseEcp(filter: PfltFilter, ecpcontext: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltProcessFileLock(filelock: COpaquePointer?, callbackdata: COpaquePointer?, context: COpaquePointer?): FltPreopCallbackStatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltPropagateActivityIdToThread(callbackdata: COpaquePointer?, propagateid: COpaquePointer?, originalid: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltPropagateIrpExtension(sourcedata: COpaquePointer?, targetdata: COpaquePointer?, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltPurgeFileNameInformationCache(instance: PfltInstance, fileobject: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltQueryDirectoryFile(instance: PfltInstance, fileobject: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass, returnsingleentry: Boolean, filename: COpaquePointer?, restartscan: Boolean, lengthreturned: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltQueryDirectoryFileEx(instance: PfltInstance, fileobject: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass, queryflags: UInt, filename: COpaquePointer?, lengthreturned: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltQueryEaFile(instance: PfltInstance, fileobject: COpaquePointer?, returnedeadata: COpaquePointer?, length: UInt, returnsingleentry: Boolean, ealist: COpaquePointer?, ealistlength: UInt, eaindex: COpaquePointer?, restartscan: Boolean, lengthreturned: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltQueryInformationByName(filter: PfltFilter, instance: PfltInstance, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass, drivercontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltQueryInformationFile(instance: PfltInstance, fileobject: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass, lengthreturned: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltQueryQuotaInformationFile(instance: PfltInstance, fileobject: COpaquePointer?, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt, returnsingleentry: Boolean, sidlist: COpaquePointer?, sidlistlength: UInt, startsid: COpaquePointer?, restartscan: Boolean, lengthreturned: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltQuerySecurityObject(instance: PfltInstance, fileobject: COpaquePointer?, securityinformation: UInt, securitydescriptor: PsecurityDescriptor, length: UInt, lengthneeded: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltQueryVolumeInformation(instance: PfltInstance, iosb: COpaquePointer?, fsinformation: COpaquePointer?, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltQueryVolumeInformationFile(instance: PfltInstance, fileobject: COpaquePointer?, fsinformation: COpaquePointer?, length: UInt, fsinformationclass: FsInformationClass, lengthreturned: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltQueueDeferredIoWorkItem(fltworkitem: PfltDeferredIoWorkitem, data: COpaquePointer?, workerroutine: PfltDeferredIoWorkitemRoutine, queuetype: WorkQueueType, context: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltQueueGenericWorkItem(fltworkitem: PfltGenericWorkitem, fltobject: COpaquePointer?, workerroutine: PfltGenericWorkitemRoutine, queuetype: WorkQueueType, context: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltReadFile(initiatinginstance: PfltInstance, fileobject: COpaquePointer?, byteoffset: COpaquePointer?, length: UInt, buffer: COpaquePointer?, flags: UInt, bytesread: COpaquePointer?, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltReadFileEx(initiatinginstance: PfltInstance, fileobject: COpaquePointer?, byteoffset: COpaquePointer?, length: UInt, buffer: COpaquePointer?, flags: UInt, bytesread: COpaquePointer?, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: COpaquePointer?, key: COpaquePointer?, mdl: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltReferenceContext(context: PfltContext) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltReferenceFileNameInformation(filenameinformation: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltRegisterFilter(driver: COpaquePointer?, registration: COpaquePointer?, retfilter: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltRegisterForDataScan(instance: PfltInstance): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltReissueSynchronousIo(initiatinginstance: PfltInstance, callbackdata: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltReleaseContext(context: PfltContext) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltReleaseContexts(contexts: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltReleaseContextsEx(contextssize: ULong, contexts: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltReleaseFileNameInformation(filenameinformation: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltReleasePushLock(pushlock: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltReleasePushLockEx(pushlock: COpaquePointer?, flags: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltReleaseResource(resource: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltRemoveExtraCreateParameter(filter: PfltFilter, ecplist: COpaquePointer?, ecptype: COpaquePointer?, ecpcontext: COpaquePointer?, ecpcontextsize: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltRemoveOpenReparseEntry(filter: PfltFilter, data: COpaquePointer?, openreparseentry: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltRequestFileInfoOnCreateCompletion(filter: PfltFilter, data: COpaquePointer?, infoclassflags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltRequestOperationStatusCallback(data: COpaquePointer?, callbackroutine: PfltGetOperationStatusCallback, requestercontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltRetainSwappedBufferMdlAddress(callbackdata: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltRetrieveFileInfoOnCreateCompletion(filter: PfltFilter, data: COpaquePointer?, infoclass: UInt, size: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltRetrieveFileInfoOnCreateCompletionEx(filter: PfltFilter, data: COpaquePointer?, infoclass: UInt, retinfosize: COpaquePointer?, retinfobuffer: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltRetrieveIoPriorityInfo(data: COpaquePointer?, fileobject: COpaquePointer?, thread: Pethread, priorityinfo: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltReuseCallbackData(callbackdata: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltRollbackComplete(instance: PfltInstance, transaction: COpaquePointer?, transactioncontext: PfltContext): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltRollbackEnlistment(instance: PfltInstance, transaction: COpaquePointer?, transactioncontext: PfltContext): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltSendMessage(filter: PfltFilter, clientport: COpaquePointer?, senderbuffer: COpaquePointer?, senderbufferlength: UInt, replybuffer: COpaquePointer?, replylength: COpaquePointer?, timeout: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltSetActivityIdCallbackData(callbackdata: COpaquePointer?, guid: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltSetCallbackDataDirty(data: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltSetCancelCompletion(callbackdata: COpaquePointer?, canceledcallback: PfltCompleteCanceledCallback): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltSetEaFile(instance: PfltInstance, fileobject: COpaquePointer?, eabuffer: COpaquePointer?, length: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltSetEcpListIntoCallbackData(filter: PfltFilter, callbackdata: COpaquePointer?, ecplist: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltSetFileContext(instance: PfltInstance, fileobject: COpaquePointer?, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltSetFsZeroingOffset(data: COpaquePointer?, zeroingoffset: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltSetFsZeroingOffsetRequired(data: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltSetInformationFile(instance: PfltInstance, fileobject: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltSetInstanceContext(instance: PfltInstance, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltSetIoPriorityHintIntoCallbackData(data: COpaquePointer?, priorityhint: IoPriorityHint): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltSetIoPriorityHintIntoFileObject(fileobject: COpaquePointer?, priorityhint: IoPriorityHint): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltSetIoPriorityHintIntoThread(thread: Pethread, priorityhint: IoPriorityHint): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltSetQuotaInformationFile(instance: PfltInstance, fileobject: COpaquePointer?, buffer: COpaquePointer?, length: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltSetSecurityObject(instance: PfltInstance, fileobject: COpaquePointer?, securityinformation: UInt, securitydescriptor: PsecurityDescriptor): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltSetStreamContext(instance: PfltInstance, fileobject: COpaquePointer?, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltSetStreamHandleContext(instance: PfltInstance, fileobject: COpaquePointer?, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltSetTransactionContext(instance: PfltInstance, transaction: COpaquePointer?, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltSetVolumeContext(volume: PfltVolume, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltSetVolumeInformation(instance: PfltInstance, iosb: COpaquePointer?, fsinformation: COpaquePointer?, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltStartFiltering(filter: PfltFilter): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltSupportsFileContexts(fileobject: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltSupportsFileContextsEx(fileobject: COpaquePointer?, instance: PfltInstance): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltSupportsStreamContexts(fileobject: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltSupportsStreamHandleContexts(fileobject: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltTagFile(initiatinginstance: PfltInstance, fileobject: COpaquePointer?, filetag: UInt, guid: COpaquePointer?, databuffer: COpaquePointer?, databufferlength: UShort): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltTagFileEx(initiatinginstance: PfltInstance, fileobject: COpaquePointer?, filetag: UInt, guid: COpaquePointer?, databuffer: COpaquePointer?, databufferlength: UShort, existingfiletag: UInt, existingguid: COpaquePointer?, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltUninitializeFileLock(filelock: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltUninitializeOplock(oplock: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltUnloadFilter(filtername: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltUnregisterFilter(filter: PfltFilter) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fltUntagFile(initiatinginstance: PfltInstance, fileobject: COpaquePointer?, filetag: UInt, guid: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltVetoBypassIo(callbackdata: COpaquePointer?, fltobjects: COpaquePointer?, operationstatus: Ntstatus, failurereason: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltWriteFile(initiatinginstance: PfltInstance, fileobject: COpaquePointer?, byteoffset: COpaquePointer?, length: UInt, buffer: COpaquePointer?, flags: UInt, byteswritten: COpaquePointer?, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltWriteFileEx(initiatinginstance: PfltInstance, fileobject: COpaquePointer?, byteoffset: COpaquePointer?, length: UInt, buffer: COpaquePointer?, flags: UInt, byteswritten: COpaquePointer?, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: COpaquePointer?, key: COpaquePointer?, mdl: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fltpTraceRedirectedFileIo(originatingfileobject: COpaquePointer?, childcallbackdata: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
