package io.github.kotlinmania.windowssys.windows.win32.system.threading

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.RtlUmsSchedulerReason

public fun interface ApcCallbackFunctionFn {
    public operator fun invoke(param0: UInt, param1: MutPtr, param2: MutPtr)
}

public typealias ApcCallbackFunction = ApcCallbackFunctionFn?

public typealias AvrtPriority = Int

public typealias CreateEvent = UInt

public typealias CreateProcessLogonFlags = UInt

public typealias GetGuiResourcesFlags = UInt

public fun interface LpfiberStartRoutineFn {
    public operator fun invoke(lpfiberparameter: MutPtr)
}

public typealias LpfiberStartRoutine = LpfiberStartRoutineFn?

public typealias LpprocThreadAttributeList = MutPtr

public fun interface LpthreadStartRoutineFn {
    public operator fun invoke(lpthreadparameter: MutPtr): UInt
}

public typealias LpthreadStartRoutine = LpthreadStartRoutineFn?

public typealias MachineAttributes = Int

public typealias MemoryPriority = UInt

public fun interface PflsCallbackFunctionFn {
    public operator fun invoke(lpflsdata: ConstPtr)
}

public typealias PflsCallbackFunction = PflsCallbackFunctionFn?

public fun interface PinitOnceFnFn {
    public operator fun invoke(initonce: MutPtr, parameter: MutPtr, context: MutPtr): Bool
}

public typealias PinitOnceFn = PinitOnceFnFn?

public typealias PowerRequestContextFlags = UInt

public fun interface PpsPostProcessInitRoutineFn {
    public operator fun invoke()
}

public typealias PpsPostProcessInitRoutine = PpsPostProcessInitRoutineFn?

public typealias ProcessorFeatureId = UInt

public typealias ProcessAccessRights = UInt

public typealias ProcessAffinityAutoUpdateFlags = UInt

public typealias ProcessCreationFlags = UInt

public typealias ProcessDepFlags = UInt

public typealias ProcessInformationClass = Int

public typealias ProcessMemoryExhaustionType = Int

public typealias ProcessMitigationPolicy = Int

public typealias ProcessNameFormat = UInt

public typealias ProcessProtectionLevel = UInt

public typealias ProcThreadAttributeNum = UInt

public fun interface PrtlUmsSchedulerEntryPointFn {
    public operator fun invoke(reason: RtlUmsSchedulerReason, activationpayload: ULong, schedulerparam: ConstPtr)
}

public typealias PrtlUmsSchedulerEntryPoint = PrtlUmsSchedulerEntryPointFn?

public fun interface PtimerapcroutineFn {
    public operator fun invoke(lpargtocompletionroutine: ConstPtr, dwtimerlowvalue: UInt, dwtimerhighvalue: UInt)
}

public typealias Ptimerapcroutine = PtimerapcroutineFn?

public typealias PtpCallbackInstance = Long

public typealias PtpCleanupGroup = Long

public fun interface PtpCleanupGroupCancelCallbackFn {
    public operator fun invoke(objectcontext: MutPtr, cleanupcontext: MutPtr)
}

public typealias PtpCleanupGroupCancelCallback = PtpCleanupGroupCancelCallbackFn?

public typealias PtpIo = Long

public typealias PtpPool = Long

public fun interface PtpSimpleCallbackFn {
    public operator fun invoke(instance: PtpCallbackInstance, context: MutPtr)
}

public typealias PtpSimpleCallback = PtpSimpleCallbackFn?

public typealias PtpTimer = Long

public fun interface PtpTimerCallbackFn {
    public operator fun invoke(instance: PtpCallbackInstance, context: MutPtr, timer: PtpTimer)
}

public typealias PtpTimerCallback = PtpTimerCallbackFn?

public typealias PtpWait = Long

public fun interface PtpWaitCallbackFn {
    public operator fun invoke(instance: PtpCallbackInstance, context: MutPtr, wait: PtpWait, waitresult: UInt)
}

public typealias PtpWaitCallback = PtpWaitCallbackFn?

public fun interface PtpWin32IoCallbackFn {
    public operator fun invoke(instance: PtpCallbackInstance, context: MutPtr, overlapped: MutPtr, ioresult: UInt, numberofbytestransferred: ULong, io: PtpIo)
}

public typealias PtpWin32IoCallback = PtpWin32IoCallbackFn?

public typealias PtpWork = Long

public fun interface PtpWorkCallbackFn {
    public operator fun invoke(instance: PtpCallbackInstance, context: MutPtr, work: PtpWork)
}

public typealias PtpWorkCallback = PtpWorkCallbackFn?

public typealias QueueUserApcFlags = Int

public fun interface RtwqperiodiccallbackFn {
    public operator fun invoke(context: MutPtr)
}

public typealias Rtwqperiodiccallback = RtwqperiodiccallbackFn?

public typealias RtwqWorkqueueType = Int

public typealias StartupinfowFlags = UInt

public typealias SynchronizationAccessRights = UInt

public typealias ThreadAccessRights = UInt

public typealias ThreadCreationFlags = UInt

public typealias ThreadInformationClass = Int

public typealias ThreadPriority = Int

public typealias TpCallbackPriority = Int

public typealias UmsThreadInfoClass = Int

public fun interface WaitortimercallbackFn {
    public operator fun invoke(param0: MutPtr, param1: Boolean)
}

public typealias Waitortimercallback = WaitortimercallbackFn?

public fun interface WorkercallbackfuncFn {
    public operator fun invoke(param0: MutPtr)
}

public typealias Workercallbackfunc = WorkercallbackfuncFn?

public typealias WorkerThreadFlags = UInt
