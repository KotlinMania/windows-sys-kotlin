package io.github.kotlinmania.windowssys.windows.win32.system.performance

import io.github.kotlinmania.windowssys.core.PCWSTR

public typealias AutoPathFormat = Int

public typealias ClockType = Int

public typealias CommitMode = Int

public fun interface CounterPathCallBackFn {
    public operator fun invoke(param0: ULong): Int
}

public typealias CounterPathCallBack = CounterPathCallBackFn?

public typealias DataCollectorSetStatus = Int

public typealias DataCollectorType = Int

public typealias DataManagerSteps = Int

public typealias DataSourceTypeConstants = Int

public typealias DisplayTypeConstants = Int

public typealias FileFormat = Int

public typealias FolderActionSteps = Int

public typealias PDH_DLL_VERSION = UInt

public typealias PDH_FMT = UInt

public typealias PDH_HCOUNTER = Long

public typealias PDH_HLOG = Long

public typealias PDH_HQUERY = Long

public typealias PDH_LOG = UInt

public typealias PDH_LOG_TYPE = UInt

public typealias PDH_PATH_FLAGS = UInt

public typealias PDH_SELECT_DATA_SOURCE_FLAGS = UInt

public fun interface PERFLIBREQUESTFn {
    public operator fun invoke(requestcode: UInt, buffer: Long, buffersize: UInt): UInt
}

public typealias PERFLIBREQUEST = PERFLIBREQUESTFn?

public typealias PERF_COUNTER_AGGREGATE_FUNC = UInt

public typealias PERF_DETAIL = UInt

public fun interface PERF_MEM_ALLOCFn {
    public operator fun invoke(allocsize: ULong, pcontext: Long): Long
}

public typealias PERF_MEM_ALLOC = PERF_MEM_ALLOCFn?

public fun interface PERF_MEM_FREEFn {
    public operator fun invoke(pbuffer: Long, pcontext: Long)
}

public typealias PERF_MEM_FREE = PERF_MEM_FREEFn?

public fun interface PLA_CABEXTRACT_CALLBACKFn {
    public operator fun invoke(filename: PCWSTR, context: Long)
}

public typealias PLA_CABEXTRACT_CALLBACK = PLA_CABEXTRACT_CALLBACKFn?

public fun interface PM_CLOSE_PROCFn {
    public operator fun invoke(): UInt
}

public typealias PM_CLOSE_PROC = PM_CLOSE_PROCFn?

public fun interface PM_COLLECT_PROCFn {
    public operator fun invoke(pvaluename: PCWSTR, ppdata: Long, pcbtotalbytes: Long, pnumobjecttypes: Long): UInt
}

public typealias PM_COLLECT_PROC = PM_COLLECT_PROCFn?

public fun interface PM_OPEN_PROCFn {
    public operator fun invoke(pcontext: PCWSTR): UInt
}

public typealias PM_OPEN_PROC = PM_OPEN_PROCFn?

public typealias PerfCounterDataType = Int

public typealias PerfRegInfoType = Int

public typealias REAL_TIME_DATA_SOURCE_ID_FLAGS = UInt

public typealias ReportValueTypeConstants = Int

public typealias ResourcePolicy = Int

public typealias StreamMode = Int

public typealias SysmonBatchReason = Int

public typealias SysmonDataType = Int

public typealias SysmonFileType = Int

public typealias ValueMapType = Int

public typealias WeekDays = Int
