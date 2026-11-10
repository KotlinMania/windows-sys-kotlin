package io.github.kotlinmania.windowssys.windows.win32.system.performance

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcwstr

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

public typealias PdhDllVersion = UInt

public typealias PdhFmt = UInt

public typealias PdhHcounter = COpaquePointer?

public typealias PdhHlog = COpaquePointer?

public typealias PdhHquery = COpaquePointer?

public typealias PdhLog = UInt

public typealias PdhLogType = UInt

public typealias PdhPathFlags = UInt

public typealias PdhSelectDataSourceFlags = UInt

public fun interface PerflibrequestFn {
    public operator fun invoke(requestcode: UInt, buffer: COpaquePointer?, buffersize: UInt): UInt
}

public typealias Perflibrequest = PerflibrequestFn?

public typealias PerfCounterAggregateFunc = UInt

public typealias PerfDetail = UInt

public fun interface PerfMemAllocFn {
    public operator fun invoke(allocsize: ULong, pcontext: COpaquePointer?): COpaquePointer?
}

public typealias PerfMemAlloc = PerfMemAllocFn?

public fun interface PerfMemFreeFn {
    public operator fun invoke(pbuffer: COpaquePointer?, pcontext: COpaquePointer?)
}

public typealias PerfMemFree = PerfMemFreeFn?

public fun interface PlaCabextractCallbackFn {
    public operator fun invoke(filename: Pcwstr, context: COpaquePointer?)
}

public typealias PlaCabextractCallback = PlaCabextractCallbackFn?

public fun interface PmCloseProcFn {
    public operator fun invoke(): UInt
}

public typealias PmCloseProc = PmCloseProcFn?

public fun interface PmCollectProcFn {
    public operator fun invoke(pvaluename: Pcwstr, ppdata: COpaquePointer?, pcbtotalbytes: COpaquePointer?, pnumobjecttypes: COpaquePointer?): UInt
}

public typealias PmCollectProc = PmCollectProcFn?

public fun interface PmOpenProcFn {
    public operator fun invoke(pcontext: Pcwstr): UInt
}

public typealias PmOpenProc = PmOpenProcFn?

public typealias PerfCounterDataType = Int

public typealias PerfRegInfoType = Int

public typealias RealTimeDataSourceIdFlags = UInt

public typealias ReportValueTypeConstants = Int

public typealias ResourcePolicy = Int

public typealias StreamMode = Int

public typealias SysmonBatchReason = Int

public typealias SysmonDataType = Int

public typealias SysmonFileType = Int

public typealias ValueMapType = Int

public typealias WeekDays = Int
