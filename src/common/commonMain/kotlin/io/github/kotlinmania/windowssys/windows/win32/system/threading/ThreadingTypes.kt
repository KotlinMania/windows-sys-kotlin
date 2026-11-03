package io.github.kotlinmania.windowssys.windows.win32.system.threading

import io.github.kotlinmania.windowssys.core.BOOL

public fun interface APC_CALLBACK_FUNCTIONFn {
    public operator fun invoke(param0: UInt, param1: Long, param2: Long)
}

public typealias APC_CALLBACK_FUNCTION = APC_CALLBACK_FUNCTIONFn?

public typealias AVRT_PRIORITY = Int

public typealias CREATE_EVENT = UInt

public typealias CREATE_PROCESS_LOGON_FLAGS = UInt

public typealias GET_GUI_RESOURCES_FLAGS = UInt

public fun interface LPFIBER_START_ROUTINEFn {
    public operator fun invoke(lpfiberparameter: Long)
}

public typealias LPFIBER_START_ROUTINE = LPFIBER_START_ROUTINEFn?

public typealias LPPROC_THREAD_ATTRIBUTE_LIST = Long

public fun interface LPTHREAD_START_ROUTINEFn {
    public operator fun invoke(lpthreadparameter: Long): UInt
}

public typealias LPTHREAD_START_ROUTINE = LPTHREAD_START_ROUTINEFn?

public typealias MACHINE_ATTRIBUTES = Int

public typealias MEMORY_PRIORITY = UInt

public fun interface PFLS_CALLBACK_FUNCTIONFn {
    public operator fun invoke(lpflsdata: Long)
}

public typealias PFLS_CALLBACK_FUNCTION = PFLS_CALLBACK_FUNCTIONFn?

public fun interface PINIT_ONCE_FNFn {
    public operator fun invoke(initonce: Long, parameter: Long, context: Long): BOOL
}

public typealias PINIT_ONCE_FN = PINIT_ONCE_FNFn?

public typealias POWER_REQUEST_CONTEXT_FLAGS = UInt

public fun interface PPS_POST_PROCESS_INIT_ROUTINEFn {
    public operator fun invoke()
}

public typealias PPS_POST_PROCESS_INIT_ROUTINE = PPS_POST_PROCESS_INIT_ROUTINEFn?

public typealias PROCESSOR_FEATURE_ID = UInt

public typealias PROCESS_ACCESS_RIGHTS = UInt

public typealias PROCESS_AFFINITY_AUTO_UPDATE_FLAGS = UInt

public typealias PROCESS_CREATION_FLAGS = UInt

public typealias PROCESS_DEP_FLAGS = UInt

public typealias PROCESS_INFORMATION_CLASS = Int

public typealias PROCESS_MEMORY_EXHAUSTION_TYPE = Int

public typealias PROCESS_MITIGATION_POLICY = Int

public typealias PROCESS_NAME_FORMAT = UInt

public typealias PROCESS_PROTECTION_LEVEL = UInt

public typealias PROC_THREAD_ATTRIBUTE_NUM = UInt

public fun interface PRTL_UMS_SCHEDULER_ENTRY_POINTFn {
    public operator fun invoke(reason: SystemServices.RTL_UMS_SCHEDULER_REASON, activationpayload: ULong, schedulerparam: Long)
}

public typealias PRTL_UMS_SCHEDULER_ENTRY_POINT = PRTL_UMS_SCHEDULER_ENTRY_POINTFn?

public fun interface PTIMERAPCROUTINEFn {
    public operator fun invoke(lpargtocompletionroutine: Long, dwtimerlowvalue: UInt, dwtimerhighvalue: UInt)
}

public typealias PTIMERAPCROUTINE = PTIMERAPCROUTINEFn?

public typealias PTP_CALLBACK_INSTANCE = Long

public typealias PTP_CLEANUP_GROUP = Long

public fun interface PTP_CLEANUP_GROUP_CANCEL_CALLBACKFn {
    public operator fun invoke(objectcontext: Long, cleanupcontext: Long)
}

public typealias PTP_CLEANUP_GROUP_CANCEL_CALLBACK = PTP_CLEANUP_GROUP_CANCEL_CALLBACKFn?

public typealias PTP_IO = Long

public typealias PTP_POOL = Long

public fun interface PTP_SIMPLE_CALLBACKFn {
    public operator fun invoke(instance: PTP_CALLBACK_INSTANCE, context: Long)
}

public typealias PTP_SIMPLE_CALLBACK = PTP_SIMPLE_CALLBACKFn?

public typealias PTP_TIMER = Long

public fun interface PTP_TIMER_CALLBACKFn {
    public operator fun invoke(instance: PTP_CALLBACK_INSTANCE, context: Long, timer: PTP_TIMER)
}

public typealias PTP_TIMER_CALLBACK = PTP_TIMER_CALLBACKFn?

public typealias PTP_WAIT = Long

public fun interface PTP_WAIT_CALLBACKFn {
    public operator fun invoke(instance: PTP_CALLBACK_INSTANCE, context: Long, wait: PTP_WAIT, waitresult: UInt)
}

public typealias PTP_WAIT_CALLBACK = PTP_WAIT_CALLBACKFn?

public fun interface PTP_WIN32_IO_CALLBACKFn {
    public operator fun invoke(instance: PTP_CALLBACK_INSTANCE, context: Long, overlapped: Long, ioresult: UInt, numberofbytestransferred: ULong, io: PTP_IO)
}

public typealias PTP_WIN32_IO_CALLBACK = PTP_WIN32_IO_CALLBACKFn?

public typealias PTP_WORK = Long

public fun interface PTP_WORK_CALLBACKFn {
    public operator fun invoke(instance: PTP_CALLBACK_INSTANCE, context: Long, work: PTP_WORK)
}

public typealias PTP_WORK_CALLBACK = PTP_WORK_CALLBACKFn?

public typealias QUEUE_USER_APC_FLAGS = Int

public fun interface RTWQPERIODICCALLBACKFn {
    public operator fun invoke(context: Long)
}

public typealias RTWQPERIODICCALLBACK = RTWQPERIODICCALLBACKFn?

public typealias RTWQ_WORKQUEUE_TYPE = Int

public typealias STARTUPINFOW_FLAGS = UInt

public typealias SYNCHRONIZATION_ACCESS_RIGHTS = UInt

public typealias THREAD_ACCESS_RIGHTS = UInt

public typealias THREAD_CREATION_FLAGS = UInt

public typealias THREAD_INFORMATION_CLASS = Int

public typealias THREAD_PRIORITY = Int

public typealias TP_CALLBACK_PRIORITY = Int

public typealias UMS_THREAD_INFO_CLASS = Int

public fun interface WAITORTIMERCALLBACKFn {
    public operator fun invoke(param0: Long, param1: Boolean)
}

public typealias WAITORTIMERCALLBACK = WAITORTIMERCALLBACKFn?

public fun interface WORKERCALLBACKFUNCFn {
    public operator fun invoke(param0: Long)
}

public typealias WORKERCALLBACKFUNC = WORKERCALLBACKFUNCFn?

public typealias WORKER_THREAD_FLAGS = UInt
