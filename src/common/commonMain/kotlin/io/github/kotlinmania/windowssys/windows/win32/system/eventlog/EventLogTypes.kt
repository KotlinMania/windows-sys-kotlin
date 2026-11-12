package io.github.kotlinmania.windowssys.windows.win32.system.eventlog

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr

public typealias EvtChannelClockType = Int

public typealias EvtChannelConfigPropertyId = Int

public typealias EvtChannelIsolationType = Int

public typealias EvtChannelReferenceFlags = UInt

public typealias EvtChannelSidType = Int

public typealias EvtChannelType = Int

public typealias EvtEventMetadataPropertyId = Int

public typealias EvtEventPropertyId = Int

public typealias EvtExportlogFlags = UInt

public typealias EvtFormatMessageFlags = UInt

public typealias EvtHandle = Long

public typealias EvtLoginClass = Int

public typealias EvtLogPropertyId = Int

public typealias EvtOpenLogFlags = UInt

public typealias EvtPublisherMetadataPropertyId = Int

public typealias EvtQueryFlags = UInt

public typealias EvtQueryPropertyId = Int

public typealias EvtRenderContextFlags = UInt

public typealias EvtRenderFlags = UInt

public typealias EvtRpcLoginFlags = UInt

public typealias EvtSeekFlags = UInt

public fun interface EvtSubscribeCallbackFn {
    public operator fun invoke(action: EvtSubscribeNotifyAction, usercontext: ConstPtr, event: EvtHandle): UInt
}

public typealias EvtSubscribeCallback = EvtSubscribeCallbackFn?

public typealias EvtSubscribeFlags = UInt

public typealias EvtSubscribeNotifyAction = Int

public typealias EvtSystemPropertyId = Int

public typealias EvtVariantType = Int

public typealias ReadEventLogReadFlags = UInt

public typealias ReportEventType = UShort
