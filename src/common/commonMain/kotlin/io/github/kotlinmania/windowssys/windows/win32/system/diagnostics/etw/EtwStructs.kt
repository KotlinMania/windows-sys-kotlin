@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ControltraceHandle> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ControltraceHandle> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): ControltraceHandle =
                    ControltraceHandle(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ControltraceHandle) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.value)
                }
            }
    }
}

public class EnableTraceParameters internal constructor(
    public var version: UInt,
    public var enableProperty: UInt,
    public var controlFlags: UInt,
    public var sourceId: Guid,
    enableFilterDescCtorArg: MutPtr<EventFilterDescriptor>,
    public var filterDescCount: UInt,
) {
    public var enableFilterDesc: MutPtr<EventFilterDescriptor> = enableFilterDescCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        enableProperty = 0u,
        controlFlags = 0u,
        sourceId = Guid(),
        enableFilterDescCtorArg = MutPtr(0L),
        filterDescCount = 0u,
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): UInt = this.enableProperty

    public operator fun component3(): UInt = this.controlFlags

    public operator fun component4(): Guid = this.sourceId

    public operator fun component5(): MutPtr<EventFilterDescriptor> = this.enableFilterDesc

    public operator fun component6(): UInt = this.filterDescCount

    public fun copy(version: UInt = this.version, enableProperty: UInt = this.enableProperty, controlFlags: UInt = this.controlFlags, sourceId: Guid = this.sourceId, enableFilterDesc: MutPtr<EventFilterDescriptor> = this.enableFilterDesc, filterDescCount: UInt = this.filterDescCount): EnableTraceParameters = EnableTraceParameters(version = version, enableProperty = enableProperty, controlFlags = controlFlags, sourceId = sourceId, enableFilterDescCtorArg = enableFilterDesc, filterDescCount = filterDescCount)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EnableTraceParameters) return false
        if (this.version != other.version) return false
        if (this.enableProperty != other.enableProperty) return false
        if (this.controlFlags != other.controlFlags) return false
        if (this.sourceId != other.sourceId) return false
        if (this.enableFilterDesc != other.enableFilterDesc) return false
        if (this.filterDescCount != other.filterDescCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.enableProperty.hashCode()
        result = 31 * result + this.controlFlags.hashCode()
        result = 31 * result + this.sourceId.hashCode()
        result = 31 * result + this.enableFilterDesc.hashCode()
        result = 31 * result + this.filterDescCount.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            enableProperty: UInt = 0u,
            controlFlags: UInt = 0u,
            sourceId: Guid = Guid(),
            enableFilterDesc: MutPtr<EventFilterDescriptor> = MutPtr(0L),
            filterDescCount: UInt = 0u,
        ): EnableTraceParameters =
            EnableTraceParameters(
                version = version,
                enableProperty = enableProperty,
                controlFlags = controlFlags,
                sourceId = sourceId,
                enableFilterDescCtorArg = enableFilterDesc,
                filterDescCount = filterDescCount,
            )
    }
}

public class EnableTraceParametersV1 internal constructor(
    public var version: UInt,
    public var enableProperty: UInt,
    public var controlFlags: UInt,
    public var sourceId: Guid,
    enableFilterDescCtorArg: MutPtr<EventFilterDescriptor>,
) {
    public var enableFilterDesc: MutPtr<EventFilterDescriptor> = enableFilterDescCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        enableProperty = 0u,
        controlFlags = 0u,
        sourceId = Guid(),
        enableFilterDescCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): UInt = this.enableProperty

    public operator fun component3(): UInt = this.controlFlags

    public operator fun component4(): Guid = this.sourceId

    public operator fun component5(): MutPtr<EventFilterDescriptor> = this.enableFilterDesc

    public fun copy(version: UInt = this.version, enableProperty: UInt = this.enableProperty, controlFlags: UInt = this.controlFlags, sourceId: Guid = this.sourceId, enableFilterDesc: MutPtr<EventFilterDescriptor> = this.enableFilterDesc): EnableTraceParametersV1 = EnableTraceParametersV1(version = version, enableProperty = enableProperty, controlFlags = controlFlags, sourceId = sourceId, enableFilterDescCtorArg = enableFilterDesc)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EnableTraceParametersV1) return false
        if (this.version != other.version) return false
        if (this.enableProperty != other.enableProperty) return false
        if (this.controlFlags != other.controlFlags) return false
        if (this.sourceId != other.sourceId) return false
        if (this.enableFilterDesc != other.enableFilterDesc) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.enableProperty.hashCode()
        result = 31 * result + this.controlFlags.hashCode()
        result = 31 * result + this.sourceId.hashCode()
        result = 31 * result + this.enableFilterDesc.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            enableProperty: UInt = 0u,
            controlFlags: UInt = 0u,
            sourceId: Guid = Guid(),
            enableFilterDesc: MutPtr<EventFilterDescriptor> = MutPtr(0L),
        ): EnableTraceParametersV1 =
            EnableTraceParametersV1(
                version = version,
                enableProperty = enableProperty,
                controlFlags = controlFlags,
                sourceId = sourceId,
                enableFilterDescCtorArg = enableFilterDesc,
            )
    }
}

public class EtwBufferCallbackInformation internal constructor(
    public var traceHandle: ULong,
    logfileHeaderCtorArg: ConstPtr<TraceLogfileHeader>,
    public var buffersRead: UInt,
) {
    public var logfileHeader: ConstPtr<TraceLogfileHeader> = logfileHeaderCtorArg
        internal set

    public constructor() : this(
        traceHandle = 0uL,
        logfileHeaderCtorArg = ConstPtr(0L),
        buffersRead = 0u,
    )

    public operator fun component1(): ULong = this.traceHandle

    public operator fun component2(): ConstPtr<TraceLogfileHeader> = this.logfileHeader

    public operator fun component3(): UInt = this.buffersRead

    public fun copy(traceHandle: ULong = this.traceHandle, logfileHeader: ConstPtr<TraceLogfileHeader> = this.logfileHeader, buffersRead: UInt = this.buffersRead): EtwBufferCallbackInformation = EtwBufferCallbackInformation(traceHandle = traceHandle, logfileHeaderCtorArg = logfileHeader, buffersRead = buffersRead)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EtwBufferCallbackInformation) return false
        if (this.traceHandle != other.traceHandle) return false
        if (this.logfileHeader != other.logfileHeader) return false
        if (this.buffersRead != other.buffersRead) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.traceHandle.hashCode()
        result = 31 * result + this.logfileHeader.hashCode()
        result = 31 * result + this.buffersRead.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EtwBufferCallbackInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EtwBufferCallbackInformation> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): EtwBufferCallbackInformation =
                    EtwBufferCallbackInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<TraceLogfileHeader>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: EtwBufferCallbackInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.traceHandle)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<TraceLogfileHeader>(64)
                    ).writeNative(addr + 8L, value.logfileHeader)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.buffersRead)
                }
            }

        public operator fun invoke(
            traceHandle: ULong = 0uL,
            logfileHeader: ConstPtr<TraceLogfileHeader> = ConstPtr(0L),
            buffersRead: UInt = 0u,
        ): EtwBufferCallbackInformation =
            EtwBufferCallbackInformation(
                traceHandle = traceHandle,
                logfileHeaderCtorArg = logfileHeader,
                buffersRead = buffersRead,
            )
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EtwBufferContext00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EtwBufferContext00> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): EtwBufferContext00 =
                    EtwBufferContext00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: EtwBufferContext00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.processorNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.alignment)
                }
            }
    }
}

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

public class EtwOpenTraceOptions internal constructor(
    public var processTraceModes: EtwProcessTraceModes,
    public var eventCallback: PeventRecordCallback,
    eventCallbackContextCtorArg: MutPtr<CVoid>,
    public var bufferCallback: PetwBufferCallback,
    bufferCallbackContextCtorArg: MutPtr<CVoid>,
) {
    public var eventCallbackContext: MutPtr<CVoid> = eventCallbackContextCtorArg
        internal set

    public var bufferCallbackContext: MutPtr<CVoid> = bufferCallbackContextCtorArg
        internal set

    public constructor() : this(
        processTraceModes = 0,
        eventCallback = null,
        eventCallbackContextCtorArg = MutPtr(0L),
        bufferCallback = null,
        bufferCallbackContextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): EtwProcessTraceModes = this.processTraceModes

    public operator fun component2(): PeventRecordCallback = this.eventCallback

    public operator fun component3(): MutPtr<CVoid> = this.eventCallbackContext

    public operator fun component4(): PetwBufferCallback = this.bufferCallback

    public operator fun component5(): MutPtr<CVoid> = this.bufferCallbackContext

    public fun copy(processTraceModes: EtwProcessTraceModes = this.processTraceModes, eventCallback: PeventRecordCallback = this.eventCallback, eventCallbackContext: MutPtr<CVoid> = this.eventCallbackContext, bufferCallback: PetwBufferCallback = this.bufferCallback, bufferCallbackContext: MutPtr<CVoid> = this.bufferCallbackContext): EtwOpenTraceOptions = EtwOpenTraceOptions(processTraceModes = processTraceModes, eventCallback = eventCallback, eventCallbackContextCtorArg = eventCallbackContext, bufferCallback = bufferCallback, bufferCallbackContextCtorArg = bufferCallbackContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EtwOpenTraceOptions) return false
        if (this.processTraceModes != other.processTraceModes) return false
        if (this.eventCallback != other.eventCallback) return false
        if (this.eventCallbackContext != other.eventCallbackContext) return false
        if (this.bufferCallback != other.bufferCallback) return false
        if (this.bufferCallbackContext != other.bufferCallbackContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.processTraceModes.hashCode()
        result = 31 * result + this.eventCallback.hashCode()
        result = 31 * result + this.eventCallbackContext.hashCode()
        result = 31 * result + this.bufferCallback.hashCode()
        result = 31 * result + this.bufferCallbackContext.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            processTraceModes: EtwProcessTraceModes = 0,
            eventCallback: PeventRecordCallback = null,
            eventCallbackContext: MutPtr<CVoid> = MutPtr(0L),
            bufferCallback: PetwBufferCallback = null,
            bufferCallbackContext: MutPtr<CVoid> = MutPtr(0L),
        ): EtwOpenTraceOptions =
            EtwOpenTraceOptions(
                processTraceModes = processTraceModes,
                eventCallback = eventCallback,
                eventCallbackContextCtorArg = eventCallbackContext,
                bufferCallback = bufferCallback,
                bufferCallbackContextCtorArg = bufferCallbackContext,
            )
    }
}

public data class EtwPmcCounterOwner(
    public var ownerType: EtwPmcCounterOwnerType = 0,
    public var profileSource: UInt = 0u,
    public var ownerTag: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EtwPmcCounterOwner> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EtwPmcCounterOwner> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): EtwPmcCounterOwner =
                    EtwPmcCounterOwner(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: EtwPmcCounterOwner) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.ownerType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.profileSource)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ownerTag)
                }
            }
    }
}

public data class EtwPmcCounterOwnershipStatus(
    public var processorNumber: UInt = 0u,
    public var numberOfCounters: UInt = 0u,
    public var counterOwners: List<EtwPmcCounterOwner> = List(1) { EtwPmcCounterOwner() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EtwPmcCounterOwnershipStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EtwPmcCounterOwnershipStatus> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): EtwPmcCounterOwnershipStatus =
                    EtwPmcCounterOwnershipStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(EtwPmcCounterOwner.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: EtwPmcCounterOwnershipStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.processorNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.numberOfCounters)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(EtwPmcCounterOwner.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.counterOwners)
                }
            }
    }
}

public data class EtwPmcSessionInfo(
    public var nextEntryOffset: UInt = 0u,
    public var loggerId: UShort = 0u,
    public var reserved: UShort = 0u,
    public var profileSourceCount: UInt = 0u,
    public var hookIdCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EtwPmcSessionInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EtwPmcSessionInfo> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): EtwPmcSessionInfo =
                    EtwPmcSessionInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: EtwPmcSessionInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nextEntryOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.loggerId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.profileSourceCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.hookIdCount)
                }
            }
    }
}

public data class EtwTracePartitionInformation(
    public var partitionId: Guid = Guid(),
    public var parentId: Guid = Guid(),
    public var qpcOffsetFromRoot: Long = 0L,
    public var partitionType: UInt = 0u,
)

public class EtwTracePartitionInformationV2 internal constructor(
    public var qpcOffsetFromRoot: Long,
    public var partitionType: UInt,
    partitionIdCtorArg: Pwstr,
    parentIdCtorArg: Pwstr,
) {
    public var partitionId: Pwstr = partitionIdCtorArg
        internal set

    public var parentId: Pwstr = parentIdCtorArg
        internal set

    public constructor() : this(
        qpcOffsetFromRoot = 0L,
        partitionType = 0u,
        partitionIdCtorArg = MutPtr(0L),
        parentIdCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Long = this.qpcOffsetFromRoot

    public operator fun component2(): UInt = this.partitionType

    public operator fun component3(): Pwstr = this.partitionId

    public operator fun component4(): Pwstr = this.parentId

    public fun copy(qpcOffsetFromRoot: Long = this.qpcOffsetFromRoot, partitionType: UInt = this.partitionType, partitionId: Pwstr = this.partitionId, parentId: Pwstr = this.parentId): EtwTracePartitionInformationV2 = EtwTracePartitionInformationV2(qpcOffsetFromRoot = qpcOffsetFromRoot, partitionType = partitionType, partitionIdCtorArg = partitionId, parentIdCtorArg = parentId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EtwTracePartitionInformationV2) return false
        if (this.qpcOffsetFromRoot != other.qpcOffsetFromRoot) return false
        if (this.partitionType != other.partitionType) return false
        if (this.partitionId != other.partitionId) return false
        if (this.parentId != other.parentId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.qpcOffsetFromRoot.hashCode()
        result = 31 * result + this.partitionType.hashCode()
        result = 31 * result + this.partitionId.hashCode()
        result = 31 * result + this.parentId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            qpcOffsetFromRoot: Long = 0L,
            partitionType: UInt = 0u,
            partitionId: Pwstr = MutPtr(0L),
            parentId: Pwstr = MutPtr(0L),
        ): EtwTracePartitionInformationV2 =
            EtwTracePartitionInformationV2(
                qpcOffsetFromRoot = qpcOffsetFromRoot,
                partitionType = partitionType,
                partitionIdCtorArg = partitionId,
                parentIdCtorArg = parentId,
            )
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventDataDescriptor00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventDataDescriptor00> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): EventDataDescriptor00 =
                    EventDataDescriptor00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: EventDataDescriptor00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.reserved2)
                }
            }
    }
}

public data class EventDescriptor(
    public var id: UShort = 0u,
    public var version: UByte = 0u,
    public var channel: UByte = 0u,
    public var level: UByte = 0u,
    public var opcode: UByte = 0u,
    public var task: UShort = 0u,
    public var keyword: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventDescriptor> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): EventDescriptor =
                    EventDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: EventDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.id)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.channel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.level)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.opcode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.task)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.keyword)
                }
            }
    }
}

public data class EventExtendedItemEventKey(
    public var key: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventExtendedItemEventKey> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventExtendedItemEventKey> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): EventExtendedItemEventKey =
                    EventExtendedItemEventKey(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: EventExtendedItemEventKey) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.key)
                }
            }
    }
}

public data class EventExtendedItemInstance(
    public var instanceId: UInt = 0u,
    public var parentInstanceId: UInt = 0u,
    public var parentGuid: Guid = Guid(),
)

public data class EventExtendedItemPebsIndex(
    public var pebsIndex: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventExtendedItemPebsIndex> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventExtendedItemPebsIndex> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): EventExtendedItemPebsIndex =
                    EventExtendedItemPebsIndex(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: EventExtendedItemPebsIndex) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.pebsIndex)
                }
            }
    }
}

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventExtendedItemPmcCounters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventExtendedItemPmcCounters> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): EventExtendedItemPmcCounters =
                    EventExtendedItemPmcCounters(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (1).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: EventExtendedItemPmcCounters) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (1).toInt())
                    ).writeNative(addr, value.counter)
                }
            }
    }
}

public data class EventExtendedItemProcessStartKey(
    public var processStartKey: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventExtendedItemProcessStartKey> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventExtendedItemProcessStartKey> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): EventExtendedItemProcessStartKey =
                    EventExtendedItemProcessStartKey(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: EventExtendedItemProcessStartKey) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.processStartKey)
                }
            }
    }
}

public data class EventExtendedItemRelatedActivityid(
    public var relatedActivityId: Guid = Guid(),
)

public data class EventExtendedItemStackKey32(
    public var matchId: ULong = 0uL,
    public var stackKey: UInt = 0u,
    public var padding: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventExtendedItemStackKey32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventExtendedItemStackKey32> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): EventExtendedItemStackKey32 =
                    EventExtendedItemStackKey32(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: EventExtendedItemStackKey32) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.matchId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.stackKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.padding)
                }
            }
    }
}

public data class EventExtendedItemStackKey64(
    public var matchId: ULong = 0uL,
    public var stackKey: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventExtendedItemStackKey64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventExtendedItemStackKey64> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): EventExtendedItemStackKey64 =
                    EventExtendedItemStackKey64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: EventExtendedItemStackKey64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.matchId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.stackKey)
                }
            }
    }
}

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventExtendedItemStackTrace32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventExtendedItemStackTrace32> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): EventExtendedItemStackTrace32 =
                    EventExtendedItemStackTrace32(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: EventExtendedItemStackTrace32) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.matchId)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 8L, value.address)
                }
            }
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventExtendedItemStackTrace64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventExtendedItemStackTrace64> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): EventExtendedItemStackTrace64 =
                    EventExtendedItemStackTrace64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: EventExtendedItemStackTrace64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.matchId)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (1).toInt())
                    ).writeNative(addr + 8L, value.address)
                }
            }
    }
}

public data class EventExtendedItemTsId(
    public var sessionId: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventExtendedItemTsId> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventExtendedItemTsId> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): EventExtendedItemTsId =
                    EventExtendedItemTsId(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: EventExtendedItemTsId) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sessionId)
                }
            }
    }
}

public data class EventFilterDescriptor(
    public var ptr: ULong = 0uL,
    public var size: UInt = 0u,
    public var type: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventFilterDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventFilterDescriptor> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): EventFilterDescriptor =
                    EventFilterDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: EventFilterDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.ptr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.type)
                }
            }
    }
}

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventFilterEventId> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventFilterEventId> {
                override val sizeBytes: Long = 6L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): EventFilterEventId =
                    EventFilterEventId(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: EventFilterEventId) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.filterIn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.count)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 4L, value.events)
                }
            }
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventFilterEventName> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventFilterEventName> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): EventFilterEventName =
                    EventFilterEventName(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 17L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: EventFilterEventName) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.matchAnyKeyword)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.matchAllKeyword)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.level)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 17L, value.filterIn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.nameCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 20L, value.names)
                }
            }
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventFilterHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventFilterHeader> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): EventFilterHeader =
                    EventFilterHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (5).toInt())
                        ).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: EventFilterHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.id)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.version)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (5).toInt())
                    ).writeNative(addr + 3L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.instanceId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.nextOffset)
                }
            }
    }
}

public data class EventFilterLevelKw(
    public var matchAnyKeyword: ULong = 0uL,
    public var matchAllKeyword: ULong = 0uL,
    public var level: UByte = 0u,
    public var filterIn: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventFilterLevelKw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventFilterLevelKw> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): EventFilterLevelKw =
                    EventFilterLevelKw(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 17L),
                    )
                override fun writeNative(addr: Long, value: EventFilterLevelKw) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.matchAnyKeyword)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.matchAllKeyword)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.level)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 17L, value.filterIn)
                }
            }
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventHeader00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventHeader00> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): EventHeader00 =
                    EventHeader00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: EventHeader00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.kernelTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.userTime)
                }
            }
    }
}

public data class EventHeaderExtendedDataItem(
    public var reserved1: UShort = 0u,
    public var extType: UShort = 0u,
    public var anonymous: EventHeaderExtendedDataItem0 = EventHeaderExtendedDataItem0(),
    public var dataSize: UShort = 0u,
    public var dataPtr: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventHeaderExtendedDataItem> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventHeaderExtendedDataItem> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): EventHeaderExtendedDataItem =
                    EventHeaderExtendedDataItem(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (EventHeaderExtendedDataItem0.typeLayout()).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: EventHeaderExtendedDataItem) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.extType)
                    (EventHeaderExtendedDataItem0.typeLayout()).writeNative(addr + 4L, value.anonymous)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.dataSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.dataPtr)
                }
            }
    }
}

public data class EventHeaderExtendedDataItem0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventHeaderExtendedDataItem0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventHeaderExtendedDataItem0> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): EventHeaderExtendedDataItem0 =
                    EventHeaderExtendedDataItem0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: EventHeaderExtendedDataItem0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventInstanceHeader00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventInstanceHeader00> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): EventInstanceHeader00 =
                    EventInstanceHeader00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: EventInstanceHeader00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.headerType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.markerFlags)
                }
            }
    }
}

public data class EventInstanceHeader1(
    public var version: UInt = 0u,
    public var cls: EventInstanceHeader10 = EventInstanceHeader10(),
)

public data class EventInstanceHeader10(
    public var type: UByte = 0u,
    public var level: UByte = 0u,
    public var version: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventInstanceHeader10> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventInstanceHeader10> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): EventInstanceHeader10 =
                    EventInstanceHeader10(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: EventInstanceHeader10) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.level)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.version)
                }
            }
    }
}

public data class EventInstanceHeader2(
    public var anonymous1: EventInstanceHeader20 = EventInstanceHeader20(),
    public var processorTime: ULong = 0uL,
    public var anonymous2: EventInstanceHeader21 = EventInstanceHeader21(),
)

public data class EventInstanceHeader20(
    public var kernelTime: UInt = 0u,
    public var userTime: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventInstanceHeader20> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventInstanceHeader20> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): EventInstanceHeader20 =
                    EventInstanceHeader20(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: EventInstanceHeader20) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.kernelTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.userTime)
                }
            }
    }
}

public data class EventInstanceHeader21(
    public var eventId: UInt = 0u,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventInstanceHeader21> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventInstanceHeader21> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): EventInstanceHeader21 =
                    EventInstanceHeader21(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: EventInstanceHeader21) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.eventId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                }
            }
    }
}

public class EventInstanceInfo internal constructor(
    regHandleCtorArg: Handle,
    public var instanceId: UInt,
) {
    public var regHandle: Handle = regHandleCtorArg
        internal set

    public constructor() : this(
        regHandleCtorArg = MutPtr(0L),
        instanceId = 0u,
    )

    public operator fun component1(): Handle = this.regHandle

    public operator fun component2(): UInt = this.instanceId

    public fun copy(regHandle: Handle = this.regHandle, instanceId: UInt = this.instanceId): EventInstanceInfo = EventInstanceInfo(regHandleCtorArg = regHandle, instanceId = instanceId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EventInstanceInfo) return false
        if (this.regHandle != other.regHandle) return false
        if (this.instanceId != other.instanceId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.regHandle.hashCode()
        result = 31 * result + this.instanceId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            regHandle: Handle = MutPtr(0L),
            instanceId: UInt = 0u,
        ): EventInstanceInfo =
            EventInstanceInfo(
                regHandleCtorArg = regHandle,
                instanceId = instanceId,
            )
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventPropertyInfo02> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventPropertyInfo02> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): EventPropertyInfo02 =
                    EventPropertyInfo02(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: EventPropertyInfo02) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.inType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.outType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.customSchemaOffset)
                }
            }
    }
}

public data class EventPropertyInfo00(
    public var inType: UShort = 0u,
    public var outType: UShort = 0u,
    public var mapNameOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventPropertyInfo00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventPropertyInfo00> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): EventPropertyInfo00 =
                    EventPropertyInfo00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: EventPropertyInfo00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.inType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.outType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.mapNameOffset)
                }
            }
    }
}

public data class EventPropertyInfo01(
    public var structStartIndex: UShort = 0u,
    public var numOfStructMembers: UShort = 0u,
    public var padding: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventPropertyInfo01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventPropertyInfo01> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): EventPropertyInfo01 =
                    EventPropertyInfo01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: EventPropertyInfo01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.structStartIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.numOfStructMembers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.padding)
                }
            }
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventPropertyInfo30> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventPropertyInfo30> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): EventPropertyInfo30 =
                    EventPropertyInfo30(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: EventPropertyInfo30) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class EventRecord internal constructor(
    public var eventHeader: EventHeader,
    public var bufferContext: EtwBufferContext,
    public var extendedDataCount: UShort,
    public var userDataLength: UShort,
    extendedDataCtorArg: MutPtr<EventHeaderExtendedDataItem>,
    userDataCtorArg: MutPtr<CVoid>,
    userContextCtorArg: MutPtr<CVoid>,
) {
    public var extendedData: MutPtr<EventHeaderExtendedDataItem> = extendedDataCtorArg
        internal set

    public var userData: MutPtr<CVoid> = userDataCtorArg
        internal set

    public var userContext: MutPtr<CVoid> = userContextCtorArg
        internal set

    public constructor() : this(
        eventHeader = EventHeader(),
        bufferContext = EtwBufferContext(),
        extendedDataCount = 0u,
        userDataLength = 0u,
        extendedDataCtorArg = MutPtr(0L),
        userDataCtorArg = MutPtr(0L),
        userContextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): EventHeader = this.eventHeader

    public operator fun component2(): EtwBufferContext = this.bufferContext

    public operator fun component3(): UShort = this.extendedDataCount

    public operator fun component4(): UShort = this.userDataLength

    public operator fun component5(): MutPtr<EventHeaderExtendedDataItem> = this.extendedData

    public operator fun component6(): MutPtr<CVoid> = this.userData

    public operator fun component7(): MutPtr<CVoid> = this.userContext

    public fun copy(eventHeader: EventHeader = this.eventHeader, bufferContext: EtwBufferContext = this.bufferContext, extendedDataCount: UShort = this.extendedDataCount, userDataLength: UShort = this.userDataLength, extendedData: MutPtr<EventHeaderExtendedDataItem> = this.extendedData, userData: MutPtr<CVoid> = this.userData, userContext: MutPtr<CVoid> = this.userContext): EventRecord = EventRecord(eventHeader = eventHeader, bufferContext = bufferContext, extendedDataCount = extendedDataCount, userDataLength = userDataLength, extendedDataCtorArg = extendedData, userDataCtorArg = userData, userContextCtorArg = userContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EventRecord) return false
        if (this.eventHeader != other.eventHeader) return false
        if (this.bufferContext != other.bufferContext) return false
        if (this.extendedDataCount != other.extendedDataCount) return false
        if (this.userDataLength != other.userDataLength) return false
        if (this.extendedData != other.extendedData) return false
        if (this.userData != other.userData) return false
        if (this.userContext != other.userContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.eventHeader.hashCode()
        result = 31 * result + this.bufferContext.hashCode()
        result = 31 * result + this.extendedDataCount.hashCode()
        result = 31 * result + this.userDataLength.hashCode()
        result = 31 * result + this.extendedData.hashCode()
        result = 31 * result + this.userData.hashCode()
        result = 31 * result + this.userContext.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            eventHeader: EventHeader = EventHeader(),
            bufferContext: EtwBufferContext = EtwBufferContext(),
            extendedDataCount: UShort = 0u,
            userDataLength: UShort = 0u,
            extendedData: MutPtr<EventHeaderExtendedDataItem> = MutPtr(0L),
            userData: MutPtr<CVoid> = MutPtr(0L),
            userContext: MutPtr<CVoid> = MutPtr(0L),
        ): EventRecord =
            EventRecord(
                eventHeader = eventHeader,
                bufferContext = bufferContext,
                extendedDataCount = extendedDataCount,
                userDataLength = userDataLength,
                extendedDataCtorArg = extendedData,
                userDataCtorArg = userData,
                userContextCtorArg = userContext,
            )
    }
}

public class EventTrace internal constructor(
    public var header: EventTraceHeader,
    public var instanceId: UInt,
    public var parentInstanceId: UInt,
    public var parentGuid: Guid,
    mofDataCtorArg: MutPtr<CVoid>,
    public var mofLength: UInt,
    public var anonymous: EventTrace0,
) {
    public var mofData: MutPtr<CVoid> = mofDataCtorArg
        internal set

    public constructor() : this(
        header = EventTraceHeader(),
        instanceId = 0u,
        parentInstanceId = 0u,
        parentGuid = Guid(),
        mofDataCtorArg = MutPtr(0L),
        mofLength = 0u,
        anonymous = EventTrace0(),
    )

    public operator fun component1(): EventTraceHeader = this.header

    public operator fun component2(): UInt = this.instanceId

    public operator fun component3(): UInt = this.parentInstanceId

    public operator fun component4(): Guid = this.parentGuid

    public operator fun component5(): MutPtr<CVoid> = this.mofData

    public operator fun component6(): UInt = this.mofLength

    public operator fun component7(): EventTrace0 = this.anonymous

    public fun copy(header: EventTraceHeader = this.header, instanceId: UInt = this.instanceId, parentInstanceId: UInt = this.parentInstanceId, parentGuid: Guid = this.parentGuid, mofData: MutPtr<CVoid> = this.mofData, mofLength: UInt = this.mofLength, anonymous: EventTrace0 = this.anonymous): EventTrace = EventTrace(header = header, instanceId = instanceId, parentInstanceId = parentInstanceId, parentGuid = parentGuid, mofDataCtorArg = mofData, mofLength = mofLength, anonymous = anonymous)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EventTrace) return false
        if (this.header != other.header) return false
        if (this.instanceId != other.instanceId) return false
        if (this.parentInstanceId != other.parentInstanceId) return false
        if (this.parentGuid != other.parentGuid) return false
        if (this.mofData != other.mofData) return false
        if (this.mofLength != other.mofLength) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.instanceId.hashCode()
        result = 31 * result + this.parentInstanceId.hashCode()
        result = 31 * result + this.parentGuid.hashCode()
        result = 31 * result + this.mofData.hashCode()
        result = 31 * result + this.mofLength.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            header: EventTraceHeader = EventTraceHeader(),
            instanceId: UInt = 0u,
            parentInstanceId: UInt = 0u,
            parentGuid: Guid = Guid(),
            mofData: MutPtr<CVoid> = MutPtr(0L),
            mofLength: UInt = 0u,
            anonymous: EventTrace0 = EventTrace0(),
        ): EventTrace =
            EventTrace(
                header = header,
                instanceId = instanceId,
                parentInstanceId = parentInstanceId,
                parentGuid = parentGuid,
                mofDataCtorArg = mofData,
                mofLength = mofLength,
                anonymous = anonymous,
            )
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventTraceHeader00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventTraceHeader00> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): EventTraceHeader00 =
                    EventTraceHeader00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: EventTraceHeader00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.headerType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.markerFlags)
                }
            }
    }
}

public data class EventTraceHeader1(
    public var version: UInt = 0u,
    public var cls: EventTraceHeader10 = EventTraceHeader10(),
)

public data class EventTraceHeader10(
    public var type: UByte = 0u,
    public var level: UByte = 0u,
    public var version: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventTraceHeader10> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventTraceHeader10> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): EventTraceHeader10 =
                    EventTraceHeader10(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: EventTraceHeader10) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.level)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.version)
                }
            }
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventTraceHeader30> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventTraceHeader30> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): EventTraceHeader30 =
                    EventTraceHeader30(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: EventTraceHeader30) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.kernelTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.userTime)
                }
            }
    }
}

public data class EventTraceHeader31(
    public var clientContext: UInt = 0u,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventTraceHeader31> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventTraceHeader31> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): EventTraceHeader31 =
                    EventTraceHeader31(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: EventTraceHeader31) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.clientContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                }
            }
    }
}

public class EventTraceLogfilea internal constructor(
    logFileNameCtorArg: Pstr,
    loggerNameCtorArg: Pstr,
    public var currentTime: Long,
    public var buffersRead: UInt,
    public var anonymous1: EventTraceLogfilea0,
    public var currentEvent: EventTrace,
    public var logfileHeader: TraceLogfileHeader,
    public var bufferCallback: PeventTraceBufferCallbacka,
    public var bufferSize: UInt,
    public var filled: UInt,
    public var eventsLost: UInt,
    public var anonymous2: EventTraceLogfilea1,
    public var isKernelTrace: UInt,
    contextCtorArg: MutPtr<CVoid>,
) {
    public var logFileName: Pstr = logFileNameCtorArg
        internal set

    public var loggerName: Pstr = loggerNameCtorArg
        internal set

    public var context: MutPtr<CVoid> = contextCtorArg
        internal set

    public constructor() : this(
        logFileNameCtorArg = MutPtr(0L),
        loggerNameCtorArg = MutPtr(0L),
        currentTime = 0L,
        buffersRead = 0u,
        anonymous1 = EventTraceLogfilea0(),
        currentEvent = EventTrace(),
        logfileHeader = TraceLogfileHeader(),
        bufferCallback = null,
        bufferSize = 0u,
        filled = 0u,
        eventsLost = 0u,
        anonymous2 = EventTraceLogfilea1(),
        isKernelTrace = 0u,
        contextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pstr = this.logFileName

    public operator fun component2(): Pstr = this.loggerName

    public operator fun component3(): Long = this.currentTime

    public operator fun component4(): UInt = this.buffersRead

    public operator fun component5(): EventTraceLogfilea0 = this.anonymous1

    public operator fun component6(): EventTrace = this.currentEvent

    public operator fun component7(): TraceLogfileHeader = this.logfileHeader

    public operator fun component8(): PeventTraceBufferCallbacka = this.bufferCallback

    public operator fun component9(): UInt = this.bufferSize

    public operator fun component10(): UInt = this.filled

    public operator fun component11(): UInt = this.eventsLost

    public operator fun component12(): EventTraceLogfilea1 = this.anonymous2

    public operator fun component13(): UInt = this.isKernelTrace

    public operator fun component14(): MutPtr<CVoid> = this.context

    public fun copy(logFileName: Pstr = this.logFileName, loggerName: Pstr = this.loggerName, currentTime: Long = this.currentTime, buffersRead: UInt = this.buffersRead, anonymous1: EventTraceLogfilea0 = this.anonymous1, currentEvent: EventTrace = this.currentEvent, logfileHeader: TraceLogfileHeader = this.logfileHeader, bufferCallback: PeventTraceBufferCallbacka = this.bufferCallback, bufferSize: UInt = this.bufferSize, filled: UInt = this.filled, eventsLost: UInt = this.eventsLost, anonymous2: EventTraceLogfilea1 = this.anonymous2, isKernelTrace: UInt = this.isKernelTrace, context: MutPtr<CVoid> = this.context): EventTraceLogfilea = EventTraceLogfilea(logFileNameCtorArg = logFileName, loggerNameCtorArg = loggerName, currentTime = currentTime, buffersRead = buffersRead, anonymous1 = anonymous1, currentEvent = currentEvent, logfileHeader = logfileHeader, bufferCallback = bufferCallback, bufferSize = bufferSize, filled = filled, eventsLost = eventsLost, anonymous2 = anonymous2, isKernelTrace = isKernelTrace, contextCtorArg = context)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EventTraceLogfilea) return false
        if (this.logFileName != other.logFileName) return false
        if (this.loggerName != other.loggerName) return false
        if (this.currentTime != other.currentTime) return false
        if (this.buffersRead != other.buffersRead) return false
        if (this.anonymous1 != other.anonymous1) return false
        if (this.currentEvent != other.currentEvent) return false
        if (this.logfileHeader != other.logfileHeader) return false
        if (this.bufferCallback != other.bufferCallback) return false
        if (this.bufferSize != other.bufferSize) return false
        if (this.filled != other.filled) return false
        if (this.eventsLost != other.eventsLost) return false
        if (this.anonymous2 != other.anonymous2) return false
        if (this.isKernelTrace != other.isKernelTrace) return false
        if (this.context != other.context) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.logFileName.hashCode()
        result = 31 * result + this.loggerName.hashCode()
        result = 31 * result + this.currentTime.hashCode()
        result = 31 * result + this.buffersRead.hashCode()
        result = 31 * result + this.anonymous1.hashCode()
        result = 31 * result + this.currentEvent.hashCode()
        result = 31 * result + this.logfileHeader.hashCode()
        result = 31 * result + this.bufferCallback.hashCode()
        result = 31 * result + this.bufferSize.hashCode()
        result = 31 * result + this.filled.hashCode()
        result = 31 * result + this.eventsLost.hashCode()
        result = 31 * result + this.anonymous2.hashCode()
        result = 31 * result + this.isKernelTrace.hashCode()
        result = 31 * result + this.context.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            logFileName: Pstr = MutPtr(0L),
            loggerName: Pstr = MutPtr(0L),
            currentTime: Long = 0L,
            buffersRead: UInt = 0u,
            anonymous1: EventTraceLogfilea0 = EventTraceLogfilea0(),
            currentEvent: EventTrace = EventTrace(),
            logfileHeader: TraceLogfileHeader = TraceLogfileHeader(),
            bufferCallback: PeventTraceBufferCallbacka = null,
            bufferSize: UInt = 0u,
            filled: UInt = 0u,
            eventsLost: UInt = 0u,
            anonymous2: EventTraceLogfilea1 = EventTraceLogfilea1(),
            isKernelTrace: UInt = 0u,
            context: MutPtr<CVoid> = MutPtr(0L),
        ): EventTraceLogfilea =
            EventTraceLogfilea(
                logFileNameCtorArg = logFileName,
                loggerNameCtorArg = loggerName,
                currentTime = currentTime,
                buffersRead = buffersRead,
                anonymous1 = anonymous1,
                currentEvent = currentEvent,
                logfileHeader = logfileHeader,
                bufferCallback = bufferCallback,
                bufferSize = bufferSize,
                filled = filled,
                eventsLost = eventsLost,
                anonymous2 = anonymous2,
                isKernelTrace = isKernelTrace,
                contextCtorArg = context,
            )
    }
}

public data class EventTraceLogfilea0(
    public var logFileMode: UInt = 0u,
    public var processTraceMode: UInt = 0u,
)

public data class EventTraceLogfilea1(
    public var eventCallback: PeventCallback = null,
    public var eventRecordCallback: PeventRecordCallback = null,
)

public class EventTraceLogfilew internal constructor(
    logFileNameCtorArg: Pwstr,
    loggerNameCtorArg: Pwstr,
    public var currentTime: Long,
    public var buffersRead: UInt,
    public var anonymous1: EventTraceLogfilew0,
    public var currentEvent: EventTrace,
    public var logfileHeader: TraceLogfileHeader,
    public var bufferCallback: PeventTraceBufferCallbackw,
    public var bufferSize: UInt,
    public var filled: UInt,
    public var eventsLost: UInt,
    public var anonymous2: EventTraceLogfilew1,
    public var isKernelTrace: UInt,
    contextCtorArg: MutPtr<CVoid>,
) {
    public var logFileName: Pwstr = logFileNameCtorArg
        internal set

    public var loggerName: Pwstr = loggerNameCtorArg
        internal set

    public var context: MutPtr<CVoid> = contextCtorArg
        internal set

    public constructor() : this(
        logFileNameCtorArg = MutPtr(0L),
        loggerNameCtorArg = MutPtr(0L),
        currentTime = 0L,
        buffersRead = 0u,
        anonymous1 = EventTraceLogfilew0(),
        currentEvent = EventTrace(),
        logfileHeader = TraceLogfileHeader(),
        bufferCallback = null,
        bufferSize = 0u,
        filled = 0u,
        eventsLost = 0u,
        anonymous2 = EventTraceLogfilew1(),
        isKernelTrace = 0u,
        contextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.logFileName

    public operator fun component2(): Pwstr = this.loggerName

    public operator fun component3(): Long = this.currentTime

    public operator fun component4(): UInt = this.buffersRead

    public operator fun component5(): EventTraceLogfilew0 = this.anonymous1

    public operator fun component6(): EventTrace = this.currentEvent

    public operator fun component7(): TraceLogfileHeader = this.logfileHeader

    public operator fun component8(): PeventTraceBufferCallbackw = this.bufferCallback

    public operator fun component9(): UInt = this.bufferSize

    public operator fun component10(): UInt = this.filled

    public operator fun component11(): UInt = this.eventsLost

    public operator fun component12(): EventTraceLogfilew1 = this.anonymous2

    public operator fun component13(): UInt = this.isKernelTrace

    public operator fun component14(): MutPtr<CVoid> = this.context

    public fun copy(logFileName: Pwstr = this.logFileName, loggerName: Pwstr = this.loggerName, currentTime: Long = this.currentTime, buffersRead: UInt = this.buffersRead, anonymous1: EventTraceLogfilew0 = this.anonymous1, currentEvent: EventTrace = this.currentEvent, logfileHeader: TraceLogfileHeader = this.logfileHeader, bufferCallback: PeventTraceBufferCallbackw = this.bufferCallback, bufferSize: UInt = this.bufferSize, filled: UInt = this.filled, eventsLost: UInt = this.eventsLost, anonymous2: EventTraceLogfilew1 = this.anonymous2, isKernelTrace: UInt = this.isKernelTrace, context: MutPtr<CVoid> = this.context): EventTraceLogfilew = EventTraceLogfilew(logFileNameCtorArg = logFileName, loggerNameCtorArg = loggerName, currentTime = currentTime, buffersRead = buffersRead, anonymous1 = anonymous1, currentEvent = currentEvent, logfileHeader = logfileHeader, bufferCallback = bufferCallback, bufferSize = bufferSize, filled = filled, eventsLost = eventsLost, anonymous2 = anonymous2, isKernelTrace = isKernelTrace, contextCtorArg = context)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EventTraceLogfilew) return false
        if (this.logFileName != other.logFileName) return false
        if (this.loggerName != other.loggerName) return false
        if (this.currentTime != other.currentTime) return false
        if (this.buffersRead != other.buffersRead) return false
        if (this.anonymous1 != other.anonymous1) return false
        if (this.currentEvent != other.currentEvent) return false
        if (this.logfileHeader != other.logfileHeader) return false
        if (this.bufferCallback != other.bufferCallback) return false
        if (this.bufferSize != other.bufferSize) return false
        if (this.filled != other.filled) return false
        if (this.eventsLost != other.eventsLost) return false
        if (this.anonymous2 != other.anonymous2) return false
        if (this.isKernelTrace != other.isKernelTrace) return false
        if (this.context != other.context) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.logFileName.hashCode()
        result = 31 * result + this.loggerName.hashCode()
        result = 31 * result + this.currentTime.hashCode()
        result = 31 * result + this.buffersRead.hashCode()
        result = 31 * result + this.anonymous1.hashCode()
        result = 31 * result + this.currentEvent.hashCode()
        result = 31 * result + this.logfileHeader.hashCode()
        result = 31 * result + this.bufferCallback.hashCode()
        result = 31 * result + this.bufferSize.hashCode()
        result = 31 * result + this.filled.hashCode()
        result = 31 * result + this.eventsLost.hashCode()
        result = 31 * result + this.anonymous2.hashCode()
        result = 31 * result + this.isKernelTrace.hashCode()
        result = 31 * result + this.context.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            logFileName: Pwstr = MutPtr(0L),
            loggerName: Pwstr = MutPtr(0L),
            currentTime: Long = 0L,
            buffersRead: UInt = 0u,
            anonymous1: EventTraceLogfilew0 = EventTraceLogfilew0(),
            currentEvent: EventTrace = EventTrace(),
            logfileHeader: TraceLogfileHeader = TraceLogfileHeader(),
            bufferCallback: PeventTraceBufferCallbackw = null,
            bufferSize: UInt = 0u,
            filled: UInt = 0u,
            eventsLost: UInt = 0u,
            anonymous2: EventTraceLogfilew1 = EventTraceLogfilew1(),
            isKernelTrace: UInt = 0u,
            context: MutPtr<CVoid> = MutPtr(0L),
        ): EventTraceLogfilew =
            EventTraceLogfilew(
                logFileNameCtorArg = logFileName,
                loggerNameCtorArg = loggerName,
                currentTime = currentTime,
                buffersRead = buffersRead,
                anonymous1 = anonymous1,
                currentEvent = currentEvent,
                logfileHeader = logfileHeader,
                bufferCallback = bufferCallback,
                bufferSize = bufferSize,
                filled = filled,
                eventsLost = eventsLost,
                anonymous2 = anonymous2,
                isKernelTrace = isKernelTrace,
                contextCtorArg = context,
            )
    }
}

public data class EventTraceLogfilew0(
    public var logFileMode: UInt = 0u,
    public var processTraceMode: UInt = 0u,
)

public data class EventTraceLogfilew1(
    public var eventCallback: PeventCallback = null,
    public var eventRecordCallback: PeventRecordCallback = null,
)

public class EventTraceProperties internal constructor(
    public var wnode: WnodeHeader,
    public var bufferSize: UInt,
    public var minimumBuffers: UInt,
    public var maximumBuffers: UInt,
    public var maximumFileSize: UInt,
    public var logFileMode: UInt,
    public var flushTimer: UInt,
    public var enableFlags: EventTraceFlag,
    public var anonymous: EventTraceProperties0,
    public var numberOfBuffers: UInt,
    public var freeBuffers: UInt,
    public var eventsLost: UInt,
    public var buffersWritten: UInt,
    public var logBuffersLost: UInt,
    public var realTimeBuffersLost: UInt,
    loggerThreadIdCtorArg: Handle,
    public var logFileNameOffset: UInt,
    public var loggerNameOffset: UInt,
) {
    public var loggerThreadId: Handle = loggerThreadIdCtorArg
        internal set

    public constructor() : this(
        wnode = WnodeHeader(),
        bufferSize = 0u,
        minimumBuffers = 0u,
        maximumBuffers = 0u,
        maximumFileSize = 0u,
        logFileMode = 0u,
        flushTimer = 0u,
        enableFlags = 0u,
        anonymous = EventTraceProperties0(),
        numberOfBuffers = 0u,
        freeBuffers = 0u,
        eventsLost = 0u,
        buffersWritten = 0u,
        logBuffersLost = 0u,
        realTimeBuffersLost = 0u,
        loggerThreadIdCtorArg = MutPtr(0L),
        logFileNameOffset = 0u,
        loggerNameOffset = 0u,
    )

    public companion object {
        public operator fun invoke(
            wnode: WnodeHeader = WnodeHeader(),
            bufferSize: UInt = 0u,
            minimumBuffers: UInt = 0u,
            maximumBuffers: UInt = 0u,
            maximumFileSize: UInt = 0u,
            logFileMode: UInt = 0u,
            flushTimer: UInt = 0u,
            enableFlags: EventTraceFlag = 0u,
            anonymous: EventTraceProperties0 = EventTraceProperties0(),
            numberOfBuffers: UInt = 0u,
            freeBuffers: UInt = 0u,
            eventsLost: UInt = 0u,
            buffersWritten: UInt = 0u,
            logBuffersLost: UInt = 0u,
            realTimeBuffersLost: UInt = 0u,
            loggerThreadId: Handle = MutPtr(0L),
            logFileNameOffset: UInt = 0u,
            loggerNameOffset: UInt = 0u,
        ): EventTraceProperties =
            EventTraceProperties(
                wnode = wnode,
                bufferSize = bufferSize,
                minimumBuffers = minimumBuffers,
                maximumBuffers = maximumBuffers,
                maximumFileSize = maximumFileSize,
                logFileMode = logFileMode,
                flushTimer = flushTimer,
                enableFlags = enableFlags,
                anonymous = anonymous,
                numberOfBuffers = numberOfBuffers,
                freeBuffers = freeBuffers,
                eventsLost = eventsLost,
                buffersWritten = buffersWritten,
                logBuffersLost = logBuffersLost,
                realTimeBuffersLost = realTimeBuffersLost,
                loggerThreadIdCtorArg = loggerThreadId,
                logFileNameOffset = logFileNameOffset,
                loggerNameOffset = loggerNameOffset,
            )
    }
}

public data class EventTraceProperties0(
    public var ageLimit: Int = 0,
    public var flushThreshold: Int = 0,
)

public class EventTracePropertiesV2 internal constructor(
    public var wnode: WnodeHeader,
    public var bufferSize: UInt,
    public var minimumBuffers: UInt,
    public var maximumBuffers: UInt,
    public var maximumFileSize: UInt,
    public var logFileMode: UInt,
    public var flushTimer: UInt,
    public var enableFlags: EventTraceFlag,
    public var anonymous1: EventTracePropertiesV20,
    public var numberOfBuffers: UInt,
    public var freeBuffers: UInt,
    public var eventsLost: UInt,
    public var buffersWritten: UInt,
    public var logBuffersLost: UInt,
    public var realTimeBuffersLost: UInt,
    loggerThreadIdCtorArg: Handle,
    public var logFileNameOffset: UInt,
    public var loggerNameOffset: UInt,
    public var anonymous2: EventTracePropertiesV21,
    public var filterDescCount: UInt,
    filterDescCtorArg: MutPtr<EventFilterDescriptor>,
    public var anonymous3: EventTracePropertiesV22,
) {
    public var loggerThreadId: Handle = loggerThreadIdCtorArg
        internal set

    public var filterDesc: MutPtr<EventFilterDescriptor> = filterDescCtorArg
        internal set

    public constructor() : this(
        wnode = WnodeHeader(),
        bufferSize = 0u,
        minimumBuffers = 0u,
        maximumBuffers = 0u,
        maximumFileSize = 0u,
        logFileMode = 0u,
        flushTimer = 0u,
        enableFlags = 0u,
        anonymous1 = EventTracePropertiesV20(),
        numberOfBuffers = 0u,
        freeBuffers = 0u,
        eventsLost = 0u,
        buffersWritten = 0u,
        logBuffersLost = 0u,
        realTimeBuffersLost = 0u,
        loggerThreadIdCtorArg = MutPtr(0L),
        logFileNameOffset = 0u,
        loggerNameOffset = 0u,
        anonymous2 = EventTracePropertiesV21(),
        filterDescCount = 0u,
        filterDescCtorArg = MutPtr(0L),
        anonymous3 = EventTracePropertiesV22(),
    )

    public companion object {
        public operator fun invoke(
            wnode: WnodeHeader = WnodeHeader(),
            bufferSize: UInt = 0u,
            minimumBuffers: UInt = 0u,
            maximumBuffers: UInt = 0u,
            maximumFileSize: UInt = 0u,
            logFileMode: UInt = 0u,
            flushTimer: UInt = 0u,
            enableFlags: EventTraceFlag = 0u,
            anonymous1: EventTracePropertiesV20 = EventTracePropertiesV20(),
            numberOfBuffers: UInt = 0u,
            freeBuffers: UInt = 0u,
            eventsLost: UInt = 0u,
            buffersWritten: UInt = 0u,
            logBuffersLost: UInt = 0u,
            realTimeBuffersLost: UInt = 0u,
            loggerThreadId: Handle = MutPtr(0L),
            logFileNameOffset: UInt = 0u,
            loggerNameOffset: UInt = 0u,
            anonymous2: EventTracePropertiesV21 = EventTracePropertiesV21(),
            filterDescCount: UInt = 0u,
            filterDesc: MutPtr<EventFilterDescriptor> = MutPtr(0L),
            anonymous3: EventTracePropertiesV22 = EventTracePropertiesV22(),
        ): EventTracePropertiesV2 =
            EventTracePropertiesV2(
                wnode = wnode,
                bufferSize = bufferSize,
                minimumBuffers = minimumBuffers,
                maximumBuffers = maximumBuffers,
                maximumFileSize = maximumFileSize,
                logFileMode = logFileMode,
                flushTimer = flushTimer,
                enableFlags = enableFlags,
                anonymous1 = anonymous1,
                numberOfBuffers = numberOfBuffers,
                freeBuffers = freeBuffers,
                eventsLost = eventsLost,
                buffersWritten = buffersWritten,
                logBuffersLost = logBuffersLost,
                realTimeBuffersLost = realTimeBuffersLost,
                loggerThreadIdCtorArg = loggerThreadId,
                logFileNameOffset = logFileNameOffset,
                loggerNameOffset = loggerNameOffset,
                anonymous2 = anonymous2,
                filterDescCount = filterDescCount,
                filterDescCtorArg = filterDesc,
                anonymous3 = anonymous3,
            )
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventTracePropertiesV210> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventTracePropertiesV210> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): EventTracePropertiesV210 =
                    EventTracePropertiesV210(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: EventTracePropertiesV210) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class EventTracePropertiesV22(
    public var anonymous: EventTracePropertiesV220 = EventTracePropertiesV220(),
    public var v2Options: ULong = 0uL,
)

public data class EventTracePropertiesV220(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventTracePropertiesV220> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventTracePropertiesV220> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): EventTracePropertiesV220 =
                    EventTracePropertiesV220(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: EventTracePropertiesV220) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class MofField(
    public var dataPtr: ULong = 0uL,
    public var length: UInt = 0u,
    public var dataType: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MofField> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MofField> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): MofField =
                    MofField(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: MofField) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.dataPtr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dataType)
                }
            }
    }
}

public data class Offsetinstancedataandlength(
    public var offsetInstanceData: UInt = 0u,
    public var lengthInstanceData: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Offsetinstancedataandlength> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Offsetinstancedataandlength> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Offsetinstancedataandlength =
                    Offsetinstancedataandlength(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Offsetinstancedataandlength) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.offsetInstanceData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.lengthInstanceData)
                }
            }
    }
}

public class PayloadFilterPredicate internal constructor(
    fieldNameCtorArg: Pwstr,
    public var compareOp: UShort,
    valueCtorArg: Pwstr,
) {
    public var fieldName: Pwstr = fieldNameCtorArg
        internal set

    public var value: Pwstr = valueCtorArg
        internal set

    public constructor() : this(
        fieldNameCtorArg = MutPtr(0L),
        compareOp = 0u,
        valueCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.fieldName

    public operator fun component2(): UShort = this.compareOp

    public operator fun component3(): Pwstr = this.value

    public fun copy(fieldName: Pwstr = this.fieldName, compareOp: UShort = this.compareOp, value: Pwstr = this.value): PayloadFilterPredicate = PayloadFilterPredicate(fieldNameCtorArg = fieldName, compareOp = compareOp, valueCtorArg = value)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PayloadFilterPredicate) return false
        if (this.fieldName != other.fieldName) return false
        if (this.compareOp != other.compareOp) return false
        if (this.value != other.value) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fieldName.hashCode()
        result = 31 * result + this.compareOp.hashCode()
        result = 31 * result + this.value.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            fieldName: Pwstr = MutPtr(0L),
            compareOp: UShort = 0u,
            value: Pwstr = MutPtr(0L),
        ): PayloadFilterPredicate =
            PayloadFilterPredicate(
                fieldNameCtorArg = fieldName,
                compareOp = compareOp,
                valueCtorArg = value,
            )
    }
}

public data class ProcesstraceHandle(
    public var value: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcesstraceHandle> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcesstraceHandle> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): ProcesstraceHandle =
                    ProcesstraceHandle(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ProcesstraceHandle) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.value)
                }
            }
    }
}

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProfileSourceInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProfileSourceInfo> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): ProfileSourceInfo =
                    ProfileSourceInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: ProfileSourceInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nextEntryOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.source)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.minInterval)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.maxInterval)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.reserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 24L, value.description)
                }
            }
    }
}

public data class PropertyDataDescriptor(
    public var propertyName: ULong = 0uL,
    public var arrayIndex: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PropertyDataDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PropertyDataDescriptor> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): PropertyDataDescriptor =
                    PropertyDataDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: PropertyDataDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.propertyName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.arrayIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.reserved)
                }
            }
    }
}

public data class ProviderEnumerationInfo(
    public var numberOfProviders: UInt = 0u,
    public var reserved: UInt = 0u,
    public var traceProviderInfoArray: List<TraceProviderInfo> = List(1) { TraceProviderInfo() },
)

public data class ProviderEventInfo(
    public var numberOfEvents: UInt = 0u,
    public var reserved: UInt = 0u,
    public var eventDescriptorsArray: List<EventDescriptor> = List(1) { EventDescriptor() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProviderEventInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProviderEventInfo> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): ProviderEventInfo =
                    ProviderEventInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(EventDescriptor.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ProviderEventInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numberOfEvents)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(EventDescriptor.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.eventDescriptorsArray)
                }
            }
    }
}

public data class ProviderFieldInfo(
    public var nameOffset: UInt = 0u,
    public var descriptionOffset: UInt = 0u,
    public var value: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProviderFieldInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProviderFieldInfo> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): ProviderFieldInfo =
                    ProviderFieldInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ProviderFieldInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nameOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.descriptionOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.value)
                }
            }
    }
}

public data class ProviderFieldInfoarray(
    public var numberOfElements: UInt = 0u,
    public var fieldType: EventFieldType = 0,
    public var fieldInfoArray: List<ProviderFieldInfo> = List(1) { ProviderFieldInfo() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProviderFieldInfoarray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProviderFieldInfoarray> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): ProviderFieldInfoarray =
                    ProviderFieldInfoarray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(ProviderFieldInfo.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ProviderFieldInfoarray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numberOfElements)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.fieldType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(ProviderFieldInfo.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.fieldInfoArray)
                }
            }
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RelogstreamHandle> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RelogstreamHandle> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RelogstreamHandle =
                    RelogstreamHandle(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: RelogstreamHandle) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.value)
                }
            }
    }
}

public data class TdhContext(
    public var parameterValue: ULong = 0uL,
    public var parameterType: TdhContextType = 0,
    public var parameterSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TdhContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TdhContext> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): TdhContext =
                    TdhContext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: TdhContext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.parameterValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.parameterType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.parameterSize)
                }
            }
    }
}

public data class TraceEnableInfo(
    public var isEnabled: UInt = 0u,
    public var level: UByte = 0u,
    public var reserved1: UByte = 0u,
    public var loggerId: UShort = 0u,
    public var enableProperty: UInt = 0u,
    public var reserved2: UInt = 0u,
    public var matchAnyKeyword: ULong = 0uL,
    public var matchAllKeyword: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TraceEnableInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TraceEnableInfo> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): TraceEnableInfo =
                    TraceEnableInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: TraceEnableInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.isEnabled)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.level)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.loggerId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.enableProperty)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.reserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.matchAnyKeyword)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.matchAllKeyword)
                }
            }
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TraceEventInfo20> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TraceEventInfo20> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): TraceEventInfo20 =
                    TraceEventInfo20(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: TraceEventInfo20) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class TraceGuidInfo(
    public var instanceCount: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TraceGuidInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TraceGuidInfo> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): TraceGuidInfo =
                    TraceGuidInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: TraceGuidInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.instanceCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved)
                }
            }
    }
}

public data class TraceGuidProperties(
    public var guid: Guid = Guid(),
    public var guidType: UInt = 0u,
    public var loggerId: UInt = 0u,
    public var enableLevel: UInt = 0u,
    public var enableFlags: UInt = 0u,
    public var isEnable: Boolean = false,
)

public class TraceGuidRegistration internal constructor(
    guidCtorArg: ConstPtr<Guid>,
    regHandleCtorArg: Handle,
) {
    public var guid: ConstPtr<Guid> = guidCtorArg
        internal set

    public var regHandle: Handle = regHandleCtorArg
        internal set

    public constructor() : this(
        guidCtorArg = ConstPtr(0L),
        regHandleCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ConstPtr<Guid> = this.guid

    public operator fun component2(): Handle = this.regHandle

    public fun copy(guid: ConstPtr<Guid> = this.guid, regHandle: Handle = this.regHandle): TraceGuidRegistration = TraceGuidRegistration(guidCtorArg = guid, regHandleCtorArg = regHandle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TraceGuidRegistration) return false
        if (this.guid != other.guid) return false
        if (this.regHandle != other.regHandle) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.guid.hashCode()
        result = 31 * result + this.regHandle.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            guid: ConstPtr<Guid> = ConstPtr(0L),
            regHandle: Handle = MutPtr(0L),
        ): TraceGuidRegistration =
            TraceGuidRegistration(
                guidCtorArg = guid,
                regHandleCtorArg = regHandle,
            )
    }
}

public class TraceLogfileHeader internal constructor(
    public var bufferSize: UInt,
    public var anonymous1: TraceLogfileHeader0,
    public var providerVersion: UInt,
    public var numberOfProcessors: UInt,
    public var endTime: Long,
    public var timerResolution: UInt,
    public var maximumFileSize: UInt,
    public var logFileMode: UInt,
    public var buffersWritten: UInt,
    public var anonymous2: TraceLogfileHeader1,
    loggerNameCtorArg: Pwstr,
    logFileNameCtorArg: Pwstr,
    public var timeZone: TimeZoneInformation,
    public var bootTime: Long,
    public var perfFreq: Long,
    public var startTime: Long,
    public var reservedFlags: UInt,
    public var buffersLost: UInt,
) {
    public var loggerName: Pwstr = loggerNameCtorArg
        internal set

    public var logFileName: Pwstr = logFileNameCtorArg
        internal set

    public constructor() : this(
        bufferSize = 0u,
        anonymous1 = TraceLogfileHeader0(),
        providerVersion = 0u,
        numberOfProcessors = 0u,
        endTime = 0L,
        timerResolution = 0u,
        maximumFileSize = 0u,
        logFileMode = 0u,
        buffersWritten = 0u,
        anonymous2 = TraceLogfileHeader1(),
        loggerNameCtorArg = MutPtr(0L),
        logFileNameCtorArg = MutPtr(0L),
        timeZone = TimeZoneInformation(),
        bootTime = 0L,
        perfFreq = 0L,
        startTime = 0L,
        reservedFlags = 0u,
        buffersLost = 0u,
    )

    public companion object {
        public operator fun invoke(
            bufferSize: UInt = 0u,
            anonymous1: TraceLogfileHeader0 = TraceLogfileHeader0(),
            providerVersion: UInt = 0u,
            numberOfProcessors: UInt = 0u,
            endTime: Long = 0L,
            timerResolution: UInt = 0u,
            maximumFileSize: UInt = 0u,
            logFileMode: UInt = 0u,
            buffersWritten: UInt = 0u,
            anonymous2: TraceLogfileHeader1 = TraceLogfileHeader1(),
            loggerName: Pwstr = MutPtr(0L),
            logFileName: Pwstr = MutPtr(0L),
            timeZone: TimeZoneInformation = TimeZoneInformation(),
            bootTime: Long = 0L,
            perfFreq: Long = 0L,
            startTime: Long = 0L,
            reservedFlags: UInt = 0u,
            buffersLost: UInt = 0u,
        ): TraceLogfileHeader =
            TraceLogfileHeader(
                bufferSize = bufferSize,
                anonymous1 = anonymous1,
                providerVersion = providerVersion,
                numberOfProcessors = numberOfProcessors,
                endTime = endTime,
                timerResolution = timerResolution,
                maximumFileSize = maximumFileSize,
                logFileMode = logFileMode,
                buffersWritten = buffersWritten,
                anonymous2 = anonymous2,
                loggerNameCtorArg = loggerName,
                logFileNameCtorArg = logFileName,
                timeZone = timeZone,
                bootTime = bootTime,
                perfFreq = perfFreq,
                startTime = startTime,
                reservedFlags = reservedFlags,
                buffersLost = buffersLost,
            )
    }
}

public data class TraceLogfileHeader0(
    public var version: UInt = 0u,
    public var versionDetail: TraceLogfileHeader00 = TraceLogfileHeader00(),
)

public data class TraceLogfileHeader00(
    public var majorVersion: UByte = 0u,
    public var minorVersion: UByte = 0u,
    public var subVersion: UByte = 0u,
    public var subMinorVersion: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TraceLogfileHeader00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TraceLogfileHeader00> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): TraceLogfileHeader00 =
                    TraceLogfileHeader00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: TraceLogfileHeader00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.majorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.minorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.subVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.subMinorVersion)
                }
            }
    }
}

public data class TraceLogfileHeader1(
    public var logInstanceGuid: Guid = Guid(),
    public var anonymous: TraceLogfileHeader10 = TraceLogfileHeader10(),
)

public data class TraceLogfileHeader10(
    public var startBuffers: UInt = 0u,
    public var pointerSize: UInt = 0u,
    public var eventsLost: UInt = 0u,
    public var cpuSpeedInMHz: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TraceLogfileHeader10> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TraceLogfileHeader10> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): TraceLogfileHeader10 =
                    TraceLogfileHeader10(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: TraceLogfileHeader10) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.startBuffers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.pointerSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.eventsLost)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cpuSpeedInMHz)
                }
            }
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TraceLogfileHeader3200> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TraceLogfileHeader3200> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): TraceLogfileHeader3200 =
                    TraceLogfileHeader3200(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: TraceLogfileHeader3200) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.majorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.minorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.subVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.subMinorVersion)
                }
            }
    }
}

public data class TraceLogfileHeader321(
    public var logInstanceGuid: Guid = Guid(),
    public var anonymous: TraceLogfileHeader3210 = TraceLogfileHeader3210(),
)

public data class TraceLogfileHeader3210(
    public var startBuffers: UInt = 0u,
    public var pointerSize: UInt = 0u,
    public var eventsLost: UInt = 0u,
    public var cpuSpeedInMHz: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TraceLogfileHeader3210> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TraceLogfileHeader3210> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): TraceLogfileHeader3210 =
                    TraceLogfileHeader3210(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: TraceLogfileHeader3210) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.startBuffers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.pointerSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.eventsLost)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cpuSpeedInMHz)
                }
            }
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TraceLogfileHeader6400> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TraceLogfileHeader6400> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): TraceLogfileHeader6400 =
                    TraceLogfileHeader6400(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: TraceLogfileHeader6400) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.majorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.minorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.subVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.subMinorVersion)
                }
            }
    }
}

public data class TraceLogfileHeader641(
    public var logInstanceGuid: Guid = Guid(),
    public var anonymous: TraceLogfileHeader6410 = TraceLogfileHeader6410(),
)

public data class TraceLogfileHeader6410(
    public var startBuffers: UInt = 0u,
    public var pointerSize: UInt = 0u,
    public var eventsLost: UInt = 0u,
    public var cpuSpeedInMHz: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TraceLogfileHeader6410> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TraceLogfileHeader6410> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): TraceLogfileHeader6410 =
                    TraceLogfileHeader6410(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: TraceLogfileHeader6410) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.startBuffers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.pointerSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.eventsLost)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cpuSpeedInMHz)
                }
            }
    }
}

public data class TracePeriodicCaptureStateInfo(
    public var captureStateFrequencyInSeconds: UInt = 0u,
    public var providerCount: UShort = 0u,
    public var reserved: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TracePeriodicCaptureStateInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TracePeriodicCaptureStateInfo> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): TracePeriodicCaptureStateInfo =
                    TracePeriodicCaptureStateInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: TracePeriodicCaptureStateInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.captureStateFrequencyInSeconds)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.providerCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.reserved)
                }
            }
    }
}

public data class TraceProfileInterval(
    public var source: UInt = 0u,
    public var interval: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TraceProfileInterval> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TraceProfileInterval> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): TraceProfileInterval =
                    TraceProfileInterval(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: TraceProfileInterval) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.source)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.interval)
                }
            }
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TraceProviderInstanceInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TraceProviderInstanceInfo> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): TraceProviderInstanceInfo =
                    TraceProviderInstanceInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: TraceProviderInstanceInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nextOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.enableCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.pid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.flags)
                }
            }
    }
}

public data class TraceStackCachingInfo(
    public var enabled: Boolean = false,
    public var cacheSize: UInt = 0u,
    public var bucketCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TraceStackCachingInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TraceStackCachingInfo> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): TraceStackCachingInfo =
                    TraceStackCachingInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: TraceStackCachingInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.enabled)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cacheSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.bucketCount)
                }
            }
    }
}

public data class TraceVersionInfo(
    public var etwTraceProcessingVersion: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TraceVersionInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TraceVersionInfo> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): TraceVersionInfo =
                    TraceVersionInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: TraceVersionInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.etwTraceProcessingVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved)
                }
            }
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WnodeHeader00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WnodeHeader00> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WnodeHeader00 =
                    WnodeHeader00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WnodeHeader00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.linkage)
                }
            }
    }
}

public class WnodeHeader1 internal constructor(
    public var countLost: UInt,
    kernelHandleCtorArg: Handle,
    public var timeStamp: Long,
) {
    public var kernelHandle: Handle = kernelHandleCtorArg
        internal set

    public constructor() : this(
        countLost = 0u,
        kernelHandleCtorArg = MutPtr(0L),
        timeStamp = 0L,
    )

    public operator fun component1(): UInt = this.countLost

    public operator fun component2(): Handle = this.kernelHandle

    public operator fun component3(): Long = this.timeStamp

    public fun copy(countLost: UInt = this.countLost, kernelHandle: Handle = this.kernelHandle, timeStamp: Long = this.timeStamp): WnodeHeader1 = WnodeHeader1(countLost = countLost, kernelHandleCtorArg = kernelHandle, timeStamp = timeStamp)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WnodeHeader1) return false
        if (this.countLost != other.countLost) return false
        if (this.kernelHandle != other.kernelHandle) return false
        if (this.timeStamp != other.timeStamp) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.countLost.hashCode()
        result = 31 * result + this.kernelHandle.hashCode()
        result = 31 * result + this.timeStamp.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            countLost: UInt = 0u,
            kernelHandle: Handle = MutPtr(0L),
            timeStamp: Long = 0L,
        ): WnodeHeader1 =
            WnodeHeader1(
                countLost = countLost,
                kernelHandleCtorArg = kernelHandle,
                timeStamp = timeStamp,
            )
    }
}

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
