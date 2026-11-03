@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public data class CLASSIC_EVENT_ID(
    public var EventGuid: GUID = GUID(),
    public var Type: UByte = 0u,
    public var Reserved: UByteArray = UByteArray(7),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CLASSIC_EVENT_ID) return false
        if (this.EventGuid != other.EventGuid) return false
        if (this.Type != other.Type) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.EventGuid.hashCode()
        result = 31 * result + this.Type.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class CONTROLTRACE_HANDLE(public var Value: ULong = 0uL)

public data class ENABLE_TRACE_PARAMETERS(
    public var Version: UInt = 0u,
    public var EnableProperty: UInt = 0u,
    public var ControlFlags: UInt = 0u,
    public var SourceId: GUID = GUID(),
    public var EnableFilterDesc: Long = 0L,
    public var FilterDescCount: UInt = 0u,
)

public data class ENABLE_TRACE_PARAMETERS_V1(
    public var Version: UInt = 0u,
    public var EnableProperty: UInt = 0u,
    public var ControlFlags: UInt = 0u,
    public var SourceId: GUID = GUID(),
    public var EnableFilterDesc: Long = 0L,
)

public data class ETW_BUFFER_CALLBACK_INFORMATION(
    public var TraceHandle: ULong = 0uL,
    public var LogfileHeader: Long = 0L,
    public var BuffersRead: UInt = 0u,
)

public data class ETW_BUFFER_CONTEXT(public var Anonymous: ETW_BUFFER_CONTEXT_0 = ETW_BUFFER_CONTEXT_0(), public var LoggerId: UShort = 0u)

public data class ETW_BUFFER_CONTEXT_0(public var Anonymous: ETW_BUFFER_CONTEXT_0_0 = ETW_BUFFER_CONTEXT_0_0(), public var ProcessorIndex: UShort = 0u)

public data class ETW_BUFFER_CONTEXT_0_0(public var ProcessorNumber: UByte = 0u, public var Alignment: UByte = 0u)

public data class ETW_BUFFER_HEADER(
    public var Reserved1: UIntArray = UIntArray(4),
    public var TimeStamp: Long = 0L,
    public var Reserved2: UIntArray = UIntArray(4),
    public var ClientContext: ETW_BUFFER_CONTEXT = ETW_BUFFER_CONTEXT(),
    public var Reserved3: UInt = 0u,
    public var FilledBytes: UInt = 0u,
    public var Reserved4: UIntArray = UIntArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ETW_BUFFER_HEADER) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        if (this.TimeStamp != other.TimeStamp) return false
        if (!this.Reserved2.contentEquals(other.Reserved2)) return false
        if (this.ClientContext != other.ClientContext) return false
        if (this.Reserved3 != other.Reserved3) return false
        if (this.FilledBytes != other.FilledBytes) return false
        if (!this.Reserved4.contentEquals(other.Reserved4)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Reserved1.contentHashCode()
        result = 31 * result + this.TimeStamp.hashCode()
        result = 31 * result + this.Reserved2.contentHashCode()
        result = 31 * result + this.ClientContext.hashCode()
        result = 31 * result + this.Reserved3.hashCode()
        result = 31 * result + this.FilledBytes.hashCode()
        result = 31 * result + this.Reserved4.contentHashCode()
        return result
    }
}

public data class ETW_OPEN_TRACE_OPTIONS(
    public var ProcessTraceModes: ETW_PROCESS_TRACE_MODES = 0,
    public var EventCallback: PEVENT_RECORD_CALLBACK = null,
    public var EventCallbackContext: Long = 0L,
    public var BufferCallback: PETW_BUFFER_CALLBACK = null,
    public var BufferCallbackContext: Long = 0L,
)

public data class ETW_PMC_COUNTER_OWNER(
    public var OwnerType: ETW_PMC_COUNTER_OWNER_TYPE = 0,
    public var ProfileSource: UInt = 0u,
    public var OwnerTag: UInt = 0u,
)

public data class ETW_PMC_COUNTER_OWNERSHIP_STATUS(
    public var ProcessorNumber: UInt = 0u,
    public var NumberOfCounters: UInt = 0u,
    public var CounterOwners: List<ETW_PMC_COUNTER_OWNER> = List(1) { ETW_PMC_COUNTER_OWNER() },
)

public data class ETW_PMC_SESSION_INFO(
    public var NextEntryOffset: UInt = 0u,
    public var LoggerId: UShort = 0u,
    public var Reserved: UShort = 0u,
    public var ProfileSourceCount: UInt = 0u,
    public var HookIdCount: UInt = 0u,
)

public data class ETW_TRACE_PARTITION_INFORMATION(
    public var PartitionId: GUID = GUID(),
    public var ParentId: GUID = GUID(),
    public var QpcOffsetFromRoot: Long = 0L,
    public var PartitionType: UInt = 0u,
)

public data class ETW_TRACE_PARTITION_INFORMATION_V2(
    public var QpcOffsetFromRoot: Long = 0L,
    public var PartitionType: UInt = 0u,
    public var PartitionId: PWSTR = 0L,
    public var ParentId: PWSTR = 0L,
)

public data class EVENT_DATA_DESCRIPTOR(
    public var Ptr: ULong = 0uL,
    public var Size: UInt = 0u,
    public var Anonymous: EVENT_DATA_DESCRIPTOR_0 = EVENT_DATA_DESCRIPTOR_0(),
)

public data class EVENT_DATA_DESCRIPTOR_0(public var Reserved: UInt = 0u, public var Anonymous: EVENT_DATA_DESCRIPTOR_0_0 = EVENT_DATA_DESCRIPTOR_0_0())

public data class EVENT_DATA_DESCRIPTOR_0_0(
    public var Type: UByte = 0u,
    public var Reserved1: UByte = 0u,
    public var Reserved2: UShort = 0u,
)

public data class EVENT_DESCRIPTOR(
    public var Id: UShort = 0u,
    public var Version: UByte = 0u,
    public var Channel: UByte = 0u,
    public var Level: UByte = 0u,
    public var Opcode: UByte = 0u,
    public var Task: UShort = 0u,
    public var Keyword: ULong = 0uL,
)

public data class EVENT_EXTENDED_ITEM_EVENT_KEY(public var Key: ULong = 0uL)

public data class EVENT_EXTENDED_ITEM_INSTANCE(
    public var InstanceId: UInt = 0u,
    public var ParentInstanceId: UInt = 0u,
    public var ParentGuid: GUID = GUID(),
)

public data class EVENT_EXTENDED_ITEM_PEBS_INDEX(public var PebsIndex: ULong = 0uL)

public data class EVENT_EXTENDED_ITEM_PMC_COUNTERS(public var Counter: ULongArray = ULongArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EVENT_EXTENDED_ITEM_PMC_COUNTERS) return false
        if (!this.Counter.contentEquals(other.Counter)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.Counter.contentHashCode()
    }
}

public data class EVENT_EXTENDED_ITEM_PROCESS_START_KEY(public var ProcessStartKey: ULong = 0uL)

public data class EVENT_EXTENDED_ITEM_RELATED_ACTIVITYID(public var RelatedActivityId: GUID = GUID())

public data class EVENT_EXTENDED_ITEM_STACK_KEY32(
    public var MatchId: ULong = 0uL,
    public var StackKey: UInt = 0u,
    public var Padding: UInt = 0u,
)

public data class EVENT_EXTENDED_ITEM_STACK_KEY64(public var MatchId: ULong = 0uL, public var StackKey: ULong = 0uL)

public data class EVENT_EXTENDED_ITEM_STACK_TRACE32(public var MatchId: ULong = 0uL, public var Address: UIntArray = UIntArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EVENT_EXTENDED_ITEM_STACK_TRACE32) return false
        if (this.MatchId != other.MatchId) return false
        if (!this.Address.contentEquals(other.Address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.MatchId.hashCode()
        result = 31 * result + this.Address.contentHashCode()
        return result
    }
}

public data class EVENT_EXTENDED_ITEM_STACK_TRACE64(public var MatchId: ULong = 0uL, public var Address: ULongArray = ULongArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EVENT_EXTENDED_ITEM_STACK_TRACE64) return false
        if (this.MatchId != other.MatchId) return false
        if (!this.Address.contentEquals(other.Address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.MatchId.hashCode()
        result = 31 * result + this.Address.contentHashCode()
        return result
    }
}

public data class EVENT_EXTENDED_ITEM_TS_ID(public var SessionId: UInt = 0u)

public data class EVENT_FILTER_DESCRIPTOR(
    public var Ptr: ULong = 0uL,
    public var Size: UInt = 0u,
    public var Type: UInt = 0u,
)

public data class EVENT_FILTER_EVENT_ID(
    public var FilterIn: Boolean = false,
    public var Reserved: UByte = 0u,
    public var Count: UShort = 0u,
    public var Events: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EVENT_FILTER_EVENT_ID) return false
        if (this.FilterIn != other.FilterIn) return false
        if (this.Reserved != other.Reserved) return false
        if (this.Count != other.Count) return false
        if (!this.Events.contentEquals(other.Events)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.FilterIn.hashCode()
        result = 31 * result + this.Reserved.hashCode()
        result = 31 * result + this.Count.hashCode()
        result = 31 * result + this.Events.contentHashCode()
        return result
    }
}

public data class EVENT_FILTER_EVENT_NAME(
    public var MatchAnyKeyword: ULong = 0uL,
    public var MatchAllKeyword: ULong = 0uL,
    public var Level: UByte = 0u,
    public var FilterIn: Boolean = false,
    public var NameCount: UShort = 0u,
    public var Names: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EVENT_FILTER_EVENT_NAME) return false
        if (this.MatchAnyKeyword != other.MatchAnyKeyword) return false
        if (this.MatchAllKeyword != other.MatchAllKeyword) return false
        if (this.Level != other.Level) return false
        if (this.FilterIn != other.FilterIn) return false
        if (this.NameCount != other.NameCount) return false
        if (!this.Names.contentEquals(other.Names)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.MatchAnyKeyword.hashCode()
        result = 31 * result + this.MatchAllKeyword.hashCode()
        result = 31 * result + this.Level.hashCode()
        result = 31 * result + this.FilterIn.hashCode()
        result = 31 * result + this.NameCount.hashCode()
        result = 31 * result + this.Names.contentHashCode()
        return result
    }
}

public data class EVENT_FILTER_HEADER(
    public var Id: UShort = 0u,
    public var Version: UByte = 0u,
    public var Reserved: UByteArray = UByteArray(5),
    public var InstanceId: ULong = 0uL,
    public var Size: UInt = 0u,
    public var NextOffset: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EVENT_FILTER_HEADER) return false
        if (this.Id != other.Id) return false
        if (this.Version != other.Version) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.InstanceId != other.InstanceId) return false
        if (this.Size != other.Size) return false
        if (this.NextOffset != other.NextOffset) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Id.hashCode()
        result = 31 * result + this.Version.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.InstanceId.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.NextOffset.hashCode()
        return result
    }
}

public data class EVENT_FILTER_LEVEL_KW(
    public var MatchAnyKeyword: ULong = 0uL,
    public var MatchAllKeyword: ULong = 0uL,
    public var Level: UByte = 0u,
    public var FilterIn: Boolean = false,
)

public data class EVENT_HEADER(
    public var Size: UShort = 0u,
    public var HeaderType: UShort = 0u,
    public var Flags: UShort = 0u,
    public var EventProperty: UShort = 0u,
    public var ThreadId: UInt = 0u,
    public var ProcessId: UInt = 0u,
    public var TimeStamp: Long = 0L,
    public var ProviderId: GUID = GUID(),
    public var EventDescriptor: EVENT_DESCRIPTOR = EVENT_DESCRIPTOR(),
    public var Anonymous: EVENT_HEADER_0 = EVENT_HEADER_0(),
    public var ActivityId: GUID = GUID(),
)

public data class EVENT_HEADER_0(public var Anonymous: EVENT_HEADER_0_0 = EVENT_HEADER_0_0(), public var ProcessorTime: ULong = 0uL)

public data class EVENT_HEADER_0_0(public var KernelTime: UInt = 0u, public var UserTime: UInt = 0u)

public data class EVENT_HEADER_EXTENDED_DATA_ITEM(
    public var Reserved1: UShort = 0u,
    public var ExtType: UShort = 0u,
    public var Anonymous: EVENT_HEADER_EXTENDED_DATA_ITEM_0 = EVENT_HEADER_EXTENDED_DATA_ITEM_0(),
    public var DataSize: UShort = 0u,
    public var DataPtr: ULong = 0uL,
)

public data class EVENT_HEADER_EXTENDED_DATA_ITEM_0(public var _bitfield: UShort = 0u)

public data class EVENT_INSTANCE_HEADER(
    public var Size: UShort = 0u,
    public var Anonymous1: EVENT_INSTANCE_HEADER_0 = EVENT_INSTANCE_HEADER_0(),
    public var Anonymous2: EVENT_INSTANCE_HEADER_1 = EVENT_INSTANCE_HEADER_1(),
    public var ThreadId: UInt = 0u,
    public var ProcessId: UInt = 0u,
    public var TimeStamp: Long = 0L,
    public var RegHandle: ULong = 0uL,
    public var InstanceId: UInt = 0u,
    public var ParentInstanceId: UInt = 0u,
    public var Anonymous3: EVENT_INSTANCE_HEADER_2 = EVENT_INSTANCE_HEADER_2(),
    public var ParentRegHandle: ULong = 0uL,
)

public data class EVENT_INSTANCE_HEADER_0(public var FieldTypeFlags: UShort = 0u, public var Anonymous: EVENT_INSTANCE_HEADER_0_0 = EVENT_INSTANCE_HEADER_0_0())

public data class EVENT_INSTANCE_HEADER_0_0(public var HeaderType: UByte = 0u, public var MarkerFlags: UByte = 0u)

public data class EVENT_INSTANCE_HEADER_1(public var Version: UInt = 0u, public var Class: EVENT_INSTANCE_HEADER_1_0 = EVENT_INSTANCE_HEADER_1_0())

public data class EVENT_INSTANCE_HEADER_1_0(
    public var Type: UByte = 0u,
    public var Level: UByte = 0u,
    public var Version: UShort = 0u,
)

public data class EVENT_INSTANCE_HEADER_2(
    public var Anonymous1: EVENT_INSTANCE_HEADER_2_0 = EVENT_INSTANCE_HEADER_2_0(),
    public var ProcessorTime: ULong = 0uL,
    public var Anonymous2: EVENT_INSTANCE_HEADER_2_1 = EVENT_INSTANCE_HEADER_2_1(),
)

public data class EVENT_INSTANCE_HEADER_2_0(public var KernelTime: UInt = 0u, public var UserTime: UInt = 0u)

public data class EVENT_INSTANCE_HEADER_2_1(public var EventId: UInt = 0u, public var Flags: UInt = 0u)

public data class EVENT_INSTANCE_INFO(public var RegHandle: Foundation.HANDLE = Foundation.HANDLE(), public var InstanceId: UInt = 0u)

public data class EVENT_MAP_ENTRY(public var OutputOffset: UInt = 0u, public var Anonymous: EVENT_MAP_ENTRY_0 = EVENT_MAP_ENTRY_0())

public data class EVENT_MAP_ENTRY_0(public var Value: UInt = 0u, public var InputOffset: UInt = 0u)

public data class EVENT_MAP_INFO(
    public var NameOffset: UInt = 0u,
    public var Flag: MAP_FLAGS = 0,
    public var EntryCount: UInt = 0u,
    public var Anonymous: EVENT_MAP_INFO_0 = EVENT_MAP_INFO_0(),
    public var MapEntryArray: List<EVENT_MAP_ENTRY> = List(1) { EVENT_MAP_ENTRY() },
)

public data class EVENT_MAP_INFO_0(public var MapEntryValueType: MAP_VALUETYPE = 0, public var FormatStringOffset: UInt = 0u)

public data class EVENT_PROPERTY_INFO(
    public var Flags: PROPERTY_FLAGS = 0,
    public var NameOffset: UInt = 0u,
    public var Anonymous1: EVENT_PROPERTY_INFO_0 = EVENT_PROPERTY_INFO_0(),
    public var Anonymous2: EVENT_PROPERTY_INFO_1 = EVENT_PROPERTY_INFO_1(),
    public var Anonymous3: EVENT_PROPERTY_INFO_2 = EVENT_PROPERTY_INFO_2(),
    public var Anonymous4: EVENT_PROPERTY_INFO_3 = EVENT_PROPERTY_INFO_3(),
)

public data class EVENT_PROPERTY_INFO_0(
    public var nonStructType: EVENT_PROPERTY_INFO_0_0 = EVENT_PROPERTY_INFO_0_0(),
    public var structType: EVENT_PROPERTY_INFO_0_1 = EVENT_PROPERTY_INFO_0_1(),
    public var customSchemaType: EVENT_PROPERTY_INFO_0_2 = EVENT_PROPERTY_INFO_0_2(),
)

public data class EVENT_PROPERTY_INFO_0_2(
    public var InType: UShort = 0u,
    public var OutType: UShort = 0u,
    public var CustomSchemaOffset: UInt = 0u,
)

public data class EVENT_PROPERTY_INFO_0_0(
    public var InType: UShort = 0u,
    public var OutType: UShort = 0u,
    public var MapNameOffset: UInt = 0u,
)

public data class EVENT_PROPERTY_INFO_0_1(
    public var StructStartIndex: UShort = 0u,
    public var NumOfStructMembers: UShort = 0u,
    public var padding: UInt = 0u,
)

public data class EVENT_PROPERTY_INFO_1(public var count: UShort = 0u, public var countPropertyIndex: UShort = 0u)

public data class EVENT_PROPERTY_INFO_2(public var length: UShort = 0u, public var lengthPropertyIndex: UShort = 0u)

public data class EVENT_PROPERTY_INFO_3(public var Reserved: UInt = 0u, public var Anonymous: EVENT_PROPERTY_INFO_3_0 = EVENT_PROPERTY_INFO_3_0())

public data class EVENT_PROPERTY_INFO_3_0(public var _bitfield: UInt = 0u)

public data class EVENT_RECORD(
    public var EventHeader: EVENT_HEADER = EVENT_HEADER(),
    public var BufferContext: ETW_BUFFER_CONTEXT = ETW_BUFFER_CONTEXT(),
    public var ExtendedDataCount: UShort = 0u,
    public var UserDataLength: UShort = 0u,
    public var ExtendedData: Long = 0L,
    public var UserData: Long = 0L,
    public var UserContext: Long = 0L,
)

public data class EVENT_TRACE(
    public var Header: EVENT_TRACE_HEADER = EVENT_TRACE_HEADER(),
    public var InstanceId: UInt = 0u,
    public var ParentInstanceId: UInt = 0u,
    public var ParentGuid: GUID = GUID(),
    public var MofData: Long = 0L,
    public var MofLength: UInt = 0u,
    public var Anonymous: EVENT_TRACE_0 = EVENT_TRACE_0(),
)

public data class EVENT_TRACE_0(public var ClientContext: UInt = 0u, public var BufferContext: ETW_BUFFER_CONTEXT = ETW_BUFFER_CONTEXT())

public data class EVENT_TRACE_HEADER(
    public var Size: UShort = 0u,
    public var Anonymous1: EVENT_TRACE_HEADER_0 = EVENT_TRACE_HEADER_0(),
    public var Anonymous2: EVENT_TRACE_HEADER_1 = EVENT_TRACE_HEADER_1(),
    public var ThreadId: UInt = 0u,
    public var ProcessId: UInt = 0u,
    public var TimeStamp: Long = 0L,
    public var Anonymous3: EVENT_TRACE_HEADER_2 = EVENT_TRACE_HEADER_2(),
    public var Anonymous4: EVENT_TRACE_HEADER_3 = EVENT_TRACE_HEADER_3(),
)

public data class EVENT_TRACE_HEADER_0(public var FieldTypeFlags: UShort = 0u, public var Anonymous: EVENT_TRACE_HEADER_0_0 = EVENT_TRACE_HEADER_0_0())

public data class EVENT_TRACE_HEADER_0_0(public var HeaderType: UByte = 0u, public var MarkerFlags: UByte = 0u)

public data class EVENT_TRACE_HEADER_1(public var Version: UInt = 0u, public var Class: EVENT_TRACE_HEADER_1_0 = EVENT_TRACE_HEADER_1_0())

public data class EVENT_TRACE_HEADER_1_0(
    public var Type: UByte = 0u,
    public var Level: UByte = 0u,
    public var Version: UShort = 0u,
)

public data class EVENT_TRACE_HEADER_2(public var Guid: GUID = GUID(), public var GuidPtr: ULong = 0uL)

public data class EVENT_TRACE_HEADER_3(
    public var Anonymous1: EVENT_TRACE_HEADER_3_0 = EVENT_TRACE_HEADER_3_0(),
    public var ProcessorTime: ULong = 0uL,
    public var Anonymous2: EVENT_TRACE_HEADER_3_1 = EVENT_TRACE_HEADER_3_1(),
)

public data class EVENT_TRACE_HEADER_3_0(public var KernelTime: UInt = 0u, public var UserTime: UInt = 0u)

public data class EVENT_TRACE_HEADER_3_1(public var ClientContext: UInt = 0u, public var Flags: UInt = 0u)

public data class EVENT_TRACE_LOGFILEA(
    public var LogFileName: PSTR = 0L,
    public var LoggerName: PSTR = 0L,
    public var CurrentTime: Long = 0L,
    public var BuffersRead: UInt = 0u,
    public var Anonymous1: EVENT_TRACE_LOGFILEA_0 = EVENT_TRACE_LOGFILEA_0(),
    public var CurrentEvent: EVENT_TRACE = EVENT_TRACE(),
    public var LogfileHeader: TRACE_LOGFILE_HEADER = TRACE_LOGFILE_HEADER(),
    public var BufferCallback: PEVENT_TRACE_BUFFER_CALLBACKA = null,
    public var BufferSize: UInt = 0u,
    public var Filled: UInt = 0u,
    public var EventsLost: UInt = 0u,
    public var Anonymous2: EVENT_TRACE_LOGFILEA_1 = EVENT_TRACE_LOGFILEA_1(),
    public var IsKernelTrace: UInt = 0u,
    public var Context: Long = 0L,
)

public data class EVENT_TRACE_LOGFILEA_0(public var LogFileMode: UInt = 0u, public var ProcessTraceMode: UInt = 0u)

public data class EVENT_TRACE_LOGFILEA_1(public var EventCallback: PEVENT_CALLBACK = null, public var EventRecordCallback: PEVENT_RECORD_CALLBACK = null)

public data class EVENT_TRACE_LOGFILEW(
    public var LogFileName: PWSTR = 0L,
    public var LoggerName: PWSTR = 0L,
    public var CurrentTime: Long = 0L,
    public var BuffersRead: UInt = 0u,
    public var Anonymous1: EVENT_TRACE_LOGFILEW_0 = EVENT_TRACE_LOGFILEW_0(),
    public var CurrentEvent: EVENT_TRACE = EVENT_TRACE(),
    public var LogfileHeader: TRACE_LOGFILE_HEADER = TRACE_LOGFILE_HEADER(),
    public var BufferCallback: PEVENT_TRACE_BUFFER_CALLBACKW = null,
    public var BufferSize: UInt = 0u,
    public var Filled: UInt = 0u,
    public var EventsLost: UInt = 0u,
    public var Anonymous2: EVENT_TRACE_LOGFILEW_1 = EVENT_TRACE_LOGFILEW_1(),
    public var IsKernelTrace: UInt = 0u,
    public var Context: Long = 0L,
)

public data class EVENT_TRACE_LOGFILEW_0(public var LogFileMode: UInt = 0u, public var ProcessTraceMode: UInt = 0u)

public data class EVENT_TRACE_LOGFILEW_1(public var EventCallback: PEVENT_CALLBACK = null, public var EventRecordCallback: PEVENT_RECORD_CALLBACK = null)

public class EVENT_TRACE_PROPERTIES(
    public var Wnode: WNODE_HEADER = WNODE_HEADER(),
    public var BufferSize: UInt = 0u,
    public var MinimumBuffers: UInt = 0u,
    public var MaximumBuffers: UInt = 0u,
    public var MaximumFileSize: UInt = 0u,
    public var LogFileMode: UInt = 0u,
    public var FlushTimer: UInt = 0u,
    public var EnableFlags: EVENT_TRACE_FLAG = 0u,
    public var Anonymous: EVENT_TRACE_PROPERTIES_0 = EVENT_TRACE_PROPERTIES_0(),
    public var NumberOfBuffers: UInt = 0u,
    public var FreeBuffers: UInt = 0u,
    public var EventsLost: UInt = 0u,
    public var BuffersWritten: UInt = 0u,
    public var LogBuffersLost: UInt = 0u,
    public var RealTimeBuffersLost: UInt = 0u,
    public var LoggerThreadId: Foundation.HANDLE = Foundation.HANDLE(),
    public var LogFileNameOffset: UInt = 0u,
    public var LoggerNameOffset: UInt = 0u,
)

public data class EVENT_TRACE_PROPERTIES_0(public var AgeLimit: Int = 0, public var FlushThreshold: Int = 0)

public class EVENT_TRACE_PROPERTIES_V2(
    public var Wnode: WNODE_HEADER = WNODE_HEADER(),
    public var BufferSize: UInt = 0u,
    public var MinimumBuffers: UInt = 0u,
    public var MaximumBuffers: UInt = 0u,
    public var MaximumFileSize: UInt = 0u,
    public var LogFileMode: UInt = 0u,
    public var FlushTimer: UInt = 0u,
    public var EnableFlags: EVENT_TRACE_FLAG = 0u,
    public var Anonymous1: EVENT_TRACE_PROPERTIES_V2_0 = EVENT_TRACE_PROPERTIES_V2_0(),
    public var NumberOfBuffers: UInt = 0u,
    public var FreeBuffers: UInt = 0u,
    public var EventsLost: UInt = 0u,
    public var BuffersWritten: UInt = 0u,
    public var LogBuffersLost: UInt = 0u,
    public var RealTimeBuffersLost: UInt = 0u,
    public var LoggerThreadId: Foundation.HANDLE = Foundation.HANDLE(),
    public var LogFileNameOffset: UInt = 0u,
    public var LoggerNameOffset: UInt = 0u,
    public var Anonymous2: EVENT_TRACE_PROPERTIES_V2_1 = EVENT_TRACE_PROPERTIES_V2_1(),
    public var FilterDescCount: UInt = 0u,
    public var FilterDesc: Long = 0L,
    public var Anonymous3: EVENT_TRACE_PROPERTIES_V2_2 = EVENT_TRACE_PROPERTIES_V2_2(),
)

public data class EVENT_TRACE_PROPERTIES_V2_0(public var AgeLimit: Int = 0, public var FlushThreshold: Int = 0)

public data class EVENT_TRACE_PROPERTIES_V2_1(public var Anonymous: EVENT_TRACE_PROPERTIES_V2_1_0 = EVENT_TRACE_PROPERTIES_V2_1_0(), public var V2Control: UInt = 0u)

public data class EVENT_TRACE_PROPERTIES_V2_1_0(public var _bitfield: UInt = 0u)

public data class EVENT_TRACE_PROPERTIES_V2_2(public var Anonymous: EVENT_TRACE_PROPERTIES_V2_2_0 = EVENT_TRACE_PROPERTIES_V2_2_0(), public var V2Options: ULong = 0uL)

public data class EVENT_TRACE_PROPERTIES_V2_2_0(public var _bitfield: UInt = 0u)

public data class MOF_FIELD(
    public var DataPtr: ULong = 0uL,
    public var Length: UInt = 0u,
    public var DataType: UInt = 0u,
)

public data class OFFSETINSTANCEDATAANDLENGTH(public var OffsetInstanceData: UInt = 0u, public var LengthInstanceData: UInt = 0u)

public data class PAYLOAD_FILTER_PREDICATE(
    public var FieldName: PWSTR = 0L,
    public var CompareOp: UShort = 0u,
    public var Value: PWSTR = 0L,
)

public data class PROCESSTRACE_HANDLE(public var Value: ULong = 0uL)

public data class PROFILE_SOURCE_INFO(
    public var NextEntryOffset: UInt = 0u,
    public var Source: UInt = 0u,
    public var MinInterval: UInt = 0u,
    public var MaxInterval: UInt = 0u,
    public var Reserved: ULong = 0uL,
    public var Description: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PROFILE_SOURCE_INFO) return false
        if (this.NextEntryOffset != other.NextEntryOffset) return false
        if (this.Source != other.Source) return false
        if (this.MinInterval != other.MinInterval) return false
        if (this.MaxInterval != other.MaxInterval) return false
        if (this.Reserved != other.Reserved) return false
        if (!this.Description.contentEquals(other.Description)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.NextEntryOffset.hashCode()
        result = 31 * result + this.Source.hashCode()
        result = 31 * result + this.MinInterval.hashCode()
        result = 31 * result + this.MaxInterval.hashCode()
        result = 31 * result + this.Reserved.hashCode()
        result = 31 * result + this.Description.contentHashCode()
        return result
    }
}

public data class PROPERTY_DATA_DESCRIPTOR(
    public var PropertyName: ULong = 0uL,
    public var ArrayIndex: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class PROVIDER_ENUMERATION_INFO(
    public var NumberOfProviders: UInt = 0u,
    public var Reserved: UInt = 0u,
    public var TraceProviderInfoArray: List<TRACE_PROVIDER_INFO> = List(1) { TRACE_PROVIDER_INFO() },
)

public data class PROVIDER_EVENT_INFO(
    public var NumberOfEvents: UInt = 0u,
    public var Reserved: UInt = 0u,
    public var EventDescriptorsArray: List<EVENT_DESCRIPTOR> = List(1) { EVENT_DESCRIPTOR() },
)

public data class PROVIDER_FIELD_INFO(
    public var NameOffset: UInt = 0u,
    public var DescriptionOffset: UInt = 0u,
    public var Value: ULong = 0uL,
)

public data class PROVIDER_FIELD_INFOARRAY(
    public var NumberOfElements: UInt = 0u,
    public var FieldType: EVENT_FIELD_TYPE = 0,
    public var FieldInfoArray: List<PROVIDER_FIELD_INFO> = List(1) { PROVIDER_FIELD_INFO() },
)

public data class PROVIDER_FILTER_INFO(
    public var Id: UByte = 0u,
    public var Version: UByte = 0u,
    public var MessageOffset: UInt = 0u,
    public var Reserved: UInt = 0u,
    public var PropertyCount: UInt = 0u,
    public var EventPropertyInfoArray: List<EVENT_PROPERTY_INFO> = List(1) { EVENT_PROPERTY_INFO() },
)

public data class RELOGSTREAM_HANDLE(public var Value: ULong = 0uL)

public data class TDH_CONTEXT(
    public var ParameterValue: ULong = 0uL,
    public var ParameterType: TDH_CONTEXT_TYPE = 0,
    public var ParameterSize: UInt = 0u,
)

public data class TRACE_ENABLE_INFO(
    public var IsEnabled: UInt = 0u,
    public var Level: UByte = 0u,
    public var Reserved1: UByte = 0u,
    public var LoggerId: UShort = 0u,
    public var EnableProperty: UInt = 0u,
    public var Reserved2: UInt = 0u,
    public var MatchAnyKeyword: ULong = 0uL,
    public var MatchAllKeyword: ULong = 0uL,
)

public class TRACE_EVENT_INFO(
    public var ProviderGuid: GUID = GUID(),
    public var EventGuid: GUID = GUID(),
    public var EventDescriptor: EVENT_DESCRIPTOR = EVENT_DESCRIPTOR(),
    public var DecodingSource: DECODING_SOURCE = 0,
    public var ProviderNameOffset: UInt = 0u,
    public var LevelNameOffset: UInt = 0u,
    public var ChannelNameOffset: UInt = 0u,
    public var KeywordsNameOffset: UInt = 0u,
    public var TaskNameOffset: UInt = 0u,
    public var OpcodeNameOffset: UInt = 0u,
    public var EventMessageOffset: UInt = 0u,
    public var ProviderMessageOffset: UInt = 0u,
    public var BinaryXMLOffset: UInt = 0u,
    public var BinaryXMLSize: UInt = 0u,
    public var Anonymous1: TRACE_EVENT_INFO_0 = TRACE_EVENT_INFO_0(),
    public var Anonymous2: TRACE_EVENT_INFO_1 = TRACE_EVENT_INFO_1(),
    public var PropertyCount: UInt = 0u,
    public var TopLevelPropertyCount: UInt = 0u,
    public var Anonymous3: TRACE_EVENT_INFO_2 = TRACE_EVENT_INFO_2(),
    public var EventPropertyInfoArray: List<EVENT_PROPERTY_INFO> = List(1) { EVENT_PROPERTY_INFO() },
)

public data class TRACE_EVENT_INFO_0(public var EventNameOffset: UInt = 0u, public var ActivityIDNameOffset: UInt = 0u)

public data class TRACE_EVENT_INFO_1(public var EventAttributesOffset: UInt = 0u, public var RelatedActivityIDNameOffset: UInt = 0u)

public data class TRACE_EVENT_INFO_2(public var Flags: TEMPLATE_FLAGS = 0, public var Anonymous: TRACE_EVENT_INFO_2_0 = TRACE_EVENT_INFO_2_0())

public data class TRACE_EVENT_INFO_2_0(public var _bitfield: UInt = 0u)

public data class TRACE_GUID_INFO(public var InstanceCount: UInt = 0u, public var Reserved: UInt = 0u)

public data class TRACE_GUID_PROPERTIES(
    public var Guid: GUID = GUID(),
    public var GuidType: UInt = 0u,
    public var LoggerId: UInt = 0u,
    public var EnableLevel: UInt = 0u,
    public var EnableFlags: UInt = 0u,
    public var IsEnable: Boolean = false,
)

public data class TRACE_GUID_REGISTRATION(public var Guid: Long = 0L, public var RegHandle: Foundation.HANDLE = Foundation.HANDLE())

public class TRACE_LOGFILE_HEADER(
    public var BufferSize: UInt = 0u,
    public var Anonymous1: TRACE_LOGFILE_HEADER_0 = TRACE_LOGFILE_HEADER_0(),
    public var ProviderVersion: UInt = 0u,
    public var NumberOfProcessors: UInt = 0u,
    public var EndTime: Long = 0L,
    public var TimerResolution: UInt = 0u,
    public var MaximumFileSize: UInt = 0u,
    public var LogFileMode: UInt = 0u,
    public var BuffersWritten: UInt = 0u,
    public var Anonymous2: TRACE_LOGFILE_HEADER_1 = TRACE_LOGFILE_HEADER_1(),
    public var LoggerName: PWSTR = 0L,
    public var LogFileName: PWSTR = 0L,
    public var TimeZone: Time.TIME_ZONE_INFORMATION = Time.TIME_ZONE_INFORMATION(),
    public var BootTime: Long = 0L,
    public var PerfFreq: Long = 0L,
    public var StartTime: Long = 0L,
    public var ReservedFlags: UInt = 0u,
    public var BuffersLost: UInt = 0u,
)

public data class TRACE_LOGFILE_HEADER_0(public var Version: UInt = 0u, public var VersionDetail: TRACE_LOGFILE_HEADER_0_0 = TRACE_LOGFILE_HEADER_0_0())

public data class TRACE_LOGFILE_HEADER_0_0(
    public var MajorVersion: UByte = 0u,
    public var MinorVersion: UByte = 0u,
    public var SubVersion: UByte = 0u,
    public var SubMinorVersion: UByte = 0u,
)

public data class TRACE_LOGFILE_HEADER_1(public var LogInstanceGuid: GUID = GUID(), public var Anonymous: TRACE_LOGFILE_HEADER_1_0 = TRACE_LOGFILE_HEADER_1_0())

public data class TRACE_LOGFILE_HEADER_1_0(
    public var StartBuffers: UInt = 0u,
    public var PointerSize: UInt = 0u,
    public var EventsLost: UInt = 0u,
    public var CpuSpeedInMHz: UInt = 0u,
)

public class TRACE_LOGFILE_HEADER32(
    public var BufferSize: UInt = 0u,
    public var Anonymous1: TRACE_LOGFILE_HEADER32_0 = TRACE_LOGFILE_HEADER32_0(),
    public var ProviderVersion: UInt = 0u,
    public var NumberOfProcessors: UInt = 0u,
    public var EndTime: Long = 0L,
    public var TimerResolution: UInt = 0u,
    public var MaximumFileSize: UInt = 0u,
    public var LogFileMode: UInt = 0u,
    public var BuffersWritten: UInt = 0u,
    public var Anonymous2: TRACE_LOGFILE_HEADER32_1 = TRACE_LOGFILE_HEADER32_1(),
    public var LoggerName: UInt = 0u,
    public var LogFileName: UInt = 0u,
    public var TimeZone: Time.TIME_ZONE_INFORMATION = Time.TIME_ZONE_INFORMATION(),
    public var BootTime: Long = 0L,
    public var PerfFreq: Long = 0L,
    public var StartTime: Long = 0L,
    public var ReservedFlags: UInt = 0u,
    public var BuffersLost: UInt = 0u,
)

public data class TRACE_LOGFILE_HEADER32_0(public var Version: UInt = 0u, public var VersionDetail: TRACE_LOGFILE_HEADER32_0_0 = TRACE_LOGFILE_HEADER32_0_0())

public data class TRACE_LOGFILE_HEADER32_0_0(
    public var MajorVersion: UByte = 0u,
    public var MinorVersion: UByte = 0u,
    public var SubVersion: UByte = 0u,
    public var SubMinorVersion: UByte = 0u,
)

public data class TRACE_LOGFILE_HEADER32_1(public var LogInstanceGuid: GUID = GUID(), public var Anonymous: TRACE_LOGFILE_HEADER32_1_0 = TRACE_LOGFILE_HEADER32_1_0())

public data class TRACE_LOGFILE_HEADER32_1_0(
    public var StartBuffers: UInt = 0u,
    public var PointerSize: UInt = 0u,
    public var EventsLost: UInt = 0u,
    public var CpuSpeedInMHz: UInt = 0u,
)

public class TRACE_LOGFILE_HEADER64(
    public var BufferSize: UInt = 0u,
    public var Anonymous1: TRACE_LOGFILE_HEADER64_0 = TRACE_LOGFILE_HEADER64_0(),
    public var ProviderVersion: UInt = 0u,
    public var NumberOfProcessors: UInt = 0u,
    public var EndTime: Long = 0L,
    public var TimerResolution: UInt = 0u,
    public var MaximumFileSize: UInt = 0u,
    public var LogFileMode: UInt = 0u,
    public var BuffersWritten: UInt = 0u,
    public var Anonymous2: TRACE_LOGFILE_HEADER64_1 = TRACE_LOGFILE_HEADER64_1(),
    public var LoggerName: ULong = 0uL,
    public var LogFileName: ULong = 0uL,
    public var TimeZone: Time.TIME_ZONE_INFORMATION = Time.TIME_ZONE_INFORMATION(),
    public var BootTime: Long = 0L,
    public var PerfFreq: Long = 0L,
    public var StartTime: Long = 0L,
    public var ReservedFlags: UInt = 0u,
    public var BuffersLost: UInt = 0u,
)

public data class TRACE_LOGFILE_HEADER64_0(public var Version: UInt = 0u, public var VersionDetail: TRACE_LOGFILE_HEADER64_0_0 = TRACE_LOGFILE_HEADER64_0_0())

public data class TRACE_LOGFILE_HEADER64_0_0(
    public var MajorVersion: UByte = 0u,
    public var MinorVersion: UByte = 0u,
    public var SubVersion: UByte = 0u,
    public var SubMinorVersion: UByte = 0u,
)

public data class TRACE_LOGFILE_HEADER64_1(public var LogInstanceGuid: GUID = GUID(), public var Anonymous: TRACE_LOGFILE_HEADER64_1_0 = TRACE_LOGFILE_HEADER64_1_0())

public data class TRACE_LOGFILE_HEADER64_1_0(
    public var StartBuffers: UInt = 0u,
    public var PointerSize: UInt = 0u,
    public var EventsLost: UInt = 0u,
    public var CpuSpeedInMHz: UInt = 0u,
)

public data class TRACE_PERIODIC_CAPTURE_STATE_INFO(
    public var CaptureStateFrequencyInSeconds: UInt = 0u,
    public var ProviderCount: UShort = 0u,
    public var Reserved: UShort = 0u,
)

public data class TRACE_PROFILE_INTERVAL(public var Source: UInt = 0u, public var Interval: UInt = 0u)

public data class TRACE_PROVIDER_INFO(
    public var ProviderGuid: GUID = GUID(),
    public var SchemaSource: UInt = 0u,
    public var ProviderNameOffset: UInt = 0u,
)

public data class TRACE_PROVIDER_INSTANCE_INFO(
    public var NextOffset: UInt = 0u,
    public var EnableCount: UInt = 0u,
    public var Pid: UInt = 0u,
    public var Flags: UInt = 0u,
)

public data class TRACE_STACK_CACHING_INFO(
    public var Enabled: Boolean = false,
    public var CacheSize: UInt = 0u,
    public var BucketCount: UInt = 0u,
)

public data class TRACE_VERSION_INFO(public var EtwTraceProcessingVersion: UInt = 0u, public var Reserved: UInt = 0u)

public data class WMIREGGUIDW(
    public var Guid: GUID = GUID(),
    public var Flags: UInt = 0u,
    public var InstanceCount: UInt = 0u,
    public var Anonymous: WMIREGGUIDW_0 = WMIREGGUIDW_0(),
)

public data class WMIREGGUIDW_0(
    public var InstanceNameList: UInt = 0u,
    public var BaseNameOffset: UInt = 0u,
    public var Pdo: ULong = 0uL,
    public var InstanceInfo: ULong = 0uL,
)

public data class WMIREGINFOW(
    public var BufferSize: UInt = 0u,
    public var NextWmiRegInfo: UInt = 0u,
    public var RegistryPath: UInt = 0u,
    public var MofResourceName: UInt = 0u,
    public var GuidCount: UInt = 0u,
    public var WmiRegGuid: List<WMIREGGUIDW> = List(1) { WMIREGGUIDW() },
)

public data class WNODE_ALL_DATA(
    public var WnodeHeader: WNODE_HEADER = WNODE_HEADER(),
    public var DataBlockOffset: UInt = 0u,
    public var InstanceCount: UInt = 0u,
    public var OffsetInstanceNameOffsets: UInt = 0u,
    public var Anonymous: WNODE_ALL_DATA_0 = WNODE_ALL_DATA_0(),
)

public data class WNODE_ALL_DATA_0(public var FixedInstanceSize: UInt = 0u, public var OffsetInstanceDataAndLength: List<OFFSETINSTANCEDATAANDLENGTH> = List(1) { OFFSETINSTANCEDATAANDLENGTH() })

public data class WNODE_EVENT_ITEM(public var WnodeHeader: WNODE_HEADER = WNODE_HEADER())

public data class WNODE_EVENT_REFERENCE(
    public var WnodeHeader: WNODE_HEADER = WNODE_HEADER(),
    public var TargetGuid: GUID = GUID(),
    public var TargetDataBlockSize: UInt = 0u,
    public var Anonymous: WNODE_EVENT_REFERENCE_0 = WNODE_EVENT_REFERENCE_0(),
)

public data class WNODE_EVENT_REFERENCE_0(public var TargetInstanceIndex: UInt = 0u, public var TargetInstanceName: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WNODE_EVENT_REFERENCE_0) return false
        if (this.TargetInstanceIndex != other.TargetInstanceIndex) return false
        if (!this.TargetInstanceName.contentEquals(other.TargetInstanceName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.TargetInstanceIndex.hashCode()
        result = 31 * result + this.TargetInstanceName.contentHashCode()
        return result
    }
}

public data class WNODE_HEADER(
    public var BufferSize: UInt = 0u,
    public var ProviderId: UInt = 0u,
    public var Anonymous1: WNODE_HEADER_0 = WNODE_HEADER_0(),
    public var Anonymous2: WNODE_HEADER_1 = WNODE_HEADER_1(),
    public var Guid: GUID = GUID(),
    public var ClientContext: UInt = 0u,
    public var Flags: UInt = 0u,
)

public data class WNODE_HEADER_0(public var HistoricalContext: ULong = 0uL, public var Anonymous: WNODE_HEADER_0_0 = WNODE_HEADER_0_0())

public data class WNODE_HEADER_0_0(public var Version: UInt = 0u, public var Linkage: UInt = 0u)

public data class WNODE_HEADER_1(
    public var CountLost: UInt = 0u,
    public var KernelHandle: Foundation.HANDLE = Foundation.HANDLE(),
    public var TimeStamp: Long = 0L,
)

public data class WNODE_METHOD_ITEM(
    public var WnodeHeader: WNODE_HEADER = WNODE_HEADER(),
    public var OffsetInstanceName: UInt = 0u,
    public var InstanceIndex: UInt = 0u,
    public var MethodId: UInt = 0u,
    public var DataBlockOffset: UInt = 0u,
    public var SizeDataBlock: UInt = 0u,
    public var VariableData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WNODE_METHOD_ITEM) return false
        if (this.WnodeHeader != other.WnodeHeader) return false
        if (this.OffsetInstanceName != other.OffsetInstanceName) return false
        if (this.InstanceIndex != other.InstanceIndex) return false
        if (this.MethodId != other.MethodId) return false
        if (this.DataBlockOffset != other.DataBlockOffset) return false
        if (this.SizeDataBlock != other.SizeDataBlock) return false
        if (!this.VariableData.contentEquals(other.VariableData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.WnodeHeader.hashCode()
        result = 31 * result + this.OffsetInstanceName.hashCode()
        result = 31 * result + this.InstanceIndex.hashCode()
        result = 31 * result + this.MethodId.hashCode()
        result = 31 * result + this.DataBlockOffset.hashCode()
        result = 31 * result + this.SizeDataBlock.hashCode()
        result = 31 * result + this.VariableData.contentHashCode()
        return result
    }
}

public data class WNODE_SINGLE_INSTANCE(
    public var WnodeHeader: WNODE_HEADER = WNODE_HEADER(),
    public var OffsetInstanceName: UInt = 0u,
    public var InstanceIndex: UInt = 0u,
    public var DataBlockOffset: UInt = 0u,
    public var SizeDataBlock: UInt = 0u,
    public var VariableData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WNODE_SINGLE_INSTANCE) return false
        if (this.WnodeHeader != other.WnodeHeader) return false
        if (this.OffsetInstanceName != other.OffsetInstanceName) return false
        if (this.InstanceIndex != other.InstanceIndex) return false
        if (this.DataBlockOffset != other.DataBlockOffset) return false
        if (this.SizeDataBlock != other.SizeDataBlock) return false
        if (!this.VariableData.contentEquals(other.VariableData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.WnodeHeader.hashCode()
        result = 31 * result + this.OffsetInstanceName.hashCode()
        result = 31 * result + this.InstanceIndex.hashCode()
        result = 31 * result + this.DataBlockOffset.hashCode()
        result = 31 * result + this.SizeDataBlock.hashCode()
        result = 31 * result + this.VariableData.contentHashCode()
        return result
    }
}

public data class WNODE_SINGLE_ITEM(
    public var WnodeHeader: WNODE_HEADER = WNODE_HEADER(),
    public var OffsetInstanceName: UInt = 0u,
    public var InstanceIndex: UInt = 0u,
    public var ItemId: UInt = 0u,
    public var DataBlockOffset: UInt = 0u,
    public var SizeDataItem: UInt = 0u,
    public var VariableData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WNODE_SINGLE_ITEM) return false
        if (this.WnodeHeader != other.WnodeHeader) return false
        if (this.OffsetInstanceName != other.OffsetInstanceName) return false
        if (this.InstanceIndex != other.InstanceIndex) return false
        if (this.ItemId != other.ItemId) return false
        if (this.DataBlockOffset != other.DataBlockOffset) return false
        if (this.SizeDataItem != other.SizeDataItem) return false
        if (!this.VariableData.contentEquals(other.VariableData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.WnodeHeader.hashCode()
        result = 31 * result + this.OffsetInstanceName.hashCode()
        result = 31 * result + this.InstanceIndex.hashCode()
        result = 31 * result + this.ItemId.hashCode()
        result = 31 * result + this.DataBlockOffset.hashCode()
        result = 31 * result + this.SizeDataItem.hashCode()
        result = 31 * result + this.VariableData.contentHashCode()
        return result
    }
}

public data class WNODE_TOO_SMALL(public var WnodeHeader: WNODE_HEADER = WNODE_HEADER(), public var SizeNeeded: UInt = 0u)
