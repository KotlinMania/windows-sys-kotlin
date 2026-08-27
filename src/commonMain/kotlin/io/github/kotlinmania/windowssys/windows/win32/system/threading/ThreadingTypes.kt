// port-lint: source windows-sys/src/Windows/Win32/System/Threading/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.threading

// All type aliases from upstream Windows/Win32/System/Threading/mod.rs,
// in upstream declaration order. Simple integer/pointer newtypes map
// directly to their Kotlin equivalents. Function-pointer types map to
// nullable functional type aliases; the pointer parameters become
// `Long` per this port's pointer-typealias convention (cf. core/Core.kt).

public typealias AVRT_PRIORITY = Int
public typealias CREATE_EVENT = UInt
public typealias CREATE_PROCESS_LOGON_FLAGS = UInt
public typealias GET_GUI_RESOURCES_FLAGS = UInt
public typealias LPPROC_THREAD_ATTRIBUTE_LIST = Long
public typealias MACHINE_ATTRIBUTES = Int
public typealias MEMORY_PRIORITY = UInt
public typealias POWER_REQUEST_CONTEXT_FLAGS = UInt
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
public typealias QUEUE_USER_APC_FLAGS = Int
public typealias RTWQ_WORKQUEUE_TYPE = Int
public typealias STARTUPINFOW_FLAGS = UInt
public typealias SYNCHRONIZATION_ACCESS_RIGHTS = UInt
public typealias THREAD_ACCESS_RIGHTS = UInt
public typealias THREAD_CREATION_FLAGS = UInt
public typealias THREAD_INFORMATION_CLASS = Int
public typealias THREAD_PRIORITY = Int
public typealias TP_CALLBACK_PRIORITY = Int
public typealias UMS_THREAD_INFO_CLASS = Int
public typealias WORKER_THREAD_FLAGS = UInt

// Threadpool opaque pointer types — upstream uses `isize`.
public typealias PTP_CALLBACK_INSTANCE = Long
public typealias PTP_CLEANUP_GROUP = Long
public typealias PTP_IO = Long
public typealias PTP_POOL = Long
public typealias PTP_TIMER = Long
public typealias PTP_WAIT = Long
public typealias PTP_WORK = Long

// Function-pointer type aliases. Upstream uses
// `Option<unsafe extern "system" fn(...)>` — Kotlin has no `unsafe`
// or `extern "system"` equivalent, so these are named SAM interfaces
// with `Long` standing in for raw pointers.
public fun interface LPFIBER_START_ROUTINE {
    public fun invoke(lpFiberParameter: Long)
}

public fun interface LPTHREAD_START_ROUTINE {
    public fun invoke(lpThreadParameter: Long): UInt
}

public fun interface PFLS_CALLBACK_FUNCTION {
    public fun invoke(lpFlsData: Long)
}

public fun interface PINIT_ONCE_FN {
    public fun invoke(initOnce: Long, parameter: Long, context: LongArray): Int
}

public fun interface PPS_POST_PROCESS_INIT_ROUTINE {
    public fun invoke()
}

public fun interface PTP_CLEANUP_GROUP_CANCEL_CALLBACK {
    public fun invoke(objectContext: Long, cleanupContext: Long)
}

public fun interface PTP_SIMPLE_CALLBACK {
    public fun invoke(instance: PTP_CALLBACK_INSTANCE, context: Long)
}

public fun interface PTP_TIMER_CALLBACK {
    public fun invoke(instance: PTP_CALLBACK_INSTANCE, context: Long, timer: PTP_TIMER)
}

public fun interface PTP_WAIT_CALLBACK {
    public fun invoke(instance: PTP_CALLBACK_INSTANCE, context: Long, wait: PTP_WAIT, waitResult: UInt)
}

public fun interface PTP_WIN32_IO_CALLBACK {
    public fun invoke(
        instance: PTP_CALLBACK_INSTANCE,
        context: Long,
        overlapped: Long,
        ioResult: UInt,
        numberOfBytesTransferred: Long,
        io: PTP_IO,
    )
}

public fun interface PTP_WORK_CALLBACK {
    public fun invoke(instance: PTP_CALLBACK_INSTANCE, context: Long, work: PTP_WORK)
}

public fun interface PTIMERAPCROUTINE {
    public fun invoke(lpArgToCompletionRoutine: Long, dwTimerLowValue: UInt, dwTimerHighValue: UInt)
}

public fun interface RTWQPERIODICCALLBACK {
    public fun invoke(context: Long)
}

public fun interface WAITORTIMERCALLBACK {
    public fun invoke(param0: Long, param1: Boolean)
}

public fun interface WORKERCALLBACKFUNC {
    public fun invoke(param0: Long)
}
