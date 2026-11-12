package io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pesilo
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

public fun interface AllocateVirtualMemoryExCallbackFn {
    public operator fun invoke(callbackcontext: Handle, processhandle: Handle, baseaddress: MutPtr, regionsize: MutPtr, allocationtype: UInt, pageprotection: UInt, extendedparameters: MutPtr, extendedparametercount: UInt): Ntstatus
}

public typealias AllocateVirtualMemoryExCallback = AllocateVirtualMemoryExCallbackFn?

public typealias CsvDownLevelFileType = Int

public typealias FastIoPossible = Int

public typealias FileDispositionInformationExFlags = UInt

public typealias FileInformationClass = Int

public typealias FileKnownFolderType = Int

public fun interface FreeVirtualMemoryExCallbackFn {
    public operator fun invoke(callbackcontext: Handle, processhandle: Handle, baseaddress: MutPtr, regionsize: MutPtr, freetype: UInt): Ntstatus
}

public typealias FreeVirtualMemoryExCallback = FreeVirtualMemoryExCallbackFn?

public typealias FsrtlChangeBackingType = Int

public typealias FsrtlComparisonResult = Int

public typealias FsFilterSectionSyncType = Int

public typealias FsFilterStreamFoNotificationType = Int

public typealias FsInformationClass = Int

public typealias HeapMemoryInfoClass = Int

public typealias LinkTrackingInformationType = Int

public typealias MemoryInformationClass = Int

public typealias MmflushType = Int

public typealias Msv10Avid = Int

public typealias NetworkOpenIntegrityQualifier = Int

public typealias NetworkOpenLocationQualifier = Int

public typealias NtcreatefileCreateDisposition = UInt

public typealias NtcreatefileCreateOptions = UInt

public typealias OplockNotifyReason = Int

public fun interface PacquireForLazyWriteFn {
    public operator fun invoke(context: ConstPtr, wait: Boolean): Boolean
}

public typealias PacquireForLazyWrite = PacquireForLazyWriteFn?

public fun interface PacquireForLazyWriteExFn {
    public operator fun invoke(context: ConstPtr, inflags: UInt, outflags: MutPtr): Boolean
}

public typealias PacquireForLazyWriteEx = PacquireForLazyWriteExFn?

public fun interface PacquireForReadAheadFn {
    public operator fun invoke(context: ConstPtr, wait: Boolean): Boolean
}

public typealias PacquireForReadAhead = PacquireForReadAheadFn?

public fun interface PallocateVirtualMemoryExCallbackFn {
    public operator fun invoke(): Ntstatus
}

public typealias PallocateVirtualMemoryExCallback = PallocateVirtualMemoryExCallbackFn?

public fun interface PasyncReadCompletionCallbackFn {
    public operator fun invoke(context: ConstPtr): Boolean
}

public typealias PasyncReadCompletionCallback = PasyncReadCompletionCallbackFn?

public fun interface PccPostDeferredWriteFn {
    public operator fun invoke(context1: ConstPtr, context2: ConstPtr)
}

public typealias PccPostDeferredWrite = PccPostDeferredWriteFn?

public fun interface PcheckForTraverseAccessFn {
    public operator fun invoke(notifycontext: ConstPtr, targetcontext: ConstPtr, subjectcontext: ConstPtr): Boolean
}

public typealias PcheckForTraverseAccess = PcheckForTraverseAccessFn?

public fun interface PcompleteLockIrpRoutineFn {
    public operator fun invoke(context: ConstPtr, irp: ConstPtr): Ntstatus
}

public typealias PcompleteLockIrpRoutine = PcompleteLockIrpRoutineFn?

public fun interface PdirtyPageRoutineFn {
    public operator fun invoke(fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, oldestlsn: ConstPtr, newestlsn: ConstPtr, context1: ConstPtr, context2: ConstPtr)
}

public typealias PdirtyPageRoutine = PdirtyPageRoutineFn?

public fun interface PfilterReportChangeFn {
    public operator fun invoke(notifycontext: ConstPtr, filtercontext: ConstPtr): Boolean
}

public typealias PfilterReportChange = PfilterReportChangeFn?

public fun interface PflushToLsnFn {
    public operator fun invoke(loghandle: ConstPtr, lsn: Long)
}

public typealias PflushToLsn = PflushToLsnFn?

public fun interface PfnFsrtlteardownperstreamcontextsFn {
    public operator fun invoke(advancedheader: ConstPtr)
}

public typealias PfnFsrtlteardownperstreamcontexts = PfnFsrtlteardownperstreamcontextsFn?

public fun interface PfreeVirtualMemoryExCallbackFn {
    public operator fun invoke(): Ntstatus
}

public typealias PfreeVirtualMemoryExCallback = PfreeVirtualMemoryExCallbackFn?

public fun interface PfsrtlExtraCreateParameterCleanupCallbackFn {
    public operator fun invoke(ecpcontext: MutPtr, ecptype: ConstPtr)
}

public typealias PfsrtlExtraCreateParameterCleanupCallback = PfsrtlExtraCreateParameterCleanupCallbackFn?

public fun interface PfsrtlStackOverflowRoutineFn {
    public operator fun invoke(context: ConstPtr, event: ConstPtr)
}

public typealias PfsrtlStackOverflowRoutine = PfsrtlStackOverflowRoutineFn?

public fun interface PfsFilterCallbackFn {
    public operator fun invoke(data: ConstPtr, completioncontext: MutPtr): Ntstatus
}

public typealias PfsFilterCallback = PfsFilterCallbackFn?

public fun interface PfsFilterCompletionCallbackFn {
    public operator fun invoke(data: ConstPtr, operationstatus: Ntstatus, completioncontext: ConstPtr)
}

public typealias PfsFilterCompletionCallback = PfsFilterCompletionCallbackFn?

public fun interface PoplockFsPrepostIrpFn {
    public operator fun invoke(context: ConstPtr, irp: ConstPtr)
}

public typealias PoplockFsPrepostIrp = PoplockFsPrepostIrpFn?

public fun interface PoplockNotifyRoutineFn {
    public operator fun invoke(notifyparams: ConstPtr): Ntstatus
}

public typealias PoplockNotifyRoutine = PoplockNotifyRoutineFn?

public fun interface PoplockWaitCompleteRoutineFn {
    public operator fun invoke(context: ConstPtr, irp: ConstPtr)
}

public typealias PoplockWaitCompleteRoutine = PoplockWaitCompleteRoutineFn?

public fun interface PqueryLogUsageFn {
    public operator fun invoke(loghandle: ConstPtr, percentagefull: MutPtr)
}

public typealias PqueryLogUsage = PqueryLogUsageFn?

public fun interface PqueryVirtualMemoryCallbackFn {
    public operator fun invoke(): Ntstatus
}

public typealias PqueryVirtualMemoryCallback = PqueryVirtualMemoryCallbackFn?

public fun interface PreleaseFromLazyWriteFn {
    public operator fun invoke(context: ConstPtr)
}

public typealias PreleaseFromLazyWrite = PreleaseFromLazyWriteFn?

public fun interface PreleaseFromReadAheadFn {
    public operator fun invoke(context: ConstPtr)
}

public typealias PreleaseFromReadAhead = PreleaseFromReadAheadFn?

public fun interface PrtlAllocateStringRoutineFn {
    public operator fun invoke(): MutPtr
}

public typealias PrtlAllocateStringRoutine = PrtlAllocateStringRoutineFn?

public fun interface PrtlFreeStringRoutineFn {
    public operator fun invoke()
}

public typealias PrtlFreeStringRoutine = PrtlFreeStringRoutineFn?

public fun interface PrtlHeapCommitRoutineFn {
    public operator fun invoke(): Ntstatus
}

public typealias PrtlHeapCommitRoutine = PrtlHeapCommitRoutineFn?

public fun interface PrtlReallocateStringRoutineFn {
    public operator fun invoke(): MutPtr
}

public typealias PrtlReallocateStringRoutine = PrtlReallocateStringRoutineFn?

public fun interface PseLogonSessionTerminatedRoutineFn {
    public operator fun invoke(): Ntstatus
}

public typealias PseLogonSessionTerminatedRoutine = PseLogonSessionTerminatedRoutineFn?

public fun interface PseLogonSessionTerminatedRoutineExFn {
    public operator fun invoke(): Ntstatus
}

public typealias PseLogonSessionTerminatedRoutineEx = PseLogonSessionTerminatedRoutineExFn?

public fun interface PunlockRoutineFn {
    public operator fun invoke(context: ConstPtr, filelockinfo: ConstPtr)
}

public typealias PunlockRoutine = PunlockRoutineFn?

public fun interface QueryVirtualMemoryCallbackFn {
    public operator fun invoke(callbackcontext: Handle, processhandle: Handle, baseaddress: ConstPtr, memoryinformationclass: HeapMemoryInfoClass, memoryinformation: MutPtr, memoryinformationlength: ULong, returnlength: MutPtr): Ntstatus
}

public typealias QueryVirtualMemoryCallback = QueryVirtualMemoryCallbackFn?

public typealias RefsCompressionFormats = Int

public typealias RefsDeallocateRangesAllocator = Int

public typealias RefsSetVolumeCompressionInfoFlags = Int

public typealias RefsStreamSnapshotOperation = Int

public fun interface RtlAllocateStringRoutineFn {
    public operator fun invoke(numberofbytes: ULong): MutPtr
}

public typealias RtlAllocateStringRoutine = RtlAllocateStringRoutineFn?

public fun interface RtlFreeStringRoutineFn {
    public operator fun invoke(buffer: ConstPtr)
}

public typealias RtlFreeStringRoutine = RtlFreeStringRoutineFn?

public fun interface RtlHeapCommitRoutineFn {
    public operator fun invoke(base: ConstPtr, commitaddress: MutPtr, commitsize: MutPtr): Ntstatus
}

public typealias RtlHeapCommitRoutine = RtlHeapCommitRoutineFn?

public typealias RtlMemoryType = Int

public fun interface RtlReallocateStringRoutineFn {
    public operator fun invoke(numberofbytes: ULong, buffer: ConstPtr): MutPtr
}

public typealias RtlReallocateStringRoutine = RtlReallocateStringRoutineFn?

public typealias SeAuditOperation = Int

public fun interface SeLogonSessionTerminatedRoutineFn {
    public operator fun invoke(logonid: ConstPtr): Ntstatus
}

public typealias SeLogonSessionTerminatedRoutine = SeLogonSessionTerminatedRoutineFn?

public fun interface SeLogonSessionTerminatedRoutineExFn {
    public operator fun invoke(logonid: ConstPtr, pserversilo: Pesilo, context: ConstPtr): Ntstatus
}

public typealias SeLogonSessionTerminatedRoutineEx = SeLogonSessionTerminatedRoutineExFn?

public typealias SrvInstanceType = Int

public typealias SharedVirtualDiskHandleState = Int

public typealias SharedVirtualDiskSupportType = Int

public fun interface SspiAsyncNotifyCallbackFn {
    public operator fun invoke(handle: ConstPtr, callbackdata: ConstPtr)
}

public typealias SspiAsyncNotifyCallback = SspiAsyncNotifyCallbackFn?

public typealias VirtualMemoryInformationClass = Int

public typealias LcnWeakReferenceState = Int

public typealias RefsStreamExtentProperties = Int
