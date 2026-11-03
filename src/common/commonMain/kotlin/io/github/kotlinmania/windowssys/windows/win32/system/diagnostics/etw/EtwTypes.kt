package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw

import io.github.kotlinmania.windowssys.core.BOOL

public typealias DECODING_SOURCE = Int

public typealias ENABLECALLBACK_ENABLED_STATE = UInt

public typealias ETW_COMPRESSION_RESUMPTION_MODE = Int

public typealias ETW_PMC_COUNTER_OWNER_TYPE = Int

public typealias ETW_PROCESS_HANDLE_INFO_TYPE = Int

public typealias ETW_PROCESS_TRACE_MODES = Int

public typealias ETW_PROVIDER_TRAIT_TYPE = Int

public typealias EVENTSECURITYOPERATION = Int

public typealias EVENT_FIELD_TYPE = Int

public typealias EVENT_INFO_CLASS = Int

public typealias EVENT_TRACE_CONTROL = UInt

public typealias EVENT_TRACE_FLAG = UInt

public typealias MAP_FLAGS = Int

public typealias MAP_VALUETYPE = Int

public typealias PAYLOAD_OPERATOR = Int

public fun interface PENABLECALLBACKFn {
    public operator fun invoke(sourceid: Long, isenabled: ENABLECALLBACK_ENABLED_STATE, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, filterdata: Long, callbackcontext: Long)
}

public typealias PENABLECALLBACK = PENABLECALLBACKFn?

public fun interface PETW_BUFFER_CALLBACKFn {
    public operator fun invoke(buffer: Long, buffersize: UInt, consumerinfo: Long, callbackcontext: Long): BOOL
}

public typealias PETW_BUFFER_CALLBACK = PETW_BUFFER_CALLBACKFn?

public fun interface PETW_BUFFER_COMPLETION_CALLBACKFn {
    public operator fun invoke(buffer: Long, callbackcontext: Long)
}

public typealias PETW_BUFFER_COMPLETION_CALLBACK = PETW_BUFFER_COMPLETION_CALLBACKFn?

public fun interface PEVENT_CALLBACKFn {
    public operator fun invoke(pevent: Long)
}

public typealias PEVENT_CALLBACK = PEVENT_CALLBACKFn?

public fun interface PEVENT_RECORD_CALLBACKFn {
    public operator fun invoke(eventrecord: Long)
}

public typealias PEVENT_RECORD_CALLBACK = PEVENT_RECORD_CALLBACKFn?

public fun interface PEVENT_TRACE_BUFFER_CALLBACKAFn {
    public operator fun invoke(logfile: Long): UInt
}

public typealias PEVENT_TRACE_BUFFER_CALLBACKA = PEVENT_TRACE_BUFFER_CALLBACKAFn?

public fun interface PEVENT_TRACE_BUFFER_CALLBACKWFn {
    public operator fun invoke(logfile: Long): UInt
}

public typealias PEVENT_TRACE_BUFFER_CALLBACKW = PEVENT_TRACE_BUFFER_CALLBACKWFn?

public typealias PROPERTY_FLAGS = Int

public typealias REGHANDLE = Long

public typealias TDH_CONTEXT_TYPE = Int

public typealias TDH_HANDLE = Long

public typealias TEMPLATE_FLAGS = Int

public typealias TRACE_MESSAGE_FLAGS = UInt

public typealias TRACE_QUERY_INFO_CLASS = Int

public fun interface WMIDPREQUESTFn {
    public operator fun invoke(requestcode: WMIDPREQUESTCODE, requestcontext: Long, buffersize: Long, buffer: Long): UInt
}

public typealias WMIDPREQUEST = WMIDPREQUESTFn?

public typealias WMIDPREQUESTCODE = Int

public typealias _TDH_IN_TYPE = Int

public typealias _TDH_OUT_TYPE = Int
