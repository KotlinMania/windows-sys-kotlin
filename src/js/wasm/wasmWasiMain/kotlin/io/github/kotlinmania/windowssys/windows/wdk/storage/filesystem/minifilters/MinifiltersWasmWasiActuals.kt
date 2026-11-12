@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun fltAcknowledgeEcp(filter: PfltFilter, ecpcontext: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltAcknowledgeEcp")

public actual fun fltAcquirePushLockExclusive(pushlock: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockExclusive")

public actual fun fltAcquirePushLockExclusiveEx(pushlock: MutPtr, flags: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockExclusiveEx")

public actual fun fltAcquirePushLockShared(pushlock: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockShared")

public actual fun fltAcquirePushLockSharedEx(pushlock: MutPtr, flags: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockSharedEx")

public actual fun fltAcquireResourceExclusive(resource: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquireResourceExclusive")

public actual fun fltAcquireResourceShared(resource: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquireResourceShared")

public actual fun fltAddOpenReparseEntry(filter: PfltFilter, data: ConstPtr, openreparseentry: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltAddOpenReparseEntry")

public actual fun fltAdjustDeviceStackSizeForIoRedirection(sourceinstance: PfltInstance, targetinstance: PfltInstance, sourcedevicestacksizemodified: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltAdjustDeviceStackSizeForIoRedirection")

public actual fun fltAllocateCallbackData(instance: PfltInstance, fileobject: ConstPtr, retnewcallbackdata: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateCallbackData")

public actual fun fltAllocateCallbackDataEx(instance: PfltInstance, fileobject: ConstPtr, flags: UInt, retnewcallbackdata: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateCallbackDataEx")

public actual fun fltAllocateContext(filter: PfltFilter, contexttype: UShort, contextsize: ULong, pooltype: PoolType, returnedcontext: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateContext")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateDeferredIoWorkItem")
private external fun wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateDeferredIoWorkItem(): Long

public actual fun fltAllocateDeferredIoWorkItem(): PfltDeferredIoWorkitem =
    wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateDeferredIoWorkItem()

public actual fun fltAllocateExtraCreateParameter(filter: PfltFilter, ecptype: ConstPtr, sizeofcontext: UInt, flags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, pooltag: UInt, ecpcontext: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateExtraCreateParameter")

public actual fun fltAllocateExtraCreateParameterFromLookasideList(filter: PfltFilter, ecptype: ConstPtr, sizeofcontext: UInt, flags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, lookasidelist: MutPtr, ecpcontext: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateExtraCreateParameterFromLookasideList")

public actual fun fltAllocateExtraCreateParameterList(filter: PfltFilter, flags: UInt, ecplist: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateExtraCreateParameterList")

public actual fun fltAllocateFileLock(completelockcallbackdataroutine: PfltCompleteLockCallbackDataRoutine, unlockroutine: PunlockRoutine): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateFileLock")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateGenericWorkItem")
private external fun wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateGenericWorkItem(): Long

public actual fun fltAllocateGenericWorkItem(): PfltGenericWorkitem =
    wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateGenericWorkItem()

public actual fun fltAllocatePoolAlignedWithTag(instance: PfltInstance, pooltype: PoolType, numberofbytes: ULong, tag: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocatePoolAlignedWithTag")

public actual fun fltApplyPriorityInfoThread(inputpriorityinfo: ConstPtr, outputpriorityinfo: MutPtr, thread: Pethread): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltApplyPriorityInfoThread")

public actual fun fltAttachVolume(filter: PfltFilter, volume: PfltVolume, instancename: ConstPtr, retinstance: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltAttachVolume")

public actual fun fltAttachVolumeAtAltitude(filter: PfltFilter, volume: PfltVolume, altitude: ConstPtr, instancename: ConstPtr, retinstance: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltAttachVolumeAtAltitude")

public actual fun fltBuildDefaultSecurityDescriptor(securitydescriptor: MutPtr, desiredaccess: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltBuildDefaultSecurityDescriptor")

public actual fun fltCancelFileOpen(instance: PfltInstance, fileobject: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCancelFileOpen")

public actual fun fltCancelIo(callbackdata: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCancelIo")

public actual fun fltCancellableWaitForMultipleObjects(count: UInt, objectarray: ConstPtr, waittype: WaitType, timeout: ConstPtr, waitblockarray: ConstPtr, callbackdata: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCancellableWaitForMultipleObjects")

public actual fun fltCancellableWaitForSingleObject(obj: ConstPtr, timeout: ConstPtr, callbackdata: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCancellableWaitForSingleObject")

public actual fun fltCbdqDisable(cbdq: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqDisable")

public actual fun fltCbdqEnable(cbdq: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqEnable")

public actual fun fltCbdqInitialize(instance: PfltInstance, cbdq: MutPtr, cbdqinsertio: PfltCallbackDataQueueInsertIo, cbdqremoveio: PfltCallbackDataQueueRemoveIo, cbdqpeeknextio: PfltCallbackDataQueuePeekNextIo, cbdqacquire: PfltCallbackDataQueueAcquire, cbdqrelease: PfltCallbackDataQueueRelease, cbdqcompletecanceledio: PfltCallbackDataQueueCompleteCanceledIo): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqInitialize")

public actual fun fltCbdqInsertIo(cbdq: MutPtr, cbd: ConstPtr, context: ConstPtr, insertcontext: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqInsertIo")

public actual fun fltCbdqRemoveIo(cbdq: MutPtr, context: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqRemoveIo")

public actual fun fltCbdqRemoveNextIo(cbdq: MutPtr, peekcontext: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqRemoveNextIo")

public actual fun fltCheckAndGrowNameControl(namectrl: MutPtr, newsize: UShort): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckAndGrowNameControl")

public actual fun fltCheckLockForReadAccess(filelock: ConstPtr, callbackdata: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckLockForReadAccess")

public actual fun fltCheckLockForWriteAccess(filelock: ConstPtr, callbackdata: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckLockForWriteAccess")

public actual fun fltCheckOplock(oplock: ConstPtr, callbackdata: ConstPtr, context: ConstPtr, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckOplock")

public actual fun fltCheckOplockEx(oplock: ConstPtr, callbackdata: ConstPtr, flags: UInt, context: ConstPtr, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckOplockEx")

public actual fun fltClearCallbackDataDirty(data: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltClearCallbackDataDirty")

public actual fun fltClearCancelCompletion(callbackdata: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltClearCancelCompletion")

public actual fun fltClose(filehandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltClose")

public actual fun fltCloseClientPort(filter: PfltFilter, clientport: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCloseClientPort")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemMinifiltersFltCloseCommunicationPort")
private external fun wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltCloseCommunicationPort(serverport: Long): Unit

public actual fun fltCloseCommunicationPort(serverport: PfltPort): Unit =
    wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltCloseCommunicationPort(serverport)

public actual fun fltCloseSectionForDataScan(sectioncontext: PfltContext): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCloseSectionForDataScan")

public actual fun fltCommitComplete(instance: PfltInstance, transaction: ConstPtr, transactioncontext: PfltContext): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCommitComplete")

public actual fun fltCommitFinalizeComplete(instance: PfltInstance, transaction: ConstPtr, transactioncontext: PfltContext): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCommitFinalizeComplete")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemMinifiltersFltCompareInstanceAltitudes")
private external fun wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltCompareInstanceAltitudes(instance1: Long, instance2: Long): Int

public actual fun fltCompareInstanceAltitudes(instance1: PfltInstance, instance2: PfltInstance): Int =
    wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltCompareInstanceAltitudes(instance1, instance2)

public actual fun fltCompletePendedPostOperation(callbackdata: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCompletePendedPostOperation")

public actual fun fltCompletePendedPreOperation(callbackdata: ConstPtr, callbackstatus: FltPreopCallbackStatus, context: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCompletePendedPreOperation")

public actual fun fltCopyOpenReparseList(filter: PfltFilter, data: ConstPtr, ecplist: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCopyOpenReparseList")

public actual fun fltCreateCommunicationPort(filter: PfltFilter, serverport: MutPtr, objectattributes: ConstPtr, serverportcookie: ConstPtr, connectnotifycallback: PfltConnectNotify, disconnectnotifycallback: PfltDisconnectNotify, messagenotifycallback: PfltMessageNotify, maxconnections: Int): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateCommunicationPort")

public actual fun fltCreateFile(filter: PfltFilter, instance: PfltInstance, filehandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, iostatusblock: MutPtr, allocationsize: ConstPtr, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: ConstPtr, ealength: UInt, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateFile")

public actual fun fltCreateFileEx(filter: PfltFilter, instance: PfltInstance, filehandle: MutPtr, fileobject: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, iostatusblock: MutPtr, allocationsize: ConstPtr, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: ConstPtr, ealength: UInt, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateFileEx")

public actual fun fltCreateFileEx2(filter: PfltFilter, instance: PfltInstance, filehandle: MutPtr, fileobject: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, iostatusblock: MutPtr, allocationsize: ConstPtr, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: ConstPtr, ealength: UInt, flags: UInt, drivercontext: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateFileEx2")

public actual fun fltCreateMailslotFile(filter: PfltFilter, instance: PfltInstance, filehandle: MutPtr, fileobject: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, iostatusblock: MutPtr, createoptions: UInt, mailslotquota: UInt, maximummessagesize: UInt, readtimeout: ConstPtr, drivercontext: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateMailslotFile")

public actual fun fltCreateNamedPipeFile(filter: PfltFilter, instance: PfltInstance, filehandle: MutPtr, fileobject: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, iostatusblock: MutPtr, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, namedpipetype: UInt, readmode: UInt, completionmode: UInt, maximuminstances: UInt, inboundquota: UInt, outboundquota: UInt, defaulttimeout: ConstPtr, drivercontext: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateNamedPipeFile")

public actual fun fltCreateSectionForDataScan(instance: PfltInstance, fileobject: ConstPtr, sectioncontext: PfltContext, desiredaccess: UInt, objectattributes: ConstPtr, maximumsize: ConstPtr, sectionpageprotection: UInt, allocationattributes: UInt, flags: UInt, sectionhandle: MutPtr, sectionobject: MutPtr, sectionfilesize: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateSectionForDataScan")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateSystemVolumeInformationFolder")
private external fun wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltCreateSystemVolumeInformationFolder(instance: Long): Int

public actual fun fltCreateSystemVolumeInformationFolder(instance: PfltInstance): Ntstatus =
    wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltCreateSystemVolumeInformationFolder(instance)

public actual fun fltCurrentBatchOplock(oplock: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCurrentBatchOplock")

public actual fun fltCurrentOplock(oplock: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCurrentOplock")

public actual fun fltCurrentOplockH(oplock: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCurrentOplockH")

public actual fun fltDecodeParameters(callbackdata: ConstPtr, mdladdresspointer: MutPtr, buffer: MutPtr, length: MutPtr, desiredaccess: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltDecodeParameters")

public actual fun fltDeleteContext(context: PfltContext): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteContext")

public actual fun fltDeleteExtraCreateParameterLookasideList(filter: PfltFilter, lookaside: MutPtr, flags: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteExtraCreateParameterLookasideList")

public actual fun fltDeleteFileContext(instance: PfltInstance, fileobject: ConstPtr, oldcontext: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteFileContext")

public actual fun fltDeleteInstanceContext(instance: PfltInstance, oldcontext: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteInstanceContext")

public actual fun fltDeletePushLock(pushlock: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltDeletePushLock")

public actual fun fltDeleteStreamContext(instance: PfltInstance, fileobject: ConstPtr, oldcontext: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteStreamContext")

public actual fun fltDeleteStreamHandleContext(instance: PfltInstance, fileobject: ConstPtr, oldcontext: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteStreamHandleContext")

public actual fun fltDeleteTransactionContext(instance: PfltInstance, transaction: ConstPtr, oldcontext: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteTransactionContext")

public actual fun fltDeleteVolumeContext(filter: PfltFilter, volume: PfltVolume, oldcontext: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteVolumeContext")

public actual fun fltDetachVolume(filter: PfltFilter, volume: PfltVolume, instancename: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltDetachVolume")

public actual fun fltDeviceIoControlFile(instance: PfltInstance, fileobject: ConstPtr, iocontrolcode: UInt, inputbuffer: ConstPtr, inputbufferlength: UInt, outputbuffer: MutPtr, outputbufferlength: UInt, lengthreturned: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltDeviceIoControlFile")

public actual fun fltDoCompletionProcessingWhenSafe(data: ConstPtr, fltobjects: ConstPtr, completioncontext: ConstPtr, flags: UInt, safepostcallback: PfltPostOperationCallback, retpostoperationstatus: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltDoCompletionProcessingWhenSafe")

public actual fun fltEnlistInTransaction(instance: PfltInstance, transaction: ConstPtr, transactioncontext: PfltContext, notificationmask: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltEnlistInTransaction")

public actual fun fltEnumerateFilterInformation(index: UInt, informationclass: FilterInformationClass, buffer: MutPtr, buffersize: UInt, bytesreturned: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateFilterInformation")

public actual fun fltEnumerateFilters(filterlist: MutPtr, filterlistsize: UInt, numberfiltersreturned: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateFilters")

public actual fun fltEnumerateInstanceInformationByDeviceObject(deviceobject: ConstPtr, index: UInt, informationclass: InstanceInformationClass, buffer: MutPtr, buffersize: UInt, bytesreturned: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByDeviceObject")

public actual fun fltEnumerateInstanceInformationByFilter(filter: PfltFilter, index: UInt, informationclass: InstanceInformationClass, buffer: MutPtr, buffersize: UInt, bytesreturned: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByFilter")

public actual fun fltEnumerateInstanceInformationByVolume(volume: PfltVolume, index: UInt, informationclass: InstanceInformationClass, buffer: MutPtr, buffersize: UInt, bytesreturned: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByVolume")

public actual fun fltEnumerateInstanceInformationByVolumeName(volumename: ConstPtr, index: UInt, informationclass: InstanceInformationClass, buffer: MutPtr, buffersize: UInt, bytesreturned: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByVolumeName")

public actual fun fltEnumerateInstances(volume: PfltVolume, filter: PfltFilter, instancelist: MutPtr, instancelistsize: UInt, numberinstancesreturned: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstances")

public actual fun fltEnumerateVolumeInformation(filter: PfltFilter, index: UInt, informationclass: FilterVolumeInformationClass, buffer: MutPtr, buffersize: UInt, bytesreturned: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateVolumeInformation")

public actual fun fltEnumerateVolumes(filter: PfltFilter, volumelist: MutPtr, volumelistsize: UInt, numbervolumesreturned: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateVolumes")

public actual fun fltFastIoMdlRead(initiatinginstance: PfltInstance, fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, lockkey: UInt, mdlchain: MutPtr, iostatus: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoMdlRead")

public actual fun fltFastIoMdlReadComplete(initiatinginstance: PfltInstance, fileobject: ConstPtr, mdlchain: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoMdlReadComplete")

public actual fun fltFastIoMdlWriteComplete(initiatinginstance: PfltInstance, fileobject: ConstPtr, fileoffset: ConstPtr, mdlchain: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoMdlWriteComplete")

public actual fun fltFastIoPrepareMdlWrite(initiatinginstance: PfltInstance, fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, lockkey: UInt, mdlchain: MutPtr, iostatus: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoPrepareMdlWrite")

public actual fun fltFindExtraCreateParameter(filter: PfltFilter, ecplist: ConstPtr, ecptype: ConstPtr, ecpcontext: MutPtr, ecpcontextsize: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltFindExtraCreateParameter")

public actual fun fltFlushBuffers(instance: PfltInstance, fileobject: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltFlushBuffers")

public actual fun fltFlushBuffers2(instance: PfltInstance, fileobject: ConstPtr, flushtype: UInt, callbackdata: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltFlushBuffers2")

public actual fun fltFreeCallbackData(callbackdata: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeCallbackData")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeDeferredIoWorkItem")
private external fun wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltFreeDeferredIoWorkItem(fltworkitem: Long): Unit

public actual fun fltFreeDeferredIoWorkItem(fltworkitem: PfltDeferredIoWorkitem): Unit =
    wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltFreeDeferredIoWorkItem(fltworkitem)

public actual fun fltFreeExtraCreateParameter(filter: PfltFilter, ecpcontext: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeExtraCreateParameter")

public actual fun fltFreeExtraCreateParameterList(filter: PfltFilter, ecplist: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeExtraCreateParameterList")

public actual fun fltFreeFileLock(filelock: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeFileLock")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeGenericWorkItem")
private external fun wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltFreeGenericWorkItem(fltworkitem: Long): Unit

public actual fun fltFreeGenericWorkItem(fltworkitem: PfltGenericWorkitem): Unit =
    wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltFreeGenericWorkItem(fltworkitem)

public actual fun fltFreeOpenReparseList(filter: PfltFilter, ecplist: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeOpenReparseList")

public actual fun fltFreePoolAlignedWithTag(instance: PfltInstance, buffer: ConstPtr, tag: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltFreePoolAlignedWithTag")

public actual fun fltFreeSecurityDescriptor(securitydescriptor: PsecurityDescriptor): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeSecurityDescriptor")

public actual fun fltFsControlFile(instance: PfltInstance, fileobject: ConstPtr, fscontrolcode: UInt, inputbuffer: ConstPtr, inputbufferlength: UInt, outputbuffer: MutPtr, outputbufferlength: UInt, lengthreturned: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltFsControlFile")

public actual fun fltGetActivityIdCallbackData(callbackdata: ConstPtr, guid: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetActivityIdCallbackData")

public actual fun fltGetBottomInstance(volume: PfltVolume, instance: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetBottomInstance")

public actual fun fltGetContexts(fltobjects: ConstPtr, desiredcontexts: UShort, contexts: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetContexts")

public actual fun fltGetContextsEx(fltobjects: ConstPtr, desiredcontexts: UShort, contextssize: ULong, contexts: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetContextsEx")

public actual fun fltGetDestinationFileNameInformation(instance: PfltInstance, fileobject: ConstPtr, rootdirectory: Handle, filename: Pcwstr, filenamelength: UInt, nameoptions: UInt, retfilenameinformation: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetDestinationFileNameInformation")

public actual fun fltGetDeviceObject(volume: PfltVolume, deviceobject: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetDeviceObject")

public actual fun fltGetDiskDeviceObject(volume: PfltVolume, diskdeviceobject: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetDiskDeviceObject")

public actual fun fltGetEcpListFromCallbackData(filter: PfltFilter, callbackdata: ConstPtr, ecplist: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetEcpListFromCallbackData")

public actual fun fltGetFileContext(instance: PfltInstance, fileobject: ConstPtr, context: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileContext")

public actual fun fltGetFileNameInformation(callbackdata: ConstPtr, nameoptions: UInt, filenameinformation: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileNameInformation")

public actual fun fltGetFileNameInformationUnsafe(fileobject: ConstPtr, instance: PfltInstance, nameoptions: UInt, filenameinformation: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileNameInformationUnsafe")

public actual fun fltGetFileSystemType(fltobject: ConstPtr, filesystemtype: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileSystemType")

public actual fun fltGetFilterFromInstance(instance: PfltInstance, retfilter: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFilterFromInstance")

public actual fun fltGetFilterFromName(filtername: ConstPtr, retfilter: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFilterFromName")

public actual fun fltGetFilterInformation(filter: PfltFilter, informationclass: FilterInformationClass, buffer: MutPtr, buffersize: UInt, bytesreturned: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFilterInformation")

public actual fun fltGetFsZeroingOffset(data: ConstPtr, zeroingoffset: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFsZeroingOffset")

public actual fun fltGetInstanceContext(instance: PfltInstance, context: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetInstanceContext")

public actual fun fltGetInstanceInformation(instance: PfltInstance, informationclass: InstanceInformationClass, buffer: MutPtr, buffersize: UInt, bytesreturned: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetInstanceInformation")

public actual fun fltGetIoAttributionHandleFromCallbackData(data: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoAttributionHandleFromCallbackData")

public actual fun fltGetIoPriorityHint(data: ConstPtr): IoPriorityHint =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHint")

public actual fun fltGetIoPriorityHintFromCallbackData(data: ConstPtr): IoPriorityHint =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHintFromCallbackData")

public actual fun fltGetIoPriorityHintFromFileObject(fileobject: ConstPtr): IoPriorityHint =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHintFromFileObject")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHintFromThread")
private external fun wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHintFromThread(thread: Long): Int

public actual fun fltGetIoPriorityHintFromThread(thread: Pethread): IoPriorityHint =
    wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHintFromThread(thread)

public actual fun fltGetIrpName(irpmajorcode: UByte): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIrpName")

public actual fun fltGetLowerInstance(currentinstance: PfltInstance, lowerinstance: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetLowerInstance")

public actual fun fltGetNewSystemBufferAddress(callbackdata: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetNewSystemBufferAddress")

public actual fun fltGetNextExtraCreateParameter(filter: PfltFilter, ecplist: ConstPtr, currentecpcontext: ConstPtr, nextecptype: MutPtr, nextecpcontext: MutPtr, nextecpcontextsize: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetNextExtraCreateParameter")

public actual fun fltGetRequestorProcess(callbackdata: ConstPtr): Peprocess =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorProcess")

public actual fun fltGetRequestorProcessId(callbackdata: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorProcessId")

public actual fun fltGetRequestorProcessIdEx(callbackdata: ConstPtr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorProcessIdEx")

public actual fun fltGetRequestorSessionId(callbackdata: ConstPtr, sessionid: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorSessionId")

public actual fun fltGetRoutineAddress(fltmgrroutinename: Pcstr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRoutineAddress")

public actual fun fltGetSectionContext(instance: PfltInstance, fileobject: ConstPtr, context: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetSectionContext")

public actual fun fltGetStreamContext(instance: PfltInstance, fileobject: ConstPtr, context: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetStreamContext")

public actual fun fltGetStreamHandleContext(instance: PfltInstance, fileobject: ConstPtr, context: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetStreamHandleContext")

public actual fun fltGetSwappedBufferMdlAddress(callbackdata: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetSwappedBufferMdlAddress")

public actual fun fltGetTopInstance(volume: PfltVolume, instance: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetTopInstance")

public actual fun fltGetTransactionContext(instance: PfltInstance, transaction: ConstPtr, context: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetTransactionContext")

public actual fun fltGetTunneledName(callbackdata: ConstPtr, filenameinformation: ConstPtr, rettunneledfilenameinformation: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetTunneledName")

public actual fun fltGetUpperInstance(currentinstance: PfltInstance, upperinstance: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetUpperInstance")

public actual fun fltGetVolumeContext(filter: PfltFilter, volume: PfltVolume, context: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeContext")

public actual fun fltGetVolumeFromDeviceObject(filter: PfltFilter, deviceobject: ConstPtr, retvolume: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromDeviceObject")

public actual fun fltGetVolumeFromFileObject(filter: PfltFilter, fileobject: ConstPtr, retvolume: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromFileObject")

public actual fun fltGetVolumeFromInstance(instance: PfltInstance, retvolume: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromInstance")

public actual fun fltGetVolumeFromName(filter: PfltFilter, volumename: ConstPtr, retvolume: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromName")

public actual fun fltGetVolumeGuidName(volume: PfltVolume, volumeguidname: MutPtr, buffersizeneeded: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeGuidName")

public actual fun fltGetVolumeInformation(volume: PfltVolume, informationclass: FilterVolumeInformationClass, buffer: MutPtr, buffersize: UInt, bytesreturned: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeInformation")

public actual fun fltGetVolumeInstanceFromName(filter: PfltFilter, volume: PfltVolume, instancename: ConstPtr, retinstance: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeInstanceFromName")

public actual fun fltGetVolumeName(volume: PfltVolume, volumename: MutPtr, buffersizeneeded: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeName")

public actual fun fltGetVolumeProperties(volume: PfltVolume, volumeproperties: MutPtr, volumepropertieslength: UInt, lengthreturned: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeProperties")

public actual fun fltInitExtraCreateParameterLookasideList(filter: PfltFilter, lookaside: MutPtr, flags: UInt, size: ULong, tag: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltInitExtraCreateParameterLookasideList")

public actual fun fltInitializeFileLock(filelock: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltInitializeFileLock")

public actual fun fltInitializeOplock(oplock: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltInitializeOplock")

public actual fun fltInitializePushLock(pushlock: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltInitializePushLock")

public actual fun fltInsertExtraCreateParameter(filter: PfltFilter, ecplist: MutPtr, ecpcontext: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltInsertExtraCreateParameter")

public actual fun fltIs32bitProcess(callbackdata: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltIs32bitProcess")

public actual fun fltIsCallbackDataDirty(data: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltIsCallbackDataDirty")

public actual fun fltIsDirectory(fileobject: ConstPtr, instance: PfltInstance, isdirectory: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltIsDirectory")

public actual fun fltIsEcpAcknowledged(filter: PfltFilter, ecpcontext: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltIsEcpAcknowledged")

public actual fun fltIsEcpFromUserMode(filter: PfltFilter, ecpcontext: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltIsEcpFromUserMode")

public actual fun fltIsFltMgrVolumeDeviceObject(deviceobject: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltIsFltMgrVolumeDeviceObject")

public actual fun fltIsIoCanceled(callbackdata: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltIsIoCanceled")

public actual fun fltIsIoRedirectionAllowed(sourceinstance: PfltInstance, targetinstance: PfltInstance, redirectionallowed: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltIsIoRedirectionAllowed")

public actual fun fltIsIoRedirectionAllowedForOperation(data: ConstPtr, targetinstance: PfltInstance, redirectionallowedthisio: MutPtr, redirectionallowedallio: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltIsIoRedirectionAllowedForOperation")

public actual fun fltIsOperationSynchronous(callbackdata: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltIsOperationSynchronous")

public actual fun fltIsVolumeSnapshot(fltobject: ConstPtr, issnapshotvolume: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltIsVolumeSnapshot")

public actual fun fltIsVolumeWritable(fltobject: ConstPtr, iswritable: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltIsVolumeWritable")

public actual fun fltLoadFilter(filtername: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltLoadFilter")

public actual fun fltLockUserBuffer(callbackdata: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltLockUserBuffer")

public actual fun fltNotifyFilterChangeDirectory(notifysync: PnotifySync, notifylist: MutPtr, fscontext: ConstPtr, fulldirectoryname: ConstPtr, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifycallbackdata: ConstPtr, traversecallback: PcheckForTraverseAccess, subjectcontext: ConstPtr, filtercallback: PfilterReportChange): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltNotifyFilterChangeDirectory")

public actual fun fltObjectDereference(fltobject: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltObjectDereference")

public actual fun fltObjectReference(fltobject: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltObjectReference")

public actual fun fltOpenVolume(instance: PfltInstance, volumehandle: MutPtr, volumefileobject: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltOpenVolume")

public actual fun fltOplockBreakH(oplock: ConstPtr, callbackdata: ConstPtr, flags: UInt, context: ConstPtr, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockBreakH")

public actual fun fltOplockBreakToNone(oplock: ConstPtr, callbackdata: ConstPtr, context: ConstPtr, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockBreakToNone")

public actual fun fltOplockBreakToNoneEx(oplock: ConstPtr, callbackdata: ConstPtr, flags: UInt, context: ConstPtr, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockBreakToNoneEx")

public actual fun fltOplockFsctrl(oplock: ConstPtr, callbackdata: ConstPtr, opencount: UInt): FltPreopCallbackStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockFsctrl")

public actual fun fltOplockFsctrlEx(oplock: ConstPtr, callbackdata: ConstPtr, opencount: UInt, flags: UInt): FltPreopCallbackStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockFsctrlEx")

public actual fun fltOplockIsFastIoPossible(oplock: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockIsFastIoPossible")

public actual fun fltOplockIsSharedRequest(callbackdata: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockIsSharedRequest")

public actual fun fltOplockKeysEqual(fo1: ConstPtr, fo2: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockKeysEqual")

public actual fun fltParseFileName(filename: ConstPtr, extension: MutPtr, stream: MutPtr, finalcomponent: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltParseFileName")

public actual fun fltParseFileNameInformation(filenameinformation: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltParseFileNameInformation")

public actual fun fltPerformAsynchronousIo(callbackdata: MutPtr, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltPerformAsynchronousIo")

public actual fun fltPerformSynchronousIo(callbackdata: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltPerformSynchronousIo")

public actual fun fltPrePrepareComplete(instance: PfltInstance, transaction: ConstPtr, transactioncontext: PfltContext): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltPrePrepareComplete")

public actual fun fltPrepareComplete(instance: PfltInstance, transaction: ConstPtr, transactioncontext: PfltContext): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltPrepareComplete")

public actual fun fltPrepareToReuseEcp(filter: PfltFilter, ecpcontext: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltPrepareToReuseEcp")

public actual fun fltProcessFileLock(filelock: ConstPtr, callbackdata: ConstPtr, context: ConstPtr): FltPreopCallbackStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltProcessFileLock")

public actual fun fltPropagateActivityIdToThread(callbackdata: ConstPtr, propagateid: MutPtr, originalid: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltPropagateActivityIdToThread")

public actual fun fltPropagateIrpExtension(sourcedata: ConstPtr, targetdata: MutPtr, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltPropagateIrpExtension")

public actual fun fltPurgeFileNameInformationCache(instance: PfltInstance, fileobject: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltPurgeFileNameInformationCache")

public actual fun fltQueryDirectoryFile(instance: PfltInstance, fileobject: ConstPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass, returnsingleentry: Boolean, filename: ConstPtr, restartscan: Boolean, lengthreturned: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryDirectoryFile")

public actual fun fltQueryDirectoryFileEx(instance: PfltInstance, fileobject: ConstPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass, queryflags: UInt, filename: ConstPtr, lengthreturned: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryDirectoryFileEx")

public actual fun fltQueryEaFile(instance: PfltInstance, fileobject: ConstPtr, returnedeadata: MutPtr, length: UInt, returnsingleentry: Boolean, ealist: ConstPtr, ealistlength: UInt, eaindex: ConstPtr, restartscan: Boolean, lengthreturned: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryEaFile")

public actual fun fltQueryInformationByName(filter: PfltFilter, instance: PfltInstance, objectattributes: ConstPtr, iostatusblock: MutPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass, drivercontext: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryInformationByName")

public actual fun fltQueryInformationFile(instance: PfltInstance, fileobject: ConstPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass, lengthreturned: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryInformationFile")

public actual fun fltQueryQuotaInformationFile(instance: PfltInstance, fileobject: ConstPtr, iostatusblock: MutPtr, buffer: MutPtr, length: UInt, returnsingleentry: Boolean, sidlist: ConstPtr, sidlistlength: UInt, startsid: ConstPtr, restartscan: Boolean, lengthreturned: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryQuotaInformationFile")

public actual fun fltQuerySecurityObject(instance: PfltInstance, fileobject: ConstPtr, securityinformation: UInt, securitydescriptor: PsecurityDescriptor, length: UInt, lengthneeded: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltQuerySecurityObject")

public actual fun fltQueryVolumeInformation(instance: PfltInstance, iosb: MutPtr, fsinformation: MutPtr, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryVolumeInformation")

public actual fun fltQueryVolumeInformationFile(instance: PfltInstance, fileobject: ConstPtr, fsinformation: MutPtr, length: UInt, fsinformationclass: FsInformationClass, lengthreturned: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryVolumeInformationFile")

public actual fun fltQueueDeferredIoWorkItem(fltworkitem: PfltDeferredIoWorkitem, data: ConstPtr, workerroutine: PfltDeferredIoWorkitemRoutine, queuetype: WorkQueueType, context: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltQueueDeferredIoWorkItem")

public actual fun fltQueueGenericWorkItem(fltworkitem: PfltGenericWorkitem, fltobject: ConstPtr, workerroutine: PfltGenericWorkitemRoutine, queuetype: WorkQueueType, context: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltQueueGenericWorkItem")

public actual fun fltReadFile(initiatinginstance: PfltInstance, fileobject: ConstPtr, byteoffset: ConstPtr, length: UInt, buffer: MutPtr, flags: UInt, bytesread: MutPtr, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltReadFile")

public actual fun fltReadFileEx(initiatinginstance: PfltInstance, fileobject: ConstPtr, byteoffset: ConstPtr, length: UInt, buffer: MutPtr, flags: UInt, bytesread: MutPtr, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: ConstPtr, key: ConstPtr, mdl: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltReadFileEx")

public actual fun fltReferenceContext(context: PfltContext): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltReferenceContext")

public actual fun fltReferenceFileNameInformation(filenameinformation: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltReferenceFileNameInformation")

public actual fun fltRegisterFilter(driver: ConstPtr, registration: ConstPtr, retfilter: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltRegisterFilter")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemMinifiltersFltRegisterForDataScan")
private external fun wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltRegisterForDataScan(instance: Long): Int

public actual fun fltRegisterForDataScan(instance: PfltInstance): Ntstatus =
    wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltRegisterForDataScan(instance)

public actual fun fltReissueSynchronousIo(initiatinginstance: PfltInstance, callbackdata: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltReissueSynchronousIo")

public actual fun fltReleaseContext(context: PfltContext): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseContext")

public actual fun fltReleaseContexts(contexts: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseContexts")

public actual fun fltReleaseContextsEx(contextssize: ULong, contexts: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseContextsEx")

public actual fun fltReleaseFileNameInformation(filenameinformation: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseFileNameInformation")

public actual fun fltReleasePushLock(pushlock: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltReleasePushLock")

public actual fun fltReleasePushLockEx(pushlock: MutPtr, flags: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltReleasePushLockEx")

public actual fun fltReleaseResource(resource: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseResource")

public actual fun fltRemoveExtraCreateParameter(filter: PfltFilter, ecplist: MutPtr, ecptype: ConstPtr, ecpcontext: MutPtr, ecpcontextsize: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltRemoveExtraCreateParameter")

public actual fun fltRemoveOpenReparseEntry(filter: PfltFilter, data: ConstPtr, openreparseentry: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltRemoveOpenReparseEntry")

public actual fun fltRequestFileInfoOnCreateCompletion(filter: PfltFilter, data: ConstPtr, infoclassflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltRequestFileInfoOnCreateCompletion")

public actual fun fltRequestOperationStatusCallback(data: ConstPtr, callbackroutine: PfltGetOperationStatusCallback, requestercontext: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltRequestOperationStatusCallback")

public actual fun fltRetainSwappedBufferMdlAddress(callbackdata: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltRetainSwappedBufferMdlAddress")

public actual fun fltRetrieveFileInfoOnCreateCompletion(filter: PfltFilter, data: ConstPtr, infoclass: UInt, size: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltRetrieveFileInfoOnCreateCompletion")

public actual fun fltRetrieveFileInfoOnCreateCompletionEx(filter: PfltFilter, data: ConstPtr, infoclass: UInt, retinfosize: MutPtr, retinfobuffer: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltRetrieveFileInfoOnCreateCompletionEx")

public actual fun fltRetrieveIoPriorityInfo(data: ConstPtr, fileobject: ConstPtr, thread: Pethread, priorityinfo: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltRetrieveIoPriorityInfo")

public actual fun fltReuseCallbackData(callbackdata: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltReuseCallbackData")

public actual fun fltRollbackComplete(instance: PfltInstance, transaction: ConstPtr, transactioncontext: PfltContext): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltRollbackComplete")

public actual fun fltRollbackEnlistment(instance: PfltInstance, transaction: ConstPtr, transactioncontext: PfltContext): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltRollbackEnlistment")

public actual fun fltSendMessage(filter: PfltFilter, clientport: ConstPtr, senderbuffer: ConstPtr, senderbufferlength: UInt, replybuffer: MutPtr, replylength: MutPtr, timeout: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSendMessage")

public actual fun fltSetActivityIdCallbackData(callbackdata: MutPtr, guid: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSetActivityIdCallbackData")

public actual fun fltSetCallbackDataDirty(data: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSetCallbackDataDirty")

public actual fun fltSetCancelCompletion(callbackdata: ConstPtr, canceledcallback: PfltCompleteCanceledCallback): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSetCancelCompletion")

public actual fun fltSetEaFile(instance: PfltInstance, fileobject: ConstPtr, eabuffer: ConstPtr, length: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSetEaFile")

public actual fun fltSetEcpListIntoCallbackData(filter: PfltFilter, callbackdata: ConstPtr, ecplist: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSetEcpListIntoCallbackData")

public actual fun fltSetFileContext(instance: PfltInstance, fileobject: ConstPtr, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSetFileContext")

public actual fun fltSetFsZeroingOffset(data: ConstPtr, zeroingoffset: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSetFsZeroingOffset")

public actual fun fltSetFsZeroingOffsetRequired(data: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSetFsZeroingOffsetRequired")

public actual fun fltSetInformationFile(instance: PfltInstance, fileobject: ConstPtr, fileinformation: ConstPtr, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSetInformationFile")

public actual fun fltSetInstanceContext(instance: PfltInstance, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSetInstanceContext")

public actual fun fltSetIoPriorityHintIntoCallbackData(data: ConstPtr, priorityhint: IoPriorityHint): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSetIoPriorityHintIntoCallbackData")

public actual fun fltSetIoPriorityHintIntoFileObject(fileobject: ConstPtr, priorityhint: IoPriorityHint): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSetIoPriorityHintIntoFileObject")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemMinifiltersFltSetIoPriorityHintIntoThread")
private external fun wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltSetIoPriorityHintIntoThread(thread: Long, priorityhint: Int): Int

public actual fun fltSetIoPriorityHintIntoThread(thread: Pethread, priorityhint: IoPriorityHint): Ntstatus =
    wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltSetIoPriorityHintIntoThread(thread, priorityhint)

public actual fun fltSetQuotaInformationFile(instance: PfltInstance, fileobject: ConstPtr, buffer: ConstPtr, length: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSetQuotaInformationFile")

public actual fun fltSetSecurityObject(instance: PfltInstance, fileobject: ConstPtr, securityinformation: UInt, securitydescriptor: PsecurityDescriptor): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSetSecurityObject")

public actual fun fltSetStreamContext(instance: PfltInstance, fileobject: ConstPtr, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSetStreamContext")

public actual fun fltSetStreamHandleContext(instance: PfltInstance, fileobject: ConstPtr, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSetStreamHandleContext")

public actual fun fltSetTransactionContext(instance: PfltInstance, transaction: ConstPtr, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSetTransactionContext")

public actual fun fltSetVolumeContext(volume: PfltVolume, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSetVolumeContext")

public actual fun fltSetVolumeInformation(instance: PfltInstance, iosb: MutPtr, fsinformation: MutPtr, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSetVolumeInformation")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemMinifiltersFltStartFiltering")
private external fun wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltStartFiltering(filter: Long): Int

public actual fun fltStartFiltering(filter: PfltFilter): Ntstatus =
    wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltStartFiltering(filter)

public actual fun fltSupportsFileContexts(fileobject: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsFileContexts")

public actual fun fltSupportsFileContextsEx(fileobject: ConstPtr, instance: PfltInstance): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsFileContextsEx")

public actual fun fltSupportsStreamContexts(fileobject: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsStreamContexts")

public actual fun fltSupportsStreamHandleContexts(fileobject: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsStreamHandleContexts")

public actual fun fltTagFile(initiatinginstance: PfltInstance, fileobject: ConstPtr, filetag: UInt, guid: ConstPtr, databuffer: ConstPtr, databufferlength: UShort): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltTagFile")

public actual fun fltTagFileEx(initiatinginstance: PfltInstance, fileobject: ConstPtr, filetag: UInt, guid: ConstPtr, databuffer: ConstPtr, databufferlength: UShort, existingfiletag: UInt, existingguid: ConstPtr, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltTagFileEx")

public actual fun fltUninitializeFileLock(filelock: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltUninitializeFileLock")

public actual fun fltUninitializeOplock(oplock: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltUninitializeOplock")

public actual fun fltUnloadFilter(filtername: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltUnloadFilter")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemMinifiltersFltUnregisterFilter")
private external fun wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltUnregisterFilter(filter: Long): Unit

public actual fun fltUnregisterFilter(filter: PfltFilter): Unit =
    wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltUnregisterFilter(filter)

public actual fun fltUntagFile(initiatinginstance: PfltInstance, fileobject: ConstPtr, filetag: UInt, guid: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltUntagFile")

public actual fun fltVetoBypassIo(callbackdata: ConstPtr, fltobjects: ConstPtr, operationstatus: Ntstatus, failurereason: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltVetoBypassIo")

public actual fun fltWriteFile(initiatinginstance: PfltInstance, fileobject: ConstPtr, byteoffset: ConstPtr, length: UInt, buffer: ConstPtr, flags: UInt, byteswritten: MutPtr, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltWriteFile")

public actual fun fltWriteFileEx(initiatinginstance: PfltInstance, fileobject: ConstPtr, byteoffset: ConstPtr, length: UInt, buffer: ConstPtr, flags: UInt, byteswritten: MutPtr, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: ConstPtr, key: ConstPtr, mdl: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltWriteFileEx")

public actual fun fltpTraceRedirectedFileIo(originatingfileobject: ConstPtr, childcallbackdata: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltpTraceRedirectedFileIo")
