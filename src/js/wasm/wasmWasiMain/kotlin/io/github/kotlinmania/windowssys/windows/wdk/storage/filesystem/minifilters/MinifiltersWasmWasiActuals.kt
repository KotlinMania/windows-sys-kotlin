@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun fltAcknowledgeEcp(filter: PfltFilter, ecpcontext: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltAcknowledgeEcp")

public actual fun fltAcquirePushLockExclusive(pushlock: MutPtr<ULong>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockExclusive")

public actual fun fltAcquirePushLockExclusiveEx(pushlock: MutPtr<ULong>, flags: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockExclusiveEx")

public actual fun fltAcquirePushLockShared(pushlock: MutPtr<ULong>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockShared")

public actual fun fltAcquirePushLockSharedEx(pushlock: MutPtr<ULong>, flags: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockSharedEx")

public actual fun fltAcquireResourceExclusive(resource: MutPtr<Eresource>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquireResourceExclusive")

public actual fun fltAcquireResourceShared(resource: MutPtr<Eresource>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquireResourceShared")

public actual fun fltAddOpenReparseEntry(filter: PfltFilter, data: ConstPtr<FltCallbackData>, openreparseentry: ConstPtr<OpenReparseListEntry>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltAddOpenReparseEntry")

public actual fun fltAdjustDeviceStackSizeForIoRedirection(sourceinstance: PfltInstance, targetinstance: PfltInstance, sourcedevicestacksizemodified: MutPtr<Boolean>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltAdjustDeviceStackSizeForIoRedirection")

public actual fun fltAllocateCallbackData(instance: PfltInstance, fileobject: ConstPtr<FileObject>, retnewcallbackdata: MutPtr<MutPtr<FltCallbackData>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateCallbackData")

public actual fun fltAllocateCallbackDataEx(instance: PfltInstance, fileobject: ConstPtr<FileObject>, flags: UInt, retnewcallbackdata: MutPtr<MutPtr<FltCallbackData>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateCallbackDataEx")

public actual fun fltAllocateContext(filter: PfltFilter, contexttype: UShort, contextsize: ULong, pooltype: PoolType, returnedcontext: MutPtr<PfltContext>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateContext")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateDeferredIoWorkItem")
private external fun wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateDeferredIoWorkItem(): Long

public actual fun fltAllocateDeferredIoWorkItem(): PfltDeferredIoWorkitem =
    wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateDeferredIoWorkItem()

public actual fun fltAllocateExtraCreateParameter(filter: PfltFilter, ecptype: ConstPtr<Guid>, sizeofcontext: UInt, flags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, pooltag: UInt, ecpcontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateExtraCreateParameter")

public actual fun fltAllocateExtraCreateParameterFromLookasideList(filter: PfltFilter, ecptype: ConstPtr<Guid>, sizeofcontext: UInt, flags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, lookasidelist: MutPtr<CVoid>, ecpcontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateExtraCreateParameterFromLookasideList")

public actual fun fltAllocateExtraCreateParameterList(filter: PfltFilter, flags: UInt, ecplist: MutPtr<MutPtr<EcpList>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateExtraCreateParameterList")

public actual fun fltAllocateFileLock(completelockcallbackdataroutine: PfltCompleteLockCallbackDataRoutine, unlockroutine: PunlockRoutine): MutPtr<FileLock> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateFileLock")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateGenericWorkItem")
private external fun wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateGenericWorkItem(): Long

public actual fun fltAllocateGenericWorkItem(): PfltGenericWorkitem =
    wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateGenericWorkItem()

public actual fun fltAllocatePoolAlignedWithTag(instance: PfltInstance, pooltype: PoolType, numberofbytes: ULong, tag: UInt): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocatePoolAlignedWithTag")

public actual fun fltApplyPriorityInfoThread(inputpriorityinfo: ConstPtr<IoPriorityInfo>, outputpriorityinfo: MutPtr<IoPriorityInfo>, thread: Pethread): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltApplyPriorityInfoThread")

public actual fun fltAttachVolume(filter: PfltFilter, volume: PfltVolume, instancename: ConstPtr<UnicodeString>, retinstance: MutPtr<PfltInstance>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltAttachVolume")

public actual fun fltAttachVolumeAtAltitude(filter: PfltFilter, volume: PfltVolume, altitude: ConstPtr<UnicodeString>, instancename: ConstPtr<UnicodeString>, retinstance: MutPtr<PfltInstance>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltAttachVolumeAtAltitude")

public actual fun fltBuildDefaultSecurityDescriptor(securitydescriptor: MutPtr<PsecurityDescriptor>, desiredaccess: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltBuildDefaultSecurityDescriptor")

public actual fun fltCancelFileOpen(instance: PfltInstance, fileobject: ConstPtr<FileObject>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCancelFileOpen")

public actual fun fltCancelIo(callbackdata: ConstPtr<FltCallbackData>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCancelIo")

public actual fun fltCancellableWaitForMultipleObjects(count: UInt, objectarray: ConstPtr<ConstPtr<CVoid>>, waittype: WaitType, timeout: ConstPtr<Long>, waitblockarray: ConstPtr<KwaitBlock>, callbackdata: ConstPtr<FltCallbackData>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCancellableWaitForMultipleObjects")

public actual fun fltCancellableWaitForSingleObject(obj: ConstPtr<CVoid>, timeout: ConstPtr<Long>, callbackdata: ConstPtr<FltCallbackData>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCancellableWaitForSingleObject")

public actual fun fltCbdqDisable(cbdq: MutPtr<FltCallbackDataQueue>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqDisable")

public actual fun fltCbdqEnable(cbdq: MutPtr<FltCallbackDataQueue>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqEnable")

public actual fun fltCbdqInitialize(instance: PfltInstance, cbdq: MutPtr<FltCallbackDataQueue>, cbdqinsertio: PfltCallbackDataQueueInsertIo, cbdqremoveio: PfltCallbackDataQueueRemoveIo, cbdqpeeknextio: PfltCallbackDataQueuePeekNextIo, cbdqacquire: PfltCallbackDataQueueAcquire, cbdqrelease: PfltCallbackDataQueueRelease, cbdqcompletecanceledio: PfltCallbackDataQueueCompleteCanceledIo): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqInitialize")

public actual fun fltCbdqInsertIo(cbdq: MutPtr<FltCallbackDataQueue>, cbd: ConstPtr<FltCallbackData>, context: ConstPtr<IoCsqIrpContext>, insertcontext: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqInsertIo")

public actual fun fltCbdqRemoveIo(cbdq: MutPtr<FltCallbackDataQueue>, context: ConstPtr<IoCsqIrpContext>): MutPtr<FltCallbackData> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqRemoveIo")

public actual fun fltCbdqRemoveNextIo(cbdq: MutPtr<FltCallbackDataQueue>, peekcontext: ConstPtr<CVoid>): MutPtr<FltCallbackData> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqRemoveNextIo")

public actual fun fltCheckAndGrowNameControl(namectrl: MutPtr<FltNameControl>, newsize: UShort): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckAndGrowNameControl")

public actual fun fltCheckLockForReadAccess(filelock: ConstPtr<FileLock>, callbackdata: ConstPtr<FltCallbackData>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckLockForReadAccess")

public actual fun fltCheckLockForWriteAccess(filelock: ConstPtr<FileLock>, callbackdata: ConstPtr<FltCallbackData>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckLockForWriteAccess")

public actual fun fltCheckOplock(oplock: ConstPtr<ConstPtr<CVoid>>, callbackdata: ConstPtr<FltCallbackData>, context: ConstPtr<CVoid>, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckOplock")

public actual fun fltCheckOplockEx(oplock: ConstPtr<ConstPtr<CVoid>>, callbackdata: ConstPtr<FltCallbackData>, flags: UInt, context: ConstPtr<CVoid>, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckOplockEx")

public actual fun fltClearCallbackDataDirty(data: MutPtr<FltCallbackData>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltClearCallbackDataDirty")

public actual fun fltClearCancelCompletion(callbackdata: ConstPtr<FltCallbackData>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltClearCancelCompletion")

public actual fun fltClose(filehandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltClose")

public actual fun fltCloseClientPort(filter: PfltFilter, clientport: MutPtr<PfltPort>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCloseClientPort")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemMinifiltersFltCloseCommunicationPort")
private external fun wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltCloseCommunicationPort(serverport: Long): Unit

public actual fun fltCloseCommunicationPort(serverport: PfltPort): Unit =
    wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltCloseCommunicationPort(serverport)

public actual fun fltCloseSectionForDataScan(sectioncontext: PfltContext): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCloseSectionForDataScan")

public actual fun fltCommitComplete(instance: PfltInstance, transaction: ConstPtr<Ktransaction>, transactioncontext: PfltContext): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCommitComplete")

public actual fun fltCommitFinalizeComplete(instance: PfltInstance, transaction: ConstPtr<Ktransaction>, transactioncontext: PfltContext): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCommitFinalizeComplete")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemMinifiltersFltCompareInstanceAltitudes")
private external fun wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltCompareInstanceAltitudes(instance1: Long, instance2: Long): Int

public actual fun fltCompareInstanceAltitudes(instance1: PfltInstance, instance2: PfltInstance): Int =
    wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltCompareInstanceAltitudes(instance1, instance2)

public actual fun fltCompletePendedPostOperation(callbackdata: ConstPtr<FltCallbackData>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCompletePendedPostOperation")

public actual fun fltCompletePendedPreOperation(callbackdata: ConstPtr<FltCallbackData>, callbackstatus: FltPreopCallbackStatus, context: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCompletePendedPreOperation")

public actual fun fltCopyOpenReparseList(filter: PfltFilter, data: ConstPtr<FltCallbackData>, ecplist: MutPtr<EcpList>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCopyOpenReparseList")

public actual fun fltCreateCommunicationPort(filter: PfltFilter, serverport: MutPtr<PfltPort>, objectattributes: ConstPtr<ObjectAttributes>, serverportcookie: ConstPtr<CVoid>, connectnotifycallback: PfltConnectNotify, disconnectnotifycallback: PfltDisconnectNotify, messagenotifycallback: PfltMessageNotify, maxconnections: Int): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateCommunicationPort")

public actual fun fltCreateFile(filter: PfltFilter, instance: PfltInstance, filehandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, allocationsize: ConstPtr<Long>, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: ConstPtr<CVoid>, ealength: UInt, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateFile")

public actual fun fltCreateFileEx(filter: PfltFilter, instance: PfltInstance, filehandle: MutPtr<Handle>, fileobject: MutPtr<MutPtr<FileObject>>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, allocationsize: ConstPtr<Long>, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: ConstPtr<CVoid>, ealength: UInt, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateFileEx")

public actual fun fltCreateFileEx2(filter: PfltFilter, instance: PfltInstance, filehandle: MutPtr<Handle>, fileobject: MutPtr<MutPtr<FileObject>>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, allocationsize: ConstPtr<Long>, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: ConstPtr<CVoid>, ealength: UInt, flags: UInt, drivercontext: ConstPtr<IoDriverCreateContext>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateFileEx2")

public actual fun fltCreateMailslotFile(filter: PfltFilter, instance: PfltInstance, filehandle: MutPtr<Handle>, fileobject: MutPtr<MutPtr<FileObject>>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, createoptions: UInt, mailslotquota: UInt, maximummessagesize: UInt, readtimeout: ConstPtr<Long>, drivercontext: ConstPtr<IoDriverCreateContext>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateMailslotFile")

public actual fun fltCreateNamedPipeFile(filter: PfltFilter, instance: PfltInstance, filehandle: MutPtr<Handle>, fileobject: MutPtr<MutPtr<FileObject>>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, namedpipetype: UInt, readmode: UInt, completionmode: UInt, maximuminstances: UInt, inboundquota: UInt, outboundquota: UInt, defaulttimeout: ConstPtr<Long>, drivercontext: ConstPtr<IoDriverCreateContext>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateNamedPipeFile")

public actual fun fltCreateSectionForDataScan(instance: PfltInstance, fileobject: ConstPtr<FileObject>, sectioncontext: PfltContext, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, maximumsize: ConstPtr<Long>, sectionpageprotection: UInt, allocationattributes: UInt, flags: UInt, sectionhandle: MutPtr<Handle>, sectionobject: MutPtr<MutPtr<CVoid>>, sectionfilesize: MutPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateSectionForDataScan")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateSystemVolumeInformationFolder")
private external fun wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltCreateSystemVolumeInformationFolder(instance: Long): Int

public actual fun fltCreateSystemVolumeInformationFolder(instance: PfltInstance): Ntstatus =
    wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltCreateSystemVolumeInformationFolder(instance)

public actual fun fltCurrentBatchOplock(oplock: ConstPtr<ConstPtr<CVoid>>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCurrentBatchOplock")

public actual fun fltCurrentOplock(oplock: ConstPtr<ConstPtr<CVoid>>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCurrentOplock")

public actual fun fltCurrentOplockH(oplock: ConstPtr<ConstPtr<CVoid>>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltCurrentOplockH")

public actual fun fltDecodeParameters(callbackdata: ConstPtr<FltCallbackData>, mdladdresspointer: MutPtr<MutPtr<MutPtr<Mdl>>>, buffer: MutPtr<MutPtr<MutPtr<CVoid>>>, length: MutPtr<MutPtr<UInt>>, desiredaccess: MutPtr<LockOperation>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltDecodeParameters")

public actual fun fltDeleteContext(context: PfltContext): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteContext")

public actual fun fltDeleteExtraCreateParameterLookasideList(filter: PfltFilter, lookaside: MutPtr<CVoid>, flags: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteExtraCreateParameterLookasideList")

public actual fun fltDeleteFileContext(instance: PfltInstance, fileobject: ConstPtr<FileObject>, oldcontext: MutPtr<PfltContext>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteFileContext")

public actual fun fltDeleteInstanceContext(instance: PfltInstance, oldcontext: MutPtr<PfltContext>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteInstanceContext")

public actual fun fltDeletePushLock(pushlock: ConstPtr<ULong>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltDeletePushLock")

public actual fun fltDeleteStreamContext(instance: PfltInstance, fileobject: ConstPtr<FileObject>, oldcontext: MutPtr<PfltContext>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteStreamContext")

public actual fun fltDeleteStreamHandleContext(instance: PfltInstance, fileobject: ConstPtr<FileObject>, oldcontext: MutPtr<PfltContext>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteStreamHandleContext")

public actual fun fltDeleteTransactionContext(instance: PfltInstance, transaction: ConstPtr<Ktransaction>, oldcontext: MutPtr<PfltContext>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteTransactionContext")

public actual fun fltDeleteVolumeContext(filter: PfltFilter, volume: PfltVolume, oldcontext: MutPtr<PfltContext>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteVolumeContext")

public actual fun fltDetachVolume(filter: PfltFilter, volume: PfltVolume, instancename: ConstPtr<UnicodeString>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltDetachVolume")

public actual fun fltDeviceIoControlFile(instance: PfltInstance, fileobject: ConstPtr<FileObject>, iocontrolcode: UInt, inputbuffer: ConstPtr<CVoid>, inputbufferlength: UInt, outputbuffer: MutPtr<CVoid>, outputbufferlength: UInt, lengthreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltDeviceIoControlFile")

public actual fun fltDoCompletionProcessingWhenSafe(data: ConstPtr<FltCallbackData>, fltobjects: ConstPtr<FltRelatedObjects>, completioncontext: ConstPtr<CVoid>, flags: UInt, safepostcallback: PfltPostOperationCallback, retpostoperationstatus: MutPtr<FltPostopCallbackStatus>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltDoCompletionProcessingWhenSafe")

public actual fun fltEnlistInTransaction(instance: PfltInstance, transaction: ConstPtr<Ktransaction>, transactioncontext: PfltContext, notificationmask: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltEnlistInTransaction")

public actual fun fltEnumerateFilterInformation(index: UInt, informationclass: FilterInformationClass, buffer: MutPtr<CVoid>, buffersize: UInt, bytesreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateFilterInformation")

public actual fun fltEnumerateFilters(filterlist: MutPtr<PfltFilter>, filterlistsize: UInt, numberfiltersreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateFilters")

public actual fun fltEnumerateInstanceInformationByDeviceObject(deviceobject: ConstPtr<DeviceObject>, index: UInt, informationclass: InstanceInformationClass, buffer: MutPtr<CVoid>, buffersize: UInt, bytesreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByDeviceObject")

public actual fun fltEnumerateInstanceInformationByFilter(filter: PfltFilter, index: UInt, informationclass: InstanceInformationClass, buffer: MutPtr<CVoid>, buffersize: UInt, bytesreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByFilter")

public actual fun fltEnumerateInstanceInformationByVolume(volume: PfltVolume, index: UInt, informationclass: InstanceInformationClass, buffer: MutPtr<CVoid>, buffersize: UInt, bytesreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByVolume")

public actual fun fltEnumerateInstanceInformationByVolumeName(volumename: ConstPtr<UnicodeString>, index: UInt, informationclass: InstanceInformationClass, buffer: MutPtr<CVoid>, buffersize: UInt, bytesreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByVolumeName")

public actual fun fltEnumerateInstances(volume: PfltVolume, filter: PfltFilter, instancelist: MutPtr<PfltInstance>, instancelistsize: UInt, numberinstancesreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstances")

public actual fun fltEnumerateVolumeInformation(filter: PfltFilter, index: UInt, informationclass: FilterVolumeInformationClass, buffer: MutPtr<CVoid>, buffersize: UInt, bytesreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateVolumeInformation")

public actual fun fltEnumerateVolumes(filter: PfltFilter, volumelist: MutPtr<PfltVolume>, volumelistsize: UInt, numbervolumesreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateVolumes")

public actual fun fltFastIoMdlRead(initiatinginstance: PfltInstance, fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, lockkey: UInt, mdlchain: MutPtr<MutPtr<Mdl>>, iostatus: MutPtr<IoStatusBlock>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoMdlRead")

public actual fun fltFastIoMdlReadComplete(initiatinginstance: PfltInstance, fileobject: ConstPtr<FileObject>, mdlchain: ConstPtr<Mdl>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoMdlReadComplete")

public actual fun fltFastIoMdlWriteComplete(initiatinginstance: PfltInstance, fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, mdlchain: ConstPtr<Mdl>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoMdlWriteComplete")

public actual fun fltFastIoPrepareMdlWrite(initiatinginstance: PfltInstance, fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, lockkey: UInt, mdlchain: MutPtr<MutPtr<Mdl>>, iostatus: MutPtr<IoStatusBlock>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoPrepareMdlWrite")

public actual fun fltFindExtraCreateParameter(filter: PfltFilter, ecplist: ConstPtr<EcpList>, ecptype: ConstPtr<Guid>, ecpcontext: MutPtr<MutPtr<CVoid>>, ecpcontextsize: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltFindExtraCreateParameter")

public actual fun fltFlushBuffers(instance: PfltInstance, fileobject: ConstPtr<FileObject>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltFlushBuffers")

public actual fun fltFlushBuffers2(instance: PfltInstance, fileobject: ConstPtr<FileObject>, flushtype: UInt, callbackdata: ConstPtr<FltCallbackData>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltFlushBuffers2")

public actual fun fltFreeCallbackData(callbackdata: ConstPtr<FltCallbackData>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeCallbackData")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeDeferredIoWorkItem")
private external fun wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltFreeDeferredIoWorkItem(fltworkitem: Long): Unit

public actual fun fltFreeDeferredIoWorkItem(fltworkitem: PfltDeferredIoWorkitem): Unit =
    wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltFreeDeferredIoWorkItem(fltworkitem)

public actual fun fltFreeExtraCreateParameter(filter: PfltFilter, ecpcontext: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeExtraCreateParameter")

public actual fun fltFreeExtraCreateParameterList(filter: PfltFilter, ecplist: ConstPtr<EcpList>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeExtraCreateParameterList")

public actual fun fltFreeFileLock(filelock: ConstPtr<FileLock>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeFileLock")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeGenericWorkItem")
private external fun wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltFreeGenericWorkItem(fltworkitem: Long): Unit

public actual fun fltFreeGenericWorkItem(fltworkitem: PfltGenericWorkitem): Unit =
    wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltFreeGenericWorkItem(fltworkitem)

public actual fun fltFreeOpenReparseList(filter: PfltFilter, ecplist: ConstPtr<EcpList>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeOpenReparseList")

public actual fun fltFreePoolAlignedWithTag(instance: PfltInstance, buffer: ConstPtr<CVoid>, tag: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltFreePoolAlignedWithTag")

public actual fun fltFreeSecurityDescriptor(securitydescriptor: PsecurityDescriptor): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeSecurityDescriptor")

public actual fun fltFsControlFile(instance: PfltInstance, fileobject: ConstPtr<FileObject>, fscontrolcode: UInt, inputbuffer: ConstPtr<CVoid>, inputbufferlength: UInt, outputbuffer: MutPtr<CVoid>, outputbufferlength: UInt, lengthreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltFsControlFile")

public actual fun fltGetActivityIdCallbackData(callbackdata: ConstPtr<FltCallbackData>, guid: MutPtr<Guid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetActivityIdCallbackData")

public actual fun fltGetBottomInstance(volume: PfltVolume, instance: MutPtr<PfltInstance>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetBottomInstance")

public actual fun fltGetContexts(fltobjects: ConstPtr<FltRelatedObjects>, desiredcontexts: UShort, contexts: MutPtr<FltRelatedContexts>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetContexts")

public actual fun fltGetContextsEx(fltobjects: ConstPtr<FltRelatedObjects>, desiredcontexts: UShort, contextssize: ULong, contexts: MutPtr<FltRelatedContextsEx>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetContextsEx")

public actual fun fltGetDestinationFileNameInformation(instance: PfltInstance, fileobject: ConstPtr<FileObject>, rootdirectory: Handle, filename: Pcwstr, filenamelength: UInt, nameoptions: UInt, retfilenameinformation: MutPtr<MutPtr<FltFileNameInformation>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetDestinationFileNameInformation")

public actual fun fltGetDeviceObject(volume: PfltVolume, deviceobject: MutPtr<MutPtr<DeviceObject>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetDeviceObject")

public actual fun fltGetDiskDeviceObject(volume: PfltVolume, diskdeviceobject: MutPtr<MutPtr<DeviceObject>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetDiskDeviceObject")

public actual fun fltGetEcpListFromCallbackData(filter: PfltFilter, callbackdata: ConstPtr<FltCallbackData>, ecplist: MutPtr<MutPtr<EcpList>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetEcpListFromCallbackData")

public actual fun fltGetFileContext(instance: PfltInstance, fileobject: ConstPtr<FileObject>, context: MutPtr<PfltContext>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileContext")

public actual fun fltGetFileNameInformation(callbackdata: ConstPtr<FltCallbackData>, nameoptions: UInt, filenameinformation: MutPtr<MutPtr<FltFileNameInformation>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileNameInformation")

public actual fun fltGetFileNameInformationUnsafe(fileobject: ConstPtr<FileObject>, instance: PfltInstance, nameoptions: UInt, filenameinformation: MutPtr<MutPtr<FltFileNameInformation>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileNameInformationUnsafe")

public actual fun fltGetFileSystemType(fltobject: ConstPtr<CVoid>, filesystemtype: MutPtr<FltFilesystemType>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileSystemType")

public actual fun fltGetFilterFromInstance(instance: PfltInstance, retfilter: MutPtr<PfltFilter>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFilterFromInstance")

public actual fun fltGetFilterFromName(filtername: ConstPtr<UnicodeString>, retfilter: MutPtr<PfltFilter>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFilterFromName")

public actual fun fltGetFilterInformation(filter: PfltFilter, informationclass: FilterInformationClass, buffer: MutPtr<CVoid>, buffersize: UInt, bytesreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFilterInformation")

public actual fun fltGetFsZeroingOffset(data: ConstPtr<FltCallbackData>, zeroingoffset: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFsZeroingOffset")

public actual fun fltGetInstanceContext(instance: PfltInstance, context: MutPtr<PfltContext>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetInstanceContext")

public actual fun fltGetInstanceInformation(instance: PfltInstance, informationclass: InstanceInformationClass, buffer: MutPtr<CVoid>, buffersize: UInt, bytesreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetInstanceInformation")

public actual fun fltGetIoAttributionHandleFromCallbackData(data: ConstPtr<FltCallbackData>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoAttributionHandleFromCallbackData")

public actual fun fltGetIoPriorityHint(data: ConstPtr<FltCallbackData>): IoPriorityHint =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHint")

public actual fun fltGetIoPriorityHintFromCallbackData(data: ConstPtr<FltCallbackData>): IoPriorityHint =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHintFromCallbackData")

public actual fun fltGetIoPriorityHintFromFileObject(fileobject: ConstPtr<FileObject>): IoPriorityHint =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHintFromFileObject")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHintFromThread")
private external fun wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHintFromThread(thread: Long): Int

public actual fun fltGetIoPriorityHintFromThread(thread: Pethread): IoPriorityHint =
    wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHintFromThread(thread)

public actual fun fltGetIrpName(irpmajorcode: UByte): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIrpName")

public actual fun fltGetLowerInstance(currentinstance: PfltInstance, lowerinstance: MutPtr<PfltInstance>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetLowerInstance")

public actual fun fltGetNewSystemBufferAddress(callbackdata: ConstPtr<FltCallbackData>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetNewSystemBufferAddress")

public actual fun fltGetNextExtraCreateParameter(filter: PfltFilter, ecplist: ConstPtr<EcpList>, currentecpcontext: ConstPtr<CVoid>, nextecptype: MutPtr<Guid>, nextecpcontext: MutPtr<MutPtr<CVoid>>, nextecpcontextsize: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetNextExtraCreateParameter")

public actual fun fltGetRequestorProcess(callbackdata: ConstPtr<FltCallbackData>): Peprocess =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorProcess")

public actual fun fltGetRequestorProcessId(callbackdata: ConstPtr<FltCallbackData>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorProcessId")

public actual fun fltGetRequestorProcessIdEx(callbackdata: ConstPtr<FltCallbackData>): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorProcessIdEx")

public actual fun fltGetRequestorSessionId(callbackdata: ConstPtr<FltCallbackData>, sessionid: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorSessionId")

public actual fun fltGetRoutineAddress(fltmgrroutinename: Pcstr): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRoutineAddress")

public actual fun fltGetSectionContext(instance: PfltInstance, fileobject: ConstPtr<FileObject>, context: MutPtr<PfltContext>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetSectionContext")

public actual fun fltGetStreamContext(instance: PfltInstance, fileobject: ConstPtr<FileObject>, context: MutPtr<PfltContext>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetStreamContext")

public actual fun fltGetStreamHandleContext(instance: PfltInstance, fileobject: ConstPtr<FileObject>, context: MutPtr<PfltContext>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetStreamHandleContext")

public actual fun fltGetSwappedBufferMdlAddress(callbackdata: ConstPtr<FltCallbackData>): MutPtr<Mdl> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetSwappedBufferMdlAddress")

public actual fun fltGetTopInstance(volume: PfltVolume, instance: MutPtr<PfltInstance>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetTopInstance")

public actual fun fltGetTransactionContext(instance: PfltInstance, transaction: ConstPtr<Ktransaction>, context: MutPtr<PfltContext>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetTransactionContext")

public actual fun fltGetTunneledName(callbackdata: ConstPtr<FltCallbackData>, filenameinformation: ConstPtr<FltFileNameInformation>, rettunneledfilenameinformation: MutPtr<MutPtr<FltFileNameInformation>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetTunneledName")

public actual fun fltGetUpperInstance(currentinstance: PfltInstance, upperinstance: MutPtr<PfltInstance>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetUpperInstance")

public actual fun fltGetVolumeContext(filter: PfltFilter, volume: PfltVolume, context: MutPtr<PfltContext>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeContext")

public actual fun fltGetVolumeFromDeviceObject(filter: PfltFilter, deviceobject: ConstPtr<DeviceObject>, retvolume: MutPtr<PfltVolume>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromDeviceObject")

public actual fun fltGetVolumeFromFileObject(filter: PfltFilter, fileobject: ConstPtr<FileObject>, retvolume: MutPtr<PfltVolume>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromFileObject")

public actual fun fltGetVolumeFromInstance(instance: PfltInstance, retvolume: MutPtr<PfltVolume>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromInstance")

public actual fun fltGetVolumeFromName(filter: PfltFilter, volumename: ConstPtr<UnicodeString>, retvolume: MutPtr<PfltVolume>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromName")

public actual fun fltGetVolumeGuidName(volume: PfltVolume, volumeguidname: MutPtr<UnicodeString>, buffersizeneeded: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeGuidName")

public actual fun fltGetVolumeInformation(volume: PfltVolume, informationclass: FilterVolumeInformationClass, buffer: MutPtr<CVoid>, buffersize: UInt, bytesreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeInformation")

public actual fun fltGetVolumeInstanceFromName(filter: PfltFilter, volume: PfltVolume, instancename: ConstPtr<UnicodeString>, retinstance: MutPtr<PfltInstance>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeInstanceFromName")

public actual fun fltGetVolumeName(volume: PfltVolume, volumename: MutPtr<UnicodeString>, buffersizeneeded: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeName")

public actual fun fltGetVolumeProperties(volume: PfltVolume, volumeproperties: MutPtr<FltVolumeProperties>, volumepropertieslength: UInt, lengthreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeProperties")

public actual fun fltInitExtraCreateParameterLookasideList(filter: PfltFilter, lookaside: MutPtr<CVoid>, flags: UInt, size: ULong, tag: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltInitExtraCreateParameterLookasideList")

public actual fun fltInitializeFileLock(filelock: MutPtr<FileLock>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltInitializeFileLock")

public actual fun fltInitializeOplock(oplock: MutPtr<MutPtr<CVoid>>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltInitializeOplock")

public actual fun fltInitializePushLock(pushlock: MutPtr<ULong>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltInitializePushLock")

public actual fun fltInsertExtraCreateParameter(filter: PfltFilter, ecplist: MutPtr<EcpList>, ecpcontext: MutPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltInsertExtraCreateParameter")

public actual fun fltIs32bitProcess(callbackdata: ConstPtr<FltCallbackData>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltIs32bitProcess")

public actual fun fltIsCallbackDataDirty(data: ConstPtr<FltCallbackData>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltIsCallbackDataDirty")

public actual fun fltIsDirectory(fileobject: ConstPtr<FileObject>, instance: PfltInstance, isdirectory: MutPtr<Boolean>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltIsDirectory")

public actual fun fltIsEcpAcknowledged(filter: PfltFilter, ecpcontext: ConstPtr<CVoid>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltIsEcpAcknowledged")

public actual fun fltIsEcpFromUserMode(filter: PfltFilter, ecpcontext: ConstPtr<CVoid>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltIsEcpFromUserMode")

public actual fun fltIsFltMgrVolumeDeviceObject(deviceobject: ConstPtr<DeviceObject>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltIsFltMgrVolumeDeviceObject")

public actual fun fltIsIoCanceled(callbackdata: ConstPtr<FltCallbackData>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltIsIoCanceled")

public actual fun fltIsIoRedirectionAllowed(sourceinstance: PfltInstance, targetinstance: PfltInstance, redirectionallowed: MutPtr<Boolean>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltIsIoRedirectionAllowed")

public actual fun fltIsIoRedirectionAllowedForOperation(data: ConstPtr<FltCallbackData>, targetinstance: PfltInstance, redirectionallowedthisio: MutPtr<Boolean>, redirectionallowedallio: MutPtr<Boolean>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltIsIoRedirectionAllowedForOperation")

public actual fun fltIsOperationSynchronous(callbackdata: ConstPtr<FltCallbackData>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltIsOperationSynchronous")

public actual fun fltIsVolumeSnapshot(fltobject: ConstPtr<CVoid>, issnapshotvolume: MutPtr<Boolean>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltIsVolumeSnapshot")

public actual fun fltIsVolumeWritable(fltobject: ConstPtr<CVoid>, iswritable: MutPtr<Boolean>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltIsVolumeWritable")

public actual fun fltLoadFilter(filtername: ConstPtr<UnicodeString>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltLoadFilter")

public actual fun fltLockUserBuffer(callbackdata: ConstPtr<FltCallbackData>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltLockUserBuffer")

public actual fun fltNotifyFilterChangeDirectory(notifysync: PnotifySync, notifylist: MutPtr<ListEntry>, fscontext: ConstPtr<CVoid>, fulldirectoryname: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifycallbackdata: ConstPtr<FltCallbackData>, traversecallback: PcheckForTraverseAccess, subjectcontext: ConstPtr<SecuritySubjectContext>, filtercallback: PfilterReportChange): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltNotifyFilterChangeDirectory")

public actual fun fltObjectDereference(fltobject: MutPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltObjectDereference")

public actual fun fltObjectReference(fltobject: MutPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltObjectReference")

public actual fun fltOpenVolume(instance: PfltInstance, volumehandle: MutPtr<Handle>, volumefileobject: MutPtr<MutPtr<FileObject>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltOpenVolume")

public actual fun fltOplockBreakH(oplock: ConstPtr<ConstPtr<CVoid>>, callbackdata: ConstPtr<FltCallbackData>, flags: UInt, context: ConstPtr<CVoid>, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockBreakH")

public actual fun fltOplockBreakToNone(oplock: ConstPtr<ConstPtr<CVoid>>, callbackdata: ConstPtr<FltCallbackData>, context: ConstPtr<CVoid>, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockBreakToNone")

public actual fun fltOplockBreakToNoneEx(oplock: ConstPtr<ConstPtr<CVoid>>, callbackdata: ConstPtr<FltCallbackData>, flags: UInt, context: ConstPtr<CVoid>, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockBreakToNoneEx")

public actual fun fltOplockFsctrl(oplock: ConstPtr<ConstPtr<CVoid>>, callbackdata: ConstPtr<FltCallbackData>, opencount: UInt): FltPreopCallbackStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockFsctrl")

public actual fun fltOplockFsctrlEx(oplock: ConstPtr<ConstPtr<CVoid>>, callbackdata: ConstPtr<FltCallbackData>, opencount: UInt, flags: UInt): FltPreopCallbackStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockFsctrlEx")

public actual fun fltOplockIsFastIoPossible(oplock: ConstPtr<ConstPtr<CVoid>>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockIsFastIoPossible")

public actual fun fltOplockIsSharedRequest(callbackdata: ConstPtr<FltCallbackData>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockIsSharedRequest")

public actual fun fltOplockKeysEqual(fo1: ConstPtr<FileObject>, fo2: ConstPtr<FileObject>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockKeysEqual")

public actual fun fltParseFileName(filename: ConstPtr<UnicodeString>, extension: MutPtr<UnicodeString>, stream: MutPtr<UnicodeString>, finalcomponent: MutPtr<UnicodeString>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltParseFileName")

public actual fun fltParseFileNameInformation(filenameinformation: MutPtr<FltFileNameInformation>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltParseFileNameInformation")

public actual fun fltPerformAsynchronousIo(callbackdata: MutPtr<FltCallbackData>, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltPerformAsynchronousIo")

public actual fun fltPerformSynchronousIo(callbackdata: MutPtr<FltCallbackData>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltPerformSynchronousIo")

public actual fun fltPrePrepareComplete(instance: PfltInstance, transaction: ConstPtr<Ktransaction>, transactioncontext: PfltContext): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltPrePrepareComplete")

public actual fun fltPrepareComplete(instance: PfltInstance, transaction: ConstPtr<Ktransaction>, transactioncontext: PfltContext): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltPrepareComplete")

public actual fun fltPrepareToReuseEcp(filter: PfltFilter, ecpcontext: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltPrepareToReuseEcp")

public actual fun fltProcessFileLock(filelock: ConstPtr<FileLock>, callbackdata: ConstPtr<FltCallbackData>, context: ConstPtr<CVoid>): FltPreopCallbackStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltProcessFileLock")

public actual fun fltPropagateActivityIdToThread(callbackdata: ConstPtr<FltCallbackData>, propagateid: MutPtr<Guid>, originalid: MutPtr<MutPtr<Guid>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltPropagateActivityIdToThread")

public actual fun fltPropagateIrpExtension(sourcedata: ConstPtr<FltCallbackData>, targetdata: MutPtr<FltCallbackData>, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltPropagateIrpExtension")

public actual fun fltPurgeFileNameInformationCache(instance: PfltInstance, fileobject: ConstPtr<FileObject>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltPurgeFileNameInformationCache")

public actual fun fltQueryDirectoryFile(instance: PfltInstance, fileobject: ConstPtr<FileObject>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass, returnsingleentry: Boolean, filename: ConstPtr<UnicodeString>, restartscan: Boolean, lengthreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryDirectoryFile")

public actual fun fltQueryDirectoryFileEx(instance: PfltInstance, fileobject: ConstPtr<FileObject>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass, queryflags: UInt, filename: ConstPtr<UnicodeString>, lengthreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryDirectoryFileEx")

public actual fun fltQueryEaFile(instance: PfltInstance, fileobject: ConstPtr<FileObject>, returnedeadata: MutPtr<CVoid>, length: UInt, returnsingleentry: Boolean, ealist: ConstPtr<CVoid>, ealistlength: UInt, eaindex: ConstPtr<UInt>, restartscan: Boolean, lengthreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryEaFile")

public actual fun fltQueryInformationByName(filter: PfltFilter, instance: PfltInstance, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass, drivercontext: ConstPtr<IoDriverCreateContext>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryInformationByName")

public actual fun fltQueryInformationFile(instance: PfltInstance, fileobject: ConstPtr<FileObject>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass, lengthreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryInformationFile")

public actual fun fltQueryQuotaInformationFile(instance: PfltInstance, fileobject: ConstPtr<FileObject>, iostatusblock: MutPtr<IoStatusBlock>, buffer: MutPtr<CVoid>, length: UInt, returnsingleentry: Boolean, sidlist: ConstPtr<CVoid>, sidlistlength: UInt, startsid: ConstPtr<UInt>, restartscan: Boolean, lengthreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryQuotaInformationFile")

public actual fun fltQuerySecurityObject(instance: PfltInstance, fileobject: ConstPtr<FileObject>, securityinformation: UInt, securitydescriptor: PsecurityDescriptor, length: UInt, lengthneeded: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltQuerySecurityObject")

public actual fun fltQueryVolumeInformation(instance: PfltInstance, iosb: MutPtr<IoStatusBlock>, fsinformation: MutPtr<CVoid>, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryVolumeInformation")

public actual fun fltQueryVolumeInformationFile(instance: PfltInstance, fileobject: ConstPtr<FileObject>, fsinformation: MutPtr<CVoid>, length: UInt, fsinformationclass: FsInformationClass, lengthreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryVolumeInformationFile")

public actual fun fltQueueDeferredIoWorkItem(fltworkitem: PfltDeferredIoWorkitem, data: ConstPtr<FltCallbackData>, workerroutine: PfltDeferredIoWorkitemRoutine, queuetype: WorkQueueType, context: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltQueueDeferredIoWorkItem")

public actual fun fltQueueGenericWorkItem(fltworkitem: PfltGenericWorkitem, fltobject: ConstPtr<CVoid>, workerroutine: PfltGenericWorkitemRoutine, queuetype: WorkQueueType, context: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltQueueGenericWorkItem")

public actual fun fltReadFile(initiatinginstance: PfltInstance, fileobject: ConstPtr<FileObject>, byteoffset: ConstPtr<Long>, length: UInt, buffer: MutPtr<CVoid>, flags: UInt, bytesread: MutPtr<UInt>, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltReadFile")

public actual fun fltReadFileEx(initiatinginstance: PfltInstance, fileobject: ConstPtr<FileObject>, byteoffset: ConstPtr<Long>, length: UInt, buffer: MutPtr<CVoid>, flags: UInt, bytesread: MutPtr<UInt>, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: ConstPtr<CVoid>, key: ConstPtr<UInt>, mdl: ConstPtr<Mdl>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltReadFileEx")

public actual fun fltReferenceContext(context: PfltContext): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltReferenceContext")

public actual fun fltReferenceFileNameInformation(filenameinformation: ConstPtr<FltFileNameInformation>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltReferenceFileNameInformation")

public actual fun fltRegisterFilter(driver: ConstPtr<DriverObject>, registration: ConstPtr<FltRegistration>, retfilter: MutPtr<PfltFilter>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltRegisterFilter")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemMinifiltersFltRegisterForDataScan")
private external fun wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltRegisterForDataScan(instance: Long): Int

public actual fun fltRegisterForDataScan(instance: PfltInstance): Ntstatus =
    wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltRegisterForDataScan(instance)

public actual fun fltReissueSynchronousIo(initiatinginstance: PfltInstance, callbackdata: ConstPtr<FltCallbackData>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltReissueSynchronousIo")

public actual fun fltReleaseContext(context: PfltContext): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseContext")

public actual fun fltReleaseContexts(contexts: ConstPtr<FltRelatedContexts>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseContexts")

public actual fun fltReleaseContextsEx(contextssize: ULong, contexts: ConstPtr<FltRelatedContextsEx>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseContextsEx")

public actual fun fltReleaseFileNameInformation(filenameinformation: ConstPtr<FltFileNameInformation>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseFileNameInformation")

public actual fun fltReleasePushLock(pushlock: MutPtr<ULong>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltReleasePushLock")

public actual fun fltReleasePushLockEx(pushlock: MutPtr<ULong>, flags: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltReleasePushLockEx")

public actual fun fltReleaseResource(resource: MutPtr<Eresource>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseResource")

public actual fun fltRemoveExtraCreateParameter(filter: PfltFilter, ecplist: MutPtr<EcpList>, ecptype: ConstPtr<Guid>, ecpcontext: MutPtr<MutPtr<CVoid>>, ecpcontextsize: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltRemoveExtraCreateParameter")

public actual fun fltRemoveOpenReparseEntry(filter: PfltFilter, data: ConstPtr<FltCallbackData>, openreparseentry: ConstPtr<OpenReparseListEntry>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltRemoveOpenReparseEntry")

public actual fun fltRequestFileInfoOnCreateCompletion(filter: PfltFilter, data: ConstPtr<FltCallbackData>, infoclassflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltRequestFileInfoOnCreateCompletion")

public actual fun fltRequestOperationStatusCallback(data: ConstPtr<FltCallbackData>, callbackroutine: PfltGetOperationStatusCallback, requestercontext: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltRequestOperationStatusCallback")

public actual fun fltRetainSwappedBufferMdlAddress(callbackdata: ConstPtr<FltCallbackData>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltRetainSwappedBufferMdlAddress")

public actual fun fltRetrieveFileInfoOnCreateCompletion(filter: PfltFilter, data: ConstPtr<FltCallbackData>, infoclass: UInt, size: MutPtr<UInt>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltRetrieveFileInfoOnCreateCompletion")

public actual fun fltRetrieveFileInfoOnCreateCompletionEx(filter: PfltFilter, data: ConstPtr<FltCallbackData>, infoclass: UInt, retinfosize: MutPtr<UInt>, retinfobuffer: MutPtr<MutPtr<CVoid>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltRetrieveFileInfoOnCreateCompletionEx")

public actual fun fltRetrieveIoPriorityInfo(data: ConstPtr<FltCallbackData>, fileobject: ConstPtr<FileObject>, thread: Pethread, priorityinfo: MutPtr<IoPriorityInfo>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltRetrieveIoPriorityInfo")

public actual fun fltReuseCallbackData(callbackdata: MutPtr<FltCallbackData>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltReuseCallbackData")

public actual fun fltRollbackComplete(instance: PfltInstance, transaction: ConstPtr<Ktransaction>, transactioncontext: PfltContext): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltRollbackComplete")

public actual fun fltRollbackEnlistment(instance: PfltInstance, transaction: ConstPtr<Ktransaction>, transactioncontext: PfltContext): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltRollbackEnlistment")

public actual fun fltSendMessage(filter: PfltFilter, clientport: ConstPtr<PfltPort>, senderbuffer: ConstPtr<CVoid>, senderbufferlength: UInt, replybuffer: MutPtr<CVoid>, replylength: MutPtr<UInt>, timeout: ConstPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSendMessage")

public actual fun fltSetActivityIdCallbackData(callbackdata: MutPtr<FltCallbackData>, guid: ConstPtr<Guid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSetActivityIdCallbackData")

public actual fun fltSetCallbackDataDirty(data: MutPtr<FltCallbackData>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSetCallbackDataDirty")

public actual fun fltSetCancelCompletion(callbackdata: ConstPtr<FltCallbackData>, canceledcallback: PfltCompleteCanceledCallback): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSetCancelCompletion")

public actual fun fltSetEaFile(instance: PfltInstance, fileobject: ConstPtr<FileObject>, eabuffer: ConstPtr<CVoid>, length: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSetEaFile")

public actual fun fltSetEcpListIntoCallbackData(filter: PfltFilter, callbackdata: ConstPtr<FltCallbackData>, ecplist: ConstPtr<EcpList>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSetEcpListIntoCallbackData")

public actual fun fltSetFileContext(instance: PfltInstance, fileobject: ConstPtr<FileObject>, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr<PfltContext>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSetFileContext")

public actual fun fltSetFsZeroingOffset(data: ConstPtr<FltCallbackData>, zeroingoffset: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSetFsZeroingOffset")

public actual fun fltSetFsZeroingOffsetRequired(data: ConstPtr<FltCallbackData>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSetFsZeroingOffsetRequired")

public actual fun fltSetInformationFile(instance: PfltInstance, fileobject: ConstPtr<FileObject>, fileinformation: ConstPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSetInformationFile")

public actual fun fltSetInstanceContext(instance: PfltInstance, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr<PfltContext>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSetInstanceContext")

public actual fun fltSetIoPriorityHintIntoCallbackData(data: ConstPtr<FltCallbackData>, priorityhint: IoPriorityHint): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSetIoPriorityHintIntoCallbackData")

public actual fun fltSetIoPriorityHintIntoFileObject(fileobject: ConstPtr<FileObject>, priorityhint: IoPriorityHint): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSetIoPriorityHintIntoFileObject")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemMinifiltersFltSetIoPriorityHintIntoThread")
private external fun wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltSetIoPriorityHintIntoThread(thread: Long, priorityhint: Int): Int

public actual fun fltSetIoPriorityHintIntoThread(thread: Pethread, priorityhint: IoPriorityHint): Ntstatus =
    wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltSetIoPriorityHintIntoThread(thread, priorityhint)

public actual fun fltSetQuotaInformationFile(instance: PfltInstance, fileobject: ConstPtr<FileObject>, buffer: ConstPtr<CVoid>, length: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSetQuotaInformationFile")

public actual fun fltSetSecurityObject(instance: PfltInstance, fileobject: ConstPtr<FileObject>, securityinformation: UInt, securitydescriptor: PsecurityDescriptor): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSetSecurityObject")

public actual fun fltSetStreamContext(instance: PfltInstance, fileobject: ConstPtr<FileObject>, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr<PfltContext>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSetStreamContext")

public actual fun fltSetStreamHandleContext(instance: PfltInstance, fileobject: ConstPtr<FileObject>, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr<PfltContext>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSetStreamHandleContext")

public actual fun fltSetTransactionContext(instance: PfltInstance, transaction: ConstPtr<Ktransaction>, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr<PfltContext>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSetTransactionContext")

public actual fun fltSetVolumeContext(volume: PfltVolume, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr<PfltContext>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSetVolumeContext")

public actual fun fltSetVolumeInformation(instance: PfltInstance, iosb: MutPtr<IoStatusBlock>, fsinformation: MutPtr<CVoid>, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSetVolumeInformation")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemMinifiltersFltStartFiltering")
private external fun wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltStartFiltering(filter: Long): Int

public actual fun fltStartFiltering(filter: PfltFilter): Ntstatus =
    wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltStartFiltering(filter)

public actual fun fltSupportsFileContexts(fileobject: ConstPtr<FileObject>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsFileContexts")

public actual fun fltSupportsFileContextsEx(fileobject: ConstPtr<FileObject>, instance: PfltInstance): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsFileContextsEx")

public actual fun fltSupportsStreamContexts(fileobject: ConstPtr<FileObject>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsStreamContexts")

public actual fun fltSupportsStreamHandleContexts(fileobject: ConstPtr<FileObject>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsStreamHandleContexts")

public actual fun fltTagFile(initiatinginstance: PfltInstance, fileobject: ConstPtr<FileObject>, filetag: UInt, guid: ConstPtr<Guid>, databuffer: ConstPtr<CVoid>, databufferlength: UShort): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltTagFile")

public actual fun fltTagFileEx(initiatinginstance: PfltInstance, fileobject: ConstPtr<FileObject>, filetag: UInt, guid: ConstPtr<Guid>, databuffer: ConstPtr<CVoid>, databufferlength: UShort, existingfiletag: UInt, existingguid: ConstPtr<Guid>, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltTagFileEx")

public actual fun fltUninitializeFileLock(filelock: ConstPtr<FileLock>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltUninitializeFileLock")

public actual fun fltUninitializeOplock(oplock: ConstPtr<ConstPtr<CVoid>>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltUninitializeOplock")

public actual fun fltUnloadFilter(filtername: ConstPtr<UnicodeString>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltUnloadFilter")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkStorageFilesystemMinifiltersFltUnregisterFilter")
private external fun wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltUnregisterFilter(filter: Long): Unit

public actual fun fltUnregisterFilter(filter: PfltFilter): Unit =
    wasiWindowssysWindowsWdkStorageFilesystemMinifiltersFltUnregisterFilter(filter)

public actual fun fltUntagFile(initiatinginstance: PfltInstance, fileobject: ConstPtr<FileObject>, filetag: UInt, guid: ConstPtr<Guid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltUntagFile")

public actual fun fltVetoBypassIo(callbackdata: ConstPtr<FltCallbackData>, fltobjects: ConstPtr<FltRelatedObjects>, operationstatus: Ntstatus, failurereason: ConstPtr<UnicodeString>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltVetoBypassIo")

public actual fun fltWriteFile(initiatinginstance: PfltInstance, fileobject: ConstPtr<FileObject>, byteoffset: ConstPtr<Long>, length: UInt, buffer: ConstPtr<CVoid>, flags: UInt, byteswritten: MutPtr<UInt>, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltWriteFile")

public actual fun fltWriteFileEx(initiatinginstance: PfltInstance, fileobject: ConstPtr<FileObject>, byteoffset: ConstPtr<Long>, length: UInt, buffer: ConstPtr<CVoid>, flags: UInt, byteswritten: MutPtr<UInt>, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: ConstPtr<CVoid>, key: ConstPtr<UInt>, mdl: ConstPtr<Mdl>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltWriteFileEx")

public actual fun fltpTraceRedirectedFileIo(originatingfileobject: ConstPtr<FileObject>, childcallbackdata: MutPtr<FltCallbackData>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkStorageFilesystemMinifiltersFltpTraceRedirectedFileIo")
