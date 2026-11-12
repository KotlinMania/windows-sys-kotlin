package io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.wdk.foundation.FileObject
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PoolType
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FileNamesInformation
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.FltFilesystemType

public typealias FltCallbackDataQueueFlags = Int

public typealias FltPostopCallbackStatus = Int

public typealias FltPreopCallbackStatus = Int

public typealias FltSetContextOperation = Int

public fun interface PfltoplockPrepostCallbackdataRoutineFn {
    public operator fun invoke(callbackdata: ConstPtr<FltCallbackData>, context: ConstPtr<CVoid>)
}

public typealias PfltoplockPrepostCallbackdataRoutine = PfltoplockPrepostCallbackdataRoutineFn?

public fun interface PfltoplockWaitCompleteRoutineFn {
    public operator fun invoke(callbackdata: ConstPtr<FltCallbackData>, context: ConstPtr<CVoid>)
}

public typealias PfltoplockWaitCompleteRoutine = PfltoplockWaitCompleteRoutineFn?

public fun interface PfltCallbackDataQueueAcquireFn {
    public operator fun invoke(cbdq: MutPtr<FltCallbackDataQueue>, irql: MutPtr<UByte>)
}

public typealias PfltCallbackDataQueueAcquire = PfltCallbackDataQueueAcquireFn?

public fun interface PfltCallbackDataQueueCompleteCanceledIoFn {
    public operator fun invoke(cbdq: MutPtr<FltCallbackDataQueue>, cbd: MutPtr<FltCallbackData>)
}

public typealias PfltCallbackDataQueueCompleteCanceledIo = PfltCallbackDataQueueCompleteCanceledIoFn?

public fun interface PfltCallbackDataQueueInsertIoFn {
    public operator fun invoke(cbdq: MutPtr<FltCallbackDataQueue>, cbd: ConstPtr<FltCallbackData>, insertcontext: ConstPtr<CVoid>): Ntstatus
}

public typealias PfltCallbackDataQueueInsertIo = PfltCallbackDataQueueInsertIoFn?

public fun interface PfltCallbackDataQueuePeekNextIoFn {
    public operator fun invoke(cbdq: ConstPtr<FltCallbackDataQueue>, cbd: ConstPtr<FltCallbackData>, peekcontext: ConstPtr<CVoid>): MutPtr<FltCallbackData>
}

public typealias PfltCallbackDataQueuePeekNextIo = PfltCallbackDataQueuePeekNextIoFn?

public fun interface PfltCallbackDataQueueReleaseFn {
    public operator fun invoke(cbdq: MutPtr<FltCallbackDataQueue>, irql: UByte)
}

public typealias PfltCallbackDataQueueRelease = PfltCallbackDataQueueReleaseFn?

public fun interface PfltCallbackDataQueueRemoveIoFn {
    public operator fun invoke(cbdq: MutPtr<FltCallbackDataQueue>, cbd: ConstPtr<FltCallbackData>)
}

public typealias PfltCallbackDataQueueRemoveIo = PfltCallbackDataQueueRemoveIoFn?

public fun interface PfltCompletedAsyncIoCallbackFn {
    public operator fun invoke(callbackdata: ConstPtr<FltCallbackData>, context: PfltContext)
}

public typealias PfltCompletedAsyncIoCallback = PfltCompletedAsyncIoCallbackFn?

public fun interface PfltCompleteCanceledCallbackFn {
    public operator fun invoke(callbackdata: ConstPtr<FltCallbackData>)
}

public typealias PfltCompleteCanceledCallback = PfltCompleteCanceledCallbackFn?

public fun interface PfltCompleteLockCallbackDataRoutineFn {
    public operator fun invoke(context: ConstPtr<CVoid>, callbackdata: ConstPtr<FltCallbackData>): Ntstatus
}

public typealias PfltCompleteLockCallbackDataRoutine = PfltCompleteLockCallbackDataRoutineFn?

public fun interface PfltConnectNotifyFn {
    public operator fun invoke(clientport: PfltPort, serverportcookie: ConstPtr<CVoid>, connectioncontext: ConstPtr<CVoid>, sizeofcontext: UInt, connectionportcookie: MutPtr<MutPtr<CVoid>>): Ntstatus
}

public typealias PfltConnectNotify = PfltConnectNotifyFn?

public typealias PfltContext = MutPtr<CVoid>

public fun interface PfltContextAllocateCallbackFn {
    public operator fun invoke(pooltype: PoolType, size: ULong, contexttype: UShort): MutPtr<CVoid>
}

public typealias PfltContextAllocateCallback = PfltContextAllocateCallbackFn?

public fun interface PfltContextCleanupCallbackFn {
    public operator fun invoke(context: PfltContext, contexttype: UShort)
}

public typealias PfltContextCleanupCallback = PfltContextCleanupCallbackFn?

public fun interface PfltContextFreeCallbackFn {
    public operator fun invoke(pool: ConstPtr<CVoid>, contexttype: UShort)
}

public typealias PfltContextFreeCallback = PfltContextFreeCallbackFn?

public typealias PfltDeferredIoWorkitem = Long

public fun interface PfltDeferredIoWorkitemRoutineFn {
    public operator fun invoke(fltworkitem: PfltDeferredIoWorkitem, callbackdata: ConstPtr<FltCallbackData>, context: ConstPtr<CVoid>)
}

public typealias PfltDeferredIoWorkitemRoutine = PfltDeferredIoWorkitemRoutineFn?

public fun interface PfltDisconnectNotifyFn {
    public operator fun invoke(connectioncookie: ConstPtr<CVoid>)
}

public typealias PfltDisconnectNotify = PfltDisconnectNotifyFn?

public typealias PfltFilter = Long

public fun interface PfltFilterUnloadCallbackFn {
    public operator fun invoke(flags: UInt): Ntstatus
}

public typealias PfltFilterUnloadCallback = PfltFilterUnloadCallbackFn?

public fun interface PfltGenerateFileNameFn {
    public operator fun invoke(instance: PfltInstance, fileobject: ConstPtr<FileObject>, callbackdata: ConstPtr<FltCallbackData>, nameoptions: UInt, cachefilenameinformation: MutPtr<Boolean>, filename: MutPtr<FltNameControl>): Ntstatus
}

public typealias PfltGenerateFileName = PfltGenerateFileNameFn?

public typealias PfltGenericWorkitem = Long

public fun interface PfltGenericWorkitemRoutineFn {
    public operator fun invoke(fltworkitem: PfltGenericWorkitem, fltobject: ConstPtr<CVoid>, context: ConstPtr<CVoid>)
}

public typealias PfltGenericWorkitemRoutine = PfltGenericWorkitemRoutineFn?

public fun interface PfltGetOperationStatusCallbackFn {
    public operator fun invoke(fltobjects: ConstPtr<FltRelatedObjects>, iopbsnapshot: ConstPtr<FltIoParameterBlock>, operationstatus: Ntstatus, requestercontext: ConstPtr<CVoid>)
}

public typealias PfltGetOperationStatusCallback = PfltGetOperationStatusCallbackFn?

public typealias PfltInstance = Long

public fun interface PfltInstanceQueryTeardownCallbackFn {
    public operator fun invoke(fltobjects: ConstPtr<FltRelatedObjects>, flags: UInt): Ntstatus
}

public typealias PfltInstanceQueryTeardownCallback = PfltInstanceQueryTeardownCallbackFn?

public fun interface PfltInstanceSetupCallbackFn {
    public operator fun invoke(fltobjects: ConstPtr<FltRelatedObjects>, flags: UInt, volumedevicetype: UInt, volumefilesystemtype: FltFilesystemType): Ntstatus
}

public typealias PfltInstanceSetupCallback = PfltInstanceSetupCallbackFn?

public fun interface PfltInstanceTeardownCallbackFn {
    public operator fun invoke(fltobjects: ConstPtr<FltRelatedObjects>, reason: UInt)
}

public typealias PfltInstanceTeardownCallback = PfltInstanceTeardownCallbackFn?

public fun interface PfltMessageNotifyFn {
    public operator fun invoke(portcookie: ConstPtr<CVoid>, inputbuffer: ConstPtr<CVoid>, inputbufferlength: UInt, outputbuffer: MutPtr<CVoid>, outputbufferlength: UInt, returnoutputbufferlength: MutPtr<UInt>): Ntstatus
}

public typealias PfltMessageNotify = PfltMessageNotifyFn?

public fun interface PfltNormalizeContextCleanupFn {
    public operator fun invoke(normalizationcontext: ConstPtr<ConstPtr<CVoid>>)
}

public typealias PfltNormalizeContextCleanup = PfltNormalizeContextCleanupFn?

public fun interface PfltNormalizeNameComponentFn {
    public operator fun invoke(instance: PfltInstance, parentdirectory: ConstPtr<UnicodeString>, volumenamelength: UShort, component: ConstPtr<UnicodeString>, expandcomponentname: MutPtr<FileNamesInformation>, expandcomponentnamelength: UInt, flags: UInt, normalizationcontext: MutPtr<MutPtr<CVoid>>): Ntstatus
}

public typealias PfltNormalizeNameComponent = PfltNormalizeNameComponentFn?

public fun interface PfltNormalizeNameComponentExFn {
    public operator fun invoke(instance: PfltInstance, fileobject: ConstPtr<FileObject>, parentdirectory: ConstPtr<UnicodeString>, volumenamelength: UShort, component: ConstPtr<UnicodeString>, expandcomponentname: MutPtr<FileNamesInformation>, expandcomponentnamelength: UInt, flags: UInt, normalizationcontext: MutPtr<MutPtr<CVoid>>): Ntstatus
}

public typealias PfltNormalizeNameComponentEx = PfltNormalizeNameComponentExFn?

public typealias PfltPort = Long

public fun interface PfltPostOperationCallbackFn {
    public operator fun invoke(data: MutPtr<FltCallbackData>, fltobjects: ConstPtr<FltRelatedObjects>, completioncontext: ConstPtr<CVoid>, flags: UInt): FltPostopCallbackStatus
}

public typealias PfltPostOperationCallback = PfltPostOperationCallbackFn?

public fun interface PfltPreOperationCallbackFn {
    public operator fun invoke(data: MutPtr<FltCallbackData>, fltobjects: ConstPtr<FltRelatedObjects>, completioncontext: MutPtr<MutPtr<CVoid>>): FltPreopCallbackStatus
}

public typealias PfltPreOperationCallback = PfltPreOperationCallbackFn?

public fun interface PfltSectionConflictNotificationCallbackFn {
    public operator fun invoke(instance: PfltInstance, sectioncontext: PfltContext, data: ConstPtr<FltCallbackData>): Ntstatus
}

public typealias PfltSectionConflictNotificationCallback = PfltSectionConflictNotificationCallbackFn?

public fun interface PfltTransactionNotificationCallbackFn {
    public operator fun invoke(fltobjects: ConstPtr<FltRelatedObjects>, transactioncontext: PfltContext, notificationmask: UInt): Ntstatus
}

public typealias PfltTransactionNotificationCallback = PfltTransactionNotificationCallbackFn?

public typealias PfltVolume = Long
