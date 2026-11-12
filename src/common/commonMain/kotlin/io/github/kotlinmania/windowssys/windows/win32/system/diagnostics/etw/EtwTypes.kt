package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid

public typealias DecodingSource = Int

public typealias EnablecallbackEnabledState = UInt

public typealias EtwCompressionResumptionMode = Int

public typealias EtwPmcCounterOwnerType = Int

public typealias EtwProcessHandleInfoType = Int

public typealias EtwProcessTraceModes = Int

public typealias EtwProviderTraitType = Int

public typealias Eventsecurityoperation = Int

public typealias EventFieldType = Int

public typealias EventInfoClass = Int

public typealias EventTraceControl = UInt

public typealias EventTraceFlag = UInt

public typealias MapFlags = Int

public typealias MapValuetype = Int

public typealias PayloadOperator = Int

public fun interface PenablecallbackFn {
    public operator fun invoke(sourceid: ConstPtr<Guid>, isenabled: EnablecallbackEnabledState, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, filterdata: ConstPtr<EventFilterDescriptor>, callbackcontext: MutPtr<CVoid>)
}

public typealias Penablecallback = PenablecallbackFn?

public fun interface PetwBufferCallbackFn {
    public operator fun invoke(buffer: ConstPtr<EtwBufferHeader>, buffersize: UInt, consumerinfo: ConstPtr<EtwBufferCallbackInformation>, callbackcontext: ConstPtr<CVoid>): Bool
}

public typealias PetwBufferCallback = PetwBufferCallbackFn?

public fun interface PetwBufferCompletionCallbackFn {
    public operator fun invoke(buffer: ConstPtr<EtwBufferHeader>, callbackcontext: ConstPtr<CVoid>)
}

public typealias PetwBufferCompletionCallback = PetwBufferCompletionCallbackFn?

public fun interface PeventCallbackFn {
    public operator fun invoke(pevent: MutPtr<EventTrace>)
}

public typealias PeventCallback = PeventCallbackFn?

public fun interface PeventRecordCallbackFn {
    public operator fun invoke(eventrecord: MutPtr<EventRecord>)
}

public typealias PeventRecordCallback = PeventRecordCallbackFn?

public fun interface PeventTraceBufferCallbackaFn {
    public operator fun invoke(logfile: MutPtr<EventTraceLogfilea>): UInt
}

public typealias PeventTraceBufferCallbacka = PeventTraceBufferCallbackaFn?

public fun interface PeventTraceBufferCallbackwFn {
    public operator fun invoke(logfile: MutPtr<EventTraceLogfilew>): UInt
}

public typealias PeventTraceBufferCallbackw = PeventTraceBufferCallbackwFn?

public typealias PropertyFlags = Int

public typealias Reghandle = Long

public typealias TdhContextType = Int

public typealias TdhHandle = Long

public typealias TemplateFlags = Int

public typealias TraceMessageFlags = UInt

public typealias TraceQueryInfoClass = Int

public fun interface WmidprequestFn {
    public operator fun invoke(requestcode: Wmidprequestcode, requestcontext: ConstPtr<CVoid>, buffersize: MutPtr<UInt>, buffer: MutPtr<CVoid>): UInt
}

public typealias Wmidprequest = WmidprequestFn?

public typealias Wmidprequestcode = Int

public typealias TdhInType = Int

public typealias TdhOutType = Int
