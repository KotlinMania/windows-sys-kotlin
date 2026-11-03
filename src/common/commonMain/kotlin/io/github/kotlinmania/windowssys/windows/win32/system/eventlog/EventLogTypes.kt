package io.github.kotlinmania.windowssys.windows.win32.system.eventlog

public typealias EVT_CHANNEL_CLOCK_TYPE = Int

public typealias EVT_CHANNEL_CONFIG_PROPERTY_ID = Int

public typealias EVT_CHANNEL_ISOLATION_TYPE = Int

public typealias EVT_CHANNEL_REFERENCE_FLAGS = UInt

public typealias EVT_CHANNEL_SID_TYPE = Int

public typealias EVT_CHANNEL_TYPE = Int

public typealias EVT_EVENT_METADATA_PROPERTY_ID = Int

public typealias EVT_EVENT_PROPERTY_ID = Int

public typealias EVT_EXPORTLOG_FLAGS = UInt

public typealias EVT_FORMAT_MESSAGE_FLAGS = UInt

public typealias EVT_HANDLE = Long

public typealias EVT_LOGIN_CLASS = Int

public typealias EVT_LOG_PROPERTY_ID = Int

public typealias EVT_OPEN_LOG_FLAGS = UInt

public typealias EVT_PUBLISHER_METADATA_PROPERTY_ID = Int

public typealias EVT_QUERY_FLAGS = UInt

public typealias EVT_QUERY_PROPERTY_ID = Int

public typealias EVT_RENDER_CONTEXT_FLAGS = UInt

public typealias EVT_RENDER_FLAGS = UInt

public typealias EVT_RPC_LOGIN_FLAGS = UInt

public typealias EVT_SEEK_FLAGS = UInt

public fun interface EVT_SUBSCRIBE_CALLBACKFn {
    public operator fun invoke(action: EVT_SUBSCRIBE_NOTIFY_ACTION, usercontext: Long, event: EVT_HANDLE): UInt
}

public typealias EVT_SUBSCRIBE_CALLBACK = EVT_SUBSCRIBE_CALLBACKFn?

public typealias EVT_SUBSCRIBE_FLAGS = UInt

public typealias EVT_SUBSCRIBE_NOTIFY_ACTION = Int

public typealias EVT_SYSTEM_PROPERTY_ID = Int

public typealias EVT_VARIANT_TYPE = Int

public typealias READ_EVENT_LOG_READ_FLAGS = UInt

public typealias REPORT_EVENT_TYPE = UShort
