package io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PoolType
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.FltFilesystemType

public typealias FltCallbackDataQueueFlags = Int

public typealias FltPostopCallbackStatus = Int

public typealias FltPreopCallbackStatus = Int

public typealias FltSetContextOperation = Int

public fun interface PfltoplockPrepostCallbackdataRoutineFn {
    public operator fun invoke(callbackdata: COpaquePointer?, context: COpaquePointer?)
}

public typealias PfltoplockPrepostCallbackdataRoutine = PfltoplockPrepostCallbackdataRoutineFn?

public fun interface PfltoplockWaitCompleteRoutineFn {
    public operator fun invoke(callbackdata: COpaquePointer?, context: COpaquePointer?)
}

public typealias PfltoplockWaitCompleteRoutine = PfltoplockWaitCompleteRoutineFn?

public fun interface PfltCallbackDataQueueAcquireFn {
    public operator fun invoke(cbdq: COpaquePointer?, irql: COpaquePointer?)
}

public typealias PfltCallbackDataQueueAcquire = PfltCallbackDataQueueAcquireFn?

public fun interface PfltCallbackDataQueueCompleteCanceledIoFn {
    public operator fun invoke(cbdq: COpaquePointer?, cbd: COpaquePointer?)
}

public typealias PfltCallbackDataQueueCompleteCanceledIo = PfltCallbackDataQueueCompleteCanceledIoFn?

public fun interface PfltCallbackDataQueueInsertIoFn {
    public operator fun invoke(cbdq: COpaquePointer?, cbd: COpaquePointer?, insertcontext: COpaquePointer?): Ntstatus
}

public typealias PfltCallbackDataQueueInsertIo = PfltCallbackDataQueueInsertIoFn?

public fun interface PfltCallbackDataQueuePeekNextIoFn {
    public operator fun invoke(cbdq: COpaquePointer?, cbd: COpaquePointer?, peekcontext: COpaquePointer?): COpaquePointer?
}

public typealias PfltCallbackDataQueuePeekNextIo = PfltCallbackDataQueuePeekNextIoFn?

public fun interface PfltCallbackDataQueueReleaseFn {
    public operator fun invoke(cbdq: COpaquePointer?, irql: UByte)
}

public typealias PfltCallbackDataQueueRelease = PfltCallbackDataQueueReleaseFn?

public fun interface PfltCallbackDataQueueRemoveIoFn {
    public operator fun invoke(cbdq: COpaquePointer?, cbd: COpaquePointer?)
}

public typealias PfltCallbackDataQueueRemoveIo = PfltCallbackDataQueueRemoveIoFn?

public fun interface PfltCompletedAsyncIoCallbackFn {
    public operator fun invoke(callbackdata: COpaquePointer?, context: PfltContext)
}

public typealias PfltCompletedAsyncIoCallback = PfltCompletedAsyncIoCallbackFn?

public fun interface PfltCompleteCanceledCallbackFn {
    public operator fun invoke(callbackdata: COpaquePointer?)
}

public typealias PfltCompleteCanceledCallback = PfltCompleteCanceledCallbackFn?

public fun interface PfltCompleteLockCallbackDataRoutineFn {
    public operator fun invoke(context: COpaquePointer?, callbackdata: COpaquePointer?): Ntstatus
}

public typealias PfltCompleteLockCallbackDataRoutine = PfltCompleteLockCallbackDataRoutineFn?

public fun interface PfltConnectNotifyFn {
    public operator fun invoke(clientport: PfltPort, serverportcookie: COpaquePointer?, connectioncontext: COpaquePointer?, sizeofcontext: UInt, connectionportcookie: COpaquePointer?): Ntstatus
}

public typealias PfltConnectNotify = PfltConnectNotifyFn?

public typealias PfltContext = COpaquePointer?

public fun interface PfltContextAllocateCallbackFn {
    public operator fun invoke(pooltype: PoolType, size: ULong, contexttype: UShort): COpaquePointer?
}

public typealias PfltContextAllocateCallback = PfltContextAllocateCallbackFn?

public fun interface PfltContextCleanupCallbackFn {
    public operator fun invoke(context: PfltContext, contexttype: UShort)
}

public typealias PfltContextCleanupCallback = PfltContextCleanupCallbackFn?

public fun interface PfltContextFreeCallbackFn {
    public operator fun invoke(pool: COpaquePointer?, contexttype: UShort)
}

public typealias PfltContextFreeCallback = PfltContextFreeCallbackFn?

public typealias PfltDeferredIoWorkitem = Long

public fun interface PfltDeferredIoWorkitemRoutineFn {
    public operator fun invoke(fltworkitem: PfltDeferredIoWorkitem, callbackdata: COpaquePointer?, context: COpaquePointer?)
}

public typealias PfltDeferredIoWorkitemRoutine = PfltDeferredIoWorkitemRoutineFn?

public fun interface PfltDisconnectNotifyFn {
    public operator fun invoke(connectioncookie: COpaquePointer?)
}

public typealias PfltDisconnectNotify = PfltDisconnectNotifyFn?

public typealias PfltFilter = Long

public fun interface PfltFilterUnloadCallbackFn {
    public operator fun invoke(flags: UInt): Ntstatus
}

public typealias PfltFilterUnloadCallback = PfltFilterUnloadCallbackFn?

public fun interface PfltGenerateFileNameFn {
    public operator fun invoke(instance: PfltInstance, fileobject: COpaquePointer?, callbackdata: COpaquePointer?, nameoptions: UInt, cachefilenameinformation: COpaquePointer?, filename: COpaquePointer?): Ntstatus
}

public typealias PfltGenerateFileName = PfltGenerateFileNameFn?

public typealias PfltGenericWorkitem = Long

public fun interface PfltGenericWorkitemRoutineFn {
    public operator fun invoke(fltworkitem: PfltGenericWorkitem, fltobject: COpaquePointer?, context: COpaquePointer?)
}

public typealias PfltGenericWorkitemRoutine = PfltGenericWorkitemRoutineFn?

public fun interface PfltGetOperationStatusCallbackFn {
    public operator fun invoke(fltobjects: COpaquePointer?, iopbsnapshot: COpaquePointer?, operationstatus: Ntstatus, requestercontext: COpaquePointer?)
}

public typealias PfltGetOperationStatusCallback = PfltGetOperationStatusCallbackFn?

public typealias PfltInstance = Long

public fun interface PfltInstanceQueryTeardownCallbackFn {
    public operator fun invoke(fltobjects: COpaquePointer?, flags: UInt): Ntstatus
}

public typealias PfltInstanceQueryTeardownCallback = PfltInstanceQueryTeardownCallbackFn?

public fun interface PfltInstanceSetupCallbackFn {
    public operator fun invoke(fltobjects: COpaquePointer?, flags: UInt, volumedevicetype: UInt, volumefilesystemtype: FltFilesystemType): Ntstatus
}

public typealias PfltInstanceSetupCallback = PfltInstanceSetupCallbackFn?

public fun interface PfltInstanceTeardownCallbackFn {
    public operator fun invoke(fltobjects: COpaquePointer?, reason: UInt)
}

public typealias PfltInstanceTeardownCallback = PfltInstanceTeardownCallbackFn?

public fun interface PfltMessageNotifyFn {
    public operator fun invoke(portcookie: COpaquePointer?, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt, returnoutputbufferlength: COpaquePointer?): Ntstatus
}

public typealias PfltMessageNotify = PfltMessageNotifyFn?

public fun interface PfltNormalizeContextCleanupFn {
    public operator fun invoke(normalizationcontext: COpaquePointer?)
}

public typealias PfltNormalizeContextCleanup = PfltNormalizeContextCleanupFn?

public fun interface PfltNormalizeNameComponentFn {
    public operator fun invoke(instance: PfltInstance, parentdirectory: COpaquePointer?, volumenamelength: UShort, component: COpaquePointer?, expandcomponentname: COpaquePointer?, expandcomponentnamelength: UInt, flags: UInt, normalizationcontext: COpaquePointer?): Ntstatus
}

public typealias PfltNormalizeNameComponent = PfltNormalizeNameComponentFn?

public fun interface PfltNormalizeNameComponentExFn {
    public operator fun invoke(instance: PfltInstance, fileobject: COpaquePointer?, parentdirectory: COpaquePointer?, volumenamelength: UShort, component: COpaquePointer?, expandcomponentname: COpaquePointer?, expandcomponentnamelength: UInt, flags: UInt, normalizationcontext: COpaquePointer?): Ntstatus
}

public typealias PfltNormalizeNameComponentEx = PfltNormalizeNameComponentExFn?

public typealias PfltPort = Long

public fun interface PfltPostOperationCallbackFn {
    public operator fun invoke(data: COpaquePointer?, fltobjects: COpaquePointer?, completioncontext: COpaquePointer?, flags: UInt): FltPostopCallbackStatus
}

public typealias PfltPostOperationCallback = PfltPostOperationCallbackFn?

public fun interface PfltPreOperationCallbackFn {
    public operator fun invoke(data: COpaquePointer?, fltobjects: COpaquePointer?, completioncontext: COpaquePointer?): FltPreopCallbackStatus
}

public typealias PfltPreOperationCallback = PfltPreOperationCallbackFn?

public fun interface PfltSectionConflictNotificationCallbackFn {
    public operator fun invoke(instance: PfltInstance, sectioncontext: PfltContext, data: COpaquePointer?): Ntstatus
}

public typealias PfltSectionConflictNotificationCallback = PfltSectionConflictNotificationCallbackFn?

public fun interface PfltTransactionNotificationCallbackFn {
    public operator fun invoke(fltobjects: COpaquePointer?, transactioncontext: PfltContext, notificationmask: UInt): Ntstatus
}

public typealias PfltTransactionNotificationCallback = PfltTransactionNotificationCallbackFn?

public typealias PfltVolume = Long
