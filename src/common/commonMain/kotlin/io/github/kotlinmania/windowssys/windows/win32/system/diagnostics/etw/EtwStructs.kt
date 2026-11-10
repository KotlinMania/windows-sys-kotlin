@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.time.TimeZoneInformation

public data class ClassicEventId(
    public var eventGuid: Guid = Guid(),
    public var type: UByte = 0u,
    public var reserved: UByteArray = UByteArray(7),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClassicEventId) return false
        if (this.eventGuid != other.eventGuid) return false
        if (this.type != other.type) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.eventGuid.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class ControltraceHandle(
    public var value: ULong = 0uL,
)

public data class EnableTraceParameters(
    public var version: UInt = 0u,
    public var enableProperty: UInt = 0u,
    public var controlFlags: UInt = 0u,
    public var sourceId: Guid = Guid(),
    public var enableFilterDesc: EventFilterDescriptor? = null,
    public var filterDescCount: UInt = 0u,
)

public data class EnableTraceParametersV1(
    public var version: UInt = 0u,
    public var enableProperty: UInt = 0u,
    public var controlFlags: UInt = 0u,
    public var sourceId: Guid = Guid(),
    public var enableFilterDesc: EventFilterDescriptor? = null,
)

public data class EtwBufferCallbackInformation(
    public var traceHandle: ULong = 0uL,
    public var logfileHeader: TraceLogfileHeader? = null,
    public var buffersRead: UInt = 0u,
)

public data class EtwBufferContext(
    public var anonymous: EtwBufferContext0 = EtwBufferContext0(),
    public var loggerId: UShort = 0u,
)

public data class EtwBufferContext0(
    public var anonymous: EtwBufferContext00 = EtwBufferContext00(),
    public var processorIndex: UShort = 0u,
)

public data class EtwBufferContext00(
    public var processorNumber: UByte = 0u,
    public var alignment: UByte = 0u,
)

public data class EtwBufferHeader(
    public var reserved1: UIntArray = UIntArray(4),
    public var timeStamp: Long = 0L,
    public var reserved2: UIntArray = UIntArray(4),
    public var clientContext: EtwBufferContext = EtwBufferContext(),
    public var reserved3: UInt = 0u,
    public var filledBytes: UInt = 0u,
    public var reserved4: UIntArray = UIntArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EtwBufferHeader) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.timeStamp != other.timeStamp) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        if (this.clientContext != other.clientContext) return false
        if (this.reserved3 != other.reserved3) return false
        if (this.filledBytes != other.filledBytes) return false
        if (!this.reserved4.contentEquals(other.reserved4)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved1.contentHashCode()
        result = 31 * result + this.timeStamp.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        result = 31 * result + this.clientContext.hashCode()
        result = 31 * result + this.reserved3.hashCode()
        result = 31 * result + this.filledBytes.hashCode()
        result = 31 * result + this.reserved4.contentHashCode()
        return result
    }
}

public data class EtwOpenTraceOptions(
    public var processTraceModes: EtwProcessTraceModes = 0,
    public var eventCallback: PeventRecordCallback = null,
    public var eventCallbackContext: COpaquePointer? = null,
    public var bufferCallback: PetwBufferCallback = null,
    public var bufferCallbackContext: COpaquePointer? = null,
)

public data class EtwPmcCounterOwner(
    public var ownerType: EtwPmcCounterOwnerType = 0,
    public var profileSource: UInt = 0u,
    public var ownerTag: UInt = 0u,
)

public data class EtwPmcCounterOwnershipStatus(
    public var processorNumber: UInt = 0u,
    public var numberOfCounters: UInt = 0u,
    public var counterOwners: List<EtwPmcCounterOwner> = List(1) { EtwPmcCounterOwner() },
)

public data class EtwPmcSessionInfo(
    public var nextEntryOffset: UInt = 0u,
    public var loggerId: UShort = 0u,
    public var reserved: UShort = 0u,
    public var profileSourceCount: UInt = 0u,
    public var hookIdCount: UInt = 0u,
)

public data class EtwTracePartitionInformation(
    public var partitionId: Guid = Guid(),
    public var parentId: Guid = Guid(),
    public var qpcOffsetFromRoot: Long = 0L,
    public var partitionType: UInt = 0u,
)

public data class EtwTracePartitionInformationV2(
    public var qpcOffsetFromRoot: Long = 0L,
    public var partitionType: UInt = 0u,
    public var partitionId: Pwstr = null,
    public var parentId: Pwstr = null,
)

public data class EventDataDescriptor(
    public var ptr: ULong = 0uL,
    public var size: UInt = 0u,
    public var anonymous: EventDataDescriptor0 = EventDataDescriptor0(),
)

public data class EventDataDescriptor0(
    public var reserved: UInt = 0u,
    public var anonymous: EventDataDescriptor00 = EventDataDescriptor00(),
)

public data class EventDataDescriptor00(
    public var type: UByte = 0u,
    public var reserved1: UByte = 0u,
    public var reserved2: UShort = 0u,
)

public data class EventDescriptor(
    public var id: UShort = 0u,
    public var version: UByte = 0u,
    public var channel: UByte = 0u,
    public var level: UByte = 0u,
    public var opcode: UByte = 0u,
    public var task: UShort = 0u,
    public var keyword: ULong = 0uL,
)

public data class EventExtendedItemEventKey(
    public var key: ULong = 0uL,
)

public data class EventExtendedItemInstance(
    public var instanceId: UInt = 0u,
    public var parentInstanceId: UInt = 0u,
    public var parentGuid: Guid = Guid(),
)

public data class EventExtendedItemPebsIndex(
    public var pebsIndex: ULong = 0uL,
)

public data class EventExtendedItemPmcCounters(
    public var counter: ULongArray = ULongArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EventExtendedItemPmcCounters) return false
        if (!this.counter.contentEquals(other.counter)) return false
        return true
    }

    override fun hashCode(): Int = this.counter.contentHashCode()
}

public data class EventExtendedItemProcessStartKey(
    public var processStartKey: ULong = 0uL,
)

public data class EventExtendedItemRelatedActivityid(
    public var relatedActivityId: Guid = Guid(),
)

public data class EventExtendedItemStackKey32(
    public var matchId: ULong = 0uL,
    public var stackKey: UInt = 0u,
    public var padding: UInt = 0u,
)

public data class EventExtendedItemStackKey64(
    public var matchId: ULong = 0uL,
    public var stackKey: ULong = 0uL,
)

public data class EventExtendedItemStackTrace32(
    public var matchId: ULong = 0uL,
    public var address: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EventExtendedItemStackTrace32) return false
        if (this.matchId != other.matchId) return false
        if (!this.address.contentEquals(other.address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.matchId.hashCode()
        result = 31 * result + this.address.contentHashCode()
        return result
    }
}

public data class EventExtendedItemStackTrace64(
    public var matchId: ULong = 0uL,
    public var address: ULongArray = ULongArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EventExtendedItemStackTrace64) return false
        if (this.matchId != other.matchId) return false
        if (!this.address.contentEquals(other.address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.matchId.hashCode()
        result = 31 * result + this.address.contentHashCode()
        return result
    }
}

public data class EventExtendedItemTsId(
    public var sessionId: UInt = 0u,
)

public data class EventFilterDescriptor(
    public var ptr: ULong = 0uL,
    public var size: UInt = 0u,
    public var type: UInt = 0u,
)

public data class EventFilterEventId(
    public var filterIn: Boolean = false,
    public var reserved: UByte = 0u,
    public var count: UShort = 0u,
    public var events: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EventFilterEventId) return false
        if (this.filterIn != other.filterIn) return false
        if (this.reserved != other.reserved) return false
        if (this.count != other.count) return false
        if (!this.events.contentEquals(other.events)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.filterIn.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.count.hashCode()
        result = 31 * result + this.events.contentHashCode()
        return result
    }
}

public data class EventFilterEventName(
    public var matchAnyKeyword: ULong = 0uL,
    public var matchAllKeyword: ULong = 0uL,
    public var level: UByte = 0u,
    public var filterIn: Boolean = false,
    public var nameCount: UShort = 0u,
    public var names: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EventFilterEventName) return false
        if (this.matchAnyKeyword != other.matchAnyKeyword) return false
        if (this.matchAllKeyword != other.matchAllKeyword) return false
        if (this.level != other.level) return false
        if (this.filterIn != other.filterIn) return false
        if (this.nameCount != other.nameCount) return false
        if (!this.names.contentEquals(other.names)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.matchAnyKeyword.hashCode()
        result = 31 * result + this.matchAllKeyword.hashCode()
        result = 31 * result + this.level.hashCode()
        result = 31 * result + this.filterIn.hashCode()
        result = 31 * result + this.nameCount.hashCode()
        result = 31 * result + this.names.contentHashCode()
        return result
    }
}

public data class EventFilterHeader(
    public var id: UShort = 0u,
    public var version: UByte = 0u,
    public var reserved: UByteArray = UByteArray(5),
    public var instanceId: ULong = 0uL,
    public var size: UInt = 0u,
    public var nextOffset: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EventFilterHeader) return false
        if (this.id != other.id) return false
        if (this.version != other.version) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.instanceId != other.instanceId) return false
        if (this.size != other.size) return false
        if (this.nextOffset != other.nextOffset) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.id.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.instanceId.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.nextOffset.hashCode()
        return result
    }
}

public data class EventFilterLevelKw(
    public var matchAnyKeyword: ULong = 0uL,
    public var matchAllKeyword: ULong = 0uL,
    public var level: UByte = 0u,
    public var filterIn: Boolean = false,
)

public data class EventHeader(
    public var size: UShort = 0u,
    public var headerType: UShort = 0u,
    public var flags: UShort = 0u,
    public var eventProperty: UShort = 0u,
    public var threadId: UInt = 0u,
    public var processId: UInt = 0u,
    public var timeStamp: Long = 0L,
    public var providerId: Guid = Guid(),
    public var eventDescriptor: EventDescriptor = EventDescriptor(),
    public var anonymous: EventHeader0 = EventHeader0(),
    public var activityId: Guid = Guid(),
)

public data class EventHeader0(
    public var anonymous: EventHeader00 = EventHeader00(),
    public var processorTime: ULong = 0uL,
)

public data class EventHeader00(
    public var kernelTime: UInt = 0u,
    public var userTime: UInt = 0u,
)

public data class EventHeaderExtendedDataItem(
    public var reserved1: UShort = 0u,
    public var extType: UShort = 0u,
    public var anonymous: EventHeaderExtendedDataItem0 = EventHeaderExtendedDataItem0(),
    public var dataSize: UShort = 0u,
    public var dataPtr: ULong = 0uL,
)

public data class EventHeaderExtendedDataItem0(
    public var bitfield: UShort = 0u,
)

public data class EventInstanceHeader(
    public var size: UShort = 0u,
    public var anonymous1: EventInstanceHeader0 = EventInstanceHeader0(),
    public var anonymous2: EventInstanceHeader1 = EventInstanceHeader1(),
    public var threadId: UInt = 0u,
    public var processId: UInt = 0u,
    public var timeStamp: Long = 0L,
    public var regHandle: ULong = 0uL,
    public var instanceId: UInt = 0u,
    public var parentInstanceId: UInt = 0u,
    public var anonymous3: EventInstanceHeader2 = EventInstanceHeader2(),
    public var parentRegHandle: ULong = 0uL,
)

public data class EventInstanceHeader0(
    public var fieldTypeFlags: UShort = 0u,
    public var anonymous: EventInstanceHeader00 = EventInstanceHeader00(),
)

public data class EventInstanceHeader00(
    public var headerType: UByte = 0u,
    public var markerFlags: UByte = 0u,
)

public data class EventInstanceHeader1(
    public var version: UInt = 0u,
    public var cls: EventInstanceHeader10 = EventInstanceHeader10(),
)

public data class EventInstanceHeader10(
    public var type: UByte = 0u,
    public var level: UByte = 0u,
    public var version: UShort = 0u,
)

public data class EventInstanceHeader2(
    public var anonymous1: EventInstanceHeader20 = EventInstanceHeader20(),
    public var processorTime: ULong = 0uL,
    public var anonymous2: EventInstanceHeader21 = EventInstanceHeader21(),
)

public data class EventInstanceHeader20(
    public var kernelTime: UInt = 0u,
    public var userTime: UInt = 0u,
)

public data class EventInstanceHeader21(
    public var eventId: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class EventInstanceInfo(
    public var regHandle: Handle = null,
    public var instanceId: UInt = 0u,
)

public data class EventMapEntry(
    public var outputOffset: UInt = 0u,
    public var anonymous: EventMapEntry0 = EventMapEntry0(),
)

public data class EventMapEntry0(
    public var value: UInt = 0u,
    public var inputOffset: UInt = 0u,
)

public data class EventMapInfo(
    public var nameOffset: UInt = 0u,
    public var flag: MapFlags = 0,
    public var entryCount: UInt = 0u,
    public var anonymous: EventMapInfo0 = EventMapInfo0(),
    public var mapEntryArray: List<EventMapEntry> = List(1) { EventMapEntry() },
)

public data class EventMapInfo0(
    public var mapEntryValueType: MapValuetype = 0,
    public var formatStringOffset: UInt = 0u,
)

public data class EventPropertyInfo(
    public var flags: PropertyFlags = 0,
    public var nameOffset: UInt = 0u,
    public var anonymous1: EventPropertyInfo0 = EventPropertyInfo0(),
    public var anonymous2: EventPropertyInfo1 = EventPropertyInfo1(),
    public var anonymous3: EventPropertyInfo2 = EventPropertyInfo2(),
    public var anonymous4: EventPropertyInfo3 = EventPropertyInfo3(),
)

public data class EventPropertyInfo0(
    public var nonStructType: EventPropertyInfo00 = EventPropertyInfo00(),
    public var structType: EventPropertyInfo01 = EventPropertyInfo01(),
    public var customSchemaType: EventPropertyInfo02 = EventPropertyInfo02(),
)

public data class EventPropertyInfo02(
    public var inType: UShort = 0u,
    public var outType: UShort = 0u,
    public var customSchemaOffset: UInt = 0u,
)

public data class EventPropertyInfo00(
    public var inType: UShort = 0u,
    public var outType: UShort = 0u,
    public var mapNameOffset: UInt = 0u,
)

public data class EventPropertyInfo01(
    public var structStartIndex: UShort = 0u,
    public var numOfStructMembers: UShort = 0u,
    public var padding: UInt = 0u,
)

public data class EventPropertyInfo1(
    public var count: UShort = 0u,
    public var countPropertyIndex: UShort = 0u,
)

public data class EventPropertyInfo2(
    public var length: UShort = 0u,
    public var lengthPropertyIndex: UShort = 0u,
)

public data class EventPropertyInfo3(
    public var reserved: UInt = 0u,
    public var anonymous: EventPropertyInfo30 = EventPropertyInfo30(),
)

public data class EventPropertyInfo30(
    public var bitfield: UInt = 0u,
)

public data class EventRecord(
    public var eventHeader: EventHeader = EventHeader(),
    public var bufferContext: EtwBufferContext = EtwBufferContext(),
    public var extendedDataCount: UShort = 0u,
    public var userDataLength: UShort = 0u,
    public var extendedData: EventHeaderExtendedDataItem? = null,
    public var userData: COpaquePointer? = null,
    public var userContext: COpaquePointer? = null,
)

public data class EventTrace(
    public var header: EventTraceHeader = EventTraceHeader(),
    public var instanceId: UInt = 0u,
    public var parentInstanceId: UInt = 0u,
    public var parentGuid: Guid = Guid(),
    public var mofData: COpaquePointer? = null,
    public var mofLength: UInt = 0u,
    public var anonymous: EventTrace0 = EventTrace0(),
)

public data class EventTrace0(
    public var clientContext: UInt = 0u,
    public var bufferContext: EtwBufferContext = EtwBufferContext(),
)

public data class EventTraceHeader(
    public var size: UShort = 0u,
    public var anonymous1: EventTraceHeader0 = EventTraceHeader0(),
    public var anonymous2: EventTraceHeader1 = EventTraceHeader1(),
    public var threadId: UInt = 0u,
    public var processId: UInt = 0u,
    public var timeStamp: Long = 0L,
    public var anonymous3: EventTraceHeader2 = EventTraceHeader2(),
    public var anonymous4: EventTraceHeader3 = EventTraceHeader3(),
)

public data class EventTraceHeader0(
    public var fieldTypeFlags: UShort = 0u,
    public var anonymous: EventTraceHeader00 = EventTraceHeader00(),
)

public data class EventTraceHeader00(
    public var headerType: UByte = 0u,
    public var markerFlags: UByte = 0u,
)

public data class EventTraceHeader1(
    public var version: UInt = 0u,
    public var cls: EventTraceHeader10 = EventTraceHeader10(),
)

public data class EventTraceHeader10(
    public var type: UByte = 0u,
    public var level: UByte = 0u,
    public var version: UShort = 0u,
)

public data class EventTraceHeader2(
    public var guid: Guid = Guid(),
    public var guidPtr: ULong = 0uL,
)

public data class EventTraceHeader3(
    public var anonymous1: EventTraceHeader30 = EventTraceHeader30(),
    public var processorTime: ULong = 0uL,
    public var anonymous2: EventTraceHeader31 = EventTraceHeader31(),
)

public data class EventTraceHeader30(
    public var kernelTime: UInt = 0u,
    public var userTime: UInt = 0u,
)

public data class EventTraceHeader31(
    public var clientContext: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class EventTraceLogfilea(
    public var logFileName: Pstr = null,
    public var loggerName: Pstr = null,
    public var currentTime: Long = 0L,
    public var buffersRead: UInt = 0u,
    public var anonymous1: EventTraceLogfilea0 = EventTraceLogfilea0(),
    public var currentEvent: EventTrace = EventTrace(),
    public var logfileHeader: TraceLogfileHeader = TraceLogfileHeader(),
    public var bufferCallback: PeventTraceBufferCallbacka = null,
    public var bufferSize: UInt = 0u,
    public var filled: UInt = 0u,
    public var eventsLost: UInt = 0u,
    public var anonymous2: EventTraceLogfilea1 = EventTraceLogfilea1(),
    public var isKernelTrace: UInt = 0u,
    public var context: COpaquePointer? = null,
)

public data class EventTraceLogfilea0(
    public var logFileMode: UInt = 0u,
    public var processTraceMode: UInt = 0u,
)

public data class EventTraceLogfilea1(
    public var eventCallback: PeventCallback = null,
    public var eventRecordCallback: PeventRecordCallback = null,
)

public data class EventTraceLogfilew(
    public var logFileName: Pwstr = null,
    public var loggerName: Pwstr = null,
    public var currentTime: Long = 0L,
    public var buffersRead: UInt = 0u,
    public var anonymous1: EventTraceLogfilew0 = EventTraceLogfilew0(),
    public var currentEvent: EventTrace = EventTrace(),
    public var logfileHeader: TraceLogfileHeader = TraceLogfileHeader(),
    public var bufferCallback: PeventTraceBufferCallbackw = null,
    public var bufferSize: UInt = 0u,
    public var filled: UInt = 0u,
    public var eventsLost: UInt = 0u,
    public var anonymous2: EventTraceLogfilew1 = EventTraceLogfilew1(),
    public var isKernelTrace: UInt = 0u,
    public var context: COpaquePointer? = null,
)

public data class EventTraceLogfilew0(
    public var logFileMode: UInt = 0u,
    public var processTraceMode: UInt = 0u,
)

public data class EventTraceLogfilew1(
    public var eventCallback: PeventCallback = null,
    public var eventRecordCallback: PeventRecordCallback = null,
)

public class EventTraceProperties(
    public var wnode: WnodeHeader = WnodeHeader(),
    public var bufferSize: UInt = 0u,
    public var minimumBuffers: UInt = 0u,
    public var maximumBuffers: UInt = 0u,
    public var maximumFileSize: UInt = 0u,
    public var logFileMode: UInt = 0u,
    public var flushTimer: UInt = 0u,
    public var enableFlags: EventTraceFlag = 0u,
    public var anonymous: EventTraceProperties0 = EventTraceProperties0(),
    public var numberOfBuffers: UInt = 0u,
    public var freeBuffers: UInt = 0u,
    public var eventsLost: UInt = 0u,
    public var buffersWritten: UInt = 0u,
    public var logBuffersLost: UInt = 0u,
    public var realTimeBuffersLost: UInt = 0u,
    public var loggerThreadId: Handle = null,
    public var logFileNameOffset: UInt = 0u,
    public var loggerNameOffset: UInt = 0u,
)

public data class EventTraceProperties0(
    public var ageLimit: Int = 0,
    public var flushThreshold: Int = 0,
)

public class EventTracePropertiesV2(
    public var wnode: WnodeHeader = WnodeHeader(),
    public var bufferSize: UInt = 0u,
    public var minimumBuffers: UInt = 0u,
    public var maximumBuffers: UInt = 0u,
    public var maximumFileSize: UInt = 0u,
    public var logFileMode: UInt = 0u,
    public var flushTimer: UInt = 0u,
    public var enableFlags: EventTraceFlag = 0u,
    public var anonymous1: EventTracePropertiesV20 = EventTracePropertiesV20(),
    public var numberOfBuffers: UInt = 0u,
    public var freeBuffers: UInt = 0u,
    public var eventsLost: UInt = 0u,
    public var buffersWritten: UInt = 0u,
    public var logBuffersLost: UInt = 0u,
    public var realTimeBuffersLost: UInt = 0u,
    public var loggerThreadId: Handle = null,
    public var logFileNameOffset: UInt = 0u,
    public var loggerNameOffset: UInt = 0u,
    public var anonymous2: EventTracePropertiesV21 = EventTracePropertiesV21(),
    public var filterDescCount: UInt = 0u,
    public var filterDesc: EventFilterDescriptor? = null,
    public var anonymous3: EventTracePropertiesV22 = EventTracePropertiesV22(),
)

public data class EventTracePropertiesV20(
    public var ageLimit: Int = 0,
    public var flushThreshold: Int = 0,
)

public data class EventTracePropertiesV21(
    public var anonymous: EventTracePropertiesV210 = EventTracePropertiesV210(),
    public var v2Control: UInt = 0u,
)

public data class EventTracePropertiesV210(
    public var bitfield: UInt = 0u,
)

public data class EventTracePropertiesV22(
    public var anonymous: EventTracePropertiesV220 = EventTracePropertiesV220(),
    public var v2Options: ULong = 0uL,
)

public data class EventTracePropertiesV220(
    public var bitfield: UInt = 0u,
)

public data class MofField(
    public var dataPtr: ULong = 0uL,
    public var length: UInt = 0u,
    public var dataType: UInt = 0u,
)

public data class Offsetinstancedataandlength(
    public var offsetInstanceData: UInt = 0u,
    public var lengthInstanceData: UInt = 0u,
)

public data class PayloadFilterPredicate(
    public var fieldName: Pwstr = null,
    public var compareOp: UShort = 0u,
    public var value: Pwstr = null,
)

public data class ProcesstraceHandle(
    public var value: ULong = 0uL,
)

public data class ProfileSourceInfo(
    public var nextEntryOffset: UInt = 0u,
    public var source: UInt = 0u,
    public var minInterval: UInt = 0u,
    public var maxInterval: UInt = 0u,
    public var reserved: ULong = 0uL,
    public var description: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProfileSourceInfo) return false
        if (this.nextEntryOffset != other.nextEntryOffset) return false
        if (this.source != other.source) return false
        if (this.minInterval != other.minInterval) return false
        if (this.maxInterval != other.maxInterval) return false
        if (this.reserved != other.reserved) return false
        if (!this.description.contentEquals(other.description)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nextEntryOffset.hashCode()
        result = 31 * result + this.source.hashCode()
        result = 31 * result + this.minInterval.hashCode()
        result = 31 * result + this.maxInterval.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.description.contentHashCode()
        return result
    }
}

public data class PropertyDataDescriptor(
    public var propertyName: ULong = 0uL,
    public var arrayIndex: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class ProviderEnumerationInfo(
    public var numberOfProviders: UInt = 0u,
    public var reserved: UInt = 0u,
    public var traceProviderInfoArray: List<TraceProviderInfo> = List(1) { TraceProviderInfo() },
)

public data class ProviderEventInfo(
    public var numberOfEvents: UInt = 0u,
    public var reserved: UInt = 0u,
    public var eventDescriptorsArray: List<EventDescriptor> = List(1) { EventDescriptor() },
)

public data class ProviderFieldInfo(
    public var nameOffset: UInt = 0u,
    public var descriptionOffset: UInt = 0u,
    public var value: ULong = 0uL,
)

public data class ProviderFieldInfoarray(
    public var numberOfElements: UInt = 0u,
    public var fieldType: EventFieldType = 0,
    public var fieldInfoArray: List<ProviderFieldInfo> = List(1) { ProviderFieldInfo() },
)

public data class ProviderFilterInfo(
    public var id: UByte = 0u,
    public var version: UByte = 0u,
    public var messageOffset: UInt = 0u,
    public var reserved: UInt = 0u,
    public var propertyCount: UInt = 0u,
    public var eventPropertyInfoArray: List<EventPropertyInfo> = List(1) { EventPropertyInfo() },
)

public data class RelogstreamHandle(
    public var value: ULong = 0uL,
)

public data class TdhContext(
    public var parameterValue: ULong = 0uL,
    public var parameterType: TdhContextType = 0,
    public var parameterSize: UInt = 0u,
)

public data class TraceEnableInfo(
    public var isEnabled: UInt = 0u,
    public var level: UByte = 0u,
    public var reserved1: UByte = 0u,
    public var loggerId: UShort = 0u,
    public var enableProperty: UInt = 0u,
    public var reserved2: UInt = 0u,
    public var matchAnyKeyword: ULong = 0uL,
    public var matchAllKeyword: ULong = 0uL,
)

public class TraceEventInfo(
    public var providerGuid: Guid = Guid(),
    public var eventGuid: Guid = Guid(),
    public var eventDescriptor: EventDescriptor = EventDescriptor(),
    public var decodingSource: DecodingSource = 0,
    public var providerNameOffset: UInt = 0u,
    public var levelNameOffset: UInt = 0u,
    public var channelNameOffset: UInt = 0u,
    public var keywordsNameOffset: UInt = 0u,
    public var taskNameOffset: UInt = 0u,
    public var opcodeNameOffset: UInt = 0u,
    public var eventMessageOffset: UInt = 0u,
    public var providerMessageOffset: UInt = 0u,
    public var binaryXMLOffset: UInt = 0u,
    public var binaryXMLSize: UInt = 0u,
    public var anonymous1: TraceEventInfo0 = TraceEventInfo0(),
    public var anonymous2: TraceEventInfo1 = TraceEventInfo1(),
    public var propertyCount: UInt = 0u,
    public var topLevelPropertyCount: UInt = 0u,
    public var anonymous3: TraceEventInfo2 = TraceEventInfo2(),
    public var eventPropertyInfoArray: List<EventPropertyInfo> = List(1) { EventPropertyInfo() },
)

public data class TraceEventInfo0(
    public var eventNameOffset: UInt = 0u,
    public var activityIDNameOffset: UInt = 0u,
)

public data class TraceEventInfo1(
    public var eventAttributesOffset: UInt = 0u,
    public var relatedActivityIDNameOffset: UInt = 0u,
)

public data class TraceEventInfo2(
    public var flags: TemplateFlags = 0,
    public var anonymous: TraceEventInfo20 = TraceEventInfo20(),
)

public data class TraceEventInfo20(
    public var bitfield: UInt = 0u,
)

public data class TraceGuidInfo(
    public var instanceCount: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class TraceGuidProperties(
    public var guid: Guid = Guid(),
    public var guidType: UInt = 0u,
    public var loggerId: UInt = 0u,
    public var enableLevel: UInt = 0u,
    public var enableFlags: UInt = 0u,
    public var isEnable: Boolean = false,
)

public data class TraceGuidRegistration(
    public var guid: Guid? = null,
    public var regHandle: Handle = null,
)

public class TraceLogfileHeader(
    public var bufferSize: UInt = 0u,
    public var anonymous1: TraceLogfileHeader0 = TraceLogfileHeader0(),
    public var providerVersion: UInt = 0u,
    public var numberOfProcessors: UInt = 0u,
    public var endTime: Long = 0L,
    public var timerResolution: UInt = 0u,
    public var maximumFileSize: UInt = 0u,
    public var logFileMode: UInt = 0u,
    public var buffersWritten: UInt = 0u,
    public var anonymous2: TraceLogfileHeader1 = TraceLogfileHeader1(),
    public var loggerName: Pwstr = null,
    public var logFileName: Pwstr = null,
    public var timeZone: TimeZoneInformation = TimeZoneInformation(),
    public var bootTime: Long = 0L,
    public var perfFreq: Long = 0L,
    public var startTime: Long = 0L,
    public var reservedFlags: UInt = 0u,
    public var buffersLost: UInt = 0u,
)

public data class TraceLogfileHeader0(
    public var version: UInt = 0u,
    public var versionDetail: TraceLogfileHeader00 = TraceLogfileHeader00(),
)

public data class TraceLogfileHeader00(
    public var majorVersion: UByte = 0u,
    public var minorVersion: UByte = 0u,
    public var subVersion: UByte = 0u,
    public var subMinorVersion: UByte = 0u,
)

public data class TraceLogfileHeader1(
    public var logInstanceGuid: Guid = Guid(),
    public var anonymous: TraceLogfileHeader10 = TraceLogfileHeader10(),
)

public data class TraceLogfileHeader10(
    public var startBuffers: UInt = 0u,
    public var pointerSize: UInt = 0u,
    public var eventsLost: UInt = 0u,
    public var cpuSpeedInMHz: UInt = 0u,
)

public class TraceLogfileHeader32(
    public var bufferSize: UInt = 0u,
    public var anonymous1: TraceLogfileHeader320 = TraceLogfileHeader320(),
    public var providerVersion: UInt = 0u,
    public var numberOfProcessors: UInt = 0u,
    public var endTime: Long = 0L,
    public var timerResolution: UInt = 0u,
    public var maximumFileSize: UInt = 0u,
    public var logFileMode: UInt = 0u,
    public var buffersWritten: UInt = 0u,
    public var anonymous2: TraceLogfileHeader321 = TraceLogfileHeader321(),
    public var loggerName: UInt = 0u,
    public var logFileName: UInt = 0u,
    public var timeZone: TimeZoneInformation = TimeZoneInformation(),
    public var bootTime: Long = 0L,
    public var perfFreq: Long = 0L,
    public var startTime: Long = 0L,
    public var reservedFlags: UInt = 0u,
    public var buffersLost: UInt = 0u,
)

public data class TraceLogfileHeader320(
    public var version: UInt = 0u,
    public var versionDetail: TraceLogfileHeader3200 = TraceLogfileHeader3200(),
)

public data class TraceLogfileHeader3200(
    public var majorVersion: UByte = 0u,
    public var minorVersion: UByte = 0u,
    public var subVersion: UByte = 0u,
    public var subMinorVersion: UByte = 0u,
)

public data class TraceLogfileHeader321(
    public var logInstanceGuid: Guid = Guid(),
    public var anonymous: TraceLogfileHeader3210 = TraceLogfileHeader3210(),
)

public data class TraceLogfileHeader3210(
    public var startBuffers: UInt = 0u,
    public var pointerSize: UInt = 0u,
    public var eventsLost: UInt = 0u,
    public var cpuSpeedInMHz: UInt = 0u,
)

public class TraceLogfileHeader64(
    public var bufferSize: UInt = 0u,
    public var anonymous1: TraceLogfileHeader640 = TraceLogfileHeader640(),
    public var providerVersion: UInt = 0u,
    public var numberOfProcessors: UInt = 0u,
    public var endTime: Long = 0L,
    public var timerResolution: UInt = 0u,
    public var maximumFileSize: UInt = 0u,
    public var logFileMode: UInt = 0u,
    public var buffersWritten: UInt = 0u,
    public var anonymous2: TraceLogfileHeader641 = TraceLogfileHeader641(),
    public var loggerName: ULong = 0uL,
    public var logFileName: ULong = 0uL,
    public var timeZone: TimeZoneInformation = TimeZoneInformation(),
    public var bootTime: Long = 0L,
    public var perfFreq: Long = 0L,
    public var startTime: Long = 0L,
    public var reservedFlags: UInt = 0u,
    public var buffersLost: UInt = 0u,
)

public data class TraceLogfileHeader640(
    public var version: UInt = 0u,
    public var versionDetail: TraceLogfileHeader6400 = TraceLogfileHeader6400(),
)

public data class TraceLogfileHeader6400(
    public var majorVersion: UByte = 0u,
    public var minorVersion: UByte = 0u,
    public var subVersion: UByte = 0u,
    public var subMinorVersion: UByte = 0u,
)

public data class TraceLogfileHeader641(
    public var logInstanceGuid: Guid = Guid(),
    public var anonymous: TraceLogfileHeader6410 = TraceLogfileHeader6410(),
)

public data class TraceLogfileHeader6410(
    public var startBuffers: UInt = 0u,
    public var pointerSize: UInt = 0u,
    public var eventsLost: UInt = 0u,
    public var cpuSpeedInMHz: UInt = 0u,
)

public data class TracePeriodicCaptureStateInfo(
    public var captureStateFrequencyInSeconds: UInt = 0u,
    public var providerCount: UShort = 0u,
    public var reserved: UShort = 0u,
)

public data class TraceProfileInterval(
    public var source: UInt = 0u,
    public var interval: UInt = 0u,
)

public data class TraceProviderInfo(
    public var providerGuid: Guid = Guid(),
    public var schemaSource: UInt = 0u,
    public var providerNameOffset: UInt = 0u,
)

public data class TraceProviderInstanceInfo(
    public var nextOffset: UInt = 0u,
    public var enableCount: UInt = 0u,
    public var pid: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class TraceStackCachingInfo(
    public var enabled: Boolean = false,
    public var cacheSize: UInt = 0u,
    public var bucketCount: UInt = 0u,
)

public data class TraceVersionInfo(
    public var etwTraceProcessingVersion: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class Wmiregguidw(
    public var guid: Guid = Guid(),
    public var flags: UInt = 0u,
    public var instanceCount: UInt = 0u,
    public var anonymous: Wmiregguidw0 = Wmiregguidw0(),
)

public data class Wmiregguidw0(
    public var instanceNameList: UInt = 0u,
    public var baseNameOffset: UInt = 0u,
    public var pdo: Int = 0,
    public var instanceInfo: Int = 0,
)

public data class Wmireginfow(
    public var bufferSize: UInt = 0u,
    public var nextWmiRegInfo: UInt = 0u,
    public var registryPath: UInt = 0u,
    public var mofResourceName: UInt = 0u,
    public var guidCount: UInt = 0u,
    public var wmiRegGuid: List<Wmiregguidw> = List(1) { Wmiregguidw() },
)

public data class WnodeAllData(
    public var wnodeHeader: WnodeHeader = WnodeHeader(),
    public var dataBlockOffset: UInt = 0u,
    public var instanceCount: UInt = 0u,
    public var offsetInstanceNameOffsets: UInt = 0u,
    public var anonymous: WnodeAllData0 = WnodeAllData0(),
)

public data class WnodeAllData0(
    public var fixedInstanceSize: UInt = 0u,
    public var offsetInstanceDataAndLength: List<Offsetinstancedataandlength> = List(1) { Offsetinstancedataandlength() },
)

public data class WnodeEventItem(
    public var wnodeHeader: WnodeHeader = WnodeHeader(),
)

public data class WnodeEventReference(
    public var wnodeHeader: WnodeHeader = WnodeHeader(),
    public var targetGuid: Guid = Guid(),
    public var targetDataBlockSize: UInt = 0u,
    public var anonymous: WnodeEventReference0 = WnodeEventReference0(),
)

public data class WnodeEventReference0(
    public var targetInstanceIndex: UInt = 0u,
    public var targetInstanceName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WnodeEventReference0) return false
        if (this.targetInstanceIndex != other.targetInstanceIndex) return false
        if (!this.targetInstanceName.contentEquals(other.targetInstanceName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.targetInstanceIndex.hashCode()
        result = 31 * result + this.targetInstanceName.contentHashCode()
        return result
    }
}

public data class WnodeHeader(
    public var bufferSize: UInt = 0u,
    public var providerId: UInt = 0u,
    public var anonymous1: WnodeHeader0 = WnodeHeader0(),
    public var anonymous2: WnodeHeader1 = WnodeHeader1(),
    public var guid: Guid = Guid(),
    public var clientContext: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class WnodeHeader0(
    public var historicalContext: ULong = 0uL,
    public var anonymous: WnodeHeader00 = WnodeHeader00(),
)

public data class WnodeHeader00(
    public var version: UInt = 0u,
    public var linkage: UInt = 0u,
)

public data class WnodeHeader1(
    public var countLost: UInt = 0u,
    public var kernelHandle: Handle = null,
    public var timeStamp: Long = 0L,
)

public data class WnodeMethodItem(
    public var wnodeHeader: WnodeHeader = WnodeHeader(),
    public var offsetInstanceName: UInt = 0u,
    public var instanceIndex: UInt = 0u,
    public var methodId: UInt = 0u,
    public var dataBlockOffset: UInt = 0u,
    public var sizeDataBlock: UInt = 0u,
    public var variableData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WnodeMethodItem) return false
        if (this.wnodeHeader != other.wnodeHeader) return false
        if (this.offsetInstanceName != other.offsetInstanceName) return false
        if (this.instanceIndex != other.instanceIndex) return false
        if (this.methodId != other.methodId) return false
        if (this.dataBlockOffset != other.dataBlockOffset) return false
        if (this.sizeDataBlock != other.sizeDataBlock) return false
        if (!this.variableData.contentEquals(other.variableData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wnodeHeader.hashCode()
        result = 31 * result + this.offsetInstanceName.hashCode()
        result = 31 * result + this.instanceIndex.hashCode()
        result = 31 * result + this.methodId.hashCode()
        result = 31 * result + this.dataBlockOffset.hashCode()
        result = 31 * result + this.sizeDataBlock.hashCode()
        result = 31 * result + this.variableData.contentHashCode()
        return result
    }
}

public data class WnodeSingleInstance(
    public var wnodeHeader: WnodeHeader = WnodeHeader(),
    public var offsetInstanceName: UInt = 0u,
    public var instanceIndex: UInt = 0u,
    public var dataBlockOffset: UInt = 0u,
    public var sizeDataBlock: UInt = 0u,
    public var variableData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WnodeSingleInstance) return false
        if (this.wnodeHeader != other.wnodeHeader) return false
        if (this.offsetInstanceName != other.offsetInstanceName) return false
        if (this.instanceIndex != other.instanceIndex) return false
        if (this.dataBlockOffset != other.dataBlockOffset) return false
        if (this.sizeDataBlock != other.sizeDataBlock) return false
        if (!this.variableData.contentEquals(other.variableData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wnodeHeader.hashCode()
        result = 31 * result + this.offsetInstanceName.hashCode()
        result = 31 * result + this.instanceIndex.hashCode()
        result = 31 * result + this.dataBlockOffset.hashCode()
        result = 31 * result + this.sizeDataBlock.hashCode()
        result = 31 * result + this.variableData.contentHashCode()
        return result
    }
}

public data class WnodeSingleItem(
    public var wnodeHeader: WnodeHeader = WnodeHeader(),
    public var offsetInstanceName: UInt = 0u,
    public var instanceIndex: UInt = 0u,
    public var itemId: UInt = 0u,
    public var dataBlockOffset: UInt = 0u,
    public var sizeDataItem: UInt = 0u,
    public var variableData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WnodeSingleItem) return false
        if (this.wnodeHeader != other.wnodeHeader) return false
        if (this.offsetInstanceName != other.offsetInstanceName) return false
        if (this.instanceIndex != other.instanceIndex) return false
        if (this.itemId != other.itemId) return false
        if (this.dataBlockOffset != other.dataBlockOffset) return false
        if (this.sizeDataItem != other.sizeDataItem) return false
        if (!this.variableData.contentEquals(other.variableData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wnodeHeader.hashCode()
        result = 31 * result + this.offsetInstanceName.hashCode()
        result = 31 * result + this.instanceIndex.hashCode()
        result = 31 * result + this.itemId.hashCode()
        result = 31 * result + this.dataBlockOffset.hashCode()
        result = 31 * result + this.sizeDataItem.hashCode()
        result = 31 * result + this.variableData.contentHashCode()
        return result
    }
}

public data class WnodeTooSmall(
    public var wnodeHeader: WnodeHeader = WnodeHeader(),
    public var sizeNeeded: UInt = 0u,
)
